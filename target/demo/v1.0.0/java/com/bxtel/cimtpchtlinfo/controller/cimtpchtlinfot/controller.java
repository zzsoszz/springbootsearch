package com.bxtel.cimtpchtlinfo.controller;
import com.bxtel.cimtpchtlinfo.bo.*;
import com.bxtel.cimtpchtlinfo.model.*;

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


//com/bxtel/cimtpchtlinfo/controller/cimtpchtlinfot/showadd.do
//com/bxtel/cimtpchtlinfo/controller/cimtpchtlinfot/showdetail.do
//com/bxtel/cimtpchtlinfo/controller/cimtpchtlinfot/showedit.do
//com/bxtel/cimtpchtlinfo/controller/cimtpchtlinfot/showsearch.do
//com/bxtel/cimtpchtlinfo/controller/cimtpchtlinfot/showpagelist.do
//com/bxtel/cimtpchtlinfo/controller/cimtpchtlinfot/showlist.do
//com/bxtel/cimtpchtlinfo/controller/cimtpchtlinfot/doadd.do
//com/bxtel/cimtpchtlinfo/controller/cimtpchtlinfot/doupdate.do
//com/bxtel/cimtpchtlinfo/controller/cimtpchtlinfot/dodelete.do


@Controller
public class CimTpcHtlInfoTController extends MultiActionController {
	    
    @Resource
	public CimTpcHtlInfoTBO  bo;
    
    private static final Log logger = LogFactory.getLog(CimTpcHtlInfoTController.class);
    
    
    @RequestMapping
    public ModelAndView showadd(CimTpcHtlInfoT model,HttpServletRequest request, 
            HttpServletResponse response)  throws Exception, BusinessException {
        ModelAndView mav = new ModelAndView();
		mav.addObject("model",model);
        return mav;
    }
    
    
    @RequestMapping
    public ModelAndView showdetail(CimTpcHtlInfoT model,HttpServletRequest request, 
            HttpServletResponse response)  throws Exception, BusinessException {
        ModelAndView mav = null;
        CimTpcHtlInfoT  model_result=bo.getCimTpcHtlInfoTByCoud(model);
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
    public ModelAndView showedit(CimTpcHtlInfoT model,HttpServletRequest request, 
            HttpServletResponse response)  throws Exception, BusinessException {
        ModelAndView mav = null;
        CimTpcHtlInfoT  model_result=bo.getCimTpcHtlInfoTByCoud(model);
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
    public ModelAndView showsearch(CimTpcHtlInfoT model,HttpServletRequest request, 
            HttpServletResponse response)  throws Exception, BusinessException {
        ModelAndView mav = new ModelAndView();
		mav.addObject("model",model);
        return mav;
    }
   
    
    @RequestMapping
    public ModelAndView showlist(CimTpcHtlInfoT model,int pageindex,int rows,HttpServletRequest request,HttpServletResponse response)  throws Exception, BusinessException {
    	ModelAndView mav=null;
		ListAndTotalCount<CimTpcHtlInfoT>  modellist=bo.getPageList(model,pageindex,rows);
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
    public ModelAndView listdata(CimTpcHtlInfoT model,int pageindex,int rows,HttpServletRequest request,HttpServletResponse response)  throws Exception, BusinessException {
    	ModelAndView mav=null;
		ListAndTotalCount<CimTpcHtlInfoT>  modellist=bo.getPageList(model,pageindex,rows);
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
    public ModelAndView doadd(CimTpcHtlInfoT model,HttpServletRequest request, HttpServletResponse response)  throws Exception, BusinessException {
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
    public ModelAndView dodelete(CimTpcHtlInfoT model,HttpServletRequest request, HttpServletResponse response)  throws Exception, BusinessException {
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
    public ModelAndView doupdate(CimTpcHtlInfoT model,HttpServletRequest request, HttpServletResponse response) throws Exception, BusinessException{
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