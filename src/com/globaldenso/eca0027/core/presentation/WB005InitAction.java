/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PAGE_MAX_COUNT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_WB004;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.service.TmCdService;
import com.globaldenso.eca0027.core.business.domain.WB005CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.WB005ListDomain;
import com.globaldenso.eca0027.core.business.domain.WB005UpdateDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.presentation.ActionPageInfoCreator;
import com.globaldenso.gscm.framework.util.ActionUtil;
import com.globaldenso.gscm.framework.util.PageInfoCreator;

/**
 *    This is an Init action class of an ordering search detailed screen.
 * <br />受注検索詳細画面のInitアクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":WB005.jsp
 *     - "error":WB005.jsp
 * </pre>
 * 
 * @author $Author: 810833613 $
 * @version $Revision: 7151 $
 */
public class WB005InitAction extends WB005AbstractAction {

    /** 
     * Code Master service
     * <br />コード原単位サービス
     */
    protected TmCdService tmCdService;
    
    /**
     * InitFacade service
     * <br />InitFacadeサービス
     */
    protected SearchFacadeService<WB005UpdateDomain, WB005CriteriaDomain> wb005InitFacadeService;
    
    /**
     * constructor.
     * <br />デフォルトコンストラクタ。
     */
    public WB005InitAction() {
        super();
    }

    /**
     * Setter method for tmCdService.
     *
     * @param tmCdService Set for tmCdService
     */
    public void setTmCdService(TmCdService tmCdService) {
        this.tmCdService = tmCdService;
    }
    
    /**
     * Setter method for wb005InitFacadeService.
     * 
     * @param transactFacadeService Set for wb005InitFacadeService
     */
    public void setWb005InitFacadeService(
        SearchFacadeService<WB005UpdateDomain, WB005CriteriaDomain> transactFacadeService) {
        wb005InitFacadeService = transactFacadeService;
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

        // Setting of action form
        // アクションフォームの設定
        WB005ActionForm wb005Form = prepareForm((WB005ActionForm) form);
        
        WB005CriteriaDomain criteriaDomain = prepareCriteriaDomain(request, mapping, wb005Form);
        
        WB005UpdateDomain searchResult = wb005InitFacadeService.search(criteriaDomain);
        
        List<? extends WB005ListDomain> resultList = searchResult.getListDomainList();
        setListDomainList(mapping, wb005Form, request, resultList);
        
        if (resultList.size() > 0){
            return FORWARD_SUCCESS;
        } else {
            
            // Setting of an error message
            // エラーメッセージの設定
            saveErrors(request, mapping, GSCM_E0_0001, null);
            
            return SCREEN_ID_WB004;
        }
        
    }

    /**
     *    Action form is set up.
     * <br />アクションフォームを設定します。
     *
     * @param form Action form<br />アクションフォーム
     * @return Action form<br />アクションフォーム
     */
    protected WB005ActionForm prepareForm(WB005ActionForm form) {
        // Setting WB005ActionForm of action form
        // アクション・フォームの設定 WB005ActionForm
        form.setCountPerPage(PAGE_MAX_COUNT);
        
        return form;
    }
    
    /**
     * Set up a search-condition domain.
     * <br />検索条件ドメインを設定します。
     *
     * @param request HTTP request<br />HTTPリクエスト
     * @param mapping Action mapping<br />アクション・マッピング
     * @param form Action form<br />アクション・フォーム
     * @return Search-condition domain<br />検索条件ドメイン
     * @throws ApplicationException When there is no authority<br />権限がない場合
     */
    protected WB005CriteriaDomain prepareCriteriaDomain(HttpServletRequest request, ActionMapping mapping, WB005ActionForm form) 
        throws ApplicationException {
        
        // Create of a search-condition domain
        // 検索条件ドメインの作成
        WB005CriteriaDomain criteriaDomain = form.getCriteriaDomain();
        
        // Setting of a screen common information
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(criteriaDomain, form.getWindowId(), form.getScreenId());
        
        // page control processing
        // ページ制御処理
        PageInfoCreator pageInfoCreator = new ActionPageInfoCreator(form, mapping, request);
        criteriaDomain.setPageInfoCreator(pageInfoCreator);
        
        // The case at the time of the changes from retrieval picture is acquisition of a taking over VALUE.
        // 検索画面からの遷移時の場合、引継ぎ値の取得
        if (StringUtils.equals(form.getCallScreenId(), SCREEN_ID_WB004)) {
            String compCd = (String)request.getAttribute("rcvOdrCompCd");
            String compNm = (String)request.getAttribute("compNm");
            String customerCd = (String)request.getAttribute("customerCd");
            String shipTo = (String)request.getAttribute("lgcyShipTo");
            String shipToNm = (String)request.getAttribute("shipToNm");
            String trnsCd = (String)request.getAttribute("trnsCd");
            String itemNo = (String)request.getAttribute("itemNo");
            String pkgCd = (String)request.getAttribute("pkgCd");
            if (pkgCd.equals(" ")) {
                pkgCd = "";
            }
            String itemDescription = (String)request.getAttribute("itemDescription");
            
            // It sets to criteria.
            // criteriaに設定
            criteriaDomain.setRcvOdrCompCd(compCd);
            criteriaDomain.setCompNm(compNm);
            criteriaDomain.setCustomerCd(customerCd);
            criteriaDomain.setLgcyShipTo(shipTo);
            criteriaDomain.setShipToNm(shipToNm);
            criteriaDomain.setTrnsCd(trnsCd);
            criteriaDomain.setItemNo(itemNo);
            criteriaDomain.setPkgCd(pkgCd);
            criteriaDomain.setItemDescription(itemDescription);
            
        }
        
        return criteriaDomain;
    }
    
    /**
     *    Search results are set up.
     * <br />検索結果を設定します。
     *
     * @param mapping Action mapping<br />アクションマッピング
     * @param form Action form<br />アクションフォーム
     * @param request HTTP request<br />HTTPリクエスト
     * @param searchResult Search results<br />検索結果
     * @throws ApplicationException When page information is unacquirable<br />ページ情報が取得できない場合
     */
    protected void setListDomainList(ActionMapping mapping, WB005ActionForm form, HttpServletRequest request,
        List<? extends WB005ListDomain> searchResult) throws ApplicationException {

        // A setting of a List domain (for screen display)
        // Listドメイン(画面表示用)の設定
        form.setListDomainList(searchResult);
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
}
