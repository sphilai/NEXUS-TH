/*
 * W6001.js
 *
 * 通関書類作成業務 Invoice Main画面で用いるJavaScriptです。
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
    $('#tablefix').tablefix({height: 365, fixRows: 2});
    
    $('select#trns_cd').ieSelectWidth ({
        containerClassName : 'select-container',
        overlayClassName : 'select-overlay'
    });
    
    $('select#cml_typ').ieSelectWidth ({
        containerClassName : 'select-container',
        overlayClassName : 'select-overlay'
    });
    
    $('select#by').ieSelectWidth ({
        containerClassName : 'select-container',
        overlayClassName : 'select-overlay'
    });
    
    $('select#issuer').ieSelectWidth ({
        containerClassName : 'select-container',
        overlayClassName : 'select-overlay'
    });
});

/*
====================================================================
関数名：selectCarrier
引数  ：-
概要  ：Company Select子画面を表示し、
        選択したCOMPANY CODE/会社コードを画面のCarrierに反映する。
====================================================================
*/
function selectCarrier() {
    // 子画面を呼出し、設定した値を取得
    var array = popupWT001('', 'Y', '');
    if (array == null) {
        return;
    }

    // 取得した値を画面に設定する
    var compCd = array['compCd'] // COMPANY CODE/会社コード
    if (compCd != null) {
        $(':input[name="w6001CriteriaDomain.carrierCompCd"]').val(compCd);
    }

}

/*
====================================================================
関数名：selectForwarder
引数  ：-
概要  ：Company Select子画面を表示し、
        選択したCOMPANY CODE/会社コードを画面のForwarderに反映する。
====================================================================
*/
function selectForwarder() {
    // 子画面を呼出し、設定した値を取得
    var array = popupWT001('', '', '');
    if (array == null) {
        return;
    }
    // 取得した値を画面に設定する
    var compCd = array['compCd'] // COMPANY CODE/会社コード
    if (compCd != null) {
        $(':input[name="w6001CriteriaDomain.forwarderCompCd"]').val(compCd);
    }

}

/*
====================================================================
関数名：printDocument
引数  ：row 選択行
      ：form フォーム
概要  ：選択行を設定し、アクションパスへリクエストを送信します。
====================================================================
*/
function printDocument(row, formObj) {
    $(':input[name="printRow"]').val(row);
    
    gscm.commonSubmitForCheck('W6001PrintDocument.do', formObj, 'false', 'false');
}
