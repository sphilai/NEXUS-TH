/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.eca0027.core.business.domain.W9022UpdateDomain;
import com.globaldenso.eca0027.core.business.facadeservice.presentation.W9022EditOrReferFacadeServiceImpl;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.ProcessFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * The class that action EditOrRefer of Invoice Template MA Inquiry screen.
 * <br />Invoice Template MA Inquiry画面のEditOrReferアクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":W9022.jsp
 * </pre>
 *
 * @author $Author: 810833843 $
 * @version $Revision: 6762 $
 */
public class W9022EditOrReferAction extends W9022AbstractAction {

    /**
     * EditOrRefer Facade Service
     * <br />EditOrRefer Facadeサービス
     */
    protected ProcessFacadeService<Void, W9022UpdateDomain> w9022EditOrReferFacadeService;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W9022EditOrReferAction() {
        super();
    }

    /**
     * Setter method for w9022EditOrReferFacadeService.
     *
     * @param editOrReferFacadeService Set for w9022EditOrReferFacadeService
     */
    public void setW9022EditOrReferFacadeService(
        ProcessFacadeService<Void, W9022UpdateDomain> editOrReferFacadeService) {
        w9022EditOrReferFacadeService = editOrReferFacadeService;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * - Creating a mass update domain
     *     
     * -Line item selection check
     *     Call the {@link W9022EditOrReferFacadeServiceImpl}, Line item selection check
     * 
     * - 一括更新ドメインの作成
     *     
     * - 明細行選択チェック
     *     {@link W9022EditOrReferFacadeServiceImpl}を呼出し、明細行選択チェックを行う
     * </pre>
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response)
        throws Exception {
        
        W9022ActionForm w9022Form = (W9022ActionForm) form;
        
        // Creation of mass update domain.
        // 一括更新ドメインの作成
        W9022UpdateDomain updateDomain = prepareUpdateDomain(w9022Form);
        
        // Line item selection check.
        // 明細行選択チェック
        w9022EditOrReferFacadeService.process(updateDomain);
        
        // (Company, Document No) to take-over the destination screen
        // 遷移先画面への引継(Company,Document No)
        request.setAttribute("company", updateDomain.getListDomainList().get(0).getCompCd());
        request.setAttribute("documentNo", updateDomain.getListDomainList().get(0).getDocNo());
        
        return FORWARD_SUCCESS;
    }

    /**
     * Create a {@link W9022UpdateDomain}
     * <br />{@link W9022UpdateDomain}を作成します。
     *
     * @param form Action Form <br />アクションフォーム
     * @return  {@link W9022UpdateDomain} It created <br />作成した{@link W9022UpdateDomain}
     */
    protected W9022UpdateDomain prepareUpdateDomain(W9022ActionForm form) {
        
        W9022UpdateDomain updateDomain = new W9022UpdateDomain();
        
        // Set of common information screen.
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(updateDomain, form.getWindowId(), form.getScreenId());
        
        // Set of mass update domain
        // 一括更新ドメインの設定
        updateDomain.setCriteriaDomain(form.getW9022CriteriaDomain());
        updateDomain.setListDomainList(form.getListDomainList());
        
        return updateDomain;
    }
}
