<%--
 * WT004.jsp
 * 
 * JSP of Package Search Sub Screen.
 * 包装材選択子画面のJSPです。
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 --%>
<html:form action="/Wt004Search" styleId="mainForm">
    <%--
    -- search condition 1
    --%>
    <table class="gscm_search">
        <colgroup>
            <col class="search_rt_typ" />
            <col class="search_pkg_item_no" />
            <col class="search_model_cd" />
        </colgroup>
        <tr>
            <th>
                <bean:message key="label.rtTyp" />
            </th>
            <th>
                <bean:message key="label.pkgItemNo" />
            </th>
            <th>
                <bean:message key="label.modelCd" />
            </th>
        </tr>
        <tr>
            <td>
                <html:select property="wt004CriteriaDomain.rtTyp" styleClass=""
                    errorStyleClass="rt_typ gscm_error_class" styleId="rtTyp">
                    <html:options collection="flg" property="id" labelProperty="name" />
                </html:select>
            </td>
            <td>
                <html:text property="wt004CriteriaDomain.pkgItemNo" maxlength="27" styleClass="pkg_item_no"
                    errorStyleClass="pkg_item_no gscm_error_class" styleId="pkgItemNo" />
            </td>
            <td>
                <html:text property="wt004CriteriaDomain.modelCd" maxlength="27" styleClass="model_cd"
                    errorStyleClass="model_cd gscm_error_class" />
            </td>
        </tr>
    </table>
    <%--
    -- buttons 1
    --%>
    <table class="gscm_search_button">
        <tr>
            <td class="right">
                <html:button property="" onclick="submitSearch('Wt004Search.do', this.form); return false;">
                    <bean:message key="button.search" />
                </html:button>
            </td>
        </tr>
    </table>
    <hr />
    <logic:notEmpty name="WT004Form" property="wt004ListDomainList" >
    <%--
    -- buttons 2
    --%>
    <table class="gscm_select_button">
        <tr>
            <td>
                <html:button property="" onclick="selectValue();">
                    <bean:message key="button.pkgSelect" />
                </html:button>
            </td>
        </tr>
    </table>
    <%--
    -- page control
    --%>
    <table class="gscm_page_control">
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
            <col class="resultlist_rt_typ" />
            <col class="resultlist_pkg_item_no" />
            <col class="resultlist_model_cd" />
            <col class="resultlist_pkg_mtrl_nm" />
        </colgroup>
        <thead>
        <tr>
            <th>
                <bean:message key="label.ck" />
            </th>
            <th>
                <bean:message key="label.rtTyp" />
            </th>
            <th>
                <bean:message key="label.pkgItemNo" />
            </th>
            <th>
                <bean:message key="label.modelCd" />
            </th>
            <th>
                <bean:message key="label.pkgMtrlNm" />
            </th>
        </tr>
        </thead>
        <tbody>
        <logic:iterate id="wt004ListDomain" name="WT004Form" property="wt004ListDomainList"
            indexId="index">
            <ai:stripeline number="${index + 1}" odd="gscm_odd" even="gscm_even">
            <tr>
            <td class="check" align="center">
                <input type="radio" name="selected" value="1" />
            </td>
            <td>
                <html:text name="wt004ListDomain" property="rtTyp" 
                    value="${wt004ListDomain.rtTyp}" styleClass="rt_typ gscm_disptext"
                    readonly="true" indexed="true" />
            </td>
            <td>
                <html:text name="wt004ListDomain" property="pkgItemNo" 
                    value="${wt004ListDomain.pkgItemNo}" styleClass="pkg_item_no gscm_disptext"
                    readonly="true" indexed="true" />
            </td>
            <td>
                <html:text name="wt004ListDomain" property="modelCd" 
                    value="${wt004ListDomain.modelCd}" styleClass="model_cd gscm_disptext"
                    readonly="true" indexed="true" />
            </td>
            <td>
                <html:text name="wt004ListDomain" property="pkgMtrlNm" 
                    value="${wt004ListDomain.pkgMtrlNm}" styleClass="pkg_mtrl_nm gscm_disptext"
                    readonly="true" indexed="true" />
            </td>
            </tr>
            </ai:stripeline>
        </logic:iterate>
        </tbody>
    </table>
    </logic:notEmpty>
    <%--
    -- hidden
    --%>
    <html:hidden property="windowId" />
    <html:hidden property="wt004CriteriaDomain.ownerComp" styleId="wt004CriteriaDomain.ownerComp" />
</html:form>