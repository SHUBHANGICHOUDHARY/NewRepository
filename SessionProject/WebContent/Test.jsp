<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.Date"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="/Hello.jsp" %>	
	<h1>My First JSP</h1>
	The time is <%=new Date()%>
	<br>

	<%!
	public int add(int a,int b)
	{
		return a+b;
	}
	%>
	<% 
	int i=10;
	int j=20;
	int k=i+j;
	%>
	The value of k = <%=k %>
	<br>
	<%k=add(45,86); %>
	The value of k = <%=k %>
</body>
</html>