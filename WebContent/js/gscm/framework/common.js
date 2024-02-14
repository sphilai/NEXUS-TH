﻿/*
 * Project : GSCM 共通機能群
 * Project : GSCM Common Functions
 * common.js
 * 共通で用いるJavaScriptです。
 * JavaScript used commonly
 *
 * Version.
 * 1.1.0
 *
 * Copyright (c) 2013 DENSO IT SOLUTIONS,INC. All rights reserved.
 */
var dirty = false;          // ダーティチェックフラグ Dirty check flag
var topFlg = false;         // トップ画面フラグ Top screen flag
var windowCloseFlg = false; // 閉じるボタン表示フラグ Flag of close button
var GSCM_SessionTime = '';  // セッションタイムアウト値 Value of session time out
var submittedScreenId = ''; // サブミットした画面のID Submitted Screen ID
var systemId = '';          // システムID System ID
var executeDirtyCheck = ''; // ダーティチェック実施フラグ Execute flag for dirty check
var calendarId = '';        // カレンダーのDIVタグのID DIV tag ID of calender
var popupFlg = false;       // ポップアップ画面フラグ Popup screen flag
var popupWin = new Array(); // 起動した子画面のウィンドウオブジェクト TODO 英語化
var popupWinCnt = 0;        // 起動子画面数 TODO 英語化
var popupWSize = 800;       // 子画面デフォルトサイズ(横) TODO 英語化
var popupHSize = 600;       // 子画面デフォルトサイズ(縦) TODO 英語化
/*
====================================================================
関数名：ready
引数  ：-
概要  ：ドキュメントの読み込み完了時に実行する処理。
====================================================================
====================================================================
Function name：ready
Argument  ：-
Outline  ：Execute process when finish reading document
====================================================================

*/
jQuery(document).ready(function($) {

    // トップ画面であれば、メニューボタンを非表示とする。
    // In case of top screen,make menu button hide
    if(topFlg) {
        $("#gscm_header input[name=menuBtn]").hide();
    }

    if(!windowCloseFlg) {
        $("#gscm_header input[name=windowCloseBtn]").hide();
    }

    // 画面Go
    // Screen transit
    $("#gscm_header input[type=button][name=go]").click(function() {
        funcScreenJump();
    });

    /*
    ====================================================================
        関数名:funcScreenJump
        引数:-
        概要:画面ID入力テキストに指定する、画面IDのアクションを実行する処理
    ====================================================================
    ====================================================================
    Function name：funcScreenJump
    Argument  ：-
    Outline  ： Process which specifies screen ID to input text and execute action of screen ID
    ====================================================================
    */
    function funcScreenJump() {

        // テキストに入力された、画面IDを取得
        // Get screen id input in text 
        var screenId = $("#gscm_header input[name=jump]").val();

        try {
            // 画面IDを元にメニューからactionを取得
            // Get action from menu with screen id
            var action = $("#gscm_menu a[href][name="+ screenId + "]").attr("href");
        } catch(e) {
            // 画面ID取得時にエラーが発生した時はactionが取得できない場合と同動作
            // TODO 英語化
            action = null;
        }

        //actionが取得できなければ、遷移件権限なしと判断
        //If get no action,judge as no authority of transition
        if(action == null ) {
            alert(msg.goMsg);
            return false;
        }

        // 画面IDを元にオブジェクトを取得。
        // Get object with screen id
        var actionObj = $("#gscm_menu a[href][name="+ screenId + "]");
        // オブジェクトのクリックイベントを呼び出し
        // invoke click event of object
        actionObj[0].click();
    }

    // ダーティチェック対象要素の変更確認
    // Confirm change of dirty check target
    $(".dirtyCheck > *").change(function(e) {
        if (!$(e.target).hasClass("dirtyCheckOff")) {
            dirty = true;
        }
    });

    // ヘルプキー[F1]停止
    // Help key[F1] not to use
    if(document.all){
        window.onhelp = function() {
            return false;
        }
    }

    // キーダウンイベント制御
    // Control of key down event
    $(document).keydown(function(e) {

        var cd = parseInt(e.keyCode, 10);

        // Homeキーで画面Goの画面ID入力欄にフォーカス
        // When press home key,focus screen transition to input area of screen id
        if (cd === 36) {
            $("#gscm_header input[name=jump]").focus();
        }

        if (!isNaN(cd)) {
            if (cd >= 112 && cd <= 123) {
                if (document.all) {
                    window.event.keyCode = 0;
                }

                e.preventDefault();
                e.stopPropagation();
                e.stopImmediatePropagation();

                switch (cd) {
                case 112:
                    return keyEvent_F1();
                case 113:
                    return keyEvent_F2();
                case 114:
                    return keyEvent_F3();
                case 115:
                    return keyEvent_F4();
                case 116:
                    return keyEvent_F5();
                case 117:
                    return keyEvent_F6();
                case 118:
                    return keyEvent_F7();
                case 119:
                    return keyEvent_F8();
                case 120:
                    return keyEvent_F9();
                case 121:
                    return keyEvent_F10();
                case 122:
                    return keyEvent_F11();
                case 123:
                    return keyEvent_F12();
                }
                return false;
            } else if (cd === 13 && document.activeElement.name === "jump") {
                funcScreenJump();
            }
        }
    });

    showExecutableButton();

    // メニュー部分の調整、親を探す
    // Adjust menu part and find main menu
    var $ul = $('ul.gscm_mainmenu').find('ul.subMenu');
    for(var i = 0; i < $ul.length; i++) {
      // 子の中に親がいなければ、子供は最後尾
      // If main menu is not in sub menu,sub menu move to last
      if (!$ul.eq(i).find('ul.subMenu').length) {
         $ul.eq(i).addClass('sub_last');
      }
    }

    /* メニュー */
    /* Menu */
    $('body').click(function(){
        var i = 0;
        $('ul.gscm_mainmenu li').children('ul').hide();
        $('#gscm_menu').css('display','none');
    });

    $('ul.gscm_mainmenu li').hover(function(){
        var i = 0;
        $(this).parent('ul').children('li').children('ul').hide();
        var elemLi = $(this).parent('ul').children('li');
        $(this).children('ul').show();
    });

});

