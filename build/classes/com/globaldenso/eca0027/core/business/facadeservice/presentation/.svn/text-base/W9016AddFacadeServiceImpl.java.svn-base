/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0009;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W9016;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W9016CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W9016ListDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W9016ExpShippingItemSpInfoMaCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W9016ExpShippingItemSpInfoMaService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractTransactFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.Validator;

/**
 * An implementation class of facade service for add action of Export Shipping Parts Special
 *  Information MA inquiry screen.
 * <br />Export Shipping Parts Special Information MA Inquiry画面のAddアクションに対するFacadeサービスの実装クラスです。
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W9016AddFacadeServiceImpl extends
    AbstractTransactFacadeService<List<W9016ListDomain>, W9016CriteriaDomain> {
    
    /**
     * Service of Exp Shipping Item Sp Info MA<br />
     * Exp Shipping Item Sp Info MAのサービス
     */
    protected W9016ExpShippingItemSpInfoMaService w9016ExpShippingItemSpInfoMaService;
    
    /**
     * Default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W9016AddFacadeServiceImpl() {
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
     * {@inheritDoc}
     * <pre>
     * No action.
     * </pre> 
     * <pre>
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected List<W9016ListDomain> callServices(
        W9016CriteriaDomain filterDomain) throws GscmApplicationException,
        ApplicationException {
        return null;
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
     * Authority check
     * </pre>
     * <pre>
     * 権限チェック 
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W9016CriteriaDomain criteria)
        throws GscmApplicationException, ValidationException,
        ApplicationException {
        
        List<MessageDomain> errorList = new ArrayList<MessageDomain>();
        
        // Authority check 
        // 権限チェック
        if(!w9016ExpShippingItemSpInfoMaService.validateConsistencyCompAuth(criteria.getCompCd())){
            
            MessageDomain msgCompany = new MessageDomain("w9016CriteriaDomain.compCd", GSCM_I0_0009, null);
            
            errorList.add(msgCompany);
        }
        
        if (errorList.size() > 0) {
            throw new ValidationException(errorList);
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
     * - Common error check
     * For details, see screen definition document ECA0027_W9016_Export Shipping Item Special Information MA Inquiry.xls.
     * </pre>
     * <pre>
     * - 共通エラーチェック
     *     詳細は画面定義書_ECA0027_W9016_Export Shipping Item Special Information MA Inquiry.xls「画面項目定義」を参照
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W9016CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {
        
        Validator<W9016CriteriaDomain> valid 
            = new Validator<W9016CriteriaDomain>(criteriaDomain, "w9016CriteriaDomain");

        String[] properties = {
            "compCd",
            "itemNo",
            "pkgCd",
            "customerCd",
            "lgcyShipTo"
        };
        valid.isValidateProperties(properties, SCREEN_ID_W9016);

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
}
