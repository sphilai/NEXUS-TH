/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GRP_NO2_MAIN;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FORMAT_VOLUME;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FORMAT_WEIGHT;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W6001DocInvoiceDomain;
import com.globaldenso.eca0027.core.business.domain.W6009CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W6001DocCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W6001DocService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.NumberUtil;

/**
 * An implementation class of service for the Facade ChangeFrtShipper action Documentation Invoice Detail of (Full Returnable) screen.
 * <br />通関書類作成業務 Invoice Detail(Full Returnable)画面のChangeFrtShipperアクションに対するFacadeサービスの実装クラスです。
 * <pre>
 * bean id: w6009ChangeFrtShipperFacadeService
 * </pre>
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 11869 $
 */
public class W6009ChangeFrtShipperFacadeServiceImpl extends AbstractSearchFacadeService<W6009CriteriaDomain, W6009CriteriaDomain>{
    
    /**
     * Documentation Service<br />
     * Documentation サービス
     */
    protected W6001DocService w6001DocService;

    /**
     * Common services<br />
     * 共通サービス
     */
    protected CommonService commonService;
    
    /**
     * Default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W6009ChangeFrtShipperFacadeServiceImpl(){
        super();
    }
    
    /**
     * Setter method for w6001DocService.
     *
     * @param docService Set for w6001DocService
     */
    public void setW6001DocService(W6001DocService docService) {
        w6001DocService = docService;
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
     * No action
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W6009CriteriaDomain filterDomain(W6009CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {
        return criteriaDomain;
    }
    

    /**
     * {@inheritDoc}
     * <pre>
     * No action
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W6009CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * No action
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W6009CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * No action
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W6009CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
    }

    /**
     * Call to the business processing Service.
     * <br />業務処理Serviceの呼び出しを行う。
     * 
     * <br />
     * <pre>
     * - Create the search condition domain. 
     *     Create the {@link W6001DocCriteriaDomain}.
     *     
     * - Recalculate the weight and unit conversion, the volume.
     * </pre>
     * <pre>
     * - 検索条件ドメインを作成する
     *     {@link W6001DocCriteriaDomain}を作成する
     *     
     * -単位変換と重量、容積の再計算をする
     * </pre>
     * 
     * 
     * @throws GscmApplicationException GSCM application exception<br />
     * GSCMアプリケーション例外
     * @throws ApplicationException If an exception occurs during a call to the business processing Service<br />
     * 業務処理Serviceの呼び出し時に例外が発生した場合
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    /**
     * {@inheritDoc}
     * <pre>
     * - Set of search criteria domain
     * - Re-calculation and unit conversion, weight, volume
     * </pre>
     * <pre>
     * ‐検索条件ドメインの設定
     * 
     * ‐単位変換と、重量、容積の再計算
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W6009CriteriaDomain callServices(W6009CriteriaDomain criteriaDomain) 
        throws GscmApplicationException, ApplicationException {
        
        W6001DocCriteriaDomain docCriteria = prepareCriteriaDomain(criteriaDomain);
        
        W6001DocInvoiceDomain resultDomain = w6001DocService.searchOnRegisterChangeFrtShipper(docCriteria);
        
        return convertW6009CriteriaDomain(resultDomain, criteriaDomain);
    }
    
    /**
     * 
     * Convert to the BL layer from the screen for domain domain.
     * <br />画面用ドメインからBL層用ドメインに変換します。
     * 
     * @param criteriaDomain Screen for the search criteria domain<br />
     * 画面用検索条件ドメイン
     * @return BL layer search criteria domain<br />
     * BL層用検索条件ドメイン
     */
    protected W6001DocCriteriaDomain prepareCriteriaDomain (W6009CriteriaDomain criteriaDomain) {
        W6001DocCriteriaDomain docCriteria = new W6001DocCriteriaDomain();
        
        String dateFormat = criteriaDomain.getScreenDateFormat();
        
        CommonUtil.copyPropertiesDomainToDomain(docCriteria, criteriaDomain, dateFormat);
        
        docCriteria.setDscId(criteriaDomain.getLoginUserDscId());
        
        return docCriteria;
    }
    
    /**
     * 
     * (Transition from the Main screen) Transform to the screen display data from the getting data.
     * <br />取得したデータを画面表示データに変換します（Main画面から遷移時）
     * 
     * @param docInvDomain Invoice domain of search results obtained<br />
     * 取得した検索結果のインボイスドメイン
     * @param criteriaDomain Search conditions domain<br />
     * 検索条件ドメイン
     * @return Screen display search criteria domain<br />
     * 画面表示用検索条件ドメイン
     * @throws ApplicationException ApplicationException
     */
    protected W6009CriteriaDomain convertW6009CriteriaDomain (W6001DocInvoiceDomain docInvDomain, W6009CriteriaDomain criteriaDomain)
        throws ApplicationException {
        
        criteriaDomain.setWeightUnit(docInvDomain.getWeightUnit());
        criteriaDomain.setWeightUnitDisp(commonService.searchMeasureUnitDisp(docInvDomain.getWeightUnit()));
        criteriaDomain.setTotalNetWeight(NumberUtil.format(docInvDomain.getTotalNetWeight(), FORMAT_WEIGHT));
        
        if (GRP_NO2_MAIN.equals(criteriaDomain.getGrpNo2())) {
            criteriaDomain.setVolumeUnit(docInvDomain.getVolumeUnit());
            criteriaDomain.setVolumeUnitDisp(commonService.searchMeasureUnitDisp(docInvDomain.getVolumeUnit()));
            criteriaDomain.setTotalVolume(NumberUtil.format(docInvDomain.getTotalVolume(), FORMAT_VOLUME));
            criteriaDomain.setTotalGrossWeight(NumberUtil.format(docInvDomain.getTotalGrossWeight(), FORMAT_WEIGHT));
        } else {
            criteriaDomain.setVolumeUnit(null);
            criteriaDomain.setVolumeUnitDisp(null);
            criteriaDomain.setTotalVolume(null);
            criteriaDomain.setTotalGrossWeight(null);
            criteriaDomain.setTotalNetWeightOverflowFlg(docInvDomain.getTotalNetWeightOverflowFlg());
                // ST959 UNIT CONVERSION ADD
        }
        return criteriaDomain;
    }
}
