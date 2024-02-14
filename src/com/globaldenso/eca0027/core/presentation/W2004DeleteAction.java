/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessages;

import com.globaldenso.eca0027.core.business.domain.W2004CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W2004ListDomain;
import com.globaldenso.eca0027.core.business.domain.W2004UpdateDomain;
import com.globaldenso.eca0027.core.business.facadeservice.presentation.W2004DeleteFacadeServiceImpl;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.DeleteFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CHECK_ON;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0007;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W2003;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

/**
 *    This is a delete action class of a Packaging Instruction (=Pull) Register screen.
 * <br />梱包指示Register画面の削除アクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":W2004.jsp
 *     - "error":W2004.jsp
 *     - "W2003":/W2003Init.do
 * </pre>
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W2004DeleteAction extends W2004AbstractAction {

    /**
     * Delete Facade service
     * <br />削除Facadeサービス.
     */
    protected DeleteFacadeService<List<? extends W2004ListDomain>, W2004UpdateDomain> w2004DeleteFacadeService;
    
    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W2004DeleteAction() {
        super();
    }

    /**
     * Setter method for w2004DeleteFacadeService.
     *
     * @param deleteFacadeService Set for w2004DeleteFacadeService
     */
    public void setW2004DeleteFacadeService(
        DeleteFacadeService<List<? extends W2004ListDomain>, W2004UpdateDomain> deleteFacadeService) {
        w2004DeleteFacadeService = deleteFacadeService;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * - Create of a mass update domain
     *       {@link W2004UpdateDomain} is created and the following information is set up.
     *       - Screen common information
     *       - {@link W2004CriteriaDomain}
     *       - {@link W2004UpdateDomain}
     *       A DSC-ID is set up about {@link W2004ListDomain}.
     *
     * - Execution of a delete process
     *       {@link W2004DeleteFacadeServiceImpl W2004DeleteFacadeServiceImpl#transact(W2004UpdateDomain)} is called for created {@link W2004UpdateDomain} to an argument.
     *
     *   [When the search number is one or more affairs]
     *
     * - Setting of a re retrieval result
     *       {@link W2004ActionForm#setListDomainList (List)} is called and a re retrieval result is set up.
     *
     * - Registration of a message
     *       A delete completion message is added to {@link ActionMessages}.
     *
     *   [When the search number is zero affair]
     *
     * - Move to Create screen.
     * 
     * 
     * - 一括更新ドメインの作成
     *     {@link W2004UpdateDomain}を作成し、下記の情報を設定する
     *       - 画面共通情報
     *       - {@link W2004CriteriaDomain}
     *       - {@link W2004UpdateDomain}
     *     {@link W2004ListDomain}については、DSC-IDを設定する
     *     
     * - 削除処理の実行
     *     作成した{@link W2004UpdateDomain}を引数に、{@link W2004DeleteFacadeServiceImpl W2004DeleteFacadeServiceImpl#transact(W2004UpdateDomain)}を呼出す
     *     
     * [検索件数が1件以上の場合]
     * 
     * - 再検索結果の設定
     *     {@link W2004ActionForm#setListDomainList(List)}を呼出し、再検索結果を設定する
     *     
     * - メッセージの登録
     *     削除完了メッセージを{@link ActionMessages}に追加する
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
        HttpServletRequest request, HttpServletResponse response) throws Exception {

        W2004ActionForm w2004Form = (W2004ActionForm) form;
        
        // Setting of a mass update domain
        // 一括更新ドメインの設定
        W2004UpdateDomain deleteDomain = prepareUpdateDomain(w2004Form);
        
        // Execution of a delete process
        // 削除処理の実行
        List<? extends W2004ListDomain> listDomainList = w2004DeleteFacadeService.delete(deleteDomain);
        
        // Registration of a delete message
        // 削除メッセージの登録
        addGlobalMessage(request, GSCM_I0_0007, getDeleteCount(deleteDomain.getListDomainList()));
        
        if (0 < listDomainList.size()) {
            // Setting of a re retrieval result
            // 再検索結果の設定
            w2004Form.setListDomainList(listDomainList);
            
            return FORWARD_SUCCESS;
        } else {
            // It changes to a Create screen.
            // Create画面へ遷移
            return SCREEN_ID_W2003;
        }
    }


    /**
     *    {@link W2004UpdateDomain} is created.
     * <br />{@link W2004UpdateDomain}を作成します。
     *
     * @param form Action form<br />アクションフォーム
     * @return Created {@link W2004UpdateDomain}<br />作成した{@link W2004UpdateDomain}
     */
    protected W2004UpdateDomain prepareUpdateDomain(W2004ActionForm form) {
        W2004UpdateDomain updateDomain = new W2004UpdateDomain();
        
        // Setting of a screen common information
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(updateDomain, form.getWindowId(), form.getScreenId());

        // setting of DSC-ID
        // DSC-IDの設定
        for (W2004ListDomain listDomain : form.getListDomainList()) {
            listDomain.setLoginUserDscId(updateDomain.getLoginUserDscId());
        }
        
        // Setting of a mass update domain
        // 一括更新ドメインの設定
        updateDomain.setCriteriaDomain(form.getW2004CriteriaDomain());
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
    protected int getDeleteCount(List<? extends W2004ListDomain> listDomainList) {
        int count = 0;
        for (W2004ListDomain listDomain : listDomainList) {
            if (CHECK_ON.equals(listDomain.getSelected())) {
                count++;
            }
        }
        return count;
    }
}
