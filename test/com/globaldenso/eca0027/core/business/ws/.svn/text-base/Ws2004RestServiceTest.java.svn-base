/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.business.ws;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_SUCCESS;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_ERROR;
import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.globaldenso.ai.common.core.exception.SystemException;
import com.globaldenso.eca0027.core.AbstractEca0027Test;
import com.globaldenso.eca0027.core.business.domain.Ws2004ResultDomain;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;

/**
 * 
 * Type in the functional overview of the class.
 * 
 * @author $Author: 810833843 $
 * @version $Revision: 8323 $
 */
public class Ws2004RestServiceTest extends AbstractEca0027Test {
    
    /**
     * Serviceクラス
     */
    protected Ws2004RestService ws2004RestService;

    /**
     * デフォルトコンストラクタです。
     */
    public Ws2004RestServiceTest() {
        super();
    }
    
    /**
     * Setter method for ws2004RestService.
     *
     * @param ws2004RestService Set for ws2004RestService
     */
    public void setWs2004RestService(Ws2004RestService ws2004RestService) {
        this.ws2004RestService = ws2004RestService;
    }

    /**
     * Serviceクラスインスタンス生成
     */
    @Before
    public void setUp(){
        ws2004RestService = (Ws2004RestService) getContext().getBean("ws2004RestService");
    }
    
    /**
     * <br />正常系テスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testSearchItemInfoForCml() throws Exception {
        
        // 入力パラメータの設定
        String compCd = "MYF";
        String[] plantCdArray = {"A1", "A2"};
        List<String> plantCdList = Arrays.asList(plantCdArray);
        String whCd = "1";
        String[] itemNoArray = {"TG123456-7890V0", "TG345678-9012V0"};
        List<String> itemNoList = Arrays.asList(itemNoArray);
        String customerCd = "30001206";
        
        Ws2004ResultDomain resultDomain = ws2004RestService.searchItemInfoForCml(compCd, plantCdList, whCd, itemNoList, customerCd);
        assertEquals(resultDomain.getResultCode(), WS_RESULT_SUCCESS);
    }
    
    /**
     * <br />異常系テスト(実行前にSC100PRを削除)
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testNoSearchItemInfoForCml() throws Exception {
        
        // 入力パラメータの設定
        String compCd = "MYF";
        String[] plantCdArray = {"A1", "A2"};
        List<String> plantCdList = Arrays.asList(plantCdArray);
        String whCd = "A101";
        String[] itemNoArray = {"TG123456-7890V0", "TG345678-9012V0"};
        List<String> itemNoList = Arrays.asList(itemNoArray);
        String customerCd = "12345";
        
        Ws2004ResultDomain resultDomain = ws2004RestService.searchItemInfoForCml(compCd, plantCdList, whCd, itemNoList, customerCd);
        assertEquals(resultDomain.getResultCode(), WS_RESULT_ERROR);
    }
    
    /**
     * <br />CIGMA利用不可のテスト (SC100PR.ONSTS=2に設定)
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testCigmaUnavailable() throws Exception {
        try {
            ws2004RestService.searchItemInfoForCml("TG0", Arrays.asList("A1"), "1", Arrays.asList("TG428000-19858I"), "50001402");
            fail();
        } catch (GscmApplicationException e) {
            assertEquals(e.getCode(), "NXS-E1-0060");
        }
    }
    
    /**
     * <br />システムエラーのテスト (SqlMap-WsCigmaEisProduct.xmlの修正)
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testSystemException() throws Exception {
        try {
            ws2004RestService.searchItemInfoForCml("TG0", Arrays.asList("A1"), "1", Arrays.asList("TG428000-19858I"), "50001402");;
            fail();
        } catch (SystemException e) {
            assertEquals(e.getCode(), "NXS-E1-0058");
        }
    }
}
