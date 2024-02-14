<%--
 * Project : GSCM
 * 
 * W6001 - Invoice Main Screen
 *
 * $Revision: 11679 $
 * 
 * Copyright (c) 2013 DENSO CORPORATION. All rights reserved.
 --%>

<html:form action="/W6001Search" styleId="mainForm">
    <%--
    -- search condition 1
    --%>
    <table class="gscm_search">
        <colgroup>
            <col class="search_shipper_cd" />
            <col class="search_consignee_cd" />
            <col class="search_ship_to_cd" />
            <col class="search_trns_cd" />
            <col class="search_cancel_typ" />
            <col class="search_cancel_flg" />
            <col class="search_cml_typ" />
            <col class="search_by" />
            <col class="search_fm_date" />
            <col class="search_to_date" />
        </colgroup>
        <tr>
            <th>
                <bean:message key="label.shipperCd" />
            </th>
            <th>
                <bean:message key="label.consigneeCd" />
            </th>
            <th>
                <bean:message key="W6001.label.shipToCd" />
            </th>
            <th>
                <bean:message key="label.trnsCd" />
            </th>
            <th>
                <bean:message key="W6001.label.cancelTyp" />
            </th>
            <th>
                <bean:message key="W6001.label.cancelFlg" />
            </th>
            <th>
                <bean:message key="label.cmlType" />
            </th>
            <th class="table_border_top_left">
                <bean:message key="label.by" />
            </th>
            <th class="table_border_top">
                <bean:message key="label.fmDate" />
            </th>
            <th class="table_border_top_right">
                <bean:message key="label.toDate" />
            </th>
        </tr>
        <tr>
            <td>
                <html:text property="w6001CriteriaDomain.shipperCd" maxlength="5" styleClass="shipper_cd gscm_required" errorStyleClass="shipper_cd gscm_error_class" />
            </td>
            <td>
                <html:text property="w6001CriteriaDomain.consigneeCd" maxlength="5" styleClass="consignee_cd" errorStyleClass="consignee_cd gscm_error_class" />
            </td>
            <td>
                <html:text property="w6001CriteriaDomain.shipToCd" maxlength="7" styleClass="ship_to_cd" errorStyleClass="ship_to_cd gscm_error_class" />
            </td>
            <td>
                <html:select property="w6001CriteriaDomain.trnsCd" styleClass="w6001_trns_cd gscm_required" styleId="trns_cd" errorStyleClass="w6001_trns_cd gscm_error_class" >
                    <html:options collection="trnsCd" property="id" labelProperty="name"/>
                </html:select>
            </td>
            <td>
                <html:select property="w6001CriteriaDomain.cancelTyp" styleClass="w6001_cancel_typ" errorStyleClass="w6001_cancel_typ gscm_error_class" >
                    <html:options collection="cancelTyp" property="id" labelProperty="name"/>
                </html:select>
            </td>
            <td>
                <html:select property="w6001CriteriaDomain.cancelFlg" styleClass="w6001_cancel_flg" errorStyleClass="w6001_cancel_flg gscm_error_class" >
                    <html:options collection="flag" property="id" labelProperty="name"/>
                </html:select>
            </td>
            <td>
                <html:select property="w6001CriteriaDomain.cmlTyp" styleId="cml_typ" styleClass="cml_typ" >
                    <html:options collection="cmlTyp" property="id" labelProperty="name"/>
                </html:select>
            </td>
            <td class="table_border_bottom_left">
                <html:select property="w6001CriteriaDomain.by" styleClass="w6001_by" styleId="by" >
                    <html:options collection="by" property="id" labelProperty="name"/>
                </html:select>
            </td>
            <td class="table_border_bottom">
                <html:text property="w6001CriteriaDomain.fmDate" maxlength="10" styleClass="date" errorStyleClass="date gscm_error_class" />
                <img src="images/gscm/library/Calendar.gif"
                    onClick = "gscm.writeCalendar('fmDateDiv', 'mainForm', 'w6001CriteriaDomain.fmDate', '<bean:message key="format.screen.yyyymmdd" locale="${locale_key}" />', this);"/>
                <div id="fmDateDiv" style="float:left;"></div>
            </td>
            <td class="table_border_bottom_right">
                <html:text property="w6001CriteriaDomain.toDate" maxlength="10" styleClass="date" errorStyleClass="date gscm_error_class" />
                <img src="images/gscm/library/Calendar.gif"
                    onClick = "gscm.writeCalendar('toDateDiv', 'mainForm', 'w6001CriteriaDomain.toDate', '<bean:message key="format.screen.yyyymmdd" locale="${locale_key}" />', this);"/>
                <div id="toDateDiv" style="float:left;"></div>
            </td>
        </tr>
    </table>

    <%--
    -- search condition 2
    --%>
    <table class="gscm_search">
        <colgroup>
            <col class="search_invoice_no" />
            <col class="search_carrier_comp_cd" />
            <col class="search_forwarder_comp_cd" />
            <col class="search_issuer" />
            <col class="search_stg_instr_no" />
            <col class="search_stg_act_no" />
            <col class="search_shipping_firm_no" />
        </colgroup>
        <tr>
            <th>
                <bean:message key="label.invoiceNo" />
            </th>
            <th>
                <bean:message key="label.carrierCompCd" />
            </th>
            <th>
                <bean:message key="label.forwarderCompCd" />
            </th>
            <th>
                <bean:message key="label.issuer" />
            </th>
            <th>
                <bean:message key="label.stgInstrNo" />
            </th>
            <th>
                <bean:message key="label.stgActNo" />
            </th>
            <th>
                <bean:message key="label.shippingFirmNo" />
            </th>
        </tr>
        <tr>
            <td>
                <html:text property="w6001CriteriaDomain.invoiceNo" maxlength="20" styleClass="w6001_invoice_no" errorStyleClass="w6001_invoice_no gscm_error_class" />
            </td>
            <td>
                <html:text property="w6001CriteriaDomain.carrierCompCd" maxlength="3" styleClass="w6001_carrier_comp_cd" errorStyleClass="w6001_carrier_comp_cd gscm_error_class" />
                <html:button property="select" styleClass="select" onclick="selectCarrier();">
                    <bean:message key="button.select" />
                </html:button>
            </td>
            <td>
                <html:text property="w6001CriteriaDomain.forwarderCompCd" maxlength="5" styleClass="w6001_forwarder_comp_cd" errorStyleClass="w6001_forwarder_comp_cd gscm_error_class" />
                <html:button property="select" styleClass="select" onclick="selectForwarder();">
                    <bean:message key="button.select" />
                </html:button>
            </td>
            <td>
                <html:select property="w6001CriteriaDomain.issuer" styleClass="issuer" styleId="issuer" >
                    <html:options collection="issuer" property="id" labelProperty="name"/>
                </html:select>
            </td>
            <td>
                <html:text property="w6001CriteriaDomain.stgInstrNo" maxlength="20" styleClass="stg_instr_no" errorStyleClass="stg_instr_no gscm_error_class" />
            </td>
            <td>
                <html:text property="w6001CriteriaDomain.stgActNo" maxlength="19" styleClass="stg_act_no" errorStyleClass="stg_act_no gscm_error_class" />
            </td>
            <td>
                <html:text property="w6001CriteriaDomain.shippingFirmNo" maxlength="14" styleClass="shipping_firm_no" errorStyleClass="shipping_firm_no gscm_error_class" />
            </td>
        </tr>
    </table>

    <%--
    -- buttons 1
    --%>
    <table class="gscm_search_button">
        <colgroup>
            <col width="search_button_create_new" />
            <col />
        </colgroup>
        <tr>
            <td>
                <html:button property="createNew" onclick="gscm.commonSubmit('W6001CreateNew.do', this.form);" styleClass="create_new">
                    <bean:message key="button.createNew" />
                </html:button>
                <html:button property="uploadMainInv" onclick="gscm.commonSubmit('W6001UploadMainInv.do', this.form);" styleClass="upload_main_inv">
                    <bean:message key="button.uploadMainInv" />
                </html:button>
            </td>
            <td class="right">
                <html:button property="search" onclick="gscm.commonSubmit('W6001Search.do', this.form);" styleClass="search">
                    <bean:message key="button.search" />
                </html:button>
            </td>
        </tr>
    </table>
    <hr />

    <logic:notEmpty name="W6001Form" property="listDomainList">
        <%--
        -- buttons 2
        --%>
        <table class="gscm_resultlist_button">
            <colgroup>
                <col />
            </colgroup>
            <tr>
                <td>
                    <html:button property="uploadFrtInv" onclick="gscm.commonSubmit('W6001UploadFrtInv.do', this.form);" styleClass="upload_frt_inv">
                        <bean:message key="button.uploadFrtInv" />
                    </html:button>
                    <html:button property="uploadNonDngInvOrReInv" onclick="gscm.commonSubmit('W6001UploadNonDnGInvOrReInv.do', this.form);" styleClass="upload_non_dng_inv_or_re_inv">
                        <bean:message key="button.uploadNonDngInvOrReInv" />
                    </html:button>
                    <html:button property="cancelInv" onclick="gscm.commonSubmit('W6001CancelInv.do', this.form);" styleClass="cancel_inv">
                        <bean:message key="button.cancelInv" />
                    </html:button>
                </td>
            </tr>
        </table>
    
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
        <table id="tablefix" class="gscm_resultlist">
            <colgroup>
                <col class="resultlist_checked_key" />
                <col class="resultlist_shipper_cd" />
                <col class="resultlist_consignee_cd" />
                <col class="resultlist_trns_cd" />
                <col class="resultlist_cancel_typ" />
                <col class="resultlist_cancel_flg" />
                <col class="resultlist_etd" />
                <col class="resultlist_re_inv_flg" />
                <col class="resultlist_invoice_no" />
                <col class="resultlist_frt_contain_flg" />
                <col class="resultlist_relate_invoice_shipper_cd" />
                <col class="resultlist_relate_invoice_no" />
                <col class="resultlist_invoice_issue_dt" />
            </colgroup>
            <thead>
                <tr>
                    <th rowspan="2">
                        <bean:message key="label.ck" />
                    </th>
                    <th rowspan="2">
                        <bean:message key="label.shipperCd" />
                    </th>
                    <th>
                        <bean:message key="label.consigneeCd" />
                    </th>
                    <th rowspan="2">
                        <bean:message key="label.trnsCd" />
                    </th>
                    <th rowspan="2">
                        <bean:message key="W6001.label.invoiceTyp" />
                    </th>
                    <th rowspan="2">
                        <bean:message key="W6001.label.cancelFlg" />
                    </th>
                    <th rowspan="2">
                        <bean:message key="label.etd" />
                    </th>
                    <th rowspan="2">
                        <bean:message key="label.reInvFlg" />
                    </th>
                    <th>
                        <bean:message key="label.invoiceNo" />
                    </th>
                    <th rowspan="2">
                        <bean:message key="label.frtContainFlg" />
                    </th>
                    <th colspan="2">
                        <bean:message key="label.reference" />
                    </th>
                    <th>
                        <bean:message key="label.invoiceIssueDt" />
                    </th>
                </tr>
                <tr>
                    <th>
                        <bean:message key="W6001.label.shipToCd" />
                    </th>
                    <th>
                        <bean:message key="W6001.label.cancelRefNo" />
                    </th>
                    <th>
                        <bean:message key="W6001.label.relateInvoiceShipperCd" />
                    </th>
                    <th>
                        <bean:message key="W6001.label.relateInvoiceNo" />
                    </th>
                    <th>
                        <bean:message key="label.invoiceIssuerNm" />
                    </th>
                </tr>
            </thead>
            <tbody>
                <logic:iterate name="W6001Form" property="listDomainList" id="listDomainList" indexId="idx">
                    <ai:stripeline number="${idx + 1}" odd="gscm_odd" even="gscm_even">
                        <tr>
                            <td class="center" rowspan="2">
                                <html:radio property="w6001CriteriaDomain.selected" value="${idx}" />
                            </td>
                            <td rowspan="2">
                                <bean:write name="listDomainList" property="shipperCd" />
                            </td>
                            <td>
                                <bean:write name="listDomainList" property="consigneeCd" />
                            </td>
                            <td rowspan="2">
                                <bean:write name="listDomainList" property="trnsCd" />
                            </td>
                            <td rowspan="2">
                                <bean:write name="listDomainList" property="invoiceTyp" />
                            </td>
                            <td rowspan="2">
                                <bean:write name="listDomainList" property="cancelFlg" />
                            </td>
                            <td rowspan="2">
                                <bean:write name="listDomainList" property="etd" />
                            </td>
                            <td rowspan="2">
                                <bean:write name="listDomainList" property="reInvFlg" />
                            </td>
                            <td>
                                <html:textarea name="listDomainList" property="invoiceNo" indexed="true" onclick="printDocument(${idx}, this.form)" styleClass="gscm_disptext w6001_invoice_no" readonly="true" cols="10" rows="2"/>
                            </td>
                            <td rowspan="2">
                                <bean:write name="listDomainList" property="frtContainFlg" />
                            </td>
                            <td rowspan="2">
                                <bean:write name="listDomainList" property="relateInvoiceShipperCd" />
                            </td>
                            <td rowspan="2">
                                <html:text name="listDomainList" property="relateInvoiceNo" indexed="true" maxlength="20" styleClass="w6001_relate_invoice_no gscm_disptext" readonly="true" />
                            </td>
                            <td>
                                <%-- ST184 INVOICE ISSUE DATE/インボイス発行日 MOD START --%>
                                <%-- <bean:write name="listDomainList" property="invoiceIssueDt" /> --%>
                                <bean:write name="listDomainList" property="dispInvoiceIssueDt" />
                                <%-- ST184 INVOICE ISSUE DATE/インボイス発行日 MOD END --%>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <bean:write name="listDomainList" property="shipToCd" />
                            </td>
                            <td>
                                <html:text name="listDomainList" property="cancelRefNo" indexed="true" styleClass="w6001_cancel_ref_no gscm_disptext" readonly="true" />
                            </td>
                            <td>
                                <html:text name="listDomainList" property="invoiceIssuerNm" indexed="true" styleClass="invoice_issuer_nm gscm_disptext" readonly="true" />
                            </td>
                            <%-- <html:hidden name="listDomainList" property="invoiceIssueDt" indexed="true" /> ST184 INVOICE ISSUE DATE/インボイス発行日 DEL --%>
                        </tr>
                    </ai:stripeline>
                </logic:iterate>
            </tbody>
        </table>
    </logic:notEmpty>
    
    <%--
    -- hidden
    --%>
    <html:hidden property="printRow"/>
    <html:hidden property="callScreenId" />
</html:form>
