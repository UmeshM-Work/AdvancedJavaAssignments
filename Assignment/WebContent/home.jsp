<%@page import="java.util.ArrayList"%>
<%@page import="dto.User"%>
<%@page import="service.userserviceimple"%>
<%@page import="service.userservice"%>
<jsp:useBean id="user" class="dto.User" scope="session"></jsp:useBean>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%if (user!=null && user.getUser_id()>0)
    {
    	userservice UserService = new userserviceimple();
    	ArrayList<User> arr = UserService.selectAll(user.getUser_name());
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>WELCOME</h1>
<h3>User details </h3>
<br><br>

<%
		for(User ur : arr){
	%>

	<h1><%=ur.getUser_fname() %></h1>
	<h1><%=ur.getUser_name() %></h1>

	<%
		}
	%>
<form action="logout.jsp">
<input type="submit" value=logout style="border:solid 3px;border-radius:10px"></form>

</body>
</html>
<%}else{
	response.sendRedirect("login_form.jsp");
}
	%>