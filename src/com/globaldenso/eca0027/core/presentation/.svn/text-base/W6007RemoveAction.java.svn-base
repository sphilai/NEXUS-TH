/* Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0006;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0157;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W6007CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W6007UpdateDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.util.ResourcesFactory;

/**
 * Remove action class of Documentation Invoice Detail screen.
 * <br />通関書類作成業務 Invoice Detail画面のRemoveアクションクラスです。
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 11859 $
 */
public class W6007RemoveAction extends W6007AbstractAction {
    /**
     * W6007RemoveFacadeService
     */
    protected SearchFacadeService<W6007UpdateDomain, W6007UpdateDomain> w6007RemoveFacadeService;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W6007RemoveAction() {
        super();
    }
    
    /**
     * Setter method for w6007RemoveFacadeService.
     *
     * @param removeFacadeService Set for w6007RemoveFacadeService
     */
    public void setW6007RemoveFacadeService(SearchFacadeService<W6007UpdateDomain, W6007UpdateDomain> removeFacadeService) {
        w6007RemoveFacadeService = removeFacadeService;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * ‐See the data that matches the criteria specified in the search condition area
     *   To display the search results area when search results of 1 or more
     * </pre>
     * <pre>
     * ‐検索条件エリアで指定した条件に一致するデータを表示する
     *   検索結果が1件以上の場合に検索結果エリアを表示する
     * </pre>
     * 
     * 
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping,
     *      org.apache.struts.action.ActionForm,
     *      javax.servlet.http.HttpServletRequest,
     *      javax.servlet.http.HttpServletResponse)
     */
    protected String invokeExecute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
        throws ApplicationException {
        
        W6007ActionForm w6007Form = (W6007ActionForm)form;
        
        W6007CriteriaDomain criteriaDomain = w6007Form.getW6007CriteriaDomain();
        // Set the initial value to business domain from CommonInfoDomain.
        // 画面共通情報の設定
        prepareBusinessDomain(criteriaDomain, w6007Form.getWindowId(), w6007Form.getScreenId());
        
        W6007UpdateDomain updateDomain = new W6007UpdateDomain();
        updateDomain.setCriteriaDomain(criteriaDomain);
        updateDomain.setListDomainList(w6007Form.getListDomainList());
        W6007UpdateDomain retUpdateDomain = w6007RemoveFacadeService.search(updateDomain);
        
        retUpdateDomain.getCriteriaDomain().setShipperCd(criteriaDomain.getShipperCd());
        retUpdateDomain.getCriteriaDomain().setDateShipped(criteriaDomain.getDateShipped());
        retUpdateDomain.getCriteriaDomain().setGrpNo1(criteriaDomain.getGrpNo1());
        retUpdateDomain.getCriteriaDomain().setGrpNo2(criteriaDomain.getGrpNo2());
        retUpdateDomain.getCriteriaDomain().setCustomerCd(criteriaDomain.getCustomerCd());
        retUpdateDomain.getCriteriaDomain().setHiddenDateShipped(criteriaDomain.getDateShipped());
        
        w6007Form.setW6007CriteriaDomain(retUpdateDomain.getCriteriaDomain());
        w6007Form.setListDomainList(retUpdateDomain.getListDomainList());
        // Add as ActionMessages.
        // 更新完了メッセージ
        addGlobalMessage(request, GSCM_I0_0006, retUpdateDomain.getCriteriaDomain().getUpdateCount());

        // ST959 UNIT CONVERSION ADD START
        ActionMessages messages = new ActionMessages();
        if (FLAG_Y.equals(retUpdateDomain.getCriteriaDomain().getTotalGrossWeightOverflowFlg())) {
            messages.add(ActionMessages.GLOBAL_MESSAGE,
                new ActionMessage(NXS_E7_0157,
                    ResourcesFactory.getResources().getMessage(criteriaDomain.getLocale(), "label.grossWeight"))
            );
        }
        if (FLAG_Y.equals(retUpdateDomain.getCriteriaDomain().getTotalVolumeOverflowFlg())) {
            messages.add(ActionMessages.GLOBAL_MESSAGE,
                new ActionMessage(NXS_E7_0157,
                    ResourcesFactory.getResources().getMessage(criteriaDomain.getLocale(), "label.volume"))
            );
        }
        if (0 < messages.size()) {
            saveErrors(request, messages);
        }
        // ST959 UNIT CONVERSION ADD END
        
        return FORWARD_SUCCESS;
    }
}
