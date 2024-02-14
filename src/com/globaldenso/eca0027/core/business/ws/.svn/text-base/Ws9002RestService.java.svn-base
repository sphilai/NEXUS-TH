 /*
 * Project : NEXUS_CIGMA
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.ws;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.Ws9002ResultDomain;

/**
 * Web service interface (WS9002) call service.
 * <br />Webサービス(WS9002)呼出しサービスのインタフェースです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public interface Ws9002RestService {

    /**
     * Using (WS9002) Web services, plant information check for the existence of CIGMA.
     * Webサービス(WS9002)を使用して、CIGMAの製造部工場区分情報存在チェックをします。
     *
     * @param compCd 会社コード
     * @param plntCd 製造部工場区分
     * @return Ws9002の結果ドメイン
     * @throws ApplicationException 製造部工場区分情報が取得できない場合
     */
    public Ws9002ResultDomain validateDatabasePlant(String compCd, String plntCd) 
        throws ApplicationException;
}
