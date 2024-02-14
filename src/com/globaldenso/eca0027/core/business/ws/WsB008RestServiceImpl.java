/*
 * Project : NEXUS_EXPORT
 *
 * 更新日       更新者                  更新内容
 * 2014/01/01   DENSO IT SOLUTIONS      新規作成
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.ws;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0058;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0060;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_ERROR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_ERROR_SYSTEM;

import org.apache.commons.collections.CollectionUtils;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.ai.common.core.exception.SystemException;
import com.globaldenso.ai.library.webservicecallrest.WebServiceCallerRest;
import com.globaldenso.ai.library.webservicecallrest.domain.WebServiceCallerRestDomain;
import com.globaldenso.ai.library.webservicecallrest.exception.WebServiceCallerRestException;
import com.globaldenso.eca0027.core.business.domain.WsB008ResultDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.sun.jersey.api.client.GenericType;

/**
 * The implementation class for the Web Call Service (WSB008)
 * <br />Webサービス(WSB008)呼出しサービスの実装クラスです。
 * 
 * @author $Author: masaki_awata@dnitsol.com $
 * @version $Revision: 9946 $
 */
public class WsB008RestServiceImpl implements WsB008RestService {

    /**
     * common service
     * <br />共通サービス
     */
    private CommonService commonService;

    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public WsB008RestServiceImpl() {
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
     * @see com.globaldenso.eca0027.core.business.ws.WsB008RestService#getEdiOdrLincData(java.lang.String, java.lang.String)
     */
    public WsB008ResultDomain getEdiOdrLincData(String receivingCompanyCode, String newLincSubsidiaryCode, String callerJobId)
        throws ApplicationException {

        String webServicePath = "wsb008";
        WebServiceCallerRestDomain wsCallerRestDomain
            = commonService.searchCigmaWebServiceCallerRestDomain(receivingCompanyCode, webServicePath);

        // パラメータを設定する
        wsCallerRestDomain.setParamMap("receivingCompanyCode", receivingCompanyCode);
        wsCallerRestDomain.setParamMap("newLincSubsidiaryCode", newLincSubsidiaryCode);
        wsCallerRestDomain.setParamMap("callerJobId", callerJobId);

        try {
            // Webサービスを呼び出す
            WsB008ResultDomain wsB008ResultDomain
                = WebServiceCallerRest.get(wsCallerRestDomain, new GenericType<WsB008ResultDomain>(){});
            
            if (WS_RESULT_ERROR.equals(wsB008ResultDomain.getResultCode())) {
                if (!CollectionUtils.isEmpty(wsB008ResultDomain.getErrorList())) {
                    if (NXS_E1_0060.equals(wsB008ResultDomain.getErrorList().get(0).getErrorCode())) {
                        throw new GscmApplicationException(NXS_E1_0060);
                    }
                }
            }
            
            if (WS_RESULT_ERROR_SYSTEM.equals(wsB008ResultDomain.getResultCode())){
                throw new SystemException(NXS_E1_0058);
            }
            
            return wsB008ResultDomain;

        } catch (WebServiceCallerRestException e) {
            throw new SystemException(e);
        }
    }
}
