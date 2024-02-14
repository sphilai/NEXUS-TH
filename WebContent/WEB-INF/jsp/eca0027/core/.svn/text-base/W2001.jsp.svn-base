<%--
 * W2001.jsp
 * 
 * 梱包指示Main画面のJSPです。
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 --%>
<html:form action="/W2001Search" styleId="mainForm">
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
            <col class="search_pltz_instr_status" />
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
                <bean:message key="label.pltzInstrStatus" />
            </th>
        </tr>
        <tr>
            <td>
                <html:text property="w2001CriteriaDomain.shipperCd" maxlength="3" styleClass="shipper_cd gscm_required" errorStyleClass="shipper_cd gscm_error_class" />
            </td>
            <td>
                <html:text property="w2001CriteriaDomain.customerCd" maxlength="8" styleClass="customer_cd gscm_required" errorStyleClass="customer_cd gscm_error_class" />
            </td>
            <td>
                <html:text property="w2001CriteriaDomain.lgcyShipTo" maxlength="2" styleClass="lgcy_ship_to gscm_required" errorStyleClass="lgcy_ship_to gscm_error_class" />
            </td>
            <td>
                <html:select property="w2001CriteriaDomain.trnsCd" styleClass="trns_cd">
                    <html:options collection="trnsCd" property="id" labelProperty="name" />
                </html:select>
            </td>
            <td>
                <html:text property="w2001CriteriaDomain.plntCd" maxlength="2" styleClass="plnt_cd" errorStyleClass="plnt_cd gscm_error_class" />
            </td>
            <td>
                <html:text property="w2001CriteriaDomain.lgcyWhCd" maxlength="1" styleClass="lgcy_wh_cd" errorStyleClass="lgcy_wh_cd gscm_error_class" />
            </td>
            <td>
                <html:select property="w2001CriteriaDomain.pltzInstrStatus" styleClass="pltz_instr_status" >
                    <html:options collection="pltzInstrStatus" property="id" labelProperty="name"/>
                </html:select>
            </td>
        </tr>
    </table>
    <%--
    -- search condition 2
    --%>
    <table class="gscm_search">
        <colgroup>
            <col class="search_pltz_instr_no" />
            <col class="search_pltz_instr_dt" />
            <col class="search_pltz_instr_dt" />
            <col class="search_pltz_instr_issuer_id" />
        </colgroup>
        <tr>
            <th>
                <bean:message key="label.pltzInstrNo" />
            </th>
            <th>
                <bean:message key="label.pltzInstrDtFrom" />
            </th>
            <th>
                <bean:message key="label.pltzInstrDtTo" />
            </th>
            <th>
                <bean:message key="label.pltzInstrIssuerId" />
            </th>
        </tr>
        <tr>
            <td>
                <html:text property="w2001CriteriaDomain.pltzInstrNo" maxlength="10" styleClass="pltz_instr_no" errorStyleClass="pltz_instr_no gscm_error_class" />
            </td>
            <td>
                <html:text property="w2001CriteriaDomain.pltzInstrDtFrom" maxlength="8" styleClass="pltz_instr_dt" errorStyleClass="pltz_instr_dt gscm_error_class" />
                <img src="images/gscm/library/Calendar.gif"
                    onClick="gscm.writeCalendar('pltzInstrDtFromDiv', 'mainForm', 'w2001CriteriaDomain.pltzInstrDtFrom', '<bean:message key="format.screen.yyyymmdd" />', this);"/>
                <div id="pltzInstrDtFromDiv" style="float:left;"></div>
            </td>
            <td>
                <html:text property="w2001CriteriaDomain.pltzInstrDtTo" maxlength="8" styleClass="pltz_instr_dt" errorStyleClass="pltz_instr_dt gscm_error_class" />
                <img src="images/gscm/library/Calendar.gif"
                    onClick="gscm.writeCalendar('pltzInstrDtToDiv', 'mainForm', 'w2001CriteriaDomain.pltzInstrDtTo', '<bean:message key="format.screen.yyyymmdd"/>', this);"/>
                <div id="pltzInstrDtToDiv" style="float:left;"></div>
            </td>
            <td>
                <html:select property="w2001CriteriaDomain.pltzInstrIssuerId" styleClass="pltz_instr_issuer_id" >
                    <html:options collection="issuer" property="id" labelProperty="name"/>
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
                <html:button property="createNew" onclick="gscm.commonSubmit('W2001CreateNew.do', this.form);" styleClass="create_new">
                    <bean:message key="button.createNew" />
                </html:button>
            </td>
            <td class="right">
                <html:button property="search" onclick="gscm.submitSearch('W2001Search.do', this.form, '')" styleClass="search">
                    <bean:message key="button.search" />
                </html:button>
            </td>
        </tr>
    </table>
    <hr />
    <c:if test="${W2001Form.displayList}">
        <logic:notEmpty name="W2001Form" property="listDomainList">
        <%--
        -- buttons 2
        --%>
        <table class="gscm_resultlist_button">
            <colgroup>
                <col />
            </colgroup>
            <tr>
                <td>
                    <html:button property="confirmDetail" onclick="gscm.commonSubmit('W2001ConfirmDetail.do', this.form);" styleClass="confirm_detail">
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
                <col class="resultlist_shipper_cd" />
                <col class="resultlist_customer_cd" />
                <col class="resultlist_lgcy_ship_to" />
                <col class="resultlist_trns_cd" />
                <col class="resultlist_plnt_cd" />
                <col class="resultlist_lgcy_wh_cd" />
                <col class="resultlist_pltz_instr_status" />
                <col class="resultlist_pltz_instr_no" />
                <col class="resultlist_pltz_instr_dt" />
                <col class="resultlist_pltz_instr_nm"/>
            </colgroup>
            <tr>
                <th>
                    <bean:message key="label.ck" />
                </th>
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
                    <bean:message key="label.pltzInstrStatus" />
                </th>
                <th>
                    <bean:message key="label.pltzInstrNo" />
                </th>
                <th>
                    <bean:message key="label.pltzInstrDt" />
                </th>
                <th>
                    <bean:message key="label.pltzInstrNm" />
                </th>
            </tr>
            <logic:iterate name="W2001Form" property="listDomainList" id="listDomainList" indexId="idx">
                <ai:stripeline number="${idx + 1}" odd="gscm_odd" even="gscm_even">
                    <tr>
                        <td class="center">
                            <html:radio property="pltzInstrNo" value="${listDomainList.pltzInstrNo}" />
                        </td>
                        <td>
                            <bean:write name="listDomainList" property="shipperCd" />
                        </td>
                        <td>
                            <bean:write name="listDomainList" property="customerCd" />
                        </td>
                        <td>
                            <bean:write name="listDomainList" property="lgcyShipTo" />
                        </td>
                        <td>
                            <bean:write name="listDomainList" property="trnsCd" />
                        </td>
                        <td>
                            <bean:write name="listDomainList" property="plntCd" />
                        </td>
                        <td>
                            <bean:write name="listDomainList" property="lgcyWhCd" />
                        </td>
                        <td>
                            <bean:write name="listDomainList" property="pltzInstrStatus" />
                        </td>
                        <td>
                            <bean:write name="listDomainList" property="pltzInstrNo" />
                        </td>
                        <td>
                            <bean:write name="listDomainList" property="pltzInstrDt" />
                        </td>
                        <td>
                            <html:text name="listDomainList" property="pltzInstrNm" indexed="true" styleClass="pltz_instr_nm gscm_disptext" readonly="true" />
                        </td>
                    </tr>
                </ai:stripeline>
            </logic:iterate>
        </table>
        </logic:notEmpty>
    </c:if>

    <%--
    -- hidden
    --%>
    <html:hidden property="callScreenId" />
</html:form>
