<%@ page language="java" pageEncoding="UTF-8"%>  
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<title>列表bx_cashback_audit_t</title>
		<%@ include file="/com/bxtel/commons/jsplib.jsp"%>
		
		
		<script type="text/javascript"  src="${ctx}/js/jquery/jqgrid/jquery.jqgrid-4.4.0/js/jquery-1.7.2.min.js"></script>
		<script type="text/javascript"  src="${ctx}/js/jquery/jquery-ui/1.8.23/jquery-ui-custom-redmond/js/jquery-ui-1.8.23.custom.min.js"></script>
		<link rel="stylesheet" type="text/css" media="screen" href="${ctx}/js/jquery/jquery-ui/1.8.23/jquery-ui-custom-redmond/css/redmond/jquery-ui-1.8.23.custom.css" />
		<link rel="stylesheet" type="text/css" media="screen" href="${ctx}/js/jquery/jqgrid/jquery.jqgrid-4.4.0/css/ui.jqgrid.css" />
		<link rel="stylesheet" type="text/css" href="${ctx}/css/yaml/yaml401-120306/demos/css/flexible-grids.css" />
		<script src="${ctx}/js/jquery/jqgrid/jquery.jqgrid-4.4.0/js/i18n/grid.locale-cn.js" type="text/javascript"></script>
		<script src="${ctx}/js/jquery/jqgrid/jquery.jqgrid-4.4.0/js/jquery.jqGrid.min.js" type="text/javascript"></script>
	
	
	<script type="text/javascript"> 
			var param="";
					param+='cashbackid='+ '${model.cashbackid}';
					param+='&userid='+'${model.userid}';
					param+='&certificatestypeid='+'${model.certificatestypeid}';
					param+='&certificatesno='+'${model.certificatesno}';
					param+='&bankname='+'${model.bankname}';
					param+='&branchbankname='+'${model.branchbankname}';
					param+='&bankcardno='+'${model.bankcardno}';
					param+='&bankaccountname='+'${model.bankaccountname}';
					param+='&membercontinuemonth='+'${model.membercontinuemonth}';
					param+='&membertotalmonth='+'${model.membertotalmonth}';
					param+='&cashbackamount='+'${model.cashbackamount}';
					param+='&status='+'${model.status}';
					param+='&auditor='+'${model.auditor}';
					param+='&auditdate='+'${model.auditdate}';
					param+='&remark='+'${model.remark}';
					param+='&createdate='+'${model.createdate}';
					param+='&createby='+'${model.createby}';
					param+='&lastupdatedate='+'${model.lastupdatedate}';
					param+='&lastupdateby='+'${model.lastupdateby}';
					param+='&reduceintegral='+'${model.reduceintegral}';
					param+='&cashbaktype='+'${model.cashbaktype}';
					param+='&ifalipay='+'${model.ifalipay}';
					param+='&curversion='+'${model.curversion}';
					param+='&param='+'${model.param}';
					param+='&param1='+'${model.param1}';
					param+='&param2='+'${model.param2}';
					param+='&param3='+'${model.param3}';
					param+='&param4='+'${model.param4}';
					param+='&param5='+'${model.param5}';
					param+='&param6='+'${model.param6}';
					param+='&param7='+'${model.param7}';
					param+='&param8='+'${model.param8}';
			jQuery().ready(function (){
						jQuery("#list1").jqGrid({
						   	url:'${ctx}/com/bxtel/bxcashbackaudit/controller/bxcashbackauditt/listdata.do?'+param,
							datatype: "xml",
						   	colNames:[
									'返现id（审核、记录表共用）'
									,'会员用户id'
									,'certificatestypeid'
									,'证件号码（默认身份证）'
									,'银行名称'
									,'支行名称'
									,'银行卡号'
									,'bankaccountname'
									,'连续会员月份，截止当月'
									,'总连续会员月份，包括已缴费的未来月份'
									,'返现金额'
									,'0-待审核 1-审核通过待返现 2-审核不通过 3-返现成功 4-返现失败  20.返现中（防止重复提交返现请求）'
									,'审核人，审核'
									,'审核日期'
									,'备注，审核不通过原因放在这里，返现失败原因放在这里；累加'
									,'createdate'
									,'createby'
									,'lastupdatedate'
									,'lastupdateby'
									,'扣减积分'
									,'10 返现  20积分'
									,'充值到什么地方 ，0.银行卡   1支付宝    2.手机余额  3.QQ币'
									,'curversion'
									,'当银行卡提现时判断是否录入了银行卡提现的相关信息.0为未填,1为已填.默认为0.'
									,'暂定为银行卡提现交易号录入（例如支付宝交易号，银行转账交易号之类）'
									,'暂定为我方转出行的信息录入'
									,'param3'
									,'param4'
									,'param5'
									,'param6'
									,'param7'
									,'param8'
						   	],
						   	colModel:[
							{name:'cashbackid',index:'cashbackid', width:90}
							,{name:'userid',index:'userid', width:90}
							,{name:'certificatestypeid',index:'certificatestypeid', width:90}
							,{name:'certificatesno',index:'certificatesno', width:90}
							,{name:'bankname',index:'bankname', width:90}
							,{name:'branchbankname',index:'branchbankname', width:90}
							,{name:'bankcardno',index:'bankcardno', width:90}
							,{name:'bankaccountname',index:'bankaccountname', width:90}
							,{name:'membercontinuemonth',index:'membercontinuemonth', width:90}
							,{name:'membertotalmonth',index:'membertotalmonth', width:90}
							,{name:'cashbackamount',index:'cashbackamount', width:90}
							,{name:'status',index:'status', width:90}
							,{name:'auditor',index:'auditor', width:90}
							,{name:'auditdate',index:'auditdate', width:90}
							,{name:'remark',index:'remark', width:90}
							,{name:'createdate',index:'createdate', width:90}
							,{name:'createby',index:'createby', width:90}
							,{name:'lastupdatedate',index:'lastupdatedate', width:90}
							,{name:'lastupdateby',index:'lastupdateby', width:90}
							,{name:'reduceintegral',index:'reduceintegral', width:90}
							,{name:'cashbaktype',index:'cashbaktype', width:90}
							,{name:'ifalipay',index:'ifalipay', width:90}
							,{name:'curversion',index:'curversion', width:90}
							,{name:'param',index:'param', width:90}
							,{name:'param1',index:'param1', width:90}
							,{name:'param2',index:'param2', width:90}
							,{name:'param3',index:'param3', width:90}
							,{name:'param4',index:'param4', width:90}
							,{name:'param5',index:'param5', width:90}
							,{name:'param6',index:'param6', width:90}
							,{name:'param7',index:'param7', width:90}
							,{name:'param8',index:'param8', width:90}
						   	],
						   	rowNum:10,
						   	height:300,
						   	autowidth: true,
						   	rowList:[10,20,30],
						   	pager: jQuery('#pager1'),
						   	sortname: 'id',
						    viewrecords: true,
						    sortorder: "desc",
						    caption:"bx_cashback_audit_t"
						}).navGrid('#pager1',{edit:false,add:false,del:false});					
			})
</script> 
	
	<style>
	body {
		overflow-x:hidden;
		overflow-y:hidden; 
	}
	</style>
		
	</head>
	
	<body>
				<table id="list1"></table>
				<div id="pager1"></div>
	</body>
</html>