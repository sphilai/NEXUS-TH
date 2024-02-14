/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0009;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0004;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W9007CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W9007ListDomain;
import com.globaldenso.eca0027.core.business.domain.W9007UpdateDomain;
import com.globaldenso.eca0027.core.business.service.W9007ExpShipToShippingMaService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractTransactFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;

/**
 * An implementation class of facade service for clone action of Export Ship to Shipping MA Inquiry screen.
 * <br />Export Ship to Shipping MA Inquiry画面のCloneアクションに対するFacadeサービスの実装クラスです。
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W9007CloneFacadeServiceImpl extends AbstractTransactFacadeService<W9007UpdateDomain, W9007UpdateDomain> {

    /**
     * Exp Ship To Shipping MA service<br />
     * Exp Ship To Shipping MAのサービス
     */
    protected W9007ExpShipToShippingMaService w9007ExpShipToShippingMaService;

    /**
     * Default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W9007CloneFacadeServiceImpl() {
    }
    
    /**
     * Setter method for w9007ExpShipToShippingMaService.
     *
     * @param expShipToShippingMaService Set for w9007ExpShipToShippingMaService
     */
    public void setW9007ExpShipToShippingMaService(W9007ExpShipToShippingMaService expShipToShippingMaService) {
        w9007ExpShipToShippingMaService = expShipToShippingMaService;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * Check selection of detail line.
     * </pre>
     * <pre>
     * 明細行選択チェック
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W9007UpdateDomain filterDomain(W9007UpdateDomain updateDomain)
        throws GscmApplicationException, ApplicationException {
        
        // Line item selection check. 
        // 明細行選択チェック
        if (StringUtils.isEmpty(updateDomain.getCriteriaDomain().getSelected())) {
            List<MessageDomain> errList = Arrays.asList(new MessageDomain("", NXS_E7_0004, null));
            throw new ValidationException(errList);
        }
        
        // Stores only selected rows
        // 選択した行のみを格納
        int selectedRow = Integer.parseInt(updateDomain.getCriteriaDomain().getSelected());
        List<W9007ListDomain> listDomainList = new ArrayList<W9007ListDomain>();
        listDomainList.add(updateDomain.getListDomainList().get(selectedRow));
        updateDomain.setListDomainList(listDomainList);
        
        return updateDomain;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * No action.
     * </pre> 
     * <pre>
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W9007UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * Authority check.
     * </pre>
     * <pre>
     * 権限チェック
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W9007UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        List<MessageDomain> errorList = new ArrayList<MessageDomain>();
        W9007CriteriaDomain criteriaDomain = updateDomain.getCriteriaDomain();
        W9007ListDomain selectedDomain = updateDomain.getListDomainList().get(0);
        
        // Authority check 
        // 権限チェック
        if(!w9007ExpShipToShippingMaService.validateConsistencyCompAuth(selectedDomain.getCompCd())){
            MessageDomain msgCompany = new MessageDomain("listDomainList[" + criteriaDomain.getSelected() + "].compCd", GSCM_I0_0009, null);
            errorList.add(msgCompany);
        }
        
        if (errorList.size() > 0) {
            throw new ValidationException(errorList);
        }
    }

    /**
     * {@inheritDoc}
     * <pre>
     * No action.
     * </pre> 
     * <pre>
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W9007UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
    }

    /**
     * {@inheritDoc}
     * <pre>
     * No action.
     * </pre> 
     * <pre>
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W9007UpdateDomain callServices(W9007UpdateDomain updateDomain) 
        throws GscmApplicationException, ApplicationException {
        return updateDomain;
    }
}
