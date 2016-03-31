<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>userlist</title>
  </head>
  <body>
  	<table>
  	<thead>
  		<tr>
  			<th>name</th>
  			<th>age</th>
  		</tr>
  	</thead>
  	<tbody>
	<c:forEach items="${users }" var="user">
		<tr>
			<td>${user.name }</td>
			<td>${user.age}</td>
		</tr>
	</c:forEach>
	</tbody>
	</table>
  </body>
</html>