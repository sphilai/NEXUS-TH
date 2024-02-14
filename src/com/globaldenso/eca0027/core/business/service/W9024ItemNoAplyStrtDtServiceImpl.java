/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0004;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ITEM_NO_GRP_D;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ITEM_NO_GRP_DG;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0142;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0143;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W9024B;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W9024R;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.time.DateUtils;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.TmNxsCompDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmPkgSpecHdrDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmPkgSpecRevDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmPkgSpecRevHisDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsCompCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgSpecHdrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgSpecRevCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TmNxsCompService;
import com.globaldenso.eca0027.core.auto.business.service.TmPkgSpecHdrService;
import com.globaldenso.eca0027.core.auto.business.service.TmPkgSpecRevHisService;
import com.globaldenso.eca0027.core.auto.business.service.TmPkgSpecRevService;
import com.globaldenso.eca0027.core.business.dao.W9024ItemNoAplyStrtDtDao;
import com.globaldenso.eca0027.core.business.domain.W9024ItemNoAplyStrtDtItemDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W9024ItemNoAplyStrtDtCriteriaDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.eca0027.core.common.business.service.UserAuthService;
import com.globaldenso.gscm.framework.util.CheckUtil;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.DateUtil;

/**
 * Service implementation class of Item No. Apply Start Date Refer & Register
 * <br />Item No. Apply Start Date Refer & Registerのサービス実装クラスです。
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 11315 $
 */
