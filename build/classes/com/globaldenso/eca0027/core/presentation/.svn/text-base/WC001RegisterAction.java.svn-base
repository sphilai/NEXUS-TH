/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_ON;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0008;

import java.sql.Timestamp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.WC001ListDomain;
import com.globaldenso.eca0027.core.business.domain.WC001CriteriaDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.TransactFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 *    This is a registration action class of a return recommendation packing-style create, re printing, and a cancellation screen.
 * <br />返却推奨荷姿作成・再印刷・キャンセル画面の登録アクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":WC001.jsp
 *     - "error":WC001.jsp
 * </pre>
 *
 * @author $Author: 810833843 $
 * @version $Revision: 6774 $
 */
public class WC001RegisterAction extends WC001AbstractAction {
    
    /**
     * RegisterFacade service
     * <br />RegisterFacadeサービス
     */
    protected TransactFacadeService<WC001CriteriaDomain, WC001CriteriaDomain> wc001RegisterFacadeService;
    
    /**
     * constructor
     * <br />デフォルトコンストラクタです。
     */
    public WC001RegisterAction() {
        super();
    }

    /**
     * Setter method for wc001RegisterFacadeService.
     *
     * @param transactFacadeService Set for wc001RegisterFacadeService
     */
    public void setWc001RegisterFacadeService(
        TransactFacadeService<WC001CriteriaDomain, WC001CriteriaDomain> transactFacadeService) {
        wc001RegisterFacadeService = transactFacadeService;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#isScreenInfoStack()
     */
    protected boolean isScreenInfoStack() {
        return true;
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
        
        // Get screen common items
        // 画面共通項目の取得
        WC001CriteriaDomain criteriaDomain = prepareUpdateDomain(wc001Form);
        criteriaDomain = wc001RegisterFacadeService.transact(criteriaDomain);
        
        // Screen fields attributes
        // 画面表示制御
        wc001Form.setStrAfterRegist(FLAG_ON);
        controlDisplay(wc001Form, request);

        // Registration of a message
        // メッセージの登録
        int intPalletQty = 1;
        if (criteriaDomain.getPalletQty() != null && criteriaDomain.getPalletQty().equals("")) {
            intPalletQty = Integer.parseInt(criteriaDomain.getPalletQty());
        }
        addGlobalMessage(request, GSCM_I0_0008, intPalletQty);
        
        return FORWARD_SUCCESS;
    }
    

    /**
     *    A Criteria domain is created.
     * <br />Criteriaドメインを作成します。
     *
     * @param wC001Form Action form<br />アクションフォーム
     * @return Update domain<br />Updateドメイン
     */
    protected WC001CriteriaDomain prepareUpdateDomain(WC001ActionForm wC001Form) {

        // Setting of LANGUAGE CODE, and a DSC-ID (required for an input check, and registration and an update process)  
        // 言語コード・DSC-IDの設定 (入力チェックおよび登録・更新処理に必要)
        WC001CriteriaDomain criteria = wC001Form.getCriteriaDomain();
        criteria.setLanguageCd(wC001Form.getLanguageCd());
        criteria.setLoginUserDscId(criteria.getLoginUserDscId());

        for (WC001ListDomain listDomain : wC001Form.getListDomainList()) {
            listDomain.setLanguageCd(wC001Form.getLanguageCd());
            listDomain.setLoginUserDscId(criteria.getLoginUserDscId());
        }
        
        
        // Acquisition of a last update date
        // 最終更新日の取得
        Timestamp comUpdateTimestamp = criteria.getComUpdateTimestamp();
        String volumeUnit = criteria.getVolumeUnit();

        // Setting of a screen common information
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(criteria, wC001Form.getWindowId(), wC001Form.getScreenId());
        
        // setting of a List domain
        // Listドメインの設定
        criteria.setListDomainList(wC001Form.getListDomainList());

        // Resetting of last update date (since this is cleared at the time of a setting of a screen common information)  
        // 最終更新日の再設定 (画面共通情報の設定時にクリアされるため)
        criteria.setComUpdateTimestamp(comUpdateTimestamp);
        criteria.setVolumeUnit(volumeUnit);
        
        return criteria;
    }
    
    
}
