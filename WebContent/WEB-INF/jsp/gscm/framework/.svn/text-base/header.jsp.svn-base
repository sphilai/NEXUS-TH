<%--
 * Project : GSCM 共通機能群
 * 画面のヘッダです。
 * Project : GSCM Common Functions
 * Header of screen
 * Copyright (c) 2013 DENSO IT SOLUTIONS,INC. All rights reserved.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>
<div class = "gscm_top_left">
    <table>
        <tr>
            <%-- システムタイトルブロック --%>
            <%-- Block of system title  --%>
            <td>
                <h1>
                    ${systemName}
                </h1>
            </td>
            <%-- メニューボタンブロック --%>
            <%-- Block of menu button  --%>
            <td>
                <html:button property="menuBtn" onmouseover="gscm.openMenu()">
                    <bean:message key="label.menuTitle" locale="${locale_key}" />
                </html:button>
            </td>
            <%-- ジャンプ機能ブロック --%>
            <%-- Block of jump function  --%>
            <td>
                <input type="text" name="jump" tabindex="-1" id="gscm_goText"/>
                <html:button property="go" styleClass="gscm_goButton" onclick="">
                    <bean:message key="label.menuGo" locale="${locale_key}" />
                </html:button>
            </td>
            <!-- 戻るボタンブロック -->
            <%-- Block of return button  --%>
            <logic:notEmpty name="returnAction">
                <td>
                    <html:button property="returnBtn" onclick="gscm.submitBack('${returnAction}', document.forms[1])">
                        <bean:message key="button.return" locale="${locale_key}" />
                    </html:button>
                </td>
            </logic:notEmpty>
            <!-- 画面名表示エリアブロック -->
            <%-- Block of display window name area --%>
            <!-- ユーザー名 -->
            <!-- User name -->
            <td class="userName">
                <bean:message key="label.userName" locale="${locale_key}" />
                <bean:message key="split.colon" locale="${locale_key}" />
                ${headerUserName}
            </td>
            <td>
            </td>
            <!-- 責任会社名 -->
            <!-- Own company name -->
            <td class="companyName">
                <bean:message key="label.companyName" locale="${locale_key}" />
                <bean:message key="split.colon" locale="${locale_key}" />
                ${headerOwnerCompName}
            </td>
        </tr>
    </table>
</div>

<div class = "gscm_top_right">
    <table>
        <tr>
            <!-- 問合せ先情報ボタンブロック -->
            <!-- Block of contact information button -->
            <td>
                <html:form action="/callContactInfoDisplay" method="post">
                <html:button property="info" onclick="callContactInfo()">
                    <bean:message key="button.contactInfo" locale="${locale_key}" />
                </html:button>
                <logic:notEmpty name="headerOwnerCompCp">
                    <html:hidden property="contactInfoId" value="HELP_${systemId}_${headerOwnerCompCp}"/>
                </logic:notEmpty>
                <logic:empty name="headerOwnerCompCp">
                    <html:hidden property="contactInfoId" value="HELP_${systemId}"/>
                </logic:empty>
                <html:hidden property="locale" value="${sessionScope[locale_key]}"/>
                </html:form>
            </td>
            <!-- 閉じるボタンブロック -->
            <%-- Block of close button --%>
            <td>
                <html:button property="windowCloseBtn" onclick="windowClose()">
                    <bean:message key="button.windowClose" locale="${locale_key}" />
                </html:button>
            </td>
        </tr>
    </table>
</div>
