/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.ws;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.Ws2002ResultDomain;

/**
 * Interface for the Web Call Service (WS2002) <br />
 * Webサービス(WS2002)呼出しサービスのインタフェースです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public interface Ws2002RestService {

    /**
     * <p>
     * Get the item information using the (WS2002) Web Services <br />
     * Webサービス(WS2002)を使用して、品目情報を取得します。</p>
     *
     * @param compCd - COMPANY CODE
     * @param plantCd - PLANT CODE
     * @param whCd - WAREHOUSE CODE
     * @param itemNoList - List of Item No.
     * @param customerCd - CUSTOMER CODE
     * @param shipToCd - SHIP TO CODE
     * @return Result Domain of W2002
     * @throws ApplicationException - If an item information can not be obtained
     */
    public Ws2002ResultDomain getItemInfoForPltzIns(String compCd, String plantCd, String whCd,
        List<String> itemNoList, String customerCd, String shipToCd) throws ApplicationException;

}
