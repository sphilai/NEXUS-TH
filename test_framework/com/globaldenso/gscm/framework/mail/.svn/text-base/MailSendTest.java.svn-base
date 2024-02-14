package com.globaldenso.gscm.framework.mail;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.Locale;

import jp.co.dgic.testing.framework.DJUnitTestCase;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.commons.lang.time.StopWatch;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.ai.common.core.mailsend.AiMailSend;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.util.ResourcesFactory;
import com.globaldenso.gscm.framework.util.SpringUtil;

/**
 * 
 * メール送信用クラスのテスト
 * 
 * <p>
 * メール送信用クラスのテスト
 * </p>
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class MailSendTest extends DJUnitTestCase {
    
    /** 送信可能ファイルサイズのチェックでエラーになったときにコード */
    private static final String LIMIT_MAIL_SIZE_ERROR_CODE = "GSCM-E0-0006";
    
    /**
     * 
     * デフォルトコンストラクタ。
     *
     */
    public MailSendTest() {
    }
    
    
    /**
     * ResourceFactory用のApplicationContextを作成
     * {@inheritDoc}
     * @see junit.framework.TestCase#setUp()
     */
    @Override
    protected void setUp() throws Exception {
        
        super.setUp();
        
        URL webContent = new File("WebContent").toURL();
        
        URLClassLoader urlLoader = (URLClassLoader)ClassLoader.getSystemClassLoader();
        
        Method method = URLClassLoader.class.getDeclaredMethod("addURL", new Class[]{URL.class});
        method.setAccessible(true);
        method.invoke(urlLoader, new Object[]{webContent});

        new SpringUtil().setApplicationContext(new ClassPathXmlApplicationContext(
            new String[]{"WEB-INF/applicationContext-aij2-aop.xml",
                "WEB-INF/applicationContext-aij2-jdbc.xml",
                "WEB-INF/applicationContext-aij2.xml"})
        );
    }



    /**
     * 
     * mailSendの単体テスト（メールサイズ）
     * 
     * <p>
     * 1.サイズエラーがない場合
     * 2.メールサイズエラー（本文のみ）
     * 3.メールサイズエラー（添付ファイルのみ）
     * 4.メールサイズエラー（本文＋添付ファイル）
     * 5.メールサイズエラー（デフォルトサイズ(1KB)）
     * 6.指定サイズマイナスはチェックなし（メールサイズエラーなし）
     * 7.指定サイズ文字列は例外発生
     * </p>
     *
     */
    public void testMailSend1() {
        
        setReturnNullAtAllTimes(AiMailSend.class, "mailSend");
        
        // エラーなしのケース
        MailInfoDomain domain1 = new MailInfoDomain();
        MailSend mailSend1 = new MailSend();
        
        int size1KB = 1024 * 1024;
        File file1KB = createTestFile(size1KB);
        String str1KB = RandomStringUtils.randomAscii(size1KB);
        domain1.setContents(str1KB);
        domain1.setAttachFile(new ArrayList<String>());
        domain1.getAttachFile().add(file1KB.getPath());
        domain1.setSendToMailAddress("test@localhost");
        domain1.setTitle("test1");
        try {
            mailSend1.mailSend(domain1);
        } catch (ApplicationException e) {
            fail(e.getMessage());
        }
        
        // エラーのケース
        // 本文のサイズだけ
        MailInfoDomain domain2 = new MailInfoDomain();
        MailSend mailSend2 = new MailSend();
        
        int size2KB = 1024 * 1024 * 2;
        String str2KB = RandomStringUtils.randomAscii(size2KB + 1);
        domain2.setContents(str2KB);
        domain2.setSendToMailAddress("test@localhost");
        domain2.setTitle("test2");
        try {
            mailSend2.mailSend(domain2);
            fail("testMailSend-2");
        } catch (GscmApplicationException e) {
            assertEquals("testMailSend-2", LIMIT_MAIL_SIZE_ERROR_CODE, e.getCode());
            
            // メッセージに変換できるかを確認
            ResourcesFactory.setFactoryClass(ResourcesFactory.class.getName());
            ResourcesFactory.createFactory().createResources("MessageResources");
            String msg = ResourcesFactory.getResources().getMessage(Locale.JAPANESE, e.getCode(), e.getArgs());
            //System.out.println(msg);
            assertTrue(msg, msg.matches("メールサイズが送信可能上限値を超えました。上限値：[0-9,]+ メールサイズ：[0-9,]+"));
            
        } catch (ApplicationException e) {
            fail(e.getMessage());
        }
        
        // エラーのケース
        // 添付ファイルのサイズでエラー
        MailInfoDomain domain3 = new MailInfoDomain();
        MailSend mailSend3 = new MailSend();
        
        domain3.setAttachFile(new ArrayList<String>());
        domain3.getAttachFile().add(file1KB.getPath());
        domain3.getAttachFile().add(file1KB.getPath());
        domain3.getAttachFile().add(file1KB.getPath());
        domain3.setContents("");
        domain3.setSendToMailAddress("test@localhost");
        domain3.setTitle("test3");
        try {
            mailSend3.mailSend(domain3);
            fail("testMailSend-3");
        } catch (GscmApplicationException e) {
            assertEquals("testMailSend-3", LIMIT_MAIL_SIZE_ERROR_CODE, e.getCode());
        } catch (ApplicationException e) {
            fail(e.getMessage());
        }
        
        // エラーのケース
        // 本文と添付ファイルのサイズでエラー
        MailInfoDomain domain4 = new MailInfoDomain();
        MailSend mailSend4 = new MailSend();
        
        File file512B = createTestFile(1024  * 512);
        domain4.setAttachFile(new ArrayList<String>());
        domain4.getAttachFile().add(file512B.getPath());
        domain4.getAttachFile().add(file512B.getPath());
        domain4.getAttachFile().add(file512B.getPath());
        domain4.getAttachFile().add(file512B.getPath());
        domain4.setContents("test");
        domain4.setSendToMailAddress("test@localhost");
        domain4.setTitle("test4");
        try {
            mailSend4.mailSend(domain4);
            fail("testMailSend-4");
        } catch (GscmApplicationException e) {
            assertEquals("testMailSend-4", LIMIT_MAIL_SIZE_ERROR_CODE, e.getCode());
        } catch (ApplicationException e) {
            fail(e.getMessage());
        }
        
        // エラーのケース
        // デフォルトのサイズエラー（1KB）
        MailInfoDomain domain5 = new MailInfoDomain();
        MailSend mailSend5 = new MailSend("AiMailNull");
        
        domain5.setContents(RandomStringUtils.randomAscii(size1KB + 1));
        domain5.setSendToMailAddress("test@localhost");
        domain5.setTitle("test5");
        try {
            mailSend5.mailSend(domain5);
            fail("testMailSend-5");
        } catch (GscmApplicationException e) {
            assertEquals("testMailSend-5", LIMIT_MAIL_SIZE_ERROR_CODE, e.getCode());
        } catch (ApplicationException e) {
            fail(e.getMessage());
        }
        
        // 指定サイズマイナス
        MailInfoDomain domain6 = new MailInfoDomain();
        MailSend mailSend6 = new MailSend("AiMailMinus");
        
        domain6.setContents(str2KB);
        domain6.setAttachFile(new ArrayList<String>());
        domain6.getAttachFile().add(file1KB.getPath());
        domain6.getAttachFile().add(file1KB.getPath());
        domain6.getAttachFile().add(file1KB.getPath());
        domain6.getAttachFile().add(file1KB.getPath());
        domain6.setSendToMailAddress("test@localhost");
        domain6.setTitle("test6");
        try {
            mailSend6.mailSend(domain6);
        } catch (ApplicationException e) {
            fail(e.getMessage());
        }
        
        // 指定サイズ文字
        try {
            new MailSend("AiMailMoji1");
            fail("testMailSend-6");
        } catch (NumberFormatException e) {
            // OK
        } catch (Exception e) {
            fail(e.getMessage());
        }
        
    }
    
    /**
     * 
     * 送信間隔のテスト
     * 
     * <p>
     * 1.2件連続
     * 2.5件連続（マルチスレッド）
     * 3.プロパティファイルに時間間隔なし（デフォルト1秒）
     * 4.時間間隔マイナス（待機しない）
     * 5.間隔サイズ文字
     * </p>
     * @throws InterruptedException エラー
     * @throws ApplicationException エラー
     *
     */
    public void testMailSend2() throws InterruptedException, ApplicationException {
        
        setReturnNullAtAllTimes(AiMailSend.class, "mailSend");
        
        // 2通連続送信
        StopWatch stopWatch1 = new StopWatch();
        
        MailInfoDomain domain1_1 = new MailInfoDomain();
        domain1_1.setSendToMailAddress("test@localhost");
        domain1_1.setContents("wait test");
        domain1_1.setTitle("1-1");
        MailSend mailSend1_1 = new MailSend();

        MailInfoDomain domain1_2 = new MailInfoDomain();
        domain1_2.setSendToMailAddress("test@localhost");
        domain1_2.setContents("wait test");
        domain1_2.setTitle("1-2");
        MailSend mailSend1_2 = new MailSend();

        stopWatch1.start();
        mailSend1_1.mailSend(domain1_1);
        mailSend1_2.mailSend(domain1_2);
        stopWatch1.stop();
        assertTrue("testMailSend2-1", stopWatch1.getTime() > 5000);
        
        // 5通連続
        StopWatch stopWatch2 = new StopWatch();
        Thread thread1 = new MailSendThread(1);
        Thread thread2 = new MailSendThread(2);
        Thread thread3 = new MailSendThread(3);
        Thread thread4 = new MailSendThread(4);
        Thread thread5 = new MailSendThread(5);
        stopWatch2.start();
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread1.join();
        thread2.join();
        stopWatch2.split();
        long split2_1 = stopWatch2.getSplitTime();
        assertTrue("testMailSend2-2", split2_1 > 5000);
        thread3.join();
        stopWatch2.split();
        long split2_2 = stopWatch2.getSplitTime();
        //System.out.println(split2_2);
        assertTrue("testMailSend2-2", split2_2 > 10000);
        thread4.join();
        stopWatch2.split();
        long split2_3 = stopWatch2.getSplitTime();
        //System.out.println(split2_3);
        assertTrue("testMailSend2-2", split2_3 > 15000);
        thread5.join();
        stopWatch2.split();
        long split2_4 = stopWatch2.getSplitTime();
        //System.out.println(split2_4);
        assertTrue("testMailSend2-2", split2_4 > 20000);
        
        // 時間指定なし
        StopWatch stopWatch3 = new StopWatch();
        
        MailInfoDomain domain3_1 = new MailInfoDomain();
        domain3_1.setSendToMailAddress("test@localhost");
        domain3_1.setContents("wait test");
        domain3_1.setTitle("3-1");
        MailSend mailSend3_1 = new MailSend("AiMailNull");

        MailInfoDomain domain3_2 = new MailInfoDomain();
        domain3_2.setSendToMailAddress("test@localhost");
        domain3_2.setContents("wait test");
        domain3_2.setTitle("3-2");
        MailSend mailSend3_2 = new MailSend("AiMailNull");

        stopWatch3.start();
        mailSend3_1.mailSend(domain3_1);

        mailSend3_2.mailSend(domain3_2);
        stopWatch3.stop();
        long time3 = stopWatch3.getTime();
        assertTrue("testMailSend2-3", time3 > 1000);
        
        // 時間マイナス
        StopWatch stopWatch4 = new StopWatch();
        
        MailInfoDomain domain4_1 = new MailInfoDomain();
        domain4_1.setSendToMailAddress("test@localhost");
        domain4_1.setContents("wait test");
        domain4_1.setTitle("4-1");
        MailSend mailSend4_1 = new MailSend("AiMailMinus");

        MailInfoDomain domain4_2 = new MailInfoDomain();
        domain4_2.setSendToMailAddress("test@localhost");
        domain4_2.setContents("wait test");
        domain4_2.setTitle("4-2");
        MailSend mailSend4_2 = new MailSend("AiMailMinus");
        
        mailSend4_1.mailSend(domain4_1);

        stopWatch4.start();
        mailSend4_2.mailSend(domain4_2);
        stopWatch4.stop();
        long time4 = stopWatch4.getTime();
        assertTrue("testMailSend2-4", time4 < 1000);

        // 指定サイズ文字
        try {
            new MailSend("AiMailMoji2");
            fail("testMailSend2-5");
        } catch (NumberFormatException e) {
            // OK
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }
    
    /**
     * 
     * 引数ありのmailSendのテスト
     * 
     * <p>
     * 1.引数に指定したサイズでメールサイズエラー
     * 2.引数に指定した間隔でメール送信
     * 3.メールサイズだけ指定
     * 4.間隔だけ指定
     * </p>
     * @throws ApplicationException エラー
     *
     */
    public void testMailSend3() throws ApplicationException {
        
        setReturnNullAtAllTimes(AiMailSend.class, "mailSend");
        
        // メールサイズエラー
        MailInfoDomain domain1 = new MailInfoDomain();
        MailSend mailSend1 = new MailSend();
        
        int size100B = 1024 * 100;
        String str101B = RandomStringUtils.randomAscii(size100B + 1);
        domain1.setContents(str101B);
        domain1.setSendToMailAddress("test@localhost");
        domain1.setTitle("test1");
        try {
            mailSend1.mailSend(domain1, (long)size100B, 1);
            fail("testMailSend-2");
        } catch (GscmApplicationException e) {
            assertEquals("testMailSend3-1", LIMIT_MAIL_SIZE_ERROR_CODE, e.getCode());
        }
        
        // 指定間隔でメール送信
        StopWatch stopWatch1 = new StopWatch();
        
        MailInfoDomain domain2_1 = new MailInfoDomain();
        domain2_1.setSendToMailAddress("test@localhost");
        domain2_1.setContents("wait test");
        domain2_1.setTitle("2-1");
        MailSend mailSend2_1 = new MailSend();

        MailInfoDomain domain2_2 = new MailInfoDomain();
        domain2_2.setSendToMailAddress("test@localhost");
        domain2_2.setContents("wait test");
        domain2_2.setTitle("2-2");
        MailSend mailSend2_2 = new MailSend();
        
        MailInfoDomain domain2_3 = new MailInfoDomain();
        domain2_3.setSendToMailAddress("test@localhost");
        domain2_3.setContents("wait test");
        domain2_3.setTitle("2-3");
        MailSend mailSend2_3 = new MailSend();
        
        MailInfoDomain domain2_4 = new MailInfoDomain();
        domain2_4.setSendToMailAddress("test@localhost");
        domain2_4.setContents("wait test");
        domain2_4.setTitle("2-4");
        MailSend mailSend2_4 = new MailSend();

        stopWatch1.start();
        mailSend2_1.mailSend(domain2_1);

        mailSend2_2.mailSend(domain2_2, (long)size100B, 1);
        stopWatch1.split();
        long split1 = stopWatch1.getSplitTime();
        assertTrue("testMailSend3-2", split1 > 1000);
        
        mailSend2_3.mailSend(domain2_3, (long)size100B, 2);
        stopWatch1.split();
        long split2 = stopWatch1.getSplitTime();
        assertTrue("testMailSend3-2", split2 > 3000);
        
        mailSend2_4.mailSend(domain2_4, (long)size100B, 3);
        stopWatch1.split();
        long split3 = stopWatch1.getSplitTime();
        assertTrue("testMailSend3-2", split3 > 6000);
        
        // メールサイズだけ指定
        MailInfoDomain domain3 = new MailInfoDomain();
        domain3.setSendToMailAddress("test@localhost");
        int size3KB = 1024 * 1024 * 3;
        String str3KB1 = RandomStringUtils.randomAscii(size3KB + 1);
        domain3.setContents(str3KB1);
        domain3.setTitle("サイズだけ");
        MailSend mailSend3 = new MailSend();
        // 3KBでエラー
        try {
            mailSend3.mailSend(domain3, (long)size3KB, null);
            fail("testMailSend3-3");
        } catch (GscmApplicationException e) {
            assertEquals("testMailSend3-3", LIMIT_MAIL_SIZE_ERROR_CODE, e.getCode());
            
        }
        // 3KBOK
        String str3KB = RandomStringUtils.randomAscii(size3KB);
        domain3.setContents(str3KB);
        try {
            mailSend3.mailSend(domain3, (long)size3KB, null);
        } catch (GscmApplicationException e) {
            fail(e.getMessage());
            
        }
        
        // 間隔だけ指定
        MailInfoDomain domain4 = new MailInfoDomain();
        domain4.setSendToMailAddress("test@localhost");
        domain4.setTitle("間隔だけ");
        int size2KB = 1024 * 1024 * 2;
        String str2KB = RandomStringUtils.randomAscii(size2KB);
        domain4.setContents(str2KB);
        MailSend mailSend4 = new MailSend();
        StopWatch stopWatch4 = new StopWatch();
        stopWatch4.start();
        mailSend4.mailSend(domain4, null, 2);
        mailSend4.mailSend(domain4, null, 2);
        stopWatch4.stop();
        assertTrue("testMailSend3-3", stopWatch4.getTime() > 2000);
        
        
    }
    
    /**
     * 
     * 異常系
     * 
     * <p>
     * 1.スレッド割り込み
     * </p>
     * 
     * @throws ApplicationException エラー
     * @throws InterruptedException エラー
     */
    public void testMailSend4() throws ApplicationException, InterruptedException {
        
        setReturnNullAtAllTimes(AiMailSend.class, "mailSend");
        
        // 1.スレッド割り込み
        final MailInfoDomain domain1 = new MailInfoDomain();
        final MailSend mailSend1 = new MailSend();

        int size100B = 1024 * 100;
        String str101B = RandomStringUtils.randomAscii(size100B + 1);
        domain1.setContents(str101B);
        domain1.setSendToMailAddress("test@localhost");
        domain1.setTitle("割り込み");
        
        Thread thread1 = new Thread(new Runnable() {
            public void run() {
                
                try {
                    mailSend1.mailSend(domain1, (long)1024 * 1024, 60);
                } catch (ApplicationException e) {
                    e.printStackTrace();
                }
            }
            
        });
        
        mailSend1.mailSend(domain1);
        thread1.start();
        Thread.sleep(5);
        thread1.interrupt();
    }
    
    
    
    /**
     * 
     * テストに使用する添付ファイルを作成する
     * 
     * <p>
     * 指定サイズの添付ファイル用のファイルを作成する
     * </p>
     * 
     * @param size ファイルサイズ
     * @return 作成したファイル
     */
    private File createTestFile(int size) {
        String str = RandomStringUtils.randomAscii(size);
        File file = null;
        OutputStream out = null;
        try {
            file = File.createTempFile("MailSendTest", null);
            out = new BufferedOutputStream(new FileOutputStream(file));
            out.write(str.getBytes());
        } catch (Exception e) {
            fail(e.getMessage());
        } finally {
            try {
                out.close();
            } catch (IOException e) {
                fail(e.getMessage());
                e.printStackTrace();
            }
        }
        file.deleteOnExit();
        return file;
    }
    
    /**
     * 
     * メール送信を多重で送るためのスレッド
     * 
     * <p>
     * メール送信を多重で送るためのスレッド
     * </p>
     *
     * @author $Author: 10088DS01586 $
     * @version $Revision: 5759 $
     */
    private static class MailSendThread extends Thread {
        
        /** スレッド番号 */
        int threadSeq = 0;
        
        /**
         * 
         * デフォルトコンストラクタ。
         * 
         * @param seq スレッド番号
         *
         */
        public MailSendThread(int seq) {
            threadSeq = seq;
        }

        /**
         * メール送信
         * {@inheritDoc}
         * @see java.lang.Thread#run()
         */
        public void run() {
            MailInfoDomain domain = new MailInfoDomain();
            domain.setSendToMailAddress("test@localhost");
            domain.setContents("Thread test");
            domain.setTitle(String.format("Thread seq = %d", threadSeq));
            MailSend mailSend = new MailSend();
            try {
                mailSend.mailSend(domain);
            } catch (ApplicationException e) {
                e.printStackTrace();
            }
            
        }
        
    }

}
