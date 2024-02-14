/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_EDIT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_NEW;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_REF;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W9022R;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W9023CriteriaDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;
import com.globaldenso.gscm.framework.util.CheckUtil;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.StringUtil;

/**
 * Initial display of class action Invoice Template MA Edit screen.
 * <br />Invoice Template MA Edit画面の初期表示アクションクラスです。
 * <pre>
 * forward name-path mapping:
 *     ‐ "success":W9008
 * </pre>
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W9023InitAction extends W9023AbstractAction {

    /**
     * Initial display Facade Service
     * <br />初期表示Facadeサービス
     */
    protected SearchFacadeService<W9023CriteriaDomain, W9023CriteriaDomain> w9023InitFacadeService;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W9023InitAction() {
        super();
    }

    /**
     * Setter method for w9023InitFacadeService.
     *
     * @param initFacadeService Set for w9023InitFacadeService
     */
    public void setW9023InitFacadeService(
        SearchFacadeService<W9023CriteriaDomain, W9023CriteriaDomain> initFacadeService) {
        w9023InitFacadeService = initFacadeService;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */

    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response)
        throws Exception {
        
        W9023ActionForm w9023Form = (W9023ActionForm) form;
        
        // Set of search criteria domain.
        // 検索条件ドメインの設定
        W9023CriteriaDomain criteriaDomain = prepareCriteriaDomain(w9023Form, request);
        
        // Processing mode determination.
        // 処理モード判定
        String mode;
        if (CheckUtil.isBlankOrNull(criteriaDomain.getCompany()) && CheckUtil.isBlankOrNull(criteriaDomain.getDocNo())) {
            mode = MODE_NEW;
        } else {
            if (userAuthService.hasUserAuthForComp(PERMIT_FUNC_ID_W9022R, criteriaDomain.getCompany())) {
                mode = MODE_EDIT;
            } else {
                mode = MODE_REF;
            }
        }
        w9023Form.setProcMode(mode);
        criteriaDomain.setProcMode(mode);
        
        // Get of data.
        // データ取得
        W9023CriteriaDomain resultDomain = getInitData(criteriaDomain);
        
        // Set of search results.
        // 検索結果の設定
        CommonUtil.copyPropertiesDomainToDomain(
            w9023Form.getW9023CriteriaDomain(), resultDomain);
        
        // (Required for input check) to set the language code.
        // 言語コードの設定 (入力チェックに必要)
        w9023Form.getW9023CriteriaDomain().setLanguageCd(w9023Form.getLanguageCd());
        
        // Transition to packing instruction Create screen.
        // 梱包指示Create画面へ遷移
        return FORWARD_SUCCESS;
    }

    /**
     * Get date.
     * <br />データを取得します。
     *
     * @param criteriaDomain criteriaDomain
     * @throws ApplicationException If there is an input error <br />入力エラーがある場合
     * @return W9023CriteriaDomain search result
     */
    protected W9023CriteriaDomain getInitData(W9023CriteriaDomain criteriaDomain) throws ApplicationException {
        
        if (MODE_NEW.equals(criteriaDomain.getProcMode())) {
            return criteriaDomain;
        }
        
        // Execution of search.
        // 検索の実行
        return w9023InitFacadeService.search(criteriaDomain);
    }
    
    /**
     * 
     * <br />{@link W9023CriteriaDomain}を設定します。
     *
     * @param form Export Ship to Shipping MA Edit画面のアクション・フォーム
     * @param request HTTP request
     * @return 設定した{@link W9023CriteriaDomain}
     */
    protected W9023CriteriaDomain prepareCriteriaDomain (W9023ActionForm form, HttpServletRequest request) {
        // Get of domain conditions.
        // 条件ドメインの取得
        W9023CriteriaDomain criteriaDomain = form.getW9023CriteriaDomain();
        
        // Set Condition domain.
        // 条件ドメインの設定
        ActionUtil.prepareBusinessDomain(criteriaDomain, form.getWindowId(), form.getScreenId());
        
        criteriaDomain.setCompany(StringUtil.getEmptyToBlank((String) request.getAttribute("company")));
        criteriaDomain.setDocNo(StringUtil.getEmptyToBlank((String) request.getAttribute("documentNo")));
        
        criteriaDomain.setDscId(criteriaDomain.getLoginUserDscId());
        
        return criteriaDomain;
    }
}
