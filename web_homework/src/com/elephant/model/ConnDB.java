package com.elephant.model;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * 获得数据库 链接
 */
public class ConnDB {
	private Connection con = null;

	public Connection getCon() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Shoppings?useSSL=true&characterEncoding=utf-8&serverTimezone=UTC", "root", "*****");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}

}
