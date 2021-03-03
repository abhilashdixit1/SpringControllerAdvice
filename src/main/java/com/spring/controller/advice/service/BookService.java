package com.spring.controller.advice.service;

import org.springframework.stereotype.Service;

import com.spring.controller.advice.Exception.BookServiceException;
import com.spring.controller.advice.model.Book;

@Service
public class BookService {
	
	
	public Book getBook() throws BookServiceException {
		
		Book book = new Book();
		book.setAuthor("Bachchan");
		book.setBookId("bookone");
		book.setBookName("Madhushala");
		
		return book;
		
	}
	
	
	public Book getNullBook() throws BookServiceException{
		return null;
	}
	
	public Book getExceptionBook() throws BookServiceException{
		throw new BookServiceException();
	}

}
