<%--
 * W2015.jsp
 * 
 * X-Tag Header画面のJSPです。
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 --%>
<html:form action="/W2015MoveToCreate" styleId="mainForm">
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
                <bean:message key="label.curWhCompCd" />
            </th>
            <td>
                <html:text property="w2015CriteriaDomain.curWhCompCd" maxlength="5" styleClass="cur_wh_comp_cd gscm_required" errorStyleClass="cur_wh_comp_cd gscm_error_class" />
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.curWhCd" />
            </th>
            <td>
                <html:text property="w2015CriteriaDomain.curWhCd" maxlength="4" styleClass="cur_wh_cd gscm_required" errorStyleClass="cur_wh_cd gscm_error_class" />
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.trnsCd" />
            </th>
            <td>
                <html:select property="w2015CriteriaDomain.trnsCd" styleClass="trns_cd gscm_required" errorStyleClass="trns_cd gscm_error_class">
                    <html:options collection="trnsCd" property="id" labelProperty="name" />
                </html:select>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.containerSortingKey" />
            </th>
            <td>
                <html:text property="w2015CriteriaDomain.containerSortingKey" maxlength="8" styleClass="container_sorting_key gscm_required" errorStyleClass="container_sorting_key gscm_error_class" />
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.loadingCd" />
            </th>
            <td>
                <html:select property="w2015CriteriaDomain.loadingCd" styleClass="loading_cd gscm_required" errorStyleClass="loading_cd gscm_error_class">
                    <html:options collection="loadingCd" property="id" labelProperty="name" />
                </html:select>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.shipToCompCd" />
            </th>
            <td>
                <html:text property="w2015CriteriaDomain.shipToCompCd" maxlength="5" styleClass="ship_to_comp_cd gscm_required" errorStyleClass="ship_to_comp_cd gscm_error_class" />
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
                <html:button property="moveToCreate" styleClass="move_to_create" onclick="gscm.commonSubmit('W2015MoveToCreate.do', this.form);">
                    <bean:message key="button.moveToCreate" />
                </html:button>
                <html:button property="backToMainScreen" styleClass="back_to_main_screen" onclick="gscm.submitBack('W2014Init.do', this.form);">
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
