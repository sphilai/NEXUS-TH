/*
 * W6006.js
 *
 * 通関書類作成業務 Invoice Grouping画面で用いるJavaScriptです。
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
    $('#tablefix').tablefix({height: 443, fixRows: 2});

    $('select#shipper_cd').ieSelectWidth ({
        containerClassName : 'select-container',
        overlayClassName : 'select-overlay'
    });
    $('select#shipper_cd').focus();
});
