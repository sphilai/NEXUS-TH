/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PAGE_MAX_COUNT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W2006;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W2008;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WINDOW_ID_0;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W2006CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W2008CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W2018CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W2018ListDomain;
import com.globaldenso.eca0027.core.business.facadeservice.presentation.W2018InitFacadeServiceImpl;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.presentation.ScreenInfoDomain;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.ActionUtil;
import com.globaldenso.gscm.framework.util.CheckUtil;

/**
 * The Init action class of Multiple Item No. in 1Box PKG Detail
 * <br />小箱内多品番梱包PKG Info Detail画面のInitアクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":W2018.jsp
 *     - "error":W2018.jsp
 * </pre>
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7336 $
 */
public class W2018InitAction extends W2018AbstractAction {

    /**
     * InitFacade service
     * <br />InitFacadeサービス
     */
    protected SearchFacadeService<List<? extends W2018ListDomain>, W2018CriteriaDomain> w2018InitFacadeService;
    
    /**
     * constructor.
     */
    public W2018InitAction() {
        super();
    }

    /**
     * Setter method for w2018SearchFacadeService.
     *
     * @param searchFacadeService Set for w2018SearchFacadeService
     */
    public void setW2018InitFacadeService(
        SearchFacadeService<List<? extends W2018ListDomain>, W2018CriteriaDomain> searchFacadeService) {
        w2018InitFacadeService = searchFacadeService;
    }
    
    /**
     * {@inheritDoc}.
     * <pre>
     * - Setting of action form
     *       A List domain is cleared.
     *
     * - Setting of a search-condition domain
     *       The following informations are set as {@link W2018CriteriaDomain}.
     *         - Screen common information
     *        - Transition-original-screen ID ({acquisition at @link W2018ActionForm#getCallScreenId()})
     *         Information on - Header screen (from a Create screen to the time of changes)
     *         Information on - Register screen
     *
     * - Execution of retrieval processing
     *       {@link W2018InitFacadeServiceImpl W2018InitFacadeServiceImpl#search (W2018CriteriaDomain)} is called for {@link W2018CriteriaDomain} to an argument.
     *
     * - Setting of search results
     *       The above-mentioned result is set as {@link W2018ActionForm} list domain.
     *       The contents of head data are set as {@link W2018ActionForm} criteria domain.
     *
     * - Screen fields attributes
     *       Set screen field attributes {@link #controlDisplay (HttpServletRequest, W2018ActionForm)}.
     * 
     * 
     * - アクションフォームの設定
     *     Listドメインをクリアする
     *     
     * - 検索条件ドメインの設定
     *     以下の情報を{@link W2018CriteriaDomain}に設定する
     *       - 画面共通情報
     *       - 遷移元画面ID ({@link W2018ActionForm#getCallScreenId()}で取得
     *       - Header画面の情報 (Create画面から遷移時)
     *       - Register画面の情報
     *       
     * - 検索処理の実行
     *     {@link W2018CriteriaDomain}を引数に{@link W2018InitFacadeServiceImpl W2018InitFacadeServiceImpl#search(W2018CriteriaDomain)}を呼出す
     *     
     * - 検索結果の設定
     *     上記の結果を{@link W2018ActionForm}のリストドメインに設定する
     *     先頭データの内容を{@link W2018ActionForm}の検索条件ドメインに設定する
     *     
     * - 画面表示制御
     *     {@link #controlDisplay(HttpServletRequest, W2018ActionForm)}を呼出し、画面項目の活性制御を行う
     *     
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws ApplicationException {
        
        // Setting of action form
        // アクションフォームの設定
        W2018ActionForm w2018Form = prepareForm((W2018ActionForm) form);
        // Setting of a search-condition domain
        // 検索条件ドメインの設定
        W2018CriteriaDomain criteriaDomain = prepareCriteriaDomain(w2018Form);
        // Execution of retrieval processing
        // 検索処理の実行
        List<? extends W2018ListDomain> listDomainList = w2018InitFacadeService.search(criteriaDomain);
        // Setting of search results
        // 検索結果の設定
        setSearchResult(w2018Form, listDomainList);
        
        return FORWARD_SUCCESS;
    }
    
    /**
     *    Action form is set up.
     * <br />アクションフォームを設定します。
     *
     * @param form Action form<br />アクションフォーム
     * @return Action form<br />アクションフォーム
     */
    protected W2018ActionForm prepareForm(W2018ActionForm form) {
        // The clearance of a List domain
        // Listドメインのクリア 
        form.setListDomainList(null);
        
        return form;
    }
    
