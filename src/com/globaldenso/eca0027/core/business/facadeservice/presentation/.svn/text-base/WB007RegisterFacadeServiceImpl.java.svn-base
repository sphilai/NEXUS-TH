/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CHECK_ON;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ITEM_NO_GRP_D;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ITEM_NO_GRP_DG;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_WB007;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0002;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0060;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0018;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0026;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0027;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0030;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0031;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0032;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0033;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0034;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0035;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0038;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0142;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0143;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0150;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_W1_0001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_W1_0002;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_W1_0003;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.WB001OdrRcvDomain;
import com.globaldenso.eca0027.core.business.domain.WB007CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.WB007ListDomain;
import com.globaldenso.eca0027.core.business.domain.WB007UpdateDomain;
import com.globaldenso.eca0027.core.business.domain.WsB005ResultDomain;
import com.globaldenso.eca0027.core.business.domain.WsB005ResultItemDomain;
import com.globaldenso.eca0027.core.business.domain.WsB005ResultSubItemDomain;
import com.globaldenso.eca0027.core.business.service.WB001OdrRcvService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractTransactFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.DateUtil;
import com.globaldenso.gscm.framework.util.Validator;

/**
 * This is an implement class of the Facade service to Update action of a Last Digit Change Register Screen.
 * <br />品番末尾変更登録画面のUpdateアクションに対するFacadeサービスの実装クラスです。
 * 
 * @version $Revision: 11243 $
 */
