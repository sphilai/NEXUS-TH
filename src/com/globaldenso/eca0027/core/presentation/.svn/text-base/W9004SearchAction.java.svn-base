/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PAGE_MAX_COUNT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ROLE_AREA_ADMIN;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W9004CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W9004ListDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.presentation.ActionPageInfoCreator;
import com.globaldenso.gscm.framework.util.ActionUtil;
import com.globaldenso.gscm.framework.util.PageInfoCreator;

/**
 * Search action class of User ID MA Inquiry screen.
 * <br />User ID MA Inquiry画面の検索アクションクラスです。
 * <pre>
 * forward name-path mapping:
 *     - "success":W9004.jsp
 *     - "error":W9004.jsp
 * </pre>
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W9004SearchAction extends W9004AbstractAction {

    /**
     * Search Facade Service
     * <br />検索Facadeサービス
     */
    protected SearchFacadeService<List<? extends W9004ListDomain>, W9004CriteriaDomain> w9004SearchFacadeService;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W9004SearchAction() {
        super();
    }

    /**
     * Setter method for w9004SearchFacadeService.
     *
     * @param searchFacadeService Set for w9004SearchFacadeService
     */
    public void setW9004SearchFacadeService(SearchFacadeService<List<? extends W9004ListDomain>, W9004CriteriaDomain> searchFacadeService) {
        w9004SearchFacadeService = searchFacadeService;
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
     *     Active control of the screen item ({@link W9004AbstractAction#controlDisplay(W9004ActionForm, HttpServletRequest)})
     *     Display the search results area (display the true flag)
     * 
     * - アクションフォームの設定
     *     Listドメインをクリアする
     *     最大検索件数を設定する
     * - 検索結果の設定
     *     上記の結果をリストドメインに設定する
     *
     * - 画面表示制御
     *     画面項目の活性制御を行う ({@link W9004AbstractAction#controlDisplay(W9004ActionForm, HttpServletRequest)})
     *     検索結果エリアを表示にする (表示フラグをtrueにする)
     * </pre>
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response)
        throws Exception {
        
        W9004ActionForm w9004Form = prepareForm((W9004ActionForm) form);
        
        W9004CriteriaDomain criteriaDomain = prepareCriteriaDomain(request, mapping, w9004Form);
        
        List<? extends W9004ListDomain> listDomainList = w9004SearchFacadeService.search(criteriaDomain);
        
        w9004Form.setListDomainList(listDomainList);
        
        controlDisplay(w9004Form, request);
        
        return FORWARD_SUCCESS;
    }

    /**
     * Set the action form.
     * <br />アクションフォームを設定します。
     *
     * @param form Action Form <br />アクションフォーム
     * @return Action Form <br />アクションフォーム
     */
    protected W9004ActionForm prepareForm(W9004ActionForm form) {
        
        form.setListDomainList(null);
        form.setCountPerPage(PAGE_MAX_COUNT);
        
        return form;
    }
    
    /**
     * Set the search criteria domain.
     * <br />検索条件ドメインを設定します。
     *
     * @param request HTTP request <br />HTTPリクエスト
     * @param mapping Action mapping <br />アクション・マッピング
     * @param form Action Form <br />アクション・フォーム
     * @return Search conditions domain <br />検索条件ドメイン
     * @throws ApplicationException do not have permission of Packaging Instruction (= Pull) <br />梱包指示の権限がない場合
     */
    protected W9004CriteriaDomain prepareCriteriaDomain(HttpServletRequest request, ActionMapping mapping, W9004ActionForm form) 
        throws ApplicationException {
        
        
        W9004CriteriaDomain criteriaDomain = form.getW9004CriteriaDomain();
        String tmpCompCd = criteriaDomain.getCompCd();
        String tmpDscId = criteriaDomain.getDscId();
        String tmpUsrNmEn = criteriaDomain.getUsrNmEn();
        // Set the initial value to business domain from CommonInfoDomain.
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(criteriaDomain, form.getWindowId(), form.getScreenId());
        criteriaDomain.setCompCd(tmpCompCd);
        criteriaDomain.setDscId(tmpDscId);
        criteriaDomain.setUsrNmEn(tmpUsrNmEn);
        
        PageInfoCreator pageInfoCreator = new ActionPageInfoCreator(form, mapping, request);
        criteriaDomain.setPageInfoCreator(pageInfoCreator);
        
        // Set user authority.
        // 権限の設定
        // 地域管理者権限なら、会社の絞り込みはしない。
        if (super.userAuthService.hasRole(ROLE_AREA_ADMIN)) {
            criteriaDomain.setOwnerCompCd("");
        }
        
        return criteriaDomain;
    }
}
