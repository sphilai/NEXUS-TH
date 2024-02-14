<%--
 * base.jsp
 *
 * レイアウトを構成するJSPです。
 * 全ての画面のベースとなります。
 * Jsp of composing layout
 * Base for all windows
 *
 * Version.
 * 1.1.0
 *
 * Copyright (c) 2013 DENSO IT SOLUTIONS,INC. All rights reserved.
--%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd"> 
<html>
    <head>
        <base target="_self" />
<!-- FW基盤機能集中エリア 改変した場合は改変者にて動作検証を行う事 -->
<!-- Concentration area of Framework base function  In case of update,update user must validate run-->
        <c:set var="warningDialogToAction" scope="request">
            <html:rewrite action="${gscmWarningDialogToSubmitActionPath}"></html:rewrite>
        </c:set>
        <%-- tiles-defs.xmlからの設定値取得 --%>
        <%-- Get value setting from tiles-defs.xml --%>
        <%-- ヘッダー部閉じるボタン表示制御フラグ --%>
        <%-- Control flag of close button at header part --%>
        <bean:define id="windowCloseFlg">
            <tiles:getAsString name="windowCloseFlg" />
        </bean:define>
        <%-- システム名 --%>
        <%-- System name --%>
        <bean:define id="systemName" toScope="request">
            <tiles:getAsString name="systemName" />
        </bean:define>
        <%-- システムID --%>
        <%-- System id --%>
        <c:set var="systemId" scope="request">
            <tiles:getAsString name="systemId" ignore="true" />
        </c:set>
        <%-- メッセージウィンドウサイズ --%>
        <%-- Size of message window --%>
        <bean:define id="messageHeight" type="java.lang.String">
            <tiles:getAsString name="message_area_height" />
        </bean:define>
        <%-- 画面名 --%>
        <%-- Screen name --%>
        <bean:define id="screenName">
            <bean:message key="screenName.${screenId}" locale="${locale_key}" />
        </bean:define>
        <%-- プロジェクト共通cssプレフィックス名 --%>
        <%-- Prefix name of project common css --%>
        <c:set var="myCssPrefix">
            <tiles:getAsString name="css_prefix" />
        </c:set>
        <%-- プロジェクト共通jsファイルプレフィックス名 --%>
        <%-- File prefix name of project common js --%>
        <c:set var="myJs">
            <tiles:getAsString name="js_filepath" />
        </c:set>
        <%-- プロジェクトトップ画面判断フラグ --%>
        <%-- Judgement flag of project top window --%>                
        <bean:define id="topFlg" toScope="request">
            <tiles:getAsString name="topFlg" />
        </bean:define>
        <%-- ダーティチェック実施フラグ --%>
        <%-- Execution flag for dirty check --%>
        <c:set var="executeDirtyCheck" scope="request">
            <tiles:getAsString name="executeDirtyCheck" ignore="true" />
        </c:set>
        <bean:define id="popupFlg">
            <tiles:getAsString name="popupFlg" />
        </bean:define>
        <%-- プロジェクトヘッダー欄要否判断フラグ --%>
        <bean:define id="subScreenFlg" toScope="request">
            <tiles:getAsString name="subScreenFlg" />
        </bean:define>
        <%-- リクエストパラメータよりWindowIdを取得 --%>
        <%-- Get WindowId from request parameter --%>
        <bean:parameter id="windowId" name="windowId" />
        <meta http-equiv="X-UA-Compatible" content="IE=8" />
        <%@ include file="/WEB-INF/jsp/includes/eca0027/core/html_header.jspf"%>
        <%@ include file="/WEB-INF/jsp/includes/gscm/framework/message.jspf"%>
        <%-- タイトル --%>
        <%-- Title --%>
        <title></title>
        <script language="JavaScript">
        <!--//
            // サブ画面(モーダル起動)用にwindow.name設定
            // Set window.name for sub screen(modal activation)
            if ("" == window.name) {
                window.name = "${windowId}";
            }
            // タイトル設定
            // Set title
            top.document.title = "${screenId}".substring(1,5) + " - " + "${screenName}" + " - " + "${systemName}";

            // メッセージエリアの高さ取得
            // Get height of message area
            var messageHeight = ${messageHeight};
            
            // 画面起動最大数
            // Maxmum number of window open
            gscm.maxwincnt = '<c:catch><bean:message key="maxwincnt" /></c:catch>';
            
            // TOP画面フラグ
            // Top window flag
            var topFlg = ${topFlg};
            
            // 「閉じる」ボタン表示フラグ
            // Display flag of close button
            var windowCloseFlg = ${windowCloseFlg};

            // ポップアップ画面フラグ
            // Popup window flag
            popupFlg = ${popupFlg};

            // セッションタイムアウト値設定
            // Set value of session time out
            var GSCM_SessionTime = '<c:catch><bean:message key="sessionTime" /></c:catch>';
            
            // サブミット時に利用する画面IDを設定(画面情報スタック機能にて利用する)
            // Set screen ID used for submit(Use at function of screen information stack)
            submittedScreenId = "${screenId}";
            
            // tiles-defs.xmlに設定するシステムIDをJavaScript変数のSystemIdへ設定する
            // Set system ID ,which is set at tiles-defs.xml, to SystemId of JavaScript variable
            systemId = "${systemId}";
            
            // tiles-defs.xmlに設定するダーティチェックフラグをJavaScript変数のexecuteDirtyCheckへ設定する
            // Set dirty check flag,which is set at tiles-defs.xml,to executeDirtyCheck of JavaScript variable
            executeDirtyCheck = "${executeDirtyCheck}";

            // 非活性にするエレメント名の配列
            var disableElements = [
            <c:if test="${!empty requestScope['disableElementList']}">
                <c:forEach var="disableElement" items="${requestScope['disableElementList']}" varStatus="status">
                    <c:if test="${status.first}">
                        "${disableElement}"
                    </c:if>
                    <c:if test="${!status.first}">
                        , "${disableElement}"
                    </c:if>
                </c:forEach>
            </c:if>
            ];
            
            // ワーニングダイアログ出力
            // Show warning dialog
            function showWarningDialog() {
                if (confirm("${gscmWarningDialogMessage}")) {
                    var formObj = document.forms["${gscmWarningDialogToSubmitFormName}"];
                    var actionPath = "${warningDialogToAction}?gscmWarningDialogOKFlg=true";
                    gscm.commonSubmit(actionPath, formObj);
                }
            }
            
            // J/Sで使用するメッセージ
            // Messages used in J/S
            msg.openNewMsg = '<c:catch><bean:message key="NXS-I1-0010" locale="${locale_key}" /></c:catch>';
        //-->
        </script>
        <c:if test="${!empty myJs}">
            <script type="text/javascript" src="${pageContext.request.contextPath}/${myJs}?version=${initParam['version']}"></script>
        </c:if>
        <c:if test="${!empty myCssPrefix}">
            <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/${myCssPrefix}.css?version=${initParam['version']}" />
        </c:if>
        <%-- ワーニングダイアログ表示用メッセージが設定されている場合のみ、onLoad時に確認ダイアログを表示させる --%>
        <%-- Only when message for warning dialog display,display confirmation dailog at onLoad --%>
        <c:if test="${!empty gscmWarningDialogMessage}">
            <c:set var="showWarningDialog" value="showWarningDialog();"/>
        </c:if>
        <%-- アプリ基盤提供、ショートカットキー抑制部品 --%>
        <%-- Control part of shortcut key provided from aplication base --%>
        <ai:shortcutkeydisable config="/WEB-INF/conf/gscm/framework/disabledKey.xml"/>
    </head>
    <body onload="gscm.load(this.name);${showWarningDialog}" onunload="gscm.unload(this.name)"  onContextmenu="return false" >
