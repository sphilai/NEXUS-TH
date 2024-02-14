/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0157;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

import com.globaldenso.eca0027.core.business.domain.W2020CriteriaDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * The Search action class of Multi Label Register Screen
 * <br />Multi Label Register画面の検索アクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":W2020.jsp
 *     - "error":W2020.jsp
 * </pre>
 *
 * @author $Author: masaki_awata@dnitsol.com $
 * @version $Revision: 12890 $
 */
public class W2020SearchAction extends W2020AbstractAction {

    /**
     * Search facade service.
     */
    protected SearchFacadeService<W2020CriteriaDomain, W2020CriteriaDomain> w2020SearchFacadeService;

    /**
     * Constructor.
     */
    public W2020SearchAction() {
        super();
    }

    /**
     * Setter method for w2020SearchFacadeService.
     *
     * @param searchFacadeService Set for w2020SearchFacadeService
     */
    public void setW2020SearchFacadeService(
        SearchFacadeService<W2020CriteriaDomain, W2020CriteriaDomain> searchFacadeService) {
        w2020SearchFacadeService = searchFacadeService;
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * - Get PL domain
     * - To complement the common information
     * - Call of facade service
     * - PLドメイン取得
     * - 共通情報を補完
     * - facadeサービスの呼び出し
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm actForm,
        HttpServletRequest request, HttpServletResponse response) throws Exception {

        W2020ActionForm form = (W2020ActionForm)actForm;

        // Get PL domain
        // PLドメイン取得
        W2020CriteriaDomain w2020CriteriaDomain = form.getW2020CriteriaDomain();
        if (!FLAG_Y.equals(w2020CriteriaDomain.getManualRegFlg())) {
            w2020CriteriaDomain.setShippingLot(null);
            w2020CriteriaDomain.setLength(null);
            w2020CriteriaDomain.setWidth(null);
            w2020CriteriaDomain.setHeight(null);
            w2020CriteriaDomain.setGrossWeight(null);
        }
        // To complement the common information
        // 共通情報を補完
        ActionUtil.prepareBusinessDomain(w2020CriteriaDomain, form.getWindowId(), form.getScreenId());

        // Call of facade service
        // facadeサービスの呼び出し
        w2020CriteriaDomain.setOverflowFieldList(null);
        w2020SearchFacadeService.search(w2020CriteriaDomain);
        if (w2020CriteriaDomain.getOverflowFieldList() != null) {
            if (0 < w2020CriteriaDomain.getOverflowFieldList().size()) {
                ActionMessages errors = new ActionMessages();
                for (String overflowField : w2020CriteriaDomain.getOverflowFieldList()) {
                    errors.add(ActionMessages.GLOBAL_MESSAGE,
                        new ActionMessage(NXS_E7_0157, Arrays.asList(new String[]{ overflowField }))
                    );
                }
                if (0 < errors.size()) {
                    saveErrors(request, errors);
                }
            }
        }

        w2020CriteriaDomain.setDisplayControlStatus("2"); // search done

        return FORWARD_SUCCESS;
    }
}
