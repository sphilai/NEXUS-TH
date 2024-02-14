/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.business.service;

import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import jp.co.dgic.testing.common.virtualmock.MockObjectManager;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.TemporaryFolder;
import org.springframework.aop.framework.AdvisedSupport;

import com.globaldenso.ai.aijb.job.residentrequest.business.domain.ResidentRequestDomain;
import com.globaldenso.ai.aijb.job.residentrequest.business.service.ResidentRequestApplicationService;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.ai.common.core.exception.IntegrationLayerException;
import com.globaldenso.ai.common.core.exception.SystemException;
import com.globaldenso.eca0027.core.AbstractEca0027Test;
import com.globaldenso.eca0027.core.auto.business.domain.TtBatchReqParamDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtExpRcvOdrUpdDomain;
import com.globaldenso.eca0027.core.auto.business.service.TmExpFormalitiItemNoServiceImpl;
import com.globaldenso.eca0027.core.auto.business.service.TtEdiRcvOdrReportServiceImpl;
import com.globaldenso.eca0027.core.auto.business.service.TtEdiRcvOdrRtryServiceImpl;
import com.globaldenso.eca0027.core.auto.business.service.TtEdiRcvOdrServiceImpl;
import com.globaldenso.eca0027.core.auto.business.service.TtExpRcvOdrServiceImpl;
import com.globaldenso.eca0027.core.auto.business.service.TtExpRcvOdrUpdServiceImpl;
import com.globaldenso.eca0027.core.business.domain.B0100EdiRcvOdrDomain;
import com.globaldenso.eca0027.core.business.domain.ErrorListItemDomain;
import com.globaldenso.eca0027.core.business.domain.ErrorParamListItemDomain;
import com.globaldenso.eca0027.core.business.domain.ResultDomain;
import com.globaldenso.eca0027.core.business.domain.WsB006ResultDomain;
import com.globaldenso.eca0027.core.business.domain.WsB008ResultDomain;
import com.globaldenso.eca0027.core.business.domain.WsB008ResultItemDomain;
import com.globaldenso.eca0027.core.business.ws.WsB006RestServiceMockImpl;
import com.globaldenso.eca0027.core.business.ws.WsB007RestServiceImpl;
import com.globaldenso.eca0027.core.business.ws.WsB008RestServiceImpl;
import com.globaldenso.eca0027.core.business.ws.WsB020RestServiceImpl;
import com.globaldenso.eca0027.core.common.business.service.CommonServiceImpl;
import com.globaldenso.eca0027.core.integration.JbEdiRcvOdrDaoImpl;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.*;
import static org.hamcrest.core.IsInstanceOf.*;
import static org.junit.matchers.JUnitMatchers.containsString;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.JOB_STATUS_ABEND;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.JOB_STATUS_NORMAL;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0019;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_91_0001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_SUCCESS;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_ERROR;

/**
 * <br />EDI受注登録バッチのテストクラスです。
 *
 * @author $Author: 810833843 $
 * @version $Revision: 8323 $
 */
public class JbEdiRcvOdrServiceTest extends AbstractEca0027Test {
    /**
     * 例外ルール
     */
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    /**
     * 一時フォルダルール
     */
    @Rule
    public TemporaryFolder folder = new TemporaryFolder();

    /**
     * <br />EDI受注登録バッチのサービス
     */
    private ResidentRequestApplicationService jbEdiRcvOdrService;
    
    /**
     * <br />常駐リクエストバッチのリクエスト
     */
    private ResidentRequestDomain req;
    
    /**
     * <br />受注会社の拠点間コード
     */
    private String rcvOdrCompCd = "TH2";
    
    /**
     * <br />業務日付(CIGMA ADS)
     */
    @SuppressWarnings("deprecation")
    private Date cigmaAds = new Date(114, 4, 6);
    
    /**
     * <br />JbEdiRcvOdrServiceImplのメソッド
     * <pre>
     * ステップごとにテストを分割するために使用
     * </pre>
     */
    private Method method;

    /**
     * <br />受信形態＝オリジナル・追加時に実行しないチェック
     */
    private String[] noCheckMethodOriginalAdd = {
        "validateTtExpRcvOdrLock",                   // 1-1
        "validateShippingIncomplete",                // 2-1
        "validateQtyConsistency",                    // 2-2
        "validateNoPltzAllocOnOdrFirmFlgChanged",    // 2-3
        "validateNoPltzAllocOnEtdChanged",           // 2-4
        "validateNoPltzAllocOnTrnsCdChanged",        // 2-5
        "validateLastFigureChgFlg",                  // 2-6
        "validateNoPltzAllocOnCustomerPoNoChanged",  // 2-7
        "validateEquality"                           // 2-9
    };
    
    /**
     * <br />受信形態＝変更時に実行しないチェック
     */
    private String[] noCheckMethodChange = {
        "validateEquality",              // 2-9
        "validateTmExpItemNoSpInfo",     // 3-5
        "validateTmExpFormalitiItemNo",  // 3-6
        "validateNoTtExpRcvOdr"          // 3-7
    };
    
    /**
     * <br />受信形態＝削除時に実行しないチェック
     */
    private String[] noCheckMethodDelete = {
        "validateNoPltzAllocOnOdrFirmFlgChanged",     // 2-3
        "validateNoPltzAllocOnEtdChanged",            // 2-4
        "validateNoPltzAllocOnTrnsCdChanged",         // 2-5
        "validateLastFigureChgFlg",                   // 2-6
        "validateNoPltzAllocOnCustomerPoNoChanged",   // 2-7
        "validateEquality",                           // 2-9
        "validateTmExpItemNoSpInfo",                  // 3-5
        "validateTmExpFormalitiItemNo",               // 3-6
        "validateNoTtExpRcvOdr",                      // 3-7
        "validateTmExpItemNoSpInfoShipLot",           // 3-9
    };
    
    /**
     * <br />受信形態＝エラー時に実行しないチェック
     */
    private String[] noCheckMethodError = {
        "validateTtExpRcvOdrLock",                    // 1-1
        "validateShippingIncomplete",                 // 2-1
        "validateQtyConsistency",                     // 2-2
        "validateNoPltzAllocOnOdrFirmFlgChanged",     // 2-3
        "validateNoPltzAllocOnEtdChanged",            // 2-4
        "validateNoPltzAllocOnTrnsCdChanged",         // 2-5
        "validateLastFigureChgFlg",                   // 2-6
        "validateNoPltzAllocOnCustomerPoNoChanged",   // 2-7
        "validateTmExpItemNoSpInfo",                  // 3-5
        "validateTmExpFormalitiItemNo",               // 3-6
        "validateNoTtExpRcvOdr",                      // 3-7
        "validateTmExpItemNoSpInfoShipLot",           // 3-9
    };
    
    
    
    /**
     * <br />デフォルトコンストラクタです。
     */
    public JbEdiRcvOdrServiceTest() {
    }
    
    /**
     * <br /テストの前処理を行います。
     */
    @Before
    public void setUp() {
        // EDI受注登録バッチサービスの取得
        jbEdiRcvOdrService = (ResidentRequestApplicationService) getContext().getBean("jbEdiRcvOdrService");

        // 常駐リクエストジョブのリクエストの作成
        req = new ResidentRequestDomain();
        req.setRequestId("00000000000000000001");
    }
    
    
    /**
     * <br />searchBatchReqParamのテスト
     * <pre>
     * 正常系のテスト
     * </pre>
     * 
     * @throws Exception テストが失敗した場合
     */
    @Test
    @SuppressWarnings("unchecked")
    public void testSearchBatchReqParam() throws Exception {
        method = JbEdiRcvOdrServiceImpl.class.getDeclaredMethod("searchBatchReqParam", ResidentRequestDomain.class);
        method.setAccessible(true);
        
        List<TtBatchReqParamDomain>params = (List<TtBatchReqParamDomain>) method.invoke(jbEdiRcvOdrServiceImpl(), req);
        
        assertThat(params.get(0).getParamVal(), is("TH2"));
        assertThat(params.get(1).getParamVal(), is("20140506"));
        assertThat(params.get(2).getParamVal(), is("1"));
    }

    /**
     * <br />transactCigmaDataExtractionのテスト (【STEP1:CIGMA受注抽出】CIGMA受注抽出)
     * <pre>
     * 正常系のテスト (WSB008(EDI受注LINC情報取得)の結果が0件の場合)
     * </pre>
     * 
     * @throws Exception テストが失敗した場合
     */
    @Test
    @SuppressWarnings("deprecation")
    public void testTransactCigmaDataExtraction() throws Exception {
        // WSB008の戻り値の作成
        WsB008ResultDomain result = new WsB008ResultDomain(WS_RESULT_SUCCESS);
        result.setRcvOdrCompCd("TH2");               // 受注会社コード
        result.setEdiReceivingOrderList(new ArrayList<WsB008ResultItemDomain>());
        
        // WSB008の戻り値の設定
        MockObjectManager.addReturnValue(WsB008RestServiceImpl.class, "getEdiOdrLincData", result);
        
        // メソッドの取得
        method = JbEdiRcvOdrServiceImpl.class.getDeclaredMethod("transactCigmaDataExtraction", ResidentRequestDomain.class, String.class, Date.class);
        method.setAccessible(true);
        
        // CIGMA受注抽出
        String jobStatus = (String) method.invoke(jbEdiRcvOdrServiceImpl(), req, rcvOdrCompCd, cigmaAds);
        
        assertThat(jobStatus, is(JOB_STATUS_NORMAL));
    }
    
    /**
     * <br />transactCigmaDataExtractionのテスト (【STEP1:CIGMA受注抽出】CIGMA受注抽出)
     * <pre>
     * 正常系のテスト (WSB008(EDI受注LINC情報取得)の結果が1件以上の場合)
     * </pre>
     * 
     * @throws Exception テストが失敗した場合
     */
    @Test
    @SuppressWarnings("deprecation")
    public void testTransactCigmaDataExtraction2() throws Exception {
        // WSB008 EDI受注LINC情報取得の設定
        WsB008ResultDomain result = new WsB008ResultDomain(WS_RESULT_SUCCESS);
        result.setRcvOdrCompCd("TH2");               // 受注会社コード
        List<WsB008ResultItemDomain> ediReceivingOrderList = new ArrayList<WsB008ResultItemDomain>();
        WsB008ResultItemDomain item = new WsB008ResultItemDomain();
        item.setCustomerSubsidiaryCd("S1");          // 得意先輸出入拠点コード
        item.setTransmissionDt("20140502");          // 情報発信日
        item.setOdrTyp("1");                         // 発注区分
        item.setSerialNo("00001");                   // シリアルNO
        item.setCustomerCd("30001205");              // 得意先コード
        item.setLgcyShipTo("00");                    // LGCY送荷先
        item.setCustomerItemNoOrg("");               // 得意先品目番号オリジナル
        item.setOdrCtrlNo("1");                      // オーダーコントロールNO
        item.setRevisionNo("1");                     // 履歴NO
        item.setRevisionNoEis("1");                  // 履歴NO(拠点間)
        item.setOdrChgTyp("1");                      // 発注変更区分
        item.setCustomerPoNo("30001205-01");         // 得意先PO NO
        item.setTransCd("S");                        // 輸送手段コード
        item.setCustomerDueDt("20140930");           // 顧客納期
        item.setEtdDueDt("20140901");                // 船積期限
        item.setOdrFirmFlg("Y");                     // 受注確定フラグ
        item.setOdrQty("999");                       // 注文数量
        item.setSupplierCd("SUP01");                 // 仕入先コード(得意先視点) 
        ediReceivingOrderList.add(item);
        result.setEdiReceivingOrderList(ediReceivingOrderList);
        
        MockObjectManager.addReturnValue(WsB008RestServiceImpl.class, "getEdiOdrLincData", result);
        MockObjectManager.addReturnValue(TtEdiRcvOdrServiceImpl.class, "deleteByCondition", 1);
        
        // メソッドの取得
        method = JbEdiRcvOdrServiceImpl.class.getDeclaredMethod("transactCigmaDataExtraction", ResidentRequestDomain.class, String.class, Date.class);
        method.setAccessible(true);
        
        // CIGMA受注抽出
        String jobStatus = (String) method.invoke(jbEdiRcvOdrServiceImpl(), req, rcvOdrCompCd, cigmaAds);
        
        assertThat(jobStatus, is(JOB_STATUS_NORMAL));
    }
    
