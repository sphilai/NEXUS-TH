<%--
 * W2005.jsp
 *
 * 小箱内多品番梱包Main Screen画面のJSPです。
 * 
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 --%>

<html:form action="/W2005Search" styleId="mainForm">
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
            <col class="search_mix_tag_status" />
            <col class="search_mix_tag_no" />
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
                <bean:message key="label.mixTagStatus" />
            </th>
            <th>
                <bean:message key="label.mixTagNo" />
            </th>
        </tr>
        <tr>
            <td>
                <html:text property="w2005CriteriaDomain.shipperCd" maxlength="3" styleClass="shipper_cd gscm_required" errorStyleClass="shipper_cd gscm_error_class" />
            </td>
            <td>
                <html:text property="w2005CriteriaDomain.customerCd" maxlength="8" styleClass="w2005_customer_cd" errorStyleClass="w2005_customer_cd gscm_error_class" />
            </td>
            <td>
                <html:text property="w2005CriteriaDomain.lgcyShipTo" maxlength="2" styleClass="w2005_lgcy_ship_to" errorStyleClass="w2005_lgcy_ship_to gscm_error_class" />
            </td>
            <td>
                <html:select property="w2005CriteriaDomain.trnsCd" styleClass="trns_cd">
                    <html:options collection="trnsCd" property="id" labelProperty="name" />
                </html:select>
            </td>
            <td>
                <html:text property="w2005CriteriaDomain.plntCd" maxlength="2" styleClass="w2005_plnt_cd" errorStyleClass="w2005_plnt_cd gscm_error_class" />
            </td>
            <td>
                <html:text property="w2005CriteriaDomain.lgcyWhCd" maxlength="1" styleClass="lgcy_wh_cd" errorStyleClass="lgcy_wh_cd gscm_error_class" />
            </td>
            <td>
                <html:select property="w2005CriteriaDomain.mixTagStatus" styleClass="mix_tag_status" >
                    <html:options collection="mixTagStatus" property="id" labelProperty="name"/>
                </html:select>
            </td>
            <td>
                <html:text property="w2005CriteriaDomain.mixTagNo" maxlength="20" styleClass="mix_tag_no" errorStyleClass="mix_tag_no gscm_error_class" />
            </td>
        </tr>
    </table>
    <%--
    -- search condition 2
    --%>
    <table class="gscm_search">
        <colgroup>
            <col class="search_mix_tag_issue_dt_from" />
            <col class="search_mix_tag_issue_dt_to" />
            <col class="search_mix_tag_issuer_id" />
            <col class="search_item_no" />
            <col class="search_pkg_cd"/>
        </colgroup>
        <tr>
            <th>
                <bean:message key="label.mixTagIssueDtFrom" />
            </th>
            <th>
                <bean:message key="label.mixTagIssueDtTo" />
            </th>
            <th>
                <bean:message key="label.mixTagIssuerId" />
            </th>
            <th>
                <bean:message key="label.itemNo" />
            </th>
            <th>
                <bean:message key="label.pkgCd" />
            </th>
        </tr>
        <tr>
            <td>
                <html:text property="w2005CriteriaDomain.mixTagIssueDtFrom" maxlength="8" styleClass="mix_tag_issue_dt_from" errorStyleClass="mix_tag_issue_dt_from gscm_error_class" />
                <img src="images/gscm/library/Calendar.gif"
                    onClick = "gscm.writeCalendar('mixTagIssueDtFromDiv', 'mainForm', 'w2005CriteriaDomain.mixTagIssueDtFrom', '<bean:message key="format.screen.yyyymmdd"/>', this);"/>
                <div id="mixTagIssueDtFromDiv" style="float:left;"></div>
            </td>
            <td>
                <html:text property="w2005CriteriaDomain.mixTagIssueDtTo" maxlength="8" styleClass="mix_tag_issue_dt_to" errorStyleClass="mix_tag_issue_dt_to gscm_error_class" />
                <img src="images/gscm/library/Calendar.gif"
                    onClick = "gscm.writeCalendar('mixTagIssueDtToDiv', 'mainForm', 'w2005CriteriaDomain.mixTagIssueDtTo', '<bean:message key="format.screen.yyyymmdd" />', this);"/>
                <div id="mixTagIssueDtToDiv" style="float:left;"></div>
            </td>
            <td>
                <html:select property="w2005CriteriaDomain.mixTagIssuerId" styleClass="mix_tag_issuer_id" >
                    <html:options collection="issuer" property="id" labelProperty="name"/>
                </html:select>
            </td>
            <td>
                <html:text property="w2005CriteriaDomain.itemNo" maxlength="27" styleClass="item_no" errorStyleClass="item_no gscm_error_class" />
            </td>
            <td>
                <html:text property="w2005CriteriaDomain.pkgCd" maxlength="3" styleClass="pkg_cd" errorStyleClass="pkg_cd gscm_error_class" />
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
                <html:button property="createNew" styleClass="create_new" onclick="gscm.commonSubmit('W2005CreateNew.do', this.form);">
                    <bean:message key="button.createNew" />
                </html:button>
            </td>
            <td class="right">
                <html:button property="search" styleClass="search" onclick="gscm.submitSearch('W2005Search.do', this.form, '');">
                    <bean:message key="button.search" />
                </html:button>
            </td>
        </tr>
    </table>
    <hr />
    
    <c:if test="${W2005Form.displayList}">
        <logic:notEmpty name="W2005Form" property="listDomainList">
        <%--
        -- buttons 2
        --%>
        <table class="gscm_resultlist_button">
            <colgroup>
                <col />
            </colgroup>
            <tr>
                <td>
                    <html:button property="confirmDetail" styleClass="confirm_detail" onclick="gscm.commonSubmit('W2005ConfirmDetail.do', this.form);">
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
                <col class="resultlist_mix_tag_status" />
                <col class="resultlist_mix_tag_no" />
                <col class="resultlist_mix_tag_issue_dt" />
                <col class="resultlist_mix_tag_issuer" />
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
                    <bean:message key="label.mixTagStatus" />
                </th>
                <th>
                    <bean:message key="label.mixTagNo" />
                </th>
                <th>
                    <bean:message key="label.mixTagIssueDt" />
                </th>
                <th>
                    <bean:message key="label.mixTagIssuer" />
                </th>
            </tr>
            <logic:iterate name="W2005Form" property="listDomainList" id="listDomainList" indexId="idx">
                <ai:stripeline number="${idx + 1}" odd="gscm_odd" even="gscm_even">
                    <tr>
                        <td class="center">
                            <html:radio property="mixTagNo" value="${listDomainList.mixTagNo}" />
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
                            <bean:write name="listDomainList" property="mixTagStatus" />
                        </td>
                        <td>
                            <html:text name="listDomainList" property="mixTagNo" indexed="true" styleClass="w2005_mix_tag_no_disptext gscm_disptext" readonly="true" />
                        </td>
                        <td>
                            <bean:write name="listDomainList" property="mixTagIssueDt" />
                        </td>
                        <td>
                            <html:text name="listDomainList" property="mixTagIssuer" styleClass="w2005_mix_tag_issuer_disptext gscm_disptext" readonly="true" />
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
