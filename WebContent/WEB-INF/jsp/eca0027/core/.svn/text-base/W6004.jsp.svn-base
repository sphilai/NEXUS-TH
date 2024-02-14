<%--
 * Project : GSCM
 * 
 * W6004 - Invoice Data Create
 *
 * $Revision: 9459 $
 * 
 * Copyright (c) 2013 DENSO CORPORATION. All rights reserved.
 --%>

<html:form action="/W6004Init" styleId="mainForm">
    <%--
    -- search condition 1
    --%>
    <table class="gscm_search">
        <colgroup>
            <col class="search_stg_com" />
            <col class="search_stg_wh" />
            <col class="search_trns_cd" />
            <col class="search_container_loose_typ" />
            <col class="search_custom_timing_typ" />
        </colgroup>
        <tr>
            <th>
                <bean:message key="label.stgCom" />
            </th>
            <th>
                <bean:message key="label.stgWh" />
            </th>
            <th>
                <bean:message key="label.trans" />
            </th>
            <th>
                <bean:message key="label.cl" />
            </th>
            <th>
                <bean:message key="label.ccType" />
            </th>
        </tr>
        <tr>
            <td>
                <bean:write name="W6004Form" property="criteriaDomain.stgCom" />
            </td>
            <td>
                <bean:write name="W6004Form" property="criteriaDomain.stgWh" />
            </td>
            <td>
                <bean:write name="W6004Form" property="criteriaDomain.trnsCd" />
            </td>
            <td>
                <bean:write name="W6004Form" property="criteriaDomain.containerLooseTyp" />
            </td>
            <td>
                <bean:write name="W6004Form" property="criteriaDomain.customTimingTyp" />
            </td>
        </tr>
    </table>


    <%--
    -- search condition 2
    --%>
    <table class="gscm_search">
        <colgroup>
            <col class="search_cont_sort_key" />
            <col class="search_delay" />
            <col class="search_etd_from" />
            <col class="search_etd_to" />
            <col class="search_shipping_firm_no" />
            <col class="search_worked_dt_from" />
            <col class="search_worked_dt_to" />
        </colgroup>
        <tr>
            <th>
                <bean:message key="label.contSortKey" />
            </th>
            <th>
                <bean:message key="label.delay" />
            </th>
            <th>
                <bean:message key="label.fmEtd" />
            </th>
            <th>
                <bean:message key="label.toEtd" />
            </th>
            <th>
                <logic:equal name="W6004Form" property="customTimingTyp" value="A">
                    <bean:message key="label.shippingFirmNo" />
                </logic:equal>
                <logic:equal name="W6004Form" property="customTimingTyp" value="B">
                    <bean:message key="label.stgActNo" />
                </logic:equal>
                <logic:equal name="W6004Form" property="customTimingTyp" value="Z">
                    <bean:message key="label.stgInstrNo" />
                </logic:equal>
            </th>

            <th>
                <logic:equal name="W6004Form" property="customTimingTyp" value="A">
                    <bean:message key="label.fmWorkedDt" />
                </logic:equal>
                <logic:equal name="W6004Form" property="customTimingTyp" value="B">
                    <bean:message key="label.fmStgActDt" />
                </logic:equal>
                <logic:equal name="W6004Form" property="customTimingTyp" value="Z">
                    <bean:message key="label.fmWorkedDt" />
                </logic:equal>
           </th>
            <th>
                <logic:equal name="W6004Form" property="customTimingTyp" value="A">
                    <bean:message key="label.toWorkedDt" />
                </logic:equal>
                <logic:equal name="W6004Form" property="customTimingTyp" value="B">
                    <bean:message key="label.toStgActDt" />
                </logic:equal>
                <logic:equal name="W6004Form" property="customTimingTyp" value="Z">
                    <bean:message key="label.toWorkedDt" />
                </logic:equal>
           </th>
        </tr>
        <tr>
            <td>
                <html:text property="criteriaDomain.containerSortingKey" maxlength="8" size="11" styleClass="container_sorting_key" errorStyleClass="container_sorting_key gscm_error_class"/>
            </td>
            <td>
                <html:select property="criteriaDomain.flag" styleId="flag" styleClass="flag">
                    <html:options collection="flag" property="id" labelProperty="name"/>
                </html:select>
            </td>
            <td>
                <html:text property="criteriaDomain.fmEtd" maxlength="8" size="7" styleClass="w6004_fm_etd" errorStyleClass="w6004_fm_etd gscm_error_class"/>
                <img src="images/gscm/library/Calendar.gif"
                    onClick = "gscm.writeCalendar('fmEtdDiv', 'mainForm', 'criteriaDomain.fmEtd', '<bean:message key="format.screen.yyyymmdd" locale="${locale_key}" />', this);"/>
                <div id="fmEtdDiv" style="float:left;"></div>
            </td>
            <td>
                <html:text property="criteriaDomain.toEtd" maxlength="8" size="7" styleClass="w6004_to_etd" errorStyleClass="w6004_to_etd gscm_error_class"/>
                <img src="images/gscm/library/Calendar.gif"
                    onClick = "gscm.writeCalendar('toEtdDiv', 'mainForm', 'criteriaDomain.toEtd', '<bean:message key="format.screen.yyyymmdd" locale="${locale_key}" />', this);"/>
                <div id="toEtdDiv" style="float:left;"></div>
            </td>
            <td>
                <logic:equal name="W6004Form" property="customTimingTyp" value="A">
                    <html:text property="criteriaDomain.shippingFirmNo" maxlength="18" size="26" styleClass="w6004_shipping_firm_no" errorStyleClass="w6004_shipping_firm_no gscm_error_class"/>
                </logic:equal>
                <logic:equal name="W6004Form" property="customTimingTyp" value="B">
                    <html:text property="criteriaDomain.stgActNo" maxlength="18" size="26" styleClass="w6004_shipping_firm_no" errorStyleClass="w6004_shipping_firm_no gscm_error_class"/>
                </logic:equal>
                <logic:equal name="W6004Form" property="customTimingTyp" value="Z">
                    <html:text property="criteriaDomain.stgInstrNo" maxlength="18" size="26" styleClass="w6004_shipping_firm_no" errorStyleClass="w6004_shipping_firm_no gscm_error_class"/>
                </logic:equal>
            </td>
            <td>
                <logic:notEqual name="W6004Form" property="customTimingTyp" value="B">
                    <html:text property="criteriaDomain.fmWorkedDt" maxlength="8" size="7" styleClass="w6004_fm_worked_dt" errorStyleClass="w6004_fm_worked_dt gscm_error_class"/>
                    <img src="images/gscm/library/Calendar.gif"
                         onClick = "gscm.writeCalendar('fmOdDiv', 'mainForm', 'criteriaDomain.fmWorkedDt', '<bean:message key="format.screen.yyyymmdd" locale="${locale_key}" />', this);"/>
                </logic:notEqual>
                <logic:equal name="W6004Form" property="customTimingTyp" value="B">
                    <html:text property="criteriaDomain.fmStgActDt" maxlength="8" size="7" styleClass="w6004_fm_worked_dt" errorStyleClass="w6004_fm_worked_dt gscm_error_class"/>
                    <img src="images/gscm/library/Calendar.gif"
                         onClick = "gscm.writeCalendar('fmOdDiv', 'mainForm', 'criteriaDomain.fmStgActDt', '<bean:message key="format.screen.yyyymmdd" locale="${locale_key}" />', this);"/>
                </logic:equal>
                <div id="fmOdDiv" style="float:left;"></div>
            </td>
            <td>
                <logic:notEqual name="W6004Form" property="customTimingTyp" value="B">
                    <html:text property="criteriaDomain.toWorkedDt" maxlength="8" size="7" styleClass="w6004_to_worked_dt" errorStyleClass="w6004_to_worked_dt gscm_error_class"/>
                    <img src="images/gscm/library/Calendar.gif"
                         onClick = "gscm.writeCalendar('toOdDiv', 'mainForm', 'criteriaDomain.toWorkedDt', '<bean:message key="format.screen.yyyymmdd" locale="${locale_key}" />', this);"/>
                </logic:notEqual>
                <logic:equal name="W6004Form" property="customTimingTyp" value="B">
                    <html:text property="criteriaDomain.toStgActDt" maxlength="8" size="7" styleClass="w6004_to_worked_dt" errorStyleClass="w6004_to_worked_dt gscm_error_class"/>
                    <img src="images/gscm/library/Calendar.gif"
                         onClick = "gscm.writeCalendar('toOdDiv', 'mainForm', 'criteriaDomain.toStgActDt', '<bean:message key="format.screen.yyyymmdd" locale="${locale_key}" />', this);"/>
                </logic:equal>
                <div id="toOdDiv" style="float:left;"></div>
            </td>
        </tr>
    </table>


    <%--
    -- buttons 1
    --%>
    <table class="gscm_search_button">
        <colgroup>
            <col />
            <col />
        </colgroup>
        <tr>
            <td>
                <html:button property="moveToShippingInformationInput" onclick="gscm.commonSubmit('W6004MoveToShippingInformationInput.do', this.form);" styleClass="move_to_shipping_information_input">
                    <bean:message key="button.moveToShippingInformationInput" />
                </html:button>
                <html:button property="backToHeader" onclick="gscm.submitBack('W6003Init.do', this.form);" styleClass="back_to_header">
                    <bean:message key="button.backToHeader" />
                </html:button>
                <html:button property="backToMainScreen" onclick="gscm.submitBack('W6001Init.do', this.form);" styleClass="back_to_main_screen">
                    <bean:message key="button.backToMainScreen" />
                </html:button>
            </td>
            <td class="right">
                <html:button property="search" onclick="gscm.commonSubmit('W6004Search.do', this.form);" styleClass="search">
                    <bean:message key="button.search" />
                </html:button>
            </td>
        </tr>
    </table>
    <hr />

    <logic:notEmpty name="W6004Form" property="listDomainList">
        <%--
        -- buttons 2
        --%>
        <table class="gscm_resultlist_button">
            <colgroup>
                <col />
            </colgroup>
            <tr>
                <td>
                    <html:button property="update" onclick="gscm.commonSubmit('W6004Update.do', this.form);" styleClass="update">
                        <bean:message key="button.update" />
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
                <col class="resultlist_checked_key"/>
                <col class="resultlist_container_sorting_key"/>
                <col class="resultlist_delay_flag"/>
                <col class="resultlist_etd"/>
                <col class="resultlist_shipping_firm_no"/>
                <col class="resultlist_operation_date"/>
            </colgroup>
            <thead>
                <tr>
                    <th>
                        <bean:message key="label.ck" /><br />
                        <input type="checkbox" name="checkAll" onclick="allcheck('listDomainList', 'selected', this.checked)"/>
                    </th>
                    <th>
                        <bean:message key="label.contSortKey" />
                    </th>
                    <th>
                        <bean:message key="label.delay" />
                    </th>
                    <th>
                        <bean:message key="label.etd" />
                    </th>
                    
                    <th>
                        <logic:equal name="W6004Form" property="customTimingTyp" value="A">
                            <bean:message key="label.shippingFirmNo" />
                        </logic:equal>
                        <logic:equal name="W6004Form" property="customTimingTyp" value="B">
                            <bean:message key="label.stgActNo" />
                        </logic:equal>
                        <logic:equal name="W6004Form" property="customTimingTyp" value="Z">
                            <bean:message key="label.stgInstrNo" />
                        </logic:equal>
                    </th>
                    <th>
                        <logic:equal name="W6004Form" property="customTimingTyp" value="A">
                            <bean:message key="label.workedDt" />
                        </logic:equal>
                        <logic:equal name="W6004Form" property="customTimingTyp" value="B">
                            <bean:message key="label.stgInstrDt" />
                        </logic:equal>
                        <logic:equal name="W6004Form" property="customTimingTyp" value="Z">
                            <bean:message key="label.workedDt" />
                        </logic:equal>
                    </th>
                </tr>
            </thead>
            <tbody>
                <logic:iterate name="W6004Form" property="listDomainList" id="listDomainList" indexId="idx">
                    <ai:stripeline number="${idx + 1}" odd="gscm_odd" even="gscm_even">
                        <tr class="gscm_odd">
                            <td class="center">
                                <html:checkbox name="listDomainList" property="selected" indexed="true"/>
                            </td>
                            <td>
                               <bean:write name="listDomainList" property="containerSortingKey" />
                            </td>
                            <td>
                                <bean:write name="listDomainList" property="delayFlag" />
                            </td>
                            <td>
                                <bean:write name="listDomainList" property="etd" />
                            </td>
                            <logic:equal name="W6004Form" property="customTimingTyp" value="A">
                                <td>
                                    <bean:write name="listDomainList" property="shippingFirmNo" />
                                </td>
                            </logic:equal>
                            <logic:equal name="W6004Form" property="customTimingTyp" value="B">
                                <td>
                                    <bean:write name="listDomainList" property="stgActNo" />
                                </td>
                            </logic:equal>
                            <logic:equal name="W6004Form" property="customTimingTyp" value="Z">
                                <td>
                                    <bean:write name="listDomainList" property="stgInstrNo" />
                                </td>
                            </logic:equal>

                            <logic:notEqual name="W6004Form" property="customTimingTyp" value="B">
                                <td>
                                    <bean:write name="listDomainList" property="workedDt" />
                                </td>
                            </logic:notEqual>
                            <logic:equal name="W6004Form" property="customTimingTyp" value="B">
                                <td>
                                    <bean:write name="listDomainList" property="stgActDt" />
                                </td>
                            </logic:equal>
                            <html:hidden name="listDomainList" property="countMainMark" indexed="true" />
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
