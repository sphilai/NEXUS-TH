/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0029;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0111;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0113;

import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W4001PltzDomain;
import com.globaldenso.eca0027.core.business.domain.W4001StgInstrDomain;
import com.globaldenso.eca0027.core.business.domain.W4004CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W4004ListDomain;
import com.globaldenso.eca0027.core.business.domain.W4004UpdateDomain;
import com.globaldenso.eca0027.core.business.service.W4001StgInstrService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractTransactFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 * The Register service facade implementation class of Staging Instruction Register screen
 * <br />荷揃え指示Register画面の登録facadeサービス実装クラスです。
 * <pre>
 * bean id:w4004RegisterFacadeService
 * </pre>
 *
 * @author $Author: masaki_awata@dnitsol.com $
 * @version $Revision: 5446 $
 */
public class W4004RegisterFacadeServiceImpl extends
    AbstractTransactFacadeService<String, W4004UpdateDomain> {

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
    public W4004RegisterFacadeServiceImpl() {
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
    protected W4004UpdateDomain filterDomain(W4004UpdateDomain w4004UpdateDomain)
        throws GscmApplicationException, ApplicationException {

        return w4004UpdateDomain;
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
    protected void validateItems(W4004UpdateDomain w4004UpdateDomain)
        throws GscmApplicationException, ApplicationException, ValidationException {
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
    protected void validateConsistency(W4004UpdateDomain w4004UpdateDomain)
        throws GscmApplicationException, ApplicationException, ValidationException {
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * - W / H Company, NEXUS W / H combination check
     *     An argument W/H Company、NEXUS W/H of w4004UpdateDomain.w4004CriteriaDomain, check by calling W4001StgInstrService.validateDatabaseWhCompanyWh
     * - Shipper existence check
     *     An argument Shipper of w4004UpdateDomain.w4004CriteriaDomain, check by calling W4001StgInstrService.validateDatabaseShipper
     * - Carrier existence check
     *     An argument Carrier of w4004UpdateDomain.w4004CriteriaDomain, check by calling W4001StgInstrService.validateDatabaseCarrier
     * - Lock & check palletize 
     *     An argument Main Mark of w4004UpdateDomain.w4004ListDomainList, check by calling W4001StgInstrService.validateDatabaseTtPltzOnRegister 
     * - Check palletize export request unit 
     *     An argument LoginUserDscId of w4004UpdateDomain, check by calling W4001StgInstrService.validateDatabaseTtPltzOnRegisterByExpReq
     *
     * - W/H Company、NEXUS W/H　組み合わせチェック
     *    w4004UpdateDomain.w4004CriteriaDomainのW/H Company、NEXUS W/Hを引数に、W4001StgInstrService.validateDatabaseWhCompanyWhを呼び出してチェック
     * - Shipper存在チェック
     *    w4004UpdateDomain.w4004CriteriaDomainのShipperを引数に、W4001StgInstrService.validateDatabaseShipperを呼び出してチェック
     * - Carrier存在チェック
     *    w4004UpdateDomain.w4004CriteriaDomainのCarrierを引数に、W4001StgInstrService.validateDatabaseCarrierを呼び出してチェック
     * - パレタイズのロック&チェック
     *    w4004UpdateDomain.w4004ListDomainListのMain Markを引数に、W4001StgInstrService.validateDatabaseTtPltzOnRegisterを呼び出してチェック
     * - パレタイズ輸出依頼単位のチェック
     *    w4004UpdateDomainのLoginUserDscIdを引数に、W4001StgInstrService.validateDatabaseTtPltzOnRegisterByExpReqを呼び出してチェック
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W4004UpdateDomain w4004UpdateDomain)
        throws GscmApplicationException, ApplicationException, ValidationException {

        List<MessageDomain> messageDomainList = new ArrayList<MessageDomain>();
        List<String[]> paramsList = null;
        String messageId = null;

        W4004CriteriaDomain w4004CriteriaDomain = w4004UpdateDomain.getW4004CriteriaDomain();

        // When a combination W / H Company, of NEXUS W / H is not correct
        // W/H Company、NEXUS W/Hの組み合わせが正しくない場合
        if (!w4001StgInstrService.validateDatabaseWhCompanyWh(w4004CriteriaDomain.getWhCompCd(), w4004CriteriaDomain.getWhCd())) {
            Object[] params = {
                commonService.getResource(w4004UpdateDomain.getLocale(), "label.whCompCd"),
                commonService.getResource(w4004UpdateDomain.getLocale(), "label.whCd")
            };
            messageDomainList.add(new MessageDomain("w4004CriteriaDomain.whCompCd", GSCM_E0_0029, params));
            messageDomainList.add(new MessageDomain("w4004CriteriaDomain.whCd", null, null));
        }

        // If the Shipper does not exist
        // Shipperが存在しない場合
        if (!w4001StgInstrService.validateDatabaseShipper(w4004CriteriaDomain.getShipperCd())) {
            Object[] params = {
                commonService.getResource(w4004UpdateDomain.getLocale(), "label.shipperCd")
            };
            messageDomainList.add(new MessageDomain("w4004CriteriaDomain.shipperCd", NXS_E7_0111, params));
        }

        // If the Carrier does not exist
        // Carrierが存在しない場合
        if (!w4001StgInstrService.validateDatabaseCarrier(w4004CriteriaDomain.getCarrierCompCd())) {
            Object[] params = {
                commonService.getResource(w4004UpdateDomain.getLocale(), "label.carrierCompCd")
            };
            messageDomainList.add(new MessageDomain("w4004CriteriaDomain.carrierCompCd", NXS_E7_0113, params));
        }

        // Palletize presence, palletizing status, last TR status check
        // パレタイズ存在、パレタイズステータス、搬出入ステータスチェック
        List<String> mainMarkList = new ArrayList<String>();
        for (W4004ListDomain w4004ListDomain : w4004UpdateDomain.getW4004ListDomainList()) {
            mainMarkList.add(w4004ListDomain.getMainMark());
        }
        paramsList = new ArrayList<String[]>();
        messageId = w4001StgInstrService.validateDatabaseTtPltzOnRegister(mainMarkList, paramsList);
        // If palletizing does not exist,
        // or palletizing status "10"(palletize) other than,
        // or last TR status is "20"(Issue TR)
        // パレタイズが存在しない、
        // またはパレタイズステータスが"10"(パレタイズ)以外、
        // または搬出入ステータスが"20"(送荷書発行)の場合
        if (messageId != null) {
            for (String[] params : paramsList) {
                messageDomainList.add(new MessageDomain(null, messageId, params));
            }
        }

        // Export request unit check
        // 輸出依頼単位チェック
        paramsList = new ArrayList<String[]>();
        messageId = w4001StgInstrService.validateDatabaseTtPltzOnRegisterByExpReq(w4004UpdateDomain.getLoginUserDscId(),
            paramsList);
        // If there are issues of CML way,
        // or in the case of Partial shipments NG
        // CML発行途中のものがある場合、
        // または分割船積NGの場合
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
     * Call the service to register formally Staging Instruction being created
     * <br />作成中の荷揃え指示を正式に登録するサービスを呼び出します。
     * <pre>
     * - The transfer of information to W4001StgInstrDomain stgInstrDomain than w4004UpdateDomain
     * - Staging Instruction and registration
     *     Call the W4001StgInstrService.transactOnRegister an argument stgInstrDomain
     *
     * - w4004UpdateDomainよりW4001StgInstrDomain stgInstrDomainに情報を移送
     * - 荷揃え指示登録
     *     stgInstrDomainを引数にW4001StgInstrService.transactOnRegisterの呼び出し
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected String callServices(W4004UpdateDomain w4004UpdateDomain)
        throws GscmApplicationException, ApplicationException {

        // PL domain -> BL domain transfer
        // PLドメイン→BLドメイン移送
        W4001StgInstrDomain stgInstrDomain = new W4001StgInstrDomain();
        CommonUtil.copyPropertiesDomainToDomain(stgInstrDomain,
            w4004UpdateDomain.getW4004CriteriaDomain(), w4004UpdateDomain.getScreenDateFormat());
        stgInstrDomain.setStgInstrIssuerId(w4004UpdateDomain.getLoginUserDscId());
        stgInstrDomain.setStgInstrIssuerNm(w4004UpdateDomain.getUserName());

        List<W4001PltzDomain> w4001PltzDomainList = new ArrayList<W4001PltzDomain>();
        for (W4004ListDomain w4004ListDomain : w4004UpdateDomain.getW4004ListDomainList()) {
            // PL domain -> BL domain transfer
            // PLドメイン→BLドメイン移送
            W4001PltzDomain pltzDomain = new W4001PltzDomain();
            CommonUtil.copyPropertiesDomainToDomain(pltzDomain,
                w4004ListDomain, w4004UpdateDomain.getScreenDateFormat());
            w4001PltzDomainList.add(pltzDomain);
        }
        stgInstrDomain.setPltzDomainList(w4001PltzDomainList);

        // Call registration service
        // 登録サービス呼び出し
        String stgInstrNo = w4001StgInstrService.transactOnRegister(stgInstrDomain);

        return stgInstrNo;
    }
}
