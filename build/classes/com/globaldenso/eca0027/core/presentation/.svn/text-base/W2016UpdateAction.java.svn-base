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

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W2016ListDomain;
import com.globaldenso.eca0027.core.business.domain.W2016UpdateDomain;
import com.globaldenso.eca0027.core.business.facadeservice.presentation.W2016UpdateFacadeServiceImpl;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.CreateFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * The Update action class of X-tag Create
 * <br />X-tag Create画面のUpdateアクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":W2016.jsp
 *     - "error":W2016.jsp
 * </pre>
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 11243 $
 */
public class W2016UpdateAction extends W2016AbstractAction {

    /**
     * UpdateFacade service
     * <br />UpdateFacadeサービス
     */
    protected CreateFacadeService<Void, W2016UpdateDomain> w2016UpdateFacadeService;
    
    /**
     * constructor.
     */
    public W2016UpdateAction() {
        super();
    }

    /**
     * Setter method for w2016UpdateFacadeService.
     *
     * @param updateFacadeService Set for updateFacadeService
     */
    public void setW2016UpdateFacadeService(
        CreateFacadeService<Void, W2016UpdateDomain> updateFacadeService) {
        w2016UpdateFacadeService = updateFacadeService;
    }
    
    /**
     * {@inheritDoc}.
     * <pre>
     * A setting of - Update domain
     *       The following informations are set as {@link W2016UpdateDomain}.
     *         - Screen common information
     *         - List of {@link W2016ListDomain}
     *
     * - Execution of an update process
     *       {@link W2016UpdateFacadeServiceImpl W2016UpdateFacadeServiceImpl#create (W2016UpdateDomain)} is called for {@link W2016UpdateDomain} to an argument.
     *
     * The update of - List domain
     *       When disableFlg of the selected line is N, it updates to Y.
     * 
     * 
     * - Updateドメインの設定
     *     以下の情報を{@link W2016UpdateDomain}に設定する
     *       - 画面共通情報
     *       - {@link W2016ListDomain}のリスト
     * 
     * - 更新処理の実行
     *     {@link W2016UpdateDomain}を引数に{@link W2016UpdateFacadeServiceImpl W2016UpdateFacadeServiceImpl#create(W2016UpdateDomain)}を呼出す
     *     
     * - Listドメインの更新
     *     選択された行のdisableFlgがNの場合、Yに更新する
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws ApplicationException {
        
        W2016ActionForm w2016Form = (W2016ActionForm) form;
        
        // setting of a Update domain
        // Updateドメインの設定
        W2016UpdateDomain updateDomain = prepareUpdateDomain(w2016Form);
        
        // The update number acquisition
        // 更新件数取得
        int updateCount = getUpdateCount(w2016Form.getW2016ListDomainList());
        
        // Execution of an update process
        // 更新処理の実行
        w2016UpdateFacadeService.create(updateDomain);

        // The update of a List domain
        // Listドメインの更新
        updateListDomain(updateDomain.getListDomainList());
        
        // Registration of a message
        // メッセージの登録
        addGlobalMessage(request, GSCM_I0_0008, updateCount);
        
        return FORWARD_SUCCESS;
    }
    
    /**
     *    A Update domain is created.
     * <br />Updateドメインを作成します。
     *
     * @param form Action form<br />アクションフォーム
     * @return Update domain<br />Updateドメイン
     */
    protected W2016UpdateDomain prepareUpdateDomain(W2016ActionForm form) {
        W2016UpdateDomain updateDomain = new W2016UpdateDomain();
        
        // Setting of a screen common information
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(updateDomain, form.getWindowId(), form.getScreenId());
        
        // Setting of LANGUAGE CODE, and a DSC-ID (required for an input check, and registration and an update process)  
        // 言語コード・DSC-IDの設定 (入力チェックおよび登録・更新処理に必要)
        for (W2016ListDomain listDomain : form.getW2016ListDomainList()) {
            listDomain.setLanguageCd(form.getLanguageCd());
            listDomain.setLoginUserDscId(updateDomain.getLoginUserDscId());
        }
        
        // setting of a List domain
        // Listドメインの設定
        updateDomain.setListDomainList(form.getW2016ListDomainList());
        
        return updateDomain;
    }
    
    /**
     *    A List domain is updated.
     * <br />Listドメインを更新します。
     *
     * @param listDomainList List domain<br />Listドメイン
     */
    protected void updateListDomain(List<? extends W2016ListDomain> listDomainList) {
        for (W2016ListDomain listDomain : listDomainList) {
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
     * @return Update number<br />更新件数
     */
    protected int getUpdateCount(List<? extends W2016ListDomain> listDomainList) {
        int count = 0;
        for (W2016ListDomain listDomain : listDomainList) {
            if (CHECK_ON.equals(listDomain.getSelected())) {
                if (FLAG_N.equals(listDomain.getDisabledFlg())) {
                    count++;
                }
            }
        }
        return count;
    }
}
