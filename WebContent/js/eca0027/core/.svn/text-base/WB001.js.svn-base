/*
 * WB001.js
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
    changeItem();
    getTrnsCdDisp();
    setWarning();
});

/*
===============================================================
関数名：getTrnsCdDisp
引数  ：-
概要  ：選択されたTrans CDのテキストを取得
===============================================================
*/
function getTrnsCdDisp () {
    $('[name="wb001CriteriaDomain.trnsCd"]').change( function(){
        var trnsCdDisp = $('[name="wb001CriteriaDomain.trnsCd"] option:selected').text();
        $(':input[name="wb001CriteriaDomain.trnsCdDisp"]').val(trnsCdDisp);
    });
}

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
    $(':input[name="wb001CriteriaDomain.rcvOdrCompCd"]').change( function(){
        $(':input[name="wb001CriteriaDomain.compNm"]').val("");
        $(':input[name="wb001CriteriaDomain.shipToNm"]').val("");
        $(':input[name="wb001CriteriaDomain.itemDescription"]').val("");
    });
    $(':input[name="wb001CriteriaDomain.customerCd"]').change( function(){
        $(':input[name="wb001CriteriaDomain.shipToNm"]').val("");
    });
    $(':input[name="wb001CriteriaDomain.lgcyShipTo"]').change( function(){
        $(':input[name="wb001CriteriaDomain.shipToNm"]').val("");
    });
    $(':input[name="wb001CriteriaDomain.itemNo"]').change( function(){
        $(':input[name="wb001CriteriaDomain.itemDescription"]').val("");
    });
}

/*
===============================================================
関数名：setWarning
引数  ：-
概要  ：Company CD、Item Noのワーニング時のハイライト設定
===============================================================
*/
function setWarning () {
    var customerCd = "wb001CriteriaDomain.customerCd";
    var itemNo = "wb001CriteriaDomain.itemNo";
    
    var warningFlgCustomerCd = "wb001CriteriaDomain.warningFlgCustomerCd";
    var warningFlgItemNo = "wb001CriteriaDomain.warningFlgItemNo";
    
    var warningFlgCustomerCdVal = $(':input[name="' + warningFlgCustomerCd + '"]').val();
    var warningFlgItemNoVal = $(':input[name="' + warningFlgItemNo + '"]').val();
    
    if (warningFlgCustomerCdVal == 'Y') {
        $(':text[name="' + customerCd + '"]').addClass("warn");
    }
    if (warningFlgItemNoVal == 'Y') {
        $(':text[name="' + itemNo + '"]').addClass("warn");
    }
}