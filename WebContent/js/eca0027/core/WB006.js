/*
 * WB006.js
 *
 * Last Digit Change Main Screen画面で用いるJavaScriptです。
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
    changeItem();
    getTrnsCdDisp();
});

/*
===============================================================
関数名：changeItem
引数  ：-
概要  ：Company CD 変更時、Company Name、Ship to Name、Part Nameのクリア
        Customer No 変更時、Ship to Nameのクリア
        Ship to CD 変更時、Ship to Nameのクリア
        Part No (ORG) 変更時、Part Nameのクリア
===============================================================
*/
function changeItem () {
    $(':input[name="wb006CriteriaDomain.rcvOdrCompCd"]').change( function(){
        $(':input[name="wb006CriteriaDomain.compNm"]').val("");
        $(':input[name="wb006CriteriaDomain.shipToNm"]').val("");
        $(':input[name="wb006CriteriaDomain.itemDescription"]').val("");
    });
    $(':input[name="wb006CriteriaDomain.customerCd"]').change( function(){
        $(':input[name="wb006CriteriaDomain.shipToNm"]').val("");
    });
    $(':input[name="wb006CriteriaDomain.lgcyShipTo"]').change( function(){
        $(':input[name="wb006CriteriaDomain.shipToNm"]').val("");
    });
    $(':input[name="wb006CriteriaDomain.itemNoOrg"]').change( function(){
        $(':input[name="wb006CriteriaDomain.itemDescription"]').val("");
    });
}

/*
===============================================================
関数名：getTrnsCdDisp
引数  ：-
概要  ：選択されたTrans CDのテキストを取得
===============================================================
*/
function getTrnsCdDisp () {
    $('[name="wb006CriteriaDomain.trnsCd"]').change( function(){
        var trnsCdDisp = $('[name="wb006CriteriaDomain.trnsCd"] option:selected').text();
        $(':input[name="wb006CriteriaDomain.trnsCdDisp"]').val(trnsCdDisp);
    });
}