var gscm = {};

(function () {
/*
====================================================================
関数名：function load
引数  ：winname ウィンドウ名
概要  ：初期処理
====================================================================
====================================================================
Function name：function load
Argument  ：Window name
Outline  ：Initialize process
====================================================================
*/
gscm.load = function (winname)
{
    setWindowStat(winname, "1");

    if (window.load && typeof window.load == "function") {
        window.load();
    }
}

/*
====================================================================
関数名：function unload
引数  ：winname ウィンドウ名
概要  ：終了処理
====================================================================
====================================================================
Function name：function unload
Argument  ：Window name
Outline  ：End process
====================================================================
*/
gscm.unload = function (winname)
{
    if (!popupFlg) {
        gscm.countDown(winname)
    }

    for (var i = 0; i < popupWinCnt; i++) {
        if (!popupWin[i].closed) {
            popupWin[i].close();
        }
    }
    popupWinCnt = 0;

    if (window.unload && typeof window.unload == "function") {
        window.unload();
    }
}


/*
====================================================================
関数名：function openMenu
引数  ：-
概要  ：メニューを開く
====================================================================
====================================================================
Function name：function openMenu
Argument  ：-
Outline  ：Open menu
====================================================================
*/
gscm.openMenu = function (){
    var divNav = document.getElementById("gscm_menu");

    if(divNav.style.display != 'block'){
        divNav.style.display = 'block';
    }
}

/*
====================================================================
関数名：function writeCalendar
引数  ：divId 表示するカレンダーのdivのID
       valNm 選択した年月日を入力するテキストのプロパティ名
       format 年月日を表示する際の日付フォーマット
       calImg カレンダーアイコンのオブジェクト
概要  ：カレンダーを描画する。
====================================================================
====================================================================
Function name：function writeCalendar
Argument  ：divId Id of display calender
       valNm Property name of text to what selected date is input
       format Format for displaying date
       calImg Object of calender icon
Outline  ：Display calender
====================================================================
*/
gscm.writeCalendar = function (divId, formName, valNm, format, calImg){
    var width = 156;
    
    // 表示中のカレンダーがあれば閉じる
    // If calender is already displayed,close the calender
    if (calendarId != '') {
        document.getElementById(calendarId).style.display = "none";
    }
    
    var dateDiv = new JKL.Calendar(divId, formName, valNm, width, '', format);

    // 表示位置を画像の位置基点に決めています。
    // Display position is position of image
    // 縦位置を設定
    // Set lengthwise
    var top = calImg.getBoundingClientRect().top;
    // 横位置を設定
    // Set crosswise
    var left = calImg.getBoundingClientRect().left + 10;

    // 基点(親要素)の位置を取得
    // Get position of basic point(parent element)
    var parent = document.getElementById(divId).parentElement;
    var parentWidth;
    var parentHeight;
    while(parent){
        var style = parent.currentStyle || document.defaultView.getComputedStyle(parent, '');
        if ("static" != style.position) {
            top -= (parent.getBoundingClientRect().top - parent.scrollTop);
            left -= (parent.getBoundingClientRect().left - parent.scrollLeft);
            parentWidth = parent.scrollWidth;
            parentHeight = parent.scrollHeight;
            break;
        }
        parent = parent.parentElement;
    }

    dateDiv.write();
    
    // 縦位置を補正
    var calHeight = document.getElementById(divId).clientHeight;
    if (parentHeight < top + calHeight) {
        top = parentHeight - calHeight
    }
    // 横位置を補正
    // Revise width position
    if (parentWidth < left + width){
        left = parentWidth - width;
    }
    document.getElementById(divId).style.top = top + "px";
    document.getElementById(divId).style.left = left + "px";
    
    // 表示中のカレンダーのDIVタグのIDを保持
    // Contain DIV tag Id of display calender 
    calendarId = divId;
}

/*
====================================================================
関数名：function commonSubmitForCheck
引数  ：action アクションパス
      ：form フォーム
      ：doubleClick 二度押し制御有無
      ：             (true:二度押し制御あり false:二度押し制御なし)
      ：dirtyCheck ダーティチェック有無
      ：            (true:ダーティチェックあり false:ダーティチェックなし)
概要  ：共通ボタンサブミット
====================================================================
====================================================================
Function name：function commonSubmitForCheck
Argument  ：action Action path
      ：form form
      ：doubleClick Exist or not exist control for duble clicking
      ：             (true:exist false:not exist)
      ：dirtyCheck Exist or not exist dirty check
      ：            (true:exist false:not exist)
Outline  ：Common button submit
====================================================================
*/
gscm.commonSubmitForCheck = function (action, form, doubleClick, dirtyCheck) {
    // ダーティチェック
    // Dirty check
    if (dirtyCheck == "true" && dirty) {
        if (!window.confirm(msg.dirtyMsg)) {
            return false;
        }
    }

    // 多重起動制御
    // Multiple execution control
    if (doubleClick != "false") {
        $("input[type=button]").attr("disabled", "disabled");
        $("a[href]").click(function(e){e.preventDefault()}).attr("href","#");
        $("a[href]").removeAttr("onClick");
    }

    try {
        // サブミットした画面の画面IDをリクエストパラメータに設定
        // Set submitted screen ID to request parameter
        action = gscm.setActionParameter(action, "submittedScreenId", submittedScreenId);
        // WindowIdをリクエストパラメータに設定し、サブミットする
        // Set Window ID at request parameter and submit
        form.action = setWindowIdParameter(action);
        return form.submit();
    } catch(e) {
        return false;
    }
}

/*
====================================================================
関数名：function commonSubmitPopup
引数  ：action アクションパス
      ：form フォーム
      ：windowId ウィンドウID
概要  ：共通ボタンサブミット(モーダル子画面用)
submitの前に、window.nameおよびform.targetに同じ値を指定する必要がある
====================================================================
====================================================================
Function name：function commonSubmitPopup
Argument  ：action Action path
      ：form form
      ：windowId Window ID
Outline  ：Common button submit(For modal sub screen)
Before submit,it is necessary to specify same value to window.name and form.target
====================================================================
*/
gscm.commonSubmitPopup = function (action, form, windowId) {
    // 多重起動制御
    // Control of multi-activation
    $("input[type=button]").attr("disabled", "disabled");
    $("a[href]").click(function(e){e.preventDefault()}).attr("href","#");
    $("a[href]").removeAttr("onClick");

    try {
        window.name = windowId;
        form.action = setWindowIdParameter(action);
        form.target = windowId;
        return form.submit();
    } catch(e) {
        return false;
    }
}

/*
====================================================================
関数名：function showModalDialog
引数  ：action アクションパス
    :args 子画面への引数(※渡す引数が無い場合はnull指定)
    :option オプション(子画面の画面サイズ等を設定するオプション)
戻り値：子画面返却値
概要  ：リクエストパラメータにウィンドウIDを追加し、モーダルの子画面を起動する。
====================================================================
====================================================================
Function name：function showModalDialog
Argument  ：action Action path
          :args Argument to child screen(*If argument does not exist,specify null)
          :option Option(Option which sets screen size of child screen and so on)
Return value  ：Return value of child screen
Outline  ：Add window id to request argument and activate sub screen with modal
====================================================================
*/
gscm.showModalDialog = function (action, args, option) {
    action = gscm.setTokenParameter(setWindowIdParameter(action));
    return window.showModalDialog(action,
                           args,
                           option
                           );
}

/*
====================================================================
関数名：function showModelessDialog
引数  ：action アクションパス
    :option オプション(子画面の画面サイズ等を設定するオプション)
戻り値：子画面返却値
概要  ：リクエストパラメータにウィンドウIDを追加し、モードレスの子画面を起動する。
====================================================================
====================================================================
Function name：function showModelessDialog
Argument  ：action Action path
          :option Option(Option which sets screen size of child screen and so on)
Return value  ：Return value of child screen
Outline  ：Add window id to request argument and activate sub screen with modeless
====================================================================
*/
gscm.showModelessDialog = function (action, option) {
    action = gscm.setTokenParameter(setWindowIdParameter(action));

    var popupLPos = Number((screen.availWidth - popupWSize)/2);
    var popupTPos = Number((screen.availHeight - popupHSize)/2);
    
    // オプションを設定する
    // TODO 英語化
    if (null == option) {
        option = "width=" + popupWSize + "px,height=" + popupHSize
                  + "px,left=" + popupLPos + "px,top=" + popupTPos + "px,resizable=yes";
    } else {
        var widthVal = popupWSize;
        var heightVal = popupHSize;
        var upperOption = option.toUpperCase();
        var options = option.split(";");
        option = '';

        // 画面表示位置の取得と画面リサイズの設定
        // TODO 英語化
        for (var i = 0; i < options.length; i++) {
            if (options[i].length > 0) {
                var splitUpperOption = options[i].toUpperCase();
                if (0 <= splitUpperOption.indexOf("WIDTH")) {
                    var width = options[i].split("=");
                    widthVal = width[1].match(/\d/g).join("");
                    popupLPos = Number((screen.availWidth - widthVal)/2);
                } else if (0 <= splitUpperOption.indexOf("HEIGHT")) {
                    var height = options[i].split("=");
                    heightVal = height[1].match(/\d/g).join("");
                    popupTPos = Number((screen.availHeight - heightVal)/2);
                } else if (0 <= splitUpperOption.indexOf("RESIZABLE")) {
                    var resizable = splitUpperOption.split("=");
                    if (0 <= resizable[1].indexOf("ON") || 0 <= resizable[1].indexOf("YES")) {
                        options[i] = "resizable=yes";
                    } else {
                        options[i] = "resizable=no";
                    }
                }
                option += options[i] + ",";
            }
        }
        
        // デフォルトを設定する
        // TODO 英語化
        option = (0 > upperOption.indexOf("WIDTH") ? option + "width=" + widthVal + "px,": option);
        option = (0 > upperOption.indexOf("HEIGHT") ? option + "height=" + heightVal + "px,": option);
        option = (0 > upperOption.indexOf("LEFT") ? option + "left=" + popupLPos + "px,": option);
        option = (0 > upperOption.indexOf("TOP") ? option + "top=" + popupTPos + "px,": option);
        option = (0 > upperOption.indexOf("RESIZABLE") ? option + "resizable=yes," : option);
        
        // 末尾の不要な","を削除
        // TODO 英語化
        option = ("," == option.slice(-1) ? option.slice(0, -1) : option);
    }

    var popupWinTemp = window.open(action,
                           "_blank",
                           option
                           );
    
    // 起動したウィンドウオブジェクトと起動数を保持
    // TODO 英語化
    popupWin[popupWinCnt] = popupWinTemp;
    popupWinCnt += 1;
    return popupWin[popupWinCnt - 1];
}

/*
====================================================================
関数名：function setTokenParameter
引数  ：action アクションパス
概要  ：アクションパスにフォーム内で保持する、トークン情報を付与する。
====================================================================
====================================================================
Function name：function setTokenParameter
Argument  ：action Action path
Outline  ：Set token information to action path maintained at form
====================================================================
*/
gscm.setTokenParameter = function (action) {
    var paramName = "org.apache.struts.taglib.html.TOKEN";
    var paramObj = document.getElementsByName(paramName)[0];
    if (paramObj) {
        action = gscm.setActionParameter(action, paramName, paramObj.value);
    }
    return action;
}

/*
====================================================================
関数名：function setActionParameter
引数  ：action アクションパス
    :paramName パラメータ名
    :paramValue 設定値
概要  ：アクションパスにパラメータで指定した名前と値をリクエストパラメータとして付与する。
====================================================================
====================================================================
Function name：function setActionParameter
Argument  ：action Action path
    :paramName Argument name
    :paramValue Value setting
Outline  ：Provide name and value specified at argument as request argument to action path 
====================================================================
*/
gscm.setActionParameter = function (action, paramName, paramValue) {
    if (0 <= action.indexOf("?")) {
        action += "&";
    } else {
        action += "?";
    }
    action += paramName + "=" + paramValue;
    return action;
}

/*
====================================================================
関数名：function setWindowId
引数  ：action アクションパス
概要  ：ウィンドウ名を取得し、アクションパスへリクエストパラメータとして付与する。
====================================================================
====================================================================
Function name：function setWindowId
Argument  ：action Action path
Outline  ：Get window name and provide it as request argument to action path 
====================================================================
*/
function setWindowIdParameter(action) {
    return gscm.setActionParameter(action, "windowId", window.name);
}

/*
====================================================================
関数名：function commonSubmit
引数  ：action アクションパス
      ：formObj フォーム
概要  ：アクションパスへリクエストを送信。
====================================================================
====================================================================
Function name：function commonSubmit
Argument  ：action Action path
      ：formObj Form
Outline  ：Send request to action path
====================================================================
*/
gscm.commonSubmit = function (action, formObj) {
    return gscm.commonSubmitForCheck(action, formObj, "true", executeDirtyCheck);
}

/*
====================================================================
関数名：function submitConfirm
引数  ：action アクションパス
      ：formObj フォーム
      ：cfmMsg 確認メッセージ
概要  ：確認ダイアログを表示後、Trueならアクションパスへリクエストを送信。
====================================================================
====================================================================
Function name：function submitConfirm
Argument  ：action Action path
      ：formObj Form
      ：cfmMsg Confirm message
Outline  ：After displaying confirmation dialog,if result is true,send request to action path
====================================================================
*/
gscm.submitConfirm = function (action, formObj, cfmMsg) {
    if (confirm(cfmMsg)) {
        formObj.target = '_self';
        // 確認ダイアログを表示するため、ダーティチェックを実施せずにサブミットする
        // For show comfirm daialog,submit without dirty check
        return gscm.commonSubmitForCheck(action, formObj, "true", "false");
    }
}
/*
====================================================================
関数名：function submitCreateConfirm
引数  ：action アクションパス
      ：formObj フォーム
概要  ：確認ダイアログを表示後、Trueならアクションパスへリクエストを送信（登録確認メッセージ固定）。
====================================================================
====================================================================
Function name：function submitCreateConfirm
Argument  ：action Action path
      ：formObj Form
Outline  ：After displaying confirmation dialog,if result is true,send request to action path(Create confirmation message is fixed)
====================================================================
*/
gscm.submitCreateConfirm = function (action, formObj) {
    return gscm.submitConfirm(action, formObj, msg.registMsg);
}
/*
====================================================================
関数名：function submitUpdateConfirm
引数  ：action アクションパス
      ：formObj フォーム
概要  ：確認ダイアログを表示後、Trueならアクションパスへリクエストを送信（更新確認メッセージ固定）。
====================================================================
====================================================================
Function name：function submitUpdateConfirm
Argument  ：action Action path
      ：formObj Form
Outline  ：After displaying confirmation dialog,if result is true,send request to action path(Update confirmation message is fixed)
====================================================================
*/
gscm.submitUpdateConfirm = function (action, formObj) {
    return gscm.submitConfirm(action, formObj, msg.updateMsg);
}
/*
====================================================================
関数名：function submitDeleteConfirm
引数  ：action アクションパス
      ：formObj フォーム
概要  ：確認ダイアログを表示後、Trueならアクションパスへリクエストを送信（削除確認メッセージ固定）。
====================================================================
====================================================================
Function name：function submitDeleteConfirm
Argument  ：action Action path
      ：formObj Form
Outline  ：After displaying confirmation dialog,if result is true,send request to action path(Delete confirmation message is fixed)
====================================================================
*/
gscm.submitDeleteConfirm = function (action, formObj) {
    return gscm.submitConfirm(action, formObj, msg.deleteMsg);
}

/*
====================================================================
関数名：function searchSubmit
引数  ：action アクションパス
      ：formNm フォーム名
      ：curPage 表示したいページ番号
概要  ：アクションパスへリクエストを送信する
        ページング処理のある画面で一覧検索を行う場合はこの関数を使うこと。
====================================================================
====================================================================
Function name：function searchSubmit
Argument  ：action Action path
      ：formNm Form name
      ：curPage Page no of display
Outline  ：Send request to action path
           Use this function when search list at screen with paging item
====================================================================
*/
gscm.submitSearch = function (action, formObj, curPage) {
    if (curPage != ''){
        if (formObj.currentPageNo) {
            formObj.currentPageNo.value = curPage;
        }
    }
    return gscm.commonSubmit(action, formObj);
}

/*
====================================================================
関数名：function submitBack
引数  ：action アクションパス
      ：formObj フォーム
概要  ：戻り先アクションパスへリクエストを送信。
====================================================================
====================================================================
Function name：function submitBack
Argument  ：action Action path
      ：formObj Form
Outline  ：Send request to return-action path
====================================================================
*/
gscm.submitBack = function (action, formObj) {
    action += "?back=true";
    // submitBack時はprocessPopulateを実行しないため、"multipart"のパラメータが解析されない。
    // トークンチェックでのエラーを回避するため、アクションパスにトークン情報を付与する。
    // Set token information to action path for avoiding error of token check
    if (formObj.enctype == "multipart/form-data") {
        action = gscm.setTokenParameter(action);
    }
    return gscm.commonSubmit(action, formObj);
}

/*
====================================================================
関数名：function fileDownload
引数  ：action アクションパス
      ：formObj フォーム
概要  ：アクションパスへリクエストを送信（二重送信防止なし）
        ファイルダウンロード時はこの関数を使うこと。
====================================================================
====================================================================
Function name：function fileDownload
Argument  ：action Action path
      ：formObj Form
Outline  ：Send request to action path（TODO 英語化）
           TODO 英語化
====================================================================
*/
gscm.fileDownload = function (action, formObj) {
    return gscm.commonSubmitForCheck(action, formObj, "false", executeDirtyCheck);
}
/*
====================================================================
関数名：function getAvailableWindow
引数  ：-
戻り値  ：ウィンドウ名
概要  ：起動していないウィンドウ名を取得し、取得したウィンドウ名を起動中に変更する。
====================================================================
====================================================================
Function name：function getAvailableWindow
Argument  ：-
Return value  ：Window name
Outline  ：Get window name which does not activate and change it's status to activation
====================================================================
*/
function getAvailableWindow() {
    for (var i = 1; i <= gscm.maxwincnt; i++) {
        var winname = systemId + "_gscmwin" + i;
        var stat = getWindowStat(winname);
        if (stat == 0) {
            return winname;
        }
    }
    return "";
}
/*
====================================================================
関数名：function countDown
引数  ：winname ウィンドウ名
戻り値  ：-
概要  ：引数で指定されたウィンドウを未起動にするため、クッキーから設定を削除する。
====================================================================
====================================================================
Function name：function countDown
Argument  ：winname Window name
Return value  ：-
Outline  ：Delete set from cookie for changing status of argument,window name,to inactivation
====================================================================
*/
gscm.countDown = function (winname) {
    setWindowStat(winname, "");
}
/*
====================================================================
関数名：function disp
引数  ：action アクションパス
戻り値  ：-
概要  ：指定したアクションパスの画面をポップアップで起動する。画面起動数が上限に達している場合、エラー画面を表示する。
====================================================================
====================================================================
Function name：function disp
Argument  ：action Action path
Return value  ：-
Outline  ：Activate screen of action path specified with pop-up.If number of screen activation is over max number,display error screen
====================================================================
*/
gscm.disp = function (action)
{
    if (!isNumber(gscm.maxwincnt) || gscm.maxwincnt < 1) {
        gscm.maxwincnt = 1;
    }
    var cnt = getOpenWinCnt();

    var win;
    if (cnt < gscm.maxwincnt) {
        var winname = getAvailableWindow();
        var ownerCompCd = document.getElementsByName("ownerCompCd")[0].value;
        var languageCd = document.getElementsByName("languageCd")[0].value;
        var timeZone = document.getElementsByName("timeZone")[0].value;
        document.GSCMWindowOpenTopToAplForm.executeActionPath.value = action;
        document.GSCMWindowOpenTopToAplForm.windowId.value = winname;
        document.GSCMWindowOpenTopToAplForm.ownerCompCd.value = ownerCompCd;
        document.GSCMWindowOpenTopToAplForm.languageCd.value = languageCd;
        document.GSCMWindowOpenTopToAplForm.timeZone.value = timeZone;
        document.GSCMWindowOpenTopToAplForm.target = winname;
        var win = window.open("", winname, "menubar=no resizable=yes, width=1024, height=768");

        document.GSCMWindowOpenTopToAplForm.submit();
    } else {
        win = window.open("BusinessError.do?msgId=GSCM-E0-0021", "_blank", "menubar=no resizable=yes, width=1024, height=768");
    }
    win.focus();
}

/*
====================================================================
関数名：function jumpToPagint
引数  ：action アクションパス
      ：formNm フォーム名
概要  ：ページ入力指定表示時にアクションパスへリクエストを送信する。
====================================================================
====================================================================
Function name：function jumpToPagint
Argument  ：action Action path
      ：formNm Form name
Outline  ：Send request to action path when paging item is specified
====================================================================
*/
gscm.jumpToPagint = function (action, formNm) {

    // Enterキーとクリック以外は無効とする
    // When clicking all key except Enter key and click,not execute this function
    if (event.keyCode == 13 || event.type == "click"){
        var formObj = document.getElementsByName(formNm)[0];
        var curPage = document.getElementsByName('jumpPageNo')[0].value;
        // ページ番号が未入力または数値以外の場合は何もしない（数値0や負数も何もしない）
        // If jumpPageNo was not input or not numeric,nothing to do. (Nothing to do with 0 or minus number)
        if (curPage == '' || !curPage.match(/^[1-9]{1}[0-9]{0,5}$/)){
            return false;
        }
        formObj.currentPageNo.value = curPage;
        return gscm.commonSubmit(action, formObj);
    }
}

/*
====================================================================
関数名：function screenJump
引数  ：action アクションパス
戻り値  ：-
概要  ：Jump機能又はメニュー(※トップ画面のメニューは除く)により業務画面を遷移する。
====================================================================
====================================================================
Function name：function screenJump
Argument  ：action Action path
Return value  ：-
Outline  ：Transit work screen with Jump function or menu(Except menu of top screen)
====================================================================
*/
gscm.screenJump = function(action) {
    document.GSCMScreenJumpForm.executeActionPath.value = action;
    document.GSCMScreenJumpForm.windowId.value = window.name;
    document.GSCMScreenJumpForm.submit();
}

/*
====================================================================
関数名：function getWindowStat
引数  ：winname キー(ウィンドウ名)
戻り値  ：指定したウィンドウが起動中の場合1、それ以外または値が存在しない場合は0を戻す。
概要  ：クッキーから指定したキーの値を取得する。
====================================================================
====================================================================
Function name：function getWindowStat
Argument  ：winname key(window name)
Return value  ：Return 1 when specified window already activate,return 0 when other cases or value does not exist
Outline  ：Get key value specified from cookie
====================================================================
*/
function getWindowStat(winname) {
    var COOKIE = new Array();
    if (document.cookie) {
        var cookies = document.cookie.split("; ");
        for (var i = 0; i < cookies.length; i++) {
            var str = cookies[i].split("=");
            COOKIE[str[0]] = unescape(str[1]);
        }
    }
    var stat = isNumber(COOKIE[winname]) ? COOKIE[winname] : 0;
    return stat;
}
/*
====================================================================
関数名：function setWindowStat
引数  ：winname キー(ウィンドウ名)
    :stat ウィンドウ起動有無(ウィンドウ起動中の場合1、それ以外は空文字を設定する。)
戻り値  ：-
概要  ：クッキーに画面起動数を設定する。クッキーの有効期限は明示的に設定しないため、有効期限はブラウザ終了までとなる。
====================================================================
====================================================================
Function name：function setWindowStat
Argument  ：winname key(window name)
    :stat Window activate or does not activate(set 1 when window already activate,set empty string when other cases)
Return value  ：-
Outline  ：Set number of screen activation to cookie.Cookie exists until browser close because term of validity for cookie is not explicitly set
====================================================================
*/
function setWindowStat(winname, stat) {
    var str = winname + "=" + escape(stat);
    var expDate = new Date();
    expDate.setTime(expDate.getTime() + 1000 * 60 * 60 * 24);
    document.cookie = str +"; expires = " + expDate.toUTCString();
}
/*
====================================================================
関数名：function getOpenWinCnt
引数  ：-
戻り値  ：画面起動数
概要  ：画面起動数を取得する。
====================================================================
====================================================================
Function name：function getOpenWinCnt
Argument  ：-
Return value  ：Number of screen activation
Outline  ：Get number of screen activation
====================================================================

*/
function getOpenWinCnt() {
    var cnt = 0;
    for (var i = 1; i <= gscm.maxwincnt; i++) {

        var stat = getWindowStat(systemId + "_gscmwin" + i);
        if (stat != 0) {
            cnt++;
        }
    }
    return cnt;
}
})();

