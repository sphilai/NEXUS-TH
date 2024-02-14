/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.business.ws;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_ERROR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_SUCCESS;
import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.globaldenso.eca0027.core.AbstractEca0027Test;
import com.globaldenso.eca0027.core.business.domain.Ws2002ResultDomain;

/**
 * 
 * Type in the functional overview of the class.
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class Ws2002RestServiceTest extends AbstractEca0027Test {
    
    /**
     * Serviceクラス
     */
    protected Ws2002RestService ws2002RestService;

    /**
     * デフォルトコンストラクタです。
     */
    public Ws2002RestServiceTest() {
        super();
    }
    
    /**
     * Setter method for ws2002RestService.
     *
     * @param ws2002RestService Set for ws2002RestService
     */
    public void setWs2002RestService(Ws2002RestService ws2002RestService) {
        this.ws2002RestService = ws2002RestService;
    }

    /**
     * Serviceクラスインスタンス生成
     */
    @Before
    public void setUp(){
        ws2002RestService = (Ws2002RestService) getContext().getBean("ws2002RestService");
    }
    
    /**
     * <br />正常系テスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testGetItemInfoForPltzIns() throws Exception {
        
        // 入力パラメータの設定
        String compCd = "MYF";
        String plantCd = "A1";
        String whCd = "1";
        String[] itemNoArray = {"TG123456-7890V0", "TG123456-7900V01", "TG234567-8901V0", "TG345678-9012V0"};
        List<String> itemNoList = Arrays.asList(itemNoArray);
        String customerCd = "30001205";
        String shipToCd = "12";
        
        Ws2002ResultDomain resultDomain = ws2002RestService.getItemInfoForPltzIns(compCd, plantCd, whCd, itemNoList, customerCd, shipToCd);
        assertEquals(resultDomain.getResultCode(), WS_RESULT_SUCCESS);
    }
    
    /**
     * <br />異常系テスト(実行前にSC100PRを削除)
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testNoGetItemInfoForPltzIns() throws Exception {
        
        // 入力パラメータの設定
        String compCd = "MYF";
        String plantCd = "A1";
        String whCd = "A101";
        String[] itemNoArray = {"TG123456-7890V0", "TG123456-7900V01", "TG234567-8901V0", "TG345678-9012V0"};
        List<String> itemNoList = Arrays.asList(itemNoArray);
        String customerCd = "1";
        String shipToCd = "1";
        
        Ws2002ResultDomain resultDomain = ws2002RestService.getItemInfoForPltzIns(compCd, plantCd, whCd, itemNoList, customerCd, shipToCd);
        assertEquals(resultDomain.getResultCode(), WS_RESULT_ERROR);
    }
}
