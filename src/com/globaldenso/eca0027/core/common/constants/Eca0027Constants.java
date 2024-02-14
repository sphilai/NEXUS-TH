/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.common.constants;

/**
     * The class holding a constant.
 * <br />定数を保持するクラス。
 *
 * @author $Author: G453S402002 $
 * @version $Revision: 15061 $
 */
public interface Eca0027Constants {

    /*****************************************************************************
     * Request key
     * <br />リクエスト・キー
     *****************************************************************************/

    /**
     * The key of the request attribute which stores the pulldown list of Transports
     * <br />輸送手段のプルダウンリストを格納するリクエスト属性のキー
     */
    public static final String ATTR_TRANS_CD = "trnsCd";

    /**
     * The key of the request attribute which stores the pulldown list of PALLETIZE INSTRUCTION STATUSs
     * <br />梱包指示ステータスのプルダウンリストを格納するリクエスト属性のキー
     */
    public static final String ATTR_PLTZ_INSTR_STATUS = "pltzInstrStatus";

    /**
     * The key of the request attribute which stores the pulldown list of SHIPPING ACTUALITY STATUSs
     * <br />船積実績ステータスのプルダウンリストを格納するリクエスト属性のキー
     */
    public static final String ATTR_SHIPPING_ACT_STATUS = "shippingActStatus";

    /**
     * The key of the request attribute which stores the pulldown list of Export Request STATUSs
     * <br />
     */
    public static final String ATTR_REQUEST_STATUS = "requestStatus";

    /**
     * The key of the request attribute which stores the pulldown list of Invoice classification
     * <br />インボイス種別のプルダウンリストを格納するリクエスト属性のキー
     */
    public static final String ATTR_INV_CTGY = "invoiceCtgry";

    /**
     * The key of the request attribute which stores the pulldown list of Invoice classifications
     * <br />Invoice分類のプルダウンリストを格納するリクエスト属性のキー
     */
    public static final String ATTR_INVOICE_CLASS = "invoiceClass";

    /**
     * The key of the request attribute which stores the pulldown list of Invoice classifications
     * <br />Invoice分類のプルダウンリストを格納するリクエスト属性のキー
     */
    public static final String ATTR_CLASS_OF_INVOICE = "classOfInvoice";

    /**
     * The key of the request attribute which stores the pulldown list of registrants
     * <br />登録者のプルダウンリストを格納するリクエスト属性のキー
     */
    public static final String ATTR_ISSUER = "issuer";

    /**
     * The key of the request attribute which stores the pulldown list of Agent-Company request functions
     * <br />代行会社依頼機能のプルダウンリストを格納するリクエスト属性のキー
     */
    public static final String ATTR_FUNCTION = "function";

    /**
     * The key of the request attribute which stores the pulldown list of Freight Res. Cds
     * <br />運賃支払いコードのプルダウンリストを格納するリクエスト属性のキー
     */
    public static final String ATTR_FREIGHT_RESPONSIBLE_CD = "freightResponsibleCd";

    /**
     * The key of the request attribute which stores the pulldown list of Loading CD
     * <br />Loading CDのプルダウンリストを格納するリクエスト属性のキー
     */
    public static final String ATTR_LOADING_CD = "loadingCd";

    /**
     * The key of the request attribute which stores the pulldown list of PRICE TERMSs
     * <br />建値区分のプルダウンリストを格納するリクエスト属性のキー
     */
    public static final String ATTR_PRICE_TERMS = "priceTerms";

    /**
     * The key of the request attribute which stores the pulldown list of flags
     * <br />フラグのプルダウンリストを格納するリクエスト属性のキー
     */
    public static final String ATTR_FLAG = "flag";

    /**
     * The key of the request attribute which stores the pulldown list of itemType
     * <br />フラグのプルダウンリストを格納するリクエスト属性のキー
     */
    public static final String ATTR_ITEM_TYPE = "itemType";

    /**
     * The key of the request attribute which stores the pulldown list of payMeth
     * <br />フラグのプルダウンリストを格納するリクエスト属性のキー
     */
    public static final String ATTR_PAY_METH = "payMeth";

    /**
     * The key of the request attribute which stores the pulldown list of payMeth
     * <br />フラグのプルダウンリストを格納するリクエスト属性のキー
     */
    public static final String ATTR_TRADE_TERMS = "tradeTerms";

    /**
     * The key of the request attribute which stores the pulldown list of CONTAINER LOOSE TYPEs
     * <br />コンテナルーズ区分のプルダウンリストを格納するリクエスト属性のキー
     */
    public static final String ATTR_CONTAINER_LOOSE_TYP = "containerLooseTyp";

    /**
     * The key of the request attribute which stores the pulldown list of MixTag Statuses
     * <br />MixTagステータスのプルダウンリストを格納するリクエスト属性のキー
     */
    public static final String ATTR_MIX_TAG_STATUS = "mixTagStatus";

    /**
     * The key of the request attribute which stores the pulldown list of factory W/H classification
     * <br />工場倉庫区分のプルダウンリストを格納するリクエスト属性のキー
     */
    public static final String ATTR_PLNT_AND_WH = "plntAndWh";

    /**
     * The key of the request attribute which stores the pulldown list of PACKAGE FORM TYPEs
     * <br />梱包形態のプルダウンリストを格納するリクエスト属性のキー
     */
    public static final String ATTR_PKG_FORM_TYP = "pkgFormTyp";

    /**
    * The key of the request attribute which stores the pulldown list of PACKAGE FORM TYPEs
    * <br />梱包形態のプルダウンリストを格納するリクエスト属性のキー
    */
    public static final String ATTR_PKG_LOC = "packingCompLocation";

    /**
     * The key of the request attribute which stores the pulldown list of language
     * <br />言語のプルダウンリストを格納するリクエスト属性のキー
     */
    public static final String ATTR_LANG = "lang";

    /**
     * The key of the request attribute which stores the pulldown list of character codes
     * <br />文字コードのプルダウンリストを格納するリクエスト属性のキー
     */
    public static final String ATTR_CHAR_CD = "charCd";

    /**
     * The key of the request attribute which stores the pulldown list of time zones
     * <br />タイムゾーンのプルダウンリストを格納するリクエスト属性のキー
     */
    public static final String ATTR_TIMEZONE = "timezone";

    /**
     * The key of the request attribute which stores the pulldown list of CUSTOM TIMING TYPEs
     * <br />通関タイミング区分のプルダウンリストを格納するリクエスト属性のキー
     */
    public static final String ATTR_CC_TYPE = "customTimingTyp";

    /**
     * The key of the request attribute which stores the pulldown list of Export Regulate Types
     * <br />輸出規制区分原単位のプルダウンリストを格納するリクエスト属性のキー
     */
    public static final String ATTR_EXP_REGULATION_TYPE = "expRegulationType";

    /**
     * The key of the request attribute which stores the pulldown list of DENGER-ITEM-FLAG units
     * <br />危険品フラグ単位のプルダウンリストを格納するリクエスト属性のキー
     */
    public static final String ATTR_DNGR_ITEM_FLG = "dngrItemFlg";

    /**
     * The key of the request attribute which stores the pulldown list of CIGMA-PRDCT-FLAG units
     * <br />CIGMA製品フラグ単位のプルダウンリストを格納するリクエスト属性のキー
     */
    public static final String ATTR_CIGMA_PRDCT_FLG = "cigmaPrdctFlg";

    /**
     * The key of the request attribute which stores the list of screen element names made into non-activity
     * <br />非活性にする画面エレメント名のリストを格納するリクエスト属性のキー
     */
    public static final String ATTR_DISABLE_ELEMENT_LIST = "disableElementList";

    /**
     * The key of the request attribute which stores the pulldown list of sorting
     * <br />ソートのプルダウンリストを格納するリクエスト属性のキー
     */
    public static final String ATTR_SORT = "sort";

    /**
     * The key of the request attribute which stores the pulldown list of Progress-Control Statuses
     * <br />進度管理ステータスのプルダウンリストを格納するリクエスト属性のキー
     */;
    public static final String ATTR_PROGRESS_CONTROL_STATUS = "progressControlStatus";

    /**
     * The key of the request attribute which stores the pulldown list of CML TYPEs
     * <br />ケースマーク区分のプルダウンリストを格納するリクエスト属性のキー
     */;
    public static final String ATTR_CML_TYP = "cmlTyp";

    /**
     * The key of the request attribute which stores the pulldown list of cancellation classification by a Documentation
     * <br />通関書類作成業務でキャンセル種別のプルダウンリストを格納するリクエスト属性のキー
     */
    public static final String ATTR_CANCEL_TYP = "cancelTyp";

    /**
     * The key of the request attribute which stores the pulldown list of by by a Documentation
     * <br />通関書類作成業務でbyのプルダウンリストを格納するリクエスト属性のキー
     */
    public static final String ATTR_BY = "by";

    /**
     * The key of the request attribute which stores the pulldown list of SHIPPING CONFIRM STATUSs
     * <br />出荷確認ステータスのプルダウンリストを格納するリクエスト属性のキー
     */
    public static final String ATTR_SHIPPING_FIRM_STATUS = "shippingFirmStatus";

    /**
     * The key of the request attribute which stores the pulldown list of Shipper CDs
     * <br />荷主コードのプルダウンリストを格納するリクエスト属性のキー
     */
    public static final String ATTR_SHIPPER_CD = "shipperCd";

    /**
     * The key of the request attribute which stores the pulldown list of track record persons
     * <br />実績者のプルダウンリストを格納するリクエスト属性のキー
     */
    public static final String ATTR_WORKER = "worker";

    /**
     * The key of the request attribute which stores the pulldown list of CUSTOM TIMING TYPEs
     * <br />通関タイミング区分のプルダウンリストを格納するリクエスト属性のキー
     */
    public static final String ATTR_CUSTOM_TIMING_TYP = "customTimingTyp";

    /**
     * The key of the request attribute which stores the pulldown list of STAGING INSTRUCTION STATUSs
     * <br />荷揃え指示ステータスのプルダウンリストを格納するリクエスト属性のキー
     */
    public static final String ATTR_STG_INSTR_STATUS = "stgInstrStatus";

    /**
     * The key of the request attribute which stores the pulldown list of COMPANY CODEs
     * <br />会社コードのプルダウンリストを格納するリクエスト属性のキー
     */
    public static final String ATTR_OWNER_COMP_LIST = "ownerCompList";

    /**
     * The key of the request attribute which stores the pulldown list of flags
     * <br />フラグのプルダウンリストを格納するリクエスト属性のキー
     */
    public static final String ATTR_FLG = "flg";

    /**
     * The key of the request attribute which stores the pulldown list of transportation classification
     * <br />輸送種別のプルダウンリストを格納するリクエスト属性のキー
     */
    public static final String ATTR_TRANS_TYP_CD = "trnsTypCd";

    /**
     * The key of the request attribute which stores the pulldown list of FULL RT CONSIGNEE CODEs
     * <br />FRT_荷受人コードのプルダウンリストを格納するリクエスト属性のキー
     */
    public static final String ATTR_FRT_CONSIGNEE_CD = "frtConsigneeCd";

    /**
     * FULL RT SHIPPER CODE   Key of the request attribute which stores a pulldown list
     * <br />FRT_荷主コード のプルダウンリストを格納するリクエスト属性のキー
     */
    public static final String ATTR_FRT_SHIPPER_CD = "frtShipperCd";

    /**
     * The key of the request attribute which stores the pulldown list of INVOICE TEMPLATE NOs
     * <br />インボイステンプレートNOのプルダウンリストを格納するリクエスト属性のキー
     */
    public static final String ATTR_INV_TPL_NO = "invTplNo";

    /**
     * The key of the request attribute which stores the pulldown list of FREIGHT RESPONSIBLE NAMEs
     * <br />運賃支払い名のプルダウンリストを格納するリクエスト属性のキー
     */
    public static final String ATTR_FREIGHT_RESPONSIBLE_NM = "freightResponsibleNm";

    /**
     * The key of the request attribute which stores the pulldown list of ADDITIONAL CHARGE NAMEs
     * <br />追加料金_項目名のプルダウンリストを格納するリクエスト属性のキー
     */
    // 2015/3/31 DNJP.Kawamura UT208対応 START >>>>>
//    public static final String ATTR_ADDITIONAL_CHARGE_NM = "additionalChargeNm";
    public static final String ATTR_ADDITIONAL_CHARGE_CD = "additionalChargeCd";
    // 2015/3/31 DNJP.Kawamura UT208対応 END <<<<<

    /**
     * The key of the request attribute which stores the pulldown list of ADDITIONAL CHARGE NAMEs
     * <br />追加料金_項目名のプルダウンリストを格納するリクエスト属性のキー
     */
    public static final String ATTR_ADDITIONAL_CHARGE_NM = "additionalChargeNm";

    /**
     * The key of the request attribute which stores the pulldown list of SHIPPER_TAX_ID_NO
     * <br />SHIPPER_TAX_ID_NOのプルダウンリストを格納するリクエスト属性のキー
     */
    public static final String ATTR_SHIPPER_TAX_ID_NO = "shipperTaxIdNo";

    /**
     * The key of the request attribute which stores the pulldown list of packingStatus
     */
    public static final String ATTR_PACKING_STATUS = "packingStatus";
    /**
     * The key of the request attribute which stores the pulldown list of noOfCML
     */
    public static final String ATTR_NO_CML = "noOfCML";
    // 2015/1/19 DNJP.Kawamura UT011対応 START >>>>>
//    /**
//     * The key of the request attribute which stores the pulldown list of FREE_1_DISP_FLG
//     * <br />FREE_1_DISP_FLGのプルダウンリストを格納するリクエスト属性のキー
//     */
//    public static final String ATTR_FREE_1_DISP_FLG = "comboFree1DispFlg";
//
//    /**
//     * The key of the request attribute which stores the pulldown list of FREE_2_DISP_FLG
//     * <br />FREE_2_DISP_FLGのプルダウンリストを格納するリクエスト属性のキー
//     */
//    public static final String ATTR_FREE_2_DISP_FLG = "comboFree2DispFlg";
//
//    /**
//     * The key of the request attribute which stores the pulldown list of FREE_3_DISP_FLG
//     * <br />FREE_3_DISP_FLGのプルダウンリストを格納するリクエスト属性のキー
//     */
//    public static final String ATTR_FREE_3_DISP_FLG = "comboFree3DispFlg";
//
//    /**
//     * The key of the request attribute which stores the pulldown list of FREE_4_DISP_FLG
//     * <br />FREE_4_DISP_FLGのプルダウンリストを格納するリクエスト属性のキー
//     */
//    public static final String ATTR_FREE_4_DISP_FLG = "comboFree4DispFlg";
    // 2015/1/19 DNJP.Kawamura UT011対応 END <<<<<
    
    /**
     * The key of the request attribute which stores the pulldown list of DocNo
     * <br />DocNoのプルダウンリストを格納するリクエスト属性のキー
     */
    public static final String ATTR_DOC_NO = "docNo";


    /**
     * The key of the request attribute which stores the pulldown list of weight Unit
     * <br />重量単位のプルダウンリストを格納するリクエスト属性のキー
     */
    public static final String ATTR_WEIGHT_UNIT = "weightUnit";

    /**
     * The key of the request attribute which stores the pulldown list of Pallet/Carton Type.
     * <br />パレット・カートン区分のプルダウンリストを格納するリクエスト属性のキー
     * UT420 ADD
     */
    public static final String ATTR_PALLET_CARTON_TYP = "palletCartonTyp";
    
    /*****************************************************************************
     * RESOURCE KEY
     * <br />リソース・キー
     *****************************************************************************/

    /**
     * RESOURCE KEY (Date format of a screen)
     * <br />リソース・キー (画面の日付フォーマット)
     */
    public static final String SCREEN_DATE_FORMAT = "format.screen.yyyymmdd";

    /**
     * RESOURCE KEY (Date format of a list)
     * <br />リソース・キー (帳票の日付フォーマット)
     */
    public static final String REPORT_DATE_FORMAT = "format.report.yyyymmdd";

    /**
     * RESOURCE KEY (CIGMA Web service   user ID)
     * <br />リソース・キー (CIGMA Webサービス ユーザID)
     */
    public static final String WS_CIGMA_USERID = "ws.cigma.userid";

    /**
     * RESOURCE KEY (CIGMA Web service   password)
     * <br />リソース・キー (CIGMA Webサービス パスワード)
     */
    public static final String WS_CIGMA_PASSWORD = "ws.cigma.password";

    /*****************************************************************************
     * Number format
     * <br />数値フォーマット
     *****************************************************************************/

    /**
     * Format to display the weight
     * <br />重量のフォーマット
     */
    public static final String FORMAT_WEIGHT = "######0.000";
    
    /**
     * Format to display the length
     * <br />長さのフォーマット
     */
    public static final String FORMAT_LENGTH = "###0.000";
    
    /**
     * Format to display the volume
     * <br />容積のフォーマット
     */
    public static final String FORMAT_VOLUME = "###########0.000";
    
    /**
     * Format to display the price
     */
    public static final String FORMAT_PRICE = "##############0.00";
    
    /**
     * Format to display the unit price
     */
    public static final String FORMAT_UNIT_PRICE = "############0.000000";
    
    /**
     * Format to display the ratio
     */
    public static final String FORMAT_RATIO = "##0.00";

    /**
     * Forward Back in W1008
     */
    public static final String FORWARD_BACK = "back";
    
    /*****************************************************************************
     * Screen-display string
     * <br />画面表示文字列
     *****************************************************************************/

    /**
     * Screen-display string (with no data)
     * <br />画面表示文字列 (データなし)
     */
    public static final String NO_DATA = "No Data";

    /*****************************************************************************
     * Various delimiters
     * <br />各種区切り文字
     *****************************************************************************/

    /**
     * The delimiter of the parameter of Web service
     * <br />Webサービスのパラメータの区切り文字
     */
    public static final String WS_PARAM_DELIM = ",";

    /**
     * Delimiter of an ERROR CODE LIST (EDI-Receive-Order registration)
     * <br />エラーコードリストの区切り文字 (EDI受注登録)
     */
    public static final String EDI_RCV_ODR_ERR_CD_DELIM = ",";

    /*****************************************************************************
     * CONTENTS
     * <br />お知らせ内容
     *****************************************************************************/

    /**
     * 1 record length of a CONTENTS
     * <br />お知らせ内容の1レコード長
     */
    public static final int MAX_CONTENTS_LINE_SIZE = 25;

    /**
     * The new-line mark of a CONTENTS
     * <br />お知らせ内容の改行マーク
     */
    public static final String CONTENTS_NEWLINE_MARK = "\u0000";

    /*****************************************************************************
     * Time format
     * <br />時刻フォーマット
     *****************************************************************************/

    public static final String TIME_FORMAT = "HH:mm";

    /*****************************************************************************
     * A role and approval function ID
     * <br />役割・認可機能ID
     *****************************************************************************/

    /**
     * Authority (update) For program manipulation
     * <br />権限 (更新) プログラム処理用
     */
    public static final String AUTH_REGISTER_NUMERIC = "2";

    /**
     * Authority (reference) For program manipulation
     * <br />権限 (参照) プログラム処理用
     */
    public static final String AUTH_BROWSE_NUMERIC = "1";

    /**
     * Authority (nothing) For program manipulation
     * <br />権限 (なし) プログラム処理用
     */
    public static final String AUTH_EMPTY_NUMERIC = "0";

    /**
     * Authority (update)
     * <br />権限 (更新)
     */
    public static final String AUTH_REGISTER = "R";

    /**
     * Authority (reference)
     * <br />権限 (参照)
     */
    public static final String AUTH_BROWSE = "B";

    /**
     * Role (local Administrator)
     * <br />役割 (地域管理者)
     */
    public static final String ROLE_AREA_ADMIN = "01";

    /**
     * Role (company Administrator)
     * <br />役割 (会社管理者)
     */
    public static final String ROLE_COMP_ADMIN = "02";

    /**
     * Role (factory Administrator)
     * <br />役割 (工場管理者)
     */
    public static final String ROLE_PLNT_ADMIN = "03";

    /**
     * Approval function ID (Register All)
     * <br />認可機能ID (Register All)
     */
    public static final String PERMIT_FUNC_ID_REGISTER_ALL = "99999R";

    /**
     * Approval function ID (Browse All)
     * <br />認可機能ID (Browse All)
     */
    public static final String PERMIT_FUNC_ID_BROWSE_ALL = "99999B";

    /**
     * Approval function ID (update of Exp Requst)
     * <br />認可機能ID (Exp Requst更新)
     */
    public static final String PERMIT_FUNC_ID_W1001R = "W1001R";

    /**
     * Approval function ID (refer to Exp Requst)
     * <br />認可機能ID (Pltz Instr参照)
     */
    public static final String PERMIT_FUNC_ID_W1001B = "W1001B";

    /**
     * Approval function ID (update of Exp Requst)
     * <br />認可機能ID (Exp Requst更新)
     */
    public static final String PERMIT_FUNC_ID_W1006B = "W1006B";

    /**
     * Approval function ID (refer to Exp Requst)
     * <br />認可機能ID (Pltz Instr参照)
     */
    public static final String PERMIT_FUNC_ID_W1006R = "W1006R"; 

    /**
     * Approval function ID (update of Exp Requst)
     * <br />認可機能ID (Exp Requst更新)
     */
    public static final String PERMIT_FUNC_ID_W1007B = "W1007B";

    /**
     * Approval function ID (refer to Exp Requst)
     * <br />認可機能ID (Pltz Instr参照)
     */
    public static final String PERMIT_FUNC_ID_W1007R = "W1007R"; 

    /**
     * Approval function ID (update of Pltz Instr)
     * <br />認可機能ID (Pltz Instr更新)
     */
    public static final String PERMIT_FUNC_ID_W2001R = "W2001R";

    /**
     * Approval function ID (refer to Pltz Instr)
     * <br />認可機能ID (Pltz Instr参照)
     */
    public static final String PERMIT_FUNC_ID_W2001B = "W2001B";

    /**
     * Approval function ID (update of MixTag)
     * <br />認可機能ID (MixTag更新)
     */
    public static final String PERMIT_FUNC_ID_W2005R = "W2005R";

    /**
     * Approval function ID (refer to MixTag)
     * <br />認可機能ID (MixTag参照)
     */
    public static final String PERMIT_FUNC_ID_W2005B = "W2005B";

    /**
     * Approval function ID (update of CML)
     * <br />認可機能ID (CML更新)
     */
    public static final String PERMIT_FUNC_ID_W2009R = "W2009R";

    /**
     * Approval function ID (refer to CML)
     * <br />認可機能ID (CML参照)
     */
    public static final String PERMIT_FUNC_ID_W2009B = "W2009B";

    /**
     * Approval function ID (refer to Xtag)
     * <br />認可機能ID (Xtag参照)
     */
    public static final String PERMIT_FUNC_ID_W2014B = "W2014B";

    /**
     * Approval function ID (update of Xtag)
     * <br />認可機能ID (Xtag更新)
     */
    public static final String PERMIT_FUNC_ID_W2014R = "W2014R";

    /**
     * Approval function ID (refer to Stg Instr)
     * <br />認可機能ID (Stg Instr参照)
     */
    public static final String PERMIT_FUNC_ID_W4001B = "W4001B";

    /**
     * Approval function ID (update of Stg Instr)
     * <br />認可機能ID (Stg Instr更新)
     */
    public static final String PERMIT_FUNC_ID_W4001R = "W4001R";

    /**
     * Approval function ID (refer to Stg Act)
     * <br />認可機能ID (Stg Act参照)
     */
    public static final String PERMIT_FUNC_ID_W4005B = "W4005B";

    /**
     * Approval function ID (update of Stg Act)
     * <br />認可機能ID (Stg Act更新)
     */
    public static final String PERMIT_FUNC_ID_W4005R = "W4005R";

    /**
     * approval function ID (refer to Shipping Firm)
     * <br />認可機能ID (Shipping Firm参照)
     */
    public static final String PERMIT_FUNC_ID_W5001B = "W5001B";

    /**
     * approval function ID (update of Shipping Firm)
     * <br />認可機能ID (Shipping Firm更新)
     */
    public static final String PERMIT_FUNC_ID_W5001R = "W5001R";

    /**
     * Approval function ID (W6001 update)
     * <br />認可機能ID (W6001更新)
     */
    public static final String PERMIT_FUNC_ID_W6001R = "W6001R";
    /**
     * Approval function ID (W6002 update)
     * <br />認可機能ID (W6002更新)
     */
    public static final String PERMIT_FUNC_ID_W6002R = "W6002R";
    /**
     * Approval function ID (W6004 update)
     * <br />認可機能ID (W6004更新)
     */
    public static final String PERMIT_FUNC_ID_W6004R = "W6004R";

    /**
     * Approval function ID (W7001 update)
     * <br />認可機能ID (W7001更新)
     */
    public static final String PERMIT_FUNC_ID_W7001R = "W7001R";

    /**
     * Approval function ID (W8001 reference)
     * <br />認可機能ID (W8001 参照)
     */
    public static final String PERMIT_FUNC_ID_W8001B = "W8001B";
    /**
     * Approval function ID (W8003 reference)
     * <br />認可機能ID (W8003 参照)
     */
    public static final String PERMIT_FUNC_ID_W8003B = "W8003B";
    /**
     * Approval function ID (W8004 reference)
     * <br />認可機能ID (W8004 参照)
     */
    public static final String PERMIT_FUNC_ID_W8004B = "W8004B";

    /**
     * Approval function ID (W9002 reference)
     * <br />認可機能ID (W9002 参照)
     */
    public static final String PERMIT_FUNC_ID_W9002B = "W9002B";

    /**
     * Approval function ID (W9002 update)
     * <br />認可機能ID (W9002 更新)
     */
    public static final String PERMIT_FUNC_ID_W9002R = "W9002R";

    /**
     * Approval function ID (W9004 reference)
     * <br />認可機能ID (W9004 参照)
     */
    public static final String PERMIT_FUNC_ID_W9004B = "W9004B";

    /**
     * Approval function ID (W9004 update)
     * <br />認可機能ID (W9004 更新)
     */
    public static final String PERMIT_FUNC_ID_W9004R = "W9004R";

    /**
     * Approval function ID (W9007 reference)
     * <br />認可機能ID (W9007 参照)
     */
    public static final String PERMIT_FUNC_ID_W9007B = "W9007B";

    /**
     * Approval function ID (W9007 update)
     * <br />認可機能ID (W9007 更新)
     */
    public static final String PERMIT_FUNC_ID_W9007R = "W9007R";

    /**
     * Approval function ID (W9008 reference)
     * <br />認可機能ID (W9008 参照)
     */
    public static final String PERMIT_FUNC_ID_W9008B = "W9008B";

    /**
     * Approval function ID (W9008 update)
     * <br />認可機能ID (W9008 更新)
     */
    public static final String PERMIT_FUNC_ID_W9008R = "W9008R";

    /**
     * Approval function ID (W9009 reference)
     * <br />認可機能ID (W9009 参照)
     */
    public static final String PERMIT_FUNC_ID_W9009B = "W9009B";

    /**
     * Approval function ID (W9009 update)
     * <br />認可機能ID (W9009 更新)
     */
    public static final String PERMIT_FUNC_ID_W9009R = "W9009R";

    /**
     * Approval function ID (W9011 reference)
     * <br />認可機能ID (W9011 参照)
     */
    public static final String PERMIT_FUNC_ID_W9011B = "W9011B";

    /**
     * Approval function ID (W9011 update)
     * <br />認可機能ID (W9011 更新)
     */
    public static final String PERMIT_FUNC_ID_W9011R = "W9011R";

    /**
     * Approval function ID (W9014 reference)
     * <br />認可機能ID (W9014 参照)
     */
    public static final String PERMIT_FUNC_ID_W9014B = "W9014B";

