<%--
 * WT017.jsp
 * 
 * JSP of Shipping Actuality Warning List Sub Screen.
 * 船積実績ワーニングリスト子画面のJSPです。
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 --%>
<html:form action="/Wt017Init" styleId="mainForm">

    <logic:notEmpty name="WT017Form" property="wt017ListDomainList" >
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
            <col class="resultlist_shipper_cd" />
            <col class="resultlist_etd" />
            <col class="resultlist_trns_cd" />
            <col class="resultlist_invoice_no" />
            <col class="resultlist_cml_typ" />
            <col class="resultlist_consignee_cd" />
            <col class="resultlist_ship_to_cd" />
            <col class="resultlist_customer_cd" />
            <col class="resultlist_lgcy_ship_to" />
        </colgroup>
        <thead>
        <tr>
            <th>
                <bean:message key="label.shipperCd" />
            </th>
            <th>
                <bean:message key="label.WT017.etd" />
            </th>
            <th>
                <bean:message key="label.trnsCd" />
            </th>
            <th>
                <bean:message key="label.invoiceNo" />
            </th>
            <th>
                <bean:message key="label.cmlTyp" />
            </th>
            <th>
                <bean:message key="label.consigneeCd" />
            </th>
            <th>
                <bean:message key="label.WT017.shipToCd" />
            </th>
            <th>
                <bean:message key="label.customerCd" />
            </th>
            <th>
                <bean:message key="label.lgcyShipTo" />
            </th>
        </tr>
        </thead>
        <tbody>
        <logic:iterate id="wt017ListDomain" name="WT017Form" property="wt017ListDomainList" indexId="index">
            <ai:stripeline number="${index + 1}" odd="gscm_odd" even="gscm_even">
            <tr>
            <td>
                <bean:write name="wt017ListDomain" property="shipperCd"/>
            </td>
            <td>
                <bean:write name="wt017ListDomain" property="etd"/>
            </td>
            <td>
                <bean:write name="wt017ListDomain" property="trnsCd"/>
            </td>
            <td>
                <bean:write name="wt017ListDomain" property="invoiceNo"/>
            </td>
            <td>
                <bean:write name="wt017ListDomain" property="cmlTyp"/>
            </td>
            <td>
                <bean:write name="wt017ListDomain" property="consigneeCd"/>
            </td>
            <td>
                <bean:write name="wt017ListDomain" property="shipToCd"/>
            </td>
            <td>
                <bean:write name="wt017ListDomain" property="customerCd"/>
            </td>
            <td>
                <bean:write name="wt017ListDomain" property="lgcyShipTo"/>
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

</html:form>
