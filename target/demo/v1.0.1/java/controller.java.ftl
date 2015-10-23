package ${packageName}.controller;
import ${packageName}.bo.*;
import ${packageName}.model.*;

import com.bxtel.exception.BusinessException;
import com.bxtel.exception.DAOException;
import dinamica.util.ListAndTotalCount;
import java.util.*;
import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


//${packageNameForHttp}/showadd.do
//${packageNameForHttp}/showdetail.do
//${packageNameForHttp}/showedit.do
//${packageNameForHttp}/showsearch.do
//${packageNameForHttp}/showpagelist.do
//${packageNameForHttp}/showlist.do
//${packageNameForHttp}/doadd.do
//${packageNameForHttp}/doupdate.do
//${packageNameForHttp}/dodelete.do


@Controller
public class ${table.className}Controller extends MultiActionController {
	    
    @Resource
	public ${table.className}BO  bo;
    
    private static final Log logger = LogFactory.getLog(${table.className}Controller.class);
    
    
    @RequestMapping
    public ModelAndView showadd(${table.className} model,HttpServletRequest request, 
            HttpServletResponse response)  throws Exception, BusinessException {
        ModelAndView mav = new ModelAndView();
		mav.addObject("model",model);
        return mav;
    }
    
    
    @RequestMapping
    public ModelAndView showdetail(${table.className} model,HttpServletRequest request, 
            HttpServletResponse response)  throws Exception, BusinessException {
        ModelAndView mav = null;
        ${table.className}  model_result=bo.get${table.className}ByCoud(model);
        if(model_result!=null)
    	{
    		 mav = new ModelAndView();
    		 mav.addObject("model",model);
    	}
    	else
		{
			 throw new BusinessException("");
		}
        return mav;
    }
    
    
    @RequestMapping
    public ModelAndView showedit(${table.className} model,HttpServletRequest request, 
            HttpServletResponse response)  throws Exception, BusinessException {
        ModelAndView mav = null;
        ${table.className}  model_result=bo.get${table.className}ByCoud(model);
        if(model_result!=null)
    	{
    		 mav = new ModelAndView();
    		 mav.addObject("model",model);
    	}
    	else
		{
			 throw new BusinessException("");
		}
        return mav;
    }
    
    
    @RequestMapping
    public ModelAndView showsearch(${table.className} model,HttpServletRequest request, 
            HttpServletResponse response)  throws Exception, BusinessException {
        ModelAndView mav = new ModelAndView();
		mav.addObject("model",model);
        return mav;
    }
   
    
    @RequestMapping
    public ModelAndView showlist(${table.className} model,int pageindex,int rows,HttpServletRequest request,HttpServletResponse response)  throws Exception, BusinessException {
    	ModelAndView mav=null;
		ListAndTotalCount<${table.className}>  modellist=bo.getPageList(model,pageindex,rows);
		if(Integer.parseInt(modellist.getTotal())>0)
    	{
    		mav = new ModelAndView();
   		 	mav.addObject("modellist",modellist);
    	}
		else
		{
			 throw new BusinessException("");
		}
        return mav;
    }
    
    @RequestMapping
    public ModelAndView listdata(${table.className} model,int pageindex,int rows,HttpServletRequest request,HttpServletResponse response)  throws Exception, BusinessException {
    	ModelAndView mav=null;
		ListAndTotalCount<${table.className}>  modellist=bo.getPageList(model,pageindex,rows);
		if(Integer.parseInt(modellist.getTotal())>0)
    	{
    		mav = new ModelAndView();
   		 	mav.addObject("modellist",modellist);
    	}
		else
		{
			 throw new BusinessException("");
		}
        return mav;
    }
    
    
    @RequestMapping
    public ModelAndView doadd(${table.className} model,HttpServletRequest request, HttpServletResponse response)  throws Exception, BusinessException {
    	ModelAndView mav=null;
    	if(bo.add(model)!=null)
    	{
    		 mav = new ModelAndView("showdetail");
    		 mav.addObject("model",model);
    	}
    	else
		{
			 throw new BusinessException("");
		}
        return mav;
    }
    
    @RequestMapping
    public ModelAndView dodelete(${table.className} model,HttpServletRequest request, HttpServletResponse response)  throws Exception, BusinessException {
       	ModelAndView mav=null;
       	if(bo.delete(model)>0)
    	{
    		 mav = new ModelAndView("forward:showsearch");
    		 mav.addObject("model",model);
    	}
    	else
		{
			 throw new BusinessException("");
		}
        return mav;
    }
    
    
    @RequestMapping
    public ModelAndView doupdate(${table.className} model,HttpServletRequest request, HttpServletResponse response) throws Exception, BusinessException{
	    ModelAndView mav=null;
    	if(bo.update(model)>0)
    	{
    		 mav = new ModelAndView("forward:showedit");
    		 mav.addObject("model",model);
    	}
    	else
		{
			 throw new BusinessException("");
		}
        return mav;
    }
    
}