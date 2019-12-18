package com.elephant.controller;

import com.elephant.model.GoodsBean;
import com.elephant.model.GoodsBeanBO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

/**
 * ������ C
 * ��ʾ��Ӱ ����ҳ
 */
@WebServlet(name = "/showdetailservlet", urlPatterns = "/showdetailservlet")
public class ShowDetailsServlet extends javax.servlet.http.HttpServlet {
	/**
	 * ��ӦPost����
	 *
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			response.setContentType("text/html");
			response.setCharacterEncoding("utf-8");
			String type = request.getParameter("type");
			// ����չʾϸ������
			if (type.equals("showdetail")) {
				String id = request.getParameter("id");
				GoodsBeanBO gbb = new GoodsBeanBO();
				GoodsBean gb = gbb.getGoodsBean(id);
				request.setAttribute("gb", gb);
				request.getRequestDispatcher("showDetail.jsp").forward(request, response);
			}
			// �����ҳ����
			if (type.equals("fenye")) {
				String pageNow=request.getParameter("pageNow");
				request.setAttribute("pageNow",pageNow);
				request.getRequestDispatcher("index.jsp").forward(request,response);
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