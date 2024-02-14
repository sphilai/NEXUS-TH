/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.ws;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0029_BHT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_5009;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_5016;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_5017;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_5031;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_5041;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_5042;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_5043;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_5044;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_5046;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_5047;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_5050;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_5056;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_5057;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_5058;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_5066;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_ID_WS2504;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_ERROR;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaWhXrefCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TmCigmaWhXrefService;
import com.globaldenso.eca0027.core.business.domain.ErrorListItemDomain;
import com.globaldenso.eca0027.core.business.domain.ErrorParamListItemDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2504RegistCmlListItemDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2504ResultDomain;
import com.globaldenso.eca0027.core.business.domain.WsBhtEisProductDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2504CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2504PkgItemNoCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.WsBhtEisProductCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.WsBhtEisProductService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractCreateFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CheckUtil;
import com.globaldenso.gscm.framework.util.Validator;

/**
 * Implement class for Facade Service to ECA0027_WS_2504
 * <br />ECA0027_WS_2504に対するFacadeサービスの実装クラスです。
 * <pre>
 * bean id: Ws2504CreateFacadeService
 * </pre>
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 13082 $
 */
public class Ws2504CreateFacadeServiceImpl extends AbstractCreateFacadeService<Ws2504ResultDomain, Ws2504CriteriaDomain> {

    /**
     * Eis Product service
     * Eis Product サービス
     */
    protected WsBhtEisProductService wsBhtEisProductService;
    
    /**
     * CIGMA-Warehouse-Cross-Reference-Master service
     * <br />倉庫クロスリファレンス原単位サービス
     * ST987 ADD
     */
    protected TmCigmaWhXrefService tmCigmaWhXrefService;

    /**
     * constructor
     * デフォルトコンストラクタです。
     */
    public Ws2504CreateFacadeServiceImpl() {
    }
    
    /**
     * Setter method for wsBhtEisProductService.
     *
     * @param wsBhtEisProductService Set for wsBhtEisProductService
     */
    public void setWsBhtEisProductService(
        WsBhtEisProductService wsBhtEisProductService) {
        this.wsBhtEisProductService = wsBhtEisProductService;
    }

    /**
     * Setter method for tmCigmaWhXrefService.
     *
     * @param tmCigmaWhXrefService Set for tmCigmaWhXrefService
     */
    public void setTmCigmaWhXrefService(TmCigmaWhXrefService tmCigmaWhXrefService) {
        this.tmCigmaWhXrefService = tmCigmaWhXrefService;
    }

