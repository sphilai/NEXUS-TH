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
import com.globaldenso.eca0027.core.business.domain.W2001ListDomain;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractProcessFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;


/**
 * This is an implement class of the Facade service to ConfirmDetail action of a Packaging Instruction (=Pull) Main screen.
 * <br />梱包指示Main画面のConfirmDetailアクションに対するFacadeサービスの実装クラスです。
 * <pre>
 * bean id: w2001ConfirmDetailFacadeService
 * </pre>
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W2001ConfirmDetailFacadeServiceImpl extends AbstractProcessFacadeService<Void, W2001ListDomain> {

    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W2001ConfirmDetailFacadeServiceImpl() {
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * - Detailed line selection check
     *       This is a common-specifications .xls "functional common-specifications" No.12 particulars line selection check for details.   This is referred to.
     * 
     * - 明細行選択チェック
     *     詳細は共通仕様.xls「機能共通仕様」No.12 明細行選択チェック 参照
     * </pre>
     * 
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W2001ListDomain filterDomain(W2001ListDomain listDomain)
        throws GscmApplicationException, ApplicationException {
        
        // Detailed line selection check
        // 明細行選択チェック
        if (StringUtils.isEmpty(listDomain.getPltzInstrNo())) {
            List<MessageDomain> errList = Arrays.asList(new MessageDomain("", NXS_E7_0004, null));
            
            throw new ValidationException(errList);
        }

        return listDomain;
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * No Action
     * 
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W2001ListDomain listDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // No Action
        // 処理なし
    }

    /**
     * {@inheritDoc}
     * <pre>
     * No Action
     * 
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W2001ListDomain listDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // No Action
        // 処理なし
    }

    /**
     * {@inheritDoc}
     * <pre>
     * No Action
     * 
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W2001ListDomain listDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // No Action
        // 処理なし
    }

    /**
     * {@inheritDoc}
     * <pre>
     * No Action
     * 
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected Void callServices(W2001ListDomain listDomain) 
        throws GscmApplicationException, ApplicationException {
        // No Action
        // 処理なし
        return null;
    }
}
