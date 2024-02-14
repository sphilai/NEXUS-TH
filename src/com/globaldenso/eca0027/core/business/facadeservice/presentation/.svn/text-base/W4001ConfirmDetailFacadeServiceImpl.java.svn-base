/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0004;

import java.util.Arrays;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W4001ListDomain;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractProcessFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CheckUtil;

/**
 * The Confirmation Detail facade service implementation class of Staging Instruction Main screen
 * <br />荷揃え指示Main画面のConfirm Detail facadeサービス実装クラスです。
 * <pre>
 * bean id:w4001ConfirmDetailFacadeService
 * </pre>
 *
 * @author $Author: masaki_awata@dnitsol.com $
 * @version $Revision: 4674 $
 */
public class W4001ConfirmDetailFacadeServiceImpl extends
    AbstractProcessFacadeService<Void, W4001ListDomain> {

    /**
     * Constructor.
     */
    public W4001ConfirmDetailFacadeServiceImpl() {
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * - Staging Instruction No. Mandatory check
     *     If not set, error-free specification selection
     *
     * - 荷揃え指示No.必須チェック
     *    設定なしの場合、明細選択なしのエラー
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W4001ListDomain filterDomain(W4001ListDomain w4001ListDomain)
        throws GscmApplicationException, ApplicationException {

        // When there is no line item selection
        // 明細行選択なしの場合
        if (CheckUtil.isBlankOrNull(w4001ListDomain.getStgInstrNo())) {
            List<MessageDomain> messageDomainList = Arrays.asList(new MessageDomain(null, NXS_E7_0004, null));
            throw new ValidationException(messageDomainList);
        }

        return w4001ListDomain;
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
    protected void validateItems(W4001ListDomain w4001ListDomain)
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
    protected void validateConsistency(W4001ListDomain w4001ListDomain)
        throws GscmApplicationException, ApplicationException, ValidationException {
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * - No processing
     * - 処理なし
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W4001ListDomain w4001ListDomain)
        throws GscmApplicationException, ApplicationException, ValidationException {
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * - No processing
     * - 処理なし
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected Void callServices(W4001ListDomain w4001ListDomain)
        throws GscmApplicationException, ApplicationException {

        return null;
    }
}
