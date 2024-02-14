/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.ws.rest.resource;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.BHT_SCREEN_ID_DEFAULT;

import com.globaldenso.ai.aiws.exception.AiwsApplicationException;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.Ws2510ResultDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2510CriteriaDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.TransactFacadeService;
import com.globaldenso.gscm.framework.util.CheckUtil;

/**
 * Resource implementation class for the ws2510.
 * <br />ws2510のリソース実装クラスです。
 * 
 * @author $Author: 810833613 $
 * @version $Revision: 7416 $
 */
public class Ws2510ResourceImpl extends AbstractResourceImpl implements Ws2510Resource  {

    /**
     * Facade service
     * <br />Facadeサービス
     */
    private TransactFacadeService<Ws2510ResultDomain, Ws2510CriteriaDomain> ws2510TransactFacadeService;

    /**
     * constructor.
     */
    public Ws2510ResourceImpl() {

    }

    /**
     * Setter method for ws2510TransactFacadeService.
     *
     * @param ws2510TransactFacadeService Set for ws2510TransactFacadeService
     */
    public void setWs2510TransactFacadeService(
        TransactFacadeService<Ws2510ResultDomain, Ws2510CriteriaDomain> ws2510TransactFacadeService) {
        this.ws2510TransactFacadeService = ws2510TransactFacadeService;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.ws.rest.resource.Ws2510Resource#createXtag(String, String, String, String, String, String, String, String, String, String, String)
     */
    public Ws2510ResultDomain createXtag(String dscId, String palletNo,
        String containerSortingKey, String trnsCd, String shipToCompCd,
        String loadingCd, String customTimingTyp, String mainMark,
        String outerPkgComCd, String outerPkgCd,
        String screenId)
        throws AiwsApplicationException {
        
        // Generation and a setting of Criteria Domain
        // Criteria Domainの生成と設定
        Ws2510CriteriaDomain criteriaDomain = new Ws2510CriteriaDomain();
        criteriaDomain.setLoginUserDscId(dscId);
        criteriaDomain.setPalletNo(palletNo);
        criteriaDomain.setContainerSortingKey(containerSortingKey);
        criteriaDomain.setTrnsCd(trnsCd);
        criteriaDomain.setShipToCompCd(shipToCompCd);
        criteriaDomain.setLoadingCd(loadingCd);
        criteriaDomain.setCustomTimingTyp(customTimingTyp);
        if (mainMark == null) {
            mainMark = "";
        }
        String[] mainMarks = mainMark.split(",");
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < mainMarks.length; i++) {
            list.add(mainMarks[i]);
        }
        criteriaDomain.setMainMarkList(list);
        criteriaDomain.setOuterPkgComCd(outerPkgComCd);
        criteriaDomain.setOuterPkgCd(outerPkgCd);
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
            return this.ws2510TransactFacadeService.transact(criteriaDomain);
        } catch (ApplicationException e) {
            return processApplicationException(e, Ws2510ResultDomain.class);
        } 
    }
}
