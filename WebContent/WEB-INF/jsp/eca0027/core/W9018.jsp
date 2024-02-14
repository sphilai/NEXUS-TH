<%--
 * Project : GSCM
 * 
 * W9018 - Export Formalities by Item MA Inquiry
 *
 * $Revision: 12652 $
 * 
 * Copyright (c) 2013 DENSO CORPORATION. All rights reserved.
 --%>


<html:form action="/W9018Init.do" styleId="mainForm">
    <%--
    -- search condition 1
    --%>
    <table class="gscm_search">
        <colgroup>
            <col />
        </colgroup>
        <tr>
            <th>
                <html:radio styleId="radioSearch" property="w9018CriteriaDomain.selectCondition" value="1" onclick="operationSearch();" /><bean:message key="label.search" />
                <html:radio styleId="radioAdd" property="w9018CriteriaDomain.selectCondition" value="2" onclick="operationAdd();" /><bean:message key="label.add" />
            </th>
        </tr>
    </table>
    <%--
    -- search condition 2
    --%>
    <table class="gscm_search">
        <colgroup>
            <col class="search_comp_cd" />
            <col class="search_item_no" />
            <col class="search_display" />
            <col class="search_exp_limit_typ" />
            <col class="search_dngr_item_flg" />
            <col class="search_hs_cd" />
            <col class="search_cigma_prdct_flg" />
        </colgroup>
        <tr>
            <th>
                <bean:message key="label.compCd" />
            </th>
            <th>
                <bean:message key="label.itemNo" />
            </th>
            <th>
                <bean:message key="label.display" />
            </th>
            <th>
                <bean:message key="label.expLimitTyp" />
            </th>
            <th>
                <bean:message key="label.dngrItemFlg" />
            </th>
            <th>
                <bean:message key="label.hsCd" />
            </th>
            <th>
                <bean:message key="label.cigmaPrdctFlg" />
            </th>
        </tr>
        <tr>
            <td>
                <html:text property="w9018CriteriaDomain.compCd" maxlength="5" styleClass="comp_cd" errorStyleClass="comp_cd gscm_error_class" />
            </td>
            <td>
                <html:text property="w9018CriteriaDomain.itemNo" maxlength="27" styleClass="w9018_item_no" errorStyleClass="w9018_item_no gscm_error_class" />
            </td>
            <td>
                <html:select property="w9018CriteriaDomain.display" styleClass="displayDiv">
                    <html:options collection="display" property="id" labelProperty="name"/>
                </html:select>
            </td>
            <td>
                <html:select property="w9018CriteriaDomain.expLimitTyp" styleId="exp_limit_typ" styleClass="exp_limit_typ" errorStyleClass="exp_limit_typ gscm_error_class" >
                    <html:options collection="expRegulationType" property="id" labelProperty="name"/>
                </html:select>
            </td>
            <td>
                <html:select property="w9018CriteriaDomain.dngrItemFlg" styleClass="dngr_item_flg" errorStyleClass="dngr_item_flg gscm_error_class" >
                    <html:options collection="dngrItemFlg" property="id" labelProperty="name"/>
                </html:select>
            </td>
            <td>
                <html:text property="w9018CriteriaDomain.hsCd" maxlength="12" styleClass="hs_cd" errorStyleClass="hs_cd gscm_error_class" />
            </td>
            <td>
                <html:select property="w9018CriteriaDomain.cigmaPrdctFlg" styleClass="cigma_prdct_flg" errorStyleClass="cigma_prdct_flg gscm_error_class" >
                    <html:options collection="cigmaPrdctFlg" property="id" labelProperty="name"/>
                </html:select>
            </td>
        </tr>
    </table>
    <%--
    -- buttons 1
    --%>
    <table class="gscm_search_button">
        <colgroup>
            <col class="gscm_search_button_add" />
            <col class="gscm_search_button_search" />
        </colgroup>
        <tr>
            <td>
                <html:button property="add" onclick="gscm.commonSubmit('W9018Add.do', this.form);">
                    <bean:message key="button.add" />
                </html:button>
            </td>
            <td class="right">
                <html:button property="search" onclick="gscm.commonSubmit('W9018Search.do', this.form);">
                    <bean:message key="button.search" />
                </html:button>
            </td>
        </tr>
    </table>
    <hr />
    <logic:notEmpty name="W9018Form" property="listDomainList">
        <%--
        -- buttons 2
        --%>
        <table class="gscm_resultlist_button">
            <colgroup>
                <col />
            </colgroup>
            <tr>
                <td>
                    <html:button property="editRefer" onclick="gscm.commonSubmit('W9018EditOrRefer.do', this.form);">
                        <bean:message key="button.editRefer" />
                    </html:button>
                    <html:button property="clone" onclick="gscm.commonSubmit('W9018Clone.do', this.form);">
                        <bean:message key="button.clone" />
                    </html:button>
                    <bean:define id="deleteConfirmMessage"><bean:message key="GSCM-I0-0005" locale="${locale_key}" /></bean:define>
                    <html:button property="delete" onclick="gscm.submitConfirm('W9018Delete.do', this.form, '${deleteConfirmMessage}');">
                        <bean:message key="button.delete" />
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
        <table id="tablefix" class="gscm_resultlist">
            <colgroup>
                <col class="resultlist_ck" />
                <col class="resultlist_comp_cd" />
                <col class="resultlist_item_no" />
                <col class="resultlist_apply_strt_dt" />
                <col class="resultlist_exp_limit_typ" />
                <col class="resultlist_dngr_item_flg" />
                <col class="resultlist_hs_cd" />
                <col class="resultlist_cigma_prdct_flg" />
            </colgroup>
            <thead>
                <tr>
                    <th>
                        <bean:message key="label.ck" />
                    </th>
                    <th>
                        <bean:message key="label.compCd" />
                    </th>
                    <th>
                        <bean:message key="label.itemNo" />
                    </th>
                    <th>
                        <bean:message key="label.aplyStrtDt" />
                    </th>
                    <th>
                        <bean:message key="label.expLimitTyp" />
                    </th>
                    <th>
                        <bean:message key="label.dngrItemFlg" />
                    </th>
                    <th>
                        <bean:message key="label.hsCd" />
                    </th>
                    <th>
                        <bean:message key="label.cigmaPrdctFlg" />
                    </th>
                </tr>
            </thead>
            <tbody>
                <logic:iterate name="W9018Form" property="listDomainList" id="listDomainList" indexId="idx">
                    <ai:stripeline number="${idx + 1}" odd="gscm_odd" even="gscm_even">
                        <tr>
                            <td class="center">
                                <html:radio property="w9018CriteriaDomain.selected" value="${idx}"/>
                            </td>
                            <td>
                                <html:text name="listDomainList" property="compCd" styleClass="w9018_comp_cd gscm_disptext" errorStyleClass="w9018_comp_cd gscm_disptext gscm_error_class" indexed="true" readonly="true" />
                            </td>
                            <td>
                                <html:text name="listDomainList" property="itemNo" styleClass="w9018_resultlist_item_no gscm_disptext" errorStyleClass="w9018_resultlist_item_no gscm_disptext gscm_error_class" indexed="true" readonly="true" />
                            </td>
                            <td>
                                <html:text name="listDomainList" property="aplyStrtDt" styleClass="aply_strt_dt gscm_disptext" indexed="true" readonly="true" />
                            </td>
                            <td>
                                <bean:write name="listDomainList" property="expLimitTyp" />
                            </td>
                            <td>
                                <bean:write name="listDomainList" property="dngrItemFlg" />
                            </td>
                            <td>
                                <bean:write name="listDomainList" property="hsCd" />
                            </td>
                            <td>
                                <bean:write name="listDomainList" property="cigmaPrdctFlg" />
                            </td>
                            <html:hidden name="listDomainList" property="comUpdateTimestamp" indexed="true" />
                        </tr>
                    </ai:stripeline>
                </logic:iterate>
            </tbody>
        </table>
    </logic:notEmpty>
    <%--
    -- hidden
    --%>
    <html:hidden property="callScreenId" />
    <html:hidden property="w9018CriteriaDomain.disabledAdd" />
    <logic:notEmpty name="W9018Form" property="w9018CriteriaDomain.comUpdateTimestamp">
        <html:hidden property="w9018CriteriaDomain.comUpdateTimestamp" />
    </logic:notEmpty>
</html:form>
