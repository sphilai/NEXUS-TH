/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0004;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W9011UpdateDomain;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractProcessFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;

/**
 * The editOrRefer service facade implementation class
 * of CIGMA Customer No. X-Reference MA Inquiry Screen.
 * <br />CIGMA Customer No. X-Reference MA Inquiry画面の修正・参照facadeサービス実装クラスです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W9011EditOrReferFacadeServiceImpl 
    extends AbstractProcessFacadeService<W9011UpdateDomain, W9011UpdateDomain>{

    /**
     * Default constructor./デフォルトコンストラクタ。
     */
    public W9011EditOrReferFacadeServiceImpl() {
    }

    /**
     * {@inheritDoc}
     * <pre>
     * Line item selection check
     * - Extract List the selected domain.
     * - Line item selection check.
     * - Return the domain that has been extracted.
     * 
     * 明細行選択チェック
     * - 選択されたListドメインを抽出する。
     * - 明細行選択チェックをする。
     * - 抽出したドメインを返却する。
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService
     *      #filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W9011UpdateDomain filterDomain(W9011UpdateDomain criteriaDomain)
        throws ApplicationException {

        // Line item selection check.
        if (StringUtils.isEmpty(criteriaDomain.getCk())) {
            List<MessageDomain> errList = Arrays.asList(new MessageDomain("", NXS_E7_0004, null));

            throw new ValidationException(errList);
        }

        // Return the domain that has been extracted.
        return criteriaDomain;

    }

    /**
     * {@inheritDoc}
     * <pre>
     * - No processing.
     * 
     * - 処理なし。
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService
     *      #validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W9011UpdateDomain criteriaDomain) throws GscmApplicationException,
        ValidationException, ApplicationException {

    }

    /**
     * {@inheritDoc}
     * <pre>
     * - No processing.
     * 
     * - 処理なし。
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService
     *      #validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W9011UpdateDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {

    }

    /**
     * {@inheritDoc}
     * <pre>
     * - No processing.
     * 
     * - 処理なし。
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService
     *      #validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W9011UpdateDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {

    }

    /**
     * {@inheritDoc}
     * <pre>
     * - No processing.
     * 
     * - 処理なし。
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService
     *      #callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected  W9011UpdateDomain callServices(W9011UpdateDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {

        return criteriaDomain;

    }
}
