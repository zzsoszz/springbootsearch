<%@ page language="java" pageEncoding="UTF-8"%>  
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
	<title>编辑${table.tableComments}</title>
	<%@ include file="/com/bxtel/commons/jsplib.jsp"%>
</head>
<body>

<form method="post" action="doupdate.do" method="post">  
	
	<table>
		<#list table.columns as column>
			 <tr>
				<td><label for="${column.fieldName}">${column.comments}</label></td>
				<td><input name="${column.fieldName}"  class="${'$'}{model.${column.fieldName}}" value="${'$'}{model.${column.fieldName}}" /></td>
			</tr>
		</#list>
		
		<tr>
				<td colspan="2">
					<input type="submit" value="<spring:message code="label.save"/>"/>
				</td>
		</tr>
		
	</table>
	
</form>
</body>
</html>