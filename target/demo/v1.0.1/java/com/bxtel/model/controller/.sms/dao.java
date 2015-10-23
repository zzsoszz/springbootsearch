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

@Repository(".SmsDAO")
public class .SmsDAO
{

	@Resource
	public JdbcTemplate jdbcTemplate;

	@Resource
	public NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	private static final Log logger = LogFactory.getLog(.SmsDAO.class);
	
	//@TriggersRemove(cacheName = ".SmsDAO", when = When.AFTER_METHOD_INVOCATION, removeAll = true)
	public .Sms add(.Sms model) throws DAOException  {
		String rowid=addThenReturnRowid(model);
		return  get.SmsByRowId(rowid);
	}
	
	
	public String addThenReturnRowid(.Sms model) throws DAOException  {
		model.setCurversion(0L);
		
		StringBuffer sql = new StringBuffer("insert into .Sms("
				+" .Sms "
				+",.Sms "
				+",.Sms "
				+",.Sms "
				+",.Sms "
		
		+") values("
		
					+":.Sms"
					+",:.Sms"
					+",:.Sms"
					+",:.Sms"
					+",:.Sms"
		  + ")" );
		  
		KeyHolder keyHolder = new GeneratedKeyHolder();
		SqlParameterSource sps=new BeanPropertySqlParameterSource(model);
		namedParameterJdbcTemplate.update(sql.toString(), sps,keyHolder);
		oracle.sql.ROWID id=(ROWID) keyHolder.getKeys().get("ROWID");
		return id.stringValue();
	}
	
	
	public .Sms get.SmsByRowId(String rowid) throws DAOException {
		StringBuffer sql=new StringBuffer("select t.*,rowid as crowid from .Sms t where rowid='"+rowid+"'");
		List<.Sms> modellist = jdbcTemplate.query(sql.toString(),new BeanPropertyRowMapper(.Sms.class));
		if(modellist!=null && modellist.size()==1)
		{
			return  modellist.get(0);
		}else{
			throw new DAOException("rowid is wrong:"+rowid);
		}
	}
	
	
	//@TriggersRemove(cacheName = ".SmsDAO", when = When.AFTER_METHOD_INVOCATION, removeAll = true)
	public int deleteByCoud(.Sms model) {
		
		StringBuffer sql=new StringBuffer("delete from .Sms where 1=1 ");
		if(model.get.Sms()!=null)
		{
			sql.append(" and .Sms=:.Sms ");
		}
		if(model.get.Sms()!=null)
		{
			sql.append(" and .Sms=:.Sms ");
		}
		if(model.get.Sms()!=null)
		{
			sql.append(" and .Sms=:.Sms ");
		}
		if(model.get.Sms()!=null)
		{
			sql.append(" and .Sms=:.Sms ");
		}
		if(model.get.Sms()!=null)
		{
			sql.append(" and .Sms=:.Sms ");
		}
		
		SqlParameterSource sps=new BeanPropertySqlParameterSource(model);
		return namedParameterJdbcTemplate.update(sql.toString(), sps);
	}
	
	//@TriggersRemove(cacheName = ".SmsDAO", when = When.AFTER_METHOD_INVOCATION, removeAll = true)
	public int deleteByExact(.Sms model) throws DAOException  {
		
		StringBuffer sql=new StringBuffer("delete from .Sms where 1=1 ");
		sql.append(" and .Sms=:.Sms ");
		sql.append(" and .Sms=:.Sms ");
		sql.append(" and .Sms=:.Sms ");
		sql.append(" and .Sms=:.Sms ");
		sql.append(" and .Sms=:.Sms ");
		
		SqlParameterSource sps=new BeanPropertySqlParameterSource(model);
		return namedParameterJdbcTemplate.update(sql.toString(), sps);
	}
	
