/*
 * W2019.js
 *
 * CML Trans Revise画面で用いるJavaScriptです。
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
/*
====================================================================
関数名：
引数  ：なし
概要  ：画面表示時に呼ばれるJavascript
====================================================================
*/
$(function() {
    $('#tablefix').tablefix({height: 397, fixRows: 1});
    
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

    // UT110 TRIAL SHIPMENT/号試品対応 ADD
    $("#length, #width, #height").change(function() {
        calcVolume();
    });
});

/*
====================================================================
関数名：setOuterPkgCd
引数  ：なし
概要  ：外装コードを選択するポップアップ画面を表示し
        選択した値を画面に反映する。
        外装コードを変更した場合は、packagingConfirmedFlg を N にする。
====================================================================
*/
function setOuterPkgCd() {

    var shipperCd = $('#shipeerCd').val();
    var beforeOuterPkgCd = $(':input[name="w2019CriteriaDomain.outerPkgCd"]').val();

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
    
    $(':input[name="w2019CriteriaDomain.outerPkgCd"]').val(outerCd);
    $(':input[name="w2019CriteriaDomain.volume"]').val(volumeAfter);
    $(':input[name="w2019CriteriaDomain.volumeUnit"]').val(volumeUnitDisp);

    // packagingConfirmedFlg を N にする。
    if (beforeOuterPkgCd != outerCd) {
        $(':text[name="w2019CriteriaDomain.packagingConfirmedFlg"]').val("N");
    }
}

/*
====================================================================
関数名：clear
引数  ：なし
概要  ：outerPkgCd の設定値をクリアする。
====================================================================
*/
function clearOuterPkg() {
    $("#outerPkgCd").val('');
    $(':text[name="w2019CriteriaDomain.packagingConfirmedFlg"]').val("N");
}

/*
====================================================================
関数名：changeTransToAir
引数  ：なし
概要  ：Change Trans. To Air の値が変更された場合は、
        packagingConfirmedFlg に N を設定する。
====================================================================
*/
function changeTransToAir() {
    var orgVal = $("#orgReviseFlg").val();
    var newVal = $(':input[name="w2019CriteriaDomain.reviseFlg"]').val();
    if (orgVal != newVal) {
        $(':text[name="w2019CriteriaDomain.packagingConfirmedFlg"]').val("N");
    }
}
/*
====================================================================
関数名：confirmSubmiBackToMainScreen
引数  ：action アクションパス
      ：formObj フォーム
概要  ：確認ダイアログを表示後、Trueならアクションパスへリクエストを送信。
====================================================================
*/
function confirmSubmiBackToMainScreen(action, formObj) {
    var flg = $(':text[name="w2019CriteriaDomain.packagingConfirmedFlg"]').val();
    
    if (flg == "Y") {
        submitBackConfirm(action, formObj, msg.dirtyMsg);
    } else {
        gscm.submitBack(action, formObj);
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

