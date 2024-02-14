<%--
 * W1006.jsp
 * 
 *
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 --%>
<script type="text/javascript"><!--
$(function() {
    $('#tablefix').tablefix({height: 360, fixRows: 2});
});
//--></script>
<html:form action="/W1006Init" styleId="mainForm">
  <table class="gscm_search">
    <colgroup>
      <col class="search_request_no" />
      <col class="search_shipper" />
      <col class="search_consignee" />
      <col class="search_ship_to" />
      <col class="search_trans" />
      <col class="search_weight_unit" />
      <col class="search_total_id_tag" />
    </colgroup>
    <tr>
     		<th>
                <bean:message key="label.requestNo" />
            </th>
            <th>
                <bean:message key="label.shipper" />
            </th>
            <th>
                <bean:message key="label.consignee" />
            </th>
            <th>
                <bean:message key="label.nexusShipTo" />
            </th>
            <th>
                <bean:message key="label.trans" />
            </th>
            <th>
                <bean:message key="label.W1006.weightUnit" />
            </th>
            <th>
                <bean:message key="label.totalIdTag" />
            </th>
    </tr>
    <tr>
     		<td style="OVERFLOW: hidden;">
                <bean:write name="W1006Form" property="w1006CriteriaDomain.expRequestNo" />
            </td>
            <td style="OVERFLOW: hidden;">
                 <bean:write name="W1006Form" property="w1006CriteriaDomain.shipperCd" />
            </td>
            <td style="OVERFLOW: hidden;">
            	 <bean:write name="W1006Form" property="w1006CriteriaDomain.consigneeCd" />
            </td>
            <td style="OVERFLOW: hidden;">
            	<bean:write name="W1006Form" property="w1006CriteriaDomain.shipToCd" />
            </td>
            <td style="OVERFLOW: hidden;">
          		<bean:write name="W1006Form" property="w1006CriteriaDomain.trnsCd" />
            </td>
            <td align="right" style="OVERFLOW: hidden;">
            	<bean:write name="W1006Form" property="w1006CriteriaDomain.weightUnit" />
            </td>
            <td align="right" style="OVERFLOW: hidden;">
            	<bean:write name="W1006Form" property="w1006CriteriaDomain.totalIdTag" />
            </td>
    </tr>
  </table>
  <table class="gscm_search">
       <tr>
            <th>
                <bean:message key="label.fmLine" />
            </th>
            <th>
                <bean:message key="label.toLine" />
            </th>
            <th>
                <bean:message key="label.description" />
            </th>
            <th>
                <bean:message key="label.itemNo" />
            </th>
            <th>
                <bean:message key="label.kit" />
            </th>
        </tr>
        
        <tr>
            <td>
                <html:text property="w1006CriteriaDomain.fmLine" maxlength="3" styleClass="fm_line"  errorStyleClass="fm_line gscm_error_class" />
            </td>
            <td>
                <html:text property="w1006CriteriaDomain.toLine" maxlength="3" styleClass="to_line"  errorStyleClass="to_line gscm_error_class" />
            </td>
            <td>
                <html:text property="w1006CriteriaDomain.description" maxlength="100"  styleClass="description_cd" errorStyleClass="description_cd gscm_error_class" />
            </td>
            <td>
                <html:text property="w1006CriteriaDomain.itemNo" maxlength="27" styleClass="item_no"  errorStyleClass="item_no gscm_error_class" />
            </td>
            <td>
                <html:select property="w1006CriteriaDomain.kit" styleClass="kit" >
                    <html:options collection="flag" property="id" labelProperty="name"/>
                </html:select>
            </td>
        </tr>
    </table>
  <table class="gscm_search_button">
    <tr>
      <td>
		<html:button property="search" onclick="gscm.submitSearch('W1006Search.do', this.form, '');" styleClass="search">
			<bean:message key="button.search" />
		</html:button>
      </td>
      <td class="right">
      	<html:button property="backToMainScreen" onclick="gscm.submitBack('W1001Init.do', this.form);" styleClass="backToMainScreen">
			<bean:message key="button.backToMainScreen" />
        </html:button>
      </td>
    </tr>
  </table>
  <hr />
  <table class="gscm_resultlist_button" >
    <tr>
      <td>
		<html:button property="register" onclick="gscm.commonSubmit('W1006Register.do', this.form);" styleClass="register">
		  <bean:message key="button.register" />
        </html:button>
		<html:button property="printApprovalSheet" onclick="gscm.commonSubmitForCheck('W1006PrintAppSheet.do', this.form, 'false', 'false');" styleClass="print_approval_sheet">
		  <bean:message key="button.printApprovalSheet" />
        </html:button>
		<html:button property="printInspectionSlip" onclick="gscm.commonSubmitForCheck('W1006PrintInspectSlip.do', this.form, 'false', 'false');" styleClass="print_inspection_slip">
		  <bean:message key="button.printInspectionSlip" />
        </html:button>
		<html:button property="printIdTag" onclick="gscm.commonSubmitForCheck('W1006PrintIdTag.do', this.form, 'false', 'false');" styleClass="print_id_tag">
		  <bean:message key="button.printIdTag" />
        </html:button>
      </td>
      <td class="right">
		<html:button property="moveToPkg" styleClass="moveToPkg" onclick="allcheck('listDomainList', 'selected', false);gscm.commonSubmit('W1006MoveToPackaging.do', this.form);">
          <bean:message key="button.moveToPkg" />
        </html:button>
		<html:button property="backToDescription" onclick="doMoveToDescription('W1003Init.do', this.form);" styleClass="backToDescription">
		  <bean:message key="button.backToDescription" />
        </html:button>
      </td>
    </tr>
  </table>
  		
	   <logic:notEmpty name="W1006Form" property="listDomainList" >
	  	<%--
   		-- page control
        --%>
        <table class="gscm_resultlist_button" >
            <colgroup>
                <col />
            </colgroup>
            <tr>
                <td class="right" style="padding-right: 20px;">
                    <%@ include file="/WEB-INF/jsp/includes/gscm/framework/pager.jspf"%>
                </td>
            </tr>
        </table>
         <%--
        -- search results
        --%>
	  	<table id="tablefix" class="gscm_resultlist">
			<colgroup>
		      <col class="resultlist_print" />
		      <col class="resultlist_line" />
		      <col class="resultlist_item" style="width: 60px"/>
		      <col class="resultlist_customer_no" />
		      <col class="resultlist_item_no" />
		      <col class="resultlist_product_name" style="width: 20px"/>
		      <col class="resultlist_pkg_cd" />
		      <col class="resultlist_co" />
		      <col class="resultlist_qty" />
		      <col class="resultlist_um" />
		      <col class="resultlist_unit_price" />
		      <col class="resultlist_cr" />
		      <col class="resultlist_nw" />
		      <col class="resultlist_kit" />
		      <col class="resultlist_no_child" />
		      <col class="resultlist_comm" />
		      <col class="resultlist_rt" />
		      <col class="resultlist_location" />
		      <col class="resultlist_constrution" />
	    	</colgroup>
	    	<thead>
			<tr>
			  <th rowspan="2" align="left"><bean:message key="label.print" /><br />
			   	<center><input type="checkbox" name="checkAll" onclick="allcheck('listDomainList', 'selected', this.checked)"></center>
			  </th>
			  <th align="left"><bean:message key="label.line" /></th>
			  <th align="left"><bean:message key="label.subLine" /></th>
			  <th colspan="2" align="left"><bean:message key="label.customerOrderNo" /></th>
			  <th colspan="8" align="left"><bean:message key="label.prod" /></th>
			  <th align="left"><bean:message key="label.kit" /></th>
			  <th colspan="2" align="left"><bean:message key="label.noOfChild" /></th>
			  <th align="left"><bean:message key="label.rt" /></th>
			  <th colspan="2" align="left"><bean:message key="label.dgGoodsImExCtrl" /></th>
			</tr>
			<tr>
			  <th colspan="3" align="left"><bean:message key="label.customerItemNo" /></th>
			  <th colspan="2" align="left"><bean:message key="label.itemNoChildItemNo" /></th>
			  <th align="left"><bean:message key="label.pkgCd" /></th>
	          <th align="left"><bean:message key="label.co" /></th>
	          <th align="left"><bean:message key="label.qty" /></th>
	          <th align="left"><bean:message key="label.um" /></th>
	          <th align="left"><bean:message key="label.unitPrice" /></th>
	          <th align="left"><bean:message key="label.cr" /></th>
	          <th align="left" colspan="3"><bean:message key="label.netWeight" /></th>
	          <th align="left"><bean:message key="label.comm" /></th>
	          <th align="left"><bean:message key="label.rEx" /></th>
	          <th align="left"><bean:message key="label.location" /></th>
	          <th align="left"><bean:message key="label.construction" /></th>
			</tr>
	    	</thead>
	   		<tbody>
			<logic:iterate name="W1006Form" property="listDomainList" id="listDomainList" indexId="idx">
			  <ai:stripeline number="${idx + 1}" odd="gscm_odd" even="gscm_odd">
			  <html:hidden property="expRequestNo" />
			  <html:hidden property="expRequestItemId" />
			  	<c:choose>
				        <c:when test="${listDomainList.status=='parent' }">
				            <tr style="background-color: #eff7fd; height: 20px">
				            	<c:choose>
							        <c:when test="${listDomainList.haveCheckBox }">
							           <td rowspan="2" align="center"> <html:checkbox name="listDomainList" property="selected"  indexed="true" /></td>
							        </c:when>
							        <c:otherwise>
							            <td rowspan="2" align="center"> </td>
							        </c:otherwise>
							    </c:choose>
				                <td style="OVERFLOW: hidden;"><bean:write name="listDomainList" property="lineNo" /></td>
				                <td style="OVERFLOW: hidden;"><html:text name="listDomainList" property="item"  styleClass="w1006_item gscm_disptext" readonly="true" /></td>
				                <td colspan="2" style="OVERFLOW: hidden;"><html:text name="listDomainList" property="customerPoNo"  styleClass="w1006_customerPoNo gscm_disptext" readonly="true" /></td>
				                <td colspan="8" style="OVERFLOW: hidden;"><html:text name="listDomainList" property="description"  styleClass="w1006_description_cd gscm_disptext" readonly="true" /></td>
				                <td style="OVERFLOW: hidden;"><html:text name="listDomainList" property="kitParFlg"  styleClass="w1006_kitParFlg gscm_disptext" readonly="true" /></td>
				                <td colspan="2" align="right" style="OVERFLOW: hidden;"><html:text name="listDomainList" property="noOfChild"  styleClass="w1006_noOfChild gscm_disptext" readonly="true" /></td>
				                <td style="OVERFLOW: hidden;"><html:text name="listDomainList" property="rtUseFlg"  styleClass="w1006_rtUseFlg gscm_disptext" readonly="true" /></td>
				                <td colspan="2" style="OVERFLOW: hidden;"><html:text name="listDomainList" property="dngrGoodsImpExpCtrl"  styleClass="w1006_dngrGoodsImpExpCtrl gscm_disptext" readonly="true" /></td>
						    </tr>
						   	<tr style="background-color: #eff7fd; height: 20px">
								<td colspan="3" style="OVERFLOW: hidden;"><html:text name="listDomainList" property="customerItemNo"  styleClass="w1006_customerItemNo gscm_disptext" readonly="true" /></td>
				                <td colspan="2" style="OVERFLOW: hidden;"><html:text name="listDomainList" property="itemNo"  styleClass="w1006_itemNo gscm_disptext" readonly="true" /></td>
				                <td style="OVERFLOW: hidden;"><html:text name="listDomainList" property="pkgCd"  styleClass="w1006_pkgCd gscm_disptext" readonly="true" /></td>
				                <td style="OVERFLOW: hidden;"><html:text name="listDomainList" property="originCntryCd"  styleClass="w1006_originCntryCd gscm_disptext" readonly="true" /></td>
				                <td align="right" style="OVERFLOW: hidden;"><html:text name="listDomainList" property="qty"  styleClass="w1006_qty gscm_disptext" readonly="true" /></td>
				                <td align="left" style="OVERFLOW: hidden;"><html:text name="listDomainList" property="qtyUnit"  styleClass="w1006_qtyUnit gscm_disptext" readonly="true" /></td>
				                <td align="right" style="OVERFLOW: hidden;"><html:text name="listDomainList" property="unitPrice" styleClass="w1006_unitPrice gscm_disptext" readonly="true" /></td>
				                <td align="left" style="OVERFLOW: hidden;"><html:text name="listDomainList" property="currCd"  styleClass="w1006_currCd gscm_disptext" readonly="true" /></td>
				                <td colspan="3" align="right" style="OVERFLOW: hidden;"><html:text name="listDomainList" property="netWeight"  styleClass="w1006_netWeight gscm_disptext" readonly="true" /></td>
				                <td style="OVERFLOW: hidden;"><html:text name="listDomainList" property="commercialFlg"  styleClass="w1006_commercialFlg gscm_disptext" readonly="true" /></td>
				                <td style="OVERFLOW: hidden;"><html:text name="listDomainList" property="reExpGoodsFlg"  styleClass="w1006_reExpGoodsFlg gscm_disptext" readonly="true" /></td>
				                <td style="OVERFLOW: hidden;"><html:text name="listDomainList" property="locationNo"  styleClass="w1006_locationNo gscm_disptext" readonly="true" /></td>
				                <td style="OVERFLOW: hidden;"><html:text name="listDomainList" property="constructionWorkNo"  styleClass="w1006_constructionWorkNo gscm_disptext" readonly="true" /></td>
						    </tr>
				        </c:when>
				        <c:otherwise>
				            <tr style="height: 20px">
				            	<c:choose>
							        <c:when test="${listDomainList.haveCheckBox }">
							           <td rowspan="2" align="center"> <html:checkbox name="listDomainList" property="selected"  indexed="true" /></td>
							        </c:when>
							        <c:otherwise>
							            <td rowspan="2" align="center"> </td>
							        </c:otherwise>
							    </c:choose>
				                <td style="OVERFLOW: hidden;"><bean:write name="listDomainList" property="lineNo" /></td>
				                <td style="OVERFLOW: hidden;"><html:text name="listDomainList" property="item"  styleClass="w1006_item gscm_disptext" readonly="true" /></td>
				                <td colspan="2" style="OVERFLOW: hidden;"><html:text name="listDomainList" property="customerPoNo"  styleClass="w1006_customerPoNo gscm_disptext" readonly="true" /></td>
				                <td colspan="8" style="OVERFLOW: hidden;"><html:text name="listDomainList" property="description"  styleClass="w1006_description_cd gscm_disptext" readonly="true" /></td>
				                <td style="OVERFLOW: hidden;"><html:text name="listDomainList" property="kitParFlg"  styleClass="w1006_kitParFlg gscm_disptext" readonly="true" /></td>
				                <td colspan="2" align="right" style="OVERFLOW: hidden;"><html:text name="listDomainList" property="noOfChild"  styleClass="w1006_noOfChild gscm_disptext" readonly="true" /></td>
				                <td style="OVERFLOW: hidden;"><html:text name="listDomainList" property="rtUseFlg"  styleClass="w1006_rtUseFlg gscm_disptext" readonly="true" /></td>
				                <td colspan="2" style="OVERFLOW: hidden;"><html:text name="listDomainList" property="dngrGoodsImpExpCtrl" styleClass="w1006_dngrGoodsImpExpCtrl gscm_disptext" readonly="true" /></td>
						    
						    </tr>
						   	<tr style="height: 20px"> 
								<td colspan="3" style="OVERFLOW: hidden;"><html:text name="listDomainList" property="customerItemNo" styleClass="w1006_customerItemNo gscm_disptext" readonly="true" /></td>
				                <td colspan="2" style="OVERFLOW: hidden;"><html:text name="listDomainList" property="itemNo"  styleClass="w1006_itemNo gscm_disptext" readonly="true" /></td>
				                <td style="OVERFLOW: hidden;"><html:text name="listDomainList" property="pkgCd"  styleClass="w1006_pkgCd gscm_disptext" readonly="true" /></td>
				                <td style="OVERFLOW: hidden;"><html:text name="listDomainList" property="originCntryCd"  styleClass="w1006_originCntryCd gscm_disptext" readonly="true" /></td>
				                <td align="right" style="OVERFLOW: hidden;"><html:text name="listDomainList" property="qty"  styleClass="w1006_qty gscm_disptext" readonly="true" /></td>
				                <td align="left" style="OVERFLOW: hidden;"><html:text name="listDomainList" property="qtyUnit"  styleClass="w1006_qtyUnit gscm_disptext" readonly="true" /></td>
				                <td align="right" style="OVERFLOW: hidden;"><html:text name="listDomainList" property="unitPrice"  styleClass="w1006_unitPrice gscm_disptext" readonly="true" /></td>
				                <td align="left" style="OVERFLOW: hidden;"><html:text name="listDomainList" property="currCd"  styleClass="w1006_currCd gscm_disptext" readonly="true" /></td>
				                <td colspan="3" align="right" style="OVERFLOW: hidden;"><html:text name="listDomainList" property="netWeight"  styleClass="w1006_netWeight gscm_disptext" readonly="true" /></td>
				                <td style="OVERFLOW: hidden;"><html:text name="listDomainList" property="commercialFlg"  styleClass="w1006_commercialFlg gscm_disptext" readonly="true" /></td>
				                <td style="OVERFLOW: hidden;"><html:text name="listDomainList" property="reExpGoodsFlg"  styleClass="w1006_reExpGoodsFlg gscm_disptext" readonly="true" /></td>
				                <td style="OVERFLOW: hidden;"><html:text name="listDomainList" property="locationNo"  styleClass="w1006_locationNo gscm_disptext" readonly="true" /></td>
				                <td style="OVERFLOW: hidden;"><html:text name="listDomainList" property="constructionWorkNo"  styleClass="w1006_constructionWorkNo gscm_disptext" readonly="true" /></td>
						    
						    </tr>
				        </c:otherwise>
				</c:choose>
					
			  </ai:stripeline>
			</logic:iterate>
	    </tbody>
	  </table>
	  </logic:notEmpty>
	  <html:hidden property="callScreenId" />
	  <html:hidden property="fromScreenId" />
</html:form>