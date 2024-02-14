/*
 * W4003.js
 *
 * JavaScript used in staging instruction create screen.
 * 荷揃え指示Create画面で用いるJavaScriptです。
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

    // Check box select all, clear all
    // チェックボックス全選択、全解除
    $("#headerCheckbox").on("click", function() {
        $(".gscm_resultlist input:checkbox:enabled").prop("checked", $(this).is(":checked"));
    });
});

/*
====================================================================
Function Name : Item No Info Sub-screen display
Argument      : mainMark - Main Mark
Return Value  : -
Outline       : -
関数名：Item No. Info子画面表示
引数  ：Main Mark - メインマーク
戻り値：-
概要  ：-
====================================================================
*/
function showItemNoInfo(mainMark) {
    popupWT007(mainMark, "");
}
