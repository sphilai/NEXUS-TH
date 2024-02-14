<%--
 * W2009.jsp
 * 
 * CML Main 画面のJSPです。
 * 
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 --%>
<html:form action="/W2009Init" styleId="mainForm">
    <%--
    -- search condition 1
    --%>
    <table class="gscm_search">
        <colgroup>
            <col class="search_shipper_cd" />
            <col class="search_customer_cd" />
            <col class="search_lgcy_ship_to" />
            <col class="search_trns_cd" />
            <col class="search_main_mark" />
            <col class="search_plnt_cd" />
            <col class="search_lgcy_wh_cd" />
            <col class="search_packing_wh_comp_cd" />
            <col class="search_packing_wh_cd" />
            <col class="search_pltz_instr_no" />
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
                <bean:message key="label.mainMark" />
            </th>
            <th>
                <bean:message key="label.plntCd" />
            </th>
            <th>
                <bean:message key="label.lgcyWhCd" />
            </th>
            <th>
                <bean:message key="label.packingWhCompCd" />
            </th>
            <th>
                <bean:message key="label.packingWhCd" />
            </th>
            <th>
                <bean:message key="label.pltzInstrNo" />
            </th>
        </tr>
        <tr>
            <td>
                <html:text property="w2009CriteriaDomain.shipperCd" maxlength="3" styleClass="shipper_cd gscm_required" errorStyleClass="shipper_cd gscm_error_class" />
            </td>
            <td>
                <html:text property="w2009CriteriaDomain.customerCd" maxlength="8" styleClass="customer_cd" errorStyleClass="customer_cd gscm_error_class" />
            </td>
            <td>
                <html:text property="w2009CriteriaDomain.lgcyShipTo" maxlength="2" styleClass="w2009_lgcy_ship_to" errorStyleClass="w2009_lgcy_ship_to gscm_error_class" />
            </td>
            <td>
                <html:select property="w2009CriteriaDomain.trnsCd" styleClass="w2009_trns_cd" errorStyleClass="w2009_trns_cd gscm_error_class" >
                    <html:options collection="trnsCd" property="id" labelProperty="name" />
                </html:select>
            </td>
            <td>
                <html:text property="w2009CriteriaDomain.mainMark" maxlength="20" styleClass="w2009_main_mark" errorStyleClass="w2009_main_mark gscm_error_class" />
            </td>
            <td>
                <html:text property="w2009CriteriaDomain.plntCd" maxlength="2" styleClass="w2009_plnt_cd" errorStyleClass="w2009_plnt_cd gscm_error_class" />
            </td>
            <td>
                <html:text property="w2009CriteriaDomain.lgcyWhCd" maxlength="1" styleClass="lgcy_wh_cd" errorStyleClass="lgcy_wh_cd gscm_error_class" />
            </td>
            <td>
                <html:text property="w2009CriteriaDomain.packingWhCompCd" maxlength="5" styleClass="packing_wh_comp_cd" errorStyleClass="packing_wh_comp_cd gscm_error_class" />
            </td>
            <td>
                <html:text property="w2009CriteriaDomain.packingWhCd" maxlength="4" styleClass="packing_wh_cd" errorStyleClass="packing_wh_cd gscm_error_class" />
            </td>
            <td>
                <html:text property="w2009CriteriaDomain.pltzInstrNo" maxlength="10" styleClass="pltz_instr_no" errorStyleClass="pltz_instr_no gscm_error_class" />
            </td>
        </tr>
    </table>
    <%--
    -- search condition 2
    --%>
    <table class="gscm_search">
        <colgroup>
            <col class="search_container_sorting_key" />
            <col class="search_mix_tag_no" />
            <col class="search_pltz_item_no" />
            <col class="search_pkg_cd" />
            <col class="search_revise_flg" />
            <col class="search_issue_from_date" />
            <col class="search_issue_to_date" />
            <col class="search_exp_packing_issuer_id" />
        </colgroup>
        <tr>
            <th>
                <bean:message key="label.containerSortingKey" />
            </th>
            <th>
                <bean:message key="label.mixTagNo" />
            </th>
            <th>
                <bean:message key="label.pltzItemNo" />
            </th>
            <th>
                <bean:message key="label.pkgCd" />
            </th>
            <th>
                <bean:message key="label.reviseFlg" />
            </th>
            <th>
                <bean:message key="label.issueFromDate" />
            </th>
            <th>
                <bean:message key="label.issueToDate" />
            </th>
            <th>
                <bean:message key="label.expPackingIssuerId" />
            </th>
        </tr>
        <tr>
            <td>
                <html:text property="w2009CriteriaDomain.containerSortingKey" maxlength="8" styleClass="container_sorting_key" errorStyleClass="container_sorting_key gscm_error_class" />
            </td>
            <td>
                <html:text property="w2009CriteriaDomain.mixTagNo" maxlength="17" styleClass="mix_tag_no" errorStyleClass="mix_tag_no gscm_error_class" />
            </td>
            <td>
                <html:text property="w2009CriteriaDomain.pltzItemNo" maxlength="27" styleClass="pltz_item_no" errorStyleClass="pltz_item_no gscm_error_class" />
            </td>
            <td>
                <html:text property="w2009CriteriaDomain.pkgCd" maxlength="3" styleClass="pkg_cd" errorStyleClass="pkg_cd gscm_error_class" />
            </td>
            <td>
                <html:select property="w2009CriteriaDomain.reviseFlg" styleClass="revise_flg" errorStyleClass="revise_flg gscm_error_class" >
                    <html:options collection="flag" property="id" labelProperty="name"/>
                </html:select>
            </td>
            <td>
                <html:text property="w2009CriteriaDomain.issueFromDate" maxlength="8" styleClass="issue_from_date" errorStyleClass="issue_from_date gscm_error_class" />
                <img src="images/gscm/library/Calendar.gif"
                    onClick = "gscm.writeCalendar('issueFromDateDiv', 'mainForm', 'w2009CriteriaDomain.issueFromDate', '<bean:message key="format.screen.yyyymmdd" />', this);"/>
                <div id="issueFromDateDiv" style="float:left;"></div>
            </td>
            <td>
                <html:text property="w2009CriteriaDomain.issueToDate" maxlength="8" styleClass="issue_to_date" errorStyleClass="issue_to_date gscm_error_class" />
                <img src="images/gscm/library/Calendar.gif"
                    onClick = "gscm.writeCalendar('issueToDateDiv', 'mainForm', 'w2009CriteriaDomain.issueToDate', '<bean:message key="format.screen.yyyymmdd" />', this);"/>
                <div id="issueToDateDiv" style="float:left;"></div>
            </td>
            <td>
                <html:select property="w2009CriteriaDomain.expPackingIssuerId" styleClass="exp_packing_issuer_id" errorStyleClass="exp_packing_issuer_id gscm_error_class" >
                    <html:options collection="issuer" property="id" labelProperty="name"/>
                </html:select>
            </td>
        </tr>
    </table>
    <%--
    -- search condition 3
    --%>
    <table class="gscm_search">
        <colgroup>
            <col class="search_from_main_mark" />
            <col class="search_to_main_mark" />
        </colgroup>
        <tr>
            <th>
                <bean:message key="label.fromMainMark" />
            </th>
            <th>
                <bean:message key="label.toMainMark" />
            </th>
        </tr>
        <tr>
            <td>
                <html:text property="w2009CriteriaDomain.fromMainMark" maxlength="20" styleClass="w2009_main_mark" errorStyleClass="w2009_main_mark gscm_error_class" />
            </td>
            <td>
                <html:text property="w2009CriteriaDomain.toMainMark" maxlength="20" styleClass="w2009_main_mark" errorStyleClass="w2009_main_mark gscm_error_class" />
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
                <html:button property="createNew" styleClass="create_new" onclick="gscm.commonSubmit('W2009CreateNew.do', this.form);">
                    <bean:message key="button.createNew" />
                </html:button>
            </td>
            <td class="right">
                <html:button property="search" styleClass="search" onclick="gscm.commonSubmit('W2009Search.do', this.form);">
                    <bean:message key="button.search" />
                </html:button>
            </td>
        </tr>
    </table>
    <hr />
    
    <c:if test="${W2009Form.displayList}">
        <%-- 
        -- buttons 2 
        --%>
        <table class="gscm_resultlist_button">
            <colgroup>
                <col />
            </colgroup>
            <tr>
                <td>
                    <html:button property="confirmDetail" styleClass="confirm_detail" onclick="gscm.commonSubmit('W2009ConfirmDetail.do', this.form);">
                        <bean:message key="button.confirmDetail" />
                    </html:button>
                    <html:button property="transPkgRevise" styleClass="trans_pkg_revise" onclick="gscm.commonSubmit('W2009TransPkgRevise.do', this.form);">
                        <bean:message key="button.transPKGRevise" />
                    </html:button>
                    <html:button property="printMultiCml" styleClass="print_multi_cml" onclick="clearMessage(); gscm.commonSubmitForCheck('W2009PrintMultiCml.do', this.form, 'false', 'false');">
                        <bean:message key="button.printMultiCml" />
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
                <td class="right">
                    <%@ include file="/WEB-INF/jsp/includes/gscm/framework/pager.jspf"%>
                </td>
            </tr>
        </table>
        <%--
        -- search results
        --%>
        <table id="tablefix" class="gscm_resultlist double">
            <colgroup>
                <col class="resultlist_checked_key" />
                <col class="resultlist_shipper_cd" />
                <col class="resultlist_customer_cd" />
                <col class="resultlist_lgcy_ship_to" />
                <col class="resultlist_trns_cd" />
                <col class="resultlist_main_mark" />
                <col class="resultlist_plnt_cd" />
                <col class="resultlist_lgcy_wh_cd" />
                <col class="resultlist_packing_wh_comp_cd" />
                <col class="resultlist_pltz_instr_no" />
                <col class="resultlist_container_sorting_key" />
                <col class="resultlist_loading_cd" />
                <col class="resultlist_revise_flg" />
                <col class="resultlist_exp_packing_dt" />
            </colgroup>
            <tr>
                <th rowspan="2">
                    <bean:message key="label.ck" />
                </th>
                <th rowspan="2">
                    <bean:message key="label.shipperCd" />
                </th>
                <th rowspan="2">
                    <bean:message key="label.customerCd" />
                </th>
                <th rowspan="2">
                    <bean:message key="label.lgcyShipTo" />
                </th>
                <th rowspan="2">
                    <bean:message key="label.trnsCd" />
                </th>
                <th rowspan="2">
                    <bean:message key="label.mainMark" />
                </th>
                <th rowspan="2">
                    <bean:message key="label.plntCd" />
                </th>
                <th rowspan="2">
                    <bean:message key="label.lgcyWhCd" />
                </th>
                <th>
                    <bean:message key="label.packingWhCompCd" />
                </th>
                <th rowspan="2">
                    <bean:message key="label.pltzInstrNo" />
                </th>
                <th rowspan="2">
                    <bean:message key="label.containerSortingKey" />
                </th>
                <th rowspan="2">
                    <bean:message key="label.loadingCd" />
                </th>
                <th rowspan="2">
                    <bean:message key="label.reviseFlg" />
                </th>
                <th>
                    <bean:message key="label.expPackingDt" />
                </th>
            </tr>
            <tr>
                <th>
                    <bean:message key="label.packingWhCd" />
                </th>
                <th>
                    <bean:message key="label.expPackingIssuerNm" />
                </th>
            </tr>
            <logic:iterate name="W2009Form" property="listDomainList" id="listDomainList" indexId="idx">
                <ai:stripeline number="${idx + 1}" odd="gscm_odd" even="gscm_even">
                    <tr>
                        <td rowspan="2" class="center">
                            <html:radio property="w2009CriteriaDomain.selected" value="${idx}:${listDomainList.mainMark}:${listDomainList.authFlg}" errorStyle="gscm_error_class" />
                        </td>
                        <td rowspan="2">
                            <bean:write name="listDomainList" property="shipperCd" />
                        </td>
                        <td rowspan="2">
                            <bean:write name="listDomainList" property="customerCd" />
                        </td>
                        <td rowspan="2">
                            <bean:write name="listDomainList" property="lgcyShipTo" />
                        </td>
                        <td rowspan="2">
                            <bean:write name="listDomainList" property="trnsCd" />
                        </td>
                        <td rowspan="2">
                            <html:text name="listDomainList" property="mainMark" indexed="true" styleClass="w2009_main_mark_disptext gscm_disptext" errorStyleClass=" main_mark_disptext gscm_disptext gscm_error_class"  readonly="true" />
                        </td>
                        <td rowspan="2">
                            <bean:write name="listDomainList" property="plntCd" />
                        </td>
                        <td rowspan="2">
                            <bean:write name="listDomainList" property="lgcyWhCd" />
                        </td>
                        <td>
                            <bean:write name="listDomainList" property="packingWhCompCd" />
                        </td>
                        <td rowspan="2">
                            <bean:write name="listDomainList" property="pltzInstrNo" />
                        </td>
                        <td rowspan="2">
                            <bean:write name="listDomainList" property="containerSortingKey" />
                        </td>
                        <td rowspan="2">
                            <bean:write name="listDomainList" property="loadingCd" />
                        </td>
                        <td rowspan="2">
                            <bean:write name="listDomainList" property="reviseFlg" />
                        </td>
                        <td>
                            <bean:write name="listDomainList" property="expPackingDt" />
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <bean:write name="listDomainList" property="packingWhCd" />
                        </td>
                        <td>
                            <html:text name="listDomainList" property="expPackingIssuerNm" indexed="true" styleClass="w2009_exp_packing_issuer_nm_disptext gscm_disptext" readonly="true" />
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
