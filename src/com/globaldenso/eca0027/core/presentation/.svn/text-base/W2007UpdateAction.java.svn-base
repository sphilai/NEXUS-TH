/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CHECK_ON;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_N;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0008;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.eca0027.core.business.domain.W2007ListDomain;
import com.globaldenso.eca0027.core.business.domain.W2007UpdateDomain;
import com.globaldenso.eca0027.core.business.facadeservice.presentation.W2007UpdateFacadeServiceImpl;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.TransactFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * The Update Screen action class of Multiple Item No. in 1Box PKG Create Screen
 * <br />小箱内多品番Create画面のUpdateアクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":W2007.jsp
 *     - "error":W2007.jsp
 * </pre>
 *
 * @author $Author: 810833843 $
 * @version $Revision: 6756 $
 */
public class W2007UpdateAction extends W2007AbstractAction {

    /**
     * UpdateFacade service
     * <br />UpdateFacadeサービス
     */
    protected TransactFacadeService<Void, W2007UpdateDomain> w2007UpdateFacadeService;
    
    /**
     * constructor.
     */
    public W2007UpdateAction() {
        super();
    }

    /**
     * Setter method for w2007UpdateFacadeService.
     *
     * @param transactFacadeService Set for w2007UpdateFacadeService
     */
    public void setW2007UpdateFacadeService(
        TransactFacadeService<Void, W2007UpdateDomain> transactFacadeService) {
        w2007UpdateFacadeService = transactFacadeService;
    }
    
    /**
     * {@inheritDoc}.
     * <pre>
     * A setting of - Update domain
     *       The following informations are set as {@link W2007UpdateDomain}.
     *         - Screen common information
     *         - List of {@link W2007ListDomain}
     *
     * - Execution of an update process
     *       {@link W2007UpdateFacadeServiceImpl W2007UpdateFacadeServiceImpl#transact (W2007UpdateDomain)} is called for {@link W2007UpdateDomain} to an argument.
     *
     * The update of - List domain
     *       When disableFlg of the selected line is N, it updates to Y.
     * 
     * 
     * - Updateドメインの設定
     *     以下の情報を{@link W2007UpdateDomain}に設定する
     *       - 画面共通情報
     *       - {@link W2007ListDomain}のリスト
     * 
     * - 更新処理の実行
     *     {@link W2007UpdateDomain}を引数に{@link W2007UpdateFacadeServiceImpl W2007UpdateFacadeServiceImpl#transact(W2007UpdateDomain)}を呼出す
     *     
     * - Listドメインの更新
     *     選択された行のdisableFlgがNの場合、Yに更新する
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws Exception {
        
        // setting of a Update domain
        // Updateドメインの設定
        W2007ActionForm w2007Form = (W2007ActionForm) form;
        W2007UpdateDomain updateDomain = prepareUpdateDomain(w2007Form);
        
        // Execution of an update process
        // 更新処理の実行
        w2007UpdateFacadeService.transact(updateDomain);
        
        // The update of a List domain
        // Listドメインの更新
        updateListDomain(updateDomain.getListDomainList());
        
        // Update search result
        // 検索結果の更新
        updateSearchResult(w2007Form);
        
        // Registration of a message
        // メッセージの登録
        addGlobalMessage(request, GSCM_I0_0008, getUpdateCount(updateDomain.getListDomainList()));
        
        return FORWARD_SUCCESS;
    }
    
    /**
     *    A Update domain is created.
     * <br />Updateドメインを作成します。
     *
     * @param form Action form<br />アクションフォーム
     * @return Update domain<br />Updateドメイン
     */
    protected W2007UpdateDomain prepareUpdateDomain(W2007ActionForm form) {
        W2007UpdateDomain updateDomain = new W2007UpdateDomain();
        
        // Setting of a screen common information
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(updateDomain, form.getWindowId(), form.getScreenId());
        
        // Setting of LANGUAGE CODE, and a DSC-ID (required for an input check, and registration and an update process)  
        // 言語コード・DSC-IDの設定 (入力チェックおよび登録・更新処理に必要)
        for (W2007ListDomain listDomain : form.getListDomainList()) {
            listDomain.setLanguageCd(form.getLanguageCd());
            listDomain.setLoginUserDscId(updateDomain.getLoginUserDscId());
        }
        
        // setting of CriteriaDomain
        // CriteriaDomainの設定
        updateDomain.setCriteriaDomain(form.getW2007CriteriaDomain());
        
        // setting of a List domain
        // Listドメインの設定
        updateDomain.setListDomainList(form.getListDomainList());
        
        return updateDomain;
    }
    
    /**
     *    A List domain is updated.
     * <br />Listドメインを更新します。
     *
     * @param listDomainList List domain<br />Listドメイン
     */
    protected void updateListDomain(List<? extends W2007ListDomain> listDomainList) {
        for (W2007ListDomain listDomain : listDomainList) {
            // diableFlg of the data registered into work is updated.
            // ワークに登録されたデータのdiableFlgを更新
            if (CHECK_ON.equals(listDomain.getSelected()) && FLAG_N.equals(listDomain.getDisabledFlg())) {
                listDomain.setDisabledFlg(FLAG_Y);
            }
        }
    }
    
    /**
     *    Registration + The update number is acquired.
     * <br />登録 + 更新件数を取得します。
     *
     * @param listDomainList List domain<br />Listドメイン
     * @return Registration + The update number<br />登録 + 更新件数
     */
    protected int getUpdateCount(List<? extends W2007ListDomain> listDomainList) {
        int count = 0;
        for (W2007ListDomain listDomain : listDomainList) {
            if (CHECK_ON.equals(listDomain.getSelected())) {
                count++;
            }
        }
        return count;
    }
    
    /**
     * Update input value to the search result in the session
     * <br />入力内容をセッションに保存されている検索結果に反映する。
     *
     * @param form Action form<br />アクションフォーム
     */
    protected void updateSearchResult(W2007ActionForm form) {
        
        List<? extends W2007ListDomain> searchResult = form.getSearchResult();
        List<? extends W2007ListDomain> listDomainList = form.getListDomainList();
        
        int fromCount = form.getFromCount() - 1;
        int toCount = form.getToCount();
        
        for (int i = fromCount; i < toCount; i++) {
            int j = i - fromCount;
            if (CHECK_ON.equals(listDomainList.get(j).getSelected())) {
                W2007ListDomain resultDomain = searchResult.get(i);
                W2007ListDomain listDomain = listDomainList.get(j);
                
                resultDomain.setSelected(listDomain.getSelected());
                resultDomain.setQty(listDomain.getQty());
                resultDomain.setTagQty(listDomain.getTagQty());
                resultDomain.setDisabledFlg(listDomain.getDisabledFlg());
            }
        }
    }
}
