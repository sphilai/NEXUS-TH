/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CHECK_ON;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_3007;

import java.util.Arrays;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCarryOutListItemNoCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W3004ListDomain;
import com.globaldenso.eca0027.core.business.domain.W3004UpdateDomain;
import com.globaldenso.eca0027.core.business.service.W3TransferService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractTransactFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 * <p>W3004UpdateFacadeService</p>
 * 
 * @author TIS Tanaka
 * @version 1.00
 */
public class W3004UpdateFacadeServiceImpl extends
    AbstractTransactFacadeService<Integer, W3004UpdateDomain> {

    /**
     * <p>
     * W3TransferService
     * </p>
     */
    protected W3TransferService w3TransferService;

    /**
     * constructor.
     */
    public W3004UpdateFacadeServiceImpl() {
    }

    /**
     * <p>Setter method for w3TransferService.</p>
     *
     * @param transferService Set for w3TransferService
     */
    public void setW3TransferService(W3TransferService transferService) {
        w3TransferService = transferService;
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - No processing
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W3004UpdateDomain filterDomain(W3004UpdateDomain w3004UpdateDomain)
        throws GscmApplicationException, ApplicationException {
        //Chaiporn add check selected 2015-01-13 UT173,UT169
        if (w3004UpdateDomain.getCheckedAmount()==0){
            List<MessageDomain> errList = Arrays.asList(new MessageDomain("", NXS_E7_3007, null));
            throw new ValidationException(errList);
        }

        return w3004UpdateDomain;
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - No processing
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W3004UpdateDomain w3004UpdateDomain)
        throws GscmApplicationException, ApplicationException,
        ValidationException {
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - No processing
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W3004UpdateDomain w3004UpdateDomain)
        throws GscmApplicationException, ApplicationException,
        ValidationException {

    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - No processing
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W3004UpdateDomain w3004UpdateDomain)
        throws GscmApplicationException, ApplicationException,
        ValidationException {

    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - If checked records have already stored, do nothing.
     * - If checked records have not stored, insert checked records' key into work table.
     * - If unchecked records exist in work table, then delete them.
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected Integer callServices(W3004UpdateDomain w3004UpdateDomain)
        throws GscmApplicationException, ApplicationException {

        int count = 0;
        List<? extends W3004ListDomain> domainList = w3004UpdateDomain.getW3004ListDomainList();
        if(domainList != null){
            TwCarryOutListItemNoCriteriaDomain twCarryOutListItemNoCriteriaDomain = new TwCarryOutListItemNoCriteriaDomain();
            for (W3004ListDomain w3004ListDomain : domainList) {
                CommonUtil.copyPropertiesDomainToDomain(
                    twCarryOutListItemNoCriteriaDomain, w3004ListDomain,
                    w3004UpdateDomain.getScreenDateFormat());
                if (CHECK_ON.equals(w3004ListDomain.getSelected())) {
                    count = count + 1;
                }
                twCarryOutListItemNoCriteriaDomain.setDscId(w3004ListDomain.getLoginUserDscId());
                twCarryOutListItemNoCriteriaDomain.setComCreateFuncId(w3004UpdateDomain.getScreenId());
                twCarryOutListItemNoCriteriaDomain.setComCreateUserId(w3004ListDomain.getLoginUserDscId());
                twCarryOutListItemNoCriteriaDomain.setComUpdateFuncId(w3004UpdateDomain.getScreenId());
                twCarryOutListItemNoCriteriaDomain.setComUpdateUserId(w3004ListDomain.getLoginUserDscId());
                // Insert Delete for TwCarryOutListItemNo
                w3TransferService.transactOnPrintCarryOutListByPartsUpdate(twCarryOutListItemNoCriteriaDomain);
            }
        }
        return count;
    }
}
