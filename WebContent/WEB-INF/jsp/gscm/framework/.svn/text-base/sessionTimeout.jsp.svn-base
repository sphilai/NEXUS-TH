<%@ page session="false" %>
<%--
 * [EN] Session timeout screen
 * [JP] セッションタイムアウト画面
 *
 * $Id: sessionTimeout.jsp 6800 2017-11-27 00:40:17Z 81083S603016 $
 *
 * Copyright (c) 2017 DENSO CORPORATION. All rights reserved.
--%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible"  content="IE=Edge" />
    <meta http-equiv="Pragma"           content="no-cache" />
    <meta http-equiv="Cache-Control"    content="no-cache, no-store" />
    <meta http-equiv="Expires"          content="-1" />
    <title>Session timeout</title>
    
    <%--
      外部ファイルを読み込むとそのファイルの読み込みがセッションタイムアウトとなるため、
      最低限必要なスタイルを記載
    --%>
    <style type="text/css">
    html {
        width: 100%;
        height: 100%;
    }
    
    body {
        height: 100%;
        width: 100%;
        background-color: #f2f7fe;
    }
    </style>
    
    <%-- アプリ基盤提供、ショートカットキー抑制部品 --%>
    <%-- Control part of shortcut key provided from aplication base --%>
    <ai:shortcutkeydisable config="/WEB-INF/conf/gscm/framework/disabledKey.xml"/>
</head>
<body oncontextmenu="return false;">
    <p>Your session has expired.</p>
    <p>セッションがタイムアウトしました。</p>
    
    <!--
      [EN] To prevent IE's simplified display function of HTTP error message from being used, 
      [EN] the content size of HTML which is generated from this JSP must be equal to or higher than 512 bytes.
      [JP] IEの「HTTPエラーメッセージを簡易表示する」がオンの場合に簡易表示されないように
      [JP] コンテンツサイズが512バイト未満にならないようにすること。
    -->
    
    <%-- memo (1)
      [EN] We want to separate the following JavaScript from this JSP and make it to JS file, 
      [EN] but if do so, the loading process of the JS file is treated as session timeout 
      [EN] and the JavaScript does not work as planned.
      [EN] So we define these directly.
      [JP] JavaScriptファイルに分割すると、そのファイルの読み込み処理もセッション
      [JP] タイムアウトと判定されて意図通りに動かないため、直接記載している。
    --%>
    <%-- memo (2)
      [EN] In view of asynchronous communication (modal dialog), we don't use "onload" option 
      [EN] and make the following JavaScript function to run at the timing of loading.
      [JP] 非同期通信(モーダルダイアログ)の場合も考慮し、onloadではなく、
      [JP] 読み込まれたタイミングで関数を実行するようにしておく。
    --%>
    <script>
        function closeWindow() {
            var msg = 'Your session has expired.\n'
                + 'If you click the [OK] button, the window closes.\n'
                + 'セッションがタイムアウトしました。\n'
                + '[OK]ボタンをクリックすると、ウィンドウを閉じます。';
            alert(msg);
            
            // Close window
            window.open('about:blank', '_self').close();
        }
        
        setTimeout(closeWindow, 100);
    </script>
</body>
</html>
