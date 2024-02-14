/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.AUTH_EMPTY_NUMERIC;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FORMAT_LENGTH;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FORMAT_VOLUME;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FORMAT_WEIGHT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.W2009_CML_MODE_EDIT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.W2009_CML_MODE_REF;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W2009CmlDomain;
import com.globaldenso.eca0027.core.business.domain.W2009CmlItemDomain;
import com.globaldenso.eca0027.core.business.domain.W2012CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W2012ListDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W2009CmlCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W2009CmlService;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.NumberUtil;

/**
 * This is an InitFacade service implement class of a CML Register screen.
 * <br />CML Register画面のInitFacadeサービス実装クラスです。
 * <pre>
 * bean W2012InitFacadeService
 * </pre>
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 11271 $
 */
public class W2012InitFacadeServiceImpl extends AbstractSearchFacadeService<List<? extends W2012ListDomain>, W2012CriteriaDomain> {

    /**
     * CML service
     * <br />CML サービス
     */
    protected W2009CmlService w2009CmlService;
    
    /**
     * constructor.
     */
    public W2012InitFacadeServiceImpl() {
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
     * 
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W2012CriteriaDomain filterDomain(W2012CriteriaDomain criteriaDomain)
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
    protected void validateItems(W2012CriteriaDomain criteriaDomain)
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
    protected void validateConsistency(W2012CriteriaDomain criteriaDomain)
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
    protected void validateDatabase(W2012CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // No Action
        // 処理なし
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * At the time of the changes from - Main screen
     *       - Create of a search-condition domain
     *           A search condition is set to {@link W2009CmlCriteriaDomain}.
     *
     *       Search of - Palletize Item
     *       {@link W2009CmlService#searchOnRegisterInitByFromMain(W2009CmlCriteriaDomain)} is called for {@link W2009CmlCriteriaDomain} to an argument.
     *
     *       Create of - List domain
     *           {@link W2012ListDomain} is created and the contents of {@link W2009CmlDomain} and {@link W2009CmlItemDomain} are set up.
     *
     *       Return of - List domain
     *
     * At the time of the changes from - Create screen
     *       - Create of a search-condition domain
     *           A search condition is set to {@link W2009CmlCriteriaDomain}.
     *
     *       Search of - Palletize Item Work
     *       {@link W2009CmlService#searchOnRegisterInitByFromCreate(W2009CmlCriteriaDomain)} is called for {@link W2009CmlCriteriaDomain} to an argument.
     *
     *       Create of - List domain
     *           {@link W2012ListDomain} is created and the contents of {@link W2009CmlDomain} and {@link W2009CmlItemDomain} are set up.
     *
     *       Return of - List domain
     * 
     * - Main画面からの遷移時
     *     - 検索条件ドメインの作成
     *         {@link W2009CmlCriteriaDomain}に検索条件を設定する
     *         
     *     - パレタイズ対象品の検索
     *         {@link W2009CmlCriteriaDomain}を引数に{@link W2009CmlService#searchOnRegisterInitByFromMain(W2009CmlCriteriaDomain)}を呼出す
     *         
     *     - Listドメインの作成
     *         {@link W2012ListDomain}を作成し、{@link W2009CmlDomain}、{@link W2009CmlItemDomain}の内容を設定する
     *           
     *     - Listドメインの返却
     *     
     * - Create画面からの遷移時
     *     - 検索条件ドメインの作成
     *         {@link W2009CmlCriteriaDomain}に検索条件を設定する
     *         
     *     - パレタイズ対象品ワークの検索
     *         {@link W2009CmlCriteriaDomain}を引数に{@link W2009CmlService#searchOnRegisterInitByFromCreate(W2009CmlCriteriaDomain)}を呼出す
     *         
     *     - Listドメインの作成
     *         {@link W2012ListDomain}を作成し、{@link W2009CmlDomain}、{@link W2009CmlItemDomain}の内容を設定する
     *         
     *     - Listドメインの返却
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected List<? extends W2012ListDomain> callServices(W2012CriteriaDomain criteriaDomain) 
        throws GscmApplicationException, ApplicationException {

        // When processing mode is "references"
        // 処理モードが "参照" の場合
        if (W2009_CML_MODE_REF.equals(criteriaDomain.getFunctionMode())) {
            
            W2009CmlCriteriaDomain cmlCriteria = createCmlCriteria(criteriaDomain);
            
            W2009CmlDomain cml = searchCmlFromMain(cmlCriteria);
            
            return convertToListDomain(cml, criteriaDomain.getScreenDateFormat(), criteriaDomain);

        // Changes from a Create screen
        // Create画面からの遷移
        } else {
            W2009CmlCriteriaDomain cmlCriteria = createCmlCriteria(criteriaDomain);
            
            W2009CmlDomain cml = searchCmlFromCreatae(cmlCriteria);
            
            return convertToListDomain(cml, criteriaDomain.getScreenDateFormat(), criteriaDomain);
        }
    }
    
    /**
     * Search-condition domain create
     * <br/>検索条件ドメイン作成
     * 
     * <pre>
     *  From {@link W2012CriteriaDomain} to {@link W2009CmlCriteriaDomain}
     * {@link CommonUtil#copyPropertiesDomainToDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain, com.globaldenso.gscm.framework.business.domain.AbstractDomain, String)}
     * 
     *   {@link W2012CriteriaDomain} から {@link W2009CmlCriteriaDomain}
     *   {@link CommonUtil#copyPropertiesDomainToDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain, com.globaldenso.gscm.framework.business.domain.AbstractDomain, String)}
     * </pre>
     * 
     * @param criteriaDomain The search-condition domain of PL layer<br />PL層の検索条件ドメイン
     * @return The search-condition domain of BL layer<br />BL層の検索条件ドメイン
     */
    private W2009CmlCriteriaDomain createCmlCriteria(W2012CriteriaDomain criteriaDomain) {
        
        W2009CmlCriteriaDomain criteria = new W2009CmlCriteriaDomain();
        CommonUtil.copyPropertiesDomainToDomain(criteria, criteriaDomain, criteriaDomain.getScreenDateFormat());
        
        return criteria;
    }

    /**
     * A Palletize Item Work is searched. (in the case of registration)
     * <br />パレタイズ対象品ワークを検索します。(登録の場合)
     *
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return The list of {@link W2009CmlCriteriaDomain}<br />{@link W2009CmlCriteriaDomain}のリスト
     * @throws ApplicationException When there is an error by DB access<br />DBアクセスでエラーがあった場合
     */
    private W2009CmlDomain searchCmlFromCreatae(W2009CmlCriteriaDomain criteria) throws ApplicationException {
        return w2009CmlService.searchOnRegisterInitByFromCreate(criteria);
    }


    /**
     * A Palletize Item is searched. (in the case of a reference)
     * <br />パレタイズ対象品を検索します。(参照の場合)
     *
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return The list of {@link W2009CmlCriteriaDomain}<br />{@link W2009CmlCriteriaDomain}のリスト
     * @throws ApplicationException When there is an error by DB access<br />DBアクセスでエラーがあった場合
     */
    private W2009CmlDomain searchCmlFromMain(W2009CmlCriteriaDomain criteria) throws ApplicationException {
        return w2009CmlService.searchOnRegisterInitByFromMain(criteria);
    }

    /**
     * The information on search-condition area is set up and {@link W2009CmlDomain} is changed into {@link W2012ListDomain}.
     * <br />検索条件エリアの情報を設定し、{@link W2009CmlDomain}を{@link W2012ListDomain}に変換します。
     *
     * @param cml Search results<br />検索結果
     * @param screenDateFormat The Date format for screen display<br />画面表示用の日付フォーマット
     * @param criteriaDomain Search-condition domain<br />検索条件ドメイン
     * @return Created {@link W2012ListDomain}<br />作成した{@link W2012ListDomain}
     */
    private List<? extends W2012ListDomain> convertToListDomain(
        W2009CmlDomain cml, String screenDateFormat, W2012CriteriaDomain criteriaDomain) {
        
        List<W2012ListDomain> listDomainList = new ArrayList<W2012ListDomain>();
        if (cml != null) {
            
            // UT110 TRIAL SHIPMENT/号試品対応 ADD if
            // In the case of trial shipment registration, Keep the input without automatic format in transition of W2012<->W2013.
            // 号試品登録モードの場合、W2012⇔W2013の遷移で勝手にフォーマットせずに入力を維持する。
            if (!(FLAG_Y.equals(cml.getManualRegFlg())
                    && W2009_CML_MODE_EDIT.equals(criteriaDomain.getFunctionMode()))) {            
            
                // The VALUE displayed on criteriaDomain is set up.
                // criteriaDomain に表示する値を設定する。
                CommonUtil.copyPropertiesDomainToDomain(criteriaDomain, cml, screenDateFormat);
                
                // Format volume、weight items.
                // 重さ、容量項目のフォーマット
                criteriaDomain.setVolume(decimalToString(cml.getVolume(), FORMAT_VOLUME));
                criteriaDomain.setNetWeight(decimalToString(cml.getNetWeight(), FORMAT_WEIGHT));
                criteriaDomain.setGrossWeight(decimalToString(cml.getGrossWeight(), FORMAT_WEIGHT));
                // UT110 TRIAL SHIPMENT/号試品対応 ADD START
                criteriaDomain.setLength(decimalToString(cml.getLength(), FORMAT_LENGTH));
                criteriaDomain.setWidth(decimalToString(cml.getWidth(), FORMAT_LENGTH));
                criteriaDomain.setHeight(decimalToString(cml.getHeight(), FORMAT_LENGTH));
                // UT110 TRIAL SHIPMENT/号試品対応 ADD END
            
            // UT110 TRIAL SHIPMENT/号試品対応 ADD START
            } else {
                String length = criteriaDomain.getLength();
                String width = criteriaDomain.getWidth();
                String height = criteriaDomain.getHeight();
                String grossWeight = criteriaDomain.getGrossWeight();
                CommonUtil.copyPropertiesDomainToDomain(criteriaDomain, cml, screenDateFormat);
                criteriaDomain.setLength(length);
                criteriaDomain.setWidth(width);
                criteriaDomain.setHeight(height);
                criteriaDomain.setGrossWeight(grossWeight);
                // Format volume and N/W.
                // 容量とN/Wはフォーマットする。
                criteriaDomain.setVolume(decimalToString(cml.getVolume(), FORMAT_VOLUME));
                criteriaDomain.setNetWeight(decimalToString(cml.getNetWeight(), FORMAT_WEIGHT));
            }
            // UT110 TRIAL SHIPMENT/号試品対応 ADD END
            
            // The data for list displays is set up.
            // 一覧表示用のデータを設定する
            int i = 1;
            for (W2009CmlItemDomain cmlItem : cml.getCmlItemDomainList()) {
                W2012ListDomain listDomain = new W2012ListDomain();
                
                String authFlg = cmlItem.getAuthFlg();
                
                // A setting of Palletize, and a Palletize Item
                // パレタイズ、パレタイズ対象品の設定
                listDomain.setNo(i);
                if (W2009_CML_MODE_REF.equals(criteriaDomain.getFunctionMode())) {
                    listDomain.setPltzItemNo(maskString(cmlItem.getPltzItemNo(), authFlg));
                    listDomain.setPkgCd(maskString(cmlItem.getPkgCd(), authFlg));
                    listDomain.setItemDescription(maskString(cmlItem.getItemDescription(), authFlg));
                    listDomain.setShippingLot(maskString(decimalToString(cmlItem.getShippingLot(), null), authFlg));
                    listDomain.setInstrQty(maskString(decimalToString(cmlItem.getInstrQty(), null), authFlg));
                    listDomain.setQty(maskString(decimalToString(cmlItem.getQty(), null), authFlg));
                    listDomain.setTagQty(maskString(decimalToString(cmlItem.getTagQty(), null), authFlg));
                    listDomain.setMixTagFlg(maskString(cmlItem.getMixTagFlg(), authFlg));
                    listDomain.setWarningFlg(maskString(cmlItem.getWarningFlg(), authFlg));
                    listDomain.setAuthFlg(authFlg);
                } else {
                    listDomain.setPltzItemNo(cmlItem.getPltzItemNo());
                    listDomain.setPkgCd(cmlItem.getPkgCd());
                    listDomain.setItemDescription(cmlItem.getItemDescription());
                    listDomain.setShippingLot(decimalToString(cmlItem.getShippingLot(), null));
                    listDomain.setInstrQty(decimalToString(cmlItem.getInstrQty(), null));
                    listDomain.setQty(decimalToString(cmlItem.getQty(), null));
                    listDomain.setTagQty(decimalToString(cmlItem.getTagQty(), null));
                    listDomain.setMixTagFlg(cmlItem.getMixTagFlg());
                    listDomain.setWarningFlg(cmlItem.getWarningFlg());
                    listDomain.setAuthFlg(cmlItem.getAuthFlg());
                }
                listDomainList.add(listDomain);
                i = i + 1;
            }
        }
        return listDomainList;
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
    
    /**
     * The mask of the string is carried out.
     * <br />文字列をマスクする。
     * <pre>
     * - A whole sentence character is changed into * and returned.
     * 
     * - 全文字を*に変換して返す。nullの場合は、nullを返す。
     * </pre>
     * @param realValue String<br />文字列
     * @param authFlg Authority class<br />権限区分
     * @return The string which carried out the mask<br />マスクした文字列
     */
    protected String maskString(String realValue, String authFlg){
        
        if ( realValue == null) {
            return realValue;
        }
        
        if (AUTH_EMPTY_NUMERIC.endsWith(authFlg)) {
            return realValue.replaceAll(".", "*");
        } else {
            return realValue;
        }

    }
}
