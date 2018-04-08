<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List" %>
<%@ page import="com.bean.Student" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Success Page</title>
</head>
<body>
	<% 
		List<Student> studentList= (List<Student>)request.getAttribute("studentList");
	%>
	
	<% if(studentList.size()==0){ %>
		No Records Found!
	<%} else{%>
	<table border=1>
		<tr><th>Student ID</th><th>First Name</th><th>Last Name</th><th>Age</th><th>Gender</th></tr>

		<%for(Student student: studentList){ %>
		<tr><td><%=student.getStudentId()%></td>
		<td><%=student.getFirstName()%></td>
		<td><%=student.getLastName()%></td>
		<td><%=student.getAge()%></td>
		<td><%=student.getGender()%></td>
		</tr>
		<%} %>
	</table>
	<%} %>
</body>
</html>