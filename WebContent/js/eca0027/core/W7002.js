/*
 * W7002.js
 *
 * 船積実績Header画面で用いるJavaScriptです。
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
    
    $('select#trns_cd').ieSelectWidth ({
        containerClassName : 'select-container',
        overlayClassName : 'select-overlay'
    });
    
    $('select#freight_responsible_cd').ieSelectWidth ({
        containerClassName : 'select-container',
        overlayClassName : 'select-overlay'
    });
});