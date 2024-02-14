/*
 * Project : GSCMFramework
 *
 * 更新日      更新者        更新内容
 * 2013/07/11  DNITS         新規作成
 *
 * $Id: TestFacadeTableDao.java 5759 2014-06-27 08:14:53Z 10088DS01586 $
 *
 * Copyright (c) 2011 DENSO IT SOLUTIONS. All rights reserved.
 */
package com.globaldenso.gscm.framework.business.facadeservice.presentation;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;

/**
 * テスト用テーブルDao
 * 
 * <p>
 * テスト用テーブルDao
 * </p>
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public interface TestFacadeTableDao {


    /**
     * 
     * 検索メソッド
     * 
     * <p>
     * 検索メソッド
     * </p>
     * 
     * @return 結果
     * @throws ApplicationException 例外
     */
    public List<TestFacadeTableDomain> selectAll() throws ApplicationException;
    
    /**
     * 
     * 検索メソッド
     * 
     * <p>
     * 検索メソッド
     * </p>
     * 
     * @param domain ドメイン
     * @return 結果
     * @throws ApplicationException 例外
     */
    public TestFacadeTableDomain selectPk(TestFacadeTableDomain domain) throws ApplicationException;
    
    /**
     * 
     * 登録メソッド
     * 
     * <p>
     * 登録メソッド
     * </p>
     * 
     * @param domain 登録ドメイン
     * @throws ApplicationException エラー
     */
    public void create(TestFacadeTableDomain domain) throws ApplicationException;
    
    /**
     * 
     * 更新メソッド
     * 
     * <p>
     * 更新メソッド
     * </p>
     * 
     * @param domain ドメイン
     * @return 件数
     * @throws ApplicationException 例外
     */
    public int update(TestFacadeTableDomain domain) throws ApplicationException;
    
    /**
     * 
     * 削除メソッド
     * 
     * <p>
     * 削除メソッド
     * </p>
     * 
     * @param domain ドメイン
     * @return 件数
     * @throws ApplicationException 例外
     */
    public int delete(TestFacadeTableDomain domain) throws ApplicationException;
}
