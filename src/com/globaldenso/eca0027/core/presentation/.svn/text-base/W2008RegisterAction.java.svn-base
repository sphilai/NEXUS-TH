/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_N;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0008;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W2005;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WINDOW_ID_0;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;
import static com.globaldenso.gscm.framework.util.CheckUtil.isBlankOrNull;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W2008CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W2008ListDomain;
import com.globaldenso.eca0027.core.business.domain.W2008UpdateDomain;
import com.globaldenso.eca0027.core.business.facadeservice.presentation.W2008RegisterFacadeServiceImpl;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.TransactFacadeService;
import com.globaldenso.gscm.framework.presentation.WindowInfoManager;
import com.globaldenso.gscm.framework.util.ActionUtil;
import com.globaldenso.gscm.framework.util.CommonInfoDomain;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 * The Register action class of Multiple Item No. in 1Box PKG Register Screen
 * <br />小箱内多品番Register画面のRegisterアクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":W2008.jsp
 *     - "error":W2008.jsp
 * </pre>
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W2008RegisterAction extends W2008AbstractAction {
    
    /**
     * RegisterFacade service
     * <br />RegisterFacadeサービス
     */
    protected TransactFacadeService<List<? extends W2008ListDomain>, W2008UpdateDomain> w2008RegisterFacadeService;
    
    /**
     * constructor.
     */
    public W2008RegisterAction() {
        super();
    }

    /**
     * Setter method for w2008RegisterFacadeService.
     *
     * @param transactFacadeService Set for w2008RegisterFacadeService
     */
    public void setW2008RegisterFacadeService(
        TransactFacadeService<List<? extends W2008ListDomain>, W2008UpdateDomain> transactFacadeService) {
        w2008RegisterFacadeService = transactFacadeService;
    }
    
    /**
     * {@inheritDoc}.
     * <pre>
     * - Setting of an update domain
     *       The following informations are set as {@link W2008UpdateDomain}.
     *         - Screen common information
     *         - Search-condition domain ({@link W2008CriteriaDomain})  
     *         - List domain ({@link W2008ListDomain})
     *       The following informations are set as {@link W2008CriteriaDomain}.
     *       - DSC-ID
     *         - Name
     *
     * - Execution of registration processing
     *       Created {@link W2008UpdateDomain} is made into an argument, and {@link W2008RegisterFacadeServiceImpl W2008RegisterFacadeServiceImpl#transact (W2008UpdateDomain)} is called.
     *
     * - Setting of a re retrieval result
     *       The re retrieval result after registration is set as action form.
     *
     * - Screen fields attributes
     *       Set screen field attributes {@link #controlDisplay (W2008ActionForm, HttpServletRequest)}.
     * 
     * 
     * - 更新ドメインの設定
     *     以下の情報を{@link W2008UpdateDomain}に設定する
     *       - 画面共通情報
     *       - 検索条件ドメイン ({@link W2008CriteriaDomain})
     *       - Listドメイン ({@link W2008ListDomain})
     *     以下の情報を{@link W2008CriteriaDomain}に設定する
     *       - DSC-ID
     *       - 氏名
     *       
     * - 登録処理の実行
     *     作成した{@link W2008UpdateDomain}を引数にして、{@link W2008RegisterFacadeServiceImpl W2008RegisterFacadeServiceImpl#transact(W2008UpdateDomain)}を呼出す
     *     
     * - 再検索結果の設定
     *     登録後の再検索結果をアクションフォームに設定する
     *     
     * - 画面表示制御
     *     {@link #controlDisplay(W2008ActionForm, HttpServletRequest)}を呼出し、画面項目の活性制御を行う
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws ApplicationException {
        
        // setting of mass update domain
        // 一括更新ドメインの設定
        W2008ActionForm w2008Form = (W2008ActionForm) form;
        // Setting of an update domain
        // 更新ドメインの設定
        W2008UpdateDomain updateDomain = prepareUpdateDomain(w2008Form);
        // Execution of registration processing
        // 登録処理の実行
        List<? extends W2008ListDomain> listDomainList = w2008RegisterFacadeService.transact(updateDomain);
        
        // Setting of search results
        // 検索結果の設定
        setSearchResult(w2008Form, listDomainList);
        
        w2008Form.setCallScreenId(SCREEN_ID_W2005);
        
        // Registration of a message
        // メッセージの登録
        addGlobalMessage(request, GSCM_I0_0008, 1);

        // Screen fields attributes
        // 画面表示制御
        controlDisplay(w2008Form, request);
        
        return FORWARD_SUCCESS;
    }
    
    /**
     *    {@link W2008UpdateDomain} is created.
     * <br />{@link W2008UpdateDomain}を作成します。
     *
     * @param form Action form<br />アクションフォーム
     * @return {@link W2008UpdateDomain}
     */
    protected W2008UpdateDomain prepareUpdateDomain(W2008ActionForm form) {
        W2008UpdateDomain updateDomain = new W2008UpdateDomain();

        // Setting of a screen common information
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(updateDomain, form.getWindowId(), form.getScreenId());

        // setting of condition domain, and a List domain
        // 条件ドメイン、Listドメインの設定
        updateDomain.setCriteriaDomain(form.getW2008CriteriaDomain());
        updateDomain.setListDomainList(form.getListDomainList());

        // Acquisition of a screen common information
        // 画面共通情報の取得
        WindowInfoManager windowInfo = new WindowInfoManager(WINDOW_ID_0);
        CommonInfoDomain commonInfo = windowInfo.getCommonInfo();

        // setting of DSC-ID, and a name
        // DSC-ID、氏名の設定
        updateDomain.getCriteriaDomain().setLoginUserDscId(commonInfo.getLoginUserDscId());
        updateDomain.getCriteriaDomain().setLoginUserNm(commonInfo.getUserName());
        
        return updateDomain;
    }
    
    /**
     *    Search results are set up.
     * <br />検索結果を設定します。
     *
     * @param form Action form<br />アクションフォーム
     * @param listDomainList Search results<br />検索結果
     */
    protected void setSearchResult(W2008ActionForm form, List<? extends W2008ListDomain> listDomainList) {
        
        W2008CriteriaDomain criteriaDomain = form.getW2008CriteriaDomain();
        
        // setting of a Criteria domain
        // Criteriaドメインの設定
        CommonUtil.copyPropertiesDomainToDomain(criteriaDomain, listDomainList.get(0));
        // setting of a List domain
        // Listドメインの設定
        form.setListDomainList(listDomainList);
        // setting of MixTagNo
        // MixTagNoの設定
        if(!isBlankOrNull(criteriaDomain.getMixTagNo())){
            form.setMixTagNo(criteriaDomain.getMixTagNo());
        }
        // Reset of WarningFlg
        // WarningFlgのリセット
        criteriaDomain.setIgnoreWarnings(FLAG_N);
    }
}
