<%--
 * WB006.jsp
 * 
 * Last Digit Change Main画面のJSPです。
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 --%>
<html:form action="/WB006Init" styleId="mainForm">
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
                <html:text property="wb006CriteriaDomain.rcvOdrCompCd" maxlength="5" styleClass="rcv_odr_comp_cd gscm_required" errorStyleClass="rcv_odr_comp_cd gscm_error_class" />
            </td>
            <td>
                <html:text property="wb006CriteriaDomain.compNm" styleClass="wb006_comp_nm gscm_disptext" readonly="true"/>
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
            <col class="search_shipping_dt" />
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
            <th>
                <bean:message key="label.shippingDt" />
            </th>
        </tr>
        <tr>
            <td>
                <html:text property="wb006CriteriaDomain.customerCd" maxlength="8" styleClass="customer_cd gscm_required" errorStyleClass="customer_cd gscm_error_class" />
                <html:text property="wb006CriteriaDomain.lgcyShipTo" maxlength="2" styleClass="lgcy_ship_to gscm_required" errorStyleClass="lgcy_ship_to gscm_error_class" />
            </td>
            <td>
                <html:text property="wb006CriteriaDomain.shipToNm" styleClass="wb006_ship_to_nm gscm_disptext" readonly="true"/>
            </td>
            <td>
                <html:select property="wb006CriteriaDomain.trnsCd" styleClass="wb006_trns_cd gscm_required" errorStyleClass="trns_cd gscm_error_class" >
                    <html:options collection="trnsCd" property="id" labelProperty="name" />
                </html:select>
            </td>
            <td>
                <html:text property="wb006CriteriaDomain.shippingDt" maxlength="8" styleClass="shipping_dt gscm_required" errorStyleClass="shipping_dt gscm_error_class" />
                <img src="images/gscm/library/Calendar.gif"
                    onClick="gscm.writeCalendar('shippingDtDiv', 'mainForm', 'wb006CriteriaDomain.shippingDt', '<bean:message key="format.screen.yyyymmdd" />', this);" />
                <div id="shippingDtDiv" style="float:left;"></div>
            </td>
        </tr>
    </table>
    <%--
    -- search condition 3
    --%>
    <table class="gscm_search">
        <colgroup>
            <col class="search_item_no_org" />
            <col class="search_pkg_cd" />
            <col class="search_item_description" />
            <col class="search_button" />
        </colgroup>
        <tr>
            <th>
                <bean:message key="label.itemNoOrg" />
            </th>
            <th>
                <bean:message key="label.pkgCd" />
            </th>
            <th>
            </th>
            <th>
            </th>
        </tr>
        <tr>
            <td>
                <html:text property="wb006CriteriaDomain.itemNoOrg" maxlength="20" styleClass="item_no_org gscm_required" errorStyleClass="item_no_org gscm_error_class" />
            </td>
            <td>
                <html:text property="wb006CriteriaDomain.pkgCd" maxlength="3" styleClass="pkg_cd" errorStyleClass="pkg_cd gscm_error_class"/>
            </td>
            <td>
                <html:text property="wb006CriteriaDomain.itemDescription" styleClass="wb006_item_description gscm_disptext" readonly="true"/>
            </td>
            <td class="right">
                <html:button property="search" styleClass="search" onclick="gscm.commonSubmit('WB006Search.do', this.form);">
                    <bean:message key="button.search" />
                </html:button>
            </td>
            <html:hidden property="wb006CriteriaDomain.rcvOdrCompCdHidden" />
            <html:hidden property="wb006CriteriaDomain.compNmHidden" />
            <html:hidden property="wb006CriteriaDomain.customerCdHidden" />
            <html:hidden property="wb006CriteriaDomain.lgcyShipToHidden" />
            <html:hidden property="wb006CriteriaDomain.shipToNmHidden" />
            <html:hidden property="wb006CriteriaDomain.trnsCdHidden" />
            <html:hidden property="wb006CriteriaDomain.shippingDtHidden" />
            <html:hidden property="wb006CriteriaDomain.itemNoHidden" />
            <html:hidden property="wb006CriteriaDomain.itemDescriptionHidden" />
            <html:hidden property="wb006CriteriaDomain.trnsCdDisp" />
        </tr>
    </table>
    <hr />
    
    <c:if test="${WB006Form.displayList}">
        <%--
        -- buttons 1
        --%>
        <table class="gscm_search_button">
            <colgroup>
                <col />
            </colgroup>
            <tr>
                <td class="right">
                    <html:button property="moveToRegister" styleClass="move_to_register" onclick="gscm.commonSubmit('WB006MoveToRegister.do', this.form);">
                        <bean:message key="button.moveToRegister" />
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
                <col class="resultlist_item_no_org" />
                <col class="resultlist_pkg_cd" />
                <col class="resultlist_customer_po_no" />
                <col class="resultlist_odr_qty" />
            </colgroup>
            <tr>
                <th>
                    <bean:message key="label.ck" />
                </th>
                <th>
                    <bean:message key="label.itemNoOrg" />
                </th>
                <th>
                    <bean:message key="label.pkgCd" />
                </th>
                <th>
                    <bean:message key="label.custPoNo" />
                </th>
                <th>
                    <bean:message key="label.orderQty" />
                </th>
            </tr>
            <logic:iterate name="WB006Form" property="wb006ListDomainList" id="wb006ListDomainList" indexId="idx">
                <ai:stripeline number="${idx + 1}" odd="gscm_odd" even="gscm_even">
                    <tr>
                        <td class="center">
                            <html:radio property="selectedIndex" value="${idx}" />
                        </td>
                        <td>
                            <html:text name="wb006ListDomainList" property="itemNoOrg" indexed="true" styleClass="wb006_item_no_org_disptext gscm_disptext" readonly="true" />
                        </td>
                        <td>
                            <bean:write name="wb006ListDomainList" property="pkgCd" />
                        </td>
                        <td>
                            <bean:write name="wb006ListDomainList" property="customerPoNo" />
                        </td>
                        <td class="right">
                            <bean:write name="wb006ListDomainList" property="odrQty" />
                        </td>
                        <html:hidden name="wb006ListDomainList" property="pkgCdHidden" indexed="true" />
                        <html:hidden name="wb006ListDomainList" property="customerPoNoHidden" indexed="true" />
                        <html:hidden name="wb006ListDomainList" property="odrQtyHidden" indexed="true" />
                        <html:hidden name="wb006ListDomainList" property="odrCtrlNo" indexed="true" />
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
