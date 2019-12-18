package com.elephant.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/**
 * �����빺����ص�ҵ���߼�
 */
public class MyCartBO {
	private Connection con = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;
	HashMap<String, String> hm = new HashMap<String, String>();
	private float allPrice = 0.0f;

	public float getAllPrice() {
		return this.allPrice;
	}

	/**
	 * ��ӻ���
	 *
	 * @param goodsId
	 * @param goodsNum
	 */
	public void addGoods(String goodsId, String goodsNum) {
		hm.put(goodsId, goodsNum);
	}


	/**
	 * ɾ������
	 *
	 * @param goodsId
	 */
	public void removeGoods(String goodsId) {
		hm.remove(goodsId);
	}

	/**
	 * ��չ��ﳵ
	 */
	public void clean() {
		hm.clear();
	}

	/**
	 * �޸�����
	 *
	 * @param goodsId
	 * @param goodsNum
	 */
	public void upGoods(String goodsId, String goodsNum) {
		hm.put(goodsId, goodsNum);
	}

	/**
	 * ��ʾ���ﳵ
	 *
	 * @return
	 */
	public ArrayList<GoodsBean> showMyCart() {
		ArrayList<GoodsBean> al = new ArrayList<GoodsBean>();
		try {
			// ���������
			Iterator<String> iterator = hm.keySet().iterator();
			String sub = "(";
			while (iterator.hasNext()) {
				String goodsId = iterator.next();
				// �ж�goodId�Ƿ������һ��
				if (iterator.hasNext()) {
					sub = sub + goodsId + ",";
				} else {
					sub = sub + goodsId;
				}
			}
			sub = sub + ")";
			ConnDB connDB = new ConnDB();
			con = connDB.getCon();
			ps = con.prepareStatement("SELECT * FROM goods WHERE goodsId IN " + sub);
			rs = ps.executeQuery();
			this.allPrice = 0.0f;
			while (rs.next()) {
				GoodsBean gb = new GoodsBean();
				long id = rs.getLong(1);
				gb.setGoodsId(id);
				gb.setGoodsName(rs.getString(2));
				gb.setGoodsIntro(rs.getString(3));
				long price = rs.getLong(4);
				gb.setGoodsPrice(price);
				gb.setGoodsNum(rs.getInt(5));
				gb.setPublisher(rs.getString(6));
				gb.setPhoto(rs.getString(7));
				gb.setType(rs.getString(8));
				al.add(gb);
				this.allPrice = this.allPrice + price * Integer.parseInt(this.getNumById(id + ""));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			this.close();
		}
		return al;
	}

	/**
	 * ͨ��ID�ţ�������Ʒ����
	 *
	 * @param id
	 * @return
	 */
	public String getNumById(String id) {
		return hm.get(id);
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