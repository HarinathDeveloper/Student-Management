package com.student_management.fetch;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.student_management.connection.ConnectorFactory;
import com.student_management.student_registration.Student;
import com.student_registration.employee_registration.Employee;


@WebServlet("/Fetch")
public class Fetch extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection con = null;
	PreparedStatement pstmt = null;
    
    public Fetch() {

    
    }
    
    @Override
    public void init() throws ServletException {

    	con = ConnectorFactory.getConnection();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String fetch = request.getParameter("fetch");
		String id = request.getParameter("id");
		
		
		if(fetch.equals("employee_table")) {
			Statement createStatement = null;
			ResultSet resultSet = null;
			try {
				
					String queryTwo = "SELECT * FROM employee_table";
					createStatement = con.createStatement();
					resultSet = createStatement.executeQuery(queryTwo);
					ArrayList<Employee> emp = new ArrayList<Employee>();
					while(resultSet.next()) {
						String employee_id = resultSet.getString(1);
						String firstname = resultSet.getString(2);
						String lastname = resultSet.getString(3);
						String email = resultSet.getString(4);
						String city = resultSet.getString(5);
						String mobile_number = resultSet.getString(6);
						String date_of_birth = resultSet.getString(7);
						String gender = resultSet.getString(8);
						String department = resultSet.getString(9);
						String year_of_joining = resultSet.getString(10);
						String retirement_year = resultSet.getString(11);
						String password = resultSet.getString(12);
						
						Employee em = new Employee(employee_id,firstname,lastname,email,city,mobile_number,date_of_birth,gender,department,year_of_joining,retirement_year,password);
						emp.add(em);
					}
					
					request.setAttribute("employee", emp);
					request.setAttribute("employeeDetails", "emp");
					RequestDispatcher requestDispatcher = request.getRequestDispatcher("fetch_employees.jsp");
					requestDispatcher.forward(request, response);
			}
				
			  
			catch(Exception e) {
				e.printStackTrace();
			}
			finally {
				try {
					
					if(createStatement!=null) {
						createStatement.close();
					}
					if(resultSet!=null) {
						resultSet.close();
					}
				}
				catch(SQLException e) {
					e.printStackTrace();
				}
			}
		}
			
		else {
			Statement createStatement = null;
			ResultSet resultSet = null;
			try {
				
				    ArrayList<Student> st = new ArrayList<Student>();
					String queryTwo = "SELECT * FROM student_table";
					createStatement = con.createStatement();
					
					resultSet = createStatement.executeQuery(queryTwo);
					while(resultSet.next()) {
						String student_id = resultSet.getString(1);
						String firstname = resultSet.getString(2);
						String lastname = resultSet.getString(3);
						String email = resultSet.getString(4);
						String city = resultSet.getString(5);
						String mobile_number = resultSet.getString(6);
						String date_of_birth = resultSet.getString(7);
						String gender = resultSet.getString(8);
						String department = resultSet.getString(9);
						String year_of_joining = resultSet.getString(10);
						String passout_year = resultSet.getString(11);
						
						Student stu = new Student(student_id,firstname,lastname,email,city,mobile_number,date_of_birth,gender,department,year_of_joining,passout_year);
						st.add(stu);
						
					}
					request.setAttribute("student", st);
					
					RequestDispatcher requestDispatcher = request.getRequestDispatcher("fetch_students.jsp");
					requestDispatcher.forward(request, response);
					
				}
				
			
			catch(Exception e) {
				e.printStackTrace();
			}
			finally {
				try {
					
					if(createStatement!=null) {
						createStatement.close();
					}
					if(resultSet!=null) {
						resultSet.close();
					}
				}
				catch(SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
