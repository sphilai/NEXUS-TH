/*
 * W1006.js
 *
 * 梱包指示Main画面で用いるJavaScriptです。
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
function doMoveToDescription(action, form) {
    if ($("input[name=fromScreenId]").val() == "W1003") {
    	return gscm.submitBack(action, form);
    }else if ($("input[name=fromScreenId]").val() == "W1001") {
    	return gscm.commonSubmit(action, form);
    }else if ($("input[name=fromScreenId]").val() == "W1007") {
    	return gscm.commonSubmit(action, form);
    }
}
