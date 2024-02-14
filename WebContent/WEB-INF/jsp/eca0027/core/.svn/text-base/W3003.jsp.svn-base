<%--
 * W3003.jsp
 * 
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 --%>
<c:set var="printUpdateAction" scope="request">
    <html:rewrite action="/W3003PrintListForUpdate"></html:rewrite>
</c:set>
<c:set var="printAllAction" scope="request">
    <html:rewrite action="/W3003PrintListForAll"></html:rewrite>
</c:set>
<html:form action="/W3003Search" styleId="mainForm">
    <%--
    -- search condition 1
    --%>
    <table class="gscm_search">
        <colgroup>
            <col class="search_wh_comp_cd" />
            <col class="search_wh_cd" />
            <col class="search_shipper">
            <col class="search_cml_type">
            <col class="search_export_req_no">
            <col class="search_main_mark">
            <col class="search_cml_issue_dt">
            <col class="search_cml_issue_dt">
        </colgroup>
        <tr>
            <th>
                <bean:message key="label.fmWhComCd" />
            </th>
            <th>
                <bean:message key="label.fmWhCd" />
            </th>
            <th>
                <bean:message key="label.shipper" />
            </th>
            <th>
                <bean:message key="label.cmlType" />
            </th>
            <th>
                <bean:message key="label.exReqNo" />
            </th>
            <th>
                <bean:message key="label.cmlNo" />
            </th>
            <th>
                <bean:message key="label.fmCmlIssueDate" />
            </th>
            <th>
                <bean:message key="label.toCmlIssueDate" />
            </th>
        </tr>
        <tr>
            <td>
                <html:text property="criteriaDomain.carryOutCompCd"
                styleClass="gscm_disptext wh_comp_cd gscm_required" readonly="true"
                errorStyleClass="wh_comp_cd gscm_error_class" indexed="false" />
            </td>
            <td>
                <html:text property="criteriaDomain.carryOutWhCd"
                styleClass="gscm_disptext wh_cd gscm_required" readonly="true"
                errorStyleClass="wh_cd gscm_error_class" indexed="false" />
            </td>
            <td>
                <html:text property="criteriaDomain.shipperCd"
                styleClass="gscm_disptext shipper_cd_2 gscm_required" readonly="true"
                errorStyleClass="shipper_cd_2 gscm_error_class" indexed="false" />
            </td>
            <td>
                <html:select property="criteriaDomain.cmlTyp" styleClass="cml_type">
                    <html:options collection="cmlTyp" property="id" labelProperty="name" />
                </html:select>
            </td>
            <td>
                <html:text property="criteriaDomain.expRequestNo"
                maxlength="12" styleClass="exp_request_no_2"
                errorStyleClass="exp_request_no_2 gscm_error_class" />
            </td>
            <td>
                <html:text property="criteriaDomain.mainMark" maxlength="20"
                styleClass="main_mark" errorStyleClass="main_mark gscm_error_class" />
            </td>
            <td>
                <html:text property="criteriaDomain.fmCmlIssueDate"
                maxlength="8" styleClass="tr_issue_dt"
                errorStyleClass="tr_issue_dt gscm_error_class" />
                <img src="images/gscm/library/Calendar.gif"
                onClick="gscm.writeCalendar('frIssueDateDiv', 'mainForm', 'criteriaDomain.fmCmlIssueDate', '<bean:message key="format.screen.yyyymmdd"/>', this);" />
                <div id="frIssueDateDiv" style="float: left;">
                </div>
            </td>
            <td>
                <html:text property="criteriaDomain.toCmlIssueDate" maxlength="8"
                styleClass="tr_issue_dt" errorStyleClass="tr_issue_dt gscm_error_class" />
                <img src="images/gscm/library/Calendar.gif"
                onClick="gscm.writeCalendar('toIssueDateDiv', 'mainForm', 'criteriaDomain.toCmlIssueDate', '<bean:message key="format.screen.yyyymmdd"/>', this);" />
                <div id="toIssueDateDiv" style="float: left;">
                </div>
            </td>
        </tr>
    </table>
    <br />
    <table class="gscm_search_button">
        <colgroup>
            <col width="80%" />
            <col />
        </colgroup>
        <tr>
            <td>
                <html:button property="backToMain"
                onclick="gscm.submitBack('W3001Init.do', this.form);"
                styleClass="back_to_main">
                    <bean:message key="button.backToMainScreen" />
                </html:button>
            </td>
            <td class="right">
                <html:button property="search"
                onclick="gscm.submitSearch('W3003Search.do', this.form, '');"
                styleClass="search">
                    <bean:message key="button.search" />
                </html:button>
            </td>
        </tr>
        <tr>
            <td>
                <html:button property="backToHead"
                onclick="gscm.submitBack('W3002Init.do', this.form);"
                styleClass="back_to_main">
                    <bean:message key="button.backToHeader" />
                </html:button>
            </td>
            <td>
            </td>
        </tr>
    </table>
    <hr />
    <c:if test="${W3003Form.displayList}">
        <logic:notEmpty name="W3003Form" property="listDomainList">
            <%--
            -- 
            --%>
            <%--
            -- page control & buttons 2
            --%>
            <table class="gscm_resultlist_button">
                <colgroup>
                    <col width="1%" />
                    <col width="1%" />
                    <col width="20%" />
                    <col />
                </colgroup>
                <tr>
                    <td>
                        <bean:define id="updateConfirmMessage">
                            <bean:message key="GSCM-I0-0004" />
                        </bean:define>
                        <html:button property="update"
                        onclick="gscm.submitConfirm('W3003Update.do', this.form,'${updateConfirmMessage}');"
                        styleClass="update">
                            <bean:message key="button.update" />
                        </html:button>
                    </td>
                    <td>
                        <html:button property="printUpdate"
                        onclick="gscm.commonSubmitForCheck('${printUpdateAction}', this.form, 'false', 'false');"
                        styleClass="print_update">
                            <bean:message key="button.printListUpdate" />
                        </html:button>
                    </td>
                    <td>
                        <html:button property="printAll"
                        onclick="gscm.commonSubmitForCheck('${printAllAction}', this.form, 'false', 'false');"
                        styleClass="print_all">
                            <bean:message key="button.printListAll" />
                        </html:button>
                    </td>
                </tr>
            </table>
            <%--
            -- 
            --%>
            <%--
            -- page control & buttons 2
            --%>
            <table class="gscm_resultlist_button">
                <colgroup>
                    <col width="8%" />
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
                    <col class="resultlist_chk" />
                    <col class="resultlist_cml_type" />
                    <col class="resultlist_main_mark" />
                    <col class="resultlist_cont_sort_cd" />
                    <col class="resultlist_g_w" />
                    <col class="resultlist_cml_issue_date" />
                    <col class="resultlist_export_request_no" />
                </colgroup>
                <thead>
                    <tr>
                        <th>
                            <bean:message key="label.ck" />
                            <input type="checkbox" name="checkAll"
                            onclick="allcheckW3('listDomainList', 'selected', this.checked, '')" />
                        </th>
                        <th>
                            <bean:message key="label.cmlType" />
                        </th>
                        <th>
                            <bean:message key="label.cmlNo" />
                        </th>
                        <th>
                            <bean:message key="label.containerSortingKey" />
                        </th>
                        <th>
                            <bean:message key="label.grossWeight" /><br />
                        (<bean:write name="W3003Form" property="criteriaDomain.weightUnitDisp" />)
                        </th>
                        <th>
                            <bean:message key="label.cmlIssueDate" />
                        </th>
                        <th>
                            <bean:message key="label.exReqNo" />
                        </th>
                    </tr>
                </thead>
                <tbody>
                    <logic:iterate name="W3003Form" property="listDomainList"
                    id="listDomainList" indexId="idx">
                        <ai:stripeline number="${idx + 1}" odd="gscm_odd" even="gscm_even">
                            <tr>
                                <td class="center">
                                    <html:checkbox name="listDomainList" property="selected"
                                    indexed="true" value="on" />
                                </td>
                                <td>
                                    <bean:write name="listDomainList" property="cmlTyp" />
                                </td>
                                <td>
                                    <bean:write name="listDomainList" property="mainMark" />
                                </td>
                                <td>
                                    <bean:write name="listDomainList" property="containerSortingKey" />
                                </td>
                                <td class="right">
                                    <bean:write name="listDomainList" property="grossWeight" />
                                </td>
                                <td>
                                    <bean:write name="listDomainList" property="expPackingDt" />
                                </td>
                                <td>
                                    <bean:write name="listDomainList" property="expRequestNo" />
                                </td>
                                <html:hidden name="listDomainList" property="mainMark" indexed="true" />
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