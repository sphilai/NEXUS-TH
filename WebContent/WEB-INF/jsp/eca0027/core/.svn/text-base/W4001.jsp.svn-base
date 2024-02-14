<%--
 * W4001.jsp
 * 
 * JSP of staging instruction main screen.
 * 荷揃え指示Main画面のJSPです。
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 --%>

<%-- Action of the submit destination --%>
<%-- submit先のアクション --%>
<c:set var="searchAction" scope="request">
    <html:rewrite action="/W4001Search"></html:rewrite>
</c:set>
<c:set var="createNewAction" scope="request">
    <html:rewrite action="/W4001CreateNew"></html:rewrite>
</c:set>
<c:set var="confirmDetailAction" scope="request">
    <html:rewrite action="/W4001ConfirmDetail"></html:rewrite>
</c:set>

<html:form action="/W4001Init" styleId="mainForm">
    <%--
    -- search condition 1
    --%>
    <table class="gscm_search">
        <colgroup>
            <col class="search_wh_comp_cd" />
            <col class="search_wh_cd" />
            <col class="search_trns_cd" />
            <col class="search_container_sorting_key" />
            <col class="search_container_loose_typ" />
            <col class="search_custom_timing_typ" />
            <col class="search_shipper_cd" />
            <col class="search_stg_instr_no" />
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
                <bean:message key="label.containerLooseTyp" />
            </th>
            <th>
                <bean:message key="label.customTimingTyp" />
            </th>
            <th>
                <bean:message key="label.shipperCd" />
            </th>
            <th>
                <bean:message key="label.stgInstrNo" />
            </th>
        </tr>
        <tr>
            <td>
                <html:text property="w4001CriteriaDomain.whCompCd" maxlength="5" styleClass="wh_comp_cd gscm_required" errorStyleClass="wh_comp_cd gscm_error_class" />
            </td>
            <td>
                <html:text property="w4001CriteriaDomain.whCd" maxlength="4" styleClass="wh_cd gscm_required" errorStyleClass="wh_cd gscm_error_class" />
            </td>
            <td>
                <html:select property="w4001CriteriaDomain.trnsCd" styleClass="trns_cd" errorStyleClass="trns_cd gscm_error_class">
                    <html:options collection="trnsCd" property="id" labelProperty="name" />
                </html:select>
            </td>
            <td>
                <html:text property="w4001CriteriaDomain.containerSortingKey" maxlength="8" styleClass="container_sorting_key" errorStyleClass="container_sorting_key gscm_error_class" />
            </td>
            <td>
                <html:select property="w4001CriteriaDomain.containerLooseTyp" styleClass="container_loose_typ" errorStyleClass="container_loose_typ gscm_error_class">
                    <html:options collection="containerLooseTyp" property="id" labelProperty="name" />
                </html:select>
            </td>
            <td>
                <html:select property="w4001CriteriaDomain.customTimingTyp" styleClass="custom_timing_typ" errorStyleClass="custom_timing_typ gscm_error_class">
                    <html:options collection="customTimingTyp" property="id" labelProperty="name" />
                </html:select>
            </td>
            <td>
                <html:text property="w4001CriteriaDomain.shipperCd" maxlength="5" styleClass="shipper_cd" errorStyleClass="shipper_cd gscm_error_class" />
            </td>
            <td>
                <html:text property="w4001CriteriaDomain.stgInstrNo" maxlength="14" styleClass="stg_instr_no" errorStyleClass="stg_instr_no gscm_error_class" />
            </td>
        </tr>
    </table>
    <%--
    -- search condition 2
    --%>
    <table class="gscm_search">
        <colgroup>
            <col class="search_stg_instr_status" />
            <col class="search_stg_instr_dt_from" />
            <col class="search_stg_instr_dt_to" />
            <col class="search_stg_instr_issuer_id" />
            <col class="search_worked_id" />
            <col class="search_exp_request_no" />
            <col class="search_main_mark" />
        </colgroup>
        <tr>
            <th>
                <bean:message key="label.stgInstrStatus" />
            </th>
            <th>
                <bean:message key="label.stgInstrDtFrom" />
            </th>
            <th>
                <bean:message key="label.stgInstrDtTo" />
            </th>
            <th>
                <bean:message key="label.stgInstrIssuerId" />
            </th>
            <th>
                <bean:message key="label.worker" />
            </th>
            <th>
                <bean:message key="label.expRequestNo" />
            </th>
            <th>
                <bean:message key="label.mainMark" />
            </th>
        </tr>
        <tr>
            <td>
                <html:select property="w4001CriteriaDomain.stgInstrStatus" styleClass="stg_instr_status" errorStyleClass="stg_instr_status gscm_error_class">
                    <html:options collection="stgInstrStatus" property="id" labelProperty="name" />
                </html:select>
            </td>
            <td>
                <html:text property="w4001CriteriaDomain.stgInstrDtFrom" maxlength="8" styleClass="stg_instr_dt" errorStyleClass="stg_instr_dt gscm_error_class" />
                <img src="images/gscm/library/Calendar.gif"
                    onClick = "gscm.writeCalendar('fmIssueDateDiv', 'mainForm', 'w4001CriteriaDomain.stgInstrDtFrom', '<bean:message key="format.screen.yyyymmdd" />', this);"/>
                <div id="fmIssueDateDiv"></div>
            </td>
            <td>
                <html:text property="w4001CriteriaDomain.stgInstrDtTo" maxlength="8" styleClass="stg_instr_dt" errorStyleClass="stg_instr_dt gscm_error_class" />
                <img src="images/gscm/library/Calendar.gif"
                    onClick = "gscm.writeCalendar('toIssueDateDiv', 'mainForm', 'w4001CriteriaDomain.stgInstrDtTo', '<bean:message key="format.screen.yyyymmdd" />', this);"/>
                <div id="toIssueDateDiv"></div>
            </td>
            <td>
                <html:select property="w4001CriteriaDomain.stgInstrIssuerId" styleClass="stg_instr_issuer_id" errorStyleClass="stg_instr_issuer_id gscm_error_class">
                    <html:options collection="issuer" property="id" labelProperty="name" />
                </html:select>
            </td>
            <td>
                <html:select property="w4001CriteriaDomain.workedId" styleClass="stg_instr_worked_id" errorStyleClass="stg_instr_worked_id gscm_error_class">
                    <html:options collection="worker" property="id" labelProperty="name" />
                </html:select>
            </td>
            <td>
                <html:text property="w4001CriteriaDomain.expRequestNo" maxlength="12" styleClass="exp_request_no" errorStyleClass="exp_request_no gscm_error_class" />
            </td>
            <td>
                <html:text property="w4001CriteriaDomain.mainMark" maxlength="17" styleClass="main_mark" errorStyleClass="main_mark gscm_error_class" />
            </td>
        </tr>
    </table>
    <%--
    -- buttons 1
    --%>
    <table class="gscm_search_button">
        <tr>
            <td>
                <html:button property="createNew" onclick="gscm.commonSubmit('${createNewAction}', this.form);" styleClass="create_new">
                    <bean:message key="button.createNew" />
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
    <logic:notEmpty name="W4001Form" property="w4001ListDomainList">
        <%--
        -- buttons 2
        --%>
        <table class="gscm_search_button">
            <tr>
                <td>
                    <html:button property="confirmDetail" onclick="gscm.commonSubmit('${confirmDetailAction}', this.form);" styleClass="confirm_detail">
                        <bean:message key="button.confirmDetail" />
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
                <col class="resultlist_ck" />
                <col class="resultlist_wh_comp_cd" />
                <col class="resultlist_wh_cd" />
                <col class="resultlist_trns_cd" />
                <col class="resultlist_container_sorting_key" />
                <col class="resultlist_container_loose_typ" />
                <col class="resultlist_custom_timing_typ" />
                <col class="resultlist_shipper_cd" />
                <col class="resultlist_stg_instr_no" />
                <col class="resultlist_stg_instr_status" />
                <col class="resultlist_etd" />
                <col class="resultlist_stg_instr_dt" />
                <col class="resultlist_stg_instr_issuer_nm" />
                <col class="resultlist_worked_dt" />
                <col class="resultlist_worked_meth_value" />
            </colgroup>
            <thead>
                <tr>
                    <th>
                        <bean:message key="label.ck" />
                    </th>
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
                        <bean:message key="label.containerLooseTyp" />
                    </th>
                    <th>
                        <bean:message key="label.customTimingTyp" />
                    </th>
                    <th>
                        <bean:message key="label.shipperCd" />
                    </th>
                    <th>
                        <bean:message key="label.stgInstrNo" />
                    </th>
                    <th>
                        <bean:message key="label.stgInstrStatus" />
                    </th>
                    <th>
                        <bean:message key="label.etd" />
                    </th>
                    <th>
                        <bean:message key="label.stgInstrDt" />
                    </th>
                    <th>
                        <bean:message key="label.stgInstrIssuerNm" />
                    </th>
                    <th>
                        <bean:message key="label.workedDt" />
                    </th>
                    <th>
                        <bean:message key="label.workedMethValue" />
                    </th>
                </tr>
            </thead>
            <tbody>
                <logic:iterate name="W4001Form" property="w4001ListDomainList" id="w4001ListDomain" indexId="index">
                    <ai:stripeline number="${index+1}" odd="gscm_odd" even="gscm_even">
                        <tr>
                            <td class="center">
                                <html:radio property="stgInstrNo" value="${w4001ListDomain.stgInstrNo}" />
                            </td>
                            <td>
                                <bean:write name="w4001ListDomain" property="whCompCd" />
                            </td>
                            <td>
                                <bean:write name="w4001ListDomain" property="whCd" />
                            </td>
                            <td >
                                <bean:write name="w4001ListDomain" property="trnsCd" />
                            </td>
                            <td >
                                <bean:write name="w4001ListDomain" property="containerSortingKey" />
                            </td>
                            <td >
                                <bean:write name="w4001ListDomain" property="containerLooseTyp" />
                            </td>
                            <td >
                                <bean:write name="w4001ListDomain" property="customTimingTyp" />
                            </td>
                            <td >
                                <bean:write name="w4001ListDomain" property="shipperCd" />
                            </td>
                            <td >
                                <bean:write name="w4001ListDomain" property="stgInstrNo" />
                            </td>
                            <td >
                                <bean:write name="w4001ListDomain" property="stgInstrStatus" />
                            </td>
                            <td >
                                <bean:write name="w4001ListDomain" property="etd" />
                            </td>
                            <td >
                                <bean:write name="w4001ListDomain" property="stgInstrDt" />
                            </td>
                            <td >
                                <html:text name="w4001ListDomain" property="stgInstrIssuerNm" indexed="true" styleClass="stg_instr_issuer_nm gscm_disptext" readonly="true" tabindex="-1" />
                            </td>
                            <td >
                                <bean:write name="w4001ListDomain" property="workedDt" />
                            </td>
                            <td >
                                <bean:write name="w4001ListDomain" property="workedMethValue" />
                            </td>
                        </tr>
                    </ai:stripeline>
                </logic:iterate>
            </tbody>
        </table>
    </logic:notEmpty>
</html:form>
