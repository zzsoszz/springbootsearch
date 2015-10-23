package dinamica.generator;

import java.io.File;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import dinamica.util.FileHelper;
import freemarker.template.Configuration;
import freemarker.template.DefaultObjectWrapper;
import freemarker.template.Template;
import freemarker.template.TemplateException;

/**
 * freemarker 模板工具
 * 
 * @author xyg
 * @time 2010-2-6下午04:07:27
 * @version 1.0
 */

public class MainForJavaByDatabase {
	
    public static void main(String args[]){
    	gen_java_list();
    }
    
    public  static void gen_java_list(){
    	
    	//D:\bxdev\trunck\website\portal\WebRoot\WEB-INF\action\demo\basic\java
		    	//bx_order_t bxorder
				//bx_order_hotel_t bxorderhotel
				//cim_tpc_htl_info_t   cimtpchtlinfo  
				//cim_tpc_htl_room_info_t   cimtpchtlroominfo
				//cim_tpc_price_detail_info_t  cimtpcpricedetailinfo
				//cim_tpc_price_plan_info_t  cimtpcpriceplaninfo
				//bx_supportedcard  bxsupportedcard
				//bx_base_usercreditcard_t bxbaseusercreditcard
				//bx_base_certificatestype_t  bxbasecertificatestype
    			//bx_system_roleUser_t  com.bxtel.bxsystemroleuser
    			//bx_system_rolePrivilege_t  com.bxtel.bxsystemroleprivilege
    			//bx_system_privilege_t   com.bxtel.bxsystemprivilege
    			//bx_system_employee_t com.bxtel.bxsystememployee
    			//bx_system_role_t  bxsystemrole
    		
    			
    	    	HashMap<String, String> hash=new HashMap<String, String>();
//    	    	hash.put("bx_order_t", "com.bxtel.bxorder");
//    	    	hash.put("bx_order_hotel_t", "com.bxtel.bxorderhotel");
				hash.put("cim_tpc_htl_info_t", "com.bxtel.cimtpchtlinfo");
//    	    	hash.put("cim_tpc_htl_room_info_t", "com.bxtel.cimtpchtlroominfo");
//    	    	hash.put("cim_tpc_price_detail_info_t", "com.bxtel.cimtpcpricedetailinfo");
//    	    	hash.put("cim_tpc_price_plan_info_t", "com.bxtel.cimtpcpriceplaninfo");
//    	    	hash.put("bx_base_usercreditcard_t", "com.bxtel.bxbaseusercreditcard");
//    	    	hash.put("bx_base_certificatestype_t", "com.bxtel.bxbasecertificatestype");
//    	    	hash.put("bx_system_roleUser_t", "com.bxtel.bxsystemroleuser");
//    	    	hash.put("bx_system_rolePrivilege_t", "com.bxtel.bxsystemroleprivilege");
//    	    	hash.put("bx_system_privilege_t", "com.bxtel.bxsystemprivilege");
//    	    	hash.put("bx_system_user_t", "com.bxtel.bxsystemuser");
//    	    	hash.put("bx_supportedcard", "com.bxtel.bxsupportedcard");
//    	    	hash.put("bx_base_bank_t", "com.bxtel.bxbasebank");
//    	    	hash.put("bx_supportedcard_v", "com.bxtel.bxsupportedcard");
//    	    	hash.put("bx_bank_card_t", "com.bxtel.bxbankcard");
 //   	    	hash.put("bx_pay_detail_t", "com.bxtel.bxpaydetail");
//    	    	hash.put("bx_system_accesslog_t", "com.bxtel.bxsystemaccesslog");
//    	    	hash.put("bx_supportedcard", "com.bxtel.bxsupportedcard");
//    	    	hash.put("bx_log_login_t", "com.bxtel.bxloglogin");
//    	    	hash.put("bx_member_payrecord_t", "com.bxtel.bxmemberpayrecord");
//    	    	hash.put("bx_member_paytype_t", "com.bxtel.bxmemberpaytype");
//    	    	hash.put("bsm_prtnr_info_t", "com.bxtel.bsmprtnrinfo");
 //   	    	hash.put("cim_tpc_room_date_info_t", "com.bxtel.cimtpcroomdateinfo");
//    	    	hash.put("bx_home_hothotel_t", "com.bxtel.bxhomehothotel");
//    	    	hash.put("s_config", "com.bxtel.sconfig");
//    	    	hash.put("om_area_t", "com.bxtel.omarea");
//    	    	hash.put("cid_sms_notice_t", "com.bxtel.cidsmsnotice");
//    	    	hash.put("qrtz_job_details", "com.bxtel.qrtzjobdetails");
//    	    	hash.put("qrtz_triggers_v", "com.bxtel.qrtztriggersv");
//    	    	hash.put("cim_tpc_traffic_info_t", "com.bxtel.cimtpctrafficinfo");
//    	    	hash.put("bsm_prtnr_contact_info_t", "com.bxtel.bsmprtnrcontactinfo");
//    	    	hash.put("qrtz_cron_triggers", "com.bxtel.qrtzcrontriggers");
//    	    	hash.put("bx_order_jd_tc_sync_t", "com.bxtel.bxorderjdtcsync");
//    	    	hash.put("bx_pay_detail_addition_t", "com.bxtel.bxpaydetailaddition");
//    	    	hash.put("bx_relationShip_hotel_t", "com.bxtel.bxrelationshiphotel");
//    	    	hash.put("bx_relationShip_room_t", "com.bxtel.bxrelationshiproom");
//    	    	hash.put("bx_data_spsync", "com.bxtel.bxdataspsync");
//    	    	hash.put("bx_data_dx_gz_dg_t", "com.bxtel.bxdatadxgzdg");
//    	    	hash.put("bx_iphone_notice_t", "com.bxtel.bxiphonenotice");
//    	    	hash.put("bx_pay_back_t", "com.bxtel.bxpayback");
//    	    	hash.put("bx_jifenbao_t", "com.bxtel.bxjifenbao");
//    	    	hash.put("bx_order_hotel_t", "com.bxtel.bxorderhotel");
//    	    	hash.put("bx_order_hotel_sync_t", "com.bxtel.bxorderhotelsync");
//    	    	hash.put("bx_data_lt_gx_dg_t", "com.bxtel.bxdataltgxdg");
//    	    	hash.put("bx_data_dx_gx_dg_t", "com.bxtel.bxdatadxgxdg");
//    	    	hash.put("bx_base_passenger_t", "com.bxtel.bxbasepassenger");
//    	    	hash.put("bx_cashback_audit_t", "com.bxtel.bxcashbackaudit");
//    	    	hash.put("bx_cashback_record_t", "com.bxtel.bxcashbackrecord");
//    	    	hash.put("bx_user_invoice_t", "com.bxtel.bxuserinvoice");
//    	    	hash.put("bx_system_employee_t", "com.bxtel.bxsystememployee");
//    	    	hash.put("cdr", "com.bxtel.cdr");
//    	    	hash.put("bx_prepaid_count_t", "com.bxtel.prepaidcount");
//    	    	hash.put("qrtz_exc_log", "com.bxtel.qrtzexclog");
//    	    	hash.put("bx_supportedcard_t", "com.bxtel.bxsupportedcard");
    	    	
//    	    	hash.put("bx_base_copooperatortype", "com.bxtel.bxbasecopooperatortype");
    	    	//hash.put("BX_HTL_ROOM_INFO_T", "com.bxtel.bxhtlroominfo");
//    	    	
//    	    	hash.put("bx_bank_code_t", "com.bxtel.bxbankcode");
    	    	
    			//bx_order_t bxorder
    			//bx_order_hotel_t bxorderhotel
    			//cim_tpc_htl_info_t   cimtpchtlinfo  
    			//cim_tpc_htl_room_info_t   cimtpchtlroominfo
    			//cim_tpc_price_detail_info_t  cimtpcpricedetailinfo
    			//cim_tpc_price_plan_info_t  cimtpcpriceplaninfo
    			//bx_supportedcard  bxsupportedcard
    			//bx_base_usercreditcard_t bxbaseusercreditcard
    			//bx_base_certificatestype_t  bxbasecertificatestype
    			//bx_system_user_t  bxsystemuser
    			
    			
    			//bx_system_roleUser_t  bxsystemroleuser
    			//bx_system_rolePrivilege_t  bxsystemroleprivilege
    			//bx_system_privilege_t   bxsystemprivilege
    			//bx_system_employee_t bxsystememployee
    	    	
//    	    	hash.put("bx_user_invoice_t", "com.bxtel.bxuserinvoice");
    	    	Iterator<String> it = hash.keySet().iterator();
    	    	while(it.hasNext())
    	    	{
    	    		String  key = it.next();
    	    		gen_java(key, hash.get(key));
    	    	}
    }
    
    
    public  static void gen_java(String tablenamme,String packagename) {
		try {
			
	    	List<Table> tablelist=TableFactory.getInstance().getTables(tablenamme);  //
	    	//List<Table> tablelist=TableFactory.getInstance().getTableListBySql("select * from ( select hh.hothotelid,	        hh.cityid,	        hh.sourcetype,	        hh.companyid,	        hh.sourcehotelid,	        hh.hotelname,	        hh.lowprice,	        hh.hightprice,	        hh.imageurl,	        bc.avgscore	 from bx_home_hotHotel_t hh, bx_base_commenton_t bc	 where hh.companyid=bc.companyid )v","mytable");  //bx_base_passenger_t
			for(Table t:tablelist)
			{
				Map<String ,Object> root = new HashMap<String ,Object>();   
		    	root.put("table", t);
		    	String packageName=packagename;//  bxbasepassenger
		    	String packageNamePath=packageName.replaceAll("\\.","/");
		    	packageNamePath=packageNamePath+"/controller/"+t.getClassName().toLowerCase();
		    	root.put("packageName",packageName);//生成java类的包名
		    	root.put("packageNameForHttp",packageNamePath);
		    	root.put("setupdir",packageNamePath);//生成action的路径
		    	///D:/bxdev/trunck/tool/eclipse-java-mars-R-win32-x86_64/eclipse/workspace/search/target/classes/dinamica/generator/../../../demo/java
		        String baseDIR = FileHelper.getFilePath(MainForJavaByDatabase.class)+"../../../demo";
		        //    找扩展名为txt的文件   
		        String fileName = "*.ftl";
		        List resultList = new ArrayList();   
		        FileSearcher.findFiles(baseDIR, fileName, resultList);    
		        if (resultList.size() == 0) {   
		        	
		        } else {
		            for (int i = 0; i < resultList.size(); i++) {   
		                String dir=FileHelper.getFileDirPathByPath(resultList.get(i).toString());
		                String outputdir=FileHelper.getFileDirPathByPath(resultList.get(i).toString())+"/"+packageNamePath;
		                String templateFileName=FileHelper.getFileNameByPath((resultList.get(i).toString()));
		                String targetFileName=FileHelper.getFileNameNoSuffixByPath(resultList.get(i).toString());
		                System.out.println("templatedir:"+dir);
		                System.out.println("outputdir:"+outputdir);
		                System.out.println(templateFileName);
		                System.out.println(targetFileName);
		                MainForJavaByDatabase.output(dir,templateFileName,outputdir,targetFileName,"UTF-8", root);
		            }
		        }
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
    
    
    /**
     * 
     * @param templateName
     *            模板文件名称
     * @param templateEncoding
     *            模板文件的编码方式
     * @param root
     *            数据模型根对象
     */
    public static void analysisTemplate(String templateName,String templateEncoding, Map<?, ?> root) {
        try {
            /**
             * 创建Configuration对象
             */
            Configuration config = new Configuration();
            /**
             * 指定模板路径
             */
            File file = new File("templates");
            /**
             * 设置要解析的模板所在的目录，并加载模板文件
             */
            config.setDirectoryForTemplateLoading(file);
            /**
             * 设置包装器，并将对象包装为数据模型
             */
            config.setObjectWrapper(new DefaultObjectWrapper());

            /**
             * 获取模板,并设置编码方式，这个编码必须要与页面中的编码格式一致
             */
            Template template = config.getTemplate(templateName,
                    templateEncoding);
            /**
             * 合并数据模型与模板
             */
            Writer out = new OutputStreamWriter(System.out);
            template.process(root, out);
            out.flush();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (TemplateException e) {
            e.printStackTrace();
        }

     }
    
    
    
    /**
     * 
     * @param templateName
     *            模板文件名称
     * @param templateEncoding
     *            模板文件的编码方式
     * @param root
     *            数据模型根对象
     */
    public static void output(String templateDir,String templateName,String outputDir,String outputfile,String templateEncoding, Map<?, ?> root) {
        try {
            /**
             * 创建Configuration对象
             */
            Configuration config = new Configuration();
            /**
             * 指定模板路径
             */
            File file = new File(templateDir);
            /**
             * 设置要解析的模板所在的目录，并加载模板文件
             */
            config.setDirectoryForTemplateLoading(file);
            /**
             * 设置包装器，并将对象包装为数据模型
             */
            config.setObjectWrapper(new DefaultObjectWrapper());

            /**
             * 获取模板,并设置编码方式，这个编码必须要与页面中的编码格式一致
             */
            Template template = config.getTemplate(templateName,
                    templateEncoding);
            /**
             * 合并数据模型与模板
             */
            File outputDirfile = new File(outputDir);
            if(!outputDirfile.exists())
            {
            	boolean path=outputDirfile.mkdirs();
            	System.out.println("创建文件夹："+path+" "+outputDirfile.getAbsolutePath());
            }
            Writer out = new OutputStreamWriter(new FileOutputStream(outputDirfile.getAbsoluteFile()+File.separator+outputfile),templateEncoding);
            template.process(root, out);
            out.flush();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        } 
        catch (TemplateException e) {
            e.printStackTrace();
        }

     }
    
    
    
 }
 