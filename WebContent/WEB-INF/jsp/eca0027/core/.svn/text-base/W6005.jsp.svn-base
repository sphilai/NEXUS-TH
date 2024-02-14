<%--
 * Project : GSCM
 * 
 * W6005 - Shipping Information Input
 *
 * $Revision: 12132 $
 * 
 * Copyright (c) 2013 DENSO CORPORATION. All rights reserved.
 --%>

<html:form action="/W6005Init" styleId="mainForm">
    <%--
    -- search condition 1
    --%>
    <table class="gscm_search">
        <colgroup>
            <col class="search_stg_com" />
            <col class="search_stg_wh" />
            <col class="search_trns_cd" />
            <col class="search_container_loose_typ" />
            <col class="search_custom_timing_typ" />
            <col />
        </colgroup>
        <tr>
            <th>
                <bean:message key="label.stgCom" />
            </th>
            <th>
                <bean:message key="label.stgWh" />
            </th>
            <th>
                <bean:message key="label.trans" />
            </th>
            <th>
                <bean:message key="label.cl" />
            </th>
            <th>
                <bean:message key="label.ccType" />
            </th>
            <th>
                <bean:message key="label.contSortKey" />
            </th>
        </tr>
        <tr>
            <td>
                <bean:write name="W6005Form" property="criteriaDomain.stgCom" />
            </td>
            <td>
                <bean:write name="W6005Form" property="criteriaDomain.stgWh" />
            </td>
            <td>
                <bean:write name="W6005Form" property="criteriaDomain.trnsCd" />
            </td>
            <td>
                <bean:write name="W6005Form" property="criteriaDomain.containerLooseTyp" />
            </td>
            <td>
                <bean:write name="W6005Form" property="criteriaDomain.customTimingTyp" />
            </td>
            <td>
                <bean:write name="W6005Form" property="criteriaDomain.containerSortingKey" />
            </td>
        </tr>
    </table>

    <%--
    -- Input 1
    --%>
    <table class="grid" width="460px">
        <colgroup>
            <col class="search_label" />
            <col class="search_carrier_comp_cd" />
        </colgroup>
        <tr>
            <th class="right">
                <bean:message key="label.carrier" />
            </th>
            <td>
                <html:text property="criteriaDomain.carrierCompCd" maxlength="3" styleClass="carrier_comp_cd gscm_required" errorStyleClass="carrier_comp_cd gscm_error_class"/>
                <html:button property="select" styleClass="select" onclick="selectCarrier();">
                    <bean:message key="button.select" />
                </html:button>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.forwarderCompCd" />
            </th>
            <td>
                <html:text property="criteriaDomain.forwarderCompCd" maxlength="5" styleClass="comp_cd" errorStyleClass="comp_cd gscm_error_class"/>
                <html:button property="select" styleClass="select" onclick="selectForwarder();">
                    <bean:message key="button.select" />
                </html:button>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="W6005.label.loadingPortCd" />
            </th>
            <td>
                <html:text property="criteriaDomain.fmCntryCd" maxlength="2" styleClass="cntry_cd gscm_required" errorStyleClass="cntry_cd gscm_error_class"/>
                <html:text property="criteriaDomain.loadingPortCd" maxlength="3" styleClass="loading_port_cd gscm_required" errorStyleClass="loading_port_cd gscm_error_class"/>
                <html:button property="select" styleClass="select" onclick="selectPortFrom();">
                    <bean:message key="button.select" />
                </html:button>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="W6005.label.dischargePortCd" />
            </th>
            <td>
                <html:text property="criteriaDomain.toCntryCd" maxlength="2" styleClass="cntry_cd gscm_required" errorStyleClass="cntry_cd gscm_error_class"/>
                <html:text property="criteriaDomain.dischargePortCd" maxlength="3" styleClass="discharge_port_cd gscm_required" errorStyleClass="discharge_port_cd gscm_error_class"/>
                <html:button property="select" styleClass="select" onclick="selectPortTo();">
                    <bean:message key="button.select" />
                </html:button>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="W6005.label.vessel" />
            </th>
            <td>
                <html:text property="criteriaDomain.vessel" maxlength="35" styleClass="vessel gscm_required" errorStyleClass="vessel gscm_error_class"/>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.etd" />
            </th>
            <td>
                <html:text property="criteriaDomain.etd" maxlength="8" styleClass="etd gscm_required" errorStyleClass="etd gscm_error_class"/>
                <img src="images/gscm/library/Calendar.gif"
                    onClick = "showCalendar('etdDiv', 'mainForm', 'criteriaDomain.etd', '<bean:message key="format.screen.yyyymmdd" />', this);"/>
                <div id="etdDiv" style="float:left;"></div>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.eta" />
            </th>
            <td>
                <html:text property="criteriaDomain.eta" maxlength="8" styleClass="eta gscm_required" errorStyleClass="eta gscm_error_class"/>
                <img src="images/gscm/library/Calendar.gif"
                    onClick = "showCalendar('etaDiv', 'mainForm', 'criteriaDomain.eta', '<bean:message key="format.screen.yyyymmdd" />', this);"/>
                <div id="etaDiv" style="float:left;"></div>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.arrivalTime" />
            </th>
            <td>
                
                <logic:equal name="W6005Form" property="trnsCd" value="A">
                    <html:text property="criteriaDomain.arrivalTime" maxlength="5" styleClass="arrival_time gscm_required" errorStyleClass="arrival_time gscm_error_class"/>
                </logic:equal>
                <logic:notEqual name="W6005Form" property="trnsCd" value="A">
                    <html:text property="criteriaDomain.arrivalTime" maxlength="5" styleClass="arrival_time" errorStyleClass="arrival_time gscm_error_class"/>
                </logic:notEqual>
            </td>
        </tr>
    </table>
    <br />
    <%--
    -- buttons 1
    --%>
    <table class="gscm_search_button">
        <colgroup>
            <col />
        </colgroup>
        <tr>
            <td>
                <html:button property="moveToInvoiceGrouping" onclick="gscm.commonSubmit('W6005MoveToInvoiceGrouping.do', this.form);" styleClass="move_to_invoice_grouping">
                    <bean:message key="button.moveToInvoiceGrouping" />
                </html:button>
                <bean:define id="backConfirmMessage"><bean:message key="NXS-I1-0011"/></bean:define>
                <html:button property="backToCreate" onclick="submitBackConfirm('W6004Init.do', this.form, '${backConfirmMessage}');" styleClass="back_to_create" >
                    <bean:message key="button.backToCreate" />
                </html:button>
            </td>
        </tr>
    </table>
    <%--
    -- hidden
    --%>
    <html:hidden property="callScreenId" />
    <html:hidden property="cntryCd" />
    <html:hidden property="criteriaDomain.originalScreenId" />
</html:form>
