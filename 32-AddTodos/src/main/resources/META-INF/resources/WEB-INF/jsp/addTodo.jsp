<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
    <head>
		<link rel="stylesheet" href="webjars/bootstrap/5.1.3/css/bootstrap.min.css">
        <title>List Todos page</title>
    </head>
    <body>
        <div>Welcome ${username}</div>
		<hr>
		<div class="container">

			<h1> Enter todo details </h1>
			<form method="post">
				Description: <input type="text" name="description">
				<input type="submit" class="btn btn-success">
			</form>
			
		<script src="webjars/jquery/3.6.0/jquery.min.js"></script>
		<script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
	</div>
    </body>
	</html>