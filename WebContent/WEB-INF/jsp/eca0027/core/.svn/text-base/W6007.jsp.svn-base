<%--
 * Project : GSCM
 * 
 * W6007 - Invoice Detail
 *
 * $Revision: 7682 $
 * 
 * Copyright (c) 2013 DENSO CORPORATION. All rights reserved.
 --%>

<html:form action="/W6007Init" styleId="mainForm">
    <%--
    -- search condition 1
    --%>
    <table class="gscm_search" width="980px">
        <colgroup>
            <col class="search_shipper_cd" />
            <col class="search_consignee_cd" />
            <col class="search_ship_to_cd" />
            <col class="search_cml_typ" />
            <col class="search_invoice_key" />
            <col class="search_re_exp_goods_flg" />
            <col class="search_invoice_ctgry" />
            <col class="search_freight_responsible" />
            <col class="search_price_terms" />
            <col class="search_trade_terms" />
        </colgroup>
        <tr>
            <th>
                <bean:message key="label.shipper" />
            </th>
            <th>
                <bean:message key="label.consignee" />
            </th>
            <th>
                <bean:message key="label.nexusShipTo" />
            </th>
            <th>
                <bean:message key="label.cmlType" />
            </th>
            <th>
                <bean:message key="label.invSetKey" />
            </th>
            <th>
                <bean:message key="label.reExFlg" />
            </th>
            <th>
                <bean:message key="label.invCategory" />
            </th>
            <th>
                <bean:message key="label.freightRes" />
            </th>
            <th>
                <bean:message key="label.priceTerms" />
            </th>
            <th>
                <bean:message key="label.tradeTerms" />
            </th>
        </tr>
        <tr>
            <td>
                <bean:write name="W6007Form" property="w6007CriteriaDomain.shipperCd" />
            </td>
            <td>
                <bean:write name="W6007Form" property="w6007CriteriaDomain.consigneeCd" />
            </td>
            <td>
                <bean:write name="W6007Form" property="w6007CriteriaDomain.shipToCd" />
            </td>
            <td>
                <bean:write name="W6007Form" property="w6007CriteriaDomain.cmlTyp" />
            </td>
            <td>
                <bean:write name="W6007Form" property="w6007CriteriaDomain.invoiceKey" />
            </td>
            <td>
                <bean:write name="W6007Form" property="w6007CriteriaDomain.reExpGoodsFlg" />
            </td>
            <td>
                <bean:write name="W6007Form" property="w6007CriteriaDomain.invoiceCtgry" />
            </td>
            <td>
                <bean:write name="W6007Form" property="w6007CriteriaDomain.freightResponsibleCd" />
            </td>
            <td>
                <bean:write name="W6007Form" property="w6007CriteriaDomain.priceTerms" />
            </td>
            <td>
                <bean:write name="W6007Form" property="w6007CriteriaDomain.tradeTerms" />
            </td>
        </tr>
    </table>


    <%--
    -- search condition 2
    --%>
    <table class="gscm_search">
        <colgroup>
            <col class="search_total_cml_qty" />
            <col class="search_total_gw" />
            <col class="search_total_vol" />
            <col class="search_curr_cd" />
            <col class="search_date_shipper" />
        </colgroup>
        <tr>
            <th>
                <bean:message key="label.totalCmlQty" />
            </th>
            <th>
                <bean:message key="label.totalGw" />
            </th>
            <th>
                <bean:message key="label.totalVol" />
            </th>
            <th>
                <bean:message key="label.cmlCur" />
            </th>
            <th>
                <bean:message key="label.dateShipped" />
            </th>
        </tr>
        <tr>
            <td>
                <div class="w6007_total_cml_qty right">
                    <bean:write name="W6007Form" property="w6007CriteriaDomain.totalCmlQty" />
                </div>
            </td>
            <td>
                <div class="w6007_total_gw right">
                    <bean:write name="W6007Form" property="w6007CriteriaDomain.totalGw" />
                </div>
            </td>
            <td>
                <div class="w6007_total_volume right">
                    <bean:write name="W6007Form" property="w6007CriteriaDomain.totalVolume" />
                </div>
            </td>
            <td>
                <bean:write name="W6007Form" property="w6007CriteriaDomain.currCd" />
            </td>
            <td>
                <html:text property="w6007CriteriaDomain.dateShipped" maxlength="8" size="10" styleClass="gscm_required date_shipped" errorStyleClass="date_shipped gscm_error_class" />
                <img src="images/gscm/library/Calendar.gif"
                    onClick = "gscm.writeCalendar('dateShippedDiv', 'mainForm', 'w6007CriteriaDomain.dateShipped', '<bean:message key="format.screen.yyyymmdd" />', this);"/>
                <div id="dateShippedDiv" style="float:left;"></div>
            </td>
        </tr>
    </table>


    <%--
    -- buttons 1
    --%>
    <table class="gscm_search_button">
        <colgroup>
            <col class="search_button_move_to_register" />
            <col class="search_button_refresh" />
        </colgroup>
        <tr>
            <td>
                <html:button property="moveToRegister" onclick="gscm.commonSubmit('W6007MoveToRegister.do', this.form);" styleClass="button_moveToRegister" >
                    <bean:message key="button.moveToRegister" />
                </html:button>
                <html:button property="backToInvoiceGrouping" onclick="gscm.submitBack('W6006Init.do', this.form);" >
                    <bean:message key="button.backToInvoiceGrouping" />
                </html:button>
            </td>
            <td class="right">
                <html:button property="refresh" onclick="gscm.commonSubmit('W6007Refresh.do', this.form);" styleClass="button_refresh" >
                    <bean:message key="button.refresh" />
                </html:button>
            </td>
        </tr>
    </table>
    <hr />
    
    <logic:notEmpty name="W6007Form" property="listDomainList">
        <%--
        -- buttons 2
        --%>
        <table class="gscm_resultlist_button">
            <colgroup>
                <col class="resultlist_button_remove" />
                <col class="resultlist_button_link" />
                <col class="resultlist_button_ignore_warnings" />
            </colgroup>
            <tr>
                <td>
                    <html:button property="remove" onclick="gscm.commonSubmit('W6007Remove.do', this.form);" styleClass="button_remove" >
                        <bean:message key="button.remove" />
                    </html:button>
                </td>
                <td>
                    <table class="grid resultlist_button_link">
                        <colgroup>
                            <col class="resultlist_button_link_label1" />
                            <col class="resultlist_button_unit_price_error" />
                            <col class="resultlist_button_link_label2" />
                            <col class="resultlist_button_hs_code_warning" />
                        </colgroup>
                        <tr>
                            <th class="left">
                                <bean:message key="label.unitPriceError" />
                            </th>
                            <td>
                                <logic:equal name="W6007Form" property="w6007CriteriaDomain.unitPriceError" value="Y">
                                    <a href="#" onclick="popupWT015('${W6007Form.w6007CriteriaDomain.shipperCd}', '${W6007Form.w6007CriteriaDomain.grpNo1}', '${W6007Form.w6007CriteriaDomain.grpNo2}');" >
                                        <bean:write name="W6007Form" property="w6007CriteriaDomain.unitPriceError" />
                                    </a>
                                </logic:equal>
                                <logic:notEqual name="W6007Form" property="w6007CriteriaDomain.unitPriceError" value="Y">
                                    <bean:write name="W6007Form" property="w6007CriteriaDomain.unitPriceError" />
                                </logic:notEqual>
                            </td>
                            <th class="left">
                                <bean:message key="label.hsCodeWarning" />
                            </th>
                            <td>
                                <logic:equal name="W6007Form" property="w6007CriteriaDomain.hsCodeWarning" value="Y">
                                    <a href="#" onclick="popupWT016('${W6007Form.w6007CriteriaDomain.shipperCd}', '${W6007Form.w6007CriteriaDomain.grpNo1}', '${W6007Form.w6007CriteriaDomain.grpNo2}')" >
                                        <bean:write name="W6007Form" property="w6007CriteriaDomain.hsCodeWarning" />
                                    </a>
                                </logic:equal>
                                <logic:notEqual name="W6007Form" property="w6007CriteriaDomain.hsCodeWarning" value="Y">
                                    <bean:write name="W6007Form" property="w6007CriteriaDomain.hsCodeWarning" />
                                </logic:notEqual>
                            </td>
                        </tr>
                    </table>
                </td>
                <td>
                    <html:checkbox property="w6007CriteriaDomain.ignoreWarnings" />Ignore Warnings
                </td>
            </tr>
        </table>

        <%--
        -- search results
        --%>
        <table id="tablefix" class="gscm_resultlist" >
            <colgroup>
                <col class="resultlist_remove" />
                <col class="resultlist_main_mark" />
                <col class="resultlist_gross_weight" />
                <col class="resultlist_volume" />
                <col class="resultlist_rt_use_flg" />
                <col class="resultlist_dngr_item_flg" />
                <col class="resultlist_exp_limt_flg" />
                <col class="resultlist_splt_shippng_ng_flg" />
                <col class="resultlist_multi_cur_flg" />
            </colgroup>
            <thead>
                <tr>
                    <th>
                        <bean:message key="label.reMove" />
                    </th>
                    <th>
                        <bean:message key="label.cml" />
                    </th>
                    <th>
                        <bean:message key="label.grossWeight" />
                        <logic:notEmpty name="W6007Form" property="w6007CriteriaDomain.weightUnit">
                            <br>(<bean:write name="W6007Form" property="w6007CriteriaDomain.weightUnit" />)
                        </logic:notEmpty>
                    </th>
                    <th>
                        <bean:message key="label.vol" />
                        <logic:notEmpty name="W6007Form" property="w6007CriteriaDomain.volumeUnit">
                            <br>(<bean:write name="W6007Form" property="w6007CriteriaDomain.volumeUnit" />)
                        </logic:notEmpty>
                    </th>
                    <th>
                        <bean:message key="label.fullRtFlg" />
                    </th>
                    <th>
                        <bean:message key="label.dgFlg" />
                    </th>
                    <th>
                        <bean:message key="label.expRegFlg" />
                    </th>
                    <th>
                        <bean:message key="label.splitProhibitFlg" />
                    </th>
                    <th>
                        <bean:message key="label.multiCurFlg" />
                    </th>
                </tr>
            </thead>
            <tbody>
                <logic:iterate name="W6007Form" property="listDomainList" id="listDomainList" indexId="idx">
                    <ai:stripeline number="${idx + 1}" odd="gscm_odd" even="gscm_even">
                        <tr>
                            <td class="center">
                                <html:checkbox name="listDomainList" property="selected" indexed="true" />
                            </td>
                            <td>
                                <html:link href="#" onclick="popupWT007('${listDomainList.mainMark}', '')" >
                                    <bean:write name="listDomainList" property="mainMark" />
                                </html:link>
                            </td>
                            <td class="right">
                                <bean:write name="listDomainList" property="grossWeight" />
                            </td>
                            <td class="right">
                                <bean:write name="listDomainList" property="volume" />
                            </td>
                            <td>
                                <bean:write name="listDomainList" property="rtUseFlg" />
                            </td>
                            <td>
                                <bean:write name="listDomainList" property="dngrItemFlg" />
                            </td>
                            <td>
                                <bean:write name="listDomainList" property="expLimitFlg" />
                            </td>
                            <td>
                                <bean:write name="listDomainList" property="splitShippingNgFlg" />
                            </td>
                            <td>
                                <bean:write name="listDomainList" property="multiCurFlg" />
                            </td>
                        </tr>
                    </ai:stripeline>
                </logic:iterate>
            </tbody>
        </table>
    </logic:notEmpty>

    <%--
    -- hidden
    --%>
    <html:hidden property="w6007CriteriaDomain.grpNo1" />
    <html:hidden property="w6007CriteriaDomain.grpNo2" />
    <html:hidden property="w6007CriteriaDomain.customerCd" />
    <html:hidden property="w6007CriteriaDomain.hiddenDateShipped" />

    <html:hidden property="callScreenId" />
</html:form>
