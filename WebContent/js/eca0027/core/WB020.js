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
    $("#tablefix").tablefix({ height:469, fixRows:1 });
});

/*
====================================================================
Function Name : errorDownload
Argument      : index target row index
Return Value  : -
Outline       : Specify the type, target line and download the file.
関数名：errorFileDownload
引数  ：index 対象行インデックス
戻り値：-
概要  ：種別、対象行を指定しファイルをダウンロードする。
====================================================================
*/
function errorDownload(index) {
    $('input[name="wb020CriteriaDomain.downloadTyp"]').val(1);
    $('input[name="wb020CriteriaDomain.listIndex"]').val(index);
    gscm.fileDownload("WB020Download.do", document.mainForm);
}

