/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TW_MIX_TAG_RT_MAX_COUNT;

import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W2005MixTagRtDomain;
import com.globaldenso.eca0027.core.business.domain.W2018CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W2018ListDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W2005MixTagRtCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W2005MixTagService;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CheckUtil;
import com.globaldenso.gscm.framework.util.CommonUtil;


/**
 * The initial service facade implementation class of Multiple Item No. in 1Box PKG Detail
 * <br />小箱内多品番梱包PKG Info Detail画面のInitFacadeサービス実装クラスです。
 * <pre>
 * bean id:W2018InitFacadeService
 * </pre>
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7336 $
 */
public class W2018InitFacadeServiceImpl extends AbstractSearchFacadeService<List<? extends W2018ListDomain>, W2018CriteriaDomain> {
        
    /**
     * Multiple-p/n-packaged-in-box service
     * <br />小箱内多品番梱包サービス
     */
    protected W2005MixTagService w2005MixTagService;

    /**
     * constructor.<br />constructor.
     */
    public W2018InitFacadeServiceImpl() {
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
     * No Action<br />処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W2018CriteriaDomain filterDomain(W2018CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {
        return criteriaDomain;
    }
    
    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * No Action<br />処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W2018CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // No Action
        // 処理なし
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * No Action<br />処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W2018CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // No Action
        // 処理なし
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * No Action<br />処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W2018CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // No Action
        // 処理なし
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - Distribution of a search
     * <br />- 検索の振り分け
     * 
     * - Acquisition of search data (in the case of the changes from Main Screen)  
     * <br />- 検索データの取得(Main Screenからの遷移の場合)
     *       This is a call about {@link W2005MixTagService#searchOnDetailInitByFromMain (W2005MixTagRtCriteriaDomain)}.
     *       <br />{@link W2005MixTagService#searchOnDetailInitByFromMain(W2005MixTagRtCriteriaDomain)}を呼出
     * 
     * - Acquisition of search data (in the case of the changes from a Create screen)
     * <br />- 検索データの取得(Create画面からの遷移の場合)
     *       This is a call about {@link W2005MixTagService#searchOnDetailInitByFromCreate (W2005MixTagRtCriteriaDomain)}.
     *       <br />{@link W2005MixTagService#searchOnDetailInitByFromCreate(W2005MixTagRtCriteriaDomain)}を呼出
     * 
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected List<? extends W2018ListDomain> callServices(W2018CriteriaDomain criteriaDomain) 
        throws GscmApplicationException, ApplicationException {
        
        List<W2018ListDomain> list = new ArrayList<W2018ListDomain>();
        
        // Search-condition domain
        // 検索条件ドメイン
        W2005MixTagRtCriteriaDomain criteria = new W2005MixTagRtCriteriaDomain();
        CommonUtil.copyPropertiesDomainToDomain(criteria, criteriaDomain);
        
        // When there is Session (W2008.Mix Tag No.), it changes from a Main Screen.
        // Session(W2008.Mix Tag No.)がある場合、Main Screen画面からの遷移
        if(!CheckUtil.isBlankOrNull(criteriaDomain.getMixTagNo())){
            
            List<? extends W2005MixTagRtDomain> mixTagList = w2005MixTagService.searchOnDetailInitByFromMain(criteria);
            
            // Even if there are search results and there is nothing, 50 affairs are displayed on usual states.
            // 検索結果があってもなくても常に50件表示する
            int listCount = mixTagList.size();
            if(TW_MIX_TAG_RT_MAX_COUNT < listCount){
                listCount = TW_MIX_TAG_RT_MAX_COUNT ;
            }
            int addCount = TW_MIX_TAG_RT_MAX_COUNT - listCount;

            if(listCount != 0){
                for (int i = 0; i < listCount; i++ ) {
                    W2018ListDomain w2018ListDomain = new W2018ListDomain();
                    W2005MixTagRtDomain w2005MixTagRtDomain = mixTagList.get(i);
                    CommonUtil.copyPropertiesDomainToDomain(w2018ListDomain, w2005MixTagRtDomain);
                    w2018ListDomain.setDisabledFlg(FLAG_Y);
                    list.add(w2018ListDomain);
                }
            }
            if(addCount != 0){
                for (int k = 0; k < addCount; k++ ) {
                    W2018ListDomain w2018ListDomain = new W2018ListDomain();
                    w2018ListDomain.setDisabledFlg(FLAG_Y);
                    list.add(w2018ListDomain);
                }
            }
            
        }else{
        // When Session (W2008.Mix Tag No.) is "" (blank), it changes from a Create screen.
        // Session(W2008.Mix Tag No.)が""(空白)の場合、Create画面からの遷移
            
            List<? extends W2005MixTagRtDomain> mixTagList = w2005MixTagService.searchOnDetailInitByFromCreate(criteria);
            
            // Even if there are search results and there is nothing, 50 affairs are displayed on usual states.
            // 検索結果があってもなくても常に50件表示する
            int listCount = mixTagList.size();
            if(TW_MIX_TAG_RT_MAX_COUNT < listCount){
                listCount = TW_MIX_TAG_RT_MAX_COUNT ;
            }
            int addCount = TW_MIX_TAG_RT_MAX_COUNT - listCount;
            
            if(listCount != 0){
                for (int i = 0; i < listCount; i++ ) {
                    W2018ListDomain w2018ListDomain = new W2018ListDomain();
                    W2005MixTagRtDomain w2005MixTagRtDomain = mixTagList.get(i);
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
        }
        return list;
    }
}
