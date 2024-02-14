/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CHECK_OFF;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CHECK_ON;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0136;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_W1_0006;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W9024;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0003;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0004;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.TmPkgSpecRevHisDomain;
import com.globaldenso.eca0027.core.business.domain.W9024CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W9024ItemNoAplyStrtDtItemDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W9024ItemNoAplyStrtDtCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W9024ItemNoAplyStrtDtService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractTransactFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.DateUtil;
import com.globaldenso.gscm.framework.util.Validator;
/**
 * The implementation class of facade service for registre action of P/No Apply 
 * Start Date Refer & Register screen.
 * <br />
 * P/No Apply Start Date Refer & Register画面のRegisterアクションに対するFacadeサービスの実装クラスです。
 * 
 * @author $Author: 810833843 $
 * @version $Revision: 9972 $
 */
public class W9024RegisterFacadeServiceImpl extends AbstractTransactFacadeService<W9024CriteriaDomain, W9024CriteriaDomain> {

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
    public W9024RegisterFacadeServiceImpl() {
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

        if (!FLAG_Y.equals(criteriaDomain.getContinueFlag())) {
            return;
        }
        Validator<W9024CriteriaDomain> valid = new Validator<W9024CriteriaDomain>(criteriaDomain, "w9024CriteriaDomain");
        String[] properties1 = {
            "rev"
        };
        
        valid.isValidateProperties(properties1, SCREEN_ID_W9024);
        
        if (0 < valid.getErrList().size()) {
            throw new ValidationException(valid.getErrList());
        }
    }

    /**
     * {@inheritDoc}
     * <pre>
     * Check revision.
     * </pre>
     * <pre>
     * リビジョンチェック
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W9024CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
   
        if (!FLAG_Y.equals(criteriaDomain.getContinueFlag())) {
            return;
        }
        
        List<MessageDomain> errorList = new ArrayList<MessageDomain>();
        
        int revisionOld = 0;
        if (StringUtils.isNotEmpty(criteriaDomain.getRevOld())) {
            revisionOld = Integer.parseInt(criteriaDomain.getRevOld());
        }
        int revisionNew = 0;
        if (StringUtils.isNotEmpty(criteriaDomain.getRev())) {
            revisionNew = Integer.parseInt(criteriaDomain.getRev());
        }
        boolean ignoreWarning = CHECK_ON.equals(criteriaDomain.getIgnoreWarnings());
        
        // Revision check 
        // リビジョンチェック
        if(!w9024ItemNoAplyStrtDtService.validateConsistencyRevision(revisionOld, revisionNew, ignoreWarning)){
            MessageDomain msgCompany = new MessageDomain("w9024CriteriaDomain.rev", NXS_W1_0006, null);
            errorList.add(msgCompany);
        }
        
        if (errorList.size() > 0) {
            throw new ValidationException(errorList);
        }
    }

    /**
     * {@inheritDoc}
     * <pre>
     * Packaging specifications basic unit existence check
     * </pre>
     * <pre>
     * 包装仕様原単位存在チェック
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W9024CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {

        // 包装仕様有効リビジョン原単位の登録・更新処理の判断
        if (!FLAG_Y.equals(criteriaDomain.getContinueFlag())) {
            // Lock the Package Specification Revision Master selected.
            String msgCd;
            if (w9024ItemNoAplyStrtDtService.validateDatabaseTmPkgSpecRev(criteriaDomain.getViewCompCd()
                , criteriaDomain.getViewItemNo(), criteriaDomain.getViewPkgCd(), criteriaDomain.getViewTrnsCd())) {
                msgCd = GSCM_I0_0004;
            } else {
                msgCd = GSCM_I0_0003;
            }
            criteriaDomain.setConfirmMsgCd(msgCd);
            criteriaDomain.setConfirmMsg(commonService.getResource(criteriaDomain.getLocale(), msgCd));
            return;
        }
        
        // Packaging specifications basic unit existence check
        if(!w9024ItemNoAplyStrtDtService.validateDatabaseTmPkgSpecHdr(criteriaDomain.getViewCompCd()
            , criteriaDomain.getViewItemNo(), criteriaDomain.getViewPkgCd(), criteriaDomain.getViewTrnsCd(), criteriaDomain.getRev())){
            throw new ValidationException(Arrays.asList(new MessageDomain("w9024CriteriaDomain.rev", NXS_E7_0136, null)));
        }
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * - 3.Reflected in packaging specifications effective revision.
     * - 4.Re-drawing to the screen.
     * </pre>
     * <pre>
     * - 3.包装仕様有効リビジョンへの反映
     * - 4.画面への再描画
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W9024CriteriaDomain callServices(W9024CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {
        
        if (!FLAG_Y.equals(criteriaDomain.getContinueFlag())) {
            return criteriaDomain;
        }
        
        W9024ItemNoAplyStrtDtCriteriaDomain pNoAplyStrtDtCriteria = createNoApplyStartDateCriteria(criteriaDomain);
        
        W9024ItemNoAplyStrtDtItemDomain pNoAplyStrtDtDomain = w9024ItemNoAplyStrtDtService.createOnRegister(pNoAplyStrtDtCriteria);
        
        return convertToCriteriaDomain(criteriaDomain, pNoAplyStrtDtDomain);
    }

    /**
     * Based on (PL) Search criteria domain, create update domain (BL).
     * <br />
     * 検索条件ドメイン(PL)を基に、更新ドメイン(BL)を作成します。
     * 
     * @param criteriaDomain criteria domain of screen(PL)<br />
     * 画面の更新ドメイン(PL)
     * @return Criteria domain of service(BL)<br />
     * サービスの検索条件ドメイン(BL)
     */
    protected W9024ItemNoAplyStrtDtCriteriaDomain createNoApplyStartDateCriteria(W9024CriteriaDomain criteriaDomain) {
        
        W9024ItemNoAplyStrtDtCriteriaDomain invTplMaCriteria = new W9024ItemNoAplyStrtDtCriteriaDomain();

        CommonUtil.copyPropertiesDomainToDomain(invTplMaCriteria, criteriaDomain, criteriaDomain.getScreenDateFormat());
        invTplMaCriteria.setCompCd(criteriaDomain.getViewCompCd());
        invTplMaCriteria.setItemNo(criteriaDomain.getViewItemNo());
        invTplMaCriteria.setPkgCd(criteriaDomain.getViewPkgCd());
        invTplMaCriteria.setTrnsCd(criteriaDomain.getViewTrnsCd());
        
        return invTplMaCriteria;
    }

