/*
 * Project : NEXUS_EXPORT
 *
 * Dete of update          : 2013/12/16
 * Development company name: DENSO IT SOLUTIONS, INC.
 * Details of update       : New
 * (c) Copyright 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FORMAT_WEIGHT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0157;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.WC001CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.WC001ErtDomain;
import com.globaldenso.eca0027.core.business.domain.WC001ErtItemDomain;
import com.globaldenso.eca0027.core.business.domain.WC001ListDomain;
import com.globaldenso.eca0027.core.business.domain.WC001UpdateDomain;
import com.globaldenso.eca0027.core.business.service.WC001ErtService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CheckUtil;
import com.globaldenso.gscm.framework.util.NumberUtil;


/**
 * This is an implement class of the Facade service to Display action of return recommendation packing-style create, re printing, and a cancellation screen.
 * <br />返却推奨荷姿作成・再印刷・キャンセル画面のDisplayアクションに対するFacadeサービスの実装クラスです。
 *
 * @version $Revision: 15140 $
 */
public class WC001DisplayFacadeServiceImpl extends AbstractSearchFacadeService<WC001CriteriaDomain, WC001CriteriaDomain> {

    /**
     * Common service
     * <br />Commonサービス
     */
    protected CommonService commonService;
    
    /**
     * E-RT service
     * <br />E-RTサービス
     */
    protected WC001ErtService wc001ErtService;

    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public WC001DisplayFacadeServiceImpl() {
        
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
     * Setter method for wC001ErtService.
     *
     * @param ertService Set for wC001ErtService
     */
    public void setWc001ErtService(WC001ErtService ertService) {
        wc001ErtService = ertService;
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
    protected WC001CriteriaDomain filterDomain(WC001CriteriaDomain criteriaDomain)
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
    protected void validateItems(WC001CriteriaDomain criteriaDomain)
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
    protected void validateConsistency(WC001CriteriaDomain criteriaDomain)
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
    protected void validateDatabase(WC001CriteriaDomain criteria)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // No Action
        // 処理なし
    }
    
    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * A create of - ERT domain
     *       {@link WC001ErtDomain} is created and the contents of {@link WC001CriteriaDomain} are set up.   *1
     *       {@link WC001ErtItemDomain} is created and the contents of {@link WC001ListDomain} are set up.   *2
     *       {@link WC001ErtDomain} This is {@link WC001ErtItemDomain} to *1. *2 is set up.
     *
     * Acquisition of - CONTAINER SORTING KEY, C/L classification, and C/C classification (an export Ship-to shipment master is searched)
     *     Acquisition of a LENGTH UNIT (search of a NEXUS company master)
     *     Calculation of a Palletize VOLUME and a WEIGHT
     *     Acquisition of a MODEL CODE (a PKG Materials MA is searched)
     *       To an argument, this is a call about {@link WC001ErtService#searchOnContensOfABoxDisplay (WC001ErtDomain)} in created {@link WC001ErtDomain}.
     *
     * A create of - Update domain
     *       {@link WC001UpdateDomain} is created based on search results.
     *
     * A return of - Update domain
     * 
     * - ERTドメインの作成
     *     {@link WC001ErtDomain}を作成し、{@link WC001CriteriaDomain}の内容を設定 ※1
     *     {@link WC001ErtItemDomain}を作成し、{@link WC001ListDomain}の内容を設定 ※2
     *     {@link WC001ErtDomain} ※1に{@link WC001ErtItemDomain} ※2を設定
     *     
     * - コンテナ層別キー・C/L区分・C/C区分の取得(輸出送荷先出荷マスタを検索)
     *   長さ単位の取得(NEXUS会社マスタの検索)
     *   パレタイズ容積、重量の算出
     *   型式コードの取得(包装材品番原単位を検索)
     *     作成した{@link WC001ErtDomain}を引数に、{@link WC001ErtService#searchOnContensOfABoxDisplay(WC001ErtDomain)}を呼出
     *     
     * - Updateドメインの作成
     *     検索結果をもとに{@link WC001UpdateDomain}を作成する
     *     
     * - Updateドメインの返却
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected WC001CriteriaDomain callServices(WC001CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {

        List<? extends WC001ListDomain> listDomainList = criteriaDomain.getListDomainList();
        
        // A converted in a E-RT domain
        // E-RTドメインへの変換
        WC001ErtDomain wC001Ert = this.convertToErtDomain(criteriaDomain, listDomainList);
        // Retrieval processing
        // 検索処理
        wC001Ert = wc001ErtService.searchOnContensOfABoxDisplay(wC001Ert);
        
        // A converted in a criteria domain
        // criteriaドメインへの変換
        criteriaDomain = this.convertToCriteriaDomain(wC001Ert, criteriaDomain);
        // Converted in a list domain
        // リストドメインへの変換
        criteriaDomain.setListDomainList(this.convertToListDomain(wC001Ert, listDomainList));
        
        // Overflow
        // 桁あふれ
        List<MessageDomain> errList = new ArrayList<MessageDomain>();
        if (criteriaDomain.isVolumeOverflow()) {
            Object[] params = { commonService.getResource(criteriaDomain.getLocale(), "label.volume") };
            errList.add(new MessageDomain("criteriaDomain.volume", NXS_E7_0157, params));
        }
        if (criteriaDomain.isNetWeightOverflow()) {
            Object[] params = { commonService.getResource(criteriaDomain.getLocale(), "label.netWeight") };
            errList.add(new MessageDomain("criteriaDomain.netWeight", NXS_E7_0157, params));
        }
        if (!errList.isEmpty()) {
            throw new ValidationException(errList);
        }
        
        return criteriaDomain;
    }


    /**
     * A list domain is changed into an E-RT domain.
     * <br />リストドメインをE-RTドメインに変換します。
     *
     * @param criteriaDomain E-RT domain<br />E-RTドメイン
     * @param listDomainList List domain<br />リストドメイン
     * @return Conversion result<br />変換結果
     */
    protected WC001ErtDomain convertToErtDomain(WC001CriteriaDomain criteriaDomain, List<? extends WC001ListDomain> listDomainList) {

        WC001ErtDomain wC001ErtDomain = new WC001ErtDomain();
        //DateFormat df = new SimpleDateFormat("yyyy/MM/dd"); // NL021 DEL

        // Shipper_h -> NXS_COMP
        wC001ErtDomain.setShipperCd(criteriaDomain.getShipperCdHidden());
        // 【10】：Ship to
        wC001ErtDomain.setShipToCd(criteriaDomain.getShipToCd());
        // 【13】：Trans
        wC001ErtDomain.setTrnsCd(criteriaDomain.getTrnsCd());
        // 【15】：Requested ship date
        // NL021 DEL START
        //ParsePosition pos = new ParsePosition(0);
        //Date wlDueDt = df.parse(criteriaDomain.getDueDt(), pos);
        //wC001ErtDomain.setDueDt(wlDueDt);
        // NL021 DEL END
        // 【17】：W/H Com
        wC001ErtDomain.setPackingWhCompCd(criteriaDomain.getPackingWhCompCd());
        // 【18】：W/H 
        wC001ErtDomain.setPackingWhCd(criteriaDomain.getPackingWhCd());
        // 【19】：Plant CD
        wC001ErtDomain.setPlntCd(criteriaDomain.getPlntCd());
        // 【21】：LD CD
        wC001ErtDomain.setLoadingCd(criteriaDomain.getLoadingCd());
        // 【24】：Price Terms
        wC001ErtDomain.setPriceTerms(criteriaDomain.getPriceTerms());
        // 【25】：Return style CD
        wC001ErtDomain.setReturnStyleCd(criteriaDomain.getReturnStyleCd());
        // 【27】：Length
        if (CheckUtil.isNumericalNumber(criteriaDomain.getLength())) {
            wC001ErtDomain.setLength(new BigDecimal(criteriaDomain.getLength()));
        }
        // 【28】：Width
        if (CheckUtil.isNumericalNumber(criteriaDomain.getWidth())) {
            wC001ErtDomain.setWidth(new BigDecimal(criteriaDomain.getWidth()));
        }
        // 【29】：Height
        if (CheckUtil.isNumericalNumber(criteriaDomain.getHeight())) {
            wC001ErtDomain.setHeight(new BigDecimal(criteriaDomain.getHeight()));
        }
        // 【30】：Volume
        if (CheckUtil.isNumericalNumber(criteriaDomain.getVolume())) {
            wC001ErtDomain.setVolume(new BigDecimal(criteriaDomain.getVolume()));
        }
        // 【32】：G/W
        if (CheckUtil.isNumericalNumber(criteriaDomain.getGrossWeight())) {
            wC001ErtDomain.setGrossWeight(new BigDecimal(criteriaDomain.getGrossWeight()));
        }
        // 【92】：Shipper_h
        wC001ErtDomain.setShipperCd(criteriaDomain.getShipperCdHidden());
        
        List<WC001ErtItemDomain> wC001ErtItemList = new ArrayList<WC001ErtItemDomain>();
        for (WC001ListDomain listDomain : criteriaDomain.getListDomainList()) {

            WC001ErtItemDomain domain = new WC001ErtItemDomain();
            // 【42】：Contents1_PKG_Item_No
            domain.setKitParItemNo(listDomain.getPltzItemNo());
            // 【43】：Contents1_Model CD
            domain.setModelCd(listDomain.getModelCd());
            // 【44】：Contents1_Qty（※）
            if (CheckUtil.isNumericalNumber(listDomain.getQty())) {
                domain.setQty(new BigDecimal(listDomain.getQty()));
            }
            wC001ErtItemList.add(domain);
        }

        wC001ErtDomain.setErtItemDomainList(wC001ErtItemList);
        
        return wC001ErtDomain;
    }

    /**
     * An E-RT domain is changed into a criteria domain.
     * <br />E-RTドメインをcriteriaドメインに変換します。
     *
     * @param wC001ErtDomain E-RT domain<br />E-RTドメイン
     * @param criteriaDomain criteria domain<br />criteriaドメイン
     * @return Conversion result<br />変換結果
     */
    protected WC001CriteriaDomain convertToCriteriaDomain(WC001ErtDomain wC001ErtDomain, WC001CriteriaDomain criteriaDomain) {

        if (CheckUtil.isBlankOrNull(wC001ErtDomain.getShipToCd())) {
            criteriaDomain.setShipToNm("");
        }
        
        // [12] Ship to name
        criteriaDomain.setShipToNm(wC001ErtDomain.getShipToNmDisp());
        // [20] Cont. Sort Key
        criteriaDomain.setContainerSortingKey(wC001ErtDomain.getContainerSortingKey());
        // [21] LD CD
        criteriaDomain.setLoadingCd(wC001ErtDomain.getLoadingCd());
        // [23] C/C TYPE
        criteriaDomain.setCustomTimingTyp(wC001ErtDomain.getCustomTimingTyp());
        // [30] Volume
        if (!wC001ErtDomain.isVolumeOverflow() && wC001ErtDomain.getVolume() != null) {
            criteriaDomain.setVolume(wC001ErtDomain.getVolume().toString());
        } else {
            criteriaDomain.setVolume("");
        }
        criteriaDomain.setVolumeOverflow(wC001ErtDomain.isVolumeOverflow());
        // [31] N/W
        if (!wC001ErtDomain.isNetWeightOverflow() && wC001ErtDomain.getNetWeight() != null) {
            criteriaDomain.setNetWeight(NumberUtil.format(wC001ErtDomain.getNetWeight(), FORMAT_WEIGHT));
        } else {
            criteriaDomain.setNetWeight("");
        }
        criteriaDomain.setNetWeightOverflow(wC001ErtDomain.isNetWeightOverflow());
        
        String lengthUnitDisp = addBlackets(wC001ErtDomain.getLengthUnitDisp());
        String volumeUnitDisp = addBlackets(wC001ErtDomain.getVolumeUnitDisp());
        String weightUnitDisp = addBlackets(wC001ErtDomain.getWeightUnitDisp());
        criteriaDomain.setLengthUnitLength(lengthUnitDisp);
        criteriaDomain.setLengthUnitHeight(lengthUnitDisp);
        criteriaDomain.setLengthUnitWidth(lengthUnitDisp);
        criteriaDomain.setLengthUnitHidden(wC001ErtDomain.getLengthUnit());
        criteriaDomain.setVolumeUnit(volumeUnitDisp);
        criteriaDomain.setVolumeUnitHidden(wC001ErtDomain.getVolumeUnit());
        criteriaDomain.setWeightUnitNw(weightUnitDisp);
        criteriaDomain.setWeightUnitGw(weightUnitDisp);
        criteriaDomain.setWeightUnitHidden(wC001ErtDomain.getWeightUnit());
        
        return criteriaDomain;
    }

    /**
     * An E-RT domain is changed into a list domain.
     * <br />E-RTドメインをリストドメインに変換します。
     *
     * @param wC001ErtDomain E-RT domain<br />E-RTドメイン
     * @param listDomainList List domain<br />リストドメイン
     * @return Conversion result<br />変換結果
     */
    protected List<? extends WC001ListDomain> convertToListDomain(WC001ErtDomain wC001ErtDomain, List<? extends WC001ListDomain> listDomainList) {

        List<WC001ErtItemDomain> wC001ErtItemDomainList = wC001ErtDomain.getErtItemDomainList();
        for (int i = 0; i < listDomainList.size(); i++) {
        
            WC001ListDomain wC001List = listDomainList.get(i);
            
            // [42] Contents1_Model CD
            wC001List.setModelCd(wC001ErtItemDomainList.get(i).getModelCd());
        }

        return listDomainList;
    }
    
    /**
     * Add blackets to unit disp.
     * <br />単位表記の前後に括弧を追加する。
     *
     * @param unitDisp UNIT DISP<br />単位表記
     * @return blackets added unit disp<br />括弧を追加した単位表記
     */
    protected String addBlackets(String unitDisp) {
        
        if (!CheckUtil.isBlankOrNull(unitDisp)) {
            return "(" + unitDisp + ")";
        }
        
        return "";
    }
}
