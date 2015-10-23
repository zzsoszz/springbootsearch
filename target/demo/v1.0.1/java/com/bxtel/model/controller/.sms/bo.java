package com.bxtel.model.bo;
import com.bxtel.model.model.*;
import com.bxtel.model.dao.*;
import com.bxtel.exception.BusinessException;
import com.bxtel.exception.DAOException;
import java.util.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import dinamica.*;
import dinamica.util.*;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import javax.annotation.Resource;


@Service(".SmsBO")
public class .SmsBO 
{
	@Resource
	public .SmsDAO dao;
	
	private static final Log logger = LogFactory.getLog(.SmsBO.class);
	
	public .Sms add(.Sms model)  throws BusinessException, DAOException  {
			return dao.add(model);
	}
	public int delete(.Sms model)   throws BusinessException, DAOException  {
			return dao.deleteByCoud(model);
	}
	
	public int update(.Sms model)  throws BusinessException, DAOException  {
			int row=dao.updateCoudByRowId(model);
			if(row!=1)
			{
				new DAOException("update faild");
			}
			return 0;
	}
	
	public int updateByCoudAndWhere(.Sms model,.Sms wheremodel)  throws BusinessException, DAOException  {
			return dao.updateByCoudAndWhere(model,wheremodel);
	}
	
	
	public List<.Sms> get.SmsListByCoud(.Sms model)   throws BusinessException, DAOException  {
			return dao.get.SmsListByCoud(model);
	}
	
	
	public List<.Sms> get.SmsListByExact(.Sms model)  throws BusinessException, DAOException  {
			return dao.get.SmsListByExact(model);
	}
	
	
	
	
	public .Sms get.SmsByCoud(.Sms model)  throws BusinessException, DAOException  {
			return dao.get.SmsByCoud(model);
	}
	
	public .Sms get.SmsByExact(.Sms model)  throws BusinessException, DAOException  {
			return dao.get.SmsByExact(model);
	}
	
	
	
	
	public List<Map<String, Object>> getListMapByCoud(.Sms model)  throws BusinessException, DAOException {
			return dao.getListMapByCoud(model);
	}
	
	
	public List<Map<String, Object>> getListMapByExact(.Sms model)   throws BusinessException, DAOException {
			return dao.getListMapByExact(model);
	}
	
	public ListAndTotalCount<.Sms> getPageList(.Sms model, int pageIndex,int rows)  throws BusinessException, DAOException 
	{
			List<.Sms> list = dao.getPageListByCound(model,pageIndex,rows);
			ListAndTotalCount<.Sms> lst = new ListAndTotalCount<.Sms>();
			if(list!=null&& list.size()>0)
			{
				lst.setTotal(list.get(0).getTotalCount());
				lst.setRows(list);
			}
			return lst;
	}
}