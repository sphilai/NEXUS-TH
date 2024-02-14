
<html:form action="/W3009Search" styleId="mainForm">
<table class="gscm_search">
        <colgroup>

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
                <bean:message key="label.editFlg" />
            </th>
            
        </tr>
        <tr>
            <td>
                <html:text property="criteriaDomain.fmWhComCd" maxlength="5"  styleClass="wh_comp_cd gscm_required" errorStyleClass="wh_comp_cd gscm_error_class" 
                title="Input carryin company code"/>
            </td>
              <td>
                <html:text property="criteriaDomain.fmWhCd" maxlength="4" styleClass="wh_cd gscm_required" errorStyleClass="wh_cd gscm_error_class" 
                title="Input carryin W/H code"/>
            </td>
              <td>
                <html:text property="criteriaDomain.toWhComCd" maxlength="5" styleClass="wh_comp_cd gscm_required" errorStyleClass="wh_comp_cd gscm_error_class" />
            </td>
              <td>
                <html:text property="criteriaDomain.toWhCd" maxlength="4" styleClass="wh_cd gscm_required" errorStyleClass="wh_cd gscm_error_class" />
            </td>
              <td>
                <html:text property="criteriaDomain.shipperCd" maxlength="5" styleClass="shipper_cd gscm_required" errorStyleClass="shipper_cd gscm_error_class"/>
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
                <html:select property="criteriaDomain.editFlag" styleClass="tr_edit_flg_list">
                    <html:options collection="flag" property="id" labelProperty="name"/>
                </html:select>
              </td>
                                  
        </tr>
    </table>
    <%--
    -- search condition 2
    --%>
    <table class="gscm_search">
        <colgroup>
        
        </colgroup>
        <tr>
            <th>
                <bean:message key="label.trKind"/>
            </th>
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
                <bean:message key="label.lastTrRcvDtFrom" />
            </th>
            <th>
                <bean:message key="label.lastTrRcvDtTo" />
            </th>
            <th>
                <bean:message key="label.CarryInWorker" />
            </th>
        </tr>
        <tr>
            <td>
                <html:select property="criteriaDomain.trKind" styleClass="tr_kind_list" styleId="itemType" onchange="trKind()">
                   <html:options collection="trKind" property="id" labelProperty="name"/>
                </html:select>
            </td>
            <td>
               <html:text property="criteriaDomain.cmlNo" maxlength="17" styleClass="cml, gscm_disabledColor" errorStyleClass="cml gscm_error_class" styleId = "mainMark"/>
            </td>
            <td>
                <html:text property="criteriaDomain.itemNo" maxlength="27" styleClass="carry_out_item_no, gscm_disabledColor" errorStyleClass="carry_Out_item_no  gscm_error_class" styleId = "itemNo"/> 
            </td>
            <td>
                <html:text property="criteriaDomain.pkgCd" maxlength="3" styleClass="pkg_cd gscm_disabledColor" errorStyleClass="pkg_cd gscm_error_class" readonly="true" />
            </td>
            <td>
                <html:text property="criteriaDomain.lastTrRcvDtFrom" maxlength="8" styleClass="tr_issue_dt" errorStyleClass="tr_issue_dt gscm_error_class" />
                <img src="images/gscm/library/Calendar.gif"
                    onClick="gscm.writeCalendar('lastTrRcvDtFrom', 'mainForm', 'criteriaDomain.lastTrRcvDtFrom', '<bean:message key="format.screen.yyyymmdd"/>', this);"/>
                <div id="lastTrRcvDtFrom" style="float:left;"></div>
            </td>
            <td>
                <html:text property="criteriaDomain.lastTrRcvDtTo" maxlength="8" styleClass="tr_issue_dt" errorStyleClass="tr_issue_dt gscm_error_class" />
                <img src="images/gscm/library/Calendar.gif"
                    onClick="gscm.writeCalendar('lastTrRcvDtTo', 'mainForm', 'criteriaDomain.lastTrRcvDtTo', '<bean:message key="format.screen.yyyymmdd"/>', this);"/>
                <div id="lastTrRcvDtTo" style="float:left;"></div>
            </td>
            <td>
                <html:select property="criteriaDomain.carryInWorker" styleClass="tr_issuer_list" >
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
           
        </colgroup>
        <tr>
            <td class="right">
                <html:button property="search" onclick="gscm.submitSearch('W3009Search.do', this.form, '')" styleClass="search">
                    <bean:message key="button.search" />
                </html:button>
            </td>
        </tr>
    </table>
    <hr />
    <c:if test="${W3009Form.displayList}"> 
        <logic:notEmpty name="W3009Form" property="w3009ListDomainList">
        <%--
        -- 
        --%>
        <%--
        -- page control & buttons 2
        --%>
        <table class="gscm_resultlist_button">
            <colgroup>
      
            </colgroup>
            <tr>
                <td class="left">
                <bean:define id="updateConfirmMessage"><bean:message key="GSCM-I0-0004"/></bean:define>
                <html:button property="receive" onclick="gscm.submitConfirm('W3009Receive.do', this.form,'${updateConfirmMessage}');" styleClass="update"
                title="Click to Receive TR">
                <bean:message key="button.receive"/>
                </html:button>
                <html:button property="confirmDetail" onclick="gscm.submitSearch('W3009Confirm.do', this.form, '')" styleClass="confirm_detail"
                title="Move to Confirm detail">
                    <bean:message key="button.confirmDetail"/>
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
                <col class="resultlist_to_com_cd" />
                <col class="resultlist_to_wh_cd" />
                <col class="resultlist_from_com_cd" />
                <col class="resultlist_from_wh_cd" />
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
                    <bean:message key="label.from" />
                </th>
                 <th colspan ='2' align="center">
                   <bean:message key="label.to" />
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
                    <bean:message key="label.lastTrRcvDt" />
                </th>
                <th rowspan = '2'>
                    <bean:message key="label.CarryInWorker" />
                </th>
                <th rowspan = '2'>
                    <bean:message key="label.carryInMethod" />
                </th>
            </tr>    
            <tr>               
                <th >
                    <bean:message key="label.whCom" />
                </th>
                <th>
                    <bean:message key="label.whCd" />
                </th>   
                <th >
                    <bean:message key="label.whCom" />
                </th>
                <th>
                    <bean:message key="label.whCd" />
                </th>                      
            </tr>      
            </thead>
            <tbody> 
            <logic:iterate name="W3009Form" property="w3009ListDomainList" id="w3009ListDomain" indexId="idx">
                <ai:stripeline number="${idx + 1}" odd="gscm_odd" even="gscm_even">
                    <tr>
                        <td class="center">
                            <html:radio  property="trNo" value="${w3009ListDomain.trNo}" />
                        </td>
                        <td>
                            <bean:write name="w3009ListDomain" property="trStatus" />
                        </td>
                        <td>
                            <bean:write name="w3009ListDomain" property="carryOutCompCd" />
                        </td>
                        <td>
                            <bean:write name="w3009ListDomain" property="carryOutWhCd" />
                        </td>
                        <td>
                            <bean:write name="w3009ListDomain" property="carryInCompCd" />
                        </td>
                        <td>
                            <bean:write name="w3009ListDomain" property="carryInWhCd" />
                        </td>
                        <td>
                            <bean:write name="w3009ListDomain" property="shipperCd" />
                        </td>
                        <td>
                            <bean:write name="w3009ListDomain" property="trNo" />
                        </td>
                        <td>
                            <bean:write name="w3009ListDomain" property="editCnt" />
                        </td>
                        <td>
                            <bean:write name="w3009ListDomain" property="trItemTyp" />
                        </td>
                        <td>
                            <bean:write name="w3009ListDomain" property="tagQty" />
                        </td>
                        <td>
                            <bean:write name="w3009ListDomain" property="trRcvDt" />
                        </td>
                        <td>
                            <bean:write name="w3009ListDomain" property="trRcvDscId" />
                        </td>
                        <td>
                            <bean:write name="w3009ListDomain" property="trRcvMethTyp" />
                        </td>
                         <html:hidden name="w3009ListDomain" property="trNo" indexed="true" /> 
                         <html:hidden name="w3009ListDomain" property="trStatus" indexed="true" /> 
                         <html:hidden name="w3009ListDomain" property="trItemTyp" indexed="true" /> 
                         <html:hidden name="w3009ListDomain" property="shipperCd" indexed="true" /> 
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