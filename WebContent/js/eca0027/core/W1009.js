/*
 * W20013.js
 *
 * CML PKG Detail画面で用いるJavaScriptです。
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
/*
====================================================================
関数名：selectPkgitem
引数  ：行番号
概要  ：包装材を選択するポップアップ画面を表示し
        選択した値を画面に反映する。
====================================================================
*/
function selectPkgItem(idx) {

    var shipperCd = $(':input[name="w1009CriteriaDomain.shipperCd"]').val();

    var array = popupWT004(shipperCd);
    var rtTyp = array['rtTyp'];
    var pkgItemNo = array['pkgItemNo'];
    var modelCd = array['modelCd'];
    var pkgMtrlNm = array['pkgMtrlNm'];
 	var quantity = array['quantity'];
 	var weightUnit = array['weightUnit'];
 	
 	//UT458 Add for 10line W1009 25/05/2106
 	var length = array['length'];
 	var width = array['width'];
 	var height = array['height'];
 	var lengUnit = array['lengUnit'];
 	var netWeight = array['netWeight'];
 	var originCntryCd = array['originCntryCd'];
 	var currCd = array['currCd']; 	
 	//UT458 end Add
    var selectPkgFlg     = "listDomainList[" + idx + "].selectPkgFlg"
    var pkgItemNoName = "listDomainList[" + idx + "].pkgItemNo"; 
    var modelCdName   = "listDomainList[" + idx + "].modelCd";
    var description = "listDomainList[" + idx + "].description";

    $(':input[name="' + selectPkgFlg + '"]').val(rtTyp);
    $(':input[name="' + pkgItemNoName + '"]').val(pkgItemNo);
    $(':input[name="' + modelCdName + '"]').val(modelCd);
    $(':input[name="' + description + '"]').val(pkgMtrlNm);
    $(':input[name$="listDomainList[' + idx + '].outerCode"]').val("");
 	$(':input[name$="listDomainList[' + idx + '].qty"]').val(quantity);
 	$(':input[name$="listDomainList[' + idx + '].weightUnit"]').val(weightUnit);
 	
 	//UT458 Start Add for 10line W1009 25/05/2106
 	$(':input[name$="listDomainList[' + idx + '].selectOriginCntryCd"]').val(originCntryCd);
 	$(':input[name$="listDomainList[' + idx + '].originCntryCd"]').val(originCntryCd);
 	$(':input[name$="listDomainList[' + idx + '].selectCurrCd"]').val(currCd);
 	$(':input[name$="listDomainList[' + idx + '].currCd"]').val(currCd);
 	//$(':input[name$="listDomainList[' + idx + '].unitPrice"]').val(quantity);
 	$(':input[name$="listDomainList[' + idx + '].selectLengthUnit"]').val(lengUnit);
 	$(':input[name$="listDomainList[' + idx + '].lengthUnit"]').val(lengUnit);
 	$(':input[name$="listDomainList[' + idx + '].length"]').val(length);
 	$(':input[name$="listDomainList[' + idx + '].width"]').val(width);
 	$(':input[name$="listDomainList[' + idx + '].height"]').val(height);
 	$(':input[name$="listDomainList[' + idx + '].selectUnitNetWeight"]').val(weightUnit);
 	$(':input[name$="listDomainList[' + idx + '].netWeightUnit"]').val(weightUnit);
 	$(':input[name$="listDomainList[' + idx + '].netWeight"]').val(netWeight);
 	//UT458 End Add for 10line W1009 25/05/2106
}

