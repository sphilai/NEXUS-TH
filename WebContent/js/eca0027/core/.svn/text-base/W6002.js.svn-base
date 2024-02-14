/*
 * W6002.js
 *
 * 通関書類作成業務 Manual Invoice Upload画面で用いるJavaScriptです。
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
    // Setting requiired.
    if("4" == $('#functionNo').val()) {
        $(':input[name="invoicePdfFile"]').removeClass("gscm_required");
    }

    disableControlPackingList();

    // DDLの幅調整
    $('select#typeOfInv').ieSelectWidth ({
        containerClassName : 'select-container',
        overlayClassName : 'select-overlay'
    });
    $('select#classOfInv').ieSelectWidth ({
        containerClassName : 'select-container',
        overlayClassName : 'select-overlay'
    });
    $('select#invoiceCtgry').ieSelectWidth ({
        containerClassName : 'select-container',
        overlayClassName : 'select-overlay'
    });
    $('select#trnsCd').ieSelectWidth ({
        containerClassName : 'select-container',
        overlayClassName : 'select-overlay'
    });
    $('select#freightRes').ieSelectWidth ({
        containerClassName : 'select-container',
        overlayClassName : 'select-overlay'
    });
    $('select#price_terms').ieSelectWidth ({
        containerClassName : 'select-container',
        overlayClassName : 'select-overlay'
    });
    $('select#trade_terms').ieSelectWidth ({
        containerClassName : 'select-container',
        overlayClassName : 'select-overlay'
    });
    $('select#payment_method').ieSelectWidth ({
        containerClassName : 'select-container',
        overlayClassName : 'select-overlay'
    });
    $('select#curr_cd').ieSelectWidth ({
        containerClassName : 'select-container',
        overlayClassName : 'select-overlay'
    });
    $('select#volume_unit').ieSelectWidth ({
        containerClassName : 'select-container',
        overlayClassName : 'select-overlay'
    });
    $('select#weight_unit').ieSelectWidth ({
        containerClassName : 'select-container',
        overlayClassName : 'select-overlay'
    });
    var items = $(".gscm_required")
    for (var i=0; i< items.length; i++) {
        var itemName = items[i];
        var isDisable = $(itemName).is(":disabled");
        if (isDisable) {
            $(itemName).removeClass("gscm_required");
        }
    }

    // ST943 DEL START
    // メッセージがある場合、確認ダイアログを表示してManual Invoice Upload画面アクションを呼ぶ
    //var msg = $(':input[name="w6002CriteriaDomain.confirmMsg"]').val();
    //if(0 < msg.length) {
    //    $(':input[name="w6002CriteriaDomain.continueFlag"]').val('Y');
    //    gscm.submitConfirm('W6002Register.do', $('form[id="mainForm"]').get(0), msg);
    //    $(':input[name="w6002CriteriaDomain.continueFlag"]').val('');
    //    $(':input[name="w6002CriteriaDomain.confirmMsg"]').val('');
    //}
    // ST943 DEL END
});
/*
====================================================================
関数名：disableControlPackingList
引数  ：none
概要  ：
    In the case of re-invoice, clear and disable the PACKING LIST
    リインボイスの場合PACKING LISTをクリアして非活性にする。
    ST947 ADD
====================================================================
*/
function disableControlPackingList() {
    if ($("#typeOfInv").val() == "1") {
        $("#packingList").replaceWith($("#packingList").clone()); // clear value
    }
    $("#packingList").attr("disabled", $("#typeOfInv").val() == "1");
}
/*
====================================================================
関数名：doRegister
引数  ：
    action:action url
    formObj:form object
    cfmMsgNoFile:confirm message
概要  ：
    At invoice cancellation, if the upload file is not set,
    it submits after displaying a confirmation dialog.
    In other cases, submit without displaying the confirmation dialog. 
    インボイスキャンセルにて、アップロードファイル未設定の場合、確認ダイアログを表示後サブミットする。
    その他の場合は、確認ダイアログは表示せずサブミットする。
    ST943 ADD
====================================================================
*/
function doRegister(action, formObj, cfmMsgNoFile) {
    if ($("#functionNo").val() == "4") {
        if ($("#invoicePdf").val() == "") {
            return gscm.submitConfirm(action, formObj, cfmMsgNoFile);
        }
    }
    return gscm.commonSubmit(action, formObj);
}
/*
====================================================================
関数名：selectShipper
引数  ：-
概要  ：Company Select子画面を表示し、
        選択したCOMPANY CODE/会社コードを画面のShipperに反映する。
====================================================================
*/
function selectShipper() {
    // 子画面を呼出し、設定した値を取得
    var array = popupWT001('Y', '', '');
    if (array == null) {
        return;
    }

    // 取得した値を画面に設定する
    var compCd = array['compCd'] // COMPANY CODE/会社コード
    var compNm = array['compNm'] // COMPANY NAME/会社名称

    if (compCd != null) {
        $(':input[name="w6002CriteriaDomain.shipperCd"]').val(compCd);
        $(':input[name="w6002CriteriaDomain.shipCompNm"]').val(compNm);
    }

}
/*
====================================================================
関数名：selectConsignee
引数  ：-
概要  ：Company Select子画面を表示し、
        選択したCOMPANY CODE/会社コードを画面のConsigneeに反映する。
====================================================================
*/
function selectConsignee() {
    // 子画面を呼出し、設定した値を取得
    var array = popupWT001('', '', '');
    if (array == null) {
        return;
    }

    // 取得した値を画面に設定する
    var compCd = array['compCd'] // COMPANY CODE/会社コード
    var compNm = array['compNm'] // COMPANY NAME/会社名称

    if (compCd != null) {
        $(':input[name="w6002CriteriaDomain.consigneeCd"]').val(compCd);
        $(':input[name="w6002CriteriaDomain.consCompNm"]').val(compNm);
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
    if (array == null) {
        return;
    }

    // 取得した値を画面に設定する
    var shipToCd = array['shipToCd'] // SHIP TO CODE/送荷先コード
    var shipToNm = array['shipToNm'] // SHIP TO NAME/送荷先名称

    if (shipToCd != null) {
        $(':input[name="w6002CriteriaDomain.shipToCd"]').val(shipToCd);
        $(':input[name="w6002CriteriaDomain.shipToNm"]').val(shipToNm);
    }
}
/*
====================================================================
関数名：selectReferenceInvShipper
引数  ：-
概要  ：Company Select子画面を表示し、
        選択したCOMPANY CODE/会社コードを画面のReferenceInvShipperに反映する。
====================================================================
*/
function selectReferenceInvShipper() {
    // 子画面を呼出し、設定した値を取得
    var array = popupWT001('Y', '', '');
    if (array == null) {
        return;
    }

    // 取得した値を画面に設定する
    var compCd = array['compCd'] // COMPANY CODE/会社コード
    var compNm = array['compNm'] // COMPANY NAME/会社名称

    if (compCd != null) {
        $(':input[name="w6002CriteriaDomain.relateInvoiceShipperCd"]').val(compCd);
        $(':input[name="w6002CriteriaDomain.relateShipToNm"]').val(compNm);
    }
}
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
    var compNm = array['compNm'] // COMPANY NAME/会社名称

    if (compCd != null) {
        $(':input[name="w6002CriteriaDomain.carrierCompCd"]').val(compCd);
        $(':input[name="w6002CriteriaDomain.carCompNm"]').val(compNm);
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
    var compNm = array['compNm'] // COMPANY NAME/会社名称
    if (compCd != null) {
        $(':input[name="w6002CriteriaDomain.forwarderCompCd"]').val(compCd);
        $(':input[name="w6002CriteriaDomain.forCompNm"]').val(compNm);
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
    var inCntryCd = document.getElementById("cntryCd").value;
    // 子画面を呼出し、設定した値を取得
    var array = popupWT008(inCntryCd);
    if (array == null) {
        return;
    }

    // 取得した値を画面に設定する
    var cntryCd = array['cntryCd'] // Country CD
    var portCd = array['portCd'] // PORT CODE/港コード
    var portNm = array['portNm'] // PORT NAME/港名
    if (portCd != null) {
        $(':input[name="w6002CriteriaDomain.fmCntryCd"]').val(cntryCd);
        $(':input[name="w6002CriteriaDomain.loadingPortCd"]').val(portCd);
        $(':input[name="w6002CriteriaDomain.portNmFrom"]').val(portNm);
    }
}
/*
====================================================================
関数名：selectPortTo
引数  ：-
概要  ：Port Select子画面を表示し、
        選択したPORT CODE/港コードを画面のPortToに反映する。
====================================================================
*/
function selectPortTo() {
    var inCntryCd = document.getElementById("cntryCd").value;
    // 子画面を呼出し、設定した値を取得
    var array = popupWT008('');
    if (array == null) {
        return;
    }

    // 取得した値を画面に設定する
    var cntryCd = array['cntryCd'] // PORT CODE/港コード
    var portCd = array['portCd'] // PORT CODE/港コード
    var portNm = array['portNm'] // PORT NAME/港名
    if (portCd != null) {
        $(':input[name="w6002CriteriaDomain.toCntryCd"]').val(cntryCd);
        $(':input[name="w6002CriteriaDomain.dischargePortCd"]').val(portCd);
        $(':input[name="w6002CriteriaDomain.portNmTo"]').val(portNm);
    }
}
/*
====================================================================
関数名：showCalendar
引数  ：styleId 活性状態を判定する画面ID
        divId 表示するカレンダーのdivのID
        valNm 選択した年月日を入力するテキストのプロパティ名
        dateFormat 年月日を表示する際の日付フォーマット
        calImg カレンダーアイコンのオブジェクト
概要  ：Port Select子画面を表示し、
        選択したPORT CODE/港コードを画面のPortFromに反映する。
====================================================================
*/
function showCalendar(styleId, divId, formName, valNm, dateFormat, calImg) {
    if (document.getElementById(styleId).disabled == false) {
        //入力欄が活性の場合、カレンダーを表示
        gscm.writeCalendar(divId, formName, valNm, dateFormat, calImg);
    }
}