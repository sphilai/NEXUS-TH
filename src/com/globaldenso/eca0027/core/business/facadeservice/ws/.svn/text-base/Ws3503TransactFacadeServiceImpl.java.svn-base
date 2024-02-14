/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.ws;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_N;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.LAST_TR_STATUS_BLANK;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0062_BHT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_6002;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_6003;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_6009;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PLTZ_STATUS_PLTZ;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W3006;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SEQ_TYP_TR_NO;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TR_ITEM_TYP_CML;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TR_STATUS_ISSUED_TR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TR_STATUS_RECEIVED_TR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_ID_WS3503;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_SUCCESS;

import java.math.BigDecimal;
import java.sql.Date;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtTransferDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtTransferItemPltzDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.ResultDomain;
import com.globaldenso.eca0027.core.business.domain.Ws3503CmlDomain;
import com.globaldenso.eca0027.core.business.domain.Ws3503TransactFacadeServiceResultDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws3503CmlListDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws3503CriteriaDomain;
import com.globaldenso.eca0027.core.business.ws.WsBhtTransferService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.domain.TmUserDomain;
import com.globaldenso.gscm.framework.business.domain.criteria.TmUserCriteriaDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractTransactFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.Validator;

/**
 * <p>
 * An implementation class of FacadeService of WS3503.<BR>
 * WS3503のFacadeサービスの実装クラスです。
 * </p>
 * 
 * @version $Revision: 34 $
 */
