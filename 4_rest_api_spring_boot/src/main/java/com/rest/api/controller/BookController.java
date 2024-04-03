package com.rest.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.api.model.Book;
import com.rest.api.service.BookService;

@RestController
public class BookController {
	
	
	/*
	@RequestMapping(value="/books",method=RequestMethod.GET)
	@ResponseBody
	*/
	
	/*
	@GetMapping("/books")
	public Book getBooks() {
		Book book1 = new Book(2,"c","dennies");
		Book book = new Book();
		book.setId(1);
		book.setTitle("java");
		book.setAuthor("James gosling");
		return book1;
	}
	
	*/
	
	@Autowired
	private BookService bookService;
	//get all book handler
	@GetMapping("/books")
	public List<Book> getBooks() {	
		return this.bookService.getAllBooks();
	}
	//get single book handler
	@GetMapping("/books/{id}")
	public Book getBook(@PathVariable("id") int id) {
		return bookService.getBookById(id);
	}
	
	//new book handler
	@PostMapping("/books")
	public Book addBook(@RequestBody Book book) {
		Book b = this.bookService.addBook(book);
		System.out.println(book);
		return b;
	}
	
	//delete book handler
	@DeleteMapping("/books/{bookId}")
	public void deleteBook(@PathVariable("bookId") int bookId) {
		this.bookService.deleteBook(bookId);
				
	}
	
	//update book handler
	@PutMapping("/books/{bookId}")
	public Book updateBook(@RequestBody Book book,@PathVariable("bookId") int bookId) {
		this.bookService.updateBook(book,bookId);
		return book;
	}	
}
