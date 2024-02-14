/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_N;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FORMAT_WEIGHT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NO_DATA;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0060;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0030;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.VtCompMeasureUnitDomain;
import com.globaldenso.eca0027.core.business.domain.W2001PltzInstrDomain;
import com.globaldenso.eca0027.core.business.domain.W2001PltzInstrItemDomain;
import com.globaldenso.eca0027.core.business.domain.W2004CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W2004ListDomain;
import com.globaldenso.eca0027.core.business.domain.W2004UpdateDomain;
import com.globaldenso.eca0027.core.business.service.W2001PltzInstrService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractTransactFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.DateUtil;
import com.globaldenso.gscm.framework.util.NumberUtil;

/**
 * This is an implement class of the Facade service to Search action of a Packaging Instruction (=Pull) Create screen.
 * <br />梱包指示Create画面のSearchアクションに対するFacadeサービスの実装クラスです。
 * <pre>
 * bean id: w2004RegisterFacadeService
 * </pre>
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W2004RegisterFacadeServiceImpl 
    extends AbstractTransactFacadeService<List<? extends W2004ListDomain>, W2004UpdateDomain> {

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
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W2004RegisterFacadeServiceImpl() {
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
     * 
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W2004UpdateDomain filterDomain(W2004UpdateDomain updateDomain)
        throws GscmApplicationException, ApplicationException {
        return updateDomain;
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * No Action
     * 
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W2004UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // No Action
        // 処理なし
    }

    /**
     * {@inheritDoc}
     * <pre>
     * No Action
     * 
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W2004UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // No Action
        // 処理なし
    }

    /**
     * {@inheritDoc}
     * <pre>
     * A check among - night batch
     *       Shipper confirms whether to be among a night batch.
     *       details -- common-specifications .xls -- "-- functional specification common: -- behavior" in a CIGMA night batch is referred to
     *
     * - combination check (Shipper, Cust. No, Ship To)
     *       details -- common-specifications .xls -- "-- functional specification common: -- Shipper, Customer, and the Ship to combination check " are referred to
     *
     * - combination check (Shipper, W/H, Plant CD)
     *       details -- common-specifications .xls -- "-- functional specification common: -- Shipper, W/H, and the Plant combination check " are referred to
     * 
     * - 夜間バッチ中チェック
     *     Shipperが夜間バッチ中かをチェックする。
     *     詳細は共通仕様.xls「機能仕様共通：CIGMA夜間バッチ中の振る舞い」を参照
     *     
     * - 組み合わせチェック (Shipper、Cust. No、Ship To)
     *     詳細は共通仕様.xls「機能仕様共通：Shipper、Customer、Ship to　組み合わせチェック」を参照
     *     
     * - 組み合わせチェック (Shipper、W/H、Plant CD)
     *     詳細は共通仕様.xls「機能仕様共通：Shipper、W/H、Plant　組み合わせチェック」を参照
     * </pre>
     * 
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W2004UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // Acquisition of an input value
        // 入力値の取得
        String shipperCd = updateDomain.getCriteriaDomain().getShipperCd();
        String customerCd = updateDomain.getCriteriaDomain().getCustomerCd();
        String lgcyShipTo = updateDomain.getCriteriaDomain().getLgcyShipTo();
        String lgcyWhCd = updateDomain.getCriteriaDomain().getLgcyWhCd(); 
        String plntCd = updateDomain.getCriteriaDomain().getPlntCd();
        
        // Create of an error list
        // エラーリストの作成
        List<MessageDomain> errorList = new ArrayList<MessageDomain>();
        
        // check among a night batch
        // 夜間バッチ中チェック
        if (!w2001PltzInstrService.validateDatabaseCigmaAvailable(true, shipperCd)) {
            MessageDomain msg = new MessageDomain("w2004CriteriaDomain.shipperCd", NXS_E1_0060, null);
            errorList.add(msg);
        }
        
        // combination check (Shipper, Cust. No, Ship To)  
        // 組み合わせチェック (Shipper、Cust. No、Ship To)
        if (!w2001PltzInstrService.validateDatabaseShipperCustomerShipTo(shipperCd, customerCd, lgcyShipTo)) {
            Object[] params = {
                shipperCd,
                customerCd,
                lgcyShipTo
            };
            MessageDomain msgShipperCd = new MessageDomain("w2004CriteriaDomain.shipperCd", GSCM_E0_0030, params);
            MessageDomain msgCustomerCd = new MessageDomain("w2004CriteriaDomain.customerCd", null, null);
            MessageDomain msgLgcyShipTo = new MessageDomain("w2004CriteriaDomain.lgcyShipTo", null, null);
            
            errorList.add(msgShipperCd);
            errorList.add(msgCustomerCd);
            errorList.add(msgLgcyShipTo);
        }
        
        // combination check (Shipper, W/H, Plant CD)  
        // 組み合わせチェック (Shipper、W/H、Plant CD)
        if (!w2001PltzInstrService.validateDatabaseShipperWhPlant(shipperCd, lgcyWhCd, plntCd)) {
            Object[] params = {
                shipperCd,
                lgcyWhCd,
                plntCd
            };
            MessageDomain msgShipperCd = new MessageDomain("w2004CriteriaDomain.shipperCd", GSCM_E0_0030, params);
            MessageDomain msgLgcyWhCd = new MessageDomain("w2004CriteriaDomain.lgcyWhCd", null, null);
            MessageDomain msgPlntCd = new MessageDomain("w2004CriteriaDomain.plntCd", null, null);
           
            errorList.add(msgShipperCd);
            errorList.add(msgLgcyWhCd);
            errorList.add(msgPlntCd);
        }
        // Error check
        // エラー確認
        if (0 < errorList.size()) {
            throw new ValidationException(errorList);
        }
    }

    /**
     * {@inheritDoc}
     * <pre>
     * - Create of a Packaging Instruction (=Pull) domain
     *       {@link W2001PltzInstrDomain} is created and the contents of {@link W2004CriteriaDomain} are set up.
     *       {@link W2001PltzInstrItemDomain} is created and the contents of {@link W2004ListDomain} are set up.
     *       {@link W2001PltzInstrItemDomain} is set to {@link W2001PltzInstrDomain}.
     *
     * - Execution of registration processing
     *       {@link W2001PltzInstrService#transactOnRegister (W2001PltzInstrDomain)} is called for created {@link W2001PltzInstrDomain} to an argument.
     *
     * A create of - List domain
     *       {@link W2004ListDomain} is created based on the re retrieval result after registration.
     * 
     * - 梱包指示ドメインの作成
     *     {@link W2001PltzInstrDomain}を作成し、{@link W2004CriteriaDomain}の内容を設定する
     *     {@link W2001PltzInstrItemDomain}を作成し、{@link W2004ListDomain}の内容を設定する
     *     {@link W2001PltzInstrDomain}に{@link W2001PltzInstrItemDomain}を設定する
     *     
     * - 登録処理の実行
     *     作成した{@link W2001PltzInstrDomain}を引数に、{@link W2001PltzInstrService#transactOnRegister(W2001PltzInstrDomain)}を呼出す
     *     
     * - Listドメインの作成
     *     登録後の再検索結果をもとに{@link W2004ListDomain}を作成する
     *     
     * - Listドメインの返却
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected List<? extends W2004ListDomain> callServices(W2004UpdateDomain updateDomain) throws GscmApplicationException, ApplicationException {
        
        // Create of a Packaging Instruction (=Pull) domain
        // 梱包指示ドメインの作成
        W2001PltzInstrDomain pltzInstr = createPltzInstr(updateDomain);

        // Execution of registration processing
        // 登録処理の実行
        pltzInstr = w2001PltzInstrService.transactOnRegister(pltzInstr);
        
        // A converted in a W2004List domain
        // W2004Listドメインへの変換
        return convertToListDomain(pltzInstr, updateDomain.getScreenDateFormat());
    }
    
    /**
     * From {@link W2004ListDomain} to {@link W2004CriteriaDomain} and {@link W2001PltzInstrDomain}. {@link W2001PltzInstrItemDomain} is created.
     * <br />{@link W2004CriteriaDomain}および{@link W2004ListDomain}から{@link W2001PltzInstrDomain}、{@link W2001PltzInstrItemDomain}を作成します。
     *
     * @param updateDomain {@link W2004UpdateDomain}
     * @return Created {@link W2001PltzInstrDomain}<br />作成した{@link W2001PltzInstrDomain}
     * @throws ApplicationException When the WEIGHT UNIT of Shipper is unacquirable<br />ApplicationException Shipperの重量単位が取得できない場合
     */
    @SuppressWarnings("deprecation")
    protected W2001PltzInstrDomain createPltzInstr(W2004UpdateDomain updateDomain) throws ApplicationException {
        
        W2001PltzInstrDomain pltzInstr = new W2001PltzInstrDomain();
        
        // Setting of a Packaging Instruction (=Pull) domain
        // 梱包指示ドメインの設定
        CommonUtil.copyPropertiesDomainToDomain(pltzInstr, updateDomain.getCriteriaDomain(), updateDomain.getScreenDateFormat());
        
        // Create of a Palletize-Instruction-Item-No domain
        // Shipperの重量単位の設定
        String weightUnit = commonService.searchWeightUnit(updateDomain.getCriteriaDomain().getShipperCd());
        pltzInstr.setWeightUnit(weightUnit);
        
        List<W2001PltzInstrItemDomain> pltzInstrItemList = new ArrayList<W2001PltzInstrItemDomain>();
        
        // Create of a Palletize-Instruction-Item-No domain
        // 梱包指示品目番号ドメインの作成
        for (W2004ListDomain listDomain : updateDomain.getListDomainList()) {
            W2001PltzInstrItemDomain pltzInstrItem = new W2001PltzInstrItemDomain();
            
            CommonUtil.copyPropertiesDomainToDomain(pltzInstrItem, listDomain);
            
            pltzInstrItemList.add(pltzInstrItem);
        }
        
        // Setting of a Palletize-Instruction-Item-No domain
        // 梱包指示品目番号ドメインの設定
        pltzInstr.setPltzInstrItemList(pltzInstrItemList);
        
        return pltzInstr;
    }
    
    /**
     * {@link W2001PltzInstrDomain} is changed into {@link W2004ListDomain}.
     * <br />{@link W2001PltzInstrDomain}を{@link W2004ListDomain}に変換します。
     *
     * @param pltzInstr {@link W2001PltzInstrDomain} of a changing agency<br />変換元の{@link W2001PltzInstrDomain}
     * @param dateFormat Date format<br />日付フォーマット
     * @return Created {@link W2004ListDomain}<br />作成した{@link W2004ListDomain}
     * @throws ApplicationException When acquisition of the measurement unit of Shipper goes wrong<br />Shipperの計量単位の取得に失敗した場合
     */
    protected List<? extends W2004ListDomain> convertToListDomain(W2001PltzInstrDomain pltzInstr, String dateFormat) 
        throws ApplicationException {
        
        List<W2004ListDomain> listDomainList = new ArrayList<W2004ListDomain>();
        
        // Acquisition of the measurement unit of Shipper
        // Shipperの計量単位の取得
        VtCompMeasureUnitDomain measureUnit = commonService.searchMeasureUnit(pltzInstr.getShipperCd());
        
        for (W2001PltzInstrItemDomain pltzInstrItem : pltzInstr.getPltzInstrItemList()) {
            W2004ListDomain listDomain = new W2004ListDomain();
            
            // Acquisition of the measurement unit of Shipper
            // 梱包指示、梱包指示品目番号の設定
            CommonUtil.copyPropertiesDomainToDomain(listDomain, pltzInstr);
            CommonUtil.copyPropertiesDomainToDomain(listDomain, pltzInstrItem);
            
            // A setting of Packaging Instruction (=Pull), and a Palletize Instruction Item No
            // 重量単位の(再)設定 (PltzInstrItem.weightUnitで上書きされるので)
            listDomain.setWeightUnit(pltzInstr.getWeightUnit());
            listDomain.setWeightUnitDisp(measureUnit.getWeightUnitDisp());
            
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
        
        return listDomainList;
    }
}
