/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.ws;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0058;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0060;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_ERROR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_ERROR_SYSTEM;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.ai.common.core.exception.SystemException;
import com.globaldenso.ai.library.webservicecallrest.WebServiceCallerRest;
import com.globaldenso.ai.library.webservicecallrest.domain.WebServiceCallerRestDomain;
import com.globaldenso.ai.library.webservicecallrest.exception.WebServiceCallerRestException;
import com.globaldenso.eca0027.core.business.domain.Ws9001ResultDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.sun.jersey.api.client.GenericType;

/**
 * The implementation class for the Web Call Service (WS9001)
 * <br />Webサービス(WS9001)呼出しサービスの実装クラスです。
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 12250 $
 */
public class Ws9001RestServiceImpl implements Ws9001RestService {

    /**
      * common service
     * <br />共通サービス
     */
    private CommonService commonService;

    /**
     * constructor. 
     * <br />デフォルトコンストラクタです。
     */
    public Ws9001RestServiceImpl() {
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
     * @see com.globaldenso.eca0027.core.business.ws.Ws9001RestService#getItemInfoForMa(java.lang.String, java.lang.String, java.lang.String)
     */
    public Ws9001ResultDomain getItemInfoForMa(String compCd, String itemNo, String customerNo)
        throws ApplicationException {

        return getItemInfoForMa(compCd, itemNo, customerNo, null);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.ws.Ws9001RestService#getItemInfoForMa(java.lang.String, java.lang.String, java.lang.String, java.lang.String)
     */
    public Ws9001ResultDomain getItemInfoForMa(String compCd, String itemNo, String customerNo, String refDate)
        throws ApplicationException
    {
        String webServicePath = "ws9001";
        WebServiceCallerRestDomain wsCallerRestDomain
            = commonService.searchCigmaWebServiceCallerRestDomain(compCd, webServicePath);

        // パラメータを設定する
        wsCallerRestDomain.setParamMap("itemNo", itemNo);
        wsCallerRestDomain.setParamMap("customerNo", customerNo);
        // UT305 ADD START
        if (refDate != null) {
            wsCallerRestDomain.setParamMap("refDate", refDate);
        }
        // UT305 ADD END

        try {
            // Webサービスを呼び出す
            Ws9001ResultDomain ws9001ResultDomain
                = WebServiceCallerRest.get(wsCallerRestDomain, new GenericType<Ws9001ResultDomain>(){});
            
            if (WS_RESULT_ERROR.equals(ws9001ResultDomain.getResultCode())) {
                if (NXS_E1_0060.equals(ws9001ResultDomain.getErrorList().get(0).getErrorCode())) {
                    throw new GscmApplicationException(NXS_E1_0060);
                }
            }
            
            if (WS_RESULT_ERROR_SYSTEM.equals(ws9001ResultDomain.getResultCode())) {
                throw new SystemException(NXS_E1_0058);
            }

            return ws9001ResultDomain;

        } catch (WebServiceCallerRestException e) {
            throw new SystemException(e);
        }
    }
}
