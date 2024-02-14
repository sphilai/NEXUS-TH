/*
 * W8002.js
 *
 * 進度管理詳細画面で用いるJavaScriptです。
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
/*
====================================================================
関数名：confirmContents
引数  ：-
概要  ：進度管理ケースマーク一覧画面をモーダル子画面で開く
====================================================================
*/
function callContents(cmlNo, cmlTyp) {
    var action1 = gscm.setActionParameter('W8003Init.do', 'w8003CriteriaDomain.cmlNo', cmlNo);
    var action = gscm.setActionParameter(action1, 'w8003CriteriaDomain.cmlTyp', cmlTyp);

    var returnValue = gscm.showModalDialog(action, null, "dialogWidth=900px; dialogHeight=585px; help=off; center=on; maximize=off; minimize=off; status=off; scroll=on; resizable=on;");
}
/*
====================================================================
関数名：call
引数  ：-
概要  ：進度管理 RT材情報画面をモーダル子画面で開く
====================================================================
*/
function callReturnable(cmlNo) {
    var action = gscm.setActionParameter('W8004Init.do', 'w8004CriteriaDomain.cmlNo', cmlNo);
    var returnValue = gscm.showModalDialog(action, null, "dialogWidth=720px; dialogHeight=585px; help=off; center=on; maximize=off; minimize=off; status=off; scroll=on; resizable=on;");
}

