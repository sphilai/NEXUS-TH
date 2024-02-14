/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.AUTH_EMPTY_NUMERIC;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FORMAT_VOLUME;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FORMAT_WEIGHT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W2014;

import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W2014PltzDomain;
import com.globaldenso.eca0027.core.business.domain.W2014XtagDomain;
import com.globaldenso.eca0027.core.business.domain.W2016ListDomain;
import com.globaldenso.eca0027.core.business.domain.W2017CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W2017ListDomain;
import com.globaldenso.eca0027.core.business.domain.W2017UpdateDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W2014XtagCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W2014XtagService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.DateUtil;
import com.globaldenso.gscm.framework.util.NumberUtil;

/**
 * The initial service facade implementation class of X-tag Register
 * <br />X-tag Register画面のInitFacadeサービス実装クラスです。
 * <pre>
 * bean id:W2017InitFacadeService
 * </pre>
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 11243 $
 */
public class W2017InitFacadeServiceImpl extends AbstractSearchFacadeService<W2017UpdateDomain, W2017UpdateDomain> {

    /**
     * Common service
     * <br />Commonサービス
     */
    protected CommonService commonService;
    
    /**
     * X Palletize service
     * <br />まとめパレタイズサービス
     */
    protected W2014XtagService w2014XtagService;
    
