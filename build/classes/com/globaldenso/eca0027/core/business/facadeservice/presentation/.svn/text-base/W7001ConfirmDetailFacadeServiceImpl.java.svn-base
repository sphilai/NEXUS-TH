/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CHECK_ON;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0042;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0004;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W7001ListDomain;
import com.globaldenso.eca0027.core.business.domain.W7001UpdateDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractProcessFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;

/**
 * 
 * The service to the Facade Confirm Detail action of Shipping Actuality Main screen.
 * <br />船積実績Main画面のConfirm Detailアクションに対するFacadeサービスです。
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W7001ConfirmDetailFacadeServiceImpl extends AbstractProcessFacadeService<Void, W7001UpdateDomain> {

    /**
     * Common services.<br />
     * 共通サービス
     */
    protected CommonService commonService;
    
    /**
     * Default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W7001ConfirmDetailFacadeServiceImpl() {
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
     * {@inheritDoc}
     * <pre>
     * - Line item selection check.
     * ‐明細行選択チェック
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W7001UpdateDomain filterDomain(W7001UpdateDomain updateDomain)
        throws GscmApplicationException, ApplicationException {
        
        List<W7001ListDomain> newListDomainList = new ArrayList<W7001ListDomain>();
        
        // Extract List the selected domain
        // 選択されたListドメインを抽出
        for (int i = 0; i < updateDomain.getListDomainList().size(); i++) {
            W7001ListDomain listDomain = updateDomain.getListDomainList().get(i);
            
            if (CHECK_ON.equals(listDomain.getSelected())) {
                newListDomainList.add(listDomain);
            }
        }
        
        // Line item selection check.
        // 明細行選択チェック
        if(newListDomainList.size() == 0) {
            List<MessageDomain> errList = Arrays.asList(new MessageDomain("", NXS_E7_0004, null));
            throw new ValidationException(errList);
        } else if(newListDomainList.size() > 1) {
            String[] params =  new String[1];
            params[0] = "Shipping Actuality";
            List<MessageDomain> errList = Arrays.asList(new MessageDomain("", GSCM_E0_0042, params));
            throw new ValidationException(errList);
        }
        
        updateDomain.setListDomainList(newListDomainList);
        
        return updateDomain;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * No action
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W7001UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // No action
        // 処理なし
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * No action
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W7001UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // No action
        // 処理なし
    }

    /**
     * {@inheritDoc}
     * <pre>
     * No action
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W7001UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // No action
        // 処理なし
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * No action
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected Void callServices(W7001UpdateDomain updateDomain)
        throws GscmApplicationException, ApplicationException {
        // No action
        // 処理なし
        return null;
    }
}
