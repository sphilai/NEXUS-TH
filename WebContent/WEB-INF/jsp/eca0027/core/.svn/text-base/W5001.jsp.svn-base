<%--
 * W5001.jsp
 * 
 * JSP of shipping confirmation main screen.
 * 出荷確認MainScreen画面のJSPです。
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 --%>
<html:form action="/W5001Search" styleId="mainForm">
    <%--
    -- search condition 1
    --%>
    <table class="gscm_search">
        <colgroup>
            <col class="search_wh_comp_cd" />
            <col class="search_wh_cd" />
            <col class="search_trns_cd" />
            <col class="search_container_sorting_key" />
            <col class="search_shipping_firm_status" />
            <col class="search_shipping_firm_no" />
            <col class="search_container_loose_typ" />
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
                <bean:message key="label.shippingFirmStatus" />
            </th>
            <th>
                <bean:message key="label.shippingFirmNo" />
            </th>
            <th>
                <bean:message key="label.containerLooseTyp" />
            </th>
        </tr>
        <tr>
            <td>
                <html:text property="w5001CriteriaDomain.whCompCd" maxlength="5" 
                    styleClass="wh_comp_cd" errorStyleClass="wh_comp_cd gscm_error_class" />
            </td>
            <td>
                <html:text property="w5001CriteriaDomain.whCd" maxlength="4" styleClass="wh_cd" 
                    errorStyleClass="wh_cd gscm_error_class" />
            </td>
            <td>
                <html:select property="w5001CriteriaDomain.trnsCd" styleClass="trns_cd">
                    <html:options collection="trnsCd" property="id" labelProperty="name" />
                </html:select>
            </td>
            <td>
                <html:text property="w5001CriteriaDomain.containerSortingKey" maxlength="8" 
                    styleClass="container_sorting_key" 
                    errorStyleClass="container_sorting_key gscm_error_class" />
            </td>
            <td>
                <html:select property="w5001CriteriaDomain.shippingFirmStatus" 
                    styleClass="shipping_firm_status">
                    <html:options collection="shippingFirmStatus" property="id" 
                        labelProperty="name" />
                </html:select>
            </td>
            <td>
                <html:text property="w5001CriteriaDomain.shippingFirmNo" maxlength="14" 
                    styleClass="shipping_firm_no" 
                    errorStyleClass="shipping_firm_no gscm_error_class" />
            </td>
            <td>
                <html:select property="w5001CriteriaDomain.containerLooseTyp" 
                    styleClass="container_loose_typ">
                    <html:options collection="containerLooseTyp" property="id" 
                        labelProperty="name" />
                </html:select>
            </td>
        </tr>
    </table>
    <%--
    -- search condition 2
    --%>
    <table class="gscm_search">
        <colgroup>
            <col class="search_fmEtd" />
            <col class="search_toEtd" />
            <col class="search_carrierCompCd" />
            <col class="search_containerNo" />
            <col class="search_issuer" />
            <col class="search_worker" />
        </colgroup>
        <tr>
            <th>
                <bean:message key="label.fmEtd" />
            </th>
            <th>
                <bean:message key="label.toEtd" />
            </th>
            <th>
                <bean:message key="label.carrierCompCd" />
            </th>
            <th>
                <bean:message key="label.containerNo" />
            </th>
            <th>
                <bean:message key="label.issuer" />
            </th>
            <th>
                <bean:message key="label.worker" />
            </th>
        </tr>
        <tr>
            <td>
                <html:text property="w5001CriteriaDomain.fmEtd" maxlength="8" styleClass="fm_etd" 
                    errorStyleClass="fm_etd gscm_error_class" />
                <img src="images/gscm/library/Calendar.gif" alt="calender"
                    onClick = "gscm.writeCalendar('fmEtdDiv', 'mainForm', 
                        'w5001CriteriaDomain.fmEtd', '<bean:message key="format.screen.yyyymmdd"/>', 
                        this);"/>
                <div id="fmEtdDiv" style="float:left;"></div>
            </td>
            <td>
                <html:text property="w5001CriteriaDomain.toEtd" maxlength="8" styleClass="to_etd" 
                    errorStyleClass="to_etd gscm_error_class" />
                <img src="images/gscm/library/Calendar.gif" alt="calender"
                    onClick = "gscm.writeCalendar('toEtdDiv', 'mainForm', 
                        'w5001CriteriaDomain.toEtd', '<bean:message key="format.screen.yyyymmdd"/>',
                        this);"/>
                <div id="toEtdDiv" style="float:left;"></div>
            </td>
            <td>
                <html:text property="w5001CriteriaDomain.carrierCompCd" maxlength="3" 
                    styleClass="carrier_comp_cd" 
                    errorStyleClass="carrier_comp_cd gscm_error_class" />
                <html:button property="select" onclick="showSelectCarrier();">
                    <bean:message key="button.select" />
                </html:button>
            </td>
            <td>
                <html:text property="w5001CriteriaDomain.containerNo" maxlength="12" 
                    styleClass="container_no" errorStyleClass="container_no gscm_error_class" />
            </td>
            <td>
                <html:select property="w5001CriteriaDomain.shippingFirmIssuerId" 
                    styleClass="issuer">
                    <html:options collection="issuer" property="id" labelProperty="name" />
                </html:select>
            </td>
            <td>
                <html:select property="w5001CriteriaDomain.workedIssuerId" styleClass="worker">
                    <html:options collection="worker" property="id" labelProperty="name" />
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
                <html:button property="createNew" 
                    onclick="gscm.commonSubmit('W5001CreateNew.do', this.form);" 
                    styleClass="create_new">
                    <bean:message key="button.createNew" />
                </html:button>
            </td>
            <td class="right">
                <html:button property="search" 
                    onclick="gscm.submitSearch('W5001Search.do', this.form, '');" 
                    styleClass="search">
                    <bean:message key="button.search" />
                </html:button>
            </td>
        </tr>
    </table>
    <hr />
    <c:if test="${W5001Form.displayList}">
        <logic:notEmpty name="W5001Form" property="listDomainList">
            <%--
            -- buttons 2
            --%>
            <table class="gscm_resultlist_button">
                <colgroup>
                    <col />
                </colgroup>
                <tr>
                    <td>
                        <html:button property="confirmDetail" 
                            onclick="gscm.commonSubmit('W5001ConfirmDetail.do', this.form);" 
                            styleClass="confirm_detail">
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
                    <col class="resultlist_ck" />
                    <col class="resultlist_wh_comp_cd" />
                    <col class="resultlist_wh_cd" />
                    <col class="resultlist_trns_cd" />
                    <col class="resultlist_container_sorting_key" />
                    <col class="resultlist_shipping_firm_status" />
                    <col class="resultlist_shipping_firm_no" />
                    <col class="resultlist_cl" />
                    <col class="resultlist_etd" />
                    <col class="resultlist_carrier_comp_cd" />
                    <col class="resultlist_container_no" />
                    <col class="resultlist_issue_date" />
                    <col class="resultlist_issuer" />
                    <col class="resultlist_worked_method" />
                    <col class="resultlist_worked_date" />
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
                            <bean:message key="label.shippingFirmStatus" />
                        </th>
                        <th>
                            <bean:message key="label.shippingFirmNo" />
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
                            <bean:message key="label.containerNo" />
                        </th>
                        <th>
                            <bean:message key="label.issueDate" />
                        </th>
                        <th>
                            <bean:message key="label.issuer" />
                        </th>
                        <th>
                            <bean:message key="label.workedMethValue" />
                        </th>
                        <th>
                            <bean:message key="label.workedDt" />
                        </th>
                    </tr>
                </thead>
                <tbody>
                    <logic:iterate name="W5001Form" property="listDomainList" 
                        id="listDomain" indexId="idx">
                        <ai:stripeline number="${idx + 1}" odd="gscm_odd" even="gscm_even">
                            <tr>
                                <td class="center">
                                    <html:radio property="rowNum" value="${idx}" />
                                </td>
                                <td>
                                    <bean:write name="listDomain" property="whCompCd" />
                                </td>
                                <td>
                                    <bean:write name="listDomain" property="whCd" />
                                </td>
                                <td >
                                    <bean:write name="listDomain" property="trnsCd" />
                                </td>
                                <td >
                                    <bean:write name="listDomain" property="containerSortingKey" />
                                </td>
                                <td >
                                    <bean:write name="listDomain" property="shippingFirmStatus" />
                                </td>
                                <td >
                                    <html:text name="listDomain" property="shippingFirmNo" 
                                        styleClass="resultlist_detail_shipping_firm_no gscm_disptext" 
                                        readonly="true"/>
                                </td>
                                <td >
                                    <bean:write name="listDomain" property="containerLooseTyp" />
                                </td>
                                <td >
                                    <bean:write name="listDomain" property="etd" />
                                </td>
                                <td >
                                    <bean:write name="listDomain" property="carrierCompCd" />
                                </td>
                                <td >
                                    <html:text name="listDomain" property="containerNo" 
                                        styleClass="resultlist_detail_container_no gscm_disptext" 
                                        readonly="true"/>
                                </td>
                                <td >
                                    <bean:write name="listDomain" property="shippingFirmDt" />
                                </td>
                                <td >
                                    <html:text name="listDomain" property="shippingFirmIssuerNm" 
                                        styleClass="resultlist_detail_issuer gscm_disptext" 
                                        readonly="true"/>
                                </td>
                                <td >
                                    <bean:write name="listDomain" property="value" />
                                </td>
                                <td >
                                    <bean:write name="listDomain" property="workedDt" />
                                </td>
                            </tr>
                        </ai:stripeline>
                    </logic:iterate>
                </tbody>
            </table>
        </logic:notEmpty>
    </c:if>
    <%--
    -- hidden
    --%>
    <html:hidden property="callScreenId" />
</html:form>
