/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W5003;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W5004;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_DISABLE_ELEMENT_LIST;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.AUTH_REGISTER_NUMERIC;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.AUTH_EMPTY_NUMERIC;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W5004CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W5004ListDomain;
import com.globaldenso.eca0027.core.common.business.service.UserAuthService;
import com.globaldenso.gscm.framework.presentation.AbstractAction;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.CommonInfoDomain;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 * The base action class of Shipping Confirmation Register Screen
 * <br />出荷確認Register画面の基底アクションクラスです。
 *
 * @author $Author: 10035024400 $
 * @version $Revision: 8436 $
 */
public abstract class W5004AbstractAction extends AbstractAction {

    /**
     * User authority service.
     */
    protected UserAuthService userAuthService;

    /**
     * constructor.
     */
    public W5004AbstractAction() {
        super();
    }

    /**
     * Setter method for userAuthService.
     *
     * @param userAuthService Set for userAuthService
     */
    public void setUserAuthService(UserAuthService userAuthService) {
        this.userAuthService = userAuthService;
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * - Button activity control
     *     Active control of the button by the transition source screen ID
     *
     * - ボタン活性制御
     *     遷移元画面IDによるボタンの活性制御
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#preInvokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    protected String preInvokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws ApplicationException {
        
        W5004ActionForm w5004Form = (W5004ActionForm) form;
        
        // Acquisition of common entry screen.
        // 画面共通項目の取得
        setCommonInfo(w5004Form);
        
        return FORWARD_SUCCESS;
    }


