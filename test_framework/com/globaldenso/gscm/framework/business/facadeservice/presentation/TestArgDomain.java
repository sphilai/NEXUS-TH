/*
 * Project : GSCMFramework
 *
 * 更新日      更新者        更新内容
 * 2013/07/11  DNITS         新規作成
 *
 * $Id: TestArgDomain.java 5759 2014-06-27 08:14:53Z 10088DS01586 $
 *
 * Copyright (c) 2011 DENSO IT SOLUTIONS. All rights reserved.
 */
package com.globaldenso.gscm.framework.business.facadeservice.presentation;

import java.util.ArrayList;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

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
public class TestArgDomain extends AbstractDomain {

    /**
     * フィールドの役割を記述してください。
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * エクセプション出すか
     */
    private TestExceptionEnum throwException;
    
    /**
     * テーブルドメインのリスト
     */
    private ArrayList<TestFacadeTableDomain> tableDomainList = null;


    /**
     * 
     * デフォルトコンストラクタ。
     *
     */
    public TestArgDomain() {}
    
    /**
     * throwException のゲッターメソッドです。
     *
     * @return the throwException
     */
    public TestExceptionEnum getThrowException() {
        return throwException;
    }

    /**
     * throwException のセッターメソッドです。
     *
     * @param throwException throwException に設定する
     */
    public void setThrowException(TestExceptionEnum throwException) {
        this.throwException = throwException;
    }

    /**
     * tableDomainList のゲッターメソッドです。
     *
     * @return the tableDomainList
     */
    public ArrayList<TestFacadeTableDomain> getTableDomainList() {
        return tableDomainList;
    }

    /**
     * tableDomainList のセッターメソッドです。
     *
     * @param tableDomainList tableDomainList に設定する
     */
    public void setTableDomainList(ArrayList<TestFacadeTableDomain> tableDomainList) {
        this.tableDomainList = tableDomainList;
    }

}
