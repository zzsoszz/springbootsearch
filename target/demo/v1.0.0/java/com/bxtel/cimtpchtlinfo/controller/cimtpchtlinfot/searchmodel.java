package com.bxtel.cimtpchtlinfo.model;
import com.bxtel.cimtpchtlinfo.*;
import java.util.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "database", type = "CimTpcHtlInfoT?lower_case", shards = 1, replicas = 0, refreshInterval = "-1")
public class CimTpcHtlInfoT  
{
	
		 @Id
		 private String indexid;
		
		 public String CITY_CODE;//city_code
		 public String DISTRICT_CODE;//district_code
		 public String COMPANY_ID;//company_id
		 public String HOTEL_NAME;//hotel_name
		 public String HOTEL_NAME_FOREIGN;//hotel_name_foreign
		 public String HOTEL_NAME_SIMPLE;//hotel_name_simple
		 public String KEY_WORDS;//key_words
		 public String HOTEL_ADDRESS;//hotel_address
		 public Integer HOTEL_TYPE;//hotel_type
		 public Integer HOTEL_KIND;//hotel_kind
		 public Integer HOTEL_LEVEL;//hotel_level
		 public String HOTEL_INTRO;//hotel_intro
		 public String CONTACT_PHONE;//contact_phone
		 public String CONTACT_FAX;//contact_fax
		 public String HOTEL_WEBSITE;//hotel_website
		 public String BUSINESS_AREA;//business_area
		 public String HOTEL_ROUTE;//hotel_route
		 public Date START_DATE;//start_date
		 public Integer ROOM_NUMBER;//room_number
		 public Integer PAY_WAY;//pay_way
		 public String LONGITUDE;//longitude
		 public String LATITUDE;//latitude
		 public Integer IF_FOREIGN;//if_foreign
		 public Integer CONFER_STATUS;//confer_status
		 public Long BELONG_CODE;//belong_code
		 public Integer IF_CHANGE_SEND;//if_change_send
		 public String EXTERNAL_ID;//external_id
		 public String URL_ADDRESS;//url_address
		 public String WEB_NUMBER;//web_number
		 public String WEB_PASS_CODE;//web_pass_code
		 public Integer STATUS;//status
		 public Date CREATE_DATE;//create_date
		 public Date MODIFY_DATE;//modify_date
		 public String HOTEL_ADDRESS_FOREIGN;//hotel_address_foreign
		 public String POSTAL_CODE;//postal_code
		 public Date NEW_FIT_DATE;//new_fit_date
		 public Integer IF_GO_PUBLIC;//if_go_public
		 public Date GO_PUBLIC_DATE;//go_public_date
		 public Integer MAX_RESERVE_DATE;//max_reserve_date
		 public Integer COMMEND_EXPON;//commend_expon
		 public Double PUBLIC_PRAISE;//public_praise
		 public String E_MAIL;//e_mail
		 public Integer IF_ONLINE;//if_online
		 public String SWITCHBOARD;//switchboard
		 public Integer IF_HOTEL_ACCR;//if_hotel_accr
		 public Integer FIT_KIND;//fit_kind
		 public Integer AUDIT_TYPE;//audit_type
		 public Integer AUDIT_KIND;//audit_kind
		 public String FULL_PINYIN;//full_pinyin
		 public String PINYIN_FIR;//pinyin_fir
		 public Integer IF_GROUP;//if_group
		 public String GROUP_NAME;//group_name
		 public String MAIN_FLOORS;//main_floors
		 public String APPENDIX_FLOORS;//appendix_floors
		 public String HOTEL_ADVANTAGE;//hotel_advantage
		 public Integer IF_TOP;//if_top
		 public Integer IF_CANCEL_HOLD;//if_cancel_hold
		 public Integer ENABLEWATERPOOL;//蓄水池开关 1 开启 0 关闭
		 public Integer ORDER_CHANGE_FLAG;//是否支持变更 1 支持 0 不支持
		 public Integer MESSAGE_SALE;//短信促销开关  1 开启 0 关闭
		 public String SOURCE_HOTEL_ID;//source_hotel_id
		 public Integer SOURCE_TYPE;//source_type
		 public String BRANDID;//brandid
		 public String HOTEL_IMAGE;//hotel_image
		 public String SERVICE;//service
		 public String FACILITY;//设施
		 public String CATERING;//餐饮
		 public String RECREATION;//休闲
		 public String CREDITCARD;//creditcard
		 public String NEARBY;//nearby
		 public String STREET;//street
		 public String STREETADDR;//streetaddr
		 public Integer EDIT_TYPE;//编辑类型 1-可编辑（自己维护的酒店） 2-不可编辑（引入的酒店）
		 public Integer LOWERPRICE;//最低价
		 public String IMPRESSDESC;//酒店印象
		 public String RELATIONID;//relationid
		 public String TUID;//tuid
		 public Integer LOWERPRICE2;//lowerprice2
		 public Integer ISMAJOR;//是否主酒店  0-非主酒店 1-主酒店
		 public Long TRAVELID;//所属旅行社 引用bx_hotel_travel_t.travelId
		 public Integer FLAG;//该酒店是否有匹配数据（0：未匹配，1：已匹配，默认为0）
		 public String BUSINESS_AREA_NAME;//business_area_name
		 public Integer HIGHESTPRICE;//highestprice
		 public String MICROSMS;//microsms
		 public Double CASHBACK;//最高返
		 public String ROOMIMAGE;//房型图片
		 public Integer ROOMIMAGECOUNT;//房型图片数
		 public Integer IFTRUE;//是否进入搜索引擎，1=进入，0=不进入，默认为0
		 public Long CURVERSION;//curversion
		 public String PAYMENTTYPE;//All全部 ,SelfPay 现付,Prepay预付
	