    /**
     * Approval function ID (W9014 update)
     * <br />認可機能ID (W9014 更新)
     */
    public static final String PERMIT_FUNC_ID_W9014R = "W9014R";

    /**
     * Approval function ID (W9016 reference)
     * <br />認可機能ID (W9016 参照)
     */
    public static final String PERMIT_FUNC_ID_W9016B = "W9016B";

    /**
     * Approval function ID (W9016 update)
     * <br />認可機能ID (W9016 更新)
     */
    public static final String PERMIT_FUNC_ID_W9016R = "W9016R";

    /**
     * Approval function ID (W9017 reference)
     * <br />認可機能ID (W9017 参照)
     */
    public static final String PERMIT_FUNC_ID_W9017B = "W9017B";

    /**
     * Approval function ID (W9017 update)
     * <br />認可機能ID (W9017 更新)
     */
    public static final String PERMIT_FUNC_ID_W9017R = "W9017R";

    /**
     * Approval function ID (W9018 reference)
     * <br />認可機能ID (W9018 参照)
     */
    public static final String PERMIT_FUNC_ID_W9018B = "W9018B";

    /**
     * Approval function ID (W9018 update)
     * <br />認可機能ID (W9018 更新)
     */
    public static final String PERMIT_FUNC_ID_W9018R = "W9018R";

    /**
     * Approval function ID (W9019 reference)
     * <br />認可機能ID (W9019 参照)
     */
    public static final String PERMIT_FUNC_ID_W9019B = "W9019B";

    /**
     * Approval function ID (W9019 update)
     * <br />認可機能ID (W9019 更新)
     */
    public static final String PERMIT_FUNC_ID_W9019R = "W9019R";

    /**
     * Approval function ID (W9022 reference)
     * <br />認可機能ID (W9022 参照)
     */
    public static final String PERMIT_FUNC_ID_W9022B = "W9022B";

    /**
     * Approval function ID (W9022 update)
     * <br />認可機能ID (W9022 更新)
     */
    public static final String PERMIT_FUNC_ID_W9022R = "W9022R";

    /**
     * Approval function ID (W9023 reference)
     * <br />認可機能ID (W9023 参照)
     */
    public static final String PERMIT_FUNC_ID_W9023B = "W9023B";

    /**
     * Approval function ID (W9023 update)
     * <br />認可機能ID (W9023 更新)
     */
    public static final String PERMIT_FUNC_ID_W9023R = "W9023R";

    /**
     * Approval function ID (W9024 reference)
     * <br />認可機能ID (W9024 参照)
     */
    public static final String PERMIT_FUNC_ID_W9024B = "W9024B";

    /**
     * Approval function ID (W9024 update)
     * <br />認可機能ID (W9024 更新)
     */
    public static final String PERMIT_FUNC_ID_W9024R = "W9024R";

    /**
     * Approval function ID (W9025 reference)
     * <br />認可機能ID (W9025 参照)
     */
    public static final String PERMIT_FUNC_ID_W9025B = "W9025B";

    /**
     * Approval function ID (W9025 update)
     * <br />認可機能ID (W9025 更新)
     */
    public static final String PERMIT_FUNC_ID_W9025R = "W9025R";

    /**
     * Approval function ID (refer to WB001)
     * <br />認可機能ID (WB001参照)
     */
    public static final String PERMIT_FUNC_ID_WB001B = "WB001B";

    /**
     * Approval function ID (WB001 update)
     * <br />認可機能ID (WB001更新)
     */
    public static final String PERMIT_FUNC_ID_WB001R = "WB001R";

    /**
     * Approval function ID (WC001 reference)
     * <br />認可機能ID (WC001 参照)
     */
    public static final String PERMIT_FUNC_ID_WC001B = "WC001B";

    /**
     * Approval function ID (WC001 update)
     * <br />認可機能ID (WC001 更新)
     */
    public static final String PERMIT_FUNC_ID_WC001R = "WC001R";
    
    /**
     * Role (area refer)
     */
    public static final String ROLE_AREA_BROWSER = "0B";
    
    /**
     * Role (area register)
     */
    public static final String ROLE_AREA_REGISTER = "0R";
    
    /**
     * Role (BHT LOCK)
     */
    public static final String ROLE_BHT_LOCK = "10";
    
    /**
     * Role (MA Agent refer)
     */
    public static final String ROLE_MA_AGENT_BROWSER = "2B";
    
    /**
     * Role (MA Agent register)
     */
    public static final String ROLE_MA_AGENT_REGISTER = "2R";
    
    /**
     * Role (MA Other refer)
     */
    public static final String ROLE_MA_OTHER_BROWSER = "3B";
    
    /**
     * Role (MA Other register)
     */
    public static final String ROLE_MA_OTHER_REGISTER = "3R";
    
    /**
     * Role (Doc. register)
     */
    public static final String ROLE_DOC_REGISTER = "4R";
    
    /**
     * Role (Ship act. register)
     */
    public static final String ROLE_SHIP_ACT_REGISTER = "5R";
    
    /**
     * Role (Exp req. refer)
     */
    public static final String ROLE_EXP_REQ_BROWSER = "6B";
    
    /**
     * Role (Exp req. register)
     */
    public static final String ROLE_EXP_REQ_REGISTER = "6R";
    
    /**
     * Role (Exp PKG. refer)
     */
    public static final String ROLE_EXP_PKG_BROWSER = "7B";
    
    /**
     * Role (Exp req. register)
     */
    public static final String ROLE_EXP_PKG_REGISTER = "7R";
    
    /**
     * Role (ERT refer)
     */
    public static final String ROLE_ERT_BROWSER = "8B";
    
    /**
     * Role (ERT register)
     */
    public static final String ROLE_ERT_REGISTER = "8R";
    
    /**
     * Role (order refer)
     */
    public static final String ROLE_ORDER_BROWSER = "9B";
    
    /**
     * Role (order register)
     */
    public static final String ROLE_ORDER_REGISTER = "9R";
    
    /**
     * Role (Plt Instr refer)
     */
    public static final String ROLE_PLT_INSTR_BROWSER = "AB";
    
    /**
     * Role (Plt Instr register)
     */
    public static final String ROLE_PLT_INSTR_REGISTER = "AR";
    
    /**
     * Role (M-Tag refer)
     */
    public static final String ROLE_MTAG_BROWSER = "BB";
    
    /**
     * Role (M-Tag register)
     */
    public static final String ROLE_MTAG_REGISTER = "BR";
    
    /**
     * Role (CML refer)
     */
    public static final String ROLE_CML_BROWSER = "CB";
    
    /**
     * Role (CML register)
     */
    public static final String ROLE_CML_REGISTER = "CR";
    
    /**
     * Role (X-Tag refer)
     */
    public static final String ROLE_XTAG_BROWSER = "DB";
    
    /**
     * Role (X-Tag register)
     */
    public static final String ROLE_XTAG_REGISTER = "DR";
    
    /**
     * Role (Carry out refer)
     */
    public static final String ROLE_CARRY_OUT_BROWSER = "EB";
    
    /**
     * Role (Carry out register)
     */
    public static final String ROLE_CARRY_OUT_REGISTER = "ER";
    
    /**
     * Role (Stg Instr refer)
     */
    public static final String ROLE_STG_INSTR_BROWSER = "FB";
    
    /**
     * Role (Stg Instr register)
     */
    public static final String ROLE_STG_INSTR_REGISTER = "FR";
    
    /**
     * Role (Stg act refer)
     */
    public static final String ROLE_STG_ACT_BROWSER = "GB";
    
    /**
     * Role (Stg act register)
     */
    public static final String ROLE_STG_ACT_REGISTER = "GR";
    
    /**
     * Role (Ship confirm refer)
     */
    public static final String ROLE_SHIP_CFRM_BROWSER = "HB";
    
    /**
     * Role (Ship Confirm register)
     */
    public static final String ROLE_SHIP_CFRM_REGISTER = "HR";
    
    /**
     * Role (Progress control refer)
     */
    public static final String ROLE_PRGS_CTRL_BROWSER = "IB";
    
    /*****************************************************************************
     * The extension of a file
     * <br />ファイルの拡張子
     *****************************************************************************/

    /**
     * Extension (PDF) of a file
     * <br />ファイルの拡張子 (PDF)
     */
    public static final String EXT_PDF = ".pdf";

    /*****************************************************************************
     * MESSAGE ID
     *****************************************************************************/

    /**
     * MESSAGE ID (GSCM-E 0-0001)
     */
    public static final String GSCM_E0_0001 = "GSCM-E0-0001";
    /**
     * MESSAGE ID (GSCM-E 0-0003)
     */
    public static final String GSCM_E0_0003 = "GSCM-E0-0003";
    /**
     * MESSAGE ID (GSCM-E 0-0010)
     */
    public static final String GSCM_E0_0010 = "GSCM-E0-0010";
    /**
     * MESSAGE ID (GSCM-E 0-0011)
     */
    public static final String GSCM_E0_0011 = "GSCM-E0-0011";
    /**
     * MESSAGE ID (GSCM-E 0-0013)
     */
    public static final String GSCM_E0_0013 = "GSCM-E0-0013";
    /**
     * MESSAGE ID (GSCM-E 0-0015)
     */
    public static final String GSCM_E0_0015 = "GSCM-E0-0015";
    /**
     * MESSAGE ID (GSCM-E 0-0016)
     */
    public static final String GSCM_E0_0016 = "GSCM-E0-0016";
    /**
     * MESSAGE ID (GSCM-E 0-0017)
     */
    public static final String GSCM_E0_0017 = "GSCM-E0-0017";
    /**
     * MESSAGE ID (GSCM-E 0-0018)
     */
    public static final String GSCM_E0_0018 = "GSCM-E0-0018";
    /**
     * MESSAGE ID (GSCM-E 0-0019)
     */
    public static final String GSCM_E0_0019 = "GSCM-E0-0019";
    /**
     * MESSAGE ID (GSCM-E 0-0020)
     */
    public static final String GSCM_E0_0020 = "GSCM-E0-0020";
    /**
     * MESSAGE ID (GSCM-E 0-0026)
     */
    public static final String GSCM_E0_0026 = "GSCM-E0-0026";
    /**
     * MESSAGE ID (GSCM-E 0-0029)
     */
    public static final String GSCM_E0_0029 = "GSCM-E0-0029";
    /**
     * MESSAGE ID (GSCM-E 0-0029_BHT)
     */
    public static final String GSCM_E0_0029_BHT = "GSCM_E0_0029";
    /**
     * MESSAGE ID (GSCM-E 0-0030)
     */
    public static final String GSCM_E0_0030 = "GSCM-E0-0030";
    /**
     * MESSAGE ID (GSCM-E 0-0031)
     */
    public static final String GSCM_E0_0031 = "GSCM-E0-0031";
    /**
     * MESSAGE ID (GSCM-E 0-0034)
     */
    public static final String GSCM_E0_0034 = "GSCM-E0-0034";
    /**
     * MESSAGE ID (GSCM-E 0-0035)
     */
    public static final String GSCM_E0_0035 = "GSCM-E0-0035";
    /**
     * MESSAGE ID (GSCM-E 0-0036)
     */
    public static final String GSCM_E0_0036 = "GSCM-E0-0036";
    /**
     * MESSAGE ID (GSCM-E 0-0038)
     */
    public static final String GSCM_E0_0038 = "GSCM-E0-0038";
    /**
     * MESSAGE ID (GSCM-E 0-0039)
     */
    public static final String GSCM_E0_0039 = "GSCM-E0-0039";
    /**
     * MESSAGE ID (GSCM-E 0-0040)
     */
    public static final String GSCM_E0_0040 = "GSCM-E0-0040";
    /**
     * MESSAGE ID (GSCM-E 0-0042)
     */
    public static final String GSCM_E0_0042 = "GSCM-E0-0042";
    /**
     * MESSAGE ID (GSCM-E 0-0046)
     */
    public static final String GSCM_E0_0046 = "GSCM-E0-0046";

    /**
     * MESSAGE ID (GSCM-I 0-0001)
     */
    public static final String GSCM_I0_0001 = "GSCM-I0-0001";
    /**
     * MESSAGE ID (GSCM-I 0-0002)
     */
    public static final String GSCM_I0_0002 = "GSCM-I0-0002";
    /**
     * MESSAGE ID (GSCM-I 0-0003)
     */
    public static final String GSCM_I0_0003 = "GSCM-I0-0003";
    /**
     * MESSAGE ID (GSCM-I 0-0004)
     */
    public static final String GSCM_I0_0004 = "GSCM-I0-0004";
    /**
     * MESSAGE ID (GSCM-I 0-0005)
     */
    public static final String GSCM_I0_0005 = "GSCM-I0-0005";
    /**
     * MESSAGE ID (GSCM-I 0-0006)
     */
    public static final String GSCM_I0_0006 = "GSCM-I0-0006";
    /**
     * MESSAGE ID (GSCM-I 0-0007)
     */
    public static final String GSCM_I0_0007 = "GSCM-I0-0007";
    /**
     * MESSAGE ID (GSCM-I 0-0008)
     */
    public static final String GSCM_I0_0008 = "GSCM-I0-0008";
    /**
     * MESSAGE ID (GSCM-I 0-0009)
     */
    public static final String GSCM_I0_0009 = "GSCM-I0-0009";
    /**
     * MESSAGE ID (GSCM-E 0-0024)
     */
    public static final String GSCM_E0_0024 = "GSCM-E0-0024";
    /**
     * MESSAGE ID (NXS-91-0001)
     */
    public static final String NXS_91_0001 = "NXS-91-0001";
    /**
     * MESSAGE ID (NXS-E 1-0001)
     */
    public static final String NXS_E1_0001 = "NXS-E1-0001";
    /**
     * MESSAGE ID (NXS-E 1-0002)
     */
    public static final String NXS_E1_0002 = "NXS-E1-0002";
    /**
     * MESSAGE ID (NXS-E 1-0003)
     */
    public static final String NXS_E1_0003 = "NXS-E1-0003";
    /**
     * MESSAGE ID (NXS-E 1-0004)
     */
    public static final String NXS_E1_0004 = "NXS-E1-0004";
    /**
     * MESSAGE ID (NXS-E 1-0005)
     */
    public static final String NXS_E1_0005 = "NXS-E1-0005";
    /**
     * MESSAGE ID (NXS-E 1-0005_BHT)
     */
    public static final String NXS_E1_0005_BHT = "NXS_E1_0005";
    /**
     * MESSAGE ID (NXS-E 1-0006)
     */
    public static final String NXS_E1_0006 = "NXS-E1-0006";
    /**
     * MESSAGE ID (NXS-E 1-0007)
     */
    public static final String NXS_E1_0007 = "NXS-E1-0007";
    /**
     * MESSAGE ID (NXS-E 1-0008)
     */
    public static final String NXS_E1_0008 = "NXS-E1-0008";
    /**
     * MESSAGE ID (NXS-E 1-0009)
     */
    public static final String NXS_E1_0009 = "NXS-E1-0009";
    /**
     * MESSAGE ID (NXS-E 1-0010)
     */
    public static final String NXS_E1_0010 = "NXS-E1-0010";
    /**
     * MESSAGE ID (NXS-E 1-0011)
     */
    public static final String NXS_E1_0011 = "NXS-E1-0011";
    /**
     * MESSAGE ID (NXS-E 1-0012)
     */
    public static final String NXS_E1_0012 = "NXS-E1-0012";
    /**
     * MESSAGE ID (NXS-E 1-0013)
     */
    public static final String NXS_E1_0013 = "NXS-E1-0013";
    /**
     * MESSAGE ID (NXS-E 1-0014)
     */
    public static final String NXS_E1_0014 = "NXS-E1-0014";
    /**
     * MESSAGE ID (NXS-E 1-0015)
     */
    public static final String NXS_E1_0015 = "NXS-E1-0015";
    /**
     * MESSAGE ID (NXS-E 1-0016)
     */
    public static final String NXS_E1_0016 = "NXS-E1-0016";
    /**
     * MESSAGE ID (NXS-E 1-0017)
     */
    public static final String NXS_E1_0017 = "NXS-E1-0017";
    /**
     * MESSAGE ID (NXS-E 1-0018)
     */
    public static final String NXS_E1_0018 = "NXS-E1-0018";
    /**
     * MESSAGE ID (NXS-E 1-0019)
     */
    public static final String NXS_E1_0019 = "NXS-E1-0019";
    /**
     * MESSAGE ID (NXS-E 1-0020)
     * UT456 ADD
     */
    public static final String NXS_E1_0020 = "NXS-E1-0020";
    /**
     * MESSAGE ID (NXS-E 1-0021)
     */
    public static final String NXS_E1_0021 = "NXS-E1-0021";
    /**
     * MESSAGE ID (NXS-E 1-0022)
     */
    public static final String NXS_E1_0022 = "NXS-E1-0022";
    /**
     * MESSAGE ID (NXS-E 1-0023)
     */
    public static final String NXS_E1_0023 = "NXS-E1-0023";
    /**
     * MESSAGE ID (NXS-E 1-0024)
     */
    public static final String NXS_E1_0024 = "NXS-E1-0024";
    /**
     * MESSAGE ID (NXS-E 1-0025)
     */
    public static final String NXS_E1_0025 = "NXS-E1-0025";
    /**
     * MESSAGE ID (NXS-E 1-0026)
     */
    public static final String NXS_E1_0026 = "NXS-E1-0026";
    /**
     * MESSAGE ID (NXS-E 1-0027)
     */
    public static final String NXS_E1_0027 = "NXS-E1-0027";
    /**
     * MESSAGE ID (NXS-E 1-0028)
     */
    public static final String NXS_E1_0028 = "NXS-E1-0028";
    /**
     * MESSAGE ID (NXS-E 1-0029)
     */
    public static final String NXS_E1_0029 = "NXS-E1-0029";
    /**
     * MESSAGE ID (NXS-E 1-0030)
     */
    public static final String NXS_E1_0030 = "NXS-E1-0030";
    /**
     * MESSAGE ID (NXS-E 1-0031)
     */
    public static final String NXS_E1_0031 = "NXS-E1-0031";
    /**
     * MESSAGE ID (NXS-E 1-0032)
     */
    public static final String NXS_E1_0032 = "NXS-E1-0032";
    /**
     * MESSAGE ID (NXS-E 1-0033)
     */
    public static final String NXS_E1_0033 = "NXS-E1-0033";
    /**
     * MESSAGE ID (NXS-E 1-0034)
     */
    public static final String NXS_E1_0034 = "NXS-E1-0034";
    /**
     * MESSAGE ID (NXS-E 1-0035)
     */
    public static final String NXS_E1_0035 = "NXS-E1-0035";
    /**
     * MESSAGE ID (NXS-E 1-0036)
     */
    public static final String NXS_E1_0036 = "NXS-E1-0036";
    /**
     * MESSAGE ID (NXS-E 1-0037)
     */
    public static final String NXS_E1_0037 = "NXS-E1-0037";
    /**
     * MESSAGE ID (NXS-E 1-0038)
     */
    public static final String NXS_E1_0038 = "NXS-E1-0038";
    /**
     * MESSAGE ID (NXS-E 1-0039)
     */
    public static final String NXS_E1_0039 = "NXS-E1-0039";
    /**
     * MESSAGE ID (NXS-E 1-0040)
     */
    public static final String NXS_E1_0040 = "NXS-E1-0040";
    /**
     * MESSAGE ID (NXS-E 1-0041)
     */
    public static final String NXS_E1_0041 = "NXS-E1-0041";
    /**
     * MESSAGE ID (NXS-E 1-0042)
     */
    public static final String NXS_E1_0042 = "NXS-E1-0042";
    /**
     * MESSAGE ID (NXS-E 1-0043)
     */
    public static final String NXS_E1_0043 = "NXS-E1-0043";
    /**
     * MESSAGE ID (NXS-E 1-0044)
     */
    public static final String NXS_E1_0044 = "NXS-E1-0044";
    /**
     * MESSAGE ID (NXS-E 1-0046)
     */
    public static final String NXS_E1_0046 = "NXS-E1-0046";
    /**
     * MESSAGE ID (NXS-E 1-0047)
     */
    public static final String NXS_E1_0047 = "NXS-E1-0047";
    /**
     * MESSAGE ID (NXS-E 1-0048)
     */
    public static final String NXS_E1_0048 = "NXS-E1-0048";
    /**
     * MESSAGE ID (NXS-E 1-0049)
     */
    public static final String NXS_E1_0049 = "NXS-E1-0049";
    /**
     * MESSAGE ID (NXS-E 1-0050)
     */
    public static final String NXS_E1_0050 = "NXS-E1-0050";
    /**
     * MESSAGE ID (NXS-E 1-0051)
     */
    public static final String NXS_E1_0051 = "NXS-E1-0051";
    /**
     * MESSAGE ID (NXS-E 1-0052)
     */
    public static final String NXS_E1_0052 = "NXS-E1-0052";
    /**
     * MESSAGE ID (NXS-E 1-0053)
     */
    public static final String NXS_E1_0053 = "NXS-E1-0053";
    /**
     * MESSAGE ID (NXS-E 1-0054)
     */
    public static final String NXS_E1_0054 = "NXS-E1-0054";
    /**
     * MESSAGE ID (NXS-E 1-0055)
     */
    public static final String NXS_E1_0055 = "NXS-E1-0055";
    /**
     * MESSAGE ID (NXS-E 1-0057)
     */
    public static final String NXS_E1_0057 = "NXS-E1-0057";
    /**
     * MESSAGE ID (NXS-E 1-0058)
     */
    public static final String NXS_E1_0058 = "NXS-E1-0058";
    /**
     * MESSAGE ID (NXS-E 1-0059)
     */
    public static final String NXS_E1_0059 = "NXS-E1-0059";
    /**
     * MESSAGE ID (NXS-E 1-0060)
     */
    public static final String NXS_E1_0060 = "NXS-E1-0060";
    /**
     * MESSAGE ID (NXS-E 1-0061)
     */
    public static final String NXS_E1_0061 = "NXS-E1-0061";
    /**
     * MESSAGE ID (NXS-E 1-0062)
     */
    public static final String NXS_E1_0062 = "NXS-E1-0062";
    //Thalerngsak Add for CML by BHT
    /**
     * MESSAGE ID (NXS_E1_0062_BHT)
     */
    public static final String NXS_E1_0062_BHT = "2";
    /**
     * MESSAGE ID (NXS-E 1-0063)
     */
    public static final String NXS_E1_0063 = "NXS-E1-0063";
    /**
     * MESSAGE ID (NXS-E 1-0064)
     */
    public static final String NXS_E1_0064 = "NXS-E1-0064";
    /**
     * MESSAGE ID (NXS-E 1-0065)
     */
    public static final String NXS_E1_0065 = "NXS-E1-0065";
    /**
     * MESSAGE ID (NXS-E 1-0066)
     */
    public static final String NXS_E1_0066 = "NXS-E1-0066";
    /**
     * MESSAGE ID (NXS-E 1-0068)
     */
    public static final String NXS_E1_0068 = "NXS-E1-0068";
    /**
     * MESSAGE ID (NXS-E 1-0100)
     */
    public static final String NXS_E1_0100 = "NXS-E1-0100";
    /**
     * MESSAGE ID (NXS-E 1-5001)
     */
    public static final String NXS_E1_5001 = "NXS_E1_5001";
    /**
     * MESSAGE ID (NXS-E 1-5004)
     */
    public static final String NXS_E1_5004 = "NXS_E1_5004";
    /**
     * MESSAGE ID (NXS-E 1-5005)
     */
    public static final String NXS_E1_5005 = "NXS_E1_5005";
    /**
     * MESSAGE ID (NXS-E 1-5006)
     */
    public static final String NXS_E1_5006 = "NXS_E1_5006";
    /**
     * MESSAGE ID (NXS-E 1-5007)
     */
    public static final String NXS_E1_5007 = "NXS_E1_5007";
    /**
     * MESSAGE ID (NXS-E 1-5008)
     */
    public static final String NXS_E1_5008 = "NXS_E1_5008";
    /**
     * MESSAGE ID (NXS-E 1-5009)
     */
    public static final String NXS_E1_5009 = "NXS_E1_5009";
    /**
     * MESSAGE ID (NXS-E 1-5010)
     */
    public static final String NXS_E1_5010 = "NXS_E1_5010";
    /**
     * MESSAGE ID (NXS-E 1-5015)
     */
    public static final String NXS_E1_5015 = "NXS_E1_5015";
    /**
     * MESSAGE ID (NXS-E 1-5016)
     */
    public static final String NXS_E1_5016 = "NXS_E1_5016";
    /**
     * MESSAGE ID (NXS-E 1-5017)
     */
    public static final String NXS_E1_5017 = "NXS_E1_5017";
    /**
     * MESSAGE ID (NXS-E 1-5019)
     */
    public static final String NXS_E1_5019 = "NXS_E1_5019";
    /**
     * MESSAGE ID (NXS-E 1-5020)
     */
    public static final String NXS_E1_5020 = "NXS_E1_5020";
    /**
     * MESSAGE ID (NXS-E 1-5021)
     */
    public static final String NXS_E1_5021 = "NXS_E1_5021";
    /**
     * MESSAGE ID (NXS-E 1-5025)
     */
    public static final String NXS_E1_5025 = "NXS_E1_5025";
    /**
     * MESSAGE ID (NXS-E 1-5038)
     */
    public static final String NXS_E1_5038 = "NXS_E1_5038";
    /**
     * MESSAGE ID (NXS-E 1-5039)
     */
    public static final String NXS_E1_5039 = "NXS_E1_5039";
    /**
     * MESSAGE ID (NXS-E 1-5040)
     */
    public static final String NXS_E1_5040 = "NXS_E1_5040";
    /**
     * MESSAGE ID (NXS-E 1-5041)
     */
    public static final String NXS_E1_5041 = "NXS_E1_5041";
    /**
     * MESSAGE ID (NXS-E 1-5042)
     */
    public static final String NXS_E1_5042 = "NXS_E1_5042";
    /**
     * MESSAGE ID (NXS-E 1-5043)
     */
    public static final String NXS_E1_5043 = "NXS_E1_5043";
    /**
     * MESSAGE ID (NXS-E 1-5044)
     */
    public static final String NXS_E1_5044 = "NXS_E1_5044";
    /**
     * MESSAGE ID (NXS-E 1-5046)
     */
    public static final String NXS_E1_5046 = "NXS_E1_5046";
    /**
     * MESSAGE ID (NXS-E 1-5047)
     */
    public static final String NXS_E1_5047 = "NXS_E1_5047";
    /**
     * MESSAGE ID (NXS-E 1-5048)
     */
    public static final String NXS_E1_5048 = "NXS_E1_5048";
    /**
     * MESSAGE ID (NXS-E 1-5050)
     */
    public static final String NXS_E1_5050 = "NXS_E1_5050";
    /**
     * MESSAGE ID (NXS-E 1-5050)
     */
    public static final String NXS_E1_5056 = "NXS_E1_5056";
    /**
     * MESSAGE ID (NXS-E 1-5050)
     */
    public static final String NXS_E1_5057 = "NXS_E1_5057";
    /**
     * MESSAGE ID (NXS-E 1-5050)
     */
    public static final String NXS_E1_5058 = "NXS_E1_5058";
    /**
     * MESSAGE ID (NXS-E 1-5059)
     */
    public static final String NXS_E1_5059 = "NXS_E1_5059";
    /**
     * MESSAGE ID (NXS-E 1-5060)
     */
    public static final String NXS_E1_5060 = "NXS_E1_5060";
    /**
     * MESSAGE ID (NXS-E 1-5062)
     */
    public static final String NXS_E1_5062 = "NXS_E1_5062";
    /**
     * MESSAGE ID (NXS-E 1-5064)
     */
    public static final String NXS_E1_5064 = "NXS_E1_5064";
    /**
     * MESSAGE ID (NXS-E 1-5066)
     */
    public static final String NXS_E1_5066 = "NXS_E1_5066";
    /**
     * MESSAGE ID (NXS-E 1-5067)
     */
    public static final String NXS_E1_5067 = "NXS_E1_5067";
    /**
     * MESSAGE ID (NXS-E 1-5068)
     */
    public static final String NXS_E1_5068 = "NXS_E1_5068";
    /**
     * MESSAGE ID (NXS-E 1-5069)
     */
    public static final String NXS_E1_5069 = "NXS_E1_5069";
    /**
     * MESSAGE ID (NXS-E 1-5070)
     */
    public static final String NXS_E1_5070 = "NXS_E1_5070";
    /**
     * MESSAGE ID (NXS-E 1-5072)
     */
    public static final String NXS_E1_5072 = "NXS_E1_5072";
    
