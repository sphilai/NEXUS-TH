<%--
 * W9015.jsp
 * 
 * JSP of CIGMA W/H X-Reference MA Edit Screen.
 * CIGMA W/H X-Reference MA Edit画面のJSPです。
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 --%>
<%-- Action of the submit destination --%>
<%-- submit先のアクション --%>
<c:set var="backToMainScreenAction" scope="request">
    <html:rewrite action="/W9014Init"></html:rewrite>
</c:set>
<c:set var="registerAction" scope="request">
    <html:rewrite action="/W9015Register"></html:rewrite>
</c:set>
<html:form action="/W9015Init" styleId="mainForm">
    <%--
    -- buttons 1
    --%>
    <table class="gscm_resultlist_button">
        <tr>
            <td>
                <bean:define id="backToInquiryConfirmMessage">
                    <bean:message key="GSCM-I0-0002"/>
                </bean:define>
                <html:button property="backToInquiry" 
                    onclick="doBackToMain('${backToMainScreenAction}', this.form);">
                    <bean:message key="button.backToInquiry" />
                </html:button>
            </td>
        </tr>
    </table>
    <%--
    -- Edit 1
    --%>
    <table class="grid">
        <colgroup>
            <col class="grid_header" />
            <col class="grid_contents" />
        </colgroup>
        <tr>
            <th class="right">
                <bean:message key="label.lgcyLibCompCd" />
            </th>
            <th class="left">
                <bean:message key="label.key" />
            </th>
            <td>
                <html:text property="w9015CriteriaDomain.lgcyLibCompCd" maxlength="3"
                    styleClass="lgcy_lib_comp_cd ${w9015CriteriaDomain.procMode == '1' ? 'gscm_required' : 'gscm_disptext'}" 
                        errorStyleClass="lgcy_lib_comp_cd gscm_error_class" 
                        readonly="${w9015CriteriaDomain.procMode == '1' ? 'false' : 'true'}"/>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.lgcyWhCd" />
            </th>
            <th class="left">
                <bean:message key="label.key" />
            </th>
            <td>
                <html:text property="w9015CriteriaDomain.lgcyWhCd" maxlength="1"
                    styleClass="lgcy_wh_cd ${w9015CriteriaDomain.procMode == '1' ? 'gscm_required' : 'gscm_disptext'}"
                        errorStyleClass="lgcy_wh_cd gscm_error_class"
                        readonly="${w9015CriteriaDomain.procMode == '1' ? 'false' : 'true'}"/>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.plntCd" />
            </th>
            <th class="left">
                <bean:message key="label.key" />
            </th>
            <td>
                <html:text property="w9015CriteriaDomain.plntCd" maxlength="2"
                    styleClass="plnt_cd ${w9015CriteriaDomain.procMode == '1' ? 'gscm_required' : 'gscm_disptext'}" 
                        errorStyleClass="plnt_cd gscm_error_class" 
                        readonly="${w9015CriteriaDomain.procMode == '1' ? 'false' : 'true'}"/>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.W9015.compCd" />
            </th>
            <th>
            </th>
            <td>
                <html:text property="w9015CriteriaDomain.compCd" maxlength="5"
                    styleClass="comp_cd ${w9015CriteriaDomain.procMode == '3' ? 'gscm_disptext' : 'gscm_required'}" 
                        errorStyleClass="comp_cd gscm_error_class" 
                        readonly="${w9015CriteriaDomain.procMode == '3' ? 'true' : 'false'}"/>

            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.whCd" />
            </th>
            <th>
            </th>
            <td>
                <html:text property="w9015CriteriaDomain.whCd" maxlength="4"
                    styleClass="wh_cd ${w9015CriteriaDomain.procMode == '3' ? 'gscm_disptext' : 'gscm_required'}" 
                        errorStyleClass="wh_cd gscm_error_class" 
                        readonly="${w9015CriteriaDomain.procMode == '3' ? 'true' : 'false'}"/>

            </td>
        </tr>
    </table>
    
    <%--
    -- buttons 2
    --%>
    <table class="blank">
        <tr>
            <td class="right">
                <bean:define id="createConfirmMessage">
                    <bean:message key="GSCM-I0-0003"/>
                </bean:define>
                <bean:define id="updateConfirmMessage">
                    <bean:message key="GSCM-I0-0004"/>
                </bean:define>
                <html:button property="register" styleClass="register" 
                disabled="${disableElementList == 'register' ? 'true' : 'false'}"
                onclick="gscm.submitConfirm('${registerAction}', this.form,
                '${w9015CriteriaDomain.procMode == '1' ? createConfirmMessage : updateConfirmMessage}');">
                    <bean:message key="button.register" />
                </html:button>
            </td>
        </tr>
    </table>
    <%--
    -- hidden
    --%>
    <logic:notEmpty name="W9015Form" property="w9015CriteriaDomain.comUpdateTimestamp">
        <html:hidden property="w9015CriteriaDomain.comUpdateTimestamp" />
    </logic:notEmpty>
    <html:hidden property="windowId" />
    <html:hidden property="languageCd" />
    <html:hidden property="callScreenId" />
    <html:hidden property="procMode" />
</html:form>
