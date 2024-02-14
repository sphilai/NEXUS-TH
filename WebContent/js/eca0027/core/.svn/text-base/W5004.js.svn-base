/*
 * W5004.js
 *
 * JavaScript used in shipping confirmation register.
 * 出荷確認Register画面で用いるJavaScriptです。
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
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
    $("input[name=w5004CriteriaDomain\\.carrierCompCd]").val(retVal["compCd"]);
}
/*
====================================================================
Function Name : CML list screen display or item list screen display
Argument      : -
Return Value  : -
Outline       : -
関数名：CML一覧画面もしくは、品番一覧画面を表示
引数  ：-
戻り値：-
概要  ：-
====================================================================
*/
function showItemOrCMLScreen(xmainMark, mainMark) {
    if (xmainMark == "") {
        popupWT007(mainMark, "");
    } else {
        popupWT005(xmainMark);
    }
}
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
});