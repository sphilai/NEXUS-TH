/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0009;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W9018;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W9018CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W9018ListDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W9018ExpFmlByItemMaCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W9018ExpFmlByItemMaService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractProcessFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.Validator;

/**
 *  The implementation class of Facade service to add action of Export Formalities by Item
 *  MA Inquiry screen.
 * <br />Export Formalities by Item MA Inquiry画面のAddアクションに対するFacadeサービスの実装クラスです。
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W9018AddFacadeServiceImpl extends
    AbstractProcessFacadeService<List<? extends W9018ListDomain>, W9018CriteriaDomain> {

    /**
     * Service of Export Formalities by Item MA<br />
     * Export Formalities by Item MAのサービス
     */
    protected W9018ExpFmlByItemMaService w9018ExpFmlByItemMaService;
    
    /**
     * Default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W9018AddFacadeServiceImpl() {
    }

    /**
     * Setter method for w9018ExpFmlByItemMaService.
     *
     * @param expFmlByItemMaService Set for w9018ExpFmlByItemMaService
     */
    public void setW9018ExpFmlByItemMaService(
        W9018ExpFmlByItemMaService expFmlByItemMaService) {
        w9018ExpFmlByItemMaService = expFmlByItemMaService;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * no action 
     * </pre>
     * <pre>
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected List<W9018ListDomain> callServices(
        W9018CriteriaDomain filterDomain) throws GscmApplicationException,
        ApplicationException {
        // 処理なし
        return null;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * no action 
     * </pre>
     * <pre>
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W9018CriteriaDomain filterDomain(W9018CriteriaDomain argDomain)
        throws GscmApplicationException, ApplicationException {
        // 処理なし
        return argDomain;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * no action 
     * </pre>
     * <pre>
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W9018CriteriaDomain criteria)
        throws GscmApplicationException, ValidationException,
        ApplicationException {
        
        W9018ExpFmlByItemMaCriteriaDomain criteriaDomain 
            = createExpShippingItemSpInfoMaCriteria(criteria);
        
        // Authority check 
        // 権限チェック
        if(!w9018ExpFmlByItemMaService.validateConsistencyCompAuth(criteriaDomain.getCompCd())){
            throw new ValidationException(Arrays.asList(new MessageDomain("w9018CriteriaDomain.compCd", GSCM_I0_0009, null)));
        }
    }

    /**
     * {@inheritDoc}
     * <pre>
     * no action 
     * </pre>
     * <pre>
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W9018CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {
        Validator<W9018CriteriaDomain> valid = new Validator<W9018CriteriaDomain>(criteriaDomain, "w9018CriteriaDomain");

        String[] properties = {
            "compCd",
            "itemNo",
            "cigmaPrdctFlg"
        };

        valid.isValidateProperties(properties, SCREEN_ID_W9018);

        if (0 < valid.getErrList().size()) {
            throw new ValidationException(valid.getErrList());
        }
    }

    /**
     * {@inheritDoc}
     * <pre>
     * no action 
     * </pre>
     * <pre>
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W9018CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {
        
        Validator<W9018CriteriaDomain> valid = new Validator<W9018CriteriaDomain>(criteriaDomain, "w9018CriteriaDomain");

        String[] properties = {
            "compCd",
            "itemNo",
            "cigmaPrdctFlg"
        };

        valid.isValidateProperties(properties, SCREEN_ID_W9018);

        if (0 < valid.getErrList().size()) {
            throw new ValidationException(valid.getErrList());
        }
    }
    
    /**
     *  Based on (PL) Search criteria domain, create Search criteria domain (BL).
     * <br />検索条件ドメイン(PL)を基に、検索条件ドメイン(BL)を作成します。
     *
     * @param criteriaDomain Criteria domain of screen (PL)<br />
     * 画面の検索条件ドメイン(PL)
     * @return Criteria domain for User Id MA Edit  service(BL)<br />
     * User Id MA Editサービスの検索条件ドメイン(BL)
     */
    protected W9018ExpFmlByItemMaCriteriaDomain createExpShippingItemSpInfoMaCriteria(W9018CriteriaDomain criteriaDomain) {
        
        W9018ExpFmlByItemMaCriteriaDomain userIdMaCriteria = new W9018ExpFmlByItemMaCriteriaDomain();
        
        // setup for acquiring the maximum number 
        // 最大件数を取得するための設定
        userIdMaCriteria.setScreenId(criteriaDomain.getScreenId());

        userIdMaCriteria.setLocale(new Locale(criteriaDomain.getLanguageCd()));
        
        CommonUtil.copyPropertiesDomainToDomain(userIdMaCriteria, criteriaDomain);
        
        return userIdMaCriteria;
    }
}
