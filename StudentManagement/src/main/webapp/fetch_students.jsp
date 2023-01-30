<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.student_management.student_registration.Student" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Student Registration</title>
    <link rel="stylesheet" href="style.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
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
          <th><b>Year of passing</b></th>
          <th><b>Passout year</b></th>
          
         </tr>
        
        <%ArrayList<Student> em = (ArrayList<Student>)request.getAttribute("student");
        for(Student student:em){%>
        <%-- Arranging data in tabular form
        --%>
            <tr>
                <td><%=student.getStudentId()%></td>
                <td><%=student.getFirstname()%></td>
                <td><%=student.getLastname()%></td>
                <td><%=student.getEmail()%></td>
                <td><%=student.getCity()%></td>
                <td><%=student.getMobileNumber()%></td>
                <td><%=student.getDateOfBirth()%></td>
                <td><%=student.getGender()%></td>
                <td><%=student.getDepartment()%></td>
                <td><%=student.getYearOfJoining()%></td>
                <td><%=student.getPassoutYear()%></td>
                
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