	//@TriggersRemove(cacheName = ".SmsDAO", when = When.AFTER_METHOD_INVOCATION, removeAll = true)
	public int deleteByRowId(String rowid)  throws DAOException  {
		if(StringUtil.isEmptyOrWhitespace(rowid))
		{
			throw new DAOException("rowid is null");
		}
		StringBuffer sql=new StringBuffer("delete from .Sms where rowid='"+rowid+"'");
		return jdbcTemplate.update(sql.toString());
	}
	
	//@TriggersRemove(cacheName = ".SmsDAO", when = When.AFTER_METHOD_INVOCATION, removeAll = true)
	public int updateExactByRowId(.Sms model)  throws DAOException  {
		if(StringUtil.isEmptyOrWhitespace(model.getCrowid()))
		{
			throw new DAOException("rowid is null");
		}
		StringBuffer sql=new StringBuffer("update  .Sms set ");
						sql.append(".Sms=:.Sms,");
						sql.append(".Sms=:.Sms,");
						sql.append(".Sms=:.Sms,");
						sql.append(".Sms=:.Sms,");
						sql.append(".Sms=:.Sms");
		sql=new StringBuffer(StringUtil.removeLastWith(sql.toString(),","));
		sql.append(" where rowid='"+model.getCrowid()+"'  and curversion=:curversion ");
		SqlParameterSource sps=new BeanPropertySqlParameterSource(model);
		return namedParameterJdbcTemplate.update(sql.toString(), sps);
	}
	
