package dinamica.generator;


public class Column {
	/*
	 * 数据库信息
	 */
	String columnName;
	String columnSize;
	String typeName;
	String isPk;
	String comments;
	
	/*
	 * 根据数据库的信息转换的
	 */
	String dbcolumnName;//数据库原始字段名字
	String fieldName;//生成类的字段名
	
	
	public String getDbcolumnName() {
		return dbcolumnName;
	}
	public void setDbcolumnName(String dbcolumnName) {
		this.dbcolumnName = dbcolumnName;
	}
	public String getFieldName() {
		return fieldName;
	}
	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}
	public String getIsPk() {
		return isPk;
	}
	public void setIsPk(String isPk) {
		this.isPk = isPk;
	}
	public String getColumnName() {
		return columnName;
	}
	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}
	public String getColumnSize() {
		return columnSize;
	}
	public void setColumnSize(String columnSize) {
		this.columnSize = columnSize;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public String toString() {
		return "字段名:"+fieldName+"  列名:"+columnName+"  类型:"+typeName+"  大小:"+columnSize+"  是否主键:"+isPk;
	}

}
