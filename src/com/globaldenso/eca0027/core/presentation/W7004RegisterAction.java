/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0008;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_NEW;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W7001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W7003;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.sql.Timestamp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.eca0027.core.business.domain.W7004CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W7004UpdateDomain;
import com.globaldenso.eca0027.core.business.facadeservice.presentation.W7004RegisterFacadeServiceImpl;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.TransactFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * The class of action Register for Shipping Actuality Register screen.
 * <br />船積実績Register画面のRegisterアクションクラスです。
 * 
 * <pre>
 * forward name-path mappings:
 *     - "success":W7004
 *     - "error":W7004
 * </pre>
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W7004RegisterAction extends W7004AbstractAction {

    /**
     * Register Facade Service<br />
     * Register Facadeサービス
     */
    protected TransactFacadeService<W7004UpdateDomain, W7004UpdateDomain> w7004RegisterFacadeService;
    
    /**
     * Default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W7004RegisterAction() {
        super();
    }

    /**
     * Setter method for w7004RegisterFacadeService.
     *
     * @param registerFacadeService Set for w7004RegisterFacadeService
     */
    public void setW7004RegisterFacadeService(TransactFacadeService<W7004UpdateDomain, W7004UpdateDomain> registerFacadeService) {
        w7004RegisterFacadeService = registerFacadeService;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * - Set of mass update domain
     *   Set to {@link W7004UpdateDomain}.
     *
     * - Execution of the registration process
     *   Call the {@link W7004RegisterFacadeServiceImpl} transact .
     *
     * - Set of search results
     * </pre>
     * <pre>
     * ‐一括更新ドメインの設定
     *     {@link W7004UpdateDomain}に設定します。
     * 
     * ‐登録処理の実行
     *     {@link W7004RegisterFacadeServiceImpl}を呼出す。
     * 
     * ‐再検索結果の設定
     * 
     * </pre>
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
        throws Exception {
        
        W7004ActionForm w7004Form = (W7004ActionForm) form;
        
        W7004UpdateDomain updateDomain = prepareUpdateDomain(w7004Form);
        
        W7004UpdateDomain resultDomain = w7004RegisterFacadeService.transact(updateDomain);
        
        addGlobalMessage(request, GSCM_I0_0008, resultDomain.getUpdateCount());
        // Check result.
        // 取得データなし
        if (resultDomain.getListDomainList().isEmpty()) {
            // Set screen id.
            // 遷移元画面に遷移
            if (MODE_NEW.equals(resultDomain.getCriteriaDomain().getProcMode())) {
                return SCREEN_ID_W7003;
            } else {
                return SCREEN_ID_W7001;
            }
        }
        // Set result.
        // 再検索結果の設定
        w7004Form.setW7004CriteriaDomain(resultDomain.getCriteriaDomain());
        w7004Form.setListDomainList(resultDomain.getListDomainList());
        
        return FORWARD_SUCCESS;
    }

    /**
     * Create a {@link W7004UpdateDomain}.
     * <br />{@link W7004UpdateDomain}を作成します。
     *
     * @param form of action form Shipping Actuality Register screen <br /> 船積実績Register画面のアクションフォーム
     * @return created {@link W7004UpdateDomain} <br /> 作成した{@link W7004UpdateDomain}
     */
    protected W7004UpdateDomain prepareUpdateDomain(W7004ActionForm form) {
        
        W7004CriteriaDomain criteriaDomain = form.getW7004CriteriaDomain();
        Timestamp comUpdateTimestamp = criteriaDomain.getComUpdateTimestamp();
        //  Set the initial value to business domain from CommonInfoDomain.
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(criteriaDomain, form.getWindowId(), form.getScreenId());
        criteriaDomain.setComUpdateTimestamp(comUpdateTimestamp);
        
        W7004UpdateDomain updateDomain = new W7004UpdateDomain();
        updateDomain.setCriteriaDomain(form.getW7004CriteriaDomain());
        updateDomain.setListDomainList(form.getListDomainList());
        
        return updateDomain;
    }
}
