/*
 * Project : NEXUS_EXPORT
 *
 * 更新日       更新者                  更新内容
 * 2014/01/01   DENSO IT SOLUTIONS      新規作成
 *
 * Copyright (c) 2017 DENSO CORPORATION. All rights reserved.
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
import com.globaldenso.eca0027.core.business.domain.WsB012ParamDomain;
import com.globaldenso.eca0027.core.business.domain.WsB012ResultDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.eca0027.core.common.util.XmlUtil;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.sun.jersey.api.client.GenericType;

/**
 * The implementation class for the Web Call Service (WSB012)
 * <br />Webサービス(WSB012)呼出しサービスの実装クラス。
 *
 * MGT575 ADD
 *
 * @author $Author: G453S402002 $
 * @version $Revision: 13653 $
 */
public class WsB012RestServiceImpl implements WsB012RestService {

    /**
      * common service
     * <br />共通サービス
     */
    private CommonService commonService;

    /**
     * constructor
     * <br />コンストラクタ。
     */
    public WsB012RestServiceImpl() {
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
     * @see com.globaldenso.eca0027.core.business.ws.WsB012RestService#checkEdiOdrEntry(java.lang.String, com.globaldenso.eca0027.core.business.domain.WsB012ParamDomain)
     */
    public WsB012ResultDomain checkEdiOdrEntry(String compCd, WsB012ParamDomain param) throws ApplicationException {

        // Set parameters.
        // パラメータを設定する
        String webServicePath = "wsB012";
        WebServiceCallerRestDomain wsCallerRestDomain
            = commonService.searchCigmaWebServiceCallerRestDomain(compCd, webServicePath);
        wsCallerRestDomain.setParamMap("param", XmlUtil.marshal(param));
        try {
            // Call a web service.
            // Webサービスを呼び出す
            WsB012ResultDomain wsB012ResultDomain
                = WebServiceCallerRest.put(wsCallerRestDomain, new GenericType<WsB012ResultDomain>(){});
            if (WS_RESULT_ERROR.equals(wsB012ResultDomain.getResultCode())) {
                if (!CollectionUtils.isEmpty(wsB012ResultDomain.getErrorList())) {
                    if (NXS_E1_0060.equals(wsB012ResultDomain.getErrorList().get(0).getErrorCode())) {
                        throw new GscmApplicationException(NXS_E1_0060);
                    }
                }
            }
            if (WS_RESULT_ERROR_SYSTEM.equals(wsB012ResultDomain.getResultCode())){
                throw new SystemException(NXS_E1_0058);
            }

            return wsB012ResultDomain;

        } catch (WebServiceCallerRestException e) {
            throw new SystemException(e);
        }
    }
}
