/*
 * W9019.js
 *
 * Export Formalities by Item MA Edit 画面で用いるJavaScriptです。
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
    // Proc Mode
    var procMode = $(':input[name="w9019CriteriaDomain.mode"]').val();
    if (procMode == '2' || procMode == '3') {
        // Not ModeNew
        $('#aplyStrtDtCal').css("display","none"); 

        $(':input[name="w9019CriteriaDomain.aplyStrtDt"]').removeClass("gscm_required");
        $(':input[name="w9019CriteriaDomain.aplyStrtDt"]').addClass("gscm_disptext");
        $(':input[name="w9019CriteriaDomain.aplyStrtDt"]').attr('tabindex',-1)
        $(':input[name="w9019CriteriaDomain.aplyStrtDt"]').attr('readonly',true);
    } 
    if (procMode == '3') {
        $(':input[name="w9019CriteriaDomain.hsCd"]').addClass("gscm_disptext");
        $(':input[name="w9019CriteriaDomain.hsCd"]').attr('tabindex',-1)
        $(':input[name="w9019CriteriaDomain.hsCd"]').attr('readonly',true);
    }

    // disabled
    var items = $(".gscm_required")
    for (var i=0; i< items.length; i++) {
        var itemName = items[i];
        var isDisable = $(itemName).is(":disabled");
        if (isDisable) {
            $(itemName).removeClass("gscm_required");
        }
    }
    
    // DDL Size
    $('select#exp_limit_typ').ieSelectWidth ({
        containerClassName : 'select-container',
        overlayClassName : 'select-overlay'
    });
});

/*
====================================================================
関数名：setOriginCntryCd
概要  ：Country of Originをセットする
====================================================================
*/
function setOriginCntryCd() {
    // 子画面を呼出し、設定した値を取得
    var array = popupWT011();
    if (array == null) {
        return;
    }

    // 取得した値を画面に設定する
    var originCntryCd = array['cntryCd']; // COUNTRY CODE
    if (originCntryCd != null) {
        $(':input[name="w9019CriteriaDomain.originCntryCd"]').val(originCntryCd);
    }
}

function backToInquirySubmit(mode, action, formObj, msg) {  
    if (mode == '3') {
        // refer mode
        gscm.submitBack(action, formObj);
    } else {
    // other mode
    submitBackConfirm(action, formObj, msg);
    }
}

