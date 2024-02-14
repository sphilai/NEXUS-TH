/*
 * WT004.js
 *
 * JavaScript used in Package Search Sub Screen.
 * 包装材選択子画面で用いるJavaScriptです。
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
/*
====================================================================
Function:Set initial values
Arg:Arrangement from main screen
Return value:none 
Outline:Set the values from main screen to sub screen.
====================================================================
*/
$(document).ready(function(){

    // Set the values on sub screen.
    var ownerComp = window.dialogArguments[0];
    
    if( ownerComp != null){
        document.getElementById('wt004CriteriaDomain.ownerComp').value = ownerComp;
    }

    // focus change
    document.getElementById('pkgItemNo').focus();
    document.getElementById('rtTyp').focus();
});
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
Return value:none 
Outline:Refer to the callee function7s comments.
====================================================================
*/
function submitSearch(action, form) {
    return gscm.commonSubmitPopup(action, form, form.windowId.value);
}