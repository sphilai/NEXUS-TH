<%--
 * Project : GSCM
 * 
 * W7004 - Shipment Actuality Register
 *
 * $Revision: 11939 $
 * 
 * Copyright (c) 2013 DENSO CORPORATION. All rights reserved.
 --%>

<html:form action="/W7004Init" styleId="mainForm">
    <%--
    -- search condition 1
    --%>
    <table class="gscm_search">
        <colgroup>
            <col class="search_shipper_cd" />
            <col class="search_consignee_cd" />
            <col class="search_ship_to_comp_cd" />
            <col class="search_trns_cd" />
            <col class="search_no_of_invoice" />
            <col class="search_no_of_container" />
            <col class="search_pkg_qty" />
            <col class="search_shipping_act_status" />
            <col class="search_freight_responsible_cd" />
            <col class="search_auto_invoice_register_flg" />
            <col class="search_billd_update" />
            <col class="search_register_dt" />
        </colgroup>
        <tr>
            <th>
                <bean:message key="label.shipperCd" />
            </th>
            <th>
                <bean:message key="label.consigneeCd" />
            </th>
            <th>
                <bean:message key="label.shipToCompCd" />
            </th>
            <th>
                <bean:message key="label.trnsCd" />
            </th>
            <th>
                <bean:message key="label.noOfInvoice" />
            </th>
            <th>
                <bean:message key="label.noOfContainer" />
            </th>
            <th>
                <bean:message key="label.pkgQty" />
            </th>
            <th>
                <bean:message key="label.shippingActStatus" />
            </th>
            <th>
                <bean:message key="W7004.label.freightResponsibleCd" />
            </th>
            <th>
                <bean:message key="label.autoInvoiceRegisterFlg" />
            </th>
            <th>
                <bean:message key="label.billdUpdate" />
            </th>
            <th>
                <bean:message key="label.registerDt" />
            </th>
        </tr>
        <tr>
            <td>
                <html:text property="w7004CriteriaDomain.shipperCd" styleClass="w7004_shipper_cd gscm_disptext" readonly="true"/>
            </td>
            <td>
                <html:text property="w7004CriteriaDomain.consigneeCd" styleClass="consignee_cd gscm_disptext" readonly="true"/>
            </td>
            <td>
                <html:text property="w7004CriteriaDomain.shipToCompCd" styleClass="ship_to_comp_cd gscm_disptext" readonly="true"/>
            </td>
            <td>
                <html:text property="w7004CriteriaDomain.trnsCd" styleClass="w7004_view_trns_cd gscm_disptext" readonly="true"/>
            </td>
            <td>
                <html:text property="w7004CriteriaDomain.noOfInvoice" styleClass="no_of_invoice gscm_disptext" readonly="true"/>
            </td>
            <td>
                <html:text property="w7004CriteriaDomain.noOfContainer" styleClass="no_of_container gscm_disptext" readonly="true"/>
            </td>
            <td>
                <html:text property="w7004CriteriaDomain.pkgQty" styleClass="pkg_qty gscm_disptext" readonly="true"/>
            </td>
            <td>
                <html:text property="w7004CriteriaDomain.shippingActStatus" styleClass="w7004_shipping_act_status gscm_disptext" readonly="true"/>
            </td>
            <td>
                <html:text property="w7004CriteriaDomain.freightResponsibleCd" styleClass="w7004_view_freight_responsible_cd gscm_disptext" readonly="true"/>
            </td>
            <td>
                <html:text property="w7004CriteriaDomain.autoInvoiceRegisterFlg" styleClass="auto_invoice_register_flg gscm_disptext" readonly="true"/>
            </td>
            <td>
                <bean:write name="W7004Form" property="w7004CriteriaDomain.billdUpdate" />
            </td>
            <td>
                <html:text property="w7004CriteriaDomain.registerDt" styleClass="register_dt gscm_disptext" readonly="true"/>
            </td>
        </tr>
    </table>
    <%--
    -- search condition 2
    --%>
    <table class="gscm_search">
        <colgroup>
            <col class="search_atd" />
            <col class="search_eta" />
            <col class="search_carrier_comp_cd" />
            <col class="search_vessel" />
            <col class="search_billd_no" />
            <col class="search_container_loose_typ"/>
        </colgroup>
        <tr>
            <th>
                <bean:message key="label.atd" />
            </th>
            <th>
                <bean:message key="label.eta" />
            </th>
            <th>
                <bean:message key="label.carrierCompCd" />
            </th>
            <th>
                <bean:message key="label.vessel" />
            </th>
            <th>
                <bean:message key="label.billdNo" />
            </th>
            <th>
                <bean:message key="label.containerLooseTyp" />
            </th>
        </tr>
        <tr>
            <td>
                <html:text property="w7004CriteriaDomain.atd" maxlength="8" styleClass="atd gscm_required" errorStyleClass="atd gscm_error_class" />
                <img src="images/gscm/library/Calendar.gif"
                    onClick = "gscm.writeCalendar('atdDiv', 'mainForm', 'w7004CriteriaDomain.atd', '<bean:message key="format.screen.yyyymmdd" />', this);"/>
                <div id="atdDiv" style="float:left;"></div>
            </td>
            <td>
                <html:text property="w7004CriteriaDomain.eta" maxlength="8" styleClass="eta gscm_required" errorStyleClass="eta gscm_error_class" />
                <img src="images/gscm/library/Calendar.gif"
                    onClick = "gscm.writeCalendar('etaDiv', 'mainForm', 'w7004CriteriaDomain.eta', '<bean:message key="format.screen.yyyymmdd" />', this);"/>
                <div id="etaDiv" style="float:left;"></div>
            </td>
            <td>
                <html:text property="w7004CriteriaDomain.carrierCompCd" maxlength="3" styleClass="w7004_carrier_comp_cd gscm_required" errorStyleClass="w7004_carrier_comp_cd gscm_error_class" />
                <html:button property="select" onclick="setCarrier();" styleClass="select">
                    <bean:message key="button.select" />
                </html:button>
            </td>
            <td>
                <html:text property="w7004CriteriaDomain.vessel" maxlength="35" styleClass="vessel gscm_required" errorStyleClass="vessel gscm_error_class" /><%-- UT261 MOD --%>
            </td>
            <td>
                <html:text property="w7004CriteriaDomain.billdNo" maxlength="35" styleClass="billd_no gscm_required" errorStyleClass="billd_no gscm_error_class" />
            </td>
            <td>
                <html:select property="w7004CriteriaDomain.containerLooseTyp" styleClass="container_loose_typ gscm_required" errorStyleClass="container_loose_typ gscm_error_class" >
                    <html:options collection="containerLooseTyp" property="id" labelProperty="name"/>
                </html:select>
            </td>
        </tr>
    </table>
    <%--
    -- buttons 1
    --%>
    <table class="gscm_search_button">
        <colgroup>
            <col />
        </colgroup>
        <tr>
            <td>
                <html:button property="backToCreate" onclick="gscm.submitBack('W7003Init.do', this.form);" styleClass="back_to_create">
                    <bean:message key="button.backToCreate" />
                </html:button>
                <html:button property="backToMainScreen" onclick="gscm.commonSubmit('W7004BackToMainScreen.do', this.form);" styleClass="back_to_main_screen">
                    <bean:message key="button.backToMm" />
                </html:button>
            </td>
        </tr>
    </table>
    <hr />
    <logic:notEmpty name="W7004Form" property="listDomainList" >
        <%--
        -- buttons 2
        --%>
        <table class="gscm_search_button">
            <colgroup>
                <col />
            </colgroup>
            <tr>
                <td>
                    <bean:define id="deleteConfirmMessage"><bean:message key="GSCM-I0-0005" locale="${locale_key}" /></bean:define>
                    <html:button property="delete" onclick="gscm.submitConfirm('W7004Delete.do', this.form, '${deleteConfirmMessage}');" styleClass="delete">
                        <bean:message key="button.delete" />
                    </html:button>
                    
                    <bean:define id="registerConfirmMessage">
                        <logic:equal name="W7004Form" property="w7004CriteriaDomain.procMode" value="1"><bean:message key="GSCM-I0-0003" locale="${locale_key}" /></logic:equal>
                        <logic:notEqual name="W7004Form" property="w7004CriteriaDomain.procMode" value="1"><bean:message key="GSCM-I0-0004" locale="${locale_key}" /></logic:notEqual>
                    </bean:define>
                    <html:button property="register" onclick="gscm.submitConfirm('W7004Register.do', this.form, '${registerConfirmMessage}');" styleClass="register">
                        <bean:message key="button.register" />
                    </html:button>
                    <html:button property="printClp" onclick="gscm.commonSubmitForCheck('W7004PrintClp.do', this.form, 'false', 'false');" styleClass="print_clp">
                        <bean:message key="button.printClp" />
                    </html:button>
                    <html:button property="moveToBlUpload" onclick="gscm.commonSubmit('W7004MoveToBlUpload.do', this.form);" styleClass="move_to_bl_upload">
                        <bean:message key="button.moveToBlUpload" />
                    </html:button>
                    <html:button property="moveToOtherDocUpload" onclick="gscm.commonSubmit('W7004MoveToOtherDocUpload.do', this.form);" styleClass="move_to_other_doc_upload">
                        <bean:message key="button.moveToOtherDocUpload" />
                    </html:button>
                    <bean:define id="cancelConfirmMessage"><bean:message key="NXS-I1-0009" locale="${locale_key}" /></bean:define>
                    <html:button property="cancel" onclick="gscm.submitConfirm('W7004Cancel.do', this.form, '${cancelConfirmMessage}');" styleClass="cancel">
                        <bean:message key="button.cancel" />
                    </html:button>
                </td>
            </tr>
        </table>
        <%--
        -- search results
        --%>
        <table id="tablefix" class="gscm_resultlist">
            <colgroup>
                <col class="resultlist_delete" />
                <col class="resultlist_invoice_no" />
                <col class="resultlist_full_rt_inv" />
                <col class="resultlist_pkg_qty" />
                <col class="resultlist_shipping_act_status" />
                <col class="resultlist_need_other_doc_flg" />
                <col class="resultlist_move_to_other_doc_Upload" />
                <col class="resultlist_status_change"/>
            </colgroup>
            <thead>
                <tr>
                    <th>
                        <bean:message key="label.delete" />
                    </th>
                    <th>
                        <bean:message key="label.invoiceNo" />
                    </th>
                    <th>
                        <bean:message key="label.fullRtInv" />
                    </th>
                    <th>
                        <bean:message key="label.pkgQty" />
                    </th>
                    <th>
                        <bean:message key="label.shippingActStatus" />
                    </th>
                    <th>
                        <bean:message key="label.needOtherDocFlg" />
                    </th>
                    <th>
                        <bean:message key="label.moveToOtherDocUpload" />
                    </th>
                    <th>
                        <bean:message key="label.statusChange" />
                    </th>
                </tr>
            </thead>
            <tbody>
                <logic:iterate name="W7004Form" property="listDomainList" id="listDomainList" indexId="idx">
                    <ai:stripeline number="${idx + 1}" odd="gscm_odd" even="gscm_even">
                        <tr class="gscm_odd">
                            <td class="center">
                                <html:checkbox name="listDomainList" property="selected" indexed="true" />
                            </td>
                            <td>
                                <html:text name="listDomainList" property="invoiceNo" indexed="true" styleClass="invoice_no gscm_disptext" readonly="true" />
                            </td>
                            <td>
                                <bean:write name="listDomainList" property="fullRtInv" />
                            </td>
                            <td class="right">
                                <bean:write name="listDomainList" property="pkgQty" />
                            </td>
                            <td>
                                <html:text name="listDomainList" property="shippingActStatus" indexed="true" styleClass="shipping_act_status gscm_disptext" readonly="true" />
                            </td>
                            <td>
                                <bean:write name="listDomainList" property="needOtherDocFlg" />
                            </td>
                            <td class="center">
                                <html:button property="move" onclick="submitSelectedRow('W7004Move.do', this.form, ${idx});" styleClass="move">
                                    <bean:message key="button.move" />
                                </html:button>
                            </td>
                            <td class="center">
                                <bean:define id="changeStatusMessage"><bean:message key="NXS-I1-0002" locale="${locale_key}" /></bean:define>
                                <html:button property="changeStatus" onclick="selectChangeStatus('W7004ChangeStatus.do', this.form, ${idx}, '${changeStatusMessage}');" styleClass="change_status">
                                    <bean:message key="button.changeStatus" />
                                </html:button>
                            </td>
                            <html:hidden name="listDomainList" property="comUpdateTimestamp" indexed="true" />
                            <%-- <html:hidden name="listDomainList" property="invoiceIssueDt" indexed="true" /> ST184 INVOICE ISSUE DATE/インボイス発行日 DEL --%>
                        </tr>
                    </ai:stripeline>
                </logic:iterate>
            </tbody>
        </table>
    </logic:notEmpty>
    <%--
    -- hidden
    --%>
    <html:hidden property="w7004CriteriaDomain.shippingActNo" />
    <logic:notEmpty name="W7004Form" property="w7004CriteriaDomain.comUpdateTimestamp">
        <html:hidden property="w7004CriteriaDomain.comUpdateTimestamp" />
    </logic:notEmpty>
    <html:hidden property="w7004CriteriaDomain.continueFlag" />
    <html:hidden property="w7004CriteriaDomain.selectedRow" />
    <html:hidden property="w7004CriteriaDomain.confirmMsg" />
    <html:hidden property="w7004CriteriaDomain.originalScreenId" />
    <html:hidden property="w7004CriteriaDomain.procMode"/>
    <html:hidden property="callScreenId" />
</html:form>
