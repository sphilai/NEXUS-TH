/*
 * W2004.js
 *
 * 梱包指示Register画面で用いるJavaScriptです。
 *
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
    $('#tablefix').tablefix({height: 433, fixRows: 1});
    var downloadInstr = $(':hidden[name="downloadInstr"]');
    if (downloadInstr.val() == 'true') {
        gscm.commonSubmitForCheck('W2004PrintInstr.do', $('form[id="mainForm"]').get(0), 'false', 'false');
        downloadInstr.val('');
        return;
    }

    var downloadCmlForInstr = $(':hidden[name="downloadCmlForInstr"]');
    if (downloadCmlForInstr.val() == 'true') {
        gscm.commonSubmitForCheck('W2004PrintCmlForInstr.do', $('form[id="mainForm"]').get(0), 'false', 'false');
        downloadCmlForInstr.val('');
        return;
    }
});
 
/*
====================================================================
関数名：backToMainScreen
引数  ：form  HTMLフォーム
        fromScreenId 遷移元画面ID
        msg   確認メッセージ
概要  ：Main画面に戻る。
        Create画面からの遷移時は確認メッセージを表示する。
====================================================================
*/
function backToMainScreen(form, fromScreenId, msg) {
    if (fromScreenId == 'W2001' || confirm(msg)) {
        gscm.submitBack('W2001Init.do', form);
    }
}
