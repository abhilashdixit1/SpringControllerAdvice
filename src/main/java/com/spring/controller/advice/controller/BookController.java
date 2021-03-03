package com.spring.controller.advice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.controller.advice.Exception.BookServiceException;
import com.spring.controller.advice.Exception.ResourceNotFoundException;
import com.spring.controller.advice.model.Book;
import com.spring.controller.advice.service.BookService;

@RestController
public class BookController {
	
	@Autowired
	BookService bookService;
	
	
	@GetMapping("/book")
	public Book getBook() throws ResourceNotFoundException,BookServiceException {
		try {
			Book book =  bookService.getBook();
			
			if(book==null) {
				throw new BookServiceException("Book not found");
			}
			
			return book;
			
		}catch (BookServiceException e) {
			// TODO: handle exception
			throw new BookServiceException("Internal server Exception");
		}
	}
	
	
	
	
	@GetMapping("/bookNull")
	public Book getBookNull() throws ResourceNotFoundException,BookServiceException {
		try {
			Book book =  bookService.getNullBook();
			
			if(book==null) {
				throw new ResourceNotFoundException("Book not found");
			}
			
			return book;
			
		}catch (BookServiceException e) {
			// TODO: handle exception
			throw new BookServiceException("Internal server Exception");
		}
	}
	
	
	
	@GetMapping("/bookException")
	public Book getBookException() throws ResourceNotFoundException,BookServiceException {
		try {
			Book book =  bookService.getExceptionBook();
			
			if(book==null) {
				throw new ResourceNotFoundException("Book not found");
			}
			
			return book;
			
		}catch (BookServiceException e) {
			// TODO: handle exception
			throw new BookServiceException("Internal server Exception");
		}
	}

}
