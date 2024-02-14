/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0009;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PAGE_MAX_COUNT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W9002B;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W9002R;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W9002CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W9002ListDomain;
import com.globaldenso.eca0027.core.common.business.domain.UserAuthDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.presentation.ActionPageInfoCreator;
import com.globaldenso.gscm.framework.util.ActionUtil;
import com.globaldenso.gscm.framework.util.PageInfoCreator;

/**
 * Search action class of Agent MA Inquiry screen.
 * <br />Agent MA Inquiry画面の検索アクションクラスです。
 *<pre>
 * forward name-path mapping:
 *     - "success":W9002.jsp
 *     - "error":W9002.jsp
 * </pre>
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W9002SearchAction extends W9002AbstractAction {

    /**
     * Search Facade Service
     * <br />検索Facadeサービス
     */
    protected SearchFacadeService<List<? extends W9002ListDomain>, W9002CriteriaDomain> w9002SearchFacadeService;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W9002SearchAction() {
        super();
    }

    /**
     * Setter method for w9002SearchFacadeService.
     *
     * @param searchFacadeService Set for w9002SearchFacadeService
     */
    public void setW9002SearchFacadeService(
        SearchFacadeService<List<? extends W9002ListDomain>, W9002CriteriaDomain> searchFacadeService) {
        w9002SearchFacadeService = searchFacadeService;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * - Setting the action form
     *     Clear the List domain
     *     Set the maximum number of searches
     * - Set of search results
     *     Set the domain list the results of the above-mentioned
     *
     * - Screen display control
     *     Active control of the screen item ({@link W9002AbstractAction#controlDisplay(W9002ActionForm, HttpServletRequest)})
     *     Display the search results area (display the true flag)
     * </pre>
     * <pre>
     * - アクションフォームの設定
     *     Listドメインをクリアする
     *     最大検索件数を設定する
     * - 検索結果の設定
     *     上記の結果をリストドメインに設定する
     *
     * - 画面表示制御
     *     画面項目の活性制御を行う ({@link W9002AbstractAction#controlDisplay(W9002ActionForm, HttpServletRequest)})
     *     検索結果エリアを表示にする (表示フラグをtrueにする)
     * </pre>
     * @see com.globaldenso.eca0027.core.presentation.W9002AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response)
        throws Exception {
        
        W9002ActionForm w9002Form = prepareForm((W9002ActionForm) form);

        W9002CriteriaDomain criteriaDomain = prepareCriteriaDomain(request, mapping, w9002Form);
        
        controlDisplay(w9002Form, request);
        
        List<? extends W9002ListDomain> listDomainList = w9002SearchFacadeService.search(criteriaDomain);
        
        w9002Form.setListDomainList(listDomainList);
        
        controlDisplay(w9002Form, request);
        
        return FORWARD_SUCCESS;
    }

    /**
     * Set the action form.
     * <br />アクションフォームを設定します。
     *
     * @param form Action Form<br />
     * アクションフォーム
     * @return Action Form<br />
     * アクションフォーム
     */
    protected W9002ActionForm prepareForm(W9002ActionForm form) {
        
        form.setListDomainList(null);
        form.setCountPerPage(PAGE_MAX_COUNT);
        
        return form;
    }
    
    /**
     * Set the search criteria domain.
     * <br />検索条件ドメインを設定します。
     *
     * @param request HTTP request<br />
     * HTTPリクエスト
     * @param mapping Action mapping<br />
     * アクション・マッピング
     * @param form Action Form<br />
     * アクション・フォーム
     * @return Search conditions domain<br />
     * 検索条件ドメイン
     * @throws ApplicationException do not have permission to Palletize Instruction<br />
     * 梱包指示の権限がない場合
     */
    protected W9002CriteriaDomain prepareCriteriaDomain(HttpServletRequest request, ActionMapping mapping, W9002ActionForm form) 
        throws ApplicationException {
        
        W9002CriteriaDomain criteriaDomain = form.getW9002CriteriaDomain();
        // Set the initial value to business domain from CommonInfoDomain.
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(criteriaDomain, form.getWindowId(), form.getScreenId());
        
        PageInfoCreator pageInfoCreator = new ActionPageInfoCreator(form, mapping, request);
        criteriaDomain.setPageInfoCreator(pageInfoCreator);

        // Set user authority.
        // 権限の設定
        if (userAuthService.hasRegisterAll() || userAuthService.hasBrowseAll()) {
            criteriaDomain.setUserAuthList(null);
        } else {
            String[] permitFuncIdList = { PERMIT_FUNC_ID_W9002R, PERMIT_FUNC_ID_W9002B };
            List<? extends UserAuthDomain> userAuthList = userAuthService.getUserAuthList(permitFuncIdList);
            if (userAuthList.size() == 0) {
                throw new GscmApplicationException(GSCM_I0_0009);
            }

            criteriaDomain.setUserAuthList(userAuthList);
        }
        // Set company code which has a update authority.
        // 更新権限を保有する会社コードの設定
        List<? extends UserAuthDomain> userAuthList = userAuthService.getUserAuthList(PERMIT_FUNC_ID_W9002R);
        List<String> authUpdList = new ArrayList<String>();
        for (UserAuthDomain userAuth : userAuthList) {
            if (!authUpdList.contains(userAuth.getAuthMgtComp())) {
                authUpdList.add(userAuth.getAuthMgtComp());
            }
        }
        criteriaDomain.setAuthUpdCompCd(authUpdList);
        
        return criteriaDomain;
    }
}
