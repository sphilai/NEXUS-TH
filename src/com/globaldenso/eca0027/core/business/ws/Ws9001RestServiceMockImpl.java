/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.ws;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.Ws9001ResultDomain;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_SUCCESS;

/**
 * The mock class for the Web Call Service (WS7004)
 * <br />Webサービス(WS9001)呼出しサービスのMockクラスです。
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 12250 $
 */
public class Ws9001RestServiceMockImpl implements Ws9001RestService {

    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public Ws9001RestServiceMockImpl() {
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.ws.Ws9001RestService#getItemInfoForMa(java.lang.String, java.lang.String, java.lang.String)
     */
    public Ws9001ResultDomain getItemInfoForMa(String compCd, String itemNo, String customerNo) throws ApplicationException {
        return new Ws9001ResultDomain(WS_RESULT_SUCCESS);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.ws.Ws9001RestService#getItemInfoForMa(java.lang.String, java.lang.String, java.lang.String, java.lang.String)
     */
    public Ws9001ResultDomain getItemInfoForMa(String compCd, String itemNo,
        String customerNo, String refDate) throws ApplicationException {

        return null;
    }
}