/*
====================================================================
関数名：function
引数　：
戻り値：
概要  ：キャッシュを無効にし、非同期通信関数を呼びだす
====================================================================
====================================================================
Function name：function
Argument  ：
Return value  ：
Outline  ：Invalidate cache and invoke asynchronous communication function
====================================================================
*/

$(function(){

    //画面に設定された通信フラグが存在する場合に処理実施する
    //If session flag set in screen exists,execute process
    var sessionFlg;
    var sessionTime;

    sessionFlg = document.all("GSCM_SessionFlg");
    sessionTime = GSCM_SessionTime;

    if (sessionFlg != null){

        sessionFlg=sessionFlg.value;

        //キャッシュしないようにする
        //Make cache not work 
        $.ajaxSetup(
            {cache: false}
        );

        //通信フラグが"true"の場合のみ処理する
        //If session flag is true,execute process
        if (sessionFlg == "true"){
            nonSessionTimeout(sessionTime);
        }

    }
});

/*
====================================================================
関数名：function nonSessionTimeout
引数  ：
戻り値：
概要  ：非同期通信を行うアクションクラスを呼びだす
====================================================================
====================================================================
Function name：function nonSessionTimeout
Argument  ：
Return value  ：
Outline  ：Invoke action class which execute asynchronous communication
====================================================================
*/

