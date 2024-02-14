<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%--
 * BusinessError.jsp
 *
 * 業務共通エラー画面
 *
 * Copyright (c) 2013 DENSO IT SOLUTIONS. All rights reserved.
--%>

<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isErrorPage="true" %>
<html>
<head>
<%@ include file="/WEB-INF/jsp/gscm/framework/prelude.jsp" %>
<%@ include file="/WEB-INF/jsp/includes/gscm/framework/html_header.jspf" %>

<title><bean:message key="screenName.BusinessError" /></title>
<%-- アプリ基盤提供、ショートカットキー抑制部品 --%>
<%-- Control part of shortcut key provided from aplication base --%>
<ai:shortcutkeydisable config="/WEB-INF/conf/gscm/framework/disabledKey.xml"/>
</head>
<body onContextmenu="return false" >
<p>
<html:messages id="msg" message="false">
  <bean:write name="msg" ignore="true" filter="false" />
</html:messages>
</p>

<%-- 本当はここでGSCMフレームワークのウィンドウクローズjspにフォワード？ --%>
<html:button property="" onclick="window.close();">
    <bean:message key="button.logout"/>
</html:button>
</body>
</html>
