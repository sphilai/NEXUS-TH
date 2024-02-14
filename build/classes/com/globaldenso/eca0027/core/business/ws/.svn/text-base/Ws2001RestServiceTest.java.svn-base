/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.business.ws;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_ERROR_SYSTEM;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_SUCCESS;
import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import com.globaldenso.ai.common.core.exception.SystemException;
import com.globaldenso.eca0027.core.AbstractEca0027Test;
import com.globaldenso.eca0027.core.business.domain.Ws2001ResultDomain;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;

/**
 * 
 * Type in the functional overview of the class.
 * 
 * @author $Author: 810833843 $
 * @version $Revision: 8323 $
 */
public class Ws2001RestServiceTest extends AbstractEca0027Test {
    
    /**
     * Serviceクラス
     */
    protected Ws2001RestService ws2001RestService;

    /**
     * デフォルトコンストラクタです。
     */
    public Ws2001RestServiceTest() {
        super();
    }
    
    /**
     * Setter method for ws2001RestService.
     *
     * @param ws2001RestService Set for ws2001RestService
     */
    public void setWs2001RestService(Ws2001RestService ws2001RestService) {
        this.ws2001RestService = ws2001RestService;
    }

    /**
     * Serviceクラスインスタンス生成
     */
    @Before
    public void setUp(){
        ws2001RestService = (Ws2001RestService) getContext().getBean("ws2001RestService");
    }
    
    /**
     * <br />正常系テスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testSearchWorkingDay() throws Exception {
        
        // 入力パラメータの設定
        String compCd = "MYF";
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
        Date baseDate = dateFormat.parse("20140115");
        int beforeDays = 2;
        int afterDays = 4;
        
        Ws2001ResultDomain resultDomain = ws2001RestService.searchWorkingDay(compCd, baseDate, beforeDays, afterDays);
        assertEquals(resultDomain.getResultCode(), WS_RESULT_SUCCESS);
    }
    
    /**
     * <br />異常系テスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testNoSearchWorkingDay() throws Exception {
        
        // 入力パラメータの設定
        String compCd = "MYF";
//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
//        Date baseDate = null;
        int beforeDays = 2;
        int afterDays = 4;
        
        Ws2001ResultDomain resultDomain = ws2001RestService.searchWorkingDay(compCd, null, beforeDays, afterDays);
        assertEquals(resultDomain.getResultCode(), WS_RESULT_ERROR_SYSTEM);
    }
    
    /**
     * <br />異常系テスト (CIGMA利用不可)
     * 
     * <pre>
     * ・SC100PR.ONSTS＝2に設定して実行
     * </pre>
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    @SuppressWarnings("deprecation")
    public void testCigmaUnavailable() throws Exception {
        try {
            ws2001RestService.searchWorkingDay("TG0", new Date(114, 8, 3), 2, 4);
            fail();
        } catch (GscmApplicationException e) {
            assertEquals(e.getCode(), "NXS-E1-0060");
        }
    }
    
    /**
     * <br />異常系テスト (システムエラー)
     * 
     * <pre>
     * ・SqlMap-WsCigmaEisProduct.xml (SearchRelativeWeekCalenderFileを修正 / テーブル名を変更)
     * ・接続先のURLをローカルURLに変更
     * </pre>
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    @SuppressWarnings("deprecation")
    public void testSystemError() throws Exception {
        try {
            ws2001RestService.searchWorkingDay("TG0", new Date(114, 8, 3), 2, 4);
            fail();
        } catch (SystemException e) {
            assertEquals(e.getCode(), "NXS-E1-0058");
        }
    }
}
