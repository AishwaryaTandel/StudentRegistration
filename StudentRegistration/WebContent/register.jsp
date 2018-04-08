<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Page</title>
<script>
	function ifnull(id){
		if(id==""){
			alert("Please enter the details properly!")
		}
	}
	function isNum(n){
		var reg = /^\d+$/;
		if(!n.match(reg)){
			alert("Please enter valid Age!")
		}
	}
</script>
</head>
<body>
	<form action="Register" method="post">
		Student ID: <input type="text" name="studentId" onblur="ifnull(this.value)"/>
		<br><br>
		First Name: <input type="text" name="firstName" onblur="ifnull(this.value)"/>
		<br><br>
		Last Name: <input type="text" name="lastName" onblur="ifnull(this.value)"/>
		<br><br>
		Age: <input type="text" name="age" onblur="isNum(this.value)"/>
		<br><br>
		Gender: <input type="radio" name="gender" value="male"> Male &nbsp;&nbsp;&nbsp;
  		<input type="radio" name="gender" value="female"> Female<br><br>
  		Skills: <input type="checkbox" name="skill" value="C">C &nbsp;&nbsp;&nbsp;
		<input type="checkbox" name="skill" value="Java">Java &nbsp;&nbsp;&nbsp;
		<input type="checkbox" name="skill" value="Python">Python &nbsp;&nbsp;&nbsp;
		<input type="checkbox" name="skill" value="C++">C++ &nbsp;&nbsp;&nbsp; <br><br>
		<input type="submit" value="register"/>
	</form>
</body>
</html>