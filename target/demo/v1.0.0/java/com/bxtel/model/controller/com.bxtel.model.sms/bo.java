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


@Service("com.bxtel.model.SmsBO")
public class com.bxtel.model.SmsBO 
{
	@Resource
	public com.bxtel.model.SmsDAO dao;
	
	private static final Log logger = LogFactory.getLog(com.bxtel.model.SmsBO.class);
	
	public com.bxtel.model.Sms add(com.bxtel.model.Sms model)  throws BusinessException, DAOException  {
			return dao.add(model);
	}
	public int delete(com.bxtel.model.Sms model)   throws BusinessException, DAOException  {
			return dao.deleteByCoud(model);
	}
	
	public int update(com.bxtel.model.Sms model)  throws BusinessException, DAOException  {
			int row=dao.updateCoudByRowId(model);
			if(row!=1)
			{
				new DAOException("update faild");
			}
			return 0;
	}
	
	public int updateByCoudAndWhere(com.bxtel.model.Sms model,com.bxtel.model.Sms wheremodel)  throws BusinessException, DAOException  {
			return dao.updateByCoudAndWhere(model,wheremodel);
	}
	
	
	public List<com.bxtel.model.Sms> getcom.bxtel.model.SmsListByCoud(com.bxtel.model.Sms model)   throws BusinessException, DAOException  {
			return dao.getcom.bxtel.model.SmsListByCoud(model);
	}
	
	
	public List<com.bxtel.model.Sms> getcom.bxtel.model.SmsListByExact(com.bxtel.model.Sms model)  throws BusinessException, DAOException  {
			return dao.getcom.bxtel.model.SmsListByExact(model);
	}
	
	
	
	
	public com.bxtel.model.Sms getcom.bxtel.model.SmsByCoud(com.bxtel.model.Sms model)  throws BusinessException, DAOException  {
			return dao.getcom.bxtel.model.SmsByCoud(model);
	}
	
	public com.bxtel.model.Sms getcom.bxtel.model.SmsByExact(com.bxtel.model.Sms model)  throws BusinessException, DAOException  {
			return dao.getcom.bxtel.model.SmsByExact(model);
	}
	
	
	
	
	public List<Map<String, Object>> getListMapByCoud(com.bxtel.model.Sms model)  throws BusinessException, DAOException {
			return dao.getListMapByCoud(model);
	}
	
	
	public List<Map<String, Object>> getListMapByExact(com.bxtel.model.Sms model)   throws BusinessException, DAOException {
			return dao.getListMapByExact(model);
	}
	
	public ListAndTotalCount<com.bxtel.model.Sms> getPageList(com.bxtel.model.Sms model, int pageIndex,int rows)  throws BusinessException, DAOException 
	{
			List<com.bxtel.model.Sms> list = dao.getPageListByCound(model,pageIndex,rows);
			ListAndTotalCount<com.bxtel.model.Sms> lst = new ListAndTotalCount<com.bxtel.model.Sms>();
			if(list!=null&& list.size()>0)
			{
				lst.setTotal(list.get(0).getTotalCount());
				lst.setRows(list);
			}
			return lst;
	}
}