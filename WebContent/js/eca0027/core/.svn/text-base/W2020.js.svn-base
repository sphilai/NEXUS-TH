/*
 * W2020.js
 *
 * JavaScript used in Multi Label Register Screen.
 * Multi Label Register画面で用いるJavaScriptです。
 *
 * Copyright (c) 2016 DENSO CORPORATION. All rights reserved.
 */
/*
====================================================================
Function Name : ready
Argument      : -
Return Value  : -
Outline       : Action to take upon completion of reading the document.
関数名：ready
引数  ：-
戻り値：-
概要  ：ドキュメントの読み込み完了時に実行する処理。
====================================================================
*/
$(function() {

    $("#manual_reg_flg").change(function() {
        $("#manual_reg_flg_hidden").val("N");
        if ($("#manual_reg_flg:checked").val()) {
            $("#manual_reg_flg_hidden").val("Y");
        }
    });
    $("#shipping_lot, #cml_qty").change(function() {
        calcAll();
    });
    $("#length, #width, #height").change(function() {
        calcAll();
    });
    calcAll();
});

/*
====================================================================
関数名：calcAll
引数  ：none/なし
概要  ：Bulk auto calc./一括自動計算
====================================================================
*/
function calcAll() {
    calcTotalQty();
    // If trial item.
    // 号試品の場合
    if ($("#manual_reg_flg:checked").val()) {
        calcVolume();
        calcNetWeight();
    }
}

/*
====================================================================
関数名：calcTotalQty
引数  ：none/なし
概要  ：Total QTY auto calc./合計数量の自動計算
====================================================================
*/
function calcTotalQty() {
    $("#total_qty").val("");
    $("span[class='total_qty_disp']").html("");
    var strShippingLot = $("#shipping_lot").val();
    var strCmlQty = $("#cml_qty").val();
    if (strShippingLot == null || strCmlQty == null) {
        return;
    }
    var regexp = /^\d+$/;
    if (!strShippingLot.match(regexp) || !strCmlQty.match(regexp)) {
        return;
    }
    var shippingLot = parseInt(strShippingLot);
    var cmlQty = parseInt(strCmlQty);
    var totalQty = shippingLot * cmlQty;
    if (totalQty > 9999999) { // overflow
        $("#total_qty").val("");
        $("span[class='total_qty_disp']").html("");
        return;
    }
    if (!isNaN(totalQty)) {
        $("#total_qty").val(totalQty);
        $("span[class='total_qty_disp']").html(totalQty);
    }
}

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
    if (strLength == null || strWidth == null || strHeight == null) {
        return;
    }
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

/*
====================================================================
関数名：calcNetWeight
引数  ：none/なし
概要  ：N/W auto calc./N/Wの自動計算
====================================================================
*/
function calcNetWeight() {
    $("#net_weight").val("");
    $("span[class='net_weight_disp']").html("");
    var strItemWeight = $("#item_weight").val();
    var strShippingLot = $("#shipping_lot").val();
    if (strItemWeight == null || strShippingLot == null) {
        return;
    }
    var regexp = /^\d+$/;
    if (strItemWeight == "" || !strShippingLot.match(regexp)) {
        return;
    }
    var itemWeight = parseFloat(strItemWeight);
    var shippingLot = parseInt(strShippingLot);
    var netWeight = itemWeight * shippingLot;
    netWeight = Math.ceil(netWeight * 1000) / 1000;
    if (netWeight > 9999999.999) { // overflow
        $("#net_weight").val("");
        $("span[class='net_weight_disp']").html("");
        return;
    }
    netWeight = netWeight.toFixed(3);
    if (!isNaN(netWeight)) {
        $("#net_weight").val(netWeight);
        $("span[class='net_weight_disp']").html(netWeight);
    }
}

