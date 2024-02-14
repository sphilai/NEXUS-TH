/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.business.ws;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_ERROR_SYSTEM;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_SUCCESS;
import static org.junit.Assert.assertEquals;

import java.text.DateFormat;
import java.util.Date;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.globaldenso.eca0027.core.AbstractEca0027Test;
import com.globaldenso.eca0027.core.business.domain.ResultDomain;

/**
 * 
 * WsB009 Unit test class.
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class WsB009RestServiceTest extends AbstractEca0027Test {

    /** ApplicationContext */
    private static ClassPathXmlApplicationContext applicationContext;
    
    /**
     * Serviceクラス
     */
    protected WsB009RestService wsb009RestService;
    
    /**
     * デフォルトコンストラクタです。
     */
    public WsB009RestServiceTest() {
        super();
    }

    /**
     * Setter method for WsB009RestService.
     *
     * @param WsB009RestService Set for WsB009RestService
     */
    public void setWsB009RestService(WsB009RestService WsB009RestService) {
        this.wsb009RestService = WsB009RestService;
    }

    /**
     * 準備
     */
    @BeforeClass
    public static void setUpClass() {
        applicationContext =
            new ClassPathXmlApplicationContext(
                "WsB009RestServiceTest-applicationContext.xml", WsB009RestServiceTest.class);
    }
    
    /**
     * Serviceクラスインスタンス生成
     */
    @Before
    public void setUp(){
        wsb009RestService = (WsB009RestService) applicationContext.getBean("wsB009RestService");
    }
    
    /**
     * 後始末
     */
    @AfterClass
    public static void tearDownClass() {
        if (applicationContext != null) {
            applicationContext.destroy();
        }
    }
    
    /**
     * <br />正常系テスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testCallEdiOdrEntryJob() throws Exception {
        
        // 入力ドメインの設定
        String rcvOdrCompCd = "MYF";
        Date cigmaAds = DateFormat.getDateInstance().parse("2014/04/19");
        
        ResultDomain resultDomain = wsb009RestService.callEdiOdrEntryJob(rcvOdrCompCd, cigmaAds);
        assertEquals(resultDomain.getResultCode(), WS_RESULT_SUCCESS);
    }
    
    /**
     * <br />正常系テスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testNoCallEdiOdrEntryJob() throws Exception {
        
        // 入力ドメインの設定
        // rcvOdrCompCdに登録できないデータを設定(1000文字以上)
        String base = "0123456789";
        StringBuffer rcvOdrCompCd = new StringBuffer();
        rcvOdrCompCd.append("MYF");
        for (int i = 0; i < 100; i++) {
            rcvOdrCompCd.append(base);
        }
        Date cigmaAds = DateFormat.getDateInstance().parse("2014/04/18");
        
        ResultDomain resultDomain = wsb009RestService.callEdiOdrEntryJob(rcvOdrCompCd.toString(), cigmaAds);
        assertEquals(resultDomain.getResultCode(), WS_RESULT_ERROR_SYSTEM);
    }
}
