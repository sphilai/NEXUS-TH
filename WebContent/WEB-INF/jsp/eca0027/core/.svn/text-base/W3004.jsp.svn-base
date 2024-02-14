<%--
 * W3004.jsp
 * 
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 --%>
<c:set var="printUpdateAction" scope="request">
    <html:rewrite action="/W3004PrintListForUpdate"></html:rewrite>
</c:set>
<c:set var="printAllAction" scope="request">
    <html:rewrite action="/W3004PrintListForAll"></html:rewrite>
</c:set>
<html:form action="/W3004Search" styleId="mainForm">
    <%--
    -- search condition 1
    --%>
    <table class="gscm_search">
        <colgroup>
            <col class="search_wh_comp_cd" />
            <col class="search_wh_cd" />
            <col class="search_wh_comp_cd" />
            <col class="search_wh_cd" />
            <col class="search_shipper" />
            <col class="search_item_no" />
            <col class="search_pkg_cd" />
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
                styleClass="gscm_disptext wh_comp_cd gscm_required" readonly="true"
                errorStyleClass="wh_comp_cd gscm_error_class" indexed="false" />
            </td>
            <td>
                <html:text property="criteriaDomain.carryOutWhCd"
                styleClass="gscm_disptext wh_cd gscm_required" readonly="true"
                errorStyleClass="wh_cd gscm_error_class" indexed="false" />
            </td>
            <td>
                <html:text property="criteriaDomain.carryInCompCd"
                styleClass="gscm_disptext wh_comp_cd gscm_required" readonly="true"
                errorStyleClass="wh_comp_cd gscm_error_class" indexed="false" />
            </td>
            <td>
                <html:text property="criteriaDomain.carryInWhCd"
                styleClass="gscm_disptext wh_cd gscm_required" readonly="true"
                errorStyleClass="wh_cd gscm_error_class" indexed="false" />
            </td>
            <td>
                <html:text property="criteriaDomain.shipperCd"
                styleClass="gscm_disptext shipper_cd gscm_required" readonly="true"
                errorStyleClass="shipper_cd gscm_error_class" indexed="false" />
            </td>
            <td>
                <html:text property="criteriaDomain.itemNo" maxlength="27"
                styleClass="item_no" errorStyleClass="item_no gscm_error_class" />
            </td>
            <td>
                <html:text property="criteriaDomain.pkgCd" maxlength="3"
                styleClass="pkg_cd gscm_disabledColor" errorStyleClass="pkg_cd gscm_error_class"
                value=" " readonly="true" />
            </td>
        </tr>
    </table>
    <br />
    <table class="gscm_search_button">
        <colgroup>
            <col width="80%" />
            <col />
        </colgroup>
        <tr>
            <td>
                <html:button property="backToMain"
                onclick="gscm.submitBack('W3001Init.do', this.form);"
                styleClass="back_to_main">
                    <bean:message key="button.backToMainScreen" />
                </html:button>
            </td>
            <td class="right">
                <html:button property="search"
                onclick="gscm.submitSearch('W3004Search.do', this.form, '');"
                styleClass="search">
                    <bean:message key="button.search" />
                </html:button>
            </td>
        </tr>
        <tr>
            <td>
                <html:button property="backToHead"
                onclick="gscm.submitBack('W3002Init.do', this.form);"
                styleClass="back_to_main">
                    <bean:message key="button.backToHeader" />
                </html:button>
            </td>
            <td>
            </td>
        </tr>
    </table>
    <hr />
    <c:if test="${W3004Form.displayList}">
        <logic:notEmpty name="W3004Form" property="listDomainList">
        <%--
        -- page control & buttons 2
        --%>
            <table class="gscm_resultlist_button">
                <colgroup>
                    <col width="1%" />
                    <col width="1%" />
                    <col width="20%" />
                    <col />
                </colgroup>
                <tr>
                    <td>
                        <bean:define id="updateConfirmMessage">
                            <bean:message key="GSCM-I0-0004" />
                        </bean:define>
                        <html:button property="update"
                            onclick="gscm.submitConfirm('W3004Update.do', this.form,'${updateConfirmMessage}');"
                            styleClass="update">
                            <bean:message key="button.update" />
                        </html:button>
                    </td>
                    <td>
                        <html:button property="printUpdate"
                        onclick="gscm.commonSubmitForCheck('${printUpdateAction}', this.form, 'false', 'false');"
                        styleClass="print_update">
                            <bean:message key="button.printListUpdate" />
                        </html:button>
                    </td>
                    <td>
                        <html:button property="printAll"
                        onclick="gscm.commonSubmitForCheck('${printAllAction}', this.form, 'false', 'false');"
                        styleClass="print_all">
                            <bean:message key="button.printListAll" />
                        </html:button>
                    </td>
                </tr>
            </table>
            <%--
            -- 
            --%>
            <%--
            -- page control & buttons 2
            --%>
            <table class="gscm_resultlist_button">
                <colgroup>
                    <col width="8%" />
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
                    <col class="resultlist_chk" />
                    <col class="resultlist_plant_cd" />
                    <col class="resultlist_item_no" />
                    <col class="resultlist_pkg_cd" />
                    <col class="resultlist_on_hand_qty" />
                    <col class="resultlist_ship_lot" />
                    <col class="resultlist_box_no" />
                    <col class="resultlist_transferable_qty" />
                    <col class="resultlist_customer_cd" />
                    <col class="resultlist_lgcy_ship_to" />
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
                            <bean:message key="label.customerCd" />
                        </th>
                        <th>
                            <bean:message key="label.lgcyShipTo" />
                        </th>
                    </tr>
                </thead>
                <tbody>
                    <logic:iterate name="W3004Form" property="listDomainList"
                        id="listDomainList" indexId="idx">
                        <ai:stripeline number="${idx + 1}" odd="gscm_odd" even="gscm_even">
                            <tr>
                                <td class="center">
                                    <html:checkbox name="listDomainList" property="selected"
                                        indexed="true" value="on" />
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
                                    <bean:write name="listDomainList" property="transferableQty" />
                                </td>
                                <td>
                                    <bean:write name="listDomainList" property="customerCd" />
                                </td>
                                <td>
                                    <bean:write name="listDomainList" property="lgcyShipTo" />
                                </td>
                                <html:hidden name="listDomainList" property="itemNo" indexed="true" />
                                <html:hidden name="listDomainList" property="pkgCd" indexed="true" />
                                <html:hidden name="listDomainList" property="customerCd" indexed="true" />
                                <html:hidden name="listDomainList" property="lgcyShipTo" indexed="true" />
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