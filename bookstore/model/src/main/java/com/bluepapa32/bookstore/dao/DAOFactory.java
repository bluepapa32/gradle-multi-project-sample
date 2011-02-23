package com.bluepapa32.bookstore.dao;

public abstract class DAOFactory {

	public abstract BookDAO getBookDAO();

	public static DAOFactory getDAOFactory() {
		try {
			// 本当は設定で...
			Class<?> clazz = Class.forName("com.bluepapa32.bookstore.dao.impl.DAOFactoryImpl");
			return (DAOFactory) clazz.newInstance();
		} catch (ClassNotFoundException e) {
			throw new IllegalStateException(e);
		} catch (InstantiationException e) {
			throw new IllegalStateException(e);
		} catch (IllegalAccessException e) {
			throw new IllegalStateException(e);
		}
	}
}
