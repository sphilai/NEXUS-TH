/*
 * W6009.js
 *
 * Documentation [Invoice Register]画面で用いるJavaScriptです。
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
    var items = $(".gscm_required")

    for (var i=0; i< items.length; i++) {
        var itemName = items[i];
        var isDisable = $(itemName).is(":disabled");
        if (isDisable) {
            $(itemName).removeClass("gscm_required");
        }
    }
    
    // DDL Size
    $('select#frt_shipper_cd').ieSelectWidth ({
        containerClassName : 'select-container',
        overlayClassName : 'select-overlay'
    });
    $('select#frt_consignee_cd').ieSelectWidth ({
        containerClassName : 'select-container',
        overlayClassName : 'select-overlay'
    });
    $('select#invoice_ctgry_nm').ieSelectWidth ({
        containerClassName : 'select-container',
        overlayClassName : 'select-overlay'
    });
    $('select#freight_responsible_nm').ieSelectWidth ({
        containerClassName : 'select-container',
        overlayClassName : 'select-overlay'
    });
    $('select#additional_charge_nm').ieSelectWidth ({
        containerClassName : 'select-container',
        overlayClassName : 'select-overlay'
    });
    // all textarea changes wrap attr to off.
    $("textarea").attr('wrap', 'soft');

    /*
    // initation invoice template no.
    selectedInvTplNo();
    */
});

/*
====================================================================
関数名：selectCompanyNotifyParty
引数  ：cd    Nxs Comp Codeの設定先
     abbr  Nxs Comp Name Abbrの設定先
     name  Nxs Comp Nameの設定先
     addr  Nxs Comp Addrの設定先
概要  ：Company Select子画面を表示し、
        選択したCOMPANY CODE/会社コードを画面のCarrierに反映する。
====================================================================
*/
function selectCompanyNotifyParty(cd, abbr, name, addr) {

    // 子画面を呼出し、設定した値を取得
    var array = popupWT001('', '', '');
    if (array == null) {
        return;
    }
    // 取得した値を画面に設定する
    var compCd;       // COMPANY CODE/会社コード
    var compNmAbb;    // COMPANY NAME ABBR/会社略称
    var compNm;       // COMPANY NAME/会社名称
    var compAddr;     // COMPANY ADDRESS/会社住所
    if (array['compCd'] === undefined){
        compCd = "";
        compNmAbb = "";
        compNm = "";
        compAddr = "";
    }else{
        compCd = array['compCd'];        // COMPANY CODE/会社コード
        compNmAbb = array['compNmAbb'];  // COMPANY NAME ABBR/会社略称
        compNm = array['compNm'];        // COMPANY NAME/会社名称
        compAddr = array['compAddr']; 
    }
    $(':hidden[name="w6009CriteriaDomain.' + cd + '"]').val(compCd);
    $(':hidden[name="w6009CriteriaDomain.' + abbr + '"]').val(compNmAbb);
    $(':input[name="w6009CriteriaDomain.' + name + '"]').val(compNm);
    $(':input[name="w6009CriteriaDomain.' + addr + '"]').val(compAddr);
    $('#' + cd).html(compCd + ' /');
    $('#' + abbr).html(compNmAbb);
}

/*
====================================================================
関数名：showCalendar
引数  ：styleId 活性状態を判定する画面ID
        divId 表示するカレンダーのdivのID
        formName フォーム名
        property 結果を格納するプロパティ名
        dateFormat 日付フォーマット
        calImg カレンダーアイコンのオブジェクト
概要  ：Port Select子画面を表示し、
        選択したPORT CODE/港コードを画面のPortFromに反映する。
====================================================================
*/
function showCalendar(styleId, divId, formName, property, dateFormat, calImg) {
    if (document.getElementById(styleId).disabled == false) {
        //入力欄が活性の場合、カレンダーを表示
        gscm.writeCalendar(divId, formName, property, dateFormat, calImg);
    }
}

/*
====================================================================
関数名：selectedInvTplNo
引数  ：
概要  ：invTplNoコンボボックスで選択した値によって、
        hidden.FRT Shipper Tax ID NOの選択値を変更します。
====================================================================
*/
/*
function selectedInvTplNo () {
    var index = $(':input[name="w6009CriteriaDomain.invTplNo"]').prop("selectedIndex");

    $(':input[name="w6009CriteriaDomain.comboFree1DispFlg"]').prop('selectedIndex', index);
    if($(':input[name="w6009CriteriaDomain.comboFree1DispFlg"]').val() == "Y") {
        $(':input[name="w6009CriteriaDomain.free1DispFlg"]').attr("checked", true );
    } else {
        $(':input[name="w6009CriteriaDomain.free1DispFlg"]').attr("checked", false );
    }

    $(':input[name="w6009CriteriaDomain.comboFree2DispFlg"]').prop("selectedIndex", index);
    if($(':input[name="w6009CriteriaDomain.comboFree2DispFlg"]').val() == "Y") {
        $(':input[name="w6009CriteriaDomain.free2DispFlg"]').attr("checked", true );
    } else {
        $(':input[name="w6009CriteriaDomain.free2DispFlg"]').attr("checked", false );
    }

    $(':input[name="w6009CriteriaDomain.comboFree3DispFlg"]').prop("selectedIndex", index);
    if($(':input[name="w6009CriteriaDomain.comboFree3DispFlg"]').val() == "Y") {
        $(':input[name="w6009CriteriaDomain.free3DispFlg"]').attr("checked", true );
    } else {
        $(':input[name="w6009CriteriaDomain.free3DispFlg"]').attr("checked", false );
    }

    $(':input[name="w6009CriteriaDomain.comboFree4DispFlg"]').prop("selectedIndex", index);
    if($(':input[name="w6009CriteriaDomain.comboFree4DispFlg"]').val() == "Y") {
        $(':input[name="w6009CriteriaDomain.free4DispFlg"]').attr("checked", true );
    } else {
        $(':input[name="w6009CriteriaDomain.free4DispFlg"]').attr("checked", false );
    }
}
*/