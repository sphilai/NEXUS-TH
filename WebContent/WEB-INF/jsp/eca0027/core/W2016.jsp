<%--
 * W2016.jsp
 * 
 * X-Tag Create画面のJSPです。
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 --%>
<html:form action="/W2016Search" styleId="mainForm">
    <%--
    -- search condition 1
    --%>
    <table class="gscm_search">
        <colgroup>
            <col class="search_cur_wh_comp_cd" />
            <col class="search_cur_wh_cd" />
            <col class="search_trns_cd" />
            <col class="search_container_sorting_key" />
            <col class="search_loading_cd" />
            <col class="search_ship_to_comp_cd" />
        </colgroup>
        <tr>
            <th>
                <bean:message key="label.curWhCompCd" />
            </th>
            <th>
                <bean:message key="label.curWhCd" />
            </th>
            <th>
                <bean:message key="label.trnsCd" />
            </th>
            <th>
                <bean:message key="label.containerSortingKey" />
            </th>
            <th>
                <bean:message key="label.loadingCd" />
            </th>
            <th>
                <bean:message key="label.shipToCompCd" />
            </th>
        </tr>
        <tr>
            <td>
                <bean:write name="W2016Form" property="w2016CriteriaDomain.curWhCompCd" />
            </td>
            <td>
                <bean:write name="W2016Form" property="w2016CriteriaDomain.curWhCd" />
            </td>
            <td>
                <bean:write name="W2016Form" property="w2016CriteriaDomain.trnsCd" />
            </td>
            <td>
                <bean:write name="W2016Form" property="w2016CriteriaDomain.containerSortingKey" />
            </td>
            <td>
                <bean:write name="W2016Form" property="w2016CriteriaDomain.loadingCd" />
            </td>
            <td>
                <bean:write name="W2016Form" property="w2016CriteriaDomain.shipToCompCd" />
            </td>
        </tr>
    </table>
    <%--
    -- search condition 2
    --%>
    <table class="gscm_search">
        <colgroup>
            <col class="search_shipper_cd" />
            <col class="search_main_mark" />
        </colgroup>
        <tr>
            <th>
                <bean:message key="label.shipperCd" />
            </th>
            <th>
                <bean:message key="label.mainMark" />
            </th>
        </tr>
        <tr>
            <td>
                <html:text property="w2016CriteriaDomain.shipperCd" maxlength="3" styleClass="shipper_cd" errorStyleClass="shipper_cd gscm_error_class" />
            </td>
            <td>
                <html:text property="w2016CriteriaDomain.mainMark" maxlength="20" styleClass="main_mark" errorStyleClass="main_mark gscm_error_class" />
            </td>
        </tr>
    </table>
    <%--
    -- buttons 1
    --%>
    <table class="gscm_search_button">
        <colgroup>
            <col width="50%" />
            <col />
        </colgroup>
        <tr>
            <td>
                <html:button property="moveToRegister" styleClass="move_to_register" onclick="gscm.commonSubmit('W2016MoveToRegister.do', this.form);">
                    <bean:message key="button.moveToRegister" />
                </html:button>
                <html:button property="backToHeader" styleClass="back_to_header" onclick="gscm.submitBack('W2015Init.do', this.form);">
                    <bean:message key="button.backToHeader" />
                </html:button>
                <html:button property="backToMainScreen" styleClass="back_to_main_screen" onclick="gscm.submitBack('W2014Init.do', this.form);">
                    <bean:message key="button.backToMainScreen" />
                </html:button>
            </td>
            <td class="right">
                <html:button property="search" styleClass="search" onclick="gscm.commonSubmit('W2016Search.do', this.form);">
                    <bean:message key="button.search" />
                </html:button>
            </td>
        </tr>
    </table>
    <hr />
    
    <c:if test="${W2016Form.displayList}">
        <%--
        -- buttons 2
        --%>
        <table class="gscm_resultlist_button">
            <colgroup>
                <col />
            </colgroup>
            <tr>
                <td>
                    <html:button property="update" styleClass="update" onclick="gscm.commonSubmit('W2016Update.do', this.form);">
                        <bean:message key="button.update" />
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
                <col class="resultlist_checked_key" />
                <col class="resultlist_shipper_cd" />
                <col class="resultlist_main_mark" />
                <col class="resultlist_gross_weight" />
            </colgroup>
            <tr>
                <th>
                    <bean:message key="label.ck" />
                    <input type="checkbox" name="checkAll" onclick="allcheck('w2016ListDomainList', 'selected', this.checked)" />
                </th>
                <th>
                    <bean:message key="label.shipperCd" />
                </th>
                <th>
                    <bean:message key="label.mainMark" />
                </th>
                <th>
                    <bean:message key="label.grossWeight" />
                    (<bean:write name="W2016Form" property="w2016CriteriaDomain.weightUnitDisplay" />)
                </th>
            </tr>
            <logic:iterate name="W2016Form" property="w2016ListDomainList" id="w2016ListDomainList" indexId="idx">
                <ai:stripeline number="${idx + 1}" odd="gscm_odd" even="gscm_even">
                    <tr>
                        <td class="center">
                            <html:checkbox name="w2016ListDomainList" property="selected" indexed="true" />
                        </td>
                        <td>
                            <bean:write name="w2016ListDomainList" property="shipperCd" />
                        </td>
                        <td>
                            <html:text name="w2016ListDomainList" property="mainMark" indexed="true" styleClass="w2016_main_mark_disptext gscm_disptext" readonly="true" />
                        </td>
                        <td class="right">
                            <bean:write name="w2016ListDomainList" property="grossWeight" />
                        </td>
                        <html:hidden name="w2016ListDomainList" property="disabledFlg" indexed="true" />
                        <html:hidden name="w2016ListDomainList" property="customTimingTyp" indexed="true" />
                    </tr>
                </ai:stripeline>
            </logic:iterate>
        </table>
    </c:if>
    
    <%--
    -- hidden
    --%>
    <html:hidden property="callScreenId" />
</html:form>
