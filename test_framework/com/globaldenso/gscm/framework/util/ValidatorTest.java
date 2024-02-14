/*
 * PROJECT：GSCM共通フレームワーク
 * 
 * Validatorテストクラス
 * 
 * Version.
 * 1.0.0
 * 
 * Copyright (c) 2013 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.gscm.framework.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

import org.apache.commons.validator.ValidatorException;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.xml.sax.SAXException;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.ai.common.core.exception.SystemException;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;

/**
 * Validatorのテストクラス
 * <p>
 * 
 * <pre>
 * Validatorのテストクラス
 * </pre>
 * 
 * </p>
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 10885 $
 */
public class ValidatorTest {
    
    /**
     * コンストラクタ
     */
    public ValidatorTest() {
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
     * 必須チェック
     * @throws ApplicationException 例外
     * @throws IOException 例外
     * @throws ValidatorException 例外
     * @throws SAXException 例外
     */
    @Test
    public void testRequired() throws ApplicationException, IOException, ValidatorException, SAXException {
        
        // 標準メッセージ
        {
            ValidatorTestDomain testDomain = new ValidatorTestDomain();
            testDomain.setLocale(Locale.JAPANESE);
            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain, "required_test");
            boolean valid = validator.isValidateProperty("property1", "RequiredTest");
            assertFalse("check1 1", valid);
            MessageDomain messageDomain = validator.getErrList().get(0);
            Object[] params = messageDomain.getParams();
            assertNotNull("check1 2", messageDomain);
            assertEquals("check1 3", "GSCM-E0-0011", messageDomain.getKey());
            assertEquals("check1 4", "プロパティ1", params[0]);
            assertEquals("check1 5", "required_test.property1", messageDomain.getProperty());
        }
        
        // カスタムメッセージ
        {
            ValidatorTestDomain testDomain = new ValidatorTestDomain();
            testDomain.setLocale(Locale.JAPANESE);

            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain, "required_test");
            boolean valid = validator.isValidateProperty("property2", "RequiredTest");
            assertFalse("check2 1", valid);
            MessageDomain messageDomain = validator.getErrList().get(0);
            Object[] params = messageDomain.getParams();
            assertNotNull("check2 2", messageDomain);
            assertEquals("check2 3", "MSG-00001", messageDomain.getKey());
            assertEquals("check2 5", 3, params.length);
            assertEquals("check2 5", "引数0", params[0]);
            assertEquals("check2 6", "引数1", params[1]);
            assertEquals("check2 7", "引数2", params[2]);
            assertEquals("check2 5", "required_test.property2", messageDomain.getProperty());
        }
        
        // チェックOK
        {
            ValidatorTestDomain testDomain = new ValidatorTestDomain();
            testDomain.setLocale(Locale.JAPANESE);
            testDomain.setProperty2("test");

            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain, "required_test");
            boolean valid = validator.isFill("property2", "RequiredTest");
            assertTrue("check3 1", valid);
            List<MessageDomain> errList = validator.getErrList();
            assertEquals("check3 2", 0, errList.size());
        }
        
        // チェック対象外
        {
            ValidatorTestDomain testDomain = new ValidatorTestDomain();
            testDomain.setLocale(Locale.JAPANESE);

            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain, "required_test");
            boolean valid = validator.isValidateProperty("property3", "RequiredTest");
            assertTrue("check4 1", valid);
            List<MessageDomain> errList = validator.getErrList();
            assertEquals("check4 2", 0, errList.size());
        }
        
        // 未入力・スペースのみ入力(NULLはcheck1で実施済み)
        {
            ValidatorTestDomain testDomain = new ValidatorTestDomain();
            testDomain.setLocale(Locale.JAPANESE);

            // ブランク
            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain, "required_test");
            testDomain.setProperty1("");
            boolean valid = validator.isValidateProperty("property1", "RequiredTest");
            assertFalse("check5 1", valid);
            assertEquals("check5 2", "GSCM-E0-0011", validator.getErrList().get(0).getKey());
            // 半角スペース
            validator = new Validator<ValidatorTestDomain>(testDomain, "required_test");
            testDomain.setProperty1(" ");
            valid = validator.isValidateProperty("property1", "RequiredTest");
            assertTrue("check5 3", valid);
            assertEquals("check5 4", 0, validator.getErrList().size());
            // 全角スペース
            validator = new Validator<ValidatorTestDomain>(testDomain, "required_test");
            testDomain.setProperty1("　");
            valid = validator.isValidateProperty("property1", "RequiredTest");
            assertTrue("check5 5", valid);
            assertEquals("check5 6", 0, validator.getErrList().size());
        }
    }
    
    /**
     * 属性チェック
     * @throws ApplicationException 例外
     * @throws IOException 例外
     * @throws ValidatorException 例外
     * @throws SAXException 例外
     */
    @Test
    public void testAttr() throws ApplicationException, IOException, ValidatorException, SAXException {
        // 全角チェック
        {
            ValidatorTestDomain testDomain = new ValidatorTestDomain();
            testDomain.setLocale(Locale.JAPANESE);

            // 全角チェック（NG）
            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain, "attr");
            testDomain.setProperty1("全KAKU");
            boolean valid = validator.isValidateProperty("property1", "AttrTest1");
            assertFalse("check1 1", valid);
            MessageDomain messageDomain = validator.getErrList().get(0);
            Object[] params = messageDomain.getParams();
            assertNotNull("check1 2", messageDomain);
            assertEquals("check1 3", "GSCM-E0-0014", messageDomain.getKey());
            assertEquals("check1 4", "全角", params[0]);
            assertEquals("check1 5", "attr.property1", messageDomain.getProperty());

            // チェックOK
            validator = new Validator<ValidatorTestDomain>(testDomain, "attr");
            testDomain.setProperty1("全角");
            valid = validator.isPermittedAttr("property1", "AttrTest1");
            assertTrue("check1 6", valid);
            assertEquals("check1 7", 0, validator.getErrList().size());
        }
        
        // 英数字チェック
        {
            ValidatorTestDomain testDomain = new ValidatorTestDomain();
            testDomain.setLocale(Locale.JAPANESE);

            // 英数字チェック（NG）
            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("ABC-123");
            boolean valid = validator.isValidateProperty("property1", "AttrTest2");
            assertFalse("check2 1", valid);
            MessageDomain messageDomain = validator.getErrList().get(0);
            Object[] params = messageDomain.getParams();
            assertNotNull("check2 2", messageDomain);
            assertEquals("check2 3", "GSCM-E0-0015", messageDomain.getKey());
            assertEquals("check2 4", "英数字", params[0]);
            assertEquals("check2 5", "property1", messageDomain.getProperty());

            // チェックOK
            validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("aBc123");
            valid = validator.isValidateProperty("property1", "AttrTest2");
            assertTrue("check2 6", valid);
            assertEquals("check2 7", 0, validator.getErrList().size());
        }
        
        // 英字チェック
        {
            ValidatorTestDomain testDomain = new ValidatorTestDomain();
            testDomain.setLocale(Locale.ENGLISH);

            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);

            // 英字チェック（NG）
            testDomain.setProperty1("ABC123");
            boolean valid = validator.isValidateProperty("property1", "AttrTest3");
            assertFalse("check3 1", valid);
            MessageDomain messageDomain = validator.getErrList().get(0);
            Object[] params = messageDomain.getParams();
            assertNotNull("check3 2", messageDomain);
            assertEquals("check3 3", "GSCM-E0-0016", messageDomain.getKey());
            assertEquals("check3 4", "alphabet", params[0]);
            assertEquals("check3 5", "property1", messageDomain.getProperty());

            // チェックOK
            validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("aBc");
            valid = validator.isValidateProperty("property1", "AttrTest3");
            assertTrue("check3 6", valid);
            assertEquals("check3 7", 0, validator.getErrList().size());
        }
        
        // 数値チェック
        {
            ValidatorTestDomain testDomain = new ValidatorTestDomain();
            testDomain.setLocale(Locale.JAPANESE);

            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);

            // 英字チェック（NG）
            testDomain.setProperty1("１２３４123");
            boolean valid = validator.isValidateProperty("property1", "AttrTest4");
            assertFalse("check4 1", valid);
            MessageDomain messageDomain = validator.getErrList().get(0);
            Object[] params = messageDomain.getParams();
            assertNotNull("check4 2", messageDomain);
            assertEquals("check4 3", "GSCM-E0-0017", messageDomain.getKey());
            assertEquals("check4 4", "数字", params[0]);
            assertEquals("check4 5", "property1", messageDomain.getProperty());

            // チェックOK
            validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("12345");
            valid = validator.isValidateProperty("property1", "AttrTest4");
            assertTrue("check4 6", valid);
            assertEquals("check4 7", 0, validator.getErrList().size());
        }
        
        // Blank
        {
            ValidatorTestDomain testDomain = new ValidatorTestDomain();
            testDomain.setLocale(Locale.JAPANESE);

            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);

            // NULL
            testDomain.setProperty1(null);
            boolean valid = validator.isValidateProperty("property1", "AttrTest1");
            assertTrue("check5 1", valid);
            assertEquals("check5 2", 0, validator.getErrList().size());
            // blank
            validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("");
            valid = validator.isValidateProperty("property1", "AttrTest1");
            assertTrue("check5 3", valid);
            assertEquals("check5 4", 0, validator.getErrList().size());
        }
        // 同一プロパティが既にエラー時
//        {
//            ValidatorTestDomain testDomain = new ValidatorTestDomain();
//            testDomain.setLocale(Locale.JAPANESE);
//
//            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
//            testDomain.setProperty1("ABC");
//            validator.isPermittedCharMinLen("property1", "AttrTest5");
//            boolean valid = validator.isPermittedAttr("property1", "AttrTest5");
//            assertTrue("check6 1", valid);
//            assertEquals("check6 2", 1, validator.getErrList().size());
//        }
        // 未入力・スペースのみ入力
        {
            ValidatorTestDomain testDomain = new ValidatorTestDomain();
            testDomain.setLocale(Locale.JAPANESE);

            // 半角スペース
            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1(" ");
            boolean valid = validator.isValidateProperty("property1", "AttrTest4");
            assertFalse("check7 1", valid);
            assertEquals("check7 2", "GSCM-E0-0017", validator.getErrList().get(0).getKey());
            
            // 全角スペース
            validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("　");
            valid = validator.isValidateProperty("property1", "AttrTest4");
            assertFalse("check7 3", valid);
            assertEquals("check7 4", "GSCM-E0-0017", validator.getErrList().get(0).getKey());
        }
        
        // 禁止文字チェック
        {
            // サロゲート文字
            String surro = null;
            for (char i = 55296; i < 65535; i++) {
                for (char j = 56320; j < 65535; j++) {
                    if (Character.isSurrogatePair(i, j)){
                        surro = String.valueOf(Character.toChars(Character.toCodePoint(i, j)));
                        break;
                    }
                }
                if (surro != null) {
                    break;
                }
            }
            
            ValidatorTestDomain testDomain = new ValidatorTestDomain();
            testDomain.setLocale(Locale.JAPANESE);
            
            // 全角チェック（禁止文字チェックなし）
            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain, "attr");
            testDomain.setProperty1("㈱");
            boolean valid = validator.isPermittedAttr("property1", "AttrTest1");
            assertTrue("check8 1", valid);
            assertEquals("check8 2", 0, validator.getErrList().size());

            // 禁則文字チェック
            validator = new Validator<ValidatorTestDomain>(testDomain, "attr");
            testDomain.setProperty2("㈱");
            valid = validator.isValidateProperty("property2", "AttrTest1");
            assertFalse("check8 3", valid);
            assertEquals("check8 4", 1, validator.getErrList().size());
            MessageDomain messageDomain = validator.getErrList().get(0);
            assertEquals("check8 5", "GSCM-E0-0012", messageDomain.getKey());
            assertEquals("check8 6", "attr.property2", messageDomain.getProperty());
            
            // サロゲートペア文字チェック
            validator = new Validator<ValidatorTestDomain>(testDomain, "attr");
            testDomain.setProperty2("t" + surro + "t");
            valid = validator.isValidateProperty("property2", "AttrTest1");
            assertFalse("check8 7", valid);
            assertEquals("check8 8", 1, validator.getErrList().size());
            messageDomain = validator.getErrList().get(0);
            assertEquals("check8 9", "GSCM-E0-0012", messageDomain.getKey());
            assertEquals("check8 10", "attr.property2", messageDomain.getProperty());
            
        }
    }
    
    /**
     * 最小桁数チェック
     * @throws ApplicationException 例外
     * @throws IOException 例外
     * @throws ValidatorException 例外
     * @throws SAXException 例外
     */
    @Test
    public void testMinlength() throws ApplicationException, IOException, ValidatorException, SAXException {
        
        // チェックNG
        {
            ValidatorTestDomain testDomain = new ValidatorTestDomain();
            testDomain.setLocale(Locale.JAPANESE);

            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);

            testDomain.setProperty1("123456789");
            boolean valid = validator.isValidateProperty("property1", "MinlengthTest");
            assertFalse("check1 1", valid);
            MessageDomain messageDomain = validator.getErrList().get(0);
            Object[] params = messageDomain.getParams();
            assertNotNull("check1 2", messageDomain);
            assertEquals("check1 3", "GSCM-E0-0022", messageDomain.getKey());
            assertEquals("check1 4", "最小桁数", params[0]);
            assertEquals("check1 5", 10, params[1]);
            assertEquals("check1 6", "property1", messageDomain.getProperty());

            // バイト数ではなく文字数
            validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("あいうえお");
            valid = validator.isValidateProperty("property1", "MinlengthTest");
            assertFalse("check1 7", valid);
            messageDomain = validator.getErrList().get(0);
            params = messageDomain.getParams();
            assertNotNull("check1 8", messageDomain);
            assertEquals("check1 9", "GSCM-E0-0022", messageDomain.getKey());
            assertEquals("check1 10", "最小桁数", params[0]);
            assertEquals("check1 11", 10, params[1]);
            assertEquals("check1 12", "property1", messageDomain.getProperty());
            
        }
        
        // 禁則文字チェック
        // チェックNG
        {
            ValidatorTestDomain testDomain = new ValidatorTestDomain();
            testDomain.setLocale(Locale.JAPANESE);

            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
            
            // 禁則文字
            testDomain.setProperty1("a㈱㈱㈱㈱㈱㈱㈱㈱㈱㈱a");
            boolean valid = validator.isPermittedCharMinLen("property1", "MinlengthTest");
            assertTrue("check6 1", valid);
            // 禁止文字のエラーではなく桁数エラーとなる
            assertEquals("check6 2", 0, validator.getErrList().size());
            

            // サロゲート文字
            String surro = null;
            for (char i = 55296; i < 65535; i++) {
                for (char j = 56320; j < 65535; j++) {
                    if (Character.isSurrogatePair(i, j)){
                        surro = String.valueOf(Character.toChars(Character.toCodePoint(i, j)));
                        break;
                    }
                }
                if (surro != null) {
                    break;
                }
            }
            validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("ttttt" + surro + "tttttt");
            valid = validator.isPermittedCharMinLen("property1", "MinlengthTest");
            assertTrue("check6 3", valid);
            // 禁止文字のエラーではなく桁数エラーとなる
            assertEquals("check6 4", 0, validator.getErrList().size());
        }
        
        // チェックOK
        {
            ValidatorTestDomain testDomain = new ValidatorTestDomain();
            testDomain.setLocale(Locale.JAPANESE);

            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("1234567890");
            boolean valid = validator.isPermittedCharMinLen("property1", "MinlengthTest");
            assertTrue("check2 1", valid);
            assertEquals("check2 2", 0, validator.getErrList().size());

            validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("あいうえおかきくけこ");
            valid = validator.isValidateProperty("property1", "MinlengthTest");
            assertTrue("check2 3", valid);
            assertEquals("check2 4", 0, validator.getErrList().size());

            validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("あいうえお12345");
            valid = validator.isValidateProperty("property1", "MinlengthTest");
            assertTrue("check2 5", valid);
            assertEquals("check2 6", 0, validator.getErrList().size());
        }
        
        // 値Blank
        {
            ValidatorTestDomain testDomain = new ValidatorTestDomain();
            testDomain.setLocale(Locale.JAPANESE);

            // NULL
            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1(null);
            boolean valid = validator.isValidateProperty("property1", "MinlengthTest");
            assertTrue("check3 1", valid);
            assertEquals("check3 2", 0, validator.getErrList().size());
            // Blank
            validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("");
            valid = validator.isValidateProperty("property1", "MinlengthTest");
            assertTrue("check3 3", valid);
            assertEquals("check3 4", 0, validator.getErrList().size());
        }
        
        // 同一プロパティが既にエラー時
