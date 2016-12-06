<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome to first page</title>
</head>
<body>
 <!--  Create a form with two fields and two buttons -->
 <h1>Welcome !i!i!i!i!</h1>
 <h3>This my first JSP project</h3>
 <p>Please enter your Username and password for login.</p>
   <form action="LoginServlet" method="post">
   
    User Name : <input type="Text" name="UserName">
 
    Password  : <input type="Password" name="Password">
     <br>
     <pre>
      <input type="submit" value="Login">  <input type="reset">
      </pre>
     
    </form>
</body>
</html>