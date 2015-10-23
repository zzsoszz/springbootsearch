<%@ page language="java" pageEncoding="UTF-8"%>  
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
	<title>新增.Sms</title>
	<%@ include file="/com/bxtel/commons/jsplib.jsp"%>
</head>
<body>

<form method="post" action="doadd.do" method="post">  
	
	<table>
			 <tr>
				<td><label for=".Sms">.Sms</label></td>
				<td><input name=".Sms"  class="${model..Sms}" value="" /></td>
			</tr>
			 <tr>
				<td><label for=".Sms">.Sms</label></td>
				<td><input name=".Sms"  class="${model..Sms}" value="" /></td>
			</tr>
			 <tr>
				<td><label for=".Sms">.Sms</label></td>
				<td><input name=".Sms"  class="${model..Sms}" value="" /></td>
			</tr>
			 <tr>
				<td><label for=".Sms">.Sms</label></td>
				<td><input name=".Sms"  class="${model..Sms}" value="" /></td>
			</tr>
			 <tr>
				<td><label for=".Sms">.Sms</label></td>
				<td><input name=".Sms"  class="${model..Sms}" value="" /></td>
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