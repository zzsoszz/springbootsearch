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


@Service("com.bxtel.model.UserBO")
public class com.bxtel.model.UserBO 
{
	@Resource
	public com.bxtel.model.UserDAO dao;
	
	private static final Log logger = LogFactory.getLog(com.bxtel.model.UserBO.class);
	
	public com.bxtel.model.User add(com.bxtel.model.User model)  throws BusinessException, DAOException  {
			return dao.add(model);
	}
	public int delete(com.bxtel.model.User model)   throws BusinessException, DAOException  {
			return dao.deleteByCoud(model);
	}
	
	public int update(com.bxtel.model.User model)  throws BusinessException, DAOException  {
			int row=dao.updateCoudByRowId(model);
			if(row!=1)
			{
				new DAOException("update faild");
			}
			return 0;
	}
	
	public int updateByCoudAndWhere(com.bxtel.model.User model,com.bxtel.model.User wheremodel)  throws BusinessException, DAOException  {
			return dao.updateByCoudAndWhere(model,wheremodel);
	}
	
	
	public List<com.bxtel.model.User> getcom.bxtel.model.UserListByCoud(com.bxtel.model.User model)   throws BusinessException, DAOException  {
			return dao.getcom.bxtel.model.UserListByCoud(model);
	}
	
	
	public List<com.bxtel.model.User> getcom.bxtel.model.UserListByExact(com.bxtel.model.User model)  throws BusinessException, DAOException  {
			return dao.getcom.bxtel.model.UserListByExact(model);
	}
	
	
	
	
	public com.bxtel.model.User getcom.bxtel.model.UserByCoud(com.bxtel.model.User model)  throws BusinessException, DAOException  {
			return dao.getcom.bxtel.model.UserByCoud(model);
	}
	
	public com.bxtel.model.User getcom.bxtel.model.UserByExact(com.bxtel.model.User model)  throws BusinessException, DAOException  {
			return dao.getcom.bxtel.model.UserByExact(model);
	}
	
	
	
	
	public List<Map<String, Object>> getListMapByCoud(com.bxtel.model.User model)  throws BusinessException, DAOException {
			return dao.getListMapByCoud(model);
	}
	
	
	public List<Map<String, Object>> getListMapByExact(com.bxtel.model.User model)   throws BusinessException, DAOException {
			return dao.getListMapByExact(model);
	}
	
	public ListAndTotalCount<com.bxtel.model.User> getPageList(com.bxtel.model.User model, int pageIndex,int rows)  throws BusinessException, DAOException 
	{
			List<com.bxtel.model.User> list = dao.getPageListByCound(model,pageIndex,rows);
			ListAndTotalCount<com.bxtel.model.User> lst = new ListAndTotalCount<com.bxtel.model.User>();
			if(list!=null&& list.size()>0)
			{
				lst.setTotal(list.get(0).getTotalCount());
				lst.setRows(list);
			}
			return lst;
	}
}