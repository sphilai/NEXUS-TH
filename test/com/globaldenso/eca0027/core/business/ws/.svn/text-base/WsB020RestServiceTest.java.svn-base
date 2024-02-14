/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.business.ws;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0058;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_SUCCESS;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.globaldenso.ai.common.core.exception.SystemException;
import com.globaldenso.eca0027.core.AbstractEca0027Test;
import com.globaldenso.eca0027.core.business.domain.ResultDomain;

/**
 * 
 * Type in the functional overview of the class.
 * 
 * @author $Author: t-sakai $
 * @version $Revision: 10949 $
 */
public class WsB020RestServiceTest extends AbstractEca0027Test {
    
    /**
     * Serviceクラス
     */
    protected WsB020RestService wsB020RestService;
    
    /**
     * デフォルトコンストラクタです。
     */
    public WsB020RestServiceTest() {
        super();
    }

    /**
     * Setter method for wsB020RestService.
     *
     * @param wsB020RestService Set for wsB020RestService
     */
    public void setwsB020RestService(WsB020RestService wsB020RestService) {
        this.wsB020RestService = wsB020RestService;
    }

    /**
     * Serviceクラスインスタンス生成
     */
    @Before
    public void setUp(){
        wsB020RestService = (WsB020RestService) getContext().getBean("wsB020RestService");
    }
    
    /**
     * <br />正常系テスト
     * <pre>
     * テストを実行しますと、「EC200PR」の「JOB STATUS(JBSTS)」の値が'1'に更新されます。
     * 本テストは、「EC200PR」のJOBNO=E213レコードが存在しない場合は、異常となります。
     * </pre>
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testUpdateEdiRcvOdrStatus00() throws Exception {
        
        // 入力ドメインの設定
        String rcvOdrCompCd = "MYF";
        String jobStatus = "1";
        
        ResultDomain resultDomain = wsB020RestService.updateEdiRcvOdrStatus(rcvOdrCompCd, jobStatus, "E213");
        assertEquals(resultDomain.getResultCode(), WS_RESULT_SUCCESS);
    }
    /**
     * <br />テスト
     * <pre>
     * テストを実行しますと、「EC200PR」の「JOB STATUS(JBSTS)」の値が'2'に更新されます。
     * 本テストは、「EC200PR」のJOBNO=E213レコードが存在しない場合も、エラーを取得し、正常終了します。
     * </pre>
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testUpdateEdiRcvOdrStatus01() throws Exception {
        
        // 入力ドメインの設定
        String rcvOdrCompCd = "MYF";
        String jobStatus = "2";
        
        ResultDomain resultDomain = null;
        try {
            resultDomain = wsB020RestService.updateEdiRcvOdrStatus(rcvOdrCompCd, jobStatus, "E213");
        } catch (SystemException e) {
            assertEquals(e.getMessage(), NXS_E1_0058);
        }
        if (null != resultDomain) {
            assertEquals(resultDomain.getResultCode(), WS_RESULT_SUCCESS);
        }
    }
    /**
     * <br />正常系テスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testUpdateEdiRcvOdrStatus10() throws Exception {
        
        // 入力ドメインの設定
        String rcvOdrCompCd = "MYF";
//        String jobStatus = "null";

        try {
            wsB020RestService.updateEdiRcvOdrStatus(rcvOdrCompCd, null, "E213");
        } catch (SystemException e) {
            assertEquals(e.getMessage(), NXS_E1_0058);
        }

    }
}
