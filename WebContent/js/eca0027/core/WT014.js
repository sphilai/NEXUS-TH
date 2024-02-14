/*
 * WT014.js
 *
 * JavaScript used in Ship to Search Sub Screen.
 * 送荷先選択子画面で用いるJavaScriptです。
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
/*
====================================================================
関数名：ready
引数  ：-
概要  ：ドキュメントの読み込み完了時に実行する処理。
====================================================================
*/
$(function() {
    $('#tablefix').tablefix({height: 325, fixRows: 1});
});

/*
====================================================================
Function:Call search action
Arg:Callee action, submit form
Rturn value:none 
Outline:Refer to the callee function7s comments.
====================================================================
*/
function submitSearch(action, form) {
    return gscm.commonSubmitPopup(action, form, form.windowId.value);
}