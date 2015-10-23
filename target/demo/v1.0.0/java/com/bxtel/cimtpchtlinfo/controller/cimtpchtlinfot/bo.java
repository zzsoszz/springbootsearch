package com.bxtel.cimtpchtlinfo.bo;
import com.bxtel.cimtpchtlinfo.model.*;
import com.bxtel.cimtpchtlinfo.dao.*;
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


@Service("CimTpcHtlInfoTBO")
public class CimTpcHtlInfoTBO 
{
	@Resource
	public CimTpcHtlInfoTDAO dao;
	
	private static final Log logger = LogFactory.getLog(CimTpcHtlInfoTBO.class);
	
	public CimTpcHtlInfoT add(CimTpcHtlInfoT model)  throws BusinessException, DAOException  {
			return dao.add(model);
	}
	public int delete(CimTpcHtlInfoT model)   throws BusinessException, DAOException  {
			return dao.deleteByCoud(model);
	}
	
	public int update(CimTpcHtlInfoT model)  throws BusinessException, DAOException  {
			int row=dao.updateCoudByRowId(model);
			if(row!=1)
			{
				new DAOException("update faild");
			}
			return 0;
	}
	
	public int updateByCoudAndWhere(CimTpcHtlInfoT model,CimTpcHtlInfoT wheremodel)  throws BusinessException, DAOException  {
			return dao.updateByCoudAndWhere(model,wheremodel);
	}
	
	
	public List<CimTpcHtlInfoT> getCimTpcHtlInfoTListByCoud(CimTpcHtlInfoT model)   throws BusinessException, DAOException  {
			return dao.getCimTpcHtlInfoTListByCoud(model);
	}
	
	
	public List<CimTpcHtlInfoT> getCimTpcHtlInfoTListByExact(CimTpcHtlInfoT model)  throws BusinessException, DAOException  {
			return dao.getCimTpcHtlInfoTListByExact(model);
	}
	
	
	
	
	public CimTpcHtlInfoT getCimTpcHtlInfoTByCoud(CimTpcHtlInfoT model)  throws BusinessException, DAOException  {
			return dao.getCimTpcHtlInfoTByCoud(model);
	}
	
	public CimTpcHtlInfoT getCimTpcHtlInfoTByExact(CimTpcHtlInfoT model)  throws BusinessException, DAOException  {
			return dao.getCimTpcHtlInfoTByExact(model);
	}
	
	
	
	
	public List<Map<String, Object>> getListMapByCoud(CimTpcHtlInfoT model)  throws BusinessException, DAOException {
			return dao.getListMapByCoud(model);
	}
	
	
	public List<Map<String, Object>> getListMapByExact(CimTpcHtlInfoT model)   throws BusinessException, DAOException {
			return dao.getListMapByExact(model);
	}
	
	public ListAndTotalCount<CimTpcHtlInfoT> getPageList(CimTpcHtlInfoT model, int pageIndex,int rows)  throws BusinessException, DAOException 
	{
			List<CimTpcHtlInfoT> list = dao.getPageListByCound(model,pageIndex,rows);
			ListAndTotalCount<CimTpcHtlInfoT> lst = new ListAndTotalCount<CimTpcHtlInfoT>();
			if(list!=null&& list.size()>0)
			{
				lst.setTotal(list.get(0).getTotalCount());
				lst.setRows(list);
			}
			return lst;
	}
}