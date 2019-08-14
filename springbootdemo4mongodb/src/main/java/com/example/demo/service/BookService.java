package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Book;

public interface BookService {

	    public void addBook(Book book);

		public void deleteBook(int id);

		public void updateBook(int id, Book book);

		public List<Book> displayAllBooks();

		public Book displaySpecificBook(int id);
}
