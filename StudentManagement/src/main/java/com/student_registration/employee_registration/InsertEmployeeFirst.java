package com.student_registration.employee_registration;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.student_management.connection.ConnectorFactory;


@WebServlet("/InsertEmployeeFirst")
public class InsertEmployeeFirst extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection con = null;
	PreparedStatement pstmt = null;
    
    public InsertEmployeeFirst() {

    }

    @Override
    public void init() throws ServletException {

    	con = ConnectorFactory.getConnection();
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String eid = request.getParameter("employee_id");
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		String email = request.getParameter("email");
		String city = request.getParameter("city");
		String mobile_number = request.getParameter("mobile_number");
		String dob = request.getParameter("dob");
		String gender = request.getParameter("gender");
		String department = request.getParameter("department");
		String year_of_joining = request.getParameter("year_of_joining");
		String retirement_year = request.getParameter("retirement_year");
		String password = request.getParameter("password");
		
		String query = "INSERT INTO `employee_table` (`employee_id`,`firstname`,`lastname`,`email`,`city`,`mobile_number`,`date_of_birth`,`gender`,`department`,`year_of_joining`,`retirement_year`,`password`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setString(1,eid);
			pstmt.setString(2, firstname);
			pstmt.setString(3, lastname);
			pstmt.setString(4, email);
			pstmt.setString(5, city);
			pstmt.setString(6, mobile_number);
			pstmt.setString(7, dob);
			pstmt.setString(8, gender);
			pstmt.setString(9, department);
			pstmt.setString(10, year_of_joining);
			pstmt.setString(11, retirement_year);
			pstmt.setString(12, password);
			
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(con!=null) {
					con.close();
				}
				if(pstmt!=null) {
					pstmt.close();
				}
				
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
		}
		RequestDispatcher r = request.getRequestDispatcher("employeeregistrationfirstsuccess.jsp");
		r.forward(request, response);
		
	}
	

}
