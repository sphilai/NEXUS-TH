<%--
 * WB005.jsp
 * 
 * Order Inquiry Detail画面のJSPです。
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 --%>
<html:form action="/WB005Init" styleId="mainForm">
    <%--
    -- search condition 1
    --%>
    <table class="gscm_search">
        <colgroup>
            <col class="search_rcv_odr_comp_cd" />
            <col class="search_comp_nm" />
        </colgroup>
        <tr>
            <th>
                <bean:message key="label.rcvOdrCompCd" />
            </th>
            <th>
            </th>
        </tr>
        <tr>
            <td>
                <bean:write name="WB005Form" property="criteriaDomain.rcvOdrCompCd" />
            </td>
            <td>
                <html:text property="criteriaDomain.compNm" styleClass="comp_nm gscm_disptext" readonly="true"/>
            </td>
        </tr>
    </table>
    <%--
    -- search condition 2
    --%>
    <table class="gscm_search">
        <colgroup>
            <col class="search_customer_cd" />
            <col class="search_ship_to_nm" />
            <col class="search_trns_cd" />
        </colgroup>
        <tr>
            <th>
                <bean:message key="label.customerCdAndLgcyShipTo" />
            </th>
            <th>
            </th>
            <th>
                <bean:message key="label.trnsCd" />
            </th>
        </tr>
        <tr>
            <td>
                <bean:write name="WB005Form" property="criteriaDomain.customerCd" />
                <bean:write name="WB005Form" property="criteriaDomain.lgcyShipTo" />
            </td>
            <td>
                <html:text property="criteriaDomain.shipToNm" styleClass="wb005_ship_to_nm gscm_disptext" readonly="true"/>
            </td>
            <td>
                <bean:write name="WB005Form" property="criteriaDomain.trnsCd" />
            </td>
        </tr>
    </table>
    <%--
    -- search condition 3
    --%>
    <table class="gscm_search">
        <colgroup>
            <col class="search_item_no" />
            <col class="search_pkg_cd" />
            <col class="search_item_description" />
            <col class="search_odr_qty" />
            <col class="search_pltz_alloc_qty" />
            <col class="search_shipped_qty" />
        </colgroup>
        <tr>
            <th>
                <bean:message key="label.itemNo" />
            </th>
            <th>
                <bean:message key="label.pkgCd" />
            </th>
            <th>
            </th>
            <th>
                <bean:message key="label.totalOdrQty" />
            </th>
            <th>
                <bean:message key="label.totalPltzAllocQty" />
            </th>
            <th>
                <bean:message key="label.totalShippedQty" />
            </th>
        </tr>
        <tr>
            <td>
                <html:text property="criteriaDomain.itemNo" styleClass="wb005_item_no gscm_disptext" readonly="true"/>
            </td>
            <td>
                <bean:write name="WB005Form" property="criteriaDomain.pkgCd" />
            </td>
            <td>
                <html:text property="criteriaDomain.itemDescription" styleClass="item_description gscm_disptext" readonly="true"/>
            </td>
            <td>
                <bean:write name="WB005Form" property="criteriaDomain.odrQty" />
            </td>
            <td>
                <bean:write name="WB005Form" property="criteriaDomain.pltzAllocQty" />
            </td>
            <td>
                <bean:write name="WB005Form" property="criteriaDomain.shippedQty" />
            </td>
        </tr>
    </table>
    <%--
    -- buttons 1
    --%>
    <table class="gscm_search_button">
        <colgroup>
            <col />
        </colgroup>
        <tr>
            <td>
                <html:button property="backToMainScreen" styleClass="back_to_main_screen" onclick="gscm.submitBack('WB004Init.do', this.form);">
                    <bean:message key="button.backToMainScreen" />
                </html:button>
            </td>
        </tr>
    </table>
    <hr />
    
    <c:if test="${WB005Form.displayList}">
        <%--
        -- page control
        --%>
        <table class="gscm_resultlist_button">
            <colgroup>
                <col />
            </colgroup>
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
                <col class="resultlist_etd_due_dt" />
                <col class="resultlist_customer_item_no" />
                <col class="resultlist_firm_qty" />
                <col class="resultlist_forecast_qty" />
                <col class="resultlist_customer_due_dt" />
                <col class="resultlist_pltz_alloc_qty" />
                <col class="resultlist_shipped_qty" />
                <col class="resultlist_customer_po_no" />
                <col class="resultlist_sales_comp_po_no" />
            </colgroup>
            <tr>
                <th>
                    <bean:message key="WB005.label.etdDueDt" />
                </th>
                <th>
                    <bean:message key="label.customerItemNo" />
                </th>
                <th>
                    <bean:message key="label.firmQty" />
                </th>
                <th>
                    <bean:message key="label.forecastQty" />
                </th>
                <th>
                    <bean:message key="label.customerDueDt" />
                </th>
                <th>
                    <bean:message key="label.pltzAllocQty" />
                </th>
                <th>
                    <bean:message key="label.shippedQty" />
                </th>
                <th>
                    <bean:message key="label.customerPoNo" />
                </th>
                <th>
                    <bean:message key="label.salesCompPoNo" />
                </th>
            </tr>
            <logic:iterate name="WB005Form" property="listDomainList" id="listDomainList" indexId="idx">
                <ai:stripeline number="${idx + 1}" odd="gscm_odd" even="gscm_even">
                    <tr>
                        <td>
                            <bean:write name="listDomainList" property="etdDueDt" />
                        </td>
                        <td>
                            <html:text name="listDomainList" property="customerItemNo" indexed="true" styleClass="wb005_customer_item_no_disptext gscm_disptext" readonly="true" />
                        </td>
                        <td class="right">
                            <bean:write name="listDomainList" property="firmQty" />
                        </td>
                        <td class="right">
                            <bean:write name="listDomainList" property="forecastQty" />
                        </td>
                        <td>
                            <bean:write name="listDomainList" property="customerDueDt" />
                        </td>
                        <td class="right">
                            <bean:write name="listDomainList" property="pltzAllocQty" />
                        </td>
                        <td class="right">
                            <bean:write name="listDomainList" property="shippedQty" />
                        </td>
                        <td>
                            <bean:write name="listDomainList" property="customerPoNo" />
                        </td>
                        <td>
                            <bean:write name="listDomainList" property="salesCompPoNo" />
                        </td>
                    </tr>
                </ai:stripeline>
            </logic:iterate>
        </table>
    </c:if>
    
    <%--
    -- hidden
    --%>
    <html:hidden property="callScreenId" />
</html:form>
