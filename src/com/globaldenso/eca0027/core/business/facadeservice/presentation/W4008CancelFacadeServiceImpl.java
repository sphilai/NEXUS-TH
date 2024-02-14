/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0010;

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
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractTransactFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CheckUtil;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 * The Cancel service facade implementation class of Staging Actuality Register screen
 * <br />山作り実績Register画面のCancel facadeサービス実装クラスです。
 * <pre>
 * bean id:w4008CancelFacadeService
 * </pre>
 *
 * @author $Author: masaki_awata@dnitsol.com $
 * @version $Revision: 5446 $
 */
public class W4008CancelFacadeServiceImpl extends
    AbstractTransactFacadeService<Void, W4008UpdateDomain> {

    /**
     * Staging actuality service.
     */
    protected W4005StgActService w4005StgActService;

    /**
     * constructor.
     */
    public W4008CancelFacadeServiceImpl() {
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
     * - Lock & check Staging Actuality 
     *     An argument stgActDomain.stgActNo, check by calling W4005StgActService.validateDatabaseTtStgActOnRegister
     * - Lock & check palletize 
     *     An argument Main Mark of w4008UpdateDomain.w4008ListDomainList, check by calling W4005StgActService.validateDatabaseTtPltzOnRegisterUpdate
     * - Staging instruction existence check
     *     An staging instruction no of w4008UpdateDomain.w4008ListDomainList, check by calling W4005StgActService.validateDatabaseTtStgInstrOnRegisterUpdate
     *
     * - 山作り実績のロック&チェック
     *    stgActDomain.stgActNoを引数に、W4005StgActService.validateDatabaseTtStgActOnRegisterを呼び出してチェック
     * - パレタイズのロック&チェック
     *    w4008UpdateDomain.w4008ListDomainListのMain Markを引数に、W4005StgActService.validateDatabaseTtPltzOnRegisterUpdateを呼び出してチェック
     * - 荷揃え指示存在チェック
     *    w4008UpdateDomain.w4008ListDomainListのstgInstrNoを引数に、W4005StgActService.validateDatabaseTtStgInstrOnRegisterUpdateを呼び出してチェック
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

        // If staging actuality does not exist
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
            if (!w4005StgActService.validateDatabaseTtStgInstrOnRegisterUpdate(w4008CriteriaDomain.getStgActNo())) {
                messageDomainList.add(new MessageDomain(null, GSCM_E0_0010, null));
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
     * Call the service to cancel the Staging Actuality
     * <br />山作り実績をキャンセルするサービスを呼び出します。
     * <pre>
     * - The transfer of information to W4005StgActDomain stgActDomain than w4008UpdateDomain
     * - Cancellation of already created Staging Actuality 
     *     Call W4005StgActService.transactOnRegisterCancel an argument stgActDomain
     *
     * - w4008UpdateDomainよりW4005StgActDomain stgActDomainに情報を移送
     * - 作成済み山作り実績のキャンセル
     *       stgActDomainを引数にW4005StgActService.transactOnRegisterCancelの呼び出し
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected Void callServices(W4008UpdateDomain w4008UpdateDomain)
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

        // Service call
        // サービス呼び出し
        w4005StgActService.transactOnRegisterCancel(stgActDomain);

        return null;
    }
}
