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
		   		document.forms["form1"].action="${ctx}/com/bxtel/bxcashbackaudit/controller/bxcashbackauditt/showadd.do";
		   		document.forms["form1"].target="list_iframe";
		   		document.forms["form1"].submit();
		   }
		   
		   function sys_list()
		   {
		   		document.forms["form1"].action="${ctx}/com/bxtel/bxcashbackaudit/controller/bxcashbackauditt/showlist.do";
		   		document.forms["form1"].target="list_iframe";
		   		document.forms["form1"].submit();
		   }
		</script>
    </head>

    <body>
		<div class="tabBlock">
			<div class="editBlock">
			
			<form id="form1" action="${ctx}/com/bxtel/bxcashbackaudit/controller/bxcashbackauditt/showlist.do" target="list_iframe">
			
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
									                <label>会员用户id</label>
									            </th>
									            <td>
									                <input id="userid" name="userid" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>certificatestypeid</label>
									            </th>
									            <td>
									                <input id="certificatestypeid" name="certificatestypeid" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>证件号码（默认身份证）</label>
									            </th>
									            <td>
									                <input id="certificatesno" name="certificatesno" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>银行名称</label>
									            </th>
									            <td>
									                <input id="bankname" name="bankname" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>支行名称</label>
									            </th>
									            <td>
									                <input id="branchbankname" name="branchbankname" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>银行卡号</label>
									            </th>
									            <td>
									                <input id="bankcardno" name="bankcardno" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>bankaccountname</label>
									            </th>
									            <td>
									                <input id="bankaccountname" name="bankaccountname" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>连续会员月份，截止当月</label>
									            </th>
									            <td>
									                <input id="membercontinuemonth" name="membercontinuemonth" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>总连续会员月份，包括已缴费的未来月份</label>
									            </th>
									            <td>
									                <input id="membertotalmonth" name="membertotalmonth" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>返现金额</label>
									            </th>
									            <td>
									                <input id="cashbackamount" name="cashbackamount" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>0-待审核 1-审核通过待返现 2-审核不通过 3-返现成功 4-返现失败  20.返现中（防止重复提交返现请求）</label>
									            </th>
									            <td>
									                <input id="status" name="status" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>审核人，审核</label>
									            </th>
									            <td>
									                <input id="auditor" name="auditor" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>审核日期</label>
									            </th>
									            <td>
									                <input id="auditdate" name="auditdate" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>备注，审核不通过原因放在这里，返现失败原因放在这里；累加</label>
									            </th>
									            <td>
									                <input id="remark" name="remark" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>createdate</label>
									            </th>
									            <td>
									                <input id="createdate" name="createdate" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>createby</label>
									            </th>
									            <td>
									                <input id="createby" name="createby" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>lastupdatedate</label>
									            </th>
									            <td>
									                <input id="lastupdatedate" name="lastupdatedate" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>lastupdateby</label>
									            </th>
									            <td>
									                <input id="lastupdateby" name="lastupdateby" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>扣减积分</label>
									            </th>
									            <td>
									                <input id="reduceintegral" name="reduceintegral" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>10 返现  20积分</label>
									            </th>
									            <td>
									                <input id="cashbaktype" name="cashbaktype" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>充值到什么地方 ，0.银行卡   1支付宝    2.手机余额  3.QQ币</label>
									            </th>
									            <td>
									                <input id="ifalipay" name="ifalipay" class="inputText" type="text" maxlength="40"/> 
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
									                <label>当银行卡提现时判断是否录入了银行卡提现的相关信息.0为未填,1为已填.默认为0.</label>
									            </th>
									            <td>
									                <input id="param" name="param" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>暂定为银行卡提现交易号录入（例如支付宝交易号，银行转账交易号之类）</label>
									            </th>
									            <td>
									                <input id="param1" name="param1" class="inputText" type="text" maxlength="40"/> 
									            </td>
									        </tr>
											<tr>
									            <th  width="20%">
									                <!--span class="warning" >&nbsp;*&nbsp;</span>-->
									                <label>暂定为我方转出行的信息录入</label>
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