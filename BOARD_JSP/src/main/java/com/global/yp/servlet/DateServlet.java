package com.global.yp.servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

// 날짜와 데이터를 제공해주는 서블릿 클래스
public class DateServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println(this); // test 해보기 this로 나의 소스가 제대로 작동되는지 확인 먼저 하기, 그 다음 코드 추가하기
		System.out.println(new java.util.Date());
//		out.println(new java.util.Date());
		req.setAttribute("now", new java.util.Date());
		req.getRequestDispatcher("/date.jsp").forward(req, resp);
	}
}
