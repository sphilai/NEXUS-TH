<%--
 * W3007.jsp
 * 
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 --%>
<html:form action="/W3007Search" styleId="mainForm">
    <%--
    -- search condition 1
    --%>
    <table class="gscm_search">
        <colgroup>
            <col class="search_fr_wh_comp_cd" />
            <col class="search_fr_wh_cd" />
            <col class="search_to_wh_comp_cd" />
            <col class="search_to_wh_cd" />
            <col class="search_shipper_cd" />
            <col class="search_item_no" />
            <col class="search_pkg" />
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
                <bean:message key="label.itemNo" />
            </th>
            <th>
                <bean:message key="label.pkgCd" />
            </th>
        </tr>
        <tr>
            <td>
                <html:text property="criteriaDomain.carryOutCompCd"
                styleClass="gscm_disptext wh_comp_cd" readonly="true"
                errorStyleClass="wh_comp_cd gscm_error_class" indexed="false" />
            </td>
            <td>
                <html:text property="criteriaDomain.carryOutWhCd"
                styleClass="gscm_disptext wh_cd" readonly="true"
                errorStyleClass="wh_cd gscm_error_class" indexed="false" />
            </td>
            <td>
                <html:text property="criteriaDomain.carryInCompCd"
                styleClass="gscm_disptext wh_comp_cd" readonly="true"
                errorStyleClass="wh_comp_cd gscm_error_class" indexed="false" />
            </td>
            <td>
                <html:text property="criteriaDomain.carryInWhCd"
                styleClass="gscm_disptext wh_cd" readonly="true"
                errorStyleClass="wh_cd gscm_error_class" indexed="false" />
            </td>
            <td>
                <html:text property="criteriaDomain.shipperCd"
                styleClass="gscm_disptext shipper_cd" readonly="true"
                errorStyleClass="shipper_cd gscm_error_class" indexed="false" />
            </td>
            <td>
                <html:text property="criteriaDomain.itemNo" maxlength="27"
                styleClass="item_no" errorStyleClass="item_no gscm_error_class"
                indexed="false" />
            </td>
            <td>
                <html:text property="criteriaDomain.pkgCd" maxlength="3"
                styleClass="gscm_disabledColor pkg_cd" errorStyleClass="pkg_cd gscm_error_class"
                indexed="false" value=" " readonly="true"/>
            </td>
        </tr>
    </table>
    <table class="gscm_search_button">
        <colgroup>
            <col width="80%" />
            <col />
        </colgroup>
        <tr>
            <td>
                <html:button property="moveToRegisterTR"
                onclick="gscm.commonSubmit('W3007MoveToRegisterTr.do', this.form);"
                styleClass="move_to_register_tr">
                    <bean:message key="button.moveToRegister" />
                </html:button>

                <bean:define id="backToMainMessage">
                    <bean:message key="NXS-I1-0330" />
                </bean:define>
                <html:button property="moveToCarryOutMainMenu"
                onclick="gscm.submitBack('W3001Init.do', this.form);"
                styleClass="move_to_carry_out_main_menu">
                    <bean:message key="button.backToMainScreen" />
                </html:button>

                <bean:define id="backToHeadMessage">
                    <bean:message key="NXS-I1-0330" />
                </bean:define>
                <html:button property="backToHeader"
                onclick="gscm.submitBack('W3002Init.do', this.form);"
                styleClass="back_to_header">
                    <bean:message key="button.backToHeader" />
                </html:button>
            </td>
            <td class="right">
                <html:button property="search"
                onclick="gscm.submitSearch('W3007Search.do', this.form,'');"
                styleClass="search">
                    <bean:message key="button.search" />
                </html:button>
            </td>
        </tr>
    </table>
    <hr />
    <c:if test="${W3007Form.displayList}">
        <logic:notEmpty name="W3007Form" property="listDomainList">
            <%--
            -- 
            --%>
            <%--
            -- page control & buttons 2
            --%>
            <table class="gscm_resultlist_button">
                <tr>
                    <td>
                        <bean:define id="updateConfirmMessage">
                            <bean:message key="GSCM-I0-0004" />
                        </bean:define>
                         <html:button property="update"
                        onclick="gscm.submitConfirm('W3007Update.do', this.form,'${updateConfirmMessage}');"
                        styleClass="update">
                            <bean:message key="button.update" />
                        </html:button>
                    </td>
                    <td>
                    </td>
                </tr>
            </table>
            <table class="gscm_resultlist_button">
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
                    <col class="resultlist_plant" />
                    <col class="resultlist_parts_no" />
                    <col class="resultlist_pkg_cd" />
                    <col class="resultlist_act_qty" />
                    <col class="resultlist_act_tag_qty" />
                    <col class="resultlist_soh" />
                    <col class="resultlist_ship_lot" />
                    <col class="resultlist_box_no" />
                    <col class="resultlist_transferable_qty" />
                    <col class="resultlist_cust_no" />
                    <col class="resultlist_ship_to" />
                </colgroup>
                <thead>
                    <tr>
                        <th>
                            <bean:message key="label.ck" />
                            <input type="checkbox" name="checkAll"
                            onclick="allcheckW3('listDomainList', 'selected', this.checked, '')" />
                        </th>
                        <th>
                            <bean:message key="label.plantCd" />
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
                            <bean:message key="label.shippingLot" />
                        </th>
                        <th>
                            <bean:message key="label.boxNo" />
                        </th>
                        <th>
                            <bean:message key="label.transferAbleQty" />
                        </th>
                        <th>
                            <bean:message key="label.custNo" />
                        </th>
                        <th>
                            <bean:message key="label.shipTo" />
                        </th>
                    </tr>
                </thead>
                <tbody>
                    <logic:iterate name="W3007Form" property="listDomainList"
                        id="listDomainList" indexId="idx">
                        <ai:stripeline number="${idx + 1}" odd="gscm_odd" even="gscm_even">
                                <tr>
                                    <td class="center">
                                     <c:if test="${listDomainList.chk == 'N'}">
                                        <html:checkbox name="listDomainList" property="selected"
                                        indexed="true" disabled="false" />
                                      </c:if> 
                                      <c:if test="${listDomainList.chk != 'N'}">
                                        <html:checkbox name="listDomainList" property="selected"  
                                        indexed="true" disabled="true"  />
                                       </c:if>
                                    </td>
                                    <td>
                                        <bean:write name="listDomainList" property="plantCd" />
                                    </td>
                                    <td>
                                        <bean:write name="listDomainList" property="itemNo" />
                                    </td>
                                    <td>
                                        <bean:write name="listDomainList" property="pkgCd" />
                                    </td>
                                    <td>
                                       <c:if test="${listDomainList.chk == 'N'}">
                                        <html:text name="listDomainList" property="actQty" style="text-align:right"
                                        maxlength="7" styleClass="act_qty"
                                        errorStyleClass="act_qty gscm_error_class" indexed="true" disabled="false" />
                                      </c:if> 
                                      <c:if test="${listDomainList.chk != 'N'}">
                                       <html:text name="listDomainList" property="actQty" style="text-align:right"
                                        maxlength="7" styleClass="act_qty"
                                        errorStyleClass="act_qty gscm_error_class" indexed="true" disabled="true" />
                                       </c:if>
                                    </td>
                                    <td>
                                     <c:if test="${listDomainList.chk == 'N'}">
                                      <html:text name="listDomainList" property="actTagQty"
                                        style="text-align:right" maxlength="3" styleClass="act_tag_qty"
                                        errorStyleClass="act_tag_qty gscm_error_class" indexed="true" disabled="false" />
                                      </c:if> 
                                      <c:if test="${listDomainList.chk != 'N'}">
                                      <html:text name="listDomainList" property="actTagQty"
                                        style="text-align:right" maxlength="3" styleClass="act_tag_qty"
                                        errorStyleClass="act_tag_qty gscm_error_class" indexed="true" disabled="true" />
                                       </c:if>
                                    </td>
                                    <td class="right">
                                        <bean:write name="listDomainList" property="onHandQty" />
                                    </td>
                                    <td class="right">
                                        <bean:write name="listDomainList" property="shipLot" />
                                    </td>
                                    <td class="right">
                                        <bean:write name="listDomainList" property="boxNo" />
                                    </td>
                                    <td class="right">
                                        <bean:write name="listDomainList" property="transQty" />
                                    </td>
                                    <td class="left">
                                        <bean:write name="listDomainList" property="customerCd" />
                                    </td>
                                    <td class="left">
                                        <bean:write name="listDomainList" property="shipTo" />
                                    </td>
                                    <html:hidden name="listDomainList" property="plantCd" indexed="true" />
                                    <html:hidden name="listDomainList" property="itemNo" indexed="true" />
                                    <html:hidden name="listDomainList" property="pkgCd" indexed="true" />
                                    <html:hidden name="listDomainList" property="shipLot" indexed="true" />
                                    <html:hidden name="listDomainList" property="boxNo" indexed="true" />
                                    <html:hidden name="listDomainList" property="transQty" indexed="true" />
                                    <html:hidden name="listDomainList" property="customerCd" indexed="true" />
                                    <html:hidden name="listDomainList" property="shipTo" indexed="true" />
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
</html:form>