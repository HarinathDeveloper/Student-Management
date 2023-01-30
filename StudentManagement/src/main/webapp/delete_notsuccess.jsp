<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    
    <style>
        #delete{
            background-color:rgb(200,200,120);
            border-radius:10px;
        }
    </style>
</head>
<body>
    <%@ include file="commonNext.jsp" %>
    <h3 style="color:red;">Enter Valid Details of Employee / Student</h3>
    <div class="col-12 col-md-8 employee-modify">
        
        <form action="Delete" method="post">
            <select name="delete" class="employee-modify-anchor">
                <option value="employee_table">Employee Details</option>
                <option value="student_table">Student Details</option>
            </select>
            
            <input type="text" name="id" placeholder="employee_id" class="employee-modify-anchor">
            
            <input type="submit" value="delete" class="form-modify-button">
        </form>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>
</body>
</html>