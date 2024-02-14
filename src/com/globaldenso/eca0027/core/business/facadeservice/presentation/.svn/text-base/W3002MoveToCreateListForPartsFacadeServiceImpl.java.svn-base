/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0029;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0009;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_3000;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_3010;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_3011;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W3001B;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W3001R;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W3002;

import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W3002CriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W3TransferService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractTransactFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.Validator;

/**
 * <p>The implementation class of Create List for Parts Action on Carry out Header</p>
 * <p>Carry out HeaderのMove to Create List for Partsアクションに対するFacadeサービスの実装クラスです。</p>
 * @author TIS Tanaka
 * @version 1.00
 */
public class W3002MoveToCreateListForPartsFacadeServiceImpl extends AbstractTransactFacadeService<Void, W3002CriteriaDomain> {

    /**
     * Common Service
     */
    protected CommonService commonService;

    /**
     * <p>W3TransferService</p>
     */
    protected W3TransferService w3TransferService;

    /**
     * <p>Constructor method.</p>
     *
     */
    public W3002MoveToCreateListForPartsFacadeServiceImpl() {
        super();
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
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */

    @Override
    protected Void callServices(W3002CriteriaDomain w3002CriteriaDomain)
        throws GscmApplicationException, ApplicationException {
        // No process
        return null;
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */

    @Override
    protected W3002CriteriaDomain filterDomain(W3002CriteriaDomain w3002CriteriaDomain)
        throws GscmApplicationException, ApplicationException {
        // No process
        return w3002CriteriaDomain;
    }

    /**
     * {@inheritDoc}
     * Authority check
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */

    @Override
    protected void validateConsistency(W3002CriteriaDomain w3002CriteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
       
        List<MessageDomain> errorList = new ArrayList<MessageDomain>();
        String carryOutCompCd = w3002CriteriaDomain.getCarryOutCompCd();
        String carryOutWhCd = w3002CriteriaDomain.getCarryOutWhCd();
        String carryInCompCd = w3002CriteriaDomain.getCarryInCompCd();
        String carryInWhCd = w3002CriteriaDomain.getCarryInWhCd();
        String shipperCd = w3002CriteriaDomain.getShipperCd();
        // If you do not have permission to update the input Shipper
        // 入力Shipperでの更新権限がない場合
        if (!w3TransferService.validateConsistencyShipperAuth(PERMIT_FUNC_ID_W3001R, w3002CriteriaDomain.getShipperCd())) {
            // If you do not have permission to browse the input Shipper
            if(!w3TransferService.validateConsistencyShipperAuth(PERMIT_FUNC_ID_W3001B, w3002CriteriaDomain.getShipperCd())){
                errorList.add(new MessageDomain("w3002CriteriaDomain.shipperCd", GSCM_I0_0009, null));
            }
        }
     // Thalerngsak add validation carryOutCompCd, carryOutWhCd,  Shipper Combination check
        if (!w3TransferService.validateDatabaseWhCompanyWhShipper(carryOutCompCd, carryOutWhCd, shipperCd)) {
            Object[] params = {
                commonService.getResource(w3002CriteriaDomain.getLocale(), "label.frNexusWhComCd"),
                commonService.getResource(w3002CriteriaDomain.getLocale(), "label.frNexusWhCd"),
                commonService.getResource(w3002CriteriaDomain.getLocale(), "label.shipperCd")
            };
            MessageDomain msgCarryOutCompCd = new MessageDomain("criteriaDomain.carryOutCompCd", NXS_E7_3010, params);
            MessageDomain msgCarryOutWhCd = new MessageDomain("criteriaDomain.carryOutWhCd", null, null);
            MessageDomain msgShipperCd = new MessageDomain("criteriaDomain.shipperCd", null, null);
            errorList.add(msgCarryOutCompCd);
            errorList.add(msgCarryOutWhCd);
            errorList.add(msgShipperCd);
        }
     // Thalerngsak add validation carryInCompCd, carryInWhCd,  Shipper Combination check
        if (!w3TransferService.validateDatabaseWhCompanyWhShipper(carryInCompCd, carryInWhCd, shipperCd)) {
            Object[] params = {
                commonService.getResource(w3002CriteriaDomain.getLocale(), "label.toNexusWhComCd"),
                commonService.getResource(w3002CriteriaDomain.getLocale(), "label.toNexusWhCd"),
                commonService.getResource(w3002CriteriaDomain.getLocale(), "label.shipperCd")
            };
            MessageDomain msgCarryOutCompCd = new MessageDomain("criteriaDomain.carryInCompCd", NXS_E7_3011, params);
            MessageDomain msgCarryOutWhCd = new MessageDomain("criteriaDomain.carryInWhCd", null, null);
            MessageDomain msgShipperCd = new MessageDomain("criteriaDomain.shipperCd", null, null);
            errorList.add(msgCarryOutCompCd);
            errorList.add(msgCarryOutWhCd);
            errorList.add(msgShipperCd);
        }
        // If there is an error
        // エラーがある場合
        if (0 < errorList.size()) {
            throw new ValidationException(errorList);
        }
    }

    /**
     * {@inheritDoc}
     * validateDatabase
     *  existence check
     *  combination check
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */

    @Override
    protected void validateDatabase(W3002CriteriaDomain w3002CriteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {

        // 入力値の取得
        // Obtain the input values
        String carryOutCompCd = w3002CriteriaDomain.getCarryOutCompCd();
        String carryOutWhCd = w3002CriteriaDomain.getCarryOutWhCd();
        String carryInCompCd = w3002CriteriaDomain.getCarryInCompCd();
        String carryInWhCd = w3002CriteriaDomain.getCarryInWhCd();
        String shipperCd = w3002CriteriaDomain.getShipperCd();

        // エラーリストの作成
        // Create an Error List
        List<MessageDomain> errorList = new ArrayList<MessageDomain>();
        
        // carryOutCompCd, carryOutWhCd Combination check
        if (!w3TransferService.validateDatabaseWhCompanyWh(carryOutCompCd, carryOutWhCd)) {
            Object[] params = {
                commonService.getResource(w3002CriteriaDomain.getLocale(), "label.frNexusWhComCd"),
                commonService.getResource(w3002CriteriaDomain.getLocale(), "label.frNexusWhCd")
            };
            MessageDomain msgCarryOutCompCd = new MessageDomain("criteriaDomain.carryOutCompCd", GSCM_E0_0029, params);
            MessageDomain msgCarryOutWhCd = new MessageDomain("criteriaDomain.carryOutWhCd", null, null);
            errorList.add(msgCarryOutCompCd);
            errorList.add(msgCarryOutWhCd);
        }
        // carryInCompCd, carryInWhCd Combination check
        if (!w3TransferService.validateDatabaseWhCompanyWh(carryInCompCd, carryInWhCd)) {
            Object[] params = {
                commonService.getResource(w3002CriteriaDomain.getLocale(), "label.toNexusWhComCd"),
                commonService.getResource(w3002CriteriaDomain.getLocale(), "label.toNexusWhCd")
            };
            MessageDomain msgCarryInCompCd = new MessageDomain("criteriaDomain.carryInCompCd", GSCM_E0_0029, params);
            MessageDomain msgCarryInWhCd = new MessageDomain("criteriaDomain.carryInWhCd", null, null);
            errorList.add(msgCarryInCompCd);
            errorList.add(msgCarryInWhCd);
        }

        // shipperCd Existence check
        if (!w3TransferService.validateDatabaseShipper(shipperCd)) {
            MessageDomain msgShipperCd = new MessageDomain("criteriaDomain.shipperCd", NXS_E7_3000, null);
            errorList.add(msgShipperCd);
        }

        // If there is an error
        // エラーがある場合
        if (0 < errorList.size()) {
            throw new ValidationException(errorList);
        }
    }

    /**
     * {@inheritDoc}
     * Validate input item
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */

    @Override
    protected void validateItems(W3002CriteriaDomain w3002CriteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        Validator<W3002CriteriaDomain> valid = new Validator<W3002CriteriaDomain>(w3002CriteriaDomain, "criteriaDomain");
        
        //item check
        String[] properties = {
            "carryOutCompCd",
            "carryOutWhCd",
            "carryInCompCd",
            "carryInWhCd",
            "shipperCd"
        };
        
        valid.isValidateProperties(properties);
        valid.isValidateProperties(properties, SCREEN_ID_W3002);
        
        // Error check
        if (0 < valid.getErrList().size()) {
            throw new ValidationException(valid.getErrList());
        }
    }
}
