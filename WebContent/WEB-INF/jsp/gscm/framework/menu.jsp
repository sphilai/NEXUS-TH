<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ page import="com.globaldenso.gscm.framework.util.MenuUtil" %>

<link rel="stylesheet" type="text/css" media="screen, print" href="<%= request.getContextPath() %>/css/gscm/framework/menu.css" />
<%= MenuUtil.getMenuHTML(request.getContextPath(), request.getParameter("topFlg"), request.getParameter("windowId")) %>
