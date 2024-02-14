<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%--
 * error.jsp
 *
 * システムエラー画面
 *
 * $ error.jsp 2057 2012-06-01 01:55:11Z HIDETOSHI_NAKATANI@denso.co.jp $
 *
 *
 * Version.
 * 1.0.0
 *
 * Copyright (c) 2011 DENSO IT SOLUTIONS. All rights reserved.
--%>

<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isErrorPage="true" %>
<%@page import="com.globaldenso.ai.common.core.exception.AIExceptionIdentifier" %>
<%@page import="com.globaldenso.ai.common.core.exception.Exceptions" %>
<%@page import="com.globaldenso.ai.common.core.exception.SystemException" %>
<%@page import="com.globaldenso.ai.common.core.util.GeneralId" %>
<%@include file="/WEB-INF/jsp/gscm/framework/prelude.jsp" %>
<c:set var="STATUS_CODE" value="${requestScope['com.globaldenso.ai.aij2.STATUS_CODE']}"></c:set>
<c:if test="${empty STATUS_CODE}">
    <c:set var="STATUS_CODE" value="${requestScope['javax.servlet.error.status_code']}"></c:set>    
</c:if>
<c:set var="SERVLET_NAME" value="${requestScope['com.globaldenso.ai.aij2.SERVLET_NAME']}"></c:set>
<c:if test="${empty SERVLET_NAME}">
    <c:set var="SERVLET_NAME" value="${requestScope['javax.servlet.error.servlet_name']}"></c:set>
</c:if>
<c:set var="REQUEST_URI" value="${requestScope['com.globaldenso.ai.aij2.REQUEST_URI']}"></c:set>
<c:if test="${empty REQUEST_URI}">
    <c:set var="REQUEST_URI" value="${requestScope['javax.servlet.error.request_uri']}"></c:set>
</c:if>
<c:set var="EXCEPTION_TYPE" value="${requestScope['com.globaldenso.ai.aij2.EXCEPTION_TYPE']}"></c:set>
<c:if test="${empty EXCEPTION_TYPE}">
    <c:set var="EXCEPTION_TYPE" value="${requestScope['javax.servlet.error.exception_type']}"></c:set>
</c:if>
<c:set var="ERROR_MESSAGE" value="${requestScope['com.globaldenso.ai.aij2.ERROR_MESSAGE']}"></c:set>
<c:if test="${empty ERROR_MESSAGE}">
    <c:set var="ERROR_MESSAGE" value="${requestScope['javax.servlet.error.message']}"></c:set>
</c:if>
<c:set var="EXCEPTION" value="${requestScope['com.globaldenso.ai.aij2.EXCEPTION']}"></c:set>
<c:if test="${empty EXCEPTION}">
    <c:set var="EXCEPTION" value="${requestScope['javax.servlet.error.exception']}"></c:set>
</c:if>
<%
    Throwable e = (Throwable) pageContext.getAttribute("EXCEPTION");
    if (e instanceof AIExceptionIdentifier) {
        AIExceptionIdentifier identifier = AIExceptionIdentifier.class.cast(e);
        pageContext.setAttribute("ID", identifier.getId());
        pageContext.setAttribute("CODE", identifier.getCode());
        pageContext.setAttribute("DATE", identifier.getDate());
        identifier.logging();
    } else {
        String exceptClassName = e.getClass().getName();
        String exceptMessage = e.getMessage();
        String id = GeneralId.generate().toString();
        java.util.Date date = new java.util.Date();
        String errorMessage = Exceptions.getMessageBy(SystemException.DEFAULT_CODE)
            .bind((Object)exceptClassName, (Object)exceptMessage).toString();
        pageContext.setAttribute("ID", id);
        pageContext.setAttribute("CODE", SystemException.DEFAULT_CODE);
        pageContext.setAttribute("DATE", date);
        pageContext.setAttribute("ERROR_MESSAGE", errorMessage);
        Exceptions.logging(new SystemException(SystemException.DEFAULT_CODE, id, date, e, exceptClassName, exceptMessage));          
        
        pageContext.setAttribute("DSC_ID", DensoContext.get().getDscId());
    }
%>
<html>
<head>
<%@ include file="/WEB-INF/jsp/includes/gscm/framework/html_header.jspf" %>

<title>Error Page.</title>
<%-- アプリ基盤提供、ショートカットキー抑制部品 --%>
<%-- Control part of shortcut key provided from aplication base --%>
<ai:shortcutkeydisable config="/WEB-INF/conf/gscm/framework/disabledKey.xml"/>
</head>
<body onContextmenu="return false" >
<b>予期しないエラーが発生しました。</b><br />
<ul type="square">
<li>システム名 : 生産管理システム（仮）</li>
<li>ID : ${ID}</li>
<li>例外発生日時 : <fmt:formatDate value="${DATE}" pattern="yyyy-MM-dd HH:mm:ss.SSS"/></li>
</ul>
<br />
システム担当者へ通知済みです。<br />
<br />
以下の処置でシステムを再利用できる可能性があります。<br />
&nbsp;&nbsp;・システムと正しく再接続するため，開いている全てのブラウザを閉じ，新たなブラウザを用いてシステムへ接続してください。<br />
<br />
ご迷惑をおかけしました。<br />
<%-- <p style="color:red">同一DSC-IDにて、多重ログインが発生いたしました。</p>
<input type="button" value="ログアウト" /> --%>
<%-- <p>ステータスコード : ${STATUS_CODE}</p>
<p>サーブレット名 : ${SERVLET_NAME}</p>
<p>リクエストURI : ${REQUEST_URI}</p>
<p>例外タイプ : ${EXCEPTION_TYPE}</p>
<p>例外ID : ${ID}</p>
<p>例外コード : ${CODE}</p>
<p>例外メッセージ : ${ERROR_MESSAGE}</p>
<p>例外発生日時 : <fmt:formatDate value="${DATE}" pattern="yyyy-MM-dd HH:mm:ss.SSS"/></p> --%>
<%-- <p>スタックトレース :<br />
<c:forEach var="stackTraceLine" items="${EXCEPTION.stackTrace}">
    <c:out value="${stackTraceLine}" /><br />
</c:forEach>
</p> --%>
</body>
</html>
