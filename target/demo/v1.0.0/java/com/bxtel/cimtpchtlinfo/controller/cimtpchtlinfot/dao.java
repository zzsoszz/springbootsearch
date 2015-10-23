package com.bxtel.cimtpchtlinfo.dao;


import com.bxtel.cimtpchtlinfo.*;
import com.bxtel.cimtpchtlinfo.model.*;
import dinamica.*;
import dinamica.util.*;
import dinamica.util.StringUtil;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.sql.DataSource;
import javax.annotation.Resource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import org.springframework.jdbc.core.*;
import org.springframework.stereotype.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.datasource.DataSourceUtils;
import org.springframework.jdbc.support.JdbcUtils;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import com.googlecode.ehcache.annotations.*;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import oracle.sql.ROWID;
import com.bxtel.exception.DAOException;

@Repository("CimTpcHtlInfoTDAO")
public class CimTpcHtlInfoTDAO
{

	@Resource
	public JdbcTemplate jdbcTemplate;

	@Resource
	public NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	private static final Log logger = LogFactory.getLog(CimTpcHtlInfoTDAO.class);
	
	//@TriggersRemove(cacheName = "CimTpcHtlInfoTDAO", when = When.AFTER_METHOD_INVOCATION, removeAll = true)
	public CimTpcHtlInfoT add(CimTpcHtlInfoT model) throws DAOException  {
		String rowid=addThenReturnRowid(model);
		return  getCimTpcHtlInfoTByRowId(rowid);
	}
	
	
	public String addThenReturnRowid(CimTpcHtlInfoT model) throws DAOException  {
		model.setCurversion(0L);
		model.setCompanyId(getSeq());
		
		StringBuffer sql = new StringBuffer("insert into cim_tpc_htl_info_t("
				+" city_code "
				+",district_code "
				+",company_id "
				+",hotel_name "
				+",hotel_name_foreign "
				+",hotel_name_simple "
				+",key_words "
				+",hotel_address "
				+",hotel_type "
				+",hotel_kind "
				+",hotel_level "
				+",hotel_intro "
				+",contact_phone "
				+",contact_fax "
				+",hotel_website "
				+",business_area "
				+",hotel_route "
				+",start_date "
				+",room_number "
				+",pay_way "
				+",longitude "
				+",latitude "
				+",if_foreign "
				+",confer_status "
				+",belong_code "
				+",if_change_send "
				+",external_id "
				+",url_address "
				+",web_number "
				+",web_pass_code "
				+",status "
				+",create_date "
				+",modify_date "
				+",hotel_address_foreign "
				+",postal_code "
				+",new_fit_date "
				+",if_go_public "
				+",go_public_date "
				+",max_reserve_date "
				+",commend_expon "
				+",public_praise "
				+",e_mail "
				+",if_online "
				+",switchboard "
				+",if_hotel_accr "
				+",fit_kind "
				+",audit_type "
				+",audit_kind "
				+",full_pinyin "
				+",pinyin_fir "
				+",if_group "
				+",group_name "
				+",main_floors "
				+",appendix_floors "
				+",hotel_advantage "
				+",if_top "
				+",if_cancel_hold "
				+",enablewaterpool "
				+",order_change_flag "
				+",message_sale "
				+",source_hotel_id "
				+",source_type "
				+",brandid "
				+",hotel_image "
				+",service "
				+",facility "
				+",catering "
				+",recreation "
				+",creditcard "
				+",nearby "
				+",street "
				+",streetaddr "
				+",edit_type "
				+",lowerprice "
				+",impressdesc "
				+",relationid "
				+",tuid "
				+",lowerprice2 "
				+",ismajor "
				+",travelid "
				+",flag "
				+",business_area_name "
				+",highestprice "
				+",microsms "
				+",cashback "
				+",roomimage "
				+",roomimagecount "
				+",iftrue "
				+",curversion "
				+",paymenttype "
		
		+") values("
		
					+":cityCode"
					+",:districtCode"
					+",:companyId"
					+",:hotelName"
					+",:hotelNameForeign"
					+",:hotelNameSimple"
					+",:keyWords"
					+",:hotelAddress"
					+",:hotelType"
					+",:hotelKind"
					+",:hotelLevel"
					+",:hotelIntro"
					+",:contactPhone"
					+",:contactFax"
					+",:hotelWebsite"
					+",:businessArea"
					+",:hotelRoute"
					+",:startDate"
					+",:roomNumber"
					+",:payWay"
					+",:longitude"
					+",:latitude"
					+",:ifForeign"
					+",:conferStatus"
					+",:belongCode"
					+",:ifChangeSend"
					+",:externalId"
					+",:urlAddress"
					+",:webNumber"
					+",:webPassCode"
					+",:status"
					+",:createDate"
					+",:modifyDate"
					+",:hotelAddressForeign"
					+",:postalCode"
					+",:newFitDate"
					+",:ifGoPublic"
					+",:goPublicDate"
					+",:maxReserveDate"
					+",:commendExpon"
					+",:publicPraise"
					+",:eMail"
					+",:ifOnline"
					+",:switchboard"
					+",:ifHotelAccr"
					+",:fitKind"
					+",:auditType"
					+",:auditKind"
					+",:fullPinyin"
					+",:pinyinFir"
					+",:ifGroup"
					+",:groupName"
					+",:mainFloors"
					+",:appendixFloors"
					+",:hotelAdvantage"
					+",:ifTop"
					+",:ifCancelHold"
					+",:enablewaterpool"
					+",:orderChangeFlag"
					+",:messageSale"
					+",:sourceHotelId"
					+",:sourceType"
					+",:brandid"
					+",:hotelImage"
					+",:service"
					+",:facility"
					+",:catering"
					+",:recreation"
					+",:creditcard"
					+",:nearby"
					+",:street"
					+",:streetaddr"
					+",:editType"
					+",:lowerprice"
					+",:impressdesc"
					+",:relationid"
					+",:tuid"
					+",:lowerprice2"
					+",:ismajor"
					+",:travelid"
					+",:flag"
					+",:businessAreaName"
					+",:highestprice"
					+",:microsms"
					+",:cashback"
					+",:roomimage"
					+",:roomimagecount"
					+",:iftrue"
					+",:curversion"
					+",:paymenttype"
		  + ")" );
		  
		KeyHolder keyHolder = new GeneratedKeyHolder();
		SqlParameterSource sps=new BeanPropertySqlParameterSource(model);
		namedParameterJdbcTemplate.update(sql.toString(), sps,keyHolder);
		oracle.sql.ROWID id=(ROWID) keyHolder.getKeys().get("ROWID");
		return id.stringValue();
	}
	
	
	public CimTpcHtlInfoT getCimTpcHtlInfoTByRowId(String rowid) throws DAOException {
		StringBuffer sql=new StringBuffer("select t.*,rowid as crowid from cim_tpc_htl_info_t t where rowid='"+rowid+"'");
		List<CimTpcHtlInfoT> modellist = jdbcTemplate.query(sql.toString(),new BeanPropertyRowMapper(CimTpcHtlInfoT.class));
		if(modellist!=null && modellist.size()==1)
		{
			return  modellist.get(0);
		}else{
			throw new DAOException("rowid is wrong:"+rowid);
		}
	}
	
	
	//@TriggersRemove(cacheName = "CimTpcHtlInfoTDAO", when = When.AFTER_METHOD_INVOCATION, removeAll = true)
	public int deleteByCoud(CimTpcHtlInfoT model) {
		
		StringBuffer sql=new StringBuffer("delete from cim_tpc_htl_info_t where 1=1 ");
		if(model.getCityCode()!=null)
		{
			sql.append(" and city_code=:cityCode ");
		}
		if(model.getDistrictCode()!=null)
		{
			sql.append(" and district_code=:districtCode ");
		}
		if(model.getCompanyId()!=null)
		{
			sql.append(" and company_id=:companyId ");
		}
		if(model.getHotelName()!=null)
		{
			sql.append(" and hotel_name=:hotelName ");
		}
		if(model.getHotelNameForeign()!=null)
		{
			sql.append(" and hotel_name_foreign=:hotelNameForeign ");
		}
		if(model.getHotelNameSimple()!=null)
		{
			sql.append(" and hotel_name_simple=:hotelNameSimple ");
		}
		if(model.getKeyWords()!=null)
		{
			sql.append(" and key_words=:keyWords ");
		}
		if(model.getHotelAddress()!=null)
		{
			sql.append(" and hotel_address=:hotelAddress ");
		}
		if(model.getHotelType()!=null)
		{
			sql.append(" and hotel_type=:hotelType ");
		}
		if(model.getHotelKind()!=null)
		{
			sql.append(" and hotel_kind=:hotelKind ");
		}
		if(model.getHotelLevel()!=null)
		{
			sql.append(" and hotel_level=:hotelLevel ");
		}
		if(model.getHotelIntro()!=null)
		{
			sql.append(" and hotel_intro=:hotelIntro ");
		}
		if(model.getContactPhone()!=null)
		{
			sql.append(" and contact_phone=:contactPhone ");
		}
		if(model.getContactFax()!=null)
		{
			sql.append(" and contact_fax=:contactFax ");
		}
		if(model.getHotelWebsite()!=null)
		{
			sql.append(" and hotel_website=:hotelWebsite ");
		}
		if(model.getBusinessArea()!=null)
		{
			sql.append(" and business_area=:businessArea ");
		}
		if(model.getHotelRoute()!=null)
		{
			sql.append(" and hotel_route=:hotelRoute ");
		}
		if(model.getStartDate()!=null)
		{
			sql.append(" and start_date=:startDate ");
		}
		if(model.getRoomNumber()!=null)
		{
			sql.append(" and room_number=:roomNumber ");
		}
		if(model.getPayWay()!=null)
		{
			sql.append(" and pay_way=:payWay ");
		}
		if(model.getLongitude()!=null)
		{
			sql.append(" and longitude=:longitude ");
		}
		if(model.getLatitude()!=null)
		{
			sql.append(" and latitude=:latitude ");
		}
		if(model.getIfForeign()!=null)
		{
			sql.append(" and if_foreign=:ifForeign ");
		}
		if(model.getConferStatus()!=null)
		{
			sql.append(" and confer_status=:conferStatus ");
		}
		if(model.getBelongCode()!=null)
		{
			sql.append(" and belong_code=:belongCode ");
		}
		if(model.getIfChangeSend()!=null)
		{
			sql.append(" and if_change_send=:ifChangeSend ");
		}
		if(model.getExternalId()!=null)
		{
			sql.append(" and external_id=:externalId ");
		}
		if(model.getUrlAddress()!=null)
		{
			sql.append(" and url_address=:urlAddress ");
		}
		if(model.getWebNumber()!=null)
		{
			sql.append(" and web_number=:webNumber ");
		}
		if(model.getWebPassCode()!=null)
		{
			sql.append(" and web_pass_code=:webPassCode ");
		}
		if(model.getStatus()!=null)
		{
			sql.append(" and status=:status ");
		}
		if(model.getCreateDate()!=null)
		{
			sql.append(" and create_date=:createDate ");
		}
		if(model.getModifyDate()!=null)
		{
			sql.append(" and modify_date=:modifyDate ");
		}
		if(model.getHotelAddressForeign()!=null)
		{
			sql.append(" and hotel_address_foreign=:hotelAddressForeign ");
		}
		if(model.getPostalCode()!=null)
		{
			sql.append(" and postal_code=:postalCode ");
		}
		if(model.getNewFitDate()!=null)
		{
			sql.append(" and new_fit_date=:newFitDate ");
		}
		if(model.getIfGoPublic()!=null)
		{
			sql.append(" and if_go_public=:ifGoPublic ");
		}
		if(model.getGoPublicDate()!=null)
		{
			sql.append(" and go_public_date=:goPublicDate ");
		}
		if(model.getMaxReserveDate()!=null)
		{
			sql.append(" and max_reserve_date=:maxReserveDate ");
		}
		if(model.getCommendExpon()!=null)
		{
			sql.append(" and commend_expon=:commendExpon ");
		}
		if(model.getPublicPraise()!=null)
		{
			sql.append(" and public_praise=:publicPraise ");
		}
		if(model.getEMail()!=null)
		{
			sql.append(" and e_mail=:eMail ");
		}
		if(model.getIfOnline()!=null)
		{
			sql.append(" and if_online=:ifOnline ");
		}
		if(model.getSwitchboard()!=null)
		{
			sql.append(" and switchboard=:switchboard ");
		}
		if(model.getIfHotelAccr()!=null)
		{
			sql.append(" and if_hotel_accr=:ifHotelAccr ");
		}
		if(model.getFitKind()!=null)
		{
			sql.append(" and fit_kind=:fitKind ");
		}
		if(model.getAuditType()!=null)
		{
			sql.append(" and audit_type=:auditType ");
		}
		if(model.getAuditKind()!=null)
		{
			sql.append(" and audit_kind=:auditKind ");
		}
		if(model.getFullPinyin()!=null)
		{
			sql.append(" and full_pinyin=:fullPinyin ");
		}
		if(model.getPinyinFir()!=null)
		{
			sql.append(" and pinyin_fir=:pinyinFir ");
		}
		if(model.getIfGroup()!=null)
		{
			sql.append(" and if_group=:ifGroup ");
		}
		if(model.getGroupName()!=null)
		{
			sql.append(" and group_name=:groupName ");
		}
		if(model.getMainFloors()!=null)
		{
			sql.append(" and main_floors=:mainFloors ");
		}
		if(model.getAppendixFloors()!=null)
		{
			sql.append(" and appendix_floors=:appendixFloors ");
		}
		if(model.getHotelAdvantage()!=null)
		{
			sql.append(" and hotel_advantage=:hotelAdvantage ");
		}
		if(model.getIfTop()!=null)
		{
			sql.append(" and if_top=:ifTop ");
		}
		if(model.getIfCancelHold()!=null)
		{
			sql.append(" and if_cancel_hold=:ifCancelHold ");
		}
		if(model.getEnablewaterpool()!=null)
		{
			sql.append(" and enablewaterpool=:enablewaterpool ");
		}
		if(model.getOrderChangeFlag()!=null)
		{
			sql.append(" and order_change_flag=:orderChangeFlag ");
		}
		if(model.getMessageSale()!=null)
		{
			sql.append(" and message_sale=:messageSale ");
		}
		if(model.getSourceHotelId()!=null)
		{
			sql.append(" and source_hotel_id=:sourceHotelId ");
		}
		if(model.getSourceType()!=null)
		{
			sql.append(" and source_type=:sourceType ");
		}
		if(model.getBrandid()!=null)
		{
			sql.append(" and brandid=:brandid ");
		}
		if(model.getHotelImage()!=null)
		{
			sql.append(" and hotel_image=:hotelImage ");
		}
		if(model.getService()!=null)
		{
			sql.append(" and service=:service ");
		}
		if(model.getFacility()!=null)
		{
			sql.append(" and facility=:facility ");
		}
		if(model.getCatering()!=null)
		{
			sql.append(" and catering=:catering ");
		}
		if(model.getRecreation()!=null)
		{
			sql.append(" and recreation=:recreation ");
		}
		if(model.getCreditcard()!=null)
		{
			sql.append(" and creditcard=:creditcard ");
		}
		if(model.getNearby()!=null)
		{
			sql.append(" and nearby=:nearby ");
		}
		if(model.getStreet()!=null)
		{
			sql.append(" and street=:street ");
		}
		if(model.getStreetaddr()!=null)
		{
			sql.append(" and streetaddr=:streetaddr ");
		}
		if(model.getEditType()!=null)
		{
			sql.append(" and edit_type=:editType ");
		}
		if(model.getLowerprice()!=null)
		{
			sql.append(" and lowerprice=:lowerprice ");
		}
		if(model.getImpressdesc()!=null)
		{
			sql.append(" and impressdesc=:impressdesc ");
		}
		if(model.getRelationid()!=null)
		{
			sql.append(" and relationid=:relationid ");
		}
		if(model.getTuid()!=null)
		{
			sql.append(" and tuid=:tuid ");
		}
		if(model.getLowerprice2()!=null)
		{
			sql.append(" and lowerprice2=:lowerprice2 ");
		}
		if(model.getIsmajor()!=null)
		{
			sql.append(" and ismajor=:ismajor ");
		}
		if(model.getTravelid()!=null)
		{
			sql.append(" and travelid=:travelid ");
		}
		if(model.getFlag()!=null)
		{
			sql.append(" and flag=:flag ");
		}
		if(model.getBusinessAreaName()!=null)
		{
			sql.append(" and business_area_name=:businessAreaName ");
		}
		if(model.getHighestprice()!=null)
		{
			sql.append(" and highestprice=:highestprice ");
		}
		if(model.getMicrosms()!=null)
		{
			sql.append(" and microsms=:microsms ");
		}
		if(model.getCashback()!=null)
		{
			sql.append(" and cashback=:cashback ");
		}
		if(model.getRoomimage()!=null)
		{
			sql.append(" and roomimage=:roomimage ");
		}
		if(model.getRoomimagecount()!=null)
		{
			sql.append(" and roomimagecount=:roomimagecount ");
		}
		if(model.getIftrue()!=null)
		{
			sql.append(" and iftrue=:iftrue ");
		}
		if(model.getCurversion()!=null)
		{
			sql.append(" and curversion=:curversion ");
		}
		if(model.getPaymenttype()!=null)
		{
			sql.append(" and paymenttype=:paymenttype ");
		}
		
		SqlParameterSource sps=new BeanPropertySqlParameterSource(model);
		return namedParameterJdbcTemplate.update(sql.toString(), sps);
	}
	
