/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0010;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0029;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0022;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0065;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0070;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0113;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W4008;

import java.util.ArrayList;
import java.util.HashSet;
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
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractTransactFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CheckUtil;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.Validator;

/**
 * The Register service facade implementation class of Staging Actuality Register screen
 * <br />山作り実績Register画面の登録facadeサービス実装クラスです。
 * <pre>
 * bean id:w4008RegisterFacadeService
 * </pre>
 *
 * @author $Author: G453S402002 $
 * @version $Revision: 13557 $
 */
public class W4008RegisterFacadeServiceImpl extends
    AbstractTransactFacadeService<String, W4008UpdateDomain> {

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
    public W4008RegisterFacadeServiceImpl() {
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
     * - Common error checking
     *
     * - 共通エラーチェック
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
            "etd",                  // not required
            "carrierCompCd",        // not required
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
     * - W / H Company, NEXUS W / H combination check
     *     An argument W/H Company、NEXUS W/H of w4008UpdateDomain.w4008CriteriaDomain, check by calling W4005StgActService.validateDatabaseWhCompanyWh
     * - Carrier existence check
     *     An argument Carrier of w4008UpdateDomain.w4008CriteriaDomain, check by calling W4005StgActService.validateDatabaseCarrier
     * - Lock & check palletize 
     *     An argument Main Mark of w4008UpdateDomain.w4008ListDomainList, check by calling W4005StgActService.validateDatabaseTtPltzOnRegister 
     * - Check palletize staging instruction unit
     *     An argument LoginUserDscId of w4008UpdateDomain, check by calling W4005StgActService.validateDatabaseTtPltzOnRegisterByStgInstr
     * - Staging instruction existence check
     *     An staging instruction no of w4008UpdateDomain.w4008ListDomainList, check by calling W4005StgActService.validateDatabaseTtStgInstrOnRegister
     *
     * - 過去日チェック
     *    w4008CriteriaDomainのETDを引数に、W4005StgActService.validateDatabaseAfterDateを呼び出してチェック
     * - W/H Company、NEXUS W/H　組み合わせチェック
     *    w4008UpdateDomain.w4008CriteriaDomainのW/H Company、NEXUS W/Hを引数に、W4005StgActService.validateDatabaseWhCompanyWhを呼び出してチェック
     * - Carrier存在チェック
     *    w4008UpdateDomain.w4008CriteriaDomainのCarrierを引数に、W4005StgActService.validateDatabaseCarrierを呼び出してチェック
     * - パレタイズのロック&チェック
     *    w4008UpdateDomain.w4008ListDomainListのMain Markを引数に、W4005StgActService.validateDatabaseTtPltzOnRegisterを呼び出してチェック
     * - 荷揃え指示単位のチェック
     *    w4008UpdateDomainのLoginUserDscIdを引数に、W4005StgActService.validateDatabaseTtPltzOnRegisterByStgInstrを呼び出してチェック
     * - 荷揃え指示存在チェック
     *    w4008UpdateDomain.w4008ListDomainListのstgInstrNoを引数に、W4005StgActService.validateDatabaseTtStgInstrOnRegisterを呼び出してチェック
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

        // When a combination W / H Company, of NEXUS W / H is not correct
        // W/H Company、NEXUS W/Hの組み合わせが正しくない場合
        if (!w4005StgActService.validateDatabaseWhCompanyWh(w4008CriteriaDomain.getWhCompCd(), w4008CriteriaDomain.getWhCd())) {
            Object[] params = {
                commonService.getResource(w4008UpdateDomain.getLocale(), "label.whCompCd"),
                commonService.getResource(w4008UpdateDomain.getLocale(), "label.whCd")
            };
            messageDomainList.add(new MessageDomain("w4008CriteriaDomain.whCompCd", GSCM_E0_0029, params));
            messageDomainList.add(new MessageDomain("w4008CriteriaDomain.whCd", null, null));
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

        // Palletize presence, palletizing status, last TR status check
        // パレタイズ存在、パレタイズステータス、搬出入ステータスチェック
        List<W4005PltzDomain> pltzDomainList = new ArrayList<W4005PltzDomain>();
        for (W4008ListDomain w4008ListDomain : w4008UpdateDomain.getW4008ListDomainList()) {
            W4005PltzDomain w4005PltzDomain = new W4005PltzDomain();
            w4005PltzDomain.setMainMarkOrXmainMark(w4008ListDomain.getMainMarkOrXmainMark());
            w4005PltzDomain.setMainMarkTyp(w4008ListDomain.getMainMarkTyp());
            pltzDomainList.add(w4005PltzDomain);
        }
        paramsList = new ArrayList<String[]>();
        messageId = w4005StgActService.validateDatabaseTtPltzOnRegister(pltzDomainList, paramsList);
        // If palletizing does not exist,
        // or palletizing status not possible staging instruction worked done,
        // or last TR status is not "10"(Blank) or "40"(Received at To)
        // パレタイズが存在しない、
        // またはパレタイズステータスが荷揃え実績不可能なもの、
        // または搬出入ステータスが"10"(ブランク)、"40"(受入)以外の場合
        if (messageId != null) {
            for (String[] params : paramsList) {
                messageDomainList.add(new MessageDomain(null, messageId, params));
            }
        }

        // If there are staging instructions unselected
        // 未選択の荷揃え指示がある場合
        if (!w4005StgActService.validateDatabaseTtPltzOnRegisterByStgInstr(w4008UpdateDomain.getLoginUserDscId())) {
            messageDomainList.add(new MessageDomain(null, NXS_E1_0022, null));
        }

        // Staging instruction presence check
        // 荷揃え指示存在チェック
        HashSet<String> stgInstrNoSet = new HashSet<String>();
        for (W4008ListDomain w4008ListDomain : w4008UpdateDomain.getW4008ListDomainList()) {
            if (!CheckUtil.isBlankOrNull(w4008ListDomain.getStgInstrNo())) {
                stgInstrNoSet.add(w4008ListDomain.getStgInstrNo());
            }
        }
        if (0 < stgInstrNoSet.size()) {
            // If staging instruction does not exist
            // 荷揃え指示が存在しない場合
            if (!w4005StgActService.validateDatabaseTtStgInstrOnRegister(new ArrayList<String>(stgInstrNoSet))) {
                messageDomainList.add(new MessageDomain(null, GSCM_E0_0010, null));
            }
        }

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

        // If there is an error
        // エラーがある場合
        if (0 < messageDomainList.size()) {
            throw new ValidationException(messageDomainList);
        }
    }

    /**
     * {@inheritDoc}.
     * Call the service to register formally Staging Actuality being created
     * <br />作成中の山作り実績を正式に登録するサービスを呼び出します。
     * <pre>
     * - The transfer of information to W4005StgActDomain stgActDomain than w4008UpdateDomain
     * - Staging Actuality and registration
     *     Call the W4005StgActService.transactOnRegister an argument stgActDomain
     *
     * - w4008UpdateDomainよりW4005StgActDomain stgActDomainに情報を移送
     * - 山作り実績登録
     *     stgActDomainを引数にW4005StgActService.transactOnRegisterの呼び出し
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected String callServices(W4008UpdateDomain w4008UpdateDomain)
        throws GscmApplicationException, ApplicationException {

        // PL domain -> BL domain transfer
        // PLドメイン→BLドメイン移送
        W4005StgActDomain stgActDomain = new W4005StgActDomain();
        CommonUtil.copyPropertiesDomainToDomain(stgActDomain,
            w4008UpdateDomain.getW4008CriteriaDomain(), w4008UpdateDomain.getScreenDateFormat());
        stgActDomain.setStgActIssuerId(w4008UpdateDomain.getLoginUserDscId());
        stgActDomain.setStgActIssuerNm(w4008UpdateDomain.getUserName());

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

        // Call registration service
        // 登録サービス呼び出し
        String stgActNo = w4005StgActService.transactOnRegister(stgActDomain);

        return stgActNo;
    }
}
