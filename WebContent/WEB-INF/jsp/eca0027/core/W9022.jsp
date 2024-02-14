<%--
 * Project : GSCM
 * 
 * W9022 - Invoice Template MA Inquiry
 *
 * $Revision: 7765 $
 * 
 * Copyright (c) 2013 DENSO CORPORATION. All rights reserved.
 --%>
<html:form action="/W9022Init" styleId="mainForm">
    <%--
    -- search condition 1
    --%>
    <table class="gscm_search">
        <colgroup>
            <col class="search_company" />
            <col class="search_doc_no" />
            <col class="search_invoice_ctgry" />
            <col class="search_invoice_class" />
        </colgroup>
        <tr>
            <th>
                <bean:message key="label.company" />
            </th>
            <th>
                <bean:message key="label.docNo" />
            </th>
            <th>
                <bean:message key="label.invoiceCtgry" />
            </th>
            <th>
                <bean:message key="label.invoiceClass" />
            </th>
        </tr>
        <tr>
            <td>
                <html:text property="w9022CriteriaDomain.company" maxlength="5" styleClass="comp_cd" errorStyleClass="gscm_error_class comp_cd" />
            </td>
            <td>
                <html:text property="w9022CriteriaDomain.docNo" maxlength="3" styleClass="doc_no" errorStyleClass="gscm_error_class doc_no" />
            </td>
            <td>
                <html:select property="w9022CriteriaDomain.invoiceCtgry" styleId="invoice_ctgry" styleClass="w9022_invoice_ctgry" errorStyleClass="gscm_error_class w9022_invoice_ctgry">
                    <html:options collection="invoiceCtgry" property="id" labelProperty="name"/>
                </html:select>
            </td>
            <td>
                <html:select property="w9022CriteriaDomain.invoiceClass" styleId="invoice_class" styleClass="invoice_class" errorStyleClass="gscm_error_class invoice_class">
                    <html:options collection="invoiceClass" property="id" labelProperty="name"/>
                </html:select>
            </td>
        </tr>
    </table>
    <%--
    -- buttons 1
    --%>
    <table class="gscm_search_button">
        <colgroup>
            <col class="gscm_search_button_add" />
            <col class="gscm_search_button_search" />
        </colgroup>
        <tr>
            <td>
                <html:button property="add" onclick="gscm.commonSubmit('W9023Init.do', this.form);" styleClass="add">
                    <bean:message key="button.add" />
                </html:button>
            </td>
            <td class="right">
                <html:button property="search" onclick="gscm.commonSubmit('W9022Search.do', this.form)" styleClass="search">
                    <bean:message key="button.search" />
                </html:button>
            </td>
        </tr>
    </table>
    <hr />
    <logic:notEmpty name="W9022Form" property="listDomainList" >
        <%--
        -- buttons 2
        --%>
        <table class="gscm_resultlist_button">
            <colgroup>
                <col />
            </colgroup>
            <tr>
                <td>
                    <html:button property="editRefer" onclick="gscm.commonSubmit('W9022EditOrRefer.do', this.form);" styleClass="editRefer">
                        <bean:message key="button.editRefer" />
                    </html:button>
                    <bean:define id="deleteConfirmMessage"><bean:message key="GSCM-I0-0005" locale="${locale_key}" /></bean:define>
                    <html:button property="delete" onclick="gscm.submitConfirm('W9022Delete.do', this.form, '${deleteConfirmMessage}')" styleClass="delete">
                        <bean:message key="button.delete" />
                    </html:button>
                </td>
            </tr>
        </table>
        <%--
        -- page control
        --%>
        <table class="gscm_resultlist_button">
            <colgroup>
                <col />
            </colgroup>
            <tr>
                <td class="right" style="padding-right: 20px;">
                    <%@ include file="/WEB-INF/jsp/includes/gscm/framework/pager.jspf"%>
                </td>
            </tr>
        </table>
        <%--
        -- search results
        --%>
        <table id="tablefix" class="gscm_resultlist">
            <colgroup>
                <col class="resultlist_ck" />
                <col class="resultlist_comp_cd" />
                <col class="resultlist_doc_no" />
                <col class="resultlist_invoice_ctgry" />
                <col class="resultlist_invoice_class" />
            </colgroup>
            <thead>
                <tr>
                    <th>
                        <bean:message key="label.ck" />
                    </th>
                    <th>
                        <bean:message key="label.compCd" />
                    </th>
                    <th>
                        <bean:message key="label.docNo" />
                    </th>
                    <th>
                        <bean:message key="label.invoiceCtgry" />
                    </th>
                    <th>
                        <bean:message key="label.invoiceClass" />
                    </th>
                </tr>
            </thead>
            <tbody>
                <logic:iterate name="W9022Form" property="listDomainList" id="listDomainList" indexId="idx">
                    <tr class="gscm_odd">
                        <td class="center">
                            <html:radio property="w9022CriteriaDomain.selected" value="${idx}" />
                        </td>
                        <td>
                            <html:text name="listDomainList" property="compCd" readonly="true" indexed="true" styleClass="comp_cd gscm_disptext" />
                        </td>
                        <td>
                            <html:text name="listDomainList" property="docNo" readonly="true" indexed="true" styleClass="doc_no gscm_disptext" />
                        </td>
                        <td>
                            <bean:write name="listDomainList" property="invoiceCtgry" />
                        </td>
                        <td>
                            <bean:write name="listDomainList" property="invoiceClass" />
                        </td>
                        <html:hidden name="listDomainList" property="comUpdateTimestamp" indexed="true" />
                   </tr>
                </logic:iterate>
            </tbody>
        </table>
    </logic:notEmpty>
    <%--
    -- hidden
    --%>
    <html:hidden property="callScreenId" />
</html:form>
