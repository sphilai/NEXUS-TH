/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0007;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.sql.Timestamp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.WC001CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.WC001UpdateDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.DeleteFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * Cancellation of a return recommendation packing-style create, re printing, and a cancellation screen   This is an action class.
 * <br />返却推奨荷姿作成・再印刷・キャンセル画面のキャンセル アクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":WC001.jsp
 *     - "error":WC001.jsp
 * </pre>
 *
 * @author $Author: 810833843 $
 * @version $Revision: 7707 $
 */
public class WC001CancelAction extends WC001AbstractAction {

    /**
     * CancelFacade service
     * <br />CancelFacadeサービス
     */
    protected DeleteFacadeService<Integer, WC001UpdateDomain> wc001CancelFacadeService;
    
    /**
     * Constructor.
     * デフォルトコンストラクタです。
     */
    public WC001CancelAction() {
        super();
    }

    /**
     * Setter method for wc001CancelFacadeService.
     *
     * @param transactFacadeService Set for wc001CancelFacadeService
     */
    public void setWc001CancelFacadeService(
        DeleteFacadeService<Integer, WC001UpdateDomain> transactFacadeService) {
        wc001CancelFacadeService = transactFacadeService;
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
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws ApplicationException {

        WC001ActionForm wc001Form = (WC001ActionForm) form;
        
        // Setting of a mass update domain
        // 一括更新ドメインの設定
        WC001UpdateDomain updateDomain = prepareUpdateDomain(wc001Form);
        
        Integer result = wc001CancelFacadeService.delete(updateDomain);

        // Registration of a message
        // メッセージの登録
        addGlobalMessage(request, GSCM_I0_0007, result);
        
        return FORWARD_SUCCESS;
    }

    /**
     * 
     *    {@link WC001UpdateDomain} is created.
     * <br />{@link WC001UpdateDomain}を作成します。
     *
     * @param wc001Form Action form of an Empty RT materials screen<br />Empty RT materials画面のアクションフォーム
     * @return Created {@link WC001UpdateDomain}<br />作成した{@link WC001UpdateDomain}
     */
    protected WC001UpdateDomain prepareUpdateDomain(WC001ActionForm wc001Form) {

        WC001UpdateDomain updateDomain = new WC001UpdateDomain();

        // Setting of LANGUAGE CODE, and a DSC-ID (required for an input check, and registration and an update process)  
        // 言語コード・DSC-IDの設定 (入力チェックおよび登録・更新処理に必要)
        WC001CriteriaDomain criteriaDomain = wc001Form.getCriteriaDomain();
        updateDomain.setLanguageCd(wc001Form.getLanguageCd());
        updateDomain.setLoginUserDscId(criteriaDomain.getLoginUserDscId());
        updateDomain.setServerId(criteriaDomain.getServerId());

        // Acquisition of a last update date
        // 最終更新日の取得
        Timestamp comUpdateTimestamp = criteriaDomain.getComUpdateTimestamp();
        
        // Setting of conditions
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(updateDomain, wc001Form.getWindowId(), wc001Form.getScreenId());

        // Setting of conditions
        // 条件の設定
        updateDomain.setShipperCd(criteriaDomain.getShipperCdHidden());
        updateDomain.setPlntCd(criteriaDomain.getPlntCd());
        updateDomain.setFromMainMark(criteriaDomain.getFromMainMark());
        updateDomain.setToMainMark(criteriaDomain.getToMainMark());

        // A setting of a List domain
        // Listドメインの設定
        updateDomain.setListDomainList(wc001Form.getListDomainList());

        // Resetting of last update date (since this is cleared at the time of a setting of a screen common information)  
        // 最終更新日の再設定 (画面共通情報の設定時にクリアされるため)
        updateDomain.setComUpdateTimestamp(comUpdateTimestamp);
        
        return updateDomain;
    }
}
