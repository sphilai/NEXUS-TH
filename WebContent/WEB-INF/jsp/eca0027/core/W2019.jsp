<%--
 * W2019.jsp
 * 
 * CML Trans Revise 画面のJSPです。
 * 
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 --%>
<html:form action="/W2019Init" styleId="mainForm">
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
            <col class="search_main_mark" />
            <col class="search_pkg_form_typ" />
            <col class="search_original_outer_pkg_cd" />
            <%-- <col class="search_revise_flg" /> UT420 DEL --%>
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
                <bean:message key="label.mainMark" />
            </th>
            <th>
                <bean:message key="label.pkgFormTyp" />
            </th>
            <th>
                <bean:message key="label.originalOuterPkgCd" />
            </th>
            <%--  UT420 DEL
            <th>
                <bean:message key="label.changeTransToAir" />
            </th>
            --%>
        </tr>
        <tr>
            <td>
                <html:text property="w2019CriteriaDomain.shipperCd" styleClass="shipper_cd gscm_disptext" readonly="true" styleId="shipeerCd" />
            </td>
            <td>
                <bean:write name="W2019Form" property="w2019CriteriaDomain.customerCd" />
            </td>
            <td>
                <bean:write name="W2019Form" property="w2019CriteriaDomain.lgcyShipTo" />
            </td>
            <td>
                <html:text property="w2019CriteriaDomain.trnsCd" styleClass="w2019_trns_cd gscm_disptext" readonly="true"/>
            </td>
            <td>
                <bean:write name="W2019Form" property="w2019CriteriaDomain.plntCd" />
            </td>
            <td>
                <bean:write name="W2019Form" property="w2019CriteriaDomain.lgcyWhCd" />
            </td>
            <td>
                <html:text property="w2019CriteriaDomain.mainMark" styleClass="w2019_main_mark gscm_disptext" readonly="true"/>
            </td>
            <td>
            <%-- UT110 TRIAL SHIPMENT/号試品対応 MOD START --%>
            <logic:notEqual name="W2019Form" property="w2019CriteriaDomain.manualRegFlg" value="Y">
                <bean:write name="W2019Form" property="w2019CriteriaDomain.pkgFormTyp" />
            </logic:notEqual>
            </td>
            <td>
                <html:text property="w2019CriteriaDomain.originalOuterPkgCd" styleClass="original_outer_pkg_cd gscm_disptext" readonly="true" styleId="originalOuterPkgCd" />
            </td>
            <%-- UT420 DEL
            <td>
                <html:select property="w2019CriteriaDomain.reviseFlg" styleClass="revise_flg gscm_required" errorStyle="revise_flg gscm_required gscm_error_class" onchange="changeTransToAir();">
                    <html:options collection="flag" property="id" labelProperty="name" />
                </html:select>
                <bean:define id="orgReviseFlg" name="W2019Form" property="w2019CriteriaDomain.reviseFlg"/>
                <input type="hidden" id="orgReviseFlg" value="${orgReviseFlg}" />
            </td>
            --%>
        </tr>
    </table>
    <%--
    -- search condition 2
    --%>
    <table class="gscm_search">
        <colgroup>
            <col class="search_outer_pkg_cd" />
            <col class="search_packaging_confirmed_flg" />
            <%-- UT110 TRIAL SHIPMENT/号試品対応 MOD START --%>
            <logic:equal name="W2019Form" property="w2019CriteriaDomain.manualRegFlg" value="Y">
                <col class="search_manual_length" />
                <col class="search_manual_width" />
                <col class="search_manual_height" />
                <col class="search_manual_volume" />
                <col class="search_manual_net_weight" />
                <col class="search_manual_gross_weight" />
            </logic:equal>
            <logic:equal name="W2019Form" property="w2019CriteriaDomain.manualRegFlg" value="N">
                <col class="search_volume" />
                <col class="search_net_weight" />
                <col class="search_gross_weight" />
            </logic:equal>
            <%-- UT110 TRIAL SHIPMENT/号試品対応 MOD END --%>
        </colgroup>
        <tr>
            <th>
                <bean:message key="label.changeOuterCd" />
            </th>
            <th>
                <bean:message key="label.packagingConfirmedFlg" />
            </th>
            <%-- UT110 TRIAL SHIPMENT/号試品対応 MOD START --%>
            <logic:equal name="W2019Form" property="w2019CriteriaDomain.manualRegFlg" value="Y">
                <th>
                    <bean:message key="label.length" />
                </th>
                <th>
                    <bean:message key="label.width" />
                </th>
                <th>
                    <bean:message key="label.height" />
                </th>
                <th>
                    <bean:message key="label.volume" />(<bean:message key="label.messageVolume" />)
                </th>
                <th>
                    <bean:message key="label.netWeight" />
                </th>
                <th>
                    <bean:message key="label.grossWeight" />
                </th>
            </logic:equal>
            <logic:equal name="W2019Form" property="w2019CriteriaDomain.manualRegFlg" value="N">
                <th>
                    <bean:message key="label.volume" />
                </th>
                <th>
                    <bean:message key="label.netWeight" />
                </th>
                <th>
                    <bean:message key="label.grossWeight" />
                </th>
            </logic:equal>
            <%-- UT110 TRIAL SHIPMENT/号試品対応 MOD END --%>
        </tr>
        <tr class="${(W2019Form.w2019CriteriaDomain.manualRegFlg eq 'Y')? 'thin' : ''}"> <%-- UT420 MOD --%>
            <td>
                <html:text property="w2019CriteriaDomain.outerPkgCd" maxlength="5" styleClass="outer_pkg_cd" errorStyleClass="outer_pkg_cd gscm_error_class" readonly="true" tabindex="-1" styleId="outerPkgCd"/>
                <html:button property="select" styleClass="select" onclick="setOuterPkgCd();">
                    <bean:message key="button.select" />
                </html:button>
                <html:button property="clear" styleClass="clear" onclick="clearOuterPkg();">
                    <bean:message key="button.clear" />
                </html:button>
            </td>
            <td>
                <html:text property="w2019CriteriaDomain.packagingConfirmedFlg" styleClass="packaging_confirmed_flg gscm_disptext" readonly="true"/>
            </td>
            <%-- UT110 TRIAL SHIPMENT/号試品対応 MOD START --%>
            <logic:equal name="W2019Form" property="w2019CriteriaDomain.manualRegFlg" value="Y">
                <td>
                    <html:text property="w2019CriteriaDomain.length" maxlength="8" styleId="length" styleClass="length right gscm_required" errorStyleClass="length right gscm_error_class" />
                </td>
                <td>
                    <html:text property="w2019CriteriaDomain.width" maxlength="8" styleId="width" styleClass="width right gscm_required" errorStyleClass="width right gscm_error_class" />
                </td>
                <td>
                    <html:text property="w2019CriteriaDomain.height" maxlength="8" styleId="height" styleClass="height right gscm_required" errorStyleClass="height right gscm_error_class" />
                </td>
                <td>
                    <%--
                    <html:text property="w2019CriteriaDomain.volume" maxlength="16" styleClass="volume right gscm_required" errorStyleClass="volume right gscm_error_class" />
                    --%>
                    <span class="volume_disp"><bean:write name="W2019Form" property="w2019CriteriaDomain.volume" /></span>
                    <html:hidden property="w2019CriteriaDomain.volume" styleId="volume" />
                </td>
                <td>
                    <%--
                    <html:text property="w2019CriteriaDomain.netWeight" maxlength="11" styleClass="net_weight right gscm_required" errorStyleClass="net_weight right gscm_error_class" />
                    --%>
                    <bean:write name="W2019Form" property="w2019CriteriaDomain.netWeight" />
                    <html:hidden property="w2019CriteriaDomain.netWeight" />
                </td>
                <td>
                    <html:text property="w2019CriteriaDomain.grossWeight" maxlength="11" styleClass="gross_weight right gscm_required" errorStyleClass="gross_weight right gscm_error_class" />
                </td>
            </logic:equal>
            <logic:equal name="W2019Form" property="w2019CriteriaDomain.manualRegFlg" value="N">
                <td style="white-space:nowrap">
                    <html:text property="w2019CriteriaDomain.volume" styleClass="volume gscm_disptext" readonly="true" styleId="volume" /><html:text property="w2019CriteriaDomain.volumeUnit" styleClass="w2019_volume_unit gscm_disptext" readonly="true" styleId="volumeUnit" />
                </td>
                <td style="white-space:nowrap">
                    <html:text property="w2019CriteriaDomain.netWeight" styleClass="net_weight gscm_disptext" readonly="true" styleId="netWeight" /><html:text property="w2019CriteriaDomain.weightUnit" styleClass="w2019_weight_unit gscm_disptext" readonly="true" styleId="netWeightUnit"/>
                </td>
                <td style="white-space:nowrap">
                    <html:text property="w2019CriteriaDomain.grossWeight" styleClass="gross_weight gscm_disptext" readonly="true" styleId="grossWeight" /><html:text property="w2019CriteriaDomain.weightUnit" styleClass="w2019_weight_unit gscm_disptext" readonly="true" styleId="grossWeightUnit"/>
                </td>
            </logic:equal>
            <%-- UT110 TRIAL SHIPMENT/号試品対応 MOD END --%>
        </tr>
        <%-- UT110 TRIAL SHIPMENT/号試品対応 ADD START --%>
        <logic:equal name="W2019Form" property="w2019CriteriaDomain.manualRegFlg" value="Y">
            <tr class="thin">
                <td>
                </td>
                <td>
                </td>
                <td>
                    (<bean:write name="W2019Form" property="w2019CriteriaDomain.lengthUnit" />)
                </td>
                <td>
                    (<bean:write name="W2019Form" property="w2019CriteriaDomain.lengthUnit" />)
                </td>
                <td>
                    (<bean:write name="W2019Form" property="w2019CriteriaDomain.lengthUnit" />)
                </td>
                <td>
                    (<bean:write name="W2019Form" property="w2019CriteriaDomain.volumeUnit" />)
                </td>
                <td>
                    (<bean:write name="W2019Form" property="w2019CriteriaDomain.weightUnit" />)
                </td>
                <td>
                    (<bean:write name="W2019Form" property="w2019CriteriaDomain.weightUnit" />)
                </td>
            </tr>
        </logic:equal>
        <%-- UT110 TRIAL SHIPMENT/号試品対応 ADD END --%>
    </table>
    <%--
    -- search condition 3
    --%>
    <%-- UT420 ADD START --%>
    <table class="gscm_search">
        <colgroup>
            <col class="search_pallet_carton_typ" />
            <col class="search_revise_flg" />
        </colgroup>
        <tr class="${(W2019Form.w2019CriteriaDomain.manualRegFlg eq 'Y')? 'thin' : ''}">
            <th>
                <bean:message key="label.palletCartonTyp" />
            </th>
            <th>
                <bean:message key="label.changeTransToAir" />
            </th>
        </tr>
        <tr>
            <td>
                <html:select property="w2019CriteriaDomain.palletCartonTyp" styleClass="pallet_carton_typ gscm_required" errorStyleClass="pallet_carton_typ gscm_error_class">
                    <html:options collection="palletCartonTyp" property="id" labelProperty="name" />
                </html:select>
            </td>
            <td>
                <html:select property="w2019CriteriaDomain.reviseFlg" styleClass="revise_flg gscm_required" errorStyle="revise_flg gscm_required gscm_error_class" onchange="changeTransToAir();">
                    <html:options collection="flag" property="id" labelProperty="name" />
                </html:select>
                <bean:define id="orgReviseFlg" name="W2019Form" property="w2019CriteriaDomain.reviseFlg"/>
                <input type="hidden" id="orgReviseFlg" value="${orgReviseFlg}" />
            </td>
        </tr>
    </table>
    <%-- UT420 ADD END --%>
    <%--
    -- buttons 1
    --%>
    <table class="gscm_search_button">
        <colgroup>
            <col />
        </colgroup>
        <tr>
            <td>
                <html:button property="pkgMaterials" styleClass="pkg_materials" onclick="gscm.commonSubmit('W2019PkgMaterials.do', this.form);">
                    <bean:message key="button.pkgMaterials" />
                </html:button>
                <html:button property="backToMainScreen" styleClass="back_to_main_screen" onclick="confirmSubmiBackToMainScreen('W2009Init.do', this.form);">
                    <bean:message key="button.backToMainScreen" />
                </html:button>
            </td>
        </tr>
    </table>
    <hr />
    <logic:notEmpty name="W2019Form" property="listDomainList">
    <%--
    -- buttons 2
    --%>
    <table class="gscm_resultlist_button">
        <colgroup>
            <col />
        </colgroup>
        <tr>
            <td>
                <bean:define id="registerConfirmMessage"><bean:message key="GSCM-I0-0004"/></bean:define>
                <%-- 2016/1/11 MOD START --%>
                <logic:equal name="W2019Form" property="w2019CriteriaDomain.manualRegFlg" value="Y">
                    <html:button property="register" styleClass="register" onclick="calcVolume();gscm.submitConfirm('W2019Register.do', this.form, '${registerConfirmMessage}');">
                        <bean:message key="button.register" />
                    </html:button>
                </logic:equal>
                <logic:equal name="W2019Form" property="w2019CriteriaDomain.manualRegFlg" value="N">
                    <html:button property="register" styleClass="register" onclick="gscm.submitConfirm('W2019Register.do', this.form, '${registerConfirmMessage}');">
                        <bean:message key="button.register" />
                    </html:button>
                </logic:equal>
                <%-- 2016/1/11 MOD END --%>
                <html:button property="printCml" styleClass="print_cml" onclick="gscm.commonSubmitForCheck('W2019PrintCml.do', this.form, 'false', 'false');">
                    <bean:message key="button.printCml" />
                </html:button>
            </td>
        </tr>
    </table>
    <%--
    -- search results
    --%>
    <table id="tablefix" class="gscm_resultlist">
        <colgroup>
            <col class="resultlist_kit_par_item_no" />
            <col class="resultlist_pkg_cd" />
            <col class="resultlist_item_description" />
            <col class="resultlist_shipping_lot" />
            <col class="resultlist_instr_qty" />
            <col class="resultlist_qty" />
            <col class="resultlist_tag_qty" />
        </colgroup>
        <tr>
            <th>
                <bean:message key="label.kitParItemNo" />
            </th>
            <th>
                <bean:message key="label.pkgCd" />
            </th>
            <th>
                <bean:message key="label.itemDescription" />
            </th>
            <th>
                <bean:message key="label.shippingLot" />
            </th>
            <th>
                <bean:message key="label.instrQty" />
            </th>
            <th>
                <bean:message key="label.actualPkgQty" />
            </th>
            <th>
                <bean:message key="label.tagQty" />
            </th>
        </tr>
        <logic:iterate name="W2019Form" property="listDomainList" id="listDomainList" indexId="idx">
            <ai:stripeline number="${idx + 1}" odd="gscm_odd" even="gscm_even">
                <tr>
                    <td>
                        <html:text name="listDomainList" property="pltzItemNo" indexed="true" styleClass="w2019_pltz_item_no_disptext gscm_disptext" readonly="true" />
                    </td>
                    <td>
                        <bean:write name="listDomainList" property="pkgCd" />
                    </td>
                    <td>
                        <html:text name="listDomainList" property="itemDescription" indexed="true" styleClass="w2019_item_description_disptext gscm_disptext" readonly="true" />
                    </td>
                    <td class="right">
                        <bean:write name="listDomainList" property="shippingLot" />
                    </td>
                    <td class="right">
                        <bean:write name="listDomainList" property="instrQty" />
                    </td>
                    <td class="right">
                        <bean:write name="listDomainList" property="qty" />
                    </td>
                    <td class="right">
                        <bean:write name="listDomainList" property="tagQty" />
                    </td>
                </tr>
            </ai:stripeline>
        </logic:iterate>
    </table>
    </logic:notEmpty>
    <%--
    -- hidden
    --%>
    <html:hidden property="w2019CriteriaDomain.comUpdateTimestamp" />
    <html:hidden property="w2019CriteriaDomain.originalScreenId" />
    <html:hidden property="callScreenId" />
</html:form>
