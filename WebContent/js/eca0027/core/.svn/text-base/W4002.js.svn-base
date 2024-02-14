/*
 * W4002.js
 *
 * JavaScript used in staging instruction header screen.
 * 荷揃え指示Header画面で用いるJavaScriptです。
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
    $("input[name=w4002CriteriaDomain\\.carrierCompCd]").val(retVal["compCd"]);
}
