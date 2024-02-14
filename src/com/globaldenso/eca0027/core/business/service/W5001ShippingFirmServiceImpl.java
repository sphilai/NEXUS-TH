package com.globaldenso.eca0027.core.business.service;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.AFTER_VANNING;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.BEFORE_VANNING;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.BOTH_VANNING;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CONTAINER_LOOSE_TYP_FULL_CONTAINER;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CONTAINER_LOOSE_TYP_LOOSE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FORMAT_VOLUME;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FORMAT_WEIGHT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0010;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0062;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0064;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0065;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0157;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PLTZ_STATUS_CUSTOMS_CLEARANCE_B;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PLTZ_STATUS_CUSTOMS_CLEARANCE_Z;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PLTZ_STATUS_SHIPPING_COMFIRMATION;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PLTZ_STATUS_SHIPPING_COMFIRMATION_ACTUAL;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PLTZ_STATUS_STG_ACT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W5003;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W5004;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SEQ_TYP_CONFIRMATION_NO;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SHIPPING_FIRM_STATUS_ISSUE_LIST;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SHIPPING_FIRM_STATUS_WORKED_DONE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WORKED_METH_TYP_INSTR;

import java.io.File;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.dao.TtPltzDao;
import com.globaldenso.eca0027.core.auto.business.dao.TtShippingFirmDao;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtShippingFirmDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtShippingFirmCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TtPltzService;
import com.globaldenso.eca0027.core.auto.business.service.TtShippingFirmService;
import com.globaldenso.eca0027.core.business.dao.W5001ShippingFirmDao;
import com.globaldenso.eca0027.core.business.domain.W5001CmlDomain;
import com.globaldenso.eca0027.core.business.domain.W5001ShippingFirmCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W5001ShippingFirmDomain;
import com.globaldenso.eca0027.core.business.domain.W5001StgCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W5001StgDomain;
import com.globaldenso.eca0027.core.business.domain.W5004CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W5004ListDomain;
import com.globaldenso.eca0027.core.business.domain.W5004UpdateDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.util.CheckUtil;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.DateUtil;
import com.globaldenso.gscm.framework.util.NumberUtil;
import com.globaldenso.gscm.framework.util.StringUtil;

/**
 * Implementation class of service that provides a shipping confirmation function.
 * <br />出荷確認機能を提供するサービスの実装クラスです。
 * <pre>
 * bean id:w5001ShippingFirmService
 * </pre>
 *
 * @author $Author: 400616000407 $
 * @version $Revision: 13346 $
 */
public class W5001ShippingFirmServiceImpl implements W5001ShippingFirmService {

    /**
     * common service.
     */
    protected CommonService commonService;
    
    /**
     * W5001ShippingFirmDao DAO.
     */
    protected W5001ShippingFirmDao w5001ShippingFirmDao;
    
    /**
     * TtShippingFirmService service.
     */
    protected TtShippingFirmService ttShippingFirmService;
    
    /**
     * TtPltzService service.
     */
    protected TtPltzService ttPltzService;
    
    /**
     * L5001ReportService service.
     */
    protected L5001ReportService l5001ReportService;
    
    /**
     * TtShippingFirmDao DAO.
     */
    protected TtShippingFirmDao ttShippingFirmDao;
    
    /**
     * TtPltzDao DAO.
     */
    protected TtPltzDao ttPltzDao;
    
    /**
     * constructor.
     */
    public W5001ShippingFirmServiceImpl() {
    }
    
    // ------------------- 依存サービス・DaoのGetter / Setter -------------------
    
    /**
     * Setter method for commonService.
     *
     * @param commonService Set for commonService
     */
    public void setCommonService(CommonService commonService) {
        this.commonService = commonService;
    }
    
    /**
     * Setter method for ttShippingFirmService.
     *
     * @param ttShippingFirmService Set for ttShippingFirmService
     */
    public void setTtShippingFirmService(TtShippingFirmService ttShippingFirmService) {
        this.ttShippingFirmService = ttShippingFirmService;
    }
    
    /**
     * Setter method for ttPltzService.
     *
     * @param ttPltzService Set for ttPltzService
     */
    public void setTtPltzService(TtPltzService ttPltzService) {
        this.ttPltzService = ttPltzService;
    }
    
    /**
     * Setter method for w5001ShippingFirmDao.
     *
     * @param w5001ShippingFirmDao Set for w5001ShippingFirmDao
     */
    public void setW5001ShippingFirmDao(W5001ShippingFirmDao w5001ShippingFirmDao) {
        this.w5001ShippingFirmDao = w5001ShippingFirmDao;
    }
    
    /**
     * Setter method for l5001ReportService.
     *
     * @param l5001ReportService Set for l5001ReportService
     */
    public void setL5001ReportService(L5001ReportService l5001ReportService) {
        this.l5001ReportService = l5001ReportService;
    }
    
    /**
     * Setter method for ttShippingFirmDao.
     *
     * @param ttShippingFirmDao Set for ttShippingFirmDao
     */
    public void setTtShippingFirmDao(TtShippingFirmDao ttShippingFirmDao) {
        this.ttShippingFirmDao = ttShippingFirmDao;
    }
    
    /**
     * Setter method for ttPltzDao.
     *
     * @param ttPltzDao Set for ttPltzDao
     */
    public void setTtPltzDao(TtPltzDao ttPltzDao) {
        this.ttPltzDao = ttPltzDao;
    }
    