    /**
     *  Covert service domain(BL) to screen domain (PL).
     * <br />
     * サービスのドメイン(BL)を画面のドメイン(PL)に変換します。
     * 
     * @param criteriaDomain criteria domain (BL)<br />
     * 更新ドメイン(BL)
     * @param resultDomain Service domain(BL)<br />
     * サービスドメイン(BL)
     * @return Screen domain(PL)<br />
     * 画面のドメイン(PL)
     */
    protected W9024CriteriaDomain convertToCriteriaDomain(W9024CriteriaDomain criteriaDomain, W9024ItemNoAplyStrtDtItemDomain resultDomain) {

        criteriaDomain.setRevOld(resultDomain.getRev());
        criteriaDomain.setAplyStrtDt(DateUtil.formatDate(resultDomain.getAplyStrtDt(), criteriaDomain.getScreenDateFormat()));
        criteriaDomain.setRev(StringUtils.EMPTY);
        criteriaDomain.setIgnoreWarnings(CHECK_OFF);
        criteriaDomain.setUpdateCount(resultDomain.getUpdateCount());
        criteriaDomain.setCreateCount(resultDomain.getCreateCount());
        
        return criteriaDomain;
    }
    /**
     * <br />サービスのドメイン(BL)を画面のドメイン(PL)に変換します。
     * 
     * @param srcDomain サービスドメイン(BL)
     * @return 画面のドメイン(PL)
     */
    protected W9024CriteriaDomain convertToCriteriaDomain(
        TmPkgSpecRevHisDomain srcDomain) {

        W9024CriteriaDomain dstDomain = new W9024CriteriaDomain();
            
        CommonUtil.copyPropertiesDomainToDomain(dstDomain, srcDomain);
            
        return dstDomain;
    }
}
