package com.student_registration.employee_registration;



import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.student_management.connection.ConnectorFactory;


@WebServlet("/EmployeeRegistrationAccept")
public class EmployeeRegistrationAccept extends HttpServlet {
	private static final long serialVersionUID = 1L; 
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet r = null;

    
    public EmployeeRegistrationAccept() {

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
		
		String eid = request.getParameter("employee_id");
		
		
		int a = Integer.parseInt(eid);
		String query2 = "SELECT * FROM employee_table WHERE employee_id = ?";
		try {
			pstmt = con.prepareStatement(query2);
			pstmt.setInt(1, a);
			r = pstmt.executeQuery();
			if(r.next()==true) {
				RequestDispatcher rdd = request.getRequestDispatcher("employee_alreadyExists.jsp");
				rdd.forward(request, response);
			}
			else {
				RequestDispatcher rdd = request.getRequestDispatcher("/InsertEmployee");
				rdd.forward(request, response);
			}
		} 
		catch (SQLException e1) {
			e1.printStackTrace();
		}
		finally {
			try {
				
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
