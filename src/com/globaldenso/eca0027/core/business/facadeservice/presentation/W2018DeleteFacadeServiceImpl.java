/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CHECK_ON;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0004;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TW_MIX_TAG_RT_MAX_COUNT;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W2005MixTagItemDomain;
import com.globaldenso.eca0027.core.business.domain.W2005MixTagRtDomain;
import com.globaldenso.eca0027.core.business.domain.W2008ListDomain;
import com.globaldenso.eca0027.core.business.domain.W2018ListDomain;
import com.globaldenso.eca0027.core.business.domain.W2018UpdateDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W2005MixTagRtCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W2005MixTagService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractTransactFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 * The delete service facade implementation class of Multiple Item No. in 1Box PKG Detail
 * <br />小箱内多品番梱包PKG Info Detail画面のDeleteFacadeサービス実装クラスです。
 * <pre>
 * bean id:W2018DeleteFacadeService
 * </pre>
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W2018DeleteFacadeServiceImpl extends AbstractTransactFacadeService<List<? extends W2018ListDomain>, W2018UpdateDomain> {
    
    /**
     * Multiple-p/n-packaged-in-box service
     * <br />小箱内多品番梱包サービス
     */
    protected W2005MixTagService w2005MixTagService;

    /**
     * constructor.
     */
    public W2018DeleteFacadeServiceImpl() {
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
     * </pre>
     * <pre>
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
    protected W2018UpdateDomain filterDomain(W2018UpdateDomain updateDomain)
        throws GscmApplicationException, ApplicationException {
        
        List<W2018ListDomain> newListDomainList = new ArrayList<W2018ListDomain>();
        
        // selected List domain is extracted.
        // 選択されたListドメインを抽出
        for (W2018ListDomain listDomain : updateDomain.getListDomainList()) {
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
     * - Common error checking
     *       Screen definition document_ECA0027_W2003_Palletize Instruction Create.xls "a screen item definition" is referred to for details.
     * </pre>
     * <pre>
     * - 共通エラーチェック
     *     詳細は画面定義書_ECA0027_W2003_Palletize Instruction Create.xls「画面項目定義」を参照
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W2018UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
    }

    /**
     * {@inheritDoc}.
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
    protected void validateConsistency(W2018UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // No Action
        // 処理なし
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * No Action
     * </pre>
     * <pre>
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W2018UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // No Action
        // 処理なし
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - Delete process of check data
     *       {@link W2005MixTagService#deleteOnDetailDelete (List<W2005MixTagRtCriteriaDomain>)} is called,
     *       The following is carried out.
     *         Delete process of check data
     *         Re retrieval processing
     * </pre>
     * <pre>
     * - チェックデータの削除処理
     *     {@link W2005MixTagService#deleteOnDetailDelete(List)}を呼出し、
     *     以下を実施
     *       チェックデータの削除処理
     *       再検索処理
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected List<? extends W2018ListDomain> callServices(W2018UpdateDomain updateDomain) 
        throws GscmApplicationException, ApplicationException {
        
        // A condition create of Mix Tag RT Work
        // MIXED用RT材ワークの条件作成
        List<? extends W2005MixTagRtCriteriaDomain> mixTagRtCriteriaList = createMixTagItemRt(updateDomain.getListDomainList());
        
        // A delete of Mix Tag RT Work
        // MIXED用RT材ワークの削除
        List<? extends W2005MixTagRtDomain> resultList = w2005MixTagService.deleteOnDetailDelete(mixTagRtCriteriaList);
        
        return convertToListDomain(resultList);
        
    }

    /**
     *   {@link W2018ListDomain} is changed into {@link W2005MixTagRtCriteriaDomain}.
     * <br />{@link W2018ListDomain}を{@link W2005MixTagRtCriteriaDomain}に変換します。
     *
     * @param listDomainList {@link W2008ListDomain}
     * @return {@link W2005MixTagItemDomain}
     */
    protected List<? extends W2005MixTagRtCriteriaDomain> createMixTagItemRt(List<? extends W2018ListDomain> listDomainList) {
        
        List<W2005MixTagRtCriteriaDomain> mixTagRtCriteriaList = new ArrayList<W2005MixTagRtCriteriaDomain>();

        for (W2018ListDomain listDomain : listDomainList) {
            W2005MixTagRtCriteriaDomain mixTagRt = new W2005MixTagRtCriteriaDomain();
            
            CommonUtil.copyPropertiesDomainToDomain(mixTagRt, listDomain);
            
            mixTagRtCriteriaList.add(mixTagRt);
        }
        
        return mixTagRtCriteriaList;
    }
    
    /**
     *   {@link W2005MixTagRtDomain} is changed into {@link W2018ListDomain}.
     * <br />{@link W2005MixTagRtDomain}を{@link W2018ListDomain}に変換します。
     *
     * @param mixTagResultList {@link W2005MixTagRtDomain} of a changing agency <br /> 変換元の{@link W2005MixTagRtDomain}
     * @return Created {@link W2018ListDomain}<br />作成した{@link W2018ListDomain}
     */
    protected List<? extends W2018ListDomain> convertToListDomain(List<? extends W2005MixTagRtDomain> mixTagResultList) {
        
        List<W2018ListDomain> list = new ArrayList<W2018ListDomain>();
        
        // Even if there are search results and there is nothing, 50 affairs are displayed on 5 usual states.
        // 検索結果があってもなくても5常に50件表示する
        int listCount = mixTagResultList.size();
        if(TW_MIX_TAG_RT_MAX_COUNT < listCount){
            listCount = TW_MIX_TAG_RT_MAX_COUNT ;
        }
        int addCount = TW_MIX_TAG_RT_MAX_COUNT - listCount;
        
        if(listCount != 0){
            for (int i = 0; i < listCount; i++ ) {
                W2018ListDomain w2018ListDomain = new W2018ListDomain();
                W2005MixTagRtDomain w2005MixTagRtDomain = mixTagResultList.get(i);
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
        }

        // Un-active in the Delete button, when the number of search results is zero
        // 検索結果が0件の場合、Deleteボタンを非活性
        if(listCount == 0){
            list.get(0).setDeleteBtDisabledFlg(FLAG_Y);
        }
        return list;
    }
}
