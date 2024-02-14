/*
 * W3001.js
 *
 * Java script for Carry-out main screen 
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
/*
====================================================================

====================================================================
*/

$(function(){
   $('#tablefix').tablefix({height: 400, fixRows: 2});
   //Control input criteria by Maninmark or Item
   trKind();
});
/*
====================================================================
Function Name : Control input criteria by CML No. or Item No.
Argument      : -
Return Value  : -
Outline       : -
====================================================================
*/
function trKind(){    
    var $itemType = $('#itemType'), $mainMark = $('#mainMark'), $itemNo = $('#itemNo');    
    if ($itemType.val() == '1') {
        $mainMark.removeAttr('readonly').removeClass('gscm_disabledColor');
        $itemNo.removeAttr('value').addClass('gscm_disabledColor');
        $itemNo.attr('readonly', true);
        
    } else if ($itemType.val() == '2') {
        
        $mainMark.removeAttr('value').addClass('gscm_disabledColor');
        $mainMark.attr('readonly', true);
        $itemNo.removeAttr('readonly').removeClass('gscm_disabledColor');
    } else {
        $itemNo.removeAttr('value').attr('readonly', true);
        $mainMark.removeAttr('value').attr('readonly', true);
        $itemNo.addClass('gscm_disabledColor');
        $mainMark.addClass('gscm_disabledColor');
      
    }
}

/*
====================================================================
Function Name : Shipper company selector screen display
Argument      : -
Return Value  : -
Outline       : -
====================================================================
*/
function showShipperSelect() {
    var retVal = popupWT001("Y", "N", "N");
    $("input[name=criteriaDomain\\.shipperCd]").val(retVal["compCd"]);
}