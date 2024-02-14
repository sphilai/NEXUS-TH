/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2017 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.job;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.globaldenso.ai.aijb.core.business.domain.JobManageDomain;
import com.globaldenso.ai.aijb.core.business.domain.QueueInfDomain;
import com.globaldenso.ai.aijb.core.job.jobbase.ResidentBizProcExecute;
import com.globaldenso.ai.aijb.library.business.service.MessageLogFacadeService;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.service.JbTransferToGinvService;

/**
 * This is the resident job for Transferring Shipping Documents to GINV.
 * <br />船積書類GINV送信常駐ジョブです。
 *
 * L005 ADD
 *
 * @author $Author: G453S402002 $
 * @version $Revision: 14033 $
 */
public class ECA0027T0500ResidentJob extends ResidentBizProcExecute {

    /**
     * Show Log
     */
    protected static final Log LOG = LogFactory.getLog(ECA0027T0500ResidentJob.class);

    /**
     * Transferring Shipping Documents to GINV service
     * <br />船積書類GINV送信サービス
     */
    protected JbTransferToGinvService jbTransferToGinvService;

    /**
     * A.I. Artificial Intelligence-JB message log registration parts
     * <br />AI-JB メッセージログ登録部品
     */
    protected MessageLogFacadeService messageLogFacadeService;

    /**
     * Constructor.
     */
    public ECA0027T0500ResidentJob() {
        super();
    }

    /**
     * Setter method for jbTransferToGinvService.
     *
     * @param jbTransferToGinvService Set for jbTransferToGinvService
     */
    public void setJbTransferToGinvService(
        JbTransferToGinvService jbTransferToGinvService) {
        this.jbTransferToGinvService = jbTransferToGinvService;
    }

    /**
     * Setter method for messageLogFacadeService.
     *
     * @param messageLogFacadeService Set for messageLogFacadeService
     */
    public void setMessageLogFacadeService(
        MessageLogFacadeService messageLogFacadeService) {
        this.messageLogFacadeService = messageLogFacadeService;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.ai.aijb.core.job.jobbase.ResidentBizProcExecute#jobCall(com.globaldenso.ai.aijb.core.business.domain.JobManageDomain, com.globaldenso.ai.aijb.core.business.domain.QueueInfDomain)
     */
    public boolean jobCall(JobManageDomain arg0, QueueInfDomain arg1) {

        try {
            jbTransferToGinvService.transactRequest(arg1);

        } catch (ApplicationException e) {
            LOG.error(e.getMessage(), e);
            // Message log registered at occurrence location.
            // メッセージログは発生箇所で登録。
            e.printStackTrace();

            return false;

        } catch (Exception e) {
            LOG.error("Unexpected error occurred.", e);
            // Message log: "An unexpected error has occurred."
            // メッセージログ: 「予期しないエラーが発生しました。」
            messageLogFacadeService.aijbCreateMessageLogFromQueue(arg1.getQueueId(),
                "ECA0027E10024", e, arg1.getJobId());
            e.printStackTrace();

            return false;
        }

        return true;
    }
}
