/*
 * Project : NEXUS_EXPORT
 *
 * 更新日       更新者                  更新内容
 * 2014/01/01   DENSO IT SOLUTIONS      新規作成
 *
 * Copyright (c) 2017 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.ws;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.WsB012ParamDomain;
import com.globaldenso.eca0027.core.business.domain.WsB012ResultDomain;

/**
 * Interface for the Web Call Service (WSB012)
 * <br />Webサービス(WSB012)呼出しサービスのインタフェース。
 *
 * MGT575 ADD
 *
 * @author $Author: G453S402002 $
 * @version $Revision: 13653 $
 */
public interface WsB012RestService {

    /**
     * Check Registration information of the EDI Receive Order by using the (WS_B006) Web Services
     * <br />Webサービス(WS_B012)を使用して、受注アップロード情報をチェック。
     *
     * @param compCd - For target CIGMA judgment
     * @param param - parameter domain
     * @return result domain
     * @throws ApplicationException - Web service error
     */
    public WsB012ResultDomain checkEdiOdrEntry(String compCd, WsB012ParamDomain param) throws ApplicationException;
}