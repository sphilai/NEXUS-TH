/*
 * Project : NEXUS_EXPORT
 *
 * Date of update          : 2014/01/31
 * Development company name: DENSO IT SOLUTIONS, INC.
 * Details of update       : New
 * (c) Copyright 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.ws;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.*;

import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.VmGetQrCheckDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws0503CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.Ws0503QrCheckDetailListItemDomain;
import com.globaldenso.eca0027.core.business.domain.Ws0503QrCheckListItemDomin;
import com.globaldenso.eca0027.core.business.domain.Ws0503ResultDomain;
import com.globaldenso.eca0027.core.business.ws.WsBhtPortalService;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.Validator;

/**
 * <p>
 * An implementation class of FacadeService of WS0503.<BR>
 * WS0503のFacadeサービスの実装クラスです。
 * </p>
 *
 * @version $Revision: 9334 $
 */
public class Ws0503SearchFacadeServiceImpl extends
        AbstractSearchFacadeService<Ws0503ResultDomain, Ws0503CriteriaDomain> {

    /** 入力チェックの対象プロパティ (システム共通) */
    private WsBhtPortalService wsBhtPortalService;

    /**
     * <p>
     * Default constructor<BR>
     * デフォルトコンストラクタ。
     * </p>
     */
    public Ws0503SearchFacadeServiceImpl() {
    }

    /**
     * <p>
     * Setter method for wsBhtPortalService.
     * </p>
     *
     * @param wsBhtPortalService
     *            Set for wsBhtPortalService
     */
    public void setWsBhtPortalService(WsBhtPortalService wsBhtPortalService) {
        this.wsBhtPortalService = wsBhtPortalService;
    }

    
    /**
     * <p>
     * To investigate the contents of the Domain of the argument, to identify the Domain necessary
     * for the process.<BR>
     * 引数のDomainの内容を調査し、処理に必要なDomainを特定する。
     * </p>
     *
     * @param inputDomain
     *            Input domain   入力情報ドメイン
     * @return Processing result   処理結果
     * @throws GscmApplicationException
     *             Business error   業務エラー
     * @throws ApplicationException
     *             Application error   アプリケーションエラー
     */
    @Override
    protected Ws0503CriteriaDomain filterDomain(Ws0503CriteriaDomain inputDomain)
        throws GscmApplicationException, ApplicationException {
        return inputDomain;
    }

    /**
     * <p>
     * Consistency check.<BR>
     * 整合性チェックを行う。
     * </p>
     *
     * @param inputDomain
     *            Input domain   入力情報ドメイン
     * @throws GscmApplicationException
     *             Business error   業務エラー
     * @throws ValidationException
     *             Validation　error   検証エラー
     * @throws ApplicationException
     *             Application error   アプリケーションエラー
     */
    @Override
    protected void validateConsistency(Ws0503CriteriaDomain inputDomain)
        throws GscmApplicationException, ValidationException,
            ApplicationException {
    }

    /**
     * <p>
     * Database check.<BR>
     * データベースチェックを行う。
     * </p>
     *
     * @param inputDomain
     *            Input domain   入力情報ドメイン
     * @throws GscmApplicationException
     *             Business error   業務エラー
     * @throws ValidationException
     *             Validation　error   検証エラー
     * @throws ApplicationException
     *             Application error   アプリケーションエラー
     */
    @Override
    protected void validateDatabase(Ws0503CriteriaDomain inputDomain)
        throws GscmApplicationException, ValidationException,
            ApplicationException {
    }

    /**
     * <p>
     * Single item check.<BR>
     * 単項目チェックを行う。
     * </p>
     *
     * @param inputDomain
     *            Input domain   入力情報ドメイン
     * @throws GscmApplicationException
     *             Business error   業務エラー
     * @throws ValidationException
     *             Validation　error   検証エラー
     * @throws ApplicationException
     *             Application error   アプリケーションエラー
     */
    @Override
    protected void validateItems(Ws0503CriteriaDomain inputDomain)
        throws GscmApplicationException, ValidationException,
            ApplicationException {

        Validator<Ws0503CriteriaDomain> valid = new Validator<Ws0503CriteriaDomain>(
                inputDomain);

        // 単項目チェック
        String[] properties = { "dscId", };

        // 単項目チェック
        valid.isValidateProperties(properties);
        valid.isValidateProperties(properties, WS_ID_WS0503);

        // エラー確認
        if (0 < valid.getErrList().size()) {
            throw new ValidationException(valid.getErrList());
        }
    }

    /**
     * <p>
     * QR code check information acquisition.<BR>
     * QRコードチェック情報取得。
     * </p>
     * <p>
     * <pre>
     * - QR code check information acquisition.<BR>
     * - QRコードチェック情報を取得する。<BR>
     * </pre>
     * </p>
     * @param inputDomain
     *            Input domain   入力情報ドメイン
     * @return Processing result   処理結果
     * @throws GscmApplicationException
     *             Business error   業務エラー
     * @throws ApplicationException
     *             Application error   アプリケーションエラー
     */
    @Override
    protected Ws0503ResultDomain callServices(Ws0503CriteriaDomain inputDomain)
        throws GscmApplicationException, ApplicationException {

        // サービス呼び出し
        List<VmGetQrCheckDomain> vmGetqrCheckList = wsBhtPortalService
                .searchQrChkInfo();

        // 戻り値
        return this.convertToResultDomain(vmGetqrCheckList);
    }

    /**
     * <p>
     * QR Code Check Information convert To ResultDomain.<BR>
     * QRコードチェック情報をResultDomainへ設定。
     * </p>
     * @param vmGetQrCheckList
     *            QR Code Check Information domain   QRコードチェック情報ドメイン
     * @return result   ResultDomain   処理結果ドメイン
     */
    private Ws0503ResultDomain convertToResultDomain(
            List<VmGetQrCheckDomain> vmGetQrCheckList) {

        Ws0503ResultDomain resultDomain = new Ws0503ResultDomain();

        List<Ws0503QrCheckListItemDomin> qrCheckList
            = new ArrayList<Ws0503QrCheckListItemDomin>();

        for (VmGetQrCheckDomain vmGetQrCheckDomain : vmGetQrCheckList) {
            Ws0503QrCheckListItemDomin preItem = new Ws0503QrCheckListItemDomin();
            // 前回アイテム
            if (qrCheckList.size() > 0) {
                preItem = (Ws0503QrCheckListItemDomin) qrCheckList
                        .get(qrCheckList.size() - 1);
            }

            // 初回、または前回とFunctionId、QrTypeCd、QrLengthのいずれかが違う場合
            if (qrCheckList.size() == 0
                    || (!vmGetQrCheckDomain.getFuncId().equals(
                            preItem.getFunctionId())
                            || !vmGetQrCheckDomain.getQrTypCd().equals(
                                    preItem.getQrTypCd()) || !String.valueOf(
                                        vmGetQrCheckDomain.getQrLength()).equals(
                                            preItem.getQrLength()))) {
                Ws0503QrCheckListItemDomin itemDomain = new Ws0503QrCheckListItemDomin();
                itemDomain.setFunctionId(vmGetQrCheckDomain.getFuncId());
                itemDomain.setQrTypCd(vmGetQrCheckDomain.getQrTypCd());
                itemDomain.setQrLength(String.valueOf(vmGetQrCheckDomain
                        .getQrLength()));

                List<Ws0503QrCheckDetailListItemDomain> qrCheckDetailList
                    = new ArrayList<Ws0503QrCheckDetailListItemDomain>();
                Ws0503QrCheckDetailListItemDomain detailItem
                    = new Ws0503QrCheckDetailListItemDomain(
                        String.valueOf(vmGetQrCheckDomain.getStrtPos()), String
                                .valueOf(vmGetQrCheckDomain.getQrItemLength()),
                        vmGetQrCheckDomain.getQrItemTyp(), vmGetQrCheckDomain
                                .getQrItemId(), vmGetQrCheckDomain.getReqFlg(),
                        vmGetQrCheckDomain.getChkValue(), vmGetQrCheckDomain
                                .getAttrTyp(), vmGetQrCheckDomain.getGrpId());
                qrCheckDetailList.add(detailItem);
                itemDomain.setQrCheckList(qrCheckDetailList);
                qrCheckList.add(itemDomain);
            } else {
                Ws0503QrCheckDetailListItemDomain detailItem
                    = new Ws0503QrCheckDetailListItemDomain(
                        String.valueOf(vmGetQrCheckDomain.getStrtPos()), String
                                .valueOf(vmGetQrCheckDomain.getQrItemLength()),
                        vmGetQrCheckDomain.getQrItemTyp(), vmGetQrCheckDomain
                                .getQrItemId(), vmGetQrCheckDomain.getReqFlg(),
                        vmGetQrCheckDomain.getChkValue(), vmGetQrCheckDomain
                                .getAttrTyp(), vmGetQrCheckDomain.getGrpId());

                preItem.getQrCheckList().add(detailItem);
            }
        }

        resultDomain.setQrCheckList(qrCheckList);
        resultDomain.setResultCode(WS_RESULT_SUCCESS);

        return resultDomain;
    }
}