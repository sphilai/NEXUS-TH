/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.ws;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.Ws9003ResultDomain;

/**
 * Web service interface (WS9003) call service.
 * <br />Webサービス(WS9003)呼出しサービスのインタフェースです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public interface Ws9003RestService {

    /**
     * Using (WS9003) Web services, customer information check for the existence of CIGMA.
     * Webサービス(WS9003)を使用して、CIGMAの得意先情報存在チェックをします。
     *
     * @param compCd 会社コード
     * @param customerCd 得意先コード
     * @return Ws9003の結果ドメイン
     * @throws ApplicationException 得意先情報が取得できない場合
     */
    public Ws9003ResultDomain validateDatabaseCustomer(String compCd, String customerCd) 
        throws ApplicationException;
}
