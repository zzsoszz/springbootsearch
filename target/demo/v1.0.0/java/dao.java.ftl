package ${packageName}.dao;


import ${packageName}.*;
import ${packageName}.model.*;
import dinamica.*;
import dinamica.util.*;
import dinamica.util.StringUtil;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.sql.DataSource;
import javax.annotation.Resource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import org.springframework.jdbc.core.*;
import org.springframework.stereotype.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.datasource.DataSourceUtils;
import org.springframework.jdbc.support.JdbcUtils;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import com.googlecode.ehcache.annotations.*;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import oracle.sql.ROWID;
import com.bxtel.exception.DAOException;

@Repository("${table.className}DAO")
public class ${table.className}DAO
{

	@Resource
	public JdbcTemplate jdbcTemplate;

	@Resource
	public NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	private static final Log logger = LogFactory.getLog(${table.className}DAO.class);
	
	//@TriggersRemove(cacheName = "${table.className}DAO", when = When.AFTER_METHOD_INVOCATION, removeAll = true)
	public ${table.className} add(${table.className} model) throws DAOException  {
		String rowid=addThenReturnRowid(model);
		return  get${table.className}ByRowId(rowid);
	}
	
	
	public String addThenReturnRowid(${table.className} model) throws DAOException  {
		model.setCurversion(0L);
		<#list table.columns as column>
			<#if column.isPk=="true">
		model.set${column.fieldName?cap_first}(getSeq());
			</#if>
		</#list>
		
		StringBuffer sql = new StringBuffer("insert into ${table.sqlName}("
		<#list table.columns as column>
			<#if column_index ==0>
				+" ${column.columnName} "
			<#else>
				+",${column.columnName} "
			</#if>
		</#list>
		
		+") values("
		
		<#list table.columns as column>
			<#if  column_index ==0>
					+":${column.fieldName}"
			<#else>
					+",:${column.fieldName}"
			</#if>
		</#list>
		  + ")" );
		  
		KeyHolder keyHolder = new GeneratedKeyHolder();
		SqlParameterSource sps=new BeanPropertySqlParameterSource(model);
		namedParameterJdbcTemplate.update(sql.toString(), sps,keyHolder);
		oracle.sql.ROWID id=(ROWID) keyHolder.getKeys().get("ROWID");
		return id.stringValue();
	}
	
	
	public ${table.className} get${table.className}ByRowId(String rowid) throws DAOException {
		StringBuffer sql=new StringBuffer("select t.*,rowid as crowid from ${table.sqlName} t where rowid='"+rowid+"'");
		List<${table.className}> modellist = jdbcTemplate.query(sql.toString(),new BeanPropertyRowMapper(${table.className}.class));
		if(modellist!=null && modellist.size()==1)
		{
			return  modellist.get(0);
		}else{
			throw new DAOException("rowid is wrong:"+rowid);
		}
	}
	
	
	//@TriggersRemove(cacheName = "${table.className}DAO", when = When.AFTER_METHOD_INVOCATION, removeAll = true)
	public int deleteByCoud(${table.className} model) {
		
		StringBuffer sql=new StringBuffer("delete from ${table.sqlName} where 1=1 ");
		<#list table.columns as column>
		if(model.get${column.fieldName?cap_first}()!=null)
		{
			sql.append(" and ${column.columnName}=:${column.fieldName} ");
		}
		</#list>
		
		SqlParameterSource sps=new BeanPropertySqlParameterSource(model);
		return namedParameterJdbcTemplate.update(sql.toString(), sps);
	}
	
	//@TriggersRemove(cacheName = "${table.className}DAO", when = When.AFTER_METHOD_INVOCATION, removeAll = true)
	public int deleteByExact(${table.className} model) throws DAOException  {
		
		StringBuffer sql=new StringBuffer("delete from ${table.sqlName} where 1=1 ");
		<#list table.columns as column>
		sql.append(" and ${column.columnName}=:${column.fieldName} ");
		</#list>
		
		SqlParameterSource sps=new BeanPropertySqlParameterSource(model);
		return namedParameterJdbcTemplate.update(sql.toString(), sps);
	}
	
