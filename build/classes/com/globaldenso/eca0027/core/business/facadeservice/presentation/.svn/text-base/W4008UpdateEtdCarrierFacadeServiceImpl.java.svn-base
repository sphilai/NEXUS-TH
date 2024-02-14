/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0010;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0065;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0070;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0113;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W4008;

import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W4005PltzDomain;
import com.globaldenso.eca0027.core.business.domain.W4005StgActDomain;
import com.globaldenso.eca0027.core.business.domain.W4008CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W4008ListDomain;
import com.globaldenso.eca0027.core.business.domain.W4008UpdateDomain;
import com.globaldenso.eca0027.core.business.service.W4005StgActService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractUpdateFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CheckUtil;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.Validator;

/**
 * The Update ETD Carrier service facade implementation class of Staging Actuality Register screen
 * <br />山作り実績Register画面のUpdate ETD Carrier facadeサービス実装クラスです。
 * <pre>
 * bean id:w4008UpdateEtdCarrierFacadeService
 * </pre>
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 12961 $
 */
public class W4008UpdateEtdCarrierFacadeServiceImpl extends
    AbstractUpdateFacadeService<Integer, W4008UpdateDomain> {

    /**
     * Common service.
     */
    protected CommonService commonService;

    /**
     * Staging actuality service.
     */
    protected W4005StgActService w4005StgActService;

    /**
     * constructor.
     */
    public W4008UpdateEtdCarrierFacadeServiceImpl() {
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
     * Setter method for w4005StgActService.
     *
     * @param stgActService Set for w4005StgActService
     */
    public void setW4005StgActService(W4005StgActService stgActService) {
        w4005StgActService = stgActService;
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
    protected W4008UpdateDomain filterDomain(W4008UpdateDomain w4008UpdateDomain)
        throws GscmApplicationException, ApplicationException {

        return w4008UpdateDomain;
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * - No processing
     * - 処理なし
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W4008UpdateDomain w4008UpdateDomain)
        throws GscmApplicationException, ApplicationException, ValidationException {

        W4008CriteriaDomain w4008CriteriaDomain = w4008UpdateDomain.getW4008CriteriaDomain();
        w4008CriteriaDomain.setLanguageCd(w4008UpdateDomain.getLanguageCd());
        w4008CriteriaDomain.setLocale(w4008UpdateDomain.getLocale());
        w4008CriteriaDomain.setDateFormat(w4008UpdateDomain.getDateFormat());
        Validator<W4008CriteriaDomain> valid
            = new Validator<W4008CriteriaDomain>(w4008CriteriaDomain, "w4008CriteriaDomain");

        String[] properties = {
            "etd",
            "carrierCompCd",
            "trnsTypCd", // UT446 ADD
        };
        valid.isValidateProperties(properties, SCREEN_ID_W4008);

        // If there is an error
        // エラーがある場合
        if (0 < valid.getErrList().size()) {
            throw new ValidationException(valid.getErrList());
        }
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * - No processing
     * - 処理なし
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W4008UpdateDomain w4008UpdateDomain)
        throws GscmApplicationException, ApplicationException, ValidationException {
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * - Past date Check
     *     Argument to the ETD of w4008CriteriaDomain, check by calling W4005StgActService.validateDatabaseAfterDate
     * - Carrier existence check
     *     An argument Carrier of w4008UpdateDomain.w4008CriteriaDomain, check by calling W4005StgActService.validateDatabaseCarrier
     * - Lock & check Staging actuality 
     *     An argument Staging actuality No of w4008UpdateDomain.w4008CriteriaDomain, check by calling W4005StgInstrService.validateDatabaseTtStgActOnRegister
     * - Lock & check palletize 
     *     An argument Main Mark of w4008UpdateDomain.w4008ListDomainList, check by calling W4005StgActService.validateDatabaseTtPltzOnRegisterUpdate
     *
     * - 過去日チェック
     *    w4008CriteriaDomainのETDを引数に、W4005StgActService.validateDatabaseAfterDateを呼び出してチェック
     * - Carrier存在チェック
     *    w4008UpdateDomain.w4008CriteriaDomainのCarrierを引数に、W4005StgActService.validateDatabaseCarrierを呼び出してチェック
     * - 山作り実績のロック&チェック
     *    w4008UpdateDomain.w4008CriteriaDomainのStaging actuality Noを引数に、W4005StgInstrService.validateDatabaseTtStgActOnRegisterを呼び出してチェック
     * - パレタイズのロック&チェック
     *    w4008UpdateDomain.w4008ListDomainListのMain Markを引数に、W4005StgActService.validateDatabaseTtPltzOnRegisterUpdateを呼び出してチェック
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W4008UpdateDomain w4008UpdateDomain)
        throws GscmApplicationException, ApplicationException, ValidationException {

        List<MessageDomain> messageDomainList = new ArrayList<MessageDomain>();
        List<String[]> paramsList = null;
        String messageId = null;

        W4008CriteriaDomain w4008CriteriaDomain = w4008UpdateDomain.getW4008CriteriaDomain();

        // UT446 ADD START
        // If transportation type master does not exist
        // 輸送手段種別原単位が存在しない場合
        if (
            !w4005StgActService.validateDatabaseTmTrnsTyp(w4008CriteriaDomain.getTrnsCd(),
                w4008CriteriaDomain.getTrnsTypCd())
        )
        {
            Object[] params = {
                w4008CriteriaDomain.getTrnsCd(),
                w4008CriteriaDomain.getTrnsTypCd()
            };
            messageDomainList.add(new MessageDomain(null, NXS_E7_0065, params));
        }
        // UT446 ADD END

        // ETD is the case in the past day
        // ETDが過去日の場合
        if (!CheckUtil.isBlankOrNull(w4008CriteriaDomain.getEtd())) {
            if (
                !w4005StgActService.validateDatabaseAfterDate(w4008CriteriaDomain.getEtd(),
                    w4008UpdateDomain.getScreenDateFormat(), w4008UpdateDomain.getTimeZone())
            )
            {
                Object[] params = {
                    commonService.getResource(w4008UpdateDomain.getLocale(), "label.etd")
                };
                messageDomainList.add(new MessageDomain("w4008CriteriaDomain.etd", NXS_E7_0070, params));
            }
        }

        // If the Carrier does not exist
        // Carrierが存在しない場合
        if (!CheckUtil.isBlankOrNull(w4008CriteriaDomain.getCarrierCompCd())) {
            if (!w4005StgActService.validateDatabaseCarrier(w4008CriteriaDomain.getCarrierCompCd())) {
                Object[] params = {
                    commonService.getResource(w4008UpdateDomain.getLocale(), "label.carrierCompCd")
                };
                messageDomainList.add(new MessageDomain("w4008CriteriaDomain.carrierCompCd", NXS_E7_0113, params));
            }
        }

        // Staging actuality does not exist
        // 山作り実績が存在しない場合
        if (!w4005StgActService.validateDatabaseTtStgActOnRegister(w4008CriteriaDomain.getStgActNo())) {
            messageDomainList.add(new MessageDomain(null, GSCM_E0_0010, null));
        }

        paramsList = new ArrayList<String[]>();
        messageId = w4005StgActService
            .validateDatabaseTtPltzOnRegisterUpdate(w4008CriteriaDomain.getStgActNo(), paramsList);
        // If palletizing does not exist,
        // or palletizing status not "50"(Staging Actuality)
        // パレタイズが存在しない、
        // またはパレタイズステータスが"50"(山作り実績)以外の場合
        if (messageId != null) {
            for (String[] params : paramsList) {
                messageDomainList.add(new MessageDomain(null, messageId, params));
            }
        }

        // If there is an error
        // エラーがある場合
        if (0 < messageDomainList.size()) {
            throw new ValidationException(messageDomainList);
        }
    }

    /**
     * {@inheritDoc}.
     * Call the service to be updated to "Staging Actuality Acuality" the status of the Staging Actuality
     * <br />山作り実績のステータスを"出荷実績"に更新するサービスを呼び出します。
     * <pre>
     * - The transfer of information to W4005StgActDomain stgActDomain than w4008UpdateDomain
     * - Status updates of Staging Actuality 
     *     Call the W4005StgActService.updateOnRegisterUpdateEtdCarrier an argument stgActDomain
     *
     * - w4008UpdateDomainよりW4005StgActDomain stgActDomainに情報を移送
     * - 山作り実績のステータス更新
     *       stgActDomainを引数にW4005StgActService.updateOnRegisterUpdateEtdCarrierの呼び出し
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected Integer callServices(W4008UpdateDomain w4008UpdateDomain)
        throws GscmApplicationException, ApplicationException {

        // PL domain -> BL domain transfer
        // PLドメイン→BLドメイン移送
        W4005StgActDomain stgActDomain = new W4005StgActDomain();
        CommonUtil.copyPropertiesDomainToDomain(stgActDomain,
            w4008UpdateDomain.getW4008CriteriaDomain(), w4008UpdateDomain.getScreenDateFormat());

        List<W4005PltzDomain> w4005PltzDomainList = new ArrayList<W4005PltzDomain>();
        for (W4008ListDomain w4008ListDomain : w4008UpdateDomain.getW4008ListDomainList()) {
            // PL domain -> BL domain transfer
            // PLドメイン→BLドメイン移送
            W4005PltzDomain pltzDomain = new W4005PltzDomain();
            CommonUtil.copyPropertiesDomainToDomain(pltzDomain,
                w4008ListDomain, w4008UpdateDomain.getScreenDateFormat());
            w4005PltzDomainList.add(pltzDomain);
        }
        stgActDomain.setPltzDomainList(w4005PltzDomainList);

        // Call update service
        // 更新サービス呼び出し
        int updateCount = w4005StgActService.updateOnRegisterUpdateEtdCarrier(stgActDomain);

        return updateCount;
    }
}
