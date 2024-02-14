/*
 * W2007.js
 *
 * MixTag Create画面で用いるJavaScriptです。
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
    $('#tablefix').tablefix({height: 414, fixRows: 2});
    $(".result_list tr:even").addClass("even");
    $(".result_list tr:odd").addClass("odd");
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
関数名：changeControlQtyAndTagQty
引数  ：ck チェックボックスオブジェクトのjQueryオブジェクト
概要  ：選択された行のActual PKG QTY、Actual Tag QTY の
        入力の制御を行う。
====================================================================
*/
function changeDisableQtyAndTagQty(ck) {
    var tr = ck.parent().parent();
    var qty = tr.find(':input[name$="qty"]');
    var tagQty = tr.find(':input[name$="tagQty"]');

    
    // 値をクリア
    qty.val("");
    tagQty.val("");
    
    if (ck.is(':checked')) {
        // チェックされている場合
            qty.prop('disabled', false);
            tagQty.prop('disabled', false); 
    } else {
        qty.prop('disabled', true);
        tagQty.prop('disabled', true);
        qty.prop('disabled', true).removeClass("gscm_error_class");
        tagQty.prop('disabled', true).removeClass("gscm_error_class");
    }

}

/*
====================================================================
関数名：removeDisableOnCheckBox
引数  ：なし
概要  ：チェックボックスを全て活性にする。
====================================================================
*/
function removeDisableOnCheckBox() {
     $("[type=checkbox]").prop('disabled', false);
}
