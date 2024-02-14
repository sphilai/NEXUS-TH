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

import com.globaldenso.eca0027.core.business.domain.W2003ListDomain;
import com.globaldenso.eca0027.core.business.domain.W2003UpdateDomain;
import com.globaldenso.eca0027.core.business.facadeservice.presentation.W2003UpdateFacadeServiceImpl;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.TransactFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CHECK_ON;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_N;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0008;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

/**
 *    This is an update action class of a Packaging Instruction (=Pull) Create screen.
 * <br />梱包指示Create画面の更新アクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":W2003.jsp
 *     - "error":W2003.jsp
 * </pre>
 *
 * @author $Author: 10088DS50908 $
 * @version $Revision: 13524 $
 */
public class W2003UpdateAction extends W2003AbstractAction {

    /**
     * Update Facade service
     * <br />更新Facadeサービス
     */
    protected TransactFacadeService<Void, W2003UpdateDomain> w2003UpdateFacadeService;
    
    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W2003UpdateAction() {
        super();
    }

    /**
     * Setter method for w2003UpdateFacadeService.
     *
     * @param updateFacadeService Set for w2003UpdateFacadeService
     */
    public void setW2003UpdateFacadeService(
        TransactFacadeService<Void, W2003UpdateDomain> updateFacadeService) {
        w2003UpdateFacadeService = updateFacadeService;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * - A setting of Update domain
     *       The following informations are set as {@link W2003UpdateDomain}.
     *         - Screen common information
     *         - List of {@link W2003ListDomain}
     *
     * - Execution of an update process
     *       {@link W2003UpdateFacadeServiceImpl W2003UpdateFacadeServiceImpl#transact(W2003UpdateDomain)} is called for {@link W2003UpdateDomain} to an argument.
     *
     * - The update of List domain
     *       When disableFlg of the selected line is N, it updates to Y.
     *
     * - Registration of a message
     *       A registration completion message is added to {@link ActionMessages}.
     * 
     * 
     * - Updateドメインの設定
     *     以下の情報を{@link W2003UpdateDomain}に設定する
     *       - 画面共通情報
     *       - {@link W2003ListDomain}のリスト
     * 
     * - 更新処理の実行
     *     {@link W2003UpdateDomain}を引数に{@link W2003UpdateFacadeServiceImpl W2003UpdateFacadeServiceImpl#transact(W2003UpdateDomain)}を呼出す
     *     
     * - Listドメインの更新
     *     選択された行のdisableFlgがNの場合、Yに更新する
     *     
     * - メッセージの登録
     *     登録完了メッセージを{@link ActionMessages}に追加する
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws Exception {

        W2003ActionForm w2003Form = (W2003ActionForm) form;
        
        // setting of a Update domain
        // Updateドメインの設定
        W2003UpdateDomain updateDomain = prepareUpdateDomain(w2003Form);
        
        // Execution of an update process
        // 更新処理の実行
        w2003UpdateFacadeService.transact(updateDomain);

        // The update of a List domain
        // Listドメインの更新
        updateListDomain(updateDomain.getListDomainList());
        
        // Update search result
        // 検索結果の更新
        updateSearchResult(w2003Form);
        
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
    protected W2003UpdateDomain prepareUpdateDomain(W2003ActionForm form) {
        W2003UpdateDomain updateDomain = new W2003UpdateDomain();
        
        // Setting of a screen common information
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(updateDomain, form.getWindowId(), form.getScreenId());
        
        // Setting of LANGUAGE CODE, and a DSC-ID (required for an input check, and registration and an update process)  
        // 言語コード・DSC-IDの設定 (入力チェックおよび登録・更新処理に必要)
        for (W2003ListDomain listDomain : form.getListDomainList()) {
            listDomain.setLanguageCd(form.getLanguageCd());
            listDomain.setLoginUserDscId(updateDomain.getLoginUserDscId());
        }
        
        // setting of a List domain
        // Listドメインの設定
        updateDomain.setListDomainList(form.getListDomainList());
        
        // setting of Shipper CD
        // 荷主コードの設定
        updateDomain.setShipperCd(form.getW2003CriteriaDomain().getShipperCd());
        
        // setting of Ignore Warning
        // IgnoreWarningの設定
        updateDomain.setIgnoreWarnings(form.getW2003CriteriaDomain().getIgnoreWarnings());
        
        return updateDomain;
    }
    
    /**
     *    A List domain is updated.
     * <br />Listドメインを更新します。
     *
     * @param listDomainList List domain<br />Listドメイン
     */
    protected void updateListDomain(List<? extends W2003ListDomain> listDomainList) {
        for (W2003ListDomain listDomain : listDomainList) {
            // diabledFlg of the data registered into Palletize Instruction Item No Work is updated.
            // 梱包指示品目番号ワークに登録されたデータのdiabledFlgを更新
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
    protected int getUpdateCount(List<? extends W2003ListDomain> listDomainList) {
        int count = 0;
        for (W2003ListDomain listDomain : listDomainList) {
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
    protected void updateSearchResult(W2003ActionForm form) {
        
        List<? extends W2003ListDomain> searchResult = form.getSearchResult();
        List<? extends W2003ListDomain> listDomainList = form.getListDomainList();
        
        int fromCount = form.getFromCount() - 1;
        int toCount = form.getToCount();
        
        for (int i = fromCount; i < toCount; i++) {
            int j = i - fromCount;
            if (CHECK_ON.equals(listDomainList.get(j).getSelected())) {
                W2003ListDomain resultDomain = searchResult.get(i);
                W2003ListDomain listDomain = listDomainList.get(j);
                
                resultDomain.setSelected(listDomain.getSelected());
                resultDomain.setInstrQty(listDomain.getInstrQty());
                resultDomain.setDisabledFlg(listDomain.getDisabledFlg());
            }
        }
    }
}
