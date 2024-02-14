<%--
 * Project : GSCM
 * 
 * W7007 - Other Doc UPLOAD (Summary)
 *
 * $Revision: 11684 $
 * 
 * Copyright (c) 2013 DENSO CORPORATION. All rights reserved.
 --%>

<html:form action="/W7007Init" styleId="mainForm" enctype="multipart/form-data">
    <%--
    -- search condition 1
    --%>
    <table class="gscm_search">
        <colgroup>
            <col class="search_shipper_cd" />
            <col class="search_consignee_cd" />
            <col class="search_ship_to_comp_cd" />
            <col class="search_trns_cd"/>
        </colgroup>
        <tr>
            <th>
                <bean:message key="label.shipperCd" />
            </th>
            <th>
                <bean:message key="label.consigneeCd" />
            </th>
            <th>
                <bean:message key="label.shipToCompCd" />
            </th>
            <th>
                <bean:message key="label.trnsCd" />
            </th>
        </tr>
        <tr>
            <td>
                <html:text property="w7007CriteriaDomain.shipperCd" styleClass="shipper_cd gscm_disptext" readonly="true"/>
            </td>
            <td>
                <bean:write name="W7007Form" property="w7007CriteriaDomain.consigneeCd" />
            </td>
            <td>
                <bean:write name="W7007Form" property="w7007CriteriaDomain.shipToCompCd" />
            </td>
            <td>
                <bean:write name="W7007Form" property="w7007CriteriaDomain.trnsCd" />
            </td>
        </tr>
    </table>
    <div>
        <html:button property="backToRegister" onclick="gscm.submitBack('W7004Init.do', this.form);" styleClass="back_to_register">
            <bean:message key="button.backToRegister" />
        </html:button>
    </div>
    <br />
    <%--
    -- Invoice No List
    --%>
    <table id="tablefix" class="gscm_resultlist">
        <colgroup>
            <col class="resultlist_ck" />
            <col class="resultlist_shipping_act_status" />
            <col class="resultlist_invoice_no"/>
        </colgroup>
        <thead>
            <tr>
                <th>
                    <bean:message key="label.ck" /><br />
                    <input type="checkbox" name="checkAll" onclick="allcheck('listDomainList', 'selected', this.checked)" />
                </th>
                <th>
                    <bean:message key="label.shippingActStatus" />
                </th>
                <th>
                    <bean:message key="label.invoiceNo" />
                </th>
            </tr>
        </thead>
        <tbody>
            <logic:iterate name="W7007Form" property="listDomainList" id="listDomainList" indexId="idx">
                <ai:stripeline number="${idx + 1}" odd="gscm_odd" even="gscm_even">
                    <tr class="gscm_odd">
                        <td class="center">
                            <html:checkbox name="listDomainList" property="selected" indexed="true" />
                        </td>
                        <td>
                            <html:text name="listDomainList" property="shippingActStatus" styleClass="shipping_act_status gscm_disptext" indexed="true" readonly="true"/>
                        </td>
                        <td>
                            <html:text name="listDomainList" property="invoiceNo" styleClass="invoice_no gscm_disptext" indexed="true"  errorStyleClass="invoice_no gscm_disptext gscm_error_class" readonly="true"/>
                        </td>
                        <html:hidden name="listDomainList" property="idxNo" indexed="true" value="${idx}" />
                        <html:hidden name="listDomainList" property="disabledFlg" indexed="true" />
                        <%-- <html:hidden name="listDomainList" property="invoiceIssueDt" indexed="true" /> ST184 INVOICE ISSUE DATE/インボイス発行日 DEL --%>
                    </tr>
                </ai:stripeline>
            </logic:iterate>
        </tbody>
    </table>

    <br />
    
    <table class="gscm_search">
        <colgroup>
            <col class="search_label" />
            <col class="search_file_data"/>
        </colgroup>
        <tr>
            <td>
                <bean:message key="label.co" />
            </td>
            <td>
                <input type="file" id="coFileData" style="display:none">
                <html:file property="coFileData" styleClass="file_data" errorStyleClass="file_data gscm_error_class" />
                <html:button property="coUpload" onclick="gscm.commonSubmit('W7007CoUpload.do', this.form);" style="upload">
                    <bean:message key="button.upload" />
                </html:button>
            </td>
        </tr>
        <tr>
            <td>
                <bean:message key="label.nonWooden" />
            </td>
            <td>
                <input type="file" id="nonWdFileData" style="display:none">
                <html:file property="nonWdFileData" styleClass="file_data" errorStyleClass="file_data gscm_error_class" />
                <html:button property="nonWdUpload" onclick="gscm.commonSubmit('W7007NonWoodenUpload.do', this.form);" style="upload">
                    <bean:message key="button.upload" />
                </html:button>
            </td>
        </tr>
        <tr>
            <td>
                <bean:message key="label.others" />
            </td>
            <td>
                <input type="file" id="othersFileData" style="display:none">
                <html:file property="othersFileData" styleClass="file_data" errorStyleClass="file_data gscm_error_class" />
                <html:button property="othersUpload" onclick="gscm.commonSubmit('W7007OthersUpload.do', this.form);"  style="upload">
                    <bean:message key="button.upload" />
                </html:button>
            </td>
        </tr>
    </table>
    <%--
    -- hidden
    --%>
    <html:hidden property="w7007CriteriaDomain.shippingActNo" />
    <html:hidden property="callScreenId" />
</html:form>