function selectPkgFlg(flag,idx,clerVal,outerCode){
	var selectFlg = flag.val();
	var mainMark = $(':input[name="w1009CriteriaDomain.mainMark"]').val();
	var selectBt = $('[name="select[' + idx + ']"]');
	var description = $(':input[name$="listDomainList[' + idx + '].description"]');
	var pkgItemNo = $(':input[name$="listDomainList[' + idx + '].pkgItemNo"]');
	var modelCd = $(':input[name$="listDomainList[' + idx + '].modelCd"]');
	var unitPrice = $(':input[name$="listDomainList[' + idx + '].unitPrice"]');
	var length = $(':input[name$="listDomainList[' + idx + '].length"]');
	var width = $(':input[name$="listDomainList[' + idx + '].width"]');
	var height = $(':input[name$="listDomainList[' + idx + '].height"]');
	var netWeight = $(':input[name$="listDomainList[' + idx + '].netWeight"]');
	var qtyUnit = $(':input[name$="listDomainList[' + idx + '].selectQtyUnit"]');
	var qty = $(':input[name$="listDomainList[' + idx + '].qty"]');
	var netWeightUnit = $(':input[name$="listDomainList[' + idx + '].selectUnitNetWeight"]');
	var originCntryCd = $('[name="listDomainList[' + idx + '].selectOriginCntryCd"]');
	var currCd = $('[name="listDomainList[' + idx + '].selectCurrCd"]');
	var lengthUnit = $('[name="listDomainList[' + idx + '].selectLengthUnit"]');
	var selectPkgFlg = $('[name="listDomainList[' + idx + '].selectPkgFlg"]');
	if(clerVal){
		$(':input[name$="listDomainList[' + idx + '].outerCode"]').val("");
		if(selectFlg != "N" ){
			selectBt
				.removeAttr('disabled');
			description
				.val('')
				.prop('readonly', true)
				.removeClass('gscm_error_class')
				.addClass('gscm_required');
			pkgItemNo
				.val('')
				.prop('readonly', true)
				.removeClass('gscm_error_class')
				.removeClass('gscm_required');
			modelCd
				.val('')
				.prop('readonly', true);
			unitPrice
				.val('')
				.prop('readonly', true)
				.removeClass('gscm_error_class')
				.removeClass('gscm_required');
			length
				.val('')
				.prop('readonly', true)
				.removeClass('gscm_error_class')
				.removeClass('gscm_required');
			width
				.val('')
				.prop('readonly', true)
				.removeClass('gscm_error_class')
				.removeClass('gscm_required');
			height
				.val('')
				.prop('readonly', true)
				.removeClass('gscm_error_class')
				.removeClass('gscm_required');
			netWeight
				.val('')
				.prop('readonly', true)
				.removeClass('gscm_error_class')
				.removeClass('gscm_required');
			netWeightUnit
				.val('')
				.attr('disabled','disabled')
				.removeClass('gscm_error_class')
				.removeClass('gscm_required');
			qtyUnit
				.val('')
				.removeClass('gscm_error_class')
				.addClass('gscm_required');
			qty
				.val('')
				.removeClass('gscm_error_class')
				.addClass('gscm_required');
			originCntryCd
				.val('')
				.attr('disabled','disabled')
				.removeClass('gscm_error_class')
				.removeClass('gscm_required');
			currCd
				.val('')
				.attr('disabled','disabled')
				.removeClass('gscm_error_class')
				.removeClass('gscm_required');
			lengthUnit
				.val('')
				.attr('disabled','disabled')
				.removeClass('gscm_error_class')
				.removeClass('gscm_required');
		}else{
			selectBt
				.attr('disabled','disabled');
			description
				.val('')
				.prop('readonly', false)
				.prop('tabindex', idx + 1 + '3')
				.removeClass('gscm_error_class')
				.addClass('gscm_required');
			pkgItemNo
				.val('')
				.prop('readonly', false)
				.prop('tabindex', idx + 1 + '4')
				.removeClass('gscm_error_class')
				.addClass('gscm_required');
			modelCd
				.val('')
				.prop('readonly', false)
				.prop('tabindex', idx + 1 + '5');
			unitPrice
				.val('')
				.prop('readonly', false)
				.prop('tabindex', idx + 1 + '9')
				.removeClass('gscm_error_class')
				.addClass('gscm_required');
			length
				.val('')
				.prop('readonly', false)
				.prop('tabindex', idx + 1 + '9')
				.removeClass('gscm_error_class')
				.addClass('gscm_required');
			width
				.val('')
				.prop('readonly', false)
				.prop('tabindex', idx + 1 + '9')
				.removeClass('gscm_error_class')
				.addClass('gscm_required');
			height
				.val('')
				.prop('readonly', false)
				.prop('tabindex', idx + 1 + '9')
				.removeClass('gscm_error_class')
				.addClass('gscm_required');
			netWeight
				.val('')
				.prop('readonly', false)
				.prop('tabindex', idx + 1 + '9')
				.removeClass('gscm_error_class')
				.addClass('gscm_required');
			netWeightUnit
				.val('')
				.removeAttr('disabled')
				.removeClass('gscm_error_class')
				.addClass('gscm_required');
			
			qtyUnit
				.val('')
				.removeAttr('disabled')
				.removeClass('gscm_error_class')
				.addClass('gscm_required');
			qty
				.val('')
				.prop('tabindex', idx + 1 + '9')
				.removeClass('gscm_error_class')
				.addClass('gscm_required');
			originCntryCd
				.val('')
				.removeAttr('disabled')
				.removeClass('gscm_error_class')
				.addClass('gscm_required');
			currCd
				.val('')
				.removeAttr('disabled')
				.removeClass('gscm_error_class')
				.addClass('gscm_required');
			lengthUnit
				.val('')
				.removeAttr('disabled')
				.removeClass('gscm_error_class')
				.addClass('gscm_required');
		}
	}else{
		if(outerCode != ""){
			description
				.prop('readonly', true);
			pkgItemNo
				.prop('readonly', true);
			modelCd
				.prop('readonly', true);
			unitPrice
				.prop('readonly', true)
				.removeClass('gscm_required');
			length
				.prop('readonly', true)
				.removeClass('gscm_required');
			width
				.prop('readonly', true)
				.removeClass('gscm_required');
			height
				.prop('readonly', true)
				.removeClass('gscm_required');
			netWeight
				.prop('readonly', true)
				.removeClass('gscm_required');
			originCntryCd
				.attr('disabled','disabled')
				.removeClass('gscm_required');
			currCd
				.attr('disabled','disabled')
				.removeClass('gscm_required');
			lengthUnit
				.attr('disabled','disabled')
				.removeClass('gscm_required');
			netWeightUnit
				.attr('disabled','disabled');
		}else if(selectFlg != "N"){
			selectBt
				.removeAttr('disabled');
			description
				.prop('readonly', true);
			pkgItemNo
				.prop('readonly', true);
			modelCd
				.prop('readonly', true);
			unitPrice
				.prop('readonly', true)
				.removeClass('gscm_required');
			length
				.prop('readonly', true)
				.removeClass('gscm_required');
			width
				.prop('readonly', true)
				.removeClass('gscm_required');
			height
				.prop('readonly', true)
				.removeClass('gscm_required');
			netWeight
				.prop('readonly', true)
				.removeClass('gscm_required');
			originCntryCd
				.attr('disabled','disabled')
				.removeClass('gscm_required');
			currCd
				.attr('disabled','disabled')
				.removeClass('gscm_required');
			lengthUnit
				.attr('disabled','disabled')
				.removeClass('gscm_required');
			netWeightUnit
				.attr('disabled','disabled');
			
		}else{
			selectBt
				.attr('disabled','disabled');
			description
				.prop('readonly', false)
				.prop('tabindex', idx + 1 + '3');
			pkgItemNo
				.prop('readonly', false)
				.prop('tabindex', idx + 1 + '4');
			modelCd
				.prop('readonly', false)
				.prop('tabindex', idx + 1 + '5');
			unitPrice
				.prop('readonly', false)
				.prop('tabindex', idx + 1 + '9');
			length
				.prop('readonly', false)
				.prop('tabindex', idx + 1 + '9');
			width
				.prop('readonly', false)
				.prop('tabindex', idx + 1 + '9');
			height
				.prop('readonly', false)
				.prop('tabindex', idx + 1 + '9');
			netWeight
				.prop('readonly', false)
				.prop('tabindex', idx + 1 + '9');
			netWeightUnit
				.removeAttr('disabled');
			qtyUnit
				.removeAttr('disabled');
			qty
				.prop('tabindex', idx + 1 + '9');
			originCntryCd
				.removeAttr('disabled');
			currCd
				.removeAttr('disabled');
			lengthUnit
				.removeAttr('disabled');
		}
	}
	if(mainMark.length > 0) {
		selectBt
		.attr('disabled','disabled');
		selectPkgFlg
		.attr('disabled','disabled');
	}
}

