/*
 * W7004.js
 *
 * 船積実績Register画面で用いるJavaScriptです。
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
    $('#tablefix').tablefix({height: 441, fixRows: 1});

    // メッセージがある場合、確認ダイアログを表示してBack to Main Screenアクションを呼ぶ
    var msg = $(':input[name="w7004CriteriaDomain.confirmMsg"]').val();
    if(msg && 0 < msg.length) {
        $(':input[name="w7004CriteriaDomain.confirmMsg"]').val('');
        $(':input[name="w7004CriteriaDomain.continueFlag"]').val('Y');
        gscm.submitConfirm('W7004BackToMainScreen.do', $('form[id="mainForm"]').get(0), msg);
        $(':input[name="w7004CriteriaDomain.continueFlag"]').val('');
    }
});

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
    //form.selectedRow.value = row;
    $(':input[name="w7004CriteriaDomain.selectedRow"]').val(row);
    
    gscm.commonSubmit(path, form);
}

/*
====================================================================
関数名：setCarrier
引数  ：-
概要  ：Company Select子画面を表示し、
        選択したCOMPANY CODE/会社コードを画面のCarrierに反映する。
====================================================================
*/
function setCarrier() {

    // 子画面を呼出し、設定した値を取得
    var array = popupWT001('', 'Y', '');
    if (array == null) {
        return;
    }
    // 取得した値を画面に設定する
    var compCd = array['compCd'] // COMPANY CODE/会社コード
    if (compCd != null) {
        $(':input[name="w7004CriteriaDomain.carrierCompCd"]').val(compCd);
    }
}

/*
====================================================================
関数名：selectChangeStatus
引数  ：action アクションパス
      ：form フォーム
      ：row 選択行
      ：msg メッセージ
概要  ：船積実績ステータスが20の場合、ダイアログを表示する。
   submitSelectedRowを呼び出す
====================================================================
*/
function selectChangeStatus(path, form, row, msg) {
    var status = $(':input[name="w7004CriteriaDomain.shippingActStatus"]').val();
    if(status == '20') {
        if(window.confirm(msg)) {
            submitSelectedRow(path, form, row);
        }
    } else {
        submitSelectedRow(path, form, row);
    }
}