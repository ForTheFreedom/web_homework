package com.elephant.controller;

import com.elephant.model.MyCartBO;
import com.elephant.model.UserBeanCL;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
@WebServlet(name = "usermanageservlet", urlPatterns = "/usermanageservlet")
public class UserManageServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			response.setContentType("text/html");
			response.setCharacterEncoding("utf-8");
			String type = request.getParameter("type");
			UserBeanCL ubc = new UserBeanCL();

			// �����û���½
			if (type.equals("login")) {
				String name = request.getParameter("username");
				String password = request.getParameter("password");
				// ��֤ͨ������ת��indexҳ��
				if (ubc.checkUser(name, password)) {
					// 1. session
					HttpSession session = request.getSession();
					session.setAttribute("userInfo", ubc.getUBbyName(name));
					session.setMaxInactiveInterval(300);// ����sessionʱ��Ϊ5����
					// 2. ȡ�����ﳵ����Ϣ
					MyCartBO mcb=(MyCartBO)request.getSession().getAttribute("mycart");
					System.out.println(mcb);
					if(mcb!=null) {
					ArrayList al=mcb.showMyCart();
					request.setAttribute("mycartInfo",al);
					}
					request.getRequestDispatcher("shopping3.jsp").forward(request,response);
				}
				else {
					// ��֤��ͨ��
					request.getRequestDispatcher("login.jsp").forward(request,response);

				}
			}
			// �����û�ע��
			if (type.equals("signup")) {
				String id = request.getParameter("id");
				String name = request.getParameter("username");
				String realname = request.getParameter("realname");
				String password = request.getParameter("password");
				String mail = request.getParameter("mail");
				String phone = request.getParameter("phone");
				String address = request.getParameter("address");
				String postcode = request.getParameter("postcode");
				// ע��ɹ�
				if (ubc.userSignUp(id, name, realname, password, mail, address, phone, postcode)) {
					response.sendRedirect("sucess.jsp");
				} else {
					response.sendRedirect("failed.jsp");
				}
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