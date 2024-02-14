/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GRP_NO2_MAIN;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.INVOICE_CTGRY_N;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0157;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.REM_LC_TYP_REM;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W6001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W6007;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W6008;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0078;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.VtCompMeasureUnitDomain;
import com.globaldenso.eca0027.core.business.domain.W6007CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W6008CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W6009CriteriaDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.presentation.NullSkipActionMessages;
import com.globaldenso.gscm.framework.presentation.ScreenInfoDomain;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.ResourcesFactory;

/**
 * The class of action Init for Documentation Invoice Register screen.
 * <br />通関書類作成業務 Invoice Register画面のInitアクションクラスです。
 * <pre>
 * forward name-path mapping:
 *     ‐ "success":W6009
 * </pre>
 * 
 * @author $Author: 10088DS50908 $
 * @version $Revision: 13589 $
 */
public class W6009InitAction extends W6009AbstractAction {
    
    /**
     * W6009InitFacadeService
     */
    protected SearchFacadeService<W6009CriteriaDomain, W6009CriteriaDomain> w6009InitFacadeService;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W6009InitAction() {
        super();
    }

    /**
     * Setter method for w6009InitFacadeService.
     *
     * @param initFacadeService Set for w6009InitFacadeService
     */
    public void setW6009InitFacadeService(SearchFacadeService<W6009CriteriaDomain, W6009CriteriaDomain> initFacadeService) {
        w6009InitFacadeService = initFacadeService;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    protected String invokeExecute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
        throws ApplicationException {

        W6009ActionForm w6009Form = prepareActionForm(form, request);

        W6009CriteriaDomain criteriaDomain = prepareCriteriaDomain(request, mapping, w6009Form);
        try {
            W6009CriteriaDomain resultDomain = w6009InitFacadeService.search(criteriaDomain);

            w6009Form.setW6009CriteriaDomain(convertCriteriaDomain(w6009Form.getCallScreenId(), resultDomain));

            // ST959 UNIT CONVERSION ADD START
            ActionMessages messages = new ActionMessages();
            if (!SCREEN_ID_W6001.equals(w6009Form.getCallScreenId())) {
                if (FLAG_Y.equals(resultDomain.getTotalVolumeOverflowFlg())) {
                    messages.add(ActionMessages.GLOBAL_MESSAGE,
                        new ActionMessage(NXS_E7_0157,
                            ResourcesFactory.getResources().getMessage(criteriaDomain.getLocale(), "label.totalVolume"))
                    );
                }
                if (FLAG_Y.equals(resultDomain.getTotalNetWeightOverflowFlg())) {
                    messages.add(ActionMessages.GLOBAL_MESSAGE,
                        new ActionMessage(NXS_E7_0157,
                            ResourcesFactory.getResources().getMessage(criteriaDomain.getLocale(), "label.totalNetWeight"))
                    );
                }
                if (FLAG_Y.equals(resultDomain.getTotalGrossWeightOverflowFlg())) {
                    messages.add(ActionMessages.GLOBAL_MESSAGE,
                        new ActionMessage(NXS_E7_0157,
                            ResourcesFactory.getResources().getMessage(criteriaDomain.getLocale(), "label.totalGrossWeight"))
                    );
                }
            }
            if (0 < messages.size()) {
                saveErrors(request, messages);
            }
            // ST959 UNIT CONVERSION ADD END

            // 2015/1/19 DNJP.Kawamura UT038対応 START >>>>>
//            return FORWARD_SUCCESS;
            // Mainの場合
            if ("0".equals(resultDomain.getGrpNo2()) || resultDomain.getGrpNo2() == null) {
                return FORWARD_SUCCESS;
            // Frtの場合
            } else {
                return FORWARD_SUCCESS + "Frt";
            }
            // 2015/1/19 DNJP.Kawamura UT038対応 END <<<<<
            
        }  catch (GscmApplicationException e){
            if (NXS_E7_0157.equals(e.getCode())) {
                ActionMessages errors = new NullSkipActionMessages();
                errors.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage(e.getCode(), e.getArgs()));
                saveErrors(request, errors);
            } else if(NXS_E7_0078.equals(e.getCode())) {
                ActionMessages errors = new NullSkipActionMessages();
                errors.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage(e.getCode(), e.getArgs()));
                saveErrors(request, errors);
            } else {
                throw e;
            }
            return w6009Form.getCallScreenId();
        } catch (ApplicationException e){
            throw e;
        }
    }
    
    /**
     * Set the VALUE takeover of transition from the original screen.
     * <br />遷移元画面からの引継値を設定します。
     * 
     * @param form Action Form<br />
     * アクションフォーム
     * @param request HTTP request
     * @return Action Form of Invoice detail screen<br />
     * @throws ApplicationException error
     * インボイス詳細画面のアクションフォーム
     */
    protected W6009ActionForm prepareActionForm(ActionForm form, HttpServletRequest request) throws ApplicationException {
        W6009ActionForm w6009Form = (W6009ActionForm) form;
        W6009CriteriaDomain criteriaDomain = w6009Form.getW6009CriteriaDomain();
        
        if(SCREEN_ID_W6007.equals(w6009Form.getCallScreenId())) {
            WindowInfoDomain windowInfo = (WindowInfoDomain) DensoContext.get().getGeneralArea(w6009Form.getWindowId());
            ScreenInfoDomain screenInfo = (ScreenInfoDomain) windowInfo.getScreenInfo().get(SCREEN_ID_W6007);
            W6007ActionForm w6007Form = (W6007ActionForm) screenInfo.getActionForm();
            W6007CriteriaDomain w6007Criteria = w6007Form.getW6007CriteriaDomain();

            CommonUtil.copyPropertiesDomainToDomain(criteriaDomain, w6007Criteria);
            criteriaDomain.setOriginalScreenId(SCREEN_ID_W6007);
            VtCompMeasureUnitDomain vtCompMeasureUnitDomain = commonService.searchMeasureUnit(criteriaDomain.getShipperCd());
            criteriaDomain.setVolumeUnit(vtCompMeasureUnitDomain.getVolumeUnit());
            criteriaDomain.setWeightUnit(vtCompMeasureUnitDomain.getWeightUnit());
        } 
        else if (SCREEN_ID_W6008.equals(w6009Form.getCallScreenId())) {
            WindowInfoDomain windowInfo = (WindowInfoDomain) DensoContext.get().getGeneralArea(w6009Form.getWindowId());
            ScreenInfoDomain screenInfo = (ScreenInfoDomain) windowInfo.getScreenInfo().get(SCREEN_ID_W6008);
            W6008ActionForm w6008Form = (W6008ActionForm) screenInfo.getActionForm();
            W6008CriteriaDomain w6008Criteria = w6008Form.getW6008CriteriaDomain();

            CommonUtil.copyPropertiesDomainToDomain(criteriaDomain, w6008Criteria);
            criteriaDomain.setOriginalScreenId(SCREEN_ID_W6008);
        }
        else if (SCREEN_ID_W6001.equals(w6009Form.getCallScreenId())) {
            criteriaDomain.setShipperCd((String) request.getAttribute("shipperCd"));
            criteriaDomain.setInvoiceNo((String) request.getAttribute("invoiceNo"));
            // ST184 INVOICE ISSUE DATE/インボイス発行日 MOD START
            //criteriaDomain.setInvoiceIssueDt((String) request.getAttribute("invoiceIssueDt"));
            criteriaDomain.setInvoiceIssueDt((Date) request.getAttribute("invoiceIssueDt"));
            // ST184 INVOICE ISSUE DATE/インボイス発行日 MOD END
            criteriaDomain.setCancelTyp((String) request.getAttribute("invoiceType"));

            criteriaDomain.setOriginalScreenId(SCREEN_ID_W6001);
        }
        return w6009Form;
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
    
    /**
     * Generate the search criteria domain for screen display from the search results.
     * <br />検索結果から画面表示用の検索条件ドメインを生成します。
     * 
     * @param callScreenId Calling SCREEN ID<br />
     * 呼び出し元画面ID
     * @param criteriaDomain Search conditions domain<br />
     * 検索条件ドメイン
     * @return Surface display search criteria domain<br />
     * 画面表示用検索条件ドメイン
     */
    protected W6009CriteriaDomain convertCriteriaDomain(String callScreenId, W6009CriteriaDomain criteriaDomain) {
        // 'Remittance' is the initial checked data.
        // 初期表示時、Remittance or L/Cラジオボタンは「Remittance」にチェック
        if (SCREEN_ID_W6007.equals(callScreenId) || SCREEN_ID_W6008.equals(callScreenId)) {
            // 2015/3/11 DNJP.Kawamura インタンジブル品対応 START >>>>>
//            if (GRP_NO2_MAIN.equals(criteriaDomain.getGrpNo2()) && INVOICE_CTGRY_C.equals(criteriaDomain.getInvoiceCtgry())) {
            if (GRP_NO2_MAIN.equals(criteriaDomain.getGrpNo2())
                && !INVOICE_CTGRY_N.equals(criteriaDomain.getInvoiceCtgry())) {
            // 2015/3/11 DNJP.Kawamura インタンジブル品対応 END <<<<<
                criteriaDomain.setRemLcTyp(REM_LC_TYP_REM);
            }
        }
        return criteriaDomain;
    }
}