	//@TriggersRemove(cacheName = "${table.className}DAO", when = When.AFTER_METHOD_INVOCATION, removeAll = true)
	public int deleteByRowId(String rowid)  throws DAOException  {
		if(StringUtil.isEmptyOrWhitespace(rowid))
		{
			throw new DAOException("rowid is null");
		}
		StringBuffer sql=new StringBuffer("delete from ${table.sqlName} where rowid='"+rowid+"'");
		return jdbcTemplate.update(sql.toString());
	}
	
	//@TriggersRemove(cacheName = "${table.className}DAO", when = When.AFTER_METHOD_INVOCATION, removeAll = true)
	public int updateExactByRowId(${table.className} model)  throws DAOException  {
		if(StringUtil.isEmptyOrWhitespace(model.getCrowid()))
		{
			throw new DAOException("rowid is null");
		}
		StringBuffer sql=new StringBuffer("update  ${table.sqlName} set ");
		<#list table.columns as column>
			<#if column.isPk=="false">
				<#if  column_index == (table.columns?size-1) >
					<#if column.columnName=="curversion">
						sql.append("${column.columnName}=${column.columnName} +1");
					<#else>
						sql.append("${column.columnName}=:${column.fieldName}");
					</#if>
				<#else>
					<#if column.columnName=="curversion">
						sql.append("${column.columnName}=${column.columnName} +1,");
					<#else>
						sql.append("${column.columnName}=:${column.fieldName},");
					</#if>
				</#if>
			</#if>
		</#list>
		sql=new StringBuffer(StringUtil.removeLastWith(sql.toString(),","));
		sql.append(" where rowid='"+model.getCrowid()+"'  and curversion=:curversion ");
		SqlParameterSource sps=new BeanPropertySqlParameterSource(model);
		return namedParameterJdbcTemplate.update(sql.toString(), sps);
	}
	
	//@TriggersRemove(cacheName = "${table.className}DAO", when = When.AFTER_METHOD_INVOCATION, removeAll = true)
	public int updateCoudByRowId(${table.className} model)  throws DAOException  {
		if(StringUtil.isEmptyOrWhitespace(model.getCrowid()))
		{
			throw new DAOException("rowid is null");
		}
		StringBuffer sql=new StringBuffer("update  ${table.sqlName} set ");
		<#list table.columns as column>
			<#if column.isPk=="false">
					if(model.get${column.fieldName?cap_first}()!=null)
					{
						<#if column.columnName=="curversion">
						sql.append("${column.columnName}=${column.columnName} +1 ,");
						<#else>
						sql.append("${column.columnName}=:${column.fieldName} ,");
						</#if>
					}
			</#if>
		</#list>
		sql=new StringBuffer(StringUtil.removeLastWith(sql.toString(),","));
		sql.append(" where rowid='"+model.getCrowid()+"'   and curversion=:curversion ");
		SqlParameterSource sps=new BeanPropertySqlParameterSource(model);
		return namedParameterJdbcTemplate.update(sql.toString(), sps);
	}
	
	
	//@TriggersRemove(cacheName = "${table.className}DAO", when = When.AFTER_METHOD_INVOCATION, removeAll = true)
	public int updateByCoudAndWhere(${table.className} model,${table.className} wheremodel)  throws DAOException  {
		
		boolean haspk=false;
		<#list table.columns as column>
				<#if column.isPk=="true">
					haspk=true;
				</#if>
		</#list>
		
		if(haspk=false)
		{
			throw new DAOException("no primary key ");
		}
		
		StringBuffer sql=new StringBuffer("update  ${table.sqlName} set ");
		<#list table.columns as column>
			<#if column.isPk=="false">
					if(model.get${column.fieldName?cap_first}()!=null)
					{
						sql.append("${column.columnName}=:${column.fieldName} ,");
					}
			</#if>
		</#list>
		
		
		sql=new StringBuffer(StringUtil.removeLastWith(sql.toString(),","));
		
		
		StringBuffer where=new StringBuffer("");
		<#list table.columns as column>
					if(wheremodel.get${column.fieldName?cap_first}()!=null)
					{
						where.append("and ${column.columnName}=:${column.fieldName} ,");
					}
		</#list>
		if(where.equals(""))
		{
			throw new DAOException(" must have where condition"); 
		}
		sql=new StringBuffer(StringUtil.removeLastWith(sql.toString(),","));
		sql.append(" where 1=1  "+where.toString());
		SqlParameterSource sps=new BeanPropertySqlParameterSource(model);
		return namedParameterJdbcTemplate.update(sql.toString(), sps);
	}
	
