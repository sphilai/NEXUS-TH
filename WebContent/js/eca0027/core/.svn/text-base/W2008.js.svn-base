/*
 * W2008.js
 *
 * Multiple Item No. in 1Box PKG Register画面で用いるJavaScriptです。
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
    init();
    
    var downloadFl = $(':hidden[name="download"]');
    if (downloadFl.val() == 'true') {
        gscm.commonSubmitForCheck('W2008PrintTag.do', $('form[id="mainForm"]').get(0), 'false', 'false');
        downloadFl.val('');
        return;
    }
});

/*
====================================================================
関数名：init()
引数  ：なし
概要  ：初期表示イベント
        非活性項目のスタイルクラスから、.gscm_required を外す。
        ワーニングエラーが発生している項目のスタイルクラスに
        .warn を追加する。
====================================================================
*/
function init(){

    // ワーニング発生時の初期表示処理
    var table = $(".gscm_resultlist");
    var len = -1;
    for(var i=0,tr,trs=table[0].getElementsByTagName('tr');tr=trs[i];i++){
        len = len + 1;
    }
    var warningFlgName = "";
    var noName = "";
    var isDisabled = $('#backToCreateBtn').is(':disabled');

    for (var i=0 ; i< len; i++){
        warningFlgName = "listDomainList[" + i + "].warningFlg";
        noName = "listDomainList[" + i + "].no";
        
        var warningFlg = $(':input[name="' + warningFlgName + '"]').val();
        if (warningFlg == '1') {
            $(':input[name="' + noName + '"]').addClass("warn");
        }
    }
    
    // N/W の値がない場合は単位を非表示にする
    if ($('#netWeight').val()=="") {
        $('#netWeightUnit').hide();
    }
    // G/W の値がない場合は単位を非表示にする
    if ($('#grossWeight').val()=="") {
        $('#grossWeightUnit').hide();
    }
    
    // Back toCreate ボタンが非活性の場合はPKG Materialsにフォーカスをあてる
    if ( isDisabled ) {
        $('#pkgMaterialsBtn').focus();
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
    if (fromScreenId == 'W2005' || confirm(msg)) {
        gscm.submitBack('W2005Init.do', form);
    }
}