    /**
     * {@inheritDoc}.
     * <p>
     * <pre>
     * - Set the screen ID of transition source
     *     set the screen ID of transition source to action form
     *
     * - 遷移元画面IDの設定
     *     アクション・フォームに遷移元画面IDを設定する
     * </pre>
     * </p>
     * 
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#postInvokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.String)
     */
    protected void postInvokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response, String forwardName) {
        
        W5004ActionForm w5004Form = (W5004ActionForm) form;
        
        // Screen display control.
        // 画面表示制御
        controlDisplay(request, w5004Form);
        
        ((W5004ActionForm) form).setCallScreenId(SCREEN_ID_W5004);
    }

    /**
     * Set the items in the common information to action form
     * <br />画面の共通情報をactionFormに設定する。
     *
     * @param form action form
     */
    protected void setCommonInfo(W5004ActionForm form) {
        // Acquisition of screen common information domain
        // 画面共通情報ドメインの取得
        WindowInfoDomain windowInfo = (WindowInfoDomain) DensoContext.get().getGeneralArea(form.getWindowId());
        CommonInfoDomain commonInfo = windowInfo.getCommonInfo();
        
        // Language code.
        // 言語コードの設定
        form.setLanguageCd(commonInfo.getLanguageCd());
    }
    
    /**
     * Set the search results.
     * <br />検索結果を設定します。
     *
     * @param form action form
     * @param listDomainList search result
     */
    protected void setSearchResult(W5004ActionForm form, List<W5004ListDomain> listDomainList) {
        
        W5004CriteriaDomain criteriaDomain = form.getW5004CriteriaDomain();
        W5004ListDomain listDomain = listDomainList.get(0);
        
        // Setting Criteria domain.
        // Criteriaドメインの設定
        if (SCREEN_ID_W5003.equals(form.getCallScreenId())) {
            criteriaDomain.setContainerLooseTyp(listDomain.getContainerLooseTyp());
            criteriaDomain.setPkgQty(listDomain.getPkgQty());
            criteriaDomain.setGrossWeight(listDomain.getGrossWeight());
            criteriaDomain.setVolume(listDomain.getVolume());
            criteriaDomain.setOperationNo(listDomain.getOperationNo());
            criteriaDomain.setStgInstrNo(listDomain.getStgInstrNo());
            criteriaDomain.setStgActNo(listDomain.getStgActNo());
            criteriaDomain.setTrnsTypCd(listDomain.getTrnsTypCd());
            
        } else {
            CommonUtil.copyPropertiesDomainToDomain(criteriaDomain, listDomainList.get(0));
            CommonUtil.copyPropertiesDomainToActionForm(form, listDomainList.get(0));
        }
        
        // Setting the List domain.
        // Listドメインの設定
        form.setListDomainList(listDomainList);
    }
    
    /**
     * Display control of the screen item.
     * <br />画面項目の表示制御を行います。
     * <pre>
     * - Transition from the Main screen.
     *     The following items are non-active.
     *       - BackToCreate
     *       - Register
     * - Transition from the Create screen.
     *     The following items are non-active.
     *       - PrintConfirmation
     *       - ReUpdateContainerNo
     *       - RegisterWorking
     *       - Cancel
     * 
     * - Main画面から遷移時
     *     以下の項目を非活性にする
     *       - BackToCreateボタン
     *       - Registerボタン
     * - Create画面から遷移時
     *     以下の項目を非活性にする
     *       - PrintConfirmationボタン
     *       - ReUpdateContainerNoボタン
     *       - RegisterWorkingボタン
     *       - Cancelボタン
     * </pre>
     *
     * @param request HTTP request
     * @param form action form
     * @throws ApplicationException
     */
    protected void controlDisplay(HttpServletRequest request, W5004ActionForm form) {
        // List of non-active item.
        // 非活性項目のリスト
        List<String> disableList = new ArrayList<String>();
        form.setActiveFlg(true);
        
        if (SCREEN_ID_W5003.equals(form.getW5004CriteriaDomain().getCallScreenId())) {
            disableList.add("printConfirmation");
            disableList.add("reUpdateContainerNo");
            disableList.add("registerWorking");
            disableList.add("cancel");
        } else {
            form.setActiveFlg(false);
            disableList.add("w5004CriteriaDomain.etd");
            disableList.add("calendar");
            disableList.add("w5004CriteriaDomain.carrierCompCd");
            disableList.add("select");
            disableList.add("backToCreate");
            disableList.add("delete");
            disableList.add("register");
            if (!controlItem(form)) {
                disableList.add("printConfirmation");
                disableList.add("reUpdateContainerNo");
                disableList.add("registerWorking");
                disableList.add("cancel");
            }
        }
        
        // Setting request attributes.
        // リクエスト属性の設定
        request.setAttribute(ATTR_DISABLE_ELEMENT_LIST, disableList);
    }
    
    /**
     * To return the availability of system update button.
     * <br />更新系ボタンの利用可否を返します。
     * 
     * <pre>
     * - There is an update authority.
     *     Made available.
     * - There is a reference authority.
     *     Record of the search result is all updatable, it is available.
     * - There is no authority to use the update authority
     *     Record of the search result is all updatable, it is available.
     *     A record of the search results, in the case of 0, use authority to masking.
     * 
     * - 更新権限がある場合
     *      利用可能とする。
     * - 参照権限がある場合
     *      検索結果のレコードが全て更新可であれば、利用可能とする。
     * - 更新権限と利用権限が無い場合
     *      検索結果のレコードが全て更新可であれば、利用可能とする。
     *      検索結果のレコードで、利用権限が0の場合、マスキングする。
     * </pre>
     *
     * @param form action form
     * @return If TRUE, the display.If FALSE, hidden.
     */
    protected boolean controlItem(W5004ActionForm form) {
        
        List<W5004ListDomain> listDomainList = form.getListDomainList();
        if (listDomainList == null) {
            return false;
        }
        
        int auth = Integer.parseInt(AUTH_REGISTER_NUMERIC);
        
        if (userAuthService.hasRegisterAll()) {
            return true;
        } else if (userAuthService.hasBrowseAll()) {
            
            // For all the records in the search results, I want to see if there is an update authority.
            //  検索結果の全てのレコードに対し、更新権限があるかを確認する。
            for (W5004ListDomain listDomain : listDomainList) {
                
                if (listDomain.getAuth() == null) {
                    auth = Integer.parseInt(AUTH_EMPTY_NUMERIC);
                }else{
                    if (auth > Integer.parseInt(listDomain.getAuth())) {
                        auth = Integer.parseInt(listDomain.getAuth());
                    }
                }
            }
        } else {
            
            // For all the records in the search results, I want to see if there is an update authority.
            //  検索結果の全てのレコードに対し、更新権限があるかを確認する。
            for (W5004ListDomain listDomain : listDomainList) {
                
                if (listDomain.getAuth() == null) {
                    auth = Integer.parseInt(AUTH_EMPTY_NUMERIC);
                }else{
                    if (auth > Integer.parseInt(listDomain.getAuth())) {
                        auth = Integer.parseInt(listDomain.getAuth());
                    }
                }
                
                // If 0, the authority to masking.
                // 権限が0の場合、マスキングする。
                if (listDomain.getAuth() == null || Integer.parseInt(listDomain.getAuth()) == 0) {
                    listDomain.setShipperCd(convert(listDomain.getShipperCd()));
                    listDomain.setXtagOrCml(convert(listDomain.getXtagOrCml()));
                    listDomain.setInvoiceEtd(convert(listDomain.getInvoiceEtd()));
                    listDomain.setInvoiceCarrierCompCd(convert(listDomain.getInvoiceCarrierCompCd()));
                    listDomain.setPltzGrossWeight(convert(listDomain.getPltzGrossWeight()));
                    listDomain.setPltzVolume(convert(listDomain.getPltzVolume()));
                    listDomain.setNotLinkFlg(true);
                }
            }
        }
        
        // For all 2, the authority of the search results, and made available.
        // 検索結果の権限が、全て2の場合、利用可能とする。
        if (auth == Integer.parseInt(AUTH_REGISTER_NUMERIC) ) {
            return true;
        } else {
            return false;
        }
    }
    
    /**
     * And displays by masking the search results do not have permission.
     * <br />権限が無い検索結果をマスキングして表示させる。
     * 
     * <pre>
     * - Convert to asterisk
     * 
     * - 文字数に対して、アスタリスクに変換する。
     * </pre>
     *
     * @param item Display item
     * @return Characters you asterisk conversion
     */
    protected String convert(String item) {
        
        StringBuffer result = new StringBuffer();
        
        if (item != null) {
            for (int i = 0; i < item.length(); i++) {
                result.append("*");
            }
        }
        
        return result.toString();
    }

}
