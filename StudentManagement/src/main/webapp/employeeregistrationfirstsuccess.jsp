<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    
    <style>
        #employee_registration_form{
            background-color:rgb(200,200,120);
            border-radius:10px;
        }
    </style>
</head>
<body>
    <%@ include file="common.jsp" %>
    
    <h2 style="color:green;">Successfully Registered</h2>
    <div class="col-12 col-md-8 student-login-form">
      <form action="EmployeeRegistrationFirst" method="post">
        <input type="text" name="employee_id" placeholder="employee id" class="form-registration-input" required autocomplete="off">
        <br>
        <input type="text" name="firstname" placeholder="firstname" class="form-registration-input" required autocomplete="off">
        <br>
        <input type="text" name="lastname" placeholder="lastname" class="form-registration-input" autocomplete="off" required>
        <br>
        <input type="email" name="email" placeholder="email" class="form-registration-input" autocomplete="off" required>
        <br>
        <input type="text" name="city" placeholder="city" class="form-registration-input" autocomplete="off" required>
        <br>
        <input type="number" name="mobile_number" placeholder="mobile number" class="form-registration-input" autocomplete="off" required>
        <br>
        <label>Date Of Birth </label><br>
        <input type="date" name="dob" placeholder="date of birth" class="form-registration-input" autocomplete="off" required><br>
        <div class="form-registration-input">
          <label>Gender : </label>
          <label><input type="radio" name="gender" value="male" id="m" required>Male</label>
          <label><input type="radio" name="gender" value="female" id="f">Female</label>
          <label><input type="radio" name="gender" value="other" id="o">Other</label>
        </div>
        <label>Department </label><br><br>
        <select id="list" class="form-registration-input" name="department" required>
          <option value="mca">MCA</option>
          <option value="mba">MBA</option>
          <option value="msc">MSC</option>
          <option value="bsc">B.Sc</option>
          <option value="Btech">B.Tech</option>
          <option value="mtech">M.TEch</option>
        </select><br>
        <input type="text" name="year_of_joining" placeholder="year_of_joining" class="duration" required>
        <input type="text" name="retirement_year" placeholder="retirement_year" class="duration" required>
        <br>
        <input type="password" name="password" placeholder="password" class="form-registration-input" required autocomplete="off">
        <br>
        <input type="submit" class="form-registration-button">
      </form>
    </div>
      
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>
</body>
</html>