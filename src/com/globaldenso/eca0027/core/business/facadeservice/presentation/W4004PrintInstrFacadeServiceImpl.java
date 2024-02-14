/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import java.io.File;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W4004CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W4001StgInstrCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W4001StgInstrService;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 * Staging Instruction form download facade service implementation class of Staging Instruction Register screen
 * <br />荷揃え指示Register画面のStaging Instruction帳票ダウンロードfacadeサービス実装クラスです。
 * <pre>
 * bean id:w4004PrintInstrFacadeService
 * </pre>
 *
 * @author $Author: masaki_awata@dnitsol.com $
 * @version $Revision: 5446 $
 */
public class W4004PrintInstrFacadeServiceImpl extends
    AbstractSearchFacadeService<File, W4004CriteriaDomain> {

    /**
     * Staging instruction service.
     */
    protected W4001StgInstrService w4001StgInstrService;

    /**
     * constructor.
     */
    public W4004PrintInstrFacadeServiceImpl() {
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
    protected W4004CriteriaDomain filterDomain(W4004CriteriaDomain w4004CriteriaDomain)
        throws GscmApplicationException, ApplicationException {

        return w4004CriteriaDomain;
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
    protected void validateItems(W4004CriteriaDomain w4004CriteriaDomain)
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
    protected void validateConsistency(W4004CriteriaDomain w4004CriteriaDomain)
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
    protected void validateDatabase(W4004CriteriaDomain w4004CriteriaDomain)
        throws GscmApplicationException, ApplicationException, ValidationException {
    }

    /**
     * {@inheritDoc}.
     * Call the service for which you want to create a PDF file of Staging Instruction form
     * <br />Staging Instruction帳票のPDFファイルを作成するサービスを呼び出します。
     * <pre>
     * - The transfer your search criteria in W4001StgInstrDomain stgInstrDomain than w4004CriteriaDomain
     * - Call of W4001StgInstrService.printStgInstr an argument stgInstrDomain
     * - Return the result of the call W4001StgInstrService.printStgInstr
     *
     * - w4004CriteriaDomainよりW4001StgInstrDomain stgInstrDomainに検索条件を移送
     * - stgInstrDomainを引数にW4001StgInstrService.printStgInstrの呼び出し
     * - W4001StgInstrService.printStgInstrの呼び出し結果を返却
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected File callServices(W4004CriteriaDomain w4004CriteriaDomain)
        throws GscmApplicationException, ApplicationException {

        // PL domain -> BL domain transfer
        // PLドメイン→BLドメイン移送
        W4001StgInstrCriteriaDomain stgInstrCriteriaDomain = new W4001StgInstrCriteriaDomain();
        CommonUtil.copyPropertiesDomainToDomain(stgInstrCriteriaDomain,
            w4004CriteriaDomain, w4004CriteriaDomain.getScreenDateFormat());

        // Call form generation service
        // 帳票生成サービス呼び出し
        File resultFile = w4001StgInstrService.printStgInstr(stgInstrCriteriaDomain);

        return resultFile;
    }
}
