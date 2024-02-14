<%--
 * WB002.jsp
 *
 * 受注登録画面のJSPです。
 * 
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 --%>
<html:form action="/WB002Init" styleId="mainForm">
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
                <html:text property="wb002CriteriaDomain.rcvOdrCompCd" styleClass="wb002_rcv_odr_comp_cd gscm_disptext" errorStyleClass="wb002_rcv_odr_comp_cd gscm_disptext gscm_error_class" readonly="true" />
            </td>
            <td>
                <html:text property="wb002CriteriaDomain.compNm" styleClass="comp_nm gscm_disptext" readonly="true" />
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
                <html:text property="wb002CriteriaDomain.customerCd" styleClass="customer_cd gscm_disptext" errorStyleClass="customer_cd gscm_disptext gscm_error_class" readonly="true"/>
                <html:text property="wb002CriteriaDomain.lgcyShipTo" styleClass="lgcy_ship_to gscm_disptext" errorStyleClass="lgcy_ship_to gscm_disptext gscm_error_class" readonly="true"/>
            </td>
            <td>
                <html:text property="wb002CriteriaDomain.shipToNm" styleClass="wb002_ship_to_nm gscm_disptext" readonly="true" />
            </td>
            <td>
                <bean:write name="WB002Form" property="wb002CriteriaDomain.trnsCd" />
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
                <html:text property="wb002CriteriaDomain.itemNo" styleClass="wb002_item_no gscm_disptext" errorStyleClass="wb002_item_no gscm_disptext gscm_error_class" readonly="true" />
            </td>
            <td>
                <html:text property="wb002CriteriaDomain.pkgCd" styleClass="pkg_cd gscm_disptext" errorStyleClass="pkg_cd gscm_disptext gscm_error_class" readonly="true"/>
            </td>
            <td>
                <html:text property="wb002CriteriaDomain.itemDescription" styleClass="item_description gscm_disptext" readonly="true" />
            </td>
        </tr>
    </table>
    <hr />
    <%--
    -- buttons 1
    --%>
    <table class="gscm_resultlist_button">
        <colgroup>
            <col />
        </colgroup>
        <tr>
            <td>
                <bean:define id="backConfirmMessage"><bean:message key="NXS-I1-0011"/></bean:define>
                <bean:define id="registerConfirmMessage"><bean:message key="GSCM-I0-0003"/></bean:define>
                <html:button property="backToHeader" styleClass="back_to_header" onclick="submitBackConfirm('WB001Init.do', this.form, '${backConfirmMessage}');">
                    <bean:message key="button.backToHeader" />
                </html:button>
                <html:button property="register" styleClass="register" onclick="gscm.submitConfirm('WB002Register.do', this.form, '${registerConfirmMessage}')">
                    <bean:message key="button.register" />
                </html:button>
                <html:checkbox property="wb002CriteriaDomain.ignoreWarnings" />
                <bean:message key="label.ignoreWarnings" />
            </td>
        </tr>
    </table>
    <br />
    <%--
    -- Used Box -
    --%>
    <table class="grid">
        <colgroup>
            <col class="grid_header" />
            <col class="grid_month1" />
            <col class="grid_total_qty1" />
            <col class="grid_month2" />
            <col class="grid_total_qty2" />
            <col class="grid_month3" />
            <col class="grid_total_qty3" />
            <col class="grid_month4" />
            <col class="grid_total_qty4" />
            <col class="grid_month5" />
            <col class="grid_total_qty5" />
        </colgroup>
        <tr>
            <th class="right">
                <bean:message key="label.totalQtyOfMonthlyOrder" />
                <bean:message key="label.fromBaseDate" />
            </th>
            <th class="right">
                <bean:write name="WB002Form" property="wb002CriteriaDomain.month[0]" />
            </th>
            <td class="right">
                <bean:write name="WB002Form" property="wb002CriteriaDomain.totalQty[0]" />
            </td>
            <th class="right">
                <bean:write name="WB002Form" property="wb002CriteriaDomain.month[1]" />
            </th>
            <td class="right">
                <bean:write name="WB002Form" property="wb002CriteriaDomain.totalQty[1]" />
            </td>
            <th class="right">
                <bean:write name="WB002Form" property="wb002CriteriaDomain.month[2]" />
            </th>
            <td class="right">
                <bean:write name="WB002Form" property="wb002CriteriaDomain.totalQty[2]" />
            </td>
            <th class="right">
                <bean:write name="WB002Form" property="wb002CriteriaDomain.month[3]" />
            </th>
            <td class="right">
                <bean:write name="WB002Form" property="wb002CriteriaDomain.totalQty[3]" />
            </td>
            <th class="right">
                <bean:write name="WB002Form" property="wb002CriteriaDomain.month[4]" />
            </th>
            <td class="right">
                <bean:write name="WB002Form" property="wb002CriteriaDomain.totalQty[4]" />
            </td>
        </tr>
    </table>
    <br />
    <%--
    -- search results
    --%>
    <table class="fix_content gscm_resultlist">
        <colgroup>
            <col class="resultlist_checked_key" />
            <col class="resultlist_etd_due_dt" />
            <col class="resultlist_firm_qty" />
            <col class="resultlist_forecast_qty" />
            <col class="resultlist_customer_due_dt" />
            <col class="resultlist_pltz_alloc_qty" />
            <col class="resultlist_customer_item_no" />
            <col class="resultlist_customer_po_no" />
            <col class="resultlist_sales_comp_po_no" />
            <col class="resultlist_exp_rcv_odr_num" />
        </colgroup>
        <tr>
            <th>
                <bean:message key="label.ck" />
            </th>
            <th>
                <bean:message key="WB002.label.etdDueDt" />
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
            <th>
                <bean:message key="label.expRcvOdrNum" />
            </th>
        </tr>
    </table>
    <div class="scroll_content">
        <table class="gscm_resultlist">
            <colgroup>
                <col class="resultlist_checked_key" />
                <col class="resultlist_etd_due_dt" />
                <col class="resultlist_firm_qty" />
                <col class="resultlist_forecast_qty" />
                <col class="resultlist_customer_due_dt" />
                <col class="resultlist_pltz_alloc_qty" />
                <col class="resultlist_customer_item_no" />
                <col class="resultlist_customer_po_no" />
                <col class="resultlist_sales_comp_po_no" />
                <col class="resultlist_exp_rcv_odr_num" />
            </colgroup>
            <logic:iterate name="WB002Form" property="wb002ListDomainList" id="wb002ListDomainList" indexId="idx">
                <ai:stripeline number="${idx + 1}" odd="gscm_odd" even="gscm_even">
                    <tr>
                        <html:hidden name="wb002ListDomainList" property="warningFlgFirmQty" indexed="true" />
                        <html:hidden name="wb002ListDomainList" property="warningFlgForecastQty" indexed="true" />
                        <td class="center">
                            <html:checkbox name="wb002ListDomainList" property="selected" errorStyleClass="gscm_error_class" indexed="true" onclick="chengeChkBox($(this));" />
                        </td>
                        <td>
                            <bean:define id="multiPoConfirmMessage"><bean:message key="NXS-I1-0011"/></bean:define>
                            <bean:define id="workDay" name="wb002ListDomainList" property="workDayFlg" />
                            <c:if test="${workDay eq 'N'}" >
                                <font color="red"><bean:write name="wb002ListDomainList" property="etdDueDt" /></font>
                            </c:if>
                            <c:if test="${workDay ne 'N'}">
                                <bean:write name="wb002ListDomainList" property="etdDueDt" />
                            </c:if>
                            <html:hidden name="wb002ListDomainList" property="etdDueDt" indexed="true"/>
                            <html:button property="multiPo" styleClass="multi_po" onclick="submitSelectedRow('WB002MultiPO.do', this.form, ${idx}, '${multiPoConfirmMessage}');">
                                <bean:message key="button.multiPo" />
                            </html:button>
                        </td>
                        <td class="right">
                            <c:if test="${((empty wb002ListDomainList.countHidden) or (wb002ListDomainList.countHidden <= 1)) and ((empty wb002ListDomainList.warningFlgFirmQty) or (wb002ListDomainList.warningFlgFirmQty == 'E'))}" >
                                <html:text name="wb002ListDomainList" property="firmQty" maxlength="7" styleClass="firm_qty right" errorStyleClass="firm_qty right gscm_error_class" indexed="true" />
                            </c:if>
                            <c:if test="${(wb002ListDomainList.countHidden > 1) and ((empty wb002ListDomainList.warningFlgFirmQty) or (wb002ListDomainList.warningFlgFirmQty == 'E'))}" >
                                <html:text name="wb002ListDomainList" property="firmQty" maxlength="7" styleClass="firm_qty right gscm_disptext" errorStyleClass="firm_qty right gscm_disptext gscm_error_class" indexed="true" readonly="true"/>
                            </c:if>
                            <c:if test="${((empty wb002ListDomainList.countHidden) or (wb002ListDomainList.countHidden <= 1)) and (wb002ListDomainList.warningFlgFirmQty == 'W')}" >
                                <html:text name="wb002ListDomainList" property="firmQty" maxlength="7" styleClass="firm_qty right warn" errorStyleClass="firm_qty right warn" indexed="true" />
                            </c:if>
                            <c:if test="${(wb002ListDomainList.countHidden > 1) and (wb002ListDomainList.warningFlgFirmQty == 'W')}" >
                                <html:text name="wb002ListDomainList" property="firmQty" maxlength="7" styleClass="firm_qty right gscm_disptext warn" errorStyleClass="firm_qty right gscm_disptext warn" indexed="true" readonly="true"/>
                            </c:if>
                        </td>
                        <td class="right">
                            <c:if test="${((empty wb002ListDomainList.countHidden) or (wb002ListDomainList.countHidden <= 1)) and ((empty wb002ListDomainList.warningFlgForecastQty) or (wb002ListDomainList.warningFlgForecastQty == 'E'))}" >
                                <html:text name="wb002ListDomainList" property="forecastQty" maxlength="7" styleClass="forecast_qty right" errorStyleClass="forecast_qty right gscm_error_class" indexed="true" />
                            </c:if>
                            <c:if test="${(wb002ListDomainList.countHidden > 1) and ((empty wb002ListDomainList.warningFlgForecastQty) or (wb002ListDomainList.warningFlgForecastQty == 'E'))}" >
                                <html:text name="wb002ListDomainList" property="forecastQty" maxlength="7" styleClass="forecast_qty right gscm_disptext" errorStyleClass="forecast_qty right gscm_disptext gscm_error_class" indexed="true" readonly="true"/>
                            </c:if>
                            <c:if test="${((empty wb002ListDomainList.countHidden) or (wb002ListDomainList.countHidden <= 1)) and (wb002ListDomainList.warningFlgForecastQty == 'W')}" >
                                <html:text name="wb002ListDomainList" property="forecastQty" maxlength="7" styleClass="forecast_qty right warn" errorStyleClass="forecast_qty right warn" indexed="true" />
                            </c:if>
                            <c:if test="${(wb002ListDomainList.countHidden > 1) and (wb002ListDomainList.warningFlgForecastQty == 'W')}" >
                                <html:text name="wb002ListDomainList" property="forecastQty" maxlength="7" styleClass="forecast_qty right gscm_disptext warn" errorStyleClass="forecast_qty right gscm_disptext warn" indexed="true" readonly="true"/>
                            </c:if>
                        </td>
                        <td>
                            <c:if test="${(empty wb002ListDomainList.countHidden) or (wb002ListDomainList.countHidden <= 1)}" >
                                <html:text name="wb002ListDomainList" property="customerDueDt" maxlength="8" indexed="true" styleClass="customer_due_dt" errorStyleClass="customer_due_dt gscm_error_class" />
                                <img src="images/gscm/library/Calendar.gif"
                                   onClick="gscm.writeCalendar('customerDueDt${idx}Div', 'mainForm', 'wb002ListDomainList[${idx}].customerDueDt', '<bean:message key="format.screen.yyyymmdd" />', this);" name="wb002ListDomainList[${idx}].calImage"/>
                            </c:if>
                            <c:if test="${wb002ListDomainList.countHidden > 1}" >
                                <html:text name="wb002ListDomainList" property="customerDueDt" maxlength="8" indexed="true" styleClass="customer_due_dt disp_none" errorStyleClass="customer_due_dt disp_none gscm_error_class" />
                                <img src="images/gscm/library/Calendar.gif" class="disp_none"
                                   onClick="gscm.writeCalendar('customerDueDt${idx}Div', 'mainForm', 'wb002ListDomainList[${idx}].customerDueDt', '<bean:message key="format.screen.yyyymmdd" />', this);" name="wb002ListDomainList[${idx}].calImage"/>

                            </c:if>
                        </td>
                        <td>
                            <html:text name="wb002ListDomainList" property="pltzAllocQty" maxlength="7" styleClass="wb002_alloc_qty right" errorStyleClass="wb002_alloc_qty right gscm_error_class" indexed="true" readonly="true"/>
                        </td>
                        <td>
                            <c:if test="${((empty wb002ListDomainList.countHidden) or (wb002ListDomainList.countHidden <= 1)) and (wb002ListDomainList.selected == 'on')}" >
                                <html:text name="wb002ListDomainList" property="customerItemNo" maxlength="20" styleClass="wb002_customer_item_no gscm_required" errorStyleClass="wb002_customer_item_no gscm_error_class" indexed="true" />
                            </c:if>
                            <c:if test="${((empty wb002ListDomainList.countHidden) or (wb002ListDomainList.countHidden <= 1)) and (empty wb002ListDomainList.selected)}" >
                                <html:text name="wb002ListDomainList" property="customerItemNo" maxlength="20" styleClass="wb002_customer_item_no" errorStyleClass="wb002_customer_item_no gscm_error_class" indexed="true" />
                            </c:if>
                            <c:if test="${wb002ListDomainList.countHidden > 1}" >
                                <html:text name="wb002ListDomainList" property="customerItemNo" maxlength="20" styleClass="wb002_customer_item_no gscm_disptext" errorStyleClass="wb002_customer_item_no gscm_error_class gscm_disptext" indexed="true"  readonly="true"/>
                            </c:if>
                        </td>
                        <td>
                            <c:if test="${((empty wb002ListDomainList.countHidden) or (wb002ListDomainList.countHidden <= 1)) and (wb002ListDomainList.selected == 'on')}" >
                                <html:text name="wb002ListDomainList" property="customerPoNo" maxlength="20" styleClass="wb002_customer_po_no gscm_required" errorStyleClass="wb002_customer_po_no gscm_error_class" indexed="true" />
                            </c:if>
                            <c:if test="${((empty wb002ListDomainList.countHidden) or (wb002ListDomainList.countHidden <= 1)) and (empty wb002ListDomainList.selected)}" >
                                <html:text name="wb002ListDomainList" property="customerPoNo" maxlength="20" styleClass="wb002_customer_po_no" errorStyleClass="wb002_customer_po_no gscm_error_class" indexed="true" />
                            </c:if>
                            <c:if test="${wb002ListDomainList.countHidden > 1}" >
                                <html:text name="wb002ListDomainList" property="customerPoNo" maxlength="20" styleClass="wb002_customer_po_no gscm_disptext" errorStyleClass="wb002_customer_po_no gscm_error_class gscm_disptext" indexed="true"  readonly="true"/>
                            </c:if>
                        </td>
                        <td>
                            <c:if test="${(empty wb002ListDomainList.countHidden) or (wb002ListDomainList.countHidden <= 1)}" >
                                <html:text name="wb002ListDomainList" property="salesCompPoNo" maxlength="10" styleClass="wb002_sales_comp_po_no" errorStyleClass="wb002_sales_comp_po_no gscm_error_class" indexed="true" />
                            </c:if>
                            <c:if test="${wb002ListDomainList.countHidden > 1}" >
                                <html:text name="wb002ListDomainList" property="salesCompPoNo" maxlength="10" styleClass="wb002_sales_comp_po_no gscm_disptext" errorStyleClass="wb002_sales_comp_po_no gscm_error_class gscm_disptext" indexed="true"  readonly="true"/>
                            </c:if>
                        </td>
                        <td class="right">
                            <bean:write name="wb002ListDomainList" property="count" />
                            <html:hidden name="wb002ListDomainList" property="countHidden" indexed="true"/>
                        </td>
                        <html:hidden name="wb002ListDomainList" property="customerPoNoHidden" indexed="true" />
                        <html:hidden name="wb002ListDomainList" property="odrCtrlNo" indexed="true" />
                        <html:hidden name="wb002ListDomainList" property="customerItemNoOrg" indexed="true" />
                        <html:hidden name="wb002ListDomainList" property="customerItemNoHidden" indexed="true" />
                        <html:hidden name="wb002ListDomainList" property="salesCompPoNoHidden" indexed="true" />
                        <html:hidden name="wb002ListDomainList" property="odrQty" indexed="true" />
                        <html:hidden name="wb002ListDomainList" property="odrQtyOrg" indexed="true" />
                        <html:hidden name="wb002ListDomainList" property="pltzAllocQtyHidden" indexed="true" />
                        <html:hidden name="wb002ListDomainList" property="shippedQty" indexed="true" />
                        <html:hidden name="wb002ListDomainList" property="partialDelivCnt" indexed="true" />
                        <html:hidden name="wb002ListDomainList" property="updateTimestamp" indexed="true" />
                        <html:hidden name="wb002ListDomainList" property="index" indexed="true" />
                        <html:hidden name="wb002ListDomainList" property="workDayFlg" indexed="true" />
                    </tr>
                </ai:stripeline>
            </logic:iterate>
        </table>
    </div>
    <logic:iterate name="WB002Form" property="wb002ListDomainList" id="wb002ListDomainList" indexId="idx">
        <div id="customerDueDt${idx}Div" style="float:left;"></div>
    </logic:iterate>
    <%--
    -- hidden
    --%>
    <html:hidden property="callScreenId" />
    <html:hidden property="wb002CriteriaDomain.etdDueDt" />
    <html:hidden property="wb002CriteriaDomain.customerPoNo" />
    <html:hidden property="etdDueDtHidden" styleId="etdDueDtHidden" />
    <html:hidden property="customerItemNoHidden" styleId="customerItemNoHidden" />
    
</html:form>
