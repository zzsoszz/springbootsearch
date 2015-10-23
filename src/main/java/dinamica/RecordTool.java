package dinamica;

import java.sql.Types;
import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import dinamica.Db;
import dinamica.Record;
import dinamica.Recordset;
import dinamica.RecordsetException;
import dinamica.RecordsetField;
import dinamica.util.StringUtil;

public class RecordTool
{

//	public static void printRecordSet(Recordset recordset)
//	{
//		Map map = recordset.getFields();
//
//		List<Map.Entry<String, String>> infoIds = new ArrayList<Map.Entry<String, String>>(
//				map.entrySet());
//
//		Collections.sort(infoIds, new Comparator<Map.Entry<String, String>>()
//		{
//			public int compare(Map.Entry<String, String> o1,
//					Map.Entry<String, String> o2)
//			{
//				return (o1.getKey()).toString().compareTo(o2.getKey());
//			}
//		});
//
//		//表头
//		Iterator iter = map.entrySet().iterator();
//		while (iter.hasNext())
//		{
//			Map.Entry entry = (Map.Entry) iter.next();
//			Object key = entry.getKey();
//			System.out.print((String) key + "   ");
//		}
//		//System.out.println();
//
//		//数据
//		//System.out.println("行数 :" + recordset.getRecordCount());
//		recordset.top();
//		ArrayList list = recordset.getData();
//		for (int i = 0; i < list.size(); i++)
//		{
//
//			Record r = (Record) list.get(i);
//			Map map2 = recordset.getFields();
//			Iterator iter2 = map2.entrySet().iterator();
//			while (iter2.hasNext())
//			{
//				Map.Entry entry = (Map.Entry) iter2.next();
//				String key = (String) entry.getKey();
//				try
//				{
//					System.out.print(r.getFieldValue(key) + "   ");
//				}
//				catch (RecordsetException e)
//				{
//					e.printStackTrace();
//				}
//			}
//			//System.out.println();
//		}
//		recordset.top();
//	}

	
	
	public static Recordset convertMapToRecordset(Map map) throws Throwable
	{
		Recordset rs=new Recordset();
		//表头
		Iterator iter = map.entrySet().iterator();
		while (iter.hasNext())
		{
			Map.Entry entry = (Map.Entry) iter.next();
			String key =(String)entry.getKey();
			if(key!=null && !"".equals(key))
			{
				rs.append(key.toLowerCase(), java.sql.Types.VARCHAR);
			}
		}
		rs.addNew();
		Iterator iter2 = map.entrySet().iterator();
		while (iter2.hasNext())
		{
			Map.Entry entry = (Map.Entry) iter2.next();
			String key =(String)entry.getKey();
			if(key!=null && !"".equals(key))
			{
				rs.setValue(key.toLowerCase(), map.get(key));
			}
		}
		rs.first();
		return rs;
	}
	
	public static void printRecordSet(Recordset recordset)
	{
		Map map = recordset.getFields();

		List<Map.Entry<String, String>> infoIds = new ArrayList<Map.Entry<String, String>>(
				map.entrySet());

		Collections.sort(infoIds, new Comparator<Map.Entry<String, String>>()
		{
			public int compare(Map.Entry<String, String> o1,
					Map.Entry<String, String> o2)
			{
				return (o1.getKey()).toString().compareTo(o2.getKey());
			}
		});

		//表头
		Iterator iter = map.entrySet().iterator();
		while (iter.hasNext())
		{
			Map.Entry entry = (Map.Entry) iter.next();
			Object key = entry.getKey();
			System.out.print((String) key + "   ");
		}
		//System.out.println();

		//数据
		//System.out.println("行数 :" + recordset.getRecordCount());
		recordset.top();
		ArrayList list = recordset.getData();
		for (int i = 0; i < list.size(); i++)
		{

			Record r = (Record) list.get(i);
			Iterator iter2 = map.entrySet().iterator();
			while (iter2.hasNext())
			{
				Map.Entry entry = (Map.Entry) iter2.next();
				String key = (String) entry.getKey();
				try
				{
					System.out.print(r.getFieldValue(key) + "   ");
				}
				catch (RecordsetException e)
				{
					e.printStackTrace();
				}
			}
			//System.out.println();
		}
		recordset.top();
	}
	
	
	