	//@TriggersRemove(cacheName = "CimTpcHtlInfoTDAO", when = When.AFTER_METHOD_INVOCATION, removeAll = true)
	public int deleteByExact(CimTpcHtlInfoT model) throws DAOException  {
		
		StringBuffer sql=new StringBuffer("delete from cim_tpc_htl_info_t where 1=1 ");
		sql.append(" and city_code=:cityCode ");
		sql.append(" and district_code=:districtCode ");
		sql.append(" and company_id=:companyId ");
		sql.append(" and hotel_name=:hotelName ");
		sql.append(" and hotel_name_foreign=:hotelNameForeign ");
		sql.append(" and hotel_name_simple=:hotelNameSimple ");
		sql.append(" and key_words=:keyWords ");
		sql.append(" and hotel_address=:hotelAddress ");
		sql.append(" and hotel_type=:hotelType ");
		sql.append(" and hotel_kind=:hotelKind ");
		sql.append(" and hotel_level=:hotelLevel ");
		sql.append(" and hotel_intro=:hotelIntro ");
		sql.append(" and contact_phone=:contactPhone ");
		sql.append(" and contact_fax=:contactFax ");
		sql.append(" and hotel_website=:hotelWebsite ");
		sql.append(" and business_area=:businessArea ");
		sql.append(" and hotel_route=:hotelRoute ");
		sql.append(" and start_date=:startDate ");
		sql.append(" and room_number=:roomNumber ");
		sql.append(" and pay_way=:payWay ");
		sql.append(" and longitude=:longitude ");
		sql.append(" and latitude=:latitude ");
		sql.append(" and if_foreign=:ifForeign ");
		sql.append(" and confer_status=:conferStatus ");
		sql.append(" and belong_code=:belongCode ");
		sql.append(" and if_change_send=:ifChangeSend ");
		sql.append(" and external_id=:externalId ");
		sql.append(" and url_address=:urlAddress ");
		sql.append(" and web_number=:webNumber ");
		sql.append(" and web_pass_code=:webPassCode ");
		sql.append(" and status=:status ");
		sql.append(" and create_date=:createDate ");
		sql.append(" and modify_date=:modifyDate ");
		sql.append(" and hotel_address_foreign=:hotelAddressForeign ");
		sql.append(" and postal_code=:postalCode ");
		sql.append(" and new_fit_date=:newFitDate ");
		sql.append(" and if_go_public=:ifGoPublic ");
		sql.append(" and go_public_date=:goPublicDate ");
		sql.append(" and max_reserve_date=:maxReserveDate ");
		sql.append(" and commend_expon=:commendExpon ");
		sql.append(" and public_praise=:publicPraise ");
		sql.append(" and e_mail=:eMail ");
		sql.append(" and if_online=:ifOnline ");
		sql.append(" and switchboard=:switchboard ");
		sql.append(" and if_hotel_accr=:ifHotelAccr ");
		sql.append(" and fit_kind=:fitKind ");
		sql.append(" and audit_type=:auditType ");
		sql.append(" and audit_kind=:auditKind ");
		sql.append(" and full_pinyin=:fullPinyin ");
		sql.append(" and pinyin_fir=:pinyinFir ");
		sql.append(" and if_group=:ifGroup ");
		sql.append(" and group_name=:groupName ");
		sql.append(" and main_floors=:mainFloors ");
		sql.append(" and appendix_floors=:appendixFloors ");
		sql.append(" and hotel_advantage=:hotelAdvantage ");
		sql.append(" and if_top=:ifTop ");
		sql.append(" and if_cancel_hold=:ifCancelHold ");
		sql.append(" and enablewaterpool=:enablewaterpool ");
		sql.append(" and order_change_flag=:orderChangeFlag ");
		sql.append(" and message_sale=:messageSale ");
		sql.append(" and source_hotel_id=:sourceHotelId ");
		sql.append(" and source_type=:sourceType ");
		sql.append(" and brandid=:brandid ");
		sql.append(" and hotel_image=:hotelImage ");
		sql.append(" and service=:service ");
		sql.append(" and facility=:facility ");
		sql.append(" and catering=:catering ");
		sql.append(" and recreation=:recreation ");
		sql.append(" and creditcard=:creditcard ");
		sql.append(" and nearby=:nearby ");
		sql.append(" and street=:street ");
		sql.append(" and streetaddr=:streetaddr ");
		sql.append(" and edit_type=:editType ");
		sql.append(" and lowerprice=:lowerprice ");
		sql.append(" and impressdesc=:impressdesc ");
		sql.append(" and relationid=:relationid ");
		sql.append(" and tuid=:tuid ");
		sql.append(" and lowerprice2=:lowerprice2 ");
		sql.append(" and ismajor=:ismajor ");
		sql.append(" and travelid=:travelid ");
		sql.append(" and flag=:flag ");
		sql.append(" and business_area_name=:businessAreaName ");
		sql.append(" and highestprice=:highestprice ");
		sql.append(" and microsms=:microsms ");
		sql.append(" and cashback=:cashback ");
		sql.append(" and roomimage=:roomimage ");
		sql.append(" and roomimagecount=:roomimagecount ");
		sql.append(" and iftrue=:iftrue ");
		sql.append(" and curversion=:curversion ");
		sql.append(" and paymenttype=:paymenttype ");
		
		SqlParameterSource sps=new BeanPropertySqlParameterSource(model);
		return namedParameterJdbcTemplate.update(sql.toString(), sps);
	}
	
	//@TriggersRemove(cacheName = "CimTpcHtlInfoTDAO", when = When.AFTER_METHOD_INVOCATION, removeAll = true)
	public int deleteByRowId(String rowid)  throws DAOException  {
		if(StringUtil.isEmptyOrWhitespace(rowid))
		{
			throw new DAOException("rowid is null");
		}
		StringBuffer sql=new StringBuffer("delete from cim_tpc_htl_info_t where rowid='"+rowid+"'");
		return jdbcTemplate.update(sql.toString());
	}
	
	//@TriggersRemove(cacheName = "CimTpcHtlInfoTDAO", when = When.AFTER_METHOD_INVOCATION, removeAll = true)
	public int updateExactByRowId(CimTpcHtlInfoT model)  throws DAOException  {
		if(StringUtil.isEmptyOrWhitespace(model.getCrowid()))
		{
			throw new DAOException("rowid is null");
		}
		StringBuffer sql=new StringBuffer("update  cim_tpc_htl_info_t set ");
						sql.append("city_code=:cityCode,");
						sql.append("district_code=:districtCode,");
						sql.append("hotel_name=:hotelName,");
						sql.append("hotel_name_foreign=:hotelNameForeign,");
						sql.append("hotel_name_simple=:hotelNameSimple,");
						sql.append("key_words=:keyWords,");
						sql.append("hotel_address=:hotelAddress,");
						sql.append("hotel_type=:hotelType,");
						sql.append("hotel_kind=:hotelKind,");
						sql.append("hotel_level=:hotelLevel,");
						sql.append("hotel_intro=:hotelIntro,");
						sql.append("contact_phone=:contactPhone,");
						sql.append("contact_fax=:contactFax,");
						sql.append("hotel_website=:hotelWebsite,");
						sql.append("business_area=:businessArea,");
						sql.append("hotel_route=:hotelRoute,");
						sql.append("start_date=:startDate,");
						sql.append("room_number=:roomNumber,");
						sql.append("pay_way=:payWay,");
						sql.append("longitude=:longitude,");
						sql.append("latitude=:latitude,");
						sql.append("if_foreign=:ifForeign,");
						sql.append("confer_status=:conferStatus,");
						sql.append("belong_code=:belongCode,");
						sql.append("if_change_send=:ifChangeSend,");
						sql.append("external_id=:externalId,");
						sql.append("url_address=:urlAddress,");
						sql.append("web_number=:webNumber,");
						sql.append("web_pass_code=:webPassCode,");
						sql.append("status=:status,");
						sql.append("create_date=:createDate,");
						sql.append("modify_date=:modifyDate,");
						sql.append("hotel_address_foreign=:hotelAddressForeign,");
						sql.append("postal_code=:postalCode,");
						sql.append("new_fit_date=:newFitDate,");
						sql.append("if_go_public=:ifGoPublic,");
						sql.append("go_public_date=:goPublicDate,");
						sql.append("max_reserve_date=:maxReserveDate,");
						sql.append("commend_expon=:commendExpon,");
						sql.append("public_praise=:publicPraise,");
						sql.append("e_mail=:eMail,");
						sql.append("if_online=:ifOnline,");
						sql.append("switchboard=:switchboard,");
						sql.append("if_hotel_accr=:ifHotelAccr,");
						sql.append("fit_kind=:fitKind,");
						sql.append("audit_type=:auditType,");
						sql.append("audit_kind=:auditKind,");
						sql.append("full_pinyin=:fullPinyin,");
						sql.append("pinyin_fir=:pinyinFir,");
						sql.append("if_group=:ifGroup,");
						sql.append("group_name=:groupName,");
						sql.append("main_floors=:mainFloors,");
						sql.append("appendix_floors=:appendixFloors,");
						sql.append("hotel_advantage=:hotelAdvantage,");
						sql.append("if_top=:ifTop,");
						sql.append("if_cancel_hold=:ifCancelHold,");
						sql.append("enablewaterpool=:enablewaterpool,");
						sql.append("order_change_flag=:orderChangeFlag,");
						sql.append("message_sale=:messageSale,");
						sql.append("source_hotel_id=:sourceHotelId,");
						sql.append("source_type=:sourceType,");
						sql.append("brandid=:brandid,");
						sql.append("hotel_image=:hotelImage,");
						sql.append("service=:service,");
						sql.append("facility=:facility,");
						sql.append("catering=:catering,");
						sql.append("recreation=:recreation,");
						sql.append("creditcard=:creditcard,");
						sql.append("nearby=:nearby,");
						sql.append("street=:street,");
						sql.append("streetaddr=:streetaddr,");
						sql.append("edit_type=:editType,");
						sql.append("lowerprice=:lowerprice,");
						sql.append("impressdesc=:impressdesc,");
						sql.append("relationid=:relationid,");
						sql.append("tuid=:tuid,");
						sql.append("lowerprice2=:lowerprice2,");
						sql.append("ismajor=:ismajor,");
						sql.append("travelid=:travelid,");
						sql.append("flag=:flag,");
						sql.append("business_area_name=:businessAreaName,");
						sql.append("highestprice=:highestprice,");
						sql.append("microsms=:microsms,");
						sql.append("cashback=:cashback,");
						sql.append("roomimage=:roomimage,");
						sql.append("roomimagecount=:roomimagecount,");
						sql.append("iftrue=:iftrue,");
						sql.append("curversion=curversion +1,");
						sql.append("paymenttype=:paymenttype");
		sql=new StringBuffer(StringUtil.removeLastWith(sql.toString(),","));
		sql.append(" where rowid='"+model.getCrowid()+"'  and curversion=:curversion ");
		SqlParameterSource sps=new BeanPropertySqlParameterSource(model);
		return namedParameterJdbcTemplate.update(sql.toString(), sps);
	}
	
