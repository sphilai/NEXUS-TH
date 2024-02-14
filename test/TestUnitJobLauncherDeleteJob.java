/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */


import com.globaldenso.ai.aijb.test.UnitJobLauncher;
import com.globaldenso.ai.aijb.test.UnitJobLauncherInputDomain;

/**
 * <pre>
 * This is a unit test class of data deletion batch.
 * 不要データ削除バッチの単体テストクラスです。
 * </pre>
 * 
 * @author $Author$
 * @version $Revision$
 */
public class TestUnitJobLauncherDeleteJob {

    /**
     * Default Constructor
     */
    public TestUnitJobLauncherDeleteJob() {
        // default
    }

    /**
     * <pre>
     * 起動メソッド
     * 
     * 各プロパティを設定し、eclipse上で[実行]->[Javaアプリケーション]から実行して下さい。
     * </pre>
     * @param args 実行時引数
     */
    public static void main(String[] args){

        UnitJobLauncherInputDomain dom = new UnitJobLauncherInputDomain(
            "DEL0001",
            "com.globaldenso.eca0027.core.job",
            "applicationContext-ECA0027T0100.xml",
            "",
            "1",
            ""
        );
        UnitJobLauncher.run(dom);
    }
}
