package com.bxtel.model.dao;


import com.bxtel.model.*;
import com.bxtel.model.model.*;
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

@Repository("com.bxtel.model.UserDAO")
public class com.bxtel.model.UserDAO
{

	@Resource
	public JdbcTemplate jdbcTemplate;

	@Resource
	public NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	private static final Log logger = LogFactory.getLog(com.bxtel.model.UserDAO.class);
	
	//@TriggersRemove(cacheName = "com.bxtel.model.UserDAO", when = When.AFTER_METHOD_INVOCATION, removeAll = true)
	public com.bxtel.model.User add(com.bxtel.model.User model) throws DAOException  {
		String rowid=addThenReturnRowid(model);
		return  getcom.bxtel.model.UserByRowId(rowid);
	}
	
	
	public String addThenReturnRowid(com.bxtel.model.User model) throws DAOException  {
		model.setCurversion(0L);
		
		StringBuffer sql = new StringBuffer("insert into com.bxtel.model.User("
				+" id "
				+",email "
				+",name "
		
		+") values("
		
					+":id"
					+",:email"
					+",:name"
		  + ")" );
		  
		KeyHolder keyHolder = new GeneratedKeyHolder();
		SqlParameterSource sps=new BeanPropertySqlParameterSource(model);
		namedParameterJdbcTemplate.update(sql.toString(), sps,keyHolder);
		oracle.sql.ROWID id=(ROWID) keyHolder.getKeys().get("ROWID");
		return id.stringValue();
	}
	
	
	public com.bxtel.model.User getcom.bxtel.model.UserByRowId(String rowid) throws DAOException {
		StringBuffer sql=new StringBuffer("select t.*,rowid as crowid from com.bxtel.model.User t where rowid='"+rowid+"'");
		List<com.bxtel.model.User> modellist = jdbcTemplate.query(sql.toString(),new BeanPropertyRowMapper(com.bxtel.model.User.class));
		if(modellist!=null && modellist.size()==1)
		{
			return  modellist.get(0);
		}else{
			throw new DAOException("rowid is wrong:"+rowid);
		}
	}
	
	
	//@TriggersRemove(cacheName = "com.bxtel.model.UserDAO", when = When.AFTER_METHOD_INVOCATION, removeAll = true)
	public int deleteByCoud(com.bxtel.model.User model) {
		
		StringBuffer sql=new StringBuffer("delete from com.bxtel.model.User where 1=1 ");
		if(model.getId()!=null)
		{
			sql.append(" and id=:id ");
		}
		if(model.getEmail()!=null)
		{
			sql.append(" and email=:email ");
		}
		if(model.getName()!=null)
		{
			sql.append(" and name=:name ");
		}
		
		SqlParameterSource sps=new BeanPropertySqlParameterSource(model);
		return namedParameterJdbcTemplate.update(sql.toString(), sps);
	}
	
	//@TriggersRemove(cacheName = "com.bxtel.model.UserDAO", when = When.AFTER_METHOD_INVOCATION, removeAll = true)
	public int deleteByExact(com.bxtel.model.User model) throws DAOException  {
		
		StringBuffer sql=new StringBuffer("delete from com.bxtel.model.User where 1=1 ");
		sql.append(" and id=:id ");
		sql.append(" and email=:email ");
		sql.append(" and name=:name ");
		
		SqlParameterSource sps=new BeanPropertySqlParameterSource(model);
		return namedParameterJdbcTemplate.update(sql.toString(), sps);
	}
	
	//@TriggersRemove(cacheName = "com.bxtel.model.UserDAO", when = When.AFTER_METHOD_INVOCATION, removeAll = true)
	public int deleteByRowId(String rowid)  throws DAOException  {
		if(StringUtil.isEmptyOrWhitespace(rowid))
		{
			throw new DAOException("rowid is null");
		}
		StringBuffer sql=new StringBuffer("delete from com.bxtel.model.User where rowid='"+rowid+"'");
		return jdbcTemplate.update(sql.toString());
	}
	
	//@TriggersRemove(cacheName = "com.bxtel.model.UserDAO", when = When.AFTER_METHOD_INVOCATION, removeAll = true)
	public int updateExactByRowId(com.bxtel.model.User model)  throws DAOException  {
		if(StringUtil.isEmptyOrWhitespace(model.getCrowid()))
		{
			throw new DAOException("rowid is null");
		}
		StringBuffer sql=new StringBuffer("update  com.bxtel.model.User set ");
						sql.append("id=:id,");
						sql.append("email=:email,");
						sql.append("name=:name");
		sql=new StringBuffer(StringUtil.removeLastWith(sql.toString(),","));
		sql.append(" where rowid='"+model.getCrowid()+"'  and curversion=:curversion ");
		SqlParameterSource sps=new BeanPropertySqlParameterSource(model);
		return namedParameterJdbcTemplate.update(sql.toString(), sps);
	}
	
