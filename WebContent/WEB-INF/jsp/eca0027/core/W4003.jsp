<%--
 * W4003.jsp
 * 
 * JSP of staging instruction create screen.
 * 荷揃え指示Create画面のJSPです。
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 --%>

<%-- Action of the submit destination --%>
<%-- submit先のアクション --%>
<c:set var="moveToRegisterAction" scope="request">
    <html:rewrite action="/W4003MoveToRegister"></html:rewrite>
</c:set>
<c:set var="backToHeaderAction" scope="request">
    <html:rewrite action="/W4002Init"></html:rewrite>
</c:set>
<c:set var="backToMainScreenAction" scope="request">
    <html:rewrite action="/W4001Init"></html:rewrite>
</c:set>
<c:set var="searchAction" scope="request">
    <html:rewrite action="/W4003Search"></html:rewrite>
</c:set>
<c:set var="updateAction" scope="request">
    <html:rewrite action="/W4003Update"></html:rewrite>
</c:set>

<html:form action="/W4003Init" styleId="mainForm">
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
        </tr>
        <tr>
            <td>
                <bean:write name="W4003Form" property="w4003CriteriaDomain.whCompCd" />
            </td>
            <td>
                <bean:write name="W4003Form" property="w4003CriteriaDomain.whCd" />
            </td>
            <td>
                <bean:write name="W4003Form" property="w4003CriteriaDomain.trnsCd" />
            </td>
            <td>
                <bean:write name="W4003Form" property="w4003CriteriaDomain.containerSortingKey" />
            </td>
            <td>
                <bean:write name="W4003Form" property="w4003CriteriaDomain.shipperCd" />
            </td>
            <td>
                <bean:write name="W4003Form" property="w4003CriteriaDomain.customTimingTyp" />
            </td>
            <td>
                <bean:write name="W4003Form" property="w4003CriteriaDomain.containerLooseTyp" />
            </td>
            <td>
                <bean:write name="W4003Form" property="w4003CriteriaDomain.etd" />
            </td>
            <td>
                <bean:write name="W4003Form" property="w4003CriteriaDomain.carrierCompCd" />
            </td>
        </tr>
    </table>
    <%--
    -- search condition 2
    --%>
    <table class="gscm_search">
        <colgroup>
            <col class="search_loading_cd" />
            <col class="search_ship_to_cd" />
            <col class="search_dngr_item_flg" />
            <col class="search_main_mark" />
            <col class="search_exp_request_no" />
            <col class="search_last_tr_rcv_dt_from" />
            <col class="search_last_tr_rcv_dt_to" />
        </colgroup>
        <tr>
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
                <bean:message key="label.lastTrRcvDtFrom" />
            </th>
            <th>
                <bean:message key="label.lastTrRcvDtTo" />
            </th>
        </tr>
        <tr>
            <td>
                <html:select property="w4003CriteriaDomain.loadingCd" styleClass="loading_cd" errorStyleClass="loading_cd gscm_error_class">
                    <html:options collection="loadingCd" property="id" labelProperty="name" />
                </html:select>
            </td>
            <td>
                <html:text property="w4003CriteriaDomain.shipToCd" maxlength="7" styleClass="ship_to_cd" errorStyleClass="ship_to_cd gscm_error_class" />
            </td>
            <td>
                <html:select property="w4003CriteriaDomain.dngrItemFlg" styleClass="dngr_item_flg" errorStyleClass="dngr_item_flg gscm_error_class">
                    <html:options collection="flg" property="id" labelProperty="name" />
                </html:select>
            </td>
            <td>
                <html:text property="w4003CriteriaDomain.mainMark" maxlength="17" styleClass="main_mark" errorStyleClass="main_mark gscm_error_class" />
            </td>
            <td>
                <html:text property="w4003CriteriaDomain.expRequestNo" maxlength="12" styleClass="exp_request_no" errorStyleClass="exp_request_no gscm_error_class" />
            </td>
            <td>
                <html:text property="w4003CriteriaDomain.lastTrRcvDtFrom" maxlength="8" styleClass="last_tr_rcv_dt" errorStyleClass="last_tr_rcv_dt gscm_error_class" />
                <img src="images/gscm/library/Calendar.gif"
                    onClick = "gscm.writeCalendar('lastTrRcvDtFromDiv', 'mainForm', 'w4003CriteriaDomain.lastTrRcvDtFrom', '<bean:message key="format.screen.yyyymmdd" />', this);"/>
                <div id="lastTrRcvDtFromDiv"></div>
            </td>
            <td>
                <html:text property="w4003CriteriaDomain.lastTrRcvDtTo" maxlength="8" styleClass="last_tr_rcv_dt" errorStyleClass="last_tr_rcv_dt gscm_error_class" />
                <img src="images/gscm/library/Calendar.gif"
                    onClick = "gscm.writeCalendar('lastTrRcvDtToDiv', 'mainForm', 'w4003CriteriaDomain.lastTrRcvDtTo', '<bean:message key="format.screen.yyyymmdd" />', this);"/>
                <div id="lastTrRcvDtToDiv"></div>
            </td>
        </tr>
    </table>
    <%--
    -- buttons 1
    --%>
    <table class="gscm_search_button">
        <tr>
            <td>
                <html:button property="moveToRegister" onclick="gscm.commonSubmit('${moveToRegisterAction}', this.form);" styleClass="move_to_register">
                    <bean:message key="button.moveToRegister" />
                </html:button>
                <html:button property="backToHeader" onclick="gscm.submitBack('${backToHeaderAction}', this.form);" styleClass="back_to_header">
                    <bean:message key="button.backToHeader" />
                </html:button>
                <html:button property="backToMainScreen" onclick="gscm.submitBack('${backToMainScreenAction}', this.form);" styleClass="back_to_main_screen">
                    <bean:message key="button.backToMainScreen" />
                </html:button>
            </td>
            <td class="right">
                <html:button property="search" onclick="gscm.submitSearch('${searchAction}', this.form, '');" styleClass="search">
                    <bean:message key="button.search" />
                </html:button>
            </td>
        </tr>
    </table>
    <hr />
    <logic:notEmpty name="W4003Form" property="w4003ListDomainList">
        <%--
        -- buttons 2
        --%>
        <table class="gscm_search_button">
            <tr>
                <td>
                    <html:button property="update" onclick="gscm.commonSubmit('${updateAction}', this.form);" styleClass="update">
                        <bean:message key="button.update" />
                    </html:button>
                </td>
            </tr>
        </table>
        <%--
        -- page control
        --%>
        <table class="gscm_resultlist_button">
            <tr>
                <td class="right">
                    <%@ include file="/WEB-INF/jsp/includes/gscm/framework/pager.jspf"%>
                </td>
            </tr>
        </table>
        <%--
        -- search results
        --%>
        <table id="tablefix" class="gscm_resultlist">
            <colgroup>
                <col class="resultlist_check" />
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
                        <bean:message key="label.ck" />
                        <input type="checkbox" id="headerCheckbox" />
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
                        (<bean:write name="W4003Form" property="w4003ListDomain[0].weightUnitDisp" />)
                    </th>
                    <th>
                        <bean:message key="label.volume" /><br />
                        (<bean:write name="W4003Form" property="w4003ListDomain[0].volumeUnitDisp" />)
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
                <logic:iterate name="W4003Form" property="w4003ListDomainList" id="w4003ListDomain" indexId="index">
                    <ai:stripeline number="${index+1}" odd="gscm_odd" even="gscm_even">
                        <tr>
                            <td class="center">
                                <c:if test="${w4003ListDomain.disabledFlg == 'Y'}">
                                    <html:checkbox name="w4003ListDomain" property="selected" indexed="true" disabled="true" />
                                    <html:hidden name="w4003ListDomain" property="selected" indexed="true" value="on" />
                                </c:if>
                                <c:if test="${w4003ListDomain.disabledFlg != 'Y'}">
                                    <html:checkbox name="w4003ListDomain" property="selected" indexed="true" disabled="false" />
                                </c:if>
                                <html:hidden name="w4003ListDomain" property="disabledFlg" indexed="true" />
                            </td>
                            <td>
                                <bean:write name="w4003ListDomain" property="loadingCd" />
                            </td>
                            <td>
                                <bean:write name="w4003ListDomain" property="shipToCd" />
                            </td>
                            <td>
                                <bean:write name="w4003ListDomain" property="dngrItemFlg" />
                            </td>
                            <td>
                                <a href="#" onclick="showItemNoInfo('<bean:write name="w4003ListDomain" property="mainMark" />')" >
                                    <bean:write name="w4003ListDomain" property="mainMark" />
                                </a>
                            </td>
                            <td>
                                <bean:write name="w4003ListDomain" property="expRequestNo" />
                            </td>
                            <td class="right">
                                <bean:write name="w4003ListDomain" property="grossWeight" />
                            </td>
                            <td class="right">
                                <bean:write name="w4003ListDomain" property="volume" />
                            </td>
                            <td>
                                <bean:write name="w4003ListDomain" property="lastTrRcvDt" />
                            </td>
                            <td>
                                <bean:write name="w4003ListDomain" property="dueDt" />
                            </td>
                        </tr>
                    </ai:stripeline>
                </logic:iterate>
            </tbody>
        </table>
    </logic:notEmpty>
</html:form>

