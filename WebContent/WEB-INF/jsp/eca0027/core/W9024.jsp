<%--
 * Project : GSCM
 * 
 * W9024 - Item No. Apply Start Date Refer & Register
 *
 * $Revision: 7682 $
 * 
 * Copyright (c) 2013 DENSO CORPORATION. All rights reserved.
 --%>

<html:form action="/W9024Init.do" styleId="mainForm">
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
                    <html:text property="w9024CriteriaDomain.compCd" maxlength="5" styleClass="comp_cd gscm_required" errorStyleClass="comp_cd gscm_error_class"/>
                </td>
            </tr>
            <tr>
                <th>
                    <bean:message key="label.itemNo" />
                </th>
                <td>
                    <html:text property="w9024CriteriaDomain.itemNo" maxlength="27" styleClass="w9024_item_no gscm_required" errorStyleClass="w9024_item_no gscm_error_class" />
                </td>
            </tr>
            <tr>
                <th>
                    <bean:message key="W9024.label.pkgCd" />
                </th>
                <td>
                    <html:text property="w9024CriteriaDomain.pkgCd" maxlength="3" styleClass="pkg_cd " errorStyleClass="pkg_cd gscm_error_class" />
                </td>
            </tr>
            <tr>
                <th>
                    <bean:message key="label.trnsCd" />
                </th>
                <td>
                    <html:select property="w9024CriteriaDomain.trnsCd" styleId="trns_cd" styleClass="trns_cd gscm_required" errorStyleClass="trns_cd gscm_error_class">
                        <html:options collection="trnsCd" property="id" labelProperty="name"/>
                    </html:select>
                </td>
            </tr>
        </table>
    </div>
    <%--
    -- buttons 1
    --%>
    <div class="box_add_refer">
        <html:button property="addRefer" onclick="gscm.commonSubmit('W9024AddRefer.do', this.form);" styleClass="add_refer">
            <bean:message key="button.addRefer" />
        </html:button>
    </div>
    <div style="clear:left;"></div>
    <hr />
    <logic:equal name="W9024Form" property="w9024CriteriaDomain.enableRegister" value="Y">
        <%--
        -- buttons 2
        --%>
        <table class="gscm_resultlist_button">
            <colgroup>
                <col />
            </colgroup>
            <tr>
                <td>
                    <html:button property="register" onclick="gscm.commonSubmit('W9024Register.do', this.form);">
                        <bean:message key="button.register" />
                    </html:button>
                    <html:checkbox property="w9024CriteriaDomain.ignoreWarnings" />
                    <bean:message key="label.ignoreWarnings" />
                </td>
            </tr>
        </table>
    
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
                    <bean:write name="W9024Form" property="w9024CriteriaDomain.viewCompCd" />
                </td>
            </tr>
            <tr>
                <th class="right">
                    <bean:message key="label.itemNo" />
                </th>
                <td>
                    <bean:write name="W9024Form" property="w9024CriteriaDomain.viewItemNo" />
                </td>
            </tr>
            <tr>
                <th class="right">
                    <bean:message key="W9024.label.pkgCd" />
                </th>
                <td>
                    <bean:write name="W9024Form" property="w9024CriteriaDomain.viewPkgCd" />
                </td>
            </tr>
            <tr>
                <th class="right">
                    <bean:message key="label.trnsCd" />
                </th>
                <td>
                    <bean:write name="W9024Form" property="w9024CriteriaDomain.viewTrnsCd" />
                </td>
            </tr>
        </table>
        <br />
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
                    <bean:message key="label.rev" />
                </th>
                <td>
                    <bean:write name="W9024Form" property="w9024CriteriaDomain.revOld" />
                </td>
            </tr>
            <tr>
                <th class="right">
                    <bean:message key="label.aplyStrtDt" />
                </th>
                <td>
                    <bean:write name="W9024Form" property="w9024CriteriaDomain.aplyStrtDt" />
                </td>
            </tr>
        </table>
        <br />
        <%--
        -- Change
        --%>
        <div class="box_title">
            &lt;
            <bean:message key="label.boxTitleChange" />
            &gt;
        </div>
        <table class="grid">
            <colgroup>
                <col class="grid_header" />
                <col />
            </colgroup>
            <tr>
                <th class="right">
                    <bean:message key="label.rev" />
                </th>
                <td>
                    <logic:equal name="W9024Form" property="w9024CriteriaDomain.userAuthForComp" value="true">
                    <html:text property="w9024CriteriaDomain.rev" maxlength="2" styleClass="rev gscm_required" errorStyleClass="rev gscm_error_class" />
                    </logic:equal>
                    <logic:equal name="W9024Form" property="w9024CriteriaDomain.userAuthForComp" value="false">
                    <html:text property="w9024CriteriaDomain.rev" maxlength="2" styleClass="rev" errorStyleClass="rev gscm_error_class" />
                    </logic:equal>
                </td>
            </tr>
        </table>
    </logic:equal>
    
    <%--
    -- hidden
    --%>
    <html:hidden property="callScreenId" />
    <html:hidden property="w9024CriteriaDomain.confirmMsg" />
    <html:hidden property="w9024CriteriaDomain.confirmMsgCd" />
    <html:hidden property="w9024CriteriaDomain.continueFlag" />
    <logic:notEmpty name="W9024Form" property="w9024CriteriaDomain.comUpdateTimestamp">
        <html:hidden property="w9024CriteriaDomain.comUpdateTimestamp" />
    </logic:notEmpty>
</html:form>
