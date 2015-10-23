<%@ page language="java" pageEncoding="UTF-8"%>  
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
	<title>详情bx_cashback_audit_t</title>
	<%@ include file="/com/bxtel/commons/jsplib.jsp"%>
</head>
<body>

<form method="post"  method="post">  
	
	<table>
			 <tr>
				<td><label class="filedname">返现id（审核、记录表共用）</label></td>
				<td><label class="fieldvalue">${model.cashbackid}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">会员用户id</label></td>
				<td><label class="fieldvalue">${model.userid}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">certificatestypeid</label></td>
				<td><label class="fieldvalue">${model.certificatestypeid}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">证件号码（默认身份证）</label></td>
				<td><label class="fieldvalue">${model.certificatesno}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">银行名称</label></td>
				<td><label class="fieldvalue">${model.bankname}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">支行名称</label></td>
				<td><label class="fieldvalue">${model.branchbankname}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">银行卡号</label></td>
				<td><label class="fieldvalue">${model.bankcardno}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">bankaccountname</label></td>
				<td><label class="fieldvalue">${model.bankaccountname}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">连续会员月份，截止当月</label></td>
				<td><label class="fieldvalue">${model.membercontinuemonth}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">总连续会员月份，包括已缴费的未来月份</label></td>
				<td><label class="fieldvalue">${model.membertotalmonth}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">返现金额</label></td>
				<td><label class="fieldvalue">${model.cashbackamount}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">0-待审核 1-审核通过待返现 2-审核不通过 3-返现成功 4-返现失败  20.返现中（防止重复提交返现请求）</label></td>
				<td><label class="fieldvalue">${model.status}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">审核人，审核</label></td>
				<td><label class="fieldvalue">${model.auditor}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">审核日期</label></td>
				<td><label class="fieldvalue">${model.auditdate}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">备注，审核不通过原因放在这里，返现失败原因放在这里；累加</label></td>
				<td><label class="fieldvalue">${model.remark}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">createdate</label></td>
				<td><label class="fieldvalue">${model.createdate}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">createby</label></td>
				<td><label class="fieldvalue">${model.createby}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">lastupdatedate</label></td>
				<td><label class="fieldvalue">${model.lastupdatedate}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">lastupdateby</label></td>
				<td><label class="fieldvalue">${model.lastupdateby}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">扣减积分</label></td>
				<td><label class="fieldvalue">${model.reduceintegral}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">10 返现  20积分</label></td>
				<td><label class="fieldvalue">${model.cashbaktype}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">充值到什么地方 ，0.银行卡   1支付宝    2.手机余额  3.QQ币</label></td>
				<td><label class="fieldvalue">${model.ifalipay}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">curversion</label></td>
				<td><label class="fieldvalue">${model.curversion}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">当银行卡提现时判断是否录入了银行卡提现的相关信息.0为未填,1为已填.默认为0.</label></td>
				<td><label class="fieldvalue">${model.param}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">暂定为银行卡提现交易号录入（例如支付宝交易号，银行转账交易号之类）</label></td>
				<td><label class="fieldvalue">${model.param1}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">暂定为我方转出行的信息录入</label></td>
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