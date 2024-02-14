/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_CONTAINER_LOOSE_TYP;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_CUSTOM_TIMING_TYP;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_DISABLE_ELEMENT_LIST;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_ISSUER;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_STG_INSTR_STATUS;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_TRANS_CD;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_WORKER;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CD_TYPE_CONTAINER_LOOSE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CD_TYPE_CUSTOM_TIMING_TYP;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CD_TYPE_ISSUER;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CD_TYPE_STG_INSTR_STATUS;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CD_TYPE_TRANS_CD;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CD_TYPE_WORKER;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W4001R;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PULLDOWN_DISP_TYPE_CODE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PULLDOWN_DISP_TYPE_CODE_VALUE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PULLDOWN_DISP_TYPE_VALUE;

import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.common.business.domain.SelectListItemDomain;
import com.globaldenso.eca0027.core.common.business.domain.UserAuthDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.eca0027.core.common.business.service.UserAuthService;
import com.globaldenso.gscm.framework.presentation.AbstractAction;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.CommonInfoDomain;

/**
 * The base action class of Staging Instruction Main Screen
 * <br />荷揃え指示Main画面の基底アクションクラスです。
 *
 * @author $Author: masaki_awata@dnitsol.com $
 * @version $Revision: 4674 $
 */
public abstract class W4001AbstractAction extends AbstractAction {

    /** 
     * Common service.
     */
    protected CommonService commonService;

    /**
     * Function authoriry service.
     */
    protected UserAuthService userAuthService;

    /**
     * Constructor.
     */
    public W4001AbstractAction() {
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
     * - Get the pull-down list, set to request
     *     Call the CommonService.getPullDownList argument to the cut-off value of the next
     *         - Trans.
     *         - C/L
     *         - CCType
     *         - Status(Staging Instruction)
     *         - Issuer
     *         - Worker
     * - Set to request the pull-down list obtained
     *
     * - プルダウンリストを取得
     *     次の区分値を引数にCommonService.getPullDownListの呼び出し
     *         - 輸送手段
     *         - コンテナルーズ区分
     *         - CCType
     *         - 荷揃え指示ステータス
     *         - 登録者
     *         - 作業者
     * - 取得したプルダウンリストをリクエストに設定
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#preInvokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    protected String preInvokeExecute(ActionMapping mapping, ActionForm actForm,
        HttpServletRequest request, HttpServletResponse response) throws ApplicationException {

        W4001ActionForm form = (W4001ActionForm)actForm;

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

        // Staging instruction status list
        List<? extends SelectListItemDomain> stgInstrStatusList
            = commonService.searchPullDownList(CD_TYPE_STG_INSTR_STATUS, langCd, PULLDOWN_DISP_TYPE_CODE_VALUE, true);
        request.setAttribute(ATTR_STG_INSTR_STATUS, stgInstrStatusList);

        // Issuer list
        List<? extends SelectListItemDomain> issuerList
            = commonService.searchPullDownList(CD_TYPE_ISSUER, langCd, PULLDOWN_DISP_TYPE_VALUE, true);
        request.setAttribute(ATTR_ISSUER, issuerList);

        // Worker list
        List<? extends SelectListItemDomain> workerList
            = commonService.searchPullDownList(CD_TYPE_WORKER, langCd, PULLDOWN_DISP_TYPE_VALUE, true);
        request.setAttribute(ATTR_WORKER, workerList);

        return super.preInvokeExecute(mapping, actForm, request, response);
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * - Button activity control
     *     The Create New button activity controls performed by use authority
     *
     * - ボタン活性制御
     *     機能利用権限によるCreate Newボタン活性制御
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#postInvokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.String)
     */
    @Override
    protected void postInvokeExecute(ActionMapping mapping, ActionForm actForm,
        HttpServletRequest request, HttpServletResponse response,
        String forwardName) {

        W4001ActionForm form = (W4001ActionForm)actForm;

        // Button control
        // ボタン制御

        // If it does not hold the privilege Register and deactivates the Create New button
        // Register権限を保持していない場合、Create Newボタンを非活性化
        if (!userAuthService.hasRegisterAll()) {
            List<? extends UserAuthDomain> userAuthList
                = userAuthService.getUserAuthList(new String[] { PERMIT_FUNC_ID_W4001R });
            if (userAuthList.size() == 0) {
                request.setAttribute(ATTR_DISABLE_ELEMENT_LIST, Arrays.asList("createNew"));
            }
        }

        super.postInvokeExecute(mapping, form, request, response, forwardName);
    }
}
