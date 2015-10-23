<%@ page language="java" pageEncoding="UTF-8"%>  
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<title>列表bx_supportedcard_t</title>
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
					param+='tuid='+ '${model.tuid}';
					param+='&transtype='+'${model.transtype}';
					param+='&bankcode='+'${model.bankcode}';
					param+='&cardtype='+'${model.cardtype}';
					param+='&curversion='+'${model.curversion}';
					param+='&sourcetype='+'${model.sourcetype}';
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
						   	url:'${ctx}/com/bxtel/bxsupportedcard/controller/bxsupportedcardt/listdata.do?'+param,
							datatype: "xml",
						   	colNames:[
									'tuid'
									,'transtype'
									,'bankcode'
									,'cardtype'
									,'curversion'
									,'sourcetype'
									,'param1'
									,'param2'
									,'param3'
									,'param4'
									,'param5'
									,'param6'
									,'param7'
									,'param8'
						   	],
						   	colModel:[
							{name:'tuid',index:'tuid', width:90}
							,{name:'transtype',index:'transtype', width:90}
							,{name:'bankcode',index:'bankcode', width:90}
							,{name:'cardtype',index:'cardtype', width:90}
							,{name:'curversion',index:'curversion', width:90}
							,{name:'sourcetype',index:'sourcetype', width:90}
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
						    caption:"bx_supportedcard_t"
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