    /**
     * MESSAGE ID (NXS-E 7-0001)
     */
    public static final String NXS_E7_0001 = "NXS-E7-0001";
    
    /**
     * MESSAGE ID (NXS-E 7-0002)
     */
    public static final String NXS_E7_0002 = "NXS-E7-0002";
    /**
     * UT110 TRIAL SHIPMENT/号試品対応 ADD
     * MESSAGE ID (NXS-E 7-0003)
     */
    public static final String NXS_E7_0003 = "NXS-E7-0003";
    /**
     * MESSAGE ID (NXS-E 7-0004)
     */
    public static final String NXS_E7_0004 = "NXS-E7-0004";
    /**
     * MESSAGE ID (NXS-E 7-0005)
     */
    public static final String NXS_E7_0005 = "NXS-E7-0005";
    /**
     * MESSAGE ID (NXS-E 7-0005_BHT)
     */
    public static final String NXS_E7_0005_BHT = "NXS_E7_0005";
    /**
     * MESSAGE ID (NXS-E 7-0006)
     */
    public static final String NXS_E7_0006 = "NXS-E7-0006";
    /**
     * UT110 TRIAL SHIPMENT/号試品対応 ADD
     * MESSAGE ID (NXS-E 7-0007)
     */
    public static final String NXS_E7_0007 = "NXS-E7-0007";
     /**
     * MESSAGE ID (NXS-E 7-0009)
     * UT304 MULTI LABEL ADD
     * UT110 TRIAL SHIPMENT/号試品対応 ADD
     * MESSAGE ID (NXS-E 7-0008)
     */
    public static final String NXS_E7_0008 = "NXS-E7-0008";
    /**
     * MESSAGE ID (NXS-E 7-0009)
     * UT304 MULTI LABEL ADD
     */
    public static final String NXS_E7_0009 = "NXS-E7-0009";
    /**
     * MESSAGE ID (NXS-E 7-0010)
     */
    public static final String NXS_E7_0010 = "NXS-E7-0010";
    /**
     * MESSAGE ID (NXS-E 7-0011)
     */
    public static final String NXS_E7_0011 = "NXS-E7-0011";
    /**
     * MESSAGE ID (NXS-E 7-0012)
     */
    public static final String NXS_E7_0012 = "NXS-E7-0012";
    /**
     * MESSAGE ID (NXS-E 7-0013)
     */
    public static final String NXS_E7_0013 = "NXS-E7-0013";
    /**
     * MESSAGE ID (NXS-E 7-0014)
     */
    public static final String NXS_E7_0014 = "NXS-E7-0014";
    /**
     * MESSAGE ID (NXS-E 7-0015)
     */
    public static final String NXS_E7_0015 = "NXS-E7-0015";
    /**
     * MESSAGE ID (NXS-E 7-0016)
     */
    public static final String NXS_E7_0016 = "NXS-E7-0016";
    /**
     * MESSAGE ID (NXS-E 7-0017)
     */
    public static final String NXS_E7_0017 = "NXS-E7-0017";
    /**
     * MESSAGE ID (NXS-E 7-0018)
     */
    public static final String NXS_E7_0018 = "NXS-E7-0018";
    /**
     * MESSAGE ID (NXS-E 7-0019)
     */
    public static final String NXS_E7_0019 = "NXS-E7-0019";
    /**
     * MESSAGE ID (NXS-E 7-0020)
     */
    public static final String NXS_E7_0020 = "NXS-E7-0020";
    /**
     * MESSAGE ID (NXS-E 7-0021)
     */
    public static final String NXS_E7_0021 = "NXS-E7-0021";
    /**
     * MESSAGE ID (NXS-E 7-0022)
     */
    public static final String NXS_E7_0022 = "NXS-E7-0022";
    /**
     * MESSAGE ID (NXS-E 7-0023)
     */
    public static final String NXS_E7_0023 = "NXS-E7-0023";
    /**
     * MESSAGE ID (NXS-E 7-0024)
     */
    public static final String NXS_E7_0024 = "NXS-E7-0024";
    /**
     * MESSAGE ID (NXS-E 7-0025)
     */
    public static final String NXS_E7_0025 = "NXS-E7-0025";
    /**
     * MESSAGE ID (NXS-E 7-0026)
     */
    public static final String NXS_E7_0026 = "NXS-E7-0026";
    /**
     * MESSAGE ID (NXS-E 7-0027)
     */
    public static final String NXS_E7_0027 = "NXS-E7-0027";
    /**
     * MESSAGE ID (NXS-E 7-0028)
     */
    public static final String NXS_E7_0028 = "NXS-E7-0028";
    /**
     * MESSAGE ID (NXS-E 7-0029)
     */
    public static final String NXS_E7_0029 = "NXS-E7-0029";
    /**
     * MESSAGE ID (NXS-E 7-0030)
     */
    public static final String NXS_E7_0030 = "NXS-E7-0030";
    /**
     * MESSAGE ID (NXS-E 7-0031)
     */
    public static final String NXS_E7_0031 = "NXS-E7-0031";
    /**
     * MESSAGE ID (NXS-E 7-0032)
     */
    public static final String NXS_E7_0032 = "NXS-E7-0032";
    /**
     * MESSAGE ID (NXS-E 7-0033)
     */
    public static final String NXS_E7_0033 = "NXS-E7-0033";
    /**
     * MESSAGE ID (NXS-E 7-0034)
     */
    public static final String NXS_E7_0034 = "NXS-E7-0034";
    /**
     * MESSAGE ID (NXS-E 7-0035)
     */
    public static final String NXS_E7_0035 = "NXS-E7-0035";
    /**
     * MESSAGE ID (NXS-E 7-0036)
     */
    public static final String NXS_E7_0036 = "NXS-E7-0036";
    /**
     * MESSAGE ID (NXS-E 7-0037)
     */
    public static final String NXS_E7_0037 = "NXS-E7-0037";
    /**
     * MESSAGE ID (NXS-E7-0038)
     */
    public static final String NXS_E7_0038 = "NXS-E7-0038";
    /**
     * MESSAGE ID (NXS-E 7-0039)
     */
    public static final String NXS_E7_0039 = "NXS-E7-0039";
    /**
     * MESSAGE ID (NXS-E 7-0040)
     */
    public static final String NXS_E7_0040 = "NXS-E7-0040";
    /**
     * MESSAGE ID (NXS-E 7-0041)
     */
    public static final String NXS_E7_0041 = "NXS-E7-0041";
    /**
     * MESSAGE ID (NXS-E 7-0042)
     */
    public static final String NXS_E7_0042 = "NXS-E7-0042";
    /**
     * MESSAGE ID (NXS-E 7-0043)
     */
    public static final String NXS_E7_0043 = "NXS-E7-0043";
    /**
     * MESSAGE ID (NXS-E 7-0044)
     * UT296 ADD
     */
    public static final String NXS_E7_0044 = "NXS-E7-0044";
    /**
     * MESSAGE ID (NXS-E 7-0045)
     */
    public static final String NXS_E7_0045 = "NXS-E7-0045";
    /**
     * MESSAGE ID (NXS-E 7-0046)
     */
    public static final String NXS_E7_0046 = "NXS-E7-0046";
    /**
     * MESSAGE ID (NXS-E 7-0047)
     */
    public static final String NXS_E7_0047 = "NXS-E7-0047";
    /**
     * MESSAGE ID (NXS-E 7-0048)
     */
    public static final String NXS_E7_0048 = "NXS-E7-0048";
    /**
     * MESSAGE ID (NXS-E 7-0049)
     */
    public static final String NXS_E7_0049 = "NXS-E7-0049";
    /**
     * MESSAGE ID (NXS-E 7-0050)
     */
    public static final String NXS_E7_0050 = "NXS-E7-0050";
    /**
     * MESSAGE ID (NXS-E 7-0051)
     */
    public static final String NXS_E7_0051 = "NXS-E7-0051";
    /**
     * MESSAGE ID (NXS-E 7-0052)
     */
    public static final String NXS_E7_0052 = "NXS-E7-0052";
    /**
     * MESSAGE ID (NXS-E 7-0053)
     */
    public static final String NXS_E7_0053 = "NXS-E7-0053";
    /**
     * MESSAGE ID (NXS-E 7-0054)
     */
    public static final String NXS_E7_0054 = "NXS-E7-0054";
    /**
     * MESSAGE ID (NXS-E 7-0055)
     */
    public static final String NXS_E7_0055 = "NXS-E7-0055";
    /**
     * MESSAGE ID (NXS-E 7-0056)
     */
    public static final String NXS_E7_0056 = "NXS-E7-0056";
    /**
     * MESSAGE ID (NXS-E 7-0057)
     */
    public static final String NXS_E7_0057 = "NXS-E7-0057";
    /**
     * MESSAGE ID (NXS-E 7-0058)
     */
    public static final String NXS_E7_0058 = "NXS-E7-0058";
    
    /**
     * MESSAGE ID (NXS-E 7-0059)
     */
    public static final String NXS_E7_0059 = "NXS-E7-0059";
    
    /**
     * MESSAGE ID (NXS-E 7-0060)
     */
    public static final String NXS_E7_0060 = "NXS-E7-0060";
    
    /**
     * MESSAGE ID (NXS-E 7-0061)
     */
    public static final String NXS_E7_0061 = "NXS-E7-0061";
    /**
     * MESSAGE ID (NXS-E 7-0062)
     */
    public static final String NXS_E7_0062 = "NXS-E7-0062";
    /**
     * MESSAGE ID (NXS-E 7-0063)
     */
    public static final String NXS_E7_0063 = "NXS-E7-0063";
    /**
     * MESSAGE ID (NXS-E 7-0064)
     */
    public static final String NXS_E7_0064 = "NXS-E7-0064";
    /**
     * MESSAGE ID (NXS-E 7-0065)
     */
    public static final String NXS_E7_0065 = "NXS-E7-0065";
    /**
     * MESSAGE ID (NXS-E 7-0066)
     */
    public static final String NXS_E7_0066 = "NXS-E7-0066";
    /**
     * MESSAGE ID (NXS-E 7-0067)
     */
    public static final String NXS_E7_0067 = "NXS-E7-0067";
    /**
     * MESSAGE ID (NXS-E 7-0068)
     */
    public static final String NXS_E7_0068 = "NXS-E7-0068";
    /**
     * MESSAGE ID (NXS-E 7-0069)
     */
    public static final String NXS_E7_0069 = "NXS-E7-0069";
    /**
     * MESSAGE ID (NXS-E 7-0070)
     */
    public static final String NXS_E7_0070 = "NXS-E7-0070";
    /**
     * MESSAGE ID (NXS-E 7-0071)
     */
    public static final String NXS_E7_0071 = "NXS-E7-0071";
    /**
     * MESSAGE ID (NXS-E 7-0072)
     */
    public static final String NXS_E7_0072 = "NXS-E7-0072";
    /**
     * MESSAGE ID (NXS-E 7-0073)
     */
    public static final String NXS_E7_0073 = "NXS-E7-0073";
    /**
     * MESSAGE ID (NXS-E 7-0074)
     */
    public static final String NXS_E7_0074 = "NXS-E7-0074";
    /**
     * MESSAGE ID (NXS-E 7-0077)
     */
    public static final String NXS_E7_0075 = "NXS-E7-0075";
    /**
     * MESSAGE ID (NXS-E 7-0076)
     */
    public static final String NXS_E7_0076 = "NXS-E7-0076";
    /**
     * MESSAGE ID (NXS-E 7-0077)
     */
    public static final String NXS_E7_0077 = "NXS-E7-0077";
    /**
     * MESSAGE ID (NXS-E 7-0078)
     */
    public static final String NXS_E7_0078 = "NXS-E7-0078";
    /**
     * MESSAGE ID (NXS-E 7-0079)
     */
    public static final String NXS_E7_0079 = "NXS-E7-0079";
    /**
     * MESSAGE ID (NXS-E 7-0080)
     */
    public static final String NXS_E7_0080 = "NXS-E7-0080";
    /**
     * MESSAGE ID (NXS-E 7-0081)
     */
    public static final String NXS_E7_0081 = "NXS-E7-0081";
    /**
     * MESSAGE ID (NXS-E 7-0082)
     */
    public static final String NXS_E7_0082 = "NXS-E7-0082";
    /**
     * MESSAGE ID (NXS-E 7-0083)
     */
    public static final String NXS_E7_0083 = "NXS-E7-0083";
    /**
     * MESSAGE ID (NXS-E 7-0084)
     */
    public static final String NXS_E7_0084 = "NXS-E7-0084";
    /**
     * MESSAGE ID (NXS-E 7-0085)
     */
    public static final String NXS_E7_0085 = "NXS-E7-0085";
    /**
     * MESSAGE ID (NXS-E 7-0086)
     */
    public static final String NXS_E7_0086 = "NXS-E7-0086";
    /**
     * MESSAGE ID (NXS-E 7-0087)
     */
    public static final String NXS_E7_0087 = "NXS-E7-0087";
    /**
     * MESSAGE ID (NXS-E 7-0088)
     */
    public static final String NXS_E7_0088 = "NXS-E7-0088";
    /**
     * MESSAGE ID (NXS-E 7-0089)
     */
    public static final String NXS_E7_0089 = "NXS-E7-0089";
    /**
     * MESSAGE ID (NXS-E 7-0090)
     */
    public static final String NXS_E7_0090 = "NXS-E7-0090";
    /**
     * MESSAGE ID (NXS-E 7-0091)
     */
    public static final String NXS_E7_0091 = "NXS-E7-0091";
    /**
     * MESSAGE ID (NXS-E 7-0092)
     */
    public static final String NXS_E7_0092 = "NXS-E7-0092";
    /**
     * MESSAGE ID (NXS-E 7-0093)
     */
    public static final String NXS_E7_0093 = "NXS-E7-0093";
    /**
     * MESSAGE ID (NXS-E 7-0094)
     */
    public static final String NXS_E7_0094 = "NXS-E7-0094";
    /**
     * MESSAGE ID (NXS-E 7-0095)
     */
    public static final String NXS_E7_0095 = "NXS-E7-0095";
    /**
     * MESSAGE ID (NXS-E 7-0096)
     */
    public static final String NXS_E7_0096 = "NXS-E7-0096";
    /**
     * MESSAGE ID (NXS-E 7-0097)
     */
    public static final String NXS_E7_0097 = "NXS-E7-0097";
    /**
     * MESSAGE ID (NXS-E 7-0098)
     */
    public static final String NXS_E7_0098 = "NXS-E7-0098";
    /**
     * MESSAGE ID (NXS-E 7-0099)
     */
    public static final String NXS_E7_0099 = "NXS-E7-0099";
    /**
     * MESSAGE ID (NXS-E 7-0100)
     */
    public static final String NXS_E7_0100 = "NXS-E7-0100";
    /**
     * MESSAGE ID (NXS-E 7-0101)
     */
    public static final String NXS_E7_0101 = "NXS-E7-0101";
    /**
     * MESSAGE ID (NXS-E 7-0102)
     */
    public static final String NXS_E7_0102 = "NXS-E7-0102";
    /**
     * MESSAGE ID (NXS-E 7-0103)
     */
    public static final String NXS_E7_0103 = "NXS-E7-0103";
    /**
     * MESSAGE ID (NXS-E 7-0104)
     */
    public static final String NXS_E7_0104 = "NXS-E7-0104";
    /**
     * MESSAGE ID (NXS-E 7-0105)
     */
    public static final String NXS_E7_0105 = "NXS-E7-0105";
    /**
     * MESSAGE ID (NXS-E 7-0106)
     */
    public static final String NXS_E7_0106 = "NXS-E7-0106";
    /**
     * MESSAGE ID (NXS-E 7-0107)
     */
    public static final String NXS_E7_0107 = "NXS-E7-0107";
    /**
     * MESSAGE ID (NXS-E 7-0108)
     */
    public static final String NXS_E7_0108 = "NXS-E7-0108";
    /**
     * MESSAGE ID (NXS-E 7-0109)
     */
    public static final String NXS_E7_0109 = "NXS-E7-0109";
    /**
     * MESSAGE ID (NXS-E 7-0110)
     */
    public static final String NXS_E7_0110 = "NXS-E7-0110";
    /**
     * MESSAGE ID (NXS-E 7-0111)
     */
    public static final String NXS_E7_0111 = "NXS-E7-0111";
    /**
     * MESSAGE ID (NXS-E 7-0112)
     */
    public static final String NXS_E7_0112 = "NXS-E7-0112";
    /**
     * MESSAGE ID (NXS-E 7-0113)
     */
    public static final String NXS_E7_0113 = "NXS-E7-0113";
    /**
     * MESSAGE ID (NXS-E 7-0114)
     */
    public static final String NXS_E7_0114 = "NXS-E7-0114";
    /**
     * MESSAGE ID (NXS-E 7-0115)
     */
    public static final String NXS_E7_0115 = "NXS-E7-0115";
    /**
     * MESSAGE ID (NXS-E 7-0116)
     */
    public static final String NXS_E7_0116 = "NXS-E7-0116";
    /**
     * MESSAGE ID (NXS-E 7-0117)
     */
    public static final String NXS_E7_0117 = "NXS-E7-0117";
    /**
     * MESSAGE ID (NXS-E 7-0118)
     */
    public static final String NXS_E7_0118 = "NXS-E7-0118";
    /**
     * MESSAGE ID (NXS-E 7-0119)
     */
    public static final String NXS_E7_0119 = "NXS-E7-0119";
    /**
     * MESSAGE ID (NXS-E 7-0120)
     */
    public static final String NXS_E7_0120 = "NXS-E7-0120";
    /**
     * MESSAGE ID (NXS-E 7-0121)
     */
    public static final String NXS_E7_0121 = "NXS-E7-0121";
    /**
     * MESSAGE ID (NXS-E 7-0122)
     */
    public static final String NXS_E7_0122 = "NXS-E7-0122";
    /**
     * MESSAGE ID (NXS-E 7-0123)
     */
    public static final String NXS_E7_0123 = "NXS-E7-0123";
    /**
     * MESSAGE ID (NXS-E 7-0124)
     */
    public static final String NXS_E7_0124 = "NXS-E7-0124";
    /**
     * MESSAGE ID (NXS-E 7-0125)
     */
    public static final String NXS_E7_0125 = "NXS-E7-0125";
    /**
     * MESSAGE ID (NXS-E 7-0126)
     */
    public static final String NXS_E7_0126 = "NXS-E7-0126";
    /**
     * MESSAGE ID (NXS-E 7-0127)
     */
    public static final String NXS_E7_0127 = "NXS-E7-0127";
    /**
     * MESSAGE ID (NXS-E 7-0128)
     */
    public static final String NXS_E7_0128 = "NXS-E7-0128";
    /**
     * MESSAGE ID (NXS-E 7-0129)
     */
    public static final String NXS_E7_0129 = "NXS-E7-0129";
    /**
     * MESSAGE ID (NXS-E 7-0130)
     */
    public static final String NXS_E7_0130 = "NXS-E7-0130";
    /**
     * MESSAGE ID (NXS-E 7-0131)
     */
    public static final String NXS_E7_0131 = "NXS-E7-0131";
    /**
     * MESSAGE ID (NXS-E 7-0132)
     */
    public static final String NXS_E7_0132 = "NXS-E7-0132";
    /**
     * MESSAGE ID (NXS-E 7-0133)
     */
    public static final String NXS_E7_0133 = "NXS-E7-0133";
    /**
     * MESSAGE ID (NXS-E 7-0134)
     */
    public static final String NXS_E7_0134 = "NXS-E7-0134";
    /**
     * MESSAGE ID (NXS-E 7-0135)
     */
    public static final String NXS_E7_0135 = "NXS-E7-0135";
    /**
     * MESSAGE ID (NXS-E 7-0136)
     */
    public static final String NXS_E7_0136 = "NXS-E7-0136";
    /**
     * MESSAGE ID (NXS-E 7-0137)
     */
    public static final String NXS_E7_0137 = "NXS-E7-0137";
    /**
     * MESSAGE ID (NXS-E 7-0138)
     */
    public static final String NXS_E7_0138 = "NXS-E7-0138";
    /**
     * MESSAGE ID (NXS-E 7-0139)
     */
    public static final String NXS_E7_0139 = "NXS-E7-0139";
    /**
     * MESSAGE ID (NXS-E 7-0140)
     */
    public static final String NXS_E7_0140 = "NXS-E7-0140";
    /**
     * MESSAGE ID (NXS-E 7-0141)
     */
    public static final String NXS_E7_0141 = "NXS-E7-0141";
    /**
     * MESSAGE ID (NXS-E 7-0142)
     */
    public static final String NXS_E7_0142 = "NXS-E7-0142";
    /**
     * MESSAGE ID (NXS-E 7-0143)
     */
    public static final String NXS_E7_0143 = "NXS-E7-0143";
    /**
     * MESSAGE ID (NXS-E 7-0144)
     */
    public static final String NXS_E7_0144 = "NXS-E7-0144";
    /**
     * MESSAGE ID (NXS-E 7-0145)
     */
    public static final String NXS_E7_0145 = "NXS-E7-0145";
    /**
     * MESSAGE ID (NXS-E 7-0146)
     */
    public static final String NXS_E7_0146 = "NXS-E7-0146";
    /**
     * MESSAGE ID (NXS-E 7-0147)
     */
    public static final String NXS_E7_0147 = "NXS-E7-0147";
    /**
     * MESSAGE ID (NXS-E 7-0148)
     */
    public static final String NXS_E7_0148 = "NXS-E7-0148";
    /**
     * MESSAGE ID (NXS-E 7-0149)
     */
    public static final String NXS_E7_0149 = "NXS-E7-0149";
    /**
     * MESSAGE ID (NXS-E 7-0150)
     */
    public static final String NXS_E7_0150 = "NXS-E7-0150";
    /**
     * MESSAGE ID (NXS-E 7-0151)
     */
    public static final String NXS_E7_0151 = "NXS-E7-0151";
    /**
     * MESSAGE ID (NXS-E 7-0152)
     */
    public static final String NXS_E7_0152 = "NXS-E7-0152";
    /**
     * MESSAGE ID (NXS-E 7-0153)
     */
    public static final String NXS_E7_0153 = "NXS-E7-0153";
    /**
     * MESSAGE ID (NXS-E 7-0154)
     */
    public static final String NXS_E7_0154 = "NXS-E7-0154";
    /**
     * MESSAGE ID (NXS-E 7-0155)
     */
    public static final String NXS_E7_0155 = "NXS-E7-0155";
    /**
     * MESSAGE ID (NXS-E 7-0156)
     */
    public static final String NXS_E7_0156 = "NXS-E7-0156";
    /**
     * MESSAGE ID (NXS-E 7-0157)
     */
    public static final String NXS_E7_0157 = "NXS-E7-0157";
    /**
     * MESSAGE ID (NXS-E 7-0158)
     */
    public static final String NXS_E7_0158 = "NXS-E7-0158";

    /**
     * MESSAGE ID (NXS-E 7-0159)
     */
    public static final String NXS_E7_0159 = "NXS-E7-0159";

    /**
     * MESSAGE ID (NXS-E 7-0160)
     */
    public static final String NXS_E7_0160 = "NXS-E7-0160";

    /**
     * MESSAGE ID (NXS-E 7-0161)
     */
    public static final String NXS_E7_0161 = "NXS-E7-0161";

    /**
     * MESSAGE ID (NXS-E 7-0162)
     */
    public static final String NXS_E7_0162 = "NXS-E7-0162";
    
    /**
     *  MESSAGE ID (NXS-E 7-0163)
    */
    public static final String NXS_E7_0163 = "NXS-E7-0163";
    /**
     * MESSAGE ID (NXS-I 1-0001)
     */
    public static final String NXS_I1_0001 = "NXS-I1-0001";
    /**
     * MESSAGE ID (NXS-I 1-0004)
     */
    public static final String NXS_I1_0004 = "NXS-I1-0004";
    /**
     * MESSAGE ID (NXS-I 1-0009)
     */
    public static final String NXS_I1_0009 = "NXS-I1-0009";
    /**
     * MESSAGE ID (NXS-I 1-0011)
     */
    public static final String NXS_I1_0011 = "NXS-I1-0011";
    /**
     * MESSAGE ID (NXS-I 1-0012)
     */
    public static final String NXS_I1_0012 = "NXS-I1-0012";
    /**
     * MESSAGE ID (NXS-I 1-0013)
     */
    public static final String NXS_I1_0013 = "NXS-I1-0013";
    /**
     * MESSAGE ID (NXS-I 1-0014)
     */
    public static final String NXS_I1_0014 = "NXS-I1-0014";
    /**
     * MESSAGE ID (NXS-I 1-0015)
     */
    public static final String NXS_I1_0015 = "NXS-I1-0015";
    /**
     * MESSAGE ID (NXS-I 1-0016)
     */
    public static final String NXS_I1_0016 = "NXS-I1-0016";
    /**
     * MESSAGE ID (NXS-I 1-0017)
     */
    public static final String NXS_I1_0017 = "NXS-I1-0017";
    
    /**
     * MESSAGE ID (NXS-E 1-3000)
     */
    public static final String NXS_E1_3000 = "NXS-E1-3000";

