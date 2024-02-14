/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0006;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0008;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_COPY_NEW;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_EDIT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_NEW;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

import com.globaldenso.eca0027.core.business.domain.W9017CriteriaDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.CreateFacadeService;

/**
 * The class action Register of Export Shipping Item Special Information MA Edit screen.
 * <br />Export Shipping Item Special Information MA Edit画面のRegisterアクションクラスです。
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W9017RegisterAction extends W9017AbstractAction {

    /**
     * Register Facade Service
     * <br />Register Facadeサービス
     */
    protected CreateFacadeService<Integer, W9017CriteriaDomain> w9017RegisterFacadeService;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W9017RegisterAction() {
        super();
    }
    
    /**
     * Setter method for w9017RegisterFacadeService.
     *
     * @param registerFacadeService Set for w9017RegisterFacadeService
     */
    public void setW9017RegisterFacadeService(CreateFacadeService<Integer, W9017CriteriaDomain> registerFacadeService) {
        w9017RegisterFacadeService = registerFacadeService;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
        throws Exception {
        
        W9017ActionForm w9017Form = (W9017ActionForm) form;
        
        W9017CriteriaDomain criteriaDomain = prepareCriteriaDomain(w9017Form);
        
        int updateCount = w9017RegisterFacadeService.create(criteriaDomain);
        
        String procMode = criteriaDomain.getProcMode();
        if (MODE_NEW.equals(procMode) || MODE_COPY_NEW.equals(procMode)) {
            addGlobalMessage(request, GSCM_I0_0008, updateCount);
        } else if (MODE_EDIT.equals(procMode)) {
            addGlobalMessage(request, GSCM_I0_0006, updateCount);
        }
        
        return FORWARD_SUCCESS;
    }

    /**
     * <br />Add as {@link ActionMessages # GLOBAL_MESSAGE} the specified message
     * <br />指定されたメッセージを{@link ActionMessages#GLOBAL_MESSAGE}として追加します。
     *
     * @param request HTTP Request<br />HTTPリクエスト
     * @param messageId messageId<br />メッセージID
     * @param args messageArgument<br />メッセージ引数
     */
    protected void addGlobalMessage(HttpServletRequest request, String messageId, Object... args) {
        ActionMessages messages = getMessages(request);
        messages.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage(messageId, args));
        
        addMessages(request, messages);
    }
    
    /**
     * Create a {@link W9017CriteriaDomain}
     * <br />{@link W9017CriteriaDomain}を作成します。
     *
     * @param form Action Form of Export Ship to Shipping MA Edit screen <br />Export Ship to Shipping MA Edit画面のアクションフォーム
     * @return  {@link W9017CriteriaDomain} that created <br />作成した{@link W9017CriteriaDomain}
     */
    protected W9017CriteriaDomain prepareCriteriaDomain(W9017ActionForm form) {
        W9017CriteriaDomain criteriaDomain = form.getW9017CriteriaDomain();
        
        prepareBusinessDomain(criteriaDomain, form.getWindowId(), form.getScreenId());
        
        return criteriaDomain;
    }
}
