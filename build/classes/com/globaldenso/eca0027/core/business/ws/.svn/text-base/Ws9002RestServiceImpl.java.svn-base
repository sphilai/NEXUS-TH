/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.ws;

import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.ai.common.core.exception.SystemException;
import com.globaldenso.ai.library.webservicecallrest.WebServiceCallerRest;
import com.globaldenso.ai.library.webservicecallrest.domain.WebServiceCallerRestDomain;
import com.globaldenso.ai.library.webservicecallrest.exception.WebServiceCallerRestException;
import com.globaldenso.eca0027.core.business.domain.Ws9002ResultDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.sun.jersey.api.client.GenericType;

/**
 * Implementation class of the service to invoke the Web service(WS9002).
 * <br />Webサービス(WS9002)呼出しサービスの実装クラスです。
 * 
 * @author $Author: 10088DS50801 $
 * @version $Revision: 7439 $
 */
public class Ws9002RestServiceImpl implements Ws9002RestService {

    /**
     * commonService/共通サービス
     */
    private CommonService commonService;

    /**
     * Default constructor./デフォルトコンストラクタ。
     */
    public Ws9002RestServiceImpl() {
    }

    /**
     * commonService のセッターメソッドです。
     *
     * @param commonService commonService に設定する
     */
    public void setCommonService(CommonService commonService) {
        this.commonService = commonService;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * Plant information check for the existence of CIGMA.
     * CIGMAの製造部工場区分情報存在チェック。
     * 
     * - Set the parameters.
     * - Call the Web Service.
     * 
     * - パラメータを設定する。
     * - Webサービスを呼び出す。
     * 
     * </pre>
     * @see com.globaldenso.eca0027.core.business.ws.Ws9002RestService
     *      #searchCustomerCd(java.lang.String)
     */
    public Ws9002ResultDomain validateDatabasePlant(String compCd, String plntCd)
        throws ApplicationException {

        String webServicePath = "ws9002";
        WebServiceCallerRestDomain wsCallerRestDomain
            = commonService.searchCigmaWebServiceCallerRestDomain(compCd, webServicePath);

        // パラメータを設定する
        // Set the parameters.
        wsCallerRestDomain.setParamMap("plantCd", String.valueOf(plntCd));
        wsCallerRestDomain.setParamMap("compCd", String.valueOf(compCd));

        try {
            // Call a Web service
            Ws9002ResultDomain ws9002ResultDomain
                = WebServiceCallerRest.get(wsCallerRestDomain, 
                    new GenericType<Ws9002ResultDomain>(){});

            // Create error list
            List<MessageDomain> errorList = new ArrayList<MessageDomain>();

            if(ws9002ResultDomain.getErrorList().size() > 0) {
                // エラー確認
                // Error check.
                MessageDomain errMsg = new MessageDomain("", 
                    ws9002ResultDomain.getErrorList().get(0).getErrorCode(), null);
                errorList.add(errMsg);
                throw new ValidationException(errorList);

            }

            return ws9002ResultDomain;

        } catch (WebServiceCallerRestException e) {
            throw new SystemException(e);
        }
    }
}
