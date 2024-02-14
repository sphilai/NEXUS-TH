/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CHAR_SET_UTF8;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ERR_CORRECTION_LV_M;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FORMAT_WEIGHT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0010;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NO_DATA;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0157;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.QR_HEAD_PLTZINSTR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.QR_HEAD_PLTZINSTR_DCT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.REPORT_ID_L2001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MASK_CHAR;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.ai.library.qrcodegenerate.QrcodeGenerator;
import com.globaldenso.ai.library.qrcodegenerate.exception.QrcodeGenerateException;
import com.globaldenso.eca0027.core.auto.business.domain.VtRpPltzInstrDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpPltzInstrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.VtRpPltzInstrService;
import com.globaldenso.eca0027.core.business.dao.RpEisProductDao;
import com.globaldenso.eca0027.core.business.domain.L2001ReportDetailDomain;
import com.globaldenso.eca0027.core.business.domain.L2001ReportDomain;
import com.globaldenso.eca0027.core.business.domain.L2001TtPltzInstrItemNoBySumBoxQtyDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.L2001TtPltzInstrItemNoBySumBoxQtyCriteriaDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.DateUtil;
import com.globaldenso.gscm.framework.util.NumberUtil;
import com.globaldenso.gscm.framework.util.StringUtil;

/**
 * The implementation class of form creation service of L2001 [Palletize Instruction].<br />
 * L2001【 Palletize Instruction 】の帳票作成サービスの実装クラスです。
 * 
 * @version $Revision: 14083 $
 */
public class L2001ReportServiceImpl extends AbstractReportServiceImpl implements L2001ReportService {

    /**
     * Palletize Instruction DAO<br />
     * 梱包指示DAO
     */
    protected RpEisProductDao rpEisProductDao;

    /**
     * VtPltzInstrService
     */
    protected VtRpPltzInstrService vtRpPltzInstrService;
    
    /**
     * common services<br />
     * 共通サービス
     */
    protected CommonService commonService;
    
    /**
     * Default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public L2001ReportServiceImpl() {
    }

    /**
     * Setter method for rpEisProductDao.
     *
     * @param rpEisProductDao Set for rpEisProductDao
     */
    public void setRpEisProductDao(RpEisProductDao rpEisProductDao) {
        this.rpEisProductDao = rpEisProductDao;
    }