	//@TriggersRemove(cacheName = ".SmsDAO", when = When.AFTER_METHOD_INVOCATION, removeAll = true)
	public int updateCoudByRowId(.Sms model)  throws DAOException  {
		if(StringUtil.isEmptyOrWhitespace(model.getCrowid()))
		{
			throw new DAOException("rowid is null");
		}
		StringBuffer sql=new StringBuffer("update  .Sms set ");
					if(model.get.Sms()!=null)
					{
						sql.append(".Sms=:.Sms ,");
					}
					if(model.get.Sms()!=null)
					{
						sql.append(".Sms=:.Sms ,");
					}
					if(model.get.Sms()!=null)
					{
						sql.append(".Sms=:.Sms ,");
					}
					if(model.get.Sms()!=null)
					{
						sql.append(".Sms=:.Sms ,");
					}
					if(model.get.Sms()!=null)
					{
						sql.append(".Sms=:.Sms ,");
					}
		sql=new StringBuffer(StringUtil.removeLastWith(sql.toString(),","));
		sql.append(" where rowid='"+model.getCrowid()+"'   and curversion=:curversion ");
		SqlParameterSource sps=new BeanPropertySqlParameterSource(model);
		return namedParameterJdbcTemplate.update(sql.toString(), sps);
	}
	
	
	//@TriggersRemove(cacheName = ".SmsDAO", when = When.AFTER_METHOD_INVOCATION, removeAll = true)
	public int updateByCoudAndWhere(.Sms model,.Sms wheremodel)  throws DAOException  {
		
		boolean haspk=false;
		
		if(haspk=false)
		{
			throw new DAOException("no primary key ");
		}
		
		StringBuffer sql=new StringBuffer("update  .Sms set ");
					if(model.get.Sms()!=null)
					{
						sql.append(".Sms=:.Sms ,");
					}
					if(model.get.Sms()!=null)
					{
						sql.append(".Sms=:.Sms ,");
					}
					if(model.get.Sms()!=null)
					{
						sql.append(".Sms=:.Sms ,");
					}
					if(model.get.Sms()!=null)
					{
						sql.append(".Sms=:.Sms ,");
					}
					if(model.get.Sms()!=null)
					{
						sql.append(".Sms=:.Sms ,");
					}
		
		
		sql=new StringBuffer(StringUtil.removeLastWith(sql.toString(),","));
		
		
		StringBuffer where=new StringBuffer("");
					if(wheremodel.get.Sms()!=null)
					{
						where.append("and .Sms=:.Sms ,");
					}
					if(wheremodel.get.Sms()!=null)
					{
						where.append("and .Sms=:.Sms ,");
					}
					if(wheremodel.get.Sms()!=null)
					{
						where.append("and .Sms=:.Sms ,");
					}
					if(wheremodel.get.Sms()!=null)
					{
						where.append("and .Sms=:.Sms ,");
					}
					if(wheremodel.get.Sms()!=null)
					{
						where.append("and .Sms=:.Sms ,");
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
	//@TriggersRemove(cacheName = ".SmsDAO", when = When.AFTER_METHOD_INVOCATION, removeAll = true)
	public void batchInsert(List<.Sms> list)  throws DAOException{
		
		StringBuffer sql = new StringBuffer("insert into .Sms("
				+" .Sms "
				+",.Sms "
				+",.Sms "
				+",.Sms "
				+",.Sms "
		
		+") values("
		
				+"?"
				+",?"
				+",?"
				+",?"
				+",?"
		  + ")" );
		
		
		PreparedStatement ps=null;
		Connection conn = null;
		try{
		
			  conn = DataSourceUtils.getConnection(jdbcTemplate.getDataSource());
			  ps= conn.prepareStatement(sql.toString()); 
			  for (int i = 0; i < list.size(); i++) {
					
					ps.setlong(1, list.get(i).get.Sms());
					ps.setjava.lang.String(2, list.get(i).get.Sms());
					ps.setjava.lang.String(3, list.get(i).get.Sms());
					ps.setjava.lang.String(4, list.get(i).get.Sms());
					ps.setjava.lang.String(5, list.get(i).get.Sms());
					
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
	
	//@TriggersRemove(cacheName = ".SmsDAO", when = When.AFTER_METHOD_INVOCATION, removeAll = true)
	public void batchUpdate(List<.Sms> list)  throws DAOException{
		
		boolean haspk=false;
		
		if(haspk=false)
		{
			throw new DAOException("no primary key ");
		}
		
		StringBuffer sql=new StringBuffer("update  .Sms set ");
						sql.append(".Sms=? ,");
						sql.append(".Sms=? ,");
						sql.append(".Sms=? ,");
						sql.append(".Sms=? ,");
						sql.append(".Sms=? ,");
		
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
					
					ps.setlong(1, list.get(i).get.Sms());
					ps.setjava.lang.String(2, list.get(i).get.Sms());
					ps.setjava.lang.String(3, list.get(i).get.Sms());
					ps.setjava.lang.String(4, list.get(i).get.Sms());
					ps.setjava.lang.String(5, list.get(i).get.Sms());
					
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
	
	//@Cacheable(cacheName = ".SmsDAO",keyGenerator = @KeyGenerator (name = "StringCacheKeyGenerator",properties = {@Property( name="useReflection", value="true" ), @Property( name="checkforCycles", value="true" ),@Property( name="includeMethod", value="true" ) }   ))
	public List<.Sms> get.SmsListByCoud(.Sms model,int topN)  throws DAOException  {
		StringBuffer sql=new StringBuffer("select t.*,rowid as crowid from .Sms t where 1=1 ");
		if(model.get.Sms()!=null)
		{
			sql.append(" and .Sms=:.Sms ");
		}
		if(model.get.Sms()!=null)
		{
			sql.append(" and .Sms=:.Sms ");
		}
		if(model.get.Sms()!=null)
		{
			sql.append(" and .Sms=:.Sms ");
		}
		if(model.get.Sms()!=null)
		{
			sql.append(" and .Sms=:.Sms ");
		}
		if(model.get.Sms()!=null)
		{
			sql.append(" and .Sms=:.Sms ");
		}
		if(topN>0)
		{
			sql.append(" and rownum <= "+topN);
		}
		SqlParameterSource sps=new BeanPropertySqlParameterSource(model);
		List<.Sms> modellist = namedParameterJdbcTemplate.query(sql.toString(),sps,new BeanPropertyRowMapper(.Sms.class));
		return modellist;
	}
	
	public List<.Sms> get.SmsListByCoud(.Sms model)  throws DAOException 
	{
		return get.SmsListByCoud(model,-1);
	}
	
	//@Cacheable(cacheName = ".SmsDAO",keyGenerator = @KeyGenerator (name = "StringCacheKeyGenerator",properties = {@Property( name="useReflection", value="true" ), @Property( name="checkforCycles", value="true" ),@Property( name="includeMethod", value="true" ) }   ))
	public List<.Sms> get.SmsListByExact(.Sms model)  throws DAOException  {
		StringBuffer sql=new StringBuffer("select t.*,rowid as crowid from .Sms t where 1=1 ");
			sql.append(" and .Sms=:.Sms ");
			sql.append(" and .Sms=:.Sms ");
			sql.append(" and .Sms=:.Sms ");
			sql.append(" and .Sms=:.Sms ");
			sql.append(" and .Sms=:.Sms ");
		
		SqlParameterSource sps=new BeanPropertySqlParameterSource(model);
		List<.Sms> modellist = namedParameterJdbcTemplate.query(sql.toString(),sps,new BeanPropertyRowMapper(.Sms.class));
		return modellist;
	}
	
	
	
	//@Cacheable(cacheName = ".SmsDAO",keyGenerator = @KeyGenerator (name = "StringCacheKeyGenerator",properties = {@Property( name="useReflection", value="true" ), @Property( name="checkforCycles", value="true" ),@Property( name="includeMethod", value="true" ) }   ))
	public List<Map<String, Object>> getListMapByCoud(.Sms model)  throws DAOException  {
		StringBuffer sql=new StringBuffer("select t.*,rowid as crowid  from .Sms  t where 1=1 ");
		if(model.get.Sms()!=null)
		{
			sql.append(" and .Sms=:.Sms ");
		}
		if(model.get.Sms()!=null)
		{
			sql.append(" and .Sms=:.Sms ");
		}
		if(model.get.Sms()!=null)
		{
			sql.append(" and .Sms=:.Sms ");
		}
		if(model.get.Sms()!=null)
		{
			sql.append(" and .Sms=:.Sms ");
		}
		if(model.get.Sms()!=null)
		{
			sql.append(" and .Sms=:.Sms ");
		}
		
		SqlParameterSource sps=new BeanPropertySqlParameterSource(model); 
		List<Map<String, Object>> modellist = namedParameterJdbcTemplate.queryForList(sql.toString(),sps);
		return modellist;
	}
	
	
	//@Cacheable(cacheName = ".SmsDAO",keyGenerator = @KeyGenerator (name = "StringCacheKeyGenerator",properties = {@Property( name="useReflection", value="true" ), @Property( name="checkforCycles", value="true" ),@Property( name="includeMethod", value="true" ) }   ))
	public List<Map<String, Object>> getListMapByExact(.Sms model)  throws DAOException  {
		StringBuffer sql=new StringBuffer("select t.*,rowid as crowid  from .Sms t where 1=1 ");
			sql.append(" and .Sms=:.Sms ");
			sql.append(" and .Sms=:.Sms ");
			sql.append(" and .Sms=:.Sms ");
			sql.append(" and .Sms=:.Sms ");
			sql.append(" and .Sms=:.Sms ");
		
		SqlParameterSource sps=new BeanPropertySqlParameterSource(model); 
		List<Map<String, Object>> modellist = namedParameterJdbcTemplate.queryForList(sql.toString(),sps);
		return modellist;
	}
	
	
	//@Cacheable(cacheName = ".SmsDAO",keyGenerator = @KeyGenerator (name = "StringCacheKeyGenerator",properties = {@Property( name="useReflection", value="true" ), @Property( name="checkforCycles", value="true" ),@Property( name="includeMethod", value="true" ) }   ))
	public List<.Sms>  getPageListByCound(.Sms model, int pageIndex,int rows)  throws DAOException  {
		StringBuffer sql=new StringBuffer("select t.*,rowid as crowid  from .Sms t where 1=1 ");
		if(model.get.Sms()!=null)
		{
			sql.append(" and .Sms=:.Sms ");
		}
		if(model.get.Sms()!=null)
		{
			sql.append(" and .Sms=:.Sms ");
		}
		if(model.get.Sms()!=null)
		{
			sql.append(" and .Sms=:.Sms ");
		}
		if(model.get.Sms()!=null)
		{
			sql.append(" and .Sms=:.Sms ");
		}
		if(model.get.Sms()!=null)
		{
			sql.append(" and .Sms=:.Sms ");
		}
		
		String sqlfinal=DBHelper.getPageSqlByPageIndex(sql.toString(),new Integer(pageIndex).toString(),new Integer(rows).toString());
		
		SqlParameterSource sps=new BeanPropertySqlParameterSource(model);
		
		List<.Sms> modellist = namedParameterJdbcTemplate.query(sqlfinal,sps,new BeanPropertyRowMapper<.Sms>(.Sms.class));
		
		return modellist;
	}
	
	
	//@Cacheable(cacheName = ".SmsDAO",keyGenerator = @KeyGenerator (name = "StringCacheKeyGenerator",properties = {@Property( name="useReflection", value="true" ), @Property( name="checkforCycles", value="true" ),@Property( name="includeMethod", value="true" ) }   ))
	public List<.Sms>  getPageListByExact(.Sms model, int pageIndex,int rows)   throws DAOException {
		StringBuffer sql=new StringBuffer("select t.*,rowid as crowid  from .Sms t where 1=1 ");
			if(model.get.Sms()!=null)
			{
				sql.append(" and .Sms=:.Sms ");
			}
			if(model.get.Sms()!=null)
			{
				sql.append(" and .Sms=:.Sms ");
			}
			if(model.get.Sms()!=null)
			{
				sql.append(" and .Sms=:.Sms ");
			}
			if(model.get.Sms()!=null)
			{
				sql.append(" and .Sms=:.Sms ");
			}
			if(model.get.Sms()!=null)
			{
				sql.append(" and .Sms=:.Sms ");
			}
		
		String sqlfinal=DBHelper.getPageSqlByPageIndex(sql.toString(),new Integer(pageIndex).toString(),new Integer(rows).toString());
		
		SqlParameterSource sps=new BeanPropertySqlParameterSource(model);
		
		List<.Sms> modellist = namedParameterJdbcTemplate.query(sqlfinal,sps,new BeanPropertyRowMapper<.Sms>(.Sms.class));
		
		return modellist;
	}
	
	
	
	
	
	
	
	public List<.Sms>  getPageListBy.SmsList(ArrayList<.Sms> modellist, int pageIndex,int rows) throws DAOException  {
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
	
	
	public .Sms get.SmsByCoud(.Sms model)  throws DAOException  {
		List<.Sms> modellist =get.SmsListByCoud(model);
		if(modellist!=null&&modellist.size()==1)
		{
			return modellist.get(0);
		}else{
			return null;
		}
	}
	
	
	public .Sms get.SmsByExact(.Sms model)  throws DAOException  {
		List<.Sms> modellist =get.SmsListByExact(model);
		if(modellist!=null&&modellist.size()==1)
		{
			return modellist.get(0);
		}else{
			return null;
		}
	}
	
	public String  getSeq() {
		String sql="select .Sms.nextval as seqid from dual";
		
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
			String createseq="create sequence .Sms minvalue 1 maxvalue 999999999999999999999999 start with 1 increment by 1";
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
		StringBuffer sql=new StringBuffer("delete  from  .Sms  where rowid='"+rowid+"'");
		return jdbcTemplate.update(sql.toString());
	}
	
}