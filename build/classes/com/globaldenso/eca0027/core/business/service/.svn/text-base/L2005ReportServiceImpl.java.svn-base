/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0010;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.REPORT_ID_L2005;

import java.io.File;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.VmUserInfoDomain;
import com.globaldenso.eca0027.core.auto.business.domain.VtRpCmlMixtagErrRepDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VmUserInfoCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpCmlMixtagErrRepCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.VmUserInfoService;
import com.globaldenso.eca0027.core.auto.business.service.VtRpCmlMixtagErrRepService;
import com.globaldenso.eca0027.core.business.domain.L2005ReportDetailDomain;
import com.globaldenso.eca0027.core.business.domain.L2005ReportDomain;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.util.DateUtil;
import com.globaldenso.gscm.framework.util.StringUtil;

/**
 * The implementation class of form creation service of L2005 [CML-Mix Tag Error Report].<br />
 * L2005【 CML-Mix Tag Error Report 】の帳票作成サービスの実装クラスです。
 * 
 * @version $Revision: 7765 $
 */
public class L2005ReportServiceImpl extends AbstractReportServiceImpl implements L2005ReportService {

    /**
     * Error Reporting Service<br />
     * エラーレポートサービス
     */
    protected VtRpCmlMixtagErrRepService vtRpCmlMixtagErrRepService;
    
    /**
     * VM_USER_INFO Service<br />
     * VM_USER_INFOサービス
     */
    protected VmUserInfoService vmUserInfoService;

    /**
     * Default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public L2005ReportServiceImpl() {
    }

    /**
     * Setter method for vtRpCmlMixtagErrRepService.
     *
     * @param vtRpCmlMixtagErrRepService Set for vtRpCmlMixtagErrRepService
     */
    public void setVtRpCmlMixtagErrRepService(
        VtRpCmlMixtagErrRepService vtRpCmlMixtagErrRepService) {
        this.vtRpCmlMixtagErrRepService = vtRpCmlMixtagErrRepService;
    }