	//@TriggersRemove(cacheName = "CimTpcHtlInfoTDAO", when = When.AFTER_METHOD_INVOCATION, removeAll = true)
	public int updateCoudByRowId(CimTpcHtlInfoT model)  throws DAOException  {
		if(StringUtil.isEmptyOrWhitespace(model.getCrowid()))
		{
			throw new DAOException("rowid is null");
		}
		StringBuffer sql=new StringBuffer("update  cim_tpc_htl_info_t set ");
					if(model.getCityCode()!=null)
					{
						sql.append("city_code=:cityCode ,");
					}
					if(model.getDistrictCode()!=null)
					{
						sql.append("district_code=:districtCode ,");
					}
					if(model.getHotelName()!=null)
					{
						sql.append("hotel_name=:hotelName ,");
					}
					if(model.getHotelNameForeign()!=null)
					{
						sql.append("hotel_name_foreign=:hotelNameForeign ,");
					}
					if(model.getHotelNameSimple()!=null)
					{
						sql.append("hotel_name_simple=:hotelNameSimple ,");
					}
					if(model.getKeyWords()!=null)
					{
						sql.append("key_words=:keyWords ,");
					}
					if(model.getHotelAddress()!=null)
					{
						sql.append("hotel_address=:hotelAddress ,");
					}
					if(model.getHotelType()!=null)
					{
						sql.append("hotel_type=:hotelType ,");
					}
					if(model.getHotelKind()!=null)
					{
						sql.append("hotel_kind=:hotelKind ,");
					}
					if(model.getHotelLevel()!=null)
					{
						sql.append("hotel_level=:hotelLevel ,");
					}
					if(model.getHotelIntro()!=null)
					{
						sql.append("hotel_intro=:hotelIntro ,");
					}
					if(model.getContactPhone()!=null)
					{
						sql.append("contact_phone=:contactPhone ,");
					}
					if(model.getContactFax()!=null)
					{
						sql.append("contact_fax=:contactFax ,");
					}
					if(model.getHotelWebsite()!=null)
					{
						sql.append("hotel_website=:hotelWebsite ,");
					}
					if(model.getBusinessArea()!=null)
					{
						sql.append("business_area=:businessArea ,");
					}
					if(model.getHotelRoute()!=null)
					{
						sql.append("hotel_route=:hotelRoute ,");
					}
					if(model.getStartDate()!=null)
					{
						sql.append("start_date=:startDate ,");
					}
					if(model.getRoomNumber()!=null)
					{
						sql.append("room_number=:roomNumber ,");
					}
					if(model.getPayWay()!=null)
					{
						sql.append("pay_way=:payWay ,");
					}
					if(model.getLongitude()!=null)
					{
						sql.append("longitude=:longitude ,");
					}
					if(model.getLatitude()!=null)
					{
						sql.append("latitude=:latitude ,");
					}
					if(model.getIfForeign()!=null)
					{
						sql.append("if_foreign=:ifForeign ,");
					}
					if(model.getConferStatus()!=null)
					{
						sql.append("confer_status=:conferStatus ,");
					}
					if(model.getBelongCode()!=null)
					{
						sql.append("belong_code=:belongCode ,");
					}
					if(model.getIfChangeSend()!=null)
					{
						sql.append("if_change_send=:ifChangeSend ,");
					}
					if(model.getExternalId()!=null)
					{
						sql.append("external_id=:externalId ,");
					}
					if(model.getUrlAddress()!=null)
					{
						sql.append("url_address=:urlAddress ,");
					}
					if(model.getWebNumber()!=null)
					{
						sql.append("web_number=:webNumber ,");
					}
					if(model.getWebPassCode()!=null)
					{
						sql.append("web_pass_code=:webPassCode ,");
					}
					if(model.getStatus()!=null)
					{
						sql.append("status=:status ,");
					}
					if(model.getCreateDate()!=null)
					{
						sql.append("create_date=:createDate ,");
					}
					if(model.getModifyDate()!=null)
					{
						sql.append("modify_date=:modifyDate ,");
					}
					if(model.getHotelAddressForeign()!=null)
					{
						sql.append("hotel_address_foreign=:hotelAddressForeign ,");
					}
					if(model.getPostalCode()!=null)
					{
						sql.append("postal_code=:postalCode ,");
					}
					if(model.getNewFitDate()!=null)
					{
						sql.append("new_fit_date=:newFitDate ,");
					}
					if(model.getIfGoPublic()!=null)
					{
						sql.append("if_go_public=:ifGoPublic ,");
					}
					if(model.getGoPublicDate()!=null)
					{
						sql.append("go_public_date=:goPublicDate ,");
					}
					if(model.getMaxReserveDate()!=null)
					{
						sql.append("max_reserve_date=:maxReserveDate ,");
					}
					if(model.getCommendExpon()!=null)
					{
						sql.append("commend_expon=:commendExpon ,");
					}
					if(model.getPublicPraise()!=null)
					{
						sql.append("public_praise=:publicPraise ,");
					}
					if(model.getEMail()!=null)
					{
						sql.append("e_mail=:eMail ,");
					}
					if(model.getIfOnline()!=null)
					{
						sql.append("if_online=:ifOnline ,");
					}
					if(model.getSwitchboard()!=null)
					{
						sql.append("switchboard=:switchboard ,");
					}
					if(model.getIfHotelAccr()!=null)
					{
						sql.append("if_hotel_accr=:ifHotelAccr ,");
					}
					if(model.getFitKind()!=null)
					{
						sql.append("fit_kind=:fitKind ,");
					}
					if(model.getAuditType()!=null)
					{
						sql.append("audit_type=:auditType ,");
					}
					if(model.getAuditKind()!=null)
					{
						sql.append("audit_kind=:auditKind ,");
					}
					if(model.getFullPinyin()!=null)
					{
						sql.append("full_pinyin=:fullPinyin ,");
					}
					if(model.getPinyinFir()!=null)
					{
						sql.append("pinyin_fir=:pinyinFir ,");
					}
					if(model.getIfGroup()!=null)
					{
						sql.append("if_group=:ifGroup ,");
					}
					if(model.getGroupName()!=null)
					{
						sql.append("group_name=:groupName ,");
					}
					if(model.getMainFloors()!=null)
					{
						sql.append("main_floors=:mainFloors ,");
					}
					if(model.getAppendixFloors()!=null)
					{
						sql.append("appendix_floors=:appendixFloors ,");
					}
					if(model.getHotelAdvantage()!=null)
					{
						sql.append("hotel_advantage=:hotelAdvantage ,");
					}
					if(model.getIfTop()!=null)
					{
						sql.append("if_top=:ifTop ,");
					}
					if(model.getIfCancelHold()!=null)
					{
						sql.append("if_cancel_hold=:ifCancelHold ,");
					}
					if(model.getEnablewaterpool()!=null)
					{
						sql.append("enablewaterpool=:enablewaterpool ,");
					}
					if(model.getOrderChangeFlag()!=null)
					{
						sql.append("order_change_flag=:orderChangeFlag ,");
					}
					if(model.getMessageSale()!=null)
					{
						sql.append("message_sale=:messageSale ,");
					}
					if(model.getSourceHotelId()!=null)
					{
						sql.append("source_hotel_id=:sourceHotelId ,");
					}
					if(model.getSourceType()!=null)
					{
						sql.append("source_type=:sourceType ,");
					}
					if(model.getBrandid()!=null)
					{
						sql.append("brandid=:brandid ,");
					}
					if(model.getHotelImage()!=null)
					{
						sql.append("hotel_image=:hotelImage ,");
					}
					if(model.getService()!=null)
					{
						sql.append("service=:service ,");
					}
					if(model.getFacility()!=null)
					{
						sql.append("facility=:facility ,");
					}
					if(model.getCatering()!=null)
					{
						sql.append("catering=:catering ,");
					}
					if(model.getRecreation()!=null)
					{
						sql.append("recreation=:recreation ,");
					}
					if(model.getCreditcard()!=null)
					{
						sql.append("creditcard=:creditcard ,");
					}
					if(model.getNearby()!=null)
					{
						sql.append("nearby=:nearby ,");
					}
					if(model.getStreet()!=null)
					{
						sql.append("street=:street ,");
					}
					if(model.getStreetaddr()!=null)
					{
						sql.append("streetaddr=:streetaddr ,");
					}
					if(model.getEditType()!=null)
					{
						sql.append("edit_type=:editType ,");
					}
					if(model.getLowerprice()!=null)
					{
						sql.append("lowerprice=:lowerprice ,");
					}
					if(model.getImpressdesc()!=null)
					{
						sql.append("impressdesc=:impressdesc ,");
					}
					if(model.getRelationid()!=null)
					{
						sql.append("relationid=:relationid ,");
					}
					if(model.getTuid()!=null)
					{
						sql.append("tuid=:tuid ,");
					}
					if(model.getLowerprice2()!=null)
					{
						sql.append("lowerprice2=:lowerprice2 ,");
					}
					if(model.getIsmajor()!=null)
					{
						sql.append("ismajor=:ismajor ,");
					}
					if(model.getTravelid()!=null)
					{
						sql.append("travelid=:travelid ,");
					}
					if(model.getFlag()!=null)
					{
						sql.append("flag=:flag ,");
					}
					if(model.getBusinessAreaName()!=null)
					{
						sql.append("business_area_name=:businessAreaName ,");
					}
					if(model.getHighestprice()!=null)
					{
						sql.append("highestprice=:highestprice ,");
					}
					if(model.getMicrosms()!=null)
					{
						sql.append("microsms=:microsms ,");
					}
					if(model.getCashback()!=null)
					{
						sql.append("cashback=:cashback ,");
					}
					if(model.getRoomimage()!=null)
					{
						sql.append("roomimage=:roomimage ,");
					}
					if(model.getRoomimagecount()!=null)
					{
						sql.append("roomimagecount=:roomimagecount ,");
					}
					if(model.getIftrue()!=null)
					{
						sql.append("iftrue=:iftrue ,");
					}
					if(model.getCurversion()!=null)
					{
						sql.append("curversion=curversion +1 ,");
					}
					if(model.getPaymenttype()!=null)
					{
						sql.append("paymenttype=:paymenttype ,");
					}
		sql=new StringBuffer(StringUtil.removeLastWith(sql.toString(),","));
		sql.append(" where rowid='"+model.getCrowid()+"'   and curversion=:curversion ");
		SqlParameterSource sps=new BeanPropertySqlParameterSource(model);
		return namedParameterJdbcTemplate.update(sql.toString(), sps);
	}
	
	
	//@TriggersRemove(cacheName = "CimTpcHtlInfoTDAO", when = When.AFTER_METHOD_INVOCATION, removeAll = true)
	public int updateByCoudAndWhere(CimTpcHtlInfoT model,CimTpcHtlInfoT wheremodel)  throws DAOException  {
		
		boolean haspk=false;
					haspk=true;
		
		if(haspk=false)
		{
			throw new DAOException("no primary key ");
		}
		
		StringBuffer sql=new StringBuffer("update  cim_tpc_htl_info_t set ");
					if(model.getCityCode()!=null)
					{
						sql.append("city_code=:cityCode ,");
					}
					if(model.getDistrictCode()!=null)
					{
						sql.append("district_code=:districtCode ,");
					}
					if(model.getHotelName()!=null)
					{
						sql.append("hotel_name=:hotelName ,");
					}
					if(model.getHotelNameForeign()!=null)
					{
						sql.append("hotel_name_foreign=:hotelNameForeign ,");
					}
					if(model.getHotelNameSimple()!=null)
					{
						sql.append("hotel_name_simple=:hotelNameSimple ,");
					}
					if(model.getKeyWords()!=null)
					{
						sql.append("key_words=:keyWords ,");
					}
					if(model.getHotelAddress()!=null)
					{
						sql.append("hotel_address=:hotelAddress ,");
					}
					if(model.getHotelType()!=null)
					{
						sql.append("hotel_type=:hotelType ,");
					}
					if(model.getHotelKind()!=null)
					{
						sql.append("hotel_kind=:hotelKind ,");
					}
					if(model.getHotelLevel()!=null)
					{
						sql.append("hotel_level=:hotelLevel ,");
					}
					if(model.getHotelIntro()!=null)
					{
						sql.append("hotel_intro=:hotelIntro ,");
					}
					if(model.getContactPhone()!=null)
					{
						sql.append("contact_phone=:contactPhone ,");
					}
					if(model.getContactFax()!=null)
					{
						sql.append("contact_fax=:contactFax ,");
					}
					if(model.getHotelWebsite()!=null)
					{
						sql.append("hotel_website=:hotelWebsite ,");
					}
					if(model.getBusinessArea()!=null)
					{
						sql.append("business_area=:businessArea ,");
					}
					if(model.getHotelRoute()!=null)
					{
						sql.append("hotel_route=:hotelRoute ,");
					}
					if(model.getStartDate()!=null)
					{
						sql.append("start_date=:startDate ,");
					}
					if(model.getRoomNumber()!=null)
					{
						sql.append("room_number=:roomNumber ,");
					}
					if(model.getPayWay()!=null)
					{
						sql.append("pay_way=:payWay ,");
					}
					if(model.getLongitude()!=null)
					{
						sql.append("longitude=:longitude ,");
					}
					if(model.getLatitude()!=null)
					{
						sql.append("latitude=:latitude ,");
					}
					if(model.getIfForeign()!=null)
					{
						sql.append("if_foreign=:ifForeign ,");
					}
					if(model.getConferStatus()!=null)
					{
						sql.append("confer_status=:conferStatus ,");
					}
					if(model.getBelongCode()!=null)
					{
						sql.append("belong_code=:belongCode ,");
					}
					if(model.getIfChangeSend()!=null)
					{
						sql.append("if_change_send=:ifChangeSend ,");
					}
					if(model.getExternalId()!=null)
					{
						sql.append("external_id=:externalId ,");
					}
					if(model.getUrlAddress()!=null)
					{
						sql.append("url_address=:urlAddress ,");
					}
					if(model.getWebNumber()!=null)
					{
						sql.append("web_number=:webNumber ,");
					}
					if(model.getWebPassCode()!=null)
					{
						sql.append("web_pass_code=:webPassCode ,");
					}
					if(model.getStatus()!=null)
					{
						sql.append("status=:status ,");
					}
					if(model.getCreateDate()!=null)
					{
						sql.append("create_date=:createDate ,");
					}
					if(model.getModifyDate()!=null)
					{
						sql.append("modify_date=:modifyDate ,");
					}
					if(model.getHotelAddressForeign()!=null)
					{
						sql.append("hotel_address_foreign=:hotelAddressForeign ,");
					}
					if(model.getPostalCode()!=null)
					{
						sql.append("postal_code=:postalCode ,");
					}
					if(model.getNewFitDate()!=null)
					{
						sql.append("new_fit_date=:newFitDate ,");
					}
					if(model.getIfGoPublic()!=null)
					{
						sql.append("if_go_public=:ifGoPublic ,");
					}
					if(model.getGoPublicDate()!=null)
					{
						sql.append("go_public_date=:goPublicDate ,");
					}
					if(model.getMaxReserveDate()!=null)
					{
						sql.append("max_reserve_date=:maxReserveDate ,");
					}
					if(model.getCommendExpon()!=null)
					{
						sql.append("commend_expon=:commendExpon ,");
					}
					if(model.getPublicPraise()!=null)
					{
						sql.append("public_praise=:publicPraise ,");
					}
					if(model.getEMail()!=null)
					{
						sql.append("e_mail=:eMail ,");
					}
					if(model.getIfOnline()!=null)
					{
						sql.append("if_online=:ifOnline ,");
					}
					if(model.getSwitchboard()!=null)
					{
						sql.append("switchboard=:switchboard ,");
					}
					if(model.getIfHotelAccr()!=null)
					{
						sql.append("if_hotel_accr=:ifHotelAccr ,");
					}
					if(model.getFitKind()!=null)
					{
						sql.append("fit_kind=:fitKind ,");
					}
					if(model.getAuditType()!=null)
					{
						sql.append("audit_type=:auditType ,");
					}
					if(model.getAuditKind()!=null)
					{
						sql.append("audit_kind=:auditKind ,");
					}
					if(model.getFullPinyin()!=null)
					{
						sql.append("full_pinyin=:fullPinyin ,");
					}
					if(model.getPinyinFir()!=null)
					{
						sql.append("pinyin_fir=:pinyinFir ,");
					}
					if(model.getIfGroup()!=null)
					{
						sql.append("if_group=:ifGroup ,");
					}
					if(model.getGroupName()!=null)
					{
						sql.append("group_name=:groupName ,");
					}
					if(model.getMainFloors()!=null)
					{
						sql.append("main_floors=:mainFloors ,");
					}
					if(model.getAppendixFloors()!=null)
					{
						sql.append("appendix_floors=:appendixFloors ,");
					}
					if(model.getHotelAdvantage()!=null)
					{
						sql.append("hotel_advantage=:hotelAdvantage ,");
					}
					if(model.getIfTop()!=null)
					{
						sql.append("if_top=:ifTop ,");
					}
					if(model.getIfCancelHold()!=null)
					{
						sql.append("if_cancel_hold=:ifCancelHold ,");
					}
					if(model.getEnablewaterpool()!=null)
					{
						sql.append("enablewaterpool=:enablewaterpool ,");
					}
					if(model.getOrderChangeFlag()!=null)
					{
						sql.append("order_change_flag=:orderChangeFlag ,");
					}
					if(model.getMessageSale()!=null)
					{
						sql.append("message_sale=:messageSale ,");
					}
					if(model.getSourceHotelId()!=null)
					{
						sql.append("source_hotel_id=:sourceHotelId ,");
					}
					if(model.getSourceType()!=null)
					{
						sql.append("source_type=:sourceType ,");
					}
					if(model.getBrandid()!=null)
					{
						sql.append("brandid=:brandid ,");
					}
					if(model.getHotelImage()!=null)
					{
						sql.append("hotel_image=:hotelImage ,");
					}
					if(model.getService()!=null)
					{
						sql.append("service=:service ,");
					}
					if(model.getFacility()!=null)
					{
						sql.append("facility=:facility ,");
					}
					if(model.getCatering()!=null)
					{
						sql.append("catering=:catering ,");
					}
					if(model.getRecreation()!=null)
					{
						sql.append("recreation=:recreation ,");
					}
					if(model.getCreditcard()!=null)
					{
						sql.append("creditcard=:creditcard ,");
					}
					if(model.getNearby()!=null)
					{
						sql.append("nearby=:nearby ,");
					}
					if(model.getStreet()!=null)
					{
						sql.append("street=:street ,");
					}
					if(model.getStreetaddr()!=null)
					{
						sql.append("streetaddr=:streetaddr ,");
					}
					if(model.getEditType()!=null)
					{
						sql.append("edit_type=:editType ,");
					}
					if(model.getLowerprice()!=null)
					{
						sql.append("lowerprice=:lowerprice ,");
					}
					if(model.getImpressdesc()!=null)
					{
						sql.append("impressdesc=:impressdesc ,");
					}
					if(model.getRelationid()!=null)
					{
						sql.append("relationid=:relationid ,");
					}
					if(model.getTuid()!=null)
					{
						sql.append("tuid=:tuid ,");
					}
					if(model.getLowerprice2()!=null)
					{
						sql.append("lowerprice2=:lowerprice2 ,");
					}
					if(model.getIsmajor()!=null)
					{
						sql.append("ismajor=:ismajor ,");
					}
					if(model.getTravelid()!=null)
					{
						sql.append("travelid=:travelid ,");
					}
					if(model.getFlag()!=null)
					{
						sql.append("flag=:flag ,");
					}
					if(model.getBusinessAreaName()!=null)
					{
						sql.append("business_area_name=:businessAreaName ,");
					}
					if(model.getHighestprice()!=null)
					{
						sql.append("highestprice=:highestprice ,");
					}
					if(model.getMicrosms()!=null)
					{
						sql.append("microsms=:microsms ,");
					}
					if(model.getCashback()!=null)
					{
						sql.append("cashback=:cashback ,");
					}
					if(model.getRoomimage()!=null)
					{
						sql.append("roomimage=:roomimage ,");
					}
					if(model.getRoomimagecount()!=null)
					{
						sql.append("roomimagecount=:roomimagecount ,");
					}
					if(model.getIftrue()!=null)
					{
						sql.append("iftrue=:iftrue ,");
					}
					if(model.getCurversion()!=null)
					{
						sql.append("curversion=:curversion ,");
					}
					if(model.getPaymenttype()!=null)
					{
						sql.append("paymenttype=:paymenttype ,");
					}
		
		
		sql=new StringBuffer(StringUtil.removeLastWith(sql.toString(),","));
		
		
		StringBuffer where=new StringBuffer("");
					if(wheremodel.getCityCode()!=null)
					{
						where.append("and city_code=:cityCode ,");
					}
					if(wheremodel.getDistrictCode()!=null)
					{
						where.append("and district_code=:districtCode ,");
					}
					if(wheremodel.getCompanyId()!=null)
					{
						where.append("and company_id=:companyId ,");
					}
					if(wheremodel.getHotelName()!=null)
					{
						where.append("and hotel_name=:hotelName ,");
					}
					if(wheremodel.getHotelNameForeign()!=null)
					{
						where.append("and hotel_name_foreign=:hotelNameForeign ,");
					}
					if(wheremodel.getHotelNameSimple()!=null)
					{
						where.append("and hotel_name_simple=:hotelNameSimple ,");
					}
					if(wheremodel.getKeyWords()!=null)
					{
						where.append("and key_words=:keyWords ,");
					}
					if(wheremodel.getHotelAddress()!=null)
					{
						where.append("and hotel_address=:hotelAddress ,");
					}
					if(wheremodel.getHotelType()!=null)
					{
						where.append("and hotel_type=:hotelType ,");
					}
					if(wheremodel.getHotelKind()!=null)
					{
						where.append("and hotel_kind=:hotelKind ,");
					}
					if(wheremodel.getHotelLevel()!=null)
					{
						where.append("and hotel_level=:hotelLevel ,");
					}
					if(wheremodel.getHotelIntro()!=null)
					{
						where.append("and hotel_intro=:hotelIntro ,");
					}
					if(wheremodel.getContactPhone()!=null)
					{
						where.append("and contact_phone=:contactPhone ,");
					}
					if(wheremodel.getContactFax()!=null)
					{
						where.append("and contact_fax=:contactFax ,");
					}
					if(wheremodel.getHotelWebsite()!=null)
					{
						where.append("and hotel_website=:hotelWebsite ,");
					}
					if(wheremodel.getBusinessArea()!=null)
					{
						where.append("and business_area=:businessArea ,");
					}
					if(wheremodel.getHotelRoute()!=null)
					{
						where.append("and hotel_route=:hotelRoute ,");
					}
					if(wheremodel.getStartDate()!=null)
					{
						where.append("and start_date=:startDate ,");
					}
					if(wheremodel.getRoomNumber()!=null)
					{
						where.append("and room_number=:roomNumber ,");
					}
					if(wheremodel.getPayWay()!=null)
					{
						where.append("and pay_way=:payWay ,");
					}
					if(wheremodel.getLongitude()!=null)
					{
						where.append("and longitude=:longitude ,");
					}
					if(wheremodel.getLatitude()!=null)
					{
						where.append("and latitude=:latitude ,");
					}
					if(wheremodel.getIfForeign()!=null)
					{
						where.append("and if_foreign=:ifForeign ,");
					}
					if(wheremodel.getConferStatus()!=null)
					{
						where.append("and confer_status=:conferStatus ,");
					}
					if(wheremodel.getBelongCode()!=null)
					{
						where.append("and belong_code=:belongCode ,");
					}
					if(wheremodel.getIfChangeSend()!=null)
					{
						where.append("and if_change_send=:ifChangeSend ,");
					}
					if(wheremodel.getExternalId()!=null)
					{
						where.append("and external_id=:externalId ,");
					}
					if(wheremodel.getUrlAddress()!=null)
					{
						where.append("and url_address=:urlAddress ,");
					}
					if(wheremodel.getWebNumber()!=null)
					{
						where.append("and web_number=:webNumber ,");
					}
					if(wheremodel.getWebPassCode()!=null)
					{
						where.append("and web_pass_code=:webPassCode ,");
					}
					if(wheremodel.getStatus()!=null)
					{
						where.append("and status=:status ,");
					}
					if(wheremodel.getCreateDate()!=null)
					{
						where.append("and create_date=:createDate ,");
					}
					if(wheremodel.getModifyDate()!=null)
					{
						where.append("and modify_date=:modifyDate ,");
					}
					if(wheremodel.getHotelAddressForeign()!=null)
					{
						where.append("and hotel_address_foreign=:hotelAddressForeign ,");
					}
					if(wheremodel.getPostalCode()!=null)
					{
						where.append("and postal_code=:postalCode ,");
					}
					if(wheremodel.getNewFitDate()!=null)
					{
						where.append("and new_fit_date=:newFitDate ,");
					}
					if(wheremodel.getIfGoPublic()!=null)
					{
						where.append("and if_go_public=:ifGoPublic ,");
					}
					if(wheremodel.getGoPublicDate()!=null)
					{
						where.append("and go_public_date=:goPublicDate ,");
					}
					if(wheremodel.getMaxReserveDate()!=null)
					{
						where.append("and max_reserve_date=:maxReserveDate ,");
					}
					if(wheremodel.getCommendExpon()!=null)
					{
						where.append("and commend_expon=:commendExpon ,");
					}
					if(wheremodel.getPublicPraise()!=null)
					{
						where.append("and public_praise=:publicPraise ,");
					}
					if(wheremodel.getEMail()!=null)
					{
						where.append("and e_mail=:eMail ,");
					}
					if(wheremodel.getIfOnline()!=null)
					{
						where.append("and if_online=:ifOnline ,");
					}
					if(wheremodel.getSwitchboard()!=null)
					{
						where.append("and switchboard=:switchboard ,");
					}
					if(wheremodel.getIfHotelAccr()!=null)
					{
						where.append("and if_hotel_accr=:ifHotelAccr ,");
					}
					if(wheremodel.getFitKind()!=null)
					{
						where.append("and fit_kind=:fitKind ,");
					}
					if(wheremodel.getAuditType()!=null)
					{
						where.append("and audit_type=:auditType ,");
					}
					if(wheremodel.getAuditKind()!=null)
					{
						where.append("and audit_kind=:auditKind ,");
					}
					if(wheremodel.getFullPinyin()!=null)
					{
						where.append("and full_pinyin=:fullPinyin ,");
					}
					if(wheremodel.getPinyinFir()!=null)
					{
						where.append("and pinyin_fir=:pinyinFir ,");
					}
					if(wheremodel.getIfGroup()!=null)
					{
						where.append("and if_group=:ifGroup ,");
					}
					if(wheremodel.getGroupName()!=null)
					{
						where.append("and group_name=:groupName ,");
					}
					if(wheremodel.getMainFloors()!=null)
					{
						where.append("and main_floors=:mainFloors ,");
					}
					if(wheremodel.getAppendixFloors()!=null)
					{
						where.append("and appendix_floors=:appendixFloors ,");
					}
					if(wheremodel.getHotelAdvantage()!=null)
					{
						where.append("and hotel_advantage=:hotelAdvantage ,");
					}
					if(wheremodel.getIfTop()!=null)
					{
						where.append("and if_top=:ifTop ,");
					}
					if(wheremodel.getIfCancelHold()!=null)
					{
						where.append("and if_cancel_hold=:ifCancelHold ,");
					}
					if(wheremodel.getEnablewaterpool()!=null)
					{
						where.append("and enablewaterpool=:enablewaterpool ,");
					}
					if(wheremodel.getOrderChangeFlag()!=null)
					{
						where.append("and order_change_flag=:orderChangeFlag ,");
					}
					if(wheremodel.getMessageSale()!=null)
					{
						where.append("and message_sale=:messageSale ,");
					}
					if(wheremodel.getSourceHotelId()!=null)
					{
						where.append("and source_hotel_id=:sourceHotelId ,");
					}
					if(wheremodel.getSourceType()!=null)
					{
						where.append("and source_type=:sourceType ,");
					}
					if(wheremodel.getBrandid()!=null)
					{
						where.append("and brandid=:brandid ,");
					}
					if(wheremodel.getHotelImage()!=null)
					{
						where.append("and hotel_image=:hotelImage ,");
					}
					if(wheremodel.getService()!=null)
					{
						where.append("and service=:service ,");
					}
					if(wheremodel.getFacility()!=null)
					{
						where.append("and facility=:facility ,");
					}
					if(wheremodel.getCatering()!=null)
					{
						where.append("and catering=:catering ,");
					}
					if(wheremodel.getRecreation()!=null)
					{
						where.append("and recreation=:recreation ,");
					}
					if(wheremodel.getCreditcard()!=null)
					{
						where.append("and creditcard=:creditcard ,");
					}
					if(wheremodel.getNearby()!=null)
					{
						where.append("and nearby=:nearby ,");
					}
					if(wheremodel.getStreet()!=null)
					{
						where.append("and street=:street ,");
					}
					if(wheremodel.getStreetaddr()!=null)
					{
						where.append("and streetaddr=:streetaddr ,");
					}
					if(wheremodel.getEditType()!=null)
					{
						where.append("and edit_type=:editType ,");
					}
					if(wheremodel.getLowerprice()!=null)
					{
						where.append("and lowerprice=:lowerprice ,");
					}
					if(wheremodel.getImpressdesc()!=null)
					{
						where.append("and impressdesc=:impressdesc ,");
					}
					if(wheremodel.getRelationid()!=null)
					{
						where.append("and relationid=:relationid ,");
					}
					if(wheremodel.getTuid()!=null)
					{
						where.append("and tuid=:tuid ,");
					}
					if(wheremodel.getLowerprice2()!=null)
					{
						where.append("and lowerprice2=:lowerprice2 ,");
					}
					if(wheremodel.getIsmajor()!=null)
					{
						where.append("and ismajor=:ismajor ,");
					}
					if(wheremodel.getTravelid()!=null)
					{
						where.append("and travelid=:travelid ,");
					}
					if(wheremodel.getFlag()!=null)
					{
						where.append("and flag=:flag ,");
					}
					if(wheremodel.getBusinessAreaName()!=null)
					{
						where.append("and business_area_name=:businessAreaName ,");
					}
					if(wheremodel.getHighestprice()!=null)
					{
						where.append("and highestprice=:highestprice ,");
					}
					if(wheremodel.getMicrosms()!=null)
					{
						where.append("and microsms=:microsms ,");
					}
					if(wheremodel.getCashback()!=null)
					{
						where.append("and cashback=:cashback ,");
					}
					if(wheremodel.getRoomimage()!=null)
					{
						where.append("and roomimage=:roomimage ,");
					}
					if(wheremodel.getRoomimagecount()!=null)
					{
						where.append("and roomimagecount=:roomimagecount ,");
					}
					if(wheremodel.getIftrue()!=null)
					{
						where.append("and iftrue=:iftrue ,");
					}
					if(wheremodel.getCurversion()!=null)
					{
						where.append("and curversion=:curversion ,");
					}
					if(wheremodel.getPaymenttype()!=null)
					{
						where.append("and paymenttype=:paymenttype ,");
					}
		if(where.equals(""))
		{
			throw new DAOException(" must have where condition"); 
		}
		sql=new StringBuffer(StringUtil.removeLastWith(sql.toString(),","));
		sql.append(" where 1=1  "+where.toString());
		SqlParameterSource sps=new BeanPropertySqlParameterSource(model);
		return namedParameterJdbcTemplate.update(sql.toString(), sps);
	}
	
