<%--
 * WB004.jsp
 * 
 * Order Inquiry Main画面のJSPです。
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 --%>
<html:form action="/WB004Init" styleId="mainForm">
    <%--
    -- search condition 1
    --%>
    <table class="gscm_search">
        <colgroup>
            <col class="search_rcv_odr_comp_cd" />
            <col class="search_comp_nm" />
            <col class="search_item_no" />
            <col class="search_pkg_cd" />
            <col class="search_item_description" />
        </colgroup>
        <tr>
            <th>
                <bean:message key="label.rcvOdrCompCd" />
            </th>
            <th>
            </th>
            <th>
                <bean:message key="label.itemNo" />
            </th>
            <th>
                <bean:message key="label.pkgCd" />
            </th>
            <th>
            </th>
        </tr>
        <tr>
            <td>
                <html:text property="wb004CriteriaDomain.rcvOdrCompCd" maxlength="5" styleClass="rcv_odr_comp_cd gscm_required" errorStyleClass="rcv_odr_comp_cd gscm_error_class" />
            </td>
            <td>
                <html:text property="wb004CriteriaDomain.compNm" styleClass="wb004_comp_nm gscm_disptext" readonly="true"/>
            </td>
            <td>
                <html:text property="wb004CriteriaDomain.itemNo" maxlength="27" styleClass="wb004_item_no gscm_required" errorStyleClass="wb004_item_no gscm_error_class" />
            </td>
            <td>
                <html:text property="wb004CriteriaDomain.pkgCd" maxlength="3" styleClass="pkg_cd" errorStyleClass="pkg_cd gscm_error_class" />
            </td>
            <td>
                <html:text property="wb004CriteriaDomain.itemDescription" styleClass="wb004_item_description gscm_disptext" readonly="true"/>
            </td>
            
            <html:hidden property="wb004CriteriaDomain.rcvOdrCompCdHidden" />
            <html:hidden property="wb004CriteriaDomain.compNmHidden" />
            <html:hidden property="wb004CriteriaDomain.itemNoHidden" />
            <html:hidden property="wb004CriteriaDomain.itemDescriptionHidden" />  
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
            <td class="right">
                <html:button property="search" styleClass="search" onclick="gscm.commonSubmit('WB004Search.do', this.form);">
                    <bean:message key="button.search" />
                </html:button>
            </td>
        </tr>
    </table>
    <hr />
    
    <c:if test="${WB004Form.displayList}">
        <%--
        -- buttons 2
        --%>
        <table class="gscm_search_button">
            <colgroup>
                <col />
            </colgroup>
            <tr>
                <td class="right">
                    <html:button property="moveToDetail" styleClass="move_to_detail" onclick="gscm.commonSubmit('WB004MoveToDetail.do', this.form);">
                        <bean:message key="button.moveToDetail" />
                    </html:button>
                </td>
            </tr>
        </table>
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
                <col class="resultlist_checked_key" />
                <col class="resultlist_customer_cd" />
                <col class="resultlist_lgcy_ship_to" />
                <col class="resultlist_ship_to_nm" />
                <col class="resultlist_trns_cd" />
                <col class="resultlist_odr_qty" />
                <col class="resultlist_pltz_alloc_qty" />
                <col class="resultlist_shipped_qty" />
                <col class="resultlist_pkg_cd" />
            </colgroup>
            <tr>
                <th>
                    <bean:message key="label.ck" />
                </th>
                <th>
                    <bean:message key="label.customerCd" />
                </th>
                <th>
                    <bean:message key="label.lgcyShipTo" />
                </th>
                <th>
                    <bean:message key="label.shipToNm" />
                </th>
                <th>
                    <bean:message key="label.trnsCd" />
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
                <th>
                    <bean:message key="label.pkgCd" />
                </th>
            </tr>
            <logic:iterate name="WB004Form" property="listDomainList" id="listDomainList" indexId="idx">
                <ai:stripeline number="${idx + 1}" odd="gscm_odd" even="gscm_even">
                    <tr>
                        <td class="center">
                            <html:radio property="selectedIndex" value="${idx}" />
                        </td>
                        <td>
                            <bean:write name="listDomainList" property="customerCd" />
                        </td>
                        <td>
                            <bean:write name="listDomainList" property="lgcyShipTo" />
                        </td>
                        <td>
                            <html:text name="listDomainList" property="shipToNm" indexed="true" styleClass="wb004_ship_to_nm_disptext gscm_disptext" readonly="true" />
                        </td>
                        <td>
                            <bean:write name="listDomainList" property="trnsCd" />
                        </td>
                        <td class="right">
                            <bean:write name="listDomainList" property="odrQty" />
                        </td>
                        <td class="right">
                            <bean:write name="listDomainList" property="pltzAllocQty" />
                        </td>
                        <td class="right">
                            <bean:write name="listDomainList" property="shippedQty" />
                        </td>
                        <td>
                            <bean:write name="listDomainList" property="pkgCd" />
                        </td>
                        <html:hidden name="listDomainList" property="customerCdHidden" indexed="true" />
                        <html:hidden name="listDomainList" property="lgcyShipToHidden" indexed="true" />
                        <html:hidden name="listDomainList" property="shipToNmHidden" indexed="true" />
                        <html:hidden name="listDomainList" property="trnsCdHidden" indexed="true" />
                        <html:hidden name="listDomainList" property="pkgCdHidden" indexed="true" />
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
