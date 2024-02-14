<%--
 * W2011.jsp
 * 
 * CML Create 画面のJSPです。
 *
 * 
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 --%>
<html:form action="/W2011Init" styleId="mainForm" >
    <%--
    -- search condition 1
    --%>
    <table class="gscm_search" >
        <colgroup>
            <col class="search_shipper_cd" />
            <col class="search_customer_cd" />
            <col class="search_lgcy_ship_to" />
            <col class="search_trns_cd" />
            <col class="search_plnt_cd" />
            <col class="search_lgcy_wh_cd" />
            <col class="search_pltz_instr_no" />
            <col class="search_packing_wh_comp_cd" />
            <col class="search_packing_wh_cd" />
            <col class="search_container_sorting_key" />
            <col class="search_loading_cd" />
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
                <bean:message key="label.packingWhCompCd" />
            </th>
            <th>
                <bean:message key="label.packingWhCd" />
            </th>
            <th>
                <bean:message key="label.containerSortingKey" />
            </th>
            <th>
                <bean:message key="label.loadingCd" />
            </th>
        </tr>
        <tr>
            <td>
                <bean:write name="W2011Form" property="w2011CriteriaDomain.shipperCd" />
            </td>
            <td>
                <bean:write name="W2011Form" property="w2011CriteriaDomain.customerCd" />
            </td>
            <td>
                <bean:write name="W2011Form" property="w2011CriteriaDomain.lgcyShipTo" />
            </td>
            <td>
                <bean:write name="W2011Form" property="w2011CriteriaDomain.trnsCd" />
            </td>
            <td>
                <bean:write name="W2011Form" property="w2011CriteriaDomain.plntCd" />
            </td>
            <td>
                <bean:write name="W2011Form" property="w2011CriteriaDomain.lgcyWhCd" />
            </td>
            <td>
                <bean:write name="W2011Form" property="w2011CriteriaDomain.pltzInstrNo" />
            </td>
            <td>
                <bean:write name="W2011Form" property="w2011CriteriaDomain.packingWhCompCd" />
            </td>
            <td>
                <bean:write name="W2011Form" property="w2011CriteriaDomain.packingWhCd" />
            </td>
            <td>
                <html:text property="w2011CriteriaDomain.containerSortingKey" maxlength="8" styleClass="container_sorting_key" errorStyleClass="container_sorting_key gscm_error_class" />
            </td>
            <td>
                <html:select property="w2011CriteriaDomain.loadingCd" styleClass="loading_cd" errorStyleClass="loading_cd gscm_error_class" >
                    <html:options collection="loadingCd" property="id" labelProperty="name"/>
                </html:select>
            </td>
        </tr>
    </table>
    <%--
    -- search condition 2
    --%>
    <table class="gscm_search">
        <colgroup>
            <col class="search_mix_tag_no" />
            <col class="search_pltz_itm_no" />
            <col class="search_pkg_cd" />
            <col class="search_pkg_form_typ" />
            <col class="search_invoice_key" />
            <col class="search_stg_instr_item_flg" />
            <col class="search_custom_timing_typ" />
            <col class="search_pallet_carton_typ" />
        </colgroup>
        <tr>
            <th>
                <bean:message key="label.mixTagNo" />
            </th>
            <th>
                <bean:message key="label.pltzItemNo" />
            </th>
            <th>
                <bean:message key="label.pkgCd" />
            </th>
            <th>
                <bean:message key="label.pkgFormTyp" />
            </th>
            <th>
                <bean:message key="label.invoiceKey" />
            </th>
            <th>
                <bean:message key="label.stgInstrItemFlg" />
            </th>
            <th>
                <bean:message key="label.customTimingTyp" />
            </th>
            <%-- UT420 ADD --%>
            <th>
                <bean:message key="label.palletCartonTyp" />
            </th>
        </tr>
        <tr>
            <td>
                <html:text property="w2011CriteriaDomain.mixTagNo" maxlength="17" styleClass="mix_tag_no" errorStyleClass="mix_tag_no gscm_error_class" />
            </td>
            <td>
                <html:text property="w2011CriteriaDomain.pltzItemNo" maxlength="27" styleClass="pltz_item_no" errorStyleClass="pltz_item_no gscm_error_class" />
            </td>
            <td>
                <html:text property="w2011CriteriaDomain.pkgCd" maxlength="3" styleClass="pkg_cd" errorStyleClass="pkg_cd gscm_error_class" />
            </td>
            <td>
                <%-- UT110 TRIAL SHIPMENT/号試品対応 ADD disabled --%>
                <html:select property="w2011CriteriaDomain.pkgFormTyp" styleClass="pkg_form_typ" errorStyleClass="pkg_form_typ gscm_error_class" disabled="${W2011Form.w2011CriteriaDomain.manualRegFlg=='Y'?true:false}" >
                    <html:options collection="pkgFormTyp" property="id" labelProperty="name" />
                </html:select>
            </td>
            <td>
                <html:text property="w2011CriteriaDomain.invoiceKey" maxlength="3" styleClass="invoice_key" errorStyleClass="invoice_key gscm_error_class" />
            </td>
            <td>
                <html:select property="w2011CriteriaDomain.stgInstrItemFlg" styleClass="stg_instr_item_flg" errorStyleClass="stg_instr_item_flg gscm_error_class">
                    <html:options collection="flag" property="id" labelProperty="name" />
                </html:select>
            </td>
            <td>
                <html:select property="w2011CriteriaDomain.customTimingTyp" styleClass="custom_timing_typ" errorStyleClass="custom_timing_typ gscm_error_class">
                    <html:options collection="customTimingTyp" property="id" labelProperty="name" />
                </html:select>
            </td>
            <%-- UT420 ADD START --%>
            <td>
                <html:text property="w2011CriteriaDomain.palletCartonTypName" styleClass="pallet_carton_typ gscm_disptext" errorStyleClass="pallet_carton_typ gscm_disptext gscm_error_class" readonly="true"/>
            </td>
            <%-- UT420 ADD END --%>
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
                <html:button property="moveToRegister" styleClass="move_to_register" onclick="removeDisableOnCheckBox();gscm.commonSubmit('W2011MoveToRegister.do', this.form);">
                    <bean:message key="button.moveToRegister" />
                </html:button>
                <html:button property="backToHeader" styleClass="back_to_header" onclick="gscm.submitBack('W2010Init.do', this.form);">
                    <bean:message key="button.backToHeader" />
                </html:button>
                <html:button property="backToMainScreen" styleClass="back_to_main_screen" onclick="gscm.submitBack('W2009Init.do', this.form);">
                    <bean:message key="button.backToMainScreen" />
                </html:button>
            </td>
            <td class="right">
                <html:button property="search" styleClass="search" onclick="setSearchFlg(this.form, 'Y');gscm.commonSubmit('W2011Search.do', this.form);">
                    <bean:message key="button.search" />
                </html:button>
            </td>
        </tr>
    </table>
    <hr />
    
    <c:if test="${W2011Form.displayList}">
        <%--
        -- buttons 2
        --%>
        <table class="gscm_resultlist_button">
            <colgroup>
                <col />
            </colgroup>
            <tr>
                <td>
                    <html:button property="update" styleClass="update" onclick="removeDisableOnCheckBox();gscm.commonSubmit('W2011Update.do', this.form);">
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
                <col class="resultlist_pkg_form_typ" />
                <col class="resultlist_qty" />
                <col class="resultlist_tag_qty" />
                <col class="resultlist_order_qty" />
                <col class="resultlist_on_hand_qty" />
                <col class="resultlist_instr_pkgaged_qty" />
                <col class="resultlist_instr_qty" />
                <col class="resultlist_bo_qty" />
                <col class="resultlist_invoice_key" />
                <col class="resultlist_stg_instr_item_flg" />
                <col class="resultlist_custom_timing_typ" />
            </colgroup>
            <thead>
            <tr>
                <th rowspan="2">
                    <bean:message key="label.ck" />
                    <input type="checkbox" name="checkAll" onclick="allcheck('listDomainList', 'selected', this.checked, changeDisableQtyAndTagQty)">
                </th>
                <th rowspan="2">
                    <bean:message key="label.containerSortingKey" />
                </th>
                <th rowspan="2">
                    <bean:message key="label.loadingCd" />
                </th>
                <th colspan="4">
                    <bean:message key="label.mixTagNoItemNo" />
                </th>
                <th rowspan="2">
                    <bean:message key="label.pkgFormTyp" />
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
                    <bean:message key="label.stgInstrItemFlg" />
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
            <logic:iterate name="W2011Form" property="listDomainList" id="listDomainList" indexId="idx">
                <ai:stripeline number="${idx + 1}" odd="gscm_odd" even="gscm_even">
                    <tr>
                        <td class="center"  rowspan="2">
                            <bean:define id="selectedDisabled" name='listDomainList' property='selectedDisabled' />
                            <html:checkbox name="listDomainList" property="selected" indexed="true" onclick="changeDisableQtyAndTagQty($(this));" disabled="${selectedDisabled}" />
                        </td>
                        <td rowspan="2">
                            <bean:write name="listDomainList" property="containerSortingKey" />
                        </td>
                        <td rowspan="2">
                            <bean:write name="listDomainList" property="loadingCd" />
                        </td>
                            <logic:equal name="listDomainList" property="mixTagNoErrStyleFlg" value="1">
                                <bean:define id="mixTagNoStyleClass" value="gscm_error_class" />
                            </logic:equal>
                            <logic:notEqual name="listDomainList" property="mixTagNoErrStyleFlg" value="1">
                                <bean:define id="mixTagNoStyleClass" value="" />
                            </logic:notEqual>
                        <td colspan="4" class="${mixTagNoStyleClass}">
                             <logic:equal  name="listDomainList" property="mixTagFlg" value="Y">
                                 <a href="javascript:void(0)" onclick="popupWT007('','<bean:write name="listDomainList" property="pltzItemNo" />');">
                                     <bean:write name="listDomainList" property="pltzItemNo" />
                                 </a>
                             </logic:equal>
                             <logic:notEqual  name="listDomainList" property="mixTagFlg" value="Y">
                                 <bean:write name="listDomainList" property="pltzItemNo" />
                             </logic:notEqual>
                        </td>
                        <td rowspan="2">
                            <logic:equal name="listDomainList" property="mixTagFlg" value="N">
                                <bean:write name="listDomainList" property="pkgFormTyp" />
                            </logic:equal>
                        </td>
                        <td class="right" rowspan="2">
                            <bean:define id="qtyDisabled" name='listDomainList' property='qtyDisabled' />
                            <html:text name="listDomainList" property="qty" maxlength="7" styleClass="w2011_qty right" errorStyleClass="w2011_qty right gscm_error_class" indexed="true" disabled="${qtyDisabled}" />
                        </td>
                        <td class="right" rowspan="2">
                            <bean:define id="tagQtyDisabled" name='listDomainList' property='tagQtyDisabled' />
                            <html:text name="listDomainList" property="tagQty" maxlength="3" styleClass="w2011_tag_qty right" errorStyleClass="w2011_tag_qty right gscm_error_class" indexed="true" disabled="${tagQtyDisabled}" />
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
                        <td rowspan="2">
                            <bean:write name="listDomainList" property="stgInstrItemFlg" />
                        </td>
                        <td rowspan="2">
                            <bean:write name="listDomainList" property="customTimingTyp" />
                        </td>
                        <html:hidden name="listDomainList" property="pkgFormTyp" indexed="true"/>
                        <html:hidden name="listDomainList" property="mixTagFlg" indexed="true"/>
