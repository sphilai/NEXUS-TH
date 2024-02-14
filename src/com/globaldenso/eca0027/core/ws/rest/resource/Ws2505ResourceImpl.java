/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.ws.rest.resource;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.BHT_SCREEN_ID_DEFAULT;

import java.math.BigDecimal;
import java.util.Locale;

import com.globaldenso.ai.aiws.exception.AiwsApplicationException;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.Ws2505ResultDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2505CriteriaDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.TransactFacadeService;
import com.globaldenso.gscm.framework.util.CheckUtil;

/**
 * Resource implementation class for the ws2505. 
 * <br />ws2505のリソース実装クラスです。
 * 
 * @author $Author: 810833843 $
 * @version $Revision: 9972 $
 */
public class Ws2505ResourceImpl extends AbstractResourceImpl implements Ws2505Resource  {

    /**
     * Facade service
     * <br />Facadeサービス
     */
    private TransactFacadeService<Ws2505ResultDomain, Ws2505CriteriaDomain> ws2505TransactFacadeService;

    /**
     * constructor.
     */
    public Ws2505ResourceImpl() {

    }

    /**
     * Setter method for ws2505TransactFacadeService.
     *
     * @param ws2505TransactFacadeService Set for ws2505TransactFacadeService
     */
    public void setWs2505TransactFacadeService(
        TransactFacadeService<Ws2505ResultDomain, Ws2505CriteriaDomain> ws2505TransactFacadeService) {
        this.ws2505TransactFacadeService = ws2505TransactFacadeService;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.ws.rest.resource.Ws2505Resource#createPkgSpec(String, String, String, String, String, String, String, String, String, String, String)
     */
    public Ws2505ResultDomain createPkgSpec(String dscId, String compCd,
            String itemNo, String pkgCd, String trnsCd, String rev,
            String nProc,
            String screenId) throws AiwsApplicationException {
        
        // Generation and a setting of Criteria Domain
        // Criteria Domainの生成と設定
        Ws2505CriteriaDomain criteriaDomain = new Ws2505CriteriaDomain();
        criteriaDomain.setLoginUserDscId(dscId);
        criteriaDomain.setCompCd(compCd);
        criteriaDomain.setOwnerCompCd(compCd);
        criteriaDomain.setItemNo(itemNo);
        criteriaDomain.setPkgCd(pkgCd);
        criteriaDomain.setTrnsCd(trnsCd);
        if (CheckUtil.isNumeric(rev)) {
            criteriaDomain.setRev(new BigDecimal(rev));
        }
        criteriaDomain.setNProc(nProc);
        criteriaDomain.setLanguageCd(getLanguageCd());
        criteriaDomain.setLocale(new Locale(getLanguageCd()));
        if (!CheckUtil.isBlankOrNull(screenId)) {
            criteriaDomain.setScreenId(screenId);
        } else {
            criteriaDomain.setScreenId(BHT_SCREEN_ID_DEFAULT);
        }

        try {
            // Execution of FacadeService
            // FacadeServiceの実行
            return this.ws2505TransactFacadeService.transact(criteriaDomain);
        } catch (ApplicationException e) {
            return processApplicationException(e, Ws2505ResultDomain.class);
        } 
    }
}
