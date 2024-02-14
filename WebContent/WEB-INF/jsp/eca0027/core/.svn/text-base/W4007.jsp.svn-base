<%--
 * W4007.jsp
 * 
 * JSP of staging actuality create screen.
 * 山作り実績Create画面のJSPです。
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 --%>

<%-- Action of the submit destination --%>
<%-- submit先のアクション --%>
<c:set var="moveToRegisterAction" scope="request">
    <html:rewrite action="/W4007MoveToRegister"></html:rewrite>
</c:set>
<c:set var="backToHeaderAction" scope="request">
    <html:rewrite action="/W4006Init"></html:rewrite>
</c:set>
<c:set var="backToMainScreenAction" scope="request">
    <html:rewrite action="/W4005Init"></html:rewrite>
</c:set>
<c:set var="searchAction" scope="request">
    <html:rewrite action="/W4007Search"></html:rewrite>
</c:set>
<c:set var="updateAction" scope="request">
    <html:rewrite action="/W4007Update"></html:rewrite>
</c:set>

<html:form action="/W4007Init" styleId="mainForm">
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
            <col class="search_shipper_cd" />
            <col class="search_ship_to_cd" />
            <col class="search_stg_instr_flg" />
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
                <bean:message key="label.shipperCd" />
            </th>
            <th>
                <bean:message key="label.nexusShipToCd" />
            </th>
            <th>
                <bean:message key="label.stgInstrFlg" />
            </th>
        </tr>
        <tr>
            <td>
                <bean:write name="W4007Form" property="w4007CriteriaDomain.whCompCd" />
            </td>
            <td>
                <bean:write name="W4007Form" property="w4007CriteriaDomain.whCd" />
            </td>
            <td>
                <bean:write name="W4007Form" property="w4007CriteriaDomain.trnsCd" />
            </td>
            <td>
                <bean:write name="W4007Form" property="w4007CriteriaDomain.containerSortingKey" />
            </td>
            <td >
                <bean:write name="W4007Form" property="w4007CriteriaDomain.trnsTypNm" />
            </td>
            <td>
                <html:text property="w4007CriteriaDomain.shipperCd" maxlength="5" styleClass="shipper_cd" errorStyleClass="shipper_cd gscm_error_class" />
            </td>
            <td>
                <html:text property="w4007CriteriaDomain.shipToCd" maxlength="7" styleClass="ship_to_cd" errorStyleClass="ship_to_cd gscm_error_class" />
            </td>
            <td>
                <html:select property="w4007CriteriaDomain.stgInstrItemFlg" styleClass="stg_instr_item_flg" errorStyleClass="stg_instr_item_flg gscm_error_class">
                    <html:options collection="flg" property="id" labelProperty="name" />
                </html:select>
            </td>
        </tr>
    </table>
    <%--
    -- search condition 2
    --%>
    <table class="gscm_search">
        <colgroup>
            <col class="search_stg_instr_no" />
            <col class="search_xmain_mark" />
            <col class="search_main_mark" />
            <col class="search_loading_cd" />
            <col class="search_last_tr_rcv_dt_from" />
            <col class="search_last_tr_rcv_dt_to" />
        </colgroup>
        <tr>
            <th>
                <bean:message key="label.stgInstrNo" />
            </th>
            <th>
                <bean:message key="label.xmainMark" />
            </th>
            <th>
                <bean:message key="label.mainMark" />
            </th>
            <th>
                <bean:message key="label.loadingCd" />
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
                <html:text property="w4007CriteriaDomain.stgInstrNo" maxlength="14" styleClass="stg_instr_no" errorStyleClass="stg_instr_no gscm_error_class" />
            </td>
            <td>
                <html:text property="w4007CriteriaDomain.xmainMark" maxlength="17" styleClass="xmain_mark" errorStyleClass="xmain_mark gscm_error_class" />
            </td>
            <td>
                <html:text property="w4007CriteriaDomain.mainMark" maxlength="17" styleClass="main_mark" errorStyleClass="main_mark gscm_error_class" />
            </td>
            <td>
                <html:select property="w4007CriteriaDomain.loadingCd" styleClass="loading_cd" errorStyleClass="loading_cd gscm_error_class">
                    <html:options collection="loadingCd" property="id" labelProperty="name" />
                </html:select>
            </td>
            <td>
                <html:text property="w4007CriteriaDomain.lastTrRcvDtFrom" maxlength="8" styleClass="last_tr_rcv_dt" errorStyleClass="last_tr_rcv_dt gscm_error_class" />
                <img src="images/gscm/library/Calendar.gif"
                    onClick = "gscm.writeCalendar('lastTrRcvDtFromDiv', 'mainForm', 'w4007CriteriaDomain.lastTrRcvDtFrom', '<bean:message key="format.screen.yyyymmdd" />', this);"/>
                <div id="lastTrRcvDtFromDiv"></div>
            </td>
            <td>
                <html:text property="w4007CriteriaDomain.lastTrRcvDtTo" maxlength="8" styleClass="last_tr_rcv_dt" errorStyleClass="last_tr_rcv_dt gscm_error_class" />
                <img src="images/gscm/library/Calendar.gif"
                    onClick = "gscm.writeCalendar('lastTrRcvDtToDiv', 'mainForm', 'w4007CriteriaDomain.lastTrRcvDtTo', '<bean:message key="format.screen.yyyymmdd" />', this);"/>
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
    <logic:notEmpty name="W4007Form" property="w4007ListDomainList">
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
                <col class="resultlist_shipper_cd" />
                <col class="resultlist_ship_to_cd" />
                <col class="resultlist_stg_instr_no" />
                <col class="resultlist_main_mark" />
                <col class="resultlist_loading_cd" />
                <col class="resultlist_gross_weight" />
                <col class="resultlist_volume" />
                <col class="resultlist_last_tr_rcv_dt" />
            </colgroup>
            <thead>
                <tr>
                    <th>
                        <bean:message key="label.ck" />
                        <input type="checkbox" id="headerCheckbox" />
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
                    <th>
                        <bean:message key="label.grossWeight" /><br />
                        (<bean:write name="W4007Form" property="w4007CriteriaDomain.weightUnitDisp" />)
                    </th>
                    <th>
                        <bean:message key="label.volume" /><br />
                        (<bean:write name="W4007Form" property="w4007CriteriaDomain.volumeUnitDisp" />)
                    </th>
                    <th>
                        <bean:message key="label.lastTrRcvDt" />
                    </th>
                </tr>
            </thead>
            <tbody>
                <logic:iterate name="W4007Form" property="w4007ListDomainList" id="w4007ListDomain" indexId="index">
                    <ai:stripeline number="${index+1}" odd="gscm_odd" even="gscm_even">
                        <tr>
                            <td class="center">
                                <c:if test="${w4007ListDomain.disabledFlg == 'Y'}">
                                    <html:checkbox name="w4007ListDomain" property="selected" indexed="true" disabled="true" />
                                    <html:hidden name="w4007ListDomain" property="selected" indexed="true" value="on" />
                                </c:if>
                                <c:if test="${w4007ListDomain.disabledFlg != 'Y'}">
                                    <html:checkbox name="w4007ListDomain" property="selected" indexed="true" disabled="false" />
                                </c:if>
                                <html:hidden name="w4007ListDomain" property="disabledFlg" indexed="true" />
                            </td>
                            <td>
                                <bean:write name="w4007ListDomain" property="shipperCd" />
                            </td>
                            <td>
                                <bean:write name="w4007ListDomain" property="shipToCd" />
                            </td>
                            <td>
                                <bean:write name="w4007ListDomain" property="stgInstrNo" />
                            </td>
                            <td>
                                <a href="#" onclick="showItemNoInfo('<bean:write name="w4007ListDomain" property="mainMarkOrXmainMark" />', '<bean:write name="w4007ListDomain" property="mainMarkTyp" />')" >
                                    <bean:write name="w4007ListDomain" property="mainMarkOrXmainMark" />
                                </a>
                            </td>
                            <td>
                                <bean:write name="w4007ListDomain" property="loadingCd" />
                            </td>
                            <td class="right">
                                <bean:write name="w4007ListDomain" property="grossWeight" />
                            </td>
                            <td class="right">
                                <bean:write name="w4007ListDomain" property="volume" />
                            </td>
                            <td>
                                <bean:write name="w4007ListDomain" property="lastTrRcvDt" />
                            </td>
                        </tr>
                    </ai:stripeline>
                </logic:iterate>
            </tbody>
        </table>
    </logic:notEmpty>
</html:form>
