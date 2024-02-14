<%--
 * W2018.jsp
 * 
 * 小箱内多品番梱包PKG Info Detail画面のJSPです。
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 --%>

<html:form action="/W2018Init" styleId="mainForm">
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
            <col class="search_pltz_instr_no" />
            <col class="search_wh_comp_cd" />
            <col class="search_wh_cd" />
            <col class="search_mix_tag_status" />
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
                <bean:message key="label.pltzInstrNo" />
            </th>
            <th>
                <bean:message key="label.whCompCd" />
            </th>
            <th>
                <bean:message key="label.whCd" />
            </th>
            <th>
                <bean:message key="label.mixTagStatus" />
            </th>
        </tr>
        <tr>
            <td>
                <html:text name="W2018Form" property="w2018CriteriaDomain.shipperCd" styleClass="shipper_cd gscm_disptext" readonly="true"/>
                <html:hidden name="W2018Form" property="w2018CriteriaDomain.shipperCd" styleId="shipeerCd" />
            </td>
            <td>
                <bean:write name="W2018Form" property="w2018CriteriaDomain.customerCd" />
            </td>
            <td>
                <bean:write name="W2018Form" property="w2018CriteriaDomain.lgcyShipTo" />
            </td>
            <td>
                <bean:write name="W2018Form" property="w2018CriteriaDomain.trnsCd" />
            </td>
            <td>
                <bean:write name="W2018Form" property="w2018CriteriaDomain.plntCd" />
            </td>
            <td>
                <bean:write name="W2018Form" property="w2018CriteriaDomain.lgcyWhCd" />
            </td>
            <td>
                <bean:write name="W2018Form" property="w2018CriteriaDomain.pltzInstrNo" />
            </td>
            <td>
                <bean:write name="W2018Form" property="w2018CriteriaDomain.whCompCd" />
            </td>
            <td>
                <bean:write name="W2018Form" property="w2018CriteriaDomain.whCd" />
            </td>
            <td>
                <bean:write name="W2018Form" property="w2018CriteriaDomain.mixTagStatus" />
            </td>
        </tr>
    </table>
    <%--
    -- search condition 2
    --%>
    <table class="gscm_search">
        <colgroup>
            <col class="search_invoice_key" />
            <col class="search_container_sorting_key" />
            <col class="search_loading_cd" />
            <col class="search_net_weight" />
            <col class="search_gross_weight" />
            <col class="search_pkg_ip" />
            <col class="search_box_no" />
            <col class="search_mix_tag_no" />
        </colgroup>
        <tr>
            <th>
                <bean:message key="label.invoiceKey" />
            </th>
            <th>
                <bean:message key="label.containerSortingKey" />
            </th>
            <th>
                <bean:message key="label.loadingCd" />
            </th>
            <th>
                <bean:message key="label.netWeight" />
            </th>
            <th>
                <bean:message key="label.grossWeight" />
            </th>
            <th>
                <bean:message key="label.pkgIp" />
            </th>
            <th>
                <bean:message key="label.boxNo" />
            </th>
            <th>
                <bean:message key="label.mixTagNo" />
            </th>
        </tr>
        <tr>
            <td>
                <bean:write name="W2018Form" property="w2018CriteriaDomain.invoiceKey" />
            </td>
            <td>
                <bean:write name="W2018Form" property="w2018CriteriaDomain.containerSortingKey" />
            </td>
            <td>
                <bean:write name="W2018Form" property="w2018CriteriaDomain.loadingCd" />
            </td>
            <td>
                <logic:notEmpty name="W2018Form" property="w2018CriteriaDomain.netWeight">
                    <bean:write name="W2018Form" property="w2018CriteriaDomain.netWeight" />
                    <bean:write name="W2018Form" property="w2018CriteriaDomain.weightUnit" />
                </logic:notEmpty>
            </td>
            <td>
                <logic:notEmpty name="W2018Form" property="w2018CriteriaDomain.grossWeight">
                    <bean:write name="W2018Form" property="w2018CriteriaDomain.grossWeight" />
                    <bean:write name="W2018Form" property="w2018CriteriaDomain.weightUnit" />
                </logic:notEmpty>
            </td>
            <td>
                <bean:write name="W2018Form" property="w2018CriteriaDomain.pkgIp" />
            </td>
            <td>
                <bean:write name="W2018Form" property="w2018CriteriaDomain.boxNo" />
            </td>
            <td>
                <bean:write name="W2018Form" property="w2018CriteriaDomain.mixTagNo" />
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
                <html:button property="backToRegister" styleClass="back_to_register" onclick="gscm.submitBack('W2008Init.do', this.form);">
                    <bean:message key="button.backToRegister" />
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
            <col />
        </colgroup>
        <tr>
            <td>
                <bean:define id="deleteConfirmMessage"><bean:message key="GSCM-I0-0005"/></bean:define>
                <bean:define id="saveConfirmMessage"><bean:message key="GSCM-I0-0003"/></bean:define>
                <html:button property="delete" styleClass="delete" onclick="gscm.submitConfirm('W2018Delete.do', this.form, '${deleteConfirmMessage}');">
                    <bean:message key="button.delete" />
                </html:button>
                <html:button property="save" styleClass="save" onclick="gscm.submitConfirm('W2018Save.do', this.form, '${saveConfirmMessage}');">
                    <bean:message key="button.save" />
                </html:button>
            </td>
        </tr>
    </table>
    <div class="box_title">
        <bean:message key="label.inputUsedBoxInTheFirstRow" />
    </div>
    <%--
    -- search results
    --%>
    <table id="tablefix" class="gscm_resultlist">
        <colgroup>
            <col class="resultlist_delete" />
            <col class="resultlist_pkg_item_no" />
            <col class="resultlist_model_cd" />
            <col class="resultlist_qty" />
        </colgroup>
        <tr>
            <th>
                <bean:message key="label.delete" />
            </th>
            <th>
                <bean:message key="label.pkgItemNo" />
            </th>
            <th>
                <bean:message key="label.modelCd" />
            </th>
            <th>
                <bean:message key="label.qty" />
            </th>
        </tr>

        <logic:iterate name="W2018Form" property="listDomainList" id="listDomainList" indexId="idx">
            <ai:stripeline number="${idx + 1}" odd="gscm_odd" even="gscm_even">        
                <tr>
                    <td class="center">
                        <html:checkbox name="listDomainList" property="selected" indexed="true" />
                    </td>
                    <td>
                        <html:text name="listDomainList" property="pkgItemNo" maxlength="27" styleClass="w2018_pkg_item_no_disptext" errorStyleClass="w2018_pkg_item_no_disptext gscm_error_class" readonly="true" indexed="true" />
                        <html:button property="select" styleClass="select" onclick="selectPkgItem('${idx}')" indexed="true" >
                            <bean:message key="button.select" />
                        </html:button>
                    </td>
                    <td>
                        <html:text name="listDomainList" property="modelCd" indexed="true" styleClass="w2018_model_cd_disptext gscm_disptext" readonly="true" />
                    </td>
                    <td class="right">
                        <html:text name="listDomainList" property="qty" maxlength="3" styleClass="w2018_qty_disptext right" errorStyleClass="w2018_qty_disptext gscm_error_class right" indexed="true" />
                    </td>
                </tr>
            </ai:stripeline>
        </logic:iterate>

    </table>
    <%--
    -- hidden
    --%>
    <html:hidden property="callScreenId" />
</html:form>
