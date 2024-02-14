/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0009;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_3004;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0004;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W3009;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TR_RCV_METH_TYP_TR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TR_STATUS_RECEIVED_TR;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W3009ListDomain;
import com.globaldenso.eca0027.core.business.domain.W3009UpdateDomain;
import com.globaldenso.eca0027.core.business.domain.W3TransferDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W3TransferCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W3TransferService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractTransactFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.DateUtil;

/**
 * <p>FacadeSercice for W3009 Receiving process.</p>
 *
 * @author DIAT Thalerngsak.P
 * @version 1.00
 */
public class W3009ReceiveFacadeServiceImpl extends
    AbstractTransactFacadeService<Void, W3009UpdateDomain> {
    /**
     * Common Service
     */
    protected CommonService commonService;
    
    /**
     * <p>Type in the role of the field.</p>
     */
    protected W3TransferService w3TransferService;

    /**
     * <p>Constractor</p>
     *
     */
    public W3009ReceiveFacadeServiceImpl() {
    }

    /**
     * <p>commonService setter</p>
     *
     * @param commonService commonService set
     */
    public void setCommonService(CommonService commonService) {
        this.commonService = commonService;
    }

    /**
     * <p>w3TransferService setter</p>
     *
     * @param transferService w3TransferService set
     */
    public void setW3TransferService(W3TransferService transferService) {
        w3TransferService = transferService;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected Void callServices(W3009UpdateDomain updateDomain)
        throws GscmApplicationException, ApplicationException {
        //Convert to list update domain
        List <? extends W3TransferDomain> listUpdateDomain = 
            convertToListDomain(updateDomain.getListDomainList(), updateDomain.getDateFormat());
        //Call w3TransferService.updateTransfer
        w3TransferService.updateOnCarryInMainScreenReceive(listUpdateDomain);
        
        return null;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W3009UpdateDomain filterDomain(W3009UpdateDomain updateDomain)
        throws GscmApplicationException, ApplicationException {
      //Check if selected TR from screen or not
        if (StringUtils.isEmpty(updateDomain.getTrNo()))  {
            List<MessageDomain> errList = Arrays.asList(new MessageDomain("", NXS_E7_0004, null));
            
            throw new ValidationException(errList);
        }
        return updateDomain;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W3009UpdateDomain filterDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {
        
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @SuppressWarnings("unchecked")
    @Override
    protected void validateDatabase(W3009UpdateDomain filterDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {
        List<MessageDomain> errList = new ArrayList<MessageDomain>();
        String trNo = filterDomain.getTrNo();  
        if(trNo != null){
            if (!w3TransferService.validateDatabaseTtTransferOnCarryInMainReceive(trNo)) {
                List<W3009ListDomain> listDomainList  = (List<W3009ListDomain>) filterDomain.getListDomainList();
                for(W3009ListDomain listDomain : listDomainList){
                    if(trNo.equals(listDomain.getTrNo())){
                        Object[] params = {
                            listDomain.getTrStatus()
                        };
                        errList.add(new MessageDomain("", NXS_E1_3004, params));
                        throw new ValidationException(errList);
                    }
                }
                
            }
            //Create criteria domain
            W3TransferCriteriaDomain criteria = new W3TransferCriteriaDomain();
            criteria.setTrNo(trNo);
            criteria.setUserAuthList(filterDomain.getUserAuthList());
            criteria.setTrItemTyp(filterDomain.getListDomainList().get(0).getTrItemTyp());
            //Check if user have authority to permit
            if(!w3TransferService.validateDatabaseAuthorityCheckOnCarryInMain(criteria)){
                //If don't have authority throw exception
                errList.add(new MessageDomain("", GSCM_I0_0009, null));
                throw new ValidationException(errList);
            }
        }
        
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W3009UpdateDomain filterDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {
        
    }

    /**
     * <p>Convert to list domain</p>
     *
     * @param transferList list
     * @param dateFormat date
     * @return return return
     * @throws ApplicationException ApplicationException
     */
    protected List<W3TransferDomain> convertToListDomain(
        List<? extends W3009ListDomain> transferList, String dateFormat) throws ApplicationException {
        
        List<W3TransferDomain> listTransferDomain = new ArrayList<W3TransferDomain>();

        if (transferList != null) {
            for (W3009ListDomain transfer : transferList) {
                // Time zone conversion date of Shipper
                // Shipperのタイムゾーン変換日付
                Date sysdate
                    = DateUtil.convertTime(new Date(), commonService.searchTimezone(transfer.getShipperCd()));

                W3TransferDomain listDomain = new W3TransferDomain();
                // copy to list domain
                CommonUtil.copyPropertiesDomainToDomain(listDomain, transfer, dateFormat);
                listDomain.setTrStatus(TR_STATUS_RECEIVED_TR);
                listDomain.setLoginUserDscId(transfer.getComUpdateUserId());
                listDomain.setTrRcvDt(sysdate);
                listDomain.setTrRcvMethTyp(TR_RCV_METH_TYP_TR);
                listDomain.setTrRcvDscId(transfer.getLoginUserDscId());
                commonService.setCommonPropertyForUpdate(listDomain, SCREEN_ID_W3009);
                
                listTransferDomain.add(listDomain);
            }
        }
        return listTransferDomain;
    }

}