    /**
     * MESSAGE ID (NXS-W 1-0001)
     */
    public static final String NXS_W1_0001 = "NXS-W1-0001";
    /**
     * MESSAGE ID (NXS-W 1-0002)
     */
    public static final String NXS_W1_0002 = "NXS-W1-0002";
    /**
     * MESSAGE ID (NXS-W 1-0003)
     */
    public static final String NXS_W1_0003 = "NXS-W1-0003";
    /**
     * MESSAGE ID (NXS-W 1-0004)
     */
    public static final String NXS_W1_0004 = "NXS-W1-0004";
    /**
     * MESSAGE ID (NXS-W 1-0005)
     */
    public static final String NXS_W1_0005 = "NXS-W1-0005";
    /**
     * MESSAGE ID (NXS-W 1-0006)
     */
    public static final String NXS_W1_0006 = "NXS-W1-0006";
    /**
     * MESSAGE ID (NXS-W 1-0007)
     */
    public static final String NXS_W1_0007 = "NXS-W1-0007";
    /**
     * MESSAGE ID (an EDI-Receive-Order registration batch / ECA0027E10001)
     */
    public static final String ECA0027E10001 = "ECA0027E10001";
    /**
     * MESSAGE ID (an EDI-Receive-Order registration batch / ECA0027E10002)
     */
    public static final String ECA0027E10002 = "ECA0027E10002";
    /**
     * MESSAGE ID (an EDI-Receive-Order registration batch / ECA0027E10003)
     */
    public static final String ECA0027E10003 = "ECA0027E10003";
    /**
     * MESSAGE ID (an EDI-Receive-Order registration batch / ECA0027E10004)
     */
    public static final String ECA0027E10004 = "ECA0027E10004";
    /**
     * MESSAGE ID (an EDI-Receive-Order registration batch / ECA0027E10005)
     */
    public static final String ECA0027E10005 = "ECA0027E10005";
    /**
     * MESSAGE ID (an EDI-Receive-Order registration batch / ECA0027E10006)
     */
    public static final String ECA0027E10006 = "ECA0027E10006";
    /**
     * MESSAGE ID (an EDI-Receive-Order registration batch / ECA0027E10007)
     */
    public static final String ECA0027E10007 = "ECA0027E10007";
    /**
     * MESSAGE ID (an EDI-Receive-Order registration batch / ECA0027E10008)
     */
    public static final String ECA0027E10008 = "ECA0027E10008";
    /**
     * MESSAGE ID (an EDI-Receive-Order registration batch / ECA0027E10009)
     */
    public static final String ECA0027E10009 = "ECA0027E10009";
    /*
     * MESSAGE ID (a part for a DNSI addition)
     */
    /**
     * MESSAGE ID (NXS-E 1-5016)
     */
    public static final String NXS_E1_50161 = "NXS_E1_5016";
    /**
     * MESSAGE ID (NXS-E 1-5011)
     */
    public static final String NXS_E1_5011 = "NXS_E1_5011";
    /**
     * MESSAGE ID (NXS-E 1-5032)
     */
    public static final String NXS_E1_5032 = "NXS_E1_5032";
    /**
     * MESSAGE ID (NXS-E 1-5029)
     */
    public static final String NXS_E1_5029 = "NXS_E1_5029";
    /**
     * MESSAGE ID (NXS-E 1-5002)
     */
    public static final String NXS_E1_5002 = "NXS_E1_5002";
    /**
     * MESSAGE ID (NXS-E 1-5033)
     */
    public static final String NXS_E1_5033 = "NXS_E1_5033";
    /**
     * MESSAGE ID (NXS-E 1-5022)
     */
    public static final String NXS_E1_5022 = "NXS_E1_5022";
    /**
     * MESSAGE ID (NXS-E 1-5023)
     */
    public static final String NXS_E1_5023 = "NXS_E1_5023";
    /**
     * MESSAGE ID (NXS-E 1-5024)
     */
    public static final String NXS_E1_5024 = "NXS_E1_5024";
    /**
     * MESSAGE ID (NXS-E 1-5026)
     */
    public static final String NXS_E1_5026 = "NXS_E1_5026";
    /**
     * MESSAGE ID (NXS-E 1-5027)
     */
    public static final String NXS_E1_5027 = "NXS_E1_5027";
    /**
     * MESSAGE ID (NXS-E 1-5028)
     */
    public static final String NXS_E1_5028 = "NXS_E1_5028";
    /**
     * MESSAGE ID (NXS-E 1-5034)
     */
    public static final String NXS_E1_5034 = "NXS_E1_5034";
    /**
     * MESSAGE ID (NXS-E 1-5031)
     */
    public static final String NXS_E1_5031 = "NXS_E1_5031";
    /**
     * MESSAGE ID (NXS-E 1-5018)
     */
    public static final String NXS_E1_5018 = "NXS_E1_5018";
    /**
     * MESSAGE ID (NXS-E 1-5035)
     */
    public static final String NXS_E1_5035 = "NXS_E1_5035";
    /**
     * MESSAGE ID (NXS-E 1-5036)
     */
    public static final String NXS_E1_5036 = "NXS_E1_5036";
    /**
     * MESSAGE ID (NXS-E 1-5052)
     */
    public static final String NXS_E1_5052 = "NXS_E1_5052";
    /**
     * MESSAGE ID (NXS-E 1-5053)
     */
    public static final String NXS_E1_5053 = "NXS_E1_5053";
    /**
     * MESSAGE ID (NXS-E 1-5054)
     */
    public static final String NXS_E1_5054 = "NXS_E1_5054";
    /**
     * MESSAGE ID (NXS-E 1-5055)
     */
    public static final String NXS_E1_5055 = "NXS_E1_5055";
    /**
     * MESSAGE ID (NXS-E 1-5063)
     */
    public static final String NXS_E1_5063 = "NXS_E1_5063";
    /**
     * MESSAGE ID (NXS-E 1-5065)
     */
    public static final String NXS_E1_5065 = "NXS_E1_5065";
    /**
     * MESSAGE ID (NXS-E 1-5071)
     */
    public static final String NXS_E1_5071 = "NXS_E1_5071";
    /**
     * MESSAGE ID (NXS-E 7-5045)
     */
    public static final String NXS_E7_5045 = "NXS_E7_5045";

    /*****************************************************************************
     * Flag value
     * <br />フラグ値
     *****************************************************************************/

    /**
     * Flag value (ON)
     * <br />フラグ値 (オン)
     */
    public static final String FLAG_ON = "1";

    /**
     * Flag value (OFF)
     * <br />フラグ値 (オフ)
     */
    public static final String FLAG_OFF = "0";

    /**
     * Flag value (Yes)
     * <br />フラグ値 (Yes)
     */
    public static final String FLAG_Y = "Y";

    /**
     * Flag value (No)
     * <br />フラグ値 (No)
     */
    public static final String FLAG_N = "N";

    /**
     * Check box VALUE (ON)
     * <br />チェックボックス値 (オン)
     */
    public static final String CHECK_ON = "on";

    /**
     * Check box VALUE (OFF)
     * <br />チェックボックス値 (オフ)
     */
    public static final String CHECK_OFF = "off";

    /*****************************************************************************
     * Web service
     * <br />Webサービス
     *****************************************************************************/

    /**
     * Execution result of Web service (normal)
     * <br />Webサービスの実行結果（正常）
     */
    public static final String WS_RESULT_SUCCESS = "0";

    /**
     * Execution result of Web service (error)
     * <br />Webサービスの実行結果（エラー）
     */
    public static final String WS_RESULT_ERROR = "1";

    /**
     * Execution result of Web service (system error)
     * <br />Webサービスの実行結果（システムエラー）
     */
    public static final String WS_RESULT_ERROR_SYSTEM_JOB = "2";

    /**
     * Execution result of Web service (error list output)
     * <br />Webサービスの実行結果（エラーリスト出力）
     */
    public static final String WS_RESULT_ERROR_ERR_REPORT_OUT = "3";

    /**
     * Execution result of Web service (system error)
     * <br />Webサービスの実行結果（システムエラー）
     */
    public static final String WS_RESULT_ERROR_SYSTEM = "9";

    /**
     * Date format (CIGMA) of Web service
     * <br />Webサービスの日付フォーマット (CIGMA)
     */
    public static final String WS_CIGMA_DATE_FORMAT = "yyyyMMdd";

    /**
     * Time format (CIGMA) of Web service
     * <br />Webサービスの時間フォーマット (CIGMA)
     */
    public static final String WS_CIGMA_TIME_FORMAT = "hhmm";

    /**
     * The PARAMETER NAME of the library name of Web service
     * <br />Webサービスのライブラリ名のパラメータ名
     */
    public static final String WS_PARAM_LIB = "lib";

    /*****************************************************************************
     * The maximum number
     * <br />最大件数
     *****************************************************************************/

    /**
     * 1 page-record number maximum
     * <br />1ページレコード件数最大値
     */
    public static final int PAGE_MAX_COUNT = 50;

    /**
     * Auxiliary screen : 1 page-record number maximum
     * <br />子画面:1ページレコード件数最大値
     */
    public static final int SUB_SCREEN_PAGE_MAX_COUNT = 50;

    /**
     * Record number maximum
     * <br />レコード件数最大値
     */
    public static final int SEARCH_MAX_COUNT = 500;

    /**
     * The maximum acquisition number of an information information
     * <br />お知らせ情報の最大取得件数
     */
    public static final int SYS_INFO_MAX_COUNT = 6;

    /**
     * The maximum registration number (Palletize Instruction Item No Work)
     * <br />最大登録件数 (梱包指示品目番号ワーク)
     */
    public static final int TW_PLTZ_INSTR_ITEM_NO_MAX_COUNT = 999;

    /**
     * The maximum registration number (Mix Tag Work)
     * <br />最大登録件数 (MIXED品目番号ワーク)
     */
    public static final int TW_MIX_TAG_ITEM_NO_MAX_COUNT = 20;

    /**
     * The maximum registration number (Mix Tag RT Work)
     * <br />最大登録件数 (MIXED用RT材ワーク)
     */
    public static final int TW_MIX_TAG_RT_MAX_COUNT = 50;

    /**
     * The maximum registration number (staging instruction)
     * <br />最大登録件数 (荷揃え指示)
     */
    public static final int STG_INSTR_PLTZ_MAX_COUNT = 999;

    /**
     * The maximum registration number (Staging Actuality)
     * <br />最大登録件数 (山作り実績)
     */
    public static final int STG_ACT_PLTZ_MAX_COUNT = 999;

    /**
     * The maximum registration number (Shipping Actuality Invoice Work)
     * <br />最大登録件数（船積実績対象インボイスワーク）
     */
    public static final int TW_SHIPPING_ACT_INVOICE_MAX_COUNT = 99;

    /**
     * Package QUANTITY maximum
     * <br />パッケージ数量最大値
     */
    public static final int PKQ_QTY_MAX = 9999;

    /**
     * Maximum file size (3 MB)
     * <br />最大ファイルサイズ(3MB)
     */
//    public static final int FILE_SIZE_MAX = 1024 * 1024 * 5;
    public static final int FILE_SIZE_MAX = 1024 * 1024 * 3; // GINV-L017 CHG

    /**
     * Packing-material registration number maximum (upper limit)
     * <br />包装材登録件数最大値(上限値)
     */
    public static final int MAX_PKG_ITEM_COUNT = 2000;

    /**
     * The Otherd file maximum registration number (10 affairs)
     * <br />Otherdファイル最大登録件数（10件）
     */
    public static final int MAX_OTHERS_FILE = 10;


    /**
     * 1 page-record number maximum (20 affairs: for WB003)
     * <br />1ページレコード件数最大値 (20件：WB003用)
     */
    public static final int PAGE_MAX_COUNT_FOR_WB003 = 20;

    /*****************************************************************************
     * LANGUAGE CODE
     * <br />言語コード
     *****************************************************************************/

    /**
     * LANGUAGE CODE (Japanese)
     * <br />言語コード (日本語)
     */
    public static final String LANGUAGE_CD_JAPANESE = "ja";

    /**
     * LANGUAGE CODE (English)
     * <br />言語コード (英語)
     */
    public static final String LANGUAGE_CD_ENGLISH = "en";


    /*****************************************************************************
     * CD TYPE
     * <br />コード種別
     *****************************************************************************/

    /**
     * CD TYPE (flag)
     * <br />コード種別 (フラグ)
     */
    public static final String CD_TYPE_FLAG = "7";

    /**
     * CD TYPE (Status)
     * <br />コード種別 (Status)
     */
    public static final String CD_TYPE_STATUS = "9";

    /**
     * CD TYPE (Transport)
     * <br />コード種別 (輸送手段)
     */
    public static final String CD_TYPE_TRANS_CD = "12";

    /**
     * CD TYPE (Invoice classification)
     * <br />コード種別（インボイス種別）
     */
    public static final String CD_TYPE_INV_CTGRY = "13";

    /**
     * CD TYPE (Item Type)
     * <br />コード種別（インボイス種別）
     */
    public static final String CD_TYPE_ITEM_TYPE = "14";

    /**
     * CD TYPE (PRICE TERMS)
     * <br />コード種別 (建値区分)
     */
    public static final String CD_TYPE_PRICE_TERMS = "15";

    /**
     * CD TYPE (TRADE TERMS)
     * <br />コード種別 (建値区分)
     */
    public static final String CD_TYPE_TRADE_TERMS = "16";

    /**
     * CD TYPE (MixTag Status)
     * <br />コード種別 (MixTagステータス)
     */
    public static final String CD_TYPE_MIX_TAG_STATUS = "20";

    /**
     * CD TYPE (Loading CD)
     * <br />コード種別 (Loading CD)
     */
    public static final String CD_TYPE_LOADING_CD = "29";

    /**
     * CD TYPE (CUSTOM TIMING TYPE)
     * <br />コード種別（通関タイミング区分）
     */
    public static final String CD_TYPE_CC_TYPE = "34";

    /**
     * CD TYPE (CONTAINER LOOSE TYPE)
     * <br />コード種別（コンテナルーズ区分）
     */
    public static final String CD_TYPE_CONTAINER_LOOSE = "35";

    /**
     * CD TYPE (Progress-Control Status)
     * <br />コード種別 (進度管理ステータス)
     */
    public static final String CD_TYPE_PROGRESS_CONTROL_STATUS = "37";

    /**
     * CD TYPE (CML TYPE)
     * <br />コード種別（ケースマーク区分）
     */
    public static final String CD_TYPE_CML_TYPE = "39";

    /**
     * CD TYPE (PALLETIZE INSTRUCTION STATUS)
     * <br />コード種別 (梱包指示ステータス)
     */
    public static final String CD_TYPE_SHIPPING_ACT_STATUS = "41";

    /**
     * CD TYPE (PALLETIZE INSTRUCTION STATUS)
     * <br />コード種別 (梱包指示ステータス)
     */
    public static final String CD_TYPE_PLTZ_INSTR_STATUS = "44";

    /**
     * CD TYPE (factory W/H classification)
     * <br />コード種別 (工場倉庫区分)
     */
    public static final String CD_TYPE_PLNT_AND_WH = "48";

    /**
     * CD TYPE (registrant)
     * <br />コード種別 (登録者)
     */
    public static final String CD_TYPE_ISSUER = "49";

    /**
     * CD TYPE (Invoice PACKAGE CATEGORY)
     * <br />コード種別 (Invoice種類)
     */
    public static final String CD_TYPE_TYPE_OF_INVOICE = "50";

    /**
     * CD TYPE (Invoice classification)
     * <br />コード種別 (Invoice分類)
     */
    public static final String CD_CLASS_OF_INVOICE = "51";

    /**
     * CD TYPE (Payment Method/PAYMENT METHOD)
     * <br />コード種別 (Payment Method/支払方法)
     */
    public static final String CD_TYPE_PAY_METH = "52";

    /**
     * CD TYPE (Freight Res. Cd)
     * <br />コード種別 (運賃支払いコード)
     */
    public static final String CD_TYPE_FREIGHT_RESPONSIBLE = "54";

    /**
     * CD TYPE (additional charge classification)
     * <br />コード種別 (追加費用区分)
     */
    public static final String CD_TYPE_ADDITIONAL_CHARGE = "55";

    /**
     * CD TYPE (the input method)
     * <br />コード種別 (入力方法)
     */
    public static final String CD_TYPE_INPUT_METH_TYP = "61";

    /**
     * CD TYPE (sorting)
     * <br />コード種別 (ソート)
     */
    public static final String CD_TYPE_SORT = "62";

    /**
     * CD TYPE (entry-papers condition class)
     * <br />コード種別 (通関書類状態区分)
     */
    public static final String CD_TYPE_DOCUMENT_TYPE = "63";
    /**
     * CD TYPE (function)
     * <br />コード種別 (機能)
     */
    public static final String CD_TYPE_FUNCTION = "64";

    /**
     * CD TYPE (language)
     * <br />コード種別 (言語)
     */
    public static final String CD_TYPE_LANG = "65";

    /**
     * CD TYPE (character code)
     * <br />コード種別 (文字コード)
     */
    public static final String CD_TYPE_CHAR_CD = "66";

    /**
     * CD TYPE (By)
     * <br />コード種別 (By)
     */
    public static final String CD_TYPE_BY = "68";

    /**
     * CD TYPE (PACKAGE FORM TYPE)
     * <br />コード種別 (梱包形態)
     */
    public static final String CD_TYPE_PKG_FORM_TYP = "69";

    /**
     * CD TYPE (PACKAGE TYPE)
     * <br />コード種別 (包装材種別)
     */
    public static final String CD_TYPE_PKG_TYP = "70";


    /**
     * CD TYPE (CUSTOM TIMING TYPE)
     * <br />コード種別 (通関タイミング区分)
     */
    public static final String CD_TYPE_CUSTOM_TIMING_TYP = "34";

    /**
     * CD TYPE (STAGING INSTRUCTION STATUS)
     * <br />コード種別 (荷揃え指示ステータス)
     */
    public static final String CD_TYPE_STG_INSTR_STATUS = "28";

    /**
     * CD TYPE <(SHIPPING CONFIRM STATUS)
     * <br />コード種別 (出荷確認ステータス)
     */
    public static final String CD_TYPE_SHIPPING_FIRM_STATUS = "32";

    /**
     * CD TYPE (track record person)
     * <br />コード種別 (実績者)
     */
    public static final String CD_TYPE_WORKER = "49";

    /**
     * CD TYPE (flag)
     * <br />コード種別 (フラグ)
     */
    public static final String CD_TYPE_FLG = "7";

    /**
     * CD TYPE (WEIGHT UNIT)
     * <br />コード種別 (重量単位)
     */
    public static final String CD_TYPE_WEIGHT_UNIT = "75";

    /**
     * CD TYPE (Display)
     * <br />コード種別 (表示区分)
     */
    public static final String CD_TYPE_DISPLAY = "76";

    /**
     * CD TYPE (Pallet/Carton Type)
     * <br />コード種別 (パレット・カートン区分)
     * UT420 ADD
     */
    public static final String CD_TYPE_PALLET_CARTON_TYP = "77";

    /*****************************************************************************
     * Code value (CML TYPE)
     * <br />コード値 (ケースマーク区分)
     *****************************************************************************/
    /**
     * CML TYPE (CIGMA)
     * <br />ケースマーク区分 (CIGMA)
     */
    public static final String CML_TYPE_CIGMA = "1";

    /**
     * CML TYPE (ERT)
     * <br />ケースマーク区分 (ERT)
     */
    public static final String CML_TYPE_ERT = "2";

    /**
     * CML TYPE (Miscellaneous)
     * <br />ケースマーク区分 (Miscellaneous)
     */
    public static final String CML_TYPE_MISCELLANEOUS = "3";

    /*****************************************************************************
     * Code value (INFORMATION TYPE)
     * <br />コード値 (お知らせ区分)
     *****************************************************************************/

    /**
     * INFORMATION TYPE (system connection)
     * <br />お知らせ区分 (システム連絡)
     */
    public static final String INFO_TYP_SYSTEM = "1";

    /**
     * INFORMATION TYPE (connection for business)
     * <br />お知らせ区分 (業務連絡)
     */
    public static final String INFO_TYP_BUSINESS = "2";

    /*****************************************************************************
     * Code value (Agent-Company request function)
     * <br />コード値 (代行会社依頼機能)
     *****************************************************************************/

    /**
     * Agent-Company request function (BHT lock release)
     * <br />代行会社依頼機能 (BHTロック解除)
     */
    public static final String FUNC_BHT_UNLOCK = "1";

    /**
     * Agent-Company request function (master (others))
     * <br />代行会社依頼機能 (マスタ(他))
     */
    public static final String FUNC_MASTER_OTHERS = "2";

    /**
     * Agent-Company request function (document preparing)
     * <br />代行会社依頼機能 (書類作成)
     */
    public static final String FUNC_DOCUMENTATION = "3";

    /**
     * Agent-Company request function (Shipping Actuality)
     * <br />代行会社依頼機能 (船積実績)
     */
    public static final String FUNC_SHIPPING_ACTUALITY = "4";

    /**
     * Agent-Company request function (Export Request)
     * <br />代行会社依頼機能 (輸出依頼)
     */
    public static final String FUNC_EXPORT_REQUEST = "5";

    /**
     * Agent-Company request function (Export-Request PKG)
     * <br />代行会社依頼機能 (輸出依頼梱包)
     */
    public static final String FUNC_EXPORT_REQUEST_PKG = "6";

    /**
     * Agent-Company request function (Returned box)
     * <br />代行会社依頼機能 (返却通箱)
     */
    public static final String FUNC_EMPTY_RETURNABLE = "7";

    /**
     * Agent-Company request function (order received)
     * <br />代行会社依頼機能 (受注)
     */
    public static final String FUNC_ORDER_RECEIVE = "8";

    /**
     * Agent-Company request function (Packaging Instruction (=Pull))
     * <br />代行会社依頼機能 (梱包指示)
     */
    public static final String FUNC_PALLETIZE_INSTRUCTION = "9";

    /**
     * Agent-Company request function (M-TAG)
     * <br />代行会社依頼機能 (M-TAG)
     */
    public static final String FUNC_M_TAG = "10";

    /**
     * Agent-Company request function (CML)
     * <br />代行会社依頼機能 (CML)
     */
    public static final String FUNC_CML = "11";

    /**
     * Agent-Company request function (X-TAG)
     * <br />代行会社依頼機能 (X-TAG)
     */
    public static final String FUNC_X_TAG = "12";

    /**
     * Agent-Company request function (donation ON)
     * <br />代行会社依頼機能 (拠出入)
     */
    public static final String FUNC_CARRY_OUT_IN = "13";

    /**
     * Agent-Company request function (staging instruction)
     * <br />代行会社依頼機能 (荷揃え指示)
     */
    public static final String FUNC_STAGING_INSTRUCTION = "14";

    /**
     * Agent-Company request function (Staging Actuality)
     * <br />代行会社依頼機能 (山作り実績)
     */
    public static final String FUNC_STAGING_ACTUALITY = "15";

    /**
     * Agent-Company request function (Shipping Confirm.)
     * <br />代行会社依頼機能 (出荷確認)
     */
    public static final String FUNC_SHIPMENT_CONFIRMATION = "16";

    /**
     * Agent-Company request function (progress check)
     * <br />代行会社依頼機能 (進度確認)
     */
    public static final String FUNC_PROGRESS_CONTROL = "17";
    /**
     * FUNCTION PACKING STATUS
     * 
     */
    public static final String FUNC_PACKING_STATUS = "18";

    /*****************************************************************************
     * Code value (PALLETIZE INSTRUCTION STATUS)
     * <br />コード値 (梱包指示ステータス)
     *****************************************************************************/

    /**
     * PALLETIZE INSTRUCTION STATUS (Instruction Created)
     * <br />梱包指示ステータス (Instruction Created)
     */
    public static final String PLTZ_INSTR_STATUS_INSTRUCTION_CREATED = "10";

    /**
     * PALLETIZE INSTRUCTION STATUS (Instruction Print Out)
     * <br />梱包指示ステータス (Instruction Print Out)
     */
    public static final String PLTZ_INSTR_STATUS_INSTRUCTION_PRINT_OUT = "20";

    /**
     * PALLETIZE INSTRUCTION STATUS (In process of CML Create)
     * <br />梱包指示ステータス (In process of CML Create)
     */
    public static final String PLTZ_INSTR_STATUS_IN_PROCSS_OF_CML_CREATE = "30";

    /**
     * PALLETIZE INSTRUCTION STATUS (ALL CML Create)
     * <br />梱包指示ステータス (ALL CML Create)
     */
    public static final String PLTZ_INSTR_STATUS_ALL_CML_CREATE = "40";

    /**
     * PALLETIZE INSTRUCTION STATUS (All CML Print out)
     * <br />梱包指示ステータス (All CML Print out)
     */
    public static final String PLTZ_INSTR_STATUS_ALL_CML_PRINT_OUT = "50";

    /*****************************************************************************
     * Code value (ISSUER_ID)
     * <br />コード値 (ISSUER_ID)
     *****************************************************************************/

    public static final String ISSUER_ID_YOURSELF = "1";

    /*****************************************************************************
     * Code value (Palletize Status)
     * <br />コード値 (パレタイズステータス)
     *****************************************************************************/
    /**
     * Palletize Status (Palletize)
     * <br />パレタイズステータス (パレタイズ)
     */
    public static final String PLTZ_STATUS_PLTZ = "10";

    /**
     * Palletize Status (staging instruction)
     * <br />パレタイズステータス(荷揃え指示)
     */
    public static final String PLTZ_STATUS_STG_INSTR = "20";

    /**
     * Palletize Status (staging result)
     * <br />パレタイズステータス(荷揃え実績)
     */
    public static final String PLTZ_STATUS_STG_INSTR_WORKED_DONE = "30";

    /**
     * Palletize Status (customs clearance (C/C TYPE: Z))
     * <br />パレタイズステータス(通関(通関タイプ：Z))
     */
    public static final String PLTZ_STATUS_CUSTOMS_CLEARANCE_Z = "40";

    /**
     * Palletize Status (Staging Actuality)
     * <br />パレタイズステータス(山作り実績)
     */
    public static final String PLTZ_STATUS_STG_ACT = "50";

    /**
     * Palletize Status (customs clearance (C/C TYPE: B))
     * <br />パレタイズステータス(通関(通関タイプ：B))
     */
    public static final String PLTZ_STATUS_CUSTOMS_CLEARANCE_B = "60";

    /**
     * Palletize Status (shipping instruction)
     * <br />パレタイズステータス(出荷指示)
     */
    public static final String PLTZ_STATUS_SHIPPING_COMFIRMATION = "70";

    /**
     * Palletize Status (shipment track record)
     * <br />パレタイズステータス(出荷実績)
     */
    public static final String PLTZ_STATUS_SHIPPING_COMFIRMATION_ACTUAL = "80";

    /**
     * Palletize Status (customs clearance (C/C TYPE: A))
     * <br />パレタイズステータス(通関(通関タイプ：A))
     */
    public static final String PLTZ_STATUS_CUSTOMS_CLEARANCE_A = "90";

    /*****************************************************************************
     * Code value (Exp Request Status)
     *****************************************************************************/
    /**
     * Status : Has not completed request
     */
    public static final String NOT_COMPLETED = "10";

    /**
     * Status : Has not print approval equest
     */
    public static final String NOT_PRINT_APPROVAL = "20";

    /**
     * Status : Has not received packing Dep
     */
    public static final String NOT_RECEIVED_PACKING = "30";

    /**
     * Status : Has not Packed
     */
    public static final String NOT_PACKED_EXP = "40";

    /**
     * Status : In progress of PKG
     */
    public static final String PROGRESS_PKG = "50";

    /**
     * Status : Issue all CML
     */
    public static final String ISSUE_CML = "60";

    /**
     * Status : Cancel
     */
    public static final String CANCEL = "90";

    /*****************************************************************************
     * Code value (LAST TR STATUS)
     * <br />コード値 (最終搬出入ステータス)
     *****************************************************************************/
    /**
     * LAST TR STATUS (Blank)
     * <br />最終搬出入ステータス (Blank)
     */
    public static final String CARRY_OUT_IN_BLANK = "10";

    /**
     * LAST TR STATUS (Issue TR)
     * <br />最終搬出入ステータス (Issue TR)
     */
    public static final String CARRY_OUT_IN_ISSUE_TR = "20";

    /**
     * LAST TR STATUS (Activate TR)
     * <br />最終搬出入ステータス (Activate TR)
     */
    public static final String CARRY_OUT_IN_ACTIVATE_TR = "30";

    /**
     * LAST TR STATUS (Received at To)
     * <br />最終搬出入ステータス (Received at To)
     */
    public static final String CARRY_OUT_IN_RECEIVED_AT_TO = "40";

    /*****************************************************************************
     * Code value (SHIPPING CONFIRM STATUS)
     * <br />コード値 (出荷確認ステータス)
     *****************************************************************************/

    /**
     * SHIPPING CONFIRM STATUS (Shipping Confirm.)
     * <br />出荷確認ステータス(出荷確認)
     */
    public static final String SHIPPING_FIRM_STATUS_ISSUE_LIST = "10";

    /**
     * SHIPPING CONFIRM STATUS (shipment track record)
     * <br />出荷確認ステータス(出荷実績)
     */
    public static final String SHIPPING_FIRM_STATUS_WORKED_DONE = "20";

