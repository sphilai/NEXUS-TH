/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_CONTAINER_LOOSE_TYP;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_CUSTOM_TIMING_TYP;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_TRANS_CD;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CD_TYPE_CONTAINER_LOOSE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CD_TYPE_CUSTOM_TIMING_TYP;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CD_TYPE_TRANS_CD;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PULLDOWN_DISP_TYPE_CODE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PULLDOWN_DISP_TYPE_CODE_VALUE;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.common.business.domain.SelectListItemDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.presentation.AbstractAction;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.CommonInfoDomain;

/**
 * The base action class of Staging Instruction Header Screen
 * <br />荷揃え指示Header画面の基底アクションクラスです。
 *
 * @author $Author: masaki_awata@dnitsol.com $
 * @version $Revision: 4674 $
 */
public abstract class W4002AbstractAction extends AbstractAction {

    /** 
     * Common service.
     */
    protected CommonService commonService;

    /**
     * constructor.
     */
    public W4002AbstractAction() {
        super();
    }

    /**
     * Setter method for commonService.
     *
     * @param commonService Set for commonService
     */
    public void setCommonService(CommonService commonService) {
        this.commonService = commonService;
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * - Get the pull-down list, set to request
     *     Call the CommonService.getPullDownList argument to the cut-off value of the next
     *         - Trans.
     *         - C/L
     *         - CCType
     * - Set to request the pull-down list obtained
     *
     * - プルダウンリストを取得
     *     次の区分値を引数にCommonService.getPullDownListの呼び出し
     *         - 輸送手段
     *         - コンテナルーズ区分
     *         - CCType
     * - 取得したプルダウンリストをリクエストに設定
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#preInvokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    protected String preInvokeExecute(ActionMapping mapping, ActionForm actForm,
        HttpServletRequest request, HttpServletResponse response) throws ApplicationException {

        W4002ActionForm form = (W4002ActionForm)actForm;

        // Initialization pulldown list
        // プルダウンリスト初期化処理

        // Get language code
        // 言語コードを取得
        WindowInfoDomain windowInfoDomain
            = (WindowInfoDomain)DensoContext.get().getGeneralArea(form.getWindowId());
        CommonInfoDomain commonInfoDomain = windowInfoDomain.getCommonInfo();
        String langCd = commonInfoDomain.getLanguageCd();

        // Transportation code list
        List<? extends SelectListItemDomain> transCdList
            = commonService.searchPullDownList(CD_TYPE_TRANS_CD, langCd, PULLDOWN_DISP_TYPE_CODE_VALUE, true);
        request.setAttribute(ATTR_TRANS_CD, transCdList);

        // Container loose type list
        List<? extends SelectListItemDomain> containerLooseTypList
            = commonService.searchPullDownList(CD_TYPE_CONTAINER_LOOSE, langCd, PULLDOWN_DISP_TYPE_CODE, true);
        request.setAttribute(ATTR_CONTAINER_LOOSE_TYP, containerLooseTypList);

        // Custom timing type list
        List<? extends SelectListItemDomain> customTimingTypList
            = commonService.searchPullDownList(CD_TYPE_CUSTOM_TIMING_TYP, langCd, PULLDOWN_DISP_TYPE_CODE, true);
        request.setAttribute(ATTR_CUSTOM_TIMING_TYP, customTimingTypList);

        return super.preInvokeExecute(mapping, actForm, request, response);
    }
}
