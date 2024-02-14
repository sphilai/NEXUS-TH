<%--
 * Project : GSCM
 * 
 * W9025 - Registration Screen of Actual Item Weight
 *
 * $Revision: 11574 $
 * 
 * Copyright (c) 2013 DENSO CORPORATION. All rights reserved.
 --%>

<html:form action="/W9025Init.do" styleId="mainForm">
    <%--
    -- Edit 1
    --%>
    <div style="float: left;">
        <table class="grid">
            <colgroup>
                <col class="grid_header" />
                <col />
            </colgroup>
            <tr>
                <th>
                    <bean:message key="label.compCd" />
                </th>
                <td>
                    <html:text property="w9025CriteriaDomain.ownerComp" maxlength="3" styleClass="comp_cd gscm_required" errorStyleClass="comp_cd gscm_error_class"/>
                </td>
            </tr>
            <tr>
                <th>
                    <bean:message key="label.itemNo" />
                </th>
                <td>
                    <html:text property="w9025CriteriaDomain.itemNo" maxlength="27" styleClass="item_no gscm_required" errorStyleClass="item_no gscm_error_class" />
                </td>
            </tr>
        </table>
    </div>
    <%--
    -- buttons 1
    --%>
    <div class="box_add_refer">
        <html:button property="addRefer" onclick="gscm.commonSubmit('W9025AddRefer.do', this.form);" styleClass="add_refer">
            <bean:message key="button.addRefer" />
        </html:button>
    </div>
    <div style="clear:left;"></div>
    <hr />
    <logic:equal name="W9025Form" property="w9025CriteriaDomain.enableRegister" value="Y">
        <%--
        -- buttons 2
        --%>
        <table class="gscm_resultlist_button">
            <colgroup>
                <col />
            </colgroup>
            <tr>
                <td>
                    <html:button property="register" onclick="gscm.commonSubmit('W9025Register.do', this.form);">
                        <bean:message key="button.register" />
                    </html:button>
                    <html:checkbox property="w9025CriteriaDomain.ignoreWarnings" />
                    <bean:message key="label.ignoreWarnings" />
                </td>
            </tr>
        </table>
        <%--
        -- Current Condition
        --%>
        <div class="box_title">
            &lt;
            <bean:message key="label.boxTitleCurrentCondition" />
            &gt;
        </div>
        <table class="grid">
            <colgroup>
                <col class="grid_header" />
                <col />
            </colgroup>
            <tr>
                <th class="right">
                    <bean:message key="label.compCd" />
                </th>
                <td>
                    <bean:write name="W9025Form" property="w9025CriteriaDomain.viewOwnerComp" />
                </td>
            </tr>
            <tr>
                <th class="right">
                    <bean:message key="label.itemNo" />
                </th>
                <td>
                    <bean:write name="W9025Form" property="w9025CriteriaDomain.viewItemNo" />
                </td>
            </tr>
            <tr>
                <th class="right">
                    <bean:message key="label.weightUnit" />
                </th>
                <td>
                    <bean:write name="W9025Form" property="w9025CriteriaDomain.oldWeightUnit" />
                </td>
            </tr>
            <tr>
                <th class="right">
                    <bean:message key="label.netWeightA" />
                </th>
                <td class="right">
                    <bean:write name="W9025Form" property="w9025CriteriaDomain.oldNetWeightA" />
                </td>
            </tr>
        </table>
        <br />
        <%--
        -- Register
        --%>
        <div class="box_title">
            &lt;
            <bean:message key="label.register" />
            &gt;
        </div>
        <table class="grid">
            <colgroup>
                <col class="grid_header" />
                <col />
            </colgroup>
            <tr>
                <th class="right">
                    <bean:message key="label.weightUnit" />
                </th>
                <td>
                    <html:select property="w9025CriteriaDomain.weightUnit" 
                        styleClass="weight_unit ${disableElementList[0] == 'w9025CriteriaDomain.weightUnit' ? '' : 'gscm_required'}"
                        errorStyleClass="weight_unit gscm_error_class" >
                        <html:options collection="weightUnit" property="id" labelProperty="name" />
                    </html:select>
                </td>
            </tr>
            <tr>
                <th class="right">
                  <bean:message key="label.netWeightA" />
                </th>
                <td>
                  <html:text property="w9025CriteriaDomain.netWeightA" maxlength="11" 
                      styleClass="net_weight_a right ${disableElementList[1] == 'w9025CriteriaDomain.netWeightA' ? '' : 'gscm_required'}"
                      errorStyleClass="net_weight_a right gscm_error_class" />
            </tr>
        </table>
    </logic:equal>
    
    <%--
    -- hidden
    --%>
    <html:hidden property="callScreenId" />
    <html:hidden property="w9025CriteriaDomain.confirmMsg" />
    <html:hidden property="w9025CriteriaDomain.confirmMsgCd" />
    <html:hidden property="w9025CriteriaDomain.continueFlag" />
    <logic:notEmpty name="W9025Form" property="w9025CriteriaDomain.comUpdateTimestamp">
        <html:hidden property="w9025CriteriaDomain.comUpdateTimestamp" />
    </logic:notEmpty>
</html:form>
