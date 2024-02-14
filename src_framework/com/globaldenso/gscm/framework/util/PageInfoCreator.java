/*
 * PROJECT：GSCM 共通機能群
 * PROJECT：GSCM Common Functions
 * 
 * PageInfoDataを作る
 * Create PageInfoData
 * 
 * Version.
 * 1.0.0
 * 
 * Copyright (c) 2013 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.gscm.framework.util;

import java.util.Locale;

import com.globaldenso.ai.common.core.exception.ApplicationException;

/**
 * 
 * PageInfoDataを作る
 * Create PageInfoData
 * 
 * <p>
 * PageInfoDataを作る
 * Create PageInfoData
 * </p>
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public interface PageInfoCreator {
    
    /**
     * 
     * PageInfoDataを作る
     * Create PageInfoData
     * 
     * <p>
     *  PageInfoDataを作る
     *  Create PageInfoData
     * </p>
     * 
     * @param totalCount データの総件数
     * @param totalCount Data total number of record
     * @param countParPage 1ページに表示する件数
     * @param countParPage Number of record of display at one page
     * @param currentPage 現在のページ番号
     * @param currentPage Current page no
     * @param locale ロケール
     * @param locale locale
     * @return 計算結果のPageInfoData
     * @return Calculate result of PageInfoData
     * @throws ApplicationException エラー
     * @throws ApplicationException ApplicationException
     */
    public PageInfoData createPageInfoData(Integer totalCount, Integer countParPage, Integer currentPage, Locale locale) throws ApplicationException;

}
