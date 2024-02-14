<%--
 * Project : GSCM
 * 
 * W8004 - Progress Control RTN Info
 *
 * $Revision: 7682 $
 * 
 * Copyright (c) 2013 DENSO CORPORATION. All rights reserved.
 --%>

<html:form action="/W8004Init" styleId="mainForm">
    <%--
    -- Progress Detail
    --%>
    <table class="grid table_header1" >
        <colgroup>
            <col class="grid_header1" />
            <col class="grid_contents1" />
            <col class="grid_void" />
        </colgroup>
        <tr>
            <th class="right">
                <bean:message key="label.cmlNo" />
            </th>
            <td class="grid_cml">
                <html:text property="w8004CriteriaDomain.cmlNo" styleClass="grid_contents1 gscm_disptext" readonly="true"/>
            </td>
            <%--
              -- Dummy text box in order to get cursor on read only dialog.
              --%>
            <td class="grid_void">
                <input type="text" name="grid_void" class="grid_void" >
            </td>
        </tr>
    </table>
    <br />
    <%--
    -- search results
    --%>
    <logic:notEmpty name="W8004Form" property="w8004ListDomainList">
        <table id="tablefix" class="gscm_resultlist">
            <colgroup>
                <col class="resultlist_pltz_item_no" />
                <col class="resultlist_model_cd" />
                <col class="resultlist_item_description" />
                <col />
            </colgroup>
            <thead>
                <tr>
                    <th>
                        <bean:message key="label.packageItemNo" />
                    </th>
                    <th>
                        <bean:message key="label.model" />
                    </th>
                    <th>
                        <bean:message key="label.description" />
                    </th>
                    <th>
                        <bean:message key="label.qty" />
                    </th>
                </tr>
            </thead>
            <tbody>
                <logic:iterate name="W8004Form" property="w8004ListDomainList" id="w8004ListDomainList" indexId="idx">
                    <ai:stripeline number="${idx + 1}" odd="gscm_odd" even="gscm_even">
                        <tr>
                            <td class="left">
                                <html:text name="w8004ListDomainList" property="pltzItemNo" indexed="true" styleClass="w8004_pltz_item_no gscm_disptext" readonly="true" />
                            </td>
                            <td class="left">
                                <html:text name="w8004ListDomainList" property="modelCd" indexed="true" styleClass="w8004_model_cd gscm_disptext" readonly="true" />
                            </td>
                            <td class="left">
                                <html:text name="w8004ListDomainList" property="itemDescription" indexed="true" styleClass="w8004_item_description gscm_disptext" readonly="true" />
                            </td>
                            <td class="right">
                                <bean:write name="w8004ListDomainList" property="qty" />
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
    <html:hidden property="callScreenId" />
</html:form>
