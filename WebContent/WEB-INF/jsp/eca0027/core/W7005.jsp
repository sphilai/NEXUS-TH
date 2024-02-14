<%--
 * Project : GSCM
 * 
 * W7005 - BL UPLOAD
 *
 * $Revision: 7682 $
 * 
 * Copyright (c) 2013 DENSO CORPORATION. All rights reserved.
 --%>

<html:form action="/W7005Init" styleId="mainForm" enctype="multipart/form-data">
    <%--
    -- search condition 1
    --%>
    <table class="gscm_search">
        <colgroup>
            <col class="search_shipper_cd" />
            <col class="search_consignee_cd" />
            <col class="search_ship_to_comp_cd" />
            <col class="search_trns_cd" />
            <col class="search_billd_no"/>
        </colgroup>
        <tr>
            <th>
                <bean:message key="label.shipperCd" />
            </th>
            <th>
                <bean:message key="label.consignee" />
            </th>
            <th>
                <bean:message key="label.shipToCompCd" />
            </th>
            <th>
                <bean:message key="label.trnsCd" />
            </th>
            <th>
                <bean:message key="label.billdNo" />
            </th>
        </tr>
        <tr>
            <td>
                <html:text property="w7005CriteriaDomain.shipperCd" styleClass="w7005_shipper_cd gscm_disptext" readonly="true"/>
            </td>
            <td>
                <html:text property="w7005CriteriaDomain.consigneeCd" styleClass="w7005_consignee_cd gscm_disptext" readonly="true"/>
            </td>
            <td>
                <html:text property="w7005CriteriaDomain.shipToCompCd" styleClass="w7005_ship_to_comp_cd gscm_disptext" readonly="true"/>
            </td>
            <td>
                <html:text property="w7005CriteriaDomain.trnsCd" styleClass="w7005_trns_cd gscm_disptext" readonly="true"/>
            </td>
            <td>
                <html:text property="w7005CriteriaDomain.billdNo" styleClass="w7005_billd_no gscm_disptext" readonly="true"/>
            </td>
        </tr>
    </table>
    <div>
        <html:button property="backToRegister" onclick="gscm.submitBack('W7004Init.do', this.form);" styleClass="back_to_register">
            <bean:message key="button.backToRegister" />
        </html:button>
    </div>
    <br />
    <table class="gscm_search">
        <colgroup>
            <col class="search_bl_label" />
            <col class="search_bl" />
        </colgroup>
        <tr>
            <td>
                <bean:message key="label.bl" />
            </td>
            <td>
                <input type="file" id="formFileData" style="display:none" />
                <html:file property="formFileData" maxlength="300" styleClass="file_data" errorStyleClass="file_data gscm_error_class" />
                <html:button property="upload" onclick="gscm.commonSubmit('W7005Upload.do', this.form);" styleClass="upload">
                    <bean:message key="button.upload" />
                </html:button>
                <bean:define id="cancelConfirmMessage"><bean:message key="GSCM-I0-0005" locale="${locale_key}" /></bean:define>
                <html:button property="cancel" onclick="gscm.submitConfirm('W7005Cancel.do', this.form, '${cancelConfirmMessage}');" styleClass="cancel">
                    <bean:message key="button.cancel" />
                </html:button>
                <html:text property="w7005CriteriaDomain.fileName" styleClass="file_name" errorStyle="file_name gscm_error_class" />
                <html:button property="view" onclick="gscm.commonSubmitForCheck('W7005View.do', this.form, 'false', 'false');" styleClass="view">
                    <bean:message key="button.view" />
                </html:button>
            </td>
        </tr>
    </table>
    <%--
    -- hidden
    --%>
    <html:hidden property="w7005CriteriaDomain.shippingActNo" />
    <logic:notEmpty name="W7005Form" property="w7005CriteriaDomain.comUpdateTimestamp">
        <html:hidden property="w7005CriteriaDomain.comUpdateTimestamp" />
    </logic:notEmpty>
    <html:hidden property="callScreenId" />
</html:form>
