/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.ws;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_N;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_6005;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_6007;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_6008;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_6013;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ITEM_DOSE_NOT_EXISTS;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SEQ_TYP_TR_NO;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TR_ITEM_TYP_PARTS;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TR_STATUS_ISSUED_TR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_ID_WS3504;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_SUCCESS;

import java.math.BigDecimal;
import java.sql.Date;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.TmCigmaWhXrefDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmNxsWhDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtTransferDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtTransferItemItemNoDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaWhXrefCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpItemNoSpInfoCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsWhCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.ResultDomain;
import com.globaldenso.eca0027.core.business.domain.Ws3003ParamDomain;
import com.globaldenso.eca0027.core.business.domain.Ws3003ParamItemDomain;
import com.globaldenso.eca0027.core.business.domain.Ws3504ItemNoDomain;
import com.globaldenso.eca0027.core.business.domain.Ws3504SearchResultDomain;
import com.globaldenso.eca0027.core.business.domain.Ws3504TransactFacadeServiceResultDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws3504CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws3504ItemListDomain;
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
 * An implementation class of FacadeService of WS3504.<BR>
 * WS3504のFacadeサービスの実装クラスです。
 * </p>
 * 
 * @version $Revision: 34 $
 */
public class Ws3504TransactFacadeServiceImpl extends
    AbstractTransactFacadeService<ResultDomain, Ws3504CriteriaDomain> {
    
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
    public Ws3504TransactFacadeServiceImpl() {
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
    protected Ws3504CriteriaDomain filterDomain(Ws3504CriteriaDomain inputDomain)
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
    protected void validateConsistency(Ws3504CriteriaDomain inputDomain)
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
    protected void validateDatabase(Ws3504CriteriaDomain inputDomain)
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
    protected void validateItems(Ws3504CriteriaDomain inputDomain)
        throws GscmApplicationException, ValidationException,
        ApplicationException {

        List<MessageDomain> errorList = new ArrayList<MessageDomain>();
        Validator<Ws3504CriteriaDomain> valid = new Validator<Ws3504CriteriaDomain>(
            inputDomain);
        String[] properties = {"dscId", "shipperCd", "carryOutCompCd",
            "carryOutWhCd", "carryInCompCd", "carryInWhCd", "screenId"};
        // Single item check
        valid.isValidateProperties(properties);
        valid.isValidateProperties(properties, WS_ID_WS3504);
        errorList.addAll(valid.getErrList());

        String[] itemListProperties = {"itemNo", "pkgCd", "carryOutQty", "carryOutCaseQty"};
        for (int i = 0; i < inputDomain.getItemNoList().size(); i++ ) {
            // Obtain ws3504ItemListDomain(1 record)
            Ws3504ItemListDomain ws3504ItemListDomain = inputDomain.getItemNoList().get(i);
            // Single item check for 1 record
            Validator<Ws3504ItemListDomain> validList = new Validator<Ws3504ItemListDomain>(
                ws3504ItemListDomain);
            validList.isValidateProperties(itemListProperties);
            validList.isValidateProperties(itemListProperties, WS_ID_WS3504);
            errorList.addAll(validList.getErrList());
        }
        // if there is an error
        if (0 < valid.getErrList().size()) {
            throw new ValidationException(valid.getErrList());
        }
    }

    /**
     * 
     * callServices
     * 
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
    protected Ws3504TransactFacadeServiceResultDomain callServices(
        Ws3504CriteriaDomain inputDomain) throws GscmApplicationException,
        ApplicationException {
        
        Ws3504TransactFacadeServiceResultDomain resultDomain = new Ws3504TransactFacadeServiceResultDomain();
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
        List<Ws3504ItemListDomain> itemNoList = inputDomain.getItemNoList();
        int errorCnt = 0;
        List<Ws3504ItemNoDomain> errorItemNoList = new ArrayList<Ws3504ItemNoDomain>();
        
        Ws3504CriteriaDomain ws3504CriteriaDomain = new Ws3504CriteriaDomain();
        ws3504CriteriaDomain.setShipperCd(shipperCd);
        ws3504CriteriaDomain.setCarryOutCompCd(carryOutCompCd);
        ws3504CriteriaDomain.setCarryOutWhCd(carryOutWhCd);
        ws3504CriteriaDomain.setItemNoList(itemNoList);

        List<Ws3504SearchResultDomain> ws3504List = wsBhtTransferService
            .searchTransferListByItemNo(ws3504CriteriaDomain);

        // check whether To WH is need to check firm order qty or not
        TmNxsWhCriteriaDomain tmNxsWhCriteriaDomain = new TmNxsWhCriteriaDomain();
        //kimura shipper -> carry in wh
        //tmNxsWhCriteriaDomain.setCompCd(shipperCd);
        tmNxsWhCriteriaDomain.setCompCd(carryInCompCd);
        //end
        tmNxsWhCriteriaDomain.setWhCd(carryInWhCd);

        TmNxsWhDomain tmNxsWhDomain = wsBhtTransferService
            .getTmNxsWh(tmNxsWhCriteriaDomain);

        if (tmNxsWhDomain == null) {
            throw new GscmApplicationException(NXS_E1_6007);
        }

        TmCigmaWhXrefCriteriaDomain tmCigmaWhXrefCriteria = new TmCigmaWhXrefCriteriaDomain();
        List<TmCigmaWhXrefDomain> tmCigmaWhXref = new ArrayList<TmCigmaWhXrefDomain>();

        if (FLAG_Y.equals(tmNxsWhDomain.getOdrConfirmFlg())) {
            // search TM_CIGMA_WH_XREF to get LGCY_WH_CD
            tmCigmaWhXrefCriteria.setLgcyLibCompCd(shipperCd);
            tmCigmaWhXrefCriteria.setCompCd(carryInCompCd);
            tmCigmaWhXrefCriteria.setWhCd(carryInWhCd);
            tmCigmaWhXref = wsBhtTransferService
                .getTmCigmaWhXref(tmCigmaWhXrefCriteria);
        } else if (FLAG_N.equals(tmNxsWhDomain.getOdrConfirmFlg())) {
            // search TM_CIGMA_WH_XREF to get LGCY_WH_CD
            tmCigmaWhXrefCriteria.setLgcyLibCompCd(shipperCd);
            tmCigmaWhXrefCriteria.setCompCd(carryOutCompCd);
            tmCigmaWhXrefCriteria.setWhCd(carryOutWhCd);
            tmCigmaWhXref = wsBhtTransferService
                .getTmCigmaWhXref(tmCigmaWhXrefCriteria);
        }

        if (tmCigmaWhXref == null || tmCigmaWhXref.size() == 0) {
            throw new GscmApplicationException(NXS_E1_6008);
        }

        //TODO Chaiporn 2015.Jan.07 start: check if scanned Item No is in Shipper CD
        for(Ws3504ItemListDomain byItem : itemNoList){
            TmExpItemNoSpInfoCriteriaDomain criteriaItem = new TmExpItemNoSpInfoCriteriaDomain();
            criteriaItem.setItemNo(byItem.getItemNo());
            criteriaItem.setCompCd(shipperCd);
            if (wsBhtTransferService.searchItemSpecialInfo(criteriaItem).size() == 0){
                Ws3504ItemNoDomain ws3504ItemNoDomain = new Ws3504ItemNoDomain();
                ws3504ItemNoDomain.setErrCd(ITEM_DOSE_NOT_EXISTS);
                ws3504ItemNoDomain.setItemNo(byItem.getItemNo());
                ws3504ItemNoDomain.setPkgCd(byItem.getPkgCd());
                ws3504ItemNoDomain.setTransferableQty("0");
                ws3504ItemNoDomain.setActualQty(String.valueOf(byItem.getCarryOutQty()));
                errorItemNoList.add(ws3504ItemNoDomain);
                errorCnt++;
            }
        }
        if(errorCnt > 0){
            resultDomain.setResultCode(WS_RESULT_SUCCESS);
            resultDomain.setErrorItemNoList(errorItemNoList);
            resultDomain.setSuccessFlg(FLAG_N);
            resultDomain.setTrNo(null);
            return resultDomain;
        }
        //TODO Chaiporn 2015.Jan.07 End
        // set WS3003 parameter
        List<Ws3003ParamItemDomain> detailList = new ArrayList<Ws3003ParamItemDomain>();
        for (int i = 0; i < ws3504List.size(); i++ ) {
            Ws3003ParamItemDomain ws3003ParamItemDomain = new Ws3003ParamItemDomain();
            ws3003ParamItemDomain.setItemNo(ws3504List.get(i).getItemNo());
            // Chaiporn DIAT : no plant cd for parameter
            // ws3003ParamItemDomain.setPlantCd(w3004List.get(i).getPlantCd());
            detailList.add(ws3003ParamItemDomain);
        }
        Ws3003ParamDomain ws3003ParamDomain = new Ws3003ParamDomain();
        ws3003ParamDomain.setLgcyWhCd(tmCigmaWhXref.get(0).getLgcyWhCd());
        ws3003ParamDomain.setDetailList(detailList);

        // Call WS3003
        List<String[]> webServiceList = wsBhtTransferService.getInventoryInfo(
            shipperCd, ws3003ParamDomain);

        // Combine nexus data with cigma data
        // Set On Hand Qty
        ws3504List = wsBhtTransferService.combineConnectDataForWs3504(
            ws3504List, webServiceList);

        // Calculation ; loop by DB data (ws3504List)
        for (int i = 0; i < ws3504List.size(); i++ ) {
            Ws3504SearchResultDomain domain = ws3504List.get(i);
            if (domain.getOnHandQty() == null) {
                domain.setOnHandQty("0");
            }
            // Tranferable Qty set by OrderConfirmFlg on Comp MA
            if (FLAG_Y.equals(tmNxsWhDomain.getOdrConfirmFlg())) {
                domain.setTransQty(String.valueOf(domain.getSummaryOfQty()
                    .intValue()
                    - domain.getCarryOutQty().intValue()
                    - domain.getQty().intValue()
                    - Integer.parseInt(domain.getOnHandQty())));
            } else if (FLAG_N.equals(tmNxsWhDomain.getOdrConfirmFlg())) {
                domain.setTransQty(String.valueOf(Integer.parseInt(domain
                    .getOnHandQty())
                    - domain.getQty().intValue()));
            }
            
            // kimura add validation : If transferable qty is minus, return
            // error.
            if (Integer.parseInt(domain.getTransQty()) < 0) {
                throw new GscmApplicationException(NXS_E1_6013, new String[] {
                    domain.getItemNo(), domain.getTransQty()});
            }
            // end kimura add
            
            // judge if carryOutQty(inputDomain) exceeds TransQty
            for(int j = 0; j < itemNoList.size(); j++){
                // Compare DB data (ws3504List) and scanned Information (itemNoList)
                if(ws3504List.get(i).getItemNo().equals(itemNoList.get(j).getItemNo())
                    && ws3504List.get(i).getPkgCd().equals(itemNoList.get(j).getPkgCd())){
                    if (itemNoList.get(j).getCarryOutQty().intValue() > Integer
                        .parseInt(domain.getTransQty())) {
                        Ws3504ItemNoDomain ws3504ItemNoDomain = new Ws3504ItemNoDomain();
                        ws3504ItemNoDomain.setItemNo(domain.getItemNo());
                        ws3504ItemNoDomain.setPkgCd(domain.getPkgCd());
                        ws3504ItemNoDomain.setTransferableQty(domain.getTransQty());
                        ws3504ItemNoDomain.setActualQty(String.valueOf(itemNoList.get(j)
                            .getCarryOutQty().intValue()));
                        ws3504ItemNoDomain.setErrCd(NXS_E1_6005);
                        errorItemNoList.add(ws3504ItemNoDomain);

                        errorCnt++ ;
                    }
                }
            }
        }
        if(errorCnt > 0){
            resultDomain.setResultCode(WS_RESULT_SUCCESS);
            resultDomain.setErrorItemNoList(errorItemNoList);
            resultDomain.setSuccessFlg(FLAG_N);
            resultDomain.setTrNo(null);
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
            SEQ_TYP_TR_NO, 1, screenId).get(0);
        // Exam TR No
        String trNo = seqKey
            + new DecimalFormat("000").format(Integer.valueOf(seq));

        // Insert TR data
        // get user name
        TmUserCriteriaDomain tmUserCriteriaDomain = new TmUserCriteriaDomain();
        tmUserCriteriaDomain.setDscId(dscId);
        TmUserDomain tmUserDomain = wsBhtTransferService
            .searchUserInfo(tmUserCriteriaDomain);

        // Insert data into TT_TRANSFER
        TtTransferDomain ttTransferDomain = new TtTransferDomain();
        ttTransferDomain.setTrNo(trNo);
        ttTransferDomain.setCarryOutCompCd(carryOutCompCd);
        ttTransferDomain.setCarryOutWhCd(carryOutWhCd);
        ttTransferDomain.setCarryInCompCd(carryInCompCd);
        ttTransferDomain.setCarryInWhCd(carryInWhCd);
        ttTransferDomain.setShipperCd(shipperCd);
        ttTransferDomain.setTrStatus(TR_STATUS_ISSUED_TR);
        ttTransferDomain.setTrItemTyp(TR_ITEM_TYP_PARTS);
        ttTransferDomain.setTrIssuerId(dscId);
        ttTransferDomain.setTrIssuerNm(tmUserDomain.getUsrNmEn());
        ttTransferDomain.setTrIssueDt(nowDate);
        ttTransferDomain.setEditCnt(BigDecimal.ZERO);
        ttTransferDomain.setComCreateUserId(dscId);
        ttTransferDomain.setComCreateFuncId(screenId);
        ttTransferDomain.setComUpdateUserId(dscId);
        ttTransferDomain.setComUpdateFuncId(screenId);
        wsBhtTransferService.insertTtTransfer(ttTransferDomain);

        // Insert data into TT_TRANSFER_ITEM_ITEM_NO
        List<TtTransferItemItemNoDomain> ttTransferItemItemNoDomainList = new ArrayList<TtTransferItemItemNoDomain>();
        for (int l = 0; l < inputDomain.getItemNoList().size(); l++ ) {
            TtTransferItemItemNoDomain ttTransferItemItemNoDomain = new TtTransferItemItemNoDomain();
            ttTransferItemItemNoDomain.setTrNo(trNo);
            ttTransferItemItemNoDomain.setItemNo(inputDomain.getItemNoList().get(l)
                .getItemNo());
            ttTransferItemItemNoDomain.setPkgCd(inputDomain.getItemNoList().get(l)
                .getPkgCd());
            ttTransferItemItemNoDomain.setCarryOutQty(inputDomain.getItemNoList().get(
                l).getCarryOutQty());
            ttTransferItemItemNoDomain.setCarryOutCaseQty(inputDomain.getItemNoList()
                .get(l).getCarryOutCaseQty());
            ttTransferItemItemNoDomain.setComCreateUserId(dscId);
            ttTransferItemItemNoDomain.setComCreateFuncId(screenId);
            ttTransferItemItemNoDomain.setComUpdateUserId(dscId);
            ttTransferItemItemNoDomain.setComUpdateFuncId(screenId);
            // kimura add to set plant code
            for (int j = 0; j < ws3504List.size(); j++ ) {
                if ((inputDomain.getItemNoList().get(l).getItemNo()
                    .equals(ws3504List.get(j).getItemNo()))
                    && (inputDomain.getItemNoList().get(l).getPkgCd()
                        .equals(ws3504List.get(j).getPkgCd()))) {
                    ttTransferItemItemNoDomain.setPlntCd(ws3504List.get(j)
                        .getPlntCd());
                    ttTransferItemItemNoDomainList.add(ttTransferItemItemNoDomain);
                    break;
                }
            }
            //end kimura add to set plant code
            
        }
        wsBhtTransferService
            .insertTtTransferItemItemNo(ttTransferItemItemNoDomainList);
        resultDomain.setTrNo(trNo);
        resultDomain.setResultCode(WS_RESULT_SUCCESS);

        return resultDomain;
    }
    
    /**
     * <p>
     * return month format
     * </p>
     * 
     * @param month month
     * @return String
     */
    private String getMonth(String month) {
        String returnMonth = "";
        switch (Integer.valueOf(month)) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                returnMonth = month;
                break;
            case 10:
                returnMonth = "X";
                break;
            case 11:
                returnMonth = "Y";
                break;
            case 12:
                returnMonth = "Z";
                break;
            default:
                break;
        }
        return returnMonth;
    }
}
