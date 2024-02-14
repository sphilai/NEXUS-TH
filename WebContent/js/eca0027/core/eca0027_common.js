/*
 * eca0027_common.js
 *
 * プロジェクト共通で用いるJavaScriptです。
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

window.document.onkeydown = function(e) {
}

/*
====================================================================
関数名：ready
引数  ：-
概要  ：ドキュメントの読み込み完了時に実行する処理。
====================================================================
*/
jQuery(document).ready(function($) {
    // disableElements に含まれているエレメント名のエレメントを非活性にする
    for (var i = 0; i < disableElements.length; i++) {
        var name = disableElements[i];
        var selector = "input[name='" + name + "']"
                     + ",select[name='" + name + "']"
                     + ",textarea[name='" + name + "']";
        $(selector).prop('disabled', true);
    }
    
    // 読取り専用テキストボックスのタブ順を無効化
    $(':input[readonly]').prop('tabindex', -1);
    
    // 初期フォーカスの設定
    $('#mainForm').find('input,select,button,textarea')
                  .filter(':enabled:visible:not([readonly="readonly"]):first')
                  .focus();

    // Disable Ctrl or Shift + link click.
    // CtrlまたはShift+リンククリック無効化
    $("a").mousedown(function(event) {
        if (event.ctrlKey || event.shiftKey) {
            alert(msg.openNewMsg);
            return false;
        }
    });

    // UT261 ADD START
    // Input that has been specified style text-transform:uppercase, also converted to uppercase inner value.
    // スタイルtext-transform:uppercaseが指定されているinputは、実際のvalueも大文字に変換する。
    $("input[type='text']").change(function(e) {
        if ($(e.target).css("text-transform") == "uppercase") {
            $(e.target).val($(e.target).val().toUpperCase());
        }
        return true;
    });
    // UT261 ADD END
});

/*
====================================================================
関数名：function submitBackConfirm
引数  ：action アクションパス
      ：formObj フォーム
      ：cfmMsg 確認メッセージ
概要  ：確認ダイアログを表示後、Trueならgscm.submitBack関数を呼び出す
====================================================================
*/
submitBackConfirm = function (action, formObj, cfmMsg) {
    if (confirm(cfmMsg)) {
        return gscm.submitBack(action, formObj);
    }
}

/*
====================================================================
関数名：clearMessage
引数  ：
概要  ：メッセージエリア内のメッセージを削除する
====================================================================
*/
function clearMessage() {
    $('#gscm_message').children().remove(); 
}

/*
====================================================================
Function Name：function popupWT001
Argument  ：shipperFlg - "Y":SHIPPER, "N":NOT SHIPPER, "":UNKNOWN/ シッパーである場合"Y"、シッパーでない場合"N"、シッパーかどうか不問の場合""
Argument  ：carrierCompFlg - "Y":CARRIER COMPANY, "N":NOT CARRIER COMPANY, "":UNKNOWN/運送会社である場合"Y"、運送会社でない場合"N"、運送会社かどうか不問の場合""
Argument  ：customsBrokerFlg - "Y":CUSTOMS BROKER, "N":NOT CUSTOMS BROKER, "":UNKNOWN/通関代理店である場合"Y"、通関代理店でない場合"N"、通関代理店かどうか不問の場合
Return Value：Associative Array
    array[compCd] - COMPANY CODE/会社コード
    array[compNmAbb] - COMPANY NAME ABBREVIATION/会社略称
    array[compNm] - COMPANY NAME/会社名称
    array[compAddr] - COMPANY ADDRESS/会社住所
    array[lengthUnit] - LENGTH UNIT/長さ単位
    array[weightUnit] - WEIGHT UNIT/重量単位
    array[volumeUnit] - VOLUME UNIT/容積単位
Outline  ：WT001 Company Search Sub Screen/会社選択子画面表示
====================================================================
*/
function popupWT001(shipperFlg, carrierCompFlg, customsBrokerFlg){
    
    var args = [shipperFlg, carrierCompFlg, customsBrokerFlg];
    var action = 'Wt001Init.do';
    
    var retVal = gscm.showModalDialog(action, args, "dialogWidth=650px; dialogHeight=630px; help=off; center=on; maximize=off; minimize=off; status=off; scroll=on; resizable=on;");

    return retVal;
}

function popupWT002(){
    var action = 'Wt002Init.do';
    
    var retVal = gscm.showModalDialog(action, null, "dialogWidth=650px; dialogHeight=630px; help=off; center=on; maximize=off; minimize=off; status=off; scroll=on; resizable=on;");

    return retVal;
}

