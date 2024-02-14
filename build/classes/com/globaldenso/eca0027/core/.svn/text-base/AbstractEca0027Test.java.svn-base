/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import jp.co.dgic.testing.common.virtualmock.MockObjectManager;

import org.apache.commons.lang.StringUtils;
import org.hamcrest.Matcher;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.ai.library.csvlistconvert.CsvListConversion;
import com.globaldenso.eca0027.core.common.business.domain.SelectListItemDomain;
import com.globaldenso.gscm.framework.business.domain.AbstractDomain;
import com.globaldenso.gscm.framework.util.ResourcesFactory;

/**
 * <br />単体テストクラスの基底クラスです。
 *
 * @author $Author: 810833843 $
 * @version $Revision: 9972 $
 */
public abstract class AbstractEca0027Test {

    /**
     * <br />Adobe Reader XIのパス
     */
    private static final String ACRORD32
        = "C:/Program Files/Adobe/Reader 10.0/Reader/AcroRd32.exe";

    /**
     * <br />テストクラス用の Spring 設定ファイルの接尾辞
     */
    private static final String CONTEXT_FILE_SUFFIX = "applicationContext.xml";

    /**
     * <br />テスト時にメソッド名を取得するためのテストルール
     */
    @Rule
    public TestName testNameRule = new TestName();

    /**
     * <br />AbstractDomain用Matcher
     */
    protected AbstractDomainMatcher abstractDomainMatcher = new AbstractDomainMatcher(getClass());

    /**
     * <br />SelectListItemDomain用Matcher
     */
    protected SelectListItemDomainMatcher selectListItemDomainMatcher = new SelectListItemDomainMatcher(getClass());

    /**
     * <br />アプリケーションコンテキスト
     */
    private ApplicationContext context = null;

    /** 
     * PlatformTransactionManager トランザクションマネージャー
     */
    private PlatformTransactionManager txManager;
    
    /** 
     * TransactionStatus トランザクションステータス
     */
    private TransactionStatus tx;
    
    static {
        ResourcesFactory factory = new ResourcesFactory();
        factory.createResources("MessageResources, ValidationResources, ValidateResources");
    }
    
    /**
     * <br />デフォルトコンストラクタです。
     */
    public AbstractEca0027Test() {
    }

    /**
     * <br />各テストの前の処理を行います。
     *
     * @throws Exception エラーが発生した場合
     */
    @Before
    public void setUpAbstractEca0027Test() throws Exception {

        System.out.println();
        System.out.println("===== START " + testNameRule.getMethodName() + " =====");
        
        String methodName = testNameRule.getMethodName();

        URL classContextFileUrl = getFileUrl(getClassContextFile());
        URL methodContextFileUrl = getFileUrl(getMethodContextFile(methodName));

        if (methodContextFileUrl != null) {
            context = loadContextXml(classContextFileUrl, methodContextFileUrl);
        } else {
            try{
                context = loadContextXml(classContextFileUrl, null);
                System.out.println("s===");
            }catch (Exception e) {
                e.printStackTrace();
                System.out.println("s");
                // TODO: handle exception
            }
        }

        txManager = (PlatformTransactionManager) context.getBean("transactionManager");
        tx = txManager.getTransaction(null);
        tx.setRollbackOnly();

        MockObjectManager.initialize();
    }

    /**
     * <br />各テスト実行後の処理
     *
     * @throws Exception エラーが発生した場合
     */
    @After
    public void tearDownAbstractEca0027Test() throws Exception {
        txManager.rollback(tx);

        ((ClassPathXmlApplicationContext) context).close();

        System.out.println("===== END " + testNameRule.getMethodName() + " =====");
        System.out.println();
    }

    /**
     * <br />アプリケーションコンテキストを取得します。
     *
     * @return アプリケーションコンテキスト
     */
    protected ApplicationContext getContext() {
        return context;
    }

    /**
     * <br />トランザクションをロールバックします。
     */
    protected void rollback() {
//        txManager.rollback(tx);
    }
    
    /**
     * <br />PDFをPDFビューアで表示します。
     * 
     * <pre>
     * deleteReportがtrueの場合、最後にPDF帳票を削除します。
     * </pre>
     * 
     * @param report PDF帳票
     * @param deleteReport 帳票削除フラグ
     */
    protected void displayReport(File report, boolean deleteReport) {

        try {
            Process proc = new ProcessBuilder(getPdfViewer(), report.getAbsolutePath()).start();
            proc.waitFor();

        } catch (IOException e) {
            e.printStackTrace();

        } catch (InterruptedException e) {
            e.printStackTrace();

        } finally {
            if (report != null && deleteReport) {
                report.delete();
            }
        }
    }

