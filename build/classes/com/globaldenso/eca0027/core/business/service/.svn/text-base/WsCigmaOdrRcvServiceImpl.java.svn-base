/*
 * Project : NEXUS_CIGMA
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.JOBID;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PARAM_ADS;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.RECEVIVING_COMPANY_CODE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.REGISTNAME_CIGMA;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WEB_SERVICE_ID_WSB009;

import java.math.BigDecimal;

import org.apache.commons.lang.StringUtils;
import org.springframework.dao.DataIntegrityViolationException;

import com.globaldenso.ai.aijb.library.AijbLibraryException;
import com.globaldenso.ai.aijb.library.business.service.ResidentRequestjobFacadeService;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.ai.common.core.exception.IntegrationLayerException;
import com.globaldenso.eca0027.core.auto.business.domain.TtBatchReqParamDomain;
import com.globaldenso.eca0027.core.auto.business.service.TtBatchReqParamService;
import com.globaldenso.eca0027.core.business.domain.criteria.WsCigmaOdrRcvCriteriaDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.business.domain.AbstractDomain;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;

/**
 * Implementation class of service that provides the Customer Order Recieving function.
 * <br />
 * Customer Order Recieving機能を提供するサービスの実装クラスです。
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 10796 $
 */
public class WsCigmaOdrRcvServiceImpl implements WsCigmaOdrRcvService {

    /**
     * common services<br />
     * 共通サービス
     */
    protected CommonService commonService;
    
    /**
     * RequestjobFacadeService.
     */
    protected ResidentRequestjobFacadeService residentRequestjobFacadeService;
    
    
    /**
     * Field of TtBatchReqParamService.<br />
     * TtBatchReqParamServiceのフィールドです。
     */
    protected TtBatchReqParamService ttBatchReqParamService;
    
    /**
     * Job ID to dispatch the request<br />
     * リクエストをディスパッチするジョブID。
     * 
     * Default is ECA0027B0100. If you want to specify a different job ID will be DI from ApplicationContext for each country.
     * It does not change after instantiation.
     * デフォルトはECA0027B0100。別のジョブIDを指定する場合は各国用のApplicationContextからDIする。
     * インスタンス化後は変わらない。
     */
    protected String dispatchJobId = JOBID;
    
    /**
     * constructor.
     *
     */
    public WsCigmaOdrRcvServiceImpl() {
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
     * Setter method for residentRequestjobFacadeService.
     *
     * @param residentRequestjobFacadeService Set for residentRequestjobFacadeService
     */
    public void setResidentRequestjobFacadeService(ResidentRequestjobFacadeService residentRequestjobFacadeService) {
        this.residentRequestjobFacadeService = residentRequestjobFacadeService;
    }

    /**
     * Setter method for ttBatchReqParamService.
     *
     * @param ttBatchReqParamService Set for ttBatchReqParamService
     */
    public void setTtBatchReqParamService(
        TtBatchReqParamService ttBatchReqParamService) {
        this.ttBatchReqParamService = ttBatchReqParamService;
    }

    /**
     * Setter method for dispatchJobId.
     *
     * @param dispatchJobId Set for dispatchJobId
     */
    public void setDispatchJobId(String dispatchJobId) {
        this.dispatchJobId = dispatchJobId;
    }

    /**
     * {@inheritDoc}
     * @see WsCigmaOdrRcvService#createEdiOdrEntryJob(WsCigmaOdrRcvCriteriaDomain)
     */
    public void createEdiOdrEntryJob(WsCigmaOdrRcvCriteriaDomain criteria) 
        throws ApplicationException, GscmApplicationException, ValidationException {

        // Call job.
        // ジョブを呼び出す
        String queueId = null;
        try {
            queueId = residentRequestjobFacadeService.createRequest(dispatchJobId, REGISTNAME_CIGMA);
        } catch (AijbLibraryException e) {
            throw new ApplicationException(StringUtils.EMPTY);
        }
        if (null == queueId) {
            throw new ApplicationException(StringUtils.EMPTY);
        }
        try {
            // Job parameter(1st)
            // Jobへ引き渡すパラメータ登録(1件目)
            TtBatchReqParamDomain batchReq1ParamDomain = new TtBatchReqParamDomain();
            batchReq1ParamDomain.setRequestId(queueId);
            batchReq1ParamDomain.setParamNo(BigDecimal.valueOf(1));
            batchReq1ParamDomain.setParamNm(RECEVIVING_COMPANY_CODE);
            batchReq1ParamDomain.setParamVal(criteria.getReceivingCompanyCode());
            setCommonPropertyForRegist(batchReq1ParamDomain);
            ttBatchReqParamService.create(batchReq1ParamDomain);
            
            // Job parameter(2nd)
            // Jobへ引き渡すパラメータ登録(2件目)
            TtBatchReqParamDomain batchReq2ParamDomain = new TtBatchReqParamDomain();
            batchReq2ParamDomain.setRequestId(queueId);
            batchReq2ParamDomain.setParamNo(BigDecimal.valueOf(2));
            batchReq2ParamDomain.setParamNm(PARAM_ADS);
            batchReq2ParamDomain.setParamVal(criteria.getAds());
            setCommonPropertyForRegist(batchReq2ParamDomain);
            ttBatchReqParamService.create(batchReq2ParamDomain);
            
            // Job parameter(3rd)
            // Jobへ引き渡すパラメータ登録(3件目)
            if (!StringUtils.isEmpty(criteria.getCallerJobId())) {
                TtBatchReqParamDomain batchReq3ParamDomain = new TtBatchReqParamDomain();
                batchReq3ParamDomain.setRequestId(queueId);
                batchReq3ParamDomain.setParamNo(BigDecimal.valueOf(3));
                batchReq3ParamDomain.setParamNm("callerJobId");
                batchReq3ParamDomain.setParamVal(criteria.getCallerJobId());
                setCommonPropertyForRegist(batchReq3ParamDomain);
                ttBatchReqParamService.create(batchReq3ParamDomain);
            }

        } catch (IntegrationLayerException e) {
            if (e.getCause() instanceof DataIntegrityViolationException) {
                throw new GscmApplicationException(e.getCode());
            }
            throw new ApplicationException(StringUtils.EMPTY);
        }
    }
    
    /**
     * 
     * Set common property for CIGMA
     * 
     * @param domain target domain
     */
    protected void setCommonPropertyForRegist(AbstractDomain domain) {
        domain.setComCreateFuncId(WEB_SERVICE_ID_WSB009);
        domain.setComCreateUserId(REGISTNAME_CIGMA);
        domain.setComUpdateFuncId(WEB_SERVICE_ID_WSB009);
        domain.setComUpdateUserId(REGISTNAME_CIGMA);
    }
}
