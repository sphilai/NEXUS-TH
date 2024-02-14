<%--
 * W4008.jsp
 * 
 * JSP of staging actuality register screen.
 * 山作り実績Register画面のJSPです。
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 --%>

<%-- Action of the submit destination --%>
<%-- submit先のアクション --%>
<c:set var="backToCreateAction" scope="request">
    <html:rewrite action="/W4007Init"></html:rewrite>
</c:set>
<c:set var="backToMainScreenAction" scope="request">
    <html:rewrite action="/W4005Init"></html:rewrite>
</c:set>
<c:set var="deleteAction" scope="request">
    <html:rewrite action="/W4008Delete"></html:rewrite>
</c:set>
<c:set var="registerAction" scope="request">
    <html:rewrite action="/W4008Register"></html:rewrite>
</c:set>
<c:set var="printStgActAction" scope="request">
    <html:rewrite action="/W4008PrintStgAct"></html:rewrite>
</c:set>
<c:set var="updateEtdCarrierAction" scope="request">
    <html:rewrite action="/W4008UpdateEtdCarrier"></html:rewrite>
</c:set>
<c:set var="cancelAction" scope="request">
    <html:rewrite action="/W4008Cancel"></html:rewrite>
</c:set>

<html:form action="/W4008Init" styleId="mainForm">
    <%--
    -- search condition 1
    --%>
    <table class="gscm_search">
        <colgroup>
            <col class="search_wh_comp_cd" />
            <col class="search_wh_cd" />
            <col class="search_trns_cd" />
            <col class="search_container_sorting_key" />
            <col class="search_trns_typ_cd" />
            <col class="search_pkg_qty" />
            <col class="search_total_gross_weight" />
            <col class="search_total_volume" />
            <col class="search_loading_ratio" />
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
                <bean:message key="label.trnsTypCd" />
            </th>
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
                <bean:message key="label.loadingRatio" />
            </th>
        </tr>
        <tr>
            <td>
                <bean:write name="W4008Form" property="w4008CriteriaDomain.whCompCd" />
            </td>
            <td>
                <bean:write name="W4008Form" property="w4008CriteriaDomain.whCd" />
            </td>
            <td>
                <bean:write name="W4008Form" property="w4008CriteriaDomain.trnsCd" />
            </td>
            <td>
                <bean:write name="W4008Form" property="w4008CriteriaDomain.containerSortingKey" />
            </td>
            <td >
                <%-- UT446 MOD START --%>
                <logic:equal name="W4008Form" property="callScreenId" value="W4005">
                    <html:select property="w4008CriteriaDomain.trnsTypCd" styleClass="trns_typ_cd gscm_required" errorStyleClass="trns_typ_cd gscm_error_class">
                        <html:options collection="trnsTypCd" property="id" labelProperty="name" />
                    </html:select>
                </logic:equal>
                <logic:notEqual name="W4008Form" property="callScreenId" value="W4005">
                    <bean:write name="W4008Form" property="w4008CriteriaDomain.trnsTypNm" />
                </logic:notEqual>
                <%-- UT446 MOD END --%>
            </td>
            <td>
                <bean:write name="W4008Form" property="w4008CriteriaDomain.pkgQty" />
            </td>
            <td>
                <bean:write name="W4008Form" property="w4008CriteriaDomain.grossWeight" />
                &nbsp;<bean:write name="W4008Form" property="w4008CriteriaDomain.weightUnitDisp" />
            </td>
            <td>
                <bean:write name="W4008Form" property="w4008CriteriaDomain.volume" />
                &nbsp;<bean:write name="W4008Form" property="w4008CriteriaDomain.volumeUnitDisp" />
            </td>
            <td>
                <bean:write name="W4008Form" property="w4008CriteriaDomain.loadingRatio" />
                <logic:notEmpty name="W4008Form" property="w4008CriteriaDomain.loadingRatio">
                    %
                </logic:notEmpty>
            </td>
        </tr>
    </table>
    <%--
    -- search condition 2
    --%>
    <table class="gscm_search">
        <colgroup>
            <col class="search_etd" />
            <col class="search_carrier_comp_cd" />
            <col class="search_stg_act_dt" />
            <col class="search_stg_act_issuer_nm" />
            <col class="search_stg_act_no" />
        </colgroup>
        <tr>
            <th>
                <bean:message key="label.etd" />
            </th>
            <th>
                <bean:message key="label.carrierCompCd" />
            </th>
            <th>
                <bean:message key="label.stgActDt" />
            </th>
            <th>
                <bean:message key="label.stgActIssuerNm" />
            </th>
            <th>
                <bean:message key="label.stgActNo" />
            </th>
        </tr>
        <tr>
            <td>
                <html:text property="w4008CriteriaDomain.etd" maxlength="8" styleClass="etd" errorStyleClass="etd gscm_error_class" />
                <img src="images/gscm/library/Calendar.gif"
                    onClick = "gscm.writeCalendar('etdDiv', 'mainForm', 'w4008CriteriaDomain.etd', '<bean:message key="format.screen.yyyymmdd" />', this);"/>
                <div id="etdDiv"></div>
            </td>
            <td>
                <html:text property="w4008CriteriaDomain.carrierCompCd" maxlength="3" styleClass="carrier_comp_cd" errorStyleClass="carrier_comp_cd gscm_error_class" />
                <html:button property="selectCarrier" onclick="showSelectCarrier();" styleClass="select">
                    <bean:message key="button.select" />
                </html:button>
            </td>
            <td>
                <bean:write name="W4008Form" property="w4008CriteriaDomain.stgActDt" />
            </td>
            <td >
                <html:text property="w4008CriteriaDomain.stgActIssuerNm" styleClass="stg_act_issuer_nm gscm_disptext" readonly="true" tabindex="-1" />
            </td>
            <td>
                <bean:write name="W4008Form" property="w4008CriteriaDomain.stgActNo" />
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
    <logic:notEmpty name="W4008Form" property="w4008ListDomainList">
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
                    <html:button property="printStgAct" onclick="gscm.commonSubmitForCheck('${printStgActAction}', this.form, 'false', 'false');" styleClass="print_stg_act">
                        <bean:message key="button.printStgActuality" />
                    </html:button>
                    <script language="JavaScript"><!--//
                    updateEtdCarrierConfirmMessage = '<bean:message key="GSCM-I0-0004" />';
                    //--></script>
                    <html:button property="updateEtdCarrier" onclick="doUpdateEtdCarrier('${updateEtdCarrierAction}', this.form);" styleClass="update_etd_carrier">
                        <bean:message key="button.updateEtdCarrier" />
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
                <col class="resultlist_shipper_cd" />
                <col class="resultlist_nexus_ship_to_cd" />
                <col class="resultlist_stg_instr_no" />
                <col class="resultlist_main_mark_or_xmain_mark" />
                <col class="resultlist_loading_cd" />
                <col class="resultlist_etd" />
                <col class="resultlist_carrier_comp_cd" />
                <col class="resultlist_gross_weight" />
                <col class="resultlist_volume" />
                <col class="resultlist_last_tr_rcv_dt" />
            </colgroup>
            <thead>
                <tr>
                    <th>
                        <bean:message key="label.delete" />
                    </th>
                    <th>
                        <bean:message key="label.shipperCd" />
                    </th>
                    <th>
                        <bean:message key="label.nexusShipToCd" />
                    </th>
                    <th>
                        <bean:message key="label.stgInstrNo" />
                    </th>
                    <th>
                        <bean:message key="label.xmainMark" />/<bean:message key="label.mainMark" />
                    </th>
                    <th>
                        <bean:message key="label.loadingCd" />
                    </th>
                    <th >
                        <bean:message key="label.etd" />
                    </th>
                    <th >
                        <bean:message key="label.carrierCompCd" />
                    </th>
                    <th>
                        <bean:message key="label.grossWeight" /><br />
                        (<bean:write name="W4008Form" property="w4008CriteriaDomain.weightUnitDisp" />)
                    </th>
                    <th>
                        <bean:message key="label.volume" /><br />
                        (<bean:write name="W4008Form" property="w4008CriteriaDomain.volumeUnitDisp" />)
                    </th>
                    <th>
                        <bean:message key="label.lastTrRcvDt" />
                    </th>
                </tr>
            </thead>
            <tbody>
                <logic:iterate name="W4008Form" property="w4008ListDomainList" id="w4008ListDomain" indexId="index">
                    <ai:stripeline number="${index+1}" odd="gscm_odd" even="gscm_even">
                        <tr class="gscm_odd">
                            <td class="center">
                                <html:checkbox name="w4008ListDomain" property="selected" indexed="true" />
                            </td>
                            <td>
                                <bean:write name="w4008ListDomain" property="shipperCd" />
                            </td>
                            <td>
                                <bean:write name="w4008ListDomain" property="shipToCd" />
                            </td>
                            <td>
                                <bean:write name="w4008ListDomain" property="stgInstrNo" />
                            </td>
                            <td>
                                <c:if test="${w4008ListDomain.maskFlg != 'Y'}">
                                    <a href="#" onclick="showItemNoInfo('<bean:write name="w4008ListDomain" property="mainMarkOrXmainMark" />', '<bean:write name="w4008ListDomain" property="mainMarkTyp" />')" >
                                        <bean:write name="w4008ListDomain" property="mainMarkOrXmainMark" />
                                    </a>
                                </c:if>
                                <c:if test="${w4008ListDomain.maskFlg == 'Y'}">
                                    <bean:write name="w4008ListDomain" property="mainMarkOrXmainMark" />
                                </c:if>
                            </td>
                            <td>
                                <bean:write name="w4008ListDomain" property="loadingCd" />
                            </td>
                            <td >
                                <bean:write name="w4008ListDomain" property="etd" />
                            </td>
                            <td >
                                <bean:write name="w4008ListDomain" property="carrierCompCd" />
                            </td>
                            <td class="right">
                                <bean:write name="w4008ListDomain" property="grossWeight" />
                            </td>
                            <td class="right">
                                <bean:write name="w4008ListDomain" property="volume" />
                            </td>
                            <td>
                                <bean:write name="w4008ListDomain" property="lastTrRcvDt" />
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

