package com.bluepapa32.bookstore.dao.impl;

import com.bluepapa32.bookstore.dao.BookDAO;
import com.bluepapa32.bookstore.dao.DAOFactory;

public class DAOFactoryImpl extends DAOFactory {
	@Override
	public BookDAO getBookDAO() {
		return new BookDAOImpl();
	}
}
