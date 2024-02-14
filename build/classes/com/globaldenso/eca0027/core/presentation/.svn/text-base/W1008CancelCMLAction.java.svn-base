/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0007;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W1008;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessages;

import com.globaldenso.eca0027.core.business.domain.W1007CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W1008ListDomain;
import com.globaldenso.eca0027.core.business.domain.W1008UpdateDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.TransactFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 *    This is a cancel action class of action Export Packaging Register screen.
 * <br />梱包指示Main画面の検索アクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":W1008.jsp
 *     - "error":W1008.jsp
 * </pre>
 * 
 * @author $Author: DCS $
 * @version $Revision: 6750 $
 */
public class W1008CancelCMLAction extends W1008AbstractAction {

    
    /**
     * W1008CancelCML Facade service
     * <br />複合Facadeサービス
     */
    protected TransactFacadeService<List<? extends W1008ListDomain>, W1008UpdateDomain> w1008CancelCMLFacadeService;
    
    /**
     * Constructor
     * <br />デフォルトコンストラクタです。
     */
    public W1008CancelCMLAction() {
        super();
    }

    /**
     * <p>Setter method for w1008CancelCMLFacadeService.</p>
     *
     * @param cancelCMLFacadeService Set for w1008CancelCMLFacadeService
     */
    public void setW1008CancelCMLFacadeService(
        TransactFacadeService<List<? extends W1008ListDomain>, W1008UpdateDomain> cancelCMLFacadeService) {
        w1008CancelCMLFacadeService = cancelCMLFacadeService;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * - Setting of an update domain
     *       The following informations are set as {@link W1008UpdateDomain}.
     *         - Screen common information
     *         - Search-condition domain ({@link W1007CriteriaDomain})  
     *         - List domain ({@link W1008ListDomain})
     *       The following informations are set as {@link W1007CriteriaDomain}.
     *         - PALLETIZE INSTRUCTION ISSUER ID
     *         - PALLETIZE INSTRUCTION NAME
     *
     * - Execution of registration processing
     *       Created {@link W1008UpdateDomain} is made into an argument, and {@link W1007RegisterFacadeServiceImpl W1007RegisterFacadeServiceImpl#transact(W1008UpdateDomain)} is called.
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
     *     以下の情報を{@link W1008UpdateDomain}に設定する
     *       - 画面共通情報
     *       - 検索条件ドメイン ({@link W1007CriteriaDomain})
     *       - Listドメイン ({@link W1008ListDomain})
     *     以下の情報を{@link W1007CriteriaDomain}に設定する
     *       - 梱包指示者ID
     *       - 梱包指示者名
     *       
     * - 登録処理の実行
     *     作成した{@link W1008UpdateDomain}を引数にして、{@link W1007RegisterFacadeServiceImpl W1007RegisterFacadeServiceImpl#transact(W1008UpdateDomain)}を呼出す
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
        W1008ActionForm w1007Form = (W1008ActionForm) form;
        
        // Setting of an update domain
        // 更新ドメインの設定
        W1008UpdateDomain updateDomain = prepareUpdateDomain(w1007Form);
        
        // Update of a search condition
        List<? extends W1008ListDomain> listDomain = w1008CancelCMLFacadeService.transact(updateDomain);
        

        // Setting of search results
        // 検索結果の設定
        w1007Form.setListDomainList(listDomain);        
        
        // Set transition original screen id (in order to perform the same control as the time of the changes from a Main screen)  
        // 遷移元画面IDの設定 (Main画面からの遷移時と同じ制御を行うため)
        w1007Form.setFromScreenId(SCREEN_ID_W1008);
        
        // Registration of a message
        // メッセージの登録
        addGlobalMessage(request, GSCM_I0_0007, 1);
        
        // It changes to a Packaging Instruction (=Pull) Create screen.
        // 梱包指示Create画面へ遷移
        return FORWARD_SUCCESS;
    }
    
    /**
     *    {@link W1008UpdateDomain} is created.
     * <br />{@link W1008UpdateDomain}を作成します。
     *
     * @param form Action form<br />アクションフォーム
     * @return {@link W1008UpdateDomain}
     */
    protected W1008UpdateDomain prepareUpdateDomain(W1008ActionForm form) {
        W1008UpdateDomain updateDomain = new W1008UpdateDomain();

        // Setting of a screen common information
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(updateDomain, form.getWindowId(), form.getScreenId());

        // setting of condition domain, and a List domain
        // 条件ドメイン、Listドメインの設定
        updateDomain.setCriteriaDomain(form.getW1008CriteriaDomain());
        updateDomain.setListDomainList(form.getListDomainList());

        return updateDomain;
    }
    
}
