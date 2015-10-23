package dinamica.generator;


import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;


public class Table {
	String sqlName;
	String className;
	String type;
	String remarks;
	String tableComments;
	
	List<Column> columns = new ArrayList<Column>();
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSqlName() {
		return sqlName;
	}
	public void setSqlName(String sqlName) {
		this.sqlName = sqlName;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public List<Column> getColumns() {
		return columns;
	}
	public void setColumns(List<Column> columns) {
		this.columns = columns;
	}

	public String getTableComments() {
		return tableComments;
	}
	public void setTableComments(String tableComments) {
		this.tableComments = tableComments;
	}

	
	public String toString() {
		//System.out.println("表"+sqlName+"类"+className);
		for(Column t:columns)
		{
			//System.out.println(t);
		}
		return "";
	}
}
