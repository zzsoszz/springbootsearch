<%@ page language="java" pageEncoding="UTF-8"%>  
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
	<title>详情com.bxtel.model.Sms</title>
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
				<td><label class="filedname">mobile</label></td>
				<td><label class="fieldvalue">${model.mobile}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">content</label></td>
				<td><label class="fieldvalue">${model.content}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">msgid</label></td>
				<td><label class="fieldvalue">${model.msgid}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">status</label></td>
				<td><label class="fieldvalue">${model.status}</label></td>
			</tr>
	</table>		

</form>
</body>
</html>