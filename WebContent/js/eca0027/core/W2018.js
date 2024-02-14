/*
 * W20018.js
 *
 * MIxTag PKG Info Detail画面で用いるJavaScriptです。
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
    $('#tablefix').tablefix({height: 361, fixRows: 1});
});

/*
====================================================================
関数名：selectPkgitem
引数  ：-
概要  ：ドキュメントの読み込み完了時に実行する処理。
====================================================================
*/
function selectPkgItem(idx) {

    var shipperCd = $('#shipeerCd').val();
    var array = popupWT004(shipperCd);
    var pkgItemNo = array['pkgItemNo'];
    var modelCd = array['modelCd'];

    var pkgItemNoName = "listDomainList[" + idx + "].pkgItemNo"; 
    var modelCdName   = "listDomainList[" + idx + "].modelCd";

    $(':input[name="' + pkgItemNoName + '"]').val(pkgItemNo);
    $(':input[name="' + modelCdName + '"]').val(modelCd);

}
