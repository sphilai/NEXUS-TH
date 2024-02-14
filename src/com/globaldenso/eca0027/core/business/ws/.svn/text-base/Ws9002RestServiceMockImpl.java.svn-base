/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.ws;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.Ws9002ResultDomain;
import com.globaldenso.eca0027.core.business.domain.Ws9002ResultItemDomain;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_SUCCESS;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_ERROR;

/**
 * The mock class for the Web Call Service (WS9002)
 * <br />Webサービス(WS9002)呼出しサービスのMockクラスです。
 * 
 * @author $Author: 810833843 $
 * @version $Revision: 7441 $
 */
public class Ws9002RestServiceMockImpl implements Ws9002RestService {

    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public Ws9002RestServiceMockImpl() {
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.ws.Ws9002RestService#validateDatabasePlant(java.lang.String, java.lang.String)
     */
    public Ws9002ResultDomain validateDatabasePlant(String compCd, String plntCd)
        throws ApplicationException {
        Ws9002ResultDomain resultDomain = null;
        if ("XX".equals(plntCd)) {
            resultDomain = new Ws9002ResultDomain(WS_RESULT_ERROR);
        } else {
            Ws9002ResultItemDomain resultItemDomain = new Ws9002ResultItemDomain();
            resultItemDomain.setPlantCd("MOCK");
            resultDomain = new Ws9002ResultDomain(WS_RESULT_SUCCESS);
            resultDomain.setPlantInfo(resultItemDomain);
        }
        return resultDomain;
    }

}
