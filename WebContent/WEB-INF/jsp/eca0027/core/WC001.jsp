<%--
 * WC001.jsp
 * 
 * Empty RT materials画面のJSPです。
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 --%>
<script type="text/javascript"><!--
$(function() {
    $('#tablefix').tablefix({height: 181, fixRows: 1});
    if ($("#ert_action_select1:checked").val()) {
        changeMode("1");
    } else if ($("#ert_action_select2:checked").val()) {
        changeMode("2");
    } else if ($("#ert_action_select3:checked").val()) {
        changeMode("3");
    } else {
        changeMode("1");
    }
});

//--></script>

<html:form action="/WC001Init" styleId="mainForm">

    <table class="grid grid1">
        <colgroup>
            <col class="grid_header1" />
            <col class="grid_contents1" />
            <col class="grid_header2" />
            <col class="grid_contents2" />
            <col class="grid_header3" />
            <col class="grid_contents3" />
        </colgroup>
        <tr>
            <th rowspan="2" class="right">
                <bean:message key="label.actionSelect" />
            </th>
            <td rowspan="2">
                <html:radio property="criteriaDomain.actionSelect" styleId="ert_action_select1" value="1" onclick="setUp(this);" /><bean:message key="label.createNew" /><br />
                <html:radio property="criteriaDomain.actionSelect" styleId="ert_action_select2" value="2" onclick="setUp(this);" /><bean:message key="label.rePrint" /><br />
                <html:radio property="criteriaDomain.actionSelect" styleId="ert_action_select3" value="3" onclick="setUp(this);" /><bean:message key="label.cancel" />
            </td>
            <th class="right">
                <bean:message key="label.fromMainMark" />
            </th>
            <td colspan="3">
                <html:text property="criteriaDomain.fromMainMark" styleId="fromMainMark" maxlength="17" styleClass="from_main_mark" errorStyleClass="from_main_mark gscm_error_class"  />
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.toMainMark" />
            </th>
            <td colspan="3">
                <html:text property="criteriaDomain.toMainMark" styleId="toMainMark" maxlength="17" styleClass="to_main_mark" errorStyleClass="to_main_mark gscm_error_class" />
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.shipperCd" />
            </th>
            <td colspan="5">
                <html:text property="criteriaDomain.shipperCd" styleId="shipperCd" styleClass="shipper_cd gscm_required" errorStyleClass="shipper_cd gscm_error_class" readonly="true" />
                <html:button property="shipperCdselect" styleId="shipperCdselect" onclick="selectShipper();" styleClass="select">
                    <bean:message key="button.select" />
                </html:button>
                <html:text property="criteriaDomain.shipperNm" styleClass="wc001_shipper_nm gscm_disptext" readonly="true" />
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.shipToCd" />
            </th>
            <td colspan="5">
                <html:text property="criteriaDomain.shipToCd" styleId="shipToCd" maxlength="7" styleClass="ship_to_cd gscm_required" errorStyleClass="ship_to_cd gscm_error_class" />
                <html:button property="shipToCdselect" styleId="shipToCdselect" onclick="selectShipTo();" styleClass="select">
                    <bean:message key="button.select" />
                </html:button>
                <html:text property="criteriaDomain.shipToNm" styleClass="wc001_ship_to_nm gscm_disptext" readonly="true" />
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.trnsCd" />
            </th>
            <td>
                <html:select property="criteriaDomain.trnsCd" styleId="trnsCd" styleClass="trns_cd gscm_required" errorStyleClass="trns_cd gscm_error_class">
                    <html:options collection="trnsCd" property="id" labelProperty="name" />
                </html:select>
            </td>
            <th class="right">
                <bean:message key="label.freightResponsibleCd" />
            </th>
            <td>
                <html:select property="criteriaDomain.freightResponsibleCd" styleId="freightResponsibleCd" styleClass="freight_responsible_cd gscm_required" errorStyleClass="freight_responsible_cd gscm_error_class">
                    <html:options collection="freightResponsibleCd" property="id" labelProperty="name" />
                </html:select>
            </td>
            <th class="right">
                <bean:message key="label.requestShipDate" />
            </th>
            <td>
                <html:text property="criteriaDomain.dueDt" maxlength="8" styleId="dueDt" styleClass="due_dt" errorStyleClass="due_dt gscm_error_class" />
                <img src="images/gscm/library/Calendar.gif" onClick="gscm.writeCalendar('dueDtDiv', 'mainForm', 'criteriaDomain.dueDt', '<bean:message key="format.screen.yyyymmdd" />', this);"/>
                <div id="dueDtDiv" style="float:left;"></div>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.packingWhCompCd" />
            </th>
            <td>
                <html:text property="criteriaDomain.packingWhCompCd" styleId="packingWhCompCd" maxlength="5" styleClass="packing_wh_comp_cd gscm_required" errorStyleClass="packing_wh_comp_cd gscm_error_class" />
            </td>
            <th class="right">
                <bean:message key="label.packingWhCd" />
            </th>
            <td>
                <html:text property="criteriaDomain.packingWhCd" styleId="packingWhCd" maxlength="4" styleClass="packing_wh_cd gscm_required" errorStyleClass="packing_wh_cd gscm_error_class" />
            </td>
            <th class="right">
                <bean:message key="label.plntCd" />
            </th>
            <td>
                <html:text property="criteriaDomain.plntCd" styleId="plntCd" maxlength="2" styleClass="plnt_cd gscm_required" errorStyleClass="plnt_cd gscm_error_class" />
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.containerSortingKey" />
            </th>
            <td>
                <bean:write name="WC001Form" property="criteriaDomain.containerSortingKey" />
            </td>
            <th class="right">
                <bean:message key="label.loadingCd" />
            </th>
            <td>
                <html:select property="criteriaDomain.loadingCd" styleId="loadingCd" styleClass="loading_cd gscm_required" errorStyleClass="loading_cd gscm_error_class">
                    <html:options collection="loadingCd" property="id" labelProperty="name" />
                </html:select>
            </td>
            <th class="right">
                <bean:message key="label.invoiceCtgry" />
            </th>
            <td>
                <bean:write name="WC001Form" property="criteriaDomain.invoiceCtgry" />
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.customTimingTyp" />
            </th>
            <td>
                <bean:write name="WC001Form" property="criteriaDomain.customTimingTyp" />
            </td>
            <th class="right">
                <bean:message key="label.priceTerms" />
            </th>
            <td colspan="3">
                <html:select property="criteriaDomain.priceTerms" styleId="priceTerms" styleClass="price_terms gscm_required" errorStyleClass="price_terms gscm_error_class">
                    <html:options collection="priceTerms" property="id" labelProperty="name" />
                </html:select>
            </td>
        </tr>
    </table>
    <br />
    
    <table class="grid grid2">
        <colgroup>
            <col class="grid_header1" />
            <col class="grid_contents1" />
            <col class="" /> <%-- UT420 MOD --%>
            <col class="" /> <%-- UT420 MOD --%>
            <col class="" /> <%-- UT420 ADD --%>
            <col class="" /> <%-- UT420 ADD --%>
        </colgroup>
        <tr>
        <th class="right" colspan="2">
            <bean:message key="label.returnStyleCd" />
        </th>
        <td>
            <html:text property="criteriaDomain.returnStyleCd" styleId="returnStyleCd" maxlength="37" styleClass="return_style_cd gscm_required" errorStyleClass="return_style_cd gscm_error_class" />
        </td>
        <th class="right">
            <bean:message key="label.palletQty" />
        </th>
        <td>
            <html:text property="criteriaDomain.palletQty" styleId="palletQty" maxlength="3" styleClass="pallet_qty right gscm_required" errorStyleClass="pallet_qty right gscm_error_class" />
        </td>
        <%-- UT420 ADD START --%>
        <th class="right">
            <bean:message key="label.palletCartonTyp" />
        </th>
        <td>
            <html:select property="criteriaDomain.palletCartonTyp" styleId="palletCartonTyp" styleClass="pallet_carton_typ gscm_required" errorStyleClass="pallet_carton_typ gscm_error_class">
                <html:options collection="palletCartonTyp" property="id" labelProperty="name" />
            </html:select>
        </td>
        <%-- UT420 ADD START --%>
        </tr>
    </table>
     <br />
     
    <bean:message key="label.messagePallet" />
        
    <table class="grid grid3">
        <colgroup>
            <col class="grid_header1" />
            <col class="grid_contents1" />
            <col class="grid_header2" />
            <col class="grid_contents2" />
            <col class="grid_header3" />
            <col class="grid_contents3" />
            <col class="grid_header4" />
            <col class="grid_contents4" />
            <col class="grid_header5" />
            <col class="grid_contents5" />
            <col class="grid_header6" />
            <col class="grid_contents6" />
        </colgroup>
        <tr>
            <th class="right">
                <bean:message key="label.length" />
            </th>
            <td>
                <html:text property="criteriaDomain.length" styleId="frmlength" maxlength="8" styleClass="length right gscm_required" errorStyleClass="length right gscm_error_class" /><br />
                <html:text property="criteriaDomain.lengthUnitLength" styleClass="length_unit_length gscm_disptext" readonly="true" />
            </td>
            <th class="right">
                <bean:message key="label.width" />
            </th>
            <td>
                <html:text property="criteriaDomain.width" styleId="width" maxlength="8" styleClass="width right gscm_required" errorStyleClass="width right gscm_error_class" /><br />
                <html:text property="criteriaDomain.lengthUnitWidth" styleClass="length_unit_width gscm_disptext" readonly="true" />
            </td>
            <th class="right">
                <bean:message key="label.height" />
            </th>
            <td>
                <html:text property="criteriaDomain.height" styleId="height" maxlength="8" styleClass="height right gscm_required" errorStyleClass="height right gscm_error_class" /><br />
                <html:text property="criteriaDomain.lengthUnitHeight" styleClass="length_unit_height gscm_disptext" readonly="true" />
            </td>
            <th class="right">
                <bean:message key="label.volume" />
            </th>
            <td>
                <html:text property="criteriaDomain.volume" styleId="volume" maxlength="16" styleClass="wc001_volume right gscm_required" errorStyleClass="wc001_volume right gscm_error_class" /><br />
                <html:text property="criteriaDomain.volumeUnit" styleClass="wc001_volume_unit gscm_disptext" readonly="true" />
                <bean:message key="label.messageVolume" />
            </td>
            <th class="right">
                <bean:message key="label.netWeight" />
            </th>
            <td>
                <html:text property="criteriaDomain.netWeight" styleClass="wc001_net_weight right gscm_disptext" errorStyleClass="wc001_net_weight right gscm_disptext gscm_error_class" readonly="true" /><br />
                <html:text property="criteriaDomain.weightUnitNw" styleClass="weight_unit_nw gscm_disptext" readonly="true" />
            </td>
            <th class="right">
                <bean:message key="label.grossWeight" />
            </th>
            <td>
                <html:text property="criteriaDomain.grossWeight" styleId="grossWeight" maxlength="11" styleClass="wc001_gross_weight right gscm_required" errorStyleClass="wc001_gross_weight right gscm_error_class" /><br />
                <html:text property="criteriaDomain.weightUnitGw" styleClass="weight_unit_gw gscm_disptext" readonly="true" />
            </td>
            <html:hidden property="strAfterRegist" />
            <html:hidden property="criteriaDomain.shipperCdHidden" />
            <html:hidden property="criteriaDomain.lengthUnitHidden" />
            <html:hidden property="criteriaDomain.volumeUnitHidden" />
            <html:hidden property="criteriaDomain.weightUnitHidden" />
        </tr>
    </table>
    <br />
    
    <table id="tablefix" class="gscm_resultlist">
        <colgroup>
            <col class="resultlist_contents" />
            <col class="resultlist_pltz_item_no" />
            <col class="resultlist_model_cd" />
            <col class="resultlist_qty" />
        </colgroup>
        <tr>
            <th>
                &nbsp;
            </th>
            <th>
                <bean:message key="label.itemNo" />
            </th>
            <th>
                <bean:message key="label.WC001.modelCd" />
            </th>
            <th>
                <bean:message key="label.qty" />
            </th>
        </tr>
        <logic:iterate name="WC001Form" property="listDomainList" id="listDomainList" indexId="idx" scope="request">
            <ai:stripeline number="${idx + 1}" odd="gscm_odd" even="gscm_even">
                <tr>
                    <th>
                         <bean:message key="label.contents" /> <c:out value="${idx + 1}" />
                    </th>
                    <td>
                        <html:text name="listDomainList" styleId="pltzItemNo${idx}" property="pltzItemNo" maxlength="27" styleClass="wc001_pkg_item_no" errorStyleClass="wc001_pkg_item_no gscm_error_class" indexed="true" />
                    </td>
                    <td>
                        <html:text name="listDomainList" property="modelCd" styleClass="wc001_model_cd gscm_disptext" readonly="true" indexed="true" />
                    </td>
                    <td>
                        <html:text name="listDomainList" styleId="qty${idx}" property="qty" maxlength="7" styleClass="qty right" errorStyleClass="qty right gscm_error_class" indexed="true" />
                    </td>
                </tr>
            </ai:stripeline>
        </logic:iterate>
    </table>
    
    <%--
    -- buttons 1
    --%>
    <table class="gscm_search_button">
        <colgroup>
            <col />
        </colgroup>
        <tr>
            <td class="right">
                <bean:define id="clearConfirmMessage"><bean:message key="NXS-I1-0009"/></bean:define>
                <bean:define id="cancelConfirmMessage"><bean:message key="GSCM-I0-0005"/></bean:define>
                <bean:define id="registerConfirmMessage"><bean:message key="GSCM-I0-0003"/></bean:define>
                <html:button property="display" styleId="display" styleClass="display" onclick="gscm.commonSubmit('WC001Display.do', this.form);">
                    <bean:message key="button.display" />
                </html:button>
                <html:button property="register" styleId="register" styleClass="register" onclick="gscm.submitConfirm('WC001Register.do', this.form, '${registerConfirmMessage}');">
                    <bean:message key="button.register" />
                </html:button>
                <html:button property="printCml" styleId="printCml" styleClass="print_cml" onclick="beforePrintCML();gscm.commonSubmit('WC001PrintCml.do', this.form);">
                    <bean:message key="button.printCml" />
                </html:button>
                <html:button property="clear" styleId="clear" styleClass="clear" onclick="gscm.submitConfirm('WC001Clear.do', this.form, '${clearConfirmMessage}');">
                    <bean:message key="button.clear" />
                </html:button>
                <html:button property="cancel" styleId="cancel" styleClass="cancel" onclick="gscm.submitConfirm('WC001Cancel.do', this.form, '${cancelConfirmMessage}');">
                    <bean:message key="button.cancel" />
                </html:button>
            </td>
        </tr>
    </table>
    
    <%--
    -- hidden
    --%>
    <html:hidden property="callScreenId" />
    <html:hidden property="downloadCml" />
</html:form>
