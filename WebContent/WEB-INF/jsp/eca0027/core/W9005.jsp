<%--
 * Project : GSCM
 * 
 * W9005 - User ID MA edit
 *
 * $Revision: 9131 $
 * 
 * Copyright (c) 2013 DENSO CORPORATION. All rights reserved.
 --%>

<html:form action="/W9005Init.do" styleId="mainForm">
    <%--
    -- buttons 1
    --%>
    <table class="gscm_resultlist_button">
        <colgroup>
            <col />
        </colgroup>
        <tr>
            <td>
                <bean:define id="backConfirmMessage"><bean:message key="GSCM-I0-0002" locale="${locale_key}"/></bean:define>
                <html:button property="backToInquiry" onclick="submitBackConfirm('W9004Init.do', this.form, '${backConfirmMessage}');" disabled="${!W9005Form.w9005CriteriaDomain.enabledBackToInquiry}" >
                    <bean:message key="button.backToInquiry" />
                </html:button>
                <logic:notEqual name="W9005Form" property="w9005CriteriaDomain.procMode" value="3">
                    <bean:define id="registerConfirmMessage">
                        <logic:equal name="W9005Form" property="w9005CriteriaDomain.procMode" value="1"><bean:message key="GSCM-I0-0003" locale="${locale_key}" /></logic:equal>
                        <logic:notEqual name="W9005Form" property="w9005CriteriaDomain.procMode" value="1"><bean:message key="GSCM-I0-0004" locale="${locale_key}" /></logic:notEqual>
                    </bean:define>
                    <html:button property="register" onclick="submitRegister('W9005Register.do', this.form, '${registerConfirmMessage}');" styleClass="register" >
                        <bean:message key="button.register" />
                    </html:button>
                </logic:notEqual>
                <logic:equal name="W9005Form" property="w9005CriteriaDomain.procMode" value="3">
                    <html:button property="" disabled="true">
                        <bean:message key="button.register" />
                    </html:button>
                </logic:equal>
            </td>
        </tr>
    </table>
    <%--
    -- Edit 1
    --%>
    <table class="grid" width="725px">
        <colgroup>
            <col class="grid1_title" />
            <col class="grid1_data" />
        </colgroup>
        <tr>
            <th class="right">
                <bean:message key="label.dscId" />
            </th>
            <td>
                <logic:equal name="W9005Form" property="w9005CriteriaDomain.enabledDscId" value="true">
                    <html:text property="w9005CriteriaDomain.dscId" maxlength="20" styleClass="dsc_id gscm_required" errorStyleClass="dsc_id gscm_error_class" />
                </logic:equal>
                <logic:notEqual name="W9005Form" property="w9005CriteriaDomain.enabledDscId" value="true">
                    <html:text property="w9005CriteriaDomain.dscId" maxlength="20" styleClass="dsc_id" disabled="true" />
                </logic:notEqual>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.usrNmEn" />
            </th>
            <td>
                <logic:equal name="W9005Form" property="w9005CriteriaDomain.enabledUsrNmEn" value="true">
                    <html:text property="w9005CriteriaDomain.usrNmEn" maxlength="150" styleClass="usr_nm_en gscm_required" errorStyleClass="usr_nm_en gscm_error_class" />
                </logic:equal>
                <logic:notEqual name="W9005Form" property="w9005CriteriaDomain.enabledUsrNmEn" value="true">
                    <html:text property="w9005CriteriaDomain.usrNmEn" maxlength="150" styleClass="usr_nm_en" disabled="true" />
                </logic:notEqual>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.mailAdd1" />
            </th>
            <td>
                <logic:equal name="W9005Form" property="w9005CriteriaDomain.enabledMailAdd1" value="true">
                    <html:text property="w9005CriteriaDomain.mailAdd1" maxlength="256" styleClass="w9005_mail_add" errorStyleClass="w9005_mail_add gscm_error_class" />
                </logic:equal>
                <logic:notEqual name="W9005Form" property="w9005CriteriaDomain.enabledMailAdd1" value="true">
                    <html:text property="w9005CriteriaDomain.mailAdd1" maxlength="256" styleClass="w9005_mail_add" disabled="true" />
                </logic:notEqual>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="label.company" />
            </th>
            <td>
                <logic:equal name="W9005Form" property="w9005CriteriaDomain.enabledCompCd" value="true">
                    <html:text property="w9005CriteriaDomain.compCd" maxlength="5" styleClass="w9005_comp_cd gscm_required" errorStyleClass="w9005_comp_cd gscm_error_class" readonly="true" />
                </logic:equal>
                <logic:notEqual name="W9005Form" property="w9005CriteriaDomain.enabledCompCd" value="true">
                    <html:text property="w9005CriteriaDomain.compCd" maxlength="5" styleClass="w9005_comp_cd" disabled="true" />
                </logic:notEqual>
            </td>
        </tr>
    </table>
    
    <%--
    -- buttons 2
    --%>
    <div style="top:120px;left:740px;position:absolute;">
        <logic:notEqual name="W9005Form" property="w9005CriteriaDomain.enabledRefer" value="true">
            <html:button property="select" onclick="selectCompany()" >
                <bean:message key="button.select" />
            </html:button>
            <html:button property="refer" onclick="gscm.commonSubmit('W9005Refer.do', this.form);" >
                <bean:message key="button.refer" />
            </html:button>
        </logic:notEqual>
        <logic:equal name="W9005Form" property="w9005CriteriaDomain.enabledRefer" value="true" >
            <html:button property="select" disabled="true" >
                <bean:message key="button.select" />
            </html:button>
            <html:button property="refer" disabled="true" >
                <bean:message key="button.refer" />
            </html:button>
        </logic:equal>
    </div>
    
    <logic:equal name="W9005Form" property="w9005CriteriaDomain.enabledRefer" value="true">
    <%--
    -- Edit 2
    --%>
    <div class="box_title">
        1. <bean:message key="label.administratorAuthorityRegional" />
    </div>
    <table class="grid" width="320px">
        <colgroup>
            <col class="grid2_header" />
            <col class="grid2_reg_adm_role" />
            <col class="grid2_browse_all" />
            <col class="grid2_register_all" />
        </colgroup>
        <tr style="height:18px">
            <th>
            </th>
            <th>
                <bean:message key="label.adm" />
            </th>
            <th>
                <bean:message key="label.browseAll" />
            </th>
            <th>
                <bean:message key="label.registerAll" />
            </th>
        </tr>
        <tr style="height:18px">
            <td>
                <bean:message key="label.regional" />
            </td>
            <td class="center">
                <html:checkbox name="W9005Form" property="areaDomain.regAdmRole" disabled="${!W9005Form.areaDomain.enabledAdm}" />
            </td>
            <td class="center">
                <html:checkbox name="W9005Form" property="areaDomain.browseAllRole" disabled="${!W9005Form.areaDomain.enabledBrowseAll}" />
            </td>
            <td class="center">
                <html:checkbox name="W9005Form" property="areaDomain.registerAllRole" disabled="${!W9005Form.areaDomain.enabledRegisterAll}" />
            </td>
        </tr>
    </table>
    
    <%--
    -- Edit 3
    --%>
    <div class="box_title">
        2. <bean:message key="label.administratorAuthorityOfCompanyAndEachFunc" />
    </div>
    <table id="tablefix2" class="gscm_resultlist" width="430px">
        <colgroup>
            <col class="resultlist1_company" />
            <col class="resultlist1_adm" />
            <col class="resultlist1_bht_lock" />
            <col class="resultlist1_ma_agent_b" />
            <col class="resultlist1_ma_agent_r" />
            <col class="resultlist1_ma_other_b" />
            <col class="resultlist1_ma_other_r" />
            <col class="resultlist1_doc" />
            <col class="resultlist1_ship_act" />
        </colgroup>
        <tr style="height:18px">
            <th rowspan="2">
                <bean:message key="label.company" />
            </th>
            <th rowspan="2">
                <bean:message key="label.adm" />
            </th>
            <th>
                <bean:message key="label.bhtLock" />
            </th>
            <th colspan="2">
                <bean:message key="label.maAgent" />
            </th>
            <th colspan="2">
                <bean:message key="label.maOther" />
            </th>
            <th>
                <bean:message key="label.doc" />
            </th>
            <th>
                <bean:message key="label.shipAct" />
            </th>
        </tr>
        <tr style="height:18px">
            <th>
                <bean:message key="label.aut" />
            </th>
            <th>
                <bean:message key="label.b" />
            </th>
            <th>
                <bean:message key="label.r" />
            </th>
            <th>
                <bean:message key="label.b" />
            </th>
            <th>
                <bean:message key="label.r" />
            </th>
            <th>
                <bean:message key="label.r" />
            </th>
            <th>
                <bean:message key="label.r" />
            </th>
        </tr>
        <logic:notEmpty name="W9005Form" property="compListDomain">
            <logic:iterate name="W9005Form" property="compListDomain" id="compListDomain" indexId="idx">
                <ai:stripeline number="${idx + 1}" odd="gscm_odd" even="gscm_even">
                    <tr style="height:18px">
                        <td>
                            <html:text name="compListDomain" property="compCd" readonly="true" indexed="true" styleClass="w9005_comp_cd gscm_disptext" />
                        </td>
                        <td class="center">
                            <html:checkbox name="compListDomain" property="comAdmRole" indexed="true" disabled="${!compListDomain.enabledComAdm}" />
                        </td>
                        <td class="center">
                            <html:checkbox name="compListDomain" property="bhtLockAutRole" indexed="true" disabled="${!compListDomain.enabledBhtLockAut}" />
                        </td>
                        <td class="center">
                            <html:checkbox name="compListDomain" property="maAgentBRole" indexed="true" disabled="${!compListDomain.enabledMaAgentB}" />
                        </td>
                        <td class="center">
                            <html:checkbox name="compListDomain" property="maAgentRRole" indexed="true" disabled="${!compListDomain.enabledMaAgentR}" />
                        </td>
                        <td class="center">
                            <html:checkbox name="compListDomain" property="maOtherBRole" indexed="true" disabled="${!compListDomain.enabledMaOtherB}" />
                        </td>
                        <td class="center">
                            <html:checkbox name="compListDomain" property="maOtherRRole" indexed="true" disabled="${!compListDomain.enabledMaOtherR}" />
                        </td>
                        <td class="center">
                            <html:checkbox name="compListDomain" property="docRRole" indexed="true" disabled="${!compListDomain.enabledDocR}" />
                        </td>
                        <td class="center">
                            <html:checkbox name="compListDomain" property="shipActRRole" indexed="true" disabled="${!compListDomain.enabledShipActR}" />
                        </td>
                    </tr>
                </ai:stripeline>
            </logic:iterate>
        </logic:notEmpty>
    </table>
    
    <%--
    -- Edit 4
    --%>
    <div class="box_title">
        3. <bean:message key="label.administratorAuthorityOfPlantAndEachFunction" />
    </div>
    <table id="tablefix3" class="gscm_resultlist" width="960px">
        <colgroup>
            <col class="resultlist2_company" />
            <col class="resultlist2_plant_cd" />
            <col class="resultlist2_adm" />
            <col class="resultlist2_exp_req_b" />
            <col class="resultlist2_exp_req_r" />
            <col class="resultlist2_req_pkg_b" />
            <col class="resultlist2_req_pkg_r" />
            <col class="resultlist2_ert_b" />
            <col class="resultlist2_ert_r" />
            <col class="resultlist2_order_b" />
            <col class="resultlist2_order_r" />
            <col class="resultlist2_plt_instr_b" />
            <col class="resultlist2_plt_instr_r" />
            <col class="resultlist2_mTag_b" />
            <col class="resultlist2_mTag_r" />
            <col class="resultlist2_cml_b" />
            <col class="resultlist2_cml_r" />
            <col class="resultlist2_x_tag_b" />
            <col class="resultlist2_x_tag_r" />
            <col class="resultlist2_carry_out_in_b" />
            <col class="resultlist2_carry_out_in_r" />
            <col class="resultlist2_stg_instr_b" />
            <col class="resultlist2_stg_instr_r" />
            <col class="resultlist2_stg_act_b" />
            <col class="resultlist2_stg_act_r" />
            <col class="resultlist2_ship_cfrm_b" />
            <col class="resultlist2_ship_cfrm_r" />
            <col class="resultlist2_prgs_ctrl_b" />
        </colgroup>
        <tr style="height:18px">
            <th rowspan="2">
                <bean:message key="label.company" />
            </th>
            <th rowspan="2">
                <bean:message key="label.plantCd" />
            </th>
            <th rowspan="2">
                <bean:message key="label.adm" />
            </th>
            <th colspan="2">
                <bean:message key="label.expReq" />
            </th>
            <th colspan="2">
                <bean:message key="label.reqPkg" />
            </th>
            <th colspan="2">
                <bean:message key="label.ert2" />
            </th>
            <th colspan="2">
                <bean:message key="label.order" />
            </th>
            <th colspan="2">
                <bean:message key="label.pltInstr" />
            </th>
            <th colspan="2">
                <bean:message key="label.mTag" />
            </th>
            <th colspan="2">
                <bean:message key="label.cml" />
            </th>
            <th colspan="2">
                <bean:message key="label.xTag" />
            </th>
            <th colspan="2">
                <bean:message key="label.carryOutIn" />
            </th>
            <th colspan="2">
                <bean:message key="label.stgInstr" />
            </th>
            <th colspan="2">
                <bean:message key="label.stgAct" />
            </th>
            <th colspan="2">
                <bean:message key="label.shipCfrm" />
            </th>
            <th>
                <bean:message key="label.prgsCtrl" />
            </th>
        </tr>
        <tr style="height:18px">
            <th>
                <bean:message key="label.b" />
            </th>
            <th>
                <bean:message key="label.r" />
            </th>
            <th>
                <bean:message key="label.b" />
            </th>
            <th>
                <bean:message key="label.r" />
            </th>
            <th>
                <bean:message key="label.b" />
            </th>
            <th>
                <bean:message key="label.r" />
            </th>
            <th>
                <bean:message key="label.b" />
            </th>
            <th>
                <bean:message key="label.r" />
            </th>
            <th>
                <bean:message key="label.b" />
            </th>
            <th>
                <bean:message key="label.r" />
            </th>
            <th>
                <bean:message key="label.b" />
            </th>
            <th>
                <bean:message key="label.r" />
            </th>
            <th>
                <bean:message key="label.b" />
            </th>
            <th>
                <bean:message key="label.r" />
            </th>
            <th>
                <bean:message key="label.b" />
            </th>
            <th>
                <bean:message key="label.r" />
            </th>
            <th>
                <bean:message key="label.b" />
            </th>
            <th>
                <bean:message key="label.r" />
            </th>
            <th>
                <bean:message key="label.b" />
            </th>
            <th>
                <bean:message key="label.r" />
            </th>
            <th>
                <bean:message key="label.b" />
            </th>
            <th>
                <bean:message key="label.r" />
            </th>
            <th>
                <bean:message key="label.b" />
            </th>
            <th>
                <bean:message key="label.r" />
            </th>
            <th>
                <bean:message key="label.b" />
            </th>
        </tr>
        <logic:notEmpty name="W9005Form" property="plantListDomain">
            <logic:iterate name="W9005Form" property="plantListDomain" id="plantListDomain" indexId="idx">
                <ai:stripeline number="${idx + 1}" odd="gscm_odd" even="gscm_even">
                    <tr style="height:18px">
                        <td>
                            <html:text name="plantListDomain" property="compCd" readonly="true" indexed="true" styleClass="w9005_comp_cd gscm_disptext" />
                        </td>
                        <td>
                            <html:text name="plantListDomain" property="plantCd" readonly="true" indexed="true" styleClass="w9005_plant_cd gscm_disptext" />
                        </td>
                        <td class="center">
                            <html:checkbox name="plantListDomain" property="plnAdmRole" indexed="true" disabled="${!plantListDomain.enabledPlnAdm}" />
                        </td>
                        <td class="center">
                            <html:checkbox name="plantListDomain" property="expReqBRole" indexed="true" disabled="${!plantListDomain.enabledExpreqB}" />
                        </td>
                        <td class="center">
                            <html:checkbox name="plantListDomain" property="expReqRRole" indexed="true" disabled="${!plantListDomain.enabledExpreqR}" />
                        </td>
                        <td class="center">
                            <html:checkbox name="plantListDomain" property="reqPkgBRole" indexed="true" disabled="${!plantListDomain.enabledReqPkgB}" />
                        </td>
                        <td class="center">
                            <html:checkbox name="plantListDomain" property="reqPkgRRole" indexed="true" disabled="${!plantListDomain.enabledReqPkgR}" />
                        </td>
                        <td class="center">
                            <html:checkbox name="plantListDomain" property="ertBRole" indexed="true" disabled="${!plantListDomain.enabledErtB}" />
                        </td>
                        <td class="center">
                            <html:checkbox name="plantListDomain" property="ertRRole" indexed="true" disabled="${!plantListDomain.enabledErtR}" />
                        </td>
                        <td class="center">
                            <html:checkbox name="plantListDomain" property="orderBRole" indexed="true" disabled="${!plantListDomain.enabledOrderB}" />
                        </td>
                        <td class="center">
                            <html:checkbox name="plantListDomain" property="orderRRole" indexed="true" disabled="${!plantListDomain.enabledOrderR}" />
                        </td>
                        <td class="center">
                            <html:checkbox name="plantListDomain" property="pltInstrBRole" indexed="true" disabled="${!plantListDomain.enabledPltInstrB}" />
                        </td>
                        <td class="center">
                            <html:checkbox name="plantListDomain" property="pltInstrRRole" indexed="true" disabled="${!plantListDomain.enabledPltInstrR}" />
                        </td>
                        <td class="center">
                            <html:checkbox name="plantListDomain" property="mtagBRole" indexed="true" disabled="${!plantListDomain.enabledMtagB}" />
                        </td>
                        <td class="center">
                            <html:checkbox name="plantListDomain" property="mtagRRole" indexed="true" disabled="${!plantListDomain.enabledMtagR}" />
                        </td>
                        <td class="center">
                            <html:checkbox name="plantListDomain" property="cmlBRole" indexed="true" disabled="${!plantListDomain.enabledCmlB}" />
                        </td>
                        <td class="center">
                            <html:checkbox name="plantListDomain" property="cmlRRole" indexed="true" disabled="${!plantListDomain.enabledCmlR}" />
                        </td>
                        <td class="center">
                            <html:checkbox name="plantListDomain" property="xtagBRole" indexed="true" disabled="${!plantListDomain.enabledXtagB}" />
                        </td>
                        <td class="center">
                            <html:checkbox name="plantListDomain" property="xtagRRole" indexed="true" disabled="${!plantListDomain.enabledXtagR}" />
                        </td>
                        <td class="center">
                            <html:checkbox name="plantListDomain" property="carryOutInBRole" indexed="true" disabled="${!plantListDomain.enabledCarryOutInB}" />
                        </td>
                        <td class="center">
                            <html:checkbox name="plantListDomain" property="carryOutInRRole" indexed="true" disabled="${!plantListDomain.enabledCarryOutInR}" />
                        </td>
                        <td class="center">
                            <html:checkbox name="plantListDomain" property="stgInstrBRole" indexed="true" disabled="${!plantListDomain.enabledStgInstrB}" />
                        </td>
                        <td class="center">
                            <html:checkbox name="plantListDomain" property="stgInstrRRole" indexed="true" disabled="${!plantListDomain.enabledStgInstrR}" />
                        </td>
                        <td class="center">
                            <html:checkbox name="plantListDomain" property="stgActBRole" indexed="true" disabled="${!plantListDomain.enabledStgActB}" />
                        </td>
                        <td class="center">
                            <html:checkbox name="plantListDomain" property="stgActRRole" indexed="true" disabled="${!plantListDomain.enabledStgActR}" />
                        </td>
                        <td class="center">
                            <html:checkbox name="plantListDomain" property="shipCfrmBRole" indexed="true" disabled="${!plantListDomain.enabledShipCfrmB}" />
                        </td>
                        <td class="center">
                            <html:checkbox name="plantListDomain" property="shipCfrmRRole" indexed="true" disabled="${!plantListDomain.enabledShipCfrmR}" />
                        </td>
                        <td class="center">
                            <html:checkbox name="plantListDomain" property="prgsCtrlBRole" indexed="true" disabled="${!plantListDomain.enabledPrgsCtrlB}" />
                        </td>
                    </tr>
                </ai:stripeline>
            </logic:iterate>
        </logic:notEmpty>
    </table>
    </logic:equal>
    <%--
    -- hidden
    --%>
    <html:hidden property="windowId" />
    <html:hidden property="languageCd" />
    <html:hidden property="screenId" />
    <html:hidden property="callScreenId" />
    <logic:notEmpty name="W9005Form" property="w9005CriteriaDomain.lastUpdate">
        <html:hidden property="w9005CriteriaDomain.lastUpdate" />
    </logic:notEmpty>
    <logic:notEmpty name="W9005Form" property="w9005CriteriaDomain.prmDscId">
        <html:hidden property="w9005CriteriaDomain.prmDscId" />
    </logic:notEmpty>
    <logic:notEmpty name="W9005Form" property="w9005CriteriaDomain.procMode">
        <html:hidden property="w9005CriteriaDomain.procMode" />
    </logic:notEmpty>
</html:form>
