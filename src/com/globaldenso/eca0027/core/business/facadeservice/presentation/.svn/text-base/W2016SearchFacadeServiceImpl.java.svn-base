/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FORMAT_WEIGHT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0157;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W2016;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W2014PltzDomain;
import com.globaldenso.eca0027.core.business.domain.W2016CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W2016ListDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W2014XtagCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W2014XtagService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.NumberUtil;
import com.globaldenso.gscm.framework.util.PageInfoCreator;
import com.globaldenso.gscm.framework.util.PageInfoData;
import com.globaldenso.gscm.framework.util.Validator;

/**
 * The search service facade implementation class of X-tag Create
 * <br />X-tag Create画面のSearchFacadeサービス実装クラスです。
 * <pre>
 * bean id:W2016SearchFacade
 * </pre>
 *
 * @author $Author: 810833843 $
 * @version $Revision: 6750 $
 */
public class W2016SearchFacadeServiceImpl extends AbstractSearchFacadeService<List<? extends W2016ListDomain>, W2016CriteriaDomain> {

    /**
     * Common service
     * <br />Commonサービス
     */
    protected CommonService commonService;
    
    /**
     * X-Palletize service
     * <br />まとめパレタイズサービス
     */
    protected W2014XtagService w2014XtagService;

    /**
     * constructor.
     */
    public W2016SearchFacadeServiceImpl() {
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
    protected W2016CriteriaDomain filterDomain(W2016CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {
        // No Action
        // 処理なし
        return criteriaDomain;
    }
    
    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - Common error check
     *     Refer for details to "画面定義書_ECA0027_W2016_X-Tag Create.xls「画面項目定義」"
     *
     * - 共通エラーチェック
     *     画面定義書_ECA0027_W2016_X-Tag Create.xls「画面項目定義」を参照
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W2016CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        Validator<W2016CriteriaDomain> valid 
            = new Validator<W2016CriteriaDomain>(criteriaDomain, "w2016CriteriaDomain");

        // number of digit, attribute, form check (for this screen)
        // 桁数、属性、書式チェック(画面固有)
        String[] properties = {
            "shipperCd",
            "mainMark"
        };
        valid.isValidateProperties(properties, SCREEN_ID_W2016);

        // check errors
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
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W2016CriteriaDomain criteriaDomain)
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
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W2016CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // No Action
        // 処理なし
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - Create search-condition domain
     *     create {@link W2014XtagCriteriaDomain} and set the contents of criteriaDomain
     * - Get the number of Palletize, X Palletize work, NEXUS Ship To master unit
     *     call {@link W2014XtagService#searcCountOnCreateSearch(W2014XtagCriteriaDomain)}
     * - calculate the range of search result
     *     calculate start and end position from the number of search result and the number per page
     *     set calculate result to {@link W2014XtagCriteriaDomain}
     * - Search for Palletize, X Palletize, NEXUS Ship To Master unit
     *     {@link W2014XtagService#searchForPagingOnCreateSearch(W2014XtagCriteriaDomain)}
     * - Convert to List Domain
     *     Convert search result to {@link W2016ListDomain}
     * 
     * - 検索条件ドメインの作成
     *     {@link W2014XtagCriteriaDomain}を作成し、criteriaDomainの内容をコピー
     *     
     * - パレタイズ、まとめパレタイズワーク、NEXUS送荷先原単位の件数取得
     *     {@link W2014XtagService#searcCountOnCreateSearch(W2014XtagCriteriaDomain)}を呼出
     *     
     * - 要求ページに対応する検索範囲を算出
     *     検索件数、1ページ辺りの件数をもとに検索開始・終了位置を計算する
     *     計算結果を{@link W2014XtagCriteriaDomain}に設定する
     *     
     * - パレタイズ、まとめパレタイズワーク、NEXUS送荷先原単位の検索
     *     {@link W2014XtagService#searchForPagingOnCreateSearch(W2014XtagCriteriaDomain)}を呼出
     *     
     * - Listドメインへの変換
     *     検索した結果を{@link W2016ListDomain}に変換する
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected List<? extends W2016ListDomain> callServices(W2016CriteriaDomain criteriaDomain) 
        throws GscmApplicationException, ApplicationException {
        
        // Create search-condition domain
        // 検索条件ドメインの作成
        W2014XtagCriteriaDomain criteria = createCriteria(criteriaDomain);
        
        // get the number of search result
        // 検索件数の取得
        int count = searchCount(criteria);
        
        // set the range of search
        // 検索範囲の設定
        setPageInfo(criteriaDomain.getPageInfoCreator(), count, criteria);
        
        // Search for Packing Instruction
        // 梱包指示の検索
        List<? extends W2014PltzDomain> pltzList = new ArrayList<W2014PltzDomain>();
        try {
            pltzList = searchForPaging(criteria);
        } catch (ApplicationException e) {
            String errCd = e.getCode();
            
            // error when the number of digit exceed the maximum (integer part)
            // 整数部の桁数が上限を超えた場合はエラー
            if (NXS_E7_0157.equals(errCd)){
                Object[] params = {
                    commonService.getResource(criteriaDomain.getLocale(), "label.grossWeight")
                };
                throw new GscmApplicationException(NXS_E7_0157, params);
            } else {
                throw new ApplicationException(e);
            }
        }
        
        // Convert to List Domain
        // リストドメインへの変換
        return convertToListDomain(pltzList);
    }

    /**
     * Create search-condition domain of X Palletize Service
     * <br />まとめパレタイズ サービスの検索条件ドメインを作成します。
     *
     * @param criteriaDomain search-condition domain of X-TAG Criteria domain<br />まとめCML Criate画面の検索条件ドメイン
     * @return search-condition domain of X-Palletize service<br />まとめパレタイズ サービスの検索条件ドメイン
     */
    protected W2014XtagCriteriaDomain createCriteria(W2016CriteriaDomain criteriaDomain) {
        W2014XtagCriteriaDomain criteria = new W2014XtagCriteriaDomain();
        
        // setting to get the maximum number
        // 最大件数を取得するための設定
        criteria.setScreenId(criteriaDomain.getScreenId());
        criteria.setLocale(new Locale(criteriaDomain.getLanguageCd()));
        
        // copy search-condition
        // 検索条件をコピー
        CommonUtil.copyPropertiesDomainToDomain(criteria, criteriaDomain, criteriaDomain.getScreenDateFormat());
        criteria.setWeightUnit(criteriaDomain.getWeightUnit());
        
        return criteria;
    }
    
    /**
     * get the number of search result
     * <br />検索件数を取得します。
     *
     * @param criteria search-condition domain of X Palletize service<br />まとめパレタイズ サービスの検索条件ドメイン
     * @return the number of search result<br />検索件数
     * @throws ApplicationException when you can not get Palletize, X Palletize work, NEXUS Ship To master unit<br />パレタイズ、まとめパレタイズワーク、NEXUS送荷先原単位が参照できない場合
     */
    protected int searchCount(W2014XtagCriteriaDomain criteria) 
        throws ApplicationException {
        return w2014XtagService.searcCountOnCreateSearch(criteria);
    }
    
    /**
     * calculate the range of search
     * <br />検索範囲を算出します。
     *
     * @param pageInfoCreator PageInfoCreator Object<br />PageInfoCreatorオブジェクト
     * @param count the number of search result<br />検索件数
     * @param criteria search-condition domain of X Palletize service<br />まとめパレタイズ サービスの検索条件ドメイン
     * @throws ApplicationException when you can not calculate the range of search<br />検索範囲が計算できない場合
     */
    protected void setPageInfo(PageInfoCreator pageInfoCreator, int count, W2014XtagCriteriaDomain criteria) 
        throws ApplicationException {
        
        // get page information
        // ページ情報の取得
        PageInfoData pageInfoData = pageInfoCreator.createPageInfoData(count, null, null, criteria.getLocale());
        
        // set start and end position to search-condition domain
        // 検索条件ドメインに開始・終了位置を設定
        criteria.setRowNumFrom(pageInfoData.getFromCount());
        criteria.setRowNumTo(pageInfoData.getToCount());
    }
    
    
    /**
     * Search for Palletize, X Palletize and NEXUS Ship To Master unit
     * <br />パレタイズ、まとめパレタイズワーク、NEXUS送荷先原単位を検索します。
     *
     * @param criteria search-condition domain of X Palletize service<br />まとめパレタイズ サービスの検索条件ドメイン
     * @return List of Palletize domain<br />パレタイズドメインのリスト
     * @throws ApplicationException when you can not get Palletize, X Palletize work, NEXUS Ship To master unit<br />パレタイズ、まとめパレタイズワーク、NEXUS送荷先原単位が参照できない場合
     */
    protected List<? extends W2014PltzDomain> searchForPaging(W2014XtagCriteriaDomain criteria) 
        throws ApplicationException {
        return w2014XtagService.searchForPagingOnCreateSearch(criteria);
    }
    
    /**
     * Convert the List of Palletize domain to List Domain
     * <br />パレタイズドメインのリストをリストドメインのリストに変換します。
     *
     * @param pltzList List of Palletize domain<br />パレタイズドメインのリスト
     * @return List Domain<br />リストドメイン
     */
    protected List<W2016ListDomain> convertToListDomain(List<? extends W2014PltzDomain> pltzList) {
        List<W2016ListDomain> listDomainList = new ArrayList<W2016ListDomain>();
        
        if (pltzList != null) {
            for (W2014PltzDomain pltz : pltzList) {
                W2016ListDomain listDomain = new W2016ListDomain();
                
                // copy property
                // プロパティのコピー
                CommonUtil.copyPropertiesDomainToDomain(listDomain, pltz);
                
                listDomain.setGrossWeight(NumberUtil.format(pltz.getGrossWeight(), FORMAT_WEIGHT));
                
                listDomainList.add(listDomain);
            }
        }
        
        return listDomainList;
    }
}
