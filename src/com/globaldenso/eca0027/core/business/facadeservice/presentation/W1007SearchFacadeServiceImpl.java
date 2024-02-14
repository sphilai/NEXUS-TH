/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FUNC_PALLETIZE_INSTRUCTION;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0003;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.LANGUAGE_CD_ENGLISH;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NOT_RECEIVED;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ORDER_BY;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W1007;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SEARCH_MAX_COUNT;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCdCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TmCdService;
import com.globaldenso.eca0027.core.business.domain.W1007CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W1007ExpRequestDomain;
import com.globaldenso.eca0027.core.business.domain.W1007ExpRequestDtlDomain;
import com.globaldenso.eca0027.core.business.domain.W1007ExpRequestDtlKitDomain;
import com.globaldenso.eca0027.core.business.domain.W1007ListDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W1007ExpRequestCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W1007ExpRequestDtlCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W1007ExpRequestDtlKitCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W1007ExpRequestDtlKitService;
import com.globaldenso.eca0027.core.business.service.W1007ExpRequestDtlService;
import com.globaldenso.eca0027.core.business.service.W1007ExpRequestService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.PageInfoCreator;
import com.globaldenso.gscm.framework.util.PageInfoData;
import com.globaldenso.gscm.framework.util.Validator;
/**
 * The Search service facade implementation class of Export Request Header screen
 * <br />荷揃え指示Register画面の登録facadeサービス実装クラスです。
 * <pre>
 * bean id:w1007SearchFacadeService
 * </pre>
 *
 * @author $Author: DCS
 * @version $Revision: 5446 $
 */
public class W1007SearchFacadeServiceImpl extends AbstractSearchFacadeService<List<? extends W1007ListDomain>, W1007CriteriaDomain> {
    /**
     * Common service
     * <br />共通サービス
     */
    protected CommonService commonService;
    /**
     * Staging instruction service.
     */
    /**
     * W1007ExpRequest Service.
     */
    protected W1007ExpRequestService w1007ExpRequestService;
    /**
     * W1007ExpRequestDtl Service.
     */
    protected W1007ExpRequestDtlService w1007ExpRequestDtlService;
    /**
     * W1007ExpRequestDtlKit Service.
     */
    protected W1007ExpRequestDtlKitService w1007ExpRequestDtlKitService;
    /**
     * TmCd Service.
     */
    protected TmCdService tmCdService;
    /**
     * Constructor.
     */
    public W1007SearchFacadeServiceImpl() {
    }
    
    /**
     * <p>Setter method for w1007ExpRequestService.</p>
     *
     * @param expRequestService Set for w1007ExpRequestService
     */
    public void setW1007ExpRequestService(W1007ExpRequestService expRequestService) {
        w1007ExpRequestService = expRequestService;
    }

