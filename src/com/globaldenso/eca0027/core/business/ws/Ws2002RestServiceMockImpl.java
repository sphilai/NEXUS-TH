/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.ws;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_SUCCESS;

import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.Ws2002ResultDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2002ResultItemDomain;

/**
 * The mock class for the Web Call Service (WS2002) <br />
 * Webサービス(WS2002)呼出しサービスのMockクラスです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class Ws2002RestServiceMockImpl implements Ws2002RestService {

    /**
     * <p>constructor. <br />
     * デフォルトコンストラクタです。</p>
     */
    public Ws2002RestServiceMockImpl() {
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.ws.Ws2002RestService#getItemInfoForPltzIns(String, String, String, List, String, String)
     */
    public Ws2002ResultDomain getItemInfoForPltzIns(String compCd, String plantCd, String whCd,
        List<String> itemNoList, String customerCd, String shipToCd) throws ApplicationException {

        List<Ws2002ResultItemDomain> itemList = new ArrayList<Ws2002ResultItemDomain>();
        
        for (String itemNo : itemNoList) {
            // 品目情報
            Ws2002ResultItemDomain item = new Ws2002ResultItemDomain();
            item.setItnbr(itemNo);
            item.setLotsz("10");
            item.setWhslc("ABC01");

            itemList.add(item);
        }
        
        // 結果ドメイン
        Ws2002ResultDomain result = new Ws2002ResultDomain(WS_RESULT_SUCCESS);
        result.setItemList(itemList);
        result.setDcdiv("2");

        return result;
    }

}
