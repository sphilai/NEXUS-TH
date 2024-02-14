<%--
 * W2008.jsp
 *
 * 小箱内多品番梱包Register画面のJSPです。
 * 
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 --%>

<html:form action="/W2008Init" styleId="mainForm">
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
            <col class="search_mix_tag_status" />
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
            <th>
                <bean:message key="label.mixTagStatus" />
            </th>
        </tr>
        <tr>
            <td>
                <html:text name="W2008Form" property="w2008CriteriaDomain.shipperCd" styleClass="shipper_cd gscm_disptext" errorStyleClass="shipper_cd gscm_disptext gscm_error_class" readonly="true"/>
            </td>
            <td>
                <html:text name="W2008Form" property="w2008CriteriaDomain.customerCd" styleClass="customer_cd gscm_disptext" errorStyleClass="customer_cd gscm_disptext gscm_error_class" readonly="true"/>
            </td>
            <td>
                <html:text name="W2008Form" property="w2008CriteriaDomain.lgcyShipTo" styleClass="lgcy_ship_to gscm_disptext" errorStyleClass="lgcy_ship_to gscm_disptext gscm_error_class" readonly="true"/>
            </td>
            <td>
                <bean:write name="W2008Form" property="w2008CriteriaDomain.trnsCd" />
            </td>
            <td>
                <html:text name="W2008Form" property="w2008CriteriaDomain.plntCd" styleClass="plnt_cd gscm_disptext" errorStyleClass="plnt_cd gscm_disptext gscm_error_class" readonly="true"/>
            </td>
            <td>
                <html:text name="W2008Form" property="w2008CriteriaDomain.lgcyWhCd" styleClass="lgcy_wh_cd gscm_disptext" errorStyleClass="lgcy_wh_cd gscm_disptext gscm_error_class" readonly="true"/>
            </td>
            <td>
                <bean:write name="W2008Form" property="w2008CriteriaDomain.pltzInstrNo" />
            </td>
            <td>
                <html:text name="W2008Form" property="w2008CriteriaDomain.whCompCd" styleClass="wh_comp_cd gscm_disptext" errorStyleClass="wh_comp_cd gscm_disptext gscm_error_class" readonly="true"/>
            </td>
            <td>
                <html:text name="W2008Form" property="w2008CriteriaDomain.whCd" styleClass="wh_cd gscm_disptext" errorStyleClass="wh_cd gscm_disptext gscm_error_class" readonly="true"/>
            </td>
            <td>
                <bean:write name="W2008Form" property="w2008CriteriaDomain.mixTagStatus" />
            </td>
        </tr>
    </table>
    <%--
    -- search condition 2
    --%>
    <table class="gscm_search">
        <colgroup>
            <col class="search_invoice_key" />
            <col class="search_container_sorting_key" />
            <col class="search_loading_cd" />
            <col class="search_net_weight" />
            <col class="search_gross_weight" />
            <col class="search_pkg_ip" />
            <col class="search_box_no" />
            <col class="search_mix_tag_no" />
        </colgroup>
        <tr>
            <th>
                <bean:message key="label.invoiceKey" />
            </th>
            <th>
                <bean:message key="label.containerSortingKey" />
            </th>
            <th>
                <bean:message key="label.loadingCd" />
            </th>
            <th>
                <bean:message key="label.netWeight" />
            </th>
            <th>
                <bean:message key="label.grossWeight" />
            </th>
            <th>
                <bean:message key="label.pkgIp" />
            </th>
            <th>
                <bean:message key="label.boxNo" />
            </th>
            <th>
                <bean:message key="label.mixTagNo" />
            </th>
        </tr>
        <tr>
            <td>
                <bean:write name="W2008Form" property="w2008CriteriaDomain.invoiceKey" />
            </td>
            <td>
                <bean:write name="W2008Form" property="w2008CriteriaDomain.containerSortingKey" />
            </td>
            <td>
                <bean:write name="W2008Form" property="w2008CriteriaDomain.loadingCd" />
            </td>
            <td>
               <logic:notEmpty name="W2008Form" property="w2008CriteriaDomain.netWeight">
                   <bean:write name="W2008Form" property="w2008CriteriaDomain.netWeight" />
                   <bean:write name="W2008Form" property="w2008CriteriaDomain.weightUnitDisp" />
               </logic:notEmpty>
            </td>
            <td>
                <logic:notEmpty name="W2008Form" property="w2008CriteriaDomain.grossWeight">
                    <bean:write name="W2008Form" property="w2008CriteriaDomain.grossWeight" />
                    <bean:write name="W2008Form" property="w2008CriteriaDomain.weightUnitDisp" />
                </logic:notEmpty>
            </td>
            <td>
                <bean:write name="W2008Form" property="w2008CriteriaDomain.pkgIp" />
            </td>
            <td>
                <bean:write name="W2008Form" property="w2008CriteriaDomain.boxNo" />
            </td>
            <td>
                <bean:write name="W2008Form" property="w2008CriteriaDomain.mixTagNo" />
            </td>
        </tr>
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
                <bean:define id="backToMainScreenConfirmMessage"><bean:message key="GSCM-I0-0002"/></bean:define>
                <html:button property="backToCreate" styleClass="back_to_create" onclick="gscm.submitBack('W2007Init.do', this.form);" styleId="backToCreateBtn">
                    <bean:message key="button.backToCreate" />
                </html:button>
                <html:button property="pkgMaterials" styleClass="pkg_materials" onclick="gscm.commonSubmit('W2008PkgMaterials.do', this.form);" styleId="pkgMaterialsBtn">
                    <bean:message key="button.pkgMaterials" />
                </html:button>
                <c:if test="${empty W2008Form.w2008CriteriaDomain.mixTagNo }" >
                    <html:button property="backToMainScreen" styleClass="back_to_main_screen" onclick="window.backToMainScreen(this.form, '${W2008Form.fromScreenId}', '${backToMainScreenConfirmMessage}');">
                        <bean:message key="button.backToMainScreen" />
                    </html:button>
                </c:if>
                <c:if test="${not empty W2008Form.w2008CriteriaDomain.mixTagNo }" >
                    <html:button property="backToMainScreen" styleClass="back_to_main_screen" onclick="gscm.submitBack('W2005Init.do', this.form );">
                        <bean:message key="button.backToMainScreen" />
                    </html:button>
                </c:if>
            </td>
        </tr>
    </table>
    <hr />
    <logic:notEmpty name="W2008Form" property="listDomainList" >
    <%--
    -- buttons 2
    --%>
    <table class="gscm_resultlist_button">
        <colgroup>
            <col />
        </colgroup>
        <tr>
            <td>
                <bean:define id="deleteConfirmMessage"><bean:message key="GSCM-I0-0005"/></bean:define>
                <bean:define id="registerConfirmMessage"><bean:message key="GSCM-I0-0003"/></bean:define>
                <bean:define id="cancelConfirmMessage"><bean:message key="GSCM-I0-0005"/></bean:define>
                <html:button property="delete" styleClass="delete" onclick="gscm.submitConfirm('W2008Delete.do', this.form, '${deleteConfirmMessage}');">
                    <bean:message key="button.delete" />
                </html:button>
                <html:button property="register" styleClass="register" onclick="gscm.submitConfirm('W2008Register.do', this.form, '${registerConfirmMessage}');">
                    <bean:message key="button.register" />
                </html:button>
                <html:checkbox property="w2008CriteriaDomain.ignoreWarnings" />
                <nested:hidden property="w2008CriteriaDomain.ignoreWarnings" value="off"/>
                <bean:message key="label.ignoreWarnings" />
                <html:button property="printTag" styleClass="print_tag" onclick="gscm.commonSubmitForCheck('W2008PrintTag.do', this.form, 'false', 'false');">
                    <bean:message key="button.printTag" />
                </html:button>
                <html:button property="cancel" styleClass="cancel" onclick="gscm.submitConfirm('W2008Cancel.do', this.form, '${cancelConfirmMessage}');">
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
            <col class="resultlist_delete" />
            <col class="resultlist_no" />
            <col class="resultlist_item_no" />
            <col class="resultlist_pkg_cd" />
            <col class="resultlist_item_description" />
            <col class="resultlist_shipping_lot" />
            <col class="resultlist_instr_qty" />
            <col class="resultlist_qty" />
            <col class="resultlist_tag_qty" />
        </colgroup>
        <tr>
            <th>
                <bean:message key="label.delete" />
            </th>
            <th>
                <bean:message key="label.no" />
            </th>
            <th>
                <bean:message key="label.itemNo" />
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
        <logic:iterate name="W2008Form" property="listDomainList" id="listDomainList" indexId="idx">
            <ai:stripeline number="${idx + 1}" odd="gscm_odd" even="gscm_even">
                <tr>
                    <td class="center">
                        <html:checkbox name="listDomainList" property="selected" indexed="true" />
                    </td>
                    <td class="right">
                        <html:text name="listDomainList" property="no" indexed="true" styleClass="w2008_no_disptext gscm_disptext right" readonly="true" />
                    </td>
                    <td>
                        <bean:write name="listDomainList" property="itemNo" />
                    </td>
                    <td>
                        <bean:write name="listDomainList" property="pkgCd" />
                    </td>
                    <td>
                        <html:text name="listDomainList" property="itemDescription" indexed="true" styleClass="w2008_item_description_disptext gscm_disptext" readonly="true" />
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
                    <html:hidden name="listDomainList" property="warningFlg" indexed="true" />
                    <html:hidden name="listDomainList" property="itemWeight" indexed="true" />
                    <html:hidden name="listDomainList" property="weightUnit" indexed="true" />
                    <html:hidden name="listDomainList" property="currCd" indexed="true" />
                    <html:hidden name="listDomainList" property="qtyUnit" indexed="true" />
                    <html:hidden name="listDomainList" property="hiddenPlntCd" indexed="true" />
                    <html:hidden name="listDomainList" property="originCntryCd" indexed="true" />
                    <html:hidden name="listDomainList" property="expLimitTyp" indexed="true" />
                    <html:hidden name="listDomainList" property="dngrItemFlg" indexed="true" />
                </tr>
            </ai:stripeline>
        </logic:iterate>
        </tbody>
    </table>
    </logic:notEmpty>
    <%--
    -- hidden
    --%>
    <html:hidden property="w2008CriteriaDomain.containerLooseTyp" />
    <html:hidden property="w2008CriteriaDomain.customTimingTyp" />
    <html:hidden property="callScreenId" />
    <html:hidden property="download" />
</html:form>
