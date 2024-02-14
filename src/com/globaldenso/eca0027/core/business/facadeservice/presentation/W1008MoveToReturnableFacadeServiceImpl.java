/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W1008CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W1008ListDomain;
import com.globaldenso.eca0027.core.business.domain.W1008UpdateDomain;
import com.globaldenso.eca0027.core.business.domain.W2009CmlItemDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W2009CmlCriteriaDomain;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractTransactFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 * This is a Facade service implement class to PkgMaterial action of a CML Register screen.
 * <br />CML Register画面のPkgMaterialアクションに対するFacadeサービス実装クラスです。
 * <pre>
 * bean W2012InitFacadeService
 * </pre>
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 11301 $
 */
public class W1008MoveToReturnableFacadeServiceImpl extends AbstractTransactFacadeService<Void, W1008UpdateDomain> {

    
    /**
     * constructor.
     */
    public W1008MoveToReturnableFacadeServiceImpl() {
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
    protected W1008UpdateDomain filterDomain(W1008UpdateDomain updateDomain)
        throws GscmApplicationException, ApplicationException {
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
    protected void validateItems(W1008UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // No Action
        // 処理なし
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - Exterior symbol input check
     * 
     * - 外装記号入力チェック
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W1008UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
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
    protected void validateDatabase(W1008UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // No Action
        // 処理なし
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - A Palletize Item Package Work is registered with an ITEM NO / ITEM NO, and an exterior sign.
     *       Registration of a Palletize Item Package Work (registration by an ITEM NO)
     *       NEXUS Company Master
     *       PKG Specification MA(Detail)
     *       Package Specification Revision Master
     *       PKG Materials MA
     *       PKG Materials Name MA
     *       Palletize Item Work
     * 
     * - 品目番号/品目番号・外装記号によりパレタイズ対象品PKGワークを登録
     *     パレタイズ対象品PKGワークの登録（品目番号による登録）
     *     NEXUS会社原単位
     *     包装仕様原単位（明細）
     *     包装仕様有効リビジョン原単位
     *     包装材原単位
     *     包装材名称原単位
     *     パレタイズ対象品ワーク
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected Void callServices(W1008UpdateDomain updateDomain) 
        throws GscmApplicationException, ApplicationException {
        
        
        W2009CmlCriteriaDomain criteria = new W2009CmlCriteriaDomain();
        List<W2009CmlItemDomain> w1008List  = new ArrayList<W2009CmlItemDomain>();
        List<MessageDomain> errMessages = new ArrayList<MessageDomain>();
            
        // In the inside of the information from a screen and validateDatabase processing to criteria and w2012List
        // acquired VALUE is set up.
        // criteria と w2012List に画面からの情報と、validateDatabase処理の中で
        // 取得した値を設定する。
        setScreenInfos(updateDomain, criteria, w1008List);
            
        //Issue 096
        updateDomain.getCriteriaDomain().setRtPage("true");
        if (errMessages.size() > 0) {
            throw new ValidationException(errMessages);
        }
 
        return null;
    }
    
    /**
     * This is an information from a screen to the list of {@link W2009CmlCriteriaDomain} and {@link W2009CmlItemDomain},
     * Set up the VALUE acquired in validateDatabase processing.
     * <br />{@link W2009CmlCriteriaDomain} と {@link W2009CmlItemDomain} のリストに画面からの情報と、
     * validateDatabase処理の中で取得した値を設定する。
     *
     * @param updateDomain Mass update domain<br />一括更新ドメイン
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @param list Search results list<br />検索結果リスト
     */
    private void setScreenInfos(W1008UpdateDomain updateDomain,
        W2009CmlCriteriaDomain criteria, List<W2009CmlItemDomain> list) {
        W1008CriteriaDomain w1008Criteria = updateDomain.getCriteriaDomain();
        List<? extends W1008ListDomain> w1008List = updateDomain.getListDomainList();
        
        CommonUtil.copyPropertiesDomainToDomain(criteria, w1008Criteria, updateDomain.getScreenDateFormat());
        
        for (W1008ListDomain listDomain : w1008List) {
            W2009CmlItemDomain cmlItemDomain = new W2009CmlItemDomain();
            
            CommonUtil.copyPropertiesDomainToDomain(cmlItemDomain, listDomain);
            
            list.add(cmlItemDomain);
        }
    }
}
