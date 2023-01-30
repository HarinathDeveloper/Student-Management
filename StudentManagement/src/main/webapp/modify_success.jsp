<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    
    <style>
        #modify{
            background-color:rgb(200,200,120);
            border-radius:10px;
        }
    </style>
</head>
<body>
    <%@ include file="commonNext.jsp" %>
    <h3 style="color:green;">Successfully Updated</h3>
    <div class="col-12 col-md-8 employee-modify">
        <h4>select, what do you want modify</h4><br>
        <form action="Modify" method="post">
            <select name="modify" class="employee-modify-anchor" style="padding:10px;
    margin-bottom:10px;
    border-radius:10px;
    width:70% !important;
    border:none;">
                <option value="employee_table">Employee Details</option>
                <option value="student_table">Student Details</option>
            </select>
            <select name="employee-category" class="duration">
                <option value="firstname">First Name</option>
                <option value="lastname">Last Name</option>
                <option value="city">City</option>
                <option value="monile_number">Mobile Number</option>
                <option value="date_of_birth">Date Of Birth</option>
                <option value="department">Department</option>
                <option value="year_of_joining">Year Of Joining</option>
                <option value="retirement_year">Retirement Year</option>
                <option value="password">Password</option>
            </select>
            <select name="student-category" class="duration">
                <option value="firstname">First Name</option>
                <option value="lastname">Last Name</option>
                <option value="city">City</option>
                <option value="monile_number">Mobile Number</option>
                <option value="date_of_birth">Date Of Birth</option>
                <option value="department">Department</option>
                <option value="year_of_joining">Year Of Joining</option>
                <option value="passout_year">Passout Year</option>
                
            </select><br>
            <input type="text" name="employee-id" placeholder="employee_id" class="duration">
            <input type="text" name="student-id" placeholder="student id" class="duration"><br>
            <input type="text" name="employee-UpdatedValue" placeholder="value to be updated" class="duration">
            <input type="text" name="student-UpdatedValue" placeholder="value to be updated" class="duration"><br>
            <input type="submit" class="form-modify-button">
        </form>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>
</body>
</html>