/*
====================================================================
Function Name：function popupWT004
Argument  ：ownerComp - OWNER COMPANY/責任会社
Return Value：Associative Array
    array[rtTyp] - RT TYPE/再使用区分
    array[pkgItemNo] - PACKAGE ITEM NO/包装材品目番号
    array[modelCd] - MODEL CODE/型式コード
    array[pkgMtrlNm] - PACKAGE NAME(SCREEN DISPLAY)/包装材名称(画面表示用)
Outline  ：WT004 Package Search Sub Screen/包装材選択子画面表示
====================================================================
*/

function popupWT004(ownerComp){

    var args = [ownerComp];
    var action = 'Wt004Init.do';

    var retVal = gscm.showModalDialog(action, args, "dialogWidth=750px; dialogHeight=600px; help=off; center=on; maximize=off; minimize=off; status=off; scroll=on; resizable=on;");

    return retVal;
}

/*
====================================================================
Function Name：function popupWT005
Argument  ：xmainMark - MAIN MARK/まとめメインマーク

Return Value：-
Outline  ：Wt005 CML Info Sub Screen/メインマーク表示子画面
====================================================================
*/
function popupWT005(xmainMark){

    var action = 'Wt005Init.do';
    action = gscm.setActionParameter(action, 'wt005CriteriaDomain.xmainMark', xmainMark);

    gscm.showModalDialog(action, null, "dialogWidth=650px; dialogHeight=600px; help=off; center=on; maximize=off; minimize=off; status=off; scroll=on; resizable=on;");
  
}

/*
====================================================================
Function Name：function popupWT006
Argument  ：ownerCompCsv - OWNER COMPANY CSV/責任会社リスト カンマ区切り
Return Value：Associative Array
    array[outerPkgCd] - OUTER PKG CODE/外装記号
    array[volumeAfter] - VOLUME AFTER CHANGE/容積 変更後
    array[volumeUnitComp] - VOLUME UNIT/容積単位(会社)
    array[ownerComp] - OWNER COMPANY/責任会社
    array[volumeUnitDisp] - VOLUME UNIT DISPLAY/容積単位表記
Outline  ：WT006 Outer Package Search Sub Screen/外装選択子画面表示
====================================================================
*/
function popupWT006(ownerCompCsv){
    
    var args = [ownerCompCsv];
    var action = gscm.setActionParameter('Wt006Init.do', 'wt006CriteriaDomain.ownerCompCsv', ownerCompCsv);
    
    var retVal = gscm.showModalDialog(action, args, "dialogWidth=720px; dialogHeight=600px; help=off; center=on; maximize=off; minimize=off; status=off; scroll=on; resizable=on;");

    return retVal;
}

/*
====================================================================
Function Name：function popupWT007
Argument  ：mainMark - MAIN MARK/まとめメインマーク
Argument  ：mixTagNo - MIX TAG NO/MIX タグ NO

Return Value：-
Outline  ：Wt007 Item No Info Sub Screen/品番表示子画面
====================================================================
*/
function popupWT007(mainMark, mixTagNo){

    var action = 'Wt007Init.do';
    action = gscm.setActionParameter(action, 'wt007CriteriaDomain.mainMark', mainMark);
    action = gscm.setActionParameter(action, 'wt007CriteriaDomain.mixTagNo', mixTagNo);

    gscm.showModalDialog(action, null, "dialogWidth=650px; dialogHeight=600px; help=off; center=on; maximize=off; minimize=off; status=off; scroll=on; resizable=on;");
}

/*
====================================================================
Function Name：function popupWT008
Argument  ：cntryCd - COUNTRY CODE/国コード
Return Value：Associative Array
    array[portCd] - PORT CODE/港コード
    array[portNm] - PORT NAME/港名
    array[cntryCd] - COUNTRY CODE/国コード
Outline  ：WT008 Port Search Sub Screen/港選択子画面表示
====================================================================
*/
function popupWT008(cntryCd){

    var action = gscm.setActionParameter('Wt008Init.do', 'wt008CriteriaDomain.cntryCd', cntryCd);

    var retVal = gscm.showModalDialog(action, null, "dialogWidth=700px; dialogHeight=600px; help=off; center=on; maximize=off; minimize=off; status=off; scroll=on; resizable=on;");
    
    return retVal;
}

/*
====================================================================
Function Name：function popupWT010
Argument  ：-
Return Value：Associative Array
    array[compCd] - COMPANY CODE/会社コード
    array[whCd] - WAREHOUSE CODE/NEXUS倉庫コード
    array[whNm] - WAREHOUSE NAME/倉庫名称
Outline  ：WT010 Warehouse Search Sub Screen/倉庫選択子画面表示
====================================================================
*/

