<%--
 * W2013.jsp
 * 
 * CML PKG Info Detail 画面のJSPです。
 * 
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 --%>
<script type="text/javascript"><!--
$(function() {
    $('#tablefix').tablefix({height: 433, fixRows: 1});
    
    <c:if test="${first_add_line != null}">
        var select = $(':button[name="select[${first_add_line}]"]');
        select.focus();
    </c:if>
});
//--></script>
 
<html:form action="/W2013Init" styleId="mainForm">
    <%--
    -- search condition 1
    --%>
    <table class="gscm_search">
        <colgroup>
            <col class="search_pallet_no" />
            <col class="search_shipper_cd" />
            <col class="search_customer_cd" />
            <col class="search_lgcy_ship_to" />
            <col class="search_trns_cd" />
            <col class="search_plnt_cd" />
            <col class="search_lgcy_wh_cd" />
            <col class="search_pltz_instr_no" />
        </colgroup>
        <tr>
            <th>
                <bean:message key="label.palletNo" />
            </th>
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
        </tr>
        <tr>
            <td>
                <bean:write name="W2013Form" property="w2013CriteriaDomain.palletNo" />
            </td>
            <td>
                <html:text property="w2013CriteriaDomain.shipperCd" styleClass="shipper_cd gscm_disptext" readonly="true" styleId="shipeerCd" />
            </td>
            <td>
                <bean:write name="W2013Form" property="w2013CriteriaDomain.customerCd" />
            </td>
            <td>
                <bean:write name="W2013Form" property="w2013CriteriaDomain.lgcyShipTo" />
            </td>
            <td>
                <bean:write name="W2013Form" property="w2013CriteriaDomain.trnsCd" />
            </td>
            <td>
                <bean:write name="W2013Form" property="w2013CriteriaDomain.plntCd" />
            </td>
            <td>
                <bean:write name="W2013Form" property="w2013CriteriaDomain.lgcyWhCd" />
            </td>
            <td>
                <bean:write name="W2013Form" property="w2013CriteriaDomain.pltzInstrNo" />
            </td>
        </tr>
    </table>
    <%--
    -- search condition 2
    --%>
    <table class="gscm_search">
        <colgroup>
            <col class="search_pkg_form_typ" />
            <col class="search_invoice_key" />
            <col class="search_container_sorting_key" />
            <col class="search_exp_packing_dt" />
            <col class="search_exp_packing_issuer_nm" />
            <col class="search_main_mark" />
        </colgroup>
        <tr>
            <th>
                <bean:message key="label.pkgFormTyp" />
            </th>
            <th>
                <bean:message key="label.invoiceKey" />
            </th>
            <th>
                <bean:message key="label.containerSortingKey" />
            </th>
            <th>
                <bean:message key="label.expPackingDt" />
            </th>
            <th>
                <bean:message key="label.expPackingIssuerNm" />
            </th>
            <th>
                <bean:message key="label.mainMark" />
            </th>
        </tr>
        <tr>
            <td>
                <%-- UT110 TRIAL SHIPMENT/号試品対応 MOD --%>
                <logic:notEqual name="W2013Form" property="w2013CriteriaDomain.manualRegFlg" value="Y">
                    <bean:write name="W2013Form" property="w2013CriteriaDomain.pkgFormTyp" />
                </logic:notEqual>
            </td>
            <td>
                <bean:write name="W2013Form" property="w2013CriteriaDomain.invoiceKey" />
            </td>
            <td>
                <bean:write name="W2013Form" property="w2013CriteriaDomain.containerSortingKey" />
            </td>
            <td>
                <bean:write name="W2013Form"  property="w2013CriteriaDomain.expPackingDt" />
            </td>
            <td>
                <html:text property="w2013CriteriaDomain.expPackingIssuerNm" styleClass="w2013_exp_packing_issuer_nm gscm_disptext" readonly="true"/>
            </td>
            <td>
                <html:text property="w2013CriteriaDomain.mainMark" styleClass="main_mark gscm_disptext" readonly="true"/>
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
                <c:if test="${W2013Form.w2013CriteriaDomain.functionMode eq 1}">
                    <html:button property="saveAndMoveToRegister" styleClass="save_and_move_to_register" onclick="enableQty(); gscm.submitCreateConfirm('W2013SaveAndMoveToRegister.do', this.form);">
                        <bean:message key="button.saveAndMoveToRegister" />
                    </html:button>
                    <html:button property="saveAndMoveToTransPkgRevise" styleClass="save_and_move_to_trans_pkg_revise" onclick="enableQty(); gscm.submitCreateConfirm('W2013SaveAndMoveToTransPKGRevise.do', this.form);">
                        <bean:message key="button.saveAndMoveToTransPkgRevise" />
                    </html:button>
                </c:if>
                <c:if test="${W2013Form.w2013CriteriaDomain.functionMode ne 1}">
                    <html:button property="saveAndMoveToRegister" styleClass="save_and_move_to_register" onclick="enableQty(); gscm.commonSubmit('W2013SaveAndMoveToRegister.do', this.form);">
                        <bean:message key="button.saveAndMoveToRegister" />
                    </html:button>
                    <html:button property="saveAndMoveToTransPkgRevise" styleClass="save_and_move_to_trans_pkg_revise" onclick="enableQty(); gscm.commonSubmit('W2013SaveAndMoveToTransPKGRevise.do', this.form);">
                        <bean:message key="button.saveAndMoveToTransPkgRevise" />
                    </html:button>
                </c:if>
            </td>
        </tr>
    </table>
    <hr />
    <%--
    -- buttons 2
    --%>
    <table class="gscm_resultlist_button">
        <colgroup>
            <col />
        </colgroup>
        <tr>
            <td>
                <html:button property="addNewLine10" styleId="add_new_line10" styleClass="add_new_line10" onclick="enableQty(); gscm.commonSubmit('W2013AddNewLine.do', this.form);">
                    <bean:message key="button.addNewLine10" />
                </html:button>
                <html:button property="delete" styleClass="delete" onclick="gscm.submitDeleteConfirm('W2013Delete.do', this.form);">
                    <bean:message key="button.delete" />
                </html:button>
            </td>
        </tr>
    </table>
    <br />

    <c:if test="${W2013Form.displayList}">
    <%--
    -- search results
    --%>
    <table id="tablefix" class="gscm_resultlist">
        <colgroup>
            <col class="resultlist_checked_key" />
            <col class="resultlist_input_method" />
            <col class="resultlist_rt_flg" />
            <col class="resultlist_pkg_typ" />
            <col class="resultlist_pkg_item_no" />
            <col class="resultlist_model_cd" />
            <col class="resultlist_mix_tag_no" />
            <col class="resultlist_qty" />
            <col class="resultlist_total_qty" />
        </colgroup>
        <tr>
            <th>
                <bean:message key="label.ck" />
            </th>
            <th>
                <bean:message key="label.inputMethod" />
            </th>
            <th>
                <bean:message key="label.rtFlg" />
            </th>
            <th>
                <bean:message key="label.pkgTyp" />
            </th>
            <th>
                <bean:message key="label.pkgItemNo" />
            </th>
            <th>
                <bean:message key="label.modelCd" />
            </th>
            <th>
                <bean:message key="label.mixTagNo" />
            </th>
            <th>
                <bean:message key="label.qty" />
            </th>
            <th>
                <bean:message key="label.totalQty" />
            </th>
        </tr>
        <logic:iterate name="W2013Form" property="listDomainList" id="listDomainList" indexId="idx">
            <ai:stripeline number="${idx + 1}" odd="gscm_odd" even="gscm_even">
                <tr>
                    <td class="center">
                        <html:checkbox name="listDomainList" property="selected" indexed="true" />
                    </td>
                    <td>
                        <bean:write name="listDomainList" property="inputMethod" />
                    </td>
                    <td>
                        <html:text name="listDomainList" property="rtFlg" maxlength="1" styleClass="w2013_rt_flg_disptext gscm_disptext" readonly="true" indexed="true" />
                    </td>
                    <td>
                        <bean:write name="listDomainList" property="pkgTyp"/>
                    </td>
                    <td>
                        <html:text name="listDomainList" property="pkgItemNo" maxlength="27" styleClass="pkg_item_no" errorStyleClass="pkg_item_no gscm_error_class" readonly="true" indexed="true" />
                        <html:button property="select" styleClass="select" onclick="selectPkgItem('${idx}')"  indexed="true" >
                            <bean:message key="button.select" />
                        </html:button>
                    </td>
                    <td>
                        <html:text name="listDomainList" property="modelCd" indexed="true" styleClass="w2013_model_cd_disptext gscm_disptext" readonly="true" />
                    </td>
                    <td>
                        <bean:write name="listDomainList" property="mixTagNo"/>
                    </td>
                    <td>
                        <html:text name="listDomainList" property="qty" maxlength="7" styleClass="qty right" errorStyleClass="qty right gscm_error_class" indexed="true" />
                    </td>
                    <td class="right">
                        <bean:write name="listDomainList" property="totalQty"/>
                    </td>
                    <html:hidden name="listDomainList" property="inputMethod" indexed="true" />
                    <html:hidden name="listDomainList" property="pkgTyp" indexed="true" />
                    <html:hidden name="listDomainList" property="totalQty" indexed="true" />
                    <html:hidden name="listDomainList" property="mixTagNo" indexed="true" />
                    <html:hidden name="listDomainList" property="brch" indexed="true" />
                    <html:hidden name="listDomainList" property="itemDescription" indexed="true" />
                    <html:hidden name="listDomainList" property="pkgTypHidden" indexed="true" />
                    <html:hidden name="listDomainList" property="pkgWeight" indexed="true" />
                    <html:hidden name="listDomainList" property="weightUnit" indexed="true" />
                    <html:hidden name="listDomainList" property="originCntryCd" indexed="true" />
                    <html:hidden name="listDomainList" property="currCd" indexed="true" />
                    <html:hidden name="listDomainList" property="inputMethTyp" indexed="true" />
                </tr>
            </ai:stripeline>
        </logic:iterate>
    </table>
    </c:if>
    <%--
    -- hidden
    --%>
    <html:hidden property="w2013CriteriaDomain.functionMode" />
    <html:hidden property="w2013CriteriaDomain.originalScreenId" />
    <html:hidden property="callScreenId" />
</html:form>
