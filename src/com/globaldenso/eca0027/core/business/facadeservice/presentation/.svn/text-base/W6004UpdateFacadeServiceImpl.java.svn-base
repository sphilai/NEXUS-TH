/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;


import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CHECK_ON;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0004;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0093;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0139;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0038;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0042;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W6004;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CUSTOM_TIMING_TYPE_A;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CUSTOM_TIMING_TYPE_B;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CUSTOM_TIMING_TYPE_Z;
import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W6004CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W6004ListDomain;
import com.globaldenso.eca0027.core.business.domain.W6004UpdateDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W6001DocCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W6001DocService;
import com.globaldenso.gscm.framework.business.domain.MessageDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractUpdateFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.Validator;

/**
 * An implementation class of service for the Facade of Action Update Documentation Invoice Data Create screen.
 * <dr />通関書類作成業務 Invoice Data Create画面のUpdateアクションに対するFacadeサービスの実装クラスです。
 * <pre>
 * bean id: w6004UpdateFacadeService
 * </pre>
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 11243 $
 */
public class W6004UpdateFacadeServiceImpl extends AbstractUpdateFacadeService<Integer, W6004UpdateDomain> {
    /**
     * Documentation Service.
     * <br />Documentationサービス
     */
    protected W6001DocService w6001DocService;
    
    
    /**
     * Default constructor.
     * <dr />デフォルトコンストラクタです。
     */
    public W6004UpdateFacadeServiceImpl(){
    }

    /**
     * Setter method for w6001DocService.
     *
     * @param docService Set for w6001DocService
     */
    public void setW6001DocService(W6001DocService docService) {
        w6001DocService = docService;
    }
    
