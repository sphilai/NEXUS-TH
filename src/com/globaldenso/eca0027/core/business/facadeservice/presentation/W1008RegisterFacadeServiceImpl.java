/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CASEMARK;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CD_TYPE_TRANS_CD;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_N;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FUNC_PALLETIZE_INSTRUCTION;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0024;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ISSUE_CML;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ITEM_TYP_PKG_MATERIALS;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.LANGUAGE_CD_ENGLISH;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0082;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0128;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0160;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PKG_FORM_TYP_MANUAL_REG;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PROGRESS_PKG;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W1008;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.TmCigmaWhXrefDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmExpShipToShippingDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmNxsCompDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmSupplierWhXrefDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtExpRequestDtlDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtExpRequestDtlKitDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TwExpRequestPalletizeRtDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCdCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaWhXrefCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpShipToShippingCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsCompCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmSupplierWhXrefCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestDtlCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestDtlKitCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TwExpRequestPalletizeRtCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TmCdService;
import com.globaldenso.eca0027.core.auto.business.service.TmCigmaWhXrefService;
import com.globaldenso.eca0027.core.auto.business.service.TmExpShipToShippingService;
import com.globaldenso.eca0027.core.auto.business.service.TmNxsCompService;
import com.globaldenso.eca0027.core.auto.business.service.TmSupplierWhXrefService;
import com.globaldenso.eca0027.core.auto.business.service.TtExpRequestDtlKitService;
import com.globaldenso.eca0027.core.auto.business.service.TtExpRequestDtlService;
import com.globaldenso.eca0027.core.auto.business.service.TwExpRequestPalletizeRtService;
import com.globaldenso.eca0027.core.business.domain.W1001ExpRequestDomain;
import com.globaldenso.eca0027.core.business.domain.W1007PltzWkDomain;
import com.globaldenso.eca0027.core.business.domain.W1008CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W1008ExpRequestDtlDomain;
import com.globaldenso.eca0027.core.business.domain.W1008ListDomain;
import com.globaldenso.eca0027.core.business.domain.W1008PltzDomain;
import com.globaldenso.eca0027.core.business.domain.W1008PltzItemDomain;
import com.globaldenso.eca0027.core.business.domain.W1008UpdateDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W1001ExpRequestCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W1007PltzWkCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W1008PltzCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W1008PltzItemCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W1001ExpRequestService;
import com.globaldenso.eca0027.core.business.service.W1007PltzWkService;
import com.globaldenso.eca0027.core.business.service.W1008PltzItemService;
import com.globaldenso.eca0027.core.business.service.W1008PltzService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.domain.TmUserDomain;
import com.globaldenso.gscm.framework.business.domain.criteria.TmUserCriteriaDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractTransactFacadeService;
import com.globaldenso.gscm.framework.business.service.TmUserService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.Validator;

/**
 * The Register service facade implementation class of action Export Packaging Register screen.
 * <br />荷揃え指示Register画面の登録facadeサービス実装クラスです。
 * <pre>
 * bean id:w1008RegisterFacadeService
 * </pre>
 *
 * @author $Author: DCS $
 * @version $Revision: 5446 $
 */
