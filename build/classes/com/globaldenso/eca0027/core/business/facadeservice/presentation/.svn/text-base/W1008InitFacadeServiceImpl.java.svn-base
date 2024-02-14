/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0037;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.TmNxsCompDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsCompCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TmNxsCompService;
import com.globaldenso.eca0027.core.auto.business.service.TtExpRequestDtlKitService;
import com.globaldenso.eca0027.core.auto.business.service.TtExpRequestDtlService;
import com.globaldenso.eca0027.core.business.domain.W1001ExpRequestDomain;
import com.globaldenso.eca0027.core.business.domain.W1007PltzWkDomain;
import com.globaldenso.eca0027.core.business.domain.W1008CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W1008ExpRequestDtlDomain;
import com.globaldenso.eca0027.core.business.domain.W1008ListDomain;
import com.globaldenso.eca0027.core.business.domain.W1008PltzDomain;
import com.globaldenso.eca0027.core.business.domain.W1008PltzItemDomain;
import com.globaldenso.eca0027.core.business.domain.W1008UpdateDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W1001ExpRequestCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W1007PltzWkCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W1008PltzCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W1008PltzItemCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W1001ExpRequestService;
import com.globaldenso.eca0027.core.business.service.W1007PltzWkService;
import com.globaldenso.eca0027.core.business.service.W1008PltzItemService;
import com.globaldenso.eca0027.core.business.service.W1008PltzService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.PageInfoCreator;
import com.globaldenso.gscm.framework.util.PageInfoData;

/**
 * The intit service facade implementation class of action Export Packaging Register screen.
 * <pre>
 * bean W1008InitFacadeService
 * </pre>
 *
 * @author $Author: DCS $
 * @version $Revision: 5759 $
 */
public class W1008InitFacadeServiceImpl extends AbstractSearchFacadeService<W1008UpdateDomain, W1008UpdateDomain> {
    /**
     * DecimalFormat
     * <br />
     */
    protected DecimalFormat df = new DecimalFormat("#.###");
    /**
     * W1007PltzWk service
     * <br />
     */
    protected W1007PltzWkService w1007PltzWkService;
    /**
     * service of nxs Company <br />
     */
    protected TmNxsCompService tmNxsCompService;
    /**
     * W1008Pltz service
     * <br />
     */
    protected W1008PltzService w1008PltzService;
    /**
     * W1008PltzItem service
     * <br />
     */
    protected W1008PltzItemService w1008PltzItemService;
    /**
     * TtExpRequestDtl service
     * <br />
     */
    protected TtExpRequestDtlService ttExpRequestDtlService;
    /**
     * TtExpRequestDtlKit service
     * <br />
     */
    protected TtExpRequestDtlKitService ttExpRequestDtlKitService;
    /**
     * TtExpRequest service
     * <br />
     */
    protected W1001ExpRequestService w1001ExpRequestService;
    
    /**
     * Constructor
     * <br />デフォルトコンストラクタ
     */
    public W1008InitFacadeServiceImpl() {
    }

    /**
     * <p>Setter method for w1001ExpRequestService.</p>
     *
     * @param expRequestService Set for w1001ExpRequestService
     */
    public void setW1001ExpRequestService(W1001ExpRequestService expRequestService) {
        w1001ExpRequestService = expRequestService;
    }

    /**
     * <p>Setter method for tmNxsCompService.</p>
     *
     * @param tmNxsCompService Set for tmNxsCompService
     */
    public void setTmNxsCompService(TmNxsCompService tmNxsCompService) {
        this.tmNxsCompService = tmNxsCompService;
    }

    /**
     * <p>Setter method for w1008PltzItemService.</p>
     *
     * @param pltzItemService Set for w1008PltzItemService
     */
    public void setW1008PltzItemService(W1008PltzItemService pltzItemService) {
        w1008PltzItemService = pltzItemService;
    }

    /**
     * <p>Setter method for w1008PltzService.</p>
     *
     * @param pltzService Set for w1008PltzService
     */
    public void setW1008PltzService(W1008PltzService pltzService) {
        w1008PltzService = pltzService;
    }

