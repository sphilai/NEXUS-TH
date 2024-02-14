/*
 * W2017.js
 *
 * まとめCML Register画面で用いるJavaScriptです。
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
    var downloadFl = $(':hidden[name="download"]');
    if (downloadFl.val() == 'true') {
        gscm.commonSubmitForCheck('W2017PrintTag.do', $('form[id="mainForm"]').get(0), 'false', 'false');
        downloadFl.val('');
        return;
    }
});

/*
====================================================================
関数名：selectOuterPkg
引数  ：shipperCdList 荷主コードリスト
概要  ：外装選択子画面呼出
====================================================================
*/
function selectOuterPkg(shipperCdList) {
    var array = popupWT006(shipperCdList);
    
    if (array == null) {
    } else {
        var outerCd = array['outerPkgCd'];
        var ownerComp = array['ownerComp'];

        $(':input[name="w2017CriteriaDomain.outerPkgCd"]').val(outerCd);
        $(':input[name="w2017CriteriaDomain.outerPkgComCd"]').val(ownerComp);
    }
}

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
    if (fromScreenId != 'W2014') {
        if (confirm(msg)) {
            gscm.submitBack('W2014Init.do', form);
        }
    } else {
        gscm.submitBack('W2014Init.do', form);
    }
}
