/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0011;

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

/**
 * The register service facade implementation class of Export Packaging Returnable PKG  Material
 * <br />Export Packaging Returnable PKG  MaterialのSaveAndDeleteFacadeサービス実装クラスです。
 * <pre>
 *
 * @author $Author: 810833843 $
 * @version $Revision: 10494 $
 */
public class W1009DeleteFacadeServiceImpl 
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
    public W1009DeleteFacadeServiceImpl() {
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
        
     // An error is used when one affair does not have effective line, either.
        // In the case only of the null line when all the line cuts are carried out
        // 有効行が1件もない場合エラーにする。
        // 全行削除されている場合または、空行のみの場合。
        boolean hasValidLine  = false;
        if (updateDomain.getListDomainList() == null || updateDomain.getListDomainList().isEmpty()) {
            hasValidLine = false;
        } else {
            for (W1009ListDomain domain : updateDomain.getListDomainList()) {
                if (!CheckUtil.isBlankOrNull(domain.getSelected())) {
                    hasValidLine = true;
                    break;
                }
            }
        }
        // When there is no effective line
        // 有効行がない場合
        if (!hasValidLine) {
            String[] params = {commonService.getResource(updateDomain.getLocale(), "label.del") };
            List <MessageDomain> errors = new ArrayList<MessageDomain>();
            errors.add(new MessageDomain(null, GSCM_E0_0011, params));
            throw new ValidationException(errors);
        }
        
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
        
        List<W1009ListDomain> w1009List = new ArrayList<W1009ListDomain>();
        
        for (W1009ListDomain w1009ListDomain : updateDomain.getListDomainList()) {
            if (!CheckUtil.isBlankOrNull(w1009ListDomain.getSelected()) && !CheckUtil.isBlankOrNull(w1009ListDomain.getExpRequestRtItemId())) {
                TwExpRequestPalletizeRtCriteriaDomain criteria = new TwExpRequestPalletizeRtCriteriaDomain();
                CommonUtil.copyPropertiesDomainToDomain(criteria, w1009ListDomain);
                twExpRequestPalletizeRtService.deleteByCondition(criteria);
            }else if(CheckUtil.isBlankOrNull(w1009ListDomain.getExpRequestRtItemId()) && CheckUtil.isBlankOrNull(w1009ListDomain.getSelected())){
                w1009List.add(w1009ListDomain);
            }
        }
        
        TwExpRequestPalletizeRtCriteriaDomain expRequestPltzRtCriteria = new TwExpRequestPalletizeRtCriteriaDomain();
        expRequestPltzRtCriteria.setExpRequestNo(updateDomain.getCriteriaDomain().getExpRequestNo());
        expRequestPltzRtCriteria.setPalletNo(updateDomain.getCriteriaDomain().getPalletNo());
        // Load Init
        List<TwExpRequestPalletizeRtDomain> resultList = twExpRequestPalletizeRtService.searchByCondition(expRequestPltzRtCriteria);

        for (TwExpRequestPalletizeRtDomain listDomain : resultList) {
            W1009ListDomain w1009ListDomain = new W1009ListDomain();
            CommonUtil.copyPropertiesDomainToDomain(w1009ListDomain, listDomain);
            w1009List.add(w1009ListDomain);
        }
        
        W1009UpdateDomain rtnDomain = new W1009UpdateDomain();
        rtnDomain.setListDomainList(w1009List);
        
        return rtnDomain;
    }

}