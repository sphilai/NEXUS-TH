<%--
 * W3005.jsp
 * 
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 --%>
<html:form action="/W3005Search" styleId="mainForm">
    <%--
    -- search condition 1
    --%>
    <table class="gscm_search">
        <colgroup>
            <col class="search_fr_wh_comp_cd" />
            <col class="search_fr_wh_cd" />
            <col class="search_to_wh_comp_cd" />
            <col class="search_to_wh_cd" />
            <col class="search_shipper_cd" />
            <col class="search_main_mark">
            <col class="search_detail_status">
            <col class="search_cml_type">
        </colgroup>
        <tr>
            <th>
                <bean:message key="label.fmWhComCd" />
            </th>
            <th>
                <bean:message key="label.fmWhCd" />
            </th>
            <th>
                <bean:message key="label.toWhComCd" />
            </th>
            <th>
                <bean:message key="label.toWhCd" />
            </th>
            <th>
                <bean:message key="label.shipper" />
            </th>
            <th>
                <bean:message key="label.cmlNo" />
            </th>
            <th>
                <bean:message key="label.cmlType" />
            </th>
        </tr>
        <tr>
            <td>
                <html:text property="criteriaDomain.carryOutCompCd"
                styleClass="gscm_disptext search_fr_wh_comp_cd gscm_required" readonly="true"
                errorStyleClass="wh_comp_cd gscm_error_class" />
            </td>
            <td>
                <html:text property="criteriaDomain.carryOutWhCd"
                styleClass="gscm_disptext search_fr_wh_cd gscm_required" readonly="true"
                errorStyleClass="wh_cd gscm_error_class" />
            </td>
            <td>
                <html:text property="criteriaDomain.carryInCompCd"
                styleClass="gscm_disptext search_to_wh_comp_cd gscm_required" readonly="true"
                errorStyleClass="wh_comp_cd gscm_error_class" />
            </td>
            <td>
                <html:text property="criteriaDomain.carryInWhCd"
                styleClass="gscm_disptext search_to_wh_cd gscm_required" readonly="true"
                errorStyleClass="wh_cd gscm_error_class" />
            </td>
            <td>
                <html:text property="criteriaDomain.shipperCd"
                styleClass="gscm_disptext search_shipper_cd gscm_required" readonly="true"
                errorStyleClass="shipper_cd gscm_error_class" />
            </td>
            <td>
                <html:text property="criteriaDomain.mainMark" maxlength="20"
                styleClass="main_mark" errorStyleClass="main_mark gscm_error_class" />
            </td>
            <td>
                <html:select property="criteriaDomain.cmlTyp"
                styleClass="cml_type">
                    <html:options collection="cmlTyp" property="id" labelProperty="name" />
                </html:select>
            </td>
       </tr>
    </table>
    <%--
    -- search condition 2
    --%>
    <table class="gscm_search">
        <colgroup>
            <col class="search_trans">
            <col class="search_container_sorting_key" />
            <col class="search_fr_cml_issue_date" />
            <col class="search_to_cml_issue_date" />
            <col class="search_exp_request_no" />
        </colgroup>
        <tr>
            <th>
                <bean:message key="label.trans" />
            </th>
            <th>
                <bean:message key="label.contSortKey" />
            </th>
            <th>
                <bean:message key="label.fmCmlIssueDate" />
            </th>
            <th>
                <bean:message key="label.toCmlIssueDate" />
            </th>
            <th>
                <bean:message key="label.exReqNo" />
            </th>
            <th>
            </th>
        </tr>
        <tr>
            <td>
                <html:select property="criteriaDomain.trnsCd"
                styleClass="trans">
                    <html:options collection="trnsTypCd" property="id" labelProperty="name" />
                </html:select>
            </td>
            <td>
                <html:text property="criteriaDomain.containerSortingKey"
                maxlength="8" styleClass="container_sorting_key"
                errorStyleClass="containerSortingKey gscm_error_class" />
            </td>
            <td>
                <html:text property="criteriaDomain.fmCmlIssueDate"
                maxlength="8" styleClass="search_fm_cml_issue_dt"
                errorStyleClass="tr_issue_dt gscm_error_class" />
                <img src="images/gscm/library/Calendar.gif"
                onClick="gscm.writeCalendar('frIssueDateDiv', 'mainForm', 'criteriaDomain.fmCmlIssueDate', '<bean:message key="format.screen.yyyymmdd"/>', this);" />
                <div id="frIssueDateDiv" style="float: left;">
                </div>
            </td>
            <td>
                <html:text property="criteriaDomain.toCmlIssueDate"
                maxlength="8" styleClass="search_to_cml_issue_dt"
                errorStyleClass="tr_issue_dt gscm_error_class" />
                <img src="images/gscm/library/Calendar.gif"
                onClick="gscm.writeCalendar('toIssueDateDiv', 'mainForm', 'criteriaDomain.toCmlIssueDate', '<bean:message key="format.screen.yyyymmdd"/>', this);" />
                <div id="toIssueDateDiv" style="float: left;">
                </div>
            </td>
            <td>
                <html:text property="criteriaDomain.expRequestNo"
                maxlength="12" styleClass="exp_request_no"
                errorStyleClass="exp_request_no gscm_error_class" />
            </td>
        </tr>
    </table>
    <%--
    -- buttons 1
    --%>
    <table class="gscm_search_button">
        <colgroup>
            <col width="80%" />
            <col />
        </colgroup>
        <tr>
            <td>
                <html:button property="moveToRegister"
                onclick="gscm.commonSubmit('W3005MoveToRegister.do', this.form);"
                styleClass="move_to_register">
                    <bean:message key="button.moveToRegister" />
                </html:button>
                
                <bean:define id="backToMainMessage">
                    <bean:message key="NXS-I1-0330" />
                </bean:define>
                <html:button property="backToMain"
                onclick="gscm.submitBack('W3001Init.do', this.form);"
                styleClass="back_to_main">
                    <bean:message key="button.backToMainScreen" />
                </html:button>
                
                <bean:define id="backToHeadMessage">
                    <bean:message key="NXS-I1-0330" />
                </bean:define>
                <html:button property="backToHead"
                onclick="gscm.submitBack('W3002Init.do', this.form);"
                styleClass="back_to_main">
                    <bean:message key="button.backToHeader" />
                </html:button>
            </td>
            <td class="right">
                <html:button property="search"
                onclick="gscm.submitSearch('W3005Search.do', this.form, '');"
                styleClass="search">
                    <bean:message key="button.search" />
                </html:button>
            </td>
        </tr>
    </table>
    <hr />
    <c:if test="${W3005Form.displayList}">
        <logic:notEmpty name="W3005Form" property="listDomainList">
            <table class="gscm_search_button">
                <tr>
                    <td>
                        <bean:define id="updateConfirmMessage">
                            <bean:message key="GSCM-I0-0004" />
                        </bean:define>
                        <html:button property="update"
                        onclick="gscm.submitConfirm('W3005Update.do', this.form,'${updateConfirmMessage}');"
                        styleClass="update">
                            <bean:message key="button.update" />
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
                    <col class="resultlist_main_mark" />
                    <col class="resultlist_cml_type" />
                    <col class="resultlist_trans" />
                    <col class="resultlist_container_sorting_key" />
                    <col class="resultlist_g_w" />
                    <col class="resultlist_cml_issue_date" />
                    <col class="resultlist_export_request_no" />
                </colgroup>
                <thead>
                    <tr>
                        <th>
                            <bean:message key="label.ck" />
                            <input type="checkbox"
                            name="checkAll"
                            onclick="allcheckW3('listDomainList', 'selected', this.checked, '')" />
                        </th>
                        <th>
                            <bean:message key="label.cmlNo" />
                        </th>
                        <th>
                            <bean:message key="label.cmlType" />
                        </th>
                        <th>
                            <bean:message key="label.trans" />
                        </th>
                        <th>
                            <bean:message key="label.containerSortingKey" />
                        </th>
                        <th>
                            <bean:message key="label.grossWeight" /><br />
                            (<bean:write name="W3005Form" property="criteriaDomain.weightUnitDisp" />)
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
                    <logic:iterate name="W3005Form" property="listDomainList"
                        id="listDomainList" indexId="idx">
                        <ai:stripeline number="${idx + 1}" odd="gscm_odd" even="gscm_even">
                            
                                <tr>
                                    <td class="center">
                                    <c:if test="${listDomainList.chk == 'N'}">
                                        <html:checkbox name="listDomainList" property="selected"  indexed="true" disabled="false" />
                                    </c:if>
                                     <c:if test="${listDomainList.chk != 'N'}">
                                        <html:checkbox name="listDomainList" property="selected" indexed="true" disabled="true" value="on"  />
                                      </c:if>
                                    </td>
                                    <td>
                                        <bean:write name="listDomainList" property="mainMark" />
                                    </td>
                                    <td>
                                        <bean:write name="listDomainList" property="cmlTyp" />
                                    </td>
                                    <td>
                                        <bean:write name="listDomainList" property="trnsCd" />
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
