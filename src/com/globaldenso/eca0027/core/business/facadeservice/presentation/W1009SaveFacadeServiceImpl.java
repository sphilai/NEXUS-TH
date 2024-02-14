/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W1009;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.TwExpRequestPalletizeRtDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TwExpRequestPalletizeRtCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TwExpRequestPalletizeRtService;
import com.globaldenso.eca0027.core.business.domain.W1009ListDomain;
import com.globaldenso.eca0027.core.business.domain.W1009UpdateDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractTransactFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CheckUtil;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.Validator;

/**
 * The register service facade implementation class of Export Packaging Returnable PKG  Material
 * <br />Export Packaging Returnable PKG  MaterialのSaveAndDeleteFacadeサービス実装クラスです。
 * <pre>
 *
 * @author $Author: 810833843 $
 * @version $Revision: 10494 $
 */
public class W1009SaveFacadeServiceImpl 
    extends AbstractTransactFacadeService<W1009UpdateDomain, W1009UpdateDomain> {

    /**
     * twExpRequestPalletizeRtService
     * <br />梱包指示サービス
     */
    protected TwExpRequestPalletizeRtService twExpRequestPalletizeRtService;
    
    /**
     * commonService
     * <br />梱包指示サービス
     */
    protected CommonService commonService;
    
    /**
     * constructor.
     */
    public W1009SaveFacadeServiceImpl() {
    }

    /**
     * Setter method for ttExpRequestPltzRtService.
     *
     * @param twExpRequestPalletizeRtService Set for ttExpRequestPltzRtService
     */
    public void setTwExpRequestPalletizeRtService(
        TwExpRequestPalletizeRtService twExpRequestPalletizeRtService) {
        this.twExpRequestPalletizeRtService = twExpRequestPalletizeRtService;
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
     * {@inheritDoc}.
     * 
     * <pre>
     * No Action <br />処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W1009UpdateDomain filterDomain(W1009UpdateDomain updateDomain)
        throws GscmApplicationException, ApplicationException {
        
        return updateDomain;
    }
    
    /**
     * {@inheritDoc}.
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W1009UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        List<MessageDomain> errList = new ArrayList<MessageDomain>();

        if (updateDomain.getListDomainList() == null || updateDomain.getListDomainList().isEmpty()) {
            // When there is no list data
            // 一覧データがない場合
            return;
        }

        for (int i = 0; i < updateDomain.getListDomainList().size(); i++) {
            W1009ListDomain listDomain = updateDomain.getListDomainList().get(i);
            Validator<W1009ListDomain> valid = new Validator<W1009ListDomain>(listDomain, "listDomainList", i);
            if(listDomain.getSelectPkgFlg().equalsIgnoreCase("N") && CheckUtil.isBlankOrNull(listDomain.getDescription())){
                // No Input records
            }else{
                if(listDomain.getSelectPkgFlg() != null && listDomain.getSelectPkgFlg().equalsIgnoreCase("N")){
                    if(listDomain.getOuterCode() != null && listDomain.getOuterCode().trim().length() > 0 ){
                        if (!CheckUtil.isBlankOrNull(listDomain.getDescription())
                            || !CheckUtil.isBlankOrNull(listDomain.getQty())
                            || !CheckUtil.isBlankOrNull(listDomain.getNetWeight())
                            || !CheckUtil.isBlankOrNull(listDomain.getPkgItemNo())
                            || !CheckUtil.isBlankOrNull(listDomain.getLengthUnit())
                            || !CheckUtil.isBlankOrNull(listDomain.getLength())
                            || !CheckUtil.isBlankOrNull(listDomain.getWidth())
                            || !CheckUtil.isBlankOrNull(listDomain.getHeight())
                            || !CheckUtil.isBlankOrNull(listDomain.getOriginCntryCd())
                            || !CheckUtil.isBlankOrNull(listDomain.getCurrCd())) {
                            
                            // Unary eye check
                            // 単項目チェック
                            String[] properties = { 
                                "pkgItemNo",
                                "description",
                                "qty",
                                "lengthUnit",
                                "length",
                                "width",
                                "height",
                                "netWeight",
                                "originCntryCd",
                                "currCd",
                                "qtyUnit"
                            };
                            valid.isValidateProperties(properties, SCREEN_ID_W1009);
                            // Error check
                            // エラー確認
                            if (0 < valid.getErrList().size()) {
                                errList.addAll(valid.getErrList());
                            }
                        }
                    }else{
                        if (!CheckUtil.isBlankOrNull(listDomain.getDescription())
                            || !CheckUtil.isBlankOrNull(listDomain.getQty())
                            || !CheckUtil.isBlankOrNull(listDomain.getUnitPrice())
                            || !CheckUtil.isBlankOrNull(listDomain.getNetWeight())
                            || !CheckUtil.isBlankOrNull(listDomain.getPkgItemNo())
                            || !CheckUtil.isBlankOrNull(listDomain.getLengthUnit())
                            || !CheckUtil.isBlankOrNull(listDomain.getLength())
                            || !CheckUtil.isBlankOrNull(listDomain.getWidth())
                            || !CheckUtil.isBlankOrNull(listDomain.getHeight())
                            || !CheckUtil.isBlankOrNull(listDomain.getOriginCntryCd())
                            || !CheckUtil.isBlankOrNull(listDomain.getCurrCd())) {
                            
                            // Unary eye check
                            // 単項目チェック
                            String[] properties = { 
                                "pkgItemNo",
                                "description",
                                "qty",
                                "lengthUnit",
                                "length",
                                "width",
                                "height",
                                "netWeight",
                                "originCntryCd",
                                "currCd",
                                "unitPrice",
                                "qtyUnit"
                            };
                            valid.isValidateProperties(properties, SCREEN_ID_W1009);
                            // Error check
                            // エラー確認
                            if (0 < valid.getErrList().size()) {
                                errList.addAll(valid.getErrList());
                            }
                        }
                    }
                    
                }else if(listDomain.getSelectPkgFlg() != null && listDomain.getSelectPkgFlg().equalsIgnoreCase("Y")){
                    if (!CheckUtil.isBlankOrNull(listDomain.getDescription())
                        || !CheckUtil.isBlankOrNull(listDomain.getQty())){
                        
                        // Unary eye check
                        // 単項目チェック
                        String[] properties = { 
                            "description",
                            "qty"
                        };
                        valid.isValidateProperties(properties, SCREEN_ID_W1009);
                        // Error check
                        // エラー確認
                        if (0 < valid.getErrList().size()) {
                            errList.addAll(valid.getErrList());
                        }
                    }
                }
            }
        }
        // Error check
        // エラー確認
        if (0 < errList.size()) {
            throw new ValidationException(errList);
        }
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W1009UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
  
    }

    /**
     * {@inheritDoc}.
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W1009UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
    }

    /**
     * {@inheritDoc}.
     * 
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @SuppressWarnings("unchecked")
    @Override
    protected W1009UpdateDomain callServices(W1009UpdateDomain updateDomain) 
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        //Load Seq
        TwExpRequestPalletizeRtCriteriaDomain expRequestPltzRtCriteria = new TwExpRequestPalletizeRtCriteriaDomain();
        expRequestPltzRtCriteria.setExpRequestNo(updateDomain.getCriteriaDomain().getExpRequestNo());
        expRequestPltzRtCriteria.setPalletNo(updateDomain.getCriteriaDomain().getPalletNo());
        
        List<TwExpRequestPalletizeRtDomain> countList = twExpRequestPalletizeRtService.searchByCondition(expRequestPltzRtCriteria);
        
        int seq = 0;
        if (countList.size() != 0) {
            seq = countList.get(countList.size() - 1).getExpRequestRtItemId().intValue();
        }
        
        // Insert and Update
        List<TwExpRequestPalletizeRtDomain> insertList = new ArrayList<TwExpRequestPalletizeRtDomain>();
        List<TwExpRequestPalletizeRtDomain> updateList = new ArrayList<TwExpRequestPalletizeRtDomain>();
        if(updateDomain.getCriteriaDomain().getMainMark() == null || updateDomain.getCriteriaDomain().getMainMark().length() <= 0){
            for (W1009ListDomain w1009ListDomain : updateDomain.getListDomainList()) {
                if (CheckUtil.isBlankOrNull(w1009ListDomain.getExpRequestRtItemId()) && !CheckUtil.isBlankOrNull(w1009ListDomain.getPkgItemNo())) {
                    TwExpRequestPalletizeRtDomain expRequestPltzRtDomain = new TwExpRequestPalletizeRtDomain();
                    CommonUtil.copyPropertiesDomainToDomain(expRequestPltzRtDomain, w1009ListDomain);
                    commonService.setCommonPropertyForRegist(expRequestPltzRtDomain, SCREEN_ID_W1009);
                    if (CheckUtil.isBlankOrNull(expRequestPltzRtDomain.getModelCd())) {
                        expRequestPltzRtDomain.setModelCd(null);
                    }
                    if (CheckUtil.isBlankOrNull(expRequestPltzRtDomain.getQtyUnit())) {
                        expRequestPltzRtDomain.setQtyUnit(null);
                    }
                    seq++;
                    expRequestPltzRtDomain.setExpRequestRtItemId(new BigDecimal(seq + ""));
                    insertList.add(expRequestPltzRtDomain);
                }else if (!CheckUtil.isBlankOrNull(w1009ListDomain.getExpRequestRtItemId())) {
                    TwExpRequestPalletizeRtDomain expRequestPltzRtDomain = new TwExpRequestPalletizeRtDomain();
                    CommonUtil.copyPropertiesDomainToDomain(expRequestPltzRtDomain, w1009ListDomain);
                    commonService.setCommonPropertyForRegist(expRequestPltzRtDomain, SCREEN_ID_W1009);
                    if (CheckUtil.isBlankOrNull(expRequestPltzRtDomain.getModelCd())) {
                        expRequestPltzRtDomain.setModelCd(null);
                    }
                    if (CheckUtil.isBlankOrNull(expRequestPltzRtDomain.getQtyUnit())) {
                        expRequestPltzRtDomain.setQtyUnit(null);
                    }
                    updateList.add(expRequestPltzRtDomain);
                }
            }
            if (insertList.size() > 0) {
                twExpRequestPalletizeRtService.create(insertList);
            }
            if (updateList.size() > 0) {
                twExpRequestPalletizeRtService.update(updateList);
            }
        }
        // Load Init
        List<TwExpRequestPalletizeRtDomain> resultList = twExpRequestPalletizeRtService.searchByCondition(expRequestPltzRtCriteria);

        List<W1009ListDomain> w1009List = new ArrayList<W1009ListDomain>();
        for (TwExpRequestPalletizeRtDomain listDomain : resultList) {
            W1009ListDomain w1009ListDomain = new W1009ListDomain();
            CommonUtil.copyPropertiesDomainToDomain(w1009ListDomain, listDomain);
            w1009List.add(w1009ListDomain);
        }
        
        updateDomain.setListDomainList(w1009List);
        
        return updateDomain;
    }

}
