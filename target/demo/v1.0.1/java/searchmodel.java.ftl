package ${packageName}.model;
import ${packageName}.*;
import java.util.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "database", type = "${table.className}?lower_case", shards = 1, replicas = 0, refreshInterval = "-1")
public class ${table.className}  
{
	
		 @Id
		 private String indexid;
		
	<#list table.columns as column>
		 public ${column.typeName} ${column.dbcolumnName};//${column.comments}
	</#list>
	
	<#list table.columns as column>
		 public void set${column.dbcolumnName?cap_first}(${column.typeName} ${column.dbcolumnName})
		 {
		 	this.${column.dbcolumnName}=${column.dbcolumnName};
		 }
		 public ${column.typeName} get${column.dbcolumnName?cap_first}()
		 {
		 	return this.${column.dbcolumnName};
		 }
	</#list>
	
	/*
	<#list table.columns as column>
		 model.set${column.dbcolumnName?cap_first}("${column.dbcolumnName}value");
	</#list>
	<#list table.columns as column>
		 model.get${column.dbcolumnName?cap_first}();
	</#list>
	*/
}

