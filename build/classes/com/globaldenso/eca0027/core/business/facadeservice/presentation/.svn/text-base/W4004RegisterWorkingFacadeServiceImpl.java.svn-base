/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0010;

import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W4001PltzDomain;
import com.globaldenso.eca0027.core.business.domain.W4001StgInstrDomain;
import com.globaldenso.eca0027.core.business.domain.W4004CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W4004ListDomain;
import com.globaldenso.eca0027.core.business.domain.W4004UpdateDomain;
import com.globaldenso.eca0027.core.business.service.W4001StgInstrService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractUpdateFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 * The Register Working service facade implementation class of Staging Instruction Register screen
 * <br />荷揃え指示Register画面のRegister Working facadeサービス実装クラスです。
 * <pre>
 * bean id:w4004RegisterWorkingFacadeService
 * </pre>
 *
 * @author $Author: masaki_awata@dnitsol.com $
 * @version $Revision: 5446 $
 */
public class W4004RegisterWorkingFacadeServiceImpl extends
    AbstractUpdateFacadeService<Integer, W4004UpdateDomain> {

    /**
     * Staging instruction service.
     */
    protected W4001StgInstrService w4001StgInstrService;

    /**
     * constructor.
     */
    public W4004RegisterWorkingFacadeServiceImpl() {
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
     * - Lock & check Staging Instruction 
     *     An argument Staging instr No of w4004UpdateDomain.w4004CriteriaDomain, check by calling W4001StgInstrService.validateDatabaseTtStgInstrOnRegisterWorking 
     * - Lock & check palletizing 
     *     An argument Main Mark of w4004UpdateDomain.w4004ListDomainList, check by calling W4001StgInstrService.validateDatabaseTtPltzOnRegisterWorking
     *
     * - 荷揃え指示のロック&チェック
     *    w4004UpdateDomain.w4004CriteriaDomainのStaging instr Noを引数に、W4001StgInstrService.validateDatabaseTtStgInstrOnRegisterWorkingを呼び出してチェック
     * - パレタイズのロック&チェック
     *    w4004UpdateDomain.w4004ListDomainListのMain Markを引数に、W4001StgInstrService.validateDatabaseTtPltzOnRegisterWorkingを呼び出してチェック
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

        // Staging instruction does not exist
        // 荷揃え指示が存在しない場合
        if (
            !w4001StgInstrService.validateDatabaseTtStgInstrOnRegister(
                w4004CriteriaDomain.getStgInstrNo())
        )
        {
            messageDomainList.add(new MessageDomain(null, GSCM_E0_0010, null));
        }

        // Palletize presence, palletizing status check
        // パレタイズ存在、パレタイズステータスチェック
        List<String> mainMarkList = new ArrayList<String>();
        for (W4004ListDomain w4004ListDomain : w4004UpdateDomain.getW4004ListDomainList()) {
            mainMarkList.add(w4004ListDomain.getMainMark());
        }
        paramsList = new ArrayList<String[]>();
        messageId = w4001StgInstrService.validateDatabaseTtPltzOnRegisterWorking(mainMarkList, paramsList);
        // If palletizing does not exist,
        // or palletizing status "20"(staging instruction) other than,
        // パレタイズが存在しない、
        // またはパレタイズステータスが"20"(荷揃え指示)以外の場合
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
     * Call the service to be updated to "Staging Instruction Acuality" the status of the Staging Instruction
     * <br />荷揃え指示のステータスを"出荷実績"に更新するサービスを呼び出します。
     * <pre>
     * - The transfer of information to W4001StgInstrDomain stgInstrDomain than w4004UpdateDomain
     * - Status updates of Staging Instruction 
     *     Call the W4001StgInstrService.updateOnRegisterWorking an argument stgInstrDomain
     *
     * - w4004UpdateDomainよりW4001StgInstrDomain stgInstrDomainに情報を移送
     * - 荷揃え指示のステータス更新
     *       stgInstrDomainを引数にW4001StgInstrService.updateOnRegisterWorkingの呼び出し
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected Integer callServices(W4004UpdateDomain w4004UpdateDomain)
        throws GscmApplicationException, ApplicationException {

        // PL domain -> BL domain transfer
        // PLドメイン→BLドメイン移送
        W4001StgInstrDomain stgInstrDomain = new W4001StgInstrDomain();
        CommonUtil.copyPropertiesDomainToDomain(stgInstrDomain,
            w4004UpdateDomain.getW4004CriteriaDomain(), w4004UpdateDomain.getScreenDateFormat());
        stgInstrDomain.setWorkedId(w4004UpdateDomain.getLoginUserDscId());
        stgInstrDomain.setWorkedIssuerNm(w4004UpdateDomain.getUserName());

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

        // Call update service
        // 更新サービス呼び出し
        int updateCount = w4001StgInstrService.updateOnRegisterWorking(stgInstrDomain);

        return updateCount;
    }
}
