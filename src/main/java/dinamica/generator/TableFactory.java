package dinamica.generator;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import org.springframework.data.annotation.Id;
import dinamica.Db;
import dinamica.RecordTool;
import dinamica.Recordset;
import dinamica.classloader.ClassScan;


/*
 * Mysql	Oracle	Java
BIGINT	NUMBER(19,0)	java.lang.Long
BIT	RAW	byte[]
BLOB	BLOB RAW	byte[]
CHAR	CHAR	java.lang.String
DATE	DATE	java.sql.Date
DATETIME	DATE	java.sql.Timestamp
DECIMAL	FLOAT (24)	java.math.BigDecimal
DOUBLE	FLOAT (24)	java.lang.Double
DOUBLE PRECISION	FLOAT (24)	java.lang.Double
ENUM	VARCHAR2	java.lang.String
FLOAT	FLOAT	java.lang.Float
INT	NUMBER(10,0)	java.lang.Integer
INTEGER	NUMBER(10,0)	java.lang.Integer
LONGBLOB	BLOB RAW	byte[]
LONGTEXT	CLOB RAW	java.lang.String
MEDIUMBLOB	BLOB RAW	byte[]
MEDIUMINT	NUMBER(7,0)	java.lang.Integer
MEDIUMTEXT	CLOB RAW	java.lang.String
NUMERIC	NUMBER	
REAL	FLOAT (24)	
SET	VARCHAR2	java.lang.String
SMALLINT	NUMBER(5,0)	java.lang.Integer
TEXT	VARCHAR2 CLOB	java.lang.String
TIME	DATE	java.sql.Time
TIMESTAMP	DATE	java.sql.Timestamp
TINYBLOB	RAW	byte[]
TINYINT	NUMBER(3,0)	java.lang.Boolean
TINYTEXT	VARCHAR2	java.lang.String
VARCHAR	VARCHAR2 CLOB	java.lang.String
YEAR	NUMBER	java.sql.Date（日期设为2月1日晚上2点）
 */

/*http://blog.csdn.net/yirentianran/article/details/2950321
 *   Connection conn = getConnection();
 27.        String sql = "select * from class";
 28.        PreparedStatement stmt;
 29.        try {
 30.            stmt = conn.prepareStatement(sql);
 31.            ResultSet rs = stmt.executeQuery(sql);
 32.            ResultSetMetaData data = rs.getMetaData();
 33.            while (rs.next()) {
 34.                for (int i = 1; i <= data.getColumnCount(); i++) {
 35.                    // 获得所有列的数目及实际列数 
36.                    int columnCount = data.getColumnCount();
 37.                    // 获得指定列的列名 
38.                    String columnName = data.getColumnName(i);
 39.                    // 获得指定列的列值 
40.                    String columnValue = rs.getString(i);
 41.                    // 获得指定列的数据类型 
42.                    int columnType = data.getColumnType(i);
 43.                    // 获得指定列的数据类型名 
44.                    String columnTypeName = data.getColumnTypeName(i);
 45.                    // 所在的Catalog名字 
46.                    String catalogName = data.getCatalogName(i);
 47.                    // 对应数据类型的类 
48.                    String columnClassName = data.getColumnClassName(i);
 49.                    // 在数据库中类型的最大字符个数 
50.                    int columnDisplaySize = data.getColumnDisplaySize(i);
 51.                    // 默认的列的标题 
52.                    String columnLabel = data.getColumnLabel(i);
 53.                    // 获得列的模式 
54.                    String schemaName = data.getSchemaName(i);
 55.                    // 某列类型的精确度(类型的长度) 
56.                    int precision = data.getPrecision(i);
 57.                    // 小数点后的位数 
58.                    int scale = data.getScale(i);
 59.                    // 获取某列对应的表名 
60.                    String tableName = data.getTableName(i);
 61.                    // 是否自动递增 
62.                    boolean isAutoInctement = data.isAutoIncrement(i);
 63.                    // 在数据库中是否为货币型 
64.                    boolean isCurrency = data.isCurrency(i);
 65.                    // 是否为空 
66.                    int isNullable = data.isNullable(i);
 67.                    // 是否为只读 
68.                    boolean isReadOnly = data.isReadOnly(i);
 69.                    // 能否出现在where中 
70.                    boolean isSearchable = data.isSearchable(i);
 71.                    //System.out.println(columnCount);
 72.                    //System.out.println("获得列" + i + "的字段名称:" + columnName);
 73.                    //System.out.println("获得列" + i + "的字段值:" + columnValue);
 74.                    //System.out.println("获得列" + i + "的类型,返回SqlType中的编号:"
 75.                            + columnType);
 76.                    //System.out.println("获得列" + i + "的数据类型名:" + columnTypeName);
 77.                    //System.out.println("获得列" + i + "所在的Catalog名字:"
 78.                            + catalogName);
 79.                    //System.out.println("获得列" + i + "对应数据类型的类:"
 80.                            + columnClassName);
 81.                    //System.out.println("获得列" + i + "在数据库中类型的最大字符个数:"
 82.                            + columnDisplaySize);
 83.                    //System.out.println("获得列" + i + "的默认的列的标题:" + columnLabel);
 84.                    //System.out.println("获得列" + i + "的模式:" + schemaName);
 85.                    System.out
 86.                            .println("获得列" + i + "类型的精确度(类型的长度):" + precision);
 87.                    //System.out.println("获得列" + i + "小数点后的位数:" + scale);
 88.                    //System.out.println("获得列" + i + "对应的表名:" + tableName);
 89.                    //System.out.println("获得列" + i + "是否自动递增:" + isAutoInctement);
 90.                    //System.out.println("获得列" + i + "在数据库中是否为货币型:" + isCurrency);
 91.                    //System.out.println("获得列" + i + "是否为空:" + isNullable);
 92.                    //System.out.println("获得列" + i + "是否为只读:" + isReadOnly);
 93.                    //System.out.println("获得列" + i + "能否出现在where中:"
 94.                            + isSearchable);
 */

