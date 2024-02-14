/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0011;

import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W1003ListDomain;
import com.globaldenso.eca0027.core.business.domain.W1003UpdateDomain;
import com.globaldenso.eca0027.core.business.service.W1001ExpRequestService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractTransactFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CheckUtil;

/**
 * The register service facade implementation class of Export Request Description Delete
 * <br />Export Request Description DeleteのDeleteFacadeサービス実装クラスです。
 * <pre>
 * bean id:W1003DeleteFacadeService
 * </pre>
 *
 * @author $Author: 810833843 $
 * @version $Revision: 10494 $
 */
public class W1003DeleteFacadeServiceImpl 
    extends AbstractTransactFacadeService<W1003UpdateDomain, W1003UpdateDomain> {

    /**
     * W1001ExpRequestService
     * <br />梱包指示サービス
     */
    protected W1001ExpRequestService w1001ExpRequestService;
    
    /**
     * Common service.
     */
    protected CommonService commonService;

    /**
     * constructor.
     */
    public W1003DeleteFacadeServiceImpl() {
    }

    /**
     * Setter method for w1001ExpRequestService.
     *
     * @param expRequestService Set for w1001ExpRequestService
     */
    public void setW1001ExpRequestService(W1001ExpRequestService expRequestService) {
        w1001ExpRequestService = expRequestService;
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
     * {@inheritDoc}.
     * 
     * <pre>
     * No Action <br />処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W1003UpdateDomain filterDomain(W1003UpdateDomain updateDomain)
        throws GscmApplicationException, ApplicationException {
        // An error is used when one affair does not have effective line, either.
        // In the case only of the null line when all the line cuts are carried out
        // 有効行が1件もない場合エラーにする。
        // 全行削除されている場合または、空行のみの場合。
        boolean hasValidLine  = false;
        if (updateDomain.getListDomainList() == null || updateDomain.getListDomainList().isEmpty()) {
            hasValidLine = false;
        } else {
            for (W1003ListDomain domain : updateDomain.getListDomainList()) {
                if (!CheckUtil.isBlankOrNull(domain.getSelected())) {
                    hasValidLine = true;
                    break;
                }
            }
        }
        // When there is no effective line
        // 有効行がない場合
        if (!hasValidLine) {
            String[] params = {commonService.getResource(updateDomain.getLocale(), "label.ck") };
            List <MessageDomain> errors = new ArrayList<MessageDomain>();
            errors.add(new MessageDomain(null, GSCM_E0_0011, params));
            throw new ValidationException(errors);
        }
        
        return updateDomain;
    }
    
    /**
     * {@inheritDoc}.
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W1003UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W1003UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
  
    }

    /**
     * {@inheritDoc}.
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W1003UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
    }

    /**
     * {@inheritDoc}.
     * 
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W1003UpdateDomain callServices(W1003UpdateDomain updateDomain) 
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        return w1001ExpRequestService.transactOnDetailDelete(updateDomain);
    }

}
