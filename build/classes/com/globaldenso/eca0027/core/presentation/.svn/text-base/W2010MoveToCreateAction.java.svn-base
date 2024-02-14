/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_PALLET_CARTON_TYP;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.AUTH_BROWSE_NUMERIC;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.AUTH_EMPTY_NUMERIC;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.AUTH_REGISTER_NUMERIC;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0009;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W2009R;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TYP_PLANT_AND_WH_CIGMA;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TYP_PLANT_AND_WH_NEXUS;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_ERROR;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W2010CriteriaDomain;
import com.globaldenso.eca0027.core.common.business.domain.SelectListItemDomain;
import com.globaldenso.eca0027.core.common.business.domain.UserAuthDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.TransactFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.util.ActionUtil;
import com.globaldenso.gscm.framework.util.CheckUtil;

/**
 *    This is a Move To Create action class of a CML Header screen.
 * <br />CML Header画面のMove To Createアクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":/W2011Init.do
 *     - "error":W2010.jsp
 * </pre>
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 12899 $
 */
public class W2010MoveToCreateAction extends W2010AbstractAction {

    /**
     * MoveToCreateFacade service
     * <br />MoveToCreateFacadeサービス
     */
    protected TransactFacadeService<Void, W2010CriteriaDomain> w2010MoveToCreateFacadeService;
    
    /**
     * constructor
     * <br />デフォルトコンストラクタ
     */
    public W2010MoveToCreateAction() {
        super();
    }
    
    /**
     * Setter method for w2010MoveToCreateFacadeService.
     * 
     * @param moveToCreateFacadeService Set for w2010MoveToCreateFacadeService
     */
    public void setW2010MoveToCreateFacadeService(
        TransactFacadeService<Void, W2010CriteriaDomain> moveToCreateFacadeService) {
        w2010MoveToCreateFacadeService = moveToCreateFacadeService;
    }
    
    /**
     * {@inheritDoc}.
     * <pre>
     * 
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws ApplicationException {
        
        // Acquisition of a condition domain
        // 条件ドメインの取得
        W2010ActionForm w2010Form = (W2010ActionForm) form;
        W2010CriteriaDomain criteriaDomain = w2010Form.getW2010CriteriaDomain();
        ActionUtil.prepareBusinessDomain(criteriaDomain, w2010Form.getWindowId(), w2010Form.getScreenId());
        
        // Setting of authority
        // 権限の設定
        String baseAuthFlg = AUTH_EMPTY_NUMERIC;
        if (userAuthService.hasBrowseAll()) {
            // Browse All
            baseAuthFlg = AUTH_BROWSE_NUMERIC;
        }
        if (userAuthService.hasRegisterAll()) {
            // In Register All, it overwrites.
            // Register All の場合、上書き。
            baseAuthFlg = AUTH_REGISTER_NUMERIC;
        }
        criteriaDomain.setBaseAuthFlg(baseAuthFlg);
        
        if (AUTH_REGISTER_NUMERIC.equals(baseAuthFlg)) {
            criteriaDomain.setUserAuthList(null);
        } else {
            String[] permitFuncIdList = { PERMIT_FUNC_ID_W2009R };
            List<? extends UserAuthDomain> userAuthList = userAuthService.getUserAuthList(permitFuncIdList);
            
            if (userAuthList.size() == 0) {
                throw new GscmApplicationException(GSCM_I0_0009);
            }
            
            criteriaDomain.setUserAuthList(userAuthList);
        }

        // UT420 ADD START
        // Completion Pallet/Carton Type
        // パレット・カートン区分名称補完
        @SuppressWarnings("unchecked")
        List<? extends SelectListItemDomain> palletCartonTypList =
            (List<? extends SelectListItemDomain>)request.getAttribute(ATTR_PALLET_CARTON_TYP);
        for (SelectListItemDomain selectListItemDomain : palletCartonTypList) {
            if (criteriaDomain.getPalletCartonTyp().equals(selectListItemDomain.getId())) {
                criteriaDomain.setPalletCartonTypName(selectListItemDomain.getName());
                break;
            }
        }
        // UT420 ADD END

        w2010MoveToCreateFacadeService.transact(criteriaDomain);
        
        
        W2010CriteriaDomain regDomain = w2010Form.getW2010CriteriaDomain();
        
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
            regDomain.setPackingWhCompCd(criteriaDomain.getWkPackingWhCompCd());
            regDomain.setPackingWhCd(criteriaDomain.getWkPackingWhCd());
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
                regDomain.setPackingWhCompCd(criteriaDomain.getWkPackingWhCompCd());
                regDomain.setPackingWhCd(criteriaDomain.getWkPackingWhCd());
            } else if (TYP_PLANT_AND_WH_NEXUS.equals(criteriaDomain.getPlntAndWhDeclaration())) {
                regDomain.setPltzInstrNo("");
                regDomain.setShipperCd(criteriaDomain.getShipperCd());
                regDomain.setCustomerCd(criteriaDomain.getCustomerCd());
                regDomain.setLgcyShipTo(criteriaDomain.getLgcyShipTo());
                regDomain.setTrnsCd(criteriaDomain.getTrnsCd());
                regDomain.setPlntCd("");
                regDomain.setLgcyWhCd(criteriaDomain.getWkLgcyWhCd());
                regDomain.setPackingWhCompCd(criteriaDomain.getPackingWhCompCd());
                regDomain.setPackingWhCd(criteriaDomain.getPackingWhCd());
            }
        }        

        return FORWARD_SUCCESS;
    }
    
    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - Set transition original screen id
     *       Transition-original-screen ID is set to action form.
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
            controlDisplay(request, (W2010ActionForm)form);
        }
        super.postInvokeExecute(mapping, form, request, response, forwardName);
    }


}