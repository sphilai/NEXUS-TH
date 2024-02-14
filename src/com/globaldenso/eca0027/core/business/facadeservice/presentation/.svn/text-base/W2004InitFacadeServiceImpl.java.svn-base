/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.VtCompMeasureUnitDomain;
import com.globaldenso.eca0027.core.business.domain.W2001PltzInstrDomain;
import com.globaldenso.eca0027.core.business.domain.W2001PltzInstrItemDomain;
import com.globaldenso.eca0027.core.business.domain.W2004CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W2004ListDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W2001PltzInstrCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W2001PltzInstrItemCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W2001PltzInstrService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.DateUtil;
import com.globaldenso.gscm.framework.util.NumberUtil;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_N;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FORMAT_WEIGHT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NO_DATA;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W2001;

/**
 * This is an implement class of the Facade service to Init action of a Packaging Instruction (=Pull) Register screen.
 * <br />梱包指示Register画面のInitアクションに対するFacadeサービスの実装クラスです。
 * <pre>
 * bean id: w2004InitFacadeService
 * </pre>
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W2004InitFacadeServiceImpl extends AbstractSearchFacadeService<List<? extends W2004ListDomain>, W2004CriteriaDomain> {

    /**
     * Common service
     * <br />共通サービス
     */
    protected CommonService commonService;
    
    /**
     * Packaging Instruction (=Pull) service
     * <br />梱包指示サービス
     */
    protected W2001PltzInstrService w2001PltzInstrService;
    

    /**
     * constructor
     * <br />デフォルトコンストラクタです。
     */
    public W2004InitFacadeServiceImpl() {
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
     * Setter method for w2001PltzInstrService.
     *
     * @param pltzInstrService Set for w2001PltzInstrService
     */
    public void setW2001PltzInstrService(W2001PltzInstrService pltzInstrService) {
        w2001PltzInstrService = pltzInstrService;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * No Action
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W2004CriteriaDomain filterDomain(W2004CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {
        return criteriaDomain;
    }
    /**
     * {@inheritDoc}
     * <pre>
     * No Action
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W2004CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // No Action
        // 処理なし
    }

    /**
     * {@inheritDoc}
     * <pre>
     * No Action
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W2004CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // No Action
        // 処理なし
    }

    /**
     * {@inheritDoc}
     * <pre>
     * No Action
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W2004CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // No Action
        // 処理なし
    }

    /**
     * {@inheritDoc}
     * <pre>
     * At the time of the changes from - Main screen
     *       - Create of a search-condition domain
     *           A search condition is set to {@link W2001PltzInstrCriteriaDomain}.
     *
     *       - Search of a Packaging Instruction (=Pull)
     *         call {@link W2001PltzInstrService#searchOnRegisterInitByFromMain(W2001PltzInstrCriteriaDomain)} in {@link W2001PltzInstrCriteriaDomain} 
     *
     *       - Create of List domain
     *           {@link W2004ListDomain} is created and the contents of {@link W2001PltzInstrDomain} and {@link W2001PltzInstrItemDomain} are set up.
     *
     *       Return of - List domain
     *
     * At the time of the changes from - Create screen
     *       - Create of a search-condition domain
     *           A search condition is set to {@link W2001PltzInstrItemCriteriaDomain}.
     *
     *       - Search of Palletize Instruction Item No Work
     *         call {@link W2001PltzInstrService#searchOnRegisterInitByFromCreate(W2001PltzInstrItemCriteriaDomain)} in {@link W2001PltzInstrItemCriteriaDomain}
     *
     *       - Create of List domain
     *           {@link W2004ListDomain} is created and the contents of {@link W2001PltzInstrItemDomain} are set up.
     *
     *       Return of - List domain
     *
     * - Main画面からの遷移時
     *     - 検索条件ドメインの作成
     *         {@link W2001PltzInstrCriteriaDomain}に検索条件を設定する
     *         
     *     - 梱包指示の検索
     *         {@link W2001PltzInstrCriteriaDomain}を引数に{@link W2001PltzInstrService#searchOnRegisterInitByFromMain(W2001PltzInstrCriteriaDomain)}を呼出す
     *         
     *     - Listドメインの作成
     *         {@link W2004ListDomain}を作成し、{@link W2001PltzInstrDomain}、{@link W2001PltzInstrItemDomain}の内容を設定する
     *           
     *     - Listドメインの返却
     *     
     * - Create画面からの遷移時
     *     - 検索条件ドメインの作成
     *         {@link W2001PltzInstrItemCriteriaDomain}に検索条件を設定する
     *         
     *     - 梱包指示品目番号ワークの検索
     *         {@link W2001PltzInstrItemCriteriaDomain}を引数に{@link W2001PltzInstrService#searchOnRegisterInitByFromCreate(W2001PltzInstrItemCriteriaDomain)}を呼出す
     *         
     *     - Listドメインの作成
     *         {@link W2004ListDomain}を作成し、{@link W2001PltzInstrItemDomain}の内容を設定する
     *         
     *     - Listドメインの返却
     * </pre>
     * 
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected List<? extends W2004ListDomain> callServices(W2004CriteriaDomain criteriaDomain) 
        throws GscmApplicationException, ApplicationException {

        // Changes from a Main screen
        // Main画面からの遷移
        if (SCREEN_ID_W2001.equals(criteriaDomain.getCallScreenId())) {
            W2001PltzInstrCriteriaDomain pltzInstrCriteria = createPltzInstrCriteria(criteriaDomain);
            
            W2001PltzInstrDomain pltzInstr = searchPltzInstr(pltzInstrCriteria);
            
            return convertToListDomain(pltzInstr, criteriaDomain.getScreenDateFormat());

        // Changes from a Create screen
        // Create画面からの遷移
        } else {
            W2001PltzInstrItemCriteriaDomain pltzInstrItemCriteria = createPltzInstrItemCriteria(criteriaDomain);
            
            List<? extends W2001PltzInstrItemDomain> pltzInstrItemList = searchPltzInstrItemNo(pltzInstrItemCriteria);
            
            return convertToListDomain(pltzInstrItemList, criteriaDomain.getShipperCd());
        }
    }
    
    /**
     * Create the search-condition domain of a Packaging Instruction (=Pull). (at the time of the changes from a Main screen)
     * <br />梱包指示の検索条件ドメインを作成します。(Main画面からの遷移時)
     *
     * @param criteria The search-condition domain of a Packaging Instruction (=Pull) Register screen<br />梱包指示Register画面の検索条件ドメイン
     * @return The search-condition domain of a Packaging Instruction (=Pull)<br />梱包指示の検索条件ドメイン
     */
    protected W2001PltzInstrCriteriaDomain createPltzInstrCriteria(W2004CriteriaDomain criteria) {
        W2001PltzInstrCriteriaDomain pltzInstrCriteria = new W2001PltzInstrCriteriaDomain();
        
        CommonUtil.copyPropertiesDomainToDomain(pltzInstrCriteria, criteria);
        
        return pltzInstrCriteria;
    }
    
    /**
     *  Create the search-condition domain of a Palletize Instruction Item No Work. (at the time of the changes from a Create screen)
     * <br />梱包指示品目番号ワークの検索条件ドメインを作成します。(Create画面からの遷移時)
     *
     * @param criteria The search-condition domain of a Packaging Instruction (=Pull) Register screen<br />梱包指示Register画面の検索条件ドメイン
     * @return The search-condition domain of a Palletize Instruction Item No Work<br />梱包指示品目番号ワークの検索条件ドメイン
     */
    @SuppressWarnings("deprecation")
    protected W2001PltzInstrItemCriteriaDomain createPltzInstrItemCriteria(W2004CriteriaDomain criteria) {
        W2001PltzInstrItemCriteriaDomain pltzInstrItemCriteria = new W2001PltzInstrItemCriteriaDomain();

        // Setting of a search-condition domain
        // 検索条件ドメインの設定
        CommonUtil.copyPropertiesDomainToDomain(pltzInstrItemCriteria, criteria, criteria.getScreenDateFormat());
        
        // A setting of DSC-ID
        // DSC-IDの設定
        pltzInstrItemCriteria.setDscId(criteria.getLoginUserDscId());
        
        return pltzInstrItemCriteria;
    }

    /**
     * Search a Packaging Instruction (=Pull).(at the time of the changes from a Main screen)  
     * <br />梱包指示を検索します。(Main画面からの遷移時)
     *
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return The list of {@link W2001PltzInstrDomain}<br />{@link W2001PltzInstrDomain}のリスト
     * @throws ApplicationException When a Packaging Instruction (=Pull) is unacquirable<br />梱包指示が取得できない場合
     */
    protected W2001PltzInstrDomain searchPltzInstr(W2001PltzInstrCriteriaDomain criteria) 
        throws ApplicationException {
        return w2001PltzInstrService.searchOnRegisterInitByFromMain(criteria);
    }
    
    /**
     * Search a Palletize Instruction Item No Work.(at the time of the changes from a Create screen)
     * <br />梱包指示品目番号ワークを検索します。(Create画面からの遷移時)
     *
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return The list of {@link W2001PltzInstrItemDomain}<br />{@link W2001PltzInstrItemDomain}のリスト
     * @throws ApplicationException When a Palletize Instruction Item No Work is unacquirable<br />梱包指示品目番号ワークが取得できない場合
     */
    protected List<? extends W2001PltzInstrItemDomain> searchPltzInstrItemNo(W2001PltzInstrItemCriteriaDomain criteria)
        throws ApplicationException {
        return w2001PltzInstrService.searchOnRegisterInitByFromCreate(criteria);
    }
    
    /**
     * {@link W2001PltzInstrDomain} is changed into {@link W2004ListDomain}.(at the time of the changes from a Main screen)
     * <br />{@link W2001PltzInstrDomain}を{@link W2004ListDomain}に変換します。(Main画面からの遷移時)
     *
     * @param pltzInstr {@link W2001PltzInstrDomain} of a changing agency<br />変換元の{@link W2001PltzInstrDomain}
     * @param dateFormat Date format<br />日付フォーマット
     * @return Created {@link W2004ListDomain}<br />作成した{@link W2004ListDomain}
     * @throws ApplicationException When acquisition of the measurement unit of Shipper goes wrong<br /> Shipperの計量単位の取得に失敗した場合
     */
    protected List<? extends W2004ListDomain> convertToListDomain(W2001PltzInstrDomain pltzInstr, String dateFormat) 
        throws ApplicationException {
        
        List<W2004ListDomain> listDomainList = new ArrayList<W2004ListDomain>();
        
        if (pltzInstr != null) {
            // Acquisition of a WEIGHT UNIT
            // 重量単位の取得
            String weightUnit = pltzInstr.getWeightUnit();
            String weightUnitDisp = commonService.searchMeasureUnitDisp(weightUnit);
            
            for (W2001PltzInstrItemDomain pltzInstrItem : pltzInstr.getPltzInstrItemList()) {
                W2004ListDomain listDomain = new W2004ListDomain();
                
                // A setting of Packaging Instruction (=Pull), and a Palletize Instruction Item No
                // 梱包指示、梱包指示品目番号の設定
                CommonUtil.copyPropertiesDomainToDomain(listDomain, pltzInstr);
                CommonUtil.copyPropertiesDomainToDomain(listDomain, pltzInstrItem);
                
                // setting (re-) (since this is overwritten by PltzInstrItem.weightUnit) of WEIGHT UNIT  
                // 重量単位の(再)設定 (PltzInstrItem.weightUnitで上書きされるので)
                listDomain.setWeightUnit(weightUnit);
                listDomain.setWeightUnitDisp(weightUnitDisp);
                
                // Setting of a PALLETIZE INSTRUCTION DATE
                // 梱包指示日の設定
                String pltzInstrDt = DateUtil.formatDate(pltzInstr.getPltzInstrDt(), dateFormat);
                listDomain.setPltzInstrDt(pltzInstrDt);
                
                // A setting of CML PRINT OUT DATE
                // CML出力日の設定
                String cmlPrintOutDt = DateUtil.formatDate(pltzInstr.getCmlPrintOutDt(), dateFormat);
                listDomain.setCmlPrintOutDt(cmlPrintOutDt);
                
                BigDecimal instrQty = pltzInstrItem.getInstrQty();
                BigDecimal packedQty = pltzInstrItem.getPackedQty();
                
                // A setting of CML Flg
                // CML Flgの設定
                if (packedQty.equals(BigDecimal.ZERO)) {
                    listDomain.setCmlFlg("");
                } else if (instrQty.equals(packedQty)) {
                    listDomain.setCmlFlg(FLAG_Y);
                } else {
                    listDomain.setCmlFlg(FLAG_N);
                }
                
                // A setting of Total N/W
                // Total N/Wの設定
                if (pltzInstrItem.getTotalNetWeight() == null) {
                    listDomain.setTotalNetWeight(NO_DATA);
                } else {
                    listDomain.setTotalNetWeight(NumberUtil.format(pltzInstrItem.getTotalNetWeight(), FORMAT_WEIGHT));
                }
                
                listDomainList.add(listDomain);
            }
        }
        
        return listDomainList;
    }
    
    /**
     * {@link W2001PltzInstrItemDomain} is changed into {@link W2004ListDomain}.(at the time of the changes from a Create screen)
     * <br />{@link W2001PltzInstrItemDomain}を{@link W2004ListDomain}に変換します。(Create画面からの遷移時)
     *
     * @param pltzInstrItemList {@link W2001PltzInstrItemDomain} of a changing agency<br />変換元の{@link W2001PltzInstrItemDomain}
     * @param shipperCd The COMPANY CODE of Shipper<br />Shipperの会社コード
     * @return Created {@link W2004ListDomain}<br />作成した{@link W2004ListDomain}
     * @throws ApplicationException When acquisition of the measurement unit of Shipper goes wrong<br />Shipperの計量単位の取得に失敗した場合
     */
    protected List<? extends W2004ListDomain> convertToListDomain(List<? extends W2001PltzInstrItemDomain> pltzInstrItemList, String shipperCd) 
        throws ApplicationException {

        List<W2004ListDomain> listDomainList = new ArrayList<W2004ListDomain>();
        
        // Acquisition of the measurement unit of Shipper
        // Shipperの計量単位の取得
        VtCompMeasureUnitDomain measureUnit = commonService.searchMeasureUnit(shipperCd);
        
        for (W2001PltzInstrItemDomain pltzInstrItem : pltzInstrItemList) {
            W2004ListDomain listDomain = new W2004ListDomain();
            
            // A setting of Palletize Instruction Item No Work
            // 梱包指示品目番号ワークの設定
            CommonUtil.copyPropertiesDomainToDomain(listDomain, pltzInstrItem);
            
            // Setting of a WEIGHT UNIT
            // 重量単位の設定
            listDomain.setWeightUnit(measureUnit.getWeightUnit());
            listDomain.setWeightUnitDisp(measureUnit.getWeightUnitDisp());
            
            // A setting of Total N/W
            // Total N/Wの設定
            if (pltzInstrItem.getTotalNetWeight() == null) {
                listDomain.setTotalNetWeight(NO_DATA);
            } else {
                listDomain.setTotalNetWeight(NumberUtil.format(pltzInstrItem.getTotalNetWeight(), FORMAT_WEIGHT));
            }
            
            listDomainList.add(listDomain);
        }
        
        return listDomainList;
    }
}
