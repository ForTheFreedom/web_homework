package com.elephant.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * ����Order��OrderDetail��
 */
public class OrderBeanCL {
	private Connection con = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;

	/**
	 * ��Ӷ���
	 * д�� orders��
	 * д�� ordersDetail��
	 *
	 * @param mcb
	 * @param userId
	 * @return
	 */
	public OrderUserBean addOrder(MyCartBO mcb, String userId) {
		OrderUserBean oub = new OrderUserBean();
		boolean flag = true;
		try {
			con = new ConnDB().getCon();
			ps = con.prepareStatement("INSERT INTO orders ( userId, isPayed, totalPrice) VALUES(?,?,?) ");
			ps.setInt(1, Integer.parseInt(userId));
			ps.setString(2, "0");
			ps.setFloat(3, mcb.getAllPrice());
			int num = ps.executeUpdate();
			if (num == 1) {
				// orders ����ɹ�
				// ��orders���У�ȡ���ող���Ķ�����
				ps = con.prepareStatement("SELECT max(orderId) FROM orders");
				rs = ps.executeQuery();
				int orderId = 0;
				if (rs.next()) {
					orderId = rs.getInt(1);
				}
				// ���ڲ���ordersDetail��
				// �ӹ��ﳵ�У�ȡ���������Ʒ
				ArrayList al = mcb.showMyCart();
				Statement sm = con.createStatement();
				// Ϊ�˲�Ӱ��Ч�ʣ��������룬������һ��һ���������ݿ�
				for (int i = 0; i < al.size(); i++) {
					GoodsBean gb = (GoodsBean) al.get(i);
					String goodsId = gb.getGoodsId() + "";
					String goodsNum = mcb.getNumById(goodsId);

					sm.addBatch("INSERT INTO orderDetail VALUES (" + orderId + "," + goodsId + "," + goodsNum + ")");
				}
				// ����ִ������
				sm.executeBatch();
				ps = con.prepareStatement(
						"SELECT orderId,username,realname,address,postcode,phone,totalPrice,email FROM users,orders " +
								"WHERE orderId=? " +
								"AND users.userid=" +
								"(SELECT orders.userId FROM orders WHERE orderId= ? )");
				ps.setLong(1, orderId);
				ps.setLong(2, orderId);

				rs = ps.executeQuery();
				if (rs.next()) {
					// ��װ��OrderUserBean��
					oub.setOrdersId(rs.getInt(1));
					oub.setUserName(rs.getString(2));
					oub.setRealName(rs.getString(3));
					oub.setAddress(rs.getString(4));
					oub.setPostcode(rs.getString(5));
					oub.setPhone(rs.getString(6));
					oub.setTotalPrice(rs.getFloat(7));
					oub.setEmail(rs.getString(8));
				}
			}
		} catch (Exception e) {
			flag = false;
			e.printStackTrace();
		} finally {
			this.close();
		}
		if (flag) {
			return oub;
		} else {
			return null;
		}
	}


	/**
	 * �����ر����ݿ�������Դ
	 */
	public void close() {
		try {
			if (rs != null) {
				rs.close();
				rs = null;
			}
			if (ps != null) {
				ps.close();
				ps = null;
			}
			if (con != null) {
				con.close();
				con = null;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}