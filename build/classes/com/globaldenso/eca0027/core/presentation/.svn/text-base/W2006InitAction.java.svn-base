/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W2006CriteriaDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.DeleteFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * The Init action class of Multiple Item No. in 1Box PKG Main Screen
 * <br />小箱内多品番Header画面の初期表示アクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":W2006.jsp
 *     - "error":W2006.jsp
 * </pre>
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W2006InitAction extends W2006AbstractAction {

    /**
     * InitFacade service
     * <br />InitFacadeサービス
     */
    protected DeleteFacadeService<Void, W2006CriteriaDomain> w2006InitFacadeService;
    
    /**
     * constructor.
     */
    public W2006InitAction() {
        super();
    }

    /**
     * Setter method for w2006InitFacadeService.
     *
     * @param initFacadeService Set for w2006InitFacadeService
     */
    public void setW2006InitFacadeService(
        DeleteFacadeService<Void, W2006CriteriaDomain> initFacadeService) {
        w2006InitFacadeService = initFacadeService;
    }
    
    /**
     * {@inheritDoc}.
     * <pre>
     * A delete of - session information
     *       The search condition of a Packaging Instruction (=Pull) Create screen is deleted.
     *
     *
     * The delete process of - Mix-Tag-Item-No work and a Mix Tag RT Work
     *       The data which the user of each work registered is deleted.
     * 
     * 
     * - セッション情報の削除
     *     梱包指示Create画面の検索条件を削除する
     * 
     * 
     * - MIXED品番ワークおよびMIXED用RT材ワークの削除処理
     *     各ワークのユーザが登録したデータを削除する
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws ApplicationException {
        
        W2006ActionForm w2006Form = (W2006ActionForm) form;
        
        // A delete of Mix-Tag-Item-No work, and a Mix Tag RT Work
        // MIXED品番ワークおよびMIXED用RT材ワークの削除
        removeMixTagAndMixTagRt(w2006Form);
        
        // Deactivation of sundry items and a VALUE make it clear in the case of initial display.
        // 初期表示の際に、各種項目の非活性化と値のクリアさせる
        controlDisplay(request, w2006Form);
        
        return FORWARD_SUCCESS;
    }
    
    /**
     *    A Mix-Tag-Item-No work and a Mix Tag RT Work are deleted.
     * <br />MIXED品番ワークおよびMIXED用RT材ワークを削除します。
     * 
     * @param form Action form of a Multiple Item No. in 1Box PKG number Header screen<br />小箱内多品番Header画面のアクション・フォーム 
     * @throws ApplicationException When a Mix-Tag-Item-No work and a Mix Tag RT Work are not able to be deleted<br />MIXED品番ワークおよびMIXED用RT材ワークが削除できなかった場合
     */
    protected void removeMixTagAndMixTagRt(W2006ActionForm form) throws ApplicationException {
        
        // Acquisition of a condition domain
        // 条件ドメインの取得
        W2006CriteriaDomain criteriaDomain = form.getW2006CriteriaDomain();
        
        // Setting of a condition domain
        // 条件ドメインの設定
        ActionUtil.prepareBusinessDomain(criteriaDomain, form.getWindowId(), form.getScreenId());
        
        // A delete of Mix-Tag-Item-No work, and a Mix Tag RT Work
        // MIXED品番ワークおよびMIXED用RT材ワークの削除
        w2006InitFacadeService.delete(criteriaDomain);
    }

}
