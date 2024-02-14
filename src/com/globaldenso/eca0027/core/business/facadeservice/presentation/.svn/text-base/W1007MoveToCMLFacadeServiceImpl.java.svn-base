/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0163;

import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W1007UpdateDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W1007PltzWkCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W1007PltzWkService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractProcessFacadeService;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;

/**
 *  An implementation class of facade service for edit or refer action of Export Ship to Shipping MA Inquiry screen.
 * <br />Export Ship to Shipping MA Inquiry画面のEditOrReferアクションに対するFacadeサービスの実装クラスです。
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W1007MoveToCMLFacadeServiceImpl extends AbstractSearchFacadeService<W1007UpdateDomain, W1007UpdateDomain> {

    /**
     * W1007PltzWk service
     * <br />
     */
    protected W1007PltzWkService w1007PltzWkService;
    
    /**
     * Default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W1007MoveToCMLFacadeServiceImpl() {
    }

    /**
     * <p>Setter method for w1007PltzWkService.</p>
     *
     * @param pltzWkService Set for w1007PltzWkService
     */
    public void setW1007PltzWkService(W1007PltzWkService pltzWkService) {
        w1007PltzWkService = pltzWkService;
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
    protected W1007UpdateDomain filterDomain(W1007UpdateDomain updateDomain)
        throws GscmApplicationException, ApplicationException {
        
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
    protected void validateItems(W1007UpdateDomain updateDomain)
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
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W1007UpdateDomain updateDomain)
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
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W1007UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        List<MessageDomain> errorList = new ArrayList<MessageDomain>();
        W1007PltzWkCriteriaDomain criteriaDomain = new W1007PltzWkCriteriaDomain();
        criteriaDomain.setExpRequestNo(updateDomain.getCriteriaDomain().getExpRequestNo());
        criteriaDomain.setLanguageCd(updateDomain.getCriteriaDomain().getLanguageCd());
        // Search count
        int count = w1007PltzWkService.searchCountDistinct(criteriaDomain);
        if(count > 0){
            
        }else{
            MessageDomain msgUpdateStatus = new MessageDomain("", NXS_E7_0163, null);
            errorList.add(msgUpdateStatus);
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
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W1007UpdateDomain callServices(W1007UpdateDomain updateDomain)
        throws GscmApplicationException, ApplicationException {
        
        return updateDomain;
    }
    
}
