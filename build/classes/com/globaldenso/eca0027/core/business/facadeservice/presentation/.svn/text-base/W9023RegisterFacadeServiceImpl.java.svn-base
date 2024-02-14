/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0010;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0029;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0039;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0009;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.LINE_SEPARATOR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MAX_PAR_LINE_35;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MAX_PAR_LINE_50;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MAX_ROW_10;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MAX_ROW_3;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_EDIT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_NEW;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0071;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W9023;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.apache.commons.lang.StringUtils;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.TmInvTplDomain;
import com.globaldenso.eca0027.core.business.domain.W9023CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W9022InvTplMaCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W9022InvTplMaService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractCreateFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.Validator;

/**
 *  The implementation class of the Facade service for register action of Invoice Template MA edit screen.
 * <br />
 * Invoice Template MA Edit画面のRegisterアクションに対するFacadeサービスの実装クラスです。
 * 
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W9023RegisterFacadeServiceImpl extends AbstractCreateFacadeService<W9023CriteriaDomain, W9023CriteriaDomain> {
    
    /**
     * common services<br />
     * 共通サービス
     */
    protected CommonService commonService;
    
    /**
     * Service of invoice Template MA<br />
     * Invoice Template MAのサービス
     */
    protected W9022InvTplMaService w9022InvTplMaService;

    /**
     * Default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W9023RegisterFacadeServiceImpl() {
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
     * Setter method for w9022InvTplMaService.
     *
     * @param invTplMaService Set for w9022InvTplMaService
     */
    public void setW9022InvTplMaService(W9022InvTplMaService invTplMaService) {
        w9022InvTplMaService = invTplMaService;
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
    protected W9023CriteriaDomain filterDomain(W9023CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {
        // Convert Line separator(to '\n')
        criteriaDomain.setMaster2(convertLineSeparator(criteriaDomain.getMaster2()));
        criteriaDomain.setMaster3(convertLineSeparator(criteriaDomain.getMaster3()));
        criteriaDomain.setMaster4(convertLineSeparator(criteriaDomain.getMaster4()));
        criteriaDomain.setMaster10(convertLineSeparator(criteriaDomain.getMaster10()));
        criteriaDomain.setMaster11(convertLineSeparator(criteriaDomain.getMaster11()));
        
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
    protected void validateItems(W9023CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        Validator<W9023CriteriaDomain> valid = new Validator<W9023CriteriaDomain>(
            criteriaDomain, "w9023CriteriaDomain");
        
        if (MODE_NEW.equals(criteriaDomain.getProcMode())) {
            String[] properties = {
                "company", 
                "docNo",
                "invoiceCtgry",
                "invoiceClass",
                "master1",
                "master2",
                "master3",
                "master4",
                "master6",
                "master7",
                "master8",
                "master10",
                "master11"

            };
            valid.isValidateProperties(properties, SCREEN_ID_W9023);
        }
        
        if (MODE_EDIT.equals(criteriaDomain.getProcMode())) {
            String[] properties = {
                "master2",
                "master3",
                "master4",
                "master7",
                "master8",
                "master10",
                "master11"
            };
            valid.isValidateProperties(properties, SCREEN_ID_W9023);
        }
        
        if (0 < valid.getErrList().size()) {
            for (MessageDomain errDomain : valid.getErrList()) {
                if ("w9023CriteriaDomain.master1".equals(errDomain.getProperty())) {
                    errDomain.setProperty("master1");
                }
                if ("w9023CriteriaDomain.master6".equals(errDomain.getProperty())) {
                    errDomain.setProperty("master6");
                }
            }
            throw new ValidationException(valid.getErrList());
        }
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * - Multiple lines of text check
     * - Check correlation
     * - File check
     * </pre>
     * <pre>
     * - 複数行テキストチェック
     * - 相関チェック
     * - ファイルチェック
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W9023CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        List<MessageDomain> errorList = new ArrayList<MessageDomain>();

        Locale locale = criteriaDomain.getLocale();
        
        // Check of two or more line text 
        // 複数行テキストチェック
        if (!w9022InvTplMaService.validateConsistencyTxtLines(criteriaDomain.getMaster2(), MAX_PAR_LINE_35, MAX_ROW_3)) {
            String[] params = {
                commonService.getResource(locale, "label.master2")
                , Integer.toString(MAX_PAR_LINE_35)
                , Integer.toString(MAX_ROW_3)
            };
            MessageDomain md = new MessageDomain("w9023CriteriaDomain.master2", GSCM_E0_0039, params);
            errorList.add(md);
        }
        if (!w9022InvTplMaService.validateConsistencyTxtLines(criteriaDomain.getMaster3(), MAX_PAR_LINE_35, MAX_ROW_10)) {
            String[] params = {
                commonService.getResource(locale, "label.master3")
                , Integer.toString(MAX_PAR_LINE_35)
                , Integer.toString(MAX_ROW_10)
            };
            MessageDomain md = new MessageDomain("w9023CriteriaDomain.master3", GSCM_E0_0039, params);
            errorList.add(md);
        }
        if (!w9022InvTplMaService.validateConsistencyTxtLines(criteriaDomain.getMaster4(), MAX_PAR_LINE_50, MAX_ROW_10)) {
            String[] params = {
                commonService.getResource(locale, "label.master4")
                , Integer.toString(MAX_PAR_LINE_50)
                , Integer.toString(MAX_ROW_10)
            };
            MessageDomain md = new MessageDomain("w9023CriteriaDomain.master4", GSCM_E0_0039, params);
            errorList.add(md);
        }
        if (!w9022InvTplMaService.validateConsistencyTxtLines(criteriaDomain.getMaster10(), MAX_PAR_LINE_35, MAX_ROW_10)) {
            String[] params = {
                commonService.getResource(locale, "label.master10")
                , Integer.toString(MAX_PAR_LINE_35)
                , Integer.toString(MAX_ROW_10)
            };
            MessageDomain md = new MessageDomain("w9023CriteriaDomain.master10", GSCM_E0_0039, params);
            errorList.add(md);
        }
        if (!w9022InvTplMaService.validateConsistencyTxtLines(criteriaDomain.getMaster11(), MAX_PAR_LINE_50, MAX_ROW_10)) {
            String[] params = {
                commonService.getResource(locale, "label.master11")
                , Integer.toString(MAX_PAR_LINE_50)
                , Integer.toString(MAX_ROW_10)
            };
            MessageDomain md = new MessageDomain("w9023CriteriaDomain.master11", GSCM_E0_0039, params);
            errorList.add(md);
        }

        // The combination check of Invoice Category/Class of Invoice
        // Invoice Category・Class of Invoiceの組合せチェック
        if(!w9022InvTplMaService.validateConsistencyInvoiceCategoryClassOfInvoice(
            criteriaDomain.getInvoiceCtgry(), criteriaDomain.getInvoiceClass())){
            Object[] params = {
                commonService.getResource(criteriaDomain.getLocale(), "label.invoiceCtgry"),
                commonService.getResource(criteriaDomain.getLocale(), "label.invoiceClass")
            };
            MessageDomain msgInvoiceCategory = new MessageDomain("w9023CriteriaDomain.invoiceCtgry", GSCM_E0_0029, params);
            MessageDomain msgClassOfInvoice = new MessageDomain("w9023CriteriaDomain.invoiceClass", null, null);
            
            errorList.add(msgInvoiceCategory);
            errorList.add(msgClassOfInvoice);
        }
        
        // File Check
        errorList.addAll(chkFile(criteriaDomain));
        
        if (0 < errorList.size()) {
            throw new ValidationException(errorList);
        }
    }

    /**
     * {@inheritDoc}
     * <pre>
     * - Company existence check
     * - Lock selection data
     * </pre>
     * <pre>
     * - Company存在チェック
     * - 選択データをロック
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W9023CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        
        List<MessageDomain> errorList = new ArrayList<MessageDomain>();
        
        // Check of Company existence 
        // Company存在チェック
        if(!w9022InvTplMaService.validateDatabaseCompCd(criteriaDomain.getCompany())){
            MessageDomain msgCompany = new MessageDomain("w9023CriteriaDomain.company", NXS_E7_0071, null);
            errorList.add(msgCompany);
        }
        
        // Authority check 
        //権限チェック
        if (!w9022InvTplMaService.validateConsistencyCompanyAuth(criteriaDomain.getCompany())) {
            MessageDomain msgShipperCd = new MessageDomain("w9023CriteriaDomain.company", GSCM_I0_0009, null);
            errorList.add(msgShipperCd);
        }
       
        
        // Lock for Invoice Template Master.(Only edit mode)
        TmInvTplDomain tmInvTplDomain = new TmInvTplDomain();
        if (MODE_EDIT.equals(criteriaDomain.getProcMode())) {
            if (!w9022InvTplMaService.validateDatabaseTmInvTplOnEditRegister(criteriaDomain.getCompany()
                , criteriaDomain.getDocNo(), tmInvTplDomain)) {
                errorList.add(new MessageDomain("", GSCM_E0_0010, null));
            }
        }
        criteriaDomain.setTmInvTplDomain(tmInvTplDomain);
        
        if (errorList.size() > 0) {
            throw new ValidationException(errorList);
        }
    }

    /**
     * {@inheritDoc}
     * <pre>
     * - Register/update the shipping documents template basic unit.
     * - Register/Update/Delete the file management
     * </pre>
     * <pre>
     * - 船積書類テンプレート原単位を登録/更新
     * - ファイル管理を登録/更新/削除
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W9023CriteriaDomain callServices(W9023CriteriaDomain criteriaDomain) throws ApplicationException {
        
        // Create criteria domain for BL
        W9022InvTplMaCriteriaDomain invTplMaCriteria = createInvTplMaCriteria(criteriaDomain);
        
        // Create Invoice Template Master.
        return w9022InvTplMaService.createOnEditRegister(invTplMaCriteria, criteriaDomain.getTmInvTplDomain());
        
    }
    
    /**
     * Based on (PL) Search criteria domain, create Search criteria domain (BL).
     * <br />
     * 検索条件ドメイン(PL)を基に、検索条件ドメイン(BL)を作成します。
     * 
     * @param criteriaDomain Criteria domain of screen(PL)<br />
     * 画面の検索条件ドメイン(PL)
     * @return Criteria domain of service<br />
     * サービスの検索条件ドメイン(BL)
     */
    protected W9022InvTplMaCriteriaDomain createInvTplMaCriteria(W9023CriteriaDomain criteriaDomain) {

        W9022InvTplMaCriteriaDomain invTplMaCriteria = new W9022InvTplMaCriteriaDomain();

        // setup for acquiring the maximum number 
        // 最大件数を取得するための設定
        invTplMaCriteria.setScreenId(criteriaDomain.getScreenId());
        invTplMaCriteria.setLocale(criteriaDomain.getLocale());

        CommonUtil.copyPropertiesDomainToDomain(invTplMaCriteria, criteriaDomain);
        invTplMaCriteria.setCompCd(criteriaDomain.getCompany());
        invTplMaCriteria.setDscId(criteriaDomain.getLoginUserDscId());
        
        invTplMaCriteria.setM1FileData(criteriaDomain.getMaster1FileStream());
        invTplMaCriteria.setM1FileName(criteriaDomain.getMaster1());
        
        invTplMaCriteria.setM6FileData(criteriaDomain.getMaster6FileStream());
        invTplMaCriteria.setM6FileName(criteriaDomain.getMaster6());
        
        if (StringUtils.isNotEmpty(criteriaDomain.getMaster5())) {
            invTplMaCriteria.setM5FileData(criteriaDomain.getMaster5FileStream());
            invTplMaCriteria.setM5FileName(criteriaDomain.getMaster5());
        }
        
        if (StringUtils.isNotEmpty(criteriaDomain.getMaster9())) {
            invTplMaCriteria.setM9FileData(criteriaDomain.getMaster9FileStream());
            invTplMaCriteria.setM9FileName(criteriaDomain.getMaster9());
        }
        
        if (StringUtils.isNotEmpty(criteriaDomain.getMaster12())) {
            invTplMaCriteria.setM12FileData(criteriaDomain.getMaster12FileStream());
            invTplMaCriteria.setM12FileName(criteriaDomain.getMaster12());
        }
        
        if (StringUtils.isNotEmpty(criteriaDomain.getMaster13())) {
            invTplMaCriteria.setM13FileData(criteriaDomain.getMaster13FileStream());
            invTplMaCriteria.setM13FileName(criteriaDomain.getMaster13());
        }

        return invTplMaCriteria;
    }
    
    /**
     * Check File
     * 
     * @param criteriaDomain Domain
     * @return error list
     * @throws ApplicationException ApplicationException
     */
    protected List<MessageDomain> chkFile(W9023CriteriaDomain criteriaDomain) throws ApplicationException {
        
        List<MessageDomain> errList = new ArrayList<MessageDomain>();
        
        if (StringUtils.isNotEmpty(criteriaDomain.getMaster1())) {
            String msgId = w9022InvTplMaService.validateConsistencyFile(criteriaDomain.getMaster1(), criteriaDomain.getMaster1FileSize());
            if (StringUtils.isNotEmpty(msgId)) {
                MessageDomain msgDomain = new MessageDomain("master1", msgId, null);
                errList.add(msgDomain);
            }
        }
        if (StringUtils.isNotEmpty(criteriaDomain.getMaster5())) {
            String msgId = w9022InvTplMaService.validateConsistencyFile(criteriaDomain.getMaster5(), criteriaDomain.getMaster5FileSize());
            if (StringUtils.isNotEmpty(msgId)) {
                MessageDomain msgDomain = new MessageDomain("master5", msgId, null);
                errList.add(msgDomain);
            }
        }
        if (StringUtils.isNotEmpty(criteriaDomain.getMaster6())) {
            String msgId = w9022InvTplMaService.validateConsistencyFile(criteriaDomain.getMaster6(), criteriaDomain.getMaster6FileSize());   
            if (StringUtils.isNotEmpty(msgId)) {
                MessageDomain msgDomain = new MessageDomain("master6", msgId, null);
                errList.add(msgDomain);
            }
        }
        if (StringUtils.isNotEmpty(criteriaDomain.getMaster9())) {
            String msgId = w9022InvTplMaService.validateConsistencyFile(criteriaDomain.getMaster9(), criteriaDomain.getMaster9FileSize());
            if (StringUtils.isNotEmpty(msgId)) {
                MessageDomain msgDomain = new MessageDomain("master9", msgId, null);
                errList.add(msgDomain);
            }
        }
        if (StringUtils.isNotEmpty(criteriaDomain.getMaster12())) {
            String msgId = w9022InvTplMaService.validateConsistencyFile(criteriaDomain.getMaster12(), criteriaDomain.getMaster12FileSize());
            if (StringUtils.isNotEmpty(msgId)) {
                MessageDomain msgDomain = new MessageDomain("master12", msgId, null);
                errList.add(msgDomain);
            }
        }
        if (StringUtils.isNotEmpty(criteriaDomain.getMaster13())) {
            String msgId = w9022InvTplMaService.validateConsistencyFile(criteriaDomain.getMaster13(), criteriaDomain.getMaster13FileSize());
            if (StringUtils.isNotEmpty(msgId)) {
                MessageDomain msgDomain = new MessageDomain("master13", msgId, null);
                errList.add(msgDomain);
            }
        }
        return errList;
    }
    
    /**
     * Line separator convert to '\n'.
     * <br />改行コードを「\n」に統一します。
     *
     * @param str original string.<br />変換元文字列
     * @return convert string.<br />変換後文字列
     */
    protected String convertLineSeparator(String str) {
        if (str == null) {
            return null;
        }
        return str.replaceAll("\\r\\n|\\r|\\n", LINE_SEPARATOR);
    }
}