function popupWT010(){

    var action = 'Wt010Init.do';

    var retVal = gscm.showModalDialog(action, null, "dialogWidth=650px; dialogHeight=600px; help=off; center=on; maximize=off; minimize=off; status=off; scroll=on; resizable=on;");
    
    return retVal;
}

/*
====================================================================
Function Name：function popupWT011
Argument  ：-
Return Value：Associative Array
    array[cntryCd] - COUNTRY CODE/国コード
    array[cntryNm] - COUNTRY NAME/国名
Outline  ：WT011 Country Search Sub Screen/国選択子画面表示
====================================================================
*/
function popupWT011(){
    
    var action = 'Wt011Init.do';
    
    var retVal = gscm.showModalDialog(action, null, "dialogWidth=650px; dialogHeight=600px; help=off; center=on; maximize=off; minimize=off; status=off; scroll=on; resizable=on;");
    
    return retVal;
}
/*
====================================================================
Function Name：function popupWT014
Argument  ：-
Return Value：Associative Array
    array[shipToCd] - SHIP TO CODE/送荷先コード
    array[shipToNmAbb] - SHIP TO NAME ABBREVIATION/送荷先略称
    array[shipToNm] - SHIP TO NAME/送荷先名称
    array[printShipToNm] - PRINT SHIP TO NAME/印刷用送荷先名称
    array[printShipToAddr] - PRINT SHIP TO ADDRESS/印刷用送荷先住所
Outline  ：WT014 Ship to Search Sub Screen/送荷先選択子画面
====================================================================
*/
function popupWT014(){

    var action = 'Wt014Init.do';

    var retVal = gscm.showModalDialog(action, null, "dialogWidth=650px; dialogHeight=600px; help=off; center=on; maximize=off; minimize=off; status=off; scroll=on; resizable=on;");
    
    return retVal;
}
/*
====================================================================
Function Name：function popupWT015
Argument  ：shipperCd - SHIPPER CODE/荷主コード
Argument  ：grpNo1 - GRP NO 1/グループNO1
Argument  ：grpNo2 - GRP NO 2/グループNO2
Return Value：-
Outline  ：WT015 Unit Price Error List Sub Screen/売価登録なし品番表示子画面
====================================================================
*/
function popupWT015(shipperCd, grpNo1, grpNo2){

    var action = 'Wt015Init.do';
    action = gscm.setActionParameter(action, 'wt015CriteriaDomain.shipperCd', shipperCd);
    action = gscm.setActionParameter(action, 'wt015CriteriaDomain.grpNo1', grpNo1);
    action = gscm.setActionParameter(action, 'wt015CriteriaDomain.grpNo2', grpNo2);

    gscm.showModalDialog(action, null, "dialogWidth=690px; dialogHeight=600px; help=off; center=on; maximize=off; minimize=off; status=off; scroll=on; resizable=on;");
    
}

/*
====================================================================
Function Name：function popupWT016
Argument  ：shipperCd - SHIPPER CODE/荷主コード
Argument  ：grpNo1 - GRP NO 1/グループNO1
Argument  ：grpNo2 - GRP NO 2/グループNO2
Return Value：-
Outline  ：WT016 Unregistered HS CODE List Sub Screen/HS CODE登録なし品番表示子画面
====================================================================
*/
function popupWT016(shipperCd, grpNo1, grpNo2){

    var action = 'Wt016Init.do';
    action = gscm.setActionParameter(action, 'wt016CriteriaDomain.shipperCd', shipperCd);
    action = gscm.setActionParameter(action, 'wt016CriteriaDomain.grpNo1', grpNo1);
    action = gscm.setActionParameter(action, 'wt016CriteriaDomain.grpNo2', grpNo2);

    gscm.showModalDialog(action, null, "dialogWidth=650px; dialogHeight=600px; help=off; center=on; maximize=off; minimize=off; status=off; scroll=on; resizable=on;");
  
}

/*
====================================================================
Function Name：function popupWT017
Argument  ：-
Return Value：-
Outline  ：WT017 Shipping Actuality Warning List Sub Screen/船積実績ワーニングリスト子画面
====================================================================
*/
function popupWT017(){
    
    var action = 'Wt017Init.do';
    
    gscm.showModalDialog(action, null, "dialogWidth=800px; dialogHeight=600px; help=off; center=on; maximize=off; minimize=off; status=off; scroll=on; resizable=on;");
    
}

