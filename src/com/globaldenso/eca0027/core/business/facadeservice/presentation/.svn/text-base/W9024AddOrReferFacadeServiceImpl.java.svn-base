/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0009;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0111;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W9024;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WHITE_SPACE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.STRING_ZERO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W9024CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W9024ItemNoAplyStrtDtItemDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W9024ItemNoAplyStrtDtCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W9024ItemNoAplyStrtDtService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.DateUtil;
import com.globaldenso.gscm.framework.util.Validator;

/**
 * The implementation class of facade service for add or refer action of P/No Apply 
 * Start Date Refer & Register screen.
 * <br />
 * P/No Apply Start Date Refer & Register画面のAddOrReferアクションに対するFacadeサービスの実装クラスです。
 * 
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W9024AddOrReferFacadeServiceImpl extends AbstractSearchFacadeService<W9024CriteriaDomain, W9024CriteriaDomain> {

    /**
     * common services<br />
     * 共通サービス
     */
    protected CommonService commonService;
    /**
     * The service of Item No. Apply Start Date Refer & Register.<br />
     * Item No. Apply Start Date Refer & Registerのサービス
     */
    protected W9024ItemNoAplyStrtDtService w9024ItemNoAplyStrtDtService;
    
    /**
     * Default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W9024AddOrReferFacadeServiceImpl() {
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
     * Setter method for w9024ItemNoAplyStrtDtService.
     *
     * @param itemNoAplyStrtDtService Set for w9024ItemNoAplyStrtDtService
     */
    public void setW9024ItemNoAplyStrtDtService(W9024ItemNoAplyStrtDtService itemNoAplyStrtDtService) {
        w9024ItemNoAplyStrtDtService = itemNoAplyStrtDtService;
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * no action.
     * </pre>
     * <pre>
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W9024CriteriaDomain filterDomain(W9024CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {
        return criteriaDomain;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * no action.
     * </pre>
     * <pre>
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W9024CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {

        Validator<W9024CriteriaDomain> valid = new Validator<W9024CriteriaDomain>(criteriaDomain, "w9024CriteriaDomain");

        String[] properties1 = {
            "compCd",
            "itemNo",
            "pkgCd",
            "trnsCd"
        };
        
        valid.isValidateProperties(properties1, SCREEN_ID_W9024);
        
        if (0 < valid.getErrList().size()) {
            throw new ValidationException(valid.getErrList());
        }
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * no action.
     * </pre>
     * <pre>
     * 処理なし
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W9024CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
    }

    /**
     * {@inheritDoc}
     * <pre>
     * Company existence check.
     * </pre>
     * <pre>
     * Company存在チェック
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W9024CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        List<MessageDomain> errorList = new ArrayList<MessageDomain>();
        
        // Check of Company existence 
        // Company存在チェック
        if (!w9024ItemNoAplyStrtDtService.validateDatabaseShipper(criteriaDomain.getCompCd())) {
            MessageDomain msg = new MessageDomain("w9024CriteriaDomain.compCd", NXS_E7_0111, null);
            errorList.add(msg);
        }
        
        // Authority check 
        // 権限チェック
        if (!w9024ItemNoAplyStrtDtService.validateDatabaseUserAuthCompCd(criteriaDomain.getCompCd())) {
            MessageDomain msg = new MessageDomain("w9024CriteriaDomain.compCd", GSCM_I0_0009, null);
            errorList.add(msg);
        }
        
        if (errorList.size() > 0) {
            throw new ValidationException(errorList);
        }
    }

    /**
     * {@inheritDoc}
     * <pre>
     * Display the Target of search
     * </pre>
     * <pre>
     * 検索対象を表示する
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W9024CriteriaDomain callServices(W9024CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {
        
        W9024ItemNoAplyStrtDtCriteriaDomain pNoAplyStrtDtCriteria = createNoApplyStartDateCriteria(criteriaDomain);

        W9024ItemNoAplyStrtDtItemDomain pNoAplyStrtDtDomain = w9024ItemNoAplyStrtDtService.searchOnRegisterAddOrRefer(pNoAplyStrtDtCriteria);
        if (pNoAplyStrtDtDomain != null && StringUtils.isNotEmpty(pNoAplyStrtDtDomain.getMsgId())) {
            throw new ValidationException(Arrays.asList(new MessageDomain("w9024CriteriaDomain.pkgCd", pNoAplyStrtDtDomain.getMsgId(), null)));
        }
        return convertToCriteriaDomain(criteriaDomain, pNoAplyStrtDtDomain);
    }
    
    /**
     *  Based on (PL) Search criteria domain, create Search criteria domain (BL).
     * <br />検索条件ドメイン(PL)を基に、検索条件ドメイン(BL)を作成します。
     * 
     * @param criteriaDomain Criteria domain of screen(PL)<br />
     * 画面の検索条件ドメイン(PL)
     * @return Criteria domain of service<br />
     * サービスの検索条件ドメイン(BL)
     */
    protected W9024ItemNoAplyStrtDtCriteriaDomain createNoApplyStartDateCriteria(W9024CriteriaDomain criteriaDomain) {

        W9024ItemNoAplyStrtDtCriteriaDomain invTplMaCriteria = new W9024ItemNoAplyStrtDtCriteriaDomain();

        CommonUtil.copyPropertiesDomainToDomain(invTplMaCriteria, criteriaDomain, criteriaDomain.getScreenDateFormat());

        return invTplMaCriteria;
    }
    
    /**
     *  Covert service domain(BL) to screen domain (PL).
     * <br />サービスのドメイン(BL)を画面のドメイン(PL)に変換します。
     * 
     * @param criteriaDomain  Criteria domain<br />
     * 検索条件ドメイン
     * @param pNoAplyStrtDtDomain Result domain<br />
     * 検索結果ドメイン
     * @return Screen domain(PL)<br />
     * 画面のドメイン(PL)
     */
    protected W9024CriteriaDomain convertToCriteriaDomain(W9024CriteriaDomain criteriaDomain, W9024ItemNoAplyStrtDtItemDomain pNoAplyStrtDtDomain) {

        W9024CriteriaDomain resultDomain = new W9024CriteriaDomain();
        
        resultDomain.setCompCd(criteriaDomain.getCompCd());
        resultDomain.setItemNo(criteriaDomain.getItemNo());
        resultDomain.setTrnsCd(criteriaDomain.getTrnsCd());
        resultDomain.setViewCompCd(criteriaDomain.getCompCd());
        resultDomain.setViewItemNo(criteriaDomain.getItemNo());
        resultDomain.setViewTrnsCd(criteriaDomain.getTrnsCd());
        
        // PKG CD
        resultDomain.setPkgCd(criteriaDomain.getPkgCd());
        if (StringUtils.isNotEmpty(criteriaDomain.getPkgCd())) {
            resultDomain.setViewPkgCd(criteriaDomain.getPkgCd());
        } else {
            resultDomain.setViewPkgCd(WHITE_SPACE);
        }
        
        if (pNoAplyStrtDtDomain != null) {
            resultDomain.setRevOld(pNoAplyStrtDtDomain.getRev());
            String aplyStrtDt = DateUtil.formatDate(pNoAplyStrtDtDomain.getAplyStrtDt(), criteriaDomain.getScreenDateFormat());
            resultDomain.setAplyStrtDt(aplyStrtDt);
            resultDomain.setComUpdateTimestamp(pNoAplyStrtDtDomain.getComUpdateTimestamp());
        } else {
            // Don't get Master Data. 
            resultDomain.setRevOld(STRING_ZERO);
            resultDomain.setAplyStrtDt(StringUtils.EMPTY);
        }
        resultDomain.setRev(StringUtils.EMPTY);
        return resultDomain;
    }
}
