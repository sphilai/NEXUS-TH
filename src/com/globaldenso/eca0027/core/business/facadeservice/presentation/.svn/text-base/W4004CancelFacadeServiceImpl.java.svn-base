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
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractTransactFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 * The Cancel service facade implementation class of Staging Instruction Register screen
 * <br />荷揃え指示Register画面のCancel facadeサービス実装クラスです。
 * <pre>
 * bean id:w4004CancelFacadeService
 * </pre>
 *
 * @author $Author: masaki_awata@dnitsol.com $
 * @version $Revision: 5446 $
 */
public class W4004CancelFacadeServiceImpl extends
    AbstractTransactFacadeService<Void, W4004UpdateDomain> {

    /**
     * Staging instruction service.
     */
    protected W4001StgInstrService w4001StgInstrService;

    /**
     * constructor.
     */
    public W4004CancelFacadeServiceImpl() {
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
     *     An argument stgInstrDomain.stgInstrNo, check by calling W4001StgInstrService.validateDatabaseTtStgInstrOnRegisterCancel
     * - Lock & check palletizing 
     *     An argument main mark of stgInstrDomain.w4004ListDomainList,
     *     check by calling W4001StgInstrService.validateDatabaseTtPltzOnRegisterCancel
     *
     * - 荷揃え指示のロック&チェック
     *    stgInstrDomain.stgInstrNoを引数に、W4001StgInstrService.validateDatabaseTtStgInstrOnRegisterCancelを呼び出してチェック
     * - パレタイズのロック&チェック
     *    stgInstrDomain.w4004ListDomainListのメインマークを引数に、
     *    W4001StgInstrService.validateDatabaseTtPltzOnRegisterCancelを呼び出してチェック
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

        // If staging instruction does not exist
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
        messageId = w4001StgInstrService.validateDatabaseTtPltzOnRegisterCancel(mainMarkList, paramsList);
        // If palletize does not exist,
        // or palletize status is "20"(Staging instruction), "30"(Staging instruction worked done) other than
        // パレタイズが存在しない、
        // またはパレタイズステータスが"20"(荷揃え指示)、"30"(荷揃え実績)以外の場合
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
     * Call the service to cancel the Staging Instruction
     * <br />荷揃え指示をキャンセルするサービスを呼び出します。
     * <pre>
     * - The transfer of information to W4001StgInstrDomain stgInstrDomain than w4004UpdateDomain
     * - Cancellation of already created Staging Instruction 
     *     Call W4001StgInstrService.transactOnRegisterCancel an argument stgInstrDomain
     *
     * - w4004UpdateDomainよりW4001StgInstrDomain stgInstrDomainに情報を移送
     * - 作成済み荷揃え指示のキャンセル
     *       stgInstrDomainを引数にW4001StgInstrService.transactOnRegisterCancelの呼び出し
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected Void callServices(W4004UpdateDomain w4004UpdateDomain)
        throws GscmApplicationException, ApplicationException {

        // PL domain -> BL domain transfer
        // PLドメイン→BLドメイン移送
        W4001StgInstrDomain stgInstrDomain = new W4001StgInstrDomain();
        CommonUtil.copyPropertiesDomainToDomain(stgInstrDomain,
            w4004UpdateDomain.getW4004CriteriaDomain(), w4004UpdateDomain.getScreenDateFormat());

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

        // Service call
        // サービス呼び出し
        w4001StgInstrService.transactOnRegisterCancel(stgInstrDomain);

        return null;
    }
}
