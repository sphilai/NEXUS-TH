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
import com.globaldenso.eca0027.core.business.domain.WsB006ParamDomain;
import com.globaldenso.eca0027.core.business.domain.WsB006ResultDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.eca0027.core.common.util.XmlUtil;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.sun.jersey.api.client.GenericType;

/**
 * The implementation class for the Web Call Service (WSB006)
 * <br />Webサービス(WSB006)呼出しサービスの実装クラスです。
 * 
 * @author $Author: 810833613 $
 * @version $Revision: 7053 $
 */
public class WsB006RestServiceImpl implements WsB006RestService {

    /**
      * common service
     * <br />共通サービス
     */
    private CommonService commonService;

    /**
     * constructor. 
     * <br />デフォルトコンストラクタです。
     */
    public WsB006RestServiceImpl() {
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
     * @see com.globaldenso.eca0027.core.business.ws.WsB006RestService#checkEdiOdrEntry(com.globaldenso.eca0027.core.business.domain.WsB006ParamDomain)
     */
    public WsB006ResultDomain checkEdiOdrEntry(WsB006ParamDomain param) throws ApplicationException {

        String webServicePath = "wsb006";
        WebServiceCallerRestDomain wsCallerRestDomain
            = commonService.searchCigmaWebServiceCallerRestDomain(param.getReceivingCompanyCode(), webServicePath);

        // パラメータを設定する
        wsCallerRestDomain.setParamMap("param", XmlUtil.marshal(param));
        
        try {
            // Webサービスを呼び出す
            WsB006ResultDomain wsB006ResultDomain
                = WebServiceCallerRest.put(wsCallerRestDomain, new GenericType<WsB006ResultDomain>(){});
            
            if (WS_RESULT_ERROR.equals(wsB006ResultDomain.getResultCode())) {
                if (!CollectionUtils.isEmpty(wsB006ResultDomain.getErrorList())) {
                    if (NXS_E1_0060.equals(wsB006ResultDomain.getErrorList().get(0).getErrorCode())) {
                        throw new GscmApplicationException(NXS_E1_0060);
                    }
                }
            }
            
            if (WS_RESULT_ERROR_SYSTEM.equals(wsB006ResultDomain.getResultCode())){
                throw new SystemException(NXS_E1_0058);
            }
            
            return wsB006ResultDomain;

        } catch (WebServiceCallerRestException e) {
            throw new SystemException(e);
        }
    }
}
