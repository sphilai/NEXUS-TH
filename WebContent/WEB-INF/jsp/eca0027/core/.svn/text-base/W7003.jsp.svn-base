<%--
 * Project : GSCM
 * 
 * W7003 - Shipment Actuality Create
 *
 * $Revision: 11682 $
 * 
 * Copyright (c) 2013 DENSO CORPORATION. All rights reserved.
 --%>

<html:form action="/W7003Search" styleId="mainForm">
    <%--
    -- search condition 1
    --%>
    <table class="gscm_search">
        <colgroup>
            <col class="search_shipper_cd" />
            <col class="search_consignee_cd" />
            <col class="search_ship_to_comp_cd" />
            <col class="search_trns_cd" />
            <col class="search_freight_responsible_cd" />
            <col class="search_auto_invoice_resister"/>
        </colgroup>
        <tr>
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
                <bean:message key="W7003.label.freightResponsibleCd" />
            </th>
            <th>
                <bean:message key="label.autoInvoiceRegisterFlg" />
            </th>
        </tr>
        <tr>
            <td>
                <html:text property="w7003CriteriaDomain.shipperCd" styleClass="shipper_cd gscm_disptext" readonly="true"/>
            </td>
            <td>
                <html:text property="w7003CriteriaDomain.consigneeCd" styleClass="consignee_cd gscm_disptext" readonly="true"/>
            </td>
            <td>
                <html:text property="w7003CriteriaDomain.shipToCompCd" styleClass="ship_to_comp_cd gscm_disptext" readonly="true"/>
            </td>
            <td>
                <html:text property="w7003CriteriaDomain.trnsCd" styleClass="w7003_view_trns_cd gscm_disptext" readonly="true"/>
            </td>
            <td>
                <html:text property="w7003CriteriaDomain.freightResponsibleCd" styleClass="w7003_view_freight_responsible_cd gscm_disptext" readonly="true"/>
            </td>
            <td>
                <html:text property="w7003CriteriaDomain.autoInvoiceRegisterFlg" styleClass="auto_invoice_resister gscm_disptext" readonly="true"/>
            </td>
        </tr>
    </table>
    <%--
    -- search condition 2
    --%>
    <table class="gscm_search">
        <colgroup>
            <col class="search_fm_etd" />
            <col class="search_to_etd" />
            <col class="search_carrier_comp_cd" />
            <col class="search_vessel" />
            <col class="search_invoice_no" />
            <col class="search_container_loose_typ" />
            <col class="search_container_no"/>
        </colgroup>
        <tr>
            <th>
                <bean:message key="label.fmEtd" />
            </th>
            <th>
                <bean:message key="label.toEtd" />
            </th>
            <th>
                <bean:message key="label.carrierCompCd" />
            </th>
            <th>
                <bean:message key="label.vessel" />
            </th>
            <th>
                <bean:message key="label.invoiceNo" />
            </th>
            <th>
                <bean:message key="label.containerLooseTyp" />
            </th>
            <th>
                <bean:message key="label.containerNo" />
            </th>
        </tr>
        <tr>
            <td>
                <html:text property="w7003CriteriaDomain.fmEtd" maxlength="8" styleClass="etd" errorStyleClass="etd gscm_error_class" />
                <img src="images/gscm/library/Calendar.gif"
                    onClick = "gscm.writeCalendar('fmEtdDiv', 'mainForm', 'w7003CriteriaDomain.fmEtd', '<bean:message key="format.screen.yyyymmdd" />', this);"/>
                <div id="fmEtdDiv" style="float:left;"></div>
            </td>
            <td>
                <html:text property="w7003CriteriaDomain.toEtd" maxlength="8" styleClass="etd" errorStyleClass="etd gscm_error_class" />
                <img src="images/gscm/library/Calendar.gif"
                    onClick = "gscm.writeCalendar('toEtdDiv', 'mainForm', 'w7003CriteriaDomain.toEtd', '<bean:message key="format.screen.yyyymmdd" />', this);"/>
                <div id="toEtdDiv" style="float:left;"></div>
            </td>
            <td>
                <html:text property="w7003CriteriaDomain.carrierCompCd" maxlength="3" styleClass="w7003_carrier_comp_cd" errorStyleClass="w7003_carrier_comp_cd gscm_error_class" />
                <html:button property="select" styleClass="select" onclick="setCarrier();">
                    <bean:message key="button.select" />
                </html:button>
            </td>
            <td>
                <html:text property="w7003CriteriaDomain.vessel" maxlength="35" styleClass="vessel" errorStyleClass="vessel gscm_error_class" />
            </td>
            <td>
                <html:text property="w7003CriteriaDomain.invoiceNo" maxlength="20" styleClass="invoice_no" errorStyleClass="invoice_no gscm_error_class" />
            </td>
            <td>
                <html:select property="w7003CriteriaDomain.containerLooseTyp" styleClass="container_loose_typ" >
                    <html:options collection="containerLooseTyp" property="id" labelProperty="name"/>
                </html:select>
            </td>
            <td>
                <html:text property="w7003CriteriaDomain.containerNo" maxlength="12" styleClass="container_no" errorStyleClass="container_no gscm_error_class" />
            </td>
        </tr>
    </table>
    <%--
    -- buttons 1
    --%>
    <table class="gscm_search_button">
        <colgroup>
            <col width="50%"/>
            <col />
        </colgroup>
        <tr>
            <td>
                <html:button property="moveToRegister" onclick="gscm.commonSubmit('W7003MoveToRegister.do', this.form);" styleClass="move_to_register">
                    <bean:message key="button.moveToRegister" />
                </html:button>
                <html:button property="backToHeader" onclick="gscm.submitBack('W7002Init.do', this.form);" styleClass="back_to_header">
                    <bean:message key="button.backToHeader" />
                </html:button>
                <html:button property="backToMainScreen" onclick="gscm.submitBack('W7001Init.do', this.form);" styleClass="back_to_main_screen">
                    <bean:message key="button.backToMainScreen" />
                </html:button>
            </td>
            <td class="right">
                <html:button property="search" onclick="gscm.commonSubmit('W7003Search.do', this.form);" styleClass="search">
                    <bean:message key="button.search" />
                </html:button>
            </td>
        </tr>
    </table>
    <hr />
    <logic:notEmpty name="W7003Form" property="listDomainList">
        <%--
        -- buttons 2
        --%>
        <table class="gscm_search_button">
            <colgroup>
                <col />
            </colgroup>
            <tr>
                <td>
                    <html:button property="update" onclick="gscm.commonSubmit('W7003Update.do', this.form);" styleClass="update">
                        <bean:message key="button.update" />
                    </html:button>
                </td>
            </tr>
        </table>
        <%--
        -- page control
        --%>
        <table class="gscm_search_button">
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
                <col class="resultlist_etd" />
                <col class="resultlist_carrier_comp_cd" />
                <col class="resultlist_vessel" />
                <col class="resultlist_invoice_no" />
                <col class="resultlist_pkg_qty" />
                <col class="resultlist_container_loose_typ"/>
            </colgroup>
            <thead>
                <tr>
                    <th>
                        <bean:message key="label.ck" />
                        <input type="checkbox" name="checkAll" onclick="allcheck('listDomainList', 'selected', this.checked)" />
                    </th>
                    <th>
                        <bean:message key="label.etd" />
                    </th>
                    <th>
                        <bean:message key="label.carrierCompCd" />
                    </th>
                    <th>
                        <bean:message key="label.vessel" />
                    </th>
                    <th>
                        <bean:message key="label.invoiceNo" />
                    </th>
                    <th>
                        <bean:message key="label.pkgQty" />
                    </th>
                    <th>
                        <bean:message key="label.containerLooseTyp" />
                    </th>
                </tr>
            </thead>
            <tbody>
                <logic:iterate name="W7003Form" property="listDomainList" id="listDomainList" indexId="idx">
                    <ai:stripeline number="${idx + 1}" odd="gscm_odd" even="gscm_even">
                        <tr>
                            <td class="center">
                                <html:checkbox name="listDomainList" property="selected" indexed="true" />
                            </td>
                            <td>
                                <html:text name="listDomainList" property="etd" styleClass="etd gscm_disptext" readonly="true" />
                            </td>
                            <td>
                                <html:text name="listDomainList" property="carrierCompCd" styleClass="carrier_comp_cd gscm_disptext" readonly="true" />
                            </td>
                            <td>
                                <html:text name="listDomainList" property="vessel" styleClass="vessel gscm_disptext" readonly="true" />
                            </td>
                            <td>
                                <html:text name="listDomainList" property="invoiceNo" styleClass="w7003_invoice_no gscm_disptext" readonly="true" />
                            </td>
                            <td>
                                <html:text name="listDomainList" property="pltzItemQty" styleClass="w7003_pkg_qty gscm_disptext right" readonly="true" />
                            </td>
                            <td>
                                <html:text name="listDomainList" property="containerLooseTyp" styleClass="container_loose_typ gscm_disptext" readonly="true" />
                            </td>
                            <html:hidden name="listDomainList" property="comUpdateTimestamp" indexed="true" />
                            <%-- <html:hidden name="listDomainList" property="invoiceIssueDt" indexed="true" /> ST184 INVOICE ISSUE DATE/インボイス発行日 DEL --%>
                            <html:hidden name="listDomainList" property="eta" indexed="true" />
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
