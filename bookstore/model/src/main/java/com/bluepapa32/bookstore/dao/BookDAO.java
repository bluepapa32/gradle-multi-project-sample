package com.bluepapa32.bookstore.dao;

import java.util.List;

import com.bluepapa32.bookstore.model.Book;

public interface BookDAO {
	List<Book> findAll();
}
