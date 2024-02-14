/*
 * PROJECT：eca0027
 * 
 * TtExpRequest のService実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2558/04/27  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CD_TYPE_STATUS;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CD_TYPE_TRANS_CD;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FILE_SIZE_MAX;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_N;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.LANGUAGE_CD_ENGLISH;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_COPY_NEW;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_EDIT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_NEW;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_REF;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W1002;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W1003;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W1004;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SEQ_TYP_REQUEST_NO;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_SUCCESS;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W1001R;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.TmCdDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmCigmaWhXrefDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmCntryDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmMeasureUnitDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmNxsCompDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmSupplierWhXrefDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtExpRequestDtlDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtExpRequestDtlKitDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCdCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaWhXrefCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCntryCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmMeasureUnitCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsCompCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmSupplierWhXrefCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestDtlCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRequestDtlKitCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TmCdService;
import com.globaldenso.eca0027.core.auto.business.service.TmCigmaWhXrefService;
import com.globaldenso.eca0027.core.auto.business.service.TmCntryService;
import com.globaldenso.eca0027.core.auto.business.service.TmMeasureUnitService;
import com.globaldenso.eca0027.core.auto.business.service.TmNxsCompService;
import com.globaldenso.eca0027.core.auto.business.service.TmSupplierWhXrefService;
import com.globaldenso.eca0027.core.auto.business.service.TtExpRequestDtlKitService;
import com.globaldenso.eca0027.core.auto.business.service.TtExpRequestDtlService;
import com.globaldenso.eca0027.core.business.dao.W1001ExpRequestDao;
import com.globaldenso.eca0027.core.business.domain.W1001ExpRequestDomain;
import com.globaldenso.eca0027.core.business.domain.W1002CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W1003CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W1003ListDomain;
import com.globaldenso.eca0027.core.business.domain.W1003UpdateDomain;
import com.globaldenso.eca0027.core.business.domain.W1004KitListDomain;
import com.globaldenso.eca0027.core.business.domain.W1004ListDomain;
import com.globaldenso.eca0027.core.business.domain.W1004UpdateDomain;
import com.globaldenso.eca0027.core.business.domain.W1007PltzWkDomain;
import com.globaldenso.eca0027.core.business.domain.Ws9002ResultDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W1001ExpRequestCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W1007PltzWkCriteriaDomain;
import com.globaldenso.eca0027.core.business.ws.Ws9002RestService;
import com.globaldenso.eca0027.core.common.business.domain.SelectListItemDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.eca0027.core.common.business.service.UserAuthService;
import com.globaldenso.gscm.framework.util.CheckUtil;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.DateUtil;


/**
 * W1001ExpRequest のService実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2558/04/27 14:08:11<BR>
 * 
 * テーブル定義から2558/04/27に自動生成したモジュールです。
 * 
 * @author $Author$
 * @version $Revision$
 */
public class W1001ExpRequestServiceImpl implements W1001ExpRequestService {

    /**
     * Common service
     * <br />共通サービス
     */
    protected CommonService commonService;

    /**
     * User function use authorization service
     * <br />ユーザ機能利用権限サービス
     */
    protected UserAuthService userAuthService;
    
    /**
     * Tm_CD service
     * <br />共通サービス
     */
    protected TmCdService tmCdService;
    
    /**
     * service of Country Master <br />
     * 国原単位サービス
     */
    protected TmCntryService tmCntryService;
    
    /**
     * service of NEXUS Company Master <br />
     * NEXUS会社原単位サービス
     */
    protected TmNxsCompService tmNxsCompService;
    /**
     * service of Supplier Company Master <br />
     */
    protected TmSupplierWhXrefService tmSupplierWhXrefService;
    /**
    * W1007PltzWk service
    * <br />
    */
    protected W1007PltzWkService w1007PltzWkService;
    /**
     * WS9002Rest service
     * <br />WS9002Restサービス
     */
    protected Ws9002RestService ws9002RestService;
    
    /**
     * <p>
     * TmCigmaWhXrefService
     * </p>
     */
    protected TmCigmaWhXrefService tmCigmaWhXrefService;
    
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
    /** service of Measure Unit Master <br />
    * 計量単位原単位サービス
    */
    protected TmMeasureUnitService tmMeasureUnitService;
    /**
     * w1001ExpRequestのDAO
     */
    private W1001ExpRequestDao w1001ExpRequestDao;

