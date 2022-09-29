<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>입력 폼 입니다.</title>
</head>
<body>
<h1>CheckForm.jsp</h1>
<form action="check.do" method=post>
	<input type="checkbox" name="hobby" value="1">운동
	<input type="checkbox" name="hobby" value="2">피아노
	<input type="checkbox" name="hobby" value="3">게임
	<input type="checkbox" name="hobby" value="4">수면
	<input type="submit" value="전송">
</form>

</body>
</html>