<%--
 * W9013.jsp
 * 
 * JSP of Warehouse Search Screen.
 * 倉庫検索画面のJSPです。
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 --%>
<c:set var="searchAction" scope="request">
    <html:rewrite action="/W9013Search">
    </html:rewrite>
</c:set>
<html:form action="/W9013Search" styleId="mainForm">
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
                <bean:message key="label.compCd" />
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
                <html:text property="w9013CriteriaDomain.compCd" maxlength="5" styleClass="comp_cd" errorStyleClass="comp_cd gscm_error_class" />
            </td>
            <td>
                <html:text property="w9013CriteriaDomain.whCd" maxlength="4" styleClass="wh_cd" errorStyleClass="wh_cd gscm_error_class" />
            </td>
            <td>
                <html:text property="w9013CriteriaDomain.whNm" maxlength="75" styleClass="wh_nm" errorStyleClass="wh_nm gscm_error_class" />
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
    <logic:notEmpty name="W9013Form" property="w9013ListDomainList" >
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
                <col class="resultlist_comp_cd" />
                <col class="resultlist_wh_cd" />
                <col class="resultlist_wh_nm" />
                <col class="resultlist_wh_addr" />
                <col class="resultlist_remarks" />
                <col class="resultlist_odr_confirm_flg" />
            </colgroup>
            <thead>
                <tr>
                    <th>
                        <bean:message key="label.compCd" />
                    </th>
                    <th>
                        <bean:message key="label.whCd" />
                    </th>
                    <th>
                        <bean:message key="label.whNm" />
                    </th>
                    <th>
                        <bean:message key="label.whAddr" />
                    </th>
                    <th>
                        <bean:message key="label.remarks" />
                    </th>
                    <th>
                        <bean:message key="label.odrConfirmFlg" />
                    </th>
                </tr>
            </thead>
            <tbody>
                <logic:iterate id="w9013ListDomain" name="W9013Form" property="w9013ListDomainList" indexId="index">
                    <ai:stripeline number="${index + 1}" odd="gscm_odd" even="gscm_even">
                        <tr>
                            <td>
                                <bean:write name="w9013ListDomain" property="compCd" />
                            </td>
                            <td>
                                <bean:write name="w9013ListDomain" property="whCd" />
                            </td>
                            <td>
                                <html:text name="w9013ListDomain" property="whNm" 
                                    value="${w9013ListDomain.whNm}" styleClass="wh_nm gscm_disptext"
                                    readonly="true" indexed="true" />
                            </td>
                            <td>
                                <html:text name="w9013ListDomain" property="whAddr" 
                                    value="${w9013ListDomain.whAddr}" styleClass="wh_addr gscm_disptext"
                                    readonly="true" indexed="true" />
                            </td>
                            <td>
                                <html:text name="w9013ListDomain" property="remarks" 
                                    value="${w9013ListDomain.remarks}" styleClass="remarks gscm_disptext"
                                    readonly="true" indexed="true" />
                            </td>
                            <td>
                                <bean:write name="w9013ListDomain" property="odrConfirmFlg" />
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
