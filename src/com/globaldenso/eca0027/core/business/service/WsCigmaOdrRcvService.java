/*
 * Project : NEXUS_CIGMA
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.criteria.WsCigmaOdrRcvCriteriaDomain;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;


/**
 * Interface of the service that provides the Customer Order Recieving function.
 * <br />Customer Order Recieving機能を提供するサービスのインタフェースです。
 * 
 * <pre>
 * bean id:WsCigmaOdrRcvService
 * </pre>
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public interface WsCigmaOdrRcvService {
    
    /**
     * Start the EDI Receive Order registration job.
     * <br />EDI受注登録ジョブを起動します。
     *
     * @param criteria Search conditions domain<br />
     * 検索条件ドメイン
     * @throws ApplicationException fail to start job<br />
     * ジョブの起動に失敗した場合
     * @throws GscmApplicationException GscmApplicationException
     * @throws ValidationException ValidationException
     */
    public void createEdiOdrEntryJob(WsCigmaOdrRcvCriteriaDomain criteria) throws ApplicationException, GscmApplicationException, ValidationException; 
}
