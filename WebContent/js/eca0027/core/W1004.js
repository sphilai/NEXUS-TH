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

    var shipperCd = $('#shipeerCd').val();

    var array = popupWT004(shipperCd);
    var rtTyp = array['rtTyp'];
    var pkgItemNo = array['pkgItemNo'];
    var modelCd = array['modelCd'];
    var pkgMtrlNm = array['pkgMtrlNm'];

    var rtFlgName     = "listDomainList[" + idx + "].rtFlg"
    var pkgItemNoName = "listDomainList[" + idx + "].pkgItemNo"; 
    var modelCdName   = "listDomainList[" + idx + "].modelCd";
    var itemDescriptionName = "listDomainList[" + idx + "].itemDescription";

    $(':input[name="' + rtFlgName + '"]').val(rtTyp);
    $(':input[name="' + pkgItemNoName + '"]').val(pkgItemNo);
    $(':input[name="' + modelCdName + '"]').val(modelCd);
    $(':input[name="' + itemDescriptionName + '"]').val(pkgMtrlNm);

}

/*
====================================================================
関数名：enableQty
引数  ：-
概要  ：QTYを活性にする
====================================================================
*/
function enableQty() {
   $(':input[name^="listDomainList"][name$="qty"]').removeAttr('disabled');
}

function setNetWeight(){
	var rowCount = $('#tablefix tr').length - 2;
	for(var i = 0;i < rowCount/2; i++){
		calNetWeight(i);
	}
}

function calNetWeight(idx){
	var netWeightName = "kitList[" + idx + "].netWeight";
	var qtyName = "kitList[" + idx + "].qty";
	var totalNetWeight = "kitList["+ idx + "].totalNetWeight";
	var netWeight = $(':input[name="' + netWeightName + '"]').val();
	var qty = $(':input[name="' + qtyName + '"]').val();
	var total = qty * netWeight;
	if(isNaN(total)){
		$(':input[name="' + totalNetWeight + '"]').val(0);
	}else{
		$(':input[name="' + totalNetWeight + '"]').val(roundNumber(total,3));	
	}
}

// Arguments: number to round, number of decimal places
function roundNumber(rnum, rlength) { 
    var newnumber = Math.round(rnum * Math.pow(10, rlength)) / Math.pow(10, rlength);
    return newnumber.toFixed(rlength);
}