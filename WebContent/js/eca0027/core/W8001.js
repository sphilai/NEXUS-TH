/*
 * W8001.js
 *
 * 進度管理Main画面で用いるJavaScriptです。
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
        // disabled
    var errItems = $(".gscm_error_class")
    for (var i=0; i< errItems.length; i++) {
        var itemName = errItems[i];
        var isDisable = $(itemName).is(":disabled");
        if (isDisable) {
            $(itemName).removeClass("gscm_error_class");
        }
    }

    // Selected Condition(radio button)
    $("[name='w8001CriteriaDomain.selectCondition']").click(function(){
        var num = $("[name='w8001CriteriaDomain.selectCondition']").index(this);
        if(num == 0){
            // Selected ItemNo
            $("[name='w8001CriteriaDomain.pltzItemNo']").attr("disabled", false);
            $("[name='w8001CriteriaDomain.pltzItemNo']").val("");
            $("[name='w8001CriteriaDomain.customerPoNo']").attr("disabled", true);
            $("[name='w8001CriteriaDomain.customerPoNo']").val("");
            $("[name='w8001CriteriaDomain.customerPoNo']").removeClass("gscm_error_class");
        } else {
            $("[name='w8001CriteriaDomain.pltzItemNo']").attr("disabled", true);
            $("[name='w8001CriteriaDomain.pltzItemNo']").val("");
            $("[name='w8001CriteriaDomain.pltzItemNo']").removeClass("gscm_error_class");
            $("[name='w8001CriteriaDomain.customerPoNo']").attr("disabled", false);
            $("[name='w8001CriteriaDomain.customerPoNo']").val("");
        }
    });
    
    // DDL Size
    $('select#trns_cd').ieSelectWidth ({
        containerClassName : 'select-container',
        overlayClassName : 'select-overlay'
    });
    $('select#exp_packing_issuer_id').ieSelectWidth ({
        containerClassName : 'select-container',
        overlayClassName : 'select-overlay'
    });
    $('select#status').ieSelectWidth ({
        containerClassName : 'select-container',
        overlayClassName : 'select-overlay'
    });
    $('select#cml_typ').ieSelectWidth ({
        containerClassName : 'select-container',
        overlayClassName : 'select-overlay'
    });
    $('select#custom_timing_typ').ieSelectWidth ({
        containerClassName : 'select-container',
        overlayClassName : 'select-overlay'
    });
    $('select#request_issuer_id').ieSelectWidth ({
        containerClassName : 'select-container',
        overlayClassName : 'select-overlay'
    });
    $('select#invoice_ctgry').ieSelectWidth ({
        containerClassName : 'select-container',
        overlayClassName : 'select-overlay'
    });
    $('#tablefix').tablefix({height: 339, fixRows: 2});
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
    var compCd = array['compCd'] // COMPANY CODE/会社コード
    if (compCd != null) {
        $(':input[name="w8001CriteriaDomain.shipperCd"]').val(compCd);
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
    var compCd = array['compCd'] // COMPANY CODE/会社コード
    if (compCd != null) {
        $(':input[name="w8001CriteriaDomain.consigneeCd"]').val(compCd);
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
function selectCondition() {

}

