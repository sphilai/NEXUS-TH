
 <%--
 * WT007.jsp
 * JSP of Item No. Info Sub Screen.
 * 品番表示子画面で用いるJSPです。
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
--%>

<html:form action="/Wt007Init" styleId="mainForm">

    <%--
    -- search results
    --%>
    <logic:notEmpty name="WT007Form" property="wt007ListDomainList" >
    
        <table id="tablefix" class="gscm_resultlist">
            <colgroup>
                <col class="resultlist_itemNo" />
                <col class="resultlist_pkgCd" />
                <col class="resultlist_shipLot" />
                <col class="resultlist_actualPkgQty" />
            </colgroup>
            <thead>
                <tr>
                    <th>
                        <bean:message key="label.itemNo" />
                    </th>
                    <th>
                        <bean:message key="label.pkgCd" />
                    </th>
                    <th>
                        <bean:message key="label.shipLot" />
                    </th>
                    <th>
                        <bean:message key="label.actualPkgQty" />
                    </th>
                </tr>
            </thead>
            <tbody>
                <logic:iterate name="WT007Form" property="wt007ListDomainList" id="wt007ListDomain" indexId="index">
                    <ai:stripeline number="${index+1}" odd="gscm_odd" even="gscm_even">
                    <tr>                            
                        <td>
                            <html:text name="wt007ListDomain" property="itemNo"
                                styleClass="item_no gscm_disptext" readonly="true" indexed="true" />
                        </td>
                        <td>
                            <bean:write name="wt007ListDomain" property="pkgCd" />
                        </td>
                        <td class="right">                            
                            <bean:write name="wt007ListDomain" property="shipLot" />
                        </td>
                        <td class="right">
                            <bean:write name="wt007ListDomain" property="actualPkgQty" />
                            
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

    <html:hidden property="wt007CriteriaDomain.mainMark" styleId="wt007CriteriaDomain.mainMark" />
    <html:hidden property="wt007CriteriaDomain.mixTagNo" styleId="wt007CriteriaDomain.mixTagNo" />
    
</html:form>
