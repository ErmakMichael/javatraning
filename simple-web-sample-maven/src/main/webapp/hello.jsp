<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>

<body>
	<div>hello world</div>

	<div>
		Текущее время:
		<%=new java.util.Date()%>
	</div>

	<div>
		Имя вашего хоста:
		<%=request.getRemoteHost()%>
		<%=request.getParameter("title")%>
	</div>

	<div>
		<%!private int accessCount = 0;%>
		<%=++accessCount%>
	</div>
	
	<div>
		<% String queryData = request.getQueryString(); %>
		<%= queryData %>
	</div>


</body>

</html>