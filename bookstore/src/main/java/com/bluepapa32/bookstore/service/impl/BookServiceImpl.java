package com.bluepapa32.bookstore.service.impl;

import java.util.List;

import com.bluepapa32.bookstore.dao.BookDAO;
import com.bluepapa32.bookstore.dao.DAOFactory;
import com.bluepapa32.bookstore.model.Book;
import com.bluepapa32.bookstore.service.BookService;

public class BookServiceImpl implements BookService {

	private DAOFactory f = DAOFactory.getDAOFactory();

	public List<Book> findAll() {
		BookDAO dao = f.getBookDAO();
		return dao.findAll();
	}
}
