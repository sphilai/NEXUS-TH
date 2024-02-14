<%--
 * Project : GSCM
 * 
 * W9017 - Export Shipping Item Special Information MA Edit
 *
 * $Revision: 12250 $
 * 
 * Copyright (c) 2013 DENSO CORPORATION. All rights reserved.
 --%>

<html:form action="/W9017Init.do" styleId="mainForm">
    <%--
    -- buttons 1
    --%>
    <table class="gscm_resultlist_button">
        <colgroup>
            <col />
        </colgroup>
        <tr>
            <td>
                <logic:notEqual name="W9017Form" property="w9017CriteriaDomain.procMode" value="3">
                    <bean:define id="backConfirmMessage"><bean:message key="GSCM-I0-0002" locale="${locale_key}"/></bean:define>
                    <html:button property="backToInquiry" onclick="submitBackConfirm('W9016Init.do', this.form, '${backConfirmMessage}');">
                        <bean:message key="button.backToInquiry" />
                    </html:button>
                </logic:notEqual>
                <logic:equal name="W9017Form" property="w9017CriteriaDomain.procMode" value="3">
                    <html:button property="" onclick="gscm.submitBack('W9016Init.do', this.form);">
                        <bean:message key="button.backToInquiry" />
                    </html:button>
                </logic:equal>
                <%-- UT305 ADD START --%>
                &nbsp;
                <html:button property="refresh" onclick="gscm.commonSubmit('W9017Refresh.do', this.form);" styleId="refresh" >
                    <bean:message key="button.refreshDescription" />
                </html:button>
                <%-- UT305 ADD END --%>
            </td>
        </tr>
    </table>
    <%--
    -- Edit 1
    --%>
    <table class="grid">
        <colgroup>
            <col class="grid_title" />
            <col class="grid_primary_key" />
            <col class="grid_data" />
        </colgroup>
        <tr>
            <th class="right">
                <bean:message key="label.company" />
            </th>
            <th class="left">
                <bean:message key="label.key" />
            </th>
            <td>
                <html:text property="w9017CriteriaDomain.compCd" styleClass="w9017_comp_cd gscm_disptext" errorStyleClass="w9017_comp_cd gscm_disptext gscm_error_class" readonly="true"/>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.itemNo" />
            </th>
            <th class="left">
                <bean:message key="label.key" />
            </th>
            <td>
                <html:text property="w9017CriteriaDomain.itemNo" styleClass="w9017_item_no gscm_disptext" readonly="true"/>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.pkgCd" />
            </th>
            <th class="left">
                <bean:message key="label.key" />
            </th>
            <td>
                <html:text property="w9017CriteriaDomain.pkgCd" styleClass="pkg_cd gscm_disptext" readonly="true"/>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.custNo" />
            </th>
            <th class="left">
                <bean:message key="label.key" />
            </th>
            <td>
                <html:text property="w9017CriteriaDomain.customerCd" styleClass="w9017_customer_cd gscm_disptext" errorStyleClass="w9017_customer_cd gscm_disptext gscm_error_class" readonly="true"/>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.shipTo" />
            </th>
            <th class="left">
                <bean:message key="label.key" />
            </th>
            <td>
                <html:text property="w9017CriteriaDomain.lgcyShipTo" styleClass="lgcy_ship_to gscm_disptext" errorStyleClass="lgcy_ship_to gscm_disptext gscm_error_class" readonly="true"/>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.applyStartDate" />
            </th>
            <th class="left">
                <bean:message key="label.key" />
            </th>
            <td>
                <logic:equal name="W9017Form" property="registerFlg" value="true">
                    <html:text property="w9017CriteriaDomain.aplyStrtDt" maxlength="8" styleClass="aply_strt_dt gscm_required" errorStyleClass="aply_strt_dt gscm_error_class" />
                    <img src="images/gscm/library/Calendar.gif"
                        onClick = "gscm.writeCalendar('applyStartDateDiv', 'mainForm', 'w9017CriteriaDomain.aplyStrtDt', '<bean:message key="format.screen.yyyymmdd" />', this);"/>
                    <div id="applyStartDateDiv" style="float:left;"></div>
                </logic:equal>
                <logic:notEqual name="W9017Form" property="registerFlg" value="true">
                    <html:text property="w9017CriteriaDomain.aplyStrtDt" styleClass="aply_strt_dt gscm_disptext" readonly="true"/>
                    <img src="images/gscm/library/Calendar.gif" class="w9017_calender_img" />
                </logic:notEqual>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.description" />
            </th>
            <th>
            </th>
            <td>
                <logic:notEqual name="W9017Form" property="w9017CriteriaDomain.procMode" value="3">
                    <html:text property="w9017CriteriaDomain.itemDescription" maxlength="25" styleClass="w9017_item_description gscm_required" errorStyleClass="w9017_item_description gscm_error_class" />
                </logic:notEqual>
                <logic:equal name="W9017Form" property="w9017CriteriaDomain.procMode" value="3">
                    <html:text property="w9017CriteriaDomain.itemDescription" maxlength="25" styleClass="w9017_item_description gscm_disptext" readonly="true" />
                </logic:equal>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.shipLot" />
            </th>
            <th>
            </th>
            <td>
                <logic:notEqual name="W9017Form" property="w9017CriteriaDomain.procMode" value="3">
                    <html:text property="w9017CriteriaDomain.shippingLot" maxlength="7" styleClass="w9017_shipping_lot gscm_required" errorStyleClass="w9017_shipping_lot gscm_error_class" />
                </logic:notEqual>
                <logic:equal name="W9017Form" property="w9017CriteriaDomain.procMode" value="3">
                    <html:text property="w9017CriteriaDomain.shippingLot" maxlength="7" styleClass="w9017_shipping_lot gscm_disptext" readonly="true" />
                </logic:equal>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.invSetKey" />
            </th>
            <th>
            </th>
            <td>
                <logic:notEqual name="W9017Form" property="w9017CriteriaDomain.procMode" value="3">
                    <html:text property="w9017CriteriaDomain.invoiceKey" maxlength="3" styleClass="w9017_invoice_key gscm_required" errorStyleClass="w9017_invoice_key gscm_error_class" />
                </logic:notEqual>
                <logic:equal name="W9017Form" property="w9017CriteriaDomain.procMode" value="3">
                    <html:text property="w9017CriteriaDomain.invoiceKey" maxlength="3" styleClass="w9017_invoice_key gscm_disptext" readonly="true" />
                </logic:equal>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.stgInstrFlg" />
            </th>
            <th>
            </th>
            <td>
                <logic:notEqual name="W9017Form" property="w9017CriteriaDomain.procMode" value="3">
                    <html:select property="w9017CriteriaDomain.stgInstrItemFlg" styleClass="gscm_required stg_instr_item_flg" errorStyleClass="stg_instr_item_flg gscm_error_class" >
                        <html:options collection="stgInstrItemFlg" property="id" labelProperty="name"/>
                    </html:select>
                </logic:notEqual>
                <logic:equal name="W9017Form" property="w9017CriteriaDomain.procMode" value="3">
                    <html:select property="w9017CriteriaDomain.stgInstrItemFlg" styleClass="stg_instr_item_flg" disabled="true" >
                        <html:options collection="stgInstrItemFlg" property="id" labelProperty="name"/>
                    </html:select>
                </logic:equal>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.ccType" />
            </th>
            <th>
            </th>
            <td>
                <logic:notEqual name="W9017Form" property="w9017CriteriaDomain.procMode" value="3">
                    <html:select property="w9017CriteriaDomain.customTimingTyp" styleClass="gscm_required custom_timing_typ" errorStyleClass="custom_timing_typ gscm_error_class" >
                        <html:options collection="customTimingTyp" property="id" labelProperty="name"/>
                    </html:select>
                </logic:notEqual>
                <logic:equal name="W9017Form" property="w9017CriteriaDomain.procMode" value="3">
                    <html:select property="w9017CriteriaDomain.customTimingTyp" styleClass="gscm_disptext custom_timing_typ" disabled="true" >
                        <html:options collection="customTimingTyp" property="id" labelProperty="name"/>
                    </html:select>
                </logic:equal>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.contSortKey" />
            </th>
            <th>
            </th>
            <td>
                <logic:notEqual name="W9017Form" property="w9017CriteriaDomain.procMode" value="3">
                    <html:text property="w9017CriteriaDomain.containerSortingKey" maxlength="8" styleClass="w9017_container_sorting_key gscm_required" errorStyleClass="w9017_container_sorting_key gscm_error_class" />
                </logic:notEqual>
                <logic:equal name="W9017Form" property="w9017CriteriaDomain.procMode" value="3">
                    <html:text property="w9017CriteriaDomain.containerSortingKey" maxlength="8" styleClass="w9017_container_sorting_key gscm_disptext" readonly="true" />
                </logic:equal>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.ldCd" />
            </th>
            <th>
            </th>
            <td>
                <logic:notEqual name="W9017Form" property="w9017CriteriaDomain.procMode" value="3">
                    <html:select property="w9017CriteriaDomain.loadingCd" styleClass="gscm_required w9017_loading_cd" errorStyleClass="w9017_loading_cd gscm_error_class" >
                        <html:options collection="loadingCd" property="id" labelProperty="name"/>
                    </html:select>
                </logic:notEqual>
                <logic:equal name="W9017Form" property="w9017CriteriaDomain.procMode" value="3">
                    <html:select property="w9017CriteriaDomain.loadingCd" styleClass="gscm_disptext w9017_loading_cd" disabled="true" >
                        <html:options collection="loadingCd" property="id" labelProperty="name"/>
                    </html:select>
                </logic:equal>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.cl" />
            </th>
            <th>
            </th>
            <td>
                <logic:notEqual name="W9017Form" property="w9017CriteriaDomain.procMode" value="3">
                    <html:select property="w9017CriteriaDomain.containerLooseTyp" styleClass="gscm_required w9017_container_loose_typ" errorStyleClass="w9017_container_loose_typ gscm_error_class" >
                        <html:options collection="containerLooseTyp" property="id" labelProperty="name"/>
                    </html:select>
                </logic:notEqual>
                <logic:equal name="W9017Form" property="w9017CriteriaDomain.procMode" value="3">
                    <html:select property="w9017CriteriaDomain.containerLooseTyp" styleClass="gscm_disptext w9017_container_loose_typ" disabled="true" >
                        <html:options collection="containerLooseTyp" property="id" labelProperty="name"/>
                    </html:select>
                </logic:equal>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.casemarkNotation" />
            </th>
            <th>
            </th>
            <td>
                <logic:notEqual name="W9017Form" property="w9017CriteriaDomain.procMode" value="3">
                    <html:textarea property="w9017CriteriaDomain.casemarkNotation" styleClass="w9017_break_all monospace" errorStyleClass="w9017_break_all gscm_error_class monospace" cols="17" rows="3" /><%-- ST970 MOD --%>
                </logic:notEqual>
                <logic:equal name="W9017Form" property="w9017CriteriaDomain.procMode" value="3">
                    <html:textarea property="w9017CriteriaDomain.casemarkNotation" styleClass="w9017_break_all monospace" readonly="true" cols="17" rows="3"/><%-- ST970 MOD --%>
                </logic:equal>
            </td>
        </tr>
    </table>
    <%--
    -- buttons 2
    --%>
    <table class="button">
        <colgroup>
            <col />
        </colgroup>
        <tr>
            <td class="right">
                <bean:define id="registerConfirmMessage">
                    <logic:notEqual name="W9017Form" property="w9017CriteriaDomain.procMode" value="2"><bean:message key="GSCM-I0-0003" locale="${locale_key}" /></logic:notEqual>
                    <logic:equal name="W9017Form" property="w9017CriteriaDomain.procMode" value="2"><bean:message key="GSCM-I0-0004" locale="${locale_key}" /></logic:equal>
                </bean:define>
                <html:button property="register" onclick="gscm.submitConfirm('W9017Register.do', this.form, '${registerConfirmMessage}');" styleClass="register">
                    <bean:message key="button.register" />
                </html:button>
            </td>
        </tr>
    </table>
    <%--
    -- hidden
    --%>
    <html:hidden property="callScreenId" />
    <html:hidden property="w9017CriteriaDomain.procMode" />
    <logic:notEmpty name="W9017Form" property="w9017CriteriaDomain.comUpdateTimestamp">
        <html:hidden property="w9017CriteriaDomain.comUpdateTimestamp" />
    </logic:notEmpty>
</html:form>
