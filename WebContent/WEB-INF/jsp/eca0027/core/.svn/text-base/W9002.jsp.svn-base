<%--
 * Project : GSCM
 * 
 * W9002 - Agent MA inquiry
 *
 * $Revision: 7765 $
 * 
 * Copyright (c) 2013 DENSO CORPORATION. All rights reserved.
 --%>

<html:form action="/W9002Init" styleId="mainForm">
    <%--
    -- search condition 1
    --%>
    <table class="gscm_search">
       <colgroup>
            <col class="search_org_comp_cd" />
            <col class="search_agent_comp_cd" />
            <col class="search_function" />
        </colgroup>
        <tr>
            <th>
                <bean:message key="label.orgCompany" />
            </th>
            <th>
                <bean:message key="label.agentCompany" />
            </th>
            <th>
                <bean:message key="label.function" />
            </th>
        </tr>
        <tr>
            <td>
                <html:text property="w9002CriteriaDomain.orgCompCd" maxlength="5" styleClass="w9002_org_comp_cd" errorStyleClass="w9002_org_comp_cd gscm_error_class" />
            </td>
            <td>
                <html:text property="w9002CriteriaDomain.agentCompCd" maxlength="5" styleClass="w9002_agent_comp_cd" errorStyleClass="w9002_agent_comp_cd gscm_error_class" />
            </td>
            <td>
                <html:select property="w9002CriteriaDomain.function" styleId="function" styleClass="w9002_function" >
                    <html:options collection="function" property="id" labelProperty="name"/>
                </html:select>
            </td>
        </tr>
    </table>
    <%--
    -- buttons 1
    --%>
    <table class="gscm_search_button">
        <colgroup>
            <col class="search_button_add" />
            <col class="search_button_search" />
        </colgroup>
        <tr>
            <td>
                <html:button property="add" onclick="gscm.commonSubmit('W9002Add.do', this.form);">
                    <bean:message key="button.add" />
                </html:button>
            </td>
            <td class="right">
                <html:button property="search" onclick="gscm.commonSubmit('W9002Search.do', this.form);" styleClass="search">
                    <bean:message key="button.search" />
                </html:button>
            </td>
        </tr>
    </table>
    <hr />
    <logic:notEmpty name="W9002Form" property="listDomainList">
        <%--
        -- buttons 2
        --%>
        <table class="gscm_resultlist_button">
            <colgroup>
                <col />
            </colgroup>
            <tr>
                <td>
                    <html:button property="editRefer" onclick="gscm.commonSubmit('W9002EditOrRefer.do', this.form);" styleClass="edit_refer">
                        <bean:message key="button.editRefer" />
                    </html:button>
                    <bean:define id="deleteConfirmMessage"><bean:message key="GSCM-I0-0005" /></bean:define>
                    <html:button property="delete" onclick="gscm.submitConfirm('W9002Delete.do', this.form, '${deleteConfirmMessage}');" styleClass="delete">
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
        <table id="tablefix" class="gscm_resultlist" width="300px">
            <colgroup>
                <col class="resultlist_ck" />
                <col class="resultlist_org_comp_cd" />
                <col />
            </colgroup>
            <thead>
                <tr>
                    <th>
                        <bean:message key="label.ck" />
                    </th>
                    <th>
                        <bean:message key="label.orgCompany" />
                    </th>
                    <th>
                        <bean:message key="label.agentCompany" />
                    </th>
                </tr>
            </thead>
            <tbody>
                <logic:iterate name="W9002Form" property="listDomainList" id="listDomainList" indexId="idx">
                    <ai:stripeline number="${idx + 1}" odd="gscm_odd" even="gscm_even">
                        <tr>
                            <td class="center">
                                <html:radio property="w9002CriteriaDomain.selected" value="${idx}" />
                            </td>
                            <td>
                                <html:text name="listDomainList" property="orgCompCd" indexed="true" styleClass="w9002_org_comp_cd gscm_disptext" readonly="true" />
                            </td>
                            <td>
                                <html:text name="listDomainList" property="agentCompCd" indexed="true" styleClass="w9002_agent_comp_cd gscm_disptext" readonly="true" />
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
</html:form>
