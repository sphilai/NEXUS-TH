/*
 * Project : GSCMFramework
 *
 * 更新日      更新者        更新内容
 * 2013/07/11  DNITS         新規作成
 *
 * $Id: TestFacadeTableDomain.java 5759 2014-06-27 08:14:53Z 10088DS01586 $
 *
 * Copyright (c) 2011 DENSO IT SOLUTIONS. All rights reserved.
 */
package com.globaldenso.gscm.framework.business.facadeservice.presentation;

import java.io.Serializable;

/**
 * テスト用テーブルDomain
 * 
 * <p>
 * テスト用テーブルDomain
 * </p>
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class TestFacadeTableDomain implements Serializable {
    
    /**
     * フィールドの役割を記述してください。
     */
    private static final long serialVersionUID = 1L;
    
    /** テーブルキー */
    private Integer id = null;
    
    /** テーブル用項目 */
    private String item = null;
    
    /**
     * 
     * デフォルトコンストラクタ。
     *
     */
    public TestFacadeTableDomain(){}

    /**
     * item のゲッターメソッドです。
     *
     * @return the item
     */
    public String getItem() {
        return item;
    }

    /**
     * item のセッターメソッドです。
     *
     * @param item item に設定する
     */
    public void setItem(String item) {
        this.item = item;
    }

    /**
     * id のゲッターメソッドです。
     *
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * id のセッターメソッドです。
     *
     * @param id id に設定する
     */
    public void setId(Integer id) {
        this.id = id;
    }


}
