<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
    <div class="col-12 col-md-8 employee-modify">
        
        <form action="Fetch" method="post">
            <select name="fetch" class="employee-modify-anchor">
                <option value="employee_table">Employee Registered</option>
                <option value="student_table">Student Registered</option>
            </select>
            
            
            
            
            <input type="submit" value="fetch" class="form-modify-button">
        </form>
    </div>
    
      
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>
</body>
</html>