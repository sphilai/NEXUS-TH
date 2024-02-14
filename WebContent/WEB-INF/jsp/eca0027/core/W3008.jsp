<%--
 * W3008.jsp
 * 
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 --%>
<c:set var="printTrAction" scope="request">
    <html:rewrite action="/W3008PrintTr"></html:rewrite>
</c:set>
<html:form action="/W3008Init" styleId="mainForm">
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
                styleClass="gscm_disptext search_wh_comp_cd" readonly="true"
                errorStyleClass="wh_comp_cd gscm_error_class" indexed="false" />
            </td>
            <td>
                <html:text property="criteriaDomain.carryOutWhCd"
                styleClass="gscm_disptext search_wh_cd" readonly="true"
                errorStyleClass="wh_cd gscm_error_class" indexed="false" />
            </td>
            <td>
                <html:text property="criteriaDomain.carryInCompCd"
                styleClass="gscm_disptext search_wh_comp_cd" readonly="true"
                errorStyleClass="wh_comp_cd gscm_error_class" indexed="false" />
            </td>
            <td>
                <html:text property="criteriaDomain.carryInWhCd"
                styleClass="gscm_disptext search_wh_cd" readonly="true"
                errorStyleClass="wh_cd gscm_error_class" indexed="false" />
            </td>
            <td>
                <html:text property="criteriaDomain.shipperCd"
                styleClass="gscm_disptext search_shipper_cd" readonly="true"
                errorStyleClass="shipper_cd gscm_error_class" indexed="false" />
            </td>
            <td>
                <html:text property="criteriaDomain.totalTags"
                styleClass="gscm_disptext search_total_tag right" readonly="true"
                errorStyleClass="search_total_tag gscm_error_class" indexed="false" />
            </td>
            <td>
                <html:text property="criteriaDomain.trIssuerNm"
                styleClass="gscm_disptext search_issuer" readonly="true"
                errorStyleClass="search_issuer gscm_error_class" indexed="false" />
            </td>
            <td>
                <html:text property="criteriaDomain.trIssueDt"
                styleClass="gscm_disptext search_issue_dt" readonly="true"
                errorStyleClass="search_issue_dt gscm_error_class" indexed="false" />
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
                <html:text property="criteriaDomain.editCnt"
                styleClass="gscm_disptext search_editflg" readonly="true"
                errorStyleClass="search_editflg gscm_error_class" indexed="false" />
            </td>
            <td>
                <html:text property="criteriaDomain.trStatus"
                styleClass="gscm_disptext search_trnsfer_status" readonly="true"
                errorStyleClass="search_trnsfer_status gscm_error_class"
                indexed="false" />
            </td>
            <td>
                <html:text property="criteriaDomain.trItemTyp"
                styleClass="gscm_disptext search_tr_kind" readonly="true"
                errorStyleClass="search_tr_kind gscm_error_class" indexed="false" />
            </td>
            <td>
                <html:text property="criteriaDomain.trActvMethTyp"
                styleClass="gscm_disptext search_act_method" readonly="true"
                errorStyleClass="search_act_method gscm_error_class" indexed="false" />
            </td>
            <td>
                <html:text property="criteriaDomain.trActvDt"
                styleClass="gscm_disptext search_act_dt" readonly="true"
                errorStyleClass="search_act_dt gscm_error_class" indexed="false" />
            </td>
            <td>
                <html:text property="criteriaDomain.trNo"
                styleClass="gscm_disptext search_transfer_no" readonly="true"
                errorStyleClass="search_transfer_no gscm_error_class"
                indexed="false" />
             </td>
            <html:hidden property="criteriaDomain.gamenId" />
            <html:hidden property="criteriaDomain.editFlg" />
            <html:hidden property="criteriaDomain.transferFlg" />
        </tr>
    </table>
    <table class="gscm_search_button">
        <tr>
            <td>
                <html:button property="backToCreate"
                onclick="gscm.submitBack('W3007Init.do', this.form);"
                styleClass="back_to_create">
                    <bean:message key="button.backToCreate" />
                </html:button>
                <html:button property="backToMain"
                onclick="gscm.submitBack('W3001Init.do', this.form, '');"
                styleClass="back_to_main">
                    <bean:message key="button.backToMainScreen" />
                </html:button>
            </td>
        </tr>
    </table>
    <hr />

    <c:if test="${W3008Form.displayList}">
        <table class="gscm_resultlist_button">
            <tr>
                <td>
                    <bean:define id="deleteConfirmMessage">
                        <bean:message key="GSCM-I0-0005" />
                    </bean:define>
                    <html:button property="delete"
                    onclick="gscm.submitConfirm('W3008Delete.do', this.form, '${deleteConfirmMessage}');"
                    styleClass="delete">
                        <bean:message key="button.delete" />
                    </html:button>
                    <bean:define id="registerConfirmMessage">
                        <bean:message key="GSCM-I0-0003" />
                    </bean:define>
                    <html:button property="register"
                    onclick="gscm.submitConfirm('W3008Register.do', this.form, '${registerConfirmMessage}');"
                    styleClass="register">
                        <bean:message key="button.register" />
                    </html:button>
                    <bean:define id="editRegisterConfirmMessage">
                        <bean:message key="GSCM-I0-0003" />
                    </bean:define>
                    <html:button property="edit"
                    onclick="gscm.submitConfirm('W3008EditRegister.do', this.form, '${editRegisterConfirmMessage}');"
                    styleClass="edit_register">
                        <bean:message key="button.editRegister" />
                    </html:button>
                    <html:button property="printTr"
                    onclick="gscm.commonSubmitForCheck('${printTrAction}', this.form, 'false', 'false');"
                    styleClass="print_instr">
                        <bean:message key="button.printTr" />
                    </html:button>
                    <bean:define id="cancelTRConfirmMessage">
                        <bean:message key="NXS-I1-0009" />
                    </bean:define>
                    <html:button property="cancelTR"
                    onclick="gscm.submitConfirm('W3008CancelTr.do', this.form, '${cancelTRConfirmMessage}');"
                    styleClass="cancel_tr">
                        <bean:message key="button.cancelTr" />
                    </html:button>
                </td>
            </tr>
        </table>
    </c:if>

    <%--
    -- 
    --%>
    <%--
    -- page control & buttons 2
    --%>
    <%--
    -- search results
    --%>
    <c:if test="${!W3008Form.tableFlg}">
        <c:if test="${W3008Form.displayList}">
            <logic:notEmpty name="W3008Form" property="listDomainList">
                <table id="tablefix" class="gscm_resultlist">
                    <colgroup>
                        <col class="resultlist_del" />
                        <col class="resultlist_pno" />
                        <col class="resultlist_pkg_cd" />
                        <col class="resultlist_act_qty" />
                        <col class="resultlist_act_tag_no" />
                        <col class="resultlist_soh" />
                        <col class="resultlist_trans_qty" />
                        <col class="resultlist_edit_trans_qty" />
                        <col class="resultlist_edit_tag_qty" />
                    </colgroup>
                    <thead>
                        <tr>
                            <th>
                                <bean:message key="label.delete" />
                                <input type="checkbox" name="checkAll"
                                onclick="allcheckW3('listDomainList', 'selected', this.checked, '')" />
                            </th>
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
                            <th>
                                <bean:message key="label.onHandQty" />
                            </th>
                            <th>
                                <bean:message key="label.transferAbleQty" />
                            </th>
                            <th>
                                <bean:message key="label.editTransQty" />
                            </th>
                            <th>
                                <bean:message key="label.editTagQty" />
                            </th>
                        </tr>
                    </thead>
                    <tbody>
                        <logic:iterate name="W3008Form" property="listDomainList"
                            id="listDomainList" indexId="idx">
                            <ai:stripeline number="${idx + 1}" odd="gscm_odd" even="gscm_even">
                                <tr>
                                    <td class="center">
                                        <html:checkbox name="listDomainList" property="selected"
                                            indexed="true" disabled="false" />
                                    </td>
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
                                    <td class="right">
                                        <bean:write name="listDomainList" property="soh" />
                                    </td>
                                    <td class="right">
                                        <bean:write name="listDomainList" property="transQty" />
                                    </td>
                                    <td class="right">
                                        <html:text name="listDomainList"
                                        property="editTransQty" maxlength="8"
                                        styleClass="trans_qty right"
                                        errorStyleClass="trans_qty gscm_error_class" indexed="true" />
                                    </td>
                                    <td>
                                        <html:text name="listDomainList" property="editTagQty"
                                        maxlength="3" styleClass="tag_qty right"
                                        errorStyleClass="tag_qty gscm_error_class" indexed="true" />
                                    </td>
                                    <html:hidden name="listDomainList" property="itemNo"
                                        indexed="true" />
                                    <html:hidden name="listDomainList" property="pkgCd"
                                        indexed="true" />
                                    <html:hidden name="listDomainList" property="actQty"
                                        indexed="true" />
                                    <html:hidden name="listDomainList" property="actTagQty"
                                        indexed="true" />
                                    <html:hidden name="listDomainList" property="soh"
                                        indexed="true" />
                                    <html:hidden name="listDomainList" property="transQty"
                                        indexed="true" />
                                    <html:hidden name="listDomainList" property="plantCd"
                                        indexed="true" />
                                </tr>
                            </ai:stripeline>
                        </logic:iterate>
                    </tbody>
                </table>
            </logic:notEmpty>
        </c:if>
    </c:if>
    <%--
    -- 
    --%>
    <%--
    -- page control & buttons 2
    --%>
    <%--
    -- search results
    --%>
    <c:if test="${W3008Form.tableFlg}">
        <c:if test="${W3008Form.displayList}">
            <logic:notEmpty name="W3008Form" property="listDomainList">
                <table id="tablefix" class="gscm_resultlist2">
                    <colgroup>
                        <col class="resultlist_del" />
                        <col class="resultlist_pno" />
                        <col class="resultlist_pkg_cd" />
                        <col class="resultlist_act_qty" />
                        <col class="resultlist_act_tag_no" />
                    </colgroup>
                    <thead>
                        <tr>
                            <th>
                                <bean:message key="label.delete" />
                                <input type="checkbox" name="checkAll"
                                onclick="allcheck('listDomainList', 'selected', this.checked, '')" />
                            </th>
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
                        <logic:iterate name="W3008Form" property="listDomainList"
                            id="listDomainList" indexId="idx">
                            <ai:stripeline number="${idx + 1}" odd="gscm_odd" even="gscm_even">
                                <tr>
                                    <td class="center">
                                        <html:checkbox name="listDomainList" property="selected"
                                            indexed="true" disabled="true" />
                                    </td>
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
                                    <html:hidden name="listDomainList" property="actQty"
                                        indexed="true" />
                                    <html:hidden name="listDomainList" property="actTagQty"
                                        indexed="true" />
                                    <html:hidden name="listDomainList" property="plantCd"
                                        indexed="true" />
                                </tr>
                            </ai:stripeline>
                        </logic:iterate>
                    </tbody>
                </table>
            </logic:notEmpty>
        </c:if>
    </c:if>
    
    <%--
    -- hidden
    --%>
    <html:hidden property="callScreenId" />
</html:form>