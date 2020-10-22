
<%@page import="service.userserviceimple"%>
<%@page import="service.userservice"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<jsp:useBean id="user" class="dto.User" scope="page"></jsp:useBean>
<jsp:setProperty property="*" name="user"/>

<% 
userservice UserService=new userserviceimple();

UserService.registerUse(user);
response.sendRedirect("login_form.jsp");
%>