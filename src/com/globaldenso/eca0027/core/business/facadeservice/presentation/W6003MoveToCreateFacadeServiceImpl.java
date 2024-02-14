/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0029;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W6003;

import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W6003CriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W6001DocService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.Validator;

/**
 * An implementation class of service for the Facade MoveToCreate action of Documentation Invoice Header screen.
 * <br />通関書類作成業務 Invoice Header画面のMoveToCreateアクションに対するFacadeサービスの実装クラスです。
 * <pre>
 * bean id: w6003MoveToCreateFacadeService
 * </pre>
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W6003MoveToCreateFacadeServiceImpl  extends 
    AbstractSearchFacadeService<Void, W6003CriteriaDomain> {
    /**
     * Documentation Service.
     * <br />Documentationサービス
     */
    protected W6001DocService w6001DocService;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W6003MoveToCreateFacadeServiceImpl(){
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
     * To investigate the contents of the Domain of the argument, to identify the Domain necessary for the process.
     * <br />引数のDomainの内容を調査し、処理に必要なDomainを特定する。
     * 
     * <pre>
     * No action
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W6003CriteriaDomain filterDomain(W6003CriteriaDomain w6003CriteriaDomain)
        throws GscmApplicationException, ApplicationException {

        return w6003CriteriaDomain;
    }
    
    /**
     * {@inheritDoc}
     * Checking the single item.
     * <br />単項目チェックを行う。
     * 
     * <pre>
     * Single item check implementation
     * 単項目チェック実施
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W6003CriteriaDomain w6003CriteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        Validator<W6003CriteriaDomain> valid = new Validator<W6003CriteriaDomain>(w6003CriteriaDomain, "w6003CriteriaDomain");

        String[] properties = {
            "stgCom",
            "stgWh",
            "trnsCd",
            "containerLooseTyp",
            "customTimingTyp"
        };
        valid.isValidateProperties(properties, SCREEN_ID_W6003);

        if (0 < valid.getErrList().size()) {
            throw new ValidationException(valid.getErrList());
        }
    }
    
    /**
     * {@inheritDoc}
     * Checking the consistency.
     * <br />整合性チェックを行う。
     * 
     * <pre>
     * No action
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W6003CriteriaDomain w6003CriteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {

    }
    
    /**
     * {@inheritDoc}
     * Check the database.
     * <br />データベースチェックを行う。
     * 
     * <br />
     * <pre>
     * - Create the search condition domain.
     *     Create the {@link W6003CriteriaDomain}.
     * - Checking the W / H Company and NEXUS W / H combination.
     * </pre>
     * <pre>
     * - 検索条件ドメインを作成する
     *     {@link W6003CriteriaDomain}を作成する
     * - W/H Company、NEXUS W/H 組み合わせチェックする
     * </pre>
     * 
     * 
     * @throws GscmApplicationException GSCM application exception.<br />
     * GSCMアプリケーション例外
     * @throws ValidationException
     * @throws ApplicationException
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W6003CriteriaDomain w6003CriteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {

        List<MessageDomain> errorList = new ArrayList<MessageDomain>();

        // W/H Company、NEXUS W/H check combination
        // W/H Company、NEXUS W/H 組み合わせチェック
        if( !w6001DocService.validateDatabaseCompWh(w6003CriteriaDomain.getStgCom(), w6003CriteriaDomain.getStgWh()) ) {
            Object[] params = {"Stg. Com.", "Stg. W/H "};
            MessageDomain md1 = new MessageDomain("w6003CriteriaDomain.stgCom", GSCM_E0_0029, params);
            MessageDomain md2 = new MessageDomain("w6003CriteriaDomain.stgWh", null, null);
            errorList.add(md1);
            errorList.add(md2);
        }

        if (0 < errorList.size()) {
            throw new ValidationException(errorList);
        }
    }

    /**
     * {@inheritDoc}
     * Call to the business processing Service.
     * <br />業務処理Serviceの呼び出しを行う。
     * 
     * No action<br />
     * 処理なし
     * 
     * @throws GscmApplicationException GSCM application exception<br />
     * GSCMアプリケーション例外
     * @throws ApplicationException If an exception occurs during a call to the business processing Service.<br />
     * 業務処理Serviceの呼び出し時に例外が発生した場合
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected Void callServices(W6003CriteriaDomain w6003CriteriaDomain) 
        throws GscmApplicationException, ApplicationException {

        return null;
    }
}
