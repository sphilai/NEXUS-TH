/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.ws;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.Ws9004ResultDomain;

/**
 * Web service interface (WS9004) call service.
 * <br />Webサービス(WS9004)呼出しサービスのインタフェースです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public interface Ws9004RestService {

    /**
     * Using (WS9004) Web services, customer information check for the existence of CIGMA.
     * Webサービス(WS9004)を使用して、CIGMAの送荷先情報存在チェックをします。
     *
     * @param compCd 会社コード
     * @param customerCd 得意先コード
     * @param lgcyShipTo 送荷先情報
     * @return Ws9004の結果ドメイン
     * @throws ApplicationException 送荷先情報が取得できない場合
     */
    public Ws9004ResultDomain validateDatabaseShipTo(String compCd, String customerCd , String lgcyShipTo) 
        throws ApplicationException;
}
