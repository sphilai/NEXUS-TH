/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_N;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0004;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0006;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0013;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0149;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W2018;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TW_MIX_TAG_RT_MAX_COUNT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.RT_TYP_1WAY;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.TmPkgMtrlDomain;
import com.globaldenso.eca0027.core.business.domain.W2005MixTagRtDomain;
import com.globaldenso.eca0027.core.business.domain.W2018ListDomain;
import com.globaldenso.eca0027.core.business.domain.W2018UpdateDomain;
import com.globaldenso.eca0027.core.business.service.W2005MixTagService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractTransactFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CheckUtil;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.Validator;


/**
 * The save service facade implementation class of Multiple Item No. in 1Box PKG Detail Screen
 * <br />小箱内多品Detail画面のSaveFacadeサービス実装クラスです。
 * <pre>
 * bean id:W2018SaveFacadeServiceImpl
 * </pre>
 *
 * @author $Author: 810833843 $
 * @version $Revision: 9972 $
 */
public class W2018SaveFacadeServiceImpl extends AbstractTransactFacadeService<List<? extends W2018ListDomain>, W2018UpdateDomain> {

    
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
    public W2018SaveFacadeServiceImpl() {
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
     * No Action
     *
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W2018UpdateDomain filterDomain(W2018UpdateDomain updateDomain)
        throws GscmApplicationException, ApplicationException {
        
        List<W2018ListDomain> newListDomainList = new ArrayList<W2018ListDomain>();
        // selected List domain is extracted.
        // 選択されたListドメインを抽出
        for (int i = 0; i < updateDomain.getListDomainList().size(); i++) {
            W2018ListDomain listDomain = updateDomain.getListDomainList().get(i);

            listDomain.setIndex(i);
            if (!CheckUtil.isBlankOrNull(listDomain.getPkgItemNo()) 
                || !CheckUtil.isBlankOrNull(listDomain.getQty())) {
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
        W2018UpdateDomain newUpdateDomain = new W2018UpdateDomain();
    
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
     * - Common error checking
     *       Screen definition document_ECA0027_W2003_Palletize Instruction Create.xls "a screen item definition" is referred to for details.
     *
     * - 共通エラーチェック
     *     詳細は画面定義書_ECA0027_W2003_Palletize Instruction Create.xls「画面項目定義」を参照
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W2018UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        List<MessageDomain> errList = new ArrayList<MessageDomain>();
        
        for (int i = 0; i < updateDomain.getListDomainList().size(); i++) {
            W2018ListDomain listDomain = updateDomain.getListDomainList().get(i);
            
            Validator<W2018ListDomain> valid
                = new Validator<W2018ListDomain>(listDomain, "listDomainList", listDomain.getIndex());
            
            // Unary eye check
            // 単項目チェック
            String[] properties = {
                "qty"
            };
            valid.isValidateProperties(properties, SCREEN_ID_W2018);

            // Error check
            // エラー確認
            if (0 < valid.getErrList().size()) {
                errList.addAll(valid.getErrList());
            }
        }
        
        // Error check
        // エラー確認
        if (0 < errList.size()) {
            throw new ValidationException(errList);
        }
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - QUANTITY check
     *       This is a call about {@link W2005MixTagService#validateConsistencyQty (BigDecimal)}.
     *
     * - Unique check of a Packing material
     *       This is a call about {@link W2005MixTagService#validateConsistencyPakageItemNo (Map, List)}.
     *
     * - 数量チェック
     *     {@link W2005MixTagService#validateConsistencyQty(BigDecimal)}を呼出
     *     
     * - 包装材のユニークチェック
     *     {@link W2005MixTagService#validateConsistencyPakageItemNo(Map, List)}を呼出
     *     
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W2018UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        // Error list
        // エラーリスト
        List<MessageDomain> errList = new ArrayList<MessageDomain>();
        Locale locale = updateDomain.getLocale();
        
        
        Map<Integer, String> pkgItemNoMap = new HashMap<Integer, String>();
        
        for (int i = 0; i < updateDomain.getListDomainList().size(); i++) {
            W2018ListDomain listDomain = updateDomain.getListDomainList().get(i);
            
            int index = listDomain.getIndex();
            // Acquisition of an object item
            // 対象項目の取得
            BigDecimal qty = new BigDecimal(listDomain.getQty());
            
            // QUANTITY check
            // 数量チェック
            if (!w2005MixTagService.validateConsistencyQty(qty)) {
                Object[] params = {
                    commonService.getResource(locale, "label.qty"),
                    listDomain.getPkgItemNo()
                };
                errList.add(new MessageDomain(String.format("listDomainList[%d].qty", index), NXS_E7_0006, params));
            }
            
            // A VALUE is set to the list for a correlation check.
            // 相関チェック用のリストに値を設定
            pkgItemNoMap.put(index, listDomain.getPkgItemNo());
            
        }
        
        // Correlation check
        // Unique check of a Packing material
        // 相関チェック
        // 包装材のユニークチェック
        List<Integer> pkgItemList = new ArrayList<Integer>();
        if (!w2005MixTagService.validateConsistencyPakageItemNo(pkgItemNoMap, pkgItemList)) {

            errList.add(new MessageDomain(null, NXS_E7_0013, null));
            for(Integer indexNo : pkgItemList){
                errList.add(new MessageDomain(String.format("listDomainList[%d].pkgItemNo", indexNo), null, null)); 
            }
        }
        
        // Error check
        // エラー確認
        if (0 < errList.size()) {
            throw new ValidationException(errList);
        }
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - Packing material's existence check
     *       A PKG Materials MA and a PKG Materials Name MA are searched.
     *       This is a call about {@link W2005MixTagService#validateDatabaseTmPkgMaterialsOnDetailSave (String, String, String, TmPkgMtrlDomain)}.
     *
     * - 包装材の存在チェック
     *     包装材原単位、包装材名称原単位を検索
     *     {@link W2005MixTagService#validateDatabaseTmPkgMaterialsOnDetailSave(String, String, String, TmPkgMtrlDomain}を呼出
     *      
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W2018UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        // Create of an error list
        // エラーリストの作成
        List<MessageDomain> errList = new ArrayList<MessageDomain>();
        
        String shipperCd = updateDomain.getCriteriaDomain().getShipperCd();
        
        // PKG Materials MA
        // 包装材原単位
        TmPkgMtrlDomain mtrlDomain = new TmPkgMtrlDomain();
        
        // Packing material's existence check
        // 包装材の存在チェック
        for (int i = 0; i < updateDomain.getListDomainList().size(); i++) {
            W2018ListDomain listDomain = updateDomain.getListDomainList().get(i);
            String pkgItemNo = listDomain.getPkgItemNo();
            
            // The acquired data is set to a list when there is not error.
            // エラーが無い場合、取得したデータをリストにセットする
            if (w2005MixTagService.validateDatabaseTmPkgMaterialsOnDetailSave(shipperCd, pkgItemNo, mtrlDomain)) {
                listDomain.setModelCd(mtrlDomain.getModelCd());
                listDomain.setRtTyp(mtrlDomain.getRtTyp());
                listDomain.setWeightUnit(mtrlDomain.getWeightUnit());
                listDomain.setPkgWeight(mtrlDomain.getPkgWeight());
                listDomain.setOriginCntry(mtrlDomain.getOriginCntryCd());
                listDomain.setCurrCd(mtrlDomain.getCurrCd());
                listDomain.setPkgNm(mtrlDomain.getPkgMtrlNm());
                
            }else{
                String indexId = String.valueOf(i);
                String errorParam = "listDomainList[" + indexId + "].pkgItemNo";
                String[] msgParam = {updateDomain.getListDomainList().get(i).getPkgItemNo()};
                MessageDomain msgPkgItemNo = new MessageDomain(errorParam, NXS_E7_0149, msgParam);
                errList.add(msgPkgItemNo);
            }
        }
        // Error check
        // エラー確認
        if (0 < errList.size()) {
            throw new ValidationException(errList);
        }

    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * A delete of - Mix Tag RT Work, and registration processing
     *       {@link W2005MixTagService#transactOnDetailSave (List)} is called,
     *       The following is carried out.
     *         Delete process of a Mix Tag RT Work
     *           The past registration is deleted once and it registers in the state where this is displayed on the screen.
     *           Mix Tag RT Work
     *         Registration processing of a Mix Tag RT Work
     *           It processes to all the record.
     *           Mix Tag RT Work
     *         Re retrieval
     *
     * - MIXED用RT材ワークの削除及び登録処理
     *     {@link W2005MixTagService#transactOnDetailSave(List)}を呼出し、
     *     以下を実施
     *       MIXED用RT材ワークの削除処理
     *         過去の登録は1度削除し、画面に表示されている状態で登録を行う
     *         MIXED用RT材ワーク
     *       MIXED用RT材ワークの登録処理
     *         全てのレコードに対して、処理を行う
     *         MIXED用RT材ワーク
     *       再検索
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected List<? extends W2018ListDomain> callServices(W2018UpdateDomain updateDomain) 
        throws GscmApplicationException, ApplicationException {
        
        List<W2018ListDomain> list = new ArrayList<W2018ListDomain>();

        // A create of Mix Tag RT Work
        // MIXED用RT材ワークの作成
        List<? extends W2005MixTagRtDomain> mixTagRtList = createMixTagRt(updateDomain.getListDomainList());

        // A delete of Mix Tag RT Work, and registration processing
        // MIXED用RT材ワークの削除及び登録処理
        List<? extends W2005MixTagRtDomain> listDomainList = w2005MixTagService.transactOnDetailSave(mixTagRtList);

        // Even if there are search results and there is nothing, 50 affairs are displayed on 5 usual states.
        // 検索結果があってもなくても5常に50件表示する
        int listCount = listDomainList.size();
        if(TW_MIX_TAG_RT_MAX_COUNT < listCount){
            listCount = TW_MIX_TAG_RT_MAX_COUNT ;
        }
        int addCount = TW_MIX_TAG_RT_MAX_COUNT - listCount;

        if(listCount != 0){
            for (int i = 0; i < listCount; i++ ) {
                W2018ListDomain w2018ListDomain = new W2018ListDomain();
                W2005MixTagRtDomain w2005MixTagRtDomain = listDomainList.get(i);
                CommonUtil.copyPropertiesDomainToDomain(w2018ListDomain, w2005MixTagRtDomain);
                list.add(w2018ListDomain);
            }
        }

        if(addCount != 0){
            for (int K = 0; K < addCount; K++ ) {
                W2018ListDomain w2018ListDomain = new W2018ListDomain();
                w2018ListDomain.setDisabledFlg(FLAG_Y);
                list.add(w2018ListDomain);
            }
            // Un-active in the Delete button, when the number of search results is zero
            // 検索結果が0件の場合、Deleteボタンを非活性
            if(listCount == 0){
                list.get(0).setDeleteBtDisabledFlg(FLAG_Y);
            }
        }
        return list;
    }

    /**
     *   The list of {@link W2018ListDomain} is changed into list of {@link W2005MixTagRtDomain}.
     * <br />{@link W2018ListDomain}のリストを{@link W2005MixTagRtDomain}のリストに変換します。
     *
     * @param listDomainList Domain list<br />ドメインlist
     * @return mixTagRtList {@link W2005MixTagRtDomain}<br />結果リスト
     */
    protected List<? extends W2005MixTagRtDomain> createMixTagRt(List<? extends W2018ListDomain> listDomainList) {
        List<W2005MixTagRtDomain> mixTagRtList = new ArrayList<W2005MixTagRtDomain>();

        // A create of Mix Tag RT Work
        // MIXED用RT材ワークの作成
        for (W2018ListDomain listDomain : listDomainList) {
            W2005MixTagRtDomain mixTagRt = new W2005MixTagRtDomain();
            
            CommonUtil.copyPropertiesDomainToDomain(mixTagRt, listDomain);
            
            // Set rt_flg
            if (RT_TYP_1WAY.equals(listDomain.getRtTyp())) {
                mixTagRt.setRtFlg(FLAG_N);
            } else {
                mixTagRt.setRtFlg(FLAG_Y);
            }
            
            mixTagRt.setOriginCntryCd(listDomain.getOriginCntry());
            mixTagRtList.add(mixTagRt);
        }
        
        return mixTagRtList;
    }

}