    /**
     * <br />transactCigmaDataExtractionのテスト (【STEP1:CIGMA受注抽出】CIGMA受注抽出)
     * <pre>
     * 異常系のテスト (WSB008(EDI受注LINC情報取得)の結果がエラーの場合)
     * </pre>
     * 
     * @throws Exception テストが失敗した場合
     */
    @Test
    @SuppressWarnings("deprecation")
    public void testTransactCigmaDataExtraction3() throws Exception {
        // WSB008 EDI受注LINC情報取得の設定
        ErrorParamListItemDomain param = new ErrorParamListItemDomain("");
        ErrorListItemDomain errItem = new ErrorListItemDomain(NXS_E1_0019, Arrays.asList(param));
        WsB008ResultDomain result = new WsB008ResultDomain(WS_RESULT_ERROR, Arrays.asList(errItem));
        
        MockObjectManager.addReturnValue(WsB008RestServiceImpl.class, "getEdiOdrLincData", result);
        MockObjectManager.addReturnValue(TtEdiRcvOdrServiceImpl.class, "deleteByCondition", 1);
        
        // メソッドの取得
        method = JbEdiRcvOdrServiceImpl.class.getDeclaredMethod("transactCigmaDataExtraction", ResidentRequestDomain.class, String.class, Date.class);
        method.setAccessible(true);
        
        // CIGMA受注抽出
        String jobStatus = (String) method.invoke(jbEdiRcvOdrServiceImpl(), req, rcvOdrCompCd, cigmaAds);
        
        assertThat(jobStatus, is(JOB_STATUS_ABEND));
    }
    
    /**
     * <br />transactOderEntryのテスト (【STEP2:前処理】テーブルクリア)
     * <pre>
     * 正常系のテスト (EDI受注エラーレポート、輸出受注更新が0件の場合)
     * </pre>
     * 
     * @throws Exception テストが失敗した場合
     */
    @Test
    public void testPreprocessOnTransactOderEntry() throws Exception {
        MockObjectManager.addReturnValue(TtEdiRcvOdrReportServiceImpl.class, "searchCount", 0);
        MockObjectManager.addReturnValue(TtExpRcvOdrUpdServiceImpl.class, "searchCount", 0);
        
        // メソッドの取得
        method = JbEdiRcvOdrServiceImpl.class.getDeclaredMethod("preprocessOnTransactOderEntry", ResidentRequestDomain.class, String.class, Date.class);
        method.setAccessible(true);

        // 前処理 (テーブルクリア)
        String jobStatus = (String) method.invoke(jbEdiRcvOdrServiceImpl(), req, rcvOdrCompCd, cigmaAds);
        
        assertThat(jobStatus, is(JOB_STATUS_NORMAL));
    }
    
    /**
     * <br />transactOderEntryのテスト (【STEP2:前処理】テーブルクリア)
     * <pre>
     * 正常系のテスト (EDI受注エラーレポート、輸出受注更新が1件以上の場合)
     * </pre>
     * 
     * @throws Exception テストが失敗した場合
     */
    @Test
    public void testPreprocessOnTransactOderEntry2() throws Exception {
        // メソッドの取得
        method = JbEdiRcvOdrServiceImpl.class.getDeclaredMethod("preprocessOnTransactOderEntry", ResidentRequestDomain.class, String.class, Date.class);
        method.setAccessible(true);

        // 前処理 (テーブルクリア)
        String jobStatus = (String) method.invoke(jbEdiRcvOdrServiceImpl(), req, rcvOdrCompCd, cigmaAds);
        
        assertThat(jobStatus, is(JOB_STATUS_NORMAL));
    }
    
    /**
     * <br />transactOderEntryのテスト (【STEP2:前処理】テーブルクリア)
     * <pre>
     * 異常系のテスト (例外が発生した場合)
     * </pre>
     * 
     * @throws Exception テストが失敗した場合
     */
    @Test
    public void testPreprocessOnTransactOderEntry3() throws Exception {
        MockObjectManager.addReturnValue(TtEdiRcvOdrReportServiceImpl.class, "deleteByCondition", new GscmApplicationException("GSCM-E0-0010"));

        // メソッドの取得
        method = JbEdiRcvOdrServiceImpl.class.getDeclaredMethod("preprocessOnTransactOderEntry", ResidentRequestDomain.class, String.class, Date.class);
        method.setAccessible(true);

        // 前処理 (テーブルクリア)
        String jobStatus = (String) method.invoke(jbEdiRcvOdrServiceImpl(), req, rcvOdrCompCd, cigmaAds);
        
        assertThat(jobStatus, is(JOB_STATUS_ABEND));
    }
    
    /**
     * <br />initErrCdListOnCreateEdiRcvOdrRtryのテスト (【STEP2:受注登録／持ち回り受注登録 (1)】エラーコードのクリア)
     * <pre>
     * 正常系 (EDI受注持ち回り＝0件)
     * </pre>
     * 
     * @throws Exception テストが失敗した場合
     */
    @Test
    public void testInitErrCdListOnCreateEdiRcvOdrRtry() throws Exception { 
        MockObjectManager.addReturnValue(TtEdiRcvOdrRtryServiceImpl.class, "searchCount", 0);
    
        // メソッドの取得
        method = JbEdiRcvOdrServiceImpl.class.getDeclaredMethod("initErrCdListOnCreateEdiRcvOdrRtry", String.class);
        method.setAccessible(true);
        
        // 持ち回り受注登録 (エラーコードのクリア)
        method.invoke(jbEdiRcvOdrServiceImpl(), rcvOdrCompCd);
    }
    
    /**
     * <br />initErrCdListOnCreateEdiRcvOdrRtryのテスト (【STEP2:受注登録／持ち回り受注登録 (1)】エラーコードのクリア)
     * <pre>
     * 正常系 (EDI受注持ち回り≠0件)
     * </pre>
     * 
     * @throws Exception テストが失敗した場合
     */
    @Test
    public void testInitErrCdListOnCreateEdiRcvOdrRtry2() throws Exception {
        MockObjectManager.addReturnValue(TtEdiRcvOdrRtryServiceImpl.class, "updateByCondition", 1);
        
        // メソッドの取得
        method = JbEdiRcvOdrServiceImpl.class.getDeclaredMethod("initErrCdListOnCreateEdiRcvOdrRtry", String.class);
        method.setAccessible(true);
        
        // 持ち回り受注登録 (エラーコードのクリア)
        method.invoke(jbEdiRcvOdrServiceImpl(), rcvOdrCompCd);
    }
    
    /**
     * <br />checkEdiRcvOdrOnNexusのテスト (【STEP2:受注登録／持ち回り受注登録】NEXUS側共通チェック)
     * <pre>
     * 正常系 (EDI受注持ち回りのNEXUS側共通チェックを行い、結果を登録する)
     * </pre>
     * 
     * @throws Exception テストが失敗した場合
     */
    @Test
    public void testCheckEdiRcvOdrOnNexus() throws Exception {
        MockObjectManager.setReturnValueAtAllTimes(TtEdiRcvOdrRtryServiceImpl.class, "updateByCondition", 1);
        
        // メソッドの取得
        method = JbEdiRcvOdrServiceImpl.class.getDeclaredMethod("checkEdiRcvOdrOnNexus", boolean.class, String.class);
        method.setAccessible(true);
        
        // 持ち回り受注登録 (NEXUS側共通チェック)
        method.invoke(jbEdiRcvOdrServiceImpl(), true, rcvOdrCompCd);
    }
    
    
    /**
     * <br />checkEdiRcvOdrOnNexusのテスト (【STEP2:受注登録／受注登録】NEXUS側共通チェック)
     * <pre>
     * 正常系 (EDI受注のNEXUS側共通チェックを行い、結果を登録する)
     * </pre>
     * 
     * @throws Exception テストが失敗した場合
     */
    @Test
    public void testCheckEdiRcvOdrOnNexus2() throws Exception {
        MockObjectManager.setReturnValueAtAllTimes(TtEdiRcvOdrServiceImpl.class, "updateByCondition", 1);
        
        // メソッドの取得
        method = JbEdiRcvOdrServiceImpl.class.getDeclaredMethod("checkEdiRcvOdrOnNexus", boolean.class, String.class);
        method.setAccessible(true);
        
        // 受注登録 (NEXUS側チェック)
        method.invoke(jbEdiRcvOdrServiceImpl(), false, rcvOdrCompCd);
    }
    
    /**
     * <br />checkEdiRcvOdrOnCigmaのテスト (【STEP2:受注登録／持ち回り受注登録】CIGMA側共通チェック)
     * <pre>
     * 正常系 (CIGMA側共通チェックの結果を反映)
     * </pre>
     *
     * @throws Exception テストが失敗した場合
     */
    @Test
    public void testCheckEdiRcvOdrOnCigma() throws Exception {
        MockObjectManager.setReturnValueAtAllTimes(TtEdiRcvOdrRtryServiceImpl.class, "updateByCondition", 1);
        
        // メソッドの取得
        method = JbEdiRcvOdrServiceImpl.class.getDeclaredMethod("checkEdiRcvOdrOnCigma", String.class, boolean.class);
        method.setAccessible(true);
        
        // 持ち回り受注登録 (CIGMA側共通チェック)
        method.invoke(jbEdiRcvOdrServiceImpl(), rcvOdrCompCd, true);
    }
    
