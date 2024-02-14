/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.AUTH_EMPTY_NUMERIC;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.AUTH_REGISTER_NUMERIC;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CHECK_ON;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_N;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0008;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0009;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W2009R;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_ERROR;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W2003UpdateDomain;
import com.globaldenso.eca0027.core.business.domain.W2011CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W2011ListDomain;
import com.globaldenso.eca0027.core.business.domain.W2011UpdateDomain;
import com.globaldenso.eca0027.core.business.facadeservice.presentation.W2011UpdateFacadeServiceImpl;
import com.globaldenso.eca0027.core.common.business.domain.UserAuthDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.TransactFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 *    This is a Update action class of a CML Create screen.
 * <br />CML Create画面のUpdateアクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":W2011.jsp
 *     - "error":W2011.jsp
 * </pre>
 * 
 * @author $Author: 810833843 $
 * @version $Revision: 7707 $
 */
public class W2011UpdateAction extends W2011AbstractAction {

    /**
     * Update Facade service
     * <br />Update Facade サービス
     */
    protected TransactFacadeService<Void, W2011UpdateDomain> w2011UpdateFacadeService;

    /**
     * constructor.
     */
    public W2011UpdateAction() {
        super();
    }

    /**
     * Setter method for w2011UpdateFacadeServic.
     *
     * @param updateFacadeService Set for updateFacadeService
     */
    public void setW2011UpdateFacadeService(
        TransactFacadeService<Void, W2011UpdateDomain> updateFacadeService) {
        w2011UpdateFacadeService = updateFacadeService;
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * A setting of - Update domain
     *       The following informations are set as {@link W2011UpdateDomain}.
     *         - Screen common information
     *         - List of {@link W2011ListDomain}
     *         - Information on {@link W2011CriteriaDomain}
     *
     * - Execution of an update process
     *       {@link W2011UpdateFacadeServiceImpl W2011UpdateFacadeServiceImpl#transact(W2011UpdateDomain)} is called for {@link W2003UpdateDomain} to an argument.
     *
     * The update of - List domain
     *       When disableFlg of the selected line is N, it updates to Y.
     *
     * - Display control
     *       Refer to {@link W2003AbstractAction#controlDisplay(HttpServletRequest, W2003ActionForm)}.
     *
     * - Updateドメインの設定
     *     以下の情報を{@link W2011UpdateDomain}に設定する
     *       - 画面共通情報
     *       - {@link W2011ListDomain}のリスト
     *       - {@link W2011CriteriaDomain}の情報
     * 
     * - 更新処理の実行
     *     {@link W2003UpdateDomain}を引数に{@link W2011UpdateFacadeServiceImpl W2011UpdateFacadeServiceImpl#transact(W2011UpdateDomain)}を呼出す
     *     
     * - Listドメインの更新
     *     選択された行のdisableFlgがNの場合、Yに更新する
     *     
     * - 表示制御
     *     {@link W2003AbstractAction#controlDisplay(HttpServletRequest, W2003ActionForm)}参照
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping,
     *      org.apache.struts.action.ActionForm,
     *      javax.servlet.http.HttpServletRequest,
     *      javax.servlet.http.HttpServletResponse)
     */
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response)
        throws ApplicationException {
        
        W2011ActionForm w2011Form = (W2011ActionForm) form;
        
        // A setting of a Update domain
        // Updateドメインの設定
        W2011UpdateDomain updateDomain = prepareUpdateDomain(w2011Form);
        
        // Execution of an update process
        // 更新処理の実行
        w2011UpdateFacadeService.transact(updateDomain);

        // The update of a List domain
        // Listドメインの更新
        updateListDomain(updateDomain.getListDomainList());
        
        // Update search result
        // 検索結果の更新
        updateSearchResult(w2011Form);
        
        // Registration of a message
        // メッセージの登録
        addGlobalMessage(request, GSCM_I0_0008, getUpdateCount(updateDomain.getListDomainList()));
        
        // Display control
        // 表示制御
        controlDisplay(request, (W2011ActionForm)form);
        
        return FORWARD_SUCCESS;

    }

    /**
     * {@inheritDoc}
     * 
     * <pre>
     * - At the time of the screen re-display at the time of error generation
     *     - Display control of a screen item is performed.
     *
     * - At the time of the screen re-display at the time of no error generation
     * - {@link W2011AbstractAction#postInvokeExecute(ActionMapping, ActionForm, HttpServletRequest, HttpServletResponse, String)} It carries out.
     *
     * - エラー発生時の画面再表示時
     *   - 画面項目の表示制御を行います。
     * 
     * - エラーなしの場合
     *   - {@link W2011AbstractAction#postInvokeExecute(ActionMapping, ActionForm, HttpServletRequest, HttpServletResponse, String)} を実施します。
     * </pre>
     * 
     * @see com.globaldenso.eca0027.core.presentation.W2011AbstractAction#postInvokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.String)
     */
    protected void postInvokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response,
        String forwardName) {
        
        // Display control
        // 表示制御
        if (FORWARD_ERROR.equals(forwardName)) {
            controlDisplayErr(request, (W2011ActionForm)form);
        } else {
            super.postInvokeExecute(mapping, form, request, response, forwardName);
        }
    }

    /**
     *    A Update domain is created.
     * <br />Updateドメインを作成します。
     *
     * @param form Action form<br />アクションフォーム
     * @return Update domain<br />Updateドメイン
     * @throws GscmApplicationException When an user authority list is unacquirable<br />ユーザ権限リストが取得できない場合
     */
    protected W2011UpdateDomain prepareUpdateDomain(W2011ActionForm form) throws GscmApplicationException {
        W2011UpdateDomain updateDomain = new W2011UpdateDomain();
        
        // Setting of a screen common information
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(updateDomain, form.getWindowId(), form.getScreenId());
        
        // A setting of LANGUAGE CODE, and a DSC-ID
        // 言語コード・DSC-IDの設定
        for (W2011ListDomain listDomain : form.getListDomainList()) {
            listDomain.setLanguageCd(form.getLanguageCd());
            listDomain.setLoginUserDscId(updateDomain.getLoginUserDscId());
        }

        // Setting of authority
        // 権限の設定
        String baseAuthFlg = AUTH_EMPTY_NUMERIC;
        if (userAuthService.hasRegisterAll()) {
            // In Register All, it overwrites.
            // Register All の場合、上書き。
            baseAuthFlg = AUTH_REGISTER_NUMERIC;
        }
        form.getW2011CriteriaDomain().setBaseAuthFlg(baseAuthFlg);
        
        if (AUTH_REGISTER_NUMERIC.equals(baseAuthFlg)) {
            form.getW2011CriteriaDomain().setUserAuthList(null);
        } else {
            String[] permitFuncIdList = { PERMIT_FUNC_ID_W2009R };
            List<? extends UserAuthDomain> userAuthList = userAuthService.getUserAuthList(permitFuncIdList);
            
            if (userAuthList.size() == 0) {
                throw new GscmApplicationException(GSCM_I0_0009);
            }
            form.getW2011CriteriaDomain().setUserAuthList(userAuthList);
        }
        
        // A setting of CriteriaDomain
        // CriteriaDomainの設定
        updateDomain.setCriteriaDomain(form.getW2011CriteriaDomain());
        
        // A setting of a List domain
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
    protected void updateListDomain(List<? extends W2011ListDomain> listDomainList) {
        for (W2011ListDomain listDomain : listDomainList) {
            // diableFlg of the data registered into work is updated.
            // ワークに登録されたデータのdiableFlgを更新
            if (CHECK_ON.equals(listDomain.getSelected()) && FLAG_N.equals(listDomain.getDisableFlg())) {
                listDomain.setDisableFlg(FLAG_Y);
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
    protected int getUpdateCount(List<? extends W2011ListDomain> listDomainList) {
        int count = 0;
        for (W2011ListDomain listDomain : listDomainList) {
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
    protected void updateSearchResult(W2011ActionForm form) {
        
        List<? extends W2011ListDomain> searchResult = form.getSearchResult();
        List<? extends W2011ListDomain> listDomainList = form.getListDomainList();
        
        int fromCount = form.getFromCount() - 1;
        int toCount = form.getToCount();
        
        for (int i = fromCount; i < toCount; i++) {
            int j = i - fromCount;
            if (CHECK_ON.equals(listDomainList.get(j).getSelected())) {
                W2011ListDomain resultDomain = searchResult.get(i);
                W2011ListDomain listDomain = listDomainList.get(j);
                
                resultDomain.setSelected(listDomain.getSelected());
                resultDomain.setQty(listDomain.getQty());
                resultDomain.setTagQty(listDomain.getTagQty());
                resultDomain.setDisableFlg(listDomain.getDisableFlg());
            }
        }
    }
}
