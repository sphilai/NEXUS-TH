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
import java.util.Date;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.ErrorListItemDomain;
import com.globaldenso.eca0027.core.business.domain.WsB001ResultDomain;
import com.globaldenso.eca0027.core.business.domain.WsB001ResultItemDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;

/**
 * The mock class for the Web Call Service (WSB001) <br />
 * Webサービス(WSB001)呼出しサービスのMockクラスです。
 * 
 * @author $Author: 810833843 $
 * @version $Revision: 6761 $
 */
public class WsB001RestServiceMockImpl implements WsB001RestService  {

    /**
     * 共通サービス
     */
    protected CommonService commonService;
    
    /**
     * constructor. <br />
     * デフォルトコンストラクタです。
     */
    public WsB001RestServiceMockImpl() {
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
     * @see com.globaldenso.eca0027.core.business.ws.WsB001RestService#searchOdrEntryHdrOnHand(String, String, String, String, String, Date)
     */
    public WsB001ResultDomain searchOdrEntryHdrOnHand(String compCd, String customerNoLegacy, 
        String shipToNoLegacy, String partNo, String pkgCode, Date startDt) throws ApplicationException {
        
        // 結果ドメインの設定
        WsB001ResultDomain wsB001ResultDomain = new WsB001ResultDomain();
        
        boolean errFlg = false;
        boolean warOnlyFlg = false;
        
        if (!errFlg){
            wsB001ResultDomain.setResultCode("0");
            wsB001ResultDomain.setPartName("wsb001PartName");
            wsB001ResultDomain.setPlantCodeLegacy("M1");
            wsB001ResultDomain.setSupplierCode("sup");

            List<WsB001ResultItemDomain> dateList = new ArrayList<WsB001ResultItemDomain>();

            try {
                //0-1件目
                WsB001ResultItemDomain item01 = new WsB001ResultItemDomain();
                item01.setDate("20140424");
                item01.setWorkDayFlag(true);
                item01.setCustomerPartNo("customerPartNo");
                dateList.add(item01);

                //0-2件目
                WsB001ResultItemDomain item02 = new WsB001ResultItemDomain();
                item02.setDate("20140425");
                item02.setWorkDayFlag(true);
                item02.setCustomerPartNo("customerPartNo");
                dateList.add(item02);

                //0-3件目
                WsB001ResultItemDomain item03 = new WsB001ResultItemDomain();
                item03.setDate("20140428");
                item03.setWorkDayFlag(true);
                item03.setCustomerPartNo("customerPartNo");
                dateList.add(item03);

                //0-4件目
                WsB001ResultItemDomain item04 = new WsB001ResultItemDomain();
                item04.setDate("20140429");
                item04.setWorkDayFlag(false);
                item04.setCustomerPartNo("customerPartNo");
                dateList.add(item04);

                //1件目
                WsB001ResultItemDomain item1 = new WsB001ResultItemDomain();
                item1.setDate("20140430");
                item1.setWorkDayFlag(true);
                item1.setCustomerPartNo("customerPartNo");
                dateList.add(item1);

                //2件目
                WsB001ResultItemDomain item2 = new WsB001ResultItemDomain();
                item2.setDate("20140530");
                item2.setWorkDayFlag(true);
                item2.setCustomerPartNo("customerPartNo");
                dateList.add(item2);

                //3件目
                WsB001ResultItemDomain item3 = new WsB001ResultItemDomain();
                item3.setDate("20140630");
                item3.setWorkDayFlag(true);
                item3.setCustomerPartNo("customerPartNo");
                dateList.add(item3);

                //4件目
                WsB001ResultItemDomain item4 = new WsB001ResultItemDomain();
                item4.setDate("20140731");
                item4.setWorkDayFlag(true);
                item4.setCustomerPartNo("customerPartNo");
                dateList.add(item4);

                //5件目
                WsB001ResultItemDomain item5 = new WsB001ResultItemDomain();
                item5.setDate("20140829");
                item5.setWorkDayFlag(true);
                item5.setCustomerPartNo("customerPartNo");
                dateList.add(item5);
            } catch (Exception e) {
            }
            wsB001ResultDomain.setDateList(dateList);
        } else {
            wsB001ResultDomain.setResultCode("1");
            wsB001ResultDomain.setPlantCodeLegacy("M1");
            
            List<ErrorListItemDomain> errorList = new ArrayList<ErrorListItemDomain>();
            
            
            String[] errCode = {
//                "NXS-E7-0035",
//                "NXS-E7-0028" 
//                "NXS-E7-0027"
//                "NXS-E7-0029", 
                "NXS-E7-0030", 
                "NXS-W1-0002",
                "NXS-W1-0003"
            };
            
            for (int i = 0; i < errCode.length; i++){
                if (warOnlyFlg){
                    if (errCode[i].startsWith("NXS-W")){
                        ErrorListItemDomain error = new ErrorListItemDomain();
                        String errorCode = new String(errCode[i]);
                        error.setErrorCode(errorCode);
                        errorList.add(error);
                    }
                } else {
                    ErrorListItemDomain error = new ErrorListItemDomain();
                    String errorCode = new String(errCode[i]);
                    error.setErrorCode(errorCode);
                    errorList.add(error);
                }
            }
            
//            List<ErrorParamListItemDomain> errorParamList = new ArrayList<ErrorParamListItemDomain>();
//            ErrorParamListItemDomain errorParam1 = new ErrorParamListItemDomain();
//            ErrorParamListItemDomain errorParam2 = new ErrorParamListItemDomain();
//            
//            String paramCustomerNoLegacy = new String("customerNoLegacy");
//            String paramPartNo  = new String("partNo");
//            
//            errorParam1.setParam(paramCustomerNoLegacy);
//            errorParam2.setParam(paramPartNo);
//
//            errorParamList.add(errorParam1);
//            errorParamList.add(errorParam2);
//            
//            error.setErrorParamList(errorParamList);
            
            wsB001ResultDomain.setErrorList(errorList);
            
            //wsB001ResultDomain.setPartName("wsb001PartName");
            //wsB001ResultDomain.setPlantCodeLegacy("M1");
            wsB001ResultDomain.setSupplierCode("sup");

            List<WsB001ResultItemDomain> dateList = new ArrayList<WsB001ResultItemDomain>();

            try {
                //0-1件目
                WsB001ResultItemDomain item01 = new WsB001ResultItemDomain();
                item01.setDate("20140424");
                item01.setWorkDayFlag(true);
                item01.setCustomerPartNo("customerPartNo");
                dateList.add(item01);

                //0-2件目
                WsB001ResultItemDomain item02 = new WsB001ResultItemDomain();
                item02.setDate("20140425");
                item02.setWorkDayFlag(true);
                item02.setCustomerPartNo("customerPartNo");
                dateList.add(item02);

                //0-3件目
                WsB001ResultItemDomain item03 = new WsB001ResultItemDomain();
                item03.setDate("20140428");
                item03.setWorkDayFlag(true);
                item03.setCustomerPartNo("customerPartNo");
                dateList.add(item03);

                //0-4件目
                WsB001ResultItemDomain item04 = new WsB001ResultItemDomain();
                item04.setDate("20140429");
                item04.setWorkDayFlag(false);
                item04.setCustomerPartNo("customerPartNo");
                dateList.add(item04);

                //1件目
                WsB001ResultItemDomain item1 = new WsB001ResultItemDomain();
                item1.setDate("20140430");
                item1.setWorkDayFlag(true);
                item1.setCustomerPartNo("customerPartNo");
                dateList.add(item1);

                //2件目
                WsB001ResultItemDomain item2 = new WsB001ResultItemDomain();
                item2.setDate("20140530");
                item2.setWorkDayFlag(true);
                item2.setCustomerPartNo("customerPartNo");
                dateList.add(item2);

                //3件目
                WsB001ResultItemDomain item3 = new WsB001ResultItemDomain();
                item3.setDate("20140630");
                item3.setWorkDayFlag(true);
                item3.setCustomerPartNo("customerPartNo");
                dateList.add(item3);

                //4件目
                WsB001ResultItemDomain item4 = new WsB001ResultItemDomain();
                item4.setDate("20140731");
                item4.setWorkDayFlag(true);
                item4.setCustomerPartNo("customerPartNo");
                dateList.add(item4);

                //5件目
                WsB001ResultItemDomain item5 = new WsB001ResultItemDomain();
                item5.setDate("20140829");
                item5.setWorkDayFlag(true);
                item5.setCustomerPartNo("customerPartNo");
                dateList.add(item5);
            } catch (Exception e) {
            }
            wsB001ResultDomain.setDateList(dateList);
        }
        return wsB001ResultDomain;
    }
}
