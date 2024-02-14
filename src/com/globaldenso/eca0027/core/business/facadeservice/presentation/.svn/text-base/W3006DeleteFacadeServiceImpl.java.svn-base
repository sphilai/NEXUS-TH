/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CHECK_ON;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0355;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_3007;

import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.TwTransferItemPltzDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TwTransferItemPltzCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W3006UpdateDomain;
import com.globaldenso.eca0027.core.business.service.W3TransferService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractDeleteFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;

/**
 * <p>
 * Delete
 * </p>
 * 
 * @author SNT ku
 * @version 1.00
 */
public class W3006DeleteFacadeServiceImpl extends
    AbstractDeleteFacadeService<Integer, W3006UpdateDomain> {

    /**
     * W3TransferService
     */
    protected W3TransferService w3TransferService;

    /**
     * constructor.
     */
    public W3006DeleteFacadeServiceImpl() {
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
     * {@inheritDoc}
     * 
     * <pre>
     * - No processing
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W3006UpdateDomain filterDomain(W3006UpdateDomain updateDomain)
        throws GscmApplicationException, ApplicationException {

        return updateDomain;
    }

    /**
     * {@inheritDoc}
     * 
     * <pre>
     * - No processing
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W3006UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {
    }

    /**
     * {@inheritDoc}
     * 
     * <pre>
     * - No processing
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W3006UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {
    }

    /**
     * {@inheritDoc}
     * if no record is selected, error
     * if all the records in TW_TRANSFER_ITEM_PLTZ are checked, error
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W3006UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {

        TwTransferItemPltzCriteriaDomain twTransferItemPltz = new TwTransferItemPltzCriteriaDomain();
        TwTransferItemPltzDomain result = new TwTransferItemPltzDomain();
        twTransferItemPltz.setDscId(updateDomain.getLoginUserDscId());
        int count = 1;
        int countCheckOn = 1;

        List<MessageDomain> messageDomainList = new ArrayList<MessageDomain>();

        if (0 == updateDomain.getCheckedAmount()) {
            messageDomainList.add(new MessageDomain(null, NXS_E7_3007,
                new Object[] {null}));
            throw new ValidationException(messageDomainList);
        }else{
            if (updateDomain.getW3006ListDomainList() != null){
                for (int i = 1; i < updateDomain.getW3006ListDomainList().size(); i++ ) {
                    if (!updateDomain.getW3006ListDomainList().get(i).getMainMark()
                        .equals(
                            updateDomain.getW3006ListDomainList().get(i - 1)
                                .getMainMark())) {
                        twTransferItemPltz.setMainMark(updateDomain
                            .getW3006ListDomainList().get(i).getMainMark());
                        result = w3TransferService
                            .validateDatabaseDeleteAllMainMarksInWk(twTransferItemPltz);
                        if (result != null) {
                            count = count + 1;
                        }
                    }
                }
                ArrayList<String> list = new ArrayList<String>();
                for (int i = 0; i < updateDomain.getW3006ListDomainList().size(); i++ ) {
                    if (CHECK_ON.equals(updateDomain.getW3006ListDomainList().get(i)
                        .getSelected())) {
                        list.add(updateDomain.getW3006ListDomainList().get(i)
                            .getMainMark());
                    }
                }
                for (int i = 0; i < list.size() - 1; i++ ) {
                    if (!list.get(i).equals(list.get(i + 1))) {
                        countCheckOn = countCheckOn + 1;
                    }
                }

                if (count == countCheckOn) {
                    messageDomainList.add(new MessageDomain(null, NXS_E1_0355,
                        new Object[] {null}));
                    throw new ValidationException(messageDomainList);
                }
            }
        }
    }

    /**
     * {@inheritDoc}
     * Delete TW_TRANSFER_ITEM_PLTZ
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected Integer callServices(W3006UpdateDomain updateDomain)
        throws GscmApplicationException, ApplicationException {
        TwTransferItemPltzCriteriaDomain twTransferItemPltz = new TwTransferItemPltzCriteriaDomain();
        twTransferItemPltz.setDscId(updateDomain.getLoginUserDscId());
        ArrayList<String> list = new ArrayList<String>();
        ArrayList<String> list2 = new ArrayList<String>();
        
        int count = 0;
        if(updateDomain.getW3006ListDomainList() != null){
            for (int i = 0; i < updateDomain.getW3006ListDomainList().size(); i++ ) {
                if (CHECK_ON.equals(updateDomain.getW3006ListDomainList().get(i)
                    .getSelected())) {
                    list.add(updateDomain.getW3006ListDomainList().get(i)
                        .getMainMark());
                }
            }
            list2.add(list.get(0));
            for (int i = 0; i < list.size() - 1; i++ ) {
                if (!list.get(i).equals(list.get(i + 1))) {
                    list2.add(list.get(i + 1));
                }
            }
            for (int i = 0; i < list2.size(); i++ ) {
                twTransferItemPltz.setMainMark(list2.get(i));
                w3TransferService
                    .deleteOnRegisterCmlTransferReportDelete(twTransferItemPltz);
                count = count + 1;
            }
        }
        return count;
    }

}
