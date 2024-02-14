/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.ws;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.AbstractEca0027Test;
import com.globaldenso.eca0027.core.business.domain.criteria.WsCigmaComnAuxCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.WsCigmaComnAuxService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;

/**
 * 
 * WsCigmaComnAuxServceの単体テストクラスです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class WsCigmaComnAuxServceTest extends AbstractEca0027Test {

    
    /**
     * 共通サービス
     */
    protected CommonService commonService;
    
    /**
     * Serviceクラス
     */
    protected WsCigmaComnAuxService wsCigmaComnAuxService;

    /**
     * デフォルトコンストラクタです。
     */
    public WsCigmaComnAuxServceTest() {
        super();
    }
    
    /**
     * Serviceクラスインスタンス生成
     */
    @Before
    public void setUp(){
        commonService = (CommonService) getContext().getBean("commonService");
        wsCigmaComnAuxService = (WsCigmaComnAuxService) getContext().getBean("wsCigmaComnAuxService");
    }
    
    /* ========== テストケース ================================================================== */
    // --- ValidateDatabaseCigmaAvailable ----------------------------------------------------------
    /**
     * 正常系：NEXUSへCIGMA夜間バッチ状態を通知する単体テスト
     * <ul>
     *     <li>NEXUSへCIGMA夜間バッチ状態を通知を行います。</li>
     *     <li>validateDatabaseCigmaAvailable</li>
     * </ul>
     * @throws ApplicationException CIGMA夜間バッチの稼働状況が取得できない場合
     */
    @Test
    public void testValidateDatabaseCigmaAvailable001() throws ApplicationException {
        
        // 入力ドメインの設定
        WsCigmaComnAuxCriteriaDomain inDomain = new WsCigmaComnAuxCriteriaDomain();
        inDomain.setCompCd("THE");
        inDomain.setAccessibilityTyp("1");
        inDomain.setCigmaAds(commonService.searchCigmaAds("THE"));
        
        // 結果取得用ドメイン
        int outDomain;
        
        // 結果確認用(期待値)ドメイン
        int expInt = 1;
        
        // Serviceクラスメソッドの呼出し
        outDomain = wsCigmaComnAuxService.updateNightBatStat(inDomain);
        
        // 結果の検証
        assertEquals(outDomain, expInt);
    }
    
    /* ========== テストケース ================================================================== */
    // --- ValidateDatabaseCigmaAvailable ----------------------------------------------------------
    /**
     * 異常系：NEXUSへCIGMA夜間バッチ状態を通知する単体テスト
     * <ul>
     *     <li>NEXUSへCIGMA夜間バッチ状態を通知を行います。</li>
     *     <li>validateDatabaseCigmaAvailable</li>
     * </ul>
     * @throws ApplicationException CIGMA夜間バッチの稼働状況が取得できない場合
     */
    @Test
    public void testValidateDatabaseCigmaAvailable002() throws ApplicationException {
        
        // 入力ドメインの設定
        WsCigmaComnAuxCriteriaDomain inDomain = new WsCigmaComnAuxCriteriaDomain();
        inDomain.setCompCd("TA");
        inDomain.setAccessibilityTyp("1");
        inDomain.setCigmaAds(commonService.searchCigmaAds("THE"));
        
        // 結果取得用ドメイン
        int outDomain;
        
        // 結果確認用(期待値)ドメイン
        int expInt = 0;
        
        // Serviceクラスメソッドの呼出し
        outDomain = wsCigmaComnAuxService.updateNightBatStat(inDomain);
        
        // 結果の検証
        assertEquals(outDomain, expInt);
    }
}
