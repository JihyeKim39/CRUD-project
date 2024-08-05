package com.global.yp.servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class DateServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println(new java.util.Date());
//		out.println(new java.util.Date());
		req.setAttribute("now", new java.util.Date());
		req.getRequestDispatcher("/date.jsp").forward(req, resp);
	}
}
