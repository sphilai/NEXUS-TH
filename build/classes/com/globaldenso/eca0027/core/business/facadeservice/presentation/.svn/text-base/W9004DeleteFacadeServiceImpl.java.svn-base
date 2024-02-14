/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CHECK_ON;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0004;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W9004ListDomain;
import com.globaldenso.eca0027.core.business.domain.W9004UpdateDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W9004UserIdMaCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W9004UserIdMaService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractDeleteFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 * The implementation class for facade service to delete action of User ID MA Inquiry screen.
 * <br />User ID MA Inquiry画面のSearchアクションに対するFacadeサービスの実装クラスです。
 *
 * @version $Revision: 7765 $
 */
public class W9004DeleteFacadeServiceImpl extends
    AbstractDeleteFacadeService<Void, W9004UpdateDomain> {

    /**
     * User ID MA service<br />
     * User ID MAのサービス
     */
    protected W9004UserIdMaService w9004UserIdMaService;

    /**
     * Default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W9004DeleteFacadeServiceImpl() {
        super();
    }

    /**
     * Setter method for w9004UserIdMaService.
     *
     * @param userIdMaService Set for w9004UserIdMaService
     */
    public void setW9004UserIdMaService(W9004UserIdMaService userIdMaService) {
        w9004UserIdMaService = userIdMaService;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * Check selection of detail list.
     * </pre>
     * <pre>
     * 明細行選択チェック
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    
    @Override
    protected W9004UpdateDomain filterDomain(W9004UpdateDomain updateDomain)
        throws GscmApplicationException, ApplicationException {
        
        List<W9004ListDomain> newListDomainList = new ArrayList<W9004ListDomain>();
        
        // selected List domain is extracted.
        // 選択されたListドメインを抽出
        for (W9004ListDomain listDomain : updateDomain.getListDomainList()) {
            if (CHECK_ON.equals(listDomain.getSelected())) {
                newListDomainList.add(listDomain);
            }
        }
        
        // Detail line selection check 
        // 明細行選択チェック
        if (newListDomainList.size() == 0) {
            List<MessageDomain> errList = Arrays.asList(new MessageDomain("", NXS_E7_0004, null));
            
            throw new ValidationException(errList);
        }

        updateDomain.setListDomainList(newListDomainList);
        
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
    protected void validateItems(W9004UpdateDomain filterDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {
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
    protected void validateConsistency(W9004UpdateDomain filterDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {
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
    protected void validateDatabase(W9004UpdateDomain filterDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {
    }

    /**
     * {@inheritDoc}
     * <pre>
     * Logical delete user settings basic unit.
     * </pre>
     * <pre>
     * ユーザ設定原単位を論理削除
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected Void callServices(W9004UpdateDomain criteria)
        throws GscmApplicationException, ApplicationException {
        
        W9004UserIdMaCriteriaDomain criteriaDomain = createUserIdMaCriteria(criteria);
        
        w9004UserIdMaService.deleteOnInquiryDelete(criteriaDomain);
        criteria.setDeleteCount(criteriaDomain.getDeleteCount());
        
        return null;
    }
    
    /**
     *  Based on (PL) Search criteria domain, create Search criteria domain (BL).
     * <br />検索条件ドメイン(PL)を基に、検索条件ドメイン(BL)を作成します。
     *
     * @param updateDomain Criteria domain of User Id MA Inquiry screen (PL)<br />
     * User Id MA Inquiry画面の検索条件ドメイン(PL)
     * @return Criteria domain for  User Id MA Edit service(BL)<br />
     * User Id MA Editサービスの検索条件ドメイン(BL)
     */
    protected W9004UserIdMaCriteriaDomain createUserIdMaCriteria(W9004UpdateDomain updateDomain) {
        
        W9004UserIdMaCriteriaDomain userIdMaCriteria = new W9004UserIdMaCriteriaDomain();
        
        // setup for acquiring the maximum number 
        // 最大件数を取得するための設定
        userIdMaCriteria.setScreenId(updateDomain.getScreenId());
        userIdMaCriteria.setLocale(new Locale(updateDomain.getLanguageCd()));
        
        CommonUtil.copyPropertiesDomainToDomain(
            userIdMaCriteria, updateDomain.getListDomainList().get(0));
        
        return userIdMaCriteria;
    }
}
