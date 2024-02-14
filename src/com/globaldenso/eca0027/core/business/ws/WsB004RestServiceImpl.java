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
import com.globaldenso.eca0027.core.business.domain.WsB004ResultDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.sun.jersey.api.client.GenericType;

/**
 * The implementation class for the Web Call Service (WSB004) <br />
 * Webサービス(WSB004)呼出しサービスの実装クラスです。
 * 
 * @author $Author: 810833613 $
 * @version $Revision: 7053 $
 */
public class WsB004RestServiceImpl implements WsB004RestService {

    /**
     * common service <br />
     * 共通サービス
     */
    private CommonService commonService;

    /**
     * constructor.  <br />
     * デフォルトコンストラクタです。
     */
    public WsB004RestServiceImpl() {
    }

    /**
     * Setter method for commonService <br />
     * commonService のセッターメソッドです。
     *
     * @param commonService - set to commonService
     */
    public void setCommonService(CommonService commonService) {
        this.commonService = commonService;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.ws.WsB004RestService#searchEdiOdrLastDigChgCandidate(String, String)
     */
    public WsB004ResultDomain searchEdiOdrLastDigChgCandidate(String compCd, String partNo)
        throws ApplicationException {

        String webServicePath = "wsb004";
        WebServiceCallerRestDomain wsCallerRestDomain
            = commonService.searchCigmaWebServiceCallerRestDomain(compCd, webServicePath);

        // パラメータを設定する
        wsCallerRestDomain.setParamMap("partNo", partNo);

        try {
            // Webサービスを呼び出す
            WsB004ResultDomain wsB004ResultDomain
                = WebServiceCallerRest.get(wsCallerRestDomain, new GenericType<WsB004ResultDomain>(){});
            
            if (WS_RESULT_ERROR.equals(wsB004ResultDomain.getResultCode())) {
                if (!CollectionUtils.isEmpty(wsB004ResultDomain.getErrorList())) {
                    if (NXS_E1_0060.equals(wsB004ResultDomain.getErrorList().get(0).getErrorCode())) {
                        throw new GscmApplicationException(NXS_E1_0060);
                    }
                }
            }
            
            if (WS_RESULT_ERROR_SYSTEM.equals(wsB004ResultDomain.getResultCode())){
                throw new SystemException(NXS_E1_0058);
            }
            
            return wsB004ResultDomain;

        } catch (WebServiceCallerRestException e) {
            throw new SystemException(e);
        }
    }
}