<%-- 
If a screen has many hidden items, it takes a long time to show it.
For the screen display speed correspondence, comment out the hidden items. 
These items are not used in the javascript and are not changed from the screen.

画面表示速度対応の為、javascriptで使用・変更さない hidden値をコメントアウトします。

                        <html:hidden name="listDomainList" property="itemDescription" indexed="true" />
                        <html:hidden name="listDomainList" property="disableFlg" indexed="true" />
                        <html:hidden name="listDomainList" property="itemWeight" indexed="true" />
                        <html:hidden name="listDomainList" property="weightUnit" indexed="true" />
                        <html:hidden name="listDomainList" property="pltzItemNo" indexed="true" />
                        <html:hidden name="listDomainList" property="currCd" indexed="true" />
                        <html:hidden name="listDomainList" property="qtyUnit" indexed="true" />
                        <html:hidden name="listDomainList" property="originCntryCd" indexed="true" />
                        <html:hidden name="listDomainList" property="expLimitTyp" indexed="true" />
                        <html:hidden name="listDomainList" property="dngrItemFlg" indexed="true" />
                        <html:hidden name="listDomainList" property="plntCd" indexed="true" />
--%>
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
                    </tr>
                </ai:stripeline>
            </logic:iterate>
            </tbody>
        </table>
    </c:if>
    
    <%--
    -- hidden
    --%>
    <html:hidden name="W2011Form" property="w2011CriteriaDomain.manualRegFlg" />
    <html:hidden property="searchFlg" />
    <html:hidden property="callScreenId" />
</html:form>
