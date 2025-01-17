<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
    <head>
        <title>List Todos page</title>
    </head>
    <body>
        <div>Welcome ${username}</div>
		<hr>
		<h1> Your todos </h1>
		<table border=1>
			<thead>
				<tr>
					<th>Id</th>
					<th>Description</th>
					<th>TargetDate</th>
					<th>Is Done?</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${todos}"  var="todo">
					<tr>
						<td>${todo.id}</td>
						<td>${todo.description}</td>
						<td>${todo.targetDate}</td>
						<td>${todo.done}</td>
					</tr>
				</c:forEach>
			</tbody>
			
		</table>
		
    </body>
</html>