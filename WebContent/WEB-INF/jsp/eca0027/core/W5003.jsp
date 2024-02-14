<%--
 * W5003.jsp
 * 
 * JSP of staging instruction create.
 * 出荷確認Create画面のJSPです。
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 --%>
<html:form action="/W5003Search" styleId="mainForm">
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
            <col class="search_stg_instr_no" />
            <col class="search_stg_act_no"/>
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
                <bean:message key="label.stgInstrNo" />
            </th>
            <th>
                <bean:message key="label.stgActNo" />
            </th>
        </tr>
        <tr>
            <td>
                <bean:write name="W5003Form" property="w5003CriteriaDomain.whCompCd" />
                <html:hidden property="w5003CriteriaDomain.whCompCd" />
            </td>
            <td>
                <bean:write name="W5003Form" property="w5003CriteriaDomain.whCd" />
                <html:hidden property="w5003CriteriaDomain.whCd" />
            </td>
            <td>
                <bean:write name="W5003Form" property="w5003CriteriaDomain.trnsCd" />
                <html:hidden property="w5003CriteriaDomain.trnsCd" />
            </td>
            <td>
                <bean:write name="W5003Form" property="w5003CriteriaDomain.containerSortingKey" />
                <html:hidden property="w5003CriteriaDomain.containerSortingKey" />
            </td>
            <td>
                <html:select property="w5003CriteriaDomain.containerLooseTyp" 
                        styleClass="container_loose_typ">
                    <html:options collection="containerLooseTyp" property="id" 
                        labelProperty="name" />
                </html:select>
            </td>
            <td>
                <html:text property="w5003CriteriaDomain.stgInstrNo" maxlength="14"
                    styleClass="stg_instr_no" errorStyleClass="stg_instr_no gscm_error_class" />
            </td>
            <td>
                <html:text property="w5003CriteriaDomain.stgActNo" maxlength="19" 
                    styleClass="stg_act_no" errorStyleClass="stg_act_no gscm_error_class" />
            </td>
        </tr>
    </table>
    <%--
    -- search condition 2
    --%>
    <table class="gscm_search">
        <colgroup>
            <col class="search_fmEtd" />
            <col class="search_toEtd" />
            <col class="search_carrierCompCd"/>
        </colgroup>
        <tr>
            <th>
                <bean:message key="label.fmEtd" />
            </th>
            <th>
                <bean:message key="label.toEtd" />
            </th>
            <th>
                <bean:message key="label.carrierCompCd" />
            </th>
        </tr>
        <tr>
            <td>
                <html:text property="w5003CriteriaDomain.fmEtd" maxlength="8" 
                    styleClass="fm_etd" errorStyleClass="fm_etd gscm_error_class" />
                <img src="images/gscm/library/Calendar.gif" alt="calender"
                    onClick = "gscm.writeCalendar('fmEtdDiv', 'mainForm', 
                        'w5003CriteriaDomain.fmEtd', 
            '<bean:message key="format.screen.yyyymmdd"/>', this);"/>
                <div id="fmEtdDiv" style="float:left;"></div>
            </td>
            <td>
                <html:text property="w5003CriteriaDomain.toEtd" maxlength="8" styleClass="to_etd" 
                    errorStyleClass="to_etd gscm_error_class" />
                <img src="images/gscm/library/Calendar.gif" alt="calender"
                    onClick = "gscm.writeCalendar('toEtdDiv', 'mainForm', 
                    'w5003CriteriaDomain.toEtd', 
                    '<bean:message key="format.screen.yyyymmdd"/>', this);"/>
                <div id="toEtdDiv" style="float:left;"></div>
            </td>
            <td>
                <html:text property="w5003CriteriaDomain.carrierCompCd" maxlength="3" 
                    styleClass="carrier_comp_cd" 
                    errorStyleClass="carrier_comp_cd gscm_error_class" />
                <html:button property="select" onclick="showSelectCarrier();">
                    <bean:message key="button.select" />
                </html:button>
            </td>
        </tr>
    </table>
    <%--
    -- buttons 1
    --%>
    <table class="gscm_search_button">
        <colgroup>
            <col width="50%" />
            <col />
        </colgroup>
        <tr>
            <td>
                <html:button property="backToHeader" 
                    onclick="gscm.submitBack('W5002Init.do', this.form);" 
                    styleClass="back_to_header">
                    <bean:message key="button.backToHeader" />
                </html:button>
                <html:button property="backToMain" 
                    onclick="gscm.submitBack('W5001Init.do', this.form);" 
                    styleClass="back_to_main_screen">
                    <bean:message key="button.backToMainScreen" />
                </html:button>
            </td>
            <td class="right">
                <html:button property="search" 
                    onclick="gscm.submitSearch('W5003Search.do', this.form, '');" 
                    styleClass="search">
                    <bean:message key="button.search" />
                </html:button>
            </td>
        </tr>
    </table>
    <hr />
    <c:if test="${W5003Form.displayList}">
        <logic:notEmpty name="W5003Form" property="listDomainList">
            <%--
            -- buttons 2
            --%>
            <table class="gscm_resultlist_button">
                <colgroup>
                    <col />
                </colgroup>
                <tr>
                    <td>
                        <html:button property="moveToRegister" 
                onclick="gscm.commonSubmit('W5003MoveToRegister.do', this.form);" 
                styleClass="move_to_register">
                            <bean:message key="button.moveToRegister" />
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
            <table id="tablefix" class="gscm_resultlist" >
                <colgroup>
                    <col class="resultlist_ck" />
                    <col class="resultlist_cl" />
                    <col class="resultlist_stg_instr_no" />
                    <col class="resultlist_stg_act_no" />
                    <col class="resultlist_etd" />
                    <col class="resultlist_carrier_comp_cd" />
                    <col class="resultlist_pkg_qty" />
                    <col class="resultlist_gross_weight" />
                    <col class="resultlist_volume" />
                </colgroup>
                <thead>
                    <tr>
                        <th>
                            <bean:message key="label.ck" />
                        </th>
                        <th>
                            <bean:message key="label.containerLooseTyp" />
                        </th>
                        <th>
                            <bean:message key="label.stgInstrNo" />
                        </th>
                        <th>
                            <bean:message key="label.stgActNo" />
                        </th>
                        <th>
                            <bean:message key="label.etd" />
                        </th>
                        <th>
                            <bean:message key="label.carrierCompCd" />
                        </th>
                        <th>
                            <bean:message key="label.pkgQty" />
                        </th>
                        <th>
                            <bean:message key="label.totalGrossWeight" /><br />
                            (<bean:write name="W5003Form" 
                                property="w5003CriteriaDomain.weightUnitDisp" />)
                        </th>
                        <th>
                            <bean:message key="label.totalVol" /><br />
                            (<bean:write name="W5003Form" 
                                property="w5003CriteriaDomain.volumeUnitDisp" />)
                        </th>
                    </tr>
                </thead>
                <tbody>
                    <logic:iterate name="W5003Form" property="listDomainList" 
                        id="listDomain" indexId="idx">
                        <ai:stripeline number="${idx + 1}" odd="gscm_odd" even="gscm_even">
                            <tr>
                                <td class="center">
                                    <html:radio property="rowNum" value="${idx}" />
                                </td>
                                <td>
                                    <bean:write name="listDomain" property="containerLooseTyp" />
                                </td>
                                <td>
                                    <bean:write name="listDomain" property="stgInstrNo" />
                                </td>
                                <td>
                                    <bean:write name="listDomain" property="stgActNo" />
                                </td>
                                <td>
                                    <bean:write name="listDomain" property="etd" />
                                </td>
                                <td>
                                    <bean:write name="listDomain" property="carrierCompCd" />
                                </td>
                                <td class="right">
                                    <bean:write name="listDomain" property="pkgQty" />
                                </td>
                                <td class="right">
                                    <bean:write name="listDomain" property="grossWeight" />
                                </td>
                                <td class="right">
                                    <bean:write name="listDomain" property="volume" />
                                </td>
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
    <html:hidden property="searchFlg" />
    <html:hidden property="callScreenId" />
</html:form>