    /**
     * <br />DensoContextを設定します。
     *
     * <pre>
     * このメソッドでDensoContextを設定した場合、ロケールはJVMのデフォルト・ロケールとなります。
     * ロケールを設定する場合は{@link #setDensoContext(String, Locale)}を利用して下さい。
     * </pre>
     * 
     * @param dscId DensoContextに設定するDSC-ID
     */
    protected void setDensoContext(String dscId) {

        setDensoContext(dscId, null);
    }

    /**
     * <br />DensoContextを設定します。
     *
     * @param dscId DensoContextに設定するDSC-ID
     * @param locale DensoContextに設定するロケール
     */
    protected void setDensoContext(String dscId, Locale locale) {

        DensoContext.set(new DensoContext(dscId, null, locale));
    }

    /**
     * <br />実際の値（ドメイン）と期待値のマップをテストします。
     *
     * @param reason アサート失敗時のメッセージ
     * @param actualDomain 実際の値（ドメイン）
     * @param expectedMap 期待値のマップのリスト
     */
    @SuppressWarnings("unchecked")
    protected void assertDomain(String reason, Object actualDomain, Map<String, String> expectedMap) {
        assertDomain(reason, actualDomain, expectedMap, null);
    }

    /**
     * <br />実際の値（ドメイン）と期待値のマップをテストします。
     *
     * @param reason アサート失敗時のメッセージ
     * @param actualDomain 実際の値（ドメイン）
     * @param expectedMap 期待値のマップのリスト
     * @param ignoreCols 比較対象外のカラム
     */
    @SuppressWarnings("unchecked")
    protected void assertDomain(String reason, Object actualDomain, Map<String, String> expectedMap, String[] ignoreCols) {
        if (actualDomain == null) {
            fail("actualDomain is null");
        }

        Matcher matcher = null;

        try {
            if (actualDomain instanceof AbstractDomain) {
                matcher = new AbstractDomainMatcher(expectedMap, getClass(), ignoreCols);
            } else if (actualDomain instanceof SelectListItemDomain) {
                matcher = new SelectListItemDomainMatcher(expectedMap, getClass());
            } else {
                fail(String.format("actualDomain is unknown type (%s)",
                    actualDomain.getClass().getSimpleName()));
            }
        } catch (Exception e) {
            fail("getMatcher failed");
        }

        assertThat(reason, actualDomain, matcher);
    }

    /**
     * <br />実際の値（ドメイン）のリストと期待値のマップのリストをテストします。
     *
     * @param reason アサート失敗時のメッセージ
     * @param actualList 実際の値（ドメイン）のリスト
     * @param expectedList 期待値のマップのリスト
     */
    protected void assertDomainList(String reason, List<?> actualList, List<Map<String, String>> expectedList) {
        assertDomainList(reason, actualList, expectedList, null);
    }

    /**
     * <br />実際の値（ドメイン）のリストと期待値のマップのリストをテストします。
     *
     * @param reason アサート失敗時のメッセージ
     * @param actualList 実際の値（ドメイン）のリスト
     * @param expectedList 期待値のマップのリスト
     * @param ignoreCols 比較対象外のカラム
     */
    protected void assertDomainList(String reason, List<?> actualList, List<Map<String, String>> expectedList, String[] ignoreCols) {

        if (actualList == null) {
            fail("actualList is null");
        }
        if (expectedList == null) {
            fail("expectedList is null");
        }

        assertThat(reason, actualList.size(), is(expectedList.size()));

        for (int i = 0; i < actualList.size(); i++) {
            assertDomain(String.format("[%d] %s", i, reason), actualList.get(i), expectedList.get(i), ignoreCols);
        }
    }

