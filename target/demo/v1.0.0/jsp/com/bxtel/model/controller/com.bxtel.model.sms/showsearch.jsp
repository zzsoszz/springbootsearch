<%@ page language="java" pageEncoding="UTF-8"%>  
<html>
    <head>
    	<title>查询qrtz_triggers_v</title>
    	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    	
    	<%@ include file="/com/bxtel/commons/jsplib.jsp"%>
		<link rel="stylesheet" type="text/css" href="${ctx}/css/task/main.css" />
	    <script type="text/javascript"  src="${ctx}/js/jquery/jquery-1.6.2.min.js"></script>
		<script src="${ctx}/js/jquery/jquery-validate/jquery.validate.js" type="text/javascript"></script>
		<script src="${ctx}/js/jquery/jquery-validate/jquery.metadata.js" type="text/javascript"></script>
		<script src="${ctx}/js/jquery/jquery-validate/jquery.validate.util.js" type="text/javascript"></script>
		<script src="${ctx}/js/jquery/jquery-validate/localization/messages_cn.js" type="text/javascript"></script>
		<script src="${ctx}/js/iframe_resize/js/iframe.js" type="text/javascript"></script>
        <script type="text/javascript">

        	$(document).ready(
        			 function(){
        				 
	     		     		$("#form1").validate(
	     		     			{
	     		    		 		//debug:false,
	     		    				//errorClass: "error",
	     		    				//validClass: "check",
	     		    				//focusInvalid: true,
	     		    				//focusCleanup:true;
	     		    				onkeyup: true,
	     		    				//errorElement: "div",
	     		    		 		submitHandler: function(form)
	     		    		  		{ 
	     		    						alert("bak");
	     		    				}
	     		    			}
	     		     		);
	     		       		
	     		     }
        	
        	);
		   
		   
    	   function sys_add()
		   {
		   		document.forms["form1"].action="${ctx}/com/bxtel/model/controller/com.bxtel.model.sms/showadd.do";
		   		document.forms["form1"].target="list_iframe";
		   		document.forms["form1"].submit();
		   }
		   
		   function sys_list()
		   {
		   		document.forms["form1"].action="${ctx}/com/bxtel/model/controller/com.bxtel.model.sms/showlist.do";
		   		document.forms["form1"].target="list_iframe";
		   		document.forms["form1"].submit();
		   }
		</script>
    </head>

    <body>
		<div class="tabBlock">
			<div class="editBlock">
			
			<form id="form1" action="${ctx}/com/bxtel/model/controller/com.bxtel.model.sms/showlist.do" target="list_iframe">
			
							<table id="table1" >
							    <tr>
							        <td colspan="4" class="subtitle">&nbsp;&nbsp;&nbsp;
							            <label>查询条件</label>
							        </td>
							    </tr>
							    <tbody>

											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>id</label>
									            </th>
									            <td>
									                <input id="id" name="id" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>mobile</label>
									            </th>
									            <td>
									                <input id="mobile" name="mobile" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>content</label>
									            </th>
									            <td>
									                <input id="content" name="content" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>msgid</label>
									            </th>
									            <td>
									                <input id="msgid" name="msgid" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>status</label>
									            </th>
									            <td>
									                <input id="status" name="status" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
							    </tbody>
							</table>
							
							<div class="ctrlBar" >
						        &nbsp;&nbsp;<input  type="button" onclick="sys_list();"  class="inputButton" value="查询"/>
								&nbsp;&nbsp;<input  type="reset"  class="inputButton" value="重置"/>
								&nbsp;&nbsp;<input  type="button" onclick="sys_add();"  class="inputButton" value="新增"/>
						    </div>
			    
			</form>
			
			</div>
			</div>
			
			
			<div class="tabBlock">
			<div class="editBlock">
						<iframe name="list_iframe" id="list_iframe" style="display:block;" width="100%" height="0px"  scrolling="no"  frameborder="0" >
						</iframe>
			</div>
			</div>

    </body>


</html>