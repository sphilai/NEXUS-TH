<%--
 * W3006.jsp
 * 
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 --%>
<c:set var="printTrAction" scope="request">
    <html:rewrite action="/W3006PrintTr"></html:rewrite>
</c:set>
<html:form action="/W3006Init" styleId="mainForm">
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
            <col class="search_total_cml">
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
                <bean:message key="label.totalCml" />
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
                styleClass="gscm_disptext search_wh_comp_cd" readonly="true" />
            </td>
            <td>
                <html:text property="criteriaDomain.carryOutWhCd"
                styleClass="gscm_disptext search_wh_cd" readonly="true" />
            </td>
            <td>
                <html:text property="criteriaDomain.carryInCompCd"
                styleClass="gscm_disptext search_wh_comp_cd" readonly="true" />
            </td>
            <td>
                <html:text property="criteriaDomain.carryInWhCd"
                styleClass="gscm_disptext search_wh_cd" readonly="true" />
            </td>
            <td>
                <html:text property="criteriaDomain.shipperCd"
                styleClass="gscm_disptext search_shipper_cd" readonly="true" />
            </td>
            <td>
                <html:text property="criteriaDomain.totalCml"
                styleClass="gscm_disptext search_total_cml right" readonly="true" />
            </td>
            <td>
                <html:text property="criteriaDomain.trIssuerNm"
                styleClass="gscm_disptext search_issuer" readonly="true" />
            </td>
            <td>
                <html:text property="criteriaDomain.trIssueDt"
                styleClass="gscm_disptext search_issue_dt" readonly="true" />
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
                <bean:message key="label.trNo" />
            </th>
        </tr>
        <tr>
            <td>
                <html:text property="criteriaDomain.editCnt" styleClass="gscm_disptext search_editflg" readonly="true" />
            </td>
            <td>
                <html:text property="criteriaDomain.trStatus" styleClass="gscm_disptext search_trnsfer_status" readonly="true" />
            </td>
            <td>
                <html:text property="criteriaDomain.trItemTyp" styleClass="gscm_disptext search_tr_kind" readonly="true" />
            </td>
            <td>
                <c:if test="${W3006Form.criteriaDomain.sqlInitCheck == true}">
                    <c:if test="${W3006Form.criteriaDomain.sessionFlg == true}">
                        <c:if test="${W3006Form.criteriaDomain.trStatus == '30'}">
                            <html:text property="criteriaDomain.trActvMethTyp" styleClass="gscm_disptext search_act_method" readonly="true" />
                        </c:if>
                    </c:if>
                    <c:if test="${W3006Form.criteriaDomain.sessionFlg == false}">    
                        <html:text property="criteriaDomain.trActvMethTyp" styleClass="gscm_disptext search_act_method" readonly="true" />
                    </c:if>
                </c:if>
                <c:if test="${W3006Form.criteriaDomain.sqlInitCheck == false}">
                    <html:text property="criteriaDomain.trActvMethTyp" styleClass="gscm_disptext search_act_method" readonly="true" />
                </c:if>
            </td>
            <td>
                <c:if test="${W3006Form.criteriaDomain.sqlInitCheck == true}">
                    <c:if test="${W3006Form.criteriaDomain.sessionFlg == true}">
                        <c:if test="${W3006Form.criteriaDomain.trStatus == '30'}">
                            <html:text property="criteriaDomain.trActvDt" styleClass="gscm_disptext search_act_dt" readonly="true" />
                        </c:if>
                    </c:if>
                    <c:if test="${W3006Form.criteriaDomain.sessionFlg == false}">
                        <html:text property="criteriaDomain.trActvDt" styleClass="gscm_disptext search_act_dt" readonly="true" />
                    </c:if>
                </c:if>
                <c:if test="${W3006Form.criteriaDomain.sqlInitCheck == false}">
                    <html:text property="criteriaDomain.trActvDt" styleClass="gscm_disptext search_act_dt" readonly="true" />
                </c:if>
            </td>
            <td>
                <html:text property="criteriaDomain.trNo" styleClass="gscm_disptext search_transfer_no" readonly="true" />
            </td>
        </tr>
    </table>
    <br />
    <table class="gscm_search_button">
        <tr>
            <td>
                <html:button property="backToCreate"
                onclick="gscm.submitBack('W3005Init.do', this.form);"
                styleClass="back_to_create">
                    <bean:message key="button.backToCreate" />
                </html:button>
                <html:button property="backToMain"
                onclick="gscm.submitBack('W3001Init.do', this.form);"
                styleClass="back_to_main">
                    <bean:message key="button.backToMainScreen" />
                </html:button>
            </td>
        </tr>
    </table>
    <hr />
    <c:if test="${W3006Form.displayList}">
        <logic:notEmpty name="W3006Form" property="listDomainList">
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
                <tr>
                    <td>
                        <html:button property="delete"
                        onclick="gscm.commonSubmit('W3006Delete.do', this.form);"
                        styleClass="delete">
                            <bean:message key="button.delete" />
                        </html:button>
                        <bean:define id="registerConfirmMessage">
                            <bean:message key="GSCM-I0-0003" />
                        </bean:define>
                        <html:button property="register"
                        onclick="gscm.submitConfirm('W3006Register.do', this.form,'${registerConfirmMessage}');"
                        styleClass="register">
                            <bean:message key="button.register" />
                        </html:button>
                        <bean:define id="editConfirmMessage">
                            <bean:message key="GSCM-I0-0003" />
                        </bean:define>
                        <html:button property="edit"
                        onclick="gscm.submitConfirm('W3006EditRegister.do', this.form,'${editConfirmMessage}');"
                        styleClass="edit_register">
                            <bean:message key="button.editRegister" />
                        </html:button>
                    <html:button property="printTr" onclick="gscm.commonSubmitForCheck('${printTrAction}', this.form, 'false', 'false');" styleClass="print_instr">
                        <bean:message key="button.printTr" />
                    </html:button>
                        <bean:define id="cancelConfirmMessage">
                            <bean:message key="NXS-I1-0009" />
                        </bean:define>
                        <html:button property="cancelTR"
                        onclick="gscm.submitConfirm('W3006CancelTr.do', this.form,'${cancelConfirmMessage}');"
                        styleClass="cancel_tr">
                            <bean:message key="button.cancelTr" />
                        </html:button>
                    </td>
                </tr>
            </table>
            <table id="tablefix" class="gscm_resultlist">
                <colgroup>
                    <col class="resultlist_del" />
                    <col class="resultlist_main_mark" />
                    <col class="resultlist_cml_type" />
                    <col class="resultlist_trans" />
                    <col class="resultlist_cont_sort_cd" />
                    <col class="resultlist_g_w" />
                    <col class="resultlist_cml_issue_date" />
                    <col class="resultlist_export_request_no" />
                </colgroup>
                <thead>
                    <tr>
                        <th>
                            <bean:message key="label.delete" />
                            <input type="checkbox" name="checkAll"
                            onclick="allcheckW3('listDomainList', 'selected', this.checked, '')" />
                        </th>
                        <th>
                            <bean:message key="label.cmlNo" />
                        </th>
                        <th>
                            <bean:message key="label.cmlType" />
                        </th>
                        <th>
                            <bean:message key="label.trnsCd" />
                        </th>
                        <th>
                            <bean:message key="label.contSortKey" />
                        </th>
                        <th>
                            <bean:message key="label.grossWeight" /><br />
                        (<bean:write name="W3006Form" property="criteriaDomain.weightUnitDisp" />)
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
                    <logic:iterate name="W3006Form" property="listDomainList"
                        id="listDomainList" indexId="idx">
                        <ai:stripeline number="${idx + 1}" odd="gscm_odd" even="gscm_even">
                            <tr>
                                <td class="center">
                                    <c:if test="${W3006Form.criteriaDomain.sqlInitCheck == true}">
                                        <c:if test="${W3006Form.criteriaDomain.sessionFlg == true}">
                                            <html:checkbox name="listDomainList" property="selected"
                                            indexed="true" disabled="true" />
                                        </c:if>
                                        <c:if test="${W3006Form.criteriaDomain.sessionFlg == false}">
                                            <html:checkbox name="listDomainList" property="selected"
                                            indexed="true" disabled="false" />
                                        </c:if>
                                    </c:if>
                                    <c:if test="${W3006Form.criteriaDomain.sqlInitCheck == false}">
                                        <html:checkbox name="listDomainList" property="selected"
                                        indexed="true" disabled="false" />
                                    </c:if>
                                </td>
                                <td>
                                    <bean:write name="listDomainList" property="mainMark" />
                                </td>
                                <td>
                                    <bean:write name="listDomainList" property="cmlTyp" />
                                </td>
                                <td>
                                    <bean:write name="listDomainList" property="trnsCd" />
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
                                <!-- Remove Hidden Parameter support ST053-->
                                <%-- <html:hidden name="listDomainList" property="mainMark" indexed="true" />
                                <html:hidden name="listDomainList" property="cmlTyp" indexed="true" />
                                <html:hidden name="listDomainList" property="trnsCd" indexed="true" />
                                <html:hidden name="listDomainList" property="containerSortingKey" indexed="true" />
                                <html:hidden name="listDomainList" property="grossWeight" indexed="true" />
                                <html:hidden name="listDomainList" property="expPackingDt" indexed="true" />
                                <html:hidden name="listDomainList" property="expRequestNo" indexed="true" /> --%>
                            </tr>
                        </ai:stripeline>
                    </logic:iterate>
                </tbody>
            </table>
        </logic:notEmpty>
    </c:if>
    <%--
    -- hidden
    --%>
    <html:hidden property="callScreenId" />
    <html:hidden property="criteriaDomain.sqlInitCheck" />
    <html:hidden property="criteriaDomain.sessionFlg" />
</html:form>