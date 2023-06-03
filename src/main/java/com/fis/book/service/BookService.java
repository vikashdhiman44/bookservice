package com.fis.book.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fis.book.exception.NoDataFoundException;
import com.fis.book.model.Book;
import com.fis.book.repo.BookRepository;

@Service
public class BookService {
	
	/*
	 * @Autowired public BookRepository bookRepo;
	 */

	public List<Book> getAllBooks() throws NoDataFoundException {
		List<Book> books= new ArrayList<>();
		Book book = new Book("B4232","","",1,1);
		books.add(book);
		/*
		 * bookRepo.findAll().forEach(books::add); if(books.isEmpty()) { throw new
		 * NoDataFoundException(); }
		 */
		return books;
	}

}