public class W9024ItemNoAplyStrtDtServiceImpl implements
    W9024ItemNoAplyStrtDtService {

    /**
     * Item No. Apply Start Date Refer & Register DAO
     */
    protected W9024ItemNoAplyStrtDtDao w9024ItemNoAplyStrtDtDao;
    
    /**
     * TmPkgSpecRev
     */
    protected TmPkgSpecRevService tmPkgSpecRevService;
    
    /**
     * TmPkgSpecRevHis
     */
    protected TmPkgSpecRevHisService tmPkgSpecRevHisService;
    
    /**
     * PKG Specification MA（Header）Service.
     */
    protected TmPkgSpecHdrService tmPkgSpecHdrService;
    
    /**
     * CommonService
     */
    protected CommonService commonService;
    
    /**
     * tmNxsCompService
     */
    protected TmNxsCompService tmNxsCompService;
    
    /**
     * UserAuthService
     */
    protected UserAuthService userAuthService;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W9024ItemNoAplyStrtDtServiceImpl() {
    }

    /**
     * Setter method for w9024ItemNoAplyStrtDtDao.
     *
     * @param itemNoAplyStrtDtDao Set for w9024ItemNoAplyStrtDtDao
     */
    public void setW9024ItemNoAplyStrtDtDao(W9024ItemNoAplyStrtDtDao itemNoAplyStrtDtDao) {
        w9024ItemNoAplyStrtDtDao = itemNoAplyStrtDtDao;
    }

    /**
     * Setter method for tmPkgSpecRevService.
     *
     * @param tmPkgSpecRevService Set for tmPkgSpecRevService
     */
    public void setTmPkgSpecRevService(TmPkgSpecRevService tmPkgSpecRevService) {
        this.tmPkgSpecRevService = tmPkgSpecRevService;
    }

    /**
     * Setter method for tmPkgSpecRevHisService.
     *
     * @param tmPkgSpecRevHisService Set for tmPkgSpecRevHisService
     */
    public void setTmPkgSpecRevHisService(
        TmPkgSpecRevHisService tmPkgSpecRevHisService) {
        this.tmPkgSpecRevHisService = tmPkgSpecRevHisService;
    }
    
    /**
     * Setter method for tmPkgSpecHdrService.
     *
     * @param tmPkgSpecHdrService Set for tmPkgSpecHdrService
     */
    public void setTmPkgSpecHdrService(TmPkgSpecHdrService tmPkgSpecHdrService) {
        this.tmPkgSpecHdrService = tmPkgSpecHdrService;
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
     * Setter method for tmNxsCompService.
     *
     * @param tmNxsCompService Set for tmNxsCompService
     */
    public void setTmNxsCompService(TmNxsCompService tmNxsCompService) {
        this.tmNxsCompService = tmNxsCompService;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W9024ItemNoAplyStrtDtService#createOnRegister(W9024ItemNoAplyStrtDtCriteriaDomain)
     */
    public W9024ItemNoAplyStrtDtItemDomain createOnRegister(W9024ItemNoAplyStrtDtCriteriaDomain criteria)
        throws ApplicationException {
        
        // Create data of registration and update.
        // 登録・更新用のデータを作成
        TmPkgSpecRevDomain domain = new TmPkgSpecRevDomain();
        
        // time zone conversion
        // タイムゾーン変換を行う
        String timezoneId = commonService.searchTimezone(criteria.getOwnerCompCd());
        Date sysdate = DateUtils.truncate(DateUtil.convertTime(new Date(), timezoneId), Calendar.DAY_OF_MONTH);
        
        // The cast to String --> Decimal
        // String-->Decimalにキャスト
        BigDecimal decRev = new BigDecimal(0);
        if(criteria.getRev() != null){
            decRev = new BigDecimal(criteria.getRev());
        }
        BigDecimal decRevOld = new BigDecimal(0);
        if(criteria.getRevOld() != null){
            decRevOld = new BigDecimal(criteria.getRevOld());
        }
        String pkgCd = criteria.getPkgCd();
        if (!StringUtils.isNotEmpty(pkgCd)) {
            pkgCd = " ";
        }
        
        int updateCount = 0;
        int createCount = 0;
        if(GSCM_I0_0004.equals(criteria.getConfirmMsgCd())){
            // update Package Specification Revision Master
            domain.setRev(decRev);
            domain.setAplyStrtDt(sysdate);

            // Setting common column
            // 共通カラムの設定
            commonService.setCommonPropertyForUpdate(domain, criteria.getScreenId());
            
            // Narrowing conditions
            // 絞込条件
            TmPkgSpecRevCriteriaDomain updateCriteria = new TmPkgSpecRevCriteriaDomain();
            updateCriteria.setCompCd(criteria.getCompCd());
            updateCriteria.setItemNo(criteria.getItemNo());
            updateCriteria.setPkgCd(pkgCd);
            updateCriteria.setTrnsCd(criteria.getTrnsCd());
            updateCriteria.setNProc(" ");
            updateCriteria.setComUpdateTimestamp(criteria.getComUpdateTimestamp());
            
            // Update process
            // 更新処理
            updateCount += tmPkgSpecRevService.updateByCondition(domain, updateCriteria);
        }else{
            // Register update Package Specification Revision Master
            domain.setCompCd(criteria.getCompCd());
            domain.setItemNo(criteria.getItemNo());
            domain.setPkgCd(pkgCd);
            domain.setTrnsCd(criteria.getTrnsCd());
            domain.setNProc(" ");
            domain.setRev(decRev);
            domain.setAplyStrtDt(sysdate);
            
            // Setting common column
            // 共通カラムの設定
            commonService.setCommonPropertyForRegist(domain, criteria.getScreenId());
            tmPkgSpecRevService.create(domain);
            createCount++;
        }
        // Get of branch number
        // 枝番の取得
        BigDecimal countBrch = BigDecimal.valueOf(w9024ItemNoAplyStrtDtDao.serachTmPkgSpecRevHis(criteria));
        countBrch = countBrch.add(BigDecimal.ONE);
        
        // Registration of Package Specification Revision History Master.
        // 包装仕様有効リビジョン履歴原単位の登録
        TmPkgSpecRevHisDomain updateCriteria = new TmPkgSpecRevHisDomain();
        updateCriteria.setCompCd(criteria.getCompCd());
        updateCriteria.setItemNo(criteria.getItemNo());
        updateCriteria.setPkgCd(pkgCd);
        updateCriteria.setTrnsCd(criteria.getTrnsCd());
        updateCriteria.setNProc(" ");
        updateCriteria.setBrch(countBrch);
        updateCriteria.setRev(decRevOld);
        updateCriteria.setAplyStrtDt(sysdate);
        // Setting common column
        // 共通カラムの設定
        commonService.setCommonPropertyForRegist(updateCriteria, criteria.getScreenId());

        tmPkgSpecRevHisService.create(updateCriteria);
        createCount++;

        W9024ItemNoAplyStrtDtItemDomain result = new W9024ItemNoAplyStrtDtItemDomain();
        CommonUtil.copyPropertiesDomainToDomain(result, domain);
        result.setUpdateCount(updateCount);
        result.setCreateCount(createCount);
        
        return result;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W9024ItemNoAplyStrtDtService#searchOnRegisterAddOrRefer(W9024ItemNoAplyStrtDtCriteriaDomain)
     */
    public W9024ItemNoAplyStrtDtItemDomain searchOnRegisterAddOrRefer(W9024ItemNoAplyStrtDtCriteriaDomain criteria) 
        throws ApplicationException {
 
        // Get the data to be retrieved
        // 検索対象を取得する
        W9024ItemNoAplyStrtDtItemDomain domain = w9024ItemNoAplyStrtDtDao.searchTmPkgSpecRev(criteria);
        if (domain == null) {
            domain = new W9024ItemNoAplyStrtDtItemDomain();
            domain.setRev("0");
        } else {
            if (CheckUtil.isBlankOrNull(domain.getRev())) {
                domain.setRev("0");
            }
        }
        
        // Packaging code related check
        // 包装コード関連チェック
        TmNxsCompCriteriaDomain compCriteria = new TmNxsCompCriteriaDomain();
        compCriteria.setCompCd(criteria.getCompCd());
        TmNxsCompDomain compDomain = tmNxsCompService.searchByKey(compCriteria);
        String itemNoGrp = compDomain.getItemNoGrp();
        String pkgCd = criteria.getPkgCd();
        if (!commonService.validatePkgCd(pkgCd, itemNoGrp)) {
            if (StringUtils.equals(itemNoGrp, ITEM_NO_GRP_DG) && !StringUtils.isEmpty(pkgCd)) {
                domain.setMsgId(NXS_E7_0142);
            } else if (StringUtils.equals(itemNoGrp, ITEM_NO_GRP_D) && StringUtils.isEmpty(pkgCd)) {
                domain.setMsgId(NXS_E7_0143);
            }
        }
        return domain;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W9024ItemNoAplyStrtDtService#validateConsistencyRevision(int, int, boolean)
     */
    public boolean validateConsistencyRevision(int revisionNoOld, int revisionNoNew, boolean ignoreWarning)
        throws ApplicationException {
        
        boolean result = true;
        
        if(((revisionNoOld + 1) != revisionNoNew) && (!ignoreWarning)){
            result = false;
        }
        return result;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W9024ItemNoAplyStrtDtService#validateDatabaseShipper(java.lang.String)
     */
    public boolean validateDatabaseShipper(String compCd)
        throws ApplicationException {
        
        // Shipper existence check
        // Shipper存在チェック
        return commonService.validateShipper(compCd);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W9024ItemNoAplyStrtDtService#validateDatabaseUserAuthCompCd(java.lang.String)
     */
    public boolean validateDatabaseUserAuthCompCd(String compCd) throws ApplicationException {
        // Authority check
        // 権限チェック
        return userAuthService.hasUserAuthForComp(PERMIT_FUNC_ID_W9024R, compCd) 
            || userAuthService.hasUserAuthForComp(PERMIT_FUNC_ID_W9024B, compCd);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W9024ItemNoAplyStrtDtService#validateDatabaseTmPkgSpecHdr(com.globaldenso.eca0027.core.business.domain.criteria.W9024ItemNoAplyStrtDtCriteriaDomain)
     */
    public boolean validateDatabaseTmPkgSpecHdr(String compCd, String itemNo, String pkgCd, String trnsCd, String rev)
        throws ApplicationException {
        
        // Set criteria domain.
        TmPkgSpecHdrCriteriaDomain tmPkgSpecHdrCriteria = new TmPkgSpecHdrCriteriaDomain();
        tmPkgSpecHdrCriteria.setOwnerComp(compCd);
        tmPkgSpecHdrCriteria.setItemNo(itemNo);
        tmPkgSpecHdrCriteria.setPkgCd(pkgCd);
        tmPkgSpecHdrCriteria.setTrnsCd(trnsCd);
        tmPkgSpecHdrCriteria.setNProc(" ");
        // ST938 MOD START
        //tmPkgSpecHdrCriteria.setRev(rev);
        if (rev == null) {
            tmPkgSpecHdrCriteria.setRev(null);
        } else {
            tmPkgSpecHdrCriteria.setRev(new BigDecimal(rev));
        }
        // ST938 MOD END
        
        // Get PKG Specification MA（Header）.
        TmPkgSpecHdrDomain tmPkgSpecHdrDomain = tmPkgSpecHdrService.searchByKey(tmPkgSpecHdrCriteria);
        
        return tmPkgSpecHdrDomain != null;
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W9024ItemNoAplyStrtDtService#validateDatabaseTmPkgSpecRev(java.lang.String, java.lang.String, java.lang.String, java.lang.String)
     */
    public boolean validateDatabaseTmPkgSpecRev(String compCd, String itemNo, String pkgCd, String trnsCd)
        throws ApplicationException {
        // Set criteria domain.
        TmPkgSpecRevCriteriaDomain tmPkgSpecRevCriteria = new TmPkgSpecRevCriteriaDomain();
        tmPkgSpecRevCriteria.setCompCd(compCd);
        tmPkgSpecRevCriteria.setItemNo(itemNo);
        tmPkgSpecRevCriteria.setPkgCd(pkgCd);
        tmPkgSpecRevCriteria.setTrnsCd(trnsCd);
        tmPkgSpecRevCriteria.setNProc(" ");
        
        // Lock for Package Specification Revision Master.
        TmPkgSpecRevDomain tmPkgSpecRevDomain = tmPkgSpecRevService.lockByKeyNoWait(tmPkgSpecRevCriteria);

        return tmPkgSpecRevDomain != null;
    }
}
