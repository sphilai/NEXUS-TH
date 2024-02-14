/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0003;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W1006;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SEARCH_MAX_COUNT;

import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W1006CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W1006ExpRequestDomain;
import com.globaldenso.eca0027.core.business.domain.W1006ExpRequestDtlDomain;
import com.globaldenso.eca0027.core.business.domain.W1006ExpRequestDtlKitDomain;
import com.globaldenso.eca0027.core.business.domain.W1006ListDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W1006ExpRequestCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W1006ExpRequestDtlCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W1006ExpRequestDtlKitCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W1006ExpRequestDtlKitService;
import com.globaldenso.eca0027.core.business.service.W1006ExpRequestDtlService;
import com.globaldenso.eca0027.core.business.service.W1006ExpRequestService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.PageInfoCreator;
import com.globaldenso.gscm.framework.util.PageInfoData;
import com.globaldenso.gscm.framework.util.Validator;
/**
 * The Search service facade implementation class of a Export Request [Register & Print Request] Main screen.
 * <br />荷揃え指示Register画面の登録facadeサービス実装クラスです。
 *
 * @author $Author: masaki_awata@dnitsol.com $
 * @version $Revision: 5446 $
 */
public class W1006SearchFacadeServiceImpl extends AbstractSearchFacadeService<List<? extends W1006ListDomain>, W1006CriteriaDomain> {
    /**
     * Common service
     * <br />共通サービス
     */
    protected CommonService commonService;
    /**
     * W1006ExpRequest service
     * <br />共通サービス
     */
    protected W1006ExpRequestService w1006ExpRequestService;
    /**
     * W1006ExpRequestDtl service
     * <br />共通サービス
     */
    protected W1006ExpRequestDtlService w1006ExpRequestDtlService;
    /**
     * W1006ExpRequestDtlKit service
     * <br />共通サービス
     */
    protected W1006ExpRequestDtlKitService w1006ExpRequestDtlKitService;
    /**
     * constructor
     * <br />デフォルトコンストラクタ
     */
    public W1006SearchFacadeServiceImpl() {
    }

