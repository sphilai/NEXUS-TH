<%--
 * W2007.jsp
 *
 * 小箱内多品番梱包Create画面のJSPです。
 * 
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 --%> 
<html:form action="/W2007Search" styleId="mainForm">
    <%--
    -- search condition 1
    --%>
    <table class="gscm_search">
       <colgroup>
            <col class="search_shipper_cd" />
            <col class="search_customer_cd" />
            <col class="search_lgcy_ship_to" />
            <col class="search_trns_cd" />
            <col class="search_plnt_cd" />
            <col class="search_lgcy_wh_cd" />
            <col class="search_pltz_instr_no" />
            <col class="search_wh_comp_cd" />
            <col class="search_wh_cd" />
       </colgroup>
       <tr>
            <th>
                <bean:message key="label.shipperCd" />
            </th>
            <th>
                <bean:message key="label.customerCd" />
            </th>
            <th>
                <bean:message key="label.lgcyShipTo" />
            </th>
            <th>
                <bean:message key="label.trnsCd" />
            </th>
            <th>
                <bean:message key="label.plntCd" />
            </th>
            <th>
                <bean:message key="label.lgcyWhCd" />
            </th>
            <th>
                <bean:message key="label.pltzInstrNo" />
            </th>
            <th>
                <bean:message key="label.whCompCd" />
            </th>
            <th>
                <bean:message key="label.whCd" />
            </th>
        </tr>
        <tr>
            <td>
                <bean:write name="W2007Form" property="w2007CriteriaDomain.shipperCd" />
            </td>
            <td>
                <bean:write name="W2007Form" property="w2007CriteriaDomain.customerCd" />
            </td>
            <td>
                <bean:write name="W2007Form" property="w2007CriteriaDomain.lgcyShipTo" />
            </td>
            <td>
                <bean:write name="W2007Form" property="w2007CriteriaDomain.trnsCd" />
            </td>
            <td>
                <bean:write name="W2007Form" property="w2007CriteriaDomain.plntCd" />
            </td>
            <td>
                <bean:write name="W2007Form" property="w2007CriteriaDomain.lgcyWhCd" />
            </td>
            <td>
                <bean:write name="W2007Form" property="w2007CriteriaDomain.pltzInstrNo" />
            </td>
            <td>
                <bean:write name="W2007Form" property="w2007CriteriaDomain.whCompCd" />
            </td>
            <td>
                <bean:write name="W2007Form" property="w2007CriteriaDomain.whCd" />
            </td>
        </tr>
    </table>
    <%--
    -- search condition 2
    --%>
    <table class="gscm_search">
        <colgroup>
            <col class="search_container_sorting_key" />
            <col class="search_loading_cd" />
            <col class="search_item_no" />
            <col class="search_pkg_cd" />
        </colgroup>
        <tr>
            <th>
                <bean:message key="label.containerSortingKey" />
            </th>
            <th>
                <bean:message key="label.loadingCd" />
            </th>
            <th>
                <bean:message key="label.itemNo" />
            </th>
            <th>
                <bean:message key="label.pkgCd" />
            </th>
        </tr>
        <tr>
            <td>
                <html:text property="w2007CriteriaDomain.containerSortingKey" maxlength="8" styleClass="container_sorting_key" errorStyleClass="container_sorting_key gscm_error_class" />
            </td>
            <td>
                <html:select property="w2007CriteriaDomain.loadingCd" styleClass="loading_cd">
                    <html:options collection="loadingCd" property="id" labelProperty="name" />
                </html:select>
            </td>
            <td>
                <html:text property="w2007CriteriaDomain.itemNo" maxlength="27" styleClass="item_no" errorStyleClass="item_no gscm_error_class" />
            </td>
            <td>
                <html:text property="w2007CriteriaDomain.pkgCd" maxlength="3" styleClass="pkg_cd" errorStyleClass="pkg_cd gscm_error_class" />
            </td>
        </tr>
    </table>
    <%--
    -- buttons 1
    --%>
    <table class="gscm_search_button">
        <colgroup>
            <col width="50%" />
            <col />
        </colgroup>
        <tr>
            <td>
                <html:button property="moveToRegister" styleClass="move_to_register" onclick="removeDisableOnCheckBox();gscm.commonSubmit('W2007MoveToRegister.do', this.form);">
                    <bean:message key="button.moveToRegister" />
                </html:button>
                <html:button property="backToHeader" styleClass="back_to_header" onclick="gscm.submitBack('W2006Init.do', this.form);">
                    <bean:message key="button.backToHeader" />
                </html:button>
                <html:button property="backToMainScreen" styleClass="back_to_main_screen" onclick="gscm.submitBack('W2005Init.do', this.form);">
                    <bean:message key="button.backToMainScreen" />
                </html:button>
            </td>
            <td class="right">
                <html:button property="search" styleClass="search" onclick="setSearchFlg(this.form, 'Y'); gscm.submitSearch('W2007Search.do', this.form, '');">
                    <bean:message key="button.search" />
                </html:button>
            </td>
        </tr>
    </table>
    <hr />
    
    <c:if test="${W2007Form.displayList}">
        <logic:notEmpty name="W2007Form" property="listDomainList" >
        <%--
        -- buttons 2
        --%>
        <table class="gscm_resultlist_button">
            <colgroup>
                <col />
            </colgroup>
            <tr>
                <td>
                    <html:button property="update" styleClass="update" onclick="removeDisableOnCheckBox();gscm.commonSubmit('W2007Update.do', this.form);">
                        <bean:message key="button.update" />
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
        <table id="tablefix" class="gscm_resultlist double">
            <colgroup>
                <col class="resultlist_checked_key" />
                <col class="resultlist_container_sorting_key" />
                <col class="resultlist_loading_cd" />
                <col class="resultlist_pkg_cd" />
                <col class="resultlist_co_flg" />
                <col class="resultlist_container_loose_typ" />
                <col class="resultlist_shipping_lot" />
                <col class="resultlist_qty" />
                <col class="resultlist_tag_qty" />
                <col class="resultlist_order_qty" />
                <col class="resultlist_on_hand_qty" />
                <col class="resultlist_instr_pkged_qty" />
                <col class="resultlist_instr_qty" />
                <col class="resultlist_bo_qty" />
                <col class="resultlist_invoice_key" />
                <col class="resultlist_item_weight" />
                <col class="resultlist_custom_timing_typ" />
            </colgroup>
            <thead>
            <tr>
                <th rowspan="2">
                    <bean:message key="label.ck" />
                    <input type="checkbox" name="checkAll" onclick="allcheck('listDomainList', 'selected', this.checked, changeDisableQtyAndTagQty)" />
                </th>
                <th rowspan="2">
                    <bean:message key="label.containerSortingKey" />
                </th>
                <th rowspan="2">
                    <bean:message key="label.loadingCd" />
                </th>
                <th colspan="4">
                    <bean:message key="label.itemNo" />
                </th>
                <th rowspan="2">
                    <bean:message key="label.actualPkgQty" />
                </th>
                <th rowspan="2">
                    <bean:message key="label.tagQty" />
                </th>
                <th rowspan="2">
                    <bean:message key="label.orderQty" />
                </th>
                <th rowspan="2">
                    <bean:message key="label.onHandQty" />
                </th>
                <th rowspan="2">
                    <bean:message key="label.instrPkgedQty" />
                </th>
                <th rowspan="2">
                    <bean:message key="label.instrQty" />
                </th>
                <th rowspan="2">
                    <bean:message key="label.boQty" />
                </th>
                <th rowspan="2">
                    <bean:message key="label.invoiceKey" />
                </th>
                <th rowspan="2">
                    <bean:message key="label.itemWeight" />(<bean:write name="W2007Form" property="listDomainList[0].shipperWeightUnitDisp" />)
                </th>
                <th rowspan="2">
                    <bean:message key="label.customTimingTyp" />
                </th>
            </tr>
            <tr>
                <th>
                    <bean:message key="label.pkgCd" />
                </th>
                <th>
                    <bean:message key="label.coFlg" />
                </th>
                <th>
                    <bean:message key="label.containerLooseTyp" />
                </th>
                <th>
                    <bean:message key="label.shippingLot" />
                </th>
            </tr>
            </thead>
            <tbody>
            <logic:iterate name="W2007Form" property="listDomainList" id="listDomainList" indexId="idx">
                <ai:stripeline number="${idx + 1}" odd="gscm_odd" even="gscm_even">
                    <tr>
                        <td class="center"  rowspan="2">