    /**
     * <br />checkEdiRcvOdrOnCigmaのテスト(【STEP2:受注登録／持ち回り受注登録】CIGMA側共通チェック)
     * <pre>
     * 異常系 (WSB006の結果がエラーの場合)
     * </pre>
     *
     * @throws Exception テストが失敗した場合
     */
    @Test
    public void testCheckEdiRcvOdrOnCigma2() throws Exception {
        ErrorListItemDomain errItem = new ErrorListItemDomain("AI-80-0000", Collections.<ErrorParamListItemDomain>emptyList());
        WsB006ResultDomain result = new WsB006ResultDomain(WS_RESULT_ERROR, Arrays.asList(errItem));
        
        // Webサービスの結果を設定
        MockObjectManager.addReturnValue(WsB006RestServiceMockImpl.class, "checkEdiOdrEntry", result);
        
        try {
            // メソッドの取得
            method = JbEdiRcvOdrServiceImpl.class.getDeclaredMethod("checkEdiRcvOdrOnCigma", String.class, boolean.class);
            method.setAccessible(true);
            
            // 持ち回り受注登録 (CIGMA側共通チェック)
            method.invoke(jbEdiRcvOdrServiceImpl(), rcvOdrCompCd, true);
            
            fail();
        } catch (InvocationTargetException e) {
            assertThat(e.getTargetException() instanceof GscmApplicationException, is(true));
        }
    }
    
    /**
     * <br />checkEdiRcvOdrOnCigmaのテスト(【STEP2:受注登録／受注登録】CIGMA側共通チェック)
     * <pre>
     * 正常系
     * </pre>
     * 
     * @throws Exception テストが失敗した場合
     */
    @Test
    public void testCheckEdiRcvOdrOnCigma3() throws Exception {
        MockObjectManager.setReturnValueAtAllTimes(TtEdiRcvOdrServiceImpl.class, "updateByCondition", 1);
        
        // メソッドの取得
        method = JbEdiRcvOdrServiceImpl.class.getDeclaredMethod("checkEdiRcvOdrOnCigma", String.class, boolean.class);
        method.setAccessible(true);
        
        // 受注登録 (CIGMA側共通チェック)
        method.invoke(jbEdiRcvOdrServiceImpl(), rcvOdrCompCd, false);
    }
    
    /**
     * <br />createTtEdiRcvOdrReportOnCreateEdiRcvOdrRtryのテスト(【STEP2:受注登録／持ち回り受注登録】エラーレポートの出力情報作成)
     * <pre>
     * 正常系
     * </pre>
     * 
     * @throws Exception テストが失敗した場合
     */
    @Test
    @SuppressWarnings("deprecation")
    public void testCreateTtEdiRcvOdrReportOnCreateEdiRcvOdrRtry() throws Exception {
        MockObjectManager.setReturnValueAtAllTimes(TtEdiRcvOdrReportServiceImpl.class, "create");
        
        // メソッドの取得
        method = JbEdiRcvOdrServiceImpl.class.getDeclaredMethod("createTtEdiRcvOdrReportOnCreateEdiRcvOdrRtry", String.class);
        method.setAccessible(true);
        
        // 持ち回り受注登録 (エラーレポートの出力情報作成)
        method.invoke(jbEdiRcvOdrServiceImpl(), rcvOdrCompCd);
    }
    
    /**
     * <br />createExpRcvOdrOnCreateEdiRcvOdrRtryのテスト(【STEP2:受注登録／持ち回り受注登録】輸出受注の登録)
     * <pre>
     * 正常系
     * </pre>
     * 
     * @throws Exception テストが失敗した場合
     */
    @Test
    public void testCreateExpRcvOdrOnCreateEdiRcvOdrRtry() throws Exception {
        MockObjectManager.setReturnValueAtAllTimes(TtExpRcvOdrServiceImpl.class, "create");
        MockObjectManager.setReturnValueAtAllTimes(TtExpRcvOdrServiceImpl.class, "updateByCondition", 1);
        MockObjectManager.setReturnValueAtAllTimes(TtExpRcvOdrServiceImpl.class, "deleteByCondition", 1);
        MockObjectManager.setReturnValueAtAllTimes(TtExpRcvOdrUpdServiceImpl.class, "create");
        
        // メソッドの取得
        method = JbEdiRcvOdrServiceImpl.class.getDeclaredMethod("createExpRcvOdrOnCreateEdiRcvOdrRtry", String.class, Date.class);
        method.setAccessible(true);
        
        // 持ち回り受注登録 (輸出受注の登録)
        method.invoke(jbEdiRcvOdrServiceImpl(), rcvOdrCompCd, cigmaAds);
    }
    
    /**
     * <br />createEdiRcvOdrRtryOnTransactOderEntryのテスト(【STEP2:受注登録／持ち回り受注登録】)
     * <pre>
     * 正常系
     * </pre>
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testCreateEdiRcvOdrRtryOnTransactOderEntry() throws Exception {
        MockObjectManager.addReturnValue(JbEdiRcvOdrServiceImpl.class, "initErrCdListOnCreateEdiRcvOdrRtry");
        MockObjectManager.addReturnValue(JbEdiRcvOdrServiceImpl.class, "checkEdiRcvOdrOnNexus");
        MockObjectManager.addReturnValue(JbEdiRcvOdrServiceImpl.class, "checkEdiRcvOdrOnCigma");
        MockObjectManager.addReturnValue(JbEdiRcvOdrServiceImpl.class, "createTtEdiRcvOdrReportOnCreateEdiRcvOdrRtry");
        MockObjectManager.addReturnValue(JbEdiRcvOdrServiceImpl.class, "createExpRcvOdrOnCreateEdiRcvOdrRtry");
        
        // メソッドの取得
        method = JbEdiRcvOdrServiceImpl.class.getDeclaredMethod("createEdiRcvOdrRtryOnTransactOderEntry", ResidentRequestDomain.class, String.class, Date.class);
        method.setAccessible(true);
        
        // 持ち回り受注登録
        String jobStatus = (String) method.invoke(jbEdiRcvOdrServiceImpl(), req, rcvOdrCompCd, cigmaAds);
        
        assertThat(jobStatus, is(JOB_STATUS_NORMAL));
    }
    
    /**
     * <br />createEdiRcvOdrRtryOnTransactOderEntryのテスト(【STEP2:受注登録／持ち回り受注登録】)
     * <pre>
     * 異常系
     * </pre>
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testCreateEdiRcvOdrRtryOnTransactOderEntry2() throws Exception {
        MockObjectManager.addReturnValue(JbEdiRcvOdrServiceImpl.class, "initErrCdListOnCreateEdiRcvOdrRtry", new IntegrationLayerException("AI-80-0001"));
        
        // メソッドの取得
        method = JbEdiRcvOdrServiceImpl.class.getDeclaredMethod("createEdiRcvOdrRtryOnTransactOderEntry", ResidentRequestDomain.class, String.class, Date.class);
        method.setAccessible(true);
        
        // 持ち回り受注登録
        String jobStatus = (String) method.invoke(jbEdiRcvOdrServiceImpl(), req, rcvOdrCompCd, cigmaAds);
        
        assertThat(jobStatus, is(JOB_STATUS_ABEND));
    }
    
    /**
     * <br />deleteExpRcvOdrOnForecastRcvOdrのテスト(【STEP2:受注登録／内示消し込み】輸出受注の削除)
     * <pre>
     * 正常系
     * </pre>
     * 
     * @throws Exception テストが失敗した場合
     */
    @Test
    public void testDeleteExpRcvOdrOnForecastRcvOdr() throws Exception {
        // メソッドの取得
        method = JbEdiRcvOdrServiceImpl.class.getDeclaredMethod("deleteExpRcvOdrOnForecastRcvOdr", String.class, Date.class);
        method.setAccessible(true);
        
        // 内示消し込み (輸出受注の削除)
        method.invoke(jbEdiRcvOdrServiceImpl(), "TG2", cigmaAds);
    }
    
    /**
     * <br />deleteTtEdiRcvOdrRtryOnDeleteForecastRcvOdrのテスト(【STEP2:受注登録／内示消し込み】EDI受注持ち回りの削除)
     * <pre>
     * 正常系
     * </pre>
     * 
     * @throws Exception テストが失敗した場合
     */
    @Test
    public void testDeleteTtEdiRcvOdrRtryOnDeleteForecastRcvOdr() throws Exception {
        // メソッドの取得
        method = JbEdiRcvOdrServiceImpl.class.getDeclaredMethod("deleteTtEdiRcvOdrRtryOnDeleteForecastRcvOdr", String.class);
        method.setAccessible(true);
        
        // 内示消し込み (EDI受注持ち回りの削除)
        method.invoke(jbEdiRcvOdrServiceImpl(), "TG2");
    }
    
    /**
     * <br />deleteForecastRcvOdrOnTransactOderEntryのテスト(【STEP2:受注登録／内示消し込み】)
     * <pre>
     * 正常系
     * </pre>
     *
     * @throws Exception テストが失敗した場合
     */
    @Test
    public void testDeleteForecastRcvOdrOnTransactOderEntry() throws Exception {
        MockObjectManager.setReturnValueAtAllTimes(JbEdiRcvOdrServiceImpl.class, "deleteExpRcvOdrOnForecastRcvOdr");
        MockObjectManager.setReturnValueAtAllTimes(JbEdiRcvOdrServiceImpl.class, "deleteTtEdiRcvOdrRtryOnDeleteForecastRcvOdr");
        
        // メソッドの取得
        method = JbEdiRcvOdrServiceImpl.class.getDeclaredMethod("deleteForecastRcvOdrOnTransactOderEntry", ResidentRequestDomain.class, String.class, Date.class);
        method.setAccessible(true);
        
        // 内示消し込み
        String jobStatus = (String) method.invoke(jbEdiRcvOdrServiceImpl(), req, "TG2", cigmaAds);
        
        assertThat(jobStatus, is(JOB_STATUS_NORMAL));
        
    }
    
    /**
     * <br />deleteForecastRcvOdrOnTransactOderEntryのテスト(【STEP2:受注登録／内示消し込み】)
     * <pre>
     * 異常系
     * </pre>
     *
     * @throws Exception テストが失敗した場合
     */
    @Test
    public void testDeleteForecastRcvOdrOnTransactOderEntry2() throws Exception {
        MockObjectManager.setReturnValueAtAllTimes(JbEdiRcvOdrServiceImpl.class, "deleteExpRcvOdrOnForecastRcvOdr", new IntegrationLayerException("AI-80-0001"));
        
        // メソッドの取得
        method = JbEdiRcvOdrServiceImpl.class.getDeclaredMethod("deleteForecastRcvOdrOnTransactOderEntry", ResidentRequestDomain.class, String.class, Date.class);
        method.setAccessible(true);
        
        // 内示消し込み
        String jobStatus = (String) method.invoke(jbEdiRcvOdrServiceImpl(), req, "TG2", cigmaAds);
        
        assertThat(jobStatus, is(JOB_STATUS_ABEND));
    }
    
    
    /**
     * <br />initErrCdListOnCreateOderEntryのテスト(【STEP2:受注登録／受注登録】EDI受注のエラーコードをクリア
     * <pre>
     * 正常系
     * </pre>
     * 
     * @throws Exception テストが失敗した場合
     */
    @Test
    public void testInitErrCdListOnCreateOderEntry() throws Exception {
        MockObjectManager.addReturnValue(TtEdiRcvOdrServiceImpl.class, "updateByCondition", 1);
        
        // メソッドの取得
        method = JbEdiRcvOdrServiceImpl.class.getDeclaredMethod("initErrCdListOnCreateOderEntry", String.class);
        method.setAccessible(true);
        
        // 受注登録 (EDI受注のエラーコードのクリア)
        method.invoke(jbEdiRcvOdrServiceImpl(), rcvOdrCompCd);
    }
    
