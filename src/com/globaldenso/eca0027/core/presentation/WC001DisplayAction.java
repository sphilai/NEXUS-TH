/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.sql.Timestamp;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.WC001CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.WC001ListDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 *    This is a Display action class of a return recommendation packing-style create, re printing, and a cancellation screen.
 * <br />返却推奨荷姿作成・再印刷・キャンセル画面のDisplayアクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":WC001.jsp
 *     - "error":WC001.jsp
 * </pre>
 *
 * @author $Author: 810833843 $
 * @version $Revision: 6774 $
 */
public class WC001DisplayAction extends WC001AbstractAction {

    /**
     * DisplayFacade service
     * <br />DisplayFacadeサービス
     */
    protected SearchFacadeService<WC001CriteriaDomain, WC001CriteriaDomain> wc001DisplayFacadeService;
    
    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public WC001DisplayAction() {
        super();
    }

    /**
     * Setter method for wc001DisplayFacadeService.
     *
     * @param transactFacadeService Set for wc001DisplayFacadeService
     */
    public void setWc001DisplayFacadeService(
        SearchFacadeService<WC001CriteriaDomain, WC001CriteriaDomain> transactFacadeService) {
        wc001DisplayFacadeService = transactFacadeService;
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
        
        wc001DisplayFacadeService.search(criteriaDomain);
        
        return FORWARD_SUCCESS;
    }


    /**
     *    A Criteria domain is created.
     * <br />Criteriaドメインを作成します。
     *
     * @param wc001Form Action form<br />アクションフォーム
     * @return Update domain<br />Updateドメイン
     */
    protected WC001CriteriaDomain prepareUpdateDomain(WC001ActionForm wc001Form) {

        WC001CriteriaDomain criteriaDomain = wc001Form.getCriteriaDomain();
        
        // Setting of LANGUAGE CODE, and a DSC-ID (required for an input check, and registration and an update process)  
        // 言語コード・DSC-IDの設定 (入力チェックおよび登録・更新処理に必要)
        WC001CriteriaDomain criteria = wc001Form.getCriteriaDomain();
        criteria.setLanguageCd(wc001Form.getLanguageCd());
        criteria.setLoginUserDscId(criteria.getLoginUserDscId());

        // Acquisition of a last update date
        // 最終更新日の取得
        Timestamp comUpdateTimestamp = criteriaDomain.getComUpdateTimestamp();
        String volumeUnit = criteriaDomain.getVolumeUnit();

        // Setting of a screen common information
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(criteria, wc001Form.getWindowId(), wc001Form.getScreenId());

        // setting of a List domain
        // Listドメインの設定
        List<? extends WC001ListDomain> listDomainList = wc001Form.getListDomainList();
        criteriaDomain.setListDomainList(listDomainList);

        // Resetting of last update date (since this is cleared at the time of a setting of a screen common information)  
        // 最終更新日の再設定 (画面共通情報の設定時にクリアされるため)
        criteriaDomain.setComUpdateTimestamp(comUpdateTimestamp);
        criteriaDomain.setVolumeUnit(volumeUnit);
        
        return criteria;
    }
    
}
