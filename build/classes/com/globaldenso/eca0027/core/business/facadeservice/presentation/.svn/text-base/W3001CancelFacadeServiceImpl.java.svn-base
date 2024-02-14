/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.business.facadeservice.presentation;


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

//Constant
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_3004;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0004;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TR_STATUS_ISSUED_TR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TR_ITEM_TYP_CML;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TR_TYPE_ITEM_NO;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WINDOW_ID_0;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0009;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W3001;
/**
 * <p>Type in the functional overview of the class.</p>
 *
 * @author DIAT Chaiporn.A
 * @version 1.00
 */
public class W3001CancelFacadeServiceImpl extends AbstractTransactFacadeService<Void, W3001UpdateDomain> {

    /**
     * Common Service
     */
    protected CommonService commonService;
    
    /**
     * <p>Type in the role of the field.</p>
     */
    protected W3TransferService w3TransferService;
       
    /**
     * <p>Type in the functional overview of the constructor.</p>
     *
     */
    public W3001CancelFacadeServiceImpl() {
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
     * <p>Setter method for commonService.</p>
     *
     * @param commonService Set for commonService
     */
    public void setCommonService(CommonService commonService) {
        this.commonService = commonService;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * Get common info
     *      -Get UserName
     * Convert to list domain for update
     * Update Transfer status to be Issued TR
     * If TR_KIND is CML 
     *      -update TT_TMP_STOCK
     *      -Update TT_PLTZ for current location of CML
     *      -Update CIGMA transaction
     * Else If TR_KIND is ITEN_NO
     *      -Update CIGMA transaction
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected Void callServices(W3001UpdateDomain updateDomain) throws GscmApplicationException,
        ApplicationException {
        //Get Common Info
        WindowInfoDomain windowInfo = (WindowInfoDomain)DensoContext.get().getGeneralArea(
            WINDOW_ID_0);
        Eca0027CommonInfoDomain eca0027CommonInfoDomain = (Eca0027CommonInfoDomain)windowInfo
            .getCommonInfo();
        // Convert to list update domain
        W3TransferDomain transferDomain = convertToUpdateDomain(updateDomain.getListDomainList(), updateDomain.getDateFormat());
        // Update Transfer status to be Issued TR
        w3TransferService.updateOnCarryoutMainScreenCancel(transferDomain);
        // if TR_KIND is CML Proceed below step
        if (transferDomain.getTrItemTyp().equals(TR_ITEM_TYP_CML)) {
            // Create CIGMA Transaction by calling web service
            w3TransferService.transactCigmaInventoryOnCarryOutMainByCancelActivate(transferDomain
                .getShipperCd(), transferDomain.getTrNo(), eca0027CommonInfoDomain.getUserName(),
                TR_ITEM_TYP_CML);
            // Update TT_TMP_STOCK
            w3TransferService.updateTtTmpStockOnCarryOutMainScreenCancel(updateDomain.getTrNo(),
                transferDomain.getLoginUserDscId(), SCREEN_ID_W3001);
            // Update TT_PLTZ for current location of CML
            w3TransferService.updateTtPltzOnCancelActivate(transferDomain);
            // If TR_KIND is ITEM NO
        } else if (transferDomain.getTrItemTyp().equals(TR_TYPE_ITEM_NO)) {
            // Create CIGMA Transaction by calling web service
            w3TransferService.transactCigmaInventoryOnCarryOutMainByCancelActivate(transferDomain
                .getShipperCd(), transferDomain.getTrNo(), eca0027CommonInfoDomain.getUserName(),
                TR_TYPE_ITEM_NO);
        }
        return null;
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W3001UpdateDomain filterDomain(W3001UpdateDomain updateDomain)
        throws GscmApplicationException, ApplicationException {
        //If don't select any TR throw error
        if (StringUtils.isEmpty(updateDomain.getTrNo())) {
            List<MessageDomain> errList = Arrays.asList(new MessageDomain("", NXS_E7_0004, null));
            throw new ValidationException(errList);
        }
        return updateDomain;
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W3001UpdateDomain filterDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W3001UpdateDomain filterDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        List<MessageDomain> errList = new ArrayList<MessageDomain>();
        String trNo = filterDomain.getTrNo();
        //Create criteria domain
        W3TransferCriteriaDomain criteria = new W3TransferCriteriaDomain();
        criteria.setTrNo(trNo);
        criteria.setUserAuthList(filterDomain.getUserAuthList());
        criteria.setTrItemTyp(filterDomain.getListDomainList().get(0).getTrItemTyp());
        //Check if user have authority to permit
        if(!w3TransferService.validateDatabaseAuthorityCheckOnCarryOutMain(criteria)){
            //If don't have authority throw exception
            errList.add(new MessageDomain("", GSCM_I0_0009, null));
            throw new ValidationException(errList);
        }
        //Check if status is valid for cancel activate
        if (!w3TransferService.validateDatabaseTtTransferOnCarryOutMainCancel(trNo)) {
            Object[] params = {
                filterDomain.getListDomainList().get(0).getTrStatus()
            };
          //If don't have authority throw exception
            errList.add(new MessageDomain("", NXS_E1_3004, params));
            throw new ValidationException(errList);
        }

    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W3001UpdateDomain filterDomain) throws GscmApplicationException,
        ValidationException, ApplicationException {
        
    }
    
    /**
     * <p>
     * Convert to update Domain
     * </p>
     * 
     * @param transferList transfer
     * @param dateFormat date
     * @return return return
     */
    protected W3TransferDomain convertToUpdateDomain(List<? extends W3001ListDomain> transferList,
        String dateFormat) {
        W3TransferDomain transfer = new W3TransferDomain();
        CommonUtil.copyPropertiesDomainToDomain(transfer, transferList.get(0), dateFormat);
        transfer.setTrStatus(TR_STATUS_ISSUED_TR);
        transfer.setScreenId(SCREEN_ID_W3001);
        transfer.setTrActvMethTyp(null);
        return transfer;
    }


}
