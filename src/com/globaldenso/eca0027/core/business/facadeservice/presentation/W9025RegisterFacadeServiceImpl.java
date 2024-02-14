/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_N;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FORMAT_WEIGHT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0034;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0003;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0004;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0009;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_EDIT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_NEW;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_W1_0007;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W9025;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmActualItemWeightCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TmActualItemWeightService;
import com.globaldenso.eca0027.core.business.domain.W9025ActualItemWeightDomain;
import com.globaldenso.eca0027.core.business.domain.W9025CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W9025ActualItemWeightCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W9025ActualItemWeightService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractTransactFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.NumberUtil;
import com.globaldenso.gscm.framework.util.Validator;
/**
 * A Facade Service implementation class for "Register" action on "Registration of Actual Item Weight".
 * <br />実測製品重量画面のRegisterアクションに対するFacadeサービスの実装クラスです。
 *
 * @author $Author: masaki_awata@dnitsol.com $
 * @version $Revision: 11713 $
 */
public class W9025RegisterFacadeServiceImpl extends AbstractTransactFacadeService<W9025CriteriaDomain, W9025CriteriaDomain>{

    /**
     * common services<br />
     * 共通サービス
     */
    protected CommonService commonService;
    /**
     * The service of Item No. Apply Start Date Refer & Register.<br />
     * Item No. Apply Start Date Refer & Registerのサービス
     */
    protected W9025ActualItemWeightService w9025ActualItemWeightService;

    /**
     * Service of 'TmActualItemWeightMaster' <br />
     */
    private TmActualItemWeightService tmActualItemWeightService;

    /**
     * 処理モード判定用
     */
    private int cnt;
    
    /**
     * Default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W9025RegisterFacadeServiceImpl() {
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
     * Setter method for w9025ActualItemWeightService.
     *
     * @param w9025ActualItemWeightService Set for W9025ActualItemWeightService
     */
    public void setW9025ActualItemWeightService(W9025ActualItemWeightService w9025ActualItemWeightService) {
        this.w9025ActualItemWeightService = w9025ActualItemWeightService;
    }
    
    /**
     * Setter method for tmActualItemWeightService
     *
     * @param tmActualItemWeightService Set for tmActualItemWeightService
     */
    
