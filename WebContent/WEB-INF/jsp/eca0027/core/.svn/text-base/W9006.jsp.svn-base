<%--
 * W9006.jsp
 * 
 * JSP of NEXUS Ship to MA Inquiry screen.
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 --%>
 <c:set var="searchAction" scope="request">
    <html:rewrite action="/W9006Search">
    </html:rewrite>
</c:set>
<html:form action="/W9006Search" styleId="mainForm">
    <%--
    -- search condition 1
    --%>
    <table class="gscm_search">
        <colgroup>
            <col class="search_ship_to_cd" />
            <col class="search_ship_to_nm" />
            <col class="search_ship_to_nm_abb" />
            <col class="search_nxs_ship_to_comp" />
            <col class="search_comp_nm" />
        </colgroup>
        <tr>
            <th>
                <bean:message key="label.W9006.shipToCd" />
            </th>
            <th>
                <bean:message key="label.W9006.shipToNm" />
            </th>
            <th>
                <bean:message key="label.W9006.shipToNmAbb" />
            </th>
            <th>
                <bean:message key="label.nxsShipToCompany" />
            </th>
            <th>
                <bean:message key="label.W9006.compNm" />
            </th>
        </tr>
        <tr>
            <td>
                <html:text property="w9006CriteriaDomain.shipToCd" maxlength="7" 
                    styleClass="ship_to_cd" errorStyleClass="ship_to_cd gscm_error_class"/>
            </td>
            <td>
                <html:text property="w9006CriteriaDomain.shipToNm" maxlength="150" 
                    styleClass="ship_to_nm" errorStyleClass="ship_to_nm gscm_error_class"/>
            </td>
            <td>
                <html:text property="w9006CriteriaDomain.shipToNmAbb" maxlength="10" 
                    styleClass="ship_to_nm_abb" errorStyleClass="ship_to_nm_abb gscm_error_class"/>
            </td>
            <td>
                <html:text property="w9006CriteriaDomain.nxsShipToCompany" maxlength="5" 
                    styleClass="nxs_ship_to_comp" errorStyleClass="nxs_ship_to_comp gscm_error_class"/>
            </td>
            <td>
                <html:text property="w9006CriteriaDomain.compNm" maxlength="150" 
                    styleClass="comp_nm" errorStyleClass="comp_nm gscm_error_class"/>
            </td>
        </tr>
    </table>
    <%--
    -- buttons 1
    --%>
    <table class="gscm_search_button">
        <tr>
            <td class="right">
                <html:button property="" onclick="gscm.submitSearch('${searchAction}', this.form, '');">
                    <bean:message key="button.search" />
                </html:button>
            </td>
        </tr>
    </table>
    <hr />
    <logic:notEmpty name="W9006Form" property="w9006ListDomainList" >
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
                <col class="resultlist_ship_to_cd" />
                <col class="resultlist_ship_to_nm" />
                <col class="resultlist_ship_to_nm_abb" />
                <col class="resultlist_ship_to_addr" />
                <col class="resultlist_ship_to_tel" />
                <col class="resultlist_nxs_ship_to_comp" />
                <col class="resultlist_comp_nm" />
                <col />
            </colgroup>
            <thead>
            <tr>
                <th>
                    <bean:message key="label.W9006.shipToCd" />
                </th>
                <th>
                    <bean:message key="label.W9006.shipToNm" />
                </th>
                <th>
                    <bean:message key="label.W9006.shipToNmAbb" />
                </th>
                <th>
                    <bean:message key="label.shipToAddr" />
                </th>
                <th>
                    <bean:message key="label.shipToTel" />
                </th>
                <th>
                    <bean:message key="label.nxsShipToCompany" />
                </th>
                <th>
                    <bean:message key="label.W9006.compNm" />
                </th>
            </tr>
            </thead>
            <tbody>
            <logic:iterate name="W9006Form" property="w9006ListDomainList" id="w9006ListDomain" 
                scope="request" indexId="idx">
                <ai:stripeline number="${idx + 1}" odd="gscm_odd" even="gscm_even">
            <tr>
                <td>
                    <bean:write name="w9006ListDomain" property="shipToCd" />
                </td>
                <td>
                    <html:text name="w9006ListDomain" property="shipToNm" 
                        styleClass="gscm_disptext ship_to_nm" errorStyle="" readonly="true" />
                </td>
                <td>
                    <bean:write name="w9006ListDomain" property="shipToNmAbb" />
                </td>
                <td>
                    <html:text name="w9006ListDomain" property="shipToAddr" 
                        styleClass="gscm_disptext ship_to_addr" errorStyle="" readonly="true" />
                </td>
                <td>
                    <bean:write name="w9006ListDomain" property="shipToTel" />
                </td>
                <td>
                    <bean:write name="w9006ListDomain" property="nxsShipToCompany" />
                </td>
                <td><html:text name="w9006ListDomain" property="compNm" 
                        styleClass="gscm_disptext comp_nm" errorStyle="" readonly="true"/>
                </td>
            </tr>
            </ai:stripeline>
            </logic:iterate>
            </tbody>
        </table>
    </logic:notEmpty>
</html:form>