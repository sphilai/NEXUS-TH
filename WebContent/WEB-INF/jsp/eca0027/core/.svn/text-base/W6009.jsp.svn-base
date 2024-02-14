<%--
 * Project : GSCM
 * 
 * W6009 - Invoice Register
 *
 * $Revision: 12348 $
 * 
 * Copyright (c) 2013 DENSO CORPORATION. All rights reserved.
 --%>

<html:form action="/W6009Init" styleId="mainForm">
    <%--
    -- buttons 1
    --%>
    <table class="gscm_search_button">
        <colgroup>
            <col />
        </colgroup>
        <tr>
            <td>
                <bean:define id="confirmMessage"><bean:message key="NXS-I1-0011" locale="${locale_key}" /></bean:define>
                <html:button property="backToInvoiceGrouping" onclick="submitBackConfirm('W6006Init.do', this.form, '${confirmMessage}');" styleClass="back_to_invoice_grouping">
                    <bean:message key="button.backToInvoiceGrouping" />
                </html:button>
                <html:button property="backToInvoiceDetail" onclick="gscm.submitConfirm('W6009BackToInvoiceDetail.do', this.form, '${confirmMessage}');" styleClass="back_to_invoice_detail">
                    <bean:message key="button.backToInvoiceDetail" />
                </html:button>
                <html:button property="backToMainScreen" onclick="gscm.submitBack('W6001Init.do', this.form);" styleClass="back_to_main_screen">
                    <bean:message key="button.backToMainScreen" />
                </html:button>
                <html:button property="printDocument" onclick="clearMessage(); gscm.commonSubmitForCheck('W6009PrintDocument.do', this.form, 'false', 'false');" styleClass="print_document">
                    <bean:message key="button.printDocument" />
                </html:button>
            </td>
        </tr>
    </table>

    <%--
    -- Export Basic Information
    --%>
    <div class="box_title">
        &lt;<bean:message key="label.boxTitleExportBasicInformation" />&gt;
    </div>
    <table class="grid">
        <colgroup>
            <col class="grid_header" />
            <col class="grid_contents_cd" />
            <col class="grid_contents_nm" />
            <col />
        </colgroup>
        <tr>
            <th class="right">
                <bean:message key="label.shipperCd" />
            </th>
            <td>
               <html:text property="w6009CriteriaDomain.shipperCd" styleClass="shipper_cd gscm_disptext" readonly="true"/>
            </td>
            <td>
               <html:text property="w6009CriteriaDomain.shipperCompNm1" styleClass="shipper_comp_nm gscm_disptext" readonly="true"/>
            </td>
            <td>
               <html:text property="w6009CriteriaDomain.shipperCompNm2" styleClass="shipper_comp_nm gscm_disptext" readonly="true"/>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.frtShipperCd" />
            </th>
            <td colspan="3">
                <html:select property="w6009CriteriaDomain.frtShipperCd" onchange="gscm.commonSubmit('W6009ChangeFrtShipper.do', this.form);" styleId="frt_shipper_cd" styleClass="frt_shipper_cd gscm_required" errorStyleClass="frt_shipper_cd gscm_error_class">
                    <html:options collection="frtShipperCd" property="id" labelProperty="name"/>
                </html:select>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="W6009.label.consigneeCd" />
            </th>
            <td>
               <html:text property="w6009CriteriaDomain.consigneeCd" styleClass="consignee_cd gscm_disptext" readonly="true"/>
            </td>
            <td>
               <html:text property="w6009CriteriaDomain.consigneeCompNm1" styleClass="consignee_comp_nm gscm_disptext" readonly="true" />
            </td>
            <td>
               <html:text property="w6009CriteriaDomain.consigneeCompNm2" styleClass="consignee_comp_nm gscm_disptext" readonly="true" />
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.frtConsigneeCd" />
            </th>
            <td colspan="3">
                <html:select property="w6009CriteriaDomain.frtConsigneeCd" styleId="frt_consignee_cd" styleClass="frt_consignee_cd gscm_required" errorStyleClass="frt_consignee_cd gscm_error_class">
                    <html:options collection="frtConsigneeCd" property="id" labelProperty="name"/>
                </html:select>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="W6009.label.shipToCd" />
            </th>
            <td>
                <html:text property="w6009CriteriaDomain.shipToCd" styleClass="ship_to_cd gscm_disptext" readonly="true" />
            </td>
            <td>
                <html:text property="w6009CriteriaDomain.shipToNm1" styleClass="ship_to_nm gscm_disptext" readonly="true"/>
            </td>
            <td>
                <html:text property="w6009CriteriaDomain.shipToNm2" styleClass="ship_to_nm gscm_disptext" readonly="true"/>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.trnsCd" />
            </th>
            <td>
                <html:text property="w6009CriteriaDomain.trnsCd" styleClass="w6009_trns_cd gscm_disptext" readonly="true" />
            </td>
            <td colspan="2">
                <html:text property="w6009CriteriaDomain.trnsNm" styleClass="trns_nm gscm_disptext" readonly="true"/>
            </td>
        </tr>
    </table>
    <br />

    <%--
    -- Document Information
    --%>
    <div class="box_title">
        &lt;<bean:message key="label.boxTitleDocumentInformation" />&gt;
    </div>
    <table class="grid">
        <colgroup>
            <col class="grid_header" />
            <col class="grid_contents" />
            <col class="grid_header" />
            <col />
        </colgroup>
        <tr>
            <th class="right">
                <bean:message key="label.documentType" />
            </th>
            <td colspan="3">
                <html:text property="w6009CriteriaDomain.documentType" styleClass="document_type gscm_disptext" readonly="true" />
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.classOfInv" />
            </th>
            <td>
                <html:text property="w6009CriteriaDomain.classOfInv" styleClass="class_of_inv gscm_disptext" readonly="true"/>
            </td>
            <th class="right">
                <bean:message key="label.invoiceCtgryNm" />
            </th>
            <td>
                <html:text property="w6009CriteriaDomain.invoiceCtgryNm" styleId="invoice_ctgry_nm" styleClass="invoice_ctgry_nm gscm_disptext" readonly="true"/>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.invTplNo" />
            </th>
            <td>
                <html:select property="w6009CriteriaDomain.invTplNo" styleClass="inv_tpl_no gscm_required" errorStyleClass="inv_tpl_no gscm_error_class" >
                    <html:options collection="invTplNo" property="id" labelProperty="name"/>
                </html:select>
            </td>
            <th class="right">
                <bean:message key="label.tempInvoiceNo" />
            </th>
            <td>
                <html:text property="w6009CriteriaDomain.tempInvoiceNo" styleClass="temp_invoice_no gscm_disptext" readonly="true"/>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.invoiceNo" />
            </th>
            <td>
                <html:text property="w6009CriteriaDomain.invoiceNo" styleClass="invoice_no gscm_disptext" readonly="true"/>
            </td>
            <th class="right">
                <bean:message key="label.supplierInvoiceNo" />
            </th>
            <td>
                <html:text property="w6009CriteriaDomain.supplierInvoiceNo" styleClass="supplier_invoice_no gscm_disptext" readonly="true"/>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="W6009.label.relateInvoiceNo1" />
            </th>
            <td>
                <html:text property="w6009CriteriaDomain.relateInvoiceNo1" styleClass="relate_invoice_no gscm_disptext" readonly="true"/>
            </td>
            <th class="right">
                <bean:message key="W6009.label.relateInvoiceNo2" />
            </th>
            <td>
                <html:text property="w6009CriteriaDomain.relateInvoiceNo2" styleClass="relate_invoice_no gscm_disptext" readonly="true"/>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="W6009.label.impInvoiceNo1" />
            </th>
            <td>
                <html:text property="w6009CriteriaDomain.impInvoiceNo1" styleClass="imp_invoice_no gscm_disptext" readonly="true"/>
            </td>
            <th class="right">
                <bean:message key="W6009.label.impInvoiceNo2" />
            </th>
            <td>
                <html:text property="w6009CriteriaDomain.impInvoiceNo2" styleClass="imp_invoice_no gscm_disptext" readonly="true"/>
            </td>
        </tr>
    </table>
    <br />

    <%--
    -- Date Information
    --%>
    <div class="box_title">
        &lt;<bean:message key="label.boxTitleDateInformation" />&gt;
    </div>
    <table class="grid">
        <colgroup>
            <col class="grid_header" />
            <col class="grid_contents" />
            <col class="grid_header" />
            <col />
        </colgroup>
        <tr>
            <th class="right">
                <bean:message key="label.etd" />
            </th>
            <td>
                <html:text property="w6009CriteriaDomain.etd" styleClass="etd gscm_disptext" readonly="true"/>
            </td>
            <th class="right">
                <bean:message key="label.eta" />
            </th>
            <td>
                <html:text property="w6009CriteriaDomain.eta" styleClass="eta gscm_disptext" readonly="true"/>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.shippedDt" />
            </th>
            <td>
                <html:text property="w6009CriteriaDomain.shippedDt" styleClass="shipped_dt gscm_disptext" readonly="true"/>
            </td>
            <th class="right">
                <bean:message key="label.dispInvoiceIssueDt" />
            </th>
            <td>
                <%-- ST184 INVOICE ISSUE DATE/インボイス発行日 MOD START --%>
                <%-- <html:text property="w6009CriteriaDomain.invoiceIssueDt" styleClass="invoice_issue_dt gscm_disptext" readonly="true"/> --%>
                <html:text property="w6009CriteriaDomain.dispInvoiceIssueDt" maxlength="10" styleId="invoice_issue_dt" styleClass="invoice_issue_dt gscm_required" errorStyleClass="invoice_issue_dt gscm_error_class"/>
                <%-- ST184 INVOICE ISSUE DATE/インボイス発行日 MOD END --%>
                <img src="images/gscm/library/Calendar.gif"
                    onClick = "showCalendar('invoice_issue_dt', 'dispInvoiceIssueDtDiv', 'mainForm', 'w6009CriteriaDomain.dispInvoiceIssueDt', '<bean:message key="format.screen.yyyymmdd" locale="${locale_key}" />', this);"/>
                <div id="dispInvoiceIssueDtDiv" style="float:left;"></div>
            </td>
        </tr>
    </table>
    <br />

    <%--
    -- Terms/Remittance Information
    --%>
    <div class="box_title">
        &lt;<bean:message key="label.boxTitleTermsRemittanceInformation" />&gt;
    </div>
    <table class="grid">
        <colgroup>
            <col class="grid_header_half" />
            <col class="grid_header_half" />
            <col class="grid_contents_trade_terms" />
            <col class="grid_header" />
            <col />
        </colgroup>
        <tr>
            <th colspan="2" class="right">
                <bean:message key="label.dlivPoint" />
            </th>
            <td colspan="3">
                <html:text property="w6009CriteriaDomain.dlivPoint" size="6" styleClass="dliv_point gscm_disptext" readonly="true"/>
            </td>
        </tr>
        <tr>
            <th colspan="2" class="right">
                <bean:message key="label.freightResponsibleCd" />
            </th>
            <td colspan="3">
                <html:select property="w6009CriteriaDomain.freightResponsibleCd" styleId="freight_responsible_nm" styleClass="freight_responsible_nm gscm_required" errorStyleClass="freight_responsible_nm gscm_error_class">
                    <html:options collection="freightResponsibleCd" property="id" labelProperty="name"/>
                </html:select>
            </td>
        </tr>
        <tr>
            <th colspan="2" class="right">
                <bean:message key="label.priceTerms" />
            </th>
            <td colspan="3">
                <html:select property="w6009CriteriaDomain.priceTerms" styleId="freight_responsible_nm" styleClass="price_terms gscm_required" errorStyleClass="price_terms gscm_error_class">
                    <html:options collection="priceTerms" property="id" labelProperty="name"/>
                </html:select>
            </td>
        </tr>
        <tr>
            <th colspan="2" class="right">
                <bean:message key="label.tradeTerms" />
            </th>
            <td>
                <html:text property="w6009CriteriaDomain.tradeTerms" styleClass="trade_terms gscm_disptext" readonly="true"/>
            </td>
            <th class="right">
                <bean:message key="label.termsPoint" />
            </th>
            <td>
                <html:text property="w6009CriteriaDomain.termsPoint" styleClass="terms_point gscm_disptext" readonly="true"/>
            </td>
        </tr>
        <tr>
            <th colspan="2" class="right">
                <bean:message key="label.payMethNm" />
            </th>
            <td colspan="3">
                <html:text property="w6009CriteriaDomain.payMethNm" styleClass="pay_meth_nm gscm_disptext" readonly="true"/>
            </td>
        </tr>
        <tr>
            <th colspan="2" class="right">
                <bean:message key="label.payTerms" />
            </th>
            <td colspan="3">
                <html:text property="w6009CriteriaDomain.payTerms" styleClass="pay_terms gscm_disptext" readonly="true"/>
            </td>
        </tr>
        <tr>
            <th colspan="2" class="right">
                <bean:message key="label.remLcTyp" />
            </th>
            <td colspan="3">
                <html:radio property="w6009CriteriaDomain.remLcTyp" value="R" onclick="gscm.commonSubmit('W6009RadioRemittanceOrLc.do', this.form);" /><bean:message key="label.remittance"/>
                <html:radio property="w6009CriteriaDomain.remLcTyp" value="L" onclick="gscm.commonSubmit('W6009RadioRemittanceOrLc.do', this.form);" /><bean:message key="label.lc" />
            </td>
        </tr>
        <tr>
            <th rowspan="5" class="right">
                <bean:message key="label.remittance" />
            </th>
            <th class="right">
                <bean:message key="label.remBankNm" />
            </th>
            <td colspan="3">
                 <html:text property="w6009CriteriaDomain.remBankNm" maxlength="25" styleClass="rem_bank_nm gscm_required" errorStyleClass="rem_bank_nm gscm_error_class"/>
            </td>
        </tr>
        <tr>
            <th rowspan="3" class="right">
                <bean:message key="label.remBankAddr" />
            </th>
            <td colspan="3">
                 <html:text property="w6009CriteriaDomain.remBankAddress1" maxlength="25" styleClass="rem_bank_addr gscm_required" errorStyleClass="rem_bank_addr gscm_error_class"/>
            </td>
        </tr>
        <tr>
            <td colspan="3">
                 <html:text property="w6009CriteriaDomain.remBankAddress2" maxlength="25" styleClass="rem_bank_addr" errorStyleClass="rem_bank_addr gscm_error_class"/>
            </td>
        </tr>
        <tr>
            <td colspan="3">
                 <html:text property="w6009CriteriaDomain.remBankAddress3" maxlength="25" styleClass="rem_bank_addr" errorStyleClass="rem_bank_addr gscm_error_class"/>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.remBankAccountNo" />
            </th>
            <td colspan="3">
                 <html:text property="w6009CriteriaDomain.remBankAccountNo" maxlength="15" styleClass="rem_bank_account_no gscm_required" errorStyleClass="rem_bank_account_no gscm_error_class"/>
            </td>
        </tr>
        <tr>
            <th rowspan="3" class="right">
                <bean:message key="label.lc" />
            </th>
            <th class="right">
                <bean:message key="label.lcBank" />
            </th>
            <td>
                 <html:text property="w6009CriteriaDomain.lcBankNm1" maxlength="25" styleClass="lc_bank gscm_required" errorStyleClass="lc_bank gscm_error_class"/>
            </td>
            <td colspan="2">
                 <html:text property="w6009CriteriaDomain.lcBankNm2" maxlength="25" styleClass="lc_bank" errorStyleClass="lc_bank gscm_error_class"/>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.lcNo" />
            </th>
            <td colspan="3">
                 <html:text property="w6009CriteriaDomain.lcNo" maxlength="30" styleClass="lc_no gscm_required" errorStyleClass="lc_no gscm_error_class"/>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.lcDt" />
            </th>
            <td colspan="3">
                <html:text property="w6009CriteriaDomain.lcDt" maxlength="8" styleId="lc_dt" styleClass="lc_dt gscm_required" errorStyleClass="lc_dt gscm_error_class"/>
                <img src="images/gscm/library/Calendar.gif"
                    onClick = "showCalendar('lc_dt', 'lcDtDiv', 'mainForm', 'w6009CriteriaDomain.lcDt', '<bean:message key="format.screen.yyyymmdd" />', this);"/>
                <div id="lcDtDiv" style="float:left;"></div>
            </td>
        </tr>
    </table>
    <br />

    <%--
    -- Amount Information
    --%>
    <div class="box_title">
        &lt;<bean:message key="label.boxTitleAmountInformation" />&gt;
    </div>
    <table class="grid">
        <colgroup>
            <col class="grid_header" />
            <col class="grid_contents" />
            <col class="grid_header" />
            <col />
        </colgroup>
        <tr>
            <th class="right">
                <bean:message key="label.currCd" />
            </th>
            <td colspan="3">
                <html:text property="w6009CriteriaDomain.currCd" styleClass="curr_cd gscm_disptext" readonly="true"/>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.netAmount" />
            </th>
            <td colspan="3">
                <html:text property="w6009CriteriaDomain.netAmount" styleClass="net_amount right gscm_disptext" readonly="true"/>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.freight" />
            </th>
            <td colspan="3">
                <html:text property="w6009CriteriaDomain.freight" maxlength="18" styleClass="freight right gscm_required" errorStyleClass="freight right gscm_error_class"/>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.insurance" />
            </th>
            <td colspan="3">
                <html:text property="w6009CriteriaDomain.insurance" maxlength="18" styleClass="insurance right gscm_required" errorStyleClass="insurance right gscm_error_class"/>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.subTotal" />
            </th>
            <td colspan="3">
                <html:text property="w6009CriteriaDomain.subTotal" maxlength="18" styleClass="sub_total right gscm_disptext" readonly="true"/>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.handlingCharge" />
            </th>
            <td colspan="3">
                <html:text property="w6009CriteriaDomain.handlingCharge" maxlength="18" styleClass="handling_charge right gscm_required" errorStyleClass="handling_charge right gscm_error_class"/>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.additionalCharge" />
            </th>
            <td>
                <html:text property="w6009CriteriaDomain.additionalCharge" maxlength="18" styleClass="additional_charge right gscm_required" errorStyleClass="additional_charge right gscm_error_class"/>
            </td>
            <th class="right">
                <bean:message key="label.additionalChargeNm" />
            </th>
            <td>
                <html:select property="w6009CriteriaDomain.additionalChargeCd" styleId="additional_charge_nm" styleClass="additional_charge_nm" errorStyleClass="additional_charge_nm gscm_error_class">
                    <html:options collection="additionalChargeCd" property="id" labelProperty="name"/>
                </html:select>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.vat" />
            </th>
            <td>
                <html:text property="w6009CriteriaDomain.vat" maxlength="18" styleClass="vat right gscm_disptext" readonly="true"/>
            </td>
            <th class="right">
                <bean:message key="label.vatRatio" />
            </th>
            <td>
                <html:text property="w6009CriteriaDomain.vatRatio" maxlength="6" styleClass="vat_ratio right gscm_required" errorStyleClass="vat_ratio right gscm_error_class"/>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.totalInvoiceAmount" />
            </th>
            <td colspan="3">
                <html:text property="w6009CriteriaDomain.totalInvoiceAmount" maxlength="18" styleClass="total_invoice_amount right gscm_disptext" readonly="true"/>
                <html:button property="calculate" onclick="gscm.commonSubmit('W6009CalculateAmount.do', this.form);" styleClass="calculate">
                    <bean:message key="button.calculate" />
                </html:button>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.noCharge" />
            </th>
            <td colspan="3">
                <html:text property="w6009CriteriaDomain.noCharge" styleClass="no_charge right gscm_disptext" readonly="true"/>
            </td>
        </tr>
    </table>
    <br />

    <%--
    -- PKG Information
    --%>
    <div class="box_title">
        &lt;<bean:message key="label.boxTitlePkgInformation" />&gt;
    </div>
    <table class="grid">
        <colgroup>
            <col class="grid_header" />
            <col class="grid_contents" />
            <col class="grid_header_total" />
            <col class="grid_contents_total" />
            <col class="grid_header_total" />
            <col />
        </colgroup>
        <tr>
            <th class="right">
                <bean:message key="label.pltzItemQty" />
            </th>
            <td colspan="5">
                <html:text property="w6009CriteriaDomain.pltzItemQty" styleClass="pltz_item_qty right gscm_disptext" readonly="true"/>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.volumeUnit" />
            </th>
            <td>
                <html:text property="w6009CriteriaDomain.volumeUnitDisp" styleClass="volume_unit gscm_disptext" readonly="true"/>
            </td>
            <th class="right">
                <bean:message key="label.totalVolume" />
            </th>
            <td colspan="3">
                <html:text property="w6009CriteriaDomain.totalVolume" styleClass="total_volume right gscm_disptext" readonly="true"/>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.weightUnit" />
            </th>
            <td>
                <html:text property="w6009CriteriaDomain.weightUnitDisp" styleClass="weight_unit gscm_disptext" readonly="true"/>
            </td>
            <th class="right">
                <bean:message key="label.totalNetWeight" />
            </th>
            <td>
                <html:text property="w6009CriteriaDomain.totalNetWeight" styleClass="total_net_weight right gscm_disptext" readonly="true"/>
            </td>
            <th class="right">
                <bean:message key="label.totalGrossWeight" />
            </th>
            <td>
                <html:text property="w6009CriteriaDomain.totalGrossWeight" styleClass="total_gross_weight right gscm_disptext" readonly="true"/>
            </td>
        </tr>
    </table>
    <br />

    <%--
    -- Invoice Attached Header Information
    --%>
    <div class="box_title">
        &lt;<bean:message key="label.boxTitleInvoiceAttachedHeaderInformation" />&gt;
        &lt;<bean:message key="label.boxTitleCheckIfItNeedsToAppearOnInvoice" />&gt;
    </div>
    <table class="grid">
        <colgroup>
            <col class="grid_header" />
            <col />
        </colgroup>
        <tr>
            <th class="right">
                <bean:message key="label.free1DispFlg" />
            </th>
            <td>
                <html:checkbox property="w6009CriteriaDomain.free1DispFlg"/>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.free2DispFlg" />
            </th>
            <td>
                <html:checkbox property="w6009CriteriaDomain.free2DispFlg"/>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.free3DispFlg" />
            </th>
            <td>
                <html:checkbox property="w6009CriteriaDomain.free3DispFlg"/>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.free4DispFlg" />
            </th>
            <td>
                <html:checkbox property="w6009CriteriaDomain.free4DispFlg"/>
            </td>
        </tr>
    </table>
    <br />

    <%--
    -- Others Information
    --%>
    <div class="box_title">
        &lt;<bean:message key="label.boxTitleOthersInformation" />&gt;
    </div>
    <table class="grid">
        <colgroup>
            <col class="grid_header" />
            <col />
        </colgroup>
        <tr>
            <th class="right">
                <bean:message key="label.spInfo" />
            </th>
            <td>
                <html:textarea property="w6009CriteriaDomain.spInfo" styleClass="w6009_break_all monospace" errorStyleClass="w6009_break_all monospace gscm_error_class" cols="30" rows="5"/>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.bookingNo" />
            </th>
            <td>
                <html:text property="w6009CriteriaDomain.bookingNo" maxlength="15" styleClass="booking_no" errorStyleClass="search_bookingNo gscm_error_class" />
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.notifyParty1" />
            </th>
            <td>
                <html:button property="selectNotifyParty1" onclick="selectCompanyNotifyParty('notifyParty1CompCd', 'notifyParty1CompNmAbb', 'notifyParty1Nm', 'notifyParty1Addr');" styleClass="select">
                    <bean:message key="button.select" />
                </html:button>
                <span id="notifyParty1CompCd">${W6009Form.w6009CriteriaDomain.notifyParty1CompCd}&nbsp;/</span>
                <span id="notifyParty1CompNmAbb">${W6009Form.w6009CriteriaDomain.notifyParty1CompNmAbb}</span>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.notifyParty1Nm" />
            </th>
            <td>
                <html:text property="w6009CriteriaDomain.notifyParty1Nm" maxlength="150" styleClass="notify_party_nm" errorStyleClass="notify_party_nm gscm_error_class"/>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.notifyParty1Addr" />
            </th>
            <td>
                <html:text property="w6009CriteriaDomain.notifyParty1Addr" maxlength="200" styleClass="notify_party_addr" errorStyleClass="notify_party_addr gscm_error_class"/>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.notifyParty2" />
            </th>
            <td>
                <html:button property="selectNotifyParty2" onclick="selectCompanyNotifyParty('notifyParty2CompCd', 'notifyParty2CompNmAbb', 'notifyParty2Nm', 'notifyParty2Addr');" styleClass="select">
                    <bean:message key="button.select" />
                </html:button>
                <span id="notifyParty2CompCd">${W6009Form.w6009CriteriaDomain.notifyParty2CompCd}&nbsp;/</span>
                <span id="notifyParty2CompNmAbb">${W6009Form.w6009CriteriaDomain.notifyParty2CompNmAbb}</span>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.notifyParty2Nm" />
            </th>
            <td>
                <html:text property="w6009CriteriaDomain.notifyParty2Nm" maxlength="150" styleClass="notify_party_nm" errorStyleClass="notify_party_nm gscm_error_class"/>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.notifyParty2Addr" />
            </th>
            <td>
                <html:text property="w6009CriteriaDomain.notifyParty2Addr" maxlength="200" styleClass="notify_party_addr" errorStyleClass="notify_party_addr gscm_error_class"/>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.notifyParty3" />
            </th>
            <td>
                <html:button property="selectNotifyParty3" onclick="selectCompanyNotifyParty('notifyParty3CompCd', 'notifyParty3CompNmAbb', 'notifyParty3Nm', 'notifyParty3Addr');" styleClass="select">
                    <bean:message key="button.select" />
                </html:button>
                <span id="notifyParty3CompCd">${W6009Form.w6009CriteriaDomain.notifyParty3CompCd}&nbsp;/</span>
                <span id="notifyParty3CompNmAbb">${W6009Form.w6009CriteriaDomain.notifyParty3CompNmAbb}</span>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.notifyParty3Nm" />
            </th>
            <td>
                <html:text property="w6009CriteriaDomain.notifyParty3Nm" maxlength="150" styleClass="notify_party_nm" errorStyleClass="notify_party_nm gscm_error_class"/>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.notifyParty3Addr" />
            </th>
            <td>
                <html:text property="w6009CriteriaDomain.notifyParty3Addr" maxlength="200" styleClass="notify_party_addr" errorStyleClass="notify_party_addr gscm_error_class"/>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.notifyParty4" />
            </th>
            <td>
                <html:button property="selectNotifyParty4" onclick="selectCompanyNotifyParty('notifyParty4CompCd', 'notifyParty4CompNmAbb', 'notifyParty4Nm', 'notifyParty4Addr');" styleClass="select">
                    <bean:message key="button.select" />
                </html:button>
                <span id="notifyParty4CompCd">${W6009Form.w6009CriteriaDomain.notifyParty4CompCd}&nbsp;/</span>
                <span id="notifyParty4CompNmAbb">${W6009Form.w6009CriteriaDomain.notifyParty4CompNmAbb}</span>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.notifyParty4Nm" />
            </th>
            <td>
                <html:text property="w6009CriteriaDomain.notifyParty4Nm" maxlength="150" styleClass="notify_party_nm" errorStyleClass="notify_party_nm gscm_error_class"/>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.notifyParty4Addr" />
            </th>
            <td>
                <html:text property="w6009CriteriaDomain.notifyParty4Addr" maxlength="200" styleClass="notify_party_addr" errorStyleClass="notify_party_addr gscm_error_class"/>
            </td>
        </tr>
    </table>

    <%--
    -- buttons 2
    --%>
    <table class="gscm_search_button">
        <colgroup>
            <col />
        </colgroup>
        <tr>
            <td class="right">
                <bean:define id="confirmMessageRegister"><bean:message key="GSCM-I0-0003" locale="${locale_key}" /></bean:define>
                <html:button property="register" onclick="gscm.submitConfirm('W6009Register.do', this.form, '${confirmMessageRegister}');" styleClass="register">
                    <bean:message key="button.register" />
                </html:button>
                <bean:define id="confirmMessageCancel"><bean:message key="NXS-I1-0009" locale="${locale_key}" /></bean:define>
                <html:button property="cancel" onclick="gscm.submitConfirm('W6009Cancel.do', this.form, '${confirmMessageCancel}');" styleClass="cancel">
                    <bean:message key="button.cancel" />
                </html:button>
            </td>
        </tr>
    </table>
    
    <%--
    -- hidden
    --%>
    <html:hidden property="w6009CriteriaDomain.grpNo1" />
    <html:hidden property="w6009CriteriaDomain.grpNo2" />
    <html:hidden property="w6009CriteriaDomain.cmlTyp" />
    <html:hidden property="w6009CriteriaDomain.invoiceCtgry" />
    <html:hidden property="w6009CriteriaDomain.freightResponsibleNm" />
    <html:hidden property="w6009CriteriaDomain.payMeth" />
    <html:hidden property="w6009CriteriaDomain.customerCd" />
    <html:hidden property="w6009CriteriaDomain.originalScreenId" />
    <html:hidden property="w6009CriteriaDomain.digit" />
    <html:hidden property="w6009CriteriaDomain.notifyParty1CompCd" />
    <html:hidden property="w6009CriteriaDomain.notifyParty1CompNmAbb" />
    <html:hidden property="w6009CriteriaDomain.notifyParty2CompCd" />
    <html:hidden property="w6009CriteriaDomain.notifyParty2CompNmAbb" />
    <html:hidden property="w6009CriteriaDomain.notifyParty3CompCd" />
    <html:hidden property="w6009CriteriaDomain.notifyParty3CompNmAbb" />
    <html:hidden property="w6009CriteriaDomain.notifyParty4CompCd" />
    <html:hidden property="w6009CriteriaDomain.notifyParty4CompNmAbb" />
    
    <html:hidden property="callScreenId" />
</html:form>