    public void setTmActualItemWeightService(
        TmActualItemWeightService tmActualItemWeightService) {
        this.tmActualItemWeightService = tmActualItemWeightService;
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
    protected W9025CriteriaDomain filterDomain(W9025CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {
        return criteriaDomain;
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * - Common error check.
     * - 共通エラーチェックをする。
     * 
     * - Check out the single item.
     * - Check the error.
     * 
     * - 単項目チェックをする。
     * - エラーを確認する。
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService
     *      #validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W9025CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {

        if (!FLAG_Y.equals(criteriaDomain.getContinueFlag())) {
            return;
        }
        Validator<W9025CriteriaDomain> valid = new Validator<W9025CriteriaDomain>(criteriaDomain, "w9025CriteriaDomain");

        // Check out the single item.
        String[] properties = {
            "weightUnit",
            "netWeightA"
        };
        
        valid.isValidateProperties(properties, SCREEN_ID_W9025);
        
        if (0 < valid.getErrList().size()) {
            throw new ValidationException(valid.getErrList());
        }
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * connection check.
     * 関連チェック
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService
     *      #validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W9025CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // Actual Item Weight zero check.
        // 実測製品重量0チェック。
        if (!FLAG_Y.equals(criteriaDomain.getContinueFlag())) {
            return;
        }
        BigDecimal netWeightA = new BigDecimal(criteriaDomain.getNetWeightA());
        if (netWeightA.compareTo(new BigDecimal(0)) <= 0){
            Object[] params = {
                commonService.getResource(criteriaDomain.getLocale(), "label.netWeightA")
            };            
            List<MessageDomain> errMessages = new ArrayList<MessageDomain>();
            errMessages.add(new MessageDomain("w9025CriteriaDomain.netWeightA", GSCM_E0_0034, params));
            throw new ValidationException(errMessages);
        }
    }

    /**
     * {@inheritDoc}
     * <pre>
     * database check
     * </pre>
     * <pre>
     * データベースチェック
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W9025CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {

        List<MessageDomain> errorList = new ArrayList<MessageDomain>();
        // Authority check 
        // 権限チェック
        if (!w9025ActualItemWeightService.validateDatabaseUserAuthOwnerComp(criteriaDomain.getViewOwnerComp())) {
            MessageDomain msg = new MessageDomain("w9025CriteriaDomain.viewOwnerComp", GSCM_I0_0009, null);
            errorList.add(msg);
        }
        
        if (errorList.size() > 0) {
            throw new ValidationException(errorList);
        }

        // 実測製品重量原単位の登録・更新処理の判断
        if (!FLAG_Y.equals(criteriaDomain.getContinueFlag())) {
            // Lock the Package Specification Revision Master selected.
            String msgCd;
            if (w9025ActualItemWeightService.validateDatabaseTmActualItemWeight(criteriaDomain.getViewOwnerComp()
                , criteriaDomain.getViewItemNo())) {
                msgCd = GSCM_I0_0004;
            } else {
                msgCd = GSCM_I0_0003;
            }
            criteriaDomain.setConfirmMsgCd(msgCd);
            criteriaDomain.setConfirmMsg(commonService.getResource(criteriaDomain.getLocale(), msgCd));
            return;
        }

        //Warning confirmation check.
        //Warning確認チェック。
        String ignoreWarning;
        
        // Create criteria domain.
        TmActualItemWeightCriteriaDomain w9025ActItemWeightCriteria = new TmActualItemWeightCriteriaDomain();
        w9025ActItemWeightCriteria.setOwnerComp(criteriaDomain.getViewOwnerComp());
        w9025ActItemWeightCriteria.setItemNo(criteriaDomain.getViewItemNo());
        w9025ActItemWeightCriteria.setSearchCountCheckFlg(false);
        
        cnt = tmActualItemWeightService.searchCount(w9025ActItemWeightCriteria);
        
        if (criteriaDomain.isIgnoreWarnings()) {
            ignoreWarning = FLAG_Y;
        } else {
            ignoreWarning = FLAG_N;
        }
        if (cnt != 0) {
            if(FLAG_N.equals(ignoreWarning)){
                List<MessageDomain> errMessages = new ArrayList<MessageDomain>();
                errMessages.add(new MessageDomain(null, NXS_W1_0007, null));
                throw new ValidationException(errMessages);
            }
        }
    }

    
    /**
     * {@inheritDoc}
     * <pre>
     * - Check of Item No exist.
     * - Case new    : Create of Actual Item Weight MA
     * - Case update : Update of Actual Item Weight MA
     * - 品番存在チェック
     * - 新規の場合：実測製品重量原単位の登録
     * - 更新の場合：実測製品重量原単位の更新
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W9025CriteriaDomain callServices(W9025CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {
        
        if (!FLAG_Y.equals(criteriaDomain.getContinueFlag())) {
            return criteriaDomain;
        }
        
        W9025ActualItemWeightCriteriaDomain w9025ActualItemWeightCriteria = createActualItemWeightCriteria(criteriaDomain);
        
        W9025ActualItemWeightDomain w9025ActualItemWeightDomain = w9025ActualItemWeightService.transactOnRegister(w9025ActualItemWeightCriteria);
        
        criteriaDomain.setFunctionId(w9025ActualItemWeightCriteria.getFunctionId());
        
        return convertToCriteriaDomain(criteriaDomain, w9025ActualItemWeightDomain);
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
    protected W9025ActualItemWeightCriteriaDomain createActualItemWeightCriteria(W9025CriteriaDomain criteriaDomain) {

        W9025ActualItemWeightCriteriaDomain w9025ActItemWeightCriteria = new W9025ActualItemWeightCriteriaDomain();

        CommonUtil.copyPropertiesDomainToDomain(w9025ActItemWeightCriteria, criteriaDomain);
        
        if(cnt == 0){
            w9025ActItemWeightCriteria.setFunctionId(MODE_NEW);
        }else{
            w9025ActItemWeightCriteria.setFunctionId(MODE_EDIT);
        }
        
        return w9025ActItemWeightCriteria;
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
    protected W9025CriteriaDomain convertToCriteriaDomain(W9025CriteriaDomain criteriaDomain, W9025ActualItemWeightDomain resultDomain) {

        // Format the numerical value of the weight for display.
        // 数値項目フォーマット(重量)
        criteriaDomain.setOldWeightUnit(resultDomain.getOldWeightUnit());
        criteriaDomain.setOldNetWeightA(NumberUtil.format(resultDomain.getOldNetWeightA(), FORMAT_WEIGHT));
        criteriaDomain.setIgnoreWarnings(false);
        criteriaDomain.setUpdateCount(resultDomain.getUpdateCount());
        criteriaDomain.setCreateCount(resultDomain.getCreateCount());
        criteriaDomain.setNetWeightA(null);

        return criteriaDomain;
    }

}