public class WB007RegisterFacadeServiceImpl
    extends
    AbstractTransactFacadeService<WB007UpdateDomain, WB007UpdateDomain> {

    /**
     * Common service
     * <br />共通サービス
     */
    protected CommonService commonService;
    
    /**
     * Ordering business services
     * <br />受注業務サービス
     */
    protected WB001OdrRcvService wb001OdrRcvService;

    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public WB007RegisterFacadeServiceImpl() {
    }

    /**
     * Setter method for commonService.
     *
     * @param commonService Set for commonService
     */
    public void setCommonService(CommonService commonService) {
        this.commonService = commonService;
    }
    
    /**
     * Setter method for WB001OdrRcvServic.
     * 
     * @param wb001OdrRcvService Set for wb001OdrRcvService
     */
    public void setWb001OdrRcvService(WB001OdrRcvService wb001OdrRcvService) {
        this.wb001OdrRcvService = wb001OdrRcvService;
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * No Action
     * 
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected WB007UpdateDomain filterDomain(WB007UpdateDomain updateDomain)
        throws GscmApplicationException, ApplicationException {
        return updateDomain;
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - Common error checking
     *       Screen definition document_ECA0027_W2001_Palletize Instruction Main Screen.xls "a screen item definition" is referred to for details.
     * 
     * - 共通エラーチェック
     *     詳細は画面定義書_ECA0027_W2001_Palletize Instruction Main Screen.xls「画面項目定義」を参照
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(WB007UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {

        // Error list
        // エラーリスト
        List<MessageDomain> errList = new ArrayList<MessageDomain>();

        // The list of list domains is acquired.
        // リストドメインのリストを取得
        List<? extends WB007ListDomain> listDomainList = updateDomain.getListDomainList();

        // Unary eye checked object property
        // 単項目チェック対象プロパティ
        String[] properties = {"odrQty"};

        // The list of list domains is checked.
        // リストドメインのリストをチェック
        if (listDomainList != null && listDomainList.size() > 0) {
            for (Iterator<? extends WB007ListDomain> i = listDomainList.iterator(); i.hasNext();) {
                WB007ListDomain listDomain = i.next();

                Validator<WB007ListDomain> valid = new Validator<WB007ListDomain>(
                    listDomain, "wb007ListDomainList", Integer.parseInt(listDomain.getIndex()));

                valid.isValidateProperties(properties, SCREEN_ID_WB007);
                
                // Error registration
                // エラー登録
                if (0 < valid.getErrList().size()) {
                    errList.addAll(valid.getErrList());
                }
                // flg off
                listDomain.setWarningFlgOdrQty("");
                listDomain.setWarningFlgItemNo("");
            }
        }
        
        // flg off
        updateDomain.getCriteriaDomain().setWarningFlgCustomerCd("");
        
        // Error check
        // エラー確認
        if (0 < errList.size()) {
            throw new ValidationException(errList);
        }
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * no action
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(WB007UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // no action
        // 処理なし
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - common specifications : this is a check during processing in the CIGMA night.   (behavior in a CIGMA night batch)  
     *       This is a call about {@link WB001OdrRcvService#validateDatabaseCigmaAvailable (boolean, String)}.
     *
     * - Ordering company existence check (NEXUS Company Master)
     *       This is a call about {@link WB001OdrRcvService#validateDatabaseTmNxsCompOnLstDgtChgRegister (String, WB001OdrRcvDomain)}.
     *
     * - SHIP-TO-NAME acquisition   Existence check
     *       This is a call about * {@link WB001OdrRcvService#validateDatabaseTmCigmaShipToXrefOnLstDgtChgRegister(String, String, String, WB001OdrRcvDomain)}.
     *
     * - ITEM-NO existence check for export
     * {@link WB001OdrRcvService#validateDatabaseTmExpItemNoSpInfoOnLstDgtChgRegister(String, String, String, String, String, Date, BigDecimal[])}.
     *
     * - ITEM-NO existence check for export control
     *       This is a call about * {@link WB001OdrRcvService#validateDatabaseTmExpFormalitiItemNoOnLstDgtChgRegister(String, String, Date)}.
     *
     * - Packing CD related check
     *       This is a call about {@link WB001OdrRcvService#validateConsistencyPkgCd (String, String)}.
     *
     * - Web service "ECA0027_WS_B003:EDI-Receive-Order end change header check"
     *       This is a call about * {@link WB001OdrRcvService#validateDatabaseWsB003OnLstDgtChgRegister(String, String, String, String, Date, String, String)}.
     *
     * - ITEM-NO existence check for export
     * {@link WB001OdrRcvService#validateDatabaseTmExpItemNoSpInfoOnLstDgtChgRegisterByDetail(String, String, String, String, String, Date)}.
     *
     * - The amount of total numbers eternal check
     *       This is a call about {@link WB001OdrRcvService#validateConsistencyNewQtyOrderQty (BigDecimal, BigDecimal)}.
     *
     * - QUANTITY validity check
     *       This is a call about {@link WB001OdrRcvService#validateConsistencyNewQtyAllocQty (BigDecimal, BigDecimal)}.
     *
     * - Lot multiple check
     *       This is a call about {@link WB001OdrRcvService#validateConsistencyNewQtyQtyCarton (BigDecimal, BigDecimal)}.
     *
     * - Web service "ECA0027_WS_B005:EDI-Receive-Order end change detailed check"
     * {@link WB001OdrRcvService#validateDatabaseWsB005OnLstDgtChgRegister(String, String, String, String, Date, List, List, WsB005ResultDomain)}.
     * 
     * - 共通仕様：CIGMA夜間処理中チェック　（CIGMA夜間バッチ中の振る舞い）
     *     {@link WB001OdrRcvService#validateDatabaseCigmaAvailable(boolean, String)}を呼出
     *     
     * - 受注会社存在チェック（NEXUS会社原単位）
     *     {@link WB001OdrRcvService#validateDatabaseTmNxsCompOnLstDgtChgRegister(String, WB001OdrRcvDomain)}を呼出
     *     
     * - 送荷先名称取得　存在チェック
     *     {@link WB001OdrRcvService#validateDatabaseTmCigmaShipToXrefOnLstDgtChgRegister(String, String, String, WB001OdrRcvDomain)}を呼出
     *     
     * - 輸出対象品目番号存在チェック
     *     {@link WB001OdrRcvService#validateDatabaseTmExpItemNoSpInfoOnLstDgtChgRegister(String, String, String, String, String, Date, BigDecimal[])}を呼出
     *     
     * - 輸出規制対象品目番号存在チェック
     *     {@link WB001OdrRcvService#validateDatabaseTmExpFormalitiItemNoOnLstDgtChgRegister(String, String, Date)}を呼出
     *     
     * - Webサービス「ECA0027_WS_B003：EDI受注末尾変更ヘッダチェック」
     *     {@link WB001OdrRcvService#validateDatabaseWsB003OnLstDgtChgRegister(String, String, String, String, Date, String, String)}を呼出
     *     
     * - 輸出対象品目番号存在チェック
     *     {@link WB001OdrRcvService#validateDatabaseTmExpItemNoSpInfoOnLstDgtChgRegisterByDetail(String, String, String, String, String, Date)}を呼出
     *     
     * - 包装コード関連チェック
     *     {@link WB001OdrRcvService#validateConsistencyPkgCd(String, String)}を呼出
     *     
     * - 合計数量不変チェック
     *     {@link WB001OdrRcvService#validateConsistencyNewQtyOrderQty(BigDecimal, BigDecimal)}を呼出
     *     
     * - 数量妥当性チェック
     *     {@link WB001OdrRcvService#validateConsistencyNewQtyAllocQty(BigDecimal, BigDecimal)}を呼出
     *     
     * - ロット倍数チェック
     *     {@link WB001OdrRcvService#validateConsistencyNewQtyQtyCarton(BigDecimal, BigDecimal)}を呼出
     *     
     * - Webサービス「ECA0027_WS_B005：EDI受注末尾変更明細チェック」
     *     {@link WB001OdrRcvService#validateDatabaseWsB005OnLstDgtChgRegister(String, String, String, String, Date, List, List, WsB005ResultDomain)}を呼出
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(WB007UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        // Acquisition of Date format
        // 日付フォーマットの取得
        String screenDateFormat = updateDomain.getScreenDateFormat();
        
        // Acquisition of a condition condition domain
        // 条件条件ドメインの取得
        WB007CriteriaDomain criteriaDomain = updateDomain.getCriteriaDomain();
        
        // Acquisition of listDomainList
        // listDomainListの取得
        List<? extends WB007ListDomain> listDomainList = updateDomain.getListDomainList();
        
        // Create of an error list
        // エラーリストの作成
        List<MessageDomain> errorList = new ArrayList<MessageDomain>();
        
        // The domain of return VALUE setting important point
        // 戻り値設定要のドメイン
        WB001OdrRcvDomain tmpDomain = new WB001OdrRcvDomain();
        
        // Setting of a check item
        // チェック項目の設定
        String rcvOdrCompCd = criteriaDomain.getRcvOdrCompCd();
        String customerCd = criteriaDomain.getCustomerCd();
        String lgcyShipTo = criteriaDomain.getLgcyShipTo();
        String trnsCd = criteriaDomain.getTrnsCd();
        Date shippingDt = DateUtil.parseDate(criteriaDomain.getShippingDt(), screenDateFormat);
        Date etdDueDt = DateUtil.parseDate(listDomainList.get(0).getEtdDueDt(), screenDateFormat);
        String itemNoOrg = criteriaDomain.getItemNoOrg();
        String pkgCd = convertBlankToSpace(criteriaDomain.getPkgCd());
        
        Date now = commonService.searchCigmaAds(rcvOdrCompCd);
        
        // common specifications: This is the check   (behavior in a CIGMA night batch) during processing in the CIGMA night.  
        // 共通仕様：CIGMA夜間処理中チェック （CIGMA夜間バッチ中の振る舞い）
        if (!wb001OdrRcvService.validateDatabaseCigmaAvailable(false, rcvOdrCompCd)) {
            MessageDomain msg = new MessageDomain("", NXS_E1_0060, null);
            errorList.add(msg);
        }

        // Ordering company existence check (NEXUS Company Master)  
        // 受注会社存在チェック（NEXUS会社原単位）
        if (!wb001OdrRcvService.validateDatabaseTmNxsCompOnLstDgtChgRegister(rcvOdrCompCd, tmpDomain)) {
            MessageDomain msgRcvOdrCompCd = new MessageDomain("wb007CriteriaDomain.rcvOdrCompCd", NXS_E7_0031, null);
            errorList.add(msgRcvOdrCompCd);
            throw new ValidationException(errorList);
        } else {
            criteriaDomain.setItemNoGrp(tmpDomain.getItemNoGrp());
        }

        // SHIP-TO-NAME acquisition   Existence check
        // 送荷先名称取得 存在チェック
        if (!wb001OdrRcvService.validateDatabaseTmCigmaShipToXrefOnLstDgtChgRegister(rcvOdrCompCd, customerCd, lgcyShipTo, tmpDomain)) {
            MessageDomain msgRcvOdrCompCd = new MessageDomain("wb007CriteriaDomain.rcvOdrCompCd", NXS_E7_0032, null);
            MessageDomain msgCustomerCd = new MessageDomain("wb007CriteriaDomain.customerCd", null, null);
            MessageDomain msgLgcyShipTo = new MessageDomain("wb007CriteriaDomain.lgcyShipTo", null, null);

            errorList.add(msgRcvOdrCompCd);
            errorList.add(msgCustomerCd);
            errorList.add(msgLgcyShipTo);
            throw new ValidationException(errorList);
        } else {
            criteriaDomain.setShipToNm(tmpDomain.getShipToNm());
        }

        // The list of list domains is checked.
        // リストドメインのリストをチェック
        for (Iterator<? extends WB007ListDomain> i = listDomainList.iterator(); i.hasNext();) {
            WB007ListDomain listDomain = i.next();
            String index = listDomain.getIndex();
            // Setting of a check item
            // チェック項目の設定
            BigDecimal newQty = convertBigDecimal(listDomain.getOdrQty());

            if (!newQty.equals(BigDecimal.ZERO)) {
                
                Object[] params = {
                    "(" + listDomain.getItemNo() + ")"
                };
                
                // ITEM-NO existence check for export
                // 輸出対象品目番号存在チェック
                if (!wb001OdrRcvService.validateDatabaseTmExpItemNoSpInfo(
                        rcvOdrCompCd, itemNoOrg, pkgCd, customerCd, lgcyShipTo, now, null)) {
                    MessageDomain msg = new MessageDomain("wb007ListDomainList[" + index + "].itemNo", NXS_E7_0033, params);
                    errorList.add(msg);
                }
                
                // ITEM-NO existence check for export control
                // 輸出規制対象品目番号存在チェック
                if (!wb001OdrRcvService.validateDatabaseTmExpFormalitiItemNo(rcvOdrCompCd,
                    listDomain.getItemNo(), etdDueDt, null)) {
                    MessageDomain msg = new MessageDomain("wb007ListDomainList[" + index + "].itemNo", NXS_E7_0034, params);
                    errorList.add(msg);
                }
            }
        }
        
        // Packing CD related check
        // 包装コード関連チェック
        String itemNoGrp = criteriaDomain.getItemNoGrp();
        if (!wb001OdrRcvService.validateConsistencyPkgCd(pkgCd.trim(), itemNoGrp)) {
            String msgId = "";
            
            if (StringUtils.equals(itemNoGrp, ITEM_NO_GRP_DG) && !StringUtils.equals(" ", pkgCd)) {
                msgId = NXS_E7_0142;
            } else if (StringUtils.equals(itemNoGrp, ITEM_NO_GRP_D) && StringUtils.equals(" ", pkgCd)) {
                msgId = NXS_E7_0143;
            }
            
            if (!StringUtils.isBlank(msgId)) {
                MessageDomain msgShipperCd = new MessageDomain("wb007CriteriaDomain.pkgCd", msgId, null);
                errorList.add(msgShipperCd);
                throw new ValidationException(errorList);
            }
        }
        
        // Check of errors
        // エラーの確認
        if (errorList.size() > 0) {
            throw new ValidationException(errorList);
        }
        
        
        // Web service "ECA0027_WS_B003:EDI-Receive-Order end change header check"
        // Webサービス「ECA0027_WS_B003：EDI受注末尾変更ヘッダチェック」
        List<String> wsB003ErrCdList = wb001OdrRcvService.validateDatabaseWsB003OnLstDgtChgRegister(
            rcvOdrCompCd, customerCd, lgcyShipTo, trnsCd, shippingDt, itemNoOrg, pkgCd);
        
        // An error message create of Web service "ECA0027_WS_B003:EDI-Receive-Order end change header check"
        // Webサービス「ECA0027_WS_B003：EDI受注末尾変更ヘッダチェック」のエラーメッセージ作成
        if (!wsB003ErrCdList.isEmpty()) {
            for (String errCd : wsB003ErrCdList) {
                if (NXS_E7_0035.equals(errCd)) {
                    MessageDomain msgCustomerCd = new MessageDomain("wb007CriteriaDomain.customerCd", errCd, null);
                    MessageDomain msgLgcyShipTo = new MessageDomain("wb007CriteriaDomain.lgcyShipTo", null, null);
                    errorList.add(msgCustomerCd);
                    errorList.add(msgLgcyShipTo);
                    
                    criteriaDomain.setWarningFlgCustomerCd("E");
                } else if (NXS_E7_0027.equals(errCd)) {
                    MessageDomain msgCustomerCd = new MessageDomain("wb007CriteriaDomain.customerCd", errCd, null);
                    MessageDomain msgLgcyShipTo = new MessageDomain("wb007CriteriaDomain.lgcyShipTo", null, null);
                    errorList.add(msgCustomerCd);
                    errorList.add(msgLgcyShipTo);
                    
                    criteriaDomain.setWarningFlgCustomerCd("E");
                } else if (NXS_E7_0030.equals(errCd)) {
                    Object[] params = {""};
                    MessageDomain msg = new MessageDomain("wb007CriteriaDomain.itemNoOrg", errCd, params);
                    errorList.add(msg);
                } else {
                    // In order to prevent leak when the message of WsB003 is added in the future
                    // 将来的にWsB003のメッセージが追加になった場合の漏れを防止する為
                    MessageDomain msg = new MessageDomain("", errCd, null);
                    errorList.add(msg);
                }
            }
        }
        
        // Check of errors
        // エラーの確認
        if (errorList.size() > 0) {
            throw new ValidationException(errorList);
        }
        
        // The list for WSB005 invoke
        // WSB005呼び出しのためのリスト
        List<String> indexList = new ArrayList<String>();
        List<String> itemNoList = new ArrayList<String>();
        
        // The list of list domains is checked.
        // リストドメインのリストをチェック
        for (Iterator<? extends WB007ListDomain> i = listDomainList.iterator(); i.hasNext();) {
            WB007ListDomain listDomain = i.next();
            
            // Setting of a check item
            // チェック項目の設定
            BigDecimal newQty = convertBigDecimal(listDomain.getOdrQty());
            BigDecimal odrQtyHidden = new BigDecimal(listDomain.getOdrQtyHidden());
            
            if (!newQty.equals(odrQtyHidden)) {
                // ITEM-NO existence check for export
                // 輸出対象品目番号存在チェック
                if (!wb001OdrRcvService.validateDatabaseTmExpItemNoSpInfo(
                        rcvOdrCompCd, listDomain.getItemNo(), pkgCd, customerCd, lgcyShipTo, now, null)) {
                    Object[] params = {""};
                    MessageDomain msg = new MessageDomain(null, NXS_E1_0002, params);
                    errorList.add(msg);
                }
                // The list create for WSB005 invoke
                // WSB005呼び出しのためのリスト作成
                indexList.add(listDomain.getIndex());
                itemNoList.add(listDomain.getItemNo());
            }
        }
        
        // Setting of a check item
        // チェック項目の設定
        BigDecimal odrQty = new BigDecimal(criteriaDomain.getOdrQty());
        
        // The sum total of NEW QTY of detailed area
        // 明細エリアのNEW QTYの合計
        BigDecimal sumNewQty = BigDecimal.ZERO;
        
        // Information modify flag
        // 情報変更フラグ
        boolean modInfoFlg = false;
        List<MessageDomain> subErrorList = new ArrayList<MessageDomain>();
        
        // The list of list domains is checked.
        // リストドメインのリストをチェック
        for (Iterator<? extends WB007ListDomain> i = listDomainList.iterator(); i.hasNext();) {
            WB007ListDomain listDomain = i.next();
            
            // Setting of a check item
            // チェック項目の設定
            String idx = listDomain.getIndex();
            String itemNo = listDomain.getItemNo();
            BigDecimal newQty = convertBigDecimal(listDomain.getOdrQty());
            BigDecimal pltzAllocQty = new BigDecimal(listDomain.getPltzAllocQty());
            BigDecimal shippingLot = new BigDecimal(listDomain.getShippingLot());
            BigDecimal oldQty = convertBigDecimal(listDomain.getOdrQtyHidden());
            
            // A totalled value calculation of NEW QTY of detailed area
            // 明細エリアのNEW QTYの合計値算出
            sumNewQty = sumNewQty.add(newQty);
            
            // QUANTITY validity check
            // 数量妥当性チェック
            if (!wb001OdrRcvService.validateConsistencyNewQtyAllocQty(newQty, pltzAllocQty)) {
                Object[] params = {itemNo};
                MessageDomain msg = new MessageDomain("wb007ListDomainList[" + idx + "].odrQty", NXS_E7_0018, params);
                subErrorList.add(msg);
                
                listDomain.setWarningFlgOdrQty("E");
            }
            
            // Lot multiple check
            // ロット倍数チェック
            if (!wb001OdrRcvService.validateConsistencyNewQtyQtyCarton(newQty, shippingLot)) {
                Object[] params = {itemNo};
                MessageDomain msg = new MessageDomain("wb007ListDomainList[" + idx + "].odrQty", NXS_W1_0001, params);
                subErrorList.add(msg);
                
                if (StringUtils.isEmpty(listDomain.getWarningFlgOdrQty())){
                    listDomain.setWarningFlgOdrQty("W");
                }
                
            }
            
            if (!newQty.equals(oldQty)){
                modInfoFlg = true;
            }
        }
        
        // Information modify check
        // 情報変更チェック
        if (!wb001OdrRcvService.validateConsistencyNewQtyOrderQtyHidden(modInfoFlg)) {
            MessageDomain msg = new MessageDomain("", NXS_E7_0038, null);
            errorList.add(msg);
        }
        
        // The amount of total numbers eternal check
        // 合計数量不変チェック
        if (!wb001OdrRcvService.validateConsistencyNewQtyOrderQty(sumNewQty, odrQty)) {
            // 1 line message is set up.
            // 1行目のメッセージを設定
            String idx = listDomainList.get(0).getIndex();
            MessageDomain msg1 = new MessageDomain("wb007ListDomainList[" + idx + "].odrQty", NXS_E7_0026, null);
            errorList.add(msg1);
            listDomainList.get(Integer.parseInt(idx)).setWarningFlgOdrQty("E");
            
            // The message of 2 line henceforth is set up.
            // 2行目以降のメッセージを設定
            for (int i = 1; i < listDomainList.size(); i++) {
                idx = listDomainList.get(i).getIndex();
                MessageDomain msg2 = new MessageDomain("wb007ListDomainList[" + idx + "].odrQty", null, null);
                errorList.add(msg2);
                listDomainList.get(Integer.parseInt(idx)).setWarningFlgOdrQty("E");
            }
        }
        
        if (!subErrorList.isEmpty()) {
            errorList.addAll(subErrorList);
        }
        
        // The check of ignoreWarning
        // ignoreWarningの確認
        String warningMsgWord = "NXS-W";
        if (errorList != null && errorList.size() > 0) {
            boolean throwFlg = false;
            for (Iterator<MessageDomain> i = errorList.iterator(); i.hasNext();) {
                MessageDomain msg = i.next();
                // The message which starts except NXS-W* exists, it throw(s).
                // NXS-W*以外で始まるメッセージが存在する場合のみ、throwする。
                if (msg.getKey() != null && !msg.getKey().startsWith(warningMsgWord)) {
                    throwFlg = true;
                    break;
                }
            }
            
            // Check of errors
            // エラーの確認
            if (throwFlg) {
                throw new ValidationException(errorList);
            }
        }
        
        // Web service "ECA0027_WS_B005:EDI-Receive-Order end change detailed check"
        // Webサービス「ECA0027_WS_B005：EDI受注末尾変更明細チェック」
        WsB005ResultDomain wsB005Result = new WsB005ResultDomain();
        List<String> wsB005ErrCdList = 
            wb001OdrRcvService.validateDatabaseWsB005OnLstDgtChgRegister(
                rcvOdrCompCd, customerCd, lgcyShipTo, trnsCd, shippingDt, indexList, itemNoList, wsB005Result);
        
        // An error message create of Web service "ECA0027_WS_B005:EDI-Receive-Order end change detailed check"
        // Webサービス「ECA0027_WS_B005：EDI受注末尾変更明細チェック」のエラーメッセージ作成
        if (!wsB005ErrCdList.isEmpty()) {
            for (WsB005ResultItemDomain customerOrder : wsB005Result.getCustomerOrderList()) {
                // Index of screen detailed area
                // 画面明細エリアのIndex
                String index = customerOrder.getIndex();
                if (customerOrder.getErrorList() != null && customerOrder.getErrorList().size() > 0) {
                    for (WsB005ResultSubItemDomain error : customerOrder.getErrorList()) {
                        String errCode = error.getCode();
                        if (NXS_E7_0150.equals(errCode)){
                            StringBuffer param = new StringBuffer("");
                            for (String p : error.getParamList()){
                                param = new StringBuffer(p);
                                break;
                            }
                            Object[] params = {param.toString()};
                            MessageDomain msgItemNo = new MessageDomain("wb007ListDomainList[" + index + "].itemNo", errCode, params);
                            errorList.add(msgItemNo);
                            
                            listDomainList.get(Integer.parseInt(index)).setWarningFlgItemNo("E");
                        } else if (NXS_W1_0002.equals(errCode)){
                            StringBuffer param = new StringBuffer("");
                            for (String p : error.getParamList()){
                                param = new StringBuffer("(" + p + ")");
                                break;
                            }
                            Object[] params = {param.toString()};
                            MessageDomain msgCustomerCd = new MessageDomain("wb007CriteriaDomain.customerCd", errCode, params);
                            MessageDomain msgItemNo = new MessageDomain("wb007ListDomainList[" + index + "].itemNo", null, null);
                            errorList.add(msgCustomerCd);
                            errorList.add(msgItemNo);
                            
                            if (StringUtils.isEmpty(criteriaDomain.getWarningFlgCustomerCd())){
                                criteriaDomain.setWarningFlgCustomerCd("W");
                            }
                            if (StringUtils.isEmpty(listDomainList.get(Integer.parseInt(index)).getWarningFlgItemNo())) {
                                listDomainList.get(Integer.parseInt(index)).setWarningFlgItemNo("W");
                            }
                        } else if (NXS_E7_0030.equals(errCode)) {
                            StringBuffer param = new StringBuffer("");
                            for (String p : error.getParamList()){
                                param = new StringBuffer("(" + p + ")");
                                break;
                            }
                            Object[] params = {param.toString()};
                            MessageDomain msgItemNo = new MessageDomain("wb007ListDomainList[" + index + "].itemNo", errCode, params);
                            errorList.add(msgItemNo);
                            
                            listDomainList.get(Integer.parseInt(index)).setWarningFlgItemNo("E");
                        } else if (NXS_W1_0003.equals(errCode)) {
                            StringBuffer param = new StringBuffer("");
                            for (String p : error.getParamList()){
                                param = new StringBuffer("(" + p + ")");
                                break;
                            }
                            Object[] params = {param.toString()};
                            MessageDomain msgItemNo = new MessageDomain("wb007ListDomainList[" + index + "].itemNo", errCode, params);
                            errorList.add(msgItemNo);
                            
                            if (StringUtils.isEmpty(listDomainList.get(Integer.parseInt(index)).getWarningFlgItemNo())) {
                                listDomainList.get(Integer.parseInt(index)).setWarningFlgItemNo("W");
                            }
                        } else {
                            // In order to prevent leak when the message of WsB005 is added in the future
                            // 将来的にWsB005のメッセージが追加になった場合の漏れを防止する為
                            MessageDomain msg = new MessageDomain("", errCode, null);
                            errorList.add(msg);
                        }
                    }
                }
            }
        }
        
        // The check of ignoreWarning
        // ignoreWarningの確認
        if (errorList != null && errorList.size() > 0) {
            boolean throwFlg = false;
            for (Iterator<MessageDomain> i = errorList.iterator(); i.hasNext();) {
                MessageDomain msg = i.next();
                // In warning disregard, only when the message which starts except NXS-W* exists, it throw(s).
                // 警告無視の場合は、NXS-W*以外で始まるメッセージが存在する場合のみ、throwする。
                if (StringUtils.equals(criteriaDomain.getIgnoreWarnings(), CHECK_ON)) {
                    if (msg.getKey() != null && !msg.getKey().startsWith(warningMsgWord)) {
                        throwFlg = true;
                        break;
                    }
                } else {
                    throwFlg = true;
                    break;
                }
            }
            
            // Check of errors
            // エラーの確認
            if (throwFlg) {
                throw new ValidationException(errorList);
            } else {
                criteriaDomain.setWarningFlgCustomerCd(null);
                for (WB007ListDomain listDomain : listDomainList){
                    listDomain.setWarningFlgItemNo(null);
                    listDomain.setWarningFlgOdrQty(null);
                }
            }
        }
        
        // A setting of the taking over item to callService
        // callServiceへの引継項目の設定
        for (WB007ListDomain listDomain : listDomainList){
            for (WsB005ResultItemDomain wsB005ResultItem : wsB005Result.getCustomerOrderList()){
                if (listDomain.getIndex().equals(wsB005ResultItem.getIndex())){
                    listDomain.setCustomerItemNo(wsB005ResultItem.getCustomerPartNo());
                    listDomain.setPlntCd(convertBlankToSpace(wsB005ResultItem.getPlantCodeLegacy()));
                    listDomain.setPartName(wsB005ResultItem.getPartName());
                    break;
                }
            }
        }
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * A create of - Customer Order Receiving domain
     *       {@link WB001OdrRcvDomain} is created and the contents of {@link WB007ListDomain} are set up.
     *
     * - Execution of registration processing
     *       This is an argument about the list of created {@link WB001OdrRcvDomain},
     *       This is a call about {@link WB001OdrRcvService#transactOnLstDgtChgRegister (WB001OdrRcvDomain)}.
     *
     * A create of - List domain
     *       {@link WB007ListDomain} is created based on the re retrieval result after registration.
     *
     * A return of - List domain
     * 
     * - Customer Order Receivingドメインの作成
     *     {@link WB001OdrRcvDomain}を作成し、{@link WB007ListDomain}の内容を設定
     *     
     * - 登録処理の実行
     *     作成した{@link WB001OdrRcvDomain}のリストを引数に、
     *     {@link WB001OdrRcvService#transactOnLstDgtChgRegister(WB001OdrRcvDomain)}を呼出
     *     
     * - Listドメインの作成
     *     登録後の再検索結果をもとに{@link WB007ListDomain}を作成する
     *     
     * - Listドメインの返却
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected WB007UpdateDomain callServices(WB007UpdateDomain updateDomain) 
        throws GscmApplicationException, ApplicationException {
        
        // Acquisition of Date format
        // 日付フォーマットの取得
        String screenDateFormat = updateDomain.getScreenDateFormat();
        
        // Acquisition of a condition condition domain
        // 条件条件ドメインの取得
        WB007CriteriaDomain criteriaDomain = updateDomain.getCriteriaDomain();
        
        // Acquisition of listDomainList
        // listDomainListの取得
        List<? extends WB007ListDomain> listDomainList = updateDomain.getListDomainList();
        
        // It changes into a BL domain (search-condition domain).  
        // BLドメインへ変換(検索条件ドメイン)
        WB001OdrRcvDomain parentOdrRcv = new WB001OdrRcvDomain();
        CommonUtil.copyPropertiesDomainToDomain(parentOdrRcv, criteriaDomain, screenDateFormat);
        parentOdrRcv.setPkgCd(convertBlankToSpace(criteriaDomain.getPkgCd()));
        
        // It changes into a BL domain (listDomain).  
        // BLドメインへ変換(listDomain)
        List<WB001OdrRcvDomain> childrenOdrRcv = new ArrayList<WB001OdrRcvDomain>();
        for (Iterator<? extends WB007ListDomain> i = listDomainList.iterator(); i.hasNext();) {
            WB007ListDomain listDomain = (WB007ListDomain)i.next();
            
            WB001OdrRcvDomain childOdrRcv = new WB001OdrRcvDomain();
            CommonUtil.copyPropertiesDomainToDomain(childOdrRcv, listDomain, screenDateFormat);
            childrenOdrRcv.add(childOdrRcv);
        }
        
        // A setting of the child-parent relationship of a BL domain
        // BLドメインの親子関係の設定
        parentOdrRcv.setOdrRcvDomainList(childrenOdrRcv);
        
        // Implementation of an update process
        // 更新処理の実施
        WB001OdrRcvDomain result = wb001OdrRcvService.transactOnLstDgtChgRegister(parentOdrRcv);
        List<? extends WB001OdrRcvDomain> resultList = result.getOdrRcvDomainList();
        
        // It changes into a PL domain (listDomain).  
        // PLドメインへ変換(listDomain)
        int index = 0;
        List<WB007ListDomain> resultListDomainList = new ArrayList<WB007ListDomain>();
        for (int i = 0; i < resultList.size(); i++) {
            WB001OdrRcvDomain resultOdrRcv = resultList.get(i);
            
            WB007ListDomain resultListDomain = new WB007ListDomain();
            CommonUtil.copyPropertiesDomainToDomain(resultListDomain, resultOdrRcv, screenDateFormat);
            resultListDomain.setOdrQty(convertZeroToBlank(resultOdrRcv.getOdrQty()));
            if (resultOdrRcv.getUpdateTimestamp() == null){
                resultListDomain.setUpdateTimestamp("");
            } else {
                resultListDomain.setUpdateTimestamp(resultOdrRcv.getUpdateTimestamp().toString());
            }
            resultListDomain.setIndex(Integer.toString(index));
            index++;
            
            resultListDomainList.add(resultListDomain);
        }
        
        updateDomain.setCountUpdData(result.getCountUpdData());
        updateDomain.setListDomainList(resultListDomainList);
        
        return updateDomain;
    }
    
    /**
     * When an argument is Blank, Space is returned, and in except, an argument is returned.
     * <br />引数がBlankの場合Spaceを返し、以外の場合引数を返します。
     *
     * @param val Numerical value<br />数値
     * @return In Blank, this is a VALUE of an argument except Space.<br />Blankの場合Space、以外は引数の値
     */
    protected String convertBlankToSpace(String val){
        if (StringUtils.isBlank(val)){
            return new String(" ");
        } else {
            return val;
        }
    }
    
    /**
     * When an argument is null, 0 is returned, and in except, an argument is returned.
     * <br />引数がnullの場合0を返し、以外の場合引数を返します。
     *
     * @param val Numerical value<br />数値
     * @return In null, this is a VALUE of an argument except 0.<br />nullの場合0、以外は引数の値
     */
    protected BigDecimal convertBigDecimal(String val){
        if (StringUtils.isBlank(val)){
            return BigDecimal.ZERO;
        } else {
            return new BigDecimal(val);
        }
    }

    /**
     * When an argument is Zero is returned, and in except, an argument is returned.
     * <br />引数がZeroの場合Blankを返し、以外の場合引数を返します。
     *
     * @param val Numerical value<br />数値
     * @return In Zero, this is a VALUE of an argument except Blank.<br />Zeroの場合Blank、以外は引数の値
     */
    protected String convertZeroToBlank(BigDecimal val){
        if (val == null || BigDecimal.ZERO.equals(val)){
            return new String("");
        } else {
            return val.toString();
        }
    }
}
