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
import com.globaldenso.eca0027.core.business.domain.W2010CriteriaDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.DeleteFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 *    This is an Init action class of a CML Header screen.
 * <br />CML Header画面のInitアクションクラスです。
 * 
 * <pre>
 * forward name-path mappings:
 *     - "success":W2010.jsp
 *     - "error":W2010.jsp
 * </pre>
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W2010InitAction extends W2010AbstractAction {

    /**
     * Initialize Facade service
     * <br />初期化Facadeサービス
     */
    protected DeleteFacadeService<Void, W2010CriteriaDomain> w2010InitFacadeService;

    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W2010InitAction() {
        super();
    }

    /**
     * Setter method for w2010InitFacadeService.
     * 
     * @param initFacadeService Set for w2010InitFacadeService
     */
    public void setW2010InitFacadeService(
        DeleteFacadeService<Void, W2010CriteriaDomain> initFacadeService) {
        w2010InitFacadeService = initFacadeService;
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * A delete of - Palletize Item Work
     *       A login user's DSC-ID is deleted for a temporary work information on a Palletize Item to a key.
     *
     * - Display control
     *       Set screen field attributes ({@link W2010AbstractAction#controlDisplay(HttpServletRequest, W2010ActionForm)}).
     *       Set search-results fields inactive.
     *
     * - パレタイズ対象品ワークの削除
     *     一時的なパレタイズ対象品のワーク情報を、ログインユーザのDSC-IDをキーに削除
     *     
     * - 表示制御
     *     画面項目の活性制御を行う ({@link W2010AbstractAction#controlDisplay(HttpServletRequest, W2010ActionForm)}
     *     検索結果エリアを非表示にする
     *     
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping,
     *      org.apache.struts.action.ActionForm,
     *      javax.servlet.http.HttpServletRequest,
     *      javax.servlet.http.HttpServletResponse)
     */
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response)
        throws ApplicationException {

        // A delete of Palletize Item Work
        // パレタイズ対象品ワークの削除
        W2010ActionForm w2010Form = (W2010ActionForm)form;
        removePltzItemItemNo(w2010Form);

        // Deactivation of sundry items and a VALUE make it clear in the case of initial display.
        // 初期表示の際に、各種項目の非活性化と値のクリアさせる
        controlDisplay(request, w2010Form);

        return FORWARD_SUCCESS;
    }

    /**
     * The delete process of a Palletize Item Work
     * <br />
     * パレタイズ対象品ワークの削除処理
     * 
     * @param form Action form<br />アクションフォーム
     * @throws ApplicationException When a Palletize Item Work is not able to be deleted<br />パレタイズ対象品ワークが削除できなかった場合
     */
    protected void removePltzItemItemNo(W2010ActionForm form)
        throws ApplicationException {

        // Acquisition of a condition domain
        // 条件ドメインの取得
        W2010CriteriaDomain criteriaDomain = form.getW2010CriteriaDomain();

        // Setting of a condition domain
        // 条件ドメインの設定
        ActionUtil.prepareBusinessDomain(criteriaDomain, form.getWindowId(),
            form.getScreenId());

        // A delete of Palletize Item Work
        // パレタイズ対象品ワークの削除
        w2010InitFacadeService.delete(criteriaDomain);
    }

}
