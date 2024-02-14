<%--
 * W2020.jsp
 *
 * JSP of Multi Label Register Screen.
 * Multi Label Register画面のJSPです。
 *
 * Copyright (c) 2016 DENSO CORPORATION. All rights reserved.
 --%>

<%-- Action of the submit destination --%>
<%-- submit先のアクション --%>
<c:set var="searchAction" scope="request">
    <html:rewrite action="/W2020Search"></html:rewrite>
</c:set>
<c:set var="pkgMaterialsAction" scope="request">
    <html:rewrite action="/W2020PkgMaterials"></html:rewrite>
</c:set>
<c:set var="registerAction" scope="request">
    <html:rewrite action="/W2020Register"></html:rewrite>
</c:set>
<c:set var="printCmlAction" scope="request">
    <html:rewrite action="/W2020PrintCml"></html:rewrite>
</c:set>
<c:set var="clearAction" scope="request">
    <html:rewrite action="/W2020Clear"></html:rewrite>
</c:set>
<html:form action="/W2020Init" styleId="mainForm">
    <%--
    -- Section 1
    --%>
    <table class="grid">
        <colgroup>
            <col class="col2_header" />
            <col class="col2_contents" />
            <col class="col2_header" />
            <col class="last_col" />
        </colgroup>
        <tr>
            <th class="right">
                <bean:message key="label.shipperCd" />
            </th>
            <td colspan="3">
                <html:text property="w2020CriteriaDomain.shipperCd" maxlength="3" styleClass="shipper_cd gscm_required" errorStyleClass="shipper_cd gscm_error_class" />
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.customerCd" />
            </th>
            <td>
                <html:text property="w2020CriteriaDomain.customerCd" styleId="customer_cd" maxlength="8" styleClass="customer_cd gscm_required" errorStyleClass="customer_cd gscm_error_class" />
            </td>
            <th class="right">
                <bean:message key="label.lgcyShipTo" />
            </th>
            <td>
                <html:text property="w2020CriteriaDomain.lgcyShipTo" styleId="lgcy_ship_to" maxlength="2" styleClass="lgcy_ship_to gscm_required" errorStyleClass="lgcy_ship_to gscm_error_class" />
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.trnsCd" />
            </th>
            <td colspan="3">
                <html:select property="w2020CriteriaDomain.trnsCd" styleId="trns_cd" styleClass="trns_cd gscm_required" errorStyleClass="trns_cd gscm_error_class">
                    <html:options collection="trnsCd" property="id" labelProperty="name" />
                </html:select>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.plntCd" />
            </th>
            <td>
                <html:text property="w2020CriteriaDomain.plntCd" styleId="plnt_cd" maxlength="2" styleClass="plnt_cd gscm_required" errorStyleClass="plnt_cd gscm_error_class" />
            </td>
            <th class="right">
                <bean:message key="label.lgcyWhCd" />
            </th>
            <td>
                <html:text property="w2020CriteriaDomain.lgcyWhCd" styleId="lgcy_wh_cd" maxlength="1" styleClass="lgcy_wh_cd gscm_required" errorStyleClass="lgcy_wh_cd gscm_error_class" />
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.pltzItemNo" />
            </th>
            <td>
                <html:text property="w2020CriteriaDomain.pltzItemNo" styleId="pltz_item_no" maxlength="27" styleClass="pltz_item_no gscm_required" errorStyleClass="pltz_item_no gscm_error_class" />
            </td>
            <th class="right">
                <bean:message key="label.itemDescription" />
            </th>
            <td>
                <html:text property="w2020CriteriaDomain.itemDescription" styleId="item_description" styleClass="item_description gscm_disptext" readonly="true" />
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.pkgCd" />
            </th>
            <td>
                <html:text property="w2020CriteriaDomain.pkgCd" styleId="pkg_cd" maxlength="3" styleClass="pkg_cd" errorStyleClass="pkg_cd gscm_error_class" />
            </td>
            <th class="right">
                <bean:message key="label.palletCartonTyp" />
            </th>
            <td>
                <html:select property="w2020CriteriaDomain.palletCartonTyp" styleId="pallet_carton_typ" styleClass="pallet_carton_typ gscm_required" errorStyleClass="pallet_carton_typ gscm_error_class">
                    <html:options collection="palletCartonTyp" property="id" labelProperty="name" />
                </html:select>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.customerPoNo" />
            </th>
            <td colspan="3">
                <html:text property="w2020CriteriaDomain.customerPoNo" styleId="customer_po_no" maxlength="20" styleClass="customer_po_no" errorStyleClass="customer_po_no gscm_error_class" />
            </td>
        </tr>
        <tr>
            <th class="right" style="line-height:10px;">
                <bean:message key="label.manualRegFlg" />
            </th>
            <td colspan="3">
                <html:checkbox property="w2020CriteriaDomain.manualRegFlg" styleId="manual_reg_flg" value="Y" />
                <html:hidden property="w2020CriteriaDomain.manualRegFlgHidden" styleId="manual_reg_flg_hidden" />
                <%-- debug/デバッグ
                <bean:write name="W2020Form" property="w2020CriteriaDomain.manualRegFlg" />
                --%>
            </td>
        </tr>
    </table>
    <%--
    -- Buttons 1
    --%>
    <table class="gscm_search_button">
        <tr>
            <td class="right">
                <html:button property="search" onclick="gscm.commonSubmit('${searchAction}', this.form);" styleClass="search">
                    <bean:message key="button.search" />
                </html:button>
            </td>
        </tr>
    </table>
    <%--
    -- Section 2
    --%>
    <table class="grid">
        <colgroup>
            <col class="col2_header" />
            <col class="col3_contents" />
            <col class="col3_header" />
            <col class="col3_contents" />
            <col class="col3_header" />
            <col class="last_col" />
        </colgroup>
        <tr>
            <th class="right">
                <bean:message key="label.containerSortingKey" />
            </th>
            <td>
                <bean:write name="W2020Form" property="w2020CriteriaDomain.containerSortingKey" />
            </td>
            <th class="right">
                <bean:message key="label.loadingCd" />
            </th>
            <td>
                <bean:write name="W2020Form" property="w2020CriteriaDomain.loadingCd" />
            </td>
            <th class="right">
                <bean:message key="label.containerLooseTyp" />
            </th>
            <td>
                <bean:write name="W2020Form" property="w2020CriteriaDomain.containerLooseTyp" />
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.invoiceKey" />
            </th>
            <td>
                <bean:write name="W2020Form" property="w2020CriteriaDomain.invoiceKey" />
            </td>
            <th class="right">
                <bean:message key="label.stgInstrItemFlg" />
            </th>
            <td>
                <bean:write name="W2020Form" property="w2020CriteriaDomain.stgInstrItemFlg" />
            </td>
            <th class="right">
                <bean:message key="label.customTimingTyp" />
            </th>
            <td>
                <bean:write name="W2020Form" property="w2020CriteriaDomain.customTimingTyp" />
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.pkgFormTyp" />
            </th>
            <td>
                <bean:write name="W2020Form" property="w2020CriteriaDomain.pkgFormTyp" />
            </td>
            <th class="right">
                <bean:message key="label.coFlg" />
            </th>
            <td>
                <bean:write name="W2020Form" property="w2020CriteriaDomain.coFlg" />
            </td>
            <th class="right">
                <bean:message key="label.rtUseFlg" />
            </th>
            <td>
                <bean:write name="W2020Form" property="w2020CriteriaDomain.rtUseFlg" />
            </td>
        </tr>
    </table>
    <%--
    -- Section 3
    --%>
    <table class="grid" style="margin-top:0">
        <colgroup>
            <col class="col2_header" />
            <col class="col4_contents" />
            <col class="col4_header" />
            <col class="col4_contents" />
            <col class="col4_header" />
            <col class="col4_contents" />
            <col class="col4_header" />
            <col class="last_col" />
        </colgroup>
        <tr>
            <th class="right">
                <bean:message key="label.shippingLot" />
            </th>
            <td>
                <logic:equal name="W2020Form" property="w2020CriteriaDomain.manualRegFlg" value="Y">
                    <html:text property="w2020CriteriaDomain.shippingLot" styleId="shipping_lot" maxlength="7" styleClass="shipping_lot right gscm_required" errorStyleClass="shipping_lot right gscm_error_class" />
                </logic:equal>
                <logic:notEqual name="W2020Form" property="w2020CriteriaDomain.manualRegFlg" value="Y">
                    <bean:write name="W2020Form" property="w2020CriteriaDomain.shippingLot" />
                    <html:hidden property="w2020CriteriaDomain.shippingLot" styleId="shipping_lot" /><%-- for auto calc. --%>
                </logic:notEqual>
            </td>
            <th class="right">
                <bean:message key="label.cmlQty" />
            </th>
            <td colspan="5">
                <html:text property="w2020CriteriaDomain.cmlQty" styleId="cml_qty" maxlength="2" styleClass="pallet_qty right gscm_required" errorStyleClass="pallet_qty right gscm_error_class" />
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.totalQty" />
                <span class="auto_calc">(<bean:message key="label.messageVolume" />)</span>
            </th>
            <td>
                <span class="total_qty_disp"><bean:write name="W2020Form" property="w2020CriteriaDomain.totalQty" /></span>
                <html:hidden property="w2020CriteriaDomain.totalQty" styleId="total_qty" />
            </td>
            <th class="right">
                <bean:message key="label.orderQty" />
            </th>
            <td>
                <bean:write name="W2020Form" property="w2020CriteriaDomain.orderQty" />
            </td>
            <th class="right">
                <bean:message key="label.onHandQty" />
            </th>
            <td>
                <bean:write name="W2020Form" property="w2020CriteriaDomain.onHandQty" />
            </td>
            <th class="right">
                <bean:message key="label.boQty" />
            </th>
            <td>
                <bean:write name="W2020Form" property="w2020CriteriaDomain.boQty" />
            </td>
        </tr>
    </table>
    <%--
    -- Section 4
    --%>
    <bean:message key="label.messagePallet" />
    <table class="grid" style="margin-top:0">
        <colgroup>
            <col class="col2_header" />
            <col class="col3_contents" />
            <col class="col3_header" />
            <col class="col3_contents" />
            <col class="col3_header" />
            <col class="last_col" />
        </colgroup>
        <tr>
            <th class="right">
                <bean:message key="label.length" />
            </th>
            <td>
                <logic:equal name="W2020Form" property="w2020CriteriaDomain.manualRegFlg" value="Y">
                    <html:text property="w2020CriteriaDomain.length" styleId="length" maxlength="8" styleClass="length right gscm_required" errorStyleClass="length right gscm_error_class" />
                </logic:equal>
                <logic:notEqual name="W2020Form" property="w2020CriteriaDomain.manualRegFlg" value="Y">
                    <bean:write name="W2020Form" property="w2020CriteriaDomain.length" />
                </logic:notEqual>
                <bean:write name="W2020Form" property="w2020CriteriaDomain.shipperLengthUnitDisp" />
            </td>
            <th class="right">
                <bean:message key="label.width" />
            </th>
            <td>
                <logic:equal name="W2020Form" property="w2020CriteriaDomain.manualRegFlg" value="Y">
                    <html:text property="w2020CriteriaDomain.width" styleId="width" maxlength="8" styleClass="width right gscm_required" errorStyleClass="width right gscm_error_class" />
                </logic:equal>
                <logic:notEqual name="W2020Form" property="w2020CriteriaDomain.manualRegFlg" value="Y">
                    <bean:write name="W2020Form" property="w2020CriteriaDomain.width" />
                </logic:notEqual>
                <bean:write name="W2020Form" property="w2020CriteriaDomain.shipperLengthUnitDisp" />
            </td>
            <th class="right">
                <bean:message key="label.height" />
            </th>
            <td>
                <logic:equal name="W2020Form" property="w2020CriteriaDomain.manualRegFlg" value="Y">
                    <html:text property="w2020CriteriaDomain.height" styleId="height" maxlength="8" styleClass="height right gscm_required" errorStyleClass="height right gscm_error_class" />
                </logic:equal>
                <logic:notEqual name="W2020Form" property="w2020CriteriaDomain.manualRegFlg" value="Y">
                    <bean:write name="W2020Form" property="w2020CriteriaDomain.height" />
                </logic:notEqual>
                <bean:write name="W2020Form" property="w2020CriteriaDomain.shipperLengthUnitDisp" />
            </td>
        </tr>
        <tr>
            <th class="right" style="line-height:10px;">
                <bean:message key="label.volume" />
                <logic:equal name="W2020Form" property="w2020CriteriaDomain.manualRegFlg" value="Y">
                    <span class="auto_calc">(<bean:message key="label.messageVolume" />)</span>
                </logic:equal>
            </th>
            <td nowrap>
                <span class="volume_disp"><bean:write name="W2020Form" property="w2020CriteriaDomain.volume" /></span>
                <bean:write name="W2020Form" property="w2020CriteriaDomain.shipperVolumeUnitDisp" />
                <html:hidden property="w2020CriteriaDomain.volume" styleId="volume" />
            </td>
            <th class="right">
                <bean:message key="label.netWeight" />
                <logic:equal name="W2020Form" property="w2020CriteriaDomain.manualRegFlg" value="Y">
                    <span class="auto_calc">(<bean:message key="label.messageVolume" />)</span>
                </logic:equal>
            </th>
            <td>
                <span class="net_weight_disp"><bean:write name="W2020Form" property="w2020CriteriaDomain.netWeight" /></span>
                <bean:write name="W2020Form" property="w2020CriteriaDomain.shipperWeightUnitDisp" />
                <html:hidden property="w2020CriteriaDomain.itemWeight" styleId="item_weight" /><%-- シッパー単位。丸めなし。 --%>
                <html:hidden property="w2020CriteriaDomain.netWeight" styleId="net_weight" />
            </td>
            <th class="right">
                <bean:message key="label.grossWeight" />
            </th>
            <td>
                <logic:equal name="W2020Form" property="w2020CriteriaDomain.manualRegFlg" value="Y">
                    <html:text property="w2020CriteriaDomain.grossWeight" styleId="gross_weight" maxlength="11" styleClass="gross_weight right gscm_required" errorStyleClass="gross_weight right gscm_error_class" />
                </logic:equal>
                <logic:notEqual name="W2020Form" property="w2020CriteriaDomain.manualRegFlg" value="Y">
                    <bean:write name="W2020Form" property="w2020CriteriaDomain.grossWeight" />
                </logic:notEqual>
                <bean:write name="W2020Form" property="w2020CriteriaDomain.shipperWeightUnitDisp" />
            </td>
        </tr>
    </table>
    <br />
    <%--
    -- Section 5
    --%>
    <table class="grid">
        <colgroup>
            <col class="col2_header" />
            <col class="col2_contents" />
            <col class="col2_header" />
            <col class="last_col" />
        </colgroup>
        <tr>
            <th class="right">
                <bean:message key="label.fromMainMark" />
            </th>
            <td colspan="3">
                <bean:write name="W2020Form" property="w2020CriteriaDomain.fromMainMark" />
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.toMainMark" />
            </th>
            <td colspan="3">
                <bean:write name="W2020Form" property="w2020CriteriaDomain.toMainMark" />
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.expPackingDt" />
            </th>
            <td>
                <bean:write name="W2020Form" property="w2020CriteriaDomain.expPackingDt" />
            </td>
            <th class="right">
                <bean:message key="label.expPackingIssuerNm" />
            </th>
            <td>
                <html:text property="w2020CriteriaDomain.expPackingIssuerNm" styleId="exp_packing_issuer_nm" styleClass="exp_packing_issuer_nm gscm_disptext" readonly="true" />
            </td>
        </tr>
    </table>
    <%--
    -- Buttons 2
    --%>
    <table class="gscm_search_button">
        <colgroup>
            <col class="col_button1" />
            <col class="col_button2" />
        </colgroup>
        <tr>
            <td class="right">
                <html:button property="pkgMaterials" onclick="gscm.commonSubmit('${pkgMaterialsAction}', this.form);" styleClass="pkg_materials">
                    <bean:message key="button.pkgMaterials" />
                </html:button>
                <html:button property="register" onclick="calcAll();gscm.submitCreateConfirm('${registerAction}', this.form);" styleClass="register">
                    <bean:message key="button.register" />
                </html:button>
                <html:button property="printCml" onclick="clearMessage();gscm.commonSubmitForCheck('${printCmlAction}', this.form, 'false', 'false');" styleClass="print_cml">
                    <bean:message key="button.printCml" />
                </html:button>
            </td>
            <td class="right">
                <html:button property="clear" onclick="gscm.commonSubmitForCheck('${clearAction}', this.form, 'false', 'false');" styleClass="edit_header">
                    <bean:message key="button.editHeader" />
                </html:button>
            </td>
        </tr>
    </table>
</html:form>