<%--                            <bean:define id="selectedDisabled" name='listDomainList' property='selectedDisabled' />
--%>                            <html:checkbox name="listDomainList" property="selected" indexed="true" onclick="changeDisableQtyAndTagQty($(this));"/>
                        </td>
                        <td rowspan="2">
                            <bean:write name="listDomainList" property="containerSortingKey" />
                        </td>
                        <td rowspan="2">
                            <bean:write name="listDomainList" property="loadingCd" />
                        </td>
                        <td colspan="4">
                            <html:text name="listDomainList" property="itemNo" indexed="true" styleClass="w2007_item_no_disptext gscm_disptext" errorStyleClass="w2007_item_no_disptext gscm_error_class" readonly="true" />
                        </td>
                        <td class="right" rowspan="2">
<%--                            <bean:define id="qtyDisabled" name='listDomainList' property='qtyDisabled' />
--%>                            <html:text name="listDomainList" property="qty" maxlength="7" styleClass="w2007_qty right" errorStyleClass="w2007_qty right gscm_error_class" disabled="${listDomainList.selected == 'on' ? 'false' : 'true'}" indexed="true" />
                        </td>
                        <td class="right" rowspan="2">
<%--                            <bean:define id="tagQtyDisabled" name='listDomainList' property='tagQtyDisabled' />
--%>                            <html:text name="listDomainList" property="tagQty" maxlength="3" styleClass="w2007_tag_qty right" errorStyleClass="w2007_tag_qty right gscm_error_class" disabled="${listDomainList.selected == 'on' ? 'false' : 'true'}" indexed="true" />
                        </td>
                        <td class="right" rowspan="2">
                            <bean:write name="listDomainList" property="orderQty" />
                        </td>
                        <td class="right" rowspan="2">
                            <bean:write name="listDomainList" property="onHandQty" />
                        </td>
                        <td class="right" rowspan="2">
                            <bean:write name="listDomainList" property="instrPkgedQty" />
                        </td>
                        <td class="right" rowspan="2">
                            <bean:write name="listDomainList" property="instrQty" />
                        </td>
                        <td class="right" rowspan="2">
                            <bean:write name="listDomainList" property="boQty" />
                        </td>
                        <td rowspan="2">
                            <bean:write name="listDomainList" property="invoiceKey" />
                        </td>
                        <td class="right" rowspan="2">
                            <bean:write name="listDomainList" property="itemWeight" />
                        </td>
                        <td rowspan="2">
                            <bean:write name="listDomainList" property="customTimingTyp" />
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <bean:write name="listDomainList" property="pkgCd" />
                        </td>
                        <td>
                            <bean:write name="listDomainList" property="coFlg" />
                        </td>
                        <td>
                            <bean:write name="listDomainList" property="containerLooseTyp" />
                        </td>
                        <td class="right">
                            <bean:write name="listDomainList" property="shippingLot" />
                        </td>