    /*****************************************************************************
     * Code value (SHIPPING ACTUALITY STATUS)
     * <br />コード値 (船積実績ステータス)
     *****************************************************************************/
    /**
     * SHIPPING ACTUALITY STATUS (Imcomplete Doc Attach)
     * <br />船積実績ステータス（Imcomplete Doc Attach）
     */
    public static final String SHIPPING_ACT_STATUS_IMCOMPLETE_DOC_ATTACH = "10";

    /**
     * SHIPPING ACTUALITY STATUS (Complete Doc attach)
     * <br />船積実績ステータス（Complete Doc attach）
     */
    public static final String SHIPPING_ACT_STATUS_COMPLETE_DOC_ATTACH = "20";

    /*****************************************************************************
     * Code value (PackingStatus)
     * <br />コード値 (荷積位置コード)
     *****************************************************************************/
    /**
     * PackingStatus : NOT_RECEIVED
     */
    public static final String NOT_RECEIVED = "10";
    /**
     * PackingStatus : NOT_PACKED
     */
    public static final String NOT_PACKED = "20";
    /**
     * PackingStatus : CASEMARK
     */
    public static final String CASEMARK = "30";
    
    /*****************************************************************************
     * Code value (L/D CD)
     * <br />コード値 (荷積位置コード)
     *****************************************************************************/

    /**
     * L/D CD (Free)
     * <br />荷積位置コード (Free)
     */
    public static final String LOADING_CD_FREE = "F";

    /**
     * L/D CD (Door)
     * <br />荷積位置コード (Door)
     */
    public static final String LOADING_CD_DOOR = "D";

    /**
     * L/D CD (Back)
     * <br />荷積位置コード (Back)
     */
    public static final String LOADING_CD_BACK = "B";

    /*****************************************************************************
     * Code value (CONTAINER LOOSE TYPE)
     * <br />コード値 (コンテナルーズ区分)
     *****************************************************************************/

    /**
     * CONTAINER LOOSE TYPE (L)
     * <br />コンテナルーズ区分(L)
     */
    public static final String CONTAINER_LOOSE_TYP_LOOSE = "L";

    /**
     * CONTAINER LOOSE TYPE (C)
     * <br />コンテナルーズ区分(C)
     */
    public static final String CONTAINER_LOOSE_TYP_FULL_CONTAINER = "C";

    /*****************************************************************************
     * Code value (CUSTOM TIMING TYPE)
     * <br />コード値 (通関タイミング区分)
     *****************************************************************************/

    /**
     * CUSTOM TIMING TYPE (customs clearance after a container loading)
     * <br />通関タイミング区分(バン詰め後通関)
     */
    public static final String AFTER_VANNING = "A";

    /**
     * CUSTOM TIMING TYPE (eye a loading to container after customs clearance)
     * <br />通関タイミング区分(通関後バン詰め)
     */
    public static final String BEFORE_VANNING = "B";

    /**
     * CUSTOM TIMING TYPE (mixture)
     * <br />通関タイミング区分(混合)
     */
    public static final String BOTH_VANNING = "Z";

    /*****************************************************************************
     * Code value (WORKED METHOD TYPE)
     * <br />コード値 (出荷実績手段区分)
     *****************************************************************************/

    /**
     * WORKED METHOD TYPE (written directive unit)
     * <br />出荷実績手段区分(指示書単位)
     */
    public static final String WORKED_METH_TYP_INSTR = "1";

    /**
     * WORKED METHOD TYPE (CML unit)
     * <br />出荷実績手段区分(CML単位)
     */
    public static final String WORKED_METH_TYP_TAGS = "2";

    /*****************************************************************************
     * Code value (RT TYPE)
     * <br />コード値 (再使用区分)
     *****************************************************************************/

    /**
     * RT TYPE (1 way Material)
     * <br />再使用区分 (1 way Material)
     */
    public static final String RT_TYP_1WAY = "1";

    /**
     * RT TYPE (Domestic)
     * <br />再使用区分 (国内)
     */
    public static final String RT_TYP_DOMESTIC = "2";

    /**
     * RT TYPE (Global)
     * <br />再使用区分 (海外)
     */
    public static final String RT_TYP_GLOBAL = "3";

    /*****************************************************************************
     * Code value (PKG Form TYPE)
     * <br />コード値 (梱包形態区分)
     *****************************************************************************/

    /**
     * PKG Form TYPE (Multi)
     * <br />梱包形態区分 (Multi)
     */
    public static final String PKG_FORM_TYP_MULTI = "M";

    /**
     * PKG Form TYPE (Single)
     * <br />梱包形態区分 (Single)
     */
    public static final String PKG_FORM_TYP_SINGLE = "S";

    /**
     * PKG Form TYPE (Manual Registration)
     * <br />梱包形態区分 (Manual Registration)
     * UT110 TRIAL SHIPMENT/号試品対応 ADD
     */
    public static final String PKG_FORM_TYP_MANUAL_REG = "H";

    /*****************************************************************************
     * Code value (PACKAGE TYPE)
     * <br />コード値 (包装材種別)
     *****************************************************************************/

    /**
     * PKG Form TYPE (article watch)
     * <br />梱包形態区分 (品番)
     */
    public static final String PKG_TYP_ITEM_NO = null;

    /**
     * PKG Form TYPE (Dunnage)
     * <br />梱包形態区分 (内材)
     */
    public static final String PKG_TYP_INNER = "1";

    /**
     * PKG Form TYPE (imported wood)
     * <br />梱包形態区分 (外材)
     */
    public static final String PKG_TYP_OUTER = "2";
    /**
     * PKG Form TYPE (dummy)
     * <br />梱包形態区分 (ダミー)
     */
    public static final String PKG_TYP_DUMMY = "3";
    /**
     * PKG Form TYPE (at the time of a recommendation packing style)
     * <br />梱包形態区分 (推奨荷姿の時)
     */
    public static final String PKG_TYP_ERT = "4";

    /*****************************************************************************
     * Code value (MULTI ITEM NO IN BOX STATUS)
     * <br />コード値 (小箱内多品ステータス)
     *****************************************************************************/

    /**
     * MULTI ITEM NO IN BOX STATUS (Issue Mix Tag)
     * <br />小箱内多品ステータス (Issue Mix Tag)
     */
    public static final String MIX_TAG_STATUS_MIXTAG = "10";

    /**
     * MULTI ITEM NO IN BOX STATUS (Issue CML)
     * <br />小箱内多品ステータス (Issue CML)
     */
    public static final String MIX_TAG_STATUS_CML = "20";

    /*****************************************************************************
     * Code value (STAGING INSTRUCTION STATUS)
     * <br />コード値 (荷揃え指示ステータス)
     *****************************************************************************/
    /**
     * STAGING INSTRUCTION STATUS (Issue List)
     * <br />荷揃え指示ステータス (Issue List)
     */
    public static final String STG_INSTR_STATUS_ISSUE_LIST = "10";

    /**
     * STAGING INSTRUCTION STATUS (Worked done)
     * <br />荷揃え指示ステータス (Worked done)
     */
    public static final String STG_INSTR_STATUS_WORKED_DONE = "20";

    /*****************************************************************************
     * Code value (TRANSPORT CODE)
     * <br />コード値 (輸送手段コード)
     *****************************************************************************/

    /**
     * TRANSPORT CODE : A
     * <br />輸送手段コード：A
     */
    public static final String TRNS_CD_AIR = "A";
    
    /**
     * TRANSPORT CODE : T
     * <br />輸送手段コード：T
     */
    public static final String TRNS_CD_TRUCK = "T";

    /*****************************************************************************
     * Code value (ITEM TYPE)
     * <br />コード値 (品目区分)
     *****************************************************************************/

    /**
     * ITEM TYPE (Parts)
     * <br />品目区分 (Parts)
     */
    public static final String ITEM_TYP_PARTS = "1";

    /**
     * ITEM TYPE (Materials)
     * <br />品目区分 (Materials)
     */
    public static final String ITEM_TYP_MATERIALS = "2";

    /**
     * ITEM TYPE (PKG Materials)
     * <br />品目区分 (PKG Materials)
     */
    public static final String ITEM_TYP_PKG_MATERIALS = "3";

    /**
     * ITEM TYPE (Equipment)
     * <br />品目区分 (Equipment)
     */
    public static final String ITEM_TYP_EQUIPMENT = "4";

    /**
     * ITEM TYPE (Other)
     * <br />品目区分 (Other)
     */
    public static final String ITEM_TYP_OTHER = "9";

    /*****************************************************************************
     * Code value (INVOICE CATEGORY)
     * <br />コード値 (請求分類)
     *****************************************************************************/

    /**
     * INVOICE CATEGORY (Commercial value) : three
     * <br />請求分類（Commercial value）：3
     */
    public static final String IVN_CATEGORY_COMMERCIAL_VALUE = "C";

    /*****************************************************************************
     * Code value (WORK TYPE)
     * <br />コード値 (作業区分)
     *****************************************************************************/

    /**
     * WORK TYPE (CML (CIGMA)) : A
     * <br />作業区分（CML(CIGMA)）：A
     */
    public static final String WORK_TYP_CML_CIGMA = "A";

    /**
     * WORK TYPE (MIX TAG (CIGMA)) : B
     * <br />作業区分（MIX TAG(CIGMA)）：B
     */
    public static final String WORK_TYP_MIX_TAG_CIGMA = "B";

    /*****************************************************************************
     * SHIPPED TYPE
     * <br />出荷済み区分
     *****************************************************************************/

    /**
     * SHIPPED TYPE (at the time of an order create)
     * <br />出荷済み区分 (オーダー作成時)
     */
    public static final String SHIPPED_TYP_ORDER_CREATED = "1";

    /**
     * SHIPPED TYPE (finishing of a PKG)
     * <br />出荷済み区分 (梱包済み)
     */
    public static final String SHIPPED_TYP_PACKED = "2";

    /**
     * SHIPPED TYPE (finishing of shipment)
     * <br />出荷済み区分 (出荷済み)
     */
    public static final String SHIPPED_TYP_SHIPPED = "3";

    /*****************************************************************************
     * MAIN-MARK classification
     * <br />メインマーク種別
     *****************************************************************************/

    /**
     * <br />Main mark type (Main mark)
     * <br />メインマーク種別 (メインマーク)
     */
    public static final String MAIN_MARK_TYP_MAIN_MARK = "1";

    /**
     * <br />Main mark type (X-Main mark)
     * <br />メインマーク種別 (まとめメインマーク)
     */
    public static final String MAIN_MARK_TYP_XMAIN_MARK = "2";

    /*****************************************************************************
     * Operation pattern
     * <br />演算パターン
     *****************************************************************************/

    /**
     * Operation pattern (upvaluation)
     * <br />演算パターン (切り上げ)
     */
    public static final String ROUND_PATTERN_ROUND_UP = "U";

    /**
     * Operation pattern (omission)
     * <br />演算パターン (切り捨て)
     */
    public static final String ROUND_PATTERN_ROUND_DOWN = "D";

    /**
     * Operation pattern (rounding off)
     * <br />演算パターン (四捨五入)
     */
    public static final String ROUND_PATTERN_ROUND_OFF = "O";

    /*****************************************************************************
     * Window ID
     * <br />ウィンドウID
     *****************************************************************************/

    public static final String WINDOW_ID_0 = "eca0027_gscmwin0";

    /*****************************************************************************
     * SCREEN ID
     *****************************************************************************/

    /**
     * SCREEN ID (W0001)
     */
    public static final String SCREEN_ID_W0001 = "W0001";
    /**
     * SCREEN ID (W0002)
     */
    public static final String SCREEN_ID_W0002 = "W0002";
    /**
     * SCREEN ID (W0501)
     */
    public static final String SCREEN_ID_W0501 = "W0501";
    /**
     * SCREEN ID (W0502)
     */
    public static final String SCREEN_ID_W0502 = "W0502";
    /**
     * SCREEN ID (W0503)
     */
    public static final String SCREEN_ID_W0503 = "W0503";
    /**
     * SCREEN ID (W1001)
     */
    public static final String SCREEN_ID_W1001 = "W1001";
    /**
     * SCREEN ID (W1002)
     */
    public static final String SCREEN_ID_W1002 = "W1002";
    /**
     * SCREEN ID (W1003)
     */
    public static final String SCREEN_ID_W1003 = "W1003";
    /**
     * SCREEN ID (W1004)
     */
    public static final String SCREEN_ID_W1004 = "W1004";
    /**
     * SCREEN ID (W1005)
     */
    public static final String SCREEN_ID_W1005 = "W1005";
    /**
     * SCREEN ID (W1006)
     */
    public static final String SCREEN_ID_W1006 = "W1006";
    /**
     * SCREEN ID (W1007)
     */
    public static final String SCREEN_ID_W1007 = "W1007";
    /**
     * SCREEN ID (W1008)
     */
    public static final String SCREEN_ID_W1008 = "W1008";
    /**
     * SCREEN ID (W1009)
     */
    public static final String SCREEN_ID_W1009 = "W1009";

    /**
     * SCREEN ID (W1010)
     */
    public static final String SCREEN_ID_W1010 = "W1010";

    /**
     * SCREEN ID (W2001)
     */
    public static final String SCREEN_ID_W2001 = "W2001";
    /**
     * SCREEN ID (W2002)
     */
    public static final String SCREEN_ID_W2002 = "W2002";
    /**
     * SCREEN ID (W2003)
     */
    public static final String SCREEN_ID_W2003 = "W2003";
    /**
     * SCREEN ID (W2004)
     */
    public static final String SCREEN_ID_W2004 = "W2004";
    /**
     * SCREEN ID (W2005)
     */
    public static final String SCREEN_ID_W2005 = "W2005";
    /**
     * SCREEN ID (W2006)
     */
    public static final String SCREEN_ID_W2006 = "W2006";
    /**
     * SCREEN ID (W2007)
     */
    public static final String SCREEN_ID_W2007 = "W2007";
    /**
     * SCREEN ID (W2008)
     */
    public static final String SCREEN_ID_W2008 = "W2008";
    /**
     * SCREEN ID (W2009)
     */
    public static final String SCREEN_ID_W2009 = "W2009";
    /**
     * SCREEN ID (W2010)
     */
    public static final String SCREEN_ID_W2010 = "W2010";
    /**
     * SCREEN ID (W2011)
     */
    public static final String SCREEN_ID_W2011 = "W2011";
    /**
     * SCREEN ID (W2012)
     */
    public static final String SCREEN_ID_W2012 = "W2012";
    /**
     * SCREEN ID (W2013)
     */
    public static final String SCREEN_ID_W2013 = "W2013";
    /**
     * SCREEN ID (W2014)
     */
    public static final String SCREEN_ID_W2014 = "W2014";
    /**
     * SCREEN ID (W2015)
     */
    public static final String SCREEN_ID_W2015 = "W2015";
    /**
     * SCREEN ID (W2016)
     */
    public static final String SCREEN_ID_W2016 = "W2016";
    /**
     * SCREEN ID (W2017)
     */
    public static final String SCREEN_ID_W2017 = "W2017";
    /**
     * SCREEN ID (W2018)
     */
    public static final String SCREEN_ID_W2018 = "W2018";
    /**
     * SCREEN ID (W2019)
     */
    public static final String SCREEN_ID_W2019 = "W2019";
    /**
     * SCREEN ID (W2020)
     * UT304 MULTI LABEL ADD
     */
    public static final String SCREEN_ID_W2020 = "W2020";
    /**
     * SCREEN ID (W2501)
     */
    public static final String SCREEN_ID_W2501 = "W2501";
    /**
     * SCREEN ID (W2502)
     */
    public static final String SCREEN_ID_W2502 = "W2502";
    /**
     * SCREEN ID (W2503)
     */
    public static final String SCREEN_ID_W2503 = "W2503";
    /**
     * SCREEN ID (W2504)
     */
    public static final String SCREEN_ID_W2504 = "W2504";
    /**
     * SCREEN ID (W2505)
     */
    public static final String SCREEN_ID_W2505 = "W2505";
    /**
     * SCREEN ID (W2506)
     */
    public static final String SCREEN_ID_W2506 = "W2506";
    /**
     * SCREEN ID (W2507)
     */
    public static final String SCREEN_ID_W2507 = "W2507";
    /**
     * SCREEN ID (W2508)
     */
    public static final String SCREEN_ID_W2508 = "W2508";
    /**
     * SCREEN ID (W2509)
     */
    public static final String SCREEN_ID_W2509 = "W2509";
    /**
     * SCREEN ID (W2510)
     */
    public static final String SCREEN_ID_W2510 = "W2510";
    /**
     * SCREEN ID (W2511)
     */
    public static final String SCREEN_ID_W2511 = "W2511";
    /**
     * SCREEN ID (W2512)
     */
    public static final String SCREEN_ID_W2512 = "W2512";
    /**
     * SCREEN ID (W2513)
     */
    public static final String SCREEN_ID_W2513 = "W2513";
    /**
     * SCREEN ID (W2514)
     */
    public static final String SCREEN_ID_W2514 = "W2514";
    /**
     * SCREEN ID (W2515)
     */
    public static final String SCREEN_ID_W2515 = "W2515";
    /**
     * SCREEN ID (W2516)
     */
    public static final String SCREEN_ID_W2516 = "W2516";
    /**
     * SCREEN ID (W2517)
     */
    public static final String SCREEN_ID_W2517 = "W2517";
    /**
     * SCREEN ID (W2518)
     */
    public static final String SCREEN_ID_W2518 = "W2518";
    /**
     * SCREEN ID (W2519)
     */
    public static final String SCREEN_ID_W2519 = "W2519";
    /**
     * SCREEN ID (W2520)
     */
    public static final String SCREEN_ID_W2520 = "W2520";
    /**
     * SCREEN ID (W2521)
     */
    public static final String SCREEN_ID_W2521 = "W2521";
    /**
     * SCREEN ID (W3001)
     */
    public static final String SCREEN_ID_W3001 = "W3001";
    /**
     * SCREEN ID (W3002)
     */
    public static final String SCREEN_ID_W3002 = "W3002";
    /**
     * SCREEN ID (W3003)
     */
    public static final String SCREEN_ID_W3003 = "W3003";
    /**
     * SCREEN ID (W3004)
     */
    public static final String SCREEN_ID_W3004 = "W3004";
    /**
     * SCREEN ID (W3005)
     */
    public static final String SCREEN_ID_W3005 = "W3005";
    /**
     * SCREEN ID (W3006)
     */
    public static final String SCREEN_ID_W3006 = "W3006";
    /**
     * SCREEN ID (W3007)
     */
    public static final String SCREEN_ID_W3007 = "W3007";
    /**
     * SCREEN ID (W3008)
     */
    public static final String SCREEN_ID_W3008 = "W3008";
    /**
     * 画面ID (W3009)
     */
    public static final String SCREEN_ID_W3009 = "W3009";
    /**
     * SCREEN ID (W3010)
     */
    public static final String SCREEN_ID_W3010 = "W3010";
    /**
     * SCREEN ID (W3011)
     */
    public static final String SCREEN_ID_W3011 = "W3011";
    /**
     * SCREEN ID (W3012)
     */
    public static final String SCREEN_ID_W3012 = "W3012";
    /**
     * SCREEN ID (W3501)
     */
    public static final String SCREEN_ID_W3501 = "W3501";
    /**
     * SCREEN ID (W3502)
     */
    public static final String SCREEN_ID_W3502 = "W3502";
    /**
     * SCREEN ID (W3503)
     */
    public static final String SCREEN_ID_W3503 = "W3503";
    /**
     * SCREEN ID (W3504)
     */
    public static final String SCREEN_ID_W3504 = "W3504";
    /**
     * SCREEN ID (W3505)
     */
    public static final String SCREEN_ID_W3505 = "W3505";
    /**
     * SCREEN ID (W3506)
     */
    public static final String SCREEN_ID_W3506 = "W3506";
    /**
     * SCREEN ID (W3507)
     */
    public static final String SCREEN_ID_W3507 = "W3507";
    /**
     * SCREEN ID (W3508)
     */
    public static final String SCREEN_ID_W3508 = "W3508";
    /**
     * SCREEN ID (W3509)
     */
    public static final String SCREEN_ID_W3509 = "W3509";
    /**
     * SCREEN ID (W3510)
     */
    public static final String SCREEN_ID_W3510 = "W3510";
    /**
     * SCREEN ID (W3511)
     */
    public static final String SCREEN_ID_W3511 = "W3511";
    /**
     * SCREEN ID (W3512)
     */
    public static final String SCREEN_ID_W3512 = "W3512";
    /**
     * SCREEN ID (W3513)
     */
    public static final String SCREEN_ID_W3513 = "W3513";
    /**
     * SCREEN ID (W3514)
     */
    public static final String SCREEN_ID_W3514 = "W3514";
    /**
     * SCREEN ID (W4001)
     */
    public static final String SCREEN_ID_W4001 = "W4001";
    /**
     * SCREEN ID (W4002)
     */
    public static final String SCREEN_ID_W4002 = "W4002";
    /**
     * SCREEN ID (W4003)
     */
    public static final String SCREEN_ID_W4003 = "W4003";
    /**
     * SCREEN ID (W4004)
     */
    public static final String SCREEN_ID_W4004 = "W4004";
    /**
     * SCREEN ID (W4005)
     */
    public static final String SCREEN_ID_W4005 = "W4005";
    /**
     * SCREEN ID (W4006)
     */
    public static final String SCREEN_ID_W4006 = "W4006";
    /**
     * SCREEN ID (W4007)
     */
    public static final String SCREEN_ID_W4007 = "W4007";
    /**
     * SCREEN ID (W4008)
     */
    public static final String SCREEN_ID_W4008 = "W4008";
    /**
     * SCREEN ID (W4501)
     */
    public static final String SCREEN_ID_W4501 = "W4501";
    /**
     * SCREEN ID (W4502)
     */
    public static final String SCREEN_ID_W4502 = "W4502";
    /**
     * SCREEN ID (W4503)
     */
    public static final String SCREEN_ID_W4503 = "W4503";
    /**
     * SCREEN ID (W4504)
     */
    public static final String SCREEN_ID_W4504 = "W4504";
    /**
     * SCREEN ID (W4505)
     */
    public static final String SCREEN_ID_W4505 = "W4505";
    /**
     * SCREEN ID (W4506)
     */
    public static final String SCREEN_ID_W4506 = "W4506";
    /**
     * SCREEN ID (W4507)
     */
    public static final String SCREEN_ID_W4507 = "W4507";
    /**
     * SCREEN ID (W4508)
     */
    public static final String SCREEN_ID_W4508 = "W4508";
    /**
     * SCREEN ID (W5001)
     */
    public static final String SCREEN_ID_W5001 = "W5001";
    /**
     * SCREEN ID (W5002)
     */
    public static final String SCREEN_ID_W5002 = "W5002";
    /**
     * SCREEN ID (W5003)
     */
    public static final String SCREEN_ID_W5003 = "W5003";
    /**
     * SCREEN ID (W5004)
     */
    public static final String SCREEN_ID_W5004 = "W5004";
    /**
     * SCREEN ID (W5501)
     */
    public static final String SCREEN_ID_W5501 = "W5501";
    /**
     * SCREEN ID (W5502)
     */
    public static final String SCREEN_ID_W5502 = "W5502";
    /**
     * SCREEN ID (W5503)
     */
    public static final String SCREEN_ID_W5503 = "W5503";
    /**
     * SCREEN ID (W5504)
     */
    public static final String SCREEN_ID_W5504 = "W5504";
    /**
     * SCREEN ID (W5505)
     */
    public static final String SCREEN_ID_W5505 = "W5505";
    /**
     * SCREEN ID (W6001)
     */
    public static final String SCREEN_ID_W6001 = "W6001";
    /**
     * SCREEN ID (W6002)
     */
    public static final String SCREEN_ID_W6002 = "W6002";
    /**
     * SCREEN ID (W6003)
     */
    public static final String SCREEN_ID_W6003 = "W6003";
    /**
     * SCREEN ID (W6004)
     */
    public static final String SCREEN_ID_W6004 = "W6004";
    /**
     * SCREEN ID (W6005)
     */
    public static final String SCREEN_ID_W6005 = "W6005";
    /**
     * SCREEN ID (W6006)
     */
    public static final String SCREEN_ID_W6006 = "W6006";
    /**
     * SCREEN ID (W6007)
     */
    public static final String SCREEN_ID_W6007 = "W6007";
    /**
     * SCREEN ID (W6008)
     */
    public static final String SCREEN_ID_W6008 = "W6008";
    /**
     * SCREEN ID (W6009)
     */
    public static final String SCREEN_ID_W6009 = "W6009";
    /**
     * SCREEN ID (W7001)
     */
    public static final String SCREEN_ID_W7001 = "W7001";
    /**
     * SCREEN ID (W7002)
     */
    public static final String SCREEN_ID_W7002 = "W7002";
    /**
     * SCREEN ID (W7003)
     */
    public static final String SCREEN_ID_W7003 = "W7003";
    /**
     * SCREEN ID (W7004)
     */
    public static final String SCREEN_ID_W7004 = "W7004";
    /**
     * SCREEN ID (W7005)
     */
    public static final String SCREEN_ID_W7005 = "W7005";
    /**
     * SCREEN ID (W7006)
     */
    public static final String SCREEN_ID_W7006 = "W7006";
    /**
     * SCREEN ID (W7007)
     */
    public static final String SCREEN_ID_W7007 = "W7007";
    /**
     * SCREEN ID (W8001)
     */
    public static final String SCREEN_ID_W8001 = "W8001";
    /**
     * SCREEN ID (W8002)
     */
    public static final String SCREEN_ID_W8002 = "W8002";
    /**
     * SCREEN ID (W8003)
     */
    public static final String SCREEN_ID_W8003 = "W8003";
    /**
     * SCREEN ID (W8004)
     */
    public static final String SCREEN_ID_W8004 = "W8004";
    /**
     * SCREEN ID (W9002)
     */
    public static final String SCREEN_ID_W9002 = "W9002";
    /**
     * SCREEN ID (W9003)
     */
    public static final String SCREEN_ID_W9003 = "W9003";
    /**
     * SCREEN ID (W9004)
     */
    public static final String SCREEN_ID_W9004 = "W9004";
    /**
     * SCREEN ID (W9005)
     */
    public static final String SCREEN_ID_W9005 = "W9005";
    /**
     * SCREEN ID (W9006)
     */
    public static final String SCREEN_ID_W9006 = "W9006";
    /**
     * SCREEN ID (W9007)
     */
    public static final String SCREEN_ID_W9007 = "W9007";
    /**
     * SCREEN ID (W9008)
     */
    public static final String SCREEN_ID_W9008 = "W9008";
    /**
     * SCREEN ID (W9009)
     */
    public static final String SCREEN_ID_W9009 = "W9009";
    /**
     * SCREEN ID (W9010)
     */
    public static final String SCREEN_ID_W9010 = "W9010";
    /**
     * SCREEN ID (W9011)
     */
    public static final String SCREEN_ID_W9011 = "W9011";
    /**
     * SCREEN ID (W9012)
     */
    public static final String SCREEN_ID_W9012 = "W9012";
    /**
     * SCREEN ID (W9013)
     */
    public static final String SCREEN_ID_W9013 = "W9013";
    /**
     * SCREEN ID (W9014)
     */
    public static final String SCREEN_ID_W9014 = "W9014";
    /**
     * SCREEN ID (W9015)
     */
    public static final String SCREEN_ID_W9015 = "W9015";
    /**
     * SCREEN ID (W9016)
     */
    public static final String SCREEN_ID_W9016 = "W9016";
    /**
     * SCREEN ID (W9017)
     */
    public static final String SCREEN_ID_W9017 = "W9017";
    /**
     * SCREEN ID (W9018)
     */
    public static final String SCREEN_ID_W9018 = "W9018";
    /**
     * SCREEN ID (W9019)
     */
    public static final String SCREEN_ID_W9019 = "W9019";
    /**
     * SCREEN ID (W9022)
     */
    public static final String SCREEN_ID_W9022 = "W9022";
    /**
     * SCREEN ID (W9023)
     */
    public static final String SCREEN_ID_W9023 = "W9023";
    /**
     * SCREEN ID (W9024)
     */
    public static final String SCREEN_ID_W9024 = "W9024";
    /**
     * SCREEN ID (W9025)
     */
    public static final String SCREEN_ID_W9025 = "W9025";
    /**
     * SCREEN ID (WA501)
     */
    public static final String SCREEN_ID_WA501 = "WA501";
    /**
     * SCREEN ID (WB001)
     */
    public static final String SCREEN_ID_WB001 = "WB001";
    /**
     * SCREEN ID (WB002)
     */
    public static final String SCREEN_ID_WB002 = "WB002";
    /**
     * SCREEN ID (WB003)
     */
    public static final String SCREEN_ID_WB003 = "WB003";
    /**
     * SCREEN ID (WB004)
     */
    public static final String SCREEN_ID_WB004 = "WB004";
    /**
     * SCREEN ID (WB005)
     */
    public static final String SCREEN_ID_WB005 = "WB005";
    /**
     * SCREEN ID (WB006)
     */
    public static final String SCREEN_ID_WB006 = "WB006";
    /**
     * SCREEN ID (WB007)
     */
    public static final String SCREEN_ID_WB007 = "WB007";
    /**
     * SCREEN ID (WB020)
     */
    public static final String SCREEN_ID_WB020 = "WB020";
    /**
     * SCREEN ID (WC001)
     */
    public static final String SCREEN_ID_WC001 = "WC001";
    /**
     * SCREEN ID (WS501)
     */
    public static final String SCREEN_ID_WS501 = "WS501";
    /**
     * SCREEN ID (WS502)
     */
    public static final String SCREEN_ID_WS502 = "WS502";
    /**
     * SCREEN ID (WT001)
     */
    public static final String SCREEN_ID_WT001 = "WT001";
    /**
     * SCREEN ID (WT002)
     */
    public static final String SCREEN_ID_WT002 = "WT002";
    /**
     * SCREEN ID (WT003)
     */
    public static final String SCREEN_ID_WT003 = "WT003";
    /**
     * SCREEN ID (WT004)
     */
    public static final String SCREEN_ID_WT004 = "WT004";
    /**
     * SCREEN ID (WT005)
     */
    public static final String SCREEN_ID_WT005 = "WT005";
    /**
     * SCREEN ID (WT006)
     */
    public static final String SCREEN_ID_WT006 = "WT006";
    /**
     * SCREEN ID (WT007)
     */
    public static final String SCREEN_ID_WT007 = "WT007";
    /**
     * SCREEN ID (WT008)
     */
    public static final String SCREEN_ID_WT008 = "WT008";
    /**
     * SCREEN ID (WT010)
     */
    public static final String SCREEN_ID_WT010 = "WT010";
    /**
     * SCREEN ID (WT011)
     */
    public static final String SCREEN_ID_WT011 = "WT011";
    /**
     * SCREEN ID (WT014)
     */
    public static final String SCREEN_ID_WT014 = "WT014";
    /**
     * SCREEN ID (WT015)
     */
    public static final String SCREEN_ID_WT015 = "WT015";
    /**
     * SCREEN ID (WT016)
     */
    public static final String SCREEN_ID_WT016 = "WT016";
    /**
     * SCREEN ID (WT017)
     */
    public static final String SCREEN_ID_WT017 = "WT017";
    /**
     * SCREEN ID (WT018)
     */
    public static final String SCREEN_ID_WT018 = "WT018";
    /**
     * SCREEN ID (WT501)
     */
    public static final String SCREEN_ID_WT501 = "WT501";
    /**
     * SCREEN ID (WT502)
     */
    public static final String SCREEN_ID_WT502 = "WT502";
    /**
     * SCREEN ID (WT503)
     */
    public static final String SCREEN_ID_WT503 = "WT503";
    /**
     * SCREEN ID (WT504)
     */
    public static final String SCREEN_ID_WT504 = "WT504";

