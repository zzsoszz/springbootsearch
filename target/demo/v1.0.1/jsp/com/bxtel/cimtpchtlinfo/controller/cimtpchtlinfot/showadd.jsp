<%@ page language="java" pageEncoding="UTF-8"%>  
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
	<title>新增cim_tpc_htl_info_t</title>
	<%@ include file="/com/bxtel/commons/jsplib.jsp"%>
</head>
<body>

<form method="post" action="doadd.do" method="post">  
	
	<table>
			 <tr>
				<td><label for="cityCode">city_code</label></td>
				<td><input name="cityCode"  class="${model.cityCode}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="districtCode">district_code</label></td>
				<td><input name="districtCode"  class="${model.districtCode}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="companyId">company_id</label></td>
				<td><input name="companyId"  class="${model.companyId}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="hotelName">hotel_name</label></td>
				<td><input name="hotelName"  class="${model.hotelName}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="hotelNameForeign">hotel_name_foreign</label></td>
				<td><input name="hotelNameForeign"  class="${model.hotelNameForeign}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="hotelNameSimple">hotel_name_simple</label></td>
				<td><input name="hotelNameSimple"  class="${model.hotelNameSimple}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="keyWords">key_words</label></td>
				<td><input name="keyWords"  class="${model.keyWords}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="hotelAddress">hotel_address</label></td>
				<td><input name="hotelAddress"  class="${model.hotelAddress}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="hotelType">hotel_type</label></td>
				<td><input name="hotelType"  class="${model.hotelType}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="hotelKind">hotel_kind</label></td>
				<td><input name="hotelKind"  class="${model.hotelKind}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="hotelLevel">hotel_level</label></td>
				<td><input name="hotelLevel"  class="${model.hotelLevel}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="hotelIntro">hotel_intro</label></td>
				<td><input name="hotelIntro"  class="${model.hotelIntro}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="contactPhone">contact_phone</label></td>
				<td><input name="contactPhone"  class="${model.contactPhone}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="contactFax">contact_fax</label></td>
				<td><input name="contactFax"  class="${model.contactFax}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="hotelWebsite">hotel_website</label></td>
				<td><input name="hotelWebsite"  class="${model.hotelWebsite}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="businessArea">business_area</label></td>
				<td><input name="businessArea"  class="${model.businessArea}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="hotelRoute">hotel_route</label></td>
				<td><input name="hotelRoute"  class="${model.hotelRoute}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="startDate">start_date</label></td>
				<td><input name="startDate"  class="${model.startDate}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="roomNumber">room_number</label></td>
				<td><input name="roomNumber"  class="${model.roomNumber}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="payWay">pay_way</label></td>
				<td><input name="payWay"  class="${model.payWay}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="longitude">longitude</label></td>
				<td><input name="longitude"  class="${model.longitude}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="latitude">latitude</label></td>
				<td><input name="latitude"  class="${model.latitude}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="ifForeign">if_foreign</label></td>
				<td><input name="ifForeign"  class="${model.ifForeign}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="conferStatus">confer_status</label></td>
				<td><input name="conferStatus"  class="${model.conferStatus}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="belongCode">belong_code</label></td>
				<td><input name="belongCode"  class="${model.belongCode}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="ifChangeSend">if_change_send</label></td>
				<td><input name="ifChangeSend"  class="${model.ifChangeSend}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="externalId">external_id</label></td>
				<td><input name="externalId"  class="${model.externalId}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="urlAddress">url_address</label></td>
				<td><input name="urlAddress"  class="${model.urlAddress}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="webNumber">web_number</label></td>
				<td><input name="webNumber"  class="${model.webNumber}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="webPassCode">web_pass_code</label></td>
				<td><input name="webPassCode"  class="${model.webPassCode}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="status">status</label></td>
				<td><input name="status"  class="${model.status}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="createDate">create_date</label></td>
				<td><input name="createDate"  class="${model.createDate}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="modifyDate">modify_date</label></td>
				<td><input name="modifyDate"  class="${model.modifyDate}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="hotelAddressForeign">hotel_address_foreign</label></td>
				<td><input name="hotelAddressForeign"  class="${model.hotelAddressForeign}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="postalCode">postal_code</label></td>
				<td><input name="postalCode"  class="${model.postalCode}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="newFitDate">new_fit_date</label></td>
				<td><input name="newFitDate"  class="${model.newFitDate}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="ifGoPublic">if_go_public</label></td>
				<td><input name="ifGoPublic"  class="${model.ifGoPublic}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="goPublicDate">go_public_date</label></td>
				<td><input name="goPublicDate"  class="${model.goPublicDate}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="maxReserveDate">max_reserve_date</label></td>
				<td><input name="maxReserveDate"  class="${model.maxReserveDate}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="commendExpon">commend_expon</label></td>
				<td><input name="commendExpon"  class="${model.commendExpon}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="publicPraise">public_praise</label></td>
				<td><input name="publicPraise"  class="${model.publicPraise}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="eMail">e_mail</label></td>
				<td><input name="eMail"  class="${model.eMail}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="ifOnline">if_online</label></td>
				<td><input name="ifOnline"  class="${model.ifOnline}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="switchboard">switchboard</label></td>
				<td><input name="switchboard"  class="${model.switchboard}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="ifHotelAccr">if_hotel_accr</label></td>
				<td><input name="ifHotelAccr"  class="${model.ifHotelAccr}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="fitKind">fit_kind</label></td>
				<td><input name="fitKind"  class="${model.fitKind}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="auditType">audit_type</label></td>
				<td><input name="auditType"  class="${model.auditType}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="auditKind">audit_kind</label></td>
				<td><input name="auditKind"  class="${model.auditKind}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="fullPinyin">full_pinyin</label></td>
				<td><input name="fullPinyin"  class="${model.fullPinyin}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="pinyinFir">pinyin_fir</label></td>
				<td><input name="pinyinFir"  class="${model.pinyinFir}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="ifGroup">if_group</label></td>
				<td><input name="ifGroup"  class="${model.ifGroup}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="groupName">group_name</label></td>
				<td><input name="groupName"  class="${model.groupName}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="mainFloors">main_floors</label></td>
				<td><input name="mainFloors"  class="${model.mainFloors}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="appendixFloors">appendix_floors</label></td>
				<td><input name="appendixFloors"  class="${model.appendixFloors}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="hotelAdvantage">hotel_advantage</label></td>
				<td><input name="hotelAdvantage"  class="${model.hotelAdvantage}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="ifTop">if_top</label></td>
				<td><input name="ifTop"  class="${model.ifTop}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="ifCancelHold">if_cancel_hold</label></td>
				<td><input name="ifCancelHold"  class="${model.ifCancelHold}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="enablewaterpool">蓄水池开关 1 开启 0 关闭</label></td>
				<td><input name="enablewaterpool"  class="${model.enablewaterpool}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="orderChangeFlag">是否支持变更 1 支持 0 不支持</label></td>
				<td><input name="orderChangeFlag"  class="${model.orderChangeFlag}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="messageSale">短信促销开关  1 开启 0 关闭</label></td>
				<td><input name="messageSale"  class="${model.messageSale}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="sourceHotelId">source_hotel_id</label></td>
				<td><input name="sourceHotelId"  class="${model.sourceHotelId}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="sourceType">source_type</label></td>
				<td><input name="sourceType"  class="${model.sourceType}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="brandid">brandid</label></td>
				<td><input name="brandid"  class="${model.brandid}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="hotelImage">hotel_image</label></td>
				<td><input name="hotelImage"  class="${model.hotelImage}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="service">service</label></td>
				<td><input name="service"  class="${model.service}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="facility">设施</label></td>
				<td><input name="facility"  class="${model.facility}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="catering">餐饮</label></td>
				<td><input name="catering"  class="${model.catering}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="recreation">休闲</label></td>
				<td><input name="recreation"  class="${model.recreation}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="creditcard">creditcard</label></td>
				<td><input name="creditcard"  class="${model.creditcard}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="nearby">nearby</label></td>
				<td><input name="nearby"  class="${model.nearby}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="street">street</label></td>
				<td><input name="street"  class="${model.street}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="streetaddr">streetaddr</label></td>
				<td><input name="streetaddr"  class="${model.streetaddr}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="editType">编辑类型 1-可编辑（自己维护的酒店） 2-不可编辑（引入的酒店）</label></td>
				<td><input name="editType"  class="${model.editType}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="lowerprice">最低价</label></td>
				<td><input name="lowerprice"  class="${model.lowerprice}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="impressdesc">酒店印象</label></td>
				<td><input name="impressdesc"  class="${model.impressdesc}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="relationid">relationid</label></td>
				<td><input name="relationid"  class="${model.relationid}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="tuid">tuid</label></td>
				<td><input name="tuid"  class="${model.tuid}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="lowerprice2">lowerprice2</label></td>
				<td><input name="lowerprice2"  class="${model.lowerprice2}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="ismajor">是否主酒店  0-非主酒店 1-主酒店</label></td>
				<td><input name="ismajor"  class="${model.ismajor}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="travelid">所属旅行社 引用bx_hotel_travel_t.travelId</label></td>
				<td><input name="travelid"  class="${model.travelid}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="flag">该酒店是否有匹配数据（0：未匹配，1：已匹配，默认为0）</label></td>
				<td><input name="flag"  class="${model.flag}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="businessAreaName">business_area_name</label></td>
				<td><input name="businessAreaName"  class="${model.businessAreaName}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="highestprice">highestprice</label></td>
				<td><input name="highestprice"  class="${model.highestprice}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="microsms">microsms</label></td>
				<td><input name="microsms"  class="${model.microsms}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="cashback">最高返</label></td>
				<td><input name="cashback"  class="${model.cashback}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="roomimage">房型图片</label></td>
				<td><input name="roomimage"  class="${model.roomimage}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="roomimagecount">房型图片数</label></td>
				<td><input name="roomimagecount"  class="${model.roomimagecount}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="iftrue">是否进入搜索引擎，1=进入，0=不进入，默认为0</label></td>
				<td><input name="iftrue"  class="${model.iftrue}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="curversion">curversion</label></td>
				<td><input name="curversion"  class="${model.curversion}" value="" /></td>
			</tr>
			 <tr>
				<td><label for="paymenttype">All全部 ,SelfPay 现付,Prepay预付</label></td>
				<td><input name="paymenttype"  class="${model.paymenttype}" value="" /></td>
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