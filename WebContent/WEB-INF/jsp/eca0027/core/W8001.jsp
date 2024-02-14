<%--
 * Project : GSCM
 * 
 * W8001 - Progress Control
 *
 * $Revision: 11939 $
 * 
 * Copyright (c) 2013 DENSO CORPORATION. All rights reserved.
 --%>

<html:form action="/W8001Init" styleId="mainForm">
    <%--
    -- search condition 1
    --%>
    <table class="gscm_search">
        <tr>
            <th>
                <table class="gscm_search search1">
                    <colgroup>
                        <col class="search_shipper_cd" />
                        <col class="search_consignee_cd" />
                        <col class="search_ship_to_comp_cd" />
                        <col class="search_customer_cd" />
                        <col class="search_trns_cd" />
                    </colgroup>
                    <tr>
                        <th>
                            <bean:message key="label.shipper" />
                        </th>
                        <th>
                            <bean:message key="label.consignee" />
                        </th>
                        <th>
                            <bean:message key="W8001.label.shipToCd" />
                        </th>
                        <th>
                            <bean:message key="label.customerAndShipToNo" />
                        </th>
                        <th>
                            <bean:message key="label.trans" />
                        </th>
                    </tr>
                    <tr>
                        <td>
                            <html:text property="w8001CriteriaDomain.shipperCd" maxlength="5" styleClass="w8001_shipper_cd" errorStyleClass="w8001_shipper_cd gscm_error_class"/>
                            <html:button property="shpSelect" onclick="setShipper();" styleClass="select">
                                <bean:message key="button.select" />
                            </html:button>
                        </td>
                        <td>
                            <html:text property="w8001CriteriaDomain.consigneeCd" maxlength="5" styleClass="w8001_consignee_cd" errorStyleClass="w8001_consignee_cd gscm_error_class"/>
                            <html:button property="conSelect" onclick="setConsignee();" styleClass="select">
                                <bean:message key="button.select" />
                            </html:button>
                        </td>
                        <td>
                            <html:text property="w8001CriteriaDomain.shipToCd" maxlength="7" styleClass="w8001_ship_to_comp_cd" errorStyleClass="w8001_ship_to_comp_cd gscm_error_class"/>
                        </td>
                        <td>
                            <html:text property="w8001CriteriaDomain.customerCd" maxlength="8" styleClass="w8001_customer_cd" errorStyleClass="w8001_customer_cd gscm_error_class"/>
                            <html:text property="w8001CriteriaDomain.lgcyShipTo" maxlength="2" styleClass="w8001_lgcy_ship_to" errorStyleClass="w8001_lgcy_ship_to gscm_error_class"/>
                        </td>
                        <td>
                            <html:select property="w8001CriteriaDomain.trnsCd" styleId="trns_cd" styleClass="w8001_trns_cd">
                                <html:options collection="trnsCdCombo" property="id" labelProperty="name"/>
                            </html:select>
                        </td>
                    </tr>
                </table>
            </th>
            <th>
                <div class="ele_exp_packing">
                    <table class="gscm_search ele_exp_packing">
                        <colgroup>
                            <col class="search_fm_exp_packing_dt" />
                            <col class="search_to_exp_packing_dt" />
                            <col class="search_exp_packing_issuer_id"/>
                        </colgroup>
                        <tr>
                            <th>
                                <bean:message key="label.fmIssueDate" />
                            </th>
                            <th>
                                <bean:message key="label.toIssueDate" />
                            </th>
                            <th>
                                <bean:message key="label.cmlIssuer" />
                            </th>
                        </tr>
                        <tr>
                            <td>
                                <html:text property="w8001CriteriaDomain.fmExpPackingDt" maxlength="8" styleClass="exp_packing_dt" errorStyleClass="exp_packing_dt gscm_error_class"/>
                                <img src="images/gscm/library/Calendar.gif"
                                    onClick = "gscm.writeCalendar('fmExpPackingDtDiv', 'mainForm', 'w8001CriteriaDomain.fmExpPackingDt', '<bean:message key="format.screen.yyyymmdd" />', this);"/>
                                <div id="fmExpPackingDtDiv" style="float:left;"></div>
                            </td>
                            <td>
                                <html:text property="w8001CriteriaDomain.toExpPackingDt" maxlength="8" styleClass="exp_packing_dt" errorStyleClass="exp_packing_dt gscm_error_class"/>
                                <img src="images/gscm/library/Calendar.gif"
                                    onClick = "gscm.writeCalendar('toIssueDateDiv', 'mainForm', 'w8001CriteriaDomain.toExpPackingDt', '<bean:message key="format.screen.yyyymmdd" />', this);"/>
                                <div id="toIssueDateDiv" style="float:left;"></div>
                            </td>
                            <td>
                                <html:select property="w8001CriteriaDomain.expPackingIssuerId" styleId="exp_packing_issuer_id" styleClass="exp_packing_issuer_id">
                                    <html:options collection="expPackingIssuerIdCombo" property="id" labelProperty="name"/>
                                </html:select>
                            </td>
                        </tr>
                    </table>
                </div>
            </th>
        </tr>
    </table>
    <%--
    -- search condition 2
    --%>
    <table class="gscm_search">
        <colgroup>
            <col class="search_status" />
            <col class="search_main_mark" />
            <col class="search_cml_typ" />
            <col class="search_custom_timing_typ" />
            <col class="search_cur_wh_comp_cd" />
            <col class="search_cur_wh_cd"/>
        </colgroup>
        <tr>
            <th>
                <bean:message key="label.status" />
            </th>
            <th>
                <bean:message key="label.cmlNo" />
            </th>
            <th>
                <bean:message key="label.cmlTyp" />
            </th>
            <th>
                <bean:message key="label.ccType" />
            </th>
            <th>
                <bean:message key="label.whCom" />
            </th>
            <th>
                <bean:message key="label.nexusWh" />
            </th>
        </tr>
        <tr>
            <td>
                <html:select property="w8001CriteriaDomain.status" styleId="status" styleClass="w8001_status">
                    <html:options collection="statusCombo" property="id" labelProperty="name"/>
                </html:select>
            </td>
            <td>
                <html:text property="w8001CriteriaDomain.mainMark" maxlength="20" styleClass="w8001_main_mark" errorStyleClass="w8001_main_mark gscm_error_class"/>
            </td>
            <td>
                <html:select property="w8001CriteriaDomain.cmlTyp" styleId="cml_typ" styleClass="w8001_cml_typ">
                    <html:options collection="cmlTypCombo" property="id" labelProperty="name"/>
                </html:select>
            </td>
            <td>
                <html:select property="w8001CriteriaDomain.customTimingTyp" styleId="custom_timing_typ" styleClass="custom_timing_typ">
                    <html:options collection="customTimingTypCombo" property="id" labelProperty="name"/>
                </html:select>
            </td>
            <td>
                <html:text property="w8001CriteriaDomain.curWhCompCd" maxlength="5" styleClass="cur_wh_comp_cd" errorStyleClass="cur_wh_comp_cd gscm_error_class"/>
            </td>
            <td>
                <html:text property="w8001CriteriaDomain.curWhCd" maxlength="4" styleClass="cur_wh_cd" errorStyleClass="cur_wh_cd gscm_error_class"/>
            </td>
        </tr>
    </table>
    <%--
    -- search condition 3
    --%>
    <table class="gscm_search">
        <colgroup>
            <col class="search_item_no" />
            <col class="search_pkg_cd" />
            <col class="search_request_issuer_id" />
            <col class="search_exp_request_no" />
            <col class="search_return_style_cd" />
        </colgroup>
        <tr>
            <th rowspan="2">
                <div class="ele_item_no">
                    <table class="gscm_search ele_item_no">
                        <colgroup>
                            <col class="search_select_condition_pltz_item_no" />
                            <col class="search_pltz_item_no" />
                            <col class="search_select_condition_customer_po_no" />
                            <col class="search_customer_po_no"/>
                        </colgroup>
                        <tr>
                            <th>
                            </th>
                            <th>
                                <bean:message key="label.matchFull" />

                            </th>
                            <th>
                            </th>
                            <th>
                                <bean:message key="W8001.label.customerPoNo" />
                            </th>
                        </tr>
                        <tr>
                            <td>
                                <html:radio property="w8001CriteriaDomain.selectCondition" value="searchItemNo" />
                            </td>
                            <td>
                                <html:text property="w8001CriteriaDomain.pltzItemNo" maxlength="27" styleClass="w8001_pltz_item_no" errorStyleClass="w8001_pltz_item_no gscm_error_class"/>
                            </td>
                            <td>
                                <html:radio property="w8001CriteriaDomain.selectCondition" value="searchPoNo" />
                            </td>
                            <td>
                                <html:text property="w8001CriteriaDomain.customerPoNo" maxlength="20" styleClass="w8001_customer_po_no" errorStyleClass="w8001_customer_po_no gscm_error_class"/>
                            </td>
                        </tr>
                    </table>
                </div>
            </th>
            <th>
                <bean:message key="label.pkgCd" />
            </th>
            <th>
                <bean:message key="label.exRequester" />
            </th>
            <th>
                <bean:message key="label.exReqNo" />
            </th>
            <th>
                <bean:message key="label.returnStyleCd" />
            </th>
        </tr>
        <tr>
            <td>
                <html:text property="w8001CriteriaDomain.pkgCd" maxlength="3" styleClass="pkg_cd" errorStyleClass="pkg_cd gscm_error_class"/>
            </td>
            <td>
                <html:select property="w8001CriteriaDomain.requestIssuerId" styleId="request_issuer_id" styleClass="w8001_request_issuer_id">
                    <html:options collection="requestIssuerIdCombo" property="id" labelProperty="name"/>
                </html:select>
            </td>
            <td>
                <html:text property="w8001CriteriaDomain.expRequestNo" maxlength="12" size="16" styleClass="w8001_exp_request_no" errorStyleClass="w8001_exp_request_no gscm_error_class"/>
            </td>
            <td>
                <html:text property="w8001CriteriaDomain.returnStyleCd" maxlength="37" styleClass="w8001_return_style_cd" errorStyleClass="w8001_return_style_cd gscm_error_class"/>
            </td>
        </tr>
    </table>
    <%--
    -- search condition 4
    --%>
    <table class="gscm_search">
        <tr>
            <th>
                <table class="gscm_search search2">
                    <colgroup>
                        <col class="search_container_no" />
                        <col class="search_invoice_no" />
                        <col class="search_invoice_ctgry" />
                    </colgroup>
                    <tr>
                        <th>
                            <bean:message key="label.containerNo" />
                        </th>
                        <th>
                            <bean:message key="label.invNo" />
                        </th>
                        <th>
                            <bean:message key="label.invCtg" />
                        </th>
                    </tr>
                    <tr>
                        <td>
                            <html:text property="w8001CriteriaDomain.containerNo" maxlength="12" styleClass="container_no" errorStyleClass="container_no gscm_error_class"/>
                        </td>
                        <td>
                            <html:text property="w8001CriteriaDomain.invoiceNo" maxlength="20" styleClass="w8001_invoice_no" errorStyleClass="w8001_invoice_no gscm_error_class" />
                        </td>
                        <td>
                            <html:select property="w8001CriteriaDomain.invoiceCtgry" styleId="invoice_ctgry" styleClass="w8001_invoice_ctgry">
                                <html:options collection="invoiceCtgryCombo" property="id" labelProperty="name"/>
                            </html:select>
                        </td>
                    </tr>
                </table>
            </th>
            <th>
                <div class="ele_etd">
                    <table class="gscm_search ele_etd">
                        <colgroup>
                            <col class="search_fm_etd" />
                            <col class="search_to_etd"/>
                        </colgroup>
                        <tr>
                            <th>
                                <bean:message key="label.fmEtd" />
                            </th>
                            <th>
                                <bean:message key="label.toEtd" />
                            </th>
                        </tr>
                        <tr>
                            <td>
                                <html:text property="w8001CriteriaDomain.fmEtd" maxlength="8" size="7" styleClass="etd" errorStyleClass="etd gscm_error_class"/>
                                <img src="images/gscm/library/Calendar.gif"
                                    onClick = "gscm.writeCalendar('fmEtdDiv', 'mainForm', 'w8001CriteriaDomain.fmEtd', '<bean:message key="format.screen.yyyymmdd" />', this);"/>
                                <div id="fmEtdDiv" style="float:left;"></div>
                            </td>
                            <td>
                                <html:text property="w8001CriteriaDomain.toEtd" maxlength="8" size="7" styleClass="etd" errorStyleClass="etd gscm_error_class"/>
                                <img src="images/gscm/library/Calendar.gif"
                                    onClick = "gscm.writeCalendar('toEtdDiv', 'mainForm', 'w8001CriteriaDomain.toEtd', '<bean:message key="format.screen.yyyymmdd" />', this);"/>
                                <div id="toEtdDiv" style="float:left;"></div>
                            </td>
                        </tr>
                    </table>
                </div>
            </th>
            <th>
                <div class="ele_atd">
                    <table class="gscm_search ele_atd">
                        <colgroup>
                            <col class="search_fm_atd" />
                            <col class="search_to_atd"/>
                        </colgroup>
                        <tr>
                            <th>
                                <bean:message key="label.fmAtd" />
                            </th>
                            <th>
                                <bean:message key="label.toAtd" />
                            </th>
                        </tr>
                        <tr>
                            <td>
                                <html:text property="w8001CriteriaDomain.fmAtd" maxlength="8" size="7" styleClass="atd" errorStyleClass="atd gscm_error_class"/>
                                <img src="images/gscm/library/Calendar.gif"
                                    onClick = "gscm.writeCalendar('fmAtdDiv', 'mainForm', 'w8001CriteriaDomain.fmAtd', '<bean:message key="format.screen.yyyymmdd" />', this);"/>
                                <div id="fmAtdDiv" style="float:left;"></div>
                            </td>
                            <td>
                                <html:text property="w8001CriteriaDomain.toAtd" maxlength="8" size="7" styleClass="atd" errorStyleClass="atd gscm_error_class"/>
                                <img src="images/gscm/library/Calendar.gif"
                                    onClick = "gscm.writeCalendar('toAtdDiv', 'mainForm', 'w8001CriteriaDomain.toAtd', '<bean:message key="format.screen.yyyymmdd" />', this);"/>
                                <div id="toAtdDiv" style="float:left;"></div>
                            </td>
                        </tr>
                    </table>
                </div>
            </th>
            <%--
            -- buttons 1
            --%>
            <th class="right">
                <html:button property="search" onclick="gscm.commonSubmit('W8001Search.do', this.form);" styleClass="search">
                    <bean:message key="button.search" />
                </html:button>
            </th>
        </tr>
    </table>
    <hr />
    <logic:notEmpty name="W8001Form" property="w8001ListDomainList">
        <%--
        -- buttons 2
        --%>
        <table class="gscm_resultlist_button">
            <colgroup>
                <col />
            </colgroup>
            <tr>
                <td>
                    <html:button property="confirmDetail" onclick="gscm.commonSubmit('W8001ConfirmDetail.do', this.form);" styleClass="confirm_detail">
                        <bean:message key="button.confirmDetail" />
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
        <table id="tablefix" class="gscm_resultlist double">
            <colgroup>
                <col class="resultlist_ck" />
                <col class="resultlist_warn" />
                <col class="resultlist_shipper_cd" />
                <col class="resultlist_ship_to_cd" />
                <col class="resultlist_trns_cd" />
                <col class="resultlist_main_mark" />
                <col class="resultlist_cml_typ" />
                <col class="resultlist_cur_wh_comp_cd" />
                <col class="resultlist_qty" />
                <col class="resultlist_stg_act_dt" />
                <col class="resultlist_shipping_firm_dt" />
                <col class="resultlist_invoice_ctgry" />
                <col class="resultlist_invoice_key" />
                <col class="resultlist_etd" />
                <col class="resultlist_atd"/>
            </colgroup>
            <thead>
                <tr>
                    <th rowspan="2">
                        <bean:message key="label.ck" />
                    </th>
                    <th rowspan="2">
                        <bean:message key="label.warn" />
                    </th>
                    <th>
                        <bean:message key="label.shipper" />
                    </th>
                    <th rowspan="2">
                        <bean:message key="label.nexusShipTo" />
                    </th>
                    <th rowspan="2">
                        <bean:message key="label.trans" />
                    </th>
                    <th rowspan="2">
                        <bean:message key="label.cmlNo" />
                    </th>
                    <th>
                        <bean:message key="label.cmlTyp" />
                    </th>
                    <th>
                        <bean:message key="label.whCom" />
                    </th>
                    <th rowspan="2">
                        <bean:message key="label.searchItemNoQty" />
                    </th>
                    <th rowspan="2">
                        <bean:message key="label.stgActuality" />
                    </th>
                    <th>
                        <bean:message key="label.shippingConfirm" />
                    </th>
                    <th colspan="3">
                        <bean:message key="label.invNo" />
                    </th>
                    <th>
                        <bean:message key="label.atd" />
                    </th>
                </tr>
                <tr>
                    <th>
                        <bean:message key="label.cnsgn" />
                    </th>
                    <th>
                        <bean:message key="label.ccType" />
                    </th>
                    <th>
                        <bean:message key="label.nexusWh" />
                    </th>
                    <th>
                        <bean:message key="label.shippingActuality" />
                    </th>
                    <th>
                        <bean:message key="label.invCtg" />
                    </th>
                    <th>
                        <bean:message key="label.invKey" />
                    </th>
                    <th>
                        <bean:message key="label.etd" />
                    </th>
                   <th>
                        <bean:message key="label.eta" />
                    </th>
                </tr>
            </thead>
            <tbody>
                <logic:iterate name="W8001Form" property="w8001ListDomainList" id="w8001ListDomainList" indexId="idx">
                    <ai:stripeline number="${idx + 1}" odd="gscm_odd" even="gscm_even">
                        <tr>
                            <td rowspan="2" class="center">
                                <html:radio property="cmlNo" value="${w8001ListDomainList.mainMark}"/>
                            </td>
                            
                            <td rowspan="2">
                                <bean:write name="w8001ListDomainList" property="warn" />
                            </td>
                            <td>
                                <bean:write name="w8001ListDomainList" property="shipperCd" />
                            </td>
                            <td rowspan="2">
                                <bean:write name="w8001ListDomainList" property="shipToCd" />
                            </td>
                            <td rowspan="2">
                                <bean:write name="w8001ListDomainList" property="trnsCd" />
                            </td>
                            <td rowspan="2">
                                <html:text name="w8001ListDomainList" property="mainMark" indexed="true" styleClass="w8001_main_mark gscm_disptext" readonly="true" />
                            </td>
                            <td>
                                <bean:write name="w8001ListDomainList" property="cmlTyp" />
                            </td>
                            <td>
                                <bean:write name="w8001ListDomainList" property="curWhCompCd" />
                            </td>
                            <td rowspan="2" class="right">
                                <bean:write name="w8001ListDomainList" property="qty" />
                            </td>
                            <td rowspan="2">
                                <bean:write name="w8001ListDomainList" property="stgActDt" />
                            </td>
                            <td>
                                <bean:write name="w8001ListDomainList" property="shippingFirmDt" />
                            </td>
                            <td colspan="3">
                                <html:text name="w8001ListDomainList" property="invoiceNo" indexed="true" styleClass="w8001_invoice_no gscm_disptext" readonly="true" />
                            </td>
                            <td>
                                <bean:write name="w8001ListDomainList" property="atd" />
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <bean:write name="w8001ListDomainList" property="consigneeCd" />
                            </td>
                            <td>
                                <bean:write name="w8001ListDomainList" property="customTimingTyp" />
                            </td>
                            <td>
                                <bean:write name="w8001ListDomainList" property="curWhCd" />
                            </td>
                            <td>
                                <bean:write name="w8001ListDomainList" property="registerDt" />
                            </td>
                            <td>
                                <bean:write name="w8001ListDomainList" property="invoiceCtgry" />
                            </td>
                            <td>
                                <bean:write name="w8001ListDomainList" property="invoiceKey" />
                            </td>
                            <td>
                                <bean:write name="w8001ListDomainList" property="etd" />
                            </td>
                            <td>
                                <bean:write name="w8001ListDomainList" property="eta" />
                            </td>
                        </tr>
                    </ai:stripeline>
                </logic:iterate>
            </tbody>
        </table>
    </logic:notEmpty>
    <%--
    -- hidden
    --%>
    <html:hidden property="callScreenId" />
</html:form>
