/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FORMAT_VOLUME;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FORMAT_WEIGHT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0010;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0029;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0062;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0063;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0042;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0071;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W2017;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W2014PltzDomain;
import com.globaldenso.eca0027.core.business.domain.W2014XtagDomain;
import com.globaldenso.eca0027.core.business.domain.W2017CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W2017ListDomain;
import com.globaldenso.eca0027.core.business.domain.W2017UpdateDomain;
import com.globaldenso.eca0027.core.business.service.W2014XtagService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractTransactFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.NumberUtil;
import com.globaldenso.gscm.framework.util.Validator;

/**
 * The register service facade implementation class of X-Tag Register
 * <br />X-Tag RegisterのRegisterFacadeサービス実装クラスです。
 * <pre>
 * bean id:W2017RegisterFacadeService
 * </pre>
 *
 * @author $Author: 810833843 $
 * @version $Revision: 10494 $
 */
public class W2017RegisterFacadeServiceImpl 
    extends AbstractTransactFacadeService<W2017UpdateDomain, W2017UpdateDomain> {

    /**
     * Packaging Instruction (=Pull) service
     * <br />梱包指示サービス
     */
    protected W2014XtagService w2014XtagService;
    
    /**
     * Common service.
     */
    protected CommonService commonService;

    /**
     * constructor.
     */
    public W2017RegisterFacadeServiceImpl() {
    }

    /**
     * Setter method for w2014XtagService.
     *
     * @param xtagService Set for w2014XtagService
     */
    public void setW2014XtagService(W2014XtagService xtagService) {
        w2014XtagService = xtagService;
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
     * {@inheritDoc}.
     * 
     * <pre>
     * No Action <br />処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W2017UpdateDomain filterDomain(W2017UpdateDomain updateDomain)
        throws GscmApplicationException, ApplicationException {
        // No Action
        // 処理なし
        return updateDomain;
    }
    
    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - Common error checking
     *     Screen definition document_ECA0027_W2016_X-Tag Create.xls "a screen item definition" is referred to.
     * - 共通エラーチェック
     *     画面定義書_ECA0027_W2016_X-Tag Create.xls「画面項目定義」を参照
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W2017UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {

        Validator<W2017CriteriaDomain> valid 
            = new Validator<W2017CriteriaDomain>(updateDomain.getCriteriaDomain(), "w2017CriteriaDomain");

        // digit number, an attribute, form check (peculiar to a screen)  
        // 桁数、属性、書式チェック(画面固有)
        String[] properties = {
            "outerPkgCd"
        };
        valid.isValidateProperties(properties, SCREEN_ID_W2017);
        
            // Error check
        // エラー確認
        if (0 < valid.getErrList().size()) {
            throw new ValidationException(valid.getErrList());
        }
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - X-TAG number check
     *       This is a call about {@link W2014XtagService#validateConsistencyCmlCount(List)}.
     * - まとめCML件数チェック
     *     {@link W2014XtagService#validateConsistencyCmlCount(java.util.List)}を呼出
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W2017UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        // Create of an error list
        // エラーリストの作成
        List<MessageDomain> errorList = new ArrayList<MessageDomain>();
        
        // List create of a Palletize domain
        // パレタイズドメインのリスト作成
        List<W2014PltzDomain> pltzList = new ArrayList<W2014PltzDomain>();
        
        for (W2017ListDomain listDomain : updateDomain.getListDomainList()){
            W2014PltzDomain pltz = new W2014PltzDomain();
            CommonUtil.copyPropertiesDomainToDomain(pltz, listDomain);
            pltzList.add(pltz);
        }
        
        // X-TAG number check
        // まとめCML件数チェック
        if (!w2014XtagService.validateConsistencyCmlCount(pltzList)){
            MessageDomain msg = new MessageDomain("", NXS_E7_0042, null);
            errorList.add(msg);
        }
        
        // Error check
        // エラー確認
        if (0 < errorList.size()) {
            throw new ValidationException(errorList);
        }
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - W/H Company and NEXUS W/H Combination check
     *       This is a call about {@link W2014XtagService#validateDatabaseCompWh (String, String)}.
     * - Company existence check
     *       This is a call about {@link W2014XtagService#validateDatabaseCompCd (String)}.
     * - Palletize check
     *       This is a call about {@link W2014XtagService#validateDatabaseTtPltzOnRegister (List, String, List, List)}.
     *
     * - W/H Company、NEXUS W/H　組み合わせチェック
     *     {@link W2014XtagService#validateDatabaseCompWh(String, String)}を呼出
     * - Company存在チェック
     *     {@link W2014XtagService#validateDatabaseCompCd(String)}を呼出
     * - パレタイズチェック
     *     {@link W2014XtagService#validateDatabaseTtPltzOnRegister(List, String, List, List)}を呼出
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W2017UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        // Create of an error list
        // エラーリストの作成
        List<MessageDomain> errorList = new ArrayList<MessageDomain>();
        
        // W/H Company, a NEXUS W/H combination check
        // W/H Company、NEXUS W/H　組み合わせチェック
        if (!w2014XtagService.validateDatabaseCompWh(updateDomain.getCriteriaDomain().getCurWhCompCd(), updateDomain.getCriteriaDomain().getCurWhCd())){
            Object[] params = {
                commonService.getResource(updateDomain.getCriteriaDomain().getLocale(), "label.whCompCd"),
                commonService.getResource(updateDomain.getCriteriaDomain().getLocale(), "label.whCd")
            };
            
            // MessageDomain msgShipperCd = new MessageDomain("criteriaDomain.shipperCd", NXS_E1_0020, params);
            MessageDomain msgCurWhCompCd = new MessageDomain("w2017CriteriaDomain.curWhCompCd", GSCM_E0_0029, params);
            MessageDomain msgCurWhCd = new MessageDomain("w2017CriteriaDomain.curWhCd", null, null);
            
            errorList.add(msgCurWhCompCd);
            errorList.add(msgCurWhCd);
        }
        
        // Company existence check
        // Company存在チェック
        if (!w2014XtagService.validateDatabaseCompCd(updateDomain.getCriteriaDomain().getShipToCompCd())){

            // MessageDomain msgShipperCd = new MessageDomain("criteriaDomain.shipperCd", NXS_E1_0020, params);
            MessageDomain msg = new MessageDomain("w2017CriteriaDomain.curWhCompCd", NXS_E7_0071, null);
            
            errorList.add(msg);
        }
        
        // Palletize check
        // パレタイズチェック
        
        // Create of a MAIN-MARK list
        // メインマークリストの作成
        List<String> mainMarkList = new ArrayList<String>();
        for (W2017ListDomain listDomain : updateDomain.getListDomainList()){
            String mainMark = new String();
            mainMark = listDomain.getMainMark();
            mainMarkList.add(mainMark);
        }
        
        // Create of an error list
        // エラーリストの作成
        List<String> pltzStatusErrList = new ArrayList<String>();
        List<String> lastTrStatusErrList = new ArrayList<String>();
        
        // Check implementation
        // チェック実施
        List<String> errMsgList = w2014XtagService.validateDatabaseTtPltzOnRegister(mainMarkList, updateDomain.getCriteriaDomain().getTrnsCd()
            , pltzStatusErrList, lastTrStatusErrList);
        
        // message generation
        // メッセージ生成
        if (errMsgList != null) {
            for (String errMsg : errMsgList) {

                if(GSCM_E0_0010.compareTo(errMsg) == 0) {
                    MessageDomain msg = new MessageDomain();
                    msg.setKey(GSCM_E0_0010);
                    msg.setParams(null);
                    errorList.add(msg);
                } else if (NXS_E1_0062.compareTo(errMsg) == 0) {
                    for (String err : pltzStatusErrList){
                        MessageDomain msg = new MessageDomain();
                        msg.setKey(NXS_E1_0062);
                        Object[] obj = {err};
                        msg.setParams(obj);
                        errorList.add(msg);
                    }
                } else {
                    for (String err : lastTrStatusErrList){
                        MessageDomain msg = new MessageDomain();
                        msg.setKey(NXS_E1_0063);
                        Object[] obj = {err};
                        msg.setParams(obj);
                        errorList.add(msg);
                    }
                }
            }
        }
        
        // Error check
        // エラー確認
        if (0 < errorList.size()) {
            throw new ValidationException(errorList);
        }
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * A create of - X-Palletize domain
     *       {@link W2014XtagDomain} is created and the contents of {@link W2017CriteriaDomain} are set up.
     *       {@link W2014PltzDomain} is created and the contents of {@link W2017ListDomain} are set up.
     *       {@link W2014PltzDomain} is set to {@link W2014XtagDomain}.
     *
     * - Execution of registration processing
     *       {@link W2014XtagService#transactOnRegister (W2014XtagDomain)} is called for created {@link W2014XtagDomain} to an argument.
     *
     * A create of - Update domain
     *       {@link W2017UpdateDomain} is created based on the re retrieval result after registration.
     *
     * A return of - Update domain
     *
     * - まとめパレタイズドメインの作成
     *     {@link W2014XtagDomain}を作成し、{@link W2017CriteriaDomain}の内容を設定する
     *     {@link W2014PltzDomain}を作成し、{@link W2017ListDomain}の内容を設定する
     *     {@link W2014XtagDomain}に{@link W2014PltzDomain}を設定する
     *     
     * - 登録処理の実行
     *     作成した{@link W2014XtagDomain}を引数に、{@link W2014XtagService#transactOnRegister(W2014XtagDomain)}を呼出す
     *     
     * - Updateドメインの作成
     *     登録後の再検索結果をもとに{@link W2017UpdateDomain}を作成する
     *     
     * - Updateドメインの返却
     * 
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W2017UpdateDomain callServices(W2017UpdateDomain updateDomain) 
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        // A create of X-Palletize domain
        // まとめパレタイズドメインの作成
        W2014XtagDomain xtag = createXtag(updateDomain);

        // Execution of registration processing
        // 登録処理の実行
        xtag = w2014XtagService.transactOnRegister(xtag);
        
        // Error judging
        // エラー判定
        if (xtag.getErrCdList() != null) {
            if (!xtag.getErrCdList().isEmpty()){
                validateCallService(xtag);
            }
        }
        
        // A converted in a W2004List domain
        // W2004Listドメインへの変換
        return convertToUpdateDomain(xtag, updateDomain.getCriteriaDomain().getScreenDateFormat());
    }

    /**
     * {@link W2014XtagDomain} from {@link W2017CriteriaDomain} and {@link W2017ListDomain} and {@link W2014PltzDomain} are created.
     * <br />{@link W2017CriteriaDomain}および{@link W2017ListDomain}から{@link W2014XtagDomain}、{@link W2014PltzDomain}を作成します。
     *
     * @param updateDomain The mass update domain of a Register screen<br />Register画面の一括更新ドメイン
     * @return X-Palletize domain<br />まとめパレタイズドメイン
     */
    @SuppressWarnings("deprecation")
    protected W2014XtagDomain createXtag(W2017UpdateDomain updateDomain) {
        
        W2014XtagDomain xtag = new W2014XtagDomain();
        
        // A setting of X-Palletize domain
        // まとめパレタイズドメインの設定
        // CommonUtil.copyPropertiesDomainToDomain(xtag, updateDomain.getCriteriaDomain(), updateDomain.getCriteriaDomain().getScreenDateFormat());
        
        W2017CriteriaDomain criteriaDomain =  updateDomain.getCriteriaDomain();
        
        xtag.setLoginUserDscId(criteriaDomain.getLoginUserDscId());
        xtag.setCompCd(criteriaDomain.getOwnerCompCd());
        xtag.setXmainMark(criteriaDomain.getXmainMark());
        xtag.setTrnsCd(criteriaDomain.getTrnsCd());
        xtag.setLoadingCd(criteriaDomain.getLoadingCd());
        xtag.setContainerSortingKey(criteriaDomain.getContainerSortingKey());
        xtag.setShipToCompCd(criteriaDomain.getShipToCompCd());
        xtag.setWeightUnit(criteriaDomain.getWeightUnit());
        xtag.setWeightUnitDisplay(criteriaDomain.getWeightUnitDisplay());
        xtag.setVolumeUnit(criteriaDomain.getVolumeUnit());
        xtag.setVolumeUnitDisplay(criteriaDomain.getVolumeUnitDisplay());
        xtag.setCurWhCompCd(criteriaDomain.getCurWhCompCd());
        xtag.setCurWhCd(criteriaDomain.getCurWhCd());
        xtag.setXtagPackingIssuerId(criteriaDomain.getLoginUserDscId());
        xtag.setXtagPackingIssuerNm(criteriaDomain.getXtagPackingIssuerNm());
        xtag.setTimeZone(criteriaDomain.getTimeZone());
        xtag.setDateFormat(criteriaDomain.getDateFormat());
        xtag.setTotalShipper(new BigDecimal(criteriaDomain.getTotalShipper()));
        xtag.setOuterPkgComCd(criteriaDomain.getOuterPkgComCd());
        xtag.setOuterPkgCd(criteriaDomain.getOuterPkgCd());
        xtag.setCustomTimingTyp(criteriaDomain.getCustomTimingTyp());
        
        xtag.setOuterPkgComCd(criteriaDomain.getOuterPkgComCd());
        xtag.setOuterPkgCd(criteriaDomain.getOuterPkgCd());
        
        xtag.setServerId(criteriaDomain.getServerId());
        
        List<W2014PltzDomain> pltzList = new ArrayList<W2014PltzDomain>();
        
        // Create of a Palletize domain
        // パレタイズドメインの作成
        for (W2017ListDomain listDomain : updateDomain.getListDomainList()) {
            W2014PltzDomain pltz = new W2014PltzDomain();
            
            // CommonUtil.copyPropertiesDomainToDomain(pltz, listDomain);
            pltz.setMainMark(listDomain.getMainMark());
            pltz.setDngrItemFlg(listDomain.getDngrItemFlg());
            
            pltzList.add(pltz);
        }
        
        // setting of a Palletize domain toX-Palletize domain.
        // まとめパレタイズドメインにパレタイズドメインの設定
        xtag.setPltzDomainList(pltzList);
        
        return xtag;
    }
    
    /**
     * {@link W2014XtagDomain} is changed into {@link W2017ListDomain}.
     * <br />{@link W2014XtagDomain}を{@link W2017ListDomain}に変換します。
     *
     * @param xtag {@link W2014XtagDomain} of a changing agency<br />変換元の{@link W2014XtagDomain}
     * @param dateFormat Date format<br />日付フォーマット
     * @return Created {@link W2017UpdateDomain}<br />作成した{@link W2017UpdateDomain}
     */
    protected W2017UpdateDomain convertToUpdateDomain(W2014XtagDomain xtag, String dateFormat) {
        
        W2017UpdateDomain updateDomain = new W2017UpdateDomain();
        
        // A setting of a Criteria domain
        // Criteriaドメインの設定
        W2017CriteriaDomain criteriaDomain = new W2017CriteriaDomain();
        CommonUtil.copyPropertiesDomainToDomain(criteriaDomain, xtag, dateFormat);
        criteriaDomain.setWeightUnitDisplayDtlTitle(xtag.getWeightUnitDisplay());
        updateDomain.setCriteriaDomain(criteriaDomain);
        
        if (xtag.getVolume() != null) {
            criteriaDomain.setVolume(NumberUtil.format(xtag.getVolume(), FORMAT_VOLUME));
        }
        if (xtag.getGrossWeight() != null) {
            criteriaDomain.setGrossWeight(NumberUtil.format(xtag.getGrossWeight(), FORMAT_WEIGHT));
        }

        // A setting of a List domain
        // Listドメインの設定
        List<W2017ListDomain> listDomainList = new ArrayList<W2017ListDomain>();
        
        for (W2014PltzDomain pltz : xtag.getPltzDomainList()) {
            W2017ListDomain listDomain = new W2017ListDomain();
            
            // Setting of a list domain
            // リストドメインの設定
            CommonUtil.copyPropertiesDomainToDomain(listDomain, pltz);
            
            listDomain.setGrossWeight(NumberUtil.format(pltz.getGrossWeight(), FORMAT_WEIGHT));
            
            listDomainList.add(listDomain);
        }
        
        updateDomain.setListDomainList(listDomainList);
        
        return updateDomain;
    }
    
    /**
     * In the case of NG, an error is generated as a result of disposal of business affairs.
     * <br />業務処理の結果NGの場合エラーを発生します。
     *
     * @param xtag X-TAG domain<br />まとめCMLドメイン
     * @throws ValidationException When a packing combination master does not exist<br />包装組合せ原単位が存在しない場合
     */
    protected void validateCallService(W2014XtagDomain xtag) throws ValidationException {
        // Create of an error list
        // エラーリストの作成
        List<MessageDomain> errorList = new ArrayList<MessageDomain>();
        
        for (String errCd : xtag.getErrCdList()) {
            MessageDomain msg = new MessageDomain("", errCd, null);
            errorList.add(msg);
        }
        
        // Error check
        // エラー確認
        if (0 < errorList.size()) {
            throw new ValidationException(errorList);
        }
    }
}
