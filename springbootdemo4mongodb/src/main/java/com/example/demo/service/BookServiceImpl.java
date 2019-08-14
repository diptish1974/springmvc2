package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Book;
import com.example.demo.repository.BookRepository;


@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookRepository repo;
	
	@Override
	public void addBook(Book book) {
	    repo.save(book);	
  
	}

	
	@Override
	public void deleteBook(int id) {
		repo.deleteById(id);
	}


	@Override
	public void updateBook(int id, Book book) {
		repo.save(book);
		
	}


	@Override
	public List<Book> displayAllBooks() {
		 List<Book> bookList=repo.findAll();
		return bookList;
	}


	@Override
	public Book displaySpecificBook(int id) {
		Book book=repo.findById(id).get();
		return book;
	}

	
	
	
}
