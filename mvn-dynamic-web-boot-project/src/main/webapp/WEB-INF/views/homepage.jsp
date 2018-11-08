<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
	<form action="/storeData" method="post" enctype="multipart/form-data">
		<input type="text" name="fname"> <input type="file"
			name="file1"> <input type="submit">
	</form>
</body>
</html>