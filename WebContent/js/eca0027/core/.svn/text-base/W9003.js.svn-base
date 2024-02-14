/*
 * W9003.js
 *
 * Agent MA edit画面で用いるJavaScriptです。
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
/*
/*
====================================================================
関数名：ready
引数  ：-
概要  ：ドキュメントの読み込み完了時に実行する処理。
====================================================================
*/
$(function() {
    var items = $(".gscm_required")
    for (var i=0; i< items.length; i++) {
        var itemName = items[i];
        var isDisable = $(itemName).is(":disabled");
        if (isDisable) {
            $(itemName).removeClass("gscm_required");
        }
    }
});

/*
====================================================================
関数名：selectCarrier
引数  ：-
概要  ：Company Select子画面を表示し、
        選択したCOMPANY CODE/会社コードを画面のAgent MA editに反映する。
====================================================================
*/
function selectComp() {
    // 子画面を呼出し、設定した値を取得
    var array = popupWT001('', '', '');
    if (array == null) {
        return;
    }
    // 取得した値を画面に設定する
    var compCd = array['compCd'] // COMPANY CODE/会社コード
    var compNmAbb = array['compNmAbb'] // COMPANY NAME ABBREVIATION/会社略称
    if (compCd != null) {
        $(':input[name="w9003CriteriaDomain.agentCompCd"]').val(compCd);
        $(':input[name="w9003CriteriaDomain.agtCompNmAbb"]').val(compNmAbb);
        $("#agtCompNmAbb").text(compNmAbb);
    }
}
