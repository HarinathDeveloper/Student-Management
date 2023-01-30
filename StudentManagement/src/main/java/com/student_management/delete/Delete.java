package com.student_management.delete;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.student_management.connection.ConnectorFactory;


@WebServlet("/Delete")
public class Delete extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection con = null;
	PreparedStatement pstmt = null;
    
    public Delete() {

    }

    @Override
    public void init() throws ServletException {

    	con = ConnectorFactory.getConnection();
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String modify = request.getParameter("delete");
		String id = request.getParameter("id");
		
		
		if(modify.equals("employee_table")) {
			PreparedStatement prepareStatement = null;
			PreparedStatement prepareStatement2 = null;
			try {
				String query = "SELECT * FROM employee_table WHERE employee_id = ?";
				prepareStatement = con.prepareStatement(query);
				prepareStatement.setString(1, id);
				ResultSet executeQuery = prepareStatement.executeQuery();
				if(executeQuery.next() == true) {
					String queryTwo = "DELETE FROM employee_table WHERE employee_id = ?";
					prepareStatement2 = con.prepareStatement(queryTwo);
					prepareStatement2.setString(1, id);
					prepareStatement2.executeUpdate();
					
					RequestDispatcher requestDispatcher = request.getRequestDispatcher("delete_success.jsp");
					requestDispatcher.include(request, response);
				}
				else {
					RequestDispatcher requestDispatcher = request.getRequestDispatcher("delete_notsuccess.jsp");
					requestDispatcher.include(request, response);
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
				}
				catch(SQLException e) {
					e.printStackTrace();
				}
			}
		}
			
		else {
			PreparedStatement prepareStatement = null;
			PreparedStatement prepareStatement2 = null;
			try {
				String query = "SELECT * FROM student_table WHERE student_id = ?";
				prepareStatement = con.prepareStatement(query);
				prepareStatement.setString(1, id);
				ResultSet executeQuery = prepareStatement.executeQuery();
				if(executeQuery.next() == true) {
					String queryTwo = "DELETE FROM student_table WHERE student_id = ?";
					prepareStatement2 = con.prepareStatement(queryTwo);
					prepareStatement2.setString(1, id);
					prepareStatement2.executeUpdate();
					RequestDispatcher requestDispatcher = request.getRequestDispatcher("delete_success.jsp");
					requestDispatcher.forward(request, response);
					
				}
				else {
					RequestDispatcher requestDispatcher = request.getRequestDispatcher("delete_notsuccess.jsp");
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
				}
				catch(SQLException e) {
					e.printStackTrace();
				}
			}
		}
	
	}
	

}