function nonSessionTimeout(sessionTime){

    var timer;     //通信間隔時間 time of communication interval
    var setTimer   //分変換後時間 milli second

     //DBに設定されている通信時間が数値のときのみ処理する
     //When communication time set at data base is numerical value,execute this function
    if(isNumber(sessionTime)){
        //設定通信時間をミリ秒に変換する
        //Change setting communication time into milli second
        setTimer = Number(sessionTime)*60000

        //設定通信時間と最小通信時間(300000ミリ秒 = 5分)の大小比較
        //Compare setting communication time with the minimum communication time(300000 milli seconds = 5 minutes)
         if(setTimer < 300000){
            timer = 300000;
        }else{
            timer = setTimer;
        }

        //アクションクラスを呼出す
        //Invoke action class
        $.get("NonSessionTimeout.do");

        //設定された時間毎に同処理を繰返す
        //Repeat executing same function every setting time
        setTimeout(function(){nonSessionTimeout(sessionTime);}, timer);
    }

 }

 /*
====================================================================
関数名：function isNumber
引数  ： 判定値
戻り値： true(引数が数値の場合) or false(引数が数値以外の場合)
概要  ：数値チェック
====================================================================
====================================================================
Function name：function isNumber
Argument  ：Judgment value
Return value  ：true(In case of argument is numerical) or false(In case of argument is not numerical)
Outline  ：Validate numerical value
====================================================================
*/
function isNumber(objChar){

   var trimNumber;

   //引数チェック
   //Validate argument
   if(objChar != null && typeof objChar !== "undefined"){

        objChar = objChar.toString();

        trimNumber = objChar.replace(/^[\s　]+|[\s　]+$/g, '');

        //引数の数値チェック
        //Validate whether argument is numerical or not
        if(isNaN(Number(objChar))==false && trimNumber != ""){
            return true;
        }else{
            return false;
        }
   }else{
       return false;
   }
  }

