<%--
 * Project : GSCM
 * 
 * W8003 - Progress Control PKG Info
 *
 * $Revision: 7765 $
 * 
 * Copyright (c) 2013 DENSO CORPORATION. All rights reserved.
 --%>

<html:form action="/W8003Init" styleId="mainForm">
    <%--
    -- Progress Detail
    --%>
    <table class="grid table_header1">
        <colgroup>
            <col class="grid_header" />
            <col class="grid_contents" />
            <col class="grid_void" />
        </colgroup>
        <tr>
            <th class="right">
                <bean:message key="label.cmlNo" />
            </th>
            <td>
                <html:text property="w8003CriteriaDomain.cmlNo" styleClass="grid_contents gscm_disptext" readonly="true"/>
            </td>
             <%--
               -- Dummy text box in order to get cursor on read only dialog.
               --%>
            <td class="grid_void">
                <input type="text" name="grid_void" class="grid_void" tabindex="-1">
            </td>
        </tr>
    </table>
    <table class="gscm_search">
        <colgroup>
            <col />
        </colgroup>
        <tr>
            <th>
                <bean:message key="label.itemNo" />
            </th>
        </tr>
        <tr>
            <td>
                <html:select property="w8003CriteriaDomain.selectSort" styleId="select_sort" styleClass="select_sort">
                    <html:options collection="selectSortCombo" property="id" labelProperty="name"/>
                </html:select>
                <html:button property="sort" onclick="gscm.commonSubmit('W8003Sort.do', this.form);" styleClass="sort">
                    <bean:message key="button.sort" />
                </html:button>
            </td>
        </tr>
    </table>
    <logic:notEmpty name="W8003Form" property="w8003ListDomainList">
        <%--
        -- search results
        --%>
        <table id="tablefix" class="gscm_resultlist">
            <colgroup>
                <col class="resultlist_customer_po_no" />
                <col class="resultlist_etd_due_dt" />
                <col class="resultlist_item_description" />
                <col class="resultlist_item_no" />
                <col class="resultlist_pkg_cd" />
                <col />
            </colgroup>
            <thead>
                <tr>
                    <th>
                        <bean:message key="label.poNo" />
                    </th>
                    <th>
                        <bean:message key="label.poEtd" />
                    </th>
                    <th>
                        <bean:message key="label.description" />
                    </th>
                    <th>
                        <bean:message key="label.itemNo" />
                    </th>
                    <th>
                        <bean:message key="label.pkgCd" />
                    </th>
                    <th>
                        <bean:message key="label.qty" />
                    </th>
                </tr>
            </thead>
            <tbody>
                <logic:iterate name="W8003Form" property="w8003ListDomainList" id="w8003ListDomainList" indexId="idx">
                    <ai:stripeline number="${idx + 1}" odd="gscm_odd" even="gscm_even">
                        <tr>
                            <td class="left">
                                <bean:write name="w8003ListDomainList" property="customerPoNo" />
                            </td>
                            <td class="left">
                                <bean:write name="w8003ListDomainList" property="etdDueDt" />
                            </td>
                            <td class="left">
                                <html:text name="w8003ListDomainList" property="itemDescription" indexed="true" styleClass="w8003_item_description gscm_disptext" readonly="true" />
                            </td>
                            <td class="left">
                                <html:text name="w8003ListDomainList" property="itemNo" indexed="true" styleClass="w8003_item_no gscm_disptext" readonly="true" />
                            </td>
                            <td class="left">
                                <bean:write name="w8003ListDomainList" property="pkgCd" />
                            </td>
                            <td class="right">
                                <bean:write name="w8003ListDomainList" property="qty" />
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
    <html:hidden property="callScreenId" />
</html:form>
