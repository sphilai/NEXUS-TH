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
import com.globaldenso.eca0027.core.business.domain.W4001PltzDomain;
import com.globaldenso.eca0027.core.business.domain.W4001StgInstrDomain;
import com.globaldenso.eca0027.core.business.domain.W4004ListDomain;
import com.globaldenso.eca0027.core.business.domain.W4004UpdateDomain;
import com.globaldenso.eca0027.core.business.service.W4001StgInstrService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractDeleteFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 * The Delete service facade implementation class of Staging Instruction Register screen
 * <br />荷揃え指示Register画面の Delete facadeサービス実装クラスです。
 * <pre>
 * bean id:w4004DeleteFacadeService
 * </pre>
 *
 * @author $Author: masaki_awata@dnitsol.com $
 * @version $Revision: 5193 $
 */
public class W4004DeleteFacadeServiceImpl extends
    AbstractDeleteFacadeService<Integer, W4004UpdateDomain> {

    /**
     * Staging instruction service.
     */
    protected W4001StgInstrService w4001StgInstrService;

    /**
     * constructor.
     */
    public W4004DeleteFacadeServiceImpl() {
    }

    /**
     * Setter method for w4001StgInstrService.
     *
     * @param stgInstrService Set for w4001StgInstrService
     */
    public void setW4001StgInstrService(W4001StgInstrService stgInstrService) {
        w4001StgInstrService = stgInstrService;
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * - Filtering of items that have been selected 
     *     The reset to w4004UpdateDomain.listDomainList one obtained by removing the item from w4004UpdateDomain.listDomainList, unchecked 
     * - Line item selection check 
     *     If 0, the size of w4004UpdateDomain.listDomainList after filtering line item not selected error
     *
     * - 選択されている明細のフィルタリング
     *     w4004UpdateDomain.listDomainListから、チェックされていない明細を除去したものをw4004UpdateDomain.listDomainListに再設定
     * - 明細行選択チェック
     *     フィルタリング後のw4004UpdateDomain.listDomainListのサイズが0の場合、明細行未選択エラー
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W4004UpdateDomain filterDomain(W4004UpdateDomain w4004UpdateDomain)
        throws GscmApplicationException, ApplicationException {

        // Filtering only items that are selected
        // 選択された明細のみにフィルタリング
        List<W4004ListDomain> filterListDomainList = new ArrayList<W4004ListDomain>();
        for (W4004ListDomain listDomain : w4004UpdateDomain.getW4004ListDomainList()) {
            if (CHECK_ON.equals(listDomain.getSelected())) {
                filterListDomainList.add(listDomain);
            }
        }
        w4004UpdateDomain.setW4004ListDomainList(filterListDomainList);

        // 明細行選択なしの場合
        if (filterListDomainList.size() < 1) {
            List<MessageDomain> errList = Arrays.asList(new MessageDomain(null, NXS_E7_0004, null));
            throw new ValidationException(errList);
        }

        return w4004UpdateDomain;
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
    protected void validateItems(W4004UpdateDomain w4004UpdateDomain)
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
    protected void validateConsistency(W4004UpdateDomain w4004UpdateDomain)
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
    protected void validateDatabase(W4004UpdateDomain w4004UpdateDomain)
        throws GscmApplicationException, ApplicationException, ValidationException {
    }

    /**
     * {@inheritDoc}.
     * Call the service to be removed from the work the configuration of palletize Staging Instruction creating
     * <br />作成中荷揃え指示の構成パレタイズをワークから削除するサービスを呼び出します。
     * <pre>
     * - The transfer context information to W4001StgInstrDomain stgInstrDomain than w4004UpdateDomain
     * - The transfer of key information to be deleted from the stgInstrDomain.pltzDomainList w4004UpdateDomain.listDomainList
     * - Delete the record of Staging Instruction Work
     *     Call the W4001StgInstrService.deleteOnRegisterDelete an argument stgInstrDomain
     *
     * - w4004UpdateDomainよりW4001StgInstrDomain stgInstrDomainにコンテキスト情報を移送
     * - w4004UpdateDomain.listDomainListよりstgInstrDomain.pltzDomainListに削除対象のキー情報を移送
     * - 荷揃え指示ワークのレコードを削除
     *    stgInstrDomainを引数にW4001StgInstrService.deleteOnRegisterDeleteの呼び出し
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected Integer callServices(W4004UpdateDomain w4004UpdateDomain)
        throws GscmApplicationException, ApplicationException {

        // PL domain -> BL domain transfer
        // PLドメイン→BLドメイン移送
        W4001StgInstrDomain stgInstrDomain = new W4001StgInstrDomain();
        CommonUtil.copyPropertiesDomainToDomain(stgInstrDomain,
            w4004UpdateDomain, w4004UpdateDomain.getScreenDateFormat());

        List<W4001PltzDomain> w4001PltzDomainList = new ArrayList<W4001PltzDomain>();
        for (W4004ListDomain w4004ListDomain : w4004UpdateDomain.getW4004ListDomainList()) {
            // PL domain -> BL domain transfer
            // PLドメイン→BLドメイン移送
            W4001PltzDomain pltzDomain = new W4001PltzDomain();
            CommonUtil.copyPropertiesDomainToDomain(pltzDomain,
                w4004ListDomain, w4004UpdateDomain.getScreenDateFormat());
            w4001PltzDomainList.add(pltzDomain);
        }
        stgInstrDomain.setPltzDomainList(w4001PltzDomainList);

        // Call delete service
        // 削除サービス呼び出し
        int deleteCount = w4001StgInstrService.deleteOnRegisterDelete(stgInstrDomain);

        return deleteCount;
    }
}
