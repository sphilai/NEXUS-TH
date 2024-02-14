/*\
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.job;

import com.globaldenso.ai.aijb.core.business.domain.JobInputDomain;
import com.globaldenso.ai.aijb.core.job.jobbase.ChildJobBase;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.service.ComnAuxService;

/**
 * Delete expired data job of JOB Class.
 * <br />不要データ削除スケジュールジョブ子ジョブクラス
 *
 * <pre>
 * </pre>
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class ECA0027T0100ChildJob01 extends ChildJobBase {

    /**
     * Delete expire data service.
     * <br />不要データ削除サービス
     */
    private ComnAuxService comnAuxService = null;

    /**
     *
     * constructor.
     * <br />デフォルトコンストラクタ。
     *
     */
    public ECA0027T0100ChildJob01(){
    }


    /**
     * Setter method for comnAuxService
     *
     * @param comnAuxService Set for comnAuxService
     */
    public void setComnAuxService(ComnAuxService comnAuxService) {
        this.comnAuxService = comnAuxService;
    }


    /**
     * {@inheritDoc}
     * @see com.globaldenso.ai.aijb.core.job.jobbase.ChildJobBase#preBizProc(JobInputDomain)
     */
    @Override
    public void preBizProc(JobInputDomain arg0) {
        // No Action
        // 処理なし
    }

    /**
     * {@inheritDoc}
     * @throws ApplicationException App Standard exceptions.<br/>アプリ基盤例外
     * @see com.globaldenso.ai.aijb.core.job.jobbase.ChildJobBase#mainBizProc(JobInputDomain)
     */
    @Override
    public void mainBizProc(JobInputDomain arg0) throws ApplicationException {
        this.comnAuxService.transactOnComnAux();
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.ai.aijb.core.job.jobbase.ChildJobBase#postBizProc(JobInputDomain)
     */
    @Override
    public void postBizProc(JobInputDomain arg0) {
        // No Action
        // 処理なし
    }

}
