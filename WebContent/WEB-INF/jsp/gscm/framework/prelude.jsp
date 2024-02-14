<%--
 * prelude.jsp
 *
 * [JP] 全 JSP の先頭に自動的に挿入されるヘッダ情報です。
 * [JP]
 * [JP] JSP コンフィギュレーションを利用しています。( web.xml にて設定)
 *
 * [EN] It is the header information that is automatically inserted at the beginning of all JSP.
 * [EN]
 * [EN] I'm using the JSP configuration. (Set in web.xml)
 *
 * $ prelude.jsp 4294 2013-05-15 12:30:57Z HIDETOSHI_NAKATANI@denso.co.jp $
 *
 * Copyright (c) 2012 DENSO IT SOLUTIONS. All rights reserved.
--%>

<%-- [JP] ページ設定 --%>
<%-- [EN] Page setup --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%-- [JP] import 設定 --%>
<%-- [EN] import settings --%>
<%@ page import="com.globaldenso.ai.common.core.context.DensoContext" %>

<%-- JSTL --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"        prefix="c" %>
<%@ taglib uri="http://java.sun.com/jstl/core_rt"         prefix="c_rt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"         prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jstl/fmt_rt"          prefix="fmt_rt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/xml"         prefix="x" %>
<%@ taglib uri="http://java.sun.com/jstl/xml_rt"          prefix="x_rt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql"         prefix="sql" %>
<%@ taglib uri="http://java.sun.com/jstl/sql_rt"          prefix="sql_rt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions"   prefix="fn" %>
<%-- Struts --%>
<%@ taglib uri="http://struts.apache.org/tags-bean"       prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-logic"      prefix="logic" %>
<%@ taglib uri="http://struts.apache.org/tags-nested"     prefix="nested" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles"      prefix="tiles" %>
<%@ taglib uri="http://struts.apache.org/tags-html-el"    prefix="html" %>

<%-- [JP] その他カスタムタグ --%>
<%-- [EN] Other custom tags --%>
<%-- [JP] 必要に応じてセットして下さい --%>
<%-- [EN] Set as necessary --%>
<%@ taglib uri="http://aij2_core.globaldenso.com/customTag" prefix="aij2" %>
<%@ taglib uri="http://ai.globaldenso.com/library/presentation" prefix="ai" %>

<%-- [JP] JSTLタグのロケールの設定 --%>
<%-- [EN] Locale setting of JSTL tags --%>
<fmt:setLocale value="<%=DensoContext.get().getLocale()%>"/>
