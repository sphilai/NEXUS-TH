/*
 * Project : NEXUS_EXPORT
 *
 * 2014/01/01   DENSO IT SOLUTIONS     
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FORMAT_LENGTH;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FORMAT_VOLUME;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FORMAT_WEIGHT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W2013;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W2009CmlItemDomain;
import com.globaldenso.eca0027.core.business.domain.W2019CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W2019ListDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W2009CmlCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W2009CmlService;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.NumberUtil;

/**
 * implement class of the Facade service to Init action of a CML Trans Revise screen.
 * <br />CML Trans Revise画面のInitアクションに対するFacadeサービスの実装クラスです。
 * 
 * <pre>
 * bean id : w2019InitFacadeService
 * </pre>
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 11271 $
 */
public class W2019InitFacadeServiceImpl
    extends
    AbstractSearchFacadeService<List<? extends W2019ListDomain>, W2019CriteriaDomain> {

    /**
     * CML service
     * <br />CMLサービス
     */
    protected W2009CmlService w2009CmlService;

    /**
     * constructor
     * <br />デフォルトコンストラクタ
     */
    public W2019InitFacadeServiceImpl() {
    }
    
    /**
     * Setter method for w2009CmlService.
     *
     * @param cmlService Set for w2009CmlService
     */
    public void setW2009CmlService(W2009CmlService cmlService) {
        w2009CmlService = cmlService;
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * No Action
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W2019CriteriaDomain filterDomain(
        W2019CriteriaDomain criteriaDomain) throws GscmApplicationException,
        ApplicationException {
        return criteriaDomain;
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * No Action
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W2019CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {
        
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * No Action
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W2019CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {
        
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * No Action
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W2019CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {
        
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - Data acquisition of search-condition area and search-results area
     * - 検索条件エリア、検索結果エリアのデータ取得
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected List<? extends W2019ListDomain> callServices(
        W2019CriteriaDomain criteriaDomain) throws GscmApplicationException,
        ApplicationException {

        W2009CmlCriteriaDomain criteria = createCmlCriteria(criteriaDomain);

        List<? extends W2009CmlItemDomain> cmlItemList = new ArrayList<W2009CmlItemDomain>();

        // Search-results acquisition
        // 検索結果取得 
        cmlItemList = w2009CmlService.searchForPagingOnTransReviseInit(criteria, criteriaDomain.getOriginalScreenId());
        
        if (cmlItemList == null || cmlItemList.isEmpty()) {
            return null;
        }

        List<? extends W2019ListDomain> w2019ListDoaminList = createCmlItemList(cmlItemList);
        
        // UT110 TRIAL SHIPMENT/号試品対応 ADD if
        // In the case of trial shipment, Keep the input without automatic format in transition of W2019<->W2013.
        // 号試品の場合、W2019⇔W2013の遷移で勝手にフォーマットせずに入力を維持する。
        if (!(FLAG_Y.equals(criteria.getManualRegFlg())
                && SCREEN_ID_W2013.equals(criteriaDomain.getOriginalScreenId()))) {

            // Re-setting of the domain used for header part is carried out (since only the detail section is set to w2019CmlList).  
            // ヘッダ部分に使用するdomainを再セットする（w2019CmlListには明細部しかセットされていないため）
            CommonUtil.copyPropertiesDomainToDomain(criteriaDomain, criteria);

            // Format volume、weight items.
            // 重さ、容量項目のフォーマット
            criteriaDomain.setVolume(decimalToString(criteria.getVolume(), FORMAT_VOLUME));
            criteriaDomain.setNetWeight(decimalToString(criteria.getNetWeight(), FORMAT_WEIGHT));
            criteriaDomain.setGrossWeight(decimalToString(criteria.getGrossWeight(), FORMAT_WEIGHT));
            // UT110 TRIAL SHIPMENT/号試品対応 ADD START
            criteriaDomain.setLength(decimalToString(criteria.getLength(), FORMAT_LENGTH));
            criteriaDomain.setWidth(decimalToString(criteria.getWidth(), FORMAT_LENGTH));
            criteriaDomain.setHeight(decimalToString(criteria.getHeight(), FORMAT_LENGTH));
            // UT110 TRIAL SHIPMENT/号試品対応 ADD END

        // UT110 TRIAL SHIPMENT/号試品対応 ADD START
        } else {
            String length = criteriaDomain.getLength();
            String width = criteriaDomain.getWidth();
            String height = criteriaDomain.getHeight();
            String grossWeight = criteriaDomain.getGrossWeight();
            CommonUtil.copyPropertiesDomainToDomain(criteriaDomain, criteria);
            criteriaDomain.setLength(length);
            criteriaDomain.setWidth(width);
            criteriaDomain.setHeight(height);
            criteriaDomain.setGrossWeight(grossWeight);
            // Format volume and N/W.
            // 容量とN/Wはフォーマットする。
            criteriaDomain.setVolume(decimalToString(criteria.getVolume(), FORMAT_VOLUME));
            criteriaDomain.setNetWeight(decimalToString(criteria.getNetWeight(), FORMAT_WEIGHT));
        }
        // UT110 TRIAL SHIPMENT/号試品対応 ADD END

        return w2019ListDoaminList;
    }

    /**
     * {@link W2019CriteriaDomain} is changed into {@link W2009CmlCriteriaDomain}.
     * <br />{@link W2019CriteriaDomain} を {@link W2009CmlCriteriaDomain} に変換します。
     *
     * @param criteriaDomain {@link W2019CriteriaDomain}
     * @return {@link W2009CmlCriteriaDomain}
     */
    private W2009CmlCriteriaDomain createCmlCriteria(W2019CriteriaDomain criteriaDomain) {
        
        W2009CmlCriteriaDomain criteria = new W2009CmlCriteriaDomain();
        CommonUtil.copyPropertiesDomainToDomain(criteria, criteriaDomain);
        
        return criteria;
    }

    /**
     * The list of {@link W2009CmlItemDomain} is changed into the list of {@link W2019ListDomain}.
     * <br />{@link W2009CmlItemDomain}のリストを{@link W2019ListDomain}のリストに変換します。
     *
     * @param listDomainList The list of {@link W2009CmlItemDomain}<br />{@link W2009CmlItemDomain}のリスト
     * @return The list of {@link W2019ListDomain}<br />{@link W2019ListDomain}のリスト
     */
    private List<? extends W2019ListDomain> createCmlItemList(
        List<? extends W2009CmlItemDomain> listDomainList) {
        
        List<W2019ListDomain> cmlItemList = new ArrayList<W2019ListDomain>();
        
        for (W2009CmlItemDomain listDomain : listDomainList) {
            W2019ListDomain cmlItem = new W2019ListDomain();
            CommonUtil.copyPropertiesDomainToDomain(cmlItem, listDomain);
            cmlItemList.add(cmlItem);
        }
        return cmlItemList;
    }

    /**
     * The VALUE of BigDecimal is changed into a string.
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