/*
====================================================================
関数名：function keyEvent_F1
引数  ：-
概要  ：ファンクションキーイベント[F1]キー押下時
====================================================================
====================================================================
Function name：function keyEvent_F1
Argument  ：-
Outline  ：Click function key[F1]
====================================================================
*/
function keyEvent_F1() {
    //空のスクリプト
    //Blank script
    return false;
}
/*
====================================================================
関数名：function keyEvent_F2
引数  ：-
概要  ：ファンクションキーイベント[F2]キー押下時
====================================================================
====================================================================
Function name：function keyEvent_F2
Argument  ：-
Outline  ：Click function key[F2]
====================================================================
*/
function keyEvent_F2() {
    //空のスクリプト
    //Blank script
    return false;
}
/*
====================================================================
関数名：function keyEvent_F3
引数  ：-
概要  ：ファンクションキーイベント[F3]キー押下時
====================================================================
====================================================================
Function name：function keyEvent_F3
Argument  ：-
Outline  ：Click function key[F3]
====================================================================
*/
function keyEvent_F3() {
    //空のスクリプト
    //Blank script
    return false;
}
/*
====================================================================
関数名：function keyEvent_F4
引数  ：-
概要  ：ファンクションキーイベント[F4]キー押下時
====================================================================
====================================================================
Function name：function keyEvent_F4
Argument  ：-
Outline  ：Click function key[F4]
====================================================================
*/
function keyEvent_F4() {
    //空のスクリプト
    //Blank script
    return false;
}
/*
====================================================================
関数名：function keyEvent_F5
引数  ：-
概要  ：ファンクションキーイベント[F5]キー押下時
====================================================================
====================================================================
Function name：function keyEvent_F5
Argument  ：-
Outline  ：Click function key[F5]
====================================================================
*/
function keyEvent_F5() {
    //空のスクリプト
    //Blank script
    return false;
}
/*
====================================================================
関数名：function keyEvent_F6
引数  ：-
概要  ：ファンクションキーイベント[F6]キー押下時
====================================================================
====================================================================
Function name：function keyEvent_F6
Argument  ：-
Outline  ：Click function key[F6]
====================================================================
*/
function keyEvent_F6() {
    //空のスクリプト
    //Blank script
    return false;
}
/*
====================================================================
関数名：function keyEvent_F7
引数  ：-
概要  ：ファンクションキーイベント[F7]キー押下時
====================================================================
====================================================================
Function name：function keyEvent_F7
Argument  ：-
Outline  ：Click function key[F7]
====================================================================
*/
function keyEvent_F7() {
    //空のスクリプト
    //Blank script
    return false;
}
/*
====================================================================
関数名：function keyEvent_F8
引数  ：-
概要  ：ファンクションキーイベント[F8]キー押下時
====================================================================
====================================================================
Function name：function keyEvent_F8
Argument  ：-
Outline  ：Click function key[F8]
====================================================================
*/
function keyEvent_F8() {
    //空のスクリプト
    //Blank script
    return false;
}
/*
====================================================================
関数名：function keyEvent_F9
引数  ：-
概要  ：ファンクションキーイベント[F9]キー押下時
====================================================================
====================================================================
Function name：function keyEvent_F9
Argument  ：-
Outline  ：Click function key[F9]
====================================================================
*/
function keyEvent_F9() {
    //空のスクリプト
    //Blank script
    return false;
}
/*
====================================================================
関数名：function keyEvent_F10
引数  ：-
概要  ：ファンクションキーイベント[F10]キー押下時
====================================================================
====================================================================
Function name：function keyEvent_F10
Argument  ：-
Outline  ：Click function key[F10]
====================================================================
*/
function keyEvent_F10() {
    //空のスクリプト
    //Blank script
    return false;
}
/*
====================================================================
関数名：function keyEvent_F11
引数  ：-
概要  ：ファンクションキーイベント[F11]キー押下時
====================================================================
====================================================================
Function name：function keyEvent_F11
Argument  ：-
Outline  ：Click function key[F11]
====================================================================
*/
function keyEvent_F11() {
    //空のスクリプト
    //Blank script
    return false;
}
/*
====================================================================
関数名：function keyEvent_F12
引数  ：-
概要  ：ファンクションキーイベント[F12]キー押下時
====================================================================
====================================================================
Function name：function keyEvent_F12
Argument  ：-
Outline  ：Click function key[F12]
====================================================================
*/
function keyEvent_F12() {
    //空のスクリプト
    //Blank script
    return false;
}

