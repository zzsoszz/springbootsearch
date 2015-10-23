package com.bxtel.model.controller;
import com.bxtel.model.bo.*;
import com.bxtel.model.model.*;

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


//com/bxtel/model/controller/com.bxtel.model.user/showadd.do
//com/bxtel/model/controller/com.bxtel.model.user/showdetail.do
//com/bxtel/model/controller/com.bxtel.model.user/showedit.do
//com/bxtel/model/controller/com.bxtel.model.user/showsearch.do
//com/bxtel/model/controller/com.bxtel.model.user/showpagelist.do
//com/bxtel/model/controller/com.bxtel.model.user/showlist.do
//com/bxtel/model/controller/com.bxtel.model.user/doadd.do
//com/bxtel/model/controller/com.bxtel.model.user/doupdate.do
//com/bxtel/model/controller/com.bxtel.model.user/dodelete.do


@Controller
public class com.bxtel.model.UserController extends MultiActionController {
	    
    @Resource
	public com.bxtel.model.UserBO  bo;
    
    private static final Log logger = LogFactory.getLog(com.bxtel.model.UserController.class);
    
    
    @RequestMapping
    public ModelAndView showadd(com.bxtel.model.User model,HttpServletRequest request, 
            HttpServletResponse response)  throws Exception, BusinessException {
        ModelAndView mav = new ModelAndView();
		mav.addObject("model",model);
        return mav;
    }
    
    
    @RequestMapping
    public ModelAndView showdetail(com.bxtel.model.User model,HttpServletRequest request, 
            HttpServletResponse response)  throws Exception, BusinessException {
        ModelAndView mav = null;
        com.bxtel.model.User  model_result=bo.getcom.bxtel.model.UserByCoud(model);
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
    public ModelAndView showedit(com.bxtel.model.User model,HttpServletRequest request, 
            HttpServletResponse response)  throws Exception, BusinessException {
        ModelAndView mav = null;
        com.bxtel.model.User  model_result=bo.getcom.bxtel.model.UserByCoud(model);
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
    public ModelAndView showsearch(com.bxtel.model.User model,HttpServletRequest request, 
            HttpServletResponse response)  throws Exception, BusinessException {
        ModelAndView mav = new ModelAndView();
		mav.addObject("model",model);
        return mav;
    }
   
    
    @RequestMapping
    public ModelAndView showlist(com.bxtel.model.User model,int pageindex,int rows,HttpServletRequest request,HttpServletResponse response)  throws Exception, BusinessException {
    	ModelAndView mav=null;
		ListAndTotalCount<com.bxtel.model.User>  modellist=bo.getPageList(model,pageindex,rows);
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
    public ModelAndView listdata(com.bxtel.model.User model,int pageindex,int rows,HttpServletRequest request,HttpServletResponse response)  throws Exception, BusinessException {
    	ModelAndView mav=null;
		ListAndTotalCount<com.bxtel.model.User>  modellist=bo.getPageList(model,pageindex,rows);
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
    public ModelAndView doadd(com.bxtel.model.User model,HttpServletRequest request, HttpServletResponse response)  throws Exception, BusinessException {
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
    public ModelAndView dodelete(com.bxtel.model.User model,HttpServletRequest request, HttpServletResponse response)  throws Exception, BusinessException {
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
    public ModelAndView doupdate(com.bxtel.model.User model,HttpServletRequest request, HttpServletResponse response) throws Exception, BusinessException{
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