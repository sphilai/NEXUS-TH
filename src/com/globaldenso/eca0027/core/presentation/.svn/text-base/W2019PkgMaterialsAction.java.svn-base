/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W2019;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.W2009_CML_MODE_EDIT;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.sql.Timestamp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W2019CriteriaDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.TransactFacadeService;
import com.globaldenso.gscm.framework.presentation.ScreenInfoDomain;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 *    This is a PkgMaterials action class of a CML Trans Revise screen.
 * <br />CML Trans Revise画面のPkgMaterialsアクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":/2013Init.do
 *     - "error":W2019.jsp
 * </pre>
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 11271 $
 */
public class W2019PkgMaterialsAction extends W2019AbstractAction {
    
    /**
     * PkgMaterial Facade service
     * <br />PkgMaterial Facade サービス
     */
    protected TransactFacadeService<Void, W2019CriteriaDomain> w2019PkgMaterialsFacadeService;
    
    /**
     * constructor.
     */
    public W2019PkgMaterialsAction() {
        super();
    }
    
    /**
     * Setter method for w2019PkgMaterialsFacadeService.
     *
     * @param pkgMaterialsFacadeService Set for w2019PkgMaterialsFacadeService
     */
    public void setW2019PkgMaterialsFacadeService(
        TransactFacadeService<Void, W2019CriteriaDomain> pkgMaterialsFacadeService) {
        w2019PkgMaterialsFacadeService = pkgMaterialsFacadeService;
    }
    
    /**
     * {@inheritDoc}.
     * <pre>
     * - Taking over VALUE to a transition destination screen
     *     - processing mode (1: registration)  
     *   - CML No.
     *
     * A delete of - Palletize Item Package Work
     *     In the case of - Packaging Confirmation Flg ="N"
     *
     * Registration of - Palletize Item Package Work
     *     In the case of - Packaging Confirmation Flg ="N"
     *
     * A setting of - session information
     *   - Change Trans. To Air
     *   - Change Outer CD
     *
     * - 遷移先画面への引継値
     *   - 処理モード(1:登録)
     *   - CML No.
     *   
     * - パレタイズ対象品PKGワークの削除
     *   - Packaging Confirmation Flg = "N" の場合のみ
     *   
     * - パレタイズ対象品PKGワークの登録
     *   - Packaging Confirmation Flg = "N" の場合のみ
     *   
     * - セッション情報の設定
     *   - Change Trans. To Air
     *   - Change Outer CD
     *   
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws ApplicationException {
        
        // A setting of mass update domain
        // 一括更新ドメインの設定
        W2019ActionForm w2019Form = (W2019ActionForm) form;
        W2019CriteriaDomain criteriaDomain = prepareCriteriaDomain(w2019Form);
        
        // Execution of processing
        // 処理の実行
        w2019PkgMaterialsFacadeService.transact(criteriaDomain);
        
        // Taking over VALUE setting on a transition destination screen
        // 遷移先画面への引継値設定
        request.setAttribute("functionMode", W2009_CML_MODE_EDIT);
        request.setAttribute("mainMark", criteriaDomain.getMainMark());
        
        setSessionInfo((W2019ActionForm)form);
        
        return FORWARD_SUCCESS;
        
    }

    /**
     *    {@link W2019CriteriaDomain} is created.
     * <br />{@link W2019CriteriaDomain}を作成します。
     *
     * @param form Action form<br />アクションフォーム
     * @return {@link W2019CriteriaDomain}
     */
    protected W2019CriteriaDomain prepareCriteriaDomain(W2019ActionForm form) {

        W2019CriteriaDomain criteria = (W2019CriteriaDomain) form.getW2019CriteriaDomain();
        
        // Backup of the last modification time
        // 最終更新時刻の退避
        Timestamp comUpdateTimestamp = criteria.getComUpdateTimestamp();
        
        String volumeUnit = criteria.getVolumeUnit();
        String weightUnit = criteria.getWeightUnit();
        String lengthUnit = criteria.getLengthUnit(); // UT110 TRIAL SHIPMENT/号試品対応 ADD

        // Setting of a screen common information
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(criteria, form.getWindowId(), form.getScreenId());
        
        // Resetting of the last modification time
        // 最終更新時刻の再設定
        criteria.setComUpdateTimestamp(comUpdateTimestamp);
        
        criteria.setVolumeUnit(volumeUnit);
        criteria.setWeightUnit(weightUnit);
        criteria.setLengthUnit(lengthUnit); // UT110 TRIAL SHIPMENT/号試品対応 ADD

        return criteria;
    }
    

    /**
     *    Setting of session information
     * <br />セッション情報の設定
     *   - Change Trans. To Air
     *   - Change Outer CD
     *
     * @param form Action form<br />アクションフォーム
     */
    protected void setSessionInfo(W2019ActionForm form) {

        // A setting of Session
        // Sessionの設定
        WindowInfoDomain windowInfo = (WindowInfoDomain) DensoContext.get().getGeneralArea(form.getWindowId());
        ScreenInfoDomain screenInfo = windowInfo.getScreenInfo().get(SCREEN_ID_W2019);
        W2019CriteriaDomain w2019Criteria = ((W2019ActionForm) screenInfo.getActionForm()).getW2019CriteriaDomain();
        w2019Criteria.setReviseFlg(form.getW2019CriteriaDomain().getReviseFlg());
        w2019Criteria.setOuterPkgCd(form.getW2019CriteriaDomain().getOuterPkgCd());

    }
}
