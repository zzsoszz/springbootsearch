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
		   		document.forms["form1"].action="${ctx}/com/bxtel/bxsupportedcard/controller/bxsupportedcardt/showadd.do";
		   		document.forms["form1"].target="list_iframe";
		   		document.forms["form1"].submit();
		   }
		   
		   function sys_list()
		   {
		   		document.forms["form1"].action="${ctx}/com/bxtel/bxsupportedcard/controller/bxsupportedcardt/showlist.do";
		   		document.forms["form1"].target="list_iframe";
		   		document.forms["form1"].submit();
		   }
		</script>
    </head>

    <body>
		<div class="tabBlock">
			<div class="editBlock">
			
			<form id="form1" action="${ctx}/com/bxtel/bxsupportedcard/controller/bxsupportedcardt/showlist.do" target="list_iframe">
			
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
									                <label>tuid</label>
									            </th>
									            <td>
									                <input id="tuid" name="tuid" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>transtype</label>
									            </th>
									            <td>
									                <input id="transtype" name="transtype" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>bankcode</label>
									            </th>
									            <td>
									                <input id="bankcode" name="bankcode" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>cardtype</label>
									            </th>
									            <td>
									                <input id="cardtype" name="cardtype" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>curversion</label>
									            </th>
									            <td>
									                <input id="curversion" name="curversion" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>sourcetype</label>
									            </th>
									            <td>
									                <input id="sourcetype" name="sourcetype" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>param1</label>
									            </th>
									            <td>
									                <input id="param1" name="param1" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>param2</label>
									            </th>
									            <td>
									                <input id="param2" name="param2" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>param3</label>
									            </th>
									            <td>
									                <input id="param3" name="param3" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>param4</label>
									            </th>
									            <td>
									                <input id="param4" name="param4" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>param5</label>
									            </th>
									            <td>
									                <input id="param5" name="param5" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>param6</label>
									            </th>
									            <td>
									                <input id="param6" name="param6" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>param7</label>
									            </th>
									            <td>
									                <input id="param7" name="param7" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>param8</label>
									            </th>
									            <td>
									                <input id="param8" name="param8" class="inputText" type="text" maxlength="40"/> 
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