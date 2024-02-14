<%--
 * Project : GSCM
 * 
 * W6008 - Invoice Detail(Full Returnable)
 *
 * $Revision: 10038 $
 * 
 * Copyright (c) 2013 DENSO CORPORATION. All rights reserved.
 --%>

<html:form action="/W6008Init" styleId="mainForm">
    <%--
    -- search condition 1
    --%>
    <table class="gscm_search">
        <colgroup>
            <col class="search_shipper_cd" />
            <col class="search_consignee_cd" />
            <col class="search_ship_to_cd" />
            <col class="search_total_qty" />
            <col class="search_total_net_weight" />
            <col class="search_curr_cd" />
        </colgroup>
        <tr>
            <th>
                <bean:message key="label.shipper" />
            </th>
            <th>
                <bean:message key="label.consignee" />
            </th>
            <th>
                <bean:message key="label.nexusShipTo" />
            </th>
            <th>
                <bean:message key="label.totalQty" />
            </th>
            <th>
                <bean:message key="label.totalNw" />
            </th>
            <th>
                <bean:message key="label.cmlCur" />
            </th>
        </tr>
        <tr>
            <td>
                <bean:write name="W6008Form" property="w6008CriteriaDomain.shipperCd" />
            </td>
            <td>
                <bean:write name="W6008Form" property="w6008CriteriaDomain.consigneeCd" />
            </td>
            <td>
                <bean:write name="W6008Form" property="w6008CriteriaDomain.shipToCd" />
            </td>
            <td>
                <div class="w6008_total_qty right">
                    <bean:write name="W6008Form" property="w6008CriteriaDomain.totalQty" />
                </div>
            </td>
            <td>
                <div class="w6008_total_nw right">
                    <bean:write name="W6008Form" property="w6008CriteriaDomain.totalNw" />
                </div>
            </td>
            <td>
                <bean:write name="W6008Form" property="w6008CriteriaDomain.currCd" />
            </td>
        </tr>
    </table>

    <%--
    -- buttons 1
    --%>
    <table class="gscm_search_button">
        <colgroup>
            <col class="search_button_move_to_register" />
            <col class="search_button_refresh" />
        </colgroup>
        <tr>
            <td>
                <html:button property="moveToRegister" onclick="gscm.commonSubmit('W6008MoveToRegister.do', this.form);" styleClass="button_moveToRegister" >
                    <bean:message key="button.moveToRegister" />
                </html:button>
                <html:button property="backToInvoiceGrouping" onclick="gscm.submitBack('W6006Init.do', this.form);" styleClass="button_backToInvoiceGrouping" >
                    <bean:message key="button.backToInvoiceGrouping" />
                </html:button>
            </td>
            <td class="right">
                <html:button property="refresh" onclick="gscm.commonSubmit('W6008Init.do', this.form);" styleClass="button_refresh" >
                    <bean:message key="button.refresh" />
                </html:button>
            </td>
        </tr>
    </table>
    <hr />

    <%--
    -- buttons 2
    --%>
    <table class="gscm_resultlist_button">
        <colgroup>
            <col class="resultlist_button_remove" />
            <col class="resultlist_button_hs_code_warning" />
            <col class="resultlist_button_ignore_warnings" />
        </colgroup>
        <tr>
            <td>
                <html:button property="remove" onclick="gscm.commonSubmit('W6008Remove.do', this.form);" styleClass="button_remove" >
                    <bean:message key="button.remove" />
                </html:button>
            </td>
            <td>
                <table class="grid resultlist_button_hsCodeWarning">
                    <colgroup>
                        <col class="resultlist_button_label" />
                        <col />
                    </colgroup>
                    <tr>
                        <th>
                            <bean:message key="label.hsCodeWarning" />
                        </th>
                        <td>
                            <logic:equal name="W6008Form" property="w6008CriteriaDomain.hsCodeWarning" value="Y">
                                <a href="#" onclick="popupWT016('${W6008Form.w6008CriteriaDomain.shipperCd}', '${W6008Form.w6008CriteriaDomain.grpNo1}', '${W6008Form.w6008CriteriaDomain.grpNo2}')" >
                                    <bean:write name="W6008Form" property="w6008CriteriaDomain.hsCodeWarning" />
                                </a>
                            </logic:equal>
                            <logic:notEqual name="W6008Form" property="w6008CriteriaDomain.hsCodeWarning" value="Y">
                                <bean:write name="W6008Form" property="w6008CriteriaDomain.hsCodeWarning" />
                            </logic:notEqual>
                        </td>
                    </tr>
                </table>
            </td>
            <td>
                <html:checkbox property="w6008CriteriaDomain.ignoreWarnings" />Ignore Warnings
            </td>
        </tr>
    </table>


    <%--
    -- search results
    --%>
    <table id="tablefix" class="gscm_resultlist" width="960px">
        <colgroup>
            <col class="resultlist_remove" />
            <col class="resultlist_itemNo" />
            <col class="resultlist_modelCd" />
            <col class="resultlist_item_description" />
            <col class="resultlist_qty" />
            <col class="resultlist_list_curr_cd" />
            <col class="resultlist_unit_price" />
        </colgroup>
        <thead>
        <tr>
            <th>
                <bean:message key="label.reMove" />
            </th>
            <th>
                <bean:message key="label.itemNo" />
            </th>
            <th>
                <bean:message key="label.modelCd" />
            </th>
            <th>
                <bean:message key="label.description" />
            </th>
            <th>
                <bean:message key="label.qty" />
            </th>
            <th>
                <bean:message key="label.curr" />
            </th>
            <th>
                <bean:message key="label.unitPrice" />
            </th>
        </tr>
        </thead>
        <tbody>
              <logic:iterate name="W6008Form" property="listDomainList" id="listDomainList" indexId="idx">
                <ai:stripeline number="${idx + 1}" odd="gscm_odd" even="gscm_even">
                    <tr>
                        <td class="center">
                            <html:checkbox name="listDomainList" property="selected" indexed="true" />
                        </td>
                        <td>
                            <html:text name="listDomainList" property="itemNo" styleClass="w6008_item_no gscm_disptext" readonly="true" />
                        </td>
                        <td>
                            <html:text name="listDomainList" property="modelCd" styleClass="w6008_model_cd gscm_disptext" readonly="true" />
                        </td>
                        <td>
                            <html:text name="listDomainList" property="itemDescription" styleClass="w6008_item_description gscm_disptext" readonly="true" />
                        </td>
                        <td class="right">
                            <bean:write name="listDomainList" property="sumQty" />
                        </td>
                        <td>
                            <bean:write name="listDomainList" property="currCd" />
                        </td>
                        <td class="right">
                            <bean:write name="listDomainList" property="unitPrice" />
                        </td>
                    </tr>
                </ai:stripeline>
            </logic:iterate>
       </tbody>
    </table>

    <%--
    -- hidden
    --%>
    <html:hidden property="w6008CriteriaDomain.grpNo1" />
    <html:hidden property="w6008CriteriaDomain.grpNo2" />
    <html:hidden property="w6008CriteriaDomain.cmlTyp" />
    <html:hidden property="w6008CriteriaDomain.unitPriceError" />

    <html:hidden property="windowId" />
    <html:hidden property="languageCd" />
    <html:hidden property="screenId" />
    <html:hidden property="callScreenId" />
</html:form>
