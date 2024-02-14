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
import com.globaldenso.eca0027.core.business.domain.W6003CriteriaDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * Move to Create action class of Documentation Invoice Header screen.
 * <br />通関書類作成業務 Invoice Header画面のMove to Createアクションクラスです。
 * 
 * @author $Author: y-hazama$
 * @version $Revision: 6712$
 */
public class W6003MoveToCreateAction extends W6003AbstractAction {
    /**
     * W6003MoveToCreateFacadeService
     */
    protected SearchFacadeService<Void, W6003CriteriaDomain> w6003MoveToCreateFacadeService;
    
    /**
     * The default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W6003MoveToCreateAction() {
        super();
    }

    /**
     * Setter method for w6003MoveToCreateFacadeService.
     *
     * @param moveToCreateFacadeService Set for w6003MoveToCreateFacadeService
     */
    public void setW6003MoveToCreateFacadeService(
        SearchFacadeService<Void, W6003CriteriaDomain> moveToCreateFacadeService) {
        w6003MoveToCreateFacadeService = moveToCreateFacadeService;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * Storage of other screen display session information
     * </pre>
     * <pre>
     * 他画面表示用セッション情報の保管
     * </pre>
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response)
        throws Exception {

        W6003ActionForm w6003Form = (W6003ActionForm) form;

        // Input check
        // 入力チェック
        validateHeader(w6003Form);
        
        // Setup of a taking over value
        //引継値の設定
        w6003Form.setStgCom(w6003Form.getW6003CriteriaDomain().getStgCom());
        w6003Form.setStgWh(w6003Form.getW6003CriteriaDomain().getStgWh());
        w6003Form.setTrnsCd(w6003Form.getW6003CriteriaDomain().getTrnsCd());
        w6003Form.setContainerLooseTyp(w6003Form.getW6003CriteriaDomain().getContainerLooseTyp());
        w6003Form.setCustomTimingTyp(w6003Form.getW6003CriteriaDomain().getCustomTimingTyp());
        
        return FORWARD_SUCCESS;
    }
    /**
     * Check the VALUE entered in the Documentation Invoice Header screen.
     * <br />通関書類作成業務 Invoice Header画面で入力された値をチェックします。
     *
     * @param form Action Form of Shipping Actuality Header screen<br />
     * 船積実績Header画面のアクションフォーム
     * @throws ApplicationException If there is an input error<br />
     * 入力エラーがある場合
     */
    protected void validateHeader(W6003ActionForm form) throws ApplicationException {
        // Acquisition of a condition domain 
        // 条件ドメインの取得
        W6003CriteriaDomain criteriaDomain = form.getW6003CriteriaDomain();
        
        // Setup of a condition domain 
        // 条件ドメインの設定
        ActionUtil.prepareBusinessDomain(criteriaDomain, form.getWindowId(), form.getScreenId());
        
        // Execution of an input check 
        // 入力チェックの実行
        w6003MoveToCreateFacadeService.search(criteriaDomain);
    }

}
