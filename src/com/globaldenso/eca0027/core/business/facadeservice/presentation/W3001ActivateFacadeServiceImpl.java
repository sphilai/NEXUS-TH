/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_3004;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0004;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TR_ACTV_METH_TYP_TR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TR_STATUS_ACTIVATE_TR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TR_ITEM_TYP_CML;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TR_TYPE_ITEM_NO;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WINDOW_ID_0;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0009;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W3001;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W3001ListDomain;
import com.globaldenso.eca0027.core.business.domain.W3001UpdateDomain;
import com.globaldenso.eca0027.core.business.domain.W3TransferDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W3TransferCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W3TransferService;
import com.globaldenso.eca0027.core.common.business.domain.Eca0027CommonInfoDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractTransactFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 * <p>
 * Activate TR facade service
 * </p>
 * 
 * @author DIAT Chaiporn.A
 * @version 1.00
 */
public class W3001ActivateFacadeServiceImpl extends
    AbstractTransactFacadeService<Void, W3001UpdateDomain> {

    /**
     * Common Service
     */
    protected CommonService commonService;

    /**
     * <p>
     * W3TransferService
     * </p>
     */
    protected W3TransferService w3TransferService;

    /**
     * <p>
     * Constructor method.
     * </p>
     */
    public W3001ActivateFacadeServiceImpl() {
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
     * <p>
     * Setter method for commonService.
     * </p>
     * 
     * @param commonService Set for commonService
     */
    public void setCommonService(CommonService commonService) {
        this.commonService = commonService;
    }

    /**
     * {@inheritDoc}
     * 
     * <pre>
     * Get common info
     *      -Get UserName
     * Convert to list domain for update
     * Update Transfer status to be Activated
     * If TR_KIND is CML 
     *      -update TT_TMP_STOCK
     *      -Update TT_PLTZ for current location of CML
     *      -Update CIGMA transaction
     * Else If TR_KIND is ITEN_NO
     *      -Update CIGMA transaction
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected Void callServices(W3001UpdateDomain updateDomain) throws GscmApplicationException,
        ApplicationException {
        // Get Common Info
        WindowInfoDomain windowInfo = (WindowInfoDomain)DensoContext.get().getGeneralArea(
            WINDOW_ID_0);
        Eca0027CommonInfoDomain eca0027CommonInfoDomain = (Eca0027CommonInfoDomain)windowInfo
            .getCommonInfo();
        String userNm = eca0027CommonInfoDomain.getUserName();
        // Convert to list update domain
        List<? extends W3TransferDomain> listUpdateDomain = convertToListDomain(updateDomain
            .getListDomainList(), updateDomain.getDateFormat(), userNm);
        // Update Transfer status to be Activated
        w3TransferService.updateOnCarryOutMainScreenActivate(listUpdateDomain);
        // add for loop for update Transfer by CML or ITEM NO
        for (W3TransferDomain w3TransferDomain : listUpdateDomain) {
            // if TR_KIND is CML update TT_TMP_STOCK
            if (w3TransferDomain.getTrItemTyp().equals(TR_ITEM_TYP_CML)) {
                // Create CIGMA inventory transact by calling Web Service
                w3TransferService.transactCigmaInventoryOnCarryOutMainByActivate(w3TransferDomain
                    .getShipperCd(), w3TransferDomain.getTrNo(), userNm, TR_ITEM_TYP_CML);
                // if TR_KIND is CML update TT_TMP_STOCK
                // Update TT_TMP Stock
                w3TransferService.updateTtTmpStockOnCarryOutMainScreenActivate(w3TransferDomain
                    .getTrNo(), w3TransferDomain.getLoginUserDscId(), SCREEN_ID_W3001);
                // Update TT_PLTZ for current location of CML
                w3TransferService.updateTtPltzOnActivate(w3TransferDomain);
                // If TR_KIND is ITEM_NO
            } else if (w3TransferDomain.getTrItemTyp().equals(TR_TYPE_ITEM_NO)) {
                // Update TT_TRANSFER Status
                w3TransferService.transactCigmaInventoryOnCarryOutMainByActivate(w3TransferDomain
                    .getShipperCd(), w3TransferDomain.getTrNo(), userNm, TR_TYPE_ITEM_NO);
            }
        }
        return null;
    }

    /**
     * {@inheritDoc}
     * 
     * <pre>
     * Check if TR No was selected
     * 
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W3001UpdateDomain filterDomain(W3001UpdateDomain updateDomain)
        throws GscmApplicationException, ApplicationException {
        // Check if selected TR from screen or not
        if (StringUtils.isEmpty(updateDomain.getTrNo())) {
            // If didn't select throw exception
            List<MessageDomain> errList = Arrays.asList(new MessageDomain("", NXS_E7_0004, null));
            throw new ValidationException(errList);
        }
        return updateDomain;
    }

    /**
     * {@inheritDoc}
     * 
     * <pre>
     *  Check valid TR status
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W3001UpdateDomain filterDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
    }

    /**
     * {@inheritDoc}
     * 
     * <pre>
     * 
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W3001UpdateDomain filterDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        List<MessageDomain> errList = new ArrayList<MessageDomain>();
        String trNo = filterDomain.getTrNo();
        W3TransferCriteriaDomain criteria = new W3TransferCriteriaDomain();
        criteria.setTrNo(trNo);
        criteria.setUserAuthList(filterDomain.getUserAuthList());
        criteria.setTrItemTyp(filterDomain.getListDomainList().get(0).getTrItemTyp());
        // Check if user has authority to permit
        if (!w3TransferService.validateDatabaseAuthorityCheckOnCarryOutMain(criteria)) {
            errList.add(new MessageDomain("", GSCM_I0_0009, null));
            throw new ValidationException(errList);
        }
        // Check if status is valid for activate
        if (!w3TransferService.validateDatabaseTtTransferOnCarryOutMainActivate(trNo)) {
            // If Status is invalid throw exception
            Object[] params = {(String)filterDomain.getListDomainList().get(0).getTrStatus()};
            errList.add(new MessageDomain("", NXS_E1_3004, params));
            throw new ValidationException(errList);
        }

    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W3001UpdateDomain filterDomain) throws GscmApplicationException,
        ValidationException, ApplicationException {

    }

    /**
     * <p>
     * Convert to list domain
     * </p>
     * 
     * @param transferList list
     * @param dateFormat date
     * @param userNm String
     * @return return return
     */
    protected List<W3TransferDomain> convertToListDomain(
        List<? extends W3001ListDomain> transferList, String dateFormat, String userNm) {

        List<W3TransferDomain> listTransferDomain = new ArrayList<W3TransferDomain>();
        if (transferList != null) {
            for (W3001ListDomain transfer : transferList) {
                W3TransferDomain listDomain = new W3TransferDomain();
                CommonUtil.copyPropertiesDomainToDomain(listDomain, transfer, dateFormat);
                listDomain.setTrActvMethTyp(TR_ACTV_METH_TYP_TR);
                listDomain.setTrStatus(TR_STATUS_ACTIVATE_TR);
                listDomain.setTrActvNm(userNm);
                listDomain.setScreenId(SCREEN_ID_W3001);
                listTransferDomain.add(listDomain);
            }
        }
        return listTransferDomain;
    }

}
