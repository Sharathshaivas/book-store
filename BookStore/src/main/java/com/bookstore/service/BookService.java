package com.bookstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.entity.Book;
import com.bookstore.repository.BookRepository;

@Service
public class BookService {
	@Autowired
	private BookRepository repo;
	public void save(Book b) {
		repo.save(b);
	}
	
	public List<Book> getAllBook(){
		return repo.findAll();
	}
	public Book getBookById(int id) {
		return repo.findById(id).get();
	}
	public void deleteById(int id) {
		repo.deleteById(id);
	}
}
