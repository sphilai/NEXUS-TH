/*
 * WT001.js
 *
 * JavaScript used in Company Search Sub Screen.
 * 会社選択子画面で用いるJavaScriptです。
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
    var shipperFlg = window.dialogArguments[0];
    var carrierCompFlg = window.dialogArguments[1];
    var customsBrokerFlg = window.dialogArguments[2];
    
    if( shipperFlg != null){
        document.getElementById('wt001CriteriaDomain.shipperFlg').value = shipperFlg;
    }
    if( carrierCompFlg != null){
        document.getElementById('wt001CriteriaDomain.carrierCompFlg').value = carrierCompFlg;
    }
    if( customsBrokerFlg != null){
        document.getElementById('wt001CriteriaDomain.customsBrokerFlg').value = customsBrokerFlg;
    }

});
/*
====================================================================
関数名：ready
引数  ：-
概要  ：ドキュメントの読み込み完了時に実行する処理。
====================================================================
*/
$(function() {
    $('#tablefix').tablefix({height: 289, fixRows: 1});
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