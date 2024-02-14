/*
 * W9025.js
 *
 * Actual Item Weight Refer & Register で用いるJavaScriptです。
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
    var msg = $(':input[name="w9025CriteriaDomain.confirmMsg"]').val();
    if(msg && 0 < msg.length) {
        $(':input[name="w9025CriteriaDomain.confirmMsg"]').val('');
        $(':input[name="w9025CriteriaDomain.continueFlag"]').val('Y');
        gscm.submitConfirm('W9025Register.do', $('form[id="mainForm"]').get(0), msg);
    }
    $(':input[name="w9025CriteriaDomain.confirmMsgCd"]').val('');
    $(':input[name="w9025CriteriaDomain.continueFlag"]').val('');
});