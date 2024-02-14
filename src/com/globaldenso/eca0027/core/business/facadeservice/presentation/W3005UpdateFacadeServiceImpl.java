/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CHECK_ON;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_3007;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_N;

import java.util.Arrays;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.TwTransferItemPltzDomain;
import com.globaldenso.eca0027.core.business.domain.W3005ListDomain;
import com.globaldenso.eca0027.core.business.domain.W3005UpdateDomain;
import com.globaldenso.eca0027.core.business.service.W3TransferService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractTransactFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 * <p>
 * Update Header
 * </p>
 * 
 * @author SNT riku
 * @version 1.00
 */
public class W3005UpdateFacadeServiceImpl extends
    AbstractTransactFacadeService<Void, W3005UpdateDomain> {

    /**
     * <p>
     * W3TransferService
     * </p>
     */
    protected W3TransferService w3TransferService;

    /**
     * constructor.
     */
    public W3005UpdateFacadeServiceImpl() {
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
    protected W3005UpdateDomain filterDomain(W3005UpdateDomain W3005UpdateDomain)
        throws GscmApplicationException, ApplicationException {

        //Chaiporn add check selected 2015-01-13 UT173,UT169
        if (W3005UpdateDomain.getCheckedAmount()==0){
            List<MessageDomain> errList = Arrays.asList(new MessageDomain("", NXS_E7_3007, null));
            throw new ValidationException(errList);
        }
        return W3005UpdateDomain;
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
    protected void validateItems(W3005UpdateDomain W3005UpdateDomain)
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
    protected void validateConsistency(W3005UpdateDomain W3005UpdateDomain)
        throws GscmApplicationException, ApplicationException,
        ValidationException {

    }

    /**
     * {@inheritDoc}.
     * 
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W3005UpdateDomain W3005UpdateDomain)
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
    protected Void callServices(W3005UpdateDomain w3005UpdateDomain)
        throws GscmApplicationException, ApplicationException {

        List<? extends W3005ListDomain> domainList = w3005UpdateDomain.getW3005ListDomainList();
        if (domainList != null) {
            TwTransferItemPltzDomain twTransferItemPltzDomain = new TwTransferItemPltzDomain();
            for (W3005ListDomain w3005ListDomain : domainList) {
                //Get selected record if Selected = "on" & CHK = "Y" support UT171
                if (CHECK_ON.equals(w3005ListDomain.getSelected())
                    && FLAG_N.equals(w3005ListDomain.getChk())) {
                    CommonUtil.copyPropertiesDomainToDomain(twTransferItemPltzDomain,
                        w3005ListDomain, w3005UpdateDomain.getScreenDateFormat());
                    twTransferItemPltzDomain.setDscId(w3005ListDomain.getLoginUserDscId());
                    twTransferItemPltzDomain.setComCreateFuncId(w3005UpdateDomain.getScreenId());
                    twTransferItemPltzDomain
                        .setComCreateUserId(w3005ListDomain.getLoginUserDscId());
                    twTransferItemPltzDomain.setComUpdateFuncId(w3005UpdateDomain.getScreenId());
                    twTransferItemPltzDomain
                        .setComUpdateUserId(w3005ListDomain.getLoginUserDscId());
                    // Insert for TwTransferItemPltzDomain
                    w3TransferService.transactOnCmlTranseferReportUpdate(twTransferItemPltzDomain);
                }
            }
        }
        return null;
    }
}