	public static String recordsetToString(Recordset recordset) throws Throwable
	{
		Map map = recordset.getFields();

		List<Map.Entry<String, String>> infoIds = new ArrayList<Map.Entry<String, String>>(
				map.entrySet());

		Collections.sort(infoIds, new Comparator<Map.Entry<String, String>>()
		{
			public int compare(Map.Entry<String, String> o1,
					Map.Entry<String, String> o2)
			{
				return (o1.getKey()).toString().compareTo(o2.getKey());
			}
		});
		
		StringBuffer sb=new StringBuffer();
		recordset.top();
		ArrayList list = recordset.getData();
		for (int i = 0; i < list.size(); i++)
		{
			Record r = (Record) list.get(i);
			Iterator iter2 = map.entrySet().iterator();
			while (iter2.hasNext())
			{
				Map.Entry entry = (Map.Entry) iter2.next();
				String key = (String) entry.getKey();
				try
				{
					sb.append(key+":"+r.getFieldValue(key) + "   ");
				}
				catch (RecordsetException e)
				{
					e.printStackTrace();
				}
			}
			sb.append("\n\r");
			//System.out.println();
		}
		recordset.first();
		
		return sb.toString();
	}
	
	public static void saveRecordSetToDB(Recordset recordset,Db db,String tablename)
	{

		Map map = recordset.getFields();

		List<Map.Entry<String, String>> infoIds = new ArrayList<Map.Entry<String, String>>(
				map.entrySet());

		Collections.sort(infoIds, new Comparator<Map.Entry<String, String>>()
		{
			public int compare(Map.Entry<String, String> o1,
					Map.Entry<String, String> o2)
			{
				return (o1.getKey()).toString().compareTo(o2.getKey());
			}
		});

		//表头
		Iterator iter = map.entrySet().iterator();

		String insert_into_field="";
		while (iter.hasNext())
		{
			Map.Entry entry = (Map.Entry) iter.next();
			Object key = entry.getKey();
			String field=(String) key;
			insert_into_field+=field+",";
			System.out.print(field + "   ");
		}
		insert_into_field=insert_into_field.substring(0, insert_into_field.length()-1);
		//System.out.println();
		
		//数据
		//System.out.println("行数 :" + recordset.getRecordCount());
		recordset.top();
		ArrayList list = recordset.getData();
		for (int i = 0; i < list.size(); i++)
		{

			Record r = (Record) list.get(i);
			Map map2 = recordset.getFields();
			Iterator iter2 = map2.entrySet().iterator();

			String insert_into_value="";
			
			while (iter2.hasNext())
			{
				Map.Entry entry = (Map.Entry) iter2.next();
				String key = (String) entry.getKey();
				try
				{
					System.out.print(r.getFieldValue(key) + "   ");
					insert_into_value+="'"+r.getFieldValue(key)+"',";
				}
				catch (RecordsetException e)
				{
					e.printStackTrace();
				}
			}
			insert_into_value=insert_into_value.substring(0, insert_into_value.length()-1);
			String insert_into_sql="insert into "+tablename+" ( "+insert_into_field+" ) values ( "+insert_into_value+" )";
			try 
			{
				db.exec(insert_into_sql);
			} catch (Throwable e) {
				e.printStackTrace();
			}
			//System.out.println();
		}
		recordset.top();
	}
	
	
	public static Recordset copyRecordset(Recordset source)
	{
		Recordset dest = null;
		try {
			dest = copyStructure(source);
			source.top();
			while (source.next()) 
			{
				dest.addNew();
				try {
					source.copyValues(dest);
				} catch (Throwable e) {
					e.printStackTrace();
				}
			}
			source.top();
		} catch (Throwable e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return dest;
	}

	public static void setColumnValue(Recordset recordset,String fieldName,Object object)
	{
		recordset.top();
		while(recordset.next()) 
		{
			try {
				recordset.setValue(fieldName, object);
			} catch (RecordsetException e) {
				e.printStackTrace();
			}
		}
		recordset.top();
	}
	
	public static void printRecordSetUseOrder(Recordset recordset)
	{
		Map map = recordset.getFields();

		List<Map.Entry<String, RecordsetField>> infoIds = new ArrayList<Map.Entry<String, RecordsetField>>(
				map.entrySet());

		Collections.sort(infoIds,
				new Comparator<Map.Entry<String, RecordsetField>>()
				{
					public int compare(Map.Entry<String, RecordsetField> o1,
							Map.Entry<String, RecordsetField> o2)
					{
						return (o1.getKey()).toString().compareTo(o2.getKey());
					}
				});

		//System.out.println("行数 :" + recordset.getRecordCount());
		
		//表头
		for (int i = 0; i < infoIds.size(); i++)
		{
			String key = infoIds.get(i).getKey();
			System.out.print(key + "   ");
		}
		//System.out.println();
		//数据
		recordset.top();
		ArrayList list = recordset.getData();
		for (int i = 0; i < list.size(); i++)
		{
			Record r = (Record) list.get(i);
			try
			{
				for (int j = 0; j < infoIds.size(); j++)
				{
					String key = infoIds.get(j).getKey();
					System.out.print(r.getFieldValue(key) + "   ");
				}
				//System.out.println();
			}
			catch (RecordsetException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		recordset.top();
	}

	// public static void printArrayList(ArrayList<Record> list)
	// {
	// for(int i=0;i<list.size();i++)
	// {
	// Record record=list.get(i);
	// }
	// }
	//	
	
	
	public void sort(Recordset source,String field,String asc_or_Desc)
	{
		class SortRecord
		{
			Record record;
			SortRecord(Record record)
			{
				this.record=record;
			}
		}
		
	}
	
	public static void main(String args[]) throws Throwable
	{

//		Recordset testrs = new Recordset();
//		try
//		{
//			// testrs.append("loop_unit_id",java.sql.Types.VARCHAR);
//			// testrs.append("2010-04-01",java.sql.Types.VARCHAR);
//			// testrs.append("2010-04-02",java.sql.Types.VARCHAR);
//			// testrs.append("2010-04-03",java.sql.Types.VARCHAR);
//			// testrs.append("2010-04-04",java.sql.Types.VARCHAR);
//			// testrs.append("2010-04-05",java.sql.Types.VARCHAR);
//			// testrs.append("2010-04-06",java.sql.Types.VARCHAR);
//			// testrs.append("2010-04-07",java.sql.Types.VARCHAR);
//			// testrs.append("2010-04-08",java.sql.Types.VARCHAR);
//			//			
//			//
//			//			
//			// testrs.addNew();
//			// testrs.setValue("loop_unit_id", "123");
//			// testrs.setValue("2010-04-01", "4373801");
//			// testrs.setValue("2010-04-01", "4373801");
//			// testrs.setValue("2010-04-02", "4373801");
//			// testrs.setValue("2010-04-03", "4373801");
//			// testrs.setValue("2010-04-04", "4373801");
//			//			
//			// testrs.addNew();
//			// testrs.setValue("loop_unit_id", "123");
//			// testrs.setValue("2010-04-01", "4373817");
//			// testrs.setValue("2010-04-02", "4373817");
//			// testrs.setValue("2010-04-03", "4373817");
//			// testrs.setValue("2010-04-04", "4373817");
//			//			
//			// testrs.addNew();
//			// testrs.setValue("loop_unit_id", "123");
//			// testrs.setValue("2010-04-01", "4373841");
//			// testrs.setValue("2010-04-02", "4373841");
//			// testrs.setValue("2010-04-03", "4373841");
//			// testrs.setValue("2010-04-04", "4373841");
//			//	
//
//			testrs.append("loop_unit_id", java.sql.Types.VARCHAR);
//
//			for (int i = 0; i < 9; i++)
//			{
//				testrs.append("2010-04-0" + i + "", java.sql.Types.VARCHAR);
//				RecordTool.printRecordSetUseOrder(testrs);
//			}
//			RecordTool.printRecordSetUseOrder(testrs);
//		}
//		catch (RecordsetException e)
//		{
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		// printRecordSet(testrs);
//		// printWtsTableByName(testrs);
//		// int a[] =
//		// { 0, 2, 3, 3, 5, 7, 4 };
//		// for (int i = 0; i < a.length; i++)
//		// {
//		// for (int j = 0; j < a.length; j++)
//		// {
//		// if (a[i] < a[j])
//		// {
//		// int temp = a[i];
//		// a[i] = a[j];
//		// a[j] = temp;
//		// }
//		// }
//		// }
//		//		
//		// for (int j = 0; j < a.length; j++)
//		// {
//		// //System.out.println(a[j]);
//		// }

		HashMap map=new HashMap();
		map.put("aaa", "222222222");
		map.put("bbb", "3333");
		map.put("ccc", "44");
		map.put("ddd", "55");
		
		RecordTool.printRecordSet(RecordTool.convertMapToRecordset(map));
	}

	public static void printAarray(String str[]) throws Throwable
	{
		for (int i = 0; i < str.length; i++)
		{
			//System.out.println(str[i]);
		}
	}

	public static Recordset copyStructure(Recordset source)
	{
		Recordset result = new Recordset();
		Recordset sourcetemp = new Recordset();

		try
		{
			sourcetemp = source.getMetaData();

			if (sourcetemp != null)
			{
				sourcetemp.top();
				while (sourcetemp.next())
				{
					if (sourcetemp.getInt("typeid") == java.sql.Types.NUMERIC) // Numeric
					{
						result.append(sourcetemp.getString("name"),
								java.sql.Types.DOUBLE);
					} else if (sourcetemp.getInt("typeid") == java.sql.Types.CHAR) // CHAR
					{
						result.append(sourcetemp.getString("name"),
								java.sql.Types.VARCHAR);
					} else
					{
						result.append(sourcetemp.getString("name"), sourcetemp
								.getInt("typeid"));
					}

				}

			}
		}
		catch (Throwable e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return result;

	}

	public static Recordset noMatch(Recordset source, String columName,
			String Value)
	{
		Recordset result = RecordTool.copyStructure(source);
		try
		{
			source.top();
			while (source.next())
			{

				if (!source.getString(columName).equals(Value))
				{
					result.addNew();
					source.copyValues(result);
				}
			}
			source.top();
		}
		catch (Throwable e)
		{
			e.printStackTrace();
		}

		return result;
	}
	
	
	public static Recordset Match(Recordset source, String columName,
			String Value)
	{
		Recordset result = RecordTool.copyStructure(source);
		try
		{
			source.top();
			while (source.next())
			{

				if (source.getString(columName).equals(Value))
				{
					result.addNew();
					source.copyValues(result);
				}
			}
			source.top();
		}
		catch (Throwable e)
		{
			e.printStackTrace();
		}

		return result;
	}
	
	
	public static  String[] getArrayByColumnName(Recordset recordset,String arrayName) throws RecordsetException
	{
		
		String[] columnArray = new String[recordset.getRecordCount()];
		ArrayList recordData=recordset.getData();
		for(int d=0;d<recordData.size();d++)
		{
			Record record=(Record)recordData.get(d);
			columnArray[d]=record.getFieldValue(arrayName).toString();
		}
		return columnArray;
		
	}
	
	public  static int getIndexByColumnNameValue(Recordset recordset,String columnName,String value) throws RecordsetException
	{
		int Index=-1;
		ArrayList recordData=recordset.getData();
		for(int d=0;d<recordData.size();d++)
		{
			Record record=(Record)recordData.get(d);
			if(record.getFieldValue(columnName).equals(value))
			{
				Index=d;
			}
		}
		return Index;
	}
	
	public static void saveArrayToRecordset(Recordset recordset, String columnName,String[] colArray) throws Throwable {
		ArrayList data = recordset.getData();
		for (int i = 0; i < colArray.length; i++) {
			((Record) data.get(i)).setValue(columnName, colArray[i]);
		}
	}
	
	
	
	public static  String getTemplateResult(String _template,Recordset rs) throws Throwable
	{
			rs.first();
			String fidld="";
			
			if (rs!=null)
			{
				/* get recordset metadata */
				HashMap flds = rs.getFields();
			
				/* for each field try to replace value */
				Iterator i = flds.values().iterator();
				while (i.hasNext())
				{
				
					RecordsetField f = (RecordsetField)i.next();
					String fname = f.getName();
					Object value = rs.getValue(fname);
					fidld=" fname:"+fname+" fvalue:"+value;
					String marker = "${fld:" + fname + "}";
					
					if (value==null)
					{
						_template = StringUtil.replace(_template, marker, "NULL");
					}
					else
					{
						switch (f.getType())
						{
							case Types.VARCHAR:
							case Types.CHAR:
							case Types.LONGVARCHAR:
								
								String v = (String)value;
								v = StringUtil.replace(v,"'","''");
								_template = StringUtil.replace(_template, marker, "'" + v + "'");
								break;
							
							case Types.DATE:
								java.util.Date d = (java.util.Date)value;
								_template = StringUtil.replace(_template, marker, "{d '" + StringUtil.formatDate(d, "yyyy-MM-dd") + "'}");
								break;
							
							case Types.TIMESTAMP:
								java.util.Date d1 = (java.util.Date)value;
								_template = StringUtil.replace(_template, marker, "{ts '" + StringUtil.formatDate(d1, "yyyy-MM-dd HH:mm:ss:SSS") + "'}");
								break;
							
							default:
								String n = String.valueOf(value);
								_template = StringUtil.replace(_template, marker, n);
								break;
								
						}
					}
				
				}
			}
			
			rs.first();
			return _template;
	}
	
	
	
}
