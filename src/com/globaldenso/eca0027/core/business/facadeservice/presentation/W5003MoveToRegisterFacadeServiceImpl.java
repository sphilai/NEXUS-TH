/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0004;

import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W5003CriteriaDomain;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractProcessFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;

/**
 * The Move to Register  service facade implementation class of Shipping Confirmation Create screen
 * <br />出荷確認Create画面のMove to Register facadeサービス実装クラスです。
 * <pre>
 * bean id:w5003MoveToRegisterFacadeService
 * </pre>
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W5003MoveToRegisterFacadeServiceImpl extends
    AbstractProcessFacadeService<Void, W5003CriteriaDomain> {

    /**
     * constructor.
     */
    public W5003MoveToRegisterFacadeServiceImpl() {
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * - Check that one of stgActNo or stgInstrNo is set
     *    If not set, any error of no specification selection
     *
     * - stgInstrNoおよび、stgActNoのいずれかが設定されていることをチェック
     *    いずれも設定なしの場合、明細選択なしのエラー
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W5003CriteriaDomain filterDomain(W5003CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {
        
        if (StringUtils.isEmpty(criteriaDomain.getRowNum())) {
            List<MessageDomain> errList = Arrays.asList(new MessageDomain("", NXS_E7_0004, null));
            throw new ValidationException(errList);
        }
        
        return criteriaDomain;
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * - No processing
     *
     * - 処理なし
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W5003CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException, ValidationException {
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * - No processing
     *
     * - 処理なし
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W5003CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException, ValidationException {
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * - No processing
     *
     * - 処理なし
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W5003CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException,
        ValidationException {
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
    protected Void callServices(W5003CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {

        return null;
    }
}
