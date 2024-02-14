/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W1003CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W1003ListDomain;
import com.globaldenso.eca0027.core.business.domain.W1004CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W1004ListDomain;
import com.globaldenso.eca0027.core.business.domain.W1004UpdateDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.presentation.ActionPageInfoCreator;
import com.globaldenso.gscm.framework.presentation.ScreenInfoDomain;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.ActionUtil;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.PageInfoCreator;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W1003;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

/**
 *    This is an initial display action class of a Export Request Kit screen.
 * <br />
 * <pre>
 * forward name-path mappings:
 *     - "success":W1004.jsp
 *     - "error":W1004.jsp
 * </pre>
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W1004InitAction extends W1004AbstractAction {

    /**
     * Init Facade service
     * <br />Init Facade サービス
     */
    protected SearchFacadeService<W1004UpdateDomain, W1004UpdateDomain> w1004InitFacadeService;
    
    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W1004InitAction() {
        super();
    }
    
    /**
     * Setter method for w1004InitFacadeService.
     * 
     * @param initFacadeService Set for w1004InitFacadeService
     */
    public void setW1004InitFacadeService(
        SearchFacadeService<W1004UpdateDomain, W1004UpdateDomain> initFacadeService) {
        w1004InitFacadeService = initFacadeService;
    }
    
    /**
     * {@inheritDoc}
     * </pre>
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws Exception {
  
        W1004ActionForm w1004Form = prepareForm((W1004ActionForm) form);
        
        W1004UpdateDomain w1004UpdateDomain = prepareCriteriaDomain(request, mapping, w1004Form);
        
        if (w1004UpdateDomain.getListDomainList().size() <= 0) {
            // Display control of a Main screen
            // Main画面の表示制御
            controlDisplay(w1004Form, request);
            
            return FORWARD_SUCCESS;
        }
        
        W1004UpdateDomain result = w1004InitFacadeService.search(w1004UpdateDomain);
        
        // Setting of search results
        w1004Form.setListDomainList(result.getListDomainList());
        w1004Form.setKitList(result.getKitList());
        
        // Display control of a Main screen
        // Main画面の表示制御
        controlDisplay(w1004Form, request);
        
        return FORWARD_SUCCESS;
    }
    
    /**
     *    Action form is set up.
     * <br />アクションフォームを設定します。
     *
     * @param form Action form<br />アクションフォーム
     * @return Action form<br />アクションフォーム
     */
    protected W1004ActionForm prepareForm(W1004ActionForm form) {
        
        // The clearance of a List domain
        // Listドメインのクリア 
        form.setListDomainList(null);
        
        form.setCountPerPage(1);
        
        return form;
    }
    
    /**
     *    An information is acquired from action form and a session and a search-condition domain is created.
     * <br />アクションフォーム、セッションから情報を取得して検索条件ドメインを作成
     * @param request HttpServletRequest<br />アクションフォーム
     * @param mapping ActionMapping<br />アクションフォーム
     * @param form Action form<br />アクションフォーム
     * @return Search-condition domain<br />検索条件ドメイン
     * @throws GscmApplicationException When a business error occurs during processing<br />処理中に業務的なエラーが発生した場合
     */
    protected W1004UpdateDomain prepareCriteriaDomain(HttpServletRequest request, ActionMapping mapping, W1004ActionForm form) throws GscmApplicationException {
        
        // Acquisition of a search-condition domain
        W1004CriteriaDomain criteriaDomain = form.getW1004CriteriaDomain();
        W1004UpdateDomain w1004UpdateDomain = new W1004UpdateDomain();
        // Setting of a screen common information
        ActionUtil.prepareBusinessDomain(criteriaDomain, form.getWindowId(), form.getScreenId());
        
        WindowInfoDomain windowInfo = (WindowInfoDomain) DensoContext.get().getGeneralArea(form.getWindowId());
        ScreenInfoDomain screenInfo = windowInfo.getScreenInfo().get(SCREEN_ID_W1003);
        W1003CriteriaDomain w1003CriteriaDomain = ((W1003ActionForm) screenInfo.getActionForm()).getW1003CriteriaDomain();
        List<? extends W1003ListDomain> w1003Domain = ((W1003ActionForm) screenInfo.getActionForm()).getListDomainList();
        
        // Acquisition of a search-condition domain
        // 検索条件ドメインの取得
        W1004CriteriaDomain w1004Criteria = form.getW1004CriteriaDomain();
        
        // The copy of a Header information
        // Header情報のコピー
        CommonUtil.copyPropertiesDomainToDomain(w1004Criteria, w1003CriteriaDomain);
        
        PageInfoCreator pageInfoCreator = new ActionPageInfoCreator(form, mapping, request);
        w1004Criteria.setPageInfoCreator(pageInfoCreator);
        
        w1004Criteria.setLanguageCd(form.getLanguageCd());
        w1004Criteria.setLocale(new Locale(form.getLanguageCd()));
        
        w1004UpdateDomain.setCriteriaDomain(w1004Criteria);
        List<W1004ListDomain> listW1004Domain = new ArrayList<W1004ListDomain>();
        for (W1003ListDomain listDomain : w1003Domain) {
            W1004ListDomain domain = new W1004ListDomain();
            if (listDomain.getKitParFlg().equalsIgnoreCase("Y")) {
                listW1004Domain.add(domain);
            }
        }
        w1004UpdateDomain.setListDomainList(listW1004Domain);

        return w1004UpdateDomain;
    }
    
    /**
     * Set screen button attributes. Set screen field attributes.
     * <br />ボタンの表示制御、項目の活性・非活性制御
     *
     * @param form Action form<br />アクションフォーム
     * @param request HTTP request<br />HTTPリクエスト
     * @throws ApplicationException When an error occurs in DB processing<br />DB処理でエラーが発生した場合
     */
    protected void controlDisplay(W1004ActionForm form, HttpServletRequest request) throws ApplicationException {
        // Set screen button attributes.
        // ボタンの活性制御
        super.controlDisplay(request, form);
    }
}
