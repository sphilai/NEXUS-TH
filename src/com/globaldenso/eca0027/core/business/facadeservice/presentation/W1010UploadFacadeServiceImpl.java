/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_KIT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_N;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0036;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NOT_PACKED_EXP;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0100;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0011;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0057;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0159;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0162;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W1003;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W1004;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import org.apache.commons.io.IOUtils;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.ai.library.csvlistconvert.CSVFormatException;
import com.globaldenso.ai.library.csvlistconvert.CsvListConversion;
import com.globaldenso.eca0027.core.auto.business.domain.TtExpRequestDtlDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtExpRequestDtlKitDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestDtlCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TtExpRequestDtlKitService;
import com.globaldenso.eca0027.core.auto.business.service.TtExpRequestDtlService;
import com.globaldenso.eca0027.core.business.domain.W1001ExpRequestDomain;
import com.globaldenso.eca0027.core.business.domain.W1007PltzWkDomain;
import com.globaldenso.eca0027.core.business.domain.W1010CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W1010ListDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W1001ExpRequestCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W1001ExpRequestService;
import com.globaldenso.eca0027.core.business.service.W1007PltzWkService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractProcessFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CheckUtil;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.Validator;

/**
 * The Facade Service to search action of Export Request Main screen. <br />
 * 船積実績Main画面のSearchアクションに対するFacadeサービスです。
 * 
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W1010UploadFacadeServiceImpl extends
    AbstractProcessFacadeService<String[], W1010CriteriaDomain> {

    /**
     * Common service <br />
     * 共通サービス
     */
    protected CommonService commonService;
    /**
     * Remove Str <br />
     * 共通サービス
     */
    protected String removedStr;
    /**
     * File Upload <br />
     * 共通サービス
     */
    protected InputStream fileUpload;

    /**
     * Export Request Service.<br />
     * 船積実績サービス
     */
    protected W1001ExpRequestService w1001ExpRequestService;

    /**
     * <p>
     * ttExpRequestDtlService
     * </p>
     */
    protected TtExpRequestDtlService ttExpRequestDtlService;

    /**
     * <p>
     * ttExpRequestDtlKitService
     * </p>
     */
    protected TtExpRequestDtlKitService ttExpRequestDtlKitService;
    /**
     * W1007PltzWkService
     */
    private W1007PltzWkService w1007PltzWkService;

    /**
     * Default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W1010UploadFacadeServiceImpl() {
    }

    /**
     * <p>
     * Getter method for w1007PltzWkService.
     * </p>
     * 
     * @return the w1007PltzWkService
     */
    public W1007PltzWkService getW1007PltzWkService() {
        return w1007PltzWkService;
    }

    /**
     * <p>
     * Setter method for w1007PltzWkService.
     * </p>
     * 
     * @param pltzWkService Set for w1007PltzWkService
     */
    public void setW1007PltzWkService(W1007PltzWkService pltzWkService) {
        w1007PltzWkService = pltzWkService;
    }

    /**
     * <p>
     * Setter method for removedStr.
     * </p>
     * 
     * @param removedStr Set for removedStr
     */
    public void setRemovedStr(String removedStr) {
        this.removedStr = removedStr;
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
     * Setter method for w1001ExpRequestService.
     * 
     * @param expRequestService Set for w1001ExpRequestService
     */
    public void setW1001ExpRequestService(W1001ExpRequestService expRequestService) {
        w1001ExpRequestService = expRequestService;
    }

    /**
     * Setter method for ttExpRequestDtlService.
     * 
     * @param ttExpRequestDtlService Set for ttExpRequestDtlService
     */
    public void setTtExpRequestDtlService(TtExpRequestDtlService ttExpRequestDtlService) {
        this.ttExpRequestDtlService = ttExpRequestDtlService;
    }

    /**
     * <p>
     * Setter method for fileUpload.
     * </p>
     * 
     * @param fileUpload Set for fileUpload
     */
    public void setFileUpload(InputStream fileUpload) {
        this.fileUpload = fileUpload;
    }

    /**
     * Setter method for ttExpRequestDtlKitService.
     * 
     * @param ttExpRequestDtlKitService Set for ttExpRequestDtlKitService
     */
    public void setTtExpRequestDtlKitService(TtExpRequestDtlKitService ttExpRequestDtlKitService) {
        this.ttExpRequestDtlKitService = ttExpRequestDtlKitService;
    }

    /**
     * {@inheritDoc}
     * 
     * <pre>
     * No action
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W1010CriteriaDomain filterDomain(W1010CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {
        return criteriaDomain;
    }

    /**
     * {@inheritDoc}
     * 
     * <pre>
     *  No action 
     *  処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W1010CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // No action
        // 処理なし
        try {
            fileUpload = criteriaDomain.getUploadFileData();
            removedStr = IOUtils.toString(fileUpload);
            List<List<String>> removedData = CsvListConversion.getList(removedStr);
            if (removedData == null || removedData.size() > 1) {
                List<String> str = removedData.get(1);
                if (str == null || str.size() != 18) {
                    if (fileUpload != null) {
                        fileUpload.close();
                    }
                    List<MessageDomain> errList = Arrays.asList(new MessageDomain("", NXS_E1_0100,
                        null));
                    throw new ValidationException(errList);
                }
            }

            boolean checkFormat = true;
            /*
             * for (int i = 1; i < removedData.size(); i++ ) { W1010ListDomain
             * detailDomain = covertToDomain(removedData.get(i)); // Check
             * quantity and netWeight is number try{
             * Double.parseDouble(detailDomain.getNetWeight());
             * Double.parseDouble(detailDomain.getQty());
             * if(detailDomain.getPalletNo() != null &&
             * detailDomain.getPalletNo().trim().length() > 0 ) {
             * Integer.parseInt(detailDomain.getPalletNo()); } }catch
             * (NumberFormatException e) { checkFormat = false; break; } if(i ==
             * 1){ if(detailDomain.getKitParFlg() != null &&
             * detailDomain.getKitParFlg().equalsIgnoreCase("kit")){ checkFormat =
             * false; break; }else if(
             * !detailDomain.getKitParFlg().equalsIgnoreCase("Y") &&
             * !detailDomain.getKitParFlg().equalsIgnoreCase("N") &&
             * !detailDomain.getKitParFlg().equalsIgnoreCase("KIT")){
             * checkFormat = false; break; } }else
             * if(detailDomain.getKitParFlg() == null){ checkFormat = false;
             * break; }else if(
             * !detailDomain.getKitParFlg().equalsIgnoreCase("Y") &&
             * !detailDomain.getKitParFlg().equalsIgnoreCase("N") &&
             * !detailDomain.getKitParFlg().equalsIgnoreCase("KIT")){
             * checkFormat = false; break; }else
             * if(detailDomain.getKitParFlg().equalsIgnoreCase("kit")){
             * W1010ListDomain detailDomainParent =
             * covertToDomain(removedData.get(i - 1));
             * if(detailDomainParent.getKitParFlg().equalsIgnoreCase("N")){
             * checkFormat = false; break; } } }
             */
            for (int i = 1; i < removedData.size(); i++ ) {
                W1010ListDomain detailDomain = covertToDomain(removedData.get(i));
                if (detailDomain.getIndexNo() == null || detailDomain.getIndexNo().equals("")) {
                    checkFormat = false;
                    break;
                }
                detailDomain.setLocale(new Locale(criteriaDomain.getLanguageCd()));
                for (int j = 1; j < removedData.size(); j++ ) {
                    W1010ListDomain checkKit = covertToDomain(removedData.get(j));
                    checkKit.setLocale(new Locale(criteriaDomain.getLanguageCd()));
                    if (!checkKit.equals(detailDomain)) {// not duplicate
                        if (detailDomain.getIndexNo().equals(checkKit.getIndexNo())) {// same
                            // index
                            if ((detailDomain.getKitParFlg().equals(FLAG_N) && checkKit
                                .getKitParFlg().equals(FLAG_KIT))
                                || (detailDomain.getKitParFlg().equals(FLAG_KIT) && checkKit
                                    .getKitParFlg().equals(FLAG_N))) {
                                checkFormat = false;
                                break;
                            }
                        }
                    }
                }
                if (!checkFormat) {
                    break;
                }
            }
            if (!checkFormat) {
                List<MessageDomain> errList = Arrays
                    .asList(new MessageDomain("", NXS_E1_0100, null));
                throw new ValidationException(errList);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (CSVFormatException e) {
            e.printStackTrace();
        }
    }

    /**
     * {@inheritDoc}
     * 
     * <pre>
     * No action
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W1010CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        if (!w1001ExpRequestService.validateConsistencyFilePathInput(criteriaDomain
            .getUploadFileName())) {
            throw new ValidationException(Arrays.asList(new MessageDomain(
                "w1010CriteriaDomain.formFileData", NXS_E7_0011, null)));
        }

        if (!w1001ExpRequestService.validateConsistencyFileExistence(criteriaDomain
            .getUploadFileSize())) {
            throw new ValidationException(Arrays.asList(new MessageDomain(
                "w1010CriteriaDomain.formFileData", GSCM_E0_0036, null)));
        }

        if (!w1001ExpRequestService.validateConsistencyFileSize(criteriaDomain.getUploadFileSize())) {
            throw new ValidationException(Arrays.asList(new MessageDomain(
                "w1010CriteriaDomain.formFileData", NXS_E7_0057, null)));
        }
    }

    /**
     * {@inheritDoc}
     * 
     * <pre>
     * No action
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W1010CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // No action
        // 処理なし
    }

    /**
     * {@inheritDoc}[
     * 
     * <pre>
     * Data which coincides with the conditions specified as the search condition is acquired. 
     * 検索条件に指定した条件に一致するデータを取得します。
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected String[] callServices(W1010CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        Locale locale = criteriaDomain.getLocale();
        List<W1010ListDomain> w1010DetailList = new ArrayList<W1010ListDomain>();
        List<String> rowNo = new ArrayList<String>();
        List<MessageDomain> errList = new ArrayList<MessageDomain>();
        try {
            List<List<String>> removedData = CsvListConversion.getList(removedStr);
            List<W1010ListDomain> prantList = new ArrayList<W1010ListDomain>();
            List<W1010ListDomain> kitList = new ArrayList<W1010ListDomain>();
            if(locale == null){
                locale = new Locale("en" , "TH");
            }
            for (int i = 1; i < removedData.size(); i++ ) { // set list
                W1010ListDomain detailDomain = covertToDomain(removedData.get(i));
                detailDomain.setLocale(new Locale(criteriaDomain.getLanguageCd()));
                if (!detailDomain.getKitParFlg().equals(FLAG_KIT)) {
                    prantList.add(detailDomain);
                } else if (detailDomain.getKitParFlg().equals(FLAG_KIT)) {
                    kitList.add(detailDomain);
                }
            }
            for (int i = 0; i < prantList.size(); i++ ) {
                W1010ListDomain detailDomain = prantList.get(i);
                if (validateItems(detailDomain)) {
                    w1010DetailList.add(detailDomain);
                    if (!detailDomain.getKitParFlg().equals(FLAG_N)) {
                        double sumKit = 0; //netWeight
                        for (int j = 0; j < kitList.size(); j++ ) {
                            W1010ListDomain kitDomain = kitList.get(j);
                            if (kitDomain.getIndexNo().equals(detailDomain.getIndexNo())) {
                                if (validateItems(kitDomain)) {
                                    w1010DetailList.add(kitDomain);
                                    //Issue 141
                                    sumKit += Double.parseDouble(kitDomain.getNetWeight()) * Double.parseDouble(kitDomain.getQty());
                                    //Issue 140
                                    if (detailDomain.getCommercialFlg().equalsIgnoreCase("N")) {
                                        if (!kitDomain.getCommercialFlg().equalsIgnoreCase("N")) {
                                            //===ISSUE DATE 01042016 =============
                                            Object[] params = {
                                                commonService.getResource(locale, "label.kitParent"),
                                                commonService.getResource(locale, "label.invCategory")
                                            };
                                            errList.add(new MessageDomain("", NXS_E7_0162, params));
                                            // =====end ISSUE =============
                                        }
                                    }
                                } else {
                                    rowNo.add("SetNo " + kitDomain.getIndexNo() + " Kit ");
                                }
                            }
                        }
                        //Issue 141
                        if (sumKit > (Double.parseDouble(detailDomain.getNetWeight()) * Double.parseDouble(detailDomain.getQty()))) {
                            errList.add(new MessageDomain("", NXS_E7_0159, null));
                        }
                    }
                } else {
                    rowNo.add("SetNo " + detailDomain.getIndexNo());
                }
            }
            // Error check
            // エラー確認
            if (0 < errList.size()) {
                throw new ValidationException(errList);
            }

            List<TtExpRequestDtlDomain> insertDetailList = new ArrayList<TtExpRequestDtlDomain>();
            List<TtExpRequestDtlKitDomain> insertKitList = new ArrayList<TtExpRequestDtlKitDomain>();
            List<W1007PltzWkDomain> insertPalletList = new ArrayList<W1007PltzWkDomain>();

            TtExpRequestDtlCriteriaDomain ttExpRequestDtlCriteriaDomain = new TtExpRequestDtlCriteriaDomain();
            ttExpRequestDtlCriteriaDomain.setExpRequestNo(criteriaDomain.getExpRequestNo());
            List<TtExpRequestDtlDomain> resultList = ttExpRequestDtlService
                .searchByCondition(ttExpRequestDtlCriteriaDomain);
            int seqNoDtl = 0;
            int seqNoKit = 0;
            if (resultList.size() != 0) {
                seqNoDtl = resultList.get(resultList.size() - 1).getExpRequestItemId()
                    .intValueExact();
            }
            String palletNoParent = "";
            for (W1010ListDomain w1010Domain : w1010DetailList) {
                w1010Domain.setExpRequestNo(criteriaDomain.getExpRequestNo());
                w1010Domain.setCurrCd(criteriaDomain.getCurrCd());
                w1010Domain.setCurrency(criteriaDomain.getCurrCd());
                if (CheckUtil.isBlankOrNull(w1010Domain.getExpRequestItemId())
                    && !w1010Domain.getKitParFlg().equals(FLAG_KIT)) {
                    TtExpRequestDtlDomain dtlDomain = new TtExpRequestDtlDomain();
                    seqNoDtl++ ;
                    String idDtl = seqNoDtl + "";
                    w1010Domain.setExpRequestItemId(idDtl);
                    w1010Domain.setLineNo(idDtl);
                    CommonUtil.copyPropertiesDomainToDomain(dtlDomain, w1010Domain);
                    commonService.setCommonPropertyForRegist(dtlDomain, SCREEN_ID_W1003);
                    //Issue 117 comment for 160
                    //BigDecimal netWeight = dtlDomain.getNetWeight().divide(dtlDomain.getQty(), 3, BigDecimal.ROUND_HALF_UP);
                    //dtlDomain.setNetWeight(netWeight);
                    dtlDomain.setRtUseFlg("Y");
                    dtlDomain.setPackingStatus("20");
                    insertDetailList.add(dtlDomain);
                    seqNoKit = 0;

                    // Update pallet no
                    if (dtlDomain.getKitParFlg().equalsIgnoreCase("N")) {
                        W1007PltzWkDomain domain = new W1007PltzWkDomain();
                        int maxId = w1007PltzWkService.searchMaxId();
                        domain.setExpRequestNo(criteriaDomain.getExpRequestNo());
                        domain.setPltzWkId(new BigDecimal(maxId));
                        domain
                            .setExpRequestItemId(new BigDecimal(w1010Domain.getExpRequestItemId()));
                        domain.setLineNo(new BigDecimal(w1010Domain.getLineNo()));
                        domain.setNetWeight(new BigDecimal(w1010Domain.getNetWeight()));
                        domain.setPalletNo(w1010Domain.getPalletNo());
                        domain.setCustomerItemNo(w1010Domain.getCustomerItemNo());
                        domain.setDescription(w1010Domain.getDescription());
                        domain.setComponentItemNo(w1010Domain.getItemNo());
                        domain.setQty(new BigDecimal(w1010Domain.getQty()));
                        domain.setQtyUnit(w1010Domain.getQtyUnit());
                        domain.setComCreateFuncId(w1010Domain.getScreenId());
                        domain.setComCreateUserId(w1010Domain.getLoginUserDscId());
                        //Issue 117 comment for Issue 160
                        //netWeight = domain.getNetWeight().divide(domain.getQty(), 3, BigDecimal.ROUND_HALF_UP);
                        //domain.setNetWeight(netWeight);
                        insertPalletList.add(domain);
                    } else { // Y
                        palletNoParent = w1010Domain.getPalletNo().trim();
                    }
                } else if (w1010Domain.getKitParFlg().equals(FLAG_KIT)) {
                    TtExpRequestDtlKitDomain kitDomain = new TtExpRequestDtlKitDomain();
                    seqNoKit++ ;
                    String idKit = seqNoKit + "";
                    CommonUtil.copyPropertiesDomainToDomain(kitDomain, w1010Domain);
                    commonService.setCommonPropertyForRegist(kitDomain, SCREEN_ID_W1004);
                    kitDomain.setExpRequestKitId(new BigDecimal(idKit));
                    kitDomain.setExpRequestItemId(new BigDecimal(seqNoDtl));
                    kitDomain.setKitBrch(new BigDecimal(idKit));
                    kitDomain.setRtUseFlg("Y");
                    kitDomain.setPackingStatus("20");
                    //Issue 117 comment for Issue 160
                    //BigDecimal netWeight = kitDomain.getNetWeight().divide(kitDomain.getQty(), 3, BigDecimal.ROUND_HALF_UP);
                    //kitDomain.setNetWeight(netWeight);
                    insertKitList.add(kitDomain);

                    // Update pallet no
                    W1007PltzWkDomain domain = new W1007PltzWkDomain();
                    int maxId = w1007PltzWkService.searchMaxId();
                    domain.setExpRequestNo(criteriaDomain.getExpRequestNo());
                    domain.setPltzWkId(new BigDecimal(maxId));
                    domain.setExpRequestItemId(kitDomain.getExpRequestItemId());
                    domain.setExpRequestKitId(kitDomain.getExpRequestKitId());
                    domain.setKitBrch(kitDomain.getKitBrch());
                    domain.setNetWeight(new BigDecimal(w1010Domain.getNetWeight()));
                    if (w1010Domain.getPalletNo() != null
                        && w1010Domain.getPalletNo().trim().length() > 0) {
                        domain.setPalletNo(w1010Domain.getPalletNo());
                        domain.setCustomerItemNo(w1010Domain.getCustomerItemNo());
                        domain.setDescription(w1010Domain.getDescription());
                        domain.setComponentItemNo(w1010Domain.getItemNo());
                        domain.setQty(new BigDecimal(w1010Domain.getQty()));
                        domain.setQtyUnit(w1010Domain.getQtyUnit());
                        domain.setComCreateFuncId(w1010Domain.getScreenId());
                        domain.setComCreateUserId(w1010Domain.getLoginUserDscId());
                        //Issue 117 comment for Issue 160
                        //netWeight = domain.getNetWeight().divide(domain.getQty(), 3, BigDecimal.ROUND_HALF_UP);
                        //domain.setNetWeight(netWeight);
                        insertPalletList.add(domain);
                    }
                    /*
                     * else{ if(palletNoParent != null &&
                     * palletNoParent.length() > 0){
                     * domain.setPalletNo(palletNoParent);
                     * domain.setCustomerItemNo(w1010Domain.getCustomerItemNo());
                     * domain.setDescription(w1010Domain.getDescription());
                     * domain.setComponentItemNo(w1010Domain.getItemNo());
                     * domain.setQty(new BigDecimal(w1010Domain.getQty()));
                     * domain.setQtyUnit(w1010Domain.getQtyUnit());
                     * domain.setComCreateFuncId(w1010Domain.getScreenId());
                     * domain.setComCreateUserId(w1010Domain.getLoginUserDscId());
                     * insertPalletList.add(domain); } }
                     */
                }
            }

            if (insertDetailList.size() > 0) {
                ttExpRequestDtlService.create(insertDetailList);
            }
            if (insertKitList.size() > 0) {
                ttExpRequestDtlKitService.create(insertKitList);
            }
            if (insertPalletList.size() > 0) {
                w1007PltzWkService.create(insertPalletList);
            }

            if (fileUpload != null) {
                fileUpload.close();
            }

            // Set Exp Request Statue is "40"
            // The information from a screen is set to criteria.
            // criteria に画面からの情報を設定する。
            if (w1010DetailList != null && w1010DetailList.size() > 0) {

                W1001ExpRequestCriteriaDomain w1001ExpRequestCriteriaDomain = new W1001ExpRequestCriteriaDomain();
                w1001ExpRequestCriteriaDomain.setExpRequestNo(criteriaDomain.getExpRequestNo());
                // Search Exp Request
                W1001ExpRequestDomain w1001ExpRequestDomain = w1001ExpRequestService
                    .searchByKeyForChange(w1001ExpRequestCriteriaDomain);
                // Update Request status
                w1001ExpRequestDomain.setRequestStatus(NOT_PACKED_EXP);
                w1001ExpRequestDomain.setComUpdateFuncId(criteriaDomain.getScreenId());
                w1001ExpRequestDomain.setComUpdateUserId(criteriaDomain.getLoginUserDscId());
                // Register
                w1001ExpRequestService.update(w1001ExpRequestDomain);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (CSVFormatException e) {
            e.printStackTrace();
        }

        String[] rtList = {w1010DetailList.size() + "", "0"};

        if (rowNo != null && rowNo.size() > 0) {
            rtList[1] = "";
            for (int i = 0; i < rowNo.size(); i++ ) {
                rtList[1] += rowNo.get(i);
                if (i + 1 < rowNo.size()) {
                    rtList[1] += ",";
                }
            }
        }

        return rtList;

    }

    /**
     * <p>
     * Type in the functional overview of the method.
     * </p>
     * 
     * @param csvList List
     * @return w1002CriteriaDomain W1003UpdateDomain
     */
    protected W1010ListDomain covertToDomain(List<String> csvList) {

        W1010ListDomain detailListDomain = new W1010ListDomain();

        detailListDomain.setIndexNo(csvList.get(0));
        detailListDomain.setKitParFlg(csvList.get(1));
        detailListDomain.setPalletNo(csvList.get(2));
        detailListDomain.setCustomerPoNo(csvList.get(3));
        detailListDomain.setCustomerItemNo(csvList.get(4));
        detailListDomain.setKitCustomerItemNo(csvList.get(4));
        detailListDomain.setDescription(csvList.get(5));
        detailListDomain.setKitComponentItemNm(csvList.get(5));
        detailListDomain.setItemNo(csvList.get(6));
        detailListDomain.setKitComponentItemNo(csvList.get(6));
        detailListDomain.setPkgCd(csvList.get(7));
        detailListDomain.setOriginCntryCd(csvList.get(8));
        detailListDomain.setQtyUnit(csvList.get(9));
        detailListDomain.setQty(csvList.get(10));
        detailListDomain.setUnitPrice(csvList.get(11));
        detailListDomain.setNetWeight(csvList.get(12));
        detailListDomain.setDngrGoodsImpExpCtrl(csvList.get(13));
        detailListDomain.setCommercialFlg(csvList.get(14));
        detailListDomain.setReExpGoodsFlg(csvList.get(15));
        detailListDomain.setLocationNo(csvList.get(16));
        detailListDomain.setConstructionWorkNo(csvList.get(17));

        return detailListDomain;
    }

    /**
     * <p>
     * Type in the functional overview of the method.
     * </p>
     * 
     * @param listDomain W1003ListDomain
     * @return boolean Boolean
     * @throws GscmApplicationException GscmApplicationException
     * @throws ValidationException ValidationException
     * @throws ApplicationException ApplicationException
     */
    protected Boolean validateItems(W1010ListDomain listDomain) 
        throws GscmApplicationException, ValidationException, ApplicationException {

        Validator<W1010ListDomain> valid = new Validator<W1010ListDomain>(listDomain,
            "listDomainList");
        if (!listDomain.getKitParFlg().equals(FLAG_KIT)) {
            if (!CheckUtil.isBlankOrNull(listDomain.getDescription())
                || !CheckUtil.isBlankOrNull(listDomain.getQty())
                || !CheckUtil.isBlankOrNull(listDomain.getUnitPrice())
                || !CheckUtil.isBlankOrNull(listDomain.getNetWeight())) {

                // Unary eye check
                // 単項目チェック
                String[] properties = {"description", "qty", "unitPrice", "netWeight"};
                valid.isValidateProperties(properties, SCREEN_ID_W1003);
                // Error check
                // エラー確認
                if (0 < valid.getErrList().size()) {
                    throw new ValidationException(valid.getErrList());
                }
            }
        } else {
            if (!CheckUtil.isBlankOrNull(listDomain.getKitComponentItemNm())
                || !CheckUtil.isBlankOrNull(listDomain.getQty())
                || !CheckUtil.isBlankOrNull(listDomain.getUnitPrice())
                || !CheckUtil.isBlankOrNull(listDomain.getNetWeight())) {
              //|| !CheckUtil.isBlankOrNull(listDomain.getQtyUnit())) { //Issue 091

                // Unary eye check
                // 単項目チェック
                String[] properties = {"kitComponentItemNm", "qtyUnit", "qty", "unitPrice",
                    "netWeight"};
                valid.isValidateProperties(properties, SCREEN_ID_W1004);
                // Error check
                // エラー確認
                if (0 < valid.getErrList().size()) {
                    throw new ValidationException(valid.getErrList());
                }
            }
        }

        return true;
    }

}
