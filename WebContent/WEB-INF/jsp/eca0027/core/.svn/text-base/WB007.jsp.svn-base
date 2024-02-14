<%--
 * WB007.jsp
 * 
 * Last Digit Change Register画面のJSPです。
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 --%>
<html:form action="/WB007Init" styleId="mainForm">
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
                <html:text property="wb007CriteriaDomain.rcvOdrCompCd" styleClass="rcv_odr_comp_cd gscm_disptext" errorStyleClass="rcv_odr_comp_cd gscm_disptext gscm_error_class" readonly="true"/>
            </td>
            <td>
                <html:text property="wb007CriteriaDomain.compNm" styleClass="wb007_comp_nm gscm_disptext" errorStyleClass="wb007_comp_nm gscm_disptext gscm_error_class" readonly="true"/>
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
            <html:hidden property="wb007CriteriaDomain.warningFlgCustomerCd" />
            <td>
                <html:text property="wb007CriteriaDomain.customerCd" styleClass="customer_cd gscm_disptext" errorStyleClass="customer_cd gscm_disptext gscm_error_class" readonly="true"/>
                <html:text property="wb007CriteriaDomain.lgcyShipTo" styleClass="lgcy_ship_to gscm_disptext" errorStyleClass="lgcy_ship_to gscm_disptext gscm_error_class" readonly="true"/>
            </td>
            <td>
                <html:text property="wb007CriteriaDomain.shipToNm" styleClass="wb007_ship_to_nm gscm_disptext" errorStyleClass="wb007_ship_to_nm gscm_disptext gscm_error_class" readonly="true"/>
            </td>
            <td>
                <html:text property="wb007CriteriaDomain.trnsCd" styleClass="trns_cd gscm_disptext" errorStyleClass="trns_cd gscm_disptext gscm_error_class" readonly="true"/>
            </td>
            <td>
                <html:text property="wb007CriteriaDomain.shippingDt" styleClass="shipping_dt gscm_disptext" errorStyleClass="shipping_dt gscm_disptext gscm_error_class" readonly="true"/>
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
            <col class="search_customer_po_no" />
            <col class="search_odr_qty" />
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
                <bean:message key="label.customerPoNo" />
            </th>
            <th>
                <bean:message key="label.odrQty" />
            </th>
        </tr>
        <tr>
            <td>
                <html:text property="wb007CriteriaDomain.itemNoOrg" styleClass="wb007_item_no_org gscm_disptext" errorStyleClass="wb007_item_no_org gscm_disptext gscm_error_class" readonly="true"/>
            </td>
            <td>
                <html:text property="wb007CriteriaDomain.pkgCd" styleClass="pkg_cd gscm_disptext" errorStyleClass="pkg_cd gscm_disptext gscm_error_class" readonly="true"/>
            </td>
            <td>
                <html:text property="wb007CriteriaDomain.itemDescription" styleClass="wb007_item_description gscm_disptext" errorStyleClass="wb007_item_description gscm_disptext gscm_error_class" readonly="true"/>
            </td>
            <td>
                <html:text property="wb007CriteriaDomain.customerPoNo" styleClass="wb007_customer_po_no gscm_disptext" errorStyleClass="wb007_customer_po_no gscm_disptext gscm_error_class" readonly="true"/>
            </td>
            <td>
                <html:text property="wb007CriteriaDomain.odrQty" styleClass="odr_qty gscm_disptext" errorStyleClass="odr_qty gscm_disptext gscm_error_class" readonly="true"/>
            </td>
        </tr>
    </table>
    <hr />
    <%--
    -- buttons 1
    --%>
    <table class="gscm_search_button">
        <colgroup>
            <col />
        </colgroup>
        <tr>
            <td>
                <bean:define id="backConfirmMessage"><bean:message key="NXS-I1-0011"/></bean:define>
                <bean:define id="registerConfirmMessage"><bean:message key="GSCM-I0-0003"/></bean:define>
                <html:button property="backToMainScreen" styleClass="back_to_main_screen" onclick="submitBackConfirm('WB006Init.do', this.form, '${backConfirmMessage}');">
                    <bean:message key="button.backToMainScreen" />
                </html:button>
                <html:button property="register" styleClass="register" onclick="gscm.submitConfirm('WB007Register.do', this.form, '${registerConfirmMessage}');">
                    <bean:message key="button.register" />
                </html:button>
                <html:checkbox property="wb007CriteriaDomain.ignoreWarnings" />
                <bean:message key="label.ignoreWarnings" />
            </td>
        </tr>
    </table>
    <br />
    <%--
    -- search results
    --%>
    <table id="tablefix" class="gscm_resultlist">
        <colgroup>
            <col class="resultlist_item_no" />
            <col class="resultlist_shipping_lot" />
            <col class="resultlist_pltz_alloc_qty" />
            <col class="resultlist_odr_qty" />
        </colgroup>
        <tr>
            <th>
                <bean:message key="label.itemNo" />
            </th>
            <th>
                <bean:message key="WB007.label.shippingLot" />
            </th>
            <th>
                <bean:message key="label.pltzAllocQty" />
            </th>
            <th>
                <bean:message key="label.newQty" />
            </th>
        </tr>
        <logic:iterate name="WB007Form" property="wb007ListDomainList" id="wb007ListDomainList" indexId="idx">
            <ai:stripeline number="${idx + 1}" odd="gscm_odd" even="gscm_even">
                <tr>
                    <html:hidden name="wb007ListDomainList" property="warningFlgItemNo" indexed="true" />
                    <html:hidden name="wb007ListDomainList" property="warningFlgOdrQty" indexed="true" />
                    <td>
                        <c:if test="${(empty wb007ListDomainList.warningFlgItemNo) or (wb007ListDomainList.warningFlgItemNo == 'E')}" >
                            <html:text name="wb007ListDomainList" property="itemNo" indexed="true" styleClass="wb007_item_no_disptext gscm_disptext" errorStyleClass="wb007_item_no_disptext gscm_disptext gscm_error_class" readonly="true" />
                        </c:if>
                        <c:if test="${(wb007ListDomainList.warningFlgItemNo == 'W')}" >
                            <html:text name="wb007ListDomainList" property="itemNo" indexed="true" styleClass="wb007_item_no_disptext gscm_disptext warn" errorStyleClass="wb007_item_no_disptext gscm_disptext warn" readonly="true" />
                        </c:if>
                    </td>
                    <td class="right">
                        <bean:write name="wb007ListDomainList" property="shippingLot" />
                    </td>
                    <td class="right">
                        <bean:write name="wb007ListDomainList" property="pltzAllocQty" />
                    </td>
                    <td>
                        <c:if test="${(empty wb007ListDomainList.warningFlgOdrQty) or (wb007ListDomainList.warningFlgOdrQty == 'E')}" >
                            <html:text name="wb007ListDomainList" property="odrQty" maxlength="7" indexed="true" styleClass="odr_qty right" errorStyleClass="odr_qty right gscm_error_class" />
                        </c:if>
                        <c:if test="${(wb007ListDomainList.warningFlgOdrQty == 'W')}" >
                            <html:text name="wb007ListDomainList" property="odrQty" maxlength="7" indexed="true" styleClass="odr_qty right warn" errorStyleClass="odr_qty right warn" />
                        </c:if>
                    </td>
                    <html:hidden name="wb007ListDomainList" property="odrCtrlNo" indexed="true" />
                    <html:hidden name="wb007ListDomainList" property="etdDueDt" indexed="true" />
                    <html:hidden name="wb007ListDomainList" property="customerItemNoHidden" indexed="true" />
                    <html:hidden name="wb007ListDomainList" property="customerItemNoOrg" indexed="true" />
                    <html:hidden name="wb007ListDomainList" property="salesCompPoNo" indexed="true" />
                    <html:hidden name="wb007ListDomainList" property="supplierCd" indexed="true" />
                    <html:hidden name="wb007ListDomainList" property="customerDueDt" indexed="true" />
                    <html:hidden name="wb007ListDomainList" property="customerPoNo" indexed="true" />
                    <html:hidden name="wb007ListDomainList" property="odrQtyHidden" indexed="true" />
                    <html:hidden name="wb007ListDomainList" property="updateTimestamp" indexed="true" />
                    <html:hidden name="wb007ListDomainList" property="index" indexed="true" />
                    <html:hidden name="wb007ListDomainList" property="revisionNo" indexed="true" />
                    <html:hidden name="wb007ListDomainList" property="revisionNoEis" indexed="true" />
                    <html:hidden name="wb007ListDomainList" property="plntCd" indexed="true" />
                </tr>
            </ai:stripeline>
        </logic:iterate>
    </table>
    <%--
    -- hidden
    --%>
    <html:hidden property="callScreenId" />
    <html:hidden property="wb007CriteriaDomain.odrCtrlNo" />
</html:form>
