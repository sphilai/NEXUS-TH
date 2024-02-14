/*
 * W0002.js
 *
 * メニュー画面で用いるJavaScriptです。
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 *//* メニュードロップダウン */
$(function(){
    
    $('div.infomation_list').each(toggleInformation);
    
    /* メニュー */
    $('body').click(function(){
        var i = 0;
        $('ul.menu li').children('ul').hide();
        $('ul.menu li').css('background-color','#2b76cc');
        $('ul.menu li a').css('color','#fff');
        $('ul.nexus_menu li.disable_menu').css('background-color','#aaa');
        $('ul.nexus_menu li.disable_menu a').css('color','#fff');
        $('ul.sub_last li').css('background-color','#2298ee');
        $('ul.sub_last li a').css('color','#fff');
    });
    
    $('ul.menu li').hover(function(){
        var i = 0;
        $(this).parent('ul').children('li').children('ul').hide();
        var elemLi = $(this).parent('ul').children('li');
        if($(this).parent('ul').hasClass('sub_last')){
            $('ul.sub_last li').css('background-color','#2298ee');
            $('ul.sub_last li a').css('color','#fff');
        } else {
            $(this).parent('ul').children('li').css('background-color','#2b76cc');
            $(this).parent('ul').children('li').children('a').css('color','#fff');
        }
        
        //カテゴリーが違うメニューhover時
        if($(this).parent('ul').hasClass('other_menu')){
            $('ul.nexus_menu li').children('ul').hide();
            $('ul.nexus_menu li').css('background-color','#2b76cc');
            $('ul.nexus_menu li a').css('color','#fff');
            $('ul.sub_last li').css('background-color','#2298ee');
            $('ul.sub_last li a').css('color','#fff');
        } else if($(this).parent('ul').hasClass('nexus_menu')){
            $('ul.other_menu li').children('ul').hide();
            $('ul.other_menu li').css('background-color','#2b76cc');
            $('ul.other_menu li a').css('color','#fff');
        }
        
        $(this).children('ul').show();
        if($(this).attr('class') != "disable_menu"){
            $(this).css('background-color','#ff9900');
            $(this).children('a').css('color','#000');
        }
        $('ul.nexus_menu li.disable_menu').css('background-color','#aaa');
        $('ul.nexus_menu li.disable_menu a').css('color','#fff');
    });
    
    /* フローティングウィンドウ、レイヤー設定 */
    $("body").append('<div id="back_layer"></div><div id="front_layer"></div>');
    $("#front_layer").append($("#personal_setup"));
    //ウィンドウ開く
    $("input[name='personalSetup']").click(function(){
        $("#back_layer").css('display','block');
        $("#personal_setup").css('display','block');
        $("#front_layer").fadeIn("first");
        
        // 絞込み部品表示調整
        $('div.ndbutton').css('height', $('input.ndinput:first').height() + 2);
        $('div.ndoption a').css('height', $('input.ndinput:first').height());
        
        // 初期フォーカス
        $("#personal_setup :input[name='listDomain.userLngCd']").focus();
    });
    //ウィンドウ閉じる
    $("#back_layer").click(function(){
        $("#back_layer").css('display','none');
        $("#front_layer").fadeOut(500);
        return false;
    })
    $("input[name='setup']").focusout(function(){
        $("#front_layer").focus();
    });
    // 初期フォーカスの設定
    $("#headerForm :input[name='personalSetup']").focus();
});

/* お知らせ非活性(4件以上) */
function toggleInformation() {
    var $liObj = $(this).find('ul li');
    var $openInfo = $(this).find('a.openInfo');
    var $closeInfo = $(this).find('a.closeInfo');
    // 表示
    function showInfo() {
        var i = 0;
        for(i = 0; i < $liObj.length - 1; i++) {
            $liObj.eq(i).show();
        }
        $openInfo.hide();
        $closeInfo.show();
    }
    // 非表示
    function hideInfo() {
        var i = 0;
        for(i = 0; i < $liObj.length - 1; i++) {
            if ( i >= 3 ) {
                $liObj.eq(i).hide();
            }
        }
        $openInfo.show();
        $closeInfo.hide();
    }
    hideInfo();
    $openInfo.click(showInfo);
    $closeInfo.click(hideInfo);
}

/* submit */
function setup() {
    $("#back_layer").css('display','none');
    $("#front_layer").fadeOut(500);
    jQuery.each(['userLngCd', 'timezoneId', 'charCd'], function() {
        var src = $('select[name="listDomain.' + this + '"]');
        var dst = $('input[name="listDomain.' + this + '"]');
        dst.val(src.val());
    });
    gscm.commonSubmit('W0002Setup.do', $('form[id="mainForm"]').get(0));
}
