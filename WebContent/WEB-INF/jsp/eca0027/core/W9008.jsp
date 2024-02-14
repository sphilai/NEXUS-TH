<%--
 * Project : GSCM
 * 
 * W9008 - Export Ship to Shipping MA edit
 *
 * $Revision: 15229 $
 * 
 * Copyright (c) 2013 DENSO CORPORATION. All rights reserved.
 --%>

<html:form action="/W9008Init.do" styleId="mainForm">
    <%--
    -- buttons 1
    --%>
    <table class="gscm_resultlist_button">
        <colgroup>
            <col />
        </colgroup>
        <tr>
            <td>
                <bean:define id="backConfirmMessage"><bean:message key="GSCM-I0-0002" locale="${locale_key}"/></bean:define>
                <bean:define id="procMode" name="W9008Form" property="w9008CriteriaDomain.procMode" />
                <html:button property="backToInquiry" onclick="backToInquirySubmit('${procMode}', 'W9007Init.do', this.form, '${backConfirmMessage}');" styleClass="back_to_inquiry">
                    <bean:message key="button.backToInquiry" />
                </html:button>
            </td>
        </tr>
    </table>
    <%--
    -- Edit 1
    --%>
    <table class="grid">
        <colgroup>
            <col class="grid_title" />
            <col class="grid_primary_key" />
            <col />
        </colgroup>
        <tr>
            <th class="right">
                <bean:message key="label.shipper" />
            </th>
            <th class="left">
                <bean:message key="label.key" />
            </th>
            <td>
                <html:text property="w9008CriteriaDomain.shipperCd" styleClass="shipper_cd gscm_disptext" errorStyleClass="shipper_cd gscm_disptext gscm_error_class" readonly="true"/>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.nexusShipTo" />
            </th>
            <th class="left">
                <bean:message key="label.key" />
            </th>
            <td>
                <logic:equal name="W9008Form" property="w9008CriteriaDomain.procMode" value="1">
                    <html:text property="w9008CriteriaDomain.shipToCompCd" maxlength="7" styleClass="w9008_ship_to_comp_cd gscm_required" errorStyleClass="w9008_ship_to_comp_cd gscm_error_class" />
                </logic:equal>
                <logic:notEqual name="W9008Form" property="w9008CriteriaDomain.procMode" value="1">
                    <html:text property="w9008CriteriaDomain.shipToCompCd" styleClass="w9008_ship_to_comp_cd gscm_disptext" readonly="true"/>
                </logic:notEqual>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.aplyStrtDt" />
            </th>
            <th class="left">
                <bean:message key="label.key" />
            </th>
            <td>
                <logic:equal name="W9008Form" property="registerFlg" value="true">
                    <html:text property="w9008CriteriaDomain.aplyStrtDt" maxlength="8" styleClass="w9008_aply_strt_dt gscm_required" errorStyleClass="w9008_aply_strt_dt gscm_error_class" />
                    <img src="images/gscm/library/Calendar.gif"
                        onClick = "gscm.writeCalendar('applyStartDateDiv', 'mainForm', 'w9008CriteriaDomain.aplyStrtDt', '<bean:message key="format.screen.yyyymmdd" />', this);"/>
                </logic:equal>
                <logic:notEqual name="W9008Form" property="registerFlg" value="true">
                    <html:text property="w9008CriteriaDomain.aplyStrtDt" styleClass="w9008_aply_strt_dt gscm_disptext" readonly="true"/>
                </logic:notEqual>
                <div id="applyStartDateDiv" style="float:left;"></div>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.contSortKey" />
            </th>
            <th>
            </th>
            <td>
                <logic:notEqual name="W9008Form" property="w9008CriteriaDomain.procMode" value="3">
                    <html:text property="w9008CriteriaDomain.containerSortingKey" maxlength="8" styleClass="container_sorting_key gscm_required" errorStyleClass="container_sorting_key gscm_error_class" />
                </logic:notEqual>
                <logic:equal name="W9008Form" property="w9008CriteriaDomain.procMode" value="3">
                    <html:text property="w9008CriteriaDomain.containerSortingKey" styleClass="container_sorting_key gscm_disptext" readonly="true"/>
                </logic:equal>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.ldCd" />
            </th>
            <th>
            </th>
            <td>
                <logic:notEqual name="W9008Form" property="w9008CriteriaDomain.procMode" value="3">
                    <html:select property="w9008CriteriaDomain.loadingCd" styleId="loading_cd" styleClass="loading_cd gscm_required" errorStyleClass="loading_cd gscm_error_class" >
                        <html:options collection="loadingCd" property="id" labelProperty="name"/>
                    </html:select>
                </logic:notEqual>
                <logic:equal name="W9008Form" property="w9008CriteriaDomain.procMode" value="3">
                    <html:select property="w9008CriteriaDomain.loadingCd" disabled="true" styleClass="loading_cd" >
                        <html:options collection="loadingCd" property="id" labelProperty="name"/>
                    </html:select>
                </logic:equal>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.labelPrintNum" />
            </th>
            <th>
            </th>
            <td>
                <logic:notEqual name="W9008Form" property="w9008CriteriaDomain.procMode" value="3">
                    <html:text property="w9008CriteriaDomain.labelPrintNum" maxlength="1" styleClass="label_print_num gscm_required right" errorStyleClass="label_print_num gscm_error_class right" />
                </logic:notEqual>
                <logic:equal name="W9008Form" property="w9008CriteriaDomain.procMode" value="3">
                    <html:text property="w9008CriteriaDomain.labelPrintNum" styleClass="label_print_num gscm_disptext right" readonly="true"/>
                </logic:equal>
            </td>
        </tr>
        <%-- NL047 ADD START--%>
        <tr>
            <th class="right">
                            <bean:message key="label.singlePltzQrFlg" />
            </th>
            <th>
            </th>
            <td>
                <logic:notEqual name="W9008Form" property="w9008CriteriaDomain.procMode" value="3">
                    <html:select property="w9008CriteriaDomain.singlePltzQrFlg" styleId="single_pltz_qr_flg" styleClass="flag gscm_required" errorStyleClass="flag gscm_error_class" > 
                        <html:options collection="flag" property="id" labelProperty="name" />
                    </html:select>
                </logic:notEqual>
                <logic:equal name="W9008Form" property="w9008CriteriaDomain.procMode" value="3">
                    <html:select property="w9008CriteriaDomain.singlePltzQrFlg" disabled="true" styleClass="flag">
                        <html:options collection="flag" property="id" labelProperty="name" />
                    </html:select>
                </logic:equal>
                &emsp;<bean:message key="label.singlePltzQrFlgNotation" />
            </td>
        </tr>
        <%-- NL047 ADD END--%>
        <tr>
            <th class="right">
                <bean:message key="label.cl" />
            </th>
            <th>
            </th>
            <td>
                <logic:notEqual name="W9008Form" property="w9008CriteriaDomain.procMode" value="3">
                    <html:select property="w9008CriteriaDomain.containerLooseTyp" styleId="container_loose_typ" styleClass="container_loose_typ gscm_required" errorStyleClass="container_loose_typ gscm_error_class" >
                        <html:options collection="containerLooseTyp" property="id" labelProperty="name"/>
                    </html:select>
                </logic:notEqual>
                <logic:equal name="W9008Form" property="w9008CriteriaDomain.procMode" value="3">
                    <html:select property="w9008CriteriaDomain.containerLooseTyp" disabled="true" styleClass="container_loose_typ">
                        <html:options collection="containerLooseTyp" property="id" labelProperty="name"/>
                    </html:select>
                </logic:equal>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.ccType" />
            </th>
            <th>
            </th>
            <td>
                <html:select property="w9008CriteriaDomain.customTimingTyp" styleId="custom_timing_typ" styleClass="custom_timing_typ gscm_required" errorStyleClass="custom_timing_typ gscm_error_class" >
                    <html:options collection="customTimingTyp" property="id" labelProperty="name"/>
                </html:select>
            </td>
        </tr>
        <%-- NL023 ADD START --%>
        <tr>
            <th class="right">
                <bean:message key="label.packingSummaryAtchFlg" />
            </th>
            <th>
            </th>
            <td>
                <logic:notEqual name="W9008Form" property="w9008CriteriaDomain.procMode" value="3">
                    <html:select property="w9008CriteriaDomain.packingSummaryAtchFlg" styleId="packing_summary_atch_flg" styleClass="flag gscm_required" errorStyleClass="flag gscm_error_class" >
                        <html:options collection="flag" property="id" labelProperty="name"/>
                    </html:select>
                </logic:notEqual>
                <logic:equal name="W9008Form" property="w9008CriteriaDomain.procMode" value="3">
                    <html:select property="w9008CriteriaDomain.packingSummaryAtchFlg" disabled="true" styleClass="flag" >
                        <html:options collection="flag" property="id" labelProperty="name"/>
                    </html:select>
                </logic:equal>
                &emsp;<bean:message key="label.packingSummaryAtchFlgNotation" />
            </td>
        </tr>
        <%-- NL023 ADD END --%>
        <tr>
            <th class="right">
                <bean:message key="label.invoiceTemplate" />
            </th>
            <th>
            </th>
            <td>
                <br />
                <%--
                -- search results
                --%>
                <table class="w9008_gscm_resultlist">
                    <colgroup>
                        <col class="gscm_resultlist_cml_type" />
                        <col class="gscm_resultlist_inv_category" />
                        <col class="gscm_resultlist_invoice_class" />
                        <col class="gscm_resultlist_inv_template" />
                        <col class="gscm_resultlist_free1" />
                        <col class="gscm_resultlist_free2" />
                        <col class="gscm_resultlist_free3" />
                        <col class="gscm_resultlist_hs_code" />
                    </colgroup>
                    <tr class="w9008_head">
                        <th>
                            <bean:message key="label.cmlType" />
                        </th>
                        <th>
                            <bean:message key="label.invCategory" />
                        </th>
                        <th>
                            <bean:message key="label.classOfInvoice" />
                        </th>
                        <th>
                            <bean:message key="label.invTemplate" />
                        </th>
                        <th>
                            <logic:empty name="W9008Form" property="w9008CriteriaDomain.free1TitleNm">
                                <bean:message key="label.free1Name" />
                            </logic:empty>
                            <logic:notEmpty name="W9008Form" property="w9008CriteriaDomain.free1TitleNm">
                                <bean:write name="W9008Form" property="w9008CriteriaDomain.free1TitleNm" />
                            </logic:notEmpty>
                        </th>
                        <th>
                            <logic:empty name="W9008Form" property="w9008CriteriaDomain.free2TitleNm">
                                <bean:message key="label.free2Name" />
                            </logic:empty>
                            <logic:notEmpty name="W9008Form" property="w9008CriteriaDomain.free2TitleNm">
                                <bean:write name="W9008Form" property="w9008CriteriaDomain.free2TitleNm" />
                            </logic:notEmpty>
                        </th>
                        <th>
                            <logic:empty name="W9008Form" property="w9008CriteriaDomain.free3TitleNm">
                                <bean:message key="label.free3Name" />
                            </logic:empty>
                            <logic:notEmpty name="W9008Form" property="w9008CriteriaDomain.free3TitleNm">
                                <bean:write name="W9008Form" property="w9008CriteriaDomain.free3TitleNm" />
                            </logic:notEmpty>
                        </th>
                        <th>
                            <bean:message key="label.hsCode" />
                        </th>
                    </tr>
                    <logic:notEmpty name="W9008Form" property="listDomainList">
                        <logic:iterate name="W9008Form" property="listDomainList" id="listDomainList" scope="request" indexId="idx">
                            <ai:stripeline number="${idx + 1}" odd="gscm_odd" even="gscm_even">
                                <tr>
                                    <th>
                                        <html:text name="listDomainList" property="cmlTyp" readonly="true" indexed="true" styleClass="w9008_cml_typ gscm_disptext" style="text-align: center;font-weight: bold;"/>
                                    </th>
                                    <th>
                                        <html:text name="listDomainList" property="invoiceCtgry" readonly="true" indexed="true" styleClass="w9008_invoice_ctgry gscm_disptext" style="text-align: center;font-weight: bold;" />
                                    </th>
                                    <th>
                                        <html:text name="listDomainList" property="invoiceClassNm" readonly="true" indexed="true" styleClass="w9008_invoice_class_nm gscm_disptext" style="text-align: center;font-weight: bold;" />
                                    </th>
                                    <logic:notEqual name="W9008Form" property="w9008CriteriaDomain.procMode" value="3">
                                        <td class="center">
                                            <html:select name="listDomainList" property="docNo" indexed="true" styleId="doc_no{$idx}" styleClass="w9008_doc_no gscm_required" errorStyleClass="w9008_doc_no gscm_error_class" >
                                                <html:options collection="docNo" property="id" labelProperty="name"/>
                                            </html:select>
                                        </td>
                                        <td class="center">
                                            <html:checkbox name="listDomainList" property="free1DispFlg" indexed="true" />
                                        </td>
                                        <td class="center">
                                            <html:checkbox name="listDomainList" property="free2DispFlg" indexed="true" />
                                        </td>
                                        <td class="center">
                                            <html:checkbox name="listDomainList" property="free3DispFlg" indexed="true" />
                                        </td>
                                        <td class="center">
                                            <html:checkbox name="listDomainList" property="hsCdDispFlg" indexed="true" />
                                        </td>
                                    </logic:notEqual>
                                    
                                    <logic:equal name="W9008Form" property="w9008CriteriaDomain.procMode" value="3">
                                        <td class="center">
                                            <html:select name="listDomainList" property="docNo" indexed="true" disabled="true">
                                                <html:options collection="docNo" property="id" labelProperty="name"/>
                                            </html:select>
                                        </td>
                                        <td class="center">
                                            <html:checkbox name="listDomainList" property="free1DispFlg" indexed="true" disabled="true" />
                                        </td>
                                        <td class="center">
                                            <html:checkbox name="listDomainList" property="free2DispFlg" indexed="true" disabled="true" />
                                        </td>
                                        <td class="center">
                                            <html:checkbox name="listDomainList" property="free3DispFlg" indexed="true" disabled="true" />
                                        </td>
                                        <td class="center">
                                            <html:checkbox name="listDomainList" property="hsCdDispFlg" indexed="true" disabled="true" />
                                        </td>
                                    </logic:equal>
                                </tr>
                            </ai:stripeline>
                        </logic:iterate>
                    </logic:notEmpty>
                </table>
                <table class="w9008_gscm_resultlist">
                    <colgroup>
                        <col width="80px;" />
                        <col width="140px;" />
                        <col />
                    </colgroup>
                    <tr>
                        <td class="blank">
                            <bean:message key="label.cmlType" /><br />
                            1:<bean:message key="label.cigma" /><br />
                            2:<bean:message key="label.ert" /><br />
                            3:<bean:message key="label.export" /><br />
                            &nbsp;&nbsp;&nbsp;<bean:message key="label.request" />
                        </td>
                        <td class="blank">
                            <bean:message key="label.invCategory" /><br />
                            C:<bean:message key="label.commercial" /><br />
                            N:<bean:message key="label.nonCommercial" /><br />
                            I:<bean:message key="label.intangible" /><br />
                            <br />
                        </td>
                        <td class="blank right w9008_top">
                            <b>Check if it needs to appear on Invoice</b>
                        </td>
                    </tr>
                </table>
            </td>
        </tr>
    </table>
    <%--
    -- buttons 2
    --%>
    <table width="860px">
        <colgroup>
            <col />
        </colgroup>
        <tr>
            <td class="right">
                <bean:define id="registerConfirmMessage">
                    <logic:equal name="W9008Form" property="registerFlg" value="true"><bean:message key="GSCM-I0-0003" locale="${locale_key}" /></logic:equal>
                    <logic:notEqual name="W9008Form" property="registerFlg" value="true"><bean:message key="GSCM-I0-0004" locale="${locale_key}" /></logic:notEqual>
                </bean:define>
                <html:button property="register" onclick="gscm.submitConfirm('W9008Register.do', this.form, '${registerConfirmMessage}');" styleClass="register">
                    <bean:message key="button.register" />
                </html:button>
            </td>
        </tr>
    </table>
    <%--
    -- hidden
    --%>
    <html:hidden property="callScreenId" />
</html:form>
