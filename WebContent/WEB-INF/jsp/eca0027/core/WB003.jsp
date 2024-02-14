<%--
 * WB003.jsp
 * 
 * Order Entry Multi PO Register画面のJSPです。
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 --%>
<html:form action="/WB003Init" styleId="mainForm">
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
                <html:text property="wb003CriteriaDomain.rcvOdrCompCd" styleClass="rcv_odr_comp_cd gscm_disptext" errorStyleClass="rcv_odr_comp_cd gscm_disptext gscm_error_class" readonly="true"/>
            </td>
            <td>
                <html:text property="wb003CriteriaDomain.compNm" styleClass="comp_nm gscm_disptext" readonly="true"/>
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
            <col class="search_etd_due_dt" />
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
                <bean:message key="WB003.label.etdDueDt" />
            </th>
        </tr>
        <tr>
            <td>
                <html:text property="wb003CriteriaDomain.customerCd" styleClass="customer_cd gscm_disptext" errorStyleClass="customer_cd gscm_disptext gscm_error_class" readonly="true"/>
                <html:text property="wb003CriteriaDomain.lgcyShipTo" styleClass="lgcy_ship_to gscm_disptext" errorStyleClass="lgcy_ship_to gscm_disptext gscm_error_class" readonly="true"/>
            </td>
            <td>
                <html:text property="wb003CriteriaDomain.shipToNm" styleClass="wb003_ship_to_nm gscm_disptext" readonly="true"/>
            </td>
            <td>
                <bean:write name="WB003Form" property="wb003CriteriaDomain.trnsCd" />
            </td>
            <td>
                <bean:write name="WB003Form" property="wb003CriteriaDomain.etdDueDt" />
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
        </tr>
        <tr>
            <td>
                <html:text property="wb003CriteriaDomain.itemNo" styleClass="wb003_item_no gscm_disptext" errorStyleClass="wb003_item_no gscm_disptext gscm_error_class" readonly="true"/>
            </td>
            <td>
                <html:text property="wb003CriteriaDomain.pkgCd" styleClass="pkg_cd gscm_disptext" errorStyleClass="pkg_cd gscm_disptext gscm_error_class" readonly="true"/>
            </td>
            <td>
                <html:text property="wb003CriteriaDomain.itemDescription" styleClass="item_description gscm_disptext" readonly="true"/>
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
                <bean:define id="backToRegisterConfirmMessage"><bean:message key="NXS-I1-0011"/></bean:define>
                <bean:define id="registerConfirmMessage"><bean:message key="GSCM-I0-0003"/></bean:define>
                <html:button property="backToRegister" styleClass="back_to_register" onclick="submitBackConfirm('WB002Init.do', this.form, '${backToRegisterConfirmMessage}');">
                    <bean:message key="button.backToRegister" />
                </html:button>
                <html:button property="register" styleClass="register" onclick="gscm.submitCreateConfirm('WB003Register.do', this.form);">
                    <bean:message key="button.register" />
                </html:button>
                <html:checkbox property="wb003CriteriaDomain.ignoreWarnings" />
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
            <col class="resultlist_checked_key" />
            <col class="resultlist_firm_qty" />
            <col class="resultlist_forecast_qty" />
            <col class="resultlist_customer_due_dt" />
            <col class="resultlist_pltz_alloc_qty" />
            <col class="resultlist_customer_item_no" />
            <col class="resultlist_customer_po_no" />
            <col class="resultlist_sales_comp_po_no" />
        </colgroup>
        <tr>
            <th>
                <bean:message key="label.ck" />
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
                <bean:message key="label.customerItemNo" />
            </th>
            <th>
                <bean:message key="label.customerPoNo" />
            </th>
            <th>
                <bean:message key="label.salesCompPoNo" />
            </th>
        </tr>
        <logic:iterate name="WB003Form" property="wb003ListDomainList" id="wb003ListDomainList" indexId="idx" >
            <ai:stripeline number="${idx + 1}" odd="gscm_odd" even="gscm_even">
                <tr>
                    <html:hidden name="wb003ListDomainList" property="warningFlgFirmQty" indexed="true" />
                    <html:hidden name="wb003ListDomainList" property="warningFlgForecastQty" indexed="true" />
                    <td class="center">
                        <bean:write name="wb003ListDomainList" property="no" />
                        <html:checkbox name="wb003ListDomainList" property="selected" indexed="true" errorStyleClass="gscm_error_class" onclick="chengeChkBox(${idx});" />
                    </td>
                    <td>
                        <c:if test="${(empty wb003ListDomainList.warningFlgFirmQty) or (wb003ListDomainList.warningFlgFirmQty == 'E')}" >
                            <html:text name="wb003ListDomainList" property="firmQty" maxlength="7" indexed="true" styleClass="firm_qty right" errorStyleClass="firm_qty right gscm_error_class" />
                        </c:if>
                        <c:if test="${(wb003ListDomainList.warningFlgFirmQty == 'W')}" >
                            <html:text name="wb003ListDomainList" property="firmQty" maxlength="7" indexed="true" styleClass="firm_qty right warn" errorStyleClass="firm_qty right warn" />
                        </c:if>                        
                    </td>
                    <td>
                        <c:if test="${(empty wb003ListDomainList.warningFlgForecastQty) or (wb003ListDomainList.warningFlgForecastQty == 'E')}" >
                            <html:text name="wb003ListDomainList" property="forecastQty" maxlength="7" indexed="true" styleClass="forecast_qty right" errorStyleClass="forecast_qty right gscm_error_class" />
                        </c:if>
                        <c:if test="${(wb003ListDomainList.warningFlgForecastQty == 'W')}" >
                            <html:text name="wb003ListDomainList" property="forecastQty" maxlength="7" indexed="true" styleClass="forecast_qty right warn" errorStyleClass="forecast_qty right warn" />
                        </c:if>
                    </td>
                    <td>
                        <html:text name="wb003ListDomainList" property="customerDueDt" maxlength="8" indexed="true" styleClass="customer_due_dt" errorStyleClass="customer_due_dt gscm_error_class" />
                        <img src="images/gscm/library/Calendar.gif"
                            onClick="gscm.writeCalendar('customerDueDt${idx}Div', 'mainForm', 'wb003ListDomainList[${idx}].customerDueDt', '<bean:message key="format.screen.yyyymmdd" />', this);"/>
                    </td>
                    <td class="right">
                        <html:text name="wb003ListDomainList" property="pltzAllocQty" maxlength="7" indexed="true" styleClass="wb003_alloc_qty right" errorStyleClass="wb003_alloc_qty right gscm_error_class" readonly="true"/>
                    </td>
                    <td>
                        <c:if test="${(wb003ListDomainList.selected == 'on')}" >
                            <html:text name="wb003ListDomainList" property="customerItemNo" maxlength="20" indexed="true" styleClass="wb003_customer_item_no gscm_required" errorStyleClass="wb003_customer_item_no gscm_error_class" />
                        </c:if>
                        <c:if test="${(empty wb003ListDomainList.selected)}" >
                            <html:text name="wb003ListDomainList" property="customerItemNo" maxlength="20" indexed="true" styleClass="wb003_customer_item_no" errorStyleClass="wb003_customer_item_no gscm_error_class" />
                        </c:if>
                    </td>
                    <td>
                        <c:if test="${(wb003ListDomainList.selected == 'on')}" >
                            <html:text name="wb003ListDomainList" property="customerPoNo" maxlength="20" indexed="true" styleClass="wb003_customer_po_no gscm_required" errorStyleClass="wb003_customer_po_no gscm_error_class" />
                        </c:if>
                        <c:if test="${(empty wb003ListDomainList.selected)}" >
                            <html:text name="wb003ListDomainList" property="customerPoNo" maxlength="20" indexed="true" styleClass="wb003_customer_po_no" errorStyleClass="wb003_customer_po_no gscm_error_class" />
                        </c:if>
                    </td>
                    <td>
                        <html:text name="wb003ListDomainList" property="salesCompPoNo" maxlength="10" indexed="true" styleClass="sales_comp_po_no" errorStyleClass="sales_comp_po_no gscm_error_class" />
                    </td>
                    <html:hidden name="wb003ListDomainList" property="customerPoNoHidden" indexed="true" />
                    <html:hidden name="wb003ListDomainList" property="odrCtrlNo" indexed="true" />
                    <html:hidden name="wb003ListDomainList" property="customerItemNoHidden" indexed="true" />
                    <html:hidden name="wb003ListDomainList" property="customerItemNoOrg" indexed="true" />
                    <html:hidden name="wb003ListDomainList" property="salesCompPoNoHidden" indexed="true" />
                    <html:hidden name="wb003ListDomainList" property="odrQty" indexed="true" />
                    <html:hidden name="wb003ListDomainList" property="odrQtyOrg" indexed="true" />
                    <html:hidden name="wb003ListDomainList" property="pltzAllocQtyHidden" indexed="true" />
                    <html:hidden name="wb003ListDomainList" property="shippedQty" indexed="true" />
                    <html:hidden name="wb003ListDomainList" property="partialDelivCnt" indexed="true" />
                    <html:hidden name="wb003ListDomainList" property="updateTimestamp" indexed="true" />
                    <html:hidden name="wb003ListDomainList" property="index" indexed="true" />
                </tr>
            </ai:stripeline>
        </logic:iterate>
    </table>
    <logic:iterate name="WB003Form" property="wb003ListDomainList" id="wb003ListDomainList" indexId="idx">
        <div id="customerDueDt${idx}Div" style="float:left;"></div>
    </logic:iterate>
    <%--
    -- hidden
    --%>
    <html:hidden property="callScreenId" />
</html:form>
