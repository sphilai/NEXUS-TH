<%--
 * W2006.jsp
 *
 * 小箱内多品番梱包Header画面のJSPです。
 * 
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 --%>
<script type="text/javascript"><!--
$(function() {
    setLabel();
    init();
});

function setLabel() {
    var pltzInstrRequired = $("#pltz_instr_required").val();
    if (pltzInstrRequired == "Y") {
        $("#label").text("<bean:message key='label.inputInstrNo' />");
    } else if (pltzInstrRequired == "N") {
        $("#label").text("<bean:message key='label.inputBelowContents' />");
    } else {
        $("#label").text("");
    }
}
//--></script>
<html:form action="/W2006MoveToCreate" styleId="mainForm">
    <%--
    -- Header 1
    --%>
    <table class="grid grid1">
        <colgroup>
            <col class="grid_header" />
            <col class="grid_contents" />
            <col class="grid_header2" />
            <col class="grid_contents2" />
        </colgroup>
        <tr>
            <th class="right">
                <bean:message key="label.pltzInstrRequired" />
            </th>
            <td>
                <html:select property="w2006CriteriaDomain.pltzInstrRequired" styleId="pltz_instr_required" styleClass="pltz_instr_required gscm_required" errorStyleClass="pltz_instr_required gscm_error_class" onchange="setLabel();setUp();">
                    <html:options collection="flag" property="id" labelProperty="name"/>
                </html:select>
                <span id="label">
                </span>
            </td>
            <th class="right">
                <bean:message key="label.pltzInstrNo" />
            </th>
            <td>
                <html:text property="w2006CriteriaDomain.pltzInstrNo" styleId="pltz_instr_no" maxlength="10" styleClass="pltz_instr_no gscm_required" errorStyleClass="pltz_instr_no gscm_error_class"/>
            </td>
        </tr>
    </table>
    <%--
    -- Header 2
    --%>
    <table class="grid grid2">
        <colgroup>
            <col class="grid_header" />
            <col class="grid_contents" />
        </colgroup>
        <tr>
            <th class="right">
                <bean:message key="label.shipperCd" />
            </th>
            <td>
                <html:text property="w2006CriteriaDomain.shipperCd" styleId="shipper_cd" maxlength="3" styleClass="shipper_cd gscm_required" errorStyleClass="shipper_cd gscm_error_class" />
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.customerCd" />
            </th>
            <td>
                <html:text property="w2006CriteriaDomain.customerCd" styleId="customer_cd" maxlength="8" styleClass="customer_cd gscm_required" errorStyleClass="customer_cd gscm_error_class" />
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.lgcyShipTo" />
            </th>
            <td>
                <html:text property="w2006CriteriaDomain.lgcyShipTo" styleId="lgcy_ship_to" maxlength="2" styleClass="lgcy_ship_to gscm_required" errorStyleClass="lgcy_ship_to gscm_error_class" />
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.trnsCd" />
            </th>
            <td>
                <html:select property="w2006CriteriaDomain.trnsCd" styleId="trns_cd" styleClass="trns_cd gscm_required" errorStyleClass="trns_cd gscm_error_class">
                    <html:options collection="trnsCd" property="id" labelProperty="name"/>
                </html:select>
            </td>
        </tr>
    </table>
    <%--
    -- Header 3
    --%>
    <table class="grid grid2">
        <colgroup>
            <col class="grid_header" />
            <col class="grid_contents" />
        </colgroup>
        <tr>
            <th class="right">
                <bean:message key="label.plntAndWhDeclaration" />
            </th>
            <td>
                <html:select property="w2006CriteriaDomain.plntAndWhDeclaration" styleId="plnt_and_wh_declaration" styleClass="plnt_and_wh_declaration gscm_required" errorStyleClass="plnt_and_wh_declaration gscm_error_class" onchange="setUpForPlntAndWhDeclaration();">
                    <html:options collection="plntAndWh" property="id" labelProperty="name"/>
                </html:select>
            </td>
        </tr>
    </table>
    <table class="grid1">
        <colgroup>
            <col class="left_table" />
            <col class="right_table"/>
        </colgroup>
        <tr>
            <td>
                <%--
                -- Header 4
                --%>
                <table class="grid grid2">
                    <colgroup>
                        <col class="grid_header" />
                        <col class="grid_contents" />
                    </colgroup>
                    <tr>
                        <th class="right">
                            <bean:message key="label.plntCd" />
                        </th>
                        <td>
                            <html:text property="w2006CriteriaDomain.plntCd" styleId="plnt_cd" maxlength="2" styleClass="plnt_cd gscm_required" errorStyleClass="plnt_cd gscm_error_class" />
                        </td>
                    </tr>
                    <tr>
                        <th class="right">
                            <bean:message key="label.lgcyWhCd" />
                        </th>
                        <td>
                            <html:text property="w2006CriteriaDomain.lgcyWhCd" styleId="lgcy_wh_cd" maxlength="1" styleClass="lgcy_wh_cd gscm_required" errorStyleClass="lgcy_wh_cd gscm_error_class" />
                        </td>
                    </tr>
                </table>
            </td>
            <td>
                <%--
                -- Header 5
                --%>
                <table class="grid grid3">
                    <colgroup>
                        <col class="grid_header" />
                        <col class="grid_contents3" />
                    </colgroup>
                    <tr>
                        <th class="right">
                            <bean:message key="label.whCompCd" />
                        </th>
                        <td>
                            <html:text property="w2006CriteriaDomain.whCompCd" styleId="wh_comp_cd" maxlength="5" styleClass="wh_comp_cd gscm_required" errorStyleClass="wh_comp_cd gscm_error_class" />
                        </td>
                    </tr>
                    <tr>
                       <th class="right">
                            <bean:message key="label.whCd" />
                        </th>
                        <td>
                            <html:text property="w2006CriteriaDomain.whCd" styleId="wh_cd" maxlength="4" styleClass="wh_cd gscm_required" errorStyleClass="wh_cd gscm_error_class" />
                        </td>
                    </tr>
                </table>
            </td>
        </tr>
    </table>
    <br />
    <%--
    -- buttons 1
    --%>
    <table class="gscm_resultlist_button">
        <colgroup>
            <col />
        </colgroup>
        <tr>
            <td>
                <html:button property="moveToCreate" styleClass="move_to_create" onclick="removeDisable();gscm.commonSubmit('W2006MoveToCreate.do', this.form);">
                    <bean:message key="button.moveToCreate" />
                </html:button>
                <html:button property="backToMainScreen" styleClass="back_to_main_screen" onclick="gscm.submitBack('W2005Init.do', this.form);">
                    <bean:message key="button.backToMainScreen" />
                </html:button>
            </td>
        </tr>
    </table>
    <%--
    -- hidden
    --%>
    <html:hidden property="callScreenId" />
</html:form>
