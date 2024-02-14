<%--
 * WT015.jsp
 * 
 * JSP of Unit Price Error List Sub Screen.
 * 売価登録なし品番表示子画面のJSPです。
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 --%>
<html:form action="/Wt015Init" styleId="mainForm">
    <%--
    -- search results
    --%>
    <logic:notEmpty name="WT015Form" property="wt015ListDomainList" >
    <table id="tablefix" class="gscm_resultlist">
        <colgroup>
            <col class="resultlist_customer_cd" />
            <col class="resultlist_curr_cd" />
            <col class="resultlist_unit_price" />
            <col class="resultlist_item_no" />
            <col class="resultlist_customer_po_no" />
        </colgroup>
        <thead>
        <tr>
            <th>
                <bean:message key="label.customerCd" />
            </th>
            <th>
                <bean:message key="label.curCd" />
            </th>
            <th>
                <bean:message key="label.unitPrice" />
            </th>
            <th>
                <bean:message key="label.itemNo" />
            </th>
            <th>
                <bean:message key="label.customerPoNo" />
            </th>
        </tr>
        </thead>
        <tbody>
        <logic:iterate id="wt015ListDomain" name="WT015Form" property="wt015ListDomainList" indexId="index">
            <ai:stripeline number="${index + 1}" odd="gscm_odd" even="gscm_even">
            <tr>
            <td>
                <bean:write name="wt015ListDomain" property="customerCd"/>
            </td>
            <td>
                <bean:write name="wt015ListDomain" property="currCd"/>
            </td>
            <td>
                <bean:write name="wt015ListDomain" property="unitPrice"/>
            </td>
            <td>
                <bean:write name="wt015ListDomain" property="itemNo"/>
            </td>
            <td>
                <bean:write name="wt015ListDomain" property="customerPoNo"/>
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
    <html:hidden property="wt015CriteriaDomain.shipperCd" styleId="wt015CriteriaDomain.shipperCd" />
    <html:hidden property="wt015CriteriaDomain.grpNo1" styleId="wt015CriteriaDomain.grpNo1" />
    <html:hidden property="wt015CriteriaDomain.grpNo2" styleId="wt015CriteriaDomain.grpNo2" />
</html:form>
