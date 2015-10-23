<%@ page language="java" pageEncoding="UTF-8"%>  
<html>
    <head>
    	<title>查询qrtz_triggers_v</title>
    	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    	
    	<%@ include file="/com/bxtel/commons/jsplib.jsp"%>
		<link rel="stylesheet" type="text/css" href="${ctx}/css/task/main.css" />
	    <script type="text/javascript"  src="${ctx}/js/jquery/jquery-1.6.2.min.js"></script>
		<script src="${ctx}/js/jquery/jquery-validate/jquery.validate.js" type="text/javascript"></script>
		<script src="${ctx}/js/jquery/jquery-validate/jquery.metadata.js" type="text/javascript"></script>
		<script src="${ctx}/js/jquery/jquery-validate/jquery.validate.util.js" type="text/javascript"></script>
		<script src="${ctx}/js/jquery/jquery-validate/localization/messages_cn.js" type="text/javascript"></script>
		<script src="${ctx}/js/iframe_resize/js/iframe.js" type="text/javascript"></script>
        <script type="text/javascript">

        	$(document).ready(
        			 function(){
        				 
	     		     		$("#form1").validate(
	     		     			{
	     		    		 		//debug:false,
	     		    				//errorClass: "error",
	     		    				//validClass: "check",
	     		    				//focusInvalid: true,
	     		    				//focusCleanup:true;
	     		    				onkeyup: true,
	     		    				//errorElement: "div",
	     		    		 		submitHandler: function(form)
	     		    		  		{ 
	     		    						alert("bak");
	     		    				}
	     		    			}
	     		     		);
	     		       		
	     		     }
        	
        	);
		   
		   
    	   function sys_add()
		   {
		   		document.forms["form1"].action="${ctx}/com/bxtel/cimtpchtlinfo/controller/cimtpchtlinfot/showadd.do";
		   		document.forms["form1"].target="list_iframe";
		   		document.forms["form1"].submit();
		   }
		   
		   function sys_list()
		   {
		   		document.forms["form1"].action="${ctx}/com/bxtel/cimtpchtlinfo/controller/cimtpchtlinfot/showlist.do";
		   		document.forms["form1"].target="list_iframe";
		   		document.forms["form1"].submit();
		   }
		</script>
    </head>

    <body>
		<div class="tabBlock">
			<div class="editBlock">
			
			<form id="form1" action="${ctx}/com/bxtel/cimtpchtlinfo/controller/cimtpchtlinfot/showlist.do" target="list_iframe">
			
							<table id="table1" >
							    <tr>
							        <td colspan="4" class="subtitle">&nbsp;&nbsp;&nbsp;
							            <label>查询条件</label>
							        </td>
							    </tr>
							    <tbody>

											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>city_code</label>
									            </th>
									            <td>
									                <input id="cityCode" name="cityCode" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>district_code</label>
									            </th>
									            <td>
									                <input id="districtCode" name="districtCode" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>hotel_name</label>
									            </th>
									            <td>
									                <input id="hotelName" name="hotelName" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>hotel_name_foreign</label>
									            </th>
									            <td>
									                <input id="hotelNameForeign" name="hotelNameForeign" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>hotel_name_simple</label>
									            </th>
									            <td>
									                <input id="hotelNameSimple" name="hotelNameSimple" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>key_words</label>
									            </th>
									            <td>
									                <input id="keyWords" name="keyWords" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>hotel_address</label>
									            </th>
									            <td>
									                <input id="hotelAddress" name="hotelAddress" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>hotel_type</label>
									            </th>
									            <td>
									                <input id="hotelType" name="hotelType" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>hotel_kind</label>
									            </th>
									            <td>
									                <input id="hotelKind" name="hotelKind" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>hotel_level</label>
									            </th>
									            <td>
									                <input id="hotelLevel" name="hotelLevel" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>hotel_intro</label>
									            </th>
									            <td>
									                <input id="hotelIntro" name="hotelIntro" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>contact_phone</label>
									            </th>
									            <td>
									                <input id="contactPhone" name="contactPhone" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>contact_fax</label>
									            </th>
									            <td>
									                <input id="contactFax" name="contactFax" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>hotel_website</label>
									            </th>
									            <td>
									                <input id="hotelWebsite" name="hotelWebsite" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>business_area</label>
									            </th>
									            <td>
									                <input id="businessArea" name="businessArea" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>hotel_route</label>
									            </th>
									            <td>
									                <input id="hotelRoute" name="hotelRoute" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>start_date</label>
									            </th>
									            <td>
									                <input id="startDate" name="startDate" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>room_number</label>
									            </th>
									            <td>
									                <input id="roomNumber" name="roomNumber" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>pay_way</label>
									            </th>
									            <td>
									                <input id="payWay" name="payWay" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>longitude</label>
									            </th>
									            <td>
									                <input id="longitude" name="longitude" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>latitude</label>
									            </th>
									            <td>
									                <input id="latitude" name="latitude" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>if_foreign</label>
									            </th>
									            <td>
									                <input id="ifForeign" name="ifForeign" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>confer_status</label>
									            </th>
									            <td>
									                <input id="conferStatus" name="conferStatus" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>belong_code</label>
									            </th>
									            <td>
									                <input id="belongCode" name="belongCode" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>if_change_send</label>
									            </th>
									            <td>
									                <input id="ifChangeSend" name="ifChangeSend" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>external_id</label>
									            </th>
									            <td>
									                <input id="externalId" name="externalId" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>url_address</label>
									            </th>
									            <td>
									                <input id="urlAddress" name="urlAddress" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>web_number</label>
									            </th>
									            <td>
									                <input id="webNumber" name="webNumber" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>web_pass_code</label>
									            </th>
									            <td>
									                <input id="webPassCode" name="webPassCode" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>status</label>
									            </th>
									            <td>
									                <input id="status" name="status" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>create_date</label>
									            </th>
									            <td>
									                <input id="createDate" name="createDate" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>modify_date</label>
									            </th>
									            <td>
									                <input id="modifyDate" name="modifyDate" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>hotel_address_foreign</label>
									            </th>
									            <td>
									                <input id="hotelAddressForeign" name="hotelAddressForeign" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>postal_code</label>
									            </th>
									            <td>
									                <input id="postalCode" name="postalCode" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>new_fit_date</label>
									            </th>
									            <td>
									                <input id="newFitDate" name="newFitDate" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>if_go_public</label>
									            </th>
									            <td>
									                <input id="ifGoPublic" name="ifGoPublic" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>go_public_date</label>
									            </th>
									            <td>
									                <input id="goPublicDate" name="goPublicDate" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>max_reserve_date</label>
									            </th>
									            <td>
									                <input id="maxReserveDate" name="maxReserveDate" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>commend_expon</label>
									            </th>
									            <td>
									                <input id="commendExpon" name="commendExpon" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>public_praise</label>
									            </th>
									            <td>
									                <input id="publicPraise" name="publicPraise" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>e_mail</label>
									            </th>
									            <td>
									                <input id="eMail" name="eMail" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>if_online</label>
									            </th>
									            <td>
									                <input id="ifOnline" name="ifOnline" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>switchboard</label>
									            </th>
									            <td>
									                <input id="switchboard" name="switchboard" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>if_hotel_accr</label>
									            </th>
									            <td>
									                <input id="ifHotelAccr" name="ifHotelAccr" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>fit_kind</label>
									            </th>
									            <td>
									                <input id="fitKind" name="fitKind" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>audit_type</label>
									            </th>
									            <td>
									                <input id="auditType" name="auditType" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>audit_kind</label>
									            </th>
									            <td>
									                <input id="auditKind" name="auditKind" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>full_pinyin</label>
									            </th>
									            <td>
									                <input id="fullPinyin" name="fullPinyin" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>pinyin_fir</label>
									            </th>
									            <td>
									                <input id="pinyinFir" name="pinyinFir" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>if_group</label>
									            </th>
									            <td>
									                <input id="ifGroup" name="ifGroup" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>group_name</label>
									            </th>
									            <td>
									                <input id="groupName" name="groupName" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>main_floors</label>
									            </th>
									            <td>
									                <input id="mainFloors" name="mainFloors" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>appendix_floors</label>
									            </th>
									            <td>
									                <input id="appendixFloors" name="appendixFloors" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>hotel_advantage</label>
									            </th>
									            <td>
									                <input id="hotelAdvantage" name="hotelAdvantage" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>if_top</label>
									            </th>
									            <td>
									                <input id="ifTop" name="ifTop" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>if_cancel_hold</label>
									            </th>
									            <td>
									                <input id="ifCancelHold" name="ifCancelHold" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>蓄水池开关 1 开启 0 关闭</label>
									            </th>
									            <td>
									                <input id="enablewaterpool" name="enablewaterpool" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>是否支持变更 1 支持 0 不支持</label>
									            </th>
									            <td>
									                <input id="orderChangeFlag" name="orderChangeFlag" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>短信促销开关  1 开启 0 关闭</label>
									            </th>
									            <td>
									                <input id="messageSale" name="messageSale" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>source_hotel_id</label>
									            </th>
									            <td>
									                <input id="sourceHotelId" name="sourceHotelId" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>source_type</label>
									            </th>
									            <td>
									                <input id="sourceType" name="sourceType" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>brandid</label>
									            </th>
									            <td>
									                <input id="brandid" name="brandid" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>hotel_image</label>
									            </th>
									            <td>
									                <input id="hotelImage" name="hotelImage" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>service</label>
									            </th>
									            <td>
									                <input id="service" name="service" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>设施</label>
									            </th>
									            <td>
									                <input id="facility" name="facility" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>餐饮</label>
									            </th>
									            <td>
									                <input id="catering" name="catering" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>休闲</label>
									            </th>
									            <td>
									                <input id="recreation" name="recreation" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>creditcard</label>
									            </th>
									            <td>
									                <input id="creditcard" name="creditcard" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>nearby</label>
									            </th>
									            <td>
									                <input id="nearby" name="nearby" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>street</label>
									            </th>
									            <td>
									                <input id="street" name="street" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>streetaddr</label>
									            </th>
									            <td>
									                <input id="streetaddr" name="streetaddr" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>编辑类型 1-可编辑（自己维护的酒店） 2-不可编辑（引入的酒店）</label>
									            </th>
									            <td>
									                <input id="editType" name="editType" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>最低价</label>
									            </th>
									            <td>
									                <input id="lowerprice" name="lowerprice" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>酒店印象</label>
									            </th>
									            <td>
									                <input id="impressdesc" name="impressdesc" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>relationid</label>
									            </th>
									            <td>
									                <input id="relationid" name="relationid" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>tuid</label>
									            </th>
									            <td>
									                <input id="tuid" name="tuid" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>lowerprice2</label>
									            </th>
									            <td>
									                <input id="lowerprice2" name="lowerprice2" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>是否主酒店  0-非主酒店 1-主酒店</label>
									            </th>
									            <td>
									                <input id="ismajor" name="ismajor" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>所属旅行社 引用bx_hotel_travel_t.travelId</label>
									            </th>
									            <td>
									                <input id="travelid" name="travelid" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>该酒店是否有匹配数据（0：未匹配，1：已匹配，默认为0）</label>
									            </th>
									            <td>
									                <input id="flag" name="flag" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>business_area_name</label>
									            </th>
									            <td>
									                <input id="businessAreaName" name="businessAreaName" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>highestprice</label>
									            </th>
									            <td>
									                <input id="highestprice" name="highestprice" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>microsms</label>
									            </th>
									            <td>
									                <input id="microsms" name="microsms" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>最高返</label>
									            </th>
									            <td>
									                <input id="cashback" name="cashback" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>房型图片</label>
									            </th>
									            <td>
									                <input id="roomimage" name="roomimage" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>房型图片数</label>
									            </th>
									            <td>
									                <input id="roomimagecount" name="roomimagecount" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>是否进入搜索引擎，1=进入，0=不进入，默认为0</label>
									            </th>
									            <td>
									                <input id="iftrue" name="iftrue" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>curversion</label>
									            </th>
									            <td>
									                <input id="curversion" name="curversion" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>All全部 ,SelfPay 现付,Prepay预付</label>
									            </th>
									            <td>
									                <input id="paymenttype" name="paymenttype" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
							    </tbody>
							</table>
							
							<div class="ctrlBar" >
						        &nbsp;&nbsp;<input  type="button" onclick="sys_list();"  class="inputButton" value="查询"/>
								&nbsp;&nbsp;<input  type="reset"  class="inputButton" value="重置"/>
								&nbsp;&nbsp;<input  type="button" onclick="sys_add();"  class="inputButton" value="新增"/>
						    </div>
			    
			</form>
			
			</div>
			</div>
			
			
			<div class="tabBlock">
			<div class="editBlock">
						<iframe name="list_iframe" id="list_iframe" style="display:block;" width="100%" height="0px"  scrolling="no"  frameborder="0" >
						</iframe>
			</div>
			</div>

    </body>


</html>