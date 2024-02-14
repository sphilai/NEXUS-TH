/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.service.TmCdService;
import com.globaldenso.eca0027.core.business.domain.W1007UpdateDomain;
import com.globaldenso.eca0027.core.business.service.W1006ExpRequestService;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractProcessFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;

/**
 *  An implementation class of facade service for edit or refer action of Export Ship to Shipping MA Inquiry screen.
 * <br />Export Ship to Shipping MA Inquiry画面のEditOrReferアクションに対するFacadeサービスの実装クラスです。
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W1007MoveToRegisterFacadeServiceImpl extends AbstractProcessFacadeService<W1007UpdateDomain, W1007UpdateDomain> {

    /**
     * TmCd Service.
     */
    protected TmCdService tmCdService;
    
    /**
     * W1006ExpRequest service
     * <br />共通サービス
     */
    protected W1006ExpRequestService w1006ExpRequestService;
    
    /**
     * Default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W1007MoveToRegisterFacadeServiceImpl() {
    }

    /**
     * <p>Getter method for tmCdService.</p>
     *
     * @return the tmCdService
     */
    public TmCdService getTmCdService() {
        return tmCdService;
    }

    /**
     * <p>Setter method for tmCdService.</p>
     *
     * @param tmCdService Set for tmCdService
     */
    public void setTmCdService(TmCdService tmCdService) {
        this.tmCdService = tmCdService;
    }
    
    /**
     * <p>Setter method for w1006ExpRequestService.</p>
     *
     * @param expRequestService Set for w1006ExpRequestService
     */
    public void setW1006ExpRequestService(W1006ExpRequestService expRequestService) {
        w1006ExpRequestService = expRequestService;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * Check selection of detail line.
     * </pre>
     * <pre>
     * 明細行選択チェック
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W1007UpdateDomain filterDomain(W1007UpdateDomain updateDomain)
        throws GscmApplicationException, ApplicationException {
        
        return updateDomain;
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
    protected void validateItems(W1007UpdateDomain updateDomain)
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
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W1007UpdateDomain updateDomain)
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
    protected void validateDatabase(W1007UpdateDomain updateDomain)
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
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W1007UpdateDomain callServices(W1007UpdateDomain updateDomain)
        throws GscmApplicationException, ApplicationException {
        return updateDomain;
    }
    
}
