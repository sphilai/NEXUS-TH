/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0034;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0162;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0159;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W1003;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.TtExpRequestDtlKitDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestDtlKitCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TtExpRequestDtlKitService;
import com.globaldenso.eca0027.core.business.domain.W1003ListDomain;
import com.globaldenso.eca0027.core.business.domain.W1003UpdateDomain;
import com.globaldenso.eca0027.core.business.service.W1001ExpRequestService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractTransactFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CheckUtil;
import com.globaldenso.gscm.framework.util.Validator;

/**
 * The register service facade implementation class of Export Request Description Save
 * <br />Export Request Description SaveのSaveFacadeサービス実装クラスです。
 * <pre>
 * bean id:W1003SaveFacadeService
 * </pre>
 *
 * @author $Author: 810833843 $
 * @version $Revision: 10494 $
 */
public class W1003SaveFacadeServiceImpl 
    extends AbstractTransactFacadeService<W1003UpdateDomain, W1003UpdateDomain> {

    /**
     * W1001ExpRequestService
     * <br />梱包指示サービス
     */
    protected W1001ExpRequestService w1001ExpRequestService;
    /**
     * TtExpRequestDtlKitService
     * <br />梱包指示サービス
     */
    protected TtExpRequestDtlKitService ttExpRequestDtlKitService;

    /**
     * Common service
     * <br />共通サービス
     */
    protected CommonService commonService;
    
    /**
     * constructor.
     */
    public W1003SaveFacadeServiceImpl() {
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
     * <p>Setter method for ttExpRequestDtlKitService.</p>
     *
     * @param ttExpRequestDtlKitService Set for ttExpRequestDtlKitService
     */
    public void setTtExpRequestDtlKitService(TtExpRequestDtlKitService ttExpRequestDtlKitService) {
        this.ttExpRequestDtlKitService = ttExpRequestDtlKitService;
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
     * {@inheritDoc}.
     * 
     * <pre>
     * No Action <br />処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W1003UpdateDomain filterDomain(W1003UpdateDomain updateDomain)
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
    protected void validateItems(W1003UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        List<MessageDomain> errList = new ArrayList<MessageDomain>();

        if (updateDomain.getListDomainList() == null || updateDomain.getListDomainList().isEmpty()) {
            // When there is no list data
            // 一覧データがない場合
            return;
        }

        for (int i = 0; i < updateDomain.getListDomainList().size(); i++) {
            W1003ListDomain listDomain = updateDomain.getListDomainList().get(i);
            Validator<W1003ListDomain> valid = new Validator<W1003ListDomain>(listDomain, "listDomainList", i);
            if ((!CheckUtil.isBlankOrNull(listDomain.getDescription())
                || !CheckUtil.isBlankOrNull(listDomain.getQty())
                || !CheckUtil.isBlankOrNull(listDomain.getUnitPrice())
                || !CheckUtil.isBlankOrNull(listDomain.getNetWeight()))
                ||  // add by DCS 08/09/2017
                (
                    listDomain.getExpRequestItemId().trim().length() > 0 && CheckUtil.isBlankOrNull(listDomain.getDescription())
                    && CheckUtil.isBlankOrNull(listDomain.getQty())
                    && CheckUtil.isBlankOrNull(listDomain.getUnitPrice())
                    && CheckUtil.isBlankOrNull(listDomain.getNetWeight())
                )
                ) {
                
                // Unary eye check
                // 単項目チェック
                String[] properties = { 
                    "description",
                    "pkgCd",
                    "qty",
                    "unitPrice",
                    "netWeight",
                    "locationNo",
                    "constructionWorkNo"
                };
                valid.isValidateProperties(properties, SCREEN_ID_W1003);
                // Error check
                // エラー確認
                if (0 < valid.getErrList().size()) {
                    errList.addAll(valid.getErrList());
                }
            }
        }
        // Error check
        // エラー確認
        if (0 < errList.size()) {
            throw new ValidationException(errList);
        }
        
        
        for (int i = 0; i < updateDomain.getListDomainList().size(); i++) {
            W1003ListDomain listDomain = updateDomain.getListDomainList().get(i);
            // new parrent. #Issue 085,086,087
            if (CheckUtil.isBlankOrNull(listDomain.getExpRequestItemId())) {
                continue;
            }
            double sumKit = 0.0;
            // Check N/W of Parrent have to be more than N/W of Kit. #Issue 076
            TtExpRequestDtlKitCriteriaDomain kitCriteriaDomain = new TtExpRequestDtlKitCriteriaDomain();
            
            kitCriteriaDomain.setExpRequestNo(listDomain.getExpRequestNo());
            kitCriteriaDomain.setExpRequestItemId(new BigDecimal(listDomain.getExpRequestItemId()));
            
            // get kit
            List<TtExpRequestDtlKitDomain> resultKit = ttExpRequestDtlKitService.searchByCondition(kitCriteriaDomain);
            for(TtExpRequestDtlKitDomain domain : resultKit){
                sumKit += domain.getNetWeight().doubleValue() * domain.getQty().doubleValue();
            }
            if((Double.parseDouble(listDomain.getNetWeight()) * Double.parseDouble(listDomain.getQty())) < sumKit)
            {
                List<MessageDomain> errorList = Arrays.asList(new MessageDomain("", NXS_E7_0159, null));
                throw new ValidationException(errorList);
            }
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
    protected void validateConsistency(W1003UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        List<MessageDomain> errMessages = new ArrayList<MessageDomain>();
        
        for (int i = 0; i < updateDomain.getListDomainList().size(); i++ ) {
            W1003ListDomain listDomain = updateDomain.getListDomainList()
                .get(i);
            if (listDomain.getUnitPrice() != null && !"".equals(listDomain.getUnitPrice())) {
                if (!(BigDecimal.ZERO.compareTo(new BigDecimal(listDomain
                    .getUnitPrice())) < 0)) {
                    String[] params = {commonService.getResource(updateDomain
                        .getLocale(), "label.unitPrice")};
                    errMessages.add(new MessageDomain(String.format(
                        "listDomainList[%d].unitPrice", i), GSCM_E0_0034,
                        params));
                }
            }
        }
        if (errMessages.size() > 0) {
            throw new ValidationException(errMessages);
        }
    }

    /**
     * {@inheritDoc}.
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W1003UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        // Create of an error list
        List<MessageDomain> errorList = new ArrayList<MessageDomain>();
        
        List<? extends W1003ListDomain> w1003List = updateDomain.getListDomainList();
        
        Locale locale = updateDomain.getLocale();
        
        int i = 0;
        for (W1003ListDomain w1003Dm : w1003List) {
            if (CheckUtil.isBlankOrNull(w1003Dm.getExpRequestItemId())) {
                continue;
            }
            if(w1003Dm.getKitParFlg().equals(FLAG_Y)){
                // Issue 156
                if (!w1001ExpRequestService.validateDatabaseKitIsCommercial(w1003Dm.getExpRequestNo(), w1003Dm.getExpRequestItemId()) && w1003Dm.getCommercialFlg().equalsIgnoreCase("N")) {
                    String field = "listDomainList[" + i + "].commercialFlg";
                    Object[] params = {
                        commonService.getResource(locale, "label.kitParent"),
                        commonService.getResource(locale, "label.invCategory")
                    };
                    errorList.add(new MessageDomain(field, NXS_E7_0162, params));
                }
            }else{
                if (!w1001ExpRequestService.validateDatabaseKitIsEmpty(w1003Dm.getExpRequestNo(), w1003Dm.getExpRequestItemId())) {
                    String field = "listDomainList[" + i + "].kitParFlg";
                    Object[] params = {
                        commonService.getResource(locale, "label.kit"),
                        " "
                    };
                    errorList.add(new MessageDomain(field, NXS_E7_0162, params));
                }
            }
            i++;
        }
        
        // Error check
        if (0 < errorList.size()) {
            throw new ValidationException(errorList);
        }
        
    }

    /**
     * {@inheritDoc}.
     * 
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W1003UpdateDomain callServices(W1003UpdateDomain updateDomain) 
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        return w1001ExpRequestService.transactOnDetailSave(updateDomain);
    }

}