<!-- FW基盤機能集中エリア ここまで -->
<!-- Concentration area of Framework base End -->
        <!-- ヘッダブロック -->
        <!-- Block of header -->
        <!-- プロジェクトヘッダー欄要否判断 -->
        <c:if test="${!subScreenFlg}">
            <div id="gscm_header">
                <tiles:insert attribute="header" />
            </div>
        </c:if>
        <!-- メニューブロック -->
        <!-- Block of menu -->
        <div id="gscm_menu">
            <tiles:insert attribute="menu" />
        </div>
        <!-- タイトルブロック -->
        <!-- Block of title -->
        <div id="gscm_title">
            <h3>
                &nbsp;${screenId} ${screenName}
            </h3>
        </div>
        <!-- メッセージブロック -->
        <!-- Block of message -->
        <div id="gscm_message">
            <tiles:insert attribute="message" />
        </div>
        <!-- 業務定義ブロック -->
        <!-- Block of work definition -->
        <div id="${subScreenFlg?'nexus_wrapper_popup':'gscm_wrapper'}">
            <div id="gscm_main">
                <tiles:insert attribute="body" />
                <%--
                == Delete for XSS
                ==<html:form action="/WindowOpenTopToAplAction" method="post">
                ==    <input type="hidden" name="executeActionPath"/>
                ==    <input type="hidden" name="windowId"/>
                ==    <input type="hidden" name="ownerCompCd"/>
                ==    <input type="hidden" name="languageCd"/>
                ==    <input type="hidden" name="timeZone"/>
                ==    <input type="hidden" name="popupFlg"/>
                ==</html:form>
                ==<c:if test="${!topFlg}">
                ==<html:form action="/ScreenJumpAction" method="post">
                ==    <input type="hidden" name="executeActionPath"/>
                ==    <input type="hidden" name="windowId"/>
                ==    <input type="hidden" name="popupFlg"/>
                ==</html:form>
                ==</c:if>
                --%>
            </div>
        </div>
    </body>
</html>