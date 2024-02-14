/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0004;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import org.apache.commons.lang.StringUtils;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W9009UpdateDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W9009CgmShipToXRefMaCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W9009CgmShipToXRefMaService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractDeleteFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 * The delete service facade implementation class of CIGMA Ship to X-Reference MA Inquiry
 * Screen.
 * <br />CIGMA Ship to X-Reference MA Inquiry画面の削除facadeサービス実装クラスです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W9009DeleteFacadeServiceImpl 
    extends AbstractDeleteFacadeService<Integer, W9009UpdateDomain>{

    /**
    * w9009CgmShipToXRefMaService/w9009CgmShipToXRefMaサービス
    */
    protected W9009CgmShipToXRefMaService w9009CgmShipToXRefMaService;

    /**
     * Default constructor./デフォルトコンストラクタ。
     */
    public W9009DeleteFacadeServiceImpl() {
    }

    /**
     * Setter method for w9009CgmShipToXRefMaService.
     *
     * @param w9009CgmShipToXRefMaService Set for w9009CgmShipToXRefMaService
     */
    public void setW9009CgmShipToXRefMaService(W9009CgmShipToXRefMaService w9009CgmShipToXRefMaService) {
        this.w9009CgmShipToXRefMaService = w9009CgmShipToXRefMaService;
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
    protected W9009UpdateDomain filterDomain(W9009UpdateDomain criteriaDomain)
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
    protected void validateItems(W9009UpdateDomain criteriaDomain) throws GscmApplicationException,
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
     *    calls the method to w9009CgmShipToXRefMaService.validateConsistencyCompAuth(String).
     * 
     * - 検索条件を取得
     * - 権限チェック
     *      w9009CgmShipToXRefMaService.validateConsistencyCompAuth(String)を呼び出す。
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService
     *     #validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W9009UpdateDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {

        // Get the search criteria.
        W9009CgmShipToXRefMaCriteriaDomain deleteDomain 
            = createW9009CgmShipToXRefMaCriteria(criteriaDomain);

        // Authority check.
        w9009CgmShipToXRefMaService.validateConsistencyCompAuth(deleteDomain.getLgcyLibCompCd());

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
    protected void validateDatabase(W9009UpdateDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
    }

    /**
     * {@inheritDoc}
     * <pre>
     * This method calls the service to delete 
     * for the NEXUS Ship to Cross reference Standard physical unit.
     * NEXUS送荷先クロスリファレンス原単位を物理削除するサービスを呼び出します。
     * 
     * Process of Delete.
     * - Transfer your delete criteria from deleteDomain
     *   to W9009CgmShipToXRefMaCriteriaDomain W9009CgmShipToXRefMa.
     * - Call w9009CgmShipToXRefMaService.deleteOnInquiryDelete with W9009CgmShipToXRefMa as an argument.
     * - Return the Delete number.
     *
     * 削除処理。
     * - deleteDomainよりW9009CgmShipToXRefMaCriteriaDomain W9009CgmShipToXRefMaに検索条件を移送する。
     * - W9009CgmShipToXRefMaを引数にw9009CgmShipToXRefMaService.deleteOnInquiryDeleteを呼び出す。
     * - 削除件数を返却する。
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService
     *     #callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected Integer callServices(W9009UpdateDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {

        int idx = Integer.parseInt(criteriaDomain.getCk()); 

        // Set Condition domain.
        W9009CgmShipToXRefMaCriteriaDomain W9009CgmShipToXRefMa = new W9009CgmShipToXRefMaCriteriaDomain();
        CommonUtil.copyPropertiesDomainToDomain(W9009CgmShipToXRefMa, criteriaDomain);
        W9009CgmShipToXRefMa.setLgcyLibCompCd(criteriaDomain.getListDomainList()
            .get(idx).getLgcyLibCompCd());
        W9009CgmShipToXRefMa.setCustomerCd(criteriaDomain.getListDomainList().get(idx).getCustomerCd());
        W9009CgmShipToXRefMa.setLgcyShipTo(criteriaDomain.getListDomainList().get(idx).getLgcyShipTo());
        W9009CgmShipToXRefMa.setComUpdateTimestamp(criteriaDomain.getListDomainList()
            .get(idx).getComUpdateTimestamp());

        // Deletion processing.
        int deleteCount = w9009CgmShipToXRefMaService.deleteOnInquiryDelete(W9009CgmShipToXRefMa);

        //Return the Delete number.
        return deleteCount;
    }

    /**
     * Based on (PL) domain search criteria, you can create search criteria domain (BL).
     * 検索条件ドメイン(PL)を基に、検索条件ドメイン(BL)を作成します。
     * 
     * - Set screen ID, and locale.
     * - Copy the search criteria.
     * 
     * - 画面ID, ロケールを設定。
     * - 検索条件をコピー
     * 
     * @param criteriaDomain 画面の検索条件ドメイン(PL)
     * @return User Id MA Editサービスの検索条件ドメイン(BL)
     */
    protected W9009CgmShipToXRefMaCriteriaDomain createW9009CgmShipToXRefMaCriteria 
    (W9009UpdateDomain criteriaDomain) {
        
        W9009CgmShipToXRefMaCriteriaDomain w9009CgmShipToXRefMaCriteria = new W9009CgmShipToXRefMaCriteriaDomain();
        
        // Set screen ID, and locale.
        w9009CgmShipToXRefMaCriteria.setScreenId(criteriaDomain.getScreenId());
        w9009CgmShipToXRefMaCriteria.setLocale(new Locale(criteriaDomain.getLanguageCd()));
        
        // Copy the search criteria.
        CommonUtil.copyPropertiesDomainToDomain(w9009CgmShipToXRefMaCriteria, criteriaDomain);
        int idx = Integer.parseInt(criteriaDomain.getCk()); 
        w9009CgmShipToXRefMaCriteria.setLgcyLibCompCd(criteriaDomain.getListDomainList()
            .get(idx).getLgcyLibCompCd());
        
        return w9009CgmShipToXRefMaCriteria;
    }
}
