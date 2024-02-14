/*
 * WB003.js
 *
 * Order Entry Multi P/O Register画面で用いるJavaScriptです。
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
});

/*
===============================================================
関数名：chengeChkBox
引数  ：
概要  ：check box 変更時
        項目の表示を制御する。
===============================================================
*/
function chengeChkBox(index) {
    
    var chkBox = "wb003ListDomainList[" + index + "].selected";
    
    var customerItemNo = "wb003ListDomainList[" + index + "].customerItemNo";
    var customerPoNo = "wb003ListDomainList[" + index + "].customerPoNo";
    
    if ($(':checkbox[name="' + chkBox + '"]').prop("checked")) {
        $(':text[name="' + customerItemNo + '"]').addClass("gscm_required");
        $(':text[name="' + customerPoNo + '"]').addClass("gscm_required");
    } else {
        $(':text[name="' + customerItemNo + '"]').removeClass("gscm_required");
        $(':text[name="' + customerPoNo + '"]').removeClass("gscm_required");
    }
}