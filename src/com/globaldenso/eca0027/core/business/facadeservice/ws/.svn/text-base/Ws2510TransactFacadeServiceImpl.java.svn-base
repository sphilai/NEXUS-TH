/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.ws;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_N;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_5004;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_5005;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_5008;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_5016;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_5031;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_ID_WS2510;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_SUCCESS;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzInstrCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2510ResultDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2510XMainMarkInfoDomain;
import com.globaldenso.eca0027.core.business.domain.WsBhtEisProductDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2510CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.WsBhtEisProductCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.WsBhtEisProductService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractTransactFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CheckUtil;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.Validator;

/**
 * The implementation class of the Facade service to ECA0027_WS_2510.
 * <br />ECA0027_WS_2510に対するFacadeサービスの実装クラスです。
 * <pre>
 * bean id: Ws2510CreateFacadeService
 * </pre>
 *
 * @author $Author: 10088DS50908 $
 * @version $Revision: 10492 $
 */
public class Ws2510TransactFacadeServiceImpl extends AbstractTransactFacadeService<Ws2510ResultDomain, Ws2510CriteriaDomain> {
    
    /**
     * Eis Product service
     * <br />Eis Product サービス
     */
    private WsBhtEisProductService wsBhtEisProductService;
    
    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public Ws2510TransactFacadeServiceImpl() {
    }
    
    /**
     * Setter method for wsBhtEisProductService.
     *
     * @param wsBhtEisProductService Set for wsBhtEisProductService
     */
    public void setWsBhtEisProductService(
        WsBhtEisProductService wsBhtEisProductService) {
        this.wsBhtEisProductService = wsBhtEisProductService;
    }
    
