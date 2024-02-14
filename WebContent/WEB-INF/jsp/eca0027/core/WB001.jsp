<%--
 * WB001.jsp
 *
 * 受注登録ヘッダー画面のJSPです。
 * 
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 --%>
<html:form action="/WB001Init" styleId="mainForm">
    <%--
    -- Header 1
    --%>
    <table class="grid">
        <colgroup>
            <col class="grid_header" />
            <col class="grid_contents" />
        </colgroup>
        <tr>
            <th class="right">
                <bean:message key="label.rcvOdrCompCd" />
            </th>
            <td>
                <html:text property="wb001CriteriaDomain.rcvOdrCompCd" maxlength="5" styleClass="rcv_odr_comp_cd gscm_required" errorStyleClass="rcv_odr_comp_cd gscm_error_class"/>
                <html:text property="wb001CriteriaDomain.compNm" styleClass="wb001_comp_nm gscm_disptext" readonly="true" />
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.customerCdAndLgcyShipTo" />
            </th>
            <td>
                <html:text property="wb001CriteriaDomain.customerCd" maxlength="8" styleClass="customer_cd gscm_required" errorStyleClass="customer_cd gscm_error_class"/>
                <html:text property="wb001CriteriaDomain.lgcyShipTo" maxlength="2" styleClass="lgcy_ship_to gscm_required" errorStyleClass="lgcy_ship_to gscm_error_class"/>
                <html:text property="wb001CriteriaDomain.shipToNm" styleClass="wb001_ship_to_nm gscm_disptext" readonly="true"/>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.itemNo" />
            </th>
            <td>
                <html:text property="wb001CriteriaDomain.itemNo" maxlength="20" styleClass="wb001_item_no gscm_required" errorStyleClass="wb001_item_no gscm_error_class"/>
                <html:text property="wb001CriteriaDomain.itemDescription" styleClass="wb001_item_description gscm_disptext" readonly="true" />
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.pkgCd" />
            </th>
            <td>
                <html:text property="wb001CriteriaDomain.pkgCd" maxlength="3" styleClass="pkg_cd" errorStyleClass="pkg_cd gscm_error_class" />
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.trnsCd" />
            </th>
            <td>
                <html:select property="wb001CriteriaDomain.trnsCd" styleClass="wb001_trns_cd gscm_required" errorStyleClass="wb001_trns_cd gscm_error_class" >
                    <html:options collection="trnsCd" property="id" labelProperty="name" />
                </html:select>
                <html:hidden property="wb001CriteriaDomain.trnsCdDisp" />
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="WB001.label.etdDueDt" />
            </th>
            <td>
                <html:text property="wb001CriteriaDomain.etdDueDt" maxlength="8" styleClass="etd_due_dt gscm_required" errorStyleClass="etd_due_dt gscm_error_class" />
                <img src="images/gscm/library/Calendar.gif"
                    onClick = "gscm.writeCalendar('etdDueDtDiv', 'mainForm', 'wb001CriteriaDomain.etdDueDt', '<bean:message key="format.screen.yyyymmdd" />', this);"/>
                <div id="etdDueDtDiv" style="float:left;"></div>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="WB001.label.customerPoNo" />
            </th>
            <td>
                <html:text property="wb001CriteriaDomain.customerPoNo" maxlength="20" styleClass="customer_po_no" errorStyleClass="customer_po_no gscm_error_class" />
            </td>
        </tr>
    </table>
    <br />
    <%--
    -- buttons 1
    --%>
    <table class="gscm_resultlist_button">
        <colgroup>
            <col />
        </colgroup>
        <tr>
            <td class="right">
                <html:button property="moveToRegister" styleClass="move_to_register" onclick="gscm.commonSubmit('WB001MoveToRegister.do', this.form);">
                    <bean:message key="button.moveToRegister" />
                </html:button>
                <html:checkbox property="wb001CriteriaDomain.ignoreWarnings" />
                <bean:message key="label.ignoreWarnings" />
            </td>
        </tr>
    </table>
    <%--
    -- hidden
    --%>
    <html:hidden property="callScreenId" />
    <html:hidden property="wb001CriteriaDomain.warningFlgCustomerCd" />
    <html:hidden property="wb001CriteriaDomain.warningFlgItemNo" />
</html:form>