public class TableFactory {
	private Connection connection;
	private static TableFactory instance = null;
	private Map<String, String> typeMap = null;
	private TableFactory() {
		  configTypeMap();
	}
	
    private void configTypeMap() {
    	this.typeMap = new HashMap<String, String>();
    	this.typeMap.put("double", "Double");
    	this.typeMap.put("float", "Double");
    	this.typeMap.put("bigint", "Integer");
    	this.typeMap.put("mediumint", "Integer");
    	this.typeMap.put("smallint", "Integer");
    	this.typeMap.put("decimal", "Integer");
    	this.typeMap.put("tinyint", "Integer");
    	this.typeMap.put("int", "Integer");
    	this.typeMap.put("char", "String");
    	this.typeMap.put("varchar", "String");
    	this.typeMap.put("varchar2", "String");
    	this.typeMap.put("text", "String");
    	this.typeMap.put("blob", "String");
    	this.typeMap.put("clob", "String");
    	this.typeMap.put("binary", "String");
    	this.typeMap.put("datetime", "Date");
    	this.typeMap.put("date", "Date");
    	this.typeMap.put("timestamp", "Date");
    	this.typeMap.put("numberwithinteger", "Integer");
    	this.typeMap.put("numberwithlong", "Long");
    	this.typeMap.put("numberwithdouble", "Double");
    	
//    	
//    	
//    	this.typeMap.put("double", "double");
//    	this.typeMap.put("float", "float");
//    	this.typeMap.put("bigint", "long");
//    	this.typeMap.put("mediumint", "int");
//    	this.typeMap.put("smallint", "int");
//    	this.typeMap.put("decimal", "int");
//    	this.typeMap.put("tinyint", "int");
//    	this.typeMap.put("int", "int");
//    	this.typeMap.put("char", "String");
//    	this.typeMap.put("varchar", "String");
//    	this.typeMap.put("varchar2", "String");
//    	this.typeMap.put("text", "String");
//    	this.typeMap.put("blob", "String");
//    	this.typeMap.put("binary", "String");
//    	this.typeMap.put("datetime", "Date");
//    	this.typeMap.put("date", "Date");
//    	this.typeMap.put("timestamp", "Date");
//    	this.typeMap.put("number", "double");
//    	
    }
	private void loadJdbcDriver() {
		String driver = GeneratorProperties.jdbcDriver;
		try{
				Class.forName(driver); //.newInstance();
		} catch (ClassNotFoundException e) {
			throw new RuntimeException("not found jdbc driver class:["+driver+"]",e);
		}
	}
	
	public synchronized static TableFactory getInstance() {
		if(instance == null) instance = new TableFactory();
		return instance;
	}
	
	public String getCatalog() {
		return null;
	}

	public String getSchema() {
		return GeneratorProperties.schema;
	}