    /**
     * <p>Setter method for w1006ExpRequestService.</p>
     *
     * @param expRequestService Set for w1006ExpRequestService
     */
    public void setW1006ExpRequestService(W1006ExpRequestService expRequestService) {
        w1006ExpRequestService = expRequestService;
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
     * Setter method for w1006ExpRequestDtlService.
     *
     * @param w1006ExpRequestDtlService Set for W1006ExpRequestDtlService
     */
    public void setW1006ExpRequestDtlService(W1006ExpRequestDtlService w1006ExpRequestDtlService) {
        this.w1006ExpRequestDtlService = w1006ExpRequestDtlService;
    }
    /**
     * Setter method for w1006ExpRequestDtlService.
     *
     * @param w1006ExpRequestDtlKitService Set for W1006ExpRequestDtlKitService
     */
    public void setW1006ExpRequestDtlKitService(W1006ExpRequestDtlKitService w1006ExpRequestDtlKitService) {
        this.w1006ExpRequestDtlKitService = w1006ExpRequestDtlKitService;
    }
    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - retrieval-result-data acquisition
     * </pre>
     * <pre>
     * - 検索結果データ取得
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected List<? extends W1006ListDomain> callServices(W1006CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {
        // TODO Auto-generated method stub
        // Create of a search-condition domain
        // 検索条件ドメインの作成
        List<? extends W1006ExpRequestDtlDomain>expRequestDtlList = null;
        List<? extends W1006ExpRequestDtlKitDomain>expRequestDtlKitList = null;
        // Search request status
        W1006ExpRequestCriteriaDomain w1006ExpRequestCriteriaDomain = new W1006ExpRequestCriteriaDomain();
        w1006ExpRequestCriteriaDomain.setExpRequestNo(criteriaDomain.getExpRequestNo());
        W1006ExpRequestDomain result = w1006ExpRequestService.searchByKey(w1006ExpRequestCriteriaDomain);
        if(result != null && result.getRequestStatus() != null ){
            criteriaDomain.setRequestStatus(  Integer.parseInt(result.getRequestStatus() ));
        }else{
            criteriaDomain.setRequestStatus(0);
        }
        
        // Criteria set up
        W1006ExpRequestDtlCriteriaDomain criteria = createCriteria(criteriaDomain);
        // Kit dropdown = 'N'
        if("N".equals(criteria.getKit()))
        {
            // Convert blank to null
            criteria = convertBlankToNull(criteria);
            // Acquisition of the search number
            // 検索件数の取得
            int count = searchCount(criteria);
            
            // Setting of the search range
            // 検索範囲の設定
            setPageInfo(criteriaDomain.getPageInfoCreator(), count, criteria);
            
            // Search of a Exp Request
            // 梱包指示の検索
            expRequestDtlList = searchExpRequest(criteria);
            
            expRequestDtlList = expRequestDtlList.subList(criteria.getRowNumFrom() - 1, criteria.getRowNumTo());
            // Converted in a list domain
            // リストドメインへの変換
            return convertToListDomain(expRequestDtlList, criteriaDomain);
        }else if("Y".equals(criteria.getKit())){  // Kit dropdown = 'Y'
            // Criteria set up
            W1006ExpRequestDtlKitCriteriaDomain kitCriteria = createKitCriteria(criteriaDomain);
            // Convert blank to null
            kitCriteria = convertKitBlankToNull(kitCriteria);
            if((kitCriteria.getFmLine() != null && kitCriteria.getFmLine().trim().length() > 0) || kitCriteria.getToLine() != null && kitCriteria.getToLine().trim().length() > 0 )
            {
                // Kit no LineNo so result search is 0
                kitCriteria.setExpRequestNo("-");
                // Acquisition of the search number
                // 検索件数の取得
                int count = searchKitCount(kitCriteria);
                
                // Setting of the search range
                // 検索範囲の設定
                setPageKitInfo(criteriaDomain.getPageInfoCreator(), count, kitCriteria);
                // Search of a Kit Exp Request
                // 梱包指示の検索
                expRequestDtlKitList = searchExpRequestKit(kitCriteria);
                
                expRequestDtlKitList = expRequestDtlKitList.subList(kitCriteria.getRowNumFrom() - 1, kitCriteria.getRowNumTo());
            }else{
                // Acquisition of the search number
                // 検索件数の取得
                int count = searchKitCount(kitCriteria);
                
                // Setting of the search range
                // 検索範囲の設定
                setPageKitInfo(criteriaDomain.getPageInfoCreator(), count, kitCriteria);
                
                // Search of a Kit Exp Request
                // 梱包指示の検索
                expRequestDtlKitList = searchExpRequestKit(kitCriteria);
                
                expRequestDtlKitList = expRequestDtlKitList.subList(kitCriteria.getRowNumFrom() - 1, kitCriteria.getRowNumTo());
            }
            
            // Converted in a list domain
            // リストドメインへの変換
            return convertKitToListDomain(expRequestDtlKitList, criteriaDomain);
        }else { //Kit dropdown is blank
            // Criteria set up
            // Convert blank to null
            criteria = convertBlankToNull(criteria);
            
            // Setting of the search range
            int count = searchUnionKitCount(criteria);
            
            // Setting of the search range
            // 検索範囲の設定
            setPageInfo(criteriaDomain.getPageInfoCreator(), count, criteria);
            
            // Search union kit exp request
            // 梱包指示の検索
            expRequestDtlList = searchExpRequestKIT(criteria);
            
            expRequestDtlList = expRequestDtlList.subList(criteria.getRowNumFrom() - 1, criteria.getRowNumTo());
            // Converted in a list domain
            // リストドメインへの変換
            return convertParentKitToListDomain(expRequestDtlKitList, expRequestDtlList, criteriaDomain);
        }
    }
    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * No Action
     * </pre>
     * <pre>
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W1006CriteriaDomain filterDomain(W1006CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {
        return criteriaDomain;
    }
    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * No Action
     * </pre>
     * <pre>
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W1006CriteriaDomain filterDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // TODO Auto-generated method stub
        
    }
    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * No Action
     * </pre>
     * <pre>
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W1006CriteriaDomain filterDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // TODO Auto-generated method stub
        
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - Common error checking
     *       Screen definition document_ECA0027_W2001_Palletize Instruction Main Screen.xls "a screen item definition" is referred to for details.
     *       
     * - 共通エラーチェック
     *     詳細は画面定義書_ECA0027_W2001_Palletize Instruction Main Screen.xls「画面項目定義」を参照
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W1006CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        Validator<W1006CriteriaDomain> valid 
            = new Validator<W1006CriteriaDomain>(criteriaDomain, "w1006CriteriaDomain");
        
        String[] properties = {
            "fmLine" ,
            "toLine" 
        };
        if(criteriaDomain.getToLine() != null && !"".equals(criteriaDomain.getToLine())){
            valid.isValidateProperties(properties, SCREEN_ID_W1006);
        }else if(criteriaDomain.getFmLine() != null && criteriaDomain.getFmLine().trim().length() > 0){
            // Validate FmLine
            valid.isValidateProperties(properties, SCREEN_ID_W1006);
        }
        
        // Error check
        // エラー確認
        if (0 < valid.getErrList().size()) {
            throw new ValidationException(valid.getErrList());
        }
    }
    /**
     * Search count item
     * 
     *
     * @param criteria W1006ExpRequestDtlCriteriaDomain
     * @return count int
     * @throws ApplicationException exception
     */
    protected int searchCount(W1006ExpRequestDtlCriteriaDomain criteria) throws ApplicationException {
        return w1006ExpRequestDtlService.searchCount(criteria);
    }
    /**
     * Search count kit item
     * 
     *
     * @param criteria W1006ExpRequestDtlKitCriteriaDomain
     * @return count int
     * @throws ApplicationException exception
     */
    protected int searchKitCount(W1006ExpRequestDtlKitCriteriaDomain criteria) throws ApplicationException {
        return w1006ExpRequestDtlKitService.searchCount(criteria);
    }
    /**
     * Search count union  kit
     * 
     *
     * @param criteria W1006ExpRequestDtlKitCriteriaDomain
     * @return count int
     * @throws ApplicationException exception
     */
    protected int searchUnionKitCount(W1006ExpRequestDtlCriteriaDomain criteria) throws ApplicationException {
        return w1006ExpRequestDtlService.searchCountUnionKit(criteria);
    }
    /**
     * Criteria set up
     * 
     *
     * @param criteriaDomain W1006CriteriaDomain
     * @return criteria W1006ExpRequestDtlCriteriaDomain
     */
    protected W1006ExpRequestDtlCriteriaDomain createCriteria(W1006CriteriaDomain criteriaDomain) {
        W1006ExpRequestDtlCriteriaDomain w1006ExpRequestDtlCriteriaDomain = new W1006ExpRequestDtlCriteriaDomain();
        
        // The setting for acquiring the maximum number
        // 最大件数を取得するための設定
        w1006ExpRequestDtlCriteriaDomain.setScreenId(criteriaDomain.getScreenId());
        w1006ExpRequestDtlCriteriaDomain.setLocale(new Locale(criteriaDomain.getLanguageCd()));
        
        // A search condition is copied.
        // 検索条件をコピー
        CommonUtil.copyPropertiesDomainToDomain(w1006ExpRequestDtlCriteriaDomain, criteriaDomain, criteriaDomain.getScreenDateFormat());
        
        
        return w1006ExpRequestDtlCriteriaDomain;
    }
    /**
     * Criteria kit set up
     * 
     *
     * @param criteriaDomain W1006CriteriaDomain
     * @return criteria W1006ExpRequestDtlKitCriteriaDomain
     */
    protected W1006ExpRequestDtlKitCriteriaDomain createKitCriteria(W1006CriteriaDomain criteriaDomain) {
        W1006ExpRequestDtlKitCriteriaDomain w1006ExpRequestDtlKitCriteriaDomain = new W1006ExpRequestDtlKitCriteriaDomain();
        
        // The setting for acquiring the maximum number
        // 最大件数を取得するための設定
        w1006ExpRequestDtlKitCriteriaDomain.setScreenId(criteriaDomain.getScreenId());
        w1006ExpRequestDtlKitCriteriaDomain.setLocale(new Locale(criteriaDomain.getLanguageCd()));
        
        // A search condition is copied.
        // 検索条件をコピー
        CommonUtil.copyPropertiesDomainToDomain(w1006ExpRequestDtlKitCriteriaDomain, criteriaDomain, criteriaDomain.getScreenDateFormat());
        
        
        return w1006ExpRequestDtlKitCriteriaDomain;
    }
    /**
     * The search range is computed.
     * <br />検索範囲を算出します。
     *
     * @param pageInfoCreator PageInfoCreator object<br />PageInfoCreatorオブジェクト
     * @param count Search number<br />検索件数
     * @param criteria W1006ExpRequestDtlCriteriaDomain
     * @throws ApplicationException When the search range is incalculable<br />検索範囲が計算できない場合
     */
    protected void setPageInfo(PageInfoCreator pageInfoCreator, int count, W1006ExpRequestDtlCriteriaDomain criteria) 
        throws ApplicationException {
        
        // Acquisition of page information
        // ページ情報の取得
        PageInfoData pageInfoData = pageInfoCreator.createPageInfoData(count, null, null, criteria.getLocale());
        
        // A start and end position are set to search-condition domain.
        // 検索条件ドメインに開始・終了位置を設定
        criteria.setRowNumFrom(pageInfoData.getFromCount());
        criteria.setRowNumTo(pageInfoData.getToCount());
    }
    /**
     * The search range is computed.
     * <br />検索範囲を算出します。
     *
     * @param pageInfoCreator PageInfoCreator object<br />PageInfoCreatorオブジェクト
     * @param count Search number<br />検索件数
     * @param criteria W1006ExpRequestDtlKitCriteriaDomain
     * @throws ApplicationException When the search range is incalculable<br />検索範囲が計算できない場合
     */
    protected void setPageKitInfo(PageInfoCreator pageInfoCreator, int count, W1006ExpRequestDtlKitCriteriaDomain criteria) 
        throws ApplicationException {
        
        // Acquisition of page information
        // ページ情報の取得
        PageInfoData pageInfoData = pageInfoCreator.createPageInfoData(count, null, null, criteria.getLocale());
        
        // A start and end position are set to search-condition domain.
        // 検索条件ドメインに開始・終了位置を設定
        criteria.setRowNumFrom(pageInfoData.getFromCount());
        criteria.setRowNumTo(pageInfoData.getToCount());
    }
    /** 
     * Search ExpRequest
     *
     * @param criteria W1006ExpRequestDtlCriteriaDomain
     * @return results List<? extends W1006ExpRequestDtlDomain>
     * @throws ApplicationException When a Exp Request cannot be searched<br />梱包指示が検索できない場合
     */
    protected List<? extends W1006ExpRequestDtlDomain> searchExpRequest(W1006ExpRequestDtlCriteriaDomain criteria) 
        throws ApplicationException {
        return w1006ExpRequestDtlService.searchByCondition(criteria);
    }
    /** 
     * Search ExpRequestKIT
     *
     * @param criteria W1006ExpRequestDtlCriteriaDomain
     * @return results List<? extends W1006ExpRequestDtlDomain>
     * @throws ApplicationException When a Exp Request cannot be searched<br />梱包指示が検索できない場合
     */
    protected List<? extends W1006ExpRequestDtlDomain> searchExpRequestKIT(W1006ExpRequestDtlCriteriaDomain criteria) 
        throws ApplicationException {
        return w1006ExpRequestDtlService.searchKitByCondition(criteria);
    }
    /** 
     * Search ExpRequestKIT
     *
     * @param criteria W1006ExpRequestDtlKitCriteriaDomain
     * @return results List<? extends W1006ExpRequestDtlKitDomain>
     * @throws ApplicationException When a Exp Request cannot be searched<br />梱包指示が検索できない場合
     */
    protected List<? extends W1006ExpRequestDtlKitDomain> searchExpRequestKit(W1006ExpRequestDtlKitCriteriaDomain criteria) 
        throws ApplicationException {
        return w1006ExpRequestDtlKitService.searchByCondition(criteria);
    }
    /**
     * Convert List<? extends W1006ExpRequestDtlDomain> to List<W1006ListDomain>
     *
     * @param expRequestDtlList List<? extends W1006ExpRequestDtlDomain> 
     * @param criteriaDomain W1006CriteriaDomain
     * @return result List<W1006ListDomain>
     * * 変換結果
     * @throws GscmApplicationException GscmApplicationException
     */
    protected List<W1006ListDomain> convertToListDomain(List<? extends W1006ExpRequestDtlDomain> expRequestDtlList, W1006CriteriaDomain criteriaDomain) throws GscmApplicationException {
        List<W1006ListDomain> listDomainList = new ArrayList<W1006ListDomain>();
        if(expRequestDtlList != null && expRequestDtlList.size() > 0){
            for (W1006ExpRequestDtlDomain w1006ExpRequestDtlDomain : expRequestDtlList) {
                W1006ListDomain listDomain = new W1006ListDomain();
                w1006ExpRequestDtlDomain.setItem("");
                //Issue 117
                w1006ExpRequestDtlDomain.setNetWeight(w1006ExpRequestDtlDomain.getNetWeight().multiply(w1006ExpRequestDtlDomain.getQty()).setScale(3, RoundingMode.HALF_UP));
                // Copy of property
                // プロパティのコピー
                CommonUtil.copyPropertiesDomainToDomain(listDomain, w1006ExpRequestDtlDomain);
                listDomain.setRequestStatus(criteriaDomain.getRequestStatus());
                listDomain.setStatus("parent");
                listDomain.setHaveCheckBox(true);
                listDomainList.add(listDomain);
            }
            //Search more than 501 records
            if (SEARCH_MAX_COUNT < listDomainList.size()) {
                // 最大件数超過エラー
                Object[] params = {
                    listDomainList.size(),
                    SEARCH_MAX_COUNT
                };
                throw new GscmApplicationException(GSCM_E0_0003, params);
            }
        }
        return listDomainList;
    }
    /**
     * Convert List<? extends W1006ExpRequestDtlKitDomain> to List<W1006ListDomain>
     * @param criteriaDomain W1006CriteriaDomain
     * @param expRequestDtlKitList List<? extends W1006ExpRequestDtlKitDomain> 
     * @return result List<W1006ListDomain>
     * 変換結果
     * @throws GscmApplicationException GscmApplicationException
     */
    protected List<W1006ListDomain> convertKitToListDomain(List<? extends W1006ExpRequestDtlKitDomain> expRequestDtlKitList, W1006CriteriaDomain criteriaDomain) throws GscmApplicationException {
        List<W1006ListDomain> listDomainList = new ArrayList<W1006ListDomain>();
        if(expRequestDtlKitList != null && expRequestDtlKitList.size() > 0){
            for (W1006ExpRequestDtlKitDomain w1006ExpRequestDtlKitDomain : expRequestDtlKitList) {
                W1006ListDomain listDomain = new W1006ListDomain();
                //Issue 117
                w1006ExpRequestDtlKitDomain.setNetWeight(w1006ExpRequestDtlKitDomain.getNetWeight().multiply(w1006ExpRequestDtlKitDomain.getQty()).setScale(3, RoundingMode.HALF_UP));
                // Copy of property
                // プロパティのコピー
                CommonUtil.copyPropertiesDomainToDomain(listDomain, w1006ExpRequestDtlKitDomain);
                listDomain.setRequestStatus(criteriaDomain.getRequestStatus());
                listDomain.setStatus("child");
                listDomain.setHaveCheckBox(true);
                listDomainList.add(listDomain);
            }
            //Search more than 501 records
            if (SEARCH_MAX_COUNT < listDomainList.size()) {
                // 最大件数超過エラー
                Object[] params = {
                    listDomainList.size(),
                    SEARCH_MAX_COUNT
                };
                throw new GscmApplicationException(GSCM_E0_0003, params);
            }
        }
        return listDomainList;
    }
    /**
     * Convert blank to null
     *
     * @param domain W1006ExpRequestDtlKitCriteriaDomain 
     * @return domain W1006ExpRequestDtlKitCriteriaDomain
     */
    protected W1006ExpRequestDtlKitCriteriaDomain convertKitBlankToNull(W1006ExpRequestDtlKitCriteriaDomain domain)
    {
        if(domain != null && "".equals(domain.getItemNo()) )
        {
            domain.setItemNo(null);            
        }
        if(domain != null && "".equals(domain.getDescription()) )
        {
            domain.setDescription(null);            
        } 
        if(domain != null && "".equals(domain.getFmLine()) )
        {
            domain.setFmLine(null);            
        }
        if(domain != null && "".equals(domain.getToLine()) )
        {
            domain.setToLine(null);            
        }
        return domain;
    }
    /**
     * Convert blank to null
     *
     * @param domain W1006ExpRequestDtlCriteriaDomain 
     * @return domain W1006ExpRequestDtlCriteriaDomain
     */
    protected W1006ExpRequestDtlCriteriaDomain convertBlankToNull(W1006ExpRequestDtlCriteriaDomain domain)
    {
        if(domain != null && "".equals(domain.getItemNo()) )
        {
            domain.setItemNo(null);            
        }
        if(domain != null && "".equals(domain.getDescription()) )
        {
            domain.setDescription(null);            
        }
        if(domain != null && "".equals(domain.getFmLine()) )
        {
            domain.setFmLine(null);            
        }
        if(domain != null && "".equals(domain.getToLine()) )
        {
            domain.setToLine(null);            
        }
        return domain;
    }
    /**
     * Convert List<? extends W1006ExpRequestDtlKitDomain> to List<W1006ListDomain>
     *
     * @param expRequestDtlKitList List<? extends W1006ExpRequestDtlKitDomain> 
     * @param expRequestDtlList List<? extends W1006ExpRequestDtlDomain> 
     * @param criteriaDomain W1006CriteriaDomain
     * @return listDomainList List<W1006ListDomain>
     * 変換結果
     * @throws GscmApplicationException GscmApplicationException
     */
    protected List<W1006ListDomain> convertParentKitToListDomain(List<? extends W1006ExpRequestDtlKitDomain> expRequestDtlKitList, List<? extends W1006ExpRequestDtlDomain> expRequestDtlList, W1006CriteriaDomain criteriaDomain) throws GscmApplicationException {
        List<W1006ListDomain> listDomainList = new ArrayList<W1006ListDomain>();
        int index = -1;
        int parentIndex = 0;
        int count = 0;
        if (expRequestDtlList != null && expRequestDtlList.size() > 0) {
            for (W1006ExpRequestDtlDomain w1006ExpRequestDtlDomain : expRequestDtlList) {
                W1006ListDomain listDomain = new W1006ListDomain();
                // Setting item 
                if(w1006ExpRequestDtlDomain.getLineNo() != null && w1006ExpRequestDtlDomain.getLineNo().intValue() > 0 )
                {
                    w1006ExpRequestDtlDomain.setStatus("parent");
                    w1006ExpRequestDtlDomain.setHaveCheckBox(true);
                    w1006ExpRequestDtlDomain.setItem("");
                    index = count;
                    parentIndex = index;
                }else{
                    if(index > -1)
                    {
                        if(listDomainList.size() > index){
                            W1006ListDomain domain = (W1006ListDomain)listDomainList.get(index);
                            domain.setHaveCheckBox(false);
                            if(domain.getNoOfChild() == null || "".equals(domain.getNoOfChild()))
                            {
                                domain.setNoOfChild("1");
                            }else{
                                domain.setNoOfChild(String.valueOf(Integer.parseInt(domain.getNoOfChild()) + 1));
                            }
                        }
                        index = -1;
                    }else{
                        if(listDomainList.size() > parentIndex){
                            W1006ListDomain domain = (W1006ListDomain)listDomainList.get(parentIndex);
                            if(domain.getNoOfChild() == null || "".equals(domain.getNoOfChild()))
                            {
                                domain.setNoOfChild("1");
                            }else{
                                domain.setNoOfChild(String.valueOf(Integer.parseInt(domain.getNoOfChild()) + 1));
                            }
                        }
                    }
                    // Setting kit item 
                    w1006ExpRequestDtlDomain.setStatus("child");
                    w1006ExpRequestDtlDomain.setNoOfChild("");
                    w1006ExpRequestDtlDomain.setHaveCheckBox(true);
                }
                //Issue 117
                w1006ExpRequestDtlDomain.setNetWeight(w1006ExpRequestDtlDomain.getNetWeight().multiply(w1006ExpRequestDtlDomain.getQty()).setScale(3, RoundingMode.HALF_UP));
                // Copy of property
                // プロパティのコピー
                CommonUtil.copyPropertiesDomainToDomain(listDomain, w1006ExpRequestDtlDomain);
                listDomain.setRequestStatus(criteriaDomain.getRequestStatus());
                listDomainList.add(listDomain);
                count++;
            }
            //Search more than 501 records
            if (SEARCH_MAX_COUNT < listDomainList.size()) {
                // 最大件数超過エラー
                Object[] params = {
                    listDomainList.size(),
                    SEARCH_MAX_COUNT
                };
                throw new GscmApplicationException(GSCM_E0_0003, params);
            }
        }
        
        return listDomainList;
    }
}
