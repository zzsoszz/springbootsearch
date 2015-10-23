<%@ page language="java" pageEncoding="UTF-8"%>  
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
	<title>编辑com.bxtel.model.User</title>
	<%@ include file="/com/bxtel/commons/jsplib.jsp"%>
</head>
<body>

<form method="post" action="doupdate.do" method="post">  
	
	<table>
			 <tr>
				<td><label for="id">id</label></td>
				<td><input name="id"  class="${model.id}" value="${model.id}" /></td>
			</tr>
			 <tr>
				<td><label for="email">email</label></td>
				<td><input name="email"  class="${model.email}" value="${model.email}" /></td>
			</tr>
			 <tr>
				<td><label for="name">name</label></td>
				<td><input name="name"  class="${model.name}" value="${model.name}" /></td>
			</tr>
		
		<tr>
				<td colspan="2">
					<input type="submit" value="<spring:message code="label.save"/>"/>
				</td>
		</tr>
		
	</table>
	
</form>
</body>
</html>