    /*****************************************************************************
     * Web service ID
     *****************************************************************************/

    /**
     * Web service ID (WS0502)
     */
    public static final String WS_ID_WS0502 = "WS0502";
    /**
     * Web service ID (WS2501)
     */
    public static final String WS_ID_WS2501 = "WS2501";
    /**
     * Web service ID (WS2502)
     */
    public static final String WS_ID_WS2502 = "WS2502";
    /**
     * Web service ID (WS2503)
     */
    public static final String WS_ID_WS2503 = "WS2503";
    /**
     * Web service ID (WS2504)
     */
    public static final String WS_ID_WS2504 = "WS2504";
    /**
     * Web service ID (WS2505)
     */
    public static final String WS_ID_WS2505 = "WS2505";
    /**
     * Web service ID (WS2507)
     */
    public static final String WS_ID_WS2507 = "WS2507";
    /**
     * Web service ID (WS2508)
     */
    public static final String WS_ID_WS2508 = "WS2508";
    /**
     * Web service ID (WS2509)
     */
    public static final String WS_ID_WS2509 = "WS2509";
    /**
     * Web service ID (WS2510)
     */
    public static final String WS_ID_WS2510 = "WS2510";
    /**
     * Web service ID (WS2511)
     */
    public static final String WS_ID_WS2511 = "WS2511";
    /**
     * Web service ID (WS2512)
     */
    public static final String WS_ID_WS2512 = "WS2512";
    /**
     * Web service ID (WST001)
     */
    public static final String WS_ID_WST001 = "WST001";


    /*****************************************************************************
     * List ID
     *****************************************************************************/

    /**
     * List ID (L1001)
     */
    public static final String REPORT_ID_L1001 = "L1001";
    /**
     * List ID (L1002)
     */
    public static final String REPORT_ID_L1002 = "L1002";
    /**
     * List ID (L1003)
     */
    public static final String REPORT_ID_L1003 = "L1003";
    /**
     * List ID (L1008)
     */
    public static final String REPORT_ID_L1008 = "L1008";
    /**
     * List ID (L2001)
     */
    public static final String REPORT_ID_L2001 = "L2001";
    /**
     * List ID (L2002)
     */
    public static final String REPORT_ID_L2002 = "L2002";
    /**
     * List ID (L2003)
     */
    public static final String REPORT_ID_L2003 = "L2003";
    /**
     * List ID (L2004)
     */
    public static final String REPORT_ID_L2004 = "L2004";
    /**
     * List ID (L2005)
     */
    public static final String REPORT_ID_L2005 = "L2005";
    /**
     * List ID (L4001)
     */
    public static final String REPORT_ID_L4001 = "L4001";
    /**
     * List ID (L4002)
     */
    public static final String REPORT_ID_L4002 = "L4002";
    /**
     * List ID (L4005)
     */
    public static final String REPORT_ID_L4005 = "L4005";
    /**
     * list ID (L5001) - header
     */
    public static final String REPORT_ID_L5001_1 = "L5001-1"; // UT429 ADD
    /**
     * list ID (L5001) - detail
     */
    public static final String REPORT_ID_L5001_2 = "L5001-2"; // UT429 ADD
    /**
     * List ID (L6001)
     */
    public static final String REPORT_ID_L6001 = "L6001";
    /**
     * List ID (L6002)
     */
    public static final String REPORT_ID_L6002 = "L6002";
    /**
     * List ID (L6003)
     */
    public static final String REPORT_ID_L6003 = "L6003";
    /**
     * List ID (L6004)
     */
    public static final String REPORT_ID_L6004 = "L6004";
    /**
     * List ID (L6005)
     */
    public static final String REPORT_ID_L6005 = "L6005";
    /**
     * List ID (L6006)
     */
    public static final String REPORT_ID_L6006 = "L6006";
    /**
     * List ID (L6007)
     */
    public static final String REPORT_ID_L6007 = "L6007";
    /**
     * List ID (L6008)
     */
    public static final String REPORT_ID_L6008 = "L6008";
    /**
     * List ID (L6008) // add by DCS 08022017
     */
    public static final String REPORT_ID_L6008_ASIA = "L6008Asia";
    /**
     * List ID (L6009)
     */
    public static final String REPORT_ID_L6009 = "L6009";
    /**
     * List ID (L6010)
     */
    public static final String REPORT_ID_L6010 = "L6010";
    /**
     * List ID (L6011)
     */
    public static final String REPORT_ID_L6011 = "L6011";
    /**
     * List ID (L6012)
     */
    public static final String REPORT_ID_L6012 = "L6012";
    /**
     * List ID (L6013)
     */
    public static final String REPORT_ID_L6013 = "L6013";
    /**
     * List ID (L6014)
     */
    public static final String REPORT_ID_L6014 = "L6014";
    /**
     * List ID (L6015)
     */
    public static final String REPORT_ID_L6015 = "L6015";
    /**
     * List ID (L6016)
     */
    public static final String REPORT_ID_L6016 = "L6016";

    /** START: 2017/12/26 A.Chonthicha, REPORT ID FOR DNPH **/
    /**
     * List ID (L6001)
     */
    public static final String REPORT_ID_L6001_PH = "L6001_PH";
    /**
     * List ID (L6002)
     */
    public static final String REPORT_ID_L6002_PH = "L6002_PH";
    /**
     * List ID (L6003)
     */
    public static final String REPORT_ID_L6003_PH = "L6003_PH";
    /**
     * List ID (L6004)
     */
    public static final String REPORT_ID_L6004_PH = "L6004_PH";
    /**
     * List ID (L6005)
     */
    public static final String REPORT_ID_L6005_PH = "L6005_PH";
    /**
     * List ID (L6006)
     */
    public static final String REPORT_ID_L6006_PH = "L6006_PH";
    /**
     * List ID (L6007)
     */
    public static final String REPORT_ID_L6007_PH = "L6007_PH";
    /**
     * List ID (L6008)
     */
    public static final String REPORT_ID_L6008_PH = "L6008_PH";
    /**
     * List ID (L6009)
     */
    public static final String REPORT_ID_L6009_PH = "L6009_PH";
    /**
     * List ID (L6010)
     */
    public static final String REPORT_ID_L6010_PH = "L6010_PH";
    /**
     * List ID (L6011)
     */
    public static final String REPORT_ID_L6011_PH = "L6011_PH";
    /**
     * List ID (L6012)
     */
    public static final String REPORT_ID_L6012_PH = "L6012_PH";
    /**
     * List ID (L6013)
     */
    public static final String REPORT_ID_L6013_PH = "L6013_PH";
    /**
     * List ID (L6014)
     */
    public static final String REPORT_ID_L6014_PH = "L6014_PH";
    /**
     * List ID (L6015)
     */
    public static final String REPORT_ID_L6015_PH = "L6015_PH";
    /**
     * List ID (L6016)
     */
    public static final String REPORT_ID_L6016_PH = "L6016_PH";
    /** END: 2017/12/26 A.Chonthicha, REPORT ID FOR DNPH **/

    /**
     * List ID (L7001)
     */
    public static final String REPORT_ID_L7001 = "L7001";
    /**
     * List ID (L7002)
     */
    public static final String REPORT_ID_L7002 = "L7002";
    /**
     * List ID (L9001)
     */
    public static final String REPORT_ID_L9001 = "L9001";
    /**
     * List ID (L9002)
     */
    public static final String REPORT_ID_L9002 = "L9002";
    /**
     * List ID (L9003)
     */
    public static final String REPORT_ID_L9003 = "L9003";
    /**
     * List ID (L9004)
     */
    public static final String REPORT_ID_L9004 = "L9004";
    /**
     * List ID (L9005)
     */
    public static final String REPORT_ID_L9005 = "L9005";
    /**
     * List ID (L9006)
     */
    public static final String REPORT_ID_L9006 = "L9006";
    /**
     * List ID (L9007)
     */
    public static final String REPORT_ID_L9007 = "L9007";
    /**
     * List ID (L9008)
     */
    public static final String REPORT_ID_L9008 = "L9008";
    /**
     * List ID (L9009)
     */
    public static final String REPORT_ID_L9009 = "L9009";
    /**
     * List ID (LB001)
     */
    public static final String REPORT_ID_LB001 = "LB001";
    /**
     * List ID (LC001)
     */
    public static final String REPORT_ID_LC001 = "LC001";
    /**
     * Web service ID (WSB009)
     */
    public static final String WEB_SERVICE_ID_WSB009 = "WSB009";

    /*****************************************************************************
     * Job ID
     *****************************************************************************/

    /**
     * Job ID (B0100:  EDI-Receive-Order registration batch)
     * <br />ジョブID (B0100: EDI受注登録バッチ)
     */
    public static final String JOB_ID_B0100 = "B0100";
    

    /*****************************************************************************
     * TIMEZONE ID
     * <br />タイムゾーンID
     *****************************************************************************/

    /**
     * TIMEZONE ID (GMT)
     * <br />タイムゾーンID (GMT)
     */
    public static final String TIMEZONE_ID_GMT = "GMT";

    /*****************************************************************************
     * Assignment-of-order-numbers key
     * <br />採番キー
     *****************************************************************************/

    /**
     * The Date format of an assignment-of-order-numbers key
     * <br />採番キーの日付フォーマット
     */
    public static final String SEQ_KEY_DATE_FORMAT = "MMdd";

    /**
     * The format of an Invoice No assignment-of-order-numbers key
     * <br />インボイスNo採番キーのフォーマット
     */
    public static final String SEQ_KEY_INVOICE_NO = "ECA0027_%S_S";

    /**
     * The format of a Re-Invoice No assignment-of-order-numbers key
     * <br />リインボイスNo採番キーのフォーマット
     */
    public static final String SEQ_KEY_RE_INVOICE_NO = "ECA0027_%S";
   
    /**
     * The format of a Re-Invoice No for cancel assignment-of-order-numbers key
     */
    public static final String SEQ_KEY_RE_INVOICE_NO_CANCEL = "ECA0027_%S_CANCEL";

    /**
     * The format of a cancellation Invoice No assignment-of-order-numbers key
     * <br />キャンセルインボイスNo採番キーのフォーマット
     */
    public static final String SEQ_KEY_CANCEL_INVOICE_NO = "ECA0027_%S_%s";

    /*****************************************************************************
     * Assignment-of-order-numbers classification
     * <br />採番区分
     *****************************************************************************/

    /**
     * Assignment-of-order-numbers classification (Export Request No)
     * <br />採番区分 (輸出依頼No)
     */
    public static final String SEQ_TYP_REQUEST_NO = "01";

    /**
     * Assignment-of-order-numbers classification (Palletize Instr. No.)
     * <br />採番区分 (梱包指示No)
     */
    public static final String SEQ_TYP_PALLETIZE_INSTR_NO = "02";

    /**
     * Assignment-of-order-numbers classification (MAIN MARK (DN))
     * <br />採番区分 (メインマーク(DN))
     */
    public static final String SEQ_TYP_CML_NO_DN = "03";

    /**
     * Assignment-of-order-numbers classification (MAIN MARK (supplier))
     * <br />採番区分 (メインマーク(仕入先))
     */
    public static final String SEQ_TYP_CML_NO_SUP = "04";

    /**
     * Assignment-of-order-numbers classification (Mix Tag No)
     * <br />採番区分 (Mix Tag No)
     */
    public static final String SEQ_TYP_MIX_TAG_NO = "05";

    /**
     * Assignment-of-order-numbers classification (transfer document No)
     * <br />採番区分 (送荷書No)
     */
    public static final String SEQ_TYP_TR_NO = "06";

    /**
     * Assignment-of-order-numbers classification (staging instruction No)
     * <br />採番区分 (荷揃え指示No)
     */
    public static final String SEQ_TYP_STG_INSTR_NO = "07";

    /**
     * Assignment-of-order-numbers classification (Staging Actuality No)
     * <br />採番区分 (山作り実績No)
     */
    public static final String SEQ_TYP_STG_ACTUALITY_NO = "08";

    /**
     * Assignment-of-order-numbers classification (Shipping Confirm. No)
     * <br />採番区分 (出荷確認No)
     */
    public static final String SEQ_TYP_CONFIRMATION_NO = "09";

    /**
     * Assignment-of-order-numbers classification (Shipping Actuality No)
     * <br />採番区分 (船積実績No)
     */
    public static final String SEQ_TYP_SHIPPING_ACTUALITY_NO = "10";

    /*****************************************************************************
     * Assignment-of-order-numbers maximum
     * <br />採番最大値
     *****************************************************************************/

    /**
     * Assignment-of-order-numbers maximum (Export Request No)
     * <br />採番最大値 (輸出依頼No)
     */
    public static final int SEQ_MAX_REQUEST_NO = 9999;

    /**
     * Assignment-of-order-numbers maximum (Palletize Instr. No.)
     * <br />採番最大値 (梱包指示No)
     */
    public static final int SEQ_MAX_PALLETIZE_INSTR_NO = 999;

    /**
     * Assignment-of-order-numbers maximum (MAIN MARK (DN))
     * <br />採番最大値 (メインマーク(DN))
     */
    public static final int SEQ_MAX_CML_NO_DN = 9999;

    /**
     * Assignment-of-order-numbers maximum (MAIN MARK (supplier))
     * <br />採番最大値 (メインマーク(仕入先))
     */
    public static final int SEQ_MAX_CML_NO_SUP = 9999;

    /**
     * Assignment-of-order-numbers maximum (Mix Tag No)
     * <br />採番最大値 (Mix Tag No)
     */
    public static final int SEQ_MAX_MIX_TAG_NO = 9999;

    /**
     * Assignment-of-order-numbers maximum (transfer document No)
     * <br />採番最大値 (送荷書No)
     */
    public static final int SEQ_MAX_TR_NO = 999;

    /**
     * Assignment-of-order-numbers maximum (staging instruction No)
     * <br />採番最大値 (荷揃え指示No)
     */
    public static final int SEQ_MAX_STG_INSTR_NO = 999;

    /**
     * Assignment-of-order-numbers maximum (Staging Actuality No)
     * <br />採番最大値 (山作り実績No)
     */
    public static final int SEQ_MAX_STG_ACTUALITY_NO = 999;

    /**
     * Assignment-of-order-numbers maximum (Shipping Confirm. No)
     * <br />採番最大値 (出荷確認No)
     */
    public static final int SEQ_MAX_CONFIRMATION_NO = 999;

    /**
     * Assignment-of-order-numbers maximum (Shipping Actuality No)
     * <br />採番最大値 (船積実績No)
     */
    public static final int SEQ_MAX_SHIPPING_ACTUALITY_NO = 99999;

    /*****************************************************************************
     * ITEM NO GROUP
     * <br />品目番号グループ
     *****************************************************************************/

    /**
     * ITEM NO GROUP (Denso)
     * <br />品目番号グループ (デンソー)
     */
    public static final String ITEM_NO_GRP_D = "D";

    /**
     * ITEM NO GROUP (Denso group)
     * <br />品目番号グループ (デンソーグループ)
     */
    public static final String ITEM_NO_GRP_DG = "DG";

    /*****************************************************************************
     * CIGMA Environment Master   ACCESSIBILITY TYPE
     * <br />CIGMA環境原単位 利用可能区分
     *****************************************************************************/

    /**
     * CIGMA Environment Master   ACCESSIBILITY TYPE (usually)
     * <br />CIGMA環境原単位 利用可能区分 (通常)
     */
    public static final String CIGMA_ENV_ACCESSIBILITY_TYP_NORMAL = "1";

    /**
     * CIGMA Environment Master   ACCESSIBILITY TYPE (use is impossible)
     * <br />CIGMA環境原単位 利用可能区分 (利用不可)
     */
    public static final String CIGMA_ENV_ACCESSIBILITY_TYP_NA = "2";

    /**
     * CIGMA Environment Master   ACCESSIBILITY TYPE (night)
     * <br />CIGMA環境原単位 利用可能区分 (夜間)
     */
    public static final String CIGMA_ENV_ACCESSIBILITY_TYP_NIGHT = "3";

    /*****************************************************************************
     * QR Code   Error correction LEVEL of breakage
     * <br />QRコード 破損の誤り訂正レベル
     *****************************************************************************/

    /**
     * QR Code   Error correction LEVEL of breakage (L:7% compensation)
     * <br />QRコード 破損の誤り訂正レベル (L：7%補正)
     */
    public static final String ERR_CORRECTION_LV_L = "L";

    /**
     * QR Code   Error correction LEVEL of breakage (M:15% compensation)
     * <br />QRコード 破損の誤り訂正レベル (M：15%補正)
     */
    public static final String ERR_CORRECTION_LV_M = "M";

    /**
     * QR Code   Error correction LEVEL of breakage (Q:25% compensation)
     * <br />QRコード 破損の誤り訂正レベル (Q：25%補正)
     */
    public static final String ERR_CORRECTION_LV_Q = "Q";

    /**
     * QR Code   Error correction LEVEL of breakage (H:30% compensation)
     * <br />QRコード 破損の誤り訂正レベル (H：30%補正)
     */
    public static final String ERR_CORRECTION_LV_H = "H";

    /*****************************************************************************
     * The QR Code character encoding   Character
     * <br />QRコード文字エンコード キャラクタ
     *****************************************************************************/

    /**
     * The QR Code character encoding   Character (shift_jis)
     * <br />QRコード文字エンコード キャラクタ(shift_jis)
     */
    public static final String CHAR_SET_SJIS = "shift_jis";

    /**
     * The QR Code character encoding   Character (UTF-8)
     * <br />QRコード文字エンコード キャラクタ(UTF-8)
     */
    public static final String CHAR_SET_UTF8 = "UTF-8";

    /*****************************************************************************
     * The QR Code pad-character sequence   Fixed value
     * <br />QRコード埋め込み文字列 固定値
     *****************************************************************************/

    /**
     * The QR Code pad-character sequence   Fixed value (Palletize Instruction)
     * <br />QRコード埋め込み文字列 固定値(Palletize Instruction)
     */
    public static final String QR_HEAD_PLTZINSTR = "ECA0027   029901002X0202X3110";

    /**
     * The QR Code pad-character sequence   Fixed value (Palletize Instruction - a written directive and track record document classification)
     * <br />QRコード埋め込み文字列 固定値(Palletize Instruction - 指示書・実績書種別)
     */
    public static final String QR_HEAD_PLTZINSTR_DCT = "01";

    /**
     * QR Code pad-character sequence header.
     * <br />QRコード埋め込み文字列 ヘッダ部
     * 
     * DGSC[責任会社コード(3)][種類コード(3)][世代コード(1)][QR体系コード(2)][QRコードNo(2)][項目数(3)]
     */
    public static final String QR_HEAD = "DGSC%s%s%s%s%s%s";
    
    /**
     * QR Code header(type code) : Mix tag
     * <br />QRヘッダ(種類コード)：Mix Tag
     */
    public static final String QR_HEAD_TYPE_MIXTAG = "P03";
    
    /**
     * QR Code header(type code) : Case Mark
     * <br />QRヘッダ(種類コード)：Case Mark
     */
    public static final String QR_HEAD_TYPE_CML = "P04";
    
    /**
     * QR Code header(type code) : X Case Mark
     * <br />QRヘッダ(種類コード)：X Case Mark
     */
    public static final String QR_HEAD_TYPE_XCML = "P05";
    
    /**
     * QR Code header(type code) : Single PLTZ QR
     * <br />QRヘッダ(種類コード)：Single PLTZ QR
     * NL047 ADD
     */
    public static final String QR_HEAD_TYPE_SINGLE_PLTZ_QR = "P06";

    /**
     * The QR Code pad-character sequence   Fixed value (Mix Tag)
     * <br />QRコード埋め込み文字列 固定値(Mix Tag)
     */
    public static final String QR_HEAD_MIXTAG = "A0602A2117A1108A1202A160140502A1501A2010A3102A2911A3011";

    /**
     * The QR Code pad-character sequence   Fixed value (Case Mark Label)
     * <br />QRコード埋め込み文字列 固定値(Case Mark Label)
     */
    public static final String QR_HEAD_CML = "A060258417A1708A1601A1305A2401A1801A2701A2801A3102A2911A3011A3302A3216A2601A1901A3401A3537";

    /**
     * The QR Code pad-character sequence   Fixed value (X Case Mark Label)
     * <br />QRコード埋め込み文字列 固定値(X Case Mark Label)
     */
    public static final String QR_HEAD_XCML = "A0602A2317A1708A1601A1205A1901A1801A3401A2701A3102A2911A3011A3302A3216A2503";

    /**
     * The QR Code pad-character sequence   Fixed value (Single PLTZ QR)
     * <br />QRコード埋め込み文字列 固定値(Single PLTZ QR)
     * NL047 ADD
     */
    public static final String QR_HEAD_SINGLE_PLTZ_QR = "A060258417A3627A3707A3827";
    
    /**
     * The QR Code pad-character sequence   Fixed value (Staging Instruction)
     * <br />QRコード埋め込み文字列 固定値(Staging Instruction)
     */
    public static final String QR_HEAD_STGINSTR = "ECA0027   029901002X0202X3214";

    /**
     * The QR Code pad-character sequence   Fixed value (Staging Instruction - a written directive and track record document classification)
     * <br />QRコード埋め込み文字列 固定値(Staging Instruction - 指示書・実績書種別)
     */
    public static final String QR_HEAD_STGINSTR_DCT = "03";

    /**
     * The QR Code pad-character sequence   Fixed value (Stg Act.)
     * <br />QRコード埋め込み文字列 固定値(Staging Actuality)
     */
    public static final String QR_HEAD_STGACT = "ECA0027   029901002X0202X3319";

    /**
     * The QR Code pad-character sequence   Fixed value (Stg-Act. - a written directive and track record document classification)
     * <br />QRコード埋め込み文字列 固定値(Staging Actuality - 指示書・実績書種別)
     */
    public static final String QR_HEAD_STGACT_DCT = "04";

    /**
     * The QR Code pad-character sequence   Fixed value (Shipping Confirmation)
     * <br />QRコード埋め込み文字列 固定値(Shipping Confirmation)
     */
    public static final String QR_HEAD_SHIPPING_FIRM = "ECA0027   029901002X0202X3414";

    /**
     * The QR Code pad-character sequence   Fixed value (Shipping Confirmation - a written directive and track record document classification)
     * <br />QRコード埋め込み文字列 固定値(Shipping Confirmation - 指示書・実績書種別)
     */
    public static final String QR_HEAD_SHIPPING_FIRM_DCT = "05";

    // NL047 ADD START
    /**
     * CML sub QR code title - QR for migration
     * <br />CML 補助QRコードのタイトル - 移行用QR
     */
    public static final String CML_SUB_QR_TITLE_EIS_QR = "EIS QR";
    
    /**
     * CML sub QR code title - Item No & Qty QR (=Single PLTZ QR)
     * <br />CML 補助QRコードのタイトル - Item No & Qty QR (=Single PLTZ QR)
     */
    public static final String CML_SUB_QR_TITLE_SINGLE_PLTZ_QR = "Item No & Qty QR";
    // NL047 ADD END

    /*****************************************************************************
     * Pulldown   Display type
     * <br />プルダウン 表示タイプ
     *****************************************************************************/

    /**
     * Pulldown   Display type (only CD)
     * <br />プルダウン 表示タイプ (コードのみ)
     */
    public static final int PULLDOWN_DISP_TYPE_CODE = 1;

    /**
     * Pulldown   Display type (only VALUE)
     * <br />プルダウン 表示タイプ (値のみ)
     */
    public static final int PULLDOWN_DISP_TYPE_VALUE = 2;

