/*
 * W2012.js
 *
 * CML Register画面で用いるJavaScriptです。
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
    $('#tablefix').tablefix({height: 397, fixRows: 1});
    init();

    // UT110 TRIAL SHIPMENT/号試品対応 ADD
    $("#length, #width, #height").change(function() {
        calcVolume();
    });
});

/*
====================================================================
関数名：init()
引数  ：なし
概要  ：初期表示イベント
        非活性項目のスタイルクラスから、.gscm_required を外す。
        ワーニングエラーが発生している項目のスタイルクラスに
        .warn を追加する。
====================================================================
*/
function init(){

    // outerPkgCd 非活性時のstyleClass指定
    var isDisabled = $('#selectOuterPkgCdBtn').is(':disabled');

    if ( isDisabled ) {
        $(':input[name="w2012CriteriaDomain.outerPkgCd"]').removeClass("gscm_required");
    } else {
        $(':input[name="w2012CriteriaDomain.outerPkgCd"]').addClass("gscm_required");
    }

    // ワーニング発生時の初期表示処理
    var table = $(".gscm_resultlist");
    var len = -1;
    for(var i=0,tr,trs=table[0].getElementsByTagName('tr');tr=trs[i];i++){
        len = len + 1;
    }
    var warningFlgName = "";
    var noName = "";
    
    for (var i=0 ; i< len; i++){
        warningFlgName = "listDomainList[" + i + "].warningFlg";
        noName = "listDomainList[" + i + "].no";
        
        var warningFlg = $(':input[name="' + warningFlgName + '"]').val();
        if (warningFlg == 'Y') {
            $(':input[name="' + noName + '"]').addClass("warn");
        }
    }
    
    // Vol. の値がない場合は単位を非表示にする
    if ($('#volume').val()=="") {
        $('#volumeUnit').hide();
    }
    // N/W の値がない場合は単位を非表示にする
    if ($('#netWeight').val()=="") {
        $('#netWeightUnit').hide();
    }
    // G/W の値がない場合は単位を非表示にする
    if ($('#grossWeight').val()=="") {
        $('#grossWeightUnit').hide();
    }
}

/*
====================================================================
関数名：backToCreate
引数  ：path 遷移先
        form フォーム
        confirmMsg 確認メッセージ
概要  ：packagingConfirmedFlg が Y の場合は、確認メッセージを表示
        して画面遷移する。
        そうでない場合は、そのまま画面遷移する。
====================================================================
*/
function confirmAndMove(form, confirmMsg){

    var packagingConfirmedFlg = $(':text[name="w2012CriteriaDomain.packagingConfirmedFlg"]').val();

    if (packagingConfirmedFlg == "Y") {
        submitBackConfirm('W2011Init.do', form, confirmMsg);
    } else {
        gscm.submitBack('W2011Init.do', form);
    }
}

/*
====================================================================
関数名：setOuterPkgCd
引数  ：shipperCd
概要  ：外装コードを選択するポップアップ画面を表示し
        選択した値を画面に反映する。
        外装コードを変更した場合は、packagingConfirmedFlg を N にする。
====================================================================
*/
function setOuterPkgCd(shipperCd) {

    // selectボタン押下時の値を保持
    var orgOuterPkgCd = $(':text[name="w2012CriteriaDomain.outerPkgCd"]').val();
    
    // 子画面を呼出し、設定した値を取得
    var array = popupWT006(shipperCd);
    
    // 取得した値を画面に設定する
    var outerCd = array['outerPkgCd'] // OUTER CODE/外装記号
    var weightAfter = array['weightAfter'] // WEIGHT AFTER CHANGE/重量 変更後
    var weightUnitComp = array['weightUnitComp'] // WEIGHT UNIT/重量単位(会社)
    var volumeAfter = array['volumeAfter'] // VOLUME AFTER CHANGE/容積 変更後
    var volumeUnitComp = array['volumeUnitComp'] // VOLUME UNIT/容積単位(会社)
    var ownerComp = array['ownerComp'] // OWNER COMPANY/責任会社
    var weightUnitDisp = array['weightUnitDisp'] // WEIGHT UNIT DISPLAY/重量単位表記
    var volumeUnitDisp = array['volumeUnitDisp'] // VOLUME UNIT DISPLAY/容積単位表記
    
    $(':input[name="w2012CriteriaDomain.outerPkgCd"]').val(outerCd);
    $(':input[name="w2012CriteriaDomain.volume"]').val(volumeAfter);
    $(':input[name="w2012CriteriaDomain.volumeUnit"]').val(volumeUnitDisp);
    $(':input[name="w2012CriteriaDomain.volumeUnit"]').show();

    // packagingConfirmedFlg を N にする。
    if (orgOuterPkgCd != outerCd) {
        $(':text[name="w2012CriteriaDomain.packagingConfirmedFlg"]').val("N");
    }
}

// UT110 TRIAL SHIPMENT/号試品対応 ADD
/*
====================================================================
関数名：calcVolume
引数  ：none/なし
概要  ：Volume auto calc./容積の自動計算
====================================================================
*/
function calcVolume() {
    $("#volume").val("");
    $("span[class='volume_disp']").html("");
    var strLength = $("#length").val();
    var strWidth = $("#width").val();
    var strHeight = $("#height").val();
    var regexp = /^\d{1,4}(\.\d{1,3})?$/;
    if (!strLength.match(regexp) || !strWidth.match(regexp) || !strHeight.match(regexp)) {
        return;
    }
    var length = parseFloat(strLength);
    var width = parseFloat(strWidth);
    var height = parseFloat(strHeight);
    var volume = (length * 1000) * (width * 1000) * (height * 1000);
    volume = Math.ceil(volume / 1000000) / 1000;
    if (volume > 999999700000.030) {
        volume = 999999700000.030;
    }
    volume = volume.toFixed(3);
    if (!isNaN(volume)) {
        $("#volume").val(volume);
        $("span[class='volume_disp']").html(volume);
    }
}

