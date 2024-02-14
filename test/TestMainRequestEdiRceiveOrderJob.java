/*
 * Project : NEXUS_EXPORT
 *
 * 更新日       更新者                  更新内容
 * 2014/01/01   DENSO IT SOLUTIONS      新規作成
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */


import com.globaldenso.ai.common.core.exception.SystemException;
import com.globaldenso.ai.library.webservicecallrest.WebServiceCallerRest;
import com.globaldenso.ai.library.webservicecallrest.domain.WebServiceCallerRestDomain;
import com.globaldenso.ai.library.webservicecallrest.exception.WebServiceCallerRestException;
import com.globaldenso.eca0027.core.business.domain.ResultDomain;
import com.sun.jersey.api.client.GenericType;

/**
 *
 */
public class TestMainRequestEdiRceiveOrderJob {

    /**
     *
     */
    public TestMainRequestEdiRceiveOrderJob() {
    }

    /**
     *
     * @param args parameter
     */
    public static void main(String[] args) {

        WebServiceCallerRestDomain client = new WebServiceCallerRestDomain();

        // 接続先の設定
        client.setAddDensoContext(true);
        client.setUrl("http://" + args[0] + "/NEXUS_EXPORT/rest/wsb009");
        client.setUserName(args[1]);
        client.setPassword(args[2]);

        // パラメータの設定
        client.setParamMap("receivingCompanyCode", args[3]);
        client.setParamMap("cigmaAds", args[4]);
        client.setParamMap("callerJobId", args[5]);

        // Webサービスの呼び出し
        try {
            WebServiceCallerRest.get(client, new GenericType<ResultDomain>(){});
        } catch (WebServiceCallerRestException e) {
            throw new SystemException(e);
        }
    }
}




