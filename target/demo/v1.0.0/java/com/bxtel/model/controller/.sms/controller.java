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


//com/bxtel/model/controller/.sms/showadd.do
//com/bxtel/model/controller/.sms/showdetail.do
//com/bxtel/model/controller/.sms/showedit.do
//com/bxtel/model/controller/.sms/showsearch.do
//com/bxtel/model/controller/.sms/showpagelist.do
//com/bxtel/model/controller/.sms/showlist.do
//com/bxtel/model/controller/.sms/doadd.do
//com/bxtel/model/controller/.sms/doupdate.do
//com/bxtel/model/controller/.sms/dodelete.do


@Controller
public class .SmsController extends MultiActionController {
	    
    @Resource
	public .SmsBO  bo;
    
    private static final Log logger = LogFactory.getLog(.SmsController.class);
    
    
    @RequestMapping
    public ModelAndView showadd(.Sms model,HttpServletRequest request, 
            HttpServletResponse response)  throws Exception, BusinessException {
        ModelAndView mav = new ModelAndView();
		mav.addObject("model",model);
        return mav;
    }
    
    
    @RequestMapping
    public ModelAndView showdetail(.Sms model,HttpServletRequest request, 
            HttpServletResponse response)  throws Exception, BusinessException {
        ModelAndView mav = null;
        .Sms  model_result=bo.get.SmsByCoud(model);
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
    public ModelAndView showedit(.Sms model,HttpServletRequest request, 
            HttpServletResponse response)  throws Exception, BusinessException {
        ModelAndView mav = null;
        .Sms  model_result=bo.get.SmsByCoud(model);
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
    public ModelAndView showsearch(.Sms model,HttpServletRequest request, 
            HttpServletResponse response)  throws Exception, BusinessException {
        ModelAndView mav = new ModelAndView();
		mav.addObject("model",model);
        return mav;
    }
   
    
    @RequestMapping
    public ModelAndView showlist(.Sms model,int pageindex,int rows,HttpServletRequest request,HttpServletResponse response)  throws Exception, BusinessException {
    	ModelAndView mav=null;
		ListAndTotalCount<.Sms>  modellist=bo.getPageList(model,pageindex,rows);
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
    public ModelAndView listdata(.Sms model,int pageindex,int rows,HttpServletRequest request,HttpServletResponse response)  throws Exception, BusinessException {
    	ModelAndView mav=null;
		ListAndTotalCount<.Sms>  modellist=bo.getPageList(model,pageindex,rows);
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
    public ModelAndView doadd(.Sms model,HttpServletRequest request, HttpServletResponse response)  throws Exception, BusinessException {
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
    public ModelAndView dodelete(.Sms model,HttpServletRequest request, HttpServletResponse response)  throws Exception, BusinessException {
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
    public ModelAndView doupdate(.Sms model,HttpServletRequest request, HttpServletResponse response) throws Exception, BusinessException{
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