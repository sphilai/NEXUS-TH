<%--
 * W2014.jsp
 * 
 * X-Tag Main画面のJSPです。
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 --%>
<html:form action="/W2014Search" styleId="mainForm">
    <%--
    -- search condition 1
    --%>
    <table class="gscm_search">
        <colgroup>
            <col class="search_cur_wh_comp_cd" />
            <col class="search_cur_wh_cd" />
            <col class="search_trns_cd" />
            <col class="search_container_sorting_key" />
            <col class="search_loading_cd" />
            <col class="search_ship_to_comp_cd" />
            <col class="search_xmain_mark" />
        </colgroup>
        <tr>
            <th>
                <bean:message key="label.curWhCompCd" />
            </th>
            <th>
                <bean:message key="label.curWhCd" />
            </th>
            <th>
                <bean:message key="label.trnsCd" />
            </th>
            <th>
                <bean:message key="label.containerSortingKey" />
            </th>
            <th>
                <bean:message key="label.loadingCd" />
            </th>
            <th>
                <bean:message key="label.shipToCompCd" />
            </th>
            <th>
                <bean:message key="label.xmainMark" />
            </th>
        </tr>
        <tr>
            <td>
                <html:text property="w2014CriteriaDomain.curWhCompCd" maxlength="5" styleClass="cur_wh_comp_cd gscm_required" errorStyleClass="cur_wh_comp_cd gscm_error_class" />
            </td>
            <td>
                <html:text property="w2014CriteriaDomain.curWhCd" maxlength="4" styleClass="cur_wh_cd gscm_required" errorStyleClass="cur_wh_cd gscm_error_class" />
            </td>
            <td>
                <html:select property="w2014CriteriaDomain.trnsCd" styleClass="trns_cd">
                    <html:options collection="trnsCd" property="id" labelProperty="name" />
                </html:select>
            </td>
            <td>
                <html:text property="w2014CriteriaDomain.containerSortingKey" maxlength="8" styleClass="container_sorting_key" errorStyleClass="container_sorting_key gscm_error_class" />
            </td>
            <td>
                <html:select property="w2014CriteriaDomain.loadingCd" styleClass="loading_cd">
                    <html:options collection="loadingCd" property="id" labelProperty="name" />
                </html:select>
            </td>
            <td>
                <html:text property="w2014CriteriaDomain.shipToCompCd" maxlength="5" styleClass="ship_to_comp_cd" errorStyleClass="ship_to_comp_cd gscm_error_class" />
            </td>
            <td>
                <html:text property="w2014CriteriaDomain.xmainMark" maxlength="20" styleClass="xmain_mark" errorStyleClass="xmain_mark gscm_error_class" />
            </td>
        </tr>
    </table>
    <%--
    -- search condition 2
    --%>
    <table class="gscm_search">
        <colgroup>
            <col class="search_shipper_cd" />
            <col class="search_main_mark" />
            <col class="search_issue_from_date" />
            <col class="search_issue_to_date" />
            <col class="search_xtag_packing_issuer_id" />
        </colgroup>
        <tr>
            <th>
                <bean:message key="label.shipperCd" />
            </th>
            <th>
                <bean:message key="label.mainMark" />
            </th>
            <th>
                <bean:message key="label.issueFromDate" />
            </th>
            <th>
                <bean:message key="label.issueToDate" />
            </th>
            <th>
                <bean:message key="label.xtagPackingIssuerId" />
            </th>
        </tr>
        <tr>
            <td>
                <html:text property="w2014CriteriaDomain.shipperCd" maxlength="3" styleClass="shipper_cd" errorStyleClass="shipper_cd gscm_error_class" />
            </td>
            <td>
                <html:text property="w2014CriteriaDomain.mainMark" maxlength="20" styleClass="main_mark" errorStyleClass="main_mark gscm_error_class" />
            </td>
            <td>
                <html:text property="w2014CriteriaDomain.issueFromDate" maxlength="8" styleClass="issue_from_date" errorStyleClass="issue_from_date gscm_error_class" />
                <img src="images/gscm/library/Calendar.gif"
                    onClick="gscm.writeCalendar('issueFromDateDiv', 'mainForm', 'w2014CriteriaDomain.issueFromDate', '<bean:message key="format.screen.yyyymmdd" />', this);"/>
                <div id="issueFromDateDiv" style="float:left;"></div>
            </td>
            <td>
                <html:text property="w2014CriteriaDomain.issueToDate" maxlength="8" styleClass="issue_to_date" errorStyleClass="issue_to_date gscm_error_class" />
                <img src="images/gscm/library/Calendar.gif"
                    onClick = "gscm.writeCalendar('issueToDateDiv', 'mainForm', 'w2014CriteriaDomain.issueToDate', '<bean:message key="format.screen.yyyymmdd" />', this);"/>
                <div id="issueToDateDiv" style="float:left;"></div>
            </td>
            <td>
                <html:select property="w2014CriteriaDomain.xtagPackingIssuerId" styleClass="xtag_packing_issuer_id">
                    <html:options collection="issuer" property="id" labelProperty="name" />
                </html:select>
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
                <html:button property="createNew" styleClass="create_new" onclick="gscm.commonSubmit('W2014CreateNew.do', this.form);">
                    <bean:message key="button.createNew" />
                </html:button>
            </td>
            <td class="right">
                <html:button property="search" styleClass="search" onclick="gscm.submitSearch('W2014Search.do', this.form, '');">
                    <bean:message key="button.search" />
                </html:button>
            </td>
        </tr>
    </table>
    <hr />
    
    <c:if test="${W2014Form.displayList}">
        <%--
        -- buttons 2
        --%>
        <table class="gscm_resultlist_button">
            <colgroup>
                <col />
            </colgroup>
            <tr>
                <td>
                    <html:button property="confirmDetail" styleClass="confirm_detail" onclick="gscm.commonSubmit('W2014ConfirmDetail.do', this.form);">
                        <bean:message key="button.confirmDetail" />
                    </html:button>
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
                <td class="right" style="padding-right: 20px;">
                    <%@ include file="/WEB-INF/jsp/includes/gscm/framework/pager.jspf"%>
                </td>
            </tr>
        </table>
        <%--
        -- search results
        --%>
        <table id="tablefix" class="gscm_resultlist">
            <colgroup>
                <col class="resultlist_checked_key" />
                <col class="resultlist_cur_wh_comp_cd" />
                <col class="resultlist_cur_wh_cd" />
                <col class="resultlist_trns_cd" />
                <col class="resultlist_container_sorting_key" />
                <col class="resultlist_loading_cd" />
                <col class="resultlist_ship_to_comp_cd" />
                <col class="resultlist_xmain_mark" />
                <col class="resultlist_total_shipper" />
                <col class="resultlist_xtag_packing_dt" />
                <col class="resultlist_xtag_packing_issuer_nm" />
            </colgroup>
            <tr>
                <th>
                    <bean:message key="label.ck" />
                </th>
                <th>
                    <bean:message key="label.curWhCompCd" />
                </th>
                <th>
                    <bean:message key="label.curWhCd" />
                </th>
                <th>
                    <bean:message key="label.trnsCd" />
                </th>
                <th>
                    <bean:message key="label.containerSortingKey" />
                </th>
                <th>
                    <bean:message key="label.loadingCd" />
                </th>
                <th>
                    <bean:message key="label.shipToCompCd" />
                </th>
                <th>
                    <bean:message key="label.xmainMark" />
                </th>
                <th>
                    <bean:message key="label.totalShipper" />
                </th>
                <th>
                    <bean:message key="label.xtagPackingDt" />
                </th>
                <th>
                    <bean:message key="label.xtagPackingIssuerNm" />
                </th>
            </tr>
            <logic:iterate name="W2014Form" property="listDomainList" id="listDomainList" indexId="idx">
                <ai:stripeline number="${idx + 1}" odd="gscm_odd" even="gscm_even">
                    <tr>
                        <td class="center">
                            <html:radio property="xmainMark" value="${listDomainList.xmainMark}" />
                        </td>
                        <td>
                            <bean:write name="listDomainList" property="curWhCompCd" />
                        </td>
                        <td>
                            <bean:write name="listDomainList" property="curWhCd" />
                        </td>
                        <td>
                            <bean:write name="listDomainList" property="trnsCd" />
                        </td>
                        <td>
                            <bean:write name="listDomainList" property="containerSortingKey" />
                        </td>
                        <td>
                            <bean:write name="listDomainList" property="loadingCd" />
                        </td>
                        <td>
                            <bean:write name="listDomainList" property="shipToCompCd" />
                        </td>
                        <td>
                            <html:text name="listDomainList" property="xmainMark" indexed="true" styleClass="w2014_xmain_mark_disptext gscm_disptext" readonly="true" />
                        </td>
                        <td class="right">
                            <bean:write name="listDomainList" property="totalShipper" />
                        </td>
                        <td>
                            <bean:write name="listDomainList" property="xtagPackingDt" />
                        </td>
                        <td>
                            <html:text name="listDomainList" property="xtagPackingIssuerNm" indexed="true" styleClass="w2014_xtag_packing_issuer_nm_disptext gscm_disptext" readonly="true" />
                        </td>
                    </tr>
                </ai:stripeline>
            </logic:iterate>
        </table>
    </c:if>
    
    <%--
    -- hidden
    --%>
    <html:hidden property="callScreenId" />
</html:form>
