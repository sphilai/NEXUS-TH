<%--
 * W9010.jsp
 * 
 * JSP of CIGMA Ship to X-Reference MA Edit screen.
 * CIGMA Ship to X-Reference MA Edit画面のJSPです。
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 --%>
<c:set var="backToMainScreenAction" scope="request">
    <html:rewrite action="/W9009Init">
    </html:rewrite>
</c:set>
<html:form action="/W9010Init" styleId="mainForm">
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
            <col />
        </colgroup>
        <tr>
            <th class="right">
                <bean:message key="label.lgcyLibCompCd" />
            </th>
            <th class="left">
                <bean:message key="label.key" />
            </th>
            <td>
                <html:text property="w9010CriteriaDomain.lgcyLibCompCd" maxlength="3" 
                    styleClass="lgcy_lib_comp_cd ${w9010CriteriaDomain.procMode == '1' ? 'gscm_required' : 'gscm_disptext'}" 
                        errorStyleClass="lgcy_lib_comp_cd gscm_error_class" 
                        readonly="${w9010CriteriaDomain.procMode == '1' ? 'false' : 'true'}"/>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.customerCd" />
            </th>
            <th class="left">
                <bean:message key="label.key" />
            </th>
            <td>
                <html:text property="w9010CriteriaDomain.customerCd" maxlength="8" 
                    styleClass="customer_cd ${w9010CriteriaDomain.procMode == '1' ? 'gscm_required' : 'gscm_disptext'}"
                        errorStyleClass="customer_cd gscm_error_class"
                        readonly="${w9010CriteriaDomain.procMode == '1' ? 'false' : 'true'}"/>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.lgcyShipTo" />
            </th>
            <th class="left">
                <bean:message key="label.key" />
            </th>
            <td>
                <html:text property="w9010CriteriaDomain.lgcyShipTo" maxlength="2" 
                    styleClass="lgcy_ship_to ${w9010CriteriaDomain.procMode == '1' ? 'gscm_required' : 'gscm_disptext'}"
                        errorStyleClass="lgcy_ship_to gscm_error_class"
                        readonly="${w9010CriteriaDomain.procMode == '1' ? 'false' : 'true'}"/>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.W9010.shipToCd" />
            </th>
            <th>
            </th>
            <td>
                <html:text property="w9010CriteriaDomain.shipToCd" maxlength="7" 
                    styleClass="ship_to_cd ${w9010CriteriaDomain.procMode == '3' ? 'gscm_disptext' : 'gscm_required'}" 
                        errorStyleClass="ship_to_cd gscm_error_class"
                        readonly="${w9010CriteriaDomain.procMode == '3' ? 'true' : 'false'}"/>
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
                onclick="gscm.submitConfirm('W9010Register.do', this.form,
                '${w9010CriteriaDomain.procMode == '1' ? createConfirmMessage : updateConfirmMessage}');">
                    <bean:message key="button.register" />
                </html:button>
            </td>
        </tr>
    </table>
    <%--
    -- hidden
    --%>
    <logic:notEmpty name="W9010Form" property="w9010CriteriaDomain.comUpdateTimestamp">
        <html:hidden property="w9010CriteriaDomain.comUpdateTimestamp" />
    </logic:notEmpty>
    <html:hidden property="windowId" />
    <html:hidden property="languageCd" />
    <html:hidden property="callScreenId" />
    <html:hidden property="procMode" />
</html:form>
