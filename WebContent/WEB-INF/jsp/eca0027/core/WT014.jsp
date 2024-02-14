<%--
 * WT014.jsp
 * 
 * JSP of Ship to Search Sub Screen.
 * 送荷先選択子画面のJSPです。
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 --%>
<html:form action="/Wt014Search" styleId="mainForm">
    <%--
    -- search condition 1
    --%>
    <table class="gscm_search">
        <colgroup>
            <col class="search_ship_to_cd" />
            <col class="search_ship_to_nm_abb" />
            <col class="search_ship_to_nm" />
        </colgroup>
        <tr>
            <th>
                <bean:message key="label.WT014.shipToCd" />
            </th>
            <th>
                <bean:message key="label.WT014.shipToNmAbb" />
            </th>
            <th>
                <bean:message key="label.WT014.shipToNm" />
            </th>
        </tr>
        <tr>
            <td>
                <html:text property="wt014CriteriaDomain.shipToCd" maxlength="7" styleClass="ship_to_cd" 
                    errorStyleClass="ship_to_cd gscm_error_class" />
            </td>
            <td>
                <html:text property="wt014CriteriaDomain.shipToNmAbb" maxlength="10"
                    styleClass="ship_to_nm_abb" errorStyleClass="ship_to_nm_abb gscm_error_class" />
            </td>
            <td>
                <html:text property="wt014CriteriaDomain.shipToNm" maxlength="200" styleClass="ship_to_nm"
                    errorStyleClass="ship_to_nm gscm_error_class" />
            </td>
        </tr>
    </table>
    <%--
    -- buttons 1
    --%>
    <table class="gscm_search_button">
        <tr>
            <td class="right">
                <html:button property="" onclick="submitSearch('Wt014Search.do', this.form); return false;">
                    <bean:message key="button.search" />
                </html:button>
            </td>
        </tr>
    </table>
    <hr />
    <logic:notEmpty name="WT014Form" property="wt014ListDomainList" >
    <%--
    -- buttons 2
    --%>
    <table class="gscm_select_button">
        <tr>
            <td>
                <html:button property="" onclick="selectValue();">
                    <bean:message key="button.shipToSelect" />
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
            <col class="resultlist_ship_to_cd" />
            <col class="resultlist_ship_to_nm_abb" />
            <col class="resultlist_ship_to_nm" />
        </colgroup>
        <thead>
        <tr>
            <th>
                <bean:message key="label.ck" />
            </th>
            <th>
                <bean:message key="label.WT014.shipToCd" />
            </th>
            <th>
                <bean:message key="label.WT014.shipToNmAbb" />
            </th>
            <th>
                <bean:message key="label.WT014.shipToNm" />
            </th>
        </tr>
        </thead>
        <tbody>
        <logic:iterate id="wt014ListDomain" name="WT014Form" property="wt014ListDomainList" indexId="index">
            <ai:stripeline number="${index + 1}" odd="gscm_odd" even="gscm_even">
            <tr>
            <td class="check" align="center">
                <input type="radio" name="selected" value="1" />
            </td>
            <td>
                <html:text name="wt014ListDomain" property="shipToCd" 
                    value="${wt014ListDomain.shipToCd}" styleClass="ship_to_cd gscm_disptext ship_to_cd"
                    readonly="true" indexed="true" />
            </td>
            <td>
                <html:text name="wt014ListDomain" property="shipToNmAbb" 
                    value="${wt014ListDomain.shipToNmAbb}" styleClass="ship_to_nm_abb gscm_disptext"
                    readonly="true" indexed="true" />
            </td>
            <td>
                <html:text name="wt014ListDomain" property="shipToNm" 
                    value="${wt014ListDomain.shipToNm}" styleClass="gscm_disptext ship_to_nm"
                    readonly="true" indexed="true" />
            </td>
                <html:hidden name="wt014ListDomain" property="printShipToNm"
                    value="${wt014ListDomain.printShipToNm}" indexed="true" />
                <html:hidden name="wt014ListDomain" property="printShipToAddr" 
                    value="${wt014ListDomain.printShipToAddr}" indexed="true" />
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
