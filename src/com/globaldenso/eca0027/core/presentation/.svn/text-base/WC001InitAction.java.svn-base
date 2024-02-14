/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MAX_ERT_TT_PLTZ_ITEM;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_WC001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WINDOW_ID_0;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.WC001CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.WC001ListDomain;
import com.globaldenso.gscm.framework.presentation.ScreenInfoDomain;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.StringUtil;

/**
 *    This is an initial display action class of a return recommendation packing-style create, re printing, and a cancellation screen.
 * <br />返却推奨荷姿作成・再印刷・キャンセル画面の初期表示アクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":WC001.jsp
 *     - "error":WC001.jsp
 * </pre>
 * 
 * @author $Author: 810833843 $
 * @version $Revision: 7707 $
 */
public class WC001InitAction extends WC001AbstractAction {

    /**
     * constructor
     * <br />デフォルトコンストラクタです。
     */
    public WC001InitAction() {
        super();
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#isScreenInfoStack()
     */
    protected boolean isScreenInfoStack() {
        return true;
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws ApplicationException {

        WC001ActionForm wc001Form = prepareForm((WC001ActionForm) form);
        
        // Setting of a list domain
        // リストドメインの設定
        if (StringUtil.getEmptyToBlank(wc001Form.getCriteriaDomain().getActionSelect()).equals("")) {
            wc001Form.reset(mapping, request);
            wc001Form.setListDomainList(this.prepareListDomain());
        }
        wc001Form.setCriteriaDomain(this.prepareCriteriaDomain(wc001Form.getCriteriaDomain()));

        // Screen fields attributes
        // 画面表示制御
        controlDisplay(wc001Form, request);
        
        return FORWARD_SUCCESS;
    }
    
    /**
     * Set up action form.
     * <br />アクションフォームを設定します。
     *
     * @param form Action form<br />アクションフォーム
     * @return Action form<br />アクションフォーム
     */
    protected WC001ActionForm prepareForm(WC001ActionForm form) {
        
        form.setScreenId(SCREEN_ID_WC001);
        
        return form;
    }

    /**
     *    Session information is deleted.
     * <br />セッション情報を削除します。
     */
    protected void removeCreateInfo() {
        // Acquisition of window information domain
        // ウィンドウ情報ドメインの取得
        WindowInfoDomain windowInfo = (WindowInfoDomain) DensoContext.get().getGeneralArea(WINDOW_ID_0);
        
        // delete of the search condition of a Create screen
        // Create画面の検索条件の削除
        ScreenInfoDomain screenInfo = (ScreenInfoDomain) windowInfo.getScreenInfo().get(SCREEN_ID_WC001);
        if (screenInfo != null) {
            screenInfo.setActionForm(null);
        }
    }
    
    /**
     * Set up a condition domain.
     * <br />条件ドメインを設定します。
     *
     * @param criteriaDomain Condition domain<br />条件ドメイン
     * @return List domain<br />リストドメイン
     */
    protected WC001CriteriaDomain prepareCriteriaDomain(WC001CriteriaDomain criteriaDomain) {
        
        // Initial selection of CreateNew
        // CreateNew初期選択
        if (StringUtil.getEmptyToBlank(criteriaDomain.getActionSelect()).equals("")) {
            criteriaDomain.setActionSelect("1");
            // The initial value of Freight Res is Collect deferred payment.
            // Freight Resの初期値はCollect 後払い
            criteriaDomain.setFreightResponsibleCd("C");
            // The initial value of LD CD is "F."
            // LD CDの初期値は"F"
            criteriaDomain.setLoadingCd("F");
            
        }
        
        return criteriaDomain;
    }

    /**
     * Set up a list domain.
     * <br />リストドメインを設定します。
     *
     * @return Action form<br />アクションフォーム
     */
    protected List<WC001ListDomain> prepareListDomain() {

        List<WC001ListDomain> listDomainList = new ArrayList<WC001ListDomain>();
        for (int i = 0; i < MAX_ERT_TT_PLTZ_ITEM; i++) {
            WC001ListDomain domain = new WC001ListDomain();
            listDomainList.add(domain);
        }
        return listDomainList;
    }
}
