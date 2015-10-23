<%@ page language="java" pageEncoding="UTF-8"%>  
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
	<title>新增com.bxtel.model.Sms</title>
	<%@ include file="/com/bxtel/commons/jsplib.jsp"%>
</head>
<body>

<form method="post" action="doadd.do" method="post">  
	
	<table>
			 <tr>
				<td><label for="id">id</label></td>
				<td><input name="id"  class="${model.id}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="mobile">mobile</label></td>
				<td><input name="mobile"  class="${model.mobile}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="content">content</label></td>
				<td><input name="content"  class="${model.content}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="msgid">msgid</label></td>
				<td><input name="msgid"  class="${model.msgid}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="status">status</label></td>
				<td><input name="status"  class="${model.status}" value="" /></td>
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