/*
 * W2010.js
 *
 * CML-Header画面で用いるJavaScriptです。
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
/*
====================================================================
関数名：init()
引  数：なし
概  要：初期表示時、非活性になっている項目のスタイルから必須入力の
        スタイル指定を除去する。
====================================================================
*/
function init() {
    var items = [ "#pltz_instr_no", 
                  "#shipper_cd", 
                  "#customer_cd",
                  "#lgcy_ship_to",
                  "select#trns_cd",
                  "select#plnt_and_wh_declaration",
                  "#plnt_cd",
                  "#lgcy_wh_cd",
                  "#packing_wh_comp_cd",
                  "#packing_wh_cd"];

    for (var i=0; i< items.length; i++) {
        var itemName = items[i];
        var isDisable = $(itemName).is(":disabled");
        if (isDisable) {
            $(itemName).removeClass("gscm_required");
        }
    }
}


/*
====================================================================
関数名：setUp
引数  ：inputInstrNoMsg "Pltz Instr Required" = Y の場合のメッセージ
      ：inputBelowContentsMsg "Pltz Instr Required" = N の場合のメッセージ
概要  ：テキストボックス活性・非活性処理
                                    1.1           1.2                        1.3 
   [1]:Palletize Instr.Required    未設定の場合   "Y"の場合                "N"の場合
   [2]:Radio Label                 空欄            Input Instr.No.->を表示    Input below conterntsを表示
   [3]:Ralletize Instr No.         非活性          活性（黄色）               非活性
   [4]:Shipper                     非活性          非活性                      活性（黄色）
   [5]:Cust.No                     非活性          非活性                      活性（黄色）
   [6]:Ship to                     非活性          非活性                      活性（黄色）
   [7]:Trans.                      非活性          非活性                      活性（黄色）
   [8]:Plant & W/H Declaration     非活性          非活性                      活性（黄色）
   [9]:Plant CD                    非活性          非活性                      非活性
  [10]:W/H                         非活性          非活性                      非活性
  [11]:W/H Com.                    非活性          非活性                      非活性
  [12]:NEXUS W/H                   非活性          非活性                      非活性
====================================================================
*/
// 各項目の活性化／非活性化
function setUp() {

        var value = $("#pltz_instr_required").val();
        
        if (value == "Y") {
            // "Y"の場合に、各項目について、活性・非活性を制御
            $("#pltz_instr_no").val("");
            $("#pltz_instr_no").prop('disabled', false);
            $("#pltz_instr_no").addClass("gscm_required");
            $("#shipper_cd").val("");
            $("#shipper_cd").prop('disabled', true);
            $("#shipper_cd").removeClass("gscm_required gscm_error_class");
            $("#customer_cd").val("");
            $("#customer_cd").prop('disabled', true);
            $("#customer_cd").removeClass("gscm_required gscm_error_class");
            $("#lgcy_ship_to").val("");
            $("#lgcy_ship_to").prop('disabled', true);
            $("#lgcy_ship_to").removeClass("gscm_required gscm_error_class");
            $("select#trns_cd").prop('disabled', true);
            $("select#trns_cd").val("");
            $("select#trns_cd").removeClass("gscm_required gscm_error_class");
            $("select#plnt_and_wh_declaration").val("");
            $("select#plnt_and_wh_declaration").prop('disabled', true);
            $("select#plnt_and_wh_declaration").removeClass("gscm_required gscm_error_class");
            $("#plnt_cd").val("");
            $("#plnt_cd").prop('disabled', true);
            $("#plnt_cd").removeClass("gscm_required gscm_error_class");
            $("#lgcy_wh_cd").val("");
            $("#lgcy_wh_cd").prop('disabled', true);
            $("#lgcy_wh_cd").removeClass("gscm_required gscm_error_class");
            $("#packing_wh_comp_cd").val("");
            $("#packing_wh_comp_cd").prop('disabled', true);
            $("#packing_wh_comp_cd").removeClass("gscm_required gscm_error_class");
            $("#packing_wh_cd").val("");
            $("#packing_wh_cd").prop('disabled', true);
            $("#packing_wh_cd").removeClass("gscm_required gscm_error_class");
        } else if (value == "N") {
            // "N"の場合に、各項目について、活性・非活性にする
            $("#pltz_instr_no").val("");
            $("#pltz_instr_no").prop('disabled', true);
            $("#pltz_instr_no").removeClass("gscm_required gscm_error_class");
            $("#shipper_cd").val("");
            $("#shipper_cd").prop('disabled', false);
            $("#shipper_cd").addClass("gscm_required");
            $("#customer_cd").val("");
            $("#customer_cd").prop('disabled', false);
            $("#customer_cd").addClass("gscm_required");
            $("#lgcy_ship_to").val("");
            $("#lgcy_ship_to").prop('disabled', false);
            $("#lgcy_ship_to").addClass("gscm_required");
            $("select#trns_cd").val("");
            $("select#trns_cd").prop('disabled', false);
            $("select#trns_cd").addClass("gscm_required");
            $("select#plnt_and_wh_declaration").val("");
            $("select#plnt_and_wh_declaration").prop('disabled', false);
            $("select#plnt_and_wh_declaration").addClass("gscm_required");
            $("#plnt_cd").val("");
            $("#plnt_cd").prop('disabled', true);
            $("#plnt_cd").removeClass("gscm_required gscm_error_class");
            $("#lgcy_wh_cd").val("");
            $("#lgcy_wh_cd").prop('disabled', true);
            $("#lgcy_wh_cd").removeClass("gscm_required gscm_error_class");
            $("#packing_wh_comp_cd").val("");
            $("#packing_wh_comp_cd").prop('disabled', true);
            $("#packing_wh_comp_cd").removeClass("gscm_required gscm_error_class");
            $("#packing_wh_cd").val("");
            $("#packing_wh_cd").prop('disabled', true);
            $("#packing_wh_cd").removeClass("gscm_required gscm_error_class");
        } else {
            // 未入力の場合に、各項目について、非活性にする
            $("#pltz_instr_no").val("");
            $("#pltz_instr_no").prop('disabled', true);
            $("#pltz_instr_no").removeClass("gscm_required gscm_error_class");
            $("#shipper_cd").val("");
            $("#shipper_cd").prop('disabled', true);
            $("#shipper_cd").removeClass("gscm_required gscm_error_class");
            $("#customer_cd").val("");
            $("#customer_cd").prop('disabled', true);
            $("#customer_cd").removeClass("gscm_required gscm_error_class");
            $("#lgcy_ship_to").val("");
            $("#lgcy_ship_to").prop('disabled', true);
            $("#lgcy_ship_to").removeClass("gscm_required gscm_error_class");
            $("select#trns_cd").val("");
            $("select#trns_cd").prop('disabled', true);
            $("select#trns_cd").removeClass("gscm_required gscm_error_class");
            $("select#plnt_and_wh_declaration").val("");
            $("select#plnt_and_wh_declaration").prop('disabled', true);
            $("select#plnt_and_wh_declaration").removeClass("gscm_required gscm_error_class");
            $("#plnt_cd").val("");
            $("#plnt_cd").prop('disabled', true);
            $("#plnt_cd").removeClass("gscm_required gscm_error_class");
            $("#lgcy_wh_cd").val("");
            $("#lgcy_wh_cd").prop('disabled', true);
            $("#lgcy_wh_cd").removeClass("gscm_required gscm_error_class");
            $("#packing_wh_comp_cd").val("");
            $("#packing_wh_comp_cd").prop('disabled', true);
            $("#packing_wh_comp_cd").removeClass("gscm_required gscm_error_class");
            $("#packing_wh_cd").val("");
            $("#packing_wh_cd").prop('disabled', true);
            $("#packing_wh_cd").removeClass("gscm_required gscm_error_class");
        }
}