	/*
	//@TriggersRemove(cacheName = "${table.className}DAO", when = When.AFTER_METHOD_INVOCATION, removeAll = true)
	public void batchInsert(List<${table.className}> list)  throws DAOException{
		
		StringBuffer sql = new StringBuffer("insert into ${table.sqlName}("
		<#list table.columns as column>
			<#if column_index ==0>
				+" ${column.columnName} "
			<#else>
				+",${column.columnName} "
			</#if>
		</#list>
		
		+") values("
		
		<#list table.columns as column>
			<#if column.isPk=="false">
				<#if  column_index ==0>
				+"?"
				<#else>
				+",?"
				</#if>
			<#else>
				<#if  column_index ==0>
				+"${table.sqlName}_s.nextval"
				<#else>
				+",${table.sqlName}_s.nextval"
				</#if>
			</#if>
		</#list>
		  + ")" );
		
		
		PreparedStatement ps=null;
		Connection conn = null;
		try{
		
			  conn = DataSourceUtils.getConnection(jdbcTemplate.getDataSource());
			  ps= conn.prepareStatement(sql.toString()); 
			  for (int i = 0; i < list.size(); i++) {
					
					<#list table.columns as column>
					ps.set${column.typeName}(${column_index+1}, list.get(i).get${column.fieldName?cap_first}());
					</#list>
					
					ps.addBatch();
					ps.clearParameters();
					if(i%500==0 || i==list.size()-1)
					{
						ps.executeBatch(); 
					}
			  }
			  ps.close();
		}catch (Exception ex) {
			 ex.printStackTrace(); 
		}finally{
			JdbcUtils.closeStatement(ps);  
			DataSourceUtils.releaseConnection(conn, jdbcTemplate.getDataSource());  
		}
		
	}
	
	//@TriggersRemove(cacheName = "${table.className}DAO", when = When.AFTER_METHOD_INVOCATION, removeAll = true)
	public void batchUpdate(List<${table.className}> list)  throws DAOException{
		
		boolean haspk=false;
		<#list table.columns as column>
				<#if column.isPk=="true">
					haspk=true;
				</#if>
		</#list>
		
		if(haspk=false)
		{
			throw new DAOException("no primary key ");
		}
		
		StringBuffer sql=new StringBuffer("update  ${table.sqlName} set ");
		<#list table.columns as column>
			<#if column.isPk=="false">
						sql.append("${column.columnName}=? ,");
			</#if>
		</#list>
		
		if(sql.lastIndexOf(",")==sql.length()-1)
		{
			sql=new StringBuffer(sql.substring(0,sql.length()-2));
		}
		
		StringBuffer where=new StringBuffer(" where 1=1 ");
		<#list table.columns as column>
				<#if column.isPk=="true">
					where.append(" and ${column.columnName}=?");
				</#if>
		</#list>
		sql.append(where.toString());
		
		
		PreparedStatement ps=null;
		Connection conn = null;
		try{
		
			  conn = DataSourceUtils.getConnection(jdbcTemplate.getDataSource());
			  ps= conn.prepareStatement(sql.toString()); 
			  for (int i = 0; i < list.size(); i++) {
					
					<#list table.columns as column>
					ps.set${column.typeName}(${column_index+1}, list.get(i).get${column.fieldName?cap_first}());
					</#list>
					
					ps.addBatch();
					ps.clearParameters();
					if(i%500==0 || i==list.size()-1)
					{
						ps.executeBatch(); 
					}
			  }
			  ps.close();
		}catch (Exception ex) {
			 ex.printStackTrace(); 
		}finally{
			JdbcUtils.closeStatement(ps);  
			DataSourceUtils.releaseConnection(conn, jdbcTemplate.getDataSource());  
		}
	}
	*/
	
