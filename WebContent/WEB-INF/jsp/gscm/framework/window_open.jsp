<%--
 * Project : GSCM 共通機能群
 * トップ画面から業務画面用のブラウザを起動するJSPです。
 * Project : GSCM Common Functions
 * Open browser for work window from top window
 * Copyright (c) 2013 DENSO IT SOLUTIONS,INC. All rights reserved.
--%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <%@ include file="/WEB-INF/jsp/includes/gscm/framework/html_header.jspf"%>
</head>
<body onload="windowOpenLoad(this.name, '${param.executeActionPath}')">
    <html:form action="/GSCMWindowOpenAction" method="post">
        <input type="hidden" name="windowId"/>
    </html:form>
</body>
</html>