/*
====================================================================
Function Name：function popupWT018
Argument  ：shippingActNo - SHIPPING ACT NO/船積実績No

Return Value：-
Outline  ：Wt018 Container No Info Sub Screen/コンテナNo表示子画面
====================================================================
*/
function popupWT018(shippingActNo){

    var action = 'Wt018Init.do';
    action = gscm.setActionParameter(action, 'wt018CriteriaDomain.shippingActNo', shippingActNo);

    gscm.showModalDialog(action, null, "dialogWidth=650px; dialogHeight=600px; help=off; center=on; maximize=off; minimize=off; status=off; scroll=on; resizable=on;");
  
}

/*
====================================================================
関数名：function allcheck
引数  ：name チェックボックスの値を保持するBean名
        property チェックボックスの値を保持するプロパティ名
        checked 全選択の場合はtrue、全解除の場合はfalse
        callback ステータス変更時に呼び出すコールバック関数
概要  ：チェックボックスの全選択・全解除を行う。
====================================================================
*/
function allcheck(name, property, checked, callback) {
    $(':checkbox[name^="' + name + '"][name$="' + property + '"]').each(function() {
        if (checked) {
            if (!$(this).is(':checked')) {
                $(this).prop('checked', true);
                if (callback) callback.call(window, $(this));
            }
        } else {
            if ($(this).is(':checked') && !$(this).is(':disabled')) {
                $(this).prop('checked', false);
                if (callback) callback.call(window, $(this));
            }
        }
    });
}

/*
====================================================================
関数名：function allcheckW3
引数  ：name チェックボックスの値を保持するBean名
        property チェックボックスの値を保持するプロパティ名
        checked 全選択の場合はtrue、全解除の場合はfalse
        callback ステータス変更時に呼び出すコールバック関数
概要  ：チェックボックスの全選択・全解除を行う。
====================================================================
*/
function allcheckW3(name, property, checked, callback) {
    $(':checkbox[name^="' + name + '"][name$="' + property + '"]').each(function() {
        if (checked) {
    // ********** SNT Change End **********//
            //if (!$(this).is(':checked')) {
            if (!$(this).is(':checked') && !$(this).is(':disabled')) {
    // ********** SNT Change End **********//
                $(this).prop('checked', true);
                if (callback) callback.call(window, $(this));
            }
        } else {
            if ($(this).is(':checked') && !$(this).is(':disabled')) {
                $(this).prop('checked', false);
                if (callback) callback.call(window, $(this));
            }
        }
    });
}

/*
====================================================================
関数名：selectValue
引数  ：
概要  ：選択した行の値を呼び出し元画面へ返す

使用にあたっての前提条件
選択に使用するラジオボタンは
name="selected"
とすること。

name 属性の値に、<logic:iterate>のindexed=trueにした結果入る配列名を表すprefix(例：searchList[0].)以外に
.(ピリオド)が使われていないこと。
ダメな例)
name"dept.name"

親画面に配列として返したい値は
<input> の value 属性に値を入れるようにすること。

動作
一覧の行部分で、<input >タグのvalueが配列に格納されて呼び出し元画面へ返る。
<select>,<textare>に対応していないのは、補助画面の位置付けなので
type="text", type="hidden" があれば十分なことがほとんどであるため。

====================================================================
*/
function selectValue(){
    // 選択行をキャッシュ
    $row = $('input[name="selected"]:checked').closest('tr');

    // 返り値の一時格納用連想配列
    var retVal = {};

    // ラジオボタンは選択のために存在しているので除外。
    $row.find('input[type="text"]').each(function(){
        // name を順番に取得。jspでindexed=true にすると、"配列名."がprefixとして付くので削除する。
        var itemName = $(this).attr('name').replace( /.*\./, '');
        retVal[itemName] = $(this).val();
    });
    
    $row.find('input[type="hidden"]').each(function(){
        // name を順番に取得。jspでindexed=true にすると、"配列名."がprefixとして付くので削除する。
        var itemName = $(this).attr('name').replace( /.*\./, '');
        retVal[itemName] = $(this).val();
    });
    
    // showModalDialogの戻り値に設定
    window.returnValue = retVal;
    window.close();
}

/*
====================================================================
関数名：function clickInfo
引数  ：id クリックした行を示すID
        size クリックした行と同じリストのサイズ
概要  ：クリックした行の詳細情報部分の表示・非表示処理
====================================================================
*/
function clickInfo(id,size){
    var idArray = id.split("_");
    var disp;
    var i;
    
    for(i = 0; i < size; i ++){
        disp = $("#" + idArray[0] + "_" + i);
        if(idArray[1] == i){
            if(disp.attr('class') == "disp_none"){
                disp.attr('class',"");
                
            } else {
                disp.attr("class","disp_none");
            }
        } else {
                disp.attr("class","disp_none");
        }
    }
}
