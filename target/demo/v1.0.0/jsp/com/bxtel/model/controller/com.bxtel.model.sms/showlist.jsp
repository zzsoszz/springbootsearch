<%@ page language="java" pageEncoding="UTF-8"%>  
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<title>列表com.bxtel.model.Sms</title>
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
					param+='id='+ '${model.id}';
					param+='&mobile='+'${model.mobile}';
					param+='&content='+'${model.content}';
					param+='&msgid='+'${model.msgid}';
					param+='&status='+'${model.status}';
			jQuery().ready(function (){
						jQuery("#list1").jqGrid({
						   	url:'${ctx}/com/bxtel/model/controller/com.bxtel.model.sms/listdata.do?'+param,
							datatype: "xml",
						   	colNames:[
									'id'
									,'mobile'
									,'content'
									,'msgid'
									,'status'
						   	],
						   	colModel:[
							{name:'id',index:'id', width:90}
							,{name:'mobile',index:'mobile', width:90}
							,{name:'content',index:'content', width:90}
							,{name:'msgid',index:'msgid', width:90}
							,{name:'status',index:'status', width:90}
						   	],
						   	rowNum:10,
						   	height:300,
						   	autowidth: true,
						   	rowList:[10,20,30],
						   	pager: jQuery('#pager1'),
						   	sortname: 'id',
						    viewrecords: true,
						    sortorder: "desc",
						    caption:"com.bxtel.model.Sms"
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