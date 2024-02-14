<%--
 * W2012.jsp
 * 
 * CML Register 画面のJSPです。
 * 
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 --%>
<html:form action="/W2012Init" styleId="mainForm">
    <%--
    -- search condition 1
    --%>
    <table class="gscm_search">
        <colgroup>
            <col class="seatch_shipper_cd" /> 
            <col class="seatch_customer_cd" />
            <col class="seatch_lgcy_ship_to" />
            <col class="seatch_trns_cd" />
            <col class="seatch_plnt_cd" />
            <col class="seatch_lgcy_wh_cd" />
            <col class="seatch_pltz_instr_no" />
            <col class="seatch_packing_wh_comp_cd" />
            <col class="seatch_packing_wh_cd" />
            <col class="seatch_exp_packing_dt" />
            <col class="seatch_exp_packing_issuer_nm" />
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
                <bean:message key="label.expPackingDt" />
            </th>
            <th>
                <bean:message key="label.expPackingIssuerNm" />
            </th>
        </tr>
        <tr>
            <td>
                <html:text property="w2012CriteriaDomain.shipperCd" styleClass="shipper_cd gscm_disptext" errorStyleClass="shipper_cd gscm_disptext gscm_error_class" readonly="true"/>
            </td>
            <td>
                <html:text property="w2012CriteriaDomain.customerCd" styleClass="customer_cd gscm_disptext" errorStyleClass="customer_cd gscm_disptext gscm_error_class" readonly="true"/>
            </td>
            <td>
                <html:text property="w2012CriteriaDomain.lgcyShipTo" styleClass="lgcy_ship_to gscm_disptext" errorStyleClass="lgcy_ship_to gscm_disptext gscm_error_class" readonly="true"/>
            </td>
            <td>
                <bean:write name="W2012Form" property="w2012CriteriaDomain.trnsCd" />
            </td>
            <td>
                <html:text property="w2012CriteriaDomain.plntCd" styleClass="plnt_cd gscm_disptext" errorStyleClass="plnt_cd gscm_disptext gscm_error_class" readonly="true"/>
            </td>
            <td>
                <html:text property="w2012CriteriaDomain.lgcyWhCd" styleClass="lgcy_wh_cd gscm_disptext" errorStyleClass="lgcy_wh_cd gscm_disptext gscm_error_class" readonly="true"/>
            </td>
            <td>
                <bean:write name="W2012Form" property="w2012CriteriaDomain.pltzInstrNo" />
            </td>
            <td>
                <html:text property="w2012CriteriaDomain.packingWhCompCd" styleClass="packing_wh_comp_cd gscm_disptext" errorStyleClass="packing_wh_comp_cd gscm_disptext gscm_error_class" readonly="true"/>
            </td>
            <td>
                <html:text property="w2012CriteriaDomain.packingWhCd" styleClass="packing_wh_cd gscm_disptext" errorStyleClass="packing_wh_cd gscm_disptext gscm_error_class" readonly="true"/>
            </td>
            <td>
                <bean:write name="W2012Form" property="w2012CriteriaDomain.expPackingDt" />
            </td>
            <td>
                <html:text property="w2012CriteriaDomain.expPackingIssuerNm" styleClass="exp_packing_issuer_nm gscm_disptext" errorStyleClass="exp_packing_issuer_nm gscm_disptext gscm_error_class" readonly="true"/>
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
            <col class="search_pkg_form_typ" />
            <col class="search_invoice_key" />
            <col class="search_stg_instr_item_flg" />
            <col class="search_custom_timing_typ" />
            <col class="search_rt_use_flg" />
            <col class="search_pallet_no" />
            <col class="search_main_mark" />
        </colgroup>
        <tr>
            <th>
                <bean:message key="label.containerSortingKey" />
            </th>
            <th>
                <bean:message key="label.loadingCd" />
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
            <th>
                <bean:message key="label.rtUseFlg" />
            </th>
            <th>
                <bean:message key="label.palletNo" />
            </th>
            <th>
                <bean:message key="label.mainMark" />
            </th>
        </tr>
        <tr>
            <td>
                <bean:write name="W2012Form" property="w2012CriteriaDomain.containerSortingKey" />
            </td>
            <td>
                <bean:write name="W2012Form" property="w2012CriteriaDomain.loadingCd" />
            </td>
            <td>
            <%-- UT110 TRIAL SHIPMENT/号試品対応 MOD --%>
            <logic:notEqual name="W2012Form" property="w2012CriteriaDomain.manualRegFlg" value="Y">
                <html:text property="w2012CriteriaDomain.pkgFormTyp" styleClass="pkg_form_typ gscm_disptext" errorStyleClass="pkg_form_typ gscm_disptext gscm_error_class" readonly="true"/>
            </logic:notEqual>
            </td>
            <td>
                <bean:write name="W2012Form" property="w2012CriteriaDomain.invoiceKey" />
            </td>
            <td>
                <bean:write name="W2012Form" property="w2012CriteriaDomain.stgInstrItemFlg" />
            </td>
            <td>
                <bean:write name="W2012Form" property="w2012CriteriaDomain.customTimingTyp" />
            </td>
            <td>
                <bean:write name="W2012Form" property="w2012CriteriaDomain.rtUseFlg" />
            </td>
            <td>
                <bean:write name="W2012Form" property="w2012CriteriaDomain.palletNo" />
            </td>
            <td>
                <html:text property="w2012CriteriaDomain.mainMark" styleClass="main_mark gscm_disptext" errorStyleClass="main_mark gscm_disptext gscm_error_class" readonly="true"/>
            </td>
        </tr>
    </table>
    <%--
    -- Outer CD -
    --%>
    <table class="gscm_search">
        <colgroup>
            <col class="search_outer_pkg_cd" />
            <col class="search_packaging_confirmed_flg" />
            <%-- UT110 TRIAL SHIPMENT/号試品対応 MOD START --%>
            <logic:equal name="W2012Form" property="w2012CriteriaDomain.manualRegFlg" value="Y">
                <col class="search_manual_length" />
                <col class="search_manual_width" />
                <col class="search_manual_height" />
                <col class="search_manual_volume" />
                <col class="search_manual_net_weight" />
                <col class="search_manual_gross_weight" />
            </logic:equal>
            <logic:equal name="W2012Form" property="w2012CriteriaDomain.manualRegFlg" value="N">
                <col class="search_volume" />
                <col class="search_net_weight" />
                <col class="search_gross_weight" />
            </logic:equal>
            <%-- UT110 TRIAL SHIPMENT/号試品対応 MOD END --%>
            <col class="search_pallet_carton" /> <%-- UT420 ADD --%>
        </colgroup>
        <tr>
            <th>
                <bean:message key="label.outerPkgCd" />
            </th>
            <th>
                <bean:message key="label.packagingConfirmedFlg" />
            </th>
            <%-- UT110 TRIAL SHIPMENT/号試品対応 MOD START --%>
            <logic:equal name="W2012Form" property="w2012CriteriaDomain.manualRegFlg" value="Y">
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
            <logic:equal name="W2012Form" property="w2012CriteriaDomain.manualRegFlg" value="N">
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
            <%-- UT420 ADD --%>
            <th>
                <bean:message key="label.palletCartonTyp" />
            </th>
        </tr>
        <tr class="${(W2012Form.w2012CriteriaDomain.manualRegFlg eq 'Y')? 'thin' : ''}"> <%-- UT420 MOD --%>
            <td>
                <html:text property="w2012CriteriaDomain.outerPkgCd" maxlength="5" styleClass="outer_pkg_cd gscm_required" errorStyleClass="outer_pkg_cd gscm_error_class" readonly="true" onchange="changePkgConfirmFlg();" tabindex="-1" />
                <bean:define id="shipper" name="W2012Form" property="w2012CriteriaDomain.shipperCd" />
                <html:button property="select" onclick="setOuterPkgCd('${shipper}');" styleId="selectOuterPkgCdBtn">
                    <bean:message key="button.select" />
                </html:button>
            </td>
            <td>
                <html:text property="w2012CriteriaDomain.packagingConfirmedFlg" styleClass="packaging_confirmed_flg gscm_disptext" errorStyleClass="packaging_confirmed_flg gscm_disptext gscm_error_class" readonly="true"/>
            </td>
            <%-- UT110 TRIAL SHIPMENT/号試品対応 MOD START --%>
            <logic:equal name="W2012Form" property="w2012CriteriaDomain.manualRegFlg" value="Y">
                <logic:equal name="W2012Form" property="w2012CriteriaDomain.functionMode" value="1">
                    <td>
                        <html:text property="w2012CriteriaDomain.length" maxlength="8" styleId="length" styleClass="length right gscm_required" errorStyleClass="length right gscm_error_class" />
                    </td>
                    <td>
                        <html:text property="w2012CriteriaDomain.width" maxlength="8" styleId="width" styleClass="width right gscm_required" errorStyleClass="width right gscm_error_class" />
                    </td>
                    <td>
                        <html:text property="w2012CriteriaDomain.height" maxlength="8" styleId="height" styleClass="height right gscm_required" errorStyleClass="height right gscm_error_class" />
                    </td>
                    <td>
                        <%--
                        <html:text property="w2012CriteriaDomain.volume" maxlength="16" styleClass="volume right gscm_required" errorStyleClass="volume right gscm_error_class" />
                        --%>
                        <span class="volume_disp"><bean:write name="W2012Form" property="w2012CriteriaDomain.volume" /></span>
                        <html:hidden property="w2012CriteriaDomain.volume" styleId="volume" />
                    </td>
                    <td>
                        <%--
                        <html:text property="w2012CriteriaDomain.netWeight" maxlength="11" styleClass="net_weight right gscm_required" errorStyleClass="net_weight right gscm_error_class" />
                        --%>
                        <bean:write name="W2012Form" property="w2012CriteriaDomain.netWeight" />
                        <html:hidden property="w2012CriteriaDomain.netWeight" />
                    </td>
                    <td>
                        <html:text property="w2012CriteriaDomain.grossWeight" maxlength="11" styleClass="gross_weight right gscm_required" errorStyleClass="gross_weight right gscm_error_class" />
                    </td>
                </logic:equal>
                <logic:notEqual name="W2012Form" property="w2012CriteriaDomain.functionMode" value="1">
                    <td>
                        <bean:write name="W2012Form" property="w2012CriteriaDomain.length" />
                    </td>
                    <td>
                        <bean:write name="W2012Form" property="w2012CriteriaDomain.width" />
                    </td>
                    <td>
                        <bean:write name="W2012Form" property="w2012CriteriaDomain.height" />
                    </td>
                    <td>
                        <bean:write name="W2012Form" property="w2012CriteriaDomain.volume" />
                    </td>
                    <td>
                        <bean:write name="W2012Form" property="w2012CriteriaDomain.netWeight" />
                    </td>
                    <td>
                        <bean:write name="W2012Form" property="w2012CriteriaDomain.grossWeight" />
                    </td>
                </logic:notEqual>
            </logic:equal>
            <logic:equal name="W2012Form" property="w2012CriteriaDomain.manualRegFlg" value="N">
                <td style="white-space:nowrap">
                    <html:text property="w2012CriteriaDomain.volume" styleClass="volume gscm_disptext" readonly="true" styleId="volume" /><html:text property="w2012CriteriaDomain.volumeUnit" styleClass="volume_unit gscm_disptext" readonly="true" styleId="volumeUnit" />
                </td>
                <td style="white-space:nowrap">
                    <html:text property="w2012CriteriaDomain.netWeight" styleClass="net_weight gscm_disptext" readonly="true" styleId="netWeight" /><html:text property="w2012CriteriaDomain.weightUnit" styleClass="weight_unit gscm_disptext" readonly="true" styleId="netWeightUnit"/>
                </td>
                <td style="white-space:nowrap">
                    <html:text property="w2012CriteriaDomain.grossWeight" styleClass="gross_weight gscm_disptext" readonly="true" styleId="grossWeight" /><html:text property="w2012CriteriaDomain.weightUnit" styleClass="weight_unit gscm_disptext" readonly="true" styleId="grossWeightUnit"/>
                </td>
            </logic:equal>
            <%-- UT110 TRIAL SHIPMENT/号試品対応 MOD END --%>
            <%-- UT420 ADD START --%>
            <td>
                <html:text property="w2012CriteriaDomain.palletCartonTypName" styleClass="pallet_carton_typ gscm_disptext" errorStyleClass="pallet_carton_typ gscm_disptext gscm_error_class" readonly="true"/>
            </td>
            <%-- UT420 ADD END --%>
        </tr>
        <%-- UT110 TRIAL SHIPMENT/号試品対応 ADD START --%>
        <logic:equal name="W2012Form" property="w2012CriteriaDomain.manualRegFlg" value="Y">
            <tr class="thin">
                <td>
                </td>
                <td>
                </td>
                <td>
                    (<bean:write name="W2012Form" property="w2012CriteriaDomain.lengthUnit" />)
                </td>
                <td>
                    (<bean:write name="W2012Form" property="w2012CriteriaDomain.lengthUnit" />)
                </td>
                <td>
                    (<bean:write name="W2012Form" property="w2012CriteriaDomain.lengthUnit" />)
                </td>
                <td>
                    (<bean:write name="W2012Form" property="w2012CriteriaDomain.volumeUnit" />)
                </td>
                <td>
                    (<bean:write name="W2012Form" property="w2012CriteriaDomain.weightUnit" />)
                </td>
                <td>
                    (<bean:write name="W2012Form" property="w2012CriteriaDomain.weightUnit" />)
                </td>
                <td></td> <%-- UT420 ADD --%>
            </tr>
        </logic:equal>
        <%-- UT110 TRIAL SHIPMENT/号試品対応 ADD END --%>
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
                 <html:button property="backToCreate" styleClass="back_to_create" onclick="confirmAndMove(this.form, msg.dirtyMsg);">
                     <bean:message key="button.backToCreate" />
                 </html:button>
                <html:button property="pkgMaterials" styleClass="pkg_materials" onclick="gscm.commonSubmit('W2012PkgMaterials.do', this.form);">
                    <bean:message key="button.pkgMaterials" />
                </html:button>
                <c:if test="${W2012Form.w2012CriteriaDomain.functionMode eq 1}" >
                    <html:button property="backToMainScreen" styleClass="back_to_main_screen" onclick="submitBackConfirm('W2009Init.do', this.form, msg.dirtyMsg);">
                        <bean:message key="button.backToMainScreen" />
                    </html:button>
                </c:if>
                <c:if test="${W2012Form.w2012CriteriaDomain.functionMode ne 1}" >
                    <html:button property="backToMainScreen" styleClass="back_to_main_screen" onclick="gscm.submitBack('W2009Init.do', this.form );">
                        <bean:message key="button.backToMainScreen" />
                    </html:button>
                </c:if>
            </td>
        </tr>
    </table>
    <hr />
    <logic:notEmpty name="W2012Form" property="listDomainList">
    <%--
    -- buttons 2
    --%>
    <table class="gscm_resultlist_button">
        <colgroup>
            <col />
        </colgroup>
        <tr>
            <td>
                <html:button property="delete" styleClass="delete" onclick="gscm.submitDeleteConfirm('W2012Delete.do', this.form);">
                    <bean:message key="button.delete" />
                </html:button>
                <%-- 2016/1/11 MOD START --%>
                <logic:equal name="W2012Form" property="w2012CriteriaDomain.manualRegFlg" value="Y">
                    <html:button property="register" styleClass="register" onclick="calcVolume();gscm.submitCreateConfirm('W2012Register.do', this.form);">
                        <bean:message key="button.register" />
                    </html:button>
                </logic:equal>
                <logic:equal name="W2012Form" property="w2012CriteriaDomain.manualRegFlg" value="N">
                    <html:button property="register" styleClass="register" onclick="gscm.submitCreateConfirm('W2012Register.do', this.form);">
                        <bean:message key="button.register" />
                    </html:button>
                </logic:equal>
                <%-- 2016/1/11 MOD END --%>
                <html:checkbox property="w2012CriteriaDomain.ignoreWarnings" />
                <bean:message key="label.ignoreWarnings" />
                <html:button property="printCml"  styleClass="print_cml" onclick="clearMessage(); gscm.commonSubmitForCheck('W2012PrintCml.do', this.form, 'false', 'false');">
                    <bean:message key="button.printCml" />
                </html:button>
                <bean:define id="cancelConfirmMessage"><bean:message key="NXS-I1-0009"/></bean:define>
                <html:button property="cancel" styleClass="cancel" onclick="gscm.submitConfirm('W2012Cancel.do', this.form, '${cancelConfirmMessage}');">
                    <bean:message key="button.cancel" />
                </html:button>
            </td>
        </tr>
    </table>
    <%--
    -- search results
    --%>
    <table id="tablefix" class="gscm_resultlist">
        <colgroup>
            <col class="resultlist_ck" />
            <col class="resultlist_no" />
            <col class="resultlist_pltz_item_no" />
            <col class="resultlist_pkg_cd" />
            <col class="resultlist_item_description" />
            <col class="resultlist_shipping_lot" />
            <col class="resultlist_instr_qty" />
            <col class="resultlist_qty" />
            <col class="resultlist_tag_qty" />
        </colgroup>
        <tr>
            <th>
                <bean:message key="label.ck" />
            </th>
            <th>
                <bean:message key="label.no" />
            </th>
            <th>
                <bean:message key="label.W2012.pltzItemNo" />
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
        <tbody>
        <logic:iterate name="W2012Form" property="listDomainList" id="listDomainList" indexId="idx">
            <ai:stripeline number="${idx + 1}" odd="gscm_odd" even="gscm_even">
                <tr>
                    <td class="center">
                        <html:checkbox name="listDomainList" property="selected" indexed="true" />
                    </td>
                    <td>
                        <html:text name="listDomainList" property="no" indexed="true" styleClass="w2012_no_disptext gscm_disptext right" readonly="true" />
                    </td>
                    <td>
                        <html:text name="listDomainList" property="pltzItemNo" indexed="true" styleClass="w2012_pltz_item_no_disptext gscm_disptext" errorStyleClass="w2012_pltz_item_no_disptext gscm_disptext gscm_error_class" readonly="true" />
                    </td>
                    <td>
                        <bean:write name="listDomainList" property="pkgCd" />
                    </td>
                    <td>
                        <html:text name="listDomainList" property="itemDescription" indexed="true" styleClass="w2012_item_description_disptext gscm_disptext" readonly="true" />
                    </td>
                    <td class="right">
                        <bean:write name="listDomainList" property="shippingLot" />
                    </td>
                    <td class="right">
                        <bean:write name="listDomainList" property="instrQty" />
                    </td>
                    <td class="right">
                        <html:text name="listDomainList" property="qty" indexed="true" styleClass="right w2012_qty_disptext gscm_disptext" errorStyleClass="right w2012_qty_disptext gscm_disptext gscm_error_class" readonly="true" />
                    </td>
                    <td class="right">
                       <bean:write name="listDomainList" property="tagQty" />
                    </td>
                </tr>
                <html:hidden name="listDomainList" property="pkgCd" indexed="true" />
                <html:hidden name="listDomainList" property="mixTagFlg" indexed="true" />
                <html:hidden name="listDomainList" property="warningFlg" indexed="true" />
                <html:hidden name="listDomainList" property="authFlg" indexed="true" />
            </ai:stripeline>
        </logic:iterate>
        </tbody>
    </table>
    </logic:notEmpty>
    <%--
    -- hidden
    --%>
    <html:hidden property="w2012CriteriaDomain.functionMode" />
    <html:hidden property="callScreenId" />
</html:form>