    /**
     * 
     * Check the contents of Domain from argument and specify the Domain for the process.
     * <br />引数のDomainの内容を調査し、処理に必要なDomainを特定する。
     * 
     * <pre>
     * No Action
     * 処理なし
     * </pre>
     * 
     * @param criteriaDomain criteria domain<br />条件ドメイン
     * @return result Domain<br />結果ドメイン
     * @throws GscmApplicationException GSCM Exception<br />GSCM例外
     * @throws ApplicationException Application Exception<br />アプリケーションの例外
     */
    @Override
    protected Ws2504CriteriaDomain filterDomain(Ws2504CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {

        return criteriaDomain;
    }
    
    /**
     * Individual Item Check
     * <br />単項目チェックを行う。
     * 
     * 
     * <pre>
     * - Common Error Check
     *     Refer for details to "Screen Item Definition Sheet"
     * 
     * - 共通エラーチェック
     *     詳細は「画面項目定義」を参照
     * </pre>
     * 
     * @param criteriaDomain criteria domain<br />条件ドメイン
     * @throws GscmApplicationException GSCM Exception<br />GSCM例外
     * @throws ValidationException Validation Exception<br />バリデーションの例外
     * @throws ApplicationException Application Exception<br />アプリケーションの例外
     */
    @Override
    protected void validateItems(Ws2504CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {

        List<MessageDomain> errorList = new ArrayList<MessageDomain>();
        Validator<Ws2504CriteriaDomain> valid 
            = new Validator<Ws2504CriteriaDomain>(criteriaDomain, "criteriaDomain");
        
        // individual item check
        // 単項目チェック
        String[] properties = {
            "shipperCd",
            "shipToCd",
            "loadingCd",
            "trnsCd",
            "payTerms",
            "plntCd",
            "whCompCd",
            "lgcyWhCd",
            "priceTerms",
            "returnStyleCd",
            "pkgTyp",
            "cmlQty",
            "weightUnit",
            "grossWeight",
            "lengthUnit",
            "length",
            "width",
            "height",
            "volumeUnit",
            "volume"
        };
        
        // required check
        // 必須チェック
        // number of digit, attribute, form check
        // 桁数、属性、書式チェック
        valid.isValidateProperties(properties, WS_ID_WS2504);
        
        // check errors
        // エラー確認
        if (0 < valid.getErrList().size()) {
            errorList.addAll(valid.getErrList());
        }
        
        if (criteriaDomain.getPkgItemNoCriteriaList().isEmpty()) {
            errorList.add(new MessageDomain("", NXS_E1_5016, null));    // PKG Item No
            errorList.add(new MessageDomain("", NXS_E1_5016, null));    // PKG Qty
        } else if (criteriaDomain.getPkgItemNoCriteriaList().size() == 1) {
            Ws2504PkgItemNoCriteriaDomain pkgItemNoCriteria = criteriaDomain.getPkgItemNoCriteriaList().get(0);
            if (CheckUtil.isBlankOrNull(pkgItemNoCriteria.getPkgItemNo())) {
                errorList.add(new MessageDomain("", NXS_E1_5016, null));    // PKG Item No
            }
            if (CheckUtil.isBlankOrNull(pkgItemNoCriteria.getPkgQty())) {
                errorList.add(new MessageDomain("", NXS_E1_5016, null));    // PKG Qty
            }
        }
        
        // check errors
        // エラー確認
        if (0 < errorList.size()) {
            throw new ValidationException(errorList);
        }
    }

    /**
     * consistency check 
     * <br />整合性チェックを行う。
     * 
     * 
     * <pre>
     * 
     * </pre>
     * @param criteriaDomain criteria domain<br />条件ドメイン
     * @throws GscmApplicationException GSCM Exception<br />GSCM例外
     * @throws ValidationException Validation Exception<br />バリデーションの例外
     * @throws ApplicationException Application Exception<br />アプリケーションの例外
     */
    @Override
    protected void validateConsistency(Ws2504CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
    }

    /**
     * database check
     * <br />データベースチェックを行う。
     * 
     * <pre>
     *  working check for CIGMA night batch
     *  existing check for L/D CD
     *  existing check for TRANSPORT CODE
     *  existing check for Freight-Res conditions
     *  existing check for PRICE TERMS
     *  existing check for Shipper CD / SHIP TO CODE
     *  existing check for Unit CODE
     *  existing check for W/H Company CD (between bases) / W/H CD (between bases)
     *  related check for packing-materials
     *  existing check for CIGMA Factory information
     *  
     *  CIGMA夜間バッチ中チェック
     *  荷積位置コードの存在チェック
     *  輸送手段コードの存在チェック
     *  運賃支払い条件の存在チェック
     *  建値区分の存在チェック
     *  荷主コード、送荷先コードのチェック
     *  単位の存在チェック
     *  倉庫会社コード(拠点間)、倉庫コード(拠点間)のチェック
     *  包装材関連チェック
     *  CIGMAの工場情報存在チェック
     * </pre>
     * 
     * @param criteriaDomain criteria domain<br />条件ドメイン
     * @throws GscmApplicationException GSCM Exception<br />GSCM例外
     * @throws ValidationException Validation Exception<br />バリデーションの例外
     * @throws ApplicationException Application Exception<br />アプリケーションの例外
     */
    @Override
    protected void validateDatabase(Ws2504CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {

        // Create error list
        // エラーリストの作成
        List<MessageDomain> errorList = new ArrayList<MessageDomain>();
        
        // Existing check for user info
        // ユーザ情報存在チェック
        if (!wsBhtEisProductService.validateDatabaseVmUserInfo(criteriaDomain.getLoginUserDscId())) {
            Object[] params = {criteriaDomain.getLoginUserDscId()};
            MessageDomain msg = new MessageDomain("", NXS_E1_5031, params);
            errorList.add(msg);
            throw new ValidationException(errorList);
        }

        // ST987 DEL START
        //// CIGMA night batch running check
        //// CIGMA夜間バッチ中チェック
        //if (!wsBhtEisProductService.validateDatabaseCigmaNightBatchRunning(criteriaDomain.getShipperCd())) {
        //    MessageDomain msg = new MessageDomain("", NXS_E1_5062, null);
        //    errorList.add(msg);
        //    throw new ValidationException(errorList);
        //}
        // ST987 DEL END

        // existing check for L/D CD
        // 荷積位置コードの存在チェック
        if (!wsBhtEisProductService.validateDatabaseLoadPositionCd(criteriaDomain.getLocale().getLanguage(), criteriaDomain.getLoadingCd())) {
            Object[] params = { criteriaDomain.getLoadingCd() };
            MessageDomain msg = new MessageDomain("", NXS_E1_5041, params);
            errorList.add(msg);
        }

        // existing check for TRANSPORT CODE
        // 輸送手段コードの存在チェック
        if (!wsBhtEisProductService.validateDatabaseTransWayCd(criteriaDomain.getLocale().getLanguage(), criteriaDomain.getTrnsCd())) {
            Object[] params = { criteriaDomain.getTrnsCd() };
            MessageDomain msg = new MessageDomain("", NXS_E1_5042, params);
            errorList.add(msg);
        }

        // existing check for Freight-Res conditions
        // 運賃支払い条件の存在チェック
        if (!wsBhtEisProductService.validateDatabasePayFare(criteriaDomain.getLocale().getLanguage(), criteriaDomain.getPayTerms())) {
            Object[] params = { criteriaDomain.getPayTerms() };
            MessageDomain msg = new MessageDomain("", NXS_E1_5043, params);
            errorList.add(msg);
        }

        // existing check for PRICE TERMS
        // 建値区分の存在チェック
        if (!wsBhtEisProductService.validateDatabaseQuotesCd(criteriaDomain.getLocale().getLanguage(), criteriaDomain.getPriceTerms())) {
            Object[] params = { criteriaDomain.getPriceTerms() };
            MessageDomain msg = new MessageDomain("", NXS_E1_5066, params);
            errorList.add(msg);
        }

        // existing check for Export Ship To Shipping Master's
        // 輸出送荷先出荷原単位の存在チェック
        if (!wsBhtEisProductService.validateDatabaseTmExpShipToShippingOnErtPltz(criteriaDomain.getShipperCd(), criteriaDomain.getShipToCd())) {
            Object[] params = {
                criteriaDomain.getShipperCd(), 
                criteriaDomain.getShipToCd()
            };
            MessageDomain msg = new MessageDomain("", NXS_E1_5044, params);
            errorList.add(msg);
        }

        // existing check for Ship-to master COMPANY CODE
        // 送荷先原単位会社コードの取得
        if (!wsBhtEisProductService.validateDatabaseTmNxsShipToOnErtPltz(criteriaDomain.getShipToCd())) {
            Object[] params = { criteriaDomain.getShipToCd() };
            MessageDomain msg = new MessageDomain("", NXS_E1_5050, params);
            errorList.add(msg);
        }

        // existing check for Unit CODE
        // 単位の存在チェック
        int result = wsBhtEisProductService.validateDatabaseTmNxsCompOnErtPltz(
                criteriaDomain.getShipperCd(), 
                criteriaDomain.getWeightUnit(), 
                criteriaDomain.getLengthUnit(), 
                criteriaDomain.getVolumeUnit());
        if (result == 1) {
            // 1) param.weightUnint != NEXSUS company master.weightUnit
            // 1) パラメタ.重量単位 ≠ NEXUS会社原単位.WEIGHT_UNIT
            Object[] params = { criteriaDomain.getWeightUnit() };
            MessageDomain msg = new MessageDomain("", NXS_E1_5056, params);
            errorList.add(msg);
        }
        else if (result == 2) {
            // 2) param.lengthUnit != NEXUS company master.lengthUnit
            // 2) パラメタ.長さ単位 ≠ NEXUS会社原単位.LENGTH_UNIT
            Object[] params = { criteriaDomain.getLengthUnit() };
            MessageDomain msg = new MessageDomain("", NXS_E1_5057, params);
            errorList.add(msg);
        }
        else if (result == 3) {
            // 3) param.volumeUnit != NEXUS company master.volumeUnit
            // 3) パラメタ.容積単位 ≠ NEXUS会社原単位.VOLUME_UNIT
            Object[] params = { criteriaDomain.getVolumeUnit() };
            MessageDomain msg = new MessageDomain("", NXS_E1_5058, params);
            errorList.add(msg);
        }
        
        // existing check for W/H Company CD (between bases) / W/H CD (between bases)
        // 倉庫会社コード(拠点間)、倉庫コード(拠点間)のチェック
        // combination check for W/H Company CD and NEXSUS W/H CD
        // (W/H Company、NEXUS W/H　組み合わせチェック)
        if (!wsBhtEisProductService.validateDatabaseTmNxsWhOnErtPltz(
            criteriaDomain.getWhCompCd(), criteriaDomain.getLgcyWhCd())) {
            Object[] params = { criteriaDomain.getWhCompCd(), criteriaDomain.getLgcyWhCd() };
            MessageDomain msg = new MessageDomain("", GSCM_E0_0029_BHT, params);
            errorList.add(msg);
        }

        // ST987 ADD START
        // Combination check shipper - plant
        // シッパー - 工場コードのチェック
        TmCigmaWhXrefCriteriaDomain tmCigmaWhXrefCriteriaDomain = new TmCigmaWhXrefCriteriaDomain();
        tmCigmaWhXrefCriteriaDomain.setLgcyLibCompCd(criteriaDomain.getShipperCd());
        tmCigmaWhXrefCriteriaDomain.setPlntCd(criteriaDomain.getPlntCd());
        tmCigmaWhXrefCriteriaDomain.setSearchCountCheckFlg(false);
        int resultCount = tmCigmaWhXrefService.searchCount(tmCigmaWhXrefCriteriaDomain);
        if (resultCount == 0) {
            Object[] params = {criteriaDomain.getShipperCd(), criteriaDomain.getPlntCd()};
            MessageDomain msg = new MessageDomain("", NXS_E1_5017, params);
            errorList.add(msg);
        }
        // ST987 ADD END

        // related check for packing-materials
        // Calculate NET weight
        // 包装材関連チェック　NET重量の算出
        List<String> resultList = new ArrayList<String>();
        if (!wsBhtEisProductService.validateDatabaseShipperWhPlant(
            criteriaDomain.getShipperCd(), 
            criteriaDomain.getWhCompCd(), 
            criteriaDomain.getLgcyWhCd(), 
            criteriaDomain.getPkgItemNoCriteriaList(),
            resultList)
            ) {
            for (int i = 0; i < resultList.size(); i++) {
 
                if (resultList.get(i).equals("0")) {
                    continue;
                }
                Ws2504PkgItemNoCriteriaDomain ws2504criteria = criteriaDomain.getPkgItemNoCriteriaList().get(i);
                Object[] params = { ws2504criteria.getPkgItemNo() };

                if (resultList.get(i).equals("1")) {
                    // 1) got no data
                    // 1) 取得結果が0件のデータ
                    MessageDomain msg = new MessageDomain("", NXS_E1_5009, params);
                    errorList.add(msg);
                }
                else if (resultList.get(i).equals("2")) {
                    // 2) PKG-Materials-MA .RT_TYP='1' (1 way material)
                    // 2) 包装材原単位.RT_TYP='1'(1 way material)のデータ
                    MessageDomain msg = new MessageDomain("", NXS_E1_5046, params);
                    errorList.add(msg);
                }
                else if (resultList.get(i).equals("3")) {
                    // CURRENCY CODE of 1st data and PKG-Materials-MA .CURR_CD is different
                    // 3) 先頭データの通貨コードと包装材原単位.CURR_CDが一致しない
                    MessageDomain msg = new MessageDomain("", NXS_E1_5047, params);
                    errorList.add(msg);
                }
            }
        }
        
        // Pallet/Carton type existence check
        // パレット/カートン区分存在チェック
        // UT420
        String pcErrCd = wsBhtEisProductService.validateDatabasePalletCartonTyp(criteriaDomain.getLocale().getLanguage(), criteriaDomain.getPkgTyp());
        if (pcErrCd != null) {
            MessageDomain msg = new MessageDomain("", pcErrCd, null);
            errorList.add(msg);
        }
        
        // check errors
        // エラー確認
        if (0 < errorList.size()) {
            throw new ValidationException(errorList);
        }
 
    }

    /**
     * invoke the business service
     * <br />業務処理Serviceの呼び出しを行う。
     * 
     * <pre>
     *  calculate NET WEIGHT
     *  get Main Mark
     *  register Palletize information
     *  register Palletize-Item information
     *  
     *  NET重量の算出
     *  Main Markの取得
     *  パレタイズ情報の登録
     *  パレタイズ対象品情報の登録
     * </pre>
     * 
     * @param criteriaDomain criteria domain<br />条件ドメイン
     * @throws GscmApplicationException GSCM Exception<br />GSCM例外
     * @throws ApplicationException Application Exception<br />アプリケーションの例外
     * @return Result domain<br />結果ドメイン
     */
    @Override
    protected Ws2504ResultDomain callServices(Ws2504CriteriaDomain criteriaDomain) 
        throws GscmApplicationException, ApplicationException {

        // create EisProduct search-condition domain
        // EisProduct検索条件ドメインの作成
        WsBhtEisProductCriteriaDomain wsBhtEisProductCriteria = new WsBhtEisProductCriteriaDomain();
//        CommonUtil.copyPropertiesDomainToDomain(wsBhtEisProductCriteria, criteriaDomain.getXmlRoot());
        wsBhtEisProductCriteria.setDscId(criteriaDomain.getLoginUserDscId());
        wsBhtEisProductCriteria.setLoginUserDscId(criteriaDomain.getLoginUserDscId());
        wsBhtEisProductCriteria.setShipperCd(criteriaDomain.getShipperCd());
        wsBhtEisProductCriteria.setShipToCd(criteriaDomain.getShipToCd());
        wsBhtEisProductCriteria.setLoadingCd(criteriaDomain.getLoadingCd());
        wsBhtEisProductCriteria.setTrnsCd(criteriaDomain.getTrnsCd());
        wsBhtEisProductCriteria.setPayTerms(criteriaDomain.getPayTerms());
        wsBhtEisProductCriteria.setPlntCd(criteriaDomain.getPlntCd());
        wsBhtEisProductCriteria.setWhCompCd(criteriaDomain.getWhCompCd());
        wsBhtEisProductCriteria.setLgcyWhCd(criteriaDomain.getLgcyWhCd());
        wsBhtEisProductCriteria.setPriceTerms(criteriaDomain.getPriceTerms());
        wsBhtEisProductCriteria.setReturnStyleCd(criteriaDomain.getReturnStyleCd());
        wsBhtEisProductCriteria.setPkgTyp(criteriaDomain.getPkgTyp());
        wsBhtEisProductCriteria.setCmlQty(criteriaDomain.getCmlQty());
        wsBhtEisProductCriteria.setWeightUnit(criteriaDomain.getWeightUnit());
        wsBhtEisProductCriteria.setGrossWeight(criteriaDomain.getGrossWeight());
        wsBhtEisProductCriteria.setLengthUnit(criteriaDomain.getLengthUnit());
        wsBhtEisProductCriteria.setLength(new BigDecimal(criteriaDomain.getLength()));
        wsBhtEisProductCriteria.setWidth(new BigDecimal(criteriaDomain.getWidth()));
        wsBhtEisProductCriteria.setHeight(new BigDecimal(criteriaDomain.getHeight()));
        wsBhtEisProductCriteria.setVolumeUnit(criteriaDomain.getVolumeUnit());
        wsBhtEisProductCriteria.setVolume(new BigDecimal(criteriaDomain.getVolume()));
        wsBhtEisProductCriteria.setPkgItemNoCriteriaList(criteriaDomain.getPkgItemNoCriteriaList());
        wsBhtEisProductCriteria.setLocale(criteriaDomain.getLocale());
        wsBhtEisProductCriteria.setScreenId(criteriaDomain.getScreenId());

        // get packed up data, unpacked up data and customer KANBAN QR information
        // 梱包済みデータの取得、未梱包データの取得、得意先かんばんQR情報の取得
        WsBhtEisProductDomain wsBhtEisProduct =
            wsBhtEisProductService.transactOnErtPltz(wsBhtEisProductCriteria);
        
        // judge errors
        // エラー判定
        if (wsBhtEisProduct.getErrMap().size() > 0){
            // convert error result domain
            // エラー結果ドメインへの変換
            return convertEisToResult(WS_RESULT_ERROR,
                wsBhtEisProduct.getErrMap(), 
                criteriaDomain.getPlntCd()
            );
        }

        // convert result domain
        // 結果ドメインへの変換
        return convertEisToResult(wsBhtEisProduct);
    }
    

    /**
     * convert EisProduct domain to Ws2504 result domain (normal case)
     * <br />EisProductドメインをWs2504結果ドメインに変換します(正常用)。
     * 
     * @param wsBhtEisProduct wsBhtEisProduct domain<br />wsBhtEisProductドメイン
     * @return Ws2504 result domain<br />Ws2504結果ドメイン
     * @throws GscmApplicationException GSCM Exception<br />GSCM例外
     * @throws ApplicationException Application Exception<br />アプリケーションの例外
     */
    protected Ws2504ResultDomain convertEisToResult(WsBhtEisProductDomain wsBhtEisProduct) 
        throws GscmApplicationException, ApplicationException {
        
        // Ws2504 result domain
        // Ws2504の結果ドメイン
        Ws2504ResultDomain resultDomain = new Ws2504ResultDomain();

        List<Ws2504RegistCmlListItemDomain> registCmlList = new ArrayList<Ws2504RegistCmlListItemDomain>();
        List<Ws2504RegistCmlListItemDomain> mainMarkList = wsBhtEisProduct.getRegistCmlList();
        for (int i = 0; i < mainMarkList.size(); i++) {
            Ws2504RegistCmlListItemDomain registCml = new Ws2504RegistCmlListItemDomain();
            registCml.setMainMark(mainMarkList.get(i).getMainMark());
            registCmlList.add(registCml);
        }
        
        resultDomain.setRegistCmlList(registCmlList);
        resultDomain.setCmlPrintNum(wsBhtEisProduct.getCmlPrintNum());
        
        return resultDomain;
    }

    /**
     * convert EisProduct domain to Ws2504 result domain (error case)
     * <br />EisProductドメインをWs2504結果ドメインに変換します(異常用)。
     *
     * @param resultCode result code<br />結果コード
     * @param errMap map of error code and error parameter<br />エラーコードとエラーパラメータのMap
     * @param plantCd plant code<br />工場コード
     * @return Ws2504 result domain<br />Ws2504結果ドメイン
     * @throws GscmApplicationException GSCM Exception<br />GSCM例外
     * @throws ApplicationException Application Exception<br />アプリケーションの例外
     */
    protected Ws2504ResultDomain convertEisToResult(String resultCode, Map<String, Object[]> errMap, String plantCd) 
        throws GscmApplicationException, ApplicationException {
        
        // error list
        // エラーリスト
        List<ErrorListItemDomain> errorList = new ArrayList<ErrorListItemDomain>();
        
        // set error code and error parameter
        // エラーコードとエラーパラメータの設定
        for (String errorCode : errMap.keySet()) {
            
            Object[] params = errMap.get(errorCode);
            List<ErrorParamListItemDomain> errorParamList = new ArrayList<ErrorParamListItemDomain>();
            for (Object param : (Object[])params){
                ErrorParamListItemDomain errorParamListItem = new ErrorParamListItemDomain();
                errorParamListItem.setParam(param.toString());
                errorParamList.add(errorParamListItem);
            }
            
            ErrorListItemDomain errListItem = new ErrorListItemDomain();
            errListItem.setErrorCode(errorCode);
            errListItem.setErrorParamList(errorParamList);
            errorList.add(errListItem);
            
        }
        
        // create result domain
        // 結果ドメイン生成
        Ws2504ResultDomain resultDomain = new Ws2504ResultDomain();

        // set result code and error list
        // 結果コードとエラーリスト設定
        resultDomain.setResultCode(resultCode);
        resultDomain.setErrorList(errorList);
        
        return resultDomain;
    }

}
