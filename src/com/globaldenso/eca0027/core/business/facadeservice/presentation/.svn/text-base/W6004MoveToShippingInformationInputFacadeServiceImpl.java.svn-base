/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0007;

import java.util.Arrays;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W6004CriteriaDomain;
//import com.globaldenso.eca0027.core.business.domain.InvoiceCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W6001DocService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractProcessFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;

/**
 * An implementation class of service for the Facade MoveToShippingInformationInput action of Documentation Invoice Data Create screen.
 * <br />通関書類作成業務 Invoice Data Create画面のMoveToShippingInformationInputアクションに対するFacadeサービスの実装クラスです。
 * <pre>
 * bean id: w6004MoveToShippingInformationInputFacadeService
 * </pre>
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W6004MoveToShippingInformationInputFacadeServiceImpl extends 
    AbstractProcessFacadeService<Void, W6004CriteriaDomain> {
    /**
     * Documentation Service.
     * <br />Documentationサービス
     */
    protected W6001DocService w6001DocService;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W6004MoveToShippingInformationInputFacadeServiceImpl(){
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
     * To investigate the contents of the Domain of the argument, to identify the Domain necessary for the process.
     * <br />引数のDomainの内容を調査し、処理に必要なDomainを特定する。
     * {@inheritDoc}
     * <pre>
     * No action
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W6004CriteriaDomain filterDomain(W6004CriteriaDomain criteria)
        throws GscmApplicationException, ApplicationException {

        return criteria;
    }
    
    /**
     * Check the single item.
     * <br />単項目チェックを行う。
     * {@inheritDoc}
     * <pre>
     * No action
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W6004CriteriaDomain criteria)
        throws GscmApplicationException, ValidationException, ApplicationException {

    }
    
    /**
     * Check the consistency.
     * <dr />整合性チェックを行う。
     * {@inheritDoc}
     * <pre>
     * No action
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W6004CriteriaDomain criteria)
        throws GscmApplicationException, ValidationException, ApplicationException {

    }
    
    /**
     * Check the database.
     * <br />データベースチェックを行う。
     * {@inheritDoc}
     * <br />
     * <pre>
     * - Create the search condition domain. 
     *      Create the {@link W6004CriteriaDomain}.
     * - Check the transition conditions.
     * </pre>
     * <pre>
     * - 検索条件ドメインを作成する
     *     {@link W6004CriteriaDomain}を作成する
     * - 遷移条件のチェックを行う
     * </pre>
     * 
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W6004CriteriaDomain criteria)
        throws GscmApplicationException, ValidationException, ApplicationException {
        

        //public boolean validateDatabaseTwInvPltzOnCreateUpdateByExistence(String dscId)
        if(!w6001DocService.validateDatabaseTwInvPltzOnCreateUpdateByExistence(criteria.getLoginUserDscId())) {
            List<MessageDomain> errList = Arrays.asList(new MessageDomain("", NXS_E1_0007, null));
            throw new ValidationException(errList);
        }
    }

    /**
     * Call to the business processing Service.
     * <br />業務処理Serviceの呼び出しを行う。
     * {@inheritDoc}
     * <pre>
     * No action
     * 処理なし
     * </pre>
     * 
     * @throws GscmApplicationException GSCM application exception<br />
     * GSCMアプリケーション例外
     * @throws ApplicationException If an exception occurs during a call to the business processing Service<br />
     * 業務処理Serviceの呼び出し時に例外が発生した場合
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected Void callServices(W6004CriteriaDomain criteria) 
        throws GscmApplicationException, ApplicationException {

        return null;
    }
}
