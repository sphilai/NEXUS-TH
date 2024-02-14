/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W1008;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W1008CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W1009CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W1009ListDomain;
import com.globaldenso.eca0027.core.business.domain.W1009UpdateDomain;
import com.globaldenso.eca0027.core.business.domain.W2013CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W2013ListDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.presentation.ScreenInfoDomain;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 *    This is an initial display action class of a Export Packaging Returnable PKG  Material screen.
 * <br />
 * <pre>
 * forward name-path mappings:
 *     - "success":W1009.jsp
 *     - "error":W1009.jsp
 * </pre>
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W1009InitAction extends W1009AbstractAction {

    /**
     * Init Facade service
     * <br />Init Facade サービス
     */
    protected SearchFacadeService<W1009UpdateDomain, W1009UpdateDomain> w1009InitFacadeService;
    /**
     * Init Facade service
     * <br />Init Facade サービス
     */
    protected SearchFacadeService<List<? extends W2013ListDomain>, W2013CriteriaDomain> w2013InitFacadeService;
    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W1009InitAction() {
        super();
    }
    
    /**
     * <p>Setter method for w2013InitFacadeService.</p>
     *
     * @param initFacadeService Set for w2013InitFacadeService
     */
    public void setW2013InitFacadeService(
        SearchFacadeService<List<? extends W2013ListDomain>, W2013CriteriaDomain> initFacadeService) {
        w2013InitFacadeService = initFacadeService;
    }

    /**
     * Setter method for w1009InitFacadeService.
     * 
     * @param initFacadeService Set for w1009InitFacadeService
     */
    public void setW1009InitFacadeService(
        SearchFacadeService<W1009UpdateDomain, W1009UpdateDomain> initFacadeService) {
        w1009InitFacadeService = initFacadeService;
    }
    
    /**
     * {@inheritDoc}
     * </pre>
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws Exception {
  
        W1009ActionForm w1009Form = prepareForm((W1009ActionForm) form);
        
        W1009UpdateDomain w1009UpdateDomain = prepareCriteriaDomain(w1009Form);
        
        W1009UpdateDomain result = w1009InitFacadeService.search(w1009UpdateDomain);
        
        // Setting of search results
        w1009Form.setListDomainList(result.getListDomainList());
        
        // Set dropdown value
        if(result.getListDomainList() != null && result.getListDomainList().size() > 0)
        {
            for(W1009ListDomain domain :  result.getListDomainList()){
                domain.setSelectUnitNetWeight(domain.getNetWeightUnit());
                domain.setSelectQtyUnit(domain.getQtyUnit());
                domain.setSelectOriginCntryCd(domain.getOriginCntryCd());
                domain.setSelectCurrCd(domain.getCurrCd());
            }
        }
        
        // Display control of a Main screen
        controlDisplay(w1009Form, request);
        
        return FORWARD_SUCCESS;
    }
    
    /**
     *    Action form is set up.
     * <br />アクションフォームを設定します。
     *
     * @param form Action form<br />アクションフォーム
     * @return Action form<br />アクションフォーム
     */
    protected W1009ActionForm prepareForm(W1009ActionForm form) {
        
        // The clearance of a List domain
        form.setListDomainList(null);
        
        return form;
    }
    /**
     *    The specified message is set as {@link ActionMessages}.
     * <br />指定されたメッセージを{@link ActionMessages}に設定します。
     *
     * @param request HTTP request<br />HTTPリクエスト
     * @param mapping Action mapping<br />アクションマッピング
     * @param messageId ID of the message to set up<br />設定するメッセージのID
     * @param args Message argument<br />メッセージ引数
     */
    protected void saveErrors(HttpServletRequest request, ActionMapping mapping, String messageId, Object[] args) {
        ActionMessages errors = new ActionMessages();
        errors.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage(messageId, args));
        
        saveErrors(request, errors);
    }
    /**
     *    An information is acquired from action form and a session and a search-condition domain is created.
     * <br />アクションフォーム、セッションから情報を取得して検索条件ドメインを作成
     * @param form Action form<br />アクションフォーム
     * @return Search-condition domain<br />検索条件ドメイン
     * @throws GscmApplicationException When a business error occurs during processing<br />処理中に業務的なエラーが発生した場合
     */
    protected W1009UpdateDomain prepareCriteriaDomain(W1009ActionForm form) throws GscmApplicationException {
        
        // Acquisition of a search-condition domain
        W1009UpdateDomain w1009UpdateDomain = new W1009UpdateDomain();

        WindowInfoDomain windowInfo = (WindowInfoDomain) DensoContext.get().getGeneralArea(form.getWindowId());
        ScreenInfoDomain screenInfo = windowInfo.getScreenInfo().get(SCREEN_ID_W1008);
        W1008CriteriaDomain w1008CriteriaDomain = ((W1008ActionForm) screenInfo.getActionForm()).getW1008CriteriaDomain();
        
        // Acquisition of a search-condition domain
        W1009CriteriaDomain w1009Criteria = form.getW1009CriteriaDomain();
        
        // The copy of a Header information
        CommonUtil.copyPropertiesDomainToDomain(w1009Criteria, w1008CriteriaDomain);

        w1009Criteria.setDcsId(windowInfo.getCommonInfo().getUserName());
        
        w1009UpdateDomain.setCriteriaDomain(w1009Criteria);

        return w1009UpdateDomain;
    }
    
    /**
     * Set screen button attributes. Set screen field attributes.
     * <br />ボタンの表示制御、項目の活性・非活性制御
     *
     * @param form Action form<br />アクションフォーム
     * @param request HTTP request<br />HTTPリクエスト
     * @throws ApplicationException When an error occurs in DB processing<br />DB処理でエラーが発生した場合
     */
    protected void controlDisplay(W1009ActionForm form, HttpServletRequest request) throws ApplicationException {
        // Set screen button attributes.
        super.controlDisplay(request, form);
    }
}
