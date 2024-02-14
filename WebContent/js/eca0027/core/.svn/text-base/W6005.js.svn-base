/*
 * W6005.js
 *
 * 通関書類作成業務 Shipping Information Input画面で用いるJavaScriptです。
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
        $(':input[name="criteriaDomain.carrierCompCd"]').val(compCd);
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
        $(':input[name="criteriaDomain.forwarderCompCd"]').val(compCd);
    }
}

/*
====================================================================
関数名：selectPortFrom
引数  ：-
概要  ：Port Select子画面を表示し、
        選択したPORT CODE/港コードを画面のPortFromに反映する。
====================================================================
*/
function selectPortFrom() {
    var inCntryCd = document.mainForm.cntryCd.value;
    // 子画面を呼出し、設定した値を取得
    var array = popupWT008(inCntryCd);
    if (array == null) {
        return;
    }
    // 取得した値を画面に設定する
    var cntryCd = array['cntryCd']; // CNTRY CD
    var portCd = array['portCd'];   // PORT CODE/港コード
    if (cntryCd != null) {
        $(':input[name="criteriaDomain.fmCntryCd"]').val(cntryCd);
    }
    if (portCd != null) {
        $(':input[name="criteriaDomain.loadingPortCd"]').val(portCd);
    }
}

/*
====================================================================
関数名：selectPortTo
引数  ：-
概要  ：Port Select子画面を表示し、
        選択したPORT CODE/港コードを画面のPortFromに反映する。
====================================================================
*/
function selectPortTo() {
    var inCntryCd = "";
    // 子画面を呼出し、設定した値を取得
    var array = popupWT008(inCntryCd);
    if (array == null) {
        return;
    }
    // 取得した値を画面に設定する
    var cntryCd = array['cntryCd']; // CNTRY CD
    var portCd = array['portCd'];   // PORT CODE/港コード
    if (cntryCd != null) {
        $(':input[name="criteriaDomain.toCntryCd"]').val(cntryCd);
    }
    if (portCd != null) {
        $(':input[name="criteriaDomain.dischargePortCd"]').val(portCd);
    }
}

/*
====================================================================
関数名：showCalendar
引数  ：styleId 活性状態を判定するProperty
        divId 表示するカレンダーのdivのID
        formName フォーム名
        property 結果を格納するプロパティ名
        dateFormat 日付フォーマット
        calImg カレンダーアイコンのオブジェクト
概要  ：Port Select子画面を表示し、
        選択したPORT CODE/港コードを画面のPortFromに反映する。
====================================================================
*/
function showCalendar(divId, formName, property, dateFormat, calImg) {
    if ($(':input[name="' + property +'"]').prop('disabled') == false) {
        gscm.writeCalendar(divId, formName, property, dateFormat, calImg);
    }
}