    /**
     * {@inheritDoc}
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
    protected Ws2510CriteriaDomain filterDomain(Ws2510CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {
        // No Action
        // 処理なし
        return criteriaDomain;
    }
    
    /**
     * {@inheritDoc}
     * 
     * <pre>
     * - Common error checking
     *       "A screen item definition" is referred to for details.
     * </pre>
     * <pre>
     * - 共通エラーチェック
     *     詳細は「画面項目定義」を参照
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(Ws2510CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        // Create of an error list
        // エラーリストの作成
        List<MessageDomain> errorList = new ArrayList<MessageDomain>();
        
        Validator<Ws2510CriteriaDomain> valid 
            = new Validator<Ws2510CriteriaDomain>(criteriaDomain, "criteriaDomain");
        
        // Unary eye check
        // 単項目チェック
        String[] properties = {
            "palletNo",
            "containerSortingKey",
            "trnsCd",
            "shipToCompCd",
            "loadingCd",
            "customTimingTyp",
            "outerPkgComCd",
            "outerPkgCd"
        };
        
        // required check
        // 必須チェック
        valid.isValidateProperties(properties, WS_ID_WS2510);
        if (0 < valid.getErrList().size()) {
            for (MessageDomain err : valid.getErrList()){
                errorList.add(err);
            }
        }
        
         // An error is made when the number of MAIN MARK is one or less affair.
        // メインマークの件数が1件以下の場合エラー
        if (criteriaDomain.getMainMarkList().size() < 2) {
            if (criteriaDomain.getMainMarkList().isEmpty()
                || CheckUtil.isBlankOrNull(criteriaDomain.getMainMarkList().get(0))) {
                MessageDomain msg = new MessageDomain("", NXS_E1_5016, null);
                errorList.add(msg);
            } else {
                MessageDomain msg = new MessageDomain("", NXS_E1_5005, null);
                errorList.add(msg);
            }
        }
        
        // Error check
        // エラー確認
        if (0 < errorList.size()) {
            throw new ValidationException(errorList);
        }
    }
    
    /**
     * {@inheritDoc}
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
    protected void validateConsistency(Ws2510CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // No Action
        // 処理なし
    }
    
    /**
     * {@inheritDoc}
     * 
     * <pre>
     * - A MAIN MARK's existence check, item check of a Palletize information
     *     - All the items of criteriaDomain are set to {@link WsBhtEisProductCriteriaDomain}.
     *       This is a call about {@link WsBhtEisProductService#validateDatabaseTtPltzOnXtag(WsBhtEisProductCriteriaDomain)}.
     * - WEIGHT acquisition of exterior cases
     *     This is an argument about outerPkgComCd of - criteriaDomain, and outerPkgCd.
     * This is a call about {@link WsBhtEisProductService#validateDatabaseTmPkgSetDtlOnXtag(String, String, Map)}.
     * - VOLUME acquisition of exterior cases
     *     This is an argument about outerPkgComCd of - criteriaDomain, and outerPkgCd.
     * This is a call about {@link WsBhtEisProductService#validateDatabaseTmPkgSetHdrOnXtag(String, String, Map)}.
     * </pre>
     * <pre>
     * - メインマークの存在チェック、パレタイズ情報の項目チェック
     *   - {@link WsBhtEisProductCriteriaDomain}にcriteriaDomainの全項目を設定し
     *     {@link WsBhtEisProductService#validateDatabaseTtPltzOnXtag(WsBhtEisProductCriteriaDomain)}を呼出
     * - 外装材の重量取得
     *   - criteriaDomainのouterPkgComCd、outerPkgCdを引数に
     *     {@link WsBhtEisProductService#validateDatabaseTmPkgSetDtlOnXtag(String, String, Map)}を呼出
     * - 外装材の容積取得
     *   - criteriaDomainのouterPkgComCd、outerPkgCdを引数に
     *     {@link WsBhtEisProductService#validateDatabaseTmPkgSetHdrOnXtag(String, String, Map)}を呼出
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(Ws2510CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        // Create of an error list
        // エラーリストの作成
        List<MessageDomain> errorList = new ArrayList<MessageDomain>();
        
        // Existing check for user info
        // ユーザ情報存在チェック
        if (!wsBhtEisProductService.validateDatabaseVmUserInfo(criteriaDomain.getLoginUserDscId())) {
            Object[] params = {criteriaDomain.getLoginUserDscId()};
            MessageDomain msg = new MessageDomain("", NXS_E1_5031, params);
            errorList.add(msg);
            throw new ValidationException(errorList);
        }
        
        // A MAIN MARK's existence check, the item check of a Palletize information
        // メインマークの存在チェック、パレタイズ情報の項目チェック
        WsBhtEisProductCriteriaDomain wsBhtEisProductCriteria = new WsBhtEisProductCriteriaDomain();
        CommonUtil.copyPropertiesDomainToDomain(wsBhtEisProductCriteria, criteriaDomain);
        String[] returnCurWhCompCd = new String[1];
        String[] returnCurWhCd = new String[1];
        Map<String, String> errMap = wsBhtEisProductService.validateDatabaseTtPltzOnXtag(
            wsBhtEisProductCriteria, returnCurWhCompCd, returnCurWhCd);
        
        if (errMap != null && !errMap.isEmpty()){
            for (String key : errMap.keySet()){
                Object[] params = {
                    key
                };
                MessageDomain msg = null;
                if (NXS_E1_5004.equals(errMap.get(key))) {
                    msg = new MessageDomain("", errMap.get(key), null);
                } else {
                    msg = new MessageDomain("", errMap.get(key), params);
                }
                errorList.add(msg);
            }
            throw new ValidationException(errorList);
        }
        
        // WEIGHT acquisition of exterior cases
        // 外装材の重量取得
        Map<String, BigDecimal> weightMap = new HashMap<String, BigDecimal>();
        if (!wsBhtEisProductService.validateDatabaseTmPkgSetDtlOnXtag(criteriaDomain.getOuterPkgComCd(), criteriaDomain.getOuterPkgCd(), weightMap)){
            Object[] params = {
                criteriaDomain.getOuterPkgCd()
            };
            MessageDomain msg = new MessageDomain("", NXS_E1_5008, params);
            errorList.add(msg);
            throw new ValidationException(errorList);
        }
        
        // VOLUME acquisition of exterior cases
        // 外装材の容積取得
        Map<String, BigDecimal> volumeMap = new HashMap<String, BigDecimal>();
        if (!wsBhtEisProductService.validateDatabaseTmPkgSetHdrOnXtag(criteriaDomain.getOuterPkgComCd(), criteriaDomain.getOuterPkgCd(), volumeMap)){
            Object[] params = {
                criteriaDomain.getOuterPkgCd()
            };
            MessageDomain msg = new MessageDomain("", NXS_E1_5008, params);
            errorList.add(msg);
            throw new ValidationException(errorList);
        }
        
        // A setting of the delivered item to a call Services method
        // call Services メソッドへの引き渡し項目の設定
        criteriaDomain.setWeightMap(weightMap);
        criteriaDomain.setVolumeMap(volumeMap);
        criteriaDomain.setCurWhCompCd(returnCurWhCompCd[0]);
        criteriaDomain.setCurWhCd(returnCurWhCd[0]);
    }

    /**
     * {@inheritDoc}
     * 
     * <pre>
     * Registration of - X-Palletize information, the update of a Palletize information
     *     - All the items of criteriaDomain are set to {@link WsBhtEisProductCriteriaDomain}.
     *       This is a call about {@link WsBhtEisProductService#transactOnXtag (TtPltzInstrCriteriaDomain)}.
     * </pre>
     * <pre>
     * - まとめパレタイズ情報の登録、パレタイズ情報の更新
     *   - {@link WsBhtEisProductCriteriaDomain}にcriteriaDomainの全項目を設定し
     *     {@link WsBhtEisProductService#transactOnXtag(WsBhtEisProductCriteriaDomain)}を呼出
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected Ws2510ResultDomain callServices(Ws2510CriteriaDomain criteriaDomain) 
        throws GscmApplicationException, ApplicationException {
        
        // A create of a EisProduct search-condition domain
        // EisProduct検索条件ドメインの作成
        WsBhtEisProductCriteriaDomain wsBhtEisProductCriteria = new WsBhtEisProductCriteriaDomain();
        CommonUtil.copyPropertiesDomainToDomain(wsBhtEisProductCriteria, criteriaDomain);
        wsBhtEisProductCriteria.setGrossWeightMap(criteriaDomain.getWeightMap());
        for (String key : criteriaDomain.getVolumeMap().keySet()){
            wsBhtEisProductCriteria.setVolumeUnit(key);
            wsBhtEisProductCriteria.setVolume(criteriaDomain.getVolumeMap().get(key));
        }
        wsBhtEisProductCriteria.setCompCd(criteriaDomain.getShipToCompCd());
        wsBhtEisProductCriteria.setCurWhCompCd(criteriaDomain.getCurWhCompCd());
        wsBhtEisProductCriteria.setCurWhCd(criteriaDomain.getCurWhCd());
        wsBhtEisProductCriteria.setDngrItemFlg(FLAG_N);
        
        
        // Acquisition of packed up data, acquisition of unpacked up data, acquisition of a customer KANBAN QR information
        // 梱包済みデータの取得、未梱包データの取得、得意先かんばんQR情報の取得
        WsBhtEisProductDomain wsBhtEisProduct =
            wsBhtEisProductService.transactOnXtag(wsBhtEisProductCriteria);
        
        // Converted in a result domain
        // 結果ドメインへの変換
        Ws2510XMainMarkInfoDomain xMainMarkInfo = new Ws2510XMainMarkInfoDomain(); 
        xMainMarkInfo.setXmainMark(wsBhtEisProduct.getXmainMark());
        xMainMarkInfo.setPalletNo(wsBhtEisProduct.getPalletNo());
        
        Ws2510ResultDomain resultDomain = new Ws2510ResultDomain(WS_RESULT_SUCCESS);
        resultDomain.setXMainMarkInfo(xMainMarkInfo);
        
        return resultDomain;
    }
}
