<%--
 * W2017.jsp
 * 
 * X-Tag Register画面のJSPです。
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 --%>
<html:form action="/W2017Init" styleId="mainForm">
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
            <col class="search_xtag_packing_dt" />
            <col class="search_xtag_packing_issuer_nm" />
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
            <th>
                <bean:message key="label.xtagPackingDt" />
            </th>
            <th>
                <bean:message key="label.xtagPackingIssuerNm" />
            </th>
        </tr>
        <tr>
            <td>
                <html:text property="w2017CriteriaDomain.curWhCompCd" styleClass="cur_wh_comp_cd gscm_disptext" errorStyleClass="cur_wh_comp_cd gscm_disptext gscm_error_class" readonly="true" />
            </td>
            <td>
                <html:text property="w2017CriteriaDomain.curWhCd" styleClass="cur_wh_cd gscm_disptext" errorStyleClass="cur_wh_cd gscm_disptext gscm_error_class" readonly="true" />
            </td>
            <td>
                <bean:write name="W2017Form" property="w2017CriteriaDomain.trnsCd" />
            </td>
            <td>
                <bean:write name="W2017Form" property="w2017CriteriaDomain.containerSortingKey" />
            </td>
            <td>
                <bean:write name="W2017Form" property="w2017CriteriaDomain.loadingCd" />
            </td>
            <td>
                <bean:write name="W2017Form" property="w2017CriteriaDomain.shipToCompCd" />
            </td>
            <td>
                <bean:write name="W2017Form" property="w2017CriteriaDomain.xtagPackingDt" />
            </td>
            <td>
                <html:text property="w2017CriteriaDomain.xtagPackingIssuerNm" styleClass="xtag_packing_issuer_nm gscm_disptext" readonly="true"/>
            </td>
        </tr>
    </table>
    <%--
    -- search condition 2
    --%>
    <table class="gscm_search">
        <colgroup>
            <col class="search_total_shipper" />
            <col class="search_volume" />
            <col class="search_gross_weight" />
            <col class="search_outer_pkg_cd" />
            <col class="search_pallet_no" />
            <col class="search_xmain_mark" />
        </colgroup>
        <tr>
            <th>
                <bean:message key="label.totalShipper" />
            </th>
            <th>
                <bean:message key="label.volume" />
            </th>
            <th>
                <bean:message key="label.grossWeight" />
            </th>
            <th>
                <bean:message key="label.outerPkgCd" />
            </th>
            <th>
                <bean:message key="label.palletNo" />
            </th>
            <th>
                <bean:message key="label.xmainMark" />
            </th>
        </tr>
        <tr>

            <td>
                <bean:write name="W2017Form" property="w2017CriteriaDomain.totalShipper" />
            </td>
            <td style="white-space:nowrap">
                <bean:write name="W2017Form" property="w2017CriteriaDomain.volume" />
                <bean:write name="W2017Form" property="w2017CriteriaDomain.volumeUnitDisplay" />
            </td>
            <td style="white-space:nowrap">
                <bean:write name="W2017Form" property="w2017CriteriaDomain.grossWeight" />
                <bean:write name="W2017Form" property="w2017CriteriaDomain.weightUnitDisplay" />
            </td>
            <td>
                <logic:equal name="W2017Form" property="fromScreenId" value="W2014">
                    <html:text property="w2017CriteriaDomain.outerPkgCd" maxlength="4" styleClass="outer_pkg_cd" readonly="true"/>
                </logic:equal>
                <logic:notEqual name="W2017Form" property="fromScreenId" value="W2014">
                    <html:text property="w2017CriteriaDomain.outerPkgCd" maxlength="4" styleClass="outer_pkg_cd gscm_required" errorStyleClass="outer_pkg_cd gscm_error_class" readonly="true"/>
                </logic:notEqual>
                <html:button property="select" styleClass="select" onclick="selectOuterPkg('${W2017Form.w2017CriteriaDomain.shipperCdList}');" >                
                    <bean:message key="button.select" />
                </html:button>
            </td>
            <td>
                <bean:write name="W2017Form" property="w2017CriteriaDomain.palletNo" />
            </td>
            <td>
                <bean:write name="W2017Form" property="w2017CriteriaDomain.xmainMark" />
            </td>
            <html:hidden property="w2017CriteriaDomain.outerPkgComCd" />
            <html:hidden property="w2017CriteriaDomain.customTimingTyp" />
            <html:hidden property="w2017CriteriaDomain.shipperCdList" />
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
                <bean:define id="backToMainScreenConfirmMessage"><bean:message key="GSCM-I0-0002"/></bean:define>
                <html:button property="backToCreate" styleClass="back_to_create" onclick="gscm.submitBack('W2016Init.do', this.form);">
                    <bean:message key="button.backToCreate" />
                </html:button>
                <html:button property="backToMainScreen" styleClass="back_to_main_screen" onclick="window.backToMainScreen(this.form, '${W2017Form.fromScreenId}', '${backToMainScreenConfirmMessage}');">
                    <bean:message key="button.backToMainScreen" />
                </html:button>
            </td>
        </tr>
    </table>
    <hr />
    <%--
    -- buttons 2
    --%>
    <table class="gscm_search_button">
        <colgroup>
            <col width="50%" />
            <col />
        </colgroup>
        <tr>
            <td>
                <bean:define id="deleteConfirmMessage"><bean:message key="GSCM-I0-0005"/></bean:define>
                <bean:define id="registerConfirmMessage"><bean:message key="GSCM-I0-0003"/></bean:define>
                <bean:define id="cancelConfirmMessage"><bean:message key="GSCM-I0-0005"/></bean:define>
                <html:button property="delete" styleClass="delete" onclick="gscm.submitConfirm('W2017Delete.do', this.form, '${deleteConfirmMessage}');">
                    <bean:message key="button.delete" />
                </html:button>
                <html:button property="register" styleClass="register" onclick="gscm.submitConfirm('W2017Register.do', this.form, '${registerConfirmMessage}');">
                    <bean:message key="button.register" />
                </html:button>
                <html:button property="printTag" styleClass="print_tag" onclick="gscm.commonSubmit('W2017PrintTag.do', this.form);">
                    <bean:message key="button.printTag" />
                </html:button>
                <html:button property="cancel" styleClass="cancel" onclick="gscm.submitConfirm('W2017Cancel.do', this.form, '${cancelConfirmMessage}');">
                    <bean:message key="button.cancel" />
                </html:button>
            </td>
        </tr>
    </table>
    <%--
    -- search results
    --%>
    <c:if test="${W2017Form.displayList}">
        <table id="tablefix" class="gscm_resultlist">
            <colgroup>
                <col class="resultlist_delete" />
                <col class="resultlist_shipper_cd" />
                <col class="resultlist_main_mark" />
                <col class="resultlist_gross_weight" />
            </colgroup>
            <tr>
                <th>
                    <bean:message key="label.delete" />
                </th>
                <th>
                    <bean:message key="label.shipperCd" />
                </th>
                <th>
                    <bean:message key="label.mainMark" />
                </th>
                <th>
                    <bean:message key="label.grossWeight" />
                    (<bean:write name="W2017Form" property="w2017CriteriaDomain.weightUnitDisplayDtlTitle" />)
                </th>
            </tr>
            <logic:iterate name="W2017Form" property="w2017ListDomainList" id="w2017ListDomainList" indexId="idx">
                <ai:stripeline number="${idx + 1}" odd="gscm_odd" even="gscm_even">
                    <tr>
                        <td class="center">
                            <html:checkbox name="w2017ListDomainList" property="selected" indexed="true" />
                        </td>
                        <td>
                            <bean:write name="w2017ListDomainList" property="shipperCd" />
                        </td>
                        <td>
                            <html:text name="w2017ListDomainList" property="mainMark" indexed="true" styleClass="w2017_main_mark_disptext gscm_disptext" readonly="true" />
                        </td>
                        <td class="right">
                            <bean:write name="w2017ListDomainList" property="grossWeight" />
                        </td>
                        <html:hidden name="w2017ListDomainList" property="dngrItemFlg" indexed="true" />
                        <html:hidden name="w2017ListDomainList" property="auth" indexed="true" />
                    </tr>
                </ai:stripeline>
            </logic:iterate>
       </table>
   </c:if>
    
    <%--
    -- hidden
    --%>
    <html:hidden property="callScreenId" />
    <html:hidden property="fromScreenId" />
    <html:hidden property="download" />
</html:form>
