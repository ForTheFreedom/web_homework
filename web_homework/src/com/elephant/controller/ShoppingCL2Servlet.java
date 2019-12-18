package com.elephant.controller;

import com.elephant.model.UserBean;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name = "shoppingcl2servlet", urlPatterns = "/shoppingcl2servlet")
public class ShoppingCL2Servlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		PrintWriter pw = response.getWriter();
		try {
			UserBean ub = (UserBean) request.getSession().getAttribute("userInfo");
			if (ub == null) {
				// �û�û�е�½��
				request.getRequestDispatcher("login.jsp").forward(request, response);
			} else {
				// �û���¼��
				request.getRequestDispatcher("shopping3.jsp").forward(request, response);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			this.doPost(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}