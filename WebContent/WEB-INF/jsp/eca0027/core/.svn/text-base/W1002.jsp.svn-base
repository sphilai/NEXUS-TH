<%--
 * W1002.jsp
 *
 * 小箱内多品番梱包Header画面のJSPです。
 * 
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 --%>
<script type="text/javascript">
$(function() {
    setInit();
});
</script>

<html:form action="/W1002Init" styleId="mainForm">
	<%--
    -- buttons 1
    --%>
    <table class="gscm_search_button">
        <colgroup>
            <col />
        </colgroup>
        <tr>
            <td>
            	<bean:define id="procMode" name="W1002Form" property="w1002CriteriaDomain.procMode" />
                <html:button property="backToMainScreen" styleClass="back_to_main_screen" onclick="gscm.submitBack('W1001Init.do', this.form);">
                    <bean:message key="button.backToMainScreen" />
                </html:button>
                <html:button property="moveToDescrip" styleClass="move_to_descrip" onclick="doMoveToDescriptions('W1003Init.do', this.form);">
                    <bean:message key="button.moveToDescrip" />
                </html:button>
            </td>
            <td>
            	<html:button property="import" onclick="gscm.commonSubmit('W1010Init.do', this.form);" styleClass="import">
                    <bean:message key="button.import" />
                </html:button>
            </td>
        </tr>
    </table>
    <%--
    -- Header 1
    --%>
    <table class="grid">
        <colgroup>
            <col class="grid_title" />
            <col class="grid_data2" />
            <col class="grid_title2" />
            <col class="grid_data3" />
        </colgroup>
        <tr>
            <th class="right">
                <bean:message key="label.requestNo" />
            </th>
            <td style="OVERFLOW: hidden;">
            	<bean:write name="W1002Form" property="w1002CriteriaDomain.expRequestNo" />
            </td>
            <th class="right">
                <bean:message key="label.documentStatus" />
            </th>
            <td style="OVERFLOW: hidden;">
            	<bean:write name="W1002Form" property="w1002CriteriaDomain.requestStatus" />
            </td>
        </tr>
    </table>
    <%--
    -- Header 2
    --%>
    <table class="grid">
        <colgroup>
            <col class="grid_title" />
            <col class="grid_data1" />
        </colgroup>
        <tr>
            <th class="right">
                <bean:message key="label.typeOfShip" />
            </th>
            <td>
                <html:radio onclick="setTypeOfShip();clearTypeOfShip();" styleId="densoGp" property="w1002CriteriaDomain.densoShipperTyp" value="Y"/><bean:message key="label.densoGp" />
                <html:radio onclick="setTypeOfShip();clearTypeOfShip();" styleId="nonDensoGp" property="w1002CriteriaDomain.densoShipperTyp" value="N"/><bean:message key="label.nonDensoGp" />
            </td>
        </tr>
    </table>
    <%--
    -- Header 3
    --%>
    <table class="grid">
        <colgroup>
            <col class="grid_title" />
            <col class="grid_data1" />
        </colgroup>
        <tr>
            <th class="right">
                <bean:message key="label.shipperCd" />
            </th>
            <td>
            	<html:text property="w1002CriteriaDomain.shipperCd" styleId="shipper_cd" styleClass="shipper_cd gscm_required" errorStyleClass="shipper_cd gscm_error_class" readonly="true"  />
                <html:button property="shipperCdselect" styleId="shipperCdselect" onclick="selectShipper(this.form);" styleClass="select">
                    <bean:message key="button.select" />
                </html:button>
                <html:text property="w1002CriteriaDomain.shipperName" styleClass="shipper_name gscm_disptext" readonly="true" />
                
            </td>
        </tr>
    </table>
    <%--
    -- Header 4
    --%>
    <table class="grid">
        <colgroup>
            <col class="grid_title" />
            <col class="grid_data1" />
        </colgroup>
        <tr>
            <th class="right">
                <bean:message key="label.plntCd" />
            </th>
            <td>
                <html:text property="w1002CriteriaDomain.plantCd" styleId="plnt_cd" maxlength="2" styleClass="plnt_cd gscm_required" errorStyleClass="plnt_cd gscm_error_class" />
            </td>
        </tr>
    </table>
    <%--
    -- Header 5
    --%>
    <table class="grid">
        <colgroup>
            <col class="grid_title" />
            <col class="grid_data1" />
        </colgroup>
        <tr>
            <th class="right">
                <bean:message key="label.issuerComp" />
            </th>
            <td style="OVERFLOW: hidden;">
            	<bean:write name="W1002Form" property="w1002CriteriaDomain.requestIssuerCompCd" />
            	<bean:write name="W1002Form" property="w1002CriteriaDomain.requestIssuerCompNm" />
            </td>
        </tr>
        <tr>
        	<th class="right">
                <bean:message key="label.department" />
            </th>
        	<td>
             	<html:text property="w1002CriteriaDomain.requestIssuerDeptNm" styleId="department" maxlength="100" styleClass="department gscm_required" errorStyleClass="department gscm_error_class" />
            </td>
        </tr>
        <tr>
        	<th class="right">
                <bean:message key="label.issuerName" />
            </th>
        	<td style="OVERFLOW: hidden;">
             	<bean:write name="W1002Form" property="w1002CriteriaDomain.requestIssuerNm" />
            </td>
        </tr>
        <tr>
        	<th class="right">
                <bean:message key="label.tel" />
            </th>
        	<td>
             	<html:text property="w1002CriteriaDomain.issuerCompTel" styleId="tel" maxlength="20" styleClass="tel gscm_required" errorStyleClass="tel gscm_error_class" />
            </td>
        </tr>
        <tr>
        	<th class="right">
                <bean:message key="label.niceNet" />
            </th>
        	<td>
             	<html:text property="w1002CriteriaDomain.issuerCompNiceNet" styleId="nice_net" maxlength="20" styleClass="nice_net" errorStyleClass="nice_net gscm_error_class" />
            </td>
        </tr>
    </table>
    <%--
    -- Header 6
    --%>
    <table class="grid">
        <colgroup>
            <col class="grid_title" />
            <col class="grid_data2" />
            <col class="grid_title2" />
            <col class="grid_data4" />
            <col class="grid_data4" />
        </colgroup>
        <tr>
            <th class="right">
                <bean:message key="label.invoiceCtgry" />
            </th>
            <td colspan="4">
                <html:select property="w1002CriteriaDomain.invoiceCtgry" styleId="inv_cat" styleClass="inv_cat gscm_required" errorStyleClass="inv_cat gscm_error_class" >
                    <html:options collection="invoiceCtgry" property="id" labelProperty="name"/>
                </html:select>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.reExpGoods" />
            </th>
            <td>
                <html:select property="w1002CriteriaDomain.reExpGoodsFlg" styleId="re_ex_goods" styleClass="re_ex_goods gscm_required" errorStyleClass="re_ex_goods gscm_error_class" onchange="setReExpGoodsFlg();" >
                    <html:options collection="flag" property="id" labelProperty="name"/>
                </html:select>
            </td>
            <th class="right">
                <bean:message key="label.impInvoiceNo" />
            </th>
            <td>
                <html:text property="w1002CriteriaDomain.impInvoiceNo1" styleId="im_inv_no" maxlength="20" styleClass="im_inv_no gscm_required" errorStyleClass="im_inv_no gscm_error_class" />
            </td>
            <td>
            	<html:text property="w1002CriteriaDomain.impInvoiceNo2" styleId="im_inv_no2" maxlength="20" styleClass="im_inv_no2 gscm_required" errorStyleClass="im_inv_no2 gscm_error_class" />
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.itemType" />
            </th>
            <td colspan="4">
                <html:select property="w1002CriteriaDomain.itemTyp" styleId="item_type" styleClass="item_type gscm_required" errorStyleClass="item_type gscm_error_class" >
                    <html:options collection="itemType" property="id" labelProperty="name"/>
                </html:select>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.originCntryCd" />
            </th>
            <td colspan="4">
                <html:select property="w1002CriteriaDomain.originCntryCd" styleId="country_of_origin" styleClass="country_of_origin" errorStyleClass="country_of_origin gscm_error_class" >
                    <html:options collection="cntry" property="id" labelProperty="name"/>
                </html:select>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.qtyOfUnit" />
            </th>
            <td colspan="4">
                <html:select property="w1002CriteriaDomain.qtyUnit" styleId="qty_of_unit" styleClass="qty_of_unit gscm_required" errorStyleClass="qty_of_unit gscm_error_class" >
                    <html:options collection="qtyUnit" property="id" labelProperty="name"/>
                </html:select>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.weightOfUnit" />
            </th>
            <td colspan="4" style="OVERFLOW: hidden;">
            	<bean:write name="W1002Form" property="w1002CriteriaDomain.weightUnit" />
            </td>
        </tr>
    </table>
    <%--
    -- Header 7
    --%>
    <table class="grid">
        <colgroup>
            <col class="grid_title" />
            <col class="grid_data1" />
        </colgroup>
        <tr>
            <th class="right">
                <bean:message key="label.cigmaCus" />
            </th>
            <td>
                <html:text property="w1002CriteriaDomain.customerCd" styleId="cigma_customer"  styleClass="cigma_customer" errorStyleClass="cigma_customer gscm_error_class" onkeyup="clearCigma();"/>
            	<html:button property="select" styleClass="select" onclick="selectShipTo();">
                    <bean:message key="button.select" />
                </html:button>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.accounteeNo" />
            </th>
            <td>
                <html:text property="w1002CriteriaDomain.accounteeCd" styleClass="accountee_no gscm_disptext" readonly="true" />
                <html:hidden property="w1002CriteriaDomain.customerShipTo" />
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.consigneeCd" />
            </th>
            <td>
                <html:text property="w1002CriteriaDomain.consigneeCd" styleId="consignee_cd" maxlength="20" styleClass="consignee_cd gscm_required" errorStyleClass="consignee_cd gscm_error_class" />
            	<html:button property="select" onclick="setConsignee();" styleClass="select" >
                    <bean:message key="button.select" />
                </html:button>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.companyName" />
            </th>
            <td>
                <html:text property="w1002CriteriaDomain.consigneeCompNm" styleId="company_name" maxlength="60" styleClass="company_name gscm_required" errorStyleClass="company_name gscm_error_class" />
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.cntryCd" />
            </th>
            <td colspan="4">
            	<html:select property="w1002CriteriaDomain.consigneeCntryCd" styleId="cntry_cd1" styleClass="cntry_cd1 gscm_required" errorStyleClass="cntry_cd1 gscm_error_class" >
                    <html:options collection="cntry" property="id" labelProperty="name"/>
                </html:select>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.address" />
            </th>
            <td>
            	<html:textarea property="w1002CriteriaDomain.consigneeCompAddr" onkeypress="return imposeMaxLength(event, this, 134);" styleClass="address_nexus gscm_required"  errorStyleClass="address_nexus gscm_error_class" cols="50" rows="4"/>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.tel" />
            </th>
            <td>
                <html:text property="w1002CriteriaDomain.consigneeCompTel" styleId="tel" maxlength="20"  styleClass="tel gscm_required" errorStyleClass="tel gscm_error_class" />
            </td>
        </tr>
    </table>
     <%--
    -- Header 8
    --%>
    <table class="grid">
        <colgroup>
            <col class="grid_title" />
            <col class="grid_data1" />
        </colgroup>
        <tr>
            <th class="right">
                <bean:message key="label.nexusShipToCd" />
            </th>
            <td>
                <html:text property="w1002CriteriaDomain.shipToCd" styleId="nexus_ship_to_cd" maxlength="8" styleClass="nexus_ship_to_cd gscm_required" errorStyleClass="nexus_ship_to_cd gscm_error_class"  readonly="true" />
            	<html:button property="select" styleClass="select" onclick="selectNexusShipTo(this.form);">
                    <bean:message key="button.select" />
                </html:button>
                <html:hidden property="w1002CriteriaDomain.compCd" />
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.companyName" />
            </th>
            <td>
                <html:text property="w1002CriteriaDomain.shipToCompNm" styleId="company_name_nexus" maxlength="100" styleClass="company_name_nexus gscm_required" errorStyleClass="company_name_nexus gscm_error_class" />
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.cntryCd" />
            </th>
            <td>
            	<html:select property="w1002CriteriaDomain.shipToCntryCd" styleId="country_cd_nexus" styleClass="country_cd_nexus gscm_required" errorStyleClass="country_cd_nexus gscm_error_class" >
                    <html:options collection="cntry" property="id" labelProperty="name"/>
                </html:select>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.address" />
            </th>
            <td>
            	<html:textarea property="w1002CriteriaDomain.shipToCompAddr" onkeypress="return imposeMaxLength(event, this, 134);" styleClass="address_nexus gscm_required"  errorStyleClass="address_nexus gscm_error_class" cols="50" rows="4"/>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.tel" />
            </th>
            <td>
                <html:text property="w1002CriteriaDomain.shipToCompTel" styleId="tel_nexus" maxlength="20" styleClass="tel_nexus gscm_required" errorStyleClass="tel_nexus gscm_error_class" />
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.attnDepart" />
            </th>
            <td>
                <html:text property="w1002CriteriaDomain.shipToCompDeptNm" styleId="attn_depart" maxlength="30" styleClass="attn_depart gscm_required" errorStyleClass="attn_depart gscm_error_class" />
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.attnName" />
            </th>
            <td>
                <html:text property="w1002CriteriaDomain.shipToAttnNm" styleId="attn_name" maxlength="30" styleClass="attn_name gscm_required" errorStyleClass="attn_name gscm_error_class" />
            </td>
        </tr>
    </table>
     <%--
    -- Header 9
    --%>
    <table class="grid">
        <colgroup>
            <col class="grid_title" />
            <col class="grid_data5" />
            <col class="grid_data5" />
            <col class="grid_data3" />
        </colgroup>
        <tr>
            <th class="right">
                <bean:message key="label.paymentMethod" />
            </th>
            <td colspan="3">
                <html:select property="w1002CriteriaDomain.payMeth" styleId="payment_method" styleClass="payment_method gscm_required" errorStyleClass="payment_method gscm_error_class" >
                    <html:options collection="payMeth" property="id" labelProperty="name"/>
                </html:select>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.paymentTerms" />
            </th>
            <td colspan="3">
                <html:text property="w1002CriteriaDomain.payTerms" styleId="payment_terms" maxlength="30" styleClass="payment_terms gscm_required" errorStyleClass="payment_terms gscm_error_class" />
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.currency" />
            </th>
            <td colspan="3">
                <html:select property="w1002CriteriaDomain.currCd" styleId="currancy" styleClass="currancy gscm_required" errorStyleClass="currancy gscm_error_class" >
                    <html:options collection="currencyList" property="id" labelProperty="name"/>
                </html:select>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.priceTerms" />
            </th>
            <td>
                <html:select property="w1002CriteriaDomain.priceTerms" onchange="setPriceTerms();" styleId="price_terms" styleClass="price_terms gscm_required" errorStyleClass="price_terms gscm_error_class" >
                    <html:options collection="priceTerms" property="id" labelProperty="name"/>
                </html:select>
            </td>
             <td>
            	<bean:message key="label.others" />
                <html:text property="w1002CriteriaDomain.priceTerms1" styleId="other_price" maxlength="3" styleClass="other_price" errorStyleClass="other_price gscm_error_class" />
            </td>
            <td>
            	<bean:message key="label.termsPoint" />
                <html:text property="w1002CriteriaDomain.termsPoint" styleId="terms_point" maxlength="50" styleClass="terms_point" errorStyleClass="terms_point gscm_error_class" />
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.tradeTerms" />
            </th>
            <td>
                <html:select property="w1002CriteriaDomain.tradeTerms" onchange="setTradeTerms();" styleId="trade_terms" styleClass="trade_terms gscm_required" errorStyleClass="trade_terms gscm_error_class" >
                    <html:options collection="tradeTerms" property="id" labelProperty="name"/>
                </html:select>
            </td>
            <td colspan="2">
            	<bean:message key="label.others" />
                <html:text property="w1002CriteriaDomain.tradeTerms1" styleId="other_trad" maxlength="20" styleClass="other_trad" errorStyleClass="other_trad gscm_error_class" />    
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.trnsCd" />
            </th>
            <td colspan="3">
                <html:select property="w1002CriteriaDomain.trnsCd" styleId="trans_cd" styleClass="trans_cd gscm_required" errorStyleClass="trans_cd gscm_error_class" >
                    <html:options collection="trnsCd" property="id" labelProperty="name"/>
                </html:select>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.containerSortingKey" />
            </th>
            <td>
            	<html:text property="w1002CriteriaDomain.containerSortingKey" styleId="contain_sort_cd"  styleClass="contain_sort_cd gscm_required" errorStyleClass="contain_sort_cd gscm_error_class" maxlength="8"/>    
            </td>
            <th class="right">
                <bean:message key="label.loadingCd" />
            </th>
            <td>
                <html:select property="w1002CriteriaDomain.loadingCd" styleId="loading_cd" styleClass="loading_cd gscm_required" errorStyleClass="loading_cd gscm_error_class" >
                    <html:options collection="loadingCd" property="id" labelProperty="name"/>
                </html:select>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.stagingInstruction" />
            </th>
            <td colspan="3">
                <html:select property="w1002CriteriaDomain.stagingInstructionFlg" styleId="staging_instruction" styleClass="staging_instruction" errorStyleClass="staging_instruction gscm_error_class" >
                    <html:options collection="flag" property="id" labelProperty="name"/>
                </html:select>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.splitProhibitFlg" />
            </th>
            <td colspan="3">
                <html:select property="w1002CriteriaDomain.splitShippingNgFlg" styleId="split_prohibit" styleClass="split_prohibit" errorStyleClass="split_prohibit gscm_error_class" >
                    <html:options collection="flag" property="id" labelProperty="name"/>
                </html:select>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.requestShipDate" />
            </th>
            <td colspan="3">
                <html:text property="w1002CriteriaDomain.requiredShipDt" maxlength="10" styleClass="requested_ship_dt" errorStyleClass="requested_ship_dt gscm_error_class" />
                <img src="images/gscm/library/Calendar.gif"
                    onClick = "gscm.writeCalendar('requestedShipDtDiv', 'mainForm', 'w1002CriteriaDomain.requiredShipDt', '<bean:message key="format.screen.yyyymmdd"/>', this);"/>
                <div id="requestedShipDtDiv" style="float:left;"></div>
            </td>
        </tr>
    </table>
     <%--
    -- Header 10
    --%>
    <table class="grid">
        <colgroup>
            <col class="grid_title" />
            <col class="grid_data1" />
        </colgroup>
        <tr>
            <th class="right">
                <bean:message key="label.nexusWhCom" />
            </th>
            <td>
                <html:text property="w1002CriteriaDomain.nexusWhCom" styleId="nexus_wh_cd_comp"  styleClass="nexus_wh_cd_comp gscm_required" errorStyleClass="nexus_wh_cd_comp gscm_error_class" />
            	<html:button property="select" styleClass="select" onclick="selectNexusWhComp();">
                    <bean:message key="button.select" />
                </html:button>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.nexusWhWh" />
            </th>
            <td>
                <html:text property="w1002CriteriaDomain.packingWhCd" styleClass="packing_wh_cd gscm_disptext" readonly="true" />
                <html:text property="w1002CriteriaDomain.packingCompDeptNm" styleClass="packing_comp_cd gscm_disptext" readonly="true" />
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.requestToPack" />
            </th>
            <td>
            	<html:textarea property="w1002CriteriaDomain.requestToPackingSec" onkeypress="return imposeMaxLength(event, this, 299);" styleClass="request_to_pack"  errorStyleClass="request_to_pack gscm_error_class" cols="50" rows="4"/>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.addNotToCaskMark" />
            </th>
            <td>
                <html:text property="w1002CriteriaDomain.casemarkNotation" styleId="add_not_to_cask_mark" maxlength="50" styleClass="add_not_to_cask_mark" errorStyleClass="add_not_to_cask_mark gscm_error_class" />
            </td>
        </tr>
    </table>
     <%--
    -- Header 11
    --%>
    <table class="grid">
        <colgroup>
            <col class="grid_title" />
            <col class="grid_data1" />
        </colgroup>
        <tr>
            <th class="right">
                <bean:message key="label.freightRes" />
            </th>
            <td>
                <html:select property="w1002CriteriaDomain.freightResponsibleCd" styleId="freight_resp" styleClass="freight_resp gscm_required" errorStyleClass="freight_resp gscm_error_class" >
                    <html:options collection="freightResponsibleCd" property="id" labelProperty="name"/>
                </html:select>
            </td>
        </tr>
        <tr>
        	<th class="right">
                <bean:message key="label.freightCostRes" />
            </th>
        	<td>
        		<table class="gridInner">
        			<colgroup>
            			<col class="grid_titleInner" />
            			<col class="grid_data1Inner" />
            			<col class="grid_titleInner" />
            			<col class="grid_data1Inner" />
            			<col class="grid_titleInner" />
            			<col class="grid_data1Inner" />
        			</colgroup>
        			<tr>
            			<th class="right">
                			<bean:message key="label.categoryCd1" />
            			</th>
            			<td>
                			<html:text property="w1002CriteriaDomain.ctgryCd1" styleId="category_cd" maxlength="4" styleClass="category_cd" errorStyleClass="category_cd gscm_error_class" />
            			</td>
            			<th class="right">
                			<bean:message key="label.categoryCd2" />
            			</th>
            			<td>
                			<html:text property="w1002CriteriaDomain.ctgryCd2" styleId="category_cd" maxlength="4" styleClass="category_cd" errorStyleClass="category_cd gscm_error_class" />
            			</td>
            			<th class="right">
                			<bean:message key="label.categoryCd3" />
            			</th>
            			<td>
                			<html:text property="w1002CriteriaDomain.ctgryCd3" styleId="category_cd" maxlength="4" styleClass="category_cd" errorStyleClass="category_cd gscm_error_class" />
            			</td>
        			</tr>
        			<tr>
            			<th class="right">
                			<bean:message key="label.budgetNo1" />
            			</th>
            			<td>
                			<html:text property="w1002CriteriaDomain.budgetNo1" styleId="budget_no" maxlength="5" styleClass="budget_no" errorStyleClass="budget_no gscm_error_class" />
            			</td>
            			<th class="right">
                			<bean:message key="label.budgetNo2" />
            			</th>
            			<td>
                			<html:text property="w1002CriteriaDomain.budgetNo2" styleId="budget_no" maxlength="5" styleClass="budget_no" errorStyleClass="budget_no gscm_error_class" />
            			</td>
            			<th class="right">
                			<bean:message key="label.budgetNo3" />
            			</th>
            			<td>
                			<html:text property="w1002CriteriaDomain.budgetNo3" styleId="budget_no" maxlength="5" styleClass="budget_no" errorStyleClass="budget_no gscm_error_class" />
            			</td>
        			</tr>
        			<tr>
            			<th class="right">
                			<bean:message key="label.jobNo1" />
            			</th>
            			<td>
                			<html:text property="w1002CriteriaDomain.jobNo1" styleId="job_no" maxlength="5" styleClass="job_no" errorStyleClass="job_no gscm_error_class" />
            			</td>
            			<th class="right">
                			<bean:message key="label.jobNo2" />
            			</th>
            			<td>
                			<html:text property="w1002CriteriaDomain.jobNo2" styleId="job_no" maxlength="5" styleClass="job_no" errorStyleClass="job_no gscm_error_class" />
            			</td>
            			<th class="right">
                			<bean:message key="label.jobNo3" />
            			</th>
            			<td>
                			<html:text property="w1002CriteriaDomain.jobNo3" styleId="job_no" maxlength="5" styleClass="job_no" errorStyleClass="job_no gscm_error_class" />
            			</td>
        			</tr>
        			<tr>
            			<th class="right">
                			<bean:message key="label.percentageCat1" />
            			</th>
            			<td>
                			<html:text property="w1002CriteriaDomain.per1" styleId="percentage_cat" maxlength="3" styleClass="percentage_cat" errorStyleClass="percentage_cat gscm_error_class" />
            			</td>
            			<th class="right">
                			<bean:message key="label.percentageCat2" />
            			</th>
            			<td>
                			<html:text property="w1002CriteriaDomain.per2" styleId="percentage_cat" maxlength="3" styleClass="percentage_cat" errorStyleClass="percentage_cat gscm_error_class" />
            			</td>
            			<th class="right">
                			<bean:message key="label.percentageCat3" />
            			</th>
            			<td>
                			<html:text property="w1002CriteriaDomain.per3" styleId="percentage_cat" maxlength="3" styleClass="percentage_cat" errorStyleClass="percentage_cat gscm_error_class" />
            			</td>
        			</tr>
    			</table>
        	</td>
        </tr>
    </table>
    <%--
    -- Header 10
    --%>
    <table class="grid">
        <colgroup>
            <col class="grid_title" />
            <col class="grid_data1" />
        </colgroup>
        <tr>
            <th class="right">
                <bean:message key="label.prepareExpInvoiceCtgry" />
            </th>
            <td>
                <html:radio onclick="setSupplierInvoiceNo();" styleId="noGp" property="w1002CriteriaDomain.prepareExpInvoiceCtgry" value="N"/><bean:message key="label.flagNo" />
                <html:radio onclick="setSupplierInvoiceNo();" styleId="yesGp" property="w1002CriteriaDomain.prepareExpInvoiceCtgry" value="Y"/><bean:message key="label.flagYes" />
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.supplierInvoiceNo" />
            </th>
            <td>
               	<html:text property="w1002CriteriaDomain.supplierInvoiceNo" styleId="supplier_invoice_no" maxlength="20" styleClass="supplier_invoice_no gscm_required" errorStyleClass="percentage_cat_3 gscm_error_class" />
           	</td>
        </tr>
    </table>
    <br />
    <table class="gscm_search_button">
        <colgroup>
            <col class="gscm_search_register"/>
            <col class="gscm_search_cancel"/>
        </colgroup>
        <tr>
            <td class="right">
                <html:button property="register" styleClass="register" onclick="gscm.commonSubmit('W1002Register.do', this.form);">
                    <bean:message key="button.register" />
                </html:button>
                
            </td>
            <td>
            	<bean:define id="cancelConfirmMessage"><bean:message key="NXS-I1-0009"/></bean:define>
            	<html:button property="cancel" styleClass="cancelRequest" onclick="gscm.submitConfirm('W1002Cancel.do', this.form, '${cancelConfirmMessage}');">
                    <bean:message key="button.cancelRequest" />
                </html:button>
            </td>
        </tr>
    </table>
    <%--
    -- hidden
    --%>
    <html:hidden property="callScreenId" />
    <html:hidden property="fromScreenId" />
</html:form>
