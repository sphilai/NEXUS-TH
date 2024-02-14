/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TYP_PLANT_AND_WH_CIGMA;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TYP_PLANT_AND_WH_NEXUS;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_ERROR;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W2006CriteriaDomain;
import com.globaldenso.eca0027.core.business.facadeservice.presentation.W2006MoveToCreateFacadeServiceImpl;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.TransactFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;
import com.globaldenso.gscm.framework.util.CheckUtil;

/**
 * The MoveToCreate action class of Multiple Item No. in 1Box PKG Header Screen
 * <br />小箱内多品番Header画面のMoveToCreateアクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":/W2007Init.do
 *     - "error":W2006.jsp
 * </pre>
 *
 * @author $Author: 810833843 $
 * @version $Revision: 9459 $
 */
public class W2006MoveToCreateAction extends W2006AbstractAction {

    /**
     * MoveToCreateFacade service
     * <br />MoveToCreateFacadeサービス
     */
    protected TransactFacadeService<Void, W2006CriteriaDomain> w2006MoveToCreateFacadeService;
    
    /**
     * constructor.
     */
    public W2006MoveToCreateAction() {
        super();
    }

    /**
     * Setter method for w2006MoveToCreateFacadeService.
     *
     * @param moveToCreateFacadeService Set for w2006MoveToCreateFacadeService
     */
    public void setW2006MoveToCreateFacadeService(
        TransactFacadeService<Void, W2006CriteriaDomain> moveToCreateFacadeService) {
        w2006MoveToCreateFacadeService = moveToCreateFacadeService;
    }
    
    /**
     * {@inheritDoc}.
     * <pre>
     * - input check
     *       {@link W2006MoveToCreateFacadeServiceImpl W2006MoveToCreateFacadeServiceImpl#process (W2006CriteriaDomain)} is called,
     *       The VALUE inputted on the Multiple Item No. in 1Box PKG number Header screen is checked.
     *
     *
     * - Changes to a Multiple Item No. in 1Box PKG number Create screen
     *       It changes to a Multiple Item No. in 1Box PKG number Create screen.
     * 
     * 
     * - 入力チェック
     *     {@link W2006MoveToCreateFacadeServiceImpl W2006MoveToCreateFacadeServiceImpl#process(W2006CriteriaDomain)}を呼出し、
     *     小箱内多品番Header画面で入力された値をチェックする
     * 
     * 
     * - 小箱内多品番Create画面への遷移
     *     小箱内多品番Create画面へ遷移する
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws ApplicationException {
        
        W2006ActionForm w2006Form = (W2006ActionForm) form;
        
        // input check
        // 入力チェック
        validateHeader(w2006Form);
        
        // It changes to a Multiple Item No. in 1Box PKG number Create screen.
        // 小箱内多品番Create画面へ遷移
        return FORWARD_SUCCESS;
    }
    
    /**
     *    The VALUE inputted on the Multiple Item No. in 1Box PKG number Header screen is checked.
     * <br />小箱内多品番Header画面で入力された値をチェックします。
     *
     * @param form Action form of a Multiple Item No. in 1Box PKG number Header screen<br />小箱内多品番Header画面のアクション・フォーム
     * @throws ApplicationException When there is an input error<br />入力エラーがある場合
     */
    protected void validateHeader(W2006ActionForm form) throws ApplicationException {
        // Acquisition of a condition domain
        // 条件ドメインの取得
        W2006CriteriaDomain criteriaDomain = form.getW2006CriteriaDomain();
        // Setting of a condition domain
        // 条件ドメインの設定
        ActionUtil.prepareBusinessDomain(criteriaDomain, form.getWindowId(), form.getScreenId());
        
        // Execution of input check
        // 入力チェックの実行
        w2006MoveToCreateFacadeService.transact(criteriaDomain);
        
        W2006CriteriaDomain regDomain = form.getW2006CriteriaDomain();
        
        // It sets to information area in general.
        // 汎用情報エリアに設定                               
        if (!CheckUtil.isBlankOrNull(criteriaDomain.getPltzInstrNo())) {
            // In the case of a Packaging Instruction (=Pull)
            // 梱包指示の場合
            regDomain.setShipperCd(criteriaDomain.getWkShipperCd());
            regDomain.setCustomerCd(criteriaDomain.getWkCustomerCd());
            regDomain.setLgcyShipTo(criteriaDomain.getWkLgcyShipTo());
            regDomain.setTrnsCd(criteriaDomain.getWkTrnsCd());
            regDomain.setPlntCd(criteriaDomain.getWkPlntCd());
            regDomain.setLgcyWhCd(criteriaDomain.getWkLgcyWhCd());
            regDomain.setWhCompCd(criteriaDomain.getWkWhCompCd());
            regDomain.setWhCd(criteriaDomain.getWkWhCd());
        } else {
            // In the case of CIGMA
            // CIGMAの場合
            if (TYP_PLANT_AND_WH_CIGMA.equals(criteriaDomain.getPlntAndWhDeclaration())) {
                regDomain.setPltzInstrNo("");
                regDomain.setShipperCd(criteriaDomain.getShipperCd());
                regDomain.setCustomerCd(criteriaDomain.getCustomerCd());
                regDomain.setLgcyShipTo(criteriaDomain.getLgcyShipTo());
                regDomain.setTrnsCd(criteriaDomain.getTrnsCd());
                regDomain.setPlntCd(criteriaDomain.getPlntCd());
                regDomain.setLgcyWhCd(criteriaDomain.getLgcyWhCd());
                regDomain.setWhCompCd(criteriaDomain.getWkWhCompCd());
                regDomain.setWhCd(criteriaDomain.getWkWhCd());
            } else if (TYP_PLANT_AND_WH_NEXUS.equals(criteriaDomain.getPlntAndWhDeclaration())) {
                regDomain.setPltzInstrNo("");
                regDomain.setShipperCd(criteriaDomain.getShipperCd());
                regDomain.setCustomerCd(criteriaDomain.getCustomerCd());
                regDomain.setLgcyShipTo(criteriaDomain.getLgcyShipTo());
                regDomain.setTrnsCd(criteriaDomain.getTrnsCd());
                regDomain.setPlntCd("");
                regDomain.setLgcyWhCd(criteriaDomain.getWkLgcyWhCd());
                regDomain.setWhCompCd(criteriaDomain.getWhCompCd());
                regDomain.setWhCd(criteriaDomain.getWhCd());
            }
        }
    }
    
    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - Set transition original screen id
     *       Transition-original-screen ID is set to action form.
     * 
     * 
     * - 遷移元画面IDの設定
     *     アクション・フォームに遷移元画面IDを設定する
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#postInvokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.String)
     */
    protected void postInvokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response, String forwardName) {

        if (FORWARD_ERROR.equals(forwardName)) {
            controlDisplay(request, (W2006ActionForm)form);
        }
        super.postInvokeExecute(mapping, form, request, response, forwardName);
    }
}
