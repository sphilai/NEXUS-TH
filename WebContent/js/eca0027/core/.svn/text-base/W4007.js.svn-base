/*
 * W4007.js
 *
 * JavaScript used in staging actuality create screen.
 * 山作り実績Create画面で用いるJavaScriptです。
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
