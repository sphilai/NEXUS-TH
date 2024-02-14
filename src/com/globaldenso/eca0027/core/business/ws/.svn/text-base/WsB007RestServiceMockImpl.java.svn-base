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
import com.globaldenso.eca0027.core.common.business.service.CommonService;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_SUCCESS;

/**
 * The mock class for the Web Call Service (WSB007)
 * <br />Webサービス(WSB007)呼出しサービスのMockクラスです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class WsB007RestServiceMockImpl implements WsB007RestService {

    /**
     * 共通サービス
     */
    protected CommonService commonService;
    
    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public WsB007RestServiceMockImpl() {
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
     * @see com.globaldenso.eca0027.core.business.ws.WsB007RestService#reflectToCusOdr(String, WsB007ParamDomain)
     */
    public ResultDomain reflectToCusOdr(String compCd, WsB007ParamDomain param) throws ApplicationException {
        return new ResultDomain(WS_RESULT_SUCCESS);
    }
}
