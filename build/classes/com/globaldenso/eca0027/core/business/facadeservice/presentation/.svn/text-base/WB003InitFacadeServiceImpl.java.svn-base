/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.WB001OdrRcvDomain;
import com.globaldenso.eca0027.core.business.domain.WB003CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.WB003ListDomain;
import com.globaldenso.eca0027.core.business.service.WB001OdrRcvService;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.DateUtil;


/**
 * This is an implement class of the Facade service to Init action of ordering two or moreP / O registration picture.
 * <br />受注複数P/O登録画面のInitアクションに対するFacadeサービスの実装クラスです。
 *
 * @version $Revision: 5759 $
 */
public class WB003InitFacadeServiceImpl extends AbstractSearchFacadeService<List<? extends WB003ListDomain>, WB003CriteriaDomain> {

    /**
     * Ordering business services
     * <br />受注業務サービス
     */
    protected WB001OdrRcvService wb001OdrRcvService;

    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public WB003InitFacadeServiceImpl() {
    }
    
    /**
     * Setter method for WB001OdrRcvServic.
     *
     * @param wb001OdrRcvService Set for wb001OdrRcvService
     */
    public void setWb001OdrRcvService(WB001OdrRcvService wb001OdrRcvService) {
        this.wb001OdrRcvService = wb001OdrRcvService;
    }
    
    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * No Action
     * 
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected WB003CriteriaDomain filterDomain(WB003CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {
        return criteriaDomain;
    }
    
    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * No Action
     * 
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(WB003CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // No Action
        // 処理なし
    }
    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * No Action
     * 
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(WB003CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // No Action
        // 処理なし
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * No Action
     * 
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(WB003CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // No Action
        // 処理なし
    }
    
    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * A create of - Customer Order Receiving domain
     *       {@link WB003CriteriaDomain} is changed into {@link WB001OdrRcvDomain}.
     *
     * - Export-Receive-Order information retrieval
     *       This is a call about {@link WB001OdrRcvService#serchOnMultiPoRegister (WB001OdrRcvDomain)}.
     *
     * A create of - List domain
     *       {@link WB003ListDomain} is created and the contents of {@link WB001OdrRcvDomain} are set up.
     *
     * A return of - List domain
     * 
     * - Customer Order Receivingドメインの作成
     *     {@link WB003CriteriaDomain}を{@link WB001OdrRcvDomain}に変換
     *     
     * - 輸出受注情報検索
     *     {@link WB001OdrRcvService#serchOnMultiPoRegister(WB001OdrRcvDomain)}を呼出
     *     
     * - Listドメインの作成
     *     {@link WB003ListDomain}を作成し、{@link WB001OdrRcvDomain}の内容を設定
     * 
     * - Listドメインの返却
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @SuppressWarnings("unchecked")
    @Override
    protected List<? extends WB003ListDomain> callServices(WB003CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {
        
        // A create of a Customer Order Receiving domain
        // Customer Order Receivingドメインの作成
        WB001OdrRcvDomain odrRcv = createOdrRcv(criteriaDomain);
        
        // Export-Receive-Order information retrieval
        // 輸出受注情報検索
        List<WB001OdrRcvDomain> resultOdrRcvList = (List<WB001OdrRcvDomain>)wb001OdrRcvService.serchOnMultiPoRegister(odrRcv);
        
        // A create of a List domain, a return of a List domain
        // Listドメインの作成、Listドメインの返却
        return convertToListDomain(criteriaDomain, resultOdrRcvList);
    }
    
    /**
     * {@link WB003CriteriaDomain} to {@link WB001OdrRcvDomain} is created.
     * <br />{@link WB003CriteriaDomain}から{@link WB001OdrRcvDomain}を作成します。
     *
     * @param criteriaDomain {@link WB003CriteriaDomain}
     * @return Created {@link WB001OdrRcvDomain}<br />作成した{@link WB001OdrRcvDomain}
     */
    protected WB001OdrRcvDomain createOdrRcv(WB003CriteriaDomain criteriaDomain) {
        // BL domain -- repacking
        // BLドメインへの詰め替え
        WB001OdrRcvDomain odrRcv = new WB001OdrRcvDomain();
        
        CommonUtil.copyPropertiesDomainToDomain(odrRcv, criteriaDomain, criteriaDomain.getScreenDateFormat());
        
        // Setting of a PACKAGE CODE
        // 包装区分の設定
        odrRcv.setPkgCd(convertBlankToSpace(criteriaDomain.getPkgCd()));
        
        return odrRcv;
    }
    
    /**
     * The list of {@link WB003ListDomain} is created from the list of {@link WB001OdrRcvDomain}.
     * <br />{@link WB001OdrRcvDomain}のリストから{@link WB003ListDomain}のリストを作成します。
     *
     * @param criteriaDomain {@link WB003CriteriaDomain}
     * @param odrRcvList The list of {@link WB001OdrRcvDomain}<br />{@link WB001OdrRcvDomain}のリスト
     * @return Created {@link WB003ListDomain}<br />作成した{@link WB003ListDomain}
     */
    protected List<WB003ListDomain> convertToListDomain(WB003CriteriaDomain criteriaDomain, List<? extends WB001OdrRcvDomain> odrRcvList) {
        // Date format
        // 日付フォーマット
        String screenDateFormat = criteriaDomain.getScreenDateFormat();
        
        // List of list domains
        // リストドメインのリスト
        List<WB003ListDomain> listDomainList = new ArrayList<WB003ListDomain>();
        
        if (odrRcvList != null && odrRcvList.size() > 0) {
            for (int i = 0; i < odrRcvList.size(); i++) {
                WB001OdrRcvDomain wB001OdrRcvDomain = odrRcvList.get(i);
                
                WB003ListDomain listDomain = new WB003ListDomain();
                
                listDomain.setNo(i + 1);
                listDomain.setFirmQty(convertZeroToBlank(wB001OdrRcvDomain.getFirmQty()));
                listDomain.setForecastQty(convertZeroToBlank(wB001OdrRcvDomain.getForecastQty()));
                listDomain.setCustomerDueDt(DateUtil.formatDate(wB001OdrRcvDomain.getCustomerDueDt(), screenDateFormat));
                listDomain.setPltzAllocQty(String.valueOf(wB001OdrRcvDomain.getPltzAllocQty()));
                listDomain.setCustomerItemNo(wB001OdrRcvDomain.getCustomerItemNo());
                listDomain.setCustomerPoNo(wB001OdrRcvDomain.getCustomerPoNo());
                listDomain.setSalesCompPoNo(wB001OdrRcvDomain.getSalesCompPoNo());
                listDomain.setCustomerPoNoHidden(wB001OdrRcvDomain.getCustomerPoNo());
                listDomain.setOdrCtrlNo(String.valueOf(wB001OdrRcvDomain.getOdrCtrlNo()));
                listDomain.setCustomerItemNoHidden(wB001OdrRcvDomain.getCustomerItemNo());
                listDomain.setCustomerItemNoOrg(wB001OdrRcvDomain.getCustomerItemNoOrg());
                listDomain.setSalesCompPoNoHidden(wB001OdrRcvDomain.getSalesCompPoNo());
                listDomain.setOdrQty(String.valueOf(wB001OdrRcvDomain.getOdrQty()));
                listDomain.setOdrQtyOrg(String.valueOf(wB001OdrRcvDomain.getOdrQtyOrg()));
                listDomain.setPltzAllocQtyHidden(String.valueOf(wB001OdrRcvDomain.getPltzAllocQty()));
                listDomain.setShippedQty(String.valueOf(wB001OdrRcvDomain.getShippedQty()));
                listDomain.setPartialDelivCnt(String.valueOf(wB001OdrRcvDomain.getPartialDelivCnt()));
                listDomain.setUpdateTimestamp(wB001OdrRcvDomain.getComUpdateTimestamp().toString());
                listDomain.setComUpdateTimestamp(wB001OdrRcvDomain.getComUpdateTimestamp());
                listDomain.setIndex(String.valueOf(i));
                
                listDomainList.add(listDomain);
            }
        }
        
        for (int i = listDomainList.size(); i < 20; i++) {
            
            WB003ListDomain blankData = new WB003ListDomain();
            blankData.setNo(i + 1);
            blankData.setFirmQty("");
            blankData.setForecastQty("");
            blankData.setCustomerDueDt("");
            blankData.setPltzAllocQty("");
            blankData.setCustomerItemNo(criteriaDomain.getCustomerItemNo());
            blankData.setCustomerPoNo(criteriaDomain.getCustomerPoNo());
            blankData.setSalesCompPoNo("");
            blankData.setOdrCtrlNo("");
            blankData.setCustomerItemNoHidden("");
            blankData.setCustomerItemNoOrg("");
            blankData.setSalesCompPoNoHidden("");
            blankData.setOdrQty("");
            blankData.setOdrQtyOrg("");
            blankData.setPltzAllocQtyHidden("");
            blankData.setShippedQty("");
            blankData.setPartialDelivCnt("");
            blankData.setComUpdateTimestamp(null);
            blankData.setIndex(String.valueOf(i));
            
            listDomainList.add(blankData);
        }
        
        return listDomainList;
    }
    
    /**
     * When an argument is Blank, Space is returned, and in except, an argument is returned.
     * <br />引数がBlankの場合Spaceを返し、以外の場合引数を返します。
     *
     * @param val Numerical value<br />数値
     * @return In Blank, this is a VALUE of an argument except Space.<br />Blankの場合Space、以外は引数の値
     */
    protected String convertBlankToSpace(String val){
        if (StringUtils.isBlank(val)){
            return new String(" ");
        } else {
            return val;
        }
    }
    
    /**
     * When an argument is Zero is returned, and in except, an argument is returned.
     * <br />引数がZeroの場合Blankを返し、以外の場合引数を返します。
     *
     * @param val Numerical value<br />数値
     * @return In Zero, this is a VALUE of an argument except Blank.<br />Zeroの場合Blank、以外は引数の値
     */
    protected String convertZeroToBlank(BigDecimal val){
        if (val == null || BigDecimal.ZERO.equals(val)){
            return new String("");
        } else {
            return val.toString();
        }
    }
}