    /**
     * <br />handleErrEdiRcvOdrOnCreateOderEntryのテスト(【STEP2:受注登録／受注登録】エラーレコードの処理)
     * <pre>
     * 正常系
     * </pre>
     * 
     * @throws Exception テストが失敗した場合
     */
    @Test
    public void testHandleErrEdiRcvOdrOnCreateOderEntry() throws Exception {
        MockObjectManager.setReturnValueAtAllTimes(TtEdiRcvOdrRtryServiceImpl.class, "create");
        MockObjectManager.setReturnValueAtAllTimes(TtEdiRcvOdrRtryServiceImpl.class, "deleteByCondition", 1);
        
        // メソッドの取得
        method = JbEdiRcvOdrServiceImpl.class.getDeclaredMethod("handleErrEdiRcvOdrOnCreateOderEntry", String.class);
        method.setAccessible(true);
        
        // 受注登録 (エラーレコードの処理)
        method.invoke(jbEdiRcvOdrServiceImpl(), rcvOdrCompCd);
    }
    
    /**
     * <br />createEdiRcvOdrReportOnCreateOderEntryのテスト(【STEP2:受注登録／受注登録】EDIエラーレポートへの登録)
     * <pre>
     * 正常系
     * </pre>
     * 
     * @throws Exception テストが失敗した場合
     */
    @Test
    public void testCreateTtEdiRcvOdrReportOnCreateOderEntry() throws Exception {
        MockObjectManager.setReturnValueAtAllTimes(TtEdiRcvOdrReportServiceImpl.class, "create");
        
        // メソッドの取得
        method = JbEdiRcvOdrServiceImpl.class.getDeclaredMethod("createTtEdiRcvOdrReportOnCreateOderEntry", String.class);
        method.setAccessible(true);
        
        // 受注登録 (EDIエラーレレポートの登録)
        method.invoke(jbEdiRcvOdrServiceImpl(), rcvOdrCompCd);
    }
    
    /**
     * <br />createExpRcvOdrOnCreateOderEntryのテスト(【STEP2:受注登録／受注登録】輸出受注の登録)
     *
     * @throws Exception テストが失敗した場合
     */
    @Test
    public void testCreateExpRcvOdrOnCreateOderEntry() throws Exception {
        MockObjectManager.setReturnValueAtAllTimes(TtExpRcvOdrServiceImpl.class, "create");
        MockObjectManager.setReturnValueAtAllTimes(TtExpRcvOdrServiceImpl.class, "updateByCondition", 1);
        MockObjectManager.setReturnValueAtAllTimes(TtExpRcvOdrServiceImpl.class, "deleteByCondition", 1);
        MockObjectManager.setReturnValueAtAllTimes(TtExpRcvOdrUpdServiceImpl.class, "create");
        MockObjectManager.setReturnValueAtAllTimes(TmExpFormalitiItemNoServiceImpl.class, "update", 1);
        
        // メソッドの取得
        method = JbEdiRcvOdrServiceImpl.class.getDeclaredMethod("createExpRcvOdrOnCreateOderEntry", String.class);
        method.setAccessible(true);
        
        // 受注登録 (輸出受注の登録)
        method.invoke(jbEdiRcvOdrServiceImpl(), rcvOdrCompCd);
    }
    
    /**
     * <br />createOderEntryOnTransactOderEntryのテスト(【STEP2:受注登録／受注登録】)
     * <pre>
     * 正常系
     * </pre>
     * 
     * @throws Exception テストが失敗した場合
     */
    @Test
    public void testCreateOderEntryOnTransactOderEntry() throws Exception {
        MockObjectManager.addReturnValue(JbEdiRcvOdrServiceImpl.class, "initErrCdListOnCreateOderEntry");
        MockObjectManager.addReturnValue(JbEdiRcvOdrServiceImpl.class, "checkEdiRcvOdrOnNexus");
        MockObjectManager.addReturnValue(JbEdiRcvOdrServiceImpl.class, "checkEdiRcvOdrOnCigma");
        MockObjectManager.addReturnValue(JbEdiRcvOdrServiceImpl.class, "handleErrEdiRcvOdrOnCreateOderEntry");
        MockObjectManager.addReturnValue(JbEdiRcvOdrServiceImpl.class, "createTtEdiRcvOdrReportOnCreateOderEntry");
        MockObjectManager.addReturnValue(JbEdiRcvOdrServiceImpl.class, "createExpRcvOdrOnCreateOderEntry");
        
        // メソッドの取得
        method = JbEdiRcvOdrServiceImpl.class.getDeclaredMethod("createOderEntryOnTransactOderEntry", ResidentRequestDomain.class, String.class, Date.class);
        method.setAccessible(true);
        
        // 受注登録 (受注登録)
        String jobStatus = (String) method.invoke(jbEdiRcvOdrServiceImpl(), req, rcvOdrCompCd, cigmaAds);
        
        assertThat(jobStatus, is(JOB_STATUS_NORMAL));
    }
    
    /**
     * <br />createOderEntryOnTransactOderEntryのテスト(【STEP2:受注登録／受注登録】)
     * <pre>
     * 異常系 (例外が発生した場合)
     * </pre>
     * 
     * @throws Exception テストが失敗した場合
     */
    @Test
    public void testCreateOderEntryOnTransactOderEntry2() throws Exception {
        MockObjectManager.addReturnValue(JbEdiRcvOdrServiceImpl.class, "initErrCdListOnCreateOderEntry", new IntegrationLayerException("AI-80-0001"));
        
        // メソッドの取得
        method = JbEdiRcvOdrServiceImpl.class.getDeclaredMethod("createOderEntryOnTransactOderEntry", ResidentRequestDomain.class, String.class, Date.class);
        method.setAccessible(true);
        
        // 受注登録 (受注登録)
        String jobStatus = (String) method.invoke(jbEdiRcvOdrServiceImpl(), req, rcvOdrCompCd, cigmaAds);
        
        assertThat(jobStatus, is(JOB_STATUS_ABEND));
    }
    
    /**
     * <br />transactOderEntryのテスト(【STEP2:受注登録】)
     * <pre>
     * 正常系
     * </pre>
     * 
     * @throws Exception テストが失敗した場合 
     */
    @Test
    public void testTransactOderEntry() throws Exception {
        MockObjectManager.addReturnValue(JbEdiRcvOdrServiceImpl.class, "preprocessOnTransactOderEntry", JOB_STATUS_NORMAL);
        MockObjectManager.addReturnValue(JbEdiRcvOdrServiceImpl.class, "createEdiRcvOdrRtryOnTransactOderEntry", JOB_STATUS_NORMAL);
        MockObjectManager.addReturnValue(JbEdiRcvOdrServiceImpl.class, "deleteForecastRcvOdrOnTransactOderEntry", JOB_STATUS_NORMAL);
        MockObjectManager.addReturnValue(JbEdiRcvOdrServiceImpl.class, "createOderEntryOnTransactOderEntry", JOB_STATUS_NORMAL);
        MockObjectManager.addReturnValue(JbEdiRcvOdrServiceImpl.class, "updateToCigmaOnTransactOderEntry", JOB_STATUS_NORMAL);
        
        // メソッドの取得
        method = JbEdiRcvOdrServiceImpl.class.getDeclaredMethod("transactOderEntry", ResidentRequestDomain.class, String.class, Date.class);
        method.setAccessible(true);
        
        // 受注登録
        String jobStatus = (String) method.invoke(jbEdiRcvOdrServiceImpl(), req, rcvOdrCompCd, cigmaAds);
        
        assertThat(jobStatus, is(JOB_STATUS_NORMAL));
    }
    
    /**
     * <br />transactOderEntryのテスト(【STEP2:受注登録】)
     * <pre>
     * 異常系
     * </pre>
     * 
     * @throws Exception テストが失敗した場合 
     */
    @Test
    public void testTransactOderEntry2() throws Exception {
        IllegalStateException unreachable = new IllegalStateException();
        Object[][] testCases = new Object[][] {
            { JOB_STATUS_ABEND, unreachable, unreachable, unreachable, unreachable },
            { JOB_STATUS_NORMAL, JOB_STATUS_ABEND, unreachable, unreachable, unreachable },
            { JOB_STATUS_NORMAL, JOB_STATUS_NORMAL, JOB_STATUS_ABEND, unreachable, unreachable },
            { JOB_STATUS_NORMAL, JOB_STATUS_NORMAL, JOB_STATUS_NORMAL, JOB_STATUS_ABEND, unreachable },
            { JOB_STATUS_NORMAL, JOB_STATUS_NORMAL, JOB_STATUS_NORMAL, JOB_STATUS_NORMAL, JOB_STATUS_ABEND }
        };
        
        for (int i = 0; i < testCases.length; i++) {
            try {
                MockObjectManager.setReturnValueAtAllTimes(JbEdiRcvOdrServiceImpl.class, "preprocessOnTransactOderEntry", testCases[i][0]);
                MockObjectManager.setReturnValueAtAllTimes(JbEdiRcvOdrServiceImpl.class, "createEdiRcvOdrRtryOnTransactOderEntry", testCases[i][1]);
                MockObjectManager.setReturnValueAtAllTimes(JbEdiRcvOdrServiceImpl.class, "deleteForecastRcvOdrOnTransactOderEntry", testCases[i][2]);
                MockObjectManager.setReturnValueAtAllTimes(JbEdiRcvOdrServiceImpl.class, "createOderEntryOnTransactOderEntry", testCases[i][3]);
                MockObjectManager.setReturnValueAtAllTimes(JbEdiRcvOdrServiceImpl.class, "updateToCigmaOnTransactOderEntry", testCases[i][4]);
                
                // メソッドの取得
                method = JbEdiRcvOdrServiceImpl.class.getDeclaredMethod("transactOderEntry", ResidentRequestDomain.class, String.class, Date.class);
                method.setAccessible(true);
                
                // 受注登録
                String jobStatus = (String) method.invoke(jbEdiRcvOdrServiceImpl(), req, rcvOdrCompCd, cigmaAds);
                
                assertThat(jobStatus, is(JOB_STATUS_ABEND));
            } catch (Exception e) {
                fail();
            }
        }
    }
    
