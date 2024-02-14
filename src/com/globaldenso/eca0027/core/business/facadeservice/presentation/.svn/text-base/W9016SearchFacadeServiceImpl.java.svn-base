/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W9016;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W9016CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W9016ExpShippingItemSpInfoMaItemDomain;
import com.globaldenso.eca0027.core.business.domain.W9016ListDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W9016ExpShippingItemSpInfoMaCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W9016ExpShippingItemSpInfoMaService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.Validator;

/**
 *  An implementation class of facade service for search action of Export Shipping Parts Special
 *  Information MA inquiry screen.
 * <br />Export Shipping Parts Special Information MA Inquiry画面のSearchアクションに対するFacadeサービスの実装クラスです。
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W9016SearchFacadeServiceImpl extends
    AbstractSearchFacadeService<List<? extends W9016ListDomain>, W9016CriteriaDomain> {

    
    /**
     * Common Features Service<br />
     * 共通機能サービス
     */
    protected CommonService commonService;
    
    /**
     * Service of Exp Shipping Item Sp Info MA<br />
     * Exp Shipping Item Sp Info MAのサービス
     */
    protected W9016ExpShippingItemSpInfoMaService w9016ExpShippingItemSpInfoMaService;

    /**
     * Default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W9016SearchFacadeServiceImpl() {
    }

    /**
     * Setter method for w9016ExpShippingItemSpInfoMaService.
     *
     * @param expShippingItemSpInfoMaService Set for w9016ExpShippingItemSpInfoMaService
     */
    public void setW9016ExpShippingItemSpInfoMaService(
        W9016ExpShippingItemSpInfoMaService expShippingItemSpInfoMaService) {
        w9016ExpShippingItemSpInfoMaService = expShippingItemSpInfoMaService;
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
    protected List<W9016ListDomain> callServices(
        W9016CriteriaDomain criteria) throws GscmApplicationException,
        ApplicationException {
        
        W9016ExpShippingItemSpInfoMaCriteriaDomain criteriaDomain 
            = createExpShippingItemSpInfoMaCriteria(criteria);
    
        List<? extends W9016ExpShippingItemSpInfoMaItemDomain> itemDomain = w9016ExpShippingItemSpInfoMaService.searchForPagingOnInquirySearch(criteriaDomain);
        
        return convertToListDomain(itemDomain, criteriaDomain);
    }

    /**
     * {@inheritDoc}
    * <pre>
     * No action.
     * </pre> 
     * <pre>
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W9016CriteriaDomain filterDomain(W9016CriteriaDomain argDomain)
        throws GscmApplicationException, ApplicationException {
        return argDomain;
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
    protected void validateConsistency(W9016CriteriaDomain criteria)
        throws GscmApplicationException, ValidationException,
        ApplicationException {
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
    protected void validateDatabase(W9016CriteriaDomain filterDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {
    }

    /**
     * {@inheritDoc}
     * <pre>
     * No action.
     * </pre> 
     * <pre>
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W9016CriteriaDomain filterDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {
        
        Validator<W9016CriteriaDomain> valid = new Validator<W9016CriteriaDomain>(filterDomain, "w9016CriteriaDomain");

        String[] properties = {
            "compCd",
            "itemNo",
            "pkgCd",
            "customerCd",
            "lgcyShipTo",
            "containerSortingKey",
            "invoiceKey",
        };

        boolean judge = true;
        for(String col : properties){
            judge = true;
            
            judge = judge && valid.isPermittedAttr(col, SCREEN_ID_W9016);
            judge = judge && valid.isPermittedFormat(col, SCREEN_ID_W9016);
            judge = judge && valid.isPermittedCharMinLen(col, SCREEN_ID_W9016);
        }
        

        if (0 < valid.getErrList().size()) {
            throw new ValidationException(valid.getErrList());
        }

    }

    /**
     * Based on (PL) Search criteria domain, create Search criteria domain (BL).
     * <br />検索条件ドメイン(PL)を基に、検索条件ドメイン(BL)を作成します。
     *
     * @param criteriaDomain Criteria domain of screen (PL)<br />
     * 画面の検索条件ドメイン(PL)
     * @return Criteria domain for User Id MA Edit  service(BL)<br />
     * User Id MA Editサービスの検索条件ドメイン(BL)
     */
    protected W9016ExpShippingItemSpInfoMaCriteriaDomain createExpShippingItemSpInfoMaCriteria(W9016CriteriaDomain criteriaDomain) {
        
        W9016ExpShippingItemSpInfoMaCriteriaDomain userIdMaCriteria = new W9016ExpShippingItemSpInfoMaCriteriaDomain();
        
        // setup for acquiring the maximum number 
        // 最大件数を取得するための設定
        userIdMaCriteria.setScreenId(criteriaDomain.getScreenId());
        userIdMaCriteria.setLocale(new Locale(criteriaDomain.getLanguageCd()));
        
        CommonUtil.copyPropertiesDomainToDomain(userIdMaCriteria, criteriaDomain);
        
        return userIdMaCriteria;
    }
    
    /**
     * Convert Exp Ship To Shipping MA service domain(BL) to List domain of screen(PL).<br />
     * <br />Exp Ship To Shipping MAサービスのドメイン(BL)を画面のリストドメイン(PL)に変換します。
     *
     * @param srcList List of Exp. Ship to Shipping MA service domain<br />
     * Exp Ship To Shipping MAサービスドメインのリスト(BL)
     * @param criteriaDomain Criteria domain of screen<br />
     * 画面の検索条件ドメイン(PL)
     * @return List domain for Exp. Ship to shipping MA Inquiry screen(PL)<br />
     * Exp Ship To Shipping MA Inquiry画面のリストドメイン(PL)
     */
    protected List<W9016ListDomain> convertToListDomain(List<? extends W9016ExpShippingItemSpInfoMaItemDomain> srcList, W9016ExpShippingItemSpInfoMaCriteriaDomain criteriaDomain) {
        
        List<W9016ListDomain> dstList = new ArrayList<W9016ListDomain>();
        
        if (srcList != null) {
            for (W9016ExpShippingItemSpInfoMaItemDomain src : srcList) {
                
                W9016ListDomain dst = new W9016ListDomain();
                
                CommonUtil.copyPropertiesDomainToDomain(dst, src, criteriaDomain.getScreenDateFormat());

                dstList.add(dst);
            }
        }
        
        return dstList;
    }
}
