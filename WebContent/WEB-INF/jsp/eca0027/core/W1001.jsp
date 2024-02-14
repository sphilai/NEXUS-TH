<%--
 * W1001.jsp
 * 
 * 梱包指示Create画面のJSPです。
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 --%>
<html:form action="/W1001Search" styleId="mainForm">
    <%--
    -- search condition 1
    --%>
    <table class="gscm_search">
        <colgroup>
            <col class="search_shipper_cd" />
            <col class="search_status_cd" />
            <col class="search_consignee_cd" />
            <col class="search_nexus_ship_to" />
            <col class="search_request_no" />
            <col class="search_issuer_cd" />
        </colgroup>
        <tr>
            <th colspan="2">
                <bean:message key="label.shipperCd" />
            </th>
            <th>
                <bean:message key="label.status" />
            </th>
            <th colspan="2">
                <bean:message key="label.consigneeCd" />
            </th>
            <th colspan="2">
                <bean:message key="label.nexusShipTo" />
            </th>
            <th>
                <bean:message key="label.requestNo" />
            </th>
            <th>
                <bean:message key="label.issuer" />
            </th>
        </tr>
        
        <tr>
            <td>
                <html:text property="w1001CriteriaDomain.shipperCd" maxlength="5"  styleClass="shipper_cd" errorStyleClass="shipper_cd gscm_error_class" />
                
            </td>
            <td>
            	<html:button property="select" onclick="setShipper();" styleClass="select">
                    <bean:message key="button.select" />
                </html:button>
            </td>
            <td>
                <html:select property="w1001CriteriaDomain.requestStatus" styleClass="request_Status" >
                    <html:options collection="requestStatus" property="id" labelProperty="name"/>
                </html:select>
            </td>
            <td>
                <html:text property="w1001CriteriaDomain.consigneeCd" maxlength="5" styleClass="consignee_cd" errorStyleClass="consignee_cd gscm_error_class" />
            </td>
            <td>
            	<html:button property="select" onclick="setConsignee();" styleClass="select">
                    <bean:message key="button.select" />
                </html:button>
            </td>
            <td>
                <html:text property="w1001CriteriaDomain.shipToCd" maxlength="7" styleClass="nexus_ship_to" errorStyleClass="nexus_ship_to gscm_error_class" />
            </td>
            <td>
            	<html:button property="select" onclick="selectShipTo();" styleClass="select">
                    <bean:message key="button.select" />
                </html:button>
            </td>
            <td>
                <html:text property="w1001CriteriaDomain.expRequestNo" maxlength="12" styleClass="request_no" errorStyleClass="request_no gscm_error_class" />
            </td>
            <td>
                <html:select property="w1001CriteriaDomain.comCreateUserId" styleClass="issuer" >
                    <html:options collection="issuer" property="id" labelProperty="name"/>
                </html:select>
            </td>
        </tr>
    </table>
    <%--
    -- search condition 2
    --%>
    <table class="gscm_search">
        <colgroup>
            <col class="search_trns_cd" />
            <col class="search_lst_update_dt_from" />
            <col class="search_lst_update_dt_to" />
            <col class="search_item_no" />
            <col class="search_item_des" />
            <col class="search_cml_no" />
            <col class="search_inv_cat" />
        </colgroup>
        <tr>
            <th>
                <bean:message key="label.trnsCd" />
            </th>
            <th colspan="2">
                <bean:message key="label.fmLastDt" />
            </th>
            <th colspan="2">
                <bean:message key="label.toLastDt" />
            </th>
            <th>
                <bean:message key="label.itemNo" />
            </th>
            <th>
                <bean:message key="label.itemDescription" />
            </th>
            <th>
                <bean:message key="label.mainMark" />
            </th>
            <th>
                <bean:message key="label.invoiceCtgry" />
            </th>
        </tr>
        <tr>
            <td>
                <html:select property="w1001CriteriaDomain.trnsCd" styleClass="trns_cd">
                    <html:options collection="trnsCd" property="id" labelProperty="name" />
                </html:select>
            </td>
            <td>
                <html:text property="w1001CriteriaDomain.fmUpdateTimestamp" maxlength="8" styleClass="lst_update_dt_from" errorStyleClass="lst_update_dt_from gscm_error_class" />
            </td>
            <td>
            	<img src="images/gscm/library/Calendar.gif"
                    onClick = "gscm.writeCalendar('lstUpdateDtFromDiv', 'mainForm', 'w1001CriteriaDomain.fmUpdateTimestamp', '<bean:message key="format.screen.yyyymmdd"/>', this);"/>
                <div id="lstUpdateDtFromDiv" style="float:left;"></div>
            </td>
            <td>
                <html:text property="w1001CriteriaDomain.toUpdateTimestamp" maxlength="8" styleClass="lst_update_dt_to" errorStyleClass="lst_update_dt_to gscm_error_class" />
            </td>
            <td>
            	<img src="images/gscm/library/Calendar.gif"
                    onClick = "gscm.writeCalendar('lstUpdateDtToDiv', 'mainForm', 'w1001CriteriaDomain.toUpdateTimestamp', '<bean:message key="format.screen.yyyymmdd" />', this);"/>
                <div id="lstUpdateDtToDiv" style="float:left;"></div>
            </td>
            <td>
                <html:text property="w1001CriteriaDomain.pltzItemNo" maxlength="27" styleClass="item_no" errorStyleClass="item_no gscm_error_class" />
            </td>
            <td>
                <html:text property="w1001CriteriaDomain.itemDescription" maxlength="200" styleClass="item_des" errorStyleClass="item_des gscm_error_class" />
            </td>
            <td>
                <html:text property="w1001CriteriaDomain.mainMark" maxlength="20" styleClass="cml_no" errorStyleClass="cml_no gscm_error_class" />
            </td>
            <td>
                <html:select property="w1001CriteriaDomain.invoiceCtgry" styleClass="invoice_ctgry">
                    <html:options collection="invoiceCtgry" property="id" labelProperty="name" />
                </html:select>
            </td>
        </tr>
    </table>
    <%--
    -- search condition 3
    --%>
    <table class="gscm_search">
        <colgroup>
            <col class="search_wh_com_cd" />
            <col class="search_nexus_wh_cd" />
            <col class="search_customer_no" />
            <col class="search_ship_to" />
            <col class="search_split_prohibit" />
        </colgroup>
        <tr>
            <th>
                <bean:message key="W1001.label.packingCompCd" />
            </th>
            <th>
                <bean:message key="W1001.label.nexusWhWh" />
            </th>
            <th>
                <bean:message key="W1001.label.cigmaCusCd" />
            </th>
            <th>
                <bean:message key="W1001.label.customerShipTo" />
            </th>
            <th>
                <bean:message key="label.splitProhibitFlg" />
            </th>
        </tr>
        
        <tr>
            <td>
                <html:text property="w1001CriteriaDomain.packingCompCd" maxlength="5" styleClass="wh_cd" errorStyleClass="wh_cd gscm_error_class" />
            </td>
            <td>
                <html:text property="w1001CriteriaDomain.packingWhCd" maxlength="4" styleClass="nexus_wh_cd" errorStyleClass="nexus_wh_cd gscm_error_class" />
            </td>
            <td>
                <html:text property="w1001CriteriaDomain.customerCd" maxlength="8" styleClass="customer_no" errorStyleClass="customer_no gscm_error_class" />
            </td>
            <td>
                <html:text property="w1001CriteriaDomain.customerShipTo" maxlength="2" styleClass="ship_to" errorStyleClass="ship_to gscm_error_class" />
            </td>
            <td>
                <html:select property="w1001CriteriaDomain.splitShippingNgFlg" styleClass="split_prohibit" >
                    <html:options collection="flag" property="id" labelProperty="name"/>
                </html:select>
            </td>
        </tr>
    </table>
    <%--
    -- buttons 1
    --%>
    <table class="gscm_search_button">
        <colgroup>
            <col width="20px" />
            <col />
            <col />
        </colgroup>
        <tr>
            <td>
                <html:button property="createNew" styleClass="create_new" onclick="gscm.commonSubmit('W1001CreateNew.do', this.form);">
                    <bean:message key="button.createNew" />
                </html:button>
            </td>
            <td class="right">
                <html:button property="search" styleClass="search" onclick="gscm.submitSearch('W1001Search.do', this.form, '');">
                    <bean:message key="button.search" />
                </html:button>
            </td>
        </tr>
    </table>
    <hr />
        <logic:notEmpty name="W1001Form" property="listDomainList" >
            <%--
            -- buttons 2
            --%>
            <table class="gscm_resultlist_button">
                <colgroup>
                    <col class="resultlist_button_duplicate" />
                    <col class="resultlist_button_detail" />
                    <col class="resultlist_button_move_to_register" />
                    <col class="resultlist_button_move_to_pkg" />
                </colgroup>
                <tr>
                    <td>
                        <html:button property="duplicate" styleClass="duplicate" onclick="gscm.commonSubmit('W1001Duplicate.do', this.form);">
                            <bean:message key="button.duplicate" />
                        </html:button>
                    </td>
                     <td>
                        <html:button property="detail" styleClass="detail" onclick="gscm.commonSubmit('W1001Edit.do', this.form);">
                            <bean:message key="button.detail" />
                        </html:button>
                    </td>
                     <td>
                        <html:button property="moveToRegister" styleClass="moveToRegister" onclick="gscm.commonSubmit('W1001MoveToRegister.do', this.form);">
                            <bean:message key="button.moveToRegisterPrint" />
                        </html:button>
                    </td>
                     <td>
                        <html:button property="moveToPkg" styleClass="moveToPkg" onclick="gscm.commonSubmit('W1001MoveToPackaging.do', this.form);">
                            <bean:message key="button.moveToPkg" />
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
                    <td class="right" style="padding-right: 20px;"><%@ include
                        file="/WEB-INF/jsp/includes/gscm/framework/pager.jspf"%>
                    </td>
                </tr>
            </table>
            <%--
            -- search results
            --%>
            <table id="tablefix" class="gscm_resultlist">
                <colgroup>
                    <col class="resultlist_ck" />
                    <col class="resultlist_status" />
                    <col class="resultlist_request_no" />
                    <col class="resultlist_shipper_cd" />
                    <col class="resultlist_consignee_cd" />
                    <col class="resultlist_nexus_ship_to" />
                    <col class="resultlist_trns_cd" />
                    <col class="resultlist_inv_cat" />                    
                    <col class="resultlist_issuer_name" />
                    <col class="resultlist_update_name" />
                    <col class="resultlist_lst_update_dt" />
                    <col class="resultlist_wh_com" />
                    <col class="resultlist_wh_cd" />
                    <col class="resultlist_split_prohibit" />
                </colgroup>
                <tr>
                    <th><bean:message key="label.ck" /></th>
                    <th><bean:message key="label.status" /></th>
                    <th><bean:message key="label.requestNo" /></th>
                    <th><bean:message key="label.shipper" /></th>
                    <th><bean:message key="label.consignee" /></th>
                    <th><bean:message key="label.nexusShipToCd" /></th>
                    <th><bean:message key="label.trans" /></th>
                    <th><bean:message key="label.invCtg" /></th>                    
                    <th><bean:message key="label.issuerName" /></th>
                    <th><bean:message key="label.updateName" /></th>
                    <th><bean:message key="label.lastMdfDt" /></th>
                    <th><bean:message key="label.whCom" /></th>
                    <th><bean:message key="label.nexusWhCdAbbr" /></th>
                    <th><bean:message key="label.splitProhibitFlg" /></th>
                </tr>
                <logic:iterate name="W1001Form" property="listDomainList" id="listDomainList" indexId="idx">
                    <ai:stripeline number="${idx + 1}" odd="gscm_odd" even="gscm_even">
                        <tr>
                            <td class="center">
                                <html:radio property="w1001CriteriaDomain.selected" value="${idx}" />
                            </td>
                            <td style="OVERFLOW: hidden;">
                                <bean:write name="listDomainList" property="requestStatus" />
                            </td>
                            <td style="OVERFLOW: hidden;">
                            	<html:text name="listDomainList" property="expRequestNo"  styleClass="resultlist_expRequestNo gscm_disptext" readonly="true"  />
                            </td>
                            <td style="OVERFLOW: hidden;">
                                <html:text name="listDomainList" property="shipperCd"  styleClass="resultlist_shipperCd gscm_disptext" readonly="true"  />
                            
                            </td>
                            <td style="OVERFLOW: hidden;">
                                <html:text name="listDomainList" property="consigneeCd"  styleClass="resultlist_consigneeCd gscm_disptext" readonly="true"  />
                            
                            </td>
                            <td style="OVERFLOW: hidden;">
                                <html:text name="listDomainList" property="shipToCd"  styleClass="resultlist_shipToCd gscm_disptext" readonly="true"  />
                            
                            </td>
                            <td style="OVERFLOW: hidden;">
                                <bean:write name="listDomainList" property="trnsCd" />
                            </td>
                            <td style="OVERFLOW: hidden;">
                                <bean:write name="listDomainList" property="invoiceCtgry" />
                            </td>                            
                            <td style="OVERFLOW: hidden;">
                                <html:text name="listDomainList" property="comCreateUserId"  styleClass="resultlist_issuer_name gscm_disptext" readonly="true"  />
                            </td>
                            <td style="OVERFLOW: hidden;">
                                <html:text name="listDomainList" property="comUpdateUserId"  styleClass="resultlist_update_name gscm_disptext" readonly="true"  />
                            </td>
                            <td style="OVERFLOW: hidden;">
                                <bean:write name="listDomainList" property="lastModifiedDate" />
                            </td>
                            <td style="OVERFLOW: hidden;">
                                <bean:write name="listDomainList" property="packingCompCd" />
                            </td>
                            <td style="OVERFLOW: hidden;">
                                <bean:write name="listDomainList" property="packingWhCd" />
                            </td>
                            <td style="OVERFLOW: hidden;">
                                <bean:write name="listDomainList" property="splitShippingNgFlg" />
                            </td>
                            <html:hidden name="listDomainList" property="weightUnit" />
                            <html:hidden name="listDomainList" property="packingCompCd" />
                            <html:hidden name="listDomainList" property="packingWhCd" />
                        </tr>
                    </ai:stripeline>
                </logic:iterate>
            </table>
        </logic:notEmpty>
        
    <%--
    -- hidden
    --%>
    <html:hidden property="callScreenId" />
</html:form>
