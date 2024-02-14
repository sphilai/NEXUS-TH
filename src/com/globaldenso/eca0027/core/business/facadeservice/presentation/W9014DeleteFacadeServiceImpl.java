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
import com.globaldenso.eca0027.core.business.domain.W9014UpdateDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W9014CgmWhXRefMaCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W9014CgmWhXRefMaService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractDeleteFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 * The delete service facade implementation class of CIGMA W/H X-Reference MA Inquiry
 * Screen.
 * <br />CIGMA W/H X-Reference MA Inquiry画面の削除facadeサービス実装クラスです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W9014DeleteFacadeServiceImpl 
    extends AbstractDeleteFacadeService<Integer, W9014UpdateDomain>{

    /**
    * w9014CgmWhXRefMaService/w9014CgmWhXRefMaサービス
    */
    protected W9014CgmWhXRefMaService w9014CgmWhXRefMaService;

    /**
     * Default constructor./デフォルトコンストラクタ。
     */
    public W9014DeleteFacadeServiceImpl() {
    }

    /**
     * <p>Setter method for w9014CgmWhXRefMaService.</p>
     *
     * @param cgmWhXRefMaService Set for w9014CgmWhXRefMaService
     */
    public void setW9014CgmWhXRefMaService(W9014CgmWhXRefMaService cgmWhXRefMaService) {
        w9014CgmWhXRefMaService = cgmWhXRefMaService;
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
     *     #filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W9014UpdateDomain filterDomain(W9014UpdateDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {

        // Line item selection check.
        if (StringUtils.isEmpty(criteriaDomain.getCk())) {
            List<MessageDomain> errList = Arrays.asList(new MessageDomain("", NXS_E7_0004, null));

            throw new ValidationException(errList);
        }

        //Return the domain that has been extracted.
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
     *     #validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W9014UpdateDomain criteriaDomain) throws GscmApplicationException,
        ValidationException, ApplicationException {
    }

    /**
     * {@inheritDoc}
     * <pre>
     * This method calls the service to Authority check.
     * 権限チェック(COMPANY)をするサービスを呼び出します。
     * 
     * - Get the search criteria.
     * - Authority check.
     *    calls the method to w9014CgmWhXRefMaService.validateConsistencyCompAuth(String).
     * 
     * - 検索条件を取得
     * - 権限チェック
     *      w9014CgmWhXRefMaService.validateConsistencyCompAuth(String)を呼び出す。
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService
     *     #validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W9014UpdateDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {

        // Get the search criteria.
        W9014CgmWhXRefMaCriteriaDomain deleteDomain 
            = createW9014CgmWhXRefMaCriteria(criteriaDomain);

        // Authority check.
        w9014CgmWhXRefMaService.validateConsistencyCompAuth(deleteDomain.getLgcyLibCompCd());

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
     *     #validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W9014UpdateDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
    }

    /**
     * {@inheritDoc}
     * <pre>
     * This method calls the service to delete 
     * for the NEXUS Warehouse Cross reference Standard physical unit.
     * 倉庫クロスリファレンス原単位を物理削除するサービスを呼び出します。
     * 
     * Process of Delete.
     * - Transfer your delete criteria from deleteDomain
     *   to W9014CgmWhXRefMaCriteriaDomain W9014CgmWhXRefMa.
     * - Call w9014CgmWhXRefMaService.deleteOnInquiryDelete with W9014CgmWhXRefMa as an argument.
     * - Return the Delete number.
     *
     * 削除処理。
     * - deleteDomainよりW9014CgmWhXRefMaCriteriaDomain W9014CgmWhXRefMaに検索条件を移送する。
     * - W9014CgmWhXRefMaを引数にw9014CgmWhXRefMaService.deleteOnInquiryDeleteを呼び出す。
     * - 削除件数を返却する。
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService
     *     #callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected Integer callServices(W9014UpdateDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {

        int idx = Integer.parseInt(criteriaDomain.getCk()); 

        // Set Condition domain.
        W9014CgmWhXRefMaCriteriaDomain W9014CgmWhXRefMa = new W9014CgmWhXRefMaCriteriaDomain();
        CommonUtil.copyPropertiesDomainToDomain(W9014CgmWhXRefMa, criteriaDomain);
        W9014CgmWhXRefMa.setLgcyLibCompCd(criteriaDomain.getW9014ListDomainList().get(idx).getLgcyLibCompCd());
        W9014CgmWhXRefMa.setLgcyWhCd(criteriaDomain.getW9014ListDomainList().get(idx).getLgcyWhCd());
        W9014CgmWhXRefMa.setPlntCd(criteriaDomain.getW9014ListDomainList().get(idx).getPlntCd());
        W9014CgmWhXRefMa.setComUpdateTimestamp(criteriaDomain.getW9014ListDomainList().get(idx).getComUpdateTimestamp());

        // Deletion processing.
        int deleteCount = w9014CgmWhXRefMaService.deleteOnInquiryDelete(W9014CgmWhXRefMa);

        //Return the Delete number.
        return deleteCount;
    }

    /**
     * Based on (PL) domain search criteria, you can create search criteria domain (BL).
     * 検索条件ドメイン(PL)を基に、検索条件ドメイン(BL)を作成します。
     * 
     * - Copy the search criteria.
     * 
     * - 検索条件をコピー
     * 
     * @param criteriaDomain 画面の検索条件ドメイン(PL)
     * @return User Id MA Editサービスの検索条件ドメイン(BL)
     */
    protected W9014CgmWhXRefMaCriteriaDomain createW9014CgmWhXRefMaCriteria 
    (W9014UpdateDomain criteriaDomain) {
        
        W9014CgmWhXRefMaCriteriaDomain w9014CgmWhXRefMaCriteria = new W9014CgmWhXRefMaCriteriaDomain();
        
        // Copy the search criteria.
        CommonUtil.copyPropertiesDomainToDomain(w9014CgmWhXRefMaCriteria, criteriaDomain);

        int idx = Integer.parseInt(criteriaDomain.getCk()); 
        w9014CgmWhXRefMaCriteria.setLgcyLibCompCd(criteriaDomain.getW9014ListDomainList()
            .get(idx).getLgcyLibCompCd());
        
        return w9014CgmWhXRefMaCriteria;
    }
}