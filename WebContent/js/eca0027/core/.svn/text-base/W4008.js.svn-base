/*
 * W4008.js
 *
 * JavaScript used in staging actuality register screen.
 * 山作り実績Register画面で用いるJavaScriptです。
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
/*
====================================================================
Function Name : ready
Argument      : -
Return Value  : -
Outline       : Action to take upon completion of reading the document.
関数名：ready
引数  ：-
戻り値：-
概要  ：ドキュメントの読み込み完了時に実行する処理。
====================================================================
*/
$(function() {
    // Header fixed scroll
    // ヘッダ固定スクロール
    $("#tablefix").tablefix({ height:397, fixRows:1 });

    // If the transition from the Main screen, deactivate the check box of the detail list
    // Main画面から遷移の場合、明細のチェックボックスを非活性化
    if ($("input[name=callScreenId]").val() == "W4005") {
        $(".gscm_resultlist :checkbox").attr("disabled", true); 
    }
});

/*
====================================================================
Function Name : Carrier selector screen display
Argument      : -
Return Value  : -
Outline       : -
関数名：Carrier選択子画面表示
引数  ：-
戻り値：-
概要  ：-
====================================================================
*/
function showSelectCarrier() {
    var retVal = popupWT001("", "Y", "");
    if (!retVal) {
        return;
    }
    $("input[name=w4008CriteriaDomain\\.carrierCompCd]").val(retVal["compCd"]);
}

/*
====================================================================
Function Name : Back to Main Screen call processing
Argument      :
    action - Call target
    form - Submit form
Return Value  : -
Outline       : -
関数名：Back to Main Screen処理呼び出し
引数  ：action 呼び出し先
        form 送信フォーム
戻り値：-
概要  ：-
====================================================================
*/
function doBackToMain(action, form) {
    // In the case of transition from the Create screen, and display the information discarded confirmation message
    // Create画面から遷移の場合、情報破棄確認メッセージを表示
    if ($("input[name=callScreenId]").val() == "W4007") {
        if (!window.confirm(msg.dirtyMsg)) {
            return false;
        }
    }
    return gscm.submitBack(action, form);
}

/*
====================================================================
Function Name : Update ETD Carrier call processing
Argument      :
    action - Call target
    form - Submit form
Return Value  : -
Outline       : -
関数名：Update ETD Carrier処理呼び出し
引数  ：action 呼び出し先
        form 送信フォーム
戻り値：-
概要  ：-
====================================================================
*/
function doUpdateEtdCarrier(action, form) {
    if (!window.confirm(updateEtdCarrierConfirmMessage)) {
        return false;
    }
    return gscm.commonSubmit(action, form);
}

/*
====================================================================
Function Name : Item No Info Sub-screen display
Argument      : mainMarkOrXmainMark - Main mark or X-Main mark
Argument      : mainMarkTyp - If Main mark then "1", if X-Main mark then "2".
Return Value  : -
Outline       : -
関数名：Item No. Info子画面表示
引数  ：mainMarkOrXmainMark - メインマークまたはまとめメインマーク
引数  ：mainMarkTyp - メインマークの場合"1"、まとめメインマークの場合"2"
戻り値：-
概要  ：-
====================================================================
*/
function showItemNoInfo(mainMarkOrXmainMark, mainMarkTyp) {
    if (mainMarkTyp == "1") {
        popupWT007(mainMarkOrXmainMark, "");
    } else {
        popupWT005(mainMarkOrXmainMark);
    }
}
