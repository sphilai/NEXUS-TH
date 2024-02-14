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

import com.globaldenso.eca0027.core.business.domain.W8001ListDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.ProcessFacadeService;

/**
 * Class action Confirm Detail of Progress Control Main screen.
 * <br />進度管理Main画面のConfirm Detailアクションクラスです。
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W8001ConfirmDetailAction extends W8001AbstractAction {


    /**
     * ConfirmDetail Facade Service
     * <br />ConfirmDetail Facadeサービス
     */
    protected ProcessFacadeService<Void, W8001ListDomain> w8001ConfirmDetailFacadeService;
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W8001ConfirmDetailAction() {
        super();
    }

    /**
     * Setter method for w8001ConfirmDetailFacadeService.
     *
     * @param confirmDetailFacadeService Set for w8001ConfirmDetailFacadeService
     */
    public void setW8001ConfirmDetailFacadeService(ProcessFacadeService<Void, W8001ListDomain> confirmDetailFacadeService) {
        w8001ConfirmDetailFacadeService = confirmDetailFacadeService;
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#isScreenInfoStack()
     */
    protected boolean isScreenInfoStack() {
        return false;
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * Takes over the selected data, a transition to the Progress Control Detail screen.
     * ‐Line item selection check
     * ‐Takeover VALUE
     *     CML No.：Value of the selected record
     * </pre>
     * <pre>
     * 選択したデータを引継ぎ、Progress Control Detail画面に遷移します。
     * ‐明細行選択チェック
     * ‐引継ぎ値
     *     CML No.：選択したレコードの値
     * </pre>
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */

    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
        throws Exception {
        
        W8001ActionForm w8001Form = (W8001ActionForm) form;

        W8001ListDomain listDomain = prepareListDomain(w8001Form);

        w8001ConfirmDetailFacadeService.process(listDomain);

        w8001Form.setCmlNo(listDomain.getMainMark());
        
        return FORWARD_SUCCESS;
    }
    /**
     * Create a {@link W8001ListDomain}.
     * <br />{@link W8001ListDomain}を作成します。
     *
     * @param form Action Form<br />
     * アクションフォーム
     * @return  {@link W8001ListDomain} <br />
     * 作成した{@link W8001ListDomain}
     */
    protected W8001ListDomain prepareListDomain(W8001ActionForm form) {
        W8001ListDomain listDomain = new W8001ListDomain();
        
        listDomain.setMainMark(form.getCmlNo());
        
        return listDomain;
    }
}
