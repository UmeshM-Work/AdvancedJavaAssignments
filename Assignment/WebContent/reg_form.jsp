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
<h1>Registration form</h1>
<form action="reg.jsp" method="post">
Your FullName: <input placeholder="Enter" type=text name="user_fname"><br><br>
New Username: <input placeholder="Enter" type=text name="user_name"><br><br>
New Password: <input placeholder="Enter" type="password" name="user_pass">
<br><br>
<input type=submit value=register style="border:solid 3px;border-radius:10px">
<a href="login_form.jsp"><input type=button value=back style="border:solid 3px;border-radius:10px"></a>

</form>


</body>
</html>