		 public void setCITY_CODE(String CITY_CODE)
		 {
		 	this.CITY_CODE=CITY_CODE;
		 }
		 public String getCITY_CODE()
		 {
		 	return this.CITY_CODE;
		 }
		 public void setDISTRICT_CODE(String DISTRICT_CODE)
		 {
		 	this.DISTRICT_CODE=DISTRICT_CODE;
		 }
		 public String getDISTRICT_CODE()
		 {
		 	return this.DISTRICT_CODE;
		 }
		 public void setCOMPANY_ID(String COMPANY_ID)
		 {
		 	this.COMPANY_ID=COMPANY_ID;
		 }
		 public String getCOMPANY_ID()
		 {
		 	return this.COMPANY_ID;
		 }
		 public void setHOTEL_NAME(String HOTEL_NAME)
		 {
		 	this.HOTEL_NAME=HOTEL_NAME;
		 }
		 public String getHOTEL_NAME()
		 {
		 	return this.HOTEL_NAME;
		 }
		 public void setHOTEL_NAME_FOREIGN(String HOTEL_NAME_FOREIGN)
		 {
		 	this.HOTEL_NAME_FOREIGN=HOTEL_NAME_FOREIGN;
		 }
		 public String getHOTEL_NAME_FOREIGN()
		 {
		 	return this.HOTEL_NAME_FOREIGN;
		 }
		 public void setHOTEL_NAME_SIMPLE(String HOTEL_NAME_SIMPLE)
		 {
		 	this.HOTEL_NAME_SIMPLE=HOTEL_NAME_SIMPLE;
		 }
		 public String getHOTEL_NAME_SIMPLE()
		 {
		 	return this.HOTEL_NAME_SIMPLE;
		 }
		 public void setKEY_WORDS(String KEY_WORDS)
		 {
		 	this.KEY_WORDS=KEY_WORDS;
		 }
		 public String getKEY_WORDS()
		 {
		 	return this.KEY_WORDS;
		 }
		 public void setHOTEL_ADDRESS(String HOTEL_ADDRESS)
		 {
		 	this.HOTEL_ADDRESS=HOTEL_ADDRESS;
		 }
		 public String getHOTEL_ADDRESS()
		 {
		 	return this.HOTEL_ADDRESS;
		 }
		 public void setHOTEL_TYPE(Integer HOTEL_TYPE)
		 {
		 	this.HOTEL_TYPE=HOTEL_TYPE;
		 }
		 public Integer getHOTEL_TYPE()
		 {
		 	return this.HOTEL_TYPE;
		 }
		 public void setHOTEL_KIND(Integer HOTEL_KIND)
		 {
		 	this.HOTEL_KIND=HOTEL_KIND;
		 }
		 public Integer getHOTEL_KIND()
		 {
		 	return this.HOTEL_KIND;
		 }
		 public void setHOTEL_LEVEL(Integer HOTEL_LEVEL)
		 {
		 	this.HOTEL_LEVEL=HOTEL_LEVEL;
		 }
		 public Integer getHOTEL_LEVEL()
		 {
		 	return this.HOTEL_LEVEL;
		 }
		 public void setHOTEL_INTRO(String HOTEL_INTRO)
		 {
		 	this.HOTEL_INTRO=HOTEL_INTRO;
		 }
		 public String getHOTEL_INTRO()
		 {
		 	return this.HOTEL_INTRO;
		 }
		 public void setCONTACT_PHONE(String CONTACT_PHONE)
		 {
		 	this.CONTACT_PHONE=CONTACT_PHONE;
		 }
		 public String getCONTACT_PHONE()
		 {
		 	return this.CONTACT_PHONE;
		 }
		 public void setCONTACT_FAX(String CONTACT_FAX)
		 {
		 	this.CONTACT_FAX=CONTACT_FAX;
		 }
		 public String getCONTACT_FAX()
		 {
		 	return this.CONTACT_FAX;
		 }
		 public void setHOTEL_WEBSITE(String HOTEL_WEBSITE)
		 {
		 	this.HOTEL_WEBSITE=HOTEL_WEBSITE;
		 }
		 public String getHOTEL_WEBSITE()
		 {
		 	return this.HOTEL_WEBSITE;
		 }
		 public void setBUSINESS_AREA(String BUSINESS_AREA)
		 {
		 	this.BUSINESS_AREA=BUSINESS_AREA;
		 }
		 public String getBUSINESS_AREA()
		 {
		 	return this.BUSINESS_AREA;
		 }
		 public void setHOTEL_ROUTE(String HOTEL_ROUTE)
		 {
		 	this.HOTEL_ROUTE=HOTEL_ROUTE;
		 }
		 public String getHOTEL_ROUTE()
		 {
		 	return this.HOTEL_ROUTE;
		 }
		 public void setSTART_DATE(Date START_DATE)
		 {
		 	this.START_DATE=START_DATE;
		 }
		 public Date getSTART_DATE()
		 {
		 	return this.START_DATE;
		 }
		 public void setROOM_NUMBER(Integer ROOM_NUMBER)
		 {
		 	this.ROOM_NUMBER=ROOM_NUMBER;
		 }
		 public Integer getROOM_NUMBER()
		 {
		 	return this.ROOM_NUMBER;
		 }
		 public void setPAY_WAY(Integer PAY_WAY)
		 {
		 	this.PAY_WAY=PAY_WAY;
		 }
		 public Integer getPAY_WAY()
		 {
		 	return this.PAY_WAY;
		 }
		 public void setLONGITUDE(String LONGITUDE)
		 {
		 	this.LONGITUDE=LONGITUDE;
		 }
		 public String getLONGITUDE()
		 {
		 	return this.LONGITUDE;
		 }
		 public void setLATITUDE(String LATITUDE)
		 {
		 	this.LATITUDE=LATITUDE;
		 }
		 public String getLATITUDE()
		 {
		 	return this.LATITUDE;
		 }
		 public void setIF_FOREIGN(Integer IF_FOREIGN)
		 {
		 	this.IF_FOREIGN=IF_FOREIGN;
		 }
		 public Integer getIF_FOREIGN()
		 {
		 	return this.IF_FOREIGN;
		 }
		 public void setCONFER_STATUS(Integer CONFER_STATUS)
		 {
		 	this.CONFER_STATUS=CONFER_STATUS;
		 }
		 public Integer getCONFER_STATUS()
		 {
		 	return this.CONFER_STATUS;
		 }
		 public void setBELONG_CODE(Long BELONG_CODE)
		 {
		 	this.BELONG_CODE=BELONG_CODE;
		 }
		 public Long getBELONG_CODE()
		 {
		 	return this.BELONG_CODE;
		 }
		 public void setIF_CHANGE_SEND(Integer IF_CHANGE_SEND)
		 {
		 	this.IF_CHANGE_SEND=IF_CHANGE_SEND;
		 }
		 public Integer getIF_CHANGE_SEND()
		 {
		 	return this.IF_CHANGE_SEND;
		 }
		 public void setEXTERNAL_ID(String EXTERNAL_ID)
		 {
		 	this.EXTERNAL_ID=EXTERNAL_ID;
		 }
		 public String getEXTERNAL_ID()
		 {
		 	return this.EXTERNAL_ID;
		 }
		 public void setURL_ADDRESS(String URL_ADDRESS)
		 {
		 	this.URL_ADDRESS=URL_ADDRESS;
		 }
		 public String getURL_ADDRESS()
		 {
		 	return this.URL_ADDRESS;
		 }
		 public void setWEB_NUMBER(String WEB_NUMBER)
		 {
		 	this.WEB_NUMBER=WEB_NUMBER;
		 }
		 public String getWEB_NUMBER()
		 {
		 	return this.WEB_NUMBER;
		 }
		 public void setWEB_PASS_CODE(String WEB_PASS_CODE)
		 {
		 	this.WEB_PASS_CODE=WEB_PASS_CODE;
		 }
		 public String getWEB_PASS_CODE()
		 {
		 	return this.WEB_PASS_CODE;
		 }
		 public void setSTATUS(Integer STATUS)
		 {
		 	this.STATUS=STATUS;
		 }
		 public Integer getSTATUS()
		 {
		 	return this.STATUS;
		 }
		 public void setCREATE_DATE(Date CREATE_DATE)
		 {
		 	this.CREATE_DATE=CREATE_DATE;
		 }
		 public Date getCREATE_DATE()
		 {
		 	return this.CREATE_DATE;
		 }
		 public void setMODIFY_DATE(Date MODIFY_DATE)
		 {
		 	this.MODIFY_DATE=MODIFY_DATE;
		 }
		 public Date getMODIFY_DATE()
		 {
		 	return this.MODIFY_DATE;
		 }
		 public void setHOTEL_ADDRESS_FOREIGN(String HOTEL_ADDRESS_FOREIGN)
		 {
		 	this.HOTEL_ADDRESS_FOREIGN=HOTEL_ADDRESS_FOREIGN;
		 }
		 public String getHOTEL_ADDRESS_FOREIGN()
		 {
		 	return this.HOTEL_ADDRESS_FOREIGN;
		 }
		 public void setPOSTAL_CODE(String POSTAL_CODE)
		 {
		 	this.POSTAL_CODE=POSTAL_CODE;
		 }
		 public String getPOSTAL_CODE()
		 {
		 	return this.POSTAL_CODE;
		 }
		 public void setNEW_FIT_DATE(Date NEW_FIT_DATE)
		 {
		 	this.NEW_FIT_DATE=NEW_FIT_DATE;
		 }
		 public Date getNEW_FIT_DATE()
		 {
		 	return this.NEW_FIT_DATE;
		 }
		 public void setIF_GO_PUBLIC(Integer IF_GO_PUBLIC)
		 {
		 	this.IF_GO_PUBLIC=IF_GO_PUBLIC;
		 }
		 public Integer getIF_GO_PUBLIC()
		 {
		 	return this.IF_GO_PUBLIC;
		 }
		 public void setGO_PUBLIC_DATE(Date GO_PUBLIC_DATE)
		 {
		 	this.GO_PUBLIC_DATE=GO_PUBLIC_DATE;
		 }
		 public Date getGO_PUBLIC_DATE()
		 {
		 	return this.GO_PUBLIC_DATE;
		 }
		 public void setMAX_RESERVE_DATE(Integer MAX_RESERVE_DATE)
		 {
		 	this.MAX_RESERVE_DATE=MAX_RESERVE_DATE;
		 }
		 public Integer getMAX_RESERVE_DATE()
		 {
		 	return this.MAX_RESERVE_DATE;
		 }
		 public void setCOMMEND_EXPON(Integer COMMEND_EXPON)
		 {
		 	this.COMMEND_EXPON=COMMEND_EXPON;
		 }
		 public Integer getCOMMEND_EXPON()
		 {
		 	return this.COMMEND_EXPON;
		 }
		 public void setPUBLIC_PRAISE(Double PUBLIC_PRAISE)
		 {
		 	this.PUBLIC_PRAISE=PUBLIC_PRAISE;
		 }
		 public Double getPUBLIC_PRAISE()
		 {
		 	return this.PUBLIC_PRAISE;
		 }
		 public void setE_MAIL(String E_MAIL)
		 {
		 	this.E_MAIL=E_MAIL;
		 }
		 public String getE_MAIL()
		 {
		 	return this.E_MAIL;
		 }
		 public void setIF_ONLINE(Integer IF_ONLINE)
		 {
		 	this.IF_ONLINE=IF_ONLINE;
		 }
		 public Integer getIF_ONLINE()
		 {
		 	return this.IF_ONLINE;
		 }
		 public void setSWITCHBOARD(String SWITCHBOARD)
		 {
		 	this.SWITCHBOARD=SWITCHBOARD;
		 }
		 public String getSWITCHBOARD()
		 {
		 	return this.SWITCHBOARD;
		 }
		 public void setIF_HOTEL_ACCR(Integer IF_HOTEL_ACCR)
		 {
		 	this.IF_HOTEL_ACCR=IF_HOTEL_ACCR;
		 }
		 public Integer getIF_HOTEL_ACCR()
		 {
		 	return this.IF_HOTEL_ACCR;
		 }
		 public void setFIT_KIND(Integer FIT_KIND)
		 {
		 	this.FIT_KIND=FIT_KIND;
		 }
		 public Integer getFIT_KIND()
		 {
		 	return this.FIT_KIND;
		 }
		 public void setAUDIT_TYPE(Integer AUDIT_TYPE)
		 {
		 	this.AUDIT_TYPE=AUDIT_TYPE;
		 }
		 public Integer getAUDIT_TYPE()
		 {
		 	return this.AUDIT_TYPE;
		 }
		 public void setAUDIT_KIND(Integer AUDIT_KIND)
		 {
		 	this.AUDIT_KIND=AUDIT_KIND;
		 }
		 public Integer getAUDIT_KIND()
		 {
		 	return this.AUDIT_KIND;
		 }
		 public void setFULL_PINYIN(String FULL_PINYIN)
		 {
		 	this.FULL_PINYIN=FULL_PINYIN;
		 }
		 public String getFULL_PINYIN()
		 {
		 	return this.FULL_PINYIN;
		 }
		 public void setPINYIN_FIR(String PINYIN_FIR)
		 {
		 	this.PINYIN_FIR=PINYIN_FIR;
		 }
		 public String getPINYIN_FIR()
		 {
		 	return this.PINYIN_FIR;
		 }
		 public void setIF_GROUP(Integer IF_GROUP)
		 {
		 	this.IF_GROUP=IF_GROUP;
		 }
		 public Integer getIF_GROUP()
		 {
		 	return this.IF_GROUP;
		 }
		 public void setGROUP_NAME(String GROUP_NAME)
		 {
		 	this.GROUP_NAME=GROUP_NAME;
		 }
		 public String getGROUP_NAME()
		 {
		 	return this.GROUP_NAME;
		 }
		 public void setMAIN_FLOORS(String MAIN_FLOORS)
		 {
		 	this.MAIN_FLOORS=MAIN_FLOORS;
		 }
		 public String getMAIN_FLOORS()
		 {
		 	return this.MAIN_FLOORS;
		 }
		 public void setAPPENDIX_FLOORS(String APPENDIX_FLOORS)
		 {
		 	this.APPENDIX_FLOORS=APPENDIX_FLOORS;
		 }
		 public String getAPPENDIX_FLOORS()
		 {
		 	return this.APPENDIX_FLOORS;
		 }
		 public void setHOTEL_ADVANTAGE(String HOTEL_ADVANTAGE)
		 {
		 	this.HOTEL_ADVANTAGE=HOTEL_ADVANTAGE;
		 }
		 public String getHOTEL_ADVANTAGE()
		 {
		 	return this.HOTEL_ADVANTAGE;
		 }
		 public void setIF_TOP(Integer IF_TOP)
		 {
		 	this.IF_TOP=IF_TOP;
		 }
		 public Integer getIF_TOP()
		 {
		 	return this.IF_TOP;
		 }
		 public void setIF_CANCEL_HOLD(Integer IF_CANCEL_HOLD)
		 {
		 	this.IF_CANCEL_HOLD=IF_CANCEL_HOLD;
		 }
		 public Integer getIF_CANCEL_HOLD()
		 {
		 	return this.IF_CANCEL_HOLD;
		 }
		 public void setENABLEWATERPOOL(Integer ENABLEWATERPOOL)
		 {
		 	this.ENABLEWATERPOOL=ENABLEWATERPOOL;
		 }
		 public Integer getENABLEWATERPOOL()
		 {
		 	return this.ENABLEWATERPOOL;
		 }
		 public void setORDER_CHANGE_FLAG(Integer ORDER_CHANGE_FLAG)
		 {
		 	this.ORDER_CHANGE_FLAG=ORDER_CHANGE_FLAG;
		 }
		 public Integer getORDER_CHANGE_FLAG()
		 {
		 	return this.ORDER_CHANGE_FLAG;
		 }
		 public void setMESSAGE_SALE(Integer MESSAGE_SALE)
		 {
		 	this.MESSAGE_SALE=MESSAGE_SALE;
		 }
		 public Integer getMESSAGE_SALE()
		 {
		 	return this.MESSAGE_SALE;
		 }
		 public void setSOURCE_HOTEL_ID(String SOURCE_HOTEL_ID)
		 {
		 	this.SOURCE_HOTEL_ID=SOURCE_HOTEL_ID;
		 }
		 public String getSOURCE_HOTEL_ID()
		 {
		 	return this.SOURCE_HOTEL_ID;
		 }
		 public void setSOURCE_TYPE(Integer SOURCE_TYPE)
		 {
		 	this.SOURCE_TYPE=SOURCE_TYPE;
		 }
		 public Integer getSOURCE_TYPE()
		 {
		 	return this.SOURCE_TYPE;
		 }
		 public void setBRANDID(String BRANDID)
		 {
		 	this.BRANDID=BRANDID;
		 }
		 public String getBRANDID()
		 {
		 	return this.BRANDID;
		 }
		 public void setHOTEL_IMAGE(String HOTEL_IMAGE)
		 {
		 	this.HOTEL_IMAGE=HOTEL_IMAGE;
		 }
		 public String getHOTEL_IMAGE()
		 {
		 	return this.HOTEL_IMAGE;
		 }
		 public void setSERVICE(String SERVICE)
		 {
		 	this.SERVICE=SERVICE;
		 }
		 public String getSERVICE()
		 {
		 	return this.SERVICE;
		 }
		 public void setFACILITY(String FACILITY)
		 {
		 	this.FACILITY=FACILITY;
		 }
		 public String getFACILITY()
		 {
		 	return this.FACILITY;
		 }
		 public void setCATERING(String CATERING)
		 {
		 	this.CATERING=CATERING;
		 }
		 public String getCATERING()
		 {
		 	return this.CATERING;
		 }
		 public void setRECREATION(String RECREATION)
		 {
		 	this.RECREATION=RECREATION;
		 }
		 public String getRECREATION()
		 {
		 	return this.RECREATION;
		 }
		 public void setCREDITCARD(String CREDITCARD)
		 {
		 	this.CREDITCARD=CREDITCARD;
		 }
		 public String getCREDITCARD()
		 {
		 	return this.CREDITCARD;
		 }
		 public void setNEARBY(String NEARBY)
		 {
		 	this.NEARBY=NEARBY;
		 }
		 public String getNEARBY()
		 {
		 	return this.NEARBY;
		 }
		 public void setSTREET(String STREET)
		 {
		 	this.STREET=STREET;
		 }
		 public String getSTREET()
		 {
		 	return this.STREET;
		 }
		 public void setSTREETADDR(String STREETADDR)
		 {
		 	this.STREETADDR=STREETADDR;
		 }
		 public String getSTREETADDR()
		 {
		 	return this.STREETADDR;
		 }
		 public void setEDIT_TYPE(Integer EDIT_TYPE)
		 {
		 	this.EDIT_TYPE=EDIT_TYPE;
		 }
		 public Integer getEDIT_TYPE()
		 {
		 	return this.EDIT_TYPE;
		 }
		 public void setLOWERPRICE(Integer LOWERPRICE)
		 {
		 	this.LOWERPRICE=LOWERPRICE;
		 }
		 public Integer getLOWERPRICE()
		 {
		 	return this.LOWERPRICE;
		 }
		 public void setIMPRESSDESC(String IMPRESSDESC)
		 {
		 	this.IMPRESSDESC=IMPRESSDESC;
		 }
		 public String getIMPRESSDESC()
		 {
		 	return this.IMPRESSDESC;
		 }
		 public void setRELATIONID(String RELATIONID)
		 {
		 	this.RELATIONID=RELATIONID;
		 }
		 public String getRELATIONID()
		 {
		 	return this.RELATIONID;
		 }
		 public void setTUID(String TUID)
		 {
		 	this.TUID=TUID;
		 }
		 public String getTUID()
		 {
		 	return this.TUID;
		 }
		 public void setLOWERPRICE2(Integer LOWERPRICE2)
		 {
		 	this.LOWERPRICE2=LOWERPRICE2;
		 }
		 public Integer getLOWERPRICE2()
		 {
		 	return this.LOWERPRICE2;
		 }
		 public void setISMAJOR(Integer ISMAJOR)
		 {
		 	this.ISMAJOR=ISMAJOR;
		 }
		 public Integer getISMAJOR()
		 {
		 	return this.ISMAJOR;
		 }
		 public void setTRAVELID(Long TRAVELID)
		 {
		 	this.TRAVELID=TRAVELID;
		 }
		 public Long getTRAVELID()
		 {
		 	return this.TRAVELID;
		 }
		 public void setFLAG(Integer FLAG)
		 {
		 	this.FLAG=FLAG;
		 }
		 public Integer getFLAG()
		 {
		 	return this.FLAG;
		 }
		 public void setBUSINESS_AREA_NAME(String BUSINESS_AREA_NAME)
		 {
		 	this.BUSINESS_AREA_NAME=BUSINESS_AREA_NAME;
		 }
		 public String getBUSINESS_AREA_NAME()
		 {
		 	return this.BUSINESS_AREA_NAME;
		 }
		 public void setHIGHESTPRICE(Integer HIGHESTPRICE)
		 {
		 	this.HIGHESTPRICE=HIGHESTPRICE;
		 }
		 public Integer getHIGHESTPRICE()
		 {
		 	return this.HIGHESTPRICE;
		 }
		 public void setMICROSMS(String MICROSMS)
		 {
		 	this.MICROSMS=MICROSMS;
		 }
		 public String getMICROSMS()
		 {
		 	return this.MICROSMS;
		 }
		 public void setCASHBACK(Double CASHBACK)
		 {
		 	this.CASHBACK=CASHBACK;
		 }
		 public Double getCASHBACK()
		 {
		 	return this.CASHBACK;
		 }
		 public void setROOMIMAGE(String ROOMIMAGE)
		 {
		 	this.ROOMIMAGE=ROOMIMAGE;
		 }
		 public String getROOMIMAGE()
		 {
		 	return this.ROOMIMAGE;
		 }
		 public void setROOMIMAGECOUNT(Integer ROOMIMAGECOUNT)
		 {
		 	this.ROOMIMAGECOUNT=ROOMIMAGECOUNT;
		 }
		 public Integer getROOMIMAGECOUNT()
		 {
		 	return this.ROOMIMAGECOUNT;
		 }
		 public void setIFTRUE(Integer IFTRUE)
		 {
		 	this.IFTRUE=IFTRUE;
		 }
		 public Integer getIFTRUE()
		 {
		 	return this.IFTRUE;
		 }
		 public void setCURVERSION(Long CURVERSION)
		 {
		 	this.CURVERSION=CURVERSION;
		 }
		 public Long getCURVERSION()
		 {
		 	return this.CURVERSION;
		 }
		 public void setPAYMENTTYPE(String PAYMENTTYPE)
		 {
		 	this.PAYMENTTYPE=PAYMENTTYPE;
		 }
		 public String getPAYMENTTYPE()
		 {
		 	return this.PAYMENTTYPE;
		 }
	
