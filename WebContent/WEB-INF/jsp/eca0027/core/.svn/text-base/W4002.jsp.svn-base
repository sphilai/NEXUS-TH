<%--
 * W4002.jsp
 *
 * JSP of staging instruction header screen.
 * 荷揃え指示Header画面のJSPです。
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 --%>

<%-- Action of the submit destination --%>
<%-- submit先のアクション --%>
<c:set var="moveToCreateAction" scope="request">
    <html:rewrite action="/W4002MoveToCreate"></html:rewrite>
</c:set>
<c:set var="backToMainScreenAction" scope="request">
    <html:rewrite action="/W4001Init"></html:rewrite>
</c:set>

<html:form action="/W4002Init" styleId="mainForm">
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
                <bean:message key="label.whCompCd" />
            </th>
            <td>
                <html:text property="w4002CriteriaDomain.whCompCd" maxlength="5" styleClass="wh_comp_cd gscm_required" errorStyleClass="wh_comp_cd gscm_error_class" />
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.whCd" />
            </th>
            <td>
                <html:text property="w4002CriteriaDomain.whCd" maxlength="4" styleClass="wh_cd gscm_required" errorStyleClass="wh_cd gscm_error_class" />
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.trnsCd" />
            </th>
            <td>
                <html:select property="w4002CriteriaDomain.trnsCd" styleClass="trns_cd gscm_required" errorStyleClass="trns_cd gscm_error_class">
                    <html:options collection="trnsCd" property="id" labelProperty="name" />
                </html:select>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.containerSortingKey" />
            </th>
            <td>
                <html:text property="w4002CriteriaDomain.containerSortingKey" maxlength="8" styleClass="container_sorting_key gscm_required" errorStyleClass="container_sorting_key gscm_error_class" />
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.shipperCd" />
            </th>
            <td>
                <html:text property="w4002CriteriaDomain.shipperCd" maxlength="5" styleClass="shipper_cd gscm_required" errorStyleClass="shipper_cd gscm_error_class" />
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.customTimingTyp" />
            </th>
            <td>
                <html:select property="w4002CriteriaDomain.customTimingTyp" styleClass="custom_timing_typ gscm_required" errorStyleClass="custom_timing_typ gscm_error_class">
                    <html:options collection="customTimingTyp" property="id" labelProperty="name" />
                </html:select>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.containerLooseTyp" />
            </th>
            <td>
                <html:select property="w4002CriteriaDomain.containerLooseTyp" styleClass="container_loose_typ gscm_required" errorStyleClass="container_loose_typ gscm_error_class">
                    <html:options collection="containerLooseTyp" property="id" labelProperty="name" />
                </html:select>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.etd" />
            </th>
            <td>
                <html:text property="w4002CriteriaDomain.etd" maxlength="8" styleClass="etd gscm_required" errorStyleClass="etd gscm_error_class" />
                <img src="images/gscm/library/Calendar.gif"
                    onClick = "gscm.writeCalendar('etdDiv', 'mainForm', 'w4002CriteriaDomain.etd', '<bean:message key="format.screen.yyyymmdd" />', this);"/>
                <div id="etdDiv"></div>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.carrierCompCd" />
            </th>
            <td>
                <html:text property="w4002CriteriaDomain.carrierCompCd" maxlength="3" styleClass="carrier_comp_cd gscm_required" errorStyleClass="carrier_comp_cd gscm_error_class" />
                <html:button property="selectCarrier" onclick="showSelectCarrier();" styleClass="select">
                    <bean:message key="button.select" />
                </html:button>
            </td>
        </tr>
    </table>
    <br />
    <%--
    -- buttons 1
    --%>
    <table>
        <tr>
            <td>
                <html:button property="moveToCreate" onclick="gscm.commonSubmit('${moveToCreateAction}', this.form);" styleClass="move_to_create">
                    <bean:message key="button.moveToCreate" />
                </html:button>
                <html:button property="backToMainScreen" onclick="gscm.submitBack('${backToMainScreenAction}', this.form);" styleClass="back_to_main_screen">
                    <bean:message key="button.backToMainScreen" />
                </html:button>
            </td>
        </tr>
    </table>
</html:form>
