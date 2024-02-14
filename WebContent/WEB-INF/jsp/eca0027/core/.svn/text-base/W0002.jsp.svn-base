<%--
 * W0002.jsp
 * 
 * メニュー画面のJSPです。
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 --%>
<%@ page import="com.globaldenso.eca0027.core.common.constants.Eca0027Constants" %>
<html:form action="/W0002Init" styleId="mainForm">
<div class="main">
    <%-- 個人設定 --%>
    <div class="disp_none" id="personal_setup">
        <table class="single">
            <tr>
                <%-- 言語 --%>
                <td class="label"><bean:message key="label.language" /></td>
                <td>
                    <html:select property="listDomain.userLngCd" styleClass="gscm_required w0002_userLngCd" errorStyleClass="gscm_error_class w0002_userLngCd">
                        <html:options collection="lang" property="id" labelProperty="name" />
                    </html:select>
                </td>
            </tr>
            <tr>
                <%-- タイムゾーン --%>
                <td class="label"><bean:message key="label.timeZone" /></td>
                <td>
                    <html:select property="listDomain.timezoneId" styleClass="gscm_required w0002_timezoneId" errorStyleClass="gscm_error_class w0002_timezonIde">
                        <html:options collection="timezone" property="id" labelProperty="name" />
                    </html:select>
                </td>
            </tr>
            <tr>
                <%-- デフォルト文字コード --%>
                <td class="label"><bean:message key="label.characterCode" /></td>
                <td>
                    <html:select property="listDomain.charCd" styleClass="gscm_required w0002_charCd" errorStyleClass="gscm_error_class w0002_charCd">
                        <html:options collection="charCd" property="id" labelProperty="name" />
                    </html:select>
                </td>
            </tr>
        </table>
        <p><bean:message key="label.messageCharCd" /></p>
        <div>
            <%-- 設定ボタン --%>
            <html:button property="setup" styleClass="setup" onclick="setup();">
                <bean:message key="button.setup" />
            </html:button>
        </div>
    </div>
    
    <div class="left_box">
        <ul class="menu nexus_menu">
            <li>
                <a href="javascript:void(0)"><bean:message key="label.nexus" /></a>
                <logic:notEmpty name="W0002Form" property="listDomain.menuList">
                    <ul class="sub_menu">
                        <logic:iterate name="W0002Form" property="listDomain.menuList" id="menuList" scope="request" indexId="idx">
                            <%-- 下位メニューあり --%>
                            <c:if test="${menuList.actionPath == null}">
                                <li>
                                    <a href="javascript:void(0)"><bean:write name="menuList" property="screenNm" /></a>
                                    <logic:notEmpty name="W0002Form" property="listDomain.menuList[${idx}].subMenuList">
                                        <ul class="sub_menu_2">
                                            <logic:iterate name="W0002Form" property="listDomain.menuList[${idx}].subMenuList" id="subMenuList" scope="request" >
                                                <c:if test="${subMenuList.permitted}">
                                                    <li>
                                                        <html:link href="#" onclick="gscm.commonSubmit('${subMenuList.actionPath}', mainForm)">
                                                            <bean:write name="subMenuList" property="screenNm" />
                                                        </html:link>
                                                    </li>
                                                </c:if>
                                                <c:if test="${!subMenuList.permitted}">
                                                    <li class="disable_menu">
                                                        <bean:write name="subMenuList" property="screenNm" />
                                                    </li>
                                                </c:if>
                                            </logic:iterate>
                                        </ul>
                                    </logic:notEmpty>
                                </li>
                            </c:if>
                            <%-- 2階層目のみ・権限あり --%>
                            <c:if test="${menuList.actionPath != null && menuList.permitted}">
                                <li>
                                    <html:link href="#" onclick="gscm.commonSubmit('${menuList.actionPath}', mainForm)">
                                        <bean:write name="menuList" property="screenNm" />
                                    </html:link>
                                </li>
                            </c:if>
                            <%-- 2階層目のみ・権限なし --%>
                            <c:if test="${menuList.actionPath != null && !menuList.permitted}">
                                <li class="disable_menu">
                                    <bean:write name="menuList" property="screenNm" />
                                </li>
                            </c:if>
                        </logic:iterate>
                    </ul>
                </logic:notEmpty>
            </li>
            <li>
                <a href="javascript:void(0)"><bean:message key="label.otherServers" /></a>
                <logic:notEmpty name="W0002Form" property="listDomain.serverList">
                    <ul class="sub_menu">
                    <logic:iterate name="W0002Form" property="listDomain.serverList" id="server" scope="request" indexId="idx">
                        <li>
                            <html:link href="#" onclick="location.href='${server.url}'">
                                <bean:write name="server" property="serverNm" />
                            </html:link>
                        </li>
                    </logic:iterate>
                    </ul>
                </logic:notEmpty>
            </li>
        </ul>
        <%-- 他システムメニュー --%>
        <ul class="menu other_menu">
            <logic:notEmpty name="W0002Form" property="listDomain.otherMenuList">
                <logic:iterate name="W0002Form" property="listDomain.otherMenuList" id="otherMenuList" indexId="idx">
                    <li>
                        <html:link href="#" onclick="location.href='${otherMenuList.url}'">
                            <bean:write name="otherMenuList" property="sysNm" />
                        </html:link>
                    </li>
                </logic:iterate>
            </logic:notEmpty>

            <c:set var="dscId" value="<%= DensoContext.get().getDscId() %>" />
            <logic:match name="dscId" value="10088NXS">
                <br />
                <c:out value="< For test >" />
                <li>
                    <%-- テスト用ページ --%>
                    <html:link href="#" onclick="gscm.commonSubmit('X9001Init.do', mainForm)">Test Page</html:link>
                </li>
                <li>
                    <%-- リソースクリア --%>
                    <html:link href="#" onclick="gscm.commonSubmit('W0002ClearResource.do', mainForm)">Clear Resource</html:link>
                </li>
            </logic:match>
        </ul>
    </div>
    
    <div class="right_box">
        <%-- タスクリスト --%>
        <div class="task_list">
            <div class="list_title">
                <h3 class="info">
                    <bean:message key="label.contents" />
                </h3>
            </div>
            <div class="taskContent">
                <logic:notEmpty name="W0002Form" property="listDomain.cigmaStatusList">
                <bean:message key="label.messageTask" />
                <table id="nightBatch" class="grid">
                    <colgroup>
                        <col class="shipper" />
                        <col class="time_zone" />
                        <col class="start_time" />
                    </colgroup>
                    <tr>
                        <th class="shipper">
                            <bean:message key="label.shipper" />
                        </th>
                        <th class="time_zone2">
                            <bean:message key="label.timeZone2" />
                        </th>
                        <th class="start_time">
                            <bean:message key="label.startTime" />
                        </th>
                    </tr>
                    <logic:iterate name="W0002Form" property="listDomain.cigmaStatusList" id="cigmaStatusList" scope="request" indexId="idx">
                    <tr>
                        <td>
                            <bean:write name="cigmaStatusList" property="compCd" />
                        </td>
                        <td>
                            <html:text name="cigmaStatusList" property="timezoneName" indexed="true" styleClass="w0002_time_zone_disptext gscm_disptext" readonly="true" />
                        </td>
                        <td>
                            <bean:write name="cigmaStatusList" property="nightBatStrtTime" />
                        </td>
                    </tr>
                    </logic:iterate>
                </table>
                </logic:notEmpty>
            </div>
        </div>
        
        <%-- System Information --%>
        <div class="sys_info_list">
            <div class="list_title">
                <h3 class="info">
                    <bean:message key="label.systemInformation" />
                </h3>
            </div>
            <%-- お知らせ一覧 --%>
            <div class="infomation_list">
                <logic:notEmpty name="W0002Form" property="listDomain.systemInfoList">
                <ul>
                    <bean:size name="W0002Form" property="listDomain.systemInfoList" id="list_size"/>
                    <logic:iterate name="W0002Form" property="listDomain.systemInfoList" id="systemInfoList" scope="request" indexId="idx">
                        <li class="info">
                            <%-- お知らせ日付 --%>
                            <bean:write name="systemInfoList" property="pubStrtDt" />&nbsp;&nbsp;
                            <%-- お知らせタイトル --%>
                            <a href="javascript:void(0)" onclick="clickInfo('sysinfo_${idx}','${list_size}');">
                                <bean:write name="systemInfoList" property="subject" />
                            </a>
                            <%-- お知らせ内容 --%>
                            <div class="disp_none" id="sysinfo_${idx}">
                                <c:forTokens var="line" items="${W0002Form.listDomain.systemInfoList[idx].contents}" delims="<%= Eca0027Constants.CONTENTS_NEWLINE_MARK %>">
                                    <c:out value="${line}" /><br />
                                </c:forTokens>
                            </div>
                        </li>
                    </logic:iterate>
                    <logic:greaterThan name="list_size" value="3">
                        <li class="infoCont">
                            <a href="javascript:void(0)" class="openInfo">
                                <font><bean:message key="label.others" />&nbsp;${list_size - 3}</font>
                            </a>
                            <a href="javascript:void(0)" class="closeInfo">
                                <font><bean:message key="label.close" /></font>
                            </a>
                        </li>
                    </logic:greaterThan>
                </ul>
                </logic:notEmpty>
            </div>
        </div>
        
        <%-- Business Information --%>
        <div class="biz_info_list">
            <div class="list_title">
                <h3 class="info">
                    <bean:message key="label.businessInformation" />
                </h3>
            </div>
            <%-- お知らせ一覧 --%>
            <div class="infomation_list">
                <logic:notEmpty name="W0002Form" property="listDomain.businessInfoList">
                <ul>
                    <bean:size name="W0002Form" property="listDomain.businessInfoList" id="list_size"/>
                    <logic:iterate name="W0002Form" property="listDomain.businessInfoList" id="businessInfoList" scope="request" indexId="idx">
                        <li class="info">
                            <%-- お知らせ日付 --%>
                            <bean:write name="businessInfoList" property="pubStrtDt" />&nbsp;&nbsp;
                            <%-- お知らせタイトル --%>
                            <a href="javascript:void(0)" onclick="clickInfo('bizinfo_${idx}','${list_size}');">
                                <bean:write name="businessInfoList" property="subject" />
                            </a>
                            <%-- お知らせ内容 --%>
                            <div class="disp_none" id="bizinfo_${idx}">
                                <c:forTokens var="line" items="${W0002Form.listDomain.businessInfoList[idx].contents}" delims="<%= Eca0027Constants.CONTENTS_NEWLINE_MARK %>">
                                    <c:out value="${line}" /><br />
                                </c:forTokens>
                            </div>
                        </li>
                    </logic:iterate>
                    <logic:greaterThan name="list_size" value="3">
                        <li class="infoCont">
                            <a href="javascript:void(0)" class="openInfo">
                                <font><bean:message key="label.others" />&nbsp;${list_size - 3}</font>
                            </a>
                            <a href="javascript:void(0)" class="closeInfo">
                                <font><bean:message key="label.close" /></font>
                            </a>
                        </li>
                    </logic:greaterThan>
                </ul>
                </logic:notEmpty>
            </div>
        </div>
    </div>
    <br clear="all" />
</div>
<%--
-- hidden
--%>
<html:hidden property="callScreenId" />
<html:hidden property="listDomain.userLngCd" />
<html:hidden property="listDomain.timezoneId" />
<html:hidden property="listDomain.charCd" />
</html:form>