	/*
	//@TriggersRemove(cacheName = "CimTpcHtlInfoTDAO", when = When.AFTER_METHOD_INVOCATION, removeAll = true)
	public void batchInsert(List<CimTpcHtlInfoT> list)  throws DAOException{
		
		StringBuffer sql = new StringBuffer("insert into cim_tpc_htl_info_t("
				+" city_code "
				+",district_code "
				+",company_id "
				+",hotel_name "
				+",hotel_name_foreign "
				+",hotel_name_simple "
				+",key_words "
				+",hotel_address "
				+",hotel_type "
				+",hotel_kind "
				+",hotel_level "
				+",hotel_intro "
				+",contact_phone "
				+",contact_fax "
				+",hotel_website "
				+",business_area "
				+",hotel_route "
				+",start_date "
				+",room_number "
				+",pay_way "
				+",longitude "
				+",latitude "
				+",if_foreign "
				+",confer_status "
				+",belong_code "
				+",if_change_send "
				+",external_id "
				+",url_address "
				+",web_number "
				+",web_pass_code "
				+",status "
				+",create_date "
				+",modify_date "
				+",hotel_address_foreign "
				+",postal_code "
				+",new_fit_date "
				+",if_go_public "
				+",go_public_date "
				+",max_reserve_date "
				+",commend_expon "
				+",public_praise "
				+",e_mail "
				+",if_online "
				+",switchboard "
				+",if_hotel_accr "
				+",fit_kind "
				+",audit_type "
				+",audit_kind "
				+",full_pinyin "
				+",pinyin_fir "
				+",if_group "
				+",group_name "
				+",main_floors "
				+",appendix_floors "
				+",hotel_advantage "
				+",if_top "
				+",if_cancel_hold "
				+",enablewaterpool "
				+",order_change_flag "
				+",message_sale "
				+",source_hotel_id "
				+",source_type "
				+",brandid "
				+",hotel_image "
				+",service "
				+",facility "
				+",catering "
				+",recreation "
				+",creditcard "
				+",nearby "
				+",street "
				+",streetaddr "
				+",edit_type "
				+",lowerprice "
				+",impressdesc "
				+",relationid "
				+",tuid "
				+",lowerprice2 "
				+",ismajor "
				+",travelid "
				+",flag "
				+",business_area_name "
				+",highestprice "
				+",microsms "
				+",cashback "
				+",roomimage "
				+",roomimagecount "
				+",iftrue "
				+",curversion "
				+",paymenttype "
		
		+") values("
		
				+"?"
				+",?"
				+",cim_tpc_htl_info_t_s.nextval"
				+",?"
				+",?"
				+",?"
				+",?"
				+",?"
				+",?"
				+",?"
				+",?"
				+",?"
				+",?"
				+",?"
				+",?"
				+",?"
				+",?"
				+",?"
				+",?"
				+",?"
				+",?"
				+",?"
				+",?"
				+",?"
				+",?"
				+",?"
				+",?"
				+",?"
				+",?"
				+",?"
				+",?"
				+",?"
				+",?"
				+",?"
				+",?"
				+",?"
				+",?"
				+",?"
				+",?"
				+",?"
				+",?"
				+",?"
				+",?"
				+",?"
				+",?"
				+",?"
				+",?"
				+",?"
				+",?"
				+",?"
				+",?"
				+",?"
				+",?"
				+",?"
				+",?"
				+",?"
				+",?"
				+",?"
				+",?"
				+",?"
				+",?"
				+",?"
				+",?"
				+",?"
				+",?"
				+",?"
				+",?"
				+",?"
				+",?"
				+",?"
				+",?"
				+",?"
				+",?"
				+",?"
				+",?"
				+",?"
				+",?"
				+",?"
				+",?"
				+",?"
				+",?"
				+",?"
				+",?"
				+",?"
				+",?"
				+",?"
				+",?"
				+",?"
				+",?"
				+",?"
		  + ")" );
		
		
		PreparedStatement ps=null;
		Connection conn = null;
		try{
		
			  conn = DataSourceUtils.getConnection(jdbcTemplate.getDataSource());
			  ps= conn.prepareStatement(sql.toString()); 
			  for (int i = 0; i < list.size(); i++) {
					
					ps.setString(1, list.get(i).getCityCode());
					ps.setString(2, list.get(i).getDistrictCode());
					ps.setString(3, list.get(i).getCompanyId());
					ps.setString(4, list.get(i).getHotelName());
					ps.setString(5, list.get(i).getHotelNameForeign());
					ps.setString(6, list.get(i).getHotelNameSimple());
					ps.setString(7, list.get(i).getKeyWords());
					ps.setString(8, list.get(i).getHotelAddress());
					ps.setInteger(9, list.get(i).getHotelType());
					ps.setInteger(10, list.get(i).getHotelKind());
					ps.setInteger(11, list.get(i).getHotelLevel());
					ps.setString(12, list.get(i).getHotelIntro());
					ps.setString(13, list.get(i).getContactPhone());
					ps.setString(14, list.get(i).getContactFax());
					ps.setString(15, list.get(i).getHotelWebsite());
					ps.setString(16, list.get(i).getBusinessArea());
					ps.setString(17, list.get(i).getHotelRoute());
					ps.setDate(18, list.get(i).getStartDate());
					ps.setInteger(19, list.get(i).getRoomNumber());
					ps.setInteger(20, list.get(i).getPayWay());
					ps.setString(21, list.get(i).getLongitude());
					ps.setString(22, list.get(i).getLatitude());
					ps.setInteger(23, list.get(i).getIfForeign());
					ps.setInteger(24, list.get(i).getConferStatus());
					ps.setLong(25, list.get(i).getBelongCode());
					ps.setInteger(26, list.get(i).getIfChangeSend());
					ps.setString(27, list.get(i).getExternalId());
					ps.setString(28, list.get(i).getUrlAddress());
					ps.setString(29, list.get(i).getWebNumber());
					ps.setString(30, list.get(i).getWebPassCode());
					ps.setInteger(31, list.get(i).getStatus());
					ps.setDate(32, list.get(i).getCreateDate());
					ps.setDate(33, list.get(i).getModifyDate());
					ps.setString(34, list.get(i).getHotelAddressForeign());
					ps.setString(35, list.get(i).getPostalCode());
					ps.setDate(36, list.get(i).getNewFitDate());
					ps.setInteger(37, list.get(i).getIfGoPublic());
					ps.setDate(38, list.get(i).getGoPublicDate());
					ps.setInteger(39, list.get(i).getMaxReserveDate());
					ps.setInteger(40, list.get(i).getCommendExpon());
					ps.setDouble(41, list.get(i).getPublicPraise());
					ps.setString(42, list.get(i).getEMail());
					ps.setInteger(43, list.get(i).getIfOnline());
					ps.setString(44, list.get(i).getSwitchboard());
					ps.setInteger(45, list.get(i).getIfHotelAccr());
					ps.setInteger(46, list.get(i).getFitKind());
					ps.setInteger(47, list.get(i).getAuditType());
					ps.setInteger(48, list.get(i).getAuditKind());
					ps.setString(49, list.get(i).getFullPinyin());
					ps.setString(50, list.get(i).getPinyinFir());
					ps.setInteger(51, list.get(i).getIfGroup());
					ps.setString(52, list.get(i).getGroupName());
					ps.setString(53, list.get(i).getMainFloors());
					ps.setString(54, list.get(i).getAppendixFloors());
					ps.setString(55, list.get(i).getHotelAdvantage());
					ps.setInteger(56, list.get(i).getIfTop());
					ps.setInteger(57, list.get(i).getIfCancelHold());
					ps.setInteger(58, list.get(i).getEnablewaterpool());
					ps.setInteger(59, list.get(i).getOrderChangeFlag());
					ps.setInteger(60, list.get(i).getMessageSale());
					ps.setString(61, list.get(i).getSourceHotelId());
					ps.setInteger(62, list.get(i).getSourceType());
					ps.setString(63, list.get(i).getBrandid());
					ps.setString(64, list.get(i).getHotelImage());
					ps.setString(65, list.get(i).getService());
					ps.setString(66, list.get(i).getFacility());
					ps.setString(67, list.get(i).getCatering());
					ps.setString(68, list.get(i).getRecreation());
					ps.setString(69, list.get(i).getCreditcard());
					ps.setString(70, list.get(i).getNearby());
					ps.setString(71, list.get(i).getStreet());
					ps.setString(72, list.get(i).getStreetaddr());
					ps.setInteger(73, list.get(i).getEditType());
					ps.setInteger(74, list.get(i).getLowerprice());
					ps.setString(75, list.get(i).getImpressdesc());
					ps.setString(76, list.get(i).getRelationid());
					ps.setString(77, list.get(i).getTuid());
					ps.setInteger(78, list.get(i).getLowerprice2());
					ps.setInteger(79, list.get(i).getIsmajor());
					ps.setLong(80, list.get(i).getTravelid());
					ps.setInteger(81, list.get(i).getFlag());
					ps.setString(82, list.get(i).getBusinessAreaName());
					ps.setInteger(83, list.get(i).getHighestprice());
					ps.setString(84, list.get(i).getMicrosms());
					ps.setDouble(85, list.get(i).getCashback());
					ps.setString(86, list.get(i).getRoomimage());
					ps.setInteger(87, list.get(i).getRoomimagecount());
					ps.setInteger(88, list.get(i).getIftrue());
					ps.setLong(89, list.get(i).getCurversion());
					ps.setString(90, list.get(i).getPaymenttype());
					
					ps.addBatch();
					ps.clearParameters();
					if(i%500==0 || i==list.size()-1)
					{
						ps.executeBatch(); 
					}
			  }
			  ps.close();
		}catch (Exception ex) {
			 ex.printStackTrace(); 
		}finally{
			JdbcUtils.closeStatement(ps);  
			DataSourceUtils.releaseConnection(conn, jdbcTemplate.getDataSource());  
		}
		
	}
	
	//@TriggersRemove(cacheName = "CimTpcHtlInfoTDAO", when = When.AFTER_METHOD_INVOCATION, removeAll = true)
	public void batchUpdate(List<CimTpcHtlInfoT> list)  throws DAOException{
		
		boolean haspk=false;
					haspk=true;
		
		if(haspk=false)
		{
			throw new DAOException("no primary key ");
		}
		
		StringBuffer sql=new StringBuffer("update  cim_tpc_htl_info_t set ");
						sql.append("city_code=? ,");
						sql.append("district_code=? ,");
						sql.append("hotel_name=? ,");
						sql.append("hotel_name_foreign=? ,");
						sql.append("hotel_name_simple=? ,");
						sql.append("key_words=? ,");
						sql.append("hotel_address=? ,");
						sql.append("hotel_type=? ,");
						sql.append("hotel_kind=? ,");
						sql.append("hotel_level=? ,");
						sql.append("hotel_intro=? ,");
						sql.append("contact_phone=? ,");
						sql.append("contact_fax=? ,");
						sql.append("hotel_website=? ,");
						sql.append("business_area=? ,");
						sql.append("hotel_route=? ,");
						sql.append("start_date=? ,");
						sql.append("room_number=? ,");
						sql.append("pay_way=? ,");
						sql.append("longitude=? ,");
						sql.append("latitude=? ,");
						sql.append("if_foreign=? ,");
						sql.append("confer_status=? ,");
						sql.append("belong_code=? ,");
						sql.append("if_change_send=? ,");
						sql.append("external_id=? ,");
						sql.append("url_address=? ,");
						sql.append("web_number=? ,");
						sql.append("web_pass_code=? ,");
						sql.append("status=? ,");
						sql.append("create_date=? ,");
						sql.append("modify_date=? ,");
						sql.append("hotel_address_foreign=? ,");
						sql.append("postal_code=? ,");
						sql.append("new_fit_date=? ,");
						sql.append("if_go_public=? ,");
						sql.append("go_public_date=? ,");
						sql.append("max_reserve_date=? ,");
						sql.append("commend_expon=? ,");
						sql.append("public_praise=? ,");
						sql.append("e_mail=? ,");
						sql.append("if_online=? ,");
						sql.append("switchboard=? ,");
						sql.append("if_hotel_accr=? ,");
						sql.append("fit_kind=? ,");
						sql.append("audit_type=? ,");
						sql.append("audit_kind=? ,");
						sql.append("full_pinyin=? ,");
						sql.append("pinyin_fir=? ,");
						sql.append("if_group=? ,");
						sql.append("group_name=? ,");
						sql.append("main_floors=? ,");
						sql.append("appendix_floors=? ,");
						sql.append("hotel_advantage=? ,");
						sql.append("if_top=? ,");
						sql.append("if_cancel_hold=? ,");
						sql.append("enablewaterpool=? ,");
						sql.append("order_change_flag=? ,");
						sql.append("message_sale=? ,");
						sql.append("source_hotel_id=? ,");
						sql.append("source_type=? ,");
						sql.append("brandid=? ,");
						sql.append("hotel_image=? ,");
						sql.append("service=? ,");
						sql.append("facility=? ,");
						sql.append("catering=? ,");
						sql.append("recreation=? ,");
						sql.append("creditcard=? ,");
						sql.append("nearby=? ,");
						sql.append("street=? ,");
						sql.append("streetaddr=? ,");
						sql.append("edit_type=? ,");
						sql.append("lowerprice=? ,");
						sql.append("impressdesc=? ,");
						sql.append("relationid=? ,");
						sql.append("tuid=? ,");
						sql.append("lowerprice2=? ,");
						sql.append("ismajor=? ,");
						sql.append("travelid=? ,");
						sql.append("flag=? ,");
						sql.append("business_area_name=? ,");
						sql.append("highestprice=? ,");
						sql.append("microsms=? ,");
						sql.append("cashback=? ,");
						sql.append("roomimage=? ,");
						sql.append("roomimagecount=? ,");
						sql.append("iftrue=? ,");
						sql.append("curversion=? ,");
						sql.append("paymenttype=? ,");
		
		if(sql.lastIndexOf(",")==sql.length()-1)
		{
			sql=new StringBuffer(sql.substring(0,sql.length()-2));
		}
		
		StringBuffer where=new StringBuffer(" where 1=1 ");
					where.append(" and company_id=?");
		sql.append(where.toString());
		
		
		PreparedStatement ps=null;
		Connection conn = null;
		try{
		
			  conn = DataSourceUtils.getConnection(jdbcTemplate.getDataSource());
			  ps= conn.prepareStatement(sql.toString()); 
			  for (int i = 0; i < list.size(); i++) {
					
					ps.setString(1, list.get(i).getCityCode());
					ps.setString(2, list.get(i).getDistrictCode());
					ps.setString(3, list.get(i).getCompanyId());
					ps.setString(4, list.get(i).getHotelName());
					ps.setString(5, list.get(i).getHotelNameForeign());
					ps.setString(6, list.get(i).getHotelNameSimple());
					ps.setString(7, list.get(i).getKeyWords());
					ps.setString(8, list.get(i).getHotelAddress());
					ps.setInteger(9, list.get(i).getHotelType());
					ps.setInteger(10, list.get(i).getHotelKind());
					ps.setInteger(11, list.get(i).getHotelLevel());
					ps.setString(12, list.get(i).getHotelIntro());
					ps.setString(13, list.get(i).getContactPhone());
					ps.setString(14, list.get(i).getContactFax());
					ps.setString(15, list.get(i).getHotelWebsite());
					ps.setString(16, list.get(i).getBusinessArea());
					ps.setString(17, list.get(i).getHotelRoute());
					ps.setDate(18, list.get(i).getStartDate());
					ps.setInteger(19, list.get(i).getRoomNumber());
					ps.setInteger(20, list.get(i).getPayWay());
					ps.setString(21, list.get(i).getLongitude());
					ps.setString(22, list.get(i).getLatitude());
					ps.setInteger(23, list.get(i).getIfForeign());
					ps.setInteger(24, list.get(i).getConferStatus());
					ps.setLong(25, list.get(i).getBelongCode());
					ps.setInteger(26, list.get(i).getIfChangeSend());
					ps.setString(27, list.get(i).getExternalId());
					ps.setString(28, list.get(i).getUrlAddress());
					ps.setString(29, list.get(i).getWebNumber());
					ps.setString(30, list.get(i).getWebPassCode());
					ps.setInteger(31, list.get(i).getStatus());
					ps.setDate(32, list.get(i).getCreateDate());
					ps.setDate(33, list.get(i).getModifyDate());
					ps.setString(34, list.get(i).getHotelAddressForeign());
					ps.setString(35, list.get(i).getPostalCode());
					ps.setDate(36, list.get(i).getNewFitDate());
					ps.setInteger(37, list.get(i).getIfGoPublic());
					ps.setDate(38, list.get(i).getGoPublicDate());
					ps.setInteger(39, list.get(i).getMaxReserveDate());
					ps.setInteger(40, list.get(i).getCommendExpon());
					ps.setDouble(41, list.get(i).getPublicPraise());
					ps.setString(42, list.get(i).getEMail());
					ps.setInteger(43, list.get(i).getIfOnline());
					ps.setString(44, list.get(i).getSwitchboard());
					ps.setInteger(45, list.get(i).getIfHotelAccr());
					ps.setInteger(46, list.get(i).getFitKind());
					ps.setInteger(47, list.get(i).getAuditType());
					ps.setInteger(48, list.get(i).getAuditKind());
					ps.setString(49, list.get(i).getFullPinyin());
					ps.setString(50, list.get(i).getPinyinFir());
					ps.setInteger(51, list.get(i).getIfGroup());
					ps.setString(52, list.get(i).getGroupName());
					ps.setString(53, list.get(i).getMainFloors());
					ps.setString(54, list.get(i).getAppendixFloors());
					ps.setString(55, list.get(i).getHotelAdvantage());
					ps.setInteger(56, list.get(i).getIfTop());
					ps.setInteger(57, list.get(i).getIfCancelHold());
					ps.setInteger(58, list.get(i).getEnablewaterpool());
					ps.setInteger(59, list.get(i).getOrderChangeFlag());
					ps.setInteger(60, list.get(i).getMessageSale());
					ps.setString(61, list.get(i).getSourceHotelId());
					ps.setInteger(62, list.get(i).getSourceType());
					ps.setString(63, list.get(i).getBrandid());
					ps.setString(64, list.get(i).getHotelImage());
					ps.setString(65, list.get(i).getService());
					ps.setString(66, list.get(i).getFacility());
					ps.setString(67, list.get(i).getCatering());
					ps.setString(68, list.get(i).getRecreation());
					ps.setString(69, list.get(i).getCreditcard());
					ps.setString(70, list.get(i).getNearby());
					ps.setString(71, list.get(i).getStreet());
					ps.setString(72, list.get(i).getStreetaddr());
					ps.setInteger(73, list.get(i).getEditType());
					ps.setInteger(74, list.get(i).getLowerprice());
					ps.setString(75, list.get(i).getImpressdesc());
					ps.setString(76, list.get(i).getRelationid());
					ps.setString(77, list.get(i).getTuid());
					ps.setInteger(78, list.get(i).getLowerprice2());
					ps.setInteger(79, list.get(i).getIsmajor());
					ps.setLong(80, list.get(i).getTravelid());
					ps.setInteger(81, list.get(i).getFlag());
					ps.setString(82, list.get(i).getBusinessAreaName());
					ps.setInteger(83, list.get(i).getHighestprice());
					ps.setString(84, list.get(i).getMicrosms());
					ps.setDouble(85, list.get(i).getCashback());
					ps.setString(86, list.get(i).getRoomimage());
					ps.setInteger(87, list.get(i).getRoomimagecount());
					ps.setInteger(88, list.get(i).getIftrue());
					ps.setLong(89, list.get(i).getCurversion());
					ps.setString(90, list.get(i).getPaymenttype());
					
					ps.addBatch();
					ps.clearParameters();
					if(i%500==0 || i==list.size()-1)
					{
						ps.executeBatch(); 
					}
			  }
			  ps.close();
		}catch (Exception ex) {
			 ex.printStackTrace(); 
		}finally{
			JdbcUtils.closeStatement(ps);  
			DataSourceUtils.releaseConnection(conn, jdbcTemplate.getDataSource());  
		}
	}
	*/
	