    /**
     * Pulldown   Display type (CD + VALUE)
     * <br />プルダウン 表示タイプ (コード＋値)
     */
    public static final int PULLDOWN_DISP_TYPE_CODE_VALUE = 3;

    /*****************************************************************************
     * At the time of a unit converted   The maximum digit number
     * <br />単位変換時 最大桁数
     *****************************************************************************/

    /**
     * At the time of a unit converted   The maximum digit number (WEIGHT UNIT (decimal fraction))
     * <br />単位変換時 最大桁数 (重量単位（小数部）)
     */
    public static final int MAX_SCALE_WEIGHT_UNIT = 3;

    /**
     * At the time of a unit converted   The maximum digit number (Unit of Vol. (decimal fraction))
     * <br />単位変換時 最大桁数 (容積単位（小数部）)
     */
    public static final int MAX_SCALE_VOLUME_UNIT = 3;

    /**
     * At the time of a unit converted   The maximum digit number (LENGTH UNIT (decimal fraction))
     * <br />単位変換時 最大桁数 (長さ単位（小数部）)
     */
    public static final int MAX_SCALE_LENGTH_UNIT = 3; /* ST985 MOD 2->3 */

    /**
     * At the time of a unit converted   The maximum digit number (LOADING RATIO (decimal fraction))
     * <br />単位変換時 最大桁数 (積載率（小数部）)
     */
    public static final int MAX_SCALE_LOADING_RATIO = 1;

    /**
     * At the time of a unit converted   The maximum digit number (WEIGHT UNIT (integer part))
     * <br />単位変換時 最大桁数 (重量単位（整数部）)
     */
    public static final int MAX_PRECISION_WEIGHT_UNIT = 7;

    /**
     * At the time of a unit converted   The maximum digit number (Unit of Vol. (integer part))
     * <br />単位変換時 最大桁数 (容積単位（整数部）)
     */
    public static final int MAX_PRECISION_VOLUME_UNIT = 12;

    /**
     * At the time of a unit converted   The maximum digit number (LENGTH UNIT (integer part))
     * <br />単位変換時 最大桁数 (長さ単位（整数部）)
     */
    public static final int MAX_PRECISION_LENGTH_UNIT = 4;

    /**
     * At the time of a unit converted   The maximum digit number (LOADING RATIO (integer part))
     * <br />単位変換時 最大桁数 (積載率（整数部）)
     */
    public static final int MAX_PRECISION_LOADING_RATIO = 3;
    /*
     * A part for a DNSI addition
     * <br />DNSI追加分
     */
    /*
     * Web service ID (a part for a DNSI addition)
     * <br />WebサービスID(DNSI追加分)
     */
    /**
     * Web service ID (WS0501)
     */
    public static final String WS_ID_WS0501 = "Ws0501";
    /**
     * Web service ID (WS0503)
     */
    public static final String WS_ID_WS0503 = "Ws0503";
    /**
     * Web service ID (WS5501)
     */
    public static final String WS_ID_WS5501 = "Ws5501";
    /**
     * Web service ID (WS5502)
     */
    public static final String WS_ID_WS5502 = "Ws5502";
    /**
     * Web service ID (WST501)
     */
    public static final String WS_ID_WST501 = "WsT501";
    /**
     * Web service ID (WS4501)
     */
    public static final String WS_ID_WS4501 = "Ws4501";
    /**
     * Web service ID (WS4502)
     */
    public static final String WS_ID_WS4502 = "Ws4502";
    /**
     * Web service ID (WS4503)
     */
    public static final String WS_ID_WS4503 = "Ws4503";
    /**
     * Web service ID (WS4504)
     */
    public static final String WS_ID_WS4504 = "Ws4504";
    /*
     * Web service
     * <br />Webサービス
     */
    /**
     * The execution result (normal end (password expiration)) of Web service
     * <br />Webサービスの実行結果（正常終了(パスワード期限切れ)）
     */
    public static final String WS_RESULT_PW_EXPIRATION = "4";

    /*****************************************************************************
     * Processing mode
     * <br />処理モード
     *****************************************************************************/

    /**
     * Processing mode : new
     * <br />処理モード：新規
     */
    public static final String MODE_NEW = "1";

    /**
     * Processing mode : correction
     * <br />処理モード：修正
     */
    public static final String MODE_EDIT = "2";

    /**
     * Processing mode : reference
     * <br />処理モード：参照
     */
    public static final String MODE_REF = "3";

    /**
     * processing-mode: -- a copy -- new
     * <br />処理モード：コピー新規
     */
    public static final String MODE_COPY_NEW = "4";

    /**
     * Processing mode : refer to correction -.
     * <br />処理モード：修正・参照
     */
    public static final String MODE_EDIT_REF = "5";

    /*****************************************************************************
     * Processing mode (for CML screens)
     * <br />処理モード（CML画面用）
     *****************************************************************************/

    /**
     * Processing mode : registration
     * <br />処理モード：登録
     */
    public static final String W2009_CML_MODE_EDIT = "1";

    /**
     * Processing mode : reference
     * <br />処理モード：参照
     */
    public static final String W2009_CML_MODE_REF = "2";


    /*****************************************************************************
     * INPUT METH TYP
     * <br />INPUT METH TYP
     *****************************************************************************/

    /**
     * <br />INPUT METH TYP ： AUTO
     */
    public static final String INPUT_METH_TYP_AUTO = "1";

    /**
     * <br />INPUT METH TYP ： MANUAL
     */
    public static final String INPUT_METH_TYP_MANUAL = "2";

    /*****************************************************************************
     * TYP PLNT AND WH / Factory W/H classification
     * <br />TYP PLNT AND WH / 工場倉庫区分
     *****************************************************************************/

    /**
     * Factory W/H classification  :   CIGMA
     * <br />工場倉庫区分 : CIGMA
     */
    public static final String TYP_PLANT_AND_WH_CIGMA = "1";

    /**
     * Factory W/H classification  :   NEXUS
     * <br />工場倉庫区分 : NEXUS
     */
    public static final String TYP_PLANT_AND_WH_NEXUS = "2";

    /*****************************************************************************
     * Doc TYP/DOC TYPE
     * <br />Doc TYP / ドキュメント種別
     *****************************************************************************/

    /**
     * DOC TYPE : C/O
     * <br />ドキュメント種別：C/O
     */
    public static final String DOC_TYP_CO = "1";

    /**
     * DOC TYPE : Non Wooden
     * <br />ドキュメント種別：Non Wooden
     */
    public static final String DOC_TYP_NON_WOODEN = "2";

    /**
     * DOC TYPE : Others
     * <br />ドキュメント種別：Others
     */
    public static final String DOC_TYP_OTHERS = "3";

    /**
     * DOC TYPE : CML attach CSV
     * <br />ドキュメント種別：CMLアタッチCSV。
     * 
     * UT205 CML ATTACH CSV ADD
     */
    public static final String DOC_TYP_CML_ATCH_CSV = "4";

    /*****************************************************************************
     * Default value
     * <br />デフォルト値
     *****************************************************************************/
    /**
     * PALLET NO/PALLET NO
     * <br />PALLET NO/パレットNO
     */
    public static final String DEFAULT_PALLET_NO = "0001";

    /**
     * BOX NO
     * <br />BOX NO
     */
    public static final String DEFAULT_BOX_NO = "0001";

    /**
     * X-Palletize-Work maximum registration number
     * <br />まとめパレタイズワーク最大登録件数
     */
    public static final String MAX_TW_XPLTZ_RECORDE = "99";

    /**
     * E-RT Palletize-Item maximum registration number
     * <br />E-RT パレタイズ対象品最大登録件数
     */
    public static final int MAX_ERT_TT_PLTZ_ITEM = 15;



    // -------------
    /**
     * Constant NG
     * <br />コンスタントNG
     */
    public static final String NG = "NG";

    /**
     * ROW NUMBER 1
     * <br />ROW NUMBER 1
     */
    public static final int ROW_NUM_1 = 1;

    /*****************************************************************************
     * Date format
     * <br />日付フォーマット
     *****************************************************************************/

    /**
     * The Date format of Web service
     * <br />Webサービスの日付フォーマット
     */
    public static final String WEB_SERVICE_DATE_FORMAT = "yyyy/MM/dd HH:mm:ss";

    /**
     * The timestamp format of Error Create Timestamp
     * <br />エラー作成日時のフォーマット
     */
    public static final String WEB_SERVICE_ERR_CREATE_TIMESTAMP_FORMAT = "yyyy-MM-dd HH:mm:ss.SSS";

    /**
     * The Date format for a converted
     * <br />変換用の日付フォーマット
     */
    public static final String CONVERT_DATE_FORMAT = "yyyy/MM/dd HH:mm:ss";
    
    /**
     * The Date format of CSV
     * <br />CSVの日付フォーマット
     */
    public static final String CSV_DATE_FORMAT = "yyyyMMdd";

    /*****************************************************************************
     * Batch-related
     * <br />バッチ関係
     *****************************************************************************/

    /**
     * The DSC-ID in processing the batch
     * <br />バッチ実行時のDSC-ID
     */
    public static final String BATCH_DSC_ID = "0";
    
    /*****************************************************************************
     * JOB Status
     * <br />JOBステータス
     *****************************************************************************/

    /**
     * Job status (1: normal end)
     * <br />ジョブステータス (1:正常終了)
     */
    public static final String JOB_STATUS_NORMAL = "1";

    /**
     * Job status (2: abnormal end)
     * <br />ジョブステータス (2:異常終了)
     */
    public static final String JOB_STATUS_ABEND = "2";

    /*****************************************************************************
     * ERROR TYPE (EDI-Receive-Order registration)
     * <br />エラー区分 (EDI受注登録)
     *****************************************************************************/

    /**
     * ERROR TYPE (EDI-Receive-Order registration / 0: normal)
     * <br />エラー区分 (EDI受注登録 / 0:正常)
     */
    public static final String EDI_RCV_ODR_ERROR_TYP_NORMAL = "0";

    /**
     * ERROR TYPE (EDI-Receive-Order registration / 1: only warning)
     * <br />エラー区分 (EDI受注登録 / 1:警告のみ)
     */
    public static final String EDI_RCV_ODR_ERROR_TYP_WARNING = "1";

    /**
     * ERROR TYPE (EDI-Receive-Order registration / 2: those with an error)
     * <br />エラー区分 (EDI受注登録 / 2:エラーあり)
     */
    public static final String EDI_RCV_ODR_ERROR_TYP_ERROR = "2";

    /*****************************************************************************
     * ORDER TYPE (EDI-Receive-Order registration)
     * <br />発注区分 (EDI受注登録)
     *****************************************************************************/

    /**
     * ORDER TYPE (1: original)
     * <br />発注区分 (1:オリジナル)
     */
    public static final String EDI_RCV_ODR_ODR_TYP_ORIGINAL = "1";

    /**
     * ORDER TYPE (2: change)
     * <br />発注区分 (2:変更)
     */
    public static final String EDI_RCV_ODR_ODR_TYP_CHANGE = "2";

    /*****************************************************************************
     * ORDER CHANGE TYPE (EDI-Receive-Order registration)
     * <br />発注変更区分 (EDI受注登録)
     *****************************************************************************/

    /**
     * ORDER CHANGE TYPE (1: addition)
     * <br />発注変更区分 (1:追加)
     */
    public static final String EDI_RCV_ODR_ODR_CHG_TYP_ADD = "1";

    /**
     * ORDER CHANGE TYPE (2: change)
     * <br />発注変更区分 (2:変更)
     */
    public static final String EDI_RCV_ODR_ODR_CHG_TYP_CHANGE = "2";

    /**
     * ORDER CHANGE TYPE (3: delete)
     * <br />発注変更区分 (3:削除)
     */
    public static final String EDI_RCV_ODR_ODR_CHG_TYP_DELETE = "3";

    /**
     * ORDER CHANGE TYPE (9: error)
     * <br />発注変更区分 (9:エラー)
     */
    public static final String EDI_RCV_ODR_ODR_CHG_TYP_ERROR = "9";

    /*****************************************************************************
     * Change classification (EDI-Receive-Order registration)
     * <br />変更区分 (EDI受注登録)
     *****************************************************************************/

    /**
     * Change classification (1: new registration)
     * <br />変更区分 (1:新規登録)
     */
    public static final String EDI_RCV_ODR_UPDATE_TYP_NEW = "1";

    /**
     * Change classification (2: change)
     * <br />変更区分 (2:変更)
     */
    public static final String EDI_RCV_ODR_UPDATE_TYP_CHANGE = "2";

    /**
     * Change classification (3: delete)
     * <br />変更区分 (3:削除)
     */
    public static final String EDI_RCV_ODR_UPDATE_TYP_DELETE = "3";

    /*****************************************************************************
     * Error code (EDI-Receive-Order registration)
     * <br />エラーコード (EDI受注登録)
     *****************************************************************************/

    /**
     * Error code (05)
     */
    public static final String EDI_RCV_ODR_ERR_CD_05 = "05";
    /**
     * Error code (06)
     */
    public static final String EDI_RCV_ODR_ERR_CD_06 = "06";
    /**
     * Error code (07)
     */
    public static final String EDI_RCV_ODR_ERR_CD_07 = "07";
    /**
     * Error code (08)
     * MGT575 ADD
     */
    public static final String EDI_RCV_ODR_ERR_CD_08 = "08";
    /**
     * Error code (09)
     * MGT575 ADD
     */
    public static final String EDI_RCV_ODR_ERR_CD_09 = "09";
    /**
     * Error code (12)
     */
    public static final String EDI_RCV_ODR_ERR_CD_12 = "12";
    /**
     * Error code (21)
     */
    public static final String EDI_RCV_ODR_ERR_CD_21 = "21";
    /**
     * Error code (22)
     */
    public static final String EDI_RCV_ODR_ERR_CD_22 = "22";
    /**
     * Error code (23)
     */
    public static final String EDI_RCV_ODR_ERR_CD_23 = "23";
    /**
     * Error code (24)
     */
    public static final String EDI_RCV_ODR_ERR_CD_24 = "24";
    /**
     * Error code (25)
     */
    public static final String EDI_RCV_ODR_ERR_CD_25 = "25";
    /**
     * Error code (26)
     */
    public static final String EDI_RCV_ODR_ERR_CD_26 = "26";
    /**
     * Error code (27)
     */
    public static final String EDI_RCV_ODR_ERR_CD_27 = "27";
    /**
     * Error code (29: duplication)
     */
    public static final String EDI_RCV_ODR_ERR_CD_29 = "29";
    /**
     * Error code (30: with no partner)
     */
    public static final String EDI_RCV_ODR_ERR_CD_30 = "30";
    /**
     * Error code (31)
     * MGT575 ADD
     */
    public static final String EDI_RCV_ODR_ERR_CD_31 = "31";
    /**
     * Error code (91)
     */
    public static final String EDI_RCV_ODR_ERR_CD_91 = "91";

    /*****************************************************************************
     * forward logical name
     * <br />forward論理名
     *****************************************************************************/

    /**
     * 0 affair o'clock changes
     * <br />0件時遷移
     */
    public static final String FORWARD_SUCCESS_EMPTY_WORK = "successEmptyWork";

    /*****************************************************************************
     * The character for data masks
     * <br />データマスク用文字
     *****************************************************************************/

    /**
     * The character for data masks
     * <br />データマスク用文字
     */
    public static final String MASK_CHAR = "*";

    /*****************************************************************************
     * Invoice Typ
     * <br />Invoice Typ
     *****************************************************************************/
    /**
     * <br />Invoice Typ (NORMAL)
     */
    public static final String INVOICE_TYPE_NORMAL = "NORMAL";

    /**
     * <br />Invoice Typ (CANCEL)
     */
    public static final String INVOICE_TYPE_CANCEL = "CANCEL";

    /*****************************************************************************
     * <br />Cancel Typ
     *****************************************************************************/
    /**
     * <br />Cancel Typ (NORMAL)
     */
    public static final String CANCEL_TYP_NORMAL = "N";

    /**
     * <br />Cancel Typ (CANCEL)
     */
    public static final String CANCEL_TYP_CANCEL = "C";

    /*****************************************************************************
     * <br />Manual Typ
     *****************************************************************************/
    /**
     * <br />Manual Type(Re-Invoice)
     */
    public static final String MANUAL_TYP_RE_INVOICE = "1";

    /**
     * <br />Manual Type(Non DN-G Invoice)
     */
    public static final String MANUAL_TYP_NON_DNG_INVOICE = "2";

    /**
     * <br />Manual Type(DN-G Invoice/Manual Invoice)
     */
    public static final String MANUAL_TYP_DNG_INVOICE = "3";

    /*****************************************************************************
     * <br />Documentation / Function No.
     *****************************************************************************/
    /**
     * Documentation Function No (Manual Main invoice addition)
     * <br />Documentation Function No (Manual Main invoice追加)
     */
    public static final String W6002_FUNCTION_NO_1 = "1";

    /**
     * Documentation Function No (Manual FRT Invoice addition)
     * <br />Documentation Function No (Manual FRT Invoice追加)
     */
    public static final String W6002_FUNCTION_NO_2 = "2";

    /**
     * Documentation Function No (supplier Invoice substitution)
     * <br />Documentation Function No (仕入先インボイス差替え)
     */
    public static final String W6002_FUNCTION_NO_3 = "3";

    /**
     * Documentation Function No (Cancel Invoice)
     * <br />Documentation Function No (Cancel Invoice)
     */
    public static final String W6002_FUNCTION_NO_4 = "4";

    /**
     * Documentation Function No (Re-Invoice U/L)
     * <br />Documentation Function No (リインボイスU/L)
     */
    public static final String W6002_FUNCTION_NO_5 = "5";

    /*****************************************************************************
     * INVOICE CLASS/INVOICE CLASS
     * <br />INVOICE CLASS/インボイス種類
     *****************************************************************************/
    /**
     * <br />Invoice Class(Main)
     */
    public static final String INVOICE_CLASS_MAIN = "M";

    /**
     * <br />Invoice Class(Full-RT)
     */
    public static final String INVOICE_CLASS_FULL_RT = "F";

    /**
     * <br />Invoice Class(E-RT)
     */
    public static final String INVOICE_CLASS_E_RT = "E";

    /*****************************************************************************
     * CUSTOM TIMING TYPE/CUSTOM TIMING TYPE
     * <br />CUSTOM TIMING TYPE/通関タイミング区分
     *****************************************************************************/
    /**
     * CUSTOM TIMING TYPE (customs clearance from packed in containers)
     * <br />CUSTOM TIMING TYPE(バン詰後通関)
     */
    public static final String CUSTOM_TIMING_TYPE_A = "A";

    /**
     * CUSTOM TIMING TYPE (loading to container after customs clearance)
     * <br />CUSTOM TIMING TYPE(通関後バン詰)
     */
    public static final String CUSTOM_TIMING_TYPE_B = "B";

    /**
     * CUSTOM TIMING TYPE (mixture)
     * <br />CUSTOM TIMING TYPE(混在)
     */
    public static final String CUSTOM_TIMING_TYPE_Z = "Z";

    /*****************************************************************************
     * SHIPPED TYPE
     * <br />出荷済み区分
     *****************************************************************************/
    /**
     * <br />1:Incomplete Packing
     */
    public static final String SHIPPED_TYP_INCOMPLATE_PACKING = "1";

    /**
     * <br />2:Complate Packing
     */
    public static final String SHIPPED_TYP_COMPLATE_PACKING = "2";

    /**
     * <br />3:Complate Shipping
     */
    public static final String SHIPPED_TYP_INCOMPLETE_SHIPPING = "3";


    /*****************************************************************************
     * <br />INVOICE CATEGORY/請求分類
     *****************************************************************************/
    /**
     * <br />C:Commercial value
     */
    public static final String INVOICE_CTGRY_C = "C";
    /**
     * <br />I:Commercial value (I)
     */
    public static final String INVOICE_CTGRY_I = "I";
    /**
     * <br />N:No commercial value
     */
    public static final String INVOICE_CTGRY_N = "N";

    /*****************************************************************************
     * GRP NO 2/GRP NO 2
     * <br />GRP NO 2/グループNO2
     *****************************************************************************/
    /**
     * The Invoice SEQUENCE NO of FullRT
     * <br />FullRTのインボイス連番
     * The Invoice of Main is always 0.
     * <br />Mainのインボイスは常に0
     */
    public static final String GRP_NO2_MAIN = "0";

    /*****************************************************************************
     * REMITTANCE L/C TYPE/REMITTANCE L/C TYPE
     * <br />REMITTANCE L/C TYPE / 送金先L/C区分
     *****************************************************************************/
    /**
     * REMITTANCE L/C TYPE (Remittance)
     * <br />送金先L/C区分 (Remittance)
     */
    public static final String REM_LC_TYP_REM = "R";

    /**
     * REMITTANCE L/C TYPE (L/C)
     * <br />送金先L/C区分 (L/C)
     */
    public static final String REM_LC_TYP_LC = "L";

    /*****************************************************************************
     * Invoice Amount error checking
     * <br />インボイス金額エラーチェック
     *****************************************************************************/
    /**
     * FREIGHT_ERR (an error is made when an Amount is 0)
     * <br />運賃エラー（金額が0の場合エラー）
     */
    public static final String FRIGHT_ERR_0 = "0";

    /**
     * FREIGHT_ERR (an error is made when an Amount is except zero)
     * <br />運賃エラー（金額が0以外の場合エラー）
     */
    public static final String FRIGHT_ERR_1 = "1";

    /**
     * Insurance money error (an error is made when an Amount is 0)
     * <br />保険金エラー（金額が0の場合エラー）
     */
    public static final String INSURANCE_ERR_0 = "0";

    /**
     * Insurance money error (an error is made when an Amount is except zero)
     * <br />保険金エラー（金額が0以外の場合エラー）
     */
    public static final String INSURANCE_ERR_1 = "1";

    /*****************************************************************************
     * The number of characters which can be Special Information displayed
     * <br />Special Information 表示可能文字数
     *****************************************************************************/
    /**
     * The number of characters which can be displayed on one line
     * <br />1行に表示できる文字数
     */
    public static final int SPECIAL_INFORMATION_PAR_LINE = 30; // UT321 MOD

    /**
     * The maximum number of lines which can be displayed
     * <br />表示できる最大行数
     */
    public static final int SPECIAL_INFORMATION_ROW = 5; // UT321 MOD

    /*****************************************************************************
     * The number of characters which can be Invoice Template Ma displayed
     * <br />Invoice Template Ma 表示可能文字数
     *****************************************************************************/
    /**
     * The number of characters per line (25 characters)
     * <br />1行あたりの文字数(25文字)
     */
    public static final int CASEMARK_NOTATION_MAX_PAR_LINE = 17; // ST970 MOD
    
    /**
     * The number of characters per line (35 characters)
     * <br />1行あたりの文字数(35文字)
     */
    public static final int MAX_PAR_LINE_35 = 35;

    /**
     * The number of characters per line (50 characters)
     * <br />1行あたりの文字数(50文字)
     */
    public static final int MAX_PAR_LINE_50 = 50;
    
    /**
     * The maximum number of lines (two lines)
     * <br />最大行数(2行)
     */
    public static final int CASEMARK_NOTATION_MAX_ROW = 3; // ST970 MOD
    /**
     * The maximum number of lines (three lines)
     * <br />最大行数(3行)
     */
    public static final int MAX_ROW_3 = 3;

    /**
     * The maximum number of lines (ten lines)
     * <br />最大行数(10行)
     */
    public static final int MAX_ROW_10 = 10;

    /*****************************************************************************
     * Amount digit number maximum
     * <br />金額桁数最大値
     *****************************************************************************/
    /**
     * Amount digit number maximum (CIGMA)
     * <br />金額桁数最大値(CIGMA)
     */
    public static final String MAX_AMOUNT_DIGIT_CIGMA = "99999999999.99";

    /**
     * Amount digit number maximum (list)
     * <br />金額桁数最大値(帳票)
     */
    public static final String MAX_AMOUNT_DIGIT_REPORT = "9999999999999.99";

    /*****************************************************************************
     * Temporary Invoice No assignment of order numbers
     * <br />仮インボイスNo採番
     *****************************************************************************/
    /**
     * The assignment-of-order-numbers format of temporary Invoice No
     * <br />仮インボイスNoの採番フォーマット
     */
    public static final String TMP_INVOICE_NO_FORMAT = "TMP_%s%s%s";

    /**
     * The assignment-of-order-numbers format of temporary Invoice No
     * <br />仮インボイスNoの採番フォーマット
     */
    public static final String TMP_RE_INVOICE_NO_FORMAT = "TMP_%s%s%s" + "_R";

    /**
     * A regular cancellation Invoice No assignment-of-order-numbers format in case the supplier No is specified
     * <br />仕入先Noが指定されている場合の正規キャンセルインボイスNo採番フォーマット
     */
    public static final String CANCEL_INVOICE_NO_SUPPLIER_FORMAT = "%sC";

    /**
     * A regular cancellation Invoice No assignment-of-order-numbers format in case the supplier No is specified
     * <br />仕入先Noが指定されている場合の正規キャンセルインボイスNo採番フォーマット
     */
    public static final String CANCEL_INVOICE_NO_SUPPLIER_FORMAT_FRT = "%sC%d";

    /*****************************************************************************
     * HS_CODE
     * <br />HS_CODE
     *****************************************************************************/
    /**
     * HS CODE
     * <br />HS CODE
     */
    public static final String HS_CODE = "HS_CODE";

    /*****************************************************************************
     * EDI-Receive-Order registration job parameter
     * <br />EDI受注登録ジョブパラメータ
     *****************************************************************************/
    /**
     * REGISTNAME of an EDI-Receive-Order registration job
     * <br />EDI受注登録ジョブのREGISTNAME
     */
    public static final String REGISTNAME_CIGMA = "CIGMA";

    /**
     * Job ID of an EDI-Receive-Order registration job
     * <br />EDI受注登録ジョブのジョブID
     */
    public static final String JOBID = "ECA0027B0100";

    /**
     * Job ID of an EDI-Receive-Order registration job
     * <br />EDI受注登録ジョブのジョブID
     */
    public static final String RECEVIVING_COMPANY_CODE = "receivingCompanyCode";

    /**
     * Job ID of an EDI-Receive-Order registration job
     * <br />EDI受注登録ジョブのジョブID
     */
    public static final String PARAM_ADS = "ads";

    /**
     * Job ID of an EDI-Receive-Order registration job
     * <br />EDI受注登録ジョブのジョブID
     */
    public static final String PARAM_STEP = "step";

    /**
     * Job ID of an EDI-Receive-Order registration job
     * <br />EDI受注登録ジョブのジョブID
     */
    public static final String PARAM_STEP_VAL = "1";

    /*****************************************************************************
     * Shift CML printing job parameter
     * <br />移行CML印刷処理パラメータ
     *****************************************************************************/
    /**
     * The fixed user ID of a printing job
     * <br />印刷処理の固定ユーザID
     */
    public static final String MIGRATION_DSCID = "MIGRATION";

    /*****************************************************************************
     * SHIPPED TYPE/SHIPPED TYPE
     * <br />SHIPPED TYPE/出荷済み区分
     *****************************************************************************/

    /**
     * SHIPPED TYPE/SHIPPED TYPE (1: unpacked up)
     * <br />SHIPPED TYPE/出荷済み区分(1:未梱包)
     */
    public static final String SHIPPED_TYP_INCOMPLETE_PACKING = "1";

    /**
     * SHIPPED TYPE/SHIPPED TYPE (2: finishing of a PKG)
     * <br />SHIPPED TYPE/出荷済み区分(2:梱包済み)
     */
    public static final String SHIPPED_TYP_COMPLETE_PACKING = "2";

