/*
 * PROJECT:GSCM共通フレームワーク
 *
 * CsvFileUtilTestクラス
 *
 * Version.
 * 1.0.0
 *
 * Copyright (c) 2013 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.gscm.framework.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Constructor;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import jp.co.dgic.testing.framework.DJUnitTestCase;

import org.apache.commons.io.IOUtils;
import org.junit.Test;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.ai.common.core.exception.SystemException;
import com.globaldenso.ai.library.csvlistconvert.CSVFormatException;
import com.globaldenso.ai.library.csvlistconvert.CsvListConversion;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;

/**
 * CSV出力文字列作成機能テストクラス。
 * <p>
 * CSV出力文字列作成機能をテストする。
 * </p>
 * ※仮想モックを利用し例外テストを実施しているので、Eclipse上で実行する際は、
 * プロジェクトのプロパティ⇒[djUnit]⇒[仮想モック・オブジェクト」タブの「仮想モック・オブジェクトを使用する」にチェックすること。
 * @author $Author: 400616000304 $
 * @version $Revision: 10885 $
 */
public class CommonUtilTest extends DJUnitTestCase {

    /**
     * デフォルトコンストラクタ。
     */
    public CommonUtilTest() {
        super();
    }

    /**
     * privateコンストラクタを呼び出す。
     * <p>カバレッジ100%対応</p>
     */
    @Test
    public void testPrivateConstructor() {
        try {
            Class<?> clazz = Class.forName("com.globaldenso.gscm.framework.util.CommonUtil");
            Constructor<?>[] constructor = clazz.getDeclaredConstructors();
            constructor[0].setAccessible(true);
            Object obj = constructor[0].newInstance();
            assertNotNull(obj);
        } catch (Exception e) {}
    }

    /**
     * getLocaleメソッドのテスト1
     */
    @Test
    public void testGetLocale1() {
        CopyPropertiesTest1Domain domain = new CopyPropertiesTest1Domain();
        domain.setLanguageCd("jp");
        Locale locale = CommonUtil.getLocale(domain);
        assertEquals(new Locale("jp"), locale);
    }

    /**
     * getLocaleメソッドのテスト2
     */
    @Test
    public void testGetLocale2() {
        CopyPropertiesTest1Domain domain = new CopyPropertiesTest1Domain();
        try {
            CommonUtil.getLocale(domain);
        } catch (SystemException e) {
            assertTrue(e.getCause() instanceof IllegalArgumentException);
        } catch (Exception e) {
            fail("想定外の例外");
        }
    }

    /**
     * addTabcodeメソッドのテスト。
     * <p>
     * タブコード付与フラグが"1"の場合、文字列の先頭にタブコードを付与する。
     * </p>
     */
    @Test
    public void testAddTabcode() {
        assertEquals("\t", CommonUtil.addTabcode("", "1"));
        assertEquals("", CommonUtil.addTabcode("", "0"));
        assertEquals("\thogehoge", CommonUtil.addTabcode("hogehoge", "1"));
        assertEquals("hogehoge", CommonUtil.addTabcode("hogehoge", "0"));
        assertEquals("\t11111", CommonUtil.addTabcode("11111", "1"));
        assertEquals("11111", CommonUtil.addTabcode("11111", "0"));

        // 異常系テスト
        assertNull(CommonUtil.addTabcode(null, null));
        assertEquals("aaa", CommonUtil.addTabcode("aaa", null));
        assertEquals(null, CommonUtil.addTabcode(null, "0"));
        assertEquals("\t", CommonUtil.addTabcode(null, "1"));

        // CommonUtil util = new CommonUtil();
        // assertNotNull(util);
    }

    /**
     * CSVの各項目先頭からタブ文字を削除するテスト prefix = null
     *
     * @throws IOException 例外
     * @throws FileNotFoundException 例外
     * @throws CSVFormatException 例外
     */
    @Test
    public void testRemoveTabCSVItem1() throws IOException, FileNotFoundException,
        CSVFormatException {

        // テストデータ準備
        String[] line1 = {"\t1-1", "\t1-2\t", "\t1\t-3", "\t\t1-4"};
        String[] line2 = {"2-1", ""};
        String[] line3 = {"\t3-1,", "\t3-2\""};
        List<List<String>> testData = new ArrayList<List<String>>();
        testData.add(Arrays.asList(line1));
        testData.add(Arrays.asList(line2));
        testData.add(Arrays.asList(line3));
        String csvData = CsvListConversion.getCsv(testData);

        CommonInfoDomain commonInfoDomain = new CommonInfoDomain();
        commonInfoDomain.setCharCd("UTF-8");

        // テスト用Stream準備
        PipedOutputStream outputStream = new PipedOutputStream();
        PrintWriter printWriter = new PrintWriter(outputStream);
        PipedInputStream inputStream = new PipedInputStream(outputStream);
        printWriter.print(csvData);
        printWriter.close();
        outputStream.close();

        // 実行
        InputStream removedInputStream = CommonUtil.removeTabCSVItem(inputStream,
            commonInfoDomain, null, null, null);
        try {
            assertNotNull("check 0", removedInputStream);
            // 全行読み込み
            String removedStr = IOUtils.toString(removedInputStream);
            List<List<String>> removedData = CsvListConversion.getList(removedStr);
            assertEquals("check 1", "1-1", removedData.get(0).get(0));
            assertEquals("check 2", "1-2\t", removedData.get(0).get(1));
            assertEquals("check 3", "1\t-3", removedData.get(0).get(2));
            assertEquals("check 4", "\t1-4", removedData.get(0).get(3));
            assertEquals("check 5", "2-1", removedData.get(1).get(0));
        } finally {
            inputStream.close();
            removedInputStream.close();
        }
    }