	//@Cacheable(cacheName = "CimTpcHtlInfoTDAO",keyGenerator = @KeyGenerator (name = "StringCacheKeyGenerator",properties = {@Property( name="useReflection", value="true" ), @Property( name="checkforCycles", value="true" ),@Property( name="includeMethod", value="true" ) }   ))
	public List<CimTpcHtlInfoT> getCimTpcHtlInfoTListByCoud(CimTpcHtlInfoT model,int topN)  throws DAOException  {
		StringBuffer sql=new StringBuffer("select t.*,rowid as crowid from cim_tpc_htl_info_t t where 1=1 ");
		if(model.getCityCode()!=null)
		{
			sql.append(" and city_code=:cityCode ");
		}
		if(model.getDistrictCode()!=null)
		{
			sql.append(" and district_code=:districtCode ");
		}
		if(model.getCompanyId()!=null)
		{
			sql.append(" and company_id=:companyId ");
		}
		if(model.getHotelName()!=null)
		{
			sql.append(" and hotel_name=:hotelName ");
		}
		if(model.getHotelNameForeign()!=null)
		{
			sql.append(" and hotel_name_foreign=:hotelNameForeign ");
		}
		if(model.getHotelNameSimple()!=null)
		{
			sql.append(" and hotel_name_simple=:hotelNameSimple ");
		}
		if(model.getKeyWords()!=null)
		{
			sql.append(" and key_words=:keyWords ");
		}
		if(model.getHotelAddress()!=null)
		{
			sql.append(" and hotel_address=:hotelAddress ");
		}
		if(model.getHotelType()!=null)
		{
			sql.append(" and hotel_type=:hotelType ");
		}
		if(model.getHotelKind()!=null)
		{
			sql.append(" and hotel_kind=:hotelKind ");
		}
		if(model.getHotelLevel()!=null)
		{
			sql.append(" and hotel_level=:hotelLevel ");
		}
		if(model.getHotelIntro()!=null)
		{
			sql.append(" and hotel_intro=:hotelIntro ");
		}
		if(model.getContactPhone()!=null)
		{
			sql.append(" and contact_phone=:contactPhone ");
		}
		if(model.getContactFax()!=null)
		{
			sql.append(" and contact_fax=:contactFax ");
		}
		if(model.getHotelWebsite()!=null)
		{
			sql.append(" and hotel_website=:hotelWebsite ");
		}
		if(model.getBusinessArea()!=null)
		{
			sql.append(" and business_area=:businessArea ");
		}
		if(model.getHotelRoute()!=null)
		{
			sql.append(" and hotel_route=:hotelRoute ");
		}
		if(model.getStartDate()!=null)
		{
			sql.append(" and start_date=:startDate ");
		}
		if(model.getRoomNumber()!=null)
		{
			sql.append(" and room_number=:roomNumber ");
		}
		if(model.getPayWay()!=null)
		{
			sql.append(" and pay_way=:payWay ");
		}
		if(model.getLongitude()!=null)
		{
			sql.append(" and longitude=:longitude ");
		}
		if(model.getLatitude()!=null)
		{
			sql.append(" and latitude=:latitude ");
		}
		if(model.getIfForeign()!=null)
		{
			sql.append(" and if_foreign=:ifForeign ");
		}
		if(model.getConferStatus()!=null)
		{
			sql.append(" and confer_status=:conferStatus ");
		}
		if(model.getBelongCode()!=null)
		{
			sql.append(" and belong_code=:belongCode ");
		}
		if(model.getIfChangeSend()!=null)
		{
			sql.append(" and if_change_send=:ifChangeSend ");
		}
		if(model.getExternalId()!=null)
		{
			sql.append(" and external_id=:externalId ");
		}
		if(model.getUrlAddress()!=null)
		{
			sql.append(" and url_address=:urlAddress ");
		}
		if(model.getWebNumber()!=null)
		{
			sql.append(" and web_number=:webNumber ");
		}
		if(model.getWebPassCode()!=null)
		{
			sql.append(" and web_pass_code=:webPassCode ");
		}
		if(model.getStatus()!=null)
		{
			sql.append(" and status=:status ");
		}
		if(model.getCreateDate()!=null)
		{
			sql.append(" and create_date=:createDate ");
		}
		if(model.getModifyDate()!=null)
		{
			sql.append(" and modify_date=:modifyDate ");
		}
		if(model.getHotelAddressForeign()!=null)
		{
			sql.append(" and hotel_address_foreign=:hotelAddressForeign ");
		}
		if(model.getPostalCode()!=null)
		{
			sql.append(" and postal_code=:postalCode ");
		}
		if(model.getNewFitDate()!=null)
		{
			sql.append(" and new_fit_date=:newFitDate ");
		}
		if(model.getIfGoPublic()!=null)
		{
			sql.append(" and if_go_public=:ifGoPublic ");
		}
		if(model.getGoPublicDate()!=null)
		{
			sql.append(" and go_public_date=:goPublicDate ");
		}
		if(model.getMaxReserveDate()!=null)
		{
			sql.append(" and max_reserve_date=:maxReserveDate ");
		}
		if(model.getCommendExpon()!=null)
		{
			sql.append(" and commend_expon=:commendExpon ");
		}
		if(model.getPublicPraise()!=null)
		{
			sql.append(" and public_praise=:publicPraise ");
		}
		if(model.getEMail()!=null)
		{
			sql.append(" and e_mail=:eMail ");
		}
		if(model.getIfOnline()!=null)
		{
			sql.append(" and if_online=:ifOnline ");
		}
		if(model.getSwitchboard()!=null)
		{
			sql.append(" and switchboard=:switchboard ");
		}
		if(model.getIfHotelAccr()!=null)
		{
			sql.append(" and if_hotel_accr=:ifHotelAccr ");
		}
		if(model.getFitKind()!=null)
		{
			sql.append(" and fit_kind=:fitKind ");
		}
		if(model.getAuditType()!=null)
		{
			sql.append(" and audit_type=:auditType ");
		}
		if(model.getAuditKind()!=null)
		{
			sql.append(" and audit_kind=:auditKind ");
		}
		if(model.getFullPinyin()!=null)
		{
			sql.append(" and full_pinyin=:fullPinyin ");
		}
		if(model.getPinyinFir()!=null)
		{
			sql.append(" and pinyin_fir=:pinyinFir ");
		}
		if(model.getIfGroup()!=null)
		{
			sql.append(" and if_group=:ifGroup ");
		}
		if(model.getGroupName()!=null)
		{
			sql.append(" and group_name=:groupName ");
		}
		if(model.getMainFloors()!=null)
		{
			sql.append(" and main_floors=:mainFloors ");
		}
		if(model.getAppendixFloors()!=null)
		{
			sql.append(" and appendix_floors=:appendixFloors ");
		}
		if(model.getHotelAdvantage()!=null)
		{
			sql.append(" and hotel_advantage=:hotelAdvantage ");
		}
		if(model.getIfTop()!=null)
		{
			sql.append(" and if_top=:ifTop ");
		}
		if(model.getIfCancelHold()!=null)
		{
			sql.append(" and if_cancel_hold=:ifCancelHold ");
		}
		if(model.getEnablewaterpool()!=null)
		{
			sql.append(" and enablewaterpool=:enablewaterpool ");
		}
		if(model.getOrderChangeFlag()!=null)
		{
			sql.append(" and order_change_flag=:orderChangeFlag ");
		}
		if(model.getMessageSale()!=null)
		{
			sql.append(" and message_sale=:messageSale ");
		}
		if(model.getSourceHotelId()!=null)
		{
			sql.append(" and source_hotel_id=:sourceHotelId ");
		}
		if(model.getSourceType()!=null)
		{
			sql.append(" and source_type=:sourceType ");
		}
		if(model.getBrandid()!=null)
		{
			sql.append(" and brandid=:brandid ");
		}
		if(model.getHotelImage()!=null)
		{
			sql.append(" and hotel_image=:hotelImage ");
		}
		if(model.getService()!=null)
		{
			sql.append(" and service=:service ");
		}
		if(model.getFacility()!=null)
		{
			sql.append(" and facility=:facility ");
		}
		if(model.getCatering()!=null)
		{
			sql.append(" and catering=:catering ");
		}
		if(model.getRecreation()!=null)
		{
			sql.append(" and recreation=:recreation ");
		}
		if(model.getCreditcard()!=null)
		{
			sql.append(" and creditcard=:creditcard ");
		}
		if(model.getNearby()!=null)
		{
			sql.append(" and nearby=:nearby ");
		}
		if(model.getStreet()!=null)
		{
			sql.append(" and street=:street ");
		}
		if(model.getStreetaddr()!=null)
		{
			sql.append(" and streetaddr=:streetaddr ");
		}
		if(model.getEditType()!=null)
		{
			sql.append(" and edit_type=:editType ");
		}
		if(model.getLowerprice()!=null)
		{
			sql.append(" and lowerprice=:lowerprice ");
		}
		if(model.getImpressdesc()!=null)
		{
			sql.append(" and impressdesc=:impressdesc ");
		}
		if(model.getRelationid()!=null)
		{
			sql.append(" and relationid=:relationid ");
		}
		if(model.getTuid()!=null)
		{
			sql.append(" and tuid=:tuid ");
		}
		if(model.getLowerprice2()!=null)
		{
			sql.append(" and lowerprice2=:lowerprice2 ");
		}
		if(model.getIsmajor()!=null)
		{
			sql.append(" and ismajor=:ismajor ");
		}
		if(model.getTravelid()!=null)
		{
			sql.append(" and travelid=:travelid ");
		}
		if(model.getFlag()!=null)
		{
			sql.append(" and flag=:flag ");
		}
		if(model.getBusinessAreaName()!=null)
		{
			sql.append(" and business_area_name=:businessAreaName ");
		}
		if(model.getHighestprice()!=null)
		{
			sql.append(" and highestprice=:highestprice ");
		}
		if(model.getMicrosms()!=null)
		{
			sql.append(" and microsms=:microsms ");
		}
		if(model.getCashback()!=null)
		{
			sql.append(" and cashback=:cashback ");
		}
		if(model.getRoomimage()!=null)
		{
			sql.append(" and roomimage=:roomimage ");
		}
		if(model.getRoomimagecount()!=null)
		{
			sql.append(" and roomimagecount=:roomimagecount ");
		}
		if(model.getIftrue()!=null)
		{
			sql.append(" and iftrue=:iftrue ");
		}
		if(model.getCurversion()!=null)
		{
			sql.append(" and curversion=:curversion ");
		}
		if(model.getPaymenttype()!=null)
		{
			sql.append(" and paymenttype=:paymenttype ");
		}
		if(topN>0)
		{
			sql.append(" and rownum <= "+topN);
		}
		SqlParameterSource sps=new BeanPropertySqlParameterSource(model);
		List<CimTpcHtlInfoT> modellist = namedParameterJdbcTemplate.query(sql.toString(),sps,new BeanPropertyRowMapper(CimTpcHtlInfoT.class));
		return modellist;
	}
	
