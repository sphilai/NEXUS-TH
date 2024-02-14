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
import com.globaldenso.eca0027.core.business.domain.Ws9004ResultDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.sun.jersey.api.client.GenericType;

/**
 * Implementation class of the service to invoke the Web service(WS9004).
 * <br />Webサービス(WS9004)呼出しサービスの実装クラスです。
 * 
 * @author $Author: 10088DS50801 $
 * @version $Revision: 7439 $
 */
public class Ws9004RestServiceImpl implements Ws9004RestService {

    /**
     * commonService/共通サービス
     */
    private CommonService commonService;

    /**
     * Default constructor./デフォルトコンストラクタ。
     */
    public Ws9004RestServiceImpl() {
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
     * <pre>
     * ShipTo destination information check for the existence of CIGMA.
     * CIGMAの送荷先情報存在チェック。
     * 
     * - Set the parameters.
     * - Call the Web Service.
     * 
     * - パラメータを設定する。
     * - Webサービスを呼び出す。
     * 
     * </pre>
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.ws.Ws9004RestService
     *      #validateDatabaseShipTo(java.lang.String, java.lang.String, java.lang.String)
     */
    public Ws9004ResultDomain validateDatabaseShipTo(String compCd, String customerCd , String lgcyShipTo) 
        throws ApplicationException {

        String webServicePath = "ws9004";
        WebServiceCallerRestDomain wsCallerRestDomain
            = commonService.searchCigmaWebServiceCallerRestDomain(compCd, webServicePath);

        // パラメータを設定する
        // Set the parameters.
        wsCallerRestDomain.setParamMap("customerNo", String.valueOf(customerCd));
        wsCallerRestDomain.setParamMap("shipTo" , String.valueOf(lgcyShipTo));
        wsCallerRestDomain.setParamMap("compCd" , String.valueOf(compCd));

        try {
            // Call a Web service
            Ws9004ResultDomain ws9004ResultDomain
                = WebServiceCallerRest.get(wsCallerRestDomain, 
                    new GenericType<Ws9004ResultDomain>(){});

            // Create error list
            List<MessageDomain> errorList = new ArrayList<MessageDomain>();

            if(ws9004ResultDomain.getErrorList().size() > 0) {
                // エラー確認
                // Error check.
                MessageDomain errMsg = new MessageDomain("", 
                    ws9004ResultDomain.getErrorList().get(0).getErrorCode(), null);
                errorList.add(errMsg);
                throw new ValidationException(errorList);
            }

            return ws9004ResultDomain;

        } catch (WebServiceCallerRestException e) {
            throw new SystemException(e);
        }
    }
}