/*
====================================================================
関数名：setUpForPlntAndWhDeclaration
引数  ：なし
概要  ：工場倉庫区分選択時に、入力欄の活性制御を行う。
====================================================================
*/
function setUpForPlntAndWhDeclaration() {

        var value = $("#plnt_and_wh_declaration").val();
        
        if (value == "1") {
            // "1"の場合に、各項目について、非活性にする
            $("#plnt_cd").val("");
            $("#plnt_cd").prop('disabled', false);
            $("#plnt_cd").addClass("gscm_required");
            $("#lgcy_wh_cd").val("");
            $("#lgcy_wh_cd").prop('disabled', false);
            $("#lgcy_wh_cd").addClass("gscm_required");
            $("#packing_wh_comp_cd").val("");        
            $("#packing_wh_comp_cd").prop('disabled', true);
            $("#packing_wh_comp_cd").removeClass("gscm_required");
            $("#packing_wh_cd").val("");
            $("#packing_wh_cd").prop('disabled', true);
            $("#packing_wh_cd").removeClass("gscm_required");
        } else if (value == "2") {
            // "2"の場合に、各項目について、非活性にする
            $("#plnt_cd").val("");
            $("#plnt_cd").prop('disabled', true);
            $("#plnt_cd").removeClass("gscm_required");
            $("#lgcy_wh_cd").val("");
            $("#lgcy_wh_cd").prop('disabled', true);
            $("#lgcy_wh_cd").removeClass("gscm_required");
            $("#packing_wh_comp_cd").val("");
            $("#packing_wh_comp_cd").prop('disabled', false);
            $("#packing_wh_comp_cd").addClass("gscm_required");
            $("#packing_wh_cd").val("");
            $("#packing_wh_cd").prop('disabled', false);
            $("#packing_wh_cd").addClass("gscm_required");
        } else {
            // 未入力の場合に、各項目について、非活性にする
            $("#plnt_cd").val("");
            $("#plnt_cd").prop('disabled', true);
            $("#plnt_cd").removeClass("gscm_required");
            $("#lgcy_wh_cd").val("");
            $("#lgcy_wh_cd").prop('disabled', true);
            $("#lgcy_wh_cd").removeClass("gscm_required");
            $("#packing_wh_comp_cd").val("");
            $("#packing_wh_comp_cd").prop('disabled', true);
            $("#packing_wh_comp_cd").removeClass("gscm_required");
            $("#packing_wh_cd").val("");
            $("#packing_wh_cd").prop('disabled', true);
            $("#packing_wh_cd").removeClass("gscm_required");
        }
}

/*
====================================================================
関数名：removeDisable
引数  ：なし
概要  ：非活性項目を活性にする。
====================================================================
*/
function removeDisable() {
    $("#pltz_instr_no").prop('disabled', false);
    $("#shipper_cd").prop('disabled', false);
    $("#customer_cd").prop('disabled', false);
    $("#lgcy_ship_to").prop('disabled', false);
    $("select#trns_cd").prop('disabled', false);
    $("select#plnt_and_wh_declaration").prop('disabled', false);
    $("#plnt_cd").prop('disabled', false);
    $("#lgcy_wh_cd").prop('disabled', false);
    $("#packing_wh_comp_cd").prop('disabled', false);
    $("#packing_wh_cd").prop('disabled', false);
}
