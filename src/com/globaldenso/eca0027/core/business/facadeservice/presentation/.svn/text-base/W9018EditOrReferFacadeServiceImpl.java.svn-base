/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0004;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W9018ListDomain;
import com.globaldenso.eca0027.core.business.domain.W9018UpdateDomain;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractProcessFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;

/**
 * 
 * Type in the functional overview of the class.
 * 
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W9018EditOrReferFacadeServiceImpl extends
    AbstractProcessFacadeService<Void, W9018UpdateDomain> {

    /**
     * Default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W9018EditOrReferFacadeServiceImpl() {
        super();
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected Void callServices(W9018UpdateDomain filterDomain)
        throws GscmApplicationException, ApplicationException {
        // 処理なし
        return null;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W9018UpdateDomain filterDomain(W9018UpdateDomain updateDomain)
        throws GscmApplicationException, ApplicationException {
        
        // Detail line selection check 
        // 明細行選択チェック
        if (StringUtils.isEmpty(updateDomain.getCriteriaDomain().getSelected())) {
            List<MessageDomain> errList = Arrays.asList(new MessageDomain("", NXS_E7_0004, null));
            throw new ValidationException(errList);
        }
        
        // selected line is stored. 
        // 選択した行のみを格納
        int selectedRow = Integer.parseInt(updateDomain.getCriteriaDomain().getSelected());
        List<W9018ListDomain> listDomainList = new ArrayList<W9018ListDomain>();
        listDomainList.add(updateDomain.getListDomainList().get(selectedRow));
        
        updateDomain.setListDomainList(listDomainList);
        
        return updateDomain;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W9018UpdateDomain filterDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {

    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W9018UpdateDomain filterDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {

    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W9018UpdateDomain filterDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {

    }

}
