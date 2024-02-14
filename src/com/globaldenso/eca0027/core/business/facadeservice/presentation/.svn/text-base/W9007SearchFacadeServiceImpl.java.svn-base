/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W9007;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W9007CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W9007ExpShipToShippingMaItemDomain;
import com.globaldenso.eca0027.core.business.domain.W9007ListDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W9007ExpShipToShippingMaCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W9007ExpShipToShippingMaService;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.Validator;

/**
 * An implementation class of facade service for search action of Export Ship to Shipping MA Inquiry screen.
 * <br />Export Ship to Shipping MA Inquiry画面のSearchアクションに対するFacadeサービスの実装クラスです。
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W9007SearchFacadeServiceImpl extends
    AbstractSearchFacadeService<List<W9007ListDomain>, W9007CriteriaDomain> {

    /**
     * Exp. Ship To Shipping MA service<br />
     * Exp Ship To Shipping MAのサービス
     */
    protected W9007ExpShipToShippingMaService w9007ExpShipToShippingMaService;

    /**
     * Default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W9007SearchFacadeServiceImpl() {
    }

    /**
     * Setter method for w9007ExpShipToShippingMaService.
     *
     * @param expShipToShippingMaService Set for w9007ExpShipToShippingMaService
     */
    public void setW9007ExpShipToShippingMaService(W9007ExpShipToShippingMaService expShipToShippingMaService) {
        w9007ExpShipToShippingMaService = expShipToShippingMaService;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * Item check.
     * </pre>
     * <pre>
     * 単項目チェック
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W9007CriteriaDomain filterDomain(W9007CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {
        return criteriaDomain;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * - Common error check
     * </pre>
     * <pre>
     * - 共通エラーチェック
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W9007CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {

        Validator<W9007CriteriaDomain> valid = new Validator<W9007CriteriaDomain>(criteriaDomain, "w9007CriteriaDomain");
        
        // 単項目チェック
        String[] properties = {
            "shipperCd",
            "shipToCompCd",
            "containerSortingKey"
        };
        boolean judge = true;
        for(String col : properties){
            judge = true;
            if(col.equals("shipperCd")){
                judge = judge && valid.isPermittedAttr(col, SCREEN_ID_W9007);
            } else {
                judge = judge && valid.isPermittedAttr(col, SCREEN_ID_W9007);
                judge = judge && valid.isPermittedFormat(col, SCREEN_ID_W9007);
            }
        }
            
        // エラー確認
        if (0 < valid.getErrList().size()) {
            throw new ValidationException(valid.getErrList());
        }
    }

    /**
     * {@inheritDoc}
     * <pre>
     * No action.
     * </pre> 
     * <pre>
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W9007CriteriaDomain filterDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
    }

    /**
     * {@inheritDoc}
     * <pre>
     * No action.
     * </pre> 
     * <pre>
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W9007CriteriaDomain filterDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
    }

    /**
     * {@inheritDoc}
     * <pre>
     * Get search result data.
     * </pre>
     * <pre>
     * 検索結果データを取得
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected List<W9007ListDomain> callServices(W9007CriteriaDomain criteria) 
        throws GscmApplicationException, ApplicationException {

        W9007ExpShipToShippingMaCriteriaDomain criteriaDomain = createExpShippingItemSpInfoMaCriteria(criteria);
        
        List<? extends W9007ExpShipToShippingMaItemDomain> itemDomain 
            = w9007ExpShipToShippingMaService.searchForPagingOnInquirySearch(criteriaDomain);
        
        return convertToListDomain(itemDomain, criteriaDomain);
    }
    
    /**
     *  Based on (PL) Search criteria domain, create Search criteria domain (BL).
     * <br />検索条件ドメイン(PL)を基に、検索条件ドメイン(BL)を作成します。
     *
     * @param criteriaDomain  Criteria domain of screen (PL)<br />
     * 画面の検索条件ドメイン(PL)
     * @return Criteria domain for User id  MA service(BL)<br />
     * User id MAサービスの検索条件ドメイン(BL)
     */
    protected W9007ExpShipToShippingMaCriteriaDomain createExpShippingItemSpInfoMaCriteria(W9007CriteriaDomain criteriaDomain) {
        
        W9007ExpShipToShippingMaCriteriaDomain userIdMaCriteria = new W9007ExpShipToShippingMaCriteriaDomain();
        
        // setup for acquiring the maximum number 
        // 最大件数を取得するための設定
        userIdMaCriteria.setScreenId(criteriaDomain.getScreenId());
        userIdMaCriteria.setLocale(new Locale(criteriaDomain.getLanguageCd()));
        
        CommonUtil.copyPropertiesDomainToDomain(userIdMaCriteria, criteriaDomain, criteriaDomain.getScreenDateFormat());
        userIdMaCriteria.setCompCd(criteriaDomain.getShipperCd());
        userIdMaCriteria.setShipToCd(criteriaDomain.getShipToCompCd());
        
        return userIdMaCriteria;
    }
    
    /**
     * Convert Exp Ship To Shipping MA service domain(BL) to List domain of screen(PL).<br />
     * <br />Exp Ship To Shipping MAサービスのドメイン(BL)を画面のリストドメイン(PL)に変換します。
     *
     * @param srcList List of Exp. Ship to Shipping MA service domain<br />
     * Exp Ship To Shipping MAサービスドメインのリスト(BL)
     * @param criteriaDomain Criteria domain of screen(PL)<br />
     * 画面の検索条件ドメイン(PL)
     * @return List domain for Exp. Ship to shipping MA Inquiry screen(PL)<br />
     * Exp Ship To Shipping MA Inquiry画面のリストドメイン(PL)
     */
    protected List<W9007ListDomain> convertToListDomain(List<? extends W9007ExpShipToShippingMaItemDomain> srcList, W9007ExpShipToShippingMaCriteriaDomain criteriaDomain) {
        
        List<W9007ListDomain> dstList = new ArrayList<W9007ListDomain>();
        
        if (srcList != null) {
            for (W9007ExpShipToShippingMaItemDomain src : srcList) {
                W9007ListDomain dst = new W9007ListDomain();
                CommonUtil.copyPropertiesDomainToDomain(dst, src, criteriaDomain.getScreenDateFormat());
                dstList.add(dst);
            }
        }
        return dstList;
    }
}