    /**
     * SHIPPED TYPE/SHIPPED TYPE (3: finishing of shipment)
     * <br />SHIPPED TYPE/出荷済み区分(3:出荷済み)
     */
    public static final String SHIPPED_TYP_COMPLETE_SHIPPING = "3";

    /*****************************************************************************
     * FREIGHT RESPONSIBLE CODE/Freight Res. Cd
     * <br />FREIGHT RESPONSIBLE CODE/運賃支払いコード
     *****************************************************************************/
    /**
     * Freight Res. Cd (P:Prepaid)
     * <br />運賃支払いコード(P:Prepaid)
     */
    public static final String FREIGHT_RESPONSIBLE_CD_PREPAID = "P";

    /**
     * Freight Res. Cd (C:Collect)
     * <br />運賃支払いコード(C:Collect)
     */
    public static final String FREIGHT_RESPONSIBLE_CD_COLLECT = "C";

    /**
     * For Web services   Freight Res. Cd (0)
     * <br />Webサービス用 運賃支払いコード(0)
     */
    public static final String WE_FREIGHT_RESPONSIBLE_CD_0 = "0";

    /**
     * For Web services   Freight Res. Cd (1:Prepaid)
     * <br />Webサービス用 運賃支払いコード(1:Prepaid)
     * UT285 MOD
     */
    public static final String CIGMA_FREIGHT_RESPONSIBLE_CD_PREPAID = "1";

    /**
     * For Web services   Freight Res. Cd (0:Collect)
     * <br />Webサービス用 運賃支払いコード(0:Collect)
     * UT285 ADD
     */
    public static final String CIGMA_FREIGHT_RESPONSIBLE_CD_COLLECT = "0";

    /*****************************************************************************
     * File extension sub
     * <br />ファイル拡張子
     *****************************************************************************/
    /**
     * File extension sub (bmp)
     * <br />ファイル拡張子(bmp)
     */
    public static final String FILE_EXTENTION_BMP = "bmp";

    /**
     * File extension sub (png)
     * <br />ファイル拡張子(png)
     */
    public static final String FILE_EXTENTION_PNG = "png";

    /**
     * File extension sub (gif)
     * <br />ファイル拡張子(gif)
     */
    public static final String FILE_EXTENTION_GIF = "gif";

    /**
     * File extension sub (jpg)
     * <br />ファイル拡張子(jpg)
     */
    public static final String FILE_EXTENTION_JPG = "jpg";

    /**
     * File extension sub (jpeg)
     * <br />ファイル拡張子(jpeg)
     */
    public static final String FILE_EXTENTION_JPEG = "jpeg";
    
    /**
     * File extension sub (csv)
     * <br />ファイル拡張子(csv)
     */
    public static final String FILE_EXTENTION_CSV = "csv";

    /*****************************************************************************
     * String
     * <br />文字列
     *****************************************************************************/
    /**
     * TEMPORARY
     */
    public static final String TEMPORARY = "TEMPORARY";

    /**
     * Decimal Part
     */
    public static final String DECIMAL_PART = "decimal part";

    /**
     * Integer Part
     */
    public static final String INTEGER_PART = "integer part";

    /**
     * a month ago from today
     */
    public static final String ONE_MONTH_AGO = "a month ago from today";

    /**
     * two month later from today
     */
    public static final String TWO_MONTH_LATER = "two month later from today";

    /**
     * White Space
     */
    public static final String WHITE_SPACE = " ";

    /**
     * String "0"
     */
    public static final String STRING_ZERO = "0";

    /**
     * LIne separator (\n)
     */
    public static final String LINE_SEPARATOR = "\n";

 // 2015.1.15 Change so as to hold in Constants by DNITS instructions 
    /**
     * CurrencyCode
     */
    public static final String CURRENCY_CODE = "Currency CD";
    
    /**
     * Date
     */
    public static final String DATE_STR = "Date";

    /**
     * Unit Price Error List
     */
    public static final String UNIT_PRICE_ERROR_LIST = "Unit Price Error List";

    /**
     * Item No.
     */
    public static final String ITEM_NO = "Item No.";

    /**
     * Cust P/No
     */
    public static final String CUSTOMER_PART_NO = "Cust P/No";

    /**
     * Count of Confirmation No.
     */
    public static final String COUNT_OF_CONFIRMATION_NO = "Count of Confirmation No.";

    /**
     * Count of Stg. Actuality No.
     */
    public static final String COUNT_OF_STG_ACTUALITY_NO = "Count of Stg. Actuality No.";

    /**
     * Count of Stg. Instr. No.
     */
    public static final String COUNT_OF_STG_INSTR_NO = "Count of Stg. Instr. No.";
    
    /**
     * Process type
     */
    public static final String PROCESS_TYP = "ProcessTyp";
    
    /**
     * Key
     */
    public static final String KEY = "Key";

    /*****************************************************************************
     * UNIT CD
     *****************************************************************************/
    /**
     * Unit code: Cubic Meter(m3/CR)
     */
    public static final String UNIT_CD_CR = "CR";

    /*
     * Code value (a part for a DNSI addition)
     * <br />コード値(DNSI追加分)
     */
    /**
     * PALLETIZE STATUS (荷揃 track record)
     * <br />パレタイズステータスコード(荷揃実績)
     */
    public static final String PLTZ_STATUS_WORKED_ACT = "30";
    /**
     * CUSTOM TIMING TYPE (A)
     * <br />通関タイミング区分(A)
     */
    public static final String CUSTOM_TYMING_TYP_A = "A";
    /**
     * CUSTOM TIMING TYPE (B)
     * <br />通関タイミング区分(B)
     */
    public static final String CUSTOM_TYMING_TYP_B = "B";
    /**
     * CUSTOM TIMING TYPE (Z)
     * <br />通関タイミング区分(Z)
     */
    public static final String CUSTOM_TYMING_TYP_Z = "Z";
    /**
     * CONTAINER LOOSE TYPE (C)
     * <br />コンテナルーズ区分(C)
     */
    public static final String CONTAINER_LOOSE_TYP_C = "C";
    /**
     * CONTAINER LOOSE TYPE (L)
     * <br />コンテナルーズ区分(L)
     */
    public static final String CONTAINER_LOOSE_TYP_L = "L";
    /**
     * PALLETIZE STATUS (customs clearance)
     * <br />パレタイズステータスコード(通関)
     */
    public static final String PLTZ_STATUS_CUSTOM = "40";
    /**
     * LAST TR STATUS (Blank)
     * <br />最終搬出入ステータス(Blank)
     */
    public static final String LAST_TR_STATUS_BLANK = "10";
    /**
     * LAST TR STATUS (Issue TR)
     * <br />最終搬出入ステータス(Issue TR)
     */
    public static final String LAST_TR_STATUS_ISSUE_TR = "20";
    /**
     * LAST TR STATUS (Activate TR)
     * <br />最終搬出入ステータス(Activate TR)
     */
    public static final String LAST_TR_STATUS_ACCTIVE_TR = "30";
    /**
     * LAST TR STATUS (Received at To)
     * <br />最終搬出入ステータス(Received at To)
     */
    public static final String LAST_TR_STATUS_RECEIVED_AT_TR = "40";
    /**
     * Palletize Status (shipment track record)
     * <br />パレタイズステータス (出荷実績)
     */
    public static final String PLTZ_INSTR_STATUS_SUCCESS = "90";

    /**
     * User utilization right management (BHT Lock)
     * <br />ユーザ利用権限管理 (BHT Lock)
     */
    public static final String BHT_ROLE_LOCK = "10";

    /**
     * User utilization right management (PLANT CODE)
     * <br />ユーザ利用権限管理 (製造部工場区分)
     */
    public static final String AUTH_DATA_TYP_PLNT_CD = "01";
    
    /**
     * Level 0
     */
    public static final String LEVEL_0 = "0";
    
    /**
     * Level 1
     */
    public static final String LEVEL_1 = "1";
    
    /**
     * Level 2
     */
    public static final String LEVEL_2 = "2";

    /*****************************************************************************
     * QTY UNIT
     *****************************************************************************/
    /**
     * QTY UNIT (EA)
     */
    public static final String QTY_UNIT_EA = "EA";

    /*****************************************************************************
     * SCREEN ID (BHT)
     *****************************************************************************/
    /**
     * SCREEN ID (default)
     */
    public static final String BHT_SCREEN_ID_DEFAULT = "BHT SCREEN ID";
    
    
    
    
    
    //w3 add ++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    /***************************************************************************
     * Screen Transition Control for W3006,8
     **************************************************************************/
    /**
     * Transferred by W3001
     */
    public static final String COME_FROM_W3001 = "1";
    
    /**
     * Transferred by W3007
     */
    public static final String COME_FROM_W3007 = "7";
    
    /**
     * Transferred by confirm detail button
     */
    public static final String EDIT_FLG_CONFIRM = "cnfmDtl";

    /**
     * Transferred by edit TR button
     */
    public static final String EDIT_FLG_EDIT = "editTR";

    /***************************************************************************
     * QRコード埋め込み文字列 固定値
     **************************************************************************/
    /**
     * QR code for the header of Export Transfer Report
     */
    public static final String QR_HEAD_TRANSFER = "ECA0027   029901002X0202X5515X5601X5701";

    /**
     * QR code for the fixed value of Export Transfer Report
     */
    public static final String QR_HEAD_TRANSFER_DCT = "02";
    
    /***************************************************************************
     * Date Format
     **************************************************************************/

    /**
     * date format for the detail on Report
     */
    public static final String REPORT_DETAIL_DATE_FORMAT = "dd/MM/yyyy";

    /**
     * date format for printed date on Report
     */
    public static final String PRINT_REPORT_DATE_FORMAT = "dd/MM/yyyy HH:mm:ss";
    
    /***************************************************************************
     * TR_ACTV_METH_TYP
     **************************************************************************/
    /**
     * By TR
     */
    public static final String TR_ACTV_METH_TYP_TR = "1";

    /**
     * By Tags
     */
    public static final String TR_ACTV_METH_TYP_TAGS = "2";
    
    /***************************************************************************
     * TR_ITEM_TYP
     **************************************************************************/
    /**
     * CML
     */
    public static final String TR_ITEM_TYP_CML = "1";

    /**
     * Parts (Item No.)
     */
    public static final String TR_ITEM_TYP_PARTS = "2";

    /**
     * TR ITEM KIND is ITEM NO.
     */
    public static final String TR_TYPE_ITEM_NO = "2";

    /***************************************************************************
     * TR_RCV_METH_TYP
     **************************************************************************/
    /**
     * TR_RCV_METH_TYP_TR is By TR
     */
    public static final String TR_RCV_METH_TYP_TR = "1";

    /**
     * TR_RCV_METH_TYP_TAGS is By TAGS.
     */
    public static final String TR_RCV_METH_TYP_TAGS = "2";
    

    /***************************************************************************
     * TR_STATUS
     **************************************************************************/
    /**
     * TR Status TR was issued
     */
    public static final String TR_STATUS_ISSUED_TR = "20";

    /**
     * TR Status TR was Activated
     */
    public static final String TR_STATUS_ACTIVATE_TR = "30";

    /**
     * TR Status TR was Received
     */
    public static final String TR_STATUS_RECEIVED_TR = "40";

    /**
     * TR Status TR was Canceled
     */
    public static final String TR_STATUS_CANCEL_TR = "90";
    

    /***************************************************************************
     * L3 Report fixed value
     **************************************************************************/
    /**
     * TR Status
     */
    public static final String ATTR_TR_STATUS = "trStatus";
    
    /**
     * TR Kind
     */
    public static final String ATTR_TR_TYPE = "trKind";
    
    /**
     * Maxed part description
     */
    public static final String MIXED_PART_DESC = "Mixed Parts";
    /**
     * Mixed part flag for case mark
     */
    public static final String MIXED_PART_FLG = "M";

    /***************************************************************************
     * W3009 fixed value
     **************************************************************************/
    /**
     * CARRY_IN_ID_YOURSELF
     */
    public static final String CARRY_IN_ID_YOURSELF = "1";
    

    /***************************************************************************
     * Code key
     **************************************************************************/
    /**
     * TR Status
     */
    public static final String CD_TYPE_TR_STS = "24";
    
    /**
     * TR Kind
     */
    public static final String CD_TYPE_TR_TYPE = "25";
    

    /***************************************************************************
     * forward logical name
     **************************************************************************/
    
    /**
     * FORWARD_SUCCESS_W3006
     */
    public static final String FORWARD_SUCCESS_W3006 = "successPltz";
    /**
     * FORWARD_SUCCESS_W3008
     */
    public static final String FORWARD_SUCCESS_W3008 = "successItemNo";
    
    

    /***************************************************************************
     * message id
     **************************************************************************/
    
    /**
     * MessageID (NXS-E1-0351)
     */
    public static final String NXS_E1_0351 = "NXS-E1-0351";
    /**
     * MessageID (NXS-E1-0352)
     */
    public static final String NXS_E1_0352 = "NXS-E1-0352";
    /**
     * MessageID (NXS-E1-0353)
     */
    public static final String NXS_E1_0353 = "NXS-E1-0353";
    /**
     * MessageID (NXS-E1-0354)
     */
    public static final String NXS_E1_0354 = "NXS-E1-0354";
    
    /**
     * MessageID (NXS-E1-0355)
     */
    public static final String NXS_E1_0355 = "NXS-E1-0355";
    
    /**
     * MessageID (NXS-E1-0356)
     */
    public static final String NXS_E1_0356 = "NXS-E1-0356";
    
    /**
     * MessageID (NXS-E1-0357)
     */
    public static final String NXS_E1_0357 = "NXS-E1-0357";

    /**
     * MessageID (NXS-E1-0358)
     */
    public static final String NXS_E1_0358 = "NXS-E1-0358";
    
    /**
     * MessageID (NXS-E1-0359)
     */
    public static final String NXS_E1_0359 = "NXS-E1-0359";

    /**
     * MessageID (NXS-E1-0360)
     */
    public static final String NXS_E1_0360 = "NXS-E1-0360";
    
    /**
     * MessageID (NXS-E1-0362)
     */
    public static final String NXS_E1_0362 = "NXS-E1-0362";
    /**
     * MessageID (NXS-E1-0364)
     */
    public static final String NXS_E1_0364 = "NXS-E1-0364";
    /**
     * MessageID (NXS-E1-0365)
     */
    public static final String NXS_E1_0365 = "NXS-E1-0365";
    /**
     * MessageID (NXS-E1-3001)
     */
    public static final String NXS_E1_3001 = "NXS-E1-3001";
    /**
     * MessageID (NXS-E1-3004)
     */
    public static final String NXS_E1_3004 = "NXS-E1-3004";

    /**
     * MessageID (NXS-E1-3010)
     */
    public static final String NXS_E1_3010 = "NXS-E1-3010";

    /**
     * MessageID (NXS-E1-3012)
     */
    public static final String NXS_E1_3012 = "NXS-E1-3012";

    /**
     * MessageID (NXS-E1-3014)
     */
    public static final String NXS_E1_3014 = "NXS-E1-3014";
    //Thalerngsak modified for BHT
    /**
     * <p>NXS_E1_6002.</p>
     */
    public static final String NXS_E1_6002 = "1";
    //Thalerngsak modified for BHT
    /**
     * <p>NXS_E1_6003.</p>
     */
    public static final String NXS_E1_6003 = "4";
    /**
     * <p>NXS_E1_6004.</p>
     */
    public static final String NXS_E1_6004 = "NXS_E1_6004";
    //Thalerngsak modifiedd for BHT
    /**
     * <p>NXS_E1_6005.</p>
     */
    public static final String NXS_E1_6005 = "1";
    
    /**
     * <p>NXS_E1_6006.</p>
     */
    public static final String NXS_E1_6006 = "NXS_E1_6006";
    
    /**
     * <p>NXS_E1_6007.</p>
     */
    public static final String NXS_E1_6007 = "NXS_E1_6007";
    
    /**
     * <p>NXS_E1_6008.</p>
     */
    public static final String NXS_E1_6008 = "NXS_E1_6008";
    //Thalerngsak modified for BHT
    /**
     * <p>NXS_E1_6009.</p>
     */
    public static final String NXS_E1_6009 = "3";
    
    /**
     * <p>NXS_E1_6010.</p>
     */
    public static final String NXS_E1_6010 = "NXS_E1_6010";
    
    /**
     * <p>NXS_E1_6011.</p>
     */
    public static final String NXS_E1_6011 = "NXS_E1_6011";
    /**
     * <p>NXS_E1_6012.</p>
     */
    public static final String NXS_E1_6012 = "NXS_E1_6012";
    //kimura add UT147
    /**
     * <p>NXS_E1_6013.</p>
     */
    public static final String NXS_E1_6013 = "NXS_E1_6013";
    //kimura add UT147
    /**
     * MessageID (NXS-E7-3000)
     */
    public static final String NXS_E7_3000 = "NXS-E7-3000";
    
    /**
     * MessageID (NXS-E7-3007)
     */
    public static final String NXS_E7_3007 = "NXS-E7-3007";
    
    /**
     * MessageID (NXS-E7-3009)
     */
    public static final String NXS_E7_3009 = "NXS-E7-3009";
    /**
     * MessageID (NXS-E7-3010)
     */
    public static final String NXS_E7_3010 = "NXS-E7-3010";
    /**
     * MessageID (NXS-E7-3011)
     */
    public static final String NXS_E7_3011 = "NXS-E7-3011";
    /**
     * MessageID (NXS-I1-3001)
     */
    public static final String NXS_I1_3001 = "NXS-I1-3001";
    
    /**
     * MessageID (NXS-I1-3002)
     */
    public static final String NXS_I1_3002 = "NXS-I1-3002";
    
    /**
     * MessageID (NXS-I1-3003)
     */
    public static final String NXS_I1_3003 = "NXS-I1-3003";

    /*****************************************************************************
     * bht ws id
     *****************************************************************************/
    /**
     * Web ServiceID (WS3501)
     */
    public static final String WS_ID_WS3501 = "WS3501";
    
    /**
     * Web ServiceID (WS3502)
     */
    public static final String WS_ID_WS3502 = "WS3502";
    
    /**
     * Web ServiceID (WS3503)
     */
    public static final String WS_ID_WS3503 = "WS3503";
    
    /**
     * Web ServiceID (WS3504)
     */
    public static final String WS_ID_WS3504 = "WS3504";
    
    /**
     * WebサービスID (WS3505)
     */
    public static final String WS_ID_WS3505 = "WS3505";
    
    /**
     * Web ServiceID (WS3506)
     */
    public static final String WS_ID_WS3506 = "WS3506";
    
    /**
     * Web ServiceID (WS3507)
     */
    public static final String WS_ID_WS3507 = "WS3507";

    /*****************************************************************************
     * report id
     *****************************************************************************/
    /**
     * Report ID (L3001)
     */
    public static final String REPORT_ID_L3001 = "L3001";
    
    /**
     * Report ID (L3002)
     */
    public static final String REPORT_ID_L3002 = "L3002";

    /**
     * Report ID (L3003)
     */
    public static final String REPORT_ID_L3003 = "L3003";

    /**
     * Report ID (L3004)
     */
    public static final String REPORT_ID_L3004 = "L3004";

    /*****************************************************************************
     * permit function id
     *****************************************************************************/
    /**
     * Authorization features ID (TR - see)
     */
    public static final String PERMIT_FUNC_ID_W3001B = "W3001B";
    
    /**
     * Authorization features ID (TR - updated)
     */
    public static final String PERMIT_FUNC_ID_W3001R = "W3001R";
    
    /**
     * Authorization features ID (TR - see)
     */
    public static final String PERMIT_FUNC_ID_W3009B = "W3009B";
    
    /**
     * Authorization features ID (TR - updated)
     */
    public static final String PERMIT_FUNC_ID_W3009R = "W3009R";
    
    /***************************************************************************
     * Error type code for BHT ws3504
     **************************************************************************/
    /**
     * <p>Item No. is not exists in ITEM specila info</p>
     */
    public static final String ITEM_DOSE_NOT_EXISTS = "2";
    
    /*****************************************************************************
     * Execute command w6009
     *****************************************************************************/
    /**
     * Register 
     */
    public static final String W6009_CMD_REGIST = "1";
    
    /**
     * Cancel
     */
    public static final String W6009_CMD_CANCEL = "2";
    
    /*****************************************************************************
     * CML/Mix Tag Error Report
     * Flag for error check "MA/Mix Tag Not Found"
     * UT298 ADD
     *****************************************************************************/
    /**
     * Check OK.
     */
    public static final String MNF_FLAG_OK = "Y";
    
    /**
     * Check NG.
     */
    public static final String MNF_FLAG_NG = "N";
    //end

    /**
     * The key of the request attribute which stores the pulldown list of orderBy
     */
    public static final String ATTR_ORDER_BY = "orderBy";

    /**
     * Flag value (Kit)
     * <br />???? (Kit)
     */
    public static final String FLAG_KIT = "Kit";

    public static final String ORDER_BY = "19";

    /*****************************************************************************
     * Constants for Transfer to GINV job.
     * <br />船積書類GINV送信ジョブで使用する定数。
     *****************************************************************************/

    /**
     * Transfer to GINV work directory
     */
    public static final String TRANS_GINV_PROCESSING_DIR = "/data/app/snd/ginv/processing";

    /**
     * Transfer to GINV FTM complete directory
     */
    public static final String TRANS_GINV_COMPLETE_DIR = "/data/app/snd/ginv/complete";

    /**
     * Transfer to GINV command directry
     */
    public static final String TRANS_GINV_COMMAND_DIR = "/data/app/batch/service";

    /**
     * Transfer to GINV FTM send directory
     */
    public static final String TRANS_GINV_FTM_SEND_DIR = "/TACTICS/FTM/SND";

    /**
     * Transfer to GINV resource key for FTM file ID
     */
    public static final String TRANS_GINV_RESOURCE_KEY_FTM_FILE_ID = "ftm.fileId.ginv";

    /**
     * Transfer to GINV command file name(without extention)
     */
    public static final String TRANS_GINV_COMMAND_NAME_NO_EXT = "send2ginv";

    /**
     * Transfer to GINV process type - invoice
     */
    public static final String TRANS_GINV_PROC_TYP_INVOICE = "1";

    /**
     * Transfer to GINV request record status - Not yet processing
     */
    public static final String TRANS_GINV_REQ_REC_STATUS_NOT_YET = "0";

    /**
     * Transfer to GINV request record status - Done
     */
    public static final String TRANS_GINV_REQ_REC_STATUS_DONE = "1";

    /**
     * Transfer to GINV process type - shipping ACT
     */
    public static final String TRANS_GINV_PROC_TYP_SHIPPING_ACT = "2";

    /**
     * Transfer to GINV process type - B/L
     */
    public static final String TRANS_GINV_PROC_TYP_BILLD = "3";

    /**
     * Transfer to GINV process type - CLP
     */
    public static final String TRANS_GINV_PROC_TYP_CLP = "4";

    /**
     * Transfer to GINV process type - all doc complete
     */
    public static final String TRANS_GINV_PROC_TYP_ALL_DOC = "5";

    /**
     * Transfer to GINV data file name - Invoice
     */
    public static final String TRANS_GINV_DATA_FILE_INV = "F010INV";

    /**
     * Transfer to GINV data file name - Packing List CML
     */
    public static final String TRANS_GINV_DATA_FILE_CML = "F020CML";

    /**
     * Transfer to GINV data file name - Packing List Item No.
     */
    public static final String TRANS_GINV_DATA_FILE_CMLITEM = "F030CMLITEM";

    /**
     * Transfer to GINV data file name - Invoice Item No.
     */
    public static final String TRANS_GINV_DATA_FILE_INVITEM = "F040INVITEM";

    /**
     * Transfer to GINV data file name - Container
     */
    public static final String TRANS_GINV_DATA_FILE_CTNR = "F050CTNR";

    /**
     * Transfer to GINV data file name - Shipping ACT
     */
    public static final String TRANS_GINV_DATA_FILE_SHPACT = "F060SHPACT";

    /**
     * Transfer to GINV data file name - Attached Document Control
     */
    public static final String TRANS_GINV_DATA_FILE_ATTCTL = "F070ATTCTL";

    /**
     * Transfer to GINV input control type
     * System which can transfer all document files except E/D and I/D (e.g.: NEXUS)
     */
    public static final String TRANS_GINV_INPUT_CTL_TYP_NEXUS = "1";

    /**
     * Transfer to GINV result code of utiSend -  success
     */
    public static final int TRANS_GINV_UTLSEND_RESULT_SUCCESS = 0;

    /**
     * Transfer to GINV CLP weight unit code
     */
    public static final String TRANS_GINV_CLP_WEIGHT_UNIT_CD = "KG";

    /**
     * Transfer to GINV CLP volume unit code
     */
    public static final String TRANS_GINV_CLP_VOLUME_UNIT_CD = "CR";

    /**
     * Transfer to GINV request ID file prefix
     */
    public static final String TRANS_GINV_REQ_ID_FILE_PREFIX = "~";

    /*****************************************************************************
     * <br />受注アップロード機能で使用する定数。
     * MGT575 ADD
     *****************************************************************************/
    /**
     * Order upload request status:Processing
     */
    public static final String ODR_UPLOAD_REQ_STATUS_UNPROCESSED = "1";

    /**
     * Order upload request status:Complate
     */
    public static final String ODR_UPLOAD_REQ_STATUS_COMPLETE = "2";

    /**
     * Order upload request status:Complate
     */
    public static final String ODR_UPLOAD_REQ_STATUS_COMPLETE_WARN = "3";

    /**
     * Order upload request status:CIGMA Night Batch in progress
     */
    public static final String ODR_UPLOAD_REQ_STATUS_CIGMA_NB = "8";

    /**
     * Order upload request status:Error
     */
    public static final String ODR_UPLOAD_REQ_STATUS_ERROR = "9";

    /**
     * Order upload download type:Error CSV
     */
    public static final String ODR_UPLOAD_DOWNLOAD_TYP_ERROR = "1";

    /**
     * Order upload download type:Blank CSV
     */
    public static final String ODR_UPLOAD_DOWNLOAD_TYP_BLANK = "2";

    /**
     * Order upload File ID:Blank CSV
     */
    public static final String ODR_UPLOAD_FILE_ID_BLANK = "00000000000000000001";

    /**
     * Transfer to GINV job ID abbreviation
     */
    public static final String ODR_UPLOAD_JOB_ID_ABB = "B0200";

    /**
     * Add/追加
     */
    public static final String ODR_UPLOAD_PROC_TYP_ADD = "1";

    /**
     * Change/変更
     */
    public static final String ODR_UPLOAD_PROC_TYP_CHG = "2";

    /**
     * ERROR TYPE (0: normal)
     * <br />エラー区分 (0:正常)
     */
    public static final String ODR_UPLOAD_ERROR_TYP_NORMAL = "0";

    /**
     * ERROR TYPE (1: only warning)
     * <br />エラー区分 (1:警告のみ)
     */
    public static final String ODR_UPLOAD_ERROR_TYP_WARNING = "1";

    /**
     * ERROR TYPE (2: those with an error)
     * <br />エラー区分 (2:エラーあり)
     */
    public static final String ODR_UPLOAD_ERROR_TYP_ERROR = "2";

    /**
     * CSV new line string
     * <br />CSV改行文字
     */
    public static final String ODR_UPLOAD_CSV_NEWLINE = "\r\n";

    /**
     * Error information of error file Column title
     * <br />エラーファイルのエラー情報列タイトル
     */
    public static final String ODR_UPLOAD_TITLE_ERROR_INFO = "ERROR CODE";

    /**
     * Order upload CSV data record max.
     */
    public static final int ODR_UPLOAD_DATA_RECORD_MAX = 10000;
}
