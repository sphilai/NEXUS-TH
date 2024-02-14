/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0157;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W6009CriteriaDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.util.ResourcesFactory;

/**
 * The class of behavior action for FRT Shipper when changing Documentation Invoice Register screen.
 * <br />通関書類作成業務 Invoice Register画面のFRT Shipper変更時の動作アクションクラスです。
 * <pre>
 * forward name-path mapping:
 *     ‐ "succes":W6009
 * </pre>
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 11854 $
 */
public class W6009ChangeFrtShipperAction extends W6009AbstractAction {
    
    /**
     * FRT Shipper change FacadeService
     * <br />FRT Shipper変更 FacadeService
     */
    protected SearchFacadeService<W6009CriteriaDomain, W6009CriteriaDomain> w6009ChangeFrtShipperFacadeService;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W6009ChangeFrtShipperAction(){
        super();
    }
    
    /**
     * Setter method for w6009ChangeFrtShipperFacadeService.
     *
     * @param changeFrtShipperFacadeService Set for w6009ChangeFrtShipperFacadeService
     */
    public void setW6009ChangeFrtShipperFacadeService(SearchFacadeService<W6009CriteriaDomain, W6009CriteriaDomain> changeFrtShipperFacadeService) {
        w6009ChangeFrtShipperFacadeService = changeFrtShipperFacadeService;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * ‐And unit conversion, re-calculation WEIGHT, the VOLUME
     * </pre>
     * <pre>
     * ‐単位変換と、重量、容積の再計算
     * </pre>
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws Exception {

        W6009ActionForm w6009Form = (W6009ActionForm) form;
        
        W6009CriteriaDomain criteriaDomain = prepareCriteriaDomain(request, mapping, w6009Form);
        //  Re-calculate WEIGHT,  VOLUME and unit conversion,
        // 単位変換と、重量、容積の再計算
        W6009CriteriaDomain resultDomain = w6009ChangeFrtShipperFacadeService.search(criteriaDomain);
        
        w6009Form.setW6009CriteriaDomain(resultDomain);
        
        // ST959 UNIT CONVERSION ADD START
        ActionMessages messages = new ActionMessages();
        if (FLAG_Y.equals(resultDomain.getTotalNetWeightOverflowFlg())) {
            messages.add(ActionMessages.GLOBAL_MESSAGE,
                new ActionMessage(NXS_E7_0157,
                    ResourcesFactory.getResources().getMessage(criteriaDomain.getLocale(), "label.totalNetWeight"))
            );
        }
        if (0 < messages.size()) {
            saveErrors(request, messages);
        }
        // ST959 UNIT CONVERSION ADD END
        
        return FORWARD_SUCCESS;
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
     * @throws ApplicationException If it fails to set the search criteria domain<br />
     * 検索条件ドメインの設定に失敗した場合
     */
    protected W6009CriteriaDomain prepareCriteriaDomain(HttpServletRequest request, ActionMapping mapping, W6009ActionForm form) 
        throws ApplicationException {
        W6009CriteriaDomain criteriaDomain = form.getW6009CriteriaDomain();
        //  Setting of a screen common information.
        // 画面共通情報の設定
        prepareBusinessDomain(criteriaDomain, form.getWindowId(), form.getScreenId());
        
        return criteriaDomain;
    }
}
