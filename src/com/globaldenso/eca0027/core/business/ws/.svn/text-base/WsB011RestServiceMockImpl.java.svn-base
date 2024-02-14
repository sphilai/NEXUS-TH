/*
 * Project : NEXUS_EXPORT
 *
 * 更新日       更新者                  更新内容
 * 2014/01/01   DENSO IT SOLUTIONS      新規作成
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.ws;

import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.ErrorListItemDomain;
import com.globaldenso.eca0027.core.business.domain.WsB011ResultDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;

//import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_N;
//import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0010;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_91_0001;
//import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_ERROR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_SUCCESS;

/**
 * The mock class for the Web Call Service (WsB011) <br />
 * Webサービス(WsB011)呼出しサービスのMockクラスです。
 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class WsB011RestServiceMockImpl implements WsB011RestService {

    /**
     * 共通サービス
     */
    protected CommonService commonService;
    
    /**
      * constructor. <br />
     * デフォルトコンストラクタです。
     */
    public WsB011RestServiceMockImpl() {
    }

    /**
     * Setter method for commonService.
     *
     * @param commonService Set for commonService
     */
    public void setCommonService(CommonService commonService) {
        this.commonService = commonService;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.ws.WsB011RestService#searchEdiSupport(String, String, String)
     */
    public WsB011ResultDomain searchEdiSupport(String compCd, String customerSubsidiaryCode, String shipToNoLegacy)
        throws ApplicationException {

        WsB011ResultDomain wsB011ResultDomain = new WsB011ResultDomain();
        wsB011ResultDomain.setResultCode(WS_RESULT_SUCCESS);
//        wsB011ResultDomain.setFlag(FLAG_Y);
        //wsB011ResultDomain.setFlag(FLAG_N);
        
//        wsB011ResultDomain.setResultCode(WS_RESULT_ERROR);
        List<ErrorListItemDomain> errorList = new ArrayList<ErrorListItemDomain>();
        ErrorListItemDomain error1 = new ErrorListItemDomain();
        error1.setErrorCode(NXS_91_0001);
        ErrorListItemDomain error2 = new ErrorListItemDomain();
        error2.setErrorCode(GSCM_E0_0010);
        errorList.add(error1);
        errorList.add(error2);
//        wsB011ResultDomain.setErrorList(errorList);
        
        return wsB011ResultDomain;
    }
}
