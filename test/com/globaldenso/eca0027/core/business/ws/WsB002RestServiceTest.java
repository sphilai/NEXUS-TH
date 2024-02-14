/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.business.ws;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_SUCCESS;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_ERROR;
import static org.junit.Assert.assertEquals;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.globaldenso.eca0027.core.AbstractEca0027Test;
import com.globaldenso.eca0027.core.business.domain.ResultDomain;

/**
 * 
 * Type in the functional overview of the class.
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class WsB002RestServiceTest extends AbstractEca0027Test {

    /**
     * Serviceクラス
     */
    protected WsB002RestService wsb002RestService;
    
    /**
     * デフォルトコンストラクタです。
     */
    public WsB002RestServiceTest() {
        super();
    }

    /**
     * Setter method for WsB002RestService.
     *
     * @param WsB002RestService Set for WsB002RestService
     */
    public void setWsB002RestService(WsB002RestService WsB002RestService) {
        this.wsb002RestService = WsB002RestService;
    }

    /**
     * Serviceクラスインスタンス生成
     */
    @Before
    public void setUp(){
        wsb002RestService = (WsB002RestService) getContext().getBean("wsB002RestService");
    }
    
    /**
     * <br />正常系テスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testSearchOdrEntryDtlOnHand001() throws Exception {
        
        // 入力ドメインの設定
        String compCd  = "MYF";
        String customerNoLegacy = "1";
        String shipToNoLegacy = "1";
        String partNo = "TG123456-7890V0";
        String pkgCode = "1";
        String transportationCode = "1";
        List<String> indexList = new ArrayList<String>();
        String index = "1";
        indexList.add(index);
        List<Date> etdDueDtList = new ArrayList<Date>();
        Date etdDueDt = DateFormat.getDateInstance().parse("2014/05/20");
        etdDueDtList.add(etdDueDt);
        List<String> customerItemNoList = new ArrayList<String>();
        String customerItemNo = "TG123456-7890V0";
        customerItemNoList.add(customerItemNo);
        
        ResultDomain resultDomain = wsb002RestService.searchOdrEntryDtlOnHand(compCd, customerNoLegacy, shipToNoLegacy, partNo, pkgCode, transportationCode, indexList, etdDueDtList, customerItemNoList);
        assertEquals(resultDomain.getResultCode(), WS_RESULT_SUCCESS);
    }
    /**
     * <br />正常系テスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testSearchOdrEntryDtlOnHand002() throws Exception {
        
        // 入力ドメインの設定
        String compCd  = "MYF";
        String customerNoLegacy = "10000000";
        String shipToNoLegacy = "12";
        String partNo = "CUS-PARTNO_100000000";
        String pkgCode = "123";
        String transportationCode = "1";
        List<String> indexList = new ArrayList<String>();
        String index = "1";
        indexList.add(index);
        List<Date> etdDueDtList = new ArrayList<Date>();
        Date etdDueDt = DateFormat.getDateInstance().parse("2014/05/20");
        etdDueDtList.add(etdDueDt);
        List<String> customerItemNoList = new ArrayList<String>();
        String customerItemNo = "CUS-PARTNO_100000000";
        customerItemNoList.add(customerItemNo);
        
        ResultDomain resultDomain = wsb002RestService.searchOdrEntryDtlOnHand(compCd, customerNoLegacy, shipToNoLegacy, partNo, pkgCode, transportationCode, indexList, etdDueDtList, customerItemNoList);
        assertEquals(resultDomain.getResultCode(), WS_RESULT_SUCCESS);
    }

    /**
     * <br />異常系テスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testNoSearchOdrEntryDtlOnHand() throws Exception {
        
        // 入力ドメインの設定
        String compCd  = "MYF";
        String customerNoLegacy = "12345678";
        String shipToNoLegacy = "12";
        String partNo = "12345678901234567890";
        String pkgCode = "123";
        String transportationCode = "1";
        List<String> indexList = new ArrayList<String>();
        String index = "1";
        indexList.add(index);
        List<Date> etdDueDtList = new ArrayList<Date>();
        Date etdDueDt = DateFormat.getDateInstance().parse("2999/05/20");
        etdDueDtList.add(etdDueDt);
        List<String> customerItemNoList = new ArrayList<String>();
        String customerItemNo = "TG999999-9999V9";
        customerItemNoList.add(customerItemNo);
        
        ResultDomain resultDomain = wsb002RestService.searchOdrEntryDtlOnHand(compCd, customerNoLegacy, shipToNoLegacy, partNo, pkgCode, transportationCode, indexList, etdDueDtList, customerItemNoList);
        assertEquals(resultDomain.getResultCode(), WS_RESULT_ERROR);
    }
}
