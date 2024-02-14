/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W1004;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0159;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0162;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W1004KitListDomain;
import com.globaldenso.eca0027.core.business.domain.W1004ListDomain;
import com.globaldenso.eca0027.core.business.domain.W1004UpdateDomain;
import com.globaldenso.eca0027.core.business.service.W1001ExpRequestService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractTransactFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CheckUtil;
import com.globaldenso.gscm.framework.util.Validator;

/**
 * The register service facade implementation class of Export Request Kit Save
 * <br />Export Request Kit SaveのSaveFacadeサービス実装クラスです。
 * <pre>
 * bean id:W1004SaveFacadeService
 * </pre>
 *
 * @author $Author: 810833843 $
 * @version $Revision: 10494 $
 */
public class W1004SaveFacadeServiceImpl 
    extends AbstractTransactFacadeService<W1004UpdateDomain, W1004UpdateDomain> {

    /**
     * W1001ExpRequestService
     * <br />梱包指示サービス
     */
    protected W1001ExpRequestService w1001ExpRequestService;
    
    /**
     * Common service
     * <br />共通サービス
     */
    protected CommonService commonService;
    
    /**
     * constructor.
     */
    public W1004SaveFacadeServiceImpl() {
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
     * {@inheritDoc}.
     * 
     * <pre>
     * No Action <br />処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W1004UpdateDomain filterDomain(W1004UpdateDomain updateDomain)
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
    protected void validateItems(W1004UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        List<MessageDomain> errList = new ArrayList<MessageDomain>();

        if (updateDomain.getKitList() == null || updateDomain.getKitList().isEmpty()) {
            // When there is no list data
            // 一覧データがない場合
            return;
        }
        Locale locale = updateDomain.getLocale();
        double sumKit = 0.0;
        for (int i = 0; i < updateDomain.getKitList().size(); i++) {
            W1004KitListDomain listDomain = updateDomain.getKitList().get(i);
            Validator<W1004KitListDomain> valid = new Validator<W1004KitListDomain>(listDomain, "kitList", i);
            if (!CheckUtil.isBlankOrNull(listDomain.getKitComponentItemNm())
                || !CheckUtil.isBlankOrNull(listDomain.getQty())
                || !CheckUtil.isBlankOrNull(listDomain.getUnitPrice())
                || !CheckUtil.isBlankOrNull(listDomain.getNetWeight())) {
//                || !CheckUtil.isBlankOrNull(listDomain.getQtyUnit())) { //Issue 091
                
                // Unary eye check
                // 単項目チェック
                String[] properties = { 
                    "kitComponentItemNm",
                    "qtyUnit",
                    "qty",
                    "unitPrice",
                    "netWeight"
                };
                valid.isValidateProperties(properties, SCREEN_ID_W1004);
                // Error check
                // エラー確認
                if (0 < valid.getErrList().size()) {
                    errList.addAll(valid.getErrList());
                }else{
                    sumKit += Double.valueOf(listDomain.getNetWeight()) * Double.valueOf(listDomain.getQty()) ;
                }
                
                //Issue 140
                if (updateDomain.getListDomainList().get(0).getCommercialFlg().equalsIgnoreCase("N")) {
                    if (!listDomain.getCommercialFlg().equalsIgnoreCase("N")) {
                        Object[] params = {
                            commonService.getResource(locale, "label.kitParent"),
                            commonService.getResource(locale, "label.invCategory")
                        };
                        errList.add(new MessageDomain("kitList[" + i + "].commercialFlg", NXS_E7_0162, params));
                    }
                }
            }
        }
        
        // Check N/W of Parrent have to be more than N/W of Kit. #Issue 076
        if( updateDomain.getListDomainList() != null &&  updateDomain.getListDomainList().size() > 0){
            W1004ListDomain result = updateDomain.getListDomainList().get(0);
            if(sumKit > (Double.parseDouble(result.getNetWeight()) * Double.parseDouble(result.getQty())))
            {
                for (int i = 0; i < updateDomain.getKitList().size(); i++) {
                    W1004KitListDomain listDomain = updateDomain.getKitList().get(i);
                    if (!CheckUtil.isBlankOrNull(listDomain.getKitComponentItemNm())
                        || !CheckUtil.isBlankOrNull(listDomain.getQty())
                        || !CheckUtil.isBlankOrNull(listDomain.getUnitPrice())
                        || !CheckUtil.isBlankOrNull(listDomain.getNetWeight())) {
                        errList.add(new MessageDomain("kitList[" + i + "].netWeight", NXS_E7_0159, null));
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
    protected void validateConsistency(W1004UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
  
    }

    /**
     * {@inheritDoc}.
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W1004UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
    }

    /**
     * {@inheritDoc}.
     * 
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W1004UpdateDomain callServices(W1004UpdateDomain updateDomain) 
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        return w1001ExpRequestService.transactOnKitDetailSave(updateDomain);
    }

}
