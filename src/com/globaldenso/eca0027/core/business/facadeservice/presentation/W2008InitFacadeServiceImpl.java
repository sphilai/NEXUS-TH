/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.AUTH_EMPTY_NUMERIC;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FORMAT_WEIGHT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0157;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W2005;
import static com.globaldenso.gscm.framework.util.CheckUtil.isBlankOrNull;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W2005MixTagDomain;
import com.globaldenso.eca0027.core.business.domain.W2005MixTagItemDomain;
import com.globaldenso.eca0027.core.business.domain.W2008CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W2008ListDomain;
import com.globaldenso.eca0027.core.business.domain.W2008UpdateDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W2005MixTagCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W2005MixTagService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.NumberUtil;

/**
 * The search service facade implementation class of Multiple Item No. in 1Box PKG Register
 * <br />小箱内多品番梱包Register画面のInitFacadeサービス実装クラスです。
 * <pre>
 * bean W2008InitFacadeService
 * </pre>
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7966 $
 */
public class W2008InitFacadeServiceImpl extends AbstractSearchFacadeService<List<? extends W2008ListDomain>, W2008CriteriaDomain> {

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
    public W2008InitFacadeServiceImpl() {
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
    protected W2008CriteriaDomain filterDomain(W2008CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {
        return criteriaDomain;
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
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W2008CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // No Action
        // 処理なし
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
    protected void validateConsistency(W2008CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // No Action
        // 処理なし
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
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W2008CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // No Action
        // 処理なし
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - Distribution of a search
     *
     * - Acquisition of search data (in the case of the changes from a Multiple Item No. in 1Box PKG Main Screen)  
     *       - Create of a search-condition domain
     *           A search condition is set as {@link W2005MixTagCriteriaDomain}.
     *
     *       Search of - Mix Tag and a MIXED ITEM NO
     *.
    This is a call about {@link W2005MixTagService#searchOnRegisterInitByFromMain (W2005MixTagCriteriaDomain)} to an argument in {@link W2005MixTagCriteriaDomain}.
     *
     *       Create of - Update domain
     *           {@link W2008UpdateDomain} is created and the contents of {@link W2005MixTagDomain} and {@link W2005MixTagItemDomain} are set up.
     *
     *       Return of - Update domain
     *
     * - Acquisition of search data (in the case of the changes from a Multiple Item No. in 1Box PKG Create screen)
     *       - Create of a search-condition domain
     *           A search condition is set as {@link W2005MixTagCriteriaDomain}.
     *
     *       Search of - Palletize Instruction Item No Work
     *.
    This is a call about {@link W2005MixTagService#searchOnRegisterInitByFromCreate (W2005MixTagCriteriaDomain)} to an argument in W2005MixTagCriteriaDomain}.
     *
     *       Create of - Update domain
     *           {@link W2008UpdateDomain} is created and the contents of {@link W2005MixTagDomain} and {@link W2005MixTagItemDomain} are set up.
     *
     *       Return of - Update domain
     *
     * Storage of - taking over conditions
     *       It carries out by Action.
     *
     * - 検索の振り分け
     * 
     * - 検索データの取得(Multiple Item No. in 1Box PKG Main Screen画面からの遷移の場合)
     *     - 検索条件ドメインの作成
     *         {@link W2005MixTagCriteriaDomain}に検索条件を設定
     *         
     *     - MIXED現品票、MIXED品目番号の検索
     *         {@link W2005MixTagCriteriaDomain}を引数に{@link W2005MixTagService#searchOnRegisterInitByFromMain(W2005MixTagCriteriaDomain)}を呼出
     *         
     *     - Updateドメインの作成
     *         {@link W2008UpdateDomain}を作成し、{@link W2005MixTagDomain}、{@link W2005MixTagItemDomain}の内容を設定
     *           
     *     - Updateドメインの返却
     *     
     * - 検索データの取得(Multiple Item No. in 1Box PKG Create画面からの遷移の場合)
     *     - 検索条件ドメインの作成
     *         {@link W2005MixTagCriteriaDomain}に検索条件を設定
     *         
     *     - 梱包指示品目番号ワークの検索
     *         {@link W2005MixTagCriteriaDomain}を引数に{@link W2005MixTagService#searchOnRegisterInitByFromCreate(W2005MixTagCriteriaDomain)}を呼出
     *         
     *     - Updateドメインの作成
     *         {@link W2008UpdateDomain}を作成し、{@link W2005MixTagDomain}、{@link W2005MixTagItemDomain}の内容を設定
     *         
     *     - Updateドメインの返却
     *     
     * - 引継ぎ条件の保管
     *     Actionで実施
     *     
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected List<? extends W2008ListDomain> callServices(W2008CriteriaDomain criteriaDomain) 
        throws GscmApplicationException, ApplicationException {
        
        
        // Changes from a Main screen
        // Main画面からの遷移
        if (SCREEN_ID_W2005.equals(criteriaDomain.getCallScreenId())) {
            W2005MixTagCriteriaDomain mixTagCriteria = createMixTagCriteria(criteriaDomain);

            // Acquisition of search data
            // 検索データの取得
            List<? extends W2005MixTagDomain> searchMixTagList = searchMixTag(mixTagCriteria);

            return convertToListDomain(searchMixTagList, criteriaDomain);

            
        } else {
            // Changes from a Main screen (from W2018 to changes)  
            // Main画面からの遷移(W2018から遷移)
            if(!isBlankOrNull(criteriaDomain.getMixTagNo())){

                W2005MixTagCriteriaDomain mixTagCriteria = createMixTagCriteria(criteriaDomain);

                // Acquisition of search data
                // 検索データの取得
                List<? extends W2005MixTagDomain> searchMixTagList = searchMixTag(mixTagCriteria);

                return convertToListDomain(searchMixTagList, criteriaDomain);

             // Changes from a Create screen
             // Create画面からの遷移
            }else{

                W2005MixTagCriteriaDomain mixTagCriteria = createMixTagCriteria(criteriaDomain);

                // Acquisition of search data
                // 検索データの取得
                W2005MixTagDomain searchMixTagDomain = searchMixTagFromCreate(mixTagCriteria);

                return convertToListDomainFromCreate(searchMixTagDomain, criteriaDomain);
            }
        }
        

    }
    
    
    /**
     * Create the search-condition domain of a Mix Tag.
     * <br />MIXED現品票の検索条件ドメインを作成します。
     *
     * @param criteria The search-condition domain of a multiple-p/n-packaged-in-box Register screen<br />小箱内多品番梱包 Register画面の検索条件ドメイン
     * @return The search-condition domain of a Mix Tag<br />MIXED現品票の検索条件ドメイン
     */
    protected W2005MixTagCriteriaDomain createMixTagCriteria(W2008CriteriaDomain criteria) {
        W2005MixTagCriteriaDomain mixTagCriteria = new W2005MixTagCriteriaDomain();
        
        CommonUtil.copyPropertiesDomainToDomain(mixTagCriteria, criteria);
        
        return mixTagCriteria;
    }
    
    /**
     * Search a Mix Tag and a MIXED ITEM NO.
     * <br />MIXED現品票、MIXED品目番号を検索します。(Main画面からの遷移時)
     *
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return The list of {@link W2005MixTagDomain}<br />{@link W2005MixTagDomain}のリスト
     * @throws ApplicationException When a Mix Tag and a MIXED ITEM NO are unacquirable<br />MIXED現品票、MIXED品目番号が取得できない場合
     */
    protected List<? extends W2005MixTagDomain> searchMixTag(W2005MixTagCriteriaDomain criteria) 
        throws ApplicationException {
        return w2005MixTagService.searchOnRegisterInitByFromMain(criteria);
    }
    
    /**
     * Search a Palletize Instruction Item No Work.(at the time of the changes from a Create screen)
     * <br />梱包指示品目番号ワークを検索します。(Create画面からの遷移時)
     *
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return The list of {@link W2005MixTagDomain}<br />{@link W2005MixTagDomain}のリスト
     * @throws ApplicationException When a Palletize Instruction Item No Work is unacquirable<br />梱包指示品目番号ワークが取得できない場合
     */
    protected W2005MixTagDomain searchMixTagFromCreate(W2005MixTagCriteriaDomain criteria) 
        throws ApplicationException {
        return w2005MixTagService.searchOnRegisterInitByFromCreate(criteria);
    }
    
    /**
     * Change search results into a List domain.
     * <br />検索結果をListドメインに変換します。
     *
     * @param searchMixTagList Search results<br />検索結果
     * @param criteriaDomain W2008CriteriaDomain<br />W2008CriteriaDomain
     * @return The List domain for screen display<br />画面表示用のListドメイン
     * @throws ApplicationException When unacquirable<br />取得できない場合
     */
    protected List<? extends W2008ListDomain> convertToListDomain(List<? extends W2005MixTagDomain> searchMixTagList, W2008CriteriaDomain criteriaDomain) 
        throws ApplicationException {

        List<W2008ListDomain> listDomainList = new ArrayList<W2008ListDomain>();
        
        if(searchMixTagList != null && 0 < searchMixTagList.size()){
            W2005MixTagDomain mixTagDomain = searchMixTagList.get(0);

            // Acquisition of the WEIGHT UNIT of Shipper
            // Shipperの重量単位の取得
            String shipperWeightUnit = commonService.searchWeightUnit(mixTagDomain.getShipperCd());

            if (mixTagDomain != null) {

                for (int i = 0; i < mixTagDomain.getMixTagItemDomainList().size(); i++) {
                    W2005MixTagItemDomain mixTagItemDomain = mixTagDomain.getMixTagItemDomainList().get(i);
                    W2008ListDomain listDomain = new W2008ListDomain();

                    // Copy of property
                    // プロパティのコピー

                    CommonUtil.copyPropertiesDomainToDomain(listDomain, mixTagDomain);
                    CommonUtil.copyPropertiesDomainToDomain(listDomain, mixTagItemDomain);

                    // resetting of an item overwritten
                    // 上書きされる項目の再設定
                    listDomain.setShipperCd(mixTagDomain.getShipperCd());
                    listDomain.setCustomerCd(mixTagDomain.getCustomerCd());
                    listDomain.setLgcyShipTo(mixTagDomain.getLgcyShipTo());
                    listDomain.setTrnsCd(mixTagDomain.getTrnsCd());
                    listDomain.setPlntCd(mixTagDomain.getPlntCd());
                    listDomain.setLgcyWhCd(mixTagDomain.getLgcyWhCd());
                    listDomain.setPltzInstrNo(mixTagDomain.getPltzInstrNo());
                    listDomain.setWhCompCd(mixTagDomain.getWhCompCd());
                    listDomain.setWhCd(mixTagDomain.getWhCd());
                    listDomain.setMixTagStatus(mixTagDomain.getMixTagStatus());
                    listDomain.setInvoiceKey(mixTagDomain.getInvoiceKey());
                    listDomain.setContainerSortingKey(mixTagDomain.getContainerSortingKey());                
                    listDomain.setLoadingCd(mixTagDomain.getLoadingCd());
                    listDomain.setNetWeight(decimalToString(mixTagDomain.getNetWeight(), FORMAT_WEIGHT));
                    listDomain.setGrossWeight(decimalToString(mixTagDomain.getGrossWeight(), FORMAT_WEIGHT));
                    listDomain.setBoxNo(mixTagDomain.getBoxNo());
                    listDomain.setMixTagNo(mixTagDomain.getMixTagNo());
                    listDomain.setWeightUnit(mixTagDomain.getWeightUnit());

                    // Y fixation (a Mix Tag RT exists)  
                    // Y固定(MIXED用RT材が存在する)
                    listDomain.setPkgIp("Y");

                    // The SEQUENCE NO from 1
                    // 1からの連番
                    listDomain.setNo(i + 1);

                    // N/W + XXXX 
                    if (listDomain.getNetWeight() != null) {
                        // Acquisition of WEIGHT UNIT, and a NET WEIGHT
                        // 重量単位とネット重量の取得
                        String itemWeightUnit = listDomain.getWeightUnit();
                        BigDecimal itemNetWeight = mixTagDomain.getNetWeight();

                        // Converted of a WEIGHT UNIT
                        // 重量単位の変換

                        BigDecimal netWeight = commonService.convertWeightUnit(itemNetWeight, itemWeightUnit, shipperWeightUnit);

                        // An error is made when the digit number of integer part exceeds a maximum.
                        // 整数部の桁数が上限を超えた場合はエラー
                        if (netWeight == null) {
                            Object[] params = {
                                commonService.getResource(mixTagDomain.getLocale(), "label.netWeight")
                            };
                            throw new GscmApplicationException(NXS_E7_0157, params);
                        }

                        listDomain.setNetWeight(decimalToString(netWeight, FORMAT_WEIGHT));

                    }

                    // G/W + XXXX 
                    if (listDomain.getGrossWeight() != null) {
                        // Acquisition of WEIGHT UNIT, and a NET WEIGHT
                        // 重量単位とネット重量の取得
                        String itemWeightUnit = listDomain.getWeightUnit();
                        BigDecimal itemGrossWeight = mixTagDomain.getGrossWeight();

                        // Converted of a WEIGHT UNIT
                        // 重量単位の変換

                        BigDecimal grossWeight = commonService.convertWeightUnit(itemGrossWeight, itemWeightUnit, shipperWeightUnit);

                        // An error is made when the digit number of integer part exceeds a maximum.
                        // 整数部の桁数が上限を超えた場合はエラー
                        if (grossWeight == null) {
                            Object[] params = {
                                commonService.getResource(mixTagDomain.getLocale(), "label.grossWeight")
                            };
                            throw new GscmApplicationException(NXS_E7_0157, params);
                        }

                        listDomain.setGrossWeight(decimalToString(grossWeight, FORMAT_WEIGHT));

                    }


                    String authFlg = mixTagItemDomain.getAuth();

                    // Masking processing
                    // マスキング処理

                    listDomain.setItemNo(mask(mixTagItemDomain.getItemNo(), authFlg));
                    listDomain.setPkgCd(mask(mixTagItemDomain.getPkgCd(), authFlg));
                    listDomain.setItemDescription(mask(mixTagItemDomain.getItemDescription(), authFlg));
                    listDomain.setShippingLot(mask(decimalToString(mixTagItemDomain.getShippingLot(), null), authFlg));
                    listDomain.setInstrQty(mask(decimalToString(mixTagItemDomain.getInstrQty(), null), authFlg));
                    listDomain.setQty(mask(decimalToString(mixTagItemDomain.getQty(), null), authFlg));
                    listDomain.setTagQty(mask(decimalToString(mixTagItemDomain.getTagQty(), null), authFlg));
                    listDomain.setAuthFlg(authFlg);

                    listDomainList.add(listDomain);
                }
            }
            
            // set criteria for display
            if (mixTagDomain != null && listDomainList != null && !listDomainList.isEmpty()) {
                criteriaDomain.setWeightUnit(shipperWeightUnit);
                String weightUnitDisp = commonService.searchMeasureUnitDisp(shipperWeightUnit);
                criteriaDomain.setWeightUnitDisp(weightUnitDisp);
            }
        }
        
        return listDomainList;
    }
    
    /**
     *   {@link W2005MixTagDomain} is changed into {@link W2008ListDomain}.(at the time of the changes from a Create screen)
     * <br />{@link W2005MixTagDomain}を{@link W2008ListDomain}に変換します。(Create画面からの遷移時)
     *
     * @param mixTagDomain {@link W2005MixTagDomain} of a changing agency<br />変換元の{@link W2005MixTagDomain}
     * @param criteriaDomain W2008CriteriaDomain<br />W2008CriteriaDomain
     * @return Created {@link W2008ListDomain}<br />作成した{@link W2008ListDomain}
     * @throws ApplicationException When not convertible<br />変換できない場合
     */
    protected List<? extends W2008ListDomain> convertToListDomainFromCreate(W2005MixTagDomain mixTagDomain, W2008CriteriaDomain criteriaDomain) 
        throws ApplicationException {
        List<W2008ListDomain> listDomainList = new ArrayList<W2008ListDomain>();

        // Acquisition of the WEIGHT UNIT of Shipper
        // Shipperの重量単位の取得
        String shipperWeightUnit = commonService.searchWeightUnit(criteriaDomain.getShipperCd());

        if (mixTagDomain != null) {

            for (int i = 0; i < mixTagDomain.getMixTagItemDomainList().size(); i++) {
                W2005MixTagItemDomain mixTagItemDomain = mixTagDomain.getMixTagItemDomainList().get(i);
                W2008ListDomain listDomain = new W2008ListDomain();

                // Copy of property
                // プロパティのコピー
                CommonUtil.copyPropertiesDomainToDomain(listDomain, mixTagDomain);
                CommonUtil.copyPropertiesDomainToDomain(listDomain, mixTagItemDomain);
                
                // resetting of an item overwritten
                // 上書きされる項目の再設定
                listDomain.setShipperCd(mixTagDomain.getShipperCd());
                listDomain.setCustomerCd(mixTagDomain.getCustomerCd());
                listDomain.setLgcyShipTo(mixTagDomain.getLgcyShipTo());
                listDomain.setTrnsCd(mixTagDomain.getTrnsCd());
                listDomain.setLgcyWhCd(mixTagDomain.getLgcyWhCd());
                listDomain.setPltzInstrNo(mixTagDomain.getPltzInstrNo());
                listDomain.setPlntCd(mixTagDomain.getPlntCd());
                listDomain.setWhCompCd(mixTagDomain.getWhCompCd());
                listDomain.setWhCd(mixTagDomain.getWhCd());
                listDomain.setMixTagStatus(mixTagDomain.getMixTagStatus());
                listDomain.setInvoiceKey(mixTagDomain.getInvoiceKey());
                listDomain.setContainerSortingKey(mixTagDomain.getContainerSortingKey());                
                listDomain.setLoadingCd(mixTagDomain.getLoadingCd());
                listDomain.setNetWeight(decimalToString(mixTagDomain.getNetWeight(), FORMAT_WEIGHT));
                listDomain.setGrossWeight(decimalToString(mixTagDomain.getGrossWeight(), FORMAT_WEIGHT));
                listDomain.setBoxNo(mixTagDomain.getBoxNo());
                listDomain.setMixTagNo(mixTagDomain.getMixTagNo());
                listDomain.setCustomTimingTyp(mixTagDomain.getCustomTimingTyp());
                listDomain.setContainerLooseTyp(mixTagDomain.getContainerLooseTyp());

                // The SEQUENCE NO from 1
                // 1からの連番
                listDomain.setNo(i + 1);

                listDomainList.add(listDomain);   
            }
        }
        
        // set criteria for display
        if (mixTagDomain != null && listDomainList != null && !listDomainList.isEmpty()) {
            criteriaDomain.setMixTagStatus("");
            criteriaDomain.setInvoiceKey(listDomainList.get(0).getInvoiceKey());
            criteriaDomain.setContainerSortingKey(listDomainList.get(0).getContainerSortingKey());
            criteriaDomain.setLoadingCd(listDomainList.get(0).getLoadingCd());
            criteriaDomain.setNetWeight(decimalToString(mixTagDomain.getNetWeight(), FORMAT_WEIGHT));
            criteriaDomain.setWeightUnit(listDomainList.get(0).getWeightUnit());
            String weightUnitDisp = commonService.searchMeasureUnitDisp(shipperWeightUnit);
            criteriaDomain.setWeightUnitDisp(weightUnitDisp);
            criteriaDomain.setGrossWeight(decimalToString(mixTagDomain.getGrossWeight(), FORMAT_WEIGHT));
            criteriaDomain.setPkgIp(mixTagDomain.getPkgIp());
            criteriaDomain.setBoxNo("");
            criteriaDomain.setMixTagNo("");
            criteriaDomain.setContainerLooseTyp(listDomainList.get(0).getContainerLooseTyp());
            criteriaDomain.setCustomTimingTyp(listDomainList.get(0).getCustomTimingTyp());
            criteriaDomain.setNetWeightOverflow(mixTagDomain.isNetWeightOverflow());
            criteriaDomain.setGrossWeightOverflow(mixTagDomain.isGrossWeightOverflow());
        }
        
        return listDomainList;
    }
    
    /**
     * Change the VALUE of BigDecimal into a string.
     * <br />BigDecimalの値を文字列に変換する。
     * <pre>
     * - null is returned when an argument is null.
     *     When this is not null, the result of having carried out {@link BigDecimal#toPlainString()} to the argument is returned.
     *
     * - 引数がnullの場合は、null を返す。
     *   nullでない場合は、引数に対して {@link BigDecimal#toPlainString()} を実施した結果を返す。
     * </pre>
     * @param decimalVal The VALUE of BigDecimal<br />BigDecimalの値
     * @param format Formater<br />フォーマッタ
     * @return The VALUE after a converted<br />変換後の値
     */
    protected String decimalToString(BigDecimal decimalVal, String format){
        
        if (decimalVal == null ) {
            return null;
        }
        if (format != null) {
            return NumberUtil.format(decimalVal, format);
        } else {
            return decimalVal.toPlainString();
        }
    }
    
    /**
     * Transpose an input string to *.
     * <br />入力文字列を*に置き換えます。
     *
     * @param s Changing agency string<br />変換元文字列
     * @param authFlg Authority class<br />権限区分
     * @return Converting destination string<br />変換先文字列
     */
    protected String mask(String s, String authFlg) {
        
        if (s == null){
            return s;
        }
        if (AUTH_EMPTY_NUMERIC.endsWith(authFlg)) {
            return s.replaceAll(".", "*");
        } else {
            return s;
        }
    }
}
