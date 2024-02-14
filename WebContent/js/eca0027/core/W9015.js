/*
 * W9015.js
 *
 * JavaScript used in CIGMA W/H X-Reference MA Edit screen.
 * CIGMA W/H X-Reference MA Edit画面で用いるJavaScriptです。
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
/*
====================================================================
Function Name : Back to Main Screen call processing
Argument      :
    action - Call target
    form - Submit form
Return Value  : -
Outline       : -
関数名：Back to Main Screen処理呼び出し
引数  ：action 呼び出し先
        form 送信フォーム
戻り値：-
概要  ：-
====================================================================
*/
function doBackToMain(action, form) {
    // In the case of transition from the Edit/Refer screen, and display the information discarded 
    // confirmation message(new mode, edit mode)
    // Edit/Refer画面から遷移の場合、情報破棄確認メッセージを表示(新規、修正モードの場合)
    if ($("input[name=procMode]").val() != "3") {

        if ($("input[name=callScreenId]").val() == "W9014") {
            if (!window.confirm(msg.dirtyMsg)) {
                return false;
            }
        }
    }
    return gscm.submitBack(action, form);
}