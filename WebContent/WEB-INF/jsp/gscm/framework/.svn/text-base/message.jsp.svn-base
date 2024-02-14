<%--
 * Project : GSCM 共通機能群
 * 画面のメッセージ部分です。
 * Project : GSCM Common Functions
 * Message part of window
 *
 * Version.
 * 1.0.1
 *
 * Copyright (c) 2013 DENSO IT SOLUTIONS,INC. All rights reserved.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<logic:messagesPresent>
    <%-- エラー(E)メッセージの表示 --%>
    <%-- Display error(E) message --%>
    <font color="#ee0000">
        <html:messages id="error" locale="${locale_key}" message="false">
            <bean:write name="error" ignore="true" />
            <br />
        </html:messages>
    </font>
</logic:messagesPresent>
<%-- 通常(I)メッセージの表示 --%>
<%-- Display usual(I) message --%>
<logic:messagesPresent message="true">
    <font color="#000000">
        <html:messages id="message" locale="${locale_key}" message="true">
            <bean:write name="message" ignore="true" /><br />
        </html:messages>
    </font>
</logic:messagesPresent>