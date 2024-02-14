/*
 * WC001.js
 *
 * E-RT画面で用いるJavaScriptです。
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
    var downloadCml = $(':hidden[name="downloadCml"]');
    if (downloadCml.val() == 'true') {
        gscm.commonSubmitForCheck('WC001PrintCml.do', $('form[id="mainForm"]').get(0), 'false', 'false');
        downloadCml.val('');
        return;
    }
});

/*
====================================================================
関数名：selectShipper
引数  ：-
概要  ：Company Select子画面を表示し、
        選択したCOMPANY CODE/会社コードを画面のShipperに反映する。
====================================================================
*/
function selectShipper() {
    // 子画面を呼出し、設定した値を取得
    var array = popupWT001('Y', '', '');
    var compCd; // COMPANY CODE/会社コード
    var compNm; // COMPANY NAME/会社名称
    var lengthUnit; // LENGTH UNIT/長さ単位
    var weightUnit; // WEIGHT UNIT/重量単位
    var volumeUnit; // VOLUME UNIT/容積単位
    var lengthUnitDisp; // LENGTH UNIT DISP/長さ単位表記
    var weightUnitDisp; // WEIGHT UNIT DISP/重量単位表記
    var volumeUnitDisp; // VOLUME UNIT DISP/容積単位表記

    if (!array) {
        return;
    }
    
    if (array['compCd'] === undefined){
        compCd = "";
        compNm = "";
        lengthUnit = "";
        weightUnit = "";
        volumeUnit = "";
        lengthUnitDisp = "";
        weightUnitDisp = "";
        volumeUnitDisp = "";
    }else{
        compCd = array['compCd'];
        compNm = array['compNm'];
        lengthUnit = array['lengthUnit'];
        weightUnit = array['weightUnit'];
        volumeUnit = array['volumeUnit'];
        lengthUnitDisp = addBlackets(array['lengthUnitDisp']);
        weightUnitDisp = addBlackets(array['weightUnitDisp']);
        volumeUnitDisp = addBlackets(array['volumeUnitDisp']);
    }
    
    // 取得した値を画面に設定する
    //【7】：Shipper
    $(':input[name="criteriaDomain.shipperCd"]').val(compCd);
    //【9】：Shipper Name
    $(':input[name="criteriaDomain.shipperNm"]').val(compNm);
    //【33】：Length UNIT（Length）
    $(':input[name="criteriaDomain.lengthUnitLength"]').val(lengthUnitDisp);
    //【34】：Length UNIT（Width）
    $(':input[name="criteriaDomain.lengthUnitWidth"]').val(lengthUnitDisp);
    //【35】：Length UNIT（Height）
    $(':input[name="criteriaDomain.lengthUnitHeight"]').val(lengthUnitDisp);
    //【36】：Volume UNIT
    $(':input[name="criteriaDomain.volumeUnit"]').val(volumeUnitDisp);
    //【37】：Weight UNIT(N/W)
    $(':input[name="criteriaDomain.weightUnitNw"]').val(weightUnitDisp);
    //【38】：Weight UNIT(G/W)
    $(':input[name="criteriaDomain.weightUnitGw"]').val(weightUnitDisp);
    //【92】：Shipper_h
    $(':input[name="criteriaDomain.shipperCdHidden"]').val(compCd);
    //【93】：Length_Unit_h
    $(':input[name="criteriaDomain.lengthUnitHidden"]').val(lengthUnit);
    //【94】：Volume_Unit_h
    $(':input[name="criteriaDomain.volumeUnitHidden"]').val(volumeUnit);
    //【95】：Weight_Unit_h
    $(':input[name="criteriaDomain.weightUnitHidden"]').val(weightUnit);
}

/*
====================================================================
関数名：addBlackets
引数  ：unitDisp 単位表記
概要  ：単位表記に括弧を追加する。
====================================================================
*/
function addBlackets(unitDisp) {
    if (unitDisp != '') {
        return '(' + unitDisp + ')';
    }
    return '';
}

