<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color:;">
<h3>Assignment 1</h3>
<h1>Login form</h1>
<form action="login_validate.jsp" method="post">
Username: <input placeholder="Enter" type=text name="user_name"><br><br>
Password: <input placeholder="Enter" type=text name="user_pass">
<br><br>
<input type=submit value=Login style="border:solid 3px;border-radius:10px">
<a href="reg_form.jsp"><input type=button value=Registration style="border:solid 3px;border-radius:10px"></a>
<br>
<br>
<div style="color:red;font-family:italic"><%=(request.getParameter("error_msg")!=null)? request.getParameter("error_msg"):"" %></div>
</form>

<br>



</body>
</html>