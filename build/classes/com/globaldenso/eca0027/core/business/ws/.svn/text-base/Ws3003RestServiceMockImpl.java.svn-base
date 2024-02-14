/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.ws;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_SUCCESS;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_ERROR;

import java.util.Arrays;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.Ws3003ParamDomain;
import com.globaldenso.eca0027.core.business.domain.Ws3003ResultDomain;
import com.globaldenso.eca0027.core.business.domain.Ws3003ResultItemDomain;

/**
 * Webサービス(WS3003)呼出しサービスのMockクラスです。
 * 
 * @author $Author: TIS Tanaka $
 * @version $Revision:  $
 */
public class Ws3003RestServiceMockImpl implements Ws3003RestService {

    /**
     * <p>デフォルトコンストラクタです。</p>
     */
    public Ws3003RestServiceMockImpl() {
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.ws.Ws3003RestService#getInventoryInfoFromWs(String, List, String, List, String)
     */
    public Ws3003ResultDomain getInventoryInfoFromWs(String compCd,
        Ws3003ParamDomain ws3003ParamDomain) throws ApplicationException {
        
        // 品目情報
        // ********** SNT 追加 Update **********//
//        Ws3003ResultItemDomain item = new Ws3003ResultItemDomain();
//        item.setItemNo("A002TB0091B3N");
//        item.setPlantCd("10");
//        item.setOnHandQty("1");
//        
//        // 結果ドメイン
//        Ws3003ResultDomain result = new Ws3003ResultDomain(WS_RESULT_SUCCESS);
//        result.setInventoryList(Arrays.asList(item));
        Ws3003ResultDomain result = new Ws3003ResultDomain();
        if ("999".equals(compCd)) {
            result = new Ws3003ResultDomain(WS_RESULT_ERROR);
        } else {
            Ws3003ResultItemDomain item = new Ws3003ResultItemDomain();
            item.setItemNo("A002TB0091B3N");
            item.setPlntCd("10");
            item.setOnHandQty("1");

            // 結果ドメイン
            result = new Ws3003ResultDomain(WS_RESULT_SUCCESS);
            result.setInventoryItemList(Arrays.asList(item));
        }
        // ********** SNT 追加 End **********//
        return result;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.ws.Ws3003RestService#getCigmaInventoryFromWs(java.lang.String, com.globaldenso.eca0027.core.business.domain.Ws3003ParamDomain)
     */
    public Ws3003ResultDomain getCigmaInventoryFromWs(String compCd,
        Ws3003ParamDomain ws3003ParamDomain) throws ApplicationException {
        // TODO 自動生成されたメソッド・スタブ
        return null;
    }

}
