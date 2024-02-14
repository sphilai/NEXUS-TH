<%--
 * W4005.jsp
 * 
 * JSP of staging actuality main screen.
 * 山作り実績Main画面のJSPです。
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 --%>

<%-- Action of the submit destination --%>
<%-- submit先のアクション --%>
<c:set var="searchAction" scope="request">
    <html:rewrite action="/W4005Search"></html:rewrite>
</c:set>
<c:set var="createNewAction" scope="request">
    <html:rewrite action="/W4005CreateNew"></html:rewrite>
</c:set>
<c:set var="confirmDetailAction" scope="request">
    <html:rewrite action="/W4005ConfirmDetail"></html:rewrite>
</c:set>

<html:form action="/W4005Init" styleId="mainForm">
    <%--
    -- search condition 1
    --%>
    <table class="gscm_search">
        <colgroup>
            <col class="search_wh_comp_cd" />
            <col class="search_wh_cd" />
            <col class="search_trns_cd" />
            <col class="search_container_sorting_key" />
            <col class="search_stg_act_no" />
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
                <bean:message key="label.stgActNo" />
            </th>
            <th>
                <bean:message key="label.stgInstrNo" />
            </th>
        </tr>
        <tr>
            <td>
                <html:text property="w4005CriteriaDomain.whCompCd" maxlength="5" styleClass="wh_comp_cd gscm_required" errorStyleClass="wh_comp_cd gscm_error_class" />
            </td>
            <td>
                <html:text property="w4005CriteriaDomain.whCd" maxlength="4" styleClass="wh_cd gscm_required" errorStyleClass="wh_cd gscm_error_class" />
            </td>
            <td>
                <html:select property="w4005CriteriaDomain.trnsCd" styleClass="trns_cd" errorStyleClass="trns_cd gscm_error_class">
                    <html:options collection="trnsCd" property="id" labelProperty="name" />
                </html:select>
            </td>
            <td>
                <html:text property="w4005CriteriaDomain.containerSortingKey" maxlength="8" styleClass="container_sorting_key" errorStyleClass="container_sorting_key gscm_error_class" />
            </td>
            <td>
                <html:text property="w4005CriteriaDomain.stgActNo" maxlength="19" styleClass="stg_act_no" errorStyleClass="stg_act_no gscm_error_class" />
            </td>
            <td>
                <html:text property="w4005CriteriaDomain.stgInstrNo" maxlength="14" styleClass="stg_instr_no" errorStyleClass="stg_instr_no gscm_error_class" />
            </td>
        </tr>
    </table>
    <%--
    -- search condition 2
    --%>
    <table class="gscm_search">
        <colgroup>
            <col class="search_stg_act_dt_from" />
            <col class="search_stg_act_dt_to" />
            <col class="search_stg_act_issuer_id" />
            <col class="search_shipper_cd" />
            <col class="search_xmain_mark" />
            <col class="search_main_mark" />
        </colgroup>
        <tr>
            <th>
                <bean:message key="label.stgActDtFrom" />
            </th>
            <th>
                <bean:message key="label.stgActDtTo" />
            </th>
            <th>
                <bean:message key="label.stgActIssuerId" />
            </th>
            <th>
                <bean:message key="label.shipperCd" />
            </th>
            <th>
                <bean:message key="label.xmainMark" />
            </th>
            <th>
                <bean:message key="label.mainMark" />
            </th>
        </tr>
        <tr>
            <td>
                <html:text property="w4005CriteriaDomain.stgActDtFrom" maxlength="8" styleClass="stg_act_dt" errorStyleClass="stg_act_dt gscm_error_class" />
                <img src="images/gscm/library/Calendar.gif"
                    onClick = "gscm.writeCalendar('fmIssueDateDiv', 'mainForm', 'w4005CriteriaDomain.stgActDtFrom', '<bean:message key="format.screen.yyyymmdd" />', this);"/>
                <div id="fmIssueDateDiv"></div>
            </td>
            <td>
                <html:text property="w4005CriteriaDomain.stgActDtTo" maxlength="8" styleClass="stg_act_dt" errorStyleClass="stg_act_dt gscm_error_class" />
                <img src="images/gscm/library/Calendar.gif"
                    onClick = "gscm.writeCalendar('toIssueDateDiv', 'mainForm', 'w4005CriteriaDomain.stgActDtTo', '<bean:message key="format.screen.yyyymmdd" />', this);"/>
                <div id="toIssueDateDiv"></div>
            </td>
            <td>
                <html:select property="w4005CriteriaDomain.stgActIssuerId" styleClass="stg_act_issuer_id" errorStyleClass="stg_act_issuer_id gscm_error_class">
                    <html:options collection="issuer" property="id" labelProperty="name" />
                </html:select>
            </td>
            <td>
                <html:text property="w4005CriteriaDomain.shipperCd" maxlength="5" styleClass="shipper_cd" errorStyleClass="shipper_cd gscm_error_class" />
            </td>
            <td>
                <html:text property="w4005CriteriaDomain.xmainMark" maxlength="17" styleClass="xmain_mark" errorStyleClass="xmain_mark gscm_error_class" />
            </td>
            <td>
                <html:text property="w4005CriteriaDomain.mainMark" maxlength="17" styleClass="main_mark" errorStyleClass="main_mark gscm_error_class" />
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
    <logic:notEmpty name="W4005Form" property="w4005ListDomainList">
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
                <col class="resultlist_stg_act_no" />
                <col class="resultlist_stg_act_dt" />
                <col class="resultlist_stg_act_issuer_nm" />
                <col class="resultlist_etd" />
                <col class="resultlist_carrier_comp_cd" />
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
                    <th >
                        <bean:message key="label.trnsCd" />
                    </th>
                    <th >
                        <bean:message key="label.containerSortingKey" />
                    </th>
                    <th >
                        <bean:message key="label.stgActNo" />
                    </th>
                    <th >
                        <bean:message key="label.stgActDt" />
                    </th>
                    <th >
                        <bean:message key="label.stgActIssuerNm" />
                    </th>
                    <th >
                        <bean:message key="label.etd" />
                    </th>
                    <th >
                        <bean:message key="label.carrierCompCd" />
                    </th>
                </tr>
            </thead>
            <tbody>
                <logic:iterate name="W4005Form" property="w4005ListDomainList" id="w4005ListDomain" indexId="index">
                    <ai:stripeline number="${index+1}" odd="gscm_odd" even="gscm_even">
                        <tr class="gscm_odd">
                            <td class="center">
                                <html:radio property="stgActNo" value="${w4005ListDomain.stgActNo}" />
                            </td>
                            <td>
                                <bean:write name="w4005ListDomain" property="whCompCd" />
                            </td>
                            <td >
                                <bean:write name="w4005ListDomain" property="whCd" />
                            </td>
                            <td >
                                <bean:write name="w4005ListDomain" property="trnsCd" />
                            </td>
                            <td >
                                <bean:write name="w4005ListDomain" property="containerSortingKey" />
                            </td>
                            <td >
                                <bean:write name="w4005ListDomain" property="stgActNo" />
                            </td>
                            <td >
                                <bean:write name="w4005ListDomain" property="stgActDt" />
                            </td>
                            <td >
                                <html:text name="w4005ListDomain" property="stgActIssuerNm" indexed="true" styleClass="stg_act_issuer_nm gscm_disptext" readonly="true" tabindex="-1" />
                            </td>
                            <td >
                                <bean:write name="w4005ListDomain" property="etd" />
                            </td>
                            <td >
                                <bean:write name="w4005ListDomain" property="carrierCompCd" />
                            </td>
                        </tr>
                    </ai:stripeline>
                </logic:iterate>
            </tbody>
        </table>
    </logic:notEmpty>
</html:form>