    /**
     * <p>Setter method for ttExpRequestDtlService.</p>
     *
     * @param ttExpRequestDtlService Set for ttExpRequestDtlService
     */
    public void setTtExpRequestDtlService(TtExpRequestDtlService ttExpRequestDtlService) {
        this.ttExpRequestDtlService = ttExpRequestDtlService;
    }

    /**
     * <p>Setter method for ttExpRequestDtlKitService.</p>
     *
     * @param ttExpRequestDtlKitService Set for ttExpRequestDtlKitService
     */
    public void setTtExpRequestDtlKitService(TtExpRequestDtlKitService ttExpRequestDtlKitService) {
        this.ttExpRequestDtlKitService = ttExpRequestDtlKitService;
    }

    /**
     * <p>Getter method for w1007PltzWkService.</p>
     *
     * @return the w1007PltzWkService
     */
    public W1007PltzWkService getW1007PltzWkService() {
        return w1007PltzWkService;
    }

    /**
     * <p>Setter method for w1007PltzWkService.</p>
     *
     * @param pltzWkService Set for w1007PltzWkService
     */
    public void setW1007PltzWkService(W1007PltzWkService pltzWkService) {
        w1007PltzWkService = pltzWkService;
    }
    /**
     * {@inheritDoc}
     * <pre>
     * Check selection of detail line.
     * </pre>
     * <pre>
     * 明細行選択チェック
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W1008UpdateDomain filterDomain(W1008UpdateDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {
        return criteriaDomain;
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
    protected void validateItems(W1008UpdateDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        List<MessageDomain> errList = new ArrayList<MessageDomain>();
        List<W1008ListDomain> newDomainList = new ArrayList<W1008ListDomain>();
        // Variable for check each item
        boolean checkPltzWkFlag = false;
        if(criteriaDomain.getCriteriaDomain().getOriginalScreenId() != null && criteriaDomain.getCriteriaDomain().getOriginalScreenId().equalsIgnoreCase("W1007")){
            // Convert to List W1008ExpRequestDtlDomain
            List<W1008ExpRequestDtlDomain> w1008ExpRequestDtlDomain = convertToW1008ExpRequestDtlDomain(criteriaDomain.getListDomainList());
            if (w1008ExpRequestDtlDomain != null) {
                int index = 0;
                for (W1008ExpRequestDtlDomain domain : w1008ExpRequestDtlDomain) {
                    // Packing Status is not 'NOT PACKED'
                    if(domain.isPalletTempFlag()) 
                    {
                        newDomainList.add(criteriaDomain.getListDomainList().get(index));
                        checkPltzWkFlag = true;
                    }
                    index++;
                }
            }
            // Error check
            // エラー確認
            if (!checkPltzWkFlag) {
                // Setting error message
                MessageDomain msgUpdateStatus = new MessageDomain("", NXS_E1_0037, null);
                errList.add(msgUpdateStatus);
                criteriaDomain.getCriteriaDomain().setMsg("NO_ITEM");
                throw new ValidationException(errList);
            }else{
                criteriaDomain.setListDomainList(newDomainList);
            }
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
    protected void validateConsistency(W1008UpdateDomain criteriaDomain)
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
    protected void validateDatabase(W1008UpdateDomain criteriaDomain)
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
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W1008UpdateDomain callServices(W1008UpdateDomain w1008UpdateDomain) 
        throws GscmApplicationException, ApplicationException {
        // Search TT_EXP_REQUEST
        W1001ExpRequestCriteriaDomain w1001ExpRequestCriteriaDomain = new W1001ExpRequestCriteriaDomain();
        w1001ExpRequestCriteriaDomain.setExpRequestNo(w1008UpdateDomain.getCriteriaDomain().getExpRequestNo());
        W1001ExpRequestDomain w1001ExpRequestDomain = w1001ExpRequestService.searchByKeyForChange(w1001ExpRequestCriteriaDomain);
        if(w1001ExpRequestDomain != null)
        {
            w1008UpdateDomain.setTypeOfShipper(w1001ExpRequestDomain.getDensoShipperTyp()) ; 
        }
        // The information from a screen is set to criteria.
        W1007PltzWkCriteriaDomain criteriaDomain = new W1007PltzWkCriteriaDomain();
        criteriaDomain.setExpRequestNo(w1008UpdateDomain.getCriteriaDomain().getExpRequestNo());
        criteriaDomain.setLanguageCd(w1008UpdateDomain.getCriteriaDomain().getLanguageCd());
        // Search count
        int count = w1007PltzWkService.searchCountDistinct(criteriaDomain);
        if(count > 0){
            // Setting Page Info
            PageInfoData pageInfo = setPageInfo(w1008UpdateDomain.getCriteriaDomain().getPageInfoCreator(), count, w1008UpdateDomain.getCriteriaDomain());
            w1008UpdateDomain.getCriteriaDomain().setNetWeight("");
            if(pageInfo.getFromCount() > 0){
                w1008UpdateDomain.setListDomainList(null);
                w1008UpdateDomain = clearData(w1008UpdateDomain);
                // The information from a screen is set to criteria.
                criteriaDomain = new W1007PltzWkCriteriaDomain();
                criteriaDomain.setExpRequestNo(w1008UpdateDomain.getCriteriaDomain().getExpRequestNo());
                criteriaDomain.setRowNumFrom(pageInfo.getFromCount());
                criteriaDomain.setLanguageCd(w1008UpdateDomain.getCriteriaDomain().getLanguageCd());
                // Search by type Issue 098
                if (w1008UpdateDomain.getInitDomainList() == null || w1008UpdateDomain.getInitDomainList().size() == 0 || w1008UpdateDomain.getInitDomainList().size() > count) {
                    w1008UpdateDomain.setInitDomainList(w1007PltzWkService.searchByType(criteriaDomain));
                }
                W1007PltzWkDomain domain = w1008UpdateDomain.getInitDomainList().get(pageInfo.getFromCount() - 1);
                // Type is PLTZ_WK ( data in PLTZ_WK )
                if(domain.getType() != null && "PLTZ_WK".equalsIgnoreCase(domain.getType()))
                {
                    // The information from a screen is set to criteria.
                    criteriaDomain = new W1007PltzWkCriteriaDomain();
                    criteriaDomain.setExpRequestNo(domain.getExpRequestNo());
                    criteriaDomain.setPalletNo(domain.getPalletNo());
                    criteriaDomain.setLanguageCd(w1008UpdateDomain.getCriteriaDomain().getLanguageCd());
                    // Search by condition
                    List<W1007PltzWkDomain> domainList = w1007PltzWkService.searchJoinByCondition(criteriaDomain);
                    if(domainList != null && domainList.size() > 0)
                    {
                        List<W1008ListDomain> w1008ListDomainList  =  convertToListDomain(domainList);
                        w1008UpdateDomain.setListDomainList(w1008ListDomainList);
                        w1008UpdateDomain.getCriteriaDomain().setPalletNo(domain.getPalletNo());
                      
                    }
                    
                    // Setting L W H and outer CD from the previous pallet# ###Issue 072
                    if(w1008UpdateDomain.getCriteriaDomain().getPreviousPallet() != null && w1008UpdateDomain.getCriteriaDomain().getPreviousPallet().length() > 0){
                        W1008PltzCriteriaDomain w1008PltzCriteriaDomain = new W1008PltzCriteriaDomain();
                        w1008PltzCriteriaDomain.setExpRequestNo(domain.getExpRequestNo());
                        w1008PltzCriteriaDomain.setPalletNo(w1008UpdateDomain.getCriteriaDomain().getPreviousPallet());
                        w1008PltzCriteriaDomain.setPreferredOrder("pallet_no");
                        List<W1008PltzDomain>  resultList = w1008PltzService.searchByConditionWithOuterCD(w1008PltzCriteriaDomain);
                        if(resultList != null && resultList.size() > 0)
                        {
                            W1008PltzDomain result = resultList.get(0);
                            w1008UpdateDomain.getCriteriaDomain().setLength(String.valueOf(result.getLength()) );
                            w1008UpdateDomain.getCriteriaDomain().setWidth(String.valueOf(result.getWidth()));
                            w1008UpdateDomain.getCriteriaDomain().setHeight(String.valueOf(result.getHeight()));
                            w1008UpdateDomain.getCriteriaDomain().setVolume(String.valueOf(result.getVolume()));
                            w1008UpdateDomain.getCriteriaDomain().setLengthUnitHeader(result.getLengthUnit());
                            w1008UpdateDomain.getCriteriaDomain().setLengthUnit(result.getLengthUnit());
                            w1008UpdateDomain.getCriteriaDomain().setOwnerComp(result.getOwnerComp());
                            if(result.getOuterPkgCd() != null && result.getOuterPkgCd().trim().length() > 0){
                                w1008UpdateDomain.getCriteriaDomain().setOuterPkgCd(result.getOuterPkgCd());
                            }
                        }
                    }
                }
                // Type is PLTZ ( data in PLTZ )
                else if(domain.getType() != null && "PLTZ".equalsIgnoreCase(domain.getType()))
                {
                    // The information from a screen is set to criteria.
                    W1008PltzCriteriaDomain w1008PltzCriteriaDomain = new W1008PltzCriteriaDomain();
                    w1008PltzCriteriaDomain.setMainMark(domain.getMainMark());
                    w1008PltzCriteriaDomain.setLanguageCd(w1008UpdateDomain.getCriteriaDomain().getLanguageCd());
                    // Search by key
                    W1008PltzDomain w1008PltzDomain = w1008PltzService.searchByKey(w1008PltzCriteriaDomain);
                    if(w1008PltzDomain != null)
                    {
                        // Setting CriteriaDomain
                        w1008UpdateDomain.getCriteriaDomain().setOuterPkgCd(w1008PltzDomain.getOuterPkgCd());
                        w1008UpdateDomain.getCriteriaDomain().setLengthUnit(w1008PltzDomain.getLengthUnit());
                        w1008UpdateDomain.getCriteriaDomain().setLength(String.valueOf(w1008PltzDomain.getLength()) );
                        w1008UpdateDomain.getCriteriaDomain().setWidth(String.valueOf(w1008PltzDomain.getWidth()) );
                        w1008UpdateDomain.getCriteriaDomain().setHeight(String.valueOf(w1008PltzDomain.getHeight()) );
                        w1008UpdateDomain.getCriteriaDomain().setVolume(String.valueOf(w1008PltzDomain.getVolume()) );
                        w1008UpdateDomain.getCriteriaDomain().setNetWeight(String.valueOf(w1008PltzDomain.getNetWeight()) );
                        w1008UpdateDomain.getCriteriaDomain().setMainMark(w1008PltzDomain.getMainMark());
                        w1008UpdateDomain.getCriteriaDomain().setPalletNo(domain.getPalletNo());
                        w1008UpdateDomain.getCriteriaDomain().setGrossWeight(String.valueOf(w1008PltzDomain.getGrossWeight()));
                        w1008UpdateDomain.getCriteriaDomain().setSupplierMainMark(w1008PltzDomain.getSupplierMainMark());
                        w1008UpdateDomain.getCriteriaDomain().setPackingType(w1008PltzDomain.getPackingType());
                        
                        // Setting child
                        W1008PltzItemCriteriaDomain w1008PltzItemCriteriaDomain = new W1008PltzItemCriteriaDomain();
                        w1008PltzItemCriteriaDomain.setMainMark(w1008PltzDomain.getMainMark());
                        w1008PltzItemCriteriaDomain.setItemTyp("3");
                        w1008PltzItemCriteriaDomain.setLanguageCd(w1008UpdateDomain.getCriteriaDomain().getLanguageCd());
                        List<W1008PltzItemDomain> w1008PltzItemDomainList = w1008PltzItemService.searchW1008ByCondition(w1008PltzItemCriteriaDomain);
                        
                        // Remove Parent was registed to CML  ##ISSUE 137
                        List<W1008PltzItemDomain> w1008PltzItemNewDomainList  = new ArrayList<W1008PltzItemDomain> ();
                        if(w1008PltzItemDomainList != null && w1008PltzItemDomainList.size() > 0)
                        {
                            for(W1008PltzItemDomain result : w1008PltzItemDomainList)
                            {
                                // Add by DCS 08/09/2017
                                if(w1008PltzDomain.getGrossWeight().doubleValue() > 0 && w1008UpdateDomain.getCriteriaDomain().getRequestStatus().indexOf("60") != -1 && result.getKitBrch().doubleValue() == 0 && "Y".equalsIgnoreCase(result.getParFlg()) ) //comment by Ngek 08092017//&& result.getItemWeight().doubleValue() == 0
                                {
                                    //Parent was registed to CML
                                }else{
                                    w1008PltzItemNewDomainList.add(result);
                                }
                            }
                        }
                        List<W1008ListDomain> w1008ListDomainList =  convertW1008PltzItemDomainToListDomain(w1008PltzItemNewDomainList);
                        w1008UpdateDomain.setListDomainList(w1008ListDomainList);
                        
                    }
                }
                
                // Setting Net Weight ##issue049
                double netWeight = 0.0;
                if(w1008UpdateDomain.getCriteriaDomain().getNetWeight() != null && w1008UpdateDomain.getCriteriaDomain().getNetWeight().trim().length() <= 0){
                    for(W1008ListDomain w1008ListDomain :  w1008UpdateDomain.getListDomainList())
                    {
                        netWeight +=  w1008ListDomain.getNetWeight().doubleValue() * w1008ListDomain.getQty().doubleValue();
                    }
                    w1008UpdateDomain.getCriteriaDomain().setNetWeight(String.valueOf(df.format(netWeight)) ); 
                }
            }
        }else
        {
            w1008UpdateDomain.setListDomainList(null);
        }
        
        TmNxsCompCriteriaDomain tmNxsCompCriteriaDomain = new TmNxsCompCriteriaDomain();
        tmNxsCompCriteriaDomain.setCompCd(w1008UpdateDomain.getCriteriaDomain().getShipperCd());
        TmNxsCompDomain tmNxsCompDomain = tmNxsCompService.searchByKey(tmNxsCompCriteriaDomain);
        if(tmNxsCompDomain != null)
        {
            w1008UpdateDomain.getCriteriaDomain().setLengthUnit(tmNxsCompDomain.getLengthUnit());
            w1008UpdateDomain.getCriteriaDomain().setLengthUnitHeader(tmNxsCompDomain.getLengthUnit());
        }
        return w1008UpdateDomain;
    }
    
    /**
     * The search range is computed.
     * <br />検索範囲を算出します。
     *
     * @param pageInfoCreator PageInfoCreator object<br />PageInfoCreatorオブジェクト
     * @param count Search number<br />検索件数
     * @param W1008CriteriaDomain The search-condition domain of Export Request service<br />梱包指示サービスの検索条件ドメイン
     * @return PageInfoData
     * @throws ApplicationException When the search range is incalculable<br />検索範囲が計算できない場合
     */
    protected PageInfoData setPageInfo(PageInfoCreator pageInfoCreator, int count, W1008CriteriaDomain W1008CriteriaDomain) throws ApplicationException {
        
        // Acquisition of page information
        // ページ情報の取得
        PageInfoData pageInfoData = pageInfoCreator.createPageInfoData(count, null, null, W1008CriteriaDomain.getLocale());
        
        // A start and end position are set to search-condition domain.
        // 検索条件ドメインに開始・終了位置を設定
        W1008CriteriaDomain.setRowNumFrom(pageInfoData.getFromCount());
        W1008CriteriaDomain.setRowNumTo(pageInfoData.getToCount());
        return pageInfoData;
    }
    /**
     *  Convert to W1008ExpRequestDtlDomain
     *
     * @param listDomain List<? extends W1008ListDomain>
     * @return listDomainList List<W1008ExpRequestDtlDomain>
     */
    protected List<W1008ExpRequestDtlDomain> convertToW1008ExpRequestDtlDomain(List<? extends W1008ListDomain> listDomain) {
        List<W1008ExpRequestDtlDomain> listDomainList = new ArrayList<W1008ExpRequestDtlDomain>();
        
        if (listDomain != null && listDomain.size() > 0) {
            for (W1008ListDomain domain : listDomain) {
                W1008ExpRequestDtlDomain criteria = new W1008ExpRequestDtlDomain();
                //Issue 117 comment for Issue 160
                //domain.setNetWeight(domain.getNetWeight().multiply(domain.getQty()).setScale(3, RoundingMode.HALF_UP));
                // Copy of property
                // プロパティのコピー
                CommonUtil.copyPropertiesDomainToDomain(criteria, domain);
                listDomainList.add(criteria);
            }
        }
        
        return listDomainList;
    }
    /**
     *  Convert to W1008ListDomain
     *
     * @param listDomain List<? extends W1007PltzWkDomain>
     * @return w1008ListDomainList List<W1008ListDomain>
     */
    protected List<W1008ListDomain> convertToListDomain(List<? extends W1007PltzWkDomain> listDomain) {
        List<W1008ListDomain> w1008ListDomainList = new ArrayList<W1008ListDomain>();
        
        if (listDomain != null && listDomain.size() > 0) {
            for (W1007PltzWkDomain domain : listDomain) {
                W1008ListDomain w1008ListDomain = new W1008ListDomain();
                //Issue 117 comment for Issue 160
                //domain.setNetWeight(domain.getNetWeight().multiply(domain.getQty()).setScale(3, RoundingMode.HALF_UP));
                // Copy of property
                // プロパティのコピー
                CommonUtil.copyPropertiesDomainToDomain(w1008ListDomain, domain);
                w1008ListDomainList.add(w1008ListDomain);
            }
        }
        
        return w1008ListDomainList;
    }
    /**
     *  Convert to W1008ListDomain
     *
     * @param listDomain List<? extends W1008PltzItemDomain>
     * @return w1008ListDomainList List<W1008ListDomain>
     */
    protected List<W1008ListDomain> convertW1008PltzItemDomainToListDomain(List<? extends W1008PltzItemDomain> listDomain) {
        List<W1008ListDomain> w1008ListDomainList = new ArrayList<W1008ListDomain>();
        
        if (listDomain != null && listDomain.size() > 0) {
            for (W1008PltzItemDomain domain : listDomain) {
                W1008ListDomain w1008ListDomain = new W1008ListDomain();
                //Issue 117 comment for Issue 160
                //domain.setNetWeight(domain.getNetWeight().multiply(domain.getQty()).setScale(3, RoundingMode.HALF_UP));
                // Copy of property
                // プロパティのコピー
                CommonUtil.copyPropertiesDomainToDomain(w1008ListDomain, domain);
                if(w1008ListDomain.getKitBrch() != null && w1008ListDomain.getKitBrch().intValue() > 0)
                {
                    w1008ListDomain.setLineNo(null);
                }else if(w1008ListDomain.getLineNo() != null && w1008ListDomain.getLineNo().intValue() > 0)
                {
                    w1008ListDomain.setKitBrch(null);
                }
                w1008ListDomainList.add(w1008ListDomain);
            }
        }
        
        return w1008ListDomainList;
    }
    /**
     *  Clear data
     *
     * @param w1008UpdateDomain W1008UpdateDomain
     * @return w1008UpdateDomain W1008UpdateDomain
     */
    protected W1008UpdateDomain clearData(W1008UpdateDomain w1008UpdateDomain)
    {
        w1008UpdateDomain.getCriteriaDomain().setOuterPkgCd("");
        w1008UpdateDomain.getCriteriaDomain().setLengthUnit("");
        w1008UpdateDomain.getCriteriaDomain().setLength("");
        w1008UpdateDomain.getCriteriaDomain().setWidth("");
        w1008UpdateDomain.getCriteriaDomain().setHeight("");
        w1008UpdateDomain.getCriteriaDomain().setVolume("");
        w1008UpdateDomain.getCriteriaDomain().setNetWeight("");
        w1008UpdateDomain.getCriteriaDomain().setMainMark("");
        w1008UpdateDomain.getCriteriaDomain().setGrossWeight("");
        w1008UpdateDomain.getCriteriaDomain().setSupplierMainMark("");
        return w1008UpdateDomain;
    }
}