    /**
     * <br />updateToCigmaOnTransactOderEntryのテスト (【STEP2:受注登録／CIGMA直納受注反映】)
     * <pre>
     * 正常系のテスト
     * </pre>
     * 
     * @throws Exception テストが失敗した場合
     */
    @Test
    @SuppressWarnings("deprecation")
    public void testUpdateToCigmaOnTransactOderEntry() throws Exception {
        // 輸出受注更新の作成
        TtExpRcvOdrUpdDomain ttExpRcvOdrUpd1 = new TtExpRcvOdrUpdDomain();
        ttExpRcvOdrUpd1.setRcvOdrCompCd(rcvOdrCompCd);                      // 受注会社コード
        ttExpRcvOdrUpd1.setCustomerSubsidiaryCd("S1");                      // 得意先輸出入拠点コード
        ttExpRcvOdrUpd1.setTransmissionDt(new Date(114, 4, 16));            // 情報発信日
        ttExpRcvOdrUpd1.setOdrTyp("1");                                     // 発注区分
        ttExpRcvOdrUpd1.setSerialNo(new BigDecimal("00000"));               // シリアルNO
        ttExpRcvOdrUpd1.setCustomerCd("30001205");                          // 得意先コード
        ttExpRcvOdrUpd1.setLgcyShipTo("00");                                // LGCY送荷先
        ttExpRcvOdrUpd1.setRevisionNo(new BigDecimal("00"));                // 履歴NO
        ttExpRcvOdrUpd1.setRevisionNoEis(new BigDecimal("00"));             // 履歴NO(拠点間)
        ttExpRcvOdrUpd1.setItemNo("A002TB0091B3N");                         // 品目番号
        ttExpRcvOdrUpd1.setPkgCd("1 ");                                     // 包装区分
        ttExpRcvOdrUpd1.setShippingDt(new Date(114, 4, 25));                // 出荷予定日
        ttExpRcvOdrUpd1.setPltzAllocQty(new BigDecimal("0"));               // 梱包引当数量
        ttExpRcvOdrUpd1.setShippedQty(new BigDecimal("0"));                 // 出荷数量
        ttExpRcvOdrUpd1.setPartialDelivCnt(new BigDecimal("0"));            // 分納回数
        ttExpRcvOdrUpd1.setOdrQtyOrg(new BigDecimal("999"));                // 注文数量オリジナル
        ttExpRcvOdrUpd1.setUpdateTyp("1");                                  // 更新区分
        ttExpRcvOdrUpd1.setNewCustomerDueDt(new Date(114, 4, 30));          // 変更後顧客納期
        ttExpRcvOdrUpd1.setNewEtdDueDt(new Date(114, 4, 27));               // 変更後ETD
        ttExpRcvOdrUpd1.setNewOdrQty(new BigDecimal("999"));                // 変更後注文数量
        ttExpRcvOdrUpd1.setNewTrnsCd("S");                                  // 変更後輸送手段コード
        ttExpRcvOdrUpd1.setNewCustomerPoNo("30001205-01");                  // 変更後得意先PO NO
        ttExpRcvOdrUpd1.setNewOdrFirmFlg("1");                              // 変更後受注確定フラグ
        ttExpRcvOdrUpd1.setNewCustomerItemNo("30001205-A002TB0091B3N");     // 変更後得意先品目番号

        TtExpRcvOdrUpdDomain ttExpRcvOdrUpd2 = new TtExpRcvOdrUpdDomain();
        ttExpRcvOdrUpd2.setRcvOdrCompCd(rcvOdrCompCd);                      // 受注会社コード
        ttExpRcvOdrUpd2.setCustomerSubsidiaryCd("S1");                      // 得意先輸出入拠点コード
        ttExpRcvOdrUpd2.setTransmissionDt(new Date(114, 4, 16));            // 情報発信日
        ttExpRcvOdrUpd2.setOdrTyp("2");                                     // 発注区分
        ttExpRcvOdrUpd2.setSerialNo(new BigDecimal("00000"));               // シリアルNO
        ttExpRcvOdrUpd2.setCustomerCd("30001205");                          // 得意先コード
        ttExpRcvOdrUpd2.setLgcyShipTo("00");                                // LGCY送荷先
        ttExpRcvOdrUpd2.setRevisionNo(new BigDecimal("00"));                // 履歴NO
        ttExpRcvOdrUpd2.setRevisionNoEis(new BigDecimal("00"));             // 履歴NO(拠点間)
        ttExpRcvOdrUpd2.setItemNo("A002TB0091B4N");                         // 品目番号
        ttExpRcvOdrUpd2.setPkgCd("110");                                    // 包装区分
        ttExpRcvOdrUpd2.setShippingDt(new Date(114, 4, 25));                // 出荷予定日
        ttExpRcvOdrUpd2.setPltzAllocQty(new BigDecimal("999"));             // 梱包引当数量
        ttExpRcvOdrUpd2.setShippedQty(new BigDecimal("999"));               // 出荷数量
        ttExpRcvOdrUpd2.setPartialDelivCnt(new BigDecimal("3"));            // 分納回数
        ttExpRcvOdrUpd2.setOdrQtyOrg(new BigDecimal("999"));                // 注文数量オリジナル
        ttExpRcvOdrUpd2.setUpdateTyp("3");                                  // 更新区分
        ttExpRcvOdrUpd2.setOldCustomerDueDt(new Date(114, 4, 30));          // 変更前顧客納期
        ttExpRcvOdrUpd2.setOldEtdDueDt(new Date(114, 4, 27));               // 変更前ETD
        ttExpRcvOdrUpd2.setOldOdrQty(new BigDecimal("999"));                // 変更前注文数量
        ttExpRcvOdrUpd2.setOldTrnsCd("S");                                  // 変更前輸送手段コード
        ttExpRcvOdrUpd2.setOldCustomerPoNo("30001205-01");                  // 変更前得意先PO NO
        ttExpRcvOdrUpd2.setOldOdrFirmFlg("1");                              // 変更前受注確定フラグ
        ttExpRcvOdrUpd2.setOldCustomerItemNo("30001205-A002TB0091B3N");     // 変更前得意先品目番号

        // 輸出受注更新の検索結果の設定
        MockObjectManager.addReturnValue(TtExpRcvOdrUpdServiceImpl.class, "searchByCondition", Arrays.asList(ttExpRcvOdrUpd1, ttExpRcvOdrUpd2));
        
        // WSB007(直納受注反映)の結果の作成
        ResultDomain result = new ResultDomain(WS_RESULT_SUCCESS);

        // WSB007(直納受注反映)の結果の設定
        MockObjectManager.addReturnValue(WsB007RestServiceImpl.class, "reflectToCusOdr", result);
        
        // メソッドの取得
        method = JbEdiRcvOdrServiceImpl.class.getDeclaredMethod("updateToCigmaOnTransactOderEntry", ResidentRequestDomain.class, String.class, Date.class);
        method.setAccessible(true);
        
        // CIGMA直納受注反映
        String jobStatus = (String) method.invoke(jbEdiRcvOdrServiceImpl(), req, rcvOdrCompCd, cigmaAds);
        
        assertThat(jobStatus, is(JOB_STATUS_NORMAL));
    }
    
    /**
     * <br />updateToCigmaOnTransactOderEntryのテスト (【STEP2:受注登録／CIGMA直納受注反映】)
     * <pre>
     * 異常系のテスト (Webサービスが異常終了の場合)
     * </pre>
     * 
     * @throws Exception テストが失敗した場合
     */
    @Test
    @SuppressWarnings("deprecation")
    public void testUpdateToCigmaOnTransactOderEntry2() throws Exception {
        // 輸出受注更新の作成
        TtExpRcvOdrUpdDomain ttExpRcvOdrUpd1 = new TtExpRcvOdrUpdDomain();
        ttExpRcvOdrUpd1.setRcvOdrCompCd(rcvOdrCompCd);                      // 受注会社コード
        ttExpRcvOdrUpd1.setCustomerSubsidiaryCd("S1");                      // 得意先輸出入拠点コード
        ttExpRcvOdrUpd1.setTransmissionDt(new Date(114, 4, 16));            // 情報発信日
        ttExpRcvOdrUpd1.setOdrTyp("1");                                     // 発注区分
        ttExpRcvOdrUpd1.setSerialNo(new BigDecimal("00000"));               // シリアルNO
        ttExpRcvOdrUpd1.setCustomerCd("30001205");                          // 得意先コード
        ttExpRcvOdrUpd1.setLgcyShipTo("00");                                // LGCY送荷先
        ttExpRcvOdrUpd1.setRevisionNo(new BigDecimal("00"));                // 履歴NO
        ttExpRcvOdrUpd1.setRevisionNoEis(new BigDecimal("00"));             // 履歴NO(拠点間)
        ttExpRcvOdrUpd1.setItemNo("A002TB0091B3N");                         // 品目番号
        ttExpRcvOdrUpd1.setPkgCd("1 ");                                     // 包装区分
        ttExpRcvOdrUpd1.setShippingDt(new Date(114, 4, 25));                // 出荷予定日
        ttExpRcvOdrUpd1.setPltzAllocQty(new BigDecimal("0"));               // 梱包引当数量
        ttExpRcvOdrUpd1.setShippedQty(new BigDecimal("0"));                 // 出荷数量
        ttExpRcvOdrUpd1.setPartialDelivCnt(new BigDecimal("0"));            // 分納回数
        ttExpRcvOdrUpd1.setOdrQtyOrg(new BigDecimal("999"));                // 注文数量オリジナル
        ttExpRcvOdrUpd1.setUpdateTyp("1");                                  // 更新区分
        ttExpRcvOdrUpd1.setNewCustomerDueDt(new Date(114, 4, 30));          // 変更後顧客納期
        ttExpRcvOdrUpd1.setNewEtdDueDt(new Date(114, 4, 27));               // 変更後ETD
        ttExpRcvOdrUpd1.setNewOdrQty(new BigDecimal("999"));                // 変更後注文数量
        ttExpRcvOdrUpd1.setNewTrnsCd("S");                                  // 変更後輸送手段コード
        ttExpRcvOdrUpd1.setNewCustomerPoNo("30001205-01");                  // 変更後得意先PO NO
        ttExpRcvOdrUpd1.setNewOdrFirmFlg("1");                              // 変更後受注確定フラグ
        ttExpRcvOdrUpd1.setNewCustomerItemNo("30001205-A002TB0091B3N");     // 変更後得意先品目番号

        TtExpRcvOdrUpdDomain ttExpRcvOdrUpd2 = new TtExpRcvOdrUpdDomain();
        ttExpRcvOdrUpd2.setRcvOdrCompCd(rcvOdrCompCd);                      // 受注会社コード
        ttExpRcvOdrUpd2.setCustomerSubsidiaryCd("S1");                      // 得意先輸出入拠点コード
        ttExpRcvOdrUpd2.setTransmissionDt(new Date(114, 4, 16));            // 情報発信日
        ttExpRcvOdrUpd2.setOdrTyp("2");                                     // 発注区分
        ttExpRcvOdrUpd2.setSerialNo(new BigDecimal("00000"));               // シリアルNO
        ttExpRcvOdrUpd2.setCustomerCd("30001205");                          // 得意先コード
        ttExpRcvOdrUpd2.setLgcyShipTo("00");                                // LGCY送荷先
        ttExpRcvOdrUpd2.setRevisionNo(new BigDecimal("00"));                // 履歴NO
        ttExpRcvOdrUpd2.setRevisionNoEis(new BigDecimal("00"));             // 履歴NO(拠点間)
        ttExpRcvOdrUpd2.setItemNo("A002TB0091B4N");                         // 品目番号
        ttExpRcvOdrUpd2.setPkgCd("110");                                    // 包装区分
        ttExpRcvOdrUpd2.setShippingDt(new Date(114, 4, 25));                // 出荷予定日
        ttExpRcvOdrUpd2.setPltzAllocQty(new BigDecimal("999"));             // 梱包引当数量
        ttExpRcvOdrUpd2.setShippedQty(new BigDecimal("999"));               // 出荷数量
        ttExpRcvOdrUpd2.setPartialDelivCnt(new BigDecimal("3"));            // 分納回数
        ttExpRcvOdrUpd2.setOdrQtyOrg(new BigDecimal("999"));                // 注文数量オリジナル
        ttExpRcvOdrUpd2.setUpdateTyp("3");                                  // 更新区分
        ttExpRcvOdrUpd2.setOldCustomerDueDt(new Date(114, 4, 30));          // 変更前顧客納期
        ttExpRcvOdrUpd2.setOldEtdDueDt(new Date(114, 4, 27));               // 変更前ETD
        ttExpRcvOdrUpd2.setOldOdrQty(new BigDecimal("999"));                // 変更前注文数量
        ttExpRcvOdrUpd2.setOldTrnsCd("S");                                  // 変更前輸送手段コード
        ttExpRcvOdrUpd2.setOldCustomerPoNo("30001205-01");                  // 変更前得意先PO NO
        ttExpRcvOdrUpd2.setOldOdrFirmFlg("1");                              // 変更前受注確定フラグ
        ttExpRcvOdrUpd2.setOldCustomerItemNo("30001205-A002TB0091B3N");     // 変更前得意先品目番号

        // 輸出受注更新の検索結果の設定
        MockObjectManager.addReturnValue(TtExpRcvOdrUpdServiceImpl.class, "searchByCondition", Arrays.asList(ttExpRcvOdrUpd1, ttExpRcvOdrUpd2));
        
        // WSB007(直納受注反映)の結果作成
        ErrorParamListItemDomain param = new ErrorParamListItemDomain("");
        ErrorListItemDomain errItem = new ErrorListItemDomain(NXS_E1_0019, Arrays.asList(param));
        ResultDomain result = new ResultDomain(WS_RESULT_ERROR, Arrays.asList(errItem));

        // WSB007(直納受注反映)の結果設定
        MockObjectManager.addReturnValue(WsB007RestServiceImpl.class, "reflectToCusOdr", result);
        
        // メソッドの取得
        method = JbEdiRcvOdrServiceImpl.class.getDeclaredMethod("updateToCigmaOnTransactOderEntry", ResidentRequestDomain.class, String.class, Date.class);
        method.setAccessible(true);
        
        // CIGMA直納受注反映
        String jobStatus = (String) method.invoke(jbEdiRcvOdrServiceImpl(), req, rcvOdrCompCd, cigmaAds);
        
        assertThat(jobStatus, is(JOB_STATUS_ABEND));
    }
    
