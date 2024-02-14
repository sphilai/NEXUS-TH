/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.ws;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0058;
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
import com.globaldenso.eca0027.core.business.domain.Ws3002ParamDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.eca0027.core.common.util.XmlUtil;
import com.sun.jersey.api.client.GenericType;

/**
 * <p>Implementation class for Ws3002 Calling.</p>
 *
 * @author Thalerngsak.P
 * @version 1.00
 */
public class Ws3002RestServiceImpl implements Ws3002RestService {
    /**
     * common service
     */
    private CommonService commonService;
    
    /**
     * <p>TmCigmaEnvService</p>
     */
    private TmCigmaEnvService tmCigmaEnvService;

    /**
     * <p>Constractor</p>
     *
     */
    public Ws3002RestServiceImpl() {
    }
    /**
     * <p>commonService setter</p>
     *
     * @param commonService commonService set
     */
    public void setCommonService(CommonService commonService) {
        this.commonService = commonService;
    }

    /**
     * <p>tmCigmaEnvService setter</p>
     *
     * @param tmCigmaEnvService tmCigmaEnvService set
     */
    public void setTmCigmaEnvService(TmCigmaEnvService tmCigmaEnvService) {
        this.tmCigmaEnvService = tmCigmaEnvService;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.ws.Ws3002RestService#transactInvntryByCancel(java.lang.String, com.globaldenso.eca0027.core.business.domain.Ws3002ParamDomain)
     */
    public ResultDomain transactInvntryByCancel(String compCd,
        Ws3002ParamDomain ws3002Param) throws ApplicationException {
        
        String webServicePath = "ws3002";
        WebServiceCallerRestDomain wsCallerRestDomain = commonService
            .searchCigmaWebServiceCallerRestDomain(compCd, webServicePath);
        
        TmCigmaEnvCriteriaDomain criteria = new TmCigmaEnvCriteriaDomain();
        //criteria.setOwnerCompCd(compCd);
        criteria.setCompCd(compCd);
        TmCigmaEnvDomain result = tmCigmaEnvService.searchByKey(criteria);
        ws3002Param.setLibPgm(result.getLibPgm());
        ws3002Param.setJobDesc(result.getJobDescription());
        ws3002Param.setJobHost(result.getJobHost());
        ws3002Param.setJobUser(result.getJobUser());
        ws3002Param.setJobPassword(result.getJobPassword());
        
        wsCallerRestDomain.setParamMap("param", XmlUtil.marshal(ws3002Param));
        
        try {
            // Call Web Service Ws3002
            ResultDomain resultDomain
                = WebServiceCallerRest.post(wsCallerRestDomain, new GenericType<ResultDomain>(){});
            
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
