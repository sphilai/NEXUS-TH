<%--
 * W5004.jsp
 * 
 * JSP of staging instruction register.
 * 出荷確認Register画面のJSPです。
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 --%>
<html:form action="/W5004Init" styleId="mainForm">
    <%--
    -- search condition 1
    --%>
    <table class="gscm_search">
        <colgroup>
            <col class="search_wh_comp_cd" />
            <col class="search_wh_cd" />
            <col class="search_trns_cd" />
            <col class="search_container_sorting_key" />
            <col class="search_container_loose_typ" />
            <col class="search_pkg_qty" />
            <col class="search_gross_weight" />
            <col class="search_volume" />
            <col class="search_operation_no" />
            <col class="search_shipping_Firm_status"/>
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
                <bean:message key="label.containerLooseTyp" />
            </th>
            <th>
                <bean:message key="label.pkgQty" />
            </th>
            <th>
                <bean:message key="label.totalGrossWeight" />
            </th>
            <th>
                <bean:message key="label.totalVolume" />
            </th>
            <th>
                <bean:message key="label.operationNo" />
            </th>
            <th>
                <bean:message key="label.shippingFirmStatus" />
            </th>
        </tr>
        <tr>
            <td>
                <bean:write name="W5004Form" property="w5004CriteriaDomain.whCompCd" />
            </td>
            <td>
                <bean:write name="W5004Form" property="w5004CriteriaDomain.whCd" />
            </td>
            <td>
                <bean:write name="W5004Form" property="w5004CriteriaDomain.trnsCd" />
            </td>
            <td>
                <bean:write name="W5004Form" property="w5004CriteriaDomain.containerSortingKey" />
            </td>
            <td>
                <html:text property="w5004CriteriaDomain.containerLooseTyp" 
                    styleClass="containerLooseTyp_text gscm_disptext" readonly="true"/>
            </td>
            <td>
                <html:text property="w5004CriteriaDomain.pkgQty" 
                    styleClass="pkgQty_text gscm_disptext" readonly="true"/>
            </td>
            <td>
                <bean:write name="W5004Form" property="w5004CriteriaDomain.grossWeight" />
                &nbsp;<bean:write name="W5004Form" property="w5004CriteriaDomain.weightUnitDisp" />
            </td>
            <td>
                <bean:write name="W5004Form" property="w5004CriteriaDomain.volume" />
                &nbsp;<bean:write name="W5004Form" property="w5004CriteriaDomain.volumeUnitDisp" />
            </td>
            <td>
                <html:text property="w5004CriteriaDomain.operationNo" 
                    styleClass="operationNo_text gscm_disptext" readonly="true"/>
            </td>
            <td>
                <bean:write name="W5004Form" property="w5004CriteriaDomain.shippingFirmStatus" />
            </td>
        </tr>
    </table>
    <%--
    -- search condition 2
    --%>
    <table class="gscm_search">
        <colgroup>
            <col class="search_confirmation_no" />
            <col class="search_etd" />
            <col class="search_carrier_comp_cd" />
            <col class="search_container_no" />
            <col class="search_worked_date" />
            <col class="search_worked_method" />
            <col class="search_worker" />
            <col class="search_issuer" />
            <col class="search_issue_date" />
        </colgroup>
        <tr>
            <th>
                <bean:message key="label.shippingFirmNo" />
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
                <bean:message key="label.workedDt" />
            </th>
            <th>
                <bean:message key="label.workedMethValue" />
            </th>
            <th>
                <bean:message key="label.worker" />
            </th>
            <th>
                <bean:message key="label.issuer" />
            </th>
            <th>
                <bean:message key="label.issueDate" />
            </th>
        </tr>
        <tr>
            <td>
                <bean:write name="W5004Form" property="w5004CriteriaDomain.shippingFirmNo" />
            </td>
            <td>
                <c:if test="${W5004Form.activeFlg}">
                    <html:text property="w5004CriteriaDomain.etd" maxlength="8" 
                        styleClass="etd gscm_required" errorStyleClass="etd gscm_error_class" />
                    <img src="images/gscm/library/Calendar.gif" alt="calender"
                        onClick = "gscm.writeCalendar('etdDiv', 'mainForm', 'w5004CriteriaDomain.etd', 
                            '<bean:message key="format.screen.yyyymmdd"/>', this);"/>
                    <div id="etdDiv" style="float:left;"></div>
                </c:if>
                <c:if test="${!W5004Form.activeFlg}">
                    <html:text property="w5004CriteriaDomain.etd" maxlength="8" styleClass="etd" />
                </c:if>
            </td>
            <td>
                <c:if test="${W5004Form.activeFlg}">
                    <html:text property="w5004CriteriaDomain.carrierCompCd" maxlength="3" 
                        styleClass="carrier_comp_cd gscm_required" 
                            errorStyleClass="carrier_comp_cd gscm_error_class" />
                </c:if>
                <c:if test="${!W5004Form.activeFlg}">
                    <html:text property="w5004CriteriaDomain.carrierCompCd" maxlength="3" 
                        styleClass="carrier_comp_cd" />
                </c:if>
                <html:button property="select" onclick="showSelectCarrier();">
                    <bean:message key="button.select" />
                </html:button>
            </td>
            <td>
                <html:text property="w5004CriteriaDomain.containerNo" maxlength="12" 
                    styleClass="container_no gscm_required" 
                        errorStyleClass="container_no gscm_error_class" />
            </td>
            <td>
                <bean:write name="W5004Form" property="w5004CriteriaDomain.workedDt" />
            </td>
            <td>
                <bean:write name="W5004Form" property="w5004CriteriaDomain.value" />
            </td>
            <td >
                <html:text property="w5004CriteriaDomain.workedIssuerNm" 
                    styleClass="workedIssuerNm_text gscm_disptext" readonly="true" />
            </td>
            <td >
                <html:text property="w5004CriteriaDomain.shippingFirmIssuerNm" 
                    styleClass="shippingFirmIssuerNm_text gscm_disptext" readonly="true" />
            </td>
            <td>
                <bean:write name="W5004Form" property="w5004CriteriaDomain.shippingFirmDt" />
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
                <html:button property="backToCreate" 
                    onclick="gscm.submitBack('W5003Init.do', this.form);" 
                    styleClass="back_to_create">
                    <bean:message key="button.backToCreate" />
                </html:button>
                <html:button property="backToMainScreen" 
                    onclick="gscm.submitBack('W5001Init.do', this.form);" 
                    styleClass="back_to_main_screen">
                    <bean:message key="button.backToMainScreen" />
                </html:button>
            </td>
        </tr>
    </table>
    <hr />
    <logic:notEmpty name="W5004Form" property="listDomainList">
        <%--
        -- buttons 2
        --%>
        <table class="gscm_resultlist_button">
            <colgroup>
                <col />
            </colgroup>
            <tr>
                <td>
                    <bean:define id="registerConfirmMessage">
                        <bean:message key="GSCM-I0-0003"/></bean:define>
                    <bean:define id="reUpdateConfirmMessage">
                        <bean:message key="GSCM-I0-0004"/></bean:define>
                    <bean:define id="registerWorkingMessage">
                        <bean:message key="NXS-I1-0012"/></bean:define>
                    <bean:define id="cancelMessage"><bean:message key="GSCM-I0-0005"/></bean:define>
                    <html:button property="register" onclick="gscm.submitConfirm('W5004Register.do', 
                        this.form, '${registerConfirmMessage}');" styleClass="register">
                        <bean:message key="button.register" />
                    </html:button>
                    <html:button property="printConfirmation" onclick="gscm.commonSubmitForCheck(
                        'W5004PrintConfirmation.do', this.form, 'false', 'false');" 
                        styleClass="print_confirmation">
                        <bean:message key="button.printConfirmation" />
                    </html:button>
                    <html:button property="reUpdateContainerNo" onclick="gscm.submitConfirm(
                        'W5004ReUpdateContainerNo.do', this.form, '${reUpdateConfirmMessage}');" 
                        styleClass="re_update_container_no">
                        <bean:message key="button.reUpdateContainerNo" />
                    </html:button>
                    <html:button property="registerWorking" onclick="gscm.submitConfirm(
                        'W5004RegisterWorking.do', this.form, '${registerWorkingMessage}');" 
                        styleClass="register_working">
                        <bean:message key="button.registerWorking" />
                    </html:button>
                    <html:button property="cancel" onclick="gscm.submitConfirm(
                        'W5004Cancel.do', this.form, '${cancelMessage}');" 
                        styleClass="cancel">
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
                <col class="resultlist_shipper" />
                <col class="resultlist_x_tag_no" />
                <col class="resultlist_etd" />   
                <col class="resultlist_carrier_comp_cd" />
                <col class="resultlist_gw_kg" />
                <col class="resultlist_vol_m3" />
            </colgroup>
            <thead>
                <tr>
                    <th>
                        <bean:message key="label.shipper" />
                    </th>
                    <th>
                        <bean:message key="label.xmainMark" />/<bean:message key="label.mainMark" />
                    </th>
                    <th>
                        <bean:message key="label.etd" />
                    </th>
                    <th>
                        <bean:message key="label.carrierCompCd" />
                    </th>
                    <th>
                        <bean:message key="label.grossWeight" /><br />
                        (<bean:write name="W5004Form" 
                            property="w5004CriteriaDomain.weightUnitDisp" />)
                    </th>
                    <th>
                        <bean:message key="label.vol" /><br />
                        (<bean:write name="W5004Form" 
                            property="w5004CriteriaDomain.volumeUnitDisp" />)
                    </th>
                </tr>
            </thead>
            <tbody>
                <logic:iterate name="W5004Form" property="listDomainList" 
                    id="listDomain" indexId="idx">
                    <ai:stripeline number="${idx + 1}" odd="gscm_odd" even="gscm_even">
                        <tr>
                            <td>
                                <bean:write name="listDomain" property="shipperCd" />
                            </td>
                            <td>
                                <c:if test="${!listDomain.notLinkFlg}">
                                    <a href="#" onclick="showItemOrCMLScreen(
                                        '${listDomain.xmainMark}', '${listDomain.mainMark}');">
                                            <bean:write name="listDomain" 
                                                property="xtagOrCml" /></a>
                                </c:if>
                                <c:if test="${listDomain.notLinkFlg}">
                                    <bean:write name="listDomain" property="xtagOrCml" />
                                </c:if>
                            </td>
                            <td>
                                <bean:write name="listDomain" property="invoiceEtd" />
                            </td>
                            <td>
                                <bean:write name="listDomain" property="invoiceCarrierCompCd" />
                            </td>
                            <td class="right">
                                <bean:write name="listDomain" property="pltzGrossWeight" />
                            </td>
                            <td class="right">
                                <bean:write name="listDomain" property="pltzVolume" />
                            </td>
                            <html:hidden name="listDomain" property="xmainMark" />
                            <html:hidden name="listDomain" property="mainMark" />
                        </tr>
                    </ai:stripeline>
                </logic:iterate>
            </tbody>
        </table>
    </logic:notEmpty>
    <%--
    -- hidden
    --%>
    <html:hidden property="windowId" />
    <html:hidden property="languageCd" />
    <html:hidden property="screenId" />
    <html:hidden property="callScreenId" />
    <logic:notEmpty name="W5004Form" property="w5004CriteriaDomain.comUpdateTimestamp">
        <html:hidden property="w5004CriteriaDomain.comUpdateTimestamp" />
    </logic:notEmpty>
    <html:hidden property="w5004CriteriaDomain.stgActNo" />
    <html:hidden property="w5004CriteriaDomain.stgInstrNo" />
    <html:hidden property="w5004CriteriaDomain.trnsTypCd" />
</html:form>
