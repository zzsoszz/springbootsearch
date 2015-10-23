package com.bxtel.cimtpchtlinfo.model;
import com.bxtel.cimtpchtlinfo.*;
import java.util.*;
public class CimTpcHtlInfoT  
{
	
		 public String cityCode;//city_code
		 public String districtCode;//district_code
		 public String companyId;//company_id
		 public String hotelName;//hotel_name
		 public String hotelNameForeign;//hotel_name_foreign
		 public String hotelNameSimple;//hotel_name_simple
		 public String keyWords;//key_words
		 public String hotelAddress;//hotel_address
		 public Integer hotelType;//hotel_type
		 public Integer hotelKind;//hotel_kind
		 public Integer hotelLevel;//hotel_level
		 public String hotelIntro;//hotel_intro
		 public String contactPhone;//contact_phone
		 public String contactFax;//contact_fax
		 public String hotelWebsite;//hotel_website
		 public String businessArea;//business_area
		 public String hotelRoute;//hotel_route
		 public Date startDate;//start_date
		 public Integer roomNumber;//room_number
		 public Integer payWay;//pay_way
		 public String longitude;//longitude
		 public String latitude;//latitude
		 public Integer ifForeign;//if_foreign
		 public Integer conferStatus;//confer_status
		 public Long belongCode;//belong_code
		 public Integer ifChangeSend;//if_change_send
		 public String externalId;//external_id
		 public String urlAddress;//url_address
		 public String webNumber;//web_number
		 public String webPassCode;//web_pass_code
		 public Integer status;//status
		 public Date createDate;//create_date
		 public Date modifyDate;//modify_date
		 public String hotelAddressForeign;//hotel_address_foreign
		 public String postalCode;//postal_code
		 public Date newFitDate;//new_fit_date
		 public Integer ifGoPublic;//if_go_public
		 public Date goPublicDate;//go_public_date
		 public Integer maxReserveDate;//max_reserve_date
		 public Integer commendExpon;//commend_expon
		 public Double publicPraise;//public_praise
		 public String eMail;//e_mail
		 public Integer ifOnline;//if_online
		 public String switchboard;//switchboard
		 public Integer ifHotelAccr;//if_hotel_accr
		 public Integer fitKind;//fit_kind
		 public Integer auditType;//audit_type
		 public Integer auditKind;//audit_kind
		 public String fullPinyin;//full_pinyin
		 public String pinyinFir;//pinyin_fir
		 public Integer ifGroup;//if_group
		 public String groupName;//group_name
		 public String mainFloors;//main_floors
		 public String appendixFloors;//appendix_floors
		 public String hotelAdvantage;//hotel_advantage
		 public Integer ifTop;//if_top
		 public Integer ifCancelHold;//if_cancel_hold
		 public Integer enablewaterpool;//蓄水池开关 1 开启 0 关闭
		 public Integer orderChangeFlag;//是否支持变更 1 支持 0 不支持
		 public Integer messageSale;//短信促销开关  1 开启 0 关闭
		 public String sourceHotelId;//source_hotel_id
		 public Integer sourceType;//source_type
		 public String brandid;//brandid
		 public String hotelImage;//hotel_image
		 public String service;//service
		 public String facility;//设施
		 public String catering;//餐饮
		 public String recreation;//休闲
		 public String creditcard;//creditcard
		 public String nearby;//nearby
		 public String street;//street
		 public String streetaddr;//streetaddr
		 public Integer editType;//编辑类型 1-可编辑（自己维护的酒店） 2-不可编辑（引入的酒店）
		 public Integer lowerprice;//最低价
		 public String impressdesc;//酒店印象
		 public String relationid;//relationid
		 public String tuid;//tuid
		 public Integer lowerprice2;//lowerprice2
		 public Integer ismajor;//是否主酒店  0-非主酒店 1-主酒店
		 public Long travelid;//所属旅行社 引用bx_hotel_travel_t.travelId
		 public Integer flag;//该酒店是否有匹配数据（0：未匹配，1：已匹配，默认为0）
		 public String businessAreaName;//business_area_name
		 public Integer highestprice;//highestprice
		 public String microsms;//microsms
		 public Double cashback;//最高返
		 public String roomimage;//房型图片
		 public Integer roomimagecount;//房型图片数
		 public Integer iftrue;//是否进入搜索引擎，1=进入，0=不进入，默认为0
		 public Long curversion;//curversion
		 public String paymenttype;//All全部 ,SelfPay 现付,Prepay预付
		public String totalCount;
		public String crowid;
	
		
		 public void setCityCode(String cityCode)
		 {
		 	this.cityCode=cityCode;
		 }
		 public String getCityCode()
		 {
		 	return this.cityCode;
		 }
		 public void setDistrictCode(String districtCode)
		 {
		 	this.districtCode=districtCode;
		 }
		 public String getDistrictCode()
		 {
		 	return this.districtCode;
		 }
		 public void setCompanyId(String companyId)
		 {
		 	this.companyId=companyId;
		 }
		 public String getCompanyId()
		 {
		 	return this.companyId;
		 }
		 public void setHotelName(String hotelName)
		 {
		 	this.hotelName=hotelName;
		 }
		 public String getHotelName()
		 {
		 	return this.hotelName;
		 }
		 public void setHotelNameForeign(String hotelNameForeign)
		 {
		 	this.hotelNameForeign=hotelNameForeign;
		 }
		 public String getHotelNameForeign()
		 {
		 	return this.hotelNameForeign;
		 }
		 public void setHotelNameSimple(String hotelNameSimple)
		 {
		 	this.hotelNameSimple=hotelNameSimple;
		 }
		 public String getHotelNameSimple()
		 {
		 	return this.hotelNameSimple;
		 }
		 public void setKeyWords(String keyWords)
		 {
		 	this.keyWords=keyWords;
		 }
		 public String getKeyWords()
		 {
		 	return this.keyWords;
		 }
		 public void setHotelAddress(String hotelAddress)
		 {
		 	this.hotelAddress=hotelAddress;
		 }
		 public String getHotelAddress()
		 {
		 	return this.hotelAddress;
		 }
		 public void setHotelType(Integer hotelType)
		 {
		 	this.hotelType=hotelType;
		 }
		 public Integer getHotelType()
		 {
		 	return this.hotelType;
		 }
		 public void setHotelKind(Integer hotelKind)
		 {
		 	this.hotelKind=hotelKind;
		 }
		 public Integer getHotelKind()
		 {
		 	return this.hotelKind;
		 }
		 public void setHotelLevel(Integer hotelLevel)
		 {
		 	this.hotelLevel=hotelLevel;
		 }
		 public Integer getHotelLevel()
		 {
		 	return this.hotelLevel;
		 }
		 public void setHotelIntro(String hotelIntro)
		 {
		 	this.hotelIntro=hotelIntro;
		 }
		 public String getHotelIntro()
		 {
		 	return this.hotelIntro;
		 }
		 public void setContactPhone(String contactPhone)
		 {
		 	this.contactPhone=contactPhone;
		 }
		 public String getContactPhone()
		 {
		 	return this.contactPhone;
		 }
		 public void setContactFax(String contactFax)
		 {
		 	this.contactFax=contactFax;
		 }
		 public String getContactFax()
		 {
		 	return this.contactFax;
		 }
		 public void setHotelWebsite(String hotelWebsite)
		 {
		 	this.hotelWebsite=hotelWebsite;
		 }
		 public String getHotelWebsite()
		 {
		 	return this.hotelWebsite;
		 }
		 public void setBusinessArea(String businessArea)
		 {
		 	this.businessArea=businessArea;
		 }
		 public String getBusinessArea()
		 {
		 	return this.businessArea;
		 }
		 public void setHotelRoute(String hotelRoute)
		 {
		 	this.hotelRoute=hotelRoute;
		 }
		 public String getHotelRoute()
		 {
		 	return this.hotelRoute;
		 }
		 public void setStartDate(Date startDate)
		 {
		 	this.startDate=startDate;
		 }
		 public Date getStartDate()
		 {
		 	return this.startDate;
		 }
		 public void setRoomNumber(Integer roomNumber)
		 {
		 	this.roomNumber=roomNumber;
		 }
		 public Integer getRoomNumber()
		 {
		 	return this.roomNumber;
		 }
		 public void setPayWay(Integer payWay)
		 {
		 	this.payWay=payWay;
		 }
		 public Integer getPayWay()
		 {
		 	return this.payWay;
		 }
		 public void setLongitude(String longitude)
		 {
		 	this.longitude=longitude;
		 }
		 public String getLongitude()
		 {
		 	return this.longitude;
		 }
		 public void setLatitude(String latitude)
		 {
		 	this.latitude=latitude;
		 }
		 public String getLatitude()
		 {
		 	return this.latitude;
		 }
		 public void setIfForeign(Integer ifForeign)
		 {
		 	this.ifForeign=ifForeign;
		 }
		 public Integer getIfForeign()
		 {
		 	return this.ifForeign;
		 }
		 public void setConferStatus(Integer conferStatus)
		 {
		 	this.conferStatus=conferStatus;
		 }
		 public Integer getConferStatus()
		 {
		 	return this.conferStatus;
		 }
		 public void setBelongCode(Long belongCode)
		 {
		 	this.belongCode=belongCode;
		 }
		 public Long getBelongCode()
		 {
		 	return this.belongCode;
		 }
		 public void setIfChangeSend(Integer ifChangeSend)
		 {
		 	this.ifChangeSend=ifChangeSend;
		 }
		 public Integer getIfChangeSend()
		 {
		 	return this.ifChangeSend;
		 }
		 public void setExternalId(String externalId)
		 {
		 	this.externalId=externalId;
		 }
		 public String getExternalId()
		 {
		 	return this.externalId;
		 }
		 public void setUrlAddress(String urlAddress)
		 {
		 	this.urlAddress=urlAddress;
		 }
		 public String getUrlAddress()
		 {
		 	return this.urlAddress;
		 }
		 public void setWebNumber(String webNumber)
		 {
		 	this.webNumber=webNumber;
		 }
		 public String getWebNumber()
		 {
		 	return this.webNumber;
		 }
		 public void setWebPassCode(String webPassCode)
		 {
		 	this.webPassCode=webPassCode;
		 }
		 public String getWebPassCode()
		 {
		 	return this.webPassCode;
		 }
		 public void setStatus(Integer status)
		 {
		 	this.status=status;
		 }
		 public Integer getStatus()
		 {
		 	return this.status;
		 }
		 public void setCreateDate(Date createDate)
		 {
		 	this.createDate=createDate;
		 }
		 public Date getCreateDate()
		 {
		 	return this.createDate;
		 }
		 public void setModifyDate(Date modifyDate)
		 {
		 	this.modifyDate=modifyDate;
		 }
		 public Date getModifyDate()
		 {
		 	return this.modifyDate;
		 }
		 public void setHotelAddressForeign(String hotelAddressForeign)
		 {
		 	this.hotelAddressForeign=hotelAddressForeign;
		 }
		 public String getHotelAddressForeign()
		 {
		 	return this.hotelAddressForeign;
		 }
		 public void setPostalCode(String postalCode)
		 {
		 	this.postalCode=postalCode;
		 }
		 public String getPostalCode()
		 {
		 	return this.postalCode;
		 }
		 public void setNewFitDate(Date newFitDate)
		 {
		 	this.newFitDate=newFitDate;
		 }
		 public Date getNewFitDate()
		 {
		 	return this.newFitDate;
		 }
		 public void setIfGoPublic(Integer ifGoPublic)
		 {
		 	this.ifGoPublic=ifGoPublic;
		 }
		 public Integer getIfGoPublic()
		 {
		 	return this.ifGoPublic;
		 }
		 public void setGoPublicDate(Date goPublicDate)
		 {
		 	this.goPublicDate=goPublicDate;
		 }
		 public Date getGoPublicDate()
		 {
		 	return this.goPublicDate;
		 }
		 public void setMaxReserveDate(Integer maxReserveDate)
		 {
		 	this.maxReserveDate=maxReserveDate;
		 }
		 public Integer getMaxReserveDate()
		 {
		 	return this.maxReserveDate;
		 }
		 public void setCommendExpon(Integer commendExpon)
		 {
		 	this.commendExpon=commendExpon;
		 }
		 public Integer getCommendExpon()
		 {
		 	return this.commendExpon;
		 }
		 public void setPublicPraise(Double publicPraise)
		 {
		 	this.publicPraise=publicPraise;
		 }
		 public Double getPublicPraise()
		 {
		 	return this.publicPraise;
		 }
		 public void setEMail(String eMail)
		 {
		 	this.eMail=eMail;
		 }
		 public String getEMail()
		 {
		 	return this.eMail;
		 }
		 public void setIfOnline(Integer ifOnline)
		 {
		 	this.ifOnline=ifOnline;
		 }
		 public Integer getIfOnline()
		 {
		 	return this.ifOnline;
		 }
		 public void setSwitchboard(String switchboard)
		 {
		 	this.switchboard=switchboard;
		 }
		 public String getSwitchboard()
		 {
		 	return this.switchboard;
		 }
		 public void setIfHotelAccr(Integer ifHotelAccr)
		 {
		 	this.ifHotelAccr=ifHotelAccr;
		 }
		 public Integer getIfHotelAccr()
		 {
		 	return this.ifHotelAccr;
		 }
		 public void setFitKind(Integer fitKind)
		 {
		 	this.fitKind=fitKind;
		 }
		 public Integer getFitKind()
		 {
		 	return this.fitKind;
		 }
		 public void setAuditType(Integer auditType)
		 {
		 	this.auditType=auditType;
		 }
		 public Integer getAuditType()
		 {
		 	return this.auditType;
		 }
		 public void setAuditKind(Integer auditKind)
		 {
		 	this.auditKind=auditKind;
		 }
		 public Integer getAuditKind()
		 {
		 	return this.auditKind;
		 }
		 public void setFullPinyin(String fullPinyin)
		 {
		 	this.fullPinyin=fullPinyin;
		 }
		 public String getFullPinyin()
		 {
		 	return this.fullPinyin;
		 }
		 public void setPinyinFir(String pinyinFir)
		 {
		 	this.pinyinFir=pinyinFir;
		 }
		 public String getPinyinFir()
		 {
		 	return this.pinyinFir;
		 }
		 public void setIfGroup(Integer ifGroup)
		 {
		 	this.ifGroup=ifGroup;
		 }
		 public Integer getIfGroup()
		 {
		 	return this.ifGroup;
		 }
		 public void setGroupName(String groupName)
		 {
		 	this.groupName=groupName;
		 }
		 public String getGroupName()
		 {
		 	return this.groupName;
		 }
		 public void setMainFloors(String mainFloors)
		 {
		 	this.mainFloors=mainFloors;
		 }
		 public String getMainFloors()
		 {
		 	return this.mainFloors;
		 }
		 public void setAppendixFloors(String appendixFloors)
		 {
		 	this.appendixFloors=appendixFloors;
		 }
		 public String getAppendixFloors()
		 {
		 	return this.appendixFloors;
		 }
		 public void setHotelAdvantage(String hotelAdvantage)
		 {
		 	this.hotelAdvantage=hotelAdvantage;
		 }
		 public String getHotelAdvantage()
		 {
		 	return this.hotelAdvantage;
		 }
		 public void setIfTop(Integer ifTop)
		 {
		 	this.ifTop=ifTop;
		 }
		 public Integer getIfTop()
		 {
		 	return this.ifTop;
		 }
		 public void setIfCancelHold(Integer ifCancelHold)
		 {
		 	this.ifCancelHold=ifCancelHold;
		 }
		 public Integer getIfCancelHold()
		 {
		 	return this.ifCancelHold;
		 }
		 public void setEnablewaterpool(Integer enablewaterpool)
		 {
		 	this.enablewaterpool=enablewaterpool;
		 }
		 public Integer getEnablewaterpool()
		 {
		 	return this.enablewaterpool;
		 }
		 public void setOrderChangeFlag(Integer orderChangeFlag)
		 {
		 	this.orderChangeFlag=orderChangeFlag;
		 }
		 public Integer getOrderChangeFlag()
		 {
		 	return this.orderChangeFlag;
		 }
		 public void setMessageSale(Integer messageSale)
		 {
		 	this.messageSale=messageSale;
		 }
		 public Integer getMessageSale()
		 {
		 	return this.messageSale;
		 }
		 public void setSourceHotelId(String sourceHotelId)
		 {
		 	this.sourceHotelId=sourceHotelId;
		 }
		 public String getSourceHotelId()
		 {
		 	return this.sourceHotelId;
		 }
		 public void setSourceType(Integer sourceType)
		 {
		 	this.sourceType=sourceType;
		 }
		 public Integer getSourceType()
		 {
		 	return this.sourceType;
		 }
		 public void setBrandid(String brandid)
		 {
		 	this.brandid=brandid;
		 }
		 public String getBrandid()
		 {
		 	return this.brandid;
		 }
		 public void setHotelImage(String hotelImage)
		 {
		 	this.hotelImage=hotelImage;
		 }
		 public String getHotelImage()
		 {
		 	return this.hotelImage;
		 }
		 public void setService(String service)
		 {
		 	this.service=service;
		 }
		 public String getService()
		 {
		 	return this.service;
		 }
		 public void setFacility(String facility)
		 {
		 	this.facility=facility;
		 }
		 public String getFacility()
		 {
		 	return this.facility;
		 }
		 public void setCatering(String catering)
		 {
		 	this.catering=catering;
		 }
		 public String getCatering()
		 {
		 	return this.catering;
		 }
		 public void setRecreation(String recreation)
		 {
		 	this.recreation=recreation;
		 }
		 public String getRecreation()
		 {
		 	return this.recreation;
		 }
		 public void setCreditcard(String creditcard)
		 {
		 	this.creditcard=creditcard;
		 }
		 public String getCreditcard()
		 {
		 	return this.creditcard;
		 }
		 public void setNearby(String nearby)
		 {
		 	this.nearby=nearby;
		 }
		 public String getNearby()
		 {
		 	return this.nearby;
		 }
		 public void setStreet(String street)
		 {
		 	this.street=street;
		 }
		 public String getStreet()
		 {
		 	return this.street;
		 }
		 public void setStreetaddr(String streetaddr)
		 {
		 	this.streetaddr=streetaddr;
		 }
		 public String getStreetaddr()
		 {
		 	return this.streetaddr;
		 }
		 public void setEditType(Integer editType)
		 {
		 	this.editType=editType;
		 }
		 public Integer getEditType()
		 {
		 	return this.editType;
		 }
		 public void setLowerprice(Integer lowerprice)
		 {
		 	this.lowerprice=lowerprice;
		 }
		 public Integer getLowerprice()
		 {
		 	return this.lowerprice;
		 }
		 public void setImpressdesc(String impressdesc)
		 {
		 	this.impressdesc=impressdesc;
		 }
		 public String getImpressdesc()
		 {
		 	return this.impressdesc;
		 }
		 public void setRelationid(String relationid)
		 {
		 	this.relationid=relationid;
		 }
		 public String getRelationid()
		 {
		 	return this.relationid;
		 }
		 public void setTuid(String tuid)
		 {
		 	this.tuid=tuid;
		 }
		 public String getTuid()
		 {
		 	return this.tuid;
		 }
		 public void setLowerprice2(Integer lowerprice2)
		 {
		 	this.lowerprice2=lowerprice2;
		 }
		 public Integer getLowerprice2()
		 {
		 	return this.lowerprice2;
		 }
		 public void setIsmajor(Integer ismajor)
		 {
		 	this.ismajor=ismajor;
		 }
		 public Integer getIsmajor()
		 {
		 	return this.ismajor;
		 }
		 public void setTravelid(Long travelid)
		 {
		 	this.travelid=travelid;
		 }
		 public Long getTravelid()
		 {
		 	return this.travelid;
		 }
		 public void setFlag(Integer flag)
		 {
		 	this.flag=flag;
		 }
		 public Integer getFlag()
		 {
		 	return this.flag;
		 }
		 public void setBusinessAreaName(String businessAreaName)
		 {
		 	this.businessAreaName=businessAreaName;
		 }
		 public String getBusinessAreaName()
		 {
		 	return this.businessAreaName;
		 }
		 public void setHighestprice(Integer highestprice)
		 {
		 	this.highestprice=highestprice;
		 }
		 public Integer getHighestprice()
		 {
		 	return this.highestprice;
		 }
		 public void setMicrosms(String microsms)
		 {
		 	this.microsms=microsms;
		 }
		 public String getMicrosms()
		 {
		 	return this.microsms;
		 }
		 public void setCashback(Double cashback)
		 {
		 	this.cashback=cashback;
		 }
		 public Double getCashback()
		 {
		 	return this.cashback;
		 }
		 public void setRoomimage(String roomimage)
		 {
		 	this.roomimage=roomimage;
		 }
		 public String getRoomimage()
		 {
		 	return this.roomimage;
		 }
		 public void setRoomimagecount(Integer roomimagecount)
		 {
		 	this.roomimagecount=roomimagecount;
		 }
		 public Integer getRoomimagecount()
		 {
		 	return this.roomimagecount;
		 }
		 public void setIftrue(Integer iftrue)
		 {
		 	this.iftrue=iftrue;
		 }
		 public Integer getIftrue()
		 {
		 	return this.iftrue;
		 }
		 public void setCurversion(Long curversion)
		 {
		 	this.curversion=curversion;
		 }
		 public Long getCurversion()
		 {
		 	return this.curversion;
		 }
		 public void setPaymenttype(String paymenttype)
		 {
		 	this.paymenttype=paymenttype;
		 }
		 public String getPaymenttype()
		 {
		 	return this.paymenttype;
		 }
	
	
		public String getTotalCount() {
			return totalCount;
		}
		public void setTotalCount(String totalCount) {
			this.totalCount = totalCount;
		}
		