function setSelected(sel,name){
	$('[name="listDomainList'+name+'"]').val(sel.val());
}

function init(){
	var rowCount = $('#tablefix tr').length - 2;
	for(var i = 0;i < rowCount/2; i++){
		var expRequestRtItemId = $(':input[name$="listDomainList[' + i + '].expRequestRtItemId"]').val();
		var description = $(':input[name$="listDomainList[' + i + '].description"]').val();
		var pkgItemNo = $(':input[name$="listDomainList[' + i + '].pkgItemNo"]').val();
		var unitPrice = $(':input[name$="listDomainList[' + i + '].unitPrice"]').val();
		var length = $(':input[name$="listDomainList[' + i + '].length"]').val();
		var width = $(':input[name$="listDomainList[' + i + '].width"]').val();
		var height = $(':input[name$="listDomainList[' + i + '].height"]').val();
		var netWeight = $(':input[name$="listDomainList[' + i + '].netWeight"]').val();
		var qty = $(':input[name$="listDomainList[' + i + '].qty"]').val();
		var outerCode = $(':input[name$="listDomainList[' + i + '].outerCode"]').val();
		var originCntryCd = $('[name="listDomainList[' + i + '].selectOriginCntryCd"]').val();
		var currCd = $('[name="listDomainList[' + i + '].selectCurrCd"]').val();
		var lengthUnit = $('[name="listDomainList[' + i + '].selectLengthUnit"]').val();
		if (expRequestRtItemId == ''
			&& description == ''
			&& pkgItemNo == ''
			&& unitPrice == ''
			&& length == ''
			&& width == ''
			&& height == ''
			&& netWeight == ''
			&& qty == ''){
			
			if(outerCode != ""){
				var selectFlg = $('[name="listDomainList[' + i + '].selectPkgFlg"]');
				selectPkgFlg(selectFlg,i,false,outerCode );
			}
			break;
		}
		var selectFlg = $('[name="listDomainList[' + i + '].selectPkgFlg"]');
		selectPkgFlg(selectFlg,i,false,outerCode );
	}
	
}
