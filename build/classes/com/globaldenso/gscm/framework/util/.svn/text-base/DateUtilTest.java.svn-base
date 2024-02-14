/*
 * PROJECT:GSCM共通フレームワーク
 * 
 * SaveLimitTermUtilTestクラス
 * 
 * Version.
 * 1.0.0
 * 
 * Copyright (c) 2013 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.gscm.framework.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * DateUtilテストクラス。
 * <p>
 * DateUtilをテストする。
 * </p>
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class DateUtilTest {

    /**
     * デフォルトコンストラクタ。
     */
    public DateUtilTest() {
        super();
    }

    /**
     * calcDateメソッドのテストメソッド。
     * <p>
     * calcDateメソッドのテストメソッド。
     * </p>
     * 
     * @throws Exception 例外
     */
    @Test
    public void testCalcDate() throws Exception {
        // 現在(2013/6/21)
        Calendar fromDate = Calendar.getInstance();
        fromDate.set(2013, 6 - 1, 21);
        Class<DateUtil> c = DateUtil.class;

        // メソッド取得（メソッド名を文字列として指定）
        // 引数がある場合は第二引数に指定
        Method m = c.getDeclaredMethod("getSaveLimitTerm", new Class[] {String.class, String.class,
            Calendar.class});

        // Privateメソッドの場合、以下の設定が必要
        m.setAccessible(true);
        // 1日後
        assertEquals(1, (Number)m.invoke(null, "1", "2013/06/22", fromDate));
        // 2日後
        assertEquals(2, (Number)m.invoke(null, "1", "2013/06/23", fromDate));
        // 3日後
        assertEquals(3, (Number)m.invoke(null, "1", "2013/06/24", fromDate));
        // 33日間
        assertEquals(33, (Number)m.invoke(null, "2", "33", fromDate));

        // 1ヵ月後
        assertEquals(30, (Number)m.invoke(null, "3", "1", fromDate));

        // 2年後
        assertEquals(730, (Number)m.invoke(null, "4", "2", fromDate));

        // 永年→2917020日間
        assertEquals(2917019, (Number)m.invoke(null, "5", null, fromDate));

        // エラー
        assertNull((Number)m.invoke(null, "6", null, fromDate));

        // エラー
        assertNull((Number)m.invoke(null, "1", "hoge", fromDate));

        // DateUtil obj = new DateUtil();
        // assertNotNull(obj);

        assertEquals(22, DateUtil.getSaveLimitTerm("2", "22"));

    }

    /**
     * getWorkDateメソッドのテストメソッド。
     * <p>
     * getWorkDateメソッドのテストメソッド。
     * </p>
     * 
     * @throws Exception 例外
     */
    @Test
    public void testGetWorkDate() throws Exception {
        // CopyServiceを取得
        new ClassPathXmlApplicationContext(new String[] {"WEB-INF/applicationContext-aij2-aop.xml",
            "WEB-INF/applicationContext-aij2-jdbc.xml", "WEB-INF/applicationContext-aij2.xml",
            "WEB-INF/applicationContext-library.xml"});
        String id = "A002";
        String ownerComp = "DNJP";
        String optId = "";

        assertEquals("20130412", DateUtil.getWorkDate(id, ownerComp, optId));

        id = "A001";
        ownerComp = "DNJP";
        optId = "";

        assertEquals("20130411", DateUtil.getWorkDate(id, ownerComp, optId));

        id = "A001";
        ownerComp = "DNEN";
        optId = "";

        assertEquals("20130413", DateUtil.getWorkDate(id, ownerComp, optId));

        id = "A001";
        ownerComp = "DNEN";
        optId = "xxxx";

        assertNull(DateUtil.getWorkDate(id, ownerComp, optId));
    }

    /**
     * isDateメソッドのテストメソッド。
     * <p>
     * isDateメソッドのテストメソッド。
     * </p>
     * 
     * @throws Exception 例外
     */
    @Test
    public void testIsDate() throws Exception {

        String input = null;
        String[] dateFormat = null;

        input = "2013/6/26";
        dateFormat = new String[1];
        dateFormat[0] = "yyyy/M/d";
        assertEquals(true, DateUtil.isDate(input, dateFormat));

        // 13月はNG
        input = "2013/13/26";
        dateFormat = new String[1];
        dateFormat[0] = "yyyy/M/d";
        assertEquals(false, DateUtil.isDate(input, dateFormat));

        // 32日はNG
        input = "2013/12/32";
        dateFormat = new String[1];
        dateFormat[0] = "yyyy/M/d";
        assertEquals(false, DateUtil.isDate(input, dateFormat));

        // 年の省略(2桁)
        input = "13/6/26";
        dateFormat = new String[1];
        dateFormat[0] = "yy/M/d";
        assertEquals(true, DateUtil.isDate(input, dateFormat));

        // mdy
        input = "6/26/2013";
        dateFormat = new String[1];
        dateFormat[0] = "M/d/yyyy";
        assertEquals(true, DateUtil.isDate(input, dateFormat));

        // dmy
        input = "26/6/2013";
        dateFormat = new String[1];
        dateFormat[0] = "d/M/yyyy";
        assertEquals(true, DateUtil.isDate(input, dateFormat));

        // dmy(ハイフン)
        input = "26-6-2013";
        dateFormat = new String[1];
        dateFormat[0] = "d-M-yyyy";
        assertEquals(true, DateUtil.isDate(input, dateFormat));

        // dmy(ハイフンとスラッシュ)
        input = "26-6-2013";
        dateFormat = new String[2];
        dateFormat[0] = "d/M/yyyy";
        dateFormat[1] = "d-M-yyyy";
        assertEquals(true, DateUtil.isDate(input, dateFormat));

        // dmy(ハイフンとスラッシュ不一致)
        input = "26-6-2013";
        dateFormat = new String[1];
        dateFormat[0] = "d/M/yyyy";
        assertEquals(false, DateUtil.isDate(input, dateFormat));

        // dmy(うるう年NG)
        input = "29.02.2013";
        dateFormat = new String[1];
        dateFormat[0] = "dd.MM.yyyy";
        assertEquals(false, DateUtil.isDate(input, dateFormat));

        // dmy(うるう年OK)
        input = "29.02.2012";
        dateFormat = new String[1];
        dateFormat[0] = "dd.MM.yyyy";
        assertEquals(true, DateUtil.isDate(input, dateFormat));

        // 区切りなし
        input = "29022012";
        dateFormat = new String[1];
        dateFormat[0] = "ddMMyyyy";
        assertEquals(true, DateUtil.isDate(input, dateFormat));

        // 0なし
        input = "3/1/02";
        dateFormat = new String[1];
        dateFormat[0] = "d/M/yy";
        assertEquals(true, DateUtil.isDate(input, dateFormat));

        // 組み合わせ
        input = "20130626";
        dateFormat = new String[4];
        dateFormat[0] = "yyyy/MM/dd";
        dateFormat[1] = "yyyy-MM-dd";
        dateFormat[2] = "yyyy.MM.dd";
        dateFormat[3] = "yyyyMMdd";
        assertEquals(true, DateUtil.isDate(input, dateFormat));

        // エラー
        input = "2013/06/2q";
        dateFormat = new String[1];
        dateFormat[0] = "yyyy/MM/dd";
        assertEquals(false, DateUtil.isDate(input, dateFormat));

    }

    /**
     * formatDateメソッドのテストメソッド。
     * <p>
     * formatDateメソッドのテストメソッド。
     * </p>
     * 
     * @throws Exception 例外
     */
    @Test
    public void testFormatDate() throws Exception {
        // CopyServiceを取得
        new ClassPathXmlApplicationContext(new String[] {"WEB-INF/applicationContext-aij2-aop.xml",
            "WEB-INF/applicationContext-aij2-jdbc.xml", "WEB-INF/applicationContext-aij2.xml",
            "WEB-INF/applicationContext-library.xml"});

        Calendar cal = Calendar.getInstance();
        cal.set(2013, 6 - 1, 26);
        Date date = cal.getTime();
        ResourcesFactory.setFactoryClass(ResourcesFactory.class.getName());
        ResourcesFactory.createFactory().createResources("MessageResources");

        assertEquals("2013/06/26", DateUtil.formatDate(date, new Locale("ja", "JP", "")));
        assertEquals("26-06-2013", DateUtil.formatDate(date, new Locale("en", "US", "")));

        // 存在しないロケールを設定→jaになる
        assertEquals("2013/06/26", DateUtil.formatDate(date, new Locale("zh", "CN", "")));
    }

    /**
     * convertTimeメソッドのテストメソッド。
     * <p>
     * convertTimeメソッドのテストメソッド。
     * </p>
     * 
     * @throws Exception 例外
     */
    @Test
    public void testConvertTime() throws Exception {
        // CopyServiceを取得
        new ClassPathXmlApplicationContext(new String[] {"WEB-INF/applicationContext-aij2-aop.xml",
            "WEB-INF/applicationContext-aij2-jdbc.xml", "WEB-INF/applicationContext-aij2.xml",
            "WEB-INF/applicationContext-library.xml"});

        Calendar cal = Calendar.getInstance();
        cal.set(2013, 7 - 1, 18, 13, 41);
        Date date = cal.getTime();

        String jst = "0000000002";

        // GMT→JSTに変換
        Date ret = DateUtil.convertTime(date, jst);
        Calendar cal1 = Calendar.getInstance();
        cal1.setTime(ret);
        assertEquals(2013, cal1.get(Calendar.YEAR));
        assertEquals(6, cal1.get(Calendar.MONTH));
        assertEquals(18, cal1.get(Calendar.DAY_OF_MONTH));
        assertEquals(22, cal1.get(Calendar.HOUR_OF_DAY));
        assertEquals(41, cal1.get(Calendar.MINUTE));

        // 存在しないタイムゾーンを指定→エラー
        ret = DateUtil.convertTime(date, "hogehoge");
        assertNull(ret);

        cal.set(2013, 12 - 1, 31, 15, 41);
        date = cal.getTime();

        // GMT→JSTに変換後日付変更
        ret = DateUtil.convertTime(date, jst);
        Calendar cal2 = Calendar.getInstance();
        cal2.setTime(ret);
        assertEquals(2014, cal2.get(Calendar.YEAR));
        assertEquals(0, cal2.get(Calendar.MONTH));
        assertEquals(1, cal2.get(Calendar.DAY_OF_MONTH));
        assertEquals(0, cal2.get(Calendar.HOUR_OF_DAY));
        assertEquals(41, cal2.get(Calendar.MINUTE));

        cal.set(2013, 7 - 1, 18, 5, 20); // JST 14:20
        date = cal.getTime();

        // サンフランシスコ夏時間
        ret = DateUtil.convertTime(date, "0000000003");
        Calendar cal3 = Calendar.getInstance();
        cal3.setTime(ret);
        assertEquals(2013, cal3.get(Calendar.YEAR));
        assertEquals(7 - 1, cal3.get(Calendar.MONTH));
        assertEquals(17, cal3.get(Calendar.DAY_OF_MONTH));
        assertEquals(22, cal3.get(Calendar.HOUR_OF_DAY));
        assertEquals(20, cal3.get(Calendar.MINUTE));

        cal.set(2013, 11 - 1, 18, 5, 20); // JST 14:20
        date = cal.getTime();
        // サンフランシスコ冬時間
        ret = DateUtil.convertTime(date, "0000000003");
        Calendar cal4 = Calendar.getInstance();
        cal4.setTime(ret);

        assertEquals(2013, cal4.get(Calendar.YEAR));
        assertEquals(11 - 1, cal4.get(Calendar.MONTH));
        assertEquals(17, cal4.get(Calendar.DAY_OF_MONTH));
        assertEquals(21, cal4.get(Calendar.HOUR_OF_DAY));
        assertEquals(20, cal4.get(Calendar.MINUTE));

    }
}
