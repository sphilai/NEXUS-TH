<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
    <head>
        <%@ include file="/WEB-INF/jsp/includes/gscm/framework/html_header.jspf"%>
        <%@ taglib uri="http://ai.globaldenso.com/library/presentation" prefix="ai" %>
        <link rel="stylesheet" type="text/css" href="css/gscm/library/ai-contactinfodisplay.css" />
        <title><bean:message key="contactinfodisplay.titleShowContactInfo" bundle="contactInfoDisplayLabel" locale="${locale_key}" /></title>
        <ai:shortcutkeydisable config="/WEB-INF/conf/gscm/framework/disabledKey.xml"/>
        
    </head>
    <body onContextmenu="return false">
        <h1 class="contactInfoDisplay">
            <bean:message key="contactinfodisplay.systemName" bundle="contactInfoDisplayLabel" locale="${locale_key}"/>
            ${systemName}<br/>
            <bean:message key="contactinfodisplay.systemId" bundle="contactInfoDisplayLabel" locale="${locale_key}" />
            ${systemId}
        </h1>

        <div id="contactInfoDisplayArea">
            ${contactInfo}
        </div>
        <input type="button" value="<bean:message key='contactinfodisplay.closeButton' bundle="contactInfoDisplayLabel" locale="${locale_key}" />" onClick="window.close()">
        <br/>
    </body>
</html>
