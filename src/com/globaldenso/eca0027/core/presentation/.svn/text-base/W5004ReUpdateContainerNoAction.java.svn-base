/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0006;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0009;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W5001B;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W5001R;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W5001;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.sql.Timestamp;
import java.util.List;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

import com.globaldenso.eca0027.core.business.domain.W5004ListDomain;
import com.globaldenso.eca0027.core.business.domain.W5004UpdateDomain;
import com.globaldenso.eca0027.core.common.business.domain.UserAuthDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.TransactFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * The Re-Update Container No. action class of Shipping Confirmation Register screen
 * <br />出荷確認Register画面のRe-Update Container No.アクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":/W5004Init.do
 *     - "error":W5004.jsp
 * </pre>
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W5004ReUpdateContainerNoAction extends W5004AbstractAction {
    
    /**
     * ReUpdate container no facade service.
     */
    protected TransactFacadeService<List<W5004ListDomain>, W5004UpdateDomain> w5004ReUpdateContainerNoFacadeService;

    /**
     * constructor.
     */
    public W5004ReUpdateContainerNoAction() {
        super();
    }

    /**
     * Setter method for w5004ReUpdateContainerNoFacadeService.
     *
     * @param reUpdateContainerNoFacadeService Set for w5004ReUpdateContainerNoFacadeService
     */
    public void setW5004ReUpdateContainerNoFacadeService(
        TransactFacadeService<List<W5004ListDomain>, W5004UpdateDomain> reUpdateContainerNoFacadeService) {
        w5004ReUpdateContainerNoFacadeService = reUpdateContainerNoFacadeService;
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * - Call the W5004ReUpdateContainerNoFacadeService.update an argument form.criteriaDomain
     *
     * - form.criteriaDomainを引数にW5004ReUpdateContainerNoFacadeService.updateの呼び出し
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws Exception {
        
        // Set of mass update domain.
        // 一括更新ドメインの設定
        W5004ActionForm w5004Form = (W5004ActionForm) form;
        Timestamp comUpdateTimestamp = w5004Form.getW5004CriteriaDomain().getComUpdateTimestamp();
        
        // Set of common information screen.
        // 画面共通情報の設定
        W5004UpdateDomain updateDomain = new W5004UpdateDomain();
        ActionUtil.prepareBusinessDomain(w5004Form.getW5004CriteriaDomain(), w5004Form.getWindowId(), w5004Form.getScreenId());
        ActionUtil.prepareBusinessDomain(updateDomain, w5004Form.getWindowId(), w5004Form.getScreenId());
        
        w5004Form.getW5004CriteriaDomain().setCallScreenId(SCREEN_ID_W5001);
        w5004Form.getW5004CriteriaDomain().setComUpdateTimestamp(comUpdateTimestamp);
        
        // Setting Permissions.
        // 権限の設定
        if (userAuthService.hasRegisterAll() || userAuthService.hasBrowseAll()) {
            w5004Form.getW5004CriteriaDomain().setUserAuthList(null);
        } else {
            String[] permitFuncIdList = { PERMIT_FUNC_ID_W5001R, PERMIT_FUNC_ID_W5001B};
            List<? extends UserAuthDomain> userAuthList = userAuthService.getUserAuthList(permitFuncIdList);
            
            if (userAuthList.size() == 0) {
                throw new GscmApplicationException(GSCM_I0_0009);
            }
            
            w5004Form.getW5004CriteriaDomain().setUserAuthList(userAuthList);
        }
        
        updateDomain.setCriteriaDomain(w5004Form.getW5004CriteriaDomain());
        updateDomain.setListDomainList(w5004Form.getListDomainList());
        
        List<W5004ListDomain> listDomainList = w5004ReUpdateContainerNoFacadeService.transact(updateDomain);
        
        // Set of search results.
        // 検索結果の設定
        setSearchResult(w5004Form, listDomainList);
        
        // Update complete message set.
        // 更新完了メッセージ設定
        ActionMessages messages = new ActionMessages();
        messages.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage(GSCM_I0_0006, 1));
        saveMessages(request, messages);
        
        return FORWARD_SUCCESS;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#isScreenInfoStack()
     */
    @Override
    protected boolean isScreenInfoStack() {
        return false;
    }
}
