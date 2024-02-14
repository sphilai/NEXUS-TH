 /*
 * Project : NEXUS_CIGMA
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.ws;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.Ws9005ResultDomain;

/**
 * Web service interface (WS9005) call service.
 * <br />Webサービス(WS9005)呼出しサービスのインタフェースです。
 * 
 * @author $Author: 10088DS50801 $
 * @version $Revision: 7439 $
 */
public interface Ws9005RestService {

    /**
     * Using (WS9005) Web services, plant information check for the existence of CIGMA.
     * Webサービス(WS9005)を使用して、CIGMAの倉庫情報存在チェックをします。
     *
     * @param compCd 会社コード
     * @param lgcyWhCd 倉庫コード
     * @return Ws9005の結果ドメイン
     * @throws ApplicationException 倉庫情報が取得できない場合
     */
    public Ws9005ResultDomain validateDatabaseWh(String lgcyWhCd, String compCd) 
        throws ApplicationException;
}
