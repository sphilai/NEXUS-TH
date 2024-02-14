<%--
 * W4006.jsp
 *
 * JSP of staging actuality header screen.
 * 山作り実績Header画面のJSPです。
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 --%>

<%-- Action of the submit destination --%>
<%-- submit先のアクション --%>
<c:set var="moveToCreateAction" scope="request">
    <html:rewrite action="/W4006MoveToCreate"></html:rewrite>
</c:set>
<c:set var="backToMainScreenAction" scope="request">
    <html:rewrite action="/W4005Init"></html:rewrite>
</c:set>

<html:form action="/W4006Init" styleId="mainForm">
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
                <html:text property="w4006CriteriaDomain.whCompCd" maxlength="5" styleClass="wh_comp_cd gscm_required" errorStyleClass="wh_comp_cd gscm_error_class" />
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.whCd" />
            </th>
            <td>
                <html:text property="w4006CriteriaDomain.whCd" maxlength="4" styleClass="wh_cd gscm_required" errorStyleClass="wh_cd gscm_error_class" />
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.trnsCd" />
            </th>
            <td>
                <html:select property="w4006CriteriaDomain.trnsCd" styleClass="trns_cd gscm_required" errorStyleClass="trns_cd gscm_error_class">
                    <html:options collection="trnsCd" property="id" labelProperty="name" />
                </html:select>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.containerSortingKey" />
            </th>
            <td>
                <html:text property="w4006CriteriaDomain.containerSortingKey" maxlength="8" styleClass="container_sorting_key gscm_required" errorStyleClass="container_sorting_key gscm_error_class" />
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.trnsTypCd" />
            </th>
            <td>
                <html:select property="w4006CriteriaDomain.trnsTypCd" styleClass="trns_typ_cd gscm_required" errorStyleClass="trns_typ_cd gscm_error_class">
                    <html:options collection="trnsTypCd" property="id" labelProperty="name" />
                </html:select>
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

