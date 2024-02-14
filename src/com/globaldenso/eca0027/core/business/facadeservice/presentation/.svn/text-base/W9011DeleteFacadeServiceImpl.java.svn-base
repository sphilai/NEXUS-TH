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
import com.globaldenso.eca0027.core.business.domain.criteria.W9011CgmCusNoXRefMaCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W9011CgmCusNoXRefMaService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractDeleteFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 * The delete service facade implementation class of CIGMA Customer No. X-Reference MA Inquiry
 * Screen.
 * <br />CIGMA Customer No. X-Reference MA Inquiry画面の削除facadeサービス実装クラスです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W9011DeleteFacadeServiceImpl 
    extends AbstractDeleteFacadeService<Integer, W9011UpdateDomain>{

    /**
    * W9011CgmCusNoXRefMaService/w9011CgmCusNoXRefMaサービス
    */
    protected W9011CgmCusNoXRefMaService w9011CgmCusNoXRefMaService;

    /**
     * Default constructor./デフォルトコンストラクタ。
     */
    public W9011DeleteFacadeServiceImpl() {
    }

    /**
     * Setter method for w9011CgmCusNoXRefMaService.
     *
     * @param cgmCusNoXRefMaService Set for w9011CgmCusNoXRefMaService
     */
    public void setW9011CgmCusNoXRefMaService(W9011CgmCusNoXRefMaService cgmCusNoXRefMaService) {
        w9011CgmCusNoXRefMaService = cgmCusNoXRefMaService;
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
    protected W9011UpdateDomain filterDomain(W9011UpdateDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {

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
     *     #validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W9011UpdateDomain criteriaDomain) throws GscmApplicationException,
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
     *    calls the method to w9011CgmCusNoXRefMaService.validateConsistencyCompAuth(String).
     * 
     * - 検索条件を取得
     * - 権限チェック
     *      w9011CgmCusNoXRefMaService.validateConsistencyCompAuth(String)を呼び出す。
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService
     *     #validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W9011UpdateDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {

        // Get the search criteria.
        W9011CgmCusNoXRefMaCriteriaDomain deleteDomain 
            = createCgmCusNoXRefMaCriteria(criteriaDomain);

        // Authority check.
        w9011CgmCusNoXRefMaService.validateConsistencyCompAuth(deleteDomain.getLgcyLibCompCd());

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
    protected void validateDatabase(W9011UpdateDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
    }

    /**
     * {@inheritDoc}
     * <pre>
     * This method calls the service to delete 
     * for the NEXUS Consignee Cross reference Standard physical unit.
     * NEXUS荷受人クロスリファレンス原単位を物理削除するサービスを呼び出します。
     * 
     * Process of Delete.
     * - Transfer your delete criteria from deleteDomain
     *   to W9011CgmCusNoXRefMaCriteriaDomain CgmCusNoXRefMa.
     * - Call w9011CgmCusNoXRefMaService.deleteOnInquiryDelete with CgmCusNoXRefMa as an argument.
     * - Return the Delete number.
     *
     * 削除処理。
     * - deleteDomainよりW9011CgmCusNoXRefMaCriteriaDomain CgmCusNoXRefMaに検索条件を移送する。
     * - CgmCusNoXRefMaを引数にw9011CgmCusNoXRefMaService.deleteOnInquiryDeleteを呼び出す。
     * - 削除件数を返却する。
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService
     *     #callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected Integer callServices(W9011UpdateDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {

        int idx = Integer.parseInt(criteriaDomain.getCk()); 

        // Set Condition domain.
        W9011CgmCusNoXRefMaCriteriaDomain CgmCusNoXRefMa = new W9011CgmCusNoXRefMaCriteriaDomain();
        CommonUtil.copyPropertiesDomainToDomain(CgmCusNoXRefMa, criteriaDomain);
        CgmCusNoXRefMa.setLgcyLibCompCd(criteriaDomain.getListDomainList()
            .get(idx).getLgcyLibCompCd());
        CgmCusNoXRefMa.setCustomerCd(criteriaDomain.getListDomainList().get(idx).getCustomerCd());
        CgmCusNoXRefMa.setComUpdateTimestamp(criteriaDomain.getListDomainList()
            .get(idx).getComUpdateTimestamp());

        // Deletion processing.
        int deleteCount = w9011CgmCusNoXRefMaService.deleteOnInquiryDelete(CgmCusNoXRefMa);

        // Return the Delete number.
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
    protected W9011CgmCusNoXRefMaCriteriaDomain createCgmCusNoXRefMaCriteria 
    (W9011UpdateDomain criteriaDomain) {

        W9011CgmCusNoXRefMaCriteriaDomain cgmCusNoXRefMaCriteria 
            = new W9011CgmCusNoXRefMaCriteriaDomain();

        // Copy the search criteria.
        CommonUtil.copyPropertiesDomainToDomain(cgmCusNoXRefMaCriteria, criteriaDomain);

        int idx = Integer.parseInt(criteriaDomain.getCk()); 
        cgmCusNoXRefMaCriteria.setLgcyLibCompCd(criteriaDomain.getListDomainList()
            .get(idx).getLgcyLibCompCd());

        return cgmCusNoXRefMaCriteria;
    }

}