    /**
     * CSVの各項目先頭からタブ文字を削除するテスト prefix != null
     *
     * @throws IOException 例外
     * @throws FileNotFoundException 例外
     * @throws CSVFormatException 例外
     * @throws UnsupportedEncodingException 例外
     */
    @Test
    public void testRemoveTabCSVItem2() throws UnsupportedEncodingException, IOException,
        FileNotFoundException, CSVFormatException {
        // 添付ファイルディレクトリNULL

        // テストデータ準備
        String[] line1 = {"\tあ", "\tい", "\tう", "\tえ", "\tお"};
        String[] line2 = {"\tか", "\tき", "\tく", "\tけ", "\tこ"};
        String[] line3 = {"\tさ", "\tし", "\tす", "\tせ", "\tそ"};
        List<List<String>> testData = new ArrayList<List<String>>();
        testData.add(Arrays.asList(line1));
        testData.add(Arrays.asList(line2));
        testData.add(Arrays.asList(line3));
        String csvData = CsvListConversion.getCsv(testData);

        // テスト用ファイル
        File testFile = File.createTempFile("csv_test", null);
        testFile.deleteOnExit();
        BufferedWriter testWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(
            testFile), "Shift-JIS"));
        try {
            testWriter.write(csvData);
        } finally {
            testWriter.close();
        }
        InputStream testInput = new FileInputStream(testFile);

        CommonInfoDomain commonInfoDomain = new CommonInfoDomain();
        commonInfoDomain.setCharCd("Shift-JIS");

        // 実行
        InputStream removedInputStream = CommonUtil.removeTabCSVItem(testInput, commonInfoDomain,
            "csvtest", ".work", new File("."));
        try {
            assertNotNull("check 0", removedInputStream);
            // 全行読み込み
            String removedStr = IOUtils.toString(removedInputStream, "Shift-JIS");
            List<List<String>> removedData = CsvListConversion.getList(removedStr);
            assertEquals("check 1", "あ", removedData.get(0).get(0));
            assertEquals("check 2", "い", removedData.get(0).get(1));
            assertEquals("check 3", "う", removedData.get(0).get(2));
            assertEquals("check 4", "え", removedData.get(0).get(3));
            assertEquals("check 5", "お", removedData.get(0).get(4));
            assertEquals("check 6", "か", removedData.get(1).get(0));
            assertEquals("check 7", "き", removedData.get(1).get(1));
            assertEquals("check 8", "く", removedData.get(1).get(2));
            assertEquals("check 9", "け", removedData.get(1).get(3));
            assertEquals("check 10", "こ", removedData.get(1).get(4));
            assertEquals("check 11", "さ", removedData.get(2).get(0));
            assertEquals("check 12", "し", removedData.get(2).get(1));
            assertEquals("check 13", "す", removedData.get(2).get(2));
            assertEquals("check 14", "せ", removedData.get(2).get(3));
            assertEquals("check 15", "そ", removedData.get(2).get(4));
        } finally {
            testInput.close();
            removedInputStream.close();
        }

    }

    /**
     * エラーのテスト
     */
    @Test
    public void testRemoveTabCSVItem3() {

        CommonInfoDomain commonInfoDomain = new CommonInfoDomain();
        commonInfoDomain.setCharCd("UTF-8");

        Exception exception = null;
        try {
            CommonUtil.removeTabCSVItem(null, commonInfoDomain, "1", null, null);
            fail("exception 1");
        } catch (Exception e) {
            exception = e;
        }
        assertNotNull("exception 2", exception);

        try {
            CommonUtil.removeTabCSVItem(null, commonInfoDomain, null, null, null);
            fail("exception 1");
        } catch (Exception e) {
        }
        assertNotNull("exception 2", exception);

    }

    /**
     * CSV処理中に例外
     *
     * @throws IOException 例外
     * @throws FileNotFoundException 例外
     * @throws CSVFormatException 例外
     * @throws UnsupportedEncodingException 例外
     */
    @Test
    public void testRemoveTabCSVItem4() throws UnsupportedEncodingException, IOException,
        FileNotFoundException, CSVFormatException {

        CommonInfoDomain commonInfoDomain = new CommonInfoDomain();
        commonInfoDomain.setCharCd("UTF-8");

        // テスト用Stream準備
        PipedOutputStream outputStream = new PipedOutputStream();
        PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(outputStream, "UTF-8"));
        PipedInputStream inputStream = new PipedInputStream(outputStream);
        printWriter.print("\"aaaaaaaa,bbbb");
        printWriter.close();
        outputStream.close();

        // 実行
        Exception exception = null;
        try {
            CommonUtil.removeTabCSVItem(inputStream, commonInfoDomain, null, null, null);
            fail("exception 1");
        } catch (Exception e) {
            exception = e;
        }
        assertNotNull("exception 2", exception);

    }

    /**
     * convertDateFormatメソッドのテスト1。
     * ※対象メソッドをprivateに変更したため削除
     * <p>
     * [正常系]日付文字列の西暦年4桁、日付書式の西暦年4桁
     * </p>
     */
//    @Test
//    public void testConvertDateFormat1() {
//        assertEquals("2014/01/31", CommonUtil.convertDateFormat("2014/01/31", "yyyy/MM/dd"));
//        assertEquals("1914/01/31", CommonUtil.convertDateFormat("1914/01/31", "yyyy/MM/dd"));
//        assertEquals("2114/01/31", CommonUtil.convertDateFormat("2114/01/31", "yyyy/MM/dd"));
//        assertEquals("2014-01-31", CommonUtil.convertDateFormat("2014/01/31", "yyyy-MM-dd"));
//        assertEquals("01.31.2014", CommonUtil.convertDateFormat("01/31/2014", "MM.dd.yyyy"));
//        assertEquals("31-2014-01", CommonUtil.convertDateFormat("31.2014.01", "dd-yyyy-MM"));
//    }

    /**
     * convertDateFormatメソッドのテスト2。
     * ※対象メソッドをprivateに変更したため削除
     * <p>
     * [正常系]日付文字列の西暦年4桁、日付書式の西暦年2桁
     * </p>
     */
//    @Test
//    public void testConvertDateFormat2() {
//        assertEquals("14/01/31", CommonUtil.convertDateFormat("2014/01/31", "yy/MM/dd"));
//        assertEquals("14/01/31", CommonUtil.convertDateFormat("1914/01/31", "yy/MM/dd"));
//        assertEquals("14/01/31", CommonUtil.convertDateFormat("2114/01/31", "yy/MM/dd"));
//        assertEquals("14-01-31", CommonUtil.convertDateFormat("2014/01/31", "yy-MM-dd"));
//        assertEquals("01.31.14", CommonUtil.convertDateFormat("01/31/2014", "MM.dd.yy"));
//        assertEquals("31-14-01", CommonUtil.convertDateFormat("31.2014.01", "dd-yy-MM"));
//    }

    /**
     * convertDateFormatメソッドのテスト3。
     * ※対象メソッドをprivateに変更したため削除
     * <p>
     * [正常系]日付文字列の西暦年2桁、日付書式の西暦年4桁
     * </p>
     */
