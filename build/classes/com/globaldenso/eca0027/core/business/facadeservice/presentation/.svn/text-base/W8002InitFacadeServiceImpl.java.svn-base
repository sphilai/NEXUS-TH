/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FORMAT_PRICE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FORMAT_VOLUME;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FORMAT_WEIGHT;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W8001ProgCtrlDomain;
import com.globaldenso.eca0027.core.business.domain.W8002CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W8001ProgCtrlCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W8001ProgCtrlService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.DateUtil;
import com.globaldenso.gscm.framework.util.NumberUtil;
import com.globaldenso.gscm.framework.util.StringUtil;

/**
 * An implementation class of the Facade service to initial action of progress control detail screen.
 * <br />進度管理詳細画面のInitアクションに対するFacadeサービスの実装クラスです。
 * 
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W8002InitFacadeServiceImpl extends AbstractSearchFacadeService<W8002CriteriaDomain, W8002CriteriaDomain> {

    /**
     * Progress control service
     * <br />進度管理のサービス
     */
    protected W8001ProgCtrlService w8001ProgCtrlService;

    /**
     * Common Service.
     */
    protected CommonService commonService;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W8002InitFacadeServiceImpl() {
        super();
    }
    
    /**
     * Setter method for w8001ProgCtrlService.
     *
     * @param progCtrlService Set for w8001ProgCtrlService
     */
    public void setW8001ProgCtrlService(W8001ProgCtrlService progCtrlService) {
        w8001ProgCtrlService = progCtrlService;
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
     * {@inheritDoc}
     * <pre>
     * No action.
     * </pre>
     * <pre>
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W8002CriteriaDomain filterDomain(W8002CriteriaDomain w8002CriteriaDomain)
        throws GscmApplicationException, ApplicationException {
        return w8002CriteriaDomain;
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
    protected void validateItems(W8002CriteriaDomain w8002CriteriaDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {
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
    protected void validateConsistency(W8002CriteriaDomain w8002CriteriaDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {
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
    protected void validateDatabase(W8002CriteriaDomain w8002CriteriaDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {
    }

    /**
     * {@inheritDoc}
     * <pre>
     * - Create criteria domain for progress control service.
     * Convert {@link W8002CriteriaDomain} to {@link W8001ProgCtrlCriteriaDomain}.
     * - Get search result.
     * Call  {@link W8001ProgCtrlService#searchOnDetailInit}.
     * </pre>
     * <pre>
     * ‐進度管理サービスの条件ドメインを作成
     *     {@link W8002CriteriaDomain}を{@link W8001ProgCtrlCriteriaDomain}に変換する
     * 
     * ‐検索結果データ取得
     *     {@link W8001ProgCtrlService#searchOnDetailInit}を呼出す
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W8002CriteriaDomain callServices(W8002CriteriaDomain w8002CriteriaDomain)
        throws GscmApplicationException, ApplicationException {

        W8001ProgCtrlCriteriaDomain criteria = createProgCtrlCriteriaDomain(w8002CriteriaDomain);

        W8001ProgCtrlDomain progCtrl = w8001ProgCtrlService.searchOnDetailInit(criteria);
        
        return convertToDomain(progCtrl, w8002CriteriaDomain.getScreenDateFormat());
    }


    /**
     * Create criteria domain for progress control service.
     * <br />進度管理サービスの条件ドメインを作成します。
     *
     * @param w8002CriteriaDomain  Criteria domain of progress control main screen<br />
     * 進度管理Main画面の条件ドメイン
     * @return  Criteria domain for progress control service<br />
     * 進度管理サービスの条件ドメイン
     */
    protected W8001ProgCtrlCriteriaDomain createProgCtrlCriteriaDomain(W8002CriteriaDomain w8002CriteriaDomain) {
        W8001ProgCtrlCriteriaDomain progCtrlCriteriaDomain = new W8001ProgCtrlCriteriaDomain();
        
        progCtrlCriteriaDomain.setMainMark(w8002CriteriaDomain.getCmlNo());
        
        return progCtrlCriteriaDomain;
    }

    /**
     * Convert progress control domain to detail screen domain.
     * <br />進度管理ドメインを詳細画面ドメインに変換します。
     *
     * @param progCtrl Search result<br />
     * 検索結果
     * @param dateFormat Date format<br />
     * 日付フォーマット
     * @return Conversion result<br />
     * 変換結果
     * @throws ApplicationException If it fails to set the search criteria domain.<br />
     * 検索条件ドメインの設定に失敗した場合
     */
    protected W8002CriteriaDomain convertToDomain(W8001ProgCtrlDomain progCtrl, String dateFormat) 
        throws ApplicationException {
        W8002CriteriaDomain result = new W8002CriteriaDomain();
        
        if (progCtrl != null) {

            CommonUtil.copyPropertiesDomainToDomain(result, progCtrl, dateFormat);
            
            result.setShipperCompNmAbb(progCtrl.getCompNmAbb2());
            result.setConsigneeCompNmAbb(progCtrl.getCompNmAbb1());
            result.setNexusShipToNmAbb(progCtrl.getShipToNmAbb1());
            result.setCustNoShipToNmAbb(progCtrl.getShipToNmAbb2());;
            
            result.setVolume(StringUtil.getEmptyToBlank(NumberUtil.format(progCtrl.getVolume(), FORMAT_VOLUME)) 
                + " " + progCtrl.getVolumeUnitDisp());
            result.setNetWeight(StringUtil.getEmptyToBlank(NumberUtil.format(progCtrl.getNetWeight(), FORMAT_WEIGHT)) 
                + " " + progCtrl.getWeightUnitDisp());
            result.setGrossWeight(StringUtil.getEmptyToBlank(NumberUtil.format(progCtrl.getGrossWeight(), FORMAT_WEIGHT)) 
                + " " + progCtrl.getWeightUnitDisp());
            result.setMainMark(progCtrl.getXmainMark());
            
            String volume = NumberUtil.format(progCtrl.getTotalVolume(), FORMAT_VOLUME);
            if (volume != null) {
                result.setTotalVolume(StringUtil.getEmptyToBlank(volume) 
                    + " " + commonService.searchMeasureUnitDisp(progCtrl.getTotalVolumeUnit()));
            }
            String netWeight = NumberUtil.format(progCtrl.getTotalNetWeight(), FORMAT_WEIGHT);
            if (netWeight != null) {
                result.setTotalNetWeight(StringUtil.getEmptyToBlank(netWeight) 
                    + " " + commonService.searchMeasureUnitDisp(progCtrl.getTotalWeightUnit()));
            }
            String grossWeight = NumberUtil.format(progCtrl.getTotalGrossWeight(), FORMAT_WEIGHT);
            if (grossWeight != null){
                result.setTotalGrossWeight(StringUtil.getEmptyToBlank(grossWeight) 
                    + " " + commonService.searchMeasureUnitDisp(progCtrl.getTotalWeightUnit()));
            }
            
            String payMeth = "";
            if (progCtrl.getPayMeth() != null) {
                payMeth = progCtrl.getPayMeth();
            }
            result.setPayMeth(payMeth);
            
            result.setInsurance(NumberUtil.format(progCtrl.getInsurance(), FORMAT_PRICE));
            result.setFreight(NumberUtil.format(progCtrl.getFreight(), FORMAT_PRICE));
            
            String netAmount = "";
            if (progCtrl.getNetAmount() != null) {
                netAmount = NumberUtil.format(progCtrl.getNetAmount(), FORMAT_PRICE);
            }
            result.setNetAmount(netAmount);
            String totalInvoiceAmount = "";
            if (progCtrl.getTotalInvoiceAmount() != null) {
                totalInvoiceAmount = NumberUtil.format(progCtrl.getTotalInvoiceAmount(), FORMAT_PRICE);
            }
            result.setTotalInvoiceAmount(totalInvoiceAmount);
            String atd = DateUtil.formatDate(progCtrl.getAtd(), dateFormat);
            result.setAtd(atd);
            String eta = DateUtil.formatDate(progCtrl.getEta(), dateFormat);
            result.setEta(eta);
        }
        return result;
    }
}
