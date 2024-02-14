<%--
 * Project : GSCM
 * 
 * W6006 - Documentation [Invoice Grouping]
 *
 * $Revision: 10963 $
 * 
 * Copyright (c) 2013 DENSO CORPORATION. All rights reserved.
 --%>

<html:form action="/W6006Init" styleId="mainForm">
    <%--
    -- search condition 1
    --%>
    <table class="gscm_search">
        <colgroup>
            <col class="search_stg_cd" />
            <col class="search_stg_wh" />
            <col class="search_trns_cd" />
            <col class="search_container_loose_typ" />
            <col class="search_custom_timing_typ" />
            <col class="search_container_sorting_key" />
            <col class="search_etd" />
            <col class="search_operation_no" />
            <col />
        </colgroup>
        <tr>
            <th>
                <bean:message key="label.stgCom" />
            </th>
            <th>
                <bean:message key="label.stgWh" />
            </th>
            <th>
                <bean:message key="label.trnsCd" />
            </th>
            <th>
                <bean:message key="label.containerLooseTyp" />
            </th>
            <th>
                <bean:message key="label.customTimingTyp" />
            </th>
            <th>
                <bean:message key="label.containerSortingKey" />
            </th>
            <th>
                <bean:message key="label.etd" />
            </th>
            <th>
                <bean:write name="W6006Form" property="w6006CriteriaDomain.titleOfOperationNo" />
            </th>
            <th>
                <bean:message key="label.shipperCd" />
            </th>
        </tr>
        <tr>
            <td>
                <bean:write name="W6006Form" property="w6006CriteriaDomain.stgCom" />
            </td>
            <td>
                <bean:write name="W6006Form" property="w6006CriteriaDomain.stgWh" />
            </td>
            <td>
                <bean:write name="W6006Form" property="w6006CriteriaDomain.trnsCd" />
            </td>
            <td>
                <bean:write name="W6006Form" property="w6006CriteriaDomain.containerLooseTyp" />
            </td>
            <td>
                <bean:write name="W6006Form" property="w6006CriteriaDomain.customTimingTyp" />
            </td>
            <td>
                <bean:write name="W6006Form" property="w6006CriteriaDomain.containerSortingKey" />
            </td>
            <td>
                <bean:write name="W6006Form" property="w6006CriteriaDomain.etd" />
            </td>
            <td class="right">
                <div id="tooltip">
                    <div class="select right search_operation_no">
                        <bean:write name="W6006Form" property="w6006CriteriaDomain.countOfOperationNo" />
                        <logic:notEmpty name="W6006Form" property="w6006CriteriaDomain.operationNoList">
                        <div class="tooltip-balloon">
                            <logic:iterate id="operationNo" name="W6006Form" property="w6006CriteriaDomain.operationNoList">
                            <bean:write name="operationNo" /><br />
                            </logic:iterate>
                            
                        </div>
                        </logic:notEmpty>
                    </div>
                </div>
            </td>
            <td>
                <html:select property="w6006CriteriaDomain.shipperCd" styleId="shipper_cd" styleClass="shipper_cd gscm_required" errorStyleClass="shipper_cd gscm_error_class" tabindex="1" >
                    <html:options collection="shipperCd" property="id" labelProperty="name"/>
                </html:select>
            </td>
        </tr>
    </table>
    <%--
    -- buttons 1
    --%>
    <table class="gscm_search_button">
        <colgroup>
            <col class="search_button" />
            <col />
        </colgroup>
        <tr>
            <td>
                <html:button property="moveToInvoiceDetail" onclick="gscm.commonSubmit('W6006MoveToInvoiceDetail.do', this.form);" styleClass="move_to_invoice_detail" tabindex="2">
                    <bean:message key="button.moveToInvoiceDetail" />
                </html:button>
                <bean:define id="confirmMessageBackToMain"><bean:message key="NXS-I1-0015" locale="${locale_key}" /></bean:define>
                <html:button property="backToMainScreen" onclick="gscm.submitConfirm('W6006BackToMainScreen.do', this.form, '${confirmMessageBackToMain}');" styleClass="back_to_main_screen" tabindex="3">
                    <bean:message key="button.backToMainScreen" />
                </html:button>
                <html:button property="backToShippingInformationInput" onclick="gscm.submitBack('W6005Init.do', this.form);" styleClass="back_to_shipping_information_input" tabindex="4">
                    <bean:message key="button.backToShippingInformationInput" />
                </html:button>
            </td>
            <td class="right">
                <html:button property="search" onclick="gscm.commonSubmit('W6006Search.do', this.form);" styleClass="search" tabindex="5">
                    <bean:message key="button.search" />
                </html:button>
            </td>
        </tr>
    </table>
    <hr />
    <logic:notEmpty name="W6006Form" property="listDomainList">
        <%--
        -- search condition 2
        --%>
        <table class="grid">
            <colgroup>
                <col class="grid_header" />
                <col class="grid_contents" />
            </colgroup>
            <tr>
                <th class="left">
                    <bean:message key="label.dateShipped" />
                </th>
                <td>
                    <html:text property="w6006CriteriaDomain.dateShipped" maxlength="8" styleClass="etd gscm_required" errorStyleClass="etd gscm_error_class" tabindex="6" />
                    <img src="images/gscm/library/Calendar.gif"
                        onClick = "gscm.writeCalendar('dateShippedDiv', 'mainForm', 'w6006CriteriaDomain.dateShipped', '<bean:message key="format.screen.yyyymmdd" />', this);"/>
                    <div id="dateShippedDiv" style="float:left;"></div>
                </td>
            </tr>
        </table>
        <%--
        -- search results
        --%>
        <table id="tablefix" class="gscm_resultlist">
            <colgroup>
                <col class="resultlist_ck" />
                <col class="resultlist_grp_no_1" />
                <col class="resultlist_grp_no_2" />
                <col class="resultlist_consignee_cd" />
                <col class="resultlist_ship_to_cd" />
                <col class="resultlist_cml_typ" />
                <col class="resultlist_invoice_key" />
                <col class="resultlist_re_exp_goods_flg" />
                <col class="resultlist_invoice_ctgry" />
                <col class="resultlist_customerCd" />
                <col class="resultlist_lgcy_ship_to" />
                <col />
            </colgroup>
            <thead>
                <tr>
                    <th rowspan="2">
                        <bean:message key="label.ck" />
                    </th>
                    <th colspan="2">
                        <bean:message key="label.grpNo" />
                    </th>
                    <th rowspan="2">
                        <bean:message key="label.consigneeCd" />
                    </th>
                    <th rowspan="2">
                        <bean:message key="W6006.label.shipToCd" />
                    </th>
                    <th rowspan="2">
                        <bean:message key="W6006.label.cmlTyp" />
                    </th>
                    <th rowspan="2">
                        <bean:message key="label.invoiceKey" />
                    </th>
                    <th rowspan="2">
                        <bean:message key="label.reExpGoodsFlg" />
                    </th>
                    <th rowspan="2">
                        <bean:message key="label.invoiceCtgry" />
                    </th>
                    <th rowspan="2">
                        <bean:message key="W6006.label.customerCd" />
                    </th>
                    <th rowspan="2">
                        <bean:message key="label.lgcyShipTo" />
                    </th>
                    <th rowspan="2">
                        <bean:message key="label.invoiceNo" />
                    </th>
                </tr>
                <tr>
                    <th>
                        <bean:message key="label.grpNo1" />
                    </th>
                    <th>
                        <bean:message key="label.grpNo2" />
                    </th>
                </tr>
            <thead>
            <tbody>
                <logic:iterate name="W6006Form" property="listDomainList" id="listDomainList" indexId="idx">
                    <ai:stripeline number="${idx + 1}" odd="gscm_odd" even="gscm_even">
                        <tr>
                            <td class="center">
                            <c:if test="${listDomainList.disabledFlg == 'Y'}">
                                <html:radio property="w6006CriteriaDomain.selected" value="${idx}" disabled="true" />
                            </c:if>
                            <c:if test="${listDomainList.disabledFlg != 'Y'}">
                                <html:radio property="w6006CriteriaDomain.selected" value="${idx}" tabindex="${idx + 8}"/>
                            </c:if>
                            </td>
                            <td class="right">
                                <bean:write name="listDomainList" property="viewGrpNo1" />
                            </td>
                            <td class="right">
                                <bean:write name="listDomainList" property="grpNo2" />
                            </td>
                            <td>
                                <bean:write name="listDomainList" property="consigneeCd" />
                            </td>
                            <td>
                                <bean:write name="listDomainList" property="shipToCd" />
                            </td>
                            <td>
                                <bean:write name="listDomainList" property="cmlTyp" />
                            </td>
                            <td>
                                <bean:write name="listDomainList" property="invoiceKey" />
                            </td>
                            <td>
                                <bean:write name="listDomainList" property="reExpGoodsFlg" />
                            </td>
                            <td>
                                <bean:write name="listDomainList" property="invoiceCtgry" />
                            </td>
                            <td>
                                <bean:write name="listDomainList" property="customerCd" />
                            </td>
                            <td>
                                <bean:write name="listDomainList" property="lgcyShipTo" />
                            </td>
                            <td>
                                <bean:write name="listDomainList" property="invoiceNo" />
                            </td>
                            <html:hidden name="listDomainList" property="shipperCd" indexed="true" />
                            <html:hidden name="listDomainList" property="grpNo1" indexed="true" />
                        </tr>
                    </ai:stripeline>
                </logic:iterate>
            </tbody>
        </table>
    </logic:notEmpty>
    <%--
    -- hidden
    --%>
    <html:hidden property="callScreenId" />
</html:form>
