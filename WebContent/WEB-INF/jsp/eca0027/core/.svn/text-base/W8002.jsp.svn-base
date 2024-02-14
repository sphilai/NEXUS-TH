<%--
 * Project : GSCM
 * 
 * W8002 - Progress Control Detail
 *
 * $Revision: 14941 $
 * 
 * Copyright (c) 2013 DENSO CORPORATION. All rights reserved.
 --%>

<html:form action="/W8002Init" styleId="mainForm">
    <%--
    -- buttons 1
    --%>
    <table class="gscm_resultlist_button">
        <colgroup>
            <col />
        </colgroup>
        <tr>
            <td>
                <html:button property="backToMainScreen" onclick="gscm.submitBack('W8001Init.do', this.form);" styleClass="back_to_main_screen">
                    <bean:message key="button.backToMm" />
                </html:button>
            </td>
        </tr>
    </table>
    <%--
    -- Progress Detail
    --%>
    <table class="grid table_header1">
        <colgroup>
            <col class="grid_header1" />
            <col class="grid_contents1" />
            <col class="grid_header2" />
            <col class="grid_contents2" />
            <col class="grid_header3" />
            <col class="grid_contents3" />
            <col class="grid_header4" />
            <col class="grid_contents4" />
            <col />
        </colgroup>
        <tr>
            <th class="right">
                <bean:message key="label.cmlNo" />
            </th>
            <td>
                <html:text property="w8002CriteriaDomain.cmlNo" styleClass="w8002_cml_no gscm_disptext" readonly="true"/>
                <bean:define id="cmlNo" name="W8002Form" property="w8002CriteriaDomain.cmlNo" />
            </td>
            <th class="right">
                <bean:message key="label.trans" />
            </th>
            <td>
                <bean:write name="W8002Form" property="w8002CriteriaDomain.trnsCd" />
            </td>
            <th class="right">
                <bean:message key="label.invCategory" />
            </th>
            <td>
                <bean:write name="W8002Form" property="w8002CriteriaDomain.invoiceCtgry" />
            </td>
            <th class="right">
                <bean:message key="label.cmlType" />
            </th>
            <td>
                <bean:write name="W8002Form" property="w8002CriteriaDomain.cmlTyp" />
                <bean:define id="cmlTyp" name="W8002Form" property="w8002CriteriaDomain.cmlTyp" />
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.exReqNo" />
            </th>
            <td>
                <bean:write name="W8002Form"  property="w8002CriteriaDomain.expRequestNo" />
            </td>
            <th class="right">
                <bean:message key="label.returnStyleCd" />
            </th>
            <td colspan="5">
                <bean:write name="W8002Form"  property="w8002CriteriaDomain.returnStyleCd" />
            </td>
        </tr>
    </table>
    <br />

    <div class="box_title">
        <bean:message key="label.basicInformation" />
    </div>
    <table class="grid table_header2">
        <colgroup>
            <col class="grid_header1" />
            <col class="grid_contents1" />
            <col class="grid_contents2" />
            <col class="grid_contents3" />
        </colgroup>
        <tr>
            <th>
            </th>
            <th colspan="2" class="center">
                <bean:message key="label.cd" />
            </th>
            <th class="center">
                <bean:message key="label.abbr" />
            </th>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.shipper" />
            </th>
            <td colspan="2">
                <bean:write name="W8002Form" property="w8002CriteriaDomain.shipperCd" />
            </td>
            <td>
                <bean:write name="W8002Form" property="w8002CriteriaDomain.shipperCompNmAbb" />
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.consignee" />
            </th>
            <td colspan="2">
                <bean:write name="W8002Form"  property="w8002CriteriaDomain.consigneeCd" />
            </td>
            <td>
                <bean:write name="W8002Form"  property="w8002CriteriaDomain.consigneeCompNmAbb" />
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.nexusShipTo" />
            </th>
            <td colspan="2">
                <bean:write name="W8002Form"  property="w8002CriteriaDomain.shipToCd" />
            </td>
            <td>
                <bean:write name="W8002Form"  property="w8002CriteriaDomain.nexusShipToNmAbb" />
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.customerAndShipToNo" />
            </th>
            <td>
                <bean:write name="W8002Form" property="w8002CriteriaDomain.customerCd" />
            </td>
            <td>
                <bean:write name="W8002Form" property="w8002CriteriaDomain.lgcyShipTo" />
            </td>
            <td>
                <bean:write name="W8002Form" property="w8002CriteriaDomain.custNoShipToNmAbb" />
            </td>
        </tr>
    </table>
    <br />

    <div class="box_title">
        <table class="gscm_search">
            <bean:message key="label.packagingInformation" />
            <html:button property="confirmContents" onclick="callContents('${cmlNo}', '${cmlTyp}');" styleClass="confirm_contents">
                <bean:message key="button.confirmContents" />
            </html:button>
            <html:button property="confirmReturnable" onclick="callReturnable('${cmlNo}');" styleClass="confirm_returnable">
                <bean:message key="button.confirmReturnable" />
            </html:button>
        </table>
    </div>

    <table class="grid table_header3">
        <colgroup>
            <col class="grid_header1" />
            <col class="grid_contents1" />
            <col class="grid_header2" />
            <col class="grid_contents2" />
            <col class="grid_header3" />
            <col class="grid_contents3" />
            <col class="grid_header4" />
            <col class="grid_contents4" />
        </colgroup>
        <tr>
            <th class="right">
                <bean:message key="label.instrFlg" />
            </th>
            <td>
                <bean:write name="W8002Form" property="w8002CriteriaDomain.stgInstrItemFlg" />
            </td>
            <th class="right">
                <bean:message key="label.vol" />
            </th>
            <td class="right">
                <html:text property="w8002CriteriaDomain.volume" styleClass="w8002_volume gscm_disptext" readonly="true"/>
            </td>
            <th class="right">
                <bean:message key="label.nw" />
            </th>
            <td class="right">
                <html:text property="w8002CriteriaDomain.netWeight" styleClass="w8002_net_weight gscm_disptext" readonly="true"/>
            </td>
            <th class="right">
                <bean:message key="label.gw" />
            </th>
            <td class="right">
                <html:text property="w8002CriteriaDomain.grossWeight" styleClass="w8002_gross_weight gscm_disptext" readonly="true"/>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.xTagNo" />
            </th>
            <td>
                <html:text property="w8002CriteriaDomain.mainMark" styleClass="w8002_main_mark gscm_disptext" readonly="true"/>
            </td>
            <th class="right">
                <bean:message key="label.totalVol" />
            </th>
            <td class="right">
                <html:text property="w8002CriteriaDomain.totalVolume" styleClass="w8002_volume gscm_disptext" readonly="true"/>
            </td>
            <th class="right">
                <bean:message key="label.totalNw" />
            </th>
            <td class="right">
                <html:text property="w8002CriteriaDomain.totalNetWeight" styleClass="w8002_net_weight gscm_disptext" readonly="true"/>
            </td>
            <th class="right">
                <bean:message key="label.totalGw" />
            </th>
            <td class="right">
                <html:text property="w8002CriteriaDomain.totalGrossWeight" styleClass="w8002_gross_weight gscm_disptext" readonly="true"/>
            </td>
        </tr>
    </table>
    <br />
    
    <div class="box_title">
        <bean:message key="label.stagingInformation" />
    </div>
    <table class="grid table_header4">
        <colgroup>
            <col class="grid_header1" />
            <col class="grid_contents1" />
            <col class="grid_header2" />
            <col class="grid_contents2" />
            <col class="grid_header3" />
            <col class="grid_contents3"/>
        </colgroup>
        <tr>
            <th class="right">
                <bean:message key="label.contSortKey" />
            </th>
            <td>
                <bean:write name="W8002Form" property="w8002CriteriaDomain.containerSortingKey" />
            </td>
            <th class="right">
                <bean:message key="label.ldCd" />
            </th>
            <td>
                <bean:write name="W8002Form" property="w8002CriteriaDomain.loadingCd" />
            </td>
            <th class="right">
                <bean:message key="label.cl" />
            </th>
            <td>
                <bean:write name="W8002Form" property="w8002CriteriaDomain.containerLooseTyp" />
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.stgInstrNo" />
            </th>
            <td>
                <bean:write name="W8002Form" property="w8002CriteriaDomain.stgInstrNo" />
            </td>
            <th class="right">
                <bean:message key="label.stgActualityNo" />
            </th>
            <td colspan="3">
                <bean:write name="W8002Form" property="w8002CriteriaDomain.stgActNo" />
            </td>
        </tr>
    </table>
    <br />
    
    <div class="box_title">
        <bean:message key="label.invoiceInformation" />
    </div>
    <table class="grid table_header5">
        <colgroup>
            <col class="grid_header1" />
            <col class="grid_contents1" />
        </colgroup>
        <tr>
            <th class="right">
                <bean:message key="label.invNo" />
            </th>
            <td>
                <bean:write name="W8002Form" property="w8002CriteriaDomain.invoiceNo" />
            </td>
        </tr>
    </table>
    <br />

    <table class="grid table_header6">
        <colgroup>
            <col class="grid_header1" />
            <col class="grid_contents1" />
            <col class="grid_header2" />
            <col class="grid_contents2" />
            <col class="grid_header3" />
            <col class="grid_contents3" />
        </colgroup>
        <tr>
            <th class="right">
                <bean:message key="label.priceTerms" />
            </th>
            <td>
                <bean:write name="W8002Form" property="w8002CriteriaDomain.priceTerms" />
            </td>
            <th class="right">
                <bean:message key="label.paymentMethod" />
            </th>
            <td>
                <bean:write name="W8002Form" property="w8002CriteriaDomain.payMeth" />
            </td>
            <th class="right">
                <bean:message key="label.paymentTerms" />
            </th>
            <td colspan="2">
                <html:text property="w8002CriteriaDomain.payTerms" styleClass="w8002_pay_terms gscm_disptext" readonly="true"/>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.tradeTerms" />
            </th>
            <td>
                <html:text name="W8002Form" property="w8002CriteriaDomain.tradeTerms" styleClass="w8002_trade_terms gscm_disptext" readonly="true"/>
            </td>
            <th class="right">
                <bean:message key="label.curr" />
            </th>
            <td>
                <bean:write name="W8002Form" property="w8002CriteriaDomain.currCd" />
            </td>
            <th class="right">
                <bean:message key="label.lcNo" />
            </th>
            <td colspan="2">
                <html:text property="w8002CriteriaDomain.lcNo" styleClass="w8002_lc_no gscm_disptext" readonly="true"/>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.insurance" />
            </th>
            <td class="right">
                <bean:write name="W8002Form" property="w8002CriteriaDomain.insurance" />
            </td>
            <th class="right">
                <bean:message key="label.freight" />
            </th>
            <td class="right">
                <bean:write name="W8002Form" property="w8002CriteriaDomain.freight" />
            </td>
            <th class="right">
                <bean:message key="label.freightRes" />
            </th>
            <td colspan="2" class="left">
                <bean:write name="W8002Form" property="w8002CriteriaDomain.freightResponsibleCd" />
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.invTotalAmount" />
            </th>
            <td class="right">
                <bean:write name="W8002Form" property="w8002CriteriaDomain.netAmount" />
            </td>
            <th class="right">
                <bean:message key="label.exTotalAmount" />
            </th>
            <td class="right">
                <bean:write name="W8002Form" property="w8002CriteriaDomain.totalInvoiceAmount" />
            </td>
            <th colspan="2" style="display:none;"> </th>
        </tr>
    </table>
    <br />

    <div class="box_title">
        Shipping Information
    </div>
    <table class="grid table_header7">
        <colgroup>
            <col class="grid_header1" />
            <col class="grid_contents1" />
            <col class="grid_header2" />
            <col class="grid_contents2" />
            <col class="grid_header3" />
            <col class="grid_contents3" />
        </colgroup>
        <tr>
            <th class="right">
                <bean:message key="label.shippingConfirmationNo" />
            </th>
            <td>
                <bean:write name="W8002Form" property="w8002CriteriaDomain.shippingFirmNo" />
            </td>
            <th class="right">
                <bean:message key="label.carrier" />
            </th>
            <td>
                <bean:write name="W8002Form" property="w8002CriteriaDomain.carrierCompCd" />
            </td>
            <th class="right">
                <bean:message key="label.blNo" />
            </th>
            <td>
                <html:text property="w8002CriteriaDomain.billdNo" styleClass="w8002_billd_no gscm_disptext" readonly="true"/>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.atd" />
            </th>
            <td>
                <bean:write name="W8002Form" property="w8002CriteriaDomain.atd" />
            </td>
            <th class="right">
                <bean:message key="label.eta" />
            </th>
            <td>
                <bean:write name="W8002Form" property="w8002CriteriaDomain.eta" />
            </td>
            <th class="right">
                <bean:message key="label.vessel" />
            </th>
            <td>
                <html:text property="w8002CriteriaDomain.vessel" styleClass="w8002_vessel gscm_disptext" readonly="true"/>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.fmPort" />
            </th>
            <td>
                <bean:write name="W8002Form" property="w8002CriteriaDomain.loadingPortCd" />
            </td>
            <th class="right">
                <bean:message key="label.toPort" />
            </th>
            <td>
                <bean:write name="W8002Form" property="w8002CriteriaDomain.dischargePortCd" />
            </td>
            <th class="right">
                <bean:message key="label.containerNo" />
            </th>
            <td>
                <bean:write name="W8002Form" property="w8002CriteriaDomain.containerNo" />
            </td>
        </tr>
    </table>
    <%--
    -- hidden
    --%>
    <html:hidden property="callScreenId" />
</html:form>