/*
====================================================================
関数名：function showExecutableButton
引数  ：-
概要  ：ボタンの機能制限を行います。（機能に権限がない場合、ボタンを非活性）
====================================================================
====================================================================
Function name：function showExecutableButton
Argument  ：-
Outline  ：Limit button function(If function is without authority,make botton be inactive)
====================================================================
*/
function showExecutableButton() {
    var $json = $('input.funcidjson');
    // hidden項目にjsonオブジェクトがない場合
    // inputが存在しない
    // If json object is not at hidden field,input does not exist
    if ($json.length == 0) {
        return;
    // 値がない
    // No value
    } else if ($json.val().length == 0) {
        $('form input[type=button]').attr('disabled', true);
        return;
    }
    // hidden項目にjsonオブジェクトがある場合
    // In case json object is at hidden field
    var json = JSON.parse($json.val());
    var $this = $();
    // 各ボタンオブジェクトを取得し
    // Get every button object
    $('form input[type=button]').each(function(){
        // jsonに存在しなければ、非活性
        // If button object is not as json,set inactive
        if (!json[this.name]) {
            $(this).attr('disabled', true);
        }
    });
}
/*
====================================================================
関数名：function windowOpenLoad
引数  ：windowName ウィンドウ名
      ：executeActionPath アクションパス
概要  ：画面オープン時の処理を呼出します。
====================================================================
====================================================================
Function name：function windowOpenLoad
Argument ：windowName Window Name
         ：executeActionPath Action path
Outline  ：TODO 英語化
====================================================================
*/
function windowOpenLoad(windowName, executeActionPath) {
    document.GSCMWindowOpenForm.windowId.value = windowName;
    document.GSCMWindowOpenForm.action = executeActionPath;
    document.GSCMWindowOpenForm.submit();
}
/*
====================================================================
関数名：function screenJumpLoad
引数  ：windowName ウィンドウ名
      ：executeActionPath アクションパス
概要  ：画面遷移時の処理を呼出します。
====================================================================
====================================================================
Function name：function screenJumpLoad
Argument ：windowName Window Name
         ：executeActionPath Action path
Outline  ：TODO 英語化
====================================================================
*/
function screenJumpLoad(windowName, executeActionPath) {
    document.GSCMScreenJumpForm.windowId.value = windowName;
    document.GSCMScreenJumpForm.action = executeActionPath;
    document.GSCMScreenJumpForm.submit();
}
/*
====================================================================
関数名：function windowClose
引数  ：-
概要  ：画面クローズ時の処理を呼出します。
====================================================================
====================================================================
Function name：function windowClose
Argument  ：-
Outline  ：Invoke screen close function
====================================================================
*/
function windowClose() {
    location.href = './WindowCloseAction.do?windowId=' + window.name;
}
