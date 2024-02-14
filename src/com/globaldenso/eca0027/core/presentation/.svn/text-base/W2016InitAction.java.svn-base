/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W2015;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W2017;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W2015CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W2016CriteriaDomain;
import com.globaldenso.gscm.framework.presentation.ScreenInfoDomain;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;

/**
 * The Init action class of X-tag Create
 * <br />X-tag Create画面のInitアクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":W2016.jsp
 *     - "error":W2016.jsp
 * </pre>
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W2016InitAction extends W2016AbstractAction {

    /**
     * constructor.
     */
    public W2016InitAction() {
        super();
    }
    
    /**
     * {@inheritDoc}.
     * <pre>
     * The copy of - Header information
     *       The following item of the header information saved at the session is set as a search-condition domain.
     *       - CUR WAREHOUSE COMPANY CODE
     *       - CUR WAREHOUSE CODE
     *       - TRANSPORT CODE
     *       - CONTAINER SORTING KEY
     *       - L/D CD
     *       - SHIP TO COMPANY CODE
     * 
     * 
     * - Header情報のコピー
     *     セッションに保存されているヘッダ情報の下記項目を検索条件ドメインに設定する
     *     ・現在倉庫会社コード
     *     ・現在倉庫コード
     *     ・輸送手段コード
     *     ・コンテナ層別キー
     *     ・荷積位置コード
     *     ・送荷先会社コード
     *     
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws ApplicationException {
        
        W2016ActionForm w2016Form = (W2016ActionForm) form;
        
        // The copy of a Header information
        // Header情報のコピー
        copyHeaderInfo(w2016Form);
        
        return FORWARD_SUCCESS;
    }
    
    /**
     *    A Header information is copied to a search-condition domain.
     * <br />Header情報を検索条件ドメインにコピーします。
     *
     * @param form Action form of a X-TAG Create screen<br />まとめCML Create画面のアクション・フォーム
     */
    protected void copyHeaderInfo(W2016ActionForm form) {
        if (SCREEN_ID_W2015.equals(form.getCallScreenId())){
            // Acquisition of a Header information
            // Header情報の取得
            WindowInfoDomain windowInfo = (WindowInfoDomain) DensoContext.get().getGeneralArea(form.getWindowId());
            ScreenInfoDomain screenInfo = windowInfo.getScreenInfo().get(SCREEN_ID_W2015);
            W2015CriteriaDomain w2015Criteria = ((W2015ActionForm) screenInfo.getActionForm()).getW2015CriteriaDomain();
        
            // Acquisition of a search-condition domain
            // 検索条件ドメインの取得
            W2016CriteriaDomain w2016Criteria = form.getW2016CriteriaDomain();
        
            // The copy of a Header information
            // Header情報のコピー
            w2016Criteria.setCurWhCompCd(w2015Criteria.getCurWhCompCd());
            w2016Criteria.setCurWhCd(w2015Criteria.getCurWhCd());
            w2016Criteria.setTrnsCd(w2015Criteria.getTrnsCd());
            w2016Criteria.setContainerSortingKey(w2015Criteria.getContainerSortingKey());
            w2016Criteria.setLoadingCd(w2015Criteria.getLoadingCd());
            w2016Criteria.setShipToCompCd(w2015Criteria.getShipToCompCd());
            
        } else if (SCREEN_ID_W2017.equals(form.getCallScreenId())){
            // The clearance of listDomain
            // listDomainのクリア
            form.setW2016ListDomainList(null);
        }
    }
}
