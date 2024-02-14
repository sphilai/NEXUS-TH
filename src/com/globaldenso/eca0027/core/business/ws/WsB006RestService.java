/*
 * Project : NEXUS_EXPORT
 *
 * 更新日       更新者                  更新内容
 * 2014/01/01   DENSO IT SOLUTIONS      新規作成
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.ws;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.WsB006ParamDomain;
import com.globaldenso.eca0027.core.business.domain.WsB006ResultDomain;

/**
 * Interface for the Web Call Service (WSB006)
 * <br />Webサービス(WSB006)呼出しサービスのインタフェースです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public interface WsB006RestService {

    /**
     * Check Registration information of the EDI Receive Order by using the (WS_B006) Web Services
     * <br />Webサービス(WS_B006)を使用して、EDI受注登録情報をチェックします。
     * 
     * @param param - information of EDI Receive Order
     * @return information of the EDI Receive Order that reflects the results of EDI Orders Common Check (CIGMA side)
     * @throws ApplicationException - If an error occurs in the Web services provider
     */
    public WsB006ResultDomain checkEdiOdrEntry(WsB006ParamDomain param) throws ApplicationException;

}