		public String getCrowid() {
			return crowid;
		}
		public void setCrowid(String crowid) {
			this.crowid = crowid;
		}
		
		
	/*
		 model.setCityCode("cityCodevalue");
		 model.setDistrictCode("districtCodevalue");
		 model.setCompanyId("companyIdvalue");
		 model.setHotelName("hotelNamevalue");
		 model.setHotelNameForeign("hotelNameForeignvalue");
		 model.setHotelNameSimple("hotelNameSimplevalue");
		 model.setKeyWords("keyWordsvalue");
		 model.setHotelAddress("hotelAddressvalue");
		 model.setHotelType("hotelTypevalue");
		 model.setHotelKind("hotelKindvalue");
		 model.setHotelLevel("hotelLevelvalue");
		 model.setHotelIntro("hotelIntrovalue");
		 model.setContactPhone("contactPhonevalue");
		 model.setContactFax("contactFaxvalue");
		 model.setHotelWebsite("hotelWebsitevalue");
		 model.setBusinessArea("businessAreavalue");
		 model.setHotelRoute("hotelRoutevalue");
		 model.setStartDate("startDatevalue");
		 model.setRoomNumber("roomNumbervalue");
		 model.setPayWay("payWayvalue");
		 model.setLongitude("longitudevalue");
		 model.setLatitude("latitudevalue");
		 model.setIfForeign("ifForeignvalue");
		 model.setConferStatus("conferStatusvalue");
		 model.setBelongCode("belongCodevalue");
		 model.setIfChangeSend("ifChangeSendvalue");
		 model.setExternalId("externalIdvalue");
		 model.setUrlAddress("urlAddressvalue");
		 model.setWebNumber("webNumbervalue");
		 model.setWebPassCode("webPassCodevalue");
		 model.setStatus("statusvalue");
		 model.setCreateDate("createDatevalue");
		 model.setModifyDate("modifyDatevalue");
		 model.setHotelAddressForeign("hotelAddressForeignvalue");
		 model.setPostalCode("postalCodevalue");
		 model.setNewFitDate("newFitDatevalue");
		 model.setIfGoPublic("ifGoPublicvalue");
		 model.setGoPublicDate("goPublicDatevalue");
		 model.setMaxReserveDate("maxReserveDatevalue");
		 model.setCommendExpon("commendExponvalue");
		 model.setPublicPraise("publicPraisevalue");
		 model.setEMail("eMailvalue");
		 model.setIfOnline("ifOnlinevalue");
		 model.setSwitchboard("switchboardvalue");
		 model.setIfHotelAccr("ifHotelAccrvalue");
		 model.setFitKind("fitKindvalue");
		 model.setAuditType("auditTypevalue");
		 model.setAuditKind("auditKindvalue");
		 model.setFullPinyin("fullPinyinvalue");
		 model.setPinyinFir("pinyinFirvalue");
		 model.setIfGroup("ifGroupvalue");
		 model.setGroupName("groupNamevalue");
		 model.setMainFloors("mainFloorsvalue");
		 model.setAppendixFloors("appendixFloorsvalue");
		 model.setHotelAdvantage("hotelAdvantagevalue");
		 model.setIfTop("ifTopvalue");
		 model.setIfCancelHold("ifCancelHoldvalue");
		 model.setEnablewaterpool("enablewaterpoolvalue");
		 model.setOrderChangeFlag("orderChangeFlagvalue");
		 model.setMessageSale("messageSalevalue");
		 model.setSourceHotelId("sourceHotelIdvalue");
		 model.setSourceType("sourceTypevalue");
		 model.setBrandid("brandidvalue");
		 model.setHotelImage("hotelImagevalue");
		 model.setService("servicevalue");
		 model.setFacility("facilityvalue");
		 model.setCatering("cateringvalue");
		 model.setRecreation("recreationvalue");
		 model.setCreditcard("creditcardvalue");
		 model.setNearby("nearbyvalue");
		 model.setStreet("streetvalue");
		 model.setStreetaddr("streetaddrvalue");
		 model.setEditType("editTypevalue");
		 model.setLowerprice("lowerpricevalue");
		 model.setImpressdesc("impressdescvalue");
		 model.setRelationid("relationidvalue");
		 model.setTuid("tuidvalue");
		 model.setLowerprice2("lowerprice2value");
		 model.setIsmajor("ismajorvalue");
		 model.setTravelid("travelidvalue");
		 model.setFlag("flagvalue");
		 model.setBusinessAreaName("businessAreaNamevalue");
		 model.setHighestprice("highestpricevalue");
		 model.setMicrosms("microsmsvalue");
		 model.setCashback("cashbackvalue");
		 model.setRoomimage("roomimagevalue");
		 model.setRoomimagecount("roomimagecountvalue");
		 model.setIftrue("iftruevalue");
		 model.setCurversion("curversionvalue");
		 model.setPaymenttype("paymenttypevalue");
		 model.getCityCode();
		 model.getDistrictCode();
		 model.getCompanyId();
		 model.getHotelName();
		 model.getHotelNameForeign();
		 model.getHotelNameSimple();
		 model.getKeyWords();
		 model.getHotelAddress();
		 model.getHotelType();
		 model.getHotelKind();
		 model.getHotelLevel();
		 model.getHotelIntro();
		 model.getContactPhone();
		 model.getContactFax();
		 model.getHotelWebsite();
		 model.getBusinessArea();
		 model.getHotelRoute();
		 model.getStartDate();
		 model.getRoomNumber();
		 model.getPayWay();
		 model.getLongitude();
		 model.getLatitude();
		 model.getIfForeign();
		 model.getConferStatus();
		 model.getBelongCode();
		 model.getIfChangeSend();
		 model.getExternalId();
		 model.getUrlAddress();
		 model.getWebNumber();
		 model.getWebPassCode();
		 model.getStatus();
		 model.getCreateDate();
		 model.getModifyDate();
		 model.getHotelAddressForeign();
		 model.getPostalCode();
		 model.getNewFitDate();
		 model.getIfGoPublic();
		 model.getGoPublicDate();
		 model.getMaxReserveDate();
		 model.getCommendExpon();
		 model.getPublicPraise();
		 model.getEMail();
		 model.getIfOnline();
		 model.getSwitchboard();
		 model.getIfHotelAccr();
		 model.getFitKind();
		 model.getAuditType();
		 model.getAuditKind();
		 model.getFullPinyin();
		 model.getPinyinFir();
		 model.getIfGroup();
		 model.getGroupName();
		 model.getMainFloors();
		 model.getAppendixFloors();
		 model.getHotelAdvantage();
		 model.getIfTop();
		 model.getIfCancelHold();
		 model.getEnablewaterpool();
		 model.getOrderChangeFlag();
		 model.getMessageSale();
		 model.getSourceHotelId();
		 model.getSourceType();
		 model.getBrandid();
		 model.getHotelImage();
		 model.getService();
		 model.getFacility();
		 model.getCatering();
		 model.getRecreation();
		 model.getCreditcard();
		 model.getNearby();
		 model.getStreet();
		 model.getStreetaddr();
		 model.getEditType();
		 model.getLowerprice();
		 model.getImpressdesc();
		 model.getRelationid();
		 model.getTuid();
		 model.getLowerprice2();
		 model.getIsmajor();
		 model.getTravelid();
		 model.getFlag();
		 model.getBusinessAreaName();
		 model.getHighestprice();
		 model.getMicrosms();
		 model.getCashback();
		 model.getRoomimage();
		 model.getRoomimagecount();
		 model.getIftrue();
		 model.getCurversion();
		 model.getPaymenttype();
	*/
}

