/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CHECK_ON;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_3007;

import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W1008ListDomain;
import com.globaldenso.eca0027.core.business.domain.W1008UpdateDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W1007PltzWkCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W1007PltzWkService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractTransactFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CheckUtil;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 *    This is a delete action class of action Export Packaging Register screen.
 * <br />梱包指示Main画面の検索アクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":W1008.jsp
 *     - "error":W1008.jsp
 * </pre>
 * 
 * @author $Author: DCS $
 * @version $Revision: 6750 $
 */
public class W1008DeleteFacadeServiceImpl 
    extends AbstractTransactFacadeService<W1008UpdateDomain, W1008UpdateDomain> {

    /**
     * W1007PltzWk service
     * <br />梱包指示サービス
     */
    protected W1007PltzWkService w1007PltzWkService;
    

    /**
     * Constructor.
     */
    public W1008DeleteFacadeServiceImpl() {
    }

    
    /**
     * <p>Setter method for w1007PltzWkService.</p>
     *
     * @param pltzWkService Set for w1007PltzWkService
     */
    public void setW1007PltzWkService(W1007PltzWkService pltzWkService) {
        w1007PltzWkService = pltzWkService;
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
    protected W1008UpdateDomain filterDomain(W1008UpdateDomain updateDomain)
        throws GscmApplicationException, ApplicationException {
        return updateDomain;
    }
    
    /**
     * {@inheritDoc}.
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W1008UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        List<MessageDomain> errList = new ArrayList<MessageDomain>();
        boolean checkSelected = false;
        for (W1008ListDomain domain : updateDomain.getListDomainList()) {
            // CheckBox
            if (CHECK_ON.equals(domain.getSelected())) {
                checkSelected = true;
            }
        }
        if(!checkSelected)
        {
            MessageDomain msgUpdateStatus = new MessageDomain("", NXS_E7_3007, null);
            errList.add(msgUpdateStatus);
            throw new ValidationException(errList);
        }
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W1008UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
  
    }

    /**
     * {@inheritDoc}.
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W1008UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
    }

    /**
     * {@inheritDoc}.
     * 
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W1008UpdateDomain callServices(W1008UpdateDomain updateDomain) 
        throws GscmApplicationException, ValidationException, ApplicationException {
        List<? extends W1008ListDomain> listDomain = updateDomain.getListDomainList();
        List<W1008ListDomain> removerList = new ArrayList<W1008ListDomain>();
        int i = 0;
        for (W1008ListDomain W1008Domain : listDomain) {
            W1007PltzWkCriteriaDomain domain = new W1007PltzWkCriteriaDomain();
            if (!CheckUtil.isBlankOrNull(W1008Domain.getSelected())) {
                // Copy properties
                CommonUtil.copyPropertiesDomainToDomain(domain, W1008Domain);
                i += w1007PltzWkService.delete(domain);
                removerList.add(W1008Domain);
            }
        }
        
        for (W1008ListDomain remove : removerList ) {
            listDomain.remove(remove);
        }
        return updateDomain;
    }

}