<%-- 
If a screen has many hidden items, it takes a long time to show it.
For the screen display speed correspondence, comment out the hidden items. 
These items are not used in the javascript and are not changed from the screen.

画面表示速度対応の為、javascriptで使用・変更さない hidden値をコメントアウトします。

                        <html:hidden name="listDomainList" property="disabledFlg" indexed="true" />
                        <html:hidden name="listDomainList" property="itemDescription" indexed="true" />
                        <html:hidden name="listDomainList" property="plntCd" indexed="true" />
                        <html:hidden name="listDomainList" property="weightUnit" indexed="true" />
                        <html:hidden name="listDomainList" property="currCd" indexed="true" />
                        <html:hidden name="listDomainList" property="qtyUnit" indexed="true" />
                        <html:hidden name="listDomainList" property="originCntryCd" indexed="true" />
                        <html:hidden name="listDomainList" property="expLimitTyp" indexed="true" />
                        <html:hidden name="listDomainList" property="dngrItemFlg" indexed="true" />
--%>
                    </tr>
                </ai:stripeline>
            </logic:iterate>
            </tbody>
        </table>
      </logic:notEmpty>
    </c:if>
    
    <%--
    -- hidden
    --%>
    <html:hidden property="searchFlg" />
    <html:hidden property="callScreenId" />
</html:form>
