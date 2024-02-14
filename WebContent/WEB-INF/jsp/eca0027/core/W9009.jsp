<%--
 * W9009.jsp
 *
 * JSP of CIGMA Ship to X-Reference MA Inquiry main screen.
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 --%>
<c:set var="searchAction" scope="request">
    <html:rewrite action="/W9009Search"></html:rewrite>
</c:set>
<c:set var="addAction" scope="request">
    <html:rewrite action="/W9009Add"></html:rewrite>
</c:set>
<c:set var="editOrReferAction" scope="request">
    <html:rewrite action="/W9009EditOrRefer"></html:rewrite>
</c:set>
<c:set var="deleteAction" scope="request">
    <html:rewrite action="/W9009Delete"></html:rewrite>
</c:set>
<html:form action="/W9009Search" styleId="mainForm">
    <%--
    -- search condition 1
    --%>
    <table class="gscm_search">
        <colgroup>
            <col class="search_lgcy_lib_comp_cd" />
            <col class="search_customer_cd_and_lgcy_ship_to" />
            <col class="search_ship_to_cd" />
        </colgroup>
        <tr>
            <th>
                <bean:message key="label.lgcyLibCompCd" />
            </th>
            <th>
                <bean:message key="label.customerCdAndLgcyShipTo" />
            </th>
            <th>
                <bean:message key="label.W9009.shipToCd" />
            </th>
        </tr>
        <tr>
            <td>
                <html:text property="w9009CriteriaDomain.lgcyLibCompCd" maxlength="3"
                    styleClass="lgcy_lib_comp_cd" errorStyleClass="lgcy_lib_comp_cd gscm_error_class"/>
            </td>
            <td>
                <html:text property="w9009CriteriaDomain.customerCd" maxlength="8" 
                    styleClass="customer_cd" errorStyleClass="customer_cd gscm_error_class"/>
                <html:text property="w9009CriteriaDomain.lgcyShipTo" maxlength="2" 
                    styleClass="lgcy_ship_to" errorStyleClass="lgcy_ship_to gscm_error_class"/>
            </td>
            <td>
                <html:text property="w9009CriteriaDomain.shipToCd" maxlength="7" 
                    styleClass="ship_to_cd" errorStyleClass="ship_to_cd gscm_error_class"/>
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
                <html:button property="search" onclick="gscm.submitSearch('${searchAction}', this.form, '');" styleClass="search">
                    <bean:message key="button.search" />
                </html:button>
            </td>
        </tr>
    </table>
    <hr />
   <logic:notEmpty name="W9009Form" property="w9009ListDomainList" >
        <%--
        -- buttons 2
        --%>
        <table class="gscm_resultlist_button">
            <tr>
                <td>
                    <bean:define id="deleteConfirmMessage"><bean:message key="GSCM-I0-0005"/></bean:define>
                    <html:button property="editOrRefer" onclick="gscm.commonSubmit('${editOrReferAction}', this.form);" styleClass="editRefer">
                        <bean:message key="button.editRefer" />
                    </html:button>
                    <html:button property="delete" onclick="gscm.submitConfirm('${deleteAction}', this.form, 
                        '${deleteConfirmMessage}');" 
                        disabled="${disableElementList == 'delete' ? 'true' : 'false'}" styleClass="delete">
                        <bean:message key="button.delete" />
                    </html:button>
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
                <col class="resultlist_customer_cd" />
                <col class="resultlist_lgcy_ship_to" />
                <col class="resultlist_ship_to_cd" />
                <col />
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
                    <bean:message key="label.customerCd" />
                </th>
                <th>
                    <bean:message key="label.lgcyShipTo" />
                </th>
                <th>
                    <bean:message key="label.W9009.shipToCd" />
                </th>
            </tr>
            </thead>
            <tbody>
            <logic:iterate name="W9009Form" property="w9009ListDomainList" id="w9009ListDomain" 
                scope="request" indexId="idx">
                <ai:stripeline number="${idx + 1}" odd="gscm_odd" even="gscm_even">
            <tr>
                <td class="center">
                    <html:radio name="w9009ListDomain" property="ck" value="${idx}" />
                </td>
                <td>
                    <html:text name="w9009ListDomain" property="lgcyLibCompCd" 
                        styleClass="lgcy_lib_compcd gscm_disptext" errorStyle="" readonly="true"/>
                </td>
                <td>
                    <html:text name="w9009ListDomain" property="customerCd" 
                        styleClass="customer_cd gscm_disptext" errorStyle=""  readonly="true" />
                </td>
                <td>
                    <html:text name="w9009ListDomain" property="lgcyShipTo" 
                        styleClass="lgcy_ship_to gscm_disptext" errorStyle=""  readonly="true" />
                </td>
                <td>
                    <bean:write name="w9009ListDomain" property="shipToCd" />
                </td>
                <html:hidden name="w9009ListDomain" property="comUpdateTimestamp" />
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
