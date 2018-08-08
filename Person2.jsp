<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.cg.pojo.Person" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%Person person=(Person)request.getAttribute("PersonObj"); %>
<table>
<tr>
	<td>First Name:</td>
	<td><%=person.getFirstName() %></td>
</tr>

<tr>
	<td>Last Name:</td>
	<td><%=person.getLastName() %></td>
</tr>

<tr>
	<td>Gender:</td>
	<td><%=person.getGender()%></td>
</tr>

<tr>
	<td>Highest Qualification:</td>
	<td><%=person.getHighestQualification() %></td>
</tr>


<tr>
	<td>Date of Birth:</td>
	<td><%=person.getDateOfBirth()%></td>
</tr>

<%-- <tr>
	<td>Hobbies:</td>
	<td>
	<%for(String hobbies :person.getHobbies()){ %>
	<%= hobbies + "\t" %>
	<%} %>
	</td>
</tr>

<tr>
	<td>Skills:</td>
	<td>
	<%for(String skills :person.getSkills()){ %>
	<%= skills + "\t" %>
	<%} %>
	</td>
</tr> --%>

<tr>
	<td>Address:</td>
	<td><%=person.getAddress() %></td>
</tr>

<tr>
	<td>Email:</td>
	<td><%=person.getEmail() %></td>
</tr>

<tr>
	<td>Website:</td>
	<td><%=person.getWebsite() %></td>
</tr>

<tr>
	<td>Description:</td>
	<td><%=person.getDescription() %></td>
</tr>

<tr>
	<td>Contact Number:</td>
	<td><%=person.getContactNumber() %></td>
</tr>


</table>

</body>
</html>