	public List<CimTpcHtlInfoT> getCimTpcHtlInfoTListByCoud(CimTpcHtlInfoT model)  throws DAOException 
	{
		return getCimTpcHtlInfoTListByCoud(model,-1);
	}
	
	//@Cacheable(cacheName = "CimTpcHtlInfoTDAO",keyGenerator = @KeyGenerator (name = "StringCacheKeyGenerator",properties = {@Property( name="useReflection", value="true" ), @Property( name="checkforCycles", value="true" ),@Property( name="includeMethod", value="true" ) }   ))
	public List<CimTpcHtlInfoT> getCimTpcHtlInfoTListByExact(CimTpcHtlInfoT model)  throws DAOException  {
		StringBuffer sql=new StringBuffer("select t.*,rowid as crowid from cim_tpc_htl_info_t t where 1=1 ");
			sql.append(" and city_code=:cityCode ");
			sql.append(" and district_code=:districtCode ");
			sql.append(" and company_id=:companyId ");
			sql.append(" and hotel_name=:hotelName ");
			sql.append(" and hotel_name_foreign=:hotelNameForeign ");
			sql.append(" and hotel_name_simple=:hotelNameSimple ");
			sql.append(" and key_words=:keyWords ");
			sql.append(" and hotel_address=:hotelAddress ");
			sql.append(" and hotel_type=:hotelType ");
			sql.append(" and hotel_kind=:hotelKind ");
			sql.append(" and hotel_level=:hotelLevel ");
			sql.append(" and hotel_intro=:hotelIntro ");
			sql.append(" and contact_phone=:contactPhone ");
			sql.append(" and contact_fax=:contactFax ");
			sql.append(" and hotel_website=:hotelWebsite ");
			sql.append(" and business_area=:businessArea ");
			sql.append(" and hotel_route=:hotelRoute ");
			sql.append(" and start_date=:startDate ");
			sql.append(" and room_number=:roomNumber ");
			sql.append(" and pay_way=:payWay ");
			sql.append(" and longitude=:longitude ");
			sql.append(" and latitude=:latitude ");
			sql.append(" and if_foreign=:ifForeign ");
			sql.append(" and confer_status=:conferStatus ");
			sql.append(" and belong_code=:belongCode ");
			sql.append(" and if_change_send=:ifChangeSend ");
			sql.append(" and external_id=:externalId ");
			sql.append(" and url_address=:urlAddress ");
			sql.append(" and web_number=:webNumber ");
			sql.append(" and web_pass_code=:webPassCode ");
			sql.append(" and status=:status ");
			sql.append(" and create_date=:createDate ");
			sql.append(" and modify_date=:modifyDate ");
			sql.append(" and hotel_address_foreign=:hotelAddressForeign ");
			sql.append(" and postal_code=:postalCode ");
			sql.append(" and new_fit_date=:newFitDate ");
			sql.append(" and if_go_public=:ifGoPublic ");
			sql.append(" and go_public_date=:goPublicDate ");
			sql.append(" and max_reserve_date=:maxReserveDate ");
			sql.append(" and commend_expon=:commendExpon ");
			sql.append(" and public_praise=:publicPraise ");
			sql.append(" and e_mail=:eMail ");
			sql.append(" and if_online=:ifOnline ");
			sql.append(" and switchboard=:switchboard ");
			sql.append(" and if_hotel_accr=:ifHotelAccr ");
			sql.append(" and fit_kind=:fitKind ");
			sql.append(" and audit_type=:auditType ");
			sql.append(" and audit_kind=:auditKind ");
			sql.append(" and full_pinyin=:fullPinyin ");
			sql.append(" and pinyin_fir=:pinyinFir ");
			sql.append(" and if_group=:ifGroup ");
			sql.append(" and group_name=:groupName ");
			sql.append(" and main_floors=:mainFloors ");
			sql.append(" and appendix_floors=:appendixFloors ");
			sql.append(" and hotel_advantage=:hotelAdvantage ");
			sql.append(" and if_top=:ifTop ");
			sql.append(" and if_cancel_hold=:ifCancelHold ");
			sql.append(" and enablewaterpool=:enablewaterpool ");
			sql.append(" and order_change_flag=:orderChangeFlag ");
			sql.append(" and message_sale=:messageSale ");
			sql.append(" and source_hotel_id=:sourceHotelId ");
			sql.append(" and source_type=:sourceType ");
			sql.append(" and brandid=:brandid ");
			sql.append(" and hotel_image=:hotelImage ");
			sql.append(" and service=:service ");
			sql.append(" and facility=:facility ");
			sql.append(" and catering=:catering ");
			sql.append(" and recreation=:recreation ");
			sql.append(" and creditcard=:creditcard ");
			sql.append(" and nearby=:nearby ");
			sql.append(" and street=:street ");
			sql.append(" and streetaddr=:streetaddr ");
			sql.append(" and edit_type=:editType ");
			sql.append(" and lowerprice=:lowerprice ");
			sql.append(" and impressdesc=:impressdesc ");
			sql.append(" and relationid=:relationid ");
			sql.append(" and tuid=:tuid ");
			sql.append(" and lowerprice2=:lowerprice2 ");
			sql.append(" and ismajor=:ismajor ");
			sql.append(" and travelid=:travelid ");
			sql.append(" and flag=:flag ");
			sql.append(" and business_area_name=:businessAreaName ");
			sql.append(" and highestprice=:highestprice ");
			sql.append(" and microsms=:microsms ");
			sql.append(" and cashback=:cashback ");
			sql.append(" and roomimage=:roomimage ");
			sql.append(" and roomimagecount=:roomimagecount ");
			sql.append(" and iftrue=:iftrue ");
			sql.append(" and curversion=:curversion ");
			sql.append(" and paymenttype=:paymenttype ");
		
		SqlParameterSource sps=new BeanPropertySqlParameterSource(model);
		List<CimTpcHtlInfoT> modellist = namedParameterJdbcTemplate.query(sql.toString(),sps,new BeanPropertyRowMapper(CimTpcHtlInfoT.class));
		return modellist;
	}
	
	
	
