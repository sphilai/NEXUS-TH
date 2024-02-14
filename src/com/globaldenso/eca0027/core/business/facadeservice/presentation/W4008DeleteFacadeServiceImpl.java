/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CHECK_ON;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0004;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W4005PltzDomain;
import com.globaldenso.eca0027.core.business.domain.W4005StgActDomain;
import com.globaldenso.eca0027.core.business.domain.W4008ListDomain;
import com.globaldenso.eca0027.core.business.domain.W4008UpdateDomain;
import com.globaldenso.eca0027.core.business.service.W4005StgActService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractDeleteFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 * The Delete service facade implementation class of Staging Actuality Register screen
 * <br />山作り実績Register画面の Delete facadeサービス実装クラスです。
 * <pre>
 * bean id:w4008DeleteFacadeService
 * </pre>
 *
 * @author $Author: masaki_awata@dnitsol.com $
 * @version $Revision: 5193 $
 */
public class W4008DeleteFacadeServiceImpl extends
    AbstractDeleteFacadeService<Integer, W4008UpdateDomain> {

    /**
     * Staging actuality service.
     */
    protected W4005StgActService w4005StgActService;

    /**
     * constructor.
     */
    public W4008DeleteFacadeServiceImpl() {
    }

    /**
     * Setter method for w4005StgActService.
     *
     * @param stgActService Set for w4005StgActService
     */
    public void setW4005StgActService(W4005StgActService stgActService) {
        w4005StgActService = stgActService;
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * - Filtering of items that have been selected 
     *     The reset to w4008UpdateDomain.listDomainList one obtained by removing the item from w4008UpdateDomain.listDomainList, unchecked 
     * - Line item selection check 
     *     If 0, the size of w4008UpdateDomain.listDomainList after filtering line item not selected error
     *
     * - 選択されている明細のフィルタリング
     *     w4008UpdateDomain.listDomainListから、チェックされていない明細を除去したものをw4008UpdateDomain.listDomainListに再設定
     * - 明細行選択チェック
     *     フィルタリング後のw4008UpdateDomain.listDomainListのサイズが0の場合、明細行未選択エラー
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W4008UpdateDomain filterDomain(W4008UpdateDomain w4008UpdateDomain)
        throws GscmApplicationException, ApplicationException {

        // Filtering only items that are selected
        // 選択された明細のみにフィルタリング
        List<W4008ListDomain> filterListDomainList = new ArrayList<W4008ListDomain>();
        for (W4008ListDomain listDomain : w4008UpdateDomain.getW4008ListDomainList()) {
            if (CHECK_ON.equals(listDomain.getSelected())) {
                filterListDomainList.add(listDomain);
            }
        }
        w4008UpdateDomain.setW4008ListDomainList(filterListDomainList);

        // 明細行選択なしの場合
        if (filterListDomainList.size() < 1) {
            List<MessageDomain> errList = Arrays.asList(new MessageDomain(null, NXS_E7_0004, null));
            throw new ValidationException(errList);
        }

        return w4008UpdateDomain;
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * - No processing
     * - 処理なし
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W4008UpdateDomain w4008UpdateDomain)
        throws GscmApplicationException, ApplicationException, ValidationException {
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * - No processing
     * - 処理なし
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W4008UpdateDomain w4008UpdateDomain)
        throws GscmApplicationException, ApplicationException, ValidationException {
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * - No processing
     * - 処理なし
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W4008UpdateDomain w4008UpdateDomain)
        throws GscmApplicationException, ApplicationException, ValidationException {
    }

    /**
     * {@inheritDoc}.
     * Call the service to be removed from the work the configuration of palletize Staging Actuality creating
     * <br />作成中山作り実績の構成パレタイズをワークから削除するサービスを呼び出します。
     * <pre>
     * - The transfer context information to W4005StgActDomain stgActDomain than w4008UpdateDomain
     * - The transfer of key information to be deleted from the stgActDomain.pltzDomainList w4008UpdateDomain.listDomainList
     * - Delete the record of Staging Actuality Work
     *     Call the W4005StgActService.deleteOnRegisterDelete an argument stgActDomain
     *
     * - w4008UpdateDomainよりW4005StgActDomain stgActDomainにコンテキスト情報を移送
     * - w4008UpdateDomain.listDomainListよりstgActDomain.pltzDomainListに削除対象のキー情報を移送
     * - 山作り実績ワークのレコードを削除
     *    stgActDomainを引数にW4005StgActService.deleteOnRegisterDeleteの呼び出し
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected Integer callServices(W4008UpdateDomain w4008UpdateDomain)
        throws GscmApplicationException, ApplicationException {

        // PL domain -> BL domain transfer
        // PLドメイン→BLドメイン移送
        W4005StgActDomain stgActDomain = new W4005StgActDomain();
        CommonUtil.copyPropertiesDomainToDomain(stgActDomain,
            w4008UpdateDomain, w4008UpdateDomain.getScreenDateFormat());

        List<W4005PltzDomain> w4005PltzDomainList = new ArrayList<W4005PltzDomain>();
        for (W4008ListDomain w4008ListDomain : w4008UpdateDomain.getW4008ListDomainList()) {
            // PL domain -> BL domain transfer
            // PLドメイン→BLドメイン移送
            W4005PltzDomain pltzDomain = new W4005PltzDomain();
            CommonUtil.copyPropertiesDomainToDomain(pltzDomain,
                w4008ListDomain, w4008UpdateDomain.getScreenDateFormat());
            w4005PltzDomainList.add(pltzDomain);
        }
        stgActDomain.setPltzDomainList(w4005PltzDomainList);

        // Call delete service
        // 削除サービス呼び出し
        int deleteCount = w4005StgActService.deleteOnRegisterDelete(stgActDomain);

        return deleteCount;
    }
}
