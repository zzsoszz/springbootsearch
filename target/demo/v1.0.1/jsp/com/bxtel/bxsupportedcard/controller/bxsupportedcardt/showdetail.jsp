<%@ page language="java" pageEncoding="UTF-8"%>  
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
	<title>详情bx_supportedcard_t</title>
	<%@ include file="/com/bxtel/commons/jsplib.jsp"%>
</head>
<body>

<form method="post"  method="post">  
	
	<table>
			 <tr>
				<td><label class="filedname">tuid</label></td>
				<td><label class="fieldvalue">${model.tuid}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">transtype</label></td>
				<td><label class="fieldvalue">${model.transtype}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">bankcode</label></td>
				<td><label class="fieldvalue">${model.bankcode}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">cardtype</label></td>
				<td><label class="fieldvalue">${model.cardtype}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">curversion</label></td>
				<td><label class="fieldvalue">${model.curversion}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">sourcetype</label></td>
				<td><label class="fieldvalue">${model.sourcetype}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">param1</label></td>
				<td><label class="fieldvalue">${model.param1}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">param2</label></td>
				<td><label class="fieldvalue">${model.param2}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">param3</label></td>
				<td><label class="fieldvalue">${model.param3}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">param4</label></td>
				<td><label class="fieldvalue">${model.param4}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">param5</label></td>
				<td><label class="fieldvalue">${model.param5}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">param6</label></td>
				<td><label class="fieldvalue">${model.param6}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">param7</label></td>
				<td><label class="fieldvalue">${model.param7}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">param8</label></td>
				<td><label class="fieldvalue">${model.param8}</label></td>
			</tr>
	</table>		

</form>
</body>
</html>