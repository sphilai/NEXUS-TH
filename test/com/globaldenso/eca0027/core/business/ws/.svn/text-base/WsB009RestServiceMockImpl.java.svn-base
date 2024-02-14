/*
 * Project : NEXUS_EXPORT
 *
 * 更新日       更新者                  更新内容
 * 2014/01/01   DENSO IT SOLUTIONS      新規作成
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.ws;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_CIGMA_DATE_FORMAT;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.ai.common.core.exception.SystemException;
import com.globaldenso.ai.library.webservicecallrest.WebServiceCallerRest;
import com.globaldenso.ai.library.webservicecallrest.domain.WebServiceCallerRestDomain;
import com.globaldenso.ai.library.webservicecallrest.exception.WebServiceCallerRestException;
import com.globaldenso.eca0027.core.business.domain.ResultDomain;
import com.sun.jersey.api.client.GenericType;

/**
 * Webサービス(WSB009)呼出しサービスの実装クラスです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class WsB009RestServiceMockImpl implements WsB009RestService {

    /**
     * デフォルトコンストラクタです。
     */
    public WsB009RestServiceMockImpl() {
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.ws.WsB009RestService#callEdiOdrEntryJob(java.lang.String, java.util.Date)
     */
    public ResultDomain callEdiOdrEntryJob(String rcvOdrCompCd, Date cigmaAds) throws ApplicationException {
        WebServiceCallerRestDomain client = new WebServiceCallerRestDomain();

        // 接続先の設定
        client.setAddDensoContext(true);
        client.setUrl("http://malaysia:8080/NEXUS_EXPORT/rest/wsb009");
        client.setUserName("bht");
        client.setPassword("bht");
        
        // パラメータの設定
        client.setParamMap("receivingCompanyCode", rcvOdrCompCd);
        client.setParamMap("cigmaAds", new SimpleDateFormat(WS_CIGMA_DATE_FORMAT).format(cigmaAds));
        
        // Webサービスの呼び出し
        try {
            return WebServiceCallerRest.get(client, new GenericType<ResultDomain>(){});
        } catch (WebServiceCallerRestException e) {
            throw new SystemException(e);
        }
    }
}
