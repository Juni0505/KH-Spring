<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>board list</title>
</head>
<body>
<script>
	var msg = '${msg}';
	if(msg){
		alert(msg);
	}
	var msg2 = '${msg2}';
	if(msg2){
		alert(msg);
	}
</script>
<h2>Board List</h2>
[[
${boardList}
]]


</body>
</html>