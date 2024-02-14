<%--
 * W3002.jsp
 * €‚
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 --%>
<html:form action="/W3002Init" styleId="mainForm">
    <%--
    -- search condition 1
    --%>
    <table class="gscm_search">
        <colgroup>
            <col width="20%" />
            <col width="20%" />
            <col width="6%" />
            <col />
        </colgroup>
        <tr>
            <td>
            </td>
            <td>
                <bean:message key="label.frNexusWhComCd" />
            </td>
            <td>
                <html:text property="criteriaDomain.carryOutCompCd" maxlength="5" styleClass="wh_comp_cd gscm_required"
                errorStyleClass="wh_comp_cd gscm_error_class" />
            </td>
            <td>
                <html:button property="fromWhComCd" onclick="showSelectFromCompany();"
                styleClass="select">
                    <bean:message key="button.select" />
                </html:button>
            </td>
        </tr>
        <tr>
            <td>
            </td>
            <td>
                <bean:message key="label.frNexusWhCd" />
            </td>
            <td>
                <html:text property="criteriaDomain.carryOutWhCd" maxlength="4" styleClass="wh_cd gscm_required"
                errorStyleClass="wh_cd gscm_error_class" />
            </td>
            <td>
                <html:button property="fromWhCd" onclick="showSelectFromWarehouse();" styleClass="select">
                    <bean:message key="button.select" />
                </html:button>
            </td>
        </tr>
        <tr>
            <td>
            </td>
            <td>
                <bean:message key="label.toNexusWhComCd" />
            </td>
            <td>
                <html:text property="criteriaDomain.carryInCompCd" maxlength="5" styleClass="wh_comp_cd gscm_required"
                errorStyleClass="wh_comp_cd gscm_error_class" />
            </td>
            <td>
                <html:button property="toWhComCd" onclick="showSelectToCompany();" styleClass="select">
                    <bean:message key="button.select" />
                </html:button>
            </td>
        </tr>
        <tr>
            <td>
            </td>
            <td>
                <bean:message key="label.toNexusWhCd" />
            </td>
            <td>
                <html:text property="criteriaDomain.carryInWhCd" maxlength="4" styleClass="wh_cd gscm_required"
                errorStyleClass="wh_cd gscm_error_class" />
            </td>
            <td>
                <html:button property="toWhCd" onclick="showSelectToWarehouse();" styleClass="select">
                    <bean:message key="button.select" />
                </html:button>
            </td>
        </tr>
        <tr>
            <td>
            </td>
            <td>
                <bean:message key="label.shipperOfCargoes" />
            </td>
            <td>
                <html:text property="criteriaDomain.shipperCd" maxlength="5" styleClass="shipper_of_cargoes gscm_required"
                errorStyleClass="shipper_of_cargoes gscm_error_class" />
            </td>
            <td>
                <html:button property="shipperOfCargoes" onclick="showSelectShipper();" styleClass="select">
                    <bean:message key="button.select" />
                </html:button>
            </td>
        </tr>
    </table>
    <br />
    <%--
    -- buttons 1
    --%>
    <table class="gscm_search_button">
        <colgroup>
            <col width="10%" />
            <col width="25%" />
            <col width="25%" />
            <col />
        </colgroup>
        <tr>
            <td>
            </td>
            <td>
                <fieldset>
                    <span class="group_legend">
                        <bean:message key="label.createList" />
                    </span>
                    <br />
                    <div align="center">
                        <html:button property="listCML" onclick="gscm.commonSubmit('W3002MoveToCreateListForCml.do', this.form);"
                        styleClass="create_new">
                            <bean:message key="button.listForCML" />
                        </html:button>
                        <html:button property="listParts" onclick="gscm.commonSubmit('W3002MoveToCreateListForParts.do', this.form);"
                        styleClass="create_new">
                            <bean:message key="button.listForParts" />
                        </html:button>
                    </div>
                    <div class="group_text">
                        <bean:message key="label.createListMemo" />
                    </div>
                </fieldset>
            </td>
            <td>
                <fieldset>
                    <span class="group_legend">
                        <bean:message key="label.createTr" />
                    </span>
                    <br />
                    <div align="center">
                        <html:button property="trCML" onclick="gscm.commonSubmit('W3002MoveToCreateTrForCml.do', this.form);"
                        styleClass="create_new">
                            <bean:message key="button.trForCML" />
                        </html:button>
                        <html:button property="trParts" onclick="gscm.commonSubmit('W3002MoveToCreateTrForParts.do', this.form);"
                        styleClass="create_new">
                            <bean:message key="button.trForParts" />
                        </html:button>
                    </div>
                    <div class="group_text">
                        <bean:message key="label.createTrMemo" />
                    </div>
                </fieldset>
            </td>
            <td valign="top">
                <html:button property="backMain" onclick="gscm.submitBack('W3001Init.do', this.form);"
                styleClass="back_main">
                    <bean:message key="button.backToMainScreen" />
                </html:button>
            </td>
        </tr>
    </table>
    <%--
    -- hidden
    --%>
    <html:hidden property="callScreenId" />
</html:form>
