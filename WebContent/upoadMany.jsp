<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>多个文件</title>
</head>
<body>

	<form action="uploadMany" method="post" enctype="multipart/form-data">
		<input type="file" name="upload" >
		<input type="file" name="upload" >
		<input type="submit" value="上传">
	</form>

</body>
</html>