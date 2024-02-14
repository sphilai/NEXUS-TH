/*
 * W7006.js
 *
 * Other Doc UPLOAD画面で用いるJavaScriptです。
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
/*
/*
====================================================================
関数名：submitSelectedRow
引数  ：action アクションパス
      ：form フォーム
      ：row 選択行
概要  ：選択業を設定し、アクションパスへリクエストを送信します。
====================================================================
*/
function submitSelectedRow(path, form, row) {
    $(':input[name="w7006CriteriaDomain.selectedRow"]').val(row);
    
    gscm.commonSubmit(path, form);
}

/*
====================================================================
関数名：submitSelectedRow
引数  ：action アクションパス
      ：form フォーム
      ：row 選択行
概要  ：選択業を設定し、アクションパスへリクエストを送信します。
====================================================================
*/
function submitSelectedRowForView(path, form, row) {
    $(':input[name="w7006CriteriaDomain.selectedRow"]').val(row);
    
    gscm.commonSubmitForCheck(path, form, 'false', 'false');
}

/*
====================================================================
関数名：submitConfirmSelectedRow
引数  ：action アクションパス
      ：form フォーム
      ：msg 確認メッセージ
      ：row 選択行
概要  ：選択業を設定し、アクションパスへリクエストを送信します。
====================================================================
*/
function submitConfirmSelectedRow(path, form, msg, row) {
    $(':input[name="w7006CriteriaDomain.selectedRow"]').val(row);
    
    gscm.submitConfirm(path, form, msg);
}
