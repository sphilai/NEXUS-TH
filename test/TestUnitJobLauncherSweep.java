/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */


import com.globaldenso.ai.aijb.test.UnitJobLauncher;

/**
 * <pre>
 * UnitJobLauncherで作成されたテストデータの削除クラスです。
 * 
 * [結果]
 * 引数(テストID)に紐付くテストデータが削除されます。
 * 
 * [前提]
 * なし
 * 
 * [処理]
 * 本クラスを実行すると、引数(テストID)に紐付く、ジョブ管理・キュー管理・キュー実行履歴・リクエスト管理のテストデータが
 * 削除されます。
 * </pre>
 */
public class TestUnitJobLauncherSweep{

    /**
     * Default Constructor
     */
    public TestUnitJobLauncherSweep() {
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

        //UnitJobLauncher.sweep("DEL0001");
        UnitJobLauncher.sweep("GINV001");
    }
}
