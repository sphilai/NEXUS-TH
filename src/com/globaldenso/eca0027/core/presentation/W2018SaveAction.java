/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0008;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W2018CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W2018ListDomain;
import com.globaldenso.eca0027.core.business.domain.W2018UpdateDomain;
import com.globaldenso.eca0027.core.business.facadeservice.presentation.W2018SaveFacadeServiceImpl;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.TransactFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;
import com.globaldenso.gscm.framework.util.CheckUtil;

/**
 * The Save action class of Multiple Item No. in 1Box PKG Detail
 * <br />小箱内多品番梱包PKG Info Detail画面のSaveアクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":W2018.jsp
 *     - "error":W2018.jsp
 * </pre>
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W2018SaveAction extends W2018AbstractAction {

    /**
     * SaveFacade service
     * <br />SaveFacadeサービス
     */
    protected TransactFacadeService<List<? extends W2018ListDomain>, W2018UpdateDomain> w2018SaveFacadeService;
    
    /**
     * constructor.
     */
    public W2018SaveAction() {
        super();
    }

    /**
     * Setter method for w2018SaveFacadeService.
     *
     * @param transactFacadeService Set for w2018SaveFacadeService
     */
    public void setW2018SaveFacadeService(
        TransactFacadeService<List<? extends W2018ListDomain>, W2018UpdateDomain> transactFacadeService) {
        w2018SaveFacadeService = transactFacadeService;
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
     * - Setting of an update domain
     *       The following informations are set as {@link W2018UpdateDomain}.
     *         - Screen common information
     *         - Search-condition domain ({@link W2018CriteriaDomain})  
     *         - List domain ({@link W2018ListDomain})
     *
     * - Execution of registration processing
     *       Created {@link W2018UpdateDomain} is made into an argument, and {@link W2018SaveFacadeServiceImpl W2018SaveFacadeServiceImpl#transact (W2018UpdateDomain)} is called.
     *
     * - Setting of a re retrieval result
     *       The re retrieval result after registration is set as action form.
     *
     * - Screen fields attributes
     *       Set screen field attributes {@link #controlDisplay (HttpServletRequest, W2018ActionForm)}.
     * 
     * 
     * - 更新ドメインの設定
     *     以下の情報を{@link W2018UpdateDomain}に設定する
     *       - 画面共通情報
     *       - 検索条件ドメイン ({@link W2018CriteriaDomain})
     *       - Listドメイン ({@link W2018ListDomain})
     *       
     * - 登録処理の実行
     *     作成した{@link W2018UpdateDomain}を引数にして、{@link W2018SaveFacadeServiceImpl W2018SaveFacadeServiceImpl#transact(W2018UpdateDomain)}を呼出す
     *     
     * - 再検索結果の設定
     *     登録後の再検索結果をアクションフォームに設定する
     *     
     * - 画面表示制御
     *     {@link #controlDisplay(HttpServletRequest, W2018ActionForm)}を呼出し、画面項目の活性制御を行う
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws ApplicationException {
        
        // setting of mass update domain
        // 一括更新ドメインの設定
        W2018ActionForm w2018Form = (W2018ActionForm) form;
        
        // Setting of an update domain
        // 更新ドメインの設定
        W2018UpdateDomain updateDomain = prepareUpdateDomain(w2018Form);
        
        // Execution of registration processing
        // 登録処理の実行
        List<? extends W2018ListDomain> listDomainList = w2018SaveFacadeService.transact(updateDomain);
        
        // Registration of a message
        // メッセージの登録
        addGlobalMessage(request, GSCM_I0_0008, getUpdateCount(listDomainList));
        
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
     * @return {@link W2018UpdateDomain}
     */
    protected W2018UpdateDomain prepareUpdateDomain(W2018ActionForm form) {
        
        W2018UpdateDomain updateDomain = new W2018UpdateDomain();

        // Setting of a screen common information
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(updateDomain, form.getWindowId(), form.getScreenId());

        // Setting of LANGUAGE CODE, and a DSC-ID (required for an input check, and registration and an update process)  
        // 言語コード・DSC-IDの設定 (入力チェックおよび登録・更新処理に必要)
        for (W2018ListDomain listDomain : form.getListDomainList()) {
            listDomain.setLanguageCd(form.getLanguageCd());
            listDomain.setLoginUserDscId(updateDomain.getLoginUserDscId());
        }
        // setting of condition domain, and a List domain
        // 条件ドメイン、Listドメインの設定
        updateDomain.setCriteriaDomain(form.getW2018CriteriaDomain());
        updateDomain.setListDomainList(form.getListDomainList());
        
        
        return updateDomain;
    }
    
    /**
     *    The registration number is acquired.
     * <br />登録件数を取得します。
     *
     * @param listDomainList List domain<br />Listドメイン
     * @return Registration number<br />登録件数
     */
    protected int getUpdateCount(List<? extends W2018ListDomain> listDomainList) {
        int count = 0;
        for (W2018ListDomain listDomain : listDomainList) {
            if (CheckUtil.isBlankOrNull(listDomain.getDisabledFlg())) {
                count++;
            }
        }
        return count;
    }
}
