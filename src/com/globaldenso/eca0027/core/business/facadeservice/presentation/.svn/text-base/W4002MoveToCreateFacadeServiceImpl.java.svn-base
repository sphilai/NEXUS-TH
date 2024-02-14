/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0029;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0009;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0070;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0111;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0113;

import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W4002CriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W4001StgInstrService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.eca0027.core.common.constants.Eca0027Constants;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.Validator;

/**
 * The Move to Create service facade implementation class of Staging Instruction Header screen
 * <br />荷揃え指示Header画面のMove to Create facadeサービス実装クラスです。
 * <pre>
 * bean id:w4002MoveToCreateFacadeService
 * </pre>
 *
 * @author $Author: masaki_awata@dnitsol.com $
 * @version $Revision: 5446 $
 */
public class W4002MoveToCreateFacadeServiceImpl extends
    AbstractSearchFacadeService<Void, W4002CriteriaDomain> {

    /**
     * Common service.
     */
    protected CommonService commonService;

    /**
     * Staging instruction service.
     */
    protected W4001StgInstrService w4001StgInstrService;

    /**
     * constructor.
     */
    public W4002MoveToCreateFacadeServiceImpl() {
    }

    /**
     * Setter method for commonService.
     *
     * @param commonService Set for commonService
     */
    public void setCommonService(CommonService commonService) {
        this.commonService = commonService;
    }

    /**
     * Setter method for w4001StgInstrService.
     *
     * @param stgInstrService Set for w4001StgInstrService
     */
    public void setW4001StgInstrService(W4001StgInstrService stgInstrService) {
        w4001StgInstrService = stgInstrService;
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * - No processing
     * - 処理なし
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W4002CriteriaDomain filterDomain(W4002CriteriaDomain w4002CriteriaDomain)
        throws GscmApplicationException, ApplicationException {

        return w4002CriteriaDomain;
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * - Common error checking
     *
     * - 共通エラーチェック
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W4002CriteriaDomain w4002CriteriaDomain)
        throws GscmApplicationException, ApplicationException, ValidationException {

        Validator<W4002CriteriaDomain> valid
            = new Validator<W4002CriteriaDomain>(w4002CriteriaDomain, "w4002CriteriaDomain");

        String[] properties = {
            "whCompCd",             // 3 or 5 digit + required
            "whCd",                 // required
            "trnsCd",               // required
            "containerSortingKey",  // required
            "shipperCd",            // 3 or 5 digit + required
            "customTimingTyp",      // required
            "containerLooseTyp",    // required
            "etd",                  // required
            "carrierCompCd",        // required
        };
        valid.isValidateProperties(properties, Eca0027Constants.SCREEN_ID_W4002);

        // If there is an error
        // エラーがある場合
        if (0 < valid.getErrList().size()) {
            throw new ValidationException(valid.getErrList());
        }
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * - Shipper authority check
     *     An argument Shipper of stgInstrDomain, check by calling W4001StgInstrService.validateConsistencyShipperAuth
     *
     * - Shipper権限チェック
     *    stgInstrDomainのShipperを引数に、W4001StgInstrService.validateConsistencyShipperAuthを呼び出してチェック
     * </pre>
     *
     *
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W4002CriteriaDomain w4002CriteriaDomain)
        throws GscmApplicationException, ApplicationException, ValidationException {

        List<MessageDomain> messageDomainList = new ArrayList<MessageDomain>();

        // If you do not have permission to update the input Shipper
        // 入力Shipperでの更新権限がない場合
        if (!w4001StgInstrService.validateConsistencyShipperAuth(w4002CriteriaDomain.getShipperCd())) {
            messageDomainList.add(new MessageDomain("w4002CriteriaDomain.shipperCd", GSCM_I0_0009, null));
        }

        // If there is an error
        // エラーがある場合
        if (0 < messageDomainList.size()) {
            throw new ValidationException(messageDomainList);
        }
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * - Past date Check
     *     Argument to the ETD of w4002CriteriaDomain, check by calling W4001StgInstrService.validateDatabaseAfterDateComp
     * - W / H Company, NEXUS W / H combination check
     *     Argument to W / H Company of w4002CriteriaDomain, the NEXUS W / H, and check by calling W4001StgInstrService.validateDatabaseWhCompanyWh
     * - Shipper existence check
     *     Argument to the shipper of w4002CriteriaDomain, check by calling W4001StgInstrService.validateDatabaseShipper
     * - Carrier existence check
     *     Argument to the carrier of w4002CriteriaDomain, check by calling W4001StgInstrService.validateDatabaseCarrie
     *
     * - 過去日チェック
     *    w4002CriteriaDomainのETDを引数に、W4001StgInstrService.validateDatabaseAfterDateCompを呼び出してチェック
     * - W/H Company、NEXUS W/H　組み合わせチェック
     *    w4002CriteriaDomainのW/H Company、NEXUS W/Hを引数に、W4001StgInstrService.validateDatabaseWhCompanyWhを呼び出してチェック
     * - Shipper存在チェック
     *    w4002CriteriaDomainのshipperを引数に、W4001StgInstrService.validateDatabaseShipperを呼び出してチェック
     * - Carrier存在チェック
     *    w4002CriteriaDomainのcarrierを引数に、W4001StgInstrService.validateDatabaseCarrierを呼び出してチェック
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W4002CriteriaDomain w4002CriteriaDomain)
        throws GscmApplicationException, ApplicationException, ValidationException {

        List<MessageDomain> messageDomainList = new ArrayList<MessageDomain>();

        // ETD is the case in the past day
        // ETDが過去日の場合
        if (
            !w4001StgInstrService.validateDatabaseAfterDateComp(w4002CriteriaDomain.getEtd(),
                w4002CriteriaDomain.getScreenDateFormat(), w4002CriteriaDomain.getShipperCd())
        )
        {
            Object[] params = {
                commonService.getResource(w4002CriteriaDomain.getLocale(), "label.etd")
            };
            messageDomainList.add(new MessageDomain("w4002CriteriaDomain.etd", NXS_E7_0070, params));
        }

        // When a combination W/H Company, of NEXUS W/H is not correct
        // W/H Company、NEXUS W/Hの組み合わせが正しくない場合
        if (!w4001StgInstrService.validateDatabaseWhCompanyWh(w4002CriteriaDomain.getWhCompCd(), w4002CriteriaDomain.getWhCd())) {
            Object[] params = {
                commonService.getResource(w4002CriteriaDomain.getLocale(), "label.whCompCd"),
                commonService.getResource(w4002CriteriaDomain.getLocale(), "label.whCd")
            };
            messageDomainList.add(new MessageDomain("w4002CriteriaDomain.whCompCd", GSCM_E0_0029, params));
            messageDomainList.add(new MessageDomain("w4002CriteriaDomain.whCd", null, null));
        }

        // If the Shipper does not exist
        // Shipperが存在しない場合
        if (!w4001StgInstrService.validateDatabaseShipper(w4002CriteriaDomain.getShipperCd())) {
            Object[] params = {
                commonService.getResource(w4002CriteriaDomain.getLocale(), "label.shipperCd")
            };
            messageDomainList.add(new MessageDomain("w4002CriteriaDomain.shipperCd", NXS_E7_0111, params));
        }

        // If the Carrier does not exist
        // Carrierが存在しない場合
        if (!w4001StgInstrService.validateDatabaseCarrier(w4002CriteriaDomain.getCarrierCompCd())) {
            Object[] params = {
                commonService.getResource(w4002CriteriaDomain.getLocale(), "label.carrierCompCd")
            };
            messageDomainList.add(new MessageDomain("w4002CriteriaDomain.carrierCompCd", NXS_E7_0113, params));
        }

        // If there is an error
        // エラーがある場合
        if (0 < messageDomainList.size()) {
            throw new ValidationException(messageDomainList);
        }
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * - No processing
     *
     * - 処理なし
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected Void callServices(W4002CriteriaDomain w4002CriteriaDomain)
        throws GscmApplicationException, ApplicationException {

        return null;
    }
}