    /**
     * To investigate the contents of the Domain of the argument, to identify the Domain necessary for the process.
     * <dr />引数のDomainの内容を調査し、処理に必要なDomainを特定する。
     * 
     * <pre>
     *  --Check the line item selection.
     *  --Check the multiple selection of STAGING INSTRUCTION.
     * </pre>
     * <pre>
     *  --明細行選択チェックを行う
     *  --荷揃え指示複数選択チェックを行う
     * </pre>
     * 
     * @param updateDomain Update condition domain<br />
     * 更新条件ドメイン
     * @throws GscmApplicationException GSCM application exception<br />
     * GSCMアプリケーション例外
     * @throws ApplicationException ApplicationExceptions
     * @return newUpdateDomain Update condition domain<br />
     * 更新条件ドメイン
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W6004UpdateDomain filterDomain(W6004UpdateDomain updateDomain)
        throws GscmApplicationException, ApplicationException {

        List<MessageDomain> errList = new ArrayList<MessageDomain>();
        List<W6004ListDomain> newListDomainList = new ArrayList<W6004ListDomain>();

        for (int i = 0; i < updateDomain.getListDomainList().size(); i++) {
            W6004ListDomain listDomain = updateDomain.getListDomainList().get(i);
            
            if (CHECK_ON.equals(listDomain.getSelected()) && !listDomain.isDisabledFlg()) {
                listDomain.setIndex(i);
                newListDomainList.add(listDomain);
            }
        }
        
        // Line item selection check.
        // 明細行選択チェック
        if (newListDomainList.size() == 0) {
            MessageDomain md = new MessageDomain("", NXS_E7_0004, null);
            errList.add(md);
        } else {
            // Container layer by key difference check
            // コンテナ層別キー違いチェック
            // DB Unregist, case of multiple selection in the container layer by key difference
            // (まだDBに登録されてなく、コンテナ層別キー違いで複数選択され場合のため)
            String sortKey = newListDomainList.get(0).getContainerSortingKey();
            for (int j = 0; j < newListDomainList.size(); j++) {
                if (!sortKey.equals(newListDomainList.get(j).getContainerSortingKey())) {
                    MessageDomain md = new MessageDomain("", NXS_E7_0093, null);
                    errList.add(md);
                    // It does not output the same error message.
                    // 同じエラーメッセージを複数出力しないため
                    break;
                }
            }
        }

        W6004UpdateDomain newUpdateDomain = new W6004UpdateDomain();
        CommonUtil.copyPropertiesDomainToDomain(newUpdateDomain, updateDomain);
        newUpdateDomain.setListDomainList(newListDomainList);
        
        // Selection check for Staging Instruction
        // 荷揃え指示複数選択チェック
        if (CUSTOM_TIMING_TYPE_Z.equals(updateDomain.getCriteriaDomain().getCustomTimingTyp()) && newListDomainList.size() > 1) {
            String[] params =  new String[1];
            // 2015/4/27 DNJP.Kawamura ST888対応 START >>>>>
//            params[0] = "";
            params[0] = "C/C TYPE 'Z'";
            // 2015/4/27 DNJP.Kawamura ST888対応 END <<<<<
            
            MessageDomain md = new MessageDomain("", GSCM_E0_0042, params);
            errList.add(md);
        }
        
        if (0 < errList.size()) {
            throw new ValidationException(errList);
        }
        return newUpdateDomain;
    }
    
    /**
     * Check the single item.
     * <dr />単項目チェックを行う。
     * 
     * <pre>
     * Check the single item.
     * 単項目チェックを行う
     * </pre>
     * 
     * @param updateDomain Update condition domain<br />
     * 更新条件ドメイン
     * @throws GscmApplicationException GSCM application exception.<br />
     * GSCMアプリケーション例外
     * @throws ValidationException ValidationException
     * @throws ApplicationException ApplicationExceptions
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W6004UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        Validator<W6004CriteriaDomain> valid = new Validator<W6004CriteriaDomain>(updateDomain.getCriteriaDomain(), "criteriaDomain");

        if (CUSTOM_TIMING_TYPE_A.equals(updateDomain.getCriteriaDomain().getCustomTimingTyp())) {
            String[] properties = {
                "containerSortingKey",
                "fmEtd",
                "toEtd",
                "shippingFirmNo",
                "fmWorkedDt",
                "toWorkedDt"
            };
            valid.isValidateProperties(properties, SCREEN_ID_W6004);
        } else if (CUSTOM_TIMING_TYPE_B.equals(updateDomain.getCriteriaDomain().getCustomTimingTyp())) {
            String[] properties = {
                "containerSortingKey",
                "fmEtd",
                "toEtd",
                "stgActNo",
                "fmStgActDt",
                "toStgActDt"
            };
            valid.isValidateProperties(properties, SCREEN_ID_W6004);
        } else if (CUSTOM_TIMING_TYPE_Z.equals(updateDomain.getCriteriaDomain().getCustomTimingTyp()))  {
            String[] properties = {
                "containerSortingKey",
                "fmEtd",
                "toEtd",
                "stgInstrNo",
                "fmWorkedDt",
                "toWorkedDt"
            };
            valid.isValidateProperties(properties, SCREEN_ID_W6004);
        }

        if (0 < valid.getErrList().size()) {
            throw new ValidationException(valid.getErrList());
        }
    }
    
    /**
     * Check the consistency.
     * <dr />整合性チェックを行う。
     *
     * <pre>
     * No action
     * 処理なし
     * </pre>
     * @param updateDomain Update condition domain<br />
     * 更新条件ドメイン
     * @throws GscmApplicationException GSCM application exception.<br />
     * GSCMアプリケーション例外
     * @throws ValidationException ValidationException
     * @throws ApplicationException ApplicationExceptions
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W6004UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
    }
    
    /**
     * Check the database.
     * <dr />データベースチェックを行う。
     * 
     * <dr />
     * <pre>
     * - Create the search condition domain. 
     *      Create the {@link W6004UpdateDomain}.
     * - Check the the multiple selection of STAGING INSTRUCTION, MAX MAIN MARK QUANTITY, difference of CONTAINER SORTING KEY.
     * 
     * </pre>
     * <pre>
     * - 検索条件ドメインを作成する
     *     {@link W6004UpdateDomain}を作成する
     * - 荷揃え指示複数登録チェック、最大メインマーク件数チェック、コンテナ層別キー違いチェックを行う
     * </pre>
     * 
     * @param updateDomain Update condition domain<br />
     * 更新条件ドメイン
     * @throws GscmApplicationException GSCM application exception.<br />
     * GSCMアプリケーション例外
     * @throws ValidationException ValidationException
     * @throws ApplicationException ApplicationException
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W6004UpdateDomain updateDomain)
        throws GscmApplicationException, ValidationException, ApplicationException {
        // エラーリストの作成
        List<MessageDomain> errList = new ArrayList<MessageDomain>();

        // Register check for Staging Instruction
        // 荷揃え指示複数登録チェック
        if (CUSTOM_TIMING_TYPE_Z.equals(updateDomain.getCriteriaDomain().getCustomTimingTyp())) {
            if(!w6001DocService.validateDatabaseTwInvPltzOnCreateUpdateByCk(updateDomain.getLoginUserDscId())) {
                MessageDomain md = new MessageDomain("", NXS_E7_0139, null);
                errList.add(md);
            }
        }
        
        List<W6004ListDomain> newListDomainList = new ArrayList<W6004ListDomain>();
        for (int i = 0; i < updateDomain.getListDomainList().size(); i++) {
            W6004ListDomain listDomain = updateDomain.getListDomainList().get(i);
            
            if (CHECK_ON.equals(listDomain.getSelected()) && !listDomain.isDisabledFlg()) {
                listDomain.setIndex(i);
                newListDomainList.add(listDomain);
            }
        }
        
        // Counter check maximum main mark.
        // 最大メインマーク件数チェック
        //Main Markのカウント
        int countMainMark = 0;
        for (int j = 0; j < newListDomainList.size(); j++) {
            W6004ListDomain domain = newListDomainList.get(j);
            int count = Integer.valueOf(domain.getCountMainMark());
            countMainMark = countMainMark + count;
        }
        
        if(!w6001DocService.validateDatabaseTwInvPltzOnCreateUpdateByMaxMainMark(updateDomain.getLoginUserDscId(), countMainMark)) {
            String[] params =  new String[2];
            params[0] = "CML";
            params[1] = "9999";
            MessageDomain md = new MessageDomain("", GSCM_E0_0038, params);
            errList.add(md);
        }
        
        // Container layer by key difference check
        // コンテナ層別キー違いチェック
        for (int j = 0; j < newListDomainList.size(); j++) {
            W6004ListDomain domain = newListDomainList.get(j);
            if(!w6001DocService.validateDatabaseTwInvPltzOnCreateUpdateByContSortKey(updateDomain.getLoginUserDscId(), domain.getContainerSortingKey())) {
                MessageDomain md = new MessageDomain("", NXS_E7_0093, null);
                errList.add(md);
                // It does not output the same error message.
                // 同じエラーメッセージを複数出力しないため
                break;
            }
        }

        if (0 < errList.size()) {
            throw new ValidationException(errList);
        }
    }

    /**
     * Call to the business processing Service.
     * <dr />業務処理Serviceの呼び出しを行う。
     * 
     * <dr />
     * <pre>
     * - Create the search condition domain. 
     *      Create the {@link W6001DocCriteriaDomain}.
     * - Register the Invoide Palletize Work.
     * </pre>
     * <pre>
     * - 検索条件ドメインを作成する
     *     {@link W6001DocCriteriaDomain}を作成する
     * - インボイス作成対象パレタイズワークを登録
     * </pre>
     * 
     * @param updateDomain Update condition domain<br />
     * 更新条件ドメイン
     * @throws GscmApplicationException GSCM application exception<br />
     * GSCMアプリケーション例外
     * @throws ApplicationException If an exception occurs during a call to the business processing Service<br />
     * 業務処理Serviceの呼び出し時に例外が発生した場合
     * @return update Count
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected Integer callServices(W6004UpdateDomain updateDomain) 
        throws GscmApplicationException, ApplicationException {
  
        W6001DocCriteriaDomain docCriteriaDomain = createInvoiceCriteria(updateDomain);
        
        // Register Invoice Palletize Work.
        // インボイス作成対象パレタイズワークを登録
        int updateCount = 0;
        List<? extends W6004ListDomain> listDomain = updateDomain.getListDomainList();
        for (int i = 0; i < listDomain.size(); i++) {
            W6004ListDomain domain = listDomain.get(i);
            docCriteriaDomain.setContainerSortingKey(domain.getContainerSortingKey());
            docCriteriaDomain.setShippingFirmNo(domain.getShippingFirmNo());
            updateCount += w6001DocService.createOnCreateUpdate(docCriteriaDomain);
        }
        return updateCount;
    }
    /**
     * Create the update condition domain of invoice service.
     * <br />インボイスサービスの更新条件ドメインを作成します。
     *
     * @param updateDomain Update condition domain<br />
     * 更新条件ドメイン
     * @return Update condition domain of invoice service<br />
     * インボイスサービスの更新条件ドメイン
    */
    protected W6001DocCriteriaDomain createInvoiceCriteria(W6004UpdateDomain updateDomain){
        W6001DocCriteriaDomain docCriteriaDomain = new W6001DocCriteriaDomain();

        W6004CriteriaDomain criteriaDomain = updateDomain.getCriteriaDomain();

        CommonUtil.copyPropertiesDomainToDomain(docCriteriaDomain, criteriaDomain);
        docCriteriaDomain.setDscId(criteriaDomain.getLoginUserDscId());
        return docCriteriaDomain;
    }
}
