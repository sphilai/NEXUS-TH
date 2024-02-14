/*
 * WT017.js
 *
 * JavaScript used in Shipping Actuality Warning List Sub Screen.
 * 船積実績ワーニングリスト子画面で用いるJavaScriptです。
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
    $('#tablefix').tablefix({height: 469, fixRows: 1});
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
