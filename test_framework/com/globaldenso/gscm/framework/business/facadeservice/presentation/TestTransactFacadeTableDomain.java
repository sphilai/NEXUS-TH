/*
 * Project : GSCMFramework
 *
 * 更新日      更新者        更新内容
 * 2013/07/11  DNITS         新規作成
 *
 * $Id: TestTransactFacadeTableDomain.java 5759 2014-06-27 08:14:53Z 10088DS01586 $
 *
 * Copyright (c) 2011 DENSO IT SOLUTIONS. All rights reserved.
 */
package com.globaldenso.gscm.framework.business.facadeservice.presentation;

/**
 * テスト用ドメイン
 * 
 * <p>
 * テスト用ドメイン
 * </p>
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class TestTransactFacadeTableDomain extends TestFacadeTableDomain {
    
    /**
     * フィールドの役割を記述してください。
     */
    private static final long serialVersionUID = 1L;
    
    /** トランザクション種類 */
    private TransactEnum transact;

    /**
     * 
     * デフォルトコンストラクタ。
     *
     */
    public TestTransactFacadeTableDomain(){}

    /**
     * transact のゲッターメソッドです。
     *
     * @return the transact
     */
    public TransactEnum getTransact() {
        return transact;
    }

    /**
     * transact のセッターメソッドです。
     *
     * @param transact transact に設定する
     */
    public void setTransact(TransactEnum transact) {
        this.transact = transact;
    }

}
