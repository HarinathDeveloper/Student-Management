package com.student_management.employee_login;

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


@WebServlet("/EmployeeValidation")
public class EmployeeValidation extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet r = null;
    
    public EmployeeValidation() {

    }

    @Override
    public void init() throws ServletException {

    	con = ConnectorFactory.getConnection();
    
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {

		
        String employee_id = request.getParameter("employee_id");
		String password = request.getParameter("password");
		
		
		String query2 = "SELECT * FROM employee_table WHERE employee_id = ? and password = ?";
		try {
			pstmt = con.prepareStatement(query2);
			pstmt.setString(1, employee_id);
			pstmt.setString(2, password);
			r = pstmt.executeQuery();
			
			if(r.next()==true) {
				
				RequestDispatcher requestdispatcher = request.getRequestDispatcher("employee2_login.jsp");
				requestdispatcher.forward(request, response);
			}
			else {
				RequestDispatcher requestdispatcher = request.getRequestDispatcher("employee_notvalid.jsp");
				requestdispatcher.include(request, response);
			}
		} 
		catch (SQLException e1) {
			e1.printStackTrace();
		}
		finally {
			try {
				if(pstmt!=null) {
					pstmt.close();
				}
				if(r!=null) {
					r.close();
				}
				
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
