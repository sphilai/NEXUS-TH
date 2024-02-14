/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0031;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W5001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ISSUER_ID_YOURSELF;

import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W5001CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W5001ListDomain;
import com.globaldenso.eca0027.core.business.domain.W5001ShippingFirmCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W5001ShippingFirmDomain;
import com.globaldenso.eca0027.core.business.service.W5001ShippingFirmService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.DateUtil;
import com.globaldenso.gscm.framework.util.PageInfoCreator;
import com.globaldenso.gscm.framework.util.PageInfoData;
import com.globaldenso.gscm.framework.util.Validator;


/**
 * The Search service facade implementation class of Shipping Confirmation Main screen
 * <br />出荷確認Main画面の検索facadeサービス実装クラスです。
 * <pre>
 * bean id:w5001SearchFacadeService
 * </pre>
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W5001SearchFacadeServiceImpl extends
    AbstractSearchFacadeService<List<W5001ListDomain>, W5001CriteriaDomain> {

    /**
     * common service.
     */
    protected CommonService commonService;
    
    /**
     * shipping confirm service.
     */
    protected W5001ShippingFirmService w5001ShippingFirmService;
    
    /**
     * constructor.
     */
    public W5001SearchFacadeServiceImpl() {
    }

    /**
     * Setter method for commonService.
     *
     * @param commonService Set for commonService
     */
    public void setCommonService(CommonService commonService) {
        this.commonService = commonService;
    }

    /**
     * Setter method for w5001ShippingFirmService.
     *
     * @param w5001ShippingFirmService Set for w5001ShippingFirmService
     */
    public void setW5001ShippingFirmService(W5001ShippingFirmService w5001ShippingFirmService) {
        this.w5001ShippingFirmService = w5001ShippingFirmService;
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * - No processing
     *
     * - 処理なし
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W5001CriteriaDomain filterDomain(W5001CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {

        return criteriaDomain;
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * - Common error checking
     *
     * - 共通エラーチェック
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W5001CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException, ValidationException {
        
        Validator<W5001CriteriaDomain> valid 
            = new Validator<W5001CriteriaDomain>(criteriaDomain, "w5001CriteriaDomain");
        
        // Set the label name still need to be examined.
        // チェックが必要なラベル名を設定する。
        String[] properties = {
            "whCompCd",
            "whCd",
            "containerSortingKey",
            "shippingFirmNo",
            "fmEtd",
            "toEtd",
            "carrierCompCd",
            "containerNo"
        };
        valid.isValidateProperties(properties, SCREEN_ID_W5001);
        
        // Confirmation of error.
        // エラー確認
        if (0 < valid.getErrList().size()) {
            throw new ValidationException(valid.getErrList());
        }
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * - The transfer your search criteria in ShippingFirmDomain shippingFirmDomain than criteriaDomain 
     * - Correlation check of To - From date 
     *     An argument shippingFirmDomain, check by calling W5001ShippingFirmService.validateConsistencyFmEtdToEtd
     *
     * - criteriaDomainよりW5001ShippingFirmCriteriaDomain shippingFirmCriteriaDomainに検索条件を移送
     * - 日付 From - To の相関チェック
     *    shippingFirmCriteriaDomainを引数に、W5001ShippingFirmService.validateConsistencyFmEtdToEtdを呼び出してチェック
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W5001CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException, ValidationException {
        
        List<MessageDomain> errList = new ArrayList<MessageDomain>();
        
        // Get depart date.
        // 出発予定日を取得
        String fmEtd = criteriaDomain.getFmEtd();
        String toEtd = criteriaDomain.getToEtd();
        
        // Get the date format
        // 日付フォーマットの取得
        String dateFormat = criteriaDomain.getScreenDateFormat();
        
        // Correlation check of depart date.
        // 出発予定日の相関チェック
        if (!w5001ShippingFirmService.validateConsistencyFmEtdToEtd(fmEtd, toEtd, dateFormat)) {
            Object[] params = {
                commonService.getResource(criteriaDomain.getLocale(), "label.fmEtd")
            };
            MessageDomain msgFmEtd = new MessageDomain("w5001CriteriaDomain.fmEtd", GSCM_E0_0031, params);
            MessageDomain msgToEtd = new MessageDomain("w5001CriteriaDomain.toEtd", null, null);
            
            errList.add(msgFmEtd);
            errList.add(msgToEtd);
        }
        
        // Confirmation of error.
        // エラー確認
        if (0 < errList.size()) {
            throw new ValidationException(errList);
        }
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * - No processing
     *
     * - 処理なし
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W5001CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException,
        ValidationException {
    }

    /**
     * {@inheritDoc}.
     * Call the service to search for Shipping Confirmation
     * <br />出荷確認を検索するサービスを呼び出します。
     * <pre>
     * - The transfer your search criteria in W5001ShippingFirmCriteriaDomain shippingFirmCriteriaDomain than criteriaDomain 
     * - Get the number of searches 
     *     The call of W5001ShippingFirmService.searchCountOnMainSearch an argument shippingFirmCriteriaDomain 
     * - Calculate the search range corresponding to the requested page 
     *     From that was obtained by using the PageInfoData, set to the to shippingFirmCriteriaDomain 
     * - The one page get a search result of shipping confirmation 
     *     The call of W5001ShippingFirmService.searchForPagingOnMainSearch an argument shippingFirmCriteriaDomain 
     * - Create a list of lists domain W5001ListDomain search result, return 
     *     - Convert list of W5001ListDomain result of a call W5001ShippingFirmService.searchForPagingOnMainSearch 
     *     - The return a list of W5001ListDomain
     *
     * - criteriaDomainよりW5001ShippingFirmCriteriaDomain shippingFirmCriteriaDomainに検索条件を移送
     * - 検索件数の取得
     *       shippingFirmCriteriaDomainを引数にW5001ShippingFirmService.searchCountOnMainSearchの呼び出し
     * - 要求ページに対応する検索範囲を算出
     *       PageInfoDataを使用し取得したfrom, toをshippingFirmCriteriaDomainに設定
     * - 出荷確認の検索結果を1ページ分取得
     *       shippingFirmCriteriaDomainを引数にW5001ShippingFirmService.searchForPagingOnMainSearchの呼び出し
     * - 検索結果リストドメインW5001ListDomainのリストを作成し、返却
     *       - W5001ShippingFirmService.searchForPagingOnMainSearchの呼び出し結果をW5001ListDomainのリストに変換
     *       - W5001ListDomainのリストを返却
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected List<W5001ListDomain> callServices(W5001CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {
        
        // Create a search condition domain.
        // 検索条件ドメインの作成
        W5001ShippingFirmCriteriaDomain shippingFirmCriteria = createShippingFirmCriteria(criteriaDomain);
        
        // Get the count of searches.
        // 検索件数の取得
        int count = searchShippingFirmCount(shippingFirmCriteria);
        
        // Set the search range.
        // 検索範囲の設定
        setPageInfo(criteriaDomain.getPageInfoCreator(), count, shippingFirmCriteria);
        
        // Search of shipping confirmation.
        // 出荷確認の検索
        List<? extends W5001ShippingFirmDomain> shippingFirmList = searchShippingFirm(shippingFirmCriteria);
        
        // Conversion to list domain.
        // リストドメインへの変換
        return convertToListDomain(shippingFirmList, criteriaDomain.getScreenDateFormat());
    }
    
    /**
     * Create the search criteria domain of shipping confirmation service
     * <br />出荷確認サービスの検索条件ドメインを作成します。
     * <pre> 
     * - Create a search condition domain W5001ShippingFirmCriteriaDomain, return
     *
     * - 検索条件ドメインW5001ShippingFirmCriteriaDomainを作成し、返却
     * </pre>
     *
     * @param criteriaDomain criteria domain
     * @return W5001ShippingFirmCriteriaDomain
     */
    protected W5001ShippingFirmCriteriaDomain createShippingFirmCriteria(W5001CriteriaDomain criteriaDomain) {
        W5001ShippingFirmCriteriaDomain shippingFirmCriteria = new W5001ShippingFirmCriteriaDomain();
        
        CommonUtil.copyPropertiesDomainToDomain(shippingFirmCriteria, criteriaDomain, criteriaDomain.getScreenDateFormat());
        
        if (ISSUER_ID_YOURSELF.equals(criteriaDomain.getShippingFirmIssuerId())) {
            shippingFirmCriteria.setShippingFirmIssuerId(criteriaDomain.getLoginUserDscId());
        }
        
        if (ISSUER_ID_YOURSELF.equals(criteriaDomain.getWorkedIssuerId())) {
            shippingFirmCriteria.setWorkedIssuerId(criteriaDomain.getLoginUserDscId());
        }
        
        return shippingFirmCriteria;
    }

    /**
     * Get the number of searches.
     * <br />検索件数を取得する。
     * <pre> 
     * - Get the number of searches in the argument W5001ShippingFirmCriteriaDomain.
     *
     * - W5001ShippingFirmCriteriaDomainを引数に検索件数を取得する。
     * </pre>
     *
     * @param shippingFirmCriteria shipping confirm criteria
     * @throws ApplicationException ApplicationException
     * @return Search count
     */
    protected int searchShippingFirmCount(W5001ShippingFirmCriteriaDomain shippingFirmCriteria) 
        throws ApplicationException {
        return w5001ShippingFirmService.searchCountForPagingOnMainSearch(shippingFirmCriteria);
    }

    /**
     * Set the search scope.
     * <br />検索範囲を設定する。
     * <pre> 
     * - Set the search scope to shippingFirmCriteria.
     *
     * - shippingFirmCriteriaに検索範囲を設定する。
     * </pre>
     *
     * @param pageInfoCreator page info creator
     * @param count count
     * @param shippingFirmCriteria shipping confirm criteria
     * @throws ApplicationException ApplicationException
     */
    protected void setPageInfo(PageInfoCreator pageInfoCreator, int count, W5001ShippingFirmCriteriaDomain shippingFirmCriteria) 
        throws ApplicationException {
        
        // Get information page.
        // ページ情報の取得
        PageInfoData pageInfoData = pageInfoCreator.createPageInfoData(count, null, null, shippingFirmCriteria.getLocale());
        
        // Set the start and end position in the search condition domain.
        // 検索条件ドメインに開始・終了位置を設定
        shippingFirmCriteria.setRowNumFrom(pageInfoData.getFromCount());
        shippingFirmCriteria.setRowNumTo(pageInfoData.getToCount());
    }

    /**
     * Search the shipping confirmation.
     * <br />出荷確認を検索する。
     * <pre> 
     * - Search the shipping confirmation to the argument shippingFirmCriteriaDomain.
     *
     * - shippingFirmCriteriaDomainを引数に出荷確認を検索する。
     * </pre>
     *
     * @param shippingFirmCriteriaDomain shipping confirm criteria domain
     * @throws ApplicationException ApplicationException
     * @return List of W5001ShippingFirmDomain
     */
    protected List<? extends W5001ShippingFirmDomain> searchShippingFirm(W5001ShippingFirmCriteriaDomain shippingFirmCriteriaDomain) 
        throws ApplicationException {
        return w5001ShippingFirmService.searchForPagingOnMainSearch(shippingFirmCriteriaDomain);
    }

    /**
     *  The conversion to the format of the screen display for a shipping confirmation domain
     * <br />出荷確認ドメインを画面表示用のフォーマットに変換する。
     * <pre> 
     * - Convert to screen for display W5001ListDomain.
     *
     * - W5001ListDomainを画面表示用に変換する。
     * </pre>
     *
     * @param shippingFirmList shipping firm list
     * @param dateFormat Format for a date
     * @return List of W5001ListDomain
     */
    protected List<W5001ListDomain> convertToListDomain(List<? extends W5001ShippingFirmDomain> shippingFirmList, String dateFormat) {
        List<W5001ListDomain> listDomainList = new ArrayList<W5001ListDomain>();
        
        if (shippingFirmList != null) {
            for (W5001ShippingFirmDomain shippingFirm : shippingFirmList) {
                W5001ListDomain listDomain = new W5001ListDomain();
                
                CommonUtil.copyPropertiesDomainToDomain(listDomain, shippingFirm);
                
                // Format conversion of the shipping due date
                // 出荷予定日のフォーマット変換
                String etd = DateUtil.formatDate(shippingFirm.getEtd(), dateFormat);
                listDomain.setEtd(etd);
                
                // Format conversion of shipping date confirmed
                // 出荷確認日のフォーマット変換
                String shippingFirmDt = DateUtil.formatDate(shippingFirm.getShippingFirmDt(), dateFormat);
                listDomain.setShippingFirmDt(shippingFirmDt);
                
                // Format conversion of Shipping Date
                // 出荷実績日のフォーマット変換
                String workedDt = DateUtil.formatDate(shippingFirm.getWorkedDt(), dateFormat);
                listDomain.setWorkedDt(workedDt);
                
                listDomainList.add(listDomain);
            }
        }
        
        return listDomainList;
    }
}
