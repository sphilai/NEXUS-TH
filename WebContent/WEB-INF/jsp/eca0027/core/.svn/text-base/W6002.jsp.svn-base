<%--
 * Project : GSCM
 * 
 * W6002 - Manual Invoice Upload
 *
 * $Revision: 12132 $
 * 
 * Copyright (c) 2013 DENSO CORPORATION. All rights reserved.
 --%>

<html:form action="/W6002Init" styleId="mainForm" enctype="multipart/form-data">
    <%--
    -- buttons 1
    --%>
    <table class="gscm_search_button">
        <colgroup>
            <col />
        </colgroup>
        <tr>
            <td>
                <html:button property="backToMainScreen" onclick="gscm.submitBack('W6001Init.do', this.form);" styleClass="back_to_main_screen">
                    <bean:message key="button.backToMainScreen" />
                </html:button>
            </td>
        </tr>
    </table>

    <%--
    -- Export Basic Information
    --%>
    <div class="box_title">
        &lt;
        <bean:message key="label.boxTitleExportBasicInformation" />
        &gt;
    </div>
    <table class="grid">
        <colgroup>
            <col class="grid_header"/>
            <col>
        </colgroup>
        <tr>
            <th>
                <bean:message key="label.documentType" />
            </th>
            <td>
               <bean:write name="W6002Form" property="w6002CriteriaDomain.documentType" />
            </td>
        </tr>
        <tr>
            <th>
                <bean:message key="label.typeOfInv" />
            </th>
            <td>
                <%-- ST947 ADD onchange --%>
                <html:select property="w6002CriteriaDomain.typeOfInv" styleId="typeOfInv" styleClass="w6002_type_of_inv gscm_required" errorStyleClass="w6002_type_of_inv gscm_error_class" onchange="disableControlPackingList();">
                    <html:options collection="typeOfInv" property="id" labelProperty="name"/>
                </html:select>
            </td>
        </tr>
        <tr>
            <th>
                <bean:message key="label.classOfInv" />
            </th>
            <td>
                <html:select property="w6002CriteriaDomain.classOfInv" styleId="classOfInv" styleClass="w6002_class_of_inv gscm_required" errorStyleClass="w6002_class_of_inv gscm_error_class">
                    <html:options collection="classOfInv" property="id" labelProperty="name"/>
                </html:select>
            </td>
        </tr>
        <tr>
            <th>
                <bean:message key="label.invoiceCtgry" />
            </th>
            <td>
                <html:select property="w6002CriteriaDomain.invoiceCtgry" styleId="invoiceCtgry" styleClass="w6002_invoice_ctgry gscm_required" errorStyleClass="w6002_invoice_ctgry gscm_error_class">
                    <html:options collection="invoiceCtgry" property="id" labelProperty="name"/>
                </html:select>
            </td>
        </tr>
        <tr>
            <th>
                <bean:message key="label.shipperCd" />
            </th>
            <td>
                <html:text property="w6002CriteriaDomain.shipperCd" styleId="shipperCd" maxlength="5" styleClass="w6002_shipper_cd gscm_required" errorStyleClass="w6002_shipper_cd gscm_error_class" />
                <html:button property="shipSelect" styleClass="select" onclick="selectShipper();">
                    <bean:message key="button.select"/>
                </html:button>
                <html:text property="w6002CriteriaDomain.shipCompNm" styleClass="w6002_ship_to_comp_nm gscm_disptext" readonly="true" />

            </td>
        </tr>
        <tr>
            <th>
                <bean:message key="label.invNo" />
            </th>
            <td>
                <html:text property="w6002CriteriaDomain.invoiceNo" styleId="invoiceNo" maxlength="20" styleClass="w6002_invoice_no gscm_required" errorStyleClass="w6002_invoice_no gscm_error_class" />
            </td>
        </tr>
        <tr>
            <th>
                <bean:message key="label.consigneeCd" />
            </th>
            <td>
                <html:text property="w6002CriteriaDomain.consigneeCd" styleId="consigneeCd" maxlength="5" styleClass="w6002_consignee_cd gscm_required" errorStyleClass="w6002_consignee_cd gscm_error_class" />
                <html:button property="consSelect" styleClass="select" onclick="selectConsignee();">
                    <bean:message key="button.select" />
                </html:button>
                <html:text property="w6002CriteriaDomain.consCompNm" styleClass="w6002_cons_comp_nm gscm_disptext" readonly="true" />
            </td>
        </tr>
        <tr>
            <th>
                <bean:message key="W6002.label.shipToCd" />
            </th>
            <td>
                <html:text property="w6002CriteriaDomain.shipToCd" styleId="shipToCd" maxlength="7" styleClass="ship_to_cd gscm_required" errorStyleClass="ship_to_cd gscm_error_class" />
                <html:button property="nexusSelect" styleClass="select" onclick="selectShipTo();">
                    <bean:message key="button.select" />
                </html:button>
                <html:text property="w6002CriteriaDomain.shipToNm" styleClass="w6002_ship_to_nm gscm_disptext" readonly="true" />
            </td>
        </tr>
        <tr>
            <th>
                <bean:message key="label.trnsCd" />
            </th>
            <td>
                <html:select property="w6002CriteriaDomain.trnsCd" styleId="trnsCd" styleClass="w6002_trns_cd gscm_required" errorStyleClass="w6002_trns_cd gscm_error_class" >
                    <html:options collection="trnsCd" property="id" labelProperty="name"/>
                </html:select>
            </td>
        </tr>
        <tr>
            <th>
                <bean:message key="label.relateInvoiceShipperCd" />
            </th>
            <td>
                <html:text property="w6002CriteriaDomain.relateInvoiceShipperCd" maxlength="5" styleClass="w6002_relate_invoice_shipper_cd" errorStyleClass="w6002_relate_invoice_shipper_cd gscm_error_class"/>
                <html:button property="refSelect" styleClass="select" onclick="selectReferenceInvShipper();">
                    <bean:message key="button.select" />
                </html:button>
                <html:text property="w6002CriteriaDomain.relateShipToNm" styleClass="w6002_relate_ship_to_nm gscm_disptext" readonly="true" />
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.relateInvoiceNo" />
            </th>
            <td>
                <html:text property="w6002CriteriaDomain.relateInvoiceNo" maxlength="20" styleClass="w6002_relate_invoice_no" errorStyleClass="w6002_relate_invoice_no gscm_error_class" />
            </td>
        </tr>
    </table>
    <br />


    <%--
    -- Terms/Remittance Information
    --%>
    <div class="box_title">
        &lt;
        <bean:message key="label.boxTitleTermsRemittanceInformation" />
        &gt;
    </div>
    <table class="grid">
        <colgroup>
            <col class="grid_header_half"/>
            <col class="grid_header_half"/>
            <col class="grid_contents"/>
            <col class="grid_header"/>
            <col />
        </colgroup>
        <tr>
            <th colspan="2">
                <bean:message key="label.dlivPoint" />
            </th>
            <td colspan="3">
                 <html:text property="w6002CriteriaDomain.dlivPoint" maxlength="15" styleClass="w6002_dliv_point" errorStyleClass="w6002_dliv_point gscm_error_class"/>
            </td>
        </tr>
        <tr>
            <th colspan="2">
                <bean:message key="label.freightRes" />
            </th>
            <td colspan="3">
                <html:select property="w6002CriteriaDomain.freightRes" styleId="freightRes" styleClass="w6002_freight_res gscm_required" errorStyleClass="w6002_freight_res gscm_error_class" >
                    <html:options collection="freightRes" property="id" labelProperty="name"/>
                </html:select>
            </td>
        </tr>
        <tr>
            <th colspan="2">
                <bean:message key="label.priceTerms" />
            </th>
            <td colspan="3">
                <html:select property="w6002CriteriaDomain.priceTerms" styleId="price_terms" styleClass="w6002_price_terms" errorStyleClass="w6002_price_terms gscm_error_class">
                    <html:options collection="priceTerms" property="id" labelProperty="name"/>
                </html:select>
            </td>
        </tr>
        <tr>
            <th colspan="2">
                <bean:message key="label.tradeTerms" />
            </th>
            <td>
                <html:select property="w6002CriteriaDomain.tradeTerms" styleId="trade_terms" styleClass="w6002_trade_terms" errorStyleClass="w6002_trade_terms gscm_error_class" >
                    <html:options collection="tradeTerms" property="id" labelProperty="name"/>
                </html:select>
            </td>
            <th>
                <bean:message key="label.termsPoint" />
            </th>
            <td>
                <html:text property="w6002CriteriaDomain.termsPoint" maxlength="20" styleClass="w6002_terms_point" errorStyleClass="w6002_terms_point gscm_error_class"/>
            </td>
        </tr>
        <tr>
            <th colspan="2">
                <bean:message key="label.paymentMethod" />
            </th>
            <td colspan="3">
                <html:select property="w6002CriteriaDomain.paymentMethod" styleId="payment_method" styleClass="w6002_payment_method" errorStyleClass="w6002_payment_method gscm_error_class">
                    <html:options collection="paymentMethod" property="id" labelProperty="name"/>
                </html:select>
            </td>
        </tr>
        <tr>
            <th colspan="2">
                <bean:message key="label.payTerms" />
            </th>
            <td colspan="3">
                 <html:text property="w6002CriteriaDomain.payTerms" maxlength="30" styleClass="w6002_pay_terms" errorStyleClass="w6002_pay_terms gscm_error_class"/>
            </td>
        </tr>
        <tr>
            <th colspan="2">
                <bean:message key="label.remittanceOrLc" />
            </th>
            <td colspan="3">
                <html:radio property="w6002CriteriaDomain.remittanceOrLc" styleId="remittanceOrLc" value="R" onclick="gscm.commonSubmit('W6002SelectRadioRemittanceOrLc.do', this.form);" />
                <bean:message key="label.remittance" />
                <html:radio property="w6002CriteriaDomain.remittanceOrLc" styleId="remittanceOrLc" value="L" onclick="gscm.commonSubmit('W6002SelectRadioRemittanceOrLc.do', this.form);" />
                <bean:message key="label.lc" />
            </td>
        </tr>
        <tr>
            <th rowspan="5">
                <bean:message key="label.remittance" />
            </th>
            <th>
                <bean:message key="label.remBankNm" />
            </th>
            <td colspan="3">
                 <html:text property="w6002CriteriaDomain.remBankNm" styleId="remBankNm" maxlength="25" styleClass="w6002_rem_bank_nm" errorStyleClass="w6002_rem_bank_nm gscm_error_class"/>
            </td>
        </tr>
        <tr>
            <th rowspan="3">
                <bean:message key="label.address" />
            </th>
            <td colspan="3">
                 <html:text property="w6002CriteriaDomain.remBankAddress1" styleId="remBankAddress1" maxlength="25" styleClass="w6002_rem_bank_address" errorStyleClass="w6002_rem_bank_address gscm_error_class"/>
            </td>
        </tr>
        <tr>
            <td colspan="3">
                 <html:text property="w6002CriteriaDomain.remBankAddress2" maxlength="25" styleClass="w6002_rem_bank_address" errorStyleClass="w6002_rem_bank_address gscm_error_class"/>
            </td>
        </tr>
        <tr>
            <td colspan="3">
                 <html:text property="w6002CriteriaDomain.remBankAddress3" maxlength="25" styleClass="w6002_rem_bank_address" errorStyleClass="w6002_rem_bank_address gscm_error_class"/>
            </td>
        </tr>
        <tr>
            <th nowrap>
                <bean:message key="label.remBankAccountNo" />
            </th>
            <td colspan="3">
                 <html:text property="w6002CriteriaDomain.remBankAccountNo" styleId="remBankAccountNo" maxlength="15" styleClass="w6002_rem_bank_account_no" errorStyleClass="w6002_rem_bank_account_no gscm_error_class"/>
            </td>
        </tr>
        <tr>
            <th class="right" rowspan="3">
                <bean:message key="label.lc" />
            </th>
            <th>
                <bean:message key="label.bankName" />
            </th>
            <td>
                 <html:text property="w6002CriteriaDomain.lcBank1" styleId="lcBank1" maxlength="50" styleClass="w6002_lc_bank" errorStyleClass="w6002_lc_bank gscm_error_class"/>
            </td>
            <td colspan="2">
                 <html:text property="w6002CriteriaDomain.lcBank2" maxlength="25" styleClass="w6002_lc_bank" errorStyleClass="w6002_lc_bank gscm_error_class" />
            </td>
        </tr>
        <tr>
            <th>
                <bean:message key="label.lcNo" />
            </th>
            <td colspan="3">
                 <html:text property="w6002CriteriaDomain.lcNo" styleId="lcNo" maxlength="16" styleClass="w6002_lc_no" errorStyleClass="w6002_lc_no gscm_error_class"/>
            </td>
        </tr>
        <tr>
            <th>
                <bean:message key="label.lcDt" />
            </th>
            <td colspan="3">
                <html:text property="w6002CriteriaDomain.lcDt" maxlength="8" styleId="lcDt" styleClass="date" errorStyleClass="date gscm_error_class"/>
                <img src="images/gscm/library/Calendar.gif"
                    onClick = "showCalendar('lcDt', 'lcDateDiv', 'mainForm', 'w6002CriteriaDomain.lcDt', '<bean:message key="format.screen.yyyymmdd" />', this);"/>
                <div id="lcDateDiv" style="float:left;"></div>
            </td>
        </tr>
    </table>
    <br />


    <%--
    -- Amount Information
    --%>
    <div class="box_title">
        &lt;
        <bean:message key="label.boxTitleAmountInformation" />
        &gt;
    </div>
    <table class="grid">
        <colgroup>
            <col class="grid_header"/>
            <col class="grid_contents_main"/>
            <col class="grid_header"/>
            <col />
        </colgroup>
        <tr>
            <th>
                <bean:message key="label.currCd" />
            </th>
            <td colspan="3">
                <html:select property="w6002CriteriaDomain.currCd" styleId="curr_cd" styleClass="w6002_curr_cd" >
                    <html:options collection="currCd" property="id" labelProperty="name"/>
                </html:select>
            </td>
        </tr>
        <tr>
            <th>
                <bean:message key="label.netAmount" />
            </th>
            <td colspan="3">
                <html:text property="w6002CriteriaDomain.netAmount" maxlength="18" styleClass="w6002_net_amount right" errorStyleClass="w6002_net_amount right gscm_error_class"/>
            </td>
        </tr>
        <tr>
            <th>
                <bean:message key="label.freight" />
            </th>
            <td colspan="3">
                <html:text property="w6002CriteriaDomain.freight" maxlength="18" styleClass="w6002_freight right" errorStyleClass="w6002_freight right gscm_error_class"/>
            </td>
        </tr>
        <tr>
            <th>
                <bean:message key="label.insurance" />
            </th>
            <td colspan="3">
                <html:text property="w6002CriteriaDomain.insurance" maxlength="18" styleClass="w6002_insurance right" errorStyleClass="w6002_insurance right gscm_error_class"/>
            </td>
        </tr>
        <tr>
            <th>
                <bean:message key="label.subTotal" />
            </th>
            <td colspan="3">
                <div class="w6002_total_invoice_amount right"><%-- ST948 ADD --%>
                    <bean:write name="W6002Form" property="w6002CriteriaDomain.subTotal" />
                </div>
            </td>
        </tr>
        <tr>
            <th>
                <bean:message key="label.handlingCharge" />
            </th>
            <td colspan="3">
                <html:text property="w6002CriteriaDomain.handlingCharge" maxlength="18" styleClass="w6002_handling_charge right" errorStyleClass="w6002_handling_charge right gscm_error_class" />
            </td>
        </tr>
        <tr>
            <th>
                <bean:message key="label.additionalCharge" />
            </th>
            <td>
                <html:text property="w6002CriteriaDomain.additionalCharge" maxlength="18" styleClass="w6002_free_additional right" errorStyleClass="w6002_free_additional right gscm_error_class"/>
            </td>
            <th>
                <bean:message key="label.additionalChargeNm" />
            </th>
            <td>
                <html:text property="w6002CriteriaDomain.additionalChargeNm" maxlength="20" styleClass="w6002_additional_charge_nm" errorStyleClass="w6002_additional_charge_nm gscm_error_class" />
            </td>
        </tr>
        <tr>
            <th>
                <bean:message key="label.vat" />
            </th>
            <td>
                <html:text property="w6002CriteriaDomain.vat" maxlength="18" styleClass="w6002_vat right" errorStyleClass="w6002_vat right gscm_error_class" />
            </td>
            <th>
                <bean:message key="label.vatRatio" />
            </th>
            <td>
                <html:text property="w6002CriteriaDomain.vatRatio" maxlength="6" styleClass="w6002_vat_ratio right" errorStyleClass="w6002_vat_ratio right gscm_error_class" />
            </td>
        </tr>
        <tr>
            <th>
                <bean:message key="label.totalAmount" />
            </th>
            <td colspan="3">
                <div class="w6002_total_invoice_amount right">
                    <bean:write name="W6002Form" property="w6002CriteriaDomain.totalInvoiceAmount" />
                </div>
            </td>
        </tr>
    </table>
    <br />


    <%--
    -- PKG Information
    --%>
    <div class="box_title">
        &lt;
        <bean:message key="label.boxTitlePkgInformation" />
        &gt;
    </div>    
    <table class="grid">
        <colgroup>
            <col class="grid_header"/>
            <col class="grid_contents_main"/>
            <col class="grid_header_sub"/>
            <col class="grid_contents_sub"/>
            <col class="grid_header_sub"/>
            <col />
        </colgroup>
        <tr>
            <th>
                <bean:message key="label.pltzItemQty" />
            </th>
            <td colspan="5">
                <html:text property="w6002CriteriaDomain.pltzItemQty" maxlength="7" styleClass="w6002_pltz_item_qty right" errorStyleClass="w6002_pltz_item_qty right gscm_error_class" />
            </td>
        </tr>
        <tr>
            <th>
                <bean:message key="label.volumeUnit" />
            </th>
            <td>
                <html:select property="w6002CriteriaDomain.volumeUnit" styleId="volume_unit" styleClass="w6002_volume_unit" errorStyleClass="w6002_volume_unit gscm_error_class" >
                    <html:options collection="volumeUnit" property="id" labelProperty="name"/>
                </html:select>
            </td>
            <th>
                <bean:message key="label.totalVolume" />
            </th>
            <td colspan="3">
                <html:text property="w6002CriteriaDomain.totalVolume" maxlength="16" styleClass="w6002_total_volume right" errorStyleClass="w6002_total_volume right gscm_error_class"/>
            </td>
        </tr>
        <tr>
            <th>
                <bean:message key="label.weightUnit" />
            </th>
            <td>
                <html:select property="w6002CriteriaDomain.weightUnit" styleId="weight_unit" styleClass="w6002_weight_unit" errorStyleClass="w6002_weight_unit gscm_error_class">
                    <html:options collection="weightUnit" property="id" labelProperty="name"/>
                </html:select>
            </td>
            <th>
                <bean:message key="label.totalNetWeight" />
            </th>
            <td>
                <html:text property="w6002CriteriaDomain.totalNetWeight" maxlength="11" styleClass="w6002_total_net_weight right" errorStyleClass="w6002_total_net_weight right gscm_error_class" />
            </td>
            <th>
                <bean:message key="label.totalGrossWeight" />
            </th>
            <td>
                <html:text property="w6002CriteriaDomain.totalGrossWeight" maxlength="11" styleClass="w6002_total_gross_weight right" errorStyleClass="w6002_total_gross_weight right gscm_error_class" />
            </td>
        </tr>
    </table>
    <br />


    <%--
    -- Port & Vessel Information
    --%>
    <div class="box_title">
        &lt;
        <bean:message key="label.boxTitlePortVesselInformation" />
        &gt;
    </div>
    <table class="grid">
        <colgroup>
            <col class="grid_header"/>
            <col class="grid_contents_date"/>
            <col class="grid_header"/>
            <col class="grid_contents_date"/>
            <col class="grid_header"/>
            <col />
        </colgroup>

        <tr>
            <th>
                <bean:message key="label.carrierCompCd" />
            </th>
            <td colspan="5">
                <html:text property="w6002CriteriaDomain.carrierCompCd" styleId="carrierCompCd" maxlength="3" styleClass="w6002_carrier_comp_cd gscm_required" errorStyleClass="w6002_carrier_comp_cd gscm_error_class" />
                <html:button property="carSelect" styleClass="select" onclick="selectCarrier();">
                    <bean:message key="button.select" />
                </html:button>
                <html:text property="w6002CriteriaDomain.carCompNm" styleClass="w6002_car_comp_nm gscm_disptext" readonly="true" />
            </td>
        </tr>
        <tr>
            <th>
                <bean:message key="label.forwarderCompCd" />
            </th>
            <td colspan="5">
                <html:text property="w6002CriteriaDomain.forwarderCompCd" styleId="forwarderCompCd" maxlength="5" styleClass="w6002_forwarder_comp_cd" errorStyleClass="w6002_forwarder_comp_cd gscm_error_class" />
                <html:button property="forSelect" styleClass="select" onclick="selectForwarder();">
                    <bean:message key="button.select" />
                </html:button>
                <html:text property="w6002CriteriaDomain.forCompNm" styleClass="w6002_for_comp_nm gscm_disptext" readonly="true" />
            </td>
        </tr>
        <tr>
            <th>
                <bean:message key="label.loadingPortCd" />
            </th>
            <td colspan="5">
                <html:text property="w6002CriteriaDomain.fmCntryCd" maxlength="2" styleClass="cntry_cd gscm_required" errorStyleClass="cntry_cd gscm_error_class"/>
                <html:text property="w6002CriteriaDomain.loadingPortCd" styleId="loadingPortCd" maxlength="3" styleClass="w6002_port_cd gscm_required" errorStyleClass="w6002_port_cd gscm_error_class" />
                <html:button property="portFromSelect" styleClass="select" onclick="selectPortFrom();" >
                    <bean:message key="button.select" />
                </html:button>
                <bean:write name="W6002Form" property="w6002CriteriaDomain.portNmFrom" />
            </td>
        </tr>
        <tr>
            <th>
                <bean:message key="label.dischargePortCd" />
            </th>
            <td colspan="5">
                <html:text property="w6002CriteriaDomain.toCntryCd" maxlength="2" styleClass="cntry_cd gscm_required" errorStyleClass="cntry_cd gscm_error_class"/>
                <html:text property="w6002CriteriaDomain.dischargePortCd" styleId="dischargePortCd" maxlength="3" styleClass="w6002_port_cd gscm_required" errorStyleClass="w6002_port_cd gscm_error_class" />
                <html:button property="portToSelect" styleClass="select" onclick="selectPortTo();" >
                    <bean:message key="button.select" />
                </html:button>
                <bean:write name="W6002Form" property="w6002CriteriaDomain.portNmTo" />
            </td>
        </tr>
        <tr>
            <th>
                <bean:message key="W6002.label.vessel" />
            </th>
            <td colspan="5">
                <html:text property="w6002CriteriaDomain.vessel" styleId="vessel" maxlength="35" styleClass="vessel gscm_required" errorStyleClass="vessel gscm_error_class"/>
            </td>
        </tr>
        <tr>
            <th>
                <bean:message key="label.etd" />
            </th>
            <td>
                <html:text property="w6002CriteriaDomain.etd" styleId="etd" maxlength="8" styleClass="date gscm_required" errorStyleClass="date gscm_error_class"/>
                <img src="images/gscm/library/Calendar.gif"
                    onClick = "showCalendar('etd', 'etdDiv', 'mainForm', 'w6002CriteriaDomain.etd', '<bean:message key="format.screen.yyyymmdd" />', this);"/>
                <div id="etdDiv" style="float:left;"></div>
            </td>
            <th>
                <bean:message key="label.eta" />
            </th>
            <td>
                <html:text property="w6002CriteriaDomain.eta" styleId="eta" maxlength="8" styleClass="date gscm_required" errorStyleClass="date gscm_error_class"/>
                <img src="images/gscm/library/Calendar.gif"
                    onClick = "showCalendar('eta', 'etaDiv', 'mainForm', 'w6002CriteriaDomain.eta', '<bean:message key="format.screen.yyyymmdd" />', this);"/>
                <div id="etaDiv" style="float:left;"></div>
            </td>
            <th>
                <bean:message key="label.arrivalTime" />
            </th>
            <td>
                <html:text property="w6002CriteriaDomain.arrivalTime" maxlength="5" styleClass="w6002_arrival_time" errorStyleClass="w6002_arrival_time gscm_error_class" />
            </td>
        </tr>
        <tr>
            <th>
                <bean:message key="label.bookingNo" />
            </th>
            <td colspan="5">
                <html:text property="w6002CriteriaDomain.bookingNo" maxlength="15" styleClass="w6002_booking_no" errorStyleClass="w6002_booking_no gscm_error_class" />
            </td>
        </tr>
    </table>
    <br />


    <%--
    -- Upload PDF File Information(Normal Inv./Cancel Inv.)
    --%>
    <div class="box_title">
        &lt;
        <bean:message key="label.boxTitleUploadPdfFileInformation" />
        &gt;
    </div>
    <table class="grid">
        <colgroup>
            <col class="grid_header" />
            <col />
        </colgroup>
        <tr>
            <th>
                <bean:message key="label.invoice2" />
            </th>
            <td>
                <%-- <input type="file" id="invoicePdfFile" style="display:none"> --%><%-- Deleted because of no use/使用なしのため削除--%>
                <html:file property="invoicePdfFile" styleId="invoicePdf" styleClass="w6002_invoice_pdf gscm_required" errorStyleClass="w6002_invoice_pdf gscm_error_class" />
            </td>
        </tr>
        <tr>
            <th>
                <bean:message key="label.packingList" />
            </th>
            <td>
                <%-- <input type="file" id="packingListPdfFile" style="display:none"> --%><%-- Deleted because of no use/使用なしのため削除--%>
                <html:file property="packingListPdfFile" styleId="packingList" styleClass="w6002_packing_list" errorStyleClass="w6002_packing_list gscm_error_class" />
            </td>
        </tr>
        <tr>
            <th>
                <bean:message key="label.originalInvNo" />
            </th>
            <td>
                <bean:write name="W6002Form" property="w6002CriteriaDomain.orgInvoiceNo" />
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
                <%-- ST943 MOD START --%>
                <%-- <html:button property="register" onclick="gscm.commonSubmit('W6002Register.do', this.form);" styleClass="button_register"> --%>
                <c:set var="cfmMsgNoFile">
                    <bean:message key="NXS-I1-0013" />
                </c:set>
                <html:button property="register" onclick="doRegister('W6002Register.do', this.form, '${cfmMsgNoFile}');" styleClass="button_register">
                <%-- ST943 MOD END --%>
                    <bean:message key="button.register" />
                </html:button>
                <html:button property="skip" onclick="gscm.commonSubmit('W6002Skip.do', this.form);" styleClass="button_skip">
                    <bean:message key="button.skip" />
                </html:button>
            </td>
        </tr>
    </table>
    
    <%--
    -- hidden
    --%>
    <html:hidden property="callScreenId" />
    <html:hidden property="w6002CriteriaDomain.functionNo" styleId="functionNo"/>
    <html:hidden property="w6002CriteriaDomain.takeOverFrtContainFlg" />
    <html:hidden property="w6002CriteriaDomain.cntryCd" styleId="cntryCd"/>
    <logic:notEmpty name="W6002Form" property="w6002CriteriaDomain.comUpdateTimestamp">
        <html:hidden property="w6002CriteriaDomain.comUpdateTimestamp" />
    </logic:notEmpty>
    <%-- <html:hidden property="w6002CriteriaDomain.takeOverShipperCd" /> ST946 MANUAL SCREEN TRANSITION DEL --%>
    <%-- <html:hidden property="w6002CriteriaDomain.takeOverParInvoiceNo" /> ST946 MANUAL SCREEN TRANSITION DEL --%>
    <%-- <html:hidden property="w6002CriteriaDomain.takeOverInvoiceNo" /> ST946 MANUAL SCREEN TRANSITION DEL --%>
    <%-- <html:hidden property="w6002CriteriaDomain.takeOverInvoiceIssueDt" /> ST184 INVOICE ISSUE DATE/インボイス発行日 DEL --%>
    <%-- <html:hidden property="w6002CriteriaDomain.sortInvoice" /> ST946 MANUAL SCREEN TRANSITION DEL --%>
    <%-- <html:hidden property="w6002CriteriaDomain.confirmMsg" /> ST943 DEL --%>
    <%-- <html:hidden property="w6002CriteriaDomain.continueFlag" /> ST943 DEL --%>
</html:form>
