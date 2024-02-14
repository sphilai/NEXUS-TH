package com.globaldenso.eca0027.core.business.service;

import java.io.File;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.AbstractEca0027Test;

/**
 * L2005ReportServiceImplの単体テストクラスです。
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class L2005ReportServiceTest extends AbstractEca0027Test {

    /**
     * Interface
     */
    private L2005ReportService l2005ReportService;
    
    /**
     * デフォルトコンストラクタ。
     */
    public L2005ReportServiceTest() {
    }

    /**
     * 
     * 前処理
     *
     * @throws Exception エラーが発生した場合が発生した場合
     */
    @Before
    public void setUp() throws Exception {
        l2005ReportService = (L2005ReportService) getContext().getBean("l2005ReportService");
    }

//    /**
//     * 正常ケース
//     */
//    @Test
//    public void testNormal_1() throws Exception {
//        Timestamp errRpDate = new Timestamp(114,0,22,1,0,0,0);
//        File file = l2005ReportService.searchCmlMixTagErrRep("nexus", errRpDate, "yyyy/MM/dd");
//        assertNotNull(file);
//    }
//    
//
//    /**
//     * 異常ケース
//     * 
//     * 帳票出力件数がゼロ件の場合Exceptionをスロー
//     */
//    @Test
//    public void testErr_1() throws Exception {
//        Timestamp errRpDate = new Timestamp(114,0,22,1,0,0,0);
//        try {
//            l2005ReportService.searchCmlMixTagErrRep("999", errRpDate, "yyyy/MM/dd");
//            fail("この行は、実行されないはず");
//        } catch (GscmApplicationException e) {
//            assertEquals(GSCM_E0_0010, e.getMessage());
//        }
//    }

    /**
     * 帳票を作成します。(結合なし)
     * @throws ApplicationException Exception 
     */
    @Test
    public void test() throws ApplicationException {
        String dscId = "srawi09";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        try {
            Date date = sdf.parse("20130731135300");
            Timestamp errRpDate = new Timestamp(date.getTime());
            File report = l2005ReportService.searchCmlMixTagErrRep(dscId, errRpDate, "yyyy/MM/dd");
            displayReport(report, true);
        } catch (Exception e) {
            ;
        }
    }
}

