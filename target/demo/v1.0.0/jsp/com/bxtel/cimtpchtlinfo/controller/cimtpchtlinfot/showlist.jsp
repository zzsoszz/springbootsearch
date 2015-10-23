<%@ page language="java" pageEncoding="UTF-8"%>  
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<title>列表cim_tpc_htl_info_t</title>
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
					param+='cityCode='+ '${model.cityCode}';
					param+='&districtCode='+'${model.districtCode}';
					param+='&companyId='+'${model.companyId}';
					param+='&hotelName='+'${model.hotelName}';
					param+='&hotelNameForeign='+'${model.hotelNameForeign}';
					param+='&hotelNameSimple='+'${model.hotelNameSimple}';
					param+='&keyWords='+'${model.keyWords}';
					param+='&hotelAddress='+'${model.hotelAddress}';
					param+='&hotelType='+'${model.hotelType}';
					param+='&hotelKind='+'${model.hotelKind}';
					param+='&hotelLevel='+'${model.hotelLevel}';
					param+='&hotelIntro='+'${model.hotelIntro}';
					param+='&contactPhone='+'${model.contactPhone}';
					param+='&contactFax='+'${model.contactFax}';
					param+='&hotelWebsite='+'${model.hotelWebsite}';
					param+='&businessArea='+'${model.businessArea}';
					param+='&hotelRoute='+'${model.hotelRoute}';
					param+='&startDate='+'${model.startDate}';
					param+='&roomNumber='+'${model.roomNumber}';
					param+='&payWay='+'${model.payWay}';
					param+='&longitude='+'${model.longitude}';
					param+='&latitude='+'${model.latitude}';
					param+='&ifForeign='+'${model.ifForeign}';
					param+='&conferStatus='+'${model.conferStatus}';
					param+='&belongCode='+'${model.belongCode}';
					param+='&ifChangeSend='+'${model.ifChangeSend}';
					param+='&externalId='+'${model.externalId}';
					param+='&urlAddress='+'${model.urlAddress}';
					param+='&webNumber='+'${model.webNumber}';
					param+='&webPassCode='+'${model.webPassCode}';
					param+='&status='+'${model.status}';
					param+='&createDate='+'${model.createDate}';
					param+='&modifyDate='+'${model.modifyDate}';
					param+='&hotelAddressForeign='+'${model.hotelAddressForeign}';
					param+='&postalCode='+'${model.postalCode}';
					param+='&newFitDate='+'${model.newFitDate}';
					param+='&ifGoPublic='+'${model.ifGoPublic}';
					param+='&goPublicDate='+'${model.goPublicDate}';
					param+='&maxReserveDate='+'${model.maxReserveDate}';
					param+='&commendExpon='+'${model.commendExpon}';
					param+='&publicPraise='+'${model.publicPraise}';
					param+='&eMail='+'${model.eMail}';
					param+='&ifOnline='+'${model.ifOnline}';
					param+='&switchboard='+'${model.switchboard}';
					param+='&ifHotelAccr='+'${model.ifHotelAccr}';
					param+='&fitKind='+'${model.fitKind}';
					param+='&auditType='+'${model.auditType}';
					param+='&auditKind='+'${model.auditKind}';
					param+='&fullPinyin='+'${model.fullPinyin}';
					param+='&pinyinFir='+'${model.pinyinFir}';
					param+='&ifGroup='+'${model.ifGroup}';
					param+='&groupName='+'${model.groupName}';
					param+='&mainFloors='+'${model.mainFloors}';
					param+='&appendixFloors='+'${model.appendixFloors}';
					param+='&hotelAdvantage='+'${model.hotelAdvantage}';
					param+='&ifTop='+'${model.ifTop}';
					param+='&ifCancelHold='+'${model.ifCancelHold}';
					param+='&enablewaterpool='+'${model.enablewaterpool}';
					param+='&orderChangeFlag='+'${model.orderChangeFlag}';
					param+='&messageSale='+'${model.messageSale}';
					param+='&sourceHotelId='+'${model.sourceHotelId}';
					param+='&sourceType='+'${model.sourceType}';
					param+='&brandid='+'${model.brandid}';
					param+='&hotelImage='+'${model.hotelImage}';
					param+='&service='+'${model.service}';
					param+='&facility='+'${model.facility}';
					param+='&catering='+'${model.catering}';
					param+='&recreation='+'${model.recreation}';
					param+='&creditcard='+'${model.creditcard}';
					param+='&nearby='+'${model.nearby}';
					param+='&street='+'${model.street}';
					param+='&streetaddr='+'${model.streetaddr}';
					param+='&editType='+'${model.editType}';
					param+='&lowerprice='+'${model.lowerprice}';
					param+='&impressdesc='+'${model.impressdesc}';
					param+='&relationid='+'${model.relationid}';
					param+='&tuid='+'${model.tuid}';
					param+='&lowerprice2='+'${model.lowerprice2}';
					param+='&ismajor='+'${model.ismajor}';
					param+='&travelid='+'${model.travelid}';
					param+='&flag='+'${model.flag}';
					param+='&businessAreaName='+'${model.businessAreaName}';
					param+='&highestprice='+'${model.highestprice}';
					param+='&microsms='+'${model.microsms}';
					param+='&cashback='+'${model.cashback}';
					param+='&roomimage='+'${model.roomimage}';
					param+='&roomimagecount='+'${model.roomimagecount}';
					param+='&iftrue='+'${model.iftrue}';
					param+='&curversion='+'${model.curversion}';
					param+='&paymenttype='+'${model.paymenttype}';
			jQuery().ready(function (){
						jQuery("#list1").jqGrid({
						   	url:'${ctx}/com/bxtel/cimtpchtlinfo/controller/cimtpchtlinfot/listdata.do?'+param,
							datatype: "xml",
						   	colNames:[
									'city_code'
									,'district_code'
									,'company_id'
									,'hotel_name'
									,'hotel_name_foreign'
									,'hotel_name_simple'
									,'key_words'
									,'hotel_address'
									,'hotel_type'
									,'hotel_kind'
									,'hotel_level'
									,'hotel_intro'
									,'contact_phone'
									,'contact_fax'
									,'hotel_website'
									,'business_area'
									,'hotel_route'
									,'start_date'
									,'room_number'
									,'pay_way'
									,'longitude'
									,'latitude'
									,'if_foreign'
									,'confer_status'
									,'belong_code'
									,'if_change_send'
									,'external_id'
									,'url_address'
									,'web_number'
									,'web_pass_code'
									,'status'
									,'create_date'
									,'modify_date'
									,'hotel_address_foreign'
									,'postal_code'
									,'new_fit_date'
									,'if_go_public'
									,'go_public_date'
									,'max_reserve_date'
									,'commend_expon'
									,'public_praise'
									,'e_mail'
									,'if_online'
									,'switchboard'
									,'if_hotel_accr'
									,'fit_kind'
									,'audit_type'
									,'audit_kind'
									,'full_pinyin'
									,'pinyin_fir'
									,'if_group'
									,'group_name'
									,'main_floors'
									,'appendix_floors'
									,'hotel_advantage'
									,'if_top'
									,'if_cancel_hold'
									,'蓄水池开关 1 开启 0 关闭'
									,'是否支持变更 1 支持 0 不支持'
									,'短信促销开关  1 开启 0 关闭'
									,'source_hotel_id'
									,'source_type'
									,'brandid'
									,'hotel_image'
									,'service'
									,'设施'
									,'餐饮'
									,'休闲'
									,'creditcard'
									,'nearby'
									,'street'
									,'streetaddr'
									,'编辑类型 1-可编辑（自己维护的酒店） 2-不可编辑（引入的酒店）'
									,'最低价'
									,'酒店印象'
									,'relationid'
									,'tuid'
									,'lowerprice2'
									,'是否主酒店  0-非主酒店 1-主酒店'
									,'所属旅行社 引用bx_hotel_travel_t.travelId'
									,'该酒店是否有匹配数据（0：未匹配，1：已匹配，默认为0）'
									,'business_area_name'
									,'highestprice'
									,'microsms'
									,'最高返'
									,'房型图片'
									,'房型图片数'
									,'是否进入搜索引擎，1=进入，0=不进入，默认为0'
									,'curversion'
									,'All全部 ,SelfPay 现付,Prepay预付'
						   	],
						   	colModel:[
							{name:'cityCode',index:'cityCode', width:90}
							,{name:'districtCode',index:'districtCode', width:90}
							,{name:'companyId',index:'companyId', width:90}
							,{name:'hotelName',index:'hotelName', width:90}
							,{name:'hotelNameForeign',index:'hotelNameForeign', width:90}
							,{name:'hotelNameSimple',index:'hotelNameSimple', width:90}
							,{name:'keyWords',index:'keyWords', width:90}
							,{name:'hotelAddress',index:'hotelAddress', width:90}
							,{name:'hotelType',index:'hotelType', width:90}
							,{name:'hotelKind',index:'hotelKind', width:90}
							,{name:'hotelLevel',index:'hotelLevel', width:90}
							,{name:'hotelIntro',index:'hotelIntro', width:90}
							,{name:'contactPhone',index:'contactPhone', width:90}
							,{name:'contactFax',index:'contactFax', width:90}
							,{name:'hotelWebsite',index:'hotelWebsite', width:90}
							,{name:'businessArea',index:'businessArea', width:90}
							,{name:'hotelRoute',index:'hotelRoute', width:90}
							,{name:'startDate',index:'startDate', width:90}
							,{name:'roomNumber',index:'roomNumber', width:90}
							,{name:'payWay',index:'payWay', width:90}
							,{name:'longitude',index:'longitude', width:90}
							,{name:'latitude',index:'latitude', width:90}
							,{name:'ifForeign',index:'ifForeign', width:90}
							,{name:'conferStatus',index:'conferStatus', width:90}
							,{name:'belongCode',index:'belongCode', width:90}
							,{name:'ifChangeSend',index:'ifChangeSend', width:90}
							,{name:'externalId',index:'externalId', width:90}
							,{name:'urlAddress',index:'urlAddress', width:90}
							,{name:'webNumber',index:'webNumber', width:90}
							,{name:'webPassCode',index:'webPassCode', width:90}
							,{name:'status',index:'status', width:90}
							,{name:'createDate',index:'createDate', width:90}
							,{name:'modifyDate',index:'modifyDate', width:90}
							,{name:'hotelAddressForeign',index:'hotelAddressForeign', width:90}
							,{name:'postalCode',index:'postalCode', width:90}
							,{name:'newFitDate',index:'newFitDate', width:90}
							,{name:'ifGoPublic',index:'ifGoPublic', width:90}
							,{name:'goPublicDate',index:'goPublicDate', width:90}
							,{name:'maxReserveDate',index:'maxReserveDate', width:90}
							,{name:'commendExpon',index:'commendExpon', width:90}
							,{name:'publicPraise',index:'publicPraise', width:90}
							,{name:'eMail',index:'eMail', width:90}
							,{name:'ifOnline',index:'ifOnline', width:90}
							,{name:'switchboard',index:'switchboard', width:90}
							,{name:'ifHotelAccr',index:'ifHotelAccr', width:90}
							,{name:'fitKind',index:'fitKind', width:90}
							,{name:'auditType',index:'auditType', width:90}
							,{name:'auditKind',index:'auditKind', width:90}
							,{name:'fullPinyin',index:'fullPinyin', width:90}
							,{name:'pinyinFir',index:'pinyinFir', width:90}
							,{name:'ifGroup',index:'ifGroup', width:90}
							,{name:'groupName',index:'groupName', width:90}
							,{name:'mainFloors',index:'mainFloors', width:90}
							,{name:'appendixFloors',index:'appendixFloors', width:90}
							,{name:'hotelAdvantage',index:'hotelAdvantage', width:90}
							,{name:'ifTop',index:'ifTop', width:90}
							,{name:'ifCancelHold',index:'ifCancelHold', width:90}
							,{name:'enablewaterpool',index:'enablewaterpool', width:90}
							,{name:'orderChangeFlag',index:'orderChangeFlag', width:90}
							,{name:'messageSale',index:'messageSale', width:90}
							,{name:'sourceHotelId',index:'sourceHotelId', width:90}
							,{name:'sourceType',index:'sourceType', width:90}
							,{name:'brandid',index:'brandid', width:90}
							,{name:'hotelImage',index:'hotelImage', width:90}
							,{name:'service',index:'service', width:90}
							,{name:'facility',index:'facility', width:90}
							,{name:'catering',index:'catering', width:90}
							,{name:'recreation',index:'recreation', width:90}
							,{name:'creditcard',index:'creditcard', width:90}
							,{name:'nearby',index:'nearby', width:90}
							,{name:'street',index:'street', width:90}
							,{name:'streetaddr',index:'streetaddr', width:90}
							,{name:'editType',index:'editType', width:90}
							,{name:'lowerprice',index:'lowerprice', width:90}
							,{name:'impressdesc',index:'impressdesc', width:90}
							,{name:'relationid',index:'relationid', width:90}
							,{name:'tuid',index:'tuid', width:90}
							,{name:'lowerprice2',index:'lowerprice2', width:90}
							,{name:'ismajor',index:'ismajor', width:90}
							,{name:'travelid',index:'travelid', width:90}
							,{name:'flag',index:'flag', width:90}
							,{name:'businessAreaName',index:'businessAreaName', width:90}
							,{name:'highestprice',index:'highestprice', width:90}
							,{name:'microsms',index:'microsms', width:90}
							,{name:'cashback',index:'cashback', width:90}
							,{name:'roomimage',index:'roomimage', width:90}
							,{name:'roomimagecount',index:'roomimagecount', width:90}
							,{name:'iftrue',index:'iftrue', width:90}
							,{name:'curversion',index:'curversion', width:90}
							,{name:'paymenttype',index:'paymenttype', width:90}
						   	],
						   	rowNum:10,
						   	height:300,
						   	autowidth: true,
						   	rowList:[10,20,30],
						   	pager: jQuery('#pager1'),
						   	sortname: 'id',
						    viewrecords: true,
						    sortorder: "desc",
						    caption:"cim_tpc_htl_info_t"
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