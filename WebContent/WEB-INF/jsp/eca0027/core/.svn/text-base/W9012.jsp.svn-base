<%--
 * W9012.jsp
 * 
 * JSP of CIGMA Customer No. X-Reference MA Edit screen.
 * CIGMA Customer No. X-Reference MA Edit画面のJSPです。
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 --%>
<%-- Action of the submit destination --%>
<%-- submit先のアクション --%>
<c:set var="backToMainScreenAction" scope="request">
    <html:rewrite action="/W9011Init">
    </html:rewrite>
</c:set>
<c:set var="registerAction" scope="request">
    <html:rewrite action="/W9012Register">
    </html:rewrite>
</c:set>
<html:form action="/W9012Init" styleId="mainForm">
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
                <html:text property="w9012CriteriaDomain.lgcyLibCompCd" maxlength="3" 
                    styleClass="lgcy_lib_comp_cd ${w9012CriteriaDomain.procMode == '1' ? 'gscm_required' : 'gscm_disptext'}" 
                        errorStyleClass="lgcy_lib_comp_cd gscm_error_class" 
                        readonly="${w9012CriteriaDomain.procMode == '1' ? 'false' : 'true'}"/>
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
                <html:text property="w9012CriteriaDomain.customerCd" maxlength="8" 
                    styleClass="customer_cd ${w9012CriteriaDomain.procMode == '1' ? 'gscm_required' : 'gscm_disptext'}"
                        errorStyleClass="customer_cd gscm_error_class"
                        readonly="${w9012CriteriaDomain.procMode == '1' ? 'false' : 'true'}"/>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.consigneeCd" />
            </th>
            <th>
            </th>
            <td>
                <html:text property="w9012CriteriaDomain.consigneeCd" maxlength="5" 
                    styleClass="consignee_cd ${w9012CriteriaDomain.procMode == '3' ? 'gscm_disptext' : 'gscm_required'}" 
                        errorStyleClass="consignee_cd gscm_error_class"
                        readonly="${w9012CriteriaDomain.procMode == '3' ? 'true' : 'false'}"/>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.reInvoiceFlg" />
            </th>
            <th>
            </th>
            <td>
                <html:select property="w9012CriteriaDomain.reInvoiceFlg" 
                    styleClass="re_invoice_flg ${w9012CriteriaDomain.procMode == '3' ? 'gscm_disptext' : 'gscm_required'}"
                        errorStyleClass="re_invoice_flg gscm_error_class" 
                        disabled="${w9012CriteriaDomain.procMode == '3' ? 'true' : 'false'}">
                    <html:options collection="flg" property="id" labelProperty="name" />
                </html:select>
                <b><bean:message key="label.forAutoInvoicingPleaseSetUpCigma" /></b>
            </td>
        </tr>
    </table>

    <%--
    -- buttons 2
    --%>
    <table class="blank">
        <tr>
            <td class="right">
                <bean:define id="createConfirmMessage"><bean:message key="GSCM-I0-0003"/></bean:define>
                <bean:define id="updateConfirmMessage"><bean:message key="GSCM-I0-0004"/></bean:define>
                <html:button property="register" styleClass="register" 
                disabled="${disableElementList == 'register' ? 'true' : 'false'}"
                onclick="gscm.submitConfirm('${registerAction}', this.form,
                '${w9012CriteriaDomain.procMode == '1' ? createConfirmMessage : updateConfirmMessage}');">
                    <bean:message key="button.register" />
                </html:button>
            </td>
        </tr>
    </table>
    <%--
    -- hidden
    --%>
    <logic:notEmpty name="W9012Form" property="w9012CriteriaDomain.comUpdateTimestamp">
        <html:hidden property="w9012CriteriaDomain.comUpdateTimestamp" />
    </logic:notEmpty>
    <html:hidden property="windowId" />
    <html:hidden property="languageCd" />
    <html:hidden property="callScreenId" />
    <html:hidden property="procMode" />
</html:form>
