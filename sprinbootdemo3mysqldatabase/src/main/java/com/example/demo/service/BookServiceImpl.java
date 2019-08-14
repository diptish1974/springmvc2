package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.BookDAO;
import com.example.demo.exceptions.BookNotFoundException;
import com.example.demo.model.Book;

@Service
public class BookServiceImpl implements BookService {

	 @Autowired  
	 private BookDAO dao;
	 
	@Override
	public void addBook(Book book) {
	       	   dao.save(book);

	}

	@Override
	public boolean deleteBook(int id) throws BookNotFoundException {
	boolean found=false; 
	found=dao.existsById(id);
	
	if(!found)
	{
		throw new BookNotFoundException("book not found exception");
	    
	}
		
	else
	{
		dao.deleteById(id);
		found=true;
	}	
		return found;
	}

	@Override
	public boolean updateBook(int id,Book book) throws BookNotFoundException {
		boolean found=false; 
		Book book1=dao.findById(id).get();
		if(book1==null)
		{
			throw new BookNotFoundException("Not finding the book");
		}
		else
		{
			dao.save(book);
			found=true;
		}
				return found;
	}

	@Override
	public List<Book> displayAllBooks() {
	   List<Book> listBook=(List<Book>) dao.findAll();
		return listBook;
	}

	@Override
	public Book displaySpecificBook(int id) throws BookNotFoundException {
		 Book book=dao.findById(id).get();
		 if(book==null)
		 {
			 throw new BookNotFoundException("Book not found");
		 }
		return book;
	}

}
