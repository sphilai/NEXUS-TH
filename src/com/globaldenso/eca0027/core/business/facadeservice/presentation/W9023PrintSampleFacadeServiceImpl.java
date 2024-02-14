/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import java.io.File;
import java.util.Locale;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W9023UpdateDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W9022InvTplMaCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W9022InvTplMaService;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractProcessFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
/**
 * The implementation class of the Facade service for print action of
 *  Invoice Template MA edit screen.
 * <br />
 * Invoice Template MA Edit画面のprintアクションに対するFacadeサービスの実装クラスです。
 * 
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W9023PrintSampleFacadeServiceImpl extends AbstractProcessFacadeService<File, W9023UpdateDomain> {

    /**
     * Service of invoice Template MA<br />
     * Invoice Template MAのサービス
     */
    protected W9022InvTplMaService w9022InvTplMaService;

    /**
     * Default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W9023PrintSampleFacadeServiceImpl() {
    }

    /**
     * Getter method for w9022InvTplMaService.
     *
     * @return the w9022InvTplMaService
     */
    public W9022InvTplMaService getW9022InvTplMaService() {
        return w9022InvTplMaService;
    }

    /**
     * Setter method for w9022InvTplMaService.
     *
     * @param invTplMaService Set for w9022InvTplMaService
     */
    public void setW9022InvTplMaService(W9022InvTplMaService invTplMaService) {
        w9022InvTplMaService = invTplMaService;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * Create the form
     * </pre>
     * <pre>
     * - 帳票作成
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected File callServices(W9023UpdateDomain criteria)
        throws GscmApplicationException, ApplicationException {
        
        W9022InvTplMaCriteriaDomain criteriaDomain = createInvTplMaCriteria(criteria);
        
        return w9022InvTplMaService.printSample(criteriaDomain);
    }

    /**
     * {@inheritDoc}
     * <pre>
     * no action.
     * </pre>
     * <pre>
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W9023UpdateDomain filterDomain(W9023UpdateDomain argDomain)
        throws GscmApplicationException, ApplicationException {
        return argDomain;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * no action.
     * </pre>
     * <pre>
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W9023UpdateDomain criteria)
        throws GscmApplicationException, ValidationException,
        ApplicationException {
    }

    /**
     * {@inheritDoc}
     * <pre>
     * no action.
     * </pre>
     * <pre>
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W9023UpdateDomain criteria)
        throws GscmApplicationException, ValidationException,
        ApplicationException {
    }

    /**
     * {@inheritDoc}
     * <pre>
     * Item check.
     * </pre>
     * <pre>
     * 単項目チェック
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W9023UpdateDomain filterDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {
    }

    /**
     *  Based on (PL) Search criteria domain, create Search criteria domain (BL).
     * <br />
     * 検索条件ドメイン(PL)を基に、検索条件ドメイン(BL)を作成します。
     * 
     * @param criteriaDomain Criteria domain of screen(PL)<br />
     * 画面の検索条件ドメイン(PL)
     * @return  Criteria domain of service<br />
     * サービスの検索条件ドメイン(BL)
     */
    protected W9022InvTplMaCriteriaDomain createInvTplMaCriteria(
        W9023UpdateDomain criteriaDomain) {

        W9022InvTplMaCriteriaDomain invTplMaCriteria = new W9022InvTplMaCriteriaDomain();

        // setup for acquiring the maximum number 
        // 最大件数を取得するための設定
        invTplMaCriteria.setScreenId(criteriaDomain.getScreenId());
        invTplMaCriteria.setLocale(new Locale(criteriaDomain.getLanguageCd()));

        CommonUtil.copyPropertiesDomainToDomain(invTplMaCriteria,
            criteriaDomain.getCriteriaDomain());
        invTplMaCriteria.setCompCd(criteriaDomain.getCriteriaDomain().getCompany());

        return invTplMaCriteria;
    }

}