	//@TriggersRemove(cacheName = "com.bxtel.model.UserDAO", when = When.AFTER_METHOD_INVOCATION, removeAll = true)
	public int updateCoudByRowId(com.bxtel.model.User model)  throws DAOException  {
		if(StringUtil.isEmptyOrWhitespace(model.getCrowid()))
		{
			throw new DAOException("rowid is null");
		}
		StringBuffer sql=new StringBuffer("update  com.bxtel.model.User set ");
					if(model.getId()!=null)
					{
						sql.append("id=:id ,");
					}
					if(model.getEmail()!=null)
					{
						sql.append("email=:email ,");
					}
					if(model.getName()!=null)
					{
						sql.append("name=:name ,");
					}
		sql=new StringBuffer(StringUtil.removeLastWith(sql.toString(),","));
		sql.append(" where rowid='"+model.getCrowid()+"'   and curversion=:curversion ");
		SqlParameterSource sps=new BeanPropertySqlParameterSource(model);
		return namedParameterJdbcTemplate.update(sql.toString(), sps);
	}
	
	
	//@TriggersRemove(cacheName = "com.bxtel.model.UserDAO", when = When.AFTER_METHOD_INVOCATION, removeAll = true)
	public int updateByCoudAndWhere(com.bxtel.model.User model,com.bxtel.model.User wheremodel)  throws DAOException  {
		
		boolean haspk=false;
		
		if(haspk=false)
		{
			throw new DAOException("no primary key ");
		}
		
		StringBuffer sql=new StringBuffer("update  com.bxtel.model.User set ");
					if(model.getId()!=null)
					{
						sql.append("id=:id ,");
					}
					if(model.getEmail()!=null)
					{
						sql.append("email=:email ,");
					}
					if(model.getName()!=null)
					{
						sql.append("name=:name ,");
					}
		
		
		sql=new StringBuffer(StringUtil.removeLastWith(sql.toString(),","));
		
		
		StringBuffer where=new StringBuffer("");
					if(wheremodel.getId()!=null)
					{
						where.append("and id=:id ,");
					}
					if(wheremodel.getEmail()!=null)
					{
						where.append("and email=:email ,");
					}
					if(wheremodel.getName()!=null)
					{
						where.append("and name=:name ,");
					}
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
	//@TriggersRemove(cacheName = "com.bxtel.model.UserDAO", when = When.AFTER_METHOD_INVOCATION, removeAll = true)
	public void batchInsert(List<com.bxtel.model.User> list)  throws DAOException{
		
		StringBuffer sql = new StringBuffer("insert into com.bxtel.model.User("
				+" id "
				+",email "
				+",name "
		
		+") values("
		
				+"?"
				+",?"
				+",?"
		  + ")" );
		
		
		PreparedStatement ps=null;
		Connection conn = null;
		try{
		
			  conn = DataSourceUtils.getConnection(jdbcTemplate.getDataSource());
			  ps= conn.prepareStatement(sql.toString()); 
			  for (int i = 0; i < list.size(); i++) {
					
					ps.setlong(1, list.get(i).getId());
					ps.setjava.lang.String(2, list.get(i).getEmail());
					ps.setjava.lang.String(3, list.get(i).getName());
					
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
	
	//@TriggersRemove(cacheName = "com.bxtel.model.UserDAO", when = When.AFTER_METHOD_INVOCATION, removeAll = true)
	public void batchUpdate(List<com.bxtel.model.User> list)  throws DAOException{
		
		boolean haspk=false;
		
		if(haspk=false)
		{
			throw new DAOException("no primary key ");
		}
		
		StringBuffer sql=new StringBuffer("update  com.bxtel.model.User set ");
						sql.append("id=? ,");
						sql.append("email=? ,");
						sql.append("name=? ,");
		
		if(sql.lastIndexOf(",")==sql.length()-1)
		{
			sql=new StringBuffer(sql.substring(0,sql.length()-2));
		}
		
		StringBuffer where=new StringBuffer(" where 1=1 ");
		sql.append(where.toString());
		
		
		PreparedStatement ps=null;
		Connection conn = null;
		try{
		
			  conn = DataSourceUtils.getConnection(jdbcTemplate.getDataSource());
			  ps= conn.prepareStatement(sql.toString()); 
			  for (int i = 0; i < list.size(); i++) {
					
					ps.setlong(1, list.get(i).getId());
					ps.setjava.lang.String(2, list.get(i).getEmail());
					ps.setjava.lang.String(3, list.get(i).getName());
					
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
	
	//@Cacheable(cacheName = "com.bxtel.model.UserDAO",keyGenerator = @KeyGenerator (name = "StringCacheKeyGenerator",properties = {@Property( name="useReflection", value="true" ), @Property( name="checkforCycles", value="true" ),@Property( name="includeMethod", value="true" ) }   ))
	public List<com.bxtel.model.User> getcom.bxtel.model.UserListByCoud(com.bxtel.model.User model,int topN)  throws DAOException  {
		StringBuffer sql=new StringBuffer("select t.*,rowid as crowid from com.bxtel.model.User t where 1=1 ");
		if(model.getId()!=null)
		{
			sql.append(" and id=:id ");
		}
		if(model.getEmail()!=null)
		{
			sql.append(" and email=:email ");
		}
		if(model.getName()!=null)
		{
			sql.append(" and name=:name ");
		}
		if(topN>0)
		{
			sql.append(" and rownum <= "+topN);
		}
		SqlParameterSource sps=new BeanPropertySqlParameterSource(model);
		List<com.bxtel.model.User> modellist = namedParameterJdbcTemplate.query(sql.toString(),sps,new BeanPropertyRowMapper(com.bxtel.model.User.class));
		return modellist;
	}
	
	public List<com.bxtel.model.User> getcom.bxtel.model.UserListByCoud(com.bxtel.model.User model)  throws DAOException 
	{
		return getcom.bxtel.model.UserListByCoud(model,-1);
	}
	
	//@Cacheable(cacheName = "com.bxtel.model.UserDAO",keyGenerator = @KeyGenerator (name = "StringCacheKeyGenerator",properties = {@Property( name="useReflection", value="true" ), @Property( name="checkforCycles", value="true" ),@Property( name="includeMethod", value="true" ) }   ))
	public List<com.bxtel.model.User> getcom.bxtel.model.UserListByExact(com.bxtel.model.User model)  throws DAOException  {
		StringBuffer sql=new StringBuffer("select t.*,rowid as crowid from com.bxtel.model.User t where 1=1 ");
			sql.append(" and id=:id ");
			sql.append(" and email=:email ");
			sql.append(" and name=:name ");
		
		SqlParameterSource sps=new BeanPropertySqlParameterSource(model);
		List<com.bxtel.model.User> modellist = namedParameterJdbcTemplate.query(sql.toString(),sps,new BeanPropertyRowMapper(com.bxtel.model.User.class));
		return modellist;
	}
	
	
	
	//@Cacheable(cacheName = "com.bxtel.model.UserDAO",keyGenerator = @KeyGenerator (name = "StringCacheKeyGenerator",properties = {@Property( name="useReflection", value="true" ), @Property( name="checkforCycles", value="true" ),@Property( name="includeMethod", value="true" ) }   ))
	public List<Map<String, Object>> getListMapByCoud(com.bxtel.model.User model)  throws DAOException  {
		StringBuffer sql=new StringBuffer("select t.*,rowid as crowid  from com.bxtel.model.User  t where 1=1 ");
		if(model.getId()!=null)
		{
			sql.append(" and id=:id ");
		}
		if(model.getEmail()!=null)
		{
			sql.append(" and email=:email ");
		}
		if(model.getName()!=null)
		{
			sql.append(" and name=:name ");
		}
		
		SqlParameterSource sps=new BeanPropertySqlParameterSource(model); 
		List<Map<String, Object>> modellist = namedParameterJdbcTemplate.queryForList(sql.toString(),sps);
		return modellist;
	}
	
	
	//@Cacheable(cacheName = "com.bxtel.model.UserDAO",keyGenerator = @KeyGenerator (name = "StringCacheKeyGenerator",properties = {@Property( name="useReflection", value="true" ), @Property( name="checkforCycles", value="true" ),@Property( name="includeMethod", value="true" ) }   ))
	public List<Map<String, Object>> getListMapByExact(com.bxtel.model.User model)  throws DAOException  {
		StringBuffer sql=new StringBuffer("select t.*,rowid as crowid  from com.bxtel.model.User t where 1=1 ");
			sql.append(" and id=:id ");
			sql.append(" and email=:email ");
			sql.append(" and name=:name ");
		
		SqlParameterSource sps=new BeanPropertySqlParameterSource(model); 
		List<Map<String, Object>> modellist = namedParameterJdbcTemplate.queryForList(sql.toString(),sps);
		return modellist;
	}
	
	
	//@Cacheable(cacheName = "com.bxtel.model.UserDAO",keyGenerator = @KeyGenerator (name = "StringCacheKeyGenerator",properties = {@Property( name="useReflection", value="true" ), @Property( name="checkforCycles", value="true" ),@Property( name="includeMethod", value="true" ) }   ))
	public List<com.bxtel.model.User>  getPageListByCound(com.bxtel.model.User model, int pageIndex,int rows)  throws DAOException  {
		StringBuffer sql=new StringBuffer("select t.*,rowid as crowid  from com.bxtel.model.User t where 1=1 ");
		if(model.getId()!=null)
		{
			sql.append(" and id=:id ");
		}
		if(model.getEmail()!=null)
		{
			sql.append(" and email=:email ");
		}
		if(model.getName()!=null)
		{
			sql.append(" and name=:name ");
		}
		
		String sqlfinal=DBHelper.getPageSqlByPageIndex(sql.toString(),new Integer(pageIndex).toString(),new Integer(rows).toString());
		
		SqlParameterSource sps=new BeanPropertySqlParameterSource(model);
		
		List<com.bxtel.model.User> modellist = namedParameterJdbcTemplate.query(sqlfinal,sps,new BeanPropertyRowMapper<com.bxtel.model.User>(com.bxtel.model.User.class));
		
		return modellist;
	}
	
	
	//@Cacheable(cacheName = "com.bxtel.model.UserDAO",keyGenerator = @KeyGenerator (name = "StringCacheKeyGenerator",properties = {@Property( name="useReflection", value="true" ), @Property( name="checkforCycles", value="true" ),@Property( name="includeMethod", value="true" ) }   ))
	public List<com.bxtel.model.User>  getPageListByExact(com.bxtel.model.User model, int pageIndex,int rows)   throws DAOException {
		StringBuffer sql=new StringBuffer("select t.*,rowid as crowid  from com.bxtel.model.User t where 1=1 ");
			if(model.getId()!=null)
			{
				sql.append(" and id=:id ");
			}
			if(model.getEmail()!=null)
			{
				sql.append(" and email=:email ");
			}
			if(model.getName()!=null)
			{
				sql.append(" and name=:name ");
			}
		
		String sqlfinal=DBHelper.getPageSqlByPageIndex(sql.toString(),new Integer(pageIndex).toString(),new Integer(rows).toString());
		
		SqlParameterSource sps=new BeanPropertySqlParameterSource(model);
		
		List<com.bxtel.model.User> modellist = namedParameterJdbcTemplate.query(sqlfinal,sps,new BeanPropertyRowMapper<com.bxtel.model.User>(com.bxtel.model.User.class));
		
		return modellist;
	}
	
	
	
	
	
	
	
	public List<com.bxtel.model.User>  getPageListBycom.bxtel.model.UserList(ArrayList<com.bxtel.model.User> modellist, int pageIndex,int rows) throws DAOException  {
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
	
	
	public com.bxtel.model.User getcom.bxtel.model.UserByCoud(com.bxtel.model.User model)  throws DAOException  {
		List<com.bxtel.model.User> modellist =getcom.bxtel.model.UserListByCoud(model);
		if(modellist!=null&&modellist.size()==1)
		{
			return modellist.get(0);
		}else{
			return null;
		}
	}
	
	
	public com.bxtel.model.User getcom.bxtel.model.UserByExact(com.bxtel.model.User model)  throws DAOException  {
		List<com.bxtel.model.User> modellist =getcom.bxtel.model.UserListByExact(model);
		if(modellist!=null&&modellist.size()==1)
		{
			return modellist.get(0);
		}else{
			return null;
		}
	}
	
	public String  getSeq() {
		String sql="select com.bxtel.model.User.nextval as seqid from dual";
		
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
			String createseq="create sequence com.bxtel.model.User minvalue 1 maxvalue 999999999999999999999999 start with 1 increment by 1";
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
		StringBuffer sql=new StringBuffer("delete  from  com.bxtel.model.User  where rowid='"+rowid+"'");
		return jdbcTemplate.update(sql.toString());
	}
	
}