<%--
 * Project : GSCM
 * 
 * W9004 - User ID MA inquiry
 *
 * $Revision: 7765 $
 * 
 * Copyright (c) 2013 DENSO CORPORATION. All rights reserved.
 --%>

<html:form action="/W9004Init.do" styleId="mainForm">
    <%--
    -- search condition 1
    --%>
    <table class="gscm_search">
        <colgroup>
            <col class="search_comp_cd" />
            <col class="search_dsc_id" />
            <col class="search_usr_nm_en" />
        </colgroup>
        <tr>
            <th>
                <bean:message key="label.company" />
            </th>
            <th>
                <bean:message key="label.dscId" />
            </th>
            <th>
                <bean:message key="label.usrNmEn" />
            </th>
        </tr>
        <tr>
            <td>
                <html:text property="w9004CriteriaDomain.compCd" maxlength="5" styleClass="comp_cd" errorStyleClass="comp_cd gscm_error_class" />
            </td>
            <td>
                <html:text property="w9004CriteriaDomain.dscId" maxlength="20" styleClass="dsc_id" errorStyleClass="dsc_id gscm_error_class" />
            </td>
            <td>
                <html:text property="w9004CriteriaDomain.usrNmEn" maxlength="150" styleClass="usr_nm_en" errorStyleClass="usr_nm_en gscm_error_class" />
            </td>
        </tr>
    </table>
    <%--
    -- buttons 1
    --%>
    <table class="gscm_resultlist_button">
        <colgroup>
            <col class="search_add" />
            <col class="search_search" />
        </colgroup>
        <tr>
            <td>
                <html:button property="add" onclick="gscm.commonSubmit('W9004Add.do', this.form);" styleClass="add" >
                    <bean:message key="button.add" />
                </html:button>
            </td>
            <td class="right">
                <html:button property="search" onclick="gscm.commonSubmit('W9004Search.do', this.form);" styleClass="search" >
                    <bean:message key="button.search" />
                </html:button>
            </td>
        </tr>
    </table>
    <hr />
    <logic:notEmpty name="W9004Form" property="listDomainList">
        <%--
        -- buttons 2
        --%>
        <table class="gscm_resultlist_button">
            <colgroup>
                <col />
            </colgroup>
            <tr>
                <td>
                    <html:button property="" onclick="gscm.commonSubmit('W9004EditOrRefer.do', this.form);" >
                        <bean:message key="button.editRefer" />
                    </html:button>
                    <bean:define id="deleteConfirmMessage"><bean:message key="GSCM-I0-0005" locale="${locale_key}" /></bean:define>
                    <html:button property="delete" onclick="gscm.submitConfirm('W9004Delete.do', this.form, '${deleteConfirmMessage}');" styleClass="delete" >
                        <bean:message key="button.delete" />
                    </html:button>
                </td>
            </tr>
        </table>
        <%--
        -- page control
        --%>
        <table class="gscm_search_button">
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
                <col class="resultlist_dsc_id" />
                <col class="resultlist_usr_nm_en" />
                <col class="resultlist_company_abbr" />
                <col />
            </colgroup>
            <thead>
                <tr>
                    <th>
                        <bean:message key="label.ck" />
                    </th>
                    <th>
                        <bean:message key="label.dscId" />
                    </th>
                    <th>
                        <bean:message key="label.usrNmEn" />
                    </th>
                    <th>
                        <bean:message key="label.companyAbbr" />
                    </th>
                    <th>
                        <bean:message key="label.mailAdd1" />
                    </th>
                </tr>
            </thead>
            <tbody>
                <logic:iterate name="W9004Form" property="listDomainList" id="listDomainList" indexId="idx">
                    <ai:stripeline number="${idx + 1}" odd="gscm_odd" even="gscm_even">
                        <tr>
                            <td class="center">
                                <html:radio property="w9004CriteriaDomain.selected" value="${idx}" />
                            </td>
                            <td>
                                <html:text name="listDomainList" property="dscId" readonly="true" indexed="true" styleClass="w9004_dsc_id gscm_disptext" />
                            </td>
                            <td>
                                <html:text name="listDomainList" property="usrNmEn" readonly="true" indexed="true" styleClass="w9004_usr_nm_en gscm_disptext" />
                            </td>
                            <td>
                                <bean:write name="listDomainList" property="compNmAbb" />
                            </td>
                            <td>
                                <html:text name="listDomainList" property="mailAdd1" readonly="true" indexed="true" styleClass="w9004_mail_add1 gscm_disptext" />
                                <html:hidden name="listDomainList" property="lastUpdate" indexed="true" />
                            </td>
                        </tr>
                    </ai:stripeline>
                </logic:iterate>
            </tbody>
        </table>
    </logic:notEmpty>
    <%--
    -- hidden
    --%>
    <html:hidden property="callScreenId" />
    <html:hidden property="w9004CriteriaDomain.functionNo" />
</html:form>
