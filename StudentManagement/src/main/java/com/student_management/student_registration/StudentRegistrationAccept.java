package com.student_management.student_registration;

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


@WebServlet("/StudentRegistrationAccept")
public class StudentRegistrationAccept extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection con = null;
	PreparedStatement pstmt = null;
    
    public StudentRegistrationAccept() {

    }

    @Override
    public void init() throws ServletException {
    	con = ConnectorFactory.getConnection();
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
		
		String stuid = request.getParameter("student_id");
		
		
		String query2 = "SELECT * FROM student_table WHERE student_id = ?";
		try {
			pstmt = con.prepareStatement(query2);
			pstmt.setString(1, stuid);
			ResultSet r = pstmt.executeQuery();
			if(r.next()==true) {
				RequestDispatcher requestdispatcher = request.getRequestDispatcher("student_alreadyExists.jsp");
				requestdispatcher.forward(request, response);
			}
			else {
				RequestDispatcher requestdispatcher = request.getRequestDispatcher("/InsertStudent");
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
				
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
