/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CHECK_ON;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W3007;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_N;

import java.math.BigDecimal;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.TwTransferItemItemNoDomain;
import com.globaldenso.eca0027.core.business.domain.W3007ListDomain;
import com.globaldenso.eca0027.core.business.domain.W3007UpdateDomain;
import com.globaldenso.eca0027.core.business.service.W3TransferService;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractCreateFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.Validator;

/**
 * <p>
 * Update
 * </p>
 * 
 * @author SNT riku
 * @version 1.00
 */
public class W3007UpdateFacadeServiceImpl extends
    AbstractCreateFacadeService<Void, W3007UpdateDomain> {

    /**
     * <p>
     * W3TransferService
     * </p>
     */
    protected W3TransferService w3TransferService;

    /**
     * constructor.
     */
    public W3007UpdateFacadeServiceImpl() {
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
    protected W3007UpdateDomain filterDomain(W3007UpdateDomain w3007UpdateDomain)
        throws GscmApplicationException, ApplicationException {

        return w3007UpdateDomain;
    }

    /**
     * {@inheritDoc}.
     * single item check
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W3007UpdateDomain w3007UpdateDomain)
        throws GscmApplicationException, ApplicationException,
        ValidationException {
        List<? extends W3007ListDomain> w3007List = w3007UpdateDomain
            .getW3007ListDomainList();
        for (W3007ListDomain domain : w3007List) {
            //Support UT171
            if (CHECK_ON.equals(domain.getSelected()) && FLAG_N.equals(domain.getChk())) {
                Validator<W3007ListDomain> valid = new Validator<W3007ListDomain>(
                    domain);
                // item check
                String[] properties = {"actQty", "actTagQty"};
                valid.isValidateProperties(properties);
                valid.isValidateProperties(properties, SCREEN_ID_W3007);

                // Error check
                if (0 < valid.getErrList().size()) {
                    throw new ValidationException(valid.getErrList());
                }
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
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W3007UpdateDomain w3007UpdateDomain)
        throws GscmApplicationException, ApplicationException,
        ValidationException {

    }

    /**
     * {@inheritDoc}.
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W3007UpdateDomain w3007UpdateDomain)
        throws GscmApplicationException, ApplicationException,
        ValidationException {
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * checked record - insert
     * not checked record - do nothing
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected Void callServices(W3007UpdateDomain w3007UpdateDomain)
        throws GscmApplicationException, ApplicationException {

        if (w3007UpdateDomain.getW3007ListDomainList() != null) {
            TwTransferItemItemNoDomain twTransferItemItemNoDomain = new TwTransferItemItemNoDomain();
            for (W3007ListDomain w3007ListDomain : w3007UpdateDomain
                .getW3007ListDomainList()) {
                //Support UT171 Add Chk = 'N'
                if (CHECK_ON.equals(w3007ListDomain.getSelected())&& FLAG_N.equals(w3007ListDomain.getChk())) {
                    CommonUtil.copyPropertiesDomainToDomain(
                        twTransferItemItemNoDomain, w3007ListDomain,
                        w3007UpdateDomain.getScreenDateFormat());
                    twTransferItemItemNoDomain.setDscId(w3007ListDomain
                        .getLoginUserDscId());
                    twTransferItemItemNoDomain.setItemNo(w3007ListDomain
                        .getItemNo());
                    twTransferItemItemNoDomain.setPkgCd(w3007ListDomain
                        .getPkgCd());
                    if (!"".equals(w3007ListDomain.getActQty())) {
                        twTransferItemItemNoDomain
                            .setCarryOutQty(new BigDecimal(w3007ListDomain
                                .getActQty()));
                    }
                    if (!"".equals(w3007ListDomain.getActTagQty())) {
                        twTransferItemItemNoDomain
                            .setCarryOutCaseQty(new BigDecimal(w3007ListDomain
                                .getActTagQty()));
                    }
                    twTransferItemItemNoDomain.setCustomerCd(w3007ListDomain
                        .getCustomerCd());
                    twTransferItemItemNoDomain.setLgcyShipTo(w3007ListDomain
                        .getShipTo());

                    twTransferItemItemNoDomain
                        .setComCreateFuncId(w3007UpdateDomain.getScreenId());
                    twTransferItemItemNoDomain
                        .setComCreateUserId(w3007ListDomain.getLoginUserDscId());
                    twTransferItemItemNoDomain
                        .setComUpdateFuncId(w3007UpdateDomain.getScreenId());
                    twTransferItemItemNoDomain
                        .setComUpdateUserId(w3007ListDomain.getLoginUserDscId());
                    // Insert for CarryOutListMm
                    w3TransferService
                        .createOnCreateCreatePartsTransferReportUpdate(twTransferItemItemNoDomain);
                }
            }
        }

        return null;
    }
}
