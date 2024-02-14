/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CHECK_ON;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0007;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W2007;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W2008CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W2008ListDomain;
import com.globaldenso.eca0027.core.business.domain.W2008UpdateDomain;
import com.globaldenso.eca0027.core.business.facadeservice.presentation.W2008DeleteFacadeServiceImpl;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.TransactFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * The Delete action class of Multiple Item No. in 1Box PKG Register Screen
 * <br />小箱内多品番Register画面のDeleteアクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":W2008.jsp
 *     - "error":W2008.jsp
 * </pre>
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7966 $
 */
public class W2008DeleteAction extends W2008AbstractAction {
    
    /**
     * DeleteFacade service
     * <br />DeleteFacadeサービス
     */
    protected TransactFacadeService<List<? extends W2008ListDomain>, W2008UpdateDomain> w2008DeleteFacadeService;
    
    /**
     * constructor.
     */
    public W2008DeleteAction() {
        super();
    }

    /**
     * Setter method for w2008DeleteFacadeService.
     *
     * @param transactFacadeService Set for w2008DeleteFacadeService
     */
    public void setW2008DeleteFacadeService(
        TransactFacadeService<List<? extends W2008ListDomain>, W2008UpdateDomain> transactFacadeService) {
        w2008DeleteFacadeService = transactFacadeService;
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
     * - Create of a mass update domain
     *       A DSC-ID is set up about {@link W2008ListDomain}.
     *       {@link W2008UpdateDomain} is created and the following information is set up.
     *         - Screen common information
     *       - {@link W2008CriteriaDomain}
     *       - {@link W2008ListDomain}
     *
     * - Execution of a delete process
     *       {@link W2008DeleteFacadeServiceImpl W2008DeleteFacadeServiceImpl#transact (W2008UpdateDomain)} is called for created {@link W2008UpdateDomain} to an argument.
     *
     *   [When the search number is one or more affairs]
     *
     * - Setting of a re retrieval result
     *       {@link W2008ActionForm#setListDomainList (List)} is called and a re retrieval result is set up.
     *
     * - Screen fields attributes
     *       Set screen field attributes {@link #controlDisplay (W2008ActionForm, HttpServletRequest)}.
     *
     *   [When the search number is zero affair]
     *
     * Change to - Create screen.
     * 
     * 
     * - 一括更新ドメインの作成
     *     {@link W2008ListDomain}については、DSC-IDを設定する
     *     {@link W2008UpdateDomain}を作成し、下記の情報を設定する
     *       - 画面共通情報
     *       - {@link W2008CriteriaDomain}
     *       - {@link W2008ListDomain}
     *     
     * - 削除処理の実行
     *     作成した{@link W2008UpdateDomain}を引数に、{@link W2008DeleteFacadeServiceImpl W2008DeleteFacadeServiceImpl#transact(W2008UpdateDomain)}を呼出す
     *     
     * [検索件数が1件以上の場合]
     * 
     * - 再検索結果の設定
     *     {@link W2008ActionForm#setListDomainList(List)}を呼出し、再検索結果を設定する
     *     
     * - 画面表示制御
     *     {@link #controlDisplay(W2008ActionForm, HttpServletRequest)}を呼出し、画面項目の活性制御を行う
     *     
     * [検索件数が0件の場合]
     * 
     * - Create画面へ遷移
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws ApplicationException {
        
        W2008ActionForm w2008Form = (W2008ActionForm) form;
        
        // Setting of a mass update domain
        // 一括更新ドメインの設定
        W2008UpdateDomain deleteDomain = prepareUpdateDomain(w2008Form);
        // Execution of a delete process
        // 削除処理の実行
        List<? extends W2008ListDomain> listDomainList = w2008DeleteFacadeService.transact(deleteDomain);
        
        // Registration of a delete message
        // 削除メッセージの登録
        addGlobalMessage(request, GSCM_I0_0007, getDeleteCount(deleteDomain.getListDomainList()));
        
        if (listDomainList.size() == 0) {
            // changes to a Create screen.
            // Create画面へ遷移
            return SCREEN_ID_W2007;
            
        } else {

            // A setting of warning message
            // 警告メッセージの設定
            saveWarnigMsges(request, mapping, listDomainList, w2008Form.getW2008CriteriaDomain());
            
            // Setting of a re retrieval result
            // 再検索結果の設定
            ((W2008ActionForm) form).setListDomainList(listDomainList);
            
            // Screen fields attributes
            // 画面表示制御
            controlDisplay(w2008Form, request);
            
            return FORWARD_SUCCESS;
        }
    }
    
    /**
     *    {@link W2008UpdateDomain} is created.
     * <br />{@link W2008UpdateDomain}を作成します。
     *
     * @param form Action form<br />アクションフォーム
     * @return Created {@link W2008UpdateDomain}<br />作成した{@link W2008UpdateDomain}
     */
    protected W2008UpdateDomain prepareUpdateDomain(W2008ActionForm form) {
        W2008UpdateDomain updateDomain = new W2008UpdateDomain();
        
        // Setting of a screen common information
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(updateDomain, form.getWindowId(), form.getScreenId());

        // setting of DSC-ID
        // DSC-IDの設定
        for (W2008ListDomain listDomain : form.getListDomainList()) {
            listDomain.setLoginUserDscId(updateDomain.getLoginUserDscId());
        }
        
        // Setting of a mass update domain
        // 一括更新ドメインの設定
        updateDomain.setCriteriaDomain(form.getW2008CriteriaDomain());
        updateDomain.setListDomainList(form.getListDomainList());
        
        return updateDomain;
    }
    
    /**
     *    The delete number is acquired.
     * <br />削除件数を取得します。
     *
     * @param listDomainList List domain<br />Listドメイン
     * @return Delete number<br />削除件数
     */
    protected int getDeleteCount(List<? extends W2008ListDomain> listDomainList) {
        int count = 0;
        for (W2008ListDomain listDomain : listDomainList) {
            if (CHECK_ON.equals(listDomain.getSelected())) {
                count++;
            }
        }
        return count;
    }
}
