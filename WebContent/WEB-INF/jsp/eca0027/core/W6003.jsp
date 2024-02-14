<%--
 * Project : GSCM
 * 
 * W6003 - Invoice Header
 *
 * $Revision: 7682 $
 * 
 * Copyright (c) 2013 DENSO CORPORATION. All rights reserved.
 --%>

<html:form action="/W6003Init" styleId="mainForm">
    <%--
    -- Header 1
    --%>
    <table class="grid">
        <colgroup>
            <col class="grid_header"/>
            <col class="grid_contents"/>
        </colgroup>
        <tr>
            <th class="right">
                <bean:message key="label.stgCom" />
            </th>
            <td>
                <html:text property="w6003CriteriaDomain.stgCom" maxlength="5" styleClass="stg_com gscm_required" errorStyleClass="stg_com gscm_error_class"/>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.stgWh" />
            </th>
            <td>
                <html:text property="w6003CriteriaDomain.stgWh" maxlength="4" styleClass="stg_wh gscm_required" errorStyleClass="stg_wh gscm_error_class"/>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.trans" />
            </th>
            <td>
                <html:select property="w6003CriteriaDomain.trnsCd" styleId="trns_cd" styleClass="trns_cd gscm_required" errorStyleClass="trns_cd gscm_error_class">
                    <html:options collection="trnsCd" property="id" labelProperty="name"/>
                </html:select>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.cl" />
            </th>
            <td>
                <html:select property="w6003CriteriaDomain.containerLooseTyp" styleId="container_loose_typ" styleClass="container_loose_typ gscm_required" errorStyleClass="container_loose_typ gscm_error_class">
                    <html:options collection="containerLooseTyp" property="id" labelProperty="name"/>
                </html:select>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.ccType" />
            </th>
            <td>
                <html:select property="w6003CriteriaDomain.customTimingTyp" styleId="custom_timing_typ" styleClass="custom_timing_typ gscm_required" errorStyleClass="custom_timing_typ gscm_error_class">
                    <html:options collection="customTimingTyp" property="id" labelProperty="name"/>
                </html:select>
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
                <html:button property="moveToCreate" onclick="gscm.commonSubmit('W6003MoveToCreate.do', this.form);" styleClass="move_to_create">
                    <bean:message key="button.moveToCreate" />
                </html:button>
                <html:button property="backToMainScreen" onclick="gscm.submitBack('W6001Init.do', this.form);" styleClass="back_to_mainScreen">
                    <bean:message key="button.backToMm" />
                </html:button>
            </td>
        </tr>
    </table>

    <%--
    -- hidden
    --%>
    <html:hidden property="windowId" />
    <html:hidden property="languageCd" />
    <html:hidden property="callScreenId" />
</html:form>
