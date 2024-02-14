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
import com.globaldenso.eca0027.core.business.domain.ResultDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.sun.jersey.api.client.GenericType;

/**
 * The implementation class for the Web Call Service (WSB003) <br />
 * Webサービス(WSB003)呼出しサービスの実装クラスです。
 * 
 * @author $Author: 810833613 $
 * @version $Revision: 7053 $
 */
public class WsB003RestServiceImpl implements WsB003RestService {

    /**
      * common service <br />
     * 共通サービス
     */
    private CommonService commonService;

    /**
     * constructor.  <br />
     * デフォルトコンストラクタです。
     */
    public WsB003RestServiceImpl() {
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
     * @see com.globaldenso.eca0027.core.business.ws.WsB003RestService#searchEdiOdrLastDigChgHdr(String, String, String, String, Date, String, String)
     */
    public ResultDomain searchEdiOdrLastDigChgHdr(
        String compCd,
        String customerNoLegacy, 
        String shipToNoLegacy,
        String transportationCode, 
        Date shippingDate, 
        String partNoOrg,
        String pkgCode) throws ApplicationException {

        DateFormat df = new SimpleDateFormat(WS_CIGMA_DATE_FORMAT);

        String webServicePath = "wsb003";
        WebServiceCallerRestDomain wsCallerRestDomain
            = commonService.searchCigmaWebServiceCallerRestDomain(compCd, webServicePath);

        // パラメータを設定する
        wsCallerRestDomain.setParamMap("customerNoLegacy", customerNoLegacy);
        wsCallerRestDomain.setParamMap("shipToNoLegacy", shipToNoLegacy);
        wsCallerRestDomain.setParamMap("transportationCode", transportationCode);
        if (shippingDate != null) {
            wsCallerRestDomain.setParamMap("shippingDate", df.format(shippingDate));
        }
        wsCallerRestDomain.setParamMap("partNo", partNoOrg);
        wsCallerRestDomain.setParamMap("pkgCode", pkgCode);

        try {
            // Webサービスを呼び出す
            ResultDomain resultDomain
                = WebServiceCallerRest.get(wsCallerRestDomain, new GenericType<ResultDomain>(){});
            
            if (WS_RESULT_ERROR.equals(resultDomain.getResultCode())) {
                if (!CollectionUtils.isEmpty(resultDomain.getErrorList())) {
                    if (NXS_E1_0060.equals(resultDomain.getErrorList().get(0).getErrorCode())) {
                        throw new GscmApplicationException(NXS_E1_0060);
                    }
                }
            }
            
            if (WS_RESULT_ERROR_SYSTEM.equals(resultDomain.getResultCode())){
                throw new SystemException(NXS_E1_0058);
            }
            
            return resultDomain;

        } catch (WebServiceCallerRestException e) {
            throw new SystemException(e);
        }
    }
}
