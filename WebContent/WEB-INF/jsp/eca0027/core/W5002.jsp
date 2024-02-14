<%--
 * W5002.jsp
 * 
 * JSP of staging instruction header.
 * 出荷確認Header画面のJSPです。
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 --%>
<html:form action="/W5002MoveToCreate" styleId="mainForm">
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
                <html:text property="w5002CriteriaDomain.whCompCd" maxlength="5" 
                    styleClass="wh_comp_cd gscm_required" 
                    errorStyleClass="wh_comp_cd gscm_error_class" />
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.whCd" />
            </th>
            <td>
                <html:text property="w5002CriteriaDomain.whCd" maxlength="4" 
                    styleClass="wh_cd gscm_required" errorStyleClass="wh_cd gscm_error_class" />
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.trnsCd" />
            </th>
            <td>
                <html:select property="w5002CriteriaDomain.trnsCd" 
                    styleClass="trns_cd gscm_required" errorStyleClass="trns_cd gscm_error_class" >
                    <html:options collection="trnsCd" property="id" labelProperty="name"/>
                </html:select>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.containerSortingKey" />
            </th>
            <td>
                <html:text property="w5002CriteriaDomain.containerSortingKey" maxlength="8" 
                    styleClass="container_sorting_key gscm_required" 
                    errorStyleClass="container_sorting_key gscm_error_class" />
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
                <html:button property="moveToCreate" 
                    onclick="gscm.commonSubmit('W5002MoveToCreate.do', this.form);" 
                    styleClass="move_to_create">
                    <bean:message key="button.moveToCreate" />
                </html:button>
                <html:button property="backToMainScreen" 
                    onclick="gscm.submitBack('W5001Init.do', this.form);" 
                    styleClass="back_to_main_screen">
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
