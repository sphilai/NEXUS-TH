/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WINDOW_ID_0;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W5002;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.gscm.framework.presentation.ScreenInfoDomain;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;

/**
 * The Initialize action class of Shipping Confirmation Main screen
 * <br />出荷確認Main画面の初期表示アクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":W5001.jsp
 *     - "error":W5001.jsp
 * </pre>
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W5001InitAction extends W5001AbstractAction {

    /**
     * constructor.
     */
    public W5001InitAction() {
        super();
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * - No processing
     *
     * - 処理なし
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws Exception {
        
        // Delete the session information.
        // セッション情報の削除
        removeHeaderInfo();
        
        // Display control of the Main screen.
        // Main画面の表示制御
        controlDisplay((W5001ActionForm) form);
        
        return FORWARD_SUCCESS;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#isScreenInfoStack()
     */
    @Override
    protected boolean isScreenInfoStack() {
        return false;
    }
    
    /**
     * Delete the information stored in the shipping confirmation Header screen.
     * <br />出荷確認Header画面で保存された情報を削除します。
     * <pre>
     * - Remove Header screen of information to key the screen ID.
     *
     * - 画面IDをキーにHeader画面の情報を削除する。
     * </pre>
     */
    protected void removeHeaderInfo() {
        
        // Acquisition of window information domain.
        // ウィンドウ情報ドメインの取得
        WindowInfoDomain windowInfo = (WindowInfoDomain) DensoContext.get().getGeneralArea(WINDOW_ID_0);
        
        // Delete the Header screen information.
        // Header画面情報の削除
        ScreenInfoDomain screenInfo = (ScreenInfoDomain) windowInfo.getScreenInfo().get(SCREEN_ID_W5002);
        if (screenInfo != null) {
            screenInfo.setActionForm(null);
            
            Map<String, ScreenInfoDomain> screenInfoMap = windowInfo.getScreenInfo();
            if (screenInfoMap.containsKey(SCREEN_ID_W5002)) {
                screenInfoMap.remove(SCREEN_ID_W5002);
            }
        }
    }
    
    /**
     * Make the display control of shipping confirmation Main screen.
     * <br />出荷確認Main画面の表示制御を行います。
     * <pre>
     * - Hide Search Results Area.
     *
     * - 検索結果エリアを非表示にする。
     * </pre>
     *
     * @param form action form
     */
    protected void controlDisplay(W5001ActionForm form) {
        form.setDisplayList(false);
    }
}
