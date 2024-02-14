/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CHECK_ON;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_N;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FORMAT_VOLUME;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FORMAT_WEIGHT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0004;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W2009CmlDomain;
import com.globaldenso.eca0027.core.business.domain.W2009CmlItemDomain;
import com.globaldenso.eca0027.core.business.domain.W2012CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W2012ListDomain;
import com.globaldenso.eca0027.core.business.domain.W2012UpdateDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W2009CmlCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W2009CmlService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractTransactFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.NumberUtil;


/**
 * This is an implement class of the Facade service to Delete action of a CML Register screen.
 * <br />CML Register画面のDeleteアクションに対するFacadeサービスの実装クラスです。
 * <pre>
 * bean id: w2012DeleteFacadeService
 * </pre>
 *
 * @author $Author: 810833843 $
 * @version $Revision: 6761 $
 */
public class W2012DeleteFacadeServiceImpl extends AbstractTransactFacadeService<List<? extends W2012ListDomain>, W2012UpdateDomain> {

    /**
     * Common service
     * <br />共通サービス
     */
    protected CommonService commonService;
    
    /**
     * CML service
     * <br />CMLサービス
     */
    protected W2009CmlService w2009CmlService;
    
    /**
     * constructor.
     */
    public W2012DeleteFacadeServiceImpl() {
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
    protected W2012UpdateDomain filterDomain(W2012UpdateDomain updateDomain)
        throws GscmApplicationException, ApplicationException {
        
        List<W2012ListDomain> newListDomainList = new ArrayList<W2012ListDomain>();
        
        // selected List domain is extracted.
        // 選択されたListドメインを抽出
        for (int i = 0; i < updateDomain.getListDomainList().size(); i++) {
            W2012ListDomain listDomain = (W2012ListDomain)updateDomain.getListDomainList().get(i);
            
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
        
        // A create of new Update domain
        // 新しいUpdateドメインの作成
        W2012UpdateDomain newUpdateDomain = new W2012UpdateDomain();
    
        // Copy of property
        // プロパティのコピー
        CommonUtil.copyPropertiesDomainToDomain(newUpdateDomain, updateDomain);
        
        // extracted setting of a List domain
        // 抽出したListドメインの設定
        newUpdateDomain.setListDomainList(newListDomainList);
        
        return newUpdateDomain;
        
    }
    
    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - No Action
     * 
     * - 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W2012UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // No Action
        // 処理なし
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - No Action
     * 
     * - 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W2012UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // No Action
        // 処理なし
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - No Action
     * 
     * - 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W2012UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // No Action
        // 処理なし
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - Delete process of check data
     *   {@link W2009CmlService#deleteOnRegisterDelete(W2009CmlCriteriaDomain, List)}
     *     Delete of - MIX tag
     *       Palletize Item Work
     *     - Delete of an ITEM NO
     *       Palletize Item Work
     *
     * - Re retrieval (processing mode: registration)  
     *     - Number-of-cases check
     *     {@link W2009CmlService#searchCountOnRegisterDelete(W2009CmlCriteriaDomain)}
     *     - data acquisition
     *     {@link W2009CmlService#searchOnRegisterDelete(W2009CmlCriteriaDomain)}
     * 
     * - チェックデータの削除処理
     *   {@link W2009CmlService#deleteOnRegisterDelete(W2009CmlCriteriaDomain, List)}
     *   - MIXタグの削除
     *     パレタイズ対象品ワーク
     *   - 品目番号の削除
     *     パレタイズ対象品ワーク
     *     
     * - 再検索(処理モード：登録)
     *   - 件数チェック
     *     {@link W2009CmlService#searchCountOnRegisterDelete(W2009CmlCriteriaDomain)}
     *   - データ取得
     *     {@link W2009CmlService#searchOnRegisterDelete(W2009CmlCriteriaDomain)}
     *   
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected List<? extends W2012ListDomain> callServices(W2012UpdateDomain updateDomain) 
        throws GscmApplicationException, ApplicationException {

        List<? extends W2009CmlItemDomain> w2012List = createCmlItemList(updateDomain.getListDomainList());
        W2009CmlCriteriaDomain criteria = createCmlCriteria(updateDomain.getCriteriaDomain());
        
        // A delete of Palletize Item Work
        // パレタイズ対象品ワークの削除
        w2009CmlService.deleteOnRegisterDelete(criteria, w2012List);
        
        // Re retrieval processing
        // 再検索処理
        List<? extends W2012ListDomain> listDomainList = new ArrayList<W2012ListDomain>();
        int count = w2009CmlService.searchCountOnRegisterDelete(criteria);
        if (count == 0) {
            return listDomainList;
        } else {
            W2009CmlDomain cmlDomain = w2009CmlService.searchOnRegisterDelete(criteria);
            listDomainList = setResultAndConvertToListDomain(cmlDomain, updateDomain);
            return listDomainList;
        }
        
    }

    /**
     * The list of {@link W2012ListDomain} is changed into the list of {@link W2009CmlItemDomain}.
     * <br />{@link W2012ListDomain}のリストを{@link W2009CmlItemDomain}のリストに変換します。
     *
     * @param listDomainList The list of {@link W2012ListDomain}<br />{@link W2012ListDomain}のリスト
     * @return The list of {@link W2009CmlItemDomain}<br />{@link W2009CmlItemDomain}のリスト
     */
    private List<? extends W2009CmlItemDomain> createCmlItemList(
        List<? extends W2012ListDomain> listDomainList) {
        
        List<W2009CmlItemDomain> cmlItemList = new ArrayList<W2009CmlItemDomain>();
        
        for (W2012ListDomain listDomain : listDomainList) {
            W2009CmlItemDomain cmlItem = new W2009CmlItemDomain();
            CommonUtil.copyPropertiesDomainToDomain(cmlItem, listDomain);
            cmlItemList.add(cmlItem);
        }
        return cmlItemList;
    }

    /**
     * {@link W2012CriteriaDomain} is changed into {@link W2009CmlCriteriaDomain}.
     * <br />{@link W2012CriteriaDomain} を {@link W2009CmlCriteriaDomain} に変換します。
     *
     * @param criteriaDomain {@link W2012CriteriaDomain}
     * @return {@link W2009CmlCriteriaDomain}
     */
    private W2009CmlCriteriaDomain createCmlCriteria(W2012CriteriaDomain criteriaDomain) {
        
        W2009CmlCriteriaDomain criteria = new W2009CmlCriteriaDomain();
        CommonUtil.copyPropertiesDomainToDomain(criteria, criteriaDomain);
        
        return criteria;
    }

    /**
     * The search results displayed on list area are generated.
     * <br />一覧エリアに表示する検索結果を生成する。
     *
     * @param cmlDomain Search-results domain<br />検索結果ドメイン
     * @param updateDomain Mass update domain<br />一括更新ドメイン
     * @return The domain list for a search-results list<br />検索結果一覧用のドメインリスト
     */
    private List<? extends W2012ListDomain> setResultAndConvertToListDomain(
        W2009CmlDomain cmlDomain, W2012UpdateDomain updateDomain) {
        List<W2012ListDomain> list = new ArrayList<W2012ListDomain>();
        // The search results displayed on list area are generated.
        // 一覧エリアに表示する検索結果を生成
        int listNo = 1;
        for (W2009CmlItemDomain itemDomain : cmlDomain.getCmlItemDomainList()) {
            W2012ListDomain listDomain = new W2012ListDomain();
            
            CommonUtil.copyPropertiesDomainToDomain(listDomain, itemDomain);
            listDomain.setNo(listNo);
            list.add(listDomain);
            
            listNo = listNo + 1;
        }

        // criteria of updateDomain is overwritten and the information displayed on search-condition area is returned.
        // 検索条件エリアに表示する情報をupdateDomainのcriteriaに上書きして返す
        updateDomain.getCriteriaDomain().setExpPackingDt("");
        updateDomain.getCriteriaDomain().setExpPackingIssuerNm("");
        updateDomain.getCriteriaDomain().setContainerSortingKey(cmlDomain.getContainerSortingKey());
        updateDomain.getCriteriaDomain().setLoadingCd(cmlDomain.getLoadingCd());
        updateDomain.getCriteriaDomain().setPkgFormTyp(cmlDomain.getPkgFormTyp());
        updateDomain.getCriteriaDomain().setInvoiceKey(cmlDomain.getInvoiceKey());
        updateDomain.getCriteriaDomain().setStgInstrItemFlg(cmlDomain.getStgInstrItemFlg());
        updateDomain.getCriteriaDomain().setCustomTimingTyp(cmlDomain.getCustomTimingTyp());
        updateDomain.getCriteriaDomain().setRtUseFlg("");
        updateDomain.getCriteriaDomain().setPalletNo("");
        updateDomain.getCriteriaDomain().setMainMark("");
        // Since re-registration of a Packing material is required when ITEM NO is deleted, a Packing-material register state is changed unregistered.
        // 品目番号を削除した場合は包装材の再登録が必要であるため、包装材登録状態を未登録に変更する
        updateDomain.getCriteriaDomain().setPackagingConfirmedFlg(FLAG_N);
        updateDomain.getCriteriaDomain().setVolume(decimalToString(cmlDomain.getVolume(), FORMAT_VOLUME));
        updateDomain.getCriteriaDomain().setVolumeUnit(cmlDomain.getVolumeUnit());
        updateDomain.getCriteriaDomain().setNetWeight(decimalToString(cmlDomain.getNetWeight(), FORMAT_WEIGHT));
        updateDomain.getCriteriaDomain().setWeightUnit(cmlDomain.getWeightUnit());
        updateDomain.getCriteriaDomain().setGrossWeight(decimalToString(cmlDomain.getGrossWeight(), FORMAT_WEIGHT));
        updateDomain.getCriteriaDomain().setVolumeOverflow(cmlDomain.isVolumeOverflow());
        updateDomain.getCriteriaDomain().setNetWeightOverflow(cmlDomain.isNetWeightOverflow());
        updateDomain.getCriteriaDomain().setGrossWeightOverflow(cmlDomain.isGrossWeightOverflow());
        
        return list;
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
