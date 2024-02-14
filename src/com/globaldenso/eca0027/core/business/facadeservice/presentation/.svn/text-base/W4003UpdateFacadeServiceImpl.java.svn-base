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
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0015;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0016;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.STG_INSTR_PLTZ_MAX_COUNT;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W4001PltzDomain;
import com.globaldenso.eca0027.core.business.domain.W4001StgInstrDomain;
import com.globaldenso.eca0027.core.business.domain.W4003ListDomain;
import com.globaldenso.eca0027.core.business.domain.W4003UpdateDomain;
import com.globaldenso.eca0027.core.business.service.W4001StgInstrService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractCreateFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 * The Update service facade implementation class of Staging Instruction Create screen
 * <br />荷揃え指示Create画面のUpdate facadeサービス実装クラスです。
 * <pre>
 * bean id:w4003UpdateFacadeService
 * </pre>
 *
 * @author $Author: masaki_awata@dnitsol.com $
 * @version $Revision: 4674 $
 */
public class W4003UpdateFacadeServiceImpl extends
    AbstractCreateFacadeService<Integer, W4003UpdateDomain> {

    /**
     * Common service.
     */
    protected CommonService commonService;

    /**
     * Staging instruction service.
     */
    protected W4001StgInstrService w4001StgInstrService;

    /**
     * constructor.
     */
    public W4003UpdateFacadeServiceImpl() {
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
     *     From w4003UpdateDomain.listDomainList, and re-set to w4003UpdateDomain.listDomainList to extract the items that have been checked new
     * - Line item selection check
     *     If 0, the size of w4003UpdateDomain.listDomainList after filtering line item not selected error
     *
     * - 選択されている明細のフィルタリング
     *     w4003UpdateDomain.listDomainListから、新しくチェックされた明細を抽出しw4003UpdateDomain.listDomainListに再設定
     * - 明細行選択チェック
     *     フィルタリング後のw4003UpdateDomain.listDomainListのサイズが0の場合、明細行未選択エラー
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W4003UpdateDomain filterDomain(W4003UpdateDomain w4003UpdateDomain)
        throws GscmApplicationException, ApplicationException {

        // Filtering only items that the newly selected
        // 新たに選択された明細のみにフィルタリング
        List<W4003ListDomain> filterListDomainList = new ArrayList<W4003ListDomain>();
        for (W4003ListDomain listDomain : w4003UpdateDomain.getW4003ListDomainList()) {
            if (CHECK_ON.equals(listDomain.getSelected()) && FLAG_N.equals(listDomain.getDisabledFlg())) {
                filterListDomainList.add(listDomain);
            }
        }
        w4003UpdateDomain.setW4003ListDomainList(filterListDomainList);

        // When there is no line item selection
        // 明細行選択なしの場合
        if (filterListDomainList.size() < 1) {
            List<MessageDomain> errList = Arrays.asList(new MessageDomain(null, NXS_E7_0004, null));
            throw new ValidationException(errList);
        }

        return w4003UpdateDomain;
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
    protected void validateItems(W4003UpdateDomain w4003UpdateDomain)
        throws GscmApplicationException, ApplicationException, ValidationException {
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * - Check No selection Ship To mix
     *     - Ship to the w4003UpdateDomain.w4003ListDomainList Check if all the same
     *
     * - 選択Ship To混在なしチェック
     *    - w4003UpdateDomain.w4003ListDomainListのShip toが全て同一かチェック
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W4003UpdateDomain w4003UpdateDomain)
        throws GscmApplicationException, ApplicationException, ValidationException {

        List<MessageDomain> messageDomainList = new ArrayList<MessageDomain>();

        // If this is not the Ship to all of the same
        // 全て同一のShip toでない場合
        String firstShipToCd = w4003UpdateDomain.getW4003ListDomainList().get(0).getShipToCd();
        for (W4003ListDomain listDomain : w4003UpdateDomain.getW4003ListDomainList()) {
            if (!firstShipToCd.equals(listDomain.getShipToCd())) {
                Object[] params = {
                    commonService.getResource(w4003UpdateDomain.getLocale(), "label.nexusShipToCd")
                };
                messageDomainList.add(new MessageDomain(null, NXS_E7_0015, params));
                break;
            }
        }

        // If there is an error
        // エラーがある場合
        if (0 < messageDomainList.size()) {
            throw new ValidationException(messageDomainList);
        }
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * - Palletize registration number upper limit check 
     *     - Check call the W4001StgInstrService.validateDatabaseTwStgInstrOnCreateUpdateByCount
     *       an argument to the size stgInstrDomain.loginUserDscId, of w4003UpdateDomain.w4003ListDomainList
     * - Work Ship To, select Ship To match check 
     *     - Check call the W4001StgInstrService.validateDatabaseTwStgInstrOnCreateUpdateByShipTo
     *       an argument stgInstrDomain.loginUserDscId、ship to
     *
     * - パレタイズ登録件数上限チェック
     *    - stgInstrDomain.loginUserDscId、w4003UpdateDomain.w4003ListDomainListのサイズを引数に、
     *      W4001StgInstrService.validateDatabaseTwStgInstrOnCreateUpdateByCountを呼び出してチェック
     * - ワークShip To、選択Ship To一致チェック
     *    - stgInstrDomain.loginUserDscId、ship toを引数に、
     *      W4001StgInstrService.validateDatabaseTwStgInstrOnCreateUpdateByShipToを呼び出してチェック
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W4003UpdateDomain w4003UpdateDomain)
        throws GscmApplicationException, ApplicationException, ValidationException {

        List<MessageDomain> messageDomainList = new ArrayList<MessageDomain>();

        // If you exceed the maximum staging instruction palletizing number
        // 荷揃え指示最大パレタイズ件数を超過する場合
        if (
            !w4001StgInstrService.validateDatabaseTwStgInstrOnCreateUpdateByCount(
                w4003UpdateDomain.getLoginUserDscId(), w4003UpdateDomain.getW4003ListDomainList().size())
        )
        {
            messageDomainList.add(
                new MessageDomain(null, GSCM_E0_0035, new Object[] { STG_INSTR_PLTZ_MAX_COUNT })
            );
        }

        // If it is different from the ship to the work
        // ワークのship toと異なる場合
        if (
            !w4001StgInstrService.validateDatabaseTwStgInstrOnCreateUpdateByShipTo(
                w4003UpdateDomain.getLoginUserDscId(), w4003UpdateDomain.getW4003ListDomainList().get(0).getShipToCd())
        )
        {
            Object[] params = {
                commonService.getResource(w4003UpdateDomain.getLocale(), "label.nexusShipToCd")
            };
            messageDomainList.add(new MessageDomain(null, NXS_E7_0016, params));
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
     * <br />選択したパレタイズを荷揃え指示ワークに登録するサービスを呼び出します。
     * <pre>
     * - Transfer the information to W4001StgInstrDomain stgInstrDomain than w4003UpdateDomain
     * - The registration Staging Instruction Work
     *     Call the W4001StgInstrService.updateOnCreateUpdate an argument stgInstrDomain
     *
     * - w4003UpdateDomainよりW4001StgInstrDomain stgInstrDomainに情報を移送
     * - 荷揃え指示ワークに登録
     *       stgInstrDomainを引数にW4001StgInstrService.createOnCreateUpdateの呼び出し
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected Integer callServices(W4003UpdateDomain w4003UpdateDomain)
        throws GscmApplicationException, ApplicationException {

        // PL domain -> BL domain transfer
        // PLドメイン→BLドメイン移送
        W4001StgInstrDomain stgInstrDomain = new W4001StgInstrDomain();
        CommonUtil.copyPropertiesDomainToDomain(stgInstrDomain,
            w4003UpdateDomain, w4003UpdateDomain.getScreenDateFormat());

        List<W4001PltzDomain> w4001PltzDomainList = new ArrayList<W4001PltzDomain>();
        for (W4003ListDomain w4003ListDomain : w4003UpdateDomain.getW4003ListDomainList()) {
            // PL domain -> BL domain transfer
            // PLドメイン→BLドメイン移送
            W4001PltzDomain pltzDomain = new W4001PltzDomain();
            CommonUtil.copyPropertiesDomainToDomain(pltzDomain,
                w4003ListDomain, w4003UpdateDomain.getScreenDateFormat());
            w4001PltzDomainList.add(pltzDomain);
        }
        stgInstrDomain.setPltzDomainList(w4001PltzDomainList);

        // Call registration service
        // 登録サービス呼び出し
        w4001StgInstrService.createOnCreateUpdate(stgInstrDomain);

        return stgInstrDomain.getPltzDomainList().size();
    }
}
