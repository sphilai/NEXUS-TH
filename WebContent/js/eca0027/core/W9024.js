/*
 * W9024.js
 *
 * P/No Apply Start Date Refer & Register で用いるJavaScriptです。
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
    var msg = $(':input[name="w9024CriteriaDomain.confirmMsg"]').val();
    if(msg && 0 < msg.length) {
        $(':input[name="w9024CriteriaDomain.confirmMsg"]').val('');
        $(':input[name="w9024CriteriaDomain.continueFlag"]').val('Y');
        gscm.submitConfirm('W9024Register.do', $('form[id="mainForm"]').get(0), msg);
    }
    $(':input[name="w9024CriteriaDomain.confirmMsgCd"]').val('');
    $(':input[name="w9024CriteriaDomain.continueFlag"]').val('');
    
    // DDL Size
    $('select#trns_cd').ieSelectWidth ({
        containerClassName : 'select-container',
        overlayClassName : 'select-overlay'
    });
    
    $('#tablefix').tablefix({height: 364, fixRows: 2});
});