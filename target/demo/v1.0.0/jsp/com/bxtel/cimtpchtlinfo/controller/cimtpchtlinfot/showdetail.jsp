<%@ page language="java" pageEncoding="UTF-8"%>  
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
	<title>详情cim_tpc_htl_info_t</title>
	<%@ include file="/com/bxtel/commons/jsplib.jsp"%>
</head>
<body>

<form method="post"  method="post">  
	
	<table>
			 <tr>
				<td><label class="filedname">city_code</label></td>
				<td><label class="fieldvalue">${model.cityCode}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">district_code</label></td>
				<td><label class="fieldvalue">${model.districtCode}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">company_id</label></td>
				<td><label class="fieldvalue">${model.companyId}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">hotel_name</label></td>
				<td><label class="fieldvalue">${model.hotelName}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">hotel_name_foreign</label></td>
				<td><label class="fieldvalue">${model.hotelNameForeign}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">hotel_name_simple</label></td>
				<td><label class="fieldvalue">${model.hotelNameSimple}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">key_words</label></td>
				<td><label class="fieldvalue">${model.keyWords}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">hotel_address</label></td>
				<td><label class="fieldvalue">${model.hotelAddress}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">hotel_type</label></td>
				<td><label class="fieldvalue">${model.hotelType}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">hotel_kind</label></td>
				<td><label class="fieldvalue">${model.hotelKind}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">hotel_level</label></td>
				<td><label class="fieldvalue">${model.hotelLevel}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">hotel_intro</label></td>
				<td><label class="fieldvalue">${model.hotelIntro}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">contact_phone</label></td>
				<td><label class="fieldvalue">${model.contactPhone}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">contact_fax</label></td>
				<td><label class="fieldvalue">${model.contactFax}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">hotel_website</label></td>
				<td><label class="fieldvalue">${model.hotelWebsite}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">business_area</label></td>
				<td><label class="fieldvalue">${model.businessArea}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">hotel_route</label></td>
				<td><label class="fieldvalue">${model.hotelRoute}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">start_date</label></td>
				<td><label class="fieldvalue">${model.startDate}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">room_number</label></td>
				<td><label class="fieldvalue">${model.roomNumber}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">pay_way</label></td>
				<td><label class="fieldvalue">${model.payWay}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">longitude</label></td>
				<td><label class="fieldvalue">${model.longitude}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">latitude</label></td>
				<td><label class="fieldvalue">${model.latitude}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">if_foreign</label></td>
				<td><label class="fieldvalue">${model.ifForeign}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">confer_status</label></td>
				<td><label class="fieldvalue">${model.conferStatus}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">belong_code</label></td>
				<td><label class="fieldvalue">${model.belongCode}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">if_change_send</label></td>
				<td><label class="fieldvalue">${model.ifChangeSend}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">external_id</label></td>
				<td><label class="fieldvalue">${model.externalId}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">url_address</label></td>
				<td><label class="fieldvalue">${model.urlAddress}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">web_number</label></td>
				<td><label class="fieldvalue">${model.webNumber}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">web_pass_code</label></td>
				<td><label class="fieldvalue">${model.webPassCode}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">status</label></td>
				<td><label class="fieldvalue">${model.status}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">create_date</label></td>
				<td><label class="fieldvalue">${model.createDate}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">modify_date</label></td>
				<td><label class="fieldvalue">${model.modifyDate}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">hotel_address_foreign</label></td>
				<td><label class="fieldvalue">${model.hotelAddressForeign}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">postal_code</label></td>
				<td><label class="fieldvalue">${model.postalCode}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">new_fit_date</label></td>
				<td><label class="fieldvalue">${model.newFitDate}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">if_go_public</label></td>
				<td><label class="fieldvalue">${model.ifGoPublic}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">go_public_date</label></td>
				<td><label class="fieldvalue">${model.goPublicDate}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">max_reserve_date</label></td>
				<td><label class="fieldvalue">${model.maxReserveDate}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">commend_expon</label></td>
				<td><label class="fieldvalue">${model.commendExpon}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">public_praise</label></td>
				<td><label class="fieldvalue">${model.publicPraise}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">e_mail</label></td>
				<td><label class="fieldvalue">${model.eMail}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">if_online</label></td>
				<td><label class="fieldvalue">${model.ifOnline}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">switchboard</label></td>
				<td><label class="fieldvalue">${model.switchboard}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">if_hotel_accr</label></td>
				<td><label class="fieldvalue">${model.ifHotelAccr}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">fit_kind</label></td>
				<td><label class="fieldvalue">${model.fitKind}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">audit_type</label></td>
				<td><label class="fieldvalue">${model.auditType}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">audit_kind</label></td>
				<td><label class="fieldvalue">${model.auditKind}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">full_pinyin</label></td>
				<td><label class="fieldvalue">${model.fullPinyin}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">pinyin_fir</label></td>
				<td><label class="fieldvalue">${model.pinyinFir}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">if_group</label></td>
				<td><label class="fieldvalue">${model.ifGroup}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">group_name</label></td>
				<td><label class="fieldvalue">${model.groupName}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">main_floors</label></td>
				<td><label class="fieldvalue">${model.mainFloors}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">appendix_floors</label></td>
				<td><label class="fieldvalue">${model.appendixFloors}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">hotel_advantage</label></td>
				<td><label class="fieldvalue">${model.hotelAdvantage}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">if_top</label></td>
				<td><label class="fieldvalue">${model.ifTop}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">if_cancel_hold</label></td>
				<td><label class="fieldvalue">${model.ifCancelHold}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">蓄水池开关 1 开启 0 关闭</label></td>
				<td><label class="fieldvalue">${model.enablewaterpool}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">是否支持变更 1 支持 0 不支持</label></td>
				<td><label class="fieldvalue">${model.orderChangeFlag}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">短信促销开关  1 开启 0 关闭</label></td>
				<td><label class="fieldvalue">${model.messageSale}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">source_hotel_id</label></td>
				<td><label class="fieldvalue">${model.sourceHotelId}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">source_type</label></td>
				<td><label class="fieldvalue">${model.sourceType}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">brandid</label></td>
				<td><label class="fieldvalue">${model.brandid}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">hotel_image</label></td>
				<td><label class="fieldvalue">${model.hotelImage}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">service</label></td>
				<td><label class="fieldvalue">${model.service}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">设施</label></td>
				<td><label class="fieldvalue">${model.facility}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">餐饮</label></td>
				<td><label class="fieldvalue">${model.catering}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">休闲</label></td>
				<td><label class="fieldvalue">${model.recreation}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">creditcard</label></td>
				<td><label class="fieldvalue">${model.creditcard}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">nearby</label></td>
				<td><label class="fieldvalue">${model.nearby}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">street</label></td>
				<td><label class="fieldvalue">${model.street}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">streetaddr</label></td>
				<td><label class="fieldvalue">${model.streetaddr}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">编辑类型 1-可编辑（自己维护的酒店） 2-不可编辑（引入的酒店）</label></td>
				<td><label class="fieldvalue">${model.editType}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">最低价</label></td>
				<td><label class="fieldvalue">${model.lowerprice}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">酒店印象</label></td>
				<td><label class="fieldvalue">${model.impressdesc}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">relationid</label></td>
				<td><label class="fieldvalue">${model.relationid}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">tuid</label></td>
				<td><label class="fieldvalue">${model.tuid}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">lowerprice2</label></td>
				<td><label class="fieldvalue">${model.lowerprice2}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">是否主酒店  0-非主酒店 1-主酒店</label></td>
				<td><label class="fieldvalue">${model.ismajor}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">所属旅行社 引用bx_hotel_travel_t.travelId</label></td>
				<td><label class="fieldvalue">${model.travelid}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">该酒店是否有匹配数据（0：未匹配，1：已匹配，默认为0）</label></td>
				<td><label class="fieldvalue">${model.flag}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">business_area_name</label></td>
				<td><label class="fieldvalue">${model.businessAreaName}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">highestprice</label></td>
				<td><label class="fieldvalue">${model.highestprice}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">microsms</label></td>
				<td><label class="fieldvalue">${model.microsms}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">最高返</label></td>
				<td><label class="fieldvalue">${model.cashback}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">房型图片</label></td>
				<td><label class="fieldvalue">${model.roomimage}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">房型图片数</label></td>
				<td><label class="fieldvalue">${model.roomimagecount}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">是否进入搜索引擎，1=进入，0=不进入，默认为0</label></td>
				<td><label class="fieldvalue">${model.iftrue}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">curversion</label></td>
				<td><label class="fieldvalue">${model.curversion}</label></td>
			</tr>
			 <tr>
				<td><label class="filedname">All全部 ,SelfPay 现付,Prepay预付</label></td>
				<td><label class="fieldvalue">${model.paymenttype}</label></td>
			</tr>
	</table>		

</form>
</body>
</html>