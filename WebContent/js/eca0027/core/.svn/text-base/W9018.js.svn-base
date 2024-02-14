/*
 * W9019.js
 *
 * Export Formalities by Item MA Inquiry 画面で用いるJavaScriptです。
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
    $('#tablefix').tablefix({height: 435, fixRows: 1});
    
    var selectCondition = $(':input[name="w9018CriteriaDomain.selectCondition"]:checked').val();
    if(selectCondition == '2') {
        operationAdd();
    } else {
        operationSearch();
    }

    if ($(':input[name="w9018CriteriaDomain.disabledAdd"]').val() == 'Y') {
        $('#radioAdd').attr('disabled',true);
    }

    $('select#exp_limit_typ').ieSelectWidth ({
        width : 60,
        containerClassName : 'select-container',
        overlayClassName : 'select-overlay'
    });
});

/*
====================================================================
関数名：operationSearch
概要  ：スタイル制御
====================================================================
*/
function operationSearch(){
    $(':input[name="w9018CriteriaDomain.compCd"]').removeClass("gscm_required");
    $(':input[name="w9018CriteriaDomain.itemNo"]').removeClass("gscm_required");
    $(':input[name="w9018CriteriaDomain.cigmaPrdctFlg"]').removeClass("gscm_required");

    // UT387
    // $(':input[name="w9018CriteriaDomain.fmAplyStrtDt"]').attr('disabled',false);
    // $(':input[name="w9018CriteriaDomain.toAplyStrtDt"]').attr('disabled',false);
    $(':input[name="w9018CriteriaDomain.expLimitTyp"]').attr('disabled',false);
    $(':input[name="w9018CriteriaDomain.dngrItemFlg"]').attr('disabled',false);
    $(':input[name="w9018CriteriaDomain.hsCd"]').attr('disabled',false);
    $(':input[name="w9018CriteriaDomain.display"]').attr('disabled',false);

    $(':input[name="add"]').attr('disabled',true);
    $(':input[name="search"]').attr('disabled',false);
    
    $('.w9018_calendar').show();
}

/*
====================================================================
関数名：operationAdd
概要  ：スタイル制御
====================================================================
*/
function operationAdd(){
    $(':input[name="w9018CriteriaDomain.compCd"]').addClass("gscm_required");
    $(':input[name="w9018CriteriaDomain.itemNo"]').addClass("gscm_required");
    $(':input[name="w9018CriteriaDomain.cigmaPrdctFlg"]').addClass("gscm_required");

    // UT387
    // $(':input[name="w9018CriteriaDomain.fmAplyStrtDt"]').attr('disabled',true);
    // $(':input[name="w9018CriteriaDomain.toAplyStrtDt"]').attr('disabled',true);
    $(':input[name="w9018CriteriaDomain.expLimitTyp"]').attr('disabled',true);
    $(':input[name="w9018CriteriaDomain.dngrItemFlg"]').attr('disabled',true);
    $(':input[name="w9018CriteriaDomain.hsCd"]').attr('disabled',true);
    $(':input[name="w9018CriteriaDomain.display"]').attr('disabled',true);

    $(':input[name="add"]').attr('disabled',false);
    $(':input[name="search"]').attr('disabled',true);
    
    $('.w9018_calendar').hide();
}

