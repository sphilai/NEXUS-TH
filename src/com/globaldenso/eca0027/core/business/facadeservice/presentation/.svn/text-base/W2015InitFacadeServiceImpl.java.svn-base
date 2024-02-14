/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W2016;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WINDOW_ID_0;

import java.util.Map;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W2015CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W2014XtagCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W2014XtagService;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractDeleteFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.presentation.ScreenInfoDomain;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 * The initial service facade implementation class of X-tag Header
 * <br />X-tag Header画面のInitFacadeサービス実装クラスです。
 * <pre>
 * bean id:W2015InitFacadeService
 * </pre>
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W2015InitFacadeServiceImpl extends AbstractDeleteFacadeService<Void, W2015CriteriaDomain> {

    /**
     * X-Palletize service
     * <br />まとめパレタイズサービス
     */
    protected W2014XtagService w2014XtagService;
    
    /**
     * constructor.
     */
    public W2015InitFacadeServiceImpl() {
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
    protected W2015CriteriaDomain filterDomain(W2015CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {
        // No Action
        // 処理なし
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
    protected void validateItems(W2015CriteriaDomain criteriaDomain)
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
    protected void validateConsistency(W2015CriteriaDomain criteriaDomain)
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
    protected void validateDatabase(W2015CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // No Action
        // 処理なし
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - Create of a search-condition domain
     *       {@link W2014XtagCriteriaDomain} is created and a DSC-ID is set up.
     *
     * - A delete of X Palletize Work
     *       {@link W2014XtagService#deleteOnHeaderInit(W2014XtagCriteriaDomain)} is called,
     *       The X Palletize Work which the login user registered is deleted.
     * 
     * - 検索条件ドメインの作成
     *     {@link W2014XtagCriteriaDomain}を作成し、DSC-IDを設定する
     * 
     * - まとめパレタイズワークの削除
     *     {@link W2014XtagService#deleteOnHeaderInit(W2014XtagCriteriaDomain)}を呼出し、
     *     ログインユーザが登録したまとめパレタイズワークを削除する
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected Void callServices(W2015CriteriaDomain criteriaDomain) 
        throws GscmApplicationException, ApplicationException {
        
        // Create of a condition domain
        // 条件ドメインの作成
        W2014XtagCriteriaDomain criteria = createCriteria(criteriaDomain);
        
        // A delete of X Palletize Work
        // まとめパレタイズワークの削除
        deleteWork(criteria);
        
        return null;
    }

    /**
     * Create the condition domain of X-Palletize service.
     * <br />まとめパレタイズサービスの条件ドメインを作成します。
     *
     * @param criteriaDomain The search-condition domain of a X-TAG Header screen<br />まとめCML Header画面の検索条件ドメイン
     * @return X-Palletize search-condition domain<br />まとめパレタイズ検索条件ドメイン
     */
    protected W2014XtagCriteriaDomain createCriteria(W2015CriteriaDomain criteriaDomain) {
        // Create of a condition domain
        // 条件ドメインの作成
        W2014XtagCriteriaDomain criteria = new W2014XtagCriteriaDomain();
        
        // Setting (DSC-ID) of a condition domain
        // 条件ドメインの設定 (DSC-ID)
        CommonUtil.copyPropertiesDomainToDomain(criteria, criteriaDomain);
        
        return criteria;
    }

    /**
     * Delete session information.
     * <br />セッション情報を削除します。
     */
    protected void removeScreenInfo() {
        // Acquisition of a screen information domain
        // 画面情報ドメインの取得
        WindowInfoDomain windowInfo = (WindowInfoDomain) DensoContext.get().getGeneralArea(WINDOW_ID_0);
        Map<String, ScreenInfoDomain> screenInfo = windowInfo.getScreenInfo();
        
        // A delete of Create screen information
        // Create画面情報の削除
        if (screenInfo.containsKey(SCREEN_ID_W2016)) {
            screenInfo.remove(SCREEN_ID_W2016);
        }
    }
    
    /**
     * Delete a X Palletize Work.
     * <br />まとめパレタイズワークを削除します。
     *
     * @param criteria The search-condition domain of a X Palletize<br />まとめパレタイズの検索条件ドメイン
     * @throws ApplicationException When a X Palletize Work cannot be deleted<br />まとめパレタイズワークが削除できない場合
     */
    protected void deleteWork(W2014XtagCriteriaDomain criteria) throws ApplicationException {
        w2014XtagService.deleteOnHeaderInit(criteria);
    }
}
