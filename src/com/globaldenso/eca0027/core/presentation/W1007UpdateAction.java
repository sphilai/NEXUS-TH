/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0006;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W1007;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessages;

import com.globaldenso.eca0027.core.business.domain.W1007CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W1007ListDomain;
import com.globaldenso.eca0027.core.business.domain.W1007UpdateDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.TransactFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 *    This is a search action class of Export Request Header screen.
 * <br />梱包指示Main画面の検索アクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":W1007.jsp
 *     - "error":W1007.jsp
 * </pre>
 * 
 * @author $Author: DCS
 * @version $Revision: 6750 $
 */
public class W1007UpdateAction extends W1007AbstractAction {

    
    /**
     * W1007Update Facade service
     * <br />複合Facadeサービス
     */
    protected TransactFacadeService<List<? extends W1007ListDomain>, W1007UpdateDomain> w1007UpdateFacadeService;
    
    /**
     * Constructor
     * <br />デフォルトコンストラクタです。
     */
    public W1007UpdateAction() {
        super();
    }
    /**
     * <p>Setter method for w1007UpdateFacadeService.</p>
     *
     * @param updateFacadeService Set for w1007UpdateFacadeService
     */
    public void setW1007UpdateFacadeService(
        TransactFacadeService<List<? extends W1007ListDomain>, W1007UpdateDomain> updateFacadeService) {
        w1007UpdateFacadeService = updateFacadeService;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * - Setting of an update domain
     *       The following informations are set as {@link W1007UpdateDomain}.
     *         - Screen common information
     *         - Search-condition domain ({@link W1007CriteriaDomain})  
     *         - List domain ({@link W1007ListDomain})
     *       The following informations are set as {@link W1007CriteriaDomain}.
     *         - PALLETIZE INSTRUCTION ISSUER ID
     *         - PALLETIZE INSTRUCTION NAME
     *
     * - Execution of registration processing
     *       Created {@link W1007UpdateDomain} is made into an argument, and {@link W1007RegisterFacadeServiceImpl W1007RegisterFacadeServiceImpl#transact(W1007UpdateDomain)} is called.
     *
     * - Setting of a re retrieval result
     *       The re retrieval result after registration is set as action form.
     *
     * - Update of a search condition
     *       The re retrieval result after registration is reflected in {@link W1007CriteriaDomain}.
     *       Packaging Instruction (=Pull) NO is set as action form (in order to change into the same state as the time of the changes from a Main screen).
     *
     * - Set transition original screen id
     *       Transition-original-screen ID is set as W2001 (in order to perform the same Screen fields attributes as the time of the changes from a Main screen).
     *
     * - Registration of a message
     *       A registration completion message is added to {@link ActionMessages}.
     * 
     * 
     * - 更新ドメインの設定
     *     以下の情報を{@link W1007UpdateDomain}に設定する
     *       - 画面共通情報
     *       - 検索条件ドメイン ({@link W1007CriteriaDomain})
     *       - Listドメイン ({@link W1007ListDomain})
     *     以下の情報を{@link W1007CriteriaDomain}に設定する
     *       - 梱包指示者ID
     *       - 梱包指示者名
     *       
     * - 登録処理の実行
     *     作成した{@link W1007UpdateDomain}を引数にして、{@link W1007RegisterFacadeServiceImpl W1007RegisterFacadeServiceImpl#transact(W1007UpdateDomain)}を呼出す
     *     
     * - 再検索結果の設定
     *     登録後の再検索結果をアクションフォームに設定する
     *     
     * - 検索条件の更新
     *     登録後の再検索結果を{@link W1007CriteriaDomain}に反映する
     *     梱包指示NOをアクションフォームに設定する (Main画面からの遷移時と同じ状態にするため)
     *     
     * - 遷移元画面IDの設定
     *     遷移元画面IDをW2001に設定する (Main画面からの遷移時と同じ画面表示制御を行うため)
     *     
     * - メッセージの登録
     *     登録完了メッセージを{@link ActionMessages}に追加する
     * </pre>
     * 
     * 
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws Exception {
        // Setting of mass update domain
        // 一括更新ドメインの設定
        W1007ActionForm w1007Form = (W1007ActionForm) form;
        
        // Setting of an update domain
        // 更新ドメインの設定
        W1007UpdateDomain updateDomain = prepareUpdateDomain(w1007Form);
        // Update of a search condition
        // 登録処理の実行
        W1007UpdateDomain resultDomain = (W1007UpdateDomain)w1007UpdateFacadeService.transact(updateDomain);
        
        
        w1007Form.setW1007CriteriaDomain(resultDomain.getCriteriaDomain());
    
        // Setting of search results
        // 検索結果の設定
        w1007Form.setListDomainList(resultDomain.getListDomainList());      
        
        // Set transition original screen id (in order to perform the same control as the time of the changes from a Main screen)  
        // 遷移元画面IDの設定 (Main画面からの遷移時と同じ制御を行うため)
        w1007Form.setFromScreenId(SCREEN_ID_W1007);
        
        // Registration of a message
        // メッセージの登録
        addGlobalMessage(request, GSCM_I0_0006, resultDomain.getTotalUpdate());
        
        // It changes to a Packaging Instruction (=Pull) Create screen.
        // 梱包指示Create画面へ遷移
        return FORWARD_SUCCESS;
    }
    
    /**
     *    {@link W1007UpdateDomain} is created.
     * <br />{@link W1007UpdateDomain}を作成します。
     *
     * @param form Action form<br />アクションフォーム
     * @return {@link W1007UpdateDomain}
     */
    protected W1007UpdateDomain prepareUpdateDomain(W1007ActionForm form) {
        W1007UpdateDomain updateDomain = new W1007UpdateDomain();

        // Setting of a screen common information
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(updateDomain, form.getWindowId(), form.getScreenId());

        // setting of condition domain, and a List domain
        // 条件ドメイン、Listドメインの設定
        updateDomain.setCriteriaDomain(form.getW1007CriteriaDomain());
        updateDomain.setListDomainList(form.getListDomainList());
        updateDomain.setLocale(new Locale(updateDomain.getCriteriaDomain().getLanguageCd()));
        return updateDomain;
    }
}
