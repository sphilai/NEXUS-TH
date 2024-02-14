<%--
 * WT016.jsp
 * 
 * JSP of Unregistered HS CODE List Sub Screen.
 * HS CODE登録なし品番表示子画面のJSPです。
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 --%>
<html:form action="/Wt016Init" styleId="mainForm">

    <%--
    -- search results
    --%>
    <logic:notEmpty name="WT016Form" property="wt016ListDomainList" >
    <table id="tablefix" class="gscm_resultlist">
        <colgroup>
            <col class="resultlist_shipper_cd" />
            <col class="resultlist_item_no" />
        </colgroup>
        <thead>
        <tr>
            <th>
                <bean:message key="label.shipperCd" />
            </th>
            <th>
                <bean:message key="label.itemNo" />
            </th>
        </tr>
        </thead>
        <tbody>
        <logic:iterate id="wt016ListDomain" name="WT016Form" property="wt016ListDomainList" indexId="index">
            <ai:stripeline number="${index + 1}" odd="gscm_odd" even="gscm_even">
            <tr>
            <td>
                <bean:write name="wt016ListDomain" property="shipperCd"/>
            </td>
            <td>
                <bean:write name="wt016ListDomain" property="itemNo"/>
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
    <html:hidden property="wt016CriteriaDomain.shipperCd" styleId="wt016CriteriaDomain.shipperCd" />
    <html:hidden property="wt016CriteriaDomain.grpNo1" styleId="wt016CriteriaDomain.grpNo1" />
    <html:hidden property="wt016CriteriaDomain.grpNo2" styleId="wt016CriteriaDomain.grpNo2" />
    
</html:form>
