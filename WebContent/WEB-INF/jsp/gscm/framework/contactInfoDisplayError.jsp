<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
    <head>
        <%@ include file="/WEB-INF/jsp/includes/gscm/framework/html_header.jspf"%>
        <%@ taglib uri="http://ai.globaldenso.com/library/presentation" prefix="ai" %>
        <title><bean:message key="contactinfodisplay.titleError" bundle="contactInfoDisplayLabel" locale="${locale_key}" /></title>
        <ai:shortcutkeydisable config="/WEB-INF/conf/gscm/framework/disabledKey.xml"/>
    </head>
    <body onContextmenu="return false">
        <h1>Error: ai-contactinfodisplay_pl</h1>
        <div class="title">Error message</div>
        <html:errors />
        <c:set var="emsg" value="${MESSAGE}" />
        <c:if test="${empty emsg}">
            <c:set var="emsg"
                value="${requestScope['com.globaldenso.ai.aij2.APPLICATION_EXCEPTION_MESSAGE']}"></c:set>
        </c:if>
        <c:if test="${empty emsg}">
            <c:set var="emsg"
                value="${sessionScope['com.globaldenso.ai.aij2.APPLICATION_EXCEPTION_MESSAGE']}"></c:set>
        </c:if>
        <font color="#FF0000"> <c:out value="${emsg}" /> </font>
        
        <br />
        <br />
        <br />
        <br />
        <br />
        <div class="copyRight">
            Copyright&nbsp;&copy;&nbsp;2013&nbsp;DENSO&nbsp;CORPORATION.&nbsp;All&nbsp;rights&nbsp;reserved.
        </div>
    </body>
</html>