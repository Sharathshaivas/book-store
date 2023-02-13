package com.bookstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.entity.MyBookList;
import com.bookstore.repository.MyBookRepository;

@Service
public class MyBookListService {
	@Autowired
	private MyBookRepository myrepo;
	
	public void saveMyBook(MyBookList book) {
		myrepo.save(book);
	}
	
	public List<MyBookList> getAllMyBooks(){
		return myrepo.findAll();
	}
	public void deletById(int id) {
		myrepo.deleteById(id);
	}
	
}
