/*
 * WT006.js
 *
 * JavaScript used in Outer Package Search Sub Screen.
 * 外装選択子画面で用いるJavaScriptです。
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
/*
====================================================================
Function:Set initial values
Arg:Arrangement from main screen
Rturn value:none 
Outline:Set the values from main screen to sub screen.
====================================================================
*/
$(document).ready(function(){

    // Set the values on sub screen.
    var ownerCompCsv = window.dialogArguments[0];
    if( ownerCompCsv != null){
        document.getElementById('wt006CriteriaDomain.ownerCompCsv').value = ownerCompCsv;
    }
    
    // focus change
    document.getElementById('outerPkgCd').focus();
    document.getElementById('ownerComp').focus();
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
Rturn value:none 
Outline:Refer to the callee function7s comments.
====================================================================
*/
function submitSearch(action, form) {
    return gscm.commonSubmitPopup(action, form, form.windowId.value);
}