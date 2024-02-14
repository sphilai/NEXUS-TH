/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.ws;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0058;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0060;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_ERROR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_SUCCESS;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.ai.common.core.exception.SystemException;
import com.globaldenso.ai.library.webservicecallrest.WebServiceCallerRest;
import com.globaldenso.ai.library.webservicecallrest.domain.WebServiceCallerRestDomain;
import com.globaldenso.ai.library.webservicecallrest.exception.WebServiceCallerRestException;
import com.globaldenso.eca0027.core.auto.business.domain.TmCigmaEnvDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaEnvCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TmCigmaEnvService;
import com.globaldenso.eca0027.core.business.domain.ErrorListItemDomain;
import com.globaldenso.eca0027.core.business.domain.ErrorParamListItemDomain;
import com.globaldenso.eca0027.core.business.domain.ResultDomain;
import com.globaldenso.eca0027.core.business.domain.Ws3001ParamDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.eca0027.core.common.util.XmlUtil;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.sun.jersey.api.client.GenericType;

/**
 * Implement class of calling WebService(WS3001)
 * 
 * @author $Author: TIS Tanaka $
 * @version $Revision:  $
 */
public class Ws3001RestServiceImpl implements Ws3001RestService {
    /**
     * common service
     * <br />共通サービス
     */
    private CommonService commonService;
    
    /**
     * <p>フィールドの役割を記述してください。</p>
     */
    private TmCigmaEnvService tmCigmaEnvService;

    /**
     * <p>Default Constructor</p>
     */
    public Ws3001RestServiceImpl() {
    }

    /**
     * <p>commonService のセッターメソッドです。</p>
     *
     * @param commonService commonService に設定する
     */
    public void setCommonService(CommonService commonService) {
        this.commonService = commonService;
    }

    /**
     * <p>tmCigmaEnvService のセッターメソッドです。</p>
     *
     * @param tmCigmaEnvService tmCigmaEnvService に設定する
     */
    public void setTmCigmaEnvService(TmCigmaEnvService tmCigmaEnvService) {
        this.tmCigmaEnvService = tmCigmaEnvService;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.ws.Ws2005RestService#createRegisterInventoryTransaction(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.globaldenso.eca0027.core.business.domain.Ws3001ParamDomain)
     */
    public ResultDomain createRegisterInventoryTransaction(String compCd, Ws3001ParamDomain ws3001Param ) throws ApplicationException {
       
        String webServicePath = "ws3001";
        WebServiceCallerRestDomain wsCallerRestDomain = commonService
            .searchCigmaWebServiceCallerRestDomain(compCd, webServicePath);
        
        TmCigmaEnvCriteriaDomain criteria = new TmCigmaEnvCriteriaDomain();
        criteria.setCompCd(compCd);
        TmCigmaEnvDomain result = tmCigmaEnvService.searchByKey(criteria);
        ws3001Param.setLibPgm(result.getLibPgm());
        ws3001Param.setJobDesc(result.getJobDescription());
        ws3001Param.setJobHost(result.getJobHost());
        ws3001Param.setJobUser(result.getJobUser());
        ws3001Param.setJobPassword(result.getJobPassword());
        
        wsCallerRestDomain.setParamMap("param", XmlUtil.marshal(ws3001Param));
        
        try {
            // Call Web Service Ws3001
            ResultDomain resultDomain
                = WebServiceCallerRest.post(wsCallerRestDomain, new GenericType<ResultDomain>(){});
            //Check CIGMA status
            if (WS_RESULT_ERROR.equals(resultDomain.getResultCode())) {
                if (NXS_E1_0060.equals(resultDomain.getErrorList().get(0).getErrorCode())) {
                    throw new GscmApplicationException(NXS_E1_0060);
                }
            }
            
            if (!WS_RESULT_SUCCESS.equals(resultDomain.getResultCode())) {
                if (!CollectionUtils.isEmpty(resultDomain.getErrorList())) {
                    ErrorListItemDomain errorListItem = resultDomain.getErrorList().get(0);
                    
                    if (!CollectionUtils.isEmpty(errorListItem.getErrorParamList())) {
                        List<Object> params = new ArrayList<Object>();
                        for (ErrorParamListItemDomain param : errorListItem.getErrorParamList()) {
                            params.add(param.getParam());
                        }
                        throw new SystemException(errorListItem.getErrorCode(), params.toArray());
                    } else {
                        throw new SystemException(errorListItem.getErrorCode());
                    }
                } else {
                    throw new SystemException(NXS_E1_0058);
                }
            }

            return resultDomain;

        } catch (WebServiceCallerRestException e) {
            throw new SystemException(e);
        }
    }
}