	//@Cacheable(cacheName = "${table.className}DAO",keyGenerator = @KeyGenerator (name = "StringCacheKeyGenerator",properties = {@Property( name="useReflection", value="true" ), @Property( name="checkforCycles", value="true" ),@Property( name="includeMethod", value="true" ) }   ))
	public List<${table.className}> get${table.className}ListByCoud(${table.className} model,int topN)  throws DAOException  {
		StringBuffer sql=new StringBuffer("select t.*,rowid as crowid from ${table.sqlName} t where 1=1 ");
		<#list table.columns as column>
		if(model.get${column.fieldName?cap_first}()!=null)
		{
			sql.append(" and ${column.columnName}=:${column.fieldName} ");
		}
		</#list>
		if(topN>0)
		{
			sql.append(" and rownum <= "+topN);
		}
		SqlParameterSource sps=new BeanPropertySqlParameterSource(model);
		List<${table.className}> modellist = namedParameterJdbcTemplate.query(sql.toString(),sps,new BeanPropertyRowMapper(${table.className}.class));
		return modellist;
	}
	
	public List<${table.className}> get${table.className}ListByCoud(${table.className} model)  throws DAOException 
	{
		return get${table.className}ListByCoud(model,-1);
	}
	
	//@Cacheable(cacheName = "${table.className}DAO",keyGenerator = @KeyGenerator (name = "StringCacheKeyGenerator",properties = {@Property( name="useReflection", value="true" ), @Property( name="checkforCycles", value="true" ),@Property( name="includeMethod", value="true" ) }   ))
	public List<${table.className}> get${table.className}ListByExact(${table.className} model)  throws DAOException  {
		StringBuffer sql=new StringBuffer("select t.*,rowid as crowid from ${table.sqlName} t where 1=1 ");
		<#list table.columns as column>
			sql.append(" and ${column.columnName}=:${column.fieldName} ");
		</#list>
		
		SqlParameterSource sps=new BeanPropertySqlParameterSource(model);
		List<${table.className}> modellist = namedParameterJdbcTemplate.query(sql.toString(),sps,new BeanPropertyRowMapper(${table.className}.class));
		return modellist;
	}
	
	
	
	//@Cacheable(cacheName = "${table.className}DAO",keyGenerator = @KeyGenerator (name = "StringCacheKeyGenerator",properties = {@Property( name="useReflection", value="true" ), @Property( name="checkforCycles", value="true" ),@Property( name="includeMethod", value="true" ) }   ))
	public List<Map<String, Object>> getListMapByCoud(${table.className} model)  throws DAOException  {
		StringBuffer sql=new StringBuffer("select t.*,rowid as crowid  from ${table.sqlName}  t where 1=1 ");
		<#list table.columns as column>
		if(model.get${column.fieldName?cap_first}()!=null)
		{
			sql.append(" and ${column.columnName}=:${column.fieldName} ");
		}
		</#list>
		
		SqlParameterSource sps=new BeanPropertySqlParameterSource(model); 
		List<Map<String, Object>> modellist = namedParameterJdbcTemplate.queryForList(sql.toString(),sps);
		return modellist;
	}
	
	
	//@Cacheable(cacheName = "${table.className}DAO",keyGenerator = @KeyGenerator (name = "StringCacheKeyGenerator",properties = {@Property( name="useReflection", value="true" ), @Property( name="checkforCycles", value="true" ),@Property( name="includeMethod", value="true" ) }   ))
	public List<Map<String, Object>> getListMapByExact(${table.className} model)  throws DAOException  {
		StringBuffer sql=new StringBuffer("select t.*,rowid as crowid  from ${table.sqlName} t where 1=1 ");
		<#list table.columns as column>
			sql.append(" and ${column.columnName}=:${column.fieldName} ");
		</#list>
		
		SqlParameterSource sps=new BeanPropertySqlParameterSource(model); 
		List<Map<String, Object>> modellist = namedParameterJdbcTemplate.queryForList(sql.toString(),sps);
		return modellist;
	}
	
	
	//@Cacheable(cacheName = "${table.className}DAO",keyGenerator = @KeyGenerator (name = "StringCacheKeyGenerator",properties = {@Property( name="useReflection", value="true" ), @Property( name="checkforCycles", value="true" ),@Property( name="includeMethod", value="true" ) }   ))
	public List<${table.className}>  getPageListByCound(${table.className} model, int pageIndex,int rows)  throws DAOException  {
		StringBuffer sql=new StringBuffer("select t.*,rowid as crowid  from ${table.sqlName} t where 1=1 ");
		<#list table.columns as column>
		if(model.get${column.fieldName?cap_first}()!=null)
		{
			sql.append(" and ${column.columnName}=:${column.fieldName} ");
		}
		</#list>
		
		String sqlfinal=DBHelper.getPageSqlByPageIndex(sql.toString(),new Integer(pageIndex).toString(),new Integer(rows).toString());
		
		SqlParameterSource sps=new BeanPropertySqlParameterSource(model);
		
		List<${table.className}> modellist = namedParameterJdbcTemplate.query(sqlfinal,sps,new BeanPropertyRowMapper<${table.className}>(${table.className}.class));
		
		return modellist;
	}
	
	
	//@Cacheable(cacheName = "${table.className}DAO",keyGenerator = @KeyGenerator (name = "StringCacheKeyGenerator",properties = {@Property( name="useReflection", value="true" ), @Property( name="checkforCycles", value="true" ),@Property( name="includeMethod", value="true" ) }   ))
	public List<${table.className}>  getPageListByExact(${table.className} model, int pageIndex,int rows)   throws DAOException {
		StringBuffer sql=new StringBuffer("select t.*,rowid as crowid  from ${table.sqlName} t where 1=1 ");
		<#list table.columns as column>
			if(model.get${column.fieldName?cap_first}()!=null)
			{
				sql.append(" and ${column.columnName}=:${column.fieldName} ");
			}
		</#list>
		
		String sqlfinal=DBHelper.getPageSqlByPageIndex(sql.toString(),new Integer(pageIndex).toString(),new Integer(rows).toString());
		
		SqlParameterSource sps=new BeanPropertySqlParameterSource(model);
		
		List<${table.className}> modellist = namedParameterJdbcTemplate.query(sqlfinal,sps,new BeanPropertyRowMapper<${table.className}>(${table.className}.class));
		
		return modellist;
	}
	
	
	
	
	
	
	
