<%@ page language="java" pageEncoding="UTF-8"%>  
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
	<title>详情${table.tableComments}</title>
	<%@ include file="/com/bxtel/commons/jsplib.jsp"%>
</head>
<body>

<form method="post"  method="post">  
	
	<table>
		<#list table.columns as column>
			 <tr>
				<td><label class="filedname">${column.comments}</label></td>
				<td><label class="fieldvalue">${'$'}{model.${column.fieldName}}</label></td>
			</tr>
		</#list>
	</table>		

</form>
</body>
</html>