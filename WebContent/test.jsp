<!-- page directive -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Example</title>
</head>
<body>
<!-- definition tag -->
	<%!public int add(int i, int j) {
		return i+j;
	}%>
	
<!-- script tag -->
	<% int k=add(2,3); %>
	The value of k is : <%=k %>
	
	<% String userName = request.getParameter("username");
		if(userName!=null){
			session.setAttribute("username", userName);
		}
	%>
	<br>
	User name in request param is : <%=userName %><br>
	User name in session is : <%=session.getAttribute("username") %>
</body>
</html>