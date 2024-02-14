/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0010;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0062;

import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W2014PltzDomain;
import com.globaldenso.eca0027.core.business.domain.W2014XtagDomain;
import com.globaldenso.eca0027.core.business.domain.W2017ListDomain;
import com.globaldenso.eca0027.core.business.domain.W2017UpdateDomain;
import com.globaldenso.eca0027.core.business.service.W2014XtagService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractTransactFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 * The cancel service facade implementation class of X-tag Register
 * <br />X-tag Register画面のCancelFacadeサービス実装クラスです。
 * <pre>
 * bean id:W2017CancelFacadeService
 * </pre>
 *
 * @author $Author: 810833843 $
 * @version $Revision: 6774 $
 */
public class W2017CancelFacadeServiceImpl extends AbstractTransactFacadeService<Void, W2017UpdateDomain> {

    /**
     * X Palletize   Service
     * <br />まとめパレタイズ サービス
     */
    protected W2014XtagService w2014XtagService;
    
    /**
     * constructor.
     */
    public W2017CancelFacadeServiceImpl() {
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
    protected W2017UpdateDomain filterDomain(W2017UpdateDomain updateDomain)
        throws GscmApplicationException, ApplicationException {
        // No Action
        // 処理なし
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
    protected void validateItems(W2017UpdateDomain updateDomain)
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
    protected void validateConsistency(W2017UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // No Action
        // 処理なし
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - X Palletize's existence check
     *       A lock is covered so that the others cannot update select data.
     *       This is a call about {@link W2014XtagService#validateDatabaseTtXpltzOnRegisterCancel (String)}.
     *
     * - Check of a Palletize
     *       A lock is covered so that the others cannot update all the data affairs which are displayed on a screen and enter.
     *       This is a call about {@link W2014XtagService#validateDatabaseTtPltzOnRegisterCancel (java.util.List)}.
     * 
     * - まとめパレタイズの存在チェック
     *     選択データを他者が更新出来ないようにロックをかける
     *     {@link W2014XtagService#validateDatabaseTtXpltzOnRegisterCancel(String)}を呼出
     * 
     * - パレタイズのチェック
     *     画面に表示されて入るデータ全件を他者が更新出来ないようにロックをかける
     *     {@link W2014XtagService#validateDatabaseTtPltzOnRegisterCancel(java.util.List)}を呼出
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W2017UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        List<MessageDomain> errList = new ArrayList<MessageDomain>();
        
        // Acquisition of an input value
        // 入力値の取得
        List<String> mainMarkList = new ArrayList<String>();
        
        for (W2017ListDomain listDomain : updateDomain.getListDomainList()) {
            String mainMark = new String();
            mainMark = listDomain.getMainMark();
            mainMarkList.add(mainMark);
        }
        
        // X Palletize's existence check
        // まとめパレタイズの存在チェック
        if (!w2014XtagService.validateDatabaseTtXpltzOnRegisterCancel(updateDomain.getCriteriaDomain().getXmainMark())) {
            errList.add(new MessageDomain("", GSCM_E0_0010, null));
        }
        
        // Check of a Palletize
        // パレタイズのチェック
        List<String> mainMarkErrList = new ArrayList<String>();
        
        String msgCd = w2014XtagService.validateDatabaseTtPltzOnRegisterCancel(mainMarkList, mainMarkErrList);
        
        if (msgCd != null) {
            if ( GSCM_E0_0010.compareTo(msgCd) == 0 ) {
                errList.add(new MessageDomain("", GSCM_E0_0010, null));
            }
            if ( NXS_E1_0062.compareTo(msgCd) == 0 ){
                for (String mainMark : mainMarkErrList) {
                    Object[] obj = {mainMark};
                    errList.add(new MessageDomain("", NXS_E1_0062, obj));
                }
            }
        }
        
        if (0 < errList.size()) {
            throw new ValidationException(errList);
        }
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - A create of X-Palletize domain
     *       {@link W2014XtagDomain} is created and the following item is set up.
     *         - X Palletize NO
     *
     *       {@link W2014PltzDomain} is created and the following item is set up.
     *       - CML No
     *
     *       {@link W2014XtagDomain#setPltzDomainList (List)} is called and associated.
     *
     * - Execution of cancellation processing
     *       {@link W2014XtagService#transactOnRegisterCancel (W2014XtagDomain)} is called for created {@link W2014XtagDomain} to an argument.
     * 
     * - まとめパレタイズドメインの作成
     *     {@link W2014XtagDomain}を作成し、下記項目を設定する
     *       - まとめパレタイズNO
     *       
     *     {@link W2014PltzDomain}を作成し、下記項目を設定する
     *       - CML No
     *       
     *     {@link W2014XtagDomain#setPltzDomainList(List)}を呼出し、関連付ける
     *       
     * - キャンセル処理の実行
     *     作成した{@link W2014XtagDomain}を引数に、{@link W2014XtagService#transactOnRegisterCancel(W2014XtagDomain)}を呼出す
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected Void callServices(W2017UpdateDomain updateDomain) 
        throws GscmApplicationException, ApplicationException {

        // A create of X-Palletize domain
        // まとめパレタイズドメインの作成
        W2014XtagDomain xtag = createXtag(updateDomain);
        
        // Execution of cancellation processing
        // キャンセル処理の実行
        w2014XtagService.transactOnRegisterCancel(xtag);
        
        return null;
    }
    
    /**
     * Create a X-Palletize domain.
     * <br />まとめパレタイズドメインを作成します。
     *
     * @param updateDomain The mass update domain of a Register screen<br />Register画面の一括更新ドメイン
     * @return X-Palletize domain<br />まとめパレタイズドメイン
     */
    protected W2014XtagDomain createXtag(W2017UpdateDomain updateDomain) {
        W2014XtagDomain xtag = new W2014XtagDomain();

        // A setting of X-Palletize domain
        // まとめパレタイズドメインの設定
        CommonUtil.copyPropertiesDomainToDomain(xtag, updateDomain.getCriteriaDomain(), updateDomain.getCriteriaDomain().getScreenDateFormat());
        
        List<W2014PltzDomain> pltzList = new ArrayList<W2014PltzDomain>();
        
        // A create of X-Palletize ITEM-NO domain
        // まとめパレタイズ品目番号ドメインの作成
        for (W2017ListDomain listDomain : updateDomain.getListDomainList()) {
            W2014PltzDomain pltz = new W2014PltzDomain();
            
            CommonUtil.copyPropertiesDomainToDomain(pltz, listDomain);
            
            pltzList.add(pltz);
        }
        
        // A setting of X-Palletize ITEM-NO domain
        // まとめパレタイズ品目番号ドメインの設定
        xtag.setPltzDomainList(pltzList);
        
        return xtag;
    }


}
