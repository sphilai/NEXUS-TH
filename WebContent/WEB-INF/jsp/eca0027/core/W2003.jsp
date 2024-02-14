<%--
 * W2003.jsp
 * 
 * 梱包指示Create画面のJSPです。
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 --%>
<html:form action="/W2003Search" styleId="mainForm">
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
            <col />
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
                <bean:write name="W2003Form" property="w2003CriteriaDomain.shipperCd" />
            </td>
            <td>
                <bean:write name="W2003Form" property="w2003CriteriaDomain.customerCd" />
            </td>
            <td>
                <bean:write name="W2003Form" property="w2003CriteriaDomain.lgcyShipTo" />
            </td>
            <td>
                <bean:write name="W2003Form" property="w2003CriteriaDomain.trnsCd" />
            </td>
            <td>
                <bean:write name="W2003Form" property="w2003CriteriaDomain.plntCd" />
            </td>
            <td>
                <bean:write name="W2003Form" property="w2003CriteriaDomain.lgcyWhCd" />
            </td>
            <td>
                <bean:write name="W2003Form" property="w2003CriteriaDomain.pltzInstrDt" />
            </td>
            <td>
                <bean:write name="W2003Form" property="w2003CriteriaDomain.poDueDtFrom" />
            </td>
            <td>
                <bean:write name="W2003Form" property="w2003CriteriaDomain.poDueDtTo" />
            </td>
            <td>
                <bean:write name="W2003Form" property="w2003CriteriaDomain.customerPoNo" />
            </td>
        </tr>
    </table>
    <%--
    -- search condition 2
    --%>
    <table class="gscm_search">
        <colgroup>
            <col class="search_item_no" />
            <col class="search_pkg_cd" />
        </colgroup>
        <tr>
            <th>
                <bean:message key="label.itemNo" />
            </th>
            <th>
                <bean:message key="label.pkgCd" />
            </th>
        </tr>
        <tr>
            <td>
                <html:text property="w2003CriteriaDomain.itemNo" maxlength="27" styleClass="item_no" errorStyleClass="item_no gscm_error_class" />
            </td>
            <td>
                <html:text property="w2003CriteriaDomain.pkgCd" maxlength="3" styleClass="pkg_cd" errorStyleClass="pkg_cd gscm_error_class" />
            </td>
        </tr>
    </table>
    <%--
    -- buttons 1
    --%>
    <table class="gscm_search_button">
        <colgroup>
            <col width="50%" />
            <col />
        </colgroup>
        <tr>
            <td>
                <html:button property="moveToRegister" styleClass="move_to_register" onclick="gscm.commonSubmit('W2003MoveToRegister.do', this.form);">
                    <bean:message key="button.moveToRegister" />
                </html:button>
                <html:button property="backToHeader" styleClass="back_to_header" onclick="gscm.submitBack('W2002Init.do', this.form);">
                    <bean:message key="button.backToHeader" />
                </html:button>
                <html:button property="backToMainScreen" styleClass="back_to_main_screen" onclick="gscm.submitBack('W2001Init.do', this.form);">
                    <bean:message key="button.backToMainScreen" />
                </html:button>
            </td>
            <td class="right">
                <html:button property="search" styleClass="search" onclick="setSearchFlg(this.form, 'Y'); gscm.submitSearch('W2003Search.do', this.form, '');">
                    <bean:message key="button.search" />
                </html:button>
            </td>
        </tr>
    </table>
    <hr />
    <c:if test="${W2003Form.displayList}">
        <logic:notEmpty name="W2003Form" property="listDomainList" >
            <%--
            -- buttons 2
            --%>
            <table class="gscm_resultlist_button">
                <colgroup>
                    <col />
                </colgroup>
                <tr>
                    <td>
                        <html:button property="update" styleClass="update" onclick="enableCk(); gscm.commonSubmit('W2003Update.do', this.form);">
                            <bean:message key="button.update" />
                        </html:button>
                        <html:checkbox property="w2003CriteriaDomain.ignoreWarnings" />
                        <nested:hidden property="w2003CriteriaDomain.ignoreWarnings" value="off"/>
                        <bean:message key="label.ignoreWarnings" />
                    </td>
                </tr>
            </table>
            <%--
            -- page control
            --%>
            <table class="gscm_resultlist_button">
                <colgroup>
                    <col />
                </colgroup>
                <tr>
                    <td class="right" style="padding-right: 20px;"><%@ include
                        file="/WEB-INF/jsp/includes/gscm/framework/pager.jspf"%>
                    </td>
                </tr>
            </table>
            <%--
            -- search results
            --%>
            <table id="tablefix" class="gscm_resultlist">
                <colgroup>
                    <col class="resultlist_ck" />
                    <col class="resultlist_item_no" />
                    <col class="resultlist_pkg_cd" />
                    <col class="resultlist_shipping_lot" />
                    <col class="resultlist_on_hand_qty" />
                    <col class="resultlist_instr_qty" />
                    <col class="resultlist_sum_qty_before2" />
                    <col class="resultlist_sum_qty_before1" />
                    <col class="resultlist_sum_qty" />
                    <col class="resultlist_sum_qty_after1" />
                    <col class="resultlist_sum_qty_after2" />
                    <col class="resultlist_sum_qty_after3" />
                    <col class="resultlist_sum_qty_after4" />
                </colgroup>
                <tr>
                    <th><bean:message key="label.ck" /><input type="checkbox" name="checkAll" onclick="allcheck('listDomainList', 'selected', this.checked, check)" /></th>
                    <th><bean:message key="label.itemNo" /></th>
                    <th><bean:message key="label.pkgCd" /></th>
                    <th><bean:message key="label.shippingLot" /></th>
                    <th><bean:message key="label.onHandQty" /></th>
                    <th><bean:message key="label.instrQty" /></th>
                    <th><bean:write name="W2003Form" property="listDomainList[0].workingDayList[0]" /></th>
                    <th><bean:write name="W2003Form" property="listDomainList[0].workingDayList[1]" /></th>
                    <th><bean:write name="W2003Form" property="listDomainList[0].workingDayList[2]" /></th>
                    <th><bean:write name="W2003Form" property="listDomainList[0].workingDayList[3]" /></th>
                    <th><bean:write name="W2003Form" property="listDomainList[0].workingDayList[4]" /></th>
                    <th><bean:write name="W2003Form" property="listDomainList[0].workingDayList[5]" /></th>
                    <th><bean:write name="W2003Form" property="listDomainList[0].workingDayList[6]" /></th>
                </tr>
                <logic:iterate name="W2003Form" property="listDomainList" id="listDomainList" indexId="idx">
                    <ai:stripeline number="${idx + 1}" odd="gscm_odd" even="gscm_even">
                        <tr>
                            <td class="center">
                                <html:checkbox name="listDomainList" property="selected" onclick="check($(this))" indexed="true" />
                            </td>
                            <td>
                                <html:text name="listDomainList" property="itemNo" styleClass="gscm_disptext" errorStyleClass="gscm_disptext gscm_error_class" readonly="true" indexed="true" />
                            </td>
                            <td>
                                <bean:write name="listDomainList" property="pkgCd" />
                            </td>
                            <td class="right">
                                <bean:write name="listDomainList" property="shippingLot" />
                            </td>
                            <td class="right">
                                <bean:write name="listDomainList" property="onHandQty" />
                            </td>
                            <td class="right">
                                <html:text name="listDomainList" property="instrQty" maxlength="7" size="7" styleClass="instr_qty right" errorStyleClass="instr_qty right gscm_error_class" indexed="true" />
                            </td>
                            <td class="right">
                                <bean:write name="listDomainList" property="sumQtyBefore2" />
                            </td>
                            <td class="right">
                                <bean:write name="listDomainList" property="sumQtyBefore1" />
                            </td>
                            <td class="right">
                                <bean:write name="listDomainList" property="sumQty" />
                            </td>
                            <td class="right">
                                <bean:write name="listDomainList" property="sumQtyAfter1" />
                            </td>
                            <td class="right">
                                <bean:write name="listDomainList" property="sumQtyAfter2" />
                            </td>
                            <td class="right">
                                <bean:write name="listDomainList" property="sumQtyAfter3" />
                            </td>
                            <td class="right">
                                <bean:write name="listDomainList" property="sumQtyAfter4" />
                            </td>
                            <html:hidden name="listDomainList" property="disabledFlg" indexed="true" />
                            <html:hidden name="listDomainList" property="itemDescription" indexed="true" />
                            <html:hidden name="listDomainList" property="boxLotQty" indexed="true" />
                            <html:hidden name="listDomainList" property="netWeightA" indexed="true" />
                            <html:hidden name="listDomainList" property="whStkLocation" indexed="true" />
                            <html:hidden name="listDomainList" property="collateMethTyp" indexed="true" />
                            <html:hidden name="listDomainList" property="weightUnit" indexed="true" />
                            <html:hidden name="listDomainList" property="pkgFormTyp" indexed="true" />
                            <html:hidden name="listDomainList" property="summaryOrder" indexed="true" />
                        </tr>
                    </ai:stripeline>
                </logic:iterate>
            </table>
        </logic:notEmpty>
    </c:if>
    <%--
    -- hidden
    --%>
    <html:hidden property="searchFlg" />
    <html:hidden property="callScreenId" />
</html:form>
