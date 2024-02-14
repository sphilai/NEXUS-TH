/*
 * PROJECT：GSCM 共通機能群
 * PROJECT：GSCM Common Functions
 * 
 * PageInfoDataを作る
 * Create PageInfoData
 * 
 * Version.
 * 1.0.1
 * 
 * Copyright (c) 2013 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.gscm.framework.presentation;

import java.io.Serializable;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.gscm.framework.constants.Constants;
import com.globaldenso.gscm.framework.util.ActionUtil;
import com.globaldenso.gscm.framework.util.PageInfoCreator;
import com.globaldenso.gscm.framework.util.PageInfoData;

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
public class ActionPageInfoCreator implements PageInfoCreator, Serializable {
    /**
     * シリアルバージョンID。
     * SerialVersionUID
     */
    private static final long serialVersionUID = 1L;

    /** アクションフォーム */
    /** Action form */
    private AbstractActionForm form = null;
    
    /** マッピング */
    /** Mapping */
    private ActionMapping mapping = null;
    
    /** リクエスト */
    /** Request */
    private transient HttpServletRequest request = null;
    
    /**
     * 
     * コンストラクタ。
     * Constructor
     *
     * @param form フォーム
     * @param form Form
     * @param mapping マッピング
     * @param mapping Mapping
     * @param request リクエスト
     * @param request Request
     */
    public ActionPageInfoCreator(AbstractActionForm form, ActionMapping mapping, HttpServletRequest request) {
        this.form = form;
        this.mapping = mapping;
        this.request = request;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.util.PageInfoCreator#createPageInfoData(int, int)
     */
    public PageInfoData createPageInfoData(Integer totalCount, Integer countParPage, Integer currentPage, Locale locale) throws ApplicationException {
        PageInfo pageInfo = ActionUtil.createPageInfo(this.form, totalCount, this.mapping, this.request);
        storePageInfoToRequest(pageInfo, request);
        return pageInfo;
    }
    
    /**
     * 
     * PageInfoの内容をRequestに設定する
     * Set content of PageInfo to Request
     * 
     * <p>
     * PageInfoの内容をRequestに設定する
     * Set content of PageInfo to Request
     * </p>
     * 
     * @param pageInfo ページ情報
     * @param pageInfo Page information
     * @param request リクエスト
     * @param request Request
     */
    public static void storePageInfoToRequest(PageInfo pageInfo, HttpServletRequest request) {
        
        // デフォルトの検索パス
        // Default search path
        // 検索パスとページ切り替えのパスが違う場合は、JSPのPage Contextに同じ名前で値を設定しておく
        // When search path is different from page changing path,set value as same name at JSP Page Context
        request.setAttribute(Constants.PAGING_PAGE_INFO,   pageInfo);
        request.setAttribute(Constants.PAGING_SEARCH_PATH, pageInfo.getSearchPath());
        request.setAttribute(Constants.PAGING_FORM_NAME,   pageInfo.getFormName());
    }

}
