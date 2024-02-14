/*
 * WB002.js
 *
 * Order Entry Register画面で用いるJavaScriptです。
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

/*
===============================================================
関数名：chengeChkBox
引数  ：
概要  ：check box 変更時
        項目の表示を制御する。
===============================================================
*/
function chengeChkBox(ck) {

    var tr = ck.parent().parent();
    var customerItemNo = tr.find(':text[name$="customerItemNo"]');
    var customerPoNo = tr.find(':text[name$="customerPoNo"]');

    if (ck.is(':checked')) {
        customerItemNo.addClass("gscm_required");
        customerPoNo.addClass("gscm_required");
    } else {
        customerItemNo.removeClass("gscm_required");
        customerPoNo.removeClass("gscm_required");
    }
}

/*
====================================================================
関数名：submitSelectedRow
引数  ：path 遷移先アクション
        form フォーム
        index 選択行のindex
概要  ：選択行の情報をhidden値に設定して
        Order Entry Multi P/O Register 画面に遷移する為の
        アクションを呼出す処理。
====================================================================
*/
function submitSelectedRow(path, form, index, msg) {

    var etdDueDt = "wb002ListDomainList[" + index + "].etdDueDt";
    var customerItemNo = "wb002ListDomainList[" + index + "].customerItemNo";
    var customerItemNoHidden = "wb002ListDomainList[" + index + "].customerItemNoHidden";
    
    var etdDueDtValue = $(':hidden[name="' + etdDueDt + '"]').val();
    var customerItemNoValue;
    if($(':text[name="' + customerItemNo + '"]').val() == "") {
         customerItemNoValue = $(':hidden[name="' + customerItemNoHidden + '"]').val();
    } else {
         customerItemNoValue = $(':text[name="' + customerItemNo + '"]').val();
    }
    
    $("#etdDueDtHidden").val(etdDueDtValue);
    $("#customerItemNoHidden").val(customerItemNoValue);
    
    gscm.submitConfirm(path, form, msg);
}