    /**
     *    A search-condition domain is set up.
     * <br />検索条件ドメインを設定します。
     *
     * @param form Action form<br />アクションフォーム
     * @return Search-condition domain<br />検索条件ドメイン
     */
    protected W2018CriteriaDomain prepareCriteriaDomain(W2018ActionForm form) {
        W2018CriteriaDomain criteriaDomain = form.getW2018CriteriaDomain();
        
        // Setting of a screen common information
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(criteriaDomain, form.getWindowId(), form.getScreenId());
        // Set transition original screen id
        // 遷移元画面IDの設定
        criteriaDomain.setCallScreenId(form.getCallScreenId());
        
        WindowInfoDomain windowInfo = (WindowInfoDomain) DensoContext.get().getGeneralArea(WINDOW_ID_0);
        ScreenInfoDomain screenInfo = (ScreenInfoDomain) windowInfo.getScreenInfo().get(SCREEN_ID_W2008); 
        W2008ActionForm w2008Form = (W2008ActionForm) screenInfo.getActionForm();
        W2008CriteriaDomain dispInfo = w2008Form.getW2008CriteriaDomain();
        
        String mixTagNo = dispInfo.getMixTagNo();
        // When there is Session (W2008.Mix Tag No.), it changes from a Main Screen.
        // Session(W2008.Mix Tag No.)がある場合、Main Screen画面からの遷移
        if(!CheckUtil.isBlankOrNull(mixTagNo)){
            criteriaDomain.setShipperCd(dispInfo.getShipperCd());
            criteriaDomain.setCustomerCd(dispInfo.getCustomerCd());
            criteriaDomain.setLgcyShipTo(dispInfo.getLgcyShipTo());
            criteriaDomain.setTrnsCd(dispInfo.getTrnsCd());
            criteriaDomain.setPlntCd(dispInfo.getPlntCd());
            criteriaDomain.setLgcyWhCd(dispInfo.getLgcyWhCd());
            criteriaDomain.setPltzInstrNo(dispInfo.getPltzInstrNo());
            criteriaDomain.setWhCompCd(dispInfo.getWhCompCd());
            criteriaDomain.setWhCd(dispInfo.getWhCd());
            criteriaDomain.setMixTagStatus(dispInfo.getMixTagStatus());
            criteriaDomain.setInvoiceKey(dispInfo.getInvoiceKey());
            criteriaDomain.setContainerSortingKey(dispInfo.getContainerSortingKey());
            criteriaDomain.setLoadingCd(dispInfo.getLoadingCd());
            criteriaDomain.setNetWeight(dispInfo.getNetWeight());
            criteriaDomain.setGrossWeight(dispInfo.getGrossWeight());
            criteriaDomain.setPkgIp(dispInfo.getPkgIp());
            criteriaDomain.setBoxNo(dispInfo.getBoxNo());
            criteriaDomain.setMixTagNo(mixTagNo);
            criteriaDomain.setWeightUnit(dispInfo.getWeightUnitDisp());
        }else{
            // Acquisition of a Header information
            // Header情報の取得
            ScreenInfoDomain headerScreenInfo = (ScreenInfoDomain) windowInfo.getScreenInfo().get(SCREEN_ID_W2006);
            W2006ActionForm w2006Form = (W2006ActionForm) headerScreenInfo.getActionForm();
            W2006CriteriaDomain headerInfo = w2006Form.getW2006CriteriaDomain();
            // The set of a Header information
            // Header情報のセット
            if(headerInfo != null){
                criteriaDomain.setShipperCd(headerInfo.getShipperCd());
                criteriaDomain.setCustomerCd(headerInfo.getCustomerCd());
                criteriaDomain.setLgcyShipTo(headerInfo.getLgcyShipTo());
                criteriaDomain.setTrnsCd(headerInfo.getTrnsCd());
                criteriaDomain.setPlntCd(headerInfo.getPlntCd());
                criteriaDomain.setLgcyWhCd(headerInfo.getLgcyWhCd());
                criteriaDomain.setPltzInstrNo(headerInfo.getPltzInstrNo());
                criteriaDomain.setWhCompCd(headerInfo.getWhCompCd());
                criteriaDomain.setWhCd(headerInfo.getWhCd());
            }
            // The set of a Register information
            // Register情報のセット
            criteriaDomain.setMixTagStatus(dispInfo.getMixTagStatus());
            criteriaDomain.setInvoiceKey(dispInfo.getInvoiceKey());
            criteriaDomain.setContainerSortingKey(dispInfo.getContainerSortingKey());
            criteriaDomain.setLoadingCd(dispInfo.getLoadingCd());
            criteriaDomain.setNetWeight(dispInfo.getNetWeight());
            criteriaDomain.setGrossWeight(dispInfo.getGrossWeight());
            criteriaDomain.setPkgIp(dispInfo.getPkgIp());
            criteriaDomain.setBoxNo(dispInfo.getBoxNo());
            criteriaDomain.setWeightUnit(dispInfo.getWeightUnitDisp());
        }
        
        return criteriaDomain;
    }
    
    /**
     *    Search results are set up.
     * <br />検索結果を設定します。
     *
     * @param form Action form<br />アクションフォーム
     * @param listDomainList Search results<br />検索結果
     */
    protected void setSearchResult(W2018ActionForm form, List<? extends W2018ListDomain> listDomainList) {
        
        // Set page size
        // ページサイズの設定
        form.setCountPerPage(PAGE_MAX_COUNT);
        // A setting of a List domain
        // Listドメインの設定
        form.setListDomainList(listDomainList);
    }
    


}
