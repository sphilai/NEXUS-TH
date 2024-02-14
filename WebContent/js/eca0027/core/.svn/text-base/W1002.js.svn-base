/*
 * W1002.js��
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

function doMoveToDescriptions(action, form) {
    if ($("input[name=fromScreenId]").val() == "W1001") {
    	return gscm.commonSubmit(action, form);
    }else if ($("input[name=fromScreenId]").val() == "W1003") {
    	return gscm.submitBack(action, form);
    }
}

function clearCigma(){
	var compCd = $(':input[name="w1002CriteriaDomain.customerCd"]').val();
	$(':input[name="w1002CriteriaDomain.accounteeCd"]').val(compCd);
}

function getContSortKey(form){
	var shipper = $(':input[name="w1002CriteriaDomain.shipperCd"]').val();
	var shipTo = $(':input[name="w1002CriteriaDomain.shipToCd"]').val();
	var splitShipping = $(':input[name="w1002CriteriaDomain.splitShippingNgFlg"]').val();
	var compCd = $(':input[name="w1002CriteriaDomain.compCd"]').val();
	if (shipper != '' && shipTo != ''){
		//gscm.commonSubmit('W1002Init.do', form);
		$.post("W1002Init.do",{pageState : "ajax", shipperCd : shipper, shipToCd : shipTo, splitShipping : splitShipping ,compCd : compCd }  ,function(data){
   				var str = data.split("&");
   				$(':input[name="w1002CriteriaDomain.shipToCntryCd"]').val(str[0]);
           		$(':input[name="w1002CriteriaDomain.containerSortingKey"]').val(str[1]);
   		});
	}
}

/*
====================================================================
関数名：ready
引数  ：-
概要  ：ドキュメントの読み込み完了時に実行する処理。
====================================================================
*/
function imposeMaxLength(Event, Object, MaxLen)
{
    return (Object.value.length <= MaxLen)||(Event.keyCode == 8 ||Event.keyCode==46||(Event.keyCode>=35&&Event.keyCode<=40))
}
/*
====================================================================
関数名：selectShipper
引数  ：-
概要  ：Company Select子画面を表示し、
        選択したCOMPANY CODE/会社コードを画面のShipperに反映する。
====================================================================
*/
function selectShipper(form) {
    // 子画面を呼出し、設定した値を取得
    var array = popupWT001('Y', '', '');
    var compCd; // COMPANY CODE/会社コード
    var compNm; // COMPANY NAME/会社名称
    var cntryCd; // COUNTRY OF ORGIN�

    if (!array) {
        return;
    }
    
    if (array['compCd'] === undefined){
        compCd = "";
        compNm = "";
        cntryCd = "";
    }else{
        compCd = array['compCd'];
        compNm = array['compNm'];
        cntryCd = array['cntryCd'];
    }
    
    // 取得した値を画面に設定する
    //【7】：Shipper
    $(':input[name="w1002CriteriaDomain.shipperCd"]').val(compCd);
    //【9】：Shipper Name
    $(':input[name="w1002CriteriaDomain.shipperName"]').val(compNm);
    
     $(':input[name="w1002CriteriaDomain.originCntryCd"]').val(cntryCd);
    
    $(':input[name="w1002CriteriaDomain.shipperCd"]').focus();
    
    getContSortKey(form);
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
    var array = popupWT002();

    if (!array) {
        return;
    }

    // 取得した値を画面に設定する
    var customerCd = array['customerCd']; // SHIP TO CODE/送荷先コー�
	var customerShipTo = array['lgcyShipToCd'];
    $(':input[name="w1002CriteriaDomain.customerCd"]').val(customerCd);
    $(':input[name="w1002CriteriaDomain.accounteeCd"]').val(customerCd);
	$(':input[name="w1002CriteriaDomain.customerShipTo"]').val(customerShipTo);
}

/*
====================================================================
関数名：setConsignee
引数  ：-
概要  ：Company Select子画面を表示し�S��
        選択したCOMPANY CODE/会社コードを画面のConsigneeに反映する。
====================================================================
*/
function setConsignee() {
    // 子画面を呼出し、設定した値を取得
    var array = popupWT001('', '', '');
    if (array == null) {
        return;
    }
    // 取得した値を画面に設定する
    var compCd = array['compCd']; // COMPANY CODE/会社コー�
    var compNm = array['compNm']; // COMPANY NAME/会社コー�
    var compAddr = array['compAddr'];// COMPANY ADDR/会社コー�
    var compTel = array['compTel'];// COMPANY TEL/会社コー�
    var cntryCd = array['cntryCd'];// COUNTRY CODE/会社コード
    if (compCd != null) {
        $(':input[name="w1002CriteriaDomain.consigneeCd"]').val(compCd);
        $(':input[name="w1002CriteriaDomain.consigneeCompNm"]').val(compNm);
        $(':input[name="w1002CriteriaDomain.consigneeCntryCd"]').val(cntryCd);
        $(':input[name="w1002CriteriaDomain.consigneeCompAddr"]').val(compAddr);
        $(':input[name="w1002CriteriaDomain.consigneeCompTel"]').val(compTel);
    }
}

