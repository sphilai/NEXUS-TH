<%--
 * WT008.jsp
 * 
 * JSP of Port Search Sub Screen.
 * 港選択子画面のJSPです。
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 --%>
<html:form action="/Wt008Search" styleId="mainForm">
    <%--
    -- search condition 1
    --%>
    <table class="gscm_search">
        <colgroup>
            <col class="search_port_nm" />
            <col class="search_cntry_cd" />
        </colgroup>
        <tr>
            <th>
                <bean:message key="label.portNm" />
            </th>
            <th>
                <bean:message key="label.cntryCd" />
            </th>
        </tr>
        <tr>
            <td>
                <html:text property="wt008CriteriaDomain.portNm" maxlength="45" styleClass="port_nm"
                    errorStyleClass="port_nm gscm_error_class" />
            </td>
            <td>
                <html:text property="wt008CriteriaDomain.cntryCd" styleId="wt008CriteriaDomain.cntryCd"
                    maxlength="2" styleClass="cntry_cd" errorStyleClass="cntry_cd gscm_error_class" />
                <html:button property="" onclick="countrySelect();">
                    <bean:message key="button.select" />
                </html:button>
            </td>
        </tr>
    </table>
    <%--
    -- buttons 1
    --%>
    <table class="gscm_search_button">
        <tr>
            <td class="right">
                <html:button property="" onclick="submitSearch('Wt008Search.do', this.form); return false;">
                    <bean:message key="button.search" />
                </html:button>
            </td>
        </tr>
    </table>
    <hr />
    <logic:notEmpty name="WT008Form" property="wt008ListDomainList" >
    <%--
    -- buttons 2
    --%>
    <table class="gscm_select_button">
        <tr>
            <td>
                <html:button property="" onclick="selectValue();">
                    <bean:message key="button.portSelect" />
                </html:button>
            </td>
        </tr>
    </table>
    <%--
    -- page control
    --%>
    <table class="gscm_page_control">
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
            <col class="resultlist_port_cd" />
            <col class="resultlist_port_nm" />
            <col class="resultlist_cntry_cd" />
        </colgroup>
        <thead>
        <tr>
            <th>
                <bean:message key="label.ck" />
            </th>
            <th>
                <bean:message key="label.portCd" />
            </th>
            <th>
                <bean:message key="label.portNm" />
            </th>
            <th>
                <bean:message key="label.cntryCd" />
            </th>
        </tr>
        </thead>
        <tbody>
        <logic:iterate id="wt008ListDomain" name="WT008Form" property="wt008ListDomainList" indexId="index">
            <ai:stripeline number="${index + 1}" odd="gscm_odd" even="gscm_even">
            <tr>
            <td class="check" align="center">
                <input type="radio" name="selected" value="1" />
            </td>
            <td>
                <html:text name="wt008ListDomain" property="portCd" 
                    value="${wt008ListDomain.portCd}" styleClass="port_cd gscm_disptext"
                    readonly="true" indexed="true" />
            </td>
            <td>
                <html:text name="wt008ListDomain" property="portNm" 
                    value="${wt008ListDomain.portNm}" styleClass="port_nm gscm_disptext"
                    readonly="true" indexed="true" />
            </td>
            <td>
                <html:text name="wt008ListDomain" property="cntryCd" 
                    value="${wt008ListDomain.cntryCd}" styleClass="cntry_cd gscm_disptext"
                    readonly="true" indexed="true" />
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
    <html:hidden property="windowId" />

</html:form>
