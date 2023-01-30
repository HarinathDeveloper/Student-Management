<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.student_registration.employee_registration.Employee"%>
<!DOCTYPE html>
<html lang="en">
<head>
    
    <style>
        #fetch{
            background-color:rgb(200,200,120);
            border-radius:10px;
        }
    </style>
</head>
<body>
    <%@ include file="commonNext.jsp" %>
    <div class="col-12 col-md-8 d-flex flex-column justify-content-center m-auto mt-5">
      <h2 class="mb-5">Employees</h2>
      <div class="table-responsive">
      <table class="table table-striped table-dark">
      
         <tr bgcolor="00FF7F">
          <th><b>Employee Id</b></th>
          <th><b>Firstname</b></th>
          <th><b>Lastname</b></th>
          <th><b>Email</b></th>
          <th><b>City</b></th>
          <th><b>Mobile Number</b></th>
          <th><b>DateOfBirth</b></th>
          <th><b>Gender</b></th>
          <th><b>Department</b></th>
          <th><b>Year of joining</b></th>
          <th><b>Retirement Year</b></th>
          
         </tr>
        
        <%ArrayList<Employee> em = (ArrayList<Employee>)request.getAttribute("employee");
        for(Employee s:em){%>
        <%-- Arranging data in tabular form
        --%>
            <tr>
                <td><%=s.getEmployeeId()%></td>
                <td><%=s.getFirstname()%></td>
                <td><%=s.getLastname()%></td>
                <td><%=s.getEmail()%></td>
                <td><%=s.getCity()%></td>
                <td><%=s.getMobileNumber()%></td>
                <td><%=s.getDateOfBirth()%></td>
                <td><%=s.getGender()%></td>
                <td><%=s.getDepartment()%></td>
                <td><%=s.getYearOfJoining()%></td>
                <td><%=s.getRetirementYear()%></td>
                
            </tr>
            <%}%>
        </table> 
        <hr/>
    </div>
    </div>
    <a href="fetch.jsp" class="employee-modify-anchor">Back</a>
      
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>
</body>
</html>