    //--------------------------------- パラメータチェックメソッド validateConsistency ----------------------------------
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W5001ShippingFirmService#validateConsistencyFmEtdToEtd(java.lang.String, java.lang.String, java.util.Locale, java.lang.String)
     */
    public boolean validateConsistencyFmEtdToEtd(String etdFrom, String etdTo, String dateFormat) {
        
        if (!CheckUtil.isBlankOrNull(etdFrom) && !CheckUtil.isBlankOrNull(etdTo)) {
            return commonService.validateFromToDate(dateFormat, etdFrom, etdTo);
        } else {
            return true;
        }
    }
    
    //--------------------------------- データベースチェックメソッド validateDatabase ----------------------------------
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W5001ShippingFirmService#validateDatabaseWhCompanyWh(java.lang.String, java.lang.String)
     */
    public boolean validateDatabaseWhCompanyWh(String whCompCd, String nexusWhCd)
        throws ApplicationException {
        
        // Do W / H Company, the NEXUS W / H combination check.
        // W/H Company、NEXUS W/H 組み合わせチェック
        return commonService.validateCompWh(whCompCd, nexusWhCd);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W5001ShippingFirmService#validateDatabaseAfterDate(java.lang.String, java.lang.String, java.util.Locale, java.lang.String)
     */
    public boolean validateDatabaseAfterDate(String date, String dateFormat, String loginUserTimezoneId)
        throws ApplicationException {
        
        // Make the past day check using the time zone of login user.
        // ログイン者のタイムゾーンを使用して過去日チェックを行います。
        return commonService.validateAfterDate(date, dateFormat, loginUserTimezoneId);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W5001ShippingFirmService#validateDatabaseCarrier(java.lang.String)
     */
    public boolean validateDatabaseCarrier(String compCd)
        throws ApplicationException {
        // Check the shipping company existence check.
        // 運送会社存在チェックを行います。
        return commonService.validateCarrier(compCd);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W5001ShippingFirmService#validateDatabaseTtPltzOnRegister(com.globaldenso.eca0027.core.business.domain.W5004ListDomain)
     */
    public List<? extends MessageDomain> validateDatabaseTtPltzOnRegister(
        W5004ListDomain listDomain)
        throws ApplicationException {
        
        // Creating an Error List
        // エラーリストの作成
        List<MessageDomain> errorList = new ArrayList<MessageDomain>();
        
        W5001ShippingFirmCriteriaDomain shippingFirmCriteriaDomain 
            = new W5001ShippingFirmCriteriaDomain();
        shippingFirmCriteriaDomain.setMainMark(listDomain.getMainMark());
        shippingFirmCriteriaDomain.setXmainMark(listDomain.getXmainMark());
        
        // Lock of palletizing
        // パレタイズのロック
        List<? extends W5001CmlDomain>  w5001CmlDomainList = 
            w5001ShippingFirmDao.lockTtPltzByXmainMarkOrMainMarkNoWait(shippingFirmCriteriaDomain);
        
        // Check for the existence of palletizing.
        // パレタイズの存在チェック
        if (w5001CmlDomainList.size() == 0) {
            throw new GscmApplicationException(GSCM_E0_0010);
        } else {
            
            // Check status of palletizing.
            // パレタイズのステータスチェック
            for (W5001CmlDomain w5001CmlDomain : w5001CmlDomainList) {
                
                String customTimingTyp = w5001CmlDomain.getCustomTimingTyp();
                String pltzStatus = w5001CmlDomain.getPltzStatus();
                String containerLooseTyp = w5001CmlDomain.getContainerLooseTyp();
                
                Boolean errFlg = true;

                if (AFTER_VANNING.equals(customTimingTyp) 
                    && !PLTZ_STATUS_STG_ACT.equals(pltzStatus)) {
                    errFlg = false;
                } else if (BEFORE_VANNING.equals(customTimingTyp) 
                    && !PLTZ_STATUS_CUSTOMS_CLEARANCE_B.equals(pltzStatus)) {
                    errFlg = false;
                } else if (BOTH_VANNING.equals(customTimingTyp)) {
                    if (CONTAINER_LOOSE_TYP_FULL_CONTAINER.equals(containerLooseTyp) 
                        && !PLTZ_STATUS_STG_ACT.equals(pltzStatus)) {
                        errFlg = false;
                    } else if (CONTAINER_LOOSE_TYP_LOOSE.equals(containerLooseTyp) 
                        && !PLTZ_STATUS_CUSTOMS_CLEARANCE_Z.equals(pltzStatus)) {
                        errFlg = false;
                    }
                }
                
                if (!errFlg) {
                    String[] properties = {w5001CmlDomain.getMainMark()};
                    errorList.add(new MessageDomain("", NXS_E1_0062, properties));
                }
            }
        }
        return errorList;
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W5001ShippingFirmService#validateDatabaseTtShippingFirmOnRegisterReUpdateContainerNo(java.lang.String)
     */
    public boolean validateDatabaseTtShippingFirmOnRegisterReUpdateContainerNo(
        String shippingFirmNo)
        throws ApplicationException {
        
        TtShippingFirmCriteriaDomain criteria = new TtShippingFirmCriteriaDomain();
        criteria.setShippingFirmNo(shippingFirmNo);
        
        TtShippingFirmDomain domain = ttShippingFirmDao.lockByKeyNoWait(criteria);
        
        // Can not get the data, and error.
        // データが取得できない場合、エラー。
        if (domain == null) {
            throw new GscmApplicationException(GSCM_E0_0010);
        }
        
        return true;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W5001ShippingFirmService#validateDatabaseTtPltzOnRegisterReUpdateContainerNo(java.lang.String)
     */
    public List<? extends MessageDomain> validateDatabaseTtPltzOnRegisterReUpdateContainerNo(String shippingFirmNo)
        throws ApplicationException {
        
        // Creating an Error List.
        List<MessageDomain> errorList = new ArrayList<MessageDomain>();
        
        W5001ShippingFirmCriteriaDomain shippingFirmCriteriaDomain 
            = new W5001ShippingFirmCriteriaDomain();
        shippingFirmCriteriaDomain.setShippingFirmNo(shippingFirmNo);
        
        List<? extends W5001CmlDomain>  w5001CmlDomainList = w5001ShippingFirmDao
            .lockTtPltzTtInvoiceByShippingFirmNoNoWait(shippingFirmCriteriaDomain);
        
        // Can not get the data, and error.
        // データが取得できない場合、エラー。
        if (w5001CmlDomainList.size() == 0) {
            throw new GscmApplicationException(GSCM_E0_0010);
        }
        
        // Check the process of X CML / CML, whether there ahead of shipments
        // X CML/CMLの工程が、出荷実績より進んでないかをチェックする
        for (W5001CmlDomain w5001CmlDomain : w5001CmlDomainList) {
            if (w5001CmlDomain.getShippingActNo() != null) {
                Object[] param = {w5001CmlDomain.getMainMark()};
                errorList.add(new MessageDomain("", NXS_E1_0064, param));
            }
        }
        return errorList;
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W5001ShippingFirmService#validateDatabaseTtShippingFirmOnRegisterWorking(java.lang.String)
     */
    public boolean validateDatabaseTtShippingFirmOnRegisterWorking(String shippingFirmNo)
        throws ApplicationException {
        
        TtShippingFirmCriteriaDomain criteria = new TtShippingFirmCriteriaDomain();
        criteria.setShippingFirmNo(shippingFirmNo);
        TtShippingFirmDomain domain = ttShippingFirmService.lockByKeyNoWait(criteria);
        
        // Can not get the data, and error.
        // データが取得できない場合、エラー。
        if (domain == null) {
            throw new GscmApplicationException(GSCM_E0_0010);
        }
        
        // Check out the process of shipping confirmation, or not is ahead shipping confirmation
        // 出荷確認の工程が、出荷確認より進んでいないかをチェック
        if (!SHIPPING_FIRM_STATUS_ISSUE_LIST.equals(domain.getShippingFirmStatus())) {
            return false;
        }
        
        return true;
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W5001ShippingFirmService#validateDatabaseTtShippingFirmOnRegisterCancel(java.lang.String)
     */
    public boolean validateDatabaseTtShippingFirmOnRegisterCancel(String shippingFirmNo)
        throws ApplicationException {
        
        TtShippingFirmCriteriaDomain criteria = new TtShippingFirmCriteriaDomain();
        criteria.setShippingFirmNo(shippingFirmNo);
        
        TtShippingFirmDomain domain = ttShippingFirmService.lockByKeyNoWait(criteria);
        
        // Can not get the data, and error.
        // データが取得できない場合、エラー。
        if (domain == null) {
            throw new GscmApplicationException(GSCM_E0_0010);
        }
        
        return true;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W5001ShippingFirmService#validateDatabaseTtPltzOnRegisterCancel(java.lang.String)
     */
    public List<? extends MessageDomain> validateDatabaseTtPltzOnRegisterCancel(
        String shippingFirmNo)
        throws ApplicationException {
        
        // Creating an Error List.
        List<MessageDomain> errorList = new ArrayList<MessageDomain>();
        
        // Lock of palletizing.
        // パレタイズのロック
        W5001ShippingFirmCriteriaDomain shippingFirmCriteriaDomain 
            = new W5001ShippingFirmCriteriaDomain();
        shippingFirmCriteriaDomain.setShippingFirmNo(shippingFirmNo);
        List<? extends W5001CmlDomain>  w5001CmlDomainList = 
            w5001ShippingFirmDao.lockTtPltzByShippingFirmNoNoWait(shippingFirmCriteriaDomain);
        
        // Check for the existence of palletizing.
        // パレタイズの存在チェック
        if (w5001CmlDomainList.size() == 0) {
            throw new GscmApplicationException(GSCM_E0_0010);
        } else {
            
            // Check status of palletizing.
            // パレタイズのステータスチェック
            for (W5001CmlDomain w5001CmlDomain : w5001CmlDomainList) {
                String customTimingTyp = w5001CmlDomain.getCustomTimingTyp();
                
                // Checking the Status.
                // ステータスのチェック
                if ("A".equals(customTimingTyp)) {
                    if (w5001CmlDomain.getInvoiceNo() != null) {
                        String[] properties = {w5001CmlDomain.getMainMark()};
                        errorList.add(new MessageDomain("", NXS_E1_0065, properties));
                    }
                } else if ("B".equals(customTimingTyp) || "Z".equals(customTimingTyp)) {
                    if (w5001CmlDomain.getShippingActNo() != null) {
                        String[] properties = {w5001CmlDomain.getMainMark()};
                        errorList.add(new MessageDomain("", NXS_E1_0064, properties));
                    }
                }
            }
        }
        
        return errorList;
    }
    
    //--------------------------------- 検索系メソッド search ----------------------------------
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W5001ShippingFirmService#searchCountForPagingOnMainSearch(com.globaldenso.eca0027.core.business.domain.W5001ShippingFirmCriteriaDomain)
     */
    public int searchCountForPagingOnMainSearch(
        W5001ShippingFirmCriteriaDomain shippingFirmCriteriaDomain)
        throws ApplicationException {
        return w5001ShippingFirmDao.searchCountForPagingOnMainSearch(shippingFirmCriteriaDomain);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W5001ShippingFirmService#searchForPagingOnMainSearch(com.globaldenso.eca0027.core.business.domain.W5001ShippingFirmCriteriaDomain)
     */
    public List<? extends W5001ShippingFirmDomain> searchForPagingOnMainSearch(
        W5001ShippingFirmCriteriaDomain shippingFirmCriteriaDomain)
        throws ApplicationException {
        return (List<? extends W5001ShippingFirmDomain>)
            w5001ShippingFirmDao.searchForPagingOnMainSearch(shippingFirmCriteriaDomain);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W5001ShippingFirmService#searchCountForPagingOnCreateSearch(com.globaldenso.eca0027.core.business.domain.W5001StgCriteriaDomain)
     */
    public int searchCountForPagingOnCreateSearch(W5001StgCriteriaDomain stgCriteriaDomain)
        throws ApplicationException {
        return w5001ShippingFirmDao.searchCountForPagingOnCreateSearch(stgCriteriaDomain);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W5001ShippingFirmService#searchForPagingOnCreateSearch(com.globaldenso.eca0027.core.business.domain.W5001StgCriteriaDomain)
     */
    public List<? extends W5001StgDomain> searchForPagingOnCreateSearch(
        W5001StgCriteriaDomain stgCriteriaDomain)
        throws ApplicationException {
        return (List<? extends W5001StgDomain>)
            w5001ShippingFirmDao.searchForPagingOnCreateSearch(stgCriteriaDomain);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W5001ShippingFirmService#searchOnRegisterInitByFromMain(com.globaldenso.eca0027.core.business.domain.W5001ShippingFirmCriteriaDomain)
     */
    public W5001ShippingFirmDomain searchOnRegisterInitByFromMain(
            W5001ShippingFirmCriteriaDomain shippingFirmCriteriaDomain)
        throws ApplicationException {
        return w5001ShippingFirmDao.searchOnRegisterInitByFromMain(shippingFirmCriteriaDomain);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W5001ShippingFirmService#searchOnRegisterInitByFromCreateStgInstr(com.globaldenso.eca0027.core.business.domain.W5001ShippingFirmCriteriaDomain)
     */
    public W5001ShippingFirmDomain searchOnRegisterInitByFromCreateStgInstr(
        W5001ShippingFirmCriteriaDomain shippingFirmCriteriaDomain)
        throws ApplicationException {
        return w5001ShippingFirmDao.searchOnRegisterInitByFromCreateStgInstr(
            shippingFirmCriteriaDomain);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W5001ShippingFirmService#searchOnRegisterInitByFromCreateStgAct(com.globaldenso.eca0027.core.business.domain.W5001ShippingFirmCriteriaDomain)
     */
    public W5001ShippingFirmDomain searchOnRegisterInitByFromCreateStgAct(
        W5001ShippingFirmCriteriaDomain shippingFirmCriteriaDomain)
        throws ApplicationException {
        return w5001ShippingFirmDao.searchOnRegisterInitByFromCreateStgAct(
            shippingFirmCriteriaDomain);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W5001ShippingFirmService#printShippingFirm(com.globaldenso.eca0027.core.business.domain.W5001ShippingFirmDomain)
     */
    public File printShippingFirm(W5001ShippingFirmDomain shippingFirmCriteriaDomain, 
        String reportDateFormat)
        throws ApplicationException {
        
        return l5001ReportService.searchTtShippingFirm(shippingFirmCriteriaDomain, reportDateFormat);
    }

    //--------------------------------- トランザクション系メソッド transact ----------------------------------
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W5001ShippingFirmService#transactOnRegister(com.globaldenso.eca0027.core.business.domain.W5004UpdateDomain)
     */
    public W5001ShippingFirmDomain transactOnRegister(W5004UpdateDomain updateDomain)
        throws ApplicationException {
        
        W5004CriteriaDomain criteriaDomain = updateDomain.getCriteriaDomain();
        String shippingFirmNo = getShippingFirmNo(criteriaDomain);
        
        // Registration process of shipping confirmation.
        // 出荷確認の登録処理
        criteriaDomain.setShippingFirmNo(shippingFirmNo);
        createTtShippingFirm(criteriaDomain);
        
        // Update process of palletizing.
        // パレタイズの更新処理
        updateTtPltz(updateDomain);
        
        // Create a search condition.
        // 検索条件の作成
        W5001ShippingFirmCriteriaDomain shippingFirmCriteriaDomain 
            = new W5001ShippingFirmCriteriaDomain();
        CommonUtil.copyPropertiesDomainToDomain(shippingFirmCriteriaDomain, criteriaDomain);
        shippingFirmCriteriaDomain.setUserAuthList(criteriaDomain.getUserAuthList());

        // Execution of the search process.
        // 検索処理の実行
        return searchOnRegisterInitByFromMain(shippingFirmCriteriaDomain);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W5001ShippingFirmService#transactOnRegisterCancel(com.globaldenso.eca0027.core.business.domain.W5004UpdateDomain)
     */
    public void transactOnRegisterCancel(W5004UpdateDomain updateDomain)
        throws ApplicationException {
        
        W5004CriteriaDomain criteriaDomain = updateDomain.getCriteriaDomain();
        
        // Deletion process of shipping confirmation.
        // 出荷確認の削除処理
        TtShippingFirmCriteriaDomain ttShippingFirmCriteriaDomain 
            = new TtShippingFirmCriteriaDomain();
        ttShippingFirmCriteriaDomain.setShippingFirmNo(criteriaDomain.getShippingFirmNo());
        ttShippingFirmDao.deleteByCondition(ttShippingFirmCriteriaDomain);

        // Get the palletizing data to be updated.
        // 更新対象のパレタイズデータを取得する。
        W5001ShippingFirmCriteriaDomain shippingFirmCriteriaDomain
            = new W5001ShippingFirmCriteriaDomain();
        shippingFirmCriteriaDomain.setShippingFirmNo(criteriaDomain.getShippingFirmNo());
        List<? extends W5001CmlDomain>  w5001CmlDomainList = 
            w5001ShippingFirmDao.lockTtPltzByShippingFirmNoNoWait(shippingFirmCriteriaDomain);
        
        // Update of palletizing data.
        // パレタイズデータの更新
        for (W5001CmlDomain w5001CmlDomain : w5001CmlDomainList) {
            String customTimingTyp = w5001CmlDomain.getCustomTimingTyp();
            String containerLooseTyp = w5001CmlDomain.getContainerLooseTyp();
            
            // Creating an update item.
            // 更新項目の作成
            TtPltzDomain domain = new TtPltzDomain();
            
            if (AFTER_VANNING.equals(customTimingTyp)) {
                domain.setPltzStatus(PLTZ_STATUS_STG_ACT);
            } else if (BEFORE_VANNING.equals(customTimingTyp)) {
                domain.setPltzStatus(PLTZ_STATUS_CUSTOMS_CLEARANCE_B);
            } else if (BOTH_VANNING.equals(customTimingTyp)) {
                if (CONTAINER_LOOSE_TYP_FULL_CONTAINER.equals(containerLooseTyp)) {
                    domain.setPltzStatus(PLTZ_STATUS_STG_ACT);
                } else if (CONTAINER_LOOSE_TYP_LOOSE.equals(containerLooseTyp)) {
                    domain.setPltzStatus(PLTZ_STATUS_CUSTOMS_CLEARANCE_Z);
                }
            }
            
            domain.setShippingFirmNo("");
            commonService.setCommonPropertyForUpdate(domain, SCREEN_ID_W5004);
            
            // Creating an update conditions.
            // 更新条件の作成
            TtPltzCriteriaDomain criteria = new TtPltzCriteriaDomain();
            criteria.setMainMark(w5001CmlDomain.getMainMark());
            
            // Execution of the update process.
            // 更新処理の実行
            ttPltzDao.updateByCondition(domain, criteria);
        }
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W5001ShippingFirmService#transactOnRegisterWorking(com.globaldenso.eca0027.core.business.domain.W5004CriteriaDomain)
     */
    public W5001ShippingFirmDomain transactOnRegisterWorking(W5004CriteriaDomain criteriaDomain)
        throws ApplicationException {

        // Update Settings item.
        // 更新項目の設定
        TtShippingFirmDomain domain = new TtShippingFirmDomain();
        domain.setShippingFirmStatus(SHIPPING_FIRM_STATUS_WORKED_DONE);
        Date sysdate = DateUtil.convertTime(new Date(), criteriaDomain.getTimeZone());
        domain.setWorkedDt(sysdate);
        domain.setWorkedMethTyp(WORKED_METH_TYP_INSTR);
        domain.setWorkedIssuerId(criteriaDomain.getLoginUserDscId());
        domain.setWorkedIssuerNm(criteriaDomain.getWorkedIssuerNm());
        // Setting a common column.
        // 共通カラムの設定
        commonService.setCommonPropertyForUpdate(domain, SCREEN_ID_W5004);
        
        // Setting the update condition.
        // 更新条件の設定
        TtShippingFirmCriteriaDomain criteria = new TtShippingFirmCriteriaDomain();
        criteria.setShippingFirmNo(criteriaDomain.getShippingFirmNo());
        
        // Run the update process of shipping confirmation.
        // 出荷確認の更新処理を実行
        ttShippingFirmDao.updateByCondition(domain, criteria);
        
        // Update Settings item.
        // 更新項目の設定
        TtPltzDomain ttPltzDomain = new TtPltzDomain();
        ttPltzDomain.setPltzStatus(PLTZ_STATUS_SHIPPING_COMFIRMATION_ACTUAL);
        commonService.setCommonPropertyForUpdate(ttPltzDomain, SCREEN_ID_W5004);
        
        // Setting the update condition.
        // 更新条件の設定
        TtPltzCriteriaDomain ttPltzCriteriaDomain = new TtPltzCriteriaDomain();
        ttPltzCriteriaDomain.setShippingFirmNo(criteriaDomain.getShippingFirmNo());
        
        // Run the update process of palletizing.
        // パレタイズの更新処理を実行
        ttPltzService.updateByCondition(ttPltzDomain, ttPltzCriteriaDomain);
        
        // Create a search condition.
        // 検索条件の作成
        W5001ShippingFirmCriteriaDomain shippingFirmCriteriaDomain 
            = new W5001ShippingFirmCriteriaDomain();
        CommonUtil.copyPropertiesDomainToDomain(shippingFirmCriteriaDomain, criteriaDomain);

        // Execution of the search process.
        // 検索処理の実行
        return searchOnRegisterInitByFromMain(shippingFirmCriteriaDomain);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W5001ShippingFirmService#transactOnRegisterReUpdateContainerNo(com.globaldenso.eca0027.core.business.domain.W5004CriteriaDomain)
     */
    public W5001ShippingFirmDomain transactOnRegisterReUpdateContainerNo(
        W5004CriteriaDomain criteriaDomain)
        throws ApplicationException {

        // Update Settings item.
        // 更新項目の設定
        TtShippingFirmDomain domain = new TtShippingFirmDomain();
        domain.setContainerNo(criteriaDomain.getContainerNo());
        // Setting a common column.
        // 共通カラムの設定
        commonService.setCommonPropertyForUpdate(domain, SCREEN_ID_W5004);
        
        // Setting the update condition.
        // 更新条件の設定
        TtShippingFirmCriteriaDomain criteria = new TtShippingFirmCriteriaDomain();
        criteria.setShippingFirmNo(criteriaDomain.getShippingFirmNo());
        criteria.setComUpdateTimestamp(criteriaDomain.getComUpdateTimestamp());
        
        // Execution of the update process.
        // 更新処理の実行
        ttShippingFirmDao.updateByCondition(domain, criteria);
        
        // Create a search condition.
        // 検索条件の作成
        W5001ShippingFirmCriteriaDomain shippingFirmCriteriaDomain 
            = new W5001ShippingFirmCriteriaDomain();
        CommonUtil.copyPropertiesDomainToDomain(shippingFirmCriteriaDomain, criteriaDomain);
        
        // Execution of the search process.
        // 検索処理の実行
        return searchOnRegisterInitByFromMain(shippingFirmCriteriaDomain);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W5001ShippingFirmService#convertToListDomain(com.globaldenso.eca0027.core.business.domain.W5001ShippingFirmDomain, com.globaldenso.eca0027.core.business.domain.W5004CriteriaDomain)
     */
    public List<? extends W5004ListDomain> convertToListDomain(
        W5001ShippingFirmDomain shippingFirm, W5004CriteriaDomain criteriaDomain)
        throws ApplicationException {
        List<W5004ListDomain> listDomainList = new ArrayList<W5004ListDomain>();
        
        if (shippingFirm != null) {
            
            for (W5001CmlDomain cmlDomain : shippingFirm.getCmlDomainList()) {
                W5004ListDomain listDomain = new W5004ListDomain();
                
                // Set a common item search criteria area, the search results area.
                // 検索条件エリア、検索結果エリアの共通項目を設定
                CommonUtil.copyPropertiesDomainToDomain(listDomain, cmlDomain);
                
                if (SCREEN_ID_W5003.equals(criteriaDomain.getCallScreenId())) {
                    if (shippingFirm.getStgActNo() == null) {
                        // The settings for the search criteria area.
                        // 検索条件エリアの項目を設定
                        listDomain.setContainerLooseTyp(shippingFirm.getContainerLooseTyp());
                        listDomain.setOperationNo(shippingFirm.getStgInstrNo());
                        listDomain.setPkgQty(shippingFirm.getPkgQty().toString());

                        // The settings for the search results area.
                        // 検索結果エリアの項目を設定
                        listDomain.setXtagOrCml(cmlDomain.getMainMark());
                        
                        // Set the hidden item
                        // hidden項目を設定
                        listDomain.setStgInstrNo(shippingFirm.getStgInstrNo());
                    } else {
                        // The settings for the search results area.
                        // 検索結果エリアの項目を設定
                        listDomain.setContainerLooseTyp(CONTAINER_LOOSE_TYP_FULL_CONTAINER);
                        listDomain.setOperationNo(shippingFirm.getStgActNo());
                        listDomain.setPkgQty(shippingFirm.getPkgQty().toString());
                        
                        // The settings for the search results area.
                        // 検索結果エリアの項目を設定
                        if (cmlDomain.getXmainMark() != null) {
                            listDomain.setXtagOrCml(cmlDomain.getXmainMark());
                        } else {
                            listDomain.setXtagOrCml(cmlDomain.getMainMark());
                        }
                        
                        // Set the hidden item
                        // hidden項目を設定
                        listDomain.setStgActNo(shippingFirm.getStgActNo());
                        listDomain.setTrnsTypCd(shippingFirm.getTrnsTypCd());
                    }
                } else {
                    // The settings for the search results area.
                    // 検索結果エリアの項目を設定
                    CommonUtil.copyPropertiesDomainToDomain(listDomain, shippingFirm);
                    if (shippingFirm.getStgActNo() != null) {
                        listDomain.setOperationNo(shippingFirm.getStgActNo());
                    } else {
                        listDomain.setOperationNo(shippingFirm.getStgInstrNo());
                    }
                    
                    // The settings for the search results area.
                    // 検索結果エリアの項目を設定
                    if (cmlDomain.getXmainMark() != null) {
                        listDomain.setXtagOrCml(cmlDomain.getXmainMark());
                    } else {
                        listDomain.setXtagOrCml(cmlDomain.getMainMark());
                    }
                }

                // Unit conversion of gross weight (the search condition display area)
                // グロス重量の単位変換(検索条件表示エリア)
                BigDecimal grossWeight = shippingFirm.getGrossWeight();
                if (!criteriaDomain.getWeightUnit().equals(shippingFirm.getWeightUnit())) {
                    grossWeight = commonService.convertWeightUnit(grossWeight,
                        shippingFirm.getWeightUnit(), criteriaDomain.getWeightUnit());
                    
                    // In the case of overflow the integer part
                    // 整数部桁あふれの場合
                    if (grossWeight == null) {
                        Object[] params = {commonService.getResource(criteriaDomain.getLocale(),
                            "label.totalGrossWeight")};
                        throw new GscmApplicationException(NXS_E7_0157, params);
                    }
                }
                listDomain.setGrossWeight(NumberUtil.format(grossWeight, FORMAT_WEIGHT));
                
                // Unit conversion of volume (the search condition display area)
                // 容積の単位変換(検索条件表示エリア)
                BigDecimal volume = shippingFirm.getVolume();
                if (!criteriaDomain.getVolumeUnit().equals(shippingFirm.getVolumeUnit())) {
                    volume = commonService.convertVolumeUnit(volume,
                        shippingFirm.getVolumeUnit(), criteriaDomain.getVolumeUnit());
                    
                    // In the case of overflow the integer part
                    // 整数部桁あふれの場合
                    if (volume == null) {
                        Object[] params = {commonService.getResource(criteriaDomain.getLocale(),
                            "label.totalVolume")};
                        throw new GscmApplicationException(NXS_E7_0157, params);
                    }
                }
                listDomain.setVolume(NumberUtil.format(volume, FORMAT_VOLUME));
                
                // Unit conversion of gross weight (search result display area)
                // グロス重量の単位変換(検索結果表示エリア)
                if (!criteriaDomain.getWeightUnit().equals(cmlDomain.getPltzWeightUnit())) {
                    BigDecimal pltzGrossWeight = commonService.convertWeightUnit(
                        cmlDomain.getPltzGrossWeight(), cmlDomain.getPltzWeightUnit(), 
                        criteriaDomain.getWeightUnit());
                    
                    // In the case of overflow the integer part
                    // 整数部桁あふれの場合
                    if (pltzGrossWeight == null) {
                        Object[] params = {commonService.getResource(criteriaDomain.getLocale(),
                            "label.grossWeight")};
                        throw new GscmApplicationException(NXS_E7_0157, params);
                    }
                    
                    listDomain.setPltzGrossWeight(
                        NumberUtil.format(pltzGrossWeight, FORMAT_WEIGHT));
                }
                
                // Unit conversion of volume (search result display area)
                // 容積の単位変換(検索結果表示エリア)
                if (!criteriaDomain.getVolumeUnit().equals(cmlDomain.getPltzVolumeUnit())) {
                    BigDecimal pltzVolume = commonService.convertVolumeUnit(
                        cmlDomain.getPltzVolume(), cmlDomain.getPltzVolumeUnit(), 
                        criteriaDomain.getVolumeUnit());
                    
                    // In the case of overflow the integer part
                    // 整数部桁あふれの場合
                    if (pltzVolume == null) {
                        Object[] params = {commonService.getResource(criteriaDomain.getLocale(),
                            "label.vol")};
                        throw new GscmApplicationException(NXS_E7_0157, params);
                    }
                    
                    listDomain.setPltzVolume(NumberUtil.format(pltzVolume, FORMAT_VOLUME));
                }

                // format conversion of etd (search condition display area)
                // etdのフォーマット変換(検索条件表示エリア)
                String etd = DateUtil.formatDate(shippingFirm.getEtd(), 
                    criteriaDomain.getScreenDateFormat());
                listDomain.setEtd(etd);
                
                // format conversion of worked etd (search condition display area)
                // worked etdのフォーマット変換(検索条件表示エリア)
                String workedDt = DateUtil.formatDate(shippingFirm.getWorkedDt(), 
                    criteriaDomain.getScreenDateFormat());
                listDomain.setWorkedDt(workedDt);
                
                // format conversion of issue date (the search condition display area)
                // issue dateのフォーマット変換(検索条件表示エリア)
                String shippingFirmDt = DateUtil.formatDate(shippingFirm.getShippingFirmDt(), 
                    criteriaDomain.getScreenDateFormat());
                listDomain.setShippingFirmDt(shippingFirmDt);
                
                // format conversion of invoice etd (search result display area)
                // invoice etdのフォーマット変換（検索結果表示エリア）
                String invoiceEtd = DateUtil.formatDate(cmlDomain.getInvoiceEtd(), 
                    criteriaDomain.getScreenDateFormat());
                listDomain.setInvoiceEtd(invoiceEtd);
                
                listDomainList.add(listDomain);
            }
        }
        
        return listDomainList;
    }
    
    /**
     * Create a shipping confirmation No.
     * <br />出荷確認Noを作成する。
     * 
     * <pre>
     * - More common specification xls: see "functional specifications common numbering".
     *
     * - 詳細は共通仕様.xls「機能仕様共通：採番」を参照
     * </pre>
     *
     * @param criteriaDomain criteria domain
     * @return shipping confirmation No
     * @throws ApplicationException If you can not create shipping confirmation No
     */
    protected String getShippingFirmNo(W5004CriteriaDomain criteriaDomain) 
        throws ApplicationException {
        // Get current date and time zone after its return.
        // タイムゾーン返還後の現在日付取得
        Date sysDate = DateUtil.convertTime(new Date(), criteriaDomain.getTimeZone());
        
        // Creating a shipping confirmation No numbering for key.
        // 出荷確認No採番用キーの作成
        // MGT-No.566 MOD START
        // 2016/12/31 -> VI6Z31
        final String[] monthChars = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "X", "Y", "Z" };
        String monthChar = monthChars[Integer.valueOf(new SimpleDateFormat("MM").format(sysDate)) - 1];
        String shippingFirmNoSeqKey = criteriaDomain.getWhCompCd() + "VI"
            + new SimpleDateFormat("yy'" + monthChar + "'dd").format(sysDate).substring(1);
        // MGT-No.566 MOD END
        
        // Get the serial number.
        // 連番の取得
        String shippingFirmNoSeq = commonService.transactSequence(shippingFirmNoSeqKey, 
            SEQ_TYP_CONFIRMATION_NO, 1, criteriaDomain.getScreenId()).get(0);
        
        return shippingFirmNoSeqKey + shippingFirmNoSeq;
    }
    
    /**
     * Registration process of shipping confirmation.
     * <br />出荷確認の登録処理
     * 
     * <pre>
     * - Set the Domain registrations, to be registered in the TtShippingFirmDomain.
     *
     * - 登録内容をDomainに設定し、TtShippingFirmDomainに登録する。
     * </pre>
     *
     * @param criteriaDomain criteria domain
     * @throws ApplicationException If you can not create
     */
    protected void createTtShippingFirm(W5004CriteriaDomain criteriaDomain) 
        throws ApplicationException {

        // Set of registration details.
        // 登録内容の設定
        TtShippingFirmDomain ttShippingFirmDomain = new TtShippingFirmDomain();
        ttShippingFirmDomain.setShippingFirmNo(criteriaDomain.getShippingFirmNo());
        ttShippingFirmDomain.setStgActNo(criteriaDomain.getStgActNo());
        ttShippingFirmDomain.setStgInstrNo(criteriaDomain.getStgInstrNo());
        ttShippingFirmDomain.setTrnsCd(criteriaDomain.getTrnsCd());
        ttShippingFirmDomain.setTrnsTypCd(criteriaDomain.getTrnsTypCd());
        ttShippingFirmDomain.setWhCompCd(criteriaDomain.getWhCompCd());
        ttShippingFirmDomain.setWhCd(criteriaDomain.getWhCd());
        ttShippingFirmDomain.setContainerSortingKey(criteriaDomain.getContainerSortingKey());
        ttShippingFirmDomain.setContainerLooseTyp(criteriaDomain.getContainerLooseTyp());
        ttShippingFirmDomain.setShippingFirmStatus(SHIPPING_FIRM_STATUS_ISSUE_LIST);
        ttShippingFirmDomain.setEtd(DateUtil.parseDate(criteriaDomain.getEtd(), 
            criteriaDomain.getScreenDateFormat()));
        ttShippingFirmDomain.setCarrierCompCd(criteriaDomain.getCarrierCompCd());
        ttShippingFirmDomain.setContainerNo(criteriaDomain.getContainerNo());
        ttShippingFirmDomain.setPkgQty(StringUtil.parseBigDecimal(criteriaDomain.getPkgQty()));
        ttShippingFirmDomain.setGrossWeight(StringUtil.parseBigDecimal(
            criteriaDomain.getGrossWeight()));
        ttShippingFirmDomain.setWeightUnit(criteriaDomain.getWeightUnit());
        ttShippingFirmDomain.setVolume(StringUtil.parseBigDecimal(criteriaDomain.getVolume()));
        ttShippingFirmDomain.setVolumeUnit(criteriaDomain.getVolumeUnit());
        Date dt = DateUtil.convertTime(new Date(), criteriaDomain.getTimeZone());
        ttShippingFirmDomain.setShippingFirmDt(dt);
        ttShippingFirmDomain.setShippingFirmIssuerId(criteriaDomain.getLoginUserDscId());
        ttShippingFirmDomain.setShippingFirmIssuerNm(criteriaDomain.getShippingFirmIssuerNm());
        ttShippingFirmDomain.setComUpdateFuncId(criteriaDomain.getComUpdateFuncId());
        ttShippingFirmDomain.setComUpdateUserId(criteriaDomain.getComUpdateUserId());
        // Setting a common column.
        // 共通カラムの設定
        commonService.setCommonPropertyForRegist(ttShippingFirmDomain, SCREEN_ID_W5004);
        
        // Execution of the registration process.
        // 登録処理の実行
        ttShippingFirmService.create(ttShippingFirmDomain);
    }
    
    /**
     * Update process of palletizing.
     * <br />パレタイズの更新処理
     * 
     * <pre>
     * - Set the Domain updates, to update the TtPltz.
     *
     * - 更新内容をDomainに設定し、TtPltzを更新する。
     * </pre>
     *
     * @param updateDomain update domain
     * @throws ApplicationException If you can not create
     */
    protected void updateTtPltz(W5004UpdateDomain updateDomain) throws ApplicationException {
        
        List<? extends W5004ListDomain> listDomainList = updateDomain.getListDomainList();
        W5004CriteriaDomain criteriaDomain = updateDomain.getCriteriaDomain();
        
        List<TtPltzDomain> listUpdDomain = new ArrayList<TtPltzDomain>();
        List<TtPltzCriteriaDomain> listUpdCriteria = new ArrayList<TtPltzCriteriaDomain>();
        for (W5004ListDomain listDomain : listDomainList) {
            
            // Update Settings item.
            // 更新項目の設定
            TtPltzDomain domain = new TtPltzDomain();
            domain.setPltzStatus(PLTZ_STATUS_SHIPPING_COMFIRMATION);
            domain.setShippingFirmNo(criteriaDomain.getShippingFirmNo());
            // Setting a common column.
            // 共通カラムの設定
            commonService.setCommonPropertyForUpdate(domain, SCREEN_ID_W5004);
            listUpdDomain.add(domain);
            
            // Setting the update condition.
            // 更新条件の設定
            TtPltzCriteriaDomain criteria = new TtPltzCriteriaDomain();
            if (listDomain.getXmainMark() != null) {
                criteria.setXmainMark(listDomain.getXmainMark());
            } else {
                criteria.setMainMark(listDomain.getMainMark());
            }
            
            listUpdCriteria.add(criteria);
        }
        
        // Execution of the update process.
        // 更新処理の実行
        ttPltzService.updateByCondition(listUpdDomain, listUpdCriteria);
    }

}
