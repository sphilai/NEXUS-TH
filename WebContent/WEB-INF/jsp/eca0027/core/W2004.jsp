<%--
 * W2004.jsp
 * 
 * 梱包指示Register画面のJSPです。
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 --%>
<html:form action="/W2004Init" styleId="mainForm">
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
            <col class="search_pltz_instr_dt" />
            <col class="search_fm_dt" />
            <col class="search_to_dt" />
            <col class="search_customer_po_no" />
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
                <bean:message key="label.pltzInstrDt" />
            </th>
            <th>
                <bean:message key="label.fmDate" />
            </th>
            <th>
                <bean:message key="label.toDate" />
            </th>
            <th>
                <bean:message key="label.customerPoNo" />
            </th>
        </tr>
        <tr>
            <td>
                <bean:write name="W2004Form" property="w2004CriteriaDomain.shipperCd" />
            </td>
            <td>
                <bean:write name="W2004Form" property="w2004CriteriaDomain.customerCd" />
            </td>
            <td>
                <bean:write name="W2004Form" property="w2004CriteriaDomain.lgcyShipTo" />
            </td>
            <td>
                <bean:write name="W2004Form" property="w2004CriteriaDomain.trnsCd" />
            </td>
            <td>
                <bean:write name="W2004Form" property="w2004CriteriaDomain.plntCd" />
            </td>
            <td>
                <bean:write name="W2004Form" property="w2004CriteriaDomain.lgcyWhCd" />
            </td>
            <td>
                <bean:write name="W2004Form" property="w2004CriteriaDomain.pltzInstrDt" />
            </td>
            <td>
                <bean:write name="W2004Form" property="w2004CriteriaDomain.poDueDtFrom" />
            </td>
            <td>
                <bean:write name="W2004Form" property="w2004CriteriaDomain.poDueDtTo" />
            </td>
            <td>
                <bean:write name="W2004Form" property="w2004CriteriaDomain.customerPoNo" />
            </td>
        </tr>
    </table>
    <%--
    -- search condition 2
    --%>
    <table class="gscm_search">
        <colgroup>
            <col class="search_pltz_instr_status" />
            <col class="search_cml_print_out_dt" />
            <col class="search_pltz_instr_no"/>
        </colgroup>
        <tr>
            <th>
                <bean:message key="label.pltzInstrStatus" />
            </th>
            <th>
                <bean:message key="label.cmlPrintOutDt" />
            </th>
            <th>
                <bean:message key="label.pltzInstrNo" />
            </th>
        </tr>
        <tr>
            <td>
                <bean:write name="W2004Form" property="w2004CriteriaDomain.pltzInstrStatus" />
            </td>
            <td>
                <bean:write name="W2004Form" property="w2004CriteriaDomain.cmlPrintOutDt" />
            </td>
            <td>
                <bean:write name="W2004Form" property="w2004CriteriaDomain.pltzInstrNo" />
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
                <html:button property="backToCreate" styleClass="back_to_create" onclick="gscm.submitBack('W2003Init.do', this.form);">
                    <bean:message key="button.backToCreate" />
                </html:button>
                <html:button property="backToMainScreen" styleClass="back_to_main_screen" onclick="window.backToMainScreen(this.form, '${W2004Form.fromScreenId}', '${backToMainScreenConfirmMessage}');">
                    <bean:message key="button.backToMainScreen" />
                </html:button>
            </td>
        </tr>
    </table>
    <hr />
    <logic:notEmpty name="W2004Form" property="listDomainList" >
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
                <html:button property="delete" styleClass="delete" onclick="gscm.submitConfirm('W2004Delete.do', this.form, '${deleteConfirmMessage}');">
                    <bean:message key="button.delete" />
                </html:button>
                <html:button property="register" styleClass="register" onclick="gscm.submitConfirm('W2004Register.do', this.form, '${registerConfirmMessage}');">
                    <bean:message key="button.register" />
                </html:button>
                <html:button property="printInstr" styleClass="print_instr" onclick="gscm.commonSubmit('W2004PrintInstr.do', this.form);">
                    <bean:message key="button.printInstr" />
                </html:button>
                <html:button property="cancel" styleClass="cancel" onclick="gscm.submitConfirm('W2004Cancel.do', this.form, '${cancelConfirmMessage}');">
                    <bean:message key="button.cancel" />
                </html:button>
                <html:button property="printCmlForInstr" styleClass="print_cml_for_instr" onclick="gscm.commonSubmit('W2004PrintCmlForInstr.do', this.form);">
                    <bean:message key="button.printCmlForInstr" />
                </html:button>
            </td>
        </tr>
    </table>
    <%--
    -- search results
    --%>
    <table id="tablefix" class="gscm_resultlist">
        <colgroup>
            <col class="resultlist_delete"/>
            <col class="resultlist_item_no" />
            <col class="resultlist_pkg_cd" />
            <col class="resultlist_cml_flg" />
            <col class="resultlist_shipping_lot" />
            <col class="resultlist_instr_qty" />
            <col class="resultlist_box_lot_qty" />
            <col class="resultlist_total_net_weight" />
            <col class="resultlist_box_qty"/>
        </colgroup>
        <tr>
            <th>
                <bean:message key="button.delete" />
            </th>
            <th>
                <bean:message key="label.itemNo" />
            </th>
            <th>
                <bean:message key="label.pkgCd" />
            </th>
            <th>
                <bean:message key="label.cmlFlg" />
            </th>
            <th>
                <bean:message key="label.shippingLot" />
            </th>
            <th>
                <bean:message key="label.instrQty" />
            </th>
            <th>
                <bean:message key="label.boxLotQty" />
            </th>
            <th>
                <bean:message key="label.totalNetWeight" />(<bean:write name="W2004Form" property="listDomainList[0].weightUnitDisp" />)
            </th>
            <th>
                <bean:message key="label.boxQty" />
            </th>
        </tr>
        <logic:iterate name="W2004Form" property="listDomainList" id="listDomainList" scope="request" indexId="idx">
            <ai:stripeline number="${idx + 1}" odd="gscm_odd" even="gscm_even">
                <tr>
                    <td class="center">
                        <html:checkbox name="listDomainList" property="selected" indexed="true" />
                    </td>
                    <td>
                        <html:text name="listDomainList" property="itemNo" styleClass="gscm_disptext" readonly="true" indexed="true" />
                    </td>
                    <td>
                        <bean:write name="listDomainList" property="pkgCd" />
                    </td>
                    <td>
                        <bean:write name="listDomainList" property="cmlFlg" />
                    </td>
                    <td class="right">
                        <bean:write name="listDomainList" property="shippingLot" />
                    </td>
                    <td class="right">
                        <bean:write name="listDomainList" property="instrQty" />
                    </td>
                    <td class="right">
                        <bean:write name="listDomainList" property="boxLotQty" />
                    </td>
                    <td class="right">
                        <bean:write name="listDomainList" property="totalNetWeight" />
                    </td>
                    <td class="right">
                        <bean:write name="listDomainList" property="boxQty" />
                    </td>
                    <html:hidden name="listDomainList" property="itemNo" indexed="true" />
                    <html:hidden name="listDomainList" property="pkgCd" indexed="true" />
                    <html:hidden name="listDomainList" property="cmlFlg" indexed="true" />
                    <html:hidden name="listDomainList" property="shippingLot" indexed="true" />
                    <html:hidden name="listDomainList" property="instrQty" indexed="true" />
                    <html:hidden name="listDomainList" property="boxLotQty" indexed="true" />
                    <html:hidden name="listDomainList" property="totalNetWeight" indexed="true" />
                    <html:hidden name="listDomainList" property="boxQty" indexed="true" />
                    <html:hidden name="listDomainList" property="itemDescription" indexed="true" />
                    <html:hidden name="listDomainList" property="whStkLocation" indexed="true" />
                </tr>
            </ai:stripeline>
        </logic:iterate>
    </table>
    </logic:notEmpty>
    <%--
    -- hidden
    --%>
    <html:hidden property="callScreenId" />
    <html:hidden property="pltzInstrNo" />
    <html:hidden property="downloadInstr" />
    <html:hidden property="downloadCmlForInstr" />
</html:form>
