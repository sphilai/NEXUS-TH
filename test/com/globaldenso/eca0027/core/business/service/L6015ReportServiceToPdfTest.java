package com.globaldenso.eca0027.core.business.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Date;

import jp.co.dgic.testing.common.virtualmock.MockObjectManager;

import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.ai.library.filemanagerstream.business.domain.FileManagementDomain;
import com.globaldenso.eca0027.core.AbstractEca0027Test;
import com.globaldenso.gscm.framework.util.DateUtil;

/**
 * L6015ReportServiceImplの単体テストクラス。(サンプルアプリの動作確認用)
 * 
 * @version $Revision: 5759 $
 */
@RunWith(Enclosed.class)
public class L6015ReportServiceToPdfTest {

    /**
     * デフォルトコンストラクタ。
     */
    public L6015ReportServiceToPdfTest() {
    }
    
    /**
     * L6015の単体テストクラスです。(結合なし／Springなし／Virtual Mock Objectsあり)
     *
     * @version $Revision: 5759 $
     */
    @RunWith(Parameterized.class)
    public static class L6015TestNoJasperPrint extends AbstractEca0027Test {
        

        /**
         * コンストラクタ。
         *
         * @param singleFlg 単品フラグ
         * @param instrFlg 荷揃え指示品表示フラグ
         * @param airFlg 輸送手段AIR表示フラグ
         * @param brokenFlg ロット割れフラグ
         * @param remarks 注意書き
         */
        public L6015TestNoJasperPrint(boolean singleFlg, boolean instrFlg, boolean airFlg, boolean brokenFlg, String remarks) {
        }

        /**
         * テストパラメータ
         * 
         * @return テストパラメータ
         */
        @Parameters
        public static Iterable<Object[]> getParameters() {
            return Arrays.asList(new Object[][] {
                { true, false, false, false, "Case Mark Label No、囲み線あり" },
                { false, false, false, false, "CML No、囲み線なし\r\n各種表示なし" },
                { true, true, false, false, "Instr表示あり" },
                { true, false, true, false, "AIR表示あり" },
                { true, false, false, true, "ロット割れ表示あり" },
            });
        }
        
        
        /**
         * 帳票を作成します。(結合なし)
         * @throws ApplicationException Exception 
         */
        @Test
        public void test() throws ApplicationException {
            FileManagementDomain fileDomain = new FileManagementDomain();
            try {
                FileInputStream inputStream = new FileInputStream(new File("C:/Eclipse_AIJ2/workspace/NEXUS_EXPORT/test/com/globaldenso/eca0027/core/business/service/ReportImageTest.jpg"));
                try {
                    fileDomain.setFileData(inputStream);
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    closeQuietly(inputStream);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            
            MockObjectManager.setReturnValueAtAllTimes(L6015ReportServiceImpl.class, "getFileDomain", fileDomain );
            L6015ReportService l6015ReportService =
                (L6015ReportService) getContext().getBean("l6015ReportService");
         // テスト用データ
            String shipper = "1";
            String invoiceNo = "1";
            Date invoiceIssueDt = DateUtil.parseDate("2014/02/07 1:00:00", "yyyy/MM/dd HH:mm:ss");
            String invoiceTemplateNo = "1";
            File report = l6015ReportService.searchSalesCntrctAtchedForRt(shipper, invoiceNo, invoiceIssueDt, invoiceTemplateNo, "UTF-8", "yyyy/MM/dd");
            displayReport(report, true);

        }
    }
    
}
