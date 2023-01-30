package com.student_management.connection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectorFactory {
	private static FileInputStream fis = null;
	private static Connection con = null;
	public static Connection getConnection() {
	try {
		fis = new FileInputStream("D:\\Student Registration\\StudentManagement\\configuration.properties");
		Properties properties = new Properties();
		properties.load(fis);
		String url = properties.getProperty("url");
		String un = properties.getProperty("username");
		String pwd = properties.getProperty("password");
	
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection(url,un,pwd);
	}
	catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return con;
	}
}
	