//        {
//            ValidatorTestDomain testDomain = new ValidatorTestDomain();
//            testDomain.setLocale(Locale.JAPANESE);
//
//            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
//            testDomain.setProperty1("2013/01/01");
//            validator.isPermittedDate("property1", "MinlengthTest2");
//            boolean valid = validator.isPermittedCharMinLen("property1", "MinlengthTest2");
//            assertTrue("check4 1", valid);
//            assertEquals("check4 2", 1, validator.getErrList().size());
//        }
        
        // 半角/全角スペース
        {
            ValidatorTestDomain testDomain = new ValidatorTestDomain();
            testDomain.setLocale(Locale.JAPANESE);
            
            // 半角スペース
            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1(" ");
            boolean valid = validator.isValidateProperty("property1", "MinlengthTest");
            assertFalse("check5 1", valid);
            assertEquals("check5 2", "GSCM-E0-0022", validator.getErrList().get(0).getKey());
            // 全角スペース
            validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("　");
            valid = validator.isValidateProperty("property1", "MinlengthTest");
            assertFalse("check5 3", valid);
            assertEquals("check5 4", "GSCM-E0-0022", validator.getErrList().get(0).getKey());
        }
    }
    
    /**
     * 最大桁数チェック
     * @throws ApplicationException 例外
     * @throws IOException 例外
     * @throws ValidatorException 例外
     * @throws SAXException 例外
     */
    @Test
    public void testMaxlength() throws ApplicationException, IOException, ValidatorException, SAXException {
        
        // チェックNG
        {
            ValidatorTestDomain testDomain = new ValidatorTestDomain();
            testDomain.setLocale(Locale.JAPANESE);

            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);

            testDomain.setProperty1("12345678901");
            boolean valid = validator.isValidateProperty("property1", "MaxlengthTest");
            assertFalse("check1 1", valid);
            MessageDomain messageDomain = validator.getErrList().get(0);
            Object[] params = messageDomain.getParams();
            assertNotNull("check1 2", messageDomain);
            assertEquals("check1 3", "GSCM-E0-0013", messageDomain.getKey());
            assertEquals("check1 4", "最大桁数", params[0]);
            assertEquals("check1 5", 10, params[1]);
            assertEquals("check1 6", "property1", messageDomain.getProperty());

            // バイト数ではなく文字数
            validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("あいうえおかきくけこさ");
            valid = validator.isValidateProperty("property1", "MaxlengthTest");
            assertFalse("check1 7", valid);
            messageDomain = validator.getErrList().get(0);
            params = messageDomain.getParams();
            assertNotNull("check1 8", messageDomain);
            assertEquals("check1 9", "GSCM-E0-0013", messageDomain.getKey());
            assertEquals("check1 10", "最大桁数", params[0]);
            assertEquals("check1 11", 10, params[1]);
            assertEquals("check1 12", "property1", messageDomain.getProperty());
        }
        
        // 禁則文字チェック
        // チェックNG
        {
            ValidatorTestDomain testDomain = new ValidatorTestDomain();
            testDomain.setLocale(Locale.JAPANESE);

            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
            
            // 禁則文字
            testDomain.setProperty1("a㈱a");
            boolean valid = validator.isPermittedCharMaxLen("property1", "MaxlengthTest");
            assertTrue("check6 1", valid);
            // 禁止文字のエラーではなく桁数エラーとなる
            assertEquals("check6 2", 0, validator.getErrList().size());
            

            // サロゲート文字
            String surro = null;
            for (char i = 55296; i < 65535; i++) {
                for (char j = 56320; j < 65535; j++) {
                    if (Character.isSurrogatePair(i, j)){
                        surro = String.valueOf(Character.toChars(Character.toCodePoint(i, j)));
                        break;
                    }
                }
                if (surro != null) {
                    break;
                }
            }
            validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("t" + surro + "t");
            valid = validator.isPermittedCharMaxLen("property1", "MaxlengthTest");
            assertTrue("check6 3", valid);
            // 禁止文字のエラーではなく桁数エラーとなる
            assertEquals("check6 4", 0, validator.getErrList().size());
        }
        
        // チェックOK
        {
            ValidatorTestDomain testDomain = new ValidatorTestDomain();
            testDomain.setLocale(Locale.JAPANESE);

            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);

            testDomain.setProperty1("1234567890");
            boolean valid = validator.isPermittedCharMaxLen("property1", "MaxlengthTest");
            assertTrue("check2 1", valid);
            assertEquals("check2 2", 0, validator.getErrList().size());

            // バイト数ではなく文字数
            validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("あいうえおかきくけこ");
            valid = validator.isValidateProperty("property1", "MaxlengthTest");
            assertTrue("check2 3", valid);
            assertEquals("check2 4", 0, validator.getErrList().size());
        }
        
        // 値Blank
        {
            ValidatorTestDomain testDomain = new ValidatorTestDomain();
            testDomain.setLocale(Locale.JAPANESE);

            // NULL
            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1(null);
            boolean valid = validator.isValidateProperty("property1", "MaxlengthTest3");
            assertTrue("check3 1", valid);
            assertEquals("check3 2", 0, validator.getErrList().size());
            // Blank
            validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("");
            valid = validator.isValidateProperty("property1", "MaxlengthTest3");
            assertTrue("check3 3", valid);
            assertEquals("check3 4", 0, validator.getErrList().size());
        }
        
        // 同一プロパティが既にエラー時
//        {
//            ValidatorTestDomain testDomain = new ValidatorTestDomain();
//            testDomain.setLocale(Locale.JAPANESE);
//
//            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
//            testDomain.setProperty1("2013/01/01");
//            validator.isPermittedDate("property1", "MaxlengthTest2");
//            boolean valid = validator.isPermittedCharMaxLen("property1", "MaxlengthTest2");
//            assertTrue("check4 1", valid);
//            assertEquals("check4 2", 1, validator.getErrList().size());
//        }
        
        // 半角/全角スペース
        {
            ValidatorTestDomain testDomain = new ValidatorTestDomain();
            testDomain.setLocale(Locale.JAPANESE);
            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
            
            // 半角スペース
            testDomain.setProperty1(" ");
            boolean valid = validator.isValidateProperty("property1", "MaxlengthTest3");
            assertFalse("check5 1", valid);
            assertEquals("check5 3", "GSCM-E0-0013", validator.getErrList().get(0).getKey());
            // 全角スペース
            validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("　");
            valid = validator.isValidateProperty("property1", "MaxlengthTest3");
            assertFalse("check5 3", valid);
            assertEquals("check5 4", "GSCM-E0-0013", validator.getErrList().get(0).getKey());
        }
    }
    
    /**
     * バイトチェック
     * @throws ApplicationException 例外
     * @throws IOException 例外
     * @throws ValidatorException 例外
     * @throws SAXException 例外
     */
    @Test
    public void testByte() throws ApplicationException, IOException, ValidatorException, SAXException {
        
        // チェックNG
        {
            ValidatorTestDomain testDomain = new ValidatorTestDomain();
            testDomain.setLocale(Locale.JAPANESE);

            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);

            testDomain.setProperty1("128");
            boolean valid = validator.isValidateProperty("property1", "ByteTest");
            assertFalse("check1 1", valid);
            MessageDomain messageDomain = validator.getErrList().get(0);
            Object[] params = messageDomain.getParams();
            assertNotNull("check1 2", messageDomain);
            assertEquals("check1 3", "GSCM-E0-0023", messageDomain.getKey());
            assertEquals("check1 4", "バイト", params[0]);
            assertEquals("check1 5", "property1", messageDomain.getProperty());

            validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("-129");
            valid = validator.isValidateProperty("property1", "ByteTest");
            assertFalse("check1 6", valid);
            messageDomain = validator.getErrList().get(0);
            params = messageDomain.getParams();
            assertNotNull("check1 7", messageDomain);
            assertEquals("check1 8", "GSCM-E0-0023", messageDomain.getKey());
            assertEquals("check1 9", "バイト", params[0]);
            assertEquals("check1 10", "property1", messageDomain.getProperty());
        }
        
        // チェックOK
        {
            ValidatorTestDomain testDomain = new ValidatorTestDomain();
            testDomain.setLocale(Locale.JAPANESE);

            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("127");
            boolean valid = validator.isPermittedByte("property1", "ByteTest");
            assertTrue("check2 1", valid);
            assertEquals("check2 2", 0, validator.getErrList().size());

            validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("-128");
            valid = validator.isValidateProperty("property1", "ByteTest");
            assertTrue("check2 3", valid);
            assertEquals("check2 4", 0, validator.getErrList().size());

            validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("-0");
            valid = validator.isValidateProperty("property1", "ByteTest");
            assertTrue("check2 5", valid);
            assertEquals("check2 6", 0, validator.getErrList().size());
        }
        
        // 値Blank
        {
            ValidatorTestDomain testDomain = new ValidatorTestDomain();
            testDomain.setLocale(Locale.JAPANESE);

            // NULL
            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1(null);
            boolean valid = validator.isValidateProperty("property1", "ByteTest");
            assertTrue("check3 1", valid);
            assertEquals("check3 2", 0, validator.getErrList().size());
            // Blank
            validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("");
            valid = validator.isValidateProperty("property1", "ByteTest");
            assertTrue("check3 4", valid);
            assertEquals("check3 5", 0, validator.getErrList().size());
        }
        
        // チェック対象外
        {
            ValidatorTestDomain testDomain = new ValidatorTestDomain();
            testDomain.setLocale(Locale.JAPANESE);

            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);

            testDomain.setProperty4("128");
            boolean valid = validator.isValidateProperty("property4", "ByteTest");
            assertTrue("check4 1", valid);
            assertEquals("check4 2", 0, validator.getErrList().size());
        }
        // 同一プロパティが既にエラー時
