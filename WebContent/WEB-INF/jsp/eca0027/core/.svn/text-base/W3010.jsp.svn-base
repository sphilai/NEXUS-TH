<%--
 * W3010.jsp
 * 
 * JSP for Receive CML Transfer Report.
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 --%>
<c:set var="printTrAction" scope="request">
    <html:rewrite action="/W3010PrintTr"></html:rewrite>
</c:set>
<html:form action="/W3010Init" styleId="mainForm">
    <%--
    -- search condition 1
    --%>
    <table class="gscm_search">
        <colgroup>
            <col class="search_carry_out_comp_cd" />
            <col class="search_carry_out_wh_cd" />
            <col class="search_carry_in_comp_cd" />
            <col class="search_carry_in_wh_cd" />
            <col class="search_shipper_cd" />
            <col class="search_cml" />
            <col class="search_to_tr_issuer" />
            <col class="search_tr_issue_dt" />
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
                <bean:message key="label.totalCml" />
            </th>
            <th>
                <bean:message key="label.issuer" />
            </th>
            <th>
                <bean:message key="label.issueDate"/>
            </th>
        </tr>
        <tr>
            <td>
                <html:text property="detailDomain.carryOutCompCd" styleClass="wh_comp_cd gscm_disptext" readonly="true" />
            </td>
            <td>
                <html:text property="detailDomain.carryOutWhCd" styleClass="wh_cd gscm_disptext" readonly="true" />
            </td>
            <td>
                <html:text property="detailDomain.carryInCompCd" styleClass="wh_comp_cd gscm_disptext" readonly="true" />
            </td>
            <td>
                <html:text property="detailDomain.carryInWhCd" styleClass="wh_cd gscm_disptext" readonly="true" />
            </td>
            <td>
                <html:text property="detailDomain.shipperCd" styleClass="shipper_cd gscm_disptext" readonly="true" />
            </td>
            <td>
                <html:text property="detailDomain.totalCml" styleClass="rcv_total_cml gscm_disptext right" readonly="true" />
            </td>
            <td>
                <html:text property="detailDomain.trIssuerNm" styleClass="issuer gscm_disptext" readonly="true" />
            </td>
            <td> 
                <html:text property="detailDomain.trIssueDt" styleClass="rcv_issue_dt gscm_disptext" readonly="true" />
            </td>
        </tr>
    </table>
    <%--
    -- search condition 2
    --%>
    <table class="gscm_search">
        <colgroup>
            <col class="search_editflg" />
            <col class="search_trnsfer_status" />
            <col class="search_tr_kind" />
            <col class="search_activate_method" />
            <col class="search_activate_date" />
            <col class="search_carry_in_method" />
            <col class="search_carry_in_date" />
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
                <html:text property="detailDomain.editCnt" styleClass="editCnt gscm_disptext" readonly="true" />
            </td>
            <td>
                <html:text property="detailDomain.trStatus" styleClass="status gscm_disptext" readonly="true" />
            </td>
            <td>
                <html:text property="detailDomain.trItemTyp" styleClass="trKind gscm_disptext" readonly="true" />
            </td>
            <td>
                <html:text property="detailDomain.trActvMethTyp" styleClass="activateMethod gscm_disptext" readonly="true" />
            </td>
            <td>
                <html:text property="detailDomain.trActvDt" styleClass="activateDate gscm_disptext" readonly="true" />
            </td>
            <td>
                <html:text property="detailDomain.trRcvMethTyp" styleClass="carryInMethod gscm_disptext" readonly="true" />
            </td>
            <td>
                <html:text property="detailDomain.trRcvDt" styleClass="carryInDate gscm_disptext" readonly="true" />
            </td>
            <td>
                <html:text property="detailDomain.trNo" styleClass="trNo gscm_disptext" readonly="true" />
            </td>
        </tr>
    </table>
    <%--
    -- buttons 1
    --%>
    <table class="gscm_search_button">
        <colgroup>
            <col width="8%" />
            <col />
        </colgroup>
        <tr>
            <td class="left">
                <html:button property="backToMain" onclick="gscm.submitBack('W3009Init.do', this.form);" styleClass="back_to_main">
                    <bean:message key="button.backToMainScreen" />
                </html:button>
            </td>
        </tr>
    </table>
    <hr />
    <logic:notEmpty name="W3010Form" property="listDomainList">
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
                <html:button property="receive" onclick="gscm.commonSubmit('W3010Receive.do', this.form);" styleClass="recieve">
                    <bean:message key="button.receive"/>
                </html:button>
                <html:button property="printTr"
                onclick="gscm.commonSubmitForCheck('${printTrAction}', this.form, 'false', 'false');"
                styleClass="printTr">
                    <bean:message key="button.printTr" />
                </html:button>
            </td>
        </tr>
    </table>
    <table id="tablefix" class="gscm_resultlist">
        <colgroup>
                <col class="resultlist_cml_type" />
                <col class="resultlist_trans_cd" />
                <col class="resultlist_main_mark" />
                <col class="resultlist_cont_sort_key" />
                <col class="resultlist_g_w" />
                <col class="resultlist_cml_issue_date" />
                <col class="resultlist_export_request_no" />
        </colgroup>
        <thead>
            <tr>
                <th>
                    <bean:message key="label.cmlType" />
                </th>
                <th>
                    <bean:message key="label.trans" />
                </th>
                <th>
                    <bean:message key="label.cmlNo" />
                </th>
                <th>
                    <bean:message key="label.contSortKey" />
                </th>
                <th>
                    <bean:message key="label.grossWeight" /><br />
                        (<bean:write name="W3010Form" property="criteriaDomain.weightUnitDisp" />)
                </th>
                <th>
                    <bean:message key="label.cmlIssueDate" />
                </th>
                <th>
                    <bean:message key="label.exReqNo" />
                </th>
            </tr>
        </thead>
        <tbody>
            <logic:iterate name="W3010Form" property="listDomainList" id="listDomainList" indexId="idx">
                <ai:stripeline number="${idx + 1}" odd="gscm_odd" even="gscm_even">
                    <tr>
                        <td>
                            <bean:write name="listDomainList" property="cmlTyp" />
                        </td>
                        <td>
                            <bean:write name="listDomainList" property="trnsCd" />
                        </td>
                        <td>
                            <bean:write name="listDomainList" property="mainMark" />
                        </td>
                        <td>
                            <bean:write name="listDomainList" property="containerSortingKey" />
                        </td>
                        <td class="right">
                            <bean:write name="listDomainList" property="grossWeight" />
                        </td>
                        <td>
                            <bean:write name="listDomainList" property="expPackingDt" />
                        </td>
                        <td>
                            <bean:write name="listDomainList" property="expRequestNo" />
                        </td>
                        <html:hidden name="listDomainList" property="trStatus" indexed="true" />
                        <html:hidden name="listDomainList" property="cmlTyp" indexed="true" />
                        <html:hidden name="listDomainList" property="trnsCd" indexed="true" />
                        <html:hidden name="listDomainList" property="mainMark" indexed="true" />
                        <html:hidden name="listDomainList" property="containerSortingKey" indexed="true" />
                        <html:hidden name="listDomainList" property="grossWeight" indexed="true" />
                        <html:hidden name="listDomainList" property="expPackingDt" indexed="true" />
                        <html:hidden name="listDomainList" property="expRequestNo" indexed="true" />
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
