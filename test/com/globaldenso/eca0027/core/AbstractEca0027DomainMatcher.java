/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.commons.beanutils.BeanMap;
import org.apache.commons.lang.StringUtils;
import org.hamcrest.Description;
import org.junit.internal.matchers.TypeSafeMatcher;

/**
 * Domain用のMatcherクラスの基底クラスです。
 *
 * @param <T> 型引数
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public abstract class AbstractEca0027DomainMatcher<T> extends TypeSafeMatcher<T> {

    /**
     * 日付フォーマット
     */
    private static final String DATE_FORMAT = "yyyy/MM/dd";

    /**
     * 日付時間フォーマット
     */
    private static final String TIMESTAMP_FORMAT = DATE_FORMAT + " HH:mm:ss";

    /**
     * 日付フォマッター
     */
    private final DateFormat DATE_FORMATTER = new SimpleDateFormat(DATE_FORMAT);

    /**
     * 日付時間フォマッター
     */
    private final DateFormat TIMESTAMP_FORMATTER = new SimpleDateFormat(TIMESTAMP_FORMAT);

    /**
     * 期待値（マップ）
     */
    private Map<String, String> expectedMap;

    /**
     * テストクラス
     */
    private Class<?> testClass;

    /**
     * フィールド名（エラー時用）
     */
    private String fieldName;

    /**
     * 期待値（エラー時用）
     */
    private Object expectedValue;

    /**
     * 実際の値（エラー時用）
     */
    private Object actualValue;

    /**
     * メッセージ（エラー時用）
     */
    private String msg;

    /**
     * 比較対象外のカラム
     */
    private List<String> ignoreCols;
    
    /**
     * コンストラクタ
     *
     * @param testClass テストクラス
     */
    public AbstractEca0027DomainMatcher(Class<?> testClass) {
        this(null, testClass);
    }

    /**
     * コンストラクタ
     *
     * @param expectedMap 期待値（マップ
     * @param testClass テストクラス
     */
    public AbstractEca0027DomainMatcher(Map<String, String> expectedMap, Class<?> testClass) {
        this(expectedMap, testClass, null);
    }

    /**
     * コンストラクタ
     *
     * @param expectedMap 期待値（マップ
     * @param testClass テストクラス
     * @param ignoreCols 比較対象外のカラム
     */
    public AbstractEca0027DomainMatcher(Map<String, String> expectedMap, Class<?> testClass, String[] ignoreCols) {
        this.expectedMap = expectedMap;
        this.testClass = testClass;
        
        if (ignoreCols != null) {
            this.ignoreCols = Arrays.asList(ignoreCols);
        }
    }

    /**
     * 実際の値（ドメイン）と期待値（マップ）を比較します。
     * 
     * <p>
     * 実際の値（ドメイン）のプロパティと期待値（マップ）に設定された項目の値で比較を行う。
     * </p>
     * 
     * @param actualDomain 実際の値（ドメイン）
     * @return 実際の値と期待値が一致する場合は true、それ以外の場合は false
     */
    @Override
    public boolean matchesSafely(T actualDomain) {

        if (actualDomain == null && (expectedMap == null || expectedMap.isEmpty())) {
            return true;
        } else if (actualDomain == null || expectedMap == null) {
            return false;
        }

        BeanMap actualDomainMap = new BeanMap(actualDomain);

        for (Map.Entry<String, String> entry : expectedMap.entrySet()) {
            String colName = entry.getKey();
            String expectedValue = entry.getValue();
            this.fieldName = toFieldName(colName);

            if (this.ignoreCols != null && this.ignoreCols.contains(colName)) {
                continue;
            }
            
            if (!actualDomainMap.containsKey(this.fieldName)) {
                this.msg = "ドメインにフィールドがありませんでした。(" + fieldName + ")";
                return false;
            }

            this.expectedValue = expectedMap.get(colName);
            this.actualValue = actualDomainMap.get(this.fieldName);
            if (!equals(actualValue, expectedValue)) {
                return false;
            }
        }

        return true;
    }

    /**
     * {@inheritDoc}
     * @see org.hamcrest.SelfDescribing#describeTo(org.hamcrest.Description)
     */
    public void describeTo(Description desc) {

        if (fieldName == null || expectedMap == null) {
            
        } else if (msg != null) {
            desc.appendText(String.format("%s : %s", fieldName, msg));
        } else {
            desc.appendText(String.format("%s : expected is ", fieldName))
                .appendValue(expectedValue)
                .appendText(", but actual is ")
                .appendValue(actualValue);
        }
    }

    /**
     * カラム名をプロパティ名に変換します。
     *
     * @param colName カラム名
     * @return プロパティ名
     */
    private String toFieldName(String colName) {
        String[] words = colName.split("_");
        
        StringBuilder propertyName = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            String word = words[i].toLowerCase();
            if (i == 0) {
                propertyName.append(word);
            } else {
                propertyName.append(word.substring(0, 1).toUpperCase());
                propertyName.append(word.substring(1));
            }
        }
        
        return propertyName.toString();
    }
    
    /**
     * 実際の値と期待値を比較します。
     *
     * @param actualValue 実際の値
     * @param expectedValue 期待値
     * @return 比較結果
     */
    private boolean equals(Object actualValue, String expectedValue) {

        if (actualValue == null) {
            if (StringUtils.isEmpty(expectedValue)) {
                return true;
            } else {
                return false;
            }
        }

        if (actualValue instanceof BigDecimal) {
            return equalsBigDecimal((BigDecimal) actualValue, expectedValue);
        } else if (actualValue instanceof Timestamp) {
            return equalsTimestamp((Timestamp) actualValue, expectedValue);
        } else if (actualValue instanceof Date) {
            return equalsDate((Date) actualValue, expectedValue);
        } else if (actualValue instanceof byte[]) {
            return equalsBytes((byte[]) actualValue, expectedValue);
        } else {
            return equalsString(actualValue.toString(), expectedValue);
        }
    }

    /**
     * 実際の値と期待値を比較します。
     *
     * @param actualString 実際の値
     * @param expectedString 期待値
     * @return 比較結果
     */
    private boolean equalsString(String actualString, String expectedString) {

        if (actualString == null && expectedString == null) {
            return true;
        }

        boolean result = actualString != null && actualString.equals(expectedString);

        if (!result) {
            this.actualValue = actualString;
            this.expectedValue = expectedString;
        }

        return result;
    }

    /**
     * 実際の値と期待値を比較します。
     *
     * @param actualBigDecimal 実際の値
     * @param expectedString 期待値
     * @return 比較結果
     */
    private boolean equalsBigDecimal(BigDecimal actualBigDecimal, String expectedString) {

        BigDecimal expectedBigDecimal = null;

        try {
            expectedBigDecimal = new BigDecimal(expectedString);
        } catch (Exception e) {
            this.msg = "期待値をBigDecimalに変換できませんでした。";
            return false;
        }

        boolean result = false;

        if (expectedBigDecimal != null) {
            result = actualBigDecimal.equals(expectedBigDecimal);
        }

        if (!result) {
            this.actualValue = actualBigDecimal.toPlainString();
            this.expectedValue = expectedBigDecimal.toPlainString();
        }

        return result;
    }

    /**
     * 実際の値と期待値を比較します。
     *
     * @param actualDate 実際の値
     * @param expectedString 期待値
     * @return 比較結果
     */
    private boolean equalsDate(Date actualDate, String expectedString) {
        
        String actualString = null;
        
        try {
            actualString = DATE_FORMATTER.format(actualDate);
        } catch (Exception e) {
            this.msg = "実際の値をStringに変換できませんでした。";
            return false;
        }

        boolean result = false;

        if (actualString != null) {
            result = actualString.equals(expectedString);
        }

        if (!result) {
            this.actualValue = actualString;
            this.expectedValue = expectedString;
        }

        return result;
    }

    /**
     * 実際の値と期待値を比較します。
     *
     * @param actualTimestamp 実際の値
     * @param expectedString 期待値
     * @return 比較結果
     */
    private boolean equalsTimestamp(Timestamp actualTimestamp, String expectedString) {
        
        String actualString = null;
        
        try {
            actualString = TIMESTAMP_FORMATTER.format(actualTimestamp);
        } catch (Exception e) {
            this.msg = "実際の値をStringに変換できませんでした。";
            return false;
        }

        boolean result = false;

        if (actualString != null) {
            result = actualString.equals(expectedString);
        }

        if (!result) {
            this.actualValue = actualString;
            this.expectedValue = expectedString;
        }

        return result;
    }

    /**
     * 実際の値と期待値を比較します。
     *
     * @param actualBytes 実際の値
     * @param file 期待値となるファイル名
     * @return 比較結果
     */
    private boolean equalsBytes(byte[] actualBytes, String file) {

        byte[] expectedBytes = readFileToBytes(file);
        if (expectedBytes == null) {
            this.msg = String.format("ファイルを読み込めませんでした。(%s)", file);
            return false;
        }

        boolean result = true;

        if (actualBytes.length != expectedBytes.length) {
            result =  false;
        }

        for (int i = 0; i < actualBytes.length; i++ ) {
            byte actualByte = actualBytes[i];
            byte expectedByte = expectedBytes[i];

            if (actualByte != expectedByte) {
                result =  false;
                break;
            }
        }

        if (!result) {
            this.actualValue = toHexString(actualBytes);
            this.expectedValue = toHexString(expectedBytes);
        }

        return result;
    }

    /**
     * ファイルを読み込みバイト配列を取得します。
     *
     * @param file ファイル名
     * @return バイト配列
     */
    private byte[] readFileToBytes(String file) {

        URL fileUrl = getFileUrl(file);
        
        if (fileUrl == null) {
            return null;
        }

        FileInputStream fis = null;
        BufferedOutputStream bos = null;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        try {
            fis = new FileInputStream(new File(fileUrl.toURI()));
            bos = new BufferedOutputStream(baos);

            int c;
            while ((c = fis.read()) != -1) {
                bos.write(c);
            }
        } catch (Exception e) {
            return null;
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (Exception ignore) {
                }
            }
            if (bos != null) {
                try {
                    bos.flush();
                    bos.close();
                } catch (Exception ignore) {
                }
            }
        }

        return baos.toByteArray();
    }

    /**
     * 指定された設定ファイルをクラスパスから検索し、URLを返します。
     *
     * @param file 設定ファイル
     * @return 設定ファイルのURL
     */
    private URL getFileUrl(String file) {

        if (this.testClass != null) {
            return this.testClass.getResource(file);
        } else {
            return null;
        }
    }

    /**
     * バイト配列を16進数表示の文字列に変換します。
     *
     * @param bytes バイト配列
     * @return 16進数表示の文字列
     */
    private String toHexString(byte[] bytes) {

        List<String> list = new ArrayList<String>();

        for (byte b : bytes) {
            list.add(Integer.toHexString(b & 0xff));
        }

        return StringUtils.join(list.iterator(), ":");
    }
}
