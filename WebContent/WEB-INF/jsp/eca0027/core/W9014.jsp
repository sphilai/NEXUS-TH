<%--
 * W9014.jsp
 * 
 * JSP of CIGMA W/H X-Reference MA Inquiry Screen.
 * CIGMA W/H X-Reference MA Inquiry画面のJSPです。
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 --%>
<%-- Action of the submit destination --%>
<%-- submit先のアクション --%>
<c:set var="searchAction" scope="request">
    <html:rewrite action="/W9014Search">
    </html:rewrite>
</c:set>
<c:set var="addAction" scope="request">
    <html:rewrite action="/W9014Add">
    </html:rewrite>
</c:set>
<c:set var="editOrReferAction" scope="request">
    <html:rewrite action="/W9014EditOrRefer">
    </html:rewrite>
</c:set>
<c:set var="deleteAction" scope="request">
    <html:rewrite action="/W9014Delete">
    </html:rewrite>
</c:set>
<html:form action="/W9014Search" styleId="mainForm">
    <%--
    -- search condition 1
    --%>
    <table class="gscm_search">
        <colgroup>
            <col class="search_lgcy_lib_comp_cd" />
            <col class="search_lgcy_wh_cd" />
            <col class="search_plnt_cd" />
            <col class="search_comp_cd" />
            <col class="search_wh_cd" />
        </colgroup>
        <tr>
            <th>
                <bean:message key="label.lgcyLibCompCd" />
            </th>
            <th>
                <bean:message key="label.lgcyWhCd" />
            </th>
            <th>
                <bean:message key="label.plntCd" />
            </th>
            <th>
                <bean:message key="label.W9014.compCd" />
            </th>
            <th>
                <bean:message key="label.whCd" />
            </th>
        </tr>
        <tr>
            <td>
                <html:text property="w9014CriteriaDomain.lgcyLibCompCd" maxlength="3" 
                    styleClass="lgcy_lib_comp_cd" errorStyleClass="lgcy_lib_comp_cd gscm_error_class"/>
            </td>
            <td>
                <html:text property="w9014CriteriaDomain.lgcyWhCd" maxlength="1" 
                    styleClass="lgcy_wh_cd" errorStyleClass="lgcy_wh_cd gscm_error_class"/>
            </td>
            <td>
                <html:text property="w9014CriteriaDomain.plntCd" maxlength="2" 
                    styleClass="plnt_cd" errorStyleClass="plnt_cd gscm_error_class"/>
            </td>
            <td>
                <html:text property="w9014CriteriaDomain.compCd" maxlength="5" 
                    styleClass="comp_cd" errorStyleClass="comp_cd gscm_error_class"/>
            </td>
            <td>
                <html:text property="w9014CriteriaDomain.whCd" maxlength="4" 
                    styleClass="wh_cd" errorStyleClass="wh_cd gscm_error_class"/>
            </td>
        </tr>
    </table>
    <%--
    -- buttons 1
    --%>
    <table class="gscm_search_button">
        <tr>
            <td>
                <html:button property="add" onclick="gscm.commonSubmit('${addAction}', this.form);"
                    disabled="${disableElementList == 'add' ? 'true' : 'false'}" styleClass="add">
                    <bean:message key="button.add" />
                </html:button>
            </td>
            <td class="right">
                <html:button property="search" onclick="gscm.submitSearch('${searchAction}', this.form, '')" styleClass="search">
                    <bean:message key="button.search" />
                </html:button>
            </td>
        </tr>
    </table>
    <hr />
    <logic:notEmpty name="W9014Form" property="w9014ListDomainList" >
        <%--
        -- buttons 2
        --%>
        <table class="gscm_resultlist_button">
            <tr>
                <td>
                    <bean:define id="deleteConfirmMessage">
                        <bean:message key="GSCM-I0-0005"/>
                    </bean:define>
                    <html:button property="editOrRefer" onclick="gscm.commonSubmit('${editOrReferAction}', this.form);" styleClass="editRefer">
                        <bean:message key="button.editRefer" />
                    </html:button>
                    <html:button property="delete" onclick="gscm.submitConfirm('${deleteAction}', this.form, 
                      '${deleteConfirmMessage}');" styleClass="delete">
                        <bean:message key="button.delete" />
                    </html:button>
                </td>
            </tr>
        </table>
        <%--
        -- page control
        --%>
        <table class="gscm_resultlist_button">
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
                <col class="resultlist_lgcy_lib_comp_cd" />
                <col class="resultlist_lgcy_wh_cd" />
                <col class="resultlist_plnt_cd" />
                <col class="resultlist_comp_cd" />
                <col class="resultlist_wh_cd" />
            </colgroup>
            <thead>
                <tr>
                    <th>
                        <bean:message key="label.ck" />
                    </th>
                    <th>
                        <bean:message key="label.lgcyLibCompCd" />
                    </th>
                    <th>
                        <bean:message key="label.lgcyWhCd" />
                    </th>
                    <th>
                        <bean:message key="label.plntCd" />
                    </th>
                    <th>
                        <bean:message key="label.W9014.compCd" />
                    </th>
                    <th>
                        <bean:message key="label.whCd" />
                    </th>
                </tr>
            </thead>
            <tbody>
                <logic:iterate name="W9014Form" property="w9014ListDomainList" id="w9014ListDomain" 
                    scope="request" indexId="idx">
                    <ai:stripeline number="${idx + 1}" odd="gscm_odd" even="gscm_even">
                        <tr>
                            <td class="center">
                                <html:radio name="w9014ListDomain" property="ck" value="${idx}" />
                            </td>
                            <td>
                                <html:text name="w9014ListDomain" property="lgcyLibCompCd" 
                                    styleClass="lgcy_lib_comp_cd gscm_disptext" errorStyle="" readonly="true"/>
                            </td>
                            <td>
                                <html:text name="w9014ListDomain" property="lgcyWhCd" 
                                    styleClass="lgcy_wh_cd gscm_disptext" errorStyle="" readonly="true"/>
                            </td>
                            <td>
                                <html:text name="w9014ListDomain" property="plntCd" 
                                    styleClass="plnt_cd gscm_disptext" errorStyle="" readonly="true"/>
                            </td>
                            <td>
                                <bean:write name="w9014ListDomain" property="compCd" />
                            </td>
                            <td>
                                <bean:write name="w9014ListDomain" property="whCd" />
                            </td>
                            <html:hidden name="w9014ListDomain" property="comUpdateTimestamp" />
                        </tr>
                    </ai:stripeline>
                </logic:iterate>
            </tbody>
        </table>
    </logic:notEmpty>
    <%--
    -- hidden
    --%>
    <html:hidden property="windowId" />
    <html:hidden property="languageCd" />
    <html:hidden property="screenId" />
    <html:hidden property="callScreenId" />
</html:form>
