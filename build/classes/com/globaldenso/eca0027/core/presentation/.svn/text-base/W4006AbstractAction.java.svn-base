/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_TRANS_CD;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_TRANS_TYP_CD;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CD_TYPE_TRANS_CD;
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
 * The base action class of Staging Actuality Header Screen
 * <br />山作り実績Header画面の基底アクションクラスです。
 *
 * @author $Author: masaki_awata@dnitsol.com $
 * @version $Revision: 4674 $
 */
public abstract class W4006AbstractAction extends AbstractAction {

    /** 
     * Common service.
     */
    protected CommonService commonService;

    /**
     * constructor.
     */
    public W4006AbstractAction() {
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
     *         - Trans. Type
     * - Set to request the pull-down list obtained
     *
     * - プルダウンリストを取得
     *     次の区分値を引数にCommonService.getPullDownListの呼び出し
     *         - 輸送手段
     *         - 輸送種別コード
     * - 取得したプルダウンリストをリクエストに設定
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#preInvokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    protected String preInvokeExecute(ActionMapping mapping, ActionForm actForm,
        HttpServletRequest request, HttpServletResponse response) throws ApplicationException {

        W4006ActionForm form = (W4006ActionForm)actForm;

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

        // Transportation type code list
        List<? extends SelectListItemDomain> trnsTypCdList
            = commonService.searchTransTypePullDownList(true);
        request.setAttribute(ATTR_TRANS_TYP_CD, trnsTypCdList);

        return super.preInvokeExecute(mapping, actForm, request, response);
    }
}
