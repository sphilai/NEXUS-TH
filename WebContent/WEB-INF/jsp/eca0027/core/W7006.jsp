<%--
 * Project : GSCM
 * 
 * W7006 - Other Doc UPLOAD
 *
 * $Revision: 11685 $
 * 
 * Copyright (c) 2013 DENSO CORPORATION. All rights reserved.
 --%>

<html:form action="/W7006Init.do" styleId="mainForm" enctype="multipart/form-data">
    <%--
    -- search condition 1
    --%>
    <table class="gscm_search">
        <colgroup>
            <col class="search_condition" />
            <col class="search_button"/>
        </colgroup>
        <tr>
            <td>
                <table class="search_condition">
                    <colgroup>
                        <col class="search_shipper_cd" />
                        <col class="search_consignee_cd" />
                        <col class="search_ship_to_comp_cd" />
                        <col class="search_trns_cd" />
                        <col class="search_invoice_no" />
                        <col class="search_shipping_act_status"/>
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
                        <th>
                            <bean:message key="label.invoiceNo" />
                        </th>
                        <th>
                            <bean:message key="label.shippingActStatus" />
                        </th>
                    </tr>
                    <tr>
                        <td>
                            <html:text property="w7006CriteriaDomain.shipperCd" styleClass="shipper_cd gscm_disptext" readonly="true"/>
                        </td>
                        <td>
                            <bean:write name="W7006Form" property="w7006CriteriaDomain.consigneeCd" />
                        </td>
                        <td>
                            <bean:write name="W7006Form" property="w7006CriteriaDomain.shipToCompCd" />
                        </td>
                        <td>
                            <bean:write name="W7006Form" property="w7006CriteriaDomain.trnsCd" />
                        </td>
                        <td>
                            <html:text property="w7006CriteriaDomain.invoiceNo" styleClass="w7006_invoice_no gscm_disptext" readonly="true"/>
                        </td>
                        <td>
                            <html:text property="w7006CriteriaDomain.shippingActStatus" styleClass="shipping_act_status gscm_disptext" readonly="true"/>
                        </td>
                    </tr>
                </table>
            </td>
            <td>
                <div class="right">
                    <html:button property="changeStatus" onclick="gscm.commonSubmit('W7006ChangeStatus.do', this.form);" styleClass="change_status">
                        <bean:message key="button.changeStatus" />
                    </html:button>
                </div>
            </td>
        </tr>
    </table>
    <div class="w7006_label_area">
        <bean:message key="label.changeStatusMemo" />
    </div>
    <div>
        <html:button property="backToRegister" onclick="gscm.submitBack('W7004Init.do', this.form);" styleClass="back_to_register">
            <bean:message key="button.backToRegister" />
        </html:button>
    </div>
    <br />
    <bean:define id="cancelConfirmMessage"><bean:message key="GSCM-I0-0005" locale="${locale_key}" /></bean:define>
    <table class="gscm_search">
        <colgroup>
            <col width="10%" />
            <col />
        </colgroup>
        <tr>
            <td>
                <bean:message key="label.co" />
            </td>
            <td>
                <input type="file" id="coFileData" style="display:none">
                <html:file property="coFileData"  styleClass="file_data" errorStyleClass="file_data gscm_error_class" />
                <html:button property="coUpload" onclick="gscm.commonSubmit('W7006CoUpload.do', this.form);" styleClass="upload">
                    <bean:message key="button.upload" />
                </html:button>
                <html:button property="coCancel" onclick="gscm.submitConfirm('W7006CoCancel.do', this.form, '${cancelConfirmMessage}');" styleClass="cancel">
                    <bean:message key="button.cancel" />
                </html:button>
                <html:text property="w7006CriteriaDomain.coFileName" maxlength="20" styleClass="file_name" errorStyleClass="file_name gscm_error_class" />
                <html:button property="coView" onclick="gscm.commonSubmitForCheck('W7006CoView.do', this.form, 'false', 'false');" styleClass="view">
                    <bean:message key="button.view" />
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
                <html:button property="nonWdUpload" onclick="gscm.commonSubmit('W7006NonWoodenUpload.do', this.form);" styleClass="upload">
                    <bean:message key="button.upload" />
                </html:button>
                <html:button property="nonWdCancel" onclick="gscm.submitConfirm('W7006NonWoodenCancel.do', this.form, '${cancelConfirmMessage}');" styleClass="cancel">
                    <bean:message key="button.cancel" />
                </html:button>
                <html:text property="w7006CriteriaDomain.nonWdFileName" maxlength="20" styleClass="file_name" errorStyleClass="file_name gscm_error_class" />
                <html:button property="nonWdView" onclick="gscm.commonSubmitForCheck('W7006NonWoodenView.do', this.form, 'false', 'false');" styleClass="view">
                    <bean:message key="button.view" />
                </html:button>
            </td>
        </tr>
        <logic:iterate name="W7006Form" property="listDomainList" id="listDomainList" indexId="idx">
            <tr>
                <td>
                    <bean:message key="label.others" />${idx + 1}
                </td>
                <td>
                    <input type="file" id="fileDataList[${idx}]" style="display:none">
                    <html:file property="fileDataList[${idx}]" styleClass="file_data" errorStyleClass="file_data gscm_error_class" />
                    <html:button property="othersUpload${idx}" onclick="submitSelectedRow('W7006OthersUpload.do', this.form, ${idx});" styleClass="update">
                        <bean:message key="button.upload" />
                    </html:button>
                    <html:button property="othersCancel${idx}" onclick="submitConfirmSelectedRow('W7006OthersCancel.do', this.form, '${cancelConfirmMessage}', ${idx});" styleClass="cancel">
                        <bean:message key="button.cancel" />
                    </html:button>
                    <html:text name="listDomainList" property="fileName" maxlength="20" styleClass="file_name" errorStyleClass="file_name gscm_error_class" indexed="true" />
                    <html:button property="othersView${idx}" onclick="submitSelectedRowForView('W7006OthersView.do', this.form, ${idx});" styleClass="view">
                        <bean:message key="button.view" />
                    </html:button>
                    <html:hidden name="listDomainList" property="brch" indexed="true" />
                </td>
            </tr>
        </logic:iterate>
    </table>
    <%--
    -- hidden
    --%>
    <html:hidden property="w7006CriteriaDomain.selectedRow" />
    <html:hidden property="w7006CriteriaDomain.shippingActNo" />
    <%-- <html:hidden property="w7006CriteriaDomain.invoiceIssueDt" /> ST184 INVOICE ISSUE DATE/インボイス発行日 DEL --%>
    <html:hidden property="w7006CriteriaDomain.comUpdateTimestamp" />
    <html:hidden property="w7006CriteriaDomain.comUpdateTimestampInvoice" />
    <html:hidden property="callScreenId" />
</html:form>