/*
====================================================================
関数名：selectShipTo
引数  ：-
概要  ：CIGMA Ship to CD/Company CD cross reference MASTER子画面を表示し、
        選択したSHIP TO CODE/送荷先コードを画面のShipToに反映する。
====================================================================
*/
function selectShipTo() {
    // 子画面を呼出し、設定した値を取得
    var array = popupWT014();

    if (!array) {
        return;
    }

    // 取得した値を画面に設定する
    var shipToCd = array['shipToCd'] // SHIP TO CODE/送荷先コード
    var shipToNm = array['shipToNm'] // SHIP TO NAME/送荷先名称

    $(':input[name="criteriaDomain.shipToCd"]').val(shipToCd);
    $(':input[name="criteriaDomain.shipToNm"]').val(shipToNm);

}

/*
====================================================================
関数名：setUp
引数  ：obj 選択されたラジオボタン
概要  ：ラジオボタンの状態を取得し、入力項目の活性化制御を行う
====================================================================
*/
function setUp(obj) {
    var value = obj.value;
    changeMode(value);
    
    // clear error message
    $("#gscm_message").text("");

    // clear error form
    $("#fromMainMark").removeClass("gscm_error_class");
    $("#toMainMark").removeClass("gscm_error_class");
    $("#shipperCd").removeClass("gscm_error_class");
    $("#shipToCd").removeClass("gscm_error_class");
    $("#trnsCd").removeClass("gscm_error_class");
    $("#freightResponsibleCd").removeClass("gscm_error_class");
    $("#dueDt").removeClass("gscm_error_class");
    $("#packingWhCompCd").removeClass("gscm_error_class");
    $("#packingWhCd").removeClass("gscm_error_class");
    $("#plntCd").removeClass("gscm_error_class");
    $("#loadingCd").removeClass("gscm_error_class");
    $("#priceTerms").removeClass("gscm_error_class");
    $("#returnStyleCd").removeClass("gscm_error_class");
    $("#palletQty").removeClass("gscm_error_class");
    $("#frmlength").removeClass("gscm_error_class");
    $("#width").removeClass("gscm_error_class");
    $("#height").removeClass("gscm_error_class");
    $("#volume").removeClass("gscm_error_class");
    $("#grossWeight").removeClass("gscm_error_class");
    $("#palletCartonTyp").removeClass("gscm_error_class"); // UT420 ADD

    for (i = 0; i < 15; i++) {
        $("#pltzItemNo" + i).removeClass("gscm_error_class");
        $("#qty" + i).removeClass("gscm_error_class");
    }

}
/*
====================================================================
関数名：beforePrintCML
引数  ：なし
概要  ：Print CML押下前にfromMainMarkとtoMainMarkを活性化します
====================================================================
*/
function beforePrintCML() {

    $("#fromMainMark").prop('disabled', false);
    $("#toMainMark").prop('disabled', false);
}

