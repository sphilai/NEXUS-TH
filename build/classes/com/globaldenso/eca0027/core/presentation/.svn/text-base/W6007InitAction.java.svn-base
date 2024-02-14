/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_N;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0157;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W6006;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W6009;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W6007CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W6007UpdateDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.presentation.ScreenInfoDomain;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.ResourcesFactory;

/**
 * Documentation Shipping Information Input画面のInitアクションクラスです。
 * <br />通関書類作成業務 Shipping Information Input画面のInitアクションクラスです。
 * 
 * @author $Author: 10088DS50908 $
 * @version $Revision: 13589 $
 */
public class W6007InitAction extends W6007AbstractAction {
    /**
     * W6007InitFacadeService
     */
    protected SearchFacadeService<W6007UpdateDomain, W6007CriteriaDomain> w6007InitFacadeService;

    /**
     * デフォルトコンストラクタです。
     * <br />デフォルトコンストラクタです。
     */
    public W6007InitAction() {
        super();
    }

    /**
     * Setter method for w6007InitFacadeService.
     *
     * @param initFacadeService Set for w6007InitFacadeService
     */
    public void setW6007InitFacadeService(
        SearchFacadeService<W6007UpdateDomain, W6007CriteriaDomain> initFacadeService) {
        w6007InitFacadeService = initFacadeService;
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
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping,
     *      org.apache.struts.action.ActionForm,
     *      javax.servlet.http.HttpServletRequest,
     *      javax.servlet.http.HttpServletResponse)
     */
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws ApplicationException {

        W6007ActionForm w6007Form = (W6007ActionForm)form;

        W6007CriteriaDomain criteriaDomain = w6007Form.getW6007CriteriaDomain();
        // Set the initial value to business domain from CommonInfoDomain.
        // 画面共通情報の設定
        prepareBusinessDomain(criteriaDomain, w6007Form.getWindowId(), w6007Form.getScreenId());
        // Get form data from W6006.
        // 親画面からの引継値の設定
        WindowInfoDomain windowInfo = (WindowInfoDomain) DensoContext.get().getGeneralArea(w6007Form.getWindowId());
        ScreenInfoDomain screenInfo = (ScreenInfoDomain) windowInfo.getScreenInfo().get(SCREEN_ID_W6006);
        W6006ActionForm w6006Form = (W6006ActionForm) screenInfo.getActionForm();
        
        CommonUtil.copyPropertiesActionFormToDomain(criteriaDomain, w6006Form);
        
        criteriaDomain.setUnitPriceError(FLAG_N);
        criteriaDomain.setHsCodeWarning(FLAG_N);
        criteriaDomain.setIgnoreWarnings(null);
        
        W6007UpdateDomain updateDomain = w6007InitFacadeService.search(criteriaDomain);

        updateDomain.getCriteriaDomain().setShipperCd(w6006Form.getShipperCd());
        updateDomain.getCriteriaDomain().setDateShipped(w6006Form.getDateShipped());
        updateDomain.getCriteriaDomain().setGrpNo1(w6006Form.getGrpNo1());
        updateDomain.getCriteriaDomain().setGrpNo2(w6006Form.getGrpNo2());
        updateDomain.getCriteriaDomain().setCustomerCd(w6006Form.getCustomerCd());
        updateDomain.getCriteriaDomain().setHiddenDateShipped(w6006Form.getDateShipped());
        
        w6007Form.setW6007CriteriaDomain(updateDomain.getCriteriaDomain());
        w6007Form.setListDomainList(updateDomain.getListDomainList());
        
        // ST959 UNIT CONVERSION ADD START
        ActionMessages messages = new ActionMessages();
        if (FLAG_Y.equals(updateDomain.getCriteriaDomain().getTotalGrossWeightOverflowFlg())) {
            messages.add(ActionMessages.GLOBAL_MESSAGE,
                new ActionMessage(NXS_E7_0157,
                    ResourcesFactory.getResources().getMessage(criteriaDomain.getLocale(), "label.grossWeight"))
            );
        }
        if (FLAG_Y.equals(updateDomain.getCriteriaDomain().getTotalVolumeOverflowFlg())) {
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