    /**
     * <br />transactErrReportOutputのテスト (【STEP3:エラーレポート出力】)
     * <pre>
     * 正常系のテスト (EDI受注エラーレポート＝0件)
     * </pre>
     * 
     * @throws Exception テストが失敗した場合
     */
    @Test
    public void testTransactErrReportOutput() throws Exception {
        // EDI受注エラーレポートの設定
        MockObjectManager.addReturnValue(TtEdiRcvOdrReportServiceImpl.class, "searchCount", 0);
        
        // メソッドの取得
        method = JbEdiRcvOdrServiceImpl.class.getDeclaredMethod("transactErrReportOutput", ResidentRequestDomain.class, String.class, Date.class);
        method.setAccessible(true);
        
        // エラーレポート出力
        String jobStatus = (String) method.invoke(jbEdiRcvOdrServiceImpl(), req, rcvOdrCompCd, cigmaAds);
        
        assertThat(jobStatus, is(JOB_STATUS_NORMAL));
    }

    /**
     * <br />transactErrReportOutputのテスト (【STEP3:エラーレポート出力】)
     * <pre>
     * 正常系のテスト (EDI受注エラーレポート≠0件)
     * </pre>
     * 
     * @throws Exception テストが失敗した場合
     */
    @Test
    public void testTransactErrReportOutput2() throws Exception {
        // EDI受注エラーレポートの設定
        MockObjectManager.addReturnValue(TtEdiRcvOdrReportServiceImpl.class, "searchCount", 1);

        // PDF帳票の設定
        File pdfFile = folder.newFile();
        MockObjectManager.addReturnValue(LB001ReportServiceImpl.class, "searchOdrRcv", pdfFile);

        // レポート出力の設定
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "printPdf");
        
        // メソッドの取得
        method = JbEdiRcvOdrServiceImpl.class.getDeclaredMethod("transactErrReportOutput", ResidentRequestDomain.class, String.class, Date.class);
        method.setAccessible(true);
        
        // エラーレポート出力
        String jobStatus = (String) method.invoke(jbEdiRcvOdrServiceImpl(), req, rcvOdrCompCd, cigmaAds);
        
        assertThat(jobStatus, is(JOB_STATUS_NORMAL));
    }

    /**
     * <br />transactErrReportOutputのテスト (【STEP3:エラーレポート出力】)
     * <pre>
     * 異常系のテスト (PDF帳票の印刷エラー)
     * </pre>
     * 
     * @throws Exception テストが失敗した場合
     */
    @Test
    public void testTransactErrReportOutput3() throws Exception {
        // EDI受注エラーレポートの設定
        MockObjectManager.addReturnValue(TtEdiRcvOdrReportServiceImpl.class, "searchCount", 1);

        // PDF帳票の設定
        File pdfFile = folder.newFile();
        MockObjectManager.addReturnValue(LB001ReportServiceImpl.class, "searchOdrRcv", pdfFile);

        // レポート出力の設定
        MockObjectManager.addReturnValue(CommonServiceImpl.class, "printPdf", new SystemException(NXS_91_0001));
        
        // メソッドの取得
        method = JbEdiRcvOdrServiceImpl.class.getDeclaredMethod("transactErrReportOutput", ResidentRequestDomain.class, String.class, Date.class);
        method.setAccessible(true);
        
        // エラーレポート出力
        String jobStatus = (String) method.invoke(jbEdiRcvOdrServiceImpl(), req, rcvOdrCompCd, cigmaAds);
        
        assertThat(jobStatus, is(JOB_STATUS_ABEND));
    }

    /**
     * <br />transactOdrQtyReviseのテスト (【STEP4:内示受注数見直し】)
     * <pre>
     * 正常系のテスト (更新件数＝0件)
     * </pre>
     * 
     * @throws Exception テストが失敗した場合
     */
    @Test
    @SuppressWarnings("deprecation")
    public void testTransactOdrQtyRevise() throws Exception {
        // メソッドの取得
        method = JbEdiRcvOdrServiceImpl.class.getDeclaredMethod("transactOdrQtyRevise", ResidentRequestDomain.class, String.class, Date.class);
        method.setAccessible(true);
        
        // 内示受注見直し
        String jobStatus = (String) method.invoke(jbEdiRcvOdrServiceImpl(), req, rcvOdrCompCd, new Date(1, 0, 1));
        
        assertThat(jobStatus, is(JOB_STATUS_NORMAL));
    }

    /**
     * <br />transactOdrQtyReviseのテスト (【STEP4:内示受注数見直し】)
     * <pre>
     * 正常系のテスト (更新件数≠0件)
     * </pre>
     * 
     * @throws Exception テストが失敗した場合
     */
    @Test
    public void testTransactOdrQtyRevise2() throws Exception {
        // メソッドの取得
        method = JbEdiRcvOdrServiceImpl.class.getDeclaredMethod("transactOdrQtyRevise", ResidentRequestDomain.class, String.class, Date.class);
        method.setAccessible(true);
        
        // 内示受注見直し
        String jobStatus = (String) method.invoke(jbEdiRcvOdrServiceImpl(), req, rcvOdrCompCd, cigmaAds);
        
        assertThat(jobStatus, is(JOB_STATUS_NORMAL));
        
    }

    /**
     * <br />transactOdrQtyReviseのテスト (【STEP4:内示受注数見直し】)
     * <pre>
     * 異常系のテスト (輸出受注のロック失敗)
     * </pre>
     * 
     * @throws Exception テストが失敗した場合
     */
    @Test
    public void testTransactOdrQtyRevise3() throws Exception {
        // 例外の設定
        MockObjectManager.addReturnValue(JbEdiRcvOdrDaoImpl.class, "lockTtExpRcvOdrForReviseOdrQty", new IntegrationLayerException("AI-80-0001"));
        
        // メソッドの取得
        method = JbEdiRcvOdrServiceImpl.class.getDeclaredMethod("transactOdrQtyRevise", ResidentRequestDomain.class, String.class, Date.class);
        method.setAccessible(true);
        
        // 内示受注見直し
        String jobStatus = (String) method.invoke(jbEdiRcvOdrServiceImpl(), req, rcvOdrCompCd, cigmaAds);
        
        assertThat(jobStatus, is(JOB_STATUS_ABEND));
    }

    /**
     * <br />transactJobEndNoticeのテスト (【STEP5:ジョブ終了通知】)
     * <pre>
     * 正常系のテスト (Webサービスが正常終了の場合)
     * </pre>
     * 
     * @throws Exception テストが失敗した場合
     */
    @Test
    public void testTransactJobEndNotice() throws Exception {
        // WSB020 CIMGAジョブステータス更新 の設定
        ResultDomain result = new ResultDomain(WS_RESULT_SUCCESS);
        
        MockObjectManager.addReturnValue(WsB020RestServiceImpl.class, "updateEdiRcvOdrStatus", result);
        
        // メソッドの取得
        method = JbEdiRcvOdrServiceImpl.class.getDeclaredMethod("transactJobEndNotice", ResidentRequestDomain.class, String.class, String.class);
        method.setAccessible(true);
        
        // ジョブ終了通知
        String jobStatus = (String) method.invoke(jbEdiRcvOdrServiceImpl(), req, rcvOdrCompCd, JOB_STATUS_NORMAL);
        
        assertThat(jobStatus, is(JOB_STATUS_NORMAL));
    }
    
    /**
     * <br />transactJobEndNoticeのテスト (【STEP5:ジョブ終了通知】)
     * <pre>
     * 異常系のテスト (Webサービスが異常終了の場合)
     * </pre>
     * 
     * @throws Exception テストが失敗した場合
     */
    @Test
    public void testTransactJobEndNotice2() throws Exception {
        // WSB020 CIGMAジョブステータス更新 の設定 (エラー時の設定内容は不明)
        ErrorParamListItemDomain param = new ErrorParamListItemDomain("");
        ErrorListItemDomain errItem = new ErrorListItemDomain("-", Arrays.asList(param));
        ResultDomain result = new WsB008ResultDomain(WS_RESULT_ERROR, Arrays.asList(errItem));
        
        MockObjectManager.addReturnValue(WsB020RestServiceImpl.class, "updateEdiRcvOdrStatus", result);
        
        // メソッドの取得
        method = JbEdiRcvOdrServiceImpl.class.getDeclaredMethod("transactJobEndNotice", ResidentRequestDomain.class, String.class, String.class);
        method.setAccessible(true);
        
        // ジョブ終了通知
        String jobStatus = (String) method.invoke(jbEdiRcvOdrServiceImpl(), req, rcvOdrCompCd, JOB_STATUS_NORMAL);
        
        assertThat(jobStatus, is(JOB_STATUS_ABEND));
    }
    
