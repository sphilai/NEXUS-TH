/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.business.ws;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_SUCCESS;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_ERROR;
import static junit.framework.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.globaldenso.eca0027.core.AbstractEca0027Test;
import com.globaldenso.eca0027.core.business.domain.Ws9001ResultDomain;

/**
 * 
 * Type in the functional overview of the class.
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class Ws9001RestServiceTest extends AbstractEca0027Test {

    /**
     * Serviceクラス
     */
    protected Ws9001RestService ws9001RestService;
    
    /**
     * デフォルトコンストラクタです。
     */
    public Ws9001RestServiceTest() {
        super();
    }

    /**
     * Setter method for ws7002RestService.
     *
     * @param ws9001RestService Set for ws9001RestService
     */
    public void setWs9001RestService(Ws9001RestService ws9001RestService) {
        this.ws9001RestService = ws9001RestService;
    }

    /**
     * Serviceクラスインスタンス生成
     */
    @Before
    public void setUp(){
        ws9001RestService = (Ws9001RestService) getContext().getBean("ws9001RestService");
    }
    
    /**
     * <br />正常系テスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testGetItemInfoForMa01() throws Exception {
        
        // 入力ドメインの設定
        String compCd = "MYF";
        String itemNo = "TG123456-7890V0";
        String customerNo = "";

        Ws9001ResultDomain ws9001ResultDomain = ws9001RestService.getItemInfoForMa(compCd, itemNo, customerNo);
        assertEquals(ws9001ResultDomain.getResultCode(), WS_RESULT_SUCCESS);
    }
    /**
     * <br />正常系テスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testGetItemInfoForMa02() throws Exception {
        
        // 入力ドメインの設定
        String compCd = "MYF";
        String itemNo = "TG123456-7890V0";
        String customerNo = "30001205";

        Ws9001ResultDomain ws9001ResultDomain = ws9001RestService.getItemInfoForMa(compCd, itemNo, customerNo);
        assertEquals(ws9001ResultDomain.getResultCode(), WS_RESULT_SUCCESS);
    }
    /**
     * <br />正常系テスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testGetItemInfoForMa03() throws Exception {
        
        // 入力ドメインの設定
        String compCd = "MYF";
        String itemNo = "";
        String customerNo = "";

        Ws9001ResultDomain ws9001ResultDomain = ws9001RestService.getItemInfoForMa(compCd, itemNo, customerNo);
        assertEquals(ws9001ResultDomain.getResultCode(), WS_RESULT_SUCCESS);
    }
    /**
     * <br />異常系テスト(実行前にSC100PRを削除)
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testNoGetItemInfoForMa() throws Exception {
        
        // 入力ドメインの設定
        String compCd = "MYF";
        String itemNo = "TG123456-7890V0";
        String customerNo = "1";

        Ws9001ResultDomain ws9001ResultDomain = ws9001RestService.getItemInfoForMa(compCd, itemNo, customerNo);
        assertEquals(ws9001ResultDomain.getResultCode(), WS_RESULT_ERROR);
    }
}