//        {
//            ValidatorTestDomain testDomain = new ValidatorTestDomain();
//            testDomain.setLocale(Locale.JAPANESE);
//
//            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
//            testDomain.setProperty1("123");
//            validator.isPermittedCharMinLen("property1", "ByteTest2");
//            boolean valid = validator.isPermittedByte("property1", "ByteTest2");
//            assertTrue("check5 1", valid);
//            assertEquals("check5 2", 1, validator.getErrList().size());
//        }
        
        // 半角/全角スペース
        {
            ValidatorTestDomain testDomain = new ValidatorTestDomain();
            testDomain.setLocale(Locale.JAPANESE);
            
            // 半角スペース
            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1(" ");
            boolean valid = validator.isValidateProperty("property1", "ByteTest");
            assertFalse("check6 1", valid);
            assertEquals("check6 2", "GSCM-E0-0023", validator.getErrList().get(0).getKey());
            // 全角スペース
            validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("　");
            valid = validator.isValidateProperty("property1", "ByteTest");
            assertFalse("check6 3", valid);
            assertEquals("check6 4", "GSCM-E0-0023", validator.getErrList().get(0).getKey());
        }
    }
    
    /**
     * Shortチェック
     * @throws ApplicationException 例外
     * @throws IOException 例外
     * @throws ValidatorException 例外
     * @throws SAXException 例外
     */
    @Test
    public void testShort() throws ApplicationException, IOException, ValidatorException, SAXException {
        
        // テストNG
        {
            ValidatorTestDomain testDomain = new ValidatorTestDomain();
            testDomain.setLocale(Locale.JAPANESE);

            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1(String.valueOf(Short.MAX_VALUE + 1));
            boolean valid = validator.isValidateProperty("property1", "ShortTest");
            assertFalse("check1 1", valid);
            MessageDomain messageDomain = validator.getErrList().get(0);
            assertNotNull("check1 2", messageDomain);
            Object[] params = messageDomain.getParams();
            assertEquals("check1 3", "GSCM-E0-0024", messageDomain.getKey());
            assertEquals("check1 4", "Short", params[0]);
            assertEquals("check1 5", "property1", messageDomain.getProperty());

            validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1(String.valueOf(Short.MIN_VALUE - 1));
            valid = validator.isValidateProperty("property1", "ShortTest");
            assertFalse("check1 6", valid);
            messageDomain = validator.getErrList().get(0);
            assertNotNull("check1 7", messageDomain);
            params = messageDomain.getParams();
            assertEquals("check1 8", "GSCM-E0-0024", messageDomain.getKey());
            assertEquals("check1 9", "Short", params[0]);
            assertEquals("check1 10", "property1", messageDomain.getProperty());

            validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("123,456");
            valid = validator.isValidateProperty("property1", "ShortTest");
            assertFalse("check1 11", valid);
            messageDomain = validator.getErrList().get(0);
            assertNotNull("check1 12", messageDomain);
            params = messageDomain.getParams();
            assertEquals("check1 13", "GSCM-E0-0024", messageDomain.getKey());
            assertEquals("check1 14", "Short", params[0]);
            assertEquals("check1 15", "property1", messageDomain.getProperty());
        }
        
        // テストOK
        {
            ValidatorTestDomain testDomain = new ValidatorTestDomain();
            testDomain.setLocale(Locale.JAPANESE);

            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1(String.valueOf(Short.MAX_VALUE));
            boolean valid = validator.isPermittedShort("property1", "ShortTest");
            assertTrue("check2 1", valid);
            assertEquals("check2 2", 0, validator.getErrList().size());

            validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1(String.valueOf(Short.MIN_VALUE));
            valid = validator.isValidateProperty("property1", "ShortTest");
            assertTrue("check2 31", valid);
            assertEquals("check2 4", 0, validator.getErrList().size());
        }
        
        // 値Blank
        {
            ValidatorTestDomain testDomain = new ValidatorTestDomain();
            testDomain.setLocale(Locale.JAPANESE);

            // NULL
            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1(null);
            boolean valid = validator.isValidateProperty("property1", "ShortTest");
            assertTrue("check3 1", valid);
            assertEquals("check3 2", 0, validator.getErrList().size());
            // Blank
            validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("");
            valid = validator.isValidateProperty("property1", "ShortTest");
            assertTrue("check3 4", valid);
            assertEquals("check3 5", 0, validator.getErrList().size());
        }
        
        // チェック対象外
        {
            ValidatorTestDomain testDomain = new ValidatorTestDomain();
            testDomain.setLocale(Locale.JAPANESE);

            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty3(String.valueOf(Short.MAX_VALUE + 1));
            boolean valid = validator.isValidateProperty("property3", "ShortTest");
            assertTrue("check4 1", valid);
            assertEquals("check4 2", 0, validator.getErrList().size());
        }
        // 同一プロパティが既にエラー時
//        {
//            ValidatorTestDomain testDomain = new ValidatorTestDomain();
//            testDomain.setLocale(Locale.JAPANESE);
//
//            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
//            testDomain.setProperty1("123");
//            validator.isPermittedCharMinLen("property1", "ShortTest2");
//            boolean valid = validator.isPermittedShort("property1", "ShortTest2");
//            assertTrue("check5 1", valid);
//            assertEquals("check5 2", 1, validator.getErrList().size());
//        }
        
        // 半角/全角スペース
        {
            ValidatorTestDomain testDomain = new ValidatorTestDomain();
            testDomain.setLocale(Locale.JAPANESE);
            
            // 半角スペース
            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1(" ");
            boolean valid = validator.isValidateProperty("property1", "ShortTest");
            assertFalse("check6 1", valid);
            assertEquals("check6 2", "GSCM-E0-0024", validator.getErrList().get(0).getKey());
            // 全角スペース
            validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("　");
            valid = validator.isValidateProperty("property1", "ShortTest");
            assertFalse("check6 3", valid);
            assertEquals("check6 4", "GSCM-E0-0024", validator.getErrList().get(0).getKey());
        }
    }
    
    /**
     * Integerチェック
     * @throws ApplicationException 例外
     * @throws IOException 例外
     * @throws ValidatorException 例外
     * @throws SAXException 例外
     */
    @Test
    public void testInteger() throws ApplicationException, IOException, ValidatorException, SAXException {
        
        // チェックNG
        {
            ValidatorTestDomain testDomain = new ValidatorTestDomain();
            testDomain.setLocale(Locale.JAPANESE);

            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1(String.valueOf((long)Integer.MAX_VALUE + 1));
            boolean valid = validator.isValidateProperty("property1", "IntegerTest");
            assertFalse("check 1", valid);
            MessageDomain messageDomain = validator.getErrList().get(0);
            assertNotNull("check 2", messageDomain);
            Object[] params = messageDomain.getParams();
            assertEquals("check 3", "GSCM-E0-0024", messageDomain.getKey());
            assertEquals("check 4", "Integer", params[0]);
            assertEquals("check 5", "property1", messageDomain.getProperty());

            validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1(String.valueOf((long)Integer.MIN_VALUE - 1));
            valid = validator.isValidateProperty("property1", "IntegerTest");
            assertFalse("check 1", valid);
            messageDomain = validator.getErrList().get(0);
            assertNotNull("check 2", messageDomain);
            params = messageDomain.getParams();
            assertEquals("check 3", "GSCM-E0-0024", messageDomain.getKey());
            assertEquals("check 4", "Integer", params[0]);
            assertEquals("check 5", "property1", messageDomain.getProperty());

            validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("123,456");
            valid = validator.isValidateProperty("property1", "IntegerTest");
            assertFalse("check 1", valid);
            messageDomain = validator.getErrList().get(0);
            assertNotNull("check 2", messageDomain);
            params = messageDomain.getParams();
            assertEquals("check 3", "GSCM-E0-0024", messageDomain.getKey());
            assertEquals("check 4", "Integer", params[0]);
            assertEquals("check 5", "property1", messageDomain.getProperty());
        }
        
        // チェックOK
        {
            ValidatorTestDomain testDomain = new ValidatorTestDomain();
            testDomain.setLocale(Locale.JAPANESE);

            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1(String.valueOf(Integer.MAX_VALUE));
            boolean valid = validator.isPermittedInteger("property1", "IntegerTest");
            assertTrue("check 1", valid);
            assertEquals("check4 2", 0, validator.getErrList().size());

            validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1(String.valueOf(Integer.MIN_VALUE));
            valid = validator.isValidateProperty("property1", "IntegerTest");
            assertTrue("check 1", valid);
            assertEquals("check4 2", 0, validator.getErrList().size());
        }
        
        // 値Blank
        {
            ValidatorTestDomain testDomain = new ValidatorTestDomain();
            testDomain.setLocale(Locale.JAPANESE);

            // NULL
            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1(null);
            boolean valid = validator.isValidateProperty("property1", "IntegerTest");
            assertTrue("check3 1", valid);
            assertEquals("check3 2", 0, validator.getErrList().size());
            // Blank
            validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("");
            valid = validator.isValidateProperty("property1", "IntegerTest");
            assertTrue("check3 3", valid);
            assertEquals("check3 4", 0, validator.getErrList().size());
        }
        
        // チェック対象外
        {
            ValidatorTestDomain testDomain = new ValidatorTestDomain();
            testDomain.setLocale(Locale.JAPANESE);

            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty3(String.valueOf((long)Integer.MIN_VALUE - 1));
            boolean valid = validator.isValidateProperty("property3", "IntegerTest");
            assertTrue("check 1", valid);
            assertEquals("check4 2", 0, validator.getErrList().size());
        }
        // 同一プロパティが既にエラー時
//        {
//            ValidatorTestDomain testDomain = new ValidatorTestDomain();
//            testDomain.setLocale(Locale.JAPANESE);
//
//            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
//            testDomain.setProperty1("123");
//            validator.isPermittedCharMinLen("property1", "IntegerTest2");
//            boolean valid = validator.isPermittedInteger("property1", "IntegerTest2");
//            assertTrue("check5 1", valid);
//            assertEquals("check5 2", 1, validator.getErrList().size());
//        }
        
        // 半角/全角スペース
        {
            ValidatorTestDomain testDomain = new ValidatorTestDomain();
            testDomain.setLocale(Locale.JAPANESE);
            
            // 半角スペース
            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1(" ");
            boolean valid = validator.isValidateProperty("property1", "IntegerTest");
            assertFalse("check6 1", valid);
            assertEquals("check6 2", "GSCM-E0-0024", validator.getErrList().get(0).getKey());
            // 全角スペース
            validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("　");
            valid = validator.isValidateProperty("property1", "IntegerTest");
            assertFalse("check6 3", valid);
            assertEquals("check6 4", "GSCM-E0-0024", validator.getErrList().get(0).getKey());
        }
    }
    
    /**
     * Longチェック
     * @throws ApplicationException 例外
     * @throws IOException 例外
     * @throws ValidatorException 例外
     * @throws SAXException 例外
     */
    @Test
    public void testLong() throws ApplicationException, IOException, ValidatorException, SAXException {
        
        // チェックNG
        {
            ValidatorTestDomain testDomain = new ValidatorTestDomain();
            testDomain.setLocale(Locale.JAPANESE);

            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1(new BigDecimal(Long.MAX_VALUE).add(new BigDecimal(1)).toPlainString());
            boolean valid = validator.isValidateProperty("property1", "LongTest");
            assertFalse("check1 1", valid);
            MessageDomain messageDomain = validator.getErrList().get(0);
            assertNotNull("check1 2", messageDomain);
            Object[] params = messageDomain.getParams();
            assertEquals("check1 3", "GSCM-E0-0024", messageDomain.getKey());
            assertEquals("check1 4", "Long", params[0]);
            assertEquals("check1 5", "property1", messageDomain.getProperty());

            validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1(new BigDecimal(Long.MIN_VALUE).add(new BigDecimal(-1)).toPlainString());
            valid = validator.isValidateProperty("property1", "LongTest");
            assertFalse("check1 6", valid);
            messageDomain = validator.getErrList().get(0);
            assertNotNull("check1 7", messageDomain);
            params = messageDomain.getParams();
            assertEquals("check1 8", "GSCM-E0-0024", messageDomain.getKey());
            assertEquals("check1 9", "Long", params[0]);
            assertEquals("check1 10", "property1", messageDomain.getProperty());

            validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("123,456");
            valid = validator.isValidateProperty("property1", "LongTest");
            assertFalse("check1 11", valid);
            messageDomain = validator.getErrList().get(0);
            assertNotNull("check1 12", messageDomain);
            params = messageDomain.getParams();
            assertEquals("check1 13", "GSCM-E0-0024", messageDomain.getKey());
            assertEquals("check1 14", "Long", params[0]);
            assertEquals("check1 15", "property1", messageDomain.getProperty());
        }
        
        // チェックOK
        {
            ValidatorTestDomain testDomain = new ValidatorTestDomain();
            testDomain.setLocale(Locale.JAPANESE);

            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1(new BigDecimal(Long.MAX_VALUE).add(new BigDecimal(0)).toPlainString());
            boolean valid = validator.isPermittedLong("property1", "LongTest");
            assertTrue("check2 1", valid);
            assertEquals("check2 2", 0, validator.getErrList().size());

            validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1(new BigDecimal(Long.MIN_VALUE).add(new BigDecimal(0)).toPlainString());
            valid = validator.isValidateProperty("property1", "LongTest");
            assertTrue("check2 3", valid);
            assertEquals("check2 4", 0, validator.getErrList().size());

            validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("123456");
            valid = validator.isValidateProperty("property1", "LongTest");
            assertTrue("check2 5", valid);
            assertEquals("check2 6", 0, validator.getErrList().size());
        }
        
        // 値Blank
        {
            ValidatorTestDomain testDomain = new ValidatorTestDomain();
            testDomain.setLocale(Locale.JAPANESE);

            // NULL
            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1(null);
            boolean valid = validator.isValidateProperty("property1", "LongTest");
            assertTrue("check3 1", valid);
            assertEquals("check3 2", 0, validator.getErrList().size());
            // Blank
            validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("");
            valid = validator.isValidateProperty("property1", "LongTest");
            assertTrue("check3 3", valid);
            assertEquals("check3 4", 0, validator.getErrList().size());
        }
        
        // チェック対象外
        {
            ValidatorTestDomain testDomain = new ValidatorTestDomain();
            testDomain.setLocale(Locale.JAPANESE);

            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty2(new BigDecimal(Long.MAX_VALUE).add(new BigDecimal(1)).toPlainString());
            boolean valid = validator.isValidateProperty("property2", "LongTest");
            assertTrue("check4 1", valid);
            assertEquals("check4 2", 0, validator.getErrList().size());
        }
        // 同一プロパティが既にエラー時
//        {
//            ValidatorTestDomain testDomain = new ValidatorTestDomain();
//            testDomain.setLocale(Locale.JAPANESE);
//
//            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
//            testDomain.setProperty1("123");
//            validator.isPermittedCharMinLen("property1", "LongTest2");
//            boolean valid = validator.isPermittedLong("property1", "LongTest2");
//            assertTrue("check5 1", valid);
//            assertEquals("check5 2", 1, validator.getErrList().size());
//        }
        
        // 半角/全角スペース
        {
            ValidatorTestDomain testDomain = new ValidatorTestDomain();
            testDomain.setLocale(Locale.JAPANESE);
            
            // 半角スペース
            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1(" ");
            boolean valid = validator.isValidateProperty("property1", "LongTest");
            assertFalse("check6 1", valid);
            assertEquals("check6 2", "GSCM-E0-0024", validator.getErrList().get(0).getKey());
            // 全角スペース
            validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("　");
            valid = validator.isValidateProperty("property1", "LongTest");
            assertFalse("check6 3", valid);
            assertEquals("check6 4", "GSCM-E0-0024", validator.getErrList().get(0).getKey());
        }
    }
    
    /**
     * Floatチェック
     * @throws ApplicationException 例外
     * @throws IOException 例外
     * @throws ValidatorException 例外
     * @throws SAXException 例外
     */
    @Test
    public void testFloat() throws ApplicationException, IOException, ValidatorException, SAXException {
        
        // チェックNG
        {
            ValidatorTestDomain testDomain = new ValidatorTestDomain();
            testDomain.setLocale(Locale.JAPANESE);

            // FloatはオーバーフローしてもFoatの上限できってしまうみたい
            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("a");
            boolean valid = validator.isValidateProperty("property1", "FloatTest");
            assertFalse("check1 1", valid);
            MessageDomain messageDomain = validator.getErrList().get(0);
            assertNotNull("check1 2", messageDomain);
            Object[] params = messageDomain.getParams();
            assertEquals("check1 3", "GSCM-E0-0025", messageDomain.getKey());
            assertEquals("check1 4", "Float", params[0]);
            assertEquals("check1 5", "property1", messageDomain.getProperty());
        }
        
        // チェックOK
        {
            ValidatorTestDomain testDomain = new ValidatorTestDomain();
            testDomain.setLocale(Locale.JAPANESE);

            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1(String.valueOf(Float.MAX_VALUE));
            boolean valid = validator.isPermittedFloat("property1", "FloatTest");
            assertTrue("check2 1", valid);
            assertEquals("check2 2", 0, validator.getErrList().size());

            validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1(String.valueOf(Float.MIN_VALUE));
            valid = validator.isValidateProperty("property1", "FloatTest");
            assertTrue("check2 3", valid);
            assertEquals("check2 4", 0, validator.getErrList().size());
        }
        
        // 値Blank
        {
            ValidatorTestDomain testDomain = new ValidatorTestDomain();
            testDomain.setLocale(Locale.JAPANESE);

            // NULL
            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1(null);
            boolean valid = validator.isValidateProperty("property1", "FloatTest");
            assertTrue("check3 1", valid);
            assertEquals("check3 2", 0, validator.getErrList().size());
            // Blank
            validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("");
            valid = validator.isValidateProperty("property1", "FloatTest");
            assertTrue("check3 3", valid);
            assertEquals("check3 4", 0, validator.getErrList().size());
        }
        
        // チェック対象外
        {
            ValidatorTestDomain testDomain = new ValidatorTestDomain();
            testDomain.setLocale(Locale.JAPANESE);

            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty2("a");
            boolean valid = validator.isValidateProperty("property2", "FloatTest");
            assertTrue("check4 1", valid);
            assertEquals("check4 2", 0, validator.getErrList().size());
        }
        // 同一プロパティが既にエラー時
//        {
//            ValidatorTestDomain testDomain = new ValidatorTestDomain();
//            testDomain.setLocale(Locale.JAPANESE);
//
//            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
//            testDomain.setProperty1("123");
//            validator.isPermittedCharMinLen("property1", "FloatTest2");
//            boolean valid = validator.isPermittedFloat("property1", "FloatTest2");
//            assertTrue("check5 1", valid);
//            assertEquals("check5 2", 1, validator.getErrList().size());
//        }
        
        // 半角/全角スペース
        {
            ValidatorTestDomain testDomain = new ValidatorTestDomain();
            testDomain.setLocale(Locale.JAPANESE);
            
            // 半角スペース
            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1(" ");
            boolean valid = validator.isValidateProperty("property1", "FloatTest");
            assertFalse("check6 1", valid);
            assertEquals("check6 2", "GSCM-E0-0025", validator.getErrList().get(0).getKey());
            // 全角スペース
            validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("　");
            valid = validator.isValidateProperty("property1", "FloatTest");
            assertFalse("check6 3", valid);
            assertEquals("check6 4", "GSCM-E0-0025", validator.getErrList().get(0).getKey());
        }
    }
    
    
    /**
     * Doubleチェック
     * @throws ApplicationException 例外
     * @throws IOException 例外
     * @throws ValidatorException 例外
     * @throws SAXException 例外
     */
    @Test
    public void testDouble() throws ApplicationException, IOException, ValidatorException, SAXException {
        
        // チェックNG
        {
            ValidatorTestDomain testDomain = new ValidatorTestDomain();
            testDomain.setLocale(Locale.JAPANESE);

            // DoubleはオーバーフローしてもDoubleの上限できってしまうみたい
            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("a");
            boolean valid = validator.isValidateProperty("property1", "DoubleTest");
            assertFalse("check1 1", valid);
            MessageDomain messageDomain = validator.getErrList().get(0);
            assertNotNull("check1 2", messageDomain);
            Object[] params = messageDomain.getParams();
            assertEquals("check1 3", "GSCM-E0-0025", messageDomain.getKey());
            assertEquals("check1 4", "Double", params[0]);
            assertEquals("check1 5", "property1", messageDomain.getProperty());
        }
        
        // チェックOK
        {
            ValidatorTestDomain testDomain = new ValidatorTestDomain();
            testDomain.setLocale(Locale.JAPANESE);

            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1(String.valueOf(Double.MAX_VALUE));
            boolean valid = validator.isPermittedDouble("property1", "DoubleTest");
            assertTrue("check2 1", valid);
            assertEquals("check2 2", 0, validator.getErrList().size());
        }
        
        // 値Blank
        {
            ValidatorTestDomain testDomain = new ValidatorTestDomain();
            testDomain.setLocale(Locale.JAPANESE);

            // NULL
            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1(null);
            boolean valid = validator.isValidateProperty("property1", "DoubleTest");
            assertTrue("check3 1", valid);
            assertEquals("check3 2", 0, validator.getErrList().size());
            // Blank
            validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("");
            valid = validator.isValidateProperty("property1", "DoubleTest");
            assertTrue("check3 3", valid);
            assertEquals("check3 4", 0, validator.getErrList().size());
        }
        
        // チェック対象外
        {
            ValidatorTestDomain testDomain = new ValidatorTestDomain();
            testDomain.setLocale(Locale.JAPANESE);

            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty2("a");
            boolean valid = validator.isValidateProperty("property2", "DoubleTest");
            assertTrue("check4 1", valid);
            assertEquals("check4 2", 0, validator.getErrList().size());
        }
        // 同一プロパティが既にエラー時
//        {
//            ValidatorTestDomain testDomain = new ValidatorTestDomain();
//            testDomain.setLocale(Locale.JAPANESE);
//
//            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
//            testDomain.setProperty1("123");
//            validator.isPermittedCharMinLen("property1", "DoubleTest2");
//            boolean valid = validator.isPermittedDouble("property1", "DoubleTest2");
//            assertTrue("check5 1", valid);
//            assertEquals("check5 2", 1, validator.getErrList().size());
//        }
        
        // 半角/全角スペース
        {
            ValidatorTestDomain testDomain = new ValidatorTestDomain();
            testDomain.setLocale(Locale.JAPANESE);
            
            // 半角スペース
            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1(" ");
            boolean valid = validator.isValidateProperty("property1", "DoubleTest");
            assertFalse("check6 1", valid);
            assertEquals("check6 2", "GSCM-E0-0025", validator.getErrList().get(0).getKey());
            // 全角スペース
            validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("　");
            valid = validator.isValidateProperty("property1", "DoubleTest");
            assertFalse("check6 3", valid);
            assertEquals("check6 4", "GSCM-E0-0025", validator.getErrList().get(0).getKey());
        }
    }
    
    /**
     * BigDecimalチェック
     * @throws ApplicationException 例外
     * @throws IOException 例外
     * @throws ValidatorException 例外
     * @throws SAXException 例外
     */
    @Test
    public void testBigDecimal() throws ApplicationException, IOException, ValidatorException, SAXException {
        
        // チェック対象外
        {
            ValidatorTestDomain testDomain = new ValidatorTestDomain();
            testDomain.setLocale(Locale.JAPANESE);

            //TM_RESOUCESに指定なし
            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("a");
            boolean valid = validator.isValidateProperty("property1", "BigDecTestOff");
            assertTrue("check1 1", valid);
            assertEquals("check1 2", 0, validator.getErrList().size());

            //TM_RESOUCESにfalse指定
            validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty2("a");
            valid = validator.isValidateProperty("property2", "BigDecTestOff");
            assertTrue("check2 1", valid);
            assertEquals("check2 2", 0, validator.getErrList().size());
        }

        // チェックOK
        {
            ValidatorTestDomain testDomain = new ValidatorTestDomain();
            testDomain.setLocale(Locale.JAPANESE);

            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("12345678901234567890.01234567890");
            boolean valid = validator.isPermittedBigDecimal("property1", "BigDecTestOn");
            assertTrue("check3 1", valid);
            assertEquals("check3 2", 0, validator.getErrList().size());
        }
        
        // 値Blank
        {
            ValidatorTestDomain testDomain = new ValidatorTestDomain();
            testDomain.setLocale(Locale.JAPANESE);

            // Blank
            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("");
            boolean valid = validator.isValidateProperty("property1", "BigDecTestOn");
            assertTrue("check4 1", valid);
            assertEquals("check4 2", 0, validator.getErrList().size());
            // NULL
            validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1(null);
            valid = validator.isValidateProperty("property1", "BigDecTestOn");
            assertTrue("check5 1", valid);
            assertEquals("check5 2", 0, validator.getErrList().size());
        }
        
        // チェックNG
        {
            ValidatorTestDomain testDomain = new ValidatorTestDomain();
            testDomain.setLocale(Locale.JAPANESE);

            // 数値以外
            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("123,456.0001");
            boolean valid = validator.isValidateProperty("property1", "BigDecTestOn");
            assertFalse("check6 1", valid);
            MessageDomain messageDomain = validator.getErrList().get(0);
            assertNotNull("check6 2", messageDomain);
            Object[] params = messageDomain.getParams();
            assertEquals("check6 3", "GSCM-E0-0025", messageDomain.getKey());
            assertEquals("check6 4", "BigDecimal", params[0]);
            assertEquals("check6 5", "property1", messageDomain.getProperty());

            // TM_RESOUCESの設定が他のRESOURCE_キーを参照（ref）
            validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("a");
            valid = validator.isValidateProperty("property1", "BigDecTestRef");
            assertFalse("check7 1", valid);
            assertEquals("check7 3", "GSCM-E0-0025", messageDomain.getKey());
        }
        
        // 半角/全角スペース
        {
            ValidatorTestDomain testDomain = new ValidatorTestDomain();
            testDomain.setLocale(Locale.JAPANESE);
            
            // 半角スペース
            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1(" ");
            boolean valid = validator.isValidateProperty("property1", "BigDecTestOn");
            assertFalse("check8 1", valid);
            assertEquals("check8 2", "GSCM-E0-0025", validator.getErrList().get(0).getKey());
            // 全角スペース
            validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("　");
            valid = validator.isValidateProperty("property1", "BigDecTestOn");
            assertFalse("check9 1", valid);
            assertEquals("check9 2", "GSCM-E0-0025", validator.getErrList().get(0).getKey());
        }
    }
    
    /**
     * ShortRangeチェック
     * @throws ApplicationException 例外
     * @throws IOException 例外
     * @throws ValidatorException 例外
     * @throws SAXException 例外
     */
    @Test
    public void testShortRange() throws ApplicationException, IOException, ValidatorException, SAXException {
        
        // チェックNG
        {
            ValidatorTestDomain testDomain = new ValidatorTestDomain();
            testDomain.setLocale(Locale.JAPANESE);

            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("-11");
            boolean valid = validator.isValidateProperty("property1", "ShortRangeTest");
            assertFalse("check1 1", valid);
            MessageDomain messageDomain = validator.getErrList().get(0);
            assertNotNull("check1 2", messageDomain);
            Object[] params = messageDomain.getParams();
            assertEquals("check1 3", "GSCM-E0-0026", messageDomain.getKey());
            assertEquals("check1 4", "ShortRange", params[0]);
            assertEquals("check1 5", (short)-10, params[1]);
            assertEquals("check1 6", (short)100, params[2]);
            assertEquals("check1 7", "property1", messageDomain.getProperty());

            validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("101");
            valid = validator.isValidateProperty("property1", "ShortRangeTest");
            assertFalse("check1 8", valid);
            messageDomain = validator.getErrList().get(0);
            assertNotNull("check1 9", messageDomain);
            params = messageDomain.getParams();
            assertEquals("check1 10", "GSCM-E0-0026", messageDomain.getKey());
            assertEquals("check1 11", "ShortRange", params[0]);
            assertEquals("check1 12", (short)-10, params[1]);
            assertEquals("check1 13", (short)100, params[2]);
            assertEquals("check1 14", "property1", messageDomain.getProperty());

            // 不正な値
            testDomain.setProperty2("100");
            try {
                validator = new Validator<ValidatorTestDomain>(testDomain);
                validator.isValidateProperty("property2", "ShortRangeTest");
                fail("ArrayIndexOutOfBoundsException 1");
            } catch (ArrayIndexOutOfBoundsException e) {
                assertNotNull("ArrayIndexOutOfBoundsException 2", e);
            }

            // 不正な値
            testDomain.setProperty3("100");
            try {
                validator = new Validator<ValidatorTestDomain>(testDomain);
                validator.isValidateProperty("property3", "ShortRangeTest");
                fail("ArrayIndexOutOfBoundsException 1");
            } catch (ArrayIndexOutOfBoundsException e) {
                assertNotNull("ArrayIndexOutOfBoundsException 2", e);
            }

            // 不正な値
            testDomain.setProperty3("100");
            try {
                validator = new Validator<ValidatorTestDomain>(testDomain);
                validator.isValidateProperty("property3", "ShortRangeTest");
                fail("ArrayIndexOutOfBoundsException 1");
            } catch (ArrayIndexOutOfBoundsException e) {
                assertNotNull("ArrayIndexOutOfBoundsException 2", e);
            }

            // 不正な値
            testDomain.setProperty4("100");
            try {
                validator = new Validator<ValidatorTestDomain>(testDomain);
                validator.isValidateProperty("property4", "ShortRangeTest");
                fail("ArrayIndexOutOfBoundsException 1");
            } catch (ArrayIndexOutOfBoundsException e) {
                assertNotNull("ArrayIndexOutOfBoundsException 2", e);
            }

            // 不正な値
            testDomain.setProperty5("100");
            try {
                validator = new Validator<ValidatorTestDomain>(testDomain);
                validator.isValidateProperty("property5", "ShortRangeTest");
                fail("NumberFormatException 1");
            } catch (NumberFormatException e) {
                assertNotNull("NumberFormatException 2", e);
            }

            // 不正な値
            testDomain.setProperty1("a");
            try {
                validator = new Validator<ValidatorTestDomain>(testDomain);
                validator.isValidateProperty("property1", "ShortRangeTest");
                fail("NumberFormatException 1");
            } catch (NumberFormatException e) {
                assertNotNull("NumberFormatException 2", e);
            }
        }
        
        // チェックOK
        {
            ValidatorTestDomain testDomain = new ValidatorTestDomain();
            testDomain.setLocale(Locale.JAPANESE);

            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("-10");
            boolean valid = validator.isPermittedShortRange("property1", "ShortRangeTest");
            assertTrue("check2 1", valid);
            assertEquals("check2 2", 0, validator.getErrList().size());

            testDomain.setProperty1("100");
            valid = validator.isValidateProperty("property1", "ShortRangeTest");
            assertTrue("check2 3", valid);
            assertEquals("check2 4", 0, validator.getErrList().size());

            testDomain.setProperty1("0");
            valid = validator.isValidateProperty("property1", "ShortRangeTest");
            assertTrue("check2 5", valid);
            assertEquals("check2 6", 0, validator.getErrList().size());
        }
        
        // 値Blank
        {
            ValidatorTestDomain testDomain = new ValidatorTestDomain();
            testDomain.setLocale(Locale.JAPANESE);

            // NULL
            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1(null);
            boolean valid = validator.isValidateProperty("property1", "ShortRangeTest");
            assertTrue("check3 1", valid);
            assertEquals("check3 2", 0, validator.getErrList().size());
            // Blank
            validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("");
            valid = validator.isValidateProperty("property1", "ShortRangeTest");
            assertTrue("check3 3", valid);
            assertEquals("check3 4", 0, validator.getErrList().size());
        }
        // 同一プロパティが既にエラー時
//        {
//            ValidatorTestDomain testDomain = new ValidatorTestDomain();
//            testDomain.setLocale(Locale.JAPANESE);
//
//            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
//            testDomain.setProperty1("123");
//            validator.isPermittedCharMinLen("property1", "ShortRangeTest2");
//            boolean valid = validator.isPermittedShortRange("property1", "ShortRangeTest2");
//            assertTrue("check4 1", valid);
//            assertEquals("check4 2", 1, validator.getErrList().size());
//        }
        
        // 半角/全角スペース
        {
            ValidatorTestDomain testDomain = new ValidatorTestDomain();
            testDomain.setLocale(Locale.JAPANESE);
            
            // 半角スペース
            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1(" ");
            try {
                validator.isValidateProperty("property1", "ShortRangeTest");
                fail("check5 1");
            } catch (NumberFormatException e) {
                assertNotNull("check5 2", e);
            }
            // 全角スペース
            validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("　");
            try {
                validator.isValidateProperty("property1", "ShortRangeTest");
                fail("check5 3");
            } catch (NumberFormatException e) {
                assertNotNull("check5 4", e);
            }
        }
    }
    
    /**
     * IntRangeチェック
     * @throws ApplicationException 例外
     * @throws IOException 例外
     * @throws ValidatorException 例外
     * @throws SAXException 例外
     */
    @Test
    public void testIntRange() throws ApplicationException, IOException, ValidatorException, SAXException {
        
        // チェックNG
        {
            ValidatorTestDomain testDomain = new ValidatorTestDomain();
            testDomain.setLocale(Locale.JAPANESE);

            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("-11");
            boolean valid = validator.isValidateProperty("property1", "IntRangeTest");
            assertFalse("check1 1", valid);
            MessageDomain messageDomain = validator.getErrList().get(0);
            assertNotNull("check1 2", messageDomain);
            Object[] params = messageDomain.getParams();
            assertEquals("check1 3", "GSCM-E0-0026", messageDomain.getKey());
            assertEquals("check1 4", "IntRange", params[0]);
            assertEquals("check1 5", -10, params[1]);
            assertEquals("check1 6", 100, params[2]);
            assertEquals("check1 7", "property1", messageDomain.getProperty());

            validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("101");
            valid = validator.isValidateProperty("property1", "IntRangeTest");
            assertFalse("check1 8", valid);
            messageDomain = validator.getErrList().get(0);
            assertNotNull("check1 9", messageDomain);
            params = messageDomain.getParams();
            assertEquals("check1 10", "GSCM-E0-0026", messageDomain.getKey());
            assertEquals("check1 11", "IntRange", params[0]);
            assertEquals("check1 12", -10, params[1]);
            assertEquals("check1 13", 100, params[2]);
            assertEquals("check1 14", "property1", messageDomain.getProperty());

            // 不正な値
            testDomain.setProperty2("100");
            try {
                validator = new Validator<ValidatorTestDomain>(testDomain);
                validator.isValidateProperty("property2", "IntRangeTest");
                fail("ArrayIndexOutOfBoundsException 1");
            } catch (ArrayIndexOutOfBoundsException e) {
                assertNotNull("ArrayIndexOutOfBoundsException 2", e);
            }

            // 不正な値
            testDomain.setProperty3("100");
            try {
                validator = new Validator<ValidatorTestDomain>(testDomain);
                validator.isValidateProperty("property3", "IntRangeTest");
                fail("ArrayIndexOutOfBoundsException 1");
            } catch (ArrayIndexOutOfBoundsException e) {
                assertNotNull("ArrayIndexOutOfBoundsException 2", e);
            }

            // 不正な値
            testDomain.setProperty4("100");
            try {
                validator = new Validator<ValidatorTestDomain>(testDomain);
                validator.isValidateProperty("property4", "IntRangeTest");
                fail("ArrayIndexOutOfBoundsException 1");
            } catch (ArrayIndexOutOfBoundsException e) {
                assertNotNull("ArrayIndexOutOfBoundsException 2", e);
            }

            // 不正な値
            testDomain.setProperty5("100");
            try {
                validator = new Validator<ValidatorTestDomain>(testDomain);
                validator.isValidateProperty("property5", "IntRangeTest");
                fail("NumberFormatException 1");
            } catch (NumberFormatException e) {
                assertNotNull("NumberFormatException 2", e);
            }

            // 不正な値
            testDomain.setProperty1("a");
            try {
                validator = new Validator<ValidatorTestDomain>(testDomain);
                validator.isValidateProperty("property1", "IntRangeTest");
                fail("NumberFormatException 1");
            } catch (NumberFormatException e) {
                assertNotNull("NumberFormatException 2", e);
            }
        }
        
        // チェックOK
        {        
            ValidatorTestDomain testDomain = new ValidatorTestDomain();
            testDomain.setLocale(Locale.JAPANESE);

            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("-10");
            boolean valid = validator.isPermittedIntRange("property1", "IntRangeTest");
            assertTrue("check2 1", valid);
            assertEquals("check2 2", 0, validator.getErrList().size());

            validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("100");
            valid = validator.isValidateProperty("property1", "IntRangeTest");
            assertTrue("check2 3", valid);
            assertEquals("check2 4", 0, validator.getErrList().size());

            validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("0");
            valid = validator.isValidateProperty("property1", "IntRangeTest");
            assertTrue("check2 5", valid);
            assertEquals("check2 6", 0, validator.getErrList().size());

        }
        
        // 値Blank
        {
            ValidatorTestDomain testDomain = new ValidatorTestDomain();
            testDomain.setLocale(Locale.JAPANESE);

            // NULL
            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1(null);
            boolean valid = validator.isValidateProperty("property1", "IntRangeTest");
            assertTrue("check3 1", valid);
            assertEquals("check3 2", 0, validator.getErrList().size());
            // Blank
            validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("");
            valid = validator.isValidateProperty("property1", "IntRangeTest");
            assertTrue("check3 3", valid);
            assertEquals("check3 4", 0, validator.getErrList().size());
        }
        // 同一プロパティが既にエラー時
//        {
//            ValidatorTestDomain testDomain = new ValidatorTestDomain();
//            testDomain.setLocale(Locale.JAPANESE);
//
//            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
//            testDomain.setProperty1("123");
//            validator.isPermittedCharMinLen("property1", "IntRangeTest2");
//            boolean valid = validator.isPermittedIntRange("property1", "IntRangeTest2");
//            assertTrue("check4 1", valid);
//            assertEquals("check4 2", 1, validator.getErrList().size());
//        }
        
        // 半角/全角スペース
        {
            ValidatorTestDomain testDomain = new ValidatorTestDomain();
            testDomain.setLocale(Locale.JAPANESE);
            
            // 半角スペース
            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1(" ");
            try {
                validator.isValidateProperty("property1", "IntRangeTest");
                fail("check5 1");
            } catch (NumberFormatException e) {
                assertNotNull("check5 2", e);
            }
            // 全角スペース
            validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("　");
            try {
                validator.isValidateProperty("property1", "IntRangeTest");
                fail("check5 3");
            } catch (NumberFormatException e) {
                assertNotNull("check5 4", e);
            }
        }
    }
    
    /**
     * LongRangeチェック
     * @throws ApplicationException 例外
     * @throws IOException 例外
     * @throws ValidatorException 例外
     * @throws SAXException 例外
     */
    @Test
    public void testLongRange() throws ApplicationException, IOException, ValidatorException, SAXException {
        
        // チェックNG
        {
            ValidatorTestDomain testDomain = new ValidatorTestDomain();
            testDomain.setLocale(Locale.JAPANESE);

            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("-11");
            boolean valid = validator.isValidateProperty("property1", "LongRangeTest");
            assertFalse("check1 1", valid);
            MessageDomain messageDomain = validator.getErrList().get(0);
            assertNotNull("check1 2", messageDomain);
            Object[] params = messageDomain.getParams();
            assertEquals("check1 3", "GSCM-E0-0026", messageDomain.getKey());
            assertEquals("check1 4", "LongRange", params[0]);
            assertEquals("check1 5", -10L, params[1]);
            assertEquals("check1 6", 100L, params[2]);
            assertEquals("check1 7", "property1", messageDomain.getProperty());

            validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("101");
            valid = validator.isValidateProperty("property1", "LongRangeTest");
            assertFalse("check1 8", valid);
            messageDomain = validator.getErrList().get(0);
            assertNotNull("check1 9", messageDomain);
            params = messageDomain.getParams();
            assertEquals("check1 10", "GSCM-E0-0026", messageDomain.getKey());
            assertEquals("check1 11", "LongRange", params[0]);
            assertEquals("check1 12", -10L, params[1]);
            assertEquals("check1 13", 100L, params[2]);
            assertEquals("check1 14", "property1", messageDomain.getProperty());

            // 不正な値
            testDomain.setProperty2("100");
            try {
                validator = new Validator<ValidatorTestDomain>(testDomain);
                validator.isValidateProperty("property2", "LongRangeTest");
                fail("ArrayIndexOutOfBoundsException 1");
            } catch (ArrayIndexOutOfBoundsException e) {
                assertNotNull("ArrayIndexOutOfBoundsException 2", e);
            }

            // 不正な値
            testDomain.setProperty3("100");
            try {
                validator = new Validator<ValidatorTestDomain>(testDomain);
                validator.isValidateProperty("property3", "LongRangeTest");
                fail("ArrayIndexOutOfBoundsException 1");
            } catch (ArrayIndexOutOfBoundsException e) {
                assertNotNull("ArrayIndexOutOfBoundsException 2", e);
            }

            // 不正な値
            testDomain.setProperty4("100");
            try {
                validator = new Validator<ValidatorTestDomain>(testDomain);
                validator.isValidateProperty("property4", "LongRangeTest");
                fail("ArrayIndexOutOfBoundsException 1");
            } catch (ArrayIndexOutOfBoundsException e) {
                assertNotNull("ArrayIndexOutOfBoundsException 2", e);
            }

            // 不正な値
            testDomain.setProperty5("100");
            try {
                validator = new Validator<ValidatorTestDomain>(testDomain);
                validator.isValidateProperty("property5", "LongRangeTest");
                fail("NumberFormatException 1");
            } catch (NumberFormatException e) {
                assertNotNull("NumberFormatException 2", e);
            }

            // 不正な値
            testDomain.setProperty1("a");
            try {
                validator = new Validator<ValidatorTestDomain>(testDomain);
                validator.isValidateProperty("property1", "LongRangeTest");
                fail("NumberFormatException 1");
            } catch (NumberFormatException e) {
                assertNotNull("NumberFormatException 2", e);
            }
        }
        
        // チェックOK
        {        
            ValidatorTestDomain testDomain = new ValidatorTestDomain();
            testDomain.setLocale(Locale.JAPANESE);

            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("-10");
            boolean valid = validator.isPermittedLongRange("property1", "LongRangeTest");
            assertTrue("check2 1", valid);
            assertEquals("check2 2", 0, validator.getErrList().size());

            validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("100");
            valid = validator.isValidateProperty("property1", "LongRangeTest");
            assertTrue("check2 3", valid);
            assertEquals("check2 4", 0, validator.getErrList().size());

            validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("0");
            valid = validator.isValidateProperty("property1", "LongRangeTest");
            assertTrue("check2 5", valid);
            assertEquals("check2 6", 0, validator.getErrList().size());

        }
        
        // 値Blank
        {
            ValidatorTestDomain testDomain = new ValidatorTestDomain();
            testDomain.setLocale(Locale.JAPANESE);

            // NULL
            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1(null);
            boolean valid = validator.isValidateProperty("property1", "LongRangeTest");
            assertTrue("check3 1", valid);
            assertEquals("check3 2", 0, validator.getErrList().size());
            // Blank
            validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("");
            valid = validator.isValidateProperty("property1", "LongRangeTest");
            assertTrue("check3 3", valid);
            assertEquals("check3 4", 0, validator.getErrList().size());
        }
        // 同一プロパティが既にエラー時
//        {
//            ValidatorTestDomain testDomain = new ValidatorTestDomain();
//            testDomain.setLocale(Locale.JAPANESE);
//
//            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
//            testDomain.setProperty1("123");
//            validator.isPermittedCharMinLen("property1", "LongRangeTest2");
//            boolean valid = validator.isPermittedLongRange("property1", "LongRangeTest2");
//            assertTrue("check4 1", valid);
//            assertEquals("check4 2", 1, validator.getErrList().size());
//        }
        
        // 半角/全角スペース
        {
            ValidatorTestDomain testDomain = new ValidatorTestDomain();
            testDomain.setLocale(Locale.JAPANESE);
            
            // 半角スペース
            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1(" ");
            try {
                validator.isValidateProperty("property1", "LongRangeTest");
                fail("check5 1");
            } catch (NumberFormatException e) {
                assertNotNull("check5 2", e);
            }
            // 全角スペース
            validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("　");
            try {
                validator.isValidateProperty("property1", "LongRangeTest");
                fail("check5 3");
            } catch (NumberFormatException e) {
                assertNotNull("check5 4", e);
            }
        }
    }
    
    /**
     * FloatRangeチェック
     * @throws ApplicationException 例外
     * @throws IOException 例外
     * @throws ValidatorException 例外
     * @throws SAXException 例外
     */
    @Test
    public void testFloatRange() throws ApplicationException, IOException, ValidatorException, SAXException {
        
        // チェックNG
        {
            ValidatorTestDomain testDomain = new ValidatorTestDomain();
            testDomain.setLocale(Locale.JAPANESE);

            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("-10.011");
            boolean valid = validator.isValidateProperty("property1", "FloatRangeTest");
            assertFalse("check1 1", valid);
            MessageDomain messageDomain = validator.getErrList().get(0);
            assertNotNull("check1 2", messageDomain);
            Object[] params = messageDomain.getParams();
            assertEquals("check1 3", "GSCM-E0-0026", messageDomain.getKey());
            assertEquals("check1 4", "FloatRange", params[0]);
            assertEquals("check1 5", -10.01f, params[1]);
            assertEquals("check1 6", 100.99f, params[2]);
            assertEquals("check1 7", "property1", messageDomain.getProperty());

            validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("100.991");
            valid = validator.isValidateProperty("property1", "FloatRangeTest");
            assertFalse("check1 8", valid);
            messageDomain = validator.getErrList().get(0);
            assertNotNull("check1 9", messageDomain);
            params = messageDomain.getParams();
            assertEquals("check1 10", "GSCM-E0-0026", messageDomain.getKey());
            assertEquals("check1 11", "FloatRange", params[0]);
            assertEquals("check1 12", -10.01f, params[1]);
            assertEquals("check1 13", 100.99f, params[2]);
            assertEquals("check1 14", "property1", messageDomain.getProperty());

            // 不正な値
            testDomain.setProperty2("100");
            try {
                validator = new Validator<ValidatorTestDomain>(testDomain);
                validator.isValidateProperty("property2", "FloatRangeTest");
                fail("ArrayIndexOutOfBoundsException 1");
            } catch (ArrayIndexOutOfBoundsException e) {
                assertNotNull("ArrayIndexOutOfBoundsException 2", e);
            }

            // 不正な値
            testDomain.setProperty3("100");
            try {
                validator = new Validator<ValidatorTestDomain>(testDomain);
                validator.isValidateProperty("property3", "FloatRangeTest");
                fail("ArrayIndexOutOfBoundsException 1");
            } catch (ArrayIndexOutOfBoundsException e) {
                assertNotNull("ArrayIndexOutOfBoundsException 2", e);
            }

            // 不正な値
            testDomain.setProperty4("100");
            try {
                validator = new Validator<ValidatorTestDomain>(testDomain);
                validator.isValidateProperty("property4", "FloatRangeTest");
                fail("ArrayIndexOutOfBoundsException 1");
            } catch (ArrayIndexOutOfBoundsException e) {
                assertNotNull("ArrayIndexOutOfBoundsException 2", e);
            }

            // 不正な値
            testDomain.setProperty5("100");
            try {
                validator = new Validator<ValidatorTestDomain>(testDomain);
                validator.isValidateProperty("property5", "FloatRangeTest");
                fail("NumberFormatException 1");
            } catch (NumberFormatException e) {
                assertNotNull("NumberFormatException 2", e);
            }

            // 不正な値
            testDomain.setProperty1("a");
            try {
                validator = new Validator<ValidatorTestDomain>(testDomain);
                validator.isValidateProperty("property1", "FloatRangeTest");
                fail("NumberFormatException 1");
            } catch (NumberFormatException e) {
                assertNotNull("NumberFormatException 2", e);
            }
        }
        
        // チェックOK
        {        
            ValidatorTestDomain testDomain = new ValidatorTestDomain();
            testDomain.setLocale(Locale.JAPANESE);

            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("-10.01");
            boolean valid = validator.isPermittedFloatRange("property1", "FloatRangeTest");
            assertTrue("check2 1", valid);
            assertEquals("check2 2", 0, validator.getErrList().size());

            validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("100.99");
            valid = validator.isValidateProperty("property1", "FloatRangeTest");
            assertTrue("check2 3", valid);
            assertEquals("check2 4", 0, validator.getErrList().size());

            validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("0");
            valid = validator.isValidateProperty("property1", "FloatRangeTest");
            assertTrue("check2 5", valid);
            assertEquals("check2 6", 0, validator.getErrList().size());

        }
        
        // 値Blank
        {
            ValidatorTestDomain testDomain = new ValidatorTestDomain();
            testDomain.setLocale(Locale.JAPANESE);

            // Null
            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1(null);
            boolean valid = validator.isValidateProperty("property1", "FloatRangeTest");
            assertTrue("check3 1", valid);
            assertEquals("check3 2", 0, validator.getErrList().size());
            // Blank
            validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("");
            valid = validator.isValidateProperty("property1", "FloatRangeTest");
            assertTrue("check3 3", valid);
            assertEquals("check3 4", 0, validator.getErrList().size());
        }
        // 同一プロパティが既にエラー時
//        {
//            ValidatorTestDomain testDomain = new ValidatorTestDomain();
//            testDomain.setLocale(Locale.JAPANESE);
//
//            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
//            testDomain.setProperty1("123");
//            validator.isPermittedCharMinLen("property1", "FloatRangeTest2");
//            boolean valid = validator.isPermittedFloatRange("property1", "FloatRangeTest2");
//            assertTrue("check4 1", valid);
//            assertEquals("check4 2", 1, validator.getErrList().size());
//        }
        
        // 半角/全角スペース
        {
            ValidatorTestDomain testDomain = new ValidatorTestDomain();
            testDomain.setLocale(Locale.JAPANESE);
            
            // 半角スペース
            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1(" ");
            try {
                validator.isValidateProperty("property1", "FloatRangeTest");
                fail("check5 1");
            } catch (NumberFormatException e) {
                assertNotNull("check5 2", e);
            }
            // 全角スペース
            validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("　");
            try {
                validator.isValidateProperty("property1", "FloatRangeTest");
                fail("check5 3");
            } catch (NumberFormatException e) {
                assertNotNull("check5 4", e);
            }
        }
    }
    
    
    /**
     * DoubleRangeチェック
     * @throws ApplicationException 例外
     * @throws IOException 例外
     * @throws ValidatorException 例外
     * @throws SAXException 例外
     */
    @Test
    public void testDoubleRange() throws ApplicationException, IOException, ValidatorException, SAXException {
        
        // チェックNG
        {
            ValidatorTestDomain testDomain = new ValidatorTestDomain();
            testDomain.setLocale(Locale.JAPANESE);

            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("-10.011");
            boolean valid = validator.isValidateProperty("property1", "DoubleRangeTest");
            assertFalse("check1 1", valid);
            MessageDomain messageDomain = validator.getErrList().get(0);
            assertNotNull("check1 2", messageDomain);
            Object[] params = messageDomain.getParams();
            assertEquals("check1 3", "GSCM-E0-0026", messageDomain.getKey());
            assertEquals("check1 4", "DoubleRange", params[0]);
            assertEquals("check1 5", -10.01, params[1]);
            assertEquals("check1 6", 100.99, params[2]);
            assertEquals("check1 7", "property1", messageDomain.getProperty());

            validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("100.991");
            valid = validator.isValidateProperty("property1", "DoubleRangeTest");
            assertFalse("check1 8", valid);
            messageDomain = validator.getErrList().get(0);
            assertNotNull("check1 9", messageDomain);
            params = messageDomain.getParams();
            assertEquals("check1 10", "GSCM-E0-0026", messageDomain.getKey());
            assertEquals("check1 11", "DoubleRange", params[0]);
            assertEquals("check1 12", -10.01, params[1]);
            assertEquals("check1 13", 100.99, params[2]);
            assertEquals("check1 14", "property1", messageDomain.getProperty());

            // 不正な値
            testDomain.setProperty2("100");
            try {
                validator = new Validator<ValidatorTestDomain>(testDomain);
                validator.isValidateProperty("property2", "DoubleRangeTest");
                fail("ArrayIndexOutOfBoundsException 1");
            } catch (ArrayIndexOutOfBoundsException e) {
                assertNotNull("ArrayIndexOutOfBoundsException 2", e);
            }

            // 不正な値
            testDomain.setProperty3("100");
            try {
                validator = new Validator<ValidatorTestDomain>(testDomain);
                validator.isValidateProperty("property3", "DoubleRangeTest");
                fail("ArrayIndexOutOfBoundsException 1");
            } catch (ArrayIndexOutOfBoundsException e) {
                assertNotNull("ArrayIndexOutOfBoundsException 2", e);
            }

            // 不正な値
            testDomain.setProperty4("100");
            try {
                validator = new Validator<ValidatorTestDomain>(testDomain);
                validator.isValidateProperty("property4", "DoubleRangeTest");
                fail("ArrayIndexOutOfBoundsException 1");
            } catch (ArrayIndexOutOfBoundsException e) {
                assertNotNull("ArrayIndexOutOfBoundsException 2", e);
            }

            // 不正な値
            testDomain.setProperty5("100");
            try {
                validator = new Validator<ValidatorTestDomain>(testDomain);
                validator.isValidateProperty("property5", "DoubleRangeTest");
                fail("NumberFormatException 1");
            } catch (NumberFormatException e) {
                assertNotNull("NumberFormatException 2", e);
            }

            // 不正な値
            testDomain.setProperty1("a");
            try {
                validator = new Validator<ValidatorTestDomain>(testDomain);
                validator.isValidateProperty("property1", "DoubleRangeTest");
                fail("NumberFormatException 1");
            } catch (NumberFormatException e) {
                assertNotNull("NumberFormatException 2", e);
            }
        }
        
        // チェックOK
        {        
            ValidatorTestDomain testDomain = new ValidatorTestDomain();
            testDomain.setLocale(Locale.JAPANESE);

            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("-10.01");
            boolean valid = validator.isPermittedDoubleRange("property1", "DoubleRangeTest");
            assertTrue("check2 1", valid);
            assertEquals("check2 2", 0, validator.getErrList().size());

            validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("100.99");
            valid = validator.isValidateProperty("property1", "DoubleRangeTest");
            assertTrue("check2 3", valid);
            assertEquals("check2 4", 0, validator.getErrList().size());

            validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("0");
            valid = validator.isValidateProperty("property1", "DoubleRangeTest");
            assertTrue("check2 5", valid);
            assertEquals("check2 6", 0, validator.getErrList().size());

        }
        
        // 値Blank
        {
            ValidatorTestDomain testDomain = new ValidatorTestDomain();
            testDomain.setLocale(Locale.JAPANESE);

            // Null
            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1(null);
            boolean valid = validator.isValidateProperty("property1", "DoubleRangeTest");
            assertTrue("check3 1", valid);
            assertEquals("check3 2", 0, validator.getErrList().size());
            // Blank
            validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("");
            valid = validator.isValidateProperty("property1", "DoubleRangeTest");
            assertTrue("check3 3", valid);
            assertEquals("check3 4", 0, validator.getErrList().size());
        }
        // 同一プロパティが既にエラー時
//        {
//            ValidatorTestDomain testDomain = new ValidatorTestDomain();
//            testDomain.setLocale(Locale.JAPANESE);
//
//            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
//            testDomain.setProperty1("123");
//            validator.isPermittedCharMinLen("property1", "DoubleRangeTest2");
//            boolean valid = validator.isPermittedDoubleRange("property1", "DoubleRangeTest2");
//            assertTrue("check4 1", valid);
//            assertEquals("check4 2", 1, validator.getErrList().size());
//        }
        
        // 半角/全角スペース
        {
            ValidatorTestDomain testDomain = new ValidatorTestDomain();
            testDomain.setLocale(Locale.JAPANESE);
            
            // 半角スペース
            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1(" ");
            try {
                validator.isValidateProperty("property1", "DoubleRangeTest");
                fail("check5 1");
            } catch (NumberFormatException e) {
                assertNotNull("check5 2", e);
            }
            // 全角スペース
            validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("　");
            try {
                validator.isValidateProperty("property1", "DoubleRangeTest");
                fail("check5 3");
            } catch (NumberFormatException e) {
                assertNotNull("check5 4", e);
            }
        }
    }
    
    /**
     * BigDecimalRangeチェック
     * @throws ApplicationException 例外
     * @throws IOException 例外
     * @throws ValidatorException 例外
     * @throws SAXException 例外
     */
    @Test
    public void testBigDecimalRange() throws ApplicationException, IOException, ValidatorException, SAXException {
        
        // チェック対象外
        {
            ValidatorTestDomain testDomain = new ValidatorTestDomain();
            testDomain.setLocale(Locale.JAPANESE);

            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("a");
            boolean valid = validator.isValidateProperty("property1", "BigDecRanTestOff");
            assertTrue("check1 1", valid);
            assertEquals("check1 2", 0, validator.getErrList().size());
        }
        
        // チェックOK
        {        
            ValidatorTestDomain testDomain = new ValidatorTestDomain();
            testDomain.setLocale(Locale.JAPANESE);

            //チェック対象が境界値最小
            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
            //境界値最小：1234567.0123456789
            testDomain.setProperty1("1234567.0123456789");
            boolean valid = validator.isPermittedBigDecimalRange("property1", "BigDecRanTestOn");
            assertTrue("check2 1", valid);
            assertEquals("check2 2", 0, validator.getErrList().size());

            //チェック対象が境界値最大
            validator = new Validator<ValidatorTestDomain>(testDomain);
            //境界値最大：12345678901234567890.0123456789
            testDomain.setProperty1("12345678901234567890.0123456789");
            valid = validator.isValidateProperty("property1", "BigDecRanTestOn");
            assertTrue("check3 1", valid);
            assertEquals("check3 2", 0, validator.getErrList().size());

            //チェック対象がref
            validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("0");
            valid = validator.isValidateProperty("property1", "BigDecRanRef");
            assertTrue("check4 1", valid);
            assertEquals("check4 2", 0, validator.getErrList().size());
        }
        
        // 値Blank
        {
            ValidatorTestDomain testDomain = new ValidatorTestDomain();
            testDomain.setLocale(Locale.JAPANESE);

            // 空文字
            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("");
            boolean valid = validator.isValidateProperty("property1", "BigDecRanTestOn");
            assertTrue("check5 1", valid);
            assertEquals("check5 2", 0, validator.getErrList().size());

            // NULL
            validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1(null);
            valid = validator.isValidateProperty("property1", "BigDecRanTestOn");
            assertTrue("check6 3", valid);
            assertEquals("check6 4", 0, validator.getErrList().size());
        }

        // チェックNG
        {
            ValidatorTestDomain testDomain = new ValidatorTestDomain();
            testDomain.setLocale(Locale.JAPANESE);

            //チェック対象が境界値未満
            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
            //境界値最小：1234567.0123456789
            testDomain.setProperty1("1234567.0123456788");
            boolean valid = validator.isValidateProperty("property1", "BigDecRanTestOn");
            assertFalse("check7 1", valid);
            MessageDomain messageDomain = validator.getErrList().get(0);
            assertNotNull("check7 2", messageDomain);
            Object[] params = messageDomain.getParams();
            assertEquals("check7 3", "GSCM-E0-0026", messageDomain.getKey());
            assertEquals("check7 4", "BigDecimalRange", params[0]);
            BigDecimal param1 = new BigDecimal("1234567.0123456789");
            BigDecimal param2 = new BigDecimal("12345678901234567890.0123456789");
            assertEquals("check7 5", param1, params[1]);
            assertEquals("check7 6", param2, params[2]);
            assertEquals("check7 7", "property1", messageDomain.getProperty());

            //チェック対象が境界値超え
            validator = new Validator<ValidatorTestDomain>(testDomain);
            //境界値最大：12345678901234567890.0123456789
            testDomain.setProperty1("12345678901234567890.01234567891");
            valid = validator.isValidateProperty("property1", "BigDecRanTestOn");
            assertFalse("check8 1", valid);
            params = messageDomain.getParams();
            assertEquals("check8 3", "GSCM-E0-0026", messageDomain.getKey());
            assertEquals("check8 4", "BigDecimalRange", params[0]);
            param1 = new BigDecimal("1234567.0123456789");
            param2 = new BigDecimal("12345678901234567890.0123456789");
            assertEquals("check8 5", param1, params[1]);
            assertEquals("check8 6", param2, params[2]);
            assertEquals("check8 7", "property1", messageDomain.getProperty());

            // TM_RESOUCESの設定に不正な値（最大値指定なし）
            testDomain.setProperty2("100");
            try {
                validator = new Validator<ValidatorTestDomain>(testDomain);
                validator.isValidateProperty("property2", "BigDecRanTestOn");
                fail("ArrayIndexOutOfBoundsException9 1");
            } catch (ArrayIndexOutOfBoundsException e) {
                assertNotNull("ArrayIndexOutOfBoundsException9 2", e);
            }

            // TM_RESOUCESの設定に不正な値（最小値指定なし）
            testDomain.setProperty3("100");
            try {
                validator = new Validator<ValidatorTestDomain>(testDomain);
                validator.isValidateProperty("property3", "BigDecRanTestOn");
                fail("ArrayIndexOutOfBoundsException10 1");
            } catch (ArrayIndexOutOfBoundsException e) {
                assertNotNull("ArrayIndexOutOfBoundsException10 2", e);
            }

            // TM_RESOUCESの設定に不正な値（最大値・最小値指定なし）
            testDomain.setProperty4("100");
            try {
                validator = new Validator<ValidatorTestDomain>(testDomain);
                validator.isValidateProperty("property4", "BigDecRanTestOn");
                fail("ArrayIndexOutOfBoundsException11 1");
            } catch (ArrayIndexOutOfBoundsException e) {
                assertNotNull("ArrayIndexOutOfBoundsException11 2", e);
            }

            // TM_RESOUCESの設定に不正な値（文字列）
            testDomain.setProperty5("100");
            try {
                validator = new Validator<ValidatorTestDomain>(testDomain);
                validator.isValidateProperty("property5", "BigDecRanTestOn");
                fail("NumberFormatException12 1");
            } catch (NumberFormatException e) {
                assertNotNull("NumberFormatException12 2", e);
            }

            // チェック対象が数値以外の文字
            testDomain.setProperty1("a");
            try {
                validator = new Validator<ValidatorTestDomain>(testDomain);
                validator.isValidateProperty("property1", "BigDecRanTestOn");
                fail("NumberFormatException13 1");
            } catch (NumberFormatException e) {
                assertNotNull("NumberFormatException13 2", e);
            }
        }

        // 半角/全角スペース
        {
            ValidatorTestDomain testDomain = new ValidatorTestDomain();
            testDomain.setLocale(Locale.JAPANESE);
            
            // 半角スペース
            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1(" ");
            try {
                validator.isValidateProperty("property1", "BigDecRanTestOn");
                fail("NumberFormatException14 1");
            } catch (NumberFormatException e) {
                assertNotNull("NumberFormatException14 2", e);
            }
            // 全角スペース
            validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("　");
            try {
                validator.isValidateProperty("property1", "BigDecRanTestOn");
                fail("NumberFormatException15 1");
            } catch (NumberFormatException e) {
                assertNotNull("NumberFormatException15 2", e);
            }
        }
        //チェック対象が0 or 負の値
        {
            ValidatorTestDomain testDomain = new ValidatorTestDomain();
            testDomain.setLocale(Locale.JAPANESE);
            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);

            //チェック対象が0（範囲外）
            testDomain.setProperty1("0");
            boolean valid = validator.isValidateProperty("property1", "BigDecRanTestOn2");
            assertFalse("check16 1", valid);
            assertEquals("check16 2", "GSCM-E0-0026", validator.getErrList().get(0).getKey());

            //チェック対象が負の値（範囲外）
            testDomain.setProperty2("-1.1");
            valid = validator.isValidateProperty("property2", "BigDecRanTestOn2");
            assertFalse("check17 1", valid);
            assertEquals("check17 2", "GSCM-E0-0026", validator.getErrList().get(0).getKey());

            //チェック対象が0（範囲内）
            testDomain.setProperty2("0");
            validator = new Validator<ValidatorTestDomain>(testDomain);
            valid = validator.isValidateProperty("property2", "BigDecRanTestOn2");
            assertTrue("check18 1", valid);
            assertEquals("check18 2", 0, validator.getErrList().size());

            //チェック対象が負の値（範囲内）
            testDomain.setProperty2("-0.9");
            valid = validator.isValidateProperty("property2", "BigDecRanTestOn2");
            assertTrue("check19 1", valid);
            assertEquals("check19 2", 0, validator.getErrList().size());
        }
    }
    
    /**
     * Formatチェック
     * @throws ApplicationException 例外
     * @throws IOException 例外
     * @throws ValidatorException 例外
     * @throws SAXException 例外
     */
    @Test
    public void testFormat() throws ApplicationException, IOException, ValidatorException, SAXException {
        
        // チェックNG
        {
            ValidatorTestDomain testDomain = new ValidatorTestDomain();
            testDomain.setLocale(Locale.JAPANESE);

            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("aaaaa");
            boolean valid = validator.isValidateProperty("property1", "FormatTest");
            assertFalse("check1 1", valid);
            MessageDomain messageDomain = validator.getErrList().get(0);
            Object[] params = messageDomain.getParams();
            assertNotNull("check1 2", messageDomain);
            assertEquals("check1 3", "GSCM-E0-0018", messageDomain.getKey());
            assertEquals("check1 4", "正規表現", params[0]);
            assertEquals("check1 5", "property1", messageDomain.getProperty());
        }
        
        // チェックOK
        {
            ValidatorTestDomain testDomain = new ValidatorTestDomain();
            testDomain.setLocale(Locale.JAPANESE);

            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("aaaa");
            boolean valid = validator.isPermittedFormat("property1", "FormatTest");
            assertTrue("check2 1", valid);
            assertEquals("check2 3", 0, validator.getErrList().size());
        }
        
        // 値Blank
        {
            ValidatorTestDomain testDomain = new ValidatorTestDomain();
            testDomain.setLocale(Locale.JAPANESE);

            // NULL
            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1(null);
            boolean valid = validator.isValidateProperty("property1", "FormatTest");
            assertTrue("check3 1", valid);
            assertEquals("check3 2", 0, validator.getErrList().size());
            // Blank
            validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("");
            valid = validator.isValidateProperty("property1", "FormatTest");
            assertTrue("check3 3", valid);
            assertEquals("check3 4", 0, validator.getErrList().size());
        }
        // 同一プロパティが既にエラー時
//        {
//            ValidatorTestDomain testDomain = new ValidatorTestDomain();
//            testDomain.setLocale(Locale.JAPANESE);
//
//            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
//            testDomain.setProperty1("123");
//            validator.isPermittedCharMinLen("property1", "FormatTest2");
//            boolean valid = validator.isPermittedFormat("property1", "FormatTest2");
//            assertTrue("check4 1", valid);
//            assertEquals("check4 2", 1, validator.getErrList().size());
//        }
        
        // 半角/全角スペース
        {
            ValidatorTestDomain testDomain = new ValidatorTestDomain();
            testDomain.setLocale(Locale.JAPANESE);

            // 半角スペース
            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1(" ");
            boolean valid = validator.isValidateProperty("property1", "FormatTest");
            assertFalse("check5 1", valid);
            assertEquals("check5 2", "GSCM-E0-0018", validator.getErrList().get(0).getKey());
            // 全角スペース
            validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("　");
            valid = validator.isValidateProperty("property1", "FormatTest");
            assertFalse("check5 3", valid);
            assertEquals("check5 4", "GSCM-E0-0018", validator.getErrList().get(0).getKey());
        }
    }
    
    /**
     * Dateチェック
     * @throws ApplicationException 例外
     * @throws IOException 例外
     * @throws ValidatorException 例外
     * @throws SAXException 例外
     */
    @Test
    public void testDate() throws ApplicationException, IOException, ValidatorException, SAXException {
        
        // チェックNG
        {
            ValidatorTestDomain testDomain = new ValidatorTestDomain();
            testDomain.setLocale(Locale.JAPANESE);

            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("2013-01-01");
            boolean valid = validator.isValidateProperty("property1", "DateTest");
            assertFalse("check1 1", valid);
            MessageDomain messageDomain = validator.getErrList().get(0);
            Object[] params = messageDomain.getParams();
            assertNotNull("check1 2", messageDomain);
            assertEquals("check1 3", "GSCM-E0-0019", messageDomain.getKey());
            assertEquals("check1 4", "日付", params[0]);
            assertEquals("check1 5", "property1", messageDomain.getProperty());
        }
        
        // チェックOK
        {
            ValidatorTestDomain testDomain = new ValidatorTestDomain();
            testDomain.setLocale(Locale.JAPANESE);

            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("2013/01/31");
            boolean valid = validator.isPermittedDate("property1", "DateTest");
            assertTrue("check2 1", valid);
            assertEquals("check2 2", 0, validator.getErrList().size());

            validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("20130131");
            valid = validator.isValidateProperty("property1", "DateTest");
            assertTrue("check2 3", valid);
            assertEquals("check2 4", 0, validator.getErrList().size());

            validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("31-01-2013");
            valid = validator.isValidateProperty("property1", "DateTest");
            assertTrue("check2 5", valid);
            assertEquals("check2 6", 0, validator.getErrList().size());

            validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty2("2013-02-28");
            valid = validator.isValidateProperty("property2", "DateTest");
            assertTrue("check2 7", valid);
            assertEquals("check2 8", 0, validator.getErrList().size());
        }
        
        // 値Blank
        {
            ValidatorTestDomain testDomain = new ValidatorTestDomain();
            testDomain.setLocale(Locale.JAPANESE);

            // NULL
            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1(null);
            boolean valid = validator.isValidateProperty("property1", "DateTest");
            assertTrue("check3 1", valid);
            assertEquals("check3 2", 0, validator.getErrList().size());
            // Blank
            validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("");
            valid = validator.isValidateProperty("property1", "DateTest");
            assertTrue("check3 3", valid);
            assertEquals("check3 4", 0, validator.getErrList().size());
        }
        // 同一プロパティが既にエラー時
//        {
//            ValidatorTestDomain testDomain = new ValidatorTestDomain();
//            testDomain.setLocale(Locale.JAPANESE);
//
//            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
//            testDomain.setProperty1("123");
//            validator.isPermittedCharMinLen("property1", "DateTest2");
//            boolean valid = validator.isPermittedDate("property1", "DateTest2");
//            assertTrue("check4 1", valid);
//            assertEquals("check4 2", 1, validator.getErrList().size());
//        }
        
        // 半角/全角スペース
        {
            ValidatorTestDomain testDomain = new ValidatorTestDomain();
            testDomain.setLocale(Locale.JAPANESE);

            // 半角スペース
            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1(" ");
            boolean valid = validator.isValidateProperty("property1", "DateTest");
            assertFalse("check5 1", valid);
            assertEquals("check5 2", "GSCM-E0-0019", validator.getErrList().get(0).getKey());
            // 全角スペース
            validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("　");
            valid = validator.isValidateProperty("property1", "DateTest");
            assertFalse("check5 3", valid);
            assertEquals("check5 4", "GSCM-E0-0019", validator.getErrList().get(0).getKey());
        }
    }
    
    /**
     * OwnerCompDateチェック
     * @throws ApplicationException 例外
     * @throws IOException 例外
     * @throws ValidatorException 例外
     * @throws SAXException 例外
     */
    @Test
    public void testOwnerCompDate() throws ApplicationException, IOException, ValidatorException, SAXException {
        
        // チェックNG
        {
            ValidatorTestDomain testDomain = new ValidatorTestDomain();
            testDomain.setLocale(Locale.JAPANESE);
            testDomain.setDateFormat("yyyy/MM/dd");

            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("2013-01-01");
            boolean valid = validator.isValidateProperty("property1", "OwnerCompDateTest");
            assertFalse("check1 1", valid);
            MessageDomain messageDomain = validator.getErrList().get(0);
            Object[] params = messageDomain.getParams();
            assertNotNull("check1 2", messageDomain);
            assertEquals("check1 3", "GSCM-E0-0019", messageDomain.getKey());
            assertEquals("check1 4", "責任会社日付", params[0]);
            assertEquals("check1 5", "property1", messageDomain.getProperty());
        }
        
        // チェックOK
        {
            ValidatorTestDomain testDomain = new ValidatorTestDomain();
            testDomain.setLocale(Locale.JAPANESE);
            testDomain.setDateFormat("yyyy/MM/dd");

            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("2013/01/31");
            boolean valid = validator.isPermittedOwnerCompDate("property1", "OwnerCompDateTest");
            assertTrue("check2 1", valid);
            assertEquals("check2 2", 0, validator.getErrList().size());
        }
        
        // 値Blank
        {
            ValidatorTestDomain testDomain = new ValidatorTestDomain();
            testDomain.setLocale(Locale.JAPANESE);
            testDomain.setDateFormat("yyyy/MM/dd");

            // NULL
            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1(null);
            boolean valid = validator.isValidateProperty("property1", "OwnerCompDateTest");
            assertTrue("check3 1", valid);
            assertEquals("check3 2", 0, validator.getErrList().size());
            // Blank
            validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("");
            valid = validator.isValidateProperty("property1", "OwnerCompDateTest");
            assertTrue("check3 3", valid);
            assertEquals("check3 4", 0, validator.getErrList().size());
        }
        
        // 責任会社日付フォーマットBlank
        {
            ValidatorTestDomain testDomain = new ValidatorTestDomain();
            testDomain.setLocale(Locale.JAPANESE);

            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("2013/01/31");
            boolean valid = validator.isValidateProperty("property1", "OwnerCompDateTest");
            assertTrue("check3 5", valid);
            assertEquals("check3 6", 0, validator.getErrList().size());
        }
        // 同一プロパティが既にエラー時
//        {
//            ValidatorTestDomain testDomain = new ValidatorTestDomain();
//            testDomain.setLocale(Locale.JAPANESE);
//
//            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
//            testDomain.setProperty1("123");
//            validator.isPermittedCharMinLen("property1", "OwnerCompDateTest2");
//            boolean valid = validator.isPermittedOwnerCompDate("property1", "OwnerCompDateTest2");
//            assertTrue("check4 1", valid);
//            assertEquals("check4 2", 1, validator.getErrList().size());
//        }
        
        // 半角/全角スペース
        {
            ValidatorTestDomain testDomain = new ValidatorTestDomain();
            testDomain.setLocale(Locale.JAPANESE);
            testDomain.setDateFormat("yyyy/MM/dd");

            // 半角スペース
            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1(" ");
            boolean valid = validator.isValidateProperty("property1", "OwnerCompDateTest");
            assertFalse("check5 1", valid);
            assertEquals("check5 2", "GSCM-E0-0019", validator.getErrList().get(0).getKey());
            // 全角スペース
            validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("　");
            valid = validator.isValidateProperty("property1", "OwnerCompDateTest");
            assertFalse("check5 3", valid);
            assertEquals("check5 4", "GSCM-E0-0019", validator.getErrList().get(0).getKey());
        }
    }

    /**
     * URLチェック
     * @throws ApplicationException 例外
     * @throws IOException 例外
     * @throws ValidatorException 例外
     * @throws SAXException 例外
     */
    @Test
    public void testURL() throws ApplicationException, IOException, ValidatorException, SAXException {
        
        // チェックNG
        {
            ValidatorTestDomain testDomain = new ValidatorTestDomain();
            testDomain.setLanguageCd(Locale.JAPANESE.getLanguage());

            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setUrl("xxxx://www.dnitsol.com/");
            boolean valid = validator.isValidateProperty("url");
            assertFalse("check1 1", valid);
            MessageDomain messageDomain = validator.getErrList().get(0);
            Object[] params = messageDomain.getParams();
            assertNotNull("check1 2", messageDomain);
            assertEquals("check1 3", "GSCM-E0-0028", messageDomain.getKey());
            assertEquals("check1 4", "URL", params[0]);
            assertEquals("check1 5", "url", messageDomain.getProperty());
        }
        
        // チェックOK
        {
            ValidatorTestDomain testDomain = new ValidatorTestDomain();
            testDomain.setLanguageCd(Locale.JAPANESE.getLanguage());

            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setUrl("http://www.dnitsol.com/");
            boolean valid = validator.isPermittedUrl("url", "UrlTest");
            assertTrue("check2 1", valid);
            assertEquals("check2 2", 0, validator.getErrList().size());
            
            validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setUrl("https://www.dnitsol.com/");
            valid = validator.isValidateProperty("url");
            assertTrue("check2 3", valid);
            assertEquals("check2 4", 0, validator.getErrList().size());
            
            validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setUrl("ftp://www.dnitsol.com/");
            valid = validator.isValidateProperty("url");
            assertTrue("check2 5", valid);
            assertEquals("check2 6", 0, validator.getErrList().size());
        }
        
        // 値Blank
        {
            ValidatorTestDomain testDomain = new ValidatorTestDomain();
            testDomain.setLocale(Locale.JAPANESE);

            // NULL
            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setUrl(null);
            boolean valid = validator.isValidateProperty("url");
            assertTrue("check3 1", valid);
            assertEquals("check3 2", 0, validator.getErrList().size());
            // Blank
            validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setUrl("");
            valid = validator.isValidateProperty("url");
            assertTrue("check3 3", valid);
            assertEquals("check3 4", 0, validator.getErrList().size());
        }
        
        // チェック対象外
        {
            ValidatorTestDomain testDomain = new ValidatorTestDomain();
            testDomain.setLocale(Locale.JAPANESE);

            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("xxxx://www.dnitsol.com/");
            boolean valid = validator.isValidateProperty("property1");
            assertTrue("check4 1", valid);
            assertEquals("check4 2", 0, validator.getErrList().size());
        }
        // 同一プロパティが既にエラー時
//        {
//            ValidatorTestDomain testDomain = new ValidatorTestDomain();
//            testDomain.setLocale(Locale.JAPANESE);
//
//            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
//            testDomain.setUrl("123");
//            validator.isPermittedCharMinLen("url", "UrlTest2");
//            boolean valid = validator.isPermittedUrl("url", "UrlTest2");
//            assertTrue("check5 1", valid);
//            assertEquals("check5 2", 1, validator.getErrList().size());
//        }
        
        // 半角/全角スペース
        {
            ValidatorTestDomain testDomain = new ValidatorTestDomain();
            testDomain.setLocale(Locale.JAPANESE);

            // 半角スペース
            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setUrl(" ");
            boolean valid = validator.isValidateProperty("url", "UrlTest");
            assertFalse("check6 1", valid);
            assertEquals("check6 2", "GSCM-E0-0028", validator.getErrList().get(0).getKey());
            // 全角スペース
            validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setUrl("　");
            valid = validator.isValidateProperty("url", "UrlTest");
            assertFalse("check6 3", valid);
            assertEquals("check6 4", "GSCM-E0-0028", validator.getErrList().get(0).getKey());
        }
    }
    
        
    /**
     * Emailチェック
     * @throws ApplicationException 例外
     * @throws IOException 例外
     * @throws ValidatorException 例外
     * @throws SAXException 例外
     */
    @Test
    public void testEmail() throws ApplicationException, IOException, ValidatorException, SAXException {
        
        // チェックNG
        {
            // 標準メッセージ
            ValidatorTestDomain testDomain = new ValidatorTestDomain();
            testDomain.setLanguageCd(Locale.JAPANESE.getLanguage());

            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain, "EmailTest", 10);
            testDomain.setEmail("career&dnitsol.com");
            boolean valid = validator.isValidateAllProperties();
            assertFalse("check1 1", valid);
            MessageDomain messageDomain = validator.getErrList().get(0);
            Object[] params = messageDomain.getParams();
            assertNotNull("check1 2", messageDomain);
            assertEquals("check1 3", "GSCM-E0-0027", messageDomain.getKey());
            assertEquals("check1 4", "11行目電子メール", params[0]);
            assertEquals("check1 5", "EmailTest[10].email", messageDomain.getProperty());
            
            // カスタムメッセージ
            validator = new Validator<ValidatorTestDomain>(testDomain, "EmailTest", 10);
            valid = validator.isPermittedEmail("email", "EmailTest");
            assertFalse("check1 6", valid);
            messageDomain = validator.getErrList().get(0);
            params = messageDomain.getParams();
            assertNotNull("check1 7", messageDomain);
            assertEquals("check1 8", "EMAIL-001", messageDomain.getKey());
            assertEquals("check1 9", 1, params.length);
            assertEquals("check1 10", "11行目電子メール", params[0]);
            assertEquals("check1 11", "EmailTest[10].email", messageDomain.getProperty());
            
            
        }
        
        // チェックOK
        {
            ValidatorTestDomain testDomain = new ValidatorTestDomain();
            testDomain.setLanguageCd(Locale.JAPANESE.getLanguage());

            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain, "EmailTest", 11);
            testDomain.setEmail("career@dnitsol.com");
            boolean valid = validator.isValidateProperty("email");
            assertTrue("check2 1", valid);
            assertEquals("check2 2", 0, validator.getErrList().size());
        }
        
        // 値Blank
        {
            ValidatorTestDomain testDomain = new ValidatorTestDomain();
            testDomain.setLocale(Locale.JAPANESE);

            // NULL
            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain, "EmailTest", 12);
            testDomain.setEmail(null);
            boolean valid = validator.isValidateProperty("email");
            assertTrue("check3 1", valid);
            assertEquals("check3 2", 0, validator.getErrList().size());
            // Blank
            validator = new Validator<ValidatorTestDomain>(testDomain, "EmailTest", 12);
            testDomain.setEmail("");
            valid = validator.isValidateProperty("email");
            assertTrue("check3 3", valid);
            assertEquals("check3 4", 0, validator.getErrList().size());
        }
        
        // チェック対象外
        {
        
            ValidatorTestDomain testDomain = new ValidatorTestDomain();
            testDomain.setLocale(Locale.JAPANESE);

            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain, "EmailTest", 13);
            testDomain.setProperty2("career&dnitsol.com");
            boolean valid = validator.isValidateProperty("property2");
            assertTrue("check4 1", valid);
            assertEquals("check4 2", 0, validator.getErrList().size());
        }
        // 同一プロパティが既にエラー時
