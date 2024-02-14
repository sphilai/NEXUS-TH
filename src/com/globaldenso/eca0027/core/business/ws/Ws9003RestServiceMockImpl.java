/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.ws;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_SUCCESS;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.Ws9003ResultDomain;
import com.globaldenso.eca0027.core.business.domain.Ws9003ResultItemDomain;


/**
 * The mock class for the Web Call Service (WS9003) <br />
 * Webサービス(WS9003)呼出しサービスのMockクラスです。
 * 
 * @author $Author: 810833843 $
 * @version $Revision: 6774 $
 */
public class Ws9003RestServiceMockImpl implements Ws9003RestService {

    /**
     * <p>constructor. <br />
     * デフォルトコンストラクタです。</p>
     */
    public Ws9003RestServiceMockImpl() {
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.ws.Ws9003RestService#validateDatabaseCustomer(java.lang.String, java.lang.String)
     */
    public Ws9003ResultDomain validateDatabaseCustomer(String compCd,
        String customerCd) throws ApplicationException {

        // 結果ドメイン
        Ws9003ResultDomain result = new Ws9003ResultDomain(WS_RESULT_SUCCESS);

        Ws9003ResultItemDomain item = new Ws9003ResultItemDomain();
        item.setCustomer("WWWWW");
        item.setFaxNo("012-345-6789");
        result.setCustomerInfo(item);
        
        return result;
    }

}