	public List<${table.className}>  getPageListBy${table.className}List(ArrayList<${table.className}> modellist, int pageIndex,int rows) throws DAOException  {
		int startindex=(pageIndex-1)*rows+1;
		int endindex=pageIndex*rows;
		if(endindex>modellist.size()-1)
		{
			modellist.subList(startindex, endindex);
		}else{
			modellist.subList(startindex, modellist.size()-1);
		}
		return modellist;
	}
	
	
	public ${table.className} get${table.className}ByCoud(${table.className} model)  throws DAOException  {
		List<${table.className}> modellist =get${table.className}ListByCoud(model);
		if(modellist!=null&&modellist.size()==1)
		{
			return modellist.get(0);
		}else{
			return null;
		}
	}
	
	
	public ${table.className} get${table.className}ByExact(${table.className} model)  throws DAOException  {
		List<${table.className}> modellist =get${table.className}ListByExact(model);
		if(modellist!=null&&modellist.size()==1)
		{
			return modellist.get(0);
		}else{
			return null;
		}
	}
	
	public String  getSeq() {
		String sql="select ${table.sqlName?replace("_t","_s")}.nextval as seqid from dual";
		
		List<Map<String, Object>> resultlist =null;
		try{
			
			resultlist = jdbcTemplate.queryForList(sql);
			if(resultlist.size()==1){
							Map<String, Object>  map = resultlist.get(0);
							BigDecimal seqid = (BigDecimal) map.get("SEQID");
							return seqid.toString();
			}
		}catch(Exception ex)
		{
			String createseq="create sequence ${table.sqlName?replace("_t","_s")} minvalue 1 maxvalue 999999999999999999999999 start with 1 increment by 1";
			jdbcTemplate.update(createseq);
			resultlist = jdbcTemplate.queryForList(sql);
			if(resultlist.size()==1){
						Map<String, Object>  map = resultlist.get(0);
						BigDecimal seqid = (BigDecimal) map.get("SEQID");
						return seqid.toString();
			}
		}
		return "";
	}
	
	
	
	public int deleteByRowid(String rowid)  throws DAOException  {
		StringBuffer sql=new StringBuffer("delete  from  ${table.sqlName}  where rowid='"+rowid+"'");
		return jdbcTemplate.update(sql.toString());
	}
	
}