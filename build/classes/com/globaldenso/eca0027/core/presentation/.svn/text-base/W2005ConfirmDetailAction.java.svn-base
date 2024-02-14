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
import com.globaldenso.eca0027.core.business.domain.W2005UpdateDomain;
import com.globaldenso.eca0027.core.business.facadeservice.presentation.W2005ConfirmDetailFacadeServiceImpl;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.ProcessFacadeService;

/**
 * The ConfirmDetail action class of Multiple Item No. in 1Box PKG Main Screen
 * <br />小箱内多品番Main画面のConfirmDetailアクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":/W2008Init.do
 *     - "error":W2005.jsp
 * </pre>
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W2005ConfirmDetailAction extends W2005AbstractAction {

    /**
     * ConfirmDetailFacade service
     * <br />ConfirmDetailFacadeサービス
     */
    protected ProcessFacadeService<Void, W2005UpdateDomain> w2005ConfirmDetailFacadeService;
    
    /**
     * constructor.
     */
    public W2005ConfirmDetailAction() {
        super();
    }

    /**
     * Setter method for w2005ConfirmDetailFacadeService.
     *
     * @param confirmDetailFacadeService Set for w2005ConfirmDetailFacadeService
     */
    public void setW2005ConfirmDetailFacadeService(
        ProcessFacadeService<Void, W2005UpdateDomain> confirmDetailFacadeService) {
        w2005ConfirmDetailFacadeService = confirmDetailFacadeService;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#isScreenInfoStack()
     */
    protected boolean isScreenInfoStack() {
        return false;
    }
    
    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - Create of a mass update domain
     *       {@link W2005UpdateDomain} is generated and the VALUE of {@link W2005ActionForm#getMixTagNo()} is set up.
     *
     * - Detailed line selection check
     *       {@link W2005ConfirmDetailFacadeServiceImpl W2005ConfirmDetailFacadeServiceImpl#process (W2005UpdateDomain)} is called and a detailed line selection check is performed.
     *
     *
     * - 一括更新ドメインの作成
     *     {@link W2005UpdateDomain}を生成し、{@link W2005ActionForm#getMixTagNo()}の値を設定する
     *     
     * - 明細行選択チェック
     *     {@link W2005ConfirmDetailFacadeServiceImpl W2005ConfirmDetailFacadeServiceImpl#process(W2005UpdateDomain)}を呼出し、明細行選択チェックを行う
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws ApplicationException {
        
        // Create of a mass update domain
        // 一括更新ドメインの作成
        W2005ActionForm w2005Form = (W2005ActionForm) form;
        // Create of a mass update domain
        // 一括更新ドメインの作成
        W2005UpdateDomain updateDomain = prepareUpdateDomain(w2005Form);
        // Detailed line selection check
        // 明細行選択チェック
        w2005ConfirmDetailFacadeService.process(updateDomain);
        
        return FORWARD_SUCCESS;
    }
    
    /**
     * {@link W2005UpdateDomain} is created.<br />{@link W2005UpdateDomain}を作成します。
     *
     * @param form Action form<br />アクションフォーム
     * @return Created {@link W2005UpdateDomain}<br />作成した{@link W2005UpdateDomain}
     */
    protected W2005UpdateDomain prepareUpdateDomain(W2005ActionForm form) {
        W2005UpdateDomain updateDomain = new W2005UpdateDomain();
        updateDomain.setMixTagNo(form.getMixTagNo());
        
        return updateDomain;
    }
}
