<%--
 * WT006.jsp
 * 
 * JSP of Outer Package Search Sub Screen.
 * 外装選択子画面のJSPです。
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 --%>
<html:form action="/Wt006Search" styleId="mainForm">
    <%--
    -- search condition 1
    --%>
    <table class="gscm_search">
        <colgroup>
            <col class="search_owner_comp" />
            <col class="search_outer_pkg_cd" />
            <col class="search_pkg_item_no" />
        </colgroup>
        <tr>
            <th>
                <bean:message key="label.ownerComp" />
            </th>
            <th>
                <bean:message key="label.outerPkgCd" />
            </th>
            <th>
                <bean:message key="label.pkgItemNo" />
            </th>
        </tr>
        <tr>
            <td>
                <html:select property="wt006CriteriaDomain.ownerComp" styleId="ownerComp"
                    styleClass="owner_comp gscm_required" errorStyleClass="ownerComp gscm_error_class">
                    <html:options collection="ownerCompList" property="id" labelProperty="name" />
                </html:select>
            </td>
            <td>
                <html:text property="wt006CriteriaDomain.outerPkgCd" maxlength="4" styleClass="outer_pkg_cd"
                    errorStyleClass="outer_pkg_cd gscm_error_class" styleId="outerPkgCd" />
            </td>
            <td>
                <html:text property="wt006CriteriaDomain.pkgItemNo" maxlength="27" styleClass="pkg_item_no"
                    errorStyleClass="pkg_item_no gscm_error_class" />
            </td>
        </tr>
    </table>
    <%--
    -- buttons 1
    --%>
    <table class="gscm_search_button">
        <tr>
            <td class="right">
                <html:button property="" onclick="submitSearch('Wt006Search.do', this.form)">
                    <bean:message key="button.search" />
                </html:button>
            </td>
        </tr>
    </table>
    <hr />
    <logic:notEmpty name="WT006Form" property="wt006ListDomainList" >
    <%--
    -- buttons 2
    --%>
    <table class="gscm_select_button">
        <tr>
            <td>
                <html:button property="" onclick="selectValue();">
                    <bean:message key="button.outerPkgSelect" />
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
            <col class="resultlist_outer_pkg_cd" />
            <col class="resultlist_length" />
            <col class="resultlist_width" />
            <col class="resultlist_height" />
            <col class="resultlist_pkg_item_no" />
        </colgroup>
        <thead>
        <logic:iterate id="wt006ListDomain" name="WT006Form" property="wt006ListDomainList" length="1">
        <tr>
            <th>
                <bean:message key="label.ck" />
            </th>
            <th>
                <bean:message key="label.outerPkgCd" />
            </th>
            <th>
                <bean:message key="label.WT006.length" /><br>
                <bean:message key="label.leftParen" />
                <bean:write name="wt006ListDomain" property="lengthUnitDisp" />
                <bean:message key="label.rightParen" />
            </th>
            <th>
                <bean:message key="label.WT006.width" /><br>
                <bean:message key="label.leftParen" />
                <bean:write name="wt006ListDomain" property="lengthUnitDisp" />
                <bean:message key="label.rightParen" />
            </th>
            <th>
                <bean:message key="label.WT006.height" /><br>
                <bean:message key="label.leftParen" />
                <bean:write name="wt006ListDomain" property="lengthUnitDisp" />
                <bean:message key="label.rightParen" />
            </th>
            <th>
                <bean:message key="label.pkgItemNo" />
            </th>
        </tr>
        </logic:iterate>
        </thead>
        
        <tbody>
        <logic:iterate id="wt006ListDomain" name="WT006Form" property="wt006ListDomainList" indexId="index">
            <ai:stripeline number="${index + 1}" odd="gscm_odd" even="gscm_even">
            <tr>
            <td class="check" align="center">
                <c:if test="${wt006ListDomain.outerPkgCd != null}">
                    <input type="radio" name="selected" value="1" />
                </c:if>
            </td>
            <td>
                <html:text name="wt006ListDomain" property="outerPkgCd" 
                            value="${wt006ListDomain.outerPkgCd}" styleClass="outer_pkg_cd gscm_disptext"
                            readonly="true" indexed="true" />
            </td>
            <td class="right">
                <fmt:formatNumber value="${wt006ListDomain.lengthAfter}" pattern="####.000" />
            </td>
            <td class="right">
                <fmt:formatNumber value="${wt006ListDomain.widthAfter}" pattern="####.000" />
                <!--<bean:write name="wt006ListDomain" property="widthAfter" />-->
            </td>
            <td class="right">
                <fmt:formatNumber value="${wt006ListDomain.heightAfter}" pattern="####.000" />
                <!--<bean:write name="wt006ListDomain" property="heightAfter" />-->
            </td>
            <td>
                <html:text name="wt006ListDomain" property="pkgItemNo" 
                            value="${wt006ListDomain.pkgItemNo}" styleClass="pkg_item_no gscm_disptext"
                            indexed="true" readonly="true" />
            </td>
                <html:hidden name="wt006ListDomain" property="volumeAfter" 
                            value="${wt006ListDomain.volumeAfter}" indexed="true" />
                <html:hidden name="wt006ListDomain" property="volumeUnitComp" 
                            value="${wt006ListDomain.volumeUnitComp}" indexed="true" />
                <html:hidden name="wt006ListDomain" property="ownerComp" 
                            value="${wt006ListDomain.ownerComp}" indexed="true" />
                <html:hidden name="wt006ListDomain" property="volumeUnitDisp" 
                            value="${wt006ListDomain.volumeUnitDisp}" indexed="true" />
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
    <html:hidden property="wt006CriteriaDomain.ownerCompCsv" styleId="wt006CriteriaDomain.ownerCompCsv"/>
</html:form>
 