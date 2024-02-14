/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.eca0027.core.business.domain.W2002CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W2003CriteriaDomain;
import com.globaldenso.gscm.framework.presentation.ScreenInfoDomain;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.CommonUtil;

import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W2002;

/**
 *    This is an initial display action class of a Packaging Instruction (=Pull) Create screen.
 * <br />梱包指示Create画面の初期表示アクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":W2003.jsp
 *     - "error":W2003.jsp
 * </pre>
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W2003InitAction extends W2003AbstractAction {

    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W2003InitAction() {
        super();
    }

    /**
     * {@inheritDoc}
     * <pre>
     * The copy of - Header information
     *       The following item of the header information saved at the session is set as a search-condition domain.
     *       - Shipper CD
     *       - CUSTOMER CODE
     *       - LEGACY SHIP TO
     *       - TRANSPORT CODE
     *       - PLANT CODE
     *       - LEGACY WAREHOUSE CODE
     *       - PALLETIZE INSTRUCTION DATE
     *       - CUSTOMER PO NO
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
     *     ・梱包指示日
     *     ・得意先PO NO
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws Exception {

        W2003ActionForm w2003Form = (W2003ActionForm) form;
        
        // The copy of a Header information
        // Header情報のコピー
        copyHeaderInfo(w2003Form);
        
        return FORWARD_SUCCESS;
    }

    /**
     *    A Header information is copied to a search-condition domain.
     * <br />Header情報を検索条件ドメインにコピーします。
     *
     * @param form Action form of a Packaging Instruction (=Pull) Create screen<br />梱包指示Create画面のアクション・フォーム
     */
    protected void copyHeaderInfo(W2003ActionForm form) {
        // Acquisition of a Header information
        // Header情報の取得
        WindowInfoDomain windowInfo = (WindowInfoDomain) DensoContext.get().getGeneralArea(form.getWindowId());
        ScreenInfoDomain screenInfo = windowInfo.getScreenInfo().get(SCREEN_ID_W2002);
        W2002CriteriaDomain w2002Criteria = ((W2002ActionForm) screenInfo.getActionForm()).getW2002CriteriaDomain();
        
        // Acquisition of a search-condition domain
        // 検索条件ドメインの取得
        W2003CriteriaDomain w2003Criteria = form.getW2003CriteriaDomain();
        
        // The copy of a Header information
        // Header情報のコピー
        CommonUtil.copyPropertiesDomainToDomain(w2003Criteria, w2002Criteria);
    }
}
