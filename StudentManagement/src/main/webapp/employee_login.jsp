<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
   
    <style>
        #employee_login{
            background-color:rgb(200,200,120);
            border-radius:10px;
        }
    </style>
</head>
<body>
    <%@ include file="common.jsp" %>
    
    
        <div class="col-12 col-md-6 text-center employee-login-form" style="margin-top:100px;">
            <div>
              <h4 class="h4-registration-login">Employee Login</h4>
            </div>
            <div>
              <form action="EmployeeValidation" method="post" id="form">
                  <input type="text" name="employee_id" placeholder="Employee id" class="form-registration-input" id="email">
                  <br>
                  <input type="password" name="password" placeholder="password" class="form-registration-input" id="password">
                  <br>
                  <input type="submit" class="form-registration-button">
              </form>
            </div>
          
    </div>
    
    
    
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>
</body>
</html>