//    @Test
//    public void testConvertDateFormat3() {
//        assertEquals("2014/01/31", CommonUtil.convertDateFormat("14/01/31", "yyyy/MM/dd"));
//        assertEquals("2014-01-31", CommonUtil.convertDateFormat("14/01/31", "yyyy-MM-dd"));
//        assertEquals("01.31.2014", CommonUtil.convertDateFormat("01/31/14", "MM.dd.yyyy"));
//        assertEquals("31-2014-01", CommonUtil.convertDateFormat("31.14.01", "dd-yyyy-MM"));
//    }

    /**
     * convertDateFormatメソッドのテスト4。
     * ※対象メソッドをprivateに変更したため削除
     * <p>
     * [正常系]日付文字列の西暦年2桁、日付書式の西暦年2桁
     * </p>
     */
//    @Test
//    public void testConvertDateFormat4() {
//        assertEquals("14/01/31", CommonUtil.convertDateFormat("14/01/31", "yy/MM/dd"));
//        assertEquals("14-01-31", CommonUtil.convertDateFormat("14/01/31", "yy-MM-dd"));
//        assertEquals("01.31.14", CommonUtil.convertDateFormat("01/31/14", "MM.dd.yy"));
//        assertEquals("31-14-01", CommonUtil.convertDateFormat("31.14.01", "dd-yy-MM"));
//    }

    /**
     * convertDateFormatメソッドのテスト5。
     * ※対象メソッドをprivateに変更したため削除
     * <p>
     * [正常系]日付文字列の西暦年1桁、日付書式の西暦年4桁
     * </p>
     */
//    @Test
//    public void testConvertDateFormat5() {
//        assertEquals("2015/01/31", CommonUtil.convertDateFormat("5/01/31", "yyyy/MM/dd"));
//        assertEquals("2015-01-31", CommonUtil.convertDateFormat("5/01/31", "yyyy-MM-dd"));
//        assertEquals("01.31.2016", CommonUtil.convertDateFormat("01/31/6", "MM.dd.yyyy"));
//        assertEquals("31-2016-01", CommonUtil.convertDateFormat("31.6.01", "dd-yyyy-MM"));
//    }

    /**
     * convertDateFormatメソッドのテスト6。
     * ※対象メソッドをprivateに変更したため削除
     * <p>
     * [正常系]日付文字列の西暦年1桁、日付書式の西暦年2桁
     * </p>
     */
//    @Test
//    public void testConvertDateFormat6() {
//        assertEquals("15/01/31", CommonUtil.convertDateFormat("5/01/31", "yy/MM/dd"));
//        assertEquals("15-01-31", CommonUtil.convertDateFormat("5/01/31", "yy-MM-dd"));
//        assertEquals("01.31.16", CommonUtil.convertDateFormat("01/31/6", "MM.dd.yy"));
//        assertEquals("31-16-01", CommonUtil.convertDateFormat("31.6.01", "dd-yy-MM"));
//    }

    /**
     * convertDateFormatメソッドのテスト7。
     * ※対象メソッドをprivateに変更したため削除
     * <p>
     * [正常系]日付文字列の西暦年3桁、日付書式の西暦年4桁
     * </p>
     */
//    @Test
//    public void testConvertDateFormat7() {
//        assertEquals("2125/01/31", CommonUtil.convertDateFormat("125/01/31", "yyyy/MM/dd"));
//        assertEquals("2125-01-31", CommonUtil.convertDateFormat("125/01/31", "yyyy-MM-dd"));
//        assertEquals("01.31.2126", CommonUtil.convertDateFormat("01/31/126", "MM.dd.yyyy"));
//        assertEquals("31-2126-01", CommonUtil.convertDateFormat("31.126.01", "dd-yyyy-MM"));
//    }

    /**
     * convertDateFormatメソッドのテスト8。
     * ※対象メソッドをprivateに変更したため削除
     * <p>
     * [正常系]日付文字列の西暦年3桁、日付書式の西暦年2桁
     * </p>
     */
//    @Test
//    public void testConvertDateFormat8() {
//        assertEquals("25/01/31", CommonUtil.convertDateFormat("125/01/31", "yy/MM/dd"));
//        assertEquals("25-01-31", CommonUtil.convertDateFormat("125/01/31", "yy-MM-dd"));
//        assertEquals("01.31.26", CommonUtil.convertDateFormat("01/31/126", "MM.dd.yy"));
//        assertEquals("31-26-1", CommonUtil.convertDateFormat("31.126.01", "d-yy-M"));
//    }

    /**
     * convertDateFormatメソッドのテスト9。
     * ※対象メソッドをprivateに変更したため削除
     * <p>
     * [異常系]
     * </p>
     */
