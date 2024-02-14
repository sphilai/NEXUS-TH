<%--
 * Project : GSCM
 * 
 * W9019 - Export Formalities by Item MA Edit
 *
 * $Revision: 14941 $
 * 
 * Copyright (c) 2013 DENSO CORPORATION. All rights reserved.
 --%>

<html:form action="/W9019Init.do" styleId="mainForm">
    <%--
    -- buttons 1
    --%>
    <table class="gscm_resultlist_button">
        <colgroup>
            <col />
        </colgroup>
        <tr>
            <td>
                <bean:define id="confirmMessage"><bean:message key="GSCM-I0-0002" locale="${locale_key}" /></bean:define>
                <bean:define id="procMode" name="W9019Form" property="w9019CriteriaDomain.mode" /> 
                <html:button property="back_to_inquiry" onclick="backToInquirySubmit('${procMode}', 'W9018Init.do', this.form, '${confirmMessage}');" styleClass="back_to_inquiry">
                    <bean:message key="button.backToInquiry" />
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
            <col class="grid_data2" />
            <col class="grid_data3" />
        </colgroup>
        <tr>
            <th class="right">
                <bean:message key="label.cigmaProducts" />
            </th>
            <th>
            </th>
            <td colspan="3">
                <html:text property="w9019CriteriaDomain.cigmaPrdctFlg" styleClass="cigma_prdct_flg gscm_disptext" readonly="true"/>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.compCd" />
            </th>
            <th class="left">
                <bean:message key="label.key" />
            </th>
            <td colspan="3">
                <html:text property="w9019CriteriaDomain.compCd" styleClass="comp_cd gscm_disptext" readonly="true"/>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.itemNo" />
            </th>
            <th class="left">
                <bean:message key="label.key" />
            </th>
            <td colspan="3">
                <html:text property="w9019CriteriaDomain.itemNo" styleClass="item_no gscm_disptext" readonly="true"/>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.aplyStrtDt" />
            </th>
            <th class="left">
                <bean:message key="label.key" />
            </th>
            <td colspan="3">
                <html:text property="w9019CriteriaDomain.aplyStrtDt" maxlength="8" styleClass="aply_strt_dt gscm_required" errorStyleClass="aply_strt_dt gscm_error_class" />
                <img src="images/gscm/library/Calendar.gif" id="aplyStrtDtCal"
                    onClick = "gscm.writeCalendar('applyStartDateDiv', 'mainForm', 'w9019CriteriaDomain.aplyStrtDt', '<bean:message key="format.screen.yyyymmdd" locale="${locale_key}" />', this);"/>
                <div id="applyStartDateDiv" style="float:left;"></div>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.description" />
            </th>
            <th>
            </th>
            <td colspan="3">
               <html:text property="w9019CriteriaDomain.itemDescription" styleClass="item_description gscm_disptext" readonly="true"/>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.expLimitTyp" />
            </th>
            <th>
            </th>
            <td colspan="3">
                <html:select property="w9019CriteriaDomain.expLimitTyp" styleId="exp_limit_typ" styleClass="exp_limit_typ" errorStyleClass="exp_limit_typ gscm_error_class" >
                    <html:options collection="expRegulationType" property="id" labelProperty="name"/>
                </html:select>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.dngrItemFlg" />
            </th>
            <th>
            </th>
            <td colspan="3">
                <html:select property="w9019CriteriaDomain.dngrItemFlg" styleClass="dngr_item_flg gscm_required" errorStyleClass="dngr_item_flg gscm_error_class" >
                    <html:options collection="flag" property="id" labelProperty="name"/>
                </html:select>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.hsCd" />
            </th>
            <th>
            </th>
            <td colspan="3">
                <html:text property="w9019CriteriaDomain.hsCd" maxlength="12" styleClass="hs_cd" errorStyleClass="hs_cd gscm_error_class" />
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.originCntryCd" />
            </th>
            <th>
            </th>
            <td colspan="3">
                <html:text property="w9019CriteriaDomain.originCntryCd" maxlength="2" styleClass="origin_cntry_cd gscm_required" errorStyleClass="origin_cntry_cd gscm_error_class"/>
                <html:button property="select" onclick="setOriginCntryCd();">
                    <bean:message key="button.select" />
                </html:button>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:write name="W9019Form" property="w9019CriteriaDomain.free1Value"/>
            </th>
            <th>
            </th>
            <td>
                <bean:message key="label.register" /><br />
                <html:select property="w9019CriteriaDomain.free1RegFlg" styleClass="free_reg_flg gscm_required" errorStyleClass="free_reg_flg gscm_error_class" onchange="gscm.commonSubmit('W9019FreeRegisterFlg.do', this.form);">
                    <html:options collection="flag" property="id" labelProperty="name"/>
                </html:select>
            </td>
            <td>
                <html:text property="w9019CriteriaDomain.free1Dtl" maxlength="20" styleClass="free_dtl" errorStyleClass="free_dtl gscm_error_class" />
            </td>
            <td>
                <bean:message key="label.notlistCountryOfOriginOnInvoice" />
                <html:checkbox property="w9019CriteriaDomain.free1OriginCntryFlg" />
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:write name="W9019Form" property="w9019CriteriaDomain.free2Value"/>
            </th>
            <th>
            </th>
            <td>
                <bean:message key="label.register" /><br />
                <html:select property="w9019CriteriaDomain.free2RegFlg" styleClass="free_reg_flg gscm_required" errorStyleClass="free_reg_flg gscm_error_class" onchange="gscm.commonSubmit('W9019FreeRegisterFlg.do', this.form);" >
                    <html:options collection="flag" property="id" labelProperty="name"/>
                </html:select>
            </td>
            <td>
                <html:text property="w9019CriteriaDomain.free2Dtl" maxlength="20" styleClass="free_dtl"  errorStyleClass="free_dtl gscm_error_class" />
            </td>
            <td>
                <bean:message key="label.notlistCountryOfOriginOnInvoice" />
                <html:checkbox property="w9019CriteriaDomain.free2OriginCntryFlg" />
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:write name="W9019Form" property="w9019CriteriaDomain.free3Value"/>
            </th>
            <th>
            </th>
            <td>
                <bean:message key="label.register" /><br />
                <html:select property="w9019CriteriaDomain.free3RegFlg" styleClass="free_reg_flg gscm_required" errorStyleClass="free_reg_flg gscm_error_class" onchange="gscm.commonSubmit('W9019FreeRegisterFlg.do', this.form);" >
                    <html:options collection="flag" property="id" labelProperty="name"/>
                </html:select>
            </td>
            <td>
                <html:text property="w9019CriteriaDomain.free3Dtl" maxlength="20" styleClass="free_dtl" errorStyleClass="free_dtl gscm_error_class" />
            </td>
            <td>
                <bean:message key="label.notlistCountryOfOriginOnInvoice" />
                <html:checkbox property="w9019CriteriaDomain.free3OriginCntryFlg" />
            </td>
        </tr>
    </table>
    <%--
    -- buttons 2
    --%>
    <table class="button">
        <colgroup>
            <col />
        </colgroup>
        <tr>
            <td class="right">
                <logic:equal name="W9019Form" property="w9019CriteriaDomain.mode" value="2"><bean:define id="confirmMessage2"><bean:message key="GSCM-I0-0004" locale="${locale_key}" /></bean:define></logic:equal>
                <logic:notEqual name="W9019Form" property="w9019CriteriaDomain.mode" value="2"><bean:define id="confirmMessage2"><bean:message key="GSCM-I0-0003" locale="${locale_key}" /></bean:define></logic:notEqual>
                <html:button property="register" onclick="gscm.submitConfirm('W9019Register.do', this.form, '${confirmMessage2}');" styleClass="register">
                    <bean:message key="button.register" />
                </html:button>
            </td>
        </tr>
    </table>
    <%--
    -- hidden
    --%>
    <html:hidden property="callScreenId" />
    <html:hidden property="w9019CriteriaDomain.mode" />
    <logic:notEmpty name="W9019Form" property="w9019CriteriaDomain.comUpdateTimestamp">
        <html:hidden property="w9019CriteriaDomain.comUpdateTimestamp" />
    </logic:notEmpty>
</html:form>
