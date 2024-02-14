/*
 * Project : NEXUS_EXPORT
 *
 * 更新日       更新者                  更新内容
 * 2014/01/01   DENSO IT SOLUTIONS      新規作成
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.ws;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.Ws2004ResultDomain;

/**
 * Interface for the Web Call Service (WS2004) <br />
 * Webサービス(WS2004)呼出しサービスのインタフェースです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public interface Ws2004RestService {

    /**
     * <p>Get the item information using the (WS2004) Web Services <br />
     * Webサービス(WS2004)を使用して、品目情報を取得します。</p>
     *
     * @param compCd - COMPANY CODE
     * @param plantCdList - list of PLANT CODE
     * @param whCd - WAREHOUSE CODE
     * @param itemNoList - List of Item No.
     * @param customerCd - CUSTOMER CODE
     * @return Result Domain of W2004
     * @throws ApplicationException - If an item information can not be obtained
     */
    public Ws2004ResultDomain searchItemInfoForCml(String compCd, List<String> plantCdList,
        String whCd, List<String> itemNoList, String customerCd) throws ApplicationException;

}