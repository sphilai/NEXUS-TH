<%--
 * Project : GSCM 共通機能群
 * Jump機能又はメニューにて業務画面用へ遷移するJSPです。
 * Project : GSCM Common Functions
 * Jsp for transiting to work window with Jump function or menu
 * Copyright (c) 2013 DENSO IT SOLUTIONS,INC. All rights reserved.
--%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <%@ include file="/WEB-INF/jsp/includes/gscm/framework/html_header.jspf"%>
</head>
<body onload="screenJumpLoad(this.name, '${param.executeActionPath}')">
    <html:form action="/ScreenJumpAction" method="post">
        <input type="hidden" name="windowId"/>
    </html:form>
</body>
</html>