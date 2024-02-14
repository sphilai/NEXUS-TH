<%--
 * Project : GSCM
 * 
 * W9023 - Invoice Template MA Edit
 *
 * $Revision: 12279 $
 * 
 * Copyright (c) 2013 DENSO CORPORATION. All rights reserved.
 --%>

<html:form action="/W9023Register.do" styleId="mainForm" enctype="multipart/form-data">
    <%--
    -- buttons 1
    --%>
    <table class="gscm_search_button">
        <colgroup>
            <col />
        </colgroup>
        <tr>
            <td>
                <bean:define id="backConfirmMessage"><bean:message key="GSCM-I0-0002"/></bean:define>
                <bean:define id="procMode" name="W9023Form" property="w9023CriteriaDomain.procMode" /> 
                <html:button property="backToInquiry" onclick="backToInquirySubmit('${procMode}', 'W9022Init.do', this.form, '${backConfirmMessage}');" styleClass="back_to_inquiry">
                    <bean:message key="button.backToInquiry" />
                </html:button>
                <html:button property="printSample" onclick="clearMessage(); gscm.commonSubmitForCheck('W9023PrintSample.do', this.form, 'false', 'false');" styleClass="print_sample">
                <bean:message key="button.printSample" />
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
            <col class="grid_data1" />
        </colgroup>
        <tr>
            <th class="right">
                <bean:message key="label.company" />
            </th>
            <th class="left">
                <bean:message key="label.key" />
            </th>
            <td>
                <html:text property="w9023CriteriaDomain.company" maxlength="5" styleClass="comp_cd gscm_required" errorStyleClass="comp_cd gscm_error_class"/>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.docNo" />
            </th>
            <th class="left">
                <bean:message key="label.key" />
            </th>
            <td>
                <html:text property="w9023CriteriaDomain.docNo" maxlength="3" styleClass="doc_no gscm_required" errorStyleClass="doc_no gscm_error_class"/>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="W9023.label.invoiceCtgry" />
            </th>
            <th>
            </th>
            <td>
                <html:select property="w9023CriteriaDomain.invoiceCtgry" styleId="invoice_ctgry" styleClass="W9023_invoice_ctgry gscm_required" errorStyleClass="W9023_invoice_ctgry gscm_error_class">
                    <html:options collection="invoiceCtgry" property="id" labelProperty="name"/>
                </html:select>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.invoiceClass" />
            </th>
            <th>
            </th>
            <td>
                <html:select property="w9023CriteriaDomain.invoiceClass" styleId="invoice_class" styleClass="gscm_required invoice_class" errorStyleClass="invoice_class gscm_error_class">
                    <html:options collection="invoiceClass" property="id" labelProperty="name"/>
                </html:select>
            </td>
        </tr>
    </table>
    <br />
    
    <%--
    -- Edit 2
    --%>
    <div style="margin:0 0 0 0px;">
        <bean:message key="label.cannotUploadFiles" />
    </div>
    <table class="grid">
        <colgroup>
            <col class="grid_title" />
            <col class="grid_primary_key" />
            <col class="grid_data1" />
        </colgroup>
        <tr>
            <th class="right">
                <bean:message key="label.master1" />
            </th>
            <th>
            </th>
            <td>
                <input type="file" id="master1" style="display:none">
                <html:file property="master1" styleClass="master_file_data gscm_required" errorStyleClass="master_file_data gscm_error_class"/>
                <br />
                <html:text property="w9023CriteriaDomain.fileName1" size="1" styleClass="w9023_fileName" readonly="true" />
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.master2" />
            </th>
            <th>
            </th>
            <td>
                <html:textarea property="w9023CriteriaDomain.master2" styleClass="monospace w9023_break_all" errorStyleClass="monospace w9023_break_all gscm_error_class" cols="35" rows="3"/>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.master3" /><br />
                <bean:message key="label.canInputOnly" /><br />
                <bean:message key="label.invCategoryIsN" />
            </th>
            <th>
            </th>
            <td>
                <html:textarea property="w9023CriteriaDomain.master3" styleClass="monospace w9023_break_all" errorStyleClass="monospace w9023_break_all gscm_error_class" cols="35" rows="10"/>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.master4" />
            </th>
            <th>
            </th>
            <td>
                <html:textarea property="w9023CriteriaDomain.master4" styleClass="monospace w9023_break_all" errorStyleClass="monospace w9023_break_all gscm_error_class" cols="50" rows="10"/>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.master5" />
            </th>
            <th>
            </th>
            <td>
                <input type="file" id="master5" style="display:none">
                <html:file property="master5" styleClass="master_file_data" errorStyleClass="master_file_data gscm_error_class"/>
                <br />
                <div class="master_file_data">
                    <div style="float:left;">
                            <html:text property="w9023CriteriaDomain.fileName5" size="1" styleClass="w9023_fileName" readonly="true" />
                        </div>
                    <div class="right"><html:checkbox property="w9023CriteriaDomain.m5Delete" /><bean:message key="label.delete" /></div>
                </div>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.master6" />
            </th>
            <th>
            </th>
            <td>
                <input type="file" id="master6" style="display:none">
                <html:file property="master6" styleClass="master_file_data gscm_required" errorStyleClass="master_file_data gscm_error_class"/>
                <br />
                <html:text property="w9023CriteriaDomain.fileName6" size="1" styleClass="w9023_fileName" readonly="true" />
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.master7" /><br />
                <bean:message key="label.invAuthorityPersonNameOrTitle" />
            </th>
            <th>
            </th>
            <td>
                <html:text property="w9023CriteriaDomain.master7" maxlength="40" styleClass="W9023_master" errorStyleClass="W9023_master gscm_error_class"/>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.master8" /><br />
                <bean:message key="label.invAuthorityPersonNameOrTitle" />
            </th>
            <th>
            </th>
            <td>
                <html:text property="w9023CriteriaDomain.master8" maxlength="40" styleClass="W9023_master" errorStyleClass="W9023_master gscm_error_class"/>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.master9" />
            </th>
            <th>
            </th>
            <td>
                <input type="file" id="master9" style="display:none">
                <html:file property="master9" styleClass="master_file_data" errorStyleClass="master_file_data gscm_error_class"/>
                <br />
                <div class="master_file_data">
                    <div style="float:left;">
                        <html:text property="w9023CriteriaDomain.fileName9" size="1" styleClass="w9023_fileName" readonly="true" />
                    </div>
                    <div class="right"><html:checkbox property="w9023CriteriaDomain.m9Delete" /><bean:message key="label.delete" /></div>
                </div>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.master10" /><br />
                <bean:message key="label.forPakingList" />
            </th>
            <th>
            </th>
            <td>
                <html:textarea property="w9023CriteriaDomain.master10" styleClass="monospace w9023_break_all" errorStyleClass="monospace w9023_break_all gscm_error_class" cols="35" rows="10"/>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.master11" /><br />
                <bean:message key="label.forSalesContract" />
            </th>
            <th>
            </th>
            <td>
                <html:textarea property="w9023CriteriaDomain.master11" styleClass="monospace w9023_break_all" errorStyleClass="monospace w9023_break_all gscm_error_class" cols="50" rows="10"/>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.master12" /><br />
                <bean:message key="label.forSalesContract" />
            </th>
            <th>
            </th>
            <td>
                <input type="file" id="master12" style="display:none">
                <html:file property="master12" styleClass="master_file_data" errorStyleClass="master_file_data gscm_error_class"/>
                <br />
                <div class="master_file_data">
                    <div style="float:left;">
                        <html:text property="w9023CriteriaDomain.fileName12" size="1" styleClass="w9023_fileName" readonly="true" />
                    </div>
                    <div class="right"><html:checkbox property="w9023CriteriaDomain.m12Delete" /><bean:message key="label.delete" /></div>
                </div>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.master13" /><br />
                <bean:message key="label.forSalesContract" />
            </th>
            <th>
            </th>
            <td>
                <input type="file" id="master13" style="display:none">
                <html:file property="master13" styleClass="master_file_data" errorStyleClass="master_file_data gscm_error_class"/>
                <br />
                <div class="master_file_data">
                    <div style="float:left;">
                        <html:text property="w9023CriteriaDomain.fileName13" size="1" styleClass="w9023_fileName" readonly="true" />
                    </div>
                    <div class="right"><html:checkbox property="w9023CriteriaDomain.m13Delete" /><bean:message key="label.delete" /></div>
                </div>
            </td>
        </tr>
    </table>
    <%--
    -- buttons 1
    --%>
    <table class="button">
        <colgroup>
            <col />
        </colgroup>
        <tr>
            <td class="right">
                <logic:equal name="W9023Form" property="w9023CriteriaDomain.procMode" value="1">
                    <bean:define id="registerConfirmMessage"><bean:message key="GSCM-I0-0003"/></bean:define>
                </logic:equal>
                <logic:notEqual name="W9023Form" property="w9023CriteriaDomain.procMode" value="1">
                    <bean:define id="registerConfirmMessage"><bean:message key="GSCM-I0-0004"/></bean:define>
                </logic:notEqual>
                <html:button property="register" onclick="gscm.submitConfirm('W9023Register.do', this.form, '${registerConfirmMessage}');">
                    <bean:message key="button.register" />
                </html:button>
            </td>
        </tr>
    </table>
    <%--
    -- hidden
    --%>
    <html:hidden property="callScreenId" />
    <html:hidden property="procMode" />
    <logic:notEmpty name="W9023Form" property="w9023CriteriaDomain.comUpdateTimestamp">
        <html:hidden property="w9023CriteriaDomain.comUpdateTimestamp" />
    </logic:notEmpty>
</html:form>
