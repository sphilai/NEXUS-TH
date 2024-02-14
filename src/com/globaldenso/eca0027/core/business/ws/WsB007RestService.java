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
import com.globaldenso.eca0027.core.business.domain.ResultDomain;
import com.globaldenso.eca0027.core.business.domain.WsB007ParamDomain;

/**
 * Interface for the Web Call Service (WSB007)
 * <br />Webサービス(WSB007)呼出しサービスのインタフェースです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public interface WsB007RestService {

    /**
     * Reflect the information in Export Receive Order Update to the direct delivery orders CIGMA by using the (WSB007) Web Services
     * <br />Webサービス(WSB007)を使用して、輸出受注更新情報を直納受注情報へ反映します。
     *
     * @param compCd - COMPANY CODE
     * @param param - the information in Export Receive Order Update
     * @return result domain
     * @throws ApplicationException - If an error occurs in the Web services provider
     */
    public ResultDomain reflectToCusOdr(String compCd, WsB007ParamDomain param) throws ApplicationException;
}