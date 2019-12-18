package com.elephant.controller;

import com.elephant.model.GoodsBean;
import com.elephant.model.GoodsBeanBO;
import com.elephant.model.MyCartBO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PipedWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
@WebServlet(name = "shoppingclservlet", urlPatterns = "/shoppingclservlet")
public class ShoppingCLServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		PrintWriter pw = response.getWriter();
		try {
			String type = request.getParameter("type");
			// �� Session��ȡ�����ﳵ��
			MyCartBO mcb = (MyCartBO) request.getSession().getAttribute("mycart");
			// �������߼�
			if (type.equals("buy")) {
				// ���ȡ���������������ﳵ�Ž�Session
				String goodsId = request.getParameter("goodsId");
				if (mcb == null) {
					mcb = new MyCartBO();
					request.getSession().setAttribute("mycart", mcb);
				}
				// Ĭ�ϣ�ÿ�ι���һ��
				mcb.addGoods(goodsId, "1");
			}
			if (type.equals("delGoods")) {
				// ɾ��һ����
				String goodsId = request.getParameter("goodsId");
				mcb.removeGoods(goodsId);
			} else if (type.equals("showDetail")) {
				// ����鿴�߼�
				String id = request.getParameter("id");
				GoodsBeanBO gbb = new GoodsBeanBO();
				GoodsBean gb = gbb.getGoodsBean(id);
				request.setAttribute("gb", gb);
				request.getRequestDispatcher("showDetail.jsp").forward(request, response);
			} else if (type.equals("show")) {
				// ���Ͻǹ��ﳵ����
			} else if (type.equals("delAll")) {
				// ��չ��ﳵ
				mcb.clean();
			} else if (type.equals("updateGoods")) {
				// �޸�����
				String[] goodsIds = request.getParameterValues("goodsId");
				String[] newNums = request.getParameterValues("newNums");
				for (int i = 0; i < goodsIds.length; i++) {
					mcb.upGoods(goodsIds[i], newNums[i]);
				}


			}
			if(mcb!=null) {
			// ȡ������
			ArrayList al = mcb.showMyCart();
			
			// �������ݵ���ʾҳ��
			request.setAttribute("mycart", al);
			// ��ת��ҳ����ʾ
			}
			request.getRequestDispatcher("showMyCart.jsp").forward(request, response);


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