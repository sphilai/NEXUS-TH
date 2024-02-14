/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.ws;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.ai.common.core.exception.SystemException;
import com.globaldenso.ai.library.webservicecallrest.WebServiceCallerRest;
import com.globaldenso.ai.library.webservicecallrest.domain.WebServiceCallerRestDomain;
import com.globaldenso.ai.library.webservicecallrest.exception.WebServiceCallerRestException;
import com.globaldenso.eca0027.core.business.domain.Ws2001ResultDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.sun.jersey.api.client.GenericType;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0058;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0060;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_CIGMA_DATE_FORMAT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_ERROR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_ERROR_SYSTEM;


/**
 * The implementation class to call service of web services <br />
 * Webサービス(WS2001)呼出しサービスの実装クラスです。
 * 
 * @author $Author: 810833843 $
 * @version $Revision: 9972 $
 */
public class Ws2001RestServiceImpl implements Ws2001RestService {

    /**
     * common service <br />
     * 共通サービス
     */
    private CommonService commonService;

    /**
     * <p>constructor. <br />
     * デフォルトコンストラクタです。</p>
     */
    public Ws2001RestServiceImpl() {
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
     * @see com.globaldenso.eca0027.core.business.ws.Ws2001RestService#searchWorkingDay(String, Date, int, int)
     */
    public Ws2001ResultDomain searchWorkingDay(String compCd, Date baseDate, int beforeDays,
        int afterDays) throws ApplicationException {

        DateFormat df = new SimpleDateFormat(WS_CIGMA_DATE_FORMAT);

        String webServicePath = "ws2001";
        WebServiceCallerRestDomain wsCallerRestDomain
            = commonService.searchCigmaWebServiceCallerRestDomain(compCd, webServicePath);

        // パラメータを設定する
        if (baseDate != null) {
            wsCallerRestDomain.setParamMap("baseDate", df.format(baseDate));
        }
        wsCallerRestDomain.setParamMap("nDaysBefore", String.valueOf(beforeDays));
        wsCallerRestDomain.setParamMap("nDaysAfter", String.valueOf(afterDays));

        try {
            // Webサービスを呼び出す
            Ws2001ResultDomain ws2001ResultDomain
                = WebServiceCallerRest.get(wsCallerRestDomain, new GenericType<Ws2001ResultDomain>(){});
            
            if (WS_RESULT_ERROR.equals(ws2001ResultDomain.getResultCode())) {
                if (NXS_E1_0060.equals(ws2001ResultDomain.getErrorList().get(0).getErrorCode())) {
                    throw new GscmApplicationException(NXS_E1_0060);
                }
            }
            
            if (WS_RESULT_ERROR_SYSTEM.equals(ws2001ResultDomain.getResultCode())) {
                throw new SystemException(NXS_E1_0058);
            }
            
            return ws2001ResultDomain;

        } catch (WebServiceCallerRestException e) {
            throw new SystemException(e);
        }
    }

}
