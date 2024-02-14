/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0007;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W2018ListDomain;
import com.globaldenso.eca0027.core.business.domain.W2018UpdateDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.TransactFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * The Delete action class of Multiple Item No. in 1Box PKG Detail
 * <br />小箱内多品番梱包PKG Info Detail画面のDeleteアクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":W2018.jsp
 *     - "error":W2018.jsp
 * </pre>
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W2018DeleteAction extends W2018AbstractAction {

    /**
     * DeleteFacade service
     * <br />DeleteFacadeサービス
     */
    protected TransactFacadeService<List<? extends W2018ListDomain>, W2018UpdateDomain> w2018DeleteFacadeService;
    
    /**
     * constructor.
     */
    public W2018DeleteAction() {
        super();
    }

    /**
     * Setter method for w2018DeleteFacadeService.
     *
     * @param transactFacadeService Set for w2018DeleteFacadeService
     */
    public void setW2018DeleteFacadeService(
        TransactFacadeService<List<? extends W2018ListDomain>, W2018UpdateDomain> transactFacadeService) {
        w2018DeleteFacadeService = transactFacadeService;
    }

    /**
     * {@inheritDoc}
     */
    protected boolean isScreenInfoStack() {
        return false;
    }
    
    /**
     * {@inheritDoc}.
     * <pre>
     * A delete of - Mix Tag RT Work
     *       The Mix Tag RT Work which the user registered is deleted.
     * 
     * 
     * - MIXED用RT材ワークの削除
     *     ユーザが登録したMIXED用RT材ワークを削除する
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws ApplicationException {
        
        W2018ActionForm w2018Form = (W2018ActionForm) form;
        
        // Setting of a mass update domain
        // 一括更新ドメインの設定
        W2018UpdateDomain deleteDomain = prepareUpdateDomain(w2018Form);
        // Execution of a delete process
        // 削除処理の実行
        List<? extends W2018ListDomain> listDomainList = w2018DeleteFacadeService.transact(deleteDomain);
        
        // Registration of a delete message
        // 削除メッセージの登録
        addGlobalMessage(request, GSCM_I0_0007, deleteDomain.getListDomainList().size());
        
        // Setting of search results
        // 検索結果の設定
        ((W2018ActionForm) form).setListDomainList(listDomainList);
        
        // Screen fields attributes
        // 画面表示制御
        controlDisplay(request, w2018Form);
        
        return FORWARD_SUCCESS;

    }
    
    
    /**
     *    {@link W2018UpdateDomain} is created.
     * <br />{@link W2018UpdateDomain}を作成します。
     *
     * @param form Action form<br />アクションフォーム
     * @return Created {@link W2018UpdateDomain}<br />作成した{@link W2018UpdateDomain}
     */
    protected W2018UpdateDomain prepareUpdateDomain(W2018ActionForm form) {
        
        W2018UpdateDomain updateDomain = new W2018UpdateDomain();
        
        // Setting of a screen common information
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(updateDomain, form.getWindowId(), form.getScreenId());

        // setting of DSC-ID
        // DSC-IDの設定
        for (W2018ListDomain listDomain : form.getListDomainList()) {
            listDomain.setLanguageCd(form.getLanguageCd());
            listDomain.setLoginUserDscId(updateDomain.getLoginUserDscId());
        }
        
        // Setting of a mass update domain
        // 一括更新ドメインの設定
        updateDomain.setCriteriaDomain(form.getW2018CriteriaDomain());
        updateDomain.setListDomainList(form.getListDomainList());
        
        return updateDomain;
    }
}
