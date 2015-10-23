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

import org.apache.commons.io.FileUtils;

import dinamica.util.FileHelper;
import freemarker.template.Configuration;
import freemarker.template.DefaultObjectWrapper;
import freemarker.template.Template;
import freemarker.template.TemplateException;

/**
 * 
 * http://localhost:9001/portal/action/com/bxtel/cdr/page/search
 * 
 * 
 * freemarker 模板工具
 * @author xyg
 * @time 2010-2-6下午04:07:27
 * @version 1.0
 */
public class MainForActionByDatabase {
	
    public static void main(String args[]){
    	gen_action_list();
    }
    
    
    public  static void gen_action_list(){
    	    	HashMap<String, String> hash=new HashMap<String, String>();
    	    	hash.put("cdr", "com.bxtel.cdr");
    	    	Iterator<String> it = hash.keySet().iterator();
    	    	while(it.hasNext())
    	    	{
    	    		String  key = it.next();
    	    		gen_action(key, hash.get(key));
    	    	}
    }
    
    
    private static void gen_action(String tablename, String packagename) {
		try {
	    	List<Table> tablelist=TableFactory.getInstance().getTableList(tablename);  //
			for(Table t:tablelist)
			{
				Map<String ,Object> root = new HashMap<String ,Object>();   
		    	root.put("table", t);
		    	String packageName=packagename;//
		    	String packageNamePath=packageName.replaceAll("\\.","/");
		    	root.put("packageName",packageName);//生成java类的包名
		    	root.put("packageNameForHttp",packageNamePath);
		    	root.put("setupdir","action/"+packageNamePath);//生成action的路径
		    	
		    	String templateDIR = FileHelper.getFilePath(MainForActionByDatabase.class)+"../../../action/demo/basic/action/template";
		    	
		        String baseDIR = FileHelper.getFilePath(MainForActionByDatabase.class)+"../../../action/demo/basic/action/"+packageNamePath;
		        
		        File baseDirFile=new File(baseDIR);
		        if(baseDirFile.exists())
		        {
		        	baseDirFile.delete();
		        	baseDirFile.mkdirs();
		        }
		        
		        FileUtils.copyDirectory(new File(templateDIR),baseDirFile);
		        
		        
		        //找扩展名为txt的文件   
		        String fileName = "*.ftl";
		        List resultList = new ArrayList();   
		        FileSearcher.findFiles(baseDIR, fileName, resultList);    
		        if (resultList.size() == 0) {   
		            //System.out.println("No File Fount.");
		        } else {
		            for (int i = 0; i < resultList.size(); i++) {   
		                //System.out.println(resultList.get(i));
		                String dir=FileHelper.getFileDirPathByPath(resultList.get(i).toString());
		                String outputdir=baseDIR+"/"+packageNamePath;
		                String templateFileName=FileHelper.getFileNameByPath((resultList.get(i).toString()));
		                String targetFileName=FileHelper.getFileNameNoSuffixByPath(resultList.get(i).toString());
		                //System.out.println("dir:"+dir);
		                //System.out.println(templateFileName);
		                //System.out.println(targetFileName);
		                MainForActionByDatabase.output(dir,templateFileName,dir,targetFileName,"UTF-8", root);
		            }
		        }
		        
		        
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
    
    private static void gen_orderpay2() {
		try {
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
	    	List<Table> tablelist=TableFactory.getInstance().getTableList("bx_system_roleUser_t");  //bx_base_passenger_t
			for(Table t:tablelist)
			{
				Map<String ,Object> root = new HashMap<String ,Object>();   
		    	root.put("table", t);
		    	String packageName="com.bxtel.bxsystemroleuser";//  bxbasepassenger
		    	root.put("packageName",packageName);//生成java类的包名
		    	root.put("packageNameForHttp",packageName.replaceAll("\\.","/"));
		    	root.put("setupdir","action/bxtel/bxsystemroleuser");//生成action的路径
		        String baseDIR = FileHelper.getFilePath(MainForActionByDatabase.class)+"../../../action/demo/basic/java";
		        //    找扩展名为txt的文件   
		        String fileName = "*.ftl";
		        List resultList = new ArrayList();   
		        FileSearcher.findFiles(baseDIR, fileName, resultList);    
		        if (resultList.size() == 0) {   
		            //System.out.println("No File Fount.");   
		        } else {
		            for (int i = 0; i < resultList.size(); i++) {   
		                //System.out.println(resultList.get(i));
		                String dir=FileHelper.getFileDirPathByPath(resultList.get(i).toString());
		                String templateFileName=FileHelper.getFileNameByPath((resultList.get(i).toString()));
		                String targetFileName=FileHelper.getFileNameNoSuffixByPath(resultList.get(i).toString());
		                //System.out.println(templateFileName);
		                //System.out.println(targetFileName);
		                MainForActionByDatabase.output(dir,templateFileName,dir,targetFileName,"UTF-8", root);
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
 