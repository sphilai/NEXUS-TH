<%--
 * W2002
 * 
 * 梱包指示Header画面のJSPです。
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 --%>
<html:form action="/W2002MoveToCreate" styleId="mainForm">
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
                <bean:message key="label.shipperCd" />
            </th>
            <td>
                <html:text property="w2002CriteriaDomain.shipperCd" maxlength="3" styleClass="shipper_cd gscm_required" errorStyleClass="shipper_cd gscm_error_class" />
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.customerCd" />
            </th>
            <td>
                <html:text property="w2002CriteriaDomain.customerCd" maxlength="8" styleClass="customer_cd gscm_required" errorStyleClass="customer_cd gscm_error_class" />
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.lgcyShipTo" />
            </th>
            <td>
                <html:text property="w2002CriteriaDomain.lgcyShipTo" maxlength="2" styleClass="lgcy_ship_to gscm_required" errorStyleClass="lgcy_ship_to gscm_error_class" />
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.trnsCd" />
            </th>
            <td>
                <html:select property="w2002CriteriaDomain.trnsCd" styleClass="trns_cd gscm_required" errorStyleClass="trns_cd gscm_error_class">
                    <html:options collection="trnsCd" property="id" labelProperty="name"/>
                </html:select>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.plntCd" />
            </th>
            <td>
                <html:text property="w2002CriteriaDomain.plntCd" maxlength="2" styleClass="plnt_cd gscm_required" errorStyleClass="plnt_cd gscm_error_class" />
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.lgcyWhCd" />
            </th>
            <td>
                <html:text property="w2002CriteriaDomain.lgcyWhCd" maxlength="1" styleClass="lgcy_wh_cd gscm_required" errorStyleClass="lgcy_wh_cd gscm_error_class" />
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.pltzInstrDt" />
            </th>
            <td>
                <html:text property="w2002CriteriaDomain.pltzInstrDt" maxlength="8" styleClass="pltz_instr_dt gscm_required" errorStyleClass="pltz_instr_dt gscm_error_class" />
                <img src="images/gscm/library/Calendar.gif"
                    onClick = "gscm.writeCalendar('pltzInstrDtDiv', 'mainForm', 'w2002CriteriaDomain.pltzInstrDt', '<bean:message key="format.screen.yyyymmdd" />', this);"/>
                <div id="pltzInstrDtDiv" style="float:left;"></div>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.poDueDt" />
            </th>
            <td>
                <table class="po_due_dt_table">
                    <tr>
                        <td>
                            <bean:message key="label.fmDate" /><br />
                            <html:text property="w2002CriteriaDomain.poDueDtFrom" maxlength="8" styleClass="po_due_dt" errorStyleClass="po_due_dt gscm_error_class" />
                            <img src="images/gscm/library/Calendar.gif"
                                onClick="gscm.writeCalendar('poDueDtFromDiv', 'mainForm', 'w2002CriteriaDomain.poDueDtFrom', '<bean:message key="format.screen.yyyymmdd" />', this);"/>
                            <div id="poDueDtFromDiv" style="float:left;"></div>
                        </td>
                        <td>
                            <bean:message key="label.toDate" /><br />
                            <html:text property="w2002CriteriaDomain.poDueDtTo" maxlength="8" styleClass="po_due_dt" errorStyleClass="po_due_dt gscm_error_class" />
                            <img src="images/gscm/library/Calendar.gif"
                                onClick="gscm.writeCalendar('poDueDtToDiv', 'mainForm', 'w2002CriteriaDomain.poDueDtTo', '<bean:message key="format.screen.yyyymmdd"/>', this);"/>
                            <div id="poDueDtToDiv" style="float:left;"></div>
                        </td>
                    </tr>
                </table>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.customerPoNo" />
            </th>
            <td>
                <html:text property="w2002CriteriaDomain.customerPoNo" maxlength="20" styleClass="customer_po_no" errorStyleClass="customer_po_no gscm_error_class" />
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
            <td>
                <html:button property="moveToCreate" styleClass="move_to_create" onclick="gscm.commonSubmit('W2002MoveToCreate.do', this.form);">
                    <bean:message key="button.moveToCreate" />
                </html:button>
                <html:button property="backToMainScreen" styleClass="back_to_main_screen" onclick="gscm.submitBack('W2001Init.do', this.form);">
                    <bean:message key="button.backToMainScreen" />
                </html:button>
            </td>
        </tr>
    </table>
    <%--
    -- hidden
    --%>
    <html:hidden property="callScreenId" />
</html:form>