//        {
//            ValidatorTestDomain testDomain = new ValidatorTestDomain();
//            testDomain.setLocale(Locale.JAPANESE);
//
//            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
//            testDomain.setEmail("123");
//            validator.isPermittedCharMinLen("email", "EmailTest2");
//            boolean valid = validator.isPermittedEmail("email", "EmailTest2");
//            assertTrue("check5 1", valid);
//            assertEquals("check5 2", 1, validator.getErrList().size());
//        }
        
        // 半角/全角スペース
        {
            ValidatorTestDomain testDomain = new ValidatorTestDomain();
            testDomain.setLocale(Locale.JAPANESE);

            // 半角スペース
            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setEmail(" ");
            boolean valid = validator.isValidateProperty("email");
            assertFalse("check6 1", valid);
            assertEquals("check6 2", "GSCM-E0-0027", validator.getErrList().get(0).getKey());
            // 全角スペース
            validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setEmail("　");
            valid = validator.isValidateProperty("email");
            assertFalse("check6 3", valid);
            assertEquals("check6 4", "GSCM-E0-0027", validator.getErrList().get(0).getKey());
        }
    }
    
    /**
     * プロパティに関連するテスト
     */
    @Test
    public void testProperty() {
        
        // 指定プロパティ名がNULL
        ValidatorTestDomain testDomain = new ValidatorTestDomain();
        testDomain.setLocale(Locale.JAPANESE);
        // プロパティnull
        Validator<ValidatorTestDomain> propertyNull = new Validator<ValidatorTestDomain>(testDomain);
        boolean validNull = propertyNull.isValidateProperties((String[])null);
        assertTrue("check null 1", validNull);
        validNull = propertyNull.isValidateProperties((Map<String, String>)null);
        assertTrue("check null 2", validNull);
        
        // Mapのプロパティ
        Map<String, String> propertiesMap = new TreeMap<String, String>();
        propertiesMap.put("property1", "map1");
        propertiesMap.put("property2", "map2");
        propertiesMap.put("property3", "map3");
        propertiesMap.put("property4", "map4");
        propertiesMap.put("property5", "map5");
        
        testDomain.setProperty1("");
        testDomain.setProperty2("12");
        testDomain.setProperty3("123");
        testDomain.setProperty4("1234");
        testDomain.setProperty5("12345");
        
        Validator<ValidatorTestDomain> propertyMap = new Validator<ValidatorTestDomain>(testDomain);
        boolean validMap = propertyMap.isValidateProperties(propertiesMap);
        assertFalse("map 1", validMap);
        List<MessageDomain> mapErrList = propertyMap.getErrList();
        assertEquals("map 2", 3, mapErrList.size());
        MessageDomain msg0 = mapErrList.get(0);
        MessageDomain msg1 = mapErrList.get(1);
        MessageDomain msg2 = mapErrList.get(2);
        assertEquals("map 3", "property2", msg0.getProperty());
        assertEquals("map 4", "property3", msg1.getProperty());
        assertEquals("map 5", "property4", msg2.getProperty());
        
        // Exception
        Validator<ValidatorTestDomain> nosuch = new Validator<ValidatorTestDomain>(testDomain);
        try {
            nosuch.isValidateProperty("nosuch");
            fail("Exception 3");
        } catch (SystemException e) {
            assertNotNull("Exception 3", e);
        }
        
    }
    
    /**
     * 
     * ValidatePropertyメソッドのテスト
     * 
     */
    @Test
    public void testValidateProperty() {
        
        // 指定プロパティ名がNULL
        ValidatorTestDomain testDomain = new ValidatorTestDomain();
        testDomain.setLocale(Locale.JAPANESE);
        
        // プロパティnull
        

        // 必須チェック
        {
            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1(null);
            Boolean result = validator.isValidateProperty("property1", "propTest1");
            assertFalse("check1-1", result);
            assertEquals("check1-2", 1, validator.getErrList().size());
            assertEquals("check1-3", "GSCM-E0-0011", validator.getErrList().get(0).getKey());
        }
        
        // 属性チェック(全角)
        {
            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("a1あ");
            Boolean result = validator.isValidateProperty("property1", "propTest1");
            assertFalse("check2-1", result);
            assertEquals("check2-2", 1, validator.getErrList().size());
            assertEquals("check2-3", "GSCM-E0-0014", validator.getErrList().get(0).getKey());
        }
        
        // 属性チェック(半角英数字)
        {
            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("a1あ");
            Boolean result = validator.isValidateProperty("property1", "propTest2");
            assertFalse("check3-1", result);
            assertEquals("check3-2", 1, validator.getErrList().size());
            assertEquals("check3-3", "GSCM-E0-0015", validator.getErrList().get(0).getKey());
        }
        
        // 属性チェック(半角英字)
        {
            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("a1あ");
            Boolean result = validator.isValidateProperty("property1", "propTest3");
            assertFalse("check4-1", result);
            assertEquals("check4-2", 1, validator.getErrList().size());
            assertEquals("check4-3", "GSCM-E0-0016", validator.getErrList().get(0).getKey());
        }
        
        // 属性チェック(数字)
        {
            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("a1あ");
            Boolean result = validator.isValidateProperty("property1", "propTest4");
            assertFalse("check5-1", result);
            assertEquals("check5-2", 1, validator.getErrList().size());
            assertEquals("check5-3", "GSCM-E0-0017", validator.getErrList().get(0).getKey());
        }
        
        // 最小桁数チェック
        {
            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("あ");
            Boolean result = validator.isValidateProperty("property1", "propTest1");
            assertFalse("check6-1", result);
            assertEquals("check6-2", 1, validator.getErrList().size());
            assertEquals("check6-3", "GSCM-E0-0022", validator.getErrList().get(0).getKey());
        }
        
        // 最大桁数チェック
        {
            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("a1b");
            Boolean result = validator.isValidateProperty("property1", "propTest2");
            assertFalse("check7-1", result);
            assertEquals("check7-2", 1, validator.getErrList().size());
            assertEquals("check7-3", "GSCM-E0-0013", validator.getErrList().get(0).getKey());
        }
        
        // バイトチェック
        {
            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("a");
            Boolean result = validator.isValidateProperty("property1", "propTest5");
            assertFalse("check8-1", result);
            assertEquals("check8-2", 1, validator.getErrList().size());
            assertEquals("check8-3", "GSCM-E0-0023", validator.getErrList().get(0).getKey());
        }
        
        // 整数チェック(short)
        {
            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("a");
            Boolean result = validator.isValidateProperty("property1", "propTest6");
            assertFalse("check9-1", result);
            assertEquals("check9-2", 1, validator.getErrList().size());
            assertEquals("check9-3", "GSCM-E0-0024", validator.getErrList().get(0).getKey());
        }
        
        // 整数チェック(integer)
        {
            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("a");
            Boolean result = validator.isValidateProperty("property1", "propTest7");
            assertFalse("check10-1", result);
            assertEquals("check10-2", 1, validator.getErrList().size());
            assertEquals("check10-3", "GSCM-E0-0024", validator.getErrList().get(0).getKey());
        }
        
        // 整数チェック(long)
        {
            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("a");
            Boolean result = validator.isValidateProperty("property1", "propTest8");
            assertFalse("check11-1", result);
            assertEquals("check11-2", 1, validator.getErrList().size());
            assertEquals("check11-3", "GSCM-E0-0024", validator.getErrList().get(0).getKey());
        }
        
        // 小数チェック(float)
        {
            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("a");
            Boolean result = validator.isValidateProperty("property1", "propTest9");
            assertFalse("check12-1", result);
            assertEquals("check12-2", 1, validator.getErrList().size());
            assertEquals("check12-3", "GSCM-E0-0025", validator.getErrList().get(0).getKey());
        }
        
        // 小数チェック(double)
        {
            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("a");
            Boolean result = validator.isValidateProperty("property1", "propTest10");
            assertFalse("check13-1", result);
            assertEquals("check13-2", 1, validator.getErrList().size());
            assertEquals("check13-3", "GSCM-E0-0025", validator.getErrList().get(0).getKey());
        }
        
        // 小数チェック(bigDecimal)
        {
            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("a");
            Boolean result = validator.isValidateProperty("property1", "propTest15");
            assertFalse("check23-1", result);
            assertEquals("check23-2", 1, validator.getErrList().size());
            assertEquals("check23-3", "GSCM-E0-0025", validator.getErrList().get(0).getKey());
        }
        
        // 整数範囲チェック(short)
        {
            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("21");
            Boolean result = validator.isValidateProperty("property1", "propTest11");
            assertFalse("check14-1", result);
            assertEquals("check14-2", 1, validator.getErrList().size());
            assertEquals("check14-3", "GSCM-E0-0026", validator.getErrList().get(0).getKey());
        }

        // 整数範囲チェック(integer)
        {
            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("20");
            Boolean result = validator.isValidateProperty("property1", "propTest11");
            assertFalse("check15-1", result);
            assertEquals("check15-2", 1, validator.getErrList().size());
            assertEquals("check15-3", "GSCM-E0-0026", validator.getErrList().get(0).getKey());
        }

        // 整数範囲チェック(long)
        {
            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("15");
            Boolean result = validator.isValidateProperty("property1", "propTest11");
            assertFalse("check16-1", result);
            assertEquals("check16-2", 1, validator.getErrList().size());
            assertEquals("check16-3", "GSCM-E0-0026", validator.getErrList().get(0).getKey());
        }

        // 小数範囲チェック(float)
        {
            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("20.6");
            Boolean result = validator.isValidateProperty("property1", "propTest12");
            assertFalse("check17-1", result);
            assertEquals("check17-2", 1, validator.getErrList().size());
            assertEquals("check17-3", "GSCM-E0-0026", validator.getErrList().get(0).getKey());
        }

        // 小数範囲チェック(double)
        {
            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("10.6");
            Boolean result = validator.isValidateProperty("property1", "propTest12");
            assertFalse("check18-1", result);
            assertEquals("check18-2", 1, validator.getErrList().size());
            assertEquals("check18-3", "GSCM-E0-0026", validator.getErrList().get(0).getKey());
        }

        // 小数範囲チェック(bigDecimal)
        {
            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("10.6");
            Boolean result = validator.isValidateProperty("property1", "propTest16");
            assertFalse("check24-1", result);
            assertEquals("check24-2", 1, validator.getErrList().size());
            assertEquals("check24-3", "GSCM-E0-0026", validator.getErrList().get(0).getKey());
        }
        
        // 正規表現チェック
        {
            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("10");
            Boolean result = validator.isValidateProperty("property1", "propTest12");
            assertFalse("check19-1", result);
            assertEquals("check19-2", 1, validator.getErrList().size());
            assertEquals("check19-3", "GSCM-E0-0018", validator.getErrList().get(0).getKey());
        }

        // 責任会社日付チェック
        {
            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("31/12/2014");
            Boolean result = validator.isValidateProperty("property1", "propTest13");
            assertFalse("check20-1", result);
            assertEquals("check20-2", 1, validator.getErrList().size());
            assertEquals("check20-3", "GSCM-E0-0019", validator.getErrList().get(0).getKey());
        }

        // 日付チェック
        {
            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("201/12/31");
            Boolean result = validator.isValidateProperty("property1", "propTest13");
            assertFalse("check21-1", result);
            assertEquals("check21-2", 1, validator.getErrList().size());
            assertEquals("check21-3", "GSCM-E0-0019", validator.getErrList().get(0).getKey());
        }

        // URLチェック
        {
            Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
            testDomain.setProperty1("a");
            Boolean result = validator.isValidateProperty("property1", "propTest14");
            assertFalse("check22-1", result);
            assertEquals("check22-2", 1, validator.getErrList().size());
            assertEquals("check22-3", "GSCM-E0-0028", validator.getErrList().get(0).getKey());
        }

        
    
    }
    
    /**
     * 複数エラーのテスト
     */
    @Test
    public void testErrors1() {
        ValidatorTestDomain testDomain = new ValidatorTestDomain();
        testDomain.setLocale(Locale.JAPANESE);
        
        // プロパティ1は必須
        testDomain.setProperty1(null);
        
        // プロパティ2はint
        testDomain.setProperty2(String.valueOf(Long.MAX_VALUE));
        
        // プロパティ3は10桁まで
        testDomain.setProperty3("12345678901");
        
        // プロパティ4はエラーなし（URL）
        testDomain.setProperty4("http://www.dnitsol.com/");
        
        // プロパティ5は日付
        testDomain.setProperty5("2013/02/29");
        
        Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
        boolean valid = validator.isValidateAllProperties("Errors1");
        assertFalse("errors1 1", valid);
        
        List<MessageDomain> errList = validator.getErrList();
        assertEquals("errors1 2", 4, errList.size());
        
        MessageDomain msg0 = errList.get(0);
        MessageDomain msg1 = errList.get(1);
        MessageDomain msg2 = errList.get(2);
        MessageDomain msg3 = errList.get(3);
        
        assertEquals("errors1 3", "ERRORS-1", msg0.getKey());
        assertEquals("errors1 4", "ERRORS-2", msg1.getKey());
        assertEquals("errors1 5", "ERRORS-3", msg2.getKey());
        assertEquals("errors1 6", "ERRORS-5", msg3.getKey());
        
        assertEquals("errors1 7", "property1", msg0.getProperty());
        assertEquals("errors1 8", "property2", msg1.getProperty());
        assertEquals("errors1 9", "property3", msg2.getProperty());
        assertEquals("errors1 10", "property5", msg3.getProperty());
        
        Object[] params0 = msg0.getParams();
        assertEquals("params0 0", 10, params0.length);  // 定義が11個あっても10個（最大値）だけ取得
        assertEquals("params0 1", "エラーParam:0", params0[0]);
        assertEquals("params0 2", "エラーParam:1", params0[1]);
        assertEquals("params0 3", "エラーParam:2", params0[2]);
        assertEquals("params0 4", "エラーParam:3", params0[3]);
        assertEquals("params0 5", "エラーParam:4", params0[4]);
        assertEquals("params0 6", "エラーParam:5", params0[5]);
        assertEquals("params0 7", "エラーParam:6", params0[6]);
        assertEquals("params0 8", "エラーParam:7", params0[7]);
        assertEquals("params0 9", "エラーParam:8", params0[8]);
        assertEquals("params0 10", "エラーParam:9", params0[9]);
    }
    
    /**
     * 1プロパティに複数エラー
     */
    @Test
    public void testErrors2() {
        ValidatorTestDomain testDomain = new ValidatorTestDomain();
        testDomain.setLocale(Locale.JAPANESE);
        
        Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
        testDomain.setProperty1("1000");
        testDomain.setProperty2("1000");
        boolean valid = validator.isValidateAllProperties("Errors2");
        
        assertFalse("check 1", valid);
        
        List<MessageDomain> errList = validator.getErrList();
        // 最初の１件だけ×2プロパティ分＝2件エラー
        assertEquals("check 2", 2, errList.size());
        
        // 優先順位の多いものから
        MessageDomain msg0 = errList.get(0);
        assertEquals("check 3", "GSCM-E0-0016", msg0.getKey());
        assertEquals("check 4", "property1", msg0.getProperty());
        MessageDomain msg1 = errList.get(1);
        assertEquals("check 5", "GSCM-E0-0026", msg1.getKey());
        assertEquals("check 6", "property2", msg1.getProperty());
    
    }
    
    /**
     * 1プロパティに複数エラー
     */
    @Test
    public void testNextErrorCheck() {
        ValidatorTestDomain testDomain = new ValidatorTestDomain();
        testDomain.setLocale(Locale.JAPANESE);
        
        Validator<ValidatorTestDomain> validator = new Validator<ValidatorTestDomain>(testDomain);
        testDomain.setProperty1("a");
        testDomain.setProperty2("a");
        testDomain.setProperty3("1000");
        boolean valid = validator.isValidateAllProperties("Errors3");
        
        assertFalse("check 1", valid);
        
        List<MessageDomain> errList = validator.getErrList();
        // 優先順位の多いものから
        MessageDomain msg0 = errList.get(0);
        assertEquals("check 3", "GSCM-E0-0017", msg0.getKey());
        assertEquals("check 4", "property1", msg0.getProperty());

        MessageDomain msg1 = errList.get(1);
        assertEquals("check 5", "GSCM-E0-0025", msg1.getKey());
        assertEquals("check 6", "property2", msg1.getProperty());
    
        MessageDomain msg2 = errList.get(2);
        assertEquals("check 7", "GSCM-E0-0026", msg2.getKey());
        assertEquals("check 8", "property3", msg2.getProperty());

        // 最初の１件だけ×3プロパティ分＝3件エラー
        assertEquals("check 2", 3, errList.size());
    }

    /**
     * デフォルトコンストラクタ呼出
     */
    @Test
    public void testDefaultConstructor() {
        new Validator<ValidatorTestDomain>();
    }
}