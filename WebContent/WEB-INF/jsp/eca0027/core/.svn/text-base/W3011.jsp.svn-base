<%--
 * W3011.jsp
 * 
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 --%>
<c:set var="printTrAction" scope="request">
    <html:rewrite action="/W3011PrintTr"></html:rewrite>
</c:set>
<html:form action="/W3011Init" styleId="mainForm">
    <%--
    -- search condition 1
    --%>
    <table class="gscm_search">
        <colgroup>
            <col class="search_wh_comp_cd" />
            <col class="search_wh_cd" />
            <col class="search_wh_comp_cd" />
            <col class="search_wh_cd" />
            <col class="search_shipper_cd">
            <col class="search_total_tag">
            <col class="search_issuer">
            <col class="search_issue_dt">
        </colgroup>
        <tr>
            <th>
                <bean:message key="label.fmWhComCd" />
            </th>
            <th>
                <bean:message key="label.fmWhCd" />
            </th>
            <th>
                <bean:message key="label.toWhComCd" />
            </th>
            <th>
                <bean:message key="label.toWhCd" />
            </th>
            <th>
                <bean:message key="label.shipper" />
            </th>
            <th>
                <bean:message key="label.totalTags" />
            </th>
            <th>
                <bean:message key="label.issuer" />
            </th>
            <th>
                <bean:message key="label.issueDate" />
            </th>
        </tr>
        <tr>
            <td>
                <html:text property="criteriaDomain.carryOutCompCd"
                styleClass="gscm_disptext wh_comp_cd"
                errorStyleClass="wh_comp_cd gscm_error_class" indexed="false" readonly="true" />
            </td>
            <td>
                <html:text property="criteriaDomain.carryOutWhCd"
                styleClass="gscm_disptext wh_cd"
                errorStyleClass="wh_cd gscm_error_class" indexed="false" readonly="true" />
            </td>
            <td>
                <html:text property="criteriaDomain.carryInCompCd"
                styleClass="gscm_disptext wh_comp_cd"
                errorStyleClass="wh_comp_cd gscm_error_class" indexed="false" readonly="true" />
            </td>
            <td>
                <html:text property="criteriaDomain.carryInWhCd"
                styleClass="gscm_disptext wh_cd"
                errorStyleClass="wh_cd gscm_error_class" indexed="false" readonly="true" />
            </td>
            <td>
                <html:text property="criteriaDomain.shipperCd"
                styleClass="gscm_disptext shipper_cd"
                errorStyleClass="shipper_cd gscm_error_class" indexed="false" readonly="true" />
            </td>
            <td>
                <html:text property="criteriaDomain.totalTags"
                styleClass="gscm_disptext total_tag right"
                errorStyleClass="total_tag gscm_error_class" indexed="false" readonly="true" />
            </td>
            <td>
                <html:text property="criteriaDomain.trIssuerNm"
                styleClass="gscm_disptext search_issuer"
                errorStyleClass="search_issuer gscm_error_class" readonly="true" />
            </td>
            <td>
                <html:text property="criteriaDomain.trIssueDt"
                styleClass="gscm_disptext search_issue_dt" errorStyleClass="search_issue_dt gscm_error_class" readonly="true" />
            </td>
        </tr>
    </table>
    <table class="gscm_search">
        <colgroup>
            <col class="search_editflg" />
            <col class="search_trnsfer_status" />
            <col class="search_tr_kind" />
            <col class="search_act_method">
            <col class="search_act_dt">
            <col class="search_carry_method">
            <col class="search_carry_dt">
            <col class="search_transfer_no" />
        </colgroup>
        <tr>
            <th>
                <bean:message key="label.editFlg" />
            </th>
            <th>
                <bean:message key="label.trStatus" />
            </th>
            <th>
                <bean:message key="label.trKind" />
            </th>
            <th>
                <bean:message key="label.actMethod" />
            </th>
            <th>
                <bean:message key="label.actDate" />
            </th>
            <th>
                <bean:message key="label.carryInMethod" />
            </th>
            <th>
                <bean:message key="label.lastTrRcvDt" />
            </th>
            <th>
                <bean:message key="label.trNo" />
            </th>
        </tr>
        <tr>
            <td>
                <html:text property="criteriaDomain.editCnt"
                styleClass="gscm_disptext search_editflg"
                errorStyleClass="search_editflg gscm_error_class" indexed="false" readonly="true" />
            </td>
            <td>
                <html:text property="criteriaDomain.trStatus"
                styleClass="gscm_disptext search_trnsfer_status"
                errorStyleClass="search_trnsfer_status gscm_error_class" indexed="false" readonly="true" />
            </td>
            <td>
                <html:text property="criteriaDomain.trItemTyp"
                styleClass="gscm_disptext search_tr_kind"
                errorStyleClass="search_tr_kind gscm_error_class" indexed="false" readonly="true" />
            </td>
            <td>
                <html:text property="criteriaDomain.trActvMethTyp"
                styleClass="gscm_disptext search_act_method"
                errorStyleClass="search_act_method gscm_error_class" indexed="false" readonly="true" />
            </td>
            <td>
                <html:text property="criteriaDomain.trActvDt"
                styleClass="gscm_disptext search_act_dt"
                errorStyleClass="search_act_dt gscm_error_class" indexed="false" readonly="true" />
            </td>
            <td>
                <html:text property="criteriaDomain.trRcvMethTyp"
                styleClass="gscm_disptext search_carry_method"
                errorStyleClass="search_carry_method gscm_error_class" indexed="false" readonly="true" />
            </td>
            <td>
                <html:text property="criteriaDomain.trRcvDt"
                styleClass="gscm_disptext search_carry_dt"
                errorStyleClass="search_carry_dt gscm_error_class" indexed="false" readonly="true" />
            </td>
            <td>
                <html:text property="criteriaDomain.trNo"
                styleClass="gscm_disptext search_transfer_no"
                errorStyleClass="search_transfer_no gscm_error_class" indexed="false" readonly="true" />
            </td>
        </tr>
    </table>
    <br />
    <table class="gscm_search_button">
        <colgroup>
            <col width="8%" />
            <col />
        </colgroup>
        <tr>
            <td class="left">
                <html:button property="backToMain"
                onclick="gscm.submitBack('W3009Init.do', this.form, '');"
                styleClass="back_to_carry_main">
                    <bean:message key="button.backToMainScreen" />
                </html:button>
            </td>
        </tr>
    </table>
    <hr />
    <logic:notEmpty name="W3011Form" property="listDomainList">
        <%--
        -- 
        --%>
        <%--
        -- page control & buttons 2
        --%>
        <%--
        -- search results
        --%>
        <table class="gscm_resultlist_button">
            <colgroup>
                <col width="8%" />
                <col />
            </colgroup>
            <tr>
                <td class="left">
                    <html:button property="receive"
                    onclick="gscm.commonSubmit('W3011Receive.do', this.form);"
                    styleClass="receive">
                        <bean:message key="button.receive" />
                    </html:button>
                    <html:button property="printTr"
                    onclick="gscm.commonSubmitForCheck('${printTrAction}', this.form, 'false', 'false');"
                    styleClass="print_instr">
                        <bean:message key="button.printTr" />
                    </html:button>
                </td>
            </tr>
        </table>
        <table id="tablefix" class="gscm_resultlist">
            <colgroup>
                <col class="resultlist_pno" />
                <col class="resultlist_pkg_cd" />
                <col class="resultlist_act_qty" />
                <col class="resultlist_act_tag_no" />
            </colgroup>
            <thead>
                <tr>
                    <th>
                        <bean:message key="label.itemNo" />
                    </th>
                    <th>
                        <bean:message key="label.pkgCd" />
                    </th>
                    <th>
                        <bean:message key="label.actQty" />
                    </th>
                    <th>
                        <bean:message key="label.actTagQty" />
                    </th>
                </tr>
            </thead>
            <tbody>
                <logic:iterate name="W3011Form" property="listDomainList"
                    id="listDomainList" indexId="idx">
                    <ai:stripeline number="${idx + 1}" odd="gscm_odd" even="gscm_even">
                        <tr>
                            <td>
                                <bean:write name="listDomainList" property="itemNo" />
                            </td>
                            <td>
                                <bean:write name="listDomainList" property="pkgCd" />
                            </td>
                            <td class="right">
                                <bean:write name="listDomainList" property="actQty" />
                            </td>
                            <td class="right">
                                <bean:write name="listDomainList" property="actTagQty" />
                            </td>
                            <html:hidden name="listDomainList" property="itemNo"
                                indexed="true" />
                            <html:hidden name="listDomainList" property="pkgCd"
                                indexed="true" />
                            <html:hidden name="listDomainList" property="actQty"
                                indexed="true" />
                            <html:hidden name="listDomainList" property="actTagQty"
                                indexed="true" />
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
</html:form>