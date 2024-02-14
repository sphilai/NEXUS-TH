/*
 * W9007.js
 *
 * マスタメンテナンス 送荷先マスタ検索画面で用いるJavaScriptです。
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
    $('#tablefix').tablefix({height: 433, fixRows: 1});

    // Selected Condition(radio button)
    $("[name='w9007CriteriaDomain.selectCondition']").click(function(){
        var num = $("[name='w9007CriteriaDomain.selectCondition']").index(this);
        if(num == 0){
            // Selected Search
            $("[name='w9007CriteriaDomain.shipperCd']").removeClass("gscm_required");
            $("[name='w9007CriteriaDomain.shipToCompCd']").attr("disabled", false);
            $("[name='w9007CriteriaDomain.containerSortingKey']").attr("disabled", false);
            $("[name='w9007CriteriaDomain.loadingCd']").attr("disabled", false);
            $("[name='w9007CriteriaDomain.display']").attr("disabled", false);
            $("[name='w9007CriteriaDomain.containerLooseTyp']").attr("disabled", false);

            $("[name='add']").attr("disabled", true);
            $("[name='search']").attr("disabled", false);
        } else {
            // Selected Add
            $("[name='w9007CriteriaDomain.shipperCd']").addClass("gscm_required");
            $("[name='w9007CriteriaDomain.shipToCompCd']").attr("disabled", true);
            $("[name='w9007CriteriaDomain.containerSortingKey']").attr("disabled", true);
            $("[name='w9007CriteriaDomain.loadingCd']").attr("disabled", true);
            $("[name='w9007CriteriaDomain.display']").attr("disabled", true);
            $("[name='w9007CriteriaDomain.containerLooseTyp']").attr("disabled", true);

            $("[name='add']").attr("disabled", false);
            $("[name='search']").attr("disabled", true);
        }
    });
    
    // DDL Size
    $('select#loading_cd').ieSelectWidth ({
        containerClassName : 'select-container',
        overlayClassName : 'select-overlay'
    });
    $('select#container_loose_typ').ieSelectWidth ({
        containerClassName : 'select-container',
        overlayClassName : 'select-overlay'
    });
});