    /**
     * <br />ドメインテスト用のCSVファイルを読み込みます。
     * 
     * <pre>
     * 1行目はヘッダ行（項目名）、2行目以降がデータ行となっていること。
     * 1行ごとに「項目名」、「値」のマップに変換されます。
     * 
     * ヘッダ行の項目名は、DBカラム名に合わせてください。
     * テスト対象ドメインが
     * <code>
     * class ExampleDomain {
     *   private String fieldA;
     *   private String fieldB;
     *   ...
     * }
     * </code>
     * の場合、ヘッダ行は
     * <code>
     * "FIELD_A","FIELD_B",...
     * </code>
     * となります。
     * 
     * データ行の各項目は、テスト対象ドメインのフィールドの型に合わせて
     * 以下の形式でCSVファイルに記載してください。
     * 
     * <table border="1">
     * <tr><th>フィールドの型</th><th>CSVへの記載内容</th></tr>
     * <tr><td>java.lang.String</td><td>文字列<br>(例: テスト)</td></tr>
     * <tr><td>java.math.BigDecimal</td><td>数値<br>(例: 0.01)</td></tr>
     * <tr><td>java.util.Date</td><td>「YYYY/MM/DD」形式<br>(例: 2014/02/10)</td></tr>
     * <tr><td>java.sql.Timestamp</td><td>「YYYY/MM/DD hh:mm:ss」形式<br>(例: 2014/02/10 01:02:03)</td></tr>
     * <tr><td>byte[]</td><td>対象データを含むファイルのファイル名(※1)<br>(例: test.exe)</td></tr>
     * </table>
     * 
     * (※1) テストクラスと同じフォルダに配置すること。
     * </pre>
     *
     * @param file ファイル名（先頭のテストクラス名は省略）
     * @return 1行ごとのマップのリスト
     * @throws Exception エラーが発生した場合
     */
    protected List<Map<String, String>> readCsvFile(String file) throws Exception {

        URL fileUrl = getFileUrl(getClass().getSimpleName() + "_" + file);
        
        if (fileUrl == null) {
            return null;
        }

        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(new File(fileUrl.toURI()));
            br = new BufferedReader(fr);

            List<String> header = null;
            List<List<String>> dataList = new ArrayList<List<String>>();

            int lineNo = 1;
            String line;
            while ((line = br.readLine()) != null) {
                List<List<String>> csvList = CsvListConversion.getList(line);

                // 1行 1項目の場合、CsvListConversion.getListでうまく処理できない
                if (csvList.isEmpty()) {
                    // 行末にカンマを追加して再度処理を行う
                    String dummyLine = line + ",";
                    csvList = CsvListConversion.getList(dummyLine);
                    // カンマを追加してできた余分なデータを削除する
                    csvList.get(0).remove(csvList.get(0).size() - 1);
                }

                List<String> data = csvList.get(0);

                // 1行目はヘッダとみなす
                if (lineNo == 1) {
                    header = data;
                } else {
                    dataList.add(data);
                }

                lineNo++;
            }

            List<Map<String, String>> resultList = new ArrayList<Map<String, String>>();

            // 1行ごとにマップに変換する
            for (List<String> data : dataList) {
                Map<String, String> dataMap = new LinkedHashMap<String, String>();

                for (int i = 0; i < header.size(); i++ ) {
                    String colName = header.get(i);
                    String colValue = "";
                    if (i < data.size()) {
                        colValue = data.get(i);
                    }

                    dataMap.put(colName, colValue);
                }

                resultList.add(dataMap);
            }
            
            return resultList;
            
        } catch (Exception e) {
            throw e;
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (Exception ignore) {
                }
            }
            if (fr != null) {
                try {
                    fr.close();
                } catch (Exception ignore) {
                }
            }
        }
    }

    /**
     * <br />指定された要素が指定された個数分だけ充填されたリストを作成します。
     *
     * @param <T> リスト要素の型
     * @param e 充填する要素
     * @param count 充填する個数
     * @return 指定された要素が充填されたリスト
     */
    protected <T> List<T> toFilledList(T e, int count) {
        List<T> list = new ArrayList<T>();
        
        for (int i = 0; i < count; i++) {
            list.add(e);
        }
        
        return list;
    }
    
    /**
     * 配列の要素が空(nullまたは"")であるかチェックします。
     *
     * @param array チェック対象の配列
     * @param index チェック要素のインデックス
     * @return 配列要素が存在し、空(nullまたは"")でない場合はtrue、それ以外はfalse
     */
    protected boolean isEmpty(String[] array, int index) {
        return array.length <= index || StringUtils.isEmpty(array[index]);
    }
    
    /**
     * <br />入力ストリームをクローズします。
     * <pre>
     * Find Bugsのエラー(OBL_UNSATISFIED_OBLIGATION)を回避するために、
     * クローズに失敗した場合、スタックトレースを出力するだけで、例外をスローしません。
     * </pre>
     *
     * @param in 入力ストリーム
     */
    protected void closeQuietly(InputStream in) {
        try {
            if (in != null) {
                in.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    /**
     * <br />アプリケーションコンテキストを取得します。
     * 
     * <pre>
     * テストクラス用（テストクラス単位、テストメソッド単位）の Spring 設定ファイルが存在する場合、
     * 追加で読み込まれます。
     *   - 配置先: テストクラスと同じフォルダ
     *   - ファイル名（テストクラス単位）  : テストクラス名-applicationContext.xml
     *   - ファイル名（テストメソッド単位）: テストクラス名-テストメソッド名-applicationContext.xml
     * </pre>
     *
     * @param classContextFileUrl テストクラス用設定ファイル（テストクラス単位）のURL
     * @param methodContextFileUrl テストクラス用設定ファイル（テストメソッド単位）のURL
     * @return アプリケーションコンテキスト
     */
    private ApplicationContext loadContextXml(URL classContextFileUrl, URL methodContextFileUrl) {

        try {
            URLClassLoader urlLoader = (URLClassLoader) ClassLoader.getSystemClassLoader();
            Method method = URLClassLoader.class.getDeclaredMethod("addURL", URL.class);
            method.setAccessible(true);
            method.invoke(urlLoader, new File("WebContent").toURL());

        } catch (Exception e) {
            e.printStackTrace();
        }

        // 設定ファイルリスト
        List<String> contextFileList = new ArrayList<String>();
        contextFileList.add("WEB-INF/applicationContext-aij2.xml");
        contextFileList.add("WEB-INF/applicationContext-aij2-jdbc.xml");
        contextFileList.add("WEB-INF/applicationContext-aij2-aop.xml");
        contextFileList.add("WEB-INF/applicationContext-library.xml");
        contextFileList.add("WEB-INF/applicationContext-aijbutil.xml");

        // テストクラス用設定ファイル（テストクラス単位）が存在する場合
        if (classContextFileUrl != null) {
            contextFileList.add(classContextFileUrl.toString());
        }
        // テストクラス用設定ファイル（テストメソッド単位）が存在する場合
        if (methodContextFileUrl != null) {
            contextFileList.add(methodContextFileUrl.toString());
        }

        ApplicationContext context
            = new ClassPathXmlApplicationContext(contextFileList.toArray(new String[0]));

        return context;
    }

    /**
     * <br />指定された設定ファイルをクラスパスから検索し、URLを返します。
     *
     * @param file 設定ファイル
     * @return 設定ファイルのURL
     */
    private URL getFileUrl(String file) {

        return getClass().getResource(file);
    }

    /**
     * <br />テストクラス用設定ファイル（テストクラス単位）のファイル名を返します。
     *
     * @return テストクラス用設定ファイル（テストクラス単位）のファイル名
     */
    private String getClassContextFile() {

        return String.format("%s-%s", getClass().getSimpleName(), CONTEXT_FILE_SUFFIX);
    }

    /**
     * <br />テストクラス用設定ファイル（テストメソッド単位）のファイル名を返します。
     *
     * @param methodName メソッド名
     * @return テストクラス用設定ファイル（テストメソッド単位）のファイル名
     */
    private String getMethodContextFile(String methodName) {

        return String.format("%s-%s-%s",
                        getClass().getSimpleName(), methodName, CONTEXT_FILE_SUFFIX);
    }

    /**
     * <br />PDFビューアの実行ファイルのパスを返します。
     *
     * <pre>
     * PDFビューアとして、デフォルトでは{@link #ACRORD32}を使用します。
     * 別のPDFビューアを指定する場合は、以下の設定を行ってください。
     * 
     * 1. Eclipseのメニューから[ウィンドウ] - [設定]を選択する。
     * 2. [Java] - [インストール済みのJRE] を選択する。
     * 3.「jdk1.5.0_15」を選択して、[編集]ボタンをクリックする。
     * 4.「デフォルトのVM引数」に「-DpdfViewer="PDFビューアのパス"」を指定する。
     * </pre>
     * 
     * @return PDFビューアの実行ファイルのパス
     */
    private String getPdfViewer() {

        String pdfViewer = System.getProperty("pdfViewer");

        if (pdfViewer != null) {
            return pdfViewer;
        } else {
            return ACRORD32;
        }
    }
}
