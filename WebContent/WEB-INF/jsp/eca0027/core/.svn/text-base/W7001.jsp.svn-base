<%--
 * Project : GSCM
 * 
 * W7001 - Shipment Actuality Main Screen
 *
 * $Revision: 7682 $
 * 
 * Copyright (c) 2013 DENSO CORPORATION. All rights reserved.
 --%>
 
<html:form action="/W7001Search" styleId="mainForm">
    <%--
    -- search condition 1
    --%>
    <table class="gscm_search">
        <colgroup>
            <col class="search_fm_register_dt" />
            <col class="search_to_register_dt" />
            <col class="search_shipper_cd" />
            <col class="search_consignee_cd" />
            <col class="search_ship_to_comp_cd" />
            <col class="search_trns_cd" />
            <col class="search_container_loose_typ" />
            <col class="search_carrier_comp_cd" />
            <col class="search_vessel" />
        </colgroup>
        <tr>
            <th>
                <bean:message key="label.fmRegisterDt" />
            </th>
            <th>
                <bean:message key="label.toRegisterDt" />
            </th>
            <th>
                <bean:message key="label.shipperCd" />
            </th>
            <th>
                <bean:message key="label.consigneeCd" />
            </th>
            <th>
                <bean:message key="label.shipToCompCd" />
            </th>
            <th>
                <bean:message key="label.trnsCd" />
            </th>
            <th>
                <bean:message key="label.containerLooseTyp" />
            </th>
            <th>
                <bean:message key="label.carrierCompCd" />
            </th>
            <th>
                <bean:message key="label.vessel" />
            </th>
        </tr>
        <tr>
            <td>
                <html:text property="w7001CriteriaDomain.fmRegisterDt" maxlength="8" styleClass="register_dt" errorStyleClass="register_dt gscm_error_class" />
                <img src="images/gscm/library/Calendar.gif"
                    onClick = "gscm.writeCalendar('fmRegisterDtDiv', 'mainForm', 'w7001CriteriaDomain.fmRegisterDt', '<bean:message key="format.screen.yyyymmdd" />', this);"/>
                <div id="fmRegisterDtDiv" style="float:left;"></div>
            </td>
            <td>
                <html:text property="w7001CriteriaDomain.toRegisterDt" maxlength="8" styleClass="register_dt" errorStyleClass="register_dt gscm_error_class" />
                <img src="images/gscm/library/Calendar.gif"
                    onClick = "gscm.writeCalendar('toRegisterDtDiv', 'mainForm', 'w7001CriteriaDomain.toRegisterDt', '<bean:message key="format.screen.yyyymmdd" />', this);"/>
                <div id="toRegisterDtDiv" style="float:left;"></div>
            </td>
            <td>
                <html:text property="w7001CriteriaDomain.shipperCd" maxlength="5" styleClass="shipper_cd" errorStyleClass="shipper_cd gscm_error_class" />
            </td>
            <td>
                <html:text property="w7001CriteriaDomain.consigneeCd" maxlength="5" styleClass="consignee_cd" errorStyleClass="consignee_cd gscm_error_class" />
            </td>
            <td>
                <html:text property="w7001CriteriaDomain.shipToCompCd" maxlength="5" styleClass="ship_to_comp_cd" errorStyleClass="ship_to_comp_cd gscm_error_class" />
            </td>
            <td>
                <html:select property="w7001CriteriaDomain.trnsCd" styleClass="w7001_trns_cd" styleId="trns_cd" >
                    <html:options collection="trnsCd" property="id" labelProperty="name"/>
                </html:select>
            </td>
            <td>
                <html:select property="w7001CriteriaDomain.containerLooseTyp" styleClass="container_loose_typ" >
                    <html:options collection="containerLooseTyp" property="id" labelProperty="name"/>
                </html:select>
            </td>
            <td>
                <html:text property="w7001CriteriaDomain.carrierCompCd" maxlength="3" styleClass="w7001_carrier_comp_cd" errorStyleClass="w7001_carrier_comp_cd gscm_error_class" />
                <html:button property="select" styleClass="select" onclick="setCarrier();">
                    <bean:message key="button.select" />
                </html:button>
            </td>
            <td>
                <html:text property="w7001CriteriaDomain.vessel" maxlength="35" styleClass="vessel" errorStyleClass="vessel gscm_error_class" />
            </td>
        </tr>
    </table>
    <%--
    -- search condition 2
    --%>
    <table class="gscm_search">
        <colgroup>
            <col class="search_freight_responsible_cd" />
            <col class="search_shipping_act_status" />
            <col class="search_billd_no" />
            <col class="search_clp_group" />
            <col class="search_bl_update" />
            <col class="search_need_other_doc_flg" />
            <col class="search_fm_atd" />
            <col class="search_to_atd" />
        </colgroup>
        <tr>
            <th>
                <bean:message key="W7001.label.freightResponsibleCd" />
            </th>
            <th>
                <bean:message key="label.shippingActStatus" />
            </th>
            <th>
                <bean:message key="label.billdNo" />
            </th>
            <th>
                <bean:message key="label.clpGroup" />
            </th>
            <th>
                <bean:message key="label.blUpdate" />
            </th>
            <th>
                <bean:message key="label.needOtherDocFlg" />
            </th>
            <th>
                <bean:message key="label.fmAtd" />
            </th>
            <th>
                <bean:message key="label.toAtd" />
            </th>
        </tr>
        <tr>
            <td>
                <html:select property="w7001CriteriaDomain.freightResponsibleCd" styleClass="w7001_freight_responsible_cd" styleId="w7001_freight_responsible_cd" >
                    <html:options collection="freightResponsibleCd" property="id" labelProperty="name"/>
                </html:select>
            </td>
            <td>
                <html:select property="w7001CriteriaDomain.shippingActStatus" styleClass="shipping_act_status" styleId="shipping_act_status" >
                    <html:options collection="shippingActStatus" property="id" labelProperty="name"/>
                </html:select>
            </td>
            <td>
                <html:text property="w7001CriteriaDomain.billdNo" maxlength="35" styleClass="billd_no" errorStyleClass="billd_no gscm_error_class" />
            </td>
            <td>
                <html:text property="w7001CriteriaDomain.clpGroup" maxlength="10" styleClass="clp_group" errorStyleClass="clp_group gscm_error_class" />
            </td>
            <td>
                <html:select property="w7001CriteriaDomain.blUpdate" styleClass="bl_upload" >
                    <html:options collection="flag" property="id" labelProperty="name"/>
                </html:select>
            </td>
            <td>
                <html:select property="w7001CriteriaDomain.needOtherDocFlg" styleClass="need_other_doc_flg" >
                    <html:options collection="flag" property="id" labelProperty="name"/>
                </html:select>
            </td>
            <td>
                <html:text property="w7001CriteriaDomain.fmAtd" maxlength="8" styleClass="atd" errorStyleClass="atd gscm_error_class" />
                <img src="images/gscm/library/Calendar.gif"
                    onClick = "gscm.writeCalendar('fmAtdDiv', 'mainForm', 'w7001CriteriaDomain.fmAtd', '<bean:message key="format.screen.yyyymmdd" />', this);"/>
                <div id="fmAtdDiv" style="float:left;"></div>
            </td>
            <td>
                <html:text property="w7001CriteriaDomain.toAtd" maxlength="8" styleClass="atd" errorStyleClass="atd gscm_error_class" />
                <img src="images/gscm/library/Calendar.gif"
                    onClick = "gscm.writeCalendar('toAtdDiv', 'mainForm', 'w7001CriteriaDomain.toAtd', '<bean:message key="format.screen.yyyymmdd" />', this);"/>
                <div id="toAtdDiv" style="float:left;"></div>
            </td>
        </tr>
    </table>
    <%--
    -- search condition 3
    --%>
    <table class="gscm_search">
        <colgroup>
            <col class="search_invoice_no" />
            <col class="search_container_no" />
        </colgroup>
        <tr>
            <th>
                <bean:message key="label.invoiceNo" />
            </th>
            <th>
                <bean:message key="label.containerNo" />
            </th>
        </tr>
        <tr>
            <td>
                <html:text property="w7001CriteriaDomain.invoiceNo" maxlength="20" styleClass="invoice_no" errorStyleClass="invoice_no gscm_error_class" />
            </td>
            <td>
                <html:text property="w7001CriteriaDomain.containerNo" maxlength="12" styleClass="container_no" errorStyleClass="container_no gscm_error_class" />
            </td>
        </tr>
    </table>
    <%--
    -- buttons 1
    --%>
    <table class="gscm_search_button">
        <colgroup>
            <col width="50%" />
            <col />
        </colgroup>
        <tr>
            <td>
                <html:button property="createNew" onclick="gscm.commonSubmit('W7001CreateNew.do', this.form);" styleClass="create_new">
                    <bean:message key="button.createNew" />
                </html:button>
                <html:button property="warningList" onclick="popupWT017();" styleClass="warning_list">
                    <bean:message key="button.warningList" />
                </html:button>
            </td>
            <td class="right">
                <html:button property="search" onclick="gscm.commonSubmit('W7001Search.do', this.form);" styleClass="search">
                    <bean:message key="button.search" />
                </html:button>
            </td>
        </tr>
    </table>
    <hr />
    <logic:notEmpty name="W7001Form" property="listDomainList">
        <%--
        -- buttons 2
        --%>
        <table class="gscm_search_button">
            <colgroup>
                <col />
            </colgroup>
            <tr>
                <td>
                    <html:button property="confirmDetail" onclick="gscm.commonSubmit('W7001ConfirmDetail.do', this.form);" styleClass="confirm_detail">
                        <bean:message key="button.confirmDetail" />
                    </html:button>
                    <bean:define id="registerConfirmMessage"><bean:message key="GSCM-I0-0003" locale="${locale_key}" /></bean:define>
                    <html:button property="clpRegister" onclick="gscm.submitConfirm('W7001ClpRegister.do', this.form, '${registerConfirmMessage}');" styleClass="confirm_detail">
                        <bean:message key="button.clpRegister" />
                    </html:button>
                    <bean:define id="cancelConfirmMessage"><bean:message key="NXS-I1-0009" locale="${locale_key}" /></bean:define>
                    <html:button property="clpCancel" onclick="gscm.submitConfirm('W7001ClpCancel.do', this.form, '${cancelConfirmMessage}');" styleClass="confirm_detail">
                        <bean:message key="button.clpCancel" />
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
                <col class="resultlist_ck" />
                <col class="resultlist_register_dt" />
                <col class="resultlist_shipper_cd" />
                <col class="resultlist_ship_to_comp_cd" />
                <col class="resultlist_trns_cd" />
                <col class="resultlist_container_loose_typ" />
                <col class="resultlist_carrier_comp_cd" />
                <col class="resultlist_vessel" />
                <col class="resultlist_freight_responsible_cd" />
                <col class="resultlist_shipping_act_status" />
                <col class="resultlist_billd_file_id" />
                <col class="resultlist_clp_group" />
                <col class="resultlist_need_other_doc" />
                <col class="resultlist_atd" />
                <col class="resultlist_no_of_container" />
                <col class="resultlist_no_of_invoice" />
            </colgroup>
            <thead>
                <tr>
                    <th rowspan="2">
                        <bean:message key="label.ck" />
                        <input type="checkbox" name="checkAll" onclick="allcheck('listDomainList', 'selected', this.checked)" />
                    </th>
                    <th rowspan="2">
                        <bean:message key="label.registerDate" />
                    </th>
                    <th>
                        <bean:message key="label.shipper" />
                    </th>
                    <th rowspan="2">
                        <bean:message key="label.nexusShipToCom" />
                    </th>
                    <th rowspan="2">
                        <bean:message key="label.trans" />
                    </th>
                    <th rowspan="2">
                        <bean:message key="label.cl" />
                    </th>
                    <th rowspan="2">
                        <bean:message key="label.carrier" />
                    </th>
                    <th rowspan="2">
                        <bean:message key="label.vessel" />
                    </th>
                    <th rowspan="2">
                        <bean:message key="label.fr" />
                    </th>
                    <th rowspan="2">
                        <bean:message key="label.status" />
                    </th>
                    <th colspan="2">
                        <bean:message key="label.blNo" />
                    </th>
                    <th rowspan="2">
                        <bean:message key="label.needOtherDocFlg" />
                    </th>
                    <th>
                        <bean:message key="label.atd" />
                    </th>
                    <th rowspan="2">
                        <bean:message key="label.noOfContainer" />
                    </th>
                    <th rowspan="2">
                        <bean:message key="label.noOfInvoice" />
                    </th>
                </tr>
                <tr>
                    <th>
                        <bean:message key="label.consignee" />
                    </th>
                    <th>
                        <bean:message key="label.blUpdate" />
                    </th>
                    <th>
                        <bean:message key="label.clpGroup" />
                    </th>
                    <th>
                        <bean:message key="label.eta" />
                    </th>
                </tr>
            </thead>
            <tbody>
                <logic:iterate name="W7001Form" property="listDomainList" id="listDomainList" indexId="idx">
                    <ai:stripeline number="${idx + 1}" odd="gscm_odd" even="gscm_even">
                        <tr>
                            <td rowspan="2" class="center">
                                <html:checkbox name="listDomainList" property="selected" indexed="true" />
                            </td>
                            <td rowspan="2">
                                <bean:write name="listDomainList" property="registerDt" />
                            </td>
                            <td>
                                <bean:write name="listDomainList" property="shipperCd" />
                            </td>
                            <td rowspan="2">
                                <bean:write name="listDomainList" property="shipToCompCd" />
                            </td>
                            <td rowspan="2">
                                <bean:write name="listDomainList" property="trnsCd" />
                            </td>
                            <td rowspan="2">
                                <bean:write name="listDomainList" property="containerLooseTyp" />
                            </td>
                            <td rowspan="2">
                                <bean:write name="listDomainList" property="carrierCompCd" />
                            </td>
                            <td rowspan="2">
                                <html:text name="listDomainList" property="vessel" indexed="true" styleClass="vessel gscm_disptext" readonly="true" />
                            </td>
                            <td rowspan="2">
                                <bean:write name="listDomainList" property="freightResponsibleCd" />
                            </td>
                            <td rowspan="2">
                                <bean:write name="listDomainList" property="shippingActStatus" />
                            </td>
                            <td colspan="2">
                                <html:text name="listDomainList" property="billdNo" indexed="true" styleClass="billd_no gscm_disptext" readonly="true" />
                            </td>
                            <td rowspan="2">
                                <bean:write name="listDomainList" property="needOtherDocFlg" />
                            </td>
                            <td>
                                <bean:write name="listDomainList" property="atd" />
                            </td>
                            <td rowspan="2" class="right">
                                <c:if test="${listDomainList.noOfContainer eq 0}" >
                                    <bean:write name="listDomainList" property="noOfContainer" />
                                </c:if>
                                <c:if test="${listDomainList.noOfContainer ne 0}" >
                                    <a href="#" onclick="popupWT018('<bean:write name="listDomainList" property="shippingActNo" />')" >
                                        <bean:write name="listDomainList" property="noOfContainer" />
                                    </a>
                                </c:if>
                            </td>
                            <td rowspan="2" class="right">
                                <bean:write name="listDomainList" property="noOfInvoice" />
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <bean:write name="listDomainList" property="consigneeCd" />
                            </td>
                            <td>
                                <bean:write name="listDomainList" property="billdFileId" />
                            </td>
                            <td>
                                <html:text name="listDomainList" property="clpGroup" indexed="true" styleClass="clp_group gscm_disptext" readonly="true" />
                            </td>
                            <td>
                                <bean:write name="listDomainList" property="eta" />
                            </td>
                            <html:hidden name="listDomainList" property="shippingActNo" indexed="true" />
                            <html:hidden name="listDomainList" property="comUpdateTimestamp" indexed="true" />
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
