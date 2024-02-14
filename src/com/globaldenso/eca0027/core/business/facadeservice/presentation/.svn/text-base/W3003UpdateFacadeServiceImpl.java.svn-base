/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CHECK_ON;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0358;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0359;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_3007;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PLTZ_STATUS_PLTZ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCarryOutListPltzCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W3003ListDomain;
import com.globaldenso.eca0027.core.business.domain.W3003UpdateDomain;
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
 * @author SNT ku
 * @version 1.00
 */
public class W3003UpdateFacadeServiceImpl extends
    AbstractTransactFacadeService<Integer, W3003UpdateDomain> {

    /**
     * <p>
     * W3TransferService
     * </p>
     */
    protected W3TransferService w3TransferService;

    /**
     * constructor.
     */
    public W3003UpdateFacadeServiceImpl() {
    }

    /**
     * <p>
     * Setter method for w3TransferService.
     * </p>
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
    protected W3003UpdateDomain filterDomain(W3003UpdateDomain w3003UpdateDomain)
        throws GscmApplicationException, ApplicationException {

        //Chaiporn add check selected 2015-01-13 UT173,UT169
        if (w3003UpdateDomain.getCheckedAmount()==0){
            List<MessageDomain> errList = Arrays.asList(new MessageDomain("", NXS_E7_3007, null));
            throw new ValidationException(errList);
        }

        return w3003UpdateDomain;
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
    protected void validateItems(W3003UpdateDomain w3003UpdateDomain)
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
    protected void validateConsistency(W3003UpdateDomain w3003UpdateDomain)
        throws GscmApplicationException, ApplicationException,
        ValidationException {

    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * -PLTZ_STATUS Check
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W3003UpdateDomain w3003UpdateDomain)
        throws GscmApplicationException, ApplicationException,
        ValidationException {

        List<MessageDomain> messageDomainList = new ArrayList<MessageDomain>();

        List<? extends W3003ListDomain> domainList = w3003UpdateDomain
            .getW3003ListDomainList();
        if (domainList != null) {
            TtPltzCriteriaDomain ttPltzCriteriaDomain = new TtPltzCriteriaDomain();
            TtPltzDomain ttPltzDomain = new TtPltzDomain();
            for (W3003ListDomain w3003ListDomain : domainList) {
                if (CHECK_ON.equals(w3003ListDomain.getSelected())) {
                    CommonUtil.copyPropertiesDomainToDomain(
                        ttPltzCriteriaDomain, w3003ListDomain,
                        w3003UpdateDomain.getScreenDateFormat());
                    // PLTZ_STATUS Check
                    ttPltzDomain = w3TransferService
                        .validateDatabasePltz(ttPltzCriteriaDomain);

                    if (ttPltzDomain == null) {
                        messageDomainList.add(new MessageDomain(null,
                            NXS_E1_0359, new Object[] {}));
                    } else {
                        if (!PLTZ_STATUS_PLTZ.equals(ttPltzDomain
                            .getPltzStatus())) {
                            messageDomainList.add(new MessageDomain(null,
                                NXS_E1_0358, new Object[] {
                                    ttPltzCriteriaDomain.getMainMark(),
                                    ttPltzDomain.getPltzStatus()}));
                        }
                    }
                }
            }
        }

        // If there is an error
        if (0 < messageDomainList.size()) {
            throw new ValidationException(messageDomainList);
        }
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
    protected Integer callServices(W3003UpdateDomain w3003UpdateDomain)
        throws GscmApplicationException, ApplicationException {

        int count = 0;
        List<? extends W3003ListDomain> domainList = w3003UpdateDomain
            .getW3003ListDomainList();
        if (domainList != null) {
            TwCarryOutListPltzCriteriaDomain twCarryOutListPltzCriteriaDomain = new TwCarryOutListPltzCriteriaDomain();
            for (W3003ListDomain w3003ListDomain : domainList) {
                CommonUtil.copyPropertiesDomainToDomain(
                    twCarryOutListPltzCriteriaDomain, w3003ListDomain,
                    w3003UpdateDomain.getScreenDateFormat());
                if (CHECK_ON.equals(w3003ListDomain.getSelected())) {
                    count = count + 1;
                }
                twCarryOutListPltzCriteriaDomain.setDscId(w3003ListDomain
                    .getLoginUserDscId());
                twCarryOutListPltzCriteriaDomain
                    .setComCreateFuncId(w3003UpdateDomain.getScreenId());
                twCarryOutListPltzCriteriaDomain
                    .setComCreateUserId(w3003ListDomain.getLoginUserDscId());
                twCarryOutListPltzCriteriaDomain
                    .setComUpdateFuncId(w3003UpdateDomain.getScreenId());
                twCarryOutListPltzCriteriaDomain
                    .setComUpdateUserId(w3003ListDomain.getLoginUserDscId());
                // Insert Delete for CarryOutListMm
                w3TransferService
                    .transactOnPrintCarryOutListByCmlUpdate(twCarryOutListPltzCriteriaDomain);
            }
        }

        return count;
    }
}
