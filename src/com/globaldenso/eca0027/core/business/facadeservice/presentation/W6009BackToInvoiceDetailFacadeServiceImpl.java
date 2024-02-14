/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import java.util.Arrays;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W6009CriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W6001DocService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractProcessFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;

/**
 * An implementation class of service for the Facade Back To Invoice Detail of action Documentation Invoice Register screen.
 * <br />通関書類作成業務 Invoice Register画面のBack To Invoice Detailアクションに対するFacadeサービスの実装クラスです。
 * <pre>
 * bean id: w6009BackToInvoiceDetailFacadeService
 * </pre>
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W6009BackToInvoiceDetailFacadeServiceImpl extends AbstractProcessFacadeService<Void, W6009CriteriaDomain>{

    /**
     * Documentation Service.<br />
     * Documentationサービス
     */
    protected W6001DocService w6001DocService;
    
    /**Default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W6009BackToInvoiceDetailFacadeServiceImpl(){
        super();
    }

    /**
     * Setter method for w6001DocService.
     *
     * @param docService Set for w6001DocService
     */
    public void setW6001DocService(W6001DocService docService) {
        w6001DocService = docService;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * No action
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W6009CriteriaDomain filterDomain(W6009CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {
        return criteriaDomain;
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * No action
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W6009CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
    }

    /**
     * {@inheritDoc}
     * <pre>
     * No action
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W6009CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
    }

    /**
     * {@inheritDoc}
     * Input check.
     * <br />入力チェック
     * <pre>
     * DB integrity check .
     * - Night batch check 
     *     With the name of the shipper and Cml Typ code of search criteria domain, 
     *     Call the {@link W6001DocService#validateDatabaseCigmaAvailable(String, String)}.
     * </pre>
     * <pre>
     * DB整合性チェック
     * ‐夜間バッチチェック
     *     検索条件ドメインの荷主コードとCml Typを引数にして、
     *     {@link W6001DocService#validateDatabaseCigmaAvailable(String, String)}を呼出します。
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W6009CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {

        String errCd = w6001DocService.validateDatabaseCigmaAvailable(criteriaDomain.getShipperCd(), criteriaDomain.getCmlTyp());
        if (errCd != null){
            throw new ValidationException(Arrays.asList(new MessageDomain("", errCd, null)));
        }
    }

    /**
     * {@inheritDoc}
     * <pre>
     * No action
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected Void callServices(W6009CriteriaDomain criteriaDomain) 
        throws GscmApplicationException, ApplicationException {
        return null;
    }
}

