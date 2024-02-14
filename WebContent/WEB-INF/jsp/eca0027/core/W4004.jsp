<%--
 * W4004.jsp
 * 
 * JSP of staging instruction register screen.
 * 荷揃え指示Register画面のJSPです。
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 --%>

<%-- Action of the submit destination --%>
<%-- submit先のアクション --%>
<c:set var="backToCreateAction" scope="request">
    <html:rewrite action="/W4003Init"></html:rewrite>
</c:set>
<c:set var="backToMainScreenAction" scope="request">
    <html:rewrite action="/W4001Init"></html:rewrite>
</c:set>
<c:set var="deleteAction" scope="request">
    <html:rewrite action="/W4004Delete"></html:rewrite>
</c:set>
<c:set var="registerAction" scope="request">
    <html:rewrite action="/W4004Register"></html:rewrite>
</c:set>
<c:set var="printInstrAction" scope="request">
    <html:rewrite action="/W4004PrintInstr"></html:rewrite>
</c:set>
<c:set var="registerWorkingAction" scope="request">
    <html:rewrite action="/W4004RegisterWorking"></html:rewrite>
</c:set>
<c:set var="cancelAction" scope="request">
    <html:rewrite action="/W4004Cancel"></html:rewrite>
</c:set>

<html:form action="/W4004Init" styleId="mainForm">
    <%--
    -- search condition 1
    --%>
    <table class="gscm_search">
        <colgroup>
            <col class="search_wh_comp_cd" />
            <col class="search_wh_cd" />
            <col class="search_trns_cd" />
            <col class="search_container_sorting_key" />
            <col class="search_shipper_cd" />
            <col class="search_custom_timing_typ" />
            <col class="search_container_loose_typ" />
            <col class="search_etd" />
            <col class="search_carrier_comp_cd" />
            <col class="search_stg_instr_dt" />
            <col class="search_stg_instr_issuer_nm" />
        </colgroup>
        <tr>
            <th>
                <bean:message key="label.whCompCd" />
            </th>
            <th>
                <bean:message key="label.whCd" />
            </th>
            <th>
                <bean:message key="label.trnsCd" />
            </th>
            <th>
                <bean:message key="label.containerSortingKey" />
            </th>
            <th>
                <bean:message key="label.shipperCd" />
            </th>
            <th>
                <bean:message key="label.customTimingTyp" />
            </th>
            <th>
                <bean:message key="label.containerLooseTyp" />
            </th>
            <th>
                <bean:message key="label.etd" />
            </th>
            <th>
                <bean:message key="label.carrierCompCd" />
            </th>
            <th>
                <bean:message key="label.stgInstrDt" />
            </th>
            <th>
                <bean:message key="label.stgInstrIssuerNm" />
            </th>
        </tr>
        <tr>
            <td>
                <bean:write name="W4004Form" property="w4004CriteriaDomain.whCompCd" />
            </td>
            <td>
                <bean:write name="W4004Form" property="w4004CriteriaDomain.whCd" />
            </td>
            <td>
                <bean:write name="W4004Form" property="w4004CriteriaDomain.trnsCd" />
            </td>
            <td>
                <bean:write name="W4004Form" property="w4004CriteriaDomain.containerSortingKey" />
            </td>
            <td>
                <bean:write name="W4004Form" property="w4004CriteriaDomain.shipperCd" />
            </td>
            <td>
                <bean:write name="W4004Form" property="w4004CriteriaDomain.customTimingTyp" />
            </td>
            <td>
                <bean:write name="W4004Form" property="w4004CriteriaDomain.containerLooseTyp" />
            </td>
            <td>
                <bean:write name="W4004Form" property="w4004CriteriaDomain.etd" />
            </td>
            <td>
                <bean:write name="W4004Form" property="w4004CriteriaDomain.carrierCompCd" />
            </td>
            <td>
                <bean:write name="W4004Form" property="w4004CriteriaDomain.stgInstrDt" />
            </td>
            <td >
                <html:text property="w4004CriteriaDomain.stgInstrIssuerNm" styleClass="stg_instr_issuer_nm gscm_disptext" readonly="true" tabindex="-1" />
            </td>
        </tr>
    </table>
    <%--
    -- search condition 2
    --%>
    <table class="gscm_search">
        <colgroup>
            <col class="search_pkg_qty" />
            <col class="search_total_gross_weight" />
            <col class="search_total_volume" />
            <col class="search_worked_dt" />
            <col class="search_worked_issuer_nm" />
            <col class="search_worked_meth_value" />
            <col class="search_stg_instr_status" />
            <col class="search_stg_instr_no" />
        </colgroup>
        <tr>
            <th>
                <bean:message key="label.pkgQty" />
            </th>
            <th>
                <bean:message key="label.totalGrossWeight" />
            </th>
            <th>
                <bean:message key="label.totalVolume" />
            </th>
            <th>
                <bean:message key="label.workedDt" />
            </th>
            <th>
                <bean:message key="label.workedIssuerNm" />
            </th>
            <th>
                <bean:message key="label.workedMethValue" />
            </th>
            <th>
                <bean:message key="label.stgInstrStatus" />
            </th>
            <th>
                <bean:message key="label.stgInstrNo" />
            </th>
        </tr>
        <tr>
            <td>
                <bean:write name="W4004Form" property="w4004CriteriaDomain.pkgQty" />
            </td>
            <td>
                <bean:write name="W4004Form" property="w4004CriteriaDomain.grossWeight" />
                &nbsp;<bean:write name="W4004Form" property="w4004CriteriaDomain.weightUnitDisp" />
            </td>
            <td>
                <bean:write name="W4004Form" property="w4004CriteriaDomain.volume" />
                &nbsp;<bean:write name="W4004Form" property="w4004CriteriaDomain.volumeUnitDisp" />
            </td>
            <td>
                <bean:write name="W4004Form" property="w4004CriteriaDomain.workedDt" />
            </td>
            <td >
                <html:text property="w4004CriteriaDomain.workedIssuerNm" styleClass="worked_issuer_nm gscm_disptext" readonly="true" tabindex="-1" />
            </td>
            <td>
                <bean:write name="W4004Form" property="w4004CriteriaDomain.workedMethValue" />
            </td>
            <td>
                <bean:write name="W4004Form" property="w4004CriteriaDomain.stgInstrStatus" />
            </td>
            <td>
                <bean:write name="W4004Form" property="w4004CriteriaDomain.stgInstrNo" />
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
                <html:button property="backToCreate" onclick="gscm.submitBack('${backToCreateAction}', this.form);" styleClass="back_to_create">
                    <bean:message key="button.backToCreate" />
                </html:button>
                <html:button property="backToMainScreen" onclick="doBackToMain('${backToMainScreenAction}', this.form);" styleClass="back_to_main_screen">
                    <bean:message key="button.backToMainScreen" />
                </html:button>
            </td>
        </tr>
    </table>
    <hr />
    <logic:notEmpty name="W4004Form" property="w4004ListDomainList">
        <%--
        -- buttons 2
        --%>
        <table class="gscm_search_button">
            <colgroup>
                <col />
            </colgroup>
            <tr>
                <td>
                    <html:button property="delete" onclick="gscm.submitDeleteConfirm('${deleteAction}', this.form);" styleClass="delete">
                        <bean:message key="button.delete" />
                    </html:button>
                    <html:button property="register" onclick="gscm.submitCreateConfirm('${registerAction}', this.form);" styleClass="register">
                        <bean:message key="button.register" />
                    </html:button>
                    <html:button property="printInstr" onclick="gscm.commonSubmitForCheck('${printInstrAction}', this.form, 'false', 'false');" styleClass="print_instr">
                        <bean:message key="button.printInstr" />
                    </html:button>
                    <script language="JavaScript"><!--//
                    registerWorkingConfirmMessage = '<bean:message key="NXS-I1-0012" />';
                    //--></script>
                    <html:button property="registerWorking" onclick="doRegisterWorking('${registerWorkingAction}', this.form);" styleClass="register_working">
                        <bean:message key="button.registerWorking" />
                    </html:button>
                    <html:button property="cancel" onclick="gscm.submitDeleteConfirm('${cancelAction}', this.form);" styleClass="cancel">
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
                <col class="resultlist_loading_cd" />
                <col class="resultlist_ship_to_cd" />
                <col class="resultlist_dngr_item_flg" />
                <col class="resultlist_main_mark" />
                <col class="resultlist_exp_request_no" />
                <col class="resultlist_gross_weight" />
                <col class="resultlist_volume" />
                <col class="resultlist_last_tr_rcv_dt" />
                <col class="resultlist_due_date" />
            </colgroup>
            <thead>
                <tr>
                    <th>
                        <bean:message key="label.delete" />
                    </th>
                    <th>
                        <bean:message key="label.loadingCd" />
                    </th>
                    <th>
                        <bean:message key="label.nexusShipToCd" />
                    </th>
                    <th>
                        <bean:message key="label.dngrItemFlg" />
                    </th>
                    <th>
                        <bean:message key="label.mainMark" />
                    </th>
                    <th>
                        <bean:message key="label.expRequestNo" />
                    </th>
                    <th>
                        <bean:message key="label.grossWeight" /><br />
                        (<bean:write name="W4004Form" property="w4004CriteriaDomain.weightUnitDisp" />)
                    </th>
                    <th>
                        <bean:message key="label.volume" /><br />
                        (<bean:write name="W4004Form" property="w4004CriteriaDomain.volumeUnitDisp" />)
                    </th>
                    <th>
                        <bean:message key="label.lastTrRcvDt" />
                    </th>
                    <th>
                        <bean:message key="label.dueDt" />
                    </th>
                </tr>
            </thead>
            <tbody>
                <logic:iterate name="W4004Form" property="w4004ListDomainList" id="w4004ListDomain" indexId="index">
                    <ai:stripeline number="${index+1}" odd="gscm_odd" even="gscm_even">
                        <tr>
                            <td class="center">
                                <html:checkbox name="w4004ListDomain" property="selected" indexed="true" />
                            </td>
                            <td>
                                <bean:write name="w4004ListDomain" property="loadingCd" />
                            </td>
                            <td>
                                <bean:write name="w4004ListDomain" property="shipToCd" />
                            </td>
                            <td>
                                <bean:write name="w4004ListDomain" property="dngrItemFlg" />
                            </td>
                            <td>
                                <c:if test="${w4004ListDomain.maskFlg != 'Y'}">
                                    <a href="#" onclick="showItemNoInfo('<bean:write name="w4004ListDomain" property="mainMark" />')" >
                                        <bean:write name="w4004ListDomain" property="mainMark" />
                                    </a>
                                </c:if>
                                <c:if test="${w4004ListDomain.maskFlg == 'Y'}">
                                    <bean:write name="w4004ListDomain" property="mainMark" />
                                </c:if>
                            </td>
                            <td>
                                <bean:write name="w4004ListDomain" property="expRequestNo" />
                            </td>
                            <td class="right">
                                <bean:write name="w4004ListDomain" property="grossWeight" />
                            </td>
                            <td class="right">
                                <bean:write name="w4004ListDomain" property="volume" />
                            </td>
                            <td>
                                <bean:write name="w4004ListDomain" property="lastTrRcvDt" />
                            </td>
                            <td>
                                <bean:write name="w4004ListDomain" property="dueDt" />
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
    <html:hidden property="callScreenId" />
</html:form>