public class W1008RegisterFacadeServiceImpl extends
    AbstractTransactFacadeService<W1008UpdateDomain, W1008UpdateDomain> {
    /**
     * Variable format date.
     */
    protected DateFormat df = new SimpleDateFormat("yMMdd", Locale.ENGLISH);
    /**
     * W1008PltzService.
     */
    protected W1008PltzService w1008PltzService;
    /**
     * W1007PltzWkService.
     */
    protected W1007PltzWkService w1007PltzWkService;
    /**
     * W1001ExpRequestService.
     */
    protected W1001ExpRequestService w1001ExpRequestService;
    /**
     * TmExpShipToShippingService.
     */
    protected TmExpShipToShippingService tmExpShipToShippingService;
    /**
     * TwExpRequestPalletizeRtService.
     */
    protected TwExpRequestPalletizeRtService twExpRequestPalletizeRtService;
    /**
     * TmCigmaWhXrefService.
     */
    protected TmCigmaWhXrefService  tmCigmaWhXrefService;
    /**
     * TtExpRequestDtlService.
     */
    protected TtExpRequestDtlService ttExpRequestDtlService;
    /**
     * TtExpRequestDtlKitService.
     */
    protected TtExpRequestDtlKitService ttExpRequestDtlKitService;
    /**
     * W1008PltzItemService.
     */
    protected W1008PltzItemService w1008PltzItemService;
    /**
     * TmCd Service.
     */
    protected TmCdService tmCdService;
    /**
     * service of Supplier Company Master <br />
     */
    protected TmSupplierWhXrefService tmSupplierWhXrefService;
    /**
     * service of nxs Company <br />
     */
    protected TmNxsCompService tmNxsCompService;
    /**
     * service of user<br />
     */
    protected TmUserService tmUserService;
    /**
     * constructor.
     */
    public W1008RegisterFacadeServiceImpl() {
    }
   
    /**
     * <p>Setter method for tmCigmaWhXrefService.</p>
     *
     * @param tmCigmaWhXrefService Set for tmCigmaWhXrefService
     */
    public void setTmCigmaWhXrefService(TmCigmaWhXrefService tmCigmaWhXrefService) {
        this.tmCigmaWhXrefService = tmCigmaWhXrefService;
    }

    /**
     * <p>Setter method for tmUserService.</p>
     *
     * @param tmUserService Set for tmUserService
     */
    public void setTmUserService(TmUserService tmUserService) {
        this.tmUserService = tmUserService;
    }


    /**
     * <p>Setter method for tmNxsCompService.</p>
     *
     * @param tmNxsCompService Set for tmNxsCompService
     */
    public void setTmNxsCompService(TmNxsCompService tmNxsCompService) {
        this.tmNxsCompService = tmNxsCompService;
    }

    /**
     * <p>Setter method for tmSupplierWhXrefService.</p>
     *
     * @param tmSupplierWhXrefService Set for tmSupplierWhXrefService
     */
    public void setTmSupplierWhXrefService(TmSupplierWhXrefService tmSupplierWhXrefService) {
        this.tmSupplierWhXrefService = tmSupplierWhXrefService;
    }

    /**
     * <p>Setter method for tmCdService.</p>
     *
     * @param tmCdService Set for tmCdService
     */
    public void setTmCdService(TmCdService tmCdService) {
        this.tmCdService = tmCdService;
    }

    /**
     * <p>Setter method for w1007PltzWkService.</p>
     *
     * @param pltzWkService Set for w1007PltzWkService
     */
    public void setW1007PltzWkService(W1007PltzWkService pltzWkService) {
        w1007PltzWkService = pltzWkService;
    }

    /**
     * <p>Setter method for twExpRequestPalletizeRtService.</p>
     *
     * @param twExpRequestPalletizeRtService Set for twExpRequestPalletizeRtService
     */
    public void setTwExpRequestPalletizeRtService(
        TwExpRequestPalletizeRtService twExpRequestPalletizeRtService) {
        this.twExpRequestPalletizeRtService = twExpRequestPalletizeRtService;
    }

    /**
     * <p>Setter method for tmExpShipToShippingService.</p>
     *
     * @param tmExpShipToShippingService Set for tmExpShipToShippingService
     */
    public void setTmExpShipToShippingService(TmExpShipToShippingService tmExpShipToShippingService) {
        this.tmExpShipToShippingService = tmExpShipToShippingService;
    }

    /**
     * <p>Setter method for ttExpRequestDtlService.</p>
     *
     * @param ttExpRequestDtlService Set for ttExpRequestDtlService
     */
    public void setTtExpRequestDtlService(TtExpRequestDtlService ttExpRequestDtlService) {
        this.ttExpRequestDtlService = ttExpRequestDtlService;
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
     * <p>Setter method for w1001ExpRequestService.</p>
     *
     * @param expRequestService Set for w1001ExpRequestService
     */
    public void setW1001ExpRequestService(W1001ExpRequestService expRequestService) {
        w1001ExpRequestService = expRequestService;
    }

    /**
     * <p>Setter method for w1008PltzService.</p>
     *
     * @param pltzService Set for w1008PltzService
     */
    public void setW1008PltzService(W1008PltzService pltzService) {
        w1008PltzService = pltzService;
    }

    /**
     * <p>Setter method for w1008PltzItemService.</p>
     *
     * @param pltzItemService Set for w1008PltzItemService
     */
    public void setW1008PltzItemService(W1008PltzItemService pltzItemService) {
        w1008PltzItemService = pltzItemService;
    }
    /**
     * {@inheritDoc}
     * <pre>
     * Check selection of detail line.
     * </pre>
     * <pre>
     * 明細行選択チェック
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W1008UpdateDomain filterDomain(W1008UpdateDomain argDomain)
        throws GscmApplicationException, ApplicationException {
        // TODO Auto-generated method stub
        return argDomain;
    }
    /**
     * {@inheritDoc}
     * <pre>
     * No action.
     * </pre> 
     * <pre>
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W1008UpdateDomain filterDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // TODO Auto-generated method stub
        
    }
    /**
     * {@inheritDoc}
     * <pre>
     * No action.
     * </pre> 
     * <pre>
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W1008UpdateDomain filterDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        List<MessageDomain> errList = new ArrayList<MessageDomain>();
        // Search Exp Request
        // The information from a screen is set to criteria.
        W1001ExpRequestCriteriaDomain w1001ExpRequestCriteriaDomain = new W1001ExpRequestCriteriaDomain();
        w1001ExpRequestCriteriaDomain.setExpRequestNo(filterDomain.getCriteriaDomain().getExpRequestNo());
        w1001ExpRequestCriteriaDomain.setLanguageCd(filterDomain.getCriteriaDomain().getLanguageCd());        
        W1001ExpRequestDomain w1001ExpRequestDomain = (W1001ExpRequestDomain)w1001ExpRequestService.searchByKeyForChange(w1001ExpRequestCriteriaDomain);
        
        if(w1001ExpRequestDomain != null ){
            TmExpShipToShippingCriteriaDomain tmExpShipToShippingCriteriaDomain = new TmExpShipToShippingCriteriaDomain();
            tmExpShipToShippingCriteriaDomain.setCompCd(filterDomain.getCriteriaDomain().getShipperCd());
            tmExpShipToShippingCriteriaDomain.setShipToCd(filterDomain.getCriteriaDomain().getShipToCd());
            tmExpShipToShippingCriteriaDomain.setLanguageCd(filterDomain.getCriteriaDomain().getLanguageCd()); 
            tmExpShipToShippingCriteriaDomain.setContainerSortingKey(w1001ExpRequestDomain.getContainerSortingKey());
            TmExpShipToShippingDomain  tmExpShipToShippingDomain = tmExpShipToShippingService.searchContainerKeyByCondition(tmExpShipToShippingCriteriaDomain);
            
            if( tmExpShipToShippingDomain == null || tmExpShipToShippingDomain.getContainerLooseTyp() == null || tmExpShipToShippingDomain.getCustomTimingTyp() == null || tmExpShipToShippingDomain.getContainerLooseTyp().trim().length() == 0 || tmExpShipToShippingDomain.getCustomTimingTyp().trim().length() == 0){
                MessageDomain msgUpdateStatus = new MessageDomain("", NXS_E7_0128, null);
                errList.add(msgUpdateStatus);
            }
        }else{
            MessageDomain msgUpdateStatus = new MessageDomain("", NXS_E7_0128, null);
            errList.add(msgUpdateStatus); 
        }
        
        
        
        // Error check
        // エラー確認
        if (0 < errList.size()) {
            throw new ValidationException(errList);
        }
        
        /// ##issue 040
        if(w1001ExpRequestDomain != null && w1001ExpRequestDomain.getDensoShipperTyp() != null && w1001ExpRequestDomain.getDensoShipperTyp().equalsIgnoreCase("Y"))
        {
            /// TwExpRequestPalletizeRt===================================
            TwExpRequestPalletizeRtCriteriaDomain twExpRequestPalletizeRtCriteriaDomain = new TwExpRequestPalletizeRtCriteriaDomain();
            twExpRequestPalletizeRtCriteriaDomain.setExpRequestNo(filterDomain.getCriteriaDomain().getExpRequestNo());
            twExpRequestPalletizeRtCriteriaDomain.setPalletNo(filterDomain.getCriteriaDomain().getPalletNo());
            twExpRequestPalletizeRtCriteriaDomain.setLanguageCd(filterDomain.getCriteriaDomain().getLanguageCd());
            twExpRequestPalletizeRtCriteriaDomain.setOwnerComp(filterDomain.getCriteriaDomain().getOwnerComp());
            // Search by condition
            List<TwExpRequestPalletizeRtDomain> twExpRequestPalletizeRtDomainList = twExpRequestPalletizeRtService.searchJoinPackageMaterialByCondition(twExpRequestPalletizeRtCriteriaDomain);
            if((filterDomain.getCriteriaDomain().getRtPage() == null && (twExpRequestPalletizeRtDomainList == null || twExpRequestPalletizeRtDomainList.size() == 0 )) || (filterDomain.getCriteriaDomain().getRtPage().trim().length() == 0 && (twExpRequestPalletizeRtDomainList == null || twExpRequestPalletizeRtDomainList.size() == 0 )))
            {
                MessageDomain msgUpdateStatus = new MessageDomain("", NXS_E7_0160, null);
                errList.add(msgUpdateStatus);
            }
            // Error check
            // エラー確認
            if (0 < errList.size()) {
                throw new ValidationException(errList);
            } 
            /// end TwExpRequestPalletizeRt===================================
        }
    }
    /**
     * {@inheritDoc}
     * <pre>
     * No action.
     * </pre> 
     * <pre>
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W1008UpdateDomain filterDomain) throws GscmApplicationException,
        ValidationException, ApplicationException {
        Validator<W1008CriteriaDomain> valid = new Validator<W1008CriteriaDomain>(filterDomain.getCriteriaDomain(), "w1008CriteriaDomain");
        List<MessageDomain> errList = new ArrayList<MessageDomain>();
        String[] properties = {
            "length", "width", "height", "grossWeight", "supplierMainMark" 
        };
        valid.isValidateProperties(properties, SCREEN_ID_W1008);
        
        // Error check
        // エラー確認
        if (0 < valid.getErrList().size()) {
            throw new ValidationException(valid.getErrList());
        }
     
        if(!isNumeric(filterDomain.getCriteriaDomain().getLength())){
            // Setting error mesage
            Object[] obj = new Object[10];
            obj[0] = "Length";
            MessageDomain msgUpdateStatus = new MessageDomain("", GSCM_E0_0024, obj);
            errList.add(msgUpdateStatus);
        }
        if(!isNumeric(filterDomain.getCriteriaDomain().getWidth())){
            // Setting error mesage
            Object[] obj = new Object[10];
            obj[0] = "Width";
            MessageDomain msgUpdateStatus = new MessageDomain("", GSCM_E0_0024, obj);
            errList.add(msgUpdateStatus);
        }
        if(!isNumeric(filterDomain.getCriteriaDomain().getHeight())){
            // Setting error mesage
            Object[] obj = new Object[10];
            obj[0] = "Height";
            MessageDomain msgUpdateStatus = new MessageDomain("", GSCM_E0_0024, obj);
            errList.add(msgUpdateStatus);
        }
        if(!isNumeric(filterDomain.getCriteriaDomain().getGrossWeight())){
            // Setting error mesage
            Object[] obj = new Object[10];
            obj[0] = "GrossWeight";
            MessageDomain msgUpdateStatus = new MessageDomain("", GSCM_E0_0024, obj);
            errList.add(msgUpdateStatus);
        }
        
        // Validate  netWeight  must be less than grossWeight
        if(isNumeric(filterDomain.getCriteriaDomain().getGrossWeight()) && isNumeric(filterDomain.getCriteriaDomain().getNetWeight()) ){
            double grossWeight = Double.parseDouble(filterDomain.getCriteriaDomain().getGrossWeight()) ;
            double netWeight = Double.parseDouble(filterDomain.getCriteriaDomain().getNetWeight()) ;
            if(netWeight > grossWeight)
            {
                // Setting error mesage
                Object[] obj = new Object[10];
                MessageDomain msgUpdateStatus = new MessageDomain("", NXS_E7_0082, obj);
                errList.add(msgUpdateStatus);
            }
        }
        // Error check
        // エラー確認
        if (0 < errList.size()) {
            throw new ValidationException(errList);
        }
    }
    /**
     * {@inheritDoc}
     * <pre>
     * No action.
     * </pre> 
     * <pre>
     * 処理なし
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W1008UpdateDomain callServices(W1008UpdateDomain filterDomain) throws GscmApplicationException,
        ApplicationException {
        HashMap<String, String> expRequest = new HashMap<String, String>();
        String keyString = null;
        // Search TM_EXP_SHIP_TO_SHIPPING
        
        // Search Exp Request
        // The information from a screen is set to criteria.
        W1001ExpRequestCriteriaDomain w1001ExpRequestCriteriaDomain = new W1001ExpRequestCriteriaDomain();
        w1001ExpRequestCriteriaDomain.setExpRequestNo(filterDomain.getCriteriaDomain().getExpRequestNo());
        w1001ExpRequestCriteriaDomain.setLanguageCd(filterDomain.getCriteriaDomain().getLanguageCd());        
        W1001ExpRequestDomain ttExpRequestDomain = (W1001ExpRequestDomain)w1001ExpRequestService.searchByKeyForChange(w1001ExpRequestCriteriaDomain);
        
        
        if(ttExpRequestDomain != null)
        {
            // The information from a screen is set to criteria.
            TmExpShipToShippingCriteriaDomain tmExpShipToShippingCriteriaDomain = new TmExpShipToShippingCriteriaDomain();
            tmExpShipToShippingCriteriaDomain.setCompCd(ttExpRequestDomain.getShipperCd());
            tmExpShipToShippingCriteriaDomain.setShipToCd(ttExpRequestDomain.getShipToCd());
            tmExpShipToShippingCriteriaDomain.setLanguageCd(filterDomain.getCriteriaDomain().getLanguageCd()); 
            tmExpShipToShippingCriteriaDomain.setContainerSortingKey(ttExpRequestDomain.getContainerSortingKey());
            TmExpShipToShippingDomain  tmExpShipToShippingDomain = tmExpShipToShippingService.searchContainerKeyByCondition(tmExpShipToShippingCriteriaDomain);
            
            TmNxsCompCriteriaDomain tmNxsCompCriteriaDomain = new TmNxsCompCriteriaDomain();
            tmNxsCompCriteriaDomain.setCompCd(ttExpRequestDomain.getShipperCd());
            TmNxsCompDomain tmNxsCompDomain = tmNxsCompService.searchByKey(tmNxsCompCriteriaDomain);
            
            // Issue 099
            filterDomain.getCriteriaDomain().setLengthUnit(filterDomain.getCriteriaDomain().getLengthUnitHeader());
            
            TmUserCriteriaDomain tmUserCriteriaDomain = new TmUserCriteriaDomain();
            tmUserCriteriaDomain.setDscId(filterDomain.getLoginUserDscId());
            TmUserDomain tmUserDomain = tmUserService.searchByKey(tmUserCriteriaDomain);
            
            ///TmSupplierWhXrefCriteriaDomain  ===================================
            TmSupplierWhXrefCriteriaDomain tmSupplierWhXrefCriteriaDomain = new TmSupplierWhXrefCriteriaDomain();
            tmSupplierWhXrefCriteriaDomain.setCompCd(ttExpRequestDomain.getNexusWhCom());
            tmSupplierWhXrefCriteriaDomain.setWhCd(ttExpRequestDomain.getPackingWhCd());
            tmSupplierWhXrefCriteriaDomain.setSupplierCompCd(ttExpRequestDomain.getShipperCd());
            List<TmSupplierWhXrefDomain> tmSupplierWhXrefDomainList = tmSupplierWhXrefService.searchByCondition(tmSupplierWhXrefCriteriaDomain);
            
            ///TmSupplierWhXrefCriteriaDomain  ===================================
            TmCigmaWhXrefCriteriaDomain tmCigmaWhXrefCriteriaDomain = new TmCigmaWhXrefCriteriaDomain();
            tmCigmaWhXrefCriteriaDomain.setCompCd(ttExpRequestDomain.getNexusWhCom());
            tmCigmaWhXrefCriteriaDomain.setWhCd(ttExpRequestDomain.getPackingWhCd());
            tmCigmaWhXrefCriteriaDomain.setLgcyLibCompCd (ttExpRequestDomain.getShipperCd());
            List<TmCigmaWhXrefDomain> tmCigmaWhXrefDomainList = tmCigmaWhXrefService.searchByCondition(tmCigmaWhXrefCriteriaDomain);
            
            
            /// TwExpRequestPalletizeRt===================================
            TwExpRequestPalletizeRtCriteriaDomain twExpRequestPalletizeRtCriteriaDomain = new TwExpRequestPalletizeRtCriteriaDomain();
            twExpRequestPalletizeRtCriteriaDomain.setExpRequestNo(filterDomain.getCriteriaDomain().getExpRequestNo());
            twExpRequestPalletizeRtCriteriaDomain.setPalletNo(filterDomain.getCriteriaDomain().getPalletNo());
            twExpRequestPalletizeRtCriteriaDomain.setLanguageCd(filterDomain.getCriteriaDomain().getLanguageCd());
            //UT458 Start Issue Register CML, then have many RT 15/07/2016
            twExpRequestPalletizeRtCriteriaDomain.setOwnerComp(ttExpRequestDomain.getShipperCd());
            //UT458 End
            // Search by condition
            List<TwExpRequestPalletizeRtDomain> twExpRequestPalletizeRtDomainList = twExpRequestPalletizeRtService.searchJoinPackageMaterialByCondition(twExpRequestPalletizeRtCriteriaDomain);
            /// end TwExpRequestPalletizeRt===================================
            
            W1008PltzDomain domain = new W1008PltzDomain();
            // Setting to save
            domain.setMainMark(generateCMLNo(ttExpRequestDomain.getShipperCd() , ttExpRequestDomain.getPackingWhCd())); // is not null
            domain.setPalletNo(filterDomain.getCriteriaDomain().getPalletNo());
            filterDomain.getCriteriaDomain().setPreviousPallet(filterDomain.getCriteriaDomain().getPalletNo()); //Issue 072
            domain.setShipperCd(ttExpRequestDomain.getShipperCd());
            
            //Issue 089
            if (ttExpRequestDomain.getTrnsCd().trim().length() > 1) {
                TmCdCriteriaDomain tmCdCriteria = new TmCdCriteriaDomain();
                tmCdCriteria.setCdTyp(CD_TYPE_TRANS_CD);
                tmCdCriteria.setLngCd(LANGUAGE_CD_ENGLISH);
                tmCdCriteria.setValue(ttExpRequestDomain.getTrnsCd());
                
                domain.setTrnsCd(tmCdService.searchByCondition(tmCdCriteria).get(0).getCd());
            }else{
                domain.setTrnsCd(ttExpRequestDomain.getTrnsCd());
            }
            
            if(ttExpRequestDomain.getContainerSortingKey() == null){
                domain.setContainerSortingKey(" ");
            }else{
                domain.setContainerSortingKey(ttExpRequestDomain.getContainerSortingKey());
            }
            
            domain.setWeightUnit(filterDomain.getCriteriaDomain().getWeightUnit());
            if(filterDomain.getCriteriaDomain().getNetWeight() == null || filterDomain.getCriteriaDomain().getNetWeight().trim().length() == 0){
                domain.setNetWeight(new BigDecimal(0));
            }else{
                domain.setNetWeight(new BigDecimal(filterDomain.getCriteriaDomain().getNetWeight()));
            }
            if(filterDomain.getCriteriaDomain().getGrossWeight() == null || filterDomain.getCriteriaDomain().getGrossWeight().trim().length() == 0){
                domain.setGrossWeight(new BigDecimal(0));
            }else{
                domain.setGrossWeight(new BigDecimal(filterDomain.getCriteriaDomain().getGrossWeight()));
            }
            if(filterDomain.getCriteriaDomain().getHeight() == null || filterDomain.getCriteriaDomain().getHeight().trim().length() == 0 ){
                domain.setHeight(null);
            }else{
                domain.setHeight(new BigDecimal(filterDomain.getCriteriaDomain().getHeight()));
            }
            if(filterDomain.getCriteriaDomain().getWidth() == null || filterDomain.getCriteriaDomain().getWidth().trim().length() == 0){
                domain.setWidth(null);
            }else{
                domain.setWidth(new BigDecimal(filterDomain.getCriteriaDomain().getWidth()));
            }
            if(filterDomain.getCriteriaDomain().getLength() == null || filterDomain.getCriteriaDomain().getLength().trim().length() == 0 ){
                domain.setLength(null);
            }else{
                domain.setLength(new BigDecimal(filterDomain.getCriteriaDomain().getLength()));
            }
            domain.setSupplierMainMark(filterDomain.getCriteriaDomain().getSupplierMainMark());
            domain.setCmlTyp("3");
            domain.setExpPackingIssuerId(filterDomain.getCriteriaDomain().getLoginUserDscId());
            domain.setExpPackingIssuerNm(tmUserDomain.getUsrNmEn());
            domain.setDueDt(ttExpRequestDomain.getDueDt());
            domain.setPltzStatus("10");
            if(ttExpRequestDomain.getCustomerShipTo() != null && ttExpRequestDomain.getCustomerShipTo().length() > 0)
            {
                domain.setLgcyShipTo(ttExpRequestDomain.getCustomerShipTo().trim());  //Set LegacyShipto in CustomerShipto [W1002]
            }else{
                domain.setLgcyShipTo(" ");
            }
            
            //domain.setStgInstrItemFlg(ttExpRequestDomain.getStagingInstructionFlg());
            domain.setPkgFormTyp(PKG_FORM_TYP_MANUAL_REG);
            domain.setVariantFlg(FLAG_N);
            domain.setReviseFlg(FLAG_N);
           
            if(twExpRequestPalletizeRtDomainList != null && twExpRequestPalletizeRtDomainList.size() > 0){
                domain.setRtUseFlg("Y"); ///contain RT is Y
            }else{
                domain.setRtUseFlg(FLAG_N); 
            }
            domain.setLengthUnit(tmNxsCompDomain.getLengthUnit());
            domain.setVolumeUnit(tmNxsCompDomain.getVolumeUnit());
            domain.setCommercialFlg("Y");
            domain.setTradeTerms(ttExpRequestDomain.getTradeTerms());
            domain.setExpLimitFlg(FLAG_N );
            domain.setPriceTerms(ttExpRequestDomain.getPriceTerms());
            domain.setPayMeth(ttExpRequestDomain.getPayMeth());
            domain.setPayTerms(ttExpRequestDomain.getPayTerms());
            domain.setSupplierInvoiceNo(ttExpRequestDomain.getSupplierInvoiceNo());
            domain.setImpInvoiceNo1(ttExpRequestDomain.getImpInvoiceNo1());
            domain.setImpInvoiceNo2(ttExpRequestDomain.getImpInvoiceNo2());
            domain.setFreightResponsibleCd(ttExpRequestDomain.getFreightResponsibleCd());
            domain.setMigrationFlg(FLAG_N);
            if(ttExpRequestDomain.getReExpGoodsFlg() != null && ttExpRequestDomain.getReExpGoodsFlg().trim().length() > 0)
            {
                domain.setReExpGoodsFlg(ttExpRequestDomain.getReExpGoodsFlg());
            }else{
                domain.setReExpGoodsFlg(" ");
            }
            
            // ##ISSUE 151
            String invoiceType = getInvoiceType(filterDomain.getListDomainList(), filterDomain.getCriteriaDomain().getExpRequestNo(), filterDomain.getCriteriaDomain().getLanguageCd() );
            domain.setInvoiceCtgry(invoiceType);
            
            if(ttExpRequestDomain.getSplitShippingNgFlg() != null && ttExpRequestDomain.getSplitShippingNgFlg().trim().length() > 0)
            {
                domain.setSplitShippingNgFlg(ttExpRequestDomain.getSplitShippingNgFlg());
            }else{
                domain.setSplitShippingNgFlg(" ");
            }
            if(ttExpRequestDomain.getCurrCd() != null && ttExpRequestDomain.getCurrCd().trim().length() > 0)
            {
                domain.setCurrCd(ttExpRequestDomain.getCurrCd());
            }else{
                domain.setCurrCd(" ");
            }
            if(ttExpRequestDomain.getConsigneeCd() != null && ttExpRequestDomain.getConsigneeCd().trim().length() > 0)
            {
                domain.setConsigneeCd(ttExpRequestDomain.getConsigneeCd());
            }else{
                domain.setConsigneeCd(" ");
            }
           
            if(ttExpRequestDomain.getTrnsCd() != null && ttExpRequestDomain.getTrnsCd().trim().length() > 0)
            {
                domain.setTrnsCdOrg(ttExpRequestDomain.getTrnsCd());
            }else{
                domain.setTrnsCdOrg(" ");
            }
           
            
            if(ttExpRequestDomain.getPackingCompCd() == null || ttExpRequestDomain.getPackingCompCd().trim().length() == 0){
                domain.setPackingWhCompCd(" ");
            }else{
                domain.setPackingWhCompCd(ttExpRequestDomain.getPackingCompCd());
            }
            if(ttExpRequestDomain.getPackingWhCd() == null || ttExpRequestDomain.getPackingWhCd().trim().length() == 0 ){
                domain.setPackingWhCd(" ");
            }else{
                domain.setPackingWhCd(ttExpRequestDomain.getPackingWhCd());
            }
            if(ttExpRequestDomain.getPackingCompCd() == null || ttExpRequestDomain.getPackingCompCd().trim().length() == 0){
                domain.setCurWhCompCd(" ");
            }else{
                domain.setCurWhCompCd(ttExpRequestDomain.getPackingCompCd());
            }
            if(ttExpRequestDomain.getPackingWhCd() == null || ttExpRequestDomain.getPackingWhCd().trim().length() == 0){
                domain.setCurWhCd(" ");
            }else{
                domain.setCurWhCd(ttExpRequestDomain.getPackingWhCd());
            }
            domain.setDngrItemFlg(isExitsDangerFlag(filterDomain.getListDomainList())); // EXP_REQ_DTL_ITEM.DNGR_GOODS_CD 
            domain.setExpRequestNo(filterDomain.getCriteriaDomain().getExpRequestNo());
            domain.setComCreateFuncId(filterDomain.getScreenId());
            domain.setComCreateUserId(filterDomain.getLoginUserDscId());
            domain.setComUpdateFuncId(filterDomain.getScreenId());
            domain.setComUpdateUserId(filterDomain.getLoginUserDscId());
            domain.setExpPackingDt(new Date());
            domain.setShipToCd(ttExpRequestDomain.getShipToCd());
            domain.setCustomerCd(ttExpRequestDomain.getCustomerCd());
            // ##Issue 112 
            if(ttExpRequestDomain.getLoadingCd() == null || ttExpRequestDomain.getLoadingCd().trim().length() <= 0)
            {
                domain.setLoadingCd(" ");
            }else{
                domain.setLoadingCd(ttExpRequestDomain.getLoadingCd());
            }
            
            if(filterDomain.getCriteriaDomain().getVolume() == null || filterDomain.getCriteriaDomain().getVolume().trim().length() == 0){
                domain.setVolume(new BigDecimal(0));
            }else{
                domain.setVolume(new BigDecimal(filterDomain.getCriteriaDomain().getVolume()));
            }
            if(filterDomain.getCriteriaDomain().getOuterPkgCd() == null || filterDomain.getCriteriaDomain().getOuterPkgCd().trim().length() == 0){
                domain.setOuterPkgCd(" ");
            }else{
                domain.setOuterPkgCd(filterDomain.getCriteriaDomain().getOuterPkgCd());
            }
            
            
            // Set custom_timing_typ  and container_loose_typ 
            if(ttExpRequestDomain.getTrnsCd() != null && "A".equalsIgnoreCase(ttExpRequestDomain.getTrnsCd()))
            {
                domain.setCustomTimingTyp("Z");
                domain.setContainerLooseTyp("L");
                domain.setStgInstrItemFlg("Y");
            }else{
                if(tmExpShipToShippingDomain != null)
                {
                    domain.setCustomTimingTyp(tmExpShipToShippingDomain.getCustomTimingTyp());
                    domain.setContainerLooseTyp(tmExpShipToShippingDomain.getContainerLooseTyp());
                }else{
                    domain.setCustomTimingTyp(" ");
                    domain.setContainerLooseTyp(" ");
                }
                //Set
                domain.setStgInstrItemFlg(ttExpRequestDomain.getStagingInstructionFlg());
            }
            //#ISSUE 115
            if(tmNxsCompDomain != null)
            {
                domain.setShipperCompNmAbb(tmNxsCompDomain.getCompNmAbb());
                domain.setShipperCompNm1(tmNxsCompDomain.getPrintCompNm1());
                domain.setShipperCompNm2(tmNxsCompDomain.getPrintCompNm2());
                domain.setShipperCompAddr1(tmNxsCompDomain.getPrintCompAddr1());
                domain.setShipperCompAddr2(tmNxsCompDomain.getPrintCompAddr2());
                domain.setShipperCompAddr3(tmNxsCompDomain.getPrintCompAddr3());
                domain.setShipperCompAddr4(tmNxsCompDomain.getPrintCompAddr4());
                domain.setShipperCompTel(tmNxsCompDomain.getCompTel());
                domain.setShipperCompFax(tmNxsCompDomain.getCompFax());
            }
            //#ISSUE 115
            if(ttExpRequestDomain.getConsigneeCompNm() != null && ttExpRequestDomain.getConsigneeCompNm().length() > 0)
            {
                if(ttExpRequestDomain.getConsigneeCompNm().length() > 30 &&  ttExpRequestDomain.getConsigneeCompNm().length() <= 60)
                {
                    domain.setConsigneeCompNm1(ttExpRequestDomain.getConsigneeCompNm().substring(0, 30));
                    domain.setConsigneeCompNm2(ttExpRequestDomain.getConsigneeCompNm().substring(30 , ttExpRequestDomain.getConsigneeCompNm().length()));
                }else if(ttExpRequestDomain.getConsigneeCompNm().length() <= 30){ //Issue 148
                    domain.setConsigneeCompNm1(ttExpRequestDomain.getConsigneeCompNm());
                }else{
                    domain.setConsigneeCompNm1(ttExpRequestDomain.getConsigneeCompNm().substring(0, 30));
                    domain.setConsigneeCompNm2(ttExpRequestDomain.getConsigneeCompNm().substring(30 , 60));
               
                }
            }
            if(ttExpRequestDomain.getConsigneeCompAddr() != null && ttExpRequestDomain.getConsigneeCompAddr().length() > 0)
            {
                if(ttExpRequestDomain.getConsigneeCompAddr().length() > 35)
                {
                    if(ttExpRequestDomain.getConsigneeCompAddr().length() > 35 &&  ttExpRequestDomain.getConsigneeCompAddr().length() <= 70)
                    {
                        domain.setConsigneeCompAddr1(ttExpRequestDomain.getConsigneeCompAddr().substring(0, 35));
                        domain.setConsigneeCompAddr2(ttExpRequestDomain.getConsigneeCompAddr().substring(35, ttExpRequestDomain.getConsigneeCompAddr().length()));
                    }else if(ttExpRequestDomain.getConsigneeCompAddr().length() > 70 &&  ttExpRequestDomain.getConsigneeCompAddr().length() <= 105)
                    {
                        domain.setConsigneeCompAddr1(ttExpRequestDomain.getConsigneeCompAddr().substring(0, 35));
                        domain.setConsigneeCompAddr2(ttExpRequestDomain.getConsigneeCompAddr().substring(35, 70));
                        domain.setConsigneeCompAddr3(ttExpRequestDomain.getConsigneeCompAddr().substring(70, ttExpRequestDomain.getConsigneeCompAddr().length()));
                    }else if(ttExpRequestDomain.getConsigneeCompAddr().length() > 105 &&  ttExpRequestDomain.getConsigneeCompAddr().length() <= 135)
                    {
                        domain.setConsigneeCompAddr1(ttExpRequestDomain.getConsigneeCompAddr().substring(0, 35));
                        domain.setConsigneeCompAddr2(ttExpRequestDomain.getConsigneeCompAddr().substring(35, 70));
                        domain.setConsigneeCompAddr3(ttExpRequestDomain.getConsigneeCompAddr().substring(70, 105));
                        domain.setConsigneeCompAddr4(ttExpRequestDomain.getConsigneeCompAddr().substring(105, ttExpRequestDomain.getConsigneeCompAddr().length()));
                    }else{
                        domain.setConsigneeCompAddr1(ttExpRequestDomain.getConsigneeCompAddr().substring(0, 35));
                        domain.setConsigneeCompAddr2(ttExpRequestDomain.getConsigneeCompAddr().substring(35, 70));
                        domain.setConsigneeCompAddr3(ttExpRequestDomain.getConsigneeCompAddr().substring(70, 105));
                        domain.setConsigneeCompAddr4(ttExpRequestDomain.getConsigneeCompAddr().substring(105, 135));
                    }
                }else{
                    domain.setConsigneeCompAddr1(ttExpRequestDomain.getConsigneeCompAddr());
                }
            }
            domain.setConsigneeCompTel(ttExpRequestDomain.getConsigneeCompTel());
            domain.setConsigneeCompFax(" ");
            
            //domain.setConsigneeAttn(ttExpRequestDomain.getShipToAttnNm()); ##ISSUE 171
            
            if(ttExpRequestDomain.getShipToCompNm() != null && ttExpRequestDomain.getShipToCompNm().length() > 0)
            {
                
                if(ttExpRequestDomain.getShipToCompNm().length() > 30 &&  ttExpRequestDomain.getShipToCompNm().length() <= 60)
                {
                    domain.setShipToNm1(ttExpRequestDomain.getShipToCompNm().substring(0, 30));
                    domain.setShipToNm2(ttExpRequestDomain.getShipToCompNm().substring(30 , ttExpRequestDomain.getShipToCompNm().length()));
                }else if( ttExpRequestDomain.getShipToCompNm().length() <= 30){
                    domain.setShipToNm1(ttExpRequestDomain.getShipToCompNm());
                }else{
                    domain.setShipToNm1(ttExpRequestDomain.getShipToCompNm().substring(0, 30));
                    domain.setShipToNm2(ttExpRequestDomain.getShipToCompNm().substring(30 , 60));
                }
            }
            if(ttExpRequestDomain.getShipToCompAddr() != null && ttExpRequestDomain.getShipToCompAddr().length() > 0)
            {
                if(ttExpRequestDomain.getShipToCompAddr().length() > 35)
                {
                    if(ttExpRequestDomain.getShipToCompAddr().length() > 35 &&  ttExpRequestDomain.getShipToCompAddr().length() <= 70)
                    {
                        domain.setShipToAddr1(ttExpRequestDomain.getShipToCompAddr().substring(0, 35));
                        domain.setShipToAddr2(ttExpRequestDomain.getShipToCompAddr().substring(35, ttExpRequestDomain.getShipToCompAddr().length()));
                    }else if(ttExpRequestDomain.getShipToCompAddr().length() > 70 &&  ttExpRequestDomain.getShipToCompAddr().length() <= 105)
                    {
                        domain.setShipToAddr1(ttExpRequestDomain.getShipToCompAddr().substring(0, 35));
                        domain.setShipToAddr2(ttExpRequestDomain.getShipToCompAddr().substring(35, 70));
                        domain.setShipToAddr3(ttExpRequestDomain.getShipToCompAddr().substring(70, ttExpRequestDomain.getShipToCompAddr().length()));
                    }else if(ttExpRequestDomain.getShipToCompAddr().length() > 105  && ttExpRequestDomain.getShipToCompAddr().length() <= 135)
                    {
                        domain.setShipToAddr1(ttExpRequestDomain.getShipToCompAddr().substring(0, 35));
                        domain.setShipToAddr2(ttExpRequestDomain.getShipToCompAddr().substring(35, 70));
                        domain.setShipToAddr3(ttExpRequestDomain.getShipToCompAddr().substring(70, 105) );
                        domain.setShipToAddr4(ttExpRequestDomain.getShipToCompAddr().substring(105, ttExpRequestDomain.getShipToCompAddr().length()));
                    }else{
                        domain.setShipToAddr1(ttExpRequestDomain.getShipToCompAddr().substring(0, 35));
                        domain.setShipToAddr2(ttExpRequestDomain.getShipToCompAddr().substring(35, 70));
                        domain.setShipToAddr3(ttExpRequestDomain.getShipToCompAddr().substring(70, 105));
                        domain.setShipToAddr4(ttExpRequestDomain.getShipToCompAddr().substring(105, 135));
                    }
                }else{
                    domain.setShipToAddr1(ttExpRequestDomain.getShipToCompAddr());
                }
            }
            
            
            domain.setShipToTel(ttExpRequestDomain.getShipToCompTel());
            //end #ISSUE 115
            
            //## ISSUE 137
            if(ttExpRequestDomain.getDensoShipperTyp() != null &&  ttExpRequestDomain.getDensoShipperTyp().equalsIgnoreCase("Y"))
            {
                if(tmCigmaWhXrefDomainList != null && tmCigmaWhXrefDomainList.size() > 0)
                {
                    TmCigmaWhXrefDomain result = tmCigmaWhXrefDomainList.get(0);
                    if(result.getLgcyWhCd() != null && result.getLgcyWhCd().trim().length() > 0)
                    {
                        domain.setLgcyWhCd(result.getLgcyWhCd());
                        domain.setCurLgcyWhCd (result.getLgcyWhCd());
                    }else{
                        domain.setLgcyWhCd(" ");
                        domain.setCurLgcyWhCd (" ");
                    }
                }else{
                    domain.setLgcyWhCd(" "); // is not null
                    domain.setCurLgcyWhCd (" ");
                }
            }else if(ttExpRequestDomain.getDensoShipperTyp() != null &&  ttExpRequestDomain.getDensoShipperTyp().equalsIgnoreCase("N"))
            {
                if(tmSupplierWhXrefDomainList != null && tmSupplierWhXrefDomainList.size() > 0)
                {
                    TmSupplierWhXrefDomain result = tmSupplierWhXrefDomainList.get(0);
                    if(result.getSupplierWhCd() != null && result.getSupplierWhCd().trim().length() > 0)
                    {
                        domain.setLgcyWhCd(result.getSupplierWhCd());
                        domain.setCurLgcyWhCd(result.getSupplierWhCd());
                    }else{
                        domain.setLgcyWhCd(" ");
                        domain.setCurLgcyWhCd (" ");
                    }
                }else{
                    domain.setLgcyWhCd(" "); // is not null
                    domain.setCurLgcyWhCd (" ");
                }
            }else{
                domain.setLgcyWhCd(" "); // is not null
                domain.setCurLgcyWhCd (" ");
            }
            
            
            
            domain.setPackingType(filterDomain.getCriteriaDomain().getPackingType());
            domain.setPlntCd(ttExpRequestDomain.getPlantCd());
           
            domain.setExpRequestAllCmlIssuedFlg("N"); // is not null
            
            
            domain.setLastTrStatus("10");
            
            
            
            // Save
            w1008PltzService.create(domain);
            List<W1008PltzItemDomain> parentList = new ArrayList<W1008PltzItemDomain>();
            HashMap mapParent = new HashMap();
            if(filterDomain.getListDomainList() != null && filterDomain.getListDomainList().size() > 0)
            {
                int seq = 1;
                for(W1008ListDomain w1008ListDomain : filterDomain.getListDomainList())
                {
                    // Setting to save
                    W1008PltzItemDomain itemDomain = new W1008PltzItemDomain();
                    TtExpRequestDtlDomain result = null;
                    List<TtExpRequestDtlKitDomain> resultList = new ArrayList<TtExpRequestDtlKitDomain>();
                    // Exp Request DTL
                    if(w1008ListDomain.getLineNo() != null && w1008ListDomain.getLineNo().intValue() > 0 )
                    {
                        // The information from a screen is set to criteria.
                        TtExpRequestDtlCriteriaDomain criteria = new TtExpRequestDtlCriteriaDomain();
                        criteria.setExpRequestNo(filterDomain.getCriteriaDomain().getExpRequestNo());
                        criteria.setLineNo(w1008ListDomain.getLineNo());
                        criteria.setExpRequestItemId(new BigDecimal(w1008ListDomain.getExpRequestItemId()));
                        criteria.setLanguageCd(filterDomain.getCriteriaDomain().getLanguageCd());
                        // Search by key
                        result = ttExpRequestDtlService.searchByKey(criteria);
                        if(result != null)
                        {
                            itemDomain.setPkgCd(result.getPkgCd());
                            itemDomain.setOriginCntryCd(result.getOriginCntryCd());
                            itemDomain.setUnitPrice(result.getUnitPrice());
                            if(result.getItemNo() == null){  //##ISSUE 128
                                itemDomain.setPltzItemNo(" ");
                            }else{
                                itemDomain.setPltzItemNo(result.getItemNo());
                            }
                            itemDomain.setParFlg("Y");
                            itemDomain.setKitFlg(FLAG_N);
                            itemDomain.setDngrItemFlg(result.getDngrGoodsImpExpCtrl());
                            itemDomain.setCurrCd(ttExpRequestDomain.getCurrCd());
                            itemDomain.setCustomerPoNo(result.getCustomerPoNo());
                            itemDomain.setLineNo(result.getLineNo());
                            itemDomain.setKitBrch(new BigDecimal(0) );
                            if(result.getNetWeight() == null){
                                itemDomain.setItemWeight(new BigDecimal(0)); // is not null
                            }else{
                                itemDomain.setItemWeight(result.getNetWeight()); // is not null
                            }
                        }
                    }else{  // Exp Request DTL Kit
                        // The information from a screen is set to criteria.
                        TtExpRequestDtlKitCriteriaDomain criteria = new TtExpRequestDtlKitCriteriaDomain();
                        criteria.setExpRequestNo(filterDomain.getCriteriaDomain().getExpRequestNo());
                        criteria.setExpRequestItemId(new BigDecimal(w1008ListDomain.getExpRequestItemId()));
                        criteria.setExpRequestKitId(new BigDecimal(w1008ListDomain.getExpRequestKitId()));
                        criteria.setKitBrch(w1008ListDomain.getKitBrch());
                        criteria.setLanguageCd(filterDomain.getCriteriaDomain().getLanguageCd());
                        // Search by condition
                        resultList = ttExpRequestDtlKitService.searchByCondition(criteria);
                        if(resultList != null && resultList.size() > 0)
                        {
                            TtExpRequestDtlKitDomain ttExpRequestDtlKitDomain = resultList.get(0);
                            itemDomain.setOriginCntryCd(ttExpRequestDtlKitDomain.getOriginCntryCd());
                            itemDomain.setUnitPrice(ttExpRequestDtlKitDomain.getUnitPrice());
                            //Issue 095
                            if (ttExpRequestDtlKitDomain.getKitComponentItemNo() == null || ttExpRequestDtlKitDomain.getKitComponentItemNo().trim().length() == 0) {
                                itemDomain.setPltzItemNo(" ");
                            }else {
                                itemDomain.setPltzItemNo(ttExpRequestDtlKitDomain.getKitComponentItemNo());
                            }
                            itemDomain.setParFlg("N");
                            itemDomain.setKitParItemNo(ttExpRequestDtlKitDomain.getKitComponentItemNo());
                            itemDomain.setKitFlg("Y"); // is not null
                            itemDomain.setCurrCd(ttExpRequestDomain.getCurrCd());
                            itemDomain.setDngrItemFlg(ttExpRequestDtlKitDomain.getDngrGoodsImpExpCtrl());
                            itemDomain.setLineNo(ttExpRequestDtlKitDomain.getExpRequestItemId());
                            if(ttExpRequestDtlKitDomain.getNetWeight() == null){
                                itemDomain.setItemWeight(new BigDecimal(0)); // is not null
                            }else{
                                itemDomain.setItemWeight(ttExpRequestDtlKitDomain.getNetWeight()); // is not null
                            }
                            
                            //Query CustomerPONO of Parent                            
                            TtExpRequestDtlCriteriaDomain ttExpRequestDtlCriteriaDomain = new TtExpRequestDtlCriteriaDomain();
                            ttExpRequestDtlCriteriaDomain.setExpRequestNo(filterDomain.getCriteriaDomain().getExpRequestNo());
                            ttExpRequestDtlCriteriaDomain.setExpRequestItemId(new BigDecimal(w1008ListDomain.getExpRequestItemId()));
                            ttExpRequestDtlCriteriaDomain.setLanguageCd(filterDomain.getCriteriaDomain().getLanguageCd());
                            // Search by key
                            List<TtExpRequestDtlDomain> ttExpRequestDtlDomainList = ttExpRequestDtlService.searchByCondition(ttExpRequestDtlCriteriaDomain);
                            if(ttExpRequestDtlDomainList != null && ttExpRequestDtlDomainList.size() > 0)
                            {
                                TtExpRequestDtlDomain ttExpRequestDtlDomain = ttExpRequestDtlDomainList.get(0);
                                itemDomain.setCustomerPoNo(ttExpRequestDtlDomain.getCustomerPoNo());
                                
                                //##ISUUE 137
                                String key = ttExpRequestDtlCriteriaDomain.getExpRequestItemId().toString() + ttExpRequestDtlCriteriaDomain.getLineNo();
                                if(mapParent.get(key) == null)
                                {
                                    mapParent.put(key, key);
                                    
                                    W1008PltzItemDomain w1008PltzItemDomainParent = new W1008PltzItemDomain();
                                    w1008PltzItemDomainParent.setMainMark(domain.getMainMark());
                                    w1008PltzItemDomainParent.setBrch(new BigDecimal(seq++));
                                    if(ttExpRequestDtlDomain.getItemNo() == null){  //##ISSUE 128
                                        w1008PltzItemDomainParent.setPltzItemNo(" ");
                                    }else{
                                        w1008PltzItemDomainParent.setPltzItemNo(ttExpRequestDtlDomain.getItemNo());
                                    }
                                    w1008PltzItemDomainParent.setItemDescription(ttExpRequestDtlDomain.getDescription());
                                    w1008PltzItemDomainParent.setQty(ttExpRequestDtlDomain.getQty());
                                    w1008PltzItemDomainParent.setQtyUnit(ttExpRequestDtlDomain.getQtyUnit());
                                    w1008PltzItemDomainParent.setNetWeight(new BigDecimal(0));
                                    w1008PltzItemDomainParent.setItemWeight(new BigDecimal(0));
                                    if(ttExpRequestDomain.getWeightUnit() != null && ttExpRequestDomain.getWeightUnit().trim().length() > 0 )
                                    {
                                        w1008PltzItemDomainParent.setWeightUnit(ttExpRequestDomain.getWeightUnit());
                                    }else{
                                        w1008PltzItemDomainParent.setWeightUnit(" "); // is not null
                                    }
                                    w1008PltzItemDomainParent.setShippingLot(new BigDecimal(0));
                                    w1008PltzItemDomainParent.setDngrItemFlg(ttExpRequestDtlDomain.getDngrGoodsImpExpCtrl());
                                    w1008PltzItemDomainParent.setOriginCntryCd(ttExpRequestDtlDomain.getOriginCntryCd());
                                    w1008PltzItemDomainParent.setCurrCd(ttExpRequestDomain.getCurrCd());
                                    w1008PltzItemDomainParent.setPlntCd(ttExpRequestDomain.getPlantCd());
                                    w1008PltzItemDomainParent.setRtFlg("N");
                                    w1008PltzItemDomainParent.setKitFlg("Y");
                                    w1008PltzItemDomainParent.setExpRequestNo(filterDomain.getCriteriaDomain().getExpRequestNo());
                                    w1008PltzItemDomainParent.setLineNo(ttExpRequestDtlDomain.getLineNo());
                                    w1008PltzItemDomainParent.setKitBrch(new BigDecimal(0));
                                    w1008PltzItemDomainParent.setParFlg("Y");
                                    w1008PltzItemDomainParent.setKitParItemNo(ttExpRequestDtlDomain.getItemNo());
                                    w1008PltzItemDomainParent.setCustomerPoNo(ttExpRequestDtlDomain.getCustomerPoNo());
                                    //Issue 095
                                    if (ttExpRequestDtlDomain.getCustomerItemNo() == null || ttExpRequestDtlDomain.getCustomerItemNo().trim().length() == 0) {
                                        w1008PltzItemDomainParent.setCustomerItemNo(" ");
                                    }else{
                                        w1008PltzItemDomainParent.setCustomerItemNo(ttExpRequestDtlDomain.getCustomerItemNo());
                                    }
                                    w1008PltzItemDomainParent.setExpRequestItemId(ttExpRequestDtlDomain.getExpRequestItemId()); // Croos Check 
                                    
                                    ///if Parent first unitPrice has value else unitPric is 0
                                    W1008PltzItemCriteriaDomain w1008PltzItemCriteriaDomain = new W1008PltzItemCriteriaDomain();
                                    w1008PltzItemCriteriaDomain.setExpRequestNo(filterDomain.getCriteriaDomain().getExpRequestNo());
                                    w1008PltzItemCriteriaDomain.setExpRequestItemId(ttExpRequestDtlDomain.getExpRequestItemId());
                                    List<W1008PltzItemDomain> w1008PltzItemDomainList = w1008PltzItemService.searchRegisterParentCmlW1008ByCondition(w1008PltzItemCriteriaDomain);
                                    if(w1008PltzItemDomainList != null && w1008PltzItemDomainList.size() > 0)
                                    {
                                        w1008PltzItemDomainParent.setUnitPrice(new BigDecimal(0));
                                    }else{ // At First
                                        w1008PltzItemDomainParent.setUnitPrice(ttExpRequestDtlDomain.getUnitPrice());
                                    }
                                    w1008PltzItemDomainParent.setItemTyp(ttExpRequestDomain.getItemTyp()); ///from TT_EXP_REQUEST.ITEM_TYP #ISSUE150
                                    w1008PltzItemDomainParent.setComCreateFuncId(filterDomain.getScreenId());
                                    w1008PltzItemDomainParent.setComCreateUserId(filterDomain.getLoginUserDscId());
                                    w1008PltzItemDomainParent.setComUpdateFuncId(filterDomain.getScreenId());
                                    w1008PltzItemDomainParent.setComUpdateUserId(filterDomain.getLoginUserDscId());  
                                    
                                    parentList.add(w1008PltzItemDomainParent);
                                }
                               //end  ##ISUUE 137
                            }                           
                        }
                        itemDomain.setExpRequestKitId(new BigDecimal(w1008ListDomain.getExpRequestKitId()));
                        itemDomain.setKitBrch(itemDomain.getExpRequestKitId());
                        keyString = filterDomain.getCriteriaDomain().getExpRequestNo() + "#" + w1008ListDomain.getExpRequestItemId();
                    }
                    
                    //Issue 095
                    if (w1008ListDomain.getCustomerItemNo() == null || w1008ListDomain.getCustomerItemNo().trim().length() == 0) {
                        itemDomain.setCustomerItemNo(" ");
                    }else{
                        itemDomain.setCustomerItemNo(w1008ListDomain.getCustomerItemNo());
                    }
                   
                    itemDomain.setExpRequestItemId(new BigDecimal( w1008ListDomain.getExpRequestItemId()));
                    
                    itemDomain.setMainMark(domain.getMainMark());
//                    if(w1008ListDomain.getComponentItemNo() == null || w1008ListDomain.getComponentItemNo().trim().length() == 0 )
//                    {
//                        itemDomain.setPltzItemNo(" ");
//                    }else{
//                        itemDomain.setPltzItemNo(w1008ListDomain.getComponentItemNo());
//                    }
                   
                    if(ttExpRequestDomain.getWeightUnit() != null && ttExpRequestDomain.getWeightUnit().trim().length() > 0 )
                    {
                        itemDomain.setWeightUnit(ttExpRequestDomain.getWeightUnit());
                    }else{
                        itemDomain.setWeightUnit(" "); // is not null
                    }
                    itemDomain.setItemDescription(w1008ListDomain.getDescription());
                    itemDomain.setQty(w1008ListDomain.getQty());
                    itemDomain.setQtyUnit(w1008ListDomain.getQtyUnit());
                    itemDomain.setItemTyp(ttExpRequestDomain.getItemTyp()); ///from TT_EXP_REQUEST.ITEM_TYP
                    itemDomain.setPlntCd(ttExpRequestDomain.getPlantCd()); // ##ISSUE150
                    itemDomain.setShippingLot(new BigDecimal(0));
                    //itemDomain.setPkgTyp(" "); //comment for call report CML
                    itemDomain.setModelCd (" ");
                    itemDomain.setExpRequestNo(domain.getExpRequestNo());
                    itemDomain.setMixTagNo(" ");
                    itemDomain.setPltzInstrNo(" ");
                    itemDomain.setComCreateFuncId(filterDomain.getScreenId());
                    itemDomain.setComCreateUserId(filterDomain.getLoginUserDscId());
                    itemDomain.setComUpdateFuncId(filterDomain.getScreenId());
                    itemDomain.setComUpdateUserId(filterDomain.getLoginUserDscId());                    
                    itemDomain.setBrch(new BigDecimal(seq++));
                    
                    
                    itemDomain.setNetWeight(new BigDecimal(itemDomain.getQty().doubleValue() * itemDomain.getItemWeight().doubleValue()));
                    if( itemDomain.getDngrItemFlg() == null){
                        itemDomain.setDngrItemFlg(" "); // is not null
                    }
                    
                    itemDomain.setRtFlg("N"); // for Goods
                    // Save
                    w1008PltzItemService.create(itemDomain);
                    if(keyString != null){
                        expRequest.put(keyString, keyString);
                        keyString = null;
                    }
                    
                    // Delete TW_EXP_REQUEST_PLTZ
                    // The information from a screen is set to criteria.
                    W1007PltzWkCriteriaDomain w1007PltzWkCriteriaDomain = new W1007PltzWkCriteriaDomain();
                    w1007PltzWkCriteriaDomain.setExpRequestNo(filterDomain.getCriteriaDomain().getExpRequestNo());
                    w1007PltzWkCriteriaDomain.setPalletNo(filterDomain.getCriteriaDomain().getPalletNo());
                    w1007PltzWkCriteriaDomain.setLanguageCd(filterDomain.getCriteriaDomain().getLanguageCd());
                    List<W1007PltzWkDomain>  w1007PltzWkDomainList = w1007PltzWkService.searchByCondition(w1007PltzWkCriteriaDomain);
                    for(W1007PltzWkDomain w1007PltzWkDomain : w1007PltzWkDomainList){
                        W1007PltzWkCriteriaDomain criteriaDomain = convertDomainToCriteria(w1007PltzWkDomain);
                        w1007PltzWkService.delete(criteriaDomain);
                    }
                    
                    // Update Packing Status
                    if(result != null)
                    {
                        result.setPackingStatus(CASEMARK);
                        result.setComUpdateFuncId(filterDomain.getScreenId());
                        result.setComUpdateUserId(filterDomain.getLoginUserDscId());
                        ttExpRequestDtlService.update(result);
                    }else if(resultList != null && resultList.size() > 0){
                        TtExpRequestDtlKitDomain ttExpRequestDtlKitDomain = (TtExpRequestDtlKitDomain)resultList.get(0);
                        ttExpRequestDtlKitDomain.setPackingStatus(CASEMARK);
                        ttExpRequestDtlKitDomain.setComUpdateFuncId(filterDomain.getScreenId());
                        ttExpRequestDtlKitDomain.setComUpdateUserId(filterDomain.getLoginUserDscId());
                        ttExpRequestDtlKitService.update(ttExpRequestDtlKitDomain);
                    }
                }
                
                // Insert data from TW_exp_request_palletize_rt to TT_PLTZ_ITEM
                // The information from a screen is set to criteria.
                
                if(twExpRequestPalletizeRtDomainList != null && twExpRequestPalletizeRtDomainList.size() > 0)
                {
                    for(TwExpRequestPalletizeRtDomain result : twExpRequestPalletizeRtDomainList)
                    {
                        W1008PltzItemDomain itemDomain = new W1008PltzItemDomain();
                        itemDomain.setOriginCntryCd(result.getOriginCntryCd());
                        itemDomain.setRtFlg("Y"); // for package
                        itemDomain.setItemTyp(ITEM_TYP_PKG_MATERIALS); //value is 3 
                        itemDomain.setBrch(new BigDecimal(seq++));
                        itemDomain.setCurrCd(result.getCurrCd());
                        itemDomain.setMainMark(domain.getMainMark());
                        //Issue 095
                        itemDomain.setCustomerItemNo(" ");
                        if (result.getPkgItemNo() == null || result.getPkgItemNo().trim().length() == 0) {
                            itemDomain.setPltzItemNo(" ");
                        }else {
                            itemDomain.setPltzItemNo(result.getPkgItemNo());
                        }
                        itemDomain.setItemDescription(result.getDescription());
                        itemDomain.setQty(result.getQty());
                        itemDomain.setModelCd(result.getModelCd());
                        itemDomain.setUnitPrice(result.getUnitPrice());
                        itemDomain.setQtyUnit(result.getQtyUnit());
                        if(result.getWeightUnit() == null || result.getWeightUnit().trim().length() == 0 )
                        {
                            itemDomain.setWeightUnit(" ");
                        }else{
                            itemDomain.setWeightUnit(result.getWeightUnit());
                        }
                        itemDomain.setShippingLot(new BigDecimal(0));
                        if(result.getInnerOuterType() != null ){
                            itemDomain.setPkgTyp(result.getInnerOuterType()); ///InnerOuterType packageMaterial
                        }else {
                            itemDomain.setPkgTyp(" "); ///InnerOuterType packageMaterial
                        }
                        itemDomain.setExpRequestNo(domain.getExpRequestNo());
                        itemDomain.setLineNo(new BigDecimal(0));
                        itemDomain.setKitBrch(new BigDecimal(0));
                        itemDomain.setMixTagNo(" ");
                        itemDomain.setPltzInstrNo(" ");
                        itemDomain.setComCreateFuncId(filterDomain.getScreenId());
                        itemDomain.setComCreateUserId(filterDomain.getLoginUserDscId());
                        itemDomain.setComUpdateFuncId(filterDomain.getScreenId());
                        itemDomain.setComUpdateUserId(filterDomain.getLoginUserDscId());  
                        itemDomain.setDngrItemFlg(" "); // is not null
                        itemDomain.setKitFlg("N"); // is not null
                        itemDomain.setParFlg("Y"); // is not null
                        if(result.getNetWeight() == null){
                            itemDomain.setItemWeight(new BigDecimal(0)); // is not null
                        }else{
                            itemDomain.setItemWeight(result.getNetWeight()); // is not null
                        }
                        itemDomain.setNetWeight(new BigDecimal(itemDomain.getQty().doubleValue() * itemDomain.getItemWeight().doubleValue()));
                        
                        // Save
                        w1008PltzItemService.create(itemDomain);
                        
                    }
                }
                
            }
            
            // Update Parent to CML ##ISUUE 137
            if(parentList != null && parentList.size() > 0)
            {
                w1008PltzItemService.createList(parentList);
            }
            
            
            // Update Parent hidden
            Set<String> keys = expRequest.keySet();
            for(String key : keys){
                String[] strSplit = key.split("#");
                TtExpRequestDtlCriteriaDomain criteriaDomain = new TtExpRequestDtlCriteriaDomain();
                if(strSplit.length == 2){
                    criteriaDomain.setExpRequestNo(strSplit[0]);
                    criteriaDomain.setExpRequestItemId(new BigDecimal(strSplit[1]));
                    // Search by condition
                    List<TtExpRequestDtlDomain> expRequestdomainList = (List<TtExpRequestDtlDomain>)ttExpRequestDtlService.searchByCondition(criteriaDomain);
                    for(TtExpRequestDtlDomain ttExpRequestDtlDomain : expRequestdomainList)
                    {
                        // Update packing status
                        ttExpRequestDtlDomain.setPackingStatus(CASEMARK);
                        ttExpRequestDtlDomain.setComUpdateFuncId(filterDomain.getScreenId());
                        ttExpRequestDtlDomain.setComUpdateUserId(filterDomain.getLoginUserDscId());
                        ttExpRequestDtlService.update(ttExpRequestDtlDomain);
                    }
                }
            }
            // Update request status
            // Variable for update status 'CaseMark'
            boolean isCaseMark = true;
            int index = 0;
            TtExpRequestDtlCriteriaDomain criteria = new TtExpRequestDtlCriteriaDomain();
            criteria.setExpRequestNo(filterDomain.getCriteriaDomain().getExpRequestNo());
            List<TtExpRequestDtlDomain>  resultList = ttExpRequestDtlService.searchByCondition(criteria);
            for(TtExpRequestDtlDomain ttExpRequestDtlDomain : resultList)
            {
                if(ttExpRequestDtlDomain.getPackingStatus() != null && !ttExpRequestDtlDomain.getPackingStatus().equals(CASEMARK)){
                    isCaseMark = false;
                }
                index++;
            }
            TtExpRequestDtlKitCriteriaDomain kitCriteria = new TtExpRequestDtlKitCriteriaDomain();
            kitCriteria.setExpRequestNo(filterDomain.getCriteriaDomain().getExpRequestNo());
            List<TtExpRequestDtlKitDomain>  resultKitList = ttExpRequestDtlKitService.searchByCondition(kitCriteria);
            for(TtExpRequestDtlKitDomain ttExpRequestDtlKitDomain : resultKitList)
            {
                if(ttExpRequestDtlKitDomain.getPackingStatus() != null && !ttExpRequestDtlKitDomain.getPackingStatus().equals(CASEMARK)){
                    isCaseMark = false;
                }
                index++;
            }
            // Update Exp Request Status
            if(isCaseMark && index > 0){
                ttExpRequestDomain.setRequestStatus(ISSUE_CML);
                ttExpRequestDomain.setComUpdateFuncId(filterDomain.getScreenId());
                ttExpRequestDomain.setComUpdateUserId(filterDomain.getLoginUserDscId());
                w1001ExpRequestService.update(ttExpRequestDomain);
                filterDomain.getCriteriaDomain().setRequestStatus(getMessageValue(ISSUE_CML, FUNC_PALLETIZE_INSTRUCTION));
                
                
                //Update TT_PLTZ ExpRequestAllCmlIssuedFlg is 'Y'
                W1008PltzCriteriaDomain w1008PltzCriteriaDomain = new W1008PltzCriteriaDomain();
                w1008PltzCriteriaDomain.setExpRequestNo(filterDomain.getCriteriaDomain().getExpRequestNo());
                List<W1008PltzDomain> w1008PltzDomainList = w1008PltzService.searchByCondition(w1008PltzCriteriaDomain);
                if(w1008PltzDomainList != null && w1008PltzDomainList.size() > 0)
                {
                    for(W1008PltzDomain w1008PltzDomain : w1008PltzDomainList)
                    {
                        w1008PltzDomain.setExpRequestAllCmlIssuedFlg("Y");
                        w1008PltzService.update(w1008PltzDomain);
                    }
                }
                
                
            }else{
                // Setting Exp Request Status
                ttExpRequestDomain.setRequestStatus(PROGRESS_PKG);
                ttExpRequestDomain.setComUpdateFuncId(filterDomain.getScreenId());
                ttExpRequestDomain.setComUpdateUserId(filterDomain.getLoginUserDscId());
                w1001ExpRequestService.update(ttExpRequestDomain);
                filterDomain.getCriteriaDomain().setRequestStatus(getMessageValue(PROGRESS_PKG, FUNC_PALLETIZE_INSTRUCTION));
            }
            // Setting data to screen 
            filterDomain.getCriteriaDomain().setMainMark(domain.getMainMark());
            filterDomain.getCriteriaDomain().setVolume(String.valueOf( domain.getVolume()));
            
        }
        return filterDomain;
    }
    /**
     *  Convert to W1007PltzWkCriteriaDomain
     *
     * @param domain W1007PltzWkDomain
     * @return W1007PltzWkCriteriaDomain
     */
    protected W1007PltzWkCriteriaDomain convertDomainToCriteria (W1007PltzWkDomain domain){
        W1007PltzWkCriteriaDomain w1007PltzWkCriteriaDomain = new W1007PltzWkCriteriaDomain();
        // Copy of property
        // プロパティのコピー
        CommonUtil.copyPropertiesDomainToDomain(w1007PltzWkCriteriaDomain, domain);
        return w1007PltzWkCriteriaDomain;
    }
   
    /**
     *  Generate CML NO
     *
     * @param shipper String
     * @param whCd String
     * @return runningNo String 
     * @throws GscmApplicationException gscmException
     * @throws ApplicationException applicationException
     */
    protected String generateCMLNo(String shipper, String whCd) throws GscmApplicationException, ApplicationException{
        // Search next running no
        String runningNo = (String)w1008PltzService.searchRunningNo();
        // Convert variable to blank
        if(shipper == null || whCd == null)
        {
            if(shipper == null)
            {
                shipper = "";            
            }
            if(whCd == null)
            {
                whCd = "";            
            }
        }
        // Setting format number
        if(runningNo == null || "".equals(runningNo)){
            runningNo = "0";  //Issue 187 Seq 1 Each day 07042016
        }
        int running = Integer.parseInt(runningNo);
        running++;
        runningNo = String.valueOf(running);
        if(runningNo.length() == 1)
        {
            runningNo = "000" + runningNo;
        }else if(runningNo.length() == 2){
            runningNo = "00" + runningNo;
        }else if(runningNo.length() == 3){
            runningNo = "0" + runningNo;
        }
            
        // Setting format CML no
        String cmlNo = "";
        Date newDate = new Date();
        cmlNo = "S" + shipper  + df.format(newDate).substring(1) + runningNo;
        return cmlNo;
    }
    /**
     *  Convert to List<W1008ExpRequestDtlDomain>
     *
     * @param listDomain List<? extends W1008ListDomain> 
     * @return listDomainList List<W1008ExpRequestDtlDomain>
     */
    protected List<W1008ExpRequestDtlDomain> convertToW1008ExpRequestDtlDomain(List<? extends W1008ListDomain> listDomain) {
        List<W1008ExpRequestDtlDomain> listDomainList = new ArrayList<W1008ExpRequestDtlDomain>();
        if(listDomain != null && listDomain.size() > 0){
            for (W1008ListDomain domain : listDomain) {
                W1008ExpRequestDtlDomain criteria = new W1008ExpRequestDtlDomain();
                // Copy of property
                // プロパティのコピー
                CommonUtil.copyPropertiesDomainToDomain(criteria, domain);
                listDomainList.add(criteria);
            }
        }
        return listDomainList;
    }
    /**
     *  Check Danger Goods/Im-Ex Control
     *
     * @param listDomain List<? extends W1008ListDomain> 
     * @return String
     */
    protected String isExitsDangerFlag(List<? extends W1008ListDomain> listDomain) {
        if(listDomain != null && listDomain.size() > 0){
            for (W1008ListDomain domain : listDomain) {
                if(domain.getDngrGoodsImpExpCtrl() != null && "Y".equalsIgnoreCase(domain.getDngrGoodsImpExpCtrl())){
                    return "Y";
                }
            }
        }
        return "N";
    }
    /**
     * IsNumeric
     *
     * @param str String
     * @return Boolean
     */
    protected  boolean isNumeric(String str)  
    {  
        try  
        {  
            Double.parseDouble(str);  
        }catch(NumberFormatException nfe){  
            return false;  
        }  
        return true;  
    }
    /**
     *    The name of the input method (Manual) is acquired.
     * <br />入力方法(Manual)の名称を取得します。
     *
     * @param cd String
     * @param cdType String
     * @return The name of the input method<br />入力方法の名称
     * @throws ApplicationException When the input method is unacquirable<br />入力方法が取得できない場合
     */
    protected String getMessageValue(String cd, String cdType ) throws ApplicationException {
        // Setting of a search condition
        // 検索条件の設定
        TmCdCriteriaDomain criteria = new TmCdCriteriaDomain();
        criteria.setLngCd(LANGUAGE_CD_ENGLISH);
        criteria.setCdTyp(cdType);
        criteria.setCd(cd);

        // Acquisition of a name
        // 名称の取得
        return cd + " : " + tmCdService.searchByKey(criteria).getValue();
    }
    
    /**
     *    getInvoiceType TT_PLTZ.INVOICE_CTGRY
     * <br />入力方法(Manual)の名称を取得します。
     *
     * @param resultList List<W1008ListDomain>
     * @param expRequestNo String
     * @param languageCd String
     * @return Invoice Type
     * @throws ApplicationException When the input method is unacquirable<br />入力方法が取得できない場合
     */
    protected String getInvoiceType(List<? extends W1008ListDomain> resultList, String expRequestNo , String languageCd )throws ApplicationException { //##ISSUE 151
        
        String invoiceType = " ";
        if(resultList != null && resultList.size() > 0 )
        {
            String comFlag = "";
            String nonComFlag = "";
            for(W1008ListDomain domain : resultList)
            {
                if( domain.getLineNo() != null &&  domain.getLineNo().intValue() > 0 )
                {
                    if( domain.getCommercialFlg() != null && domain.getCommercialFlg().equalsIgnoreCase("Y")){
                        comFlag = "Y";
                    }else if( domain.getCommercialFlg() != null && domain.getCommercialFlg().equalsIgnoreCase("N")){
                        nonComFlag = "N";
                    }                 
                }else{ //KIT
                    if( domain.getCommercialFlg() != null && domain.getCommercialFlg().equalsIgnoreCase("Y")){
                        comFlag = "Y";
                    }else if( domain.getCommercialFlg() != null && domain.getCommercialFlg().equalsIgnoreCase("N")){
                        nonComFlag = "N";
                    } 
                    //Query  Parent                            
                    TtExpRequestDtlCriteriaDomain ttExpRequestDtlCriteriaDomain = new TtExpRequestDtlCriteriaDomain();
                    ttExpRequestDtlCriteriaDomain.setExpRequestNo(expRequestNo);
                    ttExpRequestDtlCriteriaDomain.setExpRequestItemId(new BigDecimal(domain.getExpRequestItemId()));
                    ttExpRequestDtlCriteriaDomain.setLanguageCd(languageCd);
                    // Search by key
                    List<TtExpRequestDtlDomain> ttExpRequestDtlDomainList = ttExpRequestDtlService.searchByCondition(ttExpRequestDtlCriteriaDomain);
                    if(ttExpRequestDtlDomainList != null && ttExpRequestDtlDomainList.size() > 0)
                    {
                        TtExpRequestDtlDomain ttExpRequestDtlDomain = ttExpRequestDtlDomainList.get(0);
                        if( ttExpRequestDtlDomain.getCommercialFlg() != null && ttExpRequestDtlDomain.getCommercialFlg().equalsIgnoreCase("Y")){
                            comFlag = "Y";
                        }else if( ttExpRequestDtlDomain.getCommercialFlg() != null && ttExpRequestDtlDomain.getCommercialFlg().equalsIgnoreCase("N")){
                            nonComFlag = "N";
                        }
                    }
                }
            }
            
            /// Invoice type
            //If all item(Parrent or KIT) have commercial = 'Y'           C
            //If all item(Parrent or KIT) have commercial = 'N'           N
            //If all item(Parrent or KIT) have commercial = 'Y' & 'N'     I 

            if(comFlag.equals("Y") && nonComFlag.equals(""))
            {
                invoiceType = "C";
            }else if(comFlag.equals("Y") && nonComFlag.equals("N")){
                invoiceType = "I";
            }else if(comFlag.equals("") && nonComFlag.equals("N"))
            {
                invoiceType = "N";
            }
            
        }
        return invoiceType;
    }
}
