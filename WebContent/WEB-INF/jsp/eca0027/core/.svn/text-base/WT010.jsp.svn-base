<%--
 * WT010.jsp
 * 
 * JSP of Warehouse Search Sub Screen.
 * 倉庫選択子画面のJSPです。
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 --%>
<html:form action="/Wt010Search" styleId="mainForm">
    <%--
    -- search condition 1
    --%>
    <table class="gscm_search">
        <colgroup>
            <col class="search_comp_cd" />
            <col class="search_wh_cd" />
            <col class="search_wh_nm" />
        </colgroup>
        <tr>
            <th>
                <bean:message key="label.WT010.compCd" />
            </th>
            <th>
                <bean:message key="label.whCd" />
            </th>
            <th>
                <bean:message key="label.whNm" />
            </th>
        </tr>
        <tr>
            <td>
                <html:text property="wt010CriteriaDomain.compCd" maxlength="5" styleClass="comp_cd" errorStyleClass="comp_cd gscm_error_class" />
            </td>
            <td>
                <html:text property="wt010CriteriaDomain.whCd" maxlength="4"  styleClass="wh_cd" errorStyleClass="wh_cd gscm_error_class" />
            </td>
            <td>
                <html:text property="wt010CriteriaDomain.whNm" maxlength="75" styleClass="wh_nm" errorStyleClass="wh_nm gscm_error_class" />
            </td>
        </tr>
    </table>
    <%--
    -- buttons 1
    --%>
    <table class="gscm_search_button">
        <tr>
            <td class="right">
                <html:button property="" onclick="submitSearch('Wt010Search.do', this.form); return false;">
                    <bean:message key="button.search" />
                </html:button>
            </td>
        </tr>
    </table>
    <hr />
    <logic:notEmpty name="WT010Form" property="wt010ListDomainList" >
    <%--
    -- buttons 2
    --%>
    <table class="gscm_select_button">
        <tr>
            <td>
                <html:button property="" onclick="selectValue();">
                    <bean:message key="button.whSelect" />
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
            <col class="resultlist_wh_cd" />
            <col class="resultlist_wh_nm" />
        </colgroup>
        <thead>
        <tr>
            <th>
                <bean:message key="label.ck" />
            </th>
            <th>
                <bean:message key="label.WT010.compCd" />
            </th>
            <th>
                <bean:message key="label.whCd" />
            </th>
            <th>
                <bean:message key="label.whNm" />
            </th>
        </tr>
        </thead>
        <tbody>
        <logic:iterate id="wt010ListDomain" name="WT010Form" property="wt010ListDomainList" indexId="index">
            <ai:stripeline number="${index + 1}" odd="gscm_odd" even="gscm_even">
            <tr>
            <td class="check" align="center">
                <input type="radio" name="selected" value="1" />
            </td>
            <td>
                <html:text name="wt010ListDomain" property="compCd" 
                    value="${wt010ListDomain.compCd}" styleClass="comp_cd gscm_disptext"
                    readonly="true" indexed="true" />
            </td>
            <td>
                <html:text name="wt010ListDomain" property="whCd" 
                    value="${wt010ListDomain.whCd}" styleClass="wh_cd gscm_disptext"
                    readonly="true" indexed="true" />
            </td>
            <td>
                <html:text name="wt010ListDomain" property="whNm" 
                    value="${wt010ListDomain.whNm}" styleClass="wh_nm gscm_disptext"
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
