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

import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.ai.common.core.exception.SystemException;
import com.globaldenso.ai.library.webservicecallrest.WebServiceCallerRest;
import com.globaldenso.ai.library.webservicecallrest.domain.WebServiceCallerRestDomain;
import com.globaldenso.ai.library.webservicecallrest.exception.WebServiceCallerRestException;
import com.globaldenso.eca0027.core.business.domain.Ws2002ResultDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.sun.jersey.api.client.GenericType;

/**
 * The implementation class for the Web Call Service (WS2002) <br />
 * Webサービス(WS2002)呼出しサービスの実装クラスです。
 * 
 * @author $Author: 810833843 $
 * @version $Revision: 9972 $
 */
public class Ws2002RestServiceImpl implements Ws2002RestService {

    /**
     * common service <br />
     * 共通サービス
     */
    private CommonService commonService;

    /**
     * <p>constructor. <br />
     * デフォルトコンストラクタです。</p>
     */
    public Ws2002RestServiceImpl() {
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
     * @see com.globaldenso.eca0027.core.business.ws.Ws2002RestService#getItemInfoForPltzIns(String, String, String, List, String, String)
     */
    public Ws2002ResultDomain getItemInfoForPltzIns(String compCd, String plantCd, String whCd,
        List<String> itemNoList, String customerCd, String shipToCd) throws ApplicationException {

        String webServicePath = "ws2002";
        WebServiceCallerRestDomain wsCallerRestDomain
            = commonService.searchCigmaWebServiceCallerRestDomain(compCd, webServicePath);

        // リストをカンマ区切り文字列に変換する
        String itemNo = "";
        if (itemNoList != null) {
            itemNo = StringUtils.join(itemNoList.iterator(), ",");
        }

        // パラメータを設定する
        wsCallerRestDomain.setParamMap("plantCd", plantCd);
        wsCallerRestDomain.setParamMap("whCd", whCd);
        wsCallerRestDomain.setParamMap("itemNo", itemNo);
        wsCallerRestDomain.setParamMap("customerCd", customerCd);
        wsCallerRestDomain.setParamMap("shipTo", shipToCd);

        try {
            // Webサービスを呼び出す
            Ws2002ResultDomain ws2002ResultDomain
                = WebServiceCallerRest.post(wsCallerRestDomain, new GenericType<Ws2002ResultDomain>(){});
            
            if (WS_RESULT_ERROR.equals(ws2002ResultDomain.getResultCode())) {
                if (NXS_E1_0060.equals(ws2002ResultDomain.getErrorList().get(0).getErrorCode())) {
                    throw new GscmApplicationException(NXS_E1_0060);
                }
            }
            
            if (WS_RESULT_ERROR_SYSTEM.equals(ws2002ResultDomain.getResultCode())) {
                throw new SystemException(NXS_E1_0058);
            }

            return ws2002ResultDomain;

        } catch (WebServiceCallerRestException e) {
            throw new SystemException(e);
        }
    }

}
