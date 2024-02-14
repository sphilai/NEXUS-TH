/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W9022;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W9022CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W9022InvTplMaCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W9022InvTplMaItemDomain;
import com.globaldenso.eca0027.core.business.domain.W9022ListDomain;
import com.globaldenso.eca0027.core.business.service.W9022InvTplMaService;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.Validator;

/**
 * The implementation class of the Facade service for Delete action of
 *  Invoice Template MA Inquiry screen.
 * <br />Invoice Template MA Inquiry画面のSearchアクションに対するFacadeサービスの実装クラスです。
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W9022SearchFacadeServiceImpl extends
    AbstractSearchFacadeService<List<? extends W9022ListDomain>, W9022CriteriaDomain> {
    
    /**
     * Service of invoice Template MA<br />
     * Invoice Template MAのサービス
     */
    protected W9022InvTplMaService w9022InvTplMaService;

    /**
     * Default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W9022SearchFacadeServiceImpl() {
    }
    
    /**
     * Setter method for w9022InvTplMaService.
     *
     * @param invTplMaService Set for w9022InvTplMaService
     */
    public void setW9022InvTplMaService(W9022InvTplMaService invTplMaService) {
        w9022InvTplMaService = invTplMaService;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * Get search result data
     * </pre>
     * <pre>
     * 検索結果データを取得
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected List<? extends W9022ListDomain> callServices(
        W9022CriteriaDomain criteria) throws GscmApplicationException,
        ApplicationException {
        
        W9022InvTplMaCriteriaDomain criteriaDomain = createInvTplMaCriteria(criteria);
        
        List<? extends W9022InvTplMaItemDomain> itemDomain = w9022InvTplMaService.searchForPagingOnInquirySearch(criteriaDomain);
        
        return convertToListDomain(itemDomain);
    }

    /**
     * {@inheritDoc}
     * <pre>
     * no action.
     * </pre>
     * <pre>
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W9022CriteriaDomain filterDomain(W9022CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {
        return criteriaDomain;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * no action.
     * </pre>
     * <pre>
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W9022CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {
    }

    /**
     * {@inheritDoc}
     * <pre>
     * no action.
     * </pre>
     * <pre>
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W9022CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {

    }

    /**
     * {@inheritDoc}
     * <pre>
     * Item check
     * </pre>
     * <pre>
     * 単項目チェック
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W9022CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {

        Validator<W9022CriteriaDomain> valid = new Validator<W9022CriteriaDomain>(criteriaDomain, "w9022CriteriaDomain");

        String[] properties = {
            "company",
            "docNo"
        };

        valid.isValidateProperties(properties, SCREEN_ID_W9022);

        if (0 < valid.getErrList().size()) {
            throw new ValidationException(valid.getErrList());
        }
    }
    
    /**
     *  Based on (PL) Search criteria domain, create Search criteria domain (BL).
     * <br />検索条件ドメイン(PL)を基に、検索条件ドメイン(BL)を作成します。
     *
     * @param criteriaDomain Criteria domain of screen(PL)<br />
     * 画面の検索条件ドメイン(PL)
     * @return Criteria domain of service<br />
     * サービスの検索条件ドメイン(BL)
     */
    protected W9022InvTplMaCriteriaDomain createInvTplMaCriteria(W9022CriteriaDomain criteriaDomain) {
        
        W9022InvTplMaCriteriaDomain invTplMaCriteria = new W9022InvTplMaCriteriaDomain();
        
        // setup for acquiring the maximum number 
        // 最大件数を取得するための設定
        invTplMaCriteria.setScreenId(criteriaDomain.getScreenId());
        invTplMaCriteria.setLocale(new Locale(criteriaDomain.getLanguageCd()));
        
        // company is copied to compCd. 
        // companyをcompCdにコピー
        invTplMaCriteria.setCompCd(criteriaDomain.getCompany());
        
        CommonUtil.copyPropertiesDomainToDomain(invTplMaCriteria, criteriaDomain);
        
        return invTplMaCriteria;
    }
    
    /**
     * Convert service domain(BL) to list domain of screen(PL)
     * <br />サービスのドメイン(BL)を画面のリストドメイン(PL)に変換します。
     *
     * @param srcList  List of service domain(BL)<br />
     * サービスドメインのリスト(BL)
     * @return  List domain of screen(PL)<br />
     * 画面のリストドメイン(PL)
     */
    protected List<W9022ListDomain> convertToListDomain(List<? extends W9022InvTplMaItemDomain> srcList) {
        
        List<W9022ListDomain> dstList = new ArrayList<W9022ListDomain>();
        
        if (srcList != null) {
            for (W9022InvTplMaItemDomain src : srcList) {
                
                W9022ListDomain dst = new W9022ListDomain();

                CommonUtil.copyPropertiesDomainToDomain(dst, src);

                dstList.add(dst);
            }
        }
        
        return dstList;
    }
}
