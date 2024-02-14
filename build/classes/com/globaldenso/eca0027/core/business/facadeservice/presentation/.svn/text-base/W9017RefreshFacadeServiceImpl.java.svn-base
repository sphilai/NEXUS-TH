/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W9017;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W9016ExpShippingItemSpInfoMaDomain;
import com.globaldenso.eca0027.core.business.domain.W9017CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W9016ExpShippingItemSpInfoMaCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W9016ExpShippingItemSpInfoMaService;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.Validator;

/**
 * An implementation class of Facade service to Refresh action of Export Shipping Parts Special
 *  Information MA Edit screen.
 * <br />Export Shipping Parts Special Information MA Edit画面のRefreshアクションに対するFacadeサービスの実装クラスです。
 *
 * UT305 ADD NEW
 *
 * @author $Author: masaki_awata@dnitsol.com $
 * @version $Revision: 12245 $
 */
public class W9017RefreshFacadeServiceImpl extends AbstractSearchFacadeService<W9017CriteriaDomain, W9017CriteriaDomain> {

    /**
     * Service of Exp Shipping Item Sp Info MA<br />
     * Exp Shipping Item Sp Info MAのサービス
     */
    protected W9016ExpShippingItemSpInfoMaService w9016ExpShippingItemSpInfoMaService;

    /**
     * Default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W9017RefreshFacadeServiceImpl() {
    }

    /**
     * Setter method for w9016ExpShippingItemSpInfoMaService.
     *
     * @param expShippingItemSpInfoMaService Set for w9016ExpShippingItemSpInfoMaService
     */
    public void setW9016ExpShippingItemSpInfoMaService(W9016ExpShippingItemSpInfoMaService expShippingItemSpInfoMaService) {
        w9016ExpShippingItemSpInfoMaService = expShippingItemSpInfoMaService;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * - No processing
     * - 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W9017CriteriaDomain filterDomain(W9017CriteriaDomain w9017CriteriaDomain)
        throws GscmApplicationException, ApplicationException {
        return w9017CriteriaDomain;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * - Common error checking
     * - 共通エラーチェック
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W9017CriteriaDomain w9017CriteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {

        Validator<W9017CriteriaDomain> valid 
            = new Validator<W9017CriteriaDomain>(w9017CriteriaDomain, "w9017CriteriaDomain");

        String[] properties = {
            "aplyStrtDt"
        };
        valid.isValidateProperties(properties, SCREEN_ID_W9017);
        if (0 < valid.getErrList().size()) {
            throw new ValidationException(valid.getErrList());
        }
    }

    /**
     * {@inheritDoc}
     * <pre>
     * - No processing
     * - 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W9017CriteriaDomain w9017CriteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
    }

    /**
     * {@inheritDoc}
     * <pre>
     * - No processing
     * - 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W9017CriteriaDomain w9017CriteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
    }

    /**
     * {@inheritDoc}
     * <pre>
     * - Call item description search service.
     * - 品目名称検索サービスを呼び出す。
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W9017CriteriaDomain callServices(W9017CriteriaDomain w9017CriteriaDomain)
        throws GscmApplicationException, ApplicationException {

        // PL domain -> BL domain transfer
        // PLドメイン→BLドメイン移送
        W9016ExpShippingItemSpInfoMaCriteriaDomain expShippingItemSpInfoMaCriteriaDomain
            = new W9016ExpShippingItemSpInfoMaCriteriaDomain();
        CommonUtil.copyPropertiesDomainToDomain(expShippingItemSpInfoMaCriteriaDomain,
            w9017CriteriaDomain, w9017CriteriaDomain.getScreenDateFormat());
        expShippingItemSpInfoMaCriteriaDomain.setMode(w9017CriteriaDomain.getProcMode());
        // Call search service
        // 検索サービス呼び出し
        W9016ExpShippingItemSpInfoMaDomain expShippingItemSpInfoMaResultDomain
            = w9016ExpShippingItemSpInfoMaService.searchRefreshOnEdit(expShippingItemSpInfoMaCriteriaDomain);
        if (expShippingItemSpInfoMaResultDomain == null) {
            return null;
        }
        // BL domain -> PL domain transfer
        // BLドメイン→PLドメイン移送
        W9017CriteriaDomain w9017CriteriaResultDomain = new W9017CriteriaDomain();
        CommonUtil.copyPropertiesDomainToDomain(w9017CriteriaResultDomain,
            expShippingItemSpInfoMaResultDomain, w9017CriteriaDomain.getScreenDateFormat());

        return w9017CriteriaResultDomain;
    }
}
