package ${packageName}.bo;
import ${packageName}.model.*;
import ${packageName}.dao.*;
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


@Service("${table.className}BO")
public class ${table.className}BO 
{
	@Resource
	public ${table.className}DAO dao;
	
	private static final Log logger = LogFactory.getLog(${table.className}BO.class);
	
	public ${table.className} add(${table.className} model)  throws BusinessException, DAOException  {
			return dao.add(model);
	}
	public int delete(${table.className} model)   throws BusinessException, DAOException  {
			return dao.deleteByCoud(model);
	}
	
	public int update(${table.className} model)  throws BusinessException, DAOException  {
			int row=dao.updateCoudByRowId(model);
			if(row!=1)
			{
				new DAOException("update faild");
			}
			return 0;
	}
	
	public int updateByCoudAndWhere(${table.className} model,${table.className} wheremodel)  throws BusinessException, DAOException  {
			return dao.updateByCoudAndWhere(model,wheremodel);
	}
	
	
	public List<${table.className}> get${table.className}ListByCoud(${table.className} model)   throws BusinessException, DAOException  {
			return dao.get${table.className}ListByCoud(model);
	}
	
	
	public List<${table.className}> get${table.className}ListByExact(${table.className} model)  throws BusinessException, DAOException  {
			return dao.get${table.className}ListByExact(model);
	}
	
	
	
	
	public ${table.className} get${table.className}ByCoud(${table.className} model)  throws BusinessException, DAOException  {
			return dao.get${table.className}ByCoud(model);
	}
	
	public ${table.className} get${table.className}ByExact(${table.className} model)  throws BusinessException, DAOException  {
			return dao.get${table.className}ByExact(model);
	}
	
	
	
	
	public List<Map<String, Object>> getListMapByCoud(${table.className} model)  throws BusinessException, DAOException {
			return dao.getListMapByCoud(model);
	}
	
	
	public List<Map<String, Object>> getListMapByExact(${table.className} model)   throws BusinessException, DAOException {
			return dao.getListMapByExact(model);
	}
	
	public ListAndTotalCount<${table.className}> getPageList(${table.className} model, int pageIndex,int rows)  throws BusinessException, DAOException 
	{
			List<${table.className}> list = dao.getPageListByCound(model,pageIndex,rows);
			ListAndTotalCount<${table.className}> lst = new ListAndTotalCount<${table.className}>();
			if(list!=null&& list.size()>0)
			{
				lst.setTotal(list.get(0).getTotalCount());
				lst.setRows(list);
			}
			return lst;
	}
}