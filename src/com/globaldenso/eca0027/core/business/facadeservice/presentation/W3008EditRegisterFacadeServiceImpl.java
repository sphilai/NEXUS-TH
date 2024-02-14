/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0364;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W3008;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W3008ListDomain;
import com.globaldenso.eca0027.core.business.domain.W3008UpdateDomain;
import com.globaldenso.eca0027.core.business.service.W3TransferService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractTransactFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.Validator;

/**
 * <p>
 * EditRegidter
 * </p>
 * 
 * @author SNT riku
 * @version 1.00
 */
public class W3008EditRegisterFacadeServiceImpl extends
    AbstractTransactFacadeService<Void, W3008UpdateDomain> {

    /**
     * <p>
     * W3TransferService
     * </p>
     */
    protected W3TransferService w3TransferService;

    /**
     * constructor.
     */
    public W3008EditRegisterFacadeServiceImpl() {
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
    protected W3008UpdateDomain filterDomain(W3008UpdateDomain w3008UpdateDomain)
        throws GscmApplicationException, ApplicationException {

        return w3008UpdateDomain;
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * single item check
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W3008UpdateDomain w3008UpdateDomain)
        throws GscmApplicationException, ApplicationException,
        ValidationException {
        List<? extends W3008ListDomain> w3008List = w3008UpdateDomain
            .getW3008ListDomainList();
        for (W3008ListDomain domain : w3008List) {
            Validator<W3008ListDomain> valid = new Validator<W3008ListDomain>(
                domain);
            // item check
            String[] properties = {"editTransQty", "editTagQty"};
            valid.isValidateProperties(properties);
            valid.isValidateProperties(properties, SCREEN_ID_W3008);

            // Error check
            if (0 < valid.getErrList().size()) {
                throw new ValidationException(valid.getErrList());
            }
        }
    }

    /**
     * {@inheritDoc}.
     * call w3TransferService.validateConsistencyCheckQty(w3008UpdateDomain)
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W3008UpdateDomain w3008UpdateDomain)
        throws GscmApplicationException, ApplicationException,
        ValidationException {
        w3TransferService.validateConsistencyCheckQty(w3008UpdateDomain);
        List<MessageDomain> messageDomainList = new ArrayList<MessageDomain>();
        if(w3008UpdateDomain.getW3008ListDomainList() != null 
            && w3008UpdateDomain.getW3008ListDomainList().size() > 0){
            BigDecimal editCount = w3008UpdateDomain.getW3008ListDomainList().get(0).getEditCnt();
            //If editCnt >= 9
            if( editCount.intValue() >= 9){
                messageDomainList.add(new MessageDomain(null, NXS_E1_0364,
                    new Object[] {9}));
                throw new ValidationException(messageDomainList);
            }
        }
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
    protected void validateDatabase(W3008UpdateDomain w3008UpdateDomain)
        throws GscmApplicationException, ApplicationException,
        ValidationException {

    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * Update TT_TRANSFER
     * Delete checked TT_TRANSFER_ITEM_ITEM_NO
     * Update not checked TT_TRANSFER_ITEM_ITEM_NO
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected Void callServices(W3008UpdateDomain w3008UpdateDomain)
        throws GscmApplicationException, ApplicationException {
        w3TransferService
            .transactOnRegisterPartsTransferReportEditRegister(w3008UpdateDomain);

        return null;
    }
}
