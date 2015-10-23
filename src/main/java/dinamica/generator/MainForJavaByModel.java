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

import dinamica.classloader.ClassScan;
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
public class MainForJavaByModel {
	
    public static void main(String args[]){
    	gen_java_list();
    }
    
    public  static void gen_java_list(){
    	gen_java("com.bxtel.model");
    }
    
    public  static void gen_java(String packagename) {
		try {
			
	    	List<Table> tablelist=TableFactory.getInstance().getTablesByModel(packagename);  //
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
		        String baseDIR = FileHelper.getFilePath(MainForJavaByModel.class)+"../../../demo/v1.0.1";
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
		                MainForJavaByModel.output(dir,templateFileName,outputdir,targetFileName,"UTF-8", root);
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
 