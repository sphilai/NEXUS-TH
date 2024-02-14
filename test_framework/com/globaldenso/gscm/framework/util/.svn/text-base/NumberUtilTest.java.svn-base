/*
 * PROJECT:GSCM共通フレームワーク
 * 
 * NumberUtilTestクラス
 * 
 * Version.
 * 1.0.0
 * 
 * Copyright (c) 2013 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.gscm.framework.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import java.math.BigDecimal;
import java.util.Locale;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * NumberUtilテストクラス。
 * <p>
 * NumberUtilをテストする。
 * </p>
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 *
 */
public class NumberUtilTest {

    /**
     * デフォルトコンストラクタ。
     */
    public NumberUtilTest() {
    }
    
    /**
     * テストの前準備
     */
    @BeforeClass
    public static void setUpClass() {
        
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{
            "WEB-INF/applicationContext-aij2-aop.xml",
            "WEB-INF/applicationContext-aij2-jdbc.xml",
            "WEB-INF/applicationContext-aij2.xml",
            "WEB-INF/applicationContext-aijbutil.xml"});
        
        new SpringUtil().setApplicationContext(context);
        
        new ResourcesFactory().createResources("");
    }
    
    /**
     * formatメソッドのテストメソッド。
     * <p>
     * formatメソッドのテストメソッド。
     * </p>
     * 
     * @throws Exception 例外
     */
    @Test
    public void testFormat() throws Exception {
        
        try {
            // 小数点がピリオド
            assertEquals("1-1", "1,234,567.89", NumberUtil.format(1234567.89, "#,##0.##"));
            assertEquals("1-2", "1'234'567.89", NumberUtil.format(1234567.89, "#'##0.##"));
            assertEquals("1-3", "1 234 567.89", NumberUtil.format(1234567.89, "# ##0.##"));

            // 小数点がコンマ
            assertEquals("1-4", "1.234.567,89", NumberUtil.format(1234567.89, "#.##0,##"));
            assertEquals("1-5", "1'234'567,89", NumberUtil.format(1234567.89, "#'##0,##"));
            assertEquals("1-6", "1 234 567,89", NumberUtil.format(1234567.89, "# ##0,##"));

            assertEquals("1-7", "1,234,567'89", NumberUtil.format(1234567.89, "#,##0'##"));
            assertEquals("1-8", "1,234,567 89", NumberUtil.format(1234567.89, "#,##0 ##"));

            // グループ区切りなし
            assertEquals("2-1", "1234567.89", NumberUtil.format(1234567.89, "#0.##"));
//            assertEquals("1234567,89", NumberUtil.format(1234567.89, "#0,##"));

            // 小数点なし
            assertEquals("2-2", "1,234,568", NumberUtil.format(1234567.89, "#,###"));
//            assertEquals("1.234.568", NumberUtil.format(1234567.89, "#.###"));

            // 小数桁固定
            assertEquals("3-1", ".120", NumberUtil.format(0.12, "#.000"));
            assertEquals("3-2", "0.120", NumberUtil.format(0.12, "0.000"));

            // 不正な指定(グループ区切りが複数)
            assertNull("4-1", NumberUtil.format(1234567.89, "#,###.##"));

            // 区切り文字不正
            assertNull("4-2", NumberUtil.format(1234567.89, "#a###b##"));
            
            // doubleを超える精度
            BigDecimal num = new BigDecimal("999999999999999.99");
            assertEquals("5-1", "999,999,999,999,999.99", NumberUtil.format(num, "#,##0.##"));
            
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }
//        try {
//            assertEquals("1234568,89", NumberUtil.format(1234567.89, "0.##0,##"));
//            fail();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }

    /**
     * parseNumberメソッドのテストメソッド。
     * <p>
     * parseNumberメソッドのテストメソッド。
     * </p>
     * 
     * @throws Exception 例外
     */
    @Test
    public void testParseNumber() throws Exception {
        
        try {
            // 小数点がピリオド
            assertEquals("1-1", new BigDecimal("1234567.89"), NumberUtil.parseNumber("1,234,567.89", "#,##0.##"));
            assertEquals("1-2", new BigDecimal("1234567.89"), NumberUtil.parseNumber("1'234'567.89", "#'##0.##"));
            assertEquals("1-3", new BigDecimal("1234567.89"), NumberUtil.parseNumber("1 234 567.89", "# ##0.##"));

            // 小数点がコンマ
            assertEquals("1-4", new BigDecimal("1234567.89"), NumberUtil.parseNumber("1.234.567,89", "#.##0,##"));
            assertEquals("1-5", new BigDecimal("1234567.89"), NumberUtil.parseNumber("1'234'567,89", "#'##0,##"));
            assertEquals("1-6", new BigDecimal("1234567.89"), NumberUtil.parseNumber("1 234 567,89", "# ##0,##"));

            assertEquals("1-7", new BigDecimal("1234567.89"), NumberUtil.parseNumber("1,234,567'89", "#,##0'##"));
            assertEquals("1-8", new BigDecimal("1234567.89"), NumberUtil.parseNumber("1,234,567 89", "#,##0 ##"));

            // グループ区切りなし
            assertEquals("2-1", new BigDecimal("1234567.89"), NumberUtil.parseNumber("1234567.89", "##0.##"));
//            assertEquals(1234567.89, NumberUtil.parseNumber("1234567,89", "##0,##"));

            // 小数点なし
            assertEquals("2-2", new BigDecimal("1234567"), NumberUtil.parseNumber("1,234,567", "#,###"));

            // 小数桁固定
            assertEquals("3-1", new BigDecimal("0.120"), NumberUtil.parseNumber(".120", "#.000"));
            assertEquals("3-2", new BigDecimal("0.120"), NumberUtil.parseNumber("0.120", "0.000"));

            // 不正な指定（メソッドの戻り型に合わせて期待結果はLong型に変換)
            assertNull("4-1", NumberUtil.parseNumber("1.23.45.67", "#,###.##"));

            // 区切り文字不正
            assertNull("4-2", NumberUtil.parseNumber("1234567ab", "#a###b##"));

            // doubleを超える精度
            assertEquals("5-1", new BigDecimal("999999999999999.99"), NumberUtil.parseNumber("999999999999999.99", "#,##0.##"));

        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }
    }

    /**
     * formatNumberToDbメソッドのテストメソッド。
     * <p>
     * formatNumberToDbメソッドのテストメソッド。
     * </p>
     * 
     * @throws Exception 例外
     */
    @Test
    public void testFormatNumberToDb() throws Exception {
        try {
            // TM_RESOURCESに標準書式指定あり
            assertEquals("1-1", "1234.123456789123", NumberUtil.formatNumberToDb("1,234.12345678912345", "JP0", new Locale("ja")));
            // TM_RESOURCESに標準書式指定なし
            assertEquals("1-2", "1234.1234567891", NumberUtil.formatNumberToDb("1,234.12345678912345", "JP0", new Locale("en")));
            // 数値変換エラー
            assertEquals("1-3", "1,234,567.89", NumberUtil.formatNumberToDb("1,234,567.89", "3A0", new Locale("ja")));
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }
    }
    
    /**
     * formatNumberToOwnerCompメソッドのテストメソッド。
     * <p>
     * formatNumberToOwnerCompメソッドのテストメソッド。
     * </p>
     * 
     * @throws Exception 例外
     */
    @Test
    public void testFormatNumberToOwnerComp() throws Exception {
        try {
            // TM_RESOURCESに標準書式指定あり
            assertEquals("1-1", "1,234.12345678912", NumberUtil.formatNumberToOwnerComp("1234.123456789123", "JP0", new Locale("ja")));
            // TM_RESOURCESに標準書式指定なし
            assertEquals("1-2", "1,234.12345678912", NumberUtil.formatNumberToOwnerComp("1234.123456789123", "JP0", new Locale("en")));
            // 数値変換エラー
            assertEquals("1-3", "1a234a567b89", NumberUtil.formatNumberToOwnerComp("1a234a567b89", "DNJ", new Locale("ja")));
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }
    }
}
