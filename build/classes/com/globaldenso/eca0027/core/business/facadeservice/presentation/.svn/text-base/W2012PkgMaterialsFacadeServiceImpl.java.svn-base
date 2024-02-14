/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_N;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0049;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.W2009_CML_MODE_EDIT;

import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W2009CmlItemDomain;
import com.globaldenso.eca0027.core.business.domain.W2012CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W2012ListDomain;
import com.globaldenso.eca0027.core.business.domain.W2012UpdateDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W2009CmlCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W2009CmlService;
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
public class W2012PkgMaterialsFacadeServiceImpl extends AbstractTransactFacadeService<Void, W2012UpdateDomain> {

    /**
     * CML service
     * <br />CMLサービス
     */
    protected W2009CmlService w2009CmlService;
    
    /**
     * constructor.
     */
    public W2012PkgMaterialsFacadeServiceImpl() {
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
    protected W2012UpdateDomain filterDomain(W2012UpdateDomain updateDomain)
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
    protected void validateItems(W2012UpdateDomain updateDomain)
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
    protected void validateConsistency(W2012UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        // ST926 ADD
        // In the case of reference mode, skip input check of outer package code.
        // 参照モードでは外装記号入力チェックをしない。
        if (!W2009_CML_MODE_EDIT.equals(updateDomain.getCriteriaDomain().getFunctionMode())) {
            return;
        }
        
        // UT110 TRIAL SHIPMENT/号試品対応 ADD
        // In the case of manual registration, skip input check of outer package code.
        // マニュアル登録の場合外装記号入力チェックをしない。
        if (FLAG_Y.equals(updateDomain.getCriteriaDomain().getManualRegFlg())) {
            return;
        }
        
        // Argument acquisition
        // 引数取得
        String outrPkgCd = updateDomain.getCriteriaDomain().getOuterPkgCd();
        String pkgFormTyp = updateDomain.getCriteriaDomain().getPkgFormTyp();
        List<String> warningFlgList = new ArrayList<String>();
        for (W2012ListDomain domain : updateDomain.getListDomainList()) {
            warningFlgList.add(domain.getWarningFlg());
        }
        
        // Check execution
        // チェック実行
        boolean result = w2009CmlService.validateConsistencyOfRegisterPkgMtrial(outrPkgCd, pkgFormTyp, warningFlgList);
        
        // error output
        // エラー出力
        if (!result) {
            List<MessageDomain> errMessge = new ArrayList<MessageDomain>();
            errMessge.add(new MessageDomain("w2012CriteriaDomain.outerPkgCd", NXS_E7_0049, null));
            throw new ValidationException(errMessge);
        }
        
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
    protected void validateDatabase(W2012UpdateDomain updateDomain)
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
    protected Void callServices(W2012UpdateDomain updateDomain) 
        throws GscmApplicationException, ApplicationException {
        
        // UT110 TRIAL SHIPMENT/号試品対応 ADD
        // In the case of manual registration, and will not be automatic deployment of packaging materials.
        // Transitions by pkg work 0.
        // マニュアル登録の場合包装材の自動展開はせずワーク0件で遷移する。
        if (FLAG_Y.equals(updateDomain.getCriteriaDomain().getManualRegFlg())) {
            return null;
        }
        
        String functionMode = updateDomain.getCriteriaDomain().getFunctionMode();
        String packagingConfirmedFlg = updateDomain.getCriteriaDomain().getPackagingConfirmedFlg();
        
        if (W2009_CML_MODE_EDIT.equals(functionMode) && FLAG_N.equals(packagingConfirmedFlg)) {
        
            W2009CmlCriteriaDomain criteria = new W2009CmlCriteriaDomain();
            List<W2009CmlItemDomain> w2012List  = new ArrayList<W2009CmlItemDomain>();
            List<MessageDomain> errMessages = new ArrayList<MessageDomain>();
            
            // In the inside of the information from a screen and validateDatabase processing to criteria and w2012List
            // acquired VALUE is set up.
            // criteria と w2012List に画面からの情報と、validateDatabase処理の中で
            // 取得した値を設定する。
            setScreenInfos(updateDomain, criteria, w2012List);
    
            // A Palletize Item Package Work is registered with ITEM NO / ITEM NO, and an exterior sign.
            // 品目番号/品目番号・外装記号によりパレタイズ対象品PKGワークを登録
            w2009CmlService.transactOnRegisterPkgMaterials(criteria, w2012List, errMessages);
            
            if (errMessages.size() > 0) {
                throw new ValidationException(errMessages);
            }
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
    private void setScreenInfos(W2012UpdateDomain updateDomain,
        W2009CmlCriteriaDomain criteria, List<W2009CmlItemDomain> list) {
        W2012CriteriaDomain w2012Criteria = updateDomain.getCriteriaDomain();
        List<? extends W2012ListDomain> w2012List = updateDomain.getListDomainList();
        
        CommonUtil.copyPropertiesDomainToDomain(criteria, w2012Criteria, updateDomain.getScreenDateFormat());
        
        for (W2012ListDomain listDomain : w2012List) {
            W2009CmlItemDomain cmlItemDomain = new W2009CmlItemDomain();
            
            CommonUtil.copyPropertiesDomainToDomain(cmlItemDomain, listDomain);
            
            list.add(cmlItemDomain);
        }
    }
}
