/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CHECK_OFF;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CHECK_ON;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FORMAT_WEIGHT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0003;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0060;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W2007;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SEARCH_MAX_COUNT;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W2005MixTagItemDomain;
import com.globaldenso.eca0027.core.business.domain.W2007CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W2007ListDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W2005MixTagItemCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W2005MixTagService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CheckUtil;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.DateUtil;
import com.globaldenso.gscm.framework.util.NumberUtil;
import com.globaldenso.gscm.framework.util.Validator;

/**
 * The search service facade implementation class of Multiple Item No. in 1Box PKG Create Screen
 * <br />小箱内多品番梱包Create画面のSearchFacadeサービス実装クラスです。
 * <pre>
 * bean id:w2007SearchFacadeService
 * </pre>
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 11001 $
 */
public class W2007SearchFacadeServiceImpl extends AbstractSearchFacadeService<List<? extends W2007ListDomain>, W2007CriteriaDomain> {

    /**
     * Common service
     * <br />共通サービス
     */
    protected CommonService commonService;
    
    /**
     * Multiple-p/n-packaged-in-box service
     * <br />小箱内多品番梱包サービス
     */
    protected W2005MixTagService w2005MixTagService;
    
    /**
     * constructor.
     */
    public W2007SearchFacadeServiceImpl() {
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
     * Setter method for w2005MixTagService.
     *
     * @param mixTagService Set for w2005MixTagService
     */
    public void setW2005MixTagService(W2005MixTagService mixTagService) {
        w2005MixTagService = mixTagService;
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
    protected W2007CriteriaDomain filterDomain(W2007CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {
        return criteriaDomain;
    }
    
    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - Common error checking
     *       Screen definition document_ECA0027_W2007_Multiple Item No. in 1Box PKG Create.xls "screen item definition" is referred to for details.
     * 
     * - 共通エラーチェック
     *     詳細は画面定義書_ECA0027_W2007_Multiple Item No. in 1Box PKG Create.xls「画面項目定義」を参照
     * 
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W2007CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        

        Validator<W2007CriteriaDomain> valid 
            = new Validator<W2007CriteriaDomain>(criteriaDomain, "w2007CriteriaDomain");

        // Unary eye check
        // 単項目チェック
        String[] properties = {
            "containerSortingKey",
            "itemNo",
            "pkgCd"
        };
        valid.isValidateProperties(properties, SCREEN_ID_W2007);

        // Error check
        // エラー確認
        if (0 < valid.getErrList().size()) {
            throw new ValidationException(valid.getErrList());
        }
        
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
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W2007CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // No Action
        // 処理なし
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * Behavior in - CIGMA night batch
     *       This is a call about {@link W2005MixTagService#validateDatabaseCigmaAvailable (boolean, String)}.
     * 
     * - CIGMA夜間バッチ中の振る舞い
     *     {@link W2005MixTagService#validateDatabaseCigmaAvailable(boolean, String)}を呼出
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W2007CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // Acquisition of an input value
        // 入力値の取得
        String shipperCd = criteriaDomain.getShipperCd();
        
        // Create of an error list
        // エラーリストの作成
        List<MessageDomain> errorList = new ArrayList<MessageDomain>();
        
        // check among a night batch
        // 夜間バッチ中チェック
        if (!w2005MixTagService.validateDatabaseCigmaAvailable(true, shipperCd)) {
            MessageDomain msg = new MessageDomain("", NXS_E1_0060, null);
            
            errorList.add(msg);
        }
        
        // Error check
        // エラー確認
        if (0 < errorList.size()) {
            throw new ValidationException(errorList);
        }
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - Create of a search-condition domain
     *
     * - Acquisition of search data
     *       - When [7]:Palletize Instr. No. is inputted (when this is a Packaging Instruction (=Pull))  
     * {@link W2005MixTagService#searchForPagingOnCreateSearchByPltzInstr(W2005MixTagItemCriteriaDomain, List)} call,
     *           The following is carried out.
     *             Acquisition of search data
     *             Acquisition of an ITEM-NO information (starting of Web service)  
     *             Combination of data
     *             Search results are set as a screen.
     *
     *       - When [7]:Palletize Instr. No. is not inputted (when this is a result)  
     * {@link W2005MixTagService#searchForPagingOnCreateSearchByNonInstr(W2005MixTagItemCriteriaDomain, List)} call,
     *           The following is carried out.
     *             Acquisition of search data
     *             When the W/H CD of acquisition (starting of Web service) *NEXUS of an ITEM-NO information is chosen, they are those with an authority check.
     *             Combination of data
     *             Search results are set as a screen.
     *
     * A converted in - List domain
     *       The searched result is changed into {@link W2007ListDomain}.
     *
     * - Storage of search results
     *       It carries out by Action.
     *
     * - Storage of search results
     *       It carries out by Action.
     *
     * - Form feed
     *       It carries out by Action.
     * 
     * - 検索条件ドメインの作成
     *     
     * - 検索データの取得
     *     - 【7】:Palletize Instr. No.が入力された場合(梱包指示の場合)
     *         {@link W2005MixTagService#searchForPagingOnCreateSearchByPltzInstr(W2005MixTagItemCriteriaDomain, List)}呼出し、
     *         以下を実施
     *           検索データの取得
     *           品目番号情報の取得（Webサービスの起動）
     *           データの結合
     *           検索結果を画面に設定
     *     
     *     - 【7】:Palletize Instr. No.が入力されていない場合(成行の場合)
     *         {@link W2005MixTagService#searchForPagingOnCreateSearchByNonInstr(W2005MixTagItemCriteriaDomain, List)}呼出し、
     *         以下を実施
     *           検索データの取得
     *           品目番号情報の取得（Webサービスの起動）※NEXUSの倉庫コードを選択した場合、権限チェックあり
     *           データの結合
     *           検索結果を画面に設定
     *     
     * - Listドメインへの変換
     *     検索した結果を{@link W2007ListDomain}に変換する
     *     
     * - 検索結果の保管
     *     Actionで実施
     * 
     * - 検索結果の保管
     *     Actionで実施
     * 
     * - 改頁
     *     Actionで実施
     *     
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected List<? extends W2007ListDomain> callServices(W2007CriteriaDomain criteriaDomain) 
        throws GscmApplicationException, ApplicationException {
        
        // Create of a search-condition domain
        // 検索条件ドメインの作成
        W2005MixTagItemCriteriaDomain mixTagCriteria = createMixTagCriteria(criteriaDomain);
        
        // Acquisition of search data
        // 検索データの取得
        List<? extends W2005MixTagItemDomain> searchMixTagItemList = searchMixTagItem(mixTagCriteria);
        
        // A converted of a List domain
        // Listドメインの変換
        return convertToListDomain(searchMixTagItemList, criteriaDomain.getShipperCd());
        
    }

    /**
     * Create the search-condition domain of multiple-p/n-packaged-in-box service.
     * <br />小箱内多品番梱包サービスの検索条件ドメインを作成します。
     *
     * @param criteriaDomain The search-condition domain of a multiple-p/n-packaged-in-box Create screen<br />小箱内多品番梱包Create画面の検索条件ドメイン
     * @return The search-condition domain of multiple-p/n-packaged-in-box service<br />小箱内多品番梱包サービスの検索条件ドメイン
     * @throws ApplicationException When a system date is not able to be acquired<br />システム日付が取得できなかった場合
     */
    protected W2005MixTagItemCriteriaDomain createMixTagCriteria(W2007CriteriaDomain criteriaDomain) 
        throws ApplicationException {
        
        W2005MixTagItemCriteriaDomain mixTagItemCriteria = new W2005MixTagItemCriteriaDomain();
        
        // The setting for acquiring the maximum number
        // 最大件数を取得するための設定
        mixTagItemCriteria.setScreenId(criteriaDomain.getScreenId());
        mixTagItemCriteria.setLocale(new Locale(criteriaDomain.getLanguageCd()));

        // A search condition is copied.
        // 検索条件をコピー
        CommonUtil.copyPropertiesDomainToDomain(mixTagItemCriteria, criteriaDomain, criteriaDomain.getScreenDateFormat());

        // The system date of Shipper is acquired.
        // Shipperのシステム日付を取得
        String timezoneId = commonService.searchTimezone(criteriaDomain.getShipperCd());
        Date sysdate = DateUtil.convertTime(new Date(), timezoneId);
        mixTagItemCriteria.setShippingDt(sysdate);
        mixTagItemCriteria.setAplyStrtDt(sysdate);
        mixTagItemCriteria.setRcvOdrCompCd(criteriaDomain.getShipperCd());
        
        mixTagItemCriteria.setCompCd(criteriaDomain.getWhCompCd());

        return mixTagItemCriteria;
    }
    
    /**
     * Search a Palletize-Item eye.
     * <br />パレタイズ対象品目を検索します。
     *
     * @param mixTagCriteria Search-condition domain<br />検索条件ドメイン
     * @return Search results<br />検索結果
     * @throws ApplicationException When the number of search results is zero<br />検索結果が0件だった場合
     */
    protected List<? extends W2005MixTagItemDomain> searchMixTagItem(
        W2005MixTagItemCriteriaDomain mixTagCriteria) throws ApplicationException {
        
        List<String> errMessages = new ArrayList<String>();
        List<? extends W2005MixTagItemDomain> resultList = null;
        
        // When Palletize Instr. No. is inputted (when this is a Packaging Instruction (=Pull))  
        // Palletize Instr. No.が入力された場合(梱包指示の場合)
        if(!CheckUtil.isBlankOrNull(mixTagCriteria.getPltzInstrNo())){
            
            resultList = w2005MixTagService.searchForPagingOnCreateSearchByPltzInstr(mixTagCriteria, errMessages);
            // 0 In the case of an affair, an error is made.
            // 0 件の場合エラー
            if (!errMessages.isEmpty()) {
                throw new ApplicationException(errMessages.get(0));
            }
        }else{
            // When Palletize Instr. No. is not inputted (when this is a result)  
            // Palletize Instr. No.が入力されていない場合(成行の場合)            
            resultList = w2005MixTagService.searchForPagingOnCreateSearchByNonInstr(mixTagCriteria, errMessages);
            // 0 In the case of an affair, an error is made.
            // 0 件の場合エラー
            if (!errMessages.isEmpty()) {
                throw new ApplicationException(errMessages.get(0));
            }
        }
        
        // 件数チェック
        if (resultList.size() == 0) {
            // 0件エラー
            throw new GscmApplicationException(GSCM_E0_0001);
        }
        if (SEARCH_MAX_COUNT < resultList.size()) {
            // 最大件数超過エラー
            Object[] params = {
                    resultList.size(), SEARCH_MAX_COUNT};
            throw new GscmApplicationException(GSCM_E0_0003, params);
        }
        return resultList;
    }
    
    /**
     * Change search results into a List domain.
     * <br />検索結果をListドメインに変換します。
     *
     * @param searchMixTagItemList Search results<br />検索結果
     * @param shipperCd Shipper CD<br />荷主コード
     * @return The List domain for screen display<br />画面表示用のListドメイン
     * @throws ApplicationException When this is not able to acquire<br />取得できなかった場合
     */
    protected List<? extends W2007ListDomain> convertToListDomain(List<? extends W2005MixTagItemDomain> searchMixTagItemList,
        String shipperCd) throws ApplicationException {

        List<W2007ListDomain> listDomainList = new ArrayList<W2007ListDomain>();
        
        // Acquisition of the WEIGHT UNIT of Shipper
        // Shipperの重量単位の取得
        String shipperWeightUnit = commonService.searchWeightUnit(shipperCd);
        String shipperWeightUnitDisp = commonService.searchMeasureUnitDisp(shipperWeightUnit);
        
        if (searchMixTagItemList != null) {

            for (W2005MixTagItemDomain mixTagItemDomain : searchMixTagItemList) {
                // A create of a List domain
                // Listドメインの作成
                W2007ListDomain listDomain = new W2007ListDomain();
                
                // Copy of property
                // プロパティのコピー

                // To speed up the processing, do not use CommonUtil#copyPropertiesDomainToDomain.
                // 処理速度を上げるために、CommonUtil#copyPropertiesDomainToDomain ではなく 
                // getter/setter を使ってプロパティ値の移送を行う。
                // CommonUtil.copyPropertiesDomainToDomain(listDomain, mixTagItemDomain);

                // Use getter/setter instead of it.
                listDomain.setItemNo(mixTagItemDomain.getItemNo());
                listDomain.setPkgCd(mixTagItemDomain.getPkgCd());
                listDomain.setShippingLot(decimalToString(mixTagItemDomain.getShippingLot()));
                listDomain.setItemDescription(mixTagItemDomain.getItemDescription());
                listDomain.setTagQty(decimalToString(mixTagItemDomain.getTagQty()));
                listDomain.setInstrQty(decimalToString(mixTagItemDomain.getInstrQty()));
                listDomain.setQty(decimalToString(mixTagItemDomain.getQty()));
                listDomain.setItemWeight(decimalToString(mixTagItemDomain.getItemWeight()));
                listDomain.setWeightUnit(mixTagItemDomain.getWeightUnit());
                listDomain.setNetWeightA(mixTagItemDomain.getNetWeightA());
                listDomain.setQtyUnit(mixTagItemDomain.getQtyUnit());
                listDomain.setExpLimitTyp(mixTagItemDomain.getExpLimitTyp());
                listDomain.setDngrItemFlg(mixTagItemDomain.getDngrItemFlg());
                listDomain.setOriginCntryCd(mixTagItemDomain.getOriginCntryCd());
                listDomain.setPlntCd(mixTagItemDomain.getPlntCd());
                listDomain.setContainerSortingKey(mixTagItemDomain.getContainerSortingKey());
                listDomain.setLoadingCd(mixTagItemDomain.getLoadingCd());
                listDomain.setInvoiceKey(mixTagItemDomain.getInvoiceKey());
                listDomain.setCustomTimingTyp(mixTagItemDomain.getCustomTimingTyp());
                listDomain.setContainerLooseTyp(mixTagItemDomain.getContainerLooseTyp());
                listDomain.setCurrCd(mixTagItemDomain.getCurrCd());
                listDomain.setCoFlg(mixTagItemDomain.getCoFlg());
                listDomain.setOrderQty(decimalToString(mixTagItemDomain.getOrderQty()));
                listDomain.setOnHandQty(decimalToString(mixTagItemDomain.getOnHandQty()));
                listDomain.setInstrPkgedQty(decimalToString(mixTagItemDomain.getInstrPkgedQty()));
                listDomain.setBoQty(decimalToString(mixTagItemDomain.getBoQty()));
                listDomain.setDisabledFlg(mixTagItemDomain.getDisabledFlg());
                listDomain.setLgcyUnitCd(mixTagItemDomain.getLgcyUnitCd());
                listDomain.setOnHandTotalQty(decimalToString(mixTagItemDomain.getOnHandTotalQty()));
                listDomain.setRev(mixTagItemDomain.getRev());
                listDomain.setMaxRev(mixTagItemDomain.getMaxRev());
                listDomain.setPackedQty(mixTagItemDomain.getPackedQty());
                listDomain.setHiddenPlntCd(mixTagItemDomain.getHiddenPlntCd());
// If you need to copy the following items, please enable comment lines.
// AbstractDomain の項目です、コピーする必要がある項目があればコメントアウトを外してください。
//              listDomain.setCharCd(itemDomain.getCharCd());
//              listDomain.setCheckValidateWarning(itemDomain.isCheckValidateWarning());
//              listDomain.setComCreateFuncId(itemDomain.getComCreateFuncId());
//              listDomain.setComCreateTimestamp(itemDomain.getComCreateTimestamp());
//              listDomain.setComCreateUserId(itemDomain.getComCreateUserId());
//              listDomain.setComUpdateFuncId(itemDomain.getComUpdateFuncId());
//              listDomain.setComUpdateTimestamp(itemDomain.getComUpdateTimestamp());
//              listDomain.setComUpdateUserId(itemDomain.getComUpdateUserId());
//              listDomain.setDateFormat(itemDomain.getDateFormat());
//              listDomain.setLanguageCd(itemDomain.getLanguageCd());
//              listDomain.setLocale(itemDomain.getLocale());
//              listDomain.setLoginUserDscId(itemDomain.getLoginUserDscId());
//              listDomain.setOwnerCompCd(itemDomain.getOwnerCompCd());
//              listDomain.setRowNumFrom(itemDomain.getRowNumFrom());
//              listDomain.setRowNumTo(itemDomain.getRowNumTo());
//              listDomain.setScreenId(itemDomain.getScreenId());
//              listDomain.setSearchCountCheckFlg(itemDomain.isSearchCountCheckFlg());
//              listDomain.setSelected(itemDomain.getSelected());
//              listDomain.setTimeZone(itemDomain.getTimeZone());
                
                // Setting of a check box
                // チェックボックスの設定
                if (FLAG_Y.equals(listDomain.getDisabledFlg())) {
                    listDomain.setSelected(CHECK_ON);
                } else {
                    listDomain.setSelected(CHECK_OFF);
                }
                
                // A setting of CO FLG
                // joint packing specification .REV < in the case of joint packing specification .max (REV): "*"
                // CO FLGの設定
                // 結合包装仕様.REV < 結合包装仕様.max(REV)の場合："*"
                if(listDomain.getRev() != null && listDomain.getMaxRev() != null){
                    if(listDomain.getRev().compareTo(listDomain.getMaxRev()) < 0){
                        listDomain.setCoFlg("*");
                    } else {
                        // except the above: ""
                        // 上記以外：""
                        listDomain.setCoFlg("");
                    }
                }else{
                    listDomain.setCoFlg("");
                }
                
                // N/W / Ship Lot(XXXX)
                if (listDomain.getNetWeightA() != null) {
                    // Acquisition of NET WEIGHT
                    // ネット重量の取得
                    BigDecimal itemNetWeightA = listDomain.getNetWeightA();

                    String itemWeight = NumberUtil.format(itemNetWeightA, FORMAT_WEIGHT);
                    listDomain.setItemWeight(itemWeight);
                }
                
                listDomain.setShipperWeightUnitDisp(shipperWeightUnitDisp);
                
                listDomainList.add(listDomain);
                
            }
        }
        return listDomainList;
    } 

    /**
     * The VALUE of BigDecimal is changed into a string.
     * <br />BigDecimalの値を文字列に変換する。
     * <pre>
     * - null is returned when an argument is null.
     *     When this is not null, the result of having carried out {@link BigDecimal#toPlainString()} to the argument is returned.
     * 
     * - 引数がnullの場合は、null を返す。
     *   nullでない場合は、引数に対して {@link BigDecimal#toPlainString()} を実施した結果を返す。
     * </pre>
     * @param decimalVal The VALUE of BigDecimal<br />BigDecimalの値
     * @return The VALUE after a converted<br />変換後の値
     */
    protected String decimalToString(BigDecimal decimalVal){
        
        if (decimalVal == null ) {
            return null;
        }
        return decimalVal.toPlainString();
    }
}
