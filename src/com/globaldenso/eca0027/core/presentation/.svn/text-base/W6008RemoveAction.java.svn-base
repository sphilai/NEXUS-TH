/*
 * Project : NEXUS_EXPORT
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
import com.globaldenso.eca0027.core.business.domain.W6008CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W6008UpdateDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.TransactFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;
import com.globaldenso.gscm.framework.util.ResourcesFactory;

/**
 * The class of action for Remove Documentation Invoice Detail of (Full Returnable) screen.
 * <br />通関書類作成業務 Invoice Detail(Full Returnable)画面のRemoveアクションクラスです。
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 11856 $
 */
public class W6008RemoveAction extends W6008AbstractAction {
    /**
     * W6008RemoveFacadeService
     */
    protected TransactFacadeService<W6008UpdateDomain, W6008UpdateDomain> w6008RemoveFacadeService;

    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W6008RemoveAction() {
        super();
    }

    /**
     * Setter method for w6008RemoveFacadeService.
     * <br />w6008RemoveFacadeService のセッターメソッドです。
     *
     * @param removeFacadeService w6008RemoveFacadeService に設定する
     */
    public void setW6008RemoveFacadeService(TransactFacadeService<W6008UpdateDomain, W6008UpdateDomain> removeFacadeService) {
        w6008RemoveFacadeService = removeFacadeService;
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
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws ApplicationException {
        
        W6008ActionForm w6008Form = (W6008ActionForm)form;
        
        W6008CriteriaDomain criteriaDomain = w6008Form.getW6008CriteriaDomain();
        // Set the initial value to business domain from CommonInfoDomain.
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(criteriaDomain, w6008Form.getWindowId(), w6008Form.getScreenId());
        
        W6008UpdateDomain updateDomain = new W6008UpdateDomain();
        updateDomain.setCriteriaDomain(criteriaDomain);
        updateDomain.setListDomainList(w6008Form.getListDomainList());
        
        W6008UpdateDomain retUpdateDomain = w6008RemoveFacadeService.transact(updateDomain);
        
        retUpdateDomain.getCriteriaDomain().setShipperCd(criteriaDomain.getShipperCd());
        retUpdateDomain.getCriteriaDomain().setGrpNo1(criteriaDomain.getGrpNo1());
        retUpdateDomain.getCriteriaDomain().setGrpNo2(criteriaDomain.getGrpNo2());
        retUpdateDomain.getCriteriaDomain().setCmlTyp(criteriaDomain.getCmlTyp());
        
        w6008Form.setW6008CriteriaDomain(retUpdateDomain.getCriteriaDomain());
        w6008Form.setListDomainList(retUpdateDomain.getListDomainList());
        // Add as ActionMessages.
        // 更新完了メッセージ
        addGlobalMessage(request, GSCM_I0_0006, retUpdateDomain.getCriteriaDomain().getUpdateCount());
        
        // ST959 UNIT CONVERSION MOD START
        ActionMessages messages = new ActionMessages();
        if (FLAG_Y.equals(retUpdateDomain.getCriteriaDomain().getTotalNetWeightOverflowFlg())) {
            messages.add(ActionMessages.GLOBAL_MESSAGE,
                new ActionMessage(NXS_E7_0157,
                    ResourcesFactory.getResources().getMessage(criteriaDomain.getLocale(), "label.totalNetWeight"))
            );
        }
        if (0 < messages.size()) {
            saveErrors(request, messages);
        }
        // ST959 UNIT CONVERSION MOD START
        
        return FORWARD_SUCCESS;
    }
}
