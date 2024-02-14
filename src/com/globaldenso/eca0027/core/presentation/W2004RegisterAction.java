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
import com.globaldenso.eca0027.core.business.facadeservice.presentation.W2004RegisterFacadeServiceImpl;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.TransactFacadeService;
import com.globaldenso.gscm.framework.presentation.WindowInfoManager;
import com.globaldenso.gscm.framework.util.ActionUtil;
import com.globaldenso.gscm.framework.util.CommonInfoDomain;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0008;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W2001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WINDOW_ID_0;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

/**
 * This is a registration action class of a Packaging Instruction (=Pull) Register screen.
 * <br />梱包指示Register画面の登録アクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":W2004.jsp
 *     - "error":W2004.jsp
 * </pre>
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W2004RegisterAction extends W2004AbstractAction {
    
    /**
     * Compound Facade service
     * <br />複合Facadeサービス
     */
    protected TransactFacadeService<List<? extends W2004ListDomain>, W2004UpdateDomain> w2004RegisterFacadeService;
    
    /**
     * constructor
     * <br />デフォルトコンストラクタです。
     */
    public W2004RegisterAction() {
        super();
    }

    /**
     * This is a setter method of w2004RegisterFacadeService.
     * <br />w2004RegisterFacadeService のセッターメソッドです。
     *
     * @param registerFacadeService  Set for registerFacadeService
     */
    public void setW2004RegisterFacadeService(
        TransactFacadeService<List<? extends W2004ListDomain>, W2004UpdateDomain> registerFacadeService) {
        w2004RegisterFacadeService = registerFacadeService;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * - Setting of an update domain
     *       The following informations are set as {@link W2004UpdateDomain}.
     *         - Screen common information
     *         - Search-condition domain ({@link W2004CriteriaDomain})  
     *         - List domain ({@link W2004ListDomain})
     *       The following informations are set as {@link W2004CriteriaDomain}.
     *         - PALLETIZE INSTRUCTION ISSUER ID
     *         - PALLETIZE INSTRUCTION NAME
     *
     * - Execution of registration processing
     *       Created {@link W2004UpdateDomain} is made into an argument, and {@link W2004RegisterFacadeServiceImpl W2004RegisterFacadeServiceImpl#transact(W2004UpdateDomain)} is called.
     *
     * - Setting of a re retrieval result
     *       The re retrieval result after registration is set as action form.
     *
     * - Update of a search condition
     *       The re retrieval result after registration is reflected in {@link W2004CriteriaDomain}.
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
     *     以下の情報を{@link W2004UpdateDomain}に設定する
     *       - 画面共通情報
     *       - 検索条件ドメイン ({@link W2004CriteriaDomain})
     *       - Listドメイン ({@link W2004ListDomain})
     *     以下の情報を{@link W2004CriteriaDomain}に設定する
     *       - 梱包指示者ID
     *       - 梱包指示者名
     *       
     * - 登録処理の実行
     *     作成した{@link W2004UpdateDomain}を引数にして、{@link W2004RegisterFacadeServiceImpl W2004RegisterFacadeServiceImpl#transact(W2004UpdateDomain)}を呼出す
     *     
     * - 再検索結果の設定
     *     登録後の再検索結果をアクションフォームに設定する
     *     
     * - 検索条件の更新
     *     登録後の再検索結果を{@link W2004CriteriaDomain}に反映する
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
        
        // setting of mass update domain
        // 一括更新ドメインの設定
        W2004ActionForm w2004Form = (W2004ActionForm) form;
        
        // Setting of an update domain
        // 更新ドメインの設定
        W2004UpdateDomain updateDomain = prepareUpdateDomain(w2004Form);
        
        // Execution of registration processing
        // 登録処理の実行
        List<? extends W2004ListDomain> listDomainList = w2004RegisterFacadeService.transact(updateDomain);
        
        // Setting of search results
        // 検索結果の設定
        w2004Form.setListDomainList(listDomainList);

        // Update of a search condition
        // 検索条件の更新
        updateCriteriaDomain(w2004Form);
        
        // Set transition original screen id (in order to perform the same control as the time of the changes from a Main screen)  
        // 遷移元画面IDの設定 (Main画面からの遷移時と同じ制御を行うため)
        w2004Form.setFromScreenId(SCREEN_ID_W2001);
        
        // Registration of a message
        // メッセージの登録
        addGlobalMessage(request, GSCM_I0_0008, 1);
        
        // It changes to a Packaging Instruction (=Pull) Create screen.
        // 梱包指示Create画面へ遷移
        return FORWARD_SUCCESS;
    }
    
    /**
     *    {@link W2004UpdateDomain} is created.
     * <br />{@link W2004UpdateDomain}を作成します。
     *
     * @param form Action form<br />アクションフォーム
     * @return {@link W2004UpdateDomain}
     */
    protected W2004UpdateDomain prepareUpdateDomain(W2004ActionForm form) {
        W2004UpdateDomain updateDomain = new W2004UpdateDomain();

        // Setting of a screen common information
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(updateDomain, form.getWindowId(), form.getScreenId());

        // setting of condition domain, and a List domain
        // 条件ドメイン、Listドメインの設定
        updateDomain.setCriteriaDomain(form.getW2004CriteriaDomain());
        updateDomain.setListDomainList(form.getListDomainList());

        // Acquisition of a screen common information
        // 画面共通情報の取得
        WindowInfoManager windowInfo = new WindowInfoManager(WINDOW_ID_0);
        CommonInfoDomain commonInfo = windowInfo.getCommonInfo();

        // setting of PKG backer ID, and a PALLETIZE INSTRUCTION NAME
        // 梱包支持者ID、梱包指示者名の設定
        updateDomain.getCriteriaDomain().setPltzInstrIssuerId(commonInfo.getLoginUserDscId());
        updateDomain.getCriteriaDomain().setPltzInstrNm(commonInfo.getUserName());
        
        return updateDomain;
    }
    
    /**
     *    The re retrieval result after registration is reflected in {@link W2004CriteriaDomain}.
     * <br />登録後の再検索結果を{@link W2004CriteriaDomain}に反映します。
     *
     * @param form Action form<br />アクションフォーム
     */
    protected void updateCriteriaDomain(W2004ActionForm form) {
        W2004CriteriaDomain criteriaDomain = form.getW2004CriteriaDomain();
        W2004ListDomain listDomain = form.getListDomainList(0);
        
        // Setting of search-condition domain (Packaging Instruction (=Pull) NO, a PALLETIZE INSTRUCTION STATUS, CML PRINT OUT DATE)  
        // 検索条件ドメインの設定 (梱包指示NO、梱包指示ステータス、CML出力日)
        criteriaDomain.setPltzInstrNo(listDomain.getPltzInstrNo());
        criteriaDomain.setPltzInstrStatus(listDomain.getPltzInstrStatus());
        criteriaDomain.setCmlPrintOutDt(listDomain.getCmlPrintOutDt());
        
        // Setting of action form (Packaging Instruction (=Pull) NO)  
        // アクションフォームの設定 (梱包指示NO)
        form.setPltzInstrNo(listDomain.getPltzInstrNo());
    }
}
