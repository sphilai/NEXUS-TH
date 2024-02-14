/*
 * W9005.js
 *
 * ユーザマスタ編集画面 User ID MA Edit で用いるJavaScriptです。
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
    $('#tablefix2').tablefix({height: 153, fixRows: 2});
    $('#tablefix3').tablefix({height: 153, fixRows: 2});
});

/*
====================================================================
関数名：selectCompany
引数  ：-
概要  ：Company Select子画面を表示し、
        選択したCOMPANY CODE/会社コードを画面のCompanyに反映する。
====================================================================
*/
function selectCompany() {
    // 子画面を呼出し、設定した値を取得
    var array = popupWT001('', 'N', '');
    if (array == null) {
        return;
    }
    // 取得した値を画面に設定する
    var compCd = array['compCd'] // COMPANY CODE/会社コード
    if (compCd != null) {
        $(':input[name="w9005CriteriaDomain.compCd"]').val(compCd);
    }
}

/*
====================================================================
関数名：submitRegister
引数  ：thisAction  : Execute action path.
        thisForm    : form
        msg         : confirm message
概要  ：非活性項目の値を送信できるようにします。
====================================================================
*/
function submitRegister(thisAction, thisForm, msg) {
  if (confirm(msg)) {
        var items = $(":disabled");
        items.removeAttr("disabled");

        thisForm.target = '_self';
        gscm.commonSubmitForCheck(thisAction, thisForm, 'true', 'false');
        items.attr("disabled", "disabled");
    }
}

