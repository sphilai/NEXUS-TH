/*
 * W2003.js
 *
 * 梱包指示Create画面で用いるJavaScriptです。
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
    $('#tablefix').tablefix({height: 397, fixRows: 1});
});

/*
====================================================================
関数名：setSearchFlg
引数  ：frm フォーム
概要  ：検索ボタン押下フラグをセットする
====================================================================
*/
function setSearchFlg(frm, val) {
    frm.searchFlg.value = val;
}

/*
====================================================================
関数名：check
引数  ：ck チェックボックスオブジェクト
概要  ：チェックボックス押下処理
====================================================================
*/
function check(ck) {
    var tr = ck.parent().parent();
    var itemNo = tr.find(':text[name$="itemNo"]');
    var instrQty = tr.find(':text[name$="instrQty"]');
    var summaryOrder = tr.find(':hidden[name$="summaryOrder"]'); 
    if (ck.is(':checked')) {
        instrQty
            .val(summaryOrder.val())
            .removeAttr('disabled');
    } else {
        instrQty
            .val('')
            .attr('disabled', 'disabled')
            .removeClass('gscm_error_class');
        itemNo
            .removeClass('gscm_error_class');
    }
}

/*
====================================================================
関数名：enableCk
引数  ：なし
概要  ：Submit時にCKの値が送信されるようにCKのdisabledを解除する
====================================================================
*/
function enableCk() {
    $(':checkbox[name$="selected"]').removeAttr('disabled');
}