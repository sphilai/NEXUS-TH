<%--
 * Project : GSCM
 * 
 * W9007 - Export Ship to Shipping MA inquiry
 *
 * $Revision: 15229 $
 * 
 * Copyright (c) 2013 DENSO CORPORATION. All rights reserved.
 --%>

<html:form action="/W9007Init" styleId="mainForm">
    <%--
    -- search condition 1
    --%>
    <table class="gscm_search">
        <colgroup>
            <col />
        </colgroup>
        <tr>
            <th>
                <logic:equal name="W9007Form" property="w9007CriteriaDomain.selectCondition" value="1">
                    <input type="radio" name="w9007CriteriaDomain.selectCondition" value="1" checked="checked" /><bean:message key="label.search" />
                    <input type="radio" name="w9007CriteriaDomain.selectCondition" value="2" /><bean:message key="label.add" />
                </logic:equal>
                <logic:equal name="W9007Form" property="w9007CriteriaDomain.selectCondition" value="2">
                    <input type="radio" name="w9007CriteriaDomain.selectCondition" value="1" /><bean:message key="label.search" />
                    <input type="radio" name="w9007CriteriaDomain.selectCondition" value="2" checked="checked" /><bean:message key="label.add" />
                </logic:equal>
                <logic:equal name="W9007Form" property="w9007CriteriaDomain.selectCondition" value="3">
                    <input type="radio" name="w9007CriteriaDomain.selectCondition" value="1" checked="checked" /><bean:message key="label.search" />
                    <input type="radio" name="w9007CriteriaDomain.selectCondition" value="2" disabled="disabled" /><bean:message key="label.add" />
                </logic:equal>
            </th>
        </tr>
    </table>
    <%--
    -- search condition 2
    --%>
    <table class="gscm_search">
        <colgroup>
            <col class="search_shipper_cd" />
            <col class="search_ship_to" />
            <col class="search_container_sorting_key" />
            <col class="search_loading_cd" />
            <col class="search_container_loose_typ" />
        </colgroup>
        
        <tr>
            <th>
                <bean:message key="label.shipper" />
            </th>
            <th>
                <bean:message key="label.nexusShipTo" />
            </th>
            <th>
                <bean:message key="label.contSortKey" />
            </th>
            <th>
                <bean:message key="label.ldCd" />
            </th>
            <th>
                <bean:message key="label.cl" />
            </th>
            <th>
                <bean:message key="label.display" />
            </th>
        </tr>
        <tr>
            <td>
                <logic:equal name="W9007Form" property="searchFlg" value="true">
                    <html:text property="w9007CriteriaDomain.shipperCd" maxlength="5" styleClass="shipper_cd" errorStyleClass="shipper_cd gscm_error_class" />
                </logic:equal>
                <logic:notEqual name="W9007Form" property="searchFlg" value="true">
                    <html:text property="w9007CriteriaDomain.shipperCd" maxlength="5" styleClass="shipper_cd gscm_required" errorStyleClass="shipper_cd gscm_error_class" />
                </logic:notEqual>
            </td>
            <td>
                <html:text property="w9007CriteriaDomain.shipToCompCd" maxlength="7" styleClass="w9007_ship_to_comp_cd" errorStyleClass="w9007_ship_to_comp_cd gscm_error_class" />
            </td>
            <td>
                <html:text property="w9007CriteriaDomain.containerSortingKey" maxlength="8" styleClass="w9007_container_sorting_key" errorStyleClass="w9007_container_sorting_key gscm_error_class" />
            </td>
            <td>
                <html:select property="w9007CriteriaDomain.loadingCd" styleId="loading_cd" styleClass="loading_cd" errorStyleClass="loading_cd gscm_error_class" >
                    <html:options collection="loadingCd" property="id" labelProperty="name"/>
                </html:select>
            </td>
            <td>
                <html:select property="w9007CriteriaDomain.containerLooseTyp" styleId="container_loose_typ" styleClass="w9007_container_loose_typ" errorStyleClass="w9007_container_loose_typ gscm_error_class" >
                    <html:options collection="containerLooseTyp" property="id" labelProperty="name"/>
                </html:select>
            </td>
            <td>
                <html:select property="w9007CriteriaDomain.display" styleClass="displayDiv" >
                    <html:options collection="display" property="id" labelProperty="name"/>
                </html:select>
            </td>
        </tr>
    </table>
    <%--
    -- buttons 1
    --%>
    <table class="gscm_resultlist_button">
        <colgroup>
            <col class="button_btn_add" />
            <col class="btn_search" />
        </colgroup>
        <tr>
            <td>
                <html:button property="add" onclick="gscm.commonSubmit('W9007Add.do', this.form);" styleClass="add" >
                    <bean:message key="button.add" />
                </html:button>
            </td>
            <td class="right">
                <html:button property="search" onclick="gscm.commonSubmit('W9007Search.do', this.form);" styleClass="search" >
                    <bean:message key="button.search" />
                </html:button>
            </td>
        </tr>
    </table>
    <hr />
    <logic:notEmpty name="W9007Form" property="listDomainList">
        <%--
        -- buttons 2
        --%>
        <table class="gscm_resultlist_button">
            <colgroup>
                <col />
            </colgroup>
            <tr>
                <td>
                    <html:button property="editRefer" onclick="gscm.commonSubmit('W9007EditOrRefer.do', this.form);" styleClass="edit_refer">
                        <bean:message key="button.editRefer" />
                    </html:button>
                    <html:button property="clone" onclick="gscm.commonSubmit('W9007Clone.do', this.form);" styleClass="clone">
                        <bean:message key="button.clone" />
                    </html:button>
                    <bean:define id="deleteConfirmMessage"><bean:message key="GSCM-I0-0005" locale="${locale_key}" /></bean:define>
                    <html:button property="delete" onclick="gscm.submitConfirm('W9007Delete.do', this.form, '${deleteConfirmMessage}');" styleClass="delete">
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
                <col class="resultlist_shipper" />
                <col class="resultlist_ship_to" />
                <col class="resultlist_aply_strt_dt" />
                <col class="resultlist_cont_sort_key" />
                <col class="resultlist_loading_cd" />
                <col class="resultlist_label_print_num" />
                <col class="resultlist_container_loose_typ" />
                <col class="resultlist_packing_summary_atch_flg" /> <%-- NL023 ADD --%>
                <col class="resultlist_single_pltiz_qr_flg" /> <%-- NL047 ADD --%>
            </colgroup>
            <thead>
                <tr>
                    <th>
                        <bean:message key="label.ck" />
                    </th>
                    <th>
                        <bean:message key="label.shipper" />
                    </th>
                    <th>
                        <bean:message key="label.nexusShipTo" />
                    </th>
                    <th>
                        <bean:message key="label.applyStartDate" />
                    </th>
                    <th>
                        <bean:message key="label.contSortKey" />
                    </th>
                    <th>
                        <bean:message key="label.ldCd" />
                    </th>
                    <th>
                        <bean:message key="label.labelPrintNum" />
                    </th>
                    <th>
                        <bean:message key="label.cl" />
                    </th>
                    <th>
                        <bean:message key="label.packingSummaryAtchFlg" /> <%-- NL023 ADD --%>
                    </th>
                    <th>
                        <bean:message key="label.singlePltzQrFlg" /> <%-- NL047 ADD --%>
                    </th>
                </tr>
            </thead>
            <tbody>
                <logic:iterate name="W9007Form" property="listDomainList" id="listDomainList" indexId="idx">
                    <ai:stripeline number="${idx + 1}" odd="gscm_odd" even="gscm_even">
                        <tr>
                            <td class="center">
                                <html:radio property="w9007CriteriaDomain.selected" value="${idx}" />
                            </td>
                            <td>
                                <html:text name="listDomainList" property="compCd" readonly="true" indexed="true" styleClass="w9007_comp_cd gscm_disptext" errorStyleClass="w9007_comp_cd gscm_disptext gscm_error_class" />
                            </td>
                            <td>
                                <html:text name="listDomainList" property="shipToCd" readonly="true" indexed="true" styleClass="w9007_ship_to_cd gscm_disptext" errorStyleClass="w9007_ship_to_cd gscm_disptext gscm_error_class" />
                            </td>
                            <td>
                                <html:text name="listDomainList" property="aplyStrtDt" readonly="true" indexed="true" styleClass="aply_strt_dt gscm_disptext" errorStyleClass="aply_strt_dt gscm_disptext gscm_error_class"/>
                            </td>
                            <td>
                                <bean:write name="listDomainList" property="containerSortingKey" />
                            </td>
                            <td>
                                <bean:write name="listDomainList" property="loadingCd" />
                            </td>
                            <td class="right">
                                <bean:write name="listDomainList" property="labelPrintNum" />
                            </td>
                            <td>
                                <bean:write name="listDomainList" property="containerLooseTyp" />
                            </td>
                            <td>
                                <bean:write name="listDomainList" property="packingSummaryAtchFlg" /> <%-- NL023 ADD --%>
                            </td>
                            <td>
                                <bean:write name="listDomainList" property="singlePltzQrFlg" /> <%-- NL047 ADD --%>
                            </td>
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
    <logic:notEmpty name="W9007Form" property="w9007CriteriaDomain.comUpdateTimestamp">
        <html:hidden property="w9007CriteriaDomain.comUpdateTimestamp" />
    </logic:notEmpty>
</html:form>