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
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_CIGMA_DATE_FORMAT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_ERROR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_ERROR_SYSTEM;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.collections.CollectionUtils;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.ai.common.core.exception.SystemException;
import com.globaldenso.ai.library.webservicecallrest.WebServiceCallerRest;
import com.globaldenso.ai.library.webservicecallrest.domain.WebServiceCallerRestDomain;
import com.globaldenso.ai.library.webservicecallrest.exception.WebServiceCallerRestException;
import com.globaldenso.eca0027.core.business.domain.WsB001ResultDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.sun.jersey.api.client.GenericType;

/**
 * The implementation class for the Web Call Service (WSB001) <br />
 * Webサービス(WSB001)呼出しサービスの実装クラスです。
 * 
 * @author $Author: 810833613 $
 * @version $Revision: 7053 $
 */
public class WsB001RestServiceImpl implements WsB001RestService  {

    /**
      * common service <br />
     * 共通サービス
     */
    private CommonService commonService;

    /**
     * constructor.  <br />
     * デフォルトコンストラクタです。
     */
    public WsB001RestServiceImpl() {
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
     * @see com.globaldenso.eca0027.core.business.ws.WsB001RestService#searchOdrEntryHdrOnHand(String, String, String, String, String, Date)
     */
    public WsB001ResultDomain searchOdrEntryHdrOnHand(String compCd,
        String customerNoLegacy, String shipToNoLegacy, String partNo,
        String pkgCode, Date startDt) throws ApplicationException {

        DateFormat df = new SimpleDateFormat(WS_CIGMA_DATE_FORMAT);

        String webServicePath = "wsb001";
        WebServiceCallerRestDomain wsCallerRestDomain
            = commonService.searchCigmaWebServiceCallerRestDomain(compCd, webServicePath);

        // パラメータを設定する
        wsCallerRestDomain.setParamMap("customerNoLegacy", customerNoLegacy);
        wsCallerRestDomain.setParamMap("shipToNoLegacy", shipToNoLegacy);
        wsCallerRestDomain.setParamMap("partNo", partNo);
        wsCallerRestDomain.setParamMap("pkgCode", pkgCode);
        if (startDt != null) {
            wsCallerRestDomain.setParamMap("startDt", df.format(startDt));
        }

        try {
            // Webサービスを呼び出す
            WsB001ResultDomain wsB001ResultDomain
                = WebServiceCallerRest.get(wsCallerRestDomain, new GenericType<WsB001ResultDomain>(){});
            
            if (WS_RESULT_ERROR.equals(wsB001ResultDomain.getResultCode())) {
                if (!CollectionUtils.isEmpty(wsB001ResultDomain.getErrorList())) {
                    if (NXS_E1_0060.equals(wsB001ResultDomain.getErrorList().get(0).getErrorCode())) {
                        throw new GscmApplicationException(NXS_E1_0060);
                    }
                }
            }
            
            if (WS_RESULT_ERROR_SYSTEM.equals(wsB001ResultDomain.getResultCode())){
                throw new SystemException(NXS_E1_0058);
            }
            
            return wsB001ResultDomain;

        } catch (WebServiceCallerRestException e) {
            throw new SystemException(e);
        }
    }
}
