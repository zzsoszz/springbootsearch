<%@ page language="java" pageEncoding="UTF-8"%>  
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
	<title>编辑cim_tpc_htl_info_t</title>
	<%@ include file="/com/bxtel/commons/jsplib.jsp"%>
</head>
<body>

<form method="post" action="doupdate.do" method="post">  
	
	<table>
			 <tr>
				<td><label for="cityCode">city_code</label></td>
				<td><input name="cityCode"  class="${model.cityCode}" value="${model.cityCode}" /></td>
			</tr>
			 <tr>
				<td><label for="districtCode">district_code</label></td>
				<td><input name="districtCode"  class="${model.districtCode}" value="${model.districtCode}" /></td>
			</tr>
			 <tr>
				<td><label for="companyId">company_id</label></td>
				<td><input name="companyId"  class="${model.companyId}" value="${model.companyId}" /></td>
			</tr>
			 <tr>
				<td><label for="hotelName">hotel_name</label></td>
				<td><input name="hotelName"  class="${model.hotelName}" value="${model.hotelName}" /></td>
			</tr>
			 <tr>
				<td><label for="hotelNameForeign">hotel_name_foreign</label></td>
				<td><input name="hotelNameForeign"  class="${model.hotelNameForeign}" value="${model.hotelNameForeign}" /></td>
			</tr>
			 <tr>
				<td><label for="hotelNameSimple">hotel_name_simple</label></td>
				<td><input name="hotelNameSimple"  class="${model.hotelNameSimple}" value="${model.hotelNameSimple}" /></td>
			</tr>
			 <tr>
				<td><label for="keyWords">key_words</label></td>
				<td><input name="keyWords"  class="${model.keyWords}" value="${model.keyWords}" /></td>
			</tr>
			 <tr>
				<td><label for="hotelAddress">hotel_address</label></td>
				<td><input name="hotelAddress"  class="${model.hotelAddress}" value="${model.hotelAddress}" /></td>
			</tr>
			 <tr>
				<td><label for="hotelType">hotel_type</label></td>
				<td><input name="hotelType"  class="${model.hotelType}" value="${model.hotelType}" /></td>
			</tr>
			 <tr>
				<td><label for="hotelKind">hotel_kind</label></td>
				<td><input name="hotelKind"  class="${model.hotelKind}" value="${model.hotelKind}" /></td>
			</tr>
			 <tr>
				<td><label for="hotelLevel">hotel_level</label></td>
				<td><input name="hotelLevel"  class="${model.hotelLevel}" value="${model.hotelLevel}" /></td>
			</tr>
			 <tr>
				<td><label for="hotelIntro">hotel_intro</label></td>
				<td><input name="hotelIntro"  class="${model.hotelIntro}" value="${model.hotelIntro}" /></td>
			</tr>
			 <tr>
				<td><label for="contactPhone">contact_phone</label></td>
				<td><input name="contactPhone"  class="${model.contactPhone}" value="${model.contactPhone}" /></td>
			</tr>
			 <tr>
				<td><label for="contactFax">contact_fax</label></td>
				<td><input name="contactFax"  class="${model.contactFax}" value="${model.contactFax}" /></td>
			</tr>
			 <tr>
				<td><label for="hotelWebsite">hotel_website</label></td>
				<td><input name="hotelWebsite"  class="${model.hotelWebsite}" value="${model.hotelWebsite}" /></td>
			</tr>
			 <tr>
				<td><label for="businessArea">business_area</label></td>
				<td><input name="businessArea"  class="${model.businessArea}" value="${model.businessArea}" /></td>
			</tr>
			 <tr>
				<td><label for="hotelRoute">hotel_route</label></td>
				<td><input name="hotelRoute"  class="${model.hotelRoute}" value="${model.hotelRoute}" /></td>
			</tr>
			 <tr>
				<td><label for="startDate">start_date</label></td>
				<td><input name="startDate"  class="${model.startDate}" value="${model.startDate}" /></td>
			</tr>
			 <tr>
				<td><label for="roomNumber">room_number</label></td>
				<td><input name="roomNumber"  class="${model.roomNumber}" value="${model.roomNumber}" /></td>
			</tr>
			 <tr>
				<td><label for="payWay">pay_way</label></td>
				<td><input name="payWay"  class="${model.payWay}" value="${model.payWay}" /></td>
			</tr>
			 <tr>
				<td><label for="longitude">longitude</label></td>
				<td><input name="longitude"  class="${model.longitude}" value="${model.longitude}" /></td>
			</tr>
			 <tr>
				<td><label for="latitude">latitude</label></td>
				<td><input name="latitude"  class="${model.latitude}" value="${model.latitude}" /></td>
			</tr>
			 <tr>
				<td><label for="ifForeign">if_foreign</label></td>
				<td><input name="ifForeign"  class="${model.ifForeign}" value="${model.ifForeign}" /></td>
			</tr>
			 <tr>
				<td><label for="conferStatus">confer_status</label></td>
				<td><input name="conferStatus"  class="${model.conferStatus}" value="${model.conferStatus}" /></td>
			</tr>
			 <tr>
				<td><label for="belongCode">belong_code</label></td>
				<td><input name="belongCode"  class="${model.belongCode}" value="${model.belongCode}" /></td>
			</tr>
			 <tr>
				<td><label for="ifChangeSend">if_change_send</label></td>
				<td><input name="ifChangeSend"  class="${model.ifChangeSend}" value="${model.ifChangeSend}" /></td>
			</tr>
			 <tr>
				<td><label for="externalId">external_id</label></td>
				<td><input name="externalId"  class="${model.externalId}" value="${model.externalId}" /></td>
			</tr>
			 <tr>
				<td><label for="urlAddress">url_address</label></td>
				<td><input name="urlAddress"  class="${model.urlAddress}" value="${model.urlAddress}" /></td>
			</tr>
			 <tr>
				<td><label for="webNumber">web_number</label></td>
				<td><input name="webNumber"  class="${model.webNumber}" value="${model.webNumber}" /></td>
			</tr>
			 <tr>
				<td><label for="webPassCode">web_pass_code</label></td>
				<td><input name="webPassCode"  class="${model.webPassCode}" value="${model.webPassCode}" /></td>
			</tr>
			 <tr>
				<td><label for="status">status</label></td>
				<td><input name="status"  class="${model.status}" value="${model.status}" /></td>
			</tr>
			 <tr>
				<td><label for="createDate">create_date</label></td>
				<td><input name="createDate"  class="${model.createDate}" value="${model.createDate}" /></td>
			</tr>
			 <tr>
				<td><label for="modifyDate">modify_date</label></td>
				<td><input name="modifyDate"  class="${model.modifyDate}" value="${model.modifyDate}" /></td>
			</tr>
			 <tr>
				<td><label for="hotelAddressForeign">hotel_address_foreign</label></td>
				<td><input name="hotelAddressForeign"  class="${model.hotelAddressForeign}" value="${model.hotelAddressForeign}" /></td>
			</tr>
			 <tr>
				<td><label for="postalCode">postal_code</label></td>
				<td><input name="postalCode"  class="${model.postalCode}" value="${model.postalCode}" /></td>
			</tr>
			 <tr>
				<td><label for="newFitDate">new_fit_date</label></td>
				<td><input name="newFitDate"  class="${model.newFitDate}" value="${model.newFitDate}" /></td>
			</tr>
			 <tr>
				<td><label for="ifGoPublic">if_go_public</label></td>
				<td><input name="ifGoPublic"  class="${model.ifGoPublic}" value="${model.ifGoPublic}" /></td>
			</tr>
			 <tr>
				<td><label for="goPublicDate">go_public_date</label></td>
				<td><input name="goPublicDate"  class="${model.goPublicDate}" value="${model.goPublicDate}" /></td>
			</tr>
			 <tr>
				<td><label for="maxReserveDate">max_reserve_date</label></td>
				<td><input name="maxReserveDate"  class="${model.maxReserveDate}" value="${model.maxReserveDate}" /></td>
			</tr>
			 <tr>
				<td><label for="commendExpon">commend_expon</label></td>
				<td><input name="commendExpon"  class="${model.commendExpon}" value="${model.commendExpon}" /></td>
			</tr>
			 <tr>
				<td><label for="publicPraise">public_praise</label></td>
				<td><input name="publicPraise"  class="${model.publicPraise}" value="${model.publicPraise}" /></td>
			</tr>
			 <tr>
				<td><label for="eMail">e_mail</label></td>
				<td><input name="eMail"  class="${model.eMail}" value="${model.eMail}" /></td>
			</tr>
			 <tr>
				<td><label for="ifOnline">if_online</label></td>
				<td><input name="ifOnline"  class="${model.ifOnline}" value="${model.ifOnline}" /></td>
			</tr>
			 <tr>
				<td><label for="switchboard">switchboard</label></td>
				<td><input name="switchboard"  class="${model.switchboard}" value="${model.switchboard}" /></td>
			</tr>
			 <tr>
				<td><label for="ifHotelAccr">if_hotel_accr</label></td>
				<td><input name="ifHotelAccr"  class="${model.ifHotelAccr}" value="${model.ifHotelAccr}" /></td>
			</tr>
			 <tr>
				<td><label for="fitKind">fit_kind</label></td>
				<td><input name="fitKind"  class="${model.fitKind}" value="${model.fitKind}" /></td>
			</tr>
			 <tr>
				<td><label for="auditType">audit_type</label></td>
				<td><input name="auditType"  class="${model.auditType}" value="${model.auditType}" /></td>
			</tr>
			 <tr>
				<td><label for="auditKind">audit_kind</label></td>
				<td><input name="auditKind"  class="${model.auditKind}" value="${model.auditKind}" /></td>
			</tr>
			 <tr>
				<td><label for="fullPinyin">full_pinyin</label></td>
				<td><input name="fullPinyin"  class="${model.fullPinyin}" value="${model.fullPinyin}" /></td>
			</tr>
			 <tr>
				<td><label for="pinyinFir">pinyin_fir</label></td>
				<td><input name="pinyinFir"  class="${model.pinyinFir}" value="${model.pinyinFir}" /></td>
			</tr>
			 <tr>
				<td><label for="ifGroup">if_group</label></td>
				<td><input name="ifGroup"  class="${model.ifGroup}" value="${model.ifGroup}" /></td>
			</tr>
			 <tr>
				<td><label for="groupName">group_name</label></td>
				<td><input name="groupName"  class="${model.groupName}" value="${model.groupName}" /></td>
			</tr>
			 <tr>
				<td><label for="mainFloors">main_floors</label></td>
				<td><input name="mainFloors"  class="${model.mainFloors}" value="${model.mainFloors}" /></td>
			</tr>
			 <tr>
				<td><label for="appendixFloors">appendix_floors</label></td>
				<td><input name="appendixFloors"  class="${model.appendixFloors}" value="${model.appendixFloors}" /></td>
			</tr>
			 <tr>
				<td><label for="hotelAdvantage">hotel_advantage</label></td>
				<td><input name="hotelAdvantage"  class="${model.hotelAdvantage}" value="${model.hotelAdvantage}" /></td>
			</tr>
			 <tr>
				<td><label for="ifTop">if_top</label></td>
				<td><input name="ifTop"  class="${model.ifTop}" value="${model.ifTop}" /></td>
			</tr>
			 <tr>
				<td><label for="ifCancelHold">if_cancel_hold</label></td>
				<td><input name="ifCancelHold"  class="${model.ifCancelHold}" value="${model.ifCancelHold}" /></td>
			</tr>
			 <tr>
				<td><label for="enablewaterpool">蓄水池开关 1 开启 0 关闭</label></td>
				<td><input name="enablewaterpool"  class="${model.enablewaterpool}" value="${model.enablewaterpool}" /></td>
			</tr>
			 <tr>
				<td><label for="orderChangeFlag">是否支持变更 1 支持 0 不支持</label></td>
				<td><input name="orderChangeFlag"  class="${model.orderChangeFlag}" value="${model.orderChangeFlag}" /></td>
			</tr>
			 <tr>
				<td><label for="messageSale">短信促销开关  1 开启 0 关闭</label></td>
				<td><input name="messageSale"  class="${model.messageSale}" value="${model.messageSale}" /></td>
			</tr>
			 <tr>
				<td><label for="sourceHotelId">source_hotel_id</label></td>
				<td><input name="sourceHotelId"  class="${model.sourceHotelId}" value="${model.sourceHotelId}" /></td>
			</tr>
			 <tr>
				<td><label for="sourceType">source_type</label></td>
				<td><input name="sourceType"  class="${model.sourceType}" value="${model.sourceType}" /></td>
			</tr>
			 <tr>
				<td><label for="brandid">brandid</label></td>
				<td><input name="brandid"  class="${model.brandid}" value="${model.brandid}" /></td>
			</tr>
			 <tr>
				<td><label for="hotelImage">hotel_image</label></td>
				<td><input name="hotelImage"  class="${model.hotelImage}" value="${model.hotelImage}" /></td>
			</tr>
			 <tr>
				<td><label for="service">service</label></td>
				<td><input name="service"  class="${model.service}" value="${model.service}" /></td>
			</tr>
			 <tr>
				<td><label for="facility">设施</label></td>
				<td><input name="facility"  class="${model.facility}" value="${model.facility}" /></td>
			</tr>
			 <tr>
				<td><label for="catering">餐饮</label></td>
				<td><input name="catering"  class="${model.catering}" value="${model.catering}" /></td>
			</tr>
			 <tr>
				<td><label for="recreation">休闲</label></td>
				<td><input name="recreation"  class="${model.recreation}" value="${model.recreation}" /></td>
			</tr>
			 <tr>
				<td><label for="creditcard">creditcard</label></td>
				<td><input name="creditcard"  class="${model.creditcard}" value="${model.creditcard}" /></td>
			</tr>
			 <tr>
				<td><label for="nearby">nearby</label></td>
				<td><input name="nearby"  class="${model.nearby}" value="${model.nearby}" /></td>
			</tr>
			 <tr>
				<td><label for="street">street</label></td>
				<td><input name="street"  class="${model.street}" value="${model.street}" /></td>
			</tr>
			 <tr>
				<td><label for="streetaddr">streetaddr</label></td>
				<td><input name="streetaddr"  class="${model.streetaddr}" value="${model.streetaddr}" /></td>
			</tr>
			 <tr>
				<td><label for="editType">编辑类型 1-可编辑（自己维护的酒店） 2-不可编辑（引入的酒店）</label></td>
				<td><input name="editType"  class="${model.editType}" value="${model.editType}" /></td>
			</tr>
			 <tr>
				<td><label for="lowerprice">最低价</label></td>
				<td><input name="lowerprice"  class="${model.lowerprice}" value="${model.lowerprice}" /></td>
			</tr>
			 <tr>
				<td><label for="impressdesc">酒店印象</label></td>
				<td><input name="impressdesc"  class="${model.impressdesc}" value="${model.impressdesc}" /></td>
			</tr>
			 <tr>
				<td><label for="relationid">relationid</label></td>
				<td><input name="relationid"  class="${model.relationid}" value="${model.relationid}" /></td>
			</tr>
			 <tr>
				<td><label for="tuid">tuid</label></td>
				<td><input name="tuid"  class="${model.tuid}" value="${model.tuid}" /></td>
			</tr>
			 <tr>
				<td><label for="lowerprice2">lowerprice2</label></td>
				<td><input name="lowerprice2"  class="${model.lowerprice2}" value="${model.lowerprice2}" /></td>
			</tr>
			 <tr>
				<td><label for="ismajor">是否主酒店  0-非主酒店 1-主酒店</label></td>
				<td><input name="ismajor"  class="${model.ismajor}" value="${model.ismajor}" /></td>
			</tr>
			 <tr>
				<td><label for="travelid">所属旅行社 引用bx_hotel_travel_t.travelId</label></td>
				<td><input name="travelid"  class="${model.travelid}" value="${model.travelid}" /></td>
			</tr>
			 <tr>
				<td><label for="flag">该酒店是否有匹配数据（0：未匹配，1：已匹配，默认为0）</label></td>
				<td><input name="flag"  class="${model.flag}" value="${model.flag}" /></td>
			</tr>
			 <tr>
				<td><label for="businessAreaName">business_area_name</label></td>
				<td><input name="businessAreaName"  class="${model.businessAreaName}" value="${model.businessAreaName}" /></td>
			</tr>
			 <tr>
				<td><label for="highestprice">highestprice</label></td>
				<td><input name="highestprice"  class="${model.highestprice}" value="${model.highestprice}" /></td>
			</tr>
			 <tr>
				<td><label for="microsms">microsms</label></td>
				<td><input name="microsms"  class="${model.microsms}" value="${model.microsms}" /></td>
			</tr>
			 <tr>
				<td><label for="cashback">最高返</label></td>
				<td><input name="cashback"  class="${model.cashback}" value="${model.cashback}" /></td>
			</tr>
			 <tr>
				<td><label for="roomimage">房型图片</label></td>
				<td><input name="roomimage"  class="${model.roomimage}" value="${model.roomimage}" /></td>
			</tr>
			 <tr>
				<td><label for="roomimagecount">房型图片数</label></td>
				<td><input name="roomimagecount"  class="${model.roomimagecount}" value="${model.roomimagecount}" /></td>
			</tr>
			 <tr>
				<td><label for="iftrue">是否进入搜索引擎，1=进入，0=不进入，默认为0</label></td>
				<td><input name="iftrue"  class="${model.iftrue}" value="${model.iftrue}" /></td>
			</tr>
			 <tr>
				<td><label for="curversion">curversion</label></td>
				<td><input name="curversion"  class="${model.curversion}" value="${model.curversion}" /></td>
			</tr>
			 <tr>
				<td><label for="paymenttype">All全部 ,SelfPay 现付,Prepay预付</label></td>
				<td><input name="paymenttype"  class="${model.paymenttype}" value="${model.paymenttype}" /></td>
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