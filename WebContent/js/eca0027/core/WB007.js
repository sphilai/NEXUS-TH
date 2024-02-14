/*
 * WB007.js
 *
 * Order Entry Header画面で用いるJavaScriptです。
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
    $('#tablefix').tablefix({height: 397, fixRows: 1});
    setWarning();
});



/*
===============================================================
関数名：setWarning
引数  ：-
概要  ：Company CD、Item Noのワーニング時のハイライト設定
===============================================================
*/
function setWarning () {
    var customerCd = "wb007CriteriaDomain.customerCd";
    
    var warningFlgCustomerCd = "wb007CriteriaDomain.warningFlgCustomerCd";
    
    var warningFlgCustomerCdVal = $(':input[name="' + warningFlgCustomerCd + '"]').val();
    
    if (warningFlgCustomerCdVal == 'W') {
        $(':text[name="' + customerCd + '"]').addClass("warn");
    }
}