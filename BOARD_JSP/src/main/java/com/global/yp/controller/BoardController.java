package com.global.yp.controller;

import java.io.IOException;
import java.sql.SQLException;

import com.global.yp.model.BoardDeleteModel;
import com.global.yp.model.BoardInsertModel;
import com.global.yp.model.BoardListModel;
import com.global.yp.model.BoardReadModel;
import com.global.yp.model.BoardUpdateModel;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class BoardController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String uri = req.getRequestURI();
		if (uri.contains("/insertForm.glo")) {
			req.getRequestDispatcher("/view/board/insertForm.jsp").forward(req, resp);
		}
		if (uri.contains("/insert.glo")) {
			try {
				new BoardInsertModel().insert(req);
				req.getRequestDispatcher("/view/common/success.jsp").forward(req, resp);
			} catch (Exception e) {
				e.printStackTrace();
				req.getRequestDispatcher("/view/common/error.jsp").forward(req, resp);
			}
		}
		if (uri.contains("/list.glo")) {
			try {
				req.setAttribute("list", new BoardListModel().list());
				req.getRequestDispatcher("/view/board/list.jsp").forward(req, resp);
			} catch (Exception e) {
				e.printStackTrace();
				req.getRequestDispatcher("/view/common/error.jsp").forward(req, resp);
			}
		}
		if (uri.contains("/read.glo")) {
			try {
				req.setAttribute("board", new BoardReadModel().read(req));
				req.getRequestDispatcher("/view/board/read.jsp").forward(req, resp);
			} catch (Exception e) {
				e.printStackTrace();
				req.getRequestDispatcher("/view/common/error.jsp").forward(req, resp);
			}
		}
		if (uri.contains("/delete.glo")) {
			try {
				new BoardDeleteModel().delete(req);
				resp.sendRedirect("/BOARD_JSP/board/list.glo");
			} catch (Exception e) {
				e.printStackTrace();
				req.getRequestDispatcher("/view/common/error.jsp").forward(req, resp);
			}
		}
		if (uri.contains("/updateForm.glo")) {
			try {
				req.setAttribute("board", new BoardReadModel().read(req));
				req.getRequestDispatcher("/view/board/updateForm.jsp").forward(req, resp);
			} catch (Exception e) {
				e.printStackTrace();
				req.getRequestDispatcher("/view/common/error.jsp").forward(req, resp);
			}
		}
		if (uri.contains("/update.glo")) {
			try {
				new BoardUpdateModel().update(req);
				resp.sendRedirect("/BOARD_JSP/board/list.glo");
			} catch (Exception e) {
				e.printStackTrace();
				req.getRequestDispatcher("/view/common/error.jsp").forward(req, resp);
			}
		}
	}

}
