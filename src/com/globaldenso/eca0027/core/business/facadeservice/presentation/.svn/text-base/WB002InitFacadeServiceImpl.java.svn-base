/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.WB001OdrRcvDomain;
import com.globaldenso.eca0027.core.business.domain.WB002CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.WB002ListDomain;
import com.globaldenso.eca0027.core.business.domain.WB002UpdateDomain;
import com.globaldenso.eca0027.core.business.service.WB001OdrRcvService;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.DateUtil;

/**
 * This is an implement class of the Facade service to Init action of ordering registration picture.
 * <br />受注登録画面のInitアクションに対するFacadeサービスの実装クラスです。
 *
 * @version $Revision: 6761 $
 */
public class WB002InitFacadeServiceImpl extends AbstractSearchFacadeService<WB002UpdateDomain, WB002CriteriaDomain> {
    
    /**
     * Ordering business services
     * <br />受注業務サービス
     */
    protected WB001OdrRcvService wb001OdrRcvService;

    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public WB002InitFacadeServiceImpl() {
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
    protected WB002CriteriaDomain filterDomain(WB002CriteriaDomain criteriaDomain)
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
    protected void validateItems(WB002CriteriaDomain criteriaDomain)
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
    protected void validateConsistency(WB002CriteriaDomain criteriaDomain)
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
    protected void validateDatabase(WB002CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // No Action
        // 処理なし
    }
    
    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * A create of - Customer Order Receiving domain
     *       {@link WB002CriteriaDomain} is changed into {@link WB001OdrRcvDomain}.
     *
     * - Export-Receive-Order information retrieval
     *       This is a call about {@link WB001OdrRcvService#searchOnRegisterInit(WB001OdrRcvDomain)}.
     *
     * A create of - Update domain
     *       {@link WB002UpdateDomain} is created and the contents of {@link WB001OdrRcvDomain} are set up.
     *
     * A return of - Update domain
     * 
     * - Customer Order Receivingドメインの作成
     *     {@link WB002CriteriaDomain}を{@link WB001OdrRcvDomain}に変換
     *     
     * - 輸出受注情報検索
     *     {@link WB001OdrRcvService#searchOnRegisterInit(WB001OdrRcvDomain)}を呼出
     *     
     * - Updateドメインの作成
     *     {@link WB002UpdateDomain}を作成し、{@link WB001OdrRcvDomain}の内容を設定
     * 
     * - Updateドメインの返却
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected WB002UpdateDomain callServices(WB002CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {
        
        // A create of a Customer Order Receiving domain
        // Customer Order Receivingドメインの作成
        WB001OdrRcvDomain odrRcv = createOdrRcv(criteriaDomain);
        
        // Export-Receive-Order information retrieval
        // 輸出受注情報検索
        WB001OdrRcvDomain resultOdrRcv = wb001OdrRcvService.searchOnRegisterInit(odrRcv);
        
        // A create of a Update domain
        // Updateドメインの作成
        return convertToListDomain(criteriaDomain, resultOdrRcv);
    }
    
    /**
     * {@link WB002CriteriaDomain} to {@link WB001OdrRcvDomain} is created.
     * <br />{@link WB002CriteriaDomain}から{@link WB001OdrRcvDomain}を作成します。
     *
     * @param criteriaDomain {@link WB002CriteriaDomain}
     * @return Created {@link WB001OdrRcvDomain}<br />作成した{@link WB001OdrRcvDomain}
     * @throws ApplicationException When the date conversion error occurs<br />日付変換エラーが発生した場合
     */
    @SuppressWarnings("deprecation")
    protected WB001OdrRcvDomain createOdrRcv(WB002CriteriaDomain criteriaDomain) throws ApplicationException {
        
        WB001OdrRcvDomain odrRcv = new WB001OdrRcvDomain();
        
        CommonUtil.copyPropertiesDomainToDomain(odrRcv, criteriaDomain, criteriaDomain.getScreenDateFormat());
        
        // Setting of a PACKAGE CODE
        // 包装区分の設定
        odrRcv.setPkgCd(convertBlankToSpace(criteriaDomain.getPkgCd()));
        
        // Copy of the date list
        // 日付リストのコピー
        List<Date> dateList = new ArrayList<Date>();
        for (String strDate : criteriaDomain.getDateList()){
            SimpleDateFormat sdf = new SimpleDateFormat(criteriaDomain.getScreenDateFormat());
            try {
                Date date = sdf.parse(strDate);
                dateList.add(date);
            } catch (ParseException e) {
                throw new ApplicationException(e);
            }
        }
        odrRcv.setDateList(dateList);
        
        return odrRcv;

    }
    
    /**
     * {@link WB001OdrRcvDomain} to {@link WB002UpdateDomain} is created.
     * <br />{@link WB001OdrRcvDomain}から{@link WB002UpdateDomain}を作成します。
     *
     * @param criteriaDomain {@link WB002CriteriaDomain}
     * @param odrRcv {@link WB001OdrRcvDomain}
     * @return Created {@link WB002UpdateDomain}<br />作成した{@link WB002UpdateDomain}
     */
    @SuppressWarnings("deprecation")
    protected WB002UpdateDomain convertToListDomain(WB002CriteriaDomain criteriaDomain, WB001OdrRcvDomain odrRcv) {
        // Acquisition of Date format
        // 日付フォーマットの取得
        String screenDateFormat = criteriaDomain.getScreenDateFormat();
        
        // Acquisition of an Export-Receive-Order (parents) domain
        // 輸出受注（親）ドメインの取得
        WB001OdrRcvDomain parentOdrRcv = odrRcv;
        
        // Acquisition of an Export-Receive-Order (sub) domain list
        // 輸出受注（子）ドメインリストの取得
        List<? extends WB001OdrRcvDomain> childOdrRcvList = parentOdrRcv.getOdrRcvDomainList();
        
        // Export-Receive-Order (parents) domain is copied to a search-condition domain.
        // 輸出受注（親）ドメインを検索条件ドメインにコピー
        CommonUtil.copyPropertiesDomainToDomain(criteriaDomain, parentOdrRcv, screenDateFormat);
        
        // date list is copied to a search-condition domain.
        // 日付リストを検索条件ドメインにコピー
        List<String> dateList = new ArrayList<String>();
        for (Date date : parentOdrRcv.getDateList()){
            String strDate = DateUtil.formatDate(date, screenDateFormat);
            dateList.add(strDate);
        }
        criteriaDomain.setDateList(dateList);
        
        // the monthly total ordering QUANTITY is copied to a search-condition domain.
        // 月別総受注数量を検索条件ドメインにコピー
        /*
         * With 426 lines "(List) List destList = obj.getClass().newInstance();" of ScreenInfoStackRequestProcessor
         * When obj is Arrays$arrayList, it becomes an error and does not Stack.
         * Copy manually.
         * <br/>ScreenInfoStackRequestProcessorの426行「List destList = (List)obj.getClass().newInstance();」で
         * objがArrays$arrayListの場合エラーとなってStackされない。
         * 手動でコピーしておく。
         */ 
        List<String> totalQtyList = new ArrayList<String>();
        for (BigDecimal qty : parentOdrRcv.getTotalQty()){
            String strQty = qty.toString();
            totalQtyList.add(strQty);
        }
        criteriaDomain.setTotalQty(totalQtyList);
        
        int index = 0;
        
        // Export-Receive-Order (sub) domain list is copied to a list domain list.
        // 輸出受注（子）ドメインリストをリストドメインリストにコピー
        List<WB002ListDomain> listDomainList = new ArrayList<WB002ListDomain>();
        for (WB001OdrRcvDomain childOdrRcv : childOdrRcvList){
            WB002ListDomain listDomain = new WB002ListDomain();
            
            // Export-Receive-Order (sub) domain is copied to a list domain.
            // 輸出受注（子）ドメインをリストドメインにコピー
            CommonUtil.copyPropertiesDomainToDomain(listDomain, childOdrRcv, screenDateFormat);
            
            listDomain.setFirmQty(convertZeroToBlank(childOdrRcv.getFirmQty()));
            listDomain.setForecastQty(convertZeroToBlank(childOdrRcv.getForecastQty()));
            
            listDomain.setCustomerPoNoHidden(childOdrRcv.getCustomerPoNo());
            listDomain.setCustomerItemNoHidden(childOdrRcv.getCustomerItemNo());
            listDomain.setSalesCompPoNoHidden(childOdrRcv.getSalesCompPoNo());
            
            if (childOdrRcv.getPltzAllocQty() != null){
                listDomain.setPltzAllocQtyHidden(childOdrRcv.getPltzAllocQty().toString());
            }
            if (childOdrRcv.getComUpdateTimestamp() != null){
                listDomain.setUpdateTimestamp(childOdrRcv.getComUpdateTimestamp().toString());
            }
            
            if (childOdrRcv.getCount() != null){
                listDomain.setCountHidden(childOdrRcv.getCount().toString());
            }
            
            listDomain.setIndex(Integer.toString(index));
            index++;
            
            // Export-Receive-Order information retrieval result . count
            // 輸出受注情報検索結果.カウント
            BigDecimal recordCount = childOdrRcv.getCount();
            
            if (recordCount != null && BigDecimal.ONE.compareTo(recordCount) < 0) {
                // Export-Receive-Order information retrieval result . count > In the case of 1
                // 輸出受注情報検索結果.カウント > 1の場合
                listDomain.setCustomerDueDt("");
                listDomain.setCustomerItemNo("");
                listDomain.setCustomerPoNo("");
                listDomain.setSalesCompPoNo("");
            } else if (recordCount != null && BigDecimal.ONE.compareTo(recordCount) == 0){
                // Export-Receive-Order information retrieval result . count = in the case of 1
                // 輸出受注情報検索結果.カウント = 1の場合
                listDomain.setCount("");
            } else {
                listDomain.setCustomerItemNoHidden("");
            }
            
            listDomainList.add(listDomain);
        }
        
        // search-condition domain, and a list domain list are set as a mass update domain.
        // 検索条件ドメイン、リストドメインリストを一括更新ドメインに設定
        WB002UpdateDomain updateDomain = new WB002UpdateDomain();
        updateDomain.setCriteriaDomain(criteriaDomain);
        updateDomain.setListDomainList(listDomainList);
        
        return updateDomain;
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