    /**
     * <p>Setter method for tmCdService.</p>
     *
     * @param tmCdService Set for tmCdService
     */
    public void setTmCdService(TmCdService tmCdService) {
        this.tmCdService = tmCdService;
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
     * Setter method for w1007ExpRequestDtlService.
     *
     * @param w1007ExpRequestDtlService Set for w1007ExpRequestDtlService
     */
    public void setW1007ExpRequestDtlService(W1007ExpRequestDtlService w1007ExpRequestDtlService) {
        this.w1007ExpRequestDtlService = w1007ExpRequestDtlService;
    }
    /**
     * Setter method for w1007ExpRequestDtlService.
     *
     * @param w1007ExpRequestDtlKitService Set for w1007ExpRequestDtlService
     */
    public void setW1007ExpRequestDtlKitService(W1007ExpRequestDtlKitService w1007ExpRequestDtlKitService) {
        this.w1007ExpRequestDtlKitService = w1007ExpRequestDtlKitService;
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
    protected List<? extends W1007ListDomain> callServices(W1007CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {
        // TODO Auto-generated method stub
        // Create of a search-condition domain
        // 検索条件ドメインの作成
        List<? extends W1007ExpRequestDtlDomain>expRequestDtlList = null;
        List<? extends W1007ExpRequestDtlDomain>expRequestDtlNewList = null;
        W1007ExpRequestDtlCriteriaDomain criteria = createCriteria(criteriaDomain);
        
        // Set Default Order By
        if(criteria.getOrderBy() == null)
        {
            criteria.setOrderBy("10");
        }
        
        criteria = convertBlankToNull(criteria);
        
        // Search ExpRequestDtl and ExpRequestDtlKit
        // 梱包指示の検索
        expRequestDtlList = searchExpRequestDtlAll(criteria);
        
        // Remove Parent if have Kit
        expRequestDtlNewList = removeParent(expRequestDtlList);
        
        // Filter Parent Have Kit
        expRequestDtlNewList = filterParent(expRequestDtlNewList);
        
        
        String orderByValue = getOrderByValue(criteria.getOrderBy(), ORDER_BY);
        if(orderByValue != null && orderByValue.indexOf("Status") != -1)
        {
            Collections.sort(expRequestDtlNewList, new Comparator<W1007ExpRequestDtlDomain>() {
                public int compare(W1007ExpRequestDtlDomain o1, W1007ExpRequestDtlDomain o2) {
                    if(o1.getPackingStatus() == null)
                    {
                        o1.setPackingStatus("");
                    }
                    if(o2.getPackingStatus() == null)
                    {
                        o2.setPackingStatus("");
                    }
                    return o1.getPackingStatus().toLowerCase() .compareTo(o2.getPackingStatus().toLowerCase());
                }
            });
        }else if(orderByValue != null && orderByValue.indexOf("Line") != -1)
        {
            Collections.sort(expRequestDtlNewList, new Comparator<W1007ExpRequestDtlDomain>() {
                public int compare(W1007ExpRequestDtlDomain o1, W1007ExpRequestDtlDomain o2) {
                    int args1 = 999999;
                    int args2 = 999999;
                    if(o1.getLineNo() != null )
                    {
                        args1 = o1.getLineNo().intValue();
                    }
                    if(o2.getLineNo() != null )
                    {
                        args2 = o2.getLineNo().intValue();
                    }
                    return args1 - args2;
                }
            });
        }else if(orderByValue != null && orderByValue.equalsIgnoreCase("Item"))
        {
            Collections.sort(expRequestDtlNewList, new Comparator<W1007ExpRequestDtlDomain>() {
                public int compare(W1007ExpRequestDtlDomain o1, W1007ExpRequestDtlDomain o2) {
                    if(o1.getItem() == null)
                    {
                        o1.setItem("");
                    }
                    if(o2.getItem() == null)
                    {
                        o2.setItem("");
                    }
                    return o1.getItem().toLowerCase().compareTo(o2.getItem().toLowerCase());
                }
            });
        }else if(orderByValue != null && orderByValue.equalsIgnoreCase("Customer Item No"))
        {
            Collections.sort(expRequestDtlNewList, new Comparator<W1007ExpRequestDtlDomain>() {
                public int compare(W1007ExpRequestDtlDomain o1, W1007ExpRequestDtlDomain o2) {
                    if(o1.getCustomerItemNo() == null)
                    {
                        o1.setCustomerItemNo("");
                    }
                    if(o2.getCustomerItemNo() == null)
                    {
                        o2.setCustomerItemNo("");
                    }
                    return o1.getCustomerItemNo().toLowerCase().compareTo(o2.getCustomerItemNo().toLowerCase());
                }
            });
        }else if(orderByValue != null && orderByValue.indexOf("Pallet No") != -1)
        {
            Collections.sort(expRequestDtlNewList, new Comparator<W1007ExpRequestDtlDomain>() {
                public int compare(W1007ExpRequestDtlDomain o1, W1007ExpRequestDtlDomain o2) {
                    int args1 = 999999;
                    int args2 = 999999;
                    if(o1.getPalletNo() != null  && o1.getPalletNo().trim().length() > 0 )
                    {
                        args1 = Integer.parseInt(o1.getPalletNo());
                    }
                    if(o2.getPalletNo() != null  && o2.getPalletNo().trim().length() > 0)
                    {
                        args2 = Integer.parseInt(o2.getPalletNo());
                    }
                    return args1 - args2;
                }
            });
        }else if(orderByValue != null && orderByValue.indexOf("Product Name") != -1)
        {
            Collections.sort(expRequestDtlNewList, new Comparator<W1007ExpRequestDtlDomain>() {
                public int compare(W1007ExpRequestDtlDomain o1, W1007ExpRequestDtlDomain o2) {
                    if(o1.getDescription() == null)
                    {
                        o1.setDescription("");
                    }
                    if(o2.getDescription() == null)
                    {
                        o2.setDescription("");
                    }
                    return o1.getDescription().toLowerCase().compareTo(o2.getDescription().toLowerCase());
                }
            });
        }else if(orderByValue != null && orderByValue.equalsIgnoreCase("ItemNo"))
        {
            Collections.sort(expRequestDtlNewList, new Comparator<W1007ExpRequestDtlDomain>() {
                public int compare(W1007ExpRequestDtlDomain o1, W1007ExpRequestDtlDomain o2) {
                    if(o1.getItemNo() == null)
                    {
                        o1.setItemNo("");
                    }
                    if(o2.getItemNo() == null)
                    {
                        o2.setItemNo("");
                    }
                    return o1.getItemNo().toLowerCase().compareTo(o2.getItemNo().toLowerCase());
                }
            });
        }else if(orderByValue != null && orderByValue.indexOf("CML") != -1)
        {
            Collections.sort(expRequestDtlNewList, new Comparator<W1007ExpRequestDtlDomain>() {
                public int compare(W1007ExpRequestDtlDomain o1, W1007ExpRequestDtlDomain o2) {
                    if(o1.getMainMark() == null)
                    {
                        o1.setMainMark("");
                    }
                    if(o2.getMainMark() == null)
                    {
                        o2.setMainMark("");
                    }
                    return o1.getMainMark().toLowerCase().compareTo(o2.getMainMark().toLowerCase());
                }
            });
        }
        
        
        // Setting of the search range
        // 検索範囲の設定
        setPageInfo(criteriaDomain.getPageInfoCreator(), getCount(expRequestDtlNewList), criteria);
        
        // Setting Exp Req Status
        W1007ExpRequestCriteriaDomain w1007ExpRequestCriteriaDomain = new W1007ExpRequestCriteriaDomain();
        w1007ExpRequestCriteriaDomain.setExpRequestNo(criteria.getExpRequestNo());
        W1007ExpRequestDomain result = w1007ExpRequestService.searchByKey(w1007ExpRequestCriteriaDomain);
        if(result != null){
            criteriaDomain.setRequestStatus(getMessageValue(result.getRequestStatus(), FUNC_PALLETIZE_INSTRUCTION));
        }
        
        int count = criteria.getRowNumFrom() - 1;
        List<W1007ExpRequestDtlDomain> expRequestDtlDisplayList = new ArrayList<W1007ExpRequestDtlDomain>();
        int start = 0;
        if (count > 0) {
            for (int i = 0; i < expRequestDtlNewList.size(); i++ ) {
                W1007ExpRequestDtlDomain domain = expRequestDtlNewList.get(i);
                if(domain.isVisibleFlag())
                {
                    start++;
                    if (start == count) {
                        start = i + 1;
                        break;
                    }
                }
            }
        }
        for (int i = start; i < expRequestDtlNewList.size(); i++ ) {
            W1007ExpRequestDtlDomain domain = expRequestDtlNewList.get(i);
            if(domain.isVisibleFlag())
            {
                expRequestDtlDisplayList.add(domain);
                count++;
                if (criteria.getRowNumTo() == count) {
                    break;
                }
            }else{
                expRequestDtlDisplayList.add(domain);
            }
        }
        
       
        
        // Converted in a list domain
        // リストドメインへの変換
        return convertToListDomain(expRequestDtlDisplayList, criteriaDomain.getScreenDateFormat());
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
    protected W1007CriteriaDomain filterDomain(W1007CriteriaDomain criteriaDomain)
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
    protected void validateConsistency(W1007CriteriaDomain filterDomain)
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
    protected void validateDatabase(W1007CriteriaDomain filterDomain)
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
    protected void validateItems(W1007CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        Validator<W1007CriteriaDomain> valid 
            = new Validator<W1007CriteriaDomain>(criteriaDomain, "w1007CriteriaDomain");
        
        String[] properties = {
            "fmLine" ,
            "toLine" 
        };
        if(criteriaDomain.getToLine() != null && !"".equals(criteriaDomain.getToLine())){
            valid.isValidateProperties(properties, SCREEN_ID_W1007);
        }else if(criteriaDomain.getFmLine() != null && criteriaDomain.getFmLine().trim().length() > 0){
            valid.isValidateProperties(properties, SCREEN_ID_W1007);
        }
        
        // Error check
        // エラー確認
        if (0 < valid.getErrList().size()) {
            throw new ValidationException(valid.getErrList());
        }
    }
    /**
     * CreateCriteria
     *
     * @param criteriaDomain W1007CriteriaDomain
     * @return criteria W1007ExpRequestDtlCriteriaDomain
     */
    protected W1007ExpRequestDtlCriteriaDomain createCriteria(W1007CriteriaDomain criteriaDomain) {
        W1007ExpRequestDtlCriteriaDomain criteria = new W1007ExpRequestDtlCriteriaDomain();
        
        // The setting for acquiring the maximum number
        // 最大件数を取得するための設定
        criteria.setScreenId(criteriaDomain.getScreenId());
        criteria.setLocale(new Locale(criteriaDomain.getLanguageCd()));
        
        // A search condition is copied.
        // 検索条件をコピー
        CommonUtil.copyPropertiesDomainToDomain(criteria, criteriaDomain, criteriaDomain.getScreenDateFormat());
        
        
        return criteria;
    }
    /**
     * CreateKitCriteria
     *
     * @param criteriaDomain W1007CriteriaDomain
     * @return criteria W1007ExpRequestDtlKitCriteriaDomain
     */
    protected W1007ExpRequestDtlKitCriteriaDomain createKitCriteria(W1007CriteriaDomain criteriaDomain) {
        W1007ExpRequestDtlKitCriteriaDomain criteria = new W1007ExpRequestDtlKitCriteriaDomain();
        
        // The setting for acquiring the maximum number
        // 最大件数を取得するための設定
        criteria.setScreenId(criteriaDomain.getScreenId());
        criteria.setLocale(new Locale(criteriaDomain.getLanguageCd()));
        
        // A search condition is copied.
        // 検索条件をコピー
        CommonUtil.copyPropertiesDomainToDomain(criteria, criteriaDomain, criteriaDomain.getScreenDateFormat());
        
        
        return criteria;
    }
    /**
     * The search range is computed.
     * <br />検索範囲を算出します。
     *
     * @param pageInfoCreator PageInfoCreator object<br />PageInfoCreatorオブジェクト
     * @param count Search number<br />検索件数
     * @param criteria The search-condition domain of Packaging Instruction (=Pull) service<br />梱包指示サービスの検索条件ドメイン
     * @throws ApplicationException When the search range is incalculable<br />検索範囲が計算できない場合
     */
    protected void setPageInfo(PageInfoCreator pageInfoCreator, int count, W1007ExpRequestDtlCriteriaDomain criteria) 
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
     * @param criteria The search-condition domain of Packaging Instruction (=Pull) service<br />梱包指示サービスの検索条件ドメイン
     * @throws ApplicationException When the search range is incalculable<br />検索範囲が計算できない場合
     */
    protected void setPageKitInfo(PageInfoCreator pageInfoCreator, int count, W1007ExpRequestDtlKitCriteriaDomain criteria) 
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
     * Search expRequestDtl
     *
     * @param criteria W1007ExpRequestDtlCriteriaDomain
     * @return List<? extends W1007ExpRequestDtlDomain>
     * @throws ApplicationException When a Packaging Instruction (=Pull) cannot be searched<br />梱包指示が検索できない場合
     */
    protected List<? extends W1007ExpRequestDtlDomain> searchExpRequestDtlAll(W1007ExpRequestDtlCriteriaDomain criteria) 
        throws ApplicationException {
        return w1007ExpRequestDtlService.searchParentKitByCondition(criteria);
    }
    /**FilterParent If no kits then validate parent (which no kits in other status) 
    *
    * @param expRequestDtlList W1007ExpRequestDtlDomain List
    * @return W1007ExpRequestDtlDomain result
    * @throws GscmApplicationException gscmApplicationException
    * @throws ApplicationException applicationException
    */
    protected List<W1007ExpRequestDtlDomain> filterParent(List<? extends W1007ExpRequestDtlDomain> expRequestDtlList) throws GscmApplicationException, ApplicationException {
        List<W1007ExpRequestDtlDomain> listDomainList = new ArrayList<W1007ExpRequestDtlDomain>();
        if (expRequestDtlList != null) {
            for (int i = 0; i < expRequestDtlList.size(); i++ ) {
                W1007ExpRequestDtlDomain domain = expRequestDtlList.get(i);
                if(!domain.isVisibleFlag()){
                    listDomainList.add(domain);
                }else{
                    // Setting default flag each item
                    domain.setPalletTempFlag(false);
                    if(domain.getPalletNo() != null  || domain.getPalletTemp() != null )
                    {
                        // Setting flag and palletNo each item 
                        domain.setPalletTempFlag(true);
                        if(domain.getPalletTemp() != null)
                        {
                            domain.setPalletNo(domain.getPalletTemp());
                        }
                        if(domain.getPackingStatus() != null && NOT_RECEIVED.equals(domain.getPackingStatus()) ){
                            domain.setPalletNo("");
                            domain.setPalletTempFlag(false);
                        }
                      
                    }
                       
                    // Check Parent have child ?
                    if(domain.getLineNo() != null && domain.getLineNo().intValue() > 0)
                    {
                        // The information from a screen is set to criteria.
                        W1007ExpRequestDtlKitCriteriaDomain kitCriteriaDomain = new W1007ExpRequestDtlKitCriteriaDomain();
                        kitCriteriaDomain.setExpRequestNo(domain.getExpRequestNo());
                        kitCriteriaDomain.setExpRequestItemId(domain.getExpRequestItemId());
                        // Search By Condition
                        List<W1007ExpRequestDtlKitDomain>  expRequestList = w1007ExpRequestDtlKitService.searchByCondition(kitCriteriaDomain);
                        if(expRequestList == null || expRequestList.size() == 0)
                        {
                            // Add data to List
                            listDomainList.add(domain);
                        }
                    }else{
                        // Add data to List
                        listDomainList.add(domain);
                    }
                }
            }
        }
       
        return listDomainList;
    }
   /** RemoveParent If it has kits then show only kits
   *
   * @param expRequestDtlList W1007ExpRequestDtlDomain List
   * @return list List<W1007ExpRequestDtlDomain>
   */
    protected List<W1007ExpRequestDtlDomain> removeParent(List<? extends W1007ExpRequestDtlDomain> expRequestDtlList) {
        List<W1007ExpRequestDtlDomain> listDomainList = new ArrayList<W1007ExpRequestDtlDomain>();
        if (expRequestDtlList != null) {
            for (int i = 0; i < expRequestDtlList.size(); i++ ) {
                W1007ExpRequestDtlDomain domainParent = (W1007ExpRequestDtlDomain)expRequestDtlList.get(i);
                if(i + 1 < expRequestDtlList.size())
                {
                    W1007ExpRequestDtlDomain domainChild = (W1007ExpRequestDtlDomain)expRequestDtlList.get(i + 1);
                    if(domainChild != null && domainParent.getLineNo() != null && domainChild.getExpRequestItemId().intValue() == domainParent.getExpRequestItemId().intValue() && domainChild.getLineNo() == null )
                    {
                        domainParent.setVisibleFlag(false);
                    }else{
                        // Add data to List
                        domainParent.setVisibleFlag(true);
                    }
                }else{
                    // Add data to List
                    domainParent.setVisibleFlag(true);
                    
                }
                
                // Set mainmark is empty when Packing status < 30 
                if(domainParent.getPackingStatus() != null && Integer.parseInt(domainParent.getPackingStatus()) < 30 )
                {
                    domainParent.setMainMark("");
                    domainParent.setPalletNo("");
                }
                listDomainList.add(domainParent);
            }
        }
        
        return listDomainList;
    }
    /**
     * A Packaging Instruction (=Pull) domain is changed into a list domain.
     * <br />梱包指示ドメインをリストドメインに変換します。
     *
     * @param expRequestDtlList The list of Packaging Instruction (=Pull) domains<br />梱包指示ドメインのリスト
     * @param dateFormat Date format<br />日付フォーマット
     * @return Conversion result<br />変換結果
     * 変換結果
     * @throws GscmApplicationException GscmApplicationException
     */
    protected List<W1007ListDomain> convertToListDomain(List<? extends W1007ExpRequestDtlDomain> expRequestDtlList, String dateFormat) throws GscmApplicationException {
        List<W1007ListDomain> listDomainList = new ArrayList<W1007ListDomain>();
        if(expRequestDtlList != null && expRequestDtlList.size() > 0){
            for (W1007ExpRequestDtlDomain w1007ExpRequestDtlDomain : expRequestDtlList) {
                W1007ListDomain listDomain = new W1007ListDomain();
                // Copy of property
                // プロパティのコピー
                CommonUtil.copyPropertiesDomainToDomain(listDomain, w1007ExpRequestDtlDomain);
                listDomainList.add(listDomain);
            }
            
            
            if (SEARCH_MAX_COUNT < listDomainList.size()) {
                // 最大件数超過エラー
                Object[] params = {
                    listDomainList.size(),
                    SEARCH_MAX_COUNT
                };
                throw new GscmApplicationException(GSCM_E0_0003, params);
            }
        }else {
            // 0件エラー
            throw new GscmApplicationException(GSCM_E0_0001);
        }
        return listDomainList;
    }
    /**
     * Convert to null
     *
     * @param domain W1007ExpRequestDtlCriteriaDomain
     * @return domain W1007ExpRequestDtlCriteriaDomain
     */
    protected W1007ExpRequestDtlCriteriaDomain convertBlankToNull(W1007ExpRequestDtlCriteriaDomain domain)
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
        if(domain != null && "".equals(domain.getPalletNo()) )
        {
            domain.setPalletNo(null);            
        }
        if(domain != null && "".equals(domain.getCmlNo())) 
        {
            domain.setCmlNo(null);            
        }
        if(domain != null && domain.getPalletNo() != null && domain.getPalletNo().trim().length() <= 0)
        {
            domain.setPalletNo(null);
        }
        if(domain != null && "".equals(domain.getPackingStatus()) )
        {
            domain.setPackingStatus(null);            
        }
        return domain;
    }
    /**
     * getCount
     *
     * @param expRequestDtlNewList W1007ExpRequestDtlCriteriaDomain
     * @return domain int
     */
    protected int getCount(List<? extends W1007ExpRequestDtlDomain> expRequestDtlNewList)
    {
        int count = 0;
        if(expRequestDtlNewList != null && expRequestDtlNewList.size() > 0){
            for(W1007ExpRequestDtlDomain domain : expRequestDtlNewList)
            {
                if(domain.isVisibleFlag())
                {
                    count++;
                }
            }
        }
        return count;
    }
    
    /**
     *    The name of the input method (Manual) is acquired.
     * <br />入力方法(Manual)の名称を取得します。
     *
     * @param cd String
     * @param cdType String
     * @return The name of the input method<br />入力方法の名称
     * @throws ApplicationException When the input method is unacquirable<br />入力方法が取得できない場合
     */
    protected String getMessageValue(String cd, String cdType ) throws ApplicationException {
        // Setting of a search condition
        // 検索条件の設定
        TmCdCriteriaDomain criteria = new TmCdCriteriaDomain();
        criteria.setLngCd(LANGUAGE_CD_ENGLISH);
        criteria.setCdTyp(cdType);
        criteria.setCd(cd);

        // Acquisition of a name
        // 名称の取得
        return cd + " : " + tmCdService.searchByKey(criteria).getValue();
    }
    /**
     *    The name of the input method (Manual) is acquired.
     * <br />入力方法(Manual)の名称を取得します。
     *
     * @param cd String
     * @param cdType String
     * @return The name of the input method<br />入力方法の名称
     * @throws ApplicationException When the input method is unacquirable<br />入力方法が取得できない場合
     */
    protected String getOrderByValue(String cd, String cdType ) throws ApplicationException {
        // Setting of a search condition
        // 検索条件の設定
        TmCdCriteriaDomain criteria = new TmCdCriteriaDomain();
        criteria.setLngCd(LANGUAGE_CD_ENGLISH);
        criteria.setCdTyp(cdType);
        criteria.setCd(cd);

        // Acquisition of a name
        // 名称の取得
        return tmCdService.searchByKey(criteria).getValue();
    }
}
