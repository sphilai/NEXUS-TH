﻿/*
 * W9008.js
 *
 * Export Ship to Shipping MA Edit画面で用いるJavaScriptです。
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
    
    $('select#loading_cd').ieSelectWidth ({
        containerClassName : 'select-container',
        overlayClassName : 'select-overlay'
    });
    $('select#container_loose_typ').ieSelectWidth ({
        containerClassName : 'select-container',
        overlayClassName : 'select-overlay'
    });
    $('select#custom_timing_typ').ieSelectWidth ({
        containerClassName : 'select-container',
        overlayClassName : 'select-overlay'
    });
    // NL023 ADD START
    // 説明文が横並びに表示されなくなるためこの項目には使用しない。値も1文字なので必要ない。
    //$('select#packing_summary_atch_flg').ieSelectWidth ({
    //    containerClassName : 'select-container',
    //    overlayClassName : 'select-overlay'
    //});
    // NL023 ADD END
    $('select#doc_no0').ieSelectWidth ({
        containerClassName : 'select-container',
        overlayClassName : 'select-overlay'
    });
    $('select#doc_no1').ieSelectWidth ({
        containerClassName : 'select-container',
        overlayClassName : 'select-overlay'
    });
    $('select#doc_no2').ieSelectWidth ({
        containerClassName : 'select-container',
        overlayClassName : 'select-overlay'
    });
    $('select#doc_no3').ieSelectWidth ({
        containerClassName : 'select-container',
        overlayClassName : 'select-overlay'
    });
    $('select#doc_no4').ieSelectWidth ({
        containerClassName : 'select-container',
        overlayClassName : 'select-overlay'
    });
    $('select#doc_no5').ieSelectWidth ({
        containerClassName : 'select-container',
        overlayClassName : 'select-overlay'
    });
    $('select#doc_no6').ieSelectWidth ({
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
});

/*
====================================================================
関数名：backToInquiry
引数  ：  mode: proc mode
            msg: confirm message
            form: this.form
概要  ：Back To Export Ship to Shipping Ma Inquiry screen.
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