//    /**
//     * <br />transactRequestのテスト
//     * <pre>
//     * EDI受注登録バッチの実行
//     * </pre>
//     *
//     * @throws Exception テストが失敗した場合
//     */
//    @Test
//    public void testTransactRequest() throws Exception {
//        // メソッドの取得
//        method = JbEdiRcvOdrServiceImpl.class.getDeclaredMethod("transactRequest", ResidentRequestDomain.class);
//        method.setAccessible(true);
//        
//        // EDI受注登録バッチの実行
//        boolean result = (Boolean) method.invoke(jbEdiRcvOdrServiceImpl(), req);
//        
//        assertThat(result, is(true));
//    }

    /**
     * <br />transactRequestのテスト
     * <pre>
     * 正常系 (全STEPが正常終了した場合)
     * </pre>
     *
     * @throws Exception テストが失敗した場合
     */
    @Test
    public void testTransactRequest1() throws Exception {
        MockObjectManager.addReturnValue(JbEdiRcvOdrServiceImpl.class, "transactCigmaDataExtraction", JOB_STATUS_NORMAL);
        MockObjectManager.addReturnValue(JbEdiRcvOdrServiceImpl.class, "transactOderEntry", JOB_STATUS_NORMAL);
        MockObjectManager.addReturnValue(JbEdiRcvOdrServiceImpl.class, "transactErrReportOutput", JOB_STATUS_NORMAL);
        MockObjectManager.addReturnValue(JbEdiRcvOdrServiceImpl.class, "transactOdrQtyRevise", JOB_STATUS_NORMAL);
        MockObjectManager.addReturnValue(JbEdiRcvOdrServiceImpl.class, "transactJobEndNotice", JOB_STATUS_NORMAL);
        
        // メソッドの取得
        method = JbEdiRcvOdrServiceImpl.class.getDeclaredMethod("transactRequest", ResidentRequestDomain.class);
        method.setAccessible(true);
        
        // EDI受注登録バッチの実行
        boolean result = (Boolean) method.invoke(jbEdiRcvOdrServiceImpl(), req);
        
        assertThat(result, is(true));
    }
    
    /**
     * <br />transactRequestのテスト
     * <pre>
     * 異常系 (STEP1～4が異常終了した場合)
     * </pre>
     *
     * @throws Exception テストが失敗した場合
     */
    @Test
    public void testTransactRequest2() throws Exception {
        IllegalStateException unreachable = new IllegalStateException();
        Object[][] testCases = new Object[][] {
            { JOB_STATUS_ABEND, unreachable, unreachable, unreachable },
            { JOB_STATUS_NORMAL, JOB_STATUS_ABEND, unreachable, unreachable },
            { JOB_STATUS_NORMAL, JOB_STATUS_NORMAL, JOB_STATUS_ABEND, unreachable },
            { JOB_STATUS_NORMAL, JOB_STATUS_NORMAL, JOB_STATUS_NORMAL, JOB_STATUS_ABEND },
        };
        
        // メソッドの取得
        method = JbEdiRcvOdrServiceImpl.class.getDeclaredMethod("transactRequest", ResidentRequestDomain.class);
        method.setAccessible(true);

        for (int i = 0; i < testCases.length; i++) {
            // STEP1～4の戻り値の設定
            MockObjectManager.setReturnValueAtAllTimes(JbEdiRcvOdrServiceImpl.class, "transactCigmaDataExtraction", testCases[i][0]);
            MockObjectManager.setReturnValueAtAllTimes(JbEdiRcvOdrServiceImpl.class, "transactOderEntry", testCases[i][1]);
            MockObjectManager.setReturnValueAtAllTimes(JbEdiRcvOdrServiceImpl.class, "transactErrReportOutput", testCases[i][2]);
            MockObjectManager.setReturnValueAtAllTimes(JbEdiRcvOdrServiceImpl.class, "transactOdrQtyRevise", testCases[i][3]);

            try {
                // STEP5が正常終了
                MockObjectManager.addReturnValue(JbEdiRcvOdrServiceImpl.class, "transactJobEndNotice", JOB_STATUS_NORMAL);
                
                // EDI受注登録バッチの実行
                method.invoke(jbEdiRcvOdrServiceImpl(), req);
                fail();
            } catch (InvocationTargetException e) {
                Throwable cause = e.getTargetException();
                
                assertThat(cause, is(instanceOf(ApplicationException.class)));
                assertThat(cause.getMessage(), is(containsString(NXS_91_0001)));
            }
            
            try {
                // STEP5が異常終了
                MockObjectManager.addReturnValue(JbEdiRcvOdrServiceImpl.class, "transactJobEndNotice", JOB_STATUS_ABEND);
                
                // EDI受注登録バッチの実行
                method.invoke(jbEdiRcvOdrServiceImpl(), req);
                fail();
            } catch (InvocationTargetException e) {
                Throwable cause = e.getTargetException();
                
                assertThat(cause, is(instanceOf(ApplicationException.class)));
                assertThat(cause.getMessage(), is(containsString(NXS_91_0001)));
            }
        }
    }

    /**
     * <br />parseDateのテスト (異常系)
     *
     * @throws Exception テストが失敗した場合
     */
    @Test
    public void testParseDate() throws Exception {
        // メソッドの取得
        method = JbEdiRcvOdrServiceImpl.class.getDeclaredMethod("parseDate", String.class, String.class);
        method.setAccessible(true);
        
        try {
            // parseDateの呼び出し
            method.invoke(jbEdiRcvOdrServiceImpl(), "2014-06-07", "yyyy/MM/dd");
            
            fail();
        } catch (InvocationTargetException e) {
            assertThat(e.getTargetException() instanceof ApplicationException, is(true));
            assertThat(e.getTargetException().getMessage(), is(containsString(NXS_91_0001)));
        }
    }
    
    /**
     * <br />getPkgCdのテスト
     *
     * @throws Exception テストが失敗した場合
     */
    @Test
    public void testGetPkgCd() throws Exception {
        // メソッドの取得
        method = JbEdiRcvOdrServiceImpl.class.getDeclaredMethod("getPkgCd", String.class);
        method.setAccessible(true);
        
        String pkgCd = null;
        
        pkgCd = (String) method.invoke(jbEdiRcvOdrServiceImpl(), "220");
        assertThat(pkgCd, is("220"));
        
        pkgCd = (String) method.invoke(jbEdiRcvOdrServiceImpl(), "");
        assertThat(pkgCd, is(" "));
    }
    
    /**
     * <br />searchResourceのテスト (異常系)
     *
     * @throws Exception テストが失敗した場合
     */
    @Test
    public void testSearchResource() throws Exception {
        // メソッドの取得
        method = JbEdiRcvOdrServiceImpl.class.getDeclaredMethod("searchResource", String.class, String.class);
        method.setAccessible(true);
        
        String value = (String) method.invoke(jbEdiRcvOdrServiceImpl(), rcvOdrCompCd, "undefined.key");
        
        assertThat(value, is(nullValue()));
    }
    
    /*
     * 以下、結合テストの補強テスト
     */
    
    /**
     * <br />共通チェックのテスト (EDI受注持ち回り / 受信形態＝オリジナル・追加)
     *
     * @throws Exception テストが失敗した場合
     */
    @Test
    public void testCreateEdiRcvOdrRtryOnTransactOderEntryOriginalAdd() throws Exception {
        testCommonChecks(true, noCheckMethodOriginalAdd);
    }
    
    /**
     * <br />共通チェックのテスト (EDI受注持ち回り / 受信形態＝変更)
     *
     * @throws Exception テストが失敗した場合
     */
    @Test
    public void testCreateEdiRcvOdrRtryOnTransactOderEntryChange() throws Exception {
        testCommonChecks(true, noCheckMethodChange);
    }
    
    /**
     * <br />共通チェックのテスト (EDI受注持ち回り / 受信形態＝削除)
     *
     * @throws Exception テストが失敗した場合
     */
    @Test
    public void testCreateEdiRcvOdrRtryOnTransactOderEntryDelete() throws Exception {
        testCommonChecks(true, noCheckMethodDelete);
    }
    
    /**
     * <br />共通チェックのテスト (EDI受注持ち回り / 受信形態＝エラー)
     *
     * @throws Exception テストが失敗した場合
     */
    @Test
    public void testCreateEdiRcvOdrRtryOnTransactOderEntryError() throws Exception {
        testCommonChecks(true, noCheckMethodError);
    }
    
    /**
     * <br />共通チェックのテスト (受注登録 / 受信形態＝オリジナル・追加)
     *
     * @throws Exception テストが失敗した場合
     */
    @Test
    public void testCreateOderEntryOnTransactOderEntryOriginalAdd() throws Exception {
        testCommonChecks(false, noCheckMethodOriginalAdd);
    }
    
    /**
     * <br />共通チェックのテスト (受注登録 / 受信形態＝変更)
     *
     * @throws Exception テストが失敗した場合
     */
    @Test
    public void testCreateOderEntryOnTransactOderEntryChange() throws Exception {
        testCommonChecks(false, noCheckMethodChange);
    }
    
    /**
     * <br />共通チェックのテスト (受注登録 / 受信形態＝削除)
     *
     * @throws Exception テストが失敗した場合
     */
    @Test
    public void testCreateOderEntryOnTransactOderEntryDelete() throws Exception {
        testCommonChecks(false, noCheckMethodDelete);
    }
    
    /**
     * <br />共通チェックのテスト (受注登録 / 受信形態＝エラー)
     *
     * @throws Exception テストが失敗した場合
     */
    @Test
    public void testCreateOderEntryOnTransactOderEntryError() throws Exception {
        testCommonChecks(false, noCheckMethodError);
    }

    /**
     * <br />共通チェックのテスト
     * 
     * @param isRtry 持ち回り受注登録の場合はtrue、受注登録の場合はfalse
     * @param noCheckMethods 実行しないチェックメソッド
     * @throws Exception テストが失敗した場合
     */
    @SuppressWarnings("deprecation")
    public void testCommonChecks(boolean isRtry, String[] noCheckMethods) throws Exception {
        // 実行しないチェックに対する例外設定
        for (String method : noCheckMethods) {
            MockObjectManager.setReturnValueAtAllTimes(JbEdiRcvOdrServiceImpl.class, method, new IllegalStateException());
        }
        
        // メソッド名の決定
        String methodName = null;
        if (isRtry) {
            methodName = "createEdiRcvOdrRtryOnTransactOderEntry";
        } else {
            methodName = "createOderEntryOnTransactOderEntry";
        }
        
        // メソッドの取得
        method = JbEdiRcvOdrServiceImpl.class.getDeclaredMethod(methodName, ResidentRequestDomain.class, String.class, Date.class);
        method.setAccessible(true);
        
        // 共通チェックの実行
        method.invoke(jbEdiRcvOdrServiceImpl(), req, "TG0", new Date(115, 6, 28));
        // method.invoke(jbEdiRcvOdrServiceImpl(), req, rcvOdrCompCd, cigmaAds);
    }
    
    /**
     * <br />輸出出荷品番原単位の存在チェックのテスト (正常系)
     *
     * @throws Exception テストが失敗した場合
     */
    @Test
    @SuppressWarnings("deprecation")
    public void testValidateTmExpItemNoSpInfo() throws Exception {
        // メソッドの取得
        method = JbEdiRcvOdrServiceImpl.class.getDeclaredMethod("validateTmExpItemNoSpInfo", B0100EdiRcvOdrDomain.class);
        method.setAccessible(true);
        
        B0100EdiRcvOdrDomain ediRcvOdr = new B0100EdiRcvOdrDomain();
        
        // ETD以前の直近の適用開始日が存在しない場合
        ediRcvOdr.setRcvOdrCompCd("TH2");
        ediRcvOdr.setItemNo("A002TB0091B03N");
        ediRcvOdr.setPkgCd("220");
        ediRcvOdr.setCustomerCd("30001205");
        ediRcvOdr.setLgcyShipTo("00");
        ediRcvOdr.setEtdDueDt(new Date(114, 2, 31));
        
        assertThat((Boolean) method.invoke(jbEdiRcvOdrServiceImpl(), ediRcvOdr), is(false));
        
        // ETD以前の直近の適用開始日が存在する場合 (ETD以降のデータなし)
        ediRcvOdr.setRcvOdrCompCd("TH2");
        ediRcvOdr.setItemNo("A002TB0091B04N");
        ediRcvOdr.setPkgCd("220");
        ediRcvOdr.setCustomerCd("30001205");
        ediRcvOdr.setLgcyShipTo("00");
        ediRcvOdr.setEtdDueDt(new Date(114, 3, 30));
        
        assertThat((Boolean) method.invoke(jbEdiRcvOdrServiceImpl(), ediRcvOdr), is(true));
        
        // ETD以前の直近の適用開始日が存在する場合 (ETD以降のデータあり)
        ediRcvOdr.setRcvOdrCompCd("TH2");
        ediRcvOdr.setItemNo("A002TB0091B03N");
        ediRcvOdr.setPkgCd("220");
        ediRcvOdr.setCustomerCd("30001205");
        ediRcvOdr.setLgcyShipTo("00");
        ediRcvOdr.setEtdDueDt(new Date(114, 4, 29));
        
        assertThat((Boolean) method.invoke(jbEdiRcvOdrServiceImpl(), ediRcvOdr), is(true));
        
        // 得意先コード、LGCY送荷先＝NULLの場合
        ediRcvOdr.setRcvOdrCompCd("TH2");
        ediRcvOdr.setItemNo("A002TB0091B03N");
        ediRcvOdr.setPkgCd("220");
        ediRcvOdr.setCustomerCd(null);
        ediRcvOdr.setLgcyShipTo(null);
        ediRcvOdr.setEtdDueDt(new Date(114, 4, 29));
        
        assertThat((Boolean) method.invoke(jbEdiRcvOdrServiceImpl(), ediRcvOdr), is(true));
        
        // 品目番号＝NULLの場合
        ediRcvOdr.setRcvOdrCompCd("TH2");
        ediRcvOdr.setItemNo(null);
        ediRcvOdr.setPkgCd("220");
        ediRcvOdr.setCustomerCd("30001205");
        ediRcvOdr.setLgcyShipTo("00");
        ediRcvOdr.setEtdDueDt(new Date(114, 4, 29));
        
        assertThat((Boolean) method.invoke(jbEdiRcvOdrServiceImpl(), ediRcvOdr), is(true));
    }
    
    /**
     * <br />輸出手続品番原単位の存在チェックのテスト (正常系)
     *
     * @throws Exception テストが失敗した場合
     */
    @Test
    @SuppressWarnings("deprecation")
    public void testValidateTmExpFormalitiItemNo() throws Exception {
        // メソッドの取得
        method = JbEdiRcvOdrServiceImpl.class.getDeclaredMethod("validateTmExpFormalitiItemNo", B0100EdiRcvOdrDomain.class);
        method.setAccessible(true);
        
        B0100EdiRcvOdrDomain ediRcvOdr = new B0100EdiRcvOdrDomain();
        
        // ETD以前の直近の適用開始日が存在しない場合
        ediRcvOdr.setRcvOdrCompCd("TH2");
        ediRcvOdr.setItemNo("A002TB0091B03N");
        ediRcvOdr.setEtdDueDt(new Date(113, 2, 29));
        
        assertThat((Boolean) method.invoke(jbEdiRcvOdrServiceImpl(), ediRcvOdr), is(false));
        
        // ETD以前の直近の適用開始日が存在する場合 (ETD以降のデータなし)
        ediRcvOdr.setRcvOdrCompCd("TH2");
        ediRcvOdr.setItemNo("A002TB0091B05N");
        ediRcvOdr.setEtdDueDt(new Date(114, 3, 30));
        
        assertThat((Boolean) method.invoke(jbEdiRcvOdrServiceImpl(), ediRcvOdr), is(true));
        
        // ETD以前の直近の適用開始日が存在する場合 (ETD以降のデータあり)
        ediRcvOdr.setRcvOdrCompCd("TH2");
        ediRcvOdr.setItemNo("A002TB0091B03N");
        ediRcvOdr.setEtdDueDt(new Date(114, 4, 29));
        
        assertThat((Boolean) method.invoke(jbEdiRcvOdrServiceImpl(), ediRcvOdr), is(true));
        
        // 品目番号＝NULLの場合
        ediRcvOdr.setRcvOdrCompCd("TH2");
        ediRcvOdr.setItemNo(null);
        ediRcvOdr.setEtdDueDt(new Date(114, 4, 29));
        
        assertThat((Boolean) method.invoke(jbEdiRcvOdrServiceImpl(), ediRcvOdr), is(true));
    }
    
    /**
     * <br />輸出手続品番原単位の品目名称登録のテスト (正常系)
     *
     * @throws Exception テストが失敗した場合
     */
    @Test
    @SuppressWarnings("deprecation")
    public void testUpdateTmExpFormalitiItemNo() throws Exception {
        // メソッドの取得
        method = JbEdiRcvOdrServiceImpl.class.getDeclaredMethod("updateTmExpFormalitiItemNo", B0100EdiRcvOdrDomain.class);
        method.setAccessible(true);

        // ETD以前の直近の適用開始日がない場合
        B0100EdiRcvOdrDomain ediRcvOdr = new B0100EdiRcvOdrDomain();
        ediRcvOdr.setRcvOdrCompCd("TH2");
        ediRcvOdr.setItemNo("A002TB0091B03N");
        ediRcvOdr.setItemDescription("BRACKET");
        ediRcvOdr.setEtdDueDt(new Date(113, 3, 29));
        
        method.invoke(jbEdiRcvOdrServiceImpl(), ediRcvOdr);
    }
    
    /**
     * <br />輸出手続品番原単位の品目名称登録のテスト (正常系)
     *
     * @throws Exception テストが失敗した場合
     */
    @Test
    @SuppressWarnings("deprecation")
    public void testUpdateTmExpFormalitiItemNo2() throws Exception {
        // メソッドの取得
        method = JbEdiRcvOdrServiceImpl.class.getDeclaredMethod("updateTmExpFormalitiItemNo", B0100EdiRcvOdrDomain.class);
        method.setAccessible(true);

        // ETD以前の直近の適用開始日がある場合
        B0100EdiRcvOdrDomain ediRcvOdr = new B0100EdiRcvOdrDomain();
        ediRcvOdr.setRcvOdrCompCd("TH2");
        ediRcvOdr.setItemNo("A002TB0091B03N");
        ediRcvOdr.setItemDescription("BRACKET");
        ediRcvOdr.setEtdDueDt(new Date(114, 3, 30));
        
        method.invoke(jbEdiRcvOdrServiceImpl(), ediRcvOdr);
    }
    
    /**
     * <br />transactErrReportOutputのテスト (複数プリンタ出力・デフォルトプリンタ出力)
     * 
     * @throws Exception テストが失敗した場合
     */
    @Test
    public void testTransactErrReportOutput4() throws Exception {
        // PDF帳票の設定
        MockObjectManager.setReturnValueAt(LB001ReportServiceImpl.class, "searchOdrRcv", 0, folder.newFile("M1_30001205_00_20140430.pdf"));
        MockObjectManager.setReturnValueAt(LB001ReportServiceImpl.class, "searchOdrRcv", 1, folder.newFile("M1_30001205_00_20140507.pdf"));
        MockObjectManager.setReturnValueAt(LB001ReportServiceImpl.class, "searchOdrRcv", 2, folder.newFile("M1_30001205_01_20140430.pdf"));
        MockObjectManager.setReturnValueAt(LB001ReportServiceImpl.class, "searchOdrRcv", 3, folder.newFile("MX_30001206_02_20140430.pdf"));

        // メソッドの取得
        method = JbEdiRcvOdrServiceImpl.class.getDeclaredMethod("transactErrReportOutput", ResidentRequestDomain.class, String.class, Date.class);
        method.setAccessible(true);
        
        method.invoke(jbEdiRcvOdrServiceImpl(), req, rcvOdrCompCd, cigmaAds);
    }
    
    
    /**
     * <br />handleErrEdiRcvOdrOnCreateOderEntryのテスト (持ち回り判定)
     *
     * @throws Exception テストが失敗した場合
     */
    @Test
    public void testHandleErrEdiRcvOdrOnCreateOderEntry2() throws Exception {
        // メソッドの取得
        method = JbEdiRcvOdrServiceImpl.class.getDeclaredMethod("handleErrEdiRcvOdrOnCreateOderEntry", String.class);
        method.setAccessible(true);
        
        // 受注登録 (エラーレコードの処理)
        method.invoke(jbEdiRcvOdrServiceImpl(), rcvOdrCompCd);
    }
    
    /**
     * <br />searchEdiRcvOdrのテスト (仕様変更対応 ST846)
     *
     * @throws Exception テストが失敗した場合
     */
    @Test
    public void testSearchEdiRcvOdr() throws Exception {
        // メソッドの取得
        method = JbEdiRcvOdrServiceImpl.class.getDeclaredMethod("searchEdiRcvOdr", boolean.class, String.class, boolean.class, String[].class);
        method.setAccessible(true);
        
        // 受注登録 (エラーレコードの処理)
        method.invoke(jbEdiRcvOdrServiceImpl(), true, rcvOdrCompCd, true, null);
        method.invoke(jbEdiRcvOdrServiceImpl(), true, rcvOdrCompCd, false, null);
        method.invoke(jbEdiRcvOdrServiceImpl(), false, rcvOdrCompCd, true, null);
        method.invoke(jbEdiRcvOdrServiceImpl(), false, rcvOdrCompCd, false, null);
    }
    
    /**
     * <br />AOP処理されたSpringのBeanからJbEdiRcvOdrServiceImplオブジェクトを取得します。
     *
     * @return JbEdiRcvOdrServiceImplオブジェクト
     * @throws Exception JbEdiRcvOdrServiceImplオブジェクトが取得できない場合
     */
    private JbEdiRcvOdrServiceImpl jbEdiRcvOdrServiceImpl() throws Exception {
        // Springの動的プロキシ(org.springframework.aop.framework.JdkDynamicAopProxy)の取得
        InvocationHandler handler = Proxy.getInvocationHandler(jbEdiRcvOdrService);
        
        // advisedフィールドの取得
        Field advised = handler.getClass().getDeclaredField("advised");
        advised.setAccessible(true);

        // JbEdiRcvOdrServiceImplオブジェクトの取得
        return (JbEdiRcvOdrServiceImpl) ((AdvisedSupport) advised.get(handler)).getTargetSource().getTarget(); 
    }
}
