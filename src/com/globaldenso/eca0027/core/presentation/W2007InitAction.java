/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W2006;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.eca0027.core.business.domain.W2006CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W2007CriteriaDomain;
import com.globaldenso.gscm.framework.presentation.ScreenInfoDomain;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;

/**
 * The Back to Main Screen action class of Multiple Item No. in 1Box PKG Create Screen
 * <br />小箱内多品番Create画面の初期表示アクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":W2007.jsp
 *     - "error":W2007.jsp
 * </pre>
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W2007InitAction extends W2007AbstractAction {

    /**
     * constructor.
     */
    public W2007InitAction() {
        super();
    }
    
    /**
     * {@inheritDoc}.
     * <pre>
     * The copy of - Header information
     *       The following item of the header information saved at the session is set as a search-condition domain.
     *       - Shipper CD
     *       - CUSTOMER CODE
     *       - LEGACY SHIP TO
     *       - TRANSPORT CODE
     *       - PLANT CODE
     *       - LEGACY WAREHOUSE CODE
     *       - Packaging Instruction (=Pull) NO
     *       - W/H Company CD
     *       - W/H CD
     *
     * - Display control
     *       Set search-results fields inactive.
     *
     * A delete of - session information
     *       The search condition of a Multiple Item No. in 1Box PKG number Register screen is deleted.
     * 
     * 
     * - Header情報のコピー
     *     セッションに保存されているヘッダ情報の下記項目を検索条件ドメインに設定する
     *     ・荷主コード
     *     ・得意先コード
     *     ・LEGACY送荷先
     *     ・輸送手段コード
     *     ・製造部工場区分
     *     ・LEGACY倉庫コード
     *     ・梱包指示NO
     *     ・倉庫会社コード
     *     ・倉庫コード
     *     
     * - 表示制御
     *     検索結果エリアを非表示にする
     *     
     * - セッション情報の削除
     *     小箱内多品番Register画面の検索条件を削除する
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws Exception {
        
        W2007ActionForm w2007Form = (W2007ActionForm) form;
        // The copy of a Header information
        // Header情報のコピー
        copyHeaderInfo(w2007Form);
        
        // Display control
        // 表示制御
        controlDisplay(request, w2007Form);
        
        return FORWARD_SUCCESS;
    }
    
    /**
     *    A Header information is copied to a search-condition domain.
     * <br />Header情報を検索条件ドメインにコピーします。
     *
     * @param form Action form of a Multiple Item No. in 1Box PKG Create screen<br />小箱内多品Create画面のアクション・フォーム
     */
    protected void copyHeaderInfo(W2007ActionForm form) {
        // Acquisition of a Header information
        // Header情報の取得
        WindowInfoDomain windowInfo = (WindowInfoDomain) DensoContext.get().getGeneralArea(form.getWindowId());
        ScreenInfoDomain screenInfo = windowInfo.getScreenInfo().get(SCREEN_ID_W2006);
        W2006CriteriaDomain w2006Criteria = ((W2006ActionForm) screenInfo.getActionForm()).getW2006CriteriaDomain();
        
        // Acquisition of a search-condition domain
        // 検索条件ドメインの取得
        W2007CriteriaDomain w2007Criteria = form.getW2007CriteriaDomain();
        
        // The copy of a Header information
        // Header情報のコピー
        w2007Criteria.setShipperCd(w2006Criteria.getShipperCd());
        w2007Criteria.setCustomerCd(w2006Criteria.getCustomerCd());
        w2007Criteria.setLgcyShipTo(w2006Criteria.getLgcyShipTo());
        w2007Criteria.setTrnsCd(w2006Criteria.getTrnsCd());
        w2007Criteria.setPlntCd(w2006Criteria.getPlntCd());
        w2007Criteria.setLgcyWhCd(w2006Criteria.getLgcyWhCd());
        w2007Criteria.setPltzInstrNo(w2006Criteria.getPltzInstrNo());
        w2007Criteria.setWhCompCd(w2006Criteria.getWhCompCd());
        w2007Criteria.setWhCd(w2006Criteria.getWhCd());
    }
}
