<%--
 * W1004.jsp
 * 
 *
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 --%>
<script type="text/javascript"><!--
$(function() {
    $('#tablefix').tablefix({height: 500, fixRows: 2});
    setNetWeight();
});
//--></script>
<html:form action="/W1004Init" styleId="mainForm">
  <table class="header_1">
    <colgroup>
      <col class="search_request_no" />
      <col class="search_shipper" />
      <col class="search_consignee" />
      <col class="search_ship_to" />
      <col class="search_trans" />
      <col class="search_weight_unit" />
    </colgroup>
    <tr>
      <th align="left"><bean:message key="label.requestNo" /></th>
      <th align="left"><bean:message key="label.shipper" /></th>
      <th align="left"><bean:message key="label.consignee" /></th>
      <th align="left"><bean:message key="label.nexusShipTo" /></th>
      <th align="left"><bean:message key="label.trans" /></th>
      <th align="left"><bean:message key="label.weightUnit" /></th>
    </tr>
    <tr>
      <td style="OVERFLOW: hidden;"><bean:write name="W1004Form" property="w1004CriteriaDomain.expRequestNo" /></td>
      <td style="OVERFLOW: hidden;"><bean:write name="W1004Form" property="w1004CriteriaDomain.shipperCd" /></td>
      <td style="OVERFLOW: hidden;"><bean:write name="W1004Form" property="w1004CriteriaDomain.consigneeCd" /></td>
      <td style="OVERFLOW: hidden;"><bean:write name="W1004Form" property="w1004CriteriaDomain.shipToCd" /></td>
      <td style="OVERFLOW: hidden;"><bean:write name="W1004Form" property="w1004CriteriaDomain.trnsCd" /></td>
      <td style="OVERFLOW: hidden;"><bean:write name="W1004Form" property="w1004CriteriaDomain.weightUnit" /></td>
    </tr>
  </table>
  <table class="gscm_search_button">
    <tr>
      <td>
		<html:button property="addNewLine10" styleId="add_new_line10" styleClass="add_new_line10" onclick="gscm.commonSubmit('W1004AddNewLine.do', this.form);">
          <bean:message key="button.addNewLine10" />
        </html:button>
        <html:button property="save" onclick="gscm.submitCreateConfirm('W1004SaveLine.do', this.form);" styleClass="save">
		  <bean:message key="button.save" />
        </html:button>
		<html:button property="delete" onclick="gscm.submitDeleteConfirm('W1004DelLine.do', this.form);" styleClass="delete">
		  <bean:message key="button.delete" />
        </html:button>
        <html:button property="copy" onclick="gscm.commonSubmit('W1004CopyLine.do', this.form);" styleClass="copy">
		  <bean:message key="button.copy" />
        </html:button>
      </td>
      <td class="right">
        <html:button property="backToDescription" onclick="gscm.submitBack('W1003Init.do', this.form);" styleClass="backToDescription">
		  <bean:message key="button.backToDescription" />
        </html:button>
      </td>
    </tr>
  </table>
  <hr />
  <c:if test="${W1004Form.displayList}">
  			<%--
            -- page control
            --%>
            <table class="gscm_resultlist_button">
                <colgroup>
                    <col />
                </colgroup>
                <tr>
                    <td class="right" style="padding-right: 20px;"><%@ include
                        file="/WEB-INF/jsp/includes/gscm/framework/pager.jspf"%>
                    </td>
                </tr>
            </table>
  <!--- results --->
  <table id="tablefix" class="gscm_resultlist">
	<colgroup>
      <col class="resultlist_line" />
      <col class="resultlist_sub_line" />
      <col class="resultlist_customer_item_no" />
      <col class="resultlist_co" />
      <col class="resultlist_qty_unit" />
      <col class="resultlist_qty" />
      <col class="resultlist_currancy" />
      <col class="resultlist_unit_price" />
      <col class="resultlist_net_weight" />
      <col class="resultlist_net_weight" />
      <col class="resultlist_comm" />
      <col class="resultlist_rEx" />
    </colgroup>
    <thead>
		<tr>
		  <th><bean:message key="label.line" /></th>
		  <th><bean:message key="label.subLine" /></th>
		  <th colspan="8"><bean:message key="label.prod" /></th>
		  <th><bean:message key="label.childItemNo" /></th>
		  <th><bean:message key="label.dgGoodsImExCtrl" /></th>
		</tr>
		<tr>
		  <th><bean:message key="label.del" /></th>
		  <th><bean:message key="label.useRt" /></th>
		  <th><bean:message key="label.customerItemNo" /></th>		  
          <th><bean:message key="label.co" /></th>
          <th><bean:message key="label.qtyUnit" /></th>
          <th><bean:message key="label.qty" /></th>
          <th><bean:message key="label.currency" /></th>
          <th><bean:message key="label.unitPrice" /></th>
          <th><bean:message key="label.unitNetWeight" /></th>
          <th><bean:message key="label.totalNetWeight" /></th>
          <th><bean:message key="label.comm" /></th>
          <th><bean:message key="label.rEx" /></th>
		</tr>
    </thead>
    <tbody>
    	<logic:iterate name="W1004Form" property="listDomainList" id="listDomainList" >
			<ai:stripeline number="1" odd="gscm_odd" even="gscm_even">
				<tr>
					<td style="OVERFLOW: hidden;">
						<bean:write name="listDomainList" property="lineNo" />
					</td>
					<td>
						
					</td>
					<td colspan="8"  style="OVERFLOW: hidden;">
						<html:text name="listDomainList" property="description" indexed="true" styleClass="description gscm_disptext" readonly="true" />
					</td>
					<td style="OVERFLOW: hidden;">
						<html:text name="listDomainList" property="itemNo" indexed="true" styleClass="item_no gscm_disptext" readonly="true"/>
					</td>
					<td style="OVERFLOW: hidden;">
						<bean:write name="listDomainList" property="dngrGoodsImpExpCtrl" />
					</td>
				</tr>
				<tr>
					<td>
						
					</td>
					<td>
						
					</td>
					<td style="OVERFLOW: hidden;">
						<html:text name="listDomainList" property="customerItemNo" indexed="true" styleClass="customer_item_no gscm_disptext" readonly="true"/>
					</td>					
					<td style="OVERFLOW: hidden;">
						<bean:write name="listDomainList" property="originCntryCd" />
					</td>
					<td style="OVERFLOW: hidden;">
						<bean:write name="listDomainList" property="qtyUnit" />
					</td>
					<td class="right" style="OVERFLOW: hidden;">
						<bean:write name="listDomainList" property="qty" />
					</td>
					<td style="OVERFLOW: hidden;">
						<bean:write name="listDomainList" property="currCd" />
					</td>
					<td class="right" style="OVERFLOW: hidden;">
						<html:text name="listDomainList" property="unitPrice" indexed="true" styleClass="unit_price gscm_disptext" readonly="true"/>
					</td>
					<td class="right" style="OVERFLOW: hidden;">
						<html:text name="listDomainList" property="netWeight" indexed="true" styleClass="net_weight gscm_disptext" readonly="true"/>
					</td>
					<td class="right" style="OVERFLOW: hidden;">
						<html:text name="listDomainList" property="totalNetWeight" indexed="true" styleClass="net_weight gscm_disptext" readonly="true"/>
					</td>
					<td style="OVERFLOW: hidden;">
						<bean:write name="listDomainList" property="commercialFlg" />
					</td>
					<td style="OVERFLOW: hidden;">
						<bean:write name="listDomainList" property="reExpGoodsFlg" />
					</td>
					<html:hidden name="listDomainList" property="expRequestNo" />
					<html:hidden name="listDomainList" property="expRequestItemId" />
				</tr>
			</ai:stripeline>
		</logic:iterate>
		<logic:iterate name="W1004Form" property="kitList" id="kitList" scope="request" indexId="idx">
				<ai:stripeline number="${idx + 2}" odd="gscm_odd" even="gscm_even">
					<tr>
						<td style="OVERFLOW: hidden;">
							<bean:write name="listDomainList" property="lineNo" />
						</td>
						<td style="OVERFLOW: hidden;">
							<bean:write name="kitList" property="kitBrch" />
						</td>
						<td colspan="8" style="OVERFLOW: hidden;">
							<html:text name="kitList" property="kitComponentItemNm" indexed="true" styleId="description" maxlength="200" styleClass="description gscm_required" errorStyleClass="description gscm_error_class" />
						</td>
						<td style="OVERFLOW: hidden;">
							<html:text name="kitList" property="kitComponentItemNo" indexed="true" styleId="item_no" maxlength="27" styleClass="item_no" errorStyleClass="item_no gscm_error_class" />
						</td>
						<td style="OVERFLOW: hidden;">
