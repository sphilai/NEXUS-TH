<%--
 * WT011.jsp
 * 
 * JSP of Country Search Sub Screen.
 * 国選択子画面のJSPです。
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 --%>
<html:form action="/Wt011Search" styleId="mainForm">
    <%--
    -- search condition 1
    --%>
    <table class="gscm_search">
        <colgroup>
            <col class="search_cntry_cd" />
            <col class="search_cntry_nm" />
        </colgroup>
        <tr>
            <th>
                <bean:message key="label.cntryCd" />
            </th>
            <th>
                <bean:message key="label.cntryNm" />
            </th>
        </tr>
        <tr>
            <td>
                <html:text property="wt011CriteriaDomain.cntryCd" maxlength="2" styleClass="cntry_cd" errorStyleClass="cntry_cd gscm_error_class" />
            </td>
            <td>
                <html:text property="wt011CriteriaDomain.cntryNm" maxlength="50" styleClass="cntry_nm" errorStyleClass="cntry_nm gscm_error_class" />
            </td>
        </tr>
    </table>
    <%--
    -- buttons 1
    --%>
    <table class="gscm_search_button">
        <tr>
            <td class="right">
                <html:button property="" onclick="submitSearch('Wt011Search.do', this.form); return false;">
                    <bean:message key="button.search" />
                </html:button>
            </td>
        </tr>
    </table>
    <hr />
    <logic:notEmpty name="WT011Form" property="wt011ListDomainList" >
    <%--
    -- buttons 2
    --%>
    <table class="gscm_select_button">
        <tr>
            <td>
                <html:button property="" onclick="selectValue();">
                    <bean:message key="button.countrySelect" />
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
            <col class="resultlist_cntry_cd" />
            <col class="resultlist_cntry_nm" />
        </colgroup>
        <thead>
        <tr>
            <th>
                <bean:message key="label.ck" />
            </th>
            <th>
                <bean:message key="label.cntryCd" />
            </th>
            <th>
                <bean:message key="label.cntryNm" />
            </th>
        </tr>
        </thead>
        <tbody>
        <logic:iterate id="wt011ListDomain" name="WT011Form" property="wt011ListDomainList" indexId="index">
            <ai:stripeline number="${index + 1}" odd="gscm_odd" even="gscm_even">
            <tr>
            <td class="check" align="center">
                <input type="radio" name="selected" value="1" />
            </td>
            <td>
                <html:text name="wt011ListDomain" property="cntryCd" 
                    value="${wt011ListDomain.cntryCd}" styleClass="cntry_cd cntryCd gscm_disptext"
                    readonly="true" indexed="true" />
            </td>
            <td>
                <html:text name="wt011ListDomain" property="cntryNm" 
                    value="${wt011ListDomain.cntryNm}" styleClass="cntry_nm cntryNm gscm_disptext"
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
