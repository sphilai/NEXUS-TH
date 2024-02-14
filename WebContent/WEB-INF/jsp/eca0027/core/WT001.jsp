<%--
 * WT001.jsp
 * 
 * JSP of Company Search Sub Screen.
 * 会社選択子画面のJSPです。
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 --%>
<html:form action="/Wt001Search" styleId="mainForm">
    <%--
    -- search condition 1
    --%>
    <table class="gscm_search">
        <colgroup>
            <col class="search_comp_cd" />
            <col class="search_comp_nm_abb" />
        </colgroup>
        <tr>
            <th>
                <bean:message key="label.WT001.compCd" />
            </th>
            <th>
                <bean:message key="label.compNmAbb" />
            </th>
        </tr>
        <tr>
            <td>
                <html:text property="wt001CriteriaDomain.compCd" maxlength="5" styleClass="comp_cd"
                    errorStyleClass="comp_cd gscm_error_class" />
            </td>
            <td>
                <html:text property="wt001CriteriaDomain.compNmAbb" maxlength="20"
                    styleClass="comp_nm_abb" errorStyleClass="comp_nm_abb gscm_error_class" />
            </td>
        </tr>
    </table>
    <%--
    -- search condition 2
    --%>
    <table class="gscm_search">
        <tr>
            <th>
                <bean:message key="label.WT001.compNm" />
            </th>
        </tr>
        <tr>
            <td>
                <html:text property="wt001CriteriaDomain.compNm" maxlength="150" styleClass="comp_nm"  errorStyleClass="comp_nm gscm_error_class" />
            </td>
        </tr>
    </table>
    <%--
    -- buttons 1
    --%>
    <table class="gscm_search_button">
        <tr>
            <td class="right">
                <html:button property="" onclick="submitSearch('Wt001Search.do', this.form); return false;">
                    <bean:message key="button.search" />
                </html:button>
            </td>
        </tr>
    </table>
    <hr />
    <logic:notEmpty name="WT001Form" property="wt001ListDomainList" >
    <%--
    -- buttons 2
    --%>
    <table class="gscm_select_button">
        <tr>
            <td>
                <html:button property="" onclick="selectValue();">
                    <bean:message key="button.companySelect" />
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
            <col class="resultlist_comp_cd" />
            <col class="resultlist_comp_nm_abb" />
            <col class="resultlist_comp_nm" />
        </colgroup>
        <thead>
        <tr>
            <th>
                <bean:message key="label.ck" />
            </th>
            <th>
                <bean:message key="label.WT001.compCd" />
            </th>
            <th>
                <bean:message key="label.compNmAbb" />
            </th>
            <th>
                <bean:message key="label.WT001.compNm" />
            </th>
        </tr>
        </thead>
        <tbody>
        <logic:iterate id="wt001ListDomain" name="WT001Form" property="wt001ListDomainList" indexId="index">
            <ai:stripeline number="${index + 1}" odd="gscm_odd" even="gscm_even">
            <tr>
            <td class="check" align="center">
                <input type="radio" name="selected" value="1" />
            </td>
            <td>
                <html:text name="wt001ListDomain" property="compCd" 
                    value="${wt001ListDomain.compCd}" styleClass="comp_cd gscm_disptext"
                    readonly="true" indexed="true" />
            </td>
            <td>
                <html:text name="wt001ListDomain" property="compNmAbb" 
                    value="${wt001ListDomain.compNmAbb}" styleClass="comp_nm_abb gscm_disptext"
                    readonly="true" indexed="true" />
            </td>
            <td>
                <html:text name="wt001ListDomain" property="compNm" 
                    value="${wt001ListDomain.compNm}" styleClass="comp_nm gscm_disptext"
                    readonly="true" indexed="true" />
            </td>
                <html:hidden name="wt001ListDomain" property="compAddr" 
                    value="${wt001ListDomain.compAddr}" indexed="true" />
                <html:hidden name="wt001ListDomain" property="lengthUnitDisp" 
                    value="${wt001ListDomain.lengthUnitDisp}" indexed="true" />
                <html:hidden name="wt001ListDomain" property="weightUnitDisp" 
                    value="${wt001ListDomain.weightUnitDisp}" indexed="true" />
                <html:hidden name="wt001ListDomain" property="volumeUnitDisp" 
                    value="${wt001ListDomain.volumeUnitDisp}" indexed="true" />
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
    <html:hidden property="wt001CriteriaDomain.shipperFlg" styleId="wt001CriteriaDomain.shipperFlg" />
    <html:hidden property="wt001CriteriaDomain.carrierCompFlg" styleId="wt001CriteriaDomain.carrierCompFlg" />
    <html:hidden property="wt001CriteriaDomain.customsBrokerFlg" styleId="wt001CriteriaDomain.customsBrokerFlg" />
</html:form>
