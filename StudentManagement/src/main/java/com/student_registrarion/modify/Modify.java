package com.student_registrarion.modify;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.student_management.connection.ConnectorFactory;


@WebServlet("/Modify")
public class Modify extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection con = null;
	PreparedStatement pstmt = null;
	RequestDispatcher requestDispatcher = null;
    
    public Modify() {

    
    }

    @Override
    public void init() throws ServletException {

    	con = ConnectorFactory.getConnection();
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String modify = request.getParameter("modify");
		
		
		
		if(modify.equals("employee_table")) {
			PreparedStatement prepareStatement = null;
			ResultSet result = null;
			PreparedStatement prepareStatement2 = null;
			try {
				String category = request.getParameter("employee-category");
				String id = request.getParameter("employee-id");
				String updatedValue = request.getParameter("employee-UpdatedValue");
				String query = "SELECT * FROM employee_table WHERE employee_id = ?";
				prepareStatement = con.prepareStatement(query);
				prepareStatement.setString(1, id);
				result = prepareStatement.executeQuery();
				if(result.next() == true) {
					String queryTwo = "UPDATE employee_table SET "+ category +" = ? WHERE employee_id = ?";
					prepareStatement2 = con.prepareStatement(queryTwo);
					prepareStatement2.setString(1, updatedValue);
					prepareStatement2.setString(2, id);
					prepareStatement2.executeUpdate();
					requestDispatcher = request.getRequestDispatcher("modify_success.jsp");
					requestDispatcher.forward(request, response);
				}
				else {
					requestDispatcher = request.getRequestDispatcher("modify_notsuccess.jsp");
					requestDispatcher.forward(request, response);
				}
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			finally {
				try {
					
					
					if(prepareStatement!=null) {
						prepareStatement.close();
					}
					if(prepareStatement2!=null) {
						prepareStatement2.close();
					}
					if(result!=null) {
						result.close();
					}
				}
				catch(SQLException e) {
					e.printStackTrace();
				}
			}
		}
			
		else {
			PreparedStatement prepareStatement = null;
			ResultSet result = null;
			PreparedStatement prepareStatement2 = null;
			try {
				String category = request.getParameter("student-category");
				String id = request.getParameter("student-id");
				String updatedValue = request.getParameter("student-UpdatedValue");
				String query = "SELECT * FROM student_table WHERE student_id = ?";
				prepareStatement = con.prepareStatement(query);
				prepareStatement.setString(1, id);
				result = prepareStatement.executeQuery();
				if(result.next() == true) {
					String queryTwo = "UPDATE student_table SET "+ category +" = ? WHERE student_id = ?";
					prepareStatement2 = con.prepareStatement(queryTwo);
					prepareStatement2.setString(1, updatedValue);
					prepareStatement2.setString(2, id);
					prepareStatement2.executeUpdate();
					RequestDispatcher requestDispatcher = request.getRequestDispatcher("modify_success.jsp");
					requestDispatcher.forward(request, response);
					
				}
				else {
					RequestDispatcher requestDispatcher = request.getRequestDispatcher("modify_notsuccess.jsp");
					requestDispatcher.forward(request, response);
				}
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			finally {
				try {
					
					
					if(prepareStatement!=null) {
						prepareStatement.close();
					}
					if(prepareStatement2!=null) {
						prepareStatement2.close();
					}
					if(result!=null) {
						result.close();
					}
				}
				catch(SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
}
}


