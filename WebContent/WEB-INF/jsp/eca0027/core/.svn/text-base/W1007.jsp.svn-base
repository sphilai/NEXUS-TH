<%--
 * W1007.jsp
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
<html:form action="/W1007Init" styleId="mainForm">
<input type="hidden" name="chk">
  <table class="gscm_search">
    <colgroup>
    <col class="search_request_no" />
    <col class="search_shipper" />
    <col class="search_consignee" />
    <col class="search_ship_to" />
    <col class="search_wh_com" />
    <col class="search_wh_cd" />
    <col class="search_trans" />
    <col class="search_weight_unit" />
    <col class="search_export_req_status" />
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
                <bean:message key="label.whCompCd" />
            </th>
            <th>
                <bean:message key="WT010.label.whCd" />
            </th>
            <th>
                <bean:message key="label.trans" />
            </th>
            <th>
                <bean:message key="label.wgtUnit" />
            </th>
            <th>
                <bean:message key="label.exportRequestStatus" />
            </th>
    </tr>
    <tr>
     		<td>
                <bean:write name="W1007Form" property="w1007CriteriaDomain.expRequestNo" />
            </td>
            <td>
                 <bean:write name="W1007Form" property="w1007CriteriaDomain.shipperCd" />
            </td>
            <td>
            	 <bean:write name="W1007Form" property="w1007CriteriaDomain.consigneeCd" />
            </td>
            <td>
            	<bean:write name="W1007Form" property="w1007CriteriaDomain.shipToCd" />
            </td>
            <td>
            	<bean:write name="W1007Form" property="w1007CriteriaDomain.packingCompCd" />
            </td>
            <td>
            	<bean:write name="W1007Form" property="w1007CriteriaDomain.packingWhCd" />
            </td>
            <td>
          		<bean:write name="W1007Form" property="w1007CriteriaDomain.trnsCd" />
            </td>
            <td>
            	<bean:write name="W1007Form" property="w1007CriteriaDomain.weightUnit" />
            </td>
            <td>
            	<bean:write name="W1007Form" property="w1007CriteriaDomain.requestStatus" />
            </td>
    </tr>
  </table>
  <table class="gscm_search">
    <colgroup>
      <col class="search_status" />
      <col class="search_fm_line_no" />
      <col class="search_to_line_no" />
      <col class="search_item_no" />
      <col class="search_description" />
      <col class="search_pallet_no" />
      <col class="search_cml_no" />
      <col class="search_order_by" />
    </colgroup>
    <tr>
      <th><bean:message key="label.status" /></th>
      <th><bean:message key="label.fmLineNo" /></th>
      <th><bean:message key="label.toLineNo" /></th>
      <th><bean:message key="label.itemNoChildNo" /></th>
      <th><bean:message key="label.description" /></th>
      <th><bean:message key="label.palletNo" /></th>
      <th><bean:message key="label.mainMark" /></th>
      <th><bean:message key="label.orderBy" /></th>
    </tr>
    <tr>
      <td>
         <html:select property="w1007CriteriaDomain.packingStatus" styleClass="packingStatus" >
                <html:options collection="packingStatus" property="id" labelProperty="name"/>
        </html:select>
      </td>
      <td>
        <html:text property="w1007CriteriaDomain.fmLine" maxlength="3" styleClass="fm_line_no" errorStyleClass="fm_line_no gscm_error_class" />
      </td>
      <td>
        <html:text property="w1007CriteriaDomain.toLine" maxlength="3" styleClass="to_line_no" errorStyleClass="to_line_no gscm_error_class" />
      </td>
      <td>
        <html:text property="w1007CriteriaDomain.itemNo" maxlength="27" styleClass="item_no" errorStyleClass="item_no gscm_error_class" />
      </td>
      <td>
        <html:text property="w1007CriteriaDomain.description" maxlength="100" styleClass="description" errorStyleClass="description gscm_error_class" />
      </td>
      <td>
        <html:text property="w1007CriteriaDomain.palletNo" maxlength="4" styleClass="pallet_no" errorStyleClass="pallet_no gscm_error_class" />
      </td>
      <td>
        <html:text property="w1007CriteriaDomain.cmlNo" maxlength="20" styleClass="cml_no" errorStyleClass="cml_no gscm_error_class" />
      </td>
      <td>
 		<html:select property="w1007CriteriaDomain.orderBy" styleClass="orderBy" >
                <html:options collection="orderBy" property="id" labelProperty="name"/>
        </html:select>
      </td>
    </tr>
  </table>
  <table class="gscm_search_button">
    <colgroup>
      <col width="50%" />
      <col />
    </colgroup>
    <tr>
      <td>
      	  <html:button property="search" onclick="gscm.submitSearch('W1007Search.do', this.form, '')" styleClass="search">
			<bean:message key="button.search" />
          </html:button>
      </td>
      <td class="right">
      		<html:button property="moveToRegister" onclick="gscm.commonSubmit('W1007MoveToRegister.do', this.form)" styleClass="moveToRegister">
			<bean:message key="button.backToRegister" />
          </html:button>
     	  <html:button property="backToMainScreen" onclick="gscm.submitBack('W1001Init.do', this.form)" styleClass="back_to_main_screen">
			<bean:message key="button.backToMainScreen" />
          </html:button>
      </td>
    </tr>
  </table>
  <hr />
  <table class="gscm_resultlist_button">
    <tr>
      <th align="left"><bean:message key="label.receiving" /></th>
      <th align="left"><bean:message key="label.updatePalletNo" /></th>
      <th align="left"><bean:message key="label.casemark" /></th>
      <th align="left"><bean:message key="label.printingSupport" /></th>
    </tr>
    <tr>
      <td>
        <div class="button_box" style="height: 63px">
          <html:button property="receive" onclick="validateChecker();gscm.submitSearch('W1007Receive.do', this.form, '')" styleClass="receive">
			<bean:message key="button.receive" />
          </html:button>
          <br/>
          <html:button property="cancelReceive" onclick="validateChecker();gscm.submitSearch('W1007Cancel.do', this.form, '')" styleClass="cancel_receive">
			<bean:message key="button.cancelReceive" />
          </html:button>
          <html:button property="receiveAll" onclick="gscm.submitSearch('W1007ReceiveAll.do', this.form, '')" styleClass="receive_all">
			<bean:message key="button.receiveAll" />
          </html:button>
        </div>
      </td>
      <td>
        <span class="button_box">
          <html:button property="update" onclick="gscm.submitSearch('W1007Update.do', this.form, '')" styleClass="update">
			<bean:message key="button.update" />
          </html:button>
        </span>
      </td>
      <td>
        <span class="button_box" >
        	<html:button property="confirmCmlDetail" onclick="gscm.submitSearch('W1007MoveToCML.do', this.form, '')" styleClass="confirm_cml_detail">
				<bean:message key="button.confirmCmlDetail" />
          	</html:button>
        </span>
      </td>
      <td>
        <div class="button_box" style="height: 63px">
          <span class="no_of_cml"><bean:message key="label.noOfCML" /></span>
          <html:select property="w1007CriteriaDomain.noOfCML" styleClass="noOfCML" >
                <html:options collection="noOfCML" property="id" labelProperty="name"/>
          </html:select>
          <html:button property="print_all" onclick="checkPrintCML( this.form);" styleClass="print_all">
				<bean:message key="button.printAllCML" />
          </html:button>
          <html:button property="print_inspect_sheet" onclick="gscm.commonSubmitForCheck('W1007PrintInspectSlip.do', this.form, 'false', 'false');" styleClass="print_inspect_sheet">
				<bean:message key="button.printInspectSheet" />
          </html:button>
          <html:button property="printIdTag" onclick="gscm.commonSubmitForCheck('W1007PrintIdTag.do', this.form, 'false', 'false');" styleClass="print_id_tag">
				<bean:message key="button.printIdTag" />
          </html:button>
          
        </div>
      </td>
    </tr>
  </table>
  <br />
  <logic:notEmpty name="W1007Form" property="listDomainList" >
  <%--
   	-- page control
    --%>
        <table class="gscm_resultlist_button">
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
  <table class="gscm_resultlist" id="tablefix" >
    <colgroup>
      <col class="resultlist_chk" />
      <col class="resultlist_status" />
      <col class="resultlist_line" />
      <col class="resultlist_item" />
      <col class="resultlist_pallet_no" />
      <col class="resultlist_customer_item_no" />
      <col class="resultlist_prod_item_no" />
      <col class="resultlist_prod_unit" />
      <col class="resultlist_prod_qty" />
      <col class="resultlist_prod_danger_flag" />
      <col class="resultlist_cml_no" />
    </colgroup>
    <tr>
      <th bgcolor="#CCCCCC"><bean:message key="label.ck" /></th>
      <th rowspan="2" bgcolor="#CCCCCC"><bean:message key="label.status" /></th>
      <th rowspan="2" bgcolor="#CCCCCC"><bean:message key="label.line" /></th>
      <th rowspan="2" bgcolor="#CCCCCC"><bean:message key="label.item" /></th>
      <th rowspan="2" bgcolor="#CCCCCC"><bean:message key="label.palletNo" /></th>
      <th rowspan="2" bgcolor="#CCCCCC"><bean:message key="label.customerItemNo" /></th>
      <th colspan="4" bgcolor="#CCCCCC"><bean:message key="label.prod" /></th>
      <th rowspan="2" bgcolor="#CCCCCC"><bean:message key="label.cmlNo" /></th>
    </tr>
    <tr>
      <th bgcolor="#CCCCCC"><input type="checkbox" name="checkAll" onclick="allcheck('listDomainList', 'selected', this.checked)"></th>
      <th bgcolor="#CCCCCC"><bean:message key="label.itemNoChildNo" /></th>
      <th bgcolor="#CCCCCC"><bean:message key="label.unit" /></th>
      <th bgcolor="#CCCCCC"><bean:message key="label.qty" /></th>
      <th bgcolor="#CCCCCC"><bean:message key="label.dangerFlag" /></th>
    </tr>
    <c:set var="count" value="0" scope="page" />
    <logic:iterate name="W1007Form" property="listDomainList" id="listDomainList" indexId="idx">
	<c:choose>
		<c:when test="${listDomainList.visibleFlag }">
		<c:set var="count" value="${count + 1}" scope="page"/>
		<c:if test="${count%2 != 0}">
	    	<tr style="height: 20px;" class="gscm_odd">
		      <td rowspan="2" align="center"><html:checkbox name="listDomainList" property="selected"  indexed="true" onclick="check($(this),${idx})" /></td>
		      <td rowspan="2" align="center" style="OVERFLOW: hidden;"><bean:write name="listDomainList" property="packingStatus" /></td>
		      <td rowspan="2" align="center" style="OVERFLOW: hidden;"><bean:write name="listDomainList" property="lineNo" /></td>
		      <td rowspan="2" align="center" style="OVERFLOW: hidden;"><bean:write name="listDomainList" property="item" /></td>
		      <c:choose>
					<c:when test="${listDomainList.packingStatusCode == '20' }">
						<td rowspan="2" align="left"> <html:text  name="listDomainList" property="palletNo" maxlength="4" indexed="true" style="width: 50px;"></html:text></td>
					</c:when>
					<c:otherwise>
						<td rowspan="2" align="left"><bean:write name="listDomainList" property="palletNo" /></td>
					</c:otherwise>
			  </c:choose>	      
		      <td rowspan="2" align="left" style="OVERFLOW: hidden;"><html:text name="listDomainList" property="customerItemNo"  styleClass="w1007_customerItemNo gscm_disptext" readonly="true" indexed="true" /></td>
		      <td colspan="4" align="left" style="OVERFLOW: hidden;"><html:text name="listDomainList" property="description"  styleClass="w1007_description gscm_disptext" readonly="true" indexed="true" /></td>
		      <td rowspan="2" align="left" id="cml" style="OVERFLOW: hidden;"><html:text name="listDomainList" property="mainMark"  styleClass="w1007_mainMark gscm_disptext" readonly="true" indexed="true" /></td>
		      
		    </tr>
		    <tr style="height: 20px;" class="gscm_odd">
		      <td align="left" style="OVERFLOW: hidden;"><html:text name="listDomainList" property="itemNo"  styleClass="w1007_itemNo gscm_disptext" readonly="true" indexed="true" /></td>
			  <td align="left" style="OVERFLOW: hidden;"><html:text name="listDomainList" property="qtyUnit"  styleClass="w1007_qtyUnit gscm_disptext" readonly="true" indexed="true" /></td>
			  <td align="left" style="OVERFLOW: hidden;"><html:text name="listDomainList" property="qty"  styleClass="w1007_qty gscm_disptext" readonly="true" indexed="true" /></td>
			  <td align="left" style="OVERFLOW: hidden;"><html:text name="listDomainList" property="dngrGoodsImpExpCtrl"  styleClass="w1007_dngrGoodsImpExpCtrl gscm_disptext" readonly="true" indexed="true" /></td>
			  <html:hidden name="listDomainList" property="packingStatusCode"  indexed="true" />
		      <html:hidden name="listDomainList" property="netWeight" indexed="true" />
		      <html:hidden name="listDomainList" property="expRequestNo" indexed="true" />
		      <html:hidden name="listDomainList" property="expRequestItemId" indexed="true" />
		      <html:hidden name="listDomainList" property="expRequestKitId" indexed="true" />
		      <html:hidden name="listDomainList" property="palletTempFlag" indexed="true"  />
		      <html:hidden name="listDomainList" property="commercialFlg" indexed="true"  />
		    </tr>
	    </c:if>
	    <c:if test="${count%2 == 0}">
	    	<tr style="height: 20px" class="gscm_even">
		      <td rowspan="2" align="center"><html:checkbox name="listDomainList" property="selected"  indexed="true" onclick="check($(this),${idx})" /></td>
		      <td rowspan="2" align="center" style="OVERFLOW: hidden;"><bean:write name="listDomainList" property="packingStatus" /></td>
		      <td rowspan="2" align="center" style="OVERFLOW: hidden;"><bean:write name="listDomainList" property="lineNo" /></td>
		      <td rowspan="2" align="center" style="OVERFLOW: hidden;"><bean:write name="listDomainList" property="item" /></td>
		      <c:choose>
					<c:when test="${listDomainList.packingStatusCode == '20' }">
						<td rowspan="2" align="left"> <html:text  name="listDomainList" property="palletNo" maxlength="4" indexed="true" style="width: 50px;"></html:text></td>
					</c:when>
					<c:otherwise>
						<td rowspan="2" align="left"><bean:write name="listDomainList" property="palletNo" /></td>
					</c:otherwise>
			  </c:choose>	      
		      <td rowspan="2" align="left" style="OVERFLOW: hidden;"><html:text name="listDomainList" property="customerItemNo"  styleClass="w1007_customerItemNo gscm_disptext" readonly="true" indexed="true" /></td>
		      <td colspan="4" align="left" style="OVERFLOW: hidden;"><html:text name="listDomainList" property="description"  styleClass="w1007_description gscm_disptext" readonly="true" indexed="true" /></td>
		      <td rowspan="2" align="left" id="cml" style="OVERFLOW: hidden;"><html:text name="listDomainList" property="mainMark"  styleClass="w1007_mainMark gscm_disptext" readonly="true" indexed="true" /></td>
		      </tr>
		      <tr style="height: 20px" class="gscm_even">
			      <td align="left" style="OVERFLOW: hidden;"><html:text name="listDomainList" property="itemNo"  styleClass="w1007_itemNo gscm_disptext" readonly="true" indexed="true" /></td>
			      <td align="left" style="OVERFLOW: hidden;"><html:text name="listDomainList" property="qtyUnit"  styleClass="w1007_qtyUnit gscm_disptext" readonly="true" indexed="true" /></td>
			      <td align="left" style="OVERFLOW: hidden;"><html:text name="listDomainList" property="qty"  styleClass="w1007_qty gscm_disptext" readonly="true" indexed="true" /></td>
			      <td align="left" style="OVERFLOW: hidden;"><html:text name="listDomainList" property="dngrGoodsImpExpCtrl"  styleClass="w1007_dngrGoodsImpExpCtrl gscm_disptext" readonly="true" indexed="true" /></td>
			      <html:hidden name="listDomainList" property="packingStatusCode"  indexed="true" />
			      <html:hidden name="listDomainList" property="netWeight" indexed="true" />
			      <html:hidden name="listDomainList" property="expRequestNo" indexed="true" />
			      <html:hidden name="listDomainList" property="expRequestItemId" indexed="true" />
			      <html:hidden name="listDomainList" property="expRequestKitId" indexed="true" />
			      <html:hidden name="listDomainList" property="palletTempFlag" indexed="true"  />
			      <html:hidden name="listDomainList" property="commercialFlg" indexed="true"  />
			      		
			    </tr>
	    </c:if>
	    	</c:when>
	</c:choose>
    </logic:iterate>
  </table>
  </logic:notEmpty>
</html:form>