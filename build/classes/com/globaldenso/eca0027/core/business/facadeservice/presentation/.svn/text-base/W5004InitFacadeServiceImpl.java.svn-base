/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W5001;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W5001ShippingFirmCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W5001ShippingFirmDomain;
import com.globaldenso.eca0027.core.business.domain.W5004CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W5004ListDomain;
import com.globaldenso.eca0027.core.business.service.W5001ShippingFirmService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CheckUtil;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.PageInfoCreator;
import com.globaldenso.gscm.framework.util.PageInfoData;


/**
 * The Initialize service facade implementation class of Shipping Confirmation Register screen
 * <br />出荷確認Register画面の初期表示facadeサービス実装クラスです。
 * <pre>
 * bean id:w5004InitFacadeService
 * </pre>
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W5004InitFacadeServiceImpl extends
    AbstractSearchFacadeService<List<? extends W5004ListDomain>, W5004CriteriaDomain> {

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
    public W5004InitFacadeServiceImpl() {
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
    protected W5004CriteriaDomain filterDomain(W5004CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {

        return criteriaDomain;
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * - No processing
     *
     * - 処理なし
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W5004CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException, ValidationException {
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * - No processing
     *
     * - 処理なし
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W5004CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException, ValidationException {
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
    protected void validateDatabase(W5004CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException,
        ValidationException {
    }

    /**
     * {@inheritDoc}.
     * Call the service to search for X-Tag/CML that is included in the Shipping Confirmation
     * <br />出荷確認に含まれるX-Tag/CMLを検索するサービスを呼び出します。
     * <pre>
     * - The transfer your search criteria in W5004ShippingFirmCriteriaDomain shippingFirmCriteriaDomain than criteriaDomain
     * - In the case of transition from the Main screen
     *     - The one page get the results of the summary item number in the unit shipping confirmation of creating
     *         Call the W5001ShippingFirmService.searchOnRegisterInitByFromMain an argument shippingFirmCriteriaDomain
     *     - Create a list of lists domain W5004ListDomain search result , return
     *         - Convert W5004UpdateDomain result of a call W5001ShippingFirmService.searchOnRegisterInitByFromMain
     *         - The return a W5004UpdateDomain
     * - In the case of transition from the Create screen
     *     - Stg. Actuality No. is "" In the case of (blank )
     *         - The one page get the results of the summary item number in the unit shipping confirmation of creating
     *             Call the W5001ShippingFirmService.searchOnRegisterInitByFromCreateStgInstr an argument shippingFirmCriteriaDomain
     *         - Create a list of lists domain W5004ListDomain search result , return
     *             - Convert W5004UpdateDomain result of a call W5001ShippingFirmService.searchOnRegisterInitByFromCreate
     *             - The return a list of W5004UpdateDomain
     *     - If Stg. Actuality No. is "" not a (blank)
     *         - The one page get the results of the summary item number in the unit shipping confirmation of creating
     *             Call the W5001ShippingFirmService.searchOnRegisterInitByFromCreateStgAct an argument shippingFirmCriteriaDomain
     *         - Create a list of lists domain W5004ListDomain search result , return
     *             - Convert W5004UpdateDomain result of a call W5001ShippingFirmService.searchOnRegisterInitByFromCreate
     *             - The return a list of W5004UpdateDomain
     *
     * - criteriaDomainよりW5004ShippingFirmCriteriaDomain shippingFirmCriteriaDomainに検索条件を移送
     * - Main画面から遷移の場合
     *     - 作成中の出荷確認を品目番号単位にサマリした結果を1ページ分取得
     *           shippingFirmCriteriaDomainを引数にW5001ShippingFirmService.searchOnRegisterInitByFromMainの呼び出し
     *     - 検索結果リストドメインW5004ListDomainのリストを作成し、返却
     *           - W5001ShippingFirmService.searchOnRegisterInitByFromMainの呼び出し結果をW5004UpdateDomainに変換
     *           - W5004UpdateDomainのリストを返却
     * - Create画面から遷移の場合
     *     - Stg. Actuality No.が""(空白)の場合
     *         - 作成中の出荷確認を品目番号単位にサマリした結果を1ページ分取得
     *               shippingFirmCriteriaDomainを引数にW5001ShippingFirmService.searchOnRegisterInitByFromCreateStgInstrの呼び出し
     *         - 検索結果リストドメインW5004ListDomainのリストを作成し、返却
     *               - W5001ShippingFirmService.searchOnRegisterInitByFromCreateの呼び出し結果をW5004UpdateDomainに変換
     *               - W5004UpdateDomainのリストを返却
     *     - Stg. Actuality No.が""(空白)でない場合
     *         - 作成中の出荷確認を品目番号単位にサマリした結果を1ページ分取得
     *               shippingFirmCriteriaDomainを引数にW5001ShippingFirmService.searchOnRegisterInitByFromCreateStgActの呼び出し
     *         - 検索結果リストドメインW5004ListDomainのリストを作成し、返却
     *               - W5001ShippingFirmService.searchOnRegisterInitByFromCreateの呼び出し結果をW5004UpdateDomainに変換
     *               - W5004UpdateDomainのリストを返却
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected List<? extends W5004ListDomain> callServices(W5004CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {
        
        // Create a search condition domain.
        // 検索条件ドメインの作成
        W5001ShippingFirmCriteriaDomain shippingFirmCriteria = createShippingFirmCriteria(criteriaDomain);
        
        if (SCREEN_ID_W5001.equals(criteriaDomain.getCallScreenId())) {
            // Transition from the Main screen.
            // Main画面からの遷移
            
            // Search of shipping confirmation.
            // 出荷確認の検索
            W5001ShippingFirmDomain shippingFirm = searchOnRegisterInitByFromMain(shippingFirmCriteria);
            
            return w5001ShippingFirmService.convertToListDomain(shippingFirm, criteriaDomain);
        } else {
            // Transition from the Create screen
            // Create画面からの遷移
            
            // Search of shipping confirmation.
            // 出荷確認の検索
            W5001ShippingFirmDomain shippingFirm = new W5001ShippingFirmDomain();
            if (CheckUtil.isBlankOrNull(shippingFirmCriteria.getStgActNo())) {
                shippingFirm = searchOnRegisterInitByFromCreateStgInstr(shippingFirmCriteria);
            } else {
                shippingFirm = searchOnRegisterInitByFromCreateStgAct(shippingFirmCriteria);
            }
            
            return w5001ShippingFirmService.convertToListDomain(shippingFirm, criteriaDomain);
        }
    }
    

    /**
     * Create the search criteria domain of shipping confirmation service.(Transition from the Main screen)
     * <br />出荷確認サービスの検索条件ドメインを作成します。(Main画面からの遷移時)
     * <pre> 
     * - Create a search condition domain W5004CriteriaDomain, return
     *
     * - 検索条件ドメインW5004CriteriaDomainを作成し、返却
     * </pre>
     *
     * @param criteriaDomain criteria domain
     * @return W5001ShippingFirmCriteriaDomain
     */
    protected W5001ShippingFirmCriteriaDomain createShippingFirmCriteria(W5004CriteriaDomain criteriaDomain) {
        W5001ShippingFirmCriteriaDomain shippingFirmCriteria = new W5001ShippingFirmCriteriaDomain();
        
        CommonUtil.copyPropertiesDomainToDomain(shippingFirmCriteria, criteriaDomain);
        
        return shippingFirmCriteria;
    }

    /**
     * Set the search scope.
     * <br />検索範囲を設定する。
     * <pre> 
     * - Set the search scope to stgCriteria.
     *
     * - stgCriteriaに検索範囲を設定する。
     * </pre>
     *
     * @param pageInfoCreator page info creator
     * @param count count
     * @param shippingFirmCriteria shipping firm criteria
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
     * Search for CML that is included in the shipping confirmation.(Transition from the Main screen)
     * <br />出荷確認に含まれるCMLを検索する。(Main画面からの遷移時)
     * <pre> 
     * - Search for CML that is included in the shipping confirmation to the argument shippingFirmCriteriaDomain.
     *
     * - shippingFirmCriteriaDomainを引数に出荷確認に含まれるCMLを検索する。
     * </pre>
     *
     * @param shippingFirmCriteriaDomain search criteria domain
     * @throws ApplicationException ApplicationException
     * @return search result
     */
    protected W5001ShippingFirmDomain searchOnRegisterInitByFromMain(W5001ShippingFirmCriteriaDomain shippingFirmCriteriaDomain) 
        throws ApplicationException {
        return w5001ShippingFirmService.searchOnRegisterInitByFromMain(shippingFirmCriteriaDomain);
    }

    /**
     * Search for CML that is included in the instructions to Nisoroe argument shippingFirmCriteriaDomain.(Transition from the Create screen)(If Stg. Actuality No. is blank)
     * <br />荷揃え指示に含まれるCMLを検索する。(Create画面からの遷移時)(Stg. Actuality No.が""(空白)の場合)
     * <pre> 
     * - Search the shipping confirmation to the argument stgCriteria.
     *
     * - shippingFirmCriteriaDomainを引数に荷揃え指示に含まれるCMLを検索する。
     * </pre>
     *
     * @param shippingFirmCriteriaDomain search criteria domain
     * @throws ApplicationException ApplicationException
     * @return search result
     */
    protected W5001ShippingFirmDomain searchOnRegisterInitByFromCreateStgInstr(W5001ShippingFirmCriteriaDomain shippingFirmCriteriaDomain) 
        throws ApplicationException {
        return w5001ShippingFirmService.searchOnRegisterInitByFromCreateStgInstr(shippingFirmCriteriaDomain);
    }

    /**
     * Search for X-Tag/CML contained in mountain making track record.(Transition from the Create screen)(If Stg. Actuality No. is not blank)
     * <br />山作り実績に含まれるX-Tag/CMLを検索する。(Create画面からの遷移時)(Stg. Actuality No.が""(空白)でない場合)
     * <pre> 
     * - Search for X-Tag/CML contained in mountain track record in making the argument shippingFirmCriteriaDomain.
     *
     * - shippingFirmCriteriaDomainを引数に山作り実績に含まれるX-Tag/CMLを検索する。
     * </pre>
     *
     * @param shippingFirmCriteriaDomain search criteria domain
     * @throws ApplicationException ApplicationException
     * @return search result
     */
    protected W5001ShippingFirmDomain searchOnRegisterInitByFromCreateStgAct(W5001ShippingFirmCriteriaDomain shippingFirmCriteriaDomain) 
        throws ApplicationException {
        return w5001ShippingFirmService.searchOnRegisterInitByFromCreateStgAct(shippingFirmCriteriaDomain);
    }
}
