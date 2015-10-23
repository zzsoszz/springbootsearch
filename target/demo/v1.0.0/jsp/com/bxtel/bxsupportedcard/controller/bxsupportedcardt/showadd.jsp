<%@ page language="java" pageEncoding="UTF-8"%>  
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
	<title>新增bx_supportedcard_t</title>
	<%@ include file="/com/bxtel/commons/jsplib.jsp"%>
</head>
<body>

<form method="post" action="doadd.do" method="post">  
	
	<table>
			 <tr>
				<td><label for="tuid">tuid</label></td>
				<td><input name="tuid"  class="${model.tuid}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="transtype">transtype</label></td>
				<td><input name="transtype"  class="${model.transtype}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="bankcode">bankcode</label></td>
				<td><input name="bankcode"  class="${model.bankcode}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="cardtype">cardtype</label></td>
				<td><input name="cardtype"  class="${model.cardtype}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="curversion">curversion</label></td>
				<td><input name="curversion"  class="${model.curversion}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="sourcetype">sourcetype</label></td>
				<td><input name="sourcetype"  class="${model.sourcetype}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="param1">param1</label></td>
				<td><input name="param1"  class="${model.param1}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="param2">param2</label></td>
				<td><input name="param2"  class="${model.param2}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="param3">param3</label></td>
				<td><input name="param3"  class="${model.param3}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="param4">param4</label></td>
				<td><input name="param4"  class="${model.param4}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="param5">param5</label></td>
				<td><input name="param5"  class="${model.param5}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="param6">param6</label></td>
				<td><input name="param6"  class="${model.param6}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="param7">param7</label></td>
				<td><input name="param7"  class="${model.param7}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="param8">param8</label></td>
				<td><input name="param8"  class="${model.param8}" value="" /></td>
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