    /**
     * Setter method for vtRpPltzInstrService.
     *
     * @param vtRpPltzInstrService Set for vtRpPltzInstrService
     */
    public void setVtRpPltzInstrService(VtRpPltzInstrService vtRpPltzInstrService) {
        this.vtRpPltzInstrService = vtRpPltzInstrService;
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
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.L2001ReportService#searchPltzInstr(String, String)
     */
    public File searchPltzInstr(String pltzInstrNo, String dateFormat) throws ApplicationException {

        L2001ReportDomain reportDomain = new L2001ReportDomain();
        // Get header and detail of the report.
        // 帳票情報(Head・Detail)取得
        List<? extends VtRpPltzInstrDomain> vtRpPltzInstrViewList = getReportMainInfo(pltzInstrNo);
        if (vtRpPltzInstrViewList.size() == 0) {
            throw new GscmApplicationException(GSCM_E0_0010);
        }
        // Set Header data.
        // Head情報設定
        VtRpPltzInstrDomain headDm = vtRpPltzInstrViewList.get(0);
        reportDomain.setPalletizeInstrNo(headDm.getPltzInstrNo());
        reportDomain.setCustomer(StringUtil.getEmptyToBlank(headDm.getCustomerCd()));
        reportDomain.setShipTo(StringUtil.getEmptyToBlank(headDm.getLgcyShipTo()));
        reportDomain.setTrans(headDm.getTrnsCd());
        reportDomain.setWh(headDm.getLgcyWhCd());
        reportDomain.setPalletizeDate(DateUtil.formatDate(headDm.getPltzInstrDt(), dateFormat));
        reportDomain.setIssuer(getCutStr(StringUtil.getEmptyToBlank(headDm.getPltzInstrNm()), 20));     // cut 20 characters.
        reportDomain.setShipper(getCutStr(StringUtil.getEmptyToBlank(headDm.getCompNm()), 100));        // cut 100 characters.
        reportDomain.setCompany(getCutStr(StringUtil.getEmptyToBlank(headDm.getShipToNmAbb()), 20));    // cut 20 characters.

        String weightUnitTarget = headDm.getWeightUnit();
        reportDomain.setNwUnit(commonService.searchMeasureUnitDisp(weightUnitTarget));

        L2001TtPltzInstrItemNoBySumBoxQtyDomain sumQtyDomain = getSumBoxQty(pltzInstrNo);
        if (sumQtyDomain == null) {
            throw new GscmApplicationException(GSCM_E0_0010);
        }
        reportDomain.setBoxTotal(Integer.parseInt(sumQtyDomain.getSumBoxQty()));
        BigDecimal totalNetWeight = commonService.convertWeightUnit(sumQtyDomain.getSumTotalNetWeight(), headDm.getWeightUnit(), weightUnitTarget);
        // An error is made when the digit number of integer part exceeds a maximum.
        // 整数部の桁数が上限を超えた場合はエラー
        if (null == totalNetWeight) {
            Object[] params = { 
                commonService.getResource(reportDomain.getLocale(), "label.totalNetWeight") 
            }; 
            throw new GscmApplicationException(NXS_E7_0157, params); 
        }
        reportDomain.setNwTotal(NumberUtil.format( totalNetWeight, FORMAT_WEIGHT));
        reportDomain.setPrintedDate(getTimezoneDate(headDm, dateFormat));

        // Out put QR code.
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try {
            StringBuffer qrCode = new StringBuffer();
            qrCode.append(QR_HEAD_PLTZINSTR);
            qrCode.append(QR_HEAD_PLTZINSTR_DCT); 
            qrCode.append(StringUtil.rPad(StringUtil.getEmptyToBlank(headDm.getPltzInstrNo()), 10));
            reportDomain.setQrCd(createQrCode(qrCode.toString(), baos));
        } catch (QrcodeGenerateException e) {
            e.printStackTrace();
            throw new GscmApplicationException("NXS-E1-5065");
        } catch (IOException e) {
            e.printStackTrace();
            throw new GscmApplicationException("NXS-E1-5065");
        } finally {
            try {
                baos.close();
            } catch(Exception e2) {
                e2.printStackTrace();
                throw new GscmApplicationException("");
            }
        }
        // Set detail data
        List<L2001ReportDetailDomain> detailList = new ArrayList<L2001ReportDetailDomain>();
        VtRpPltzInstrDomain srcDomain = new VtRpPltzInstrDomain(); // for compare.
        String srcCustomerItemNo = "";
        boolean sameItemFlg = false;
        for (VtRpPltzInstrDomain detailDm : vtRpPltzInstrViewList) {
            
            sameItemFlg = comparePltzInstrItemNo(srcDomain, detailDm); // Compare source with destination.
            CommonUtil.copyPropertiesDomainToDomain(srcDomain, detailDm);
            
            String weightUnitSrc = detailDm.getWeightUnit();
            
            L2001ReportDetailDomain detailDomain = new L2001ReportDetailDomain();
            
            detailDomain.setNo(detailDm.getRowNumFrom());
            String customerPno = getCutStr(StringUtil.getEmptyToBlank(detailDm.getCustomerItemNo()), 20);
            detailDomain.setCustomerPno(customerPno);
            // 2017/3/29 ADD START
            detailDomain.setPoNo(detailDm.getCustomerPoNo());
            detailDomain.setDueDate(DateUtil.formatDate(detailDm.getEtdDueDt(), dateFormat));
            // 2017/3/29 ADD END

            //if (!sameItemFlg || (sameItemFlg && StringUtils.equals(srcCustomerItemNo, detailDm.getCustomerItemNo()))) {
            if (!sameItemFlg) { // 2017/3/29 CHANGE

                detailDomain.setLocatNo(detailDm.getWhStkLocation());
                String itemNo = getCutBrStr(detailDm.getItemNo(), 15, 0);
                detailDomain.setPno(itemNo);
                detailDomain.setPkgCd(detailDm.getPkgCd());
                String description = getCutBrStr(detailDm.getItemDescription(), 20, 40);
                detailDomain.setDescription(description);
                detailDomain.setInstrActQty(detailDm.getInstrQty());
                detailDomain.setQtyBox(detailDm.getBoxLotQty());
                if (detailDm.getBoxQty() != null) {
                    // 2017/04/12 ADD START
                    BigDecimal instrQty = detailDm.getInstrQty();
                    BigDecimal boxLotQty = detailDm.getBoxLotQty();
                    if(detailDm.getBoxQty().compareTo(instrQty.divide(boxLotQty, 0, BigDecimal.ROUND_DOWN)) == 0) {
                        detailDomain.setBox(detailDm.getBoxQty().toString());
                    } else {
                        detailDomain.setBox(MASK_CHAR + detailDm.getBoxQty().toString());
                    }
                    // 2017/04/12 ADD END
                }
                if (detailDm.getTotalNetWeight() == null) {
                    detailDomain.setNw(NO_DATA);
                } else {
                    totalNetWeight = BigDecimal.ZERO;
                    totalNetWeight = commonService.convertWeightUnit(detailDm.getTotalNetWeight(), weightUnitSrc, weightUnitTarget);
                    if (null == totalNetWeight) {
                        Object[] params = { 
                            commonService.getResource(reportDomain.getLocale(), "label.totalNetWeight") 
                        }; 
                        throw new GscmApplicationException(NXS_E7_0157, params); 
                    }
                    detailDomain.setNw(NumberUtil.format(totalNetWeight, FORMAT_WEIGHT));
                    
                }
                detailDomain.setPkf(detailDm.getPkgFormTyp());
                // 2017/3/29 DEL
            }
            // 2017/04/12 ADD START
            if (detailDm.getAllocQty() != null) {
                detailDomain.setAllocate(detailDm.getAllocQty().toString());
            }
            // 2017/04/12 ADD END
            detailDomain.setCheck("");
            
            srcCustomerItemNo = detailDm.getCustomerItemNo();
            
            detailList.add(detailDomain);
        }
        reportDomain.setDetailList(detailList);

        return getReportFile(reportDomain);
    }

    /**
     * Get (header, item) form data.<br />
     * 帳票データ(ヘッダ、明細)を取得します。
     *
     * @param pltzInstrNo Search condition<br />
     * 検索条件
     * @return (Header, item) information form data<br />
     * 帳票データ(ヘッダ、明細)情報
     * @throws ApplicationException If the form data can not be obtained then ApplicationException.<br />
     * 帳票データが取得できない場合にスローされます。
     */
    protected List<? extends VtRpPltzInstrDomain> getReportMainInfo(String pltzInstrNo) throws ApplicationException {
        
        VtRpPltzInstrCriteriaDomain viewCriteria = new VtRpPltzInstrCriteriaDomain();
        viewCriteria.setPltzInstrNo(pltzInstrNo);
        viewCriteria.setPreferredOrder("PKG_FORM_TYP desc nulls last, ITEM_NO, PKG_CD, CUSTOMER_ITEM_NO");
        List<? extends VtRpPltzInstrDomain> vtPltzInstrViewList = vtRpPltzInstrService.searchByCondition(viewCriteria);
        
        return vtPltzInstrViewList;
    }

    /**
     * Get "BOX QUANTITY and Palletize Instruction number" that summary to 
     * <br />the unit of PALLETIZE INSTRUCTION NO · ITEM NO · PACKAGE CODE,  the Palletize Instruction Item No.
     * <br />梱包指示品目番号を梱包指示NO・品目番号・包装区分、の単位にサマリした箱数、梱包指示数を取得します。
     *
     * @param pltzInstrNo Search condition<br />
     * 検索条件
     * @return Summary QUANTITY, WEIGHT result of domain<br />
     * 数量、重量のサマリ結果ドメイン
     * @throws ApplicationException If a summary number can not be obtained then ApplicationException.<br />
     * サマリ数が取得できない場合にスローされます。
     */
    protected L2001TtPltzInstrItemNoBySumBoxQtyDomain getSumBoxQty(String pltzInstrNo) throws ApplicationException {

        L2001TtPltzInstrItemNoBySumBoxQtyCriteriaDomain criteria = new L2001TtPltzInstrItemNoBySumBoxQtyCriteriaDomain();
        criteria.setPalletizeInstrNo(pltzInstrNo);
        List<? extends L2001TtPltzInstrItemNoBySumBoxQtyDomain> sumQtyList 
            = rpEisProductDao.searchTtPltzInstrItemNoBySumBoxQty(criteria);
        if (sumQtyList == null || sumQtyList.isEmpty()) {
            return null;
        }
        return sumQtyList.get(0);
    }

    /**
     * Get the print date.<br />
     * 印刷日付を取得します。
     *
     * @param headDm Search conditions domain<br />
     * 検索条件ドメイン
     * @param dateFormat Date format<br />
     * 日付フォーマット
     * @return Time zone conversion date and time<br />
     * タイムゾーン変換日時
     * @throws ApplicationException If the date can not be obtained then ApplicationException.<br />
     * 日付が取得できない場合にスローされます。
     */
    protected String getTimezoneDate(VtRpPltzInstrDomain headDm, String dateFormat) throws ApplicationException {
        String timezoneId = commonService.searchTimezone(headDm.getShipperCd());
        Date sysdate = DateUtil.convertTime(new Date(), timezoneId);
        return DateUtil.formatDate(sysdate, dateFormat);
    }

    /**
     * Generate a QR CD InputStream.<br />
     * QRコードInputStreamを生成します。
     * 
     * @param insStr String embedded QR CD<br />
     * QRコード埋め込み文字列
     * @param baos OutputStream
     * @throws IOException If an I / O error has occurred then IOException.<br />
     * 入出力エラーが発生した場合にスローされます。
     * @throws QrcodeGenerateException If a generation of QR CD can not be then QrcodeGenerateException.<br />
     * QRコードの生成ができない場合にスローされます。
     * @return InputStream QR code object<br />
     * QRコードオブジェクト
     */
    protected InputStream createQrCode(String insStr, ByteArrayOutputStream baos) throws IOException, QrcodeGenerateException {

        QrcodeGenerator.generateQrcode(insStr, ERR_CORRECTION_LV_M, CHAR_SET_UTF8, 130, baos);
        return new ByteArrayInputStream(baos.toByteArray());
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
    protected File getReportFile(L2001ReportDomain reportDomain) {
        return createReport(REPORT_ID_L2001, reportDomain);
    }

    /**
     * Cut the string<br />
     * 指定文字列をカットする
     *
     * @param cutIssuer Target string<br />
     * 対象文字列
     * @param cut Cut the number of characters<br />
     * カット文字数
     * @return After cutting the string<br />
     * カット後文字列
     */
    protected String getCutStr(String cutIssuer, int cut) {
        String cutStr = "";
        if (cutIssuer.length() > cut) {
            cutStr = cutIssuer.substring(0, cut);
        } else {
            cutStr = cutIssuer;
        }
        return cutStr;
    }
    
    /**
     * 
     * Compare source domain with destination domain.
     * 
     * @param srcDomain source VtRpPltzInstrDomain
     * @param dstDomain destination VtRpPltzInstrDomain
     * @return true:same, false:difference 
     */
    protected boolean comparePltzInstrItemNo(VtRpPltzInstrDomain srcDomain, VtRpPltzInstrDomain dstDomain){
        
        if (null == srcDomain && null == dstDomain) {
            return true;
        }
        
        if (null == srcDomain || null == dstDomain) {
            return false;
        }
        
        if (StringUtils.equals(srcDomain.getPltzInstrNo(), dstDomain.getPltzInstrNo()) 
            && StringUtils.equals(srcDomain.getItemNo(), dstDomain.getItemNo())
            && StringUtils.equals(srcDomain.getPkgCd(), dstDomain.getPkgCd())) {
            return true;
        }
        
        return false;
    }
}
