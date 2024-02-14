/*
 * WB004.js
 *
 * Order Inquiry Main Screen画面で用いるJavaScriptです。
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
    $('#tablefix').tablefix({height: 476, fixRows: 1});
    changeItem();
});

/*
===============================================================
関数名：changeItem
引数  ：-
概要  ：Company Cd 変更時、Company Name、Part Nameのクリア
        Part No 変更時、Part Nameのクリア
===============================================================
*/
function changeItem () {
    $(':input[name="wb004CriteriaDomain.rcvOdrCompCd"]').change( function(){
        $(':input[name="wb004CriteriaDomain.compNm"]').val("");
        $(':input[name="wb004CriteriaDomain.itemDescription"]').val("");
    });
    $(':input[name="wb004CriteriaDomain.itemNo"]').change( function(){
        $(':input[name="wb004CriteriaDomain.itemDescription"]').val("");
    });
}
