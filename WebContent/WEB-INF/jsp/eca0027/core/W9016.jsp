<%--
 * Project : GSCM
 * 
 * W9016 - Export Shipping Item Special Information MA Inquiry
 *
 * $Revision: 12652 $
 * 
 * Copyright (c) 2013 DENSO CORPORATION. All rights reserved.
 --%>
<html:form action="/W9016Init.do" styleId="mainForm">
    <%--
    -- search condition 1
    --%>
    <table class="gscm_search">
        <colgroup>
            <col />
        </colgroup>
        <tr>
            <th>
                <logic:equal name="W9016Form" property="w9016CriteriaDomain.selectCondition" value="1">
                    <input type="radio" id="operationTypeSearch" name="operationType" value="1" onclick="operationSearch();" checked="checked" /><bean:message key="label.search" />
                    <input type="radio" id="operationTypeAdd" name="operationType" value="2" onclick="operationAdd();" /><bean:message key="label.add" />
                </logic:equal>
                <logic:equal name="W9016Form" property="w9016CriteriaDomain.selectCondition" value="2">
                    <input type="radio" id="operationTypeSearch" name="operationType" value="1" onclick="operationSearch();" /><bean:message key="label.search" />
                    <input type="radio" id="operationTypeAdd" name="operationType" value="2" onclick="operationAdd();" checked="checked" /><bean:message key="label.add" />
                </logic:equal>
                <logic:equal name="W9016Form" property="w9016CriteriaDomain.selectCondition" value="3">
                    <input type="radio" id="operationTypeSearch" name="operationType" value="1" checked="checked" /><bean:message key="label.search" />
                    <input type="radio" id="operationTypeAdd" name="operationType" value="2" disabled="disabled" /><bean:message key="label.add" />
                </logic:equal>
            </th>
        </tr>
    </table>
    <%--
    -- search condition 2
    --%>
    <table class="gscm_search">
        <colgroup>
            <col class="search_company" />
            <col class="search_item_no" />
            <col class="search_pkg_cd" />
            <col class="search_cust_no" />
            <col class="search_ship_to" />
            <col class="search_cont_sort_key" />
        </colgroup>
        <tr>
            <th>
                <bean:message key="label.company" />
            </th>
            <th>
                <bean:message key="label.itemNo" />
            </th>
            <th>
                <bean:message key="label.pkgCd" />
            </th>
            <th>
                <bean:message key="label.custNo" />
            </th>
            <th>
                <bean:message key="label.shipTo" />
            </th>
            <th>
                <bean:message key="label.contSortKey" />
            </th>
            <th>
                <bean:message key="label.display" />
            </th>
        </tr>
        <tr>
            <td>
                <html:text property="w9016CriteriaDomain.compCd" maxlength="5" styleClass="w9016_comp_cd" errorStyleClass="w9016_comp_cd gscm_error_class" />
            </td>
            <td>
                <html:text property="w9016CriteriaDomain.itemNo" maxlength="27" styleClass="w9016_item_no" errorStyleClass="w9016_item_no gscm_error_class" />
            </td>
            <td>
                <html:text property="w9016CriteriaDomain.pkgCd" maxlength="3" styleClass="w9016_pkg_cd" errorStyleClass="w9016_pkg_cd gscm_error_class" />
            </td>
            <td>
                <html:text property="w9016CriteriaDomain.customerCd" maxlength="8" styleClass="w9016_customer_cd" errorStyleClass="w9016_customer_cd gscm_error_class" />
            </td>
            <td>
                <html:text property="w9016CriteriaDomain.lgcyShipTo" maxlength="2" styleClass="lgcy_ship_to" errorStyleClass="lgcy_ship_to gscm_error_class" />
            </td>
            <td>
                <html:text property="w9016CriteriaDomain.containerSortingKey" maxlength="8" styleId="contSortKey" styleClass="w9016_container_sorting_key" errorStyleClass="w9016_container_sorting_key gscm_error_class" />
            </td>
            <td>
                <html:select property="w9016CriteriaDomain.display" styleClass="displayDiv">
                    <html:options collection="display" property="id" labelProperty="name"/>
                </html:select>
            </td>
        </tr>
    </table>
    <%--
    -- search condition 3
    --%>
    <table class="gscm_search" width="980px">
        <colgroup>
            <col class="search_stg_instr_flg" />
            <col class="search_cc_type" />
            <col class="search_inv_set_key" />
        </colgroup>
        <tr>
            <th>
                <bean:message key="label.stgInstrFlg" />
            </th>
            <th>
                <bean:message key="label.ccType" />
            </th>
            <th>
                <bean:message key="label.invSetKey" />
            </th>
        </tr>
        <tr>
            <td>
                <html:select property="w9016CriteriaDomain.stgInstrItemFlg" styleClass="stg_instr_item_flg" styleId="stgInstrFlg" >
                    <html:options collection="stgInstrFlg" property="id" labelProperty="name"/>
                </html:select>
            </td>
            <td>
                <html:select property="w9016CriteriaDomain.customTimingTyp" styleClass="custom_timing_typ" styleId="customTimingTyp" >
                    <html:options collection="customTimingTyp" property="id" labelProperty="name"/>
                </html:select>
            </td>
            <td>
                <html:text property="w9016CriteriaDomain.invoiceKey" maxlength="3" styleId="invSetKey" styleClass="w9016_invoice_key" errorStyleClass="invoice_key gscm_error_class" />
            </td>
        </tr>
    </table>
    <%--
    -- buttons 1
    --%>
    <table class="gscm_resultlist_button">
        <colgroup>
            <col class="gscm_resultlist_button_add" />
            <col class="gscm_resultlist_button_search" />
        </colgroup>
        <tr>
            <td>
                <html:button property="add" onclick="gscm.commonSubmit('W9016Add.do', this.form);" styleId="buttonAdd" >
                    <bean:message key="button.add" />
                </html:button>
            </td>
            <td class="right">
                <html:button property="search" onclick="gscm.commonSubmit('W9016Search.do', this.form);" styleId="buttonSearch" >
                    <bean:message key="button.search" />
                </html:button>
            </td>
        </tr>
    </table>
    <hr />
    <logic:notEmpty name="W9016Form" property="listDomainList">
        <%--
        -- buttons 2
        --%>
        <table class="gscm_resultlist_button">
            <colgroup>
                <col />
            </colgroup>
            <tr>
                <td>
                    <html:button property="editRefer" onclick="gscm.commonSubmit('W9016EditOrRefer.do', this.form);" >
                        <bean:message key="button.editRefer" />
                    </html:button>
                    <html:button property="clone" onclick="gscm.commonSubmit('W9016Clone.do', this.form);"  >
                        <bean:message key="button.clone" />
                    </html:button>
                    <bean:define id="deleteConfirmMessage"><bean:message key="GSCM-I0-0005" locale="${locale_key}" /></bean:define>
                    <html:button property="delete" onclick="gscm.submitConfirm('W9016Delete.do', this.form, '${deleteConfirmMessage}');" styleClass="delete" >
                        <bean:message key="button.delete" />
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
                <col class="resultlist_ck" />
                <col class="resultlist_company" />
                <col class="resultlist_item_no" />
                <col class="resultlist_pkg_cd" />
                <col class="resultlist_cust_no" />
                <col class="resultlist_ship_to" />
                <col class="resultlist_apply_start_date" />
                <col class="resultlist_ship_lot" />
                <col class="resultlist_cont_sort_key" />
                <col class="resultlist_stg_instr_flg" />
                <col class="resultlist_cc_type" />
                <col class="resultlist_inv_set_key" />
            </colgroup>
            <thead>
                <tr>
                    <th>
                        <bean:message key="label.ck" />
                    </th>
                    <th>
                        <bean:message key="label.company" />
                    </th>
                    <th>
                        <bean:message key="label.itemNo" />
                    </th>
                    <th>
                        <bean:message key="label.pkgCd" />
                    </th>
                    <th>
                        <bean:message key="label.custNo" />
                    </th>
                    <th>
                        <bean:message key="label.shipTo" />
                    </th>
                    <th>
                        <bean:message key="label.applyStartDate" />
                    </th>
                    <th>
                        <bean:message key="label.shipLot" />
                    </th>
                    <th>
                        <bean:message key="label.contSortKey" />
                    </th>
                    <th>
                        <bean:message key="label.stgInstrFlg" />
                    </th>
                    <th>
                        <bean:message key="label.ccType" />
                    </th>
                    <th>
                        <bean:message key="label.invSetKey" />
                    </th>
                </tr>
            </thead>
            <tbody>
                <logic:iterate name="W9016Form" property="listDomainList" id="listDomainList" indexId="idx">
                    <ai:stripeline number="${idx + 1}" odd="gscm_odd" even="gscm_even">
                        <tr>
                            <td class="center">
                                <html:radio property="w9016CriteriaDomain.selected" value="${idx}" />
                            </td>
                            <td>
                                <html:text name="listDomainList" property="compCd" indexed="true" styleClass="w9016_comp_cd gscm_disptext" errorStyleClass="w9016_comp_cd gscm_disptext gscm_error_class" readonly="true"  />
                            </td>
                            <td>
                                <html:text name="listDomainList" property="itemNo" indexed="true" styleClass="w9016_resulst_item_no gscm_disptext" errorStyleClass="w9016_resulst_item_no gscm_disptext gscm_error_class" readonly="true" />
                            </td>
                            <td>
                                <html:text name="listDomainList" property="pkgCd" indexed="true" styleClass="pkg_cd gscm_disptext" errorStyleClass="pkg_cd gscm_disptext gscm_error_class" readonly="true" />
                            </td>
                            <td>
                                <html:text name="listDomainList" property="customerCd" indexed="true" styleClass="w9016_resulst_customer_cd gscm_disptext" errorStyleClass="w9016_resulst_customer_cd gscm_disptext gscm_error_class" readonly="true" />
                            </td>
                            <td>
                                <html:text name="listDomainList" property="lgcyShipTo" indexed="true" styleClass="lgcy_ship_to gscm_disptext" errorStyleClass="lgcy_ship_to gscm_disptext gscm_error_class" readonly="true" />
                            </td>
                            <td>
                                <html:text name="listDomainList" property="aplyStrtDt" indexed="true" styleClass="aply_strt_dt gscm_disptext" errorStyleClass="aply_strt_dt gscm_disptext gscm_error_class" readonly="true" />
                            </td>
                            <td class="right">
                                <bean:write name="listDomainList" property="shippingLot" />
                            </td>
                            <td>
                                <bean:write name="listDomainList" property="containerSortingKey" />
                            </td>
                            <td>
                                <bean:write name="listDomainList" property="stgInstrItemFlg" />
                            </td>
                            <td>
                                <bean:write name="listDomainList" property="customTimingTyp" />
                            </td>
                            <td>
                                <bean:write name="listDomainList" property="invoiceKey" />
                            </td>
                            <html:hidden name="listDomainList" property="comUpdateTimestamp" indexed="true" />
                        </tr>
                    </ai:stripeline>
                </logic:iterate>
            </tbody>
        </table>
    </logic:notEmpty>
    <%--
    -- hidden
    --%>
    <html:hidden property="callScreenId" />
</html:form>
