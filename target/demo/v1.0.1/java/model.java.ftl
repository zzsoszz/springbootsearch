package ${packageName}.model;
import ${packageName}.*;
import java.util.*;
public class ${table.className}  
{
	
	<#list table.columns as column>
		 public ${column.typeName} ${column.fieldName};//${column.comments}
	</#list>
		public String totalCount;
		public String crowid;
	
		
	<#list table.columns as column>
		 public void set${column.fieldName?cap_first}(${column.typeName} ${column.fieldName})
		 {
		 	this.${column.fieldName}=${column.fieldName};
		 }
		 public ${column.typeName} get${column.fieldName?cap_first}()
		 {
		 	return this.${column.fieldName};
		 }
	</#list>
	
	
		public String getTotalCount() {
			return totalCount;
		}
		public void setTotalCount(String totalCount) {
			this.totalCount = totalCount;
		}
		
		public String getCrowid() {
			return crowid;
		}
		public void setCrowid(String crowid) {
			this.crowid = crowid;
		}
		
		
	/*
	<#list table.columns as column>
		 model.set${column.fieldName?cap_first}("${column.fieldName}value");
	</#list>
	<#list table.columns as column>
		 model.get${column.fieldName?cap_first}();
	</#list>
	*/
}

