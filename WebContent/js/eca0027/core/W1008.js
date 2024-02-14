/*
 * W2012.js
 *
 * CML Register画面で用いるJavaScriptです。
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

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
    var orgOuterPkgCd = $(':text[name="w1008CriteriaDomain.outerPkgCd"]').val();
    
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
    var lengthAfter = array['lengthAfter'] // LENGTH DISPLAY/容積単位表記
    var widthAfter = array['widthAfter'] // WIDTH DISPLAY/容積単位表記
    var heightAfter = array['heightAfter'] // HEIGHT DISPLAY/容積単位表記
    
    $(':input[name="w1008CriteriaDomain.outerPkgCd"]').val(outerCd);
    //$("#volumeLabel").text(volumeAfter);
    //$("#lengthUnitLabel").text(lengthUnit);
    //$(':input[name="w1008CriteriaDomain.lengthUnitHeader"]').val(lengthUnit);
    //$(':input[name="w1008CriteriaDomain.lengthUnit"]').val(lengthUnit);
    $(':input[name="w1008CriteriaDomain.volume"]').val(volumeAfter);
    $(':input[name="w1008CriteriaDomain.volumeUnit"]').val(volumeUnitDisp);
    $(':input[name="w1008CriteriaDomain.length"]').val(lengthAfter);
    $(':input[name="w1008CriteriaDomain.width"]').val(widthAfter);
    $(':input[name="w1008CriteriaDomain.height"]').val(heightAfter);
    $(':input[name="w1008CriteriaDomain.ownerComp"]').val(ownerComp);
    $(':input[name="w1008CriteriaDomain.volumeUnit"]').show();
    

    // packagingConfirmedFlg を N にする。
    if (orgOuterPkgCd != outerCd) {
        $(':text[name="w1008CriteriaDomain.packagingConfirmedFlg"]').val("N");
    }
}

function changeValues(type)
{
	
  	var l = parseFloat($(':input[name="w1008CriteriaDomain.length"]').val());
  	var w = parseFloat($(':input[name="w1008CriteriaDomain.width"]').val());
  	var h = parseFloat($(':input[name="w1008CriteriaDomain.height"]').val())
  	if($(':input[name="w1008CriteriaDomain.length"]').val().length > 0 && $(':input[name="w1008CriteriaDomain.width"]').val().length > 0 && $(':input[name="w1008CriteriaDomain.height"]').val().length > 0)
  	{
  		if(isNaN(l)){
  			alert("Please input length is number");
  			$(':input[name="w1008CriteriaDomain.length"]').val("");
  			return false;
  		}else if(isNaN(w)){
  			alert("Please input width is number");
  			$(':input[name="w1008CriteriaDomain.width"]').val("");
  			return false;
  		}else if(isNaN(h)){
  			alert("Please input heigh is number");
  			$(':input[name="w1008CriteriaDomain.height"]').val("");
  			return false;
  		}
  	}else{
  		return false;
  	}
  	if(type == 'l'){
  		if(!isNaN(parseFloat($(':input[name="w1008CriteriaDomain.width"]').val())) && !isNaN(parseFloat($(':input[name="w1008CriteriaDomain.height"]').val()))){
  		  var result = parseFloat($(':input[name="w1008CriteriaDomain.length"]').val()) * parseFloat($(':input[name="w1008CriteriaDomain.width"]').val()) * parseFloat($(':input[name="w1008CriteriaDomain.height"]').val());
  			//$("#volumeLabel").text(result.toFixed(2));
  			$(':input[name="w1008CriteriaDomain.volume"]').val(result.toFixed(3));
  		}
  	}else if(type == 'w'){
  		if(!isNaN(parseFloat($(':input[name="w1008CriteriaDomain.length"]').val())) && !isNaN(parseFloat($(':input[name="w1008CriteriaDomain.height"]').val()))){
  		  var result = parseFloat($(':input[name="w1008CriteriaDomain.length"]').val()) * parseFloat($(':input[name="w1008CriteriaDomain.width"]').val()) * parseFloat($(':input[name="w1008CriteriaDomain.height"]').val());
  		 // $("#volumeLabel").text(result.toFixed(2));
  		  $(':input[name="w1008CriteriaDomain.volume"]').val(result.toFixed(3));
  		}
  	}else if(type == 'h'){
  		if(!isNaN(parseFloat($(':input[name="w1008CriteriaDomain.length"]').val())) && !isNaN(parseFloat($(':input[name="w1008CriteriaDomain.width"]').val()))){
  		  var result = parseFloat($(':input[name="w1008CriteriaDomain.length"]').val()) * parseFloat($(':input[name="w1008CriteriaDomain.width"]').val()) * parseFloat($(':input[name="w1008CriteriaDomain.height"]').val());
  			//$("#volumeLabel").text(result.toFixed(2));
  			$(':input[name="w1008CriteriaDomain.volume"]').val(result.toFixed(3));
  		}
  	}
  	
}
function checkValidateRegister(formBean)
{
	/*var netWeight = parseFloat($("#netWeightLabel").text());
	if(!isNaN(parseFloat($(':input[name="w1008CriteriaDomain.gainWeight"]').val())) == false){
			alert("Please input G/W per plt is number");
	  		$(':input[name="w1008CriteriaDomain.gainWeight"]').val(0.0);
	  		return false;
  	}
  	var gainWeight = parseFloat($(':input[name="w1008CriteriaDomain.gainWeight"]').val());
  	if(netWeight > gainWeight)
  	{
  		alert("G/W per plt must be more than N/W per plt");
  		return false;
  	}*/
	gscm.commonSubmit('W1008Register.do', formBean, '');
}
