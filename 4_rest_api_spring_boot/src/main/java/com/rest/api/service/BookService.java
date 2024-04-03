package com.rest.api.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.rest.api.model.Book;

//@Component
@Service
public class BookService {
	
	private static List<Book> list = new ArrayList<>();
	
	static {
		list.add(new Book(11,"java","james gosling"));
		list.add(new Book(12,"c","Denies ritche"));
		list.add(new Book(13,"spring","james gosling"));
		
	}
	
	//get all books
	public List<Book> getAllBooks(){
		return list;
	}
	
	//get single book by id
	
	public Book getBookById(int id) {
		Book book=null;
		book=list.stream().filter(e-> e.getId()==id).findFirst().get();	
		return book;
		
	}
	
	//adding the book
	public Book addBook(Book b) {
		
		list.add(b);
		return b;
	}

	public void deleteBook(int bookId) {
	 list = list.stream().filter(book->book.getId()!=bookId ).
			collect(Collectors.toList());
		
	/*
	 * list.stream().filter(book->{ if(book.getId()!=bookId) { return true; } else
	 * return false;
	 * 
	 * }).collect(Collectors.toList());
	 */
	}

	//update the book
	public void updateBook(Book book, int bookId) {
		list=list.stream().map(b->{
			if(b.getId()==bookId) {
				b.setTitle("python");
				b.setAuthor("gaurav");
			}
			return b;
		}).collect(Collectors.toList());
		
	}
	
	
	
}
