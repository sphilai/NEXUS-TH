<%--
 * W1008.jsp
 * 
 *
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 --%>

<html:form method="post" action="/W1008Init" styleId="mainForm">
  <table class="gscm_exprequest">
    <colgroup>
      <col class="exprequest_request_no" />
      <col class="exprequest_shipper" />
      <col class="exprequest_consignee" />
      <col class="exprequest_ship_to" />
      <col class="exprequest_nexus_ship_to" />
      <col class="exprequest_wh_comp_cd" />
      <col class="exprequest_wh_cd" />
      <col class="exprequest_trans" />
      <col class="exprequest_weight_unit" />
      <col class="exprequest_request_no_status" />
    </colgroup>
    <tr>
     		<th align="left">
                <bean:message key="label.requestNo" />
            </th>
            <th align="left">
                <bean:message key="label.shipper" />
            </th>
            <th align="left">
                <bean:message key="label.consignee" />
            </th>
            <th align="left">
                <bean:message key="label.nexusShipTo" />
            </th>
            <th align="left" style="width: 150px">
                <bean:message key="label.w1008.whCompCd" />
            </th>
            <th align="left" style="width: 150px">
                <bean:message key="label.w1008.whCd" />
            </th>
            <th align="left" >
                <bean:message key="label.trans" />
            </th>
            <th align="left" style="width: 80px">
                <bean:message key="label.wgtUnit" />
            </th>
            <th align="left" style="width: 150px">
                <bean:message key="label.w1008.requestNoStatus" />
            </th>
    </tr>
    <tr>
     		<td style="OVERFLOW: hidden;">
                <bean:write name="W1008Form" property="w1008CriteriaDomain.expRequestNo" />
            </td>
            <td style="OVERFLOW: hidden;">
                 <bean:write name="W1008Form" property="w1008CriteriaDomain.shipperCd" />
            </td>
            <td style="OVERFLOW: hidden;">
            	 <bean:write name="W1008Form" property="w1008CriteriaDomain.consigneeCd" />
            </td>
            <td style="OVERFLOW: hidden;">
            	<bean:write name="W1008Form" property="w1008CriteriaDomain.shipToCd" />
            </td>
            <td style="OVERFLOW: hidden;">
            	<bean:write name="W1008Form" property="w1008CriteriaDomain.packingCompCd" />
            </td>
            <td style="OVERFLOW: hidden;">
            	<bean:write name="W1008Form" property="w1008CriteriaDomain.packingWhCd" />
            </td>
            <td style="OVERFLOW: hidden;">
          		<bean:write name="W1008Form" property="w1008CriteriaDomain.trnsCd" />
            </td>
            <td style="OVERFLOW: hidden;">
            	<bean:write name="W1008Form" property="w1008CriteriaDomain.weightUnit" />
            </td>
            <td style="OVERFLOW: hidden;">
            	<bean:write name="W1008Form" property="w1008CriteriaDomain.requestStatus" />
            </td>
    </tr>
  </table>
  <table class="gscm_resultlist">
    <colgroup>
      <col class="search_pltNo" style="width: 40px"/>
      <col class="search_outerCd" style="width: 180px"/>
      <col class="search_length_unit" style="width: 60px"/>
      <col class="search_length" style="width: 80px"/>
      <col class="search_width" style="width: 80px"/>
      <col class="search_height" style="width: 80px"/>
      <col class="search_volume" style="width: 60px"/>
      <col class="search_nw"/>
      <col class="search_gw"/>
      <col class="search_pkg" style="width: 100px"/>
      <col class="search_cmlNo" style="width: 120px"/>
      <col class="search_supplierCMLNo" />
    </colgroup>
    <tr>
      <th align="center"><bean:message key="label.pltNo" /></th>
      <th align="center"><bean:message key="label.outerCd" /></th>
      <th align="center"><bean:message key="label.lengthUnit" /></th>
      <th align="center"><bean:message key="label.WT006.length" /></th>
      <th align="center"><bean:message key="label.WT006.width" /></th>
      <th align="center"><bean:message key="label.WT006.height" /></th>
      <th align="center"><bean:message key="label.W1008.volume" /></th>
      <th align="center"><bean:message key="label.W1008.nw" /></th>
      <th align="center"><bean:message key="label.W1008.gw" /></th>
      <th align="center"><bean:message key="label.pkgTyp" /></th>
      <th align="center"><bean:message key="label.cmlNo" /></th>
      <th align="center"><bean:message key="label.supplierCMLNo" /></th>
    </tr>
    <tr>
      <td align="right" style="OVERFLOW: hidden;"><bean:write name="W1008Form" property="w1008CriteriaDomain.palletNo"/></td>
      <td align="center">
      	  <html:text property="w1008CriteriaDomain.outerPkgCd" maxlength="5" styleClass="w1008_outerPkgCd" errorStyleClass="w1008_outerPkgCd gscm_error_class" readonly="true" onchange="changePkgConfirmFlg();" tabindex="-1" />
          <bean:define id="shipperCd" name="W1008Form" property="w1008CriteriaDomain.shipperCd" />
          <html:button property="select" onclick="setOuterPkgCd('${shipperCd}');" styleId="selectOuterPkgCdBtn">
          <bean:message key="button.select" />
          </html:button>
      </td>
      <td id="lengthUnitLabel" align="center" style="OVERFLOW: hidden;"><bean:write name="W1008Form" property="w1008CriteriaDomain.lengthUnit"/></td>
      <td align="right"><html:text property="w1008CriteriaDomain.length" maxlength="8" styleId="length" styleClass="length right gscm_required" errorStyleClass="length right gscm_error_class" onchange="changeValues('l')" onblur="changeValues('l')"/></td>
      <td align="right"><html:text property="w1008CriteriaDomain.width" maxlength="8"  styleId="width" styleClass="width right gscm_required" errorStyleClass="width right gscm_error_class" onchange="changeValues('w')" onblur="changeValues('w')"/></td>
      <td align="right"><html:text property="w1008CriteriaDomain.height" maxlength="8" styleId="height" styleClass="height right gscm_required" errorStyleClass="height right gscm_error_class" onchange="changeValues('h')" onblur="changeValues('h')"/></td>
      <td id="volumeLabel" align="right" style="OVERFLOW: hidden;"><html:text name="W1008Form" property="w1008CriteriaDomain.volume"  styleClass="w1008_volume_header gscm_disptext" readonly="true"  /></td>
      <td id="netWeightLabel" align="right" style="OVERFLOW: hidden;"><html:text name="W1008Form" property="w1008CriteriaDomain.netWeight"  styleClass="w1008_netWeight_header gscm_disptext" readonly="true"  /></td>
      <td align="right" style="OVERFLOW: hidden;"><html:text property="w1008CriteriaDomain.grossWeight"  maxlength="11" styleClass="w1008_grossWeight gscm_required" errorStyleClass="w1008_grossWeight gscm_error_class" /></td>
      <td align="right"> 
     	<html:select property="w1008CriteriaDomain.packingType" styleClass="packingType" >
                <html:options collection="packingType" property="id" labelProperty="name"/>
        </html:select>
      </td>
      <td style="width: 100px;OVERFLOW: hidden;" align="right" id="mainMarkLabel" ><html:text name="W1008Form" property="w1008CriteriaDomain.mainMark"  styleClass="w1008_mainMark_header gscm_disptext" readonly="true"  /></td>
      <td align="right"><html:text property="w1008CriteriaDomain.supplierMainMark" style="width: 60px;" maxlength="20" styleClass="w1008_supplierCMLNo" errorStyleClass="w1008_supplierCMLNo gscm_error_class" /></td>
      <html:hidden name="W1008Form" property="w1008CriteriaDomain.volumeUnit" value="${w1008CriteriaDomain.volumeUnit}" />
      <html:hidden name="W1008Form" property="w1008CriteriaDomain.lengthUnit" value="${w1008CriteriaDomain.lengthUnit}" />
      <html:hidden name="W1008Form" property="w1008CriteriaDomain.volume"  />
      <html:hidden name="W1008Form" property="w1008CriteriaDomain.ownerComp"/>
      <html:hidden name="W1008Form" property="w1008CriteriaDomain.lengthUnitHeader"/>
      <html:hidden name="W1008Form" property="w1008CriteriaDomain.previousPallet"/> <!-- //Issue 072 -->
      <html:hidden name="W1008Form" property="w1008CriteriaDomain.rtPage"/> <!-- //Issue 096 -->
    </tr>
  </table>
  <table class="gscm_resultlist_button">
    <tr>
      <td>
		<html:button property="delete" onclick="gscm.submitSearch('W1008Delete.do', this.form, '')" styleClass="delete">
				<bean:message key="button.delete" />
        </html:button>
		<html:button property="returnable" onclick="gscm.commonSubmit('W1008MoveToReturnable.do', this.form, '')" styleClass="returnable">
				<bean:message key="button.moveToReturnable" />
        </html:button>
      </td>
      <td class="right">
      	  <bean:define id="cancelConfirmMessage"><bean:message key="NXS-I1-0009"/></bean:define>
		  <html:button property="register" onclick="checkValidateRegister(this.form);" styleClass="register">
			<bean:message key="button.register" />
          </html:button>
          <html:button property="printCML" onclick="gscm.commonSubmitForCheck('W1008PrintCML.do', this.form, 'false', 'false');" styleClass="printCML">
			<bean:message key="button.printCml" />
          </html:button>
          <html:button property="cancelCML" onclick="gscm.submitConfirm('W1008CancelCML.do', this.form, '${cancelConfirmMessage}');" styleClass="cancelCML">
			<bean:message key="button.cancelCml" />
          </html:button>
          <html:button property="content" onclick="gscm.submitBack('W1007Search.do', this.form)" styleClass="content">
			<bean:message key="button.backToContent" />
          </html:button>
      </td>
    </tr>
  </table>
  <br />
 <logic:notEmpty name="W1008Form" property="listDomainList" >
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
  <!--- search results --->
  <table class="gscm_resultlist">
	<colgroup>
      <col class="resultlist_del" />
      <col class="resultlist_line" />
      <col class="resultlist_item" />
      <col class="resultlist_customer_item_no" />
      <col class="resultlist_product_name" />
      <col class="resultlist_item_no" />
      <col class="resultlist_qty_unit" />
      <col class="resultlist_qty" />
    </colgroup>
    <thead>
		<tr>
		  <th><bean:message key="label.del" /><br />
		  <input type="checkbox" name="checkAll" onclick="allcheck('listDomainList', 'selected', this.checked)"></th>
		  <th><bean:message key="label.line" /></th>
		  <th><bean:message key="label.item" /></th>
		  <th><bean:message key="label.customerItemNo" /></th>
		  <th><bean:message key="label.prod" /></th>
		  <th><bean:message key="label.itemNo" /></th>
          <th><bean:message key="label.w1008.qtyUnit" /></th>
          <th><bean:message key="label.qty" /></th>
		</tr>
    </thead>
    <tbody>
		<logic:iterate name="W1008Form" property="listDomainList" id="listDomainList" indexId="idx">
		  <ai:stripeline number="${idx + 1}" odd="gscm_odd" even="gscm_even">
		    <tr>
				<td align="center"><html:checkbox name="listDomainList" property="selected" indexed="true" value="on" /></td>
                <td align="center" style="OVERFLOW: hidden;"><bean:write name="listDomainList" property="lineNo" /></td>
	      		<td align="center" style="OVERFLOW: hidden;"><bean:write name="listDomainList" property="kitBrch" /></td>
	      		<td align="center" style="OVERFLOW: hidden;"><html:text name="listDomainList" property="customerItemNo"  styleClass="w1008_customerItemNo gscm_disptext" readonly="true" indexed="true" /></td>
	      		<td align="center" style="OVERFLOW: hidden;"><html:text name="listDomainList" property="description"  styleClass="w1008_description gscm_disptext" readonly="true" indexed="true" /></td>
	      		<td align="center" style="OVERFLOW: hidden;"><html:text name="listDomainList" property="componentItemNo"  styleClass="w1008_componentItemNo gscm_disptext" readonly="true" indexed="true" /></td>
	      		<td align="right" style="OVERFLOW: hidden;"><html:text name="listDomainList" property="qtyUnit"  styleClass="w1008_qtyUnit gscm_disptext" readonly="true" indexed="true" /></td>
	      		<td align="right" style="OVERFLOW: hidden;"><html:text name="listDomainList" property="qty"  styleClass="w1008_qty gscm_disptext" readonly="true" indexed="true" /></td>
	      		<html:hidden name="listDomainList" property="commercialFlg" indexed="true"  />
		    </tr>
		  </ai:stripeline>
		</logic:iterate>
    </tbody>
  </table>
  </logic:notEmpty>
</html:form>