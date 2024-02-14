/*
 * W9023.js
 *
 * Java Script fo using Invoice Template MA Edit Screen
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
/*
===============================================================
関数名：
引数  ：
概要  ：初期表示処理
===============================================================
*/
$(function() {
    // Disabled Property
    var items = $(".gscm_required")
    for (var i=0; i< items.length; i++) {
        var itemName = items[i];
        var isDisable = $(itemName).is(":disabled");
        if (isDisable) {
            $(itemName).removeClass("gscm_required");
        }
    }
    
    // Proc Mode
    var procMode = $(':input[name="procMode"]').val();
    if (procMode != '1') {
        // Not ModeNew
        $(':input[name="w9023CriteriaDomain.company"]').removeClass("gscm_required");
        $(':input[name="w9023CriteriaDomain.company"]').addClass("gscm_disptext");
        $(':input[name="w9023CriteriaDomain.company"]').attr('tabindex',-1)
        $(':input[name="w9023CriteriaDomain.company"]').attr('readonly',true);
        $(':input[name="w9023CriteriaDomain.docNo"]').removeClass("gscm_required");
        $(':input[name="w9023CriteriaDomain.docNo"]').addClass("gscm_disptext");
        $(':input[name="w9023CriteriaDomain.docNo"]').attr('tabindex',-1)
        $(':input[name="w9023CriteriaDomain.docNo"]').attr('readonly',true);
        $(':input[name="w9023CriteriaDomain.invoiceCtgry"]').removeClass("gscm_required");
        $(':input[name="w9023CriteriaDomain.invoiceCtgry"]').addClass("gscm_disptext");
        $(':input[name="w9023CriteriaDomain.invoiceClass"]').removeClass("gscm_required");
        $(':input[name="w9023CriteriaDomain.invoiceClass"]').addClass("gscm_disptext");
    }
    
    // DDL Size
    $('select#invoice_ctgry').ieSelectWidth ({
        containerClassName : 'select-container',
        overlayClassName : 'select-overlay'
    });
    $('select#invoice_class').ieSelectWidth ({
        containerClassName : 'select-container',
        overlayClassName : 'select-overlay'
    });
    // all textarea changes wrap attr to off.
    $("textarea").attr('wrap', 'soft');
});

/*
====================================================================
Function Name : Back to Main Screen call processing
Argument      :
    action - Call target
    form - Submit form
Return Value  : -
Outline       : -
関数名：Back to Main Screen処理呼び出し
引数  ：action 呼び出し先
        form 送信フォーム
戻り値：-
概要  ：-
====================================================================
*/ 
function backToInquirySubmit(mode, action, formObj, msg) {  
    if (mode == '3') {
        // refer mode
        gscm.submitBack(action, formObj);
    } else {
    // other mode
    submitBackConfirm(action, formObj, msg);
    }
}