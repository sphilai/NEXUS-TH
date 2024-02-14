/*
 * W3010.js
 *
 * JavaScript used in Receive CML Transfer Report screen.
 * CML単位の搬入画面で用いるJavaScriptです。
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
});