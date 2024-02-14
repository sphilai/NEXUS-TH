/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0008;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0157;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W2014;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_ERROR;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W2017CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W2017ListDomain;
import com.globaldenso.eca0027.core.business.domain.W2017UpdateDomain;
import com.globaldenso.eca0027.core.business.facadeservice.presentation.W2017RegisterFacadeServiceImpl;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.TransactFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * The Register action class of X-tag Register
 * <br />X-tag Register画面のRegisterアクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":W2017.jsp
 *     - "error":W2017.jsp
 * </pre>
 *
 * @author $Author: 810833843 $
 * @version $Revision: 6768 $
 */
public class W2017RegisterAction extends W2017AbstractAction {

    /**
     * RegisterFacade service
     * <br />RegisterFacadeサービス
     */
    protected TransactFacadeService<W2017UpdateDomain, W2017UpdateDomain> w2017RegisterFacadeService;
    
    /**
     * constructor.
     */
    public W2017RegisterAction() {
        super();
    }

    /**
     * Setter method for w2017RegisterFacadeService.
     *
     * @param registerFacadeService Set for registerFacadeService
     */
    public void setW2017RegisterFacadeService(
        TransactFacadeService<W2017UpdateDomain, W2017UpdateDomain> registerFacadeService) {
        w2017RegisterFacadeService = registerFacadeService;
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * - Setting of an update domain
     *       The following informations are set as {@link W2017UpdateDomain}.
     *         - Screen common information
     *         - Search-condition domain ({@link W2017CriteriaDomain})  
     *         - List domain ({@link W2017ListDomain})
     *
     * - Execution of registration processing
     *       Created {@link W2017UpdateDomain} is made into an argument, and {@link W2017RegisterFacadeServiceImpl W2017RegisterFacadeServiceImpl#transact (W2017UpdateDomain)} is called.
     *
     * - Setting of a re retrieval result
     *       The re retrieval result after registration is set as action form.
     * 
     * 
     * - 更新ドメインの設定
     *     以下の情報を{@link W2017UpdateDomain}に設定する
     *       - 画面共通情報
     *       - 検索条件ドメイン ({@link W2017CriteriaDomain})
     *       - Listドメイン ({@link W2017ListDomain})
     *       
     * - 登録処理の実行
     *     作成した{@link W2017UpdateDomain}を引数にして、{@link W2017RegisterFacadeServiceImpl W2017RegisterFacadeServiceImpl#transact(W2017UpdateDomain)}を呼出す
     *     
     * - 再検索結果の設定
     *     登録後の再検索結果をアクションフォームに設定する
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws ApplicationException {
        
        W2017ActionForm w2017Form = (W2017ActionForm) form;
        
        // Setting of an update domain
        // 更新ドメインの設定
        W2017UpdateDomain updateDomain = prepareUpdateDomain(w2017Form);

        try {
            // Execution of registration processing
            // 登録処理の実行
            W2017UpdateDomain resultDomain = w2017RegisterFacadeService.transact(updateDomain);
            
            // Setting of a re retrieval result
            // 再検索結果の設定
            w2017Form.setW2017CriteriaDomain(resultDomain.getCriteriaDomain());
            w2017Form.setW2017ListDomainList(resultDomain.getListDomainList());
            
            // Set transition original screen id (in order to perform the same control as the time of the changes from a Main screen)  
            // 遷移元画面IDの設定 (Main画面からの遷移時と同じ制御を行うため)
            w2017Form.setFromScreenId(SCREEN_ID_W2014);
            
            // Registration of a message
            // メッセージの登録
            addGlobalMessage(request, GSCM_I0_0008, 1);
            
            return FORWARD_SUCCESS;
        } catch (ApplicationException e) {
            // Setting of a re retrieval result
            // 再検索結果の設定
            w2017Form.getW2017CriteriaDomain().setTotalShipper(updateDomain.getCriteriaDomain().getTotalShipper());
            w2017Form.getW2017CriteriaDomain().setCustomTimingTyp(updateDomain.getCriteriaDomain().getCustomTimingTyp());
            w2017Form.getW2017CriteriaDomain().setShipperCdList(updateDomain.getCriteriaDomain().getShipperCdList());
            w2017Form.getW2017CriteriaDomain().setXtagPackingIssuerNm(null);
            w2017Form.getW2017CriteriaDomain().setVolumeUnitDisplay(null);
            w2017Form.getW2017CriteriaDomain().setWeightUnitDisplay(null);
            w2017Form.setW2017ListDomainList(updateDomain.getListDomainList());
            
            if (e instanceof GscmApplicationException && NXS_E7_0157.equals(e.getCode())) {
                GscmApplicationException gae = (GscmApplicationException) e;
                ActionMessages errors = new ActionMessages();
                errors.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage(gae.getCode(), gae.getArgs()));
                saveErrors(request, errors);
                return FORWARD_ERROR;
            } else {
                throw e;
            }
        }
    }
    
    /**
     *    {@link W2017UpdateDomain} is created.
     * <br />{@link W2017UpdateDomain}を作成します。
     *
     * @param form Action form<br />アクションフォーム
     * @return {@link W2017UpdateDomain}
     */
    protected W2017UpdateDomain prepareUpdateDomain(W2017ActionForm form) {
        W2017UpdateDomain updateDomain = new W2017UpdateDomain();

        // Setting of a screen common information
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(updateDomain, form.getWindowId(), form.getScreenId());

        // setting of condition domain, and a List domain
        // 条件ドメイン、Listドメインの設定
        updateDomain.setCriteriaDomain(form.getW2017CriteriaDomain());
        updateDomain.setListDomainList(form.getW2017ListDomainList());
        
        return updateDomain;
    }
}
