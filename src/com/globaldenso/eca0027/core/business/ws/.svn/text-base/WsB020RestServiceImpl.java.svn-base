/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.ws;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0058;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_ERROR_SYSTEM;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_SUCCESS;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.ai.common.core.exception.SystemException;
import com.globaldenso.ai.library.webservicecallrest.WebServiceCallerRest;
import com.globaldenso.ai.library.webservicecallrest.domain.WebServiceCallerRestDomain;
import com.globaldenso.ai.library.webservicecallrest.exception.WebServiceCallerRestException;
import com.globaldenso.eca0027.core.business.domain.ErrorListItemDomain;
import com.globaldenso.eca0027.core.business.domain.ErrorParamListItemDomain;
import com.globaldenso.eca0027.core.business.domain.ResultDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.sun.jersey.api.client.GenericType;

/**
 * The implementation class for the Web Call Service (WSB020)
 * <br />Webサービス(WSB020)呼出しサービスの実装クラスです。
 * 
 * @author $Author: masaki_awata@dnitsol.com $
 * @version $Revision: 9946 $
 */
public class WsB020RestServiceImpl implements WsB020RestService {

    /**
     * common service
     * <br />共通サービス
     */
    private CommonService commonService;

    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public WsB020RestServiceImpl() {
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
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.ws.WsB020RestService#updateEdiRcvOdrStatus(java.lang.String, java.lang.String)
     */
    public ResultDomain updateEdiRcvOdrStatus(String rcvOdrCompCd, String jobStatus, String callerJobId)
        throws ApplicationException {

        String webServicePath = "wsb020";
        WebServiceCallerRestDomain wsCallerRestDomain
            = commonService.searchCigmaWebServiceCallerRestDomain(rcvOdrCompCd, webServicePath);

        // A parameter is set.
        // パラメータを設定する
        wsCallerRestDomain.setParamMap("jobStatus", jobStatus);
        wsCallerRestDomain.setParamMap("callerJobId", callerJobId);

        try {
            // call about Web service.
            // Webサービスを呼び出す
            ResultDomain resultDomain
                = WebServiceCallerRest.put(wsCallerRestDomain, new GenericType<ResultDomain>(){});
            
            if (!WS_RESULT_SUCCESS.equals(resultDomain.getResultCode())) {
                if (WS_RESULT_ERROR_SYSTEM.equals(resultDomain.getResultCode())) {
                    throw new SystemException(NXS_E1_0058);
                } else {
                    if (!CollectionUtils.isEmpty(resultDomain.getErrorList())) {
                        ErrorListItemDomain errorListItem = resultDomain.getErrorList().get(0);
                        
                        if (!CollectionUtils.isEmpty(errorListItem.getErrorParamList())) {
                            List<Object> params = new ArrayList<Object>();
                            for (ErrorParamListItemDomain param : errorListItem.getErrorParamList()) {
                                params.add(param.getParam());
                            }
                            throw new GscmApplicationException(errorListItem.getErrorCode(), params.toArray());
                        } else {
                            throw new GscmApplicationException(errorListItem.getErrorCode());
                        }
                    } else {
                        throw new SystemException(NXS_E1_0058);
                    }
                }
            }
            
            return resultDomain;

        } catch (WebServiceCallerRestException e) {
            throw new SystemException(e);
        }
    }
}