public class Ws3503TransactFacadeServiceImpl extends
    AbstractTransactFacadeService<ResultDomain, Ws3503CriteriaDomain> {
    
    /**
     * <p>
     * WsBhtTransferService
     * </p>
     */
    private WsBhtTransferService wsBhtTransferService;

    /**
     * <p>
     * Default constructor
     * </p>
     */
    public Ws3503TransactFacadeServiceImpl() {
    }

    /**
     * <p>
     * Setter method for wsBhtTransferService.
     * </p>
     * 
     * @param wsBhtTransferService Set for wsBhtTransferService
     */
    public void setWsBhtTransferService(
        WsBhtTransferService wsBhtTransferService) {
        this.wsBhtTransferService = wsBhtTransferService;
    }

    /**
     * <p>
     * To investigate the contents of the Domain of the argument, to identify
     * the Domain necessary for the process.<BR>
     * 引数のDomainの内容を調査し、処理に必要なDomainを特定する。
     * </p>
     * 
     * @param inputDomain Input domain 入力情報ドメイン
     * @return Processing result 処理結果
     * @throws GscmApplicationException Business error 業務エラー
     * @throws ApplicationException Application error アプリケーションエラー
     */
    @Override
    protected Ws3503CriteriaDomain filterDomain(Ws3503CriteriaDomain inputDomain)
        throws GscmApplicationException, ApplicationException {
        return inputDomain;
    }

    /**
     * <p>
     * Consistency check.<BR>
     * 整合性チェックを行う。
     * </p>
     * 
     * @param inputDomain Input domain 入力情報ドメイン
     * @throws GscmApplicationException Business error 業務エラー
     * @throws ValidationException Validation error 検証エラー
     * @throws ApplicationException Application error アプリケーションエラー
     */
    @Override
    protected void validateConsistency(Ws3503CriteriaDomain inputDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {
    }

    /**
     * <p>
     * Database check.<BR>
     * データベースチェックを行う。
     * </p>
     * 
     * @param inputDomain Input domain 入力情報ドメイン
     * @throws GscmApplicationException Business error 業務エラー
     * @throws ValidationException Validation error 検証エラー
     * @throws ApplicationException Application error アプリケーションエラー
     */
    @Override
    protected void validateDatabase(Ws3503CriteriaDomain inputDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {
        // no process
    }

    /**
     * <p>
     * Single item check.<BR>
     * 単項目チェックを行う。
     * </p>
     * 
     * @param inputDomain Input domain 入力情報ドメイン
     * @throws GscmApplicationException Business error 業務エラー
     * @throws ValidationException Validation error 検証エラー
     * @throws ApplicationException Application error アプリケーションエラー
     */
    @Override
    protected void validateItems(Ws3503CriteriaDomain inputDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {
        
        List<MessageDomain> errorList = new ArrayList<MessageDomain>();
        Validator<Ws3503CriteriaDomain> valid = new Validator<Ws3503CriteriaDomain>(
            inputDomain);

        String[] properties = {"dscId", "shipperCd", "carryOutCompCd", "carryOutWhCd", "carryInCompCd", "carryInWhCd", "screenId"};
        // single item check
        valid.isValidateProperties(properties);
        valid.isValidateProperties(properties, WS_ID_WS3503);
        errorList.addAll(valid.getErrList());
        
        String[] propertiesForCml = {"mainMark"};
        for (int i = 0; i < inputDomain.getCml().size(); i++ ) {
            // Obtain ws3503CmlDomain(1 record)
            Ws3503CmlListDomain ws3503CmlDomain = inputDomain.getCml().get(i);
            // Single item check for 1 record
            Validator<Ws3503CmlListDomain> validForCml = new Validator<Ws3503CmlListDomain>(
                ws3503CmlDomain);
            validForCml.isValidateProperties(propertiesForCml);
            validForCml.isValidateProperties(propertiesForCml, WS_ID_WS3503);
            errorList.addAll(validForCml.getErrList());
        }
        // if there is an error
        if (0 < errorList.size()) {
            throw new ValidationException(errorList);
        }
    }

    /**
     * <p>
     * Update DB
     *      Update TT_WH_TRNASFER
     *      get sequence no. 
     *      Exam TR No
     * Insert TR data
     *      Insert data into TT_TRANSFER, TT_TRANSFER_ITME_MM
     *      Update status in palletize
     * </p>
     * <p>
     * 
     * @param inputDomain Input domain 入力情報ドメイン
     * @return Processing result 処理結果
     * @throws GscmApplicationException Business error 業務エラー
     * @throws ApplicationException Application error アプリケーションエラー
     */
    @Override
    protected Ws3503TransactFacadeServiceResultDomain callServices(
        Ws3503CriteriaDomain inputDomain) throws GscmApplicationException,
        ApplicationException {
        
        Ws3503TransactFacadeServiceResultDomain resultDomain = new Ws3503TransactFacadeServiceResultDomain();
        //kimura add default value of success flag as Y
        resultDomain.setSuccessFlg(FLAG_Y);
        //end
        String dscId = inputDomain.getDscId();
        String shipperCd = inputDomain.getShipperCd();
        String carryOutCompCd = inputDomain.getCarryOutCompCd();
        String carryOutWhCd = inputDomain.getCarryOutWhCd();
        String carryInCompCd = inputDomain.getCarryInCompCd();
        String carryInWhCd = inputDomain.getCarryInWhCd();
        String screenId = inputDomain.getScreenId();
        List<Ws3503CmlListDomain> cml = inputDomain.getCml();
        
        int errorCnt = 0;
        List<Ws3503CmlDomain> errorCmlList = new ArrayList<Ws3503CmlDomain>();
        for (Iterator<Ws3503CmlListDomain> iterator = inputDomain.getCml().iterator(); iterator.hasNext();) {
            Ws3503CmlListDomain ws3503CmlDomain = (Ws3503CmlListDomain)iterator.next();
            TtPltzCriteriaDomain ttPltzCriteriaDomain = new TtPltzCriteriaDomain();
            ttPltzCriteriaDomain.setMainMark(ws3503CmlDomain.getMainMark());
            TtPltzDomain ttPltzDomain = wsBhtTransferService.searchCmlListFromTtPltz(ttPltzCriteriaDomain);
            
            Ws3503CmlDomain ws3503ErrorCml = new Ws3503CmlDomain();
            // record not found
            if (ttPltzDomain == null) {
                ws3503ErrorCml.setMainMark(ttPltzCriteriaDomain.getMainMark());
                ws3503ErrorCml.setErrCd(NXS_E1_6002);
                errorCnt++;
                // 2014/11/18 tanaka add
                errorCmlList.add(ws3503ErrorCml);
            } else if (!PLTZ_STATUS_PLTZ.equals(ttPltzDomain.getPltzStatus())) {
                // PLTZ_STATUS != '10'
                ws3503ErrorCml.setMainMark(ttPltzDomain.getMainMark());
                ws3503ErrorCml.setErrCd(NXS_E1_0062_BHT);
                errorCnt++;
                // 2014/11/18 tanaka add
                errorCmlList.add(ws3503ErrorCml);
            } else if (!LAST_TR_STATUS_BLANK.equals(ttPltzDomain.getLastTrStatus())
                && (!TR_STATUS_RECEIVED_TR.equals(ttPltzDomain.getLastTrStatus()))) {
                // LAST_PLTZ_STATUS != '10' or '40'
                ws3503ErrorCml.setMainMark(ttPltzDomain.getMainMark());
                //kimura update message '-' to '_'
                ws3503ErrorCml.setErrCd(NXS_E1_6009);
                errorCnt++;
                // 2014/11/18 tanaka add
                errorCmlList.add(ws3503ErrorCml);
            } else if (!(inputDomain.getShipperCd().equals(ttPltzDomain.getShipperCd())
                && inputDomain.getCarryOutCompCd().equals(ttPltzDomain.getCurWhCompCd()) 
                && inputDomain.getCarryOutWhCd().equals(ttPltzDomain.getCurWhCd()))) {
                // !(SHIPPER_CD = shipperCd and CUR_WH_COMP_CD = carryInCompCd
                // and CUR_WH_CD = carryInWhCd)
                ws3503ErrorCml.setMainMark(ttPltzDomain.getMainMark());
                ws3503ErrorCml.setErrCd(NXS_E1_6003);
                errorCnt++;
                // 2014/11/18 tanaka add
                errorCmlList.add(ws3503ErrorCml);
            } else {
                // 2014/11/18 tanaka add
                // do nothing
            }
            // 2014/11/18 tanaka delete
            // errorCmlList.add(ws3503ErrorCml);
        }
        // if there is an error
        if(errorCnt > 0){
            resultDomain.setResultCode(WS_RESULT_SUCCESS);
            resultDomain.setErrorCmlList(errorCmlList);
            resultDomain.setSuccessFlg(FLAG_N);
            return resultDomain;
        }

        // Refer Common specification definition No.13
        Date nowDate = new Date(System.currentTimeMillis());
        final String[] monthChars = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "X", "Y", "Z" };
        String monthChar = monthChars[Integer.valueOf(new SimpleDateFormat("MM").format(nowDate)) - 1];
        final String[] dateChars = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F", "G",
                                     "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V" };
        String dateChar = dateChars[Integer.valueOf(new SimpleDateFormat("dd").format(nowDate)) - 1];
        // NXS16001 MOD END
        String seqKey = shipperCd + carryOutWhCd + new SimpleDateFormat("yy").format(nowDate).substring(1)
                        + monthChar + dateChar;
        String seq = wsBhtTransferService.transactSequence(seqKey,
            SEQ_TYP_TR_NO, 1, WS_ID_WS3503).get(0);
        
        // Exam TR No
        String trNo = seqKey + new DecimalFormat("000").format(Integer.valueOf(seq));
        
        // Insert TR data
        // get user name
        TmUserCriteriaDomain tmUserCriteriaDomain = new TmUserCriteriaDomain();
        tmUserCriteriaDomain.setDscId(dscId);
        TmUserDomain tmUserDomain = wsBhtTransferService.searchUserInfo(tmUserCriteriaDomain);
        
        // Insert data into TT_TRANSFER
        TtTransferDomain ttTransferDomain = new TtTransferDomain();
        ttTransferDomain.setTrNo(trNo);
        ttTransferDomain.setCarryOutCompCd(carryOutCompCd);
        ttTransferDomain.setCarryOutWhCd(carryOutWhCd);
        ttTransferDomain.setCarryInCompCd(carryInCompCd);
        ttTransferDomain.setCarryInWhCd(carryInWhCd);
        ttTransferDomain.setShipperCd(shipperCd);
        ttTransferDomain.setTrStatus(TR_STATUS_ISSUED_TR);
        ttTransferDomain.setTrItemTyp(TR_ITEM_TYP_CML);
        ttTransferDomain.setTrIssuerId(dscId);
        ttTransferDomain.setTrIssuerNm(tmUserDomain.getUsrNmEn());
        ttTransferDomain.setTrIssueDt(nowDate);
        ttTransferDomain.setEditCnt(BigDecimal.ZERO);
        ttTransferDomain.setComCreateUserId(dscId);
        ttTransferDomain.setComCreateFuncId(screenId);
        ttTransferDomain.setComUpdateUserId(dscId);
        ttTransferDomain.setComUpdateFuncId(screenId);
        wsBhtTransferService.insertTtTransfer(ttTransferDomain);
        
        for (Iterator<Ws3503CmlListDomain> iterator = cml.iterator(); iterator.hasNext();) {
            Ws3503CmlListDomain ws3503CmlDomain = (Ws3503CmlListDomain)iterator.next();
            String mainMark = ws3503CmlDomain.getMainMark();
            // Insert data into TT_TRANSFER_ITEM_PLTZ
            TtTransferItemPltzDomain ttTransferItemPltzDomain = new TtTransferItemPltzDomain();
            ttTransferItemPltzDomain.setTrNo(trNo);
            ttTransferItemPltzDomain.setMainMark(mainMark);
            ttTransferItemPltzDomain.setComCreateUserId(dscId);
            ttTransferItemPltzDomain.setComCreateFuncId(screenId);
            ttTransferItemPltzDomain.setComUpdateUserId(dscId);
            ttTransferItemPltzDomain.setComUpdateFuncId(screenId);
            wsBhtTransferService.insertTtTransferItemPltz(ttTransferItemPltzDomain);
            
            // Update status in palletize
            TtPltzDomain ttPltzDomain = new TtPltzDomain();
            ttPltzDomain.setLastTrStatus(TR_STATUS_ISSUED_TR);
            ttPltzDomain.setComUpdateUserId(dscId);
            ttPltzDomain.setComUpdateFuncId(screenId);
            
            TtPltzCriteriaDomain ttPltzCriteriaDomain = new TtPltzCriteriaDomain();
            ttPltzCriteriaDomain.setMainMark(mainMark);
            
            wsBhtTransferService.updateTtPltz(ttPltzDomain, ttPltzCriteriaDomain);
        }
        
        // Create xml of return value
        resultDomain.setResultCode(WS_RESULT_SUCCESS);
        resultDomain.setTrNo(trNo);
        return resultDomain;
    }
    
}