	/*
		 model.setCITY_CODE("CITY_CODEvalue");
		 model.setDISTRICT_CODE("DISTRICT_CODEvalue");
		 model.setCOMPANY_ID("COMPANY_IDvalue");
		 model.setHOTEL_NAME("HOTEL_NAMEvalue");
		 model.setHOTEL_NAME_FOREIGN("HOTEL_NAME_FOREIGNvalue");
		 model.setHOTEL_NAME_SIMPLE("HOTEL_NAME_SIMPLEvalue");
		 model.setKEY_WORDS("KEY_WORDSvalue");
		 model.setHOTEL_ADDRESS("HOTEL_ADDRESSvalue");
		 model.setHOTEL_TYPE("HOTEL_TYPEvalue");
		 model.setHOTEL_KIND("HOTEL_KINDvalue");
		 model.setHOTEL_LEVEL("HOTEL_LEVELvalue");
		 model.setHOTEL_INTRO("HOTEL_INTROvalue");
		 model.setCONTACT_PHONE("CONTACT_PHONEvalue");
		 model.setCONTACT_FAX("CONTACT_FAXvalue");
		 model.setHOTEL_WEBSITE("HOTEL_WEBSITEvalue");
		 model.setBUSINESS_AREA("BUSINESS_AREAvalue");
		 model.setHOTEL_ROUTE("HOTEL_ROUTEvalue");
		 model.setSTART_DATE("START_DATEvalue");
		 model.setROOM_NUMBER("ROOM_NUMBERvalue");
		 model.setPAY_WAY("PAY_WAYvalue");
		 model.setLONGITUDE("LONGITUDEvalue");
		 model.setLATITUDE("LATITUDEvalue");
		 model.setIF_FOREIGN("IF_FOREIGNvalue");
		 model.setCONFER_STATUS("CONFER_STATUSvalue");
		 model.setBELONG_CODE("BELONG_CODEvalue");
		 model.setIF_CHANGE_SEND("IF_CHANGE_SENDvalue");
		 model.setEXTERNAL_ID("EXTERNAL_IDvalue");
		 model.setURL_ADDRESS("URL_ADDRESSvalue");
		 model.setWEB_NUMBER("WEB_NUMBERvalue");
		 model.setWEB_PASS_CODE("WEB_PASS_CODEvalue");
		 model.setSTATUS("STATUSvalue");
		 model.setCREATE_DATE("CREATE_DATEvalue");
		 model.setMODIFY_DATE("MODIFY_DATEvalue");
		 model.setHOTEL_ADDRESS_FOREIGN("HOTEL_ADDRESS_FOREIGNvalue");
		 model.setPOSTAL_CODE("POSTAL_CODEvalue");
		 model.setNEW_FIT_DATE("NEW_FIT_DATEvalue");
		 model.setIF_GO_PUBLIC("IF_GO_PUBLICvalue");
		 model.setGO_PUBLIC_DATE("GO_PUBLIC_DATEvalue");
		 model.setMAX_RESERVE_DATE("MAX_RESERVE_DATEvalue");
		 model.setCOMMEND_EXPON("COMMEND_EXPONvalue");
		 model.setPUBLIC_PRAISE("PUBLIC_PRAISEvalue");
		 model.setE_MAIL("E_MAILvalue");
		 model.setIF_ONLINE("IF_ONLINEvalue");
		 model.setSWITCHBOARD("SWITCHBOARDvalue");
		 model.setIF_HOTEL_ACCR("IF_HOTEL_ACCRvalue");
		 model.setFIT_KIND("FIT_KINDvalue");
		 model.setAUDIT_TYPE("AUDIT_TYPEvalue");
		 model.setAUDIT_KIND("AUDIT_KINDvalue");
		 model.setFULL_PINYIN("FULL_PINYINvalue");
		 model.setPINYIN_FIR("PINYIN_FIRvalue");
		 model.setIF_GROUP("IF_GROUPvalue");
		 model.setGROUP_NAME("GROUP_NAMEvalue");
		 model.setMAIN_FLOORS("MAIN_FLOORSvalue");
		 model.setAPPENDIX_FLOORS("APPENDIX_FLOORSvalue");
		 model.setHOTEL_ADVANTAGE("HOTEL_ADVANTAGEvalue");
		 model.setIF_TOP("IF_TOPvalue");
		 model.setIF_CANCEL_HOLD("IF_CANCEL_HOLDvalue");
		 model.setENABLEWATERPOOL("ENABLEWATERPOOLvalue");
		 model.setORDER_CHANGE_FLAG("ORDER_CHANGE_FLAGvalue");
		 model.setMESSAGE_SALE("MESSAGE_SALEvalue");
		 model.setSOURCE_HOTEL_ID("SOURCE_HOTEL_IDvalue");
		 model.setSOURCE_TYPE("SOURCE_TYPEvalue");
		 model.setBRANDID("BRANDIDvalue");
		 model.setHOTEL_IMAGE("HOTEL_IMAGEvalue");
		 model.setSERVICE("SERVICEvalue");
		 model.setFACILITY("FACILITYvalue");
		 model.setCATERING("CATERINGvalue");
		 model.setRECREATION("RECREATIONvalue");
		 model.setCREDITCARD("CREDITCARDvalue");
		 model.setNEARBY("NEARBYvalue");
		 model.setSTREET("STREETvalue");
		 model.setSTREETADDR("STREETADDRvalue");
		 model.setEDIT_TYPE("EDIT_TYPEvalue");
		 model.setLOWERPRICE("LOWERPRICEvalue");
		 model.setIMPRESSDESC("IMPRESSDESCvalue");
		 model.setRELATIONID("RELATIONIDvalue");
		 model.setTUID("TUIDvalue");
		 model.setLOWERPRICE2("LOWERPRICE2value");
		 model.setISMAJOR("ISMAJORvalue");
		 model.setTRAVELID("TRAVELIDvalue");
		 model.setFLAG("FLAGvalue");
		 model.setBUSINESS_AREA_NAME("BUSINESS_AREA_NAMEvalue");
		 model.setHIGHESTPRICE("HIGHESTPRICEvalue");
		 model.setMICROSMS("MICROSMSvalue");
		 model.setCASHBACK("CASHBACKvalue");
		 model.setROOMIMAGE("ROOMIMAGEvalue");
		 model.setROOMIMAGECOUNT("ROOMIMAGECOUNTvalue");
		 model.setIFTRUE("IFTRUEvalue");
		 model.setCURVERSION("CURVERSIONvalue");
		 model.setPAYMENTTYPE("PAYMENTTYPEvalue");
		 model.getCITY_CODE();
		 model.getDISTRICT_CODE();
		 model.getCOMPANY_ID();
		 model.getHOTEL_NAME();
		 model.getHOTEL_NAME_FOREIGN();
		 model.getHOTEL_NAME_SIMPLE();
		 model.getKEY_WORDS();
		 model.getHOTEL_ADDRESS();
		 model.getHOTEL_TYPE();
		 model.getHOTEL_KIND();
		 model.getHOTEL_LEVEL();
		 model.getHOTEL_INTRO();
		 model.getCONTACT_PHONE();
		 model.getCONTACT_FAX();
		 model.getHOTEL_WEBSITE();
		 model.getBUSINESS_AREA();
		 model.getHOTEL_ROUTE();
		 model.getSTART_DATE();
		 model.getROOM_NUMBER();
		 model.getPAY_WAY();
		 model.getLONGITUDE();
		 model.getLATITUDE();
		 model.getIF_FOREIGN();
		 model.getCONFER_STATUS();
		 model.getBELONG_CODE();
		 model.getIF_CHANGE_SEND();
		 model.getEXTERNAL_ID();
		 model.getURL_ADDRESS();
		 model.getWEB_NUMBER();
		 model.getWEB_PASS_CODE();
		 model.getSTATUS();
		 model.getCREATE_DATE();
		 model.getMODIFY_DATE();
		 model.getHOTEL_ADDRESS_FOREIGN();
		 model.getPOSTAL_CODE();
		 model.getNEW_FIT_DATE();
		 model.getIF_GO_PUBLIC();
		 model.getGO_PUBLIC_DATE();
		 model.getMAX_RESERVE_DATE();
		 model.getCOMMEND_EXPON();
		 model.getPUBLIC_PRAISE();
		 model.getE_MAIL();
		 model.getIF_ONLINE();
		 model.getSWITCHBOARD();
		 model.getIF_HOTEL_ACCR();
		 model.getFIT_KIND();
		 model.getAUDIT_TYPE();
		 model.getAUDIT_KIND();
		 model.getFULL_PINYIN();
		 model.getPINYIN_FIR();
		 model.getIF_GROUP();
		 model.getGROUP_NAME();
		 model.getMAIN_FLOORS();
		 model.getAPPENDIX_FLOORS();
		 model.getHOTEL_ADVANTAGE();
		 model.getIF_TOP();
		 model.getIF_CANCEL_HOLD();
		 model.getENABLEWATERPOOL();
		 model.getORDER_CHANGE_FLAG();
		 model.getMESSAGE_SALE();
		 model.getSOURCE_HOTEL_ID();
		 model.getSOURCE_TYPE();
		 model.getBRANDID();
		 model.getHOTEL_IMAGE();
		 model.getSERVICE();
		 model.getFACILITY();
		 model.getCATERING();
		 model.getRECREATION();
		 model.getCREDITCARD();
		 model.getNEARBY();
		 model.getSTREET();
		 model.getSTREETADDR();
		 model.getEDIT_TYPE();
		 model.getLOWERPRICE();
		 model.getIMPRESSDESC();
		 model.getRELATIONID();
		 model.getTUID();
		 model.getLOWERPRICE2();
		 model.getISMAJOR();
		 model.getTRAVELID();
		 model.getFLAG();
		 model.getBUSINESS_AREA_NAME();
		 model.getHIGHESTPRICE();
		 model.getMICROSMS();
		 model.getCASHBACK();
		 model.getROOMIMAGE();
		 model.getROOMIMAGECOUNT();
		 model.getIFTRUE();
		 model.getCURVERSION();
		 model.getPAYMENTTYPE();
	*/
}

