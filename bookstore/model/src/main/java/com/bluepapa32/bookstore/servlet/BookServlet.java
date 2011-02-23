package com.bluepapa32.bookstore.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bluepapa32.bookstore.service.BookService;

/**
 * Servlet implementation class BookServlet
 */
public class BookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private BookService service;
	
    public void init() throws ServletException {
    	ServletConfig config = getServletConfig();
    	String name = config.getInitParameter("service");
    	try {
    		Class<?> clazz = Class.forName(name);
			service = (BookService) clazz.newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("books", service.findAll());
		request.getRequestDispatcher("/WEB-INF/jsp/books.jsp").forward(request, response);
	}
}