    /**
     * constructor.
     */
    public W2017InitFacadeServiceImpl() {
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
     * Setter method for w2014XtagService.
     *
     * @param xtagService Set for w2014XtagService
     */
    public void setW2014XtagService(W2014XtagService xtagService) {
        w2014XtagService = xtagService;
    }
    
    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * No Action
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W2017UpdateDomain filterDomain(W2017UpdateDomain updateDomain)
        throws GscmApplicationException, ApplicationException {
        // No Action
        // 処理なし
        return updateDomain;
    }
    
    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * No Action
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W2017UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // No Action
        // 処理なし
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * No Action
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W2017UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // No action
        // 処理なし
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * No Action
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W2017UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // No Action
        // 処理なし
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - At the time of screen change from Main screen
     *     - Create search-condition domain
     *         set search condition to {@link W2014XtagCriteriaDomain}
     *     - Search for X Palletize, Palletize
     *         set {@link W2014XtagCriteriaDomain} as argument
     *         call {@link W2014XtagService#searchOnRegisterInitByFromMain(W2014XtagCriteriaDomain)}
     *     - Create update domain
     *         create {@link W2017CriteriaDomain} and set the contents of {@link W2014XtagDomain} and {@link W2014PltzDomain}
     *         create {@link W2017ListDomain} and set the contents of {@link W2014XtagDomain} and {@link W2014PltzDomain}
     *         create {@link W2017UpdateDomain} and set result above
     *     - Return Update domain
     * - At the time of screen change from Create screen
     *     - Create search-condition domain
     *         set search condition to {@link W2014XtagCriteriaDomain}
     *     - Search for X Palletize work, Palletize
     *         set {@link W2014XtagCriteriaDomain} as argument
     *         call {@link W2014XtagService#searchOnRegisterInitByFromCreate(W2014XtagCriteriaDomain)}
     *     - Create update domain
     *         create {@link W2017CriteriaDomain} and set the contents of {@link W2014XtagDomain} and {@link W2014PltzDomain}
     *         create {@link W2017ListDomain} and set the contents of {@link W2014XtagDomain} and {@link W2014PltzDomain}
     *         create {@link W2017UpdateDomain} and set result above
     *     - Return Update domain
     * 
     * - Main画面からの遷移時
     *     - 検索条件ドメインの作成
     *         {@link W2014XtagCriteriaDomain}に検索条件を設定する
     *         
     *     - まとめパレタイズ、パレタイズの検索
     *         {@link W2014XtagCriteriaDomain}を引数に{@link W2014XtagService#searchOnRegisterInitByFromMain(W2014XtagCriteriaDomain)}を呼出す
     *         
     *     - Updateドメインの作成
     *         {@link W2017CriteriaDomain}を作成し、{@link W2014XtagDomain}、{@link W2014XtagDomain}の内容を設定する
     *         {@link W2017ListDomain}を作成し、{@link W2014XtagDomain}、{@link W2014PltzDomain}の内容を設定する
     *         {@link W2017UpdateDomain}を作成し、上記の結果を設定する
     *           
     *     - Updateドメインの返却
     *     
     * - Create画面からの遷移時
     *     - 検索条件ドメインの作成
     *         {@link W2014XtagCriteriaDomain}に検索条件を設定する
     *         
     *     - まとめパレタイズワーク、パレタイズの検索
     *         {@link W2014XtagCriteriaDomain}を引数に{@link W2014XtagService#searchOnRegisterInitByFromCreate(W2014XtagCriteriaDomain)}を呼出す
     *         
     *     - Updateドメインの作成
     *         {@link W2017CriteriaDomain}を作成し、{@link W2014XtagDomain}、{@link W2014XtagDomain}の内容を設定する
     *         {@link W2017ListDomain}を作成し、{@link W2014XtagDomain}、{@link W2014PltzDomain}の内容を設定する
     *         {@link W2017UpdateDomain}を作成し、上記の結果を設定する
     *           
     *     - Updateドメインの返却
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W2017UpdateDomain callServices(W2017UpdateDomain updateDomain) 
        throws GscmApplicationException, ApplicationException {
        if (updateDomain.getDeleteFlg() == null || !updateDomain.getDeleteFlg().equals(FLAG_Y)) {
            // screen change from Main screen
            // Main画面からの遷移
            if (SCREEN_ID_W2014.equals(updateDomain.getCriteriaDomain().getCallScreenId())) {
                W2014XtagCriteriaDomain criteria = createCriteriaFromMain(updateDomain.getCriteriaDomain());
                criteria.setSearchCountCheckFlg(false);
                
                W2014XtagDomain xtag = searchFromMain(criteria);
                
                return convertToUpdateDomainFromMain(xtag, updateDomain.getCriteriaDomain());

                // screen change from Create screen
                // Create画面からの遷移
            } else {
                W2014XtagCriteriaDomain criteria = createCriteriaFromCreate(updateDomain.getCriteriaDomain());
                
                W2014XtagDomain xtag = new W2014XtagDomain();

                xtag = searchFromCreate(criteria);

                return convertToUpdateDomainFromCreate(xtag, updateDomain.getCriteriaDomain());
            }
        } else {
            if (updateDomain.getW2016ListDomainList() != null) {
                List<W2014PltzDomain> pltzList = new ArrayList<W2014PltzDomain>();
                for (W2016ListDomain listDomain : updateDomain.getW2016ListDomainList()) {
                    if (!FLAG_Y.equals(listDomain.getDisabledFlg())) {
                        W2014PltzDomain pltz = new W2014PltzDomain();
                        CommonUtil.copyPropertiesDomainToDomain(pltz, listDomain);
                        pltz.setLoginUserDscId(updateDomain.getLoginUserDscId());
                        pltzList.add(pltz);
                    }
                }
                w2014XtagService.deletePltzList(pltzList);
            }
            return updateDomain;
        }
    }

    /**
     * Create search-condition of X Palletize (screen change from Main screen)
     * <br />まとめパレタイズの検索条件ドメインを作成します。(Main画面からの遷移時)
     *
     * @param criteriaDomain search-condition domain of X-TAG Register screen<br />まとめCML Register画面の検索条件ドメイン
     * @return search condition domain of X Palletize<br />まとめパレタイズの検索条件ドメイン
     */
    protected W2014XtagCriteriaDomain createCriteriaFromMain(W2017CriteriaDomain criteriaDomain) {
        W2014XtagCriteriaDomain criteria = new W2014XtagCriteriaDomain();
        
        // set X-Tag No.
        // X-Tag No.設定
        criteria.setXmainMark(criteriaDomain.getXmainMark());
        
        // set Units
        // 単位関連
        criteria.setWeightUnit(criteriaDomain.getWeightUnit());
        criteria.setWeightUnitDisplay(criteriaDomain.getWeightUnitDisplay());
        criteria.setVolumeUnit(criteriaDomain.getVolumeUnit());
        criteria.setVolumeUnitDisplay(criteriaDomain.getVolumeUnitDisplay());
        
        // set Server ID
        // サーバーID
        criteria.setServerId(criteriaDomain.getServerId());
        
        return criteria;
    }
    
    /**
     * Create search-condition domain of X Palletize (screen change from Create screen)
     * <br />まとめパレタイズの検索条件ドメインを作成します。(Create画面からの遷移時)
     *
     * @param criteriaDomain search-condition domain of X-TAG Register screen<br />まとめCML Register画面の検索条件ドメイン
     * @return search-condition domain of X Palletize<br />まとめパレタイズの検索条件ドメイン
     */
    protected W2014XtagCriteriaDomain createCriteriaFromCreate(W2017CriteriaDomain criteriaDomain) {
        W2014XtagCriteriaDomain criteria = new W2014XtagCriteriaDomain();

        // set DSC-ID
        // DSC-IDの設定
        criteria.setLoginUserDscId(criteriaDomain.getLoginUserDscId());
        
        // set Weight Unit
        // 重量単位の設定
        criteria.setWeightUnit(criteriaDomain.getWeightUnit());
        
        return criteria;
    }

    /**
     * Search X Palletize and Palletize (screen change from Main screen)
     * <br />まとめパレタイズ、パレタイズを検索します。(Main画面からの遷移時)
     *
     * @param criteria search-condition domain<br />検索条件ドメイン
     * @return {@link W2014XtagDomain}
     * @throws ApplicationException when you can not get X Palletize and Palletize<br />まとめパレタイズ、パレタイズが参照できない場合
     */
    protected W2014XtagDomain searchFromMain(W2014XtagCriteriaDomain criteria) 
        throws ApplicationException {   
        return w2014XtagService.searchOnRegisterInitByFromMain(criteria);
    }
    
    /**
     * Search X Palletize and Palletize (screen change from Create screen)
     * <br />まとめパレタイズワーク、パレタイズを検索します。(Create画面からの遷移時)
     *
     * @param criteria search-condition domain<br />検索条件ドメイン
     * @return {@link W2014XtagDomain}
     * @throws ApplicationException when you can not get X Palletize and Palletize<br />まとめパレタイズワーク、パレタイズが参照できない場合
     */
    protected W2014XtagDomain  searchFromCreate(W2014XtagCriteriaDomain criteria) 
        throws ApplicationException {
        return w2014XtagService.searchOnRegisterInitByFromCreate(criteria);
    }
    
    /**
     * Convert {@link W2014XtagDomain} to {@link W2017UpdateDomain}
     * <br />{@link W2014XtagDomain}を{@link W2017UpdateDomain}に変換します。(Main画面からの遷移時)
     *
     * @param xtag {@link W2014XtagDomain}　converted from<br />変換元の{@link W2014XtagDomain}
     * @param argCriteriaDomain search-condition domain of X Palletize<br />まとめパレタイズ検索条件ドメイン{@link W2014XtagCriteriaDomain}
     * @return created {@link W2017UpdateDomain}<br />作成した{@link W2017UpdateDomain}
     */
    protected W2017UpdateDomain convertToUpdateDomainFromMain(W2014XtagDomain xtag, W2017CriteriaDomain argCriteriaDomain) {
        W2017UpdateDomain updateDomain = new W2017UpdateDomain();
        
        W2017CriteriaDomain criteriaDomain = new W2017CriteriaDomain();
        
        List<W2017ListDomain> listDomainList = new ArrayList<W2017ListDomain>();
        
        if (xtag != null) {
            // set creteria domain
            // criteriaドメインの設定
            CommonUtil.copyPropertiesDomainToDomain(criteriaDomain, xtag);
            if (xtag.getVolume() != null) {
                criteriaDomain.setVolume(NumberUtil.format(xtag.getVolume(), FORMAT_VOLUME));
            }
            if (xtag.getGrossWeight() != null) {
                criteriaDomain.setGrossWeight(NumberUtil.format(xtag.getGrossWeight(), FORMAT_WEIGHT));
            }
            
            // set X-TAG PACKING DATE
            // まとめ梱包日の設定
            String xtagPackingDt = DateUtil.formatDate(xtag.getXtagPackingDt(), argCriteriaDomain.getScreenDateFormat());
            criteriaDomain.setXtagPackingDt(xtagPackingDt);
            
            criteriaDomain.setOuterPkgComCd(null);
            criteriaDomain.setCustomTimingTyp(null);
            criteriaDomain.setShipperCdList(null);
            
            // set Weight Unit of detail line
            // 明細行の重量表記
            criteriaDomain.setWeightUnitDisplayDtlTitle(argCriteriaDomain.getWeightUnitDisplay());

            // set list domain
            // listドメインの設定
            for (W2014PltzDomain pltz : xtag.getPltzDomainList()) {
                W2017ListDomain listDomain = new W2017ListDomain();
                
                // copy property
                // プロパティコピーの設定
                CommonUtil.copyPropertiesDomainToDomain(listDomain, pltz);
                
                listDomain.setGrossWeight(NumberUtil.format(pltz.getGrossWeight(), FORMAT_WEIGHT));
                
                // Masking process
                // マスキング処理
                if (pltz.getAuth().compareTo(AUTH_EMPTY_NUMERIC) == 0) {
                    listDomain.setShipperCd(mask(pltz.getShipperCd()));
                    listDomain.setMainMark(mask(pltz.getMainMark()));
                    listDomain.setGrossWeight(mask(listDomain.getGrossWeight()));
                }

                listDomainList.add(listDomain);
            }
        }
        
        updateDomain.setCriteriaDomain(criteriaDomain);
        updateDomain.setListDomainList(listDomainList);
        return updateDomain;
    }
    
    /**
     * Convert {@link W2014XtagDomain} to {@link W2017UpdateDomain}
     * <br />{@link W2014XtagDomain}を{@link W2017UpdateDomain}に変換します。(Create画面からの遷移時)
     *
     * @param xtag {@link W2014XtagDomain} converted from<br />変換元の{@link W2014XtagDomain}
     * @param argCriteriaDomain search-condition domain of X Palletize<br />まとめパレタイズ検索条件ドメイン{@link W2014XtagCriteriaDomain}
     * @return created {@link W2017UpdateDomain}<br />作成した{@link W2017UpdateDomain}
     */
    protected W2017UpdateDomain convertToUpdateDomainFromCreate(W2014XtagDomain xtag, W2017CriteriaDomain argCriteriaDomain) {
        W2017UpdateDomain updateDomain = new W2017UpdateDomain();
        
        W2017CriteriaDomain criteriaDomain = new W2017CriteriaDomain();
        
        List<W2017ListDomain> listDomainList = new ArrayList<W2017ListDomain>();
        
        if (xtag != null) {
            // set criteria domain
            // criteriaドメインの設定
            CommonUtil.copyPropertiesDomainToDomain(criteriaDomain, argCriteriaDomain);
            criteriaDomain.setXtagPackingDt(null);
            criteriaDomain.setXtagPackingIssuerNm(null);
            criteriaDomain.setTotalShipper(xtag.getTotalShipper().toString());
            criteriaDomain.setVolume(null);
            criteriaDomain.setVolumeUnitDisplay(null);
            criteriaDomain.setGrossWeight(null);
            criteriaDomain.setWeightUnitDisplay(null);
            criteriaDomain.setOuterPkgCd(null);
            criteriaDomain.setPalletNo(null);
            criteriaDomain.setXmainMark(null);
            criteriaDomain.setOuterPkgComCd(null);
            criteriaDomain.setCustomTimingTyp(xtag.getCustomTimingTyp());
            criteriaDomain.setShipperCdList(xtag.getShipperCdList());

            if (xtag.getVolume() != null) {
                criteriaDomain.setVolume(NumberUtil.format(xtag.getVolume(), FORMAT_VOLUME));
            }
            if (xtag.getGrossWeight() != null) {
                criteriaDomain.setGrossWeight(NumberUtil.format(xtag.getGrossWeight(), FORMAT_WEIGHT));
            }

            // set list domain
            // listドメインの設定
            for (W2014PltzDomain pltz : xtag.getPltzDomainList()) {
                W2017ListDomain listDomain = new W2017ListDomain();
                
                // copy property
                // プロパティコピー
                CommonUtil.copyPropertiesDomainToDomain(listDomain, pltz);
                
                listDomain.setGrossWeight(NumberUtil.format(pltz.getGrossWeight(), FORMAT_WEIGHT));
                
                listDomainList.add(listDomain);
            }
        }
        
        updateDomain.setCriteriaDomain(criteriaDomain);
        updateDomain.setListDomainList(listDomainList);
        
        return updateDomain;
    }
    
    /**
     * convert input string to "*"
     * <br />入力文字列を*に置き換えます。
     *
     * @param s original string<br />変換元文字列
     * @return converted string<br />変換先文字列
     */
    protected String mask(String s) {
        
        if (s == null){
            return s;
        }
        return s.replaceAll(".", "*");
    }
}
