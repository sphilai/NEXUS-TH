<%--
 * W3001.jsp
 * 
 *
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 --%>
<html:form action="/W3001Search" styleId="mainForm">
    <%--
    -- search condition 1
    --%>
    <table class="gscm_search">
        <colgroup>
            <col class="search_carry_out_comp_cd" />
            <col class="search_carry_out_wh_cd" />
            <col class="search_carry_in_comp_cd" />
            <col class="search_carry_in_wh_cd" />
            <col class="search_shipper_cd" />
            <col class="search_trnsfer_status" />
            <col class="search_transfer_no" />
            <col class="search_tr_kind" />
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
                <bean:message key="label.shipperCd" />
            </th>
            <th>
                <bean:message key="label.status" />
            </th>
            <th>
                <bean:message key="label.trNo" />
            </th>
            <th>
                <bean:message key="label.trKind"/>
            </th>
            
        </tr>
        <tr>
            <td>
                <html:text property="criteriaDomain.fmWhComCd" maxlength="5" styleClass="wh_comp_cd gscm_required" errorStyleClass="wh_comp_cd gscm_error_class" 
                title="Input carryout company code"/>
            </td>
              <td>
                <html:text property="criteriaDomain.fmWhCd" maxlength="4" styleClass="wh_cd gscm_required" errorStyleClass="wh_cd gscm_error_class" 
                title="Input carryout W/H code"/>
            </td>
              <td>
                <html:text property="criteriaDomain.toWhComCd" maxlength="5" styleClass="wh_comp_cd" errorStyleClass="wh_comp_cd gscm_error_class" />
            </td>
              <td>
                <html:text property="criteriaDomain.toWhCd" maxlength="4" styleClass="wh_cd" errorStyleClass="wh_cd gscm_error_class" />
            </td>
              <td>
                <html:text property="criteriaDomain.shipperCd" maxlength="5" styleClass="shipper_cd" errorStyleClass="shipper_cd gscm_error_class"/>
                
              </td>
              <td>
               <html:select property="criteriaDomain.status" styleClass="tr_status_list">
                    <html:options collection="trStatus" property="id" labelProperty="name" />
                </html:select>
            </td>
              <td>
                <html:text property="criteriaDomain.trNo" maxlength="20" styleClass="search_transfer_no" errorStyleClass="tr_no gscm_error_class" />
            </td>
              <td> 
              <html:select property="criteriaDomain.trKind" styleClass="tr_kind_list" styleId="itemType" onchange="trKind()">
                    <html:options collection="trKind" property="id" labelProperty="name"/>
                </html:select>
        </tr>
    </table>
    <%--
    -- search condition 2
    --%>
    <table class="gscm_search">
        <colgroup>
            <col class="search_editflg" />
            <col class="search_cml" />
            <col class="search_part_number" />
            <col class="search_pkgCd" />
            <col class="search_tr_issue_dt" />
            <col class="search_tr_issue_dt" />
            <col class="search_tr_Act_dt" />
            <col class="search_tr_Act_dt" />
            <col class="search_to_tr_issuer" />
        </colgroup>
        <tr>
            <th>
                <bean:message key="label.cmlNo" />
            </th>
            <th>
                <bean:message key="label.itemNo" />
            </th>
            <th>
                <bean:message key="label.pkgCd" />
            </th>
            <th>
                <bean:message key="label.editFlg" />
            </th>
            <th>
                <bean:message key="label.fmTrIssueDate" />
            </th>
            <th>
                <bean:message key="label.toTrIssueDate" />
            </th>
            <th>
                <bean:message key="label.fmTrActivateDate" />
            </th>
            <th>
                <bean:message key="label.toTrActivateDate" />
            </th>
            <th>
                <bean:message key="label.trIssuer" />
            </th>
        </tr>
        <tr>
           
            <td>
               <html:text property="criteriaDomain.cmlNo" maxlength="17" styleClass="cml gscm_disabledColor" errorStyleClass="cml gscm_error_class" styleId = "mainMark"/>
            </td>
            <td>
                <html:text property="criteriaDomain.itemNo" maxlength="27" styleClass="carry_out_item_no gscm_disabledColor " errorStyleClass="carry_Out_item_no  gscm_error_class" styleId = "itemNo"/> 
            </td>
            <td>
                <html:text property="criteriaDomain.pkgCd" maxlength="3" styleClass="gscm_disabledColor pkg_cd" errorStyleClass="pkg_cd gscm_error_class" disabled="true"/>
            </td>
            <td>
                <html:select property="criteriaDomain.editCntFlag" styleClass="tr_edit_flg_list">
                    <html:options collection="flag" property="id" labelProperty="name"/>
                </html:select>
            </td>
            <td>
                <html:text property="criteriaDomain.fmTrIssueDate" maxlength="8" styleClass="tr_issue_dt" errorStyleClass="tr_issue_dt gscm_error_class" />
                <img src="images/gscm/library/Calendar.gif"
                    onClick="gscm.writeCalendar('trIssueDtFmDiv', 'mainForm', 'criteriaDomain.fmTrIssueDate', '<bean:message key="format.screen.yyyymmdd"/>', this);"/>
                <div id="trIssueDtFmDiv" style="float:left;"></div>
            </td>
                
            <td>
                <html:text property="criteriaDomain.toTrIssueDate" maxlength="8" styleClass="tr_issue_dt" errorStyleClass="tr_issue_dt gscm_error_class" />
                <img src="images/gscm/library/Calendar.gif"
                    onClick="gscm.writeCalendar('trIssueDtToDiv', 'mainForm', 'criteriaDomain.toTrIssueDate', '<bean:message key="format.screen.yyyymmdd"/>', this);"/>
                <div id="trIssueDtToDiv" style="float:left;"></div>
            </td>
                
            <td>
                <html:text property="criteriaDomain.fmTrActivateDate" maxlength="8" styleClass="tr_activ_dt" errorStyleClass="tr_issue_dt gscm_error_class"/>
                <img src="images/gscm/library/Calendar.gif" onClick="gscm.writeCalendar('trActiveDtFmDiv', 'mainForm', 'criteriaDomain.fmTrActivateDate', '<bean:message key="format.screen.yyyymmdd"/>', this);"/>
                <div id="trActiveDtFmDiv" style="float:left;"></div>
            </td>
            <td>
                <html:text property="criteriaDomain.toTrActivateDate" maxlength="8" styleClass="tr_activ_dt" errorStyleClass="tr_issue_dt gscm_error_class"/>
                <img src="images/gscm/library/Calendar.gif" onClick="gscm.writeCalendar('trActiveDtToDiv', 'mainForm', 'criteriaDomain.toTrActivateDate', '<bean:message key="format.screen.yyyymmdd"/>', this);"/>
                <div id="trActiveDtToDiv" style="float:left;"></div>
            </td>
            <td>
                <html:select property="criteriaDomain.trIssuer" styleClass="tr_issuer_list" >
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
            <td class="left">
                <html:button property="createListOrTr" onclick="gscm.commonSubmit('W3001CreateListOrTr.do', this.form);">
                    <bean:message key="button.createListOrTr"/>
                </html:button>
            </td>
            <td class="right">
                <html:button property="search" onclick="gscm.submitSearch('W3001Search.do', this.form, '')" styleClass="search">
                    <bean:message key="button.search" />
                </html:button>
            </td>
        </tr>
    </table>
    <hr />
    <c:if test="${W3001Form.displayList}">
        <logic:notEmpty name="W3001Form" property="w3001ListDomainList">
        <%--
        -- 
        --%>
        <%--
        -- page control & buttons 2
        --%>
        <table class="gscm_resultlist_button">
            <colgroup>
                <col />
            </colgroup>
            <tr>
                <td class="left">
                <bean:define id="updateConfirmMessage"><bean:message key="GSCM-I0-0004"/></bean:define>
                <bean:define id="cancelConfirmMessage"><bean:message key="GSCM-I0-0005"/></bean:define>
                <html:button property="activate" onclick="gscm.submitConfirm('W3001Activate.do', this.form,'${updateConfirmMessage}');" styleClass="activate"
                title="Click to Activate TR">
                    <bean:message key="button.activateTr"/>
                </html:button>
                <html:button property="confirmDetail" onclick="gscm.commonSubmit('W3001ConfirmDetail.do', this.form);" styleClass="confirm_detail"
                title="Move to Confirm detail">
                    <bean:message key="button.confirmDetail"/>
                </html:button>
                <html:button property="edit" onclick="gscm.commonSubmit('W3001EditTr.do', this.form);" styleClass="edit"
                title="Move to Edit TR.">
                    <bean:message key="button.editOrCancelTr"/>
                </html:button>
                <html:button property="cancel" onclick="gscm.submitConfirm('W3001Cancel.do', this.form, '${cancelConfirmMessage}');" styleClass="cancel_activate"
                title="Click to cancel activation">
                    <bean:message key="button.cancelActivate"/>
                </html:button>
                </td>
            </tr>
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
                <col class="resultlist_status_cd" />
                <col class="resultlist_com_cd" />
                <col class="resultlist_wh_cd" />
                <col class="resultlist_shipper_cd" />
                <col class="resultlist_tr_no" />
                <col class="resultlist_edt_flg" />
                <col class="resultlist_tr_kind" />
                <col class="resultlist_tr_tag_qty" />
                <col class="resultlist_tr_issuer"/>
                <col class="resultlist_tr_issue_dt" />
                <col class="resultlist_tr_active_dt"/>
                <col class="resultlist_tr_active_method"/>
                </colgroup>
            <thead>    
            <tr>
                <th rowspan = '2'>
                    <bean:message key="label.ck" />
                </th>
                <th rowspan = '2'>
                    <bean:message key="label.status" />
                </th>
                <th colspan ='2' align="center">
                    To
                </th>
                <th rowspan = '2'>
                    <bean:message key="label.shipperCd" />
                </th>
                <th rowspan = '2'>
                    <bean:message key="label.trNo" />
                </th>
                <th rowspan = '2'>
                    <bean:message key="label.editCnt" />
                </th>
                <th rowspan = '2'>
                    <bean:message key="label.trKind" />
                </th>
                <th rowspan = '2'>
                    <bean:message key="label.trTagQty" />
                </th>
                <th rowspan = '2'>
                    <bean:message key="label.trIssuer" />
                </th>
                <th rowspan = '2'>
                    <bean:message key="label.issueDate" />
                </th>
                <th rowspan = '2'>
                    <bean:message key="label.actDate" />
                </th>
                <th rowspan = '2'>
                    <bean:message key="label.actMethod" />
                </th>
            </tr>    
            <tr>
                <th >
                    <bean:message key="label.nexusComCdAbbr" />
                </th>
                <th>
                    <bean:message key="label.nexusWhCdAbbr" />
                </th>
            </tr>
            </thead>
            <tbody>
            <logic:iterate name="W3001Form" property="w3001ListDomainList" id="w3001ListDomain" indexId="index">
                <ai:stripeline number="${index + 1}" odd="gscm_odd" even="gscm_even">
                    <tr>
                        <td class="center">
                            <html:radio property="trNo" value="${w3001ListDomain.trNo}"/>
                        </td>
                        <td>
                            <bean:write name="w3001ListDomain" property="trStatus" />
                        </td>
                        <td>
                            <bean:write name="w3001ListDomain" property="carryInCompCd" />
                        </td>
                        <td>
                            <bean:write name="w3001ListDomain" property="carryInWhCd" />
                        </td>
                        <td>
                            <bean:write name="w3001ListDomain" property="shipperCd" />
                        </td>
                        <td>
                            <bean:write name="w3001ListDomain" property="trNo" />
                        </td>
                        <td>
                            <bean:write name="w3001ListDomain" property="editCnt" />
                        </td>
                        <td>
                            <bean:write name="w3001ListDomain" property="trItemTyp" />
                        </td>
                        <td>
                            <bean:write name="w3001ListDomain" property="tagQty" />
                        </td>
                        <td>
                            <bean:write name="w3001ListDomain" property="trIssuerNm" />
                        </td>
                        <td>
                            <bean:write name="w3001ListDomain" property="trIssueDt" />
                        </td>
                        <td>
                            <bean:write name="w3001ListDomain" property="trActvDt" />
                        </td>
                        <td>
                            <bean:write name="w3001ListDomain" property="trActvMethTyp" />
                        </td>
                    </tr>
                </ai:stripeline>
                <html:hidden name="w3001ListDomain" property="trNo" indexed="true"/>
                <html:hidden name="w3001ListDomain" property="trStatus" indexed="true"/>
                <html:hidden name="w3001ListDomain" property="trItemTyp" indexed="true"/>
                <html:hidden name="w3001ListDomain" property="shipperCd" indexed="true"/>
                <html:hidden name="w3001ListDomain" property="carryInCompCd" indexed="true"/>
                <html:hidden name="w3001ListDomain" property="carryInWhCd" indexed="true"/>
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
