<%@ page language="java" pageEncoding="UTF-8"%>  
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
	<title>详情com.bxtel.model.User</title>
	<%@ include file="/com/bxtel/commons/jsplib.jsp"%>
</head>
<body>

<form method="post"  method="post">  
	
	<table>
			 <tr>
				<td><label class="filedname">id</label></td>
				<td><label class="fieldvalue">${model.id}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">email</label></td>
				<td><label class="fieldvalue">${model.email}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">name</label></td>
				<td><label class="fieldvalue">${model.name}</label></td>
			</tr>
	</table>		

</form>
</body>
</html>