    /**
     * デフォルトコンストラクタ。
     */
    public W1001ExpRequestServiceImpl() {
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
     * <p>Getter method for tmMeasureUnitService.</p>
     *
     * @return the tmMeasureUnitService
     */
    public TmMeasureUnitService getTmMeasureUnitService() {
        return tmMeasureUnitService;
    }

    /**
     * <p>Setter method for tmMeasureUnitService.</p>
     *
     * @param tmMeasureUnitService Set for tmMeasureUnitService
     */
    public void setTmMeasureUnitService(TmMeasureUnitService tmMeasureUnitService) {
        this.tmMeasureUnitService = tmMeasureUnitService;
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
     * Setter method for commonService.
     *
     * @param commonService Set for commonService
     */
    public void setCommonService(CommonService commonService) {
        this.commonService = commonService;
    }

    /**
     * Setter method for userAuthService.
     *
     * @param userAuthService Set for userAuthService
     */
    public void setUserAuthService(UserAuthService userAuthService) {
        this.userAuthService = userAuthService;
    }
    
    /**
     * Setter method for tmCdService.
     *
     * @param tmCdService Set for tmCdService
     */
    public void setTmCdService(TmCdService tmCdService) {
        this.tmCdService = tmCdService;
    }
    
    /**
     * Setter method for tmCntryService.
     *
     * @param tmCntryService Set for tmCntryService
     */
    public void setTmCntryService(TmCntryService tmCntryService) {
        this.tmCntryService = tmCntryService;
    }
    
    /**
     * Setter method for tmNxsCompService.
     *
     * @param tmNxsCompService Set for tmNxsCompService
     */
    public void setTmNxsCompService(TmNxsCompService tmNxsCompService) {
        this.tmNxsCompService = tmNxsCompService;
    }

    /**
     * Setter method for ws9002RestService.
     *
     * @param ws9002RestService Set for ws9002RestService
     */
    public void setWs9002RestService(Ws9002RestService ws9002RestService) {
        this.ws9002RestService = ws9002RestService;
    }
    
    /**
     * <p>
     * Setter method for ttExpRequestDtlService.
     * </p>
     * 
     * @param ttExpRequestDtlService ttExpRequestDtlService
     */
    public void setTtExpRequestDtlService(
        TtExpRequestDtlService ttExpRequestDtlService) {
        this.ttExpRequestDtlService = ttExpRequestDtlService;
    }

    /**
     * <p>
     * Setter method for ttExpRequestDtlKitService.
     * </p>
     * 
     * @param ttExpRequestDtlKitService ttExpRequestDtlKitService
     */
    public void setTtExpRequestDtlKitService(
        TtExpRequestDtlKitService ttExpRequestDtlKitService) {
        this.ttExpRequestDtlKitService = ttExpRequestDtlKitService;
    }
    
    /**
     * <p>
     * Setter method for tmCigmaWhXrefService.
     * </p>
     * 
     * @param tmCigmaWhXrefService tmCigmaWhXrefService
     */
    public void setTmCigmaWhXrefService(
        TmCigmaWhXrefService tmCigmaWhXrefService) {
        this.tmCigmaWhXrefService = tmCigmaWhXrefService;
    }
    
    /**
     * w1001ExpRequestのDAOを設定します。
     * 
     * @param w1001ExpRequestDao ttExpRequestのDao
     */
    public void setW1001ExpRequestDao(W1001ExpRequestDao w1001ExpRequestDao) {
        this.w1001ExpRequestDao = w1001ExpRequestDao;
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.common.business.service.CommonService#searchCntryCdPullDownList(boolean)
     */
    public List<? extends SelectListItemDomain> searchCntryCdPullDownList(
        boolean addBlank) throws ApplicationException {

        // Acquisition of a Transportation Type Master
        // 輸送手段種別原単位の取得
        TmCntryCriteriaDomain tmCntryCriteriaDomain = new TmCntryCriteriaDomain();
        List<TmCntryDomain> searchList
            = tmCntryService.searchByCondition(tmCntryCriteriaDomain);

        // Create of a pulldown list
        // プルダウンリストの作成
        List<SelectListItemDomain> list = new ArrayList<SelectListItemDomain>();
        SelectListItemDomain bean = null;
        if (addBlank){
            bean = new SelectListItemDomain();
            bean.setId("");
            bean.setName("");
            list.add(bean);
        }
        for (TmCntryDomain domain : searchList) {
            bean = new SelectListItemDomain();
            bean.setId(domain.getCntryCd());
            bean.setName(domain.getCntryCd() + ":" + domain.getCntryNm());
            list.add(bean);
        }

        return list;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W1001ExpRequestService#searchContSortKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.W1001ExpRequestCriteriaDomain)
     */
    public String searchContSortKey(W1001ExpRequestCriteriaDomain w1001ExpRequestCriteriaDomain)
        throws ApplicationException {
        // Acquisition of a Transportation Type Master
        W1001ExpRequestDomain w1001ExpRequestDomain = searchContSort(w1001ExpRequestCriteriaDomain);
        
        String containerSortingKey = "";
        
        if (w1001ExpRequestDomain != null) {
            containerSortingKey = w1001ExpRequestDomain.getContainerSortingKey();
        }
        
        return containerSortingKey;
    }
    
    /**
     * Get the NEXUS Company Master 
     * <br />NEXUS会社原単位を取得します。
     *
     * @param compCd - COMPANY CODE
     * @return NEXUS Company Master
     * @throws ApplicationException - If an error occurred during searching NEXUS Company Master
     */
    public TmNxsCompDomain searchNxsComp(String compCd) throws ApplicationException {

        // Acquisition of NEXUS Company Master
        // NEXUS会社原単位の取得
        TmNxsCompCriteriaDomain tmNxsCompCriteriaDomain = new TmNxsCompCriteriaDomain();
        tmNxsCompCriteriaDomain.setCompCd(compCd);
        TmNxsCompDomain tmNxsCompDomain = tmNxsCompService.searchByKey(tmNxsCompCriteriaDomain);

        return tmNxsCompDomain;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W1001ExpRequestService#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.W1001ExpRequestCriteriaDomain)
     */
    public List<W1001ExpRequestDomain> searchByConditionForPaging(W1001ExpRequestCriteriaDomain criteria) throws ApplicationException {
        return w1001ExpRequestDao.searchByConditionForPaging(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W1001ExpRequestService#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.W1001ExpRequestCriteriaDomain)
     */
    public int searchCount(W1001ExpRequestCriteriaDomain criteria) throws ApplicationException {
        return w1001ExpRequestDao.searchCount(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W1001ExpRequestService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.W1001ExpRequestCriteriaDomain)
     */
    public W1001ExpRequestDomain searchByKeyForChange(W1001ExpRequestCriteriaDomain criteria) throws ApplicationException {
        return w1001ExpRequestDao.searchByKeyForChange(criteria);
    }
    
    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W1001ExpRequestService#searchByKeyForChange(com.globaldenso.eca0027.core.auto.business.domain.criteria.W1001ExpRequestCriteriaDomain)
     */
    public W1001ExpRequestDomain searchByKeyForInit(W1001ExpRequestCriteriaDomain criteria) throws ApplicationException {
        return w1001ExpRequestDao.searchByKeyForInit(criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W1001ExpRequestService#create(com.globaldenso.eca0027.core.auto.business.domain.W1001ExpRequestDomain)
     */
    public void create(W1001ExpRequestDomain domain) throws ApplicationException {
        w1001ExpRequestDao.create(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W1001ExpRequestService#update(com.globaldenso.eca0027.core.auto.business.domain.W1001ExpRequestDomain)
     */
    public int update(W1001ExpRequestDomain domain) throws ApplicationException {
        return w1001ExpRequestDao.update(domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W1001ExpRequestService#searchContSort(com.globaldenso.eca0027.core.auto.business.domain.criteria.W1001ExpRequestCriteriaDomain)
     */
    public W1001ExpRequestDomain searchContSort(W1001ExpRequestCriteriaDomain criteria) throws ApplicationException {
        return w1001ExpRequestDao.searchByContSort(criteria);
    }

    /**
     * Export Request
     * <br />梱包指示NOを発行します。
     *
     * @param criteria <br />
     * @return W1001ExpRequestDomain <br />
     * @throws ApplicationException <br />
     */
    public W1002CriteriaDomain searchOnEditInit(W1001ExpRequestCriteriaDomain criteria)
        throws ApplicationException {
        
        W1002CriteriaDomain rtnDomain = new W1002CriteriaDomain();
        String mode = criteria.getProcMode();
        
        if (MODE_NEW.equals(mode)) {
            rtnDomain.setRequestIssuerCompCd(criteria.getOwnerCompCd());
            TmNxsCompDomain tmNxsCompDomain = searchNxsComp(criteria.getOwnerCompCd());
            rtnDomain.setRequestIssuerCompNm(tmNxsCompDomain.getCompNm());
            rtnDomain.setRequestIssuerNm(criteria.getLoginUserDscId());
            rtnDomain.setDensoShipperTyp("N");
            rtnDomain.setPrepareExpInvoiceCtgry("N");
            rtnDomain.setWeightUnit(tmNxsCompDomain.getWeightUnit());
            rtnDomain.setProcMode(MODE_NEW);
        } else if (MODE_EDIT.equals(mode) || MODE_REF.equals(mode)) {
            // EDIT mode / REF mode / COPY NEW mode
            W1001ExpRequestDomain resultDomain = new W1001ExpRequestDomain();
            resultDomain = searchByKeyForChange(criteria);
            CommonUtil.copyPropertiesDomainToDomain(rtnDomain, resultDomain, criteria.getScreenDateFormat());
            
            TmNxsCompDomain tmNxsCompDomain = searchNxsComp(resultDomain.getRequestIssuerCompCd());
            rtnDomain.setRequestIssuerCompNm(tmNxsCompDomain.getCompNm());
            
            TmCdCriteriaDomain tmCdCriteriaDomain = new TmCdCriteriaDomain();
            tmCdCriteriaDomain.setCdTyp(CD_TYPE_STATUS);
            tmCdCriteriaDomain.setCd(resultDomain.getRequestStatus());
            tmCdCriteriaDomain.setLngCd(LANGUAGE_CD_ENGLISH);
            TmCdDomain tmCdDomain = tmCdService.searchByKey(tmCdCriteriaDomain);
            String requestSt = tmCdDomain.getCd() + " : " + tmCdDomain.getValue();
            rtnDomain.setRequestStatus(requestSt);
            
            rtnDomain.setProcMode(mode);
        } else if (MODE_COPY_NEW.equals(mode)) {
            
            W1001ExpRequestDomain resultDomain = new W1001ExpRequestDomain();
            resultDomain = searchByKeyForChange(criteria);
            CommonUtil.copyPropertiesDomainToDomain(rtnDomain, resultDomain, criteria.getScreenDateFormat());
            
            rtnDomain.setRequestIssuerCompCd(criteria.getOwnerCompCd());
            TmNxsCompDomain tmNxsCompDomain = searchNxsComp(criteria.getOwnerCompCd());
            rtnDomain.setRequestIssuerCompNm(tmNxsCompDomain.getCompNm());
            rtnDomain.setRequestIssuerNm(criteria.getLoginUserDscId());
//            rtnDomain.setDensoShipperTyp("N");
//            rtnDomain.setPrepareExpInvoiceCtgry("N");
            rtnDomain.setExpRequestNo("");
            rtnDomain.setRequestStatus("");
//            rtnDomain.setIssuerCompNiceNet("");
//            rtnDomain.setIssuerCompTel("");
//            rtnDomain.setPlantCd("");
            if(rtnDomain.getShipperCd() != null && rtnDomain.getShipperCd().trim().length() > 0)
            {
                tmNxsCompDomain = searchNxsComp(rtnDomain.getShipperCd());
                rtnDomain.setShipperName(tmNxsCompDomain.getCompNm());
            }
            
            rtnDomain.setProcMode(mode);
        }
        rtnDomain.setScreenDateFormat(criteria.getScreenDateFormat());
        return rtnDomain;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W1001ExpRequestService#transactOnRegister(com.globaldenso.eca0027.core.business.domain.W1001ExpRequestDomain)
     */
    public W1002CriteriaDomain transactOnRegister(W1001ExpRequestDomain expRequest) throws ApplicationException {
        
        expRequest.setExpRequestNo(getExpRequestNo(expRequest.getRequestIssuerCompCd()));
        
        expRequest.setRequestStatus("10");
        expRequest.setPackingCompLocationFlg("Y");
        expRequest.setCreateOriginTyp("Y");
        expRequest.setDueDt(expRequest.getRequiredShipDt());
        
        // Setting of a common column
        commonService.setCommonPropertyForRegist(expRequest, SCREEN_ID_W1002);
        //##Issue 116
        if(expRequest.getDensoShipperTyp().equalsIgnoreCase("N")){
            //expRequest.setPlantCd("");
            expRequest.setRequestIssuerDeptNm("");
            expRequest.setIssuerCompTel("");
            if (expRequest.getPrepareExpInvoiceCtgry().equalsIgnoreCase("N")) {
                expRequest.setSupplierInvoiceNo("");
            }
        }else if(expRequest.getDensoShipperTyp().equalsIgnoreCase("Y")){
            expRequest.setSupplierInvoiceNo("");
        }
        // end Issue 116
        create(expRequest);
        
        W1001ExpRequestCriteriaDomain expRequestCriteriaDomain = new W1001ExpRequestCriteriaDomain();
        CommonUtil.copyPropertiesDomainToDomain(expRequestCriteriaDomain, expRequest);
        expRequestCriteriaDomain.setProcMode(MODE_REF);
        
        return searchOnEditInit(expRequestCriteriaDomain);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W1001ExpRequestService#transactOnUpload(com.globaldenso.eca0027.core.business.domain.W1001ExpRequestDomain)
     */
    public int transactOnUpload(List<W1001ExpRequestDomain> expRequest) throws ApplicationException {
        
        int cunt = 0;
        for (W1001ExpRequestDomain expRequestDomain : expRequest) {
            expRequestDomain.setExpRequestNo(getExpRequestNo(expRequestDomain.getRequestIssuerCompCd()));
            
            expRequestDomain.setRequestStatus("10");
            expRequestDomain.setPackingCompLocationFlg("Y");
            expRequestDomain.setCreateOriginTyp("Y");
            expRequestDomain.setSplitShippingNgFlg("Y");
            expRequestDomain.setDueDt(expRequestDomain.getRequiredShipDt());
            
            // Setting of a common column
            commonService.setCommonPropertyForRegist(expRequestDomain, SCREEN_ID_W1002);
            
            create(expRequestDomain);
            cunt++;
        }
        
        return cunt;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W1001ExpRequestService#transactOnEdit(com.globaldenso.eca0027.core.business.domain.W1001ExpRequestDomain)
     */
    public W1002CriteriaDomain transactOnEdit(W1001ExpRequestDomain expRequest)
        throws ApplicationException {
        
        //Issue 102 set status 10 for edit.
        // String status = expRequest.getRequestStatus();
        // expRequest.setRequestStatus(status.split(":")[0].trim());
        expRequest.setRequestStatus("10");
        expRequest.setDueDt(expRequest.getRequiredShipDt());
        
        // Setting of a common column
        commonService.setCommonPropertyForRegist(expRequest, SCREEN_ID_W1002);
        //##Issue 116
        if(expRequest.getDensoShipperTyp().equalsIgnoreCase("N")){
            //expRequest.setPlantCd("");
            expRequest.setRequestIssuerDeptNm("");
            expRequest.setIssuerCompTel("");
            if (expRequest.getPrepareExpInvoiceCtgry().equalsIgnoreCase("N")) {
                expRequest.setSupplierInvoiceNo("");
            }
        }else if(expRequest.getDensoShipperTyp().equalsIgnoreCase("Y")){
            expRequest.setSupplierInvoiceNo("");
        }
        // end Issue 116
        
        update(expRequest);
        
        W1001ExpRequestCriteriaDomain expRequestCriteriaDomain = new W1001ExpRequestCriteriaDomain();
        CommonUtil.copyPropertiesDomainToDomain(expRequestCriteriaDomain, expRequest);
        expRequestCriteriaDomain.setProcMode(MODE_REF);
        
        //Clear PackingStatus =10 ##ISSUE 149
        
        //Search Child
        TtExpRequestDtlKitCriteriaDomain kitCriteria = new TtExpRequestDtlKitCriteriaDomain();
        kitCriteria.setExpRequestNo(expRequest.getExpRequestNo());
        List<TtExpRequestDtlKitDomain> kitLists = ttExpRequestDtlKitService.searchByCondition(kitCriteria);
        if(kitLists != null && kitLists.size() > 0){
            for(TtExpRequestDtlKitDomain domain : kitLists)
            {
                domain.setPackingStatus("10");
                
            }
            ttExpRequestDtlKitService.update(kitLists);
        }
        
        //Search Parent            
        TtExpRequestDtlCriteriaDomain criteriaDomain = new TtExpRequestDtlCriteriaDomain();
        criteriaDomain.setExpRequestNo(expRequest.getExpRequestNo());
        List<TtExpRequestDtlDomain> parentList = ttExpRequestDtlService.searchByCondition(criteriaDomain);
        if(parentList != null && parentList.size() > 0)
        {
            for(TtExpRequestDtlDomain domain : parentList){
                domain.setPackingStatus("10");
            }
            ttExpRequestDtlService.update(parentList);
        }
        
        //Search Other Child
        TtExpRequestDtlKitCriteriaDomain ttExpRequestDtlKitCriteriaDomain = new TtExpRequestDtlKitCriteriaDomain();
        ttExpRequestDtlKitCriteriaDomain.setExpRequestNo(expRequest.getExpRequestNo());
        List<TtExpRequestDtlKitDomain> kitList = ttExpRequestDtlKitService.searchByCondition(ttExpRequestDtlKitCriteriaDomain);
        if(kitList != null && kitList.size() > 0){
            for(TtExpRequestDtlKitDomain domain : kitList)
            {
                domain.setPackingStatus("10");
                
            }
            ttExpRequestDtlKitService.update(kitList);
        }
        //Find before Delete Pallet No
        W1007PltzWkCriteriaDomain w1007PltzWkCriteriaDomain = new W1007PltzWkCriteriaDomain();
        w1007PltzWkCriteriaDomain.setExpRequestNo(expRequest.getExpRequestNo());
        List<W1007PltzWkDomain> w1007PltzWkDomainList = w1007PltzWkService.searchByCondition(w1007PltzWkCriteriaDomain);
        if(w1007PltzWkDomainList != null && w1007PltzWkDomainList.size() > 0)
        {
            for(W1007PltzWkDomain domain : w1007PltzWkDomainList)
            {
                w1007PltzWkCriteriaDomain = new W1007PltzWkCriteriaDomain();
                w1007PltzWkCriteriaDomain.setExpRequestNo(domain.getExpRequestNo());
                w1007PltzWkCriteriaDomain.setPltzWkId(domain.getPltzWkId());
                w1007PltzWkService.deleteByExpRequestNo(w1007PltzWkCriteriaDomain);
            }
        }
        
        
        return searchOnEditInit(expRequestCriteriaDomain);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W1001ExpRequestService#transactOnCancel(com.globaldenso.eca0027.core.business.domain.W1001ExpRequestDomain)
     */
    public void transactOnCancel(W1001ExpRequestDomain expRequest)
        throws ApplicationException {

        expRequest.setRequestStatus("90");
        
        commonService.setCommonPropertyForRegist(expRequest, SCREEN_ID_W1002);
        
        update(expRequest);
        
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W1001ExpRequestService#searchOnDetailInit(com.globaldenso.eca0027.core.business.domain.W1003UpdateDomain)
     */
    public W1003UpdateDomain searchOnDetailInit(W1003UpdateDomain updateDomain) throws ApplicationException {

        W1003UpdateDomain rtnDomain = new W1003UpdateDomain();
        W1001ExpRequestCriteriaDomain w1001ExpRequestCriteriaDomain = new W1001ExpRequestCriteriaDomain();
        w1001ExpRequestCriteriaDomain.setExpRequestNo(updateDomain.getCriteriaDomain().getExpRequestNo());
        W1001ExpRequestDomain w1001ExpRequestDomain = searchByKeyForInit(w1001ExpRequestCriteriaDomain);
        
        W1003CriteriaDomain w1003CriteriaDomain = new W1003CriteriaDomain();
        CommonUtil.copyPropertiesDomainToDomain(w1003CriteriaDomain, w1001ExpRequestDomain);
        
        TmCdCriteriaDomain tmCdCriteria = new TmCdCriteriaDomain();
        tmCdCriteria.setCdTyp(CD_TYPE_TRANS_CD);
        tmCdCriteria.setLngCd(LANGUAGE_CD_ENGLISH);
        tmCdCriteria.setCd(w1003CriteriaDomain.getTrnsCd());
        
        w1003CriteriaDomain.setTrnsCd(tmCdService.searchByKey(tmCdCriteria).getValue());
        
        TtExpRequestDtlCriteriaDomain expRequestDtlCriteria = new TtExpRequestDtlCriteriaDomain();
        
        expRequestDtlCriteria.setExpRequestNo(w1001ExpRequestDomain.getExpRequestNo());
        
        List<? extends TtExpRequestDtlDomain> listResult = ttExpRequestDtlService.searchByCondition(expRequestDtlCriteria);
        
        List<? extends TtExpRequestDtlDomain> qtyUnitList = w1001ExpRequestDao.searchQtyForDtl(expRequestDtlCriteria);
        
        List<? extends TtExpRequestDtlDomain> currList = w1001ExpRequestDao.searchAmountForDtl(expRequestDtlCriteria);
        
        List<W1003CriteriaDomain> qtyList = new ArrayList<W1003CriteriaDomain>();
        
        for (int i = 0; i < qtyUnitList.size(); i += 2 ) {
            W1003CriteriaDomain setQtyDomain = new W1003CriteriaDomain();
            setQtyDomain.setQtyUnit1(qtyUnitList.get(i).getQtyUnit());
            setQtyDomain.setQty1(decimalToString(qtyUnitList.get(i).getQty()));
            if (qtyUnitList.size() > (i + 1)) {
                setQtyDomain.setQtyUnit2(qtyUnitList.get(i + 1).getQtyUnit());
                setQtyDomain.setQty2(decimalToString(qtyUnitList.get(i + 1).getQty()));
            }
            qtyList.add(setQtyDomain);
        }
        
        List<W1003CriteriaDomain> amountList = new ArrayList<W1003CriteriaDomain>();
        
        List<TtExpRequestDtlDomain> amLeftList = new ArrayList<TtExpRequestDtlDomain>();
        List<TtExpRequestDtlDomain> amRightList = new ArrayList<TtExpRequestDtlDomain>();
        
        for (TtExpRequestDtlDomain curr : currList) {
            if (curr.getCommercialFlg().equals(FLAG_Y)) {
                amLeftList.add(curr);
            }else if (curr.getCommercialFlg().equals(FLAG_N)) {
                amRightList.add(curr);
            }    
        }
        int tmp = 0;
        for (int i = 0; i < amLeftList.size(); i++ ) {
            W1003CriteriaDomain setAmountDomain = new W1003CriteriaDomain();
            setAmountDomain.setCurrencyCd1(amLeftList.get(i).getCurrCd());
            setAmountDomain.setUnitPrice1(decimalToString(amLeftList.get(i).getUnitPrice()));
            if (amRightList.size() > tmp) {
                setAmountDomain.setCurrencyCd2(amRightList.get(tmp).getCurrCd());
                setAmountDomain.setUnitPrice2(decimalToString(amRightList.get(tmp).getUnitPrice()));
                tmp++;
            }
            amountList.add(setAmountDomain);
        }
        if (amRightList.size() > tmp) {
            for (int i = tmp; i < amRightList.size(); i++ ) {
                W1003CriteriaDomain setAmountDomain = new W1003CriteriaDomain();
                setAmountDomain.setCurrencyCd2(amRightList.get(i).getCurrCd());
                setAmountDomain.setUnitPrice2(decimalToString(amRightList.get(i).getUnitPrice()));
              
                amountList.add(setAmountDomain);
            }
        }
        
        rtnDomain.setCriteriaDomain(w1003CriteriaDomain);
        rtnDomain.setListDomainList(setListInit(listResult));
        rtnDomain.setQtyList(qtyList);
        rtnDomain.setAmountList(amountList);
        
        return rtnDomain;
    }
    
    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W1001ExpRequestService#transactOnDetailSave(com.globaldenso.eca0027.core.business.domain.W1003UpdateDomain)
     */
    public W1003UpdateDomain transactOnDetailSave(W1003UpdateDomain updateDomain)
        throws ApplicationException {
        
        TtExpRequestDtlCriteriaDomain criteriaDomain = new TtExpRequestDtlCriteriaDomain();
        criteriaDomain.setExpRequestNo(updateDomain.getCriteriaDomain().getExpRequestNo());
        List<TtExpRequestDtlDomain> resultList = ttExpRequestDtlService.searchByCondition(criteriaDomain);
        int seqNo = 0;
        if (resultList.size() != 0) {
            seqNo = resultList.get(resultList.size() - 1).getExpRequestItemId().intValueExact();
        }
        List<TtExpRequestDtlDomain> insertDomainList = new ArrayList<TtExpRequestDtlDomain>();
        List<TtExpRequestDtlDomain> updateDomainList = new ArrayList<TtExpRequestDtlDomain>();
        int i = 1;
        for (W1003ListDomain w1003Domain : updateDomain.getListDomainList() ) {
            TtExpRequestDtlDomain kitDomain = new TtExpRequestDtlDomain();
            if (CheckUtil.isBlankOrNull(w1003Domain.getExpRequestItemId()) && !CheckUtil.isBlankOrNull(w1003Domain.getQty())) {
                String idItem = seqNo + i + "";
                i++;
                w1003Domain.setExpRequestItemId(idItem);
                w1003Domain.setLineNo(idItem); //Issue 159 update line no
                CommonUtil.copyPropertiesDomainToDomain(kitDomain, w1003Domain);
                commonService.setCommonPropertyForRegist(kitDomain, SCREEN_ID_W1003);
                //Issue 117 comment for Issue 160
                //BigDecimal netWeight = kitDomain.getNetWeight().divide(kitDomain.getQty(), 3, BigDecimal.ROUND_HALF_UP);
                //kitDomain.setNetWeight(netWeight);
                kitDomain.setRtUseFlg("Y");
                kitDomain.setPackingStatus("10");
                insertDomainList.add(kitDomain);
            }else if(!CheckUtil.isBlankOrNull(w1003Domain.getExpRequestItemId())){
                CommonUtil.copyPropertiesDomainToDomain(kitDomain, w1003Domain);
                commonService.setCommonPropertyForRegist(kitDomain, SCREEN_ID_W1003);
                //Issue 117 comment for Issue 160
                //BigDecimal netWeight = kitDomain.getNetWeight().divide(kitDomain.getQty(), 3, BigDecimal.ROUND_HALF_UP);
                //kitDomain.setNetWeight(netWeight);
                kitDomain.setPackingStatus("10");
                updateDomainList.add(kitDomain);
            }
        }

        boolean statusUpdate = false;
        if (insertDomainList.size() > 0) {
            ttExpRequestDtlService.create(insertDomainList);
            statusUpdate = true;
        }
        
        if (updateDomainList.size() > 0) {
            //##ISSUE 167
            /*for(TtExpRequestDtlDomain domain : updateDomainList)
            {
                criteriaDomain = new TtExpRequestDtlCriteriaDomain();
                criteriaDomain.setExpRequestNo(domain.getExpRequestNo());
                criteriaDomain.setExpRequestItemId(domain.getExpRequestItemId());
                criteriaDomain.setLineNo(domain.getLineNo());
                TtExpRequestDtlDomain ttExpRequestDtlDomain = ttExpRequestDtlService.searchByKey(criteriaDomain);
                if(ttExpRequestDtlDomain != null )
                {
                    domain.setComUpdateTimestamp(ttExpRequestDtlDomain.getComUpdateTimestamp());
                }
            }*/
            //End ISSUE 167
            ttExpRequestDtlService.update(updateDomainList);
            statusUpdate = true;
        }
        
        if (statusUpdate) {
            W1001ExpRequestDomain expRequest = new W1001ExpRequestDomain();
            expRequest.setExpRequestNo(updateDomain.getCriteriaDomain().getExpRequestNo());
            expRequest.setComUpdateUserId(updateDomain.getCriteriaDomain().getLoginUserDscId());
            expRequest.setRequestStatus("10");
            
            // Setting of a common column
            commonService.setCommonPropertyForRegist(expRequest, SCREEN_ID_W1003);
            
            update(expRequest);
            
            //Clear PackingStatus =10 ##ISSUE 149
            
            //Search Child
            TtExpRequestDtlKitCriteriaDomain kitCriteria = new TtExpRequestDtlKitCriteriaDomain();
            kitCriteria.setExpRequestNo(updateDomain.getCriteriaDomain().getExpRequestNo());
            List<TtExpRequestDtlKitDomain> kitLists = ttExpRequestDtlKitService.searchByCondition(kitCriteria);
            if(kitLists != null && kitLists.size() > 0){
                for(TtExpRequestDtlKitDomain domain : kitLists)
                {
                    domain.setPackingStatus("10");
                    
                }
                ttExpRequestDtlKitService.update(kitLists);
            }
            //Find before Delete Pallet No
            W1007PltzWkCriteriaDomain w1007PltzWkCriteriaDomain = new W1007PltzWkCriteriaDomain();
            w1007PltzWkCriteriaDomain.setExpRequestNo(updateDomain.getCriteriaDomain().getExpRequestNo());
            List<W1007PltzWkDomain> w1007PltzWkDomainList = w1007PltzWkService.searchByCondition(w1007PltzWkCriteriaDomain);
            if(w1007PltzWkDomainList != null && w1007PltzWkDomainList.size() > 0)
            {
                for(W1007PltzWkDomain domain : w1007PltzWkDomainList)
                {
                    w1007PltzWkCriteriaDomain = new W1007PltzWkCriteriaDomain();
                    w1007PltzWkCriteriaDomain.setExpRequestNo(domain.getExpRequestNo());
                    w1007PltzWkCriteriaDomain.setPltzWkId(domain.getPltzWkId());
                    w1007PltzWkService.deleteByExpRequestNo(w1007PltzWkCriteriaDomain);
                }
            }
            
        }
        
        return searchOnDetailInit(updateDomain);
    }
    
    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W1001ExpRequestService#transactOnDetailDelete(com.globaldenso.eca0027.core.business.domain.W1003UpdateDomain)
     */
    public W1003UpdateDomain transactOnDetailDelete(W1003UpdateDomain updateDomain)
        throws ApplicationException {
        
        List<? extends W1003ListDomain> listDomain = updateDomain.getListDomainList();
        List<W1003ListDomain> removerList = new ArrayList<W1003ListDomain>();
        int i = 0;
        for (W1003ListDomain w1003Domain : listDomain) {
            TtExpRequestDtlCriteriaDomain parentCriteria = new TtExpRequestDtlCriteriaDomain();
            if (!CheckUtil.isBlankOrNull(w1003Domain.getExpRequestItemId()) && !CheckUtil.isBlankOrNull(w1003Domain.getSelected())) {
                CommonUtil.copyPropertiesDomainToDomain(parentCriteria, w1003Domain);
                i += ttExpRequestDtlService.delete(parentCriteria);
                
                // delete kit
                TtExpRequestDtlKitCriteriaDomain kitCriteria = new TtExpRequestDtlKitCriteriaDomain();
                kitCriteria.setExpRequestNo(parentCriteria.getExpRequestNo());
                kitCriteria.setExpRequestItemId(parentCriteria.getExpRequestItemId());
                if (ttExpRequestDtlKitService.searchByCondition(kitCriteria).size() > 0) {
                    ttExpRequestDtlKitService.deleteByCondition(kitCriteria);
                }
                removerList.add(w1003Domain);
            }
        }
        
        for (W1003ListDomain remove : removerList ) {
            listDomain.remove(remove);
        }
        
        List<TtExpRequestDtlDomain> updateDomainList = new ArrayList<TtExpRequestDtlDomain>();
        if (listDomain.size() != 0) {
            int j = 1;
            List<TtExpRequestDtlCriteriaDomain> criteriaDomainList = new ArrayList<TtExpRequestDtlCriteriaDomain>();
            
            for (W1003ListDomain w1003Domain : listDomain ) {
                TtExpRequestDtlDomain kitDomain = new TtExpRequestDtlDomain();
                TtExpRequestDtlCriteriaDomain criteriaDomain = new TtExpRequestDtlCriteriaDomain();
                CommonUtil.copyPropertiesDomainToDomain(criteriaDomain, w1003Domain);
                criteriaDomainList.add(criteriaDomain);
                
                //Update LineNO
                w1003Domain.setLineNo(String.format("%03d", j));
                CommonUtil.copyPropertiesDomainToDomain(kitDomain, w1003Domain);
                commonService.setCommonPropertyForRegist(kitDomain, SCREEN_ID_W1003);
                j++;
                updateDomainList.add(kitDomain);
            }
            ttExpRequestDtlService.updateByCondition(updateDomainList, criteriaDomainList);
        }
        
        return searchOnDetailInit(updateDomain);
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W1001ExpRequestService#searchOnKitDetailInit(com.globaldenso.eca0027.core.business.domain.W1004UpdateDomain)
     */
    public W1004UpdateDomain searchOnKitDetailInit(W1004UpdateDomain updateDomain)
        throws ApplicationException {

        W1004UpdateDomain rtnDomain = new W1004UpdateDomain();
        
        TtExpRequestDtlCriteriaDomain expRequestDtlCriteria = new TtExpRequestDtlCriteriaDomain();
        
        expRequestDtlCriteria.setExpRequestNo(updateDomain.getCriteriaDomain().getExpRequestNo());
        expRequestDtlCriteria.setKitParFlg(FLAG_Y);
        expRequestDtlCriteria.setRowNumFrom(updateDomain.getCriteriaDomain().getRowNumFrom());
        expRequestDtlCriteria.setRowNumTo(updateDomain.getCriteriaDomain().getRowNumTo());
        
        List<? extends TtExpRequestDtlDomain> listResult = ttExpRequestDtlService.searchByConditionForPaging(expRequestDtlCriteria);
        
        rtnDomain.setListDomainList(setParentListInit(listResult));
        rtnDomain.setKitList(setKitListInit(rtnDomain.getListDomainList()));
        
        return rtnDomain;
        
    }
    
    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W1001ExpRequestService#transactOnKitDetailSave(com.globaldenso.eca0027.core.business.domain.W1004UpdateDomain)
     */
    public W1004UpdateDomain transactOnKitDetailSave(W1004UpdateDomain updateDomain)
        throws ApplicationException {

        TtExpRequestDtlKitCriteriaDomain kitCriteriaDomain = new TtExpRequestDtlKitCriteriaDomain();
        kitCriteriaDomain.setExpRequestNo(updateDomain.getListDomainList().get(0).getExpRequestNo());
        kitCriteriaDomain.setExpRequestItemId(new BigDecimal(updateDomain.getListDomainList().get(0).getExpRequestItemId()));
        List<TtExpRequestDtlKitDomain> resultList = ttExpRequestDtlKitService.searchByCondition(kitCriteriaDomain);
        int seqNo = 0;
        if (resultList.size() != 0) {
            seqNo = resultList.get(resultList.size() - 1).getExpRequestKitId().intValueExact();
        }
        List<TtExpRequestDtlKitDomain> insertDomainList = new ArrayList<TtExpRequestDtlKitDomain>();
        List<TtExpRequestDtlKitDomain> updateDomainList = new ArrayList<TtExpRequestDtlKitDomain>();
        int i = 1;
        for (W1004KitListDomain w1004KitDomain : updateDomain.getKitList() ) {
            TtExpRequestDtlKitDomain kitDomain = new TtExpRequestDtlKitDomain();
            if (CheckUtil.isBlankOrNull(w1004KitDomain.getExpRequestKitId()) && !CheckUtil.isBlankOrNull(w1004KitDomain.getQty())) {
                String idItem = seqNo + i + "";
                i++;
                w1004KitDomain.setExpRequestKitId(idItem);
                w1004KitDomain.setKitBrch(idItem); //Issue 159 update line no
                CommonUtil.copyPropertiesDomainToDomain(kitDomain, w1004KitDomain);
                commonService.setCommonPropertyForRegist(kitDomain, SCREEN_ID_W1004);
                //Issue 117 comment for Issue 160
                //BigDecimal netWeight = kitDomain.getNetWeight().divide(kitDomain.getQty(), 3, BigDecimal.ROUND_HALF_UP);
                //kitDomain.setNetWeight(netWeight);
                kitDomain.setRtUseFlg("Y");
                kitDomain.setPackingStatus("10");
                insertDomainList.add(kitDomain);
            }else if(!CheckUtil.isBlankOrNull(w1004KitDomain.getExpRequestKitId())){
                CommonUtil.copyPropertiesDomainToDomain(kitDomain, w1004KitDomain);
                commonService.setCommonPropertyForRegist(kitDomain, SCREEN_ID_W1004);
                //Issue 117 comment for Issue 160
                //BigDecimal netWeight = kitDomain.getNetWeight().divide(kitDomain.getQty(), 3, BigDecimal.ROUND_HALF_UP);
                //kitDomain.setNetWeight(netWeight);
                kitDomain.setPackingStatus("10");
                updateDomainList.add(kitDomain);
            }
        }
        
        boolean statusUpdate = false;
        if (insertDomainList.size() > 0) {
            ttExpRequestDtlKitService.create(insertDomainList);
            statusUpdate = true;
        }
        if (updateDomainList.size() > 0) {
            //##ISSUE 167
            /*for(TtExpRequestDtlKitDomain domain : updateDomainList)
            {
                kitCriteriaDomain = new TtExpRequestDtlKitCriteriaDomain();
                kitCriteriaDomain.setExpRequestNo(domain.getExpRequestNo());
                kitCriteriaDomain.setExpRequestItemId(domain.getExpRequestItemId());
                kitCriteriaDomain.setExpRequestKitId(domain.getExpRequestKitId());
                kitCriteriaDomain.setKitBrch(domain.getKitBrch());
                TtExpRequestDtlKitDomain ttExpRequestDtlKitDomain = ttExpRequestDtlKitService.searchByKey(kitCriteriaDomain);
                if(ttExpRequestDtlKitDomain != null )
                {
                    domain.setComUpdateTimestamp(ttExpRequestDtlKitDomain.getComUpdateTimestamp());
                }
            }*/
            //End ISSUE 167
            ttExpRequestDtlKitService.update(updateDomainList);
            statusUpdate = true;
        }
        
        if (statusUpdate) {
            W1001ExpRequestDomain expRequest = new W1001ExpRequestDomain();
            expRequest.setExpRequestNo(updateDomain.getCriteriaDomain().getExpRequestNo());
            expRequest.setComUpdateUserId(updateDomain.getCriteriaDomain().getLoginUserDscId());
            expRequest.setRequestStatus("10");
            
            // Setting of a common column
            commonService.setCommonPropertyForRegist(expRequest, SCREEN_ID_W1004);
            
            update(expRequest);
            
            
            //Clear PackingStatus =10 ##ISSUE 149
            //Search Parent            
            TtExpRequestDtlCriteriaDomain criteriaDomain = new TtExpRequestDtlCriteriaDomain();
            criteriaDomain.setExpRequestNo(updateDomain.getCriteriaDomain().getExpRequestNo());
            List<TtExpRequestDtlDomain> parentList = ttExpRequestDtlService.searchByCondition(criteriaDomain);
            if(parentList != null && parentList.size() > 0)
            {
                for(TtExpRequestDtlDomain domain : parentList){
                    domain.setPackingStatus("10");
                }
                ttExpRequestDtlService.update(parentList);
            }
            
            //Search Other Child
            TtExpRequestDtlKitCriteriaDomain kitCriteria = new TtExpRequestDtlKitCriteriaDomain();
            kitCriteria.setExpRequestNo(updateDomain.getCriteriaDomain().getExpRequestNo());
            List<TtExpRequestDtlKitDomain> kitLists = ttExpRequestDtlKitService.searchByCondition(kitCriteria);
            if(kitLists != null && kitLists.size() > 0){
                for(TtExpRequestDtlKitDomain domain : kitLists)
                {
                    domain.setPackingStatus("10");
                    
                }
                ttExpRequestDtlKitService.update(kitLists);
            }
            
           //Find before Delete Pallet No
            W1007PltzWkCriteriaDomain w1007PltzWkCriteriaDomain = new W1007PltzWkCriteriaDomain();
            w1007PltzWkCriteriaDomain.setExpRequestNo(updateDomain.getCriteriaDomain().getExpRequestNo());
            List<W1007PltzWkDomain> w1007PltzWkDomainList = w1007PltzWkService.searchByCondition(w1007PltzWkCriteriaDomain);
            if(w1007PltzWkDomainList != null && w1007PltzWkDomainList.size() > 0)
            {
                for(W1007PltzWkDomain domain : w1007PltzWkDomainList)
                {
                    w1007PltzWkCriteriaDomain = new W1007PltzWkCriteriaDomain();
                    w1007PltzWkCriteriaDomain.setExpRequestNo(domain.getExpRequestNo());
                    w1007PltzWkCriteriaDomain.setPltzWkId(domain.getPltzWkId());
                    w1007PltzWkService.deleteByExpRequestNo(w1007PltzWkCriteriaDomain);
                }
            }
        }
        
        return searchOnKitDetailInit(updateDomain);
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W1001ExpRequestService#transactOnKitDetailDelete(com.globaldenso.eca0027.core.business.domain.W1004UpdateDomain)
     */
    public W1004UpdateDomain transactOnKitDetailDelete(W1004UpdateDomain updateDomain)
        throws ApplicationException {

        List<? extends W1004KitListDomain> listDomain = updateDomain.getKitList();
        List<W1004KitListDomain> removerList = new ArrayList<W1004KitListDomain>();
        int i = 0;
        for (W1004KitListDomain w1004Domain : listDomain) {
            TtExpRequestDtlKitCriteriaDomain kitCriteriaDomain = new TtExpRequestDtlKitCriteriaDomain();
            if (!CheckUtil.isBlankOrNull(w1004Domain.getExpRequestItemId()) && !CheckUtil.isBlankOrNull(w1004Domain.getSelected())) {
                CommonUtil.copyPropertiesDomainToDomain(kitCriteriaDomain, w1004Domain);
                i += ttExpRequestDtlKitService.delete(kitCriteriaDomain);
                removerList.add(w1004Domain);
            }
        }
        
        for (W1004KitListDomain remove : removerList ) {
            listDomain.remove(remove);
        }
        
        List<TtExpRequestDtlKitDomain> updateDomainList = new ArrayList<TtExpRequestDtlKitDomain>();
        if (listDomain.size() != 0) {
            int j = 1;
            List<TtExpRequestDtlKitCriteriaDomain> criteriaDomainList = new ArrayList<TtExpRequestDtlKitCriteriaDomain>();
            
            for (W1004KitListDomain w1004Domain : listDomain ) {
                TtExpRequestDtlKitDomain kitDomain = new TtExpRequestDtlKitDomain();
                TtExpRequestDtlKitCriteriaDomain criteriaDomain = new TtExpRequestDtlKitCriteriaDomain();
                CommonUtil.copyPropertiesDomainToDomain(criteriaDomain, w1004Domain);
                criteriaDomainList.add(criteriaDomain);
                
                //Update LineNO
                w1004Domain.setKitBrch(String.format("%03d", j));
                CommonUtil.copyPropertiesDomainToDomain(kitDomain, w1004Domain);
                commonService.setCommonPropertyForRegist(kitDomain, SCREEN_ID_W1004);
                j++;
                updateDomainList.add(kitDomain);
            }
            ttExpRequestDtlKitService.updateByCondition(updateDomainList, criteriaDomainList);
        }
        
        return searchOnKitDetailInit(updateDomain);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W1001ExpRequestService#validateConsistencyFmUpdateToUpdate(java.lang.String, java.lang.String, java.lang.String)
     */
    public boolean validateConsistencyFmUpdateToUpdate(String updateDtFrom, String updateDtTo,
        String dateFormat) {
        if (!CheckUtil.isBlankOrNull(updateDtFrom) && !CheckUtil.isBlankOrNull(updateDtTo)) {
            return commonService.validateFromToDate(dateFormat, updateDtFrom, updateDtTo);
        } else {
            return true;
        }
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W1001ExpRequestService#validateDatabaseShipper(java.lang.String)
     */
    public boolean validateDatabaseShipper(String compCd) throws ApplicationException {
        return commonService.validateShipper(compCd);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W1001ExpRequestService#validateDatabaseWs9002OnContensOfABoxRegister(java.lang.String, java.lang.String)
     */
    public boolean validateDatabaseWs9002OnContensOfABoxRegister(String shipperCd, String plntCd)
        throws ApplicationException{
        Ws9002ResultDomain result = ws9002RestService.validateDatabasePlant(shipperCd, plntCd);
        boolean flg = false;
        
        if (WS_RESULT_SUCCESS.equals(result.getResultCode())
            && result.getPlantInfo() != null && !CheckUtil.isBlankOrNull(result.getPlantInfo().getPlantCd())) {
            flg = true;
        }
        return flg;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W1001ExpRequestService#validateDatabaseCompCd(java.lang.String)
     */
    public boolean validateDatabaseCompCd(String shipToCompCd) throws ApplicationException {
        return commonService.validateCompCd(shipToCompCd);
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W1001ExpRequestService#validateDatabaseWhCompanyWhShipper(java.lang.String)
     * @param compCd String
     * @param whCd String
     * @param shipper String
     * @return return boolean
     * @throws ApplicationException ApplicationException
     */
    public boolean validateDatabaseWhCompanyWhShipper(String compCd, String whCd, String shipper)
        throws ApplicationException {
        TmCigmaWhXrefCriteriaDomain tmCigmaWhXrefCriteriaDomain = new TmCigmaWhXrefCriteriaDomain();
        tmCigmaWhXrefCriteriaDomain.setCompCd(compCd);
        tmCigmaWhXrefCriteriaDomain.setWhCd(whCd);
        tmCigmaWhXrefCriteriaDomain.setLgcyLibCompCd(shipper);
        List<TmCigmaWhXrefDomain> tmmCigmaWhXrefList = getTmCigmaWhXref(tmCigmaWhXrefCriteriaDomain);
        if(tmmCigmaWhXrefList == null || tmmCigmaWhXrefList.size() == 0){
            return false;
        }
        return true;
    }
    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W1001ExpRequestService#validateDatabaseSupplierWhCompanyWhShipper(java.lang.String)
     * @param compCd String
     * @param whCd String
     * @param shipper String
     * @return return boolean
     * @throws ApplicationException ApplicationException
     */
    public boolean validateDatabaseSupplierWhCompanyWhShipper(String compCd, String whCd, String shipper)
        throws ApplicationException {
        TmSupplierWhXrefCriteriaDomain tmSupplierWhXrefCriteriaDomain = new TmSupplierWhXrefCriteriaDomain();
        tmSupplierWhXrefCriteriaDomain.setCompCd(compCd);
        tmSupplierWhXrefCriteriaDomain.setWhCd(whCd);
        tmSupplierWhXrefCriteriaDomain.setSupplierCompCd(shipper);
        List<TmSupplierWhXrefDomain> tmSupplierWhXrefList = getTmSupplierWhXref(tmSupplierWhXrefCriteriaDomain);
        if(tmSupplierWhXrefList == null || tmSupplierWhXrefList.size() == 0){
            return false;
        }
        return true;
    }
    /**
     * 
     * <p>Type in the functional overview of the method.</p>
     *
     * @param expRequestNo Export Request No
     * @param expRequestItemId Export Request Item ID
     * @return boolean flag
     * @throws ApplicationException Exceptions
     */
    public boolean validateDatabaseKitIsEmpty(String expRequestNo, String expRequestItemId)
        throws ApplicationException {
        TtExpRequestDtlKitCriteriaDomain kitCriteria = new TtExpRequestDtlKitCriteriaDomain();
        kitCriteria.setExpRequestNo(expRequestNo);
        kitCriteria.setExpRequestItemId(new BigDecimal(expRequestItemId));
        
        List<TtExpRequestDtlKitDomain> kitList = ttExpRequestDtlKitService.searchByCondition(kitCriteria);
        if (kitList == null || kitList.size() > 0) {
            return false;
        }
        return true;
    }
    
    /**
    * 
    * <p>Type in the functional overview of the method.</p>
    *
    * @param expRequestNo Export Request No
    * @param expRequestItemId Export Request Item ID
    * @return boolean flag
    * @throws ApplicationException Exceptions
    */
    public boolean validateDatabaseKitIsCommercial(String expRequestNo, String expRequestItemId)
        throws ApplicationException {
        TtExpRequestDtlKitCriteriaDomain kitCriteria = new TtExpRequestDtlKitCriteriaDomain();
        kitCriteria.setExpRequestNo(expRequestNo);
        kitCriteria.setExpRequestItemId(new BigDecimal(expRequestItemId));

        List<TtExpRequestDtlKitDomain> kitList = ttExpRequestDtlKitService
            .searchByCondition(kitCriteria);
        if (kitList != null) {
            for (TtExpRequestDtlKitDomain ttExpRequestDtlKitDomain : kitList) {
                if (ttExpRequestDtlKitDomain.getCommercialFlg().equalsIgnoreCase("Y")) {
                    return false;
                }
            }
        }
        return true;
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W1001ExpRequestService#validateConsistencyFileExistence(int)
     */
    public boolean validateConsistencyFileExistence(int fileSize) {
        if (fileSize == 0) {
            return false;
        }
        return true;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W1001ExpRequestService#validateConsistencyFilePathInput(String)
     */
    public boolean validateConsistencyFilePathInput(String fileName) {
        if (StringUtils.isEmpty(fileName)) {
            return false;
        }
        return true;  
    }
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W2001PltzInstrService#validateConsistencyShipperPlantAuth(java.lang.String, java.lang.String)
     */
    public boolean validateConsistencyShipperPlantAuth(String shipperCd, String plntCd) throws ApplicationException {
        return userAuthService.hasUserAuthForCompPlnt(PERMIT_FUNC_ID_W1001R, shipperCd, plntCd);
    }
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W1001ExpRequestService#validateConsistencyFileSize(int)
     */
    public boolean validateConsistencyFileSize(int fileSize) {
        if (FILE_SIZE_MAX < fileSize) {
            return false;
        }
        return true;
    }
    
    /**
     * Export Request
     * <br />梱包指示NOを発行します。
     *
     * @param companyCd <br />
     * @return Export Request NO<br />
     * @throws ApplicationException <br />
     */
    protected String getExpRequestNo(String companyCd) throws ApplicationException {
        // The time zone converted date of Shipper is acquired.
        // Shipperのタイムゾーン変換日付を取得
        Date sysdate 
            = DateUtil.convertTime(new Date(), "0000000001");
        
        String year = new SimpleDateFormat("y").format(sysdate);
        String month = new SimpleDateFormat("MM").format(sysdate);
    
        // Create of an assignment-of-order-numbers key
        // 採番キーの作成
        String expRequestNoSeqKey = companyCd + year.substring(1, 2) + month;
    
        // Consecutive acquisition
        // 連番の取得
        String expRequestNoSeq 
            = commonService.transactSequence(expRequestNoSeqKey, SEQ_TYP_REQUEST_NO, 1, SCREEN_ID_W1002).get(0);
        
        return expRequestNoSeqKey + expRequestNoSeq;
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W1001ExpRequestService#getTmCigmaWhXref(com.globaldenso.eca0027.core.business.domain.criteria.TmCigmaWhXrefCriteriaDomain)
     * @param tmCigmaWhXrefCriteriaDomain TmCigmaWhXrefCriteriaDomain
     * @return
     * @throws ApplicationException ApplicationException
     */
    protected List<TmCigmaWhXrefDomain> getTmCigmaWhXref(
        TmCigmaWhXrefCriteriaDomain tmCigmaWhXrefCriteriaDomain)
        throws ApplicationException {
    
        return tmCigmaWhXrefService
            .searchByCondition(tmCigmaWhXrefCriteriaDomain);
    }
    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.service.W1001ExpRequestService#getTmSupplierWhXref(com.globaldenso.eca0027.core.business.domain.criteria.TmSupplierWhXrefCriteriaDomain)
     * @param tmSupplierWhXrefCriteriaDomain TmSupplierWhXrefCriteriaDomain
     * @return
     * @throws ApplicationException ApplicationException
     */
    protected List<TmSupplierWhXrefDomain> getTmSupplierWhXref(
        TmSupplierWhXrefCriteriaDomain tmSupplierWhXrefCriteriaDomain)
        throws ApplicationException {
    
        return tmSupplierWhXrefService
            .searchByCondition(tmSupplierWhXrefCriteriaDomain);
    }
    /**
     * Change the VALUE of BigDecimal into a string.
     * <br />BigDecimalの値を文字列に変換する。
     * <pre>
     * - null is returned when an argument is null.
     *     When this is not null, the result of having carried out {@link BigDecimal#toPlainString()} to the argument is returned.
     * </pre>
     * <pre>
     * - 引数がnullの場合は、null を返す。
     *   nullでない場合は、引数に対して {@link BigDecimal#toPlainString()} を実施した結果を返す。
     * </pre>
     * @param decimalVal The VALUE of BigDecimal<br />BigDecimalの値
     * @return String<br />文字列
     */
    protected String decimalToString(BigDecimal decimalVal){
        
        if (decimalVal == null ) {
            return null;
        }
        return decimalVal.toPlainString();
        
    }

    /**
     * Set up list
     * <br />Listの値を文字列に変換する。
     * <pre>
     * @param list TtExpRequestDtlDomain<br />TtExpRequestDtlDomainの値
     * @return ListW1003ListDomain<br />文字列
     */
    protected List<W1003ListDomain> setListInit(List<? extends TtExpRequestDtlDomain> list) {
        List<W1003ListDomain> result = new ArrayList<W1003ListDomain>();
        
        for (TtExpRequestDtlDomain expRequestDtlDomain : list) {
            W1003ListDomain w1003ListDomain = new W1003ListDomain();
            w1003ListDomain.setExpRequestNo(expRequestDtlDomain.getExpRequestNo());
            w1003ListDomain.setExpRequestItemId(decimalToString(expRequestDtlDomain.getExpRequestItemId()));
            w1003ListDomain.setLineNo(decimalToString(expRequestDtlDomain.getLineNo()));
            w1003ListDomain.setKitParFlg(expRequestDtlDomain.getKitParFlg());
            w1003ListDomain.setCustomerPoNo(expRequestDtlDomain.getCustomerPoNo());
            w1003ListDomain.setCustomerItemNo(expRequestDtlDomain.getCustomerItemNo());
            w1003ListDomain.setDescription(expRequestDtlDomain.getDescription());
            w1003ListDomain.setItemNo(expRequestDtlDomain.getItemNo());
            w1003ListDomain.setPkgCd(expRequestDtlDomain.getPkgCd());
            w1003ListDomain.setOriginCntryCd(expRequestDtlDomain.getOriginCntryCd());
            w1003ListDomain.setQtyUnit(expRequestDtlDomain.getQtyUnit());
            w1003ListDomain.setQty(decimalToString(expRequestDtlDomain.getQty()));
            w1003ListDomain.setUnitPrice(decimalToString(expRequestDtlDomain.getUnitPrice()));
            w1003ListDomain.setCurrCd(expRequestDtlDomain.getCurrCd());
            //Issue 117 comment for Issue 160
            //w1003ListDomain.setNetWeight(decimalToString(expRequestDtlDomain.getNetWeight().multiply(expRequestDtlDomain.getQty()).setScale(3, RoundingMode.HALF_UP)));
            w1003ListDomain.setNetWeight(decimalToString(expRequestDtlDomain.getNetWeight()));
            w1003ListDomain.setTotalNetWeight(decimalToString(expRequestDtlDomain.getNetWeight().multiply(expRequestDtlDomain.getQty()).setScale(3, RoundingMode.HALF_UP)));
            w1003ListDomain.setDngrGoodsImpExpCtrl(expRequestDtlDomain.getDngrGoodsImpExpCtrl());
            w1003ListDomain.setCommercialFlg(expRequestDtlDomain.getCommercialFlg());
            w1003ListDomain.setReExpGoodsFlg(expRequestDtlDomain.getReExpGoodsFlg());
            w1003ListDomain.setLocationNo(expRequestDtlDomain.getLocationNo());
            w1003ListDomain.setConstructionWorkNo(expRequestDtlDomain.getConstructionWorkNo());
            w1003ListDomain.setComUpdateTimestamp(expRequestDtlDomain.getComUpdateTimestamp());
            result.add(w1003ListDomain);
        }
        
        return result;
    }

    /**
     * Set up list
     * <br />Listの値を文字列に変換する。
     * <pre>
     * @param list TtExpRequestDtlDomain<br />TtExpRequestDtlDomainの値
     * @return ListW1004ListDomain<br />文字列
     * @throws ApplicationException ApplicationException
     */
    protected List<W1004ListDomain> setParentListInit(List<? extends TtExpRequestDtlDomain> list) throws ApplicationException {
        List<W1004ListDomain> result = new ArrayList<W1004ListDomain>();
        
        for (TtExpRequestDtlDomain expRequestDtlDomain : list) {
            W1004ListDomain w1004ListDomain = new W1004ListDomain();
            w1004ListDomain.setExpRequestNo(expRequestDtlDomain.getExpRequestNo());
            w1004ListDomain.setExpRequestItemId(decimalToString(expRequestDtlDomain.getExpRequestItemId()));
            w1004ListDomain.setLineNo(decimalToString(expRequestDtlDomain.getLineNo()));
            w1004ListDomain.setKitParFlg(expRequestDtlDomain.getKitParFlg());
            w1004ListDomain.setCustomerPoNo(expRequestDtlDomain.getCustomerPoNo());
            w1004ListDomain.setCustomerItemNo(expRequestDtlDomain.getCustomerItemNo());
            w1004ListDomain.setDescription(expRequestDtlDomain.getDescription());
            w1004ListDomain.setItemNo(expRequestDtlDomain.getItemNo());
            w1004ListDomain.setPkgCd(expRequestDtlDomain.getPkgCd());
            w1004ListDomain.setOriginCntryCd(expRequestDtlDomain.getOriginCntryCd());
            w1004ListDomain.setQtyUnit(expRequestDtlDomain.getQtyUnit());
            w1004ListDomain.setQty(decimalToString(expRequestDtlDomain.getQty()));
            w1004ListDomain.setUnitPrice(decimalToString(expRequestDtlDomain.getUnitPrice()));
            w1004ListDomain.setCurrCd(expRequestDtlDomain.getCurrCd());
            //Issue 117 comment for Issue 160
            //w1004ListDomain.setNetWeight(decimalToString(expRequestDtlDomain.getNetWeight().multiply(expRequestDtlDomain.getQty()).setScale(3, RoundingMode.HALF_UP)));
            w1004ListDomain.setNetWeight(decimalToString(expRequestDtlDomain.getNetWeight()));
            w1004ListDomain.setTotalNetWeight(decimalToString(expRequestDtlDomain.getNetWeight().multiply(expRequestDtlDomain.getQty()).setScale(3, RoundingMode.HALF_UP)));
            w1004ListDomain.setDngrGoodsImpExpCtrl(expRequestDtlDomain.getDngrGoodsImpExpCtrl());
            w1004ListDomain.setCommercialFlg(expRequestDtlDomain.getCommercialFlg());
            w1004ListDomain.setReExpGoodsFlg(expRequestDtlDomain.getReExpGoodsFlg());
            w1004ListDomain.setLocationNo(expRequestDtlDomain.getLocationNo());
            w1004ListDomain.setConstructionWorkNo(expRequestDtlDomain.getConstructionWorkNo());
            w1004ListDomain.setComUpdateTimestamp(expRequestDtlDomain.getComUpdateTimestamp());
            
            result.add(w1004ListDomain);
        }
        
        return result;
    }

    /**
     * Set up list
     * <br />Listの値を文字列に変換する。
     * <pre>
     * @param list TtExpRequestDtlDomain<br />TtExpRequestDtlDomainの値
     * @return ListW1004KitListDomain<br />文字列
     * @throws ApplicationException ApplicationException
     */
    protected List<W1004KitListDomain> setKitListInit(List<? extends W1004ListDomain> list) throws ApplicationException {
        
        TtExpRequestDtlKitCriteriaDomain kitCriteriaDomain = new TtExpRequestDtlKitCriteriaDomain();
        
        kitCriteriaDomain.setExpRequestNo(list.get(0).getExpRequestNo());
        kitCriteriaDomain.setExpRequestItemId(new BigDecimal(list.get(0).getExpRequestItemId()));
        
        // get kit
        List<TtExpRequestDtlKitDomain> resultKit = ttExpRequestDtlKitService.searchByCondition(kitCriteriaDomain);
        
        List<W1004KitListDomain> kitList = new ArrayList<W1004KitListDomain>();
        if (resultKit.size() > 0) {
            for (TtExpRequestDtlKitDomain kitDomain : resultKit) {
                W1004KitListDomain w1004KitListDomain = new W1004KitListDomain();
                //Issue 117 comment for Issue 160
                //kitDomain.setNetWeight(kitDomain.getNetWeight().multiply(kitDomain.getQty()).setScale(3, RoundingMode.HALF_UP));
                CommonUtil.copyPropertiesDomainToDomain(w1004KitListDomain, kitDomain);
                w1004KitListDomain.setTotalNetWeight(decimalToString(kitDomain.getNetWeight().multiply(kitDomain.getQty()).setScale(3, RoundingMode.HALF_UP)));
                kitList.add(w1004KitListDomain);
            }
        }else{
            for (int i = 0; i < 10; i++ ) {
                W1004KitListDomain w1004KitListDomain = new W1004KitListDomain();
                w1004KitListDomain.setDngrGoodsImpExpCtrl("N");
                w1004KitListDomain.setExpRequestNo(list.get(0).getExpRequestNo());
                w1004KitListDomain.setExpRequestItemId(list.get(0).getExpRequestItemId());
                w1004KitListDomain.setKitBrch(i + 1 + "");
                w1004KitListDomain.setCurrency(list.get(0).getCurrCd());
                //Issue 077
                w1004KitListDomain.setOriginCntryCd(list.get(0).getOriginCntryCd());
                w1004KitListDomain.setQtyUnit(list.get(0).getQtyUnit());
                //Issue 140
                w1004KitListDomain.setCommercialFlg(list.get(0).getCommercialFlg());
                kitList.add(w1004KitListDomain);
            }
        }
        
        return kitList;
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W1001ExpRequestService#searchUnitOfVolumePullDownList(boolean, boolean)
     */
    public List<? extends SelectListItemDomain> searchUnitOfVolumePullDownList(
        boolean dispCode, boolean addBlank) throws ApplicationException {

        // Acquisition of a Measure Unit Master
        // 計量単位原単位の取得
        TmMeasureUnitCriteriaDomain tmMeasureUnitCriteriaDomain
            = new TmMeasureUnitCriteriaDomain();
        List<TmMeasureUnitDomain> searchList
            = tmMeasureUnitService.searchByCondition(tmMeasureUnitCriteriaDomain);

        // Create of a pulldown list
        // プルダウンリストの作成
        List<SelectListItemDomain> list = new ArrayList<SelectListItemDomain>();
        SelectListItemDomain bean = null;
        if (addBlank){
            bean = new SelectListItemDomain();
            bean.setId("");
            bean.setName("");
            list.add(bean);
        }
        for (TmMeasureUnitDomain domain : searchList) {
            bean = new SelectListItemDomain();
            bean.setId(domain.getUnitCd());
            if (dispCode) {
                bean.setName(domain.getUnitCd() + ":" + domain.getUnitNm());
            } else {
                bean.setName(domain.getUnitDisp());
            }
            list.add(bean);
        }

        return list;
    }
}
