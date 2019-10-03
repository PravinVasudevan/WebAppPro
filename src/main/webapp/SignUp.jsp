<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sign Up page</title>
</head>
<body>
	<form action = "signUp" method="post">
		Enter the UserName : <input type="text" name = "uname"><br><br>
		Enter the Password : <input type="password" name = "pass"><br><br>
		Enter the Re-Enter Password : <input type="password" name = "repass"><br><br>
		Enter the Mobile no: <input type="number" name = "mobNo"><br><br>
		Enter the Email ID : <input type="email" name = "email"><br><br>
		<input type="submit" value="SignUp">
	</form>
</body>
</html>