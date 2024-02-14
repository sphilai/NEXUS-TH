/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CHECK_ON;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FORMAT_WEIGHT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0004;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W2005MixTagDomain;
import com.globaldenso.eca0027.core.business.domain.W2005MixTagItemDomain;
import com.globaldenso.eca0027.core.business.domain.W2008CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W2008ListDomain;
import com.globaldenso.eca0027.core.business.domain.W2008UpdateDomain;
import com.globaldenso.eca0027.core.business.service.W2005MixTagService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractTransactFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.NumberUtil;


/**
 * The delete service facade implementation class of Multiple Item No. in 1Box PKG Register
 * <br />小箱内多品番梱包Register画面のDeleteFacadeサービス実装クラスです。
 * <pre>
 * bean W2008DeleteFacadeService
 * </pre>
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7966 $
 */
public class W2008DeleteFacadeServiceImpl extends AbstractTransactFacadeService<List<? extends W2008ListDomain>, W2008UpdateDomain> {
    
    /**
     * Common service
     * <br />共通サービス
     */
    protected CommonService commonService;
    
    /**
     * Multiple-p/n-packaged-in-box service
     * <br />小箱内多品番梱包サービス
     */
    protected W2005MixTagService w2005MixTagService;

    /**
     * constructor.
     */
    public W2008DeleteFacadeServiceImpl() {
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
     * Setter method for w2005MixTagService.
     *
     * @param mixTagService Set for w2005MixTagService
     */
    public void setW2005MixTagService(W2005MixTagService mixTagService) {
        w2005MixTagService = mixTagService;
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - Detailed line selection check
     *       This is a common-specifications .xls "functional common-specifications" No.12 particulars line selection check for details.   This is referred to.
     *
     * - Extraction of a target domain
     *       The List domain selected in the pictures is extracted, and it sets to a mass update domain.
     * 
     * - 明細行選択チェック
     *     詳細は共通仕様.xls「機能共通仕様」No.12 明細行選択チェック 参照
     *     
     * - 対象ドメインの抽出
     *     画面で選択されたListドメインを抽出し、一括更新ドメインに設定する
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W2008UpdateDomain filterDomain(W2008UpdateDomain updateDomain)
        throws GscmApplicationException, ApplicationException {

        List<W2008ListDomain> newListDomainList = new ArrayList<W2008ListDomain>();
        
        // selected List domain is extracted.
        // 選択されたListドメインを抽出
        for (W2008ListDomain listDomain : updateDomain.getListDomainList()) {
            if (CHECK_ON.equals(listDomain.getSelected())) {
                newListDomainList.add(listDomain);
            }
        }
        
        // Detailed line selection check
        // 明細行選択チェック
        if (newListDomainList.size() == 0) {
            List<MessageDomain> errList = Arrays.asList(new MessageDomain("", NXS_E7_0004, null));
            
            throw new ValidationException(errList);
        }
        
        // extracted setting of a List domain
        // 抽出したListドメインの設定
        updateDomain.setListDomainList(newListDomainList);
        
        return updateDomain;
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
    protected void validateItems(W2008UpdateDomain updateDomain)
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
    protected void validateConsistency(W2008UpdateDomain updateDomain)
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
    protected void validateDatabase(W2008UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // No Action
        // 処理なし
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - A create of Mix Tag Work
     *       It changes into {@link W2005MixTagItemDomain} from {@link W2008ListDomain}.
     *
     * - A delete of Mix Tag Work
     *       {@link W2005MixTagService#deleteOnRegisterDelete (List)} is called for created {@link W2005MixTagItemDomain} to an argument.
     *
     * - A converted in List domain
     *       The contents which carried out re retrieval are changed into {@link W2008ListDomain}.
     * 
     * - MIXED品目番号ワークの作成
     *     {@link W2008ListDomain}から{@link W2005MixTagItemDomain}に変換する
     *     
     * - MIXED品目番号ワークの削除
     *     作成した{@link W2005MixTagItemDomain}を引数に、{@link W2005MixTagService#deleteOnRegisterDelete(List)}を呼出す
     * 
     * - Listドメインへの変換
     *     再検索した内容を{@link W2008ListDomain}に変換する
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected List<? extends W2008ListDomain> callServices(W2008UpdateDomain updateDomain) 
        throws GscmApplicationException, ApplicationException {
        

        // A create of Mix Tag Work
        // MIXED品目番号ワークの作成
        List<? extends W2005MixTagItemDomain> mixTagItemList = createMixTagItem(updateDomain.getListDomainList());

        // A delete of Mix Tag Work
        // MIXED品目番号ワークの削除
        W2005MixTagDomain mixTagResultDomain = w2005MixTagService.deleteOnRegisterDelete(mixTagItemList);
        
        // A converted in a List domain
        // Listドメインへの変換
        return convertToListDomain(mixTagResultDomain, updateDomain.getCriteriaDomain());
   
    }

    /**
     * {@link W2008ListDomain} is changed into {@link W2005MixTagItemDomain}.
     * <br />{@link W2008ListDomain}を{@link W2005MixTagItemDomain}に変換します。
     *
     * @param listDomainList {@link W2008ListDomain}
     * @return {@link W2005MixTagItemDomain}
     */
    protected List<? extends W2005MixTagItemDomain> createMixTagItem(List<? extends W2008ListDomain> listDomainList) {
        
        List<W2005MixTagItemDomain> mixTagItemList = new ArrayList<W2005MixTagItemDomain>();

        for (W2008ListDomain listDomain : listDomainList) {
            W2005MixTagItemDomain mixTagItem = new W2005MixTagItemDomain();
            
            CommonUtil.copyPropertiesDomainToDomain(mixTagItem, listDomain);
            
            mixTagItemList.add(mixTagItem);
        }
        
        return mixTagItemList;
    }
    /**
     * {@link W2005MixTagDomain} is changed into {@link W2008ListDomain}.(at the time of the changes from a Create screen)
     * <br />{@link W2005MixTagDomain}を{@link W2008ListDomain}に変換します。(Create画面からの遷移時)
     *
     * @param mixTagDomain {@link W2005MixTagDomain} of a changing agency<br />変換元の{@link W2005MixTagDomain}
     * @param criteriaDomain W2008CriteriaDomain<br />W2008CriteriaDomain
     * @return Created {@link W2008ListDomain}<br />作成した{@link W2008ListDomain}
     * @throws ApplicationException When the WEIGHT UNIT of Shipper is unacquirable<br />Shipperの重量単位が取得できない場合
     */
    protected List<? extends W2008ListDomain> convertToListDomain(W2005MixTagDomain mixTagDomain, W2008CriteriaDomain criteriaDomain) 
        throws ApplicationException {
        
        List<W2008ListDomain> listDomainList = new ArrayList<W2008ListDomain>();

        // Acquisition of the WEIGHT UNIT of Shipper
        // Shipperの重量単位の取得
        String shipperWeightUnit = commonService.searchWeightUnit(criteriaDomain.getShipperCd());

        if (mixTagDomain != null) {

            for (int i = 0; i < mixTagDomain.getMixTagItemDomainList().size(); i++) {
                W2005MixTagItemDomain mixTagItemDomain = mixTagDomain.getMixTagItemDomainList().get(i);

                W2008ListDomain listDomain = new W2008ListDomain();
                
                // Copy of property
                // プロパティのコピー
                CommonUtil.copyPropertiesDomainToDomain(listDomain, mixTagDomain);
                CommonUtil.copyPropertiesDomainToDomain(listDomain, mixTagItemDomain);
                
                // resetting of an item overwritten
                // 上書きされる項目の再設定
                listDomain.setShipperCd(mixTagDomain.getShipperCd());
                listDomain.setCustomerCd(mixTagDomain.getCustomerCd());
                listDomain.setLgcyShipTo(mixTagDomain.getLgcyShipTo());
                listDomain.setTrnsCd(mixTagDomain.getTrnsCd());
                listDomain.setPlntCd(mixTagDomain.getPlntCd());
                listDomain.setLgcyWhCd(mixTagDomain.getLgcyWhCd());
                listDomain.setPltzInstrNo(mixTagDomain.getPltzInstrNo());
                listDomain.setWhCompCd(mixTagDomain.getWhCompCd());
                listDomain.setWhCd(mixTagDomain.getWhCd());
                listDomain.setMixTagStatus(mixTagDomain.getMixTagStatus());
                listDomain.setInvoiceKey(mixTagDomain.getInvoiceKey());
                listDomain.setContainerSortingKey(mixTagDomain.getContainerSortingKey());                
                listDomain.setLoadingCd(mixTagDomain.getLoadingCd());
                listDomain.setNetWeight(decimalToString(mixTagDomain.getNetWeight(), FORMAT_WEIGHT));
                listDomain.setGrossWeight(decimalToString(mixTagDomain.getGrossWeight(), FORMAT_WEIGHT));
                listDomain.setBoxNo(mixTagDomain.getBoxNo());
                listDomain.setMixTagNo(mixTagDomain.getMixTagNo());
                listDomain.setCustomTimingTyp(mixTagDomain.getCustomTimingTyp());
                listDomain.setContainerLooseTyp(mixTagDomain.getContainerLooseTyp());

                // The SEQUENCE NO from 1
                // 1からの連番
                listDomain.setNo(i + 1);

                listDomainList.add(listDomain);   
            }
        }
        
        // set criteria for display
        if (mixTagDomain != null && listDomainList != null && !listDomainList.isEmpty()) {
            criteriaDomain.setMixTagStatus("");
            criteriaDomain.setInvoiceKey(listDomainList.get(0).getInvoiceKey());
            criteriaDomain.setContainerSortingKey(listDomainList.get(0).getContainerSortingKey());
            criteriaDomain.setLoadingCd(listDomainList.get(0).getLoadingCd());
            criteriaDomain.setNetWeight(decimalToString(mixTagDomain.getNetWeight(), FORMAT_WEIGHT));
            criteriaDomain.setWeightUnit(shipperWeightUnit);
            String weightUnitDisp = commonService.searchMeasureUnitDisp(shipperWeightUnit);
            criteriaDomain.setWeightUnitDisp(weightUnitDisp);
            criteriaDomain.setGrossWeight(decimalToString(mixTagDomain.getGrossWeight(), FORMAT_WEIGHT));
            criteriaDomain.setPkgIp(mixTagDomain.getPkgIp());
            criteriaDomain.setBoxNo("");
            criteriaDomain.setMixTagNo("");
            criteriaDomain.setContainerLooseTyp(listDomainList.get(0).getContainerLooseTyp());
            criteriaDomain.setCustomTimingTyp(listDomainList.get(0).getCustomTimingTyp());
            criteriaDomain.setNetWeightOverflow(mixTagDomain.isNetWeightOverflow());
            criteriaDomain.setGrossWeightOverflow(mixTagDomain.isGrossWeightOverflow());
        }

        return listDomainList;
    }
    
    /**
     * Change the VALUE of BigDecimal into a string.
     * <br />BigDecimalの値を文字列に変換する。
     * <pre>
     * - null is returned when an argument is null.
     *     When this is not null, the result of having carried out {@link BigDecimal#toPlainString()} to the argument is returned.
     *
     * - 引数がnullの場合は、null を返す。
     *   nullでない場合は、引数に対して {@link BigDecimal#toPlainString()} を実施した結果を返す。
     * </pre>
     * @param decimalVal The VALUE of BigDecimal<br />BigDecimalの値
     * @param format Formater<br />フォーマッタ
     * @return The VALUE after a converted<br />変換後の値
     */
    protected String decimalToString(BigDecimal decimalVal, String format){
        
        if (decimalVal == null ) {
            return null;
        }
        if (format != null) {
            return NumberUtil.format(decimalVal, format);
        } else {
            return decimalVal.toPlainString();
        }
    }
}