//    @Test
//    public void testConvertDateFormat9() {
//        assertEquals("", CommonUtil.convertDateFormat("", "yyyy/MM/dd"));
//        assertNull(CommonUtil.convertDateFormat(null, "yyyy/MM/dd"));
//        assertEquals("2014/01/31", CommonUtil.convertDateFormat("2014/01/31", ""));
//        assertEquals("2014/01/31", CommonUtil.convertDateFormat("2014/01/31", null));
//        assertEquals("20140131", CommonUtil.convertDateFormat("20140131", "yyyy/MM/dd"));
//        assertEquals("2014-01-31", CommonUtil.convertDateFormat("2014-01-31", "yyyyMMdd"));
//        assertEquals("01.31/2014", CommonUtil.convertDateFormat("01.31/2014", "MM.dd.yyyy"));
//        assertEquals("31.2014.01", CommonUtil.convertDateFormat("31.2014.01", "dd/yyyy-MM"));
//        assertEquals("14/01/31", CommonUtil.convertDateFormat("14/01/31", "MM/yy/dd"));
//        assertEquals("32/01/31", CommonUtil.convertDateFormat("32/01/31", "dd/MM/yy"));
//        assertEquals("aa/01/31", CommonUtil.convertDateFormat("aa/01/31", "yy/MM/dd"));
//        assertEquals("14/aa/31", CommonUtil.convertDateFormat("14/aa/31", "yy/MM/dd"));
//        assertEquals("14/01/aa", CommonUtil.convertDateFormat("14/01/aa", "yy/MM/dd"));
//        assertEquals("14/01/31 12:00:00", CommonUtil.convertDateFormat("14/01/31 12:00:00", "yyyy/MM/dd hh:mm:ss"));
//        assertEquals("2014=01=31", CommonUtil.convertDateFormat("2014=01=31", "yyyy/MM/dd"));
//        assertEquals("2014=01/31", CommonUtil.convertDateFormat("2014=01/31", "yyyy/MM/dd"));
//        assertEquals("14/01/31", CommonUtil.convertDateFormat("14/01/31", "yyyy=MM=dd"));
//        assertEquals("14/01/31", CommonUtil.convertDateFormat("14/01/31", "yyyy=MM.dd"));
//        assertEquals("14年01月31日", CommonUtil.convertDateFormat("14年01月31日", "yyyy年MM月dd日"));
//        assertEquals("2014/02/29", CommonUtil.convertDateFormat("2014/02/29", "yyyy/MM/dd"));
//        assertEquals("2014/13/01", CommonUtil.convertDateFormat("2014/13/01", "yyyy/MM/dd"));
//    }

    /**
     * copyPropertiesDomainToDomainメソッドのテスト1
     */
    @Test
    public void testCopyPropertiesDomainToDomain1() {
        CopyPropertiesTest1Domain orig = new CopyPropertiesTest1Domain();
        orig.setDateFormat("yyyy/MM/dd");
        orig.setDate1("2014/01/31");
        orig.setItem("Test1");
        orig.setNo(1);
        orig.setDecimal(new BigDecimal(500));
        CopyPropertiesTest2Domain dest = new CopyPropertiesTest2Domain();
        CommonUtil.copyPropertiesDomainToDomain(dest, orig);
        assertEquals("2014/01/31", new SimpleDateFormat("yyyy/MM/dd").format(dest.getDate1()));
        assertNull(dest.getDate2());
        assertEquals(dest.getItem(), orig.getItem());
    }

    /**
     * copyPropertiesDomainToDomainメソッドのテスト2
     */
    @Test
    public void testCopyPropertiesDomainToDomain2() {
        CopyPropertiesTest1Domain orig = new CopyPropertiesTest1Domain();
        orig.setDateFormat("yyyy/MM/dd");
        orig.setDate1("14/01/31");
        orig.setItem("Test2");
        orig.setList(Arrays.asList(new String[]{"1", "2", "3"}));
        CopyPropertiesTest2Domain dest = new CopyPropertiesTest2Domain();
        dest.setScreenId("screenId");
        CommonUtil.copyPropertiesDomainToDomain(dest, orig);
        assertEquals("0014/01/31", new SimpleDateFormat("yyyy/MM/dd").format(dest.getDate1()));
        assertNull(dest.getDate2());
        assertEquals(dest.getItem(), orig.getItem());
        assertEquals(dest.getList(), orig.getList());
    }

    /**
     * copyPropertiesDomainToDomainメソッドのテスト3
     */
    @Test
    public void testCopyPropertiesDomainToDomain3() {
        CopyPropertiesTest1Domain orig = new CopyPropertiesTest1Domain();
        orig.setDate1("2014/01/31");
        orig.setItem("Test1");
        orig.setNo(1);
        CopyPropertiesTest2Domain dest = new CopyPropertiesTest2Domain();
        CommonUtil.copyPropertiesDomainToDomain(dest, orig, "yyyy/MM/dd");
        assertEquals("2014/01/31", new SimpleDateFormat("yyyy/MM/dd").format(dest.getDate1()));
        assertNull(dest.getDate2());
        assertEquals(dest.getItem(), orig.getItem());
    }

    /**
     * copyPropertiesDomainToDomainメソッドのテスト4
     */
    @Test
    public void testCopyPropertiesDomainToDomain4() {
        CopyPropertiesTest1Domain orig = null;
        CopyPropertiesTest2Domain dest = new CopyPropertiesTest2Domain();
        try {
            CommonUtil.copyPropertiesDomainToDomain(dest, orig, "yyyy/MM/dd");
        } catch (IllegalArgumentException e) {
        } catch (Exception e) {
            fail("想定外の例外発生");
        }
        
        assertNull(dest.getDate1());
        assertNull(dest.getDate2());
    }
    
    /**
     * copyPropertiesDomainToDomainメソッドのテスト5
     * <p>例外テスト1</p>
     */
    @Test
    public void testCopyPropertiesDomainToDomain5() {
        addReturnValue("java.beans.PropertyDescriptor", "<init>", new java.beans.IntrospectionException("IntrospectionException"));
        CopyPropertiesTest1Domain orig = new CopyPropertiesTest1Domain();
        CopyPropertiesTest2Domain dest = new CopyPropertiesTest2Domain();
        try {
            CommonUtil.copyPropertiesDomainToDomain(dest, orig, "yyyy/MM/dd");
        } catch (Exception e) {
            fail("想定外の例外発生");
        }
    }

    /**
     * copyPropertiesDomainToDomainメソッドのテスト6
     * <p>例外テスト2</p>
     */
    @Test
    public void testCopyPropertiesDomainToDomain6() {
        addReturnValue("java.lang.reflect.Method", "invoke", new IllegalArgumentException("IllegalArgumentException"));
        CopyPropertiesTest1Domain orig = new CopyPropertiesTest1Domain();
        CopyPropertiesTest2Domain dest = new CopyPropertiesTest2Domain();
        try {
            CommonUtil.copyPropertiesDomainToDomain(dest, orig, "yyyy/MM/dd");
        } catch (Exception e) {
            fail("想定外の例外発生");
        }
    }

    /**
     * copyPropertiesDomainToDomainメソッドのテスト7
     * <p>例外テスト3</p>
     */
    @Test
    public void testCopyPropertiesDomainToDomain7() {
        addReturnValue("java.lang.reflect.Method", "invoke", new IllegalAccessException("IllegalAccessException"));
        CopyPropertiesTest1Domain orig = new CopyPropertiesTest1Domain();
        CopyPropertiesTest2Domain dest = new CopyPropertiesTest2Domain();
        try {
            CommonUtil.copyPropertiesDomainToDomain(dest, orig, "yyyy/MM/dd");
        } catch (Exception e) {
            fail("想定外の例外発生");
        }
    }

    /**
     * copyPropertiesDomainToDomainメソッドのテスト8
     * <p>例外テスト4</p>
     */
    @Test
    public void testCopyPropertiesDomainToDomain8() {
        addReturnValue("java.lang.reflect.Method", "invoke", new java.lang.reflect.InvocationTargetException(new Exception("")));
        CopyPropertiesTest1Domain orig = new CopyPropertiesTest1Domain();
        CopyPropertiesTest2Domain dest = new CopyPropertiesTest2Domain();
        try {
            CommonUtil.copyPropertiesDomainToDomain(dest, orig, "yyyy/MM/dd");
        } catch (Exception e) {
            fail("想定外の例外発生");
        }
    }

    /**
     * copyPropertiesDomainToDomainメソッドのテスト9
     * <p>例外テスト5</p>
     */
    @Test
    public void testCopyPropertiesDomainToDomain9() {
        addReturnValue("org.apache.commons.beanutils.BeanUtils", "cloneBean", new IllegalAccessException());
        CopyPropertiesTest1Domain orig = new CopyPropertiesTest1Domain();
        CopyPropertiesTest2Domain dest = new CopyPropertiesTest2Domain();
        try {
            CommonUtil.copyPropertiesDomainToDomain(dest, orig, "yyyy/MM/dd");
        } catch (SystemException e) {
            assertEquals("java.lang.IllegalAccessException", e.getMessage());
        } catch (Exception e) {
            fail("想定外の例外発生");
        }
    }

    /**
     * copyPropertiesDomainToDomainメソッドのテスト10
     * <p>例外テスト6</p>
     */
    @Test
    public void testCopyPropertiesDomainToDomain10() {
        addReturnValue("org.apache.commons.beanutils.BeanUtils", "copyProperties", new java.lang.reflect.InvocationTargetException(new Exception("")));
        CopyPropertiesTest1Domain orig = new CopyPropertiesTest1Domain();
        CopyPropertiesTest2Domain dest = new CopyPropertiesTest2Domain();
        try {
            CommonUtil.copyPropertiesDomainToDomain(dest, orig, "yyyy/MM/dd");
        } catch (SystemException e) {
            assertEquals("java.lang.reflect.InvocationTargetException", e.getMessage());
        } catch (Exception e) {
            fail("想定外の例外発生");
        }
    }

    /**
     * copyPropertiesDomainToDomainメソッドのテスト11
     * <p>例外テスト7</p>
     */
    @Test
    public void testCopyPropertiesDomainToDomain11() {
        addReturnValue("org.apache.commons.beanutils.BeanUtils", "cloneBean", new InstantiationException());
        CopyPropertiesTest1Domain orig = new CopyPropertiesTest1Domain();
        CopyPropertiesTest2Domain dest = new CopyPropertiesTest2Domain();
        try {
            CommonUtil.copyPropertiesDomainToDomain(dest, orig, "yyyy/MM/dd");
        } catch (SystemException e) {
            assertEquals("java.lang.InstantiationException", e.getMessage());
        } catch (Exception e) {
            fail("想定外の例外発生");
        }
    }
 
    /**
     * copyPropertiesDomainToDomainメソッドのテスト12
     * <p>例外テスト8</p>
     */
    @Test
    public void testCopyPropertiesDomainToDomain12() {
        addReturnValue("org.apache.commons.beanutils.BeanUtils", "cloneBean", new NoSuchMethodException());
        CopyPropertiesTest1Domain orig = new CopyPropertiesTest1Domain();
        CopyPropertiesTest2Domain dest = new CopyPropertiesTest2Domain();
        try {
            CommonUtil.copyPropertiesDomainToDomain(dest, orig, "yyyy/MM/dd");
        } catch (SystemException e) {
            assertEquals("java.lang.NoSuchMethodException", e.getMessage());
        } catch (Exception e) {
            fail("想定外の例外発生");
        }
    }

    /**
     * copyPropertiesDomainToDomainメソッドのテスト13
     * @throws ParseException ParseException
     */
    @Test
    public void testCopyPropertiesDomainToDomain13() throws ParseException {
        CopyPropertiesTest2Domain orig = new CopyPropertiesTest2Domain();
        orig.setDateFormat("yyyy/MM/dd");
        orig.setDate1(new SimpleDateFormat("yyyy/MM/dd").parse("2014/01/31"));
        orig.setItem("Test1");
        CopyPropertiesTest1Domain dest = new CopyPropertiesTest1Domain();
        CommonUtil.copyPropertiesDomainToDomain(dest, orig);
        assertEquals("2014/01/31", dest.getDate1());
        assertNull(dest.getDate2());
        assertEquals(dest.getItem(), orig.getItem());
    }

     /**
     * copyPropertiesDomainToDomainメソッドのテスト14
     * @throws ParseException ParseException
     */
    @Test
    public void testCopyPropertiesDomainToDomain14() throws ParseException {
        CopyPropertiesTest2Domain orig = new CopyPropertiesTest2Domain();
        orig.setDate1(new SimpleDateFormat("yyyy/MM/dd hh:mm:ss").parse("2014/01/31 12:30:40"));
        orig.setItem("Test1");
        CopyPropertiesTest1Domain dest = new CopyPropertiesTest1Domain();
        CommonUtil.copyPropertiesDomainToDomain(dest, orig, "yyyy/MM/dd hh:mm:ss");
        assertEquals("2014/01/31 12:30:40", dest.getDate1());
        assertNull(dest.getDate2());
        assertEquals(dest.getItem(), orig.getItem());
    }

    /**
     * copyPropertiesDomainToDomainメソッドのテスト15
     */
    @Test
    public void testCopyPropertiesDomainToDomain15() {
        CopyPropertiesTest1Domain orig = new CopyPropertiesTest1Domain();
        orig.setDate1("2014/01/31 12:30:40");
        CopyPropertiesTest2Domain dest = new CopyPropertiesTest2Domain();
        CommonUtil.copyPropertiesDomainToDomain(dest, orig, "yyyy/MM/dd hh:mm:ss");
        assertEquals("2014/01/31 12:30:40", new SimpleDateFormat("yyyy/MM/dd hh:mm:ss").format(dest.getDate1()));

    }

    /**
     * copyPropertiesActionFormToActionFormメソッドのテスト1
     */
    @Test
    public void testCopyPropertiesActionFormToActionForm1() {
        createWindowInfo();
        CopyPropertiesTest1ActionForm orig = new CopyPropertiesTest1ActionForm();
        orig.setDate1("2014/01/31");
        orig.setItem("Test");
        orig.setWindowId("gscmwin0");
        orig.setTestDate(new java.util.Date());
        CopyPropertiesTest2ActionForm dest = new CopyPropertiesTest2ActionForm();
        
        CommonUtil.copyPropertiesActionFormToActionForm(dest, orig);
        assertEquals("2014/01/31", new SimpleDateFormat("yyyy/MM/dd").format(dest.getDate1()));
        assertNull(dest.getDate2());
        assertEquals(dest.getItem(), orig.getItem());
    }

    /**
     * copyPropertiesActionFormToActionFormメソッドのテスト2
     */
    @Test
    public void testCopyPropertiesActionFormToActionForm2() {
        createWindowInfo();
        CopyPropertiesTest1ActionForm orig = new CopyPropertiesTest1ActionForm();
        orig.setDate1("14/01/31");
        orig.setDate2("2014/10/30");
        orig.setItem("Test");
        orig.setWindowId("gscmwin0");
        CopyPropertiesTest2ActionForm dest = new CopyPropertiesTest2ActionForm();
        dest.setScreenId("W9999");
        CommonUtil.copyPropertiesActionFormToActionForm(dest, orig);
        assertEquals("0014/01/31", new SimpleDateFormat("yyyy/MM/dd").format(dest.getDate1()));
        assertEquals("2014/10/30", new SimpleDateFormat("yyyy/MM/dd").format(dest.getDate2()));
        assertEquals(dest.getItem(), orig.getItem());
    }

    /**
     * copyPropertiesDomainToActionFormメソッドのテスト1
     */
    @Test
    public void testCopyPropertiesDomainToActionForm1() {
        CopyPropertiesTest1Domain orig = new CopyPropertiesTest1Domain();
        orig.setDateFormat("yyyy/MM/dd");
        orig.setDate1("14/01/31");
        orig.setItem("Test2");
        orig.setList(Arrays.asList(new String[]{"1", "2", "3"}));
        CopyPropertiesTest2ActionForm dest = new CopyPropertiesTest2ActionForm();
        
        CommonUtil.copyPropertiesDomainToActionForm(dest, orig);
        assertEquals("0014/01/31", new SimpleDateFormat("yyyy/MM/dd").format(dest.getDate1()));
        assertNull(dest.getDate2());
        assertEquals(dest.getItem(), orig.getItem());
        assertEquals(dest.getList(), orig.getList());
    }

    /**
     * copyPropertiesDomainToActionFormメソッドのテスト2
     */
    @Test
    public void testCopyPropertiesDomainToActionForm2() {
        CopyPropertiesTest1Domain orig = new CopyPropertiesTest1Domain();
        orig.setDateFormat("yyyy/MM/dd");
        orig.setDate1("14/01/31");
        orig.setItem("Test2");
        orig.setList(Arrays.asList(new String[]{"1", "2", "3"}));
        CopyPropertiesTest2ActionForm dest = new CopyPropertiesTest2ActionForm();
        dest.setScreenId("W9999");
        CommonUtil.copyPropertiesDomainToActionForm(dest, orig);
        assertEquals("0014/01/31", new SimpleDateFormat("yyyy/MM/dd").format(dest.getDate1()));
        assertNull(dest.getDate2());
        assertEquals(dest.getItem(), orig.getItem());
        assertEquals(dest.getList(), orig.getList());
        assertEquals("W9999", dest.getScreenId());
    }

    /**
     * copyPropertiesActionFormToDomainメソッドのテスト1
     */
    @Test
    public void testCopyPropertiesActionFormToDomain1() {
        createWindowInfo();
        CopyPropertiesTest1ActionForm orig = new CopyPropertiesTest1ActionForm();
        orig.setDate1("2014/01/31");
        orig.setItem("Test");
        orig.setWindowId("gscmwin0");
        CopyPropertiesTest2Domain dest = new CopyPropertiesTest2Domain();
        
        CommonUtil.copyPropertiesActionFormToDomain(dest, orig);
        assertEquals("2014/01/31", new SimpleDateFormat("yyyy/MM/dd").format(dest.getDate1()));
        assertNull(dest.getDate2());
        assertEquals(dest.getItem(), orig.getItem());
    }

    /**
     * copyPropertiesActionFormToDomainメソッドのテスト2
     */
    @Test
    public void testCopyPropertiesActionFormToDomain2() {
        createWindowInfo();
        CopyPropertiesTest1ActionForm orig = new CopyPropertiesTest1ActionForm();
        orig.setDate1("14/01/31");
        orig.setItem("Test");
        orig.setWindowId("gscmwin0");
        CopyPropertiesTest2Domain dest = new CopyPropertiesTest2Domain();
        dest.setScreenId("W9999");
        CommonUtil.copyPropertiesActionFormToDomain(dest, orig);
        assertEquals("0014/01/31", new SimpleDateFormat("yyyy/MM/dd").format(dest.getDate1()));
        assertNull(dest.getDate2());
        assertEquals(dest.getItem(), orig.getItem());
        assertEquals("W9999", dest.getScreenId());
    }
    
    /**
     * copyPropertiesメソッドのテスト1
     * <p>
     * String⇒Date(西暦4桁指定)
     * </p>
     */
    @Test
    public void testCopyProperties1() {
        CopyPropertiesTest1Domain orig = new CopyPropertiesTest1Domain();
        CopyPropertiesTest2Domain dest = new CopyPropertiesTest2Domain();
        try {
            orig.setDate1("2034/05/26");
            CommonUtil.copyProperties(dest, orig, "yyyy/MM/dd");
            assertEquals("1-1", new SimpleDateFormat("yyyy/MM/dd").parse("2034/05/26"), dest.getDate1());
            orig.setDate1("2014-05-26");
            CommonUtil.copyProperties(dest, orig, "yyyy-MM-dd");
            assertEquals("1-2", new SimpleDateFormat("yyyy/MM/dd").parse("2014/05/26"), dest.getDate1());
            orig.setDate1("26.05.2014");
            CommonUtil.copyProperties(dest, orig, "dd.MM.yyyy");
            assertEquals("1-3", new SimpleDateFormat("yyyy/MM/dd").parse("2014/05/26"), dest.getDate1());
            orig.setDate1("20140526");
            CommonUtil.copyProperties(dest, orig, "yyyyMMdd");
            assertEquals("1-4", new SimpleDateFormat("yyyy/MM/dd").parse("2014/05/26"), dest.getDate1());
        } catch (ParseException e) {
            fail("ERROR");
        }
    }

    /**
     * copyPropertiesメソッドのテスト2
     * <p>
     * String⇒Date(西暦2桁指定)
     * </p>
     */
    @Test
    public void testCopyProperties2() {

        CopyPropertiesTest1Domain orig = new CopyPropertiesTest1Domain();
        CopyPropertiesTest2Domain dest = new CopyPropertiesTest2Domain();
        try {
            Date resultDate1 = new SimpleDateFormat("yyyy/MM/dd").parse("2034/05/26");
            Date resultDate2 = new SimpleDateFormat("yyyy/MM/dd").parse("2014/05/26");

            orig.setDate1("26/05/34");
            CommonUtil.copyProperties(dest, orig, "dd/MM/yy");
            assertEquals("2-1", resultDate1, dest.getDate1());
            orig.setDate1("14-05-26");
            CommonUtil.copyProperties(dest, orig, "yy-MM-dd");
            assertEquals("2-2", resultDate2, dest.getDate1());
            orig.setDate1("05.26.14");
            CommonUtil.copyProperties(dest, orig, "MM.dd.yy");
            assertEquals("2-3", resultDate2, dest.getDate1());
            orig.setDate1("260514");
            CommonUtil.copyProperties(dest, orig, "ddMMyy");
            assertEquals("2-4", resultDate2, dest.getDate1());
        } catch (ParseException e) {
            fail("ERROR");
        }
    }

    /**
     * copyPropertiesメソッドのテスト3
     * <p>
     * String⇒Date(西暦2、4桁以外指定)
     * </p>
     */
    @Test
    public void testCopyProperties3() {
        
        CopyPropertiesTest1Domain orig = new CopyPropertiesTest1Domain();
        CopyPropertiesTest2Domain dest = new CopyPropertiesTest2Domain();
        try {
            orig.setDate1("4/05/26");
            CommonUtil.copyProperties(dest, orig, "y/MM/dd");
            assertEquals("3-1", new SimpleDateFormat("yyyy/MM/dd").parse("0004/05/26"), dest.getDate1());
            orig.setDate1("014/05/26");
            CommonUtil.copyProperties(dest, orig, "yyy/MM/dd");
            assertEquals("3-2", new SimpleDateFormat("yyyy/MM/dd").parse("0014/05/26"), dest.getDate1());
        } catch (Exception e) {
            fail("ERROR");
        }
    }
    

    /**
     * copyPropertiesメソッドのテスト4
     * <p>
     * String⇒Date(西暦2桁指定[西暦4桁変換])
     * </p>
     */
    @Test
    public void testCopyProperties4() {
        // 現在日取得
        Calendar now = Calendar.getInstance();
        int year = now.get(Calendar.YEAR);
        int month = now.get(Calendar.MONTH) + 1;
        int date = now.get(Calendar.DATE);

        CopyPropertiesTest1Domain orig = new CopyPropertiesTest1Domain();
        CopyPropertiesTest2Domain dest = new CopyPropertiesTest2Domain();
        try {
            Date resultDate1 = new SimpleDateFormat("yyyy/MM/dd").parse((year + 20) + "/" + String.format("%02d", month) + "/" + date);
            Date resultDate2 = new SimpleDateFormat("yyyy/MM/dd").parse((year - 80) + "/" + String.format("%02d", month) + "/" + (date + 1));

            orig.setDate1(String.valueOf(year + 20).substring(2, 4) + "/" + String.format("%02d", month) + "/" + date);
            CommonUtil.copyProperties(dest, orig, "yy/MM/dd");
            assertEquals("4-0", resultDate1, dest.getDate1());
            orig.setDate1(String.valueOf(year + 20).substring(2, 4) + "/" + String.format("%02d", month) + "/" + (date + 1));
            CommonUtil.copyProperties(dest, orig, "yy/MM/dd");
            assertEquals("4-1", resultDate2, dest.getDate1());
            orig.setDate1("99/12/31");
            CommonUtil.copyProperties(dest, orig, "yy/MM/dd");
            assertEquals("4-2", new SimpleDateFormat("yyyy/MM/dd").parse("1999/12/31"), dest.getDate1());
        } catch (ParseException e) {
            fail("ERROR");
        }
    }

    
    /**
     * copyPropertiesメソッドのテスト6
     * <p>
     * String⇒Date(未指定)
     * </p>
     */
    @Test
    public void testCopyProperties6() {
        CopyPropertiesTest1Domain orig = new CopyPropertiesTest1Domain();
        CopyPropertiesTest2Domain dest = new CopyPropertiesTest2Domain();
        try {
            orig.setDate1(null);
            orig.setDate2("");
            CommonUtil.copyProperties(dest, orig, "yy/MM/dd");
            assertNull("6-1", dest.getDate1());
            assertNull("6-2", dest.getDate2());
            orig.setDate1("14/05/26");
            CommonUtil.copyProperties(dest, orig, null);
            assertNull("6-3", dest.getDate1());
            CommonUtil.copyProperties(dest, orig, "");
            assertNull("6-4", dest.getDate1());
        } catch (Exception e) {
            fail("ERROR");
        }
    }
    
    /**
     * copyPropertiesメソッドのテスト7
     * <p>
     * String⇒Date(不正な指定)
     * </p>
     */
    @Test
    public void testCopyProperties7() {
        CopyPropertiesTest1Domain orig = new CopyPropertiesTest1Domain();
        CopyPropertiesTest2Domain dest = new CopyPropertiesTest2Domain();
        try {
            // 区切り文字違い
            orig.setDate1("2014/05/26");
            CommonUtil.copyProperties(dest, orig, "yyyy-MM-dd");
            assertNull("7-1", dest.getDate1());
            // 西暦の桁違い
            orig.setDate1("14/05/26");
            CommonUtil.copyProperties(dest, orig, "yyyy/MM/dd");
            assertEquals("7-2", new SimpleDateFormat("yyyy/MM/dd").parse("0014/05/26"), dest.getDate1());
            orig.setDate1("3014/05/26");
            CommonUtil.copyProperties(dest, orig, "yy/MM/dd");
            assertEquals("7-3", new SimpleDateFormat("yyyy/MM/dd").parse("3014/05/26"), dest.getDate1());
            // 不正な日付指定
            orig.setDate1("aa/05/26");
            CommonUtil.copyProperties(dest, orig, "yy/MM/dd");
            assertNull("7-4", dest.getDate1());
            // 年月日位置違い
            orig.setDate1("01/01/2014");
            CommonUtil.copyProperties(dest, orig, "yyyy/MM/dd");
            assertNull("7-5", dest.getDate1());
            orig.setDate1("2014/01/01");
            CommonUtil.copyProperties(dest, orig, "yy/MM/dd hh:mm:ss");
            assertNull("7-6", dest.getDate1());
            orig.setDate1("2014/01/01");
            CommonUtil.copyProperties(dest, orig, "aaaa/bb/cc");
            assertNull("7-7", dest.getDate1());
            
        } catch (Exception e) {
            fail("ERROR");
        }
    }
    
    /**
     * copyPropertiesメソッドのテスト8
     * <p>
     * Date⇒String(西暦4桁指定)
     * </p>
     */
    @Test
    public void testCopyProperties8() {
        CopyPropertiesTest2Domain orig = new CopyPropertiesTest2Domain();
        CopyPropertiesTest1Domain dest = new CopyPropertiesTest1Domain();
        try {
            orig.setDate1(new SimpleDateFormat("yyyy/MM/dd").parse("2034/05/26"));
            CommonUtil.copyProperties(dest, orig, "yyyy/MM/dd");
            assertEquals("8-1", "2034/05/26", dest.getDate1());
            orig.setDate1(new SimpleDateFormat("yyyy/MM/dd").parse("2014/05/26"));
            CommonUtil.copyProperties(dest, orig, "yyyy-MM-dd");
            assertEquals("8-2", "2014-05-26", dest.getDate1());
            orig.setDate1(new SimpleDateFormat("yyyy/MM/dd").parse("2014/05/26"));
            CommonUtil.copyProperties(dest, orig, "dd.MM.yyyy");
            assertEquals("8-3", "26.05.2014", dest.getDate1());
            orig.setDate1(new SimpleDateFormat("yyyy/MM/dd").parse("2014/05/26"));
            CommonUtil.copyProperties(dest, orig, "yyyyMMdd");
            assertEquals("8-4", "20140526", dest.getDate1());
        } catch (Exception e) {
            fail("ERROR");
        }
    }

    /**
     * copyPropertiesメソッドのテスト9
     * <p>
     * Date⇒String(西暦2桁指定)
     * </p>
     */
    @Test
    public void testCopyProperties9() {
        CopyPropertiesTest2Domain orig = new CopyPropertiesTest2Domain();
        CopyPropertiesTest1Domain dest = new CopyPropertiesTest1Domain();
        try {
            Date date1 = new SimpleDateFormat("yyyy/MM/dd").parse("3034/05/26");
            Date date2 = new SimpleDateFormat("yyyy/MM/dd").parse("1999/05/26");
            Date date3 = new SimpleDateFormat("yyyy/MM/dd").parse("2014/05/26");

            orig.setDate1(date1);
            CommonUtil.copyProperties(dest, orig, "dd/MM/yy");
            assertEquals("9-1", "26/05/34", dest.getDate1());
            orig.setDate1(date2);
            CommonUtil.copyProperties(dest, orig, "yy-MM-dd");
            assertEquals("9-2", "99-05-26", dest.getDate1());
            orig.setDate1(date3);
            CommonUtil.copyProperties(dest, orig, "MM.dd.yy");
            assertEquals("9-3", "05.26.14", dest.getDate1());
            orig.setDate1(date3);
            CommonUtil.copyProperties(dest, orig, "ddMMyy");
            assertEquals("9-4", "260514", dest.getDate1());
        } catch (ParseException e) {
            fail("ERROR");
        }
    }

    
    /**
     * copyPropertiesメソッドのテスト10
     * <p>
     * Date⇒String(未指定)
     * </p>
     */
    @Test
    public void testCopyProperties10() {
        CopyPropertiesTest2Domain orig = new CopyPropertiesTest2Domain();
        CopyPropertiesTest1Domain dest = new CopyPropertiesTest1Domain();
        try {
            orig.setDate1(null);
            CommonUtil.copyProperties(dest, orig, "yy/MM/dd");
            assertNull("10-1", dest.getDate1());
            orig.setDate1(new SimpleDateFormat("yyyy/MM/dd").parse("2014/05/26"));
            CommonUtil.copyProperties(dest, orig, null);
            assertNull("10-2", dest.getDate1());
            orig.setDate1(new SimpleDateFormat("yyyy/MM/dd").parse("2014/05/26"));
            CommonUtil.copyProperties(dest, orig, "");
            assertEquals("10-3", "", dest.getDate1());
        } catch (Exception e) {
            fail("ERROR");
        }
    }
    
    
    /**
     * copyPropertiesメソッドのテスト11
     * <p>
     * Date⇒String(不正な指定])
     * </p>
     */
    @Test
    public void testCopyProperties11() {
        CopyPropertiesTest2Domain orig = new CopyPropertiesTest2Domain();
        CopyPropertiesTest1Domain dest = new CopyPropertiesTest1Domain();
        try {
            Date date1 = new SimpleDateFormat("yyyy/MM/dd").parse("2014/01/01");
            
            orig.setDate1(date1);
            CommonUtil.copyProperties(dest, orig, "yyyy/MM/dd HH:mm:ss");
            assertEquals("11-1", "2014/01/01 00:00:00", dest.getDate1());
            orig.setDate1(date1);
            CommonUtil.copyProperties(dest, orig, "aaaa/bb/cc");
            assertNull("11-2", dest.getDate1());
            
        } catch (Exception e) {
            fail("ERROR");
        }
    }
    
    /**
     * copyPropertiesメソッドのテスト12
     * <p>
     * String型からString型へのコピー
     * </p>
     */
    @Test
    public void testCopyProperties12() {
        CopyPropertiesTest1Domain orig = new CopyPropertiesTest1Domain();
        CopyPropertiesTest1Domain dest = new CopyPropertiesTest1Domain();
        try {
            orig.setDate1("34/05/27");
            CommonUtil.copyProperties(dest, orig, "yy/MM/dd");
            assertEquals("12-1", "34/05/27", dest.getDate1());
        } catch (Exception e) {
            fail("ERROR");
        }
    }
    
    /**
     * DensoContextへウィンドウ情報を設定する。
     */
    private void createWindowInfo() {
        // DensoContext準備
        DensoContext context = DensoContext.get();
        CommonInfoDomain commonInfoDomain = new CommonInfoDomain();
        commonInfoDomain.setDateFormat("yyyy/MM/dd");
        WindowInfoDomain windowInfoDomain = new WindowInfoDomain();
        windowInfoDomain.setCommonInfo(commonInfoDomain);
        context.putGeneralArea("gscmwin0", windowInfoDomain);
    }
}
