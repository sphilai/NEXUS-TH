/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.ws;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_ERROR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_SUCCESS;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.WsR001ResultDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.WsR001CriteriaDomain;
import com.globaldenso.eca0027.core.business.service.WsR001MigCmlService;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractTransactFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;


/**
 * Resource implementation class for the Facade service to batch processing..
 * <br />バッチ処理に対するFacadeサービスの実装クラスです。
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7416 $
 */
public class WsR001FacadeServiceImpl extends AbstractTransactFacadeService<WsR001ResultDomain, WsR001CriteriaDomain> {
    
    /**
     * MigCmlService service
     * <br />MigCmlService サービス
     */
    private WsR001MigCmlService wsR001MigCmlService;
    
    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public WsR001FacadeServiceImpl() {
        super();
    }

    /**
     * Setter method for wsR001MigCmlService.
     *
     * @param wsR001MigCmlService Set for wsR001MigCmlService
     */
    public void setWsR001MigCmlService(WsR001MigCmlService wsR001MigCmlService) {
        this.wsR001MigCmlService = wsR001MigCmlService;
    }


    /**
     * Investigate the contents of Domain of an argument and specify Domain required for processing.
     * <br />引数のDomainの内容を調査し、処理に必要なDomainを特定する。
     * 
     * No Action
     * <br />処理なし
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     * 
     * 
     * @param criteriaDomain Parameter domain<br />パラメータドメイン
     * @throws GscmApplicationException Exception<br />例外
     * @throws ApplicationException Exception<br />例外
     * @return criteriaDomain domain<br />ドメイン
     */
    @Override
    protected WsR001CriteriaDomain filterDomain(WsR001CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {
        return criteriaDomain;
    }

    /**
     * Perform a unary eye check.
     * <br />単項目チェックを行う。
     * 
     * No Action
     * <br />処理なし
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     * 
     * @param criteriaDomain Parameter domain<br />パラメータドメイン
     * @throws GscmApplicationException Exception<br />例外
     * @throws ValidationException Exception<br />例外
     * @throws ApplicationException Exception<br />例外
     */
    @Override
    protected void validateItems(WsR001CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {
        // No Action
        // 処理なし
    }

    /**
     * Perform a consistency check.
     * <br />整合性チェックを行う。
     *
     * No Action
     * <br />処理なし
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     *
     * @param criteriaDomain Parameter domain<br />パラメータドメイン
     * @throws GscmApplicationException Exception<br />例外
     * @throws ValidationException Exception<br />例外
     * @throws ApplicationException Exception<br />例外
     */
    @Override
    protected void validateConsistency(WsR001CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {
        // No Action
        // 処理なし
    }

    /**
     * Perform a database check.
     * <br />データベースチェックを行う。
     * 
     * No Action
     * <br />処理なし
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     *
     * @param criteriaDomain Parameter domain<br />パラメータドメイン
     * @throws GscmApplicationException Exception<br />例外
     * @throws ValidationException Exception<br />例外
     * @throws ApplicationException Exception<br />例外
     */
    @Override
    protected void validateDatabase(WsR001CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {
        // No Action
        // 処理なし
    }
    
    /**
     * Perform the invoke of the disposal of business affairs Service.
     * <br />業務処理Serviceの呼び出しを行う。
     * 
     * 
     * <pre>
     * 
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     * 
     * @param criteriaDomain Parameter domain<br />パラメータドメイン
     * @throws GscmApplicationException Exception<br />例外
     * @throws ApplicationException Exception<br />例外
     * @throws ValidationException Exception<br />例外
     * @return criteriaDomain domain<br />ドメイン
     */
    @Override
    protected WsR001ResultDomain callServices(WsR001CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException, ValidationException {
        
        List<String> errorMessageList = wsR001MigCmlService.createMigCml(criteriaDomain);
        
        if (errorMessageList != null && !errorMessageList.isEmpty()) {
            return new WsR001ResultDomain(WS_RESULT_ERROR, errorMessageList);
        }
        
        return new WsR001ResultDomain(WS_RESULT_SUCCESS);
    }

}