<!--							<html:text name="kitList" property="dngrGoodsImpExpCtrl" indexed="true" styleId="dngr_goods_imp_exp" maxlength="2" styleClass="dngr_goods_imp_exp" errorStyleClass="dngr_goods_imp_exp gscm_error_class" />-->
							<html:select name="kitList" property="dngrGoodsImpExpCtrl" indexed="true" styleId="dngr_goods_imp_exp" styleClass="dngr_goods_imp_exp" errorStyleClass="dngr_goods_imp_exp gscm_error_class" >
                    			<html:options collection="flag" property="id" labelProperty="name"/>
                			</html:select>
						</td>
					</tr>
					<tr>
						<td class="center">
							<html:checkbox name="kitList" property="selected" indexed="true" />
						</td>
						<td>
							
						</td>
						<td style="OVERFLOW: hidden;">
							<html:text name="kitList" property="kitCustomerItemNo" indexed="true" styleId="customer_item_no" maxlength="27" styleClass="customer_item_no" errorStyleClass="customer_item_no gscm_error_class" />
						</td>
						
						<td style="OVERFLOW: hidden;">
							<html:select name="kitList" property="originCntryCd" indexed="true" styleId="origin_cntry_cd" styleClass="origin_cntry_cd" errorStyleClass="origin_cntry_cd gscm_error_class" >
								<html:options collection="cntry" property="id" labelProperty="name"/>
							</html:select>
						</td>
						<td style="OVERFLOW: hidden;">
							<html:select name="kitList" property="qtyUnit" indexed="true" styleId="qty_unit" styleClass="qty_unit gscm_required" errorStyleClass="qty_unit gscm_error_class" >
								<html:options collection="qtyUnit" property="id" labelProperty="name"/>
							</html:select>
						</td>
						<td style="OVERFLOW: hidden;">
							<html:text name="kitList" property="qty" indexed="true" onchange="calNetWeight(${idx});" onblur="calNetWeight(${idx});" onkeyup="calNetWeight(${idx});" styleId="qty" maxlength="7" styleClass="qty left gscm_required" errorStyleClass="qty gscm_error_class" />
						</td>
						<td style="OVERFLOW: hidden;">
							<bean:write name="kitList" property="currency" />
							<html:hidden name="kitList" property="currency" indexed="true" />
						</td>
						<td style="OVERFLOW: hidden;">
							<html:text name="kitList" property="unitPrice" indexed="true" styleId="unit_price" maxlength="12" styleClass="unit_price left gscm_required" errorStyleClass="unit_price gscm_error_class" />
						</td>
						<td style="OVERFLOW: hidden;">
							<html:text name="kitList" property="netWeight" indexed="true" onchange="calNetWeight(${idx});" onblur="calNetWeight(${idx});" onkeyup="calNetWeight(${idx});" styleId="net_weight" maxlength="13" styleClass="net_weight left gscm_required" errorStyleClass="net_weight gscm_error_class" />
						</td>
            			<td style="OVERFLOW: hidden;">
							<html:text name="kitList" property="totalNetWeight" indexed="true" styleId="net_weight" styleClass="net_weight right gscm_disptext" readonly="true"/>
            			</td>
						<td style="OVERFLOW: hidden;">
							<html:select name="kitList" property="commercialFlg" indexed="true" styleId="commercial_flg" styleClass="commercial_flg" errorStyleClass="commercial_flg gscm_error_class" >
								<html:options collection="flag" property="id" labelProperty="id"/>
							</html:select>
						</td>
						<td>
							
						</td>
						<html:hidden name="kitList" property="expRequestNo" indexed="true" />
						<html:hidden name="kitList" property="expRequestItemId" indexed="true" />
						<html:hidden name="kitList" property="expRequestKitId" indexed="true" />
						<html:hidden name="kitList" property="kitBrch" indexed="true" />
					</tr>
				</ai:stripeline>
			</logic:iterate>
    </tbody>
 </table> 
 </c:if>
 <html:hidden property="w1004CriteriaDomain.originalScreenId" />
 <html:hidden property="callScreenId" />
</html:form>