	//@Cacheable(cacheName = "CimTpcHtlInfoTDAO",keyGenerator = @KeyGenerator (name = "StringCacheKeyGenerator",properties = {@Property( name="useReflection", value="true" ), @Property( name="checkforCycles", value="true" ),@Property( name="includeMethod", value="true" ) }   ))
	public List<Map<String, Object>> getListMapByCoud(CimTpcHtlInfoT model)  throws DAOException  {
		StringBuffer sql=new StringBuffer("select t.*,rowid as crowid  from cim_tpc_htl_info_t  t where 1=1 ");
		if(model.getCityCode()!=null)
		{
			sql.append(" and city_code=:cityCode ");
		}
		if(model.getDistrictCode()!=null)
		{
			sql.append(" and district_code=:districtCode ");
		}
		if(model.getCompanyId()!=null)
		{
			sql.append(" and company_id=:companyId ");
		}
		if(model.getHotelName()!=null)
		{
			sql.append(" and hotel_name=:hotelName ");
		}
		if(model.getHotelNameForeign()!=null)
		{
			sql.append(" and hotel_name_foreign=:hotelNameForeign ");
		}
		if(model.getHotelNameSimple()!=null)
		{
			sql.append(" and hotel_name_simple=:hotelNameSimple ");
		}
		if(model.getKeyWords()!=null)
		{
			sql.append(" and key_words=:keyWords ");
		}
		if(model.getHotelAddress()!=null)
		{
			sql.append(" and hotel_address=:hotelAddress ");
		}
		if(model.getHotelType()!=null)
		{
			sql.append(" and hotel_type=:hotelType ");
		}
		if(model.getHotelKind()!=null)
		{
			sql.append(" and hotel_kind=:hotelKind ");
		}
		if(model.getHotelLevel()!=null)
		{
			sql.append(" and hotel_level=:hotelLevel ");
		}
		if(model.getHotelIntro()!=null)
		{
			sql.append(" and hotel_intro=:hotelIntro ");
		}
		if(model.getContactPhone()!=null)
		{
			sql.append(" and contact_phone=:contactPhone ");
		}
		if(model.getContactFax()!=null)
		{
			sql.append(" and contact_fax=:contactFax ");
		}
		if(model.getHotelWebsite()!=null)
		{
			sql.append(" and hotel_website=:hotelWebsite ");
		}
		if(model.getBusinessArea()!=null)
		{
			sql.append(" and business_area=:businessArea ");
		}
		if(model.getHotelRoute()!=null)
		{
			sql.append(" and hotel_route=:hotelRoute ");
		}
		if(model.getStartDate()!=null)
		{
			sql.append(" and start_date=:startDate ");
		}
		if(model.getRoomNumber()!=null)
		{
			sql.append(" and room_number=:roomNumber ");
		}
		if(model.getPayWay()!=null)
		{
			sql.append(" and pay_way=:payWay ");
		}
		if(model.getLongitude()!=null)
		{
			sql.append(" and longitude=:longitude ");
		}
		if(model.getLatitude()!=null)
		{
			sql.append(" and latitude=:latitude ");
		}
		if(model.getIfForeign()!=null)
		{
			sql.append(" and if_foreign=:ifForeign ");
		}
		if(model.getConferStatus()!=null)
		{
			sql.append(" and confer_status=:conferStatus ");
		}
		if(model.getBelongCode()!=null)
		{
			sql.append(" and belong_code=:belongCode ");
		}
		if(model.getIfChangeSend()!=null)
		{
			sql.append(" and if_change_send=:ifChangeSend ");
		}
		if(model.getExternalId()!=null)
		{
			sql.append(" and external_id=:externalId ");
		}
		if(model.getUrlAddress()!=null)
		{
			sql.append(" and url_address=:urlAddress ");
		}
		if(model.getWebNumber()!=null)
		{
			sql.append(" and web_number=:webNumber ");
		}
		if(model.getWebPassCode()!=null)
		{
			sql.append(" and web_pass_code=:webPassCode ");
		}
		if(model.getStatus()!=null)
		{
			sql.append(" and status=:status ");
		}
		if(model.getCreateDate()!=null)
		{
			sql.append(" and create_date=:createDate ");
		}
		if(model.getModifyDate()!=null)
		{
			sql.append(" and modify_date=:modifyDate ");
		}
		if(model.getHotelAddressForeign()!=null)
		{
			sql.append(" and hotel_address_foreign=:hotelAddressForeign ");
		}
		if(model.getPostalCode()!=null)
		{
			sql.append(" and postal_code=:postalCode ");
		}
		if(model.getNewFitDate()!=null)
		{
			sql.append(" and new_fit_date=:newFitDate ");
		}
		if(model.getIfGoPublic()!=null)
		{
			sql.append(" and if_go_public=:ifGoPublic ");
		}
		if(model.getGoPublicDate()!=null)
		{
			sql.append(" and go_public_date=:goPublicDate ");
		}
		if(model.getMaxReserveDate()!=null)
		{
			sql.append(" and max_reserve_date=:maxReserveDate ");
		}
		if(model.getCommendExpon()!=null)
		{
			sql.append(" and commend_expon=:commendExpon ");
		}
		if(model.getPublicPraise()!=null)
		{
			sql.append(" and public_praise=:publicPraise ");
		}
		if(model.getEMail()!=null)
		{
			sql.append(" and e_mail=:eMail ");
		}
		if(model.getIfOnline()!=null)
		{
			sql.append(" and if_online=:ifOnline ");
		}
		if(model.getSwitchboard()!=null)
		{
			sql.append(" and switchboard=:switchboard ");
		}
		if(model.getIfHotelAccr()!=null)
		{
			sql.append(" and if_hotel_accr=:ifHotelAccr ");
		}
		if(model.getFitKind()!=null)
		{
			sql.append(" and fit_kind=:fitKind ");
		}
		if(model.getAuditType()!=null)
		{
			sql.append(" and audit_type=:auditType ");
		}
		if(model.getAuditKind()!=null)
		{
			sql.append(" and audit_kind=:auditKind ");
		}
		if(model.getFullPinyin()!=null)
		{
			sql.append(" and full_pinyin=:fullPinyin ");
		}
		if(model.getPinyinFir()!=null)
		{
			sql.append(" and pinyin_fir=:pinyinFir ");
		}
		if(model.getIfGroup()!=null)
		{
			sql.append(" and if_group=:ifGroup ");
		}
		if(model.getGroupName()!=null)
		{
			sql.append(" and group_name=:groupName ");
		}
		if(model.getMainFloors()!=null)
		{
			sql.append(" and main_floors=:mainFloors ");
		}
		if(model.getAppendixFloors()!=null)
		{
			sql.append(" and appendix_floors=:appendixFloors ");
		}
		if(model.getHotelAdvantage()!=null)
		{
			sql.append(" and hotel_advantage=:hotelAdvantage ");
		}
		if(model.getIfTop()!=null)
		{
			sql.append(" and if_top=:ifTop ");
		}
		if(model.getIfCancelHold()!=null)
		{
			sql.append(" and if_cancel_hold=:ifCancelHold ");
		}
		if(model.getEnablewaterpool()!=null)
		{
			sql.append(" and enablewaterpool=:enablewaterpool ");
		}
		if(model.getOrderChangeFlag()!=null)
		{
			sql.append(" and order_change_flag=:orderChangeFlag ");
		}
		if(model.getMessageSale()!=null)
		{
			sql.append(" and message_sale=:messageSale ");
		}
		if(model.getSourceHotelId()!=null)
		{
			sql.append(" and source_hotel_id=:sourceHotelId ");
		}
		if(model.getSourceType()!=null)
		{
			sql.append(" and source_type=:sourceType ");
		}
		if(model.getBrandid()!=null)
		{
			sql.append(" and brandid=:brandid ");
		}
		if(model.getHotelImage()!=null)
		{
			sql.append(" and hotel_image=:hotelImage ");
		}
		if(model.getService()!=null)
		{
			sql.append(" and service=:service ");
		}
		if(model.getFacility()!=null)
		{
			sql.append(" and facility=:facility ");
		}
		if(model.getCatering()!=null)
		{
			sql.append(" and catering=:catering ");
		}
		if(model.getRecreation()!=null)
		{
			sql.append(" and recreation=:recreation ");
		}
		if(model.getCreditcard()!=null)
		{
			sql.append(" and creditcard=:creditcard ");
		}
		if(model.getNearby()!=null)
		{
			sql.append(" and nearby=:nearby ");
		}
		if(model.getStreet()!=null)
		{
			sql.append(" and street=:street ");
		}
		if(model.getStreetaddr()!=null)
		{
			sql.append(" and streetaddr=:streetaddr ");
		}
		if(model.getEditType()!=null)
		{
			sql.append(" and edit_type=:editType ");
		}
		if(model.getLowerprice()!=null)
		{
			sql.append(" and lowerprice=:lowerprice ");
		}
		if(model.getImpressdesc()!=null)
		{
			sql.append(" and impressdesc=:impressdesc ");
		}
		if(model.getRelationid()!=null)
		{
			sql.append(" and relationid=:relationid ");
		}
		if(model.getTuid()!=null)
		{
			sql.append(" and tuid=:tuid ");
		}
		if(model.getLowerprice2()!=null)
		{
			sql.append(" and lowerprice2=:lowerprice2 ");
		}
		if(model.getIsmajor()!=null)
		{
			sql.append(" and ismajor=:ismajor ");
		}
		if(model.getTravelid()!=null)
		{
			sql.append(" and travelid=:travelid ");
		}
		if(model.getFlag()!=null)
		{
			sql.append(" and flag=:flag ");
		}
		if(model.getBusinessAreaName()!=null)
		{
			sql.append(" and business_area_name=:businessAreaName ");
		}
		if(model.getHighestprice()!=null)
		{
			sql.append(" and highestprice=:highestprice ");
		}
		if(model.getMicrosms()!=null)
		{
			sql.append(" and microsms=:microsms ");
		}
		if(model.getCashback()!=null)
		{
			sql.append(" and cashback=:cashback ");
		}
		if(model.getRoomimage()!=null)
		{
			sql.append(" and roomimage=:roomimage ");
		}
		if(model.getRoomimagecount()!=null)
		{
			sql.append(" and roomimagecount=:roomimagecount ");
		}
		if(model.getIftrue()!=null)
		{
			sql.append(" and iftrue=:iftrue ");
		}
		if(model.getCurversion()!=null)
		{
			sql.append(" and curversion=:curversion ");
		}
		if(model.getPaymenttype()!=null)
		{
			sql.append(" and paymenttype=:paymenttype ");
		}
		
		SqlParameterSource sps=new BeanPropertySqlParameterSource(model); 
		List<Map<String, Object>> modellist = namedParameterJdbcTemplate.queryForList(sql.toString(),sps);
		return modellist;
	}
	
	
	//@Cacheable(cacheName = "CimTpcHtlInfoTDAO",keyGenerator = @KeyGenerator (name = "StringCacheKeyGenerator",properties = {@Property( name="useReflection", value="true" ), @Property( name="checkforCycles", value="true" ),@Property( name="includeMethod", value="true" ) }   ))
	public List<Map<String, Object>> getListMapByExact(CimTpcHtlInfoT model)  throws DAOException  {
		StringBuffer sql=new StringBuffer("select t.*,rowid as crowid  from cim_tpc_htl_info_t t where 1=1 ");
			sql.append(" and city_code=:cityCode ");
			sql.append(" and district_code=:districtCode ");
			sql.append(" and company_id=:companyId ");
			sql.append(" and hotel_name=:hotelName ");
			sql.append(" and hotel_name_foreign=:hotelNameForeign ");
			sql.append(" and hotel_name_simple=:hotelNameSimple ");
			sql.append(" and key_words=:keyWords ");
			sql.append(" and hotel_address=:hotelAddress ");
			sql.append(" and hotel_type=:hotelType ");
			sql.append(" and hotel_kind=:hotelKind ");
			sql.append(" and hotel_level=:hotelLevel ");
			sql.append(" and hotel_intro=:hotelIntro ");
			sql.append(" and contact_phone=:contactPhone ");
			sql.append(" and contact_fax=:contactFax ");
			sql.append(" and hotel_website=:hotelWebsite ");
			sql.append(" and business_area=:businessArea ");
			sql.append(" and hotel_route=:hotelRoute ");
			sql.append(" and start_date=:startDate ");
			sql.append(" and room_number=:roomNumber ");
			sql.append(" and pay_way=:payWay ");
			sql.append(" and longitude=:longitude ");
			sql.append(" and latitude=:latitude ");
			sql.append(" and if_foreign=:ifForeign ");
			sql.append(" and confer_status=:conferStatus ");
			sql.append(" and belong_code=:belongCode ");
			sql.append(" and if_change_send=:ifChangeSend ");
			sql.append(" and external_id=:externalId ");
			sql.append(" and url_address=:urlAddress ");
			sql.append(" and web_number=:webNumber ");
			sql.append(" and web_pass_code=:webPassCode ");
			sql.append(" and status=:status ");
			sql.append(" and create_date=:createDate ");
			sql.append(" and modify_date=:modifyDate ");
			sql.append(" and hotel_address_foreign=:hotelAddressForeign ");
			sql.append(" and postal_code=:postalCode ");
			sql.append(" and new_fit_date=:newFitDate ");
			sql.append(" and if_go_public=:ifGoPublic ");
			sql.append(" and go_public_date=:goPublicDate ");
			sql.append(" and max_reserve_date=:maxReserveDate ");
			sql.append(" and commend_expon=:commendExpon ");
			sql.append(" and public_praise=:publicPraise ");
			sql.append(" and e_mail=:eMail ");
			sql.append(" and if_online=:ifOnline ");
			sql.append(" and switchboard=:switchboard ");
			sql.append(" and if_hotel_accr=:ifHotelAccr ");
			sql.append(" and fit_kind=:fitKind ");
			sql.append(" and audit_type=:auditType ");
			sql.append(" and audit_kind=:auditKind ");
			sql.append(" and full_pinyin=:fullPinyin ");
			sql.append(" and pinyin_fir=:pinyinFir ");
			sql.append(" and if_group=:ifGroup ");
			sql.append(" and group_name=:groupName ");
			sql.append(" and main_floors=:mainFloors ");
			sql.append(" and appendix_floors=:appendixFloors ");
			sql.append(" and hotel_advantage=:hotelAdvantage ");
			sql.append(" and if_top=:ifTop ");
			sql.append(" and if_cancel_hold=:ifCancelHold ");
			sql.append(" and enablewaterpool=:enablewaterpool ");
			sql.append(" and order_change_flag=:orderChangeFlag ");
			sql.append(" and message_sale=:messageSale ");
			sql.append(" and source_hotel_id=:sourceHotelId ");
			sql.append(" and source_type=:sourceType ");
			sql.append(" and brandid=:brandid ");
			sql.append(" and hotel_image=:hotelImage ");
			sql.append(" and service=:service ");
			sql.append(" and facility=:facility ");
			sql.append(" and catering=:catering ");
			sql.append(" and recreation=:recreation ");
			sql.append(" and creditcard=:creditcard ");
			sql.append(" and nearby=:nearby ");
			sql.append(" and street=:street ");
			sql.append(" and streetaddr=:streetaddr ");
			sql.append(" and edit_type=:editType ");
			sql.append(" and lowerprice=:lowerprice ");
			sql.append(" and impressdesc=:impressdesc ");
			sql.append(" and relationid=:relationid ");
			sql.append(" and tuid=:tuid ");
			sql.append(" and lowerprice2=:lowerprice2 ");
			sql.append(" and ismajor=:ismajor ");
			sql.append(" and travelid=:travelid ");
			sql.append(" and flag=:flag ");
			sql.append(" and business_area_name=:businessAreaName ");
			sql.append(" and highestprice=:highestprice ");
			sql.append(" and microsms=:microsms ");
			sql.append(" and cashback=:cashback ");
			sql.append(" and roomimage=:roomimage ");
			sql.append(" and roomimagecount=:roomimagecount ");
			sql.append(" and iftrue=:iftrue ");
			sql.append(" and curversion=:curversion ");
			sql.append(" and paymenttype=:paymenttype ");
		
		SqlParameterSource sps=new BeanPropertySqlParameterSource(model); 
		List<Map<String, Object>> modellist = namedParameterJdbcTemplate.queryForList(sql.toString(),sps);
		return modellist;
	}
	
	
	//@Cacheable(cacheName = "CimTpcHtlInfoTDAO",keyGenerator = @KeyGenerator (name = "StringCacheKeyGenerator",properties = {@Property( name="useReflection", value="true" ), @Property( name="checkforCycles", value="true" ),@Property( name="includeMethod", value="true" ) }   ))
	public List<CimTpcHtlInfoT>  getPageListByCound(CimTpcHtlInfoT model, int pageIndex,int rows)  throws DAOException  {
		StringBuffer sql=new StringBuffer("select t.*,rowid as crowid  from cim_tpc_htl_info_t t where 1=1 ");
		if(model.getCityCode()!=null)
		{
			sql.append(" and city_code=:cityCode ");
		}
		if(model.getDistrictCode()!=null)
		{
			sql.append(" and district_code=:districtCode ");
		}
		if(model.getCompanyId()!=null)
		{
			sql.append(" and company_id=:companyId ");
		}
		if(model.getHotelName()!=null)
		{
			sql.append(" and hotel_name=:hotelName ");
		}
		if(model.getHotelNameForeign()!=null)
		{
			sql.append(" and hotel_name_foreign=:hotelNameForeign ");
		}
		if(model.getHotelNameSimple()!=null)
		{
			sql.append(" and hotel_name_simple=:hotelNameSimple ");
		}
		if(model.getKeyWords()!=null)
		{
			sql.append(" and key_words=:keyWords ");
		}
		if(model.getHotelAddress()!=null)
		{
			sql.append(" and hotel_address=:hotelAddress ");
		}
		if(model.getHotelType()!=null)
		{
			sql.append(" and hotel_type=:hotelType ");
		}
		if(model.getHotelKind()!=null)
		{
			sql.append(" and hotel_kind=:hotelKind ");
		}
		if(model.getHotelLevel()!=null)
		{
			sql.append(" and hotel_level=:hotelLevel ");
		}
		if(model.getHotelIntro()!=null)
		{
			sql.append(" and hotel_intro=:hotelIntro ");
		}
		if(model.getContactPhone()!=null)
		{
			sql.append(" and contact_phone=:contactPhone ");
		}
		if(model.getContactFax()!=null)
		{
			sql.append(" and contact_fax=:contactFax ");
		}
		if(model.getHotelWebsite()!=null)
		{
			sql.append(" and hotel_website=:hotelWebsite ");
		}
		if(model.getBusinessArea()!=null)
		{
			sql.append(" and business_area=:businessArea ");
		}
		if(model.getHotelRoute()!=null)
		{
			sql.append(" and hotel_route=:hotelRoute ");
		}
		if(model.getStartDate()!=null)
		{
			sql.append(" and start_date=:startDate ");
		}
		if(model.getRoomNumber()!=null)
		{
			sql.append(" and room_number=:roomNumber ");
		}
		if(model.getPayWay()!=null)
		{
			sql.append(" and pay_way=:payWay ");
		}
		if(model.getLongitude()!=null)
		{
			sql.append(" and longitude=:longitude ");
		}
		if(model.getLatitude()!=null)
		{
			sql.append(" and latitude=:latitude ");
		}
		if(model.getIfForeign()!=null)
		{
			sql.append(" and if_foreign=:ifForeign ");
		}
		if(model.getConferStatus()!=null)
		{
			sql.append(" and confer_status=:conferStatus ");
		}
		if(model.getBelongCode()!=null)
		{
			sql.append(" and belong_code=:belongCode ");
		}
		if(model.getIfChangeSend()!=null)
		{
			sql.append(" and if_change_send=:ifChangeSend ");
		}
		if(model.getExternalId()!=null)
		{
			sql.append(" and external_id=:externalId ");
		}
		if(model.getUrlAddress()!=null)
		{
			sql.append(" and url_address=:urlAddress ");
		}
		if(model.getWebNumber()!=null)
		{
			sql.append(" and web_number=:webNumber ");
		}
		if(model.getWebPassCode()!=null)
		{
			sql.append(" and web_pass_code=:webPassCode ");
		}
		if(model.getStatus()!=null)
		{
			sql.append(" and status=:status ");
		}
		if(model.getCreateDate()!=null)
		{
			sql.append(" and create_date=:createDate ");
		}
		if(model.getModifyDate()!=null)
		{
			sql.append(" and modify_date=:modifyDate ");
		}
		if(model.getHotelAddressForeign()!=null)
		{
			sql.append(" and hotel_address_foreign=:hotelAddressForeign ");
		}
		if(model.getPostalCode()!=null)
		{
			sql.append(" and postal_code=:postalCode ");
		}
		if(model.getNewFitDate()!=null)
		{
			sql.append(" and new_fit_date=:newFitDate ");
		}
		if(model.getIfGoPublic()!=null)
		{
			sql.append(" and if_go_public=:ifGoPublic ");
		}
		if(model.getGoPublicDate()!=null)
		{
			sql.append(" and go_public_date=:goPublicDate ");
		}
		if(model.getMaxReserveDate()!=null)
		{
			sql.append(" and max_reserve_date=:maxReserveDate ");
		}
		if(model.getCommendExpon()!=null)
		{
			sql.append(" and commend_expon=:commendExpon ");
		}
		if(model.getPublicPraise()!=null)
		{
			sql.append(" and public_praise=:publicPraise ");
		}
		if(model.getEMail()!=null)
		{
			sql.append(" and e_mail=:eMail ");
		}
		if(model.getIfOnline()!=null)
		{
			sql.append(" and if_online=:ifOnline ");
		}
		if(model.getSwitchboard()!=null)
		{
			sql.append(" and switchboard=:switchboard ");
		}
		if(model.getIfHotelAccr()!=null)
		{
			sql.append(" and if_hotel_accr=:ifHotelAccr ");
		}
		if(model.getFitKind()!=null)
		{
			sql.append(" and fit_kind=:fitKind ");
		}
		if(model.getAuditType()!=null)
		{
			sql.append(" and audit_type=:auditType ");
		}
		if(model.getAuditKind()!=null)
		{
			sql.append(" and audit_kind=:auditKind ");
		}
		if(model.getFullPinyin()!=null)
		{
			sql.append(" and full_pinyin=:fullPinyin ");
		}
		if(model.getPinyinFir()!=null)
		{
			sql.append(" and pinyin_fir=:pinyinFir ");
		}
		if(model.getIfGroup()!=null)
		{
			sql.append(" and if_group=:ifGroup ");
		}
		if(model.getGroupName()!=null)
		{
			sql.append(" and group_name=:groupName ");
		}
		if(model.getMainFloors()!=null)
		{
			sql.append(" and main_floors=:mainFloors ");
		}
		if(model.getAppendixFloors()!=null)
		{
			sql.append(" and appendix_floors=:appendixFloors ");
		}
		if(model.getHotelAdvantage()!=null)
		{
			sql.append(" and hotel_advantage=:hotelAdvantage ");
		}
		if(model.getIfTop()!=null)
		{
			sql.append(" and if_top=:ifTop ");
		}
		if(model.getIfCancelHold()!=null)
		{
			sql.append(" and if_cancel_hold=:ifCancelHold ");
		}
		if(model.getEnablewaterpool()!=null)
		{
			sql.append(" and enablewaterpool=:enablewaterpool ");
		}
		if(model.getOrderChangeFlag()!=null)
		{
			sql.append(" and order_change_flag=:orderChangeFlag ");
		}
		if(model.getMessageSale()!=null)
		{
			sql.append(" and message_sale=:messageSale ");
		}
		if(model.getSourceHotelId()!=null)
		{
			sql.append(" and source_hotel_id=:sourceHotelId ");
		}
		if(model.getSourceType()!=null)
		{
			sql.append(" and source_type=:sourceType ");
		}
		if(model.getBrandid()!=null)
		{
			sql.append(" and brandid=:brandid ");
		}
		if(model.getHotelImage()!=null)
		{
			sql.append(" and hotel_image=:hotelImage ");
		}
		if(model.getService()!=null)
		{
			sql.append(" and service=:service ");
		}
		if(model.getFacility()!=null)
		{
			sql.append(" and facility=:facility ");
		}
		if(model.getCatering()!=null)
		{
			sql.append(" and catering=:catering ");
		}
		if(model.getRecreation()!=null)
		{
			sql.append(" and recreation=:recreation ");
		}
		if(model.getCreditcard()!=null)
		{
			sql.append(" and creditcard=:creditcard ");
		}
		if(model.getNearby()!=null)
		{
			sql.append(" and nearby=:nearby ");
		}
		if(model.getStreet()!=null)
		{
			sql.append(" and street=:street ");
		}
		if(model.getStreetaddr()!=null)
		{
			sql.append(" and streetaddr=:streetaddr ");
		}
		if(model.getEditType()!=null)
		{
			sql.append(" and edit_type=:editType ");
		}
		if(model.getLowerprice()!=null)
		{
			sql.append(" and lowerprice=:lowerprice ");
		}
		if(model.getImpressdesc()!=null)
		{
			sql.append(" and impressdesc=:impressdesc ");
		}
		if(model.getRelationid()!=null)
		{
			sql.append(" and relationid=:relationid ");
		}
		if(model.getTuid()!=null)
		{
			sql.append(" and tuid=:tuid ");
		}
		if(model.getLowerprice2()!=null)
		{
			sql.append(" and lowerprice2=:lowerprice2 ");
		}
		if(model.getIsmajor()!=null)
		{
			sql.append(" and ismajor=:ismajor ");
		}
		if(model.getTravelid()!=null)
		{
			sql.append(" and travelid=:travelid ");
		}
		if(model.getFlag()!=null)
		{
			sql.append(" and flag=:flag ");
		}
		if(model.getBusinessAreaName()!=null)
		{
			sql.append(" and business_area_name=:businessAreaName ");
		}
		if(model.getHighestprice()!=null)
		{
			sql.append(" and highestprice=:highestprice ");
		}
		if(model.getMicrosms()!=null)
		{
			sql.append(" and microsms=:microsms ");
		}
		if(model.getCashback()!=null)
		{
			sql.append(" and cashback=:cashback ");
		}
		if(model.getRoomimage()!=null)
		{
			sql.append(" and roomimage=:roomimage ");
		}
		if(model.getRoomimagecount()!=null)
		{
			sql.append(" and roomimagecount=:roomimagecount ");
		}
		if(model.getIftrue()!=null)
		{
			sql.append(" and iftrue=:iftrue ");
		}
		if(model.getCurversion()!=null)
		{
			sql.append(" and curversion=:curversion ");
		}
		if(model.getPaymenttype()!=null)
		{
			sql.append(" and paymenttype=:paymenttype ");
		}
		
		String sqlfinal=DBHelper.getPageSqlByPageIndex(sql.toString(),new Integer(pageIndex).toString(),new Integer(rows).toString());
		
		SqlParameterSource sps=new BeanPropertySqlParameterSource(model);
		
		List<CimTpcHtlInfoT> modellist = namedParameterJdbcTemplate.query(sqlfinal,sps,new BeanPropertyRowMapper<CimTpcHtlInfoT>(CimTpcHtlInfoT.class));
		
		return modellist;
	}
	
	
	//@Cacheable(cacheName = "CimTpcHtlInfoTDAO",keyGenerator = @KeyGenerator (name = "StringCacheKeyGenerator",properties = {@Property( name="useReflection", value="true" ), @Property( name="checkforCycles", value="true" ),@Property( name="includeMethod", value="true" ) }   ))
	public List<CimTpcHtlInfoT>  getPageListByExact(CimTpcHtlInfoT model, int pageIndex,int rows)   throws DAOException {
		StringBuffer sql=new StringBuffer("select t.*,rowid as crowid  from cim_tpc_htl_info_t t where 1=1 ");
			if(model.getCityCode()!=null)
			{
				sql.append(" and city_code=:cityCode ");
			}
			if(model.getDistrictCode()!=null)
			{
				sql.append(" and district_code=:districtCode ");
			}
			if(model.getCompanyId()!=null)
			{
				sql.append(" and company_id=:companyId ");
			}
			if(model.getHotelName()!=null)
			{
				sql.append(" and hotel_name=:hotelName ");
			}
			if(model.getHotelNameForeign()!=null)
			{
				sql.append(" and hotel_name_foreign=:hotelNameForeign ");
			}
			if(model.getHotelNameSimple()!=null)
			{
				sql.append(" and hotel_name_simple=:hotelNameSimple ");
			}
			if(model.getKeyWords()!=null)
			{
				sql.append(" and key_words=:keyWords ");
			}
			if(model.getHotelAddress()!=null)
			{
				sql.append(" and hotel_address=:hotelAddress ");
			}
			if(model.getHotelType()!=null)
			{
				sql.append(" and hotel_type=:hotelType ");
			}
			if(model.getHotelKind()!=null)
			{
				sql.append(" and hotel_kind=:hotelKind ");
			}
			if(model.getHotelLevel()!=null)
			{
				sql.append(" and hotel_level=:hotelLevel ");
			}
			if(model.getHotelIntro()!=null)
			{
				sql.append(" and hotel_intro=:hotelIntro ");
			}
			if(model.getContactPhone()!=null)
			{
				sql.append(" and contact_phone=:contactPhone ");
			}
			if(model.getContactFax()!=null)
			{
				sql.append(" and contact_fax=:contactFax ");
			}
			if(model.getHotelWebsite()!=null)
			{
				sql.append(" and hotel_website=:hotelWebsite ");
			}
			if(model.getBusinessArea()!=null)
			{
				sql.append(" and business_area=:businessArea ");
			}
			if(model.getHotelRoute()!=null)
			{
				sql.append(" and hotel_route=:hotelRoute ");
			}
			if(model.getStartDate()!=null)
			{
				sql.append(" and start_date=:startDate ");
			}
			if(model.getRoomNumber()!=null)
			{
				sql.append(" and room_number=:roomNumber ");
			}
			if(model.getPayWay()!=null)
			{
				sql.append(" and pay_way=:payWay ");
			}
			if(model.getLongitude()!=null)
			{
				sql.append(" and longitude=:longitude ");
			}
			if(model.getLatitude()!=null)
			{
				sql.append(" and latitude=:latitude ");
			}
			if(model.getIfForeign()!=null)
			{
				sql.append(" and if_foreign=:ifForeign ");
			}
			if(model.getConferStatus()!=null)
			{
				sql.append(" and confer_status=:conferStatus ");
			}
			if(model.getBelongCode()!=null)
			{
				sql.append(" and belong_code=:belongCode ");
			}
			if(model.getIfChangeSend()!=null)
			{
				sql.append(" and if_change_send=:ifChangeSend ");
			}
			if(model.getExternalId()!=null)
			{
				sql.append(" and external_id=:externalId ");
			}
			if(model.getUrlAddress()!=null)
			{
				sql.append(" and url_address=:urlAddress ");
			}
			if(model.getWebNumber()!=null)
			{
				sql.append(" and web_number=:webNumber ");
			}
			if(model.getWebPassCode()!=null)
			{
				sql.append(" and web_pass_code=:webPassCode ");
			}
			if(model.getStatus()!=null)
			{
				sql.append(" and status=:status ");
			}
			if(model.getCreateDate()!=null)
			{
				sql.append(" and create_date=:createDate ");
			}
			if(model.getModifyDate()!=null)
			{
				sql.append(" and modify_date=:modifyDate ");
			}
			if(model.getHotelAddressForeign()!=null)
			{
				sql.append(" and hotel_address_foreign=:hotelAddressForeign ");
			}
			if(model.getPostalCode()!=null)
			{
				sql.append(" and postal_code=:postalCode ");
			}
			if(model.getNewFitDate()!=null)
			{
				sql.append(" and new_fit_date=:newFitDate ");
			}
			if(model.getIfGoPublic()!=null)
			{
				sql.append(" and if_go_public=:ifGoPublic ");
			}
			if(model.getGoPublicDate()!=null)
			{
				sql.append(" and go_public_date=:goPublicDate ");
			}
			if(model.getMaxReserveDate()!=null)
			{
				sql.append(" and max_reserve_date=:maxReserveDate ");
			}
			if(model.getCommendExpon()!=null)
			{
				sql.append(" and commend_expon=:commendExpon ");
			}
			if(model.getPublicPraise()!=null)
			{
				sql.append(" and public_praise=:publicPraise ");
			}
			if(model.getEMail()!=null)
			{
				sql.append(" and e_mail=:eMail ");
			}
			if(model.getIfOnline()!=null)
			{
				sql.append(" and if_online=:ifOnline ");
			}
			if(model.getSwitchboard()!=null)
			{
				sql.append(" and switchboard=:switchboard ");
			}
			if(model.getIfHotelAccr()!=null)
			{
				sql.append(" and if_hotel_accr=:ifHotelAccr ");
			}
			if(model.getFitKind()!=null)
			{
				sql.append(" and fit_kind=:fitKind ");
			}
			if(model.getAuditType()!=null)
			{
				sql.append(" and audit_type=:auditType ");
			}
			if(model.getAuditKind()!=null)
			{
				sql.append(" and audit_kind=:auditKind ");
			}
			if(model.getFullPinyin()!=null)
			{
				sql.append(" and full_pinyin=:fullPinyin ");
			}
			if(model.getPinyinFir()!=null)
			{
				sql.append(" and pinyin_fir=:pinyinFir ");
			}
			if(model.getIfGroup()!=null)
			{
				sql.append(" and if_group=:ifGroup ");
			}
			if(model.getGroupName()!=null)
			{
				sql.append(" and group_name=:groupName ");
			}
			if(model.getMainFloors()!=null)
			{
				sql.append(" and main_floors=:mainFloors ");
			}
			if(model.getAppendixFloors()!=null)
			{
				sql.append(" and appendix_floors=:appendixFloors ");
			}
			if(model.getHotelAdvantage()!=null)
			{
				sql.append(" and hotel_advantage=:hotelAdvantage ");
			}
			if(model.getIfTop()!=null)
			{
				sql.append(" and if_top=:ifTop ");
			}
			if(model.getIfCancelHold()!=null)
			{
				sql.append(" and if_cancel_hold=:ifCancelHold ");
			}
			if(model.getEnablewaterpool()!=null)
			{
				sql.append(" and enablewaterpool=:enablewaterpool ");
			}
			if(model.getOrderChangeFlag()!=null)
			{
				sql.append(" and order_change_flag=:orderChangeFlag ");
			}
			if(model.getMessageSale()!=null)
			{
				sql.append(" and message_sale=:messageSale ");
			}
			if(model.getSourceHotelId()!=null)
			{
				sql.append(" and source_hotel_id=:sourceHotelId ");
			}
			if(model.getSourceType()!=null)
			{
				sql.append(" and source_type=:sourceType ");
			}
			if(model.getBrandid()!=null)
			{
				sql.append(" and brandid=:brandid ");
			}
			if(model.getHotelImage()!=null)
			{
				sql.append(" and hotel_image=:hotelImage ");
			}
			if(model.getService()!=null)
			{
				sql.append(" and service=:service ");
			}
			if(model.getFacility()!=null)
			{
				sql.append(" and facility=:facility ");
			}
			if(model.getCatering()!=null)
			{
				sql.append(" and catering=:catering ");
			}
			if(model.getRecreation()!=null)
			{
				sql.append(" and recreation=:recreation ");
			}
			if(model.getCreditcard()!=null)
			{
				sql.append(" and creditcard=:creditcard ");
			}
			if(model.getNearby()!=null)
			{
				sql.append(" and nearby=:nearby ");
			}
			if(model.getStreet()!=null)
			{
				sql.append(" and street=:street ");
			}
			if(model.getStreetaddr()!=null)
			{
				sql.append(" and streetaddr=:streetaddr ");
			}
			if(model.getEditType()!=null)
			{
				sql.append(" and edit_type=:editType ");
			}
			if(model.getLowerprice()!=null)
			{
				sql.append(" and lowerprice=:lowerprice ");
			}
			if(model.getImpressdesc()!=null)
			{
				sql.append(" and impressdesc=:impressdesc ");
			}
			if(model.getRelationid()!=null)
			{
				sql.append(" and relationid=:relationid ");
			}
			if(model.getTuid()!=null)
			{
				sql.append(" and tuid=:tuid ");
			}
			if(model.getLowerprice2()!=null)
			{
				sql.append(" and lowerprice2=:lowerprice2 ");
			}
			if(model.getIsmajor()!=null)
			{
				sql.append(" and ismajor=:ismajor ");
			}
			if(model.getTravelid()!=null)
			{
				sql.append(" and travelid=:travelid ");
			}
			if(model.getFlag()!=null)
			{
				sql.append(" and flag=:flag ");
			}
			if(model.getBusinessAreaName()!=null)
			{
				sql.append(" and business_area_name=:businessAreaName ");
			}
			if(model.getHighestprice()!=null)
			{
				sql.append(" and highestprice=:highestprice ");
			}
			if(model.getMicrosms()!=null)
			{
				sql.append(" and microsms=:microsms ");
			}
			if(model.getCashback()!=null)
			{
				sql.append(" and cashback=:cashback ");
			}
			if(model.getRoomimage()!=null)
			{
				sql.append(" and roomimage=:roomimage ");
			}
			if(model.getRoomimagecount()!=null)
			{
				sql.append(" and roomimagecount=:roomimagecount ");
			}
			if(model.getIftrue()!=null)
			{
				sql.append(" and iftrue=:iftrue ");
			}
			if(model.getCurversion()!=null)
			{
				sql.append(" and curversion=:curversion ");
			}
			if(model.getPaymenttype()!=null)
			{
				sql.append(" and paymenttype=:paymenttype ");
			}
		
		String sqlfinal=DBHelper.getPageSqlByPageIndex(sql.toString(),new Integer(pageIndex).toString(),new Integer(rows).toString());
		
		SqlParameterSource sps=new BeanPropertySqlParameterSource(model);
		
		List<CimTpcHtlInfoT> modellist = namedParameterJdbcTemplate.query(sqlfinal,sps,new BeanPropertyRowMapper<CimTpcHtlInfoT>(CimTpcHtlInfoT.class));
		
		return modellist;
	}
	
	
	
	
	
	
	
