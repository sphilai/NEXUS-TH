/*
 * W1001.js
 *
 * 梱包指示Main画面で用いるJavaScriptです。
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
    $('#tablefix').tablefix({height: 477, fixRows: 1});
});
/*
====================================================================
関数名：setShipper
引数  ：-
概要  ：Company Select子画面を表示し、
        選択したCOMPANY CODE/会社コードを画面のShipperに反映する。
====================================================================
*/
function setShipper() {
    // 子画面を呼出し、設定した値を取得
    var array = popupWT001('Y', '', '');
    if (array == null) {
        return;
    }
    // 取得した値を画面に設定する
    var compCd = array['compCd']; // COMPANY CODE/会社コード
    if (compCd != null) {
        $(':input[name="w1001CriteriaDomain.shipperCd"]').val(compCd);
    }
}
/*
====================================================================
関数名：setConsignee
引数  ：-
概要  ：Company Select子画面を表示し、
        選択したCOMPANY CODE/会社コードを画面のConsigneeに反映する。
====================================================================
*/
function setConsignee() {
    // 子画面を呼出し、設定した値を取得
    var array = popupWT001('', '', '');
    if (array == null) {
        return;
    }
    // 取得した値を画面に設定する
    var compCd = array['compCd']; // COMPANY CODE/会社コード
    if (compCd != null) {
        $(':input[name="w1001CriteriaDomain.consigneeCd"]').val(compCd);
    }
}

/*
====================================================================
関数名：selectShipTo
引数  ：-
概要  ：CIGMA Ship to CD/Company CD cross reference MASTER子画面を表示し、
        選択したSHIP TO CODE/送荷先コードを画面のShipToに反映する。
====================================================================
*/
function selectShipTo() {
    // 子画面を呼出し、設定した値を取得
    var array = popupWT014();

    if (!array) {
        return;
    }

    // 取得した値を画面に設定する
    var shipToCd = array['shipToCd']; // SHIP TO CODE/送荷先コー�

    $(':input[name="w1001CriteriaDomain.shipToCd"]').val(shipToCd);

}