/*
====================================================================
関数名：selectShipTo
引数  ：-
概要  ：CIGMA Ship to CD/Company CD cross reference MASTER子画面を表示し、
        選択したSHIP TO CODE/送荷先コードを画面のShipToに反映する。
====================================================================
*/
function selectNexusShipTo(form) {
    // 子画面を呼出し、設定した値を取得
    var array = popupWT014();

    if (!array) {
        return;
    }

    // 取得した値を画面に設定する
    var shipToCd = array['shipToCd']; // SHIP TO CODE/送荷先コー�
    var shipToNm = array['shipToNm']; // SHIP TO NAME/送荷先名称
    var shipToAddr = array['shipToAddr']; // SHIP TO ADDR/送荷先名称
    var shipToTel = array['shipToTel']; // SHIP TO TEL/送荷先名称
	var compCd = array['compCd']; // COMP CODE/送荷先名称
	
    $(':input[name="w1002CriteriaDomain.shipToCd"]').val(shipToCd);
    $(':input[name="w1002CriteriaDomain.shipToCompNm"]').val(shipToNm);
    $(':input[name="w1002CriteriaDomain.shipToCompAddr"]').val(shipToAddr);
    $(':input[name="w1002CriteriaDomain.shipToCompTel"]').val(shipToTel);
    $(':input[name="w1002CriteriaDomain.compCd"]').val(compCd);

	$(':input[name="w1002CriteriaDomain.shipToCd"]').focus();
	getContSortKey(form);
}

/*
====================================================================
関数名：setNexus W/H
引数  ：-
概要  ：Company Select子画面を表示し�S��
        選択したCOMPANY CODE/会社コードを画面のConsigneeに反映する。
====================================================================
*/
function selectNexusWhComp(){
 	var array = popupWT010();
    if (array == null) {
        return;
    }
    //��
    var compCd = array['compCd'];
    var whCd = array['whCd'];
    var whNm = array['whNm'];
    //��
    $(':input[name="w1002CriteriaDomain.nexusWhCom"]').val(compCd);
    $(':input[name="w1002CriteriaDomain.packingWhCd"]').val(whCd);
    $(':input[name="w1002CriteriaDomain.packingCompDeptNm"]').val(whNm);
}

function setInit(){
	setTypeOfShip();
	setReExpGoodsFlg();
	setPriceTerms();
	setTradeTerms();
	setSupplierInvoiceNo();
}

function clearTypeOfShip(){
	$("#shipper_cd").val("");
	$("#plnt_cd").val("");
	$("#department").val("");
	$("#tel").val("");
}

function setTypeOfShip(){

	if ($("#densoGp")[0].checked == true) {
        $("#plnt_cd").prop('disabled', false);
        $("#plnt_cd").addClass("gscm_required");
        $("#department").prop('disabled', false);
        $("#department").addClass("gscm_required");
        $("#tel").prop('disabled', false);
        $("#tel").addClass("gscm_required");
        $("#yesGp").prop('disabled', true);
        $("#noGp").prop('disabled', true);
        $("#noGp")[0].checked = true
        setSupplierInvoiceNo();
	}else if($("#nonDensoGp")[0].checked == true){
		//$("#plnt_cd").val("");
        $("#plnt_cd").prop('disabled', true);
        $("#plnt_cd").removeClass("gscm_required");
        $("#plnt_cd").removeClass("gscm_error_class");
        //$("#department").val("");
        $("#department").prop('disabled', true);
        $("#department").removeClass("gscm_required");
        $("#department").removeClass("gscm_error_class");
        //$("#tel").val("");
        $("#tel").prop('disabled', true);
        $("#tel").removeClass("gscm_required");
        $("#tel").removeClass("gscm_error_class");
        $("#yesGp").prop('disabled', false);
        $("#noGp").prop('disabled', false);
        setSupplierInvoiceNo();
	}
}

function setReExpGoodsFlg(){
	var value = $("#re_ex_goods").val();
	
	if (value == "Y") {
        $("#im_inv_no").prop('disabled', false);
        $("#im_inv_no").addClass("gscm_required");
        $("#im_inv_no2").prop('disabled', false);
        $("#im_inv_no2").addClass("gscm_required");
	}else{
		$("#im_inv_no").val("");
        $("#im_inv_no").prop('disabled', true);
        $("#im_inv_no").removeClass("gscm_required");
        $("#im_inv_no").removeClass("gscm_error_class");
        $("#im_inv_no2").val("");
        $("#im_inv_no2").prop('disabled', true);
        $("#im_inv_no2").removeClass("gscm_required");
        $("#im_inv_no2").removeClass("gscm_error_class");
	}
}

function setPriceTerms(){
	var value = $("#price_terms").val();
	
	if (value != "") {
        $("#other_price").prop('disabled', false);
        $("#terms_point").prop('disabled', false);
	}else{
		$("#other_price").val("");
        $("#other_price").prop('disabled', true);
        $("#terms_point").val("");
        $("#terms_point").prop('disabled', true);
	}
}

function setTradeTerms(){
	var value = $("#trade_terms").val();
	
	if (value != "") {
        $("#other_trad").prop('disabled', false);
	}else{
		$("#other_trad").val("");
        $("#other_trad").prop('disabled', true);
	}
}

function setSupplierInvoiceNo() {
	if ($("#yesGp")[0].checked == true) {
        $("#supplier_invoice_no").prop('disabled', false);
        $("#supplier_invoice_no").addClass("gscm_required");
	}else if($("#noGp")[0].checked == true){
		$("#supplier_invoice_no").val("");
        $("#supplier_invoice_no").prop('disabled', true);
        $("#supplier_invoice_no").removeClass("gscm_required");
        $("#supplier_invoice_no").removeClass("gscm_error_class");
	}
}
