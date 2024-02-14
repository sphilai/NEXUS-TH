/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W9004;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W9004CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W9004ListDomain;
import com.globaldenso.eca0027.core.business.domain.W9004UserIdMaItemDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W9004UserIdMaCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W9004UserIdMaService;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.Validator;

/**
 *  The implementation class for facade service to search action of User ID MA Inquiry screen.
 * <br />User ID MA Inquiry画面のSearchアクションに対するFacadeサービスの実装クラスです。
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W9004SearchFacadeServiceImpl extends AbstractSearchFacadeService<List<? extends W9004ListDomain>, W9004CriteriaDomain> {

    /**
     * User ID MA service<br />
     * User ID MAのサービス
     */
    protected W9004UserIdMaService w9004UserIdMaService;

    /**
     * Default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W9004SearchFacadeServiceImpl() {
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
     * No action.
     * </pre> 
     * <pre>
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W9004CriteriaDomain filterDomain(W9004CriteriaDomain argDomain)
        throws GscmApplicationException, ApplicationException {
        return argDomain;
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
    protected void validateItems(W9004CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {

        Validator<W9004CriteriaDomain> valid = new Validator<W9004CriteriaDomain>(
            criteriaDomain, "w9004CriteriaDomain");
        
        String[] properties = {
            "compCd", 
            "dscId",
            "usrNmEn"
        };
        valid.isValidateProperties(properties, SCREEN_ID_W9004);
        
        if (0 < valid.getErrList().size()) {
            throw new ValidationException(valid.getErrList());
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
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W9004CriteriaDomain filterDomain)
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
    protected void validateDatabase(W9004CriteriaDomain filterDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
    }

    /**
     * {@inheritDoc}
     * <pre>
     * Get search result data.
     * </pre>
     * <pre>
     * 検索結果データを取得
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected List<W9004ListDomain> callServices(W9004CriteriaDomain criteria) 
        throws GscmApplicationException, ApplicationException {
        
        W9004UserIdMaCriteriaDomain criteriaDomain = createUserIdMaCriteria(criteria);
        
        List<? extends W9004UserIdMaItemDomain> userIdMaDomainList
            = w9004UserIdMaService.searchForPagingOnInquirySearch(criteriaDomain);
        
        return convertToListDomain(userIdMaDomainList, criteria.getScreenDateFormat());
    }
    
    /**
     *  Based on (PL) Search criteria domain, create Search criteria domain (BL).
     * <br />検索条件ドメイン(PL)を基に、検索条件ドメイン(BL)を作成します。
     *
     * @param criteriaDomain  Criteria domain of User Id MA Inquiry screen (PL)<br />
     * User Id MA Inquiry画面の検索条件ドメイン(PL)
     * @return Criteria domain for  User Id MA Edit service(BL)<br />
     * User Id MA Editサービスの検索条件ドメイン(BL)
     */
    protected W9004UserIdMaCriteriaDomain createUserIdMaCriteria(W9004CriteriaDomain criteriaDomain) {
        
        W9004UserIdMaCriteriaDomain userIdMaCriteria = new W9004UserIdMaCriteriaDomain();
        
        //setup for acquiring the maximum number 
        // 最大件数を取得するための設定
        userIdMaCriteria.setScreenId(criteriaDomain.getScreenId());
        userIdMaCriteria.setLocale(new Locale(criteriaDomain.getLanguageCd()));
        
        CommonUtil.copyPropertiesDomainToDomain(userIdMaCriteria, criteriaDomain);
        
        return userIdMaCriteria;
    }
    
    /**
     * Convert user id MA service domain(BL)  to user id MA inquiry screen list domain(PL). 
     * <br />User Id MAサービスのドメイン(BL)をUser Id MA Inquiry画面のリストドメイン(PL)に変換します。
     *
     * @param srcList List of user id MA service domain<br />
     * User Id MAサービスドメインのリスト(BL)
     * @param dateFormat Date format<br />
     * 画面表示用の日付フォーマット
     * @return List domain of user id MA inquiry screen<br />
     * User Id MA Inquiry画面のリストドメイン(PL)
     */
    protected List<W9004ListDomain> convertToListDomain(List<? extends W9004UserIdMaItemDomain> srcList, String dateFormat) {
        
        List<W9004ListDomain> dstList = new ArrayList<W9004ListDomain>();
        
        if (srcList != null) {
            for (W9004UserIdMaItemDomain src : srcList) {
                
                W9004ListDomain dst = new W9004ListDomain();

                CommonUtil.copyPropertiesDomainToDomain(dst, src, dateFormat);

                dstList.add(dst);
            }
        }
        
        return dstList;
    }
}