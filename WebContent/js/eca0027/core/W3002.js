/*
 * W3002.js
 *
 * 
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
/*
====================================================================

====================================================================
*/
window.onload = function() { 
    var f = document.getElementsByTagName('fieldset'); 
    for (i=0;i<f.length;i++){
	    var l = f[i].getElementsByTagName('legend')[0];
        l.style.marginLeft = ((f[i].offsetWidth - l.offsetWidth) / 2) + 'px'; 
    }
} 

/* Show the popup window to select From Company */
function showSelectFromCompany() {
    var retVal = popupWT001("Y", "N", "N");
    if (!retVal) {
        return;
    }
    $("input[name=criteriaDomain\\.carryOutCompCd]").val(retVal["compCd"]);
}

/* Show the popup window to select From Warehouse */
function showSelectFromWarehouse() {
    var retVal = popupWT010();
    if (!retVal) {
        return;
    }
    $("input[name=criteriaDomain\\.carryOutWhCd]").val(retVal["whCd"]);
}

/* Show the popup window to select To Company */
function showSelectToCompany() {
    var retVal = popupWT001("Y", "N", "N");
    if (!retVal) {
        return;
    }
    $("input[name=criteriaDomain\\.carryInCompCd]").val(retVal["compCd"]);
}

/* Show the popup window to select To Warehouse */
function showSelectToWarehouse() {
    var retVal = popupWT010();
    if (!retVal) {
        return;
    }
    $("input[name=criteriaDomain\\.carryInWhCd]").val(retVal["whCd"]);
}

/* Show the popup window to select Shipper */
function showSelectShipper() {
    var retVal = popupWT001("Y", "N", "N");
    if (!retVal) {
        return;
    }
    $("input[name=criteriaDomain\\.shipperCd]").val(retVal["compCd"]);
}
