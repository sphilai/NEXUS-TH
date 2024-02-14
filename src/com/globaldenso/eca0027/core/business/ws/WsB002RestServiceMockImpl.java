/*
 * Project : NEXUS_EXPORT
 *
 * 更新日       更新者                  更新内容
 * 2014/01/01   DENSO IT SOLUTIONS      新規作成
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.ws;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.ErrorListItemSubDomain;
import com.globaldenso.eca0027.core.business.domain.ErrorParamListItemDomain;
import com.globaldenso.eca0027.core.business.domain.WsB002ResultDomain;
import com.globaldenso.eca0027.core.business.domain.WsB002ResultItemDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.util.DateUtil;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_CIGMA_DATE_FORMAT;

/**
 * The mock class for the Web Call Service (WSB002)
 * <br />Webサービス(WSB002)呼出しサービスの実装クラスです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class WsB002RestServiceMockImpl implements WsB002RestService {

    /**
     * 共通サービス
     */
    protected CommonService commonService;
    
    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public WsB002RestServiceMockImpl() {
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
     * @see com.globaldenso.eca0027.core.business.ws.WsB002RestService#searchOdrEntryDtlOnHand(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, java.util.List)
     */
    public WsB002ResultDomain searchOdrEntryDtlOnHand(
        String compCd,
        String customerNoLegacy, 
        String shipToNoLegacy, 
        String partNo, 
        String pkgCode, 
        String transportationCode, 
        List<String> indexList,
        List<Date> etdDueDtList,
        List<String> customerItemNoList) throws ApplicationException {
        
        // 日付フォーマット
        SimpleDateFormat sdf = new SimpleDateFormat(WS_CIGMA_DATE_FORMAT);
        
        // 結果ドメインの設定
        WsB002ResultDomain result = new WsB002ResultDomain();

        boolean errFlg = false;
        
        if (!errFlg){
            result.setResultCode("0");
            List<WsB002ResultItemDomain> customerOrderList = new ArrayList<WsB002ResultItemDomain>();

            for (int i = 0; i < indexList.size() ; i++){
                WsB002ResultItemDomain wsB002ResultItem = new WsB002ResultItemDomain();
                wsB002ResultItem.setIndex(Integer.parseInt(indexList.get(i)));
                wsB002ResultItem.setShippingDueDate(DateUtil.formatDate(etdDueDtList.get(i), "yyyyMMdd"));
                customerOrderList.add(wsB002ResultItem);
            }
            result.setCustomerOrderList(customerOrderList);
            
        } else {
            result.setResultCode("1");
            List<WsB002ResultItemDomain> customerOrderList = new ArrayList<WsB002ResultItemDomain>();

            for (int i = 0; i < indexList.size() ; i++){
                
                WsB002ResultItemDomain customerOrder = new WsB002ResultItemDomain();
                
                customerOrder.setIndex(Integer.parseInt(indexList.get(i)));
                //customerOrder.setShippingDueDate(DateUtil. etdDueDtList.get(i));
                List<ErrorListItemSubDomain> errorList = new ArrayList<ErrorListItemSubDomain>();
                
                ErrorListItemSubDomain err = new ErrorListItemSubDomain();
                err.setErrorCode("NXS-E7-0148");
                
                List<ErrorParamListItemDomain> errorParamList = new ArrayList<ErrorParamListItemDomain>();
                ErrorParamListItemDomain param1 = new ErrorParamListItemDomain();
                ErrorParamListItemDomain param2 = new ErrorParamListItemDomain();
                param1.setParam(sdf.format(etdDueDtList.get(i)));
                param2.setParam(indexList.get(i) + 1);
                errorParamList.add(param1);
                errorParamList.add(param2);
                err.setErrorParamList(errorParamList);
                
                errorList.add(err);
                customerOrder.setErrorList(errorList);
                
                customerOrderList.add(customerOrder);
            }
            result.setCustomerOrderList(customerOrderList);            
        }
        
        return result;
    }
}
