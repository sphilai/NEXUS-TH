/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CHECK_ON;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0007;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W2016;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W2017CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W2017ListDomain;
import com.globaldenso.eca0027.core.business.domain.W2017UpdateDomain;
import com.globaldenso.eca0027.core.business.facadeservice.presentation.W2017DeleteFacadeServiceImpl;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.DeleteFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * The Delete action class of X-tag Register
 * <br />X-tag Register画面のDeleteアクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":W2017.jsp ※但し、再検索の結果0件の場合、W2016.jsp
 *     - "error":W2017.jsp
 * </pre>
 *
 * @author $Author: 810833843 $
 * @version $Revision: 6768 $
 */
public class W2017DeleteAction extends W2017AbstractAction {

    /**
     * DeleteFacade service
     * <br />DeleteFacadeサービス
     */
    protected DeleteFacadeService<W2017UpdateDomain, W2017UpdateDomain> w2017DeleteFacadeService;
    
    /**
     * constructor.
     */
    public W2017DeleteAction() {
        super();
    }

    /**
     * Setter method for w2017DeleteFacadeService.
     *
     * @param deleteFacadeService Set for deleteFacadeService
     */
    public void setW2017DeleteFacadeService(
        DeleteFacadeService<W2017UpdateDomain, W2017UpdateDomain> deleteFacadeService) {
        w2017DeleteFacadeService = deleteFacadeService;
    }
    
    /**
     * {@inheritDoc}
     */
    protected boolean isScreenInfoStack() {
        // Required in order to maintain the compatibility of table, and a screen
        // テーブルと画面の整合性を保つ為に必要
        return true;
    }
    
    /**
     * {@inheritDoc}.
     * <pre>
     * - Create of a mass update domain
     *       {@link W2017UpdateDomain} is created and the following information is set up.
     *         - Screen common information
     *       - {@link W2017CriteriaDomain}
     *       - {@link W2017UpdateDomain}
     *
     * - Execution of a delete process
     *       {@link W2017DeleteFacadeServiceImpl W2017DeleteFacadeServiceImpl#delete (W2017UpdateDomain)} is called for created {@link W2017UpdateDomain} to an argument.
     *
     *   [When the search number is one or more affairs]
     *
     * - Setting of a re retrieval result
     *       {@link W2017ActionForm#setW2017ListDomainList (List)} is called and a re retrieval result is set up.
     *
     *   [When the search number is zero affair]
     *
     * Change to - Create screen.
     * 
     * 
     * - 一括更新ドメインの作成
     *     {@link W2017UpdateDomain}を作成し、下記の情報を設定する
     *       - 画面共通情報
     *       - {@link W2017CriteriaDomain}
     *       - {@link W2017UpdateDomain}
     *     
     * - 削除処理の実行
     *     作成した{@link W2017UpdateDomain}を引数に、{@link W2017DeleteFacadeServiceImpl W2017DeleteFacadeServiceImpl#delete(W2017UpdateDomain)}を呼出す
     *     
     * [検索件数が1件以上の場合]
     * 
     * - 再検索結果の設定
     *     {@link W2017ActionForm#setW2017ListDomainList(List)}を呼出し、再検索結果を設定する
     *     
     * [検索件数が0件の場合]
     * 
     * - Create画面へ遷移
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws ApplicationException {
        
        W2017ActionForm w2017Form = (W2017ActionForm) form;
        
        // Create of a mass update domain
        // 一括更新ドメインの作成
        W2017UpdateDomain updateDomain = prepareUpdateDomain(w2017Form);
        
        // Acquisition of the delete number
        // 削除件数の取得
        int deleteCount = getDeleteCount(w2017Form.getW2017ListDomainList());
        
        try {
            // Execution of a delete process
            // 削除処理の実行
            updateDomain = w2017DeleteFacadeService.delete(updateDomain);
            // Registration of a delete message
            // 削除メッセージの登録
            addGlobalMessage(request, GSCM_I0_0007, deleteCount);
            if (updateDomain.getListDomainList().size() == 0) {
                // changes to a Create screen.
                // Create画面へ遷移
                return SCREEN_ID_W2016;
            } else {
                return FORWARD_SUCCESS;
            }
        } catch (ApplicationException e) {
            throw e;
        } finally {
            // Setting of a re retrieval result
            // 再検索結果の設定
            w2017Form.getW2017CriteriaDomain().setTotalShipper(updateDomain.getCriteriaDomain().getTotalShipper());
            w2017Form.getW2017CriteriaDomain().setCustomTimingTyp(updateDomain.getCriteriaDomain().getCustomTimingTyp());
            w2017Form.getW2017CriteriaDomain().setShipperCdList(updateDomain.getCriteriaDomain().getShipperCdList());
            w2017Form.getW2017CriteriaDomain().setXtagPackingIssuerNm(null);
            w2017Form.getW2017CriteriaDomain().setVolumeUnitDisplay(null);
            w2017Form.getW2017CriteriaDomain().setWeightUnitDisplay(null);
            w2017Form.setW2017ListDomainList(updateDomain.getListDomainList());
        }
    }
    
    /**
     *    {@link W2017UpdateDomain} is created.
     * <br />{@link W2017UpdateDomain}を作成します。
     *
     * @param form Action form<br />アクションフォーム
     * @return Created {@link W2017UpdateDomain}<br />作成した{@link W2017UpdateDomain}
     */
    protected W2017UpdateDomain prepareUpdateDomain(W2017ActionForm form) {
        W2017UpdateDomain updateDomain = new W2017UpdateDomain();
        
        // Setting of a screen common information
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(updateDomain, form.getWindowId(), form.getScreenId());
        
        // Setting of a mass update domain
        // 一括更新ドメインの設定
        updateDomain.setCriteriaDomain(form.getW2017CriteriaDomain());
        updateDomain.setListDomainList(form.getW2017ListDomainList());
        
        return updateDomain;
    }
    
    /**
     *    The delete number is acquired.
     * <br />削除件数を取得します。
     *
     * @param listDomainList List domain<br />Listドメイン
     * @return Delete number<br />削除件数
     */
    protected int getDeleteCount(List<? extends W2017ListDomain> listDomainList) {
        int count = 0;
        for (W2017ListDomain listDomain : listDomainList) {
            if (CHECK_ON.equals(listDomain.getSelected())) {
                count++;
            }
        }
        return count;
    }
}
