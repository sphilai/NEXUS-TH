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
import com.globaldenso.eca0027.core.business.domain.WsB010ResultDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.sun.jersey.api.client.GenericType;

/**
 * The implementation class for the Web Call Service (WsB010) <br />
 * Webサービス(WsB010)呼出しサービスの実装クラスです。
 * 
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class WsB010RestServiceImpl implements WsB010RestService {

    /**
     * common service <br />
     * 共通サービス
     */
    private CommonService commonService;

    /**
     * constructor. <br />
     * デフォルトコンストラクタです。
     */
    public WsB010RestServiceImpl() {
    }

    /**
     * Setter method for commonService. <br />
     * commonService のセッターメソッドです。
     *
     * @param commonService - Set to commonService
     */
    public void setCommonService(CommonService commonService) {
        this.commonService = commonService;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.ws.WsB010RestService#getCusSubInfo(java.lang.String, java.lang.String)
     */
    public WsB010ResultDomain getCusSubInfo(String compCd, String customerSubsidiaryCode) throws ApplicationException {

        String webServicePath = "wsb010";
        WebServiceCallerRestDomain wsCallerRestDomain
            = commonService.searchCigmaWebServiceCallerRestDomain(compCd, webServicePath);

        // パラメータを設定する
        wsCallerRestDomain.setParamMap("customerSubsidiaryCode", customerSubsidiaryCode);

        try {
            // Webサービスを呼び出す
            WsB010ResultDomain wsB010ResultDomain
                = WebServiceCallerRest.get(wsCallerRestDomain, new GenericType<WsB010ResultDomain>(){});
            
            if (!WS_RESULT_SUCCESS.equals(wsB010ResultDomain.getResultCode())) {
                if (WS_RESULT_ERROR_SYSTEM.equals(wsB010ResultDomain.getResultCode())) {
                    throw new SystemException(NXS_E1_0058);
                } else {
                    if (!CollectionUtils.isEmpty(wsB010ResultDomain.getErrorList())) {
                        ErrorListItemDomain errorListItem = wsB010ResultDomain.getErrorList().get(0);
                        
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
            
            return wsB010ResultDomain;

        } catch (WebServiceCallerRestException e) {
            throw new SystemException(e);
        }
    }


}