	public List<CimTpcHtlInfoT>  getPageListByCimTpcHtlInfoTList(ArrayList<CimTpcHtlInfoT> modellist, int pageIndex,int rows) throws DAOException  {
		int startindex=(pageIndex-1)*rows+1;
		int endindex=pageIndex*rows;
		if(endindex>modellist.size()-1)
		{
			modellist.subList(startindex, endindex);
		}else{
			modellist.subList(startindex, modellist.size()-1);
		}
		return modellist;
	}
	
	
	public CimTpcHtlInfoT getCimTpcHtlInfoTByCoud(CimTpcHtlInfoT model)  throws DAOException  {
		List<CimTpcHtlInfoT> modellist =getCimTpcHtlInfoTListByCoud(model);
		if(modellist!=null&&modellist.size()==1)
		{
			return modellist.get(0);
		}else{
			return null;
		}
	}
	
	
	public CimTpcHtlInfoT getCimTpcHtlInfoTByExact(CimTpcHtlInfoT model)  throws DAOException  {
		List<CimTpcHtlInfoT> modellist =getCimTpcHtlInfoTListByExact(model);
		if(modellist!=null&&modellist.size()==1)
		{
			return modellist.get(0);
		}else{
			return null;
		}
	}
	
	public String  getSeq() {
		String sql="select cim_spc_htl_info_s.nextval as seqid from dual";
		
		List<Map<String, Object>> resultlist =null;
		try{
			
			resultlist = jdbcTemplate.queryForList(sql);
			if(resultlist.size()==1){
							Map<String, Object>  map = resultlist.get(0);
							BigDecimal seqid = (BigDecimal) map.get("SEQID");
							return seqid.toString();
			}
		}catch(Exception ex)
		{
			String createseq="create sequence cim_spc_htl_info_s minvalue 1 maxvalue 999999999999999999999999 start with 1 increment by 1";
			jdbcTemplate.update(createseq);
			resultlist = jdbcTemplate.queryForList(sql);
			if(resultlist.size()==1){
						Map<String, Object>  map = resultlist.get(0);
						BigDecimal seqid = (BigDecimal) map.get("SEQID");
						return seqid.toString();
			}
		}
		return "";
	}
	
	
	
	public int deleteByRowid(String rowid)  throws DAOException  {
		StringBuffer sql=new StringBuffer("delete  from  cim_tpc_htl_info_t  where rowid='"+rowid+"'");
		return jdbcTemplate.update(sql.toString());
	}
	
}