/*
====================================================================
関数名：changeMode
引数  ：value 制御の条件となるフラグ
概要  ：入力項目の活性化制御を行う
====================================================================
*/
function changeMode(value) {

    if (value == "1") {
            
        $("#fromMainMark").prop('disabled', true);
        $("#fromMainMark").removeClass("gscm_required");
        $("#toMainMark").prop('disabled', true);
        $("#toMainMark").removeClass("gscm_required");
        
        $("#shipperCd").removeClass("gscm_disptext");
        $("#shipperCd").addClass("gscm_required");
        $("#shipperCdselect").prop('disabled', false);

        $("#shipToCd").prop('disabled', false);
        //$("#shipToCd").removeClass("gscm_disptext");
        $("#shipToCd").addClass("gscm_required");
        $("#shipToCdselect").prop('disabled', false);

        $("#trnsCd").prop('disabled', false);
        //$("#trnsCd").removeClass("gscm_disptext");
        $("#trnsCd").addClass("gscm_required");

        $("#freightResponsibleCd").prop('disabled', false);
        //$("#freightResponsibleCd").removeClass("gscm_disptext");
        $("#freightResponsibleCd").addClass("gscm_required");
        
        $("#dueDt").prop('disabled', false);

        $("#packingWhCompCd").prop('disabled', false);
        //$("#packingWhCompCd").removeClass("gscm_disptext");
        $("#packingWhCompCd").addClass("gscm_required");

        $("#packingWhCd").prop('disabled', false);
        //$("#packingWhCd").removeClass("gscm_disptext");
        $("#packingWhCd").addClass("gscm_required");
    
        $("#plntCd").prop('disabled', false);
        //$("#plntCd").removeClass("gscm_disptext");
        $("#plntCd").addClass("gscm_required");
    
        $("#loadingCd").prop('disabled', false);
        //$("#loadingCd").removeClass("gscm_disptext");
        $("#loadingCd").addClass("gscm_required");
    
        $("#priceTerms").prop('disabled', false);
        //$("#priceTerms").removeClass("gscm_disptext");
        $("#priceTerms").addClass("gscm_required");
    
        $("#returnStyleCd").prop('disabled', false);
        //$("#returnStyleCd").removeClass("gscm_disptext");
        $("#returnStyleCd").addClass("gscm_required");
    
        $("#palletQty").prop('disabled', false);
        //$("#palletQty").removeClass("gscm_disptext");
        $("#palletQty").addClass("gscm_required");
    
        $("#frmlength").prop('disabled', false);
        //$("#frmlength").removeClass("gscm_disptext");
        $("#frmlength").addClass("gscm_required");
    
        $("#width").prop('disabled', false);
        //$("#width").removeClass("gscm_disptext");
        $("#width").addClass("gscm_required");
    
        $("#height").prop('disabled', false);
        //$("#height").removeClass("gscm_disptext");
        $("#height").addClass("gscm_required");
    
        $("#volume").prop('disabled', false);
        //$("#volume").removeClass("gscm_disptext");
        $("#volume").addClass("gscm_required");
    
        $("#grossWeight").prop('disabled', false);
        //$("#grossWeight").removeClass("gscm_disptext");
        $("#grossWeight").addClass("gscm_required");
        
        $("#palletCartonTyp").prop('disabled', false); // UT420 ADD
        $("#palletCartonTyp").addClass("gscm_required"); // UT420 ADD
        
        for (i = 0; i < 15; i++) {
            $("#pltzItemNo" + i).prop('disabled', false);
            //$("#pltzItemNo" + i).removeClass("gscm_disptext");
            //$("#pltzItemNo" + i).addClass("gscm_required");
            $("#qty" + i).prop('disabled', false);
            //$("#qty" + i).removeClass("gscm_disptext");
            //$("#qty" + i).addClass("gscm_required");
        }

        $("#display").prop('disabled', false);
        $("#register").prop('disabled', false);
  
    }
    if (value == "2" || value == "3" ) {
    
        $("#fromMainMark").prop('disabled', false);
        //$("#fromMainMark").removeClass("gscm_disptext");
        $("#fromMainMark").addClass("gscm_required");
    
        $("#toMainMark").prop('disabled', false);
        //$("#toMainMark").removeClass("gscm_disptext");
        //$("#toMainMark").addClass("gscm_required");
        
        $("#shipperCd").removeClass("gscm_required");
        $("#shipperCd").addClass("gscm_disptext");
        $("#shipperCdselect").prop('disabled', true);
        
        $("#shipToCd").prop('disabled', true);
        $("#shipToCd").removeClass("gscm_required");
        //$("#shipToCd").addClass("gscm_disptext");
        $("#shipToCdselect").prop('disabled', true);
        
        $("#trnsCd").prop('disabled', true);
        $("#trnsCd").removeClass("gscm_required");
        //$("#trnsCd").addClass("gscm_disptext");
        
        $("#freightResponsibleCd").prop('disabled', true);
        $("#freightResponsibleCd").removeClass("gscm_required");
        //$("#freightResponsibleCd").addClass("gscm_disptext");
        
        $("#dueDt").prop('disabled', true);
        
        $("#packingWhCompCd").prop('disabled', true);
        $("#packingWhCompCd").removeClass("gscm_required");
        //$("#packingWhCompCd").addClass("gscm_disptext");
        
        $("#packingWhCd").prop('disabled', true);
        $("#packingWhCd").removeClass("gscm_required");
        //$("#packingWhCd").addClass("gscm_disptext");
        
        $("#plntCd").prop('disabled', true);
        $("#plntCd").removeClass("gscm_required");
        //$("#plntCd").addClass("gscm_disptext");
        
        $("#loadingCd").prop('disabled', true);
        $("#loadingCd").removeClass("gscm_required");
        //$("#loadingCd").addClass("gscm_disptext");
        
        $("#priceTerms").prop('disabled', true);
        $("#priceTerms").removeClass("gscm_required");
        //$("#priceTerms").addClass("gscm_disptext");
    
        $("#returnStyleCd").prop('disabled', true);
        $("#returnStyleCd").removeClass("gscm_required");
        //$("#returnStyleCd").addClass("gscm_disptext");
        
        $("#palletQty").prop('disabled', true);
        $("#palletQty").removeClass("gscm_required");
        //$("#palletQty").addClass("gscm_disptext");
        
        $("#frmlength").prop('disabled', true);
        $("#frmlength").removeClass("gscm_required");
        //$("#frmlength").addClass("gscm_disptext");
        
        $("#width").prop('disabled', true);
        $("#width").removeClass("gscm_required");
        //$("#width").addClass("gscm_disptext");
        
        $("#height").prop('disabled', true);
        $("#height").removeClass("gscm_required");
        //$("#height").addClass("gscm_disptext");
        
        $("#volume").prop('disabled', true);
        $("#volume").removeClass("gscm_required");
        //$("#volume").addClass("gscm_disptext");
        
        $("#grossWeight").prop('disabled', true);
        $("#grossWeight").removeClass("gscm_required");
        //$("#grossWeight").addClass("gscm_disptext");
        
        $("#palletCartonTyp").prop('disabled', true); // UT420 ADD
        $("#palletCartonTyp").removeClass("gscm_required"); // UT420 ADD
        
        for (i = 0; i < 15; i++) {
            $("#pltzItemNo" + i).prop('disabled', true);
            //$("#pltzItemNo" + i).removeClass("gscm_required");
            //$("#pltzItemNo" + i).addClass("gscm_disptext");
            $("#qty" + i).prop('disabled', true);
            //$("#qty" + i).removeClass("gscm_required");
            //$("#qty" + i).addClass("gscm_disptext");
        }
        
        $("#display").prop('disabled', true);
        $("#register").prop('disabled', true);

    }
    
    // 登録後はRegisterは非活性
    if ($(':input[name="strAfterRegist"]').val() == "1") {
        $("#register").prop('disabled', true);
    }
    
    // Re-Printが選択されている場合又は、
    // Create Newが選択されているかつ【88】：Register(button)が非活性の場合
    var isRegisterDisable = $("#register").is(":disabled");
    if (value == "2" || (value == "1" && isRegisterDisable)) {
        $("#printCml").prop('disabled', false);
    } else {
        $("#printCml").prop('disabled', true);
    }
    
    // Create Newが選択されているかつRegister(button)が非活性の場合
    if (value == "1" && isRegisterDisable) {
        $("#clear").prop('disabled', false);
    } else {
        $("#clear").prop('disabled', true);
    }
    
    // Cancelが選択されている場合
    if (value == "3") {
        $("#cancel").prop('disabled', false);
    } else {
        $("#cancel").prop('disabled', true);
    }

}


