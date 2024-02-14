<%--
 * Project : GSCM
 * 
 * W9003 - Agent MA edit
 *
 * $Revision: 10575 $
 * 
 * Copyright (c) 2013 DENSO CORPORATION. All rights reserved.
 --%>

<html:form action="/W9003Init" styleId="mainForm">
    <%--
    -- buttons 1
    --%>
    <table class="gscm_resultlist_button">
        <colgroup>
            <col />
        </colgroup>
        <tr>
            <td>
                <bean:define id="backToInquiryConfirmMessage"><bean:message key="GSCM-I0-0002" /></bean:define>
                <html:button property="backToInquiry" onclick="submitBackConfirm('W9002Init.do', this.form, '${backToInquiryConfirmMessage}');">
                    <bean:message key="button.backToInquiry" />
                </html:button>
                <logic:equal name="W9003Form" property="w9003CriteriaDomain.procMode" value="1">
                <bean:define id="registerConfirmMessage"><bean:message key="GSCM-I0-0003" /></bean:define>
                </logic:equal>
                <logic:notEqual name="W9003Form" property="w9003CriteriaDomain.procMode" value="1">
                <bean:define id="registerConfirmMessage"><bean:message key="GSCM-I0-0004" /></bean:define>
                </logic:notEqual>
                <html:button property="register" onclick="gscm.submitConfirm('W9003Register.do', this.form, '${registerConfirmMessage}');" styleClass="register">
                    <bean:message key="button.register" />
                </html:button>
            </td>
        </tr>
    </table>
    <%--
    -- Edit 1
    --%>
    <div class="box_title">
        <bean:message key="label.company" />
    </div>
    <table class="grid">
        <colgroup>
            <col class="grid_company_title1" />
            <col class="grid_company_data1" />
            <col />
            <col />
        </colgroup>
        <tr>
            <th class="right">
                <bean:message key="label.orgCompCd" />
            </th>
            <td>
                <html:text property="w9003CriteriaDomain.orgCompCd" styleClass="w9003_org_comp_cd" disabled="true"/>
            </td>
            <td>
                <bean:write name="W9003Form" property="w9003CriteriaDomain.orgCompNmAbb" />
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.agentCompCd" />
            </th>
            <td>
                <html:text property="w9003CriteriaDomain.agentCompCd" styleClass="w9003_agent_comp_cd gscm_required" errorStyleClass="w9003_agent_comp_cd gscm_error_class" readonly="true" />
            </td>
            <td id="agtCompNmAbb">
                <bean:write name="W9003Form" property="w9003CriteriaDomain.agtCompNmAbb" />
            </td>
            <html:hidden name="W9003Form" property="w9003CriteriaDomain.agtCompNmAbb" />
        </tr>
    </table>
    <div style="top:86px;left:575px;position:absolute;">
        <html:button property="select" onclick="selectComp();">
            <bean:message key="button.select" />
        </html:button>
    </div>
    
    <div class="box_title">
        <bean:message key="label.function" />
    </div>
    <table class="grid">
        <colgroup>
            <col class="grid_function_title1" />
            <col class="grid_function_data1" />
            <col class="grid_function_title2" />
            <col class="grid_function_data2" />
        </colgroup>
        <tr>
            <th class="right">
                <bean:message key="label.bhtUnlock" />
            </th>
            <td>
                <html:select property="w9003CriteriaDomain.bhtUnlockAuthFlg" >
                    <html:options collection="bhtUnlockAuthFlg" property="id" labelProperty="name" styleClass="gscm_required"/>
                </html:select>
            </td>
            <th class="right">
                <bean:message key="label.masterOthers" />
            </th>
            <td>
                <html:select property="w9003CriteriaDomain.maOtherAuthFlg" >
                    <html:options collection="maOtherAuthFlg" property="id" labelProperty="name" styleClass="gscm_required"/>
                </html:select>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.documentation" />
            </th>
            <td>
                <html:select property="w9003CriteriaDomain.docAuthFlg" >
                    <html:options collection="docAuthFlg" property="id" labelProperty="name" styleClass="gscm_required"/>
                </html:select>
            </td>
            <th class="right">
                <bean:message key="label.shippingActuality" />
            </th>
            <td>
                <html:select property="w9003CriteriaDomain.shippingActAuthFlg" >
                    <html:options collection="shippingActAuthFlg" property="id" labelProperty="name" styleClass="gscm_required"/>
                </html:select>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.exportRequest" />
            </th>
            <td>
                <html:select property="w9003CriteriaDomain.expRequestAuthFlg" >
                    <html:options collection="expRequestAuthFlg" property="id" labelProperty="name" styleClass="gscm_required"/>
                </html:select>
            </td>
            <th class="right">
                <bean:message key="label.exportRequestPkg" />
            </th>
            <td>
                <html:select property="w9003CriteriaDomain.expRequestPkgAuthFlg" >
                    <html:options collection="expRequestPkgAuthFlg" property="id" labelProperty="name" styleClass="gscm_required"/>
                </html:select>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.emptyReturnable" />
            </th>
            <td>
                <html:select property="w9003CriteriaDomain.ertAuthFlg" >
                    <html:options collection="ertAuthFlg" property="id" labelProperty="name" styleClass="gscm_required"/>
                </html:select>
            </td>
            <th class="right">
                <bean:message key="label.orderReceive" />
            </th>
            <td>
                <html:select property="w9003CriteriaDomain.rcvOdrAuthFlg" >
                    <html:options collection="rcvOdrAuthFlg" property="id" labelProperty="name" styleClass="gscm_required"/>
                </html:select>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.palletizeInstruction" />
            </th>
            <td>
                <html:select property="w9003CriteriaDomain.pltzInstrAuthFlg" >
                    <html:options collection="pltzInstrAuthFlg" property="id" labelProperty="name" styleClass="gscm_required"/>
                </html:select>
            </td>
            <th class="right">
                <bean:message key="label.mTag" />
            </th>
            <td>
                <html:select property="w9003CriteriaDomain.mixTagAuthFlg" >
                    <html:options collection="mixTagAuthFlg" property="id" labelProperty="name" styleClass="gscm_required"/>
                </html:select>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.cml" />
            </th>
            <td>
                <html:select property="w9003CriteriaDomain.cmlAuthFlg" >
                    <html:options collection="cmlAuthFlg" property="id" labelProperty="name" styleClass="gscm_required"/>
                </html:select>
            </td>
            <th class="right">
                <bean:message key="label.xTag" />
            </th>
            <td>
                <html:select property="w9003CriteriaDomain.XTagAuthFlg" >
                    <html:options collection="xTagAuthFlg" property="id" labelProperty="name" styleClass="gscm_required"/>
                </html:select>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.carryOutIn" />
            </th>
            <td>
                <html:select property="w9003CriteriaDomain.trAuthFlg" >
                    <html:options collection="trAuthFlg" property="id" labelProperty="name" styleClass="gscm_required"/>
                </html:select>
            </td>
            <th class="right">
                <bean:message key="label.stagingInstruction" />
            </th>
            <td>
                <html:select property="w9003CriteriaDomain.stgInstrAuthFlg" >
                    <html:options collection="stgInstrAuthFlg" property="id" labelProperty="name" styleClass="gscm_required"/>
                </html:select>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.stagingActuality" />
            </th>
            <td>
                <html:select property="w9003CriteriaDomain.stgActAuthFlg" >
                    <html:options collection="stgActAuthFlg" property="id" labelProperty="name" styleClass="gscm_required"/>
                </html:select>
            </td>
            <th class="right">
                <bean:message key="label.shippingConfirmation" />
            </th>
            <td>
                <html:select property="w9003CriteriaDomain.shippingFirmAuthFlg" >
                    <html:options collection="shippingFirmAuthFlg" property="id" labelProperty="name" styleClass="gscm_required"/>
                </html:select>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.progressControl" />
            </th>
            <td>
                <html:select property="w9003CriteriaDomain.progControlAuthFlg" >
                    <html:options collection="progControlAuthFlg" property="id" labelProperty="name" styleClass="gscm_required"/>
                </html:select>
            </td>
            <th class="right">
            </th>
            <td>
            </td>
        </tr>
    </table>
    <%--
    -- hidden
    --%>
    <html:hidden property="callScreenId" />
    <logic:notEmpty name="W9003Form" property="w9003CriteriaDomain.comUpdateTimestamp">
        <html:hidden property="w9003CriteriaDomain.comUpdateTimestamp" />
    </logic:notEmpty>
</html:form>