	public Connection getConnection() {
		Properties props =new Properties();
		props.put("user", GeneratorProperties.username);         // Set user ID for connection
		props.put("password", GeneratorProperties.password);     // Set password for connection
		props.put("remarksReporting","true");
		props.put("ResultSetMetaDataOptions","1");
		try{
			if(connection == null || connection.isClosed()) {
				loadJdbcDriver();
				connection = DriverManager.getConnection(GeneratorProperties.jdbcUrl,props);
			}
			return connection;
		}catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	

	public  List<Table> getTables(String sqlortable,String virtualtable) throws Throwable {
		if(sqlortable.startsWith("select"))
		{
			return getTableListBySql(sqlortable,virtualtable);
		}else{
			return getTableList(sqlortable);
		}
	}
	
	public  List<Table> getTablesByModel(String basePackageName) throws Throwable {
		HashMap<String,Class> classNames = ClassScan.scanBasePackage(basePackageName);
		System.out.println(classNames);
		List<Table> tablelist=new ArrayList<Table>();
		for(String key:classNames.keySet())
		{
			Table e=new Table();
			Class myclass=classNames.get(key);
			Annotation model = myclass.getDeclaredAnnotation(Model.class);
			//过滤掉非model的类
			if(model==null)
			{
				continue;
			}
			String className=myclass.getName().substring(myclass.getName().lastIndexOf('.'));
			e.setClassName(className);
			e.setRemarks(className);
			e.setTableComments(className);
			e.setType("table");
			e.setSqlName(className);
			
			List<Column> columns=new ArrayList<Column>();
			System.out.println("class:"+myclass.getName());
			Field[] aaa = myclass.getDeclaredFields();
			for(Field f:aaa)
			{
				//    				getModifiers	
//					PUBLIC: 1
//					PRIVATE: 2
//					PROTECTED: 4
//					STATIC: 8
//					FINAL: 16
//					SYNCHRONIZED: 32
//					VOLATILE: 64
//					TRANSIENT: 128
//					NATIVE: 256
//					INTERFACE: 512
//					ABSTRACT: 1024
//					STRICT: 2048]
				
				
				Column col=new Column();
				col.setColumnName(className);
				col.setComments(className);
				col.setDbcolumnName(className);
				col.setFieldName(className);
				col.setTypeName(f.getType().getName());
				col.setColumnSize("10");
				String isPk=f.getType().getDeclaredAnnotation(Id.class)!=null?"true":"false";
				col.setIsPk(isPk);
				col.setTypeName(f.getType().getName());
				columns.add(col);
				System.out.println("field:"+f.getType()+"  "+f.getName()+"  "+f.getModifiers());
			}
			e.setColumns(columns);
			tablelist.add(e);
		}
		return tablelist;
	}
	
	
	public  List<Table> getTables(String sqlortable) throws Throwable {
		if(sqlortable.startsWith("select"))
		{
			return getTableListBySql(sqlortable,"MyModel");
		}else{
			return getTableList(sqlortable);
		}
	}
	
	
	public  List<Table> getTableList(String tablename) throws Throwable {
		preDealTable(tablename);
		getSchemaRecoredset();
		Recordset tablers=getTablesRecoredset(tablename);
		List<Table> arraylist=new ArrayList<Table>();
		tablers.top();
		while(tablers.next())
		{
			Table table = new Table();
			table.setSqlName(tablers.getString("table_name").toLowerCase());
			table.setClassName(getCalssName(tablers.getString("table_name")));
			table.setRemarks(tablers.getString("remarks"));
			table.setType(tablers.getString("table_type"));
			table.setColumns(getColumnList(table.getSqlName()));
			//String comments=getTableComment(tablename);
			String comments=tablers.getString("table_name").toLowerCase();
			if(tablers.getString("remarks")!=null)
			{
				comments=tablers.getString("remarks");
			}
			table.setTableComments(comments);
			arraylist.add(table);
		}
		return arraylist;
	}
	
	
	public  List<Table> getTableListBySql(String sql,String tablename) throws Throwable {
		ResultSet rs1 = getConnection().createStatement().executeQuery(sql);
		ResultSetMetaData  rs=rs1.getMetaData();
		
		List<Table> arraylist=new ArrayList<Table>();
		Table table = new Table();
		table.setType("sqltable");
		table.setSqlName(tablename.toLowerCase());
		table.setClassName(getCalssName(tablename));
		table.setRemarks(tablename.toLowerCase());
		table.setTableComments("");
		List<Column> columnlist=new ArrayList<Column>();
		for(int i=1;i<rs.getColumnCount();i++)
		{
			Column col=new Column();
			col.setColumnName(rs.getColumnName(i).toLowerCase());
			col.setDbcolumnName(rs.getColumnName(i));
			col.setColumnSize(new Integer(rs.getColumnDisplaySize(i)).toString());
			//col.setTypeName(rs.getColumnTypeName(i).toLowerCase());
			col.setIsPk("false");
			col.setComments(rs.getColumnName(i).toLowerCase());
			col.setFieldName(getFeildName(rs.getColumnName(i).toLowerCase()));
			//System.out.println("columnName:"+rs.getColumnName(i).toLowerCase()+" ColumnTypeName:"+rs.getColumnTypeName(i).toLowerCase()+"  Scale:"+rs.getScale(i)+" Precision:"+rs.getPrecision(i)+" ColumnDisplaySize:"+rs.getColumnDisplaySize(i)+" ColumnLabel:"+rs.getColumnLabel(i));
			
			if(rs.getColumnTypeName(i).toLowerCase().equals("number")){
				if(rs.getScale(i)>=0)
				{
					//有小数点
					col.setTypeName(this.typeMap.get("numberwithdouble"));
				}else{
					if(rs.getPrecision(i)>10)
					{
						col.setTypeName(this.typeMap.get("numberwithlong"));
					}
					else
					{
						col.setTypeName(this.typeMap.get("numberwithinteger"));
					}
				}
			}
			else
			{
				col.setTypeName(this.typeMap.get(rs.getColumnTypeName(i).toLowerCase()));
			}
			
			//System.out.println("typename---------"+col.getTypeName());
			columnlist.add(col);
		}
		table.setColumns(columnlist);
		arraylist.add(table);
		return arraylist;
	}
	
	
	public void preDealTable(String table) throws SQLException
	{
		    List<Column>  collist=getColumnList(table);
		    boolean haspk=false;
			for(Column col:collist)
			{
				if("true".equals(col.getIsPk()))
				{
					haspk=true;
				}
			}
			if(!haspk)
			{
				//createPk(table);
			}
			createVersion(table);
	}
	
	public  List<Table> getTableList() throws Throwable {
		getSchemaRecoredset();
		Recordset tablers=getTablesRecoredset();
		List<Table> arraylist=new ArrayList<Table>();
		while(tablers.next())
		{
			Table table = new Table();
			table.setSqlName(tablers.getString("table_name"));
			table.setClassName(getCalssName(tablers.getString("table_name")));
			table.setRemarks(tablers.getString("remarks"));
			table.setType(tablers.getString("table_type"));
			table.setColumns(getColumnList(table.getSqlName()));
			arraylist.add(table);
		}
		return arraylist;
	}
	
	
	
	
	public DatabaseMetaData getMetaData() throws SQLException {
		return getConnection().getMetaData();
	}
	
	
	public Recordset getSchemaRecoredset() throws SQLException{
			//System.out.println(getCatalog()+" "+getSchema());
		  DatabaseMetaData dbMetaData = getMetaData();
		  ResultSet rs = dbMetaData.getSchemas();
		  Recordset recordset=null;
		  try{
			    recordset = new Recordset(rs);
			    RecordTool.printRecordSet(recordset);
		  } catch (Throwable e) {
				e.printStackTrace();
		  }
		return recordset;
	}
	
	
	public Recordset getTablesRecoredset(String table) throws SQLException{
		  //System.out.println(getCatalog()+" "+getSchema()+" "+table.toUpperCase());
		  DatabaseMetaData dbMetaData = getMetaData();
		  ResultSet rs = dbMetaData.getTables(getCatalog(), getSchema(), table.toUpperCase(), null);
		  Recordset recordset=null;
		  try{
			    recordset = new Recordset(rs);
			    RecordTool.printRecordSet(recordset);
		  } catch (Throwable e) {
				e.printStackTrace();
		  }
		return recordset;
	}
	
//	public Recordset getTablesRecoredsetBySql(String sql) throws SQLException{
//		  ResultSetMetaData rs =getConnection().createStatement().executeQuery(sql).getMetaData();
//		  rs.getTableName(1);
//		  Recordset recordset=null;
//		  try{
//			    recordset = new Recordset();
//			    RecordTool.printRecordSet(recordset);
//		  } catch (Throwable e) {
//				e.printStackTrace();
//		  }
//		return recordset;
//	}
//	
	
	public Recordset getTablesRecoredset() throws SQLException{
		
		  DatabaseMetaData dbMetaData = getMetaData();
		  ResultSet rs = dbMetaData.getTables(getCatalog(), getSchema(), null, null);
		  Recordset recordset=null;
		  try{
			    recordset = new Recordset(rs);
			    RecordTool.printRecordSet(recordset);
		  } catch (Throwable e) {
				e.printStackTrace();
		  }
		  return recordset;
	}
	
	
	public List<Column> getColumnList(String table) throws SQLException {
			   Recordset record=getColumnsRecordset(table);
			   List<Column> colList=new ArrayList();
			   List<String> primaryKeysList=getPrimaryKeysColumnList(table);
			   HashMap<String,String> commnetsmap=getColumnsCommentHashMap(table);
			   while(record.next())
			   {
				   try {
					    Column col=new Column();
						col.setColumnName(record.getString("column_name").toLowerCase());
						col.setDbcolumnName(record.getString("column_name"));
						col.setFieldName(getFeildName(record.getString("column_name").toLowerCase()));
						col.setColumnSize(record.getString("column_size").toLowerCase());
						
//						if(record.getString("decimal_digits")!=null)
//						{
//							if(Integer.parseInt(record.getString("decimal_digits"))>0)
//							{
//								col.setTypeName(this.typeMap.get("numberwithdouble"));
//							}else
//							{
//								if(Integer.parseInt(record.getString("column_size"))>10)
//								{
//									col.setTypeName(this.typeMap.get("numberwithlong"));
//								}else{
//									col.setTypeName(this.typeMap.get("numberwithinteger"));
//								}
//							}
//						}else{
//							col.setTypeName(this.typeMap.get(record.getString("type_name").toLowerCase()));
//						}
						
						if(record.getString("type_name").equals("NUMBER"))
						{
							if(record.getString("decimal_digits")!=null)
							{
								if(Integer.parseInt(record.getString("decimal_digits"))>0)
								{
									col.setTypeName(this.typeMap.get("numberwithdouble"));
								}else
								{
									if(Integer.parseInt(record.getString("column_size"))>10)
									{
										col.setTypeName(this.typeMap.get("numberwithlong"));
									}else{
										col.setTypeName(this.typeMap.get("numberwithinteger"));
									}
								}
							}else{
								//视图查询的时候为null
								col.setTypeName(this.typeMap.get("numberwithdouble"));
							}
						}else{
							col.setTypeName(this.typeMap.get(record.getString("type_name").toLowerCase()));
						}
						
						String comment=commnetsmap.get(record.getString("column_name").toLowerCase())==null?record.getString("column_name").toLowerCase():commnetsmap.get(record.getString("column_name").toLowerCase());
						if(record.getString("remarks")!=null)
						{
							comment=record.getString("remarks");
						}
						
						col.setComments(comment);
						//this.typeMap.get(record.getString("type_name").toLowerCase())
						if(primaryKeysList.contains(record.getString("column_name").toLowerCase()))
						{
							col.setIsPk("true");
						}else
						{
							col.setIsPk("false");
						}
						//System.out.println(col);
						colList.add(col);
					} catch (Throwable e) {
						e.printStackTrace();
					}
			   }
			   return colList;
	}
	
	public List<String> getPrimaryKeysColumnList(String table) throws SQLException {
		   Recordset primaryKeys=getPrimaryKeysColumnsRecordset(table);
		   List<String> resultList=new ArrayList<String>();
		   while(primaryKeys.next())
		   {
			   try {
				   resultList.add(primaryKeys.getString("column_name").toLowerCase());
				} catch (Throwable e) {
					e.printStackTrace();
				}
		   }
		   return resultList;
	}
	
	public Recordset getColumnsRecordset(String table) throws SQLException {
	      ResultSet rs = getMetaData().getColumns(getCatalog(), getSchema(), table.toUpperCase(), null);
	      Recordset recordset=null;
		  try{
			    recordset = new Recordset(rs);
			    RecordTool.printRecordSet(recordset);
		  } catch (Throwable e) {
				e.printStackTrace();
		  }
		   rs.close();
		   return recordset;
	}
	
	
	public HashMap<String,String> getColumnsCommentHashMap(String table) throws SQLException {
		   Recordset result=getColumnsComment(table);
		   HashMap<String,String>  map=new HashMap<String,String>();
		   while(result.next())
		   {
			   try {
				   map.put(result.getString("column_name").toLowerCase(),result.getString("comments"));
				} catch (Throwable e) {
					e.printStackTrace();
				}
		   }
		   return map;
	}
	
	public Recordset getColumnsComment(String table) throws SQLException {
	  Db db=new Db(getConnection());
      Recordset recordset = null;
		 try {
			 	recordset = db.get("select * from user_col_comments t where t.table_name ='"+table.toUpperCase()+"'");
			    RecordTool.printRecordSet(recordset);
			    return recordset;
		  } catch (Throwable e) {
				e.printStackTrace();
		  }
		return recordset;
	}
	
	public void createPk(String table) throws SQLException {
		  String column=getColumByColname(table,"tuid");
		  Db db=new Db(getConnection());
		  if(column==null)
		  {
			  table=table.trim();
			 
			  try{
				  db.exec("alter table "+table+" add tuid varchar2(1000)");
			  } catch (Throwable e) {
					e.printStackTrace();
			  }
		  }
		  try{
			  //System.out.println("添加约束!!!!!!!!!!!!!");
			  db.exec("alter table "+table+" add constraint "+table+"_pk primary key (tuid)");
		  } catch (Throwable e) {
				e.printStackTrace();
		  }
	}
	
	public void createVersion(String table) throws SQLException {
		  String column=getColumByColname(table,"curversion");
		  Db db=new Db(getConnection());
		  if(column==null)
		  {
			  table=table.trim();
			  try{
				  db.exec("alter table "+table+" add   curversion NUMBER(16) default 0 ");
			  } catch (Throwable e) {
					e.printStackTrace();
			  }
		  }
	}
	
	
	private String getColumByColname(String table,String colname) throws SQLException {
		 List<Column>  collist=getColumnList(table);
		 for(Column col:collist)
		 {
			 if(col.columnName.equals(colname))
			 {
				 return colname;
			 }
		 }
		return null;
	}

	public String getTableComment(String table) throws SQLException {
		  Db db=new Db(getConnection());
	      Recordset recordset = null;
			 try {
				 	recordset = db.get("select b.comments from user_tab_comments b where b.TABLE_NAME='"+table.toUpperCase()+"'");
				    RecordTool.printRecordSet(recordset);
				    while(recordset.next())
				    {
				    	 return recordset.getString("comments");
				    }
			  } catch (Throwable e) {
					e.printStackTrace();
			  }
			return null;
	}

	public Recordset getPrimaryKeysColumnsRecordset(String table) throws SQLException {
		  ResultSet rs = getMetaData().getPrimaryKeys(getCatalog(), getSchema(), table.toUpperCase());
	      Recordset recordset=null;
		  try{
			    recordset = new Recordset(rs);
			    RecordTool.printRecordSet(recordset);
		  } catch (Throwable e) {
				e.printStackTrace();
		  }
		   rs.close();
		   return recordset;
	}
	
	
	private String getCalssName(final String tableName) {
        String tempClassName = tableName.toLowerCase();
        StringBuilder className = new StringBuilder();
        if (tempClassName.indexOf("_") == -1) {
            className.append(tempClassName.substring(0, 1).toUpperCase());
            if (tempClassName.length() >= 2) {
                className.append(tempClassName.substring(1));
            }
        } else {
            String[] temp = tempClassName.split("_");
            for (int i = 0; i < temp.length; i++) {
                className.append(temp[i].substring(0, 1).toUpperCase());
                if (temp[i].length() >= 2) {
                    className.append(temp[i].substring(1));
                }
            }
        }
        return className.toString();
    }

    private String getFeildName(String colum) {
        StringBuilder feild = new StringBuilder();
        colum = colum.toLowerCase();
        if (colum.indexOf("_") == -1) {
            feild.append(colum);
        } else {
            String[] temp = colum.split("_");
            for (int i = 0; i < temp.length; i++) {
                if (i == 0) {
                    feild.append(temp[i]);
                } else {
                    String firstLatter = temp[i].substring(0, 1).toUpperCase();
                    feild.append(firstLatter);
                    if (temp[i].length() >= 2) {
                        feild.append(temp[i].substring(1, temp[i].length()));
                    }
                }
            }
        }
        return feild.toString();
    }
    
	
}
