
<%@page import="service.userserviceimple"%>
<%@page import="service.userservice"%>
<jsp:useBean id="user" class="dto.User" scope="session" ></jsp:useBean>
<jsp:setProperty property="*" name="user"/>
<%
	userservice UserService = new userserviceimple();
	boolean b = UserService.login1(user);
	if(b){
		response.sendRedirect("home.jsp");
	}else{
		response.sendRedirect("login_form.jsp?error_msg=Wrong credentials please enter it once again");
	}
%>