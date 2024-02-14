<%--
 * WT005.jsp
 *
 * JSP of CML Info. Sub Screen.
 * メインマーク表示子画面で用いるJSPです。
 * 
 * Copyright (c) 2013 DENSO CORPORATION. All rights reserved.
 --%>

<html:form action="/Wt005Init" styleId="mainForm">
    <%--
    -- search results
    --%>
    <logic:notEmpty name="WT005Form" property="wt005ListDomainList" >
    
        <table id="tablefix" class="gscm_resultlist">
            <colgroup>
                <col class="resultlist_mainMark" />
            </colgroup>
            <thead>
                <tr>
                    <th>
                        <bean:message key="label.mainMark" />
                    </th>
                </tr>
            </thead>
            <tbody>
                <logic:iterate name="WT005Form" property="wt005ListDomainList" id="wt005ListDomain" indexId="index">
                    <ai:stripeline number="${index+1}" odd="gscm_odd" even="gscm_even">
                    <tr>                            
                        <td>
                            <a href="#" onclick="showItemNoInfo('<bean:write name="wt005ListDomain" property="mainMark" />')" >
                                <bean:write name="wt005ListDomain" property="mainMark" />
                            </a>
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
    <html:hidden property="wt005CriteriaDomain.xmainMark" styleId="wt005CriteriaDomain.xmainMark" />
</html:form>
