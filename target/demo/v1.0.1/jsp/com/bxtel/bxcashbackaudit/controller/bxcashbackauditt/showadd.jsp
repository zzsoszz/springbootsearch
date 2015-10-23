<%@ page language="java" pageEncoding="UTF-8"%>  
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
	<title>新增bx_cashback_audit_t</title>
	<%@ include file="/com/bxtel/commons/jsplib.jsp"%>
</head>
<body>

<form method="post" action="doadd.do" method="post">  
	
	<table>
			 <tr>
				<td><label for="cashbackid">返现id（审核、记录表共用）</label></td>
				<td><input name="cashbackid"  class="${model.cashbackid}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="userid">会员用户id</label></td>
				<td><input name="userid"  class="${model.userid}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="certificatestypeid">certificatestypeid</label></td>
				<td><input name="certificatestypeid"  class="${model.certificatestypeid}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="certificatesno">证件号码（默认身份证）</label></td>
				<td><input name="certificatesno"  class="${model.certificatesno}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="bankname">银行名称</label></td>
				<td><input name="bankname"  class="${model.bankname}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="branchbankname">支行名称</label></td>
				<td><input name="branchbankname"  class="${model.branchbankname}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="bankcardno">银行卡号</label></td>
				<td><input name="bankcardno"  class="${model.bankcardno}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="bankaccountname">bankaccountname</label></td>
				<td><input name="bankaccountname"  class="${model.bankaccountname}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="membercontinuemonth">连续会员月份，截止当月</label></td>
				<td><input name="membercontinuemonth"  class="${model.membercontinuemonth}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="membertotalmonth">总连续会员月份，包括已缴费的未来月份</label></td>
				<td><input name="membertotalmonth"  class="${model.membertotalmonth}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="cashbackamount">返现金额</label></td>
				<td><input name="cashbackamount"  class="${model.cashbackamount}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="status">0-待审核 1-审核通过待返现 2-审核不通过 3-返现成功 4-返现失败  20.返现中（防止重复提交返现请求）</label></td>
				<td><input name="status"  class="${model.status}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="auditor">审核人，审核</label></td>
				<td><input name="auditor"  class="${model.auditor}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="auditdate">审核日期</label></td>
				<td><input name="auditdate"  class="${model.auditdate}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="remark">备注，审核不通过原因放在这里，返现失败原因放在这里；累加</label></td>
				<td><input name="remark"  class="${model.remark}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="createdate">createdate</label></td>
				<td><input name="createdate"  class="${model.createdate}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="createby">createby</label></td>
				<td><input name="createby"  class="${model.createby}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="lastupdatedate">lastupdatedate</label></td>
				<td><input name="lastupdatedate"  class="${model.lastupdatedate}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="lastupdateby">lastupdateby</label></td>
				<td><input name="lastupdateby"  class="${model.lastupdateby}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="reduceintegral">扣减积分</label></td>
				<td><input name="reduceintegral"  class="${model.reduceintegral}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="cashbaktype">10 返现  20积分</label></td>
				<td><input name="cashbaktype"  class="${model.cashbaktype}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="ifalipay">充值到什么地方 ，0.银行卡   1支付宝    2.手机余额  3.QQ币</label></td>
				<td><input name="ifalipay"  class="${model.ifalipay}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="curversion">curversion</label></td>
				<td><input name="curversion"  class="${model.curversion}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="param">当银行卡提现时判断是否录入了银行卡提现的相关信息.0为未填,1为已填.默认为0.</label></td>
				<td><input name="param"  class="${model.param}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="param1">暂定为银行卡提现交易号录入（例如支付宝交易号，银行转账交易号之类）</label></td>
				<td><input name="param1"  class="${model.param1}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="param2">暂定为我方转出行的信息录入</label></td>
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