    /**
     * Setter method for vmUserInfoService. 
     *
     * @param vmUserInfoService Set for vmUserInfoService
     */
    public void setVmUserInfoService(VmUserInfoService vmUserInfoService) {
        this.vmUserInfoService = vmUserInfoService;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.L2005ReportService#searchCmlMixTagErrRep(String dscId, Timestamp errRpDate, String formatDate)
     */
    public File searchCmlMixTagErrRep(String dscId, Timestamp errRpDate, String formatDate) throws ApplicationException {

        
        L2005ReportDomain reportDomain = new L2005ReportDomain();
        
        // Get header and detail data of the report.
        // 帳票情報(ヘッダ、明細)の取得
        List<? extends VtRpCmlMixtagErrRepDomain> vtList = getReportInfo(dscId, errRpDate);
        if (vtList.size() == 0) {
            throw new GscmApplicationException(GSCM_E0_0010);
        }
        
        List<VmUserInfoDomain> userList = getTimezoneId(dscId);
        VmUserInfoDomain userDomain = userList.get(0);
        Date sysdate = DateUtil.convertTime(new Date(), userDomain.getTimezoneId());
        reportDomain.setPrintedDate(DateUtil.formatDate(sysdate, formatDate));
        
        // Set header data.
        // 帳票ヘッダ設定
        VtRpCmlMixtagErrRepDomain headDomain = vtList.get(0);
        
        String issuer = headDomain.getExpPackingIssuerNm();
        if (20 < issuer.length()) {
            issuer = issuer.substring(0, 20); 
        }
        reportDomain.setIssuer(issuer);
        reportDomain.setPalletBoxNo(headDomain.getPalletNo()); 
        reportDomain.setShipper(headDomain.getShipperCd());
        reportDomain.setPalletizeInstrNo(headDomain.getPltzInstrNo());
        reportDomain.setCustomerNoShipto(StringUtil.getEmptyToBlank(headDomain.getCustomerCd()) 
            + "/" + StringUtil.getEmptyToBlank(headDomain.getLgcyShipTo()));
        reportDomain.setTrans(headDomain.getTrnsCd());
        reportDomain.setPlantCd(headDomain.getPlntCd());
        reportDomain.setWh(headDomain.getLgcyWhCd());
        reportDomain.setWhCompanyCd(headDomain.getWhCompCd());
        reportDomain.setWhCd(headDomain.getWhCd());
        reportDomain.setA(headDomain.getChkResultA());
        reportDomain.setB(headDomain.getChkResultB());
        reportDomain.setC(headDomain.getChkResultC());
        reportDomain.setD(headDomain.getChkResultD());
        reportDomain.setE(headDomain.getChkResultE());
        reportDomain.setF(headDomain.getChkResultF());
        reportDomain.setG(headDomain.getChkResultG());
        reportDomain.setH(headDomain.getChkResultH());
        reportDomain.setI(headDomain.getChkResultI());
        reportDomain.setJ(headDomain.getChkResultJ());
        reportDomain.setK(headDomain.getChkResultK());
        reportDomain.setL(headDomain.getChkResultL());
        reportDomain.setM(headDomain.getChkResultM());
        reportDomain.setN(headDomain.getChkResultN());
        reportDomain.setO(headDomain.getChkResultO());
        reportDomain.setP(headDomain.getChkResultP());
        reportDomain.setQ(headDomain.getChkResultQ());
        reportDomain.setR(headDomain.getChkResultR());
        reportDomain.setS(headDomain.getChkResultS());
        
        // Set detail data.
        // 帳票明細設定
        List<L2005ReportDetailDomain> detailList = new ArrayList<L2005ReportDetailDomain>();
        for (VtRpCmlMixtagErrRepDomain listDomain : vtList) {
            L2005ReportDetailDomain detailDomain = new L2005ReportDetailDomain();
            detailDomain.setPartNo(listDomain.getItemNo());
            detailDomain.setPkg(listDomain.getPkgCd());
            detailDomain.setMxf(listDomain.getPkgFormTyp());
            detailDomain.setIsk(listDomain.getInvoiceKey());
            detailDomain.setCsk(listDomain.getContainerSortingKey());
            detailDomain.setCur(listDomain.getCurrCd());
            detailDomain.setLd(listDomain.getLoadingCd());
            detailDomain.setSif(listDomain.getStgInstrItemFlg());
            detailDomain.setCl(listDomain.getContainerLooseTyp());
            detailDomain.setCc(listDomain.getCustomTimingTyp());
            if (listDomain.getShippingLot() != null) {
                detailDomain.setShipLot(listDomain.getShippingLot().toString());
            }
            if (listDomain.getQty() != null) {
                detailDomain.setScanQty(listDomain.getQty().toString());
            }
            if (listDomain.getScanQty() != null) {
                detailDomain.setNoOfScan(listDomain.getScanQty().toString());
            }
            if (listDomain.getStkQty() != null) {
                detailDomain.setOnHand(listDomain.getStkQty().toString());
            }
            if (listDomain.getOdrQty() != null) {
                detailDomain.setFirmOrd(listDomain.getOdrQty().toString());
            }
            if (listDomain.getLeftInstrQty() != null) {
                detailDomain.setInstrQty(listDomain.getLeftInstrQty().toString());
            }
            if (listDomain.getOverInstrQty() != null) {
                detailDomain.setOverQty(listDomain.getOverInstrQty().toString());
            }
            detailDomain.setMnf(listDomain.getItemNoChkFlg());
            detailDomain.setDifferentCml(listDomain.getMixPltzCompltFlg());
            detailDomain.setMtd(listDomain.getMixWhChkFlg());
            detailDomain.setMta(listDomain.getMltInBoxAllowFlg());
            detailList.add(detailDomain);
        }
        reportDomain.setDetailList(detailList);
        
        // Create report file.
        // 帳票の生成
        return getReportFile(reportDomain);
    }

    /**
     * Acquisition of TIMEZONE_ID of user information<br />
     * ユーザ情報のTIMEZONE_IDの取得
     *
     * @param dscId DSCID of output target<br />
     * 出力対象のDSCID
     * @return TIMEZONE_ID userList of user information<br />
     * userList ユーザ情報のTIMEZONE_ID
     * @throws ApplicationException If it is not possible to take the TIMEZONE_ID of user information then ApplicationException<br />
     * ユーザ情報のTIMEZONE_IDが取得できなかった場合
     */
    protected List<VmUserInfoDomain> getTimezoneId(String dscId)
        throws ApplicationException {
        VmUserInfoCriteriaDomain userCriteria = new VmUserInfoCriteriaDomain();
        userCriteria.setDscId(dscId);
        List<VmUserInfoDomain> userList = vmUserInfoService.searchByCondition(userCriteria);
        return userList;
    }

    /**
     * Get the document information.<br />
     * 帳票情報を取得します。
     *
     * @param dscId DSCID of output target<br />
     * 出力対象のDSCID
     * @param errRpDate ERROR CREATE TIMESTAMP<br />
     *  エラーレポート作成日時
     * @return List form information list<br />
     * List<? extends VtRpCmlMixtagErrRepDomain> 帳票情報リスト
     * @throws ApplicationException If the document information can not be acquired then ApplicationException<br />
     * 帳票情報が取得できなかった場合
     */
    protected List<? extends VtRpCmlMixtagErrRepDomain> getReportInfo(String dscId, Timestamp errRpDate)
        throws ApplicationException {
        
        VtRpCmlMixtagErrRepCriteriaDomain criteria = new VtRpCmlMixtagErrRepCriteriaDomain();
        criteria.setDscId(dscId);
        criteria.setErrCreateTimestamp(errRpDate);
        criteria.setPreferredOrder("ODR_QTY desc, MIX_TAG_FLG desc, ITEM_NO, PKG_CD");
        List<VtRpCmlMixtagErrRepDomain> vtList = vtRpCmlMixtagErrRepService.searchByCondition(criteria);
        
        return vtList;
    }

    /**
     * Generate a form object.<br />
     * 帳票オブジェクトを生成します。
     *
     * @param reportDomain Form domain<br />
     * 帳票ドメイン
     * @return Document object<br />
     * 帳票オブジェクト
     */
    protected File getReportFile(L2005ReportDomain reportDomain) {
        return createReport(REPORT_ID_L2005, reportDomain);
    }
}
