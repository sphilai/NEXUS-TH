/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CHECK_ON;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_N;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0035;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0004;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.STG_ACT_PLTZ_MAX_COUNT;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W4005PltzDomain;
import com.globaldenso.eca0027.core.business.domain.W4005StgActDomain;
import com.globaldenso.eca0027.core.business.domain.W4007ListDomain;
import com.globaldenso.eca0027.core.business.domain.W4007UpdateDomain;
import com.globaldenso.eca0027.core.business.service.W4005StgActService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractCreateFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 * The Update service facade implementation class of Staging Actuality Create screen
 * <br />山作り実績Create画面のUpdate facadeサービス実装クラスです。
 * <pre>
 * bean id:w4007UpdateFacadeService
 * </pre>
 *
 * @author $Author: masaki_awata@dnitsol.com $
 * @version $Revision: 4674 $
 */
public class W4007UpdateFacadeServiceImpl extends
    AbstractCreateFacadeService<Integer, W4007UpdateDomain> {

    /**
     * Common service.
     */
    protected CommonService commonService;

    /**
     * Staging actuality service.
     */
    protected W4005StgActService w4005StgActService;

    /**
     * constructor.
     */
    public W4007UpdateFacadeServiceImpl() {
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
     *     From w4007UpdateDomain.listDomainList, and re-set to w4007UpdateDomain.listDomainList to extract the items that have been checked new
     * - Line item selection check
     *     If 0, the size of w4007UpdateDomain.listDomainList after filtering line item not selected error
     *
     * - 選択されている明細のフィルタリング
     *     w4007UpdateDomain.listDomainListから、新しくチェックされた明細を抽出しw4007UpdateDomain.listDomainListに再設定
     * - 明細行選択チェック
     *     フィルタリング後のw4007UpdateDomain.listDomainListのサイズが0の場合、明細行未選択エラー
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W4007UpdateDomain filterDomain(W4007UpdateDomain w4007UpdateDomain)
        throws GscmApplicationException, ApplicationException {

        // Filtering only items that the newly selected
        // 新たに選択された明細のみにフィルタリング
        List<W4007ListDomain> filterListDomainList = new ArrayList<W4007ListDomain>();
        for (W4007ListDomain listDomain : w4007UpdateDomain.getW4007ListDomainList()) {
            if (CHECK_ON.equals(listDomain.getSelected()) && FLAG_N.equals(listDomain.getDisabledFlg())) {
                filterListDomainList.add(listDomain);
            }
        }
        w4007UpdateDomain.setW4007ListDomainList(filterListDomainList);

        // When there is no line item selection
        // 明細行選択なしの場合
        if (filterListDomainList.size() < 1) {
            List<MessageDomain> errList = Arrays.asList(new MessageDomain(null, NXS_E7_0004, null));
            throw new ValidationException(errList);
        }

        return w4007UpdateDomain;
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
    protected void validateItems(W4007UpdateDomain w4007UpdateDomain)
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
    protected void validateConsistency(W4007UpdateDomain w4007UpdateDomain)
        throws GscmApplicationException, ApplicationException, ValidationException {
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * - Palletize registration number upper limit check 
     *     - Check call the W4005StgActService.validateDatabaseTwStgActOnCreateUpdateByCount
     *       an argument to the size stgActDomain.loginUserDscId, of w4007UpdateDomain.w4007ListDomainList
     *
     * - パレタイズ登録件数上限チェック
     *    - stgActDomain.loginUserDscId、w4007UpdateDomain.w4007ListDomainListのサイズを引数に、
     *      W4005StgActService.validateDatabaseTwStgActOnCreateUpdateByCountを呼び出してチェック
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W4007UpdateDomain w4007UpdateDomain)
        throws GscmApplicationException, ApplicationException, ValidationException {

        List<MessageDomain> messageDomainList = new ArrayList<MessageDomain>();

        // If you exceed the maximum staging actuality palletizing number
        // 山作り実績最大パレタイズ件数を超過する場合
        if (
            !w4005StgActService.validateDatabaseTwStgActOnCreateUpdateByCount(
                w4007UpdateDomain.getLoginUserDscId(), w4007UpdateDomain.getW4007ListDomainList().size())
        )
        {
            messageDomainList.add(
                new MessageDomain(null, GSCM_E0_0035, new Object[] { STG_ACT_PLTZ_MAX_COUNT })
            );
        }

        // If there is an error
        // エラーがある場合
        if (0 < messageDomainList.size()) {
            throw new ValidationException(messageDomainList);
        }
    }

    /**
     * {@inheritDoc}.
     * Call the service to be registered in the Nisoroe instructions work the palletize you have selected
     * <br />選択したパレタイズを山作り実績ワークに登録するサービスを呼び出します。
     * <pre>
     * - Transfer the information to W4005StgActDomain stgActDomain than w4007UpdateDomain
     * - The registration Staging Actuality Work
     *     Call the W4005StgActService.updateOnCreateUpdate an argument stgActDomain
     *
     * - w4007UpdateDomainよりW4005StgActDomain stgActDomainに情報を移送
     * - 山作り実績ワークに登録
     *       stgActDomainを引数にW4005StgActService.createOnCreateUpdateの呼び出し
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected Integer callServices(W4007UpdateDomain w4007UpdateDomain)
        throws GscmApplicationException, ApplicationException {

        // PL domain -> BL domain transfer
        // PLドメイン→BLドメイン移送
        W4005StgActDomain stgActDomain = new W4005StgActDomain();
        CommonUtil.copyPropertiesDomainToDomain(stgActDomain,
            w4007UpdateDomain, w4007UpdateDomain.getScreenDateFormat());

        List<W4005PltzDomain> w4005PltzDomainList = new ArrayList<W4005PltzDomain>();
        for (W4007ListDomain w4007ListDomain : w4007UpdateDomain.getW4007ListDomainList()) {
            // PL domain -> BL domain transfer
            // PLドメイン→BLドメイン移送
            W4005PltzDomain pltzDomain = new W4005PltzDomain();
            CommonUtil.copyPropertiesDomainToDomain(pltzDomain,
                w4007ListDomain, w4007UpdateDomain.getScreenDateFormat());
            w4005PltzDomainList.add(pltzDomain);
        }
        stgActDomain.setPltzDomainList(w4005PltzDomainList);

        // Call registration service
        // 登録サービス呼び出し
        w4005StgActService.createOnCreateUpdate(stgActDomain);

        return stgActDomain.getPltzDomainList().size();
    }
}
