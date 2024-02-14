/*
 * W9016.js
 *
 * マスタメンテナンス 輸出出荷品番マスタ検索画面で用いるJavaScriptです。
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
    var operationType = document.getElementsByName("operationType");
    if (operationType[0].checked) {
        operationSearch();
    } else if (operationType[1].checked) {
        operationAdd();
    }
    
    // DDL Size
    $('select#stgInstrFlg').ieSelectWidth ({
        containerClassName : 'select-container',
        overlayClassName : 'select-overlay'
    });
    $('select#customTimingTyp').ieSelectWidth ({
        containerClassName : 'select-container',
        overlayClassName : 'select-overlay'
    });
    $('#tablefix').tablefix({height: 370, fixRows: 1});
});
/*
====================================================================
関数名：operationSearch
引数  ：-
概要  ：Serach選択時に実行する処理。
====================================================================
*/
function operationSearch(){
    $(':input[name="w9016CriteriaDomain.compCd"]').removeClass("gscm_required");
    $(':input[name="w9016CriteriaDomain.itemNo"]').removeClass("gscm_required");
    $(':input[name="w9016CriteriaDomain.customerCd"]').removeClass("gscm_required");
    $(':input[name="w9016CriteriaDomain.lgcyShipTo"]').removeClass("gscm_required");
    
    $(':input[name="w9016CriteriaDomain.containerSortingKey"]').attr('disabled',false);
    $(':input[name="w9016CriteriaDomain.display"]').attr('disabled',false);
    $(':input[name="w9016CriteriaDomain.stgInstrItemFlg"]').attr('disabled',false);
    $(':input[name="w9016CriteriaDomain.customTimingTyp"]').attr('disabled',false);
    $(':input[name="w9016CriteriaDomain.invoiceKey"]').attr('disabled',false);
    $(':input[name="w9016CriteriaDomain.display"]').attr('disabled',false);
    $(':input[name="add"]').attr('disabled',true);
    $(':input[name="search"]').attr('disabled',false);
}
/*
====================================================================
関数名：operationAdd
引数  ：-
概要  ：Add選択時に実行する処理。
====================================================================
*/
function operationAdd(){
    $(':input[name="w9016CriteriaDomain.compCd"]').addClass("gscm_required");
    $(':input[name="w9016CriteriaDomain.itemNo"]').addClass("gscm_required")
    $(':input[name="w9016CriteriaDomain.customerCd"]').addClass("gscm_required");
    $(':input[name="w9016CriteriaDomain.lgcyShipTo"]').addClass("gscm_required");
    
    $(':input[name="w9016CriteriaDomain.containerSortingKey"]').attr('disabled',true);
    $(':input[name="w9016CriteriaDomain.stgInstrItemFlg"]').attr('disabled',true);
    $(':input[name="w9016CriteriaDomain.customTimingTyp"]').attr('disabled',true);
    $(':input[name="w9016CriteriaDomain.invoiceKey"]').attr('disabled',true);
    $(':input[name="w9016CriteriaDomain.display"]').attr('disabled',true);
    $(':input[name="add"]').attr('disabled',false);
    $(':input[name="search"]').attr('disabled',true);
}
