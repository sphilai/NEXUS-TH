<%--
 * WT018.jsp
 *
 * JSP of Container No. Info Sub Screen.
 * コンテナNo表示子画面で用いるJSPです。
 *
 * Copyright (c) 2013 DENSO CORPORATION. All rights reserved.
--%>
<html:form action="/Wt018Init" styleId="mainForm">
    <%--
    -- search results
    --%>
    <logic:notEmpty name="WT018Form" property="wt018ListDomainList" >
        <table id="tablefix" class="gscm_resultlist">
            <colgroup>
                <col class="resultlist_container_no" />
            </colgroup>
            <thead>
                <tr>
                    <th>
                        <bean:message key="label.containerNo" />
                    </th>
                </tr>
            </thead>
            <tbody>
                <logic:iterate name="WT018Form" property="wt018ListDomainList" id="wt018ListDomain" indexId="index">
                    <ai:stripeline number="${index+1}" odd="gscm_odd" even="gscm_even">
                    <tr>                            
                        <td>
                            <bean:write name="wt018ListDomain" property="containerNo" />
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
    <html:hidden property="wt018CriteriaDomain.shippingActNo" styleId="wt018CriteriaDomain.shippingActNo" />
</html:form>
