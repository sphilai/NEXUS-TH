<%--
 * Project : GSCM
 * 
 * W7002 - Shipment Actuality Header
 *
 * $Revision: 12132 $
 * 
 * Copyright (c) 2013 DENSO CORPORATION. All rights reserved.
 --%>

<html:form action="/W7002Init" styleId="mainForm">
    <%--
    -- Header 1
    --%>
    <table class="grid">
        <colgroup>
            <col class="grid_header" />
            <col class="grid_contents"/>
        </colgroup>
        <tr>
            <th class="right">
                <bean:message key="label.shipperCd" />
            </th>
            <td>
                <html:text property="w7002CriteriaDomain.shipperCd" maxlength="5" styleClass="w7002_shipper_cd gscm_required" errorStyleClass="w7002_shipper_cd gscm_error_class" />
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.consigneeCd" />
            </th>
            <td>
                <html:text property="w7002CriteriaDomain.consigneeCd" maxlength="5" styleClass="w7002_consignee_cd" errorStyleClass="w7002_consignee_cd gscm_error_class" />
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.shipToCompCd" />
            </th>
            <td>
                <html:text property="w7002CriteriaDomain.shipToCompCd" maxlength="5" styleClass="w7002_ship_to_comp_cd gscm_required" errorStyleClass="w7002_ship_to_comp_cd gscm_error_class" />
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.trnsCd" />
            </th>
            <td>
                <html:select property="w7002CriteriaDomain.trnsCd" styleClass="trns_cd gscm_required" styleId="trns_cd" errorStyleClass="trns_cd gscm_error_class"  >
                    <html:options collection="trnsCd" property="id" labelProperty="name"/>
                </html:select>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="W7002.label.freightResponsibleCd" />
            </th>
            <td>
                <html:select property="w7002CriteriaDomain.freightResponsibleCd" styleClass="w7002_freight_responsible_cd gscm_required" styleId="freight_responsible_cd" errorStyleClass="w7002_freight_responsible_cd gscm_error_class" >
                    <html:options collection="freightResponsibleCd" property="id" labelProperty="name"/>
                </html:select>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.autoInvoiceRegisterFlg" />
            </th>
            <td>
                <html:select property="w7002CriteriaDomain.autoInvoiceRegisterFlg" styleClass="auto_invoice_resister gscm_required" errorStyleClass="auto_invoice_resister gscm_error_class" >
                    <html:options collection="flag" property="id" labelProperty="name"/>
                </html:select>
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
                <html:button property="moveToCreate" styleClass="move_to_create" onclick="gscm.commonSubmit('W7002MoveToCreate.do', this.form);" >
                    <bean:message key="button.moveToCreate" />
                </html:button>
                <html:button property="backToMainScreen" styleClass="back_to_main_screen" onclick="gscm.submitBack('W7001Init.do', this.form);">
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
