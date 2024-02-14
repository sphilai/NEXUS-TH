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
import com.globaldenso.eca0027.core.business.domain.Ws9003ResultDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.sun.jersey.api.client.GenericType;
/**
 * Implementation class of the service to invoke the Web service(WS9003).
 * <br />Webサービス(WS9003)呼出しサービスの実装クラスです。
 * 
 * @author $Author: 10088DS50801 $
 * @version $Revision: 7439 $
 */
public class Ws9003RestServiceImpl implements Ws9003RestService {

    /**
     * commonService/共通サービス
     */
    private CommonService commonService;

    /**
     * Default constructor./デフォルトコンストラクタ。
     */
    public Ws9003RestServiceImpl() {
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
     * Customer information check for the existence of CIGMA.
     * CIGMAの得意先情報存在チェック。
     * 
     * - Set the parameters.
     * - Call the Web Service.
     * 
     * - パラメータを設定する。
     * - Webサービスを呼び出す。
     * 
     * </pre>
     * @see com.globaldenso.eca0027.core.business.ws.Ws9003RestService
     *      #searchCustomerCd(java.lang.String)
     */
    public Ws9003ResultDomain validateDatabaseCustomer(String compCd, String customerCd) 
        throws ApplicationException{

        String webServicePath = "ws9003";
        WebServiceCallerRestDomain wsCallerRestDomain
            = commonService.searchCigmaWebServiceCallerRestDomain(compCd, webServicePath);

        // パラメータを設定する
        // Set the parameters.
        wsCallerRestDomain.setParamMap("customerNo", String.valueOf(customerCd));
        wsCallerRestDomain.setParamMap("compCd", String.valueOf(compCd));

        try {
            // Call a Web service
            Ws9003ResultDomain ws9003ResultDomain
                = WebServiceCallerRest.get(wsCallerRestDomain, 
                    new GenericType<Ws9003ResultDomain>(){});

            // Create error list
            List<MessageDomain> errorList = new ArrayList<MessageDomain>();

            if(ws9003ResultDomain.getErrorList().size() > 0) {
                // エラー確認
                // Error check.
                MessageDomain errMsg = new MessageDomain("", 
                    ws9003ResultDomain.getErrorList().get(0).getErrorCode(), null);
                errorList.add(errMsg);
                throw new ValidationException(errorList);
            }

            return ws9003ResultDomain;

        } catch (WebServiceCallerRestException e) {
            throw new SystemException(e);
        }
    }
}