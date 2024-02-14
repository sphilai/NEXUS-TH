/*
 * W1007.js
 *
 * E-RT画面で用いるJavaScriptです。
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

/*
====================================================================
関数名：check
引数  ：ck チェックボックスオブジェクト
概要  ：チェックボックス押下処理
====================================================================
*/
var checkboxArray=[];

function check(ck,index) {
    if (ck.is(':checked')) {
       	if(!contains(checkboxArray, index) ) {
       		checkboxArray.push(index);
   		}
    } else {
        if(contains(checkboxArray, index) ) {
       		removeArray(checkboxArray, index);
   		}
    }
     $(':input[name="' + "chk" + '"]').val(checkboxArray);
    
}
function contains( arr, index ){
   for(var i=0; i < arr.length; i++){
    if(arr[i] === index){
      return true;
    }
  }
  return false;
}

function removeArray( arr, index ){
   var i = arr.length;
   while( i-- ) if(arr[i] === index ) arr.splice(i,1);
}

function checkPrintCML(formBean) {
	var rowCount = $('#tablefix tr').length - 2;
	var check =false;
	for(var i = 0;i < rowCount; i++){
		var packingCode = $(':input[name$="listDomainList[' + i + '].packingStatusCode"]').val();
		if(packingCode == "30"){ //Have CML NO
			check = true;
		}
	}
	if(check){
		gscm.commonSubmitForCheck('W1007PrintAllCML.do',formBean, 'false', 'false');
	}else{
		alert("Cannot download Print all CML");
	}
}

function validateChecker(){
	var validate = $(':input[name="' + "chk" + '"]').val();
	if(validate){
		return;
	}
	var rowCount = $('#tablefix tr').length - 2;
	for(var i = 0;i < rowCount; i++){
		var checker = $(':input[name$="listDomainList[' + i + '].selected"]');
		check(checker,i);
	}
}
