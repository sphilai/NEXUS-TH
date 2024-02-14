<%--
 * WT002.jsp
 * 
 * JSP of Company Search Sub Screen.
 * 会社選択子画面のJSPです。
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 --%>
<html:form action="/Wt002Search" styleId="mainForm">
    <%--
    -- search condition 1
    --%>
    <table class="gscm_search">
        <colgroup>
            <col class="search_shipper_cd" />
            <col class="search_customer_cd" />
        </colgroup>
        <tr>
            <th>
                <bean:message key="label.shipper" />
            </th>
            <th>
                <bean:message key="label.customerCd" />
            </th>
        </tr>
        <tr>
            <td>
                <html:text property="wt002CriteriaDomain.shipperCd" maxlength="5" styleClass="shipper_cd gscm_required"
                    errorStyleClass="shipper_cd gscm_error_class" />
            </td>
            <td>
                <html:text property="wt002CriteriaDomain.customerCd" maxlength="8"
                    styleClass="customer_cd" errorStyleClass="customer_cd gscm_error_class" />
            </td>
        </tr>
    </table>
    <%--
    -- search condition 2
    --%>
    <table class="gscm_search">
        <colgroup>
            <col class="search_ship_to_nm_abb" />
            <col class="search_ship_to_nm" />
        </colgroup>
        <tr>
            <th>
                <bean:message key="label.WT002.shipToNmAbb" />
            </th>
            <th>
                <bean:message key="label.WT002.shipToNm" />
            </th>
        </tr>
        <tr>
            <td>
                <html:text property="wt002CriteriaDomain.shipToAbb" maxlength="27" styleClass="ship_to_nm_abb"  errorStyleClass="ship_to_nm_abb gscm_error_class" />
            </td>
            <td>
                <html:text property="wt002CriteriaDomain.shipToNm" maxlength="100" styleClass="ship_to_nm"  errorStyleClass="ship_to_nm gscm_error_class" />
            </td>
        </tr>
    </table>
    <%--
    -- buttons 1
    --%>
    <table class="gscm_search_button">
        <tr>
            <td class="right">
                <html:button property="" onclick="submitSearch('Wt002Search.do', this.form); return false;">
                    <bean:message key="button.search" />
                </html:button>
            </td>
        </tr>
    </table>
    <hr />
    <logic:notEmpty name="WT002Form" property="wt002ListDomainList" >
    <%--
    -- buttons 2
    --%>
    <table class="gscm_select_button">
        <tr>
            <td>
                <html:button property="" onclick="selectValue();">
                    <bean:message key="button.select" />
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
            <col class="resultlist_customer_cd" />
            <col class="resultlist_lgcy_ship_to" />
            <col class="resultlist_ship_to_nm_abb" />
            <col class="resultlist_comp_nm" />
            <col class="resultlist_ship_to_nm" />
        </colgroup>
        <thead>
        <tr>
            <th>
                <bean:message key="label.ck" />
            </th>
            <th>
                <bean:message key="label.customerCd" />
            </th>
            <th>
                <bean:message key="label.shipToCd" />
            </th>
            <th>
                <bean:message key="label.WT002.shipToNmAbb" />
            </th>
            <th>
                <bean:message key="label.WT002.consigneeNm" />
            </th>
            <th>
                <bean:message key="label.shipToNm" />
            </th>
        </tr>
        </thead>
        <tbody>
        <logic:iterate id="wt002ListDomain" name="WT002Form" property="wt002ListDomainList" indexId="index">
            <ai:stripeline number="${index + 1}" odd="gscm_odd" even="gscm_even">
            <tr>
            <td class="check" align="center">
                <input type="radio" name="selected" value="1" />
            </td>
            <td>
                <html:text name="wt002ListDomain" property="customerCd" 
                    value="${wt002ListDomain.customerCd}" styleClass="customer_cd gscm_disptext"
                    readonly="true" indexed="true" />
            </td>
            <td>
                <html:text name="wt002ListDomain" property="lgcyShipToCd" 
                    value="${wt002ListDomain.lgcyShipToCd}" styleClass="lgcy_ship_to gscm_disptext"
                    readonly="true" indexed="true" />
            </td>
            <td>
                <html:text name="wt002ListDomain" property="shipToAbb" 
                    value="${wt002ListDomain.shipToAbb}" styleClass="ship_to_nm_abb gscm_disptext"
                    readonly="true" indexed="true" />
            </td>
            <td>
                <html:text name="wt002ListDomain" property="consigneeNm" 
                    value="${wt002ListDomain.consigneeNm}" styleClass="consignee_comp_nm gscm_disptext"
                    readonly="true" indexed="true" />
            </td>
            <td>
                <html:text name="wt002ListDomain" property="shipToNm" 
                    value="${wt002ListDomain.shipToNm}" styleClass="ship_to_nm gscm_disptext"
                    readonly="true" indexed="true" />
            </td>
                <html:hidden name="wt002ListDomain" property="shipToCntryCd" 
                    value="${wt002ListDomain.shipToCntryCd}" indexed="true" />
                <html:hidden name="wt002ListDomain" property="accounteeCd" 
                    value="${wt002ListDomain.accounteeCd}" indexed="true" />
                <html:hidden name="wt002ListDomain" property="shipToCd" 
                    value="${wt002ListDomain.shipToCd}" indexed="true" />
                <html:hidden name="wt002ListDomain" property="consigneeCd" 
                    value="${wt002ListDomain.